package org.airbow.rkdungeon.item.custom;

import org.airbow.rkdungeon.item.ModItems;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.item.TooltipData;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class FireSwordItems extends SwordItem {

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, (e) -> {
            e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        });
        target.setFireTicks(200);
        return true;
    }

    int DurabilityCount;

    public FireSwordItems(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public static boolean onHand(ItemStack stack) {
        return MinecraftClient.getInstance().player.getMainHandStack() == stack || MinecraftClient.getInstance().player.getOffHandStack() == stack;
    }

    public static boolean isUsable(ItemStack stack) {
        return stack.getDamage() < stack.getMaxDamage() - 1;
    }

    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return false;
    }

    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (true){
            user.playSound(SoundEvents.ITEM_FIRECHARGE_USE, 1, 1);
            entity.setFireTicks(1000000000);
            if (DurabilityCount >= 10){
                stack.damage(1, user, (p) -> {
                    p.sendToolBreakStatus(hand);
                });
                DurabilityCount = 0;
            }
            DurabilityCount ++;
            return ActionResult.PASS;
        }
        else {
            return ActionResult.FAIL;
        }
    }

    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity playerEntity = context.getPlayer();
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        if (true){
            if (!CampfireBlock.canBeLit(blockState) && !CandleBlock.canBeLit(blockState) && !CandleCakeBlock.canBeLit(blockState)) {
                BlockPos blockPos2 = blockPos.offset(context.getSide());
                if (AbstractFireBlock.canPlaceAt(world, blockPos2, context.getHorizontalPlayerFacing())) {
                    world.playSound(playerEntity, blockPos2, SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.BLOCKS, 1.0F, world.getRandom().nextFloat() * 0.4F + 0.8F);
                    BlockState blockState2 = AbstractFireBlock.getState(world, blockPos2);
                    world.setBlockState(blockPos2, blockState2, 11);
                    world.emitGameEvent(playerEntity, GameEvent.BLOCK_PLACE, blockPos);
                    ItemStack itemStack = context.getStack();
                    if (playerEntity instanceof ServerPlayerEntity) {
                        Criteria.PLACED_BLOCK.trigger((ServerPlayerEntity)playerEntity, blockPos2, itemStack);
                        if (DurabilityCount >= 10){
                            itemStack.damage(1, playerEntity, (p) -> {
                                p.sendToolBreakStatus(context.getHand());
                            });
                            DurabilityCount = 0;
                        }
                        DurabilityCount ++;
                    }

                    return ActionResult.success(world.isClient());
                } else {
                    return ActionResult.FAIL;
                }
            } else {
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_FIRECHARGE_USE, SoundCategory.BLOCKS, 1.0F, world.getRandom().nextFloat() * 0.4F + 0.8F);
                world.setBlockState(blockPos, blockState.with(Properties.LIT, true), 11);
                world.emitGameEvent(playerEntity, GameEvent.BLOCK_CHANGE, blockPos);
                if (playerEntity != null) {
                    if (DurabilityCount >= 10){
                        context.getStack().damage(1, playerEntity, (p) -> {
                            p.sendToolBreakStatus(context.getHand());
                        });
                        DurabilityCount = 0;
                    }
                    DurabilityCount ++;
                }
                return ActionResult.success(world.isClient());
            }
        }
        else{
            return ActionResult.FAIL;
        }
    }

    public int getMaxUseTime(ItemStack stack) {
        return 1;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        return TypedActionResult.consume(itemStack);
    }

    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isOf(ModItems.FIRE_ENERGY);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Use on Block: works like flint and steel").formatted(Formatting.AQUA));
            tooltip.add(Text.literal("Use on Entity: give entity permanent fire(only extinguishable by water)").formatted(Formatting.AQUA));
            tooltip.add(Text.literal("WARNING: You can't use shield with this item").formatted(Formatting.AQUA));
        } else {
            tooltip.add(Text.literal("Press Shift for More Information").formatted(Formatting.YELLOW));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
