//FMT-Marker TiM-1.0
package wwcp.models.locomotives.diesels;

import ebf.tim.models.StaticModelAnimator;
import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.entity.Entity;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class AC4400CW extends RollingStockModel {

	public AC4400CW(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		initGroup_group0();
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 54, 184, textureX, textureY).addBox(0, 0, 0, 136, 1, 22)
				.setRotationPoint(-69, -2, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 340, 80, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(48, 1, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 287, 39, textureX, textureY).addBox(0, 0, 0, 52, 3, 18)
				.setRotationPoint(-26, 1, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 471, 98, textureX, textureY).addBox(0, 0, 0, 17, 4, 2)
				.setRotationPoint(-18, 1, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 369, 138, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(13, -0.5f, 10).setRotationAngle(-45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 478, 18, textureX, textureY).addBox(0, 0, 0, 4, 1, 12)
				.setRotationPoint(68, -2, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 184, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 18, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(72, -2, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 410, 105, textureX, textureY).addBox(0, 0, 0, 1, 2, 16)
				.setRotationPoint(72.25f, -2, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 52, 112, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(72.25f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 61, textureX, textureY).addBox(0, 0, 0, 42, 21, 14)
				.setRotationPoint(1, -23, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 192, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 6, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-28.5f, -22, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 168, 90, textureX, textureY).addBox(0, 0, 0, 25, 5, 4)
				.setRotationPoint(17, -7, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 432, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 4, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(68.1f, -15, 0.8f).setRotationAngle(0, -17, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 368, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
				.setRotationPoint(67, -13, 5).setRotationAngle(0, -17, 0).setName("nose_numberboard_left")
		);
		group0.add(new ModelRendererTurbo(group0, 416, 111, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(64, -16.5f, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 407, 87, textureX, textureY).addBox(0, 0, 0, 26, 13, 4)
				.setRotationPoint(16, -15, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 399, 111, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-54, -10, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 267, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, 0, 0, -1, 0, 0, -0.25f, 0)
				.setRotationPoint(72.25f, 0, 3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 24, textureX, textureY).addBox(0, 0, 0, 138, 2, 14)
				.setRotationPoint(-70, -1, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 12, 16, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(-50, 1, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 317, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 52, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-26, 4, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 208, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 52, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
				.setRotationPoint(-26, 6, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 41, textureX, textureY).addBox(0, 0, 0, 52, 2, 17)
				.setRotationPoint(-26, 4, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 139, 41, textureX, textureY).addBox(0, 0, 0, 52, 3, 16)
				.setRotationPoint(-26, 6, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 491, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, 4, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 139, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(20, 4, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 99, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 52, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, 6, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 322, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(20, 1, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 139, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(20, 1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 271, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, 1, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 139, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, 1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 410, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 40, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-20, 5, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 164, 107, textureX, textureY).addBox(0, 0, 0, 17, 2, 1)
				.setRotationPoint(-18, 2, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 118, 107, textureX, textureY).addBox(0, 0, 0, 17, 2, 1)
				.setRotationPoint(-18, 2, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 269, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, 1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 389, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, 1, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 164, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, 4, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 118, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-18, 4, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 60, 97, textureX, textureY).addBox(0, 0, 0, 17, 4, 2)
				.setRotationPoint(1, 1, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 60, 104, textureX, textureY).addBox(0, 0, 0, 17, 2, 1)
				.setRotationPoint(1, 2, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 164, 100, textureX, textureY).addBox(0, 0, 0, 17, 2, 1)
				.setRotationPoint(1, 2, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 474, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(1, 1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 464, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(1, 1, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 267, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(1, 4, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 260, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(1, 4, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 364, 138, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(22, 0.25f, -11).setRotationAngle(45, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 354, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(68, -2, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 213, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(67, -0.5f, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 256, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(67, 1.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 387, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(67, 3.5f, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 387, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(67, 5.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 497, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(67, 7.5f, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 298, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(68, -2, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 253, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(67, 7, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 99, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(67, 5, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 394, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(67, 3, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(67, 1, 6.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 410, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(67, -1, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 359, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(72, -2, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 345, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 20, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(72, 0, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 354, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(72, 4, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 39, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(72, 8, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 349, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(72, -2, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 301, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(72, 4, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 297, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(72, 7, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 394, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(72, 8, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 389, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -1, 0)
				.setRotationPoint(72, 8, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 421, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(67, -2, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 18, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -2, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 296, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -2, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 141, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 20, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, 0, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 291, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, 4, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 368, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, 8, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 286, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -2, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 281, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, 4, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 446, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 22, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, 7, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 190, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1, 0, -0.75f, -1, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, 8, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 21, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -1, 0)
				.setRotationPoint(-74.25f, 8, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 363, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-69.25f, -2, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 352, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-69.25f, -2, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 297, 6, textureX, textureY).addBox(0, 0, 0, 4, 1, 12)
				.setRotationPoint(-74, -2, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 287, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, -2, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 476, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, -0.5f, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 411, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, 1.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 400, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, 3.5f, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 389, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, 5.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 387, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, 7.5f, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 344, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, 7, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 333, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, 5, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 322, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, 3, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 71, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, 1, 6.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 60, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, -1, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, -2, -7).setRotationAngle(0, 0, 0).setName("aaunnamed0")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, -0.5f, -8).setRotationAngle(0, 0, 0).setName("aaunnamed1")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, 1.5f, -8.5f).setRotationAngle(0, 0, 0).setName("aaunnamed2")
		);
		group0.add(new ModelRendererTurbo(group0, 46, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, 3.5f, -9).setRotationAngle(0, 0, 0).setName("aaunnamed3")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, 5.5f, -9.5f).setRotationAngle(0, 0, 0).setName("aaunnamed4")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-74, 7.5f, -11).setRotationAngle(0, 0, 0).setName("aaunnamed5")
		);
		group0.add(new ModelRendererTurbo(group0, 266, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, -1, -7.5f).setRotationAngle(0, 0, 0).setName("aaunnamed6")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, 1, -8).setRotationAngle(0, 0, 0).setName("aaunnamed7")
		);
		group0.add(new ModelRendererTurbo(group0, 276, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, 3, -8.5f).setRotationAngle(0, 0, 0).setName("aaunnamed8")
		);
		group0.add(new ModelRendererTurbo(group0, 293, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, 5, -9).setRotationAngle(0, 0, 0).setName("aaunnamed9")
		);
		group0.add(new ModelRendererTurbo(group0, 293, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, 7, -9.5f).setRotationAngle(0, 0, 0).setName("aaunnamed10")
		);
		group0.add(new ModelRendererTurbo(group0, 183, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(72.25f, -2, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 178, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(72.25f, -2, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 240, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(73.25f, -2, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 368, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(74.25f, -2, -5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 231, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(73.25f, -2, 5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 40, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(74.25f, -2, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 378, 119, textureX, textureY).addBox(0, 0, 0, 1, 2, 10)
				.setRotationPoint(73.25f, -2, -5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 173, 138, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(73.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 168, 138, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(74.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 163, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(73.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 158, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(75.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 153, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(75.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 307, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(73.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 155, 109, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-75.25f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 148, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-76.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 66, 137, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-77.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 61, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-78.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 51, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-78.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 439, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(-76.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 218, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(-77.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 319, 6, textureX, textureY).addBox(0, 0, 0, 65, 18, 14)
				.setRotationPoint(-64, -20, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 423, 275, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 19, 6, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-69.5f, -21, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 222, 128, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-69.5f, -21, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 396, 288, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 18, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-67, -20, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 462, 247, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 19, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-69.5f, -21, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 369, 278, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 18, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-67, -20, 5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 476, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 18, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -20, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 408, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -20.5f, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 113, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 2, 10, 0, 0, -1.9f, 0, 0, -1.9f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-68, -22.5f, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 113, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 38, 1, 7, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-37, -21, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 310, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 38, 1, 7, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-37, -21, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 267, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 2, 10, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -1.9f, 0, 0, -1.9f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -22.5f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 391, 68, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-68, -18.5f, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 194, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0)
				.setRotationPoint(-68, -18.5f, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 139, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 12, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-69.5f, -14, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 421, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-69.5f, -14.5f, -0.5f).setRotationAngle(0, 0, -34)
		);
		group0.add(new ModelRendererTurbo(group0, 130, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
				.setRotationPoint(-69.5f, -17, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 464, 68, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-64, -17.5f, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 464, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-64, -17.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 471, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 2, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(42, -23, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 471, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(42, -23, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 81, 126, textureX, textureY).addBox(0, 0, 0, 1, 19, 3)
				.setRotationPoint(42, -21, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 445, 108, textureX, textureY).addBox(0, 0, 0, 14, 19, 1)
				.setRotationPoint(42, -21, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 223, 107, textureX, textureY).addBox(0, 0, 0, 14, 19, 1)
				.setRotationPoint(42, -21, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 308, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 11, 0, -2, 0, 0, 2, 0, 0, -1, 0, 0, 1, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -21, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 396, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 11, 0, 1, 0, 0, -1, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0)
				.setRotationPoint(57, -21, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 118, textureX, textureY).addBox(0, 0, 0, 10, 12, 1)
				.setRotationPoint(56, -14, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 152, 120, textureX, textureY).addBox(0, 0, 0, 8, 15, 2)
				.setRotationPoint(60, -17, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 281, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 12, 10, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(66, -14, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 68, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 10, 0, -2, 0, 0, 0, 0, 0, -3, -3, 0, 0, -3, 0, -2, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(66, -17, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 328, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, -1, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -17, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 14, 132, textureX, textureY).addBox(0, 0, 0, 2, 3, 1)
				.setRotationPoint(56, -17, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 15, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -21, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 322, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -10, 0, 0, 0)
				.setRotationPoint(58, -17, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 118, 92, textureX, textureY)
				.addShapeBox(1, 0, 0, 11, 1, 10, 0, 0, 0, -10, 0, 0, 0, -3, -3, 0, 0, 0, 0, 0, 0, -9, -1, 0, 0, -3, 2, 0, 0, 0, -1)
				.setRotationPoint(57, -17, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 38, 117, textureX, textureY).addBox(0, 0, 0, 10, 12, 1)
				.setRotationPoint(56, -14, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 254, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 12, 10, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(66, -14, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 483, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 10, 0, 0, -3, 0, -3, -3, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, -2, 0, 0)
				.setRotationPoint(66, -17, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 99, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 3, 1, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -17, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 7, 132, textureX, textureY).addBox(0, 0, 0, 2, 3, 1)
				.setRotationPoint(56, -17, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 10, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -21, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 260, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 10, 0, 0, 0, 0, 0, 0, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -10, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -17, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 464, 0, textureX, textureY)
				.addShapeBox(1, 0, 0, 11, 1, 10, 0, 0, 0, 0, -3, -3, 0, 0, 0, 0, 0, 0, -10, 0, 0, -1, -3, 2, 0, -1, 0, 0, 0, 0, -9)
				.setRotationPoint(57, -17, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 213, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(43, -23, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 500, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, -0.41f, 0, 0, -1, -2, 0, 0, -2, 0, 0, 0, 0, 0.09f, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -23, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 298, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 7, 0, 0, 0, 0, -0.6f, 0, 0, -2.41f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -23, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 102, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -2, 0, -1, -2, 0, -0.41f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.09f, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -23, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 491, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 7, 0, 0, 0, 0, -2.41f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -23, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 330, 74, textureX, textureY).addBox(0, 0, 0, 18, 1, 20)
				.setRotationPoint(43, -8, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 72, 126, textureX, textureY).addBox(0, 0, 0, 1, 2, 3)
				.setRotationPoint(42, -8, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 93, 92, textureX, textureY).addBox(0, 0, 0, 2, 9, 20)
				.setRotationPoint(58, -16, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 12, 5, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(58, -17, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 173, 120, textureX, textureY).addBox(0, 0, 0, 1, 9, 8)
				.setRotationPoint(57, -17, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 21, 105, textureX, textureY).addBox(0, 0, 0, 5, 1, 8)
				.setRotationPoint(52, -15, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 389, 96, textureX, textureY).addBox(0, 0, 0, 5, 6, 1)
				.setRotationPoint(52, -14, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 333, 116, textureX, textureY).addBox(0, 0, 0, 1, 9, 8)
				.setRotationPoint(57, -17, 2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 7, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -17, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 381, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -17, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 293, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(52, -17, -3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 5, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(47, -12, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 491, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -13, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 205, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -18, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 216, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(47, -12, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 478, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -13, 4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -18, 4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 291, 28, textureX, textureY).addBox(0, 0, 0, 5, 1, 8)
				.setRotationPoint(52, -15, 2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 256, 91, textureX, textureY).addBox(0, 0, 0, 5, 6, 1)
				.setRotationPoint(52, -14, 2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 410, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 7, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -17, 3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 82, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -17, 2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 478, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(52, -17, 2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 121, 123, textureX, textureY).addBox(0, 0, 0, 1, 12, 3)
				.setRotationPoint(42, -20, -10).setRotationAngle(0, 0, 0).setName("Door0")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 132, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
				.setRotationPoint(42, -21, -9).setRotationAngle(0, 0, 0).setName("Door1")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(42, -21, -10).setRotationAngle(0, 0, 0).setName("Door2")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(42, -21, -10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 322, 131, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
				.setRotationPoint(68, -17, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 315, 131, textureX, textureY).addBox(0, 0, 0, 1, 11, 2)
				.setRotationPoint(68, -13, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 308, 131, textureX, textureY).addBox(0, 0, 0, 1, 3, 2)
				.setRotationPoint(67.75f, -16, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 50, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f)
				.setRotationPoint(67.9f, -16, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 43, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
				.setRotationPoint(68.15f, -16.25f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 36, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
				.setRotationPoint(68.15f, -14.75f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 249, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
				.setRotationPoint(68.25f, -14.75f, -1).setRotationAngle(0, 0, 0).setName("Headlight_bottom")
		);
		group0.add(new ModelRendererTurbo(group0, 199, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
				.setRotationPoint(68.25f, -16.25f, -1).setRotationAngle(0, 0, 0).setName("Headlight_top")
		);
		group0.add(new ModelRendererTurbo(group0, 478, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(68.1f, -16.9f, 0.8f).setRotationAngle(0, -17, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 211, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73.25f, -10, -2.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 192, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73.25f, -10, 3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 90, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73.25f, -10, -4.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 428, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(73.25f, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 359, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73.25f, -10, 4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 463, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73.25f, -9, 5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 117, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(71.75f, 1, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 56, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, 1, 0.5f, -5.5f, -1.5f, 0.5f, -5.5f, -1.5f, 0.5f, 5, 1, 0.5f, 5)
				.setRotationPoint(73.25f, -8, 5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 506, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(71.75f, -0.5f, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 205, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73.25f, -10, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 458, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(73.25f, -9, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 493, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(71.75f, 1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 46, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 1, 0.5f, 5, -1.5f, 0.5f, 5, -1.5f, 0.5f, -5.5f, 1, 0.5f, -5.5f)
				.setRotationPoint(73.25f, -8, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 262, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(71.75f, -0.5f, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 41, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(66.75f, -1.5f, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 36, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.5f, 0, 3.5f, -1, 0, 3.5f, -1, 0, -4, 0.5f, 0, -4, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0.25f, 0, 0)
				.setRotationPoint(67.5f, -5.5f, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(66.5f, -9.5f, 6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 322, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(66.75f, -1.5f, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 250, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0.5f, 0, -4, -1, 0, -4, -1, 0, 3.5f, 0.5f, 0, 3.5f, 0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0.25f, 0, -0.5f)
				.setRotationPoint(67.5f, -5.5f, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 221, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(66.5f, -9.5f, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 184, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(67.5f, -15.5f, -3.5f).setRotationAngle(0, 17, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 397, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(67.5f, -12, -3.5f).setRotationAngle(0, 17, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 281, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(67.5f, -8.5f, -3.5f).setRotationAngle(0, 17, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 61, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(67.5f, -5, -3.5f).setRotationAngle(0, 17, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 192, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f)
				.setRotationPoint(-69.7f, -20.5f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 464, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
				.setRotationPoint(-69.85f, -20.75f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 457, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
				.setRotationPoint(-69.85f, -19.25f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 450, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
				.setRotationPoint(-69.95f, -19.25f, -1).setRotationAngle(0, 0, 0).setName("Rearlight_bottom")
		);
		group0.add(new ModelRendererTurbo(group0, 443, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
				.setRotationPoint(-69.95f, -20.75f, -1).setRotationAngle(0, 0, 0).setName("Rearlight_top")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(68.1f, -15.4f, 0.8f).setRotationAngle(0, -17, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 318, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
				.setRotationPoint(65.5f, -13, -10.25f).setRotationAngle(0, 17, 0).setName("nose_numberboard_right")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(58.75f, -22.9f, 1.5f).setRotationAngle(0, -17, 0).setName("top_numberboard_left")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(57.25f, -22.9f, -6.25f).setRotationAngle(0, 17, 0).setName("top_numberboard_right")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 83, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(64, -16.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 198, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-68, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 463, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-70.5f, -4, 9.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 67, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-70.5f, -9.5f, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 391, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1, -0.5f, 0, 1)
				.setRotationPoint(-70.5f, -8.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 417, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-69.5f, -17, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 507, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-69.25f, -21.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 387, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 1, 4, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -18.5f, 4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 458, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-60, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 453, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-52, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 448, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-44, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 443, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-36, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 409, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-28, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 404, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-20, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 399, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-12, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 344, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-4, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 339, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(4, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 334, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(12, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 193, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(19, -21, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 454, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(17, -21.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 113, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 1, 1, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(19.5f, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 218, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(19, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 368, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(26, -21, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 40, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(26, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 155, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(33, -21, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 13, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(33, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(40, -21, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 368, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(40, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 197, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(19, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 304, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(26, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 507, 68, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(33, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 506, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(40, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 423, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.4f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(16, -21.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 21, 97, textureX, textureY).addBox(0, 0, 0, 10, 3, 4)
				.setRotationPoint(6, -5, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 8, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(4, -11, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 318, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5f, -0.5f, -1, -0.5f, -0.5f, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(4.5f, -12, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(9, -11, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 245, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, 6, 0, -0.5f, -6.5f, 0, -0.5f, -6.5f, 0, 0, 6, 0, 0)
				.setRotationPoint(15.5f, -20.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 391, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f)
				.setRotationPoint(-55, -11, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 240, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-68, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 235, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-70.5f, -4, -10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 60, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-70.5f, -9.5f, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 205, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 1, 0, 0, 1, 0, 0, -1.5f, -0.5f, 0, -1.5f)
				.setRotationPoint(-70.5f, -8.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 230, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-60, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 329, 133, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-52, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 394, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-44, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 389, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-36, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 384, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-28, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 379, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-20, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 276, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-12, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 271, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-4, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 266, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(4, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 261, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(12, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 297, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 84, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-70.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 256, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-69.5f, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 497, 4, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.5f, 0, 0, 4.5f, 0, 0, 4.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, -5, 0, 0, -5, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(13.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 267, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(19.5f, -14.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 130, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(20, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 72, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(25, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 374, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(33, -13.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 186, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 1, 4, 0, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -18.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 263, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -22, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 206, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -10, -2.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 471, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -10, 3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 415, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -10, -4.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-74.25f, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 309, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -10, 4).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 122, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -9, 5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 436, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.75f, 1, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 476, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0.5f, 0.5f, -5.5f, -1, 0.5f, -5.5f, -1, 0.5f, 5, 0.5f, 0.5f, 5)
				.setRotationPoint(-74.25f, -8, 5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 507, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.75f, -0.5f, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 355, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -10, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 491, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-74.25f, -9, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 118, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.75f, 1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 402, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, 5, -1, 0.5f, 5, -1, 0.5f, -5.5f, 0.5f, 0.5f, -5.5f)
				.setRotationPoint(-74.25f, -8, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 478, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-74.75f, -0.5f, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 90, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -10, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 507, 20, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f)
				.setRotationPoint(-74.25f, -10, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 499, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0)
				.setRotationPoint(-74.25f, -10, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 400, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-74.25f, -10, 2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 254, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-69.65f, -16.5f, 1.5f).setRotationAngle(0, 27, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 214, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-69.65f, -13, 1.5f).setRotationAngle(0, 27, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 205, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-69.65f, -9.5f, 1.5f).setRotationAngle(0, 27, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 410, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-69.65f, -6, 1.5f).setRotationAngle(0, 27, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 344, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-67.75f, -22.65f, 1.5f).setRotationAngle(-10, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 193, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(15.5f, -12, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 184, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(5.5f, -4, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 484, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(16.5f, -5, -10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 408, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-17, -22.75f, 0).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-15, -22.75f, -2).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 18, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-15, -22.25f, 0).setRotationAngle(0, 0, 0).setName("Box 89cp")
		);
		group0.add(new ModelRendererTurbo(group0, 381, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
				.setRotationPoint(-14, -22.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 90cp")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, 0, 0, -1, 0, 0, -0.25f, 0)
				.setRotationPoint(72.25f, 0, -5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 374, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(72.15f, 0.45f, -5.25f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 173, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(72.25f, 0.45f, -5.25f).setRotationAngle(0, 0, 0).setName("Ditchlight_right_bottom")
		);
		group0.add(new ModelRendererTurbo(group0, 85, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(72.15f, 0.45f, 3.25f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 70, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(72.25f, 0.45f, 3.25f).setRotationAngle(0, 0, 0).setName("Ditchlight_left_bottom")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 14)
				.setRotationPoint(67, -2, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 61, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, -0.25f, 0, 0, 0, 0, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f)
				.setRotationPoint(67, -2, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 122, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(67, -0.5f, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 497, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(67, 1.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 122, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(67, 3.5f, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(67, 5.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 497, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0)
				.setRotationPoint(67, 7.5f, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f)
				.setRotationPoint(67, 7, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 27, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f)
				.setRotationPoint(67, 5, -8.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 499, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f)
				.setRotationPoint(67, 3, -8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f)
				.setRotationPoint(67, 1, -7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 497, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f)
				.setRotationPoint(67, -1, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 211, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(67, -2, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 429, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, 0, -0.25f, -0.25f, 0)
				.setRotationPoint(67, -2, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 505, 55, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(48, -1, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 491, 55, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(48, -1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 310, 33, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-50, -1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 291, 33, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-50, -1, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 291, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(50, -1, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 186, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0)
				.setRotationPoint(62, -1, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 196, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(16, -1, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 297, 6, textureX, textureY).addBox(0, 0, 0, 2, 2, 3)
				.setRotationPoint(26, -1, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 12, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(15.5f, -4, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 35, 243, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.75f, -0.5f, -0.25f, -0.75f)
				.setRotationPoint(-70, -2, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 403, 226, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, -0.5f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, -0.5f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-70, -2, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 96, 162, textureX, textureY).addBox(0, 0, 0, 1, 1, 14)
				.setRotationPoint(-70, -2, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 179, 244, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 9, 0, 1.23f, 0, 0, -1.98f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0.8f, 0, 0, -1.55f, 0, 0, -0.35f, 0, 0, -0.4f, 0, 0)
				.setRotationPoint(75, 8, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 179, 244, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 1.23f, 0, 0, -1.98f, 0, 0, -1.71f, 0, 0, 0.96f, 0, 0, 1.23f, -1, 0, -1.98f, -1, 0, -1.28f, 0, 0, 0.53f, 0, 0)
				.setRotationPoint(74.73f, 8, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 209, 236, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, -0.75f, 0, 0, -1.98f, 0, 0, 1.23f, 0, 0, -0.4f, 0, 0, -0.35f, 0, 0, -1.55f, 0, 0, 0.8f, 0, 0)
				.setRotationPoint(75, 8, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 163, 245, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.96f, 0, 0, -1.71f, 0, 0, -1.98f, 0, 0, 1.23f, 0, 0, 0.53f, 0, 0, -1.28f, 0, 0, -1.98f, -1, 0, 1.23f, -1, 0)
				.setRotationPoint(74.73f, 8, 9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 344, 229, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.08f, 0, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.08f, -0.5f, 0)
				.setRotationPoint(73.5f, -2, 5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 327, 228, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.08f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.08f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0)
				.setRotationPoint(73.5f, -2, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 205, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-68.5f, -9.5f, -4).setRotationAngle(0, -27, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 410, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f)
				.setRotationPoint(73.15f, -4.25f, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 312, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(73.55f, -4.55f, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 298, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(73.65f, -4.55f, -7).setRotationAngle(0, 0, 0).setName("Ditchlight_right")
		);
		group0.add(new ModelRendererTurbo(group0, 85, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f)
				.setRotationPoint(73.15f, -4.25f, 5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 476, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(73.55f, -4.55f, 5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 21, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(73.65f, -4.55f, 5).setRotationAngle(0, 0, 0).setName("Ditchlight_left")
		);
		group0.add(new ModelRendererTurbo(group0, 440, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73.25f, -10, 1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 327, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f)
				.setRotationPoint(73.25f, -10, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 318, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0)
				.setRotationPoint(73.25f, -10, 0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 9, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26.25f, 1.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Bell")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(26.5f, 0.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 394, 68, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(73.25f, -10, 2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 297, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 87, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-70.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 507, 10, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-69.5f, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, 0, -1, 0.5f)
				.setRotationPoint(46, -21, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 197, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, -2, -1, -1.25f, -2, -1, 0.5f, 0, -1, 0.5f)
				.setRotationPoint(53, -21, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 53, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(2, 2, 1)
				.setCorners(0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, -2, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, -2, -1, 0.5f)
				.setPolygonUV(0, new float[]{ 4.0f, 1.0f, 3.0f, 1.0f, 3.0f, 3.0f, 4.0f, 3.0f })
				.setPolygonUV(5, new float[]{ 6.0f, 1.0f, 4.0f, 1.0f, 4.0f, 3.0f, 4.0f, 3.0f })
				.setPolygonUV(2, new float[]{ 3.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 3.0f, 1.0f }).build()
				.setRotationPoint(44, -21, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, 0, -1, -1.25f)
				.setRotationPoint(46, -21, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 51, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(2, 2, 1)
				.setCorners(0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, -2, -1, 0.5f, -2, -1, -1.25f, 0, -1, -1.25f)
				.setPolygonUV(4, new float[]{ 3.0f, 1.0f, 1.0f, 1.0f, 1.0f, 3.0f, 1.0f, 3.0f }).build()
				.setRotationPoint(53, -21, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, -2, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, -2, -1, -1.25f)
				.setRotationPoint(44, -21, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 376, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(71.5f, 1, -8).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 127, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 11, 0, 1, 0, 0, -1.75f, 0, 0, -3.25f, 0, 0, 2.5f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -2.25f, 0, 0, 1.5f, 0, 0)
				.setRotationPoint(75, 5, 0).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 254, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.1f, 0, 0, -0.67f, 0, 0, -1.05f, 0, 0, 0.2f, 0, 0, -0.41f, 0, 0, -0.34f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(72.5f, 3, 8).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 394, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.02f, 0, 0, -0.73f, 0, 0, -1.11f, 0, 0, 0.23f, 0, 0, -0.28f, 0, 0, -0.48f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(73.32f, 3, 3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 440, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, -1.25f, -0.25f, 0, 0.5f, -0.25f, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -1.89f, 0, 0, 1.04f, 0, 0)
				.setRotationPoint(73.34f, 2, 3).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 322, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1.75f, 0, 0, 1, 0, 0, 1, 0, -0.25f, -1.75f, 0, -0.25f)
				.setRotationPoint(71.75f, 3.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 151, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -1, 0, 0, -1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(72.75f, 5.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 8, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -1.25f, 0, 0, 0.5f, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(72.75f, 5.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 11, 0, 2.5f, 0, 0, -3.25f, 0, 0, -1.75f, 0, 0, 1, 0, 0, 1.5f, 0, 0, -2.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(75, 5, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 377, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.2f, 0, 0, -1.05f, 0, 0, -0.67f, 0, 0, -0.1f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.34f, 0, 0, -0.41f, 0, 0)
				.setRotationPoint(72.5f, 3, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 376, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0.23f, 0, 0, -1.01f, 0, 0, -0.73f, 0, 0, -0.02f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.48f, 0, 0, -0.27f, 0, 0)
				.setRotationPoint(73.32f, 3, -5).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 440, 154, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0, 0.5f, -0.25f, 0, -1.25f, -0.25f, 0, 1.04f, 0, 0, -1.89f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(73.34f, 2, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 322, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -1.75f, 0, -0.25f, 1, 0, -0.25f, 1, 0, 0, -1.75f, 0, 0)
				.setRotationPoint(71.75f, 3.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 151, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -1, 0, -0.75f, -1, 0)
				.setRotationPoint(72.75f, 5.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, -1.25f, 0, 0)
				.setRotationPoint(72.75f, 5.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 118, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(71.75f, 1.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(71.5f, 1, 5).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 340, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(71.75f, 1.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 310, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.5f, 1, -8).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-74.75f, 1.2f, -7.88f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.5f, 1, 5).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-74.75f, 1.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-69.65f, -20, 1.5f).setRotationAngle(0, 27, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 12, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(15.5f, -8, 7.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 10, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-15, -22.25f, 1.6f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-15, -22.25f, -3.6f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		group0.add(new ModelRendererTurbo(group0, 420, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-15, -22.75f, -2.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-16, -21.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-16, -22.25f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		group0.add(new ModelRendererTurbo(group0, 318, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-15, -22.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		group0.add(new ModelRendererTurbo(group0, 410, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
				.setRotationPoint(-14, -22.75f, -1).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		group0.add(new ModelRendererTurbo(group0, 499, 18, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
				.setRotationPoint(-16, -22.25f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-15, -22.75f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		this.groups.add(group0);
	}

}
