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
public class U_1_F extends RollingStockModel {

	public U_1_F(){
		super(); textureX = 256; textureY = 256;
		this.addToCreators("Unregistered Account");
		//
		initGroup_group0();
		initGroup_clipboard0();
		initGroup_clipboard1();
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 103, 138, textureX, textureY).addCylinder(0, 0, 0, 7, 94, 8, 1, 1, 2, null)
			.setRotationPoint(-37, -12, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 17, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 14, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -5, 0, 0, 5, 0, 0, 5, 0, 0, -5, 0, 0)
			.setRotationPoint(53, -10.5f, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 89, 2, 5, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-36, -10.5f, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 219, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(54, -7.75f, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 98, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(57, 0.5f, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 155, 124, textureX, textureY).addBox(0, 0, 0, 4, 5, 11)
			.setRotationPoint(56, -4.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 49, 119, textureX, textureY).addBox(0, 0, 0, 2, 6, 16)
			.setRotationPoint(59, 0.75f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 191, textureX, textureY).addCylinder(0, 0, 0, 2, 3, 6, 1, 1, 4, null)
			.setRotationPoint(48, -21, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 196, 224, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1.25f, 6, 1, 1.25f, 4, null)
			.setRotationPoint(58.25f, -20.1f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 70, 120, textureX, textureY).addBox(0, 0, 0, 13, 4, 4)
			.setRotationPoint(3, -21.5f, -2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 170, textureX, textureY).addBox(0, 0, 0, 10, 14, 1)
			.setRotationPoint(-47, -17, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 190, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -3, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 80, 197, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 2, 8, 1, 1, 4, null)
			.setRotationPoint(-7, -21, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 191, 224, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 3, 6, 1, 1, 1, null)
			.setRotationPoint(-22, -19.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 92, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-23, -19.5f, -1).setRotationAngle(0, 1, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 80, 162, textureX, textureY).addBox(0, 0, 0, 1, 4, 10)
			.setRotationPoint(-39, -20, -5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 4, 224, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(33, -19.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 85, 224, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 4, 1, 0.75f, 4, new Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(41.5f, -19.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 143, 178, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 9, 8, 1, 1, 3, null)
			.setRotationPoint(43.5f, 2, 8.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 186, 223, textureX, textureY).addCylinder(0, 0, -4, 1, 6, 6, 1, 1, 1, null)
			.setRotationPoint(48, -5, 6.5f).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 161, 223, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(31.5f, 5.5f, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 189, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f)
			.setRotationPoint(5, 5, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 25, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(37, 1, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 229, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31, -0.25f, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 156, 223, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(42, -3, 9.75f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 187, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.75f)
			.setRotationPoint(-36, -12, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 63, 197, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 25, 6, 1, 1, 2, null)
			.setRotationPoint(8, -8, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 160, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 7, 4, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, -2.05f, 0.95f, 0, -2.05f, 0.95f, 0, 0, 0, 0, 1, 0,
				new boolean[]{ false, false, false, false, true, false })
			.setRotationPoint(-14, -12, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 125, 44, textureX, textureY).addBox(0, 0, 0, 51, 1, 6)
			.setRotationPoint(-15, -3, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 239, 115, textureX, textureY).addBox(0, 0, 0, 5, 5, 3)
			.setRotationPoint(-5, -9, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 57, 223, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 4, null)
			.setRotationPoint(-1, -4, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 88, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, -0.75f, -1)
			.setRotationPoint(-35, -10.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 203, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 12, 10, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, -4, -5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 16, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(47, -14, 5.25f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 41, 223, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(60.25f, -12.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Light_Front")
		);
		group0.add(new ModelRendererTurbo(group0, 239, 222, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-45.5f, -7, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 16, 197, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 1, null)
			.setRotationPoint(-40, -7, -10).setRotationAngle(0, 0, -90)
		);
		group0.add(new ModelRendererTurbo(group0, 230, 222, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-43, -20.5f, 2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 225, 222, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-40, -16, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 132, 178, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(-41, -9, -2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 127, 76, textureX, textureY).addBox(0, 0, 0, 6, 2, 3)
			.setRotationPoint(-53, 1, -1.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
	}

	private final void initGroup_clipboard0(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 189, textureX, textureY).addCylinder(0, 0, 0, 2.125f, 4, 8, 1, 3, 2, null)
			.setRotationPoint(57, -12, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 196, textureX, textureY).addCylinder(0, 0, 0, 1.875f, 5, 8, 1, 1, 2, null)
			.setRotationPoint(56.125f, -12, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 189, textureX, textureY).newCylinderBuilder()
			.setPosition(0, 0, 0).setRadius(2, 1.75f).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(2)
			.setRadialTexture(0, 0).setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
			.setRotationPoint(60.25f, -12, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 196, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 2, null)
			.setRotationPoint(60.25f, -12, 0).setRotationAngle(0, 0, 0).setName("thing")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 4, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -1, -0.25f, -0.25f, -5, 0, 0, 5, 0, 0, 5, 0, -0.25f, -5, 0, -0.25f)
			.setRotationPoint(52, -10.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(55.5f, -4.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(56.75f, -1.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(60, 0.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(60, 0.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(60, 0.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(61, 0.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(61, 0.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(61, 0.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 136, textureX, textureY).addBox(0, 0, 0, 3, 1, 11)
			.setRotationPoint(56, -5.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 189, textureX, textureY)
			.addBox(0, 0, 0, 3, 5, 1, 0, 1f, new boolean[]{ false, false, true, false, false, false })
			.setRotationPoint(56, -4.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 189, textureX, textureY).addBox(0, 0, 0, 3, 5, 1)
			.setRotationPoint(56, -4.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -4.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -4.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -5.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56, -5.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(56, -5.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -5.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -5.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-31, -10.5f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 9, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f, -3.5f, 0, 0, 3, 0, 0, 3, 0, -0.75f, -3.5f, 0, -0.75f)
			.setRotationPoint(53.5f, -8.5f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(53, -9.5f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 196, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(53, -10.5f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 222, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(55, -9.5f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -2.68f, 0, 0, 2.68f, 0, 0, 2.68f, 0, -0.75f, -2.68f, 0, -0.75f)
			.setRotationPoint(55, -8.5f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.41f, 0, 0, -0.59f, 0, 0, -0.59f, 0, -0.75f, -0.41f, 0, -0.75f)
			.setRotationPoint(57.68f, -1.5f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 196, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(60, 0.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 196, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(60, 0.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 221, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(63, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 221, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(64, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 221, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(65, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 221, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(64, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(66, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(64, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, 0, -1, -0.75f, 0, -1, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(61, 2, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(61, 2, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(59.25f, -4.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Numberplate")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(59.25f, -4.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(59.25f, -4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 89, 2, 5, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36, -10.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(54, -7.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 4, 0, -1, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -1, -0.25f, 0, -5, 0, -0.25f, 5, 0, -0.25f, 5, 0, 0, -5, 0, 0)
			.setRotationPoint(52, -10.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(55.5f, -4.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(56.75f, -1.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 3, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31, -10.5f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 9, 1, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, -3.5f, 0, -0.75f, 3, 0, -0.75f, 3, 0, 0, -3.5f, 0, 0)
			.setRotationPoint(53.5f, -8.5f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 195, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(53, -9.5f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, 0, -1, -0.75f, 0, -1, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -10.5f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55, -9.5f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -2.68f, 0, -0.75f, 2.68f, 0, -0.75f, 2.68f, 0, 0, -2.68f, 0, 0)
			.setRotationPoint(55, -8.5f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.41f, 0, -0.75f, -0.59f, 0, -0.75f, -0.59f, 0, 0, -0.41f, 0, 0)
			.setRotationPoint(57.68f, -1.5f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 132, textureX, textureY).addBox(0, 0, 0, 2, 2, 12)
			.setRotationPoint(59, 6.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(61, 8.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(62, 8.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -3, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(62, 8.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -3, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(62, 8.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 189, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 6, 1.25f, 0.5f, 4, null)
			.setRotationPoint(48, -21.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 189, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 6, 1.25f, 1, 5, new Vec3f(0.0, 0.5, 0.0))
			.setRotationPoint(48, -22.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(57.25f, -12.75f, -4.75f).setRotationAngle(0, 43, 0).setName("Numberboard_Right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(60, -12.75f, 1.75f).setRotationAngle(0, -43, 0).setName("Numberboard_Left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(61, 6.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(61, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(59.5f, -6.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 2.25f, 0, -0.25f, -2.75f, 0, -0.25f, -2.75f, 0, -0.25f, 2.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(59.5f, -10.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 220, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(57, -14.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.6f, -0.25f, -0.25f, -0.6f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(57, -15.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-28.75f, -17, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 1.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 1.5f, -0.25f, 0, -2, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -2, -0.25f)
			.setRotationPoint(55.25f, -15.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(58.75f, -0.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 13, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(59.5f, -5, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(56.25f, -12.25f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(59.5f, -6.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 2.25f, 0, -0.25f, -2.75f, 0, -0.25f, -2.75f, 0, -0.25f, 2.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(59.5f, -10.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(57, -14.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, -0.6f, -0.25f, -0.25f, -0.6f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(57, -15.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-28.75f, -17, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 194, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 1.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 1.5f, -0.25f, 0, -2, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -2, -0.25f)
			.setRotationPoint(55.25f, -15.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.75f)
			.setRotationPoint(58.75f, -0.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 219, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(56.25f, -12.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.35f, -0.65f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.35f, -0.65f, 0)
			.setRotationPoint(57.5f, -20.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 219, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1, 6, 0.5f, 1, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(58.25f, -20.35f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 219, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 0.85f, 1.25f, 4, new Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(58.25f, -19, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 218, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f)
			.setRotationPoint(55.5f, -18.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(55.7f, -18.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Markerlight_Right_Front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(55.5f, -18.5f, -4.7f).setRotationAngle(0, 0, 0).setName("Markerlight_Right_Side")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 217, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f)
			.setRotationPoint(55.5f, -18.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(55.7f, -18.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Markerlight_Left_Front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f)
			.setRotationPoint(55.5f, -18.5f, 3.7f).setRotationAngle(0, 0, 0).setName("Markerlight_Left_Side")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 216, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -1.5f, 0, -0.25f, 0.75f, 0, -0.25f, 0.75f, 0, -0.25f, -1.5f, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 188, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(61, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -2, 0, -0.25f, 1.25f, 0, -0.25f, 1.25f, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -2.5f, 0, -0.25f, 1.75f, 0, -0.25f, 1.75f, 0, -0.25f, -2.5f, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 215, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -3, 0, -0.25f, 2.25f, 0, -0.25f, 2.25f, 0, -0.25f, -3, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -3.5f, 0, -0.25f, 2.75f, 0, -0.25f, 2.75f, 0, -0.25f, -3.5f, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -4, 0, -0.25f, 3.25f, 0, -0.25f, 3.25f, 0, -0.25f, -4, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -3.5f, 0, -0.25f, 2.75f, 0, -0.25f, 2.75f, 0, -0.25f, -3.5f, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -3, 0, -0.25f, 2.25f, 0, -0.25f, 2.25f, 0, -0.25f, -3, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -2.5f, 0, -0.25f, 1.75f, 0, -0.25f, 1.75f, 0, -0.25f, -2.5f, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -2, 0, -0.25f, 1.25f, 0, -0.25f, 1.25f, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -2, 0, -0.25f, 1.25f, 0, -0.25f, 1.25f, 0, -0.25f, -2, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -1.5f, 0, -0.25f, 0.75f, 0, -0.25f, 0.75f, 0, -0.25f, -1.5f, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 214, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.125f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.125f, 0, -0.25f, -4, 0, -0.25f, 3.25f, 0, -0.25f, 3.25f, 0, -0.25f, -4, 0, -0.25f)
			.setRotationPoint(60.5f, 4.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(3, -21.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 4, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, -21.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(16, -21.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 1, -1, 0, 0, 0)
			.setRotationPoint(16, -21.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(16, -21.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1)
			.setRotationPoint(2, -21.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 213, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(2, -21.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(2, -21.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(53.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(45.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(37.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(29.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(21.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(13.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(5.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-2.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-10.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-18.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-26.5f, -17, -6.25f).setRotationAngle(-43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 184, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(53.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 184, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(45.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 184, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(37.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 184, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(29.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 183, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(21.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 183, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(13.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 183, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(5.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 182, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-2.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 180, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-10.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 166, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-18.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 165, textureX, textureY)
			.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-26.5f, -17, 6.25f).setRotationAngle(43, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 143, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-50, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 213, textureX, textureY).addBox(0, 0, 0, 1, 18, 1)
			.setRotationPoint(-51, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 182, textureX, textureY).addBox(0, 0, 0, 3, 12, 1)
			.setRotationPoint(-50, -16, -11).setRotationAngle(0, 0, 0).setName("Door_Right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.15f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.15f, 0, 0, 1, 2.5f, -0.75f, -1.1f, 2.5f, -0.75f, -1.1f, 2.5f, 0, 1, 2.5f, 0)
			.setRotationPoint(-36, -10.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.15f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.15f, 0, 0, 1, 2.5f, -0.75f, -1.1f, 2.5f, -0.75f, -1.1f, 2.5f, 0, 1, 2.5f, 0)
			.setRotationPoint(-32, -10.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.75f, 0.15f, 0, -0.75f, 0.15f, 0, 0, 0, 0, 0, 0.22f, 0.5f, -0.75f, -0.085f, 0.5f, -0.75f, -0.085f, 0.5f, 0, 0.22f, 0.5f, 0)
			.setRotationPoint(-35, -10.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, 0, 0, -0.64f, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.64f, -0.5f, 0)
			.setRotationPoint(-32, -10.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.06f, 0, -0.75f, 0.19f, 0, -0.75f, 0.19f, 0, 0, -0.06f, 0, 0, 0.16f, 0.5f, -0.75f, -0.04f, 0.5f, -0.75f, -0.04f, 0.5f, 0, 0.16f, 0.5f, 0)
			.setRotationPoint(-35.46f, -7.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.12f, 0.5f, -0.75f, 0.23f, 0.5f, -0.75f, 0.23f, 0.5f, 0, -0.12f, 0.5f, 0, 0.1f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.1f, 0, 0)
			.setRotationPoint(-36, -4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0, -2, 0, 0, 1, 0, 0)
			.setRotationPoint(-37, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 116, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-50, -4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 212, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-47, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 212, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-46, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 185, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-45, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-51, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 211, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-47, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -2.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -0.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, 1.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, 3.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 162, textureX, textureY).addBox(0, 0, 0, 10, 14, 1)
			.setRotationPoint(-47, -17, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 193, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 94, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-50, -17, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 211, textureX, textureY).addBox(0, 0, 0, 1, 18, 1)
			.setRotationPoint(-51, -17, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 181, textureX, textureY).addBox(0, 0, 0, 3, 12, 1)
			.setRotationPoint(-50, -16, 10).setRotationAngle(0, 0, 0).setName("Door_Left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 92, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-50, -4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 211, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(-47, -3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 211, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-46, -3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-45, -3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-51, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-47, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -0.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, 1.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, 3.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -1, 0, 0.15f, -1, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -18, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 3, 0, 0, -2, 0, 0.15f, -2, 0, 0.15f, 0, 0, 0, 0, 0, 0, 1, 0, 0.15f, 1, 0, 0.15f, -1, 0, 0, -1, 0)
			.setRotationPoint(-51, -20, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 4, 0, 0, -1, 0, 0.15f, -1, 0, 0.15f, 0, 0, 0, 0, 0, 0, 1, 0, 0.15f, 1, 0, 0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 22, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 6, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -21, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 2, 3, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, -2, 0, 0, -2, 0, 0, -1, 0, 0.15f, -1, 0, 0.15f, 1, 0, 0, 1, 0)
			.setRotationPoint(-51, -20, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 4, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, -1, 0, 0, -1, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 1, 0, 0, 1, 0)
			.setRotationPoint(-51, -21, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, -1, 0, 0, -1, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -18, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -2, 0, 0.15f, -2, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -19, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, -1, 0, 0.15f, -1, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -20, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, -2, 0, 0, -2, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -19, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, -1, 0, 0, -1, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -20, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -20, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 14, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -19, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -4, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-50.75f, -16.5f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-47.25f, -16.5f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-50.75f, -16.5f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-47.25f, -16.5f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-50.75f, -17, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.5f, 0, 0, -5.25f, 0, 0, 4.75f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -5.25f, 0, -0.5f, 4.75f, 0, -0.5f, 0)
			.setRotationPoint(-33.75f, -17, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-50.75f, -17, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 4.75f, 0, 0, -5.25f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 4.75f, 0, -0.5f, -5.25f, 0, -0.5f, -0.5f)
			.setRotationPoint(-33.75f, -17, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 157, textureX, textureY).addBox(-6.5f, -6.5f, 0, 13, 13, 0)
			.setRotationPoint(31.5f, 3.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 7, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -9, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(-40, -2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, -8, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 5, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0, 0)
			.setRotationPoint(-17, -5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 58, textureX, textureY)
			.addShapeBox(-3, 0, 0, 3, 1, 1, 0, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.75f)
			.setRotationPoint(57.5f, -20.75f, -0.75f).setRotationAngle(0, 0, -45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 58, textureX, textureY)
			.addShapeBox(-3, 0, 0, 3, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(57.5f, -20.75f, -0.25f).setRotationAngle(0, 0, -45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 156, textureX, textureY).addBox(-6.5f, -6.5f, 0, 13, 13, 0)
			.setRotationPoint(17.5f, 3.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 149, textureX, textureY).addBox(-6.5f, -6.5f, 0, 13, 13, 0)
			.setRotationPoint(3.5f, 3.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 148, textureX, textureY).addBox(-6.5f, -6.5f, 0, 13, 13, 0)
			.setRotationPoint(-10.5f, 3.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 147, textureX, textureY).addBox(-6.5f, -6.5f, 0, 13, 13, 0)
			.setRotationPoint(31.5f, 3.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 146, textureX, textureY).addBox(-6.5f, -6.5f, 0, 13, 13, 0)
			.setRotationPoint(17.5f, 3.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 146, textureX, textureY).addBox(-6.5f, -6.5f, 0, 13, 13, 0)
			.setRotationPoint(3.5f, 3.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 143, textureX, textureY).addBox(-6.5f, -6.5f, 0, 13, 13, 0)
			.setRotationPoint(-10.5f, 3.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 193, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1.5f, 4, null)
			.setRotationPoint(-7, -19, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 191, textureX, textureY)
			.addShapeBox(-1, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-22, -20, -0.5f).setRotationAngle(0, 0, 45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 165, textureX, textureY).addBox(0, 0, 0, 1, 13, 6)
			.setRotationPoint(-51, -17, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 163, textureX, textureY).addBox(0, 0, 0, 1, 13, 6)
			.setRotationPoint(-51, -17, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -19, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -19, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -20, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -20, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 122, textureX, textureY).addBox(0, 0, 0, 1, 2, 14)
			.setRotationPoint(-51, -19, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 96, textureX, textureY).addBox(0, 0, 0, 1, 1, 6)
			.setRotationPoint(-51, -20, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY).addBox(0, 0, 0, 1, 2, 8)
			.setRotationPoint(-51, -17, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 210, textureX, textureY).addBox(0, 0, 0, 1, 13, 1)
			.setRotationPoint(-52, -15, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 122, textureX, textureY).addBox(0, 0, 0, 1, 3, 5)
			.setRotationPoint(-51, -3, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 109, textureX, textureY).addBox(0, 0, 0, 1, 3, 5)
			.setRotationPoint(-51, -3, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -2, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3)
			.setRotationPoint(-51, -2, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 210, textureX, textureY).addBox(0, 0, 0, 1, 13, 1)
			.setRotationPoint(-52, -15, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 187, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -16, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 186, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -16, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, -20, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38, -19, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-39, -16, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 192, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-39, -16, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0, 0, 0, 1, 0, 0)
			.setRotationPoint(-38, -16, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-39, -20, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-38, -19, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 2, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, -16, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1)
			.setRotationPoint(-38, -16, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 160, textureX, textureY).addBox(0, 0, 0, 1, 1, 10)
			.setRotationPoint(-51, -3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 52, textureX, textureY).addBox(0, 0, 0, 23, 3, 11)
			.setRotationPoint(-40, -2, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 109, textureX, textureY).addBox(0, 0, 0, 6, 1, 13)
			.setRotationPoint(-47, -0.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 118, textureX, textureY).addBox(0, 0, 0, 7, 2, 11)
			.setRotationPoint(-47, -3.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 13, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -1.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-47, 0.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 15, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, 1.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-47, 4, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-47, 2.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 157, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(33, -20.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 186, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(34, -20.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 186, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(32, -20.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(33, -20.25f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -1.75f, -1.6f, -0.25f, -1.75f, -1.6f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 1, -1.9f, -0.25f, 1, -1.9f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(33, -20.25f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 51, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-16.75f, -11, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(33, -15, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.5f, -2.85f, -0.25f, -0.5f, -2.85f, -0.25f, -0.75f, 2.15f, -0.25f, -0.75f, 2.15f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(33, -19, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(33, -20.25f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1.75f, -1.6f, -0.25f, -1.75f, -1.6f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 1, -1.9f, -0.25f, 1, -1.9f)
			.setRotationPoint(33, -20.25f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 64, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-20.75f, -11, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(33, -15, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.75f, 2.15f, -0.25f, -0.75f, 2.15f, -0.25f, -0.5f, -2.85f, -0.25f, -0.5f, -2.85f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(33, -19, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 100, textureX, textureY).addBox(0, 0, 0, 8, 4, 6)
			.setRotationPoint(-34.85f, -21, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(-34.85f, -21, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 4, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.85f, -21, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 6, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-26.85f, -21, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 1, -1, 0, 0, 0)
			.setRotationPoint(-26.85f, -21, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-26.85f, -21, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 50, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-16.75f, -11.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 208, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(41, -15, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.75f, 2.15f, -0.25f, -0.75f, 2.15f, -0.25f, -0.75f, -2.75f, -0.25f, -0.75f, -2.75f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(41, -19, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 178, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(42.75f, -11, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 185, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(41, -18.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 207, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 2, 4, 0.5f, 0.5f, 4, null)
			.setRotationPoint(41.5f, -21, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 207, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1.5f, 4, 1, 1, 4, new Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(41.5f, -20.5f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 207, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 4, 0.5f, 1, 4, new Vec3f(0.0, -0.75, 0.0))
			.setRotationPoint(41.5f, -20.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(41, -17.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 92, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
			.setRotationPoint(-40.85f, -21.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 88, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
			.setRotationPoint(-45.85f, -21.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 75, textureX, textureY).addBox(0, 0, 0, 23, 4, 9)
			.setRotationPoint(-40, 1, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-29, 3, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-29, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 2, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 207, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 2, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 76, textureX, textureY).addBox(0, 0, 0, 19, 12, 8)
			.setRotationPoint(36, -8, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 141, textureX, textureY).addBox(0, 0, 0, 3, 4, 10)
			.setRotationPoint(56, 0, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 181, textureX, textureY).addCylinder(0, 0, 0, 2, 10, 8, 1, 1, 3, null)
			.setRotationPoint(43, -2.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 5, 4, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f, 0.75f, -0.1f, -0.5f, 0.75f, -0.1f, -0.5f, 0.25f, -0.1f, -0.5f, 0.25f)
			.setRotationPoint(43.5f, -2.5f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 171, textureX, textureY).addCylinder(0, 0, 0, 2.5f, 9, 8, 1, 1, 3, null)
			.setRotationPoint(43.5f, 2, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 206, textureX, textureY).addCylinder(0, 0, -2, 1, 6, 6, 1, 1, 1, null)
			.setRotationPoint(48, -5, -6.5f).setRotationAngle(45, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 171, textureX, textureY).addCylinder(0, 0, 0, 2, 10, 8, 1, 1, 3, null)
			.setRotationPoint(43, -2.5f, -8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 5, 4, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f, -0.5f, 0.75f, -0.1f, -0.5f, 0.75f)
			.setRotationPoint(43.5f, -2.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(10, -19.25f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -1.75f, -1.6f, -0.25f, -1.75f, -1.6f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 1, -1.9f, -0.25f, 1, -1.9f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(10, -19.25f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(10, -14, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.5f, -2.85f, -0.25f, -0.5f, -2.85f, -0.25f, -0.75f, 2.15f, -0.25f, -0.75f, 2.15f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(10, -18, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(10, -19.25f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1.75f, -1.6f, -0.25f, -1.75f, -1.6f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 1, -1.9f, -0.25f, 1, -1.9f)
			.setRotationPoint(10, -19.25f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(10, -14, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 206, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.75f, 2.15f, -0.25f, -0.75f, 2.15f, -0.25f, -0.5f, -2.85f, -0.25f, -0.5f, -2.85f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(10, -18, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 206, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(17.5f, 5.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 206, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(4.5f, 5.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 206, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(-10.5f, 5.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 206, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 5, 6, 1, 1, 3, null)
			.setRotationPoint(38.5f, 2, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 134, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
			.setRotationPoint(34, 0.75f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 191, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(36, 0.75f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f)
			.setRotationPoint(18, 5, 8).setRotationAngle(0, 0, -12)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 206, textureX, textureY).addCylinder(0, 0, 0, 0.6f, 1, 6, 1, 1, 0, null)
			.setRotationPoint(35, 1.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.2f, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0)
			.setRotationPoint(41, -0.25f, 3.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 206, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1.5f, 6, 1, 1, 0, null)
			.setRotationPoint(40, 2, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 205, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 6, 1, 1, 0, null)
			.setRotationPoint(40.5f, -4, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f)
			.setRotationPoint(35, 1.2f, 9.5f).setRotationAngle(0, 0, 3.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f)
			.setRotationPoint(40, -4, 9).setRotationAngle(0, 0, 5)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 184, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(41, -3, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(39, -3, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1.75f, -1.6f, -0.25f, -1.75f, -1.6f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 1, -1.9f, -0.25f, 1, -1.9f)
			.setRotationPoint(-29, -19.25f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-29, -14, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.75f, 2.15f, -0.25f, -0.75f, 2.15f, -0.25f, -0.5f, -2.85f, -0.25f, -0.5f, -2.85f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-29, -18, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-34.75f, -11.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f, -0.25f)
			.setRotationPoint(-20.75f, -11.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 205, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(-35, -11, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-34.75f, -11, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, 0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-20.75f, -11, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 183, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(-35, -10.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 190, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(35, -4.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.4f, -0.25f, 0, -0.4f, -0.25f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f)
			.setRotationPoint(33, -4.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 204, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(32, -4.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.25f, 0, -0.4f, -0.25f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(33, -3.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.15f, -0.25f, 0, -0.4f, -0.25f, 0, -0.4f, -0.5f, 0, -0.15f, -0.5f)
			.setRotationPoint(30, -4.25f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.65f, -0.25f, 0, -0.4f, -0.25f, 0, -0.4f, -0.5f, 0, -0.65f, -0.5f, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0.25f, -0.5f)
			.setRotationPoint(30, -3.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(27, -4, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 203, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.25f, 0, 0.15f, -0.25f, 0, 0.15f, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(37, -4.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 95, textureX, textureY)
			.addShapeBox(-12, -1, 0, 12, 1, 1, 0, -0.5f, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, -0.1f, -0.5f, -0.2f, -0.1f, -0.5f, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, -0.1f, -0.5f, -0.2f, -0.1f)
			.setRotationPoint(40.5f, -3.5f, 9).setRotationAngle(0, 0, -9.75f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 203, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1, 6, 1, 1, 0, null)
			.setRotationPoint(19, 2, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 203, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 1, 1, 0, null)
			.setRotationPoint(17.5f, 5.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 202, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(17.5f, 5.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.2f, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0)
			.setRotationPoint(37, -4.25f, 3.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 189, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.2f, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, -0.3f, 0.2f, 0.2f, -0.3f, 0.2f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.3f, 0.2f, -0.75f, -0.3f)
			.setRotationPoint(37, -4.25f, 8.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 202, textureX, textureY)
			.addShapeBox(-0.25f, -3, 0, 1, 3, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f)
			.setRotationPoint(17.5f, 5, 9).setRotationAngle(0, 0, 22)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.1f, 0, 0.5f, -0.1f, 0, 0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, 0, 0.5f, -0.1f, 0, 0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(19, 1.5f, 9).setRotationAngle(0, 0, -10.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 202, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(2.5f, 5.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f)
			.setRotationPoint(-10, 5, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f)
			.setRotationPoint(3, 5, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 7, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 1, 0, 0, 0, 0, 0, -2.05f, 0.95f, 0, -2.05f, 0.95f)
			.setRotationPoint(-14, -12, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 185, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-4, -3, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 181, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-4.5f, -3, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-4, -1, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 12, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(9.5f, -4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(10, -1, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 177, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(24, -3, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(23.5f, -3, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 202, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(24, -1, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 201, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 167, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-4, -3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 166, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(24, -3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, -3, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(23.5f, -3, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 6, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(9.5f, -7, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -7, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5.5f, -7, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.5f, -7, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 200, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5.5f, -7, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(26, -5, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 56, textureX, textureY).addBox(0, 0, 0, 22, 1, 1)
			.setRotationPoint(32, -6, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 98, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(53, -6, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 6, textureX, textureY).addBox(0, 0, 0, 7, 2, 2)
			.setRotationPoint(-5, -5.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 199, textureX, textureY).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-4.5f, -5, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 199, textureX, textureY).addBox(0, 0, 0, 1, 9, 1)
			.setRotationPoint(-2, -3.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, 3.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, 3, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 146, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-3, 4.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 199, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-9.5f, -2.75f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-10, 3.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, -9, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 199, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 2, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, -9.75f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-15.75f, 4.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 3, -2.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 3, 1.75f, 0, -3.5f, -2.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -3.5f, 1.75f)
			.setRotationPoint(-25.75f, 4.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-46.75f, 1.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 198, textureX, textureY)
			.addShapeBox(0, -4, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.75f, 0.7f, 8.95f).setRotationAngle(0, 0, -10.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 53, textureX, textureY).addBox(0, 0, 0, 25, 1, 1)
			.setRotationPoint(1, -5, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 199, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(31.5f, 5.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 5, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 198, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(17.5f, 5.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 198, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(4.5f, 5.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 198, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(-10.5f, 5.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 198, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(2.5f, 5.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 5, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, 5, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(37, 1, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0, 0.2f)
			.setRotationPoint(31, -0.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(42, -3, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 198, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 5, 6, 1, 1, 3, null)
			.setRotationPoint(38.5f, 2, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 128, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
			.setRotationPoint(34, 0.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(36, 0.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18, 5, -9).setRotationAngle(0, 0, -12)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 198, textureX, textureY).addCylinder(0, 0, 0, 0.6f, 1, 6, 1, 1, 0, null)
			.setRotationPoint(35, 1.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.2f, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0)
			.setRotationPoint(41, -0.25f, -7.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 172, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1.5f, 6, 1, 1, 0, null)
			.setRotationPoint(40, 2, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, 0, 0, -0.2f, 0)
			.setRotationPoint(35, 1.2f, -10.5f).setRotationAngle(0, 0, 3.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 198, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f)
			.setRotationPoint(40, -4, -10).setRotationAngle(0, 0, 5)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(41, -3, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(39, -3, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(35, -4.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.25f, 0, -0.4f, -0.25f)
			.setRotationPoint(33, -4.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 157, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(32, -4.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.25f, 0, -0.4f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(33, -3.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.15f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.25f, 0, -0.15f, -0.25f)
			.setRotationPoint(30, -4.25f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.65f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.25f, 0, -0.65f, -0.25f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0.25f, -0.25f)
			.setRotationPoint(30, -3.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(27, -4, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0.15f, -0.5f, 0, 0.15f, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(37, -4.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 67, textureX, textureY)
			.addShapeBox(-12, -1, 0, 12, 1, 1, 0, -0.5f, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, 0, -0.5f, -0.2f, 0, -0.5f, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, 0, -0.5f, -0.2f, 0)
			.setRotationPoint(40.5f, -3.5f, -10).setRotationAngle(0, 0, -9.75f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 151, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1, 6, 1, 1, 0, null)
			.setRotationPoint(19, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 183, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 6, 1, 1, 0, null)
			.setRotationPoint(17.5f, 5.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 132, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 0, null)
			.setRotationPoint(17.5f, 5.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.2f, 0.2f, 0, 0, 0.2f, 0, 0, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0)
			.setRotationPoint(37, -4.25f, -8.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.2f, 0.2f, -0.3f, 0, 0.2f, -0.3f, 0, 0.2f, 0, 0.2f, 0.2f, 0, 0.2f, -0.75f, -0.3f, 0, -0.75f, -0.3f, 0, -0.75f, 0, 0.2f, -0.75f, 0)
			.setRotationPoint(37, -4.25f, -10.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 134, textureX, textureY)
			.addShapeBox(-0.25f, -3, 0, 1, 3, 1, 0, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.5f, 5, -10).setRotationAngle(0, 0, 22)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, 0, 0, -0.1f, 0)
			.setRotationPoint(19, 1.5f, -10).setRotationAngle(0, 0, -10.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 198, textureX, textureY)
			.addShapeBox(0, -4, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.75f, 0.7f, -10.05f).setRotationAngle(0, 0, -10.5f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 131, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 6, 1, 1, 0, null)
			.setRotationPoint(40.5f, -4, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 129, textureX, textureY).addCylinder(0, 0, 0, 1.25f, 2, 6, 1, 1, 4, null)
			.setRotationPoint(-1, -3, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 122, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1, 1, 4, null)
			.setRotationPoint(-4, -4, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 122, textureX, textureY).addCylinder(0, 0, 0, 1.25f, 2, 6, 1, 1, 4, null)
			.setRotationPoint(-4, -3, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 163, textureX, textureY).addCylinder(0, 0, 0, 1.25f, 3, 6, 1, 1, 4, null)
			.setRotationPoint(-8, -9, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 171, textureX, textureY).addCylinder(0, 0, 0, 1.25f, 5, 6, 1, 1, 3, null)
			.setRotationPoint(8, -7, -8).setRotationAngle(0, 0, -6)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 198, textureX, textureY).addCylinder(5, 0, 0, 0.5f, 21, 4, 1, 1, 3, null)
			.setRotationPoint(8, -7, -8).setRotationAngle(0, 0, -6)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 138, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(9, -9, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1, 0, -0.25f, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-31, -8.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.45f, -0.25f, 0, -0.45f, -0.25f, -1, 0, -0.25f, -1, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(53, -8.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, -3.5f, -0.5f, 0, 2.75f, -0.5f, 0, 2.75f, -0.5f, -1, -3.5f, -0.5f, -1)
			.setRotationPoint(53.5f, -8, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.13f, 0, 0, 0, 0, 0, 0, 0, -1, -0.13f, 0, -1, -0.08f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -1, -0.08f, -0.75f, -1)
			.setRotationPoint(-36, -10.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 1, 0, 1, 0, 0, -14, 0, 0, -14, 0, -1, 1, 0, -1, 1, -2, 0, -14, -2, 0, -14, -2, -1, 1, -2, -1)
			.setRotationPoint(6, -10.25f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.08f, 0.25f, 0, -0.67f, 0.25f, 0, -0.67f, 0.25f, -1, -0.08f, 0.25f, -1, 1, 3, 0, -1.75f, 3, 0, -1.75f, 3, -1, 1, 3, -1)
			.setRotationPoint(-36, -10, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.01f, 0, 0, -0.76f, 0, 0, -0.76f, 0, -1, 0.01f, 0, -1, 0.79f, 3, 0, -1.54f, 3, 0, -1.54f, 3, -1, 0.79f, 3, -1)
			.setRotationPoint(-31.57f, -8, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.46f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -1, -0.46f, -0.25f, -1, -0.42f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.42f, -0.5f, -1)
			.setRotationPoint(-32, -8.5f, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 84, 1, 1, 0, 0, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-31, -8.5f, -12.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -1, -0.45f, -0.25f, -1, -0.45f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -1, -0.25f, -0.5f, -1, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(53, -8.5f, -12.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 197, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, -3.5f, -0.5f, -1, 2.75f, -0.5f, -1, 2.75f, -0.5f, 0, -3.5f, -0.5f, 0)
			.setRotationPoint(53.5f, -8, -12.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 1, 0, 1, 0, -1, -14, 0, -1, -14, 0, 0, 1, 0, 0, 1, -2, -1, -14, -2, -1, -14, -2, 0, 1, -2, 0)
			.setRotationPoint(6, -10.25f, -12.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -16, 5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 82, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
			.setRotationPoint(-47, -8, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 122, textureX, textureY).addBox(0, 0, 0, 1, 4, 4)
			.setRotationPoint(-47, -12, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 139, textureX, textureY).addBox(0, 0, 0, 1, 8, 3)
			.setRotationPoint(-40.5f, -12, -7).setRotationAngle(0, -27, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 107, textureX, textureY).addBox(-0.5f, 0.5f, 0.5f, 1, 3, 1)
			.setRotationPoint(-40.5f, -12, -7).setRotationAngle(0, -27, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 86, textureX, textureY)
			.addShapeBox(-1.5f, 0.5f, 0.5f, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-40.5f, -12, -7).setRotationAngle(0, -27, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 85, textureX, textureY)
			.addShapeBox(-2, 2.5f, 1, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-40.5f, -12, -7).setRotationAngle(0, 1, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 76, textureX, textureY)
			.addShapeBox(-1.5f, 2.5f, 0.5f, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-40.5f, -12, -7).setRotationAngle(0, -27, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 106, textureX, textureY).addBox(-0.5f, 1.5f, 1.5f, 1, 2, 1)
			.setRotationPoint(-40.5f, -12, -7).setRotationAngle(0, -27, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 57, 130, textureX, textureY).addBox(0, 0, 0, 2, 3, 1)
			.setRotationPoint(-41, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-41, -9, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 107, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-45.5f, -7, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 75, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
			.setRotationPoint(-47, -8, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 118, textureX, textureY).addBox(0, 0, 0, 1, 4, 4)
			.setRotationPoint(-47, -12, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 70, textureX, textureY).addBox(0, 0, 0, 1, 2, 10)
			.setRotationPoint(-43, -18.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-44.6f, -18, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 128, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -1, 1, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-44.25f, -17.5f, -3.5f).setRotationAngle(-15, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-44.6f, -18.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 116, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -1, 1, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-44.25f, -18, -1.75f).setRotationAngle(-34, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-44.6f, -17.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 108, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -1, 1, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-44.25f, -17.25f, 0).setRotationAngle(20, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-44.6f, -18.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 105, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -1, 1, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-44.25f, -18, 2.5f).setRotationAngle(-34, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-44.6f, -17.25f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 96, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -1, 1, 1, 2, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(-44.25f, -16.75f, 3.75f).setRotationAngle(8, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 105, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-43, -20.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-43, -18.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-43, -18.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 96, textureX, textureY).addCylinder(0, 0, 0, 0.70000005f, 1, 6, 0, 1, 3, null)
			.setRotationPoint(-40.15f, -13, -2).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 96, textureX, textureY).addCylinder(0, 0, 0, 0.70000005f, 1, 6, 0, 1, 3, null)
			.setRotationPoint(-40.15f, -13, -4).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 92, textureX, textureY).addCylinder(0, 0, 0, 0.90000004f, 1, 6, 0, 1, 3, null)
			.setRotationPoint(-40.15f, -14.25f, -3).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 52, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f)
			.setRotationPoint(-39.66f, -14.25f, -3).setRotationAngle(-20, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 52, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f)
			.setRotationPoint(-39.66f, -12.95f, -2).setRotationAngle(-50, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 46, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f)
			.setRotationPoint(-39.66f, -12.95f, -4).setRotationAngle(-34, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 88, textureX, textureY).addCylinder(0, 0, 0, 0.90000004f, 1, 6, 0, 1, 3, null)
			.setRotationPoint(-39.9f, -14.5f, 3).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 43, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f, 0, -0.35f, 0.1f)
			.setRotationPoint(-39.41f, -14.5f, 3).setRotationAngle(-39, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 82, textureX, textureY).addCylinder(0, 0, 0, 0.70000005f, 1, 6, 0, 1, 3, null)
			.setRotationPoint(-39.9f, -15, 1.5f).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 28, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f)
			.setRotationPoint(-39.41f, -14.95f, 1.5f).setRotationAngle(-39, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 82, textureX, textureY).addCylinder(0, 0, 0, 0.70000005f, 1, 6, 0, 1, 3, null)
			.setRotationPoint(-39.9f, -14, 4.5f).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 24, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f)
			.setRotationPoint(-39.41f, -13.95f, 4.5f).setRotationAngle(44, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 64, textureX, textureY).addCylinder(0, 0, 0, 0.70000005f, 1, 6, 0, 1, 3, null)
			.setRotationPoint(-39.9f, -15.5f, 4.25f).setRotationAngle(-90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 22, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, -0.5f, 0, 1, 1, 0, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f, 0, -0.35f, -0.1f)
			.setRotationPoint(-39.41f, -15.45f, 4.25f).setRotationAngle(-19, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 75, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-39.5f, -16.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39.5f, -16.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-50, -20, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 3, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -19, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -20, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50, -19, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, -10, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-41, -8, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 61, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-41.5f, -9.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 56, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 2, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-40.6f, -13, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 101, textureX, textureY)
			.addShapeBox(-1, -0.5f, -0.5f, 0, 3, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -2.1f, 0, -0.1f, -2.1f, 0, -2.1f, -0.1f, 0, -2.1f, -0.1f, 0, -2.1f, -2.1f, 0, -2.1f, -2.1f)
			.setRotationPoint(-39.61f, -13, -0.75f).setRotationAngle(8, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 2, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-40.6f, -15, -1.1f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 76, textureX, textureY)
			.addShapeBox(-1, -0.5f, -0.5f, 0, 3, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -2.1f, 0, -0.1f, -2.1f, 0, -2.1f, -0.1f, 0, -2.1f, -0.1f, 0, -2.1f, -2.1f, 0, -2.1f, -2.1f)
			.setRotationPoint(-39.61f, -15, -1.1f).setRotationAngle(4, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-40, -15.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 64, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 1, 8, 1, 1, 1, null)
			.setRotationPoint(-40, -16, -9).setRotationAngle(0, 0, 90)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.5f, -18, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 28, textureX, textureY)
			.addShapeBox(0, 0.5f, 0, 1, 2, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(-40.25f, -15, -9).setRotationAngle(0, 0, -23)
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_clipboard1(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 8, textureX, textureY)
			.addShapeBox(0, 1.5f, 0.75f, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-40.25f, -15, -9).setRotationAngle(0, 0, -23)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.5f, -18, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 8, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-40, -15, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 53, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-39.75f, -16.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.75f, -16.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, -0.5f, -0.5f, 1, 1, 1, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-40, -16, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
			.addShapeBox(-1, -0.5f, -0.5f, 0, 3, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -2.1f, 0, -0.1f, -2.1f, 0, -2.1f, -0.1f, 0, -2.1f, -0.1f, 0, -2.1f, -2.1f, 0, -2.1f, -2.1f)
			.setRotationPoint(-39.01f, -16, 5.75f).setRotationAngle(-8, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 16, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(47, 4, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, -1)
			.setRotationPoint(59.35f, -4, -5).setRotationAngle(0, 0, 0).setName("Ditchlight_Rightcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 236, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, -1)
			.setRotationPoint(59.35f, -4, 4).setRotationAngle(0, 0, 0).setName("Ditchlight_Leftcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 10, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -6, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 1, 0, 0, 0, 0, -15, 0, 0, -15, 0, -1, 0, 0, -1, 0, -2.5f, 0, -15, -2.5f, 0, -15, -2.5f, -1, 0, -2.5f, -1)
			.setRotationPoint(-47.5f, -10, 11.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 4, 1, 0, 0, 0, -1, -15, 0, -1, -15, 0, 0, 0, 0, 0, 0, -2.5f, -1, -15, -2.5f, -1, -15, -2.5f, 0, 0, -2.5f, 0)
			.setRotationPoint(-47.5f, -10, -12.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.15f, 0, -0.75f, 1, 2.5f, 0, -1.1f, 2.5f, 0, -1.1f, 2.5f, -0.75f, 1, 2.5f, -0.75f)
			.setRotationPoint(-36, -10.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.15f, 0, -0.75f, 1, 2.5f, 0, -1.1f, 2.5f, 0, -1.1f, 2.5f, -0.75f, 1, 2.5f, -0.75f)
			.setRotationPoint(-32, -10.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.15f, 0, 0, 0.15f, 0, -0.75f, 0, 0, -0.75f, 0.22f, 0.5f, 0, -0.085f, 0.5f, 0, -0.085f, 0.5f, -0.75f, 0.22f, 0.5f, -0.75f)
			.setRotationPoint(-35, -10.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 212, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.75f, -1, 0, -0.75f, -0.64f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.64f, -0.5f, -0.75f)
			.setRotationPoint(-32, -10.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.06f, 0, 0, 0.19f, 0, 0, 0.19f, 0, -0.75f, -0.06f, 0, -0.75f, 0.16f, 0.5f, 0, -0.04f, 0.5f, 0, -0.04f, 0.5f, -0.75f, 0.16f, 0.5f, -0.75f)
			.setRotationPoint(-35.46f, -7.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.12f, 0.5f, 0, 0.23f, 0.5f, 0, 0.23f, 0.5f, -0.75f, -0.12f, 0.5f, -0.75f, 0.1f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.1f, 0, -0.75f)
			.setRotationPoint(-36, -4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.13f, 0, -1, 0, 0, -1, 0, 0, 0, -0.13f, 0, 0, -0.08f, -0.75f, -1, 0, -0.75f, -1, 0, -0.75f, 0, -0.08f, -0.75f, 0)
			.setRotationPoint(-36, -10.5f, -12.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.08f, 0.25f, -1, -0.67f, 0.25f, -1, -0.67f, 0.25f, 0, -0.08f, 0.25f, 0, 1, 3, -1, -1.75f, 3, -1, -1.75f, 3, 0, 1, 3, 0)
			.setRotationPoint(-36, -10, -12.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.01f, 0, -1, -0.76f, 0, -1, -0.76f, 0, 0, 0.01f, 0, 0, 0.79f, 3, -1, -1.54f, 3, -1, -1.54f, 3, 0, 0.79f, 3, 0)
			.setRotationPoint(-31.57f, -8, -12.01f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.46f, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0, -0.46f, -0.25f, 0, -0.42f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -0.42f, -0.5f, 0)
			.setRotationPoint(-32, -8.5f, -12.01f).setRotationAngle(0, 0, 0)
		);
	}

}
