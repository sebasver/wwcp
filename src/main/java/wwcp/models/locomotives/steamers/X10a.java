//FMT-Marker TiM-1.0
//Using PER-GROUP-INIT mode with limit '500'!
package wwcp.models.locomotives.steamers;

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
public class X10a extends RollingStockModel {

	public X10a(){
		super(); textureX = 512; textureY = 512;
		//
		initGroup_group0();
		initGroup_clipboard();
		initGroup_U1Fcb();
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 62, 127, textureX, textureY).addCylinder(0, 0, 0, 7, 52, 8, 1, 1, 2, null)
				.setRotationPoint(-9, -10, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 124, 24, textureX, textureY).addBox(0, 0, 0, 27, 1, 5)
				.setRotationPoint(7, -4, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 144, 177, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 8, 8, 1, 1, 1, null)
				.setRotationPoint(41, -17.5f, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 242, 172, textureX, textureY).addCylinder(0, 0, 0, 2, 4, 8, 1, 1, 4, new Vec3f(0.0, -0.5, 0.0))
				.setRotationPoint(37, -20.5f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 65, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 7, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1)
				.setRotationPoint(-9, -10, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 77, 74, textureX, textureY).addBox(0, 0, 0, 1, 12, 20)
				.setRotationPoint(-10, -15, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 104, 157, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-10, -17, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 20, textureX, textureY).addBox(0, 0, 0, 19, 1, 20)
				.setRotationPoint(-29, -4, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 176, 18, textureX, textureY).addBox(0, 0, 0, 19, 1, 20)
				.setRotationPoint(-47, 1, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 153, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.5f, 0)
				.setRotationPoint(43, -8.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 123, 176, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
				.setRotationPoint(45, -9.75f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 116, 177, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 2, 8, 1, 1, 2, null)
				.setRotationPoint(44.5f, -10.25f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 152, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, -0.5f, -0.25f)
				.setRotationPoint(46, -8.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -2, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, -0.25f, 0, 0, -2, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(43.25f, -17, 0).setRotationAngle(0, 0, 0).setName("NumberBoard_Left_Front")
		);
		group0.add(new ModelRendererTurbo(group0, 114, 195, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(43, -16.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 100, 195, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(43.4f, -14.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 215, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.05f, -0.25f, -0.5f, -0.05f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(30.75f, -20.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 85, 53, textureX, textureY).addBox(0, 0, 0, 8, 6, 14)
				.setRotationPoint(31, -1, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 196, textureX, textureY).addCylinder(0, 0, 0, 1, 2.5f, 8, 1, 1, 4, null)
				.setRotationPoint(22.755f, -6.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 181, 103, textureX, textureY).addBox(0, 0, 0, 4, 2, 3)
				.setRotationPoint(13, -6, 5.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 195, 195, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
				.setRotationPoint(16, -9, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 109, 172, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
				.setRotationPoint(37.5f, -2, -6.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 44, 195, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(38.5f, -4, -5.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 198, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, 0, -2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 2, 0, 0, 2, 0)
				.setRotationPoint(-28, -18, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 91, 157, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-30, -15, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 33, 195, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(27, -0.75f, 8.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 50, 1, 12)
				.setRotationPoint(-18, 3, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 202, 100, textureX, textureY).addCylinder(0, 0, 0, 8, 7, 8, 1, 1, 3, null)
				.setRotationPoint(-28, -3, 0).setRotationAngle(90, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 19, 195, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(-17, -2.75f, -7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 150, 99, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
				.setRotationPoint(-43, 2.5f, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 131, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 6, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1)
				.setRotationPoint(-12, -10, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 33, 136, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
				.setRotationPoint(-13.5f, -9, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 65, textureX, textureY).addCylinder(0, 0, 0, 4, 1, 8, 1, 1.3f, 2, null)
				.setRotationPoint(42.5f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 157, textureX, textureY).addCylinder(0, 0, 0, 3.25f, 1, 8, 0, 1, 2, null)
				.setRotationPoint(42.9f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 194, textureX, textureY).addCylinder(0, 0, 0, 1.4f, 10, 8, 1, 1, 1, null)
				.setRotationPoint(41, -17.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 172, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 1.1f, 1, 4, new Vec3f(0.0, -0.5, 0.0))
				.setRotationPoint(37, -21, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 172, textureX, textureY).addCylinder(0, 0, 0, 2, 2, 8, 1, 1.5f, 4, null)
				.setRotationPoint(37, -17, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 160, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 3, 8, 1, 1, 4, new Vec3f(0.0, -0.5, 0.0))
				.setRotationPoint(22, -18.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 145, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 1, 8, 0.75f, 1, 4, null)
				.setRotationPoint(22, -19.75f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 160, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 2, 8, 1, 1.25f, 4, null)
				.setRotationPoint(22, -16.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 177, textureX, textureY).addCylinder(0, 0, 0, 1.9f, 1, 8, 0.5f, 1, 4, new Vec3f(0.0, -0.25, 0.0))
				.setRotationPoint(22, -20.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 156, textureX, textureY).addCylinder(0, 0, 0, 3, 3, 8, 1, 1, 4, new Vec3f(0.0, -0.5, 0.0))
				.setRotationPoint(12, -19, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 156, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 8, 0.75f, 1, 4, null)
				.setRotationPoint(12, -20, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 153, textureX, textureY).addCylinder(0, 0, 0, 3, 2, 8, 1, 1.25f, 4, null)
				.setRotationPoint(12, -16.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 177, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 2, 8, 1, 1, 4, new Vec3f(0.0, -0.5, 0.0))
				.setRotationPoint(-3, -18.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 177, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 2, 8, 1, 1.5f, 4, null)
				.setRotationPoint(-3, -17, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-9, -4, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-9, -4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 126, textureX, textureY).addBox(0, 0, 0, 13, 12, 1)
				.setRotationPoint(-22, -15, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 136, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
				.setRotationPoint(-27, -15, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 176, textureX, textureY).addBox(0, 0, 0, 2, 12, 1)
				.setRotationPoint(-29, -15, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 122, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
				.setRotationPoint(-27, -4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 124, textureX, textureY).addBox(0, 0, 0, 13, 12, 1)
				.setRotationPoint(-22, -15, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 113, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
				.setRotationPoint(-27, -15, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 176, textureX, textureY).addBox(0, 0, 0, 2, 12, 1)
				.setRotationPoint(-29, -15, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 107, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
				.setRotationPoint(-27, -4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 194, textureX, textureY).addBox(0, 0, 0, 1, 9, 1)
				.setRotationPoint(-27, -3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 140, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
				.setRotationPoint(-23, -3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-22, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
				.setRotationPoint(-19, -3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, -2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, 2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, 5, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 194, textureX, textureY).addBox(0, 0, 0, 1, 9, 1)
				.setRotationPoint(-27, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 132, textureX, textureY).addBox(0, 0, 0, 4, 4, 1)
				.setRotationPoint(-23, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
				.setRotationPoint(-19, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, -2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, 2.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, 5, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-10, -17, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-10, -19, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 152, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-10, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-10, -19, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 49, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-28, -17, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 42, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 2, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0)
				.setRotationPoint(-28, -19, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 2, 5, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-28, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 40, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-28, -19, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 152, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-29, -17, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-29, -17, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-29, -19, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 152, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-29, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-29, -19, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 146, textureX, textureY).addBox(0, 0, 0, 1, 11, 7)
				.setRotationPoint(-29, -15, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 145, textureX, textureY).addBox(0, 0, 0, 1, 11, 7)
				.setRotationPoint(-29, -15, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 9, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, -3, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-26, -3, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 81, textureX, textureY).addBox(0, 0, 0, 18, 12, 1)
				.setRotationPoint(-47, -10, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 78, textureX, textureY).addBox(0, 0, 0, 18, 12, 1)
				.setRotationPoint(-47, -10, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 176, textureX, textureY).addBox(0, 0, 0, 2, 5, 1)
				.setRotationPoint(-29, -3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-30, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 175, textureX, textureY).addBox(0, 0, 0, 2, 5, 1)
				.setRotationPoint(-29, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-30, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 71, textureX, textureY).addBox(0, 0, 0, 1, 4, 20)
				.setRotationPoint(-29, -3, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 59, textureX, textureY).addBox(0, 0, 0, 1, 11, 20)
				.setRotationPoint(-47, -10, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 148, textureX, textureY).addBox(0, 0, 0, 10, 7, 1)
				.setRotationPoint(-39, -17, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 111, textureX, textureY).addBox(0, 0, 0, 10, 7, 1)
				.setRotationPoint(-39, -17, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 128, textureX, textureY).addBox(0, 0, 0, 1, 7, 12)
				.setRotationPoint(-39, -17, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 79, textureX, textureY).addBox(0, 0, 0, 8, 11, 12)
				.setRotationPoint(-46, -10, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 65, textureX, textureY).addBox(0, 0, 0, 17, 11, 4)
				.setRotationPoint(-46, -10, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 63, textureX, textureY).addBox(0, 0, 0, 17, 11, 4)
				.setRotationPoint(-46, -10, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 140, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 9, 6, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-35, -8, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 149, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 9, 3, 0, 0, 0, 0, -6, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-35, -8, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 145, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 9, 3, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-35, -8, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 12, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-38, -11, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 9, 3, 0, 0, 0, 0, 0, -4, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-35, -8, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 9, 3, 0, 0, 0, -3, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-35, -8, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 150, textureX, textureY)
				.addShapeBox(0, 0, -0.5f, 5, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-27, -14, 10.5f).setRotationAngle(0, 0, 0).setName("Door_Leftcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 150, textureX, textureY)
				.addShapeBox(0, 0, -0.5f, 5, 10, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, -14, -10.5f).setRotationAngle(0, 0, 0).setName("Door_Rightcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(46, 0.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(46, 0.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 40, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(41, 0.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
				.setRotationPoint(44.4f, -1, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -3.75f, 0, 0, -3.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 3.75f, 0, 0, 3.75f, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(43, -4, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 194, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, -1, 0, -0.25f, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(46, -0.25f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, -3.75f, -0.5f, 0, -3.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 3.75f, -0.5f, 0, 3.75f, 0, 0, 0, 0)
				.setRotationPoint(43, -4, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 194, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.25f, -1, -0.5f, -0.25f, -1, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(46, -0.25f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
				.setRotationPoint(43.2f, -2.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 194, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-50, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 194, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-51, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 194, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-52, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 194, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 78, 194, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(-51, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 194, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
				.setRotationPoint(-53, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 194, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-48, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-51, 8.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 4, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-51, 8.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, -0.75f, 0)
				.setRotationPoint(-51, 8.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 194, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 0.75f, 0, -0.25f, -1.5f, 0, -0.25f, -1.5f, 0, -0.25f, 0.75f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-49, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 194, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 1.75f, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f, 0, -0.25f, 1.75f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 194, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 2.25f, 0, -0.25f, -3, 0, -0.25f, -3, 0, -0.25f, 2.25f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 194, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 2.75f, 0, -0.25f, -3.5f, 0, -0.25f, -3.5f, 0, -0.25f, 2.75f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 193, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 3.25f, 0, -0.25f, -4, 0, -0.25f, -4, 0, -0.25f, 3.25f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 193, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 2.75f, 0, -0.25f, -3.5f, 0, -0.25f, -3.5f, 0, -0.25f, 2.75f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 193, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 2.25f, 0, -0.25f, -3, 0, -0.25f, -3, 0, -0.25f, 2.25f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 193, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 1.75f, 0, -0.25f, -2.5f, 0, -0.25f, -2.5f, 0, -0.25f, 1.75f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 193, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 1.25f, 0, -0.25f, -2, 0, -0.25f, -2, 0, -0.25f, 1.25f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 193, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 1.25f, 0, -0.25f, -2, 0, -0.25f, -2, 0, -0.25f, 1.25f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 193, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 0.75f, 0, -0.25f, -1.5f, 0, -0.25f, -1.5f, 0, -0.25f, 0.75f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 193, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, 3.25f, 0, -0.25f, -4, 0, -0.25f, -4, 0, -0.25f, 3.25f, 0, -0.25f)
				.setRotationPoint(-47.5f, 4.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 14, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-47, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
				.setRotationPoint(44.4f, -1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 149, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, -3.75f, 0, 0, -3.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 3.75f, 0, 0, 3.75f, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(43, -4, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 193, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, -1, 0, -0.25f, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(46, -0.25f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 139, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, -3.75f, -0.5f, 0, -3.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 3.75f, -0.5f, 0, 3.75f, 0, 0, 0, 0)
				.setRotationPoint(43, -4, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 192, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.25f, -1, -0.5f, -0.25f, -1, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(46, -0.25f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
				.setRotationPoint(43.2f, -2.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 192, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(45.75f, -10.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Light_Front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -0.25f, -0.5f, -2, -0.25f, -0.5f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, -2, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(43.25f, -17, -3).setRotationAngle(0, 0, 0).setName("NumberBoard_Right_Front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.25f, 0)
				.setRotationPoint(42.5f, -13.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 192, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f)
				.setRotationPoint(43.65f, -14.63f, 4.5f).setRotationAngle(0, 0, 0).setName("Marker_Left_Front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 191, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0)
				.setRotationPoint(43.4f, -14.63f, 4.75f).setRotationAngle(0, 0, 0).setName("Marker_Left_Side")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 191, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(43.4f, -14.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.25f, 0)
				.setRotationPoint(42.5f, -13.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 190, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f)
				.setRotationPoint(43.65f, -14.63f, -5.5f).setRotationAngle(0, 0, 0).setName("Marker_Right_Front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 190, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0)
				.setRotationPoint(43.4f, -14.63f, -5.75f).setRotationAngle(0, 0, 0).setName("Marker_Right_Side")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 190, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f)
				.setRotationPoint(30.75f, -19.25f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 190, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f)
				.setRotationPoint(30.75f, -19.25f, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 189, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(30.75f, -19.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 70, textureX, textureY).addBox(0, 0, 0, 7, 1, 5)
				.setRotationPoint(36, -4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 127, textureX, textureY).addBox(0, 0, 0, 2, 1, 3)
				.setRotationPoint(34, -4, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 24, textureX, textureY).addBox(0, 0, 0, 27, 1, 5)
				.setRotationPoint(7, -4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 51, textureX, textureY).addBox(0, 0, 0, 7, 1, 5)
				.setRotationPoint(36, -4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 126, textureX, textureY).addBox(0, 0, 0, 2, 1, 3)
				.setRotationPoint(34, -4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 160, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 9, 8, 1, 1, 3, null)
				.setRotationPoint(30.5f, 4.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 190, textureX, textureY).addCylinder(0, 0, -2, 1, 6, 6, 1, 1, 1, null)
				.setRotationPoint(35, -3, -6.5f).setRotationAngle(60, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 167, textureX, textureY).addCylinder(0, 0, 0, 2, 10, 8, 1, 1, 3, null)
				.setRotationPoint(30, 0, -8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 5, 4, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f, -0.5f, 0.75f, -0.1f, -0.5f, 0.75f)
				.setRotationPoint(30.5f, 0, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 99, textureX, textureY).addBox(0, 0, 0, 8, 4, 8)
				.setRotationPoint(31, -5, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 145, textureX, textureY).addBox(-6.5f, -6.5f, 0, 11, 11, 0)
				.setRotationPoint(6.5f, 5.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 141, textureX, textureY).addBox(-6.5f, -6.5f, 0, 11, 11, 0)
				.setRotationPoint(6.5f, 5.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 140, textureX, textureY).addBox(-6.5f, -6.5f, 0, 11, 11, 0)
				.setRotationPoint(-11.5f, 5.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 128, textureX, textureY).addBox(-6.5f, -6.5f, 0, 11, 11, 0)
				.setRotationPoint(-11.5f, 5.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 190, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
				.setRotationPoint(5.5f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 190, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
				.setRotationPoint(-12.5f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 189, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
				.setRotationPoint(5.5f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 189, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
				.setRotationPoint(-12.5f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 189, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
				.setRotationPoint(20.5f, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 21, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-12, 6, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 189, textureX, textureY).addCylinder(0, 0, 0, 1.25f, 2.5f, 8, 1, 1, 4, null)
				.setRotationPoint(20.5f, -6.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 189, textureX, textureY).addCylinder(0, 0, 0, 1.25f, 2.5f, 8, 1, 1, 4, null)
				.setRotationPoint(22.5f, -10, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 189, textureX, textureY).addCylinder(0, 0, 0, 1, 2.5f, 8, 1, 1, 4, null)
				.setRotationPoint(20.255f, -10, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 189, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
				.setRotationPoint(14, -9, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(13.5f, -7, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(20, -7.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 189, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(45, -4.25f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 189, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 2.75f, 0, -1.25f, -3.25f, 0, -1.25f, -3.25f, 0, 0.75f, 2.75f, 0, 0.75f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(45, -11.25f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 189, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 1.75f, 0.25f, 0, -2.25f, 0.25f, 0, -2.25f, 0.25f, -0.5f, 1.75f, 0.25f, -0.5f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f)
				.setRotationPoint(42, -15.25f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 189, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.45f, 0, -0.25f, -0.45f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(40, -16, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 166, textureX, textureY)
				.addShapeBox(0, 0, -2.4f, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(40.62f, -14.05f, 6.2f).setRotationAngle(43, 0, -28)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 189, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(45, -4.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 188, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 2.75f, 0, 0.75f, -3.25f, 0, 0.75f, -3.25f, 0, -1.25f, 2.75f, 0, -1.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(45, -11.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 188, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 1.75f, 0.25f, -0.5f, -2.25f, 0.25f, -0.5f, -2.25f, 0.25f, 0, 1.75f, 0.25f, 0, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, -1.25f, -0.25f, 0, -1.25f)
				.setRotationPoint(42, -15.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 188, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.45f, 0, -0.25f, -0.45f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(40, -16, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 165, textureX, textureY)
				.addShapeBox(0, 0, -2.7f, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(41.12f, -13.05f, -4.6f).setRotationAngle(-43, 0, -26)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(45, -3.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 188, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -3.25f, 0, -0.25f, 2.75f, 0, -0.25f, 2.75f, 0, -0.25f, -3.25f, 0, -0.25f)
				.setRotationPoint(39, -5.25f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 188, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -3.25f, 0, -0.25f, 2.75f, 0, -0.25f, 2.75f, 0, -0.25f, -3.25f, 0, -0.25f)
				.setRotationPoint(39, -5.25f, 3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 125, textureX, textureY).addCylinder(0, 0, 0, 2.75f, 1, 8, 0.5f, 1, 2, new Vec3f(0.75, 0.0, 0.0))
				.setRotationPoint(43.1f, -10, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 188, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 2.5f, 0, 0, 2.5f, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38.5f, -10, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 187, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 2.5f, 0, 0, 2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38.5f, -16, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 187, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0)
				.setRotationPoint(39.5f, -17, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38.5f, -17, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 165, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
				.setRotationPoint(37.5f, -2, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 187, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(38.5f, -4, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 187, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 2.5f, 0, 0, 2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38.5f, -10, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 187, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0)
				.setRotationPoint(39.5f, -17, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38.5f, -17, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 2.5f, 0, 0, 2.5f, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38.5f, -16, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(-22, -14.25f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 186, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
				.setRotationPoint(-23, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-22, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 186, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
				.setRotationPoint(-23, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(-28, -14.25f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(-22, -14.25f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(-28, -14.25f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-29, -16, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 186, textureX, textureY)
				.addShapeBox(0, 0, -1, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-17.5f, -16, 10.5f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 186, textureX, textureY)
				.addShapeBox(0, 0, -1, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-28.5f, -16, 10.5f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-29, -16, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 186, textureX, textureY)
				.addShapeBox(0, 0, 0.33f, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-17.5f, -16.23f, -10.75f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 186, textureX, textureY)
				.addShapeBox(0, 0, 0.33f, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-28.5f, -16.23f, -10.75f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-39, -16.5f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 59, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-39, -16.5f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 15, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-39.75f, -16.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 21, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-45.75f, -11, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-45, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-45, -11, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-44, -10.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-40, -10.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-44, -10.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-40, -10.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 185, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-45.5f, -10.5f, 4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 185, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-45.5f, -10.5f, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 185, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-46, -12, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 185, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-46, -12, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 3, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -2, -0.25f, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2, 0, -0.5f)
				.setRotationPoint(-49, -12.125f, 0).setRotationAngle(0, 0, 0).setName("NumberBoard_Left_Rear")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 3, 0, -2, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-49, -12.125f, -3).setRotationAngle(0, 0, 0).setName("NumberBoard_Right_Rear")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-48.25f, -12.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 174, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
				.setRotationPoint(-47, -13.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 174, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 2, 8, 1, 1, 2, null)
				.setRotationPoint(-47.5f, -14, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 185, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-47.75f, -14.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Light_Rear")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 19, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-47.75f, 0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 185, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-47.5f, 1, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 185, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-47.5f, 1, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 40, textureX, textureY).addBox(0, 0, 0, 1, 2, 22)
				.setRotationPoint(-47, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-48, 1.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 19, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(47.75f, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 184, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(48, 0, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 184, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(48, 0, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-47, 5.75f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 184, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, -0.25f, -0.24999999f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f)
				.setRotationPoint(-46.75f, 4, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 184, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, -0.25f, -0.24999999f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f)
				.setRotationPoint(-46.75f, 4, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 164, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-47, 5.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, -0.25f, -0.24999999f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f)
				.setRotationPoint(-46.75f, 4, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, -0.25f, -0.24999999f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f)
				.setRotationPoint(-46.75f, 4, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-48, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-47, -12, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-47, -12, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-46, -11, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.5f, -0.25f, -1.25f, 0, -0.25f, -1.25f, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-46, -12, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-47.25f, -12, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.25f, 0, -0.25f, 0.25f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, -1.25f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
				.setRotationPoint(-48.5f, -12, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-47.5f, -0.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-48, -9, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-47.5f, -0.5f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 164, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-48.25f, -1, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 164, textureX, textureY)
				.addShapeBox(1, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-49.25f, -3.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 164, textureX, textureY)
				.addShapeBox(1, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-49.25f, -6, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 164, textureX, textureY)
				.addShapeBox(1, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-49.25f, -8.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-47.5f, -9, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(-40, -15.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f)
				.setRotationPoint(-40.25f, -15.63f, -0.5f).setRotationAngle(0, 0, 0).setName("Marker_Rear")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-39.75f, -15.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-39.5f, -15, -5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(23, -5.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(25, -5.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(17.5f, -7.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(18.5f, -7.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(18.5f, -4.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(17, -7.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 139, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(10.5f, -5.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(10, -5.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(15, -5.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(18, -8, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 181, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -1.25f, -0.5f, 0, -1.25f, -0.5f, 0, 0.75f, 0, 0, 0.75f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(18, -11, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 181, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -2.25f, -0.5f, 0, -2.25f, -0.5f, 0, 1.75f, 0, 0, 1.75f)
				.setRotationPoint(18, -14, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(18, -14.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -1.25f, 0, 0, 0.75f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -1.25f, 0, -0.5f, 0.75f, 0, -0.5f, -0.25f)
				.setRotationPoint(35, -14.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 164, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(38, -14.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(39.75f, -14.5f, 4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 181, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(40, -15.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 181, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1.25f, -0.5f, 0, -1.25f, -0.5f, 0, 0.75f, 0, 0, 0.75f)
				.setRotationPoint(42, -16.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 142, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(40.5f, -15.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(41.75f, -17, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 164, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(43.25f, -12.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 164, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(43.25f, -8.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 180, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(24, -8, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 180, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -1.25f, -0.5f, 0, -1.25f, -0.5f, 0, 0.75f, 0, 0, 0.75f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(24, -11, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 180, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -2.25f, -0.5f, 0, -2.25f, -0.5f, 0, 1.75f, 0, 0, 1.75f)
				.setRotationPoint(24, -14, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 180, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(24, -15, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(23.75f, -15.5f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 180, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, -0.5f, -1.25f, -1.5f, -0.5f, -1.25f, -1.5f, 0, 0.25f, 1, 0, 0.25f, 0, 0, -3.25f, -0.5f, 0, -3.25f, -0.5f, 0, 2.75f, 0, 0, 2.75f)
				.setRotationPoint(24, -16.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(22.75f, -16.5f, 0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 141, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(24.5f, -7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.25f, 0, 3, -1.75f, 0, 3, 1.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -3.5f, -1.75f, 0, -3.5f, 1.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(26.5f, -7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(34.5f, -10.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(41.75f, -10.5f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(22, -8.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(25.5f, -4.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 180, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(31.5f, -8, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(31.25f, -8.5f, 4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 15, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-11, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 3, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 3, -0.25f, 0, -3.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -3.5f, -0.25f)
				.setRotationPoint(-28, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.25f, 0, 5, -0.25f, 0, 5, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -5.5f, -0.25f, 0, -5.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-18, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 55, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-16.5f, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 55, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-16.5f, -2.4f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 179, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(27, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 46, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-17.5f, -1.8f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 179, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(36, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 179, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(17, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 179, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(7, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 179, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-3, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 179, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-13, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-21, -9, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-21, -9, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 1.5f, 0, 0, 1.5f, 0)
				.setRotationPoint(-28, -19.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -2, 0, -0.5f, -2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 2, 0, -0.5f, 2, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-28, -18, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 1.5f, 0, -0.5f, 1.5f, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-28, -19.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2.5f, 0, 0, -2.5f, 0)
				.setRotationPoint(-30, -15, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0)
				.setRotationPoint(-30, -17, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-30, -17, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 179, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 3, 4, 1, 0.9f, 4, new Vec3f(0.0, -0.5, 0.0))
				.setRotationPoint(16.5f, -18, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 179, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, -0.25f, -0.24999999f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f)
				.setRotationPoint(16.25f, -19.75f, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 179, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.24999999f, -0.25f, -0.25f, 0.25f, -0.25f, -0.25f)
				.setRotationPoint(16.25f, -19.75f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(38, -3, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(38, -2.4f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 102, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
				.setRotationPoint(14, -5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(17.5f, -5.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-9.5f, -5.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.25f, 0, 0, -1.25f, 0, 0, 0.75f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -1.25f, 0, -0.5f, 0.75f, 0, -0.5f, -0.25f)
				.setRotationPoint(7.5f, -5.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(20, -5.5f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(15.5f, -9.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 1, 1, 0, 0, -10, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -10, -0.25f, 0, 9.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 9.5f, -0.25f)
				.setRotationPoint(-2.5f, -9.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 179, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 3.25f, -0.5f, 0, 3.25f, -0.5f, 0, -3.75f, 0, 0, -3.75f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, -0.75f, 0, 0, -0.75f)
				.setRotationPoint(32, -10, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 178, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(32, -3, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 178, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(31.75f, -10.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 178, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(26.25f, -9.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 178, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 1, 1, 0, null)
				.setRotationPoint(5.5f, 6.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f)
				.setRotationPoint(6, 6, 8).setRotationAngle(0, 0, -5.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 58, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22, 5.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 58, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22, 3.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(23, 4, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(25, 4.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 178, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(23.75f, 5, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(24.25f, 6.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 177, textureX, textureY)
				.addShapeBox(0, 0.25f, 0, 1, 7, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(27.25f, -0.25f, 8.5f).setRotationAngle(0, 0, -12)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(27.25f, -0.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 178, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 6, 1, 1, 0, new Vec3f(0.0, 0.0, -0.3))
				.setRotationPoint(29, 6.75f, 8.65f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 176, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 6, 1, 1, 0, new Vec3f(0.0, 0.0, -0.3))
				.setRotationPoint(24, 6.75f, 8.65f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(16.5f, -1.25f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 42, textureX, textureY).addBox(0, 0, 0, 2, 2, 20)
				.setRotationPoint(15, -1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 176, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(15.75f, -1.75f, 8.5f).setRotationAngle(0, 0, -30)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 120, textureX, textureY).addCylinder(0, 0, 0, 7, 15, 8, 1, 1, 2, new Vec3f(0.0, 0.0, -3.0))
				.setRotationPoint(-9, -7, 0).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 14, textureX, textureY).addBox(0, 0, 0, 50, 1, 1)
				.setRotationPoint(-18, 5, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 12, textureX, textureY).addBox(0, 0, 0, 50, 1, 1)
				.setRotationPoint(-18, 5, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 9, textureX, textureY).addBox(0, 0, 0, 50, 1, 1)
				.setRotationPoint(-18, 1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 6, textureX, textureY).addBox(0, 0, 0, 50, 1, 1)
				.setRotationPoint(-18, 1, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 173, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-18, 2, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 172, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-18, 2, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 170, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-18, 4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 169, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-18, 4, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 167, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-6, 2, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 167, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-6, 2, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 165, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-6, 4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 165, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-6, 4, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 165, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(6, 2, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 164, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(6, 2, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 164, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(6, 4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 164, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(6, 4, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 162, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(17, 2, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 159, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(17, 2, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 140, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(17, 4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 139, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(17, 4, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 134, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(29, 2, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 119, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(29, 2, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 112, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(29, 4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 100, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(29, 4, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 98, textureX, textureY).addCylinder(0, 0, 0, 8, 2, 8, 1, 0.8f, 3, null)
				.setRotationPoint(-21, -3, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 59, textureX, textureY).addBox(0, 0, 0, 7, 1, 1)
				.setRotationPoint(-24, 0.25f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 94, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-24, 0.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-16.5f, 0.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 158, textureX, textureY).addCylinder(0, 0, 0, 0.7f, 1.3f, 6, 1, 1, 0, null)
				.setRotationPoint(24, 4.7f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 42, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(5.25f, 5, 8.5f).setRotationAngle(0, 0, -13)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 157, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(4.5f, 5, 8.5f).setRotationAngle(0, 0, -18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 152, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 6, 1, 1, 0, new Vec3f(0.0, 0.0, -0.3))
				.setRotationPoint(15, 3, 8.65f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(14.85f, 2.75f, 8.5f).setRotationAngle(0, 0, -35)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 173, textureX, textureY).addBox(0, 0, 0, 2, 4, 1)
				.setRotationPoint(-18, -3, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 173, textureX, textureY).addBox(0, 0, 0, 2, 4, 1)
				.setRotationPoint(-18, -3, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 173, textureX, textureY).addBox(0, 0, 0, 2, 4, 1)
				.setRotationPoint(29, -3, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 99, textureX, textureY).addBox(0, 0, 0, 2, 4, 1)
				.setRotationPoint(29, -3, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 88, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(27, -0.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 152, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 1, 1, 0, null)
				.setRotationPoint(5.5f, 6.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 1, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(6, 6, -9).setRotationAngle(0, 0, -5.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22, 5.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22, 3.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(23, 4, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(25, 4.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 152, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(23.75f, 5, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(24.25f, 6.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 144, textureX, textureY)
				.addShapeBox(0, 0.25f, 0, 1, 7, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(27.25f, -0.25f, -9.5f).setRotationAngle(0, 0, -12)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 34, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(27.25f, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 140, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 6, 1, 1, 0, new Vec3f(0.0, 0.0, -0.3))
				.setRotationPoint(29, 6.75f, -9.35f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 114, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 6, 1, 1, 0, new Vec3f(0.0, 0.0, -0.3))
				.setRotationPoint(24, 6.75f, -9.35f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(16.5f, -1.25f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 140, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(15.75f, -1.75f, -9.5f).setRotationAngle(0, 0, -30)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 113, textureX, textureY).addCylinder(0, 0, 0, 0.7f, 1.3f, 6, 1, 1, 0, null)
				.setRotationPoint(24, 4.7f, -9.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 34, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(5.25f, 5, -9.5f).setRotationAngle(0, 0, -13)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(4.5f, 5, -9.5f).setRotationAngle(0, 0, -18)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 106, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 6, 1, 1, 0, new Vec3f(0.0, 0.0, -0.3))
				.setRotationPoint(15, 3, -9.35f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(14.85f, 2.75f, -9.5f).setRotationAngle(0, 0, -35)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(34.5f, 4.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(-39, 2.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(-45, 2.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-42.5f, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-40.5f, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 24, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
				.setRotationPoint(-39, 2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(-35, 2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(-41, 2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-38.5f, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-36.5f, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-37, 5, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-46, 2, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0)
				.setRotationPoint(-38, 2, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-38, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 117, textureX, textureY).addCylinder(0, 0, 0, 7, 2, 8, 1, 1, 2, null)
				.setRotationPoint(-12, -10, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 114, textureX, textureY).addCylinder(0, 0, 0, 7, 1, 8, 1, 0.9f, 2, null)
				.setRotationPoint(-13, -10, 0).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 14, 0, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, 0.3f, 0, 0, 1, 0, 0, 1, 0, 0, 0.3f)
				.setRotationPoint(-13, -10, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-13.5f, -10, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-13.5f, -8, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 34, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-14, -9, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 109, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(-20, -7, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 59, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
				.setRotationPoint(-21.5f, -8, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 79, textureX, textureY).addBox(0, 0, 0, 1, 4, 4)
				.setRotationPoint(-21.5f, -12, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 109, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(-20, -7, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 34, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
				.setRotationPoint(-21.5f, -8, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY).addBox(0, 0, 0, 1, 4, 4)
				.setRotationPoint(-21.5f, -12, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 104, textureX, textureY).addCylinder(0, 0, 0, 0.70000005f, 1, 6, 0, 1, 3, null)
				.setRotationPoint(-13.15f, -11, 3.5f).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 34, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f)
				.setRotationPoint(-12.66f, -10.95f, 3.5f).setRotationAngle(44, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 103, textureX, textureY).addCylinder(0, 0, 0, 0.70000005f, 1, 6, 0, 1, 3, null)
				.setRotationPoint(-13.15f, -10.5f, 5.25f).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 31, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f)
				.setRotationPoint(-12.66f, -10.45f, 5.25f).setRotationAngle(-44, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-15.6f, -13.25f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 65, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, -1, 1, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
				.setRotationPoint(-15.25f, -12.75f, -0.25f).setRotationAngle(-8, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 208, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-9.25f, -16, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 208, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(-9.25f, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 219, textureX, textureY).newCylinderBuilder()
				.setPosition(0, 0, 0).setRadius(1.5f, 1.35f).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(0.75, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(45.75f, -10.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 204, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -1.1f, 0, -0.1f, -1.1f, 0, -1.1f, -0.1f, 0, -1.1f, -0.1f, 0, -1.1f, -1.1f, 0, -1.1f, -1.1f)
				.setRotationPoint(45.75f, -11.25f, -1).setRotationAngle(0, 0, 0).setName("Light_Frontcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 217, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -1.1f, 0, -0.1f, -1.1f, 0, -1.1f, -0.1f, 0, -1.1f, -0.1f, 0, -1.1f, -1.1f, 0, -1.1f, -1.1f)
				.setRotationPoint(-47.75f, -15, -1).setRotationAngle(0, 0, 0).setName("Light_Frontcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 219, textureX, textureY).newCylinderBuilder()
				.setPosition(0, 0, 0).setRadius(1.5f, 1.35f).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(0.75, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(-48.5f, -14, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_U1Fcb(){
		TurboList U1Fcb = new TurboList("U1Fcb");
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 52, 91, textureX, textureY).addBox(0, 0, 0, 1, 4, 16)
				.setRotationPoint(47, 2.75f, -8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 111, 56, textureX, textureY).addBox(0, 0, 0, 2, 2, 19)
				.setRotationPoint(46, 0.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 250, 31, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(50, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 62, 96, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(51, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 48, 86, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(52, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 48, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(51, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 152, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 16, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(53, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 24, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
				.setRotationPoint(51, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 193, 126, textureX, textureY).addBox(0, 0, 0, 1, 2, 12)
				.setRotationPoint(47, 6.75f, -6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 17, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(48, 8.5f, -6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 20, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(49, 8.5f, -3).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 214, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -3, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(49, 8.5f, -6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 116, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(49, 8.5f, 3).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 193, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(48, 6.5f, -8).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 92, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(48, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 56, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -1.5f, 0, -0.25f, 0.75f, 0, -0.25f, 0.75f, 0, -0.25f, -1.5f, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, -6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 152, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(48, 3, -1).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 47, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -2.5f, 0, -0.25f, 1.75f, 0, -0.25f, 1.75f, 0, -0.25f, -2.5f, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, -4).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 129, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -3, 0, -0.25f, 2.25f, 0, -0.25f, 2.25f, 0, -0.25f, -3, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, -3).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 235, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -3.5f, 0, -0.25f, 2.75f, 0, -0.25f, 2.75f, 0, -0.25f, -3.5f, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, -2).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 71, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -4, 0, -0.25f, 3.25f, 0, -0.25f, 3.25f, 0, -0.25f, -4, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, -1).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 71, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -3.5f, 0, -0.25f, 2.75f, 0, -0.25f, 2.75f, 0, -0.25f, -3.5f, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, 1).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 142, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -3, 0, -0.25f, 2.25f, 0, -0.25f, 2.25f, 0, -0.25f, -3, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, 2).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 250, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -2.5f, 0, -0.25f, 1.75f, 0, -0.25f, 1.75f, 0, -0.25f, -2.5f, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, 3).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 241, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -2, 0, -0.25f, 1.25f, 0, -0.25f, 1.25f, 0, -0.25f, -2, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, -5).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 240, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -2, 0, -0.25f, 1.25f, 0, -0.25f, 1.25f, 0, -0.25f, -2, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, 4).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 68, 68, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -1.5f, 0, -0.25f, 0.75f, 0, -0.25f, 0.75f, 0, -0.25f, -1.5f, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, 5).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -4, 0, -0.25f, 3.25f, 0, -0.25f, 3.25f, 0, -0.25f, -4, 0, -0.25f)
				.setRotationPoint(47.5f, 4.5f, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 44, 51, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1.25f, 6, 1, 1.25f, 4, null)
				.setRotationPoint(31.25f, -18.75f, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 117, 158, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 9, 8, 1, 1, 3, null)
				.setRotationPoint(30.5f, 4.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 48, 77, textureX, textureY).addCylinder(0, 0, -4, 1, 6, 6, 1, 1, 1, null)
				.setRotationPoint(35, -3, 6.5f).setRotationAngle(-60, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 24, 51, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1, 6, 0.55f, 1, 4, new Vec3f(0.0, -0.75, 0.0))
				.setRotationPoint(31.25f, -19, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 180, 49, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.85f, 1.2f, 4, new Vec3f(0.0, -0.5, 0.0))
				.setRotationPoint(31.25f, -17.65f, 0).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 143, 162, textureX, textureY).addCylinder(0, 0, 0, 2, 10, 8, 1, 1, 3, null)
				.setRotationPoint(30, 0, 8.75f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 142, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 5, 4, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f, 0.75f, -0.1f, -0.5f, 0.75f, -0.1f, -0.5f, 0.25f, -0.1f, -0.5f, 0.25f)
				.setRotationPoint(30.5f, 0, 6.75f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 22, 77, textureX, textureY).addBox(-6.5f, -6.5f, 0, 11, 11, 0)
				.setRotationPoint(21.5f, 5.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 163, 46, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
				.setRotationPoint(20.5f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 59, 21, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f)
				.setRotationPoint(-12, 6, 6).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 232, 40, textureX, textureY).addBox(-6.5f, -6.5f, 0, 11, 11, 0)
				.setRotationPoint(21.5f, 5.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 49, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-9, -16, -6.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 103, 15, textureX, textureY)
				.addShapeBox(0, 0, 0, 49, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-9, -16, 5.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 134, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(32.5f, -16, -5.75f).setRotationAngle(-43, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 128, 159, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(24.5f, -16, -5.75f).setRotationAngle(-43, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 99, 157, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(16.5f, -16, -5.75f).setRotationAngle(-43, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 53, 152, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(8.5f, -16, -5.75f).setRotationAngle(-43, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 118, 140, textureX, textureY)
				.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(32.5f, -16, 5.75f).setRotationAngle(43, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 126, 137, textureX, textureY)
				.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(24.5f, -16, 5.75f).setRotationAngle(43, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 247, 89, textureX, textureY)
				.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(16.5f, -16, 5.75f).setRotationAngle(43, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 198, 60, textureX, textureY)
				.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(8.5f, -16, 5.75f).setRotationAngle(43, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 43, 42, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 3, 6, 1, 1, 1, null)
				.setRotationPoint(1, -17.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 151, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(0, -17.5f, -1).setRotationAngle(0, 1, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 235, 31, textureX, textureY)
				.addShapeBox(-1, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(1, -18, -0.5f).setRotationAngle(0, 0, 45)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 42, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 2, 4, 0.5f, 0.5f, 4, null)
				.setRotationPoint(16.5f, -19.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 223, 40, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1.5f, 4, 1, 1, 4, new Vec3f(0.0, -0.5, 0.0))
				.setRotationPoint(16.5f, -19.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 77, 65, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 1, null)
				.setRotationPoint(-13, -6, -10).setRotationAngle(0, 0, -90)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 246, 140, textureX, textureY).addBox(0, 0, 0, 1, 7, 3)
				.setRotationPoint(-13.5f, -11, -7).setRotationAngle(0, -27, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 180, 40, textureX, textureY).addBox(-0.5f, 0.5f, 0.5f, 1, 3, 1)
				.setRotationPoint(-13.5f, -11, -7).setRotationAngle(0, -27, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 59, 31, textureX, textureY)
				.addShapeBox(-1.5f, 0.5f, 0.5f, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-13.5f, -11, -7).setRotationAngle(0, -27, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 250, 28, textureX, textureY)
				.addShapeBox(-2, 2.5f, 1, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-13.5f, -11, -7).setRotationAngle(0, 1, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 235, 28, textureX, textureY)
				.addShapeBox(-1.5f, 2.5f, 0.5f, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-13.5f, -11, -7).setRotationAngle(0, -27, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 59, 24, textureX, textureY).addBox(-0.5f, 1.5f, 1.5f, 1, 2, 1)
				.setRotationPoint(-13.5f, -11, -7).setRotationAngle(0, -27, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 112, 35, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
				.setRotationPoint(-14, -6, -10).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 250, 21, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(-14, -8, -10).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 222, 49, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 1, null)
				.setRotationPoint(-14, -14.5f, -10).setRotationAngle(0, 0, 90)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 119, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-15.5f, -15.5f, -10).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 20, textureX, textureY)
				.addShapeBox(0, 0.5f, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(-14.25f, -13.5f, -10).setRotationAngle(0, 0, -23)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 250, 18, textureX, textureY)
				.addShapeBox(0, 1.5f, 0.75f, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-14.25f, -13.5f, -10).setRotationAngle(0, 0, -23)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 13, 34, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-14.6f, -15.5f, 0.75f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 112, 31, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, -1, 1, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
				.setRotationPoint(-14.25f, -15, 1.25f).setRotationAngle(-34, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 189, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-14.6f, -14.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 72, 31, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, -1, 1, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
				.setRotationPoint(-14.25f, -14.25f, -1).setRotationAngle(20, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 249, 15, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-15.6f, -13.25f, 2.25f).setRotationAngle(0, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 13, 20, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, -1, 1, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
				.setRotationPoint(-15.25f, -12.75f, 2.75f).setRotationAngle(8, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 235, 18, textureX, textureY).addCylinder(0, 0, 0, 0.70000005f, 1, 6, 0, 1, 3, null)
				.setRotationPoint(-13.15f, -11, -4).setRotationAngle(-90, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 251, 0, textureX, textureY).addCylinder(0, 0, 0, 0.90000004f, 1, 6, 0, 1, 3, null)
				.setRotationPoint(-13.15f, -12.25f, -3).setRotationAngle(-90, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 193, 21, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f)
				.setRotationPoint(-12.66f, -12.25f, -3).setRotationAngle(-20, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 253, 12, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f)
				.setRotationPoint(-12.66f, -10.95f, -4).setRotationAngle(-34, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 7, 0, textureX, textureY).addCylinder(0, 0, 0, 0.70000005f, 1, 6, 0, 1, 3, null)
				.setRotationPoint(-13.15f, -12, 4.5f).setRotationAngle(-90, 0, 0)
		);
		U1Fcb.add(new ModelRendererTurbo(U1Fcb, 0, 0, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f)
				.setRotationPoint(-12.66f, -11.95f, 4.5f).setRotationAngle(44, 0, 0)
		);
		this.groups.add(U1Fcb);
	}

}

