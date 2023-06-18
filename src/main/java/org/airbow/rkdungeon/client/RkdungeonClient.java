package org.airbow.rkdungeon.client;

import org.airbow.rkdungeon.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;

public class RkdungeonClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}