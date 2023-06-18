package org.airbow.rkdungeon.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static org.airbow.rkdungeon.Rkdungeon.LOGGER;
import static org.airbow.rkdungeon.Rkdungeon.MOD_ID;

public class ModItemGroup {
    public static ItemGroup RKDUNGEON = Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "rkdungeon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rkdungeon"))
                    .icon(() -> new ItemStack(ModItems.BLACKJEWEL)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.BLACKJEWEL);
                        entries.add(ModItems.BLACKJEWEL_AXE);
                        entries.add(ModItems.BLACKJEWEL_BOOTS);
                        entries.add(ModItems.BLACKJEWEL_CHESTPLATE);
                        entries.add(ModItems.BLACKJEWEL_DAGGER);
                        entries.add(ModItems.BLACKJEWEL_HOE);
                        entries.add(ModItems.BLACKJEWEL_LEGGINGS);
                        entries.add(ModItems.BLACKJEWEL_PICKAXE);
                        entries.add(ModItems.BLACKJEWEL_SHOVEL);
                        entries.add(ModItems.BLACKJEWEL_HELMET);;

                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_BOOTS);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_DAGGER);
                        entries.add(ModItems.SAPPHIRE_HOE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_SWORD);

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_BOOTS);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_DAGGER);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_SWORD);

                        entries.add(ModItems.GRASS_SWORD);
                        entries.add(ModItems.GRASS_SWORD_AUTUMN);
                        entries.add(ModItems.GRASS_SWORD_SPRING);
                        entries.add(ModItems.GRASS_SWORD_SUMMER);
                        entries.add(ModItems.GRASS_SWORD_WINTER);

                        entries.add(ModItems.FIRE_ENERGY);
                        entries.add(ModItems.FIRE_SWORD);

                        entries.add(ModItems.ELECTRIC_ARROW);
                        entries.add(ModItems.SPARK_SWORD);
                    })).build());
    public static void registerItemGroups() {
        LOGGER.debug("item groups registered");
    }
}