package net.S_Rko.rkdungeon.block;

import net.S_Rko.rkdungeon.item.ModItemGroup;
import net.S_Rko.rkdungeon.rkdungeon;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BLACKJEWEL_BLOCK = registerBlock("blackjewel_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6f))
            , ModItemGroup.RKDUNGEON);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItems(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(rkdungeon.MOD_ID, name), block);
    }

    private static Item registerBlockItems(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(rkdungeon.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerBlocks(){
        rkdungeon.LOGGER.debug("registering blocks for " + rkdungeon.MOD_ID);
    }
}
