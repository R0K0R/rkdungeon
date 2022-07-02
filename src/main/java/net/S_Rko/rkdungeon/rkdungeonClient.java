package net.S_Rko.rkdungeon;

import net.S_Rko.rkdungeon.entity.ModEntities;
import net.S_Rko.rkdungeon.entity.client.RaccoonRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.util.registry.Registry;

public class rkdungeonClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.RACCOON, RaccoonRenderer::new);
    }
}