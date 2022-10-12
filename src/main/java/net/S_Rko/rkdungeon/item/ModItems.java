package net.S_Rko.rkdungeon.item;

import net.S_Rko.rkdungeon.item.custom.ModAxeItems;
import net.S_Rko.rkdungeon.item.custom.ModHoeItems;
import net.S_Rko.rkdungeon.item.custom.ModPickaxeItems;
import net.S_Rko.rkdungeon.rkdungeon;
import net.S_Rko.rkdungeon.tool_material.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BLACKJEWEL = registerItem("blackjewel", new Item(new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_DAGGER = registerItem("blackjewel_dagger", new SwordItem(BlackjewelToolMaterial.INSTANCE,
            5, 0, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_SHOVEL = registerItem("blackjewel_shovel", new ShovelItem(BlackjewelToolMaterial.INSTANCE,
            3, -1.5F, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_AXE = registerItem("blackjewel_axe", new ModAxeItems(BlackjewelToolMaterial.INSTANCE,
            8, -2.5F, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_PICKAXE = registerItem("blackjewel_pickaxe", new ModPickaxeItems(BlackjewelToolMaterial.INSTANCE,
            4, -2, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_HOE = registerItem("blackjewel_hoe", new ModHoeItems(BlackjewelToolMaterial.INSTANCE,
            2, -1, new Item.Settings().group(ModItemGroup.RKDUNGEON)));

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_DAGGER = registerItem("sapphire_dagger", new SwordItem(SapphireToolMaterial.INSTANCE,
            4, 0, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(SapphireToolMaterial.INSTANCE,
            5, -2.4F, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(SapphireToolMaterial.INSTANCE,
            3, -1.5F, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe", new ModAxeItems(SapphireToolMaterial.INSTANCE,
            8, -3, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new ModPickaxeItems(SapphireToolMaterial.INSTANCE,
            4, -2, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new ModHoeItems(SapphireToolMaterial.INSTANCE,
            2, -1, new Item.Settings().group(ModItemGroup.RKDUNGEON)));

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item RUBY_DAGGER = registerItem("ruby_dagger", new SwordItem(RubyToolMaterial.INSTANCE,
            5, 0, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(RubyToolMaterial.INSTANCE,
            6, -2.4F, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(RubyToolMaterial.INSTANCE,
            3, -1.5F, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new ModAxeItems(RubyToolMaterial.INSTANCE,
            8, -3, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new ModPickaxeItems(RubyToolMaterial.INSTANCE,
            4, -2, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new ModHoeItems(RubyToolMaterial.INSTANCE,
            2, -1, new Item.Settings().group(ModItemGroup.RKDUNGEON)));

    public static final Item BLACKJEWEL_HELMET = registerItem("blackjewel_helmet", new ArmorItem(ModArmorMaterial.BLACKJEWEL,
            EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_CHESTPLATE = registerItem("blackjewel_chestplate", new ArmorItem(ModArmorMaterial.BLACKJEWEL,
            EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_LEGGINGS = registerItem("blackjewel_leggings", new ArmorItem(ModArmorMaterial.BLACKJEWEL,
            EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_BOOTS = registerItem("blackjewel_boots", new ArmorItem(ModArmorMaterial.BLACKJEWEL,
            EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet", new ArmorItem(ModArmorMaterial.SAPPHIRE,
            EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate", new ArmorItem(ModArmorMaterial.SAPPHIRE,
            EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings", new ArmorItem(ModArmorMaterial.SAPPHIRE,
            EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots", new ArmorItem(ModArmorMaterial.SAPPHIRE,
            EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(ModArmorMaterial.RUBY,
            EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(ModArmorMaterial.RUBY,
            EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterial.RUBY,
            EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterial.RUBY,
            EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));

    public static final Item GRASS_SWORD = registerItem("grass_sword", new SwordItem(GrassToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item GRASS_SWORD_SPRING = registerItem("grass_sword_spring", new SwordItem(SpringGrassToolMaterial.INSTANCE, -1, -2.4f, new FabricItemSettings()));
    public static final Item GRASS_SWORD_SUMMER = registerItem("grass_sword_summer", new SwordItem(SummerGrassToolMaterial.INSTANCE, 6, -2.4f, new FabricItemSettings()));
    public static final Item GRASS_SWORD_AUTUMN = registerItem("grass_sword_autumn", new SwordItem(AutumnGrassToolMaterial.INSTANCE, 5, -2.4f, new FabricItemSettings()));
    public static final Item GRASS_SWORD_WINTER = registerItem("grass_sword_winter", new SwordItem(WinterGrassToolMaterial.INSTANCE, 5, -2.4f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(rkdungeon.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        rkdungeon.LOGGER.debug("Registering Mod Items for" + rkdungeon.MOD_ID);
    }
}