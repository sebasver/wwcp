//FMT-Marker TiM-1.0
package wwcp.models.locomotives.steamers;


import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;


/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.1 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class ChristmasSentinel extends RollingStockModel {

	public ChristmasSentinel(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("MadFrogs");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY).addBox(0, 0, 0, 37, 1, 18)
				.setRotationPoint(3, 1, -9).setRotationAngle(0, 0, 0).setName("Box 0")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 18, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(2, 0, -9).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 18, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(39.25f, 0, -9).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(3, 2, -9).setRotationAngle(0, 0, 0).setName("Box 3")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f)
				.setRotationPoint(39, 2, -9).setRotationAngle(0, 0, 0).setName("Box 4")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f)
				.setRotationPoint(39, 2, 8.5f).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(3, 2, 8.5f).setRotationAngle(0, 0, 0).setName("Box 6")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-1.25f, 0, -9).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 1, textureX, textureY)
				.addShapeBox(0, -1, -1, 3, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-0.25f, 1.5f, 7.5f).setRotationAngle(45, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 1, textureX, textureY)
				.addShapeBox(0, -1, -1, 3, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-0.25f, 1.5f, -7.5f).setRotationAngle(45, 0, 0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-0.25f, 2, -0.5f).setRotationAngle(0, 0, 0).setName("Box 393")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-1.25f, 1, -0.5f).setRotationAngle(0, 0, 0).setName("Box 394")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0)
				.setRotationPoint(1.75f, 1, -0.5f).setRotationAngle(0, 0, 0).setName("Box 395")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-1.25f, 0, 6).setRotationAngle(0, 0, 0).setName("Box 13")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 1, textureX, textureY)
				.addShapeBox(0, -1, -1, 3, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(40.25f, 1.5f, 7.5f).setRotationAngle(45, 0, 0).setName("Box 14")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 1, textureX, textureY)
				.addShapeBox(0, -1, -1, 3, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(40.25f, 1.5f, -7.5f).setRotationAngle(45, 0, 0).setName("Box 15")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(42.75f, 0, 6).setRotationAngle(0, 0, 0).setName("Box 16")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(42.75f, 0, -9).setRotationAngle(0, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0)
				.setRotationPoint(40.25f, 1, -0.5f).setRotationAngle(0, 0, 0).setName("Box 18")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(42.25f, 2, -0.5f).setRotationAngle(0, 0, 0).setName("Box 19")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(43.25f, 1, -0.5f).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 1, textureX, textureY).addBox(0, 0, 0, 22, 7, 10)
				.setRotationPoint(4, -6, -5).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 1, textureX, textureY).addBox(0, 0, 0, 20, 7, 2)
				.setRotationPoint(6, -6, -7).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 7, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(4, -6, -7).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 7, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2)
				.setRotationPoint(4, -6, 5).setRotationAngle(0, 0, 0).setName("Box 24")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 1, textureX, textureY).addBox(0, 0, 0, 20, 7, 2)
				.setRotationPoint(6, -6, 5).setRotationAngle(0, 0, 0).setName("Box 25")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 1, textureX, textureY).addBox(0, 0, 0, 6, 5, 2)
				.setRotationPoint(5, -11, -1).setRotationAngle(0, 0, 0).setName("Box 26")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 1, textureX, textureY).addBox(0, 0, 0, 2, 5, 2)
				.setRotationPoint(7, -11, -3).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 1, textureX, textureY).addBox(0, 0, 0, 2, 5, 2)
				.setRotationPoint(7, -11, 1).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0)
				.setRotationPoint(9, -11, 1).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(9, -11, -3).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(5, -11, -3).setRotationAngle(0, 0, 0).setName("Box 31")
		);
		group0.add(new ModelRendererTurbo(group0, 137, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0)
				.setRotationPoint(5, -11, 1).setRotationAngle(0, 0, 0).setName("Box 32")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 7, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -6, -9).setRotationAngle(0, 0, 0).setName("Box 33")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 9, textureX, textureY).addBox(0, 0, 0, 8, 7, 1)
				.setRotationPoint(27, -6, -9).setRotationAngle(0, 0, 0).setName("Box 34")
		);
		group0.add(new ModelRendererTurbo(group0, 185, 9, textureX, textureY).addBox(0, 0, 0, 1, 13, 16)
				.setRotationPoint(26, -12, -8).setRotationAngle(0, 0, 0).setName("Box 35")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 9, textureX, textureY).addBox(0, 0, 0, 8, 7, 1)
				.setRotationPoint(27, -6, 8).setRotationAngle(0, 0, 0).setName("Box 36")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 9, textureX, textureY).addBox(0, 0, 0, 4, 6, 1)
				.setRotationPoint(27, -12, -9).setRotationAngle(0, 0, 0).setName("Box 37")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -8, -9).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
				.setRotationPoint(31, -12, -9).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 9, textureX, textureY).addBox(0, 0, 0, 4, 6, 1)
				.setRotationPoint(27, -12, 8).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(31, -8, 8).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
				.setRotationPoint(31, -12, 8).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(38, -12, -9).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(38, -12, 8.5f).setRotationAngle(0, 0, 0).setName("Box 44")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 9, textureX, textureY).addBox(0, 0, 0, 2, 8, 13)
				.setRotationPoint(27, -7, -6.5f).setRotationAngle(0, 0, 0).setName("Box 45")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26, -13, -9).setRotationAngle(0, 0, 0).setName("Box 46")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(26, -12, 8).setRotationAngle(0, 0, 0).setName("Box 49")
		);
		group0.add(new ModelRendererTurbo(group0, 497, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 13, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26, -12, -9).setRotationAngle(0, 0, 0).setName("Box 50")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26, -13, 8).setRotationAngle(0, 0, 0).setName("Box 51")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 2, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(27, -14, -8).setRotationAngle(0, 0, 0).setName("Box 52")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(27, -14, 3).setRotationAngle(0, 0, 0).setName("Box 53")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 25, textureX, textureY).addBox(0, 0, 0, 14, 1, 6)
				.setRotationPoint(27, -14, -3).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26, -14, 3).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26, -14, -8).setRotationAngle(0, 0, 0).setName("Box 56")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 17, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
				.setRotationPoint(26, -14, -3).setRotationAngle(0, 0, 0).setName("Box 57")
		);
		group0.add(new ModelRendererTurbo(group0, 393, 9, textureX, textureY).addBox(0, 0, 0, 2, 7, 2)
				.setRotationPoint(27, -15, -1).setRotationAngle(0, 0, 0).setName("Box 58")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(27, -9, -2).setRotationAngle(0, 0, 0).setName("Box 59")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(27, -9, 1).setRotationAngle(0, 0, 0).setName("Box 60")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 25, textureX, textureY).addBox(0, 0, 0, 37, 3, 1)
				.setRotationPoint(3, 2, 7).setRotationAngle(0, 0, 0).setName("Box 61")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 33, textureX, textureY).addBox(0, 0, 0, 37, 3, 1)
				.setRotationPoint(3, 2, -8).setRotationAngle(0, 0, 0).setName("Box 62")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(35.5f, 2, 8).setRotationAngle(0, 0, 0).setName("Box 64")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(35.5f, 5, 8.5f).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(35.5f, 3, 8.5f).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(35.5f, 2, -8.5f).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(35.5f, 5, -9).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(35.5f, 3, -9).setRotationAngle(0, 0, 0).setName("Box 70")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 25, textureX, textureY).addBox(0, 0, 0, 2, 2, 14)
				.setRotationPoint(7, 5, -7).setRotationAngle(0, 0, 0).setName("Box 71")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(6, 5, -7).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(9, 5, -7).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		group0.add(new ModelRendererTurbo(group0, 337, 25, textureX, textureY).addBox(0, 0, 0, 4, 3, 14)
				.setRotationPoint(6, 2, -7).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 129, 25, textureX, textureY).addBox(-4, -4, 0, 8, 8, 0)
				.setRotationPoint(15, 6, 6).setRotationAngle(0, 0, 0).setName("Box 14")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 25, textureX, textureY).addBox(-4, -4, 0, 8, 8, 0)
				.setRotationPoint(15, 6, -6).setRotationAngle(0, 0, 0).setName("Box 34")
		);
		group0.add(new ModelRendererTurbo(group0, 385, 17, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 18)
				.setRotationPoint(15, 6, -9).setRotationAngle(0, 0, 0).setName("Box 47")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 17, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 18)
				.setRotationPoint(28, 6, -9).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 25, textureX, textureY).addBox(-4, -4, 0, 8, 8, 0)
				.setRotationPoint(28, 6, 6).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 33, textureX, textureY).addBox(-4, -4, 0, 8, 8, 0)
				.setRotationPoint(28, 6, -6).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 17, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(15, 5, 8).setRotationAngle(0, 0, 0).setName("Box 78")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 25, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(28, 5, 8).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 25, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(29, 5, 8).setRotationAngle(0, 0, 0).setName("Box 80")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 25, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(25, 5, 8).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 25, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(16, 5, 8).setRotationAngle(0, 0, 0).setName("Box 82")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 33, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(12, 5, 8).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 25, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(12, 4, 8).setRotationAngle(0, 0, 0).setName("Box 84")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 25, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(18, 4, 8).setRotationAngle(0, 0, 0).setName("Box 85")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 25, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(25, 4, 8).setRotationAngle(0, 0, 0).setName("Box 86")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 25, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(31, 4, 8).setRotationAngle(0, 0, 0).setName("Box 87")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 33, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(12, 5, -9).setRotationAngle(0, 0, 0).setName("Box 88")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 33, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(15, 5, -9).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 33, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(16, 5, -9).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 33, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(18, 4, -9).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 33, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(12, 4, -9).setRotationAngle(0, 0, 0).setName("Box 92")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 33, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(25, 5, -9).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 33, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(28, 5, -9).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 33, textureX, textureY)
				.addShapeBox(-0.5f, -0.5f, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(29, 5, -9).setRotationAngle(0, 0, 0).setName("Box 95")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 33, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(31, 4, -9).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 33, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 1)
				.setRotationPoint(25, 4, -9).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 33, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
				.setRotationPoint(7, -1, 7).setRotationAngle(0, 0, 0).setName("Box 98")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 33, textureX, textureY).addBox(0, 0, 0, 2, 2, 2)
				.setRotationPoint(7, -1, -9).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 33, textureX, textureY).addBox(0, 0, 0, 2, 1, 11)
				.setRotationPoint(27, -8, -5.5f).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(27, -8, -6.5f).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		group0.add(new ModelRendererTurbo(group0, 369, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(27, -8, 5.5f).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 33, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(28, -6, 3).setRotationAngle(0, 0, -32).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(27.5f, 2, -0.5f).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(14.5f, 2, -0.5f).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		group0.add(new ModelRendererTurbo(group0, 145, 1, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26, -14, -8).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
				.setRotationPoint(26, -13, -8).setRotationAngle(0, 0, 0).setName("Box 106")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 1, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
				.setRotationPoint(26, -13, 3).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		this.groups.add(group0);
		//
	}

}
