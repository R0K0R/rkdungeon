// Made with Blockbench 4.5.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class custom_model extends EntityModel<Entity> {
	private final ModelPart ghost;
	private final ModelPart body;
	private final ModelPart arms;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	public custom_model(ModelPart root) {
		this.ghost = root.getChild("ghost");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData ghost = modelPartData.addChild("ghost", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = ghost.addChild("body", ModelPartBuilder.create().uv(16, 21).cuboid(-4.0F, -10.0F, 2.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 27).cuboid(-4.0F, -10.0F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 0).cuboid(-4.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 17).cuboid(-4.0F, -10.0F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 26).cuboid(-4.0F, -10.0F, -2.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(27, 23).cuboid(-4.0F, -10.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 26).cuboid(-4.0F, -10.0F, 3.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 4).cuboid(-3.0F, -10.0F, 3.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 26).cuboid(-2.0F, -10.0F, 3.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 21).cuboid(-1.0F, -10.0F, 3.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 27).cuboid(0.0F, -10.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 26).cuboid(2.0F, -10.0F, 3.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 0).cuboid(1.0F, -10.0F, 3.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(27, 20).cuboid(3.0F, -10.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 21).cuboid(3.0F, -10.0F, 2.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 26).cuboid(3.0F, -10.0F, 1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 21).cuboid(3.0F, -10.0F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(27, 3).cuboid(3.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 17).cuboid(3.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 21).cuboid(-4.0F, -10.0F, -4.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(3.0F, -10.0F, -3.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 21).cuboid(3.0F, -10.0F, -4.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 0).cuboid(1.0F, -10.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 4).cuboid(-2.0F, -10.0F, -4.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(19, 25).cuboid(2.0F, -10.0F, -4.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 4).cuboid(0.0F, -10.0F, -4.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 24).cuboid(-1.0F, -10.0F, -4.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 21).cuboid(-3.0F, -10.0F, -4.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-4.0F, -19.0F, -4.0F, 8.0F, 9.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData arms = ghost.addChild("arms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = arms.addChild("cube_r1", ModelPartBuilder.create().uv(0, 17).cuboid(-7.0F, -13.0F, 0.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		ModelPartData cube_r2 = arms.addChild("cube_r2", ModelPartBuilder.create().uv(12, 17).cuboid(3.0F, -13.0F, 0.0F, 4.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		ghost.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}