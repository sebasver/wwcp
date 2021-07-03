//FMT-Marker TiM-1.0
package wwcp.models.locomotives.diesels;

import fexcraft.fvtm.RollingStockModel;
import fexcraft.fvtm.TurboList;
import fexcraft.tmt.slim.ModelRendererTurbo;

/** This file was exported via the TiM Exporter V1.0 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
public class SD60MAC extends RollingStockModel {

	public SD60MAC(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		initGroup_group0();
		initGroup_clipboard();
		initGroup_M420cb();
		initGroup_RS18cb();
		initGroup_SD70MACcb();
		initGroup_F40phcb();
		initGroup_SD38cb();
	}

	private final void initGroup_group0(){
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 133, 1, 22)
				.setRotationPoint(-65, -1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 97, 42, textureX, textureY).addBox(0, 0, 0, 40, 22, 14)
				.setRotationPoint(4, -23, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 18, 97, textureX, textureY).addBox(0, 0, 0, 13, 7, 1)
				.setRotationPoint(44, -21, 10).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 140, 129, textureX, textureY).addBox(0, 0, 0, 1, 14, 4)
				.setRotationPoint(69.8f, -16, 0.8f).setRotationAngle(0, -15, 0)
		);
		this.groups.add(group0);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 46, textureX, textureY).addBox(0, 0, 0, 35, 22, 14)
				.setRotationPoint(-61, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 22, 7, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-69, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 110, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 22, 7)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setPolygonUV(2, new float[]{ 10.0f, 0.0f, 10.0f, 0.0f, 7.0f, 7.0f, 10.0f, 7.0f }).build()
				.setRotationPoint(-69, -23, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 91, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
				.setRotationPoint(-62, -22, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 89, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
				.setRotationPoint(-44, -22, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 105, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-49, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 104, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-59, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 103, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
				.setRotationPoint(-39, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 128, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-36, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 127, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-36, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-39, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 126, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
				.setRotationPoint(-39, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 126, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
				.setRotationPoint(-33, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 125, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-33, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 125, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-46, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 124, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-46, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 124, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-49, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 120, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
				.setRotationPoint(-49, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 114, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
				.setRotationPoint(-43, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 106, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-43, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 101, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-56, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 101, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
				.setRotationPoint(-56, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-59, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 96, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
				.setRotationPoint(-59, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 85, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(3, 1, 3)
				.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
				.setRotationPoint(-53, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(-53, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 60, textureX, textureY).addBox(0, 0, 0, 30, 21, 14)
				.setRotationPoint(-26, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 30, 1, 14, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-26, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY).addBox(0, 0, 0, 133, 1, 16)
				.setRotationPoint(-65, 0, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 67, textureX, textureY).addBox(0, 0, 0, 12, 5, 1)
				.setRotationPoint(14, -22.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 86, textureX, textureY).addBox(0, 0, 0, 8, 1, 12)
				.setRotationPoint(5, -24, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(5, -24, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(5, -24, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 3, textureX, textureY).addBox(0, 0, 0, 82, 1, 4)
				.setRotationPoint(-38, -2, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 89, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
				.setRotationPoint(-62, -22, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 89, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
				.setRotationPoint(-44, -22, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 100, textureX, textureY).addBox(0, 0, 0, 11, 4, 1)
				.setRotationPoint(27, -19, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 96, textureX, textureY).addBox(0, 0, 0, 2, 22, 14)
				.setRotationPoint(-66, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 222, 96, textureX, textureY).addBox(0, 0, 0, 3, 22, 13)
				.setRotationPoint(-64, -23, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 134, textureX, textureY).addBox(0, 0, 0, 3, 8, 1)
				.setRotationPoint(-64, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 134, textureX, textureY).addBox(0, 0, 0, 3, 8, 1)
				.setRotationPoint(-64, -9, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-64, -11, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 96, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-63, -13, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-63.5f, -13.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 119, textureX, textureY).addBox(0, 0, 0, 8, 14, 1)
				.setRotationPoint(16, -16, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 112, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(8, 14, 3)
				.setCorners(0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(1, new float[]{ 3.0f, 3.0f, 3.0f, 3.0f, 0.0f, 17.0f, 3.0f, 17.0f }).build()
				.setRotationPoint(16, -16, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(16, -17, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.36f, 0, 0, -0.36f, 0, 0, 0, 0, 0, 0, 0, 0, -0.57f, 0, 0, -0.57f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(16, -5, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 400, 122, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(23, -4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(16, -4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 24, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
				.setRotationPoint(19.5f, -4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(4, -24, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(4, -24, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 95, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(4, -24, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13, -24.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(24, -24.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(24, -24.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 253, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13, -24.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 472, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -1, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(24, -24.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 60, textureX, textureY).addBox(0, 0, 0, 12, 5, 1)
				.setRotationPoint(14, -22.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 99, textureX, textureY).addBox(0, 0, 0, 11, 4, 1)
				.setRotationPoint(27, -19, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 25, 1, 14, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13, -24, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(13, -24.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 42, textureX, textureY)
				.addShapeBox(0, 0, 0, 46, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-20, 1, 2).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 35, textureX, textureY)
				.addShapeBox(0, 0, 0, 46, 1, 9, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-20, 1, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 9, textureX, textureY).addBox(0, 0, 0, 46, 1, 4)
				.setRotationPoint(-20, 1, -2).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-19, 0, -11).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-19, 1, -11).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-19, 0, -10).setRotationAngle(0, 0, 0).setName("Box 64cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-19, 1, -10).setRotationAngle(0, 0, 0).setName("Box 65cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 133, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(23, 2, 8).setRotationAngle(25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 349, 133, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(23, 0.75f, -10.5f).setRotationAngle(-25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 138, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(24, -12, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 64, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -3, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -3, 0, 0, 2.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 2.5f, 0)
				.setRotationPoint(11.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 15, textureX, textureY)
				.addShapeBox(0, 0, 0, 48, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-36.5f, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(7, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 403, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-1, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-9, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-17, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-25, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-33, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-41, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -1.5f, 0, 0, 1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 1, 0)
				.setRotationPoint(-39.5f, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-66, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-49, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 309, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-57, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 304, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-64, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.5f, -0.5f, 0, -3, -0.5f, 0, -3, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 2.5f, -0.5f, 0, 2.5f, 0, 0, 0, 0)
				.setRotationPoint(24.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(28.5f, -10, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(32, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 105, 1, 1, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-66, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-49, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-64, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-57, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-41, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-33, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-25, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 137, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-17, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-9, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(-1, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(7, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(15, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(23, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(31, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(38, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 43, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(42.5f, -13, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1.5f, 1, 0, 0, -1, 0, -2, 3, 0, -2, 3, -0.5f, 0, -1, -0.5f, 0, 0, 0, -2, -4, 0, -2, -4, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(39.5f, -9.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(43, -12.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 133, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(41, -6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 67, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(42, -3, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 133, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(43, -5, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 79, textureX, textureY).addBox(0, 0, 0, 24, 13, 1)
				.setRotationPoint(44, -14, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 94, textureX, textureY).addBox(0, 0, 0, 13, 7, 1)
				.setRotationPoint(44, -21, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 46, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
				.setRotationPoint(-20, 5, 10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 18, textureX, textureY)
				.addShapeBox(0, 0, 0, 46, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-20, 5, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 86, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(14, 2, 4)
				.setCorners(0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(1, new float[]{ 4.0f, 4.0f, 0.0f, 6.0f, 0.0f, 6.0f, 4.0f, 6.0f })
				.setPolygonUV(0, new float[]{ 22.0f, 4.0f, 18.0f, 4.0f, 18.0f, 6.0f, 22.0f, 6.0f }).build()
				.setRotationPoint(44, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 42, textureX, textureY)
				.addShapeBox(0, 0, 0, 14, 2, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -23, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 14, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(48.5f, 1, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 14, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
				.setRotationPoint(-47.5f, 1, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 79, textureX, textureY).addBox(0, 0, 0, 1, 20, 17)
				.setRotationPoint(44, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 133, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(44, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 105, textureX, textureY).addBox(0, 0, 0, 8, 11, 4)
				.setRotationPoint(36, -13, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 129, textureX, textureY)
				.addShapeBox(-0.75f, 0, -0.5f, 1, 14, 4, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(43.75f, -21, -10.5f).setRotationAngle(0, 0, 0).setName("Door0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 129, textureX, textureY)
				.addShapeBox(-0.75f, 0, -0.5f, 1, 2, 4, 0, -0.75f, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(43.75f, -23, -10.5f).setRotationAngle(0, 0, 0).setName("Door1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 46, textureX, textureY).addBox(0, 0, 0, 10, 6, 4)
				.setRotationPoint(45, -7, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 122, textureX, textureY).addBox(0, 0, 0, 3, 3, 4)
				.setRotationPoint(55, -4, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 13, 122, textureX, textureY).addBox(0, 0, 0, 3, 9, 4)
				.setRotationPoint(57, -16, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 136, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(49, -11, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 42, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(47, -12, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 69, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
				.setRotationPoint(47, -17, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 136, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
				.setRotationPoint(49, -11, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 14, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
				.setRotationPoint(47, -12, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 63, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
				.setRotationPoint(47, -17, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 120, textureX, textureY).addBox(0, 0, 0, 3, 9, 4)
				.setRotationPoint(57, -16, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 128, textureX, textureY).addBox(0, 0, 0, 1, 8, 4)
				.setRotationPoint(57, -15, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 385, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 100, textureX, textureY).addBox(0, 0, 0, 4, 1, 8)
				.setRotationPoint(53, -15, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 500, 109, textureX, textureY).addBox(0, 0, 0, 4, 7, 1)
				.setRotationPoint(53, -14, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 313, 116, textureX, textureY)
				.addBox(0, 0, 0, 4, 1, 7, 0, 1f, new boolean[]{ false, false, false, false, false, true })
				.setRotationPoint(53, -14, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 97, textureX, textureY).addBox(0, 0, 0, 4, 9, 1)
				.setRotationPoint(53, -16, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(54, -15, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(55, -15, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(54, -15, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 81, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
				.setRotationPoint(54, -15, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 86, textureX, textureY).addBox(0, 0, 0, 6, 1, 12)
				.setRotationPoint(68, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 123, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 9, 5)
				.setCorners(0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 5.0f, 0.0f, 5.0f, 5.0f, 7.0f, 5.0f }).build()
				.setRotationPoint(68, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 122, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 9, 5)
				.setCorners(0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 4.0f, 0.0f, 5.0f, 5.0f, 6.0f, 5.0f }).build()
				.setRotationPoint(68, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 16, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 94, textureX, textureY).addBox(0, 0, 0, 1, 1, 16)
				.setRotationPoint(74.25f, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 115, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(75.25f, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(75.25f, -1, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 107, 122, textureX, textureY).addBox(0, 0, 0, 6, 8, 1)
				.setRotationPoint(68, 0, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 122, textureX, textureY).addBox(0, 0, 0, 6, 8, 1)
				.setRotationPoint(68, 0, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.9f, -0.5f, 0)
				.setRotationPoint(69, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(69, 1.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(69, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 406, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(69, 5.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 5, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0)
				.setRotationPoint(68, 7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 52, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 1, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, -0.9f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0)
				.setRotationPoint(69, -1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(69, 1.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 121, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(69, 3.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(69, 5.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 5, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0)
				.setRotationPoint(68, 7.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 340, 132, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
				.setRotationPoint(74.25f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(74.25f, 1.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 80, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(75.25f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 116, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(76.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 402, 110, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(77.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(76.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(78.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 61, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(78.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 104, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
				.setRotationPoint(76.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(68.75f, -3, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 3.5f, 0, -0.5f, 3.5f, 0, -0.5f, -4, -0.5f, -0.5f, -4, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(68.75f, -10.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(68.75f, -3, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(73.75f, 0, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 203, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
				.setRotationPoint(73.85f, 0, -5).setRotationAngle(0, 0, 0).setName("Ditchlight_right_low")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(73.75f, 0, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 119, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
				.setRotationPoint(73.85f, 0, 3).setRotationAngle(0, 0, 0).setName("Ditchlight_left_low")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(74, -9, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 136, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(74.75f, -9, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 305, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0.75f, -0.5f, 0.5f, -1.25f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0.75f, 0, 0.5f, -1.25f, 0, 0.5f)
				.setRotationPoint(74, -9, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 80, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
				.setRotationPoint(74, -9, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 178, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
				.setRotationPoint(73, 3, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 503, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(73, -1.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1.5f, 0, -4.5f, 1, 0, -4.5f, 1, 0, 4, -1.5f, 0, 4, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
				.setRotationPoint(73, -8, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(74, -9, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 475, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(74.75f, -9, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, -0.5f, 0.5f, 0.75f, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -1.25f, 0, 0.5f, 0.75f, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(74, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(74, -9, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 103, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73, 3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 470, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73, -1.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 465, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1.5f, 0, 4, 1, 0, 4, 1, 0, -4.5f, -1.5f, 0, -4.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(73, -8, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f)
				.setRotationPoint(74.75f, -9, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0)
				.setRotationPoint(74.75f, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 238, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(73.5f, 1.5f, -8).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 60, textureX, textureY).addBox(0, 0, 0, 6, 1, 12)
				.setRotationPoint(-71, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 229, 132, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
				.setRotationPoint(-72.25f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-72.25f, 1.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 63, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-73.25f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 421, 100, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-74.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 99, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
				.setRotationPoint(-75.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-76.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-76.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-74.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(-71.5f, 1.5f, -8).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 93, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-71.75f, 1.7f, -7.88f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 43, 132, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
				.setRotationPoint(-71.5f, 1.5f, 5).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
				.setRotationPoint(-71.75f, 1.7f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 122, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 9, 5)
				.setCorners(1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 5.0f, 0.0f, 5.0f, 5.0f, 7.0f, 5.0f }).build()
				.setRotationPoint(-66, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 118, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 9, 5)
				.setCorners(-0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0)
				.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 4.0f, 0.0f, 5.0f, 5.0f, 6.0f, 5.0f }).build()
				.setRotationPoint(-66, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 97, textureX, textureY).addBox(0, 0, 0, 6, 8, 1)
				.setRotationPoint(-71, 0, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 97, textureX, textureY).addBox(0, 0, 0, 6, 8, 1)
				.setRotationPoint(-71, 0, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 35, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-71, 1.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-71, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 99, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-71, 5.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 107, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 5, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-71, 7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 49, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(5, 1, 1)
				.setCorners(0, 0, 0, -0.9f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.9f, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0)
				.setPolygonUV(2, new float[]{ 4.8f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 5.1f, 1.0f }).build()
				.setRotationPoint(-71, -1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 33, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-71, 1.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 84, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-71, 3.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-71, 5.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 453, 101, textureX, textureY)
				.addShapeBox(0, 0, 0, 6, 1, 5, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(-71, 7.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 37, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(5, 1, 1)
				.setCorners(0, 0, 0, -1.2f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, -0.9f, -0.5f, 0, 0, -0.5f, 0)
				.setPolygonUV(2, new float[]{ 5.1f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 4.8f, 1.0f }).build()
				.setRotationPoint(-71, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-72, -9, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-72.75f, -9, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 211, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -1.25f, -0.5f, 0.5f, 0.75f, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -1.25f, 0, 0.5f, 0.75f, 0, 0.5f)
				.setRotationPoint(-72, -9, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 63, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(-72, -9, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 433, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
				.setRotationPoint(-71, 3, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 419, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-71, -1.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 1, 0, -4.5f, -1.5f, 0, -4.5f, -1.5f, 0, 4, 1, 0, 4, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(-71, -8, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-72, -9, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 135, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-72.75f, -9, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 202, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.75f, -0.5f, 0.5f, -1.25f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0.75f, 0, 0.5f, -1.25f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-72, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 62, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-72, -9, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 47, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-71, 3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 456, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-71, -1.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 1, 0, 4, -1.5f, 0, 4, -1.5f, 0, -4.5f, 1, 0, -4.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-71, -8, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 61, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f)
				.setRotationPoint(-72.75f, -9, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0)
				.setRotationPoint(-72.75f, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-66.5f, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 431, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(-66.5f, -8.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f)
				.setRotationPoint(-69.25f, -20, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 117, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-69.5f, -20, -0.1f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 116, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-69.6f, -20, -0.1f).setRotationAngle(0, 0, 0).setName("Lightrear_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-69.5f, -20, -1.9f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(-69.6f, -20, -1.9f).setRotationAngle(0, 0, 0).setName("Lightrear_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 160, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -21.75f, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -18.75f, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -15.75f, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -12.75f, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -9.75f, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(-68, -6.75f, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(26.25f, 0.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 367, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(26.5f, -0.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 59, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-21, -23.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 130, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
				.setRotationPoint(-21, -24.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 11, 0, 1, 0, 0, -1.75f, 0, 0, -3.25f, 0, 0, 2.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0, 0, -2.25f, 0, 0, 1.5f, 0, 0)
				.setRotationPoint(77, 5, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 28, 130, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.1f, 0, 0, -0.67f, 0, 0, -1.05f, 0, 0, 0.2f, 0, 0, -0.41f, 0, 0, -0.34f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74.5f, 3, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.73f, 0, 0, -1.11f, 0, 0, 0.33f, 0, 0, -0.41f, 0, 0, -0.34f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(75.32f, 3, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 9, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 9, 0, -0.25f, -0.75f, 0, -0.5f, -0.75f, 0, -0.5f, 0.25f, 0, -0.25f, 0.25f, 0, 0, 0, 0, -0.75f, 0, 0, -1.89f, 0, 0, 1.04f, 0, 0)
				.setRotationPoint(75.34f, 2, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1.75f, 0, 0, 1, 0, 0, 1, 0, -0.25f, -1.75f, 0, -0.25f)
				.setRotationPoint(73.75f, 3.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 129, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -1, 0, 0, -1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(74.75f, 5.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 102, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -1.25f, 0, 0, 0.5f, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(74.75f, 5.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 36, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 11, 0, 2.5f, 0, 0, -3.25f, 0, 0, -1.75f, 0, 0, 1, 0, 0, 1.5f, 0, 0, -2.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(77, 5, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 127, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.2f, 0, 0, -1.05f, 0, 0, -0.67f, 0, 0, -0.1f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.34f, 0, 0, -0.41f, 0, 0)
				.setRotationPoint(74.5f, 3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.33f, 0, 0, -1.11f, 0, 0, -0.73f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.34f, 0, 0, -0.41f, 0, 0)
				.setRotationPoint(75.32f, 3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 9, 0, -0.25f, 0.25f, 0, -0.5f, 0.25f, 0, -0.5f, -0.75f, 0, -0.25f, -0.75f, 0, 1.04f, 0, 0, -1.89f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(75.34f, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -1.75f, 0, -0.25f, 1, 0, -0.25f, 1, 0, 0, -1.75f, 0, 0)
				.setRotationPoint(73.75f, 3.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -1, 0, -0.75f, -1, 0)
				.setRotationPoint(74.75f, 5.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 78, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, -1.25f, 0, 0)
				.setRotationPoint(74.75f, 5.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 89, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(73.75f, 1.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 53, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(-67, -24, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 41, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(48.5f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 37, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(48.5f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 12, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-47.5f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 3, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
				.setRotationPoint(-47.5f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 106, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
				.setRotationPoint(-22, -25, -2).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 145, 105, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-20, -25, -2).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 471, 100, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
				.setRotationPoint(-20, -25, 0).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 350, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, 0, -1, 0.5f)
				.setRotationPoint(46, -21, 11).setRotationAngle(0, 0, 0).setName("Box 168cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 11, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, 0, -1, -1.25f)
				.setRotationPoint(46, -21, -12).setRotationAngle(0, 0, 0).setName("Box 168cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 125, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, 4, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 52, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, -2, -0.75f, 0, -2, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, 4, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 108, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -2, 0, 0, -2, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, 0, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, 6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 46, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
				.setRotationPoint(74, 6, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 11, 0, 1.5f, 0, 0, -2.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, 0.9f, 0, -1, -1.65f, 0, -1, 0.25f, 0, 0, -1, 0, 0,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(77, 8, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 11, 0, -0.5f, 0, 0, -0.25f, 0, 0, -2.25f, 0, 0, 1.5f, 0, 0, -1, 0, 0, 0.25f, 0, 0, -1.65f, 0, -1, 0.9f, 0, -1,
						new boolean[]{ false, false, false, true, false, false })
				.setRotationPoint(77, 8, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 16, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-72, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 91, textureX, textureY).addBox(0, 0, 0, 1, 1, 16)
				.setRotationPoint(-72.25f, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 73, 114, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-73.25f, -1, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
				.setRotationPoint(-73.25f, -1, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-72, 4, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.75f, 0, -2, 0, 0, -2, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-72, 0, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-72, 4, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 90, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 4, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -2, -0.75f, 0, -2, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-72, 0, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 42, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-72, 6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 42, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
				.setRotationPoint(-72, 6, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 97, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 12, 11, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -13, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 415, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 3, 12, 11, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 79, textureX, textureY).addBox(0, 0, 0, 24, 13, 1)
				.setRotationPoint(44, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 66, 89, textureX, textureY).addBox(0, 0, 0, 9, 16, 8)
				.setRotationPoint(60, -17, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 23, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -16, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 489, 111, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 8, 0, 2, 0, 0, -2, 0, 0, 0.18f, 0, 0, -0.5f, 0, 0, 2, -2, 0, -2, -2, 0, 0.18f, -2, 0, -0.5f, -2, 0)
				.setRotationPoint(59, -21, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 120, 94, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 3, 7, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(60, -17, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 93, textureX, textureY)
				.addShapeBox(0, 0, 0, 8, 3, 7, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(60, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 386, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 6, 0, 0, 0, 0, -0.32f, 0, 0, -0.32f, 0, 0, 0, 0, 0, 0, -2, 0, -0.32f, -2, 0, -0.32f, -2, 0, 0, -2, 0)
				.setRotationPoint(59.5f, -21, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 109, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 9, 8, 0, -0.5f, 0, 0, 0.18f, 0, 0, -2, 0, 0, 2, 0, 0, -0.5f, -2, 0, 0.18f, -2, 0, -2, -2, 0, 2, -2, 0)
				.setRotationPoint(59, -21, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 482, 125, textureX, textureY).addBox(0, 0, 0, 1, 8, 4)
				.setRotationPoint(57, -15, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 7, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0)
				.setRotationPoint(58, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 362, 112, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 3, 7, 0, -1.5f, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -17, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 204, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, -3, 0, -1, -3, 0, 0.91f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.91f, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 42, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(68.75f, -11, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -4, 0, -0.5f, -4, 0, -0.5f, 3.5f, -0.5f, -0.5f, 3.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
				.setRotationPoint(68.75f, -10.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 30, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
				.setRotationPoint(68.75f, -11, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 7, 0, 0, 0, 0, 0.9f, 0, 0, -1, -3, 0, 0, -3, 0, 0, 0, 0, 0.9f, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -17, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 242, 96, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.09f, 0, 0, 1, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.09f, -0.5f, 0, 1, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(69, -17, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 74, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, -0.09f, 0, 0, 0.725f, 0, 0, 0, 0, 0, 0, 0, 0, -0.09f, 0, 0, 0.725f, 0, 0, 0, 0, 0)
				.setRotationPoint(69, -16, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 73, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.09f, -0.5f, 0, 0.725f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.09f, 0, 0, 0.725f, 0, 0, 0, 0, 0)
				.setRotationPoint(69, -17, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 120, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, -1, 0, 0, 0.91f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.91f, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 91, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 1, 0, 0, -0.09f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 1, -0.5f, 0, -0.09f, -0.5f, 0, 0, -0.5f, 0)
				.setRotationPoint(69, -17, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0.725f, 0, 0, -0.09f, 0, 0, 0, 0, 0, 0, 0, 0, 0.725f, 0, 0, -0.09f, 0, 0, 0, 0, 0)
				.setRotationPoint(69, -16, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 42, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0.725f, -0.5f, 0, -0.09f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.725f, 0, 0, -0.09f, 0, 0, 0, 0, 0)
				.setRotationPoint(69, -17, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 34, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0.91f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0.91f, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(68, -14, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY).addBox(0, 0, 0, 1, 2, 5)
				.setRotationPoint(68.5f, -13.5f, 5.7f).setRotationAngle(0, -15, 0).setName("numberboard_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 15, textureX, textureY).addBox(0, 0, -4.5f, 1, 2, 5)
				.setRotationPoint(68.4f, -13.5f, -6.25f).setRotationAngle(0, 15, 0).setName("numberboard_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 388, 134, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -21, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 410, 110, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0)
				.setRotationPoint(57, -21, -11).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

	private final void initGroup_M420cb(){
		TurboList M420cb = new TurboList("M420cb");
		M420cb.add(new ModelRendererTurbo(M420cb, 289, 9, textureX, textureY).addBox(0, 0, 0, 46, 3, 22)
				.setRotationPoint(-20, 2, -11).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 279, 35, textureX, textureY).addBox(0, 0, 0, 46, 4, 20)
				.setRotationPoint(-20, 5, -10).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 397, 83, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, 0, 9).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 206, 57, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, 1, 9).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 462, 6, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-18, 0, 10).setRotationAngle(0, 0, 0).setName("Box 64")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 458, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(-18, 1, 10).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 0, 0, textureX, textureY)
				.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(15.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 294, 131, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 11, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(15, -12, 10.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(M420cb);
	}

	private final void initGroup_RS18cb(){
		TurboList RS18cb = new TurboList("RS18cb");
		RS18cb.add(new ModelRendererTurbo(RS18cb, 0, 42, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
				.setRotationPoint(73.5f, 1.5f, 5).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 392, 35, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, -0.75f, -0.5f, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
				.setRotationPoint(73.75f, 1.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		this.groups.add(RS18cb);
	}

	private final void initGroup_SD70MACcb(){
		TurboList SD70MACcb = new TurboList("SD70MACcb");
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 269, 49, textureX, textureY).addBox(0, 0, 0, 12, 4, 1)
				.setRotationPoint(26, -23, 6.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 283, 24, textureX, textureY).addBox(0, 0, 0, 12, 4, 1)
				.setRotationPoint(26, -23, -7.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 295, 76, textureX, textureY)
				.addBox(0, 0, 0, 23, 6, 8, 0, 1f, new boolean[]{ true, false, false, false, false, false })
				.setRotationPoint(45, -7, -10).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 206, 42, textureX, textureY).addBox(0, 0, 0, 23, 6, 8)
				.setRotationPoint(45, -7, 2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 360, 60, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0.09f, 0, 0, -1, -2, 0, 0, -2, 0, 0, 0, 0, 0.09f, 0, 0, -1, 0, 0, 0, 0, 0)
				.setRotationPoint(58, -23, 7).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 113, 112, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(2, 2, 7)
				.setCorners(0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0)
				.setPolygonUV(0, new float[]{ 16.0f, 7.0f, 9.0f, 7.0f, 9.0f, 9.0f, 16.0f, 9.0f })
				.setPolygonUV(2, new float[]{ 7.0f, 0.0f, 7.0f, 0.0f, 7.0f, 7.0f, 9.0f, 7.0f }).build()
				.setRotationPoint(59, -23, 0).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 86, 56, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(1, 2, 4)
				.setCorners(0, -2, 0, -1, -2, 0, 0.09f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.09f, 0, 0, 0, 0, 0)
				.setPolygonUV(0, new float[]{ 9.0f, 4.0f, 5.0f, 6.0f, 5.0f, 6.0f, 9.0f, 6.0f }).build()
				.setRotationPoint(58, -23, -11).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 94, 112, textureX, textureY).newBoxBuilder()
				.setOffset(0, 0, 0).setSize(2, 2, 7)
				.setCorners(0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0)
				.setPolygonUV(0, new float[]{ 16.0f, 7.0f, 9.0f, 7.0f, 9.0f, 9.0f, 16.0f, 9.0f })
				.setPolygonUV(2, new float[]{ 9.0f, 0.0f, 7.0f, 0.0f, 7.0f, 7.0f, 7.0f, 7.0f }).build()
				.setRotationPoint(59, -23, -7).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 45, 69, textureX, textureY)
				.addShapeBox(0, 0, 0, 17, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-39.5f, -24, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 350, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-38.5f, -25, -4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 491, 75, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-39.5f, -25, -4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 75, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-23.5f, -25, -4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 59, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-38.5f, -25, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 75, 53, textureX, textureY)
				.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-38.5f, -25, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 506, 29, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-39.5f, -25, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 27, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-39.5f, -25, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-23.5f, -25, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 507, 15, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -1, -1, -0.5f, -1, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
				.setRotationPoint(-23.5f, -25, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 93, 87, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
				.setRotationPoint(69.5f, -16.5f, -1).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 445, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f)
				.setRotationPoint(69.6f, -16.25f, -1).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 414, 86, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(70, -16.55f, -1).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 93, 82, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
				.setRotationPoint(70, -14.95f, -1).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 350, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(70.1f, -14.95f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_low")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 295, 76, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
				.setRotationPoint(70.1f, -16.55f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_high")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 16, 14, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(65, -16.75f, 5.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 301, 9, textureX, textureY)
				.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(70.15f, -16, -1).setRotationAngle(0, 15, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 289, 9, textureX, textureY)
				.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(70.15f, -12, -1).setRotationAngle(0, 15, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 12, 7, textureX, textureY)
				.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(70.15f, -8, -1).setRotationAngle(0, 15, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 7, textureX, textureY)
				.addShapeBox(0, 0, -3, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
				.setRotationPoint(70.15f, -4, -1).setRotationAngle(0, 15, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 14, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
				.setRotationPoint(65, -16.75f, -6.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 90, 71, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.75f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, -0.75f, 0.2f, -0.1f, -0.75f, 0.25f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f, -0.75f, 0.25f, -0.1f)
				.setRotationPoint(74.25f, -3.25f, -6).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 90, 66, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(74.65f, -3.55f, -6).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 75, 56, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
				.setRotationPoint(74.75f, -3.55f, -6).setRotationAngle(0, 0, 0).setName("Ditchlight_right")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 494, 34, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.75f, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, -0.75f, 0.2f, -0.1f, -0.75f, 0.25f, -0.1f, 0, 0.25f, -0.1f, 0, 0.25f, -0.1f, -0.75f, 0.25f, -0.1f)
				.setRotationPoint(74.25f, -3.25f, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 504, 32, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f)
				.setRotationPoint(74.65f, -3.55f, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 9, 24, textureX, textureY)
				.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, -0.5f, -0.35f, -0.35f)
				.setRotationPoint(74.75f, -3.55f, 4).setRotationAngle(0, 0, 0).setName("Ditchlight_left")
		);
		this.groups.add(SD70MACcb);
	}

	private final void initGroup_F40phcb(){
		TurboList F40phcb = new TurboList("F40phcb");
		F40phcb.add(new ModelRendererTurbo(F40phcb, 12, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, -0.25f, -0.2f, -0.2f, -0.25f, -0.2f, -0.2f, -0.25f, -0.2f, -0.2f, -0.25f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f)
				.setRotationPoint(49.5f, -23.5f, -1).setRotationAngle(0, 0, 0)
		);
		F40phcb.add(new ModelRendererTurbo(F40phcb, 0, 3, textureX, textureY)
				.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f)
				.setRotationPoint(49.5f, -24.25f, -1).setRotationAngle(0, 0, 0).setName("Beacon")
		);
		this.groups.add(F40phcb);
	}

	private final void initGroup_SD38cb(){
		TurboList SD38cb = new TurboList("SD38cb");
		SD38cb.add(new ModelRendererTurbo(SD38cb, 497, 60, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
				.setRotationPoint(-66.5f, -17.65f, -6.2f).setRotationAngle(0, -23, 0).setName("numberboard_back_right")
		);
		SD38cb.add(new ModelRendererTurbo(SD38cb, 0, 24, textureX, textureY).addBox(0, 0, 0, 1, 2, 6)
				.setRotationPoint(-68.8f, -17.65f, 0.7f).setRotationAngle(0, 23, 0).setName("numberboard_back_left")
		);
		this.groups.add(SD38cb);
	}

}
