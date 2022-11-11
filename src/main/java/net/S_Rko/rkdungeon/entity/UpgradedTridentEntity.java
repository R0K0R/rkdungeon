package net.S_Rko.rkdungeon.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UpgradedTridentEntity extends TridentEntity {
    public UpgradedTridentEntity(EntityType<? extends TridentEntity> entityType, World world) {
        super(entityType, world);
    }

    public UpgradedTridentEntity(World world, PlayerEntity playerEntity, ItemStack stack) {
        super(world, playerEntity, stack);
    }
}