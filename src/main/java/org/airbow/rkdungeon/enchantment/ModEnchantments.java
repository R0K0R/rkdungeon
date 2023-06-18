package org.airbow.rkdungeon.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static org.airbow.rkdungeon.Rkdungeon.MOD_ID;

public class ModEnchantments {
    public static Enchantment INSULATOR = register("insulator", new InsulatorEnchantment(Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST}));

    public static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registries.ENCHANTMENT, new Identifier(MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {

    }
}
