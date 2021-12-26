//FMT-Marker TiM-1.0
//Using PER-GROUP-INIT mode with limit '500'!
package wwcp.models.bogies.AmericanTrucks;

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
public class U_1_F_Front_Bogie extends RollingStockModel {

	public U_1_F_Front_Bogie(){
		super(); textureX = 256; textureY = 256;
		//
		initGroup_U1Fcb();
		initGroup_clipboard();
		rotateAll(0,180,0);
	}

	private final void initGroup_U1Fcb(){
		TurboList U1Fcb = new TurboList("U1Fcb");
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 236, 0, textureX, textureY).addBox(-3, -3, 0, 6, 6, 0)
			.setRotationPoint(-6, 7, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 223, 0, textureX, textureY).addBox(-3, -3, 0, 6, 6, 0)
			.setRotationPoint(-6, 7, -6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 196, 0, textureX, textureY).addBox(-3, -3, 0, 6, 6, 0)
			.setRotationPoint(6, 7, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 169, 0, textureX, textureY).addBox(-3, -3, 0, 6, 6, 0)
			.setRotationPoint(6, 7, -6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 40, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-7.5f, 5.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 209, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-7.5f, 5.8f, 6.35f).setRotationAngle(20, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 117, 0, textureX, textureY).addBox(0, 0, 0, 18, 2, 1)
			.setRotationPoint(-9, 6, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 112, 7, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-7, 8.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 70, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-5, 8.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 63, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-9, 8.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 182, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(4.5f, 5.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 104, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(4.5f, 5.8f, 6.35f).setRotationAngle(20, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 56, 7, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(5, 8.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 49, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(7, 8.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 21, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(3, 8.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 78, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-9, 8, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 248, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(1, 8.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 14, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0)
			.setRotationPoint(-3, 8.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 7, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1, 8.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 243, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, 5, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 11, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, 5, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 238, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 5, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 233, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 228, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 223, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9, 5, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 5, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 201, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 5, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 196, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 148, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 174, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 39, 0, textureX, textureY).addBox(0, 0, 0, 18, 2, 1)
			.setRotationPoint(-9, 6, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 141, 4, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-7, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 134, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-5, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 127, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-9, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 120, 4, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(5, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 113, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(7, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 70, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(3, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-9, 8, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 63, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0)
			.setRotationPoint(1, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 56, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0)
			.setRotationPoint(-3, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 49, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 209, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, 5, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 169, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 5, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 149, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7, 3.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 249, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 3.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 144, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, 3.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 139, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9, 5, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 182, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 5, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 134, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 5, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 129, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, 3.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 249, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, 3.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 124, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 3.5f, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 144, 0, textureX, textureY).addBox(0, 0, 0, 6, 1, 12)
			.setRotationPoint(-3, 6, -6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 119, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, 5, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 95, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(4.5f, 5.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 86, 3, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 3, 3, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(4.5f, 5.9f, -7.5f).setRotationAngle(-20, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 77, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-7.5f, 5.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 31, 3, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 3, 3, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-7.5f, 5.9f, -7.5f).setRotationAngle(-20, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 22, 3, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-1, 5, -1).setRotationAngle(0, 0, 0)
		);
		this.groups.add(U1Fcb);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(-6.5f, 6.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(5.5f, 6.5f, -6).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

}
