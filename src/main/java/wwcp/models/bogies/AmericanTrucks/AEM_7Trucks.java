//FMT-Marker TiM-1.0
package wwcp.models.bogies.AmericanTrucks;

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
public class AEM_7Trucks extends RollingStockModel {

	public AEM_7Trucks(){
		super(); textureX = 512; textureY = 512;
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 467, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.25f, 1, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 430, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 0.75f, -1).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.25f, 1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.75f, 4.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.125f, 4.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.75f, 4.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -1.25f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -1.25f, 0.5f, 0)
			.setRotationPoint(-15, 3.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0.5f, 0, -1.25f, 0.5f, 0, -1.25f, 0.5f, 0, -0.125f, 0.5f, 0)
			.setRotationPoint(-6.5f, 3.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.75f, 7, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.75f, 4.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(11.125f, 4.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(6.75f, 4.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0.5f, 0, -1.25f, 0.5f, 0, -1.25f, 0.5f, 0, -0.125f, 0.5f, 0)
			.setRotationPoint(13, 3.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -1.25f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -1.25f, 0.5f, 0)
			.setRotationPoint(4.5f, 3.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-15.625f, 2.75f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 22, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3.75f, 6.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, 0.25f, 0, -0.625f, 0.25f)
			.setRotationPoint(-1.125f, 3.125f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 315, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, 0.25f, 0, -0.625f, 0.25f)
			.setRotationPoint(-3.625f, 3.125f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.25f, 0, 0, 0.25f, 0, -0.625f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, 0.25f, 0, -0.625f, 0.25f)
			.setRotationPoint(1.5f, 3.125f, -10.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0.25f, 0.5f, 0, 0.25f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setRotationPoint(-3.625f, 2.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.375f, 0, -0.25f, -0.375f, 0, -0.25f, -0.375f, -0.5f, -0.5f, -0.375f, -0.5f)
			.setRotationPoint(0.625f, 4.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.625f, 0, -0.25f, 0.625f, 0, -0.25f, 0.625f, -0.5f, -0.5f, 0.625f, -0.5f)
			.setRotationPoint(0.625f, 4.875f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.375f, 0, -1, -0.375f, 0, -1, -0.375f, -0.5f, 0, -0.375f, -0.5f)
			.setRotationPoint(-3.625f, 4.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 0, 2.6875f, 0, 0, -0.25f, 0, -0.75f, -0.75f, 0.5f, 0.125f, 0, 0.5f, 1.75f, 2.6875f, 0, -0.75f, -0.25f)
			.setRotationPoint(-7.125f, 2.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, -3, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0.6875f, 0.5f, 0, 0.6875f, -3, -0.75f, -0.75f, 0, -0.75f, -0.75f, 0, -0.75f, 0.6875f, 0.5f, 1.5f, 0.6875f)
			.setRotationPoint(5.125f, 2.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0.1875f, 0, 0, 0.1875f, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0.1875f, 0, -0.5f, 0.1875f)
			.setRotationPoint(-3.625f, 2.75f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.75f, 4.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.75f, 4.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.125f, 0.75f, 0, -0.125f, 0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0.75f, -0.5f, -0.125f, 0.75f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.125f, 6.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.125f, 0.75f, 0, -0.125f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0.75f, 0, -0.125f, 0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.125f, 3.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0.75f, 0, 0, 0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0.75f, -0.5f, 0)
			.setRotationPoint(7.125f, 6.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0.75f, 0, 0)
			.setRotationPoint(7.125f, 3.5f, -7.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.25f, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.25f, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.125f, 4.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 351, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.75f, 4.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -1.25f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -1.25f, 0.5f, 0)
			.setRotationPoint(-15, 3.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0.5f, 0, -1.25f, 0.5f, 0, -1.25f, 0.5f, 0, -0.125f, 0.5f, 0)
			.setRotationPoint(-6.5f, 3.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.75f, 7, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(11.125f, 4.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0, 0.375f, 0, 0, 0, 0, 0, 0, 0, 0, 0.375f, 0, 0)
			.setRotationPoint(6.75f, 4.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0.5f, 0, -1.25f, 0.5f, 0, -1.25f, 0.5f, 0, -0.125f, 0.5f, 0)
			.setRotationPoint(13, 3.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, -1.25f, 0.5f, 0, -0.125f, 0.5f, 0, -0.125f, 0.5f, 0, -1.25f, 0.5f, 0)
			.setRotationPoint(4.5f, 3.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 31, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0.25f, -0.25f, 0, 0.25f, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-15.625f, 2.75f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, -0.625f, 0.25f, 0.25f, -0.625f, 0.25f, 0.25f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-1.125f, 3.125f, 8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, -0.625f, 0.25f, 0.25f, -0.625f, 0.25f, 0.25f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-3.625f, 3.125f, 8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, -0.625f, 0.25f, 0.25f, -0.625f, 0.25f, 0.25f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(1.5f, 3.125f, 8.4375f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0.25f, 0.5f, -0.5f, 0.25f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-3.625f, 2.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, -0.5f, -0.375f, -0.5f, -0.25f, -0.375f, -0.5f, -0.25f, -0.375f, 0, -0.5f, -0.375f, 0)
			.setRotationPoint(0.625f, 4.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 413, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0.625f, -0.5f, -0.25f, 0.625f, -0.5f, -0.25f, 0.625f, 0, -0.5f, 0.625f, 0)
			.setRotationPoint(0.625f, 4.875f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, 0, 0, 0, 0, 0, -0.375f, -0.5f, -1, -0.375f, -0.5f, -1, -0.375f, 0, 0, -0.375f, 0)
			.setRotationPoint(-3.625f, 4.25f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 3, 0, 0, 0, 0.1875f, 0.25f, 0, 0.1875f, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0.1875f, 0.25f, -0.5f, 0.1875f, 0.25f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3.625f, 2.75f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.75f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8.75f, 4.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0.75f, -0.5f, 0, 0.75f, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-13.125f, 6.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-13.125f, 3.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0.75f, 0, -0.125f, 0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0.75f, -0.5f, -0.125f)
			.setRotationPoint(7.125f, 6.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0.75f, 0, -0.125f, 0.75f, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0.75f, 0, -0.125f)
			.setRotationPoint(7.125f, 3.5f, 6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 4, 12, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0.625f, 0, 0, 0.625f, 0, -0.25f, 0, 0.5f, -0.25f, 0, 0.5f, -0.25f, 0.625f, 0, -0.25f, 0.625f)
			.setRotationPoint(-3.75f, 2.75f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -2.25f, 0.5f, 0, 0.6875f, 0.5f, -0.5f, 0, 0, -0.75f, -0.75f, 0, -0.75f, -2.25f, 0.5f, 1.5f, 0.6875f)
			.setRotationPoint(5.125f, 2.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0.5f, 0, 0.6875f, 0, 0, 0.6875f, 0, 0, -0.75f, -3, 0, -0.75f, 0.5f, 1.5f, 0.6875f, 0, -0.75f, 0.6875f, 0, -0.75f, -0.75f, -3, -0.75f, -0.75f)
			.setRotationPoint(5.125f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0.5f, 0, 0.6875f, 0, 0, -2.25f, 0, 0, -0.75f, 0.5f, 0, 0, 0.5f, 1.5f, 0.6875f, 0, -0.75f, -2.25f, 0, -0.75f, -0.75f, 0.5f, -0.5f, 0)
			.setRotationPoint(5.125f, 2.75f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.75f, 0.5f, 0, -3.6875f, 0.5f, 0, 2.6875f, 0, 0, 2.6875f, 0, -0.75f, -0.75f, 0.5f, 0.125f, -3.6875f, 0.5f, 1.75f, 2.6875f, 0, -0.75f, 2.6875f)
			.setRotationPoint(-7.125f, 2.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -0.25f, 0.5f, 0, 2.6875f, 0.5f, 0, 0, 0, 0, -0.75f, 0, -0.75f, -0.25f, 0.5f, 1.75f, 2.6875f, 0.5f, 0.125f, 0, 0, -0.75f, -0.75f)
			.setRotationPoint(-7.125f, 2.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 2.6875f, 0.5f, 0, 2.6875f, 0.5f, 0, -3.6875f, 0, 0, -0.75f, 0, -0.75f, 2.6875f, 0.5f, 1.75f, 2.6875f, 0.5f, 0.125f, -3.6875f, 0, -0.75f, -0.75f)
			.setRotationPoint(-7.125f, 2.75f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 11, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(3.75f, 2.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 11, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.25f, 2.75f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.625f, 0, -0.25f, 0.625f)
			.setRotationPoint(-15.625f, 2.75f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.625f, 0, 0, 0.625f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0.625f, 0, -0.25f, 0.625f)
			.setRotationPoint(14.625f, 2.75f, -6.3125f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
		//
	}

}
