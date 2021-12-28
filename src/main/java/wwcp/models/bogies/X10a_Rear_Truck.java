//FMT-Marker TiM-1.0
//Using PER-GROUP-INIT mode with limit '500'!
package wwcp.models.bogies;

import ebf.tim.models.StaticModelAnimator;
import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.entity.Entity;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class X10a_Rear_Truck extends RollingStockModel {

	public X10a_Rear_Truck(){
		super(); textureX = 256; textureY = 256;
		//
		initGroup_X10acb();
	}

	private final void initGroup_X10acb(){
		TurboList X10acb = new TurboList("X10acb");
		X10acb.add(new ModelRendererTurbo(X10acb, 182, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 6, -1).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 153, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(7, 7.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 142, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(7, 7.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 131, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(-7, 7.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 0, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(-7, 7.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 101, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(6, 6.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 94, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 87, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0)
			.setRotationPoint(4, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 6.6f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 80, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(-8, 6.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 73, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 66, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0)
			.setRotationPoint(-6, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 58, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-6, 5.1f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 52, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(5, 7.35f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 47, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, -0.625f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(5, 6.35f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 42, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 8.1f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 37, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(8, 7.35f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 5, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 8.1f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 6.35f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 247, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 59, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(6, 8.6f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 225, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-6, 7.35f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 127, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 6.35f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 242, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 8.1f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 237, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-9, 7.35f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 232, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9, 8.1f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 220, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-9, 6.35f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 184, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-9, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 52, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8, 8.6f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 108, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5, 8.6f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 173, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1.5f, 6.1f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 45, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-8, 5.35f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 38, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(6, 5.35f, 6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 31, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(6, 6.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 247, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 240, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0)
			.setRotationPoint(4, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 233, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(-8, 6.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 226, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 219, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0)
			.setRotationPoint(-6, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 31, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 5.1f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 179, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(5, 7.35f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 215, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, -0.625f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(5, 6.35f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 210, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 8.1f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 205, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(8, 7.35f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 200, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 8.1f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 195, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 6.35f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 190, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 212, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(6, 8.6f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 174, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-6, 7.35f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 169, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 6.35f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 164, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6, 8.1f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 123, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9, 8.1f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 118, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-9, 6.35f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 113, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-9, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 205, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8, 8.6f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 85, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0.125f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5, 8.6f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 164, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1.5f, 6.1f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 198, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-8, 5.35f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 191, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(6, 5.35f, -7).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 108, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-9, 7.35f, -7).setRotationAngle(0, 0, 0)
		);
		this.groups.add(X10acb);
	}

}
