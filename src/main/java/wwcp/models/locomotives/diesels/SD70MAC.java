//FMT-Marker TiM-1.0
package wwcp.models.locomotives.diesels;

import ebf.tim.api.RollingstockBase;
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
public class SD70MAC extends RollingStockModel {

	public SD70MAC(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 133, 1, 22)
			.setRotationPoint(-65, -1, -11).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 97, 42, textureX, textureY).addBox(0, 0, 0, 40, 22, 14)
			.setRotationPoint(4, -23, -7).setRotationAngle(0, 0, 0)
		);
		group0.add(new ModelRendererTurbo(group0, 437, 106, textureX, textureY).addBox(0, 0, 0, 13, 8, 1)
			.setRotationPoint(44, -21, 10).setRotationAngle(0, 0, 0)
		);
		this.groups.add(group0);
		//
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 398, 46, textureX, textureY).addBox(0, 0, 0, 35, 22, 14)
			.setRotationPoint(-61, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 22, 7, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-69, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 120, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 22, 7)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 10.0f, 0.0f, 10.0f, 0.0f, 7.0f, 7.0f, 10.0f, 7.0f }).build()
			.setRotationPoint(-69, -23, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 106, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
			.setRotationPoint(-62, -22, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 104, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
			.setRotationPoint(-44, -22, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 120, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-49, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 118, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-59, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 96, textureX, textureY).addBox(0, 0, 0, 9, 1, 3)
			.setRotationPoint(-39, -24, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 135, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-36, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 152, 135, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-36, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 134, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-39, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 134, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-33, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 133, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-46, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 142, 133, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-46, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 224, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-49, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 123, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-49, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 121, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-43, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(-43, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 118, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-56, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 117, textureX, textureY).addBox(0, 0, 0, 3, 1, 3)
			.setRotationPoint(-56, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-59, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-59, -24, 1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 94, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-53, -24, -4.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 86, textureX, textureY)
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
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 60, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(37, 6, 2)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2)
			.setPolygonUV(0, new float[]{ 41.0f, 2.0f, 39.0f, 2.0f, 39.0f, 8.0f, 39.0f, 8.0f }).build()
			.setRotationPoint(-63, -21, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -22, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -23, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 104, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
			.setRotationPoint(-62, -21, 8.25f).setRotationAngle(-19, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 101, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
			.setRotationPoint(-44, -21, 8.25f).setRotationAngle(-19, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 17, 2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.5f, -24, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.5f, -25, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 327, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.5f, -25, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.5f, -25, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.5f, -25, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1, 1, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.5f, -25, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, -1, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.5f, -25, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39.5f, -25, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 314, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, -1, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.5f, -25, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -1, -1, -0.5f, -1, -1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23.5f, -25, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 169, 111, textureX, textureY).addBox(0, 0, 0, 12, 5, 1)
			.setRotationPoint(14, -22.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 92, textureX, textureY).addBox(0, 0, 0, 8, 1, 12)
			.setRotationPoint(5, -24, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, -24, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 329, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, -24, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 3, textureX, textureY).addBox(0, 0, 0, 82, 1, 4)
			.setRotationPoint(-38, -2, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 101, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
			.setRotationPoint(-62, -22, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 292, 96, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
			.setRotationPoint(-44, -22, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 192, 42, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(37, 6, 2)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(1, new float[]{ 2.0f, 2.0f, 0.0f, 2.0f, 0.0f, 8.0f, 0.0f, 8.0f })
			.setPolygonUV(0, new float[]{ 41.0f, 2.0f, 39.0f, 2.0f, 39.0f, 8.0f, 41.0f, 8.0f }).build()
			.setRotationPoint(-63, -21, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 426, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -22, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -23, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 281, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63, -23, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 255, 96, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
			.setRotationPoint(-62, -21, -9.25f).setRotationAngle(19, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 96, textureX, textureY).addBox(0, 0, 0, 17, 6, 1)
			.setRotationPoint(-44, -21, -9.25f).setRotationAngle(19, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 109, 110, textureX, textureY).addBox(0, 0, 0, 12, 4, 1)
			.setRotationPoint(26, -23, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 117, textureX, textureY).addBox(0, 0, 0, 11, 4, 1)
			.setRotationPoint(27, -19, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 106, textureX, textureY).addBox(0, 0, 0, 2, 22, 14)
			.setRotationPoint(-66, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 136, 97, textureX, textureY).addBox(0, 0, 0, 3, 22, 13)
			.setRotationPoint(-64, -23, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 144, textureX, textureY).addBox(0, 0, 0, 3, 8, 1)
			.setRotationPoint(-64, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 423, 144, textureX, textureY).addBox(0, 0, 0, 3, 8, 1)
			.setRotationPoint(-64, -9, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-64, -11, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 111, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-63, -13, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 14, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, 0, 0, -0.9f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-63.5f, -13.5f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 127, textureX, textureY).addBox(0, 0, 0, 8, 14, 1)
			.setRotationPoint(16, -16, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 22, 123, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(8, 14, 3)
			.setCorners(0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(1, new float[]{ 3.0f, 3.0f, 3.0f, 3.0f, 0.0f, 17.0f, 3.0f, 17.0f }).build()
			.setRotationPoint(16, -16, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, -17, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 491, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, 0, -0.36f, 0, 0, -0.36f, 0, 0, 0, 0, 0, 0, 0, 0, -0.57f, 0, 0, -0.57f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, -5, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(23, -4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 266, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(16, -4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(19.5f, -4, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 132, textureX, textureY).addBox(0, 0, 0, 3, 10, 4)
			.setRotationPoint(41, -12, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 233, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 12, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, -24, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 166, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, -24, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4, -24, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -24.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -24.5f, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -24.5f, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 270, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 11, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -24.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -1, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -24.5f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 72, textureX, textureY).addBox(0, 0, 0, 12, 5, 1)
			.setRotationPoint(14, -22.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 24, textureX, textureY).addBox(0, 0, 0, 12, 4, 1)
			.setRotationPoint(26, -23, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 114, textureX, textureY).addBox(0, 0, 0, 11, 4, 1)
			.setRotationPoint(27, -19, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 216, 162, textureX, textureY)
			.addShapeBox(0, 0, 0, 25, 1, 14, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -24, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 358, 61, textureX, textureY)
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
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 0, -11).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 407, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 1, -11).setRotationAngle(0, 0, 0).setName("Box 1cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 444, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-19, 0, -10).setRotationAngle(0, 0, 0).setName("Box 64cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 397, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-19, 1, -10).setRotationAngle(0, 0, 0).setName("Box 65cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 200, 144, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(23, 2, 8).setRotationAngle(25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 144, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(23, 0.75f, -10.5f).setRotationAngle(-25, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(24, -12, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -3.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -3.5f, 0, 0, 3, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 3, 0)
			.setRotationPoint(11.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 48, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 462, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(7, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-1, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-9, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 409, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-17, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-25, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 399, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-33, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 394, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-41, -8, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -1.5f, 0, 0, 1, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-39.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 26, 1, 1, 0, 0, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-66, -8.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-49, -8, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 384, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-57, -8, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 379, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-64, -8, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.5f, -0.5f, 0, -3.5f, -0.5f, 0, -3.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 3, -0.5f, 0, 3, 0, 0, 0, 0)
			.setRotationPoint(24.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -3.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -3.5f, 0, 0, 3, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 3, 0)
			.setRotationPoint(31.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 57, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(35.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 502, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 331, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(30, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(38.5f, -9, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, -9.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 105, 1, 1, 0, 0, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-66, -8.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-49, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 148, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-64, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-57, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-41, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 374, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-33, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-25, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 347, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-17, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 342, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-9, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 302, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(-1, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 297, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(7, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(15, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 148, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(23, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 105, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(31, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 100, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(38, -8, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(42.5f, -12.5f, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1.5f, 1, 0, 0, -1, 0, -2, 3, 0, -2, 3, -0.5f, 0, -1, -0.5f, 0, 0, 0, -2, -4, 0, -2, -4, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(39.5f, -9, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 95, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(43, -12, -11.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41, -6, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 117, textureX, textureY).addBox(0, 0, 0, 8, 3, 4)
			.setRotationPoint(36, -5, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 147, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(43, -12, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(35.5f, -4, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 181, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(42, -3, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 111, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(43, -5, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 414, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(40.5f, -4, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 405, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(40.5f, -6, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 396, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(40.5f, -8, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 387, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(40.5f, -10, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 328, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(40.5f, -12, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 343, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 12, 10, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0)
			.setRotationPoint(69, -13, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 250, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 12, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0)
			.setRotationPoint(61, -13, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 185, 113, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 8, 11)
			.setCorners(0, 0, 0, 0, 0, 0, -3, 0, 0, 3, 0, 0, -3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(1, new float[]{ 11.0f, 11.5f, 0.0f, 11.5f, 0.0f, 19.0f, 11.0f, 19.0f })
			.setPolygonUV(0, new float[]{ 23.0f, 11.5f, 12.0f, 11.5f, 12.0f, 19.0f, 23.0f, 19.0f }).build()
			.setRotationPoint(60, -21, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 50, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(8, 2, 1)
			.setCorners(0, 0, 0, 0.3f, 0, 1, 0.3f, 0, -2, 0, 0, -1, 0, 0, 0, 0.3f, 0, 1, 0, 0, -1, 0, 0, 0)
			.setPolygonUV(5, new float[]{ 18.2f, 1.0f, 10.0f, 1.0f, 10.0f, 3.0f, 18.0f, 3.0f })
			.setPolygonUV(4, new float[]{ 9.0f, 1.0f, 1.0f, 1.0f, 1.0f, 3.0f, 9.0f, 3.0f }).build()
			.setRotationPoint(61, -15, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 326, 109, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(8, 2, 5)
			.setCorners(0, 0, -1, 1.8f, 0, 0, 0.3f, -2, 0, 0, -2, 1, 0, 0, -1, 1.8f, 0, 0, 0.3f, 0, 0, 0, 0, 1)
			.setPolygonUV(0, new float[]{ 18.0f, 5.0f, 13.0f, 5.0f, 13.0f, 7.0f, 18.0f, 7.0f })
			.setPolygonUV(2, new float[]{ 13.0f, 0.0f, 4.8f, 0.0f, 3.4f, 5.0f, 13.0f, 5.0f }).build()
			.setRotationPoint(61, -17, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 218, 96, textureX, textureY).addBox(0, 0, 0, 17, 12, 1)
			.setRotationPoint(44, -13, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 278, 143, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 8, 1)
			.setCorners(0, 0, 0, -2.7f, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(5, new float[]{ 8.0f, 1.0f, 5.0f, 1.0f, 5.0f, 9.0f, 8.0f, 9.0f })
			.setPolygonUV(4, new float[]{ 2.0f, 1.0f, 1.0f, 1.0f, 1.0f, 9.0f, 4.0f, 9.0f }).build()
			.setRotationPoint(57, -21, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 408, 106, textureX, textureY).addBox(0, 0, 0, 13, 8, 1)
			.setRotationPoint(44, -21, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 12, 10, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(69, -13, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 447, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 12, 1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(61, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 310, 112, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 8, 11)
			.setCorners(3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, -3, 0, 0)
			.setPolygonUV(1, new float[]{ 11.0f, 11.5f, 0.0f, 11.5f, 0.0f, 19.0f, 11.0f, 19.0f })
			.setPolygonUV(0, new float[]{ 23.0f, 11.5f, 12.0f, 11.5f, 12.0f, 19.0f, 23.0f, 19.0f }).build()
			.setRotationPoint(60, -21, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 46, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(8, 2, 1)
			.setCorners(0, 0, -1, 0.3f, 0, -2, 0.3f, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0.3f, 0, 1, 0, 0, 0)
			.setPolygonUV(5, new float[]{ 18.2f, 1.0f, 10.0f, 1.0f, 10.0f, 3.0f, 18.0f, 3.0f })
			.setPolygonUV(4, new float[]{ 9.0f, 1.0f, 0.8f, 1.0f, 1.0f, 3.0f, 9.0f, 3.0f }).build()
			.setRotationPoint(61, -15, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 271, 42, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(8, 2, 5)
			.setCorners(0, -2, 1, 0.3f, -2, 0, 1.8f, 0, 0, 0, 0, -1, 0, 0, 1, 0.3f, 0, 0, 1.8f, 0, 0, 0, 0, -1)
			.setPolygonUV(0, new float[]{ 18.0f, 5.0f, 13.0f, 7.0f, 13.0f, 7.0f, 18.0f, 7.0f })
			.setPolygonUV(2, new float[]{ 13.0f, 0.0f, 3.4f, 0.0f, 4.8f, 5.0f, 13.0f, 5.0f }).build()
			.setRotationPoint(61, -17, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 112, 96, textureX, textureY).addBox(0, 0, 0, 17, 12, 1)
			.setRotationPoint(44, -13, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 269, 143, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 8, 1)
			.setCorners(0, 0, 0, -3, 0, 0, -2.7f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0)
			.setPolygonUV(5, new float[]{ 8.0f, 1.0f, 7.0f, 1.0f, 5.0f, 9.0f, 8.0f, 9.0f })
			.setPolygonUV(4, new float[]{ 2.0f, 1.0f, 1.0f, 1.0f, 1.0f, 9.0f, 4.0f, 9.0f }).build()
			.setRotationPoint(57, -21, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-20, 5, 10).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 404, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 46, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-20, 5, -11).setRotationAngle(0, 0, 0).setName("Box 41cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 85, textureX, textureY).addBox(0, 0, 0, 8, 15, 2)
			.setRotationPoint(16, -16, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16, -17, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 348, 94, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(14, 2, 4)
			.setCorners(0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(1, new float[]{ 4.0f, 4.0f, 0.0f, 6.0f, 0.0f, 6.0f, 4.0f, 6.0f })
			.setPolygonUV(0, new float[]{ 22.0f, 4.0f, 18.0f, 4.0f, 18.0f, 6.0f, 22.0f, 6.0f }).build()
			.setRotationPoint(44, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 138, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0.09f, 0, 0, -1, -2, 0, 0, -2, 0, 0, 0, 0, 0.09f, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(58, -23, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 125, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 7)
			.setCorners(0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 16.0f, 7.0f, 9.0f, 7.0f, 9.0f, 9.0f, 16.0f, 9.0f })
			.setPolygonUV(2, new float[]{ 7.0f, 0.0f, 7.0f, 0.0f, 7.0f, 7.0f, 9.0f, 7.0f }).build()
			.setRotationPoint(59, -23, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 2, 4, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -23, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 138, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 4)
			.setCorners(0, -2, 0, -1, -2, 0, 0.09f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0.09f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 9.0f, 4.0f, 5.0f, 6.0f, 5.0f, 6.0f, 9.0f, 6.0f }).build()
			.setRotationPoint(58, -23, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 124, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 7)
			.setCorners(0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1.91f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 16.0f, 7.0f, 9.0f, 7.0f, 9.0f, 9.0f, 16.0f, 9.0f })
			.setPolygonUV(2, new float[]{ 9.0f, 0.0f, 7.0f, 0.0f, 7.0f, 7.0f, 7.0f, 7.0f }).build()
			.setRotationPoint(59, -23, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 14, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(48.5f, 1, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 8, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-47.5f, 1, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 55, 94, textureX, textureY).addBox(0, 0, 0, 1, 20, 17)
			.setRotationPoint(44, -21, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 81, textureX, textureY)
			.addBox(0, 0, 0, 24, 6, 8, 0, 1f, new boolean[]{ true, false, false, false, false, false })
			.setRotationPoint(45, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 365, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -7, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 116, textureX, textureY).addBox(0, 0, 0, 8, 9, 4)
			.setRotationPoint(33, -11, 7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(24.5f, -12.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 194, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(32.5f, -4, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 142, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(32.5f, -6, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(32.5f, -8, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(32.5f, -10, 7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(32.5f, -17, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 261, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(41, -17, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 63, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(33, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 89, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, -0.5f, 0, 1.5f, -0.5f, 0, 1.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, -2, -0.5f, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(42, -17.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 108, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, -19.5f, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 240, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 14, 4, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(43, -21, -11).setRotationAngle(0, 0, 0).setName("Door0")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 330, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, -0.75f, -2, -0.5f, 0, -2, -0.5f, 0, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(43, -23, -11).setRotationAngle(0, 0, 0).setName("Door1")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 69, 79, textureX, textureY).addBox(0, 0, 0, 24, 6, 8)
			.setRotationPoint(45, -7, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 483, 46, textureX, textureY).addBox(0, 0, 0, 10, 6, 4)
			.setRotationPoint(45, -7, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 132, textureX, textureY).addBox(0, 0, 0, 3, 3, 4)
			.setRotationPoint(55, -4, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 161, 136, textureX, textureY).addBox(0, 0, 0, 1, 16, 4)
			.setRotationPoint(60, -17, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 71, 132, textureX, textureY).addBox(0, 0, 0, 3, 9, 4)
			.setRotationPoint(57, -16, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 123, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -17, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 126, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(49, -11, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 56, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
			.setRotationPoint(47, -12, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 134, 133, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
			.setRotationPoint(47, -17, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 50, 115, textureX, textureY).addBox(0, 0, 0, 1, 4, 1)
			.setRotationPoint(49, -11, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 14, textureX, textureY).addBox(0, 0, 0, 5, 1, 5)
			.setRotationPoint(47, -12, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 79, textureX, textureY).addBox(0, 0, 0, 1, 5, 5)
			.setRotationPoint(47, -17, 4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 132, textureX, textureY).addBox(0, 0, 0, 3, 8, 4)
			.setRotationPoint(57, -15, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, -16, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 422, 130, textureX, textureY).addBox(0, 0, 0, 3, 9, 4)
			.setRotationPoint(57, -16, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 9, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -17, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 366, 129, textureX, textureY).addBox(0, 0, 0, 3, 8, 4)
			.setRotationPoint(57, -15, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 324, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(57, -16, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 377, 94, textureX, textureY).addBox(0, 0, 0, 4, 1, 8)
			.setRotationPoint(53, -15, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 138, textureX, textureY).addBox(0, 0, 0, 4, 7, 1)
			.setRotationPoint(53, -14, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 120, textureX, textureY)
			.addBox(0, 0, 0, 4, 1, 7, 0, 1f, new boolean[]{ false, false, false, false, false, true })
			.setRotationPoint(53, -14, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 137, textureX, textureY).addBox(0, 0, 0, 4, 9, 1)
			.setRotationPoint(53, -16, -3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 479, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(54, -15, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(55, -15, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 295, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(54, -15, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 90, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f)
			.setRotationPoint(54, -15, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 473, 92, textureX, textureY).addBox(0, 0, 0, 6, 1, 12)
			.setRotationPoint(68, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 298, 132, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 9, 5)
			.setCorners(0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 5.0f, 0.0f, 5.0f, 5.0f, 7.0f, 5.0f }).build()
			.setRotationPoint(68, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 101, 132, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 9, 5)
			.setCorners(0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 4.0f, 0.0f, 5.0f, 5.0f, 6.0f, 5.0f }).build()
			.setRotationPoint(68, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 22, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(74, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 481, 106, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(74.25f, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 124, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(75.25f, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(75.25f, -1, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 466, 127, textureX, textureY).addBox(0, 0, 0, 6, 8, 1)
			.setRotationPoint(68, 0, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 127, textureX, textureY).addBox(0, 0, 0, 6, 8, 1)
			.setRotationPoint(68, 0, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69, 1.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 119, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 299, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69, 5.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 467, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 5, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0)
			.setRotationPoint(68, 7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 64, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69, -1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69, 1.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69, 3.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 274, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(69, 5.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 5, 0, -0.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0)
			.setRotationPoint(68, 7.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 141, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(74.25f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(74.25f, 1.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 73, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(75.25f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 442, 92, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(76.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 92, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(77.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(76.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 187, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(78.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 179, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(78.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(76.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 256, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(68.75f, -3, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 251, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(69.75f, -16, 5.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 143, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -1, -0.5f, 3.5f, 0.5f, -0.5f, 3.5f, 0.5f, -0.5f, -4, -1, -0.5f, -4, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(68.75f, -10.5f, 9.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 80, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(68.75f, -3, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(69.75f, -16, -6.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 70, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -1, -0.5f, -4, 0.5f, -0.5f, -4, 0.5f, -0.5f, 3.5f, -1, -0.5f, 3.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(68.75f, -10.5f, -10.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 73, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(65.25f, -17, 5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 104, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(8, 1, 4)
			.setCorners(0, 0, 1, 1.8f, 0, 0, 2.9f, 0, 0, 0, 0, 0, 0, -0.5f, 1, 1.8f, -0.5f, 0, 3, -0.5f, 0, 0, -0.5f, 0)
			.setPolygonUV(2, new float[]{ 12.0f, 0.0f, 1.2f, 0.0f, 2.4f, 4.6f, 12.0f, 4.0f }).build()
			.setRotationPoint(61, -17, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 8, 0, 0, 0, 0, -2.7f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, -2.7f, 0, 0, -0.3f, 0, 0, 0, 0, 0)
			.setRotationPoint(69, -15, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 96, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 1, 3)
			.setCorners(0, 0, 1, 1.8f, 0, 0, 2.7f, 0, 0, 0, 0, 0, 0, 0, 1, 1.8f, 0, 0, 2.7f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 74.0f, 189.0f })
			.setPolygonUV(2, new float[]{ 21.0f, 104.0f, 10.2f, 104.0f, 11.4f, 108.6f, 21.0f, 108.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(68, -16, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 8, 0, 0, 0, 0, -0.3f, 0, 0, -2.7f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, -2.7f, 0, 0, 0, 0, 0)
			.setRotationPoint(69, -15, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 42, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 1, 3)
			.setCorners(0, 0, 0, 2.7f, 0, 0, 1.8f, 0, 0, 0, 0, 1, 0, 0, 0, 2.7f, 0, 0, 1.8f, 0, 0, 0, 0, 1)
			.setPolygonUV(0, new float[]{ 121.0f, 165.0f })
			.setPolygonUV(2, new float[]{ 30.0f, 129.0f, 19.199997f, 129.0f, 20.400002f, 133.6f, 30.0f, 133.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(68, -16, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 372, 71, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(8, 1, 4)
			.setCorners(0, 0, 0, 2.9f, 0, 0, 1.8f, 0, 0, 0, 0, 1, 0, -0.5f, 0, 3, -0.5f, 0, 1.8f, -0.5f, 0, 0, -0.5f, 1)
			.setPolygonUV(2, new float[]{ 12.0f, 0.0f, 2.4f, 0.0f, 1.2f, 5.0f, 12.0f, 4.0f }).build()
			.setRotationPoint(61, -17, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 63, 145, textureX, textureY).addBox(0, 0, 0, 1, 4, 2)
			.setRotationPoint(70.5f, -16.5f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 174, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 1, 3)
			.setCorners(0, -0.5f, 1, 1.8f, -0.5f, 0, 2.7f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 1, 1.8f, 0, 0, 2.7f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 26.0f, 168.0f })
			.setPolygonUV(2, new float[]{ 6.0f, 11.0f, -4.799999f, 11.0f, -3.5999985f, 15.600006f, 6.0f, 15.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(68, -17, -4).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 176, 172, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 1, 3)
			.setCorners(0, -0.5f, 0, 2.7f, -0.5f, 0, 1.8f, -0.5f, 0, 0, -0.5f, 1, 0, 0, 0, 2.7f, 0, 0, 1.8f, 0, 0, 0, 0, 1)
			.setPolygonUV(0, new float[]{ 184.0f, 175.0f })
			.setPolygonUV(2, new float[]{ 17.0f, 10.0f, 6.199997f, 10.0f, 7.399994f, 14.600006f, 17.0f, 14.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(68, -17, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 56, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 2, 0, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f)
			.setRotationPoint(70.6f, -16.25f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(71, -16.55f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(71, -14.95f, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 136, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(71.1f, -14.95f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_low")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 168, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(71.1f, -16.55f, -1).setRotationAngle(0, 0, 0).setName("noseheadlight_high")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 151, 167, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 1, 1)
			.setCorners(0, -0.5f, 1, 0, -0.5f, 0, 0.3f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 1, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 159.0f, 166.0f })
			.setPolygonUV(2, new float[]{ 11.0f, 4.0f, 0.19999695f, 4.0f, 1.3999939f, 8.600006f, 11.0f, 8.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(69.7f, -17, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 38, 162, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 1, 1)
			.setCorners(0, -0.5f, 0, 0.3f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 1, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 1)
			.setPolygonUV(0, new float[]{ 58.0f, 177.0f })
			.setPolygonUV(2, new float[]{ 18.0f, 7.0f, 7.200001f, 7.0f, 8.400002f, 11.600006f, 18.0f, 11.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(69.7f, -17, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 4, 170, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 3, 1)
			.setCorners(0, 0, 1, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 6.0f, 177.0f })
			.setPolygonUV(2, new float[]{ 7.0f, 17.0f, -3.8000002f, 17.0f, -2.6f, 21.599998f, 7.0f, 21.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(70.7f, -16, -1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 94, 166, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 3, 1)
			.setCorners(0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0.3f, 0, 0, 0, 0, 0, 0, 0, 1)
			.setPolygonUV(0, new float[]{ 98.0f, 182.0f })
			.setPolygonUV(2, new float[]{ 11.0f, 8.0f, 0.19999981f, 8.0f, 1.3999996f, 12.600006f, 11.0f, 12.0f })
			.setDetachedUV(0).build()
			.setRotationPoint(70.7f, -16, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0)
			.setRotationPoint(59.55f, -23, 1.9f).setRotationAngle(0, -15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0)
			.setRotationPoint(58.25f, -23, -6.75f).setRotationAngle(0, 15, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 197, 135, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f)
			.setRotationPoint(60.25f, -23, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(60.5f, -23, -0.1f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 131, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(60.6f, -23, -0.1f).setRotationAngle(0, 0, 0).setName("TopHeadlight_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 381, 129, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(60.5f, -23, -1.9f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 128, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(60.6f, -23, -1.9f).setRotationAngle(0, 0, 0).setName("TopHeadlight_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 303, 127, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f)
			.setRotationPoint(74.25f, -3.25f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 504, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(74.65f, -3.55f, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 122, 126, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(74.75f, -3.55f, -5).setRotationAngle(0, 0, 0).setName("Ditchlight_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f, 0, 0.2f, -0.1f)
			.setRotationPoint(74.25f, -3.25f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 243, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(74.65f, -3.55f, 3).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 210, 124, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(74.75f, -3.55f, 3).setRotationAngle(0, 0, 0).setName("Ditchlight_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 40, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(74, -9, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 35, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(74.75f, -9, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 29, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0.75f, -0.5f, 0.5f, -1.25f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0.75f, 0, 0.5f, -1.25f, 0, 0.5f)
			.setRotationPoint(74, -9, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 393, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(74, -9, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 7, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f)
			.setRotationPoint(73, 3, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 30, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(73, -1.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1.5f, 0, -4.5f, 1, 0, -4.5f, 1, 0, 4, -1.5f, 0, 4, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f)
			.setRotationPoint(73, -8, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 146, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(74, -9, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(74.75f, -9, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 20, 141, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.25f, -0.5f, 0.5f, 0.75f, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -1.25f, 0, 0.5f, 0.75f, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(74, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 506, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(74, -9, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(73, 3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 321, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(73, -1.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 316, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1.5f, 0, 4, 1, 0, 4, 1, 0, -4.5f, -1.5f, 0, -4.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(73, -8, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f)
			.setRotationPoint(74.75f, -9, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 69, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0)
			.setRotationPoint(74.75f, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 322, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
			.setRotationPoint(73.5f, 1, -8).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 436, 92, textureX, textureY).addBox(0, 0, 0, 6, 1, 12)
			.setRotationPoint(-71, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 171, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 9, 22, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-72, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 454, 106, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(-72.25f, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-73.25f, -1, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-73.25f, -1, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 147, 140, textureX, textureY).addBox(0, 0, 0, 1, 3, 3)
			.setRotationPoint(-72.25f, 2.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 86, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.25f, 1.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 69, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-73.25f, 3.5f, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 214, 61, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-74.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 61, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-75.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 91, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-74.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 75, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-76.25f, 3, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 8, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-76.25f, 3, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-74.25f, 3, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 140, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.5f, 1, -8).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 457, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-71.75f, 1.2f, -7.88f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 448, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0)
			.setRotationPoint(-71.5f, 1, 5).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 378, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 3, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-71.75f, 1.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 175, 130, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 9, 5)
			.setCorners(1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 1.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 5.0f, 0.0f, 5.0f, 5.0f, 7.0f, 5.0f }).build()
			.setRotationPoint(-66, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 498, 88, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 9, 5)
			.setCorners(-0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 1.2f, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 4.0f, 0.0f, 5.0f, 5.0f, 6.0f, 5.0f }).build()
			.setRotationPoint(-66, -1, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 496, 106, textureX, textureY).addBox(0, 0, 0, 6, 8, 1)
			.setRotationPoint(-71, 0, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 497, 60, textureX, textureY).addBox(0, 0, 0, 6, 8, 1)
			.setRotationPoint(-71, 0, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-71, 1.25f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-71, 3.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 199, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-71, 5.75f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 461, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 5, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-71, 7.5f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 61, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(5, 1, 1)
			.setCorners(0, 0, 0, -0.9f, 0, 0, -1.2f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.9f, -0.5f, 0, -1.2f, -0.5f, 0, 0, -0.5f, 0)
			.setPolygonUV(2, new float[]{ 4.8f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 5.1f, 1.0f }).build()
			.setRotationPoint(-71, -1, -7).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-71, 1.25f, -8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 494, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-71, 3.5f, -9).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 493, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-71, 5.75f, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 424, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 5, 0, 0, 0, 0, -0.7f, 0, 0, -0.7f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.7f, -0.5f, 0, -0.7f, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-71, 7.5f, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 206, 58, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(5, 1, 1)
			.setCorners(0, 0, 0, -1.2f, 0, 0, -0.9f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -1.2f, -0.5f, 0, -0.9f, -0.5f, 0, 0, -0.5f, 0)
			.setPolygonUV(2, new float[]{ 5.1f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 4.8f, 1.0f }).build()
			.setRotationPoint(-71, -1, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 311, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-72, -9, -6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-72.75f, -9, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 231, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -1.25f, -0.5f, 0.5f, 0.75f, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -1.25f, 0, 0.5f, 0.75f, 0, 0.5f)
			.setRotationPoint(-72, -9, -5.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 294, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-72, -9, -7.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 441, 100, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(-71, 3, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 248, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-71, -1.5f, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 172, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 1, 0, -4.5f, -1.5f, 0, -4.5f, -1.5f, 0, 4, 1, 0, 4, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-71, -8, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 85, 145, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-72, -9, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 338, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-72.75f, -9, 1).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 188, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.75f, -0.5f, 0.5f, -1.25f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0.75f, 0, 0.5f, -1.25f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-72, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 293, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, -0.4f, 0, -0.5f, -0.4f, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-72, -9, 6.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 25, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-71, 3, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 64, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-71, -1.5f, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 1, 0, 4, -1.5f, 0, 4, -1.5f, 0, -4.5f, 1, 0, -4.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-71, -8, 11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -0.6f, 0, -0.6f, -0.6f, 0, -0.6f, -1.1f, 0.5f, -0.1f, -1.1f, 0.5f, -0.1f, -0.1f, 0, -0.6f, -0.1f, 0, -0.6f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f)
			.setRotationPoint(-72.75f, -9, -1.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.1f, -1.1f, 0.5f, -0.6f, -1.1f, 0.5f, -0.6f, -0.6f, 0, -0.1f, -0.6f, 0, -0.1f, 0.4f, 0.5f, -0.6f, 0.4f, 0.5f, -0.6f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(-72.75f, -9, 0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 432, 144, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-66.5f, -8, 10.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 337, 143, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-66.5f, -8, -12).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 45, 134, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f, 0, -0.1f, -0.25f)
			.setRotationPoint(-69.25f, -20, -2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 48, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-69.5f, -20, -0.1f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 370, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-69.6f, -20, -0.1f).setRotationAngle(0, 0, 0).setName("Lightrear_left")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 395, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-69.5f, -20, -1.9f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 221, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f)
			.setRotationPoint(-69.6f, -20, -1.9f).setRotationAngle(0, 0, 0).setName("Lightrear_right")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 114, 139, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(70.75f, -16, 2).setRotationAngle(0, -17, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 357, 132, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(70.75f, -12, 2).setRotationAngle(0, -17, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 437, 130, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(70.75f, -8, 2).setRotationAngle(0, -17, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 12, 125, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(70.75f, -4, 2).setRotationAngle(0, -17, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 312, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-68, -21, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 287, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-68, -18, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-68, -15, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 360, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-68, -12, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 236, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-68, -9, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 92, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-68, -6, 3).setRotationAngle(0, 23, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 283, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0.1f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -15, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -17, 5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(60, -17, -10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -15, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 484, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(26.25f, 0.5f, 8.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 499, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(26.5f, -0.5f, 8.75f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 288, 137, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 15, 3)
			.setPolygonUV(0, new float[]{ 7.0f, 3.5f, 4.0f, 3.5f, 4.0f, 18.5f, 7.0f, 18.5f })
			.setPolygonUV(5, new float[]{ 8.0f, 3.5f, 7.0f, 3.5f, 7.0f, 18.5f, 8.0f, 18.5f }).build()
			.setRotationPoint(70.1f, -16.5f, -3.75f).setRotationAngle(0, 18, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 156, 140, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 14, 1)
			.setPolygonUV(0, new float[]{ 3.0f, 1.5f, 2.0f, 1.5f, 2.0f, 15.5f, 3.0f, 15.5f })
			.setPolygonUV(4, new float[]{ 2.0f, 1.5f, 1.0f, 1.5f, 1.0f, 15.5f, 2.0f, 15.5f }).build()
			.setRotationPoint(69.79f, -15.5f, -4.7f).setRotationAngle(0, 18, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 507, 16, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 1, 1)
			.setCorners(0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(0, new float[]{ 3.0f, 1.5f, 2.0f, 2.5f, 2.0f, 2.5f, 3.0f, 2.5f })
			.setPolygonUV(5, new float[]{ 4.0f, 1.0f, 3.0f, 1.0f, 3.0f, 2.0f, 4.0f, 2.0f })
			.setPolygonUV(4, new float[]{ 2.0f, 1.0f, 1.0f, 1.0f, 1.0f, 2.0f, 2.0f, 2.0f })
			.setPolygonUV(2, new float[]{ 2.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 2.0f, 2.0f }).build()
			.setRotationPoint(69.79f, -16.5f, -4.7f).setRotationAngle(0, 18, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 47, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -24.5f, 1.6f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 469, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -24.5f, -3.6f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 478, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -25, -2.25f).setRotationAngle(0, 0, 0).setName("Box 94cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 16, 14, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-22, -23.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 86, textureX, textureY).addBox(0, 0, 0, 1, 1, 3)
			.setRotationPoint(-22, -24.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 91cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 285, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 11, 0, 1, 0, 0, -1.75f, 0, 0, -3.25f, 0, 0, 2.5f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -2.25f, 0, 0, 1.5f, 0, 0)
			.setRotationPoint(77, 5, 0).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 62, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.1f, 0, 0, -0.67f, 0, 0, -1.05f, 0, 0, 0.2f, 0, 0, -0.41f, 0, 0, -0.34f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(74.5f, 3, 8).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 90, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, 0, 0, -0.73f, 0, 0, -1.11f, 0, 0, 0.33f, 0, 0, -0.41f, 0, 0, -0.34f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(75.32f, 3, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, -1, 0, 0, 0.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1.89f, 0, 0, 1.04f, 0, 0)
			.setRotationPoint(75.34f, 2, 2).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -1.75f, 0, 0, 1, 0, 0, 1, 0, -0.25f, -1.75f, 0, -0.25f)
			.setRotationPoint(73.75f, 3.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 352, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, -1, 0, 0, -1, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(74.75f, 5.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 196, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, -1, -0.25f, -0.75f, -1, -0.25f, -1.25f, 0, 0, 0.5f, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(74.75f, 5.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 260, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 11, 0, 2.5f, 0, 0, -3.25f, 0, 0, -1.75f, 0, 0, 1, 0, 0, 1.5f, 0, 0, -2.25f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(77, 5, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 389, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.2f, 0, 0, -1.05f, 0, 0, -0.67f, 0, 0, -0.1f, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.34f, 0, 0, -0.41f, 0, 0)
			.setRotationPoint(74.5f, 3, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0.33f, 0, 0, -1.11f, 0, 0, -0.73f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.34f, 0, 0, -0.41f, 0, 0)
			.setRotationPoint(75.32f, 3, -5).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 9, 0, 0, 0, 0, -0.75f, 0, 0, 0.25f, 0, 0, -1, 0, 0, 1.04f, 0, 0, -1.89f, 0, 0, -0.75f, 0, 0, 0, 0, 0)
			.setRotationPoint(75.34f, 2, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -1.75f, 0, -0.25f, 1, 0, -0.25f, 1, 0, 0, -1.75f, 0, 0)
			.setRotationPoint(73.75f, 3.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 392, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, -1, 0, -0.75f, -1, 0)
			.setRotationPoint(74.75f, 5.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 301, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, -1, -0.25f, 0, -1, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0.5f, 0, 0, -1.25f, 0, 0)
			.setRotationPoint(74.75f, 5.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(73.75f, 1.2f, -8.13f).setRotationAngle(0, 0, 0).setName("Box 2cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 14, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-67, -24, -0.5f).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 102, 48, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(48.5f, 0, 10).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 0, 48, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(48.5f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 289, 15, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-47.5f, 0, -11).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 505, 3, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-47.5f, 0, 10).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
		//
		TurboList M420cb = new TurboList("M420cb");
		M420cb.add(new ModelRendererTurbo(M420cb, 289, 9, textureX, textureY).addBox(0, 0, 0, 46, 3, 22)
			.setRotationPoint(-20, 2, -11).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 279, 35, textureX, textureY).addBox(0, 0, 0, 46, 4, 20)
			.setRotationPoint(-20, 5, -10).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 444, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18, 0, 9).setRotationAngle(0, 0, 0).setName("Box 1")
		);
		M420cb.add(new ModelRendererTurbo(M420cb, 397, 83, textureX, textureY)
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
		M420cb.add(new ModelRendererTurbo(M420cb, 477, 137, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 1, 0, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(15, -12, 10.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(M420cb);
		//
		TurboList RS18cb = new TurboList("RS18cb");
		RS18cb.add(new ModelRendererTurbo(RS18cb, 12, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0, -0.6f, 0, 0, 0, 0, 0, 0, 0, 0, -0.6f, 0, 0)
			.setRotationPoint(73.5f, 1, 5).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(73.75f, 1.2f, 5.12f).setRotationAngle(0, 0, 0).setName("Box 2")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 507, 13, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-21, -24.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 89")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 25, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.5f, -0.5f)
			.setRotationPoint(-20, -25, -1).setRotationAngle(0, 0, 0).setName("Box 90")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 499, 15, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
			.setRotationPoint(-22, -24.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 91")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 295, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.5f, -0.5f)
			.setRotationPoint(-21, -25, 0.25f).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 63, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, 0, -1, 0.5f)
			.setRotationPoint(49, -21, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 90, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, 0, -1, -1.25f, -2, -1, -1.25f, -2, -1, 0.5f, 0, -1, 0.5f)
			.setRotationPoint(53, -21, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 271, 53, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 1)
			.setCorners(0, -0.25f, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, -1, -2, -1, -1.25f, 0, -1, -1.25f, 0, -1, 0.5f, -2, -1, 0.5f)
			.setPolygonUV(0, new float[]{ 4.0f, 1.0f, 3.0f, 1.0f, 3.0f, 3.0f, 4.0f, 3.0f })
			.setPolygonUV(5, new float[]{ 6.0f, 1.0f, 4.0f, 1.0f, 4.0f, 3.0f, 4.0f, 3.0f })
			.setPolygonUV(2, new float[]{ 3.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 3.0f, 1.0f }).build()
			.setRotationPoint(47, -21, 11).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 501, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, 0, -1, -1.25f)
			.setRotationPoint(49, -21, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 9, 32, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 1)
			.setCorners(0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -1, 0.5f, -2, -1, 0.5f, -2, -1, -1.25f, 0, -1, -1.25f)
			.setPolygonUV(4, new float[]{ 3.0f, 1.0f, 1.0f, 1.0f, 1.0f, 3.0f, 1.0f, 3.0f }).build()
			.setRotationPoint(53, -21, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		RS18cb.add(new ModelRendererTurbo(RS18cb, 505, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -1, 0, 0, -1, 0, -0.25f, 0, 0, -0.25f, 0, -2, -1, 0.5f, 0, -1, 0.5f, 0, -1, -1.25f, -2, -1, -1.25f)
			.setRotationPoint(47, -21, -12).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		this.groups.add(RS18cb);
		//
	}

}
