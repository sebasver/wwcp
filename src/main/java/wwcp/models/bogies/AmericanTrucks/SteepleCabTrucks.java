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
public class SteepleCabTrucks extends RollingStockModel {

	public SteepleCabTrucks(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 352, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.75f, 0.75f, 0)
			.setRotationPoint(-10.25f, 3.25f, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 323, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.75f, 0.75f, 0)
			.setRotationPoint(4.9375f, 3.25f, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 335, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.625f, 5.625f, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 306, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.625f, 5.625f, -6).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, -0.6875f, 0, 0, -0.6875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.125f, 0, -0.6875f, -0.125f, 0, -0.6875f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(-8.375f, 4.5625f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, -0.125f, 0, -0.6875f, -0.125f, 0, -0.6875f, -0.125f, -0.75f, 0, -0.125f, -0.75f)
			.setRotationPoint(-7.0625f, 4.5625f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0.1875f, -0.75f, -0.25f, 0.1875f, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, -0.25f, 0.1875f, -0.75f)
			.setRotationPoint(-4.5f, 6.25f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.3125f, 1.8125f, 0, -0.125f, 0.3125f, 0, -0.125f, 0.3125f, -0.75f, -0.3125f, 1.8125f, -0.75f, -0.125f, -1.9375f, 0, -0.375f, 0.0625f, 0, -0.375f, 0.0625f, -0.75f, -0.125f, -1.9375f, -0.75f)
			.setRotationPoint(-6.875f, 6.375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.6875f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, -0.6875f, 0, -0.75f, -0.6875f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.6875f, -0.125f, -0.75f)
			.setRotationPoint(6.375f, 4.5625f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.6875f, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, -0.75f, -0.6875f, -0.125f, -0.75f)
			.setRotationPoint(6.0625f, 4.5625f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0.1875f, 0, -0.5f, 0.1875f, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, -0.25f, 0.1875f, 0, -0.25f, 0.1875f, -0.75f, 0, 0.5f, -0.75f)
			.setRotationPoint(3.5f, 6.25f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.3125f, 0, -0.3125f, 1.8125f, 0, -0.3125f, 1.8125f, -0.75f, -0.125f, 0.3125f, -0.75f, -0.375f, 0.0625f, 0, -0.125f, -1.9375f, 0, -0.125f, -1.9375f, -0.75f, -0.375f, 0.0625f, -0.75f)
			.setRotationPoint(3.875f, 6.375f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 0, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 2, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.6875f, 5.625f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0.125f, 0, 0, 0.125f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0.125f, -0.625f, 0, 0.125f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-10.0625f, 4.5625f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 1, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0.75f, -0.625f, 0, 0.75f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-9.375f, 8.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(-10.0625f, 4.9375f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, -0.6875f, 0.375f, 0, 0.25f, 0.375f, 0, 0.25f, 0.375f, -0.75f, -0.6875f, 0.375f, -0.75f)
			.setRotationPoint(-10.0625f, 5.3125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0.5625f, 0, 0, 0.5625f, 0, 0, 0.5625f, -0.75f, -0.4375f, 0.5625f, -0.75f)
			.setRotationPoint(-9.8125f, 6.6875f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, 0.25f, -0.625f, -0.75f)
			.setRotationPoint(-6.1875f, 4.9375f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.375f, 0, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, -0.75f, 0.25f, 0.375f, -0.75f)
			.setRotationPoint(-6.1875f, 5.3125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, 0, 0, -0.75f, 0, 0.5625f, 0, -0.4375f, 0.5625f, 0, -0.4375f, 0.5625f, -0.75f, 0, 0.5625f, -0.75f)
			.setRotationPoint(-6.4375f, 6.6875f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, -0.625f, 0, 0.25f, -0.625f, 0, 0.25f, -0.625f, -0.75f, 0, -0.625f, -0.75f)
			.setRotationPoint(5.1875f, 4.9375f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, -0.6875f, 0.375f, 0, 0.25f, 0.375f, 0, 0.25f, 0.375f, -0.75f, -0.6875f, 0.375f, -0.75f)
			.setRotationPoint(5.1875f, 5.3125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0.5625f, 0, 0, 0.5625f, 0, 0, 0.5625f, -0.75f, -0.4375f, 0.5625f, -0.75f)
			.setRotationPoint(5.4375f, 6.6875f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, -0.625f, 0, 0, -0.625f, 0, 0, -0.625f, -0.75f, 0.25f, -0.625f, -0.75f)
			.setRotationPoint(9.0625f, 4.9375f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0.375f, 0, -0.6875f, 0.375f, 0, -0.6875f, 0.375f, -0.75f, 0.25f, 0.375f, -0.75f)
			.setRotationPoint(9.0625f, 5.3125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0, -0.75f, 0, 0, -0.75f, 0, 0.5625f, 0, -0.4375f, 0.5625f, 0, -0.4375f, 0.5625f, -0.75f, 0, 0.5625f, -0.75f)
			.setRotationPoint(8.8125f, 6.6875f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 0, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 2, 2, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5625f, 5.625f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.375f, 0.5f, 0.5f, -0.375f, 0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-8.4375f, 5.4375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, 0, 0, 0, 0, -0.125f, -0.4375f, -0.375f, -0.25f, -0.3125f, -0.375f, -0.25f, -0.3125f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(-8.4375f, 6.9375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.3125f, -0.375f, -0.125f, -0.4375f, -0.375f, -0.125f, -0.4375f, 0, -0.25f, -0.3125f, 0)
			.setRotationPoint(-7.9375f, 6.9375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.5f, 0, -0.75f, 0.5f, 0, 0, 0, 0, 0, 0, 0.5f, -0.375f, 0.5f, 0.5f, -0.375f, 0.5f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(6.8125f, 5.4375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, 0, 0, 0, 0, 0, -0.125f, -0.4375f, -0.375f, -0.25f, -0.3125f, -0.375f, -0.25f, -0.3125f, 0, -0.125f, -0.4375f, 0)
			.setRotationPoint(6.8125f, 6.9375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, 0, 0, 0, -0.25f, 0, 0, -0.25f, -0.3125f, -0.375f, -0.125f, -0.4375f, -0.375f, -0.125f, -0.4375f, 0, -0.25f, -0.3125f, 0)
			.setRotationPoint(7.3125f, 6.9375f, -7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-0.5f, 5.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 140, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5625f, -0.625f, -0.5f, -0.5625f, -0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-7.875f, 5.25f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 135, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.625f, 0, -0.75f, -0.625f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5625f, -0.625f, -0.5f, -0.5625f, -0.625f, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(7.375f, 5.25f, -7.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, 0, -2.25f, 0, 0, -2.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(0.5f, 5.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -2.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -2.25f, -0.75f, 0, 0.75f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.75f, -0.75f)
			.setRotationPoint(-4.5f, 5.25f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, 0, 0, 0, 0, 0, 0, -0.75f, 0, -0.1875f, -0.75f, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, 0, -0.5625f, -0.75f)
			.setRotationPoint(-4.5f, 7.8125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, -0.1875f, 0, 0, -0.1875f, -0.75f, 0, 0, -0.75f, 0, -0.5625f, 0, 0, -0.5625f, 0, 0, -0.5625f, -0.75f, 0, -0.5625f, -0.75f)
			.setRotationPoint(3.5f, 7.8125f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.6875f, 0, 0, -0.6875f, 0, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f)
			.setRotationPoint(-0.5f, 4.9375f, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f)
			.setRotationPoint(-3.5f, 6.25f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.75f, 0.75f, 0)
			.setRotationPoint(-10.25f, 3.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 6, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0.75f, 0.75f, 0, 0, 0.75f, 0, 0, 0.75f, 0, 0.75f, 0.75f, 0)
			.setRotationPoint(4.9375f, 3.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.75f, -0.6875f, 0, -0.75f, -0.6875f, 0, 0, 0, -0.5f, 0, 0, -0.125f, -0.75f, -0.6875f, -0.125f, -0.75f, -0.6875f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-8.375f, 4.5625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, -0.125f, -0.75f, -0.6875f, -0.125f, -0.75f, -0.6875f, -0.125f, 0, 0, -0.125f, 0)
			.setRotationPoint(-7.0625f, 4.5625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0.1875f, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0.1875f, 0, -0.25f, 0.1875f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, -0.25f, 0.1875f, 0)
			.setRotationPoint(-4.5f, 6.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.3125f, 1.8125f, -0.75f, -0.125f, 0.3125f, -0.75f, -0.125f, 0.3125f, 0, -0.3125f, 1.8125f, 0, -0.125f, -1.9375f, -0.75f, -0.375f, 0.0625f, -0.75f, -0.375f, 0.0625f, 0, -0.125f, -1.9375f, 0)
			.setRotationPoint(-6.875f, 6.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.6875f, 0, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, -0.6875f, 0, 0, -0.6875f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.6875f, -0.125f, 0)
			.setRotationPoint(6.375f, 4.5625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.6875f, -0.125f, -0.75f, 0, -0.125f, -0.75f, 0, -0.125f, 0, -0.6875f, -0.125f, 0)
			.setRotationPoint(6.0625f, 4.5625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.5f, 0.1875f, -0.75f, -0.5f, 0.1875f, 0, 0, 0, 0, 0, 0.5f, -0.75f, -0.25f, 0.1875f, -0.75f, -0.25f, 0.1875f, 0, 0, 0.5f, 0)
			.setRotationPoint(3.5f, 6.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.125f, 0.3125f, -0.75f, -0.3125f, 1.8125f, -0.75f, -0.3125f, 1.8125f, 0, -0.125f, 0.3125f, 0, -0.375f, 0.0625f, -0.75f, -0.125f, -1.9375f, -0.75f, -0.125f, -1.9375f, 0, -0.375f, 0.0625f, 0)
			.setRotationPoint(3.875f, 6.375f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 0, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-8.6875f, 5.625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, -0.75f, 0.125f, 0, -0.75f, 0.125f, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, 0.125f, -0.625f, -0.75f, 0.125f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-10.0625f, 4.5625f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 18, 1, 1, 0, 0, 0, -0.75f, 0.75f, 0, -0.75f, 0.75f, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, 0.75f, -0.625f, -0.75f, 0.75f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-9.375f, 8.25f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, 0.25f, -0.625f, -0.75f, 0.25f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-10.0625f, 4.9375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, -0.6875f, 0.375f, -0.75f, 0.25f, 0.375f, -0.75f, 0.25f, 0.375f, 0, -0.6875f, 0.375f, 0)
			.setRotationPoint(-10.0625f, 5.3125f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0.5625f, -0.75f, 0, 0.5625f, -0.75f, 0, 0.5625f, 0, -0.4375f, 0.5625f, 0)
			.setRotationPoint(-9.8125f, 6.6875f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, 0.25f, -0.625f, 0)
			.setRotationPoint(-6.1875f, 4.9375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.375f, -0.75f, -0.6875f, 0.375f, -0.75f, -0.6875f, 0.375f, 0, 0.25f, 0.375f, 0)
			.setRotationPoint(-6.1875f, 5.3125f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5625f, -0.75f, -0.4375f, 0.5625f, -0.75f, -0.4375f, 0.5625f, 0, 0, 0.5625f, 0)
			.setRotationPoint(-6.4375f, 6.6875f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, 0, -0.625f, -0.75f, 0.25f, -0.625f, -0.75f, 0.25f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(5.1875f, 4.9375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0.25f, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0, -0.6875f, 0.375f, -0.75f, 0.25f, 0.375f, -0.75f, 0.25f, 0.375f, 0, -0.6875f, 0.375f, 0)
			.setRotationPoint(5.1875f, 5.3125f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4375f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -0.4375f, 0, 0, -0.4375f, 0.5625f, -0.75f, 0, 0.5625f, -0.75f, 0, 0.5625f, 0, -0.4375f, 0.5625f, 0)
			.setRotationPoint(5.4375f, 6.6875f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.625f, -0.75f, 0, -0.625f, -0.75f, 0, -0.625f, 0, 0.25f, -0.625f, 0)
			.setRotationPoint(9.0625f, 4.9375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0.375f, -0.75f, -0.6875f, 0.375f, -0.75f, -0.6875f, 0.375f, 0, 0.25f, 0.375f, 0)
			.setRotationPoint(9.0625f, 5.3125f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, -0.4375f, 0, -0.75f, -0.4375f, 0, 0, 0, 0, 0, 0, 0.5625f, -0.75f, -0.4375f, 0.5625f, -0.75f, -0.4375f, 0.5625f, 0, 0, 0.5625f, 0)
			.setRotationPoint(8.8125f, 6.6875f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 0, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(6.5625f, 5.625f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f)
			.setRotationPoint(-8.4375f, 5.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, -0.125f, -0.4375f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.375f, -0.125f, -0.4375f, -0.375f)
			.setRotationPoint(-8.4375f, 6.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.3125f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, -0.375f, -0.25f, -0.3125f, -0.375f)
			.setRotationPoint(-7.9375f, 6.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.75f, 0, 0, -0.75f, 0, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, -0.375f, 0, 0.5f, -0.375f)
			.setRotationPoint(6.8125f, 5.4375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.375f, 0, 0, -0.375f, -0.125f, -0.4375f, 0, -0.25f, -0.3125f, 0, -0.25f, -0.3125f, -0.375f, -0.125f, -0.4375f, -0.375f)
			.setRotationPoint(6.8125f, 6.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.25f, 0, -0.375f, -0.25f, -0.3125f, 0, -0.125f, -0.4375f, 0, -0.125f, -0.4375f, -0.375f, -0.25f, -0.3125f, -0.375f)
			.setRotationPoint(7.3125f, 6.9375f, 6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-0.5f, 5.25f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 3, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.125f, -0.625f, -0.5f, -0.125f, -0.625f, -0.5f, -0.5625f, 0, -0.5f, -0.5625f)
			.setRotationPoint(-7.875f, 5.25f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 2, textureX, textureY)
			.addShapeBox(0.0625f, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.625f, 0, 0, -0.625f, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, -0.125f, -0.625f, -0.5f, -0.125f, -0.625f, -0.5f, -0.5625f, 0, -0.5f, -0.5625f)
			.setRotationPoint(7.375f, 5.25f, 6.8125f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -0.75f, 0, -2.25f, -0.75f, 0, -2.25f, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0.75f, -0.75f, 0, 0.75f, 0, 0, 0, 0)
			.setRotationPoint(0.5f, 5.25f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -2.25f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -2.25f, 0, 0, 0.75f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0.75f, 0)
			.setRotationPoint(-4.5f, 5.25f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1875f, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.1875f, 0, 0, -0.5625f, -0.75f, 0, -0.5625f, -0.75f, 0, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(-4.5f, 7.8125f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, -0.1875f, -0.75f, 0, -0.1875f, 0, 0, 0, 0, 0, -0.5625f, -0.75f, 0, -0.5625f, -0.75f, 0, -0.5625f, 0, 0, -0.5625f, 0)
			.setRotationPoint(3.5f, 7.8125f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.6875f, -0.75f, 0, -0.6875f, -0.75f, 0, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-0.5f, 4.9375f, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.75f, 0, 0.5f, -0.75f, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-3.5f, 6.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 12, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.4375f, 0, 0.5f, -0.4375f, 0, 0.5f, -0.4375f, 0, 0, -0.4375f, 0)
			.setRotationPoint(-1.75f, 2.8125f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 11, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.1875f, 0, 0.5f, 0.1875f, 0, 0.5f, 0.1875f, 0, 0, 0.1875f, 0)
			.setRotationPoint(-1.75f, 3.375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(1.75f, 4.5625f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.75f, 4.5625f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-1.75f, 3.375f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-1.75f, 3.75f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 184, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 13, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-1.75f, 4.5625f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 13, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.625f, 0, 0.5f, -0.625f, 0, 0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-1.75f, 8.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 11, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0.3125f, 0, 0.5f, 0.3125f, 0, 0.5f, 0.3125f, 0, 0, 0.3125f, 0)
			.setRotationPoint(-1.75f, 4.9375f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(1.375f, 3.75f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.625f, 0.5f, 0, -0.625f, 0.5f, 0, 0, 0, 0, 0, 0, -0.625f, -0.625f, 0.5f, -0.625f, -0.625f, 0.5f, -0.625f, 0, 0, -0.625f, 0)
			.setRotationPoint(-1.75f, 3.375f, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(-1.75f, 3.75f, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.625f, -0.625f, 0, -0.625f, -0.625f, 0, 0, 0, 0, 0, 0, -0.1875f, -0.625f, -0.625f, -0.1875f, -0.625f, -0.625f, -0.1875f, 0, 0, -0.1875f, 0)
			.setRotationPoint(1.375f, 3.75f, 4.875f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, -0.6875f, 0, 0.5f, -0.6875f, 0, 0.5f, -0.6875f, 0, 0, -0.6875f, 0)
			.setRotationPoint(-1.75f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
		//
	}

}
