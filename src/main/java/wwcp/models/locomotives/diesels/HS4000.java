//FMT-Marker FVTM-1.5
package wwcp.models.locomotives.diesels;

import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */

public class HS4000 extends RollingStockModel {

	public HS4000(){
		super(); textureX = 1024; textureY = 1024;
		this.addToCreators("IceWelder");
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 35, textureX, textureY).addBox(0, 0, 0, 1, 10, 10)
			.setRotationPoint(96, -10, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 672, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(96, -10, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 793, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(96, -10, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 2, 0, 2, 0, -1, -4, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, -1, -4, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(94, -10, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 1013, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 3, 0, 2, 0, 0, -3, 0, 0, -5, 0, -1, 3, 0, -2, 0, 0, 0, -1, 0, 0, -4, 0, -1, 2, 0, -2)
			.setRotationPoint(94, -16, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 10, 0, 3, 0, 0, -3, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(96, -16, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 892, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 3, 0, 3, 0, -2, -5, 0, -1, -3, 0, 0, 2, 0, 0, 2, 0, -2, -4, 0, -1, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(94, -16, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 933, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 1, 0, 0, -3, 0, 0, -3, 0, -2, 1, 0, -2, 0, 0, -1, -1, 0, 0, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(91, -18, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 4, 0, 1, 0, 0, -3, 0, 0, -4, 0, 0, 1, 0, 0, -2, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(91, -18, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, 3, -1, 0, -3, -1, 0, -3, -1, 0, 3, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(93, -19, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 4, 0, 0, 0, 0, -7, 0, 0, -1, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(84, -20, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 4, 0, 0, -2, 0, -1, -2, 0, -7, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(84, -20, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 290, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, 3, -1, 0, -3, -1, 0, -3, -1, 0, 3, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(93, -19, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 267, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 10, 0, 6, -5, 0, -7, -3, 0, -7, -3, 0, 6, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(90, -23, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 924, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 1, 0, -2, -3, 0, -2, -3, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, -1)
			.setRotationPoint(91, -18, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 4, 0, 1, 0, 0, -4, 0, 0, -3, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(91, -18, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 31, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 4, 0, 0, 0, 0, -11, 0, 0, 0, -1, 0, 0, -1, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0)
			.setRotationPoint(73, -21, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 996, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 7, 2, 0, 0, 0, 0, -11, 0, 0, -11, 0, 0, 0, 0, 0, 0, -6, 0, 0, -6, 0, 0, -6, 0, 0, -6, 0)
			.setRotationPoint(73, -21, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 731, 45, textureX, textureY).addBox(0, 0, 0, 2, 10, 1)
			.setRotationPoint(90, -10, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 587, 36, textureX, textureY).addBox(0, 0, 0, 6, 16, 1)
			.setRotationPoint(84, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 724, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(90, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 1, -1, 0, 1, -1, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(84, -18, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 622, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 137, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -20, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 836, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(90.5f, 0, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 825, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(95.5f, 0, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 35, textureX, textureY).addBox(0, 0, 0, 1, 3, 10)
			.setRotationPoint(95.5f, 0, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 2, 0, 0, 0, 0, -1, 0, 0, -4, 0, 0, 2, 0, -1, 0, 0, 0, -1, 0, 0, -4, 0, 0, 2, 0, -1)
			.setRotationPoint(94, -10, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 818, 36, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
			.setRotationPoint(80, -2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 811, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(95.5f, 0, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 800, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(90.5f, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 535, 40, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(88.5f, 0, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(88.5f, 2, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 915, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, -0.75f, 0)
			.setRotationPoint(85.5f, 0, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 525, 36, textureX, textureY).addBox(0, 0, 0, 0, 3, 8)
			.setRotationPoint(97, -9, -4).setRotationAngle(0, 0, 0).setName("FrontNumberplate")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 608, 14, textureX, textureY).addBox(0, 0, 0, 129, 16, 1)
			.setRotationPoint(-49, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 31, textureX, textureY).addBox(0, 0, 0, 115, 1, 2)
			.setRotationPoint(-42, -21, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 115, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -21, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 115, 1, 4, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -21, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 612, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 137, 2, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -20, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 2, 1, 0, 0, 0, -2, 0, 0, -2, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, -18, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -2, -1, 0, -2, -1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(84, -18, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(88.5f, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 40, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(88.5f, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, -1, -0.75f, 0)
			.setRotationPoint(85.5f, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 45, textureX, textureY).addBox(0, 0, 0, 2, 10, 1)
			.setRotationPoint(90, -10, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(90, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 572, 36, textureX, textureY).addBox(0, 0, 0, 6, 16, 1)
			.setRotationPoint(84, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 789, 36, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
			.setRotationPoint(80, -2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -2, -0.25f, 0)
			.setRotationPoint(86.5f, 0.25f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(97.5f, 2, -0.5f).setRotationAngle(0, 0, 0).setName("Box 395cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 821, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(99.5f, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 395cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 34, textureX, textureY).addBox(0, 0, 0, 1, 10, 10)
			.setRotationPoint(-66, -10, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 782, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64, -10, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 771, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-64, -10, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 2, 0, -1, 0, 0, 0, 0, 0, 2, 0, -1, -4, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, -1, -4, 0, 0)
			.setRotationPoint(-65, -10, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 683, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 10, 2, 0, -4, 0, 0, 2, 0, -1, 0, 0, 0, -1, 0, 0, -4, 0, 0, 2, 0, -1, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-65, -10, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 760, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 3, 0, -3, 0, 0, 2, 0, 0, 3, 0, -2, -5, 0, -1, -1, 0, 0, 0, 0, 0, 2, 0, -2, -4, 0, -1)
			.setRotationPoint(-65, -16, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 749, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 3, 0, -5, 0, -1, 3, 0, -2, 2, 0, 0, -3, 0, 0, -4, 0, -1, 2, 0, -2, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-65, -16, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 10, 0, -3, 0, 0, 3, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66, -16, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -3, 0, 0, 1, 0, 0, 1, 0, -2, -3, 0, -2, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(-62, -18, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 4, 0, -3, 0, 0, 1, 0, 0, 1, 0, 0, -4, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-63, -18, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 4, 0, -4, 0, 0, 1, 0, 0, 1, 0, 0, -3, 0, 0, -1, 0, 0, -1, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -18, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -3, 0, -2, 1, 0, -2, 1, 0, 0, -3, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -1, -1, 0, 0)
			.setRotationPoint(-62, -18, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 10, 0, -3, -1, 0, 3, -1, 0, 3, -1, 0, -3, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -19, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 4, 0, -7, 0, 0, 0, 0, 0, 0, -2, 0, -1, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-60, -20, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 4, 0, -1, -2, 0, 0, -2, 0, 0, 0, 0, -7, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -20, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -1, 0, 1, 0, 0, 1, 0, 0, -2, -1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -18, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 872, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, -1, 0, -2, 0, 0, -2, 0, 0, 1, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -18, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-61, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 45, textureX, textureY).addBox(0, 0, 0, 2, 10, 1)
			.setRotationPoint(-61, -10, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 557, 36, textureX, textureY).addBox(0, 0, 0, 6, 16, 1)
			.setRotationPoint(-59, -16, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 531, 36, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
			.setRotationPoint(-53, -2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-61, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 45, textureX, textureY).addBox(0, 0, 0, 2, 10, 1)
			.setRotationPoint(-61, -10, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 542, 36, textureX, textureY).addBox(0, 0, 0, 6, 16, 1)
			.setRotationPoint(-59, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 942, 28, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
			.setRotationPoint(-53, -2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 347, 13, textureX, textureY).addBox(0, 0, 0, 129, 16, 1)
			.setRotationPoint(-49, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 508, 36, textureX, textureY).addBox(0, 0, 0, 0, 3, 8)
			.setRotationPoint(-66.001f, -9, -4).setRotationAngle(0, 0, 0).setName("BackNumberplate")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 34, textureX, textureY).addBox(0, 0, 0, 1, 3, 10)
			.setRotationPoint(-65.5f, 0, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 738, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0)
			.setRotationPoint(-65.5f, 0, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 727, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 4, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65.5f, 0, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 716, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-63.5f, 0, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 705, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-63.5f, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-59.5f, 2, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 40, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-59.5f, 0, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 977, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -2, -0.25f, 0, -2, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-57.5f, 0.25f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-57.5f, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 778, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-59.5f, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 734, 36, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(-59.5f, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 520, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -2, -0.25f, 0, -2, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-57.5f, 0.25f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-57.5f, 0, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 1.25f, 0, 0, -1, 0, 0, -1, 0, 0, 1.25f, 0, 0)
			.setRotationPoint(-66.5f, 1, -0.5f).setRotationAngle(0, 0, 0).setName("Box 395cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-69.5f, 2, -0.5f).setRotationAngle(0, 0, 0).setName("Box 395cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 920, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69.5f, 0, -0.5f).setRotationAngle(0, 0, 0).setName("Box 395cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-65.75f, -8.25f, -8.25f).setRotationAngle(0, 0, 0).setName("BackRearBulb02")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY).addBox(0, 0, 0, 153, 1, 20)
			.setRotationPoint(-61, -1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(92, -1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(92, -1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(92, -1, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(92, -1, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 34, textureX, textureY).addBox(0, 0, 0, 4, 1, 10)
			.setRotationPoint(92, -1, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 995, 28, textureX, textureY).addBox(0, 0, 0, 4, 1, 10)
			.setRotationPoint(-65, -1, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 885, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-65, -1, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65, -1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-63, -1, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 946, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 0, textureX, textureY).addBox(0, 0, 0, 137, 2, 10)
			.setRotationPoint(-53, -20, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -2, -0.25f, 0)
			.setRotationPoint(86.5f, 0.25f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 814, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(80, -12, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 811, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(84, -12, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 747, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(84, -12, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 744, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(80, -12, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53, -12, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 699, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-49, -12, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-53, -12, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 17, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-49, -12, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 35, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(84.5f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 34, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(84.5f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 872, 25, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-56.5f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 7, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
			.setRotationPoint(-56.5f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0.5f, 0, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, 0)
			.setRotationPoint(94.5f, -8.5f, 7).setRotationAngle(0, 0, 0).setName("FrontRearSocket02")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 610, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0.5f, 0, 0, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, 0.5f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(94.5f, -8.5f, -9).setRotationAngle(0, 0, 0).setName("FrontRearSocket01")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, -0.75f, 0, 0, 0.5f, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, 0.5f, -0.5f, 0, 0, -0.5f, -0.5f)
			.setRotationPoint(-65.5f, -8.5f, 7).setRotationAngle(0, 0, 0).setName("BackRearSocket01")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 1014, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, -0.5f, 0.5f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-65.5f, -8.5f, -9).setRotationAngle(0, 0, 0).setName("BackRearSocket02")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-65.75f, -8.25f, 7.25f).setRotationAngle(0, 0, 0).setName("BackRearBulb01")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 162, 41, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(95.75f, -8.25f, 7.25f).setRotationAngle(0, 0, 0).setName("FrontRearBulb02")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 1010, 40, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(95.75f, -8.25f, -8.25f).setRotationAngle(0, 0, 0).setName("FrontRearBulb01")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 970, 39, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(80.5f, -21.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 963, 39, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(-50.5f, -21.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 903, 43, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1.7f, 1.7f, 3, null)
			.setRotationPoint(-52.6f, -22, 0).setRotationAngle(0, 0, 0).setName("BackLampBulb")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 892, 28, textureX, textureY).addBox(0, 0, 0, 1, 15, 20)
			.setRotationPoint(78, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 974, 28, textureX, textureY).addBox(0, 0, 0, 1, 2, 18)
			.setRotationPoint(78, -18, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 983, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78, -18, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 915, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78, -18, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 849, 16, textureX, textureY).addBox(0, 0, 0, 1, 15, 20)
			.setRotationPoint(-48, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 843, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -18, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -18, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 935, 28, textureX, textureY).addBox(0, 0, 0, 1, 2, 18)
			.setRotationPoint(-48, -18, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 694, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-69.5f, 0, -9.5f).setRotationAngle(0, 0, 0).setName("Box 5cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 9, 1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(92, -10, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 9, 4, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(92, -10, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 34, textureX, textureY).addBox(0, 0, 0, 4, 9, 10)
			.setRotationPoint(92, -10, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 9, 4, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(92, -10, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 9, 1, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
			.setRotationPoint(92, -10, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 692, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 9, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -10, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 9, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-65, -10, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 34, textureX, textureY).addBox(0, 0, 0, 4, 9, 10)
			.setRotationPoint(-65, -10, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 9, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-65, -10, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 836, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
			.setRotationPoint(-63, -10, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 52, textureX, textureY).addBox(0, 0, 0, 6, 2, 0)
			.setRotationPoint(72, -3, 10.999f).setRotationAngle(0, 0, 0).setName("Nameplate1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 58, 34, textureX, textureY).addBox(0, 0, 0, 6, 2, 0)
			.setRotationPoint(-47, -3, 10.999f).setRotationAngle(0, 0, 0).setName("Nameplate2")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 612, 7, textureX, textureY).addBox(0, 0, 0, 6, 2, 0)
			.setRotationPoint(-47, -3, -11.001f).setRotationAngle(0, 0, 0).setName("Nameplate4")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 891, 0, textureX, textureY).addBox(0, 0, 0, 6, 2, 0)
			.setRotationPoint(72, -3, -11.001f).setRotationAngle(0, 0, 0).setName("Nameplate3")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 4, textureX, textureY).addBox(0, 0, 0, 7, 1, 2)
			.setRotationPoint(44, -21.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY).addBox(0, 0, 0, 7, 1, 2)
			.setRotationPoint(44, -21.25f, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 671, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 97, 2, 1, 0, 0, 0, -2, 0, 0, -2, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -18, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -18, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 2, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, -18, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -18, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 97, 2, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -18, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 885, 0, textureX, textureY).addBox(0, 0, 0, 45, 7, 20)
			.setRotationPoint(-7, 0, -10).setRotationAngle(0, 0, 0).setName("Nameplate3cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 683, 36, textureX, textureY).addBox(0, 0, 0, 3, 2, 2)
			.setRotationPoint(-67.5f, 0.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -1, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -1, 0, 0, 0)
			.setRotationPoint(-63.5f, 0.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 1005, 40, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-68.5f, 1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 1000, 40, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(98.5f, 1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 672, 36, textureX, textureY).addBox(0, 0, 0, 3, 2, 2)
			.setRotationPoint(95.5f, 0.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 35, textureX, textureY).addBox(0, 0, 0, 3, 2, 2)
			.setRotationPoint(95.5f, 0.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -1.5f, 0, -1, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, -1, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(92.5f, 0.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 524, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-69.5f, 0, 5.5f).setRotationAngle(0, 0, 0).setName("Box 13cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 513, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(99, 0, 5.5f).setRotationAngle(0, 0, 0).setName("Box 13cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 942, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(99, 0, -9.5f).setRotationAngle(0, 0, 0).setName("Box 13cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 995, 40, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(98.5f, 1, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, -1, 0, 0)
			.setRotationPoint(95.5f, 1, -0.5f).setRotationAngle(0, 0, 0).setName("Box 395cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 983, 28, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(63.5f, 0, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 895, 3, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-34.5f, 0, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 615, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -10, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 35, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
			.setRotationPoint(-57, -6, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 903, 36, textureX, textureY).addBox(0, 0, 0, 2, 4, 2)
			.setRotationPoint(-55.5f, -5, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 661, 36, textureX, textureY).addBox(0, 0, 0, 4, 14, 1)
			.setRotationPoint(80, -16, -10.9f).setRotationAngle(0, 0, 0).setName("FrontRightDoor")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 650, 36, textureX, textureY).addBox(0, 0, -1, 4, 14, 1)
			.setRotationPoint(80, -16, 10.9f).setRotationAngle(0, 0, 0).setName("FrontLeftDoor")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 639, 36, textureX, textureY).addBox(-4, 0, -1, 4, 14, 1)
			.setRotationPoint(-49, -16, 10.9f).setRotationAngle(0, 0, 0).setName("BackLeftDoor")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 628, 36, textureX, textureY).addBox(-4, 0, 0, 4, 14, 1)
			.setRotationPoint(-49, -16, -10.9f).setRotationAngle(0, 0, 0).setName("BackRightDoor")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0)
			.setRotationPoint(87.5f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0)
			.setRotationPoint(87.5f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 508, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f)
			.setRotationPoint(-57.5f, -19.75f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0.25f)
			.setRotationPoint(-57.5f, -19.75f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 4, 0, 0, -1, 0, 0, -1, 0, -11, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0)
			.setRotationPoint(73, -21, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 956, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 4, 0, -11, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0)
			.setRotationPoint(-53, -21, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 915, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 6, 4, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, -11, 0, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0, 0, -5, 0)
			.setRotationPoint(-53, -21, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 996, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 7, 2, 0, -11, 0, 0, 0, 0, 0, 0, 0, 0, -11, 0, 0, 0, -6, 0, 0, -6, 0, 0, -6, 0, 0, -6, 0)
			.setRotationPoint(-53, -21, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 872, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 10, 0, -7, -3, 0, 6, -5, 0, 6, -5, 0, -7, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -23, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 956, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.5f, 0.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 35, textureX, textureY).addBox(0, 0, 0, 3, 2, 2)
			.setRotationPoint(-67.5f, 0.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64.5f, 0.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 768, 36, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-68.5f, 1, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 804, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 3, 0, 0, -3, 0, 0, -3.5f, 0, 0, 3.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(95.5f, -16, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 717, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 3.5f, 0, 0, -3.5f, 0, 0, -4, 0, 0, 4, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(96.5f, -16, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 710, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 4, 0, 0, -4, 0, 0, -3.5f, 0, 0, 3.5f, 0, 0, 1.5f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(96.5f, -16, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 703, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, 3.5f, 0, 0, -3.5f, 0, 0, -3, 0, 0, 3, 0, 0, 1.5f, 0, 0, -1.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(95.5f, -16, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, -3.5f, 0, 0, 3.5f, 0, 0, 3, 0, 0, -3, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-65.5f, -16, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, -4, 0, 0, 4, 0, 0, 3.5f, 0, 0, -3.5f, 0, 0, -1.5f, 0, 0, 1.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-66.5f, -16, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, -3.5f, 0, 0, 3.5f, 0, 0, 4, 0, 0, -4, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-66.5f, -16, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 2, 0, -3, 0, 0, 3, 0, 0, 3.5f, 0, 0, -3.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 1.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-65.5f, -16, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 757, 36, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(93, -11, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 995, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(93, -12, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 745, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(93, -12.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 623, 36, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(93, -11, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 898, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(93, -12, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 602, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(93, -12.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 38, textureX, textureY).addBox(0, 1, 0, 1, 4, 1)
			.setRotationPoint(90.5f, -9, 4).setRotationAngle(0, 0, -20)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 38, textureX, textureY).addBox(0, 1, 0, 1, 4, 1)
			.setRotationPoint(-60.5f, -9, -5).setRotationAngle(0, 0, 20)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 35, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-63, -11, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -12, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -12.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 35, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-63, -11, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 995, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -12, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -12.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 985, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(94.5f, 0.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 1016, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(94.5f, 0.5f, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 987, 32, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1.75f, 1.75f, 3, null)
			.setRotationPoint(-52.5f, -22, 0).setRotationAngle(0, 0, 0).setName("BackLampSocket")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 906, 28, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1.75f, 1.75f, 3, null)
			.setRotationPoint(81.5f, -22, 0).setRotationAngle(0, 0, 0).setName("FrontLampSocket")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 35, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
			.setRotationPoint(83, -6, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 602, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83, -10, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 1014, 26, textureX, textureY).addBox(0, 0, 0, 2, 4, 2)
			.setRotationPoint(84.5f, -5, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 890, 29, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
			.setRotationPoint(-57, -6, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -10, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 872, 18, textureX, textureY).addBox(0, 0, 0, 2, 4, 2)
			.setRotationPoint(-55.5f, -5, -7.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
		//
		TurboList SU46cb = new TurboList("SU46cb");
		SU46cb.add(new ModelRendererTurbo(SU46cb, 342, 22, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1.7f, 1.7f, 3, null)
			.setRotationPoint(81.6f, -22, 0).setRotationAngle(0, 0, 0).setName("FrontLampBulb")
		);
		SU46cb.add(new ModelRendererTurbo(SU46cb, 326, 24, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
			.setRotationPoint(83, -6, 3.5f).setRotationAngle(0, 0, 0)
		);
		SU46cb.add(new ModelRendererTurbo(SU46cb, 327, 0, textureX, textureY).addBox(0, 0, 0, 2, 4, 2)
			.setRotationPoint(84.5f, -5, 5).setRotationAngle(0, 0, 0)
		);
		SU46cb.add(new ModelRendererTurbo(SU46cb, 352, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(83, -10, 3.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(SU46cb);
		//
	}

}
