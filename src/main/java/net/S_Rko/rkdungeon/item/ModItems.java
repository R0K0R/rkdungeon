package net.S_Rko.rkdungeon.item;

import net.S_Rko.rkdungeon.entity.ModEntities;
import net.S_Rko.rkdungeon.item.custom.ModAxeItems;
import net.S_Rko.rkdungeon.item.custom.ModHoeItems;
import net.S_Rko.rkdungeon.item.custom.ModPickaxeItems;
import net.S_Rko.rkdungeon.rkdungeon;
import net.S_Rko.rkdungeon.tool_material.BlackjewelToolMaterial;
import net.S_Rko.rkdungeon.tool_material.SapphireToolMaterial;
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
            5, 0, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(SapphireToolMaterial.INSTANCE,
            3, -1.5F, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe", new ModAxeItems(SapphireToolMaterial.INSTANCE,
            8, -2.5F, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new ModPickaxeItems(SapphireToolMaterial.INSTANCE,
            4, -2, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new ModHoeItems(SapphireToolMaterial.INSTANCE,
            2, -1, new Item.Settings().group(ModItemGroup.RKDUNGEON)));

    public static final Item BLACKJEWEL_HELMET = registerItem("blackjewel_helmet", new ArmorItem(ModArmorMaterial.BLACKJEWEL,
            EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_CHESTPLATE = registerItem("blackjewel_chestplate", new ArmorItem(ModArmorMaterial.BLACKJEWEL,
            EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_LEGGINGS = registerItem("blackjewel_leggings", new ArmorItem(ModArmorMaterial.BLACKJEWEL,
            EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_BOOTS = registerItem("blackjewel_boots", new ArmorItem(ModArmorMaterial.BLACKJEWEL,
            EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item RACCOON_SPAWN_EGG = registerItem("raccoon_spawn_egg", new SpawnEggItem(ModEntities.RACCOON,
            0x948e8d, 0x3b3635, new FabricItemSettings().group(ModItemGroup.RKDUNGEON).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(rkdungeon.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        rkdungeon.LOGGER.debug("Registering Mod Items for" + rkdungeon.MOD_ID);
    }
}