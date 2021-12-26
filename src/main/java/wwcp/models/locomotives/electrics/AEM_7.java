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
public class AEM_7 extends RollingStockModel {

	public AEM_7(){
		super(); textureX = 512; textureY = 512;
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.5f, -0.75f, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 458, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 7, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3, 0.25f, -9).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 228, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(25.875f, 0.25f, -1).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-35.5f, -14.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.5f, -16.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 5, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.5f, -16.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.5f, -16.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 1, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.5f, -16.25f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 1, 0, 0, 0, -1, 0, 0, -1, 0, -1, 0.25f, 0, -1, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-35.5f, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-35.5f, -16.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-35.5f, -16.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(-35.5f, -16.25f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 1, 0, 0, -1, 0.25f, 0, -1, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.5f, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-35.5f, 0.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-35.5f, 0.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, -1.625f, 0, 0, 1, 0, 0, 1, 0, -0.625f, -1.625f, 0, -0.625f)
			.setRotationPoint(46.3125f, -11.875f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-53.25f, -7.375f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.25f, -0.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2.375f, -0.625f, 0, -2.375f, -0.625f, 0, -2.375f, -0.625f, 0, 2.375f, -0.625f, 0)
			.setRotationPoint(-50.875f, -15.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 5, 0, -0.375f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.0625f, 0, 0, -0.0625f, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(-50.5f, -16.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, -0.1875f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.625f, 0, 0, 0.125f, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0.9375f, 0, 0)
			.setRotationPoint(-49.5f, -16.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, -1.1875f, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 0.8125f, 0, 0, -0.5625f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 1.125f, 0, 0)
			.setRotationPoint(-48.5f, -16.25f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 5, 0, -0.4375f, 0, 0, 0.4375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.4375f, -0.375f, 0, 0.4375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-53.25f, -7.375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 3, 0, -0.8125f, 0, 0, 0.625f, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.8125f, -0.375f, 0, 0.625f, -0.375f, -0.1875f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-52.8125f, -7.375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1.375f, 0, 0.25f, 0.5f, 0, -0.5625f, -0.1875f, 0, 0.1875f, 0, 0, 0, -1.375f, -0.375f, 0.25f, 0.5f, -0.375f, -0.5625f, -0.1875f, -0.375f, 0.1875f, 0, -0.375f, 0)
			.setRotationPoint(-52, -7.375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 5, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-53.5f, -0.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0)
			.setRotationPoint(-52.5f, -0.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-51.5f, -0.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, -2, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0.125f, 0, 0, -2, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0.125f, 0, 0)
			.setRotationPoint(-50.5f, -0.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 5, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0)
			.setRotationPoint(-53.5f, -0.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 3, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-52.5f, -0.75f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.875f, 0, 0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.875f, 0, 0.25f)
			.setRotationPoint(-51.5f, -0.75f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -2, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -2, 0, 0)
			.setRotationPoint(-50.5f, -0.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0.3125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.3125f, 0, 0, 0.625f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.625f, 0, 0)
			.setRotationPoint(-50.25f, -16.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 1, 0, 0.75f, 0, 0.1f, 0, 0, 0.25f, 0, 0, -0.25f, 0.75f, 0, -0.1f, 0.75f, -0.375f, 0.1f, 0, -0.375f, 0.25f, 0, -0.375f, -0.25f, 0.75f, -0.375f, -0.1f)
			.setRotationPoint(-47.75f, -7.375f, -10.65f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0.125f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0.8125f, 0.125f, -0.375f, -1, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.8125f)
			.setRotationPoint(-50.5f, -7.375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.375f, -0.25f, 0, 0, -0.25f, 0, -0.0625f, 0, 0, 0.0625f, 0, 0, -0.3125f, -0.5f, 0, -0.0625f, -0.5f, 0, -0.2035f, -0.5f, 0, 0.2035f, -0.5f, 0)
			.setRotationPoint(-50.8125f, -15.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.1875f, -0.25f, 0, 0, -0.25f, 0, -1, 0, 0, 0.625f, 0, 0, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -1.0625f, -0.75f, 0, 0.6875f, -0.75f, 0)
			.setRotationPoint(-49.8125f, -15.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 5, 0, -0.52f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, 1.793f, -0.125f, 0, -1.793f, -0.125f, 0, -2.23f, -0.125f, 0, 2.23f, -0.125f, 0)
			.setRotationPoint(-51.02f, -15.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 3, 0, -0.875f, 0, 0, 0.6875f, 0, -0.1875f, -0.21f, 0, 0, 0, 0, 0, 1.5f, -0.125f, 0, -1.6875f, -0.125f, -0.1875f, -2.3125f, -0.125f, 0, 2.3125f, -0.125f, 0)
			.setRotationPoint(-50.5f, -15.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 1, 0, 0, 0.25f, 0.134f, 0, 0.25f, 0.25f, 0, 0, -0.25f, 0, 0, -0.134f, 0, -0.625f, 0.134f, 0, -0.625f, 0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.134f)
			.setRotationPoint(-46.75f, -14.75f, -10.65f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0.25f, 0, -1, 0, 0, -1, 0, -1, 0.25f, 0.25f, -1, 0.25f, 0.25f, 0, -0.22f, 0, 0, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0.22f)
			.setRotationPoint(-46.5f, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -2, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, -0.25f, -2, 0, -0.25f, -0.25f, -0.625f, 0.215f, 0, -0.625f, 0.25f, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.215f)
			.setRotationPoint(-48.75f, -14.75f, -10.535f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -1.6875f, -0.25f, 0.25f, 0.5f, 0, -0.5625f, -0.1875f, 0, 0.1875f, 0, 0, 0, 1, -0.125f, 0.25f, -1.875f, -0.125f, -0.5625f, -2.5625f, -0.125f, 0.1875f, 2.375f, -0.125f, 0)
			.setRotationPoint(-49.625f, -15.25f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -0.8125f, 0, -1, 0, 0, 0.035f, 0, -0.25f, -0.035f, -0.625f, 0.125f, 0.8125f, 1.875f, -0.375f, -1, -1.75f, -0.375f, 0, -1.75f, -0.375f, 0, 1.75f, -0.375f, 0.8125f)
			.setRotationPoint(-48.75f, -15, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, -1, 0, 0, -1, 0, -1, 0.25f, -0.0625f, -1, 0.25f, -1, 0, -0.22f, 0, 0, -0.22f, 0, 0.25f, 0, -0.375f, 0.25f, 0.22f)
			.setRotationPoint(-47.75f, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, -0.78f, -0.5625f, 0, -0.78f, -0.5625f, 0, -0.22f, -0.4375f, 0, -0.22f, 0.1875f, 0, -1.03f, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0.03f)
			.setRotationPoint(-47.75f, -16, -10.78f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.25f, 0, -0.082f, 0, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0.082f, 0.25f, 0, -0.082f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.082f)
			.setRotationPoint(-40.5f, -15, -10.98f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 5, 0, 0.0625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.0625f, 0.25f, 0)
			.setRotationPoint(-50.5f, -16.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0.625f, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.1875f, -0.25f, 0, 0.9375f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.125f, 0.25f, 0)
			.setRotationPoint(-49.5f, -16.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 5, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0, 0, -0.4375f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0)
			.setRotationPoint(-53.25f, -7.375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 3, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, -0.1875f, -0.8125f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0.625f, -0.375f, -0.1875f, -0.8125f, -0.375f, 0)
			.setRotationPoint(-52.8125f, -7.375f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.1875f, 0, 0.1875f, 0.5f, 0, -0.5625f, -1.375f, 0, 0.25f, 0, -0.375f, 0, -0.1875f, -0.375f, 0.1875f, 0.5f, -0.375f, -0.5625f, -1.375f, -0.375f, 0.25f)
			.setRotationPoint(-52, -7.375f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 1, 0, 0.75f, 0, -0.1f, 0, 0, -0.25f, 0, 0, 0.25f, 0.75f, 0, 0.1f, 0.75f, -0.375f, -0.1f, 0, -0.375f, -0.25f, 0, -0.375f, 0.25f, 0.75f, -0.375f, 0.1f)
			.setRotationPoint(-47.75f, -7.375f, 9.65f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, 0.8125f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -1, 0, -0.375f, 0.8125f, 0, -0.375f, 0, 0, -0.375f, 0, 0.125f, -0.375f, -1)
			.setRotationPoint(-50.5f, -7.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0.0625f, 0, 0, -0.0625f, 0, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, 0.2035f, -0.5f, 0, -0.2035f, -0.5f, 0, -0.0625f, -0.5f, 0, -0.3125f, -0.5f, 0)
			.setRotationPoint(-50.8125f, -15.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.625f, 0, 0, -1, 0, 0, 0, -0.25f, 0, -0.1875f, -0.25f, 0, 0.6875f, -0.75f, 0, -1.0625f, -0.75f, 0, 0, -0.75f, 0, -0.1875f, -0.75f, 0)
			.setRotationPoint(-49.8125f, -15.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 5, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, -0.52f, 0, 0, 2.23f, -0.125f, 0, -2.23f, -0.125f, 0, -1.793f, -0.125f, 0, 1.793f, -0.125f, 0)
			.setRotationPoint(-51.02f, -15.25f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 3, 0, 0, 0, 0, -0.21f, 0, 0, 0.6875f, 0, -0.1875f, -0.875f, 0, 0, 2.3125f, -0.125f, 0, -2.3125f, -0.125f, 0, -1.6875f, -0.125f, -0.1875f, 1.5f, -0.125f, 0)
			.setRotationPoint(-50.5f, -15.25f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 1, 0, 0, 0, -0.134f, 0, 0, -0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.134f, 0, -0.625f, -0.134f, 0, -0.625f, -0.25f, 0, -0.625f, 0.25f, 0, -0.625f, 0.134f)
			.setRotationPoint(-46.75f, -14.75f, 9.65f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0.25f, -1, 0.25f, 0, -1, 0.25f, 0, 0, -1, 0.25f, 0, -1, 0.25f, 0.25f, 0.22f, 0, 0.25f, 0, 0, 0, 0, 0.25f, 0, -0.22f)
			.setRotationPoint(-46.5f, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -2, 0, -0.25f, 0, 0, -0.25f, 0, 0.25f, 0.25f, -2, 0.25f, 0.25f, -0.25f, -0.625f, -0.215f, 0, -0.625f, -0.25f, 0, -0.625f, 0.25f, -0.25f, -0.625f, 0.215f)
			.setRotationPoint(-48.75f, -14.75f, 9.535f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0.8125f, 0, 0, 0, 0, 0, 0, -0.25f, 0.5f, -1.1875f, -0.25f, 0.5f, 1.125f, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, -0.5625f, 0.25f, 0.25f)
			.setRotationPoint(-48.5f, -16.25f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, 0, 0, -0.1875f, 0, 0.1875f, 0.5f, 0, -0.5625f, -1.6875f, -0.25f, 0.25f, 2.375f, -0.125f, 0, -2.5625f, -0.125f, 0.1875f, -1.875f, -0.125f, -0.5625f, 1, -0.125f, 0.25f)
			.setRotationPoint(-49.625f, -15.25f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, -0.625f, 0.125f, 0.8125f, 0, -0.25f, -0.035f, 0, 0, 0.035f, -0.8125f, 0, -1, 1.75f, -0.375f, 0.8125f, -1.75f, -0.375f, 0, -1.75f, -0.375f, 0, 1.875f, -0.375f, -1)
			.setRotationPoint(-48.75f, -15, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, -1, 0.25f, 0, -1, 0.25f, 0, 0, -1, -0.4375f, 0, -1, -0.375f, 0.25f, 0.22f, 0, 0.25f, 0, 0, 0, -0.22f, -1, 0, -0.22f)
			.setRotationPoint(-47.75f, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, -0.22f, -0.5625f, 0, -0.22f, -0.5625f, 0, -0.78f, -0.4375f, 0, -0.78f, -0.4375f, 0, 0.03f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, -1.03f)
			.setRotationPoint(-47.75f, -16, 9.78f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.25f, -0.25f, 0.082f, 0, -0.25f, 0, 0, 0, 0, 0.25f, 0, -0.082f, 0.25f, 0, 0.082f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.082f)
			.setRotationPoint(-40.5f, -15, 9.98f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 273, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-48.5f, -3.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-48.5f, -6.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.25f, 0.25f, 0, -0.625f, 0.25f, 0, 0, 0, 0, 0.625f, 0, -0.625f, -1.25f, 0.25f, -0.625f, -0.625f, 0.25f, -0.625f, 0, 0, -0.625f, 0.625f)
			.setRotationPoint(-49.75f, -3.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.25f, 0.25f, 0, -0.625f, 0.25f, 0, 0, 0, 0, 0.625f, 0, -0.625f, -1.25f, 0.25f, -0.625f, -0.625f, 0.25f, -0.625f, 0, 0, -0.625f, 0.625f)
			.setRotationPoint(-49.75f, -6.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0.25f, 0, 0.75f, 0.25f)
			.setRotationPoint(-53.6875f, -8, -1.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, -0.875f, 0.25f, 0, -0.875f, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(-53.8125f, -7.75f, -1.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, -0.875f, 0.25f, 0, -0.875f, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(-53.8125f, -7.75f, 0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.9375f, -7.625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.9375f, -7.625f, 0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(-53.5f, -5.875f, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.5f, 0, 0, 0.5f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.5f, 0, -0.625f, 0.5f)
			.setRotationPoint(-53.5f, -3.25f, -1.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.001f, -0.625f, 0, -0.001f, -0.625f, 0, -0.001f, 0, 0, -0.001f, 0, -0.625f, -0.001f, -0.625f, -0.625f, -0.001f, -0.625f, -0.625f, -0.001f, 0, -0.625f, -0.001f)
			.setRotationPoint(-53.1875f, -8.875f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.001f, -0.625f, 0, -0.001f, -0.625f, 0, -0.001f, 0, 0, -0.001f, 0, -0.625f, -0.001f, -0.625f, -0.625f, -0.001f, -0.625f, -0.625f, -0.001f, 0, -0.625f, -0.001f)
			.setRotationPoint(-52.5625f, -11, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.001f, -0.625f, 0, -0.001f, -0.625f, 0, -0.001f, 0, 0, -0.001f, 0, -0.625f, -0.001f, -0.625f, -0.625f, -0.001f, -0.625f, -0.625f, -0.001f, 0, -0.625f, -0.001f)
			.setRotationPoint(-51.9375f, -13.25f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-52.875f, -8.25f, -7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-52.875f, -8.25f, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-52.875f, -7.5f, -7.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-52.875f, -7.5f, -7.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-53, -8.125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-53, -8.125f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f, -0.875f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-53, -7.625f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-53, -7.625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-52.875f, -8.25f, 6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-52.875f, -8.25f, 6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-52.875f, -7.5f, 6.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-52.875f, -7.5f, 6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-53, -8.125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-53, -8.125f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 488, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-53, -7.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f, -0.875f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-53, -7.625f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -1.125f, 0, 0, 0.5f, 0, 0, 0, 0, 0, -0.625f, 0, 0, -1.125f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-54.125f, -7.3125f, -5.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.625f, 0, 0, 0, 0, 0, 0.5f, 0, 0, -1.125f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0.5f, -0.625f, 0, -1.125f, -0.625f, 0)
			.setRotationPoint(-54.125f, -7.3125f, 1.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-51.625f, -16.0625f, -0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-51.625f, -16.0625f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-51.625f, -15.3125f, -0.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-51.625f, -15.3125f, -0.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-51.75f, -15.9375f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-51.75f, -15.9375f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f, -0.875f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-51.75f, -15.4375f, -0.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(-51.75f, -15.4375f, -0.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, -0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0, 0, 0, 0.5f, 0, 0, -0.25f, 0.25f, 0.5f, 0.25f, 0.25f, 0.5f, 0, 0.25f, 0, 0.5f, 0.25f, 0)
			.setRotationPoint(-51, -16.3125f, -6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f)
			.setRotationPoint(-51.25f, -16.3125f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, -0.028f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.028f, 0.5f, -0.125f, -0.028f, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0.028f)
			.setRotationPoint(-36.5f, 0.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, -0.107f, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.107f, 0.5f, -0.125f, -0.107f, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0.107f)
			.setRotationPoint(-45.125f, 0.25f, -10.913f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.125f, 0, -0.193f, 0, 0, 0, 0, 0, 0, 0.125f, 0, 0.193f, 0.125f, 1, -0.193f, 0, 0.75f, 0, 0, 0.75f, 0, 0.125f, 1, 0.193f)
			.setRotationPoint(-45.5f, 1.125f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0.028f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.028f, 0.5f, -0.125f, 0.028f, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, -0.125f, -0.028f)
			.setRotationPoint(-36.5f, 0.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.5f, 0, 0.107f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.107f, 0.5f, -0.125f, 0.107f, 0, -0.125f, 0, 0, -0.125f, 0, 0.5f, -0.125f, -0.107f)
			.setRotationPoint(-45.125f, 0.25f, 9.913f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 455, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0.125f, 0, 0.193f, 0, 0, 0, 0, 0, 0, 0.125f, 0, -0.193f, 0.125f, 1, 0.193f, 0, 0.75f, 0, 0, 0.75f, 0, 0.125f, 1, -0.193f)
			.setRotationPoint(-45.5f, 1.125f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0.4375f, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, -1.5f, 0.4375f, 0)
			.setRotationPoint(-53.25f, 0.25f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -2.1875f, 0.4375f, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, -1.75f, 0.4375f, 0)
			.setRotationPoint(-53.5f, 0.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, -2, 0.4375f, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, -1.1875f, 0.4375f, 0)
			.setRotationPoint(-52.5f, 0.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, -2.375f, 0.4375f, 0.25f, 0, 0.4375f, 0.25f, 0, 0.4375f, 0, -1, 0.4375f, 0)
			.setRotationPoint(-51.5f, 0.25f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -2, 0, 0, 0.875f, 0, 0.055f, 0.875f, 0, 0, 0.125f, 0, 0, -3.5f, 0.4375f, 0, 0.875f, 0.4375f, 0.055f, 0.875f, 0.4375f, 0, -1.375f, 0.4375f, 0)
			.setRotationPoint(-50.5f, 0.25f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -1.75f, 0.4375f, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, -2.1875f, 0.4375f, 0)
			.setRotationPoint(-53.5f, 0.25f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 97, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1.1875f, 0.4375f, 0, 0, 0.4375f, 0, 0, 0.4375f, 0, -2, 0.4375f, 0)
			.setRotationPoint(-52.5f, 0.25f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.875f, 0, 0.25f, -1, 0.4375f, 0, 0, 0.4375f, 0, 0, 0.4375f, 0.25f, -2.375f, 0.4375f, 0.25f)
			.setRotationPoint(-51.5f, 0.25f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.125f, 0, 0, 0.875f, 0, 0, 0.875f, 0, 0.055f, -2, 0, 0, -1.375f, 0.4375f, 0, 0.875f, 0.4375f, 0, 0.875f, 0.4375f, 0.055f, -3.5f, 0.4375f, 0)
			.setRotationPoint(-50.5f, 0.25f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.8125f, 1.6875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 1.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 1.5f, -0.5f)
			.setRotationPoint(-47.625f, 1.6875f, -10.807f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -2, 0, 0.5f, 1.5f, 0, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0, -2, 0.5f, 0.5f, 1.5f, 0.5f, 0.5f)
			.setRotationPoint(-50.8125f, 7.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, -0.5f, 0, 0, 0, 0, 0, -1.5f, 0, 0, 1, 0, 0, 1.4375f, 0.375f, 0, -1.9375f, 0.375f, 0, -3.9375f, 0.375f, 0, 3.4375f, 0.375f, 0)
			.setRotationPoint(-48.875f, 6.1875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 10, 0, -0.5f, 0, 0, 0, 0, 0, -1.5f, 0, 0, 1, 0, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0, -1.5f, 0.5f, 0, 1, 0.5f, 0)
			.setRotationPoint(-48.875f, 1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.1875f, 0, 0.5f, -0.8125f, -0.25f, 0.5f, 0, -0.25f, 0.5f, -0.5f, -0.5f, 0.5f, -0.1875f)
			.setRotationPoint(-48.375f, 1.6875f, -10.807f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0.5f, 0, 0, 0, 0, 0, 0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0.25f, 0.5f, -0.25f, 0.25f, 0.5f)
			.setRotationPoint(-51, -16.3125f, 1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 1.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 1.5f, 0)
			.setRotationPoint(-47.625f, 1.6875f, 9.807f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 1.5f, 0, 0.5f, -2, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0, 1.5f, 0.5f, 0.5f, -2, 0.5f, 0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-50.8125f, 7.5625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 1, 0, 0, -1.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, 3.4375f, 0.375f, 0, -3.9375f, 0.375f, 0, -1.9375f, 0.375f, 0, 1.4375f, 0.375f, 0)
			.setRotationPoint(-48.875f, 6.1875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 10, 0, 1, 0, 0, -1.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, 1, 0.5f, 0, -1.5f, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-48.875f, 1.6875f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.1875f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0, -0.8125f, -0.5f, 0.5f, -0.1875f, -0.25f, 0.5f, -0.5f, -0.25f, 0.5f, 0, 0, 0.5f, -0.8125f)
			.setRotationPoint(-48.375f, 1.6875f, 9.807f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-51.3125f, 2, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-52.6875f, 2.1875f, -9.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-52.6875f, 2.1875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-52.8125f, 2.1875f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-52.8125f, 2.1875f, -7.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-51.3125f, 6.0625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-49.3125f, 3.0625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-51.9375f, 3.0625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f)
			.setRotationPoint(-51.8125f, 1.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-51.3125f, 2, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-52.6875f, 2.1875f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-52.6875f, 2.1875f, 9.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-52.8125f, 2.1875f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-52.8125f, 2.1875f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-51.3125f, 6.0625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f)
			.setRotationPoint(-49.3125f, 3.0625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f)
			.setRotationPoint(-51.9375f, 3.0625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-51, 1.6875f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.875f, 2.1875f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f)
			.setRotationPoint(-51, 1.6875f, 3.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3125f, 0, 0, -0.3125f)
			.setRotationPoint(-50.875f, 2.1875f, 3.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-48.5f, -1.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.25f, 0.25f, 0, -0.625f, 0.25f, 0, 0, 0, 0, 0.625f, 0, -0.625f, -1.25f, 0.25f, -0.625f, -0.625f, 0.25f, -0.625f, 0, 0, -0.625f, 0.625f)
			.setRotationPoint(-49.75f, -1.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-48.5f, -3.1875f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-48.5f, -6.125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.625f, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, 0, -1.25f, 0, -0.625f, 0.625f, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.625f, 0, -0.625f, -1.25f)
			.setRotationPoint(-49.75f, -3.1875f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 427, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.625f, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, 0, -1.25f, 0, -0.625f, 0.625f, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.625f, 0, -0.625f, -1.25f)
			.setRotationPoint(-49.75f, -6.125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(-48.5f, -1.125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.625f, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, 0, -1.25f, 0, -0.625f, 0.625f, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.625f, 0, -0.625f, -1.25f)
			.setRotationPoint(-49.75f, -1.125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-55.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-50.75f, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-50.75f, 1.6875f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-50.4375f, 4.25f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1.125f, -0.625f, 0, -1.125f, -0.625f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, -0.5f, -0.625f, -0.625f, -0.5f, -0.625f, -0.625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-51.3125f, 4.5625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-51.3125f, 4.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.3125f, 5.0625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-50.4375f, 4.25f, 6.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, 0, -1.125f, 0, 0, -1.125f, 0, -0.5f, 0, -0.625f, -0.5f, 0, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f)
			.setRotationPoint(-51.3125f, 4.5625f, 7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-51.3125f, 4.5625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(-51.3125f, 5.0625f, 7.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-46.5625f, -17.9375f, 4.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f)
			.setRotationPoint(-48.0625f, -17.9375f, 4.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(-46.5625f, -17.8125f, 6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(-46.5625f, -17.6875f, 7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-46.5625f, -16.9375f, 2.1875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.5625f, -0.5f, -0.125f, -0.5625f)
			.setRotationPoint(-46.5625f, -17.8125f, 5.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5625f, -0.5f, -0.25f, -0.5625f)
			.setRotationPoint(-46.5625f, -17.6875f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, -0.125f, 0, 0.25f, 0.125f, 0, 0.125f, 0.25f, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, 0.125f, 0.125f)
			.setRotationPoint(-47.5625f, -17.8125f, 6.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, -0.25f, 0, 0.25f, 0, 0, 0, 0.25f, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, 0, 0)
			.setRotationPoint(-47.0625f, -17.6875f, 7.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-46.5625f, -17.8125f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-46.5625f, -17.6875f, 1.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, -0.5625f, 0, -0.125f, -0.5625f, 0, -0.125f, 0, -0.5f, -0.125f, 0)
			.setRotationPoint(-46.5625f, -17.8125f, 3.6875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.5625f, 0, -0.25f, -0.5625f, 0, -0.25f, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-46.5625f, -17.6875f, 2.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.125f, 0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, 0.125f, 0.25f)
			.setRotationPoint(-47.5625f, -17.8125f, 3.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 391, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0.25f)
			.setRotationPoint(-47.0625f, -17.6875f, 1.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.5f, -16.4375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.375f, -17.4375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-47.5f, -16.4375f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47.375f, -17.4375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 4, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0)
			.setRotationPoint(-44.4375f, -18.75f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0)
			.setRotationPoint(-44.4375f, -18.75f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, 1, 0, -0.625f, -1.625f, 0, -0.625f, -1.625f, 0, 0, 1, 0, 0)
			.setRotationPoint(-47.3125f, -11.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-46.8125f, -12.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-46.8125f, -12.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-46.8125f, -9, -11.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0)
			.setRotationPoint(-46.8125f, -12.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-46.8125f, -12.75f, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0)
			.setRotationPoint(-46.8125f, -9, 10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 15, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-35.5f, -15.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 5, 14, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(0.5f, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.125f, 0, 0, -1.125f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.125f, -19.5f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.125f, -19.5f, -2.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1.375f, 0, -0.125f, 0.75f, 0, -0.125f, 0.75f, 0, -0.25f, -1.375f, 0, -0.25f, 0, 0, -0.125f, 0.75f, 0, -0.125f, 0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-10.375f, -19.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0.5f, -0.25f, 0, 0.75f, -0.0625f, 0, -1.5f, 0, 0, -1.125f, 0, 0, 0.5f, -0.25f, 0, 0.75f, 0.625f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-4.125f, -19.5f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.75f, 0, -0.125f, -1.375f, 0, -0.125f, -1.375f, 0, -0.25f, 0.75f, 0, -0.25f, 0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.25f, 0.75f, 0, -0.25f)
			.setRotationPoint(-1.875f, -19.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.6875f, 0, -0.25f, -1.3125f, 0, -0.25f, -1.5f, 0, -0.0625f, 0.8125f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.0625f, 0, -0.25f, -0.375f, 0, 0.625f, 0.8125f, 0, -0.25f)
			.setRotationPoint(-1.9375f, -19.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0.5f, -0.375f, 0, 1.25f, -0.0625f, 0, -2.0625f, -0.1875f, 0, -1.25f, 0, 0, 0.5f, -0.375f, 0, 1.25f, 1.0625f, 0, -1.375f, -0.875f, 0, -0.25f)
			.setRotationPoint(-3.375f, -19.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.125f, -17.5f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.125f, -17.5f, -2.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0.75f, 0, 0, 0.5f, 0, 0, 0, 0.625f, 0, -0.5f, -0.25f, 0, 0.75f, 0, 0, 0.5f, 0, 0, 0, 0.625f, 0, -0.5f)
			.setRotationPoint(-8.125f, -17.5f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0.75f, 0, -0.125f, 0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.125f, 0.75f, 0, -0.125f, 0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-10.375f, -17.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.0625f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.8125f, 0, -0.25f, -0.375f, 0, 0.625f, 0.0625f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.8125f, 0, -0.25f, -0.375f, 0, 0.625f)
			.setRotationPoint(-10.3125f, -17.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 1.25f, 0, 0, 0.5f, -0.875f, 0, -0.25f, 1.0625f, 0, -1.375f, -0.375f, 0, 1.25f, 0, 0, 0.5f, -0.875f, 0, -0.25f, 1.0625f, 0, -1.375f)
			.setRotationPoint(-8.875f, -17.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.625f, 0, -0.5f, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, 0.75f, 0.625f, 0, -0.5f, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, 0.75f)
			.setRotationPoint(-8.125f, -17.5f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.375f, 0, 0.625f, 0.8125f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.0625f, 0, -0.25f, -0.375f, 0, 0.625f, 0.8125f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(-10.3125f, -17.5f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.0625f, 0, -1.375f, -0.875f, 0, -0.25f, 0, 0, 0.5f, -0.375f, 0, 1.25f, 1.0625f, 0, -1.375f, -0.875f, 0, -0.25f, 0, 0, 0.5f, -0.375f, 0, 1.25f)
			.setRotationPoint(-8.875f, -17.5f, -3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.5f, -0.25f, 0, 0.75f, 0.625f, 0, -0.5f, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, 0.75f, 0.625f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(-4.125f, -17.5f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.25f, 0.75f, 0, -0.25f, 0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.25f, 0.75f, 0, -0.25f)
			.setRotationPoint(-1.875f, -17.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.6875f, 0, -0.25f, 0.0625f, 0, -0.25f, -0.375f, 0, 0.625f, 0.8125f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.0625f, 0, -0.25f, -0.375f, 0, 0.625f, 0.8125f, 0, -0.25f)
			.setRotationPoint(-1.9375f, -17.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.5f, -0.375f, 0, 1.25f, 1.0625f, 0, -1.375f, -0.875f, 0, -0.25f, 0, 0, 0.5f, -0.375f, 0, 1.25f, 1.0625f, 0, -1.375f, -0.875f, 0, -0.25f)
			.setRotationPoint(-3.375f, -17.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.625f, 0, -0.5f, -0.25f, 0, 0.75f, 0, 0, 0.5f, 0, 0, 0, 0.625f, 0, -0.5f, -0.25f, 0, 0.75f, 0, 0, 0.5f)
			.setRotationPoint(-4.125f, -17.5f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.8125f, 0, -0.25f, -0.375f, 0, 0.625f, 0.0625f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.8125f, 0, -0.25f, -0.375f, 0, 0.625f, 0.0625f, 0, -0.25f, 0.6875f, 0, -0.25f)
			.setRotationPoint(-1.9375f, -17.5f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.25f, 1.0625f, 0, -1.375f, -0.375f, 0, 1.25f, 0, 0, 0.5f, -0.875f, 0, -0.25f, 1.0625f, 0, -1.375f, -0.375f, 0, 1.25f, 0, 0, 0.5f)
			.setRotationPoint(-3.375f, -17.5f, -3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1.125f, -0.0625f, 0, -1.5f, -0.25f, 0, 0.75f, 0, 0, 0.5f, 0, 0, 0, 0.625f, 0, -0.5f, -0.25f, 0, 0.75f, 0, 0, 0.5f)
			.setRotationPoint(-4.125f, -19.5f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.8125f, 0, -0.25f, -1.5f, 0, -0.0625f, -1.3125f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.8125f, 0, -0.25f, -0.375f, 0, 0.625f, 0.0625f, 0, -0.25f, 0.6875f, 0, -0.25f)
			.setRotationPoint(-1.9375f, -19.5f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.1875f, 0, -1.25f, -0.0625f, 0, -2.0625f, -0.375f, 0, 1.25f, 0, 0, 0.5f, -0.875f, 0, -0.25f, 1.0625f, 0, -1.375f, -0.375f, 0, 1.25f, 0, 0, 0.5f)
			.setRotationPoint(-3.375f, -19.5f, -3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0.75f, 0, 0, 0.5f, 0, 0, -1.125f, -0.0625f, 0, -1.5f, -0.25f, 0, 0.75f, 0, 0, 0.5f, 0, 0, 0, 0.625f, 0, -0.5f)
			.setRotationPoint(-8.125f, -19.5f, 2.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1.3125f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.8125f, 0, -0.25f, -1.5f, 0, -0.0625f, 0.0625f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.8125f, 0, -0.25f, -0.375f, 0, 0.625f)
			.setRotationPoint(-10.3125f, -19.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.375f, 0, 1.25f, 0, 0, 0.5f, -0.1875f, 0, -1.25f, -0.0625f, 0, -2.0625f, -0.375f, 0, 1.25f, 0, 0, 0.5f, -0.875f, 0, -0.25f, 1.0625f, 0, -1.375f)
			.setRotationPoint(-8.875f, -19.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, 0, -1.5f, 0, 0, -1.125f, 0, 0, 0.5f, -0.25f, 0, 0.75f, 0.625f, 0, -0.5f, 0, 0, 0, 0, 0, 0.5f, -0.25f, 0, 0.75f)
			.setRotationPoint(-8.125f, -19.5f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1.5f, 0, -0.0625f, 0.8125f, 0, -0.25f, 0.6875f, 0, -0.25f, -1.3125f, 0, -0.25f, -0.375f, 0, 0.625f, 0.8125f, 0, -0.25f, 0.6875f, 0, -0.25f, 0.0625f, 0, -0.25f)
			.setRotationPoint(-10.3125f, -19.5f, -1.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 418, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.0625f, 0, -2.0625f, -0.1875f, 0, -1.25f, 0, 0, 0.5f, -0.375f, 0, 1.25f, 1.0625f, 0, -1.375f, -0.875f, 0, -0.25f, 0, 0, 0.5f, -0.375f, 0, 1.25f)
			.setRotationPoint(-8.875f, -19.5f, -3.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0.75f, 0, 0, 0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, 0, 0.75f, -0.375f, 0)
			.setRotationPoint(-34, -18.75f, -3.375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-29.375f, -18.75f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -0.375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0)
			.setRotationPoint(-35.75f, -18.75f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.75f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0.75f, 0, 0, 0.75f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, 0, 0.75f, -0.375f, 0)
			.setRotationPoint(-34, -18.75f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.5f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.75f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.375f, -0.625f, -0.625f, 0.375f)
			.setRotationPoint(-30.8125f, -19.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.375f, -0.625f, -0.625f, 0.375f)
			.setRotationPoint(-35.0625f, -19.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, 0, 0.1875f, 0, 0, 1, 0.3125f, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, 0, 1, 0.3125f, 0)
			.setRotationPoint(-33.25f, -20.0625f, -1.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0.75f, 0, 0.875f, 0, 0, 0.875f, 0, 0, 0, 0.75f, 0, 0, 0.75f, -0.375f, 0.875f, 0, -0.375f, 0.875f, 0, -0.375f, 0, 0.75f, -0.375f, 0)
			.setRotationPoint(-34, -18.75f, -0.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, 0, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, 0, 0.1875f, 0, 0, 1, 0.3125f, -0.375f, 0, 0.3125f, -0.375f, 0, 0.3125f, 0, 1, 0.3125f, 0)
			.setRotationPoint(-33.25f, -20.0625f, -0.0625f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 102, textureX, textureY)
			.addShapeBox(0, -0.25f, 0, 13, 1, 1, 0, 0.1875f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, 0, 0.1875f, -0.375f, 0)
			.setRotationPoint(-33.25f, -19.8125f, -0.6875f).setRotationAngle(0, 0, -16.6875f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 118, textureX, textureY)
			.addShapeBox(12.3125f, -0.25f, 0, 3, 1, 1, 0, 0.1875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0.1875f, -0.375f, 0)
			.setRotationPoint(-33.25f, -19.8125f, -0.4375f).setRotationAngle(0, 0, -16.6875f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 118, textureX, textureY)
			.addShapeBox(12.3125f, -0.25f, 0, 3, 1, 1, 0, 0.1875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.375f, -0.75f, 0, -0.375f, -0.75f, 0, -0.375f, 0, 0.1875f, -0.375f, 0)
			.setRotationPoint(-33.25f, -19.8125f, -1.3125f).setRotationAngle(0, 0, -16.6875f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 102, textureX, textureY)
			.addShapeBox(-13.1875f, 0, 0, 13, 1, 1, 0, 0.1875f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, 0, 0.1875f, -0.375f, 0)
			.setRotationPoint(-18.4855f, -24.3675f, -0.6875f).setRotationAngle(0, 0, 24.625f)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, 0, 0.1875f, 0.1875f, 0)
			.setRotationPoint(-30.75f, -30.0625f, -0.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1875f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.1875f, 0, 0, 0.1875f, 0.1875f, -0.75f, 0, 0.1875f, -0.75f, 0, 0.1875f, 0, 0.1875f, 0.1875f, 0)
			.setRotationPoint(-30.75f, -30.0625f, -1.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-31.875f, -30.375f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 325, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30.5f, -18.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34.75f, -18.75f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0.375f, 0, -0.625f, 0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-30.8125f, -19.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0.375f, 0, -0.625f, 0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-35.0625f, -19.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-29.875f, -30.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-32.5f, -30.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, -1.125f, 0, 0, -1.125f, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, 0, 0, 0.5f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-29.875f, -30.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, -1.125f, 0, 0, -1.125f, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, 0, 0, 0.5f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(-32.5f, -30.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, -1.125f, 0, -0.625f, -1.125f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, 0.5f, 0, -0.625f, 0.5f, 0)
			.setRotationPoint(-29.875f, -30.75f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.625f, 0, 0, 0, 0, 0, 0, -1.125f, 0, -0.625f, -1.125f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, 0.5f, 0, -0.625f, 0.5f, 0)
			.setRotationPoint(-32.5f, -30.75f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16.8125f, -19.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(36.6875f, 2.75f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(39.9375f, 2.75f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(37.0625f, 3.75f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 430, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f, -0.125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(37.0625f, 6.375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(36.6875f, 2.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(39.9375f, 2.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(37.0625f, 3.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, -0.125f, -0.625f, 0, -0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(37.0625f, 6.375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-37.6875f, 2.75f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-40.9375f, 2.75f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.125f, -0.625f, 0)
			.setRotationPoint(-40.0625f, 3.75f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.125f, 0, 0, -0.125f, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, -0.125f, -0.625f, 0)
			.setRotationPoint(-40.0625f, 6.375f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f)
			.setRotationPoint(-37.6875f, 2.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f)
			.setRotationPoint(-40.9375f, 2.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f)
			.setRotationPoint(-40.0625f, 3.75f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.125f, 0, -0.625f, -0.125f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, -0.125f, -0.625f, -0.625f)
			.setRotationPoint(-40.0625f, 6.375f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 7, 16, 0, 0, 0, 0, 0.5625f, 0, 0, 0.5625f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5625f, -0.5f, 0, 0.5625f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-7.5625f, 0.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.5f, 0.25f, 0, 0.5f, 0, 0, 0.5f, 0, 0, -1.5f, 0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.0625f, 2.75f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-9.0625f, 3.75f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.0625f, 0, -0.3125f, -0.3125f, 0, -0.3125f, -0.3125f, 0, -0.0625f, -0.0625f, 0, -0.0625f, 0, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8.9375f, 4, -8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0.3125f, -0.125f, 0.0625f, 0.0625f, -0.125f, 0.0625f, 0.0625f, -0.125f, 0.3125f, 0.3125f, -0.125f, 0.3125f)
			.setRotationPoint(-8.9375f, 4.5f, -8.125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-27.875f, 0.25f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 13, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-35.5f, -13.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.375f, -0.875f, 0.5f, -0.375f, -0.875f, 0.5f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-35.25f, -7.125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -7.625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -8.125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -8.625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -8.625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -9.125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -9.625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -10.125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -10.625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -11.125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -11.625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -12.125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -12.625f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -13.125f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -6.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -5.75f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -5.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -4.75f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -4.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -3.75f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -3.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -2.75f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -2.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -1.75f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, -0.875f, 0.5f, 0, -0.875f, 0.5f, 0, 0, 0, 0, 0, 0, -0.75f, -0.875f, 0.5f, -0.75f, -0.875f, 0.5f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-35.25f, -1.25f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-35.5f, -13.375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.375f, 0, 0.5f, -0.375f, 0, 0.5f, -0.375f, -0.875f, 0, -0.375f, -0.875f)
			.setRotationPoint(-35.25f, -7.125f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -7.625f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -8.125f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -8.625f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -9.125f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -9.625f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -10.125f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -10.625f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -11.125f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -11.625f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -12.125f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -12.625f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -13.125f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -6.25f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -5.75f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -5.25f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -4.75f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -4.25f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -3.75f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -3.25f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -2.75f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -2.25f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -1.75f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 70, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.875f, 0, 0, -0.875f, 0, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, -0.875f, 0, -0.75f, -0.875f)
			.setRotationPoint(-35.25f, -1.25f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 71, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0.375f, 0)
			.setRotationPoint(-35.5f, -14.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(41.125f, -11.875f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(35.75f, -11.875f, -11.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, 0.25f, 0, -0.082f, 0.25f, 0, 0.082f, 0, 0, 0, 0, -0.375f, 0, 0.25f, -0.375f, -0.082f, 0.25f, -0.375f, 0.082f, 0, -0.375f, 0)
			.setRotationPoint(36.5f, -7.375f, -10.98f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, 0.25f, 0, 0.082f, 0.25f, 0, -0.082f, 0, 0, 0, 0, -0.375f, 0, 0.25f, -0.375f, 0.082f, 0.25f, -0.375f, -0.082f, 0, -0.375f, 0)
			.setRotationPoint(36.5f, -7.375f, 9.98f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, 0.25f, 0, 0.082f, 0.25f, 0, -0.082f, 0, 0, 0, 0, -0.375f, 0, 0.25f, -0.375f, 0.082f, 0.25f, -0.375f, -0.082f, 0, -0.375f, 0)
			.setRotationPoint(36.5f, -14, 9.98f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, -0.019f, 0, 0, 0.019f, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.019f, 0, -0.375f, 0.019f, 0, -0.375f, 0)
			.setRotationPoint(35.5f, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, -0.019f, 0, 0, 0.019f, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, -0.019f, 0, -0.375f, 0.019f, 0, -0.375f, 0)
			.setRotationPoint(35.5f, -7.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0.019f, 0, 0, -0.019f, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.019f, 0, -0.375f, -0.019f, 0, -0.375f, 0)
			.setRotationPoint(35.5f, -14, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0.019f, 0, 0, -0.019f, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.019f, 0, -0.375f, -0.019f, 0, -0.375f, 0)
			.setRotationPoint(35.5f, -7.375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 205, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0.019f, 0, 0.25f, -0.019f, 0, 0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.019f, 0, -0.25f, -0.019f, 0, -0.25f, 0)
			.setRotationPoint(35.5f, -14.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(41.125f, -11.875f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(35.75f, -11.875f, 10.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-42.125f, -11.875f, -11.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(-36.75f, -11.875f, -11.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0.25f, 0, -0.082f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.082f, 0.25f, -0.375f, -0.082f, 0, -0.375f, 0, 0, -0.375f, 0, 0.25f, -0.375f, 0.082f)
			.setRotationPoint(-40.5f, -7.375f, -10.98f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0.25f, 0, 0.082f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.082f, 0.25f, -0.375f, 0.082f, 0, -0.375f, 0, 0, -0.375f, 0, 0.25f, -0.375f, -0.082f)
			.setRotationPoint(-40.5f, -7.375f, 9.98f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0.25f, 0, 0.082f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.082f, 0.25f, -0.375f, 0.082f, 0, -0.375f, 0, 0, -0.375f, 0, 0.25f, -0.375f, -0.082f)
			.setRotationPoint(-40.5f, -14, 9.98f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.019f, 0, 0, 0, 0, 0, 0, 0, 0, 0.019f, 0, -0.375f, -0.019f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.019f)
			.setRotationPoint(-36.5f, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -0.019f, 0, 0, 0, 0, 0, 0, 0, 0, 0.019f, 0, -0.375f, -0.019f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0.019f)
			.setRotationPoint(-36.5f, -7.375f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0.019f, 0, 0, 0, 0, 0, 0, 0, 0, -0.019f, 0, -0.375f, 0.019f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.019f)
			.setRotationPoint(-36.5f, -14, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0.019f, 0, 0, 0, 0, 0, 0, 0, 0, -0.019f, 0, -0.375f, 0.019f, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, -0.019f)
			.setRotationPoint(-36.5f, -7.375f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.019f, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.019f, 0, -0.25f, 0.019f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.019f)
			.setRotationPoint(-36.5f, -14.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f)
			.setRotationPoint(-42.125f, -11.875f, 10.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f)
			.setRotationPoint(-36.75f, -11.875f, 10.9375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, -0.019f, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0.019f, 0, -0.25f, -0.019f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.019f)
			.setRotationPoint(-36.5f, -14.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0.25f, 0, -0.082f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.082f, 0.25f, -0.375f, -0.082f, 0, -0.375f, 0, 0, -0.375f, 0, 0.25f, -0.375f, 0.082f)
			.setRotationPoint(-40.5f, -14, -10.98f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
		//
		TurboList Cab = new TurboList("Cab");
		Cab.add(new ModelRendererTurbo(Cab, 126, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(52.25f, -7.375f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 165, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(35.25f, -0.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 121, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.375f, -0.625f, 0, 2.375f, -0.625f, 0, 2.375f, -0.625f, 0, -2.375f, -0.625f, 0)
			.setRotationPoint(49.875f, -15.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 145, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 5, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, 0.0625f, 0, 0, 0, 0, 0, 0, 0.25f, 0, -0.0625f, 0.25f, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(35.5f, -16.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 414, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, -0.25f, 0, -0.1875f, -0.25f, 0, 0.625f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.125f, 0.25f, 0, 0.9375f, 0, 0, 0, 0, 0)
			.setRotationPoint(35.5f, -16.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 429, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, -0.25f, 0.5f, -1.1875f, -0.25f, 0.5f, 0.8125f, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, -0.5625f, 0.25f, 0.25f, 1.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(35.5f, -16.25f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 469, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 5, 0, 0.4375f, 0, 0, -0.4375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, -0.375f, 0, -0.4375f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(52.25f, -7.375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 415, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 3, 0, 0.625f, 0, -0.1875f, -0.8125f, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, -0.375f, -0.1875f, -0.8125f, -0.375f, 0, 0, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(51.8125f, -7.375f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 116, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0.5f, 0, -0.5625f, -1.375f, 0, 0.25f, 0, 0, 0, -0.1875f, 0, 0.1875f, 0.5f, -0.375f, -0.5625f, -1.375f, -0.375f, 0.25f, 0, -0.375f, 0, -0.1875f, -0.375f, 0.1875f)
			.setRotationPoint(51, -7.375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 370, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 5, 0, 0, 0, 0, -0.6875f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(35.5f, -0.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 165, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0.3125f, 0, 0, 0, 0, 0)
			.setRotationPoint(35.5f, -0.75f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 476, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, 0.25f, -0.875f, 0, 0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.875f, 0, 0.25f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(35.5f, -0.75f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 429, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0.25f, -2, 0, 0, 0.125f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -2, 0, 0, 0.125f, 0, 0, 0, 0, 0)
			.setRotationPoint(35.5f, -0.75f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 370, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 5, 0, 0, 0, 0, -0.25f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.6875f, 0, 0, 0, 0, 0)
			.setRotationPoint(35.5f, -0.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 165, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 3, 0, 0, 0, 0, 0.3125f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(35.5f, -0.75f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 476, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 16, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.5f, 0, 0, -0.875f, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(35.5f, -0.75f, 8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 470, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, -2, 0, 0, 0, 0, 0.25f, 0, 0, 0, 0.125f, 0, 0, -2, 0, 0, 0, 0, 0.25f)
			.setRotationPoint(35.5f, -0.75f, 9.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 429, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, -0.25f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0.625f, 0, 0, 0.625f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(35.25f, -16.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 336, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 1, 0, 0, 0, 0.25f, 0.75f, 0, 0.1f, 0.75f, 0, -0.1f, 0, 0, -0.25f, 0, -0.375f, 0.25f, 0.75f, -0.375f, 0.1f, 0.75f, -0.375f, -0.1f, 0, -0.375f, -0.25f)
			.setRotationPoint(40.75f, -7.375f, -10.65f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 42, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, 0, 0.125f, 0, -1, 0, 0, 0.8125f, 0, 0, 0, 0, -0.375f, 0, 0.125f, -0.375f, -1, 0, -0.375f, 0.8125f, 0, -0.375f, 0)
			.setRotationPoint(48.5f, -7.375f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 98, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -0.25f, 0, -0.375f, -0.25f, 0, 0.0625f, 0, 0, -0.0625f, 0, 0, -0.0625f, -0.5f, 0, -0.3125f, -0.5f, 0, 0.2035f, -0.5f, 0, -0.2035f, -0.5f, 0)
			.setRotationPoint(49.8125f, -15.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 132, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, -0.1875f, -0.25f, 0, 0.625f, 0, 0, -1, 0, 0, 0, -0.75f, 0, -0.1875f, -0.75f, 0, 0.6875f, -0.75f, 0, -1.0625f, -0.75f, 0)
			.setRotationPoint(48.8125f, -15.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 402, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 5, 0, 0.3125f, 0, 0, -0.52f, 0, 0, 0, 0, 0, 0, 0, 0, -1.793f, -0.125f, 0, 1.793f, -0.125f, 0, 2.23f, -0.125f, 0, -2.23f, -0.125f, 0)
			.setRotationPoint(50.02f, -15.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 285, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 3, 0, 0.6875f, 0, -0.1875f, -0.875f, 0, 0, 0, 0, 0, -0.21f, 0, 0, -1.6875f, -0.125f, -0.1875f, 1.5f, -0.125f, 0, 2.3125f, -0.125f, 0, -2.3125f, -0.125f, 0)
			.setRotationPoint(49.5f, -15.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 73, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 1, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.134f, 0, 0, -0.134f, 0, 0, -0.25f, 0, -0.625f, 0.25f, 0, -0.625f, 0.134f, 0, -0.625f, -0.134f, 0, -0.625f, -0.25f)
			.setRotationPoint(40.75f, -14.75f, -10.65f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 485, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, -1, 0.25f, 0, -1, 0.25f, -1, 0.25f, 0, -1, 0.25f, 0, 0, 0, 0.25f, 0, -0.22f, 0.25f, 0.25f, 0.22f, 0, 0.25f, 0)
			.setRotationPoint(35.5f, -16, -11).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 35, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0.25f, 0.25f, -2, 0.25f, 0.25f, -2, 0, -0.25f, 0, 0, -0.25f, 0, -0.625f, 0.25f, -0.25f, -0.625f, 0.215f, -0.25f, -0.625f, -0.215f, 0, -0.625f, -0.25f)
			.setRotationPoint(46.75f, -14.75f, -10.535f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 74, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0.5f, 0, -0.5625f, -1.6875f, -0.25f, 0.25f, 0, 0, 0, -0.1875f, 0, 0.1875f, -1.875f, -0.125f, -0.5625f, 1, -0.125f, 0.25f, 2.375f, -0.125f, 0, -2.5625f, -0.125f, 0.1875f)
			.setRotationPoint(48.625f, -15.25f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 452, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, 0.035f, -0.8125f, 0, -1, -0.625f, 0.125f, 0.8125f, 0, -0.25f, -0.035f, -1.75f, -0.375f, 0, 1.875f, -0.375f, -1, 1.75f, -0.375f, 0.8125f, -1.75f, -0.375f, 0)
			.setRotationPoint(46.75f, -15, -10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 59, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, -0.4375f, 0, -1, -0.0625f, -1, 0.25f, 0, -1, 0.25f, 0, 0, -0.22f, -1, 0, -0.22f, -0.375f, 0.25f, 0.22f, 0, 0.25f, 0)
			.setRotationPoint(46.75f, -16, -11).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 54, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.78f, -0.4375f, 0, -0.78f, -0.4375f, 0, -0.22f, -0.5625f, 0, -0.22f, 0, 0, 0, 0.1875f, 0, -1.03f, -0.4375f, 0, 0.03f, 0, 0, 0)
			.setRotationPoint(46.75f, -16, -10.78f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 30, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0, 0, 0.25f, -0.019f, 0, 0, 0.019f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.019f, 0, -0.25f, 0.019f, 0, -0.25f, 0)
			.setRotationPoint(35.5f, -14.75f, -11).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 257, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0.25f, 0, -0.082f, 0.25f, -0.25f, 0.082f, 0, -0.25f, 0, 0, 0, 0, 0.25f, 0, -0.082f, 0.25f, 0, 0.082f, 0, 0, 0)
			.setRotationPoint(36.5f, -15, -10.98f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 442, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, 0.25f, 0, -0.082f, 0.25f, 0, 0.082f, 0, 0, 0, 0, -0.375f, 0, 0.25f, -0.375f, -0.082f, 0.25f, -0.375f, 0.082f, 0, -0.375f, 0)
			.setRotationPoint(36.5f, -14, -10.98f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 165, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 5, 0, 0, 0, 0, 0.0625f, 0, 0, -0.375f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.375f, 0, 0, -0.0625f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(35.5f, -16.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 412, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 3, 0, 0, 0, 0, 0.625f, 0, 0, -0.1875f, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0.9375f, 0, 0, 0.125f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(35.5f, -16.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 365, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 5, 0, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0, 0.4375f, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, -0.4375f, -0.375f, 0, 0.4375f, -0.375f, 0)
			.setRotationPoint(52.25f, -7.375f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 108, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 3, 0, 0, 0, 0, 0, 0, 0, -0.8125f, 0, 0, 0.625f, 0, -0.1875f, 0, -0.375f, 0, 0, -0.375f, 0, -0.8125f, -0.375f, 0, 0.625f, -0.375f, -0.1875f)
			.setRotationPoint(51.8125f, -7.375f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 5, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.1875f, 0, 0.1875f, 0, 0, 0, -1.375f, 0, 0.25f, 0.5f, 0, -0.5625f, -0.1875f, -0.375f, 0.1875f, 0, -0.375f, 0, -1.375f, -0.375f, 0.25f, 0.5f, -0.375f, -0.5625f)
			.setRotationPoint(51, -7.375f, 8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 319, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 7, 1, 0, 0, 0, -0.25f, 0.75f, 0, -0.1f, 0.75f, 0, 0.1f, 0, 0, 0.25f, 0, -0.375f, -0.25f, 0.75f, -0.375f, -0.1f, 0.75f, -0.375f, 0.1f, 0, -0.375f, 0.25f)
			.setRotationPoint(40.75f, -7.375f, 9.65f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 244, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 1, 0, 0, 0, 0, 0, 0, 0.8125f, 0.125f, 0, -1, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0.8125f, 0.125f, -0.375f, -1, 0, -0.375f, 0)
			.setRotationPoint(48.5f, -7.375f, 9.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 383, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.0625f, 0, 0, 0.0625f, 0, 0, -0.375f, -0.25f, 0, 0, -0.25f, 0, -0.2035f, -0.5f, 0, 0.2035f, -0.5f, 0, -0.3125f, -0.5f, 0, -0.0625f, -0.5f, 0)
			.setRotationPoint(49.8125f, -15.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 8, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, 0, 0, 0.625f, 0, 0, -0.1875f, -0.25f, 0, 0, -0.25f, 0, -1.0625f, -0.75f, 0, 0.6875f, -0.75f, 0, -0.1875f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(48.8125f, -15.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 48, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 5, 0, 0, 0, 0, 0, 0, 0, -0.52f, 0, 0, 0.3125f, 0, 0, -2.23f, -0.125f, 0, 2.23f, -0.125f, 0, 1.793f, -0.125f, 0, -1.793f, -0.125f, 0)
			.setRotationPoint(50.02f, -15.25f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 91, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 3, 0, -0.21f, 0, 0, 0, 0, 0, -0.875f, 0, 0, 0.6875f, 0, -0.1875f, -2.3125f, -0.125f, 0, 2.3125f, -0.125f, 0, 1.5f, -0.125f, 0, -1.6875f, -0.125f, -0.1875f)
			.setRotationPoint(49.5f, -15.25f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 58, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 8, 1, 0, 0, 0, -0.25f, 0, 0, -0.134f, 0, 0.25f, 0.134f, 0, 0.25f, 0.25f, 0, -0.625f, -0.25f, 0, -0.625f, -0.134f, 0, -0.625f, 0.134f, 0, -0.625f, 0.25f)
			.setRotationPoint(40.75f, -14.75f, 9.65f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 409, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -1, 0.25f, 0.25f, -1, 0.25f, 0.25f, 0, -1, 0, 0, -1, 0, 0.25f, 0, 0.25f, 0.25f, 0.22f, 0.25f, 0, -0.22f, 0, 0, 0)
			.setRotationPoint(35.5f, -16, 10).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 237, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, 0, -0.25f, -2, 0, -0.25f, -2, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, -0.625f, -0.25f, -0.25f, -0.625f, -0.215f, -0.25f, -0.625f, 0.215f, 0, -0.625f, 0.25f)
			.setRotationPoint(46.75f, -14.75f, 9.535f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 429, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, 0, 0.8125f, 0, 0, -1.1875f, -0.25f, 0.5f, 0, -0.25f, 0.5f, 0, 0, 0, 1.125f, 0, 0, -0.5625f, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(35.5f, -16.25f, 8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 0, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.1875f, 0, 0.1875f, 0, 0, 0, -1.6875f, -0.25f, 0.25f, 0.5f, 0, -0.5625f, -2.5625f, -0.125f, 0.1875f, 2.375f, -0.125f, 0, 1, -0.125f, 0.25f, -1.875f, -0.125f, -0.5625f)
			.setRotationPoint(48.625f, -15.25f, 8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 100, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 8, 1, 0, 0, -0.25f, -0.035f, -0.625f, 0.125f, 0.8125f, -0.8125f, 0, -1, 0, 0, 0.035f, -1.75f, -0.375f, 0, 1.75f, -0.375f, 0.8125f, 1.875f, -0.375f, -1, -1.75f, -0.375f, 0)
			.setRotationPoint(46.75f, -15, 9.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 371, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0.25f, -0.0625f, -1, 0.25f, -0.4375f, 0, -1, 0, 0, -1, 0, 0.25f, 0, -0.375f, 0.25f, 0.22f, -1, 0, -0.22f, 0, 0, -0.22f)
			.setRotationPoint(46.75f, -16, 10).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 321, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5625f, 0, -0.22f, -0.4375f, 0, -0.22f, -0.4375f, 0, -0.78f, -0.5625f, 0, -0.78f, 0, 0, 0, -0.4375f, 0, 0.03f, 0.1875f, 0, -1.03f, 0, 0, 0)
			.setRotationPoint(46.75f, -16, 9.78f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 417, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0.082f, 0.25f, 0, -0.082f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.082f, 0.25f, 0, -0.082f, 0, 0, 0)
			.setRotationPoint(36.5f, -15, 9.98f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 280, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(45.5f, -3.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 268, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(45.5f, -6.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 294, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, -0.625f, 0, 0, -1.25f, 0, 0, 0.625f, 0.25f, 0, 0, 0.25f, -0.625f, -0.625f, 0, -0.625f, -1.25f, 0, -0.625f, 0.625f, 0.25f, -0.625f, 0)
			.setRotationPoint(48.75f, -3.1875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 280, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, -0.625f, 0, 0, -1.25f, 0, 0, 0.625f, 0.25f, 0, 0, 0.25f, -0.625f, -0.625f, 0, -0.625f, -1.25f, 0, -0.625f, 0.625f, 0.25f, -0.625f, 0)
			.setRotationPoint(48.75f, -6.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 335, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0.25f, 0, 0.75f, 0.25f)
			.setRotationPoint(52.6875f, -8, -1.625f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 229, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.875f, 0, 0.25f, -0.875f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, -0.875f, 0.25f, 0.25f)
			.setRotationPoint(52.8125f, -7.75f, -1.375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 224, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0.25f, -0.875f, 0, 0.25f, -0.875f, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0.25f, -0.875f, 0.25f, 0.25f)
			.setRotationPoint(52.8125f, -7.75f, 0.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 474, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(52.9375f, -7.625f, -1.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 469, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0, -0.875f, 0, 0, 0, 0, 0, 0, 0, 0, -0.875f, 0, 0)
			.setRotationPoint(52.9375f, -7.625f, 0.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 322, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f)
			.setRotationPoint(52.5f, -5.875f, -1.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 410, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f)
			.setRotationPoint(52.5f, -3.25f, -1.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 410, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.001f, 0, 0, -0.001f, 0, 0, -0.001f, -0.625f, 0, -0.001f, -0.625f, -0.625f, -0.001f, 0, -0.625f, -0.001f, 0, -0.625f, -0.001f, -0.625f, -0.625f, -0.001f)
			.setRotationPoint(52.1875f, -8.875f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 405, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.001f, 0, 0, -0.001f, 0, 0, -0.001f, -0.625f, 0, -0.001f, -0.625f, -0.625f, -0.001f, 0, -0.625f, -0.001f, 0, -0.625f, -0.001f, -0.625f, -0.625f, -0.001f)
			.setRotationPoint(51.5625f, -11, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 400, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -0.001f, 0, 0, -0.001f, 0, 0, -0.001f, -0.625f, 0, -0.001f, -0.625f, -0.625f, -0.001f, 0, -0.625f, -0.001f, 0, -0.625f, -0.001f, -0.625f, -0.625f, -0.001f)
			.setRotationPoint(50.9375f, -13.25f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 388, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(51.875f, -8.25f, -7.875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 383, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(51.875f, -8.25f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 26, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(51.875f, -7.5f, -7.875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 464, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(51.875f, -7.5f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 459, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f)
			.setRotationPoint(52, -8.125f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 367, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0)
			.setRotationPoint(52, -8.125f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 353, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.25f, -0.875f, 0, -0.25f)
			.setRotationPoint(52, -7.625f, -7.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 276, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f)
			.setRotationPoint(52, -7.625f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 271, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(51.875f, -8.25f, 6.875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 266, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(51.875f, -8.25f, 6.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 261, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(51.875f, -7.5f, 6.875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 256, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(51.875f, -7.5f, 6.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 220, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0)
			.setRotationPoint(52, -8.125f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 215, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f)
			.setRotationPoint(52, -8.125f, 6.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 210, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f)
			.setRotationPoint(52, -7.625f, 6.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 205, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.25f, -0.875f, 0, -0.25f)
			.setRotationPoint(52, -7.625f, 6.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 391, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.5f, 0, 0, -1.125f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0.5f, -0.625f, 0, -1.125f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(53.125f, -7.3125f, -5.9375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 353, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.625f, 0, 0, -1.125f, 0, 0, 0.5f, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -1.125f, -0.625f, 0, 0.5f, -0.625f, 0)
			.setRotationPoint(53.125f, -7.3125f, 1.9375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 200, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(50.625f, -16.0625f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 195, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(50.625f, -16.0625f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 190, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(50.625f, -15.3125f, -0.875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 185, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f)
			.setRotationPoint(50.625f, -15.3125f, -0.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 180, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.25f, -0.875f, 0, -0.25f, -0.875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f)
			.setRotationPoint(50.75f, -15.9375f, -0.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 175, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0)
			.setRotationPoint(50.75f, -15.9375f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 170, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, -0.875f, -0.25f, -0.25f, -0.875f, -0.1875f, -0.1875f, 0, -0.1875f, -0.1875f, 0, 0, -0.25f, -0.875f, 0, -0.25f)
			.setRotationPoint(50.75f, -15.4375f, -0.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 165, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.875f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.875f, -0.25f, 0, -0.875f, 0, -0.25f, 0, 0, -0.25f, 0, -0.1875f, -0.1875f, -0.875f, -0.1875f, -0.1875f)
			.setRotationPoint(50.75f, -15.4375f, -0.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 495, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0.25f, 0, 0.5f, -0.25f, 0, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0.5f, -0.25f, 0.25f, 0.5f, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(50, -16.3125f, -6.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 353, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(50.25f, -16.3125f, -1.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 160, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, -0.028f, 0.5f, 0, 0.028f, 0, 0, 0, 0, -0.125f, 0, 0.5f, -0.125f, -0.028f, 0.5f, -0.125f, 0.028f, 0, -0.125f, 0)
			.setRotationPoint(35.5f, 0.25f, -11).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 498, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0.5f, 0, -0.107f, 0.5f, 0, 0.107f, 0, 0, 0, 0, -0.125f, 0, 0.5f, -0.125f, -0.107f, 0.5f, -0.125f, 0.107f, 0, -0.125f, 0)
			.setRotationPoint(40.125f, 0.25f, -10.913f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 487, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0.125f, 0, -0.193f, 0.125f, 0, 0.193f, 0, 0, 0, 0, 0.75f, 0, 0.125f, 1, -0.193f, 0.125f, 1, 0.193f, 0, 0.75f, 0)
			.setRotationPoint(35.5f, 1.125f, -11).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 155, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0.028f, 0.5f, 0, -0.028f, 0, 0, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0.028f, 0.5f, -0.125f, -0.028f, 0, -0.125f, 0)
			.setRotationPoint(35.5f, 0.25f, 10).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 497, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0.107f, 0.5f, 0, -0.107f, 0, 0, 0, 0, -0.125f, 0, 0.5f, -0.125f, 0.107f, 0.5f, -0.125f, -0.107f, 0, -0.125f, 0)
			.setRotationPoint(40.125f, 0.25f, 9.913f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 487, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0.193f, 0.125f, 0, -0.193f, 0, 0, 0, 0, 0.75f, 0, 0.125f, 1, 0.193f, 0.125f, 1, -0.193f, 0, 0.75f, 0)
			.setRotationPoint(35.5f, 1.125f, 10).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 462, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.4375f, 0, -1.5f, 0.4375f, 0, -1.5f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(48.25f, 0.25f, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 0, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, -0.6875f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.4375f, 0, -2.1875f, 0.4375f, 0, -1.75f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(48.5f, 0.25f, -5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 43, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, 0.3125f, 0, 0, 0, 0, 0, 0, 0.4375f, 0, -2, 0.4375f, 0, -1.1875f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(48.5f, 0.25f, -8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 503, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0.25f, -0.875f, 0, 0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0.4375f, 0.25f, -2.375f, 0.4375f, 0.25f, -1, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(48.5f, 0.25f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 500, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.875f, 0, 0.055f, -2, 0, 0, 0.125f, 0, 0, 0.875f, 0, 0, 0.875f, 0.4375f, 0.055f, -3.5f, 0.4375f, 0, -1.375f, 0.4375f, 0, 0.875f, 0.4375f, 0)
			.setRotationPoint(46.5f, 0.25f, -10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 5, 0, 0, 0, 0, -0.25f, 0, 0, -0.6875f, 0, 0, 0, 0, 0, 0, 0.4375f, 0, -1.75f, 0.4375f, 0, -2.1875f, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(48.5f, 0.25f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 490, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 3, 0, 0, 0, 0, 0.3125f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0.4375f, 0, -1.1875f, 0.4375f, 0, -2, 0.4375f, 0, 0, 0.4375f, 0)
			.setRotationPoint(48.5f, 0.25f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 455, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, -0.875f, 0, 0.25f, 0, 0, 0.25f, 0, 0.4375f, 0, -1, 0.4375f, 0, -2.375f, 0.4375f, 0.25f, 0, 0.4375f, 0.25f)
			.setRotationPoint(48.5f, 0.25f, 8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 500, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.875f, 0, 0, 0.125f, 0, 0, -2, 0, 0, 0.875f, 0, 0.055f, 0.875f, 0.4375f, 0, -1.375f, 0.4375f, 0, -3.5f, 0.4375f, 0, 0.875f, 0.4375f, 0.055f)
			.setRotationPoint(46.5f, 0.25f, 9.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 257, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47.8125f, 1.6875f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 234, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 1.5f, 0, 0, 1.5f, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(45.625f, 1.6875f, -10.807f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 234, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 1.5f, 0, 0.5f, -2, 0, 0.5f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 1.5f, 0.5f, 0.5f, -2, 0.5f, 0.5f)
			.setRotationPoint(49.8125f, 7.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 442, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, -0.5f, 0, 0, 1, 0, 0, -1.5f, 0, 0, -1.9375f, 0.375f, 0, 1.4375f, 0.375f, 0, 3.4375f, 0.375f, 0, -3.9375f, 0.375f, 0)
			.setRotationPoint(47.875f, 6.1875f, -10).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 419, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 10, 0, 0, 0, 0, -0.5f, 0, 0, 1, 0, 0, -1.5f, 0, 0, 0, 0.5f, 0, -0.5f, 0.5f, 0, 1, 0.5f, 0, -1.5f, 0.5f, 0)
			.setRotationPoint(47.875f, 1.6875f, -10).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 150, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, 0, 0, 0, -0.8125f, -0.5f, 0, -0.1875f, -0.25f, 0, -0.5f, -0.25f, 0.5f, 0, 0, 0.5f, -0.8125f, -0.5f, 0.5f, -0.1875f, -0.25f, 0.5f, -0.5f)
			.setRotationPoint(47.375f, 1.6875f, -10.807f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 498, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0.5f, 0, 0, -0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0, 0.25f, 0, 0.5f, 0.25f, 0, -0.25f, 0.25f, 0.5f, 0.25f, 0.25f, 0.5f)
			.setRotationPoint(50, -16.3125f, 1.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 211, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, 0, 0, 0, 0)
			.setRotationPoint(45.625f, 1.6875f, 9.807f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 211, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -2, 0, 0.5f, 1.5f, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0, -2, 0.5f, 0.5f, 1.5f, 0.5f, 0.5f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(49.8125f, 7.5625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 129, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, -1.5f, 0, 0, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, -3.9375f, 0.375f, 0, 3.4375f, 0.375f, 0, 1.4375f, 0.375f, 0, -1.9375f, 0.375f, 0)
			.setRotationPoint(47.875f, 6.1875f, 0).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 106, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 10, 0, -1.5f, 0, 0, 1, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1.5f, 0.5f, 0, 1, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(47.875f, 1.6875f, 0).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 132, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.1875f, 0, 0, -0.8125f, -0.25f, 0, 0, -0.25f, 0.5f, -0.5f, -0.5f, 0.5f, -0.1875f, 0, 0.5f, -0.8125f, -0.25f, 0.5f, 0)
			.setRotationPoint(47.375f, 1.6875f, 9.807f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 280, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(48.3125f, 2, -11.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 127, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(51.6875f, 2.1875f, -9.0625f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 122, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(51.6875f, 2.1875f, -10.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 117, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.8125f, 2.1875f, -6.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 74, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.8125f, 2.1875f, -7.9375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 152, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(48.3125f, 6.0625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 69, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(48.3125f, 3.0625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 64, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0)
			.setRotationPoint(50.9375f, 3.0625f, -11.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 188, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f)
			.setRotationPoint(47.8125f, 1.6875f, 5.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 468, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(48.3125f, 2, 10.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 59, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(51.6875f, 2.1875f, 8.0625f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 54, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(51.6875f, 2.1875f, 9.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 327, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.8125f, 2.1875f, 5.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 318, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(51.8125f, 2.1875f, 6.9375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 455, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(48.3125f, 6.0625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 49, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(48.3125f, 3.0625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 251, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f)
			.setRotationPoint(50.9375f, 3.0625f, 10.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 244, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(49, 1.6875f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 165, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.3125f, 0, 0, -0.3125f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(49.875f, 2.1875f, -5.4375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 221, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3125f, 0, 0, -0.3125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.3125f, 0, -0.5f, -0.3125f)
			.setRotationPoint(49, 1.6875f, 3.4375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 142, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.3125f, -0.5f, 0, -0.3125f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.3125f, -0.5f, 0, -0.3125f)
			.setRotationPoint(49.875f, 2.1875f, 3.4375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 175, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(45.5f, -1.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 309, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, -0.625f, 0, 0, -1.25f, 0, 0, 0.625f, 0.25f, 0, 0, 0.25f, -0.625f, -0.625f, 0, -0.625f, -1.25f, 0, -0.625f, 0.625f, 0.25f, -0.625f, 0)
			.setRotationPoint(48.75f, -1.125f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 244, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(45.5f, -3.1875f, 10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 221, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(45.5f, -6.125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 300, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0.625f, 0, 0, -1.25f, 0.25f, 0, -0.625f, 0.25f, -0.625f, 0, 0, -0.625f, 0.625f, 0, -0.625f, -1.25f, 0.25f, -0.625f, -0.625f)
			.setRotationPoint(48.75f, -3.1875f, 10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 86, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0.625f, 0, 0, -1.25f, 0.25f, 0, -0.625f, 0.25f, -0.625f, 0, 0, -0.625f, 0.625f, 0, -0.625f, -1.25f, 0.25f, -0.625f, -0.625f)
			.setRotationPoint(48.75f, -6.125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 175, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f)
			.setRotationPoint(45.5f, -1.125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 464, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0.625f, 0, 0, -1.25f, 0.25f, 0, -0.625f, 0.25f, -0.625f, 0, 0, -0.625f, 0.625f, 0, -0.625f, -1.25f, 0.25f, -0.625f, -0.625f)
			.setRotationPoint(48.75f, -1.125f, 10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 294, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(54.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 314, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 145, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(52.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 152, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 487, 67, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(48.75f, 3, -1).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 0, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(51.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 487, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(48.75f, 1.6875f, -1).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 504, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(48.4375f, 4.25f, -7.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 48, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, 0, -1.125f, 0, 0, -1.125f, 0, -0.375f, 0.125f, -0.625f, -0.375f, 0.125f, -0.625f, -0.5f, -0.625f, 0, -0.5f, -0.625f, 0, -0.5f, 0, -0.625f, -0.5f, 0)
			.setRotationPoint(50.3125f, 4.5625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 165, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(50.3125f, 4.5625f, -7.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 477, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, -0.625f, 0, 0)
			.setRotationPoint(50.3125f, 5.0625f, -8.625f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 441, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(48.4375f, 4.25f, 6.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 314, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.625f, -0.375f, 0.125f, 0, -0.375f, 0.125f, 0, 0, -1.125f, -0.625f, 0, -1.125f, -0.625f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.625f, -0.625f, -0.5f, -0.625f)
			.setRotationPoint(50.3125f, 4.5625f, 7.625f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 142, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0)
			.setRotationPoint(50.3125f, 4.5625f, 0.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 293, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f)
			.setRotationPoint(50.3125f, 5.0625f, 7.625f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 201, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(45.5625f, -17.9375f, -5.6875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 445, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0)
			.setRotationPoint(47.0625f, -17.9375f, -5.6875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 111, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(45.5625f, -17.8125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 88, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(45.5625f, -17.6875f, -8.4375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 34, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(45.5625f, -16.9375f, -8.1875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 293, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.5625f, -0.5f, -0.125f, -0.5625f, -0.5f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(45.5625f, -17.8125f, -6.6875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 88, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5625f, -0.5f, 0, -0.5625f, -0.5f, 0, 0, 0, 0, 0, 0, -0.25f, -0.5625f, -0.5f, -0.25f, -0.5625f, -0.5f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(45.5625f, -17.6875f, -8).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 391, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0.25f, 0.125f, 0, 0.25f, 0.25f, 0, 0, 0, 0, -0.125f, -0.125f, 0, 0.125f, 0.125f, 0, 0.125f, 0.25f, 0, -0.125f, 0)
			.setRotationPoint(46.5625f, -17.8125f, -7.125f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 383, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.25f, 0, 0.25f, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0.25f, 0, -0.25f, 0)
			.setRotationPoint(46.0625f, -17.6875f, -8.4375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 314, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(45.5625f, -17.8125f, -4.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 447, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(45.5625f, -17.6875f, -2.9375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 134, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, -0.5625f, 0, -0.125f, -0.5625f)
			.setRotationPoint(45.5625f, -17.8125f, -4.6875f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 506, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5625f, 0, 0, -0.5625f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5625f, 0, -0.25f, -0.5625f)
			.setRotationPoint(45.5625f, -17.6875f, -3.375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 429, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.125f, 0, 0, -0.125f, 0, -0.125f, 0, 0, 0.125f, 0.25f, 0, 0.125f, 0.125f, 0, -0.125f, -0.125f)
			.setRotationPoint(46.5625f, -17.8125f, -4.25f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 471, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, 0, 0, -0.25f, -0.25f)
			.setRotationPoint(46.0625f, -17.6875f, -2.9375f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 429, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(46.5f, -16.4375f, -9.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 471, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46.375f, -17.4375f, -9.625f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 429, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f)
			.setRotationPoint(46.5f, -16.4375f, 8.5f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 507, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(46.375f, -17.4375f, 8.625f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 119, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 4, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(39.4375f, -18.75f, -2).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 435, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, 0, 0, -0.75f, 0, 0, 0.25f, 0, 0.5f, 0.25f, 0, 0.5f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(39.4375f, -18.75f, 2).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 34, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, -1.625f, 0, -0.625f, 1, 0, -0.625f, 1, 0, 0, -1.625f, 0, 0)
			.setRotationPoint(46.3125f, -11.875f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 469, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(45.8125f, -12.5f, -12).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 370, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(45.8125f, -12.75f, -11.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 444, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(45.8125f, -9, -11.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 181, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(45.8125f, -12.5f, 11).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 370, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(45.8125f, -12.75f, 10.75f).setRotationAngle(0, 0, 0)
		);
		Cab.add(new ModelRendererTurbo(Cab, 16, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(45.8125f, -9, 10.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(Cab);
		//
		TurboList Panto = new TurboList("Panto");
		Panto.add(new ModelRendererTurbo(Panto, 435, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.375f, 0.75f, 0, -0.375f, 0.75f, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, 0.75f, -0.375f, -0.375f, 0.75f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(29, -18.75f, -3.375f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 432, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(28.375f, -18.75f, -3).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 497, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, 0, 0, 0, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(34.75f, -18.75f, -3).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 499, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, -0.375f, 0.75f, 0, -0.375f, 0.75f, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, 0.75f, -0.375f, -0.375f, 0.75f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(29, -18.75f, 2).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 0, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(29.5f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 506, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(33.75f, -18.75f, -4).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 498, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.375f, 0, -0.625f, 0.375f)
			.setRotationPoint(29.8125f, -19.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 350, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0.375f, 0, 0, 0.375f, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0.375f, 0, -0.625f, 0.375f)
			.setRotationPoint(34.0625f, -19.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 16, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.375f, 0.1875f, 0, -0.375f, 0.1875f, 0, 0, -0.75f, 0, 0, 0, 0.3125f, -0.375f, 1, 0.3125f, -0.375f, 1, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(32.25f, -20.0625f, -1.3125f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 498, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0.875f, 0.75f, 0, 0.875f, 0.75f, 0, 0, 0, 0, 0, 0, -0.375f, 0.875f, 0.75f, -0.375f, 0.875f, 0.75f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(29, -18.75f, -0.0625f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 0, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, -0.375f, 0.1875f, 0, -0.375f, 0.1875f, 0, 0, -0.75f, 0, 0, 0, 0.3125f, -0.375f, 1, 0.3125f, -0.375f, 1, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(32.25f, -20.0625f, -0.0625f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 429, 80, textureX, textureY)
			.addShapeBox(-12.9375f, -0.25f, 0, 13, 1, 1, 0, 0, 0, -0.375f, 0.1875f, 0, -0.375f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(33.1875f, -19.8125f, -0.6875f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 502, 33, textureX, textureY)
			.addShapeBox(-15.25f, -0.25f, 0, 3, 1, 1, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.75f, 0.1875f, -0.375f, -0.75f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(33.1875f, -19.8125f, -0.4375f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 503, 3, textureX, textureY)
			.addShapeBox(-15.25f, -0.25f, 0, 3, 1, 1, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.75f, 0.1875f, -0.375f, -0.75f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(33.1875f, -19.8125f, -1.3125f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 417, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 1, 0, 0, 0, -0.375f, 0.1875f, 0, -0.375f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.375f, -0.375f, 0.1875f, -0.375f, -0.375f, 0.1875f, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(17.9375f, -20.6875f, -0.6875f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 506, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.1875f, -0.75f, 0.1875f, 0.1875f, -0.75f, 0.1875f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(29.75f, -21.3125f, -0.4375f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 350, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.1875f, 0, -0.75f, 0.1875f, 0, 0, 0, 0, 0, 0, 0.1875f, -0.75f, 0.1875f, 0.1875f, -0.75f, 0.1875f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(29.75f, -21.3125f, -1.3125f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 500, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(28.875f, -21.625f, -1).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 201, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(29.5f, -18.75f, 3).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 165, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(33.75f, -18.75f, 3).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 16, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0.375f, -0.625f, -0.625f, 0.375f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(29.8125f, -19.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0.375f, -0.625f, 0, 0.375f, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0.375f, -0.625f, -0.625f, 0.375f, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(34.0625f, -19.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 485, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(28.875f, -22, -5).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 487, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, 0, 0, 0, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(31.5f, -22, -5).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 505, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1.125f, 0, -0.625f, -1.125f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(28.875f, -22, -7).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 441, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1.125f, 0, -0.625f, -1.125f, 0, -0.625f, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.625f, 0.5f, 0, -0.625f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(31.5f, -22, -7).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 505, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -1.125f, 0, 0, -1.125f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(28.875f, -22, 5).setRotationAngle(0, 0, 0)
		);
		Panto.add(new ModelRendererTurbo(Panto, 505, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, -1.125f, 0, 0, -1.125f, 0, 0, -0.625f, 0, -0.625f, -0.625f, 0, -0.625f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(31.5f, -22, 5).setRotationAngle(0, 0, 0)
		);
		this.groups.add(Panto);
		//
	}

}
