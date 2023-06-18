package org.airbow.rkdungeon;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.airbow.rkdungeon.block.ModBlocks;
import org.airbow.rkdungeon.effect.ModEffects;
import org.airbow.rkdungeon.enchantment.ModEnchantments;
import org.airbow.rkdungeon.item.ModItemGroup;
import org.airbow.rkdungeon.item.ModItems;
import org.airbow.rkdungeon.util.ModLootTableModifiers;
import org.airbow.rkdungeon.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rkdungeon implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "rkdungeon";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
		ModBlocks.registerBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModRegistries.registerModStuffs();
		ModEffects.registerEffects();
		ModEnchantments.registerModEnchantments();
		ModItemGroup.registerItemGroups();
	}
}
