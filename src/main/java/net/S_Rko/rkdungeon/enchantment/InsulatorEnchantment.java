package net.S_Rko.rkdungeon.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class InsulatorEnchantment extends Enchantment {
    protected InsulatorEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    public int getMaxLevel() {
        return 1;
    }
}
