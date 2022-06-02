// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelsteve<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "steve"), "main");
	private final ModelPart Head;
	private final ModelPart Jambe;
	private final ModelPart Chesplate;
	private final ModelPart Pied;

	public Modelsteve(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Jambe = root.getChild("Jambe");
		this.Chesplate = root.getChild("Chesplate");
		this.Pied = root.getChild("Pied");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition HeadH = Head.addOrReplaceChild("HeadH",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(4.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = HeadH.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(24, 19)
						.addBox(0.0F, -5.0F, -4.0F, 9.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 19)
						.addBox(0.0F, 4.0F, -4.0F, 9.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = HeadH.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 4.0F, -5.0F, 9.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, -1.5708F));

		PartDefinition CorneG = Head.addOrReplaceChild("CorneG",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, -9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -14.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -14.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -18.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -14.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -15.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -17.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -13.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition CorneD = Head.addOrReplaceChild("CorneD",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, -9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -14.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -14.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -18.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -14.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -15.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -17.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -13.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 3.098F, 0.0F));

		PartDefinition Jambe = partdefinition.addOrReplaceChild("Jambe", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition RightLeg = Jambe.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, -12.0F, 0.0F));

		PartDefinition CorneG4 = RightLeg.addOrReplaceChild("CorneG4",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(9.0F, 19.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 18.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 18.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 18.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 14.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 14.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 14.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 13.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 15.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 17.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 18.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.1F, 8.0F, 2.0F, -3.1416F, 0.0436F, 1.0472F));

		PartDefinition bone2 = RightLeg.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.0F, 10.0F, -3.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 10.0F, -3.0F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.1F, -10.0F, 0.0F));

		PartDefinition LeftLeg = Jambe.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(1.9F, -12.0F, 0.0F));

		PartDefinition CorneG5 = LeftLeg.addOrReplaceChild("CorneG5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(9.0F, 19.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 18.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 18.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 17.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 18.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 16.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 14.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 14.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, 14.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 13.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 18.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, 15.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 17.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 18.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1F, -9.0F, -2.0F, 0.1309F, 0.0436F, 1.0472F));

		PartDefinition Chesplate = partdefinition.addOrReplaceChild("Chesplate", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition RightArm = Chesplate.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.1F, -10.0F, 0.0F));

		PartDefinition CorneG3 = RightArm.addOrReplaceChild("CorneG3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(12.0F, 12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(13.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, 4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 7.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 5.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 9.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, 11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -2.0F, 0.0F));

		PartDefinition bone = RightArm.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -3.0F, -3.0F, 5.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, -3.0F, -3.0F, 5.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = Chesplate.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F,
				0.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, -12.0F, 0.0F));

		PartDefinition LeftArm = Chesplate.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(6.9F, -10.0F, 0.0F));

		PartDefinition CorneG2 = LeftArm.addOrReplaceChild("CorneG2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(12.0F, 12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(13.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 5.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, 4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 4.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 7.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 6.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 5.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 4.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 9.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 10.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, 11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(10.0F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(11.0F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -2.0F, 1.0F, 0.0F, 3.098F, 0.0F));

		PartDefinition Pied = partdefinition.addOrReplaceChild("Pied",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -4.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -4.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Jambe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chesplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Pied.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}