//FMT-Marker TiM-1.0
package wwcp.models.locomotives.diesels;

import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Vec3f;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class GP50 extends RollingStockModel {

	public GP50(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		initGroup_group0();
		initGroup_clipboard();
		initGroup_SD70MACcb();
		initGroup_F40phcb();
		initGroup_SD45cb();
		initGroup_SD38cb();
		initGroup_SD60MACcb();
		initGroup_M420bcb();
		initGroup_C424cb();
		initGroup_GP50_Explodecb();
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 104, 1, 22)
				.setRotationPoint(-47, -1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 239, 18, textureX, textureY).addBox(0, 0, 0, 80, 22, 14)
				.setRotationPoint(-48, -23, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 27, textureX, textureY).addBox(0, 0, 0, 61, 1, 4)
				.setRotationPoint(-30, -2, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 278, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -19, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 10, 129, textureX, textureY).addCylinder(0, 0, 0, 0.95f, 1, 8, 1, 1, 3, null)
				.setRotationPoint(59, -14, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 16, 95, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(-32, 1.5f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 317, 106, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
				.setRotationPoint(47, -21.75f, 0.9f).setRotationAngle(0, -26.5f, 0).setName("numberboard_front_left")
		);
		group0.add(new ModelRendererTurbo(group0, 442, 128, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-50, -24, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 233, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -15, -7).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 22, 7, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 22, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-51, -23, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 93, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-26, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 111, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-23, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 111, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-23, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 110, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
				.setRotationPoint(-26, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 110, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
				.setRotationPoint(-20, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-20, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 4, 1, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, -0.5f, 3, 0, -0.5f, 3, 0, -0.5f, -3, 0, -0.5f, -3)
				.setRotationPoint(31, -23, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(29, -6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(28, -6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 128, textureX, textureY).addBox(0, 0, 2, 1, 1, 1)
				.setRotationPoint(31, -20.5f, -10).setRotationAngle(0, 0, 0).setName("Door_rear_1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -20.5f, -10).setRotationAngle(0, 0, 0).setName("Door_rear_2")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 117, textureX, textureY).addBox(0, 0, 0, 1, 5, 3)
				.setRotationPoint(31, -6, -10).setRotationAngle(0, 0, 0).setName("box")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, -3.5f, 0, 0, -3.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(44, -23, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 75, textureX, textureY).addBox(0, 0, 0, 1, 3, 14)
				.setRotationPoint(44, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 55, textureX, textureY).addBox(0, 0, 0, 12, 1, 14)
				.setRotationPoint(32, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(45, -23, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 6, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -3, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(45, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 6, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -3, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(45, -23, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 18, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -19, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 13, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -19, -10).setRotationAngle(0, 0, 0).setName("Door_rear_0cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1.33f, 0, 0, -1.33f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -22.5f, -8).setRotationAngle(0, 0, 0).setName("box")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -2, 0, 0, -2, 0, 0, -0.33f, 0, 0, -0.33f, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -21.5f, -10).setRotationAngle(0, 0, 0).setName("box")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(32, -19, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 4, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, -3, 0, -0.5f, -3, 0, -0.5f, 3, 0, -0.5f, 3)
				.setRotationPoint(32, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 128, textureX, textureY).addBox(-1, 0, -3, 1, 1, 1)
				.setRotationPoint(45, -20.5f, 10).setRotationAngle(0, 0, 0).setName("Door_front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 120, textureX, textureY)
				.addShapeBox(-1, 0, -2, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -20.5f, 10).setRotationAngle(0, 0, 0).setName("Door_front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 116, textureX, textureY).addBox(0, 0, 0, 1, 5, 3)
				.setRotationPoint(44, -6, 7).setRotationAngle(0, 0, 0).setName("boxcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, -3.5f, 0, 0, -3.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(31, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 18, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -19, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 116, textureX, textureY)
				.addShapeBox(-1, 0, -3, 1, 13, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -19, 10).setRotationAngle(0, 0, 0).setName("Door_front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.33f, 0, 0, -1.33f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -22.5f, 7).setRotationAngle(0, 0, 0).setName("box")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.33f, 0, 0, -0.33f, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0)
				.setRotationPoint(44, -21.5f, 8).setRotationAngle(0, 0, 0).setName("box")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, -6, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, -6, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, -5, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
				.setRotationPoint(53, -3, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
				.setRotationPoint(53, -5, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 85, textureX, textureY).addBox(0, 0, 0, 11, 5, 4)
				.setRotationPoint(45, -6, -11).setRotationAngle(0, 0, 0).setName("boxcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
				.setRotationPoint(56, -4, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
				.setRotationPoint(44, -20, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 10, 7, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -11, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 10, 7, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -11, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 6, 0, 0, 0, 0, -3, 0, 0, -0.43f, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -0.43f, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -15, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 6, 0, 0, 0, 0, -0.43f, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -0.43f, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -15, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 4, textureX, textureY).newCylinderBuilder()
				.setPosition(0, 0, 0).setRadius(0.95f, 0.8f).setLength(1).setSegments(10, 5).setScale(1, 1).setDirection(4)
				.setRadialTexture(0, 0).setTopOffset(null).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(60.1f, -14.05f, 0).setRotationAngle(0, 0, 90)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.43f, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.43f, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(59, -15, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, -0.43f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.43f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(59, -15, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 95, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(40, 1.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 36, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-13, 3, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 36, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-13, 3, 10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 36, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
				.setRotationPoint(-13, 6, 8).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-17, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-9, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-1, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(7, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-41, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-47, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -1.5f, 0, 0, 2.5f, 0, 0, 2.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1, 0, 0, -3, 0, 0, -3, -0.5f, 0, 1, -0.5f)
				.setRotationPoint(25.5f, -10, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(29.5f, -13, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-47, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-41, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-33, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-25, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-17, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-9, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-1, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(7, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(15, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(23, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(44.5f, -13, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(55, -12.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(57.5f, -12.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, -0.5f, 0, 1, -0.5f, 0, -1.5f, 0, 0, -1.5f)
				.setRotationPoint(57.5f, -5.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(57.5f, -1.5f, -12.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(57.5f, 2.5f, -12.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-16, 0, -11).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-16, 1, -11).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-16, 0, -10).setRotationAngle(0, 0, 0).setName("Box 64cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-16, 1, -10).setRotationAngle(0, 0, 0).setName("Box 65cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 104, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
				.setRotationPoint(44.3f, -21.75f, -6.3f).setRotationAngle(0, 26.5f, 0).setName("numberboard_front_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 61, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
				.setRotationPoint(-48.5f, -17.65f, -6.2f).setRotationAngle(0, -23, 0).setName("numberboard_back_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 61, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
				.setRotationPoint(-50.8f, -17.65f, 0.7f).setRotationAngle(0, 23, 0).setName("numberboard_back_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.21f, 0, 0, -0.63f, 0, 0, -0.16f, 0, 0, -0.66f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.2f, 0, 0, -0.55f, 0, 0,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(63.25f, 3.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.41f, 0, 0, -0.36f, 0, 0, -0.2f, 0, 0, -0.55f, 0, 0, -0.39f, 0, 0, -0.36f, 0, 0, -0.18f, 0, 0, -0.58f, 0, 0,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(63.95f, 3.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(62.75f, 1.7f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -1.75f, 0, -0.25f, 1, 0, -0.25f, 1, 0, 0, -1.75f, 0, 0)
				.setRotationPoint(62.75f, 2.7f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.4f, 0, 0, -1.15f, 0, 0)
				.setRotationPoint(63.75f, 5.7f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.66f, 0, 0, -0.16f, 0, 0, -0.63f, 0, 0, -0.21f, 0, 0, -0.55f, 0, 0, -0.2f, 0, 0, -0.75f, 0, 0, 0, 0, 0,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(63.25f, 3.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.55f, 0, 0, -0.2f, 0, 0, -0.36f, 0, 0, -0.41f, 0, 0, -0.58f, 0, 0, -0.18f, 0, 0, -0.36f, 0, 0, -0.39f, 0, 0,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(63.95f, 3.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(62.75f, 1.7f, 5.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1.75f, 0, 0, 1, 0, 0, 1, 0, -0.25f, -1.75f, 0, -0.25f)
				.setRotationPoint(62.75f, 2.7f, 5.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1.15f, 0, 0, 0.4f, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(63.75f, 5.7f, 5.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -1, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1.89f, 0, 0, 1.04f, 0, 0)
				.setRotationPoint(64.5f, 2.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 55, textureX, textureY).addBox(0, 0, 0, 12, 1, 20)
				.setRotationPoint(32, -6, -10).setRotationAngle(0, 0, 0).setName("boxcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 115, textureX, textureY).addBox(0, 0, 0, 2, 5, 2)
				.setRotationPoint(42, -11, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(42, -13, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.43f, 0, 0, -0.43f, 0, 0, 0, 0, 0, 0, 0, 0, -0.43f, 0, 0, -0.43f, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -15, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.43f, 0, 0, -0.43f, 0, 0, 0, 0, 0, 0, 0, 0, -0.43f, 0, 0, -0.43f, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -15, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -8, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1, 0, 0, 1)
				.setRotationPoint(-48, -6, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -2, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -20, -10).setRotationAngle(0, 0, 0).setName("Door_rear_0cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(32, -20, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -20, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 115, textureX, textureY)
				.addShapeBox(-1, 0, -3, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -20, 10).setRotationAngle(0, 0, 0).setName("Door_frontcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f)
				.setRotationPoint(57.2f, -13.75f, -4.6f).setRotationAngle(0, 24, 0).setName("markerlight_right_front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f)
				.setRotationPoint(57.1f, -13.75f, -4.55f).setRotationAngle(0, 24, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f)
				.setRotationPoint(58, -13.75f, 2.8f).setRotationAngle(0, -24, 0).setName("markerlight_left_front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f)
				.setRotationPoint(57.9f, -13.75f, 2.75f).setRotationAngle(0, -24, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(57.7f, -10.5f, -5).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(58.7f, -10.5f, 2.7f).setRotationAngle(0, -23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-49.1f, -9.9f, -5.3f).setRotationAngle(0, -23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-48.8f, -14.75f, -5.7f).setRotationAngle(0, -23, 0).setName("markerlight_right_back")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-49.6f, -14.75f, 3.8f).setRotationAngle(0, 23, 0).setName("markerlight_left_back")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f)
				.setRotationPoint(-49.6f, -14.75f, 3.8f).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f, -0.1f, -0.15f, -0.15f)
				.setRotationPoint(-48.8f, -14.75f, -5.7f).setRotationAngle(0, -23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-16, 0, 9).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-16, 1, 9).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-16, 0, 10).setRotationAngle(0, 0, 0).setName("Box 64cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-16, 1, 10).setRotationAngle(0, 0, 0).setName("Box 65cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(48, -13.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(18, -22.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 5, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(14, -22.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(57, -15, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 1, -0.5f, 0, 1, 0, 0, -0.43f, 0, 0, 0, 0, 0, 1, 0, 0)
				.setRotationPoint(59, -14, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, -0.5f, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 1, -0.5f, 0, 1, 0, 0, 0, 0, 0, -0.43f, 0, 0, 1, 0, 0)
				.setRotationPoint(59, -14, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 22, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(63, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(63, 8, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(63, 8, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -1, 0)
				.setRotationPoint(63, 8, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 91, textureX, textureY).addBox(0, 0, 0, 8, 5, 4)
				.setRotationPoint(45, -6, 7).setRotationAngle(0, 0, 0).setName("boxcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(55, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 3.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 3.5f, 0, 0, -4, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -4, 0)
				.setRotationPoint(50.5f, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44.5f, -13, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(54.5f, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(49.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(57.5f, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1, 0, 0, 1)
				.setRotationPoint(57.5f, -5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(57.5f, -1.5f, 11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(57.5f, 2.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 1, -0.5f, 0, -1.5f, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 1, 0, 0, -1.5f, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(64.5f, -9, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 18, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(63.25f, -1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(62.5f, -9, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -1.5f, -0.5f, 0, 1, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -1.5f, 0, 0, 1, 0, 0)
				.setRotationPoint(64.5f, -9, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(62.5f, -9, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(63, -8, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(62, 3, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(62, -1.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 2.5f, 0, 0, 2.5f, 0, 0, -3, -0.5f, 0, -3, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(62, -8, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(58, 5, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -1, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -1, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, 6.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0)
				.setRotationPoint(59, -1, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(59, 2, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(58, 4, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(59, 2, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(58, 7.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 91, textureX, textureY).addBox(0, 0, 0, 9, 2, 3)
				.setRotationPoint(-4, -24.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 109, textureX, textureY).addBox(0, 0, 0, 3, 2, 3)
				.setRotationPoint(-1, -24.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 109, textureX, textureY).addBox(0, 0, 0, 3, 2, 3)
				.setRotationPoint(-1, -24.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-4, -24.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 109, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 2, 3)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
				.setRotationPoint(-4, -24.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 109, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 2, 3)
				.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
				.setRotationPoint(2, -24.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(2, -24.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 108, textureX, textureY).addBox(0, 0, 0, 2, 1, 4)
				.setRotationPoint(-11, -23.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -2, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -2)
				.setRotationPoint(-10, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -2, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, -1.5f, 0, -2, -2)
				.setRotationPoint(-10, -21.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 36, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f)
				.setRotationPoint(-7, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f)
				.setRotationPoint(-7, -21.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -2, 0, 0.25f, -0.5f)
				.setRotationPoint(8, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -0.5f, 0, -0.5f, 0, 0, -2, 0, 0, -2, -2, 0, -0.5f, -1.5f)
				.setRotationPoint(8, -21.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 90, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-46, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 106, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-43, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 106, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-43, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-46, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 104, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
				.setRotationPoint(-46, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 103, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
				.setRotationPoint(-40, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-40, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 22, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-54, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 20, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-54, 8, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -1, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-54, 8, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1, 0, -0.75f, -1, 0)
				.setRotationPoint(-54, 8, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 20, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-54, -1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-53, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 93, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(40, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 90, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(40, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 88, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-32, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 88, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-32, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 114, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(17, 2, 8).setRotationAngle(25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 114, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(17, 0.75f, -10.5f).setRotationAngle(-25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, 6.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(59, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, 4, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(58, 7.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, 5, -10).setRotationAngle(0, 0, 0).setName("aunnamed0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-49, -1, -10).setRotationAngle(0, 0, 0).setName("aunnamed1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -1, -11).setRotationAngle(0, 0, 0).setName("aunnamed2")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, 6.5f, -9).setRotationAngle(0, 0, 0).setName("aunnamed3")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -1, -10).setRotationAngle(0, 0, 0).setName("aunnamed4")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-53, 2, -10).setRotationAngle(0, 0, 0).setName("aunnamed5")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, 4, -9.5f).setRotationAngle(0, 0, 0).setName("aunnamed6")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-53, 7.5f, -11).setRotationAngle(0, 0, 0).setName("aunnamed7")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-53, 5, 8).setRotationAngle(0, 0, 0).setName("aunnamed0cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-49, -1, 8).setRotationAngle(0, 0, 0).setName("aunnamed1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -1, 8).setRotationAngle(0, 0, 0).setName("aunnamed2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, 6.5f, 8).setRotationAngle(0, 0, 0).setName("aunnamed3cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2)
				.setRotationPoint(-51, -1, 8).setRotationAngle(0, 0, 0).setName("aunnamed4cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-53, 2, 8).setRotationAngle(0, 0, 0).setName("aunnamed5cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 10, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-53, 4, 8.5f).setRotationAngle(0, 0, 0).setName("aunnamed6cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-53, 7.5f, 8).setRotationAngle(0, 0, 0).setName("aunnamed7cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
				.setRotationPoint(-50, 2, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0)
				.setRotationPoint(-54.25f, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-54, -9, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-54, -9, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-54, -8, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, 3, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, -1.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 2.5f, -0.5f, 0, 2.5f, -0.5f, 0, -3, 0, 0, -3, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, -8, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-54, -9, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0)
				.setRotationPoint(-54, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 4, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-54, -9, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-54, -9, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-54, -8, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, 3, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-53, -1.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -3, -0.5f, 0, -3, -0.5f, 0, 2.5f, 0, 0, 2.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-53, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-54, -9, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f)
				.setRotationPoint(-54, -9, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-48, -8, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, -0.5f, 0, 1, -0.5f, 0, -1.5f, 0, 0, -1.5f)
				.setRotationPoint(-48, -6, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-48, -2, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(-48, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 99, textureX, textureY).addBox(0, 0, 0, 6, 8, 3)
				.setRotationPoint(25, -10, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 77, textureX, textureY).addBox(0, 0, 0, 2, 14, 14)
				.setRotationPoint(55, -15, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 81, textureX, textureY).addBox(0, 0, 0, 2, 14, 12)
				.setRotationPoint(53, -15, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 113, textureX, textureY).addBox(0, 0, 0, 2, 3, 2)
				.setRotationPoint(53, -15, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 119, textureX, textureY).addBox(0, 0, 0, 2, 8, 1)
				.setRotationPoint(53, -9, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 3, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -1, -0.25f, 0, -1, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
				.setRotationPoint(53, -11, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -1, 0, -0.25f, -1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(53, -12, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 122, textureX, textureY).addBox(0, 0, 0, 0, 8, 1)
				.setRotationPoint(54, -9.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 124, textureX, textureY).addCylinder(0, 0, 0, 0.6f, 1, 6, 1, 1, 3, new Vec3f(-0.5, 0.0, 0.0))
				.setRotationPoint(59.35f, -14.5f, 0).setRotationAngle(0, 0, 0).setName("mars_light")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(58, -15, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.1f, 0, 0, -0.1f, 0, 0, -0.3f, -0.3f, -0.5f, -0.3f, -0.3f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(57.75f, -15.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.1f, 0, -0.5f, -0.1f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(57.75f, -15.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.1f, 0, 0, -0.1f, 0, 0, -0.3f, -0.3f, -0.5f, -0.3f, -0.3f)
				.setRotationPoint(57.75f, -14.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.1f, 0, -0.5f, -0.1f, 0)
				.setRotationPoint(57.75f, -14.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(59, -15, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.43f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -14.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.43f, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -14.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.43f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -13, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.43f, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -13, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.43f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -13.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.43f, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -13.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(29.5f, -13, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -3, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -3, 0, 0, 2.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 2.5f, 0)
				.setRotationPoint(25.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(15, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(23, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(11.5f, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f)
				.setRotationPoint(38.5f, -23.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f)
				.setRotationPoint(38.5f, -25.25f, -1).setRotationAngle(0, 0, 0).setName("Beacon1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 123, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(45, -25, 0.25f).setRotationAngle(0, 0, 0).setName("Box 89cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 123, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(44, -25, -2).setRotationAngle(0, 0, 0).setName("Box 89cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 123, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(32.5f, -23.5f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1f, -0.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1f, -0.1f)
				.setRotationPoint(31.5f, -25.25f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 116, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(33.5f, -24.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 89cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
				.setRotationPoint(34.5f, -25, 0).setRotationAngle(0, 0, 0).setName("Box 90cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(33.5f, -25, -1.5f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
				.setRotationPoint(32.5f, -24.5f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(32.5f, -25.25f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.25f, -0.25f)
				.setRotationPoint(47.5f, -25.2f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 115, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(46.75f, -24.5f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 89cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
				.setRotationPoint(47.75f, -25, -1.25f).setRotationAngle(0, 0, 0).setName("Box 90cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(44.25f, -25, -0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f)
				.setRotationPoint(45.75f, -25, -1.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(46.5f, -25.2f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
				.setRotationPoint(45.75f, -24, -1.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 115, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(45.25f, -24.5f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 89cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1f, -0.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1f, -0.1f)
				.setRotationPoint(45.25f, -25.2f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 328, 115, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(46.75f, -24.5f, 0).setRotationAngle(0, 0, 0).setName("Box 89cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
				.setRotationPoint(47.75f, -25, -0.5f).setRotationAngle(0, 0, 0).setName("Box 90cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(46.75f, -25, -1.75f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 115, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-13.5f, -23.5f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1f, -0.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1f, -0.1f)
				.setRotationPoint(-14.5f, -25.25f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 115, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-12.5f, -24.5f, 4).setRotationAngle(0, 0, 0).setName("Box 89cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
				.setRotationPoint(-11.5f, -25, 3.5f).setRotationAngle(0, 0, 0).setName("Box 90cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-12.5f, -25, 5).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
				.setRotationPoint(-13.5f, -24.5f, 4.25f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-13.5f, -25.25f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 115, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(45.5f, -23.5f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1f, -0.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1f, -0.1f)
				.setRotationPoint(44.5f, -25.25f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 114, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(46.5f, -24.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 89cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
				.setRotationPoint(47.5f, -25, 0).setRotationAngle(0, 0, 0).setName("Box 90cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(46.5f, -25, -1.5f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
				.setRotationPoint(45.5f, -24.5f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(45.5f, -25.25f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 5, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-47, -22, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 5, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-31, -22, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 40, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 5, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-47, -22, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 5, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-31, -22, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(40, -24, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(40, -23.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(40, -23.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f)
				.setRotationPoint(40.5f, -24.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f)
				.setRotationPoint(40.5f, -26.25f, 5.5f).setRotationAngle(0, 0, 0).setName("Beacon1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(34, -24.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(34, -24, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(34, -24, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(34, -24.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(33, -24.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(41, -24.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(34, -24.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(33, -24.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(41, -24.5f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(36, -24.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(42, -24, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(42, -24, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(39, -24, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(39, -24, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(36, -24, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(36, -24, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(36, -24.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(42, -24, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(42, -24, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(39, -24, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(39, -24, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(36, -24, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(36, -24, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 75, textureX, textureY).addBox(0, 0, 0, 2, 3, 14)
				.setRotationPoint(45, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(47, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(47, -23, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f)
				.setRotationPoint(47.1f, -23, -0.1f).setRotationAngle(0, -8, 0).setName("numberboard_front_left2")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 102, textureX, textureY)
				.addShapeBox(0, 0, -6.8f, 1, 3, 7, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f)
				.setRotationPoint(47.1f, -23, -0.1f).setRotationAngle(0, 8, 0).setName("numberboard_front_right2")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(26.5f, -25, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 38, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(26.5f, -24.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(26.5f, -24.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(38, -24.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(44, -24, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(41, -24, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(38, -24, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(38, -24.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -24, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(41, -24, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -24, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(20, -25, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(26, -24.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(23, -24.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(20, -24.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26, -24.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(23, -24.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(20, -24.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-14.5f, -25, 3).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-13.5f, -24.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 9, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(63.25f, -1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 9, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(63.25f, -1, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, -3, -0.5f, 0, 2.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, -3, 0, 0, 2.5f, 0, 0)
				.setRotationPoint(65, -9, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(62.85f, -8, 6.8f).setRotationAngle(0, -23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f)
				.setRotationPoint(65, -9, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
				.setRotationPoint(65, -9, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 2.5f, -0.5f, 0, -3, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 2.5f, 0, 0, -3, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(65, -9, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(62.26f, -8, -8.2f).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f)
				.setRotationPoint(35.5f, -23.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f)
				.setRotationPoint(35.5f, -25.25f, -1).setRotationAngle(0, 0, 0).setName("Beacon4")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 9, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.25f, -1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 44, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-56.25f, -1, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, 2.5f, -0.5f, 0, -3, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, 2.5f, 0, 0, -3, 0, 0)
				.setRotationPoint(-56, -9, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-53.94f, -8, 6.8f).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
				.setRotationPoint(-56, -9, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(-56, -9, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -3, -0.5f, 0, 2.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, -3, 0, 0, 2.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-56, -9, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-53.35f, -8, -8.2f).setRotationAngle(0, -23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f)
				.setRotationPoint(-56, -9, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0)
				.setRotationPoint(-56, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
				.setRotationPoint(-53.5f, 3, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-53.5f, -1.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -3, 0, 0, -3, 0, 0, 2.5f, -0.5f, 0, 2.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-53.5f, -8, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-53.5f, 3, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-53.5f, -1.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 2.5f, 0, 0, 2.5f, 0, 0, -3, -0.5f, 0, -3, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-53.5f, -8, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.55f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.55f, -0.25f, -0.25f, -0.55f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.55f, -0.25f, -0.25f)
				.setRotationPoint(62.6f, -0.2f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.3f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f)
				.setRotationPoint(62.75f, -0.2f, 5.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.55f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.55f, -0.25f, -0.25f, -0.55f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.55f, -0.25f, -0.25f)
				.setRotationPoint(62.6f, -0.2f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.3f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.3f, -0.35f, -0.35f)
				.setRotationPoint(62.75f, -0.2f, -7.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, 5, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 23, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f)
				.setRotationPoint(32.5f, -23.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f)
				.setRotationPoint(32.5f, -25.25f, 3).setRotationAngle(0, 0, 0).setName("Beaconcnw")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 2, 2, 0, 0, 0, -5, 0, 0, -1, 0, 0, 0, 0, 0, 4, 0, 0, -4.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 4)
				.setRotationPoint(39, -15, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 189, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 7, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1)
				.setRotationPoint(36, -13, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
				.setRotationPoint(42, -12.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -2, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 2, 0, 0, -2, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 2)
				.setRotationPoint(39, -16, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.43f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -12, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.43f, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -12, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 182, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.43f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -12.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 183, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.43f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.43f, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -12.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, -3, 0, 0, -0.43f, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -0.43f, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -12, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, -0.43f, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -0.43f, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -12, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, -0.5f, -2)
				.setRotationPoint(44, -16, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 204, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, -0.5f, -2)
				.setRotationPoint(44, -15.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 217, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
				.setRotationPoint(44, -15, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 36, 3, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-13, 3, -10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 104, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(-47, 0, -8).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_SD70MACcb(){
		TurboList SD70MACcb = new TurboList("SD70MACcb");
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 403, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f)
				.setRotationPoint(-51.25f, -20, -2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 489, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-51.5f, -20, -0.1f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 41, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-51.6f, -20, -0.1f).setRotationAngle(0, 0, 0).setName("Lightrear_left")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 114, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-51.5f, -20, -1.9f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 359, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-51.6f, -20, -1.9f).setRotationAngle(0, 0, 0).setName("Lightrear_right")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 503, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, -21.9f, 3).setRotationAngle(0, 23, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 114, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, -18.9f, 3).setRotationAngle(0, 23, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, -15.9f, 3).setRotationAngle(0, 23, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 356, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, -12.9f, 3).setRotationAngle(0, 23, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 340, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, -9.9f, 3).setRotationAngle(0, 23, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 44, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, -6.9f, 3).setRotationAngle(0, 23, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 357, 83, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-36, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 141, 85, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-33, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 205, 82, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-33, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 123, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-36, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 183, 81, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
				.setRotationPoint(-36, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 81, 67, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
				.setRotationPoint(-30, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 448, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-30, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 502, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(28, -5, -11).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 386, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(29, -3, -10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 490, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(30, -5, -10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 419, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 36, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-13, 1, 2).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 414, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 36, 1, 9, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-13, 1, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 428, 29, textureX, textureY).addBox(0, 0, 0, 36, 1, 4)
				.setRotationPoint(-13, 1, -2).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 428, 35, textureX, textureY)
				.addShapeBox(0, 0, 0, 36, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-13, 6, -10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 109, 27, textureX, textureY).addBox(0, 0, 0, 36, 1, 22)
				.setRotationPoint(-13, 2, -11).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 238, 69, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(19, 2, 8).setRotationAngle(25, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 39, 62, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(19, 0.75f, -10.5f).setRotationAngle(-25, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 149, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 40, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-28.5f, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 447, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-25, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 375, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-33, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -1.5f, 0, 0, 1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 1, 0)
				.setRotationPoint(-31.5f, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 93, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-47.5f, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 73, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-47.5f, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(23.25f, 0.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Bell")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 148, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(23.5f, -0.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 502, 60, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
				.setRotationPoint(63.25f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 39, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(63.25f, 1.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 196, 84, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(64.25f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 370, 120, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(65.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 169, 109, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(66.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 441, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(65.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 273, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(67.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 247, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(67.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 20, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
				.setRotationPoint(65.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(62.5f, 1.5f, -8).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 503, 38, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(62.5f, 1.5f, 5).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 11, 43, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
				.setRotationPoint(-54.25f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 11, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-54.25f, 1.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 458, 79, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-55.25f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 221, 97, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-56.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 205, 97, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-57.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 273, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 220, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-58.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 92, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-58.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 506, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 414, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(-53.5f, 1.5f, -8).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 12, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-53.75f, 1.7f, -7.88f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 12, 4, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(-53.5f, 1.5f, 5).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-53.75f, 1.7f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 168, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, 0, -1, 0.5f)
				.setRotationPoint(36, -19.5f, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 83, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, -2, -1, -1.25f, -2, -1, 0.5f, 0, -1, 0.5f)
				.setRotationPoint(40, -19.5f, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 417, 89, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(2, 2, 1)
				.setCorners(0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, -2, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, -2, -1, 0.5f)
				.setPolygonUV(0, new float[]{ 4.0f, 1.0f, 3.0f, 1.0f, 3.0f, 3.0f, 4.0f, 3.0f })
				.setPolygonUV(5, new float[]{ 6.0f, 1.0f, 4.0f, 1.0f, 4.0f, 3.0f, 4.0f, 3.0f })
				.setPolygonUV(2, new float[]{ 3.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 3.0f, 1.0f }).build()
				.setRotationPoint(34, -19.5f, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 168, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, 0, -1, -1.25f)
				.setRotationPoint(36, -19.5f, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 417, 85, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(2, 2, 1)
				.setCorners(0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, -2, -1, 0.5f, -2, -1, -1.25f, 0, -1, -1.25f)
				.setPolygonUV(4, new float[]{ 3.0f, 1.0f, 1.0f, 1.0f, 1.0f, 3.0f, 1.0f, 3.0f }).build()
				.setRotationPoint(40, -19.5f, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 145, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, -2, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, -2, -1, -1.25f)
				.setRotationPoint(34, -19.5f, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.75f, 0, 0, 0.25f, 0, 0, -1, 0, 0, 1.04f, 0, 0, -1.89f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(64.5f, 2.5f, -11).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 101, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(35, -10, -7).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 205, 97, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(33, -11, -9).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 402, 55, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
				.setRotationPoint(33, -16, -9).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 403, 99, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(35, -10, 6).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 490, 82, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(33, -11, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 363, 55, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
				.setRotationPoint(33, -16, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 10, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f)
				.setRotationPoint(63.45f, -3.15f, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(63.85f, -3.45f, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 386, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(64, -3.45f, -5).setRotationAngle(0, 0, 0).setName("Ditchlight_right_top")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 326, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f)
				.setRotationPoint(63.45f, -3.15f, 3).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 194, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(63.85f, -3.45f, 3).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 183, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(64, -3.45f, 3).setRotationAngle(0, 0, 0).setName("Ditchlight_left_top")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 490, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(65.25f, -1, -9).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 490, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0.5f, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(65.25f, -1, 0).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 347, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(63, -8, -9).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 200, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(64.5f, -9, -2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 315, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
				.setRotationPoint(62, 3, -12).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 507, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(62, -1.5f, -12).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 104, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -3, 0, 0, -3, 0, 0, 2.5f, -0.5f, 0, 2.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(62, -8, -12).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 32, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(64.5f, -9, 1).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 333, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f)
				.setRotationPoint(65, -9, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 91, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0)
				.setRotationPoint(65, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 278, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 20, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(63, -1, -10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 52, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(57, -1, -8).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 363, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(11, -24, -7).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 493, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(11, -24, 6).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 213, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(10, -24, -6).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 458, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(10, -24, 6).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 419, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -0.5f, -1, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(10, -24, -7).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 23, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(19, -24, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 52, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(30, -24, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 183, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(30, -24, -4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 23, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(19, -24, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 493, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -1, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(30, -24, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 114, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(19, -24, -4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 85, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 12, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(11, -24, -6).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 467, 69, textureX, textureY).addBox(0, 0, 0, 8, 14, 1)
				.setRotationPoint(16, -16, 7).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 91, 95, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(8, 14, 3)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(1, new float[]{ 3.0f, 3.0f, 3.0f, 3.0f, 0.0f, 17.0f, 3.0f, 17.0f }).build()
				.setRotationPoint(16, -16, 8).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 232, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(16, -17, 7).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 231, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.36f, 0, 0, -0.36f, 0, 0, 0, 0, 0, 0, 0, 0, -0.57f, 0, 0, -0.57f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(16, -5, 10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 490, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(23, -4, 10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 378, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(16, -4, 10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 333, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(19.5f, -4, 10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 228, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(25, -12, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 168, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -3, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -3, 0, 0, 2.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 2.5f, 0)
				.setRotationPoint(11.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 204, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(15.5f, -13, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 293, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(15, -12, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 419, 61, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(44, -24, -0.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 145, 71, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
				.setRotationPoint(44, -25, -1).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 114, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(43, -25.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 38, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(45, -25, -1.25f).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 10, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
				.setRotationPoint(47, -25.5f, -1.75f).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(46, -25.5f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26.5f, -24, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 205, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-25.5f, -25, -4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26.5f, -25, -4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-13.5f, -25, -4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 205, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-25.5f, -25, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 386, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-25.5f, -25, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 52, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26.5f, -25, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 493, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26.5f, -25, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 410, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-13.5f, -25, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 402, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -1, -1, -0.5f, -1, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-13.5f, -25, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 97, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 36, 3, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-13, 6, -8).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		this.groups.add(SD70MACcb);
	}

	private final void initGroup_F40phcb(){
		TurboList F40phcb = new TurboList("F40phcb");
		F40phcb.add(new ModelRendererTurbo(F40phcb, 205, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f)
				.setRotationPoint(47.1f, -22.8f, -1).setRotationAngle(0, 0, 0)
		);
		F40phcb.add(new ModelRendererTurbo(F40phcb, 371, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
				.setRotationPoint(47.3f, -22.449999f, -0.5f).setRotationAngle(0, 0, 0).setName("Headlight_top_top")
		);
		F40phcb.add(new ModelRendererTurbo(F40phcb, 363, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.3f, 0.2f, 0, 0.3f, 0.2f, 0, 0.3f, 0.2f, 0, 0.3f, 0.2f, 0, 0.4f, 0.2f, 0, 0.4f, 0.2f, 0, 0.4f, 0.2f, 0, 0.3f, 0.2f)
				.setRotationPoint(47.2f, -22.349998f, -0.5f).setRotationAngle(0, 0, 0)
		);
		F40phcb.add(new ModelRendererTurbo(F40phcb, 126, 40, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
				.setRotationPoint(47.3f, -21.099998f, -0.5f).setRotationAngle(0, 0, 0).setName("Headlight_top_bottom")
		);
		F40phcb.add(new ModelRendererTurbo(F40phcb, 194, 179, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 7, 2, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4)
				.setRotationPoint(39, -13, -7).setRotationAngle(0, 0, 0)
		);
		F40phcb.add(new ModelRendererTurbo(F40phcb, 428, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
				.setRotationPoint(37, -12, -3.5f).setRotationAngle(0, 0, 0)
		);
		F40phcb.add(new ModelRendererTurbo(F40phcb, 61, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
				.setRotationPoint(42, -11, -7).setRotationAngle(0, 0, 0)
		);
		F40phcb.add(new ModelRendererTurbo(F40phcb, 505, 35, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(39, -13, -4.75f).setRotationAngle(0, 0, 0)
		);
		F40phcb.add(new ModelRendererTurbo(F40phcb, 124, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
				.setRotationPoint(37, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(F40phcb);
	}

	private final void initGroup_SD45cb(){
		TurboList SD45cb = new TurboList("SD45cb");
		SD45cb.add(new ModelRendererTurbo(SD45cb, 501, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, -2, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -2, 0, 0.25f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(-10, -23, -9).setRotationAngle(0, 0, 0)
		);
		SD45cb.add(new ModelRendererTurbo(SD45cb, 501, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 2, 0, 0, 0, -2, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -2, -2, 0, -0.5f, -1.5f, 0, -0.5f, 0, 0, -2, 0)
				.setRotationPoint(-10, -21.75f, -9).setRotationAngle(0, 0, 0)
		);
		SD45cb.add(new ModelRendererTurbo(SD45cb, 186, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(-7, -23, -9).setRotationAngle(0, 0, 0)
		);
		SD45cb.add(new ModelRendererTurbo(SD45cb, 204, 27, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 3, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, 0, -0.5f, 0,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(-7, -21.75f, -9).setRotationAngle(0, 0, 0)
		);
		SD45cb.add(new ModelRendererTurbo(SD45cb, 456, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, -0.5f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0, 0.25f, -2, 0, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(14, -23, -9).setRotationAngle(0, 0, 0)
		);
		SD45cb.add(new ModelRendererTurbo(SD45cb, 456, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 3, 2, 0, 0, 0, -0.5f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1.5f, 0, -2, -2, 0, -2, 0, 0, -0.5f, 0)
				.setRotationPoint(14, -21.75f, -9).setRotationAngle(0, 0, 0)
		);
		this.groups.add(SD45cb);
	}

	private final void initGroup_SD38cb(){
		TurboList SD38cb = new TurboList("SD38cb");
		SD38cb.add(new ModelRendererTurbo(SD38cb, 30, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 11, 0, 0, 0, 0, -0.75f, 0, 0, 1.25f, 0, 0, -2, 0, 0, -1, 0, 0, 0.25f, 0, 0, 2.25f, 0, 0, -3, 0, 0)
				.setRotationPoint(63.25f, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		SD38cb.add(new ModelRendererTurbo(SD38cb, 427, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.17f, 0, 0, -0.92f, 0, 0, -0.74f, 0, 0, -0.01f, 0, 0, 0.17f, -1, 0, -0.92f, -1, 0, -0.45f, 0, 0, -0.3f, 0, 0)
				.setRotationPoint(64.6f, 7.5f, -10).setRotationAngle(0, 0, 0)
		);
		SD38cb.add(new ModelRendererTurbo(SD38cb, 0, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 9, 0, -0.01f, 0, 0, -0.74f, 0, 0, 0.9f, 0, 0, -1.65f, 0, 0, -0.3f, 0, 0, -0.45f, 0, 0, 1.55f, 0, 0, -2.4f, 0, 0)
				.setRotationPoint(64.6f, 7.5f, -9).setRotationAngle(0, 0, 0)
		);
		SD38cb.add(new ModelRendererTurbo(SD38cb, 403, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 11, 0, -2, 0, 0, 1.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -3, 0, 0, 2.25f, 0, 0, 0.25f, 0, 0, -1, 0, 0)
				.setRotationPoint(63.25f, 5.5f, 0).setRotationAngle(0, 0, 0)
		);
		SD38cb.add(new ModelRendererTurbo(SD38cb, 248, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.01f, 0, 0, -0.74f, 0, 0, -0.92f, 0, 0, 0.17f, 0, 0, -0.3f, 0, 0, -0.45f, 0, 0, -0.92f, -1, 0, 0.17f, -1, 0)
				.setRotationPoint(64.6f, 7.5f, 9).setRotationAngle(0, 0, 0)
		);
		SD38cb.add(new ModelRendererTurbo(SD38cb, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 9, 0, -1.65f, 0, 0, 0.9f, 0, 0, -0.74f, 0, 0, -0.01f, 0, 0, -2.4f, 0, 0, 1.55f, 0, 0, -0.45f, 0, 0, -0.3f, 0, 0)
				.setRotationPoint(64.6f, 7.5f, 0).setRotationAngle(0, 0, 0)
		);
		SD38cb.add(new ModelRendererTurbo(SD38cb, 326, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 2, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(38, -24.5f, -4).setRotationAngle(0, 0, 0)
		);
		this.groups.add(SD38cb);
	}

	private final void initGroup_SD60MACcb(){
		TurboList SD60MACcb = new TurboList("SD60MACcb");
		SD60MACcb.add(new ModelRendererTurbo(SD60MACcb, 231, 49, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f)
				.setRotationPoint(58.5f, -14.75f, -1).setRotationAngle(0, 0, 0)
		);
		SD60MACcb.add(new ModelRendererTurbo(SD60MACcb, 0, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(58.8f, -15.05f, -1).setRotationAngle(0, 0, 0)
		);
		SD60MACcb.add(new ModelRendererTurbo(SD60MACcb, 0, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(58.8f, -13.45f, -1).setRotationAngle(0, 0, 0)
		);
		SD60MACcb.add(new ModelRendererTurbo(SD60MACcb, 505, 27, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(58.9f, -13.45f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_low")
		);
		SD60MACcb.add(new ModelRendererTurbo(SD60MACcb, 505, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(58.9f, -15.05f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_high")
		);
		this.groups.add(SD60MACcb);
	}

	private final void initGroup_M420bcb(){
		TurboList M420bcb = new TurboList("M420bcb");
		M420bcb.add(new ModelRendererTurbo(M420bcb, 496, 19, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
				.setRotationPoint(3, -22, 7.25f).setRotationAngle(0, 0, 0)
		);
		M420bcb.add(new ModelRendererTurbo(M420bcb, 240, 4, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
				.setRotationPoint(2.75f, -22.25f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		M420bcb.add(new ModelRendererTurbo(M420bcb, 496, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, 0)
				.setRotationPoint(3, -21.75f, 7.25f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(M420bcb);
	}

	private final void initGroup_C424cb(){
		TurboList C424cb = new TurboList("C424cb");
		C424cb.add(new ModelRendererTurbo(C424cb, 12, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f)
				.setRotationPoint(45.5f, -23.5f, -1).setRotationAngle(0, 0, 0)
		);
		C424cb.add(new ModelRendererTurbo(C424cb, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f)
				.setRotationPoint(45.5f, -25.25f, -1).setRotationAngle(0, 0, 0).setName("Beacon2")
		);
		this.groups.add(C424cb);
	}

	private final void initGroup_GP50_Explodecb(){
		TurboList GP50_Explodecb = new TurboList("GP50_Explodecb");
		GP50_Explodecb.add(new ModelRendererTurbo(GP50_Explodecb, 97, 160, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f)
				.setRotationPoint(64.5f, -9, -1.5f).setRotationAngle(0, 0, 0)
		);
		GP50_Explodecb.add(new ModelRendererTurbo(GP50_Explodecb, 83, 158, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0)
				.setRotationPoint(64.5f, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		GP50_Explodecb.add(new ModelRendererTurbo(GP50_Explodecb, 113, 160, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(58, -15, -1).setRotationAngle(0, 0, 0)
		);
		this.groups.add(GP50_Explodecb);
	}

}
