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
public class CFA164 extends RollingStockModel {

	public CFA164(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		initGroup_group0();
		initGroup_clipboard();
		initGroup_RS10cb();
		initGroup_FPA4cb();
		initGroup_F40phcb();
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 35, 127, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 1, 8, 1, 1, 3, null)
				.setRotationPoint(56.25f, -9.5f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 105, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-24, -20.5f, -4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 158, 67, textureX, textureY).addBox(0, 0, 0, 8, 1, 4)
				.setRotationPoint(20, -20.25f, -2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 75, 117, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(-38, 2, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 448, 118, textureX, textureY).addBox(-1, 0, -3.75f, 1, 2, 4)
				.setRotationPoint(55.25f, -11.25f, -5).setRotationAngle(0, 43, 0).setName("Numberboard_Right")
		);
		group0.add(new ModelRendererTurbo(group0, 79, 111, textureX, textureY)
				.addShapeBox(-0.25f, -0.5f, -0.35f, 1, 1, 1, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
				.setRotationPoint(51.25f, -10.25f, 7.75f).setRotationAngle(0, -52, 0).setName("Markerlight_Left")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0)
				.setRotationPoint(47, 1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 509, 72, textureX, textureY)
				.addShapeBox(0, 0, -1, 0, 4, 1, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(41.95f, -16, -11).setRotationAngle(0, 0, -27)
		);
		group0.add(new ModelRendererTurbo(group0, 111, 60, textureX, textureY).addBox(0, 0, 0, 13, 1, 20)
				.setRotationPoint(31, -5, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 141, 82, textureX, textureY).addBox(0, 0, 0, 5, 2, 2)
				.setRotationPoint(20, -2, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 287, 126, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 8, 8, 1, 1, 4, null)
				.setRotationPoint(-28.5f, -8, 3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 212, 109, textureX, textureY).addCylinder(0, 0, 0, 4, 2, 8, 1, 1, 3, null)
				.setRotationPoint(4, -4, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 166, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, -1)
				.setRotationPoint(56.4f, -10.5f, -1).setRotationAngle(0, 0, 0).setName("Headlight")
		);
		group0.add(new ModelRendererTurbo(group0, 51, 155, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(40, -16, -11).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY).addBox(0, 0, 0, 100, 1, 20)
				.setRotationPoint(-56, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 0, textureX, textureY).addBox(0, 0, 0, 105, 1, 14)
				.setRotationPoint(-56, 1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 36, textureX, textureY)
				.addShapeBox(0, 0, 0, 99, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-57, -17, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 99, 1, 2, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 1, 0, 0, 1, 0)
				.setRotationPoint(-57, -18, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 99, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 1, 0, 0, 1, 0)
				.setRotationPoint(-57, -19.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 99, 1, 3, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -1, 0, 0, -1, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 1, 0, 0, 1, 0)
				.setRotationPoint(-57, -20.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 80, textureX, textureY).addBox(0, 0, 0, 22, 13, 1)
				.setRotationPoint(-57, -12, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 38, textureX, textureY)
				.addShapeBox(0, 0, 0, 98, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-57, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 34, textureX, textureY)
				.addShapeBox(0, 0, 0, 98, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 1, 0, 0, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-57, -18, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 99, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1, 0, 0, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(-57, -19.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 22, textureX, textureY)
				.addShapeBox(0, 0, 0, 99, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 1, 0, 0, 1, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f)
				.setRotationPoint(-57, -20.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 95, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-57, -19.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(38, -19.5f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 95, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
				.setRotationPoint(-57, -20.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 95, 1, 3, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, -1, 0, 0, -1, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-57, -20.75f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(38, -19.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(38, -19.75f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 6, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -5, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(31, -5, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(31, -2.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(31, 0, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(31, 3, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(31, 5.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 11, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(30, -5, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(34, -5, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 108, textureX, textureY).addBox(0, 0, 0, 8, 17, 1)
				.setRotationPoint(34, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 123, textureX, textureY)
				.addShapeBox(1, 0, 0, 3, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(30, -5, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 99, textureX, textureY)
				.addShapeBox(1, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(30, -5, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 106, textureX, textureY).addBox(0, 0, 0, 8, 17, 1)
				.setRotationPoint(34, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 126, textureX, textureY).addBox(0, 0, 0, 2, 13, 1)
				.setRotationPoint(42, -12, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 12, 1, 0, 0, 0, 0, 0, 0, -1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0)
				.setRotationPoint(44, -12, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 12, 1, 0, 0, 0, 0, 0, 0, -3, -0.5f, 1, 2.5f, 0, 1, 0, 0, 0, 0, 0, 0, -3, -0.5f, 0, 2.5f, 0, 0, 0)
				.setRotationPoint(49, -12, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 4, 0, 0.5f, 1, -0.5f, -1, 0, 0, 2.5f, 0, 0, -2.5f, 1, 0, 0.5f, 0, -0.5f, -1, 0, 0, 2.5f, 0, 0, -2.5f, 0, 0)
				.setRotationPoint(53, -12, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 3, 0, -0.5f, 1, 0, 0.5f, 0, 0, 1.25f, 0, 0, -1.1f, 1, 0, -0.5f, 0, 0, 0.5f, 0, 0, 1.25f, 0, 0, -1, 0, 0)
				.setRotationPoint(55, -12, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 126, textureX, textureY).addBox(0, 0, 0, 2, 13, 1)
				.setRotationPoint(42, -12, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 3, 0, -1.1f, 1, 0, 1.25f, 0, 0, 0.5f, 0, 0, -0.5f, 1, 0, -1, 0, 0, 1.25f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(55, -12, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 4, 0, -2.5f, 1, 0, 2.5f, 0, 0, -1, 0, 0, 0.5f, 1, -0.5f, -2.5f, 0, 0, 2.5f, 0, 0, -1, 0, 0, 0.5f, 0, -0.5f)
				.setRotationPoint(53, -12, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 12, 1, 0, 0, 1, 0, -0.5f, 1, 2.5f, 0, 0, -3, 0, 0, 0, 0, 0, 0, -0.5f, 0, 2.5f, 0, 0, -3, 0, 0, 0)
				.setRotationPoint(49, -12, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 12, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(44, -12, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 13, 1, 0, 0, 0, 0, 0, 0, -1, -1.5f, 0.5f, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, 1, 0, 0, 0)
				.setRotationPoint(44, -13, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 22, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1, 0, 0, -0.5f, 0, -2.5f, -1.75f, 0.7f, 2.5f, 0.5f, 0.5f, 0, 0, 0, 0, -0.25f, 0, -3, -0.75f, 0, 2.5f, 0.5f, 0, 0)
				.setRotationPoint(48, -13, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 14, 1, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0.15f, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -13.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 14, 3, 0, 1, 0.15f, -0.5f, -4.5f, 0, -0.5f, -0.75f, 0.2f, 0, -0.5f, 0.6f, 0, 1, 0, -0.5f, -4.5f, 0, -0.5f, -0.75f, 0, 0, -0.5f, 0, 0,
						new boolean[]{ false, false, false, false, true, false })
				.setRotationPoint(45, -13.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, -0.25f, 0.8f, 0, 0.5f, 0, 0, 1.1f, 0, 0, -1.45f, 0.9f, 0, -0.5f, 0, 0, 0.5f, 0, 0, 1, 0, 0, -1, 0, 0)
				.setRotationPoint(53, -13, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 14, 3, 0, 0, 1.1f, 0, -0.75f, 0.3f, 0, 0.45f, 0.4f, 0, 0, 1.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(46, -13.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 4, 0, -0.25f, 0.7f, -1.5f, -0.5f, 0, -0.5f, 2.5f, 0, 0, -2.25f, 0.8f, 0, -0.25f, 0, -1.5f, -1, 0, 0, 2.5f, 0, 0, -2.5f, 0, 0)
				.setRotationPoint(51, -13, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 14, 3, 0, 0.5f, 0.6f, -0.5f, -2.75f, 0.2f, -0.5f, -0.75f, 0.3f, 0, 0, 1.1f, 0, 0.5f, 0, -0.5f, -2.75f, 0, -0.5f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(46, -13.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0.5f, 0, -1.75f, 0.7f, 2.5f, -0.5f, 0, -2.5f, -1, 0, 0, 0.5f, 0, 0, -0.75f, 0, 2.5f, -0.25f, 0, -3, 0, 0, 0)
				.setRotationPoint(48, -13, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, -1.45f, 0.9f, 0, 1.1f, 0, 0, 0.5f, 0, 0, -0.25f, 0.8f, 0, -1, 0, 0, 1, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(53, -13, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 4, 0, -2.25f, 0.8f, 0, 2.5f, 0, 0, -0.5f, 0, -0.5f, -0.25f, 0.7f, -1.5f, -2.5f, 0, 0, 2.5f, 0, 0, -1, 0, 0, -0.25f, 0, -1.5f)
				.setRotationPoint(51, -13, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 13, 1, 0, 0, 0.5f, 0, -1.5f, 0.5f, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 1, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(44, -13, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 4, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -2.5f, -1, 0, 2.5f, -1, 0, 3.25f, -1, -0.75f, -2.25f, -1, -0.75f)
				.setRotationPoint(44.5f, -18.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 351, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 3, 0, 1, -0.5f, 0, -1, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -2, -0.5f, 0, 2, -0.5f, 0, 3, -1, -0.25f, -3, -1, -0.25f)
				.setRotationPoint(44, -18.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -2.25f, 0, 0, 2.25f, 0, 0, 3, -1, 0, -3, -1, 0)
				.setRotationPoint(43, -18.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0.5f, -1, 0, -0.5f, -1, 0, 0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -2.25f, 0, 0, 2.25f, 0, 0, 3.25f, -1, 0, -3.25f, -1, 0)
				.setRotationPoint(42, -17.25f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 1, -1, 0, -1.5f, -1, 0, -0.75f, 0.5f, 0, 1, 0.5f, 0, 1, 1, 0, -0.5f, 0.75f, 0, 0.25f, -0.5f, 0, 1, -0.5f, 0)
				.setRotationPoint(42, -18, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, -0.75f, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1, 0, 0.25f, 1, 0, 1, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(42, -19.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 1, 0, 1, 1, 0, 2, 0.5f, -0.25f, 0, 0.5f, -0.25f)
				.setRotationPoint(42, -20.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0.25f, 0, -0.94f, 0.25f, 0, -0.44f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
				.setRotationPoint(38, -19.25f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(43, -19.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -1, 0, 0, -0.23f, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, -0.68f, -0.75f, 0, -0.23f, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(43.75f, -19.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -2, 0, 0, -1.36f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.835f, 0, 0, 0, 0, 0)
				.setRotationPoint(42, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, -0.75f, -0.25f, -1.125f, -0.75f, -0.25f, -0.5f, -0.75f, 0, 1, -0.75f, 0, 1, 0, 0, -1, 0, 0, -0.36f, 0, 0, 1, 0, 0)
				.setRotationPoint(42, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.5f, 0, -1, 0.5f, 0, -1, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, -0.5f, 0.75f, 0, 0, 1, 0)
				.setRotationPoint(42, -18, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, -1, 0, 0, -1, 0, 0, 0.25f, 0, 1, 0.25f, 0, 0.25f, 1, 0, 0, 1, 0)
				.setRotationPoint(42, -19.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.25f, 0.75f, -0.5f, -0.25f, 0, -1, 0, 0, -1, 0, 0, 0.5f, -0.25f, 2, 0.5f, -0.25f, 1, 1, 0, 0, 1, 0)
				.setRotationPoint(42, -20.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(43, -19.75f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -1.36f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0.835f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(42, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -1, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(42, -17, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.5f, -0.75f, 0, -1, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, -0.36f, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(42, -17, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, 0, -1, -1.5f, 0, -1, -1.5f, 0, 0, 1, 0, 0, 1, -0.25f, -0.25f, -1.125f, -0.25f, -0.25f, -0.5f, -0.25f, 0, 1, -0.25f, 0)
				.setRotationPoint(42, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 4, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, 0, 0.5f, 0, 0, -2.25f, -1, -0.75f, 3.25f, -1, -0.75f, 2.5f, -1, 0, -2.5f, -1, 0)
				.setRotationPoint(44.5f, -18.75f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, 0, -0.25f, 0, 0, -0.25f, -1, -0.5f, 0, 1, -0.5f, 0, -3, -1, -0.25f, 3, -1, -0.25f, 2, -0.5f, 0, -2, -0.5f, 0)
				.setRotationPoint(44, -18.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 2, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, 0.75f, -0.75f, 0, -3, -1, 0, 3, -1, 0, 2.25f, 0, 0, -2.25f, 0, 0)
				.setRotationPoint(43, -18.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 2, 0, -0.25f, 0.25f, 0, 0.25f, 0.25f, 0, -0.5f, -1, 0, 0.5f, -1, 0, -3.25f, -1, 0, 3.25f, -1, 0, 2.25f, 0, 0, -2.25f, 0, 0)
				.setRotationPoint(42, -17.25f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 125, textureX, textureY).newCylinderBuilder()
				.setPosition(0, 0, 0).setRadius(1.75f, 1.5f).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(-0.75, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(57.25f, -9.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 14, 1, 0, 0, 0.15f, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0)
				.setRotationPoint(44, -13.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 14, 3, 0, -0.5f, 0.6f, 0, -0.75f, 0.2f, 0, -4.5f, 0, -0.5f, 1, 0.15f, -0.5f, -0.5f, 0, 0, -0.75f, 0, 0, -4.5f, 0, -0.5f, 1, 0, -0.5f,
						new boolean[]{ false, false, false, false, true, false })
				.setRotationPoint(45, -13.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 14, 3, 0, 0, 1.5f, 0, 0.45f, 0.4f, 0, -0.75f, 0.3f, 0, 0, 1.1f, 0, 0, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(46, -13.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 14, 3, 0, 0, 1.1f, 0, -0.75f, 0.3f, 0, -2.75f, 0.2f, -0.5f, 0.5f, 0.6f, -0.5f, 0, 0, 0, -0.55f, 0, 0, -2.75f, 0, -0.5f, 0.5f, 0, -0.5f)
				.setRotationPoint(46, -13.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0.25f, 0.25f, -0.44f, 0.25f, 0.25f, -0.94f, 0.25f, 0, 0, 0.25f, 0, 0, -0.5f, 0.25f, 0.5f, -0.5f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(38, -19.25f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, -0.23f, -0.25f, 0, -1, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.23f, -0.75f, 0, -0.68f, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(43.75f, -19.75f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 99, textureX, textureY)
				.addShapeBox(1, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(30, -2.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 99, textureX, textureY)
				.addShapeBox(1, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(30, 0, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 97, textureX, textureY)
				.addShapeBox(1, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(30, 3, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 97, textureX, textureY)
				.addShapeBox(1, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(30, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 11, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(30, -5, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(34, -5, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 416, 95, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(-35, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(-35, 3, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(-35, 5.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-36, 0, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-32, 0, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-36, -10, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-32, -10, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(29.5f, -15, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(34.5f, -15, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 56, textureX, textureY).addBox(0, 0, 0, 63, 13, 1)
				.setRotationPoint(-32, -12, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 125, textureX, textureY).addBox(0, 0, 0, 2, 4, 1)
				.setRotationPoint(-57, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 128, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(30, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 4, 1, 0, -2.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.5f, 0, 0, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 1, 0, 0)
				.setRotationPoint(24, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 78, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -4, 0, 0, -4, 0, 0, -4, -0.5f, 0, -4, -0.5f)
				.setRotationPoint(-55, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -3.5f, 0, -3, -3.5f, 0, -3, -3.5f, -0.5f, 0, -3.5f, -0.5f)
				.setRotationPoint(23, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3, 0, 0, 2.5f, 0, 0, 2.5f, 0, -0.5f, -3, 0, -0.5f, 0, -0.5f, 0, -1, 0, 0, -1, 0, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(23, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 115, textureX, textureY)
				.addShapeBox(0, 0, -1, 4, 11, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 115, textureX, textureY)
				.addShapeBox(0, 0, -1, 4, 11, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(-35, -11, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 71, textureX, textureY).addBox(0, 0, 0, 22, 13, 1)
				.setRotationPoint(-57, -12, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 89, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(-35, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-35, 3, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-35, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-36, 0, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, 0, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-36, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(29.5f, -15, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 16, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(34.5f, -15, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 52, textureX, textureY).addBox(0, 0, 0, 63, 13, 1)
				.setRotationPoint(-32, -12, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 11, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 11, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(-35, -11, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-24, -20.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 52, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
				.setRotationPoint(22, -20.25f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 52, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
				.setRotationPoint(22, -20.25f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
				.setRotationPoint(20, -20.25f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(20, -20.25f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
				.setRotationPoint(26, -20.25f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26, -20.25f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 91, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(32, 2, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 125, textureX, textureY).addBox(0, 0, 0, 2, 4, 1)
				.setRotationPoint(-57, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 77, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(-35, -12, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 77, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(-35, -12, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 78, 8, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -4, -0.5f, 0, -4, -0.5f, 0, -4, 0, 0, -4, 0)
				.setRotationPoint(-55, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 128, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(30, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 70, textureX, textureY).addBox(0, 0, 0, 5, 1, 22)
				.setRotationPoint(44, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 2, 22, 0, 0, 0, 0, 0.5f, 0, -5.5f, 0.5f, 0, -5.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -5.5f, 0.5f, 0, -5.5f, 0, 0, 0)
				.setRotationPoint(49, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 6, 0, -0.5f, 0, -0.5f, -2.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -2.5f, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(55, 0, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 6, 0, -0.5f, 0, 0, 0, 0, 0, -2.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, -2.5f, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(55, 0, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 103, textureX, textureY).addBox(0, 0, 0, 1, 13, 8)
				.setRotationPoint(-56.5f, -13, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 114, textureX, textureY)
				.addShapeBox(-1, 0, 0, 1, 13, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-55.5f, -13, -2).setRotationAngle(0, 0, 0).setName("Door_Rear")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 103, textureX, textureY).addBox(0, 0, 0, 1, 13, 8)
				.setRotationPoint(-56.5f, -13, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 82, textureX, textureY).addBox(0, 0, 0, 1, 3, 20)
				.setRotationPoint(-56.5f, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.5f, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-56.5f, 1, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 14, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57, 1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 20, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 13, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57.5f, -13, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57.5f, -19, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 13, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57.5f, -13, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57.5f, -19, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57.5f, -14, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57.5f, -16, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.5f, -18, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.5f, -18, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.5f, -18, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.5f, -19, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.5f, -19, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.5f, -19, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(-56, 3, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-57, 0, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-53, 0, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(-56, 5.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-57, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-53, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 36, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(-56.5f, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-56, 3, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57, 0, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, 0, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-56, 5.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57, -8, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, -8, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 22, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-56.5f, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 8, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57.5f, 0, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0)
				.setRotationPoint(-58, 0, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f)
				.setRotationPoint(-58, -3, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f)
				.setRotationPoint(-58, -2, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(-58, -3, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(-58, -2, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 95, textureX, textureY).addBox(-1, 0, -0.25f, 1, 2, 4)
				.setRotationPoint(55.25f, -11.25f, 5).setRotationAngle(0, -43, 0).setName("Numberboard_Left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 94, textureX, textureY)
				.addShapeBox(0.5f, -0.5f, 0.35f, 1, 1, 1, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
				.setRotationPoint(50, -10.25f, -7.75f).setRotationAngle(0, 52, 0).setName("Markerlight_Right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(56.5f, -8, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(56.5f, -8, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.35f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.85f, 0, -0.5f, 0.35f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f)
				.setRotationPoint(47, -2, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.25f, 0, 0, -1.25f, 0, 0, 0.75f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -1.25f, 0, -0.5f, 0.75f, 0, -0.5f, -0.75f)
				.setRotationPoint(49, -2, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.35f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.85f, 0, -0.5f, 0.35f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f)
				.setRotationPoint(47, -5, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.25f, 0, 0, -1.25f, 0, 0, 0.75f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -1.25f, 0, -0.5f, 0.75f, 0, -0.5f, -0.75f)
				.setRotationPoint(49, -5, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.85f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.35f, 0, -0.5f, -0.85f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.35f)
				.setRotationPoint(47, -2, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, 0, 0, 0.75f, 0, 0, -1.25f, 0, 0, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f, 0.75f, 0, -0.5f, -1.25f, 0, -0.5f, 0.25f)
				.setRotationPoint(49, -2, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.85f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.35f, 0, -0.5f, -0.85f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.35f)
				.setRotationPoint(47, -5, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, 0, 0, 0.75f, 0, 0, -1.25f, 0, 0, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f, 0.75f, 0, -0.5f, -1.25f, 0, -0.5f, 0.25f)
				.setRotationPoint(49, -5, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 86, textureX, textureY).addBox(0, 0, 0, 2, 2, 10)
				.setRotationPoint(-56.5f, 3, -5).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 71, textureX, textureY).addBox(0, 0, 0, 1, 1, 22)
				.setRotationPoint(-56, 3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 127, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-56, 2, -4).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 127, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-56, 2, 3).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-57, 3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57, 3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0)
				.setRotationPoint(-24, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 35, 4, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-19, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 35, 3, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -3, 0, 0, -3)
				.setRotationPoint(-19, 6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0, 0)
				.setRotationPoint(16, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 86, textureX, textureY).addBox(0, 0, 0, 11, 6, 1)
				.setRotationPoint(-19, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0)
				.setRotationPoint(-24, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 0, 0, 0)
				.setRotationPoint(16, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 36, textureX, textureY).addBox(0, 0, 0, 22, 6, 1)
				.setRotationPoint(-6, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 91, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-8, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-8, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 84, textureX, textureY).addBox(0, 0, 0, 11, 6, 1)
				.setRotationPoint(-19, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 30, textureX, textureY).addBox(0, 0, 0, 22, 6, 1)
				.setRotationPoint(-6, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 71, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-8, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-8, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 78, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-55, -16, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -3, 0, 0, -3, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(23, -16, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 78, 4, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-55, -16, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 4, 1, 0, -2.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2.5f, 0, -0.5f, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 1, 0, -0.5f)
				.setRotationPoint(24, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 7, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -3.5f, -0.5f, -3, -3.5f, -0.5f, -3, -3.5f, 0, 0, -3.5f, 0)
				.setRotationPoint(23, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3, 0, -0.5f, 2.5f, 0, -0.5f, 2.5f, 0, 0, -3, 0, 0, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -0.5f, 0)
				.setRotationPoint(23, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -3, 0, -0.5f, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(23, -16, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 108, textureX, textureY).addBox(0, 0, 0, 2, 1, 6)
				.setRotationPoint(56.5f, 1, -3).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0)
				.setRotationPoint(47, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, -0.85f, -0.5f, 0, 0.65f, 0, 0, 0, 0, 0, 0, 0, 0, -0.85f, -0.5f, 0, 0.65f, 0, 0, 0)
				.setRotationPoint(49, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, 0, 0, 0, -3.38f, -0.5f, 0, 2.38f, 0, 0, 0, 0, 0, 0, 0, 0, -3.38f, -0.5f, 0, 2.38f, 0, 0, 0)
				.setRotationPoint(51.5f, 2, -8.88f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -0.5f, 0, -1.27f, -0.5f, 0, 1.27f, 0.5f, 0, -0.2f, 0, 0, 0, -0.5f, 0, -1.27f, -0.5f, 0, 1.27f, 0.5f, 0, -0.2f)
				.setRotationPoint(50, 5, -10.15f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, -0.5f, -2.5f, 0, -0.5f, 0, 0, 0, -2, 0, 0, 0, 0, -0.5f, -2.5f, 0, -0.5f, 0, 0, 0, -2, 0, 0)
				.setRotationPoint(55, 6, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 6, 0, 0, -0.5f, -0.5f, -2.5f, -0.5f, -0.5f, 0, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, -0.5f, -2, 0, -0.5f, 1, 0, 0, -3, 0, 0)
				.setRotationPoint(55, 6.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0.6f, -0.5f, -3.5f, -0.6f, -0.5f, -3.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, 2, 0, 0, -2, 0, 0)
				.setRotationPoint(55, 4, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.06f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0.6f, 0, 0.5f, -0.8f, 0, 0.5f)
				.setRotationPoint(55, 1.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0.65f, 0, 0, -0.85f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.65f, 0, 0, -0.85f, 0, 0, 0)
				.setRotationPoint(49, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 5, 1, 0, 0, 0, 0, -0.5f, 0, 2.38f, 0, 0, -3.38f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 2.38f, 0, 0, -3.38f, 0, 0, 0)
				.setRotationPoint(51.5f, 2, 7.88f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.5f, 0, -0.2f, -0.5f, 0, 1.27f, -0.5f, 0, -1.27f, 0, 0, 0, 0.5f, 0, -0.2f, -0.5f, 0, 1.27f, -0.5f, 0, -1.27f, 0, 0, 0)
				.setRotationPoint(50, 5, 9.15f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 6, 0, -2, 0, 0, 0, 0, 0, -2.5f, 0, -0.5f, 0, 0, -0.5f, -2, 0, 0, 0, 0, 0, -2.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(55, 6, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 6, 0, -2, -0.5f, 0, 0, -0.5f, 0, -2.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -3, 0, 0, 1, 0, 0, -2, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(55, 6.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.6f, -0.5f, -3.5f, 0.6f, -0.5f, -3.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -2, 0, 0, 2, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(55, 4, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, -0.2f, -0.5f, -0.5f, -0.06f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.8f, 0, 0.5f, 0.6f, 0, 0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(55, 1.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 108, textureX, textureY).addBox(0, 0, 0, 2, 2, 6)
				.setRotationPoint(54.5f, 3, -3).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -1.2f, 0, 0, 0)
				.setRotationPoint(55, 3.5f, -5.5f).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 16, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(52.5f, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 38, textureX, textureY)
				.addShapeBox(0, 0, -1, 0, 4, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(41.95f, -16, 12).setRotationAngle(0, 0, -27)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 71, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
				.setRotationPoint(44, -5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 80, textureX, textureY).addBox(0, 0, 0, 1, 17, 20)
				.setRotationPoint(30, -17, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(30, -19, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(30, -19, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(30, -19, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 47, textureX, textureY).addBox(0, 0, 0, 5, 2, 2)
				.setRotationPoint(20, -2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 60, textureX, textureY).addBox(0, 0, 0, 7, 2, 2)
				.setRotationPoint(-46, -2, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 12, textureX, textureY).addBox(0, 0, 0, 7, 2, 2)
				.setRotationPoint(-46, -2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 80, textureX, textureY).addBox(0, 0, 0, 7, 7, 10)
				.setRotationPoint(11, -7, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 89, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(13, -8, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 77, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(14, -8, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 99, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(14, -7.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 95, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(13, -7.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 86, textureX, textureY).addBox(0, 0, 0, 5, 12, 12)
				.setRotationPoint(-39, -12, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 86, textureX, textureY).addBox(0, 0, 0, 4, 12, 9)
				.setRotationPoint(-34, -12, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 89, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
				.setRotationPoint(-30.5f, -1, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 86, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
				.setRotationPoint(-30.5f, -7, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 78, textureX, textureY).addBox(0, 0, 0, 4, 4, 3)
				.setRotationPoint(-55, -4, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 71, textureX, textureY).addBox(0, 0, 0, 4, 3, 3)
				.setRotationPoint(-33, -3, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 93, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
				.setRotationPoint(-29, -3, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 116, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 3, 8, 1, 1, 0, null)
				.setRotationPoint(-27.5f, -1.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 111, textureX, textureY).addCylinder(0, 0, 0, 1.25f, 1, 8, 1, 1, 0, null)
				.setRotationPoint(-27.5f, -1.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 111, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1, 5, 0, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
				.setRotationPoint(-27.5f, -1.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 91, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
				.setRotationPoint(26, -3, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 115, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 3, 8, 1, 1, 0, null)
				.setRotationPoint(27.5f, -1.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 107, textureX, textureY).addCylinder(0, 0, 0, 1.25f, 1, 8, 1, 1, 0, null)
				.setRotationPoint(27.5f, -1.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 106, textureX, textureY).addCylinder(0, 0, 0, 0.75f, 1, 5, 0, 0.5f, 0, new Vec3f(0.0, 0.0, -0.5))
				.setRotationPoint(27.5f, -1.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 86, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
				.setRotationPoint(27, -3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 108, textureX, textureY).addCylinder(0, 0, 0, 1.5f, 3, 8, 1, 1, 0, null)
				.setRotationPoint(28.5f, -1.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 104, textureX, textureY).addCylinder(0, 0, 0, 1.25f, 1, 8, 1, 1, 0, null)
				.setRotationPoint(28.5f, -1.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 103, textureX, textureY).addCylinder(0, 0, 0, 0.5f, 1, 5, 0, 1.5f, 0, new Vec3f(0.0, 0.0, -0.5))
				.setRotationPoint(28.5f, -1.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 86, textureX, textureY).addBox(0, 0, 0, 4, 2, 2)
				.setRotationPoint(25.5f, -2, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 39, textureX, textureY).addBox(0, 0, 0, 2, 2, 5)
				.setRotationPoint(25.5f, -2, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 85, textureX, textureY).addBox(0, 0, 0, 4, 2, 2)
				.setRotationPoint(25.5f, -2, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 84, textureX, textureY).addBox(0, 0, 0, 1, 14, 16)
				.setRotationPoint(44, -13.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.85f, 0, -1, -0.85f, 0, 0.5f, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, -1, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(44, -14.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(44, -14.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -14.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -14.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, -1, -0.85f, 0, 0, -0.85f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -14.5f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, -0.5f, -0.4f, 0, 0, -0.4f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -14.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 81, textureX, textureY).addBox(0, 0, 0, 8, 1, 6)
				.setRotationPoint(36, -6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 72, textureX, textureY).addBox(0, 0, 0, 8, 1, 6)
				.setRotationPoint(36, -6, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 0, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
				.setRotationPoint(40, -7, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 16, textureX, textureY).addBox(0, 0, 0, 4, 1, 2)
				.setRotationPoint(40, -6, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 111, textureX, textureY).addBox(0, 0, 0, 3, 8, 3)
				.setRotationPoint(41, -14, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(40, -14, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(41, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 80, textureX, textureY).addBox(0, 0, 0, 2, 4, 2)
				.setRotationPoint(42, -11, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 95, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(43, -10, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(42, -10, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 94, textureX, textureY)
				.addShapeBox(0, 0, -0.5f, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(40, -13, -5).setRotationAngle(0, -45, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 94, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(42.5f, -12, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
				.setRotationPoint(42.5f, -12, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
				.setRotationPoint(42, -13, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 89, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(41, -9, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 71, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(42, -9, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 282, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
				.setRotationPoint(43, -11.6f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 86, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(37, -9, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 72, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
				.setRotationPoint(35.5f, -10, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 84, textureX, textureY).addBox(0, 0, 0, 1, 4, 4)
				.setRotationPoint(35.5f, -14, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 82, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(37, -9, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 71, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
				.setRotationPoint(35.5f, -10, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 55, textureX, textureY).addBox(0, 0, 0, 1, 4, 4)
				.setRotationPoint(35.5f, -14, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 67, textureX, textureY).addBox(0, 0, 0, 24, 7, 6)
				.setRotationPoint(-20, -13, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 28, 3, 6, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-20, -16, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 26, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1)
				.setRotationPoint(-20, -6, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 26, textureX, textureY).addBox(0, 0, 0, 22, 2, 1)
				.setRotationPoint(-18, -13, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 66, textureX, textureY).addBox(0, 0, 0, 18, 4, 1)
				.setRotationPoint(-18, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 76, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
				.setRotationPoint(-20, -8, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 71, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
				.setRotationPoint(-20, -8, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 10, textureX, textureY).addBox(0, 0, 0, 22, 2, 1)
				.setRotationPoint(-18, -13, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 60, textureX, textureY).addBox(0, 0, 0, 18, 4, 1)
				.setRotationPoint(-18, -11, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 92, textureX, textureY).addBox(0, 0, 0, 4, 8, 8)
				.setRotationPoint(-25, -15.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 80, textureX, textureY).addBox(0, 0, 0, 4, 2, 2)
				.setRotationPoint(-24, -7, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 16, textureX, textureY).addBox(0, 0, 0, 4, 2, 2)
				.setRotationPoint(-24, -7, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 108, textureX, textureY).addCylinder(0, 0, 0, 4, 2, 8, 1, 0.75f, 3, null)
				.setRotationPoint(6, -4, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 71, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 8, 1, 1, 3, null)
				.setRotationPoint(7.5f, -4, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 82, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 3, null)
				.setRotationPoint(8.5f, -5.25f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 81, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 3, null)
				.setRotationPoint(8.5f, -3.25f, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 81, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 1, 1, 3, null)
				.setRotationPoint(8.5f, -3.25f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 97, textureX, textureY).addBox(0, 0, 0, 4, 4, 6)
				.setRotationPoint(4, -13, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, -1, 0, 0, 0)
				.setRotationPoint(4, -13, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1, 0, 0, 0, 0)
				.setRotationPoint(4, -13, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 2, 3, 0, -3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(2, -15.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 2, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -3, 0, 0)
				.setRotationPoint(2, -15.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 67, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(-24, -8, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 67, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(-24, -8, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 60, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
				.setRotationPoint(-22, -4.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 55, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
				.setRotationPoint(-22, -4.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 5, textureX, textureY).addCylinder(0, 0, 0, 3, 2, 8, 1, 1, 3, null)
				.setRotationPoint(9.5f, -4, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-20, -3, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0, -1, -0.5f, 0, -1, -0.5f)
				.setRotationPoint(-20, -1, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 9, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0.5f, -1, -1, 0.5f, -1, -1, -0.5f, 0, -1, -0.5f)
				.setRotationPoint(-4, -3, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 9, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0.5f, -1, -1, 0.5f, -1, -1, -0.5f, 0, -1, -0.5f)
				.setRotationPoint(-8, -3, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 9, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0.5f, -1, -1, 0.5f, -1, -1, -0.5f, 0, -1, -0.5f)
				.setRotationPoint(-12, -3, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 10, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, -2, 0, -1, 1.5f, -1, -1, 1.5f, -1, -1, -0.5f, 0, -1, -0.5f)
				.setRotationPoint(-16.5f, -3, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 252, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 9, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0.5f, -1, -1, 0.5f, -1, -1, -0.5f, 0, -1, -0.5f)
				.setRotationPoint(-20, -3, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(0, -3, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 10, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, -2, 0, -1, 1.5f, -1, -1, 1.5f, -1, -1, -0.5f, 0, -1, -0.5f)
				.setRotationPoint(-15.5f, -3, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 22, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-17, -1, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-20, -1, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(0, -3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-17, -1, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 154, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(40, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(37.5f, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(37.5f, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 149, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
				.setRotationPoint(-57.5f, 0, 5).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 154, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
				.setRotationPoint(-57.5f, -3.25f, 5).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 149, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
				.setRotationPoint(-57.5f, -6.5f, 5).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 158, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
				.setRotationPoint(-57.5f, -9.75f, 5).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 147, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
				.setRotationPoint(-57.5f, -13, 5).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 156, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0)
				.setRotationPoint(-57.5f, -16.25f, 5).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 161, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
				.setRotationPoint(-57, -8.75f, -7).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
				.setRotationPoint(-57.25f, -8.75f, -7).setRotationAngle(0, 0, 0).setName("Light_Rear")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 164, textureX, textureY)
				.addShapeBox(0, 0, -2, 6, 0, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(35, -16, -11).setRotationAngle(32, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 172, textureX, textureY)
				.addShapeBox(0, 0, -0.5f, 6, 0, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(35, -16, 11).setRotationAngle(-32, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 158, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.85f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.35f, 0, -0.5f, -0.85f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.35f)
				.setRotationPoint(47, -11.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 157, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, 0, 0, 0.75f, 0, 0, -1.25f, 0, 0, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f, 0.75f, 0, -0.5f, -1.25f, 0, -0.5f, 0.25f)
				.setRotationPoint(49, -11.5f, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.35f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.85f, 0, -0.5f, 0.35f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f)
				.setRotationPoint(47, -11.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.25f, 0, 0, -1.25f, 0, 0, 0.75f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -1.25f, 0, -0.5f, 0.75f, 0, -0.5f, -0.75f)
				.setRotationPoint(49, -11.5f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 164, textureX, textureY).addCylinder(0, 0, 0, 1.75f, 1, 8, 1, 1, 3, null)
				.setRotationPoint(56.25f, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 174, textureX, textureY).newCylinderBuilder()
				.setPosition(0, 0, 0).setRadius(1.75f, 1.5f).setLength(1).setSegments(8, 0).setScale(1, 1).setDirection(3)
				.setRadialTexture(0, 0).setTopOffset(new Vec3f(-0.75, 0.0, 0.0)).setTopRotation(new Vec3f(0.0, 0.0, 0.0)).build()
				.setRotationPoint(57.25f, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, -0.9f, 0, 0.1f, -0.9f, 0, -0.9f, 0.1f, 0, -0.9f, 0.1f, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f)
				.setRotationPoint(56.4f, -6, -1.15f).setRotationAngle(0, 0, 0).setName("Light_B_L")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 142, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, -0.9f, 0, 0.1f, -0.9f, 0, -0.9f, 0.1f, 0, -0.9f, 0.1f, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f)
				.setRotationPoint(56.4f, -6, 0.15f).setRotationAngle(0, 0, 0).setName("Light_B_R")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, -0.9f, 0, 0.1f, -0.9f, 0, -0.9f, 0.1f, 0, -0.9f, 0.1f, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f)
				.setRotationPoint(56.4f, -10, -1.15f).setRotationAngle(0, 0, 0).setName("Light_T_L")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 150, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, -0.9f, 0, 0.1f, -0.9f, 0, -0.9f, 0.1f, 0, -0.9f, 0.1f, 0, -0.9f, -0.9f, 0, -0.9f, -0.9f)
				.setRotationPoint(56.4f, -10, 0.15f).setRotationAngle(0, 0, 0).setName("Light_T_R")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, -1)
				.setRotationPoint(56.4f, -6.5f, -1).setRotationAngle(0, 0, 0).setName("Headlight_B")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 198, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.35f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.85f, 0, -0.5f, 0.35f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f)
				.setRotationPoint(47, -7.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 198, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.25f, 0, 0, -1.25f, 0, 0, 0.75f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -1.25f, 0, -0.5f, 0.75f, 0, -0.5f, -0.75f)
				.setRotationPoint(49, -7.5f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 180, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.35f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.85f, 0, -0.5f, 0.35f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.85f)
				.setRotationPoint(47, -9.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 185, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.25f, 0, 0, -1.25f, 0, 0, 0.75f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f, -1.25f, 0, -0.5f, 0.75f, 0, -0.5f, -0.75f)
				.setRotationPoint(49, -9.5f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 156, textureX, textureY)
				.addShapeBox(0, 0, 0, 98, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-57, -20.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 156, textureX, textureY)
				.addShapeBox(0, 0, 0, 98, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-57, -20.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 175, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(40, -20.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 88cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(42, -21.75f, -2).setRotationAngle(0, 0, 0).setName("Box 95cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 183, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(40, -21.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 96cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 351, 183, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(42, -20.25f, 1).setRotationAngle(0, 0, 0).setName("Box 88cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(40, -21.75f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 95cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 177, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(41, -21.25f, 1).setRotationAngle(0, 0, 0).setName("Box 96cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(41.5f, -21.5f, -1).setRotationAngle(0, 0, 0).setName("Box 95cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 170, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(40.5f, -21, -0.5f).setRotationAngle(0, 0, 0).setName("Box 96cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(40.5f, -21.5f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 95cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(40.5f, -21.5f, -2.25f).setRotationAngle(0, 0, 0).setName("Box 95cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 328, 192, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-58, -19.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 190, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
				.setRotationPoint(-57, -18.25f, -1).setRotationAngle(0, 0, 0).setName("Box 97cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 188, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
				.setRotationPoint(-57.25f, -18.25f, -1).setRotationAngle(0, 0, 0).setName("Light_Rear_T")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 223, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(42, -21, 1).setRotationAngle(0, 0, 0).setName("Box 88cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 208, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(40, -22.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 95cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 217, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(41, -22, 1).setRotationAngle(0, 0, 0).setName("Box 96cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 153, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.85f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0.35f, 0, -0.5f, -0.85f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.35f)
				.setRotationPoint(47, -9, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 152, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, 0, 0, 0.75f, 0, 0, -1.25f, 0, 0, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f, 0.75f, 0, -0.5f, -1.25f, 0, -0.5f, 0.25f)
				.setRotationPoint(49, -9, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 213, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-24, -21.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 207, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-24, -21.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_RS10cb(){
		TurboList RS10cb = new TurboList("RS10cb");
		RS10cb.add(new ModelRendererTurbo(RS10cb, 388, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(39.5f, -20, -0.5f).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 502, 16, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(39.5f, -21, -1.5f).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 171, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(40.5f, -21.5f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 190, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(41.5f, -21.5f, 0).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 460, 36, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(40.5f, -21, 0.5f).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 170, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(38.5f, -21.5f, -2).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		this.groups.add(RS10cb);
	}

	private final void initGroup_FPA4cb(){
		TurboList FPA4cb = new TurboList("FPA4cb");
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 404, 25, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-57, 3.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 252, 80, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-58, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 98")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 15, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-60, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 158, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-60, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 91, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-58, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 233, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-59, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 179, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(-58, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 13, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57.5f, 1, 5).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 87, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-58, 1.2f, 4.75f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 234, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57.5f, 1, -7).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 69, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-58, 1.2f, -7.25f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 507, 8, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(56, 3.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 0, 65, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(57, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 98")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 507, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(59, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 497, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 507, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
				.setRotationPoint(57, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 507, 4, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 446, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 183, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
				.setRotationPoint(27.35f, -21.25f, 4.5f).setRotationAngle(0, 0, 0).setName("Bell")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 198, 199, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(28, -21.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 150")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 182, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, -0.4f, -0.25f, -0.5f, -0.4f, -0.25f, -0.5f, -0.35f, 0, -0.5f, -0.35f)
				.setRotationPoint(28, -21.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 150")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 179, 200, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
				.setRotationPoint(28, -21.75f, 4).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		FPA4cb.add(new ModelRendererTurbo(FPA4cb, 208, 190, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(28.25f, -21.5f, 4.6f).setRotationAngle(0, 0, 0).setName("Box 150")
		);
		this.groups.add(FPA4cb);
	}

	private final void initGroup_F40phcb(){
		TurboList F40phcb = new TurboList("F40phcb");
		F40phcb.add(new ModelRendererTurbo(F40phcb, 139, 148, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-7.5f, 3.5f, 8.25f).setRotationAngle(25, 0, 0)
		);
		F40phcb.add(new ModelRendererTurbo(F40phcb, 160, 150, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-7.5f, 2.25f, -11).setRotationAngle(-25, 0, 0)
		);
		this.groups.add(F40phcb);
	}

}

