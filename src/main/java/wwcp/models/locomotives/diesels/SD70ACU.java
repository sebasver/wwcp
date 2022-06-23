//FMT-Marker TiM-1.0
//Using PER-GROUP-INIT mode with limit '500'!
package wwcp.models.locomotives.diesels;

import ebf.tim.models.StaticModelAnimator;
import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;
import fexcraft.tmt.slim.Vec3f;
import net.minecraft.entity.Entity;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class SD70ACU extends RollingStockModel {

	public SD70ACU(){
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
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 148, 1, 22)
				.setRotationPoint(-80, -1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 339, 134, textureX, textureY).addBox(0, 0, 0, 13, 8, 1)
				.setRotationPoint(44, -20, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 1, 43, textureX, textureY)
				.addBox(0, 0, 0, 110, 17, 14, 0, 1f, new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(-66, -18, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 243, 138, textureX, textureY).addBox(0, 0, 0, 9, 8, 4)
				.setRotationPoint(13, -9, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 355, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 14, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(52, -23, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 364, 148, textureX, textureY).addBox(0, 0, 0, 8, 2, 4)
				.setRotationPoint(-80, -5, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY).addBox(0, 0, 0, 148, 2, 16)
				.setRotationPoint(-80, 0, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 302, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-34, 2, 6).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 276, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-34, 2, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 242, textureX, textureY).addBox(0, 0, 0, 58, 1, 12)
				.setRotationPoint(-34, 2, -6).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 170, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-7, 3, 8).setRotationAngle(25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 170, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-7, 1.75f, -10.5f).setRotationAngle(-25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-78, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(22, -6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(22, -3, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(23, -5, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 115, textureX, textureY).addBox(0, 0, 0, 24, 11, 1)
				.setRotationPoint(44, -12, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 133, textureX, textureY).addBox(0, 0, 0, 13, 8, 1)
				.setRotationPoint(44, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 112, textureX, textureY).addBox(0, 0, 0, 24, 11, 1)
				.setRotationPoint(44, -12, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-34, 8, 8).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-34, 8, -10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -22, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 155, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0.09f, 0, 0, -0.6f, 0, -2, 0, 0, -2, 0, 0, 0, 0.09f, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -21, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 155, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -22, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 2, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -22, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, -2, -0.6f, 0, -2, 0.09f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.09f, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -21, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 155, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(59, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 151, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(48, 2, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 140, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(-61, 2, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 123, textureX, textureY).addBox(0, 0, 0, 1, 19, 17)
				.setRotationPoint(44, -20, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 165, textureX, textureY)
				.addShapeBox(-1, 0, -0.5f, 1, 14, 4, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(44, -20, -10.5f).setRotationAngle(0, 0, 0).setName("Door0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 138, textureX, textureY)
				.addShapeBox(-1, 0, -0.5f, 1, 2, 4, 0, -0.75f, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(44, -22, -10.5f).setRotationAngle(0, 0, 0).setName("Door1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 166, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(49, -10, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 155, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(47, -11, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 162, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
				.setRotationPoint(47, -16, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 159, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(49, -10, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 155, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(47, -11, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 162, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
				.setRotationPoint(47, -16, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 162, textureX, textureY).addBox(0, 0, 0, 3, 7, 4)
				.setRotationPoint(57, -13, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -15, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 161, textureX, textureY).addBox(0, 0, 0, 3, 8, 4)
				.setRotationPoint(57, -14, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -15, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 145, textureX, textureY).addBox(0, 0, 0, 4, 1, 8)
				.setRotationPoint(53, -14, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 237, textureX, textureY).addBox(0, 0, 0, 3, 1, 4)
				.setRotationPoint(54, -13, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(53, -13, -4).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(56, -11, -4).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(54, -14, -4).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(53, -11, -4).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 126, textureX, textureY).addBox(0, 0, 0, 6, 1, 12)
				.setRotationPoint(68, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 4, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.82f, 0, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.82f, -0.5f, 0)
				.setRotationPoint(69, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(69, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(69, 3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(69, 5, 6).setRotationAngle(0, 0, 0)
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
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 151, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(77.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(76.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(78.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
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
				.setRotationPoint(68.75f, -2, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.25f, 0, 3.5f, -0.25f, 0, 3.5f, -0.25f, 0, -4, -0.25f, 0, -4, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(68.75f, -8.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(68.75f, -2, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 116, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(67, -15.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 172, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
				.setRotationPoint(69.5f, -14.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f)
				.setRotationPoint(69.6f, -15.25f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(70, -15.55f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(70, -13.95f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(70.1f, -13.95f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_low")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(70.1f, -15.55f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_high")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.25f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f)
				.setRotationPoint(75.25f, -3.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(75.65f, -3.55f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
				.setRotationPoint(75.75f, -3.55f, -6.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.25f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f)
				.setRotationPoint(75.25f, -3.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 88, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(75.65f, -3.55f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
				.setRotationPoint(75.75f, -3.55f, 4.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(74, -9, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(75.75f, -9, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 169, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.5f, -0.5f, 0, -1, -0.5f, 0, 0.75f, -0.5f, 0.5f, -1.25f, -0.5f, 0.5f, 0.5f, 0, 0, -1, 0, 0, 0.75f, 0, 0.5f, -1.25f, 0, 0.5f)
				.setRotationPoint(75, -9, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
				.setRotationPoint(74, -9, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 151, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
				.setRotationPoint(73, 4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(73, -1.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 79, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1.5f, 0, -2.5f, 1, 0, -2.5f, 1, 0, 2, -1.5f, 0, 2, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(73, -8, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(74, -9, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(75.75f, -9, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, -0.5f, 0.5f, 0.75f, -0.5f, 0.5f, -1, -0.5f, 0, 0.5f, -0.5f, 0, -1.25f, 0, 0.5f, 0.75f, 0, 0.5f, -1, 0, 0, 0.5f, 0, 0)
				.setRotationPoint(75, -9, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 411, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(74, -9, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 145, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73, 4, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73, -1.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1.5f, 0, 2, 1, 0, 2, 1, 0, -2.5f, -1.5f, 0, -2.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73, -8, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 144, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f)
				.setRotationPoint(75.75f, -9, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0)
				.setRotationPoint(75.75f, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 126, textureX, textureY).addBox(0, 0, 0, 6, 1, 12)
				.setRotationPoint(-86, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 168, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
				.setRotationPoint(-87.25f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-87.25f, 1.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 103, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-88.25f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 129, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-89.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 129, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-90.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(-89.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-91.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-91.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-89.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
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
				.addShapeBox(0, 0, 0, 1, 9, 4, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
				.setRotationPoint(-81, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 4, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0)
				.setRotationPoint(-81, -1, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-87, -9, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 177, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-88.75f, -9, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -0.5f, 0, 0.5f, -0.5f, 0, -1.25f, -0.5f, 0.5f, 0.75f, -0.5f, 0.5f, -1, 0, 0, 0.5f, 0, 0, -1.25f, 0, 0.5f, 0.75f, 0, 0.5f)
				.setRotationPoint(-88, -9, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(-87, -9, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(-86, 4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 451, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-86, -1.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 1, 0, -2.5f, -1.5f, 0, -2.5f, -1.5f, 0, 2, 1, 0, 2, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-86, -8, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-87, -9, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-88.75f, -9, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 167, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.75f, -0.5f, 0.5f, -1.25f, -0.5f, 0.5f, 0.5f, -0.5f, 0, -1, -0.5f, 0, 0.75f, 0, 0.5f, -1.25f, 0, 0.5f, 0.5f, 0, 0, -1, 0, 0)
				.setRotationPoint(-88, -9, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-87, -9, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 215, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, 4, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, -1.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 1, 0, 2, -1.5f, 0, 2, -1.5f, 0, -2.5f, 1, 0, -2.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, -8, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 429, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f)
				.setRotationPoint(-88.75f, -9, -2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0)
				.setRotationPoint(-88.75f, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-81.5f, -8.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 14, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-81.5f, -8.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(69.75f, -15.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(69.75f, -11.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(69.75f, -7.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(69.75f, -3.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -1.75f, 0, -0.25f, 1, 0, -0.25f, 1.5f, 0, 0, -2.25f, 0, 0)
				.setRotationPoint(73.75f, 3.7f, -7.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 166, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, -1.25f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.5f, -1, 0, -1.25f, -1, 0)
				.setRotationPoint(74.75f, 6.7f, -7.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0.5f, 0, 0, -1.25f, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, -1.5f, 0, 0)
				.setRotationPoint(74.75f, 6.7f, -7.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 89, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(42, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 86, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(42, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 83, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-55, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 73, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-55, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 75, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(67, -15.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(21, -5, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(21, -6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-87, 1, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 49, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0, -1, 0, -0.75f, -1, 0)
				.setRotationPoint(-87, 8, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-87, 1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 49, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-87, 8, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 118, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(-55.5f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 117, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(-55.5f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 116, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(41.5f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 78, textureX, textureY).addBox(0, 0, 0, 3, 1, 1)
				.setRotationPoint(41.5f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 85, textureX, textureY).addBox(0, 0, 0, 44, 4, 14)
				.setRotationPoint(0, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 86, textureX, textureY).addBox(0, 0, 0, 34, 2, 14)
				.setRotationPoint(-34, -20, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 34, 1, 14, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-34, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 49, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-84.5f, -22.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 161, textureX, textureY).addBox(0, 0, 0, 5, 20, 2)
				.setRotationPoint(-85, -21, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 100, textureX, textureY).addBox(0, 0, 0, 32, 1, 2)
				.setRotationPoint(-66, -21.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-66, -21.25f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -4, 0, -0.5f, -4)
				.setRotationPoint(-66, -18.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-66, -20.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 39, textureX, textureY).addBox(0, 0, 0, 32, 1, 2)
				.setRotationPoint(-66, -21.25f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 39, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-66, -21.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -4, 0, -0.5f, -4, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-66, -18.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 28, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-66, -20.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, 0, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, 0, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 16, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 132, 124, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
				.setRotationPoint(74.25f, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 154, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(76.25f, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 153, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(76.25f, -1, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f, 0, 0.25f, -0.1f)
				.setRotationPoint(-88.25f, -3.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-88.6f, -3.55f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-88.75f, -3.55f, -6.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_right_back")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f, 0, 0.25f, -0.1f)
				.setRotationPoint(-88.25f, -3.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-88.6f, -3.55f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-88.75f, -3.55f, 4.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_left_back")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 70, textureX, textureY).addBox(0, 0, 0, 58, 1, 16)
				.setRotationPoint(-34, 8, -8).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-34, 5, 10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 58, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-34, 5, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(24, -6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.5f, -3.5f, 0, 0, 1.5f, 0, 0, 1.5f, -0.5f, 0.5f, -3.5f, -0.5f, 0.5f, 3, 0, 0, -2, 0, 0, -2, -0.5f, 0.5f, 3, -0.5f)
				.setRotationPoint(20.5f, -12, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 101, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-81, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 176, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(18, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(25.5f, -13.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 38, textureX, textureY)
				.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(24.5f, -14, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(10, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(2, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-6, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-14, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 363, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-22, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-30, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-38, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-46, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 307, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-54, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-62, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-70, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-78, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 3, textureX, textureY).addBox(0, 0, 0, 22, 12, 4)
				.setRotationPoint(22, -13, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-70, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 18, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-62, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 175, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-54, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-46, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-38, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-30, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-22, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-14, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 268, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-6, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 263, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(2, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(12.5f, -14.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 17, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13, -15, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 174, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(20.5f, -14.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(33, -19.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(22, -20, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(42, -19.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(21.5f, -11, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 46, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-20, -22.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-22, -23, -1).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -2.25f, 0, 0, 1.5f, 0, 0, 1, 0, -0.25f, -1.75f, 0, -0.25f)
				.setRotationPoint(73.75f, 3.7f, 4.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 156, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, 0, 0, 0.5f, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1.25f, -1, 0, 0.5f, -1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(74.75f, 6.7f, 4.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 148, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, 0, 0, 0.5f, 0, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -1.5f, 0, 0, 0.5f, 0, 0, 0, 0, -0.25f, -1, 0, -0.25f)
				.setRotationPoint(74.75f, 6.7f, 4.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(74.25f, 0, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(74.25f, 0, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 13, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-79, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-66, -21.75f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-66, -21.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 151, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-83, -22, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4)
				.setRotationPoint(-83, -22, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 160, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-83, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 137, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-77, -22.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 163, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-74, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 163, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-74, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 163, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-77, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-77, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-71, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-71, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(-88.25f, 0, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(-88.25f, 0, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
				.setRotationPoint(68, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
				.setRotationPoint(68, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
				.setRotationPoint(68, 2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
				.setRotationPoint(68, 0, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -0.82f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0)
				.setRotationPoint(69, -1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1.2f, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -1.2f, -0.5f, 0)
				.setRotationPoint(69, 1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1.2f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -1.2f, -0.5f, 0)
				.setRotationPoint(69, 3, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 160, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0)
				.setRotationPoint(69, 5, -9).setRotationAngle(0, 0, 0)
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
				.setRotationPoint(68, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0)
				.setRotationPoint(68, 2, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0)
				.setRotationPoint(68, 0, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 65, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.82f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.82f, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, -1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -1.2f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, 1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 160, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -1.2f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, 3, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 133, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, 5, -9).setRotationAngle(0, 0, 0)
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
				.setRotationPoint(-86, 4, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 92, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, 2, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0)
				.setRotationPoint(-86, 0, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 35, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -1.2f, 0, 0, -0.82f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, -0.82f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
				.setRotationPoint(-86, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 118, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(-86, 3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-86, 5, 6).setRotationAngle(0, 0, 0)
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
				.setRotationPoint(-86, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 31, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-86, 2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-86, 0, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 140, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 11, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, -1, 0, 3, -1, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(57, -20, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 140, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 11, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, -1, 0, 0, -1, 0, 3, -1, 0, -3, -1, 0)
				.setRotationPoint(57, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 96, textureX, textureY).addBox(0, 0, 0, 11, 1, 1)
				.setRotationPoint(57, -13, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 86, textureX, textureY).addBox(0, 0, 0, 6, 1, 11)
				.setRotationPoint(63, -15.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0, 0, 0, -3, 0, 0, -0.28f, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -0.27f, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 194, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 2, 5)
				.setCorners(0, 0, -0.5f, -0.5f, 0, -0.5f, 0.73f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.72f, 0.5f, 0, 0, 0.5f, 0)
				.setPolygonUV(0, new float[]{ 122.0f, 199.0f })
				.setPolygonUV(2, new float[]{ 9.0f, 12.0f, -1.800003f, 12.0f, -0.5999985f, 16.600006f, 9.0f, 16.0f })
				.setDetachedUV(0).build()
				.setRotationPoint(69, -15.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 173, 233, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 6, 0, 1, 0, -0.5f, -0.5f, 0, -0.5f, 1, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 1, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(60, -16, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
				.setRotationPoint(57, -20, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 164, textureX, textureY).addBox(0, 0, 0, 1, 14, 4)
				.setRotationPoint(59, -15, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.25f, 0, -4, -0.25f, 0, -4, -0.25f, 0, 3.5f, -0.25f, 0, 3.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(68.75f, -8.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 14, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(30.5f, -13.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 173, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(37.5f, -13.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 172, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(42.5f, -13.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-20, -23, 0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-20, -22.75f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 171, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-20, -22.75f, -3.75f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-23, -23, 0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 143, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-21, -22.5f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 46, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-22, -22.5f, 0.75f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 168, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-20, -23, -1.75f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-20, -23, -0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 9, 0, -0.5f, 0, 0, -0.25f, 0, 0, -2.07f, 0, 0, 1.32f, 0, 0, -1, 0, 0, 0.25f, 0, 0, -1.65f, 0, -1, 0.9f, 0, -1,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(77, 8.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
				.setRotationPoint(74.25f, 0, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
				.setRotationPoint(-88.25f, 0, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 129, textureX, textureY).addBox(0, 0, 0, 6, 4, 2)
				.setRotationPoint(29, -20, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(29, -21, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 170, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(24, -19.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(21, -19.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 120, textureX, textureY).addBox(0, 0, 0, 18, 5, 1)
				.setRotationPoint(25, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 119, textureX, textureY).addBox(0, 0, 0, 18, 5, 1)
				.setRotationPoint(25, -6.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 14, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13, -12.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.5f, -0.1f, 0, 0, -0.1f, 0, -1.5f, -0.1f, 0, 1, -0.1f, 0, -0.5f, -0.1f, 0, 0, -0.1f, 0, -1.5f, -0.1f, 0, 1, -0.1f, 0)
				.setRotationPoint(60, -22.5f, 1.75f).setRotationAngle(0, 0, 0).setName("Numberboard_Top_Left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 1, -0.1f, 0, -1.5f, -0.1f, 0, 0, -0.1f, 0, -0.5f, -0.1f, 0, 1, -0.1f, 0, -1.5f, -0.1f, 0, 0, -0.1f, 0, -0.5f, -0.1f, 0)
				.setRotationPoint(60, -22.5f, -5.75f).setRotationAngle(0, 0, 0).setName("Numberboard_Top_Right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 5, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(22, -16.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 14, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(25, -16.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 11, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(34, -16.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(43, -16.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 46, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 4, 1.25f)
				.setCorners(0, 0, 0, 3, 0, 0, 2.73f, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 3, -0.5f, 0, 2.73f, -0.5f, -0.25f, 0, -0.5f, 0)
				.setPolygonUV(2, new float[]{ 13.0f, 0.0f, 5.0f, 0.0f, 5.0f, 5.0f, 13.0f, 5.0f }).build()
				.setRotationPoint(67, -15.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 43, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 4, 1.25f)
				.setCorners(0, 0, 0, 2.73f, 0, -0.25f, 3, 0, 0, 0, 0, 0, 0, -0.5f, 0, 2.73f, -0.5f, -0.25f, 3, -0.5f, 0, 0, -0.5f, 0)
				.setPolygonUV(2, new float[]{ 13.0f, 0.0f, 5.0f, 0.0f, 5.0f, 5.0f, 13.0f, 5.0f }).build()
				.setRotationPoint(67, -15.5f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 16, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(-87, 8, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 104, textureX, textureY).addBox(0, 0, 0, 13, 4, 14)
				.setRotationPoint(-80, -17, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 102, textureX, textureY).addBox(0, 0, 0, 13, 2, 14)
				.setRotationPoint(-80, -3, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 26, 10, 1, 0, 0, 0, 0, -13, 0, 0, -13, 0, -1, 0, 0, -1, 0, 0, 0, -13, 0, 0, -13, 0, -1, 0, 0, -1)
				.setRotationPoint(-80, -13, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 160, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 6, 4, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -3.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -3.5f)
				.setRotationPoint(-84, -7, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 147, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 6, 4, 0, -0.5f, 0, -0.5f, -7.5f, 0, -0.5f, -4, 0, 0, -0.5f, 0, -3.5f, -0.5f, 0, -0.5f, -7.5f, 0, -0.5f, -4, 0, 0, -0.5f, 0, -3.5f)
				.setRotationPoint(-84, -13, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 145, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 10, 4, 0, -0.5f, 0, -0.5f, -4, 0, -0.5f, -4, 0, 0, -0.5f, 0, -3.5f, -0.5f, 0, -0.5f, -4, 0, -0.5f, -4, 0, 0, -0.5f, 0, -3.5f,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(-83.5f, -13, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 144, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 10, 4, 0, -0.5f, 0, -3.5f, -4, 0, 0, -4, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -3.5f, -4, 0, 0, -4, 0, -0.5f, -0.5f, 0, -0.5f,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(-83.5f, -13, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 155, textureX, textureY).addBox(0, 0, 0, 1, 16, 7)
				.setRotationPoint(-80.5f, -17, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 160, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 6, 4, 0, -0.5f, 0, -3.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -3.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-84, -7, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 159, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 8, 4, 0, -0.5f, 0, -3.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -3.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-84, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 193, textureX, textureY)
				.addShapeBox(0, 0, -0.75f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-65.5f, -18.45f, 10.95f).setRotationAngle(-36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 144, textureX, textureY)
				.addShapeBox(0, 0, -0.75f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-55, -18.45f, 10.95f).setRotationAngle(-36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 143, textureX, textureY)
				.addShapeBox(0, 0, -0.75f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.55f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-44.5f, -18.45f, 10.95f).setRotationAngle(-36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-66, -21.75f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 142, textureX, textureY)
				.addShapeBox(0, 0, -0.25f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-65.5f, -18.45f, -10.95f).setRotationAngle(36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 142, textureX, textureY)
				.addShapeBox(0, 0, -0.25f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-55, -18.45f, -10.95f).setRotationAngle(36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 140, textureX, textureY)
				.addShapeBox(0, 0, -0.25f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-44.5f, -18.45f, -10.95f).setRotationAngle(36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 153, textureX, textureY)
				.addShapeBox(0, 0, -1, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
				.setRotationPoint(-65.5f, -18.45f, 10.85f).setRotationAngle(-36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 152, textureX, textureY)
				.addShapeBox(0, 0, -1, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
				.setRotationPoint(-55, -18.45f, 10.85f).setRotationAngle(-36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 152, textureX, textureY)
				.addShapeBox(0, 0, -1, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
				.setRotationPoint(-44.5f, -18.45f, 10.85f).setRotationAngle(-36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 151, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
				.setRotationPoint(-65.5f, -18.45f, -10.85f).setRotationAngle(36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 150, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
				.setRotationPoint(-55, -18.45f, -10.85f).setRotationAngle(36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
				.setRotationPoint(-44.5f, -18.45f, -10.85f).setRotationAngle(36.2f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY).addBox(0, 0, 0, 3, 2, 4)
				.setRotationPoint(-75, -7, -2).setRotationAngle(0, 0, 0)
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
				.setRotationPoint(-81, -9, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-81, -9, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 153, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0.2f, 0, 0, -1.05f, 0, 0, -0.63f, 0, 0, -0.18f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.31f, 0, 0, -0.44f, 0, 0)
				.setRotationPoint(74.5f, 3.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 154, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0.23f, 0, 0, -1.02f, 0, 0, -0.73f, 0, 0, 0, 0, 0, 0, 0, 0, -0.68f, 0, 0, -0.37f, 0, 0, -0.41f, 0, 0)
				.setRotationPoint(75.32f, 3.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 209, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 6, 4, 0, -0.5f, 0, -3.5f, -4, 0, 0, -7.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -3.5f, -4, 0, 0, -7.5f, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-84, -13, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 26, 10, 1, 0, 0, 0, -1, -13, 0, -1, -13, 0, 0, 0, 0, 0, 0, 0, -1, -13, 0, -1, -13, 0, 0, 0, 0, 0)
				.setRotationPoint(-80, -13, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 194, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 2, 5)
				.setCorners(0, 0, 0, 0.73f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0.72f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
				.setPolygonUV(0, new float[]{ 122.0f, 199.0f })
				.setPolygonUV(2, new float[]{ 9.0f, 12.0f, -1.800003f, 12.0f, -0.5999985f, 16.600006f, 9.0f, 16.0f })
				.setDetachedUV(0).build()
				.setRotationPoint(69, -15.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 205, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 4, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
						new boolean[]{ true, false, false, false, false, false })
				.setRotationPoint(45, -6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 23, 5, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -6, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 133, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 5, 4, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(45, -7, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 162, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 9, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -15, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 161, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 9, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -15, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, -13, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 140, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(53, -15, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 207, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0.09f, 0, 0, 0.09f, 0, -2, 0, 0, -2, 0, 0, 0, 0.09f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -22, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 204, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -2, 0.09f, 0, -2, 0.09f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, 0.09f, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -22, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 46, 4, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-80, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 279, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 4, 0, 0, 0, -0.5f, -3.5f, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, -3.5f, -0.5f, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0)
				.setRotationPoint(-85, -21.5f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 261, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 4, 0, -1, 0, 0, 0, 0, 0, -3.5f, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, 0, 0, -0.5f, 0, -3.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(-85, -21.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 267, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, -0.5f, -3.5f, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, -0.5f, -0.5f, -3.5f, -0.5f, -0.5f, 0, -0.5f, 0, -1, -0.5f, 0)
				.setRotationPoint(-85, -19, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 258, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 4, 0, -1, 0, 0, 0, 0, 0, -3.5f, 0, -0.5f, 0, 0, -0.5f, -1, -0.5f, 0, 0, -0.5f, 0, -3.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(-85, -19, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 310, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-85, -21.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 32, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
				.setRotationPoint(-66, -21.25f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 271, textureX, textureY)
				.addBox(0, 0, 0, 1, 16, 14, 0, 1f, new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(-67, -17, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 164, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0, 0, 2, 0)
				.setRotationPoint(55, -3.5f, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_M420cb(){
		TurboList M420cb = new TurboList("M420cb");
		M420cb.add(new ModelRendererTurbo(M420cb, 319, 3, textureX, textureY).addBox(0, 0, 0, 58, 2, 22)
				.setRotationPoint(-34, 3, -11).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 251, 46, textureX, textureY).addBox(0, 0, 0, 58, 3, 20)
				.setRotationPoint(-34, 5, -10).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		this.groups.add(M420cb);
	}

	private final void initGroup_RS18cb(){
	}

	private final void initGroup_SD70MACcb(){
		TurboList SD70MACcb = new TurboList("SD70MACcb");
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 197, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(73.5f, 2, -7).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 375, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(73.75f, 1.7f, -7.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 328, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(73.5f, 2, 4).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 96, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.75f, -0.5f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(73.75f, 1.7f, 4.12f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 16, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-87, -1, -8).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 185, 120, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
				.setRotationPoint(-88.25f, -1, -8).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 398, 153, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-89.25f, -1, -8).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 203, 152, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-89.25f, -1, 0).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 208, 85, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, 0, -1, 0.5f)
				.setRotationPoint(46, -20, 11).setRotationAngle(0, 0, 0).setName("Box 168cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 480, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, 0, -1, -1.25f)
				.setRotationPoint(46, -20, -12).setRotationAngle(0, 0, 0).setName("Box 168cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 75, 148, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 10, 0, 1, 0, 0, -1.75f, 0, 0, -3.25f, 0, 0, 2.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -2.25f, 0, 0, 1.5f, 0, 0)
				.setRotationPoint(77, 6.5f, 0).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 299, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.18f, 0, 0, -0.63f, 0, 0, -1.05f, 0, 0, 0.2f, 0, 0, -0.44f, 0, 0, -0.31f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74.5f, 3.5f, 7).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 23, 152, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.73f, 0, 0, -1.02f, 0, 0, 0.23f, 0, 0, -0.41f, 0, 0, -0.37f, 0, 0, -0.68f, 0, 0, 0, 0, 0)
				.setRotationPoint(75.32f, 3.5f, 2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 23, 152, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -1.89f, 0, 0, 1.04f, 0, 0)
				.setRotationPoint(75.34f, 2.5f, 2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 415, 143, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 10, 0, 2.5f, 0, 0, -3.25f, 0, 0, -1.75f, 0, 0, 1, 0, 0, 1.5f, 0, 0, -2.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(77, 6.5f, -10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 326, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, 1.04f, 0, 0, -1.89f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(75.34f, 2.5f, -10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 9, 0, 1.32f, 0, 0, -2.07f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0.9f, 0, -1, -1.65f, 0, -1, 0.25f, 0, 0, -1, 0, 0,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(77, 8.5f, -9).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 83, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.5f, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, -0.5f, -0.1f, -0.25f, -0.5f, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, -0.5f, -0.1f, -0.25f)
				.setRotationPoint(60, -22.5f, -2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 214, 149, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(60.25f, -22.5f, -0.1f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 235, 145, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
				.setRotationPoint(60.35f, -22.5f, -0.1f).setRotationAngle(0, 0, 0).setName("TopHeadlight_left")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 235, 140, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(60.25f, -22.5f, -1.9f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 505, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
				.setRotationPoint(60.35f, -22.5f, -1.9f).setRotationAngle(0, 0, 0).setName("TopHeadlight_right")
		);
		this.groups.add(SD70MACcb);
	}

	private final void initGroup_F40phcb(){
	}

	private final void initGroup_SD70Icb(){
		TurboList SD70Icb = new TurboList("SD70Icb");
		SD70Icb.add(new ModelRendererTurbo(SD70Icb, 507, 3, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-21, -21.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		SD70Icb.add(new ModelRendererTurbo(SD70Icb, 172, 160, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
				.setRotationPoint(-21, -22.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		SD70Icb.add(new ModelRendererTurbo(SD70Icb, 448, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-19, -23, -1).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		SD70Icb.add(new ModelRendererTurbo(SD70Icb, 349, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-20, -23, -2.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		this.groups.add(SD70Icb);
	}

	private final void initGroup_SD60MACcb(){
	}

	private final void initGroup_SD90MACcb(){
		TurboList SD90MACcb = new TurboList("SD90MACcb");
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 209, 245, textureX, textureY)
				.addShapeBox(0, 0, 0, 10, 1, 6, 0, 0, 0, 0, 1, 0, 0, -0.5f, 0, -0.5f, 1, 0, -0.5f, 0, -0.5f, 0, 1, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
				.setRotationPoint(60, -16, 0).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 310, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 11, 11, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -12, 0).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 281, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 11, 11, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -12, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 358, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0, 0, 0, -0.28f, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -0.27f, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -13, 1).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 328, 129, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-54, -22.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 487, 81, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-64, -22.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 477, 65, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-44, -22.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 202, 162, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-41, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 409, 156, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-41, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 177, 140, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-44, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 108, 140, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-44, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 0, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-38, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 134, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-38, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 134, 124, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-51, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 206, 120, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-51, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 446, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-54, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 151, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-54, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 55, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 55, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-48, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 498, 94, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-61, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 453, 94, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-61, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 208, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-64, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 0, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setRotationPoint(-64, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 498, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-58, -22.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 453, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-58, -22.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 19, 135, textureX, textureY).addBox(0, 0, 0, 12, 5, 1)
				.setRotationPoint(8, -21.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 421, 133, textureX, textureY).addBox(0, 0, 0, 12, 5, 1)
				.setRotationPoint(9, -15.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 96, 105, textureX, textureY).addBox(0, 0, 0, 12, 5, 1)
				.setRotationPoint(8, -21.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 242, 159, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 8, 4, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -3.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -3.5f)
				.setRotationPoint(-84, -21, 3).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 310, 273, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 2, 4, 0, 0, 0, -0.5f, -3.5f, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0, -0.5f, -3.5f, 0, -0.5f, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-85, -21, 3).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 42, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-85.5f, -17.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 185, 159, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 20, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-85, -21, 1).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 277, 277, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 2, 4, 0, -1, 0, 0, 0, 0, 0, -3.5f, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, 0, 0, 0, -3.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-85, -21, -7).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 57, 158, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 20, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-85, -21, -4).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 337, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-85.5f, -20.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 96, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-85.5f, -14.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 368, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-85.5f, -11.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 313, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-85.5f, -8.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 313, 25, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-85.5f, -5.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 260, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-84.5f, -22.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 326, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f)
				.setRotationPoint(-85.3f, -18.5f, -1).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 349, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
				.setRotationPoint(-85.45f, -18.75f, -1).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 411, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
				.setRotationPoint(-85.45f, -17.25f, -1).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 244, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
				.setRotationPoint(-85.55f, -17.25f, -1).setRotationAngle(0, 0, 0).setName("Rearlight_bottom")
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 505, 68, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
				.setRotationPoint(-85.55f, -18.75f, -1).setRotationAngle(0, 0, 0).setName("Rearlight_top")
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 276, 110, textureX, textureY).addBox(0, 0, 0, 24, 3, 1)
				.setRotationPoint(-33, 0, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 446, 109, textureX, textureY).addBox(0, 0, 0, 24, 1, 1)
				.setRotationPoint(-33, 1, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 276, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, 0, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 446, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(-33, 2, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 453, 86, textureX, textureY).addBox(0, 0, 0, 24, 1, 1)
				.setRotationPoint(-33, 1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 448, 35, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, 0, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 458, 21, textureX, textureY)
				.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, 2, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 88, 124, textureX, textureY).addBox(0, 0, 0, 17, 3, 1)
				.setRotationPoint(6, 0, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 419, 123, textureX, textureY).addBox(0, 0, 0, 17, 1, 1)
				.setRotationPoint(6, 1, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 382, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(6, 0, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 161, 123, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
				.setRotationPoint(6, 2, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 125, 121, textureX, textureY).addBox(0, 0, 0, 17, 1, 1)
				.setRotationPoint(6, 1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 88, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(6, 0, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 164, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(6, 2, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(3.25f, 0.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 336, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(3.5f, -0.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 0, 86, textureX, textureY).addBox(0, 0, 0, 5, 5, 1)
				.setRotationPoint(8, -6, 10).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 388, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(8, -12, 10).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 0, 49, textureX, textureY).addBox(0, 0, 0, 3, 3, 3)
				.setRotationPoint(10, -3.5f, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 11, 0, textureX, textureY).addBox(0, 0, 0, 2, 3, 3)
				.setRotationPoint(11.5f, -5.5f, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 319, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, -0.5f, -0.5f, 1, -0.5f, -0.5f, 1, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 1, 0, -0.5f, 1, 0, 0, 0, 0, 0)
				.setRotationPoint(-81, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 237, 54, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, -3, 5.5f, -0.5f, -3, 5.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -3, -6, -0.5f, -3, -6, 0, 0, 0, 0)
				.setRotationPoint(7, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(SD90MACcb);
	}

	private final void initGroup_SD90MACHcb(){
		TurboList SD90MACHcb = new TurboList("SD90MACHcb");
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 417, 156, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 2, -0.5f, 0, -1, -6, 0, -1, 0, 0, 0, 0, -2, -1.75f, -0.5f, 0, 0, -6, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(66, -14, 5).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 108, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 2, -0.5f, 1.5f, 0.25f, -0.5f, 0, -1, 0, 0, 2, -5.5f, -2, -2, -0.5f, 1.5f, 0, -0.5f, 0, 0, 0, 0, -3, -5.5f)
				.setRotationPoint(66, -14, 5).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 235, 126, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 6, 0, -1, 2, -0.5f, 0, 2, -0.5f, 0, 0, 0, 0, 0, 0, -2, -2, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -14, 5).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 494, 70, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, 0, -1, 0, 0, -1, -6, 0, 2, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -6, -2, -1.75f, -0.5f)
				.setRotationPoint(66, -14, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 495, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 2, -5.5f, 0, -1, 0, 1.5f, 0.25f, -0.5f, 0, 2, -0.5f, 0, -3, -5.5f, 0, 0, 0, 1.5f, 0, -0.5f, -2, -2, -0.5f)
				.setRotationPoint(66, -14, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 237, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 2, -0.5f, -1, 2, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2, -2, -0.5f)
				.setRotationPoint(58, -14, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 326, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, 7, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 154, 165, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 15, 4, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, -0.5f)
				.setRotationPoint(68.9f, -16, -4.7f).setRotationAngle(0, 16, 0)
		);
		this.groups.add(SD90MACHcb);
	}

	private final void initGroup_AC4400CWcb(){
		TurboList AC4400CWcb = new TurboList("AC4400CWcb");
		AC4400CWcb.add(new ModelRendererTurbo(AC4400CWcb, 367, 205, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-35, -10, 7).setRotationAngle(0, 0, 0)
		);
		AC4400CWcb.add(new ModelRendererTurbo(AC4400CWcb, 359, 210, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f)
				.setRotationPoint(-36, -11, 8).setRotationAngle(0, 0, 0)
		);
		this.groups.add(AC4400CWcb);
	}

}







