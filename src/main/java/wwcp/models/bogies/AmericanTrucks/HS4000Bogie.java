//FMT-Marker TiM-1.0
package wwcp.models.bogies.AmericanTrucks;

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
public class HS4000Bogie extends RollingStockModel {

	public HS4000Bogie(){
		super(); textureX = 256; textureY = 256;
		this.addToCreators("IceWelder");
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 4, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(-19, 5, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 4, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(0, 5, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 4, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(19, 5, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 4, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(19.5f, 5.5f, 5.99f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 0, textureX, textureY).addBox(0, 0, 0, 29, 2, 1)
			.setRotationPoint(-14, 2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-2, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(17, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15, 2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21, 2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -4, 2, 0, 0, 0, 0, 0, 0, 0, -4, 2, 0)
			.setRotationPoint(20, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -4, 2, 0, -4, 2, 0, 0, 0, 0)
			.setRotationPoint(-23, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 19, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(0, 5, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 19, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(19, 5, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 20, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(20, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 19, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-19, 5, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 20, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(-19, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(24, 5, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 4, textureX, textureY).addBox(0, 0, 0, 1, 2, 12)
			.setRotationPoint(25, 5, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-25, 5, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 0, textureX, textureY).addBox(0, 0, 0, 1, 2, 12)
			.setRotationPoint(-25, 5, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 19, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(10.5f, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 19, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(8.5f, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(8.6f, 5.9f, 5.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 19, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-8.5f, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 19, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-10.5f, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-8.05f, 5.75f, 5.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-8.05f, 4.75f, 5.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-8.05f, 3.75f, 5.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.05f, 3.75f, 5.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.05f, 4.75f, 5.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.05f, 5.75f, 5.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(8.6f, 4.9f, 5.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(8.6f, 3.9f, 5.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.6f, 5.9f, 5.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.6f, 4.9f, 5.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.6f, 3.9f, 5.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25, 5, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, 5, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -4, 2, 0, 0, 0, 0, 0, 0, 0, -4, 2, 0)
			.setRotationPoint(20, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15, 2, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY).addBox(0, 0, 0, 29, 2, 1)
			.setRotationPoint(-14, 2, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -4, 2, 0, -4, 2, 0, 0, 0, 0)
			.setRotationPoint(-23, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21, 2, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 18, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(0, 5, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(1, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-2, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(17, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 18, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(19, 5, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 20, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(20, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 18, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-19, 5, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 19, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(-19, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 18, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-10.5f, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 18, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-8.5f, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.05f, 5.75f, -7.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.05f, 4.75f, -7.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.05f, 3.75f, -7.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-8.05f, 3.75f, -7.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-8.05f, 4.75f, -7.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-8.05f, 5.75f, -7.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 17, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(8.5f, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 17, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(10.5f, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(8.6f, 3.9f, -7.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(8.6f, 4.9f, -7.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(8.6f, 5.9f, -7.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.6f, 3.9f, -7.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.6f, 4.9f, -7.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.6f, 5.9f, -7.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(19, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-19, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 87, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-19, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(19, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 19, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(12.5f, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 19, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(7.5f, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 19, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(-6.5f, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 19, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(-11.5f, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 19, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(7.5f, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 19, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(12.5f, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 19, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(-11.5f, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 14, textureX, textureY).addBox(0, 0, 0, 0, 3, 1)
			.setRotationPoint(-6.5f, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(20, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 150, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-20, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(20, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-20, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 2, 0, -0.5f, 0, 0, 0, -5, 0, 0, -5, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 4, 0, -1, 4, 0, -0.5f, 0, 0)
			.setRotationPoint(1, 0, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 2, 0, 0, -5, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -5, 0, -1, 4, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 4, 0)
			.setRotationPoint(-25, 0, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 10, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-0.5f, 0, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 4, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(0.5f, 5.5f, 5.99f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 4, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(-18.5f, 5.5f, 5.99f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 4, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(-18.5f, 5.5f, -5.99f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 4, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(0.5f, 5.5f, -5.99f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 0, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(19.5f, 5.5f, -5.99f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 8, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(9.5f, 7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 4, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-9.5f, 7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 4, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-9.5f, 7, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 34, 4, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(9.5f, 7, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2, 0)
			.setRotationPoint(0, 7, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 186, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(6, 7, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2, 0, 0, -2, 0, -0.5f, 0, 0)
			.setRotationPoint(14, 7, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(10, 7, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2, 0, -0.5f, -2, 0, 0, 0, 0)
			.setRotationPoint(-5, 7, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.5f, 7, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-14, 7, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 164, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2, 0)
			.setRotationPoint(-19, 7, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(10, 7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2, 0, 0, -2, 0, -0.5f, 0, 0)
			.setRotationPoint(14, 7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(6, 7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -2, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2, 0)
			.setRotationPoint(0, 7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-8.5f, 7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2, 0, -0.5f, -2, 0, 0, 0, 0)
			.setRotationPoint(-5, 7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-14, 7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -2, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2, 0)
			.setRotationPoint(-19, 7, -7).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
		//
	}

}
