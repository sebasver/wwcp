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
public class BL2 extends RollingStockModel {

	public BL2(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		initGroup_group00();
		initGroup_clipboard();
		initGroup_CFA164cb();
		initGroup_CPA164cb();
	}

	private final void initGroup_group00(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 79, 2, 22, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(-56.5f, -0.5f, -11).setRotationAngle(0, 0, 0).setName("base")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 64, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(-51, -11, 8).setRotationAngle(0, 0, 0).setName("left wall 1")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 63, 8, 1, 0, 0, 0, 1.75f, -0.5f, 0, 1.75f, -0.5f, 0, -1.75f, 0, 0, -1.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-49.5f, -18.25f, 8).setRotationAngle(0, 0, 0).setName("left wall 2")
		);
		group0.add(new ModelRendererTurbo(group0, 490, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.75f, 0, 1.75f, 0, 0, 1.75f, 0, 0, -1.75f, -0.75f, 0, -1.75f, 0.5f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0)
				.setRotationPoint(-50.5f, -18.25f, 8).setRotationAngle(0, 0, 0).setName("left wall 3")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0.5f, 0)
				.setRotationPoint(-52, -11, 8).setRotationAngle(0, 0, 0).setName("left wall 4")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 64, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(-51, -11, -9).setRotationAngle(0, 0, 0).setName("right wall 1")
		);
		group0.add(new ModelRendererTurbo(group0, 203, 19, textureX, textureY)
				.addShapeBox(0, 0, 0, 63, 8, 1, 0, 0, 0, -1.75f, -0.5f, 0, -1.75f, -0.5f, 0, 1.75f, 0, 0, 1.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-49.5f, -18.25f, -9).setRotationAngle(0, 0, 0).setName("right wall 2")
		);
		group0.add(new ModelRendererTurbo(group0, 451, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.75f, 0, -1.75f, 0, 0, -1.75f, 0, 0, 1.75f, -0.75f, 0, 1.75f, 0.5f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0)
				.setRotationPoint(-50.5f, -18.25f, -9).setRotationAngle(0, 0, 0).setName("right wall 3")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0.5f, 0)
				.setRotationPoint(-52, -11, -9).setRotationAngle(0, 0, 0).setName("right wall 4")
		);
		group0.add(new ModelRendererTurbo(group0, 338, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 15, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0.5f, 0.5f, 0)
				.setRotationPoint(-53.5f, -11, -7.5f).setRotationAngle(0, 0, 0).setName("back wall 2")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 68, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 12, 0, -0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0.5f, -0.75f, -0.5f)
				.setRotationPoint(-52, -18.25f, -5.75f).setRotationAngle(0, 0, 0).setName("back wall 1")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, -3, 0, 0, 2, 0, -1, 1.5f, 0, 0.5f, -1.5f, 0, 0.5f, -1.5f, 0.5f, 0, 0.5f, 0.5f, -1, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
				.setRotationPoint(-54, -11, -9).setRotationAngle(0, 0, 0).setName("back right corner 1")
		);
		group0.add(new ModelRendererTurbo(group0, 436, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -2.75f, 0, -1.75f, 1.75f, 0, -2.75f, 1.25f, 0, 2.25f, -1.25f, 0, 2.25f, -1.5f, -0.75f, 0, 0.5f, -0.75f, -1, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f)
				.setRotationPoint(-52.5f, -18.25f, -9).setRotationAngle(0, 0, 0).setName("back right corner 2")
		);
		group0.add(new ModelRendererTurbo(group0, 416, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, -1.5f, 0, 0.5f, 1.5f, 0, 0.5f, 2, 0, -1, -3, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0.5f, 0.5f, -1, -1.5f, 0.5f, 0)
				.setRotationPoint(-54, -11, 8).setRotationAngle(0, 0, 0).setName("back left corner 1")
		);
		group0.add(new ModelRendererTurbo(group0, 370, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -1.25f, 0, 2.25f, 1.25f, 0, 2.25f, 1.75f, 0, -2.75f, -2.75f, 0, -1.75f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0.5f, -0.75f, -1, -1.5f, -0.75f, 0)
				.setRotationPoint(-52.5f, -18.25f, 8).setRotationAngle(0, 0, 0).setName("back left corner 2")
		);
		group0.add(new ModelRendererTurbo(group0, 444, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(26.25f, -11, 10).setRotationAngle(0, 0, 0).setName("left cab wall 1")
		);
		group0.add(new ModelRendererTurbo(group0, 36, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(13, -11, 10).setRotationAngle(0, 0, 0).setName("left cab wall 2")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 10, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(35.25f, -10, 9).setRotationAngle(0, 0, 0).setName("front left curve 1")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 9, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0)
				.setRotationPoint(40.25f, -9.0625f, 9).setRotationAngle(0, 0, 0).setName("front left curve 2")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0)
				.setRotationPoint(44.25f, -7.1875f, 9).setRotationAngle(0, 0, 0).setName("front left curve 3")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0)
				.setRotationPoint(48.25f, -5.1875f, 9).setRotationAngle(0, 0, 0).setName("front left curve 4")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(50.25f, -3.5f, 9).setRotationAngle(0, 0, 0).setName("front left curve 5")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 35, textureX, textureY)
				.addShapeBox(0, 0, 0, 54, 6, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-40.75f, -6.25f, 9).setRotationAngle(0, 0, 0).setName("back left curve 1")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
				.setRotationPoint(-44.75f, -5.3125f, 9).setRotationAngle(0, 0, 0).setName("back left curve 2")
		);
		group0.add(new ModelRendererTurbo(group0, 318, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-48.75f, -4.25f, 9).setRotationAngle(0, 0, 0).setName("back left curve 3")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
				.setRotationPoint(-51.75f, -1.75f, 9).setRotationAngle(0, 0, 0).setName("back left curve 4")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(26.25f, -11, -11).setRotationAngle(0, 0, 0).setName("right cab wall 1")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 11, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(13, -11, -11).setRotationAngle(0, 0, 0).setName("right cab wall 2")
		);
		group0.add(new ModelRendererTurbo(group0, 59, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 10, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(35.25f, -10, -11).setRotationAngle(0, 0, 0).setName("front right curve 1")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 9, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0)
				.setRotationPoint(40.25f, -9.0625f, -11).setRotationAngle(0, 0, 0).setName("front right curve 2")
		);
		group0.add(new ModelRendererTurbo(group0, 292, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0)
				.setRotationPoint(44.25f, -7.1875f, -11).setRotationAngle(0, 0, 0).setName("front right curve 3")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0)
				.setRotationPoint(48.25f, -5.1875f, -11).setRotationAngle(0, 0, 0).setName("front right curve 4")
		);
		group0.add(new ModelRendererTurbo(group0, 75, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(50.25f, -3.5f, -11).setRotationAngle(0, 0, 0).setName("front right curve 5")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 54, 6, 2, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-40.75f, -6.25f, -11).setRotationAngle(0, 0, 0).setName("back right curve 1")
		);
		group0.add(new ModelRendererTurbo(group0, 279, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0)
				.setRotationPoint(-44.75f, -5.3125f, -11).setRotationAngle(0, 0, 0).setName("back right curve 2")
		);
		group0.add(new ModelRendererTurbo(group0, 266, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-48.75f, -4.25f, -11).setRotationAngle(0, 0, 0).setName("back right curve 3")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0)
				.setRotationPoint(-51.75f, -1.75f, -11).setRotationAngle(0, 0, 0).setName("back right curve 4")
		);
		group0.add(new ModelRendererTurbo(group0, 13, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-57.5f, -0.5f, -5).setRotationAngle(0, 0, 0).setName("base rear 0")
		);
		group0.add(new ModelRendererTurbo(group0, 166, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-57.5f, -0.5f, -11).setRotationAngle(0, 0, 0).setName("base rear 1")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57.5f, -0.5f, 5).setRotationAngle(0, 0, 0).setName("base rear 2")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56.5f, -0.5f, -5).setRotationAngle(0, 0, 0).setName("base front 0")
		);
		group0.add(new ModelRendererTurbo(group0, 80, 59, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56.5f, -0.5f, -11).setRotationAngle(0, 0, 0).setName("base front 1")
		);
		group0.add(new ModelRendererTurbo(group0, 373, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(56.5f, -0.5f, 5).setRotationAngle(0, 0, 0).setName("base front 2")
		);
		group0.add(new ModelRendererTurbo(group0, 463, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 6, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, -2, -1, 0, -2, -1, 0, 0, -1, 0)
				.setRotationPoint(13, -16, -10).setRotationAngle(0, 0, 0).setName("right cab window 3")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 30, 2, 22, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(26.25f, -0.5f, -11).setRotationAngle(0, 0, 0).setName("base 2")
		);
		group0.add(new ModelRendererTurbo(group0, 429, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0.5f, 0.5f, -0.25f, 0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(22.75f, -6, -11).setRotationAngle(0, 0, 0).setName("right cab wall 3")
		);
		group0.add(new ModelRendererTurbo(group0, 18, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22.75f, -6, -11.75f).setRotationAngle(0, 0, 0).setName("right cab ladder 1")
		);
		group0.add(new ModelRendererTurbo(group0, 248, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22.75f, -3, -11.75f).setRotationAngle(0, 0, 0).setName("right cab ladder 2")
		);
		group0.add(new ModelRendererTurbo(group0, 235, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22.75f, 0.5f, -11.75f).setRotationAngle(0, 0, 0).setName("right cab ladder 3")
		);
		group0.add(new ModelRendererTurbo(group0, 370, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 22, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(22.75f, -0.5f, -10.75f).setRotationAngle(0, 0, 0).setName("base 3")
		);
		group0.add(new ModelRendererTurbo(group0, 420, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0.5f, 0.5f, -0.25f, 0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(22.75f, -6, 9.75f).setRotationAngle(0, 0, 0).setName("left cab wall 3")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22.75f, -6, 10.25f).setRotationAngle(0, 0, 0).setName("left cab ladder  1")
		);
		group0.add(new ModelRendererTurbo(group0, 124, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22.75f, -3, 10.25f).setRotationAngle(0, 0, 0).setName("left cab ladder  2")
		);
		group0.add(new ModelRendererTurbo(group0, 194, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22.75f, 0.5f, 10.25f).setRotationAngle(0, 0, 0).setName("left cab ladder  3")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 10, 1, 0, 0, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(35.25f, -11.25f, 8).setRotationAngle(0, 0, 0).setName("left hood wall 1")
		);
		group0.add(new ModelRendererTurbo(group0, 236, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 10, 1, 0, 0, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(35.25f, -11.25f, -9).setRotationAngle(0, 0, 0).setName("right hood wall 1")
		);
		group0.add(new ModelRendererTurbo(group0, 253, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 5, 0, 1.5f, 0, 0, -1.4f, 0, 0, -1.4f, 0, 0, 1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53.5f, -11.25f, -2.5f).setRotationAngle(0, 0, 0).setName("nose 1")
		);
		group0.add(new ModelRendererTurbo(group0, 240, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 5, 0, 1.5f, 0, 0, -1.4f, 0, 0, -2.65f, 0, 0.25f, 2.75f, 0, 0.25f, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0.25f, 1.25f, 0, 0.25f)
				.setRotationPoint(53.5f, -11.25f, 2.5f).setRotationAngle(0, 0, 0).setName("nose left 1")
		);
		group0.add(new ModelRendererTurbo(group0, 228, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 1.5f, 0, 0.25f, -1.4f, 0, 0.25f, -2.75f, 0, 0, 1.75f, 0, -1, 0, 0, 0.25f, 0, 0, 0.25f, -1.25f, 0, 0, 0.25f, 0, -1)
				.setRotationPoint(52.25f, -11.25f, 8).setRotationAngle(0, 0, 0).setName("nose left 2")
		);
		group0.add(new ModelRendererTurbo(group0, 227, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 5, 0, 2.75f, 0, 0.25f, -2.65f, 0, 0.25f, -1.4f, 0, 0, 1.5f, 0, 0, 1.25f, 0, 0.25f, -1.25f, 0, 0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53.5f, -11.25f, -7.5f).setRotationAngle(0, 0, 0).setName("nose right 1")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 1.75f, 0, -1, -2.75f, 0, 0, -1.4f, 0, 0.25f, 1.5f, 0, 0.25f, 0.25f, 0, -1, -1.25f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f)
				.setRotationPoint(52.25f, -11.25f, -9).setRotationAngle(0, 0, 0).setName("nose right 2")
		);
		group0.add(new ModelRendererTurbo(group0, 194, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(37.5f, -14.5f, -2.5f).setRotationAngle(0, 0, 0).setName("nose roof 0")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1.75f, 0.25f, 0, -1.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 1.75f, 0.25f, 0, 1.75f, 0.25f)
				.setRotationPoint(37.5f, -14.5f, 2.5f).setRotationAngle(0, 0, 0).setName("nose roof 1")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 1, 5, 0, 0, -1.75f, 0.25f, 0, -1.75f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 1.75f, 0.25f, 0, 1.75f, 0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(37.5f, -14.5f, -7.5f).setRotationAngle(0, 0, 0).setName("nose roof 2")
		);
		group0.add(new ModelRendererTurbo(group0, 80, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0.75f, -1, 0, 0.75f, -1, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f)
				.setRotationPoint(37.5f, -13.25f, -9).setRotationAngle(0, 0, 0).setName("nose roof 3")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0.75f, -1, 0, 0.75f, -1)
				.setRotationPoint(37.5f, -13.25f, 8).setRotationAngle(0, 0, 0).setName("nose roof 4")
		);
		group0.add(new ModelRendererTurbo(group0, 183, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -0.5f, -0.25f, 0, -1.25f, -1, 0.25f, 0.25f, -0.75f, -1, 0, 0, 0, 0, 0, 0, -1.25f, 0, 0.25f, 0.25f, 0, -0.75f)
				.setRotationPoint(50.75f, -12.5f, 7.75f).setRotationAngle(0, 0, 0).setName("nose curve of pain 0")
		);
		group0.add(new ModelRendererTurbo(group0, 214, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(52, -13, -2.5f).setRotationAngle(0, 0, 0).setName("nose curve of pain 1")
		);
		group0.add(new ModelRendererTurbo(group0, 384, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.25f, -1.25f, 0, -2.25f, -0.25f, 0, -2.25f, -0.25f, 0, 1.25f, -1.25f, 0, 0.25f, 0.75f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, 0.25f, 0.75f, 0)
				.setRotationPoint(51.75f, -14.75f, -2.5f).setRotationAngle(0, 0, 0).setName("nose curve of pain 2")
		);
		group0.add(new ModelRendererTurbo(group0, 28, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.5f, 0, 0, -0.5f, 0.5f, 0, -1.75f, -0.75f, 0.25f, 1.25f, -1.25f, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0, -1.25f, 0.5f, 0.25f, 1.25f, 0.5f, 0.25f)
				.setRotationPoint(52, -13, 2.5f).setRotationAngle(0, 0, 0).setName("nose curve of pain 3")
		);
		group0.add(new ModelRendererTurbo(group0, 397, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.25f, -1.25f, 0, -2.25f, -0.25f, 0, -2.25f, -2, 0.25f, 1.25f, -3, 0.25f, 0.25f, 0.75f, 0, -0.25f, 0.25f, 0, -1.5f, 1.5f, 0.25f, 1, 2, 0.25f)
				.setRotationPoint(51.75f, -14.75f, 2.5f).setRotationAngle(0, 0, 0).setName("nose curve of pain 4")
		);
		group0.add(new ModelRendererTurbo(group0, 157, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.25f, -1.25f, 0.25f, -1.75f, -0.75f, 0.25f, -0.5f, 0.5f, 0, 0.5f, 0, 0, 1.25f, 0.5f, 0.25f, -1.25f, 0.5f, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(52, -13, -7.5f).setRotationAngle(0, 0, 0).setName("nose curve of pain 5")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.25f, -3, 0.25f, -2.25f, -2, 0.25f, -2.25f, -0.25f, 0, 1.25f, -1.25f, 0, 1, 2, 0.25f, -1.5f, 1.5f, 0.25f, -0.25f, 0.25f, 0, 0.25f, 0.75f, 0)
				.setRotationPoint(51.75f, -14.75f, -7.5f).setRotationAngle(0, 0, 0).setName("nose curve of pain 6")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, -1.25f, 0.25f, 0, -1.25f, -1, 0.25f, 0, -0.75f, -1, 0, -0.25f, 0, -0.5f, -0.75f, 0, -1.25f, 0, 0.25f, 0, -0.25f, -1)
				.setRotationPoint(50.75f, -12.5f, 7.75f).setRotationAngle(0, 0, 0).setName("nose curve of pain 7")
		);
		group0.add(new ModelRendererTurbo(group0, 118, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.75f, -1, -1.25f, -1, 0.25f, -0.5f, -0.25f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, -1.25f, 0, 0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(50.75f, -12.5f, -8.75f).setRotationAngle(0, 0, 0).setName("nose curve of pain 8")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -1, -1.25f, -1, 0.25f, -1.25f, 0.25f, 0, 0, -0.75f, 0, 0, -0.25f, -1, -1.25f, 0, 0.25f, -0.5f, -0.75f, 0, 0, -0.25f, 0)
				.setRotationPoint(50.75f, -12.5f, -8.75f).setRotationAngle(0, 0, 0).setName("nose curve of pain 9")
		);
		group0.add(new ModelRendererTurbo(group0, 49, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, 2.0626f, 0, 0, -2.0625f, 0, 0, -1.5625f, 0, 0.5f, 1.5625f, 0, 0.5f, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(36, -18.75f, -2.5f).setRotationAngle(0, 0, 0).setName("mid window right")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, 1.5625999f, 0, 0, -1.5625f, 0, 0, -2.0625f, 0, 0.5f, 2.0625f, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, 0.5f, 0, 0.5f)
				.setRotationPoint(36, -18.75f, 0).setRotationAngle(0, 0, 0).setName("mid window left")
		);
		group0.add(new ModelRendererTurbo(group0, 181, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 25, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-49.75f, -20.5f, -2.5f).setRotationAngle(0, 0, 0).setName("roof  0")
		);
		group0.add(new ModelRendererTurbo(group0, 181, 13, textureX, textureY)
				.addShapeBox(0, 0, 0, 25, 1, 4, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.75f, 0, 0.75f, -0.75f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-49.75f, -20.5f, -6.5f).setRotationAngle(0, 0, 0).setName("roof  1")
		);
		group0.add(new ModelRendererTurbo(group0, 222, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.75f, 0, 0.5f, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, -0.75f, 0, 0.5f)
				.setRotationPoint(35.25f, -14.5f, -2.5f).setRotationAngle(0, 0, 0).setName("nose roof 0cp")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.75f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(35.25f, -14.5f, 0.5f).setRotationAngle(0, 0, 0).setName("nose roof 0cp")
		);
		group0.add(new ModelRendererTurbo(group0, 333, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 5, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -1.75f, 0.25f, 1, -1.75f, 0.25f, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 1.75f, 0.25f, 1, 1.75f, 0.25f)
				.setRotationPoint(35.25f, -14.5f, 2.5f).setRotationAngle(0, 0, 0).setName("nose roof 1cp")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -1.75f, 0, 0, -1.75f, 0, 0, 0.75f, 0.25f, 0.25f, 0.5f, 0.25f, 0.25f, 0.75f, -1, 0, 0.75f, -1)
				.setRotationPoint(34.25f, -13.25f, 8).setRotationAngle(0, 0, 0).setName("nose roof 4cp")
		);
		group0.add(new ModelRendererTurbo(group0, 283, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 5, 0, 1, -1.75f, 0.25f, 0.25f, -1.75f, 0.25f, 0.25f, 0, 0, -0.25f, 0, 0, 1, 1.75f, 0.25f, 0.25f, 1.75f, 0.25f, 0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(35.25f, -14.5f, -7.5f).setRotationAngle(0, 0, 0).setName("nose roof 1cp")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1.75f, 0, 0.25f, -1.75f, 0, 0.25f, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0.75f, -1, 0.25f, 0.75f, -1, 0.25f, 0.5f, 0.25f, 0, 0.75f, 0.25f)
				.setRotationPoint(34.25f, -13.25f, -9).setRotationAngle(0, 0, 0).setName("nose roof 4cp")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 2, 0, 0, -0.9375f, -0.25f, 0, -0.9375f, -0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.9375f, -0.25f, 0, 0.9375f, -0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f)
				.setRotationPoint(15, -19.5f, -8).setRotationAngle(0, 0, 0).setName("cab roof right 0")
		);
		group0.add(new ModelRendererTurbo(group0, 75, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 2, 0, 0, -1.5f, 0, 0.4375f, -1.5f, 0, 0.4375f, 0.0625f, 0.25f, 0, 0.0625f, 0.25f, 0, 1.5f, 0, 0.4375f, 1.5f, 0, 0.4375f, -0.0625f, 0.25f, 0, -0.0625f, 0.25f)
				.setRotationPoint(15, -18.5f, -10).setRotationAngle(0, 0, 0).setName("cab roof right 1")
		);
		group0.add(new ModelRendererTurbo(group0, 174, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -1, 0, 0.9725f, -1, 0, 0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.9725f, 0, 0, 0.9725f, 0, 0, 0, 0, 0)
				.setRotationPoint(15, -17, -11).setRotationAngle(0, 0, 0).setName("cab roof right 3")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 64, 1, 1, 0, 0, -1.25f, 0, 0.75f, -1.25f, 0, 0.75f, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, -1, 0.75f, 0.25f, -1, 0.75f, -0.25f, 0.5f, 0, -0.25f, 0.5f)
				.setRotationPoint(-49.75f, -19.5f, -7.25f).setRotationAngle(0, 0, 0).setName("roof  2")
		);
		group0.add(new ModelRendererTurbo(group0, 108, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 1.8125f, 0, 0, -2.125f, 0, 0, -1.8125f, 0, 0, 1.8125f, 0, 0, 0.0625f, -0.25f, 0, -0.375f, -0.25f, 0, -0.0625f, -0.25f, 0, 0.0625f, -0.25f, 0)
				.setRotationPoint(33.875f, -15.75f, -11).setRotationAngle(0, 0, 0).setName("right cab corner")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.6875f, 0, 0.5f, 0.4375f, 0, 0.5f, -0.0625f, 0, 0, 0.6875f, 0, 0, 0.6875f, 0, 0.5f, 0.4375f, 0, 0.5f, -0.0625f, 0, 0, 0.6875f, 0, 0)
				.setRotationPoint(32.6875f, -20.5f, 0.5f).setRotationAngle(0, 0, 0).setName("roof  front  0")
		);
		group0.add(new ModelRendererTurbo(group0, 18, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.6875f, 0, 0, -0.0625f, 0, 0, 0.4375f, 0, 0.5f, 0.6875f, 0, 0.5f, 0.6875f, 0, 0, -0.0625f, 0, 0, 0.4375f, 0, 0.5f, 0.6875f, 0, 0.5f)
				.setRotationPoint(32.6875f, -20.5f, -2.5f).setRotationAngle(0, 0, 0).setName("roof  front  1")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.25f, -0.75f, -0.75f, -0.5f, -0.75f, -0.75f, 0.375f, 0, 0, 0.25f, 0, 0, 0.25f, 0.75f, -0.75f, -0.5f, 0.75f, -0.75f, 0.375f, 0, 0, 0.25f, 0, 0)
				.setRotationPoint(32.25f, -20.5f, -6.5f).setRotationAngle(0, 0, 0).setName("roof  front  2")
		);
		group0.add(new ModelRendererTurbo(group0, 490, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.0625f, 0, 0, -0.2625f, 0, 0, -0.5625f, 0, 0.5f, 0.5625f, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f)
				.setRotationPoint(34.4375f, -19.25f, 0).setRotationAngle(0, 0, 0).setName("roof  front  3")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.25f, -0.75f, 0, -1.25f, 0.25f, 0, -1.75f, 0.25f, 0.5f, 0.75f, -0.75f, 0.5f, 0, 0, 0, -0.2f, 0, 0, -0.5f, 0, 0.5f, 0.5f, 0, 0.5f)
				.setRotationPoint(34.375f, -20.25f, 0).setRotationAngle(0, 0, 0).setName("roof  front  4")
		);
		group0.add(new ModelRendererTurbo(group0, 450, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.5625f, 0, 0.5f, -0.5625f, 0, 0.5f, -0.2625f, 0, 0, 0.0625f, 0, 0, 0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(34.4375f, -19.25f, -2).setRotationAngle(0, 0, 0).setName("roof  front  5")
		);
		group0.add(new ModelRendererTurbo(group0, 443, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.75f, -0.75f, 0.5f, -1.75f, 0.25f, 0.5f, -1.25f, 0.25f, 0, 0.25f, -0.75f, 0, 0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.2f, 0, 0, 0, 0, 0)
				.setRotationPoint(34.375f, -20.25f, -2).setRotationAngle(0, 0, 0).setName("roof  front  6")
		);
		group0.add(new ModelRendererTurbo(group0, 284, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.9f, -0.75f, -0.75f, -0.9f, -0.75f, -0.75f, -0.0625f, 0, 0, 0.0625f, 0, 0, 0.775f, 0.3325f, -0.75f, -0.775f, 0.3325f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(33.9375f, -19.25f, -6.5f).setRotationAngle(0, 0, 0).setName("roof  front  7")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 1.125f, -1.5f, -0.75f, -2.125f, -0.5f, -0.75f, -1.25f, 0.25f, 0, 0.25f, -0.75f, 0, 0.8375f, 0.75f, -0.75f, -0.8375f, 0.75f, -0.75f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(33.875f, -20.25f, -6.5f).setRotationAngle(0, 0, 0).setName("roof  front  8")
		);
		group0.add(new ModelRendererTurbo(group0, 436, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.4975f, -0.9375f, -0.25f, -0.4975f, -0.9375f, -0.25f, -0.125f, 0.25f, 0.25f, 0.125f, 0.25f, 0.25f, 0.4765f, 0, -0.25f, -0.4765f, 0, -0.25f, 0, -0.6675f, 0.25f, 0, -0.6675f, 0.25f)
				.setRotationPoint(33.162f, -18.25f, -8).setRotationAngle(0, 0, 0).setName("roof  front  9")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.9375f, -0.25f, -0.585f, -0.9375f, -0.25f, -0.25f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.9375f, -0.25f, -0.585f, 0.9375f, -0.25f, -0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
				.setRotationPoint(32, -19.5f, -8).setRotationAngle(0, 0, 0).setName("roof  front  10")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.6225f, -1.27f, -0.25f, -1.6225f, -0.2725f, -0.25f, -1.2875f, 0.9175f, 0.25f, 0.2825f, -0.0775f, 0.25f, 0.373f, 0.52f, -0.25f, -0.373f, 0.52f, -0.25f, 0, -0.6675f, 0.25f, 0, -0.6675f, 0.25f)
				.setRotationPoint(33.037f, -18.8325f, -8).setRotationAngle(0, 0, 0).setName("roof  front  11")
		);
		group0.add(new ModelRendererTurbo(group0, 318, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.375f, -1.5f, 0, -0.25f, -1.5f, 0, 0.3525f, 0.0625f, 0.25f, -0.375f, 0.0625f, 0.25f, -0.375f, 1.5f, 0, -0.25f, 1.5f, 0, 0.3525f, -0.0625f, 0.25f, -0.375f, -0.0625f, 0.25f)
				.setRotationPoint(31.0625f, -18.5f, -10).setRotationAngle(0, 0, 0).setName("roof  front  12")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.8525f, -2.5625f, 0, -1.8525f, -1.5625f, 0, -1.25f, 0, 0.25f, 0.2475f, -1, 0.25f, 0.6025f, 1.8125f, 0, -0.6025f, 1.8125f, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
				.setRotationPoint(32.665f, -18.5625f, -10).setRotationAngle(0, 0, 0).setName("roof  front  14")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.155f, 0, 0, -0.5025f, 0, 0, -0.3125f, 0, 0, 0.155f, 0, 0, 0.0625f, -0.75f, 0, -0.375f, -0.75f, 0, -0.0625f, -0.75f, 0, 0.0625f, -0.75f, 0)
				.setRotationPoint(32.125f, -16, -11).setRotationAngle(0, 0, 0).setName("roof  front  17")
		);
		group0.add(new ModelRendererTurbo(group0, 86, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0325f, -1, 0, -0.3125f, -1, 0, -1.125f, 0, 0, 0.125f, 0, 0, -0.0325f, 0, 0, -0.3125f, 0, 0, -0.125f, 0, 0, -0.0325f, 0, 0)
				.setRotationPoint(31.9375f, -17, -11).setRotationAngle(0, 0, 0).setName("roof  front  18")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.25f, 0, 0, 0.375f, 0, 0, -0.5f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, 0, 0, 0.375f, 0, 0, -0.5f, 0.75f, -0.75f, 0.25f, 0.75f, -0.75f)
				.setRotationPoint(32.25f, -20.5f, 2.5f).setRotationAngle(0, 0, 0).setName("roof  front  19")
		);
		group0.add(new ModelRendererTurbo(group0, 194, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.0625f, 0, 0, -0.0625f, 0, 0, -0.9f, -0.75f, -0.75f, 0.9f, -0.75f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.775f, 0.3325f, -0.75f, 0.775f, 0.3325f, -0.75f)
				.setRotationPoint(33.9375f, -19.25f, 2.5f).setRotationAngle(0, 0, 0).setName("roof  front  20")
		);
		group0.add(new ModelRendererTurbo(group0, 183, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.25f, -0.75f, 0, -1.25f, 0.25f, 0, -2.125f, -0.5f, -0.75f, 1.125f, -1.5f, -0.75f, 0, 0, 0, 0, 0, 0, -0.8375f, 0.75f, -0.75f, 0.8375f, 0.75f, -0.75f)
				.setRotationPoint(33.875f, -20.25f, 2.5f).setRotationAngle(0, 0, 0).setName("roof  front  21")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.125f, 0.25f, 0.25f, -0.125f, 0.25f, 0.25f, -0.4975f, -0.9375f, -0.25f, 0.4975f, -0.9375f, -0.25f, 0, -0.6675f, 0.25f, 0, -0.6675f, 0.25f, -0.4765f, 0, -0.25f, 0.4765f, 0, -0.25f)
				.setRotationPoint(33.162f, -18.25f, 6).setRotationAngle(0, 0, 0).setName("roof  front  22")
		);
		group0.add(new ModelRendererTurbo(group0, 252, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.25f, 0.25f, -0.25f, 0.25f, 0.25f, -0.585f, -0.9375f, -0.25f, 0, -0.9375f, -0.25f, 0, -0.25f, 0.25f, -0.25f, -0.25f, 0.25f, -0.585f, 0.9375f, -0.25f, 0, 0.9375f, -0.25f)
				.setRotationPoint(32, -19.5f, 6).setRotationAngle(0, 0, 0).setName("roof  front  23")
		);
		group0.add(new ModelRendererTurbo(group0, 245, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.2825f, -0.0775f, 0.25f, -1.2875f, 0.9175f, 0.25f, -1.6225f, -0.2725f, -0.25f, 0.6225f, -1.27f, -0.25f, 0, -0.6675f, 0.25f, 0, -0.6675f, 0.25f, -0.373f, 0.52f, -0.25f, 0.373f, 0.52f, -0.25f)
				.setRotationPoint(33.037f, -18.8325f, 6).setRotationAngle(0, 0, 0).setName("roof  front  24")
		);
		group0.add(new ModelRendererTurbo(group0, 75, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.155f, 0, 0, -0.3125f, 0, 0, -0.5025f, 0, 0, 0.155f, 0, 0, 0.0625f, -0.75f, 0, -0.0625f, -0.75f, 0, -0.375f, -0.75f, 0, 0.0625f, -0.75f, 0)
				.setRotationPoint(32.125f, -16, 10).setRotationAngle(0, 0, 0).setName("roof  front  30")
		);
		group0.add(new ModelRendererTurbo(group0, 55, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, -1.125f, 0, 0, -0.3125f, -1, 0, -0.0325f, -1, 0, -0.0325f, 0, 0, -0.125f, 0, 0, -0.3125f, 0, 0, -0.0325f, 0, 0)
				.setRotationPoint(31.9375f, -17, 10).setRotationAngle(0, 0, 0).setName("roof  front  31")
		);
		group0.add(new ModelRendererTurbo(group0, 181, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 25, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.75f, 0, 0.75f, -0.75f)
				.setRotationPoint(-49.75f, -20.5f, 2.5f).setRotationAngle(0, 0, 0).setName("left roof  1")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 64, 1, 1, 0, 0, 0.25f, 0.5f, 0.75f, 0.25f, 0.5f, 0.75f, -1.25f, 0, 0, -1.25f, 0, 0, -0.25f, 0.5f, 0.75f, -0.25f, 0.5f, 0.75f, 0.25f, -1, 0, 0.25f, -1)
				.setRotationPoint(-49.75f, -19.5f, 6.25f).setRotationAngle(0, 0, 0).setName("left roof  2")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 1.8125f, 0, 0, -1.8125f, 0, 0, -2.125f, 0, 0, 1.8125f, 0, 0, 0.0625f, -0.25f, 0, -0.0625f, -0.25f, 0, -0.375f, -0.25f, 0, 0.0625f, -0.25f, 0)
				.setRotationPoint(33.875f, -15.75f, 10).setRotationAngle(0, 0, 0).setName("left cab corner")
		);
		group0.add(new ModelRendererTurbo(group0, 172, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 6, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, -2, -1, 0, -2, -1, 0, 0, -1, 0)
				.setRotationPoint(13, -16, 8).setRotationAngle(0, 0, 0).setName("left cab window 3")
		);
		group0.add(new ModelRendererTurbo(group0, 162, 132, textureX, textureY)
				.addShapeBox(-3.5f, 0, 0, 4, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(26.25f, -15.5f, 10).setRotationAngle(0, 0, 0).setName("left cab door")
		);
		group0.add(new ModelRendererTurbo(group0, 451, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22.75f, -16, 10).setRotationAngle(0, 0, 0).setName("left cab wall top")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 130, textureX, textureY)
				.addShapeBox(-3.5f, 0, 0, 4, 9, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(26.25f, -15.5f, -11).setRotationAngle(0, 0, 0).setName("right cab door ")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22.75f, -16, -11).setRotationAngle(0, 0, 0).setName("right cab wall top")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51.25f, -19.25f, -2.5f).setRotationAngle(0, 0, 0).setName("back wall joint 0")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, -0.75f, -0.75f, 0.25f, -0.75f, -0.75f, 0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51.25f, -19.25f, -6.5f).setRotationAngle(0, 0, 0).setName("back wall joint 1")
		);
		group0.add(new ModelRendererTurbo(group0, 176, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -1.25f, 0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -1.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -20.25f, -2.5f).setRotationAngle(0, 0, 0).setName("back wall joint 2")
		);
		group0.add(new ModelRendererTurbo(group0, 452, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -1.25f, -0.5f, -0.75f, 0.25f, -1.5f, -0.75f, 0.25f, -0.75f, 0, -1.25f, 0.25f, 0, 0, 0.75f, -0.75f, 0, 0.75f, -0.75f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-51, -20.25f, -6.5f).setRotationAngle(0, 0, 0).setName("back wall joint 3")
		);
		group0.add(new ModelRendererTurbo(group0, 502, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0.5f, -1.5f, 0.5f, -0.5f, -1.5f, 0.5f, -0.5f, 0.5f, -1.5f, 0.5f, 0.5f, -1.5f, 0, 0, 0.5f, 0, -1, 0, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(-51.25f, -19.25f, -7.25f).setRotationAngle(0, 0, 0).setName("back wall joint 4")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
				.setRotationPoint(-51.25f, -19.25f, 2.5f).setRotationAngle(0, 0, 0).setName("back wall joint 5")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -1.25f, 0.25f, 0, 0.25f, -0.75f, 0, 0.25f, -1.5f, -0.75f, -1.25f, -0.5f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.75f, 0, 0.75f, -0.75f)
				.setRotationPoint(-51, -20.25f, 2.5f).setRotationAngle(0, 0, 0).setName("back wall joint 6")
		);
		group0.add(new ModelRendererTurbo(group0, 479, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, -1.5f, -1.5f, 0.5f, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, -1, -1.5f, 0, 0)
				.setRotationPoint(-51.25f, -19.25f, 6.25f).setRotationAngle(0, 0, 0).setName("back wall joint 7")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 6, 16, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, -2, -1, 0, -2, -1, 0, 0, -1, 0)
				.setRotationPoint(13, -16, -8).setRotationAngle(0, 0, 0).setName("back cab wall 0")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(13, -11, -10).setRotationAngle(0, 0, 0).setName("back cab wall 1")
		);
		group0.add(new ModelRendererTurbo(group0, 238, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, -0.9375f, -0.25f, 0, -0.9375f, -0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f)
				.setRotationPoint(15, -18.5f, 6).setRotationAngle(0, 0, 0).setName("back cab wall 2")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f)
				.setRotationPoint(15, -19.5f, 2.5f).setRotationAngle(0, 0, 0).setName("back cab wall 3")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(15, -19.5f, -2.5f).setRotationAngle(0, 0, 0).setName("back cab wall 4")
		);
		group0.add(new ModelRendererTurbo(group0, 231, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1.5f, 0.25f, 0, -1.5f, 0.25f, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(15, -17.5f, -9.75f).setRotationAngle(0, 0, 0).setName("back cab wall 5")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.9375f, -0.25f, 0, -0.9375f, -0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f)
				.setRotationPoint(15, -18.5f, -8).setRotationAngle(0, 0, 0).setName("back cab wall 6")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(15, -19.5f, -6.5f).setRotationAngle(0, 0, 0).setName("back cab wall 7")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, -1.5f, 0.25f, 0, -1.5f, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f)
				.setRotationPoint(15, -17.5f, 7.75f).setRotationAngle(0, 0, 0).setName("back cab wall 8")
		);
		group0.add(new ModelRendererTurbo(group0, 63, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.6f, -1.5625f, 0, -0.6f, -1.5625f, 0, 0.0025f, 0, 0.25f, 5.0E-4f, 0, 0.25f, 0.6f, 0.5625f, 0, -0.6f, 0.5625f, 0, 0.025f, -0.9375f, 0.25f, -0.025f, -0.9375f, 0.25f)
				.setRotationPoint(32.6625f, -17.3125f, -10).setRotationAngle(0, 0, 0).setName("roof front 32")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.75f, -0.75f, 0.5f, -0.75f, -0.75f, 0.5f)
				.setRotationPoint(35.25f, -14.75f, -2.5f).setRotationAngle(0, 0, 0).setName("windshield base  0")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, 0.25f, 0, 0, -1, -1.75f, 0.25f, 1, -1.75f, 0.25f, -0.25f, -0.75f, 0, 0.25f, -0.75f, 0, -1, 1, 0.25f, 1, 1, 0.25f)
				.setRotationPoint(35.25f, -14.75f, 2.5f).setRotationAngle(0, 0, 0).setName("windshield base  1")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1, -1.75f, 0.25f, -1, -1.75f, 0.25f, 0.25f, 0, 0, -0.25f, 0, 0, 1, 1, 0.25f, -1, 1, 0.25f, 0.25f, -0.75f, 0, -0.25f, -0.75f, 0)
				.setRotationPoint(35.25f, -14.75f, -7.5f).setRotationAngle(0, 0, 0).setName("windshield base  2")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.3975f, -1.1975f, 0, -0.3975f, -1.1975f, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 1, 0, -0.375f, 1, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f)
				.setRotationPoint(34.25f, -13.5f, -9).setRotationAngle(0, 0, 0).setName("windshield base  3")
		);
		group0.add(new ModelRendererTurbo(group0, 479, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0.5f, 0.75f, 0, 0.5f, 0.25f, 0, 0, -0.25f, 0, 0, -0.75f, -0.75f, 0.5f, 0.75f, -0.75f, 0.5f, 0.25f, -0.75f, 0, -0.25f, -0.75f, 0)
				.setRotationPoint(35.25f, -14.75f, 0.5f).setRotationAngle(0, 0, 0).setName("windshield base  4")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.715f, -0.25f, 0, -0.715f, -0.25f, 0, -0.4f, 0.3125f, 0, 0.4f, 0.3125f, 0, 0.625f, -0.5f, 0, -0.625f, -0.5f, 0, -0.375f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(34.25f, -12, -10).setRotationAngle(0, 0, 0).setName("windshield base  5")
		);
		group0.add(new ModelRendererTurbo(group0, 396, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.3975f, -1.1975f, 0, 0.3975f, -1.1975f, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.375f, 1, 0, 0, 1, 0)
				.setRotationPoint(34.25f, -13.5f, 8).setRotationAngle(0, 0, 0).setName("windshield base  6")
		);
		group0.add(new ModelRendererTurbo(group0, 365, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.4f, 0.3125f, 0, -0.4f, 0.3125f, 0, -0.715f, -0.25f, 0, 0.715f, -0.25f, 0, 0, -0.5f, 0, -0.375f, -0.5f, 0, -0.625f, -0.5f, 0, 0.625f, -0.5f, 0)
				.setRotationPoint(34.25f, -12, 9).setRotationAngle(0, 0, 0).setName("windshield base  7")
		);
		group0.add(new ModelRendererTurbo(group0, 371, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 5, 0, -0.25f, 0, 0, 0.25f, 0, 0, -1, -1.75f, 0.25f, 1, -1.75f, 0.25f, -0.25f, 1, 0, 0.25f, 1, 0, -1, 1, 0.25f, 1, 1, 0.25f)
				.setRotationPoint(35.25f, -13.5f, 2.5f).setRotationAngle(0, 0, 0).setName("cab front wall 0")
		);
		group0.add(new ModelRendererTurbo(group0, 384, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 13, 2, 0, -0.75f, 0, 0.5f, 0.75f, 0, 0.5f, 0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0.5f, 0.75f, 0, 0.5f, 0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(35.25f, -13.5f, 0.5f).setRotationAngle(0, 0, 0).setName("cab front wall 1")
		);
		group0.add(new ModelRendererTurbo(group0, 498, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 5, 0, 1, -1.75f, 0.25f, -1, -1.75f, 0.25f, 0.25f, 0, 0, -0.25f, 0, 0, 1, 1, 0.25f, -1, 1, 0.25f, 0.25f, 1, 0, -0.25f, 1, 0)
				.setRotationPoint(35.25f, -13.5f, -7.5f).setRotationAngle(0, 0, 0).setName("cab front wall 2")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 13, 2, 0, -0.25f, 0, 0, 0.25f, 0, 0, 0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.25f, 0, 0, 0.25f, 0, 0, 0.75f, 0, 0.5f, -0.75f, 0, 0.5f)
				.setRotationPoint(35.25f, -13.5f, -2.5f).setRotationAngle(0, 0, 0).setName("cab front wall 3")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f)
				.setRotationPoint(34.25f, -11, -9).setRotationAngle(0, 0, 0).setName("cab front wall 4")
		);
		group0.add(new ModelRendererTurbo(group0, 299, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f)
				.setRotationPoint(34.25f, -11.5f, 7.75f).setRotationAngle(0, 0, 0).setName("cab front wall 5")
		);
		group0.add(new ModelRendererTurbo(group0, 276, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f)
				.setRotationPoint(34.25f, -11.5f, -9).setRotationAngle(0, 0, 0).setName("cab front wall 6")
		);
		group0.add(new ModelRendererTurbo(group0, 240, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, 0, -0.625f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0.4375f, -0.5f, 0, -0.4375f, -0.5f, 0, -0.1875f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(34.25f, -11.5f, -10).setRotationAngle(0, 0, 0).setName("cab front wall 7")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0.4375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(34.25f, -11, -10).setRotationAngle(0, 0, 0).setName("cab front wall 8")
		);
		group0.add(new ModelRendererTurbo(group0, 141, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.625f, 0, 0, 0.625f, 0, 0, 0, -0.5f, 0, -0.1875f, -0.5f, 0, -0.4375f, -0.5f, 0, 0.4375f, -0.5f, 0)
				.setRotationPoint(34.25f, -11.5f, 9).setRotationAngle(0, 0, 0).setName("cab front wall 9")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.4375f, 0.5f, 0)
				.setRotationPoint(34.25f, -11, 9).setRotationAngle(0, 0, 0).setName("cab front wall 10")
		);
		group0.add(new ModelRendererTurbo(group0, 128, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f)
				.setRotationPoint(34.25f, -11, 7.75f).setRotationAngle(0, 0, 0).setName("cab front wall 11")
		);
		group0.add(new ModelRendererTurbo(group0, 348, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 5.0E-4f, 0, 0.25f, 0.0025f, 0, 0.25f, -0.6f, -1.5625f, 0, 0.6f, -1.5625f, 0, -0.025f, -0.9375f, 0.25f, 0.025f, -0.9375f, 0.25f, -0.6f, 0.5625f, 0, 0.6f, 0.5625f, 0)
				.setRotationPoint(32.6625f, -17.3125f, 8).setRotationAngle(0, 0, 0).setName("roof front 33")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 2, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, -0.9375f, -0.25f, 0, -0.9375f, -0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, 0.9375f, -0.25f, 0, 0.9375f, -0.25f)
				.setRotationPoint(15, -19.5f, 6).setRotationAngle(0, 0, 0).setName("cab roof left 0")
		);
		group0.add(new ModelRendererTurbo(group0, 168, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, 0, 0.8125f, 0, 0, 0.9725f, -1, 0, 0, -1, 0, 0, 0, 0, 0.9725f, 0, 0, 0.9725f, 0, 0, 0, 0, 0)
				.setRotationPoint(15, -17, 10).setRotationAngle(0, 0, 0).setName("cab roof left 1")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 2, 0, 0, 0.0625f, 0.25f, 0.4375f, 0.0625f, 0.25f, 0.4375f, -1.5f, 0, 0, -1.5f, 0, 0, -0.0625f, 0.25f, 0.4375f, -0.0625f, 0.25f, 0.4375f, 1.5f, 0, 0, 1.5f, 0)
				.setRotationPoint(15, -18.5f, 8).setRotationAngle(0, 0, 0).setName("cab roof left 2")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.375f, 0.0625f, 0.25f, 0.3525f, 0.0625f, 0.25f, -0.25f, -1.5f, 0, -0.375f, -1.5f, 0, -0.375f, -0.0625f, 0.25f, 0.3525f, -0.0625f, 0.25f, -0.25f, 1.5f, 0, -0.375f, 1.5f, 0)
				.setRotationPoint(31.0625f, -18.5f, 8).setRotationAngle(0, 0, 0).setName("roof  front  34")
		);
		group0.add(new ModelRendererTurbo(group0, 334, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.2475f, -1, 0.25f, -1.25f, 0, 0.25f, -1.8525f, -1.5625f, 0, 0.8525f, -2.5625f, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, -0.6025f, 1.8125f, 0, 0.6025f, 1.8125f, 0)
				.setRotationPoint(32.665f, -18.5625f, 8).setRotationAngle(0, 0, 0).setName("roof  front  35")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f)
				.setRotationPoint(22.5f, 1.5f, -10.75f).setRotationAngle(0, 0, 0).setName("right front ladder 0")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
				.setRotationPoint(25.75f, 1.5f, -10.75f).setRotationAngle(0, 0, 0).setName("right front ladder 1")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
				.setRotationPoint(23.5f, 3.25f, -10.75f).setRotationAngle(0, 0, 0).setName("right front ladder 2")
		);
		group0.add(new ModelRendererTurbo(group0, 299, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
				.setRotationPoint(23.5f, 6, -10.75f).setRotationAngle(0, 0, 0).setName("right front ladder 3")
		);
		group0.add(new ModelRendererTurbo(group0, 70, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, -0.5f, 0.25f, -0.5f)
				.setRotationPoint(22.5f, 1.5f, 10.25f).setRotationAngle(0, 0, 0).setName("left front ladder 0")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
				.setRotationPoint(25.75f, 1.5f, 10.25f).setRotationAngle(0, 0, 0).setName("left front ladder 1")
		);
		group0.add(new ModelRendererTurbo(group0, 292, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
				.setRotationPoint(23.5f, 3.25f, 10.25f).setRotationAngle(0, 0, 0).setName("left front ladder 2")
		);
		group0.add(new ModelRendererTurbo(group0, 285, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, -0.5f, 0, -0.25f, -0.5f)
				.setRotationPoint(23.5f, 6, 10.25f).setRotationAngle(0, 0, 0).setName("left front ladder 3")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, -0.25f, 0.5f, 0.5f)
				.setRotationPoint(50.25f, -14.5f, -1.5f).setRotationAngle(0, 0, 0).setName("front L A M P 0")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0, -0.25f, 0.5f, 0)
				.setRotationPoint(50.25f, -14.5f, 0.5f).setRotationAngle(0, 0, 0).setName("front L A M P 1")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(52.25f, -12.5f, -1.5f).setRotationAngle(0, 0, 0).setName("front L A M P 2")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(52.25f, -12.5f, 0.5f).setRotationAngle(0, 0, 0).setName("front L A M P 3")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.4375f, -0.5625f, 0, -0.4375f, -0.5625f, 0, -0.75f, 0.5f, -0.875f, -0.75f, 0.5f)
				.setRotationPoint(52.375f, -14.5f, -1.5f).setRotationAngle(0, 0, 0).setName("front L A M P 4")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5625f, -0.4375f, -0.875f, -0.5625f, -0.4375f, -0.875f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f)
				.setRotationPoint(52.375f, -14.5f, -1.5f).setRotationAngle(0, 0, 0).setName("front L A M P 5")
		);
		group0.add(new ModelRendererTurbo(group0, 324, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, -0.4375f, -0.5625f, -0.875f, -0.4375f, -0.5625f)
				.setRotationPoint(52.375f, -14.5f, 0.5f).setRotationAngle(0, 0, 0).setName("front L A M P 6")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.875f, 0.5f, 0)
				.setRotationPoint(52.375f, -14.5f, 0.5f).setRotationAngle(0, 0, 0).setName("front L A M P 7")
		);
		group0.add(new ModelRendererTurbo(group0, 235, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.4375f, -0.5625f, 0, -0.4375f, -0.5625f, 0, -0.75f, 0.5f, -0.875f, -0.75f, 0.5f, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, -0.875f, 0, 0.5f)
				.setRotationPoint(52.375f, -12.5f, -1.5f).setRotationAngle(0, 0, 0).setName("front L A M P 8")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5625f, -0.4375f, -0.875f, -0.5625f, -0.4375f)
				.setRotationPoint(52.375f, -12.5f, -1.5f).setRotationAngle(0, 0, 0).setName("front L A M P 9")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, -0.4375f, -0.5625f, -0.875f, -0.4375f, -0.5625f, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f)
				.setRotationPoint(52.375f, -12.5f, 0.5f).setRotationAngle(0, 0, 0).setName("front L A M P 10")
		);
		group0.add(new ModelRendererTurbo(group0, 179, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.875f, 0.5f, 0, -0.875f, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f)
				.setRotationPoint(52.375f, -12.5f, 0.5f).setRotationAngle(0, 0, 0).setName("front L A M P 11")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, -0.25f, 0.5f, 0.5f)
				.setRotationPoint(-52.25f, -20.25f, -1.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 0")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, -0.375f, -0.25f, -0.375f, -0.375f, -0.25f, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0, -0.25f, 0.5f, 0)
				.setRotationPoint(-52.25f, -20.25f, 0.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 1")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(-52, -18.25f, -1.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 2")
		);
		group0.add(new ModelRendererTurbo(group0, 25, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(-52, -18.25f, 0.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 3")
		);
		group0.add(new ModelRendererTurbo(group0, 20, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, -0.875f, 0, 0.5f, -0.875f, -0.4375f, -0.5625f, 0, -0.4375f, -0.5625f, 0, -0.75f, 0.5f, -0.875f, -0.75f, 0.5f)
				.setRotationPoint(-53, -20.25f, -1.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 4")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5625f, -0.4375f, -0.875f, -0.5625f, -0.4375f, -0.875f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f)
				.setRotationPoint(-53, -20.25f, -1.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 5")
		);
		group0.add(new ModelRendererTurbo(group0, 490, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, -0.4375f, -0.5625f, -0.875f, -0.4375f, -0.5625f)
				.setRotationPoint(-53, -20.25f, 0.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 6")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.875f, 0.5f, 0)
				.setRotationPoint(-53, -20.25f, 0.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 7")
		);
		group0.add(new ModelRendererTurbo(group0, 451, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.4375f, -0.5625f, 0, -0.4375f, -0.5625f, 0, -0.75f, 0.5f, -0.875f, -0.75f, 0.5f, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, -0.875f, 0, 0.5f)
				.setRotationPoint(-53, -18.25f, -1.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 8")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.5625f, -0.4375f, -0.875f, -0.5625f, -0.4375f)
				.setRotationPoint(-53, -18.25f, -1.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 9")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, -0.4375f, -0.5625f, -0.875f, -0.4375f, -0.5625f, -0.875f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f)
				.setRotationPoint(-53, -18.25f, 0.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 10")
		);
		group0.add(new ModelRendererTurbo(group0, 436, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.875f, 0.5f, 0, -0.875f, -0.5625f, -0.4375f, 0, -0.5625f, -0.4375f, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f)
				.setRotationPoint(-53, -18.25f, 0.5f).setRotationAngle(0, 0, 0).setName("rear L A M P 11")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0.25f, 0.25f, -0.75f, 0.25f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(35.875f, 1.5f, -1.625f).setRotationAngle(0, 0, 0).setName("front bogie rotation")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0.25f, 0.25f, -0.75f, 0.25f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-38.625f, 1.5f, -1.625f).setRotationAngle(0, 0, 0).setName("rear bogie rotation")
		);
		group0.add(new ModelRendererTurbo(group0, 360, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(22, -13.75f, -12).setRotationAngle(0, 0, 0).setName("right cab ladder 0")
		);
		group0.add(new ModelRendererTurbo(group0, 355, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(26.5f, -13.75f, -12).setRotationAngle(0, 0, 0).setName("right cab ladder 1")
		);
		group0.add(new ModelRendererTurbo(group0, 319, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(22, -13.75f, 10.5f).setRotationAngle(0, 0, 0).setName("left cab ladder 0")
		);
		group0.add(new ModelRendererTurbo(group0, 314, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(26.5f, -13.75f, 10.5f).setRotationAngle(0, 0, 0).setName("left cab ladder 1")
		);
		group0.add(new ModelRendererTurbo(group0, 309, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(56.5f, -7, -10.25f).setRotationAngle(0, 0, 0).setName("front railing base 0")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(56.5f, -7, 8.625f).setRotationAngle(0, 0, 0).setName("front railing base 1")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(56.875f, -7, -3.125f).setRotationAngle(0, 0, 0).setName("front railing base 2")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(56.875f, -7, 1.5f).setRotationAngle(0, 0, 0).setName("front railing base 3")
		);
		group0.add(new ModelRendererTurbo(group0, 373, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.25f, 0, 0.375f, -0.375f, 0, 0.375f, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.25f, -0.625f, 0.375f, -0.375f, -0.625f, 0.375f)
				.setRotationPoint(56.5f, -7, -9.875f).setRotationAngle(0, 0, 0).setName("front railing cross low 0")
		);
		group0.add(new ModelRendererTurbo(group0, 333, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.375f, 0, 0.375f, -0.25f, 0, 0.375f, -0.625f, 0, -0.625f, 0, 0, -0.625f, -0.375f, -0.625f, 0.375f, -0.25f, -0.625f, 0.375f, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
				.setRotationPoint(56.5f, -7, 2.875f).setRotationAngle(0, 0, 0).setName("front railing cross low 1")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.5625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.5625f, -0.625f, 0.125f, -0.0625f, -0.625f, 0.125f)
				.setRotationPoint(56.5f, -7, -9.25f).setRotationAngle(0, 0, 0).setName("front railing cross high 0")
		);
		group0.add(new ModelRendererTurbo(group0, 230, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.5625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.5625f, -0.625f, 0.125f, -0.0625f, -0.625f, 0.125f)
				.setRotationPoint(56.8125f, -9, -3.625f).setRotationAngle(0, 0, 0).setName("front railing cross high 1")
		);
		group0.add(new ModelRendererTurbo(group0, 318, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.375f, 2, 0.5f, -0.25f, 2, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.375f, -2.625f, 0.5f, -0.25f, -2.625f, 0.5f)
				.setRotationPoint(56.5625f, -7, -8.125f).setRotationAngle(0, 0, 0).setName("front railing cross high 2")
		);
		group0.add(new ModelRendererTurbo(group0, 195, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.625f, 0, 0, 0, 0, 0, -0.0625f, -0.625f, 0.125f, -0.5625f, -0.625f, 0.125f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(56.5f, -7, 8.25f).setRotationAngle(0, 0, 0).setName("front railing cross high 3")
		);
		group0.add(new ModelRendererTurbo(group0, 184, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.625f, 0, 0, 0, 0, 0, -0.0625f, -0.625f, 0.125f, -0.5625f, -0.625f, 0.125f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(56.8125f, -9, 2.625f).setRotationAngle(0, 0, 0).setName("front railing cross high 4")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, 2, 0.5f, -0.375f, 2, 0.5f, -0.625f, 0, 0, 0, 0, 0, -0.25f, -2.625f, 0.5f, -0.375f, -2.625f, 0.5f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(56.5625f, -7, 4.125f).setRotationAngle(0, 0, 0).setName("front railing cross high 5")
		);
		group0.add(new ModelRendererTurbo(group0, 151, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0)
				.setRotationPoint(56.875f, -9, -3.125f).setRotationAngle(0, 0, 0).setName("front railing base high 0")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
				.setRotationPoint(56.875f, -9, 2.125f).setRotationAngle(0, 0, 0).setName("front railing base high 1")
		);
		group0.add(new ModelRendererTurbo(group0, 278, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.375f, 0.125f, 0, -0.375f, 0.125f)
				.setRotationPoint(56.875f, -8.875f, -2.125f).setRotationAngle(0, 0, 0).setName("front cross chain high 0")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.25f, 0.125f, -0.625f, -0.25f, 0.125f, -0.625f, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(56.875f, -8.875f, 0.125f).setRotationAngle(0, 0, 0).setName("front cross chain high 1")
		);
		group0.add(new ModelRendererTurbo(group0, 114, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.375f, 0.125f, 0, -0.375f, 0.125f)
				.setRotationPoint(56.875f, -6.875f, -2.125f).setRotationAngle(0, 0, 0).setName("front cross chain low 0")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.25f, 0.125f, -0.625f, -0.25f, 0.125f, -0.625f, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(56.875f, -6.875f, 0.125f).setRotationAngle(0, 0, 0).setName("front cross chain low 1")
		);
		group0.add(new ModelRendererTurbo(group0, 70, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(52.4f, -10.4f, -2).setRotationAngle(0, 0, -8).setName("nose numberboard")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0.25f, -0.625f, -0.625f, 0.25f, -0.625f, -0.625f, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(56.5f, -7, -12).setRotationAngle(0, 0, 0).setName("front railing handgrab 0")
		);
		group0.add(new ModelRendererTurbo(group0, 86, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.375f, 0, -0.625f, 0.375f)
				.setRotationPoint(56.5f, -7, -11).setRotationAngle(0, 0, 0).setName("front railing handgrab 1")
		);
		group0.add(new ModelRendererTurbo(group0, 60, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, -0.625f, 0.25f, 0, -0.625f, 0.25f, -0.625f, 0, 0.25f, -0.625f)
				.setRotationPoint(56.5f, -7, 11).setRotationAngle(0, 0, 0).setName("front railing handgrab 3")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0.375f, -0.625f, -0.625f, 0.375f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(56.5f, -7, 10).setRotationAngle(0, 0, 0).setName("front railing handgrab 4")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0.25f, -0.625f, -0.625f, 0.25f, -0.625f, -0.625f, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(53, -7, -12).setRotationAngle(0, 0, 0).setName("front railing handgrab 6")
		);
		group0.add(new ModelRendererTurbo(group0, 37, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.875f, 0, -0.625f, -0.875f)
				.setRotationPoint(53, -7, -11).setRotationAngle(0, 0, 0).setName("front railing handgrab 7")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(52.375f, -7, -10.25f).setRotationAngle(0, 0, 0).setName("front railing handgrab 9")
		);
		group0.add(new ModelRendererTurbo(group0, 502, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, -1, 0, 0.25f, -0.625f, 0, -1.25f, 0.25f, 0, -0.625f, 0.25f, -0.625f, 0, -1, -0.625f, 0.25f, -0.625f, -0.625f, -1.25f, 0.25f, -0.625f, -0.625f)
				.setRotationPoint(53, -7, -9.625f).setRotationAngle(0, 0, 0).setName("front railing handgrab 10")
		);
		group0.add(new ModelRendererTurbo(group0, 499, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
				.setRotationPoint(50.375f, -7, -9.625f).setRotationAngle(0, 0, 0).setName("front railing handgrab 11")
		);
		group0.add(new ModelRendererTurbo(group0, 477, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.375f, 0, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.375f, 0, -0.625f, -0.625f, -0.375f, -0.625f, 0, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, -0.375f)
				.setRotationPoint(49.75f, -7, -9.625f).setRotationAngle(0, 0, 0).setName("front railing handgrab 12")
		);
		group0.add(new ModelRendererTurbo(group0, 469, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, -0.625f, 0.25f, 0, -0.625f, 0.25f, -0.625f, 0, 0.25f, -0.625f)
				.setRotationPoint(53, -7, 11).setRotationAngle(0, 0, 0).setName("front railing handgrab 13")
		);
		group0.add(new ModelRendererTurbo(group0, 58, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(53, -7, 9).setRotationAngle(0, 0, 0).setName("front railing handgrab 14")
		);
		group0.add(new ModelRendererTurbo(group0, 411, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
				.setRotationPoint(52.375f, -7, 9.25f).setRotationAngle(0, 0, 0).setName("front railing handgrab 16")
		);
		group0.add(new ModelRendererTurbo(group0, 406, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, -0.625f, -0.625f, 0, -1.25f, -1, 0, 0.25f, 0.25f, 0, 0, 0.25f, -0.625f, -0.625f, -0.625f, -0.625f, -1.25f, -1, -0.625f, 0.25f, 0.25f, -0.625f, 0)
				.setRotationPoint(53, -7, 8.625f).setRotationAngle(0, 0, 0).setName("front railing handgrab 17")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(50.375f, -7, 8.625f).setRotationAngle(0, 0, 0).setName("front railing handgrab 18")
		);
		group0.add(new ModelRendererTurbo(group0, 395, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.625f, -0.375f, 0, 0, 0, 0, -0.625f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, 0, 0, -0.625f, -0.625f)
				.setRotationPoint(49.75f, -7, 8.625f).setRotationAngle(0, 0, 0).setName("front railing handgrab 19")
		);
		group0.add(new ModelRendererTurbo(group0, 124, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 22, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0)
				.setRotationPoint(56, 1.5f, -11).setRotationAngle(0, 0, 0).setName("front plow 0")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.75f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, 0, -0.5f, 0.75f, 0)
				.setRotationPoint(52.75f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("front plow bits left 0")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.75f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, 0, -0.5f, 0.75f, 0)
				.setRotationPoint(55.5f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("front plow bits left 1")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, 1.25f, -0.5f, 0.25f, 1.25f, -0.5f, 0.25f, 1.25f, 0, 0, 1.25f, 0)
				.setRotationPoint(53.75f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("front plow bits left 2")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(53.75f, 7, 10).setRotationAngle(0, 0, 0).setName("front plow bits left 3")
		);
		group0.add(new ModelRendererTurbo(group0, 190, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 3.75f, -0.5f, 0, 3.75f, 0, 0, 0.5f, 0)
				.setRotationPoint(51.25f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("front plow bits left 4")
		);
		group0.add(new ModelRendererTurbo(group0, 183, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, 0, 0, 0, 0)
				.setRotationPoint(49.25f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("front plow bits left 5")
		);
		group0.add(new ModelRendererTurbo(group0, 461, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(46.25f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("front plow bits left 6")
		);
		group0.add(new ModelRendererTurbo(group0, 340, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.75f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, 0, -0.5f, 0.75f, 0)
				.setRotationPoint(52.75f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("front plow bits right 0")
		);
		group0.add(new ModelRendererTurbo(group0, 335, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.75f, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, 0, -0.5f, 0.75f, 0)
				.setRotationPoint(55.5f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("front plow bits right 1")
		);
		group0.add(new ModelRendererTurbo(group0, 70, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, 1.25f, -0.5f, 0.25f, 1.25f, -0.5f, 0.25f, 1.25f, 0, 0, 1.25f, 0)
				.setRotationPoint(53.75f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("front plow bits right 2")
		);
		group0.add(new ModelRendererTurbo(group0, 51, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(53.75f, 7, -11.5f).setRotationAngle(0, 0, 0).setName("front plow bits right 3")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 3.75f, -0.5f, 0, 3.75f, 0, 0, 0.5f, 0)
				.setRotationPoint(51.25f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("front plow bits right 4")
		);
		group0.add(new ModelRendererTurbo(group0, 452, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, 0, 0, 0, 0)
				.setRotationPoint(49.25f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("front plow bits right 5")
		);
		group0.add(new ModelRendererTurbo(group0, 452, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(46.25f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("front plow bits right 6")
		);
		group0.add(new ModelRendererTurbo(group0, 490, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, 0, 0.75f)
				.setRotationPoint(57, 6.75f, -9.5f).setRotationAngle(0, 0, 0).setName("front plow bits 0")
		);
		group0.add(new ModelRendererTurbo(group0, 340, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.75f, 0, 0, 0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0.75f, 0, -0.75f, 0.75f)
				.setRotationPoint(57, 7.75f, -9.5f).setRotationAngle(0, 0, 0).setName("front plow bits 1")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, 0, 0.75f)
				.setRotationPoint(57, 6.75f, 4.75f).setRotationAngle(0, 0, 0).setName("front plow bits 2")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.75f, 0, 0, 0.75f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0.75f, 0, -0.75f, 0.75f)
				.setRotationPoint(57, 7.75f, 4.75f).setRotationAngle(0, 0, 0).setName("front plow bits 3")
		);
		group0.add(new ModelRendererTurbo(group0, 445, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.625f, 0.375f, 0, -0.625f, 0.375f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0.375f, -0.625f, -0.625f, 0.375f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(53.875f, 2.5f, 10.375f).setRotationAngle(0, 0, 0).setName("front railing handgrab 20")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.625f, 0.375f, 0, -0.625f, 0.375f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0.375f, -0.625f, -0.625f, 0.375f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(53.875f, 2.5f, -12).setRotationAngle(0, 0, 0).setName("front railing handgrab 21")
		);
		group0.add(new ModelRendererTurbo(group0, 276, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0.5f, 0)
				.setRotationPoint(57.5f, 3.25f, -0.5f).setRotationAngle(0, 0, 0).setName("front coupler 0")
		);
		group0.add(new ModelRendererTurbo(group0, 132, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58.5f, 3, -0.5f).setRotationAngle(0, 0, 0).setName("front coupler 1")
		);
		group0.add(new ModelRendererTurbo(group0, 124, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0)
				.setRotationPoint(59.5f, 3, -1.5f).setRotationAngle(0, 0, 0).setName("front coupler 2")
		);
		group0.add(new ModelRendererTurbo(group0, 119, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(60.5f, 3, -0.5f).setRotationAngle(0, 0, 0).setName("front coupler 3")
		);
		group0.add(new ModelRendererTurbo(group0, 114, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
				.setRotationPoint(58.5f, 3, 0.5f).setRotationAngle(0, 0, 0).setName("front coupler 4")
		);
		group0.add(new ModelRendererTurbo(group0, 296, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 19, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f)
				.setRotationPoint(56, 7.25f, -9.75f).setRotationAngle(0, 0, 0).setName("front plow 1")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57.5f, 0.5f, -2.5f).setRotationAngle(0, 0, 0).setName("base front thing 0")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(57, 1.5f, -2.25f).setRotationAngle(0, 0, 0).setName("base front thing 1")
		);
		group0.add(new ModelRendererTurbo(group0, 320, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(57, 1.5f, 1.5f).setRotationAngle(0, 0, 0).setName("base front thing 2")
		);
		group0.add(new ModelRendererTurbo(group0, 255, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0.875f, 0, 0, 0.875f, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.875f, 0, -0.625f, 0.875f)
				.setRotationPoint(57.25f, -1.5f, -10.25f).setRotationAngle(0, 0, 0).setName("front railing cross bottom 0")
		);
		group0.add(new ModelRendererTurbo(group0, 69, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(56.875f, -1.5f, -10.25f).setRotationAngle(0, 0, 0).setName("front railing cross bottom 1")
		);
		group0.add(new ModelRendererTurbo(group0, 44, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(56.875f, -1.5f, 8.625f).setRotationAngle(0, 0, 0).setName("front railing cross bottom 2")
		);
		group0.add(new ModelRendererTurbo(group0, 39, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0)
				.setRotationPoint(-57.5f, -7, -10.25f).setRotationAngle(0, 0, 0).setName("rear railing base 0")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0)
				.setRotationPoint(-57.5f, -7, 8.625f).setRotationAngle(0, 0, 0).setName("rear railing base 1")
		);
		group0.add(new ModelRendererTurbo(group0, 464, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0)
				.setRotationPoint(-57.875f, -7, -3.125f).setRotationAngle(0, 0, 0).setName("rear railing base 2")
		);
		group0.add(new ModelRendererTurbo(group0, 431, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0)
				.setRotationPoint(-57.875f, -7, 1.5f).setRotationAngle(0, 0, 0).setName("rear railing base 3")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, -0.375f, 0, 0.375f, -0.25f, 0, 0.375f, -0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.375f, -0.625f, 0.375f, -0.25f, -0.625f, 0.375f)
				.setRotationPoint(-57.5f, -7, -9.875f).setRotationAngle(0, 0, 0).setName("rear railing cross low 0")
		);
		group0.add(new ModelRendererTurbo(group0, 452, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0.375f, -0.375f, 0, 0.375f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.25f, -0.625f, 0.375f, -0.375f, -0.625f, 0.375f, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f)
				.setRotationPoint(-57.5f, -7, 2.875f).setRotationAngle(0, 0, 0).setName("rear railing cross low 1")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, -0.0625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.625f, -0.625f, 0, 0, -0.625f, 0, -0.0625f, -0.625f, 0.125f, -0.5625f, -0.625f, 0.125f)
				.setRotationPoint(-57.5f, -7, -9.25f).setRotationAngle(0, 0, 0).setName("rear railing cross high 0")
		);
		group0.add(new ModelRendererTurbo(group0, 421, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, -0.0625f, 0, 0.125f, -0.5625f, 0, 0.125f, -0.625f, -0.625f, 0, 0, -0.625f, 0, -0.0625f, -0.625f, 0.125f, -0.5625f, -0.625f, 0.125f)
				.setRotationPoint(-57.8125f, -9, -3.625f).setRotationAngle(0, 0, 0).setName("rear railing cross high 1")
		);
		group0.add(new ModelRendererTurbo(group0, 384, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.625f, 0, 0, 0, 0, 0, -0.25f, 2, 0.5f, -0.375f, 2, 0.5f, -0.625f, -0.625f, 0, 0, -0.625f, 0, -0.25f, -2.625f, 0.5f, -0.375f, -2.625f, 0.5f)
				.setRotationPoint(-57.5625f, -7, -8.125f).setRotationAngle(0, 0, 0).setName("rear railing cross high 2")
		);
		group0.add(new ModelRendererTurbo(group0, 330, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0, -0.625f, 0, 0, -0.5625f, -0.625f, 0.125f, -0.0625f, -0.625f, 0.125f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
				.setRotationPoint(-57.5f, -7, 8.25f).setRotationAngle(0, 0, 0).setName("rear railing cross high 3")
		);
		group0.add(new ModelRendererTurbo(group0, 325, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, 0.125f, -0.0625f, 0, 0.125f, 0, 0, 0, -0.625f, 0, 0, -0.5625f, -0.625f, 0.125f, -0.0625f, -0.625f, 0.125f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
				.setRotationPoint(-57.8125f, -9, 2.625f).setRotationAngle(0, 0, 0).setName("rear railing cross high 4")
		);
		group0.add(new ModelRendererTurbo(group0, 266, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.375f, 2, 0.5f, -0.25f, 2, 0.5f, 0, 0, 0, -0.625f, 0, 0, -0.375f, -2.625f, 0.5f, -0.25f, -2.625f, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
				.setRotationPoint(-57.5625f, -7, 4.125f).setRotationAngle(0, 0, 0).setName("rear railing cross high 5")
		);
		group0.add(new ModelRendererTurbo(group0, 304, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0)
				.setRotationPoint(-57.875f, -9, -3.125f).setRotationAngle(0, 0, 0).setName("rear railing base high 0")
		);
		group0.add(new ModelRendererTurbo(group0, 299, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f)
				.setRotationPoint(-57.875f, -9, 2.125f).setRotationAngle(0, 0, 0).setName("rear railing base high 1")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, 0.125f, -0.625f, -0.25f, 0.125f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f)
				.setRotationPoint(-57.875f, -8.875f, -2.125f).setRotationAngle(0, 0, 0).setName("rear cross chain high 0")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
				.setRotationPoint(-57.875f, -8.875f, 0.125f).setRotationAngle(0, 0, 0).setName("rear cross chain high 1")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, 0.125f, -0.625f, -0.25f, 0.125f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f)
				.setRotationPoint(-57.875f, -6.875f, -2.125f).setRotationAngle(0, 0, 0).setName("rear cross chain low 0")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, -0.25f, 0.125f, 0, -0.25f, 0.125f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
				.setRotationPoint(-57.875f, -6.875f, 0.125f).setRotationAngle(0, 0, 0).setName("rear cross chain low 1")
		);
		group0.add(new ModelRendererTurbo(group0, 294, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.625f, 0, 0.25f, -0.625f, 0, 0.25f, 0, -0.625f, 0.25f, 0)
				.setRotationPoint(-54, -7, -12).setRotationAngle(0, 0, 0).setName("rear railing handgrab 0")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.375f, -0.625f, -0.625f, 0.375f)
				.setRotationPoint(-57.5f, -7, -11).setRotationAngle(0, 0, 0).setName("rear railing handgrab 1")
		);
		group0.add(new ModelRendererTurbo(group0, 284, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.625f, -0.625f, 0.25f, -0.625f)
				.setRotationPoint(-54, -7, 11).setRotationAngle(0, 0, 0).setName("rear railing handgrab 2")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0.375f, 0, -0.625f, 0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
				.setRotationPoint(-57.5f, -7, 10).setRotationAngle(0, 0, 0).setName("rear railing handgrab 3")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.25f, -0.625f, 0, 0.25f, -0.625f, 0, 0.25f, 0, -0.625f, 0.25f, 0)
				.setRotationPoint(-57.5f, -7, -12).setRotationAngle(0, 0, 0).setName("rear railing handgrab 4")
		);
		group0.add(new ModelRendererTurbo(group0, 402, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.625f, 0, -0.875f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.875f, -0.625f, -0.625f, -0.875f)
				.setRotationPoint(-54, -7, -11).setRotationAngle(0, 0, 0).setName("rear railing handgrab 5")
		);
		group0.add(new ModelRendererTurbo(group0, 190, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0)
				.setRotationPoint(-53.375f, -7, -10.25f).setRotationAngle(0, 0, 0).setName("rear railing handgrab 6")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0, -0.625f, -0.625f, 0, -1.25f, -1, -0.625f, 0.25f, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.625f, -0.625f, -0.625f, -1.25f)
				.setRotationPoint(-54, -7, -9.625f).setRotationAngle(0, 0, 0).setName("rear railing handgrab 7")
		);
		group0.add(new ModelRendererTurbo(group0, 386, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
				.setRotationPoint(-52.375f, -7, -9.625f).setRotationAngle(0, 0, 0).setName("rear railing handgrab 8")
		);
		group0.add(new ModelRendererTurbo(group0, 56, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, 0, 0, -0.625f, -0.375f, 0, -0.375f, -0.375f, 0, -0.625f, -0.375f, -0.625f, 0, 0, -0.625f, -0.625f, -0.375f, -0.625f, -0.375f, -0.375f, -0.625f, -0.625f)
				.setRotationPoint(-50.75f, -7, -9.625f).setRotationAngle(0, 0, 0).setName("rear railing handgrab 9")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, -0.625f, -0.625f, 0.25f, -0.625f)
				.setRotationPoint(-57.5f, -7, 11).setRotationAngle(0, 0, 0).setName("rear railing handgrab 10")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.875f, 0, -0.625f, -0.875f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
				.setRotationPoint(-54, -7, 9).setRotationAngle(0, 0, 0).setName("rear railing handgrab 11")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f)
				.setRotationPoint(-53.375f, -7, 9.25f).setRotationAngle(0, 0, 0).setName("rear railing handgrab 12")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -1.25f, 0.25f, 0, -0.625f, 0.25f, 0, 0, -1, 0, 0.25f, -0.625f, -0.625f, -1.25f, 0.25f, -0.625f, -0.625f, 0.25f, -0.625f, 0, -1, -0.625f, 0.25f)
				.setRotationPoint(-54, -7, 8.625f).setRotationAngle(0, 0, 0).setName("rear railing handgrab 13")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(-52.375f, -7, 8.625f).setRotationAngle(0, 0, 0).setName("rear railing handgrab 14")
		);
		group0.add(new ModelRendererTurbo(group0, 416, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.625f, -0.375f, 0, -0.375f, 0, 0, -0.625f, -0.375f, 0, 0, -0.375f, -0.625f, -0.625f, -0.375f, -0.625f, -0.375f, 0, -0.625f, -0.625f, -0.375f, -0.625f, 0)
				.setRotationPoint(-50.75f, -7, 8.625f).setRotationAngle(0, 0, 0).setName("rear railing handgrab 15")
		);
		group0.add(new ModelRendererTurbo(group0, 214, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0.875f, 0, 0, 0.875f, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0.875f, 0, -0.625f, 0.875f)
				.setRotationPoint(-57.625f, -1.5f, -10.25f).setRotationAngle(0, 0, 0).setName("rear railing cross bottom 0")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(-57.25f, -1.5f, -10.25f).setRotationAngle(0, 0, 0).setName("rear railing cross bottom 1")
		);
		group0.add(new ModelRendererTurbo(group0, 372, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
				.setRotationPoint(-57.25f, -1.5f, 8.625f).setRotationAngle(0, 0, 0).setName("rear railing cross bottom 2")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 2.25f, 0, 0, 2.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(57, 5.875f, -2).setRotationAngle(0, 0, 0).setName("base front other thing")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 22, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0)
				.setRotationPoint(-57, 1.5f, -11).setRotationAngle(0, 0, 0).setName("rear plow 0")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0.5f, 0, -0.25f, 0.5f)
				.setRotationPoint(-57, 7.25f, -9.75f).setRotationAngle(0, 0, 0).setName("rear plow 1")
		);
		group0.add(new ModelRendererTurbo(group0, 271, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, 0, 0, 0.75f, 0)
				.setRotationPoint(-56.5f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("rear plow bits left 0")
		);
		group0.add(new ModelRendererTurbo(group0, 266, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, 0, 0, 0.75f, 0)
				.setRotationPoint(-53.75f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("rear plow bits left 1")
		);
		group0.add(new ModelRendererTurbo(group0, 372, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 1.25f, -0.5f, 0, 1.25f, -0.5f, 0, 1.25f, 0, 0.25f, 1.25f, 0)
				.setRotationPoint(-55.75f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("rear plow bits left 2")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0.25f, -0.75f, 0)
				.setRotationPoint(-55.75f, 7, 10).setRotationAngle(0, 0, 0).setName("rear plow bits left 3")
		);
		group0.add(new ModelRendererTurbo(group0, 291, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 3.75f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, 3.75f, 0)
				.setRotationPoint(-53.25f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("rear plow bits left 4")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 1.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 1.5f, 0)
				.setRotationPoint(-51.25f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("rear plow bits left 5")
		);
		group0.add(new ModelRendererTurbo(group0, 272, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(-49.25f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("rear plow bits left 6")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.375f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.375f, 0, 0, 0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 0)
				.setRotationPoint(-55.75f, 2.5f, 10.375f).setRotationAngle(0, 0, 0).setName("rear railing handgrab 16")
		);
		group0.add(new ModelRendererTurbo(group0, 190, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.375f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0.375f, 0, 0, 0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 0)
				.setRotationPoint(-55.75f, 2.5f, -12).setRotationAngle(0, 0, 0).setName("rear railing handgrab 17")
		);
		group0.add(new ModelRendererTurbo(group0, 214, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, 0, 0, 0.75f, 0)
				.setRotationPoint(-56.5f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("rear plow bits right 0")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0.75f, -0.5f, -0.5f, 0.75f, -0.5f, -0.5f, 0.75f, 0, 0, 0.75f, 0)
				.setRotationPoint(-53.75f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("rear plow bits right 1")
		);
		group0.add(new ModelRendererTurbo(group0, 266, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 1.25f, -0.5f, 0, 1.25f, -0.5f, 0, 1.25f, 0, 0.25f, 1.25f, 0)
				.setRotationPoint(-55.75f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("rear plow bits right 2")
		);
		group0.add(new ModelRendererTurbo(group0, 448, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0.25f, -0.75f, 0)
				.setRotationPoint(-55.75f, 7, -11.5f).setRotationAngle(0, 0, 0).setName("rear plow bits right 3")
		);
		group0.add(new ModelRendererTurbo(group0, 363, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 3.75f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, 0, 3.75f, 0)
				.setRotationPoint(-53.25f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("rear plow bits right 4")
		);
		group0.add(new ModelRendererTurbo(group0, 352, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 1.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 1.5f, 0)
				.setRotationPoint(-51.25f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("rear plow bits right 5")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(-49.25f, 1.5f, -11.5f).setRotationAngle(0, 0, 0).setName("rear plow bits right 6")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.75f, 0, 0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.75f, 0, 0.75f)
				.setRotationPoint(-58, 6.75f, -9.5f).setRotationAngle(0, 0, 0).setName("rear plow bits 0")
		);
		group0.add(new ModelRendererTurbo(group0, 318, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 4, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0.75f, -0.25f, -0.75f, 0.75f)
				.setRotationPoint(-59, 7.75f, -9.5f).setRotationAngle(0, 0, 0).setName("rear plow bits 1")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.75f, 0, 0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.75f, 0, 0.75f)
				.setRotationPoint(-58, 6.75f, 4.75f).setRotationAngle(0, 0, 0).setName("rear plow bits 2")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 4, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0.75f, -0.25f, -0.75f, 0.75f)
				.setRotationPoint(-59, 7.75f, 4.75f).setRotationAngle(0, 0, 0).setName("rear plow bits 3")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(-58.5f, 3.25f, -0.5f).setRotationAngle(0, 0, 0).setName("rear coupler 0")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-59.5f, 3, -0.5f).setRotationAngle(0, 0, 0).setName("rear coupler 1")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-60.5f, 3, 0.5f).setRotationAngle(0, 0, 0).setName("rear coupler 2")
		);
		group0.add(new ModelRendererTurbo(group0, 170, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-61.5f, 3, -0.5f).setRotationAngle(0, 0, 0).setName("rear coupler 3")
		);
		group0.add(new ModelRendererTurbo(group0, 156, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-59.5f, 3, -1.5f).setRotationAngle(0, 0, 0).setName("rear coupler 4")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-59, 0.5f, -2.5f).setRotationAngle(0, 0, 0).setName("base rear thing 0")
		);
		group0.add(new ModelRendererTurbo(group0, 341, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(-59, 1.5f, -2.25f).setRotationAngle(0, 0, 0).setName("base rear thing 1")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(-59, 1.5f, 1.5f).setRotationAngle(0, 0, 0).setName("base rear thing 2")
		);
		group0.add(new ModelRendererTurbo(group0, 150, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 2.25f, 0, 0, 0, 0, 0, 0, 0, 0, 2.25f, 0, 0)
				.setRotationPoint(-58, 5.875f, -2).setRotationAngle(0, 0, 0).setName("base rear other thing")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 38, 4, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(-18.75f, 1.5f, 9.75f).setRotationAngle(0, 0, 0).setName("side bit left 0")
		);
		group0.add(new ModelRendererTurbo(group0, 128, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -2.5f, 0.25f, 0)
				.setRotationPoint(-21.75f, 1.5f, 9.75f).setRotationAngle(0, 0, 0).setName("side bit left 1")
		);
		group0.add(new ModelRendererTurbo(group0, 98, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, -2.5f, 0.25f, 0, -2.5f, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(19.5f, 1.5f, 9.75f).setRotationAngle(0, 0, 0).setName("side bit left 2")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 38, 4, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(-18.75f, 1.5f, -10.75f).setRotationAngle(0, 0, 0).setName("side bit right 0")
		);
		group0.add(new ModelRendererTurbo(group0, 30, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, -2.5f, 0.25f, 0)
				.setRotationPoint(-21.75f, 1.5f, -10.75f).setRotationAngle(0, 0, 0).setName("side bit right 1")
		);
		group0.add(new ModelRendererTurbo(group0, 21, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, -2.5f, 0.25f, 0, -2.5f, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(19.5f, 1.5f, -10.75f).setRotationAngle(0, 0, 0).setName("side bit right 2")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 5, 19, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0.5f, 0, 0.25f, 0.5f)
				.setRotationPoint(-19, 1.5f, -9.75f).setRotationAngle(0, 0, 0).setName("undercarriage bits 0")
		);
		group0.add(new ModelRendererTurbo(group0, 333, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 19, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0.25f, -1, 0.25f, 0.25f, -1, 0.25f, 0.25f, -0.5f, 0, 0.25f, -0.5f)
				.setRotationPoint(-19, 6.75f, -9.75f).setRotationAngle(0, 0, 0).setName("undercarriage bits 1")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 5, 19, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0.5f, 0.25f, 0.25f, 0.5f)
				.setRotationPoint(-7.25f, 1.5f, -9.75f).setRotationAngle(0, 0, 0).setName("undercarriage bits 2")
		);
		group0.add(new ModelRendererTurbo(group0, 452, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 19, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0.25f, -1, 0.25f, 0.25f, -1, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f)
				.setRotationPoint(-7.25f, 6.75f, -9.75f).setRotationAngle(0, 0, 0).setName("undercarriage bits 3")
		);
		group0.add(new ModelRendererTurbo(group0, 283, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 19, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0.25f, -1, 0.25f, 0.25f, -1, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f)
				.setRotationPoint(3.75f, 6.25f, -9.75f).setRotationAngle(0, 0, 0).setName("undercarriage bits 4")
		);
		group0.add(new ModelRendererTurbo(group0, 402, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 5, 19, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0.5f, 0.25f, -0.25f, 0.5f)
				.setRotationPoint(3.75f, 1.5f, -9.75f).setRotationAngle(0, 0, 0).setName("undercarriage bits 5")
		);
		group0.add(new ModelRendererTurbo(group0, 452, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(35.25f, -11, 9).setRotationAngle(0, 0, 0).setName("front left curved bits 0")
		);
		group0.add(new ModelRendererTurbo(group0, 402, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0)
				.setRotationPoint(40.25f, -10.5f, 9).setRotationAngle(0, 0, 0).setName("front left curved bits 1")
		);
		group0.add(new ModelRendererTurbo(group0, 220, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, -2.0625f, 0, 0, -2.0625f, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0)
				.setRotationPoint(44.25f, -9.25f, 9).setRotationAngle(0, 0, 0).setName("front left curved bits 2")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(48.25f, -7.1875f, 9).setRotationAngle(0, 0, 0).setName("front left curved bits 3")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.75f, -1.6875f, 0, -0.75f, -1.6875f, 0, 0, 0, 0, 0, -0.3125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.3125f, 0, 0, -0.3125f, 0)
				.setRotationPoint(50.25f, -5.1875f, 9).setRotationAngle(0, 0, 0).setName("front left curved bits 4")
		);
		group0.add(new ModelRendererTurbo(group0, 219, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(51.25f, -3.5f, 9).setRotationAngle(0, 0, 0).setName("front left curved bits 5")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(35.25f, -11, -11).setRotationAngle(0, 0, 0).setName("front right curved bits 0")
		);
		group0.add(new ModelRendererTurbo(group0, 207, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, 0)
				.setRotationPoint(40.25f, -10.5f, -11).setRotationAngle(0, 0, 0).setName("front right curved bits 1")
		);
		group0.add(new ModelRendererTurbo(group0, 175, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, -2.0625f, 0, 0, -2.0625f, 0, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0)
				.setRotationPoint(44.25f, -9.25f, -11).setRotationAngle(0, 0, 0).setName("front right curved bits 2")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(48.25f, -7.1875f, -11).setRotationAngle(0, 0, 0).setName("front right curved bits 3")
		);
		group0.add(new ModelRendererTurbo(group0, 90, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.75f, -1.6875f, 0, -0.75f, -1.6875f, 0, 0, 0, 0, 0, -0.3125f, 0, -0.75f, -0.3125f, 0, -0.75f, -0.3125f, 0, 0, -0.3125f, 0)
				.setRotationPoint(50.25f, -5.1875f, -11).setRotationAngle(0, 0, 0).setName("front right curved bits 4")
		);
		group0.add(new ModelRendererTurbo(group0, 203, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(51.25f, -3.5f, -11).setRotationAngle(0, 0, 0).setName("front right curved bits 5")
		);
		group0.add(new ModelRendererTurbo(group0, 242, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 54, 5, 2, 0, 0, -4.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -4.75f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-40.75f, -11, 9).setRotationAngle(0, 0, 0).setName("back left curved bits 0")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0)
				.setRotationPoint(-44.75f, -6.25f, 9).setRotationAngle(0, 0, 0).setName("back left curved bits 1")
		);
		group0.add(new ModelRendererTurbo(group0, 26, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -1.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-48.75f, -6, 9).setRotationAngle(0, 0, 0).setName("back left curved bits 2")
		);
		group0.add(new ModelRendererTurbo(group0, 139, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 2, 0, -0.5f, -2.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-51.75f, -4.25f, 9).setRotationAngle(0, 0, 0).setName("back left curved bits 3")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(-51.75f, -1.75f, 9).setRotationAngle(0, 0, 0).setName("back left curved bits 4")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 54, 5, 2, 0, 0, -4.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -4.75f, 0, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-40.75f, -11, -11).setRotationAngle(0, 0, 0).setName("back right curved bits 0")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, 0)
				.setRotationPoint(-44.75f, -6.25f, -11).setRotationAngle(0, 0, 0).setName("back right curved bits 1")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 58, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -1.75f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
				.setRotationPoint(-48.75f, -6, -11).setRotationAngle(0, 0, 0).setName("back right curved bits 2")
		);
		group0.add(new ModelRendererTurbo(group0, 128, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 2, 0, -0.5f, -2.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-51.75f, -4.25f, -11).setRotationAngle(0, 0, 0).setName("back right curved bits 3")
		);
		group0.add(new ModelRendererTurbo(group0, 157, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(-51.75f, -1.75f, -11).setRotationAngle(0, 0, 0).setName("back right curved bits 4")
		);
		group0.add(new ModelRendererTurbo(group0, 151, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.7275f, 0, -0.5f, 0.7275f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(23, -22, -3.5f).setRotationAngle(0, 0, 0).setName("cab horn 0")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(26, -22, -3.5f).setRotationAngle(0, 0, 0).setName("cab horn 1")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(23.5f, -22, -3.5f).setRotationAngle(0, 0, 0).setName("cab horn 2")
		);
		group0.add(new ModelRendererTurbo(group0, 128, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.7275f, 0, -0.5f, 0.7275f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(25.5f, -22, -3.5f).setRotationAngle(0, 0, 0).setName("cab horn 3")
		);
		group0.add(new ModelRendererTurbo(group0, 6, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f)
				.setRotationPoint(22, -22, -3.5f).setRotationAngle(0, 0, 0).setName("cab horn 4")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.7275f, 0, -0.5f, 0.7275f, 0)
				.setRotationPoint(22.5f, -22, 2.5f).setRotationAngle(0, 0, 0).setName("cab horn 5")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(22, -22, 2.5f).setRotationAngle(0, 0, 0).setName("cab horn 6")
		);
		group0.add(new ModelRendererTurbo(group0, 95, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(23.5f, -22, 2.5f).setRotationAngle(0, 0, 0).setName("cab horn 7")
		);
		group0.add(new ModelRendererTurbo(group0, 261, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.7275f, 0, -0.5f, 0.7275f, 0)
				.setRotationPoint(25, -22, 2.5f).setRotationAngle(0, 0, 0).setName("cab horn 8")
		);
		group0.add(new ModelRendererTurbo(group0, 214, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0)
				.setRotationPoint(26, -22, 2.5f).setRotationAngle(0, 0, 0).setName("cab horn 9")
		);
		group0.add(new ModelRendererTurbo(group0, 332, 19, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-1.125f, -20.75f, -1.5f).setRotationAngle(0, 0, 0).setName("fan  0")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(0.875f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  1")
		);
		group0.add(new ModelRendererTurbo(group0, 26, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
				.setRotationPoint(-1.125f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  2")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
				.setRotationPoint(3.875f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  3")
		);
		group0.add(new ModelRendererTurbo(group0, 318, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(0.875f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  4")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-1.125f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  5")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(3.875f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  6")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-9.25f, -20.75f, -1.5f).setRotationAngle(0, 0, 0).setName("fan  7")
		);
		group0.add(new ModelRendererTurbo(group0, 165, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-7.25f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  8")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
				.setRotationPoint(-9.25f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  9")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 68, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
				.setRotationPoint(-4.25f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  10")
		);
		group0.add(new ModelRendererTurbo(group0, 303, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-7.25f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  11")
		);
		group0.add(new ModelRendererTurbo(group0, 356, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-9.25f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  12")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-4.25f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  13")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 12, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-16.5f, -20.75f, -1.5f).setRotationAngle(0, 0, 0).setName("fan  14")
		);
		group0.add(new ModelRendererTurbo(group0, 288, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-14.5f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  15")
		);
		group0.add(new ModelRendererTurbo(group0, 124, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
				.setRotationPoint(-16.5f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  16")
		);
		group0.add(new ModelRendererTurbo(group0, 181, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
				.setRotationPoint(-11.5f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  17")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-14.5f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  18")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-16.5f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  19")
		);
		group0.add(new ModelRendererTurbo(group0, 124, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-11.5f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  20")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-24.635f, -20.75f, -1.5f).setRotationAngle(0, 0, 0).setName("fan  21")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-22.635f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  22")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
				.setRotationPoint(-24.635f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  23")
		);
		group0.add(new ModelRendererTurbo(group0, 382, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
				.setRotationPoint(-19.635f, -20.75f, 1.5f).setRotationAngle(0, 0, 0).setName("fan  24")
		);
		group0.add(new ModelRendererTurbo(group0, 222, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-22.635f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  25")
		);
		group0.add(new ModelRendererTurbo(group0, 343, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-24.635f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  26")
		);
		group0.add(new ModelRendererTurbo(group0, 293, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-19.635f, -20.75f, -3.5f).setRotationAngle(0, 0, 0).setName("fan  27")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 141, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.875f, -2, 0, -0.875f, -2, 0, 0, 0, 0, 0, 0, -1, -0.875f, -2, -1, -0.875f, -2, -1, 0, 0, -1, 0)
				.setRotationPoint(48.25f, -11, 8.125f).setRotationAngle(0, 0, 0).setName("front left numberboard")
		);
		group0.add(new ModelRendererTurbo(group0, 151, 189, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.875f, -2, 0, -0.875f, -2, 0, 0, 0, 0, 0, 0, -1, -0.875f, -2, -1, -0.875f, -2, -1, 0, 0, -1, 0)
				.setRotationPoint(48.25f, -11, -10).setRotationAngle(0, 0, 0).setName("front right numberboard")
		);
		group0.add(new ModelRendererTurbo(group0, 384, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
				.setRotationPoint(37, -16, -0.5f).setRotationAngle(0, 0, 0).setName("nose horn 0")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(36.5f, -16, -0.5f).setRotationAngle(0, 0, 0).setName("nose horn 1")
		);
		group0.add(new ModelRendererTurbo(group0, 84, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -16, -0.5f).setRotationAngle(0, 0, 0).setName("nose horn 2")
		);
		group0.add(new ModelRendererTurbo(group0, 15, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
				.setRotationPoint(39.5f, -16, -0.5f).setRotationAngle(0, 0, 0).setName("nose horn 3")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0)
				.setRotationPoint(40.5f, -16, -0.5f).setRotationAngle(0, 0, 0).setName("nose horn 4")
		);
		group0.add(new ModelRendererTurbo(group0, 371, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
				.setRotationPoint(38, -16, 1.25f).setRotationAngle(0, 0, 0).setName("nose horn 5")
		);
		group0.add(new ModelRendererTurbo(group0, 269, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(37.5f, -16, 1.25f).setRotationAngle(0, 0, 0).setName("nose horn 6")
		);
		group0.add(new ModelRendererTurbo(group0, 31, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(39, -16, 1.25f).setRotationAngle(0, 0, 0).setName("nose horn 7")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
				.setRotationPoint(40.5f, -16, 1.25f).setRotationAngle(0, 0, 0).setName("nose horn 8")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0)
				.setRotationPoint(41.5f, -16, 1.25f).setRotationAngle(0, 0, 0).setName("nose horn 9")
		);
		group0.add(new ModelRendererTurbo(group0, 157, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
				.setRotationPoint(38, -16, -2.25f).setRotationAngle(0, 0, 0).setName("nose horn 10")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(37.5f, -16, -2.25f).setRotationAngle(0, 0, 0).setName("nose horn 11")
		);
		group0.add(new ModelRendererTurbo(group0, 468, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(39, -16, -2.25f).setRotationAngle(0, 0, 0).setName("nose horn 12")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
				.setRotationPoint(40.5f, -16, -2.25f).setRotationAngle(0, 0, 0).setName("nose horn 13")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0)
				.setRotationPoint(41.5f, -16, -2.25f).setRotationAngle(0, 0, 0).setName("nose horn 14")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.74f, -0.5f, 0, 0.74f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(9.5f, -17.75f, 8.1125f).setRotationAngle(0, 0, 0).setName("side horn 0")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(12.5f, -17.75f, 8.1125f).setRotationAngle(0, 0, 0).setName("side horn 1")
		);
		group0.add(new ModelRendererTurbo(group0, 331, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(10, -17.75f, 8.1125f).setRotationAngle(0, 0, 0).setName("side horn 2")
		);
		group0.add(new ModelRendererTurbo(group0, 186, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.74f, -0.5f, 0, 0.74f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(12, -17.75f, 8.1125f).setRotationAngle(0, 0, 0).setName("side horn 3")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f)
				.setRotationPoint(8.5f, -17.75f, 8.1125f).setRotationAngle(0, 0, 0).setName("side horn 4")
		);
		group0.add(new ModelRendererTurbo(group0, 103, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44.5f, -16, -1).setRotationAngle(0, 0, 0).setName("nose bell 0")
		);
		group0.add(new ModelRendererTurbo(group0, 80, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -17, -0.5f).setRotationAngle(0, 0, 0).setName("nose bell 1")
		);
		group0.add(new ModelRendererTurbo(group0, 479, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f)
				.setRotationPoint(44.75f, -17.25f, -0.75f).setRotationAngle(0, 0, 0).setName("nose bell 2")
		);
		group0.add(new ModelRendererTurbo(group0, 281, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
				.setRotationPoint(44.5f, -17.5f, -0.75f).setRotationAngle(0, 0, 0).setName("nose bell 3")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
				.setRotationPoint(44.5f, -17.5f, 0.25f).setRotationAngle(0, 0, 0).setName("nose bell 4")
		);
		group0.add(new ModelRendererTurbo(group0, 194, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, -0.5f, -0.75f, 0.75f, -0.5f)
				.setRotationPoint(46.25f, -17.25f, -0.75f).setRotationAngle(0, 0, 0).setName("nose bell 5")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, -0.5f, -0.75f, 0.75f, -0.5f)
				.setRotationPoint(46.25f, -17.25f, 0.25f).setRotationAngle(0, 0, 0).setName("nose bell 6")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.5f, 0, 0.75f, -0.5f)
				.setRotationPoint(43.75f, -17.25f, -0.75f).setRotationAngle(0, 0, 0).setName("nose bell 7")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.5f, 0, 0.75f, -0.5f)
				.setRotationPoint(43.75f, -17.25f, 0.25f).setRotationAngle(0, 0, 0).setName("nose bell 8")
		);
		group0.add(new ModelRendererTurbo(group0, 110, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, 0, 0.25f)
				.setRotationPoint(57, -4, -2.125f).setRotationAngle(0, 0, 0).setName("front thingy idk 0")
		);
		group0.add(new ModelRendererTurbo(group0, 99, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
				.setRotationPoint(57, -4.5f, -2.125f).setRotationAngle(0, 0, 0).setName("front thingy idk 1")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, 0, 0.25f)
				.setRotationPoint(-57.25f, -4, -2.125f).setRotationAngle(0, 0, 0).setName("back thingy idk 0")
		);
		group0.add(new ModelRendererTurbo(group0, 77, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -1, -0.625f, 0, -1, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
				.setRotationPoint(-57.25f, -4.5f, -2.125f).setRotationAngle(0, 0, 0).setName("back thingy idk 1")
		);
		group0.add(new ModelRendererTurbo(group0, 24, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0, 0, 0.25f, 0, 0, -0.7f, 0, 0, 0.25f, 0, 0, -0.5f, -0.5f, 0, 0.25f, -0.5f, 0, -0.7f, -0.5f, 0, 0.25f, -0.5f, 0)
				.setRotationPoint(52.25f, -8.5f, 3.75f).setRotationAngle(0, 0, 0).setName("front ladder left 0")
		);
		group0.add(new ModelRendererTurbo(group0, 483, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0, 0, 0.25f, 0, 0, -0.7f, 0, 0, 0.25f, 0, 0, -0.5f, -0.5f, 0, 0.25f, -0.5f, 0, -0.7f, -0.5f, 0, 0.25f, -0.5f, 0)
				.setRotationPoint(51.75f, -11.5f, 3.75f).setRotationAngle(0, 0, 0).setName("front ladder left 1")
		);
		group0.add(new ModelRendererTurbo(group0, 472, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0, 0, 0.25f, 0, 0, -0.7f, 0, 0, 0.25f, 0, 0, -0.5f, -0.5f, 0, 0.25f, -0.5f, 0, -0.7f, -0.5f, 0, 0.25f, -0.5f, 0)
				.setRotationPoint(52.625f, -5.5f, 3.75f).setRotationAngle(0, 0, 0).setName("front ladder left 2")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, 0, 0, 0.25f, 0, 0, -0.7f, 0, 0, 0.25f, 0, 0, -0.5f, -0.5f, 0, 0.25f, -0.5f, 0, -0.7f, -0.5f, 0, 0.25f, -0.5f, 0)
				.setRotationPoint(53, -2.5f, 3.75f).setRotationAngle(0, 0, 0).setName("front ladder left 3")
		);
		group0.add(new ModelRendererTurbo(group0, 461, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.5f, 0, 0, -0.75f, 0, 0, 0.3f, 0, 0, -0.75f, 0, 0, 0.5f, -0.5f, 0, -0.75f, -0.5f, 0, 0.3f, -0.5f, 0, -0.75f, -0.5f, 0)
				.setRotationPoint(52.25f, -8.5f, -7.75f).setRotationAngle(0, 0, 0).setName("front ladder right 0")
		);
		group0.add(new ModelRendererTurbo(group0, 434, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.5f, 0, 0, -0.75f, 0, 0, 0.3f, 0, 0, -0.75f, 0, 0, 0.5f, -0.5f, 0, -0.75f, -0.5f, 0, 0.3f, -0.5f, 0, -0.75f, -0.5f, 0)
				.setRotationPoint(51.75f, -11.5f, -7.75f).setRotationAngle(0, 0, 0).setName("front ladder right 1")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.5f, 0, 0, -0.75f, 0, 0, 0.3f, 0, 0, -0.75f, 0, 0, 0.5f, -0.5f, 0, -0.75f, -0.5f, 0, 0.3f, -0.5f, 0, -0.75f, -0.5f, 0)
				.setRotationPoint(52.625f, -5.5f, -7.75f).setRotationAngle(0, 0, 0).setName("front ladder right 2")
		);
		group0.add(new ModelRendererTurbo(group0, 63, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.5f, 0, 0, -0.75f, 0, 0, 0.3f, 0, 0, -0.75f, 0, 0, 0.5f, -0.5f, 0, -0.75f, -0.5f, 0, 0.3f, -0.5f, 0, -0.75f, -0.5f, 0)
				.setRotationPoint(53, -2.5f, -7.75f).setRotationAngle(0, 0, 0).setName("front ladder right 3")
		);
		group0.add(new ModelRendererTurbo(group0, 70, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-53, -9.5f, 3.25f).setRotationAngle(0, 0, 0).setName("rear ladder 0")
		);
		group0.add(new ModelRendererTurbo(group0, 296, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-53.5f, -6, 3.25f).setRotationAngle(0, 0, 0).setName("rear ladder 1")
		);
		group0.add(new ModelRendererTurbo(group0, 258, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-54, -2.5f, 3.25f).setRotationAngle(0, 0, 0).setName("rear ladder 2")
		);
		group0.add(new ModelRendererTurbo(group0, 247, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-52.325f, -13.5f, 3).setRotationAngle(0, 0, 0).setName("rear ladder 3")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
				.setRotationPoint(-51.75f, -16.75f, 2.25f).setRotationAngle(0, 0, 0).setName("rear ladder 4")
		);
		group0.add(new ModelRendererTurbo(group0, 80, 59, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, 0, 0)
				.setRotationPoint(50.5825f, -11, 7.9775f).setRotationAngle(0, 0, 0).setName("front marker light 0")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 58, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(50.5825f, -11, -8.9775f).setRotationAngle(0, 0, 0).setName("front marker light 1")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -1.25f, 0, 0, -1.125f, 0, -0.1875f, -0.125f, 0, 0, 0, -1.25f, 0, -1.25f, -1.25f, 0, -1.125f, -1.25f, -0.1875f, -0.125f, -1.25f, 0)
				.setRotationPoint(50.5825f, -10.875f, 8.04f).setRotationAngle(0, 0, 0).setName("front marker bulb left")
		);
		group0.add(new ModelRendererTurbo(group0, 340, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.125f, 0, 0, -1.125f, 0, -0.1875f, -1.25f, 0, 0, 0, 0, 0, -0.125f, -1.25f, 0, -1.125f, -1.25f, -0.1875f, -1.25f, -1.25f, 0, 0, -1.25f, 0)
				.setRotationPoint(50.5825f, -10.875f, -9.04f).setRotationAngle(0, 0, 0).setName("front marker bulb right")
		);
		group0.add(new ModelRendererTurbo(group0, 333, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0.0625f, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0.25f, 0, 0.0625f, 0, 0, -0.25f)
				.setRotationPoint(-51.1675f, -17.3125f, 6.415f).setRotationAngle(0, 0, 0).setName("rear marker light 0")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0.25f, 0, 0.0625f, 0, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0.25f, 0, 0.0625f, 0, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-51.1675f, -17.3125f, -7.415f).setRotationAngle(0, 0, 0).setName("rear marker light 1")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 133, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.25f, 0, 0, -1, 0, 0, -1.125f, 0, 0, -0.125f, 0, -0.1875f, -0.25f, -1.25f, 0, -1, -1.25f, 0, -1.125f, -1.25f, 0, -0.125f, -1.25f, -0.1875f)
				.setRotationPoint(-51.1675f, -17.1875f, 6.4775f).setRotationAngle(0, 0, 0).setName("rear marker bulb left")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.125f, 0, -0.1875f, -1.125f, 0, 0, -1, 0, 0, -0.25f, 0, 0, -0.125f, -1.25f, -0.1875f, -1.125f, -1.25f, 0, -1, -1.25f, 0, -0.25f, -1.25f, 0)
				.setRotationPoint(-51.1675f, -17.1875f, -7.4775f).setRotationAngle(0, 0, 0).setName("rear marker bulb right")
		);
		group0.add(new ModelRendererTurbo(group0, 383, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 5, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13, -16, -11).setRotationAngle(0, 0, 0).setName("right cab window 0")
		);
		group0.add(new ModelRendererTurbo(group0, 343, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, -2.279f, 0, 0, -2.279f, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0)
				.setRotationPoint(31.25f, -16, -11).setRotationAngle(0, 0, 0).setName("right cab window 1")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(16, -16, -11).setRotationAngle(0, 0, 0).setName("right cab window 2")
		);
		group0.add(new ModelRendererTurbo(group0, 194, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26.25f, -16, -11).setRotationAngle(0, 0, 0).setName("right cab window 3")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 5, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13, -16, 10).setRotationAngle(0, 0, 0).setName("left cab window 0")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, -2.279f, 0, 0, -2.279f, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0)
				.setRotationPoint(31.25f, -16, 10).setRotationAngle(0, 0, 0).setName("left cab window 1")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 5, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(16, -16, 10).setRotationAngle(0, 0, 0).setName("left cab window 2")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26.25f, -16, 10).setRotationAngle(0, 0, 0).setName("left cab window 3")
		);
		group0.add(new ModelRendererTurbo(group0, 196, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 5, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(13.75f, -6, -10).setRotationAngle(0, 0, 0).setName("cab base")
		);
		group0.add(new ModelRendererTurbo(group0, 54, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(32.25f, -11, -9).setRotationAngle(0, 0, 0).setName("throttle  0")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(32.5f, -11.5f, -8.75f).setRotationAngle(0, 0, 0).setName("throttle  1")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f)
				.setRotationPoint(32.25f, -12, -8.75f).setRotationAngle(0, 0, 0).setName("throttle  2")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 9, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f)
				.setRotationPoint(28, -15.5f, 1).setRotationAngle(0, 0, 0).setName("cab detail 0")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 8, 2, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -1.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(32, -14.5f, -1).setRotationAngle(0, 0, 0).setName("cab detail 1")
		);
		group0.add(new ModelRendererTurbo(group0, 402, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, -2, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(32, -15.5f, -1).setRotationAngle(0, 0, 0).setName("cab detail 2")
		);
		group0.add(new ModelRendererTurbo(group0, 243, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f)
				.setRotationPoint(32.75f, -12, -2.375f).setRotationAngle(0, 0, 0).setName("cab detail 3")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 72, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f)
				.setRotationPoint(29.625f, -12.5f, -1).setRotationAngle(0, 0, 0).setName("cab detail 4")
		);
		group0.add(new ModelRendererTurbo(group0, 236, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 1.335f, 0, 0, 1.335f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -1.835f, 0, 0, -1.835f, 0)
				.setRotationPoint(49.8125f, -13, -7.75f).setRotationAngle(0, 0, 0).setName("front ladder right 4")
		);
		group0.add(new ModelRendererTurbo(group0, 215, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 1.335f, 0, -0.5f, 1.335f, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1.835f, 0, -0.5f, -1.835f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(49.8125f, -13, 3.75f).setRotationAngle(0, 0, 0).setName("front ladder left 4")
		);
		group0.add(new ModelRendererTurbo(group0, 174, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 3, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(7, -22, -6.5f).setRotationAngle(0, 0, 0).setName("roof box 0")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 3, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-38, -22, -6.5f).setRotationAngle(0, 0, 0).setName("roof box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 107, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 2, 0, -0.75f, 0, -2, 0.75f, 0, -2, 0.75f, 0, 0, -0.75f, 0, 0, 0.5f, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f, -0.5f, -0.75f, 0, 0.5f, -0.75f, 0)
				.setRotationPoint(-52, -18.25f, -7.75f).setRotationAngle(0, 0, 0).setName("back wall corner 0")
		);
		group0.add(new ModelRendererTurbo(group0, 365, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 2, 0, -0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -2, -0.75f, 0, -2, 0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.25f, 0.5f, -0.75f, -0.25f)
				.setRotationPoint(-52, -18.25f, 5.75f).setRotationAngle(0, 0, 0).setName("back wall corner 1")
		);
		group0.add(new ModelRendererTurbo(group0, 114, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 1.75f, 0, 0, 1.75f, 0, 0, -1.75f, 0, 0, -1.75f, 0, -0.75f, 1.205f, 0, -0.75f, 1.25f, 0, -0.75f, -1.25f, 0, -0.75f, -1.205f)
				.setRotationPoint(13, -18.25f, 8).setRotationAngle(0, 0, 0).setName("left wall 5")
		);
		group0.add(new ModelRendererTurbo(group0, 90, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, 1.7075f, 0, 0, 1.75f, 0, 0, -1.75f, 0, 0, -1.705f, 0, -1, 0.5f, 0, -6, 1.75f, 0, -6, -1.75f, 0, -1, -0.5f)
				.setRotationPoint(13, -16, 8.5f).setRotationAngle(0, 0, 0).setName("left wall 6")
		);
		group0.add(new ModelRendererTurbo(group0, 184, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 1.75f, 0, 0, 1.75f, 0, -0.75f, -1.205f, 0, -0.75f, -1.25f, 0, -0.75f, 1.25f, 0, -0.75f, 1.205f)
				.setRotationPoint(13, -18.25f, -9).setRotationAngle(0, 0, 0).setName("right wall 5")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, -1.705f, 0, 0, -1.75f, 0, 0, 1.75f, 0, 0, 1.7075f, 0, -1, -0.5f, 0, -6, -1.75f, 0, -6, 1.75f, 0, -1, 0.5f)
				.setRotationPoint(13, -16, -9.5f).setRotationAngle(0, 0, 0).setName("right wall 6")
		);
		group0.add(new ModelRendererTurbo(group0, 226, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(57, 1.75f, -7).setRotationAngle(0, 0, 0).setName("front mu cables 0")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(57.5f, 2, -6.75f).setRotationAngle(0, 0, 0).setName("front mu cables 1")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(57, 1.75f, 5).setRotationAngle(0, 0, 0).setName("front mu cables 2")
		);
		this.groups.add(group0);

		group0.add(new ModelRendererTurbo(group0, 485, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(57.5f, 2, 5.25f).setRotationAngle(0, 0, 0).setName("front mu cables 3")
		);
		group0.add(new ModelRendererTurbo(group0, 333, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-57.5f, 1.75f, -7).setRotationAngle(0, 0, 0).setName("rear mu cables 0")
		);
		group0.add(new ModelRendererTurbo(group0, 63, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-58, 2, -6.75f).setRotationAngle(0, 0, 0).setName("rear mu cables 1")
		);
		group0.add(new ModelRendererTurbo(group0, 452, 42, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-57.5f, 1.75f, 5).setRotationAngle(0, 0, 0).setName("rear mu cables 2")
		);
		group0.add(new ModelRendererTurbo(group0, 413, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-58, 2, 5.25f).setRotationAngle(0, 0, 0).setName("rear mu cables 3")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(57, 2, -9).setRotationAngle(0, 0, 0).setName("low ditch lights 0")
		);
		group0.add(new ModelRendererTurbo(group0, 373, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(57, 2, 7.5f).setRotationAngle(0, 0, 0).setName("low ditch lights 1")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(57.25f, 2.25f, -8.75f).setRotationAngle(0, 0, 0).setName("low ditch lights 2")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(57.25f, 2.25f, 7.75f).setRotationAngle(0, 0, 0).setName("low ditch lights 3")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 44, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
				.setRotationPoint(56, -3, -8).setRotationAngle(0, 0, 0).setName("high ditch lights 0")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(56.5f, -2.75f, -7.75f).setRotationAngle(0, 0, 0).setName("high ditch lights 1")
		);
		group0.add(new ModelRendererTurbo(group0, 333, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
				.setRotationPoint(56, -3, 6.5f).setRotationAngle(0, 0, 0).setName("high ditch lights 2")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(56.5f, -2.75f, 6.75f).setRotationAngle(0, 0, 0).setName("high ditch lights 3")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 13, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(9.5f, -19.75f, 8.1125f).setRotationAngle(0, 0, 0).setName("high side horn 0")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(12.5f, -19.75f, 8.1125f).setRotationAngle(0, 0, 0).setName("high side horn 1")
		);
		group0.add(new ModelRendererTurbo(group0, 452, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(10, -19.75f, 8.1125f).setRotationAngle(0, 0, 0).setName("high side horn 2")
		);
		group0.add(new ModelRendererTurbo(group0, 181, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(12, -19.75f, 8.1125f).setRotationAngle(0, 0, 0).setName("high side horn 3")
		);
		group0.add(new ModelRendererTurbo(group0, 16, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f)
				.setRotationPoint(8, -19.75f, 8.1125f).setRotationAngle(0, 0, 0).setName("high side horn 4")
		);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, -0.875f, -2, -1, 0, 0, -1, 0)
				.setRotationPoint(-49.75f, -17.3f, 6.75f).setRotationAngle(0, 0, 0).setName("front left numberboardcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, -2, -1, 0, -2, -1, 0, 0, -1, 0)
				.setRotationPoint(-49.75f, -17.3f, -7.75f).setRotationAngle(0, 0, 0).setName("front right numberboardcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 151, textureX, textureY)
				.addShapeBox(0, 0, 0, 26, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(6, -20.5f, -2.5f).setRotationAngle(0, 0, 0).setName("roof  0cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 186, textureX, textureY)
				.addShapeBox(0, 0, 0, 26, 1, 4, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.75f, 0, 0.75f, -0.75f, 0, 0, 0, 0, 0, 0,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(6, -20.5f, -6.5f).setRotationAngle(0, 0, 0).setName("roof  1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 26, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.75f, 0, 0.75f, -0.75f,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(6, -20.5f, 2.5f).setRotationAngle(0, 0, 0).setName("left roof  1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 154, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 1, 12, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(-24.75f, -19.75f, -5.75f).setRotationAngle(0, 0, 0).setName("roof  0cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 1, 3, 0, 0, -0.23f, 0, -0.25f, -0.23f, 0, -0.25f, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.75f, -0.75f, 0, 0.75f, -0.75f,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(-24.75f, -20.5f, 3.5f).setRotationAngle(0, 0, 0).setName("left roof  1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 1, 3, 0, 0, -0.75f, -0.75f, -0.25f, -0.75f, -0.75f, -0.25f, -0.23f, 0, 0, -0.23f, 0, 0, 0.75f, -0.75f, -0.25f, 0.75f, -0.75f, -0.25f, 0, 0, 0, 0, 0,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(-24.75f, -20.5f, -6.5f).setRotationAngle(0, 0, 0).setName("left roof  1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 156, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 4, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-40.75f, -21, -1.75f).setRotationAngle(0, 0, 0).setName("roof  0cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -1.1f, 0, -0.1f, -1.1f, 0, -1.1f, -0.1f, 0, -1.1f, -0.1f, 0, -1.1f, -1.1f, 0, -1.1f, -1.1f)
				.setRotationPoint(-52.15f, -19.75f, -1).setRotationAngle(0, 0, 0).setName("Headlight_Back")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, -1)
				.setRotationPoint(-52.15f, -19.25f, -1.05f).setRotationAngle(0, 0, 0).setName("Light_T_R_B")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 150, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, -1)
				.setRotationPoint(-52.15f, -19.25f, 0.049999952f).setRotationAngle(0, 0, 0).setName("Light_T_L_B")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 200, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -0.75f, 0, -1.75f, -0.75f, 0, -1.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(35.25f, -12.25f, 8).setRotationAngle(0, 0, 0).setName("left hood wall 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 244, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.5f, 0, 0.25f, -1.5f, 0, 0.25f, -2.75f, 0, 0, 1.75f, 0, -1, 0.5f, -0.75f, 0.25f, -1.4f, -0.75f, 0.25f, -2.75f, -0.75f, 0, 1.25f, -0.75f, -1)
				.setRotationPoint(52.25f, -11.5f, 8).setRotationAngle(0, 0, 0).setName("nose left 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 220, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.5f, 0, 0, -1.5f, 0, 0, -2.75f, 0, 0.25f, 2.75f, 0, 0.25f, 2, -0.75f, 0, -1.4f, -0.75f, 0, -2.65f, -0.75f, 0.25f, 3.25f, -0.75f, 0.25f)
				.setRotationPoint(53.5f, -11.5f, 2.5f).setRotationAngle(0, 0, 0).setName("nose left 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 220, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0, 0.5f, -0.75f, 0, -1.4f, -0.75f, 0, -1.4f, -0.75f, 0, 0.5f, -0.75f, 0)
				.setRotationPoint(53.5f, -11.5f, -2.5f).setRotationAngle(0, 0, 0).setName("nose 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 200, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -0.75f, 0, -1.75f, -0.75f, 0, -1.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(35.25f, -12.25f, -9).setRotationAngle(0, 0, 0).setName("left hood wall 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.75f, 0, -1, -2.75f, 0, 0, -1.5f, 0, 0.25f, 1.5f, 0, 0.25f, 1.25f, -0.75f, -1, -2.75f, -0.75f, 0, -1.4f, -0.75f, 0.25f, 0.5f, -0.75f, 0.25f)
				.setRotationPoint(52.25f, -11.5f, -9).setRotationAngle(0, 0, 0).setName("nose left 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 220, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 2.75f, 0, 0.25f, -2.75f, 0, 0.25f, -1.5f, 0, 0, 1.5f, 0, 0, 3.25f, -0.75f, 0.25f, -2.65f, -0.75f, 0.25f, -1.4f, -0.75f, 0, 2, -0.75f, 0)
				.setRotationPoint(53.5f, -11.5f, -7.5f).setRotationAngle(0, 0, 0).setName("nose left 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 218, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -0.25f, 0, -1.75f, -0.25f, 0, -1.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(36.75f, -1.5f, 8).setRotationAngle(0, 0, 0).setName("left hood wall 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 262, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.5f, 0.5f, 0.25f, -1.5f, 0.5f, 0.25f, -2.75f, 0.5f, 0, 1.75f, 0.5f, -1, 0.5f, -0.75f, 0.25f, -1.4f, -0.75f, 0.25f, -2.75f, -0.75f, 0, 1.25f, -0.75f, -1)
				.setRotationPoint(53.75f, -0.75f, 8).setRotationAngle(0, 0, 0).setName("nose left 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 238, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -2.75f, 0.5f, 0.25f, 2.75f, 0.5f, 0.25f, 2, -0.75f, 0, -1.4f, -0.75f, 0, -2.65f, -0.75f, 0.25f, 3.25f, -0.75f, 0.25f)
				.setRotationPoint(55, -0.75f, 2.5f).setRotationAngle(0, 0, 0).setName("nose left 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 238, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 1.5f, 0.5f, 0, -1.5f, 0.5f, 0, -1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 0.5f, -0.75f, 0, -1.4f, -0.75f, 0, -1.4f, -0.75f, 0, 0.5f, -0.75f, 0)
				.setRotationPoint(55, -0.75f, -2.5f).setRotationAngle(0, 0, 0).setName("nose 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 218, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -0.25f, 0, -1.75f, -0.25f, 0, -1.75f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -1.75f, 0, 0, -1.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(36.75f, -1.5f, -9).setRotationAngle(0, 0, 0).setName("left hood wall 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 262, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.75f, 0.5f, -1, -2.75f, 0.5f, 0, -1.5f, 0.5f, 0.25f, 1.5f, 0.5f, 0.25f, 1.25f, -0.75f, -1, -2.75f, -0.75f, 0, -1.4f, -0.75f, 0.25f, 0.5f, -0.75f, 0.25f)
				.setRotationPoint(53.75f, -0.75f, -9).setRotationAngle(0, 0, 0).setName("nose left 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 238, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 2.75f, 0.5f, 0.25f, -2.75f, 0.5f, 0.25f, -1.5f, 0.5f, 0, 1.5f, 0.5f, 0, 3.25f, -0.75f, 0.25f, -2.65f, -0.75f, 0.25f, -1.4f, -0.75f, 0, 2, -0.75f, 0)
				.setRotationPoint(55, -0.75f, -7.5f).setRotationAngle(0, 0, 0).setName("nose left 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(48.25f, -7.1875f, -11.01f).setRotationAngle(0, 0, 0).setName("front right curve 3cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 142, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(49.25f, -6.1875f, -11.01f).setRotationAngle(0, 0, 0).setName("front right curve 3cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(48.25f, -6.1875f, -11.01f).setRotationAngle(0, 0, 0).setName("front right curve 3cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-52.75f, -10.4f, -2).setRotationAngle(0, 0, 8).setName("nose numberboardcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 142, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(31.75f, -20.75f, -1).setRotationAngle(0, 0, 0).setName("cab horn 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 149, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(31.75f, -21.75f, -1).setRotationAngle(0, 0, 0).setName("cab horn 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 196, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.7275f, 0, -0.5f, 0.7275f, 0)
				.setRotationPoint(26, -22, -0.5f).setRotationAngle(0, 0, 0).setName("cab horn 5cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 191, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(25.5f, -22, -0.5f).setRotationAngle(0, 0, 0).setName("cab horn 6cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 196, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(27, -22, -0.5f).setRotationAngle(0, 0, 0).setName("cab horn 7cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 190, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.7275f, 0, -0.5f, 0.7275f, 0)
				.setRotationPoint(28.5f, -22, -0.5f).setRotationAngle(0, 0, 0).setName("cab horn 8cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 190, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0)
				.setRotationPoint(29.5f, -22, -0.5f).setRotationAngle(0, 0, 0).setName("cab horn 9cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 156, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-2.2f, -21.5f, -1).setRotationAngle(0, 0, 0).setName("fan  7cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-17.6f, -21.5f, -1).setRotationAngle(0, 0, 0).setName("fan  7cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 265, textureX, textureY)
				.addShapeBox(0, 0, 0, 63, 2, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(-49.75f, -0.5f, 11.01f).setRotationAngle(0, 0, 0).setName("back left curve 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 287, textureX, textureY)
				.addShapeBox(0, 0, 0, 63, 2, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(-49.75f, -0.5f, -11.01f).setRotationAngle(0, 0, 0).setName("back left curve 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 250, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(46, -11.25f, 9.01f).setRotationAngle(0, 0, 0).setName("back left curve 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 252, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(46, -11.25f, -9.01f).setRotationAngle(0, 0, 0).setName("back left curve 1cp")
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_CFA164cb(){
		TurboList CFA164cb = new TurboList("CFA164cb");
		CFA164cb.add(new ModelRendererTurbo(CFA164cb, 107, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -1.1f, 0, -0.1f, -1.1f, 0, -1.1f, -0.1f, 0, -1.1f, -0.1f, 0, -1.1f, -1.1f, 0, -1.1f, -1.1f)
				.setRotationPoint(52.4f, -14, -1).setRotationAngle(0, 0, 0).setName("Headlight")
		);
		CFA164cb.add(new ModelRendererTurbo(CFA164cb, 99, 214, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, -1)
				.setRotationPoint(52.4f, -13.5f, -1.05f).setRotationAngle(0, 0, 0).setName("Light_T_L")
		);
		CFA164cb.add(new ModelRendererTurbo(CFA164cb, 112, 202, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, -1, -1, 0, -1, -1)
				.setRotationPoint(52.4f, -13.5f, 0.049999952f).setRotationAngle(0, 0, 0).setName("Light_T_R")
		);
		this.groups.add(CFA164cb);
	}

	private final void initGroup_CPA164cb(){
		TurboList CPA164cb = new TurboList("CPA164cb");
		CPA164cb.add(new ModelRendererTurbo(CPA164cb, 309, 245, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(27, -9, -6.5f).setRotationAngle(0, 0, 0)
		);
		CPA164cb.add(new ModelRendererTurbo(CPA164cb, 60, 231, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
				.setRotationPoint(25.5f, -10, -8).setRotationAngle(0, 0, 0)
		);
		CPA164cb.add(new ModelRendererTurbo(CPA164cb, 375, 243, textureX, textureY).addBox(0, 0, 0, 1, 4, 4)
				.setRotationPoint(25.5f, -14, -8).setRotationAngle(0, 0, 0)
		);
		CPA164cb.add(new ModelRendererTurbo(CPA164cb, 108, 241, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(27, -9, 5.5f).setRotationAngle(0, 0, 0)
		);
		CPA164cb.add(new ModelRendererTurbo(CPA164cb, 325, 230, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
				.setRotationPoint(25.5f, -10, 4).setRotationAngle(0, 0, 0)
		);
		CPA164cb.add(new ModelRendererTurbo(CPA164cb, 447, 214, textureX, textureY).addBox(0, 0, 0, 1, 4, 4)
				.setRotationPoint(25.5f, -14, 4).setRotationAngle(0, 0, 0)
		);
		this.groups.add(CPA164cb);
	}

}
