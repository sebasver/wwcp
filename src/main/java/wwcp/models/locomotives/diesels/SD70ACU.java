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
			.setRotationPoint(-80, -2, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 339, 134, textureX, textureY).addBox(0, 0, 0, 13, 8, 1)
			.setRotationPoint(44, -22, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 43, textureX, textureY).addBox(0, 0, 0, 111, 17, 14)
			.setRotationPoint(-67, -19, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 243, 138, textureX, textureY).addBox(0, 0, 0, 9, 8, 4)
			.setRotationPoint(13, -10, 7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 355, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 14, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(52, -25, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 364, 148, textureX, textureY).addBox(0, 0, 0, 8, 2, 4)
			.setRotationPoint(-80, -7, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY).addBox(0, 0, 0, 148, 2, 16)
			.setRotationPoint(-80, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 1, 2).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 1, 9, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 1, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 75, textureX, textureY).addBox(0, 0, 0, 58, 1, 4)
			.setRotationPoint(-34, 1, -2).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 170, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-7, 2, 8).setRotationAngle(25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 170, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-7, 0.75f, -10.5f).setRotationAngle(-25, 0, 0)
		);
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
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 115, textureX, textureY).addBox(0, 0, 0, 24, 12, 1)
			.setRotationPoint(44, -14, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 133, textureX, textureY).addBox(0, 0, 0, 13, 8, 1)
			.setRotationPoint(44, -22, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 112, textureX, textureY).addBox(0, 0, 0, 24, 12, 1)
			.setRotationPoint(44, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-34, 7, 8).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 7, -10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 126, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(14, 2, 4)
			.setCorners(0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(1, new float[]{ 4.0f, 4.0f, 0.0f, 6.0f, 0.0f, 6.0f, 4.0f, 6.0f })
			.setPolygonUV(0, new float[]{ 22.0f, 4.0f, 18.0f, 4.0f, 18.0f, 6.0f, 22.0f, 6.0f }).build()
			.setRotationPoint(44, -24, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -24, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 155, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0.09f, 0, 0, -1, -2, 0, 0, -2, 0, 0, 0, 0, 0.09f, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(58, -24, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 155, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 7)
			.setCorners(0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 16.0f, 7.0f, 9.0f, 7.0f, 9.0f, 9.0f, 16.0f, 9.0f })
			.setPolygonUV(2, new float[]{ 7.0f, 0.0f, 7.0f, 0.0f, 7.0f, 7.0f, 9.0f, 7.0f }).build()
			.setRotationPoint(59, -24, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 2, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -24, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 138, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 4)
			.setCorners(0, -2, 0, -1, -2, 0, 0.09f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.09f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 9.0f, 4.0f, 5.0f, 6.0f, 5.0f, 6.0f, 9.0f, 6.0f }).build()
			.setRotationPoint(58, -24, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 155, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 7)
			.setCorners(0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 16.0f, 7.0f, 9.0f, 7.0f, 9.0f, 9.0f, 16.0f, 9.0f })
			.setPolygonUV(2, new float[]{ 9.0f, 0.0f, 7.0f, 0.0f, 7.0f, 7.0f, 7.0f, 7.0f }).build()
			.setRotationPoint(59, -24, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 151, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(48, 1, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 375, 140, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-61, 1, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 123, textureX, textureY).addBox(0, 0, 0, 1, 20, 17)
			.setRotationPoint(44, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 165, textureX, textureY)
			.addShapeBox(-1, 0, -0.5f, 1, 15, 4, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(44, -22, -10.5f).setRotationAngle(0, 0, 0).setName("Door0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 138, textureX, textureY)
			.addShapeBox(-1, 0, -0.5f, 1, 2, 4, 0, -0.75f, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(44, -24, -10.5f).setRotationAngle(0, 0, 0).setName("Door1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 164, textureX, textureY).addBox(0, 0, 0, 2, 3, 4)
			.setRotationPoint(55, -5, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 166, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(49, -12, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 155, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
			.setRotationPoint(47, -13, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 162, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
			.setRotationPoint(47, -18, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 159, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(49, -12, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 155, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
			.setRotationPoint(47, -13, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 162, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
			.setRotationPoint(47, -18, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 162, textureX, textureY).addBox(0, 0, 0, 3, 8, 4)
			.setRotationPoint(57, -15, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, -17, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 341, 161, textureX, textureY).addBox(0, 0, 0, 3, 9, 4)
			.setRotationPoint(57, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, -17, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 262, 145, textureX, textureY).addBox(0, 0, 0, 4, 1, 8)
			.setRotationPoint(53, -16, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 237, textureX, textureY).addBox(0, 0, 0, 3, 1, 4)
			.setRotationPoint(54, -15, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 334, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(53, -15, -4).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(56, -13, -4).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(54, -16, -4).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(53, -13, -4).setRotationAngle(90, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 126, textureX, textureY).addBox(0, 0, 0, 6, 1, 12)
			.setRotationPoint(68, -2, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 165, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 9, 4)
			.setCorners(0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 5.0f, 25.0f, 3.0f, 25.0f, 4.0f, 30.0f, 5.0f, 30.0f }).build()
			.setRotationPoint(68, -2, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.82f, 0, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.82f, -0.5f, 0)
			.setRotationPoint(69, -2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(69, 0, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(69, 2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 4, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -2.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0)
			.setRotationPoint(68, 6.5f, 6).setRotationAngle(0, 0, 0)
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
			.setRotationPoint(68.75f, -3, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 104, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.25f, 0, 3.5f, -0.25f, 0, 3.5f, -0.25f, 0, -4, -0.25f, 0, -4, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(68.75f, -9.5f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 177, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(68.75f, -3, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 116, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(67, -17.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 172, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
			.setRotationPoint(69.5f, -16.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f)
			.setRotationPoint(69.6f, -17.25f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(70, -17.55f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(70, -15.95f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(70.1f, -15.95f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_low")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(70.1f, -17.55f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_high")
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
			.setRotationPoint(75.75f, -4.55f, -6.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_right")
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
			.setRotationPoint(75.75f, -4.55f, 4.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_left")
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
			.setRotationPoint(-86.5f, 1.5f, -7).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-86.75f, 1.7f, -6.88f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86.5f, 1.5f, 4).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 167, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-86.75f, 1.7f, 4.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 139, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 9, 4)
			.setCorners(1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 5.0f, 0.0f, 5.0f, 5.0f, 7.0f, 5.0f }).build()
			.setRotationPoint(-81, -2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 124, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 9, 4)
			.setCorners(-0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 4.0f, 0.0f, 5.0f, 5.0f, 6.0f, 5.0f }).build()
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
			.setRotationPoint(69.75f, -17.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(69.75f, -13.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 435, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(69.75f, -9.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(69.75f, -5.5f, 1.8f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 154, 165, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 15, 4)
			.setPolygonUV(0, new float[]{ 9.0f, 4.75f, 5.0f, 4.75f, 5.0f, 19.25f, 9.0f, 19.25f })
			.setPolygonUV(5, new float[]{ 10.0f, 4.5f, 9.0f, 4.5f, 9.0f, 18.5f, 10.0f, 18.5f })
			.setPolygonUV(4, new float[]{ 2.0f, 1.5f, 1.0f, 1.5f, 1.0f, 15.5f, 2.0f, 15.5f }).build()
			.setRotationPoint(68.79f, -17.5f, -4.7f).setRotationAngle(0, 16, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -1.75f, 0, -0.25f, 1, 0, -0.25f, 1.5f, 0, 0, -2.25f, 0, 0)
			.setRotationPoint(73.75f, 3.2f, -7.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 166, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, -1.25f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.5f, -1, 0, -1.25f, -1, 0)
			.setRotationPoint(74.75f, 6.2f, -7.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0.5f, 0, 0, -1.25f, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(74.75f, 6.2f, -7.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
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
			.setRotationPoint(67, -17.5f, -7).setRotationAngle(0, 0, 0)
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
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-87, 0, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0, -1, 0, -0.75f, -1, 0)
			.setRotationPoint(-87, 7, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-87, 0, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, -1, 0, 0, -1, 0, -0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-87, 7, -9).setRotationAngle(0, 0, 0)
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
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 85, textureX, textureY).addBox(0, 0, 0, 44, 5, 14)
			.setRotationPoint(0, -24, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 46, textureX, textureY).addBox(0, 0, 0, 46, 4, 14)
			.setRotationPoint(-80, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 86, textureX, textureY).addBox(0, 0, 0, 34, 2, 14)
			.setRotationPoint(-34, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 34, 1, 14, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 49, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-84.5f, -24, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 161, textureX, textureY).addBox(0, 0, 0, 5, 21, 2)
			.setRotationPoint(-85, -23, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 100, textureX, textureY).addBox(0, 0, 0, 32, 1, 2)
			.setRotationPoint(-66, -23.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66, -23.25f, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4)
			.setRotationPoint(-66, -20.75f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-66, -22.25f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 39, textureX, textureY).addBox(0, 0, 0, 32, 1, 2)
			.setRotationPoint(-66, -23.25f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66, -23.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 6, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, 0, -4, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-66, -20.75f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-66, -22.25f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(74, -1, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 138, 176, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(74, -1, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 16, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
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
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f, 0, 0.25f, -0.1f)
			.setRotationPoint(-88.25f, -4.25f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-88.6f, -4.55f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 42, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-88.75f, -4.55f, -6.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_right_back")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f, -0.5f, 0.25f, -0.1f, 0, 0.25f, -0.1f)
			.setRotationPoint(-88.25f, -4.25f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-88.6f, -4.55f, 4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-88.75f, -4.55f, 4.5f).setRotationAngle(0, 0, 0).setName("Ditchlight_left_back")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 70, textureX, textureY).addBox(0, 0, 0, 58, 2, 16)
			.setRotationPoint(-34, 7, -8).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-34, 4, 10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 58, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, 4, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
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
		clipboard.add(new ModelRendererTurbo(clipboard, 490, 175, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(25.5f, -14.5f, -11.5f).setRotationAngle(0, 0, 0)
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
		clipboard.add(new ModelRendererTurbo(clipboard, 458, 3, textureX, textureY).addBox(0, 0, 0, 22, 13, 4)
			.setRotationPoint(22, -15, 7).setRotationAngle(0, 0, 0)
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
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(12.5f, -16.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -17, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 174, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(20.5f, -16.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(33, -21.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(22, -22, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(42, -21.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(21.5f, -13, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 46, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-20, -23.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 440, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
			.setRotationPoint(-22, -24, -1).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -2.25f, 0, 0, 1.5f, 0, 0, 1, 0, -0.25f, -1.75f, 0, -0.25f)
			.setRotationPoint(73.75f, 3.2f, 4.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, 0, 0, 0.5f, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1.25f, -1, 0, 0.5f, -1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(74.75f, 6.2f, 4.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, 0, 0, 0.5f, 0, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -1.5f, 0, 0, 0.5f, 0, 0, 0, 0, -0.25f, -1, 0, -0.25f)
			.setRotationPoint(74.75f, 6.2f, 4.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 235, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(74.25f, -1, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(74.25f, -1, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 110, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-79, -23.25f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-66, -23.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 32, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-66, -23.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 246, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-83, -23.25f, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -4, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, -4)
			.setRotationPoint(-83, -23.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 4, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -4, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-83, -23.25f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 137, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-77, -23.75f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 163, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-74, -23.75f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 163, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-74, -23.75f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 163, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-77, -23.75f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 306, 162, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-77, -23.75f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 162, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-71, -23.75f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 259, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-71, -23.75f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-88.25f, -1, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-88.25f, -1, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
			.setRotationPoint(68, 5.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
			.setRotationPoint(68, 3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
			.setRotationPoint(68, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f)
			.setRotationPoint(68, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.82f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -0.82f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0)
			.setRotationPoint(69, -2, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1.2f, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -1.2f, -0.5f, 0)
			.setRotationPoint(69, 0, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1.2f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -1.2f, -0.5f, 0)
			.setRotationPoint(69, 2, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0)
			.setRotationPoint(69, 4, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 4, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -2.2f, -0.5f, 0)
			.setRotationPoint(68, 6.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 492, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0)
			.setRotationPoint(68, 5.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0)
			.setRotationPoint(68, 3, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0)
			.setRotationPoint(68, 1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0)
			.setRotationPoint(68, -1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -0.82f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.82f, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86, -2, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -1.2f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86, 0, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -1.2f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86, 2, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 459, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86, 4, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 4, 0, 0, 0, 0, -0.7f, 0, 0, -2.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0, -2.2f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86, 6.5f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86, 5.5f, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86, 3, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86, 1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.7f, 0, -0.5f, -2.2f, 0, 0, 0, 0, 0)
			.setRotationPoint(-86, -1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, -1.2f, 0, 0, -0.82f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, -0.82f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86, -2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-86, 0, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-86, 2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86, 4, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 4, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -2.2f, -0.5f, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-86, 6.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86, 5.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86, 3, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -2.2f, 0, 0, -0.7f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-86, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 11, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, -1, 0, 3, -1, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(57, -22, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 11, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0, 0, -1, 0, 0, -1, 0, 3, -1, 0, -3, -1, 0)
			.setRotationPoint(57, -22, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 96, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, -15, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 96, textureX, textureY).addBox(0, 0, 0, 11, 1, 1)
			.setRotationPoint(57, -15, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 86, textureX, textureY).addBox(0, 0, 0, 6, 1, 11)
			.setRotationPoint(63, -17.5f, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 180, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0, 0, 0, -3, 0, 0, -0.28f, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -0.27f, 0, 0, 0, 0, 0)
			.setRotationPoint(68, -15, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 194, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 5)
			.setCorners(0, 0, -0.5f, -0.5f, 0, -0.5f, 0.73f, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.72f, 0.5f, 0, 0, 0.5f, 0)
			.setPolygonUV(0, new float[]{ 122.0f, 199.0f })
			.setPolygonUV(2, new float[]{ 9.0f, 12.0f, -1.800003f, 12.0f, -0.5999985f, 16.600006f, 9.0f, 16.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(69, -17.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 129, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(8, 1, 6)
			.setCorners(1, 0, -0.5f, 1.5f, 0, -0.5f, 3, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 1.5f, -0.5f, -0.5f, 3, -0.5f, 0, 0, -0.5f, 0)
			.setPolygonUV(2, new float[]{ 13.0f, 0.0f, 3.4f, 0.0f, 3.4f, 5.0f, 13.0f, 5.0f }).build()
			.setRotationPoint(60, -18, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, -22, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(57, -22, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 164, textureX, textureY).addBox(0, 0, 0, 1, 15, 4)
			.setRotationPoint(59, -17, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.25f, 0, -4, -0.25f, 0, -4, -0.25f, 0, 3.5f, -0.25f, 0, 3.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(68.75f, -9.5f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 14, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -25, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 317, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(30.5f, -14.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 173, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(37.5f, -14.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 172, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(42.5f, -14.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20, -24, 0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20, -23.75f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 171, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20, -23.75f, -3.75f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
			.setRotationPoint(-23, -24, 0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 143, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-21, -23.5f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 46, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-22, -23.5f, 0.75f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 168, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20, -24, -1.75f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 165, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20, -24, -0.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, -0.5f, 0, 0, -0.25f, 0, 0, -2.07f, 0, 0, 1.32f, 0, 0, -1, 0, 0, 0.25f, 0, 0, -1.65f, 0, -1, 0.9f, 0, -1,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(77, 8, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(74.25f, -1, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-88.25f, -1, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 272, 129, textureX, textureY).addBox(0, 0, 0, 6, 4, 2)
			.setRotationPoint(29, -22, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(29, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 170, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(24, -21.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(21, -21.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 120, textureX, textureY).addBox(0, 0, 0, 18, 5, 1)
			.setRotationPoint(25, -14, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 119, textureX, textureY).addBox(0, 0, 0, 18, 5, 1)
			.setRotationPoint(25, -8, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 319, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -13.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.5f, -0.1f, 0, 0, -0.1f, 0, -1.5f, -0.1f, 0, 1, -0.1f, 0, -0.5f, -0.1f, 0, 0, -0.1f, 0, -1.5f, -0.1f, 0, 1, -0.1f, 0)
			.setRotationPoint(60, -24.5f, 1.75f).setRotationAngle(0, 0, 0).setName("Numberboard_Top_Left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 1, -0.1f, 0, -1.5f, -0.1f, 0, 0, -0.1f, 0, -0.5f, -0.1f, 0, 1, -0.1f, 0, -1.5f, -0.1f, 0, 0, -0.1f, 0, -0.5f, -0.1f, 0)
			.setRotationPoint(60, -24.5f, -5.75f).setRotationAngle(0, 0, 0).setName("Numberboard_Top_Right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(22, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(25, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(34, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(43, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 46, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 4, 1.25f)
			.setCorners(0, 0, 0, 3, 0, 0, 2.73f, 0, -0.25f, 0, 0, 0, 0, -0.5f, 0, 3, -0.5f, 0, 2.73f, -0.5f, -0.25f, 0, -0.5f, 0)
			.setPolygonUV(2, new float[]{ 13.0f, 0.0f, 5.0f, 0.0f, 5.0f, 5.0f, 13.0f, 5.0f }).build()
			.setRotationPoint(67, -17.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 43, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 4, 1.25f)
			.setCorners(0, 0, 0, 2.73f, 0, -0.25f, 3, 0, 0, 0, 0, 0, 0, -0.5f, 0, 2.73f, -0.5f, -0.25f, 3, -0.5f, 0, 0, -0.5f, 0)
			.setPolygonUV(2, new float[]{ 13.0f, 0.0f, 5.0f, 0.0f, 5.0f, 5.0f, 13.0f, 5.0f }).build()
			.setRotationPoint(67, -17.5f, -1.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-87, 7, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 104, textureX, textureY).addBox(0, 0, 0, 13, 4, 14)
			.setRotationPoint(-80, -19, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 102, textureX, textureY).addBox(0, 0, 0, 13, 3, 14)
			.setRotationPoint(-80, -5, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 10, 1, 0, 0, 0, 0, -13, 0, 0, -13, 0, -1, 0, 0, -1, 0, 0, 0, -13, 0, 0, -13, 0, -1, 0, 0, -1)
			.setRotationPoint(-80, -15, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 4, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -3.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -3.5f)
			.setRotationPoint(-84, -9, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 60, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 6, 4, 0, -0.5f, 0, -0.5f, -7.5f, 0, -0.5f, -4, 0, 0, -0.5f, 0, -3.5f, -0.5f, 0, -0.5f, -7.5f, 0, -0.5f, -4, 0, 0, -0.5f, 0, -3.5f)
			.setRotationPoint(-84, -15, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 10, 4, 0, -0.5f, 0, -0.5f, -4, 0, -0.5f, -4, 0, 0, -0.5f, 0, -3.5f, -0.5f, 0, -0.5f, -4, 0, -0.5f, -4, 0, 0, -0.5f, 0, -3.5f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-83.5f, -15, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 10, 4, 0, -0.5f, 0, -3.5f, -4, 0, 0, -4, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -3.5f, -4, 0, 0, -4, 0, -0.5f, -0.5f, 0, -0.5f,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(-83.5f, -15, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 276, 155, textureX, textureY).addBox(0, 0, 0, 1, 17, 7)
			.setRotationPoint(-80.5f, -19, -3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 160, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 4, 0, -0.5f, 0, -3.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -3.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-84, -9, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 376, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 4, 0, -0.5f, 0, -3.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -3.5f, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-84, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 193, textureX, textureY)
			.addShapeBox(0, 0, -0.75f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-65.5f, -20.45f, 10.95f).setRotationAngle(-33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 144, textureX, textureY)
			.addShapeBox(0, 0, -0.75f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-55, -20.45f, 10.95f).setRotationAngle(-33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 143, textureX, textureY)
			.addShapeBox(0, 0, -0.75f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.55f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-44.5f, -20.45f, 10.95f).setRotationAngle(-33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-66, -23.5f, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 149, 142, textureX, textureY)
			.addShapeBox(0, 0, -0.25f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-65.5f, -20.45f, -10.95f).setRotationAngle(33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 142, textureX, textureY)
			.addShapeBox(0, 0, -0.25f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-55, -20.45f, -10.95f).setRotationAngle(33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 140, textureX, textureY)
			.addShapeBox(0, 0, -0.25f, 11, 7, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-44.5f, -20.45f, -10.95f).setRotationAngle(33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 153, textureX, textureY)
			.addShapeBox(0, 0, -1, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
			.setRotationPoint(-65.5f, -20.45f, 10.85f).setRotationAngle(-33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 152, textureX, textureY)
			.addShapeBox(0, 0, -1, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
			.setRotationPoint(-55, -20.45f, 10.85f).setRotationAngle(-33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 152, textureX, textureY)
			.addShapeBox(0, 0, -1, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
			.setRotationPoint(-44.5f, -20.45f, 10.85f).setRotationAngle(-33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 151, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
			.setRotationPoint(-65.5f, -20.45f, -10.85f).setRotationAngle(33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 150, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
			.setRotationPoint(-55, -20.45f, -10.85f).setRotationAngle(33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 7, 1, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.01f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0, -0.01f, -0.6f, 0)
			.setRotationPoint(-44.5f, -20.45f, -10.85f).setRotationAngle(33.3f, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY).addBox(0, 0, 0, 3, 2, 4)
			.setRotationPoint(-75, -9, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.75f, -1, 0, 0, -1, 0)
			.setRotationPoint(74, 7, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1, 0, -0.75f, -1, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(74, 7, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(74, 7, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-87, 6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 11, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-81, -10, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 336, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-81, -10, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 153, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0.2f, 0, 0, -1.05f, 0, 0, -0.63f, 0, 0, -0.18f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.31f, 0, 0, -0.44f, 0, 0)
			.setRotationPoint(74.5f, 3, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 154, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0.23f, 0, 0, -1.02f, 0, 0, -0.73f, 0, 0, 0, 0, 0, 0, 0, 0, -0.68f, 0, 0, -0.37f, 0, 0, -0.41f, 0, 0)
			.setRotationPoint(75.32f, 3, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 209, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 6, 4, 0, -0.5f, 0, -3.5f, -4, 0, 0, -7.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -3.5f, -4, 0, 0, -7.5f, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-84, -15, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 10, 1, 0, 0, 0, -1, -13, 0, -1, -13, 0, 0, 0, 0, 0, 0, 0, -1, -13, 0, -1, -13, 0, 0, 0, 0, 0)
			.setRotationPoint(-80, -15, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 194, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 5)
			.setCorners(0, 0, 0, 0.73f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0.72f, 0.5f, 0, -0.5f, 0.5f, -0.5f, 0, 0.5f, -0.5f)
			.setPolygonUV(0, new float[]{ 122.0f, 199.0f })
			.setPolygonUV(2, new float[]{ 9.0f, 12.0f, -1.800003f, 12.0f, -0.5999985f, 16.600006f, 9.0f, 16.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(69, -17.5f, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 68, 205, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 9, 4)
			.setCorners(0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 5.0f, -10.0f, 3.0f, -10.0f, 4.0f, -5.0f, 5.0f, -5.0f }).build()
			.setRotationPoint(68, -2, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 165, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 6, 8, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(45, -8, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 356, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 23, 6, 8, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -8, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 133, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 6, 4, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -8, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 139, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, -17, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 480, 161, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, -17, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -15, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 10, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(53, -17, -3).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_M420cb(){
		TurboList M420cb = new TurboList("M420cb");
		M420cb.add(new ModelRendererTurbo(M420cb, 319, 3, textureX, textureY).addBox(0, 0, 0, 58, 2, 22)
			.setRotationPoint(-34, 2, -11).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 251, 46, textureX, textureY).addBox(0, 0, 0, 58, 3, 20)
			.setRotationPoint(-34, 4, -10).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		this.groups.add(M420cb);
	}

	private final void initGroup_RS18cb(){
	}

	private final void initGroup_SD70MACcb(){
		TurboList SD70MACcb = new TurboList("SD70MACcb");
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 197, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
			.setRotationPoint(73.5f, 1.5f, -7).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 375, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(73.75f, 1.2f, -7.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 328, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
			.setRotationPoint(73.5f, 1.5f, 4).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 96, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.75f, -0.5f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(73.75f, 1.2f, 4.12f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 16, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
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
			.setRotationPoint(46, -22, 11).setRotationAngle(0, 0, 0).setName("Box 168cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 480, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, 0, -1, -1.25f)
			.setRotationPoint(46, -22, -12).setRotationAngle(0, 0, 0).setName("Box 168cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 75, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, 1, 0, 0, -1.75f, 0, 0, -3.25f, 0, 0, 2.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -2.25f, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(77, 6, 0).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 299, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -0.18f, 0, 0, -0.63f, 0, 0, -1.05f, 0, 0, 0.2f, 0, 0, -0.44f, 0, 0, -0.31f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(74.5f, 3, 7).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 23, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, 0, -0.73f, 0, 0, -1.02f, 0, 0, 0.23f, 0, 0, -0.41f, 0, 0, -0.37f, 0, 0, -0.68f, 0, 0, 0, 0, 0)
			.setRotationPoint(75.32f, 3, 2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 23, 152, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -1.89f, 0, 0, 1.04f, 0, 0)
			.setRotationPoint(75.34f, 2, 2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 415, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, 2.5f, 0, 0, -3.25f, 0, 0, -1.75f, 0, 0, 1, 0, 0, 1.5f, 0, 0, -2.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(77, 6, -10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 326, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, 1.04f, 0, 0, -1.89f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(75.34f, 2, -10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 1.32f, 0, 0, -2.07f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0.9f, 0, -1, -1.65f, 0, -1, 0.25f, 0, 0, -1, 0, 0,
				new boolean[]{ false, false, false, true, false, false })
			.setRotationPoint(77, 8, -9).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 83, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.5f, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, -0.5f, -0.1f, -0.25f, -0.5f, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, -0.5f, -0.1f, -0.25f)
			.setRotationPoint(60, -24.5f, -2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 214, 149, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(60.25f, -24.5f, -0.1f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 235, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
			.setRotationPoint(60.35f, -24.5f, -0.1f).setRotationAngle(0, 0, 0).setName("TopHeadlight_left")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 235, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
			.setRotationPoint(60.25f, -24.5f, -1.9f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 505, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
			.setRotationPoint(60.35f, -24.5f, -1.9f).setRotationAngle(0, 0, 0).setName("TopHeadlight_right")
		);
		this.groups.add(SD70MACcb);
	}

	private final void initGroup_F40phcb(){
	}

	private final void initGroup_SD70Icb(){
		TurboList SD70Icb = new TurboList("SD70Icb");
		SD70Icb.add(new ModelRendererTurbo(SD70Icb, 507, 3, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-21, -22.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		SD70Icb.add(new ModelRendererTurbo(SD70Icb, 172, 160, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
			.setRotationPoint(-21, -23.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		SD70Icb.add(new ModelRendererTurbo(SD70Icb, 448, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-19, -24, -1).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		SD70Icb.add(new ModelRendererTurbo(SD70Icb, 349, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20, -24, -2.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		this.groups.add(SD70Icb);
	}

	private final void initGroup_SD60MACcb(){
	}

	private final void initGroup_SD90MACcb(){
		TurboList SD90MACcb = new TurboList("SD90MACcb");
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 19, 127, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(8, 1, 6)
			.setCorners(0, 0, 0, 3, 0, 0, 1.5f, 0, -0.5f, 1, 0, -0.5f, 0, -0.5f, 0, 3, -0.5f, 0, 1.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setPolygonUV(2, new float[]{ 13.0f, 0.0f, 3.4f, 0.0f, 3.4f, 5.0f, 13.0f, 5.0f }).build()
			.setRotationPoint(60, -18, 0).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 310, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 12, 11, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(68, -14, 0).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 281, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 12, 11, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(68, -14, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 358, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0, 0, 0, -0.28f, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -0.27f, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(68, -15, 1).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 328, 129, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-54, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 487, 81, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-64, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 477, 65, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-44, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 202, 162, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-41, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 409, 156, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-41, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 177, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-44, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 108, 140, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-44, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 0, 137, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-38, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 134, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-38, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 134, 124, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-51, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 206, 120, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-51, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 446, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-54, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 151, 111, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-54, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 55, 110, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-48, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 55, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 498, 94, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-61, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 453, 94, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-61, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 208, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 0, 93, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-64, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 498, 89, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-58, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 453, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 19, 135, textureX, textureY).addBox(0, 0, 0, 12, 5, 1)
			.setRotationPoint(8, -23.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 421, 133, textureX, textureY).addBox(0, 0, 0, 12, 5, 1)
			.setRotationPoint(8, -17.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 96, 105, textureX, textureY).addBox(0, 0, 0, 12, 5, 1)
			.setRotationPoint(8, -23.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 242, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 4, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -3.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -3.5f)
			.setRotationPoint(-84, -23, 3).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 327, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 4, 0, 0, 0, -0.5f, -3.5f, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0, -0.5f, -3.5f, 0, -0.5f, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-85, -23, 3).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 42, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.5f, -20, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 185, 159, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 21, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-85, -23, 1).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 251, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 4, 0, -1, 0, 0, 0, 0, 0, -3.5f, 0, -0.5f, 0, 0, -0.5f, -1, 0, 0, 0, 0, 0, -3.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-85, -23, -7).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 57, 158, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 21, 3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-85, -23, -4).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 337, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.5f, -23, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 96, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.5f, -17, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 368, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.5f, -14, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 313, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.5f, -11, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 313, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-85.5f, -8, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 260, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-84.5f, -24, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 326, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f)
			.setRotationPoint(-85.3f, -21, -1).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 349, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
			.setRotationPoint(-85.45f, -21.25f, -1).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 411, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
			.setRotationPoint(-85.45f, -19.75f, -1).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 244, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-85.55f, -19.75f, -1).setRotationAngle(0, 0, 0).setName("Rearlight_bottom")
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 505, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(-85.55f, -21.25f, -1).setRotationAngle(0, 0, 0).setName("Rearlight_top")
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 276, 110, textureX, textureY).addBox(0, 0, 0, 24, 3, 1)
			.setRotationPoint(-33, -1, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 446, 109, textureX, textureY).addBox(0, 0, 0, 24, 1, 1)
			.setRotationPoint(-33, 0, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 276, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -1, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 446, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(-33, 1, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 453, 86, textureX, textureY).addBox(0, 0, 0, 24, 1, 1)
			.setRotationPoint(-33, 0, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 448, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 458, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, 1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 88, 124, textureX, textureY).addBox(0, 0, 0, 17, 3, 1)
			.setRotationPoint(6, -1, -10).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 419, 123, textureX, textureY).addBox(0, 0, 0, 17, 1, 1)
			.setRotationPoint(6, 0, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 382, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6, -1, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 161, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0)
			.setRotationPoint(6, 1, -9).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 125, 121, textureX, textureY).addBox(0, 0, 0, 17, 1, 1)
			.setRotationPoint(6, 0, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 88, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6, -1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 164, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6, 1, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(3.25f, -0.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 336, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(3.5f, -1.5f, -11.25f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 0, 86, textureX, textureY).addBox(0, 0, 0, 5, 5, 1)
			.setRotationPoint(8, -7, 10).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 388, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 6, 1, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, -13, 10).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 0, 49, textureX, textureY).addBox(0, 0, 0, 3, 3, 3)
			.setRotationPoint(10, -4.5f, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 11, 0, textureX, textureY).addBox(0, 0, 0, 2, 3, 3)
			.setRotationPoint(11.5f, -7.5f, 7).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 319, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 87, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-81, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD90MACcb.add(new ModelRendererTurbo(SD90MACcb, 237, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.5f, -0.5f, -3, 6.5f, -0.5f, -3, 6.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -3, -7, -0.5f, -3, -7, 0, 0, 0, 0)
			.setRotationPoint(6, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(SD90MACcb);
	}

	private final void initGroup_SD90MACHcb(){
		TurboList SD90MACHcb = new TurboList("SD90MACHcb");
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 417, 156, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 2, -0.5f, 0, -1, -6, 0, -1, 0, 0, 0, 0, -2, -2, -0.5f, 0, 0, -6, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(66, -16, 5).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 108, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 2, -0.5f, 1.5f, 0.5f, -0.5f, 0, -1, 0, 0, 2, -5.5f, -2, -2, -0.5f, 1.5f, 0, -0.5f, 0, 0, 0, 0, -3, -5.5f)
			.setRotationPoint(66, -16, 5).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 235, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 6, 0, -1, 2, -0.5f, 0, 2, -0.5f, 0, 0, 0, 0, 0, 0, -2, -2, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58, -16, 5).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 494, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, 0, -1, 0, 0, -1, -6, 0, 2, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -6, -2, -2, -0.5f)
			.setRotationPoint(66, -16, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 495, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 2, -5.5f, 0, -1, 0, 1.5f, 0.5f, -0.5f, 0, 2, -0.5f, 0, -3, -5.5f, 0, 0, 0, 1.5f, 0, -0.5f, -2, -2, -0.5f)
			.setRotationPoint(66, -16, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 237, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 2, -0.5f, -1, 2, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -2, -2, -0.5f)
			.setRotationPoint(58, -16, -11).setRotationAngle(0, 0, 0)
		);
		SD90MACHcb.add(new ModelRendererTurbo(SD90MACHcb, 326, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 20, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(74, 6, -10).setRotationAngle(0, 0, 0)
		);
		this.groups.add(SD90MACHcb);
	}

	private final void initGroup_AC4400CWcb(){
		TurboList AC4400CWcb = new TurboList("AC4400CWcb");
		AC4400CWcb.add(new ModelRendererTurbo(AC4400CWcb, 367, 205, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-35, -11, 7).setRotationAngle(0, 0, 0)
		);
		AC4400CWcb.add(new ModelRendererTurbo(AC4400CWcb, 359, 210, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f)
			.setRotationPoint(-36, -12, 8).setRotationAngle(0, 0, 0)
		);
		this.groups.add(AC4400CWcb);
	}

}
