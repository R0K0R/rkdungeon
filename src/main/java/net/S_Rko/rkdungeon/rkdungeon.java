package net.S_Rko.rkdungeon;

import net.S_Rko.rkdungeon.block.ModBlocks;
import net.S_Rko.rkdungeon.effect.ModEffects;
import net.S_Rko.rkdungeon.item.ModItemGroup;
import net.S_Rko.rkdungeon.item.ModItems;
import net.S_Rko.rkdungeon.util.ModLootTableModifiers;
import net.S_Rko.rkdungeon.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class rkdungeon implements ModInitializer {
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
	}
}
