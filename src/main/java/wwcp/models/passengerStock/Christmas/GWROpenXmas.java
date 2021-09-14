//FMT-Marker TiM-1.0
package wwcp.models.passengerStock.Christmas;

import ebf.tim.models.StaticModelAnimator;
import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.entity.Entity;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.1 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class GWROpenXmas extends RollingStockModel {

	public GWROpenXmas(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Test Account");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 247, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-61, 0, 2).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-61, 0, 17).setRotationAngle(0, 0, 0).setName("Box 16")
		);
		group0.add(new ModelRendererTurbo(group0, 314, 17, textureX, textureY)
			.addShapeBox(0, -1, -1, 3, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-60, 1.5f, 18.5f).setRotationAngle(45, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 303, 17, textureX, textureY)
			.addShapeBox(0, -1, -1, 3, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-60, 1.5f, 3.5f).setRotationAngle(45, 0, 0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, 2, 10.5f).setRotationAngle(0, 0, 0).setName("Box 393")
		);
		group0.add(new ModelRendererTurbo(group0, 222, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, 1, 10.5f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 1.25f, 0, 0, -1, 0, 0, -1, 0, 0, 1.25f, 0, 0)
			.setRotationPoint(-57, 1, 10.5f).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, -1, -1, 42, 2, 22)
			.setRotationPoint(-57, 1.5f, 1).setRotationAngle(0, 0, 0).setName("Box 7")
		);
		group0.add(new ModelRendererTurbo(group0, 43, 25, textureX, textureY).addBox(0, -1, -1, 1, 1, 22)
			.setRotationPoint(-57, 0.5f, 1).setRotationAngle(0, 0, 0).setName("Box 8")
		);
		group0.add(new ModelRendererTurbo(group0, 212, 23, textureX, textureY).addBox(0, -1, -1, 1, 12, 1)
			.setRotationPoint(-57, -11.5f, 1).setRotationAngle(0, 0, 0).setName("Box 9")
		);
		group0.add(new ModelRendererTurbo(group0, 207, 23, textureX, textureY).addBox(0, -1, -1, 1, 12, 1)
			.setRotationPoint(-57, -11.5f, 22).setRotationAngle(0, 0, 0).setName("Box 10")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 25, textureX, textureY).addBox(0, -1, -1, 1, 13, 20)
			.setRotationPoint(-56, -11.5f, 2).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 23, textureX, textureY).addBox(0, -1, -1, 1, 12, 1)
			.setRotationPoint(-16, -11.5f, 1).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 23, textureX, textureY).addBox(0, -1, -1, 1, 13, 20)
			.setRotationPoint(-17, -11.5f, 2).setRotationAngle(0, 0, 0).setName("Box 25")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 23, textureX, textureY).addBox(0, -1, -1, 1, 1, 22)
			.setRotationPoint(-16, 0.5f, 1).setRotationAngle(0, 0, 0).setName("Box 26")
		);
		group0.add(new ModelRendererTurbo(group0, 194, 23, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -11.5f, 16.5f).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		group0.add(new ModelRendererTurbo(group0, 189, 23, textureX, textureY).addBox(0, -1, -1, 1, 12, 1)
			.setRotationPoint(-16, -11.5f, 22).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 3, textureX, textureY).addBox(0, -1, -1, 10, 12, 1)
			.setRotationPoint(-55, -10.5f, 2).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		group0.add(new ModelRendererTurbo(group0, 314, 3, textureX, textureY).addBox(0, -1, -1, 10, 12, 1)
			.setRotationPoint(-27, -10.5f, 2).setRotationAngle(0, 0, 0).setName("Box 32")
		);
		group0.add(new ModelRendererTurbo(group0, 292, 17, textureX, textureY).addBox(0, -1, -1, 4, 12, 1)
			.setRotationPoint(-31, -10.5f, 2).setRotationAngle(0, 0, 0).setName("Box 33")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 17, textureX, textureY).addBox(-4, -1, -1, 4, 12, 1)
			.setRotationPoint(-41, -10.5f, 2).setRotationAngle(0, 0, 0).setName("Box 34")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 3, textureX, textureY).addBox(0, -1, -1, 10, 12, 1)
			.setRotationPoint(-41, -10.5f, 2).setRotationAngle(0, 0, 0).setName("Box 35")
		);
		group0.add(new ModelRendererTurbo(group0, 270, 17, textureX, textureY).addBox(-4, -1, -1, 4, 12, 1)
			.setRotationPoint(-41, -10.5f, 21).setRotationAngle(0, 0, 0).setName("Box 36")
		);
		group0.add(new ModelRendererTurbo(group0, 268, 3, textureX, textureY).addBox(0, -1, -1, 10, 12, 1)
			.setRotationPoint(-55, -10.5f, 21).setRotationAngle(0, 0, 0).setName("Box 37")
		);
		group0.add(new ModelRendererTurbo(group0, 245, 3, textureX, textureY).addBox(0, -1, -1, 10, 12, 1)
			.setRotationPoint(-41, -10.5f, 21).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 17, textureX, textureY).addBox(0, -1, -1, 4, 12, 1)
			.setRotationPoint(-31, -10.5f, 21).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 222, 3, textureX, textureY).addBox(0, -1, -1, 10, 12, 1)
			.setRotationPoint(-27, -10.5f, 21).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		group0.add(new ModelRendererTurbo(group0, 184, 23, textureX, textureY).addBox(0, -1, -1, 1, 13, 1)
			.setRotationPoint(-46, -11.5f, 1).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 179, 23, textureX, textureY).addBox(0, -1, -1, 1, 13, 1)
			.setRotationPoint(-41, -11.5f, 1).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		group0.add(new ModelRendererTurbo(group0, 174, 23, textureX, textureY).addBox(0, -1, -1, 1, 13, 1)
			.setRotationPoint(-32, -11.5f, 1).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 23, textureX, textureY).addBox(0, -1, -1, 1, 13, 1)
			.setRotationPoint(-27, -11.5f, 1).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		group0.add(new ModelRendererTurbo(group0, 199, 3, textureX, textureY)
			.addShapeBox(0, -1, -1, 10, 12, 1, 0, 0, 0, -0.5f, 0, -11, -0.5f, 0, -11, 0, 0, 0, 0, 0, -11, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -11, 0)
			.setRotationPoint(-26, -10.5f, 1).setRotationAngle(0, 0, 0).setName("Box 45")
		);
		group0.add(new ModelRendererTurbo(group0, 176, 3, textureX, textureY)
			.addShapeBox(0, -1, -1, 10, 12, 1, 0, 0, -11, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -11, 0, 0, 0, -0.5f, 0, -11, -0.5f, 0, -11, 0, 0, 0, 0)
			.setRotationPoint(-56, -10.5f, 1.01f).setRotationAngle(0, 0, 0).setName("Box 48")
		);
		group0.add(new ModelRendererTurbo(group0, 164, 23, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 53")
		);
		group0.add(new ModelRendererTurbo(group0, 159, 23, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, -1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 154, 23, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 23, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, -1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 56")
		);
		group0.add(new ModelRendererTurbo(group0, 144, 23, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 57")
		);
		group0.add(new ModelRendererTurbo(group0, 139, 23, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, -1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 59")
		);
		group0.add(new ModelRendererTurbo(group0, 134, 23, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-57, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 60")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 23, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-46, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 61")
		);
		group0.add(new ModelRendererTurbo(group0, 468, 22, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-41, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 62")
		);
		group0.add(new ModelRendererTurbo(group0, 463, 22, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-32, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 63")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 22, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-27, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 64")
		);
		group0.add(new ModelRendererTurbo(group0, 453, 22, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-16, 1.5f, 0).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 448, 22, textureX, textureY).addBox(0, -1, -1, 1, 13, 1)
			.setRotationPoint(-27, -11.5f, 22).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 443, 22, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, -1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 22, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-27, 1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 22, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 318, 22, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-16, 1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 72")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 22, textureX, textureY).addBox(0, -1, -1, 1, 13, 1)
			.setRotationPoint(-32, -11.5f, 22).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		group0.add(new ModelRendererTurbo(group0, 308, 22, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		group0.add(new ModelRendererTurbo(group0, 303, 22, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-32, 1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 21, textureX, textureY).addBox(0, -1, -1, 1, 13, 1)
			.setRotationPoint(-41, -11.5f, 22).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 21, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41, -1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 21, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-41, 1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 80")
		);
		group0.add(new ModelRendererTurbo(group0, 403, 21, textureX, textureY).addBox(0, -1, -1, 1, 13, 1)
			.setRotationPoint(-46, -11.5f, 22).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		group0.add(new ModelRendererTurbo(group0, 398, 21, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-46, -1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 20, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-46, 1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 20, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, -1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 20, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-57, 1.5f, 23).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		group0.add(new ModelRendererTurbo(group0, 480, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 0, 2).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		group0.add(new ModelRendererTurbo(group0, 118, 17, textureX, textureY)
			.addShapeBox(0, -1, -1, 3, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-15, 1.5f, 3.5f).setRotationAngle(45, 0, 0).setName("Box 89")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13, 1, 10.5f).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		group0.add(new ModelRendererTurbo(group0, 388, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14, 2, 10.5f).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		group0.add(new ModelRendererTurbo(group0, 378, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, -1, 0, 0)
			.setRotationPoint(-16.25f, 1, 10.5f).setRotationAngle(0, 0, 0).setName("Box 92")
		);
		group0.add(new ModelRendererTurbo(group0, 372, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 0, 17).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		group0.add(new ModelRendererTurbo(group0, 107, 17, textureX, textureY)
			.addShapeBox(0, -1, -1, 3, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-15, 1.5f, 18.5f).setRotationAngle(45, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 3, textureX, textureY)
			.addShapeBox(0, -1, -1, 10, 12, 1, 0, 0, 0, -0.5f, 0, -11, -0.5f, 0, -11, 0, 0, 0, 0, 0, -11, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -11, 0)
			.setRotationPoint(-56, -10.5f, 1).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		group0.add(new ModelRendererTurbo(group0, 130, 3, textureX, textureY)
			.addShapeBox(0, -1, -1, 10, 12, 1, 0, 0, -11, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -11, 0, 0, 0, -0.5f, 0, -11, -0.5f, 0, -11, 0, 0, 0, 0)
			.setRotationPoint(-26, -10.5f, 1.01f).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		group0.add(new ModelRendererTurbo(group0, 398, 3, textureX, textureY)
			.addShapeBox(0, -1, -1, 8, 12, 1, 0, 0, -11, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -11, 0, 0, 0, -0.5f, 0, -11, -0.5f, 0, -11, 0, 0, 0, 0)
			.setRotationPoint(-40, -10.5f, 1.01f).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 3, textureX, textureY)
			.addShapeBox(0, -1, -1, 8, 12, 1, 0, 0, 0, -0.5f, 0, -11, -0.5f, 0, -11, 0, 0, 0, 0, 0, -11, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -11, 0)
			.setRotationPoint(-40, -10.5f, 1).setRotationAngle(0, 0, 0).setName("Box 98")
		);
		group0.add(new ModelRendererTurbo(group0, 107, 3, textureX, textureY)
			.addShapeBox(0, -1, -1, 10, 12, 1, 0, 0, -11, 0, 0, 0, 0, 0, 0, -0.5f, 0, -11, -0.5f, 0, 0, 0, 0, -11, 0, 0, -11, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-56, -10.5f, 22.01f).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		group0.add(new ModelRendererTurbo(group0, 479, 0, textureX, textureY)
			.addShapeBox(0, -1, -1, 10, 12, 1, 0, 0, 0, 0, 0, -11, 0, 0, -11, -0.5f, 0, 0, -0.5f, 0, -11, 0, 0, 0, 0, 0, 0, -0.5f, 0, -11, -0.5f)
			.setRotationPoint(-56, -10.5f, 22).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 360, 3, textureX, textureY)
			.addShapeBox(0, -1, -1, 8, 12, 1, 0, 0, 0, 0, 0, -11, 0, 0, -11, -0.5f, 0, 0, -0.5f, 0, -11, 0, 0, 0, 0, 0, 0, -0.5f, 0, -11, -0.5f)
			.setRotationPoint(-40, -10.5f, 22).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, -1, -1, 8, 12, 1, 0, 0, -11, 0, 0, 0, 0, 0, 0, -0.5f, 0, -11, -0.5f, 0, 0, 0, 0, -11, 0, 0, -11, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-40, -10.5f, 22.01f).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 0, textureX, textureY)
			.addShapeBox(0, -1, -1, 10, 12, 1, 0, 0, -11, 0, 0, 0, 0, 0, 0, -0.5f, 0, -11, -0.5f, 0, 0, 0, 0, -11, 0, 0, -11, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-26, -10.5f, 22.01f).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 0, textureX, textureY)
			.addShapeBox(0, -1, -1, 10, 12, 1, 0, 0, 0, 0, 0, -11, 0, 0, -11, -0.5f, 0, 0, -0.5f, 0, -11, 0, 0, 0, 0, 0, 0, -0.5f, 0, -11, -0.5f)
			.setRotationPoint(-26, -10.5f, 22).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 20, textureX, textureY).addBox(0, -1, -1, 1, 1, 22)
			.setRotationPoint(-57, -12.5f, 1).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		group0.add(new ModelRendererTurbo(group0, 363, 20, textureX, textureY).addBox(0, -1, -1, 1, 1, 22)
			.setRotationPoint(-16, -12.5f, 1).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		group0.add(new ModelRendererTurbo(group0, 362, 0, textureX, textureY).addBox(0, -1, -1, 11, 1, 1)
			.setRotationPoint(-56, -12.5f, 1).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		group0.add(new ModelRendererTurbo(group0, 410, 0, textureX, textureY).addBox(0, -1, -1, 10, 1, 1)
			.setRotationPoint(-41, -12.5f, 1).setRotationAngle(0, 0, 0).setName("Box 108")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 0, textureX, textureY).addBox(0, -1, -1, 11, 1, 1)
			.setRotationPoint(-27, -12.5f, 1).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 312, 0, textureX, textureY).addBox(0, -1, -1, 11, 1, 1)
			.setRotationPoint(-27, -12.5f, 22).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 0, textureX, textureY).addBox(0, -1, -1, 10, 1, 1)
			.setRotationPoint(-41, -12.5f, 22).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 0, textureX, textureY).addBox(0, -1, -1, 11, 1, 1)
			.setRotationPoint(-56, -12.5f, 22).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		group0.add(new ModelRendererTurbo(group0, 367, 20, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -11.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		group0.add(new ModelRendererTurbo(group0, 358, 20, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -11.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 20, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 12, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57, -11.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		group0.add(new ModelRendererTurbo(group0, 348, 20, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 12, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57, -11.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 343, 20, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 12, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57, -11.5f, 16.5f).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 346, 20, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 18)
			.setRotationPoint(-22, 6, 2).setRotationAngle(0, 0, 0).setName("Box 48")
		);
		group0.add(new ModelRendererTurbo(group0, 338, 20, textureX, textureY)
			.addShapeBox(0, -1, -1, 1, 12, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57, -11.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		group0.add(new ModelRendererTurbo(group0, 333, 20, textureX, textureY).addBox(0, -1, -1, 1, 3, 1)
			.setRotationPoint(-49.5f, 3.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		group0.add(new ModelRendererTurbo(group0, 328, 20, textureX, textureY).addBox(0, -1, -1, 1, 3, 1)
			.setRotationPoint(-36.5f, 3.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 502, 19, textureX, textureY).addBox(0, -1, -1, 1, 3, 1)
			.setRotationPoint(-22.5f, 3.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		group0.add(new ModelRendererTurbo(group0, 307, 20, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 18)
			.setRotationPoint(-36, 6, 2).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		group0.add(new ModelRendererTurbo(group0, 407, 19, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 18)
			.setRotationPoint(-49, 6, 2).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		group0.add(new ModelRendererTurbo(group0, 246, 17, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, 0, -3, 0, -1, 0, 0, -1, 0, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(-21, 3, 2).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 17, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, 0, -3, 0, -1, 0, 0, -1, 0, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(-35, 3, 2).setRotationAngle(0, 0, 0).setName("Box 108")
		);
		group0.add(new ModelRendererTurbo(group0, 220, 17, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, 0, -3, 0, -1, 0, 0, -1, 0, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(-48, 3, 2).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 207, 17, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, -1, 0, 0, 0, -3, 0, 0, -3, 0, -1, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(-54, 3, 2).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		group0.add(new ModelRendererTurbo(group0, 194, 17, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, -1, 0, 0, 0, -3, 0, 0, -3, 0, -1, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(-41, 3, 2).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		group0.add(new ModelRendererTurbo(group0, 181, 17, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, -1, 0, 0, 0, -3, 0, 0, -3, 0, -1, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(-27, 3, 2).setRotationAngle(0, 0, 0).setName("Box 112")
		);
		group0.add(new ModelRendererTurbo(group0, 420, 19, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 2, 1)
			.setRotationPoint(-22, 4, 2).setRotationAngle(0, 0, 0).setName("Box 113")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 19, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 2, 1)
			.setRotationPoint(-36, 4, 2).setRotationAngle(0, 0, 0).setName("Box 114")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 17, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 2, 1)
			.setRotationPoint(-49, 4, 2).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		group0.add(new ModelRendererTurbo(group0, 168, 17, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, -1, 0, 0, 0, -3, 0, 0, -3, 0, -1, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(-54, 3, 19).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		group0.add(new ModelRendererTurbo(group0, 410, 17, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 2, 1)
			.setRotationPoint(-49, 4, 19).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 155, 17, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, 0, -3, 0, -1, 0, 0, -1, 0, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(-48, 3, 19).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 17, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, -1, 0, 0, 0, -3, 0, 0, -3, 0, -1, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(-41, 3, 19).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 17, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 2, 1)
			.setRotationPoint(-36, 4, 19).setRotationAngle(0, 0, 0).setName("Box 120")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 17, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, 0, -3, 0, -1, 0, 0, -1, 0, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(-35, 3, 19).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 490, 14, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, -1, 0, 0, 0, -3, 0, 0, -3, 0, -1, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0)
			.setRotationPoint(-27, 3, 19).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 17, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 2, 1)
			.setRotationPoint(-22, 4, 19).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 14, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 5, 4, 1, 0, 0, -3, 0, -1, 0, 0, -1, 0, 0, 0, -3, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0)
			.setRotationPoint(-21, 3, 19).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 14, textureX, textureY).addBox(-3.5f, -3.5f, 0, 7, 7, 0)
			.setRotationPoint(-22, 6, 17).setRotationAngle(0, 0, 0).setName("Wheel")
		);
		group0.add(new ModelRendererTurbo(group0, 447, 14, textureX, textureY).addBox(-3.5f, -3.5f, 0, 7, 7, 0)
			.setRotationPoint(-22, 6, 5).setRotationAngle(0, 0, 0).setName("Wheel")
		);
		group0.add(new ModelRendererTurbo(group0, 432, 14, textureX, textureY).addBox(-3.5f, -3.5f, 0, 7, 7, 0)
			.setRotationPoint(-36, 6, 5).setRotationAngle(0, 0, 0).setName("Wheel")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 14, textureX, textureY).addBox(-3.5f, -3.5f, 0, 7, 7, 0)
			.setRotationPoint(-36, 6, 17).setRotationAngle(0, 0, 0).setName("Wheel")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 11, textureX, textureY).addBox(-3.5f, -3.5f, 0, 7, 7, 0)
			.setRotationPoint(-49, 6, 5).setRotationAngle(0, 0, 0).setName("Wheel")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 3, textureX, textureY).addBox(-3.5f, -3.5f, 0, 7, 7, 0)
			.setRotationPoint(-49, 6, 17).setRotationAngle(0, 0, 0).setName("Wheel")
		);
		this.groups.add(group0);
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 0, textureX, textureY)
			.addShapeBox(0, -1, -1, 21, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-57, -6.5f, 0).setRotationAngle(0, 0, 0).setName("String")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 0, textureX, textureY)
			.addShapeBox(0, -1, -1, 21, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-36, -6.5f, 0).setRotationAngle(0, 0, 0).setName("String")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 0, textureX, textureY)
			.addShapeBox(0, -1, -1, 21, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-57, -6.5f, 23).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 0, textureX, textureY)
			.addShapeBox(0, -1, -1, 21, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-36, -6.5f, 23).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-57, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-39, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 17, textureX, textureY, StaticModelAnimator.tagGlow).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-57, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-54, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-51, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-48, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-45, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-42, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-34, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-31, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-28, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-25, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-22, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-19, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-16, -5.5f, 23.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 17, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-54, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 15, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-51, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 14, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-48, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 12, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-45, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 12, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-42, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 9, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-39, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 9, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-34, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 6, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-31, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 6, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-28, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 3, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-25, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 3, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-22, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 0, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-19, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 0, textureX, textureY).addBox(0, -1, -1, 1, 1, 1)
			.setRotationPoint(-16, -5.5f, -0.5f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		this.groups.add(clipboard);
		//
	}

}
