//FMT-Marker TiM-1.0
package wwcp.models.locomotives.diesels;

import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class RS18 extends RollingStockModel {

	public RS18(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		initGroup_group00();
		initGroup_clipboard();
		initGroup_RS10cb();
	}

	private final void initGroup_group00(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 102, 2, 22)
				.setRotationPoint(-51, 0, -11).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-57, 3.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 278, 108, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-58, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-60, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 6")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 41, textureX, textureY).addBox(0, 0, 0, 16, 18, 14)
				.setRotationPoint(-48, -18, -7).setRotationAngle(0, 0, 0).setName("Box 7")
		);
		group0.add(new ModelRendererTurbo(group0, 198, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 18, 2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -18, -6).setRotationAngle(0, 0, 0).setName("Box 8")
		);
		group0.add(new ModelRendererTurbo(group0, 424, 72, textureX, textureY).addBox(0, 0, 0, 2, 18, 10)
				.setRotationPoint(-50, -18, -5).setRotationAngle(0, 0, 0).setName("Box 10")
		);
		group0.add(new ModelRendererTurbo(group0, 236, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 18, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, -18, -7).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
				.setRotationPoint(-50, -18, 6).setRotationAngle(0, 0, 0).setName("Box 15")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 18, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-51, -18, 4).setRotationAngle(0, 0, 0).setName("Box 16")
		);
		group0.add(new ModelRendererTurbo(group0, 214, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 19, 1, 1, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -19, -4).setRotationAngle(0, 0, 0).setName("Box 18")
		);
		group0.add(new ModelRendererTurbo(group0, 124, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.15f, 0, 0, -0.15f, 0, -1, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(50, -19, 4).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, -2, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
				.setRotationPoint(48, -19, 6).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 19, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -19, 3).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 74, textureX, textureY).addBox(0, 0, 0, 15, 15, 1)
				.setRotationPoint(-32, -15, -11).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 74, textureX, textureY).addBox(0, 0, 0, 15, 15, 1)
				.setRotationPoint(-32, -15, 10).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 0, textureX, textureY).addBox(0, 0, 0, 65, 18, 14)
				.setRotationPoint(-17, -18, -7).setRotationAngle(0, 0, 0).setName("Box 45")
		);
		group0.add(new ModelRendererTurbo(group0, 139, 38, textureX, textureY)
				.addShapeBox(0, 0, 0, 68, 1, 1, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -19, -4).setRotationAngle(0, 0, 0).setName("Box 48")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 38, textureX, textureY)
				.addShapeBox(0, 0, 0, 68, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -19, 3).setRotationAngle(0, 0, 0).setName("Box 50")
		);
		group0.add(new ModelRendererTurbo(group0, 66, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 18, 2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(48, -18, 4).setRotationAngle(0, 0, 0).setName("Box 53")
		);
		group0.add(new ModelRendererTurbo(group0, 156, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 18, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(48, -18, 6).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 232, 75, textureX, textureY).addBox(0, 0, 0, 3, 18, 8)
				.setRotationPoint(48, -18, -4).setRotationAngle(0, 0, 0).setName("Box 58")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 18, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(48, -18, -7).setRotationAngle(0, 0, 0).setName("Box 60")
		);
		group0.add(new ModelRendererTurbo(group0, 131, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 18, 2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(48, -18, -6).setRotationAngle(0, 0, 0).setName("Box 61")
		);
		group0.add(new ModelRendererTurbo(group0, 135, 59, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -5, 7).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 468, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-44, -5, 7).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 77, textureX, textureY).addBox(0, 0, 0, 14, 13, 1)
				.setRotationPoint(33, -14, -7.25f).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		group0.add(new ModelRendererTurbo(group0, 270, 64, textureX, textureY).addBox(0, 0, 0, 14, 13, 1)
				.setRotationPoint(33, -14, 6.25f).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 59, textureX, textureY).addBox(0, 0, 0, 13, 5, 1)
				.setRotationPoint(19, -17.5f, -7.75f).setRotationAngle(0, 0, 0).setName("Box 72")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 57, textureX, textureY).addBox(0, 0, 0, 13, 5, 1)
				.setRotationPoint(19, -17.5f, 6.75f).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 72, textureX, textureY).addBox(0, 0, 0, 8, 1, 8)
				.setRotationPoint(36, -19.5f, -4).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 28, textureX, textureY).addBox(0, 0, 0, 6, 1, 1)
				.setRotationPoint(37, -19.5f, -5).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 21, textureX, textureY).addBox(0, 0, 0, 6, 1, 1)
				.setRotationPoint(37, -19.5f, 4).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 80, textureX, textureY).addBox(0, 0, 0, 1, 1, 6)
				.setRotationPoint(35, -19.5f, -3).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		group0.add(new ModelRendererTurbo(group0, 68, 79, textureX, textureY).addBox(0, 0, 0, 1, 1, 6)
				.setRotationPoint(44, -19.5f, -3).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -19.5f, -4).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(43, -19.5f, -5).setRotationAngle(0, 0, 0).setName("Box 80")
		);
		group0.add(new ModelRendererTurbo(group0, 203, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(43, -19.5f, 4).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		group0.add(new ModelRendererTurbo(group0, 198, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(44, -19.5f, 3).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		group0.add(new ModelRendererTurbo(group0, 114, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
				.setRotationPoint(35, -19.5f, 3).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
				.setRotationPoint(36, -19.5f, 4).setRotationAngle(0, 0, 0).setName("Box 84")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(36, -19.5f, -5).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		group0.add(new ModelRendererTurbo(group0, 92, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(35, -19.5f, -4).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 25, textureX, textureY).addBox(0, 0, 0, 24, 1, 6)
				.setRotationPoint(-8, -19.5f, -3).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 108, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-14, -20, -1).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 108, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-15, -21, -1).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f)
				.setRotationPoint(-16, -21.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		group0.add(new ModelRendererTurbo(group0, 352, 95, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-14, -21, -2).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		group0.add(new ModelRendererTurbo(group0, 55, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-13, -21.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 7, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-12, -21.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		group0.add(new ModelRendererTurbo(group0, 71, 108, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-13, -21, 0).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 49, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 18, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55, 0, -9).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 184, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-58, 8, -10).setRotationAngle(0, 0, 0).setName("Box 98")
		);
		group0.add(new ModelRendererTurbo(group0, 439, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-58, 8, 3).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		group0.add(new ModelRendererTurbo(group0, 170, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 10, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-55, 0, -5).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		group0.add(new ModelRendererTurbo(group0, 303, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-44.5f, -2.75f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-10.5f, -2.75f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		group0.add(new ModelRendererTurbo(group0, 198, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(50.3f, -19.45f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		group0.add(new ModelRendererTurbo(group0, 66, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(51.55f, -19.2f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(51.3f, -18.7f, -0.5f).setRotationAngle(0, 0, 0).setName("Bell-Back")
		);
		group0.add(new ModelRendererTurbo(group0, 493, 74, textureX, textureY).addBox(0, 0, 0, 1, 10, 8)
				.setRotationPoint(-51, -18, -4).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 74, textureX, textureY).addBox(0, 0, 0, 1, 4, 8)
				.setRotationPoint(-51, -4, -4).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		group0.add(new ModelRendererTurbo(group0, 452, 101, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
				.setRotationPoint(-51, -8, -4).setRotationAngle(0, 0, 0).setName("Box 120")
		);
		group0.add(new ModelRendererTurbo(group0, 445, 101, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
				.setRotationPoint(-51, -8, 2).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 184, 77, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-51.25f, -6.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 118, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -8, 1).setRotationAngle(0, 0, 0).setName("Box 127")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-51, -8, -2).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 328, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -5, -2).setRotationAngle(0, 0, 0).setName("Box 129")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -5, 1).setRotationAngle(0, 0, 0).setName("Box 130")
		);
		group0.add(new ModelRendererTurbo(group0, 464, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1)
				.setRotationPoint(-51, 2, 10).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		group0.add(new ModelRendererTurbo(group0, 112, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-55.4f, -6.7f, -5).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-51.75f, 2, -10).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-51.75f, 2, -11).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-54.75f, 4, -9).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, -1.75f, 0, -0.25f, -1.75f, 0, -0.25f, 0, -1, 0, 0, -1, 0, 0, 0, -0.25f, 0, 0, -0.25f, -1, -1, 0, -1, -1)
				.setRotationPoint(-54.75f, 0, -7).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(-43, -11, -12).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(-11, -11, -12).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		group0.add(new ModelRendererTurbo(group0, 502, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(-4, -7, -12).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(5, -7, -12).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		group0.add(new ModelRendererTurbo(group0, 419, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(14, -7, -12).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(23, -7, -12).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		group0.add(new ModelRendererTurbo(group0, 135, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(32, -7, -12).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		group0.add(new ModelRendererTurbo(group0, 130, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(41, -7, -12).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(50, -7, -12).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		group0.add(new ModelRendererTurbo(group0, 394, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 57, 1, 1, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-6, -8, -12).setRotationAngle(0, 0, 0).setName("Box 163")
		);
		group0.add(new ModelRendererTurbo(group0, 447, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.8f, -0.55f, -0.55f, -1, -0.55f, -0.55f, -1, -0.55f, 0, -0.8f, -0.55f, 0, -0.8f, 0, -0.55f, -1, 0, -0.55f, -1, 0, 0, -0.8f, 0, 0)
				.setRotationPoint(-44.75f, -12, -12).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.3f, -0.55f, -0.75f, -0.75f, -0.55f, -0.75f, -0.75f, 0, -0.25f, -0.3f, 0, 1.5f, -1.45f, -0.55f, -2.5f, -1, -0.55f, -2.5f, -1, 0, 1.5f, -1.45f, 0)
				.setRotationPoint(-33.25f, -14, -12).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -1, -1, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, -1, -1, 0, -5, 0, -0.55f, 4, -0.45f, -0.55f, 4, -0.45f, 0, -5, 0, 0)
				.setRotationPoint(-11, -12, -12).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		group0.add(new ModelRendererTurbo(group0, 184, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.55f, -0.3f, 0, -0.55f, -0.3f, 0, -0.55f, -0.25f, 0, -0.55f, -0.25f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-51, -7.8f, -11.75f).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -3.5f, -0.05f, -0.3f, 2.5f, -0.5f, -0.3f, 2.5f, -0.5f, -0.25f, -3.5f, -0.05f, -0.25f, -0.45f, -0.75f, -0.3f, -0.55f, -0.3f, -0.3f, -0.55f, -0.3f, -0.25f, -0.45f, -0.75f, -0.25f)
				.setRotationPoint(-47.45f, -11.5f, -11.75f).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.55f, -0.3f, 0, -0.55f, -0.3f, 0, -0.55f, -0.25f, 0, -0.55f, -0.25f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-18, -12, -11.75f).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, -0.55f, -0.75f, -0.55f, 0, -0.75f, -0.55f, 0, -0.75f, 0, -0.55f, -0.75f, 0, -0.55f, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.25f, 0, -0.55f, -0.25f, 0)
				.setRotationPoint(-52, -8, -12).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.55f, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.55f, -0.55f, -0.1f, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f)
				.setRotationPoint(-56, -6.9f, -5.1f).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 371, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.55f, 1, 0, 0, 1, 0, 0, 1, -0.55f, -0.55f, 1, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f)
				.setRotationPoint(-56, -7.5f, -2).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		group0.add(new ModelRendererTurbo(group0, 374, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.55f, 0, 0, 0, 0, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, -0.55f, 0)
				.setRotationPoint(-56, -7.25f, -8).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 358, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.55f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3f, -0.55f, 0, -0.3f, -0.55f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3f, -0.55f, 0, -0.3f)
				.setRotationPoint(-56, -1.25f, -11.45f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.55f, -4, -0.25f, 0, -4, -0.25f, 0, 1, -2, -0.55f, 1, -2, -0.55f, 3.65f, -0.25f, 0, 3.65f, -0.25f, 0, -1.35f, -2, -0.55f, -1.35f, -2)
				.setRotationPoint(-56, -6.25f, -11).setRotationAngle(0, 0, 0).setName("Box 184")
		);
		group0.add(new ModelRendererTurbo(group0, 154, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(56, 3.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 106, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(57, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
				.setRotationPoint(57, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 4")
		);
		group0.add(new ModelRendererTurbo(group0, 188, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		group0.add(new ModelRendererTurbo(group0, 183, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(59, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 6")
		);
		group0.add(new ModelRendererTurbo(group0, 36, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, 8, 3).setRotationAngle(0, 0, 0).setName("Box 98")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, 8, -10).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		group0.add(new ModelRendererTurbo(group0, 51, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 6, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, 6, -3).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		group0.add(new ModelRendererTurbo(group0, 228, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 18, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(54, 0, -9).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(50, 2, -11).setRotationAngle(0, 0, 0).setName("Box 133")
		);
		group0.add(new ModelRendererTurbo(group0, 308, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1)
				.setRotationPoint(50.75f, 2, 10).setRotationAngle(0, 0, 0).setName("Box 143")
		);
		group0.add(new ModelRendererTurbo(group0, 250, 41, textureX, textureY).addBox(0, 0, 0, 15, 6, 16)
				.setRotationPoint(1, 3, -8).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-11, 2, -10).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.55f, -0.55f, -0.35f, 0, -0.55f, -0.35f, 0, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, -0.35f, 0, 0, -0.35f, 0, 0, 0, -0.55f, 0, 0)
				.setRotationPoint(-56, -5.9f, -5).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -16, -11).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-56, 2.5f, 3).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(51.25f, -16.5f, -1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Back-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 424, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.55f, -0.2f, -0.25f, -0.55f, -0.2f, -0.25f, -0.55f, -0.2f, -0.25f, -0.55f, -0.2f)
				.setRotationPoint(50.5f, -16.5f, -1).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		group0.add(new ModelRendererTurbo(group0, 410, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(51.25f, -14.75f, -1).setRotationAngle(0, 0, 0).setName("Headlight-Bottom-Back-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 178, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, -0.5f, -1.375f, -0.5f, -0.5f, -1.375f)
				.setRotationPoint(-52, -14.5f, 1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0)
				.setRotationPoint(-52, -15.75f, -1.5f).setRotationAngle(0, 0, 0).setName("light-big-front-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 373, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f)
				.setRotationPoint(-52.25f, -14.75f, -1).setRotationAngle(0, 0, 0).setName("Headlight-Bottom-Front-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -2.75f, 0, 0, -2.75f, 0)
				.setRotationPoint(-32.5f, -17, -10).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, -0.75f, -1, 0, -0.75f, -1)
				.setRotationPoint(-32.5f, -17, -11).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 7, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-32.5f, -20, -7).setRotationAngle(0, 0, 0).setName("Box 63")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 6, textureX, textureY).addBox(0, 0, 0, 13, 1, 20)
				.setRotationPoint(-31, -5, -10).setRotationAngle(0, 0, 0).setName("Standard Seat")
		);
		group0.add(new ModelRendererTurbo(group0, 284, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 67, 1, 2, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -19, 4).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 65, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -19, 6).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.6f, 0, -1, -0.6f, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(50, -19, -6).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 439, 76, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(2, 1, 1)
				.setCorners(0, -1, 0, -2, -1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(2, new float[]{ 3.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f }).build()
				.setRotationPoint(48, -19, -7).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 286, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 67, 1, 2, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -19, -6).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 65, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -19, -7).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 222, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, -0.6f, 0, 0, -0.6f, 0, 0, -0.15f, 0, 0, -0.15f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -19, -6).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 36, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, -2, -1, 0, 0, -1, 0, 0, -0.6f, 0, 0, -0.6f, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, -19, -7).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 1, 2, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, -19, -6).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -19, -7).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 109, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.6f, 0, -1, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-51, -19, 4).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 64, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(2, 1, 1)
				.setCorners(0, -0.6f, 0, 0, -0.6f, 0, 0, -1, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
				.setPolygonUV(2, new float[]{ 3.0f, 0.0f, 3.0f, 0.0f, 1.0f, 1.0f, 3.0f, 1.0f }).build()
				.setRotationPoint(-50, -19, 6).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 40, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 1, 2, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-50, -19, 4).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -19, 6).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 58, textureX, textureY).addBox(0, 0, 0, 2, 1, 5)
				.setRotationPoint(17, -19.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.35f, -0.65f, 0, -0.35f, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, -0.65f, -0.35f, -0.65f, -0.65f, -0.35f, -0.65f, -0.15f, 0, 0, -0.15f, 0)
				.setRotationPoint(-55.4f, -7.25f, -2).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 340, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
				.setRotationPoint(-55.4f, -6.7f, 2).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		group0.add(new ModelRendererTurbo(group0, 173, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.55f, -0.1f, -0.55f, 0, -0.1f, -0.55f, 0, -0.1f, 0, -0.55f, -0.1f, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0)
				.setRotationPoint(-56, -6.9f, 4.1f).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 168, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.55f, 1, -0.55f, 0, 1, -0.55f, 0, 1, 0, -0.55f, 1, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0)
				.setRotationPoint(-56, -7.5f, 1).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.55f, 0, 0, 0, 0, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, -0.55f, 0)
				.setRotationPoint(-56, -7.25f, 2).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.55f, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, -0.35f, -0.55f, -0.55f, -0.35f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.35f, -0.55f, 0, -0.35f)
				.setRotationPoint(-56, -5.9f, 2).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 322, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f)
				.setRotationPoint(54.4f, -6.7f, 2).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		group0.add(new ModelRendererTurbo(group0, 125, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.1f, -0.55f, -0.55f, -0.1f, -0.55f, -0.55f, -0.1f, 0, 0, -0.1f, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(55, -6.9f, 4.1f).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 61, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 1, -0.55f, -0.55f, 1, -0.55f, -0.55f, 1, 0, 0, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(55, -7.5f, 1).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, -0.55f, 0)
				.setRotationPoint(55, -7.25f, 2).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 255, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, -0.35f, 0, -0.55f, -0.35f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.35f, 0, 0, -0.35f)
				.setRotationPoint(55, -5.9f, 2).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0)
				.setRotationPoint(54.4f, -6.7f, -5).setRotationAngle(0, 0, 0).setName("Box 139")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.1f, 0, -0.55f, -0.1f, 0, -0.55f, -0.1f, -0.55f, 0, -0.1f, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(55, -6.9f, -5.1f).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 1, 0, -0.55f, 1, 0, -0.55f, 1, -0.55f, 0, 1, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(55, -7.5f, -2).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, -0.55f, 0)
				.setRotationPoint(55, -7.25f, -8).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.55f, -0.35f, -0.55f, -0.55f, -0.35f, -0.55f, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.35f, -0.55f, 0, -0.35f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(55, -5.9f, -5).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 34, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(-49, -6.8f, -12).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		group0.add(new ModelRendererTurbo(group0, 29, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(-37, -11, -12).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		group0.add(new ModelRendererTurbo(group0, 303, 92, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-32, -22, -0.75f).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		group0.add(new ModelRendererTurbo(group0, 475, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f)
				.setRotationPoint(-33, -22.5f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 93, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-31, -22, -1.5f).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-32, -22.5f, 0).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-29, -22.5f, -2).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		group0.add(new ModelRendererTurbo(group0, 112, 92, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-30, -22, -1.5f).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		group0.add(new ModelRendererTurbo(group0, 167, 72, textureX, textureY).addBox(0, 0, 0, 1, 19, 14)
				.setRotationPoint(-32, -19, -7).setRotationAngle(0, 0, 0).setName("Box 32")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 72, textureX, textureY).addBox(0, 0, 0, 1, 19, 14)
				.setRotationPoint(-18, -19, -7).setRotationAngle(0, 0, 0).setName("Box 32")
		);
		group0.add(new ModelRendererTurbo(group0, 238, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-52.3f, -19.45f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-52.55f, -19.2f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		group0.add(new ModelRendererTurbo(group0, 94, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-52.3f, -18.7f, -0.5f).setRotationAngle(0, 0, 0).setName("Bell-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-43, -11, 11).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-49, -6.8f, 11).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		group0.add(new ModelRendererTurbo(group0, 476, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-37, -11, 11).setRotationAngle(0, 0, 0).setName("Box 153")
		);
		group0.add(new ModelRendererTurbo(group0, 464, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-11, -11, 11).setRotationAngle(0, 0, 0).setName("Box 155")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-4, -7, 11).setRotationAngle(0, 0, 0).setName("Box 156")
		);
		group0.add(new ModelRendererTurbo(group0, 348, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(5, -7, 11).setRotationAngle(0, 0, 0).setName("Box 157")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(14, -7, 11).setRotationAngle(0, 0, 0).setName("Box 158")
		);
		group0.add(new ModelRendererTurbo(group0, 324, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(23, -7, 11).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		group0.add(new ModelRendererTurbo(group0, 319, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(32, -7, 11).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		group0.add(new ModelRendererTurbo(group0, 301, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(41, -7, 11).setRotationAngle(0, 0, 0).setName("Box 161")
		);
		group0.add(new ModelRendererTurbo(group0, 288, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(50, -7, 11).setRotationAngle(0, 0, 0).setName("Box 162")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55.25f, -4, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 283, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-55, -4, 0.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 221, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-55, -4, -2.25f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(54.25f, -4, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
				.setRotationPoint(54, -4, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 163, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
				.setRotationPoint(54, -4, 1.25f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 359, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.1f, -0.5f, 0, -0.1f, -0.5f, 0, -0.1f, 0, 0, -0.1f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
				.setRotationPoint(-55, -2.5f, -5).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 352, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.1f, -0.5f, 0, -0.1f, -0.5f, 0, -0.1f, 0, 0, -0.1f, 0, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f, -0.5f, -0.5f, -0.1f, 0, -0.5f, -0.1f)
				.setRotationPoint(-55, -2.5f, 3).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 336, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f)
				.setRotationPoint(-56, -2.5f, -5).setRotationAngle(0, 0, 0).setName("Ditchlight-Front-Left-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 322, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f)
				.setRotationPoint(-56, -2.5f, 3).setRotationAngle(0, 0, 0).setName("Ditchlight-Front-Right-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 215, 93, textureX, textureY).addBox(0, 0, 0, 1, 5, 3)
				.setRotationPoint(-18, -5, -10).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 157, 93, textureX, textureY).addBox(0, 0, 0, 1, 5, 3)
				.setRotationPoint(-18, -5, 7).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 93, textureX, textureY).addBox(0, 0, 0, 1, 5, 3)
				.setRotationPoint(-32, -5, -10).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 6, 93, textureX, textureY).addBox(0, 0, 0, 1, 5, 3)
				.setRotationPoint(-32, -5, 7).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 7, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(-22, -8, 4).setRotationAngle(0, 0, -90).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 14, textureX, textureY).addBox(0, 0, 0, 4, 1, 5)
				.setRotationPoint(-26, -9, 4).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f, -0.125f, -0.125f, -0.5f)
				.setRotationPoint(-25, -11.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 72, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-34, 2.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 430, 64, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(31, 2.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, 0, -0.05f, -0.55f, -0.55f, -0.05f, -0.55f, -0.55f, -0.05f, 0, 0, -0.05f, 0, 0, -0.75f, -0.55f, -0.55f, -0.75f, -0.55f, -0.55f, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(51, -7.5f, -12).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, -10, 1.5f).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 105, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(-24, -8, 6).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 109, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-25, -10, 2.5f).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(-24, -10, 2.5f).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-24, -10, 0.5f).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 398, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
				.setRotationPoint(-26, -10, 2.5f).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, -10, 0.5f).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 380, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-25, -10, 0.5f).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-25, -12, 1.5f).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0)
				.setRotationPoint(-28, -11, 2.5f).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 303, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f)
				.setRotationPoint(-52.25f, -18.5f, 0).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front-right-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 410, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-51.5f, -18.5f, -2).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f)
				.setRotationPoint(-52.25f, -18.5f, -2).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front-left-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f)
				.setRotationPoint(-52.25f, -16.5f, -1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 119, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f)
				.setRotationPoint(-52, -16.88f, -1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 314, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.5f, -1.375f, 0, -0.5f, -1.375f, 0, -0.75f, 0.375f, -0.5f, -0.75f, 0.375f)
				.setRotationPoint(-52, -14.5f, -2).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f)
				.setRotationPoint(-52, -15.75f, -2).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 278, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, -0.5f, -1.375f, -0.5f, -0.5f, -1.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f)
				.setRotationPoint(-52, -17, 1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f)
				.setRotationPoint(-52, -13.63f, -1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.5f, -1.375f, 0, -0.5f, -1.375f, 0, -0.75f, 0.375f, -0.5f, -0.75f, 0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f)
				.setRotationPoint(-52, -17, -2).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f)
				.setRotationPoint(-52, -15.75f, 1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.55f, -0.2f, -0.25f, -0.55f, -0.2f, -0.25f, -0.55f, -0.2f, -0.25f, -0.55f, -0.2f)
				.setRotationPoint(-51.5f, -16.5f, -1).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, -1.125f, -0.75f, 0, -1.125f, -0.75f, 0, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-52, -17.38f, -1.5f).setRotationAngle(0, 0, 0).setName("light-big-front-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1.125f, -0.75f, 0, -1.125f, -0.75f, 0, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f)
				.setRotationPoint(-52, -14.13f, -1.5f).setRotationAngle(0, 0, 0).setName("light-big-front-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.75f, 0.375f, -0.5f, -0.75f, 0.375f, -0.5f, -0.5f, -1.375f, 0, -0.5f, -1.375f)
				.setRotationPoint(51, -14.5f, 1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, 0, 0, -0.375f, 0)
				.setRotationPoint(51, -15.75f, -1.5f).setRotationAngle(0, 0, 0).setName("light-big-back")
		);
		group0.add(new ModelRendererTurbo(group0, 419, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(51, -16.88f, -1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 115, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5f, -1.375f, -0.5f, -0.5f, -1.375f, -0.5f, -0.75f, 0.375f, 0, -0.75f, 0.375f)
				.setRotationPoint(51, -14.5f, -2).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(51, -15.75f, -2).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 459, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.75f, 0.375f, -0.5f, -0.75f, 0.375f, -0.5f, -0.5f, -1.375f, 0, -0.5f, -1.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(51, -17, 1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(51, -13.63f, -1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -1.375f, -0.5f, -0.5f, -1.375f, -0.5f, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(51, -17, -2).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, -0.5f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(51, -15.75f, 1).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, 0, -1.125f, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(51, -17.38f, -1.5f).setRotationAngle(0, 0, 0).setName("light-big-back")
		);
		group0.add(new ModelRendererTurbo(group0, 56, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, -0.75f, -1.125f, -0.75f, 0, -1.125f, -0.75f)
				.setRotationPoint(51, -14.13f, -1.5f).setRotationAngle(0, 0, 0).setName("light-big-back")
		);
		group0.add(new ModelRendererTurbo(group0, 402, 89, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-51.6f, -16, -0.5f).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 270, 89, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-51.6f, -14.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Headlight-Bottom-Front")
		);
		group0.add(new ModelRendererTurbo(group0, 261, 89, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-51.6f, -18, -1.5f).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front-left")
		);
		group0.add(new ModelRendererTurbo(group0, 464, 88, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-51.6f, -18, 0.5f).setRotationAngle(0, 0, 0).setName("Headlight-Top-Front-right")
		);
		group0.add(new ModelRendererTurbo(group0, 380, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(51.25f, -18.5f, -2).setRotationAngle(0, 0, 0).setName("Headlight-Top-bacl-right-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 480, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(50.5f, -18.5f, -2).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, -0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(51.25f, -18.5f, 0).setRotationAngle(0, 0, 0).setName("Headlight-Top-back-left-socket")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 88, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(50.6f, -18, 0.5f).setRotationAngle(0, 0, 0).setName("Headlight-Top-back-left")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 88, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(50.6f, -18, -1.5f).setRotationAngle(0, 0, 0).setName("Headlight-Top-back-right")
		);
		group0.add(new ModelRendererTurbo(group0, 154, 88, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(50.6f, -16, -0.5f).setRotationAngle(0, 0, 0).setName("Headlight-Top-back")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 87, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(50.6f, -14.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Headlight-Bottom-back")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0)
				.setRotationPoint(-55.6f, -2, 3.5f).setRotationAngle(0, 0, 0).setName("Ditchlight-Front-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 226, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0)
				.setRotationPoint(-55.6f, -2, -4.5f).setRotationAngle(0, 0, 0).setName("Ditchlight-Front-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, 6, -3).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		group0.add(new ModelRendererTurbo(group0, 215, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-58, 6, -3).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56, 6, -3).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 94, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(58, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-58, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 4")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(-58, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		group0.add(new ModelRendererTurbo(group0, 83, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-60, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		group0.add(new ModelRendererTurbo(group0, 460, 78, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-59, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, -1.5f, 0, 0, -1.5f, 0, 0, -0.75f, -1, -0.5f, -0.75f, -1, -0.5f, 0.75f, 0, 0, 0.75f, 0)
				.setRotationPoint(-32.5f, -17, 9).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 255, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1.5f, 0, -0.5f, -1.5f, 0, -0.5f, 0, -1, 0, 0, -1, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, -0.75f, -1, 0, -0.75f, -1)
				.setRotationPoint(-17, -17, -11).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, -1.5f, 0, 0, -1.5f, 0, 0, -0.75f, -1, -0.5f, -0.75f, -1, -0.5f, 0.75f, 0, 0, 0.75f, 0)
				.setRotationPoint(-17, -17, 9).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, 0, -0.35f, 0, 0, -0.35f, 0, -0.15f, 0, -0.65f, -0.15f, 0, -0.65f, -0.65f, -0.35f, 0, -0.65f, -0.35f)
				.setRotationPoint(-55.4f, -7.25f, 0).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 470, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56, 6, 3).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-56, 7, 3).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 216, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.55f, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.3f, -0.55f, 0, -0.3f, -0.55f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3f, -0.55f, 0, -0.3f)
				.setRotationPoint(-56, -2.25f, -11.45f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, -14.25f, -12).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 394, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 57, 1, 1, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-6, -8, 11).setRotationAngle(0, 0, 0).setName("Box 163")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -1, -1, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, -1, -1, -0.55f, -5, 0, 0, 4, -0.45f, 0, 4, -0.45f, -0.55f, -5, 0, -0.55f)
				.setRotationPoint(-11, -12, 11).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		group0.add(new ModelRendererTurbo(group0, 36, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.55f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, -0.3f, 0, -0.55f, -0.3f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3f, 0, 0, -0.3f)
				.setRotationPoint(-18, -12, 10.75f).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, 0, -0.05f, 0, -0.55f, -0.05f, 0, -0.55f, -0.05f, -0.55f, 0, -0.05f, -0.55f, 0, -0.75f, 0, -0.55f, -0.75f, 0, -0.55f, -0.75f, -0.55f, 0, -0.75f, -0.55f)
				.setRotationPoint(51, -7.5f, 11).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(-32, -17, -11).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 49, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -16, 10).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -1, 0, 0.5f, -1)
				.setRotationPoint(-32, -17, 10).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 1, 0, -0.8f, -0.55f, 0, -1, -0.55f, 0, -1, -0.55f, -0.55f, -0.8f, -0.55f, -0.55f, -0.8f, 0, 0, -1, 0, 0, -1, 0, -0.55f, -0.8f, 0, -0.55f)
				.setRotationPoint(-44.75f, -12, 11).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		group0.add(new ModelRendererTurbo(group0, 316, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, -0.3f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.55f, -0.25f, -0.3f, -0.55f, 1.5f, -1.45f, 0, -2.5f, -1, 0, -2.5f, -1, -0.55f, 1.5f, -1.45f, -0.55f)
				.setRotationPoint(-33.25f, -14, 11).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.55f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, -0.3f, 0, -0.55f, -0.3f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3f, 0, 0, -0.3f)
				.setRotationPoint(-51, -7.8f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 258, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -3.5f, -0.05f, -0.25f, 2.5f, -0.5f, -0.25f, 2.5f, -0.5f, -0.3f, -3.5f, -0.05f, -0.3f, -0.45f, -0.75f, -0.25f, -0.55f, -0.3f, -0.25f, -0.55f, -0.3f, -0.3f, -0.45f, -0.75f, -0.3f)
				.setRotationPoint(-47.45f, -11.5f, 10.75f).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		group0.add(new ModelRendererTurbo(group0, 253, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, -0.55f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.55f, -0.55f, -0.75f, -0.55f, -0.55f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.55f, -0.55f, -0.25f, -0.55f)
				.setRotationPoint(-52, -8, 11).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		group0.add(new ModelRendererTurbo(group0, 165, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-33, -14.25f, 11).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f)
				.setRotationPoint(-56, -1.25f, 10.45f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.55f, 1, -2, 0, 1, -2, 0, -4, -0.25f, -0.55f, -4, -0.25f, -0.55f, -1.35f, -2, 0, -1.35f, -2, 0, 3.65f, -0.25f, -0.55f, 3.65f, -0.25f)
				.setRotationPoint(-56, -6.25f, 6).setRotationAngle(0, 0, 0).setName("Box 184")
		);
		group0.add(new ModelRendererTurbo(group0, 139, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, -1, -0.25f, -0.55f, -1, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f)
				.setRotationPoint(-56, -2.25f, 10.45f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f)
				.setRotationPoint(55, -1.25f, -11.45f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -4, -0.25f, -0.55f, -4, -0.25f, -0.55f, 1, -2, 0, 1, -2, 0, 3.65f, -0.25f, -0.55f, 3.65f, -0.25f, -0.55f, -1.35f, -2, 0, -1.35f, -2)
				.setRotationPoint(55, -6.25f, -11).setRotationAngle(0, 0, 0).setName("Box 184")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.65f, 0, -0.35f, 0, 0, -0.35f, 0, -0.5f, 0, -0.65f, -0.5f, 0, -0.65f, -0.65f, -0.35f, 0, -0.65f, -0.35f, 0, -0.15f, 0, -0.65f, -0.15f, 0)
				.setRotationPoint(54.4f, -7.25f, -2).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 298, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.65f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.35f, -0.65f, 0, -0.35f, -0.65f, -0.15f, 0, 0, -0.15f, 0, 0, -0.65f, -0.35f, -0.65f, -0.65f, -0.35f)
				.setRotationPoint(54.4f, -7.25f, 0).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 316, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.25f, -0.55f, -1, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f)
				.setRotationPoint(55, -2.25f, -11.45f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.3f, -0.55f, 0, -0.3f, -0.55f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3f, -0.55f, 0, -0.3f, -0.55f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(55, -1.25f, 10.45f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 1, -2, -0.55f, 1, -2, -0.55f, -4, -0.25f, 0, -4, -0.25f, 0, -1.35f, -2, -0.55f, -1.35f, -2, -0.55f, 3.65f, -0.25f, 0, 3.65f, -0.25f)
				.setRotationPoint(55, -6.25f, 6).setRotationAngle(0, 0, 0).setName("Box 184")
		);
		group0.add(new ModelRendererTurbo(group0, 261, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.3f, -0.55f, 0, -0.3f, -0.55f, -1, -0.25f, 0, -1, -0.25f, 0, 0, -0.3f, -0.55f, 0, -0.3f, -0.55f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(55, -2.25f, 10.45f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 7, 2, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4)
				.setRotationPoint(-31, -12, 0).setRotationAngle(0, 0, 0).setName("Standard Seat")
		);
		group0.add(new ModelRendererTurbo(group0, 216, 67, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-51.25f, -15.25f, -0.5f).setRotationAngle(0, 0, 0).setName("light-big-front")
		);
		group0.add(new ModelRendererTurbo(group0, 440, 64, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(50.25f, -15.25f, -0.5f).setRotationAngle(0, 0, 0).setName("light-big-back")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 34, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-11, 2, -9).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-11, 3, -10).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-11, 3, -9).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 23, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-11, 2, 8).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 20, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-11, 2, 9).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-11, 3, 8).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 14, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-11, 3, 9).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 70, textureX, textureY).addBox(0, 0, 0, 1, 1, 16)
				.setRotationPoint(3.5f, 3, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 51, textureX, textureY).addBox(0, 0, 0, 2, 4, 16)
				.setRotationPoint(3, 4, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 286, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(5, 5, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 251, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(5, 7, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(5, 4, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 59, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(2, 5, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 374, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(2, 7, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(2, 4, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 430, 54, textureX, textureY).addBox(0, 0, 0, 1, 1, 16)
				.setRotationPoint(8.5f, 3, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 49, textureX, textureY).addBox(0, 0, 0, 2, 4, 16)
				.setRotationPoint(8, 4, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 186, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(10, 5, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 151, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(10, 7, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(10, 4, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 35, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(7, 5, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(7, 7, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 49, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(7, 4, -8).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-55, 1, -8).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.25f, -0.75f, -2, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, -2, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-53, -0.75f, -7).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-51.75f, 2, 8).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		group0.add(new ModelRendererTurbo(group0, 373, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, -2, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -2)
				.setRotationPoint(-53, -0.75f, 5).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
				.setRotationPoint(-54.75f, 2, -8).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		group0.add(new ModelRendererTurbo(group0, 189, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(-54.75f, 8, -10).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 10, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(51, 0, -5).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		group0.add(new ModelRendererTurbo(group0, 95, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(50.75f, 2, 8).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		group0.add(new ModelRendererTurbo(group0, 364, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -2, 0, -0.75f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -2, 0, 0, 0)
				.setRotationPoint(51, -0.75f, 5).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(50.75f, 2, -10).setRotationAngle(0, 0, 0).setName("Box 142")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.75f, 0, -0.25f, -0.75f, -2, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.25f, 0, -2, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(51, -0.75f, -7).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, 0, -1, 0.5f)
				.setRotationPoint(-26.5f, -15.5f, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, -2, -1, -1.25f, -2, -1, 0.5f, 0, -1, 0.5f)
				.setRotationPoint(-22.5f, -15.5f, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 59, 98, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(2, 2, 1)
				.setCorners(0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, -2, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, -2, -1, 0.5f)
				.setPolygonUV(0, new float[]{ 4.0f, 1.0f, 3.0f, 1.0f, 3.0f, 3.0f, 4.0f, 3.0f })
				.setPolygonUV(5, new float[]{ 6.0f, 1.0f, 4.0f, 1.0f, 4.0f, 3.0f, 4.0f, 3.0f })
				.setPolygonUV(2, new float[]{ 3.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 3.0f, 1.0f }).build()
				.setRotationPoint(-28.5f, -15.5f, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, 0, -1, -1.25f)
				.setRotationPoint(-26.5f, -15.5f, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 97, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(2, 2, 1)
				.setCorners(0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, -2, -1, 0.5f, -2, -1, -1.25f, 0, -1, -1.25f)
				.setPolygonUV(4, new float[]{ 3.0f, 1.0f, 1.0f, 1.0f, 1.0f, 3.0f, 1.0f, 3.0f }).build()
				.setRotationPoint(-22.5f, -15.5f, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 375, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, -2, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, -2, -1, -1.25f)
				.setRotationPoint(-28.5f, -15.5f, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 346, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55.25f, 3, 5).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-56.25f, 3.2f, 4.88f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55.75f, 3.2f, 4.88f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 480, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56, 6, -5).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56, 6, 8).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-56, 7, 8).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-56, 7, -5).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 288, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-56, 7, 5).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 368, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, 6, -5).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(55, 7, -5).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, 6, 3).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(55, 7, 3).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 226, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-55, 1.2f, -9).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 255, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-52.25f, -15.5f, 2.5f).setRotationAngle(0, 20, 0).setName("Box 24")
		);
		group0.add(new ModelRendererTurbo(group0, 340, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, -20.75f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f)
				.setRotationPoint(-56.4f, -6.5f, -3).setRotationAngle(0, 0, 0).setName("Ditchlight-Front-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f)
				.setRotationPoint(-56.4f, -6.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Ditchlight-Front-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f)
				.setRotationPoint(54.6f, -6.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Ditchlight-Front-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f)
				.setRotationPoint(54.6f, -6.5f, 2).setRotationAngle(0, 0, 0).setName("Ditchlight-Front-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 91, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(-34, 2, -11).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 322, 91, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(-34, 2, 10).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 90, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(31, 2, -11).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 56, 89, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(31, 2, 10).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55, 1, -10).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 296, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55, 4, -10).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55, 1, 9).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 248, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55, 4, 9).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(54.75f, 1, -10).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(54.75f, 4, -10).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 374, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(54.75f, 1, 9).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 216, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(54.75f, 4, 9).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 360, 41, textureX, textureY).addBox(0, 0, 0, 14, 3, 10)
				.setRotationPoint(33, -21, -5).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 207, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -22, 0).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 394, 10, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -21.5f, 5).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 135, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -20.5f, 7).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 115, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -20.5f, 5).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 168, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -22, -5).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 394, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -21.5f, -7).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -20.5f, -7).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -19.5f, 7).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -19.5f, 8).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 170, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -20.5f, -8).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 135, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -19.5f, -8).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33, -19.5f, -9).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-50.75f, -15.5f, -6.25f).setRotationAngle(0, -20, 0).setName("Box 24")
		);
		group0.add(new ModelRendererTurbo(group0, 157, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(49, -15.5f, -5.5f).setRotationAngle(0, 20, 0).setName("Box 24")
		);
		group0.add(new ModelRendererTurbo(group0, 130, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(50.25f, -15.5f, 1.75f).setRotationAngle(0, -20, 0).setName("Box 24")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(50.5f, -18, 4.35f).setRotationAngle(0, -30, 0).setName("Markerlight-Back-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(49.95f, -18, -5.3f).setRotationAngle(0, 30, 0).setName("Markerlight-Back-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
				.setRotationPoint(-50.85f, -18, -5.7f).setRotationAngle(0, -30, 0).setName("Markerlight-Front-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 58, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f)
				.setRotationPoint(-51.35f, -18, 4.9f).setRotationAngle(0, 30, 0).setName("Markerlight-Front-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 472, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2.75f, 0, 0, -2.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-32.5f, -17, 7).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(-32.5f, -20, 0).setRotationAngle(0, 0, 0).setName("Box 63")
		);
		group0.add(new ModelRendererTurbo(group0, 487, 58, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, -0.5f, 0, -1, -0.5f)
				.setRotationPoint(-31, -21, -0.5f).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 58, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, -1, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-31, -21, -0.5f).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.8f, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, -0.8f, -0.55f, 0, -0.8f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.8f, 0, 0)
				.setRotationPoint(-35.55f, -12, -12).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, -0.75f, -0.55f, -0.25f, -0.3f, -0.55f, -0.25f, -0.3f, 0, -0.75f, -0.75f, 0, -2.75f, -1, -0.55f, 1.75f, -1.45f, -0.55f, 1.75f, -1.45f, 0, -2.75f, -1, 0)
				.setRotationPoint(-16.75f, -14, -12).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, -14.25f, -12).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 453, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.55f, -0.3f, 0, -0.55f, -0.3f, 0, -0.55f, -0.25f, 0, -0.55f, -0.25f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-14, -12, -11.75f).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, -0.75f, 0, -0.25f, -0.3f, 0, -0.25f, -0.3f, -0.55f, -0.75f, -0.75f, -0.55f, -2.75f, -1, 0, 1.75f, -1.45f, 0, 1.75f, -1.45f, -0.55f, -2.75f, -1, -0.55f)
				.setRotationPoint(-16.75f, -14, 11).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 16, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-18, -14.25f, 11).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 247, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.55f, -0.25f, 0, -0.55f, -0.25f, 0, -0.55f, -0.3f, 0, -0.55f, -0.3f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.3f, 0, 0, -0.3f)
				.setRotationPoint(-14, -12, 10.75f).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(-26, -8, -9).setRotationAngle(0, 0, -90).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 14, textureX, textureY).addBox(0, 0, 0, 4, 1, 5)
				.setRotationPoint(-25, -9, -9).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 56, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(-24, -8, -7).setRotationAngle(0, 0, 0).setName("Seat-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 396, 89, textureX, textureY).addBox(0, 0, -3, 1, 11, 3)
				.setRotationPoint(-32, -16, -7).setRotationAngle(0, 0, 0).setName("Door-Front-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 56, textureX, textureY)
				.addShapeBox(0, -1, -3, 1, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -16, -7).setRotationAngle(0, 0, 0).setName("Door-Front-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 82, textureX, textureY)
				.addShapeBox(0, -1, -2, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -16, -7).setRotationAngle(0, 0, 0).setName("Door-Front-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-32, -17, -10).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 82, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 1, 2)
				.setCorners(0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setPolygonUV(1, new float[]{ 1.25f, 2.0f, 0.0f, 2.0f, 0.0f, 3.0f, 2.0f, 3.0f })
				.setPolygonUV(0, new float[]{ 5.0f, 2.0f, 3.75f, 2.0f, 3.0f, 3.0f, 5.0f, 3.0f }).build()
				.setRotationPoint(-32, -18, -9).setRotationAngle(0, 0, 0).setName("box")
		);
		group0.add(new ModelRendererTurbo(group0, 384, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -18, -10).setRotationAngle(0, 0, 0).setName("box173")
		);
		group0.add(new ModelRendererTurbo(group0, 147, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -19, -9).setRotationAngle(0, 0, 0).setName("box17")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 78, textureX, textureY)
				.addShapeBox(0, -2, -2, 1, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -16, -7).setRotationAngle(0, 0, 0).setName("Door-Front-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 89, textureX, textureY).addBox(0, 0, 0, 1, 11, 3)
				.setRotationPoint(-32, -16, 7).setRotationAngle(0, 0, 0).setName("Door-Front-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 374, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -17, 9).setRotationAngle(0, 0, 0).setName("Door-Front-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -17, 7).setRotationAngle(0, 0, 0).setName("Door-Front-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 76, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 1, 2)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(1, new float[]{ 2.0f, 2.0f, 0.75f, 2.0f, 0.0f, 3.0f, 2.0f, 3.0f })
				.setPolygonUV(0, new float[]{ 4.25f, 2.0f, 3.0f, 2.0f, 3.0f, 3.0f, 5.0f, 3.0f }).build()
				.setRotationPoint(-32, -18, 7).setRotationAngle(0, 0, 0).setName("box")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-32, -18, 9).setRotationAngle(0, 0, 0).setName("box84")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
				.setRotationPoint(-32, -19, 7).setRotationAngle(0, 0, 0).setName("box17")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -18, 7).setRotationAngle(0, 0, 0).setName("Door-Front-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -17, 9).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 89, textureX, textureY).addBox(0, 0, 0, 1, 11, 3)
				.setRotationPoint(-18, -16, -10).setRotationAngle(0, 0, 0).setName("Door-Back-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, -17, -10).setRotationAngle(0, 0, 0).setName("Door-Back-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 198, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, -17, -9).setRotationAngle(0, 0, 0).setName("Door-Back-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-18, -17, -10).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 184, 73, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 1, 2)
				.setCorners(0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setPolygonUV(1, new float[]{ 1.25f, 2.0f, 0.0f, 2.0f, 0.0f, 3.0f, 2.0f, 3.0f })
				.setPolygonUV(0, new float[]{ 5.0f, 2.0f, 3.75f, 2.0f, 3.0f, 3.0f, 5.0f, 3.0f }).build()
				.setRotationPoint(-18, -18, -9).setRotationAngle(0, 0, 0).setName("box")
		);
		group0.add(new ModelRendererTurbo(group0, 278, 38, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, -18, -10).setRotationAngle(0, 0, 0).setName("box173")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, -19, -9).setRotationAngle(0, 0, 0).setName("box17")
		);
		group0.add(new ModelRendererTurbo(group0, 439, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, -18, -9).setRotationAngle(0, 0, 0).setName("Door-Back-Left")
		);
		group0.add(new ModelRendererTurbo(group0, 264, 89, textureX, textureY).addBox(-1, 0, 0, 1, 11, 3)
				.setRotationPoint(-17, -16, 7).setRotationAngle(0, 0, 0).setName("Door-Back-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 36, textureX, textureY)
				.addShapeBox(-1, -1, 2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -16, 7).setRotationAngle(0, 0, 0).setName("Door-Back-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 72, textureX, textureY)
				.addShapeBox(-1, -1, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -16, 7).setRotationAngle(0, 0, 0).setName("Door-Back-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 36, 72, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 1, 2)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(1, new float[]{ 2.0f, 2.0f, 0.75f, 2.0f, 0.0f, 3.0f, 2.0f, 3.0f })
				.setPolygonUV(0, new float[]{ 4.25f, 2.0f, 3.0f, 2.0f, 3.0f, 3.0f, 5.0f, 3.0f }).build()
				.setRotationPoint(-18, -18, 7).setRotationAngle(0, 0, 0).setName("box")
		);
		group0.add(new ModelRendererTurbo(group0, 140, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-18, -18, 9).setRotationAngle(0, 0, 0).setName("box84")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
				.setRotationPoint(-18, -19, 7).setRotationAngle(0, 0, 0).setName("box17")
		);
		group0.add(new ModelRendererTurbo(group0, 239, 61, textureX, textureY)
				.addShapeBox(-1, -2, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -16, 7).setRotationAngle(0, 0, 0).setName("Door-Back-Right")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, -17, 9).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 19, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -20, -3).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 204, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 19, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -20, 0).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 19, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -19, -3).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 143, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 68, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -20, -3).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 68, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -20, 0).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 68, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -19, -3).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 374, 55, textureX, textureY).addBox(0, 0, 0, 2, 1, 5)
				.setRotationPoint(-11, -19.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 79, textureX, textureY).addBox(0, 0, 0, 2, 2, 3)
				.setRotationPoint(24, -19.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 28, textureX, textureY).addBox(0, 0, 0, 15, 6, 16)
				.setRotationPoint(-14, 3, -8).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 208, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57, 2.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 255, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-56, 1.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 50, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.5f, 1.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 398, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(55, 2.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(55, 1.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55.5f, 1.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 28, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-34.5f, -20, -0.5f).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 88, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-34.5f, -21, -1.5f).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-35.5f, -21.5f, -0.75f).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 383, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-36.5f, -21.5f, -2).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 25, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-35.5f, -21, -1.5f).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-33.5f, -21.5f, 0).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 422, 14, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-15.5f, -20, -0.5f).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		group0.add(new ModelRendererTurbo(group0, 218, 88, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-15.5f, -21, -1.5f).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-14.5f, -21.5f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 63, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-13.5f, -21.5f, 0).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 14, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-14.5f, -21, 0.5f).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		group0.add(new ModelRendererTurbo(group0, 214, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-16.5f, -21.5f, -2).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 157, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55.25f, 3, -8).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-56.25f, 3.2f, -8.12f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55.75f, 3.2f, -8.12f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 125, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-56, 6, -10).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-56, 7, -10).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-56, 7, -8).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-56, 2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0)
				.setRotationPoint(-52.25f, -7.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-52, -13.5f, 3).setRotationAngle(0, 15, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-52, -4, 2).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 1, 0, 0, -1.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 1, -0.5f, 0, -1.5f, -0.5f, 0)
				.setRotationPoint(-52, -4, 4).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 343, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f)
				.setRotationPoint(-51, -10, 5.25f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f)
				.setRotationPoint(-51, -10, -6.3f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 453, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.8f, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, -0.8f, -0.55f, -0.55f, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.8f, 0, -0.55f)
				.setRotationPoint(-35.55f, -12, 11).setRotationAngle(0, 0, 0).setName("Box 164")
		);
		group0.add(new ModelRendererTurbo(group0, 170, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-36, -16.25f, 7).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 468, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-36, -13.25f, 7).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 276, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-36, -10.25f, 7).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 264, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(-36, -19.3f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-42, -16.25f, -8).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 47, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-42, -13.25f, -8).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 60, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-42, -10.25f, -8).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-42, -19.3f, -6.5f).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(55, 2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 255, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(54.25f, 3, -8).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(55.25f, 3.2f, -7.88f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(54.75f, 3.2f, -7.88f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, 6, -10).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(55, 7, -10).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 158, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0)
				.setRotationPoint(55, 7, -8).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 360, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(54.25f, 3, 5).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(55.25f, 3.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 170, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(54.75f, 3.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, 6, 8).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(55, 7, 8).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 85, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0)
				.setRotationPoint(55, 7, 5).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(55, 2.5f, 3).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(50.25f, -13.5f, -5.5f).setRotationAngle(0, 15, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 22, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(51, -4, -4).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 14, 14, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 1, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 1, -0.5f, 0, -1.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(51, -4, -6).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f)
				.setRotationPoint(50, -10, -6.25f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 15, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.25f, -0.55f, 0, -0.25f, -0.55f, 0, -0.3f, 0, 0, -0.3f)
				.setRotationPoint(50, -10, 5.3f).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(51, -4, 2).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, 1, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -1.5f, -0.5f, 0, 1, -0.5f, 0)
				.setRotationPoint(51, -4, 4).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 360, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(51.15f, -13.5f, 2.5f).setRotationAngle(0, -15, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 14, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, 0, 0, 0.2f, 0, 0, -0.05f, 0, -0.25f, -0.5f, 0, -0.25f, -0.7f, -0.5f, 0, 0.2f, -0.5f, 0, -0.05f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f)
				.setRotationPoint(-55.95f, 5.25f, 10).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.7f, 0, 0, 0.2f, 0, 0, -0.05f, 0, 0, -0.5f, 0, 0, -0.7f, -0.5f, 0, 0.2f, -0.5f, 0, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-51.95f, 5.25f, 10).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		this.groups.add(group0);

		group0.add(new ModelRendererTurbo(group0, 455, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, -0.05f, 0, -0.25f, 0.2f, 0, 0, -0.7f, 0, 0, -0.5f, -0.5f, -0.25f, -0.05f, -0.5f, -0.25f, 0.2f, -0.5f, 0, -0.7f, -0.5f, 0)
				.setRotationPoint(-55.95f, 5.25f, -11).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 16, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.05f, 0, 0, 0.2f, 0, 0, -0.7f, 0, 0, -0.5f, -0.5f, 0, -0.05f, -0.5f, 0, 0.2f, -0.5f, 0, -0.7f, -0.5f, 0)
				.setRotationPoint(-51.95f, 5.25f, -11).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 154, 59, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, 0, 0, 0, -1, -1, -0.25f, -1, -1, -0.25f, 1, 0, 0, 1, 0)
				.setRotationPoint(-54.75f, 4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-54.75f, 4, 8).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, -1, -0.25f, 0, -1, -0.25f, -1.75f, 0, 0, -1.75f, 0, 0, -1, -1, -0.25f, -1, -1, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(-54.75f, 0, 4).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-55, 1, 7).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-54.75f, 2, 7).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(-54.75f, 8, 8).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		group0.add(new ModelRendererTurbo(group0, 19, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-55, 1.2f, 8).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 189, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, 0, 0, -1, 0, 1, 0, -0.25f, 1, 0, -0.25f, -1, -1, 0, -1, -1)
				.setRotationPoint(-54.75f, 4.5f, 8).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(51, 4, -9).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, -1.75f, 0, -0.25f, -1.75f, 0, -0.25f, 0, -1, 0, 0, -1, 0, 0, 0, -0.25f, 0, 0, -0.25f, -1, -1, 0, -1, -1)
				.setRotationPoint(51, 0, -7).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(50.75f, 1, -8).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 294, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
				.setRotationPoint(50.75f, 2, -8).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(51, 8, -10).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		group0.add(new ModelRendererTurbo(group0, 143, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(50.75f, 1.2f, -9).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, 0, 0, 0, -1, -1, -0.25f, -1, -1, -0.25f, 1, 0, 0, 1, 0)
				.setRotationPoint(51, 4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		group0.add(new ModelRendererTurbo(group0, 143, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(51, 4, 8).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 49, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 3, 0, 0, 0, -1, -0.25f, 0, -1, -0.25f, -1.75f, 0, 0, -1.75f, 0, 0, -1, -1, -0.25f, -1, -1, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(51, 0, 4).setRotationAngle(0, 0, 0).setName("Box 145")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(50.75f, 1, 7).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 316, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(50.75f, 2, 7).setRotationAngle(0, 0, 0).setName("Box 135")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(51, 8, 8).setRotationAngle(0, 0, 0).setName("Box 147")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(50.75f, 1.2f, 8).setRotationAngle(0, 0, 0).setName("Box 137")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 40, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -1, 0, 0, -1, 0, 1, 0, -0.25f, 1, 0, -0.25f, -1, -1, 0, -1, -1)
				.setRotationPoint(51, 4.5f, 8).setRotationAngle(0, 0, 0).setName("Box 144")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.2f, 0, 0, -0.7f, 0, 0, -0.5f, 0, -0.25f, -0.05f, 0, -0.25f, 0.2f, -0.5f, 0, -0.7f, -0.5f, 0, -0.5f, -0.5f, -0.25f, -0.05f, -0.5f, -0.25f)
				.setRotationPoint(54.95f, 5.25f, 10).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.2f, 0, 0, -0.7f, 0, 0, -0.5f, 0, 0, -0.05f, 0, 0, 0.2f, -0.5f, 0, -0.7f, -0.5f, 0, -0.5f, -0.5f, 0, -0.05f, -0.5f, 0)
				.setRotationPoint(50.95f, 5.25f, 10).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 16, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.05f, 0, -0.25f, -0.5f, 0, -0.25f, -0.7f, 0, 0, 0.2f, 0, 0, -0.05f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.7f, -0.5f, 0, 0.2f, -0.5f, 0)
				.setRotationPoint(54.95f, 5.25f, -11).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.05f, 0, 0, -0.5f, 0, 0, -0.7f, 0, 0, 0.2f, 0, 0, -0.05f, -0.5f, 0, -0.5f, -0.5f, 0, -0.7f, -0.5f, 0, 0.2f, -0.5f, 0)
				.setRotationPoint(50.95f, 5.25f, -11).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17, -5, -11).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-44, -5, -11).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-44.5f, -2.75f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 23, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-10.5f, -2.75f, -10.5f).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(33, -18.5f, 7).setRotationAngle(0, 0, 0).setName("Box 71cp")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(33, -18.5f, -9).setRotationAngle(0, 0, 0).setName("Box 71cp")
		);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -1, 0, 0, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, -20, -7).setRotationAngle(0, 0, 0).setName("Box 32cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, -20, 0).setRotationAngle(0, 0, 0).setName("Box 32cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -1, 0, 0, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -20, -7).setRotationAngle(0, 0, 0).setName("Box 32cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-32, -20, 0).setRotationAngle(0, 0, 0).setName("Box 32cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 124, textureX, textureY).addBox(0, 0, 0, 103, 1, 15)
				.setRotationPoint(-51, 2, -7.5f).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 204, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.55f, -0.7f, 0, 0, -0.7f, 0, 0, -0.7f, -0.55f, -0.55f, -0.7f, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f)
				.setRotationPoint(-56, -7.5f, -5).setRotationAngle(0, 0, 0).setName("Box 178cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 203, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.55f, -0.7f, -0.55f, 0, -0.7f, -0.55f, 0, -0.7f, 0, -0.55f, -0.7f, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0)
				.setRotationPoint(-56, -7.5f, 4).setRotationAngle(0, 0, 0).setName("Box 178cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 205, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.7f, 0, -0.55f, -0.7f, 0, -0.55f, -0.7f, -0.55f, 0, -0.7f, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, -0.55f, 0, 0, -0.55f)
				.setRotationPoint(55, -7.5f, -5).setRotationAngle(0, 0, 0).setName("Box 178cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 203, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.7f, -0.55f, -0.55f, -0.7f, -0.55f, -0.55f, -0.7f, 0, 0, -0.7f, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(55, -7.5f, 4).setRotationAngle(0, 0, 0).setName("Box 178cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.55f, 0, -0.9f, -0.55f, -0.8f, 0, 0, -0.8f, 0, 0, -1, -0.9f, -0.55f, -1, -0.9f)
				.setRotationPoint(-56, -6.8f, -8).setRotationAngle(0, 0, 0).setName("Box 180cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.55f, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.55f, 0, 0, -0.55f, -1, -0.9f, 0, -1, -0.9f, 0, -0.8f, 0, -0.55f, -0.8f, 0)
				.setRotationPoint(-56, -6.8f, 7).setRotationAngle(0, 0, 0).setName("Box 180cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.9f, -0.55f, 0, -0.9f, -0.55f, -0.8f, 0, 0, -0.8f, 0, 0, -1, -0.9f, -0.55f, -1, -0.9f)
				.setRotationPoint(54.45f, -6.8f, -8).setRotationAngle(0, 0, 0).setName("Box 180cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.55f, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, -0.55f, 0, 0, -0.55f, -1, -0.9f, 0, -1, -0.9f, 0, -0.8f, 0, -0.55f, -0.8f, 0)
				.setRotationPoint(54.45f, -6.8f, 7).setRotationAngle(0, 0, 0).setName("Box 180cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 23, 330, textureX, textureY)
				.addShapeBox(0, 0, 0, 150, 15, 0, 0, 0, 0, 0, -100, 0, 0, -100, 0, 0, 0, 0, 0, 0, -10, 0, -100, -10, 0, -100, -10, 0, 0, -10, 0)
				.setRotationPoint(-17, -11, 7.05f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 165, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(46.75f, -16, -8.25f).setRotationAngle(0, 0, 0).setName("Markerlight_left_frontcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 170, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(46.75f, -16, 7.25f).setRotationAngle(0, 0, 0).setName("Markerlight_right_frontcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 49, textureX, textureY).addBox(0, 0, 0, 2, 4, 16)
				.setRotationPoint(13, 4, -8).setRotationAngle(0, 0, 0).setName("Box 17cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 54, textureX, textureY).addBox(0, 0, 0, 1, 1, 16)
				.setRotationPoint(13.5f, 3, -8).setRotationAngle(0, 0, 0).setName("Box 17cp")
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_RS10cb(){
		TurboList RS10cb = new TurboList("RS10cb");
		RS10cb.add(new ModelRendererTurbo(RS10cb, 59, 146, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f)
				.setRotationPoint(47, -16, -8.25f).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 131, 158, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(47.25f, -16, -8.25f).setRotationAngle(0, 0, 0).setName("Markerlight_left_front")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 475, 124, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(47, -16, -8.5f).setRotationAngle(0, 0, 0).setName("Markerlight_left_left")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 467, 124, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(47, -16, -8).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 85, 151, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f)
				.setRotationPoint(47, -16, 7.25f).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 38, 163, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(47.25f, -16, 7.25f).setRotationAngle(0, 0, 0).setName("Markerlight_right_front")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 62, 153, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(47, -16, 7).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 75, 156, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(47, -16, 7.5f).setRotationAngle(0, 0, 0).setName("Markerlight_right_right")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 480, 207, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-15, -22, -0.5f).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 7, 142, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(50.3f, -18.45f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 1, 148, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(51.55f, -18.2f, 3.75f).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 1, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(51.3f, -17.7f, 3.5f).setRotationAngle(0, 0, 0).setName("Bell-Back")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 26, 157, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-16, -19.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 236, 181, textureX, textureY).addBox(0, 0, 0, 1, 2, 3)
				.setRotationPoint(-16, -21.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 10, 157, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0)
				.setRotationPoint(-14, -22, -0.5f).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 459, 153, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0)
				.setRotationPoint(-15, -21.75f, -1.75f).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 459, 150, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0)
				.setRotationPoint(-15, -21.75f, 0.75f).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 26, 150, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0)
				.setRotationPoint(-15, -20.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 10, 150, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0)
				.setRotationPoint(-15, -20.5f, -1).setRotationAngle(0, 0, 0)
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 155, 212, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, -8, -12).setRotationAngle(0, 0, 0).setName("Box 163cp")
		);
		RS10cb.add(new ModelRendererTurbo(RS10cb, 194, 207, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0, 0, 0, -0.55f, -0.55f, 0, -0.55f, -0.55f, 0, 0, 0, 0, 0)
				.setRotationPoint(-12, -7, -12).setRotationAngle(0, 0, 0).setName("Box 156cp")
		);
		this.groups.add(RS10cb);
	}

}
