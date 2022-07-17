//FMT-Marker TiM-1.0
//Using PER-GROUP-INIT mode with limit '500'!
package wwcp.models.locomotives.diesels;

import ebf.tim.render.StaticModelAnimator;
import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class SD90MACH extends RollingStockModel {

	public SD90MACH(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		initGroup_group0();
		initGroup_clipboard();
		initGroup_M420cb();
		initGroup_RS18cb();
		initGroup_SD70MACcb();
		initGroup_F40phcb();
		initGroup_SD70Icb();
		initGroup_SD60MACcb();
		initGroup_SD90MACcb();
		initGroup_SD90MACHcb();
		initGroup_AC4400CWcb();
		initGroup_SD90MACH_Oldcb();
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 148, 1, 22)
				.setRotationPoint(-80, -2, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 339, 134, textureX, textureY).addBox(0, 0, 0, 13, 8, 1)
				.setRotationPoint(44, -21, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 1, 43, textureX, textureY)
				.addBox(0, 0, 0, 110, 17, 14, 0, 1f, new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(-66, -19, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 364, 148, textureX, textureY).addBox(0, 0, 0, 8, 2, 4)
				.setRotationPoint(-80, -6, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-78, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(22, -7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22, -4, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(23, -6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 115, textureX, textureY).addBox(0, 0, 0, 23, 11, 1)
				.setRotationPoint(44, -13, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 133, textureX, textureY).addBox(0, 0, 0, 13, 8, 1)
				.setRotationPoint(44, -21, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 112, textureX, textureY).addBox(0, 0, 0, 23, 11, 1)
				.setRotationPoint(44, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 155, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0.09f, 0, 0, -0.6f, 0, -2, 0, 0, -2, 0, 0, 0, 0.09f, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -22, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 155, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -23, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 2, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -23, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -2, -0.6f, 0, -2, 0.09f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.09f, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -22, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 155, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 151, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(48, 1, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 140, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(-61, 1, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 123, textureX, textureY).addBox(0, 0, 0, 1, 19, 17)
				.setRotationPoint(44, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 165, textureX, textureY)
				.addShapeBox(-1, 0, -0.5f, 1, 14, 4, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(44, -21, -10.5f).setRotationAngle(0, 0, 0).setName("Door0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 138, textureX, textureY)
				.addShapeBox(-1, 0, -0.5f, 1, 2, 4, 0, -0.75f, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(44, -23, -10.5f).setRotationAngle(0, 0, 0).setName("Door1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 166, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(49, -11, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 155, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(47, -12, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 162, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
				.setRotationPoint(47, -17, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 159, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(49, -11, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 155, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(47, -12, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 162, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
				.setRotationPoint(47, -17, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 162, textureX, textureY).addBox(0, 0, 0, 3, 7, 4)
				.setRotationPoint(57, -14, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -16, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 161, textureX, textureY).addBox(0, 0, 0, 3, 8, 4)
				.setRotationPoint(57, -15, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 145, textureX, textureY).addBox(0, 0, 0, 4, 1, 8)
				.setRotationPoint(53, -15, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 126, textureX, textureY).addBox(0, 0, 0, 6, 1, 12)
				.setRotationPoint(68, -2, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.82f, 0, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.82f, -0.5f, 0)
				.setRotationPoint(69, -2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(69, 0.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(69, 2.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(69, 4.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 154, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 4, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -2.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0)
				.setRotationPoint(68, 7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 170, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
				.setRotationPoint(74.25f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(74.25f, 1.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 120, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(75.25f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 154, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(76.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 65, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(78.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
				.setRotationPoint(76.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(68.75f, -3, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0.75f, 0, 3.5f, -1.25f, 0, 3.5f, -1.25f, 0, -4, 0.75f, 0, -4, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(68.75f, -9.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(68.75f, -3, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 116, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(66, -16.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 172, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
				.setRotationPoint(68.5f, -16.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f)
				.setRotationPoint(68.7f, -15.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(69, -14.45f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_low").setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(69, -16.05f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_high").setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.25f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f)
				.setRotationPoint(75.25f, -4.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(75.65f, -4.55f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
				.setRotationPoint(75.75f, -4.55f, -6.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_right").setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.25f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f)
				.setRotationPoint(75.25f, -4.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(75.65f, -4.55f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
				.setRotationPoint(75.75f, -4.55f, 4.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_left").setName(StaticModelAnimator.tagGlow)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(74, -10, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(75.75f, -10, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.5f, -0.5f, 0, -1, -0.5f, 0, 0.75f, -0.5f, 0.5f, -1.25f, -0.5f, 0.5f, 0.5f, 0, 0, -1, 0, 0, 0.75f, 0, 0.5f, -1.25f, 0, 0.5f)
				.setRotationPoint(75, -10, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
				.setRotationPoint(74, -10, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 151, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
				.setRotationPoint(73, 3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(73, -2.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1.5f, 0, -2.5f, 1, 0, -2.5f, 1, 0, 2, -1.5f, 0, 2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(73, -9, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(74, -10, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(75.75f, -10, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, -0.5f, 0.5f, 0.75f, -0.5f, 0.5f, -1, -0.5f, 0, 0.5f, -0.5f, 0, -1.25f, 0, 0.5f, 0.75f, 0, 0.5f, -1, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(75, -10, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(74, -10, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 145, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73, 3, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73, -2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1.5f, 0, 2, 1, 0, 2, 1, 0, -2.5f, -1.5f, 0, -2.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73, -9, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 144, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f)
				.setRotationPoint(75.75f, -10, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0)
				.setRotationPoint(75.75f, -10, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 126, textureX, textureY).addBox(0, 0, 0, 6, 1, 12)
				.setRotationPoint(-86, -2, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 168, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
				.setRotationPoint(-87.25f, 3.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-87.25f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 103, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-88.25f, 4.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 129, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-89.25f, 4, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-91.25f, 4, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-89.25f, 4, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86.5f, 2, -7).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-86.75f, 2.2f, -6.88f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86.5f, 2, 4).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-86.75f, 2.2f, 4.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 139, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
				.setRotationPoint(-81, -2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0)
				.setRotationPoint(-81, -2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-87, -10, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-88.75f, -10, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.5f, 0, 0.5f, -0.5f, 0, -1.25f, -0.5f, 0.5f, 0.75f, -0.5f, 0.5f, -1, 0, 0, 0.5f, 0, 0, -1.25f, 0, 0.5f, 0.75f, 0, 0.5f)
				.setRotationPoint(-88, -10, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(-87, -10, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(-86, 3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-86, -2.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 1, 0, -2.5f, -1.5f, 0, -2.5f, -1.5f, 0, 2, 1, 0, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-86, -9, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-87, -10, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-88.75f, -10, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.75f, -0.5f, 0.5f, -1.25f, -0.5f, 0.5f, 0.5f, -0.5f, 0, -1, -0.5f, 0, 0.75f, 0, 0.5f, -1.25f, 0, 0.5f, 0.5f, 0, 0, -1, 0, 0)
				.setRotationPoint(-88, -10, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-87, -10, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, 3, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, -2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 1, 0, 2, -1.5f, 0, 2, -1.5f, 0, -2.5f, 1, 0, -2.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, -9, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f)
				.setRotationPoint(-88.75f, -10, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0)
				.setRotationPoint(-88.75f, -10, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-81.5f, -9.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-81.5f, -9.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(68.75f, -16.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(68.75f, -12.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(68.75f, -8.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(68.75f, -4.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 89, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(42, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 86, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(42, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 83, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-55, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 73, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-55, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 75, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(66, -16.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(21, -6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(21, -7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-87, 0, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 49, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0, -1, 0, -0.75f, -1, 0)
				.setRotationPoint(-87, 8, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-87, 0, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 49, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-87, 8, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 118, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(-55.5f, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 117, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(-55.5f, -1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 116, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(41.5f, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 78, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(41.5f, -1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 49, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-84.5f, -23.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 100, textureX, textureY).addBox(0, 0, 0, 32, 1, 2)
				.setRotationPoint(-66, -22.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-66, -22.25f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4)
				.setRotationPoint(-66, -19.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-66, -21.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 39, textureX, textureY).addBox(0, 0, 0, 32, 1, 2)
				.setRotationPoint(-66, -22.25f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 1, 2, 0, 0, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-66, -22.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 5, 4, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-66, -19.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 2, 4, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-66, -21.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, -1, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, -1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 16, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, -2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 124, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
				.setRotationPoint(74.25f, -2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 154, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(76.25f, -2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 153, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(76.25f, -2, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -1, 0, 0.5f, -1)
				.setRotationPoint(-34, 5, 10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(-34, 5, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(24, -7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, -3.5f, 0, 0, 1.5f, 0, 0, 1.5f, -0.5f, 0.5f, -3.5f, -0.5f, 0.5f, 3, 0, 0, -2, 0, 0, -2, -0.5f, 0.5f, 3, -0.5f)
				.setRotationPoint(20.5f, -13, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 101, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-81, -10, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(18, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 38, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(24.5f, -15, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(10, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(2, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-6, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-14, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-22, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-30, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-38, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-46, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-54, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-62, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-70, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-78, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-70, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-62, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-54, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-46, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-38, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-30, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-22, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-14, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-6, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(2, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-79, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 151, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-83, -23, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4)
				.setRotationPoint(-83, -23, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 160, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-83, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 137, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-77, -23.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 163, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-74, -23.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 163, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-74, -23.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 163, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-77, -23.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-77, -23.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-71, -23.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-71, -23.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
				.setRotationPoint(68, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
				.setRotationPoint(68, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
				.setRotationPoint(68, 1.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
				.setRotationPoint(68, -0.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -0.82f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0)
				.setRotationPoint(69, -2, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1.2f, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -1.2f, -0.5f, 0)
				.setRotationPoint(69, 0.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1.2f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -1.2f, -0.5f, 0)
				.setRotationPoint(69, 2.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 160, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0)
				.setRotationPoint(69, 4.75f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 153, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 4, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -2.2f, -0.5f, 0)
				.setRotationPoint(68, 7.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0)
				.setRotationPoint(68, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0)
				.setRotationPoint(68, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0)
				.setRotationPoint(68, 1.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0)
				.setRotationPoint(68, -0.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.82f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.82f, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, -2, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -1.2f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, 0.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 160, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -1.2f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, 2.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 133, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, 4.75f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 4, 0, 0, 0, 0, -0.7f, 0, 0, -2.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0, -2.2f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, 7.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, 6.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, 3.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, 1.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, -0.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 35, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -1.2f, 0, 0, -0.82f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, -0.82f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, -2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-86, 0.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(-86, 2.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, 4.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 4, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -2.2f, -0.5f, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, 7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 37, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-86, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 34, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-86, 3.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-86, 1.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-86, -0.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 140, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 11, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, -1, 0, 3, -1, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(57, -21, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 140, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 11, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, -1, 0, 0, -1, 0, 3, -1, 0, -3, -1, 0)
				.setRotationPoint(57, -21, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 96, textureX, textureY).addBox(0, 0, 0, 10, 1, 1)
				.setRotationPoint(57, -14, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 86, textureX, textureY).addBox(0, 0, 0, 6, 1, 11)
				.setRotationPoint(62, -16, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, 0, -3, 0, 0, -0.28f, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -0.27f, 0, 0, 0, 0, 0)
				.setRotationPoint(67, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 194, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 2, 5)
				.setCorners(0, 0, -0.5f, -0.5f, 0, -0.5f, 0.73f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 0.72f, 0, 0, 0, 0, 0)
				.setPolygonUV(0, new float[]{ 122.0f, 199.0f })
				.setPolygonUV(2, new float[]{ 9.0f, 12.0f, -1.800003f, 12.0f, -0.5999985f, 16.600006f, 9.0f, 16.0f })
				.setDetachedUV(0).build()
				.setRotationPoint(68, -16, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 219, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 6, 0, 1, 0, -0.5f, -0.5f, 0, -0.5f, 1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, 1, 0, 0, 0, 0, 0)
				.setRotationPoint(60, -17, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -21, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
				.setRotationPoint(57, -21, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 164, textureX, textureY).addBox(0, 0, 0, 1, 14, 4)
				.setRotationPoint(59, -16, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0.75f, 0, -4, -1.25f, 0, -4, -1.25f, 0, 3.5f, 0.75f, 0, 3.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(68.75f, -9.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 143, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-25, -23.25f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-87, 8, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 104, textureX, textureY).addBox(0, 0, 0, 13, 4, 14)
				.setRotationPoint(-80, -18, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 102, textureX, textureY).addBox(0, 0, 0, 13, 2, 14)
				.setRotationPoint(-80, -4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 26, 10, 1, 0, 0, 0, 0, -13, 0, 0, -13, 0, -1, 0, 0, -1, 0, 0, 0, -13, 0, 0, -13, 0, -1, 0, 0, -1)
				.setRotationPoint(-80, -14, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 155, textureX, textureY).addBox(0, 0, 0, 1, 16, 7)
				.setRotationPoint(-80.5f, -18, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 193, textureX, textureY)
				.addShapeBox(0, 0, -0.75f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, -1.25f, 0, -1, -1.25f, 0, 0, -1.25f, 0)
				.setRotationPoint(-65.5f, -19.45f, 10.5f).setRotationAngle(-37.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 144, textureX, textureY)
				.addShapeBox(0, 0, -0.75f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, -1.25f, 0, -1, -1.25f, 0, 0, -1.25f, 0)
				.setRotationPoint(-55, -19.45f, 10.5f).setRotationAngle(-37.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 143, textureX, textureY)
				.addShapeBox(0, 0, -0.75f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, -1.25f, 0, -1, -1.25f, 0, 0, -1.25f, 0)
				.setRotationPoint(-44.5f, -19.45f, 10.5f).setRotationAngle(-37.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-66, -22.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 142, textureX, textureY)
				.addShapeBox(0, 0, -0.25f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, -1.25f, 0, -1, -1.25f, 0, 0, -1.25f, 0)
				.setRotationPoint(-65.5f, -19.45f, -10.45f).setRotationAngle(37.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 142, textureX, textureY)
				.addShapeBox(0, 0, -0.25f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, -1.25f, 0, -1, -1.25f, 0, 0, -1.25f, 0)
				.setRotationPoint(-55, -19.45f, -10.45f).setRotationAngle(37.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 140, textureX, textureY)
				.addShapeBox(0, 0, -0.25f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1.25f, 0, -1, -1.25f, 0, -1, -1.25f, 0, 0, -1.25f, 0)
				.setRotationPoint(-44.5f, -19.45f, -10.45f).setRotationAngle(37.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 153, textureX, textureY)
				.addShapeBox(0, 0, -1, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0)
				.setRotationPoint(-65.5f, -19.35f, 10.5f).setRotationAngle(-35.95f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 152, textureX, textureY)
				.addShapeBox(0, 0, -1, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0)
				.setRotationPoint(-55, -19.35f, 10.5f).setRotationAngle(-35.95f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 152, textureX, textureY)
				.addShapeBox(0, 0, -1, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0)
				.setRotationPoint(-44.5f, -19.35f, 10.5f).setRotationAngle(-35.95f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 151, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0)
				.setRotationPoint(-65.5f, -19.3f, -10.5f).setRotationAngle(37.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 150, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0)
				.setRotationPoint(-55, -19.3f, -10.5f).setRotationAngle(37.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0, -0.01f, -1.35f, 0)
				.setRotationPoint(-44.5f, -19.3f, -10.5f).setRotationAngle(37.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY).addBox(0, 0, 0, 3, 2, 4)
				.setRotationPoint(-75, -8, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.75f, -1, 0, 0, -1, 0)
				.setRotationPoint(74, 8, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 40, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1, 0, -0.75f, -1, 0, -0.25f, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(74, 8, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(74, 8, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 20, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-87, 7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-81, -10, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-81, -10, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 26, 10, 1, 0, 0, 0, -1, -13, 0, -1, -13, 0, 0, 0, 0, 0, 0, 0, -1, -13, 0, -1, -13, 0, 0, 0, 0, 0)
				.setRotationPoint(-80, -14, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 194, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 2, 5)
				.setCorners(0, 0, 0, 0.73f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.72f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setPolygonUV(0, new float[]{ 122.0f, 199.0f })
				.setPolygonUV(2, new float[]{ 9.0f, 12.0f, -1.800003f, 12.0f, -0.5999985f, 16.600006f, 9.0f, 16.0f })
				.setDetachedUV(0).build()
				.setRotationPoint(68, -16, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 205, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -7, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 133, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 5, 4, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -8, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 9, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -16, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 9, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -16, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, -14, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 140, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, -16, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 207, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.09f, 0, 0, 0.09f, 0, -2, 0, 0, -2, 0, 0, 0, 0.09f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 204, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -2, 0.09f, 0, -2, 0.09f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0.09f, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -23, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 46, 4, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-80, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 1, 14, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-66, -22.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 308, textureX, textureY)
				.addBox(0, 0, 0, 1, 16, 14, 0, 1f, new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(-67, -18, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 164, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0)
				.setRotationPoint(55, -4.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 227, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -4, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-85, -22.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 317, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -4)
				.setRotationPoint(-85, -22.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 267, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-85, -22.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 274, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-80, -22.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 148, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(-80, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 199, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.75f, 0, -0.28f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.28f, 0, 0, 0, 0, 0)
				.setRotationPoint(69, -13, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 199, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.28f, -0.5f, 0, 0, -0.75f, 0, 0, -0.5f, 0, 0, 0, 0, -0.28f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(69, -13, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 151, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0)
				.setRotationPoint(77.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-90.25f, 4, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, -1)
				.setRotationPoint(-34, 7.5f, 8).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-34, 7.5f, -10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-34, 7.5f, -8).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 239, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 6, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(51, -23.5f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 429, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 9, 0, -2.4f, 0, 0, 2.6f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, -2.4f, -0.5f, 0, 2.6f, -0.5f, 0, 0.1f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(57.25f, -21, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 429, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 9, 0, 0.1f, 0, 0, 0.1f, 0, 0, 2.6f, 0, 0, -2.4f, 0, 0, 0.1f, -0.5f, 0, 0.1f, -0.5f, 0, 2.6f, -0.5f, 0, -2.4f, -0.5f, 0)
				.setRotationPoint(57.25f, -21, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 441, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f)
				.setRotationPoint(54, -20, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 440, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f)
				.setRotationPoint(49, -20, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 441, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f)
				.setRotationPoint(46, -20, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 453, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f)
				.setRotationPoint(54, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 213, 467, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 4, 1, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f)
				.setRotationPoint(49, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 453, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f)
				.setRotationPoint(46, -20, -11).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_M420cb(){
		TurboList M420cb = new TurboList("M420cb");
		M420cb.add(new ModelRendererTurbo(M420cb, 319, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 3, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-34, 2, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 251, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0)
				.setRotationPoint(-34, 5, -10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		this.groups.add(M420cb);
	}

	private final void initGroup_RS18cb(){
	}

	private final void initGroup_SD70MACcb(){
		TurboList SD70MACcb = new TurboList("SD70MACcb");
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 197, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(73.5f, 2, -8).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 328, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(73.5f, 2, 5).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 16, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-87, -2, -8).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 185, 120, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
				.setRotationPoint(-88.25f, -2, -8).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 398, 153, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-89.25f, -2, -8).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 203, 152, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-89.25f, -2, 0).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 208, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, 0, -1, 0.5f)
				.setRotationPoint(46, -21, 11).setRotationAngle(0, 0, 0).setName("Box 168cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 480, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, 0, -1, -1.25f)
				.setRotationPoint(46, -21, -12).setRotationAngle(0, 0, 0).setName("Box 168cp")
		);
		this.groups.add(SD70MACcb);
	}

	private final void initGroup_F40phcb(){
	}

	private final void initGroup_SD70Icb(){
		TurboList SD70Icb = new TurboList("SD70Icb");
		SD70Icb.add(new ModelRendererTurbo(SD70Icb, 507, 3, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-25, -22.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		this.groups.add(SD70Icb);
	}

	private final void initGroup_SD60MACcb(){
	}

	private final void initGroup_SD90MACcb(){
		TurboList SD90MACcb = new TurboList("SD90MACcb");
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 210, 224, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 6, 0, 0, 0, 0, 1, 0, 0, -0.5f, 0, -0.5f, 1, 0, -0.5f, 0, 0, 0, 1, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(60, -17, 0).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 310, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 10, 11, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(67, -12, 0).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 281, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 10, 11, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(67, -12, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 358, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 10, 0, 0, 0, 0, -0.28f, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -0.27f, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(67, -14, 1).setRotationAngle(0, 0, 0)
		);
		this.groups.add(SD90MACcb);
	}

	private final void initGroup_SD90MACHcb(){
		TurboList SD90MACHcb = new TurboList("SD90MACHcb");
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 417, 156, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 2, -0.5f, 0, -1, -6, 0, -1, 0, 0, 0, 0, -2, -1.75f, -0.5f, 0, 0, -6, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(65, -15, 5).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 108, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 2, -0.5f, 1.5f, 0.25f, -0.5f, 0, -1, 0, 0, 2, -5.5f, -2, -2, -0.5f, 1.5f, 0, -0.5f, 0, 0, 0, 0, -3, -5.5f)
				.setRotationPoint(65, -15, 5).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 235, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 6, 0, -1, 2, -0.5f, 0, 2, -0.5f, 0, 0, 0, 0, 0, 0, -2, -2, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -15, 5).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 494, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, 0, -1, 0, 0, -1, -6, 0, 2, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -6, -2, -1.75f, -0.5f)
				.setRotationPoint(65, -15, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 495, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 2, -5.5f, 0, -1, 0, 1.5f, 0.25f, -0.5f, 0, 2, -0.5f, 0, -3, -5.5f, 0, 0, 0, 1.5f, 0, -0.5f, -2, -2, -0.5f)
				.setRotationPoint(65, -15, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 237, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 2, -0.5f, -1, 2, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2, -2, -0.5f)
				.setRotationPoint(58, -15, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 326, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, 7, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 154, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 15, 4, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f)
				.setRotationPoint(67.9f, -17, -4.7f).setRotationAngle(0, 16, 0)
		);
		this.groups.add(SD90MACHcb);
	}

	private final void initGroup_AC4400CWcb(){
	}

	private final void initGroup_SD90MACH_Oldcb(){
		TurboList SD90MACH_Oldcb = new TurboList("SD90MACH_Oldcb");
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 59, 232, textureX, textureY)
				.addShapeBox(0, 0, 1, 1, 2, 4, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0)
				.setRotationPoint(59.55f, -23, 1.9f).setRotationAngle(0, -15, 0).setName("Numberboard_left")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 265, 224, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0)
				.setRotationPoint(58.25f, -23, -6.75f).setRotationAngle(0, 15, 0).setName("Numberboard_right")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 0, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-66, -22.75f, -7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 442, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 31, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-66, -22.75f, 6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 161, 236, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 12, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-66, -23.25f, -6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 197, 253, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-50.5f, -22.75f, -6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 222, 238, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-36, -22.75f, -6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 197, 246, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-66, -23.25f, 6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 190, 234, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
				.setRotationPoint(-66, -23.25f, -7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 429, 206, textureX, textureY).addBox(0, 0, 0, 12, 1, 4)
				.setRotationPoint(-63.25f, -23.25f, -2).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 473, 315, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
				.setRotationPoint(-59.25f, -23.25f, -6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 474, 298, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-55.25f, -23.25f, -6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 469, 284, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-63.25f, -23.25f, -6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 469, 271, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
				.setRotationPoint(-59.25f, -23.25f, 2).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 473, 259, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0)
				.setRotationPoint(-55.25f, -23.25f, 2).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 469, 241, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4)
				.setRotationPoint(-63.25f, -23.25f, 2).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 406, 236, textureX, textureY).addBox(0, 0, 0, 12, 1, 4)
				.setRotationPoint(-48.75f, -23.25f, -2).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 463, 220, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
				.setRotationPoint(-44.75f, -23.25f, -6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 451, 244, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-40.75f, -23.25f, -6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 383, 215, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48.75f, -23.25f, -6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 388, 230, textureX, textureY).addBox(0, 0, 0, 4, 1, 4)
				.setRotationPoint(-44.75f, -23.25f, 2).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 398, 204, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0)
				.setRotationPoint(-40.75f, -23.25f, 2).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 439, 224, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4)
				.setRotationPoint(-48.75f, -23.25f, 2).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 356, 170, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-7, 2, 8).setRotationAngle(25, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 308, 170, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-7, 0.75f, -10.5f).setRotationAngle(-25, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 115, 385, textureX, textureY).addBox(0, 0, 0, 22, 3, 1)
				.setRotationPoint(-33, -1, 9).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 119, 375, textureX, textureY).addBox(0, 0, 0, 5, 3, 1)
				.setRotationPoint(-4, -1, 10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 43, 378, textureX, textureY).addBox(0, 0, 0, 22, 1, 1)
				.setRotationPoint(-33, 0, 10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 57, 339, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, -1, 10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 48, 366, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-33, 1, 10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 56, 355, textureX, textureY).addBox(0, 0, 0, 22, 1, 1)
				.setRotationPoint(-33, 0, 8).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 112, 358, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, -1, 8).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 112, 350, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, 1, 8).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 102, 375, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(5, -1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 276, 110, textureX, textureY).addBox(0, 0, 0, 12, 3, 1)
				.setRotationPoint(-33, -1, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 446, 109, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
				.setRotationPoint(-33, 0, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 276, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, -1, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 446, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-33, 1, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 453, 86, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
				.setRotationPoint(-33, 0, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 448, 35, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, -1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 458, 21, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, 1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 88, 124, textureX, textureY).addBox(0, 0, 0, 12, 3, 1)
				.setRotationPoint(11, -1, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 419, 123, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
				.setRotationPoint(11, 0, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 382, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(11, -1, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 161, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(11, 1, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 125, 121, textureX, textureY).addBox(0, 0, 0, 12, 1, 1)
				.setRotationPoint(11, 0, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 88, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(11, -1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 164, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 12, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(11, 1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(25.25f, -0.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 336, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(25.5f, -1.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 506, 46, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-24, -23.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 440, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-26, -23.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 433, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-24, -23.75f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 365, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-26, -23.75f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 504, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-24, -23.75f, -1.75f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 223, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-24, -23.75f, -0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 448, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-23, -23.75f, -1).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 349, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-24, -23.75f, -2.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 53, 404, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f)
				.setRotationPoint(-85.25f, -20, -2).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 374, 369, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-85.5f, -20, -0.1f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 242, 380, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-85.5f, -20, -1.9f).setRotationAngle(0, 0, 0).setName(StaticModelAnimator.tagGlow)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 11, 287, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 13, 2, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-85, -15, -1).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 8, 271, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-85.25f, -15.5f, -0.5f).setRotationAngle(0, 0, -45)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 8, 227, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 20, 4, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-85, -22, -7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 7, 317, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 20, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4)
				.setRotationPoint(-85, -22, 3).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 366, 344, textureX, textureY)
				.addShapeBox(0, 0, 1, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-82, -19, -6).setRotationAngle(0, -51, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 334, 356, textureX, textureY)
				.addShapeBox(0, 0, 1, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-82, -22, -6).setRotationAngle(0, -51, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 350, 362, textureX, textureY)
				.addShapeBox(0, 0, 1, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-82, -16, -6).setRotationAngle(0, -51, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 377, 335, textureX, textureY)
				.addShapeBox(0, 0, 1, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-82, -13, -6).setRotationAngle(0, -51, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 376, 353, textureX, textureY)
				.addShapeBox(0, 0, 1, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-82, -10, -6).setRotationAngle(0, -51, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 361, 331, textureX, textureY)
				.addShapeBox(0, 0, 1, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-82, -7, -6).setRotationAngle(0, -51, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 355, 350, textureX, textureY)
				.addShapeBox(0, 0, 1, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-81.5f, -23.5f, -5.5f).setRotationAngle(0, -51, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 341, 255, textureX, textureY).addBox(0, 0, 0, 5, 20, 2)
				.setRotationPoint(-85, -22, 1).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 366, 249, textureX, textureY).addBox(0, 0, 0, 5, 20, 2)
				.setRotationPoint(-85, -22, -3).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 104, 241, textureX, textureY).addBox(0, 0, 0, 4, 3, 2)
				.setRotationPoint(-84, -18, -1).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 96, 105, textureX, textureY).addBox(0, 0, 0, 7, 5, 1)
				.setRotationPoint(7, -8, -7.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 124, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -2, 0, -0.25f, 1.25f, 0, -0.25f, 1.75f, 0, 0, -2.5f, 0, 0)
				.setRotationPoint(73.75f, 3.6999998f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 0, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, -1.25f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.5f, -1, 0, -1.25f, -1, 0)
				.setRotationPoint(75, 6.7f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 365, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0.5f, 0, 0, -1.25f, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, -1.5f, 0, 0)
				.setRotationPoint(75, 6.7f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 28, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -2.5f, 0, 0, 1.75f, 0, 0, 1.25f, 0, -0.25f, -2, 0, -0.25f)
				.setRotationPoint(73.75f, 3.6999998f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 428, 156, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, 0, 0, 0.5f, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1.25f, -1, 0, 0.5f, -1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(75, 6.7f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 389, 148, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, 0, 0, 0.5f, 0, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -1.5f, 0, 0, 0.5f, 0, 0, 0, 0, -0.25f, -1, 0, -0.25f)
				.setRotationPoint(75, 6.7f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 235, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(74.25f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 134, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(74.25f, -1, -5.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 206, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(-88.25f, -1, 3.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 107, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(-88.25f, -1, -5.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 425, 226, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.2f, 0, 0, -1.05f, 0, 0, -0.57f, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.19f, 0, 0, -0.57f, 0, 0)
				.setRotationPoint(74.1f, 3, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 138, 208, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0.33f, 0, 0, -1.11f, 0, 0, -0.73f, 0, -1, 0, 0, -1, -0.3f, 0, 0, -0.45f, 0, 0, -0.07f, 0, 0, -0.68f, 0, 0)
				.setRotationPoint(74.92f, 3, -5).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 425, 226, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.25f, 0, 0, -0.57f, 0, 0, -1.05f, 0, 0, 0.2f, 0, 0, -0.57f, 0, 0, -0.19f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74.1f, 3, 8).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 138, 208, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, -1, -0.73f, 0, -1, -1.11f, 0, 0, 0.33f, 0, 0, -0.68f, 0, 0, -0.07f, 0, 0, -0.45f, 0, 0, -0.3f, 0, 0)
				.setRotationPoint(74.82f, 3, 3).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 296, 278, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 9, 0, 1, 0, -2, -1.75f, 0, -2, -3.25f, 0, 1, 2.5f, 0, 1, -0.3f, 0, 0, -0.45f, 0, 0, -2.25f, 0, 0, 1.5f, 0, 0)
				.setRotationPoint(76.6f, 5, 1).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 36, 201, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -1.89f, 0, 0, 1.04f, 0, 0)
				.setRotationPoint(74.94f, 2, 4).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 170, 402, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 10, 0, -0.5f, 0, 0, -0.25f, 0, 0, -2.25f, 0, 0, 1.5f, 0, 0, -1, 0, 0, 0.25f, 0, 0, -1.65f, 0, -1, 0.9f, 0, -1)
				.setRotationPoint(76.6f, 7, 0).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 296, 278, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 9, 0, 2.5f, 0, 1, -3.25f, 0, 1, -1.75f, 0, -2, 1, 0, -2, 1.5f, 0, 0, -2.25f, 0, 0, -0.45f, 0, 0, -0.3f, 0, 0)
				.setRotationPoint(76.6f, 5, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 198, 291, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, 1.04f, 0, 0, -1.89f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74.94f, 2, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 170, 402, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 10, 0, 1.5f, 0, 0, -2.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0.9f, 0, -1, -1.65f, 0, -1, 0.25f, 0, 0, -1, 0, 0)
				.setRotationPoint(76.6f, 7, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 375, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(73.75f, 1.6999998f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 96, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.75f, -0.5f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(73.75f, 1.6999998f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 248, 392, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-34, 1, 6).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 327, 381, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-34, 1, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 352, 409, textureX, textureY).addBox(0, 0, 0, 58, 1, 12)
				.setRotationPoint(-34, 1, -6).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 235, 323, textureX, textureY).addBox(0, 0, 0, 39, 4, 14)
				.setRotationPoint(0, -23, -7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 196, 360, textureX, textureY).addBox(0, 0, 0, 2, 4, 14)
				.setRotationPoint(42, -23, -7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 267, 278, textureX, textureY).addBox(0, 0, 0, 3, 4, 13)
				.setRotationPoint(39, -23, -7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 239, 299, textureX, textureY).addBox(0, 0, 0, 3, 3, 1)
				.setRotationPoint(39, -22, 6).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 311, 292, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(39, -21, 6.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 308, 268, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(39, -18, 6.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 334, 297, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(39, -23, 5.75f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 325, 286, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(39, -24, 4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 433, 303, textureX, textureY).addBox(0, 0, 0, 15, 8, 4)
				.setRotationPoint(7, -10, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 401, 332, textureX, textureY).addBox(0, 0, 0, 6, 13, 4)
				.setRotationPoint(36, -15, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 419, 273, textureX, textureY).addBox(0, 0, 0, 14, 1, 4)
				.setRotationPoint(22, -10, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 394, 291, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(22, -9, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 394, 305, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(35, -9, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 409, 289, textureX, textureY)
				.addShapeBox(0, 0, 0, 7, 2, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1)
				.setRotationPoint(29, -4, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 377, 305, textureX, textureY).addBox(0, 0, 0, 2, 8, 4)
				.setRotationPoint(42, -10, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 397, 272, textureX, textureY).addBox(0, 0, 0, 1, 5, 3)
				.setRotationPoint(21.5f, -7.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 373, 284, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(42, -15, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 294, 362, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(13.5f, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 302, 224, textureX, textureY)
				.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(6, -18, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 273, 364, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(20.5f, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 307, 363, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(28.5f, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 286, 381, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(36, -20.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 280, 209, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(36, -21, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 288, 350, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(42, -20.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 281, 218, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.5f, -0.5f, 0, 2.5f, -0.5f, 0, 2.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, 0, 0)
				.setRotationPoint(32, -18, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 313, 353, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(5, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 256, 259, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(6.5f, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 203, 404, textureX, textureY)
				.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-81, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 311, 310, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(21, -14.5f, 10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 105, 272, textureX, textureY).addBox(0, 0, 0, 34, 1, 6)
				.setRotationPoint(-34, -21.25f, -3).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 31, 292, textureX, textureY)
				.addShapeBox(0, 0, 0, 29, 3, 4, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-29, -21.5f, 3).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 34, 258, textureX, textureY)
				.addShapeBox(0, 0, 0, 29, 3, 4, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-29, -21.5f, -7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 461, 349, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(42.5f, -14.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 17, 213, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(40.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 475, 347, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(24.5f, -14.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 459, 334, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(32.5f, -14.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 490, 347, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(39.5f, -14.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 28, 285, textureX, textureY).addBox(0, 0, 0, 5, 1, 2)
				.setRotationPoint(-85, -22, -1).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 31, 277, textureX, textureY).addBox(0, 0, 0, 5, 4, 2)
				.setRotationPoint(-85, -22, -1).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 198, 203, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(6.5f, -8.5f, 7.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 239, 209, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(6.5f, -5, 7.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 19, 135, textureX, textureY).addBox(0, 0, 0, 6, 5, 1)
				.setRotationPoint(15, -22.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 421, 133, textureX, textureY).addBox(0, 0, 0, 6, 5, 1)
				.setRotationPoint(15, -17, 6.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 336, 237, textureX, textureY).addBox(0, 0, 0, 3, 1, 7)
				.setRotationPoint(54, -15, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 334, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(55, -16, -4).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 387, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(56, -16, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 382, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(55, -16, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 507, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(56, -16, -7).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 164, 329, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 2, 4, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-34, -21, 3).setRotationAngle(0, 0, 0)
		);
		SD90MACH_Oldcb.add(new ModelRendererTurbo(SD90MACH_Oldcb, 143, 316, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 2, 4, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-34, -21, -7).setRotationAngle(0, 0, 0)
		);
		this.groups.add(SD90MACH_Oldcb);
	}

}