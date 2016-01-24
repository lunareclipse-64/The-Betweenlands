package thebetweenlands.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

/**
 * BLRepeller - TripleHeadedSheep
 * Created using Tabula 4.1.1
 */
public class ModelRepeller extends ModelBase {
	public ModelRenderer jarbase;
	public ModelRenderer base;
	public ModelRenderer jar_midpiece;
	public ModelRenderer jar_edge;
	public ModelRenderer rope1;
	public ModelRenderer rope2;
	public ModelRenderer pole1;
	public ModelRenderer pole2;
	public ModelRenderer pole3;
	public ModelRenderer pole4;
	public ModelRenderer pole5;

	public ModelRepeller() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.pole3 = new ModelRenderer(this, 35, 7);
		this.pole3.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.pole3.addBox(-1.02F, -4.0F, 0.0F, 2, 4, 2, 0.0F);
		this.setRotateAngle(pole3, -0.36425021489121656F, 0.0F, 0.0F);
		this.jar_midpiece = new ModelRenderer(this, 0, 9);
		this.jar_midpiece.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.jar_midpiece.addBox(-1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F);
		this.pole1 = new ModelRenderer(this, 17, 7);
		this.pole1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.pole1.addBox(-1.0F, -10.0F, -1.0F, 2, 8, 2, 0.0F);
		this.rope1 = new ModelRenderer(this, 0, 18);
		this.rope1.setRotationPoint(0.0F, 1.0F, 1.0F);
		this.rope1.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(rope1, 0.091106186954104F, -0.08080874436733745F, -0.061959188445798695F);
		this.pole5 = new ModelRenderer(this, 26, 15);
		this.pole5.setRotationPoint(0.0F, -6.0F, -2.0F);
		this.pole5.addBox(-0.99F, -2.0F, -6.0F, 2, 2, 9, 0.0F);
		this.setRotateAngle(pole5, -0.091106186954104F, 0.0F, 0.0F);
		this.jar_edge = new ModelRenderer(this, 0, 13);
		this.jar_edge.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.jar_edge.addBox(-1.5F, -1.0F, -1.5F, 3, 1, 3, 0.0F);
		this.base = new ModelRenderer(this, 17, 0);
		this.base.setRotationPoint(0.0F, 24.0F, 0.0F);
		this.base.addBox(-2.0F, -2.0F, -2.0F, 4, 2, 4, 0.0F);
		this.jarbase = new ModelRenderer(this, 0, 0);
		this.jarbase.setRotationPoint(0.0F, 4.5F, -2.5F);
		this.jarbase.addBox(-2.0F, 0.0F, -2.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(jarbase, 0.4553564018453205F, 0.045553093477052F, 0.091106186954104F);
		this.pole2 = new ModelRenderer(this, 26, 7);
		this.pole2.setRotationPoint(0.0F, -10.0F, -1.0F);
		this.pole2.addBox(-1.01F, -6.0F, 0.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(pole2, -0.36425021489121656F, 0.0F, 0.0F);
		this.rope2 = new ModelRenderer(this, 1, 18);
		this.rope2.setRotationPoint(0.0F, 0.0F, 1.0F);
		this.rope2.addBox(-0.515F, -1.0F, 0.0F, 1, 1, 4, 0.0F);
		this.setRotateAngle(rope2, 1.0471975511965976F, 0.0F, 0.0F);
		this.pole4 = new ModelRenderer(this, 17, 18);
		this.pole4.setRotationPoint(0.0F, -4.0F, 2.0F);
		this.pole4.addBox(-0.99F, -6.0F, -2.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(pole4, 0.7285004297824331F, 0.0F, 0.0F);
		this.pole2.addChild(this.pole3);
		this.jarbase.addChild(this.jar_midpiece);
		this.base.addChild(this.pole1);
		this.jar_edge.addChild(this.rope1);
		this.pole4.addChild(this.pole5);
		this.jar_midpiece.addChild(this.jar_edge);
		this.pole1.addChild(this.pole2);
		this.rope1.addChild(this.rope2);
		this.pole3.addChild(this.pole4);
	}

	public void render() { 
		this.base.render(0.0625F);
		this.jarbase.render(0.0625F);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
