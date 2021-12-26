//FMT-Marker TiM-1.0
//Using PER-GROUP-INIT mode with limit '500'!
package wwcp.models.tenders;

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
public class CN_Vanderbuilt_Tender extends RollingStockModel {

	public CN_Vanderbuilt_Tender(){
		super(); textureX = 256; textureY = 256;
		//
		initGroup_U1Fcb();
		initGroup_clipboard();
		initGroup_X10acb();
		initGroup_SD70ACUcb();
		initGroup_U1F_Front_Bogiecb();
		initGroup_X10a_Rear_Truckcb();
		initGroup_unnamedmodelcb();
	}

	private final void initGroup_U1Fcb(){
		TurboList U1Fcb = new TurboList("U1Fcb");
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 63, 83, textureX, textureY).addBox(0, 0, 0, 28, 10, 3)
			.setRotationPoint(5, -17, 8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 134, 144, textureX, textureY)
			.addShapeBox(0, -11, 0, 1, 11, 11, 0, 2, -8.17f, -2.823f, 0, -8.17f, -2.823f, 0, -3, -3, 0, -3, -3, 2, 0, -4, 0, 0, -4, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-33, -7, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 130, 108, textureX, textureY).addCylinder(0, 0, 0, 4, 1, 8, 1, 1, 3, null)
			.setRotationPoint(-35, -7, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 54, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, 0, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 105, 108, textureX, textureY).addBox(0, 0, 0, 1, 1, 22)
			.setRotationPoint(-33, 4, -11).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 8, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-32, -15, 8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 81, textureX, textureY).addBox(0, 0, 0, 28, 10, 3)
			.setRotationPoint(5, -17, -11).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 81, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -18, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 170, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 8, 3, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -15, -11).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 3, 8, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -18, -8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 65, 8, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3)
			.setRotationPoint(-32, -7, 8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 65, 8, 3, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -7, -11).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 65, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0)
			.setRotationPoint(-32, 1, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 65, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, 1, -8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 80, 97, textureX, textureY).addBox(0, 0, 0, 1, 10, 22)
			.setRotationPoint(4, -17, -11).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 142, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, -21, 8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 79, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 4, 2, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, -21, -10).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 153, 125, textureX, textureY).addBox(0, 0, 0, 1, 4, 16)
			.setRotationPoint(4, -21, -8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 35, 121, textureX, textureY).addBox(0, 0, 0, 1, 8, 16)
			.setRotationPoint(4, -7, -8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 119, textureX, textureY).addBox(0, 0, 0, 1, 4, 16)
			.setRotationPoint(32, -21, -8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 25, 142, textureX, textureY).addBox(0, 0, 0, 1, 13, 4)
			.setRotationPoint(32, -17, -8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 241, 125, textureX, textureY).addBox(0, 0, 0, 1, 13, 4)
			.setRotationPoint(32, -17, 4).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 206, 108, textureX, textureY).addBox(0, 0, 0, 1, 2, 8)
			.setRotationPoint(32, -17, -4).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 42, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(33, -16, -5).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 35, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(33, -16, 4).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 105, 97, textureX, textureY).addBox(0, 0, 0, 2, 1, 8)
			.setRotationPoint(33, -16, -4).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 234, 26, textureX, textureY).addBox(0, 0, 0, 2, 1, 8)
			.setRotationPoint(33, -4, -4).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 134, 27, textureX, textureY).addBox(0, 0, 0, 3, 2, 3)
			.setRotationPoint(33, 1, -1.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 11, 0, 2, 0, -4, 0, 0, -4, 0, 0, -0.25f, 0, 0, -0.25f, 2, -8.17f, -2.823f, 0, -8.17f, -2.823f, 0, -3, -3, 0, -3, -3)
			.setRotationPoint(-33, -7, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 227, 137, textureX, textureY)
			.addShapeBox(0, -11, 0, 1, 11, 11, 0, 0, -3, -3, 0, -3, -3, 0, -8.17f, -2.823f, 2, -8.17f, -2.823f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -4, 2, 0, -4)
			.setRotationPoint(-33, -7, -11).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 120, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 11, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -4, 2, 0, -4, 0, -3, -3, 0, -3, -3, 0, -8.17f, -2.823f, 2, -8.17f, -2.823f)
			.setRotationPoint(-33, -7, -11).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 95, 132, textureX, textureY)
			.addShapeBox(0, -11, 0, 1, 11, 11, 0, 2, -8.17f, -2.823f, 0, -8.17f, -2.823f, 0, -3, -3, 0, -3, -3, 2, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -7, 0).setRotationAngle(90, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 70, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 11, 0, 2, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 2, -8.17f, -2.823f, 0, -8.17f, -2.823f, 0, -3, -3, 0, -3, -3)
			.setRotationPoint(-33, -7, 0).setRotationAngle(90, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 213, 125, textureX, textureY)
			.addShapeBox(0, -11, 0, 1, 11, 11, 0, 2, -8.17f, -2.823f, 0, -8.17f, -2.823f, 0, -3, -3, 0, -3, -3, 2, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -7, 0).setRotationAngle(-90, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 188, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 11, 0, 2, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 2, -8.17f, -2.823f, 0, -8.17f, -2.823f, 0, -3, -3, 0, -3, -3)
			.setRotationPoint(-33, -7, 0).setRotationAngle(-90, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 24, textureX, textureY).addBox(0, 0, 0, 64, 1, 4)
			.setRotationPoint(-32, 3, -2).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 247, 47, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-19, 3.5f, -1).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 137, 33, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(17, 3.5f, -1).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 19, 119, textureX, textureY).addBox(-1, 0, 0, 1, 11, 4)
			.setRotationPoint(33, -15, -4).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 119, textureX, textureY).addBox(-1, 0, -4, 1, 11, 4)
			.setRotationPoint(33, -15, 4).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 204, 39, textureX, textureY).addBox(0, 0, 0, 19, 1, 6)
			.setRotationPoint(9, -22, -3).setRotationAngle(0, 0, 0).setName("Coal0")
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 205, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0)
			.setRotationPoint(9, -22, 3).setRotationAngle(0, 0, 0).setName("Coal1")
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 204, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 1, 4, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9, -22, -7).setRotationAngle(0, 0, 0).setName("Coal2")
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 79, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0)
			.setRotationPoint(28, -22, -3).setRotationAngle(0, 0, 0).setName("Coal3")
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 220, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0)
			.setRotationPoint(5, -22, -3).setRotationAngle(0, 0, 0).setName("Coal4")
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 190, 111, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(32, 1, 8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 171, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 8, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, 1, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 241, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 3, 0, 0, 0, -2.75f, 0, 0, -2.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -7, 8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 230, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 11, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, 0, -11).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 31, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-35, 4.5f, -11).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 139, 12, textureX, textureY).addBox(0, 0, 0, 3, 3, 3)
			.setRotationPoint(-36, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 222, 73, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-37, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 217, 108, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-39, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 206, 108, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-38, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 196, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 158, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-40, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 71, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(-38, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 48, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-39, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 131, 39, textureX, textureY).addBox(0, 0, 0, 28, 5, 16)
			.setRotationPoint(5, -4, -8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 171, 108, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(-25, -17.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(U1Fcb);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 108, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(32, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, 1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.75f, 0, 0, -2.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(32, -7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, -4, -3, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, -4, 3, 0)
			.setRotationPoint(28, -22, 3).setRotationAngle(0, 0, 0).setName("Coal5")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, -3, -4, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 3, -4, 0, 3, 0, 0, 3, 0)
			.setRotationPoint(28, -22, 3).setRotationAngle(0, 0, 0).setName("Coal6")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, -4, -3, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, -4, 3, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0)
			.setRotationPoint(28, -22, -7).setRotationAngle(0, 0, 0).setName("Coal7")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -3, 0, 0, -3, 0, 0, -3, -4, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 3, -4, 0, 0, 0)
			.setRotationPoint(28, -22, -7).setRotationAngle(0, 0, 0).setName("Coal8")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -3, 0, 0, 0, 0, -4, -3, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, -4, 3, 0, 0, 3, 0)
			.setRotationPoint(5, -22, 3).setRotationAngle(0, 0, 0).setName("Coal9")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -3, -4, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 3, -4, 0, 0, 0, 0, 3, 0, 0, 3, 0)
			.setRotationPoint(5, -22, 3).setRotationAngle(0, 0, 0).setName("Coal10")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -3, 0, -4, -3, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, -4, 3, 0, 0, 0, 0, 0, 3, 0)
			.setRotationPoint(5, -22, -7).setRotationAngle(0, 0, 0).setName("Coal11")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, -3, -4, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 3, -4)
			.setRotationPoint(5, -22, -7).setRotationAngle(0, 0, 0).setName("Coal12")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-33, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(-34.5f, -16, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-32.5f, -16, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.5f, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-32.5f, -17, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-33.75f, -17, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, 0, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.25f, -1.25f, 0, -0.25f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-35, -17, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 82, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, -8.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 75, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, -5.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 65, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, -2.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 63, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, 0.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(-34.5f, -16, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-32.5f, -16, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.5f, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-32.5f, -17, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-33.75f, -17, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, 0, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.25f, -1.25f, 0, -0.25f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-35, -17, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 61, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, -8.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 61, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, -5.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 61, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, -2.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 59, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, 0.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(-34.5f, -16, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-32.5f, -16, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.5f, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-32.5f, -17, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-33.75f, -17, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, 0, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.25f, -1.25f, 0, -0.25f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-35, -17, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 57, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, -11.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0.5f, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-35.75f, -7, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, 0, 0, 0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.5f, 0, 0.5f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, -7, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 108, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(-35.5f, -4, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 95, textureX, textureY).addBox(0, 0, 0, 8, 5, 18)
			.setRotationPoint(-4, 4, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2, 1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 1, 11, 0, 0, -0.5f, -0.1f, 0, -0.5f, -0.1f, 0, -0.5f, -1.1f, 0, -0.5f, -1.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -1.1f, 0, 0, -1.1f)
			.setRotationPoint(-32, -18.6f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 86, textureX, textureY).addBox(0, 0, 0, 3, 18, 3)
			.setRotationPoint(3, -22, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-20.5f, -19, -5.75f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 107, textureX, textureY)
			.addShapeBox(0, 0, -4, 1, 1, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-20.5f, -19, 5.75f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-30.5f, -19, -5.75f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 107, textureX, textureY)
			.addShapeBox(0, 0, -4, 1, 1, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-30.5f, -19, 5.75f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 57, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(4.5f, -22, 8.75f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(4, -22, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 89, textureX, textureY).addBox(0, 0, 0, 27, 17, 1)
			.setRotationPoint(5, -21, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 89, textureX, textureY).addBox(0, 0, 0, 27, 17, 1)
			.setRotationPoint(5, -21, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 57, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(11, -22, 8.75f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 57, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(17.5f, -22, 8.75f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 57, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(24, -22, 8.75f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 57, textureX, textureY)
			.addShapeBox(0, 0, -2, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(30.5f, -22, 8.75f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(4, -22, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(4.5f, -22, -8.75f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(11, -22, -8.75f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(17.5f, -22, -8.75f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(24, -22, -8.75f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(30.5f, -22, -8.75f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(0, -20.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(0, -20.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1.5f, -3.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.5f, 2.75f, 0, 1, -3.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 1, 2.75f)
			.setRotationPoint(1, -22, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1.5f, 2.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1.5f, -3.25f, 0, 1, 2.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 1, -3.25f)
			.setRotationPoint(1, -22, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 107, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(-15, -17.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 107, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(-5, -17.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 107, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(-25, -17.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 97, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(-15, -17.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 97, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(-5, -17.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, 0, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(4, -17, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(4, -17, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 26, textureX, textureY).addBox(0, 0, 0, 6, 1, 4)
			.setRotationPoint(-11, 0.5f, 7).setRotationAngle(-35, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 16, textureX, textureY).addBox(0, 0, -4, 6, 1, 4)
			.setRotationPoint(-11, 0, -7).setRotationAngle(35, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 5, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-34.5f, -17, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(-35.25f, -17.25f, -1).setRotationAngle(0, 0, -20)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 36, textureX, textureY)
			.addShapeBox(-0.1f, 0, 0, 1, 2, 2, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f)
			.setRotationPoint(-35.25f, -17.25f, -1).setRotationAngle(0, 0, -20).setName("Light_Rear")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 64, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-32, 2.25f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-26, -15.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16, -15.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6, -15.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-35, 7.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-35, 5, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-33, 5, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-35, 7.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-35, 5, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-33, 5, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-32.5f, -19, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(-33.5f, -19, -8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-32.5f, -19, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
			.setRotationPoint(-33.5f, -19, 7.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_X10acb(){
		TurboList X10acb = new TurboList("X10acb");
		X10acb.add(new ModelRendererTurbo(X10acb, 148, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 20, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.25f, 0, 0.5f, -0.25f)
			.setRotationPoint(-34.5f, -16, 10.25f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 141, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-32.5f, -16, 10.25f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 139, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.5f, -0.5f, -1.25f, 0, -0.5f, -1.25f, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-32.5f, -17, 10.25f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 251, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-33.75f, -17, 10.25f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 139, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, 0, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f, -0.25f, -1.25f, 0, -0.25f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
			.setRotationPoint(-35, -17, 10.25f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 147, 8, textureX, textureY)
			.addShapeBox(1, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, -11.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 139, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-35.75f, -7, -3).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 148, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-32, -19, -6.5f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 79, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-32, -19, 5.5f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 245, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-0.5f, -19, -5.75f).setRotationAngle(-43, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 134, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-10.5f, -19, -5.75f).setRotationAngle(-43, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 244, 0, textureX, textureY)
			.addShapeBox(0, 0, -4, 1, 1, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-0.5f, -19, 5.75f).setRotationAngle(43, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 230, 0, textureX, textureY)
			.addShapeBox(0, 0, -4, 1, 1, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-10.5f, -19, 5.75f).setRotationAngle(43, 0, 0)
		);
		this.groups.add(X10acb);
	}

	private final void initGroup_SD70ACUcb(){
		TurboList SD70ACUcb = new TurboList("SD70ACUcb");
		SD70ACUcb.add(new ModelRendererTurbo(SD70ACUcb, 147, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-33.5f, 1.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		SD70ACUcb.add(new ModelRendererTurbo(SD70ACUcb, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-33.65f, 1.75f, -7.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_right_back")
		);
		SD70ACUcb.add(new ModelRendererTurbo(SD70ACUcb, 148, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-33.5f, 1.75f, 5.5f).setRotationAngle(0, 0, 0)
		);
		SD70ACUcb.add(new ModelRendererTurbo(SD70ACUcb, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-33.65f, 1.75f, 5.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_left_back")
		);
		this.groups.add(SD70ACUcb);
	}

	private final void initGroup_U1F_Front_Bogiecb(){
	}

	private final void initGroup_X10a_Rear_Truckcb(){
	}

	private final void initGroup_unnamedmodelcb(){
	}

}
