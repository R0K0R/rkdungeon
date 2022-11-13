package net.S_Rko.rkdungeon.enchantment;

import net.S_Rko.rkdungeon.rkdungeon;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    public static Enchantment INSULATOR = register("insulator", new InsulatorEnchantment(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST}));

    public static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registry.ENCHANTMENT, new Identifier(rkdungeon.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {

    }
}
