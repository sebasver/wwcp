//FMT-Marker TiM-1.0
package wwcp.models.bogies;

import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.1 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class SU46Bogie extends RollingStockModel {

	public SU46Bogie(){
		super(); textureX = 256; textureY = 256;
		this.addToCreators("!IceWelder");
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0)
			.setRotationPoint(10, 7, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0)
			.setRotationPoint(-5, 7, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0)
			.setRotationPoint(-20, 7, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 1, 6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 1, 6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19, 3, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 3, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(14, 4, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-1, 4, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-16, 4, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, 3, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 3, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, 3, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 5, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(14.5f, 5, -6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 5, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(-0.5f, 5, -6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 5, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(-15.5f, 5, -6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 5, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(-15, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 3, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 1, -7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 3, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(0, 1, -7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(19, 3, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0)
			.setRotationPoint(10, 7, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0)
			.setRotationPoint(-5, 7, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0)
			.setRotationPoint(-20, 7, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 3, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-16, 4, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-1, 4, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(14, 4, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, 3, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 3, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 195, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14, 3, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(14.5f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-0.5f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-15.5f, 5, 6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 189, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-15.5f, 5, -8.5f).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-0.5f, 5, -8.5f).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(14.5f, 5, -8.5f).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.1f, 3.75f, 6.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.1f, 4.75f, 6.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.1f, 5.75f, 6.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-4.9f, 3.75f, 6.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-4.9f, 4.75f, 6.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-4.9f, 5.75f, 6.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-19.9f, 3.75f, 6.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-19.9f, 4.75f, 6.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-19.9f, 5.75f, 6.75f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.1f, 5.75f, -8.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.1f, 4.75f, -8.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(10.1f, 3.75f, -8.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-4.9f, 5.75f, -8.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-4.9f, 4.75f, -8.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-4.9f, 3.75f, -8.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.6f, 3.75f, -8.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-19.9f, 3.75f, -8.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-19.9f, 4.75f, -8.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-19.9f, 5.75f, -8.25f).setRotationAngle(0, 0, -20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, -2, 0, -2, 0, 0, -2, 0, 0, 0, -2, 0)
			.setRotationPoint(0, 1, 8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, -3, 0, -2, 0, 0, -2, 0, -0.5f, 0, -3, -0.5f)
			.setRotationPoint(0, 0, 8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, -2, 0, 0, 0, -3, 0, 0, -3, -0.5f, -2, 0, -0.5f)
			.setRotationPoint(-2, 0, 8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f, -2, 0, 0, 0, -3, 0, 0, -3, -0.5f, -2, 0, -0.5f)
			.setRotationPoint(-2, 0, -8.5f).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 5, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, -3, 0, -2, 0, 0, -2, 0, -0.5f, 0, -3, -0.5f)
			.setRotationPoint(0, 0, -8.5f).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 5, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(20, 3, -6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20, 3, -7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(20, 3, 6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 4, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(-21, 3, -6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-21, 3, 6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-21, 3, -7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(6.5f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(-7.5f, 3, -6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 0, textureX, textureY).addBox(0, 0, 0, 13, 1, 2)
			.setRotationPoint(-6.5f, 3, -1).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 5, textureX, textureY).addBox(0, 0, 0, 2, 3, 2)
			.setRotationPoint(-1, 0, -1).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 15, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(10, 4, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 15, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(4, 4, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 15, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-5, 4, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 14, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-11, 4, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, 3, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, 3, 7).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 10, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-11, 4, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 10, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-5, 4, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 5, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(4, 4, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 5, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(10, 4, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, 3, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, 3, -8).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 5, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(0, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 115, 5, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(15, 5.5f, -6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 5, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(15, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 5, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(0, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 5, textureX, textureY).addBox(-4.5f, -4.5f, 0, 9, 9, 0)
			.setRotationPoint(-15, 5.5f, 6).setRotationAngle(0, 0, 0).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.6f, 4.75f, -8.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.6f, 5.75f, -8.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(4.4f, 3.75f, -8.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(4.4f, 4.75f, -8.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(4.4f, 5.75f, -8.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(19.4f, 3.75f, -8.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(19.4f, 3.75f, -8.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(19.4f, 4.75f, -8.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(19.4f, 5.75f, -8.25f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(19.4f, 5.75f, 6.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(19.4f, 4.75f, 6.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(19.4f, 3.75f, 6.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(4.4f, 3.75f, 6.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(4.4f, 4.75f, 6.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(4.4f, 5.75f, 6.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.6f, 5.75f, 6.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.6f, 4.75f, 6.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-10.6f, 3.75f, 6.75f).setRotationAngle(0, 0, 20).setName("Box 61cp")
		);
		this.groups.add(clipboard);
		//
	}

}
