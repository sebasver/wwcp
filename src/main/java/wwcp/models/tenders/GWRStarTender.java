//FMT-Marker TiM-1.0
package wwcp.models.tenders;

import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.1 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class GWRStarTender extends RollingStockModel {

	public GWRStarTender(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("OfflineUser");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY).addBox(0, 0, 0, 22, 4, 18)
			.setRotationPoint(-12, 0, -9.5f).setRotationAngle(0, 0, 0).setName("Box 116")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0)
			.setRotationPoint(-13, 1, -1).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 1, textureX, textureY).addBox(0, 0, 0, 1, 7, 16)
			.setRotationPoint(9, -7, -8.5f).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 113, 1, textureX, textureY).addBox(0, 0, 0, 19, 7, 1)
			.setRotationPoint(-10, -7, -8.5f).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		group0.add(new ModelRendererTurbo(group0, 161, 1, textureX, textureY).addBox(0, 0, 0, 19, 7, 1)
			.setRotationPoint(-10, -7, 6.5f).setRotationAngle(0, 0, 0).setName("Box 120")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 1, textureX, textureY).addBox(0, 0, 0, 1, 7, 4)
			.setRotationPoint(-11, -7, -7.5f).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 1, textureX, textureY).addBox(0, 0, 0, 1, 7, 4)
			.setRotationPoint(-11, -7, 2.5f).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-11, -7, 6.5f).setRotationAngle(0, 0, 0).setName("Box 124")
		);
		group0.add(new ModelRendererTurbo(group0, 97, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, -7, -8.5f).setRotationAngle(0, 0, 0).setName("Box 125")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 3, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, -9, 9.5f).setRotationAngle(-45, 0, 0).setName("Box 127")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 1, textureX, textureY).addBox(0, 0, 0, 0, 3, 16)
			.setRotationPoint(12, -9, -8.5f).setRotationAngle(0, 0, 45).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, -2, -0.15f, 0, -2, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(10, -9, 9.5f).setRotationAngle(-45, 0, 0).setName("Box 129")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, -2, 0, -0.15f, -2, 0, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(12, -9, -10.5f).setRotationAngle(0, 0, 45).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, -2, -0.15f, 0, -2, -0.15f, 0, 0, -0.15f, 0)
			.setRotationPoint(10, -9, -10.5f).setRotationAngle(45, 0, 0).setName("Box 132")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 3, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, -9, -10.5f).setRotationAngle(45, 0, 0).setName("Box 133")
		);
		group0.add(new ModelRendererTurbo(group0, 297, 1, textureX, textureY).addBox(0, 0, 0, 19, 7, 14)
			.setRotationPoint(-10, -6, -7.5f).setRotationAngle(0, 0, 0).setName("Box 15")
		);
		group0.add(new ModelRendererTurbo(group0, 353, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.15f, -2, 0, -0.15f, -2)
			.setRotationPoint(12, -9, 7.5f).setRotationAngle(0, 0, 45).setName("Box 16")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 1, textureX, textureY).addBox(-3, -3, 0, 6, 6, 0)
			.setRotationPoint(-7, 7, 5.5f).setRotationAngle(0, 0, 0).setName("Box 13")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 1, textureX, textureY).addBox(-3, -3, 0, 6, 6, 0)
			.setRotationPoint(-7, 7, -6.5f).setRotationAngle(0, 0, 0).setName("Box 35")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 1, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 14)
			.setRotationPoint(-7, 7, -7.5f).setRotationAngle(0, 0, 0).setName("Box 46")
		);
		group0.add(new ModelRendererTurbo(group0, 401, 1, textureX, textureY).addBox(-3, -3, 0, 6, 6, 0)
			.setRotationPoint(5, 7, 5.5f).setRotationAngle(0, 0, 0).setName("Box 20")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 1, textureX, textureY).addBox(-3, -3, 0, 6, 6, 0)
			.setRotationPoint(5, 7, -6.5f).setRotationAngle(0, 0, 0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 1, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 14)
			.setRotationPoint(5, 7, -7.5f).setRotationAngle(0, 0, 0).setName("Box 22")
		);
		group0.add(new ModelRendererTurbo(group0, 441, 1, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 3, 4, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -3, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, -3, -0.5f, 0)
			.setRotationPoint(-10, 4.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		group0.add(new ModelRendererTurbo(group0, 457, 1, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 3, 4, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -1.5f, 0, -3, -0.5f, 0, -3, -0.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(-6, 4.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 24")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 1, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 3, 4, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -1.5f, 0, -3, -0.5f, 0, -3, -0.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(6, 4.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 25")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 1, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 3, 4, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -3, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, -3, -0.5f, 0)
			.setRotationPoint(2, 4.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 26")
		);
		group0.add(new ModelRendererTurbo(group0, 1, 9, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 3, 4, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -1.5f, 0, -3, -0.5f, 0, -3, -0.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(-6, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 27")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 9, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 3, 4, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -3, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, -3, -0.5f, 0)
			.setRotationPoint(-10, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 28")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 9, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 3, 4, 1, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, -3, -0.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, -3, -0.5f, 0)
			.setRotationPoint(2, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 29")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 9, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 3, 4, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, -1.5f, 0, -3, -0.5f, 0, -3, -0.5f, 0, 0, -1.5f, 0)
			.setRotationPoint(6, 4.5f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 30")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 1, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-7.5f, 4, -1).setRotationAngle(0, 0, 0).setName("Box 31")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4.5f, 4, -1).setRotationAngle(0, 0, 0).setName("Box 33")
		);
		group0.add(new ModelRendererTurbo(group0, 241, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(13.5f, 0, -9.5f).setRotationAngle(0, 0, 0).setName("Box 5")
		);
		group0.add(new ModelRendererTurbo(group0, 257, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(13.5f, 0, 5.5f).setRotationAngle(0, 0, 0).setName("Box 16")
		);
		group0.add(new ModelRendererTurbo(group0, 273, 9, textureX, textureY)
			.addShapeBox(0, -1, -1, 4, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(10, 1.5f, 7).setRotationAngle(45, 0, 0).setName("Box 17")
		);
		group0.add(new ModelRendererTurbo(group0, 289, 9, textureX, textureY)
			.addShapeBox(0, -1, -1, 4, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(10, 1.5f, -8).setRotationAngle(45, 0, 0).setName("Box 21")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, 1.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(10, 1, -1).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		group0.add(new ModelRendererTurbo(group0, 265, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 1.25f, 0, 0, 1, 0, 0, 1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 2, -1).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 305, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, 1, -1).setRotationAngle(0, 0, 0).setName("Box 42")
		);
		this.groups.add(group0);
		//
	}

}
