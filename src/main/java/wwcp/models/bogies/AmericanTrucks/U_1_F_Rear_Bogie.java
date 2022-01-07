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
public class U_1_F_Rear_Bogie extends RollingStockModel {

	public U_1_F_Rear_Bogie(){
		super(); textureX = 256; textureY = 256;
		//
		initGroup_U1Fcb();
	}

	private final void initGroup_U1Fcb(){
		TurboList U1Fcb = new TurboList("U1Fcb");
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 35, 0, textureX, textureY).addBox(0, 0, 0, 16, 2, 1)
			.setRotationPoint(-4, 6, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 231, 0, textureX, textureY).addBox(-4, -4, 0, 8, 8, 0)
			.setRotationPoint(5, 6, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 214, 0, textureX, textureY).addBox(-4, -4, 0, 8, 8, 0)
			.setRotationPoint(5, 6, -6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 155, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, -5)
			.setRotationPoint(-13, 6, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 28, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 5, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 111, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 5, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 50, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 3, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 21, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 2, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 45, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9, 3, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 14, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7, 2, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 7, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, 5, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 195, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 3, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 73, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, 2, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 115, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(3.5f, 4.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 106, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(3.5f, 4.8f, 6.35f).setRotationAngle(20, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 0, textureX, textureY).addBox(0, 0, 0, 16, 2, 1)
			.setRotationPoint(-4, 6, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 134, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 5)
			.setRotationPoint(-13, 6, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 5, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 88, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 5, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 40, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 3, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 248, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 2, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 35, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9, 3, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 124, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(7, 2, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 248, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, 5, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 176, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 3, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 73, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, 2, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 97, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(3.5f, 4.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 88, 3, textureX, textureY)
			.addShapeBox(0, -0.5f, 0, 3, 3, 1, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(3.5f, 4.9f, -7.5f).setRotationAngle(-20, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 56, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(12, 6, -7).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 73, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(4.5f, 5.5f, -6).setRotationAngle(0, 0, 0)
		);
		this.groups.add(U1Fcb);
	}

}
