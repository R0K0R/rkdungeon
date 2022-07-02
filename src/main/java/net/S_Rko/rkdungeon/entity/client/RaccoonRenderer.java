package net.S_Rko.rkdungeon.entity.client;

import net.S_Rko.rkdungeon.entity.custom.RaccoonEntities;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import net.S_Rko.rkdungeon.rkdungeon;

public class RaccoonRenderer extends GeoEntityRenderer<RaccoonEntities> {
    public RaccoonRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new RaccoonModel());
    }

    @Override
    public Identifier getTextureLocation(RaccoonEntities instance) {
        return new Identifier(rkdungeon.MOD_ID, "textures/entity/raccoon/raccoon.png");
    }
}