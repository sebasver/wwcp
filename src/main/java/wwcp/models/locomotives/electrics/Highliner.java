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
public class Highliner extends RollingStockModel {

	public Highliner(){
		super(); textureX = 512; textureY = 512;
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.5f, 0.625f, -0.25f, 0.5f, 0.625f, -0.25f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(85.25f, -11.75f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 412, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 13, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, -0.25f, 0.5f, -0.625f, -0.25f, 0.5f, 0.625f, 0, 0.5f, 0.625f)
			.setRotationPoint(85.25f, -11.75f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 323, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 78, 13, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, 0.625f, 0.5f, 0.5f, 0.625f, 0.5f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(0.125f, -11.75f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 351, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 78, 13, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0.5f, 0.5f, -0.625f, 0.5f, 0.5f, 0.625f, 0, 0.5f, 0.625f)
			.setRotationPoint(0.125f, -11.75f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 73, 13, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0, 0, 0, 0, 0.5f, 0.625f, 0.875f, 0.5f, 0.625f, 0.875f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(-87.5f, -11.75f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 73, 13, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0.875f, 0.5f, -0.625f, 0.875f, 0.5f, 0.625f, 0, 0.5f, 0.625f)
			.setRotationPoint(-87.5f, -11.75f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, 0.375f, 0, 0.375f, 0.375f)
			.setRotationPoint(85.25f, -17.125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, 0.375f, -0.25f, 0.375f, 0.375f, -0.25f, 0.375f, -0.375f, 0, 0.375f, -0.375f)
			.setRotationPoint(85.25f, -17.125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f)
			.setRotationPoint(67.625f, -17.125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f)
			.setRotationPoint(67.625f, -17.125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 5, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(71.125f, -19.75f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 7, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, -1.375f, 0, 0, -1.375f, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 1.375f, 0, 0, 1.375f, 0)
			.setRotationPoint(71.125f, -19.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 7, 0, 0, -1.375f, 0, -0.125f, -1.375f, 0, -0.125f, 0, 0, 0, 0, 0, 0, 1.375f, 0, -0.125f, 1.375f, 0, -0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(71.125f, -19.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 67, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.5625f, -0.6875f, 0.5f, 0.5625f, -0.6875f, 0.5f, 0.5625f, 0.6875f, 0, 0.5625f, 0.6875f)
			.setRotationPoint(0.125f, -21.3125f, 9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 67, 9, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.5625f, 0.6875f, 0.5f, 0.5625f, 0.6875f, 0.5f, 0.5625f, -0.6875f, 0, 0.5625f, -0.6875f)
			.setRotationPoint(0.125f, -21.3125f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 73, 9, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0, 0, 0, 0, 0.5625f, -0.6875f, 0.875f, 0.5625f, -0.6875f, 0.875f, 0.5625f, 0.6875f, 0, 0.5625f, 0.6875f)
			.setRotationPoint(-87.5f, -21.3125f, 9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 73, 9, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0, 0, 0, 0, 0.5625f, 0.6875f, 0.875f, 0.5625f, 0.6875f, 0.875f, 0.5625f, -0.6875f, 0, 0.5625f, -0.6875f)
			.setRotationPoint(-87.5f, -21.3125f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 155, 1, 5, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.5f, -23.625f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 155, 1, 6, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, -1.1875f, 0.8125f, 0, -1.1875f, 0.8125f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 1.1875f, 0.8125f, 0, 1.1875f, 0.8125f)
			.setRotationPoint(-87.5f, -23.625f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 155, 1, 6, 0, 0, -1.1875f, 0.8125f, 0.125f, -1.1875f, 0.8125f, 0.125f, 0, 0, 0, 0, 0, 0, 1.1875f, 0.8125f, 0.125f, 1.1875f, 0.8125f, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.5f, -23.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 155, 1, 1, 0, 0, -1, 0.125f, 0.125f, -1, 0.125f, 0.125f, 0, -1.125f, 0, 0, -1.125f, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-87.5f, -22.4375f, 9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 155, 1, 1, 0, 0, 0, -1.125f, 0.125f, 0, -1.125f, 0.125f, -1, 0.125f, 0, -1, 0.125f, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(-87.5f, -22.4375f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, -1.25f, -0.125f, 0, -1.25f, -0.125f, -1, 0.25f, 0, -1, 0.25f, 0, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(71.125f, -18.375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, -1, 0.25f, -0.125f, -1, 0.25f, -0.125f, 0, -1.25f, 0, 0, -1.25f, 0, 0.25f, 0, -0.125f, 0.25f, 0, -0.125f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(71.125f, -18.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, -0.25f, 0.5f, -1.375f, -0.25f, 0.5f, 0.625f, 0, 0.5f, 0.625f)
			.setRotationPoint(87, -11.75f, -11.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 174, 1, 1, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0, -1.25f, 0.5f, 0, -1.25f, 0.5f, -1, 0.25f, 0, -1, 0.25f)
			.setRotationPoint(-87.5f, 2, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 165, 1, 1, 0, 0, 0.25f, 0, 0.875f, 0.25f, 0, 0.875f, 0.25f, 0, 0, 0.25f, 0, 0, -1, 0.25f, 0.875f, -1, 0.25f, 0.875f, 0, -1.25f, 0, 0, -1.25f)
			.setRotationPoint(-87.5f, 2, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0.375f, 0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, 0, 0.375f, -0.375f)
			.setRotationPoint(87, -17.125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.25f, -0.25f, -0.75f, -1.25f, -0.25f, -1, 0.25f, 0, -1, 0.25f, 0, 0.25f, 0, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(87, -18.375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -1.375f, 0, -0.25f, -2.125f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 1.375f, 0, -0.25f, 1.375f, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(87, -19.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0, -1.25f, -0.25f, -0.75f, -1.25f, -0.25f, -1, 0.25f, 0, -1, 0.25f)
			.setRotationPoint(87, 2, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(87, 2, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, 0, 0, 0.5f, 0.625f, -0.25f, 0.5f, 0.625f, -0.25f, 0.5f, -1.375f, 0, 0.5f, -0.625f)
			.setRotationPoint(87, -11.75f, 10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, 0, 0, 0, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, -0.25f, 0.375f, -0.375f, 0, 0.375f, 0.375f)
			.setRotationPoint(87, -17.125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0.25f, -0.25f, -1, 0.25f, -0.25f, -0.75f, -1.25f, 0, 0, -1.25f, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.75f, 0, 0.25f, 0)
			.setRotationPoint(87, -18.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -2.125f, 0, 0, -1.375f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 1.375f, 0, 0, 1.375f, 0)
			.setRotationPoint(87, -19.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, -0.75f, 0, 0.25f, 0, 0, -1, 0.25f, -0.25f, -1, 0.25f, -0.25f, -0.75f, -1.25f, 0, 0, -1.25f)
			.setRotationPoint(87, 2, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(87, -19.75f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(70.125f, -19.75f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(67.625f, -23.625f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0.75f, -3.875f, 0, 0.75f, -3.875f, 0, 0, 0, 0, 0.25f, 0, 0, 0.5f, 3.875f, 0, 0.5f, 3.875f, 0, 0.25f, 0, 0)
			.setRotationPoint(68.625f, -23.625f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, -1.1875f, 0.8125f, 0, -1.1875f, 0.8125f, 0, 0, 0, -0.25f, 0, 0, -0.375f, 1.1875f, 0.8125f, 0, 1.1875f, 0.8125f)
			.setRotationPoint(67.625f, -23.625f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0, 0, 0, 0, 0, 0, -1.375f, 0, -0.25f, -1.375f, 0, 0, 0, 0, 0, 0, 0, 0, 1.375f, 0, 0, 1.375f, 0)
			.setRotationPoint(70.125f, -19.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0.75f, -3.875f, 0, 0.75f, -5.25f, 1, 0, -1.1875f, 0.8125f, 0.25f, 0, 0, 0.5f, 3.875f, 0, 0.5f, 5.25f, 1, 0.375f, 1.1875f, 0.8125f)
			.setRotationPoint(68.625f, -23.625f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0.25f, 0, -1, 0.25f, 0, 0, -1.25f, -0.25f, 0, -1.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(70.125f, -18.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0.125f, -0.375f, -1, 0.125f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0.125f, 0, -0.4375f, 0.125f, 0, -0.375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(67.625f, -22.4375f, 9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.375f, -1, 0.125f, 0.5f, -5.0625f, -0.0625f, 0.75f, -4.0625f, -0.9375f, 0, 0, -1.125f, 0.4375f, 0.125f, 0, 0.5f, 4.3125f, -0.3125f, 0.5f, 4.3125f, 0.3125f, 0.375f, 0.125f, 0)
			.setRotationPoint(68.625f, -22.4375f, 9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -1.1875f, 0.8125f, 0, -1.1875f, 0.8125f, 0, 0, 0, 0, 0, 0, 0, 1.1875f, 0.8125f, -0.375f, 1.1875f, 0.8125f, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(67.625f, -23.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, -1.375f, 0, 0, -1.375f, 0, 0, 0, 0, -0.25f, 0, 0, 0, 1.375f, 0, 0, 1.375f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(70.125f, -19.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -1.1875f, 0.8125f, 0.75f, -5.25f, 1, 0.75f, -3.875f, 0, 0, 0, 0, 0.375f, 1.1875f, 0.8125f, 0.5f, 5.25f, 1, 0.5f, 3.875f, 0, 0.25f, 0, 0)
			.setRotationPoint(68.625f, -23.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -1.25f, 0, 0, -1.25f, 0, -1, 0.25f, 0, -1, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(70.125f, -18.375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.125f, 0, 0, -1.125f, -0.375f, -1, 0.125f, 0, -1, 0.125f, 0, 0.125f, 0, -0.375f, 0.125f, 0, -0.4375f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(67.625f, -22.4375f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.125f, 0.75f, -4.0625f, -0.9375f, 0.5f, -5.0625f, -0.0625f, 0.375f, -1, 0.125f, 0.375f, 0.125f, 0, 0.5f, 4.3125f, 0.3125f, 0.5f, 4.3125f, -0.3125f, 0.4375f, 0.125f, 0)
			.setRotationPoint(68.625f, -22.4375f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0.1875f, 0.3125f, -0.375f, 0.1875f, 0.3125f, -0.375f, 0.1875f, -0.3125f, 0, 0.1875f, -0.3125f)
			.setRotationPoint(67.625f, -21.3125f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0.1875f, 0.3125f, 0.875f, 0.1875f, 0.3125f, 0.875f, 0.1875f, -0.3125f, 0, 0.1875f, -0.3125f)
			.setRotationPoint(68.25f, -21.3125f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0.1875f, -0.3125f, -0.375f, 0.1875f, -0.3125f, -0.375f, 0.1875f, 0.3125f, 0, 0.1875f, 0.3125f)
			.setRotationPoint(67.625f, -21.3125f, 9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0.1875f, -0.3125f, 0.875f, 0.1875f, -0.3125f, 0.875f, 0.1875f, 0.3125f, 0, 0.1875f, 0.3125f)
			.setRotationPoint(68.25f, -21.3125f, 9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.71f, 0, 0, -0.71f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.71f, 0, 0, -0.71f)
			.setRotationPoint(-86.5f, 1, -9.537f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 1, 1, 0, 0, 0, -0.71f, 0.5f, 0, -0.71f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.71f, 0.5f, 0, -0.71f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5f, 1, 8.535f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0.0345f, 0.625f, 0, 0.0345f, 0.625f, 0, -0.0345f, 0, 0, -0.0345f, 0, -0.25f, 0, 0.625f, -0.25f, 0, 0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(78.625f, 1, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, 0.0345f, 0.75f, 0, 0.0345f, 0.75f, 0, -0.0345f, 0, 0, -0.0345f, 0, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-13.625f, 1, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, -0.0345f, 0.75f, 0, -0.0345f, 0.75f, 0, 0.0345f, 0, 0, 0.0345f, 0, -0.25f, 0, 0.75f, -0.25f, 0, 0.75f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-13.625f, 1, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0.75f, 0.261f, 0.625f, 0.75f, 0.261f, 0.625f, 0.75f, -0.261f, 0, 0.75f, -0.261f)
			.setRotationPoint(78.625f, -17.125f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 3, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0.75f, -0.261f, 0.625f, 0.75f, -0.261f, 0.625f, 0.75f, 0.261f, 0, 0.75f, 0.261f)
			.setRotationPoint(78.625f, -17.125f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 7, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0.875f, 0.567f, 0.75f, 0.875f, 0.567f, 0.75f, 0.875f, -0.567f, 0, 0.875f, -0.567f)
			.setRotationPoint(-13.625f, -21.3125f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 7, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0.875f, -0.567f, 0.75f, 0.875f, -0.567f, 0.75f, 0.875f, 0.567f, 0, 0.875f, 0.567f)
			.setRotationPoint(-13.625f, -21.3125f, 9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5f, -13.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(86.5f, -11.75f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(86.5f, -11.75f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f)
			.setRotationPoint(86.5f, -17.125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f)
			.setRotationPoint(86.5f, -17.125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-87.5f, -11.75f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(-87.5f, -11.75f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0)
			.setRotationPoint(86.5f, -18.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0)
			.setRotationPoint(86.5f, -18.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0)
			.setRotationPoint(86.5f, -18.75f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0.875f, 0.125f, 0, 0.875f, 0.125f)
			.setRotationPoint(86.5f, -17.125f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0.875f, 0.125f, 0, 0.875f, 0.125f)
			.setRotationPoint(86.5f, -17.125f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0.875f, 0)
			.setRotationPoint(86.5f, -17.125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(86.5f, -17.375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(86.5f, 1, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(86.5f, -17.375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(86.5f, 1, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 19, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5f, 1, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5f, 0.75f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, 0.75f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -14.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -14.25f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -14.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.75f, -15.375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.8125f, 0, 0, 0.8125f, 0, 0, 0.8125f, 0.5f, 0, 0.8125f, 0.5f)
			.setRotationPoint(88.5f, -16.0625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1.8125f, 0, 0, -1.8125f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.8125f, 0, 0, 0.8125f, 0, 0, 0.8125f, 0.25f, 0, 0.8125f, 0.25f)
			.setRotationPoint(88.5f, -16.0625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -1.8125f, 0, 0, -1.8125f, 0, 0, 0.8125f, 0.25f, 0, 0.8125f, 0.25f, 0, 0.8125f, 0, 0, 0.8125f, 0)
			.setRotationPoint(88.5f, -16.0625f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.75f, -15.375f, 7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(86.875f, 0.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(86.875f, -2.5f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(86.875f, -5.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(86.875f, -9.125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(86.875f, -12.5f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(86.875f, -15.875f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.875f, -17.75f, 1).setRotationAngle(0, 0, 0).setName("HEADLIGHT")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -18.25f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -18.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -17.25f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(87.5f, -17.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.75f, -18.25f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(87.75f, -18.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(87.75f, -17.25f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(87.75f, -17.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -18.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -18.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -17.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(87.5f, -17.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.75f, -18.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(87.75f, -18.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(87.75f, -17.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(87.75f, -17.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -17.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -17.8125f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(87.5f, -16.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -16.8125f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -17.8125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -17.8125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(87.5f, -16.8125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.75f, -0.25f, -0.25f, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, -16.8125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.75f, -17.8125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(87.75f, -17.8125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(87.75f, -16.8125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(87.75f, -16.8125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.1875f, 0, 0, -0.1875f, 0, 0, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(87.75f, -17.8125f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.1875f, 0, 0, -0.1875f)
			.setRotationPoint(87.75f, -17.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.1875f, -0.875f, 0, -0.1875f, -0.875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, -0.875f, -0.375f, -0.375f, -0.875f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(87.75f, -16.8125f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, -0.1875f, 0, 0, -0.1875f, 0, -0.1875f, 0, -0.875f, -0.1875f, 0, -0.875f, -0.375f, -0.375f, 0, -0.375f, -0.375f)
			.setRotationPoint(87.75f, -16.8125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.875f, -17.75f, -2).setRotationAngle(0, 0, 0).setName("HEADLIGHT")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.875f, -17.3125f, -7.25f).setRotationAngle(0, 0, 0).setName("REVERSE LIGHT")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.875f, -17.3125f, 6.25f).setRotationAngle(0, 0, 0).setName("REVERSE LIGHT")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f)
			.setRotationPoint(87.5f, -2.1875f, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(87.5f, -2.1875f, 6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, 0, 0.375f, 0, 0, 0.375f)
			.setRotationPoint(87.5f, -0.4375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f)
			.setRotationPoint(87.5f, -0.4375f, 6.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f)
			.setRotationPoint(88.5f, -5.125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.125f, 0, 0.125f, -0.5f, 0, 0.125f, -0.5f, 0, -0.5f, 0.125f, 0, -0.5f, 0.5f, -0.125f, 0.5f, -0.125f, -0.125f, 0.5f, -0.125f, -0.125f, -0.125f, 0.5f, -0.125f, -0.125f)
			.setRotationPoint(88.5f, -3.125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -0.25f, 0, -0.75f, -0.25f)
			.setRotationPoint(88.3125f, -5.375f, -8.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f)
			.setRotationPoint(87.5f, -5.125f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.875f, 0, 0, -1.75f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0.875f, -0.5f, 0, -1.75f, -0.5f, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(88.375f, -16, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, -0.875f, 0, 0, -1.75f, 0, 0, 0.875f, 0, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0, -1.75f, -0.5f, 0, 0.875f, -0.5f, 0)
			.setRotationPoint(88.375f, -16, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.875f, 0, -0.25f, -0.875f)
			.setRotationPoint(87.5f, -16.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.875f, 0, -0.25f, -0.875f)
			.setRotationPoint(88.25f, -16.125f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.875f, 0, -0.25f, -0.875f)
			.setRotationPoint(88.25f, -16.125f, 0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.875f, 0, 0, -0.875f, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.875f, 0, -0.25f, -0.875f)
			.setRotationPoint(87.5f, -16.125f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(87.75f, 2, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.3125f, 0, -0.625f, 0.3125f)
			.setRotationPoint(87.75f, 3.125f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(87.75f, 2, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(87.75f, 2, 5.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.3125f, 0, 0, 0.3125f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.3125f, 0, -0.625f, 0.3125f)
			.setRotationPoint(87.75f, 3.125f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(87.75f, 2, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(71.125f, -20.3125f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(71.125f, -20.3125f, 2.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.4375f, 0, 0.5f, -0.4375f, 0, 0.5f, -0.4375f, 0.5f, 0, -0.4375f, 0.5f)
			.setRotationPoint(71.125f, -20.875f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.4375f, 0, 0.5f, -0.4375f, 0, 0.5f, -0.4375f, 0.5f, 0, -0.4375f, 0.5f)
			.setRotationPoint(71.125f, -20.875f, 2.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.4375f, 0, 0.5f, -0.4375f, 0, 0.5f, -0.4375f, 0.5f, 0, -0.4375f, 0.5f)
			.setRotationPoint(78.1875f, -20.875f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, -0.4375f, 0, 0.5f, -0.4375f, 0, 0.5f, -0.4375f, 0.5f, 0, -0.4375f, 0.5f)
			.setRotationPoint(78.1875f, -20.875f, 2.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.25f, -0.4375f, 0.25f, 0.75f, -0.4375f, 0.25f, 0.75f, -0.4375f, 0.75f, 0.25f, -0.4375f, 0.75f)
			.setRotationPoint(71.125f, -21.6875f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.25f, -0.4375f, 0.25f, 0.75f, -0.4375f, 0.25f, 0.75f, -0.4375f, 0.75f, 0.25f, -0.4375f, 0.75f)
			.setRotationPoint(71.125f, -21.6875f, 2.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.25f, -0.4375f, 0.25f, 0.75f, -0.4375f, 0.25f, 0.75f, -0.4375f, 0.75f, 0.25f, -0.4375f, 0.75f)
			.setRotationPoint(78.1875f, -21.6875f, -4.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0.25f, -0.4375f, 0.25f, 0.75f, -0.4375f, 0.25f, 0.75f, -0.4375f, 0.75f, 0.25f, -0.4375f, 0.75f)
			.setRotationPoint(78.1875f, -21.6875f, 2.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(71.375f, -21.125f, -3.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(71.375f, -21.125f, 2.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(78.4375f, -21.125f, -3.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(78.4375f, -21.125f, 2.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(71.375f, -22.25f, -3.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(71.375f, -22.25f, 2.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(78.4375f, -22.25f, -3.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(78.4375f, -22.25f, 2.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.875f, 0, -0.625f, 0.875f)
			.setRotationPoint(71.375f, -22.625f, -3.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.875f, 0, -0.625f, 0.875f)
			.setRotationPoint(78.4375f, -22.625f, -3.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 333, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(72.375f, -22.625f, -3.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.0625f, -0.625f, 0, 0.0625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(72.375f, -22.625f, 2.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(73.0625f, -24, -3.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(73.0625f, -24, 2.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 128, textureX, textureY)
			.addShapeBox(-0.625f, -0.375f, 0, 1, 1, 5, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0.875f, -0.25f, 0, 0.875f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.875f, -0.25f, -0.25f, 0.875f)
			.setRotationPoint(73.5625f, -23.5f, -2.9375f).setRotationAngle(0, 0, -26.25f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 97, textureX, textureY)
			.addShapeBox(0.375f, -0.375f, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(73.5625f, -23.5f, -0.5f).setRotationAngle(0, 0, -26.25f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 105, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(84.1875f, -28.8125f, -1.25f).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 105, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(84.1875f, -28.8125f, 0.5f).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 95, textureX, textureY)
			.addShapeBox(-13.25f, -0.5f, 0, 13, 1, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, -0.25f, 0, 0, -3.25f, 0, -0.25f, 3, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -3.25f)
			.setRotationPoint(84.1875f, -28.8125f, -1.25f).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, 0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f, -0.75f, 0, 0.125f, -0.75f)
			.setRotationPoint(72.3125f, -37, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 82, textureX, textureY)
			.addShapeBox(-13.25f, -0.5f, 0, 13, 1, 1, 0, 0, 0, -3.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 3, 0, -0.25f, -3.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, -0.25f, 3)
			.setRotationPoint(84.1875f, -28.8125f, 0.25f).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 105, textureX, textureY)
			.addShapeBox(-14.25f, -0.5f, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(84.1875f, -28.8125f, -4.25f).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 67, 105, textureX, textureY)
			.addShapeBox(-14.25f, -0.5f, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f)
			.setRotationPoint(84.1875f, -28.8125f, 3.5f).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 73, textureX, textureY)
			.addShapeBox(0.25f, -0.375f, 0, 2, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(84.1875f, -28.8125f, -1).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 59, textureX, textureY)
			.addShapeBox(0.25f, -0.375f, 0, 2, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(84.1875f, -28.8125f, 0.5f).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -0.5f, -0.375f, 0)
			.setRotationPoint(78.1875f, -23.25f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0.875f, -0.5f, 0, 0.875f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(78.6875f, -23.25f, -0.25f).setRotationAngle(0, 0, -34.4375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, -0.5f, -0.375f, 0)
			.setRotationPoint(78.1875f, -23.25f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 103, textureX, textureY)
			.addShapeBox(1.25f, -0.375f, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(84.1875f, -28.8125f, -0.5f).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 102, textureX, textureY)
			.addShapeBox(1.25f, -0.375f, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f)
			.setRotationPoint(84.1875f, -28.8125f, 0.25f).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 127, textureX, textureY)
			.addShapeBox(-7.625f, -0.375f, 0, 1, 1, 5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(84.1875f, -28.8125f, -2.5f).setRotationAngle(0, 0, 33.375f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5625f, 0, 0, 0.5625f, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0.5625f, -0.75f, 0, 0.5625f, -0.75f, 0.25f, 0, -0.75f, 0.25f)
			.setRotationPoint(71.5625f, -37.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, 0, 0, 0, 0, 0, 0.125f, -0.75f, 0.125f, 0.125f, -0.75f, 0.125f, 0.125f, 0, 0, 0.125f, 0)
			.setRotationPoint(72.3125f, -37, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0.25f, 0.5625f, 0, 0.25f, 0.5625f, 0, 0, 0, 0, 0, 0, -0.75f, 0.25f, 0.5625f, -0.75f, 0.25f, 0.5625f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(71.5625f, -37.25f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.75f, 0.5f, -0.625f, -0.75f, 0.5f, -0.625f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(71.5625f, -37.5f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, 0, 0, 0, 0, -0.75f, 0.5f, -0.625f, -0.75f, 0.5f, -0.625f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(73.75f, -37.5f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1.9375f, -0.625f, 0, -1.9375f, -0.625f, -0.25f, 0.9375f, 0, -0.25f, 0.9375f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0, -0.625f, -0.4375f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(71.5625f, -37.5f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1.9375f, -0.625f, 0, -1.9375f, -0.625f, -0.25f, 0.9375f, 0, -0.25f, 0.9375f, 0, -0.4375f, 0, -0.625f, -0.4375f, 0, -0.625f, -0.4375f, -0.75f, 0, -0.4375f, -0.75f)
			.setRotationPoint(73.75f, -37.5f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(71.5625f, -35.9375f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(73.75f, -35.9375f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0.9375f, -0.625f, -0.25f, 0.9375f, -0.625f, 0, -1.9375f, 0, 0, -1.9375f, 0, -0.4375f, -0.75f, -0.625f, -0.4375f, -0.75f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(71.5625f, -37.5f, 5.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.25f, 0.9375f, -0.625f, -0.25f, 0.9375f, -0.625f, 0, -1.9375f, 0, 0, -1.9375f, 0, -0.4375f, -0.75f, -0.625f, -0.4375f, -0.75f, -0.625f, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(73.75f, -37.5f, 5.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(71.5625f, -35.9375f, 5.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, -0.625f, -0.625f, -0.75f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(73.75f, -35.9375f, 5.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-0.4375f, 3, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-14.125f, 3, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-36.5f, 3, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(-50.1875f, 3, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(41.4375f, 3, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2, -0.1875f, 0, 0, -0.1875f, 0, 0)
			.setRotationPoint(21.3125f, 3, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2)
			.setRotationPoint(-0.4375f, 3, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2)
			.setRotationPoint(-14.125f, 3, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2)
			.setRotationPoint(-36.5f, 3, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2)
			.setRotationPoint(-50.1875f, 3, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2)
			.setRotationPoint(41.4375f, 3, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, 0, -0.1875f, 0, -2, -0.1875f, 0, -2)
			.setRotationPoint(21.3125f, 3, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 14, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0.375f, -0.475f, 0.625f, 0.375f, -0.475f, 0.625f, 0.375f, 0.475f, 0, 0.375f, 0.475f)
			.setRotationPoint(78.625f, -13.375f, -10.51f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 14, 1, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0.375f, 0.475f, 0.625f, 0.375f, 0.475f, 0.625f, 0.375f, -0.475f, 0, 0.375f, -0.475f)
			.setRotationPoint(78.625f, -13.375f, 9.51f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 14, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.475f, 0.875f, 0.4375f, -0.475f, 0.875f, 0.4375f, 0.475f, 0, 0.4375f, 0.475f)
			.setRotationPoint(-13.625f, -13.4375f, -10.51f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 14, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0, 0, 0, 0, 0.4375f, 0.475f, 0.875f, 0.4375f, 0.475f, 0.875f, 0.4375f, -0.475f, 0, 0.4375f, -0.475f)
			.setRotationPoint(-13.625f, -13.4375f, 9.51f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 14, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0, 0, 0, 0, 0.4375f, -0.475f, 0.875f, 0.4375f, -0.475f, 0.875f, 0.4375f, 0.475f, 0, 0.4375f, 0.475f)
			.setRotationPoint(-6.75f, -13.4375f, -10.51f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 14, 1, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0, 0, 0, 0, 0.4375f, 0.475f, 0.875f, 0.4375f, 0.475f, 0.875f, 0.4375f, -0.475f, 0, 0.4375f, -0.475f)
			.setRotationPoint(-6.75f, -13.4375f, 9.51f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.5f, -13.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-87.5f, -13.25f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f)
			.setRotationPoint(-87.5f, -13.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0.5625f, 0.6875f, 0, 0.5625f, 0.6875f, 0, 0.5625f, -0.6875f, 0, 0.5625f, -0.6875f)
			.setRotationPoint(-87.5f, -21.3125f, -9.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0.5625f, -0.6875f, 0, 0.5625f, -0.6875f, 0, 0.5625f, 0.6875f, 0, 0.5625f, 0.6875f)
			.setRotationPoint(-87.5f, -21.3125f, 8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.0625f, 0, 0, 0.0625f, 0, 0, 0.0625f, 0.25f, 0, 0.0625f, 0.25f)
			.setRotationPoint(-87.5f, -21.3125f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, -1.1875f, 0.8125f, 0, -1.1875f, 0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0.8125f, 0, 0.3125f, 0.8125f)
			.setRotationPoint(-87.5f, -22.625f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -1.1875f, 0.8125f, 0, -1.1875f, 0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0.8125f, 0, 0.3125f, 0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-87.5f, -22.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-87.5f, -22.625f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -1, -0.875f, 0, -1, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(-87.5f, -22.3125f, 9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.875f, 0, -1, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.5f, -22.3125f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -1, -0.75f, 0, -1, -0.75f)
			.setRotationPoint(-87.5f, 1.75f, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-87.5f, 1.75f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f)
			.setRotationPoint(-87.5f, 1.75f, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.5f, 0.75f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.5f, 0.75f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.5f, -14.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 15, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.5f, -14.25f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-89.5f, -14.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.8125f, 0, 0, 0.8125f, 0, 0, 0.8125f, 0.5f, 0, 0.8125f, 0.5f)
			.setRotationPoint(-89.5f, -16.0625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1.8125f, 0, 0, -1.8125f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.8125f, 0, 0, 0.8125f, 0, 0, 0.8125f, 0.25f, 0, 0.8125f, 0.25f)
			.setRotationPoint(-89.5f, -16.0625f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -1.8125f, 0, 0, -1.8125f, 0, 0, 0.8125f, 0.25f, 0, 0.8125f, 0.25f, 0, 0.8125f, 0, 0, 0.8125f, 0)
			.setRotationPoint(-89.5f, -16.0625f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -1.75f, 0, 0, 0.875f, 0, 0, 0, 0, 0, -0.875f, 0, 0, -1.75f, -0.5f, 0, 0.875f, -0.5f, 0, 0, -0.5f, 0, -0.875f, -0.5f, 0)
			.setRotationPoint(-89.375f, -16, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.875f, 0, 0, 0, 0, 0, 0.875f, 0, 0, -1.75f, 0, 0, -0.875f, -0.5f, 0, 0, -0.5f, 0, 0.875f, -0.5f, 0, -1.75f, -0.5f, 0)
			.setRotationPoint(-89.375f, -16, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.875f, -0.75f, -0.25f, -0.875f)
			.setRotationPoint(-88.5f, -16.125f, -5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.875f, -0.75f, -0.25f, -0.875f)
			.setRotationPoint(-89.25f, -16.125f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.875f, -0.75f, -0.25f, -0.875f)
			.setRotationPoint(-89.25f, -16.125f, 0.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.875f, -0.75f, 0, -0.875f, -0.75f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.875f, -0.75f, -0.25f, -0.875f)
			.setRotationPoint(-88.5f, -16.125f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.8125f, 0, 0, -0.8125f, 0, 0, -0.8125f, 0.5f, 0, -0.8125f, 0.5f)
			.setRotationPoint(75.125f, -19.625f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(77.625f, -19.4375f, -7.5625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f)
			.setRotationPoint(78.375f, -21.6875f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(78.875f, -20.1875f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -1, 0, 0, -1, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(86, -18.8125f, 7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.325f, 0, 0, -0.325f, 0, 0, -0.3f, -0.625f, 0, -0.3f)
			.setRotationPoint(85.125f, -7.4375f, -11.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.325f, -0.625f, 0, -0.325f)
			.setRotationPoint(85.125f, -7.4375f, 10.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.325f, -0.625f, 0, -0.325f)
			.setRotationPoint(77.125f, -7.4375f, 10.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.325f, 0, 0, -0.325f, 0, 0, -0.3f, -0.625f, 0, -0.3f)
			.setRotationPoint(0, -7.4375f, -11.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.3f, 0, 0, -0.3f, 0, 0, -0.325f, -0.625f, 0, -0.325f)
			.setRotationPoint(-15.125f, -7.4375f, 10.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(87.5f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(87.5f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(89.5f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.5f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-88.5f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-90.5f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-90.5f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.8125f, 0, 0, 0.8125f, 0, 0, 0.8125f, 0, 0, 0.8125f, 0)
			.setRotationPoint(78.5f, 3, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(86.5f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78, 3, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(79.375f, 5.8125f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(88.375f, 8.6875f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(88, 7.9375f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(87.625f, 7.1875f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(87.25f, 6.4375f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(87.625f, 7.1875f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(87.25f, 6.4375f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(87.25f, 6.8125f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(87.625f, 7.5625f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(88, 8.3125f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(87.25f, 6.8125f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(87.625f, 7.5625f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(88, 8.3125f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, -0.625f, -0.1875f, 0, -0.625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(86.5f, 3, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, 0, -0.625f, -0.1875f, 0, -0.625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(86.5f, 3, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(86.875f, 6.4375f, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(86.875f, 6.4375f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(86.25f, 8.6875f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(86.25f, 8.6875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(86.625f, 7.9375f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(86.625f, 7.9375f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(86.625f, 7.1875f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(86.625f, 7.1875f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(86.25f, 6.4375f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(86.25f, 6.4375f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0.25f, -4.875f, 3.375f, 0.25f, -4.875f, -4, 0, 0, -0.625f, 0, -0.625f, 0, 0.25f, 4.25f, 3.375f, 0.25f, 4.25f, -4, 0, -0.625f, -0.625f)
			.setRotationPoint(81, 3.625f, -2.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.625f, 0.25f, -4.875f, -4, 0.25f, -4.875f, 3.375f, 0, 0, 0, 0, -0.625f, -0.625f, 0.25f, 4.25f, -4, 0.25f, 4.25f, 3.375f, 0, -0.625f, 0)
			.setRotationPoint(81, 3.625f, 1.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.625f, 0, -0.125f, -0.625f)
			.setRotationPoint(86.25f, 6.8125f, -6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, -0.125f, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.625f, 0, -0.125f, -0.625f)
			.setRotationPoint(86.25f, 6.8125f, 5.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.5f, 3, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 19, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.3125f, 3, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.0625f, 3, 1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.9375f, 4.6875f, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, 4.6875f, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.6875f, 0, 0, 0.6875f, 0, 0, 0.6875f, 0, 0, 0.6875f, 0)
			.setRotationPoint(5.5f, 3, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.6875f, 0, 0, 0.6875f, 0, 0, 0.6875f, 0, 0, 0.6875f, 0)
			.setRotationPoint(22.9375f, 3, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.875f, 3, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12.875f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5625f, 3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.375f, 3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.4375f, 3, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.6875f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 11, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.875f, 3, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 9, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-5.4375f, 3, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 9, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-2.6875f, 3, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.5625f, 3, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, 3, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48.5f, 3, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(42.0625f, 3, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(70.125f, -13.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(70.125f, -11.75f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f)
			.setRotationPoint(70.125f, -11.75f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f)
			.setRotationPoint(70.125f, -17.125f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0.375f, -0.375f, 0, 0.375f, -0.375f, 0, 0.375f, 0.375f, 0, 0.375f, 0.375f)
			.setRotationPoint(70.125f, -17.125f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0)
			.setRotationPoint(70.125f, -18.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, -1.375f, 0, 0, -1.375f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0)
			.setRotationPoint(70.125f, -18.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0.625f, 0)
			.setRotationPoint(70.125f, -18.75f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(70.125f, -17.125f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.125f, 0, 0, 0.125f, 0, 0, 0.125f, 0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(70.125f, -17.125f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0.875f, 0)
			.setRotationPoint(70.125f, -17.125f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f)
			.setRotationPoint(70.125f, -17.375f, -9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(70.125f, -17.375f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(72.625f, -37, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(72.625f, -37, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 61, 1, 7, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5f, -10.25f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 61, 1, 7, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5f, -10.25f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 64, 1, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5f, -10.25f, -10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 64, 1, 7, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5f, -10.25f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 22, 2, 0, -0.001f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.001f, 0, 0, -0.001f, 0.3125f, 0, 0.375f, 0.3125f, 0, 0.375f, 0.3125f, 0, -0.001f, 0.3125f, 0)
			.setRotationPoint(0.125f, -21.3125f, 8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 22, 2, 0, -0.001f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.001f, 0, 0, -0.001f, 0.3125f, 0, 0.375f, 0.3125f, 0, 0.375f, 0.3125f, 0, -0.001f, 0.3125f, 0)
			.setRotationPoint(0.125f, -21.3125f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(0.125f, -13.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.375f, 0, 0.25f, 0.375f)
			.setRotationPoint(0.125f, -13.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 5, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.375f, 0, 0.25f, 0.375f, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(0.125f, -13.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 16, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0.75f, 0, 0.0625f, 0.75f, 0, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(0.125f, -21.3125f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, -1.1875f, 0.8125f, 0, -1.1875f, 0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0.8125f, 0, 0.3125f, 0.8125f)
			.setRotationPoint(0.125f, -22.625f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -1.1875f, 0.8125f, 0, -1.1875f, 0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0.8125f, 0, 0.3125f, 0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(0.125f, -22.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(0.125f, -22.625f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -1, -0.875f, 0, -1, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(0.125f, -22.3125f, 9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.875f, 0, -1, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0.125f, -22.3125f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 22, 2, 0, -0.001f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.001f, 0, 0, -0.001f, 0.3125f, 0, 0.375f, 0.3125f, 0, 0.375f, 0.3125f, 0, -0.001f, 0.3125f, 0)
			.setRotationPoint(-22, -21.3125f, 8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 22, 2, 0, -0.001f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, -0.001f, 0, 0, -0.001f, 0.3125f, 0, 0.375f, 0.3125f, 0, 0.375f, 0.3125f, 0, -0.001f, 0.3125f, 0)
			.setRotationPoint(-22, -21.3125f, -10.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-14.625f, -13.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.375f, 0, 0.25f, 0.375f)
			.setRotationPoint(-14.625f, -13.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 5, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.375f, 0, 0.25f, 0.375f, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-14.625f, -13.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 16, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0.0625f, 0.75f, 0, 0.0625f, 0.75f, 0, 0.0625f, 0, 0, 0.0625f, 0)
			.setRotationPoint(-14.625f, -21.3125f, -7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, -1.1875f, 0.8125f, 0, -1.1875f, 0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0.8125f, 0, 0.3125f, 0.8125f)
			.setRotationPoint(-14.625f, -22.625f, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -1.1875f, 0.8125f, 0, -1.1875f, 0.8125f, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0.8125f, 0, 0.3125f, 0.8125f, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-14.625f, -22.625f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-14.625f, -22.625f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -1, -0.875f, 0, -1, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f)
			.setRotationPoint(-14.625f, -22.3125f, 9.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, -0.875f, 0, -1, -0.875f, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.625f, -22.3125f, -10.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 22, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(7.5f, -21.3125f, 7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, -23, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.125f, 0, 0.25f, 0.125f)
			.setRotationPoint(7.5f, -10.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 13, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0.375f, 0.75f, 0, 0.375f, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(1.125f, -23, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 22, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(7.5f, -21.3125f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, -23, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.125f, 0, 0.25f, 0.125f)
			.setRotationPoint(7.5f, -10.25f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 174, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 13, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0.375f, 0.75f, 0, 0.375f, 0.75f, 0, 0, 0.75f, 0)
			.setRotationPoint(1.125f, -23, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 103, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 22, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-22, -21.3125f, 7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -23, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.125f, 0, 0.25f, 0.125f)
			.setRotationPoint(-22, -10.25f, 4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 13, 1, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.375f, 0.75f, 0)
			.setRotationPoint(-18.625f, -23, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 22, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-22, -21.3125f, -8.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 24, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -23, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.125f, 0, 0.25f, 0.125f)
			.setRotationPoint(-22, -10.25f, -7.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 13, 1, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.375f, 0.75f, 0)
			.setRotationPoint(-18.625f, -23, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0.625f, 0, -1, 0.625f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.625f, 0, 0.25f, 0.625f)
			.setRotationPoint(85.5f, -6.25f, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 19, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0.375f, 0.625f, 0, 0.375f, 0.625f, 0, 0, 0.625f, 0)
			.setRotationPoint(71.125f, -18.625f, -4.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f)
			.setRotationPoint(85.5f, -5, -9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, -1, 0.25f, 0.5f, -1, 0.25f, 0.5f, 0, -1.25f, 0, 0, -1.25f)
			.setRotationPoint(85.5f, 2, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.71f, 0, 0, -0.71f, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.71f, 0, 0, -0.71f)
			.setRotationPoint(78.375f, 2, 9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(78.375f, 1.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(85.25f, 1.75f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 4, -0.75f, 0, 4, -0.75f, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.375f, 3, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 4, -0.75f, 0, 4, -0.75f, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(85.25f, 3, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(78.625f, 6.75f, 7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(78.625f, 5.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(78.625f, 4.25f, 4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.625f, 4.5f, 5.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0.25f, -0.375f, -0.375f, 0.25f, -0.375f, -0.375f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(78.625f, 3, 4.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(78.625f, 5.75f, 6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(-63.9375f, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 53, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.8125f, 0, 0, 0.8125f, 0, 0, 0.8125f, 0, 0, 0.8125f, 0)
			.setRotationPoint(-86.5f, 3, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-87.5f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.375f, 5.8125f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 4, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, 0.275f, 0.75f, 0, 0.275f, 0.75f, 0, -1.025f, 0, 0, -1.025f)
			.setRotationPoint(-13.625f, -18, -10.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 4, 1, 0, 0, 0, -0.6875f, 0.75f, 0, -0.6875f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -1.025f, 0.75f, 0, -1.025f, 0.75f, 0, 0.275f, 0, 0, 0.275f)
			.setRotationPoint(-13.625f, -18, 9.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 173, 2, 18, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-86.5f, 1, -9.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, -0.875f, 0)
			.setRotationPoint(61.6875f, 3, -1).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
		//
	}

}
