//FMT-Marker TiM-1.0
package wwcp.models.locomotives.diesels;

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
public class F40ph extends RollingStockModel {

	public F40ph(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 113, 1, 22)
			.setRotationPoint(-58, -1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 249, 15, textureX, textureY).addBox(0, 0, 0, 83, 19, 22)
			.setRotationPoint(-52, -20, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 94, 106, textureX, textureY).addBox(0, 0, 0, 4, 12, 1)
			.setRotationPoint(31, -20, 10).setRotationAngle(0, 0, 0).setName("Door_left")
		);
		group0.add(new ModelRendererTurbo(group0, 134, 112, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(56, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 249, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 112, 2, 12, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-57, 0, -6).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 21, 104, textureX, textureY).addBox(0, 0, 0, 1, 2, 5)
			.setRotationPoint(46, -22.25f, 1).setRotationAngle(0, -10, 0).setName("numberboard_left")
		);
		group0.add(new ModelRendererTurbo(group0, 436, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(46.25f, -22.25f, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 389, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.75f, -21.25f, 7.25f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 323, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(46.1f, -23, -1).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 59, 106, textureX, textureY).addBox(0, 0, 0, 7, 2, 7)
			.setRotationPoint(36, -24.5f, -3.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 306, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(46, -22.45f, -0.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 333, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.5f, -23.5f, 5.5f).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 371, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16, -24, -2).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 247, 115, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(32, -23.5f, 3).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 116, 126, textureX, textureY).addBox(0, 0, 0, 2, 22, 6)
			.setRotationPoint(-55, -23, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 19, 4, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -20, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY).addBox(0, 0, 0, 84, 3, 14)
			.setRotationPoint(-53, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 83, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-55, -23, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 106, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 3, 4)
			.setCorners(0.5f, 0, 0, 0, 0, 0, 0, -3, 0, -1, -3, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setPolygonUV(1, new float[]{ 4.0f, 4.0f, 0.0f, 7.0f, 0.0f, 7.0f, 4.0f, 7.0f }).build()
			.setRotationPoint(-53, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 83, 3, 4, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -23, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 102, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 3, 4)
			.setCorners(-1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 10.0f, 4.0f, 6.0f, 4.0f, 6.0f, 7.0f, 10.0f, 7.0f })
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 4.0f, 0.0f, 4.0f, 4.0f, 6.0f, 4.0f }).build()
			.setRotationPoint(-55, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, -1, -3, 0, 0, -3, 0, 0, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-53, -23, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 37, textureX, textureY).addBox(0, 0, 0, 16, 7, 20)
			.setRotationPoint(31, -8, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 92, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
			.setRotationPoint(31, -8, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 90, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
			.setRotationPoint(31, -5, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 76, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(31, -2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 15, textureX, textureY).addBox(0, 0, 0, 14, 1, 14)
			.setRotationPoint(31, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, -2, 0, 0, -2, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(31, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 335, 119, textureX, textureY).addBox(0, 0, 0, 9, 5, 1)
			.setRotationPoint(35, -20, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 117, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 5, 1)
			.setCorners(0, 0, 0, -1.82f, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(5, new float[]{ 6.0f, 1.0f, 6.0f, 1.0f, 4.0f, 6.0f, 6.0f, 6.0f })
			.setPolygonUV(4, new float[]{ 3.0f, 1.0f, 2.0f, 1.0f, 1.0f, 6.0f, 3.0f, 6.0f }).build()
			.setRotationPoint(44, -20, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 14, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -15, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0, 0, -0.27f, 0, 0, -1, -3, 0, 0, -3, 0, 0, 0, 0, -0.27f, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 83, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(9, 1, 11)
			.setCorners(-1.67f, 0, 0, -7.33f, 0, 0, -2, -2, 0, 0, -1, 0, -2, 0, 0, -7.33f, -1, 0, -2, 1, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 20.0f, 0.0f, 11.0f, 0.0f, 11.0f, 11.0f, 11.0f, 11.0f }).build()
			.setRotationPoint(47, -16, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 83, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(9, 1, 11)
			.setCorners(-1.67f, 0, 0, 0.5f, -0.5f, 0, -2, -2, 0, -7, -2, 0, -2, 0, 0, 0.5f, -0.5f, 0, -2, 1, 0, -7, 1, 0)
			.setPolygonUV(2, new float[]{ 20.0f, 0.0f, 20.0f, 0.0f, 11.0f, 11.0f, 20.0f, 11.0f }).build()
			.setRotationPoint(47, -16, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -14, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -15, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54, -14, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 104, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 3, 4)
			.setCorners(0, -3, 0, -1, -3, 0, -0.27f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.27f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 9.0f, 4.0f, 5.0f, 7.0f, 5.0f, 7.0f, 9.0f, 7.0f }).build()
			.setRotationPoint(45, -23, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 11, 0, 0, -1, 0, -2, -2, 0, -7.33f, 0, 0, -1.67f, 0, 0, 0, 0, 0, -2, 1, 0, -7.33f, -1, 0, -2, 0, 0)
			.setRotationPoint(47, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 11, 0, -7, -2, 0, -2, -2, 0, 0.5f, -0.5f, 0, -1.67f, 0, 0, -7, 1, 0, -2, 1, 0, 0.5f, -0.5f, 0, -2, 0, 0)
			.setRotationPoint(47, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 13, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -15, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, -2, 0, 0, -0.87f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -2, -0.5f, 0, -0.8f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.87f, 0, 0, -0.31f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, 0, -0.2f, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, 0, -1.31f, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, -1.2f, 0, 0, 0.1f, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -1, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 22, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(54, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
			.setRotationPoint(55.75f, -13.5f, -0.5f).setRotationAngle(0, 0, 0).setName("headlight_top")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 468, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f)
			.setRotationPoint(55.75f, -13.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
			.setRotationPoint(55.75f, -12, -0.5f).setRotationAngle(0, 0, 0).setName("headlight_bottom")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 382, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f)
			.setRotationPoint(55.75f, -12, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 119, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 1)
			.setCorners(0, 0, 0, 0, 0, 0, -0.23f, -0.1375f, 0, 0, -0.2f, 0, 0, -0.25f, 0, 0.12f, -0.25f, 0, -0.06f, -0.25f, 0, 0, -0.25f, 0)
			.setPolygonUV(0, new float[]{ 3.0f, 1.75f, 2.0f, 1.55f, 2.0f, 3.35f, 3.0f, 3.35f }).build()
			.setRotationPoint(55.5f, -15.5f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 132, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 10, 1)
			.setCorners(1, -0.3f, 0, -0.4f, -0.3f, 0, -0.73f, -0.3f, 0, 0, -0.3f, 0, 0, 0, 0, 0.6f, 0, 0, 0.32f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 3.0f, 1.36f, 2.0f, 1.36f, 2.0f, 11.0f, 3.0f, 11.0f }).build()
			.setRotationPoint(56.5f, -11, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 120, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 3, 1)
			.setCorners(0, 0.05f, -0.8f, -0.33f, 0.05f, -0.8f, -0.36f, 0.05f, 0, 0, 0.05f, 0, 0, 0, -0.8f, 0.035f, 0, -0.8f, -0.03f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 3.0f, 1.35f, 2.0f, 1.35f, 2.0f, 4.37f, 3.0f, 4.37f }).build()
			.setRotationPoint(55.8f, -13.7f, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 76, 126, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 13, 10)
			.setCorners(0, -1, 0, 0.27f, -0.6375f, 0, -2, -2, 0, 1, -2, 0, -1, 0, 0, 1.6f, 0, 0, -1.155f, 0, 0, 0.155f, 0, 0)
			.setPolygonUV(0, new float[]{ 21.0f, 12.0f, 11.0f, 10.75f, 11.0f, 23.0f, 21.0f, 23.0f }).build()
			.setRotationPoint(55, -16, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 1, -0.5f, 0, 0.765f, -0.5f, 0, -2.04f, -0.5f, 0, 1.04f, -0.5f, 0, -1, 0, 0, 0.82f, 0, 0, -2, 0, 0, 1, 0, 0)
			.setRotationPoint(56, -2, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 155, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
			.setRotationPoint(54.5f, -2.75f, 8.9f).setRotationAngle(0, 0, 0).setName("Ditchlight_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f)
			.setRotationPoint(54.5f, -2.75f, 8.9f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 141, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 7.5f)
			.setCorners(0, 0, 0, 0.1f, 0, 0, -1.965f, 0, 0, 0.6f, 0, 0, 0, -0.5f, 0, 0.265f, -0.5f, 0, -1.835f, -0.5f, 0, 0.6f, -0.5f, 0)
			.setPolygonUV(0, new float[]{ 12.5f, 18.0f, 5.0f, 18.0f, 5.0f, 19.5f, 12.5f, 19.5f }).build()
			.setRotationPoint(55.5f, -3, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 208, 119, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 1)
			.setCorners(0, 0, 0, 0.04f, 0, -0.3f, -0.155f, 0, 0, 0, 0, -0.1f, 0, -0.5f, 0, 0.16f, -0.5f, -0.3f, -0.04f, -0.5f, 0, 0, -0.5f, -0.1f)
			.setPolygonUV(0, new float[]{ 3.0f, 1.0f, 2.0f, 1.0f, 2.0f, 2.5f, 3.0f, 2.5f }).build()
			.setRotationPoint(54, -3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.1f, -3, 8.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 83, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
			.setRotationPoint(54.5f, -2.75f, -9.9f).setRotationAngle(0, 0, 0).setName("Ditchlight_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f)
			.setRotationPoint(54.5f, -2.75f, -9.9f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.1f, -3, -10.3f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 234, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 3, 4, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(31, -23, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 105, textureX, textureY).addBox(0, 0, 0, 4, 12, 1)
			.setRotationPoint(31, -20, -11).setRotationAngle(0, 0, 0).setName("Door_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 89, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
			.setRotationPoint(31, -8, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 77, textureX, textureY).addBox(0, 0, 0, 4, 2, 1)
			.setRotationPoint(31, -5, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 76, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(31, -2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 72, textureX, textureY).addBox(0, 0, 0, 9, 5, 1)
			.setRotationPoint(35, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 5, 1)
			.setCorners(0, 0, 0, -2, 0, 0, -1.82f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.2f, 0, 0, 0, 0, 0)
			.setPolygonUV(5, new float[]{ 6.0f, 1.0f, 5.0f, 1.0f, 4.0f, 6.0f, 6.0f, 6.0f }).build()
			.setRotationPoint(44, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 12, 14, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -15, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 13, 1, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54, -14, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 280, 125, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 15, 10)
			.setCorners(0, -1, 0, 0.27f, -0.6375f, 0, -2, -2, 0, 1, -2, 0, -1, 0, 0, 1.82f, 0, 0, -1, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 21.0f, 10.0f, 11.0f, 8.75f, 11.0f, 23.0f, 21.0f, 23.0f }).build()
			.setRotationPoint(55, -16, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 346, 119, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 4, 11)
			.setCorners(0, 0, 0, 0, 0, 0, -2, 0, 0, 2, 0, 0, -1.4f, -0.5f, 0, 1.4f, -0.5f, 0, -0.6f, -0.5f, 0, 0.6f, -0.5f, 0)
			.setPolygonUV(1, new float[]{ 11.0f, 11.5f, 0.0f, 11.5f, 0.0f, 15.0f, 11.0f, 15.0f })
			.setPolygonUV(0, new float[]{ 23.0f, 11.5f, 12.0f, 11.5f, 12.0f, 15.0f, 23.0f, 15.0f }).build()
			.setRotationPoint(46, -20, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 119, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 11)
			.setCorners(-1.4f, -0.5f, 0, 1.4f, -0.5f, 0, -0.6f, -0.5f, 0, 0.6f, -0.5f, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(1, new float[]{ 11.0f, 12.0f, 0.0f, 10.0f, 0.0f, 13.0f, 11.0f, 15.0f })
			.setPolygonUV(0, new float[]{ 23.0f, 10.0f, 12.0f, 12.0f, 12.0f, 15.0f, 23.0f, 13.0f }).build()
			.setRotationPoint(46, -17, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 117, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 4, 11)
			.setCorners(2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0.6f, -0.5f, 0, -0.6f, -0.5f, 0, 1.4f, -0.5f, 0, -1.4f, -0.5f, 0)
			.setPolygonUV(1, new float[]{ 11.0f, 11.5f, 0.0f, 11.5f, 0.0f, 15.0f, 11.0f, 15.0f })
			.setPolygonUV(0, new float[]{ 23.0f, 11.5f, 12.0f, 11.5f, 12.0f, 15.0f, 23.0f, 15.0f }).build()
			.setRotationPoint(46, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 11)
			.setCorners(0.6f, -0.5f, 0, -0.6f, -0.5f, 0, 1.4f, -0.5f, 0, -1.4f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0)
			.setPolygonUV(1, new float[]{ 11.0f, 10.0f, 0.0f, 12.0f, 0.0f, 15.0f, 11.0f, 13.0f })
			.setPolygonUV(0, new float[]{ 23.0f, 12.0f, 12.0f, 10.0f, 12.0f, 13.0f, 23.0f, 15.0f }).build()
			.setRotationPoint(46, -17, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 116, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(58, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 191, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(59, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 219, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(57, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 51, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 82, textureX, textureY).addBox(0, 0, 0, 2, 7, 20)
			.setRotationPoint(45, -15, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -16, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 116, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(38, -12, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 65, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
			.setRotationPoint(36, -13, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 101, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
			.setRotationPoint(36, -18, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 7, 2, 0, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -4, 0, 0, 0, 0, 0, 0, 0, 0, 4)
			.setRotationPoint(39, -15, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 116, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(40, -14, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 115, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(43, -11, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 114, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(40, -11, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 91, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(42, -13, -4.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 116, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(38, -12, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 58, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
			.setRotationPoint(36, -13, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 99, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
			.setRotationPoint(36, -18, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 2)
			.setRotationPoint(39, -17, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 257, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, -1, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -16, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 113, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(32, 1.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 113, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-37, 1.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 81, textureX, textureY).addBox(0, 0, 0, 6, 6, 18)
			.setRotationPoint(10, 2, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 124, textureX, textureY).addBox(0, 0, 0, 1, 1, 10)
			.setRotationPoint(-59, -1, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 401, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.27f, 0, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.27f, -0.5f, 0)
			.setRotationPoint(-59, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.28f, 0, 0, 0, 0, 0, 0, 0, 0, 0.09f, 0, 0, -0.27f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0.09f, 0, 0)
			.setRotationPoint(-59, -1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, -0.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-60, -1, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -0.27f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.27f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0)
			.setRotationPoint(-59, -1, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0.09f, 0, 0, 0, 0, 0, 0, 0, 0, -0.28f, 0, 0, 0.09f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.27f, -0.5f, 0)
			.setRotationPoint(-59, -1, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.91f, 0, 0)
			.setRotationPoint(-60, -1, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 22, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, 6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, 6, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 96, textureX, textureY).addBox(0, 0, 0, 1, 2, 5)
			.setRotationPoint(-58, 6, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, 5, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 5, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, 5, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 90, textureX, textureY).addBox(0, 0, 0, 1, 2, 5)
			.setRotationPoint(-58, 6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 87, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-58, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 107, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-59, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 104, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-60, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-61, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-61, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -19, 4).setRotationAngle(0, 20, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -16, 4).setRotationAngle(0, 20, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -13, 4).setRotationAngle(0, 20, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -10, 4).setRotationAngle(0, 20, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 383, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -7, 4).setRotationAngle(0, 20, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 74, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-56.75f, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 474, 73, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-56.75f, 4.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 73, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-56.75f, 7, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 225, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.75f, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-56.75f, 0, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -1, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.75f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, -1, 0, 0, -1, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-52.75f, 0, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 73, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-56.75f, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 72, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-56.75f, 4.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 71, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(-56.75f, 7, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.75f, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 8, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-56.75f, 0, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -1, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.75f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -1, 0, -0.75f, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-52.75f, 0, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, 9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 32, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.5f, 1, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0,
				new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(-57.5f, 1, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.5f, -8.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.5f, -8.5f, -12.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -8.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -9.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.1f, -16, -6.5f).setRotationAngle(0, -20, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-54.1f, -7, -6.5f).setRotationAngle(0, -20, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f)
			.setRotationPoint(-53.3f, -20, 8.1f).setRotationAngle(0, 20, 0).setName("Left_rear_markerlight")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f, 0, -0.45f, -0.45f)
			.setRotationPoint(-52.6f, -20, -10).setRotationAngle(0, -20, 0).setName("Right_rear_markerlight")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 86, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-58, 0.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 85, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-58, 0.5f, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 477, 84, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-58, 0.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 84, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-58, 0.5f, -9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, -1.63f, 0, 0, 0, 0, 0, 0, 0, 0, -0.87f, 0, 0, -1.63f, 0, 0, 0, 0, 0, 0, 0, 0, -0.87f, 0, 0)
			.setRotationPoint(-54, -20, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.63f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.63f, 0, 0)
			.setRotationPoint(-53, -20, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 133, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 19, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.63f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.63f, 0, 0)
			.setRotationPoint(-54.13f, -20, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 380, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 2, 0, -1.63f, 0, 0, 0, 0, 0, 0, 0, 0, -0.87f, 0, 0, -1.63f, 0, 0, 0, 0, 0, 0, 0, 0, -0.87f, 0, 0)
			.setRotationPoint(-54, -15, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 19, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.5f, 0, 0)
			.setRotationPoint(-55, -20, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, -0.87f, 0, 0, 0, 0, 0, 0, 0, 0, -1.63f, 0, 0, -0.87f, 0, 0, 0, 0, 0, 0, 0, 0, -1.63f, 0, 0)
			.setRotationPoint(-54, -20, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 15, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 19, 1, 0, -0.63f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.63f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-53, -20, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 19, 1, 0, -0.63f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.63f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-54.13f, -20, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 14, 2, 0, -0.87f, 0, 0, 0, 0, 0, 0, 0, 0, -1.63f, 0, 0, -0.87f, 0, 0, 0, 0, 0, 0, 0, 0, -1.63f, 0, 0)
			.setRotationPoint(-54, -15, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 84, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-53, -15.5f, 8.5f).setRotationAngle(0, 0, -45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.87f, -1, 0, 0, 0, 0, 0, 0, 0, -1.63f, -1, 0, -0.87f, 0, 0, 0, 0, 0, 0, 0, 0, -1.63f, 0, 0)
			.setRotationPoint(-54, -16, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 83, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-53, -15.5f, -9.5f).setRotationAngle(0, 0, -45)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 128, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -1.63f, -1, 0, 0, 0, 0, 0, 0, 0, -0.87f, -1, 0, -1.63f, 0, 0, 0, 0, 0, 0, 0, 0, -0.87f, 0, 0)
			.setRotationPoint(-54, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 291, 57, textureX, textureY).addBox(0, 0, 0, 9, 2, 22)
			.setRotationPoint(-1, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 118, 58, textureX, textureY).addBox(0, 0, 0, 9, 2, 20)
			.setRotationPoint(-1, 4, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-1, 4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 79, textureX, textureY).addBox(0, 0, 0, 9, 2, 16)
			.setRotationPoint(-1, 6, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 244, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-1, 6, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 81, textureX, textureY).addBox(0, 0, 0, 6, 6, 18)
			.setRotationPoint(-17, 2, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 70, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(50.75f, 3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 487, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(49.75f, 3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(49.75f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 463, 67, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(50.75f, 6, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 42, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(50.75f, 3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 449, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(49.75f, 3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 286, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(49.75f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 34, textureX, textureY).addBox(0, 0, 0, 4, 1, 1)
			.setRotationPoint(50.75f, 6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(30.5f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(34.5f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(31.5f, 0, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, 2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 464, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, 6, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 72, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-37, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 70, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-37, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 220, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(30.5f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(34.5f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 445, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(31.5f, 0, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, 2.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 170, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, 6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50, -14, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50, -10, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 364, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50, -6, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(50, -2, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50, -14, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50, -10, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 99, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50, -6, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(50, -2, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 10, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 5, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(30.5f, -18.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(35, -18.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(30.5f, -18.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -14.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 1, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(8.5f, -14.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(9.5f, 0, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.5f, 2.5f, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 46, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.5f, 6, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(9.5f, 1.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(9.5f, 4.5f, 10.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 277, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(8.5f, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 258, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, 2, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 129, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, -2, 0, 0, 1.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, -2.75f, 0, 0, 2, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(55, 5, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -1.42f, 0, 0, 0.67f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1.42f, 0, 0, 0.67f, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(54.25f, 3, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 237, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -1.07f, 0, 0, 0.32f, 0, 0, -0.02f, 0, 0, -0.73f, 0, 0, -1.07f, 0, 0, 0.32f, 0, 0, -0.02f, 0, 0, -0.73f, 0, 0)
			.setRotationPoint(55.6f, 3, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 460, 123, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, -4.75f, -0.5f, 0, 4, -0.5f, 0, 1, 0, 0, -1.75f, 0, 0, -2.43f, 0, 0, 1.67f, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(54.25f, 1, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 122, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 15, 10)
			.setCorners(1, -2, 0, -2, -2, 0, 0.27f, -0.6375f, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 1.82f, 0, 0, -1, 0, 0)
			.setPolygonUV(0, new float[]{ 21.0f, 8.75f, 11.0f, 10.0f, 11.0f, 23.0f, 21.0f, 23.0f }).build()
			.setRotationPoint(55, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 450, 118, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 10, 1)
			.setCorners(1, -0.3f, 0, -0.73f, -0.3f, 0, -0.4f, -0.3f, 0, 1, -0.3f, 0, 0, 0, 0, 0.32f, 0, 0, 0.6f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 3.0f, 1.36f, 2.0f, 1.36f, 2.0f, 11.0f, 3.0f, 11.0f }).build()
			.setRotationPoint(56.5f, -11, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 265, 92, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 3, 1)
			.setCorners(0, 0.05f, 0, -0.36f, 0.05f, 0, -0.33f, 0.05f, -0.8f, 0, 0.05f, -0.8f, 0, 0, 0, -0.03f, 0, 0, 0.035f, 0, -0.8f, 0, 0, -0.8f)
			.setPolygonUV(0, new float[]{ 3.0f, 1.35f, 2.0f, 1.35f, 2.0f, 4.37f, 3.0f, 4.37f }).build()
			.setRotationPoint(55.8f, -13.7f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 90, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 1)
			.setCorners(0, -0.2f, 0, -0.23f, -0.1375f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.06f, -0.25f, 0, 0.12f, -0.25f, 0, 0, -0.25f, 0)
			.setPolygonUV(0, new float[]{ 3.0f, 1.55f, 2.0f, 1.75f, 2.0f, 3.35f, 3.0f, 3.35f }).build()
			.setRotationPoint(55.5f, -15.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 159, 122, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 1, 10)
			.setCorners(1.04f, -0.5f, 0, -2.04f, -0.5f, 0, 0.765f, -0.5f, 0, 1, -0.5f, 0, 1, 0, 0, -2, 0, 0, 0.82f, 0, 0, -1, 0, 0)
			.setPolygonUV(0, new float[]{ 21.0f, 10.0f, 11.0f, 10.0f, 11.0f, 11.0f, 21.0f, 11.0f }).build()
			.setRotationPoint(56, -2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 41, 90, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 1)
			.setCorners(0, 0, -0.1f, -0.155f, 0, 0, 0.04f, 0, -0.3f, 0, 0, 0, 0, -0.5f, -0.1f, -0.04f, -0.5f, 0, 0.16f, -0.5f, -0.3f, 0, -0.5f, 0)
			.setPolygonUV(0, new float[]{ 3.0f, 1.0f, 2.0f, 1.0f, 2.0f, 2.5f, 3.0f, 2.5f }).build()
			.setRotationPoint(54, -3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 121, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 13, 10)
			.setCorners(1, -2, 0, -2, -2, 0, 0.27f, -0.6375f, 0, 0, -1, 0, 0.155f, 0, 0, -1.155f, 0, 0, 1.6f, 0, 0, -1, 0, 0)
			.setPolygonUV(0, new float[]{ 21.0f, 10.75f, 11.0f, 12.0f, 11.0f, 23.0f, 21.0f, 23.0f }).build()
			.setRotationPoint(55, -16, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.5f, -13.75f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 64, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 7.5f)
			.setCorners(0.6f, 0, 0, -1.965f, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0.6f, -0.5f, 0, -1.835f, -0.5f, 0, 0.265f, -0.5f, 0, 0, -0.5f, 0)
			.setPolygonUV(0, new float[]{ 16.0f, 7.0f, 8.5f, 7.0f, 8.5f, 8.5f, 16.0f, 8.5f }).build()
			.setRotationPoint(55.5f, -3, -8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, -0.87f, 0, 0, -2, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.8f, -0.5f, 0, -2, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55, -1, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.31f, 0, 0, -0.87f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.8f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55, -1, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, 0, 0.1f, 0, 0, -1.31f, 0, 0, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, -1.2f, 0, 0, 0, 0, 0)
			.setRotationPoint(55, -1, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 153, 112, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(55, 3, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 368, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 12, 0, 0, 0, 0, -0.75f, 0, 0, 1.25f, 0, 0, -2, 0, 0, -0.75f, 0, 0, 0, 0, 0, 2, 0, 0, -2.75f, 0, 0)
			.setRotationPoint(55, 5, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.75f, 0, 0, 0, 0, 0, 0.67f, 0, 0, -1.42f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0.67f, 0, 0, -1.42f, 0, 0)
			.setRotationPoint(54.25f, 3, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, -0.73f, 0, 0, -0.02f, 0, 0, 0.32f, 0, 0, -1.07f, 0, 0, -0.73f, 0, 0, -0.02f, 0, 0, 0.32f, 0, 0, -1.07f, 0, 0)
			.setRotationPoint(55.6f, 3, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 10, 0, -1.75f, 0, 0, 1, 0, 0, 4, -0.5f, 0, -4.75f, -0.5f, 0, -0.75f, 0, 0, 0, 0, 0, 1.67f, 0, 0, -2.43f, 0, 0)
			.setRotationPoint(54.25f, 1, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
			.setRotationPoint(54.25f, 1, -7.5f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 318, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
			.setRotationPoint(54.25f, 1, 4.5f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.5f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, -0.5f, 0, -0.25f, -2.25f, 0, 0, 1.5f, 0, 0, 1, 0, -0.25f, -1.75f, 0, -0.25f)
			.setRotationPoint(54.5f, 1.2f, 4.62f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 113, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, -0.5f, 0, 0, -1.75f, 0, -0.25f, 1, 0, -0.25f, 1.5f, 0, 0, -2.25f, 0, 0)
			.setRotationPoint(54.5f, 1.2f, -7.62f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -24, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 86, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-38, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 87, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-35, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 87, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-35, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 85, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-38, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 84, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-32, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 83, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-28, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 82, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-25, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 82, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-25, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 371, 80, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-28, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 79, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-22, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-22, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 80, textureX, textureY).addBox(0, 0, 0, 9, 2, 3)
			.setRotationPoint(-11, -24.25f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 72, textureX, textureY).addBox(0, 0, 0, 3, 2, 3)
			.setRotationPoint(-8, -24.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 71, textureX, textureY).addBox(0, 0, 0, 3, 2, 3)
			.setRotationPoint(-8, -24.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, -24.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 65, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 2, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-11, -24.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 65, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 2, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-5, -24.25f, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, -24.25f, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5f, -24, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5f, -24, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 54, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, -24, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 10, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, -24, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5f, -24, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, -24, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, 0, 0, 0, 0, 0, -1.27f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.27f, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -22, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 7, 0, 0, 0, 0, -1.27f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.27f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, -1.27f, 0, 0, -0.54f, 0, 0, 0, 0, 0, 0, 0, 0, -1.27f, 0, 0, -0.54f, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.5f, 0, -0.54f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.54f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -23, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, -0.54f, 0, 0, -1.27f, 0, 0, 0, 0, 0, 0, 0, 0, -0.54f, 0, 0, -1.27f, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -23, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.54f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.54f, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -23, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 373, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(46.5f, -24.75f, -2.2f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(46.5f, -24.75f, 0.2f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 97, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(15, 0.75f, -10.5f).setRotationAngle(-25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 328, 95, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(15, 2, 8).setRotationAngle(25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, 0, -11).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, 1, -11).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9.5f, 0, -10).setRotationAngle(0, 0, 0).setName("Box 64cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-9.5f, 1, -10).setRotationAngle(0, 0, 0).setName("Box 65cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(8.5f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(12.5f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, 0, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, 1, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 226, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, 0, 9.5f).setRotationAngle(0, 0, 0).setName("Box 64cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 183, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-14.5f, 1, 9.5f).setRotationAngle(0, 0, 0).setName("Box 65cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 80, textureX, textureY).addBox(0, 0, 0, 8, 2, 16)
			.setRotationPoint(-15, 3, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 99, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
			.setRotationPoint(-10, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 417, 98, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
			.setRotationPoint(-10, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 182, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-8, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 476, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-8, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-11, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 96, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
			.setRotationPoint(-14, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 96, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
			.setRotationPoint(-14, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-15, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(-12, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 247, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-15, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 58, textureX, textureY).addBox(0, 0, 0, 4, 2, 16)
			.setRotationPoint(13, 3, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 94, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
			.setRotationPoint(14, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 90, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
			.setRotationPoint(14, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 163, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 144, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(16, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 345, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(13, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 57, textureX, textureY).addBox(0, 0, 0, 4, 2, 16)
			.setRotationPoint(9, 3, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 86, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
			.setRotationPoint(10, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 146, 84, textureX, textureY).addBox(0, 0, 0, 2, 1, 16)
			.setRotationPoint(10, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(12, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 21, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(12, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(9, 5, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 227, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, -0.54f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.54f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45, -23, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 501, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, -0.54f, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.54f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(45, -23, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 60, textureX, textureY).addBox(0, 0, 0, 1, 2, 5)
			.setRotationPoint(45.1f, -22.25f, -6).setRotationAngle(0, 10, 0).setName("numberboard_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f)
			.setRotationPoint(46.35f, -22.25f, -1).setRotationAngle(0, 0, 0).setName("Front_red_Light")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
			.setRotationPoint(45, -21.9f, 6.9f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(45.1f, -21.9f, 6.9f).setRotationAngle(0, 0, 0).setName("Front_Redmarkerlight_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
			.setRotationPoint(45, -21.9f, -8.9f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 353, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f, 0, -0.4f, -0.4f)
			.setRotationPoint(45.1f, -21.9f, -8.9f).setRotationAngle(0, 0, 0).setName("Front_Redmarkerlight_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 264, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(44.85f, -21.25f, 7.25f).setRotationAngle(0, 0, 0).setName("Front_Markerlight_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 82, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44.75f, -21.25f, -8.25f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(44.85f, -21.25f, -8.25f).setRotationAngle(0, 0, 0).setName("Front_Markerlight_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 81, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -22, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -22, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -22, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
			.setRotationPoint(46.3f, -22.65f, -0.5f).setRotationAngle(0, 0, 0).setName("Headlight_top_top")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 207, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0.3f, 0.2f, 0, 0.3f, 0.2f, 0, 0.3f, 0.2f, 0, 0.3f, 0.2f, 0, 0.4f, 0.2f, 0, 0.4f, 0.2f, 0, 0.4f, 0.2f, 0, 0.3f, 0.2f)
			.setRotationPoint(46.2f, -22.55f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
			.setRotationPoint(46.3f, -21.3f, -0.5f).setRotationAngle(0, 0, 0).setName("Headlight/markerlight_top_top")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 485, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
			.setRotationPoint(54.75f, -2.75f, 9.15f).setRotationAngle(0, 0, 0).setName("Ditchlight_left_outdent")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 439, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f)
			.setRotationPoint(54.75f, -2.75f, 9.15f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
			.setRotationPoint(54.75f, -2.75f, -10.15f).setRotationAngle(0, 0, 0).setName("Ditchlight_right_outdent")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f)
			.setRotationPoint(54.75f, -2.75f, -10.15f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(53.5f, -3.25f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 254, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(53.5f, -3.25f, 7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
			.setRotationPoint(54.5f, -11, 8.7f).setRotationAngle(0, 0, 0).setName("markerlight_nose_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f)
			.setRotationPoint(54.5f, -11, 8.7f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(53.25f, -11.5f, 7.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f, 0, 0.1f, 0.1f)
			.setRotationPoint(54.5f, -11, -9.85f).setRotationAngle(0, 0, 0).setName("markerlight_nose_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f)
			.setRotationPoint(54.5f, -11, -9.85f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 72, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(53.25f, -11.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 228, 57, textureX, textureY).addBox(0, 0, 0, 9, 2, 22)
			.setRotationPoint(8, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 59, 58, textureX, textureY).addBox(0, 0, 0, 9, 2, 20)
			.setRotationPoint(8, 4, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(8, 4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 65, textureX, textureY).addBox(0, 0, 0, 9, 2, 16)
			.setRotationPoint(8, 6, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 27, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(8, 6, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 201, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 58, textureX, textureY).addBox(0, 0, 0, 7, 2, 22)
			.setRotationPoint(-10, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 60, textureX, textureY).addBox(0, 0, 0, 7, 2, 20)
			.setRotationPoint(-10, 4, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-10, 4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 223, 82, textureX, textureY).addBox(0, 0, 0, 7, 2, 16)
			.setRotationPoint(-10, 6, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-10, 6, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 35, textureX, textureY).addBox(0, 0, 0, 9, 2, 22)
			.setRotationPoint(-19, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 354, 57, textureX, textureY).addBox(0, 0, 0, 9, 2, 20)
			.setRotationPoint(-19, 4, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-19, 4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 428, 60, textureX, textureY).addBox(0, 0, 0, 9, 2, 16)
			.setRotationPoint(-19, 6, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 486, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-19, 6, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 209, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 190, 65, textureX, textureY).addBox(0, 0, 0, 2, 2, 22)
			.setRotationPoint(-3, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 82, textureX, textureY).addBox(0, 0, 0, 2, 2, 20)
			.setRotationPoint(-3, 4, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 339, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-3, 4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 275, 82, textureX, textureY).addBox(0, 0, 0, 2, 2, 16)
			.setRotationPoint(-3, 6, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 167, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
			.setRotationPoint(-3, 6, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 130, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 6, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 332, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 4, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6, 2, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f)
			.setRotationPoint(48, -21.95f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 217, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(48, -21.45f, -0.5f).setRotationAngle(0, 0, 0).setName("bell0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.15f, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0.15f)
			.setRotationPoint(48, -21.2f, -0.5f).setRotationAngle(0, 0, 0).setName("bell1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 320, 89, textureX, textureY).addBox(0, 0, 0, 7, 1, 4)
			.setRotationPoint(35, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 420, 88, textureX, textureY).addBox(0, 0, 0, 7, 1, 4)
			.setRotationPoint(35, -24, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 58, textureX, textureY).addBox(0, 0, 0, 5, 1, 4)
			.setRotationPoint(36, -25, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 46, textureX, textureY).addBox(0, 0, 0, 5, 1, 4)
			.setRotationPoint(36, -25, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -25, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 390, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35, -25, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41, -25, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41, -25, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.5f, -23.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(43.5f, -23.5f, -6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f)
			.setRotationPoint(43.5f, -24.25f, -6.5f).setRotationAngle(0, 0, 0).setName("Beacon_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 369, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f)
			.setRotationPoint(43.5f, -24.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Beacon_mid")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f)
			.setRotationPoint(43.5f, -24.25f, 5.5f).setRotationAngle(0, 0, 0).setName("Beacon_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.2f, -0.25f, -0.2f, -0.2f, -0.25f, -0.2f, -0.2f, -0.25f, -0.2f, -0.2f, -0.25f, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f)
			.setRotationPoint(43.5f, -23.5f, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f)
			.setRotationPoint(43.5f, -24.25f, 3.5f).setRotationAngle(0, 0, 0).setName("Beacon_big")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 15, textureX, textureY).addBox(0, 0, 0, 10, 5, 4)
			.setRotationPoint(-15.5f, 1.95f, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, 0, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, 1, 8.5f).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 495, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5.5f, 0, 9.5f).setRotationAngle(0, 0, 0).setName("Box 64cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(5.5f, 1, 9.5f).setRotationAngle(0, 0, 0).setName("Box 65cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 64, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(55, -0.25f, 9.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 74, 62, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(55, -0.25f, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 62, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(55, -0.25f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 60, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(55, -0.25f, -10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 131, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(55, 0, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 98, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(55, 0, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 446, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(46.5f, -26, -0.25f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 300, 60, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(45.5f, -24, -0.5f).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 94, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(45.5f, -25, -1.5f).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 425, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(46.5f, -25, 1).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 58, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(45.5f, -24.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
			.setRotationPoint(47.5f, -25, -3).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 241, 41, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(45.5f, -24.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(46.5f, -25.5f, -1.75f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 58, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(45.5f, -25.5f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f)
			.setRotationPoint(44.5f, -26, -0.25f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-0.5f, -25.25f, -2.2f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 308, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-0.5f, -25.25f, 0.2f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 37, 58, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.5f, -23.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 121, 81, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(-1.5f, -24.75f, -2).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 296, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
			.setRotationPoint(0.5f, -25.5f, -1).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 58, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-0.5f, -25, -0.5f).setRotationAngle(0, 0, 0).setName("Box 193cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-0.5f, -24.75f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 58, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.5f, -24.25f, 2).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 157, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-0.5f, -24.75f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 57, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-1.5f, -24.25f, -3).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f, -0.5f, -0.15f)
			.setRotationPoint(-16, -23.5f, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 438, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(31, -3.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(31, -7, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(31, -3.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 249, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(31, -7, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 49, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -24, 3.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 230, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-59, 0, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 25, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-59, 0, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 443, 118, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(57, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
		//
		TurboList SD70MACcb = new TurboList("SD70MACcb");
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 332, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 105, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-58, -9, -2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 487, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, 1).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 437, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-58, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 479, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f)
			.setRotationPoint(-58, -9, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 191, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(-58, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 463, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f)
			.setRotationPoint(-55.25f, -20, -2).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 505, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-55.5f, -20, -0.1f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 493, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-55.6f, -20, -0.1f).setRotationAngle(0, 0, 0).setName("Lightrear_left")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 405, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-55.5f, -20, -1.9f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 393, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-55.6f, -20, -1.9f).setRotationAngle(0, 0, 0).setName("Lightrear_right")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 344, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, -22, 4).setRotationAngle(0, 20, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 241, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.25f, 1, -6).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 182, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-57.5f, 1.2f, -5.88f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 241, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
			.setRotationPoint(-57.25f, 1, 3).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 269, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-57.5f, 1.2f, 3.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 486, 6, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-48, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 479, 34, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-45, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 498, 31, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-45, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 0, 24, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-48, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 438, 20, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-42, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 438, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 486, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -24, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 488, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28, -24, 4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 230, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28, -24, -4).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 486, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17, -24, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 507, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -1, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28, -24, -5).setRotationAngle(0, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 129, 58, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(6, 2, 8).setRotationAngle(25, 0, 0)
		);
		SD70MACcb.add(new ModelRendererTurbo(SD70MACcb, 503, 48, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(6, 0.75f, -10.5f).setRotationAngle(-25, 0, 0)
		);
		this.groups.add(SD70MACcb);
		//
		TurboList LRCcb = new TurboList("LRCcb");
		LRCcb.add(new ModelRendererTurbo(LRCcb, 455, 34, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(45.5f, -23.25f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		LRCcb.add(new ModelRendererTurbo(LRCcb, 249, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 4)
			.setRotationPoint(45.5f, -24.25f, -2).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		LRCcb.add(new ModelRendererTurbo(LRCcb, 98, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
			.setRotationPoint(47.5f, -25, -1).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		LRCcb.add(new ModelRendererTurbo(LRCcb, 266, 19, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(46.5f, -24.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 193cp")
		);
		LRCcb.add(new ModelRendererTurbo(LRCcb, 241, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(46.5f, -24.25f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		LRCcb.add(new ModelRendererTurbo(LRCcb, 506, 14, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(45.5f, -23.75f, 2).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		LRCcb.add(new ModelRendererTurbo(LRCcb, 230, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(46.5f, -24.25f, -3.5f).setRotationAngle(0, 0, 0).setName("Box 196cp")
		);
		LRCcb.add(new ModelRendererTurbo(LRCcb, 256, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(45.5f, -23.75f, -3).setRotationAngle(0, 0, 0).setName("Box 188cp")
		);
		this.groups.add(LRCcb);
		//
	}

}
