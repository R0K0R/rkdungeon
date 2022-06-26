package net.S_Rko.rkdungeon.item;

import net.S_Rko.rkdungeon.item.custom.ModAxeItems;
import net.S_Rko.rkdungeon.item.custom.ModHoeItems;
import net.S_Rko.rkdungeon.item.custom.ModPickaxeItems;
import net.S_Rko.rkdungeon.rkdungeon;
import net.S_Rko.rkdungeon.tool_material.BlackjewelToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BLACKJEWEL = registerItem("blackjewel", new Item(new FabricItemSettings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_DAGGER = registerItem("blackjewel_dagger", new SwordItem(BlackjewelToolMaterial.INSTANCE, 5, 0, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_SHOVEL = registerItem("blackjewel_shovel", new ShovelItem(BlackjewelToolMaterial.INSTANCE, 3, -1.5F, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_AXE = registerItem("blackjewel_axe", new ModAxeItems(BlackjewelToolMaterial.INSTANCE, 8, -2.5F, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_PICKAXE = registerItem("blackjewel_pickaxe", new ModPickaxeItems(BlackjewelToolMaterial.INSTANCE, 4, -2, new Item.Settings().group(ModItemGroup.RKDUNGEON)));
    public static final Item BLACKJEWEL_HOE = registerItem("blackjewel_hoe", new ModHoeItems(BlackjewelToolMaterial.INSTANCE, 2, -1, new Item.Settings().group(ModItemGroup.RKDUNGEON)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(rkdungeon.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        rkdungeon.LOGGER.debug("Registering Mod Items for" + rkdungeon.MOD_ID);
    }
}