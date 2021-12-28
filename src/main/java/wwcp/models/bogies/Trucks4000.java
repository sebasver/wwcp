//FMT-Marker TiM-1.0
package wwcp.models.bogies;

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
public class Trucks4000 extends RollingStockModel {

	public Trucks4000(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("OfflineUser");
		//
		TurboList Fixed = new TurboList("Fixed");
		Fixed.add(new ModelRendererTurbo(Fixed, 111, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-0.5f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 106, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.25f, 0, 0.375f, -0.25f, 0, 0.375f, -0.25f, 0.375f, 0, -0.25f, 0.375f)
			.setRotationPoint(-0.6875f, 4.875f, -0.6875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 270, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.40625f, 4, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 257, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.5625f, 4, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 244, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.40625f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 231, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.5625f, 4, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 35, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-8.125f, 5.25f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-8.125f, 5.25f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 95, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-10.125f, 6.5f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 90, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.125f, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(9.125f, 6.5f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 85, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(-10.125f, 6.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 80, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1.125f, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.625f, 0, -0.375f, -0.625f)
			.setRotationPoint(9.125f, 6.5f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 75, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -1.25f, -0.625f, 0, 0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0.625f, -0.625f)
			.setRotationPoint(-9.125f, 5.25f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 65, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.25f, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, 0.625f, 0, 0, 0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(8.125f, 5.25f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 60, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1.25f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -1.25f, -0.625f, 0, 0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0.625f, -0.625f)
			.setRotationPoint(-9.125f, 5.25f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 55, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -1.25f, 0, 0, -1.25f, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, 0.625f, 0, 0, 0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(8.125f, 5.25f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 50, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.75f, -1.1875f, 0, 0.75f, -1.1875f, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.75f, 0.4375f, 0, 0.75f, 0.4375f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-9.125f, 6.875f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 45, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1.1875f, 0, 0.75f, 0, 0, 0.75f, 0, -0.625f, 0, -1.1875f, -0.625f, 0, 0.4375f, 0, 0.75f, -0.75f, 0, 0.75f, -0.75f, -0.625f, 0, 0.4375f, -0.625f)
			.setRotationPoint(7.375f, 6.875f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 40, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.75f, -1.1875f, 0, 0.75f, -1.1875f, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.75f, 0.4375f, 0, 0.75f, 0.4375f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-9.125f, 6.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 35, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1.1875f, 0, 0.75f, 0, 0, 0.75f, 0, -0.625f, 0, -1.1875f, -0.625f, 0, 0.4375f, 0, 0.75f, -0.75f, 0, 0.75f, -0.75f, -0.625f, 0, 0.4375f, -0.625f)
			.setRotationPoint(7.375f, 6.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 28, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-7.375f, 8.0625f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 21, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(5.1875f, 8.0625f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 14, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-7.375f, 8.0625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 7, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(5.1875f, 8.0625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 56, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 14, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.25f, 0, 0, 0.25f, 0, -0.1875f, 0, 0.375f, -0.1875f, 0, 0.375f, -0.1875f, 0.25f, 0, -0.1875f, 0.25f)
			.setRotationPoint(-1.1875f, 5.625f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 89, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 12, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.875f, 0, 0, 0.875f, 0, 0.0625f, 0, 0.375f, 0.0625f, 0, 0.375f, 0.0625f, 0.875f, 0, 0.0625f, 0.875f)
			.setRotationPoint(-1.1875f, 6.4375f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 30, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, 0, -0.75f, 0, 0.1875f, 0, -0.6875f, 0.1875f, 0, -0.6875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f)
			.setRotationPoint(-7.375f, 5.875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 25, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, 0, -0.75f, 0, 0.1875f, 0, -0.6875f, 0.1875f, 0, -0.6875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f)
			.setRotationPoint(-5.75f, 5.875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 20, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, 0, -0.75f, 0, 0.1875f, 0, -0.6875f, 0.1875f, 0, -0.6875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f)
			.setRotationPoint(5.4375f, 5.875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 15, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, 0, -0.75f, 0, 0.1875f, 0, -0.6875f, 0.1875f, 0, -0.6875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f)
			.setRotationPoint(7.0625f, 5.875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 10, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, 0, -0.75f, 0, 0.1875f, 0, -0.6875f, 0.1875f, 0, -0.6875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f)
			.setRotationPoint(-7.375f, 5.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 5, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, 0, -0.75f, 0, 0.1875f, 0, -0.6875f, 0.1875f, 0, -0.6875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f)
			.setRotationPoint(-5.75f, 5.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, 0, -0.75f, 0, 0.1875f, 0, -0.6875f, 0.1875f, 0, -0.6875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f)
			.setRotationPoint(5.4375f, 5.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 506, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, 0, -0.75f, 0, 0.1875f, 0, -0.6875f, 0.1875f, 0, -0.6875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f)
			.setRotationPoint(7.0625f, 5.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 206, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.75f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.75f, 0.1875f, 0)
			.setRotationPoint(-8.125f, 5.875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 152, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -1, 0.1875f, 0, -1, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-5.4375f, 5.875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 125, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.75f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.75f, 0.1875f, 0)
			.setRotationPoint(4.6875f, 5.875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 363, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -1, 0.1875f, 0, -1, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(7.375f, 5.875f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 358, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.75f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.75f, 0.1875f, 0)
			.setRotationPoint(-8.125f, 5.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 353, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -1, 0.1875f, 0, -1, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-5.4375f, 5.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 348, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.75f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.75f, 0.1875f, 0)
			.setRotationPoint(4.6875f, 5.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 343, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 0.25f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -1, 0.1875f, 0, -1, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(7.375f, 5.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 214, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0.625f, -0.375f, 0, 0.625f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-3.8125f, 8.25f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 187, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0.625f, -0.375f, 0, 0.625f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-3.8125f, 8.25f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 338, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1.125f, 0, 0, -1.3125f, 0, 0, -1.3125f, 0, -0.75f, 1.125f, 0, -0.75f, 0, 0.125f, 0, -0.1875f, 0.125f, 0, -0.1875f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(-4.5f, 6.125f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 333, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1.125f, 0, 0, 0.9375f, 0, 0, 0.9375f, 0, -0.75f, -1.125f, 0, -0.75f, 0, 0.125f, 0, -0.1875f, 0.125f, 0, -0.1875f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(3.6875f, 6.125f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 328, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1.125f, 0, 0, -1.3125f, 0, 0, -1.3125f, 0, -0.75f, 1.125f, 0, -0.75f, 0, 0.125f, 0, -0.1875f, 0.125f, 0, -0.1875f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(-4.5f, 6.125f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 323, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1.125f, 0, 0, 0.9375f, 0, 0, 0.9375f, 0, -0.75f, -1.125f, 0, -0.75f, 0, 0.125f, 0, -0.1875f, 0.125f, 0, -0.1875f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(3.6875f, 6.125f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-7.375f, 5.5f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 501, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(5.0625f, 5.5f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 494, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-7.375f, 5.5f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 487, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(5.0625f, 5.5f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 318, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-5.0625f, 5.5f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 313, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(4.8125f, 5.5f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 308, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(-5.0625f, 5.5f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 303, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.25f, 0, -0.75f, 0, -0.375f, 0, -0.75f, -0.375f, 0, -0.75f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(4.8125f, 5.5f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 298, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.75f, 0, 0, -0.75f, -0.6875f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, -0.75f, -0.6875f, -0.375f, -0.75f)
			.setRotationPoint(-4.5f, 8.25f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 293, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(3.8125f, 8.25f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 288, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.75f, 0, 0, -0.75f, -0.6875f, -0.375f, 0, -0.3125f, -0.375f, 0, -0.3125f, -0.375f, -0.75f, -0.6875f, -0.375f, -0.75f)
			.setRotationPoint(-4.5f, 8.25f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 283, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(3.8125f, 8.25f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 480, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-1.1875f, 6.4375f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 473, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-1.1875f, 6.4375f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 436, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.625f, -0.75f, 0, 0.625f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-8.125f, 5.625f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 427, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.625f, -0.75f, 0, 0.625f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(4.5f, 5.625f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 418, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.625f, -0.75f, 0, 0.625f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-8.125f, 5.625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 409, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.625f, -0.75f, 0, 0.625f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(4.5f, 5.625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 400, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.3125f, 0.0625f, 0, 0.3125f, 0.0625f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-4.5f, 5.625f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 391, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.625f, 0, -0.8125f, -0.625f, 0, 0.0625f, 0, 0.3125f, -0.75f, 0, 0.3125f, -0.75f, -0.625f, 0, 0.0625f, -0.625f)
			.setRotationPoint(1.1875f, 5.625f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 382, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.3125f, -0.8125f, 0, 0.3125f, -0.8125f, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.3125f, 0.0625f, 0, 0.3125f, 0.0625f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-4.5f, 5.625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 373, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.625f, 0, -0.8125f, -0.625f, 0, 0.0625f, 0, 0.3125f, -0.75f, 0, 0.3125f, -0.75f, -0.625f, 0, 0.0625f, -0.625f)
			.setRotationPoint(1.1875f, 5.625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 502, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.375f, 0, -0.3125f, -0.375f)
			.setRotationPoint(-3.5f, 5.625f, -6.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 497, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.375f, 0, -0.3125f, -0.375f)
			.setRotationPoint(2.875f, 5.625f, -6.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 492, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.375f, 0, -0.3125f, -0.375f)
			.setRotationPoint(-3.5f, 5.625f, 6.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 487, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, 0, 0, -0.375f, 0, -0.3125f, 0, -0.375f, -0.3125f, 0, -0.375f, -0.3125f, -0.375f, 0, -0.3125f, -0.375f)
			.setRotationPoint(2.875f, 5.625f, 6.25f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 482, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.6875f, 6.3125f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 477, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.6875f, 8, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 472, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(2.6875f, 6.3125f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 467, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(2.6875f, 8, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 462, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.6875f, 6.3125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 457, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.6875f, 8, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 452, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(2.6875f, 6.3125f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 447, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(2.6875f, 8, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 442, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, -0.25f, 0, -0.5625f, -0.25f)
			.setRotationPoint(-3.5625f, 6.5625f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 437, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, -0.25f, 0, -0.5625f, -0.25f)
			.setRotationPoint(2.8125f, 6.5625f, -6.9375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 432, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, -0.25f, 0, -0.5625f, -0.25f)
			.setRotationPoint(-3.5625f, 6.5625f, 6.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 427, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, -0.25f, 0, -0.5625f, -0.25f)
			.setRotationPoint(2.8125f, 6.5625f, 6.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 422, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-5.1875f, 8.0625f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 417, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, -0.1875f, -0.625f, 0, -0.5625f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.625f, 0, -0.5625f, -0.625f)
			.setRotationPoint(4.4375f, 8.0625f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 412, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, -0.1875f, 0, -0.25f, -0.1875f, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-5.1875f, 8.0625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 407, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, -0.1875f, -0.625f, 0, -0.5625f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.625f, 0, -0.5625f, -0.625f)
			.setRotationPoint(4.4375f, 8.0625f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 106, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.875f, -0.75f, 0, 0.875f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-4.4375f, 8.25f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 75, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.875f, -0.75f, 0, 0.875f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-4.4375f, 8.25f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 199, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.90625f, 6.5f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 172, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.90625f, 6.5f, -6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 402, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.625f, 0, 0, -0.625f, -0.0625f, 0.5625f, 0, -0.625f, 0.5625f, 0, -0.625f, 0.5625f, -0.625f, -0.0625f, 0.5625f, -0.625f)
			.setRotationPoint(-1.1875f, 6.6875f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 397, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.625f, 0, 0, -0.625f, 0.0625f, 0.5625f, 0, -0.75f, 0.5625f, 0, -0.75f, 0.5625f, -0.625f, 0.0625f, 0.5625f, -0.625f)
			.setRotationPoint(0.875f, 6.6875f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 392, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.625f, 0, 0, -0.625f, -0.0625f, 0.5625f, 0, -0.625f, 0.5625f, 0, -0.625f, 0.5625f, -0.625f, -0.0625f, 0.5625f, -0.625f)
			.setRotationPoint(-1.1875f, 6.6875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 387, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.625f, 0, 0, -0.625f, 0.0625f, 0.5625f, 0, -0.75f, 0.5625f, 0, -0.75f, 0.5625f, -0.625f, 0.0625f, 0.5625f, -0.625f)
			.setRotationPoint(0.875f, 6.6875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 382, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.75f, -0.3125f, 0, -0.75f, 0, 0.625f, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, -0.75f, 0, 0.625f, -0.75f)
			.setRotationPoint(-2, 5.625f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 377, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.3125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0.3125f, 0, -0.75f, 0, 0.625f, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, -0.75f, 0, 0.625f, -0.75f)
			.setRotationPoint(1.5f, 5.625f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 372, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.3125f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.75f, -0.3125f, 0, -0.75f, 0, 0.625f, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, -0.75f, 0, 0.625f, -0.75f)
			.setRotationPoint(-2, 5.625f, 6.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 224, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.3125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0, -0.75f, 0.3125f, 0, -0.75f, 0, 0.625f, 0, -0.5f, 0.625f, 0, -0.5f, 0.625f, -0.75f, 0, 0.625f, -0.75f)
			.setRotationPoint(1.5f, 5.625f, 6.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 219, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5625f, 0, -0.5f, 0.5625f, 0, -0.5f, 0.5625f, -0.625f, 0, 0.5625f, -0.625f)
			.setRotationPoint(-0.5625f, 6.6875f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 214, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5625f, 0, -0.5f, 0.5625f, 0, -0.5f, 0.5625f, -0.625f, 0, 0.5625f, -0.625f)
			.setRotationPoint(0.0625f, 6.6875f, -6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 202, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5625f, 0, -0.5f, 0.5625f, 0, -0.5f, 0.5625f, -0.625f, 0, 0.5625f, -0.625f)
			.setRotationPoint(-0.5625f, 6.6875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 197, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5625f, 0, -0.5f, 0.5625f, 0, -0.5f, 0.5625f, -0.625f, 0, 0.5625f, -0.625f)
			.setRotationPoint(0.0625f, 6.6875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 466, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-3.6875f, 8.25f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 459, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(1.1875f, 8.25f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 452, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(-3.6875f, 8.25f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 445, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(1.1875f, 8.25f, 6.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 192, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.875f, 0, 0, -0.875f, 0, 0.1875f, 0, 0.3125f, 0.1875f, 0, 0.3125f, 0.1875f, -0.875f, 0, 0.1875f, -0.875f)
			.setRotationPoint(-7.0625f, 5.875f, -6.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 187, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.875f, 0, 0, -0.875f, 0, 0.1875f, 0, 0.3125f, 0.1875f, 0, 0.3125f, 0.1875f, -0.875f, 0, 0.1875f, -0.875f)
			.setRotationPoint(5.75f, 5.875f, -6.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 175, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.875f, 0, 0, -0.875f, 0, 0.1875f, 0, 0.3125f, 0.1875f, 0, 0.3125f, 0.1875f, -0.875f, 0, 0.1875f, -0.875f)
			.setRotationPoint(-7.0625f, 5.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 170, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.875f, 0, 0, -0.875f, 0, 0.1875f, 0, 0.3125f, 0.1875f, 0, 0.3125f, 0.1875f, -0.875f, 0, 0.1875f, -0.875f)
			.setRotationPoint(5.75f, 5.875f, 6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 165, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f)
			.setRotationPoint(5.90625f, 6.5f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 160, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f)
			.setRotationPoint(-6.90625f, 6.5f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 148, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f)
			.setRotationPoint(5.90625f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 143, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f)
			.setRotationPoint(-6.90625f, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 138, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(5.90625f, 6.5f, -6.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 133, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-6.90625f, 6.5f, -6.875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 121, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(5.90625f, 6.5f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 116, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-6.90625f, 6.5f, 6.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 145, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.875f, 0, 0, 0.875f, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.875f, 0, -0.375f, 0.875f)
			.setRotationPoint(9.625f, 6.5f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 118, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.875f, 0, 0, 0.875f, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0.875f, 0, -0.375f, 0.875f)
			.setRotationPoint(-10.125f, 6.5f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 160, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-3.5f, 5.375f, -6.4375f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 133, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(-3.5f, 5.375f, 6.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 364, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -2, -0.75f, 0)
			.setRotationPoint(-3.1875f, 5.375f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 355, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -2, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(1.1875f, 5.375f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 346, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.1875f, 5.375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 337, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -2, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(1.1875f, 5.375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 328, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -2, -0.75f, 0)
			.setRotationPoint(-3.1875f, 8.25f, -6.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 319, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -2, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(1.1875f, 8.25f, -6.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 310, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.1875f, 8.25f, 4.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 301, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -2, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(1.1875f, 8.25f, 4.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 292, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-1.1875f, 5.375f, 4.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 283, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-1.1875f, 5.375f, -6.1875f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 204, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(-1.0625f, 7.25f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 177, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(-1.0625f, 7.25f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 150, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-1.0625f, 8.5f, -8.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 94, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-1.0625f, 8.5f, 7.5625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 111, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0.125f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, -0.625f, 0.125f, -0.5f, -0.625f)
			.setRotationPoint(-0.9375f, 7.5f, -8).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 106, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0.125f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, -0.625f, 0.125f, -0.5f, -0.625f)
			.setRotationPoint(0.8125f, 8, -8).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 95, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0.125f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, -0.625f, 0.125f, -0.5f, -0.625f)
			.setRotationPoint(-0.9375f, 7.5f, 7.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 90, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0, -0.625f, 0.125f, -0.5f, 0, -0.875f, -0.5f, 0, -0.875f, -0.5f, -0.625f, 0.125f, -0.5f, -0.625f)
			.setRotationPoint(0.8125f, 8, 7.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 85, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0.125f, 0, -0.625f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(-0.9375f, 8, -8).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 80, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0.125f, 0, -0.625f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(0.8125f, 7.5f, -8).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 75, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0.125f, 0, -0.625f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(-0.9375f, 8, 7.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 65, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0.125f, 0, -0.625f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(0.8125f, 7.5f, 7.625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 60, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.1875f, 0.125f, -0.5f, -0.1875f, 0.125f, -0.5f, -0.1875f, -0.6875f, 0, -0.1875f, -0.6875f)
			.setRotationPoint(-0.5625f, 6.4375f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 55, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.1875f, 0.125f, -0.5f, -0.1875f, 0.125f, -0.5f, -0.1875f, -0.6875f, 0, -0.1875f, -0.6875f)
			.setRotationPoint(0.0625f, 6.4375f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 50, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5625f, 0, -0.1875f, -0.5625f)
			.setRotationPoint(-0.5625f, 6.4375f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 45, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.1875f, 0, -0.5f, -0.1875f, 0, -0.5f, -0.1875f, -0.5625f, 0, -0.1875f, -0.5625f)
			.setRotationPoint(0.0625f, 6.4375f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 40, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-0.5625f, 7.5f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 35, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(0.0625f, 7.5f, -7.0625f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 507, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(-0.5625f, 7.5f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		Fixed.add(new ModelRendererTurbo(Fixed, 125, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, 0, 0, -0.625f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.75f, 0, -0.25f, -0.75f)
			.setRotationPoint(0.0625f, 7.5f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(Fixed);
		//
	}

}
