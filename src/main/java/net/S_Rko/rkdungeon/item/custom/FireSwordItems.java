package net.S_Rko.rkdungeon.item.custom;

import net.S_Rko.rkdungeon.item.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class FireSwordItems extends SwordItem {
    public FireSwordItems(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public static boolean onMainHand(ItemStack stack) {
        return MinecraftClient.getInstance().player.getMainHandStack() == stack;
    }

    public static boolean isUsable(ItemStack stack) {
        return stack.getDamage() < stack.getMaxDamage() - 1;
    }

    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isOf(ModItems.FIRE_ENERGY);
    }
}
