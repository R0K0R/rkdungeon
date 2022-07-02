package net.S_Rko.rkdungeon.util;

import net.S_Rko.rkdungeon.entity.ModEntities;
import net.S_Rko.rkdungeon.entity.custom.RaccoonEntities;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
    public static void registerModStuffs(){
        registerAttributes();
    }

    private static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(ModEntities.RACCOON, RaccoonEntities.setAttributes());
    }
}
