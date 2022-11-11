package net.S_Rko.rkdungeon.client;

import net.S_Rko.rkdungeon.effect.ModEffects;
import net.S_Rko.rkdungeon.item.ModItems;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import static net.S_Rko.rkdungeon.rkdungeon.id;

public class ModBuiltinItemModelRenderer implements SimpleSynchronousResourceReloadListener {
    private TridentEntityModel modelTrident;
    private EntityModelLoader entityModelLoader;

    public ModBuiltinItemModelRenderer(BlockEntityRenderDispatcher blockEntityRenderDispatcher, EntityModelLoader entityModelLoader){
        this.entityModelLoader = entityModelLoader;
    }

    @Override
    public Identifier getFabricId() {
        return null;
    }

    @Override
    public void reload(ResourceManager manager) {
        modelTrident = new TridentEntityModel(this.entityModelLoader.getModelPart(EntityModelLayers.TRIDENT));
    }

    public void render(ItemStack itemStack, ModelTransformation.Mode transformType, MatrixStack matrices, VertexConsumerProvider vertices, int light, int overlay) {
        if (itemStack.isOf(ModItems.UPGRADED_TRIDENT)){
            renderTrident(modelTrident, itemStack, transformType, matrices, vertices, light, overlay);
        }
    }

    public static void renderTrident(TridentEntityModel model, ItemStack stack, ModelTransformation.Mode mode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();
        matrices.scale(1.0F, -1.0F, -1.0F);
        VertexConsumer vertexConsumer2 = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers, model.getLayer(id("textures/entity/upgraded_trident.png")), false, stack.hasGlint());
        model.render(matrices, vertexConsumer2, light, overlay, 1.0F, 1.0F, 1.0F, 1.0F);
        matrices.pop();
    }
}
