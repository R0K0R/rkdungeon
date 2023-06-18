package org.airbow.rkdungeon.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.airbow.rkdungeon.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static org.airbow.rkdungeon.Rkdungeon.LOGGER;
import static org.airbow.rkdungeon.Rkdungeon.MOD_ID;

public class ModBlocks {

    public static final Block BLACKJEWEL_BLOCK = registerBlock("blackjewel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK).requiresTool().strength(6f))
            );
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool().strength(5f),
            UniformIntProvider.create(3, 7)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).requiresTool().strength(5f),
            UniformIntProvider.create(3, 7)));
    public static final Block BLACKJEWEL_ORE = registerBlock("blackjewel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool().strength(5.5f),
            UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_BLACKJEWEL_ORE = registerBlock("deepslate_blackjewel_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_COAL_ORE).requiresTool().strength(7f),
            UniformIntProvider.create(3, 7)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name), block);
    }

    private static Item registerBlockItems(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerBlocks(){
        LOGGER.debug("registering blocks for " + MOD_ID);
    }
}
