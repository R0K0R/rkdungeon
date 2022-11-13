package net.S_Rko.rkdungeon.item.custom;

import net.S_Rko.rkdungeon.effect.ModEffects;
import net.S_Rko.rkdungeon.enchantment.ModEnchantments;
import net.S_Rko.rkdungeon.item.ModItems;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SparkSwordItems extends SwordItem {

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, (e) -> {
            e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        });
        target.addStatusEffect(new StatusEffectInstance(ModEffects.ELECTRIC_SHOCK, 7), attacker);
        return true;
    }

    int DurabilityCount;

    public SparkSwordItems(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return false;
    }

    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
            user.playSound(SoundEvents.ITEM_SPYGLASS_USE, 100000, 1.9f);
            entity.playSound(SoundEvents.ITEM_SPYGLASS_USE, 100000, 1.9f);
            if (!entity.getEquippedStack(EquipmentSlot.CHEST).getEnchantments().contains(ModEnchantments.INSULATOR)){
                entity.addStatusEffect(new StatusEffectInstance(ModEffects.ELECTRIC_SHOCK, 7), user);
            }
            if (DurabilityCount >= 10){
                stack.damage(1, user, (p) -> {
                    p.sendToolBreakStatus(hand);
                });
                DurabilityCount = 0;
            }
            DurabilityCount ++;
            return ActionResult.PASS;
    }

    public int getMaxUseTime(ItemStack stack) {
        return 1;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        return TypedActionResult.consume(itemStack);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Hit: gives 7 ticks of electric shock").formatted(Formatting.AQUA));
            tooltip.add(Text.literal("Use on Entity: TASER GUN").formatted(Formatting.AQUA));
            tooltip.add(Text.literal("WARNING: You can't use shield with this item").formatted(Formatting.AQUA));
        } else {
            tooltip.add(Text.literal("Press Shift for More Information").formatted(Formatting.YELLOW));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
