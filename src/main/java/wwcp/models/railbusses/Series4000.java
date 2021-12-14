//FMT-Marker TiM-1.0
package wwcp.models.railbusses;

import ebf.tim.models.StaticModelAnimator;
import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.entity.Entity;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.1 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class Series4000 extends RollingStockModel {

	public Series4000(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Test Account");
		this.addToCreators("Unregistered Account");
		//
		TurboList Fixed = new TurboList("Fixed");
		Fixed.add(new ModelRendererTurbo(Fixed, 163, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 15, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.25f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 15, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.25f, -13, 9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 490, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0.01f, 0, 0, -0.6775f, 0, 0, -0.6775f, 0, 0.5f, -0.3225f, 0, 0.5f, 0.01f, 0, 0, -0.6775f, 0, 0, -0.6775f, 0, 0.5f, -0.3225f, 0, 0.5f)
			.setRotationPoint(-48.3225f, -13, 9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 492, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f)
			.setRotationPoint(-49, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 441, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, 2, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 390, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49, 2, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 344, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -2, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -2, 0, 0.5f)
			.setRotationPoint(-51, 2, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 304, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -2, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(49, 2, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 285, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -2, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-51, 2, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 332, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(49, 2, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 471, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -13, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 373, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 15, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-48, -13, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 323, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 15, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-48, -13, 9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 424, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 15, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(40.25f, -13, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 407, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 15, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(40.25f, -13, 9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 228, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.5f, -13, 2.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 476, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 6, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0.75f, -1.5f, 0, 0.75f, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0.75f, -1.5f, 0, 0.75f)
			.setRotationPoint(-50.5f, -13, 3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 466, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0, -0.625f, 0)
			.setRotationPoint(-40.875f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 425, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -1, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, 0, -1, 0)
			.setRotationPoint(-41.75f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 420, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0, 0.125f, 0)
			.setRotationPoint(-48, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 410, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.125f, -1, 0, -0.125f, -1, 0, 0, -0.625f, 0)
			.setRotationPoint(-47.375f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 355, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0, -0.625f, 0)
			.setRotationPoint(-40.875f, -13, 9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 298, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -1, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, 0, -1, 0)
			.setRotationPoint(-41.75f, -13, 9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 232, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0, 0.125f, 0)
			.setRotationPoint(-48, -13, 9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 227, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.125f, -1, 0, -0.125f, -1, 0, 0, -0.625f, 0)
			.setRotationPoint(-47.375f, -13, 9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 222, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0, -0.625f, 0)
			.setRotationPoint(47.375f, -13, 9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 217, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -1, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, 0, -1, 0)
			.setRotationPoint(46.5f, -13, 9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 124, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0, 0.125f, 0)
			.setRotationPoint(40.25f, -13, 9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 461, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.125f, -1, 0, -0.125f, -1, 0, 0, -0.625f, 0)
			.setRotationPoint(40.875f, -13, 9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 435, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0, -0.625f, 0)
			.setRotationPoint(47.375f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 400, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -1, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, 0, 0, -1, 0)
			.setRotationPoint(46.5f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 380, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f, 0, 0, 0.125f, 0)
			.setRotationPoint(40.25f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 327, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.125f, -1, 0, -0.125f, -1, 0, 0, -0.625f, 0)
			.setRotationPoint(40.875f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 218, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.25f, -17.125f, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 280, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(46.5f, -13, -2.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 356, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f)
			.setRotationPoint(48, -13, 2.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 322, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(46.5f, -13, 2.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 217, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46.5f, -13, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 293, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 1, 0, 0, 0, 0, -1, 0, 0, -0.6675f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1, 0, 0, -0.6675f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(48, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 441, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 6, 0, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0.75f, -1.5f, 0, 0.75f, 0, 0, 0, 0, 0, 0, 1.5f, 0, 0.75f, -1.5f, 0, 0.75f)
			.setRotationPoint(48, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 395, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(40.25f, -14, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 294, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 1.5f, -0.125f, 0, -2, 0.625f, 0, -2, 0.625f, 0, 1.5f, -0.125f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -1.25f, 0)
			.setRotationPoint(49.75f, -14.75f, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 371, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(40.25f, -17.125f, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 326, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 1, 0, 0, -0.25f, 0.25f, 0.5f, -0.25f, 0.25f, 0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.25f, -14, 9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 138, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-47.5f, -13, -2.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 98, 1, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49, 2, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 266, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, -1.25f, 0, 0.5f, -1.25f, 0, 0, 0, 0, 0.25f, 0, 0, 0, 1, 0, 0, 1, 0, 0.25f, 0, 0)
			.setRotationPoint(45.25f, -16.625f, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 236, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.375f, -0.25f, 0, 0.375f, -0.25f)
			.setRotationPoint(-40.25f, -17.125f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 163, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0.625f, -0.25f, 0, 0.625f, -0.25f)
			.setRotationPoint(-40.25f, -16.75f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 130, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.5f, -1.25f, 0, 0, -1.375f, 0, 0.25f, -0.375f, 0, 0.25f, 0, 0, 0, 1, 0, -0.25f, 1.125f, -0.25f, 0.5f, 0.375f, -0.25f)
			.setRotationPoint(45.25f, -16.625f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 400, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 7, 0, 0, 0, 0, 0.5f, 0, 0, -1.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.75f, 0, 0, -1.25f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(40.25f, -14, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 117, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0.75f, -0.5f, 0, 0.5f, -1.25f, 0.375f, 0, -0.75f, 0.375f, 0, 0, 0.25f, 0.5f, 0.5f, 0.25f, 0.5f, 1, -0.25f, 0, 0.625f, -0.25f)
			.setRotationPoint(40.25f, -16.75f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 464, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, -0.375f, 0, 0.75f, -0.875f, 0, 0.75f, -0.875f, -3, 0, 0, 0, 0, 0.375f, -0.25f, 0.5f, 0.875f, -0.25f, 0.5f, 0.875f, -2.75f, 0, 0, 0)
			.setRotationPoint(40.25f, -17.125f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 104, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0.25f, -0.375f, 0, 0, -1.375f, 0, 0.5f, -1.25f, 0, 0, 0, 0, 0.5f, 0.375f, -0.25f, -0.25f, 1.125f, -0.25f, 0, 1, 0, 0.25f, 0, 0)
			.setRotationPoint(45.25f, -16.625f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 454, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 7, 0, 0, 0, -0.25f, -1.5f, 0, -0.25f, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1.25f, 0, 0, 0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(40.25f, -14, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 174, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 1.75f, -0.25f, -0.25f, -2.5f, 0.5f, 0, -2, 0.625f, 0, 1.5f, -0.125f, 0, 0.828125f, -1.25f, -0.25f, -0.828125f, -1.25f, 0, 0, -1.25f, 0, 0, -1.25f, 0)
			.setRotationPoint(49.75f, -14.75f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 91, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, -0.75f, -0.125f, 0.5f, -1.25f, -0.125f, 0.75f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0.625f, -0.75f, 0.5f, 1, -0.75f, 0.5f, 0.5f, 0.75f, 0, 0, 0.75f)
			.setRotationPoint(40.25f, -16.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 463, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 1.875f, -0.5f, -0.625f, -2.875f, 0.25f, 0, -2, 0.625f, 0.375f, 1.25f, -0.125f, 0.625f, 0.703125f, -1.375f, -0.25f, -0.984375f, -1.375f, 0, -0.328125f, -1.375f, 0.375f, 0.328125f, -1.375f, 0.625f)
			.setRotationPoint(49.25f, -14.625f, -8.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 163, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 1, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.25f, -14, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 218, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 3, 0, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.375f, -0.25f, 0.5f, 0.375f, -0.25f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.25f, -17.125f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 2, 1, 0, 0, 0.75f, -1.875f, 0.5f, 0.75f, -1.875f, 0.5f, -0.125f, 1.5f, 0, -0.125f, 1.5f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-40.25f, -15.25f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 2, 0, 0, -0.75f, -0.125f, 0.5f, -0.75f, -0.125f, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.625f, -0.75f, 0.5f, 0.625f, -0.75f, 0.5f, 0, 0.75f, 0, 0, 0.75f)
			.setRotationPoint(-40.25f, -16.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 390, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, -3, 0.75f, -0.875f, 0, 1, -0.5f, 0, 0, 0, 0, 0, 0, -3, 0.5f, 0.875f, -0.25f, 0.75f, 0.5f, 0, 0, 0, 0)
			.setRotationPoint(40.25f, -17.125f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 340, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, 0, 0.75f, -0.875f, -3, 0.75f, -0.875f, 0, 0, -0.375f, 0, 0, 0, 0, 0.5f, 0.875f, -2.75f, 0.5f, 0.875f, -0.25f, 0, 0.375f, -0.25f)
			.setRotationPoint(40.25f, -17.125f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 306, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, 0, 1, -0.5f, 0, 0.75f, -0.875f, 0, 0, 0, -3, 0, 0, 0, 0.75f, 0.5f, 0, 0.5f, 0.875f, -0.25f, 0, 0, -3)
			.setRotationPoint(40.25f, -17.125f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 362, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 6, 0, -0.25f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -14, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 483, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, 0)
			.setRotationPoint(-45.25f, -17.125f, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 247, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, -1.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -1.25f, 0, -0.5f, 1, 0, 0.75f, 0, 0, 0.75f, 0, 0, -0.5f, 1, 0)
			.setRotationPoint(-48.75f, -16.625f, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 78, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0.5f, -1.25f, 0, 0, 0, 0, 0.25f, -0.375f, 0, 0, -1.375f, 0, 0, 1, 0, 0.25f, 0, 0, 0.5f, 0.375f, -0.25f, -0.25f, 1.125f, -0.25f)
			.setRotationPoint(-48.25f, -16.625f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 419, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 7, 0, -0.25f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.25f, -2.25f, 0, 0.25f, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.5f, -2, 0, 0.5f)
			.setRotationPoint(-51, -14, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 450, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0.25f, -0.5f, 0, 0.5f, 0, 0, 0.5f, -0.75f, 0.375f, 0, -1.25f, 0.375f, 0, 0.5f, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0.625f, -0.25f, 0, 1, -0.25f)
			.setRotationPoint(-44.75f, -16.75f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 467, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, -0.875f, 0, 0.75f, -0.375f, 0, 0.75f, 0, 0, 0, -0.875f, -3, -0.25f, 0.875f, -0.25f, 0.75f, 0.375f, -0.25f, 0.75f, 0, 0, -0.25f, 0.875f, -2.75f)
			.setRotationPoint(-45, -17.125f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 65, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, -1.375f, 0, 0.25f, -0.375f, 0, 0, 0, 0, 0.5f, -1.25f, 0, -0.25f, 1.125f, -0.25f, 0.5f, 0.375f, -0.25f, 0.25f, 0, 0, 0, 1, 0)
			.setRotationPoint(-48.25f, -16.625f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 384, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 7, 0, -2.25f, 0, -0.25f, 0.75f, 0, -0.25f, 0.75f, 0, 0.5f, -0.25f, 0, 0.5f, -2, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-51, -14, -10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 366, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, -1.25f, -0.125f, 0.5f, -0.75f, -0.125f, 0.5f, 0, 0.5f, 0.25f, -0.5f, 0.5f, 0, 1, -0.75f, 0.5f, 0.625f, -0.75f, 0.5f, 0, 0.75f, 0, 0.5f, 0.75f)
			.setRotationPoint(-44.75f, -16.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 99, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.25f, -0.75f, -0.125f, -0.625f, -1.375f, -0.125f, -0.625f, -1.375f, -1.875f, 0, 0, 0.5f, 0.25f, 0.5f, -0.75f, -0.625f, 1.125f, -0.75f, -0.625f, 1.125f, -1.25f, 0.25f, 0, 0.75f)
			.setRotationPoint(45, -16.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 84, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0.25f, -1.875f, 0.5f, 0.75f, -1.875f, 0.5f, -0.125f, 1.5f, 0, -0.5f, 1.5f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0.234375f, 0, -0.75f, 0.375f)
			.setRotationPoint(-44.75f, -15.25f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 69, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, -2.5f, -0.625f, -1.375f, -0.125f, 0.25f, -1, 0.5f, 0, 0, 0.5f, 0.25f, 0, -2.75f, -0.625f, 1.125f, -0.75f, 0, 0.75f, 0.75f, 0.25f, 0, 0.75f)
			.setRotationPoint(45, -16.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 340, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, -0.875f, 0, 0.75f, 0, -3, 0.75f, 0, 0, 0.25f, -0.5f, 0, -0.25f, 0.875f, -0.25f, 0.75f, 0, -3, 0.75f, 0, 0, 0, 0.5f, 0)
			.setRotationPoint(-45, -17.125f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 294, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, -0.875f, -3, 0.75f, 0, 0, 0.75f, -0.375f, 0, 0, -0.875f, 0, -0.25f, 0.875f, -2.75f, 0.75f, 0, 0, 0.75f, 0.375f, -0.25f, -0.25f, 0.875f, -0.25f)
			.setRotationPoint(-45, -17.125f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 385, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -1.375f, 0.125f, 0, 0.375f, 0, 0, 0.375f, 0.125f, -2, -1.375f, 0.125f, -2, 0.515625f, -1.25f, 0, 0.375f, -1.25f, 0.625f, 0.375f, -1.25f, -0.125f, 0, -1.25f, -0.125f)
			.setRotationPoint(-48.75f, -14.75f, 8.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 492, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0.25f, -0.5f, 0, 0.75f, 0, 0, 0.75f, 0, -3, 0, -0.875f, 0, 0, 0.5f, 0, 0.75f, 0, 0, 0.75f, 0, -3, -0.25f, 0.875f, -0.25f)
			.setRotationPoint(-45, -17.125f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 54, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.625f, -1.375f, -2.375f, -0.625f, -1.375f, 0.375f, 0.25f, -0.75f, 0.375f, 0.25f, 0, 0.25f, -0.625f, 1.125f, -1.75f, -0.625f, 1.125f, -0.25f, 0.25f, 0.5f, -0.25f)
			.setRotationPoint(45, -16.25f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 39, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0.25f, -1, 0, -0.625f, -1.375f, 0.375f, 0, 0, -2, 0.25f, 0, 0.25f, 0, 0.75f, 0.25f, -0.625f, 1.125f, -0.25f, 0.25f, 0, -2.25f)
			.setRotationPoint(45, -16.25f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 24, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.625f, -1.375f, -0.125f, 0.25f, -0.75f, -0.125f, 0, 0, 0.5f, -0.625f, -1.375f, -1.875f, -0.625f, 1.125f, -0.75f, 0.25f, 0.5f, -0.75f, 0.25f, 0, 0.75f, -0.625f, 1.125f, -1.25f)
			.setRotationPoint(-48, -16.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 9, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.625f, -1.375f, -0.125f, 0, 0, -2.5f, 0, 0, 0.5f, 0.25f, -1, 0.5f, -0.625f, 1.125f, -0.75f, 0.25f, 0, -2.75f, 0.25f, 0, 0.75f, 0, 0.75f, 0.75f)
			.setRotationPoint(-48, -16.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 260, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, -0.625f, -1.375f, -2.375f, 0, 0, 0, 0.25f, -0.75f, 0.375f, -0.625f, -1.375f, 0.375f, -0.625f, 1.125f, -1.75f, 0.25f, 0, 0.25f, 0.25f, 0.5f, -0.25f, -0.625f, 1.125f, -0.25f)
			.setRotationPoint(-48, -16.25f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 241, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0.25f, -1, 0, 0, 0, 0, 0, 0, -2, -0.625f, -1.375f, 0.375f, 0, 0.75f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, -2.25f, -0.625f, 1.125f, -0.25f)
			.setRotationPoint(-48, -16.25f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 218, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 1, 5, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-40.25f, -18, -2.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 222, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(-39.625f, -17.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 203, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(-29.625f, -17.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 184, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(-22.5f, -17.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 165, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(-17.5f, -17.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 146, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(29.125f, -17.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 127, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(39.125f, -17.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 108, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(16.75f, -17.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 89, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(21.75f, -17.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 70, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(6.75f, -17.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 51, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(-7.5f, -17.5f, -2.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 253, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(39.125f, -19.125f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 248, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-39.625f, -19.125f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 243, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(39.125f, -19.125f, -0.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 238, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-39.625f, -19.125f, 0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 166, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(39.125f, -19.125f, 0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 161, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.5f, 0.125f, 0, -0.5f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(-39.625f, -19.125f, -0.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 159, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(18.25f, -18.25f, -1.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 379, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(-21, -18.25f, -1.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 156, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(19, -18.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 151, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-20.25f, -18.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 334, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(19, -19, -1).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 273, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-20.25f, -19, -1).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 446, 0, textureX, textureY)
			.addShapeBox(0.375f, -0.125f, 0, 29, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(20.875f, -18.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 385, 0, textureX, textureY)
			.addShapeBox(-29.375f, -0.125f, 0, 29, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21.125f, -18.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 119, 83, textureX, textureY)
			.addShapeBox(-0.5f, -0.25f, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(20.875f, -18.75f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 114, 83, textureX, textureY)
			.addShapeBox(-0.375f, -0.25f, 0, 1, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.125f, -0.5f, 0, -0.125f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21.125f, -18.75f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 109, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(20, -18.9375f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 90, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(20, -18.9375f, 0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 85, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-21.375f, -18.9375f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 71, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-21.375f, -18.9375f, 0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 30, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(20.75f, -18.875f, 0.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 456, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(20.75f, -18.875f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 430, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-21.25f, -18.875f, 0.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 375, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-21.25f, -18.875f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 370, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.625f, -0.625f, 0, 0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(17.375f, -18.9375f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 351, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.625f, -0.625f, 0, 0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(17.375f, -18.9375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 346, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.625f, -0.625f, 0, 0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-19.25f, -18.9375f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 341, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.625f, -0.625f, 0, 0.625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-19.25f, -18.9375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 317, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(17.5f, -18.9375f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 312, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-18.125f, -18.9375f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 307, 82, textureX, textureY)
			.addShapeBox(28.625f, -0.125f, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(20.875f, -18.75f, -0.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 302, 82, textureX, textureY)
			.addShapeBox(28.625f, -0.125f, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(20.875f, -18.75f, 0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 273, 82, textureX, textureY)
			.addShapeBox(-30.125f, -0.125f, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21.125f, -18.75f, -0.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 268, 82, textureX, textureY)
			.addShapeBox(-30.125f, -0.125f, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-21.125f, -18.75f, 0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 263, 82, textureX, textureY)
			.addShapeBox(29.5f, -0.5625f, 0, 1, 1, 1, 0, -0.15625f, -0.15625f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.15625f, -0.15625f, -0.75f, 0, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(20.875f, -18.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 258, 82, textureX, textureY)
			.addShapeBox(30.0625f, -0.5625f, 0, 1, 1, 1, 0, 0, 0, 0, -0.5937f, -0.15625f, 0, -0.5937f, -0.15625f, -0.75f, 0, 0, -0.75f, 0, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(20.875f, -18.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 133, 82, textureX, textureY)
			.addShapeBox(29.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, 0, 0, -0.75f, -0.15625f, -0.5938f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.15625f, -0.5938f, -0.75f)
			.setRotationPoint(20.875f, -18.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 128, 82, textureX, textureY)
			.addShapeBox(30.0625f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.4375f, 0, -0.5937f, -0.5938f, 0, -0.5937f, -0.5938f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(20.875f, -18.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 66, 82, textureX, textureY)
			.addShapeBox(-30.625f, -0.5625f, 0, 1, 1, 1, 0, -0.15625f, -0.15625f, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, -0.15625f, -0.15625f, -0.75f, 0, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(-21.125f, -18.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 50, 82, textureX, textureY)
			.addShapeBox(-30.0625f, -0.5625f, 0, 1, 1, 1, 0, 0, 0, 0, -0.5937f, -0.15625f, 0, -0.5937f, -0.15625f, -0.75f, 0, 0, -0.75f, 0, -0.4375f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(-21.125f, -18.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 45, 82, textureX, textureY)
			.addShapeBox(-30.625f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, 0, 0, -0.75f, -0.15625f, -0.5938f, 0, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f, -0.75f, -0.15625f, -0.5938f, -0.75f)
			.setRotationPoint(-21.125f, -18.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 40, 82, textureX, textureY)
			.addShapeBox(-30.0625f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, 0, 0, -0.75f, 0, -0.4375f, 0, -0.5937f, -0.5938f, 0, -0.5937f, -0.5938f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(-21.125f, -18.75f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 253, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, 0.0938f, 0.5f, 0, 0.0938f, 0.5f)
			.setRotationPoint(-1.0625f, -17.375f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 246, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, 0.0938f, 0.5f, 0, 0.0938f, 0.5f)
			.setRotationPoint(11.625f, -17.375f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 239, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, 0.0938f, 0.5f, 0, 0.0938f, 0.5f)
			.setRotationPoint(28.5f, -17.375f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 165, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, 0.0938f, 0.5f, 0, 0.0938f, 0.5f)
			.setRotationPoint(-13.75f, -17.375f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 158, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, 0.0938f, 0.5f, 0, 0.0938f, 0.5f)
			.setRotationPoint(-30.625f, -17.375f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 151, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.21880001f, 0, 0.125f, -0.2188f, 0, 0.125f, 0.2812f, 0.5f, 0, 0.2812f, 0.5f)
			.setRotationPoint(39.625f, -17.375f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 125, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0.125f, -0.5f, 0, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, -0.21880001f, 0, 0.125f, -0.2188f, 0, 0.125f, 0.2812f, 0.5f, 0, 0.2812f, 0.5f)
			.setRotationPoint(-41.75f, -17.375f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 118, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(-1.0625f, -17.375f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 111, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(11.625f, -17.375f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 92, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(28.5f, -17.375f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 85, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(-13.75f, -17.375f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(-30.625f, -17.375f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 456, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(-41.75f, -17.375f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 349, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(39.625f, -17.375f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 26, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0.0938f, 0, 0.125f, 0.0938f, 0, 0.125f, -0.375f, 0.5f, 0, -0.375f, 0.5f)
			.setRotationPoint(-1.0625f, -17.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 19, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0.0938f, 0, 0.125f, 0.0938f, 0, 0.125f, -0.375f, 0.5f, 0, -0.375f, 0.5f)
			.setRotationPoint(11.625f, -17.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 12, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0.0938f, 0, 0.125f, 0.0938f, 0, 0.125f, -0.375f, 0.5f, 0, -0.375f, 0.5f)
			.setRotationPoint(28.5f, -17.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 469, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0.0938f, 0, 0.125f, 0.0938f, 0, 0.125f, -0.375f, 0.5f, 0, -0.375f, 0.5f)
			.setRotationPoint(-13.75f, -17.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 399, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0.0938f, 0, 0.125f, 0.0938f, 0, 0.125f, -0.375f, 0.5f, 0, -0.375f, 0.5f)
			.setRotationPoint(-30.625f, -17.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 380, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0.2812f, 0, 0.125f, 0.2812f, 0, 0.125f, -0.2188f, 0.5f, 0, -0.2188f, 0.5f)
			.setRotationPoint(39.625f, -17.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 373, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0.2812f, 0, 0.125f, 0.2812f, 0, 0.125f, -0.2188f, 0.5f, 0, -0.2188f, 0.5f)
			.setRotationPoint(-41.75f, -17.375f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 329, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(-1.0625f, -17.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 322, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(11.625f, -17.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 300, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(28.5f, -17.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 293, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(-13.75f, -17.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 130, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(-30.625f, -17.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 288, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(-41.75f, -17.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 461, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.625f, 0, 0, 0.625f, 0, 0.375f, 0, 0.125f, 0.375f, 0, 0.125f, 0.375f, 0.625f, 0, 0.375f, 0.625f)
			.setRotationPoint(39.625f, -17.375f, -9.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 206, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(-40.25f, -13.75f, 5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 195, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(-40.25f, -13.75f, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 184, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(39.25f, -13.75f, 5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 173, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(39.25f, -13.75f, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 35, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-40.25f, -13.75f, -9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 25, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(39.25f, -13.75f, -9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 20, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-40.25f, -13.75f, 9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 15, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(39.25f, -13.75f, 9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 104, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0.25f, -1.875f, 0.625f, -1.25f, 0, 0.625f, -1.25f, 0.375f, 0, -0.5f, 1.5f, 0, -1.75f, 0, 0.625f, -1.75f, 0, 0.625f, -1.75f, 0.375f, 0, -1.75f, 0.375f)
			.setRotationPoint(44.75f, -15.25f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 79, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-40.25f, -13.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 72, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-40.25f, -13.75f, 1.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 269, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(39.25f, -13.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 254, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(39.25f, -13.75f, 1.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 10, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-40.25f, -13.375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 496, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-40.25f, -13.375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 491, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(39.25f, -13.375f, -4.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 470, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(39.25f, -13.375f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 465, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-40.25f, -12.75f, -5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 425, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-40.25f, -12.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 420, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(39.25f, -12.75f, -5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 410, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(39.25f, -12.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 144, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-40.25f, -13.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 348, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(39.25f, -13.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 344, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0.5f, 0, 0.375f, 0.5f)
			.setRotationPoint(39.25f, -15.125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 476, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0.5f, 0, 0.375f, 0.5f)
			.setRotationPoint(-40.25f, -15.125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 446, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f)
			.setRotationPoint(39.25f, -15.75f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 401, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.5f, 0, -0.375f, 0.5f)
			.setRotationPoint(-40.25f, -15.75f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 285, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(39.25f, -16.125f, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 452, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-40.25f, -16.125f, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 428, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-39.25f, -4, 8.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 326, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-39.25f, -4, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 453, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(26.25f, -4, 8.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 482, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(26.25f, -4, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 326, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-39.25f, -0.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 432, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-39.25f, -0.5f, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 465, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(26.25f, -0.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 468, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(26.25f, -0.5f, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 405, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.5f, -4, 9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 395, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-32.5f, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 386, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(32, -4, 9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 365, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(32, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 65, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-26.75f, 0, 6.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 58, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-38.75f, 0, 6.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 51, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-26.75f, 0, -8.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 44, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-38.75f, 0, -8.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 37, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(38.75f, 0, 6.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 434, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(26.75f, 0, 6.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 427, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(38.75f, 0, -8.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 420, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(26.75f, 0, -8.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 228, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-1.75f, -0.5f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 209, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-7.5f, -0.5f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 190, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-13.25f, -0.5f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 171, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-19, -0.5f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 152, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-24.75f, -0.5f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 133, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(4, -0.5f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 114, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(9.75f, -0.5f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 95, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(15.5f, -0.5f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 76, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(21.25f, -0.5f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 57, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-1.75f, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 38, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-7.5f, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 19, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-13.25f, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-19, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 388, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-24.75f, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 320, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(4, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 428, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(9.75f, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 415, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(15.5f, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 6, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(21.25f, -0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 270, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-1.75f, -4, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 255, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-7.5f, -4, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 240, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-13.25f, -4, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 225, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-19, -4, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 210, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-24.75f, -4, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 195, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(4, -4, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 180, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(9.75f, -4, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 165, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(15.5f, -4, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 150, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(21.25f, -4, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 135, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-1.75f, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 120, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-7.5f, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 105, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-13.25f, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 90, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-24.75f, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 75, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(4, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 60, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(9.75f, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 45, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(15.5f, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 30, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(21.25f, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 15, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-19, -4, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 413, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(22, 0, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 406, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(22, 0, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 123, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(16.25f, 0, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 116, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(16.25f, 0, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 97, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(10.5f, 0, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 90, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(10.5f, 0, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 463, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(4.75f, 0, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 456, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(4.75f, 0, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 399, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-1, 0, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 275, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-1, 0, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 202, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-6.75f, 0, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 191, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-6.75f, 0, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 180, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-12.5f, 0, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 169, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-12.5f, 0, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 158, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.25f, 0, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 146, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-18.25f, 0, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 22, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-24, 0, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 303, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-24, 0, -3.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 360, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(48.75f, -5, 4.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 336, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(50, -5, -5.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 95, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-51, -5, 4.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 415, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-49.75f, -5, -5.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 400, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(49.75f, -4.75f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 381, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(49.75f, -3.75f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 331, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(49.75f, -2.75f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 326, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(49.75f, -1.75f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 321, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(51, -4.75f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 298, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(51, -3.75f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 293, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(51, -2.75f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 254, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(51, -1.75f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 249, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-51.125f, -4.75f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 244, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-51.125f, -3.75f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 239, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-51.125f, -2.75f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 166, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-51.125f, -1.75f, 4.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 161, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-49.875f, -4.75f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 156, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-49.875f, -3.75f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 151, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-49.875f, -2.75f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 124, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-49.875f, -1.75f, -5.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 239, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-40.25f, -13.75f, 1.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 224, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(39.25f, -13.75f, 1.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 209, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-40.25f, -13.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 194, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(39.25f, -13.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 119, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40.25f, -13.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 114, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39.25f, -13.75f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 109, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-40.25f, -13.75f, -4.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 90, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(39.25f, -13.75f, -4.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 85, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f)
			.setRotationPoint(-40.25f, -13.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 75, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f)
			.setRotationPoint(39.25f, -13.75f, 4.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 70, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-40.25f, -13.75f, -5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 31, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(39.25f, -13.75f, -5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 5, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0.25f, 0, 0.5f, 0.25f)
			.setRotationPoint(47, -4.5f, -5.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0.25f, 0, 0.5f, 0.25f)
			.setRotationPoint(-48.25f, -4.5f, 4).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 391, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(47.5f, -5, -4.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 376, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-47.75f, -5, 4.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 371, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(47.5f, -5.25f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 350, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(-47.75f, -5.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 345, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(47.5f, -5.625f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 340, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-47.75f, -5.625f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 275, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(47.375f, -4.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 270, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-48.375f, -4.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 104, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(47.625f, -3, -8.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 80, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(47.875f, -3, -7.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 61, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-48.125f, -3, 7.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 56, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-47.875f, -3, 8.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 51, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(47.5f, -4.75f, -8.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 46, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(-48.25f, -4.75f, 7.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 41, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, -0.625f, 0.25f, 0, -0.625f, 0.25f, -0.625f, 0, 0.25f, -0.625f)
			.setRotationPoint(47.6875f, -6, -8.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 36, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.25f, 0, -0.625f, 0.25f, 0, -0.625f, 0.25f, -0.625f, 0, 0.25f, -0.625f)
			.setRotationPoint(-48.0625f, -6, 7.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 26, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.125f, 0, -0.75f, 0.125f)
			.setRotationPoint(47.75f, -5.75f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 21, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.125f, 0, -0.75f, 0.125f)
			.setRotationPoint(-48, -5.75f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 16, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46.5f, -5, 4).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 11, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.5f, -5, -5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 506, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(46.875f, -4, 4.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 501, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(-47.125f, -4, -4.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 496, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(46.5f, 1.75f, 4).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 491, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-47.5f, 1.75f, -5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 470, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(46.75f, -5.5f, 4.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 465, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-47.25f, -5.5f, -4.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 460, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(46.875f, -5, 5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 434, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-47.125f, -5, -5.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 435, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, 3, -10).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 429, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(-36.25f, 3, -0.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 424, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f)
			.setRotationPoint(34.75f, 3, -0.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 162, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(6, 3, -9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 151, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(10.5f, 3, -9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 52, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5f, 3.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 39, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5f, 3.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 476, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(6.5f, 5.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 279, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5f, 5.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 349, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(6, 5.5f, -9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 8, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(10.5f, 5.5f, -9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 485, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(6, 5.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 284, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(10.5f, 5.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 390, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 3, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 340, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.75f, 3, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 326, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-11.75f, 3, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 387, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-11.75f, 3, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 362, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-11.75f, 4.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 482, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-11.75f, 4.5f, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 419, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-13, 3, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 411, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-13, 3, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 406, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-13, 4.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 396, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-13, 4.5f, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 386, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-0.5f, 3, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 366, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-0.5f, 3, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 361, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-0.5f, 4.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 66, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-0.5f, 4.5f, -9).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 460, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22.5f, 3, -6.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 266, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 3, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 257, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.75f, 3, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 248, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9, 3, 2).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 239, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.75f, 3, 2).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 457, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-11.75f, 3, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 465, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-11.75f, 3, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 403, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-11.75f, 4.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 382, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-11.75f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 401, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-13, 3, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 381, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-13, 3, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 336, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-13, 4.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 331, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-13, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 254, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-0.5f, 3, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 249, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-0.5f, 3, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 244, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-0.5f, 4.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 239, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-0.5f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 388, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-8.75f, 3, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 362, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-8.75f, 3, 2).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 389, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-8.75f, 4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 489, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-8.75f, 4.5f, 2).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 166, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-10, 3, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 161, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-10, 3, 2).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 156, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-10, 4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 151, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-10, 4.5f, 2).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 124, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-3.5f, 3, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 119, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-3.5f, 3, 2).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 114, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-3.5f, 4.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 109, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-3.5f, 4.5f, 2).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 91, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.4375f, -0.1875f, -0.25f, -0.4375f, -0.1875f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(49, -0.4375f, 3.3125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 86, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, -0.25f, -0.1875f, -0.1875f, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(49, -1.1875f, 3.3125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(49, -1.1875f, 4.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 456, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f)
			.setRotationPoint(49, -0.4375f, 4.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 351, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.4375f, -0.1875f, -0.25f, -0.4375f, -0.1875f, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-49.75f, -0.4375f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 346, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, -0.25f, -0.1875f, -0.1875f, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-49.75f, -1.1875f, -4.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 275, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, -0.4375f, 0, -0.1875f, -0.4375f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-49.75f, -1.1875f, -4.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 270, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.4375f, -0.4375f, 0, -0.4375f, -0.4375f)
			.setRotationPoint(-49.75f, -0.4375f, -4.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 26, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6, 5, 5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 13, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5f, 5, 5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 297, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11, 5, 5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 447, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.5f, 5, 5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 412, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 5, 5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 422, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(6, 3, 5).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 482, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(21.5f, 3, 1.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 465, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(19.5f, 3, 1.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-19.5f, 3, 2).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 104, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.3125f, -0.1875f, -0.25f, -0.3125f, -0.1875f, -0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(49.03125f, -16.0625f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 81, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, -0.25f, -0.1875f, -0.1875f, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(49.03125f, -16.9375f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 62, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(49.03125f, -16.9375f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 57, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(49.03125f, -16.0625f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 52, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.3125f, -0.1875f, -0.25f, -0.3125f, -0.1875f, -0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-49.78125f, -16.0625f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 47, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, -0.25f, -0.1875f, -0.1875f, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-49.78125f, -16.9375f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 42, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.1875f, -0.3125f, 0, -0.1875f, -0.3125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-49.78125f, -16.9375f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 37, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(-49.78125f, -16.0625f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 27, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.72f, 0, 0, -0.72f, 0, -0.125f, 0, 0, -0.125f, 0, -0.3125f, 0, -0.72f, -0.1125f, 0, -0.72f, -0.1125f, -0.125f, 0, -0.3125f, -0.125f)
			.setRotationPoint(48.75f, -16.0625f, -0.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 22, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.72f, 0, 0, -0.72f, 0, -0.125f, 0, 0, -0.125f, 0, -0.1125f, 0, -0.72f, -0.3125f, 0, -0.72f, -0.3125f, -0.125f, 0, -0.1125f, -0.125f)
			.setRotationPoint(-49.03125f, -16.0625f, -0.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 17, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.125f, -0.875f, -0.5f, -0.125f, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(49.78125f, -16.0625f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 12, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, -0.875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(49.78125f, -16.6875f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 470, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(49.78125f, -16.6875f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 435, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(49.78125f, -16.0625f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 430, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.5f, -0.125f, -0.875f, -0.5f, -0.125f, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-49.90625f, -16.0625f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 425, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.875f, -0.125f, -0.125f, -0.875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-49.90625f, -16.6875f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 420, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.125f, -0.5f, 0, -0.125f, -0.5f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-49.90625f, -16.6875f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 397, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.875f, -0.375f, 0, -0.875f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-49.90625f, -16.0625f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 392, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.0625f, 0.375f, -0.75f, 0.1094f, 0.375f, -0.75f, 0.1094f, -1.125f, 0, -0.0625f, -1.125f)
			.setRotationPoint(49.28125f, -16.953125f, -1.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 376, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.125f, 0, 0, 0.125f, 0, 0, -0.0625f, -1.125f, -0.75f, 0.1094f, -1.125f, -0.75f, 0.1094f, 0.375f, 0, -0.0625f, 0.375f)
			.setRotationPoint(49.28125f, -16.953125f, 0.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 371, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0.125f, 0, 0, 0.125f, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.1094f, 0.375f, 0, -0.0625f, 0.375f, 0, -0.0625f, -1.125f, -0.75f, 0.1094f, -1.125f)
			.setRotationPoint(-50.2812f, -16.953125f, -1.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 341, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, -0.75f, 0.125f, 0, -0.75f, 0.1094f, -1.125f, 0, -0.0625f, -1.125f, 0, -0.0625f, 0.375f, -0.75f, 0.1094f, 0.375f)
			.setRotationPoint(-50.2812f, -16.953125f, 0.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 111, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(49.28125f, -17.453125f, -1.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 470, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.625f, 0, -0.75f, -0.625f, 0, -0.75f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-49.53125f, -17.453125f, -1.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 263, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, 0, -1.125f, 0, 0, -1.125f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(49.28125f, -17.453125f, 1.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 254, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, 0, -1.125f, 0, 0, -1.125f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-49.53125f, -17.453125f, 1.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 245, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.75f, 0, -0.75f, 0.75f)
			.setRotationPoint(49.28125f, -17.453125f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 295, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0, 0.875f, 0, 0, 0.875f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.75f, 0, -0.75f, 0.75f)
			.setRotationPoint(-49.53125f, -17.453125f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 75, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.125f, -0.375f, 0, -0.125f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(-0.625f, -15.625f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 476, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.125f, -0.375f, 0, -0.125f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(12.0625f, -15.625f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 402, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.125f, -0.375f, 0, -0.125f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(28.9375f, -15.625f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 279, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.125f, -0.375f, 0, -0.125f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(-13.3125f, -15.625f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 401, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.125f, -0.375f, 0, -0.125f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0.25f, 0, -0.5f, 0.25f)
			.setRotationPoint(-30.1875f, -15.625f, -0.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 326, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(45.875f, 3, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 321, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(48, 3, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 298, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(45.875f, 3, 9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 293, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(48, 3, 9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 76, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(-48.25f, 3, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 71, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(-46.125f, 3, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 32, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(-48.25f, 3, 9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 415, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.125f, 0, -0.75f, -0.125f, 0, -0.75f, -0.125f, -0.5f, 0, -0.125f, -0.5f)
			.setRotationPoint(-46.125f, 3, 9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 279, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(46.125f, 4, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 366, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(46.125f, 4, 9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 316, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-48, 4, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 32, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-48, 4, 9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 13, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(45.875f, 5.875f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 460, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(45.875f, 5.875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 450, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-48.25f, 5.875f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 415, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-48.25f, 5.875f, 9.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 32, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46.5f, 3.875f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 13, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(45.5f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 479, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.5f, 3.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 410, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50.5f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 405, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(52.5f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 366, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(50.5f, 3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 401, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.5f, 3.875f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 401, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-49.5f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 482, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-53.5f, 3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 361, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 317, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.5f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, 3.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 328, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 80, 2, 1, 0, 0, -0.125f, 1.5f, 0.5f, -0.125f, 1.5f, 0.5f, 0.75f, -1.875f, 0, 0.75f, -1.875f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-40.25f, -15.25f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 390, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0.5f, 0, 0.375f, 0.5f)
			.setRotationPoint(39.25f, -15.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 180, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.375f, 0.5f, 0, -1.375f, 0.5f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0.5f, 0, 0.375f, 0.5f)
			.setRotationPoint(39.25f, -15.125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 135, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0.5f, 0, 0.375f, 0.5f)
			.setRotationPoint(-40.25f, -15.125f, -9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 120, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1.375f, 0.5f, 0, -1.375f, 0.5f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0.5f, 0, 0.375f, 0.5f)
			.setRotationPoint(-40.25f, -15.125f, 7.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 264, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(39.25f, -15.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 249, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(39.25f, -15.75f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 234, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-40.25f, -15.75f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 219, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-40.25f, -15.75f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 204, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -2.75f, 0, 0, -2.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.75f, 0, -0.625f, 0.75f)
			.setRotationPoint(39.25f, -16.125f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 189, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.75f, 0, -0.375f, 0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.75f, 0, -0.625f, 0.75f)
			.setRotationPoint(39.25f, -16.125f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 344, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -2.75f, 0, 0, -2.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.75f, 0, -0.625f, 0.75f)
			.setRotationPoint(-40.25f, -16.125f, -5.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 494, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0.75f, 0, -0.375f, 0.75f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.75f, 0, -0.625f, 0.75f)
			.setRotationPoint(-40.25f, -16.125f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 500, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -0.5f, 1.5f, 0.5f, -0.125f, 1.5f, 0.5f, 0.75f, -1.875f, 0, 0.25f, -1.875f, 0, -0.75f, 0.375f, 0.5f, -0.75f, 0.234375f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-44.75f, -15.25f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 389, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0.75f, -1.875f, 0.5f, 0.25f, -1.875f, 0.5f, -0.5f, 1.5f, 0, -0.125f, 1.5f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0.375f, 0, -0.75f, 0.234375f)
			.setRotationPoint(40.25f, -15.25f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 428, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -0.125f, 1.5f, 0.5f, -0.5f, 1.5f, 0.5f, 0.25f, -1.875f, 0, 0.75f, -1.875f, 0, -0.75f, 0.234375f, 0.5f, -0.75f, 0.375f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(40.25f, -15.25f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 129, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 1.5f, -0.125f, 0, -2, 0.625f, 0, -2.5f, 0.5f, 0, 1.75f, -0.25f, -0.25f, 0, -1.25f, 0, 0, -1.25f, 0, -0.828125f, -1.25f, 0, 0.828125f, -1.25f, -0.25f)
			.setRotationPoint(49.75f, -14.75f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 356, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 1.25f, -0.125f, 0.25f, -2, 0.625f, 0, -2.875f, 0.25f, 0.375f, 1.875f, -0.5f, -0.25f, 0.328125f, -1.375f, 0.25f, -0.328125f, -1.375f, 0, -0.984375f, -1.375f, 0.375f, 0.703125f, -1.375f, 0.125f)
			.setRotationPoint(49.25f, -14.625f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -2, 0.625f, 0, 1.5f, -0.125f, 0, 1.5f, -0.125f, 0, -2, 0.625f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0, -1.25f, 0)
			.setRotationPoint(-50.75f, -14.75f, -3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 114, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -2.5f, 0.5f, 0, 1.75f, -0.25f, -0.25f, 1.5f, -0.125f, 0, -2, 0.625f, 0, -0.828125f, -1.25f, 0, 0.828125f, -1.25f, -0.25f, 0, -1.25f, 0, 0, -1.25f, 0)
			.setRotationPoint(-50.75f, -14.75f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 504, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -2.875f, 0.25f, 0, 1.875f, -0.5f, -0.625f, 1.25f, -0.125f, 0.625f, -2, 0.625f, 0.375f, -0.984375f, -1.375f, 0, 0.703125f, -1.375f, -0.25f, 0.328125f, -1.375f, 0.625f, -0.328125f, -1.375f, 0.375f)
			.setRotationPoint(-50.25f, -14.625f, -8.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 502, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -2, 0.625f, 0, 1.5f, -0.125f, 0, 1.75f, -0.25f, -0.25f, -2.5f, 0.5f, 0, 0, -1.25f, 0, 0, -1.25f, 0, 0.828125f, -1.25f, -0.25f, -0.828125f, -1.25f, 0)
			.setRotationPoint(-50.75f, -14.75f, 3).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 450, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -2, 0.625f, 0, 1.25f, -0.125f, 0.25f, 1.875f, -0.5f, -0.25f, -2.875f, 0.25f, 0.375f, -0.328125f, -1.375f, 0, 0.328125f, -1.375f, 0.25f, 0.703125f, -1.375f, 0.125f, -0.984375f, -1.375f, 0.375f)
			.setRotationPoint(-50.25f, -14.625f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 318, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1.375f, 0.125f, -1.875f, 0.375f, 0.125f, -1.875f, 0.375f, 0, 0.875f, -1.375f, 0.125f, 0.875f, 0, -1.25f, 0, 0.375f, -1.25f, 0, 0.375f, -1.25f, 1.5f, 0.515625f, -1.25f, 0.875f)
			.setRotationPoint(-48.75f, -14.75f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 504, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0.375f, 0, 0, -1.375f, 0.125f, 0, -1.375f, 0.125f, -2, 0.375f, 0.125f, -2, 0.375f, -1.25f, 0.625f, 0.515625f, -1.25f, 0, 0, -1.25f, -0.125f, 0.375f, -1.25f, -0.125f)
			.setRotationPoint(47.75f, -14.75f, 8.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 441, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.375f, 0.125f, -1.875f, -1.375f, 0.125f, -1.875f, -1.375f, 0.125f, 0.875f, 0.375f, 0, 0.875f, 0.375f, -1.25f, 0, 0, -1.25f, 0, 0.515625f, -1.25f, 0.875f, 0.375f, -1.25f, 1.5f)
			.setRotationPoint(47.75f, -14.75f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 428, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, -1.875f, 0.625f, -0.375f, -1.875f, 0.625f, -1.125f, 1.5f, 0, -0.5f, 1.5f, 0, -1.25f, -1.875f, 0.625f, 0.25f, 0, 0.625f, 0.25f, 0.375f, 0, -0.5f, 1.5f)
			.setRotationPoint(44.75f, -15.25f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 494, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -0.5f, 1.5f, 0.625f, -1.25f, 0.375f, 0.625f, -1.25f, 0, 0, 0.25f, -1.875f, 0, -1.75f, 0.375f, 0.625f, -1.75f, 0.375f, 0.625f, -1.75f, 0, 0, -1.75f, 0)
			.setRotationPoint(44.75f, -15.25f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 464, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 1.5f, 0.625f, -1.125f, 1.5f, 0.625f, -0.375f, -1.875f, 0, 0.25f, -1.875f, 0, -0.5f, 1.5f, 0.625f, 0.25f, 0.375f, 0.625f, 0.25f, 0, 0, -1.25f, -1.875f)
			.setRotationPoint(44.75f, -15.25f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 504, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -1.25f, 0, 0.625f, 0.25f, -1.875f, 0.625f, -0.5f, 1.5f, 0, -1.25f, 0.375f, 0, -1.75f, 0, 0.625f, -1.75f, 0, 0.625f, -1.75f, 0.375f, 0, -1.75f, 0.375f)
			.setRotationPoint(-47.375f, -15.25f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 14, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.375f, -1.875f, 0.625f, 0.25f, -1.875f, 0.625f, -0.5f, 1.5f, 0, -1.125f, 1.5f, 0, 0.25f, 0, 0.625f, -1.25f, -1.875f, 0.625f, -0.5f, 1.5f, 0, 0.25f, 0.375f)
			.setRotationPoint(-47.375f, -15.25f, -10.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 505, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, -1.25f, 0.375f, 0.625f, -0.5f, 1.5f, 0.625f, 0.25f, -1.875f, 0, -1.25f, 0, 0, -1.75f, 0.375f, 0.625f, -1.75f, 0.375f, 0.625f, -1.75f, 0, 0, -1.75f, 0)
			.setRotationPoint(-47.375f, -15.25f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1.125f, 1.5f, 0.625f, -0.5f, 1.5f, 0.625f, 0.25f, -1.875f, 0, -0.375f, -1.875f, 0, 0.25f, 0.375f, 0.625f, -0.5f, 1.5f, 0.625f, -1.25f, -1.875f, 0, 0.25f, 0)
			.setRotationPoint(-47.375f, -15.25f, 9.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 356, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(48.375f, -7.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 316, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(39.625f, -7.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 311, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(-39.875f, -7.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 306, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(-48.625f, -7.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 265, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(48.375f, -7.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 260, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(39.625f, -7.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 132, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(-39.875f, -7.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 99, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(-48.625f, -7.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 440, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(49, -6.25f, 3.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 494, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(49, -10.875f, 3.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 309, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(49, -10.625f, 3.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 7, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(48.625f, -9.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 441, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(50.125f, -9.5f, -2.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-50.375f, -9.5f, 2.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 452, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.75f, 0, 0.25f, -0.75f)
			.setRotationPoint(-48.875f, -9.5f, -2.75f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 494, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-49.25f, -6.25f, -10.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 495, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-49.25f, -10.875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-49.25f, -10.625f, -9.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 401, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(47.75f, -2.125f, -1.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 390, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(47.75f, -3.375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 441, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(47.75f, -3.375f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 39, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f)
			.setRotationPoint(47.75f, -2.125f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 20, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.0625f, -0.3125f, 0, -0.0625f, -0.3125f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(-48.75f, -2.125f, -1.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(-48.75f, -3.375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 306, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, -0.0625f, 0, -0.3125f, -0.0625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(-48.75f, -3.375f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 229, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.0625f, -0.0625f, 0, -0.0625f, -0.0625f)
			.setRotationPoint(-48.75f, -2.125f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 210, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(48.75f, -2.125f, -1).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 191, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(48.75f, -3.125f, -1).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 172, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(48.75f, -3.125f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 422, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(48.75f, -2.125f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 333, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.875f, -2.125f, -1).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 153, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.875f, -3.125f, -1).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 134, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.875f, -3.125f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 115, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-48.875f, -2.125f, 0).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 13, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, 0, 0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.75f, 0, -0.75f, 0.75f)
			.setRotationPoint(47.5f, -3.125f, -1.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 505, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, 0, 0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.75f, 0, -0.75f, 0.75f)
			.setRotationPoint(47.5f, -1.375f, -1.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 14, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, 0, 0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.75f, 0, -0.75f, 0.75f)
			.setRotationPoint(-47.75f, -3.125f, -1.375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.75f, 0, 0, 0.75f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.75f, 0, -0.75f, 0.75f)
			.setRotationPoint(-47.75f, -1.375f, -1.375f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(Fixed);
		//
		TurboList marker_lights = new TurboList("marker_lights");
		marker_lights.add(new ModelRendererTurbo(marker_lights, 96, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(51.125f, -4.6875f, -5.5625f).setRotationAngle(0, 0, 0).setName("top red marker light front 0")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 77, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(51.125f, -3.6875f, -5.5625f).setRotationAngle(0, 0, 0).setName("lower red marker light front 0")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 58, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(51.125f, -2.6875f, -5.5625f).setRotationAngle(0, 0, 0).setName("white marker light front 0")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 0, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(51.125f, -1.6875f, -5.5625f).setRotationAngle(0, 0, 0).setName("green marker light front 0")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 441, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(49.875f, -4.6875f, 4.9375f).setRotationAngle(0, 0, 0).setName("top red marker light front 1")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 388, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(49.875f, -3.6875f, 4.9375f).setRotationAngle(0, 0, 0).setName("lower red marker light front 1")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 333, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(49.875f, -2.6875f, 4.9375f).setRotationAngle(0, 0, 0).setName("white marker light front 1")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 441, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(49.875f, -1.6875f, 4.9375f).setRotationAngle(0, 0, 0).setName("green marker light front 1")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 428, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-49.9375f, -4.6875f, -5.5625f).setRotationAngle(0, 0, 0).setName("top red marker light rear 0")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 415, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-49.9375f, -3.6875f, -5.5625f).setRotationAngle(0, 0, 0).setName("lower red marker light rear 0")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 354, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-49.9375f, -2.6875f, -5.5625f).setRotationAngle(0, 0, 0).setName("white marker light rear 0")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 415, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-49.9375f, -1.6875f, -5.5625f).setRotationAngle(0, 0, 0).setName("green marker light rear 0")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 507, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-51.1875f, -4.6875f, 4.9375f).setRotationAngle(0, 0, 0).setName("top red marker light rear 1")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 362, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-51.1875f, -3.6875f, 4.9375f).setRotationAngle(0, 0, 0).setName("lower red marker light rear 1")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 362, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-51.1875f, -2.6875f, 4.9375f).setRotationAngle(0, 0, 0).setName("white marker light rear 1")
		);
		marker_lights.add(new ModelRendererTurbo(marker_lights, 0, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, -0.9375f, -0.375f, 0, -0.9375f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(-51.1875f, -1.6875f, 4.9375f).setRotationAngle(0, 0, 0).setName("green marker light rear 1")
		);
		this.groups.add(marker_lights);
		//
		TurboList interior_lights = new TurboList("interior_lights");
		interior_lights.add(new ModelRendererTurbo(interior_lights, 402, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-0.625f, -15.125f, -0.625f).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(12.0625f, -15.125f, -0.625f).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 218, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(28.9375f, -15.125f, -0.625f).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 456, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-13.3125f, -15.125f, -0.625f).setRotationAngle(0, 0, 0)
		);
		interior_lights.add(new ModelRendererTurbo(interior_lights, 421, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0.25f, 0, -0.25f, 0.25f)
			.setRotationPoint(-30.1875f, -15.125f, -0.625f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(interior_lights);
		//
		TurboList headlights = new TurboList("headlights");
		headlights.add(new ModelRendererTurbo(headlights, 385, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47.875f, -2.625f, -0.5f).setRotationAngle(0, 0, 0).setName("front headlight door")
		);
		headlights.add(new ModelRendererTurbo(headlights, 218, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(49.1563f, -16.4375f, -0.375f).setRotationAngle(0, 0, 0).setName("front headlight high")
		);
		headlights.add(new ModelRendererTurbo(headlights, 507, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-49.9062f, -16.4375f, -0.375f).setRotationAngle(0, 0, 0).setName("rear headlight high")
		);
		headlights.add(new ModelRendererTurbo(headlights, 218, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.875f, -2.625f, -0.5f).setRotationAngle(0, 0, 0).setName("rear headlight door")
		);
		this.groups.add(headlights);
		//
	}

}
