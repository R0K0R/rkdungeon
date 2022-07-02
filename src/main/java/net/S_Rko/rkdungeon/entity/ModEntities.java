package net.S_Rko.rkdungeon.entity;

import net.S_Rko.rkdungeon.entity.custom.RaccoonEntities;
import net.S_Rko.rkdungeon.rkdungeon;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<RaccoonEntities> RACCOON = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(rkdungeon.MOD_ID, "raccoon"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RaccoonEntities::new)
                    .dimensions(EntityDimensions.fixed(0.7f, 0.6f)).build());
}