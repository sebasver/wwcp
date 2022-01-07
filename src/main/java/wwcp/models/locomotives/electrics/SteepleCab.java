//FMT-Marker TiM-1.0
package wwcp.models.locomotives.electrics;

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
public class SteepleCab extends RollingStockModel {

	public SteepleCab(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0.5f, 0.75f, 0, 0.5f, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(35.125f, 0.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, -1, 0, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(35.625f, 0.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, -1, 0, 0.75f, 0)
			.setRotationPoint(35.625f, 0.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.5f, 0.75f, 0)
			.setRotationPoint(-36.125f, 0.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, -1, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(-36.625f, 0.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, -1)
			.setRotationPoint(-36.625f, 0.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0)
			.setRotationPoint(-36.125f, 0.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0)
			.setRotationPoint(-36.125f, 0.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 37, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(35.25f, 0.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 37, textureX, textureY)
			.addShapeBox(-0.125f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.75f, 0, -0.5f, 0.75f, 0, -0.5f, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(35.25f, 0.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-10.5f, -12.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 21, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0.25f, 0.75f, 0, 0.25f, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(-35.125f, 0.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 4, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, -3.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 4, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.5f, -3.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-10.5f, -12.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(9.5f, -12.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-10.5f, -12.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(9.5f, -12.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(-10.5f, -12.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 5, 12, 0, 0, -4.25f, 0, 0, 0, 0, 0, 0, 0, 0, -4.25f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(-32.5f, -9, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0.25f, -0.125f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.25f, -0.125f, 0, 0.25f, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0.125f, 0)
			.setRotationPoint(-33.5f, -4.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.5f, -4.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 5, 12, 0, 0, 0, 0, 0, -4.25f, 0, 0, -4.25f, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(10.5f, -9, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0.375f, 0, 0.25f, -0.125f, 0, 0.25f, -0.125f, 0, 0, 0.375f, 0, 0, 0.125f, 0, 0.25f, 0.125f, 0, 0.25f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(32.5f, -4.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(33.5f, -4.25f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.625f, -0.875f, 0, 0.625f, -0.875f, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(10.5f, -8.625f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.125f, -0.625f, 0, 0.4375f, 0, -0.625f, 0.4375f, 0, -0.625f, 0.4375f, -0.625f, 0, 0.4375f, -0.625f)
			.setRotationPoint(15.8125f, -6.6875f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0.6875f, -1.0625f, 0, 0.6875f, -1.0625f, -0.625f, -0.625f, 0, -0.625f, -0.5f, -0.625f, 0, 0.3125f, 0.1875f, 0, 0.3125f, 0.1875f, -0.625f, -0.5f, -0.625f, -0.625f)
			.setRotationPoint(14.5f, -7.75f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.625f, -0.875f, 0, 0, 0, 0, 0, 0, -0.625f, 0.625f, -0.875f, -0.625f, 0.5f, 0.25f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0.5f, 0.25f, -0.625f)
			.setRotationPoint(-14.5f, -8.625f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.625f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.4375f, 0, 0, 0.4375f, 0, 0, 0.4375f, -0.625f, -0.625f, 0.4375f, -0.625f)
			.setRotationPoint(-16.8125f, -6.6875f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.6875f, -1.0625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0.6875f, -1.0625f, -0.625f, 0.3125f, 0.1875f, 0, -0.5f, -0.625f, 0, -0.5f, -0.625f, -0.625f, 0.3125f, 0.1875f, -0.625f)
			.setRotationPoint(-15.5f, -7.75f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(21.8125f, -6.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(34.25f, -6.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(22.1875f, -6.1875f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(22.1875f, -2.875f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-34.625f, -6.25f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-22.1875f, -6.25f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-34.25f, -6.1875f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-34.25f, -2.875f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0.0625f, -4.19f, -0.625f, -0.0625f, -0.133f, -0.625f, -0.0625f, -0.133f, 0, 0.0625f, -4.19f, 0, 0, 3.553f, -0.625f, 0, -0.505f, -0.625f, 0, -0.505f, 0, 0, 3.553f, 0)
			.setRotationPoint(-32.125f, -9.375f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0.0625f, -4.19f, -0.625f, -0.0625f, -0.133f, -0.625f, -0.0625f, -0.133f, 0, 0.0625f, -4.19f, 0, 0, 3.553f, -0.625f, 0, -0.505f, -0.625f, 0, -0.505f, 0, 0, 3.553f, 0)
			.setRotationPoint(-32.125f, -9.375f, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, -0.0625f, -0.133f, -0.625f, 0.0625f, -4.19f, -0.625f, 0.0625f, -4.19f, 0, -0.0625f, -0.133f, 0, 0, -0.505f, -0.625f, 0, 3.553f, -0.625f, 0, 3.553f, 0, 0, -0.505f, 0)
			.setRotationPoint(11.125f, -9.375f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, -0.0625f, -0.133f, -0.625f, 0.0625f, -4.19f, -0.625f, 0.0625f, -4.19f, 0, -0.0625f, -0.133f, 0, 0, -0.505f, -0.625f, 0, 3.553f, -0.625f, 0, 3.553f, 0, 0, -0.505f, 0)
			.setRotationPoint(11.125f, -9.375f, 4.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, -0.625f, 0, 0, 0, -0.07f, 0, 0, -0.07f, 0.5f, -0.625f, 0, 0.5f, -0.5625f, -0.64f, 0, -0.0625f, -0.569f, 0, -0.0625f, -0.569f, 0.5f, -0.5625f, -0.64f, 0.5f)
			.setRotationPoint(31.1875f, -5.255f, -5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, -0.07f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.07f, 0.5f, -0.0625f, -0.569f, 0, -0.5625f, -0.64f, 0, -0.5625f, -0.64f, 0.5f, -0.0625f, -0.569f, 0.5f)
			.setRotationPoint(-32.1875f, -5.255f, -5.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-25.9375f, -6.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-31.3125f, -6.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-34.0625f, -6.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-23.1875f, -6.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-33.6875f, -6.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-25.5625f, -6.25f, 9.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(30.9375f, -6.25f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(25.5625f, -6.25f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(22.8125f, -6.25f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(33.6875f, -6.25f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(23.1875f, -6.25f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(31.3125f, -6.25f, -10.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(36.125f, -1.25f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(36.125f, -1.25f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(36.1875f, -0.625f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-36.5f, -1.25f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-36.5f, -1.25f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(-36.4375f, -0.625f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(29.5f, 2.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(27, 2.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(27.375f, 3.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(27.375f, 6.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(-17.9375f, 2.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(-20.4375f, 2.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-20.0625f, 3.875f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-20.0625f, 6.625f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(20.0625f, 2.5f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(17.5625f, 2.5f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(17.9375f, 3.875f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(17.9375f, 6.625f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(-27.375f, 2.5f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(-29.875f, 2.5f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-29.5f, 3.875f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-29.5f, 6.625f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-10.5f, -16, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-10.5f, -16, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 4, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-10.5f, -16, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1.25f, 0.5f, 0, -1.25f, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f)
			.setRotationPoint(-10.5f, -15.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 3, 0, 0, -1.25f, 0.5f, 0, -1.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-10.5f, -15.375f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-10.5f, -15.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-10.5f, -14.125f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f)
			.setRotationPoint(-10.5f, -14.125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-11.5f, -17.25f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(-10.5f, -13.75f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.375f, 0, 0.125f, -0.375f, 0, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-10.5f, -14.125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-10.5f, -13.75f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.0625f, 0, -0.625f, -0.0625f, 0, -0.625f, -0.0625f, 0, -0.625f, -0.0625f)
			.setRotationPoint(10.5f, -16, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.625f, 0, -0.25f, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.25f, 0, -0.125f, 0, -0.625f, 0.0625f, 0, -0.625f, 0.0625f)
			.setRotationPoint(10.5f, -16, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -1.25f, -0.5f, -0.5f, -1.25f, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f, -0.25f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(10.5f, -15.375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, -0.5625f, 0, -1, -0.5625f, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, -0.25f, -0.625f, -0.625f, -0.25f, -0.625f, -0.625f, -0.25f, 0.0625f, 0, -0.25f, 0.0625f)
			.setRotationPoint(10.5f, -13.75f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5f, 0, 0, 0, 0, 0, 0, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f, -0.5f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(10.5f, -14.125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.0625f, 0, -0.625f, 0.0625f, -0.25f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(10.5f, -16, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.25f, 0, 0, -0.5f, -1.25f, -0.5f, 0, -1.25f, -0.5f, 0, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f, -0.5f, 0.625f, -0.625f, 0, 0.625f, -0.625f)
			.setRotationPoint(10.5f, -15.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0.375f, -0.5625f, -0.25f, 0.375f, -0.5625f, 0, -1, 0, 0, -1, 0, -0.25f, 0.0625f, -0.625f, -0.25f, 0.0625f, -0.625f, -0.25f, -0.625f, 0, -0.25f, -0.625f)
			.setRotationPoint(10.5f, -13.75f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5625f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.625f, 0.125f, -0.5f, -0.625f, 0.125f, -0.5625f, -0.375f, -0.75f, 0, -0.375f, -0.75f)
			.setRotationPoint(10.5f, -14.125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.0625f, 0, -0.625f, -0.0625f, 0, -0.625f, -0.0625f, 0, -0.625f, -0.0625f)
			.setRotationPoint(-11.5f, -16, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0.0625f, 0, -0.625f, 0.0625f)
			.setRotationPoint(-11.5f, -16, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.5f, -1.25f, -0.5f, 0, -1.25f, -0.5f, 0, 0, 0, -0.25f, 0, 0, -0.5f, 0.625f, -0.625f, 0, 0.625f, -0.625f, 0, -0.625f, 0.125f, -0.25f, -0.625f, 0.125f)
			.setRotationPoint(-11.5f, -15.375f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -1, 0, 0, -1, 0, -0.25f, 0.375f, -0.5625f, -0.25f, 0.375f, -0.625f, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, 0.0625f, -0.625f, -0.25f, 0.0625f)
			.setRotationPoint(-11.5f, -13.75f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, -0.5f, 0, 0, -0.5625f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.625f, 0.125f, -0.5f, -0.625f, 0.125f)
			.setRotationPoint(-11.5f, -14.125f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.25f, -0.625f, 0, 0, -0.625f, 0.0625f, 0, -0.625f, 0.0625f, 0, 0, -0.125f, -0.25f, 0, -0.125f)
			.setRotationPoint(-11.5f, -16, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.25f, 0, 0, 0, 0, 0, 0, -1.25f, -0.5f, -0.5f, -1.25f, -0.5f, -0.25f, -0.625f, 0.125f, 0, -0.625f, 0.125f, 0, 0.625f, -0.625f, -0.5f, 0.625f, -0.625f)
			.setRotationPoint(-11.5f, -15.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, -0.25f, 0.375f, 0, -0.25f, 0.375f, 0, 0, -1, -0.5625f, 0, -1, -0.625f, -0.25f, 0.0625f, 0, -0.25f, 0.0625f, 0, -0.25f, -0.625f, -0.625f, -0.25f, -0.625f)
			.setRotationPoint(-11.5f, -13.75f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, -0.5625f, -0.375f, -0.375f, -0.5f, -0.625f, 0.125f, 0, -0.625f, 0.125f, 0, -0.375f, -0.75f, -0.5625f, -0.375f, -0.75f)
			.setRotationPoint(-11.5f, -14.125f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-10.5f, -16.625f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(9.875f, -16.625f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.5f, -16.625f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0.375f, 0, -0.75f, 0.375f)
			.setRotationPoint(1, -17.5f, -1.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(2.375f, -17.875f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.5f, 0, -0.3125f, 0.5f)
			.setRotationPoint(1.625f, -18.5625f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(0.875f, -18.5625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(1.625f, -18.5f, -1.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(4.5f, -18.5625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(1.625f, -18.5f, 0.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(4.5f, -18.5625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 28, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(4.75f, -18.4375f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.6875f, -0.625f, -0.625f, -0.6875f)
			.setRotationPoint(4.375f, -18.4375f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.6875f, -0.625f, -0.625f, -0.6875f)
			.setRotationPoint(4.375f, -18.4375f, 0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(32.4375f, -18.4375f, -0.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(32.4375f, -18.4375f, 0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.125f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.125f, -0.125f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(32.75f, -18.75f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f)
			.setRotationPoint(32.75f, -18.75f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f, -0.125f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.125f, -0.125f, -0.625f)
			.setRotationPoint(32.75f, -18.75f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.625f, -0.5f, 0, -0.625f)
			.setRotationPoint(32.75f, -18.75f, -0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.375f, 0, 0, 0.375f, 0, -0.75f, 0, 0.375f, -0.75f, 0, 0.375f, -0.75f, 0.375f, 0, -0.75f, 0.375f)
			.setRotationPoint(-4.75f, -17.5f, -1.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(-4.125f, -17.875f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, -0.3125f, 0.5f, 0, -0.3125f, 0.5f)
			.setRotationPoint(-4.875f, -18.5625f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.3125f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, 0, 0, -0.3125f, 0)
			.setRotationPoint(-1.875f, -18.5625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-5.125f, -18.5f, -1.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-6.125f, -18.5625f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-5.125f, -18.5f, 0.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-6.125f, -18.5625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 17, textureX, textureY)
			.addShapeBox(-28, 0.1875f, 0, 28, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-5.125f, -18.625f, -0.1875f).setRotationAngle(0, 0, 39)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.6875f, -0.625f, -0.625f, -0.6875f)
			.setRotationPoint(-6.25f, -18.4375f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.6875f, -0.625f, 0, -0.6875f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.6875f, -0.625f, -0.625f, -0.6875f)
			.setRotationPoint(-6.25f, -18.4375f, 0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 35, textureX, textureY)
			.addShapeBox(-28.6875f, 0.1875f, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-5.125f, -18.625f, -0.3125f).setRotationAngle(0, 0, 39)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 35, textureX, textureY)
			.addShapeBox(-28.6875f, 0.1875f, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.875f, 0, -0.625f, -0.875f)
			.setRotationPoint(-5.125f, -18.625f, 0.1875f).setRotationAngle(0, 0, 39)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 35, textureX, textureY)
			.addShapeBox(-29, -0.125f, 0, 1, 1, 1, 0, -0.125f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.125f, -0.125f, -0.625f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(-5.125f, -18.625f, -0.1875f).setRotationAngle(0, 0, 39)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 35, textureX, textureY)
			.addShapeBox(-29, -0.125f, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f)
			.setRotationPoint(-5.125f, -18.625f, -0.1875f).setRotationAngle(0, 0, 39)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 35, textureX, textureY)
			.addShapeBox(-29, -0.125f, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.625f, 0, -0.5f, -0.625f, -0.125f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, -0.625f, -0.125f, -0.125f, -0.625f)
			.setRotationPoint(-5.125f, -18.625f, -0.1875f).setRotationAngle(0, 0, 39)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 35, textureX, textureY)
			.addShapeBox(-29, -0.125f, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.5f, -0.5f, -0.625f, -0.5f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.625f, -0.5f, 0, -0.625f)
			.setRotationPoint(-5.125f, -18.625f, -0.1875f).setRotationAngle(0, 0, 39)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, -0.625f, 0, 0.1875f, -0.625f)
			.setRotationPoint(9.8125f, -18.4375f, 0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(9.8125f, -18.8125f, -0.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(9.8125f, -18.4375f, -0.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, 0.1875f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, -0.625f, 0, 0.1875f, -0.625f)
			.setRotationPoint(-10.5625f, -18.4375f, -0.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.3125f, -0.25f, 0, -0.3125f, -0.25f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, 0.125f, 0, -0.625f, 0.125f)
			.setRotationPoint(-10.5625f, -18.8125f, -0.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.25f, -0.625f, 0, -0.25f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-10.5625f, -18.4375f, 0.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(10.5f, -1.6875f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, -2.4375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, -2.4375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(10.5f, -1.4375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(11.5f, -1.4375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(10.5f, -1.6875f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-12, -1.6875f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.5f, -2.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, -2.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-12.5f, -1.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, -1.4375f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.75f, 0, -0.5f, -0.75f)
			.setRotationPoint(-12, -1.6875f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(-30.5625f, -6.375f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-30.0625f, -8.125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-30.0625f, -8.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-30.0625f, -7.125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f)
			.setRotationPoint(-30.0625f, -7.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, -0.25f, 0.25f, 0.25f)
			.setRotationPoint(-31.5625f, -8.375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(-31.5625f, -8.375f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, -0.25f, 0.25f, 0.25f, -0.25f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, 0, 0.25f, -0.25f, 0, 0.25f)
			.setRotationPoint(-31.5625f, -6.875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(-31.5625f, -6.875f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f)
			.setRotationPoint(29.5625f, -6.375f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(29.5625f, -8.125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(29.5625f, -8.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(29.5625f, -7.125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f)
			.setRotationPoint(29.5625f, -7.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, -0.25f, 0.25f, 0.25f)
			.setRotationPoint(30.3125f, -8.375f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f, -0.25f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0, -0.25f, 0.25f, 0)
			.setRotationPoint(30.3125f, -8.375f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, -0.25f, 0.25f, 0.25f, -0.25f, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, 0, 0.25f, -0.25f, 0, 0.25f)
			.setRotationPoint(30.3125f, -6.875f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.3125f, -0.3125f, -0.25f, -0.3125f, -0.3125f)
			.setRotationPoint(30.3125f, -6.875f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(30.4375f, -8.125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(30.4375f, -8.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(30.4375f, -7.125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f)
			.setRotationPoint(30.4375f, -7.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(30.4375f, -7.625f, -0.5f).setRotationAngle(0, 0, 0).setName("LAMP front")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(-32.3125f, -8.125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(-32.3125f, -8.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(-32.3125f, -7.125f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f)
			.setRotationPoint(-32.3125f, -7.125f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31.4375f, -7.625f, -0.5f).setRotationAngle(0, 0, 0).setName("LAMP rear")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0.5f, 0)
			.setRotationPoint(-37.625f, 0.75f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.875f, 3.25f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-41.875f, 2.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-41.875f, 2.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.875f, 2.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.875f, 2.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-35.875f, 2.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.25f, 0.5f, 0)
			.setRotationPoint(36.375f, 0.75f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.625f, 3.25f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(40.625f, 2.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.625f, 2.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(38.625f, 2.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39.625f, 2.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(34.625f, 2.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.5f, -18.875f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, 0.5f, -0.625f, 0.5f)
			.setRotationPoint(-0.5f, -19.25f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.75f, -20.25f, -0.5f).setRotationAngle(0, 0, 0).setName("BEACON")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.1875f, 0.25f, 0.25f, 0.1875f, 0.25f, 0.25f, 0.1875f, 0.25f, 0.25f, 0.1875f, 0.25f)
			.setRotationPoint(8.875f, -18.1875f, 7.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.5f, -0.375f, 0.5f, 0.5f, -0.375f, 0.5f, 0.5f, -0.375f, 0.5f, 0.5f, -0.375f, 0.5f)
			.setRotationPoint(8.875f, -17, 7.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.5f, -0.5f, -0.6875f, -0.5f)
			.setRotationPoint(8.625f, -18.5f, 7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.6875f, 0.02f, 0, -0.6875f, 0.02f, 0, -0.6875f, 0.02f, -0.5f, -0.6875f, 0.02f)
			.setRotationPoint(8.625f, -18.8125f, 6.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.6875f, -0.5f, 0, -0.6875f, -0.5f, 0, -0.6875f, -0.1875f, -0.5f, -0.6875f, -0.1875f)
			.setRotationPoint(8.625f, -18.8125f, 5.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.6875f, 0)
			.setRotationPoint(8.125f, -15.5f, 6.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.6875f, -0.5f, 0, -0.6875f, -0.5f, -0.6875f, -0.1875f, 0, -0.6875f, -0.1875f, 0, -0.6875f, -0.5f, -0.5f, -0.6875f, -0.5f)
			.setRotationPoint(8.625f, -18.8125f, 8.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.5f, -0.6875f, 0)
			.setRotationPoint(8.125f, -17.375f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(9, -16.0625f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(9, -16.0625f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 3, 0, 0, 0, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, 0, 0, 0.1875f, -0.0625f, 0, -0.1875f, 1.125f, 0, -0.1875f, 1.125f, 0, 0.1875f, -0.0625f, 0)
			.setRotationPoint(21.25f, -7.875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 3, 0, 0, -1.125f, 0, 0, 0, 0, 0, 0, 0, 0, -1.125f, 0, -0.1875f, 1.125f, 0, 0.1875f, -0.0625f, 0, 0.1875f, -0.0625f, 0, -0.1875f, 1.125f, 0)
			.setRotationPoint(-27.25f, -7.875f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-27.5f, -6.25f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.25f, -8, -3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.25f, -8, -2.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27.25f, -7, -3.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-27.25f, -7, -2.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(26, -6.25f, 1.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.25f, -8, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.25f, -8, 2.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.25f, -7, 1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(26.25f, -7, 2.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(35.875f, 0.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(35.875f, 0.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(36.125f, 7.25f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(37.125f, 8, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 77, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(35.875f, 0.75f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.125f, -0.75f, -0.5f, 0.125f)
			.setRotationPoint(35.875f, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(35.875f, 0.75f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.125f, -0.75f, -0.5f, 0.125f)
			.setRotationPoint(35.875f, 4.25f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-37.625f, 0.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-37.625f, 0.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-37.875f, 7.25f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-38.125f, 8, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-37.625f, 0.75f, 8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.125f, -0.75f, -0.5f, 0.125f)
			.setRotationPoint(-37.625f, 4.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-4.5f, 2.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.125f, -0.75f, 0, 0.125f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.125f, -0.75f, -0.5f, 0.125f)
			.setRotationPoint(-37.625f, 4.25f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.5f, 4.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-37.625f, 0.75f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(3, 2.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(-4.5f, 2.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-3.5f, 4.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0.25f, -0.75f, 0, 0.25f, -0.75f, 0, 0.25f, 0, -0.5f, 0.25f, 0)
			.setRotationPoint(3, 2.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.75f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-20.75f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.875f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0.125f, 2.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-0.9375f, 2.5f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(0.4375f, 2.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-2.5625f, 2.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-10.5f, -13, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-10.5f, -13, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(9.5f, -13, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(-10.5f, -13, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(9.5f, -13, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f)
			.setRotationPoint(-10.5f, -13, -6).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
		//
	}

}
