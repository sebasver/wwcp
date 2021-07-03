//FMT-Marker TiM-1.0
package wwcp.models.locomotives.diesels;

import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class M640 extends RollingStockModel {

	public M640(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		initGroup_group0();
		initGroup_clipboard();
		initGroup_M420cb();
		initGroup_M420bcb();
		initGroup_M636cb();
		initGroup_M630cb();
		initGroup_C630mcb();
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 131, 2, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-69.5f, -2.5f, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 86, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -21.5f, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 230, 96, textureX, textureY).addBox(0, 0, 0, 6, 4, 4)
				.setRotationPoint(32, -6.5f, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 290, 110, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(-50, 1.5f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 303, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-69, -22.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 92, textureX, textureY).addBox(0, 0, 0, 1, 2, 4)
				.setRotationPoint(-31, -23, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 86, 1, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -21.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 86, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -21.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 86, 1, 4, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -21.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 2, 11, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1.32f, -0.75f, -0.5f, -1.32f, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 1.25f, -0.75f, -0.5f, 1.25f, -0.75f)
				.setRotationPoint(-69, -21.4f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.62f, 0, 0, -0.62f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-71.5f, -21.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 89, textureX, textureY).addBox(0, 0, 0, 6, 4, 4)
				.setRotationPoint(32, -6.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 110, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(40, 1.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 25, textureX, textureY).addBox(0, 0, 0, 131, 3, 12)
				.setRotationPoint(-69.5f, -1.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 87, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-50, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 87, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
				.setRotationPoint(-52, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 84, textureX, textureY).addBox(0, 0, 21, 2, 1, 1)
				.setRotationPoint(-50, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 60, textureX, textureY).addBox(0, 0, 21, 4, 1, 1)
				.setRotationPoint(-51.5f, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 65, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(40, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 85, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
				.setRotationPoint(38, -1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 60, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(40, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 70, textureX, textureY).addBox(0, 0, 0, 5, 1, 1)
				.setRotationPoint(39, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 18, 3, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, -3, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-71.5f, -20.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 18, 3, 0, -1, 0, -1, 0, 0, -3, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, -3, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-71.5f, -20.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 45, textureX, textureY).addBox(0, 0, 0, 47, 8, 16)
				.setRotationPoint(-27, 1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 85, textureX, textureY).addBox(0, 0, 0, 20, 2, 1)
				.setRotationPoint(-27, 4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, 1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, 6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, 8, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 73, textureX, textureY).addBox(0, 0, 0, 23, 2, 1)
				.setRotationPoint(-3, 4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 58, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, 1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, 6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, 8, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, -1.15f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, -0.14999998f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, -1.15f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-27, -0.14999998f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, -1.15f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, -0.14999998f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, -1.15f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 79, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-3, -0.14999998f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 79, textureX, textureY).addBox(0, 0, 0, 20, 2, 1)
				.setRotationPoint(-27, 4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, 2, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-27, 1, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-27, 6, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-27, 8, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 70, textureX, textureY).addBox(0, 0, 0, 23, 2, 1)
				.setRotationPoint(-3, 4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, 2, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-3, 1, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-3, 6, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-3, 8, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(61.5f, -2.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.75f, -0.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.75f, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.75f, 4.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.75f, 7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(61.5f, 6.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(61.5f, 4.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(64.75f, 6.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, -1, -0.75f, -0.5f, -1, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(64.75f, 4.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 18, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0)
				.setRotationPoint(61.75f, -2.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
				.setRotationPoint(61.75f, -1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(61.5f, -2.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.75f, -0.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.75f, 2, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.75f, 4.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 59, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.75f, 7, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(61.5f, 6.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 355, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(61.5f, 4.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(64.75f, 6.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(64.75f, 4.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 9, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.75f, -1, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-70.5f, -2.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 20, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-73.75f, -2.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-72.75f, -0.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-72.75f, 2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-72.75f, 4.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-72.75f, 7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-70.5f, 6.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-70.5f, 4.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 198, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-73.75f, 6.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-73.75f, 4.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 18, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0.25f, -0.5f, 0, 0.25f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-72.75f, -2.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f)
				.setRotationPoint(-72.75f, -1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-70.5f, -2.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-72.75f, -0.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-72.75f, 2, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-72.75f, 4.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-72.75f, 7, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-70.5f, 6.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.75f, -0.5f, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-70.5f, 4.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 137, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-73.75f, 6.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.75f, -0.5f, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-73.75f, 4.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 9, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-72.75f, -1, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, -2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-74, -2.5f, 8).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, -2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 39, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 18, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, -3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1)
				.setRotationPoint(-71.5f, -20.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 18, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -3, -1, 0, -1)
				.setRotationPoint(-71.5f, -20.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 96, textureX, textureY).addBox(0, 0, 0, 3, 18, 8)
				.setRotationPoint(-71.5f, -20.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-75, -9.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-75, -10.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-75, -9.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-75, -9.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-74, 2.5f, 9).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-74, -3.5f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, -0.5f, 1.5f, -0.3f, -0.5f, 1.5f, -0.3f, -0.5f, -2, -0.2f, -0.5f, -2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-74, -9.5f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0.7f, 0, -0.2f, -1.2f, 0, -0.2f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0.7f, -0.5f, 0, -1.2f, -0.5f, 0)
				.setRotationPoint(-75, -9.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6f, -0.6f, -0.5f, -0.1f, -0.6f, -0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0, -0.6f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0)
				.setRotationPoint(-75, -9, -0.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-75, -10.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f)
				.setRotationPoint(-75, -9.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-74, 2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-74, -3.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 193, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.2f, -0.5f, -2, -0.3f, -0.5f, -2, -0.3f, -0.5f, 1.5f, -0.2f, -0.5f, 1.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-74, -9.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1.2f, 0, -0.2f, 0.7f, 0, -0.2f, 0, 0, 0, -0.5f, 0, 0, -1.2f, -0.5f, 0, 0.7f, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-75, -9.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.6f, -0.5f, -0.6f, -0.6f, -0.5f, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, -0.1f, -0.5f, -0.6f, -0.1f, -0.5f)
				.setRotationPoint(-75, -9, -1.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 41, textureX, textureY).addBox(0, 0, 0, 38, 1, 2)
				.setRotationPoint(-25, -21.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 158, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(65, -2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(65, -2.5f, 8).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 19, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(65, -2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(66, -9.5f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(66, -10.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(66, -9.5f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(66, -9.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(65, 2.5f, 9).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(65, -3.5f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.3f, -0.5f, 1.5f, -0.2f, -0.5f, 1.5f, -0.2f, -0.5f, -2, -0.3f, -0.5f, -2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(65, -9.5f, 10.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -1.2f, 0, -0.2f, 0.7f, 0, -0.2f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -1.2f, -0.5f, 0, 0.7f, -0.5f, 0)
				.setRotationPoint(66, -9.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1f, -0.6f, -0.5f, -0.6f, -0.6f, -0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.5f, -0.6f, -0.1f, -0.5f, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0)
				.setRotationPoint(66, -9, -0.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(66, -10.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(66, -9.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(65, 2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(65, -3.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.3f, -0.5f, -2, -0.2f, -0.5f, -2, -0.2f, -0.5f, 1.5f, -0.3f, -0.5f, 1.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(65, -9.5f, -11.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.7f, 0, -0.2f, -1.2f, 0, -0.2f, -0.5f, 0, 0, 0, 0, 0, 0.7f, -0.5f, 0, -1.2f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(66, -9.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0, -0.6f, -0.6f, -0.5f, -0.1f, -0.6f, -0.5f, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f)
				.setRotationPoint(66, -9, -1.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 83, textureX, textureY).addBox(0, 0, 0, 6, 4, 4)
				.setRotationPoint(54, -6.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 74, textureX, textureY).addBox(0, 0, 0, 6, 4, 4)
				.setRotationPoint(54, -6.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(60, -4.625f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(60, -4.625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-73.75f, 4.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-73.75f, 4.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 20, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(64, -2.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-73.25f, 2, -8).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-73.5f, 2.5f, -8).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-73.25f, 2, 5).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-73.5f, 2.5f, 5).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-70.5f, 2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 13, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-70.5f, -10, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-60.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-52.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-44.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-36.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-28.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-20.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-12.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-4.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(3.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(11.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(19.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(33.5f, -13.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 58, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(31.5f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(31, -4.625f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(25, -4.625f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -4.5f, 0, -2, -0.5f, 0, -2, -0.5f, -0.5f, 0, -4.5f, -0.5f, 0, 4, 0, -2, 0, 0, -2, 0, -0.5f, 0, 4, -0.5f)
				.setRotationPoint(27.5f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-70.5f, 2.5f, 10).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 13, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-70.5f, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-60.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 245, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-52.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-44.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 117, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-36.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-28.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-20.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-12.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-4.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(3.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(11.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(19.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(32, -13.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 84, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -4.5f, -0.5f, -2, -0.5f, -0.5f, -2, -0.5f, 0, 0, -4.5f, 0, 0, 4, -0.5f, -2, 0, -0.5f, -2, 0, 0, 0, 4, 0)
				.setRotationPoint(24.5f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 36, textureX, textureY)
				.addShapeBox(0, 0, 0, 97, 1, 1, 0, 0, -0.5f, -0.5f, -3, -0.5f, -0.5f, -3, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -3, 0, -0.5f, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-69.5f, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-68.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 3, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 3, -0.5f, 0, 3, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 3, 0, 0)
				.setRotationPoint(31.5f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(57.5f, -13.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 315, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(52.5f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.5f, 0, -2, -4.5f, 0, -2, -4.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -2, 4, 0, -2, 4, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(58.5f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(61.5f, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -0.7f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(61.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.5f, 2.5f, -11).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(57.5f, -13.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(52.5f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, -0.5f, -0.5f, -2, -4.5f, -0.5f, -2, -4.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -2, 4, -0.5f, -2, 4, 0, 0, 0, 0)
				.setRotationPoint(58.5f, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.5f, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, -0.5f, -0.7f, -0.5f, -0.5f, -0.7f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(61.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(61.5f, 2.5f, 10).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(65.25f, -3.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f)
				.setRotationPoint(66.5f, -4.25f, 2.25f).setRotationAngle(0, 0, 0).setName("Box 243cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, -3.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.62f, 0, -0.5f, -0.62f, 0, -0.5f, -0.88f, 0, 0, -0.88f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-70, -21.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 361, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.62f, 0, -0.5f, -0.62f, 0, -0.5f, -0.88f, 0, -1, -0.88f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0)
				.setRotationPoint(-71.5f, -21.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.88f, 0, 0, -0.88f, 0, 0, -1, 0, 0, -0.88f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
				.setRotationPoint(-70.5f, -21.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 115, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-70.5f, -22, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
				.setRotationPoint(65, -0.05f, 6).setRotationAngle(0, 0, 0).setName("Ditchlight-Left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, 0, -0.3f, -0.3f)
				.setRotationPoint(65, -0.55f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
				.setRotationPoint(65, -0.05f, -7).setRotationAngle(0, 0, 0).setName("Ditchlight-Right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, 0, -0.3f, -0.3f)
				.setRotationPoint(65, -0.55f, -7.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 89, textureX, textureY).addBox(0, 0, 0, 16, 14, 1)
				.setRotationPoint(38, -16.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 88, textureX, textureY).addBox(0, 0, 0, 16, 14, 1)
				.setRotationPoint(38, -16.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 50, textureX, textureY).addBox(0, 0, 0, 16, 4, 20)
				.setRotationPoint(38, -6.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -18.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 434, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, 0, -1, 0, 0, -1, 0, -1.5f, 0, 0, -1.5f, 0)
				.setRotationPoint(38, -19.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(38, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0)
				.setRotationPoint(38, -22, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 2, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -18.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, 1.5f, 0, 0, 1.5f, 0, 0, -1, 0, 0, -1, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(38, -19.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 59, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 5, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -21, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 18, 1, 2, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -22, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -21, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
						new boolean[]{ true, true, true, true, true, true })
				.setRotationPoint(38, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -21, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 90, textureX, textureY).addBox(0, 0, 0, 1, 11, 12)
				.setRotationPoint(62, -13.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 85, textureX, textureY).addBox(0, 0, 0, 6, 11, 14)
				.setRotationPoint(56, -13.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(62, -13.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
				.setRotationPoint(62, -13.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, -14.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -14.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 14, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -14.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -14.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 19, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(54, -14.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, -1, -1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(62, -14.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -14.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(62, -14.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 14, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, -14.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 107, textureX, textureY).addBox(0, 0, 0, 1, 10, 3)
				.setRotationPoint(53, -16.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 111, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
				.setRotationPoint(53, -18.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, -20.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, -18.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 141, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 15, 9, 0, 0, 0, 0, 0, 0, 0, 3, 0, -2, -3, 0, -2, 0, -1, 0, 0, -1, 0, 3, -1, -2, -3, -1, -2,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(53, -20, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 107, textureX, textureY).addBox(-1, 0, -3, 1, 10, 3)
				.setRotationPoint(54, -16.5f, 10).setRotationAngle(0, 0, 0).setName("Door-Front-0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 110, textureX, textureY).addBox(-1, 0, -3, 1, 2, 2)
				.setRotationPoint(54, -18.5f, 10).setRotationAngle(0, 0, 0).setName("Door-Front-1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, -20.5f, 7).setRotationAngle(0, 0, 0).setName("Door-Front-2")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 114, textureX, textureY)
				.addShapeBox(-1, 0, -1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(54, -18.5f, 10).setRotationAngle(0, 0, 0).setName("Door-Front-3")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 141, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 15, 9, 0, -3, 0, 0, 3, 0, 0, 0, 0, -2, 0, 0, -2, -3, -1, 0, 3, -1, 0, 0, -1, -2, 0, -1, -2,
						new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(53, -20, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, 0, 0, -1, 0, 2.15f, 0, 0, -2.15f, 0, 0, 0, 0, 0, 0, 0, 0, 2.15f, 0, 0, -2.15f, 0, 0)
				.setRotationPoint(53, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 5, 0, -2.15f, 0, 0, 2.15f, 0, 0, 0, -1, 0, 0, -1, 0, -2.15f, 0, 0, 2.15f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, -21, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.15f, 0, 0, 0.15f, 0, 0, 1, 0, 0, -1, 0, 0, -0.15f, 0, 0, 0.15f, 0, 0, 1, 0, 0, -1, 0, 0,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(55, -21, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, 0, 0, 1, 0, 0, 0.15f, 0, 0, -0.15f, 0, 0, -1, 0, 0, 1, 0, 0, 0.15f, 0, 0, -0.15f, 0, 0,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(55, -21, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, 0, -2, 0, 0, 0.15f, 1, 0, 0, 1, 0, 0, 0, 0, -2, 0, 0, 0.15f, -1, 0, 0, -1, 0)
				.setRotationPoint(54, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 1, 0, 0.15f, 1, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0.15f, -1, 0, -2, 0, 0, 0, 0, 0)
				.setRotationPoint(54, -21, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.85f, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0, 0, -0.85f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -22, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0.1f, 0, 0, 0.1f, 0, -0.85f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.85f, 0, 0, 0, 0, 0)
				.setRotationPoint(56, -22, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 107, textureX, textureY).addBox(0, 0, 0, 1, 10, 3)
				.setRotationPoint(38, -16.5f, -10).setRotationAngle(0, 0, 0).setName("Door-Back-0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 92, textureX, textureY).addBox(0, 0, 1, 1, 2, 2)
				.setRotationPoint(38, -18.5f, -10).setRotationAngle(0, 0, 0).setName("Door-Back-1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -20.5f, -9).setRotationAngle(0, 0, 0).setName("Door-Back-2")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 284, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -18.5f, -10).setRotationAngle(0, 0, 0).setName("Door-Back-3")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 107, textureX, textureY).addBox(0, 0, 0, 1, 10, 3)
				.setRotationPoint(38, -16.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 92, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
				.setRotationPoint(38, -18.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -20.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 279, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -18.5f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(62.5f, -14.25f, -1).setRotationAngle(0, 0, 0).setName("socketcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 114, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(62.6f, -13.75f, -0.5f).setRotationAngle(0, 0, 0).setName("light-front-top")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(62.5f, -14, -1).setRotationAngle(0, 0, 0).setName("Box 28cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(62.5f, -12.75f, -1).setRotationAngle(0, 0, 0).setName("socket-bottomcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 114, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(62.6f, -12.25f, -0.5f).setRotationAngle(0, 0, 0).setName("light-front-bottom")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, -1, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(55, -14.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(55, -14.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(54, -14.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.8f, 0, 0, -0.8f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(54, -14.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0)
				.setRotationPoint(52, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 7, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(52, -21, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -22, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 359, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 2, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(38, -22, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 113, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(43, -9.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 7, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(41, -10.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 99, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
				.setRotationPoint(41, -15.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 105, textureX, textureY).addBox(0, 0, 0, 2, 4, 2)
				.setRotationPoint(51, -10.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 344, 110, textureX, textureY).addBox(0, 0, 0, 2, 10, 1)
				.setRotationPoint(54, -12.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 141, 95, textureX, textureY).addBox(0, 0, 0, 2, 4, 10)
				.setRotationPoint(54, -6.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(51, -11.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 7, 2, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1)
				.setRotationPoint(47, -13.5f, -3.66f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 1, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 1)
				.setRotationPoint(47, -12.5f, -3.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 113, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
				.setRotationPoint(43, -9.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(41, -10.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 93, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
				.setRotationPoint(41, -15.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f)
				.setRotationPoint(53.5f, -20, -6).setRotationAngle(0, 23, 0).setName("markerlight-1white")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f)
				.setRotationPoint(54, -20, -5).setRotationAngle(0, 23, 0).setName("markerlight-2green")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f)
				.setRotationPoint(54.5f, -20, -4).setRotationAngle(0, 23, 0).setName("markerlight-3red")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f)
				.setRotationPoint(54, -20, 5).setRotationAngle(0, -23, 0).setName("markerlight-6white")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f)
				.setRotationPoint(54.5f, -20, 4).setRotationAngle(0, -23, 0).setName("markerlight-5green")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f)
				.setRotationPoint(55, -20, 3).setRotationAngle(0, -23, 0).setName("Markerlight-4red")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 6, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(58, -21.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 212, 61, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
				.setRotationPoint(54, -8.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 45, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(54, -9.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, -0.9f, -0.5f, 0, -0.9f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(54, -14.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 5, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f)
				.setRotationPoint(65.5f, -4.5f, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f)
				.setRotationPoint(-75.5f, -4.25f, -3.25f).setRotationAngle(0, 0, 0).setName("Box 243cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(-74.5f, -4.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.25f, 0, 0, -1, 0, 0, -0.73f, 0, 0, -0.02f, 0, 0, 0.25f, -2, 0, -1, -2, 0, 0.27f, 0, 0, -1.02f, 0, 0)
				.setRotationPoint(65, 3.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -1, -0.75f, 0, -1)
				.setRotationPoint(65, 5.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(65, 5.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0.37f, 0, 0, -1.12f, 0, 0)
				.setRotationPoint(65.27f, 3.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, -3, 0.25f, 0, -3, -0.75f, 0, 0, 0, 0, 0, 0.27f, 0, 0, -1.02f, 0, 0)
				.setRotationPoint(65, 3.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, -1.25f, -0.5f, -0.25f, -1.5f, 0, -0.25f, 0.75f, 0, -0.25f, 1, 0, -0.25f, -1.75f, 0, -0.25f)
				.setRotationPoint(63.75f, 2, -8).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 239, 105, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 2, 3)
				.setCorners(-0.02f, 0, 0, -0.73f, 0, 0, -1, 0, 0, 0.25f, 0, 0, -1.02f, 0, 0, 0.27f, 0, 0, -1, -2, 0, 0.25f, -2, 0)
				.setPolygonUV(0, new float[]{ 7.0f, 3.0f, 4.0f, 3.0f, 4.0f, 5.0f, 7.0f, 3.0f }).build()
				.setRotationPoint(65, 3.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.75f, 0, -1, 0, 0, -1, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(65, 5.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -1, -0.75f, 0, -1, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(65, 5.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0, -1.12f, 0, 0, 0.37f, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(65.27f, 3.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 105, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 2, 3)
				.setCorners(0.25f, 0, -3, -1, 0, -3, -1, 0, 0, 0.25f, 0, 0, -1.02f, 0, 0, 0.27f, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setPolygonUV(0, new float[]{ 7.0f, 3.0f, 7.0f, 3.0f, 4.0f, 5.0f, 7.0f, 5.0f }).build()
				.setRotationPoint(65, 3.5f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, -0.5f, -0.25f, 0.5f, -0.5f, -0.25f, 0.25f, -0.5f, -0.25f, -1, -0.5f, -0.25f, -1.75f, 0, -0.25f, 1, 0, -0.25f, 0.75f, 0, -0.25f, -1.5f, 0, -0.25f)
				.setRotationPoint(63.75f, 2, 5).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, -0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -0.75f, 0, -0.25f, 0, 0, -0.25f, -1.75f, 0, -0.25f, 1, 0, -0.25f, 0.75f, 0, -0.25f, -1.5f, 0, -0.25f)
				.setRotationPoint(65.25f, 3, 5).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-69.5f, -21.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -0.62f, 0, 0, -0.62f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-71.5f, -21.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.88f, 0, -0.5f, -0.88f, 0, -0.5f, -0.62f, 0, 0, -0.62f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-70, -21.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1, -0.88f, 0, -0.5f, -0.88f, 0, -0.5f, -0.62f, 0, 0, -0.62f, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-71.5f, -21.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 4, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.88f, -1, 0, -1, 0, 0, -0.88f, 0, 0, -0.88f, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-70.5f, -21.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 452, 48, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 2, 4, 0, -0.5f, 0.05f, 0, 0, 0.05f, 0, 0, -0.31f, -1.1f, -0.5f, -0.31f, -1.1f, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, -1.69f, -1.1f, -0.5f, -1.69f, -1.1f)
				.setRotationPoint(-69, -18.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 232, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 17, 14, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-68.5f, -19.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 86, 18, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -20.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(29, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(20, -22, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 0, textureX, textureY)
				.addShapeBox(0, 0, -0.5f, 15, 4, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(20, -22, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 2, 11, 0, -0.5f, -1.32f, -0.75f, 0, -1.32f, -0.75f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 1.25f, -0.75f, 0, 1.25f, -0.75f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-69, -21.4f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 21, 2, 4, 0, -0.5f, -0.31f, -1.1f, 0, -0.31f, -1.1f, 0, 0.05f, 0, -0.5f, 0.05f, 0, -0.5f, -1.69f, -1.1f, 0, -1.69f, -1.1f, 0, 0.5f, 0, -0.5f, 0.5f, 0)
				.setRotationPoint(-69, -18.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 75, textureX, textureY).addBox(0, 0, 0, 6, 5, 1)
				.setRotationPoint(-61.25f, -17.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 58, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-61.25f, -12.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-62.25f, -17.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-61.75f, -12.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, -1, -1, -0.5f, -1, -1, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-61.75f, -12.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-55.25f, -17.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-55.75f, -12.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 127, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -1, -0.5f, 0)
				.setRotationPoint(-55.75f, -12.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 58, textureX, textureY).addBox(0, 0, 0, 6, 5, 1)
				.setRotationPoint(-61.25f, -17.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 55, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, -1)
				.setRotationPoint(-61.25f, -12.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1)
				.setRotationPoint(-62.25f, -17.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1)
				.setRotationPoint(-61.75f, -12.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -1, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, -1, 0, -0.5f, -1)
				.setRotationPoint(-61.75f, -12.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0)
				.setRotationPoint(-55.25f, -17.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, -0.5f, -1)
				.setRotationPoint(-55.75f, -12.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -1, -0.5f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -1, -0.5f, -1)
				.setRotationPoint(-55.75f, -12.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-49.01f, -21.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-69.5f, -21.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-49.01f, -21.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 4, 2, 0, 0, 0, -3.34f, 0, 0, 0, 0, 0, 0, 0, 0, 3.33f, 0, 0, -3.34f, 0, 0, 0, 0, 0, 0, 0, 0, 3.33f)
				.setRotationPoint(49, -10.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
				.setRotationPoint(47.5f, -12, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, -3.34f, 0, 0, 0, 0, 0, 0, 0, 0, 3.33f, 0, 0, -3.34f, 0, 0, 0, 0, 0, 0, 0, 0, 3.33f)
				.setRotationPoint(49, -13.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -1.67f, 0, 0, 0, 0, 0, 0, 0, 0, 1.67f, 0, 0, -1.67f, 0, 0, 0, 0, 0, 0, 0, 0, 1.67f)
				.setRotationPoint(51, -11.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
				.setRotationPoint(47.75f, -10.5f, -4.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
				.setRotationPoint(51.75f, -11.5f, -7.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(50, -11.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(53.3f, -19, -6.5f).setRotationAngle(0, 23, 0).setName("numberboard-front-rightcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0)
				.setRotationPoint(55.6f, -19, 1).setRotationAngle(0, -23, 0).setName("numberboard-front-leftcp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0)
				.setRotationPoint(38, -20, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 96, textureX, textureY).addBox(0, 0, 0, 6, 4, 4)
				.setRotationPoint(26, -6.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 110, textureX, textureY).addBox(0, 0, 0, 2, 11, 1)
				.setRotationPoint(54, -13.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_M420cb(){
		TurboList M420cb = new TurboList("M420cb");
		M420cb.add(new ModelRendererTurbo(M420cb, 182, 95, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 3, 11)
				.setCorners(-0.75f, 0, 0, 0, 0, 0, 2, -3, 0, -2.75f, -3, 0, -0.75f, 0, 0, 0, 0, 0, 2, 0, 0, -2.75f, 0, 0)
				.setPolygonUV(1, new float[]{ 8.0f, 8.0f, 0.0f, 11.0f, 0.0f, 11.0f, 8.0f, 11.0f }).build()
				.setRotationPoint(65, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 435, 92, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 3, 11)
				.setCorners(-0.75f, 0, 0, 0, 0, 0, 1, 0, 0, -1.75f, 0, 0, -0.75f, -3, 0, 0, -3, 0, 2, 0, 0, -2.75f, 0, 0)
				.setPolygonUV(1, new float[]{ 8.0f, 8.0f, 0.0f, 8.0f, 0.0f, 11.0f, 8.0f, 8.0f }).build()
				.setRotationPoint(65, 5.5f, -11).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 0, 92, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 3, 11)
				.setCorners(-2.75f, -3, 0, 2, -3, 0, 0, 0, 0, -0.75f, 0, 0, -2.75f, 0, 0, 2, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setPolygonUV(1, new float[]{ 8.0f, 8.0f, 0.0f, 14.0f, 0.0f, 11.0f, 8.0f, 11.0f })
				.setPolygonUV(0, new float[]{ 17.0f, 8.0f, 9.0f, 11.0f, 9.0f, 11.0f, 17.0f, 11.0f }).build()
				.setRotationPoint(65, 5.5f, 0).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 410, 90, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 3, 11)
				.setCorners(-1.75f, 0, 0, 1, 0, 0, 0, 0, 0, -0.75f, 0, 0, -2.75f, 0, 0, 2, 0, 0, 0, -3, 0, -0.75f, -3, 0)
				.setPolygonUV(1, new float[]{ 8.0f, 8.0f, 0.0f, 8.0f, 0.0f, 11.0f, 8.0f, 5.0f })
				.setPolygonUV(0, new float[]{ 17.0f, 8.0f, 9.0f, 8.0f, 9.0f, 11.0f, 17.0f, 8.0f }).build()
				.setRotationPoint(65, 5.5f, 0).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 83, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(65, 2, -8).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 438, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -1.5f, 0, -0.25f, 0.75f, 0, -0.25f, 1, 0, -0.25f, -1.75f, 0, -0.25f)
				.setRotationPoint(65.25f, 3, -8).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 352, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(65, 2, 5).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 74, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, 1, -1.5f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 343, 99, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-75, 3.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 259, 113, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-76, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 254, 113, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-77, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 249, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(-76, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 244, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-76, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 188, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-78, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 234")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 209, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-78, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 234")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 65, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-74, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 228cp")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 275, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 97, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-69.5f, -10, -11.5f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 157, 113, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-68.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 504, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f, 0, -0.375f, -0.375f)
				.setRotationPoint(-72, -20.1f, -1).setRotationAngle(0, 0, 0).setName("socket")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 294, 96, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-72.1f, -19.6f, -0.5f).setRotationAngle(0, 0, 0).setName("light-back-top")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 265, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, -0.5f, -0.75f, -0.25f)
				.setRotationPoint(58.25f, -21, -0.5f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 0, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f)
				.setRotationPoint(56.5f, -21.25f, -1).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 229, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.25f, 0.25f, 0, -0.25f, 0.25f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.25f, 0.25f, -0.75f, -0.25f, 0.25f, -0.75f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(56.25f, -21, -1).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 222, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0.25f, 0, -0.5f, 0.25f, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.5f, 0.25f, -0.75f, -0.5f, 0.25f, -0.75f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(56.25f, -21, 0).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 209, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(58.25f, -20.75f, -0.5f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 337, 99, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(58, -22.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 401, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0.2f, 0, 0.2f, 0.2f, 0, 0, 0)
				.setRotationPoint(60, -22.75f, 0.25f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 196, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0.1f)
				.setRotationPoint(57, -22.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 432, 92, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(59, -22.75f, 0.25f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 415, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0, 0)
				.setRotationPoint(59, -22.75f, -1).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 237, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, -0.1f, 0, 0, -0.1f)
				.setRotationPoint(44.5f, -22.75f, -0.75f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 216, 85, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(54.6f, -12, 6.5f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 494, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f)
				.setRotationPoint(54.1f, -12.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(M420cb);
	}

	private final void initGroup_M420bcb(){
		TurboList M420bcb = new TurboList("M420bcb");
		M420bcb.add(new ModelRendererTurbo(M420bcb, 177, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(69, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 237")
		);
		M420bcb.add(new ModelRendererTurbo(M420bcb, 65, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(69, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 238")
		);
		M420bcb.add(new ModelRendererTurbo(M420bcb, 440, 92, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(68, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 239")
		);
		M420bcb.add(new ModelRendererTurbo(M420bcb, 14, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(67, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 240")
		);
		M420bcb.add(new ModelRendererTurbo(M420bcb, 424, 90, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(67, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 241")
		);
		M420bcb.add(new ModelRendererTurbo(M420bcb, 334, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
				.setRotationPoint(67, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 242")
		);
		M420bcb.add(new ModelRendererTurbo(M420bcb, 207, 85, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(66, 3.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 243")
		);
		M420bcb.add(new ModelRendererTurbo(M420bcb, 460, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(65, 1, -1.5f).setRotationAngle(0, 0, 0).setName("Box 244")
		);
		M420bcb.add(new ModelRendererTurbo(M420bcb, 248, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(65, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 245cp")
		);
		this.groups.add(M420bcb);
	}

	private final void initGroup_M636cb(){
		TurboList M636cb = new TurboList("M636cb");
		M636cb.add(new ModelRendererTurbo(M636cb, 179, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 2, 15, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-47, -22.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 247, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-47, -23, -7.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 131, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-47, -23, 2.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 326, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-47, -23, -2.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 163, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-47, -20.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 494, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-47, -20.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 116, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(13, -22, -7).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 484, 36, textureX, textureY).addBox(0, 0, 0, 10, 3, 1)
				.setRotationPoint(13.5f, -21.5f, 7).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 275, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, -1)
				.setRotationPoint(13.5f, -18.5f, 7).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 247, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0)
				.setRotationPoint(23.5f, -21.5f, 7).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 131, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1)
				.setRotationPoint(12.5f, -21.5f, 7).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 275, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13.5f, -22.5f, 7).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 507, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -1, 0, 0, -0.5f, 0, 0, 0, -0.5f, -1)
				.setRotationPoint(13, -22.5f, 7).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 216, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, 0, 0, -0.5f, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1)
				.setRotationPoint(13, -18.5f, 7).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 207, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, -0.5f, -1, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, 0, 0)
				.setRotationPoint(23, -22.5f, 7).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 123, 77, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, -0.5f, -1)
				.setRotationPoint(23, -18.5f, 7).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 402, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 16, 1, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13, -23.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 507, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(13, -22.5f, 1).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 506, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(18, -22.5f, 1).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 468, 59, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(28.5f, -22.5f, 1).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 506, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(23.5f, -22.5f, 1).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 507, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(13, -22.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 277, 41, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(18, -22.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 7, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(28.5f, -22.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 301, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(23.5f, -22.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 507, 36, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(12.5f, -21.5f, -8).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 301, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, 0, 0, -1, 0, 0, 0, -0.5f, 0)
				.setRotationPoint(13, -22.5f, -8).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 16, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -1, -0.5f, 0, 0, -1, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, -0.5f, -1, -0.5f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(13, -18.5f, -8).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 212, 53, textureX, textureY).addBox(0, 0, 0, 15, 3, 1)
				.setRotationPoint(13.5f, -21.5f, -8).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 212, 50, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(13.5f, -18.5f, -8).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 0, 7, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(28.5f, -21.5f, -8).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 472, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13.5f, -22.5f, -8).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 16, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, -1, 0, 0)
				.setRotationPoint(28, -22.5f, -8).setRotationAngle(0, 0, 0)
		);
		M636cb.add(new ModelRendererTurbo(M636cb, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, -1, 0, 0, -0.5f, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(28, -18.5f, -8).setRotationAngle(0, 0, 0)
		);
		this.groups.add(M636cb);
	}

	private final void initGroup_M630cb(){
	}

	private final void initGroup_C630mcb(){
		TurboList C630mcb = new TurboList("C630mcb");
		C630mcb.add(new ModelRendererTurbo(C630mcb, 380, 98, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-72.5f, -6.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		C630mcb.add(new ModelRendererTurbo(C630mcb, 56, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-72.5f, -10, -1.5f).setRotationAngle(0, 0, 0)
		);
		C630mcb.add(new ModelRendererTurbo(C630mcb, 22, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-72.5f, -13.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		C630mcb.add(new ModelRendererTurbo(C630mcb, 409, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-72.5f, -17, -1.5f).setRotationAngle(0, 0, 0)
		);
		C630mcb.add(new ModelRendererTurbo(C630mcb, 118, 88, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-72.5f, -20.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		C630mcb.add(new ModelRendererTurbo(C630mcb, 478, 87, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-70.5f, -21.4f, 1).setRotationAngle(0, 0, 0)
		);
		C630mcb.add(new ModelRendererTurbo(C630mcb, 338, 51, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-70.5f, -21.4f, -4).setRotationAngle(0, 0, 0)
		);
		this.groups.add(C630mcb);
	}

}
