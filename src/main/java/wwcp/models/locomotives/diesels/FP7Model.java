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
public class FP7Model extends RollingStockModel {

	public FP7Model(){
		super(); textureX = 512; textureY = 512;
		this.addToCreators("Unregistered Account");
		//
		TurboList group0 = new TurboList("group0");
		group0.add(new ModelRendererTurbo(group0, 454, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 10, 5)
			.setCorners(-3, 0, 0, 2, 0, -1, 2, 0, -4, -3, 0, -5, -3, 0, 0, 2, 0, -1.25f, -1.5f, 0, 0, 1.5f, 0, 0)
			.setPolygonUV(1, new float[]{ 4.0f, 5.0f, 5.0f, 5.0f, 0.0f, 15.0f, 5.0f, 15.0f })
			.setPolygonUV(0, new float[]{ 11.0f, 5.0f, 6.0f, 5.0f, 6.0f, 15.0f, 11.0f, 15.0f }).build()
			.setRotationPoint(-51, -8.5f, -10).setRotationAngle(0, 0, 0).setName("Box 99")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 102, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 4)
			.setCorners(-3, 0, -2, 1, 0, -2, 1, 0, -2, -3, 0, -2, -2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(1, new float[]{ 4.0f, 4.0f, 3.0f, 4.0f, 0.0f, 6.0f, 4.0f, 6.0f }).build()
			.setRotationPoint(-50, -13.5f, -9).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 357, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1)
			.setRotationPoint(-48, -14.5f, -7).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		group0.add(new ModelRendererTurbo(group0, 147, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, -3, 0, 0, 1, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -13.5f, -5).setRotationAngle(0, 0, 0).setName("Box 94")
		);
		group0.add(new ModelRendererTurbo(group0, 348, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -2, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-52, -11.5f, -5).setRotationAngle(0, 0, 0).setName("Box 93")
		);
		group0.add(new ModelRendererTurbo(group0, 339, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 3, 0, -2, 0, 0, 2, 0, 0, 1, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-53, -8.5f, -5).setRotationAngle(0, 0, 0).setName("Box 92")
		);
		group0.add(new ModelRendererTurbo(group0, 234, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.35f, 0, 0, 0, 0, 0, 0, 0, 0, 0.35f, 0, 0, 0)
			.setRotationPoint(-48, -9.5f, 9).setRotationAngle(0, 0, 0).setName("Box 84")
		);
		group0.add(new ModelRendererTurbo(group0, 439, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f)
			.setRotationPoint(-47, -9.5f, 10).setRotationAngle(0, 0, 0).setName("Box 83")
		);
		group0.add(new ModelRendererTurbo(group0, 398, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 1, 0, 0, 0.75f, 0, 0, -0.75f, 0, 0, -1.5f, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, -0.75f)
			.setRotationPoint(-47, -11.5f, 10).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.35f)
			.setRotationPoint(-48, -11.5f, 9).setRotationAngle(0, 0, 0).setName("Box 80")
		);
		group0.add(new ModelRendererTurbo(group0, 330, 116, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 1, 3)
			.setCorners(0, -1, -1, 0, 0, 0, 0, -1, 0, -1, -1, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setPolygonUV(0, new float[]{ 7.0f, 3.0f, 4.0f, 3.0f, 4.0f, 4.0f, 7.0f, 4.0f })
			.setPolygonUV(2, new float[]{ 4.0f, 0.0f, 2.0f, 0.0f, 2.0f, 3.0f, 4.0f, 3.0f }).build()
			.setRotationPoint(-48, -14.5f, 4).setRotationAngle(0, 0, 0).setName("Box 79")
		);
		group0.add(new ModelRendererTurbo(group0, 104, 109, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 3)
			.setCorners(-2, 0, 0, 0, 0, 0, 1, 0, -1, -3, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3)
			.setPolygonUV(1, new float[]{ 2.0f, 3.0f, 0.0f, 3.0f, 0.0f, 5.0f, 3.0f, 5.0f }).build()
			.setRotationPoint(-50, -13.5f, 5).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 85, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 3, 5)
			.setCorners(0, -3, 0, 0, -3, 0, 0, 0, -1, -3, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0)
			.setPolygonUV(1, new float[]{ 5.0f, 5.0f, 1.0f, 5.0f, 0.0f, 8.0f, 5.0f, 8.0f })
			.setPolygonUV(0, new float[]{ 13.0f, 5.0f, 8.0f, 5.0f, 8.0f, 8.0f, 13.0f, 8.0f }).build()
			.setRotationPoint(-51, -11.5f, 5).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		group0.add(new ModelRendererTurbo(group0, 127, 108, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 1, 3)
			.setCorners(0, -1, 0, -2, -1, 0, 0, 0, -1, -1, -1, 0, 0, 1, 0, -2, 1, 0, 0, 0, -1, -1, 1, 0)
			.setPolygonUV(2, new float[]{ 5.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-49, -14.5f, 2).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, -2, 0, 0, 0, 0, 0, 1, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-51, -13.5f, 2).setRotationAngle(0, 0, 0).setName("Box 74")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, -1, 0, 0, 1, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(-52, -11.5f, 2).setRotationAngle(0, 0, 0).setName("Box 73")
		);
		group0.add(new ModelRendererTurbo(group0, 312, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1)
			.setRotationPoint(-48, -8.5f, 10).setRotationAngle(0, 0, 0).setName("Box 69")
		);
		group0.add(new ModelRendererTurbo(group0, 29, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, -2, 0, 0, 2, 0, 0)
			.setRotationPoint(-52, -8.5f, -2).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 379, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0)
			.setRotationPoint(-51, -11.5f, -2).setRotationAngle(0, 0, 0).setName("Box 67")
		);
		group0.add(new ModelRendererTurbo(group0, 247, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51, -13.5f, -2).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		group0.add(new ModelRendererTurbo(group0, 338, 96, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-49, -14.5f, -2).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-45, -11.5f, 10).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 346, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, -1, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0.75f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -14.5f, -7).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-47, -14.5f, -4).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 469, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45, -11.5f, 10).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 262, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45, -9.5f, -11).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		group0.add(new ModelRendererTurbo(group0, 303, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, 0, -2, -1, 0, -2, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0.5f, -1, 0, 0.5f, -1, 0, -1, 0, -1, -1, 0)
			.setRotationPoint(-48, -13.5f, -10).setRotationAngle(0, 0, 0).setName("Box 108")
		);
		group0.add(new ModelRendererTurbo(group0, 167, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, -1, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.35f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -11.5f, -10).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		group0.add(new ModelRendererTurbo(group0, 162, 122, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.35f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.35f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -9.5f, -10).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 298, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -0.65f, 0, 0, 0, 0, 0, 0, 0, 0, 1)
			.setRotationPoint(-47, -9.5f, -11).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 10, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1.25f)
			.setRotationPoint(-48, -8.5f, -11).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 424, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -1, 0, 0, -1, 0, -0.3f, -0.5f, 0, 0, -0.6f, 0, 0, 1, 0, 0, 1, 0, -0.3f, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-41, -13.5f, -10).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 1, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-36, -19.5f, -4).setRotationAngle(0, 0, 0).setName("Box 37")
		);
		group0.add(new ModelRendererTurbo(group0, 196, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -2, 0, 0, -2, 0, 0, -1.4f, 0, 0, -1.4f, 0)
			.setRotationPoint(-36, -19.5f, 4).setRotationAngle(0, 0, 0).setName("Box 36")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 1, 3, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, -0.4f, 0, 0, -0.4f, 0, 0, 0.5f, -1, 0, 0.5f, -1)
			.setRotationPoint(-36, -18.5f, 7).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 197, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36, -17, 9).setRotationAngle(0, 0, 0).setName("Box 102")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 3, 3, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -1.4f, 0, 0, -1.4f, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(-36, -19.5f, -7).setRotationAngle(0, 0, 0).setName("Box 64")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 1, 3, 0, 0, -1.5f, 0, 0, -1.5f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.5f, -1, 0, 0.5f, -1, 0, -0.4f, 0, 0, -0.4f, 0)
			.setRotationPoint(-36, -18.5f, -10).setRotationAngle(0, 0, 0).setName("Box 65")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 96, 2, 2, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -1, 0, -0.5f, -1)
			.setRotationPoint(-36, -17, -11).setRotationAngle(0, 0, 0).setName("Box 66")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.2f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.2f, 0, 0, -0.1f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.1f, -0.5f, 0)
			.setRotationPoint(-53.15f, -3, -4).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		group0.add(new ModelRendererTurbo(group0, 357, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.15f, 0, 0, -0.05f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.05f, -0.5f, 0)
			.setRotationPoint(-52.45f, -6.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, -0.2f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.2f, 0, 0, -0.1f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.1f, -0.5f, 0)
			.setRotationPoint(-53.15f, -3, 2.5f).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		group0.add(new ModelRendererTurbo(group0, 330, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-53.3f, -6.5f, 2.5f).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0)
			.setRotationPoint(-50.45f, -10.5f, 7).setRotationAngle(0, 27, 10).setName("Box 232")
		);
		group0.add(new ModelRendererTurbo(group0, 290, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f)
			.setRotationPoint(-50.45f, -10.5f, 7).setRotationAngle(0, 27, 10).setName("Glow lamp Right")
		);
		group0.add(new ModelRendererTurbo(group0, 245, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, 0.25f, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-53.3f, -6.5f, -4).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		group0.add(new ModelRendererTurbo(group0, 240, 121, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15f, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -0.15f, 0, 0, -0.05f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, -0.05f, -0.5f, 0)
			.setRotationPoint(-52.45f, -6.5f, -4).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		group0.add(new ModelRendererTurbo(group0, 234, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-51.5f, -12.25f, 0).setRotationAngle(0, 0, 0).setName("Box 167 lamp")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, -12.25f, -2).setRotationAngle(0, 0, 0).setName("Box 166 lamp")
		);
		group0.add(new ModelRendererTurbo(group0, 446, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, -14.25f, -2).setRotationAngle(0, 0, 0).setName("Box 165 lamp")
		);
		group0.add(new ModelRendererTurbo(group0, 433, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, -14.25f, 0).setRotationAngle(0, 0, 0).setName("Box 164 lamp")
		);
		group0.add(new ModelRendererTurbo(group0, 391, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-56, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		group0.add(new ModelRendererTurbo(group0, 397, 120, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-55, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 222, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0)
			.setRotationPoint(-57, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 120")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-57, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 119")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, -0.05f, -0.5f, -0.25f, -0.25f, -0.5f, -0.5f, -2.75f, -0.5f, -0.25f, 2.45f, -0.5f, -0.5f, 0.2f, -0.5f, -0.25f, -0.25f, -0.5f, -0.5f, -2.75f, -0.5f, -0.25f, 2.7f, -0.5f, -0.5f)
			.setRotationPoint(-48.75f, -9, -10).setRotationAngle(0, 0, 0).setName("Box 111")
		);
		group0.add(new ModelRendererTurbo(group0, 365, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0)
			.setRotationPoint(-49.95f, -10.5f, -8).setRotationAngle(0, -27, 10).setName("Box 232")
		);
		group0.add(new ModelRendererTurbo(group0, 255, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.5f, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f, 0, -0.15f, -0.15f, 0, -0.15f, -0.15f, -0.5f, -0.15f, -0.15f)
			.setRotationPoint(-49.95f, -10.5f, -8).setRotationAngle(0, -29, 10).setName("Glow lamp Left")
		);
		group0.add(new ModelRendererTurbo(group0, 293, 101, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 10, 5)
			.setCorners(-3, 0, 0, 2, 0, -1, 0, 0, 0, 0, 0, 0, 1.5f, 0, -5, -1.5f, 0, -5, -1.5f, 0, 0, 1.5f, 0, 0)
			.setPolygonUV(1, new float[]{ 5.0f, 5.0f, 0.0f, 5.0f, 0.0f, 15.0f, 0.0f, 15.0f }).build()
			.setRotationPoint(-51, -8.5f, -10).setRotationAngle(0, 0, 0).setName("Box 96")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 3, 0, -1, 0, 0, 1, 0, 0, 2, 0, 0, -2, 0, 0, 1, 0, 0, -1, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-53, -8.5f, 2).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 280, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 2.45f, -0.5f, -0.5f, -2.75f, -0.5f, -0.25f, -0.25f, -0.5f, -0.5f, -0.05f, -0.5f, -0.25f, 2.7f, -0.5f, -0.5f, -2.75f, -0.5f, -0.25f, -0.25f, -0.5f, -0.5f, 0.2f, -0.5f, -0.25f)
			.setRotationPoint(-48.75f, -9, 5).setRotationAngle(0, 0, 0).setName("Box 101")
		);
		group0.add(new ModelRendererTurbo(group0, 250, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.65f, -0.35f, 0, -0.65f, -0.35f, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-52.5f, -14.25f, 1).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 120, 116, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, -0.75f, 0, -0.75f, 0, 0, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(47, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 231, 107, textureX, textureY)
			.addShapeBox(2, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.25f, -21.5f, -2).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 269, 105, textureX, textureY)
			.addShapeBox(2, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.25f, -21.5f, -2).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 116, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, -0.5f, -0.75f, 0, -0.75f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(49, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 116, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(22.75f, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 186")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.75f, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 185")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.75f, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 184")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 82, textureX, textureY)
			.addShapeBox(2, 0, 0, 6, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(18.75f, -20.5f, -1).setRotationAngle(0, 0, 0).setName("Box 183")
		);
		group0.add(new ModelRendererTurbo(group0, 483, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(20.75f, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 182")
		);
		group0.add(new ModelRendererTurbo(group0, 474, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(22.75f, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 181")
		);
		group0.add(new ModelRendererTurbo(group0, 465, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(18.75f, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 180")
		);
		group0.add(new ModelRendererTurbo(group0, 415, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 179")
		);
		group0.add(new ModelRendererTurbo(group0, 406, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 178")
		);
		group0.add(new ModelRendererTurbo(group0, 382, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 177")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 82, textureX, textureY)
			.addShapeBox(2, 0, 0, 6, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11, -20.5f, -1).setRotationAngle(0, 0, 0).setName("Box 176")
		);
		group0.add(new ModelRendererTurbo(group0, 373, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 175")
		);
		group0.add(new ModelRendererTurbo(group0, 276, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(15, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 174")
		);
		group0.add(new ModelRendererTurbo(group0, 213, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(11, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		group0.add(new ModelRendererTurbo(group0, 196, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(6.5f, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 172")
		);
		group0.add(new ModelRendererTurbo(group0, 187, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(2.5f, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 171")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5f, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 170")
		);
		group0.add(new ModelRendererTurbo(group0, 223, 99, textureX, textureY)
			.addShapeBox(2, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, -3)
			.setRotationPoint(-10.5f, -20.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 99, textureX, textureY)
			.addShapeBox(2, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4.5f, -20.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		group0.add(new ModelRendererTurbo(group0, 149, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.5f, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 99, textureX, textureY)
			.addShapeBox(2, 0, 0, 3, 1, 3, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.5f, -20.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 99, textureX, textureY)
			.addShapeBox(2, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0.5f, 0)
			.setRotationPoint(-4.5f, -20.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 169")
		);
		group0.add(new ModelRendererTurbo(group0, 140, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.5f, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 168")
		);
		group0.add(new ModelRendererTurbo(group0, 272, 98, textureX, textureY)
			.addShapeBox(2, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-7.5f, -20.5f, 1.5f).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		group0.add(new ModelRendererTurbo(group0, 156, 98, textureX, textureY)
			.addShapeBox(2, 0, 0, 3, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.5f, -20.5f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		group0.add(new ModelRendererTurbo(group0, 131, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(4.5f, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 167")
		);
		group0.add(new ModelRendererTurbo(group0, 308, 77, textureX, textureY)
			.addShapeBox(2, 0, 0, 6, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(2.5f, -20.5f, -1).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		group0.add(new ModelRendererTurbo(group0, 394, 41, textureX, textureY)
			.addShapeBox(2, 0, 0, 9, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.5f, -20.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Box 166")
		);
		group0.add(new ModelRendererTurbo(group0, 102, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.75f, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f)
			.setRotationPoint(47, -20.5f, -1).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 87, 115, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.75f, 0, -0.75f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, 0, 0, 0)
			.setRotationPoint(49, -20.5f, -1).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 225, 120, textureX, textureY)
			.addShapeBox(2, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(51, -20.5f, 2).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 220, 120, textureX, textureY)
			.addShapeBox(2, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(51, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 121, 120, textureX, textureY)
			.addShapeBox(2, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, -0.25f)
			.setRotationPoint(50, -20.5f, 2).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 116, 120, textureX, textureY)
			.addShapeBox(2, 0, 0, 1, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(50, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(28.5f, -21.5f, 3).setRotationAngle(0, 0, 0).setName("Box 198")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.5f, -21.5f, -4).setRotationAngle(0, 0, 0).setName("Box 197")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 6, 0, 0, -0.8f, 0.5f, 0, -0.8f, 0.5f, 0, -0.8f, 0.5f, 0, -0.8f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(28.5f, -22.5f, -3).setRotationAngle(0, 0, 0).setName("Box 196")
		);
		group0.add(new ModelRendererTurbo(group0, 348, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(36.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Box 195")
		);
		group0.add(new ModelRendererTurbo(group0, 368, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(28.5f, -21.5f, -3).setRotationAngle(0, 0, 0).setName("Box 194")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(33.5f, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 193")
		);
		group0.add(new ModelRendererTurbo(group0, 18, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 192")
		);
		group0.add(new ModelRendererTurbo(group0, 231, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(29.5f, -20.5f, -3).setRotationAngle(0, 0, 0).setName("Box 191")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(29.5f, -20.5f, -1).setRotationAngle(0, 0, 0).setName("Box 190")
		);
		group0.add(new ModelRendererTurbo(group0, 284, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(31.5f, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 189")
		);
		group0.add(new ModelRendererTurbo(group0, 269, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0)
			.setRotationPoint(33.5f, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 188")
		);
		group0.add(new ModelRendererTurbo(group0, 206, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2)
			.setRotationPoint(29.5f, -20.5f, 1).setRotationAngle(0, 0, 0).setName("Box 187")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -19.5f, -4).setRotationAngle(0, 0, 0).setName("Box 38")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(60.75f, -19.5f, -2).setRotationAngle(0, 0, 0).setName("Box 23")
		);
		group0.add(new ModelRendererTurbo(group0, 95, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.75f, 0, -1, -0.75f, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0.6f, 0, -1, 0.6f, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -19.5f, -7).setRotationAngle(0, 0, 0).setName("Box 115")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -1, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -0.25f, 0, 0, 0, 0, 0)
			.setRotationPoint(60.75f, -19.5f, -4).setRotationAngle(0, 0, 0).setName("Box 173")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 115, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, -0.25f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(60.75f, -19.5f, 2).setRotationAngle(0, 0, 0).setName("Box 174")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 65, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25, -15.5f, -11).setRotationAngle(0, 0, 0).setName("Box 275")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 7, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -17, -3.5f).setRotationAngle(0, 0, 0).setName("Box 271")
		);
		group0.add(new ModelRendererTurbo(group0, 51, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 16, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -15, 4).setRotationAngle(0, 0, 0).setName("Box 270")
		);
		group0.add(new ModelRendererTurbo(group0, 469, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 18, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -15.5f, -10).setRotationAngle(0, 0, 0).setName("Box 270")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 16, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -15, -5).setRotationAngle(0, 0, 0).setName("Box 269")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 8, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -0.5f, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, 0, -0.5f, 0)
			.setRotationPoint(60, 1, -4).setRotationAngle(0, 0, 0).setName("Box 268")
		);
		group0.add(new ModelRendererTurbo(group0, 111, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(64, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 267")
		);
		group0.add(new ModelRendererTurbo(group0, 92, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(62, 3, 0.5f).setRotationAngle(0, 0, 0).setName("Box 266")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 120, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(62, 3, -0.5f).setRotationAngle(0, 0, 0).setName("Box 265")
		);
		group0.add(new ModelRendererTurbo(group0, 51, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(60, 3.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 114, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 1, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(62, 3, -1.5f).setRotationAngle(0, 0, 0).setName("Box 263")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 83, 7, 1, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -4, -0.8f, 0, -4, -0.8f, 0, -4, 0, 0, -4, 0)
			.setRotationPoint(-24, -15, -11.9f).setRotationAngle(0, 0, 0).setName("Box 204")
		);
		group0.add(new ModelRendererTurbo(group0, 347, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, 2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -15.5f, -11).setRotationAngle(0, 0, 0).setName("Box 190")
		);
		group0.add(new ModelRendererTurbo(group0, 143, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40, -15.5f, -11).setRotationAngle(0, 0, 0).setName("Box 191")
		);
		group0.add(new ModelRendererTurbo(group0, 412, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 11, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.1f, 0, 0, -0.1f)
			.setRotationPoint(-30, -15.5f, -11).setRotationAngle(0, 0, 0).setName("Left front door")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 11, 1, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.1f, 0, 0, -0.1f)
			.setRotationPoint(40, -11.5f, -11).setRotationAngle(0, 0, 0).setName("Left back door")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40, -0.5f, -11).setRotationAngle(0, 0, 0).setName("Box 194")
		);
		group0.add(new ModelRendererTurbo(group0, 124, 113, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(41, 3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 18, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41, 5.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 10, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 5, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 120, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(44, 4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(40, 4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 501, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-31, -15, -12).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(-25, -15, -12).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-25, 0, -12).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		group0.add(new ModelRendererTurbo(group0, 336, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-31, 0, -12).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		group0.add(new ModelRendererTurbo(group0, 496, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-25, -15, -12.5f).setRotationAngle(0, 0, 0).setName("Box 219")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(-31, -15, -12.5f).setRotationAngle(0, 0, 0).setName("Box 218")
		);
		group0.add(new ModelRendererTurbo(group0, 283, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f)
			.setRotationPoint(-29, -4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 118")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29, 0.5f, -11.8f).setRotationAngle(0, 0, 0).setName("Box 117")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29, 3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 276, 103, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29, 6.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 486, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 481, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 476, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(-26, 4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-30, 4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 9, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 6, 1, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29, -4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 217")
		);
		group0.add(new ModelRendererTurbo(group0, 466, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(39, -11, -12.5f).setRotationAngle(0, 0, 0).setName("Box 229")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(45, -11, -12.5f).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		group0.add(new ModelRendererTurbo(group0, 327, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(45, -11, -12).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(39, 0, -12).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		group0.add(new ModelRendererTurbo(group0, 372, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(39, -11, -12).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		group0.add(new ModelRendererTurbo(group0, 363, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(45, 0, -12).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		group0.add(new ModelRendererTurbo(group0, 419, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(58.5f, 4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 224")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.5f, 5.5f, -11).setRotationAngle(0, 0, 0).setName("Box 225")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(54.5f, 4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 226")
		);
		group0.add(new ModelRendererTurbo(group0, 409, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.5f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 227")
		);
		group0.add(new ModelRendererTurbo(group0, 368, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55.5f, 3.5f, -11).setRotationAngle(0, 0, 0).setName("Box 228")
		);
		group0.add(new ModelRendererTurbo(group0, 404, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58.5f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 229")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(54.5f, -7, -12.5f).setRotationAngle(0, 0, 0).setName("Box 230")
		);
		group0.add(new ModelRendererTurbo(group0, 382, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0)
			.setRotationPoint(58.5f, -7, -12.5f).setRotationAngle(0, 0, 0).setName("Box 231")
		);
		group0.add(new ModelRendererTurbo(group0, 354, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(54.5f, -7, -12).setRotationAngle(0, 0, 0).setName("Box 232")
		);
		group0.add(new ModelRendererTurbo(group0, 345, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(58.5f, -7, -12).setRotationAngle(0, 0, 0).setName("Box 233")
		);
		group0.add(new ModelRendererTurbo(group0, 312, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(58.5f, 0.5f, -12).setRotationAngle(0, 0, 0).setName("Box 234")
		);
		group0.add(new ModelRendererTurbo(group0, 500, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0)
			.setRotationPoint(54.5f, 0.5f, -12).setRotationAngle(0, 0, 0).setName("Box 235")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, -4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 236")
		);
		group0.add(new ModelRendererTurbo(group0, 372, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26, -4.5f, -11).setRotationAngle(0, 0, 0).setName("Box 238")
		);
		group0.add(new ModelRendererTurbo(group0, 351, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29, -2.5f, -11.8f).setRotationAngle(0, 0, 0).setName("Box 239")
		);
		group0.add(new ModelRendererTurbo(group0, 461, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-9.5f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 5, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 0.5f, -10).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 372, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -3, 0, 0, -3, 0, 0, -0.5f, 0)
			.setRotationPoint(19.5f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 120")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 463, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, 5.5f, -10).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(5, 5.5f, 8).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 361, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -3, 0)
			.setRotationPoint(-13.5f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 254")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-9.5f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 255")
		);
		group0.add(new ModelRendererTurbo(group0, 350, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -3, 0, 0, -3, 0, 0, -0.5f, 0)
			.setRotationPoint(19.5f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 256")
		);
		group0.add(new ModelRendererTurbo(group0, 339, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -3, 0)
			.setRotationPoint(-13.5f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 257")
		);
		group0.add(new ModelRendererTurbo(group0, 338, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 65, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25, -15.5f, 10).setRotationAngle(0, 0, 0).setName("Box 258")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 83, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, -4, 0, 0, -4, 0, 0, -4, -0.8f, 0, -4, -0.8f)
			.setRotationPoint(-24, -15, 10.9f).setRotationAngle(0, 0, 0).setName("Box 259")
		);
		group0.add(new ModelRendererTurbo(group0, 386, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 11, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-30, -15.5f, 10).setRotationAngle(0, 0, 0).setName("Right front door")
		);
		group0.add(new ModelRendererTurbo(group0, 491, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(-31, -15, 11).setRotationAngle(0, 0, 0).setName("Box 261")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(-25, -15, 11).setRotationAngle(0, 0, 0).setName("Box 262")
		);
		group0.add(new ModelRendererTurbo(group0, 473, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-25, 0, 11).setRotationAngle(0, 0, 0).setName("Box 263")
		);
		group0.add(new ModelRendererTurbo(group0, 432, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-31, 0, 11).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		group0.add(new ModelRendererTurbo(group0, 279, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-25, -15, 11.5f).setRotationAngle(0, 0, 0).setName("Box 265")
		);
		group0.add(new ModelRendererTurbo(group0, 274, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 16, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-31, -15, 11.5f).setRotationAngle(0, 0, 0).setName("Box 266")
		);
		group0.add(new ModelRendererTurbo(group0, 60, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.8f, 0, -0.5f, -0.8f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29, -4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 267")
		);
		group0.add(new ModelRendererTurbo(group0, 272, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-29, 0.5f, 10.8f).setRotationAngle(0, 0, 0).setName("Box 268")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-29, 3.5f, 10).setRotationAngle(0, 0, 0).setName("Box 269")
		);
		group0.add(new ModelRendererTurbo(group0, 155, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29, 6.5f, 10).setRotationAngle(0, 0, 0).setName("Box 270")
		);
		group0.add(new ModelRendererTurbo(group0, 215, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 271")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 272")
		);
		group0.add(new ModelRendererTurbo(group0, 196, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(-26, 4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 273")
		);
		group0.add(new ModelRendererTurbo(group0, 191, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(-30, 4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 274")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 112, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f, 0, 0, 0, 0, 0, 0, 0, 0, -0.2f, 0, 0, -0.2f)
			.setRotationPoint(-29, -4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 275")
		);
		group0.add(new ModelRendererTurbo(group0, 186, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, -4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 276")
		);
		group0.add(new ModelRendererTurbo(group0, 172, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26, -4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 277")
		);
		group0.add(new ModelRendererTurbo(group0, 271, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-29, -2.5f, 10.8f).setRotationAngle(0, 0, 0).setName("Box 278")
		);
		group0.add(new ModelRendererTurbo(group0, 406, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(45, -15.5f, 10).setRotationAngle(0, 0, 0).setName("Box 279")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 94, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40, -15.5f, 10).setRotationAngle(0, 0, 0).setName("Box 280")
		);
		group0.add(new ModelRendererTurbo(group0, 130, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 11, 1, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(40, -11.5f, 10).setRotationAngle(0, 0, 0).setName("Right back door")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40, -0.5f, 10).setRotationAngle(0, 0, 0).setName("Box 282")
		);
		group0.add(new ModelRendererTurbo(group0, 148, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(44, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 283")
		);
		group0.add(new ModelRendererTurbo(group0, 502, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(41, 3.5f, 10).setRotationAngle(0, 0, 0).setName("Box 284")
		);
		group0.add(new ModelRendererTurbo(group0, 212, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(41, 5.5f, 10).setRotationAngle(0, 0, 0).setName("Box 285")
		);
		group0.add(new ModelRendererTurbo(group0, 143, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(40, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 286")
		);
		group0.add(new ModelRendererTurbo(group0, 138, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(44, 4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 287")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(40, 4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 288")
		);
		group0.add(new ModelRendererTurbo(group0, 128, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(58.5f, 4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 289")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(55.5f, 5.5f, 10).setRotationAngle(0, 0, 0).setName("Box 290")
		);
		group0.add(new ModelRendererTurbo(group0, 106, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0)
			.setRotationPoint(54.5f, 4.5f, 10).setRotationAngle(0, 0, 0).setName("Box 291")
		);
		group0.add(new ModelRendererTurbo(group0, 101, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(54.5f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 292")
		);
		group0.add(new ModelRendererTurbo(group0, 458, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(55.5f, 3.5f, 10).setRotationAngle(0, 0, 0).setName("Box 293")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(58.5f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 294")
		);
		group0.add(new ModelRendererTurbo(group0, 86, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(39, -11, 11.5f).setRotationAngle(0, 0, 0).setName("Box 295")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 12, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(45, -11, 11.5f).setRotationAngle(0, 0, 0).setName("Box 296")
		);
		group0.add(new ModelRendererTurbo(group0, 423, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(45, -11, 11).setRotationAngle(0, 0, 0).setName("Box 297")
		);
		group0.add(new ModelRendererTurbo(group0, 414, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(39, 0, 11).setRotationAngle(0, 0, 0).setName("Box 298")
		);
		group0.add(new ModelRendererTurbo(group0, 196, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(39, -11, 11).setRotationAngle(0, 0, 0).setName("Box 299")
		);
		group0.add(new ModelRendererTurbo(group0, 177, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(45, 0, 11).setRotationAngle(0, 0, 0).setName("Box 300")
		);
		group0.add(new ModelRendererTurbo(group0, 76, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(54.5f, -7, 11.5f).setRotationAngle(0, 0, 0).setName("Box 301")
		);
		group0.add(new ModelRendererTurbo(group0, 22, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(58.5f, -7, 11.5f).setRotationAngle(0, 0, 0).setName("Box 302")
		);
		group0.add(new ModelRendererTurbo(group0, 141, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(54.5f, -7, 11).setRotationAngle(0, 0, 0).setName("Box 303")
		);
		group0.add(new ModelRendererTurbo(group0, 86, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(58.5f, -7, 11).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 155, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(58.5f, 0.5f, 11).setRotationAngle(0, 0, 0).setName("Box 305")
		);
		group0.add(new ModelRendererTurbo(group0, 112, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f)
			.setRotationPoint(54.5f, 0.5f, 11).setRotationAngle(0, 0, 0).setName("Box 306")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 2, 0, 0, -5, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, -5, 0, 0, 5.05f, 0, -2.5f, 0, 0, -2.5f, 0, 0, 0, 5.05f, 0)
			.setRotationPoint(-42, -19.5f, -1).setRotationAngle(0, 0, 0).setName("Box 307")
		);
		group0.add(new ModelRendererTurbo(group0, 366, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.9f, -1.75f, 0, 1, -0.5f, 0, 0.5f, 0, 0, -0.625f, -1.25f, 0, -1.55f, 0.75f, 0, 0.75f, 0.5f, 0, 0.5f, 0, 0, -1.3f, 0.25f, 0)
			.setRotationPoint(-40, -19.5f, -4).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		group0.add(new ModelRendererTurbo(group0, 357, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.5f, -2.15f, 0, 0.5f, -1, 0, 0, 0, 0, 0.1f, -1.25f, 0, -1.25f, 1.25f, 0, 0.5f, 1, 0, -0.25f, 0, 0, -0.55f, 0.25f, 0)
			.setRotationPoint(-39, -19, -7).setRotationAngle(0, 0, 0).setName("Box 309")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.6f, -2, 0, 0.4f, -1, 0, 0, 0, 0, 0, -1.15f, 0, -1.25f, 1, 0, 0.5f, 0.75f, 0, 0, 0, 0, -0.75f, 0.25f, 0)
			.setRotationPoint(-38.5f, -18, -9).setRotationAngle(0, 0, 0).setName("Box 310")
		);
		group0.add(new ModelRendererTurbo(group0, 256, 102, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.7f, -0.5f, 0, 0, -0.15f, 0, -0.4f, 0.4f, 0, -0.2f, 0.25f, 0, -0.7f, 0.5f, 0, 0, 0.115f, 0, -0.4f, -0.6f, 0, -0.2f, -0.15f, 0)
			.setRotationPoint(-41, -13.5f, -9).setRotationAngle(0, 0, 0).setName("Box 311")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -11.5f, -10).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 348, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.7f, -0.75f, 0, 0.1f, -0.6f, 0, -0.5f, 0.25f, 0, -0.1f, 0, 0, -0.7f, 0.85f, 0, 0.1f, 0.4f, 0, -0.5f, -0.25f, 0, -0.1f, 0.2f, 0)
			.setRotationPoint(-41.5f, -14.5f, -7).setRotationAngle(0, 0, 0).setName("Box 313")
		);
		group0.add(new ModelRendererTurbo(group0, 462, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -1, 0, -1, 0, 0, -1, 0, -1.5f, 0, -0.5f, -1.5f, 0, -1, 0.5f, -1, 0, 0.5f, -1, 0, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-37, -17, 9).setRotationAngle(0, 0, 0).setName("Box 318")
		);
		group0.add(new ModelRendererTurbo(group0, 339, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, -0.25f, 0, 0, -1, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, -0.25f, 0, 0, -1, 0.6f, 0, 0, 0.6f, 0)
			.setRotationPoint(60, -19.5f, 4).setRotationAngle(0, 0, 0).setName("Box 319")
		);
		group0.add(new ModelRendererTurbo(group0, 308, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 18, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -17.5f, -9).setRotationAngle(0, 0, 0).setName("Box 320")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -18, -7).setRotationAngle(0, 0, 0).setName("Box 321")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(59, -19, -4).setRotationAngle(0, 0, 0).setName("Box 322")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1.1f, 0, 0, -1.1f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(59, -19, -7).setRotationAngle(0, 0, 0).setName("Box 323")
		);
		group0.add(new ModelRendererTurbo(group0, 224, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.1f, 0, 0, -1.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(59, -19, 4).setRotationAngle(0, 0, 0).setName("Box 324")
		);
		group0.add(new ModelRendererTurbo(group0, 301, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -18, -9).setRotationAngle(0, 0, 0).setName("Box 325")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -18, 7).setRotationAngle(0, 0, 0).setName("Box 326")
		);
		group0.add(new ModelRendererTurbo(group0, 17, 119, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -17.5f, -10).setRotationAngle(0, 0, 0).setName("Box 327")
		);
		group0.add(new ModelRendererTurbo(group0, 461, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, -17.5f, 9).setRotationAngle(0, 0, 0).setName("Box 328")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.6f, -0.5f, 0, 0, -0.25f, 0, -0.55f, 0.15f, 0, 0, -0.5f, 0, -0.6f, 0.7f, 0, 0, 0.25f, 0, -0.65f, 0, 0, 0, 0.55f, 0)
			.setRotationPoint(-42, -15, -4).setRotationAngle(0, 0, 0).setName("Box 303")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 11, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-45, -9.5f, 10).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 249, 0, textureX, textureY).addBox(0, 0, 0, 84, 1, 20)
			.setRotationPoint(-45, -4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 120")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, 0, 104, 1, 20)
			.setRotationPoint(-45, -0.5f, -10).setRotationAngle(0, 0, 0).setName("Box 307")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 15, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -15.5f, -10).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		group0.add(new ModelRendererTurbo(group0, 236, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -17.5f, 9).setRotationAngle(0, 0, 0).setName("Box 309")
		);
		group0.add(new ModelRendererTurbo(group0, 233, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 18, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -17.5f, -9).setRotationAngle(0, 0, 0).setName("Box 310")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -18, 7).setRotationAngle(0, 0, 0).setName("Box 311")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -18, -7).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 115, 111, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.1f, 0, 0, -1.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(39, -19, 4).setRotationAngle(0, 0, 0).setName("Box 313")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(39, -19, -4).setRotationAngle(0, 0, 0).setName("Box 314")
		);
		group0.add(new ModelRendererTurbo(group0, 503, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1.1f, 0, 0, -1.1f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(39, -19, -7).setRotationAngle(0, 0, 0).setName("Box 315")
		);
		group0.add(new ModelRendererTurbo(group0, 357, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -18, -9).setRotationAngle(0, 0, 0).setName("Box 316")
		);
		group0.add(new ModelRendererTurbo(group0, 231, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(39, -17.5f, -10).setRotationAngle(0, 0, 0).setName("Box 317")
		);
		group0.add(new ModelRendererTurbo(group0, 383, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 11, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -15.5f, -10).setRotationAngle(0, 0, 0).setName("Box 318")
		);
		group0.add(new ModelRendererTurbo(group0, 167, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -17.5f, 9).setRotationAngle(0, 0, 0).setName("Box 319")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 18, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -17.5f, -9).setRotationAngle(0, 0, 0).setName("Box 320")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -18, 7).setRotationAngle(0, 0, 0).setName("Box 321")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 14, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -18, -7).setRotationAngle(0, 0, 0).setName("Box 322")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1.1f, 0, 0, -1.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(-23, -19, 4).setRotationAngle(0, 0, 0).setName("Box 323")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 8, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(-23, -19, -4).setRotationAngle(0, 0, 0).setName("Box 324")
		);
		group0.add(new ModelRendererTurbo(group0, 485, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1.1f, 0, 0, -1.1f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0, 0, 0.1f, 0)
			.setRotationPoint(-23, -19, -7).setRotationAngle(0, 0, 0).setName("Box 325")
		);
		group0.add(new ModelRendererTurbo(group0, 482, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1, 0, 0, -1, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -18, -9).setRotationAngle(0, 0, 0).setName("Box 326")
		);
		group0.add(new ModelRendererTurbo(group0, 162, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -2, 0, 0, -2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-23, -17.5f, -10).setRotationAngle(0, 0, 0).setName("Box 327")
		);
		group0.add(new ModelRendererTurbo(group0, 210, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 17, 0, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 0.25f)
			.setRotationPoint(-48, -0.5f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 328")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, -0.95f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.95f, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-48, -0.5f, -9.75f).setRotationAngle(0, 0, 0).setName("Box 329")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 10, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-51, -0.5f, -5).setRotationAngle(0, 0, 0).setName("Box 330")
		);
		group0.add(new ModelRendererTurbo(group0, 368, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53.5f, -0.5f, -2).setRotationAngle(0, 0, 0).setName("Box 331")
		);
		group0.add(new ModelRendererTurbo(group0, 476, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.25f, 0, 0, -0.75f, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-52.5f, -0.5f, -5).setRotationAngle(0, 0, 0).setName("Box 332")
		);
		group0.add(new ModelRendererTurbo(group0, 212, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0.5f, 0, -4, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0, 0.5f, 0, -4, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0)
			.setRotationPoint(-51, -0.5f, -9).setRotationAngle(0, 0, 0).setName("Box 333")
		);
		group0.add(new ModelRendererTurbo(group0, 298, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.95f, 0, 0, 0, 0, 0, 0, 0, 0, 0.25f, 0, 0, -0.95f)
			.setRotationPoint(-48, -0.5f, 8.75f).setRotationAngle(0, 0, 0).setName("Box 334")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f, 0.5f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.75f, 0, -0.25f)
			.setRotationPoint(-52.5f, -0.5f, 2).setRotationAngle(0, 0, 0).setName("Box 335")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 4, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, -4, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, -4)
			.setRotationPoint(-51, -0.5f, 5).setRotationAngle(0, 0, 0).setName("Box 336")
		);
		group0.add(new ModelRendererTurbo(group0, 117, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 5, 0, -3, 0, -5, 2, 0, -4, 2, 0, -1, -3, 0, 0, 1.5f, 0, 0, -1.5f, 0, 0, 2, 0, -1.25f, -3, 0, 0)
			.setRotationPoint(-51, -8.5f, 5).setRotationAngle(0, 0, 0).setName("Box 337")
		);
		group0.add(new ModelRendererTurbo(group0, 104, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 10, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, -3, 0, 0, 1.5f, 0, 0, -1.5f, 0, 0, -1.5f, 0, -5, 1.5f, 0, -5)
			.setRotationPoint(-51, -8.5f, 5).setRotationAngle(0, 0, 0).setName("Box 338")
		);
		group0.add(new ModelRendererTurbo(group0, 426, 110, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(1, 2, 3)
			.setCorners(-1, 0, 0, 0, 0, 0, 0, -2, -0.5f, 0, -2, -1, -1, -1, 0, 0, -1, 0, 0, 0.5f, -1, 0, 0.5f, -1)
			.setPolygonUV(1, new float[]{ 3.0f, 3.0f, 0.0f, 3.0f, 0.0f, 5.0f, 3.0f, 5.0f })
			.setPolygonUV(5, new float[]{ 8.0f, 3.0f, 7.0f, 3.0f, 7.0f, 5.0f, 8.0f, 5.0f })
			.setPolygonUV(2, new float[]{ 4.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 4.0f, 3.0f }).build()
			.setRotationPoint(-48, -13.5f, 7).setRotationAngle(0, 0, 0).setName("Box 339")
		);
		group0.add(new ModelRendererTurbo(group0, 417, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, -0.55f, 0.15f, 0, 0, -0.25f, 0, -0.6f, -0.5f, 0, 0, 0.55f, 0, -0.65f, 0, 0, 0, 0.25f, 0, -0.6f, 0.7f, 0)
			.setRotationPoint(-42, -15, 1).setRotationAngle(0, 0, 0).setName("Box 303")
		);
		group0.add(new ModelRendererTurbo(group0, 408, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.1f, 0, 0, -0.5f, 0.25f, 0, 0.1f, -0.6f, 0, -0.7f, -0.75f, 0, -0.1f, 0.2f, 0, -0.5f, -0.25f, 0, 0.1f, 0.4f, 0, -0.7f, 0.85f, 0)
			.setRotationPoint(-41.5f, -14.5f, 4).setRotationAngle(0, 0, 0).setName("Box 313")
		);
		group0.add(new ModelRendererTurbo(group0, 93, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.2f, 0.25f, 0, -0.4f, 0.4f, 0, 0, -0.125f, 0, -0.7f, -0.5f, 0, -0.2f, -0.15f, 0, -0.4f, -0.6f, 0, 0, 0.1f, 0, -0.7f, 0.5f, 0)
			.setRotationPoint(-41, -13.5f, 7).setRotationAngle(0, 0, 0).setName("Box 311")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0.3f, 0, 0, -1.1f, 4, 0, -0.85f, 3.3f, 0, 0, -0.5f, 0, 0.3f, 0, 0, -1, -4.25f, 0, -0.85f, -3.5f, 0, 0, 0.5f, 0)
			.setRotationPoint(-40, -13, 9).setRotationAngle(0, 0, 0).setName("Box 311")
		);
		group0.add(new ModelRendererTurbo(group0, 499, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, 0.5f, 0, -0.85f, 4.3f, 0, -0.5f, 3.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.85f, -4, 0, -0.5f, -4, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-40, -12, 10).setRotationAngle(0, 0, 0).setName("Box 311")
		);
		group0.add(new ModelRendererTurbo(group0, 91, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36, -15, 10).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 157, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -15.5f, 10).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 399, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39, -15, 10).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -11.5f, 10).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3.15f, -0.5f, 0, 3, -0.5f, 0, 3, -0.5f, 0, -3.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(-40, -15.5f, 10).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 78, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-36, -15, -11).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 118, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -15.5f, -11).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 455, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.15f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.15f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-37, -15.5f, 10).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 390, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 4, 1, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-39, -15, -11).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -11.5f, -11).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.5f, 0, -0.5f, 3.5f, 0, -0.85f, 4.3f, 0, 0, 0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -4, 0, -0.85f, -4, 0, 0, -0.5f, 0)
			.setRotationPoint(-40, -12, -11).setRotationAngle(0, 0, 0).setName("Box 311")
		);
		group0.add(new ModelRendererTurbo(group0, 456, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -3.5f, -0.5f, 0, 3, -0.5f, 0, 3, -0.5f, 0, -3.15f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -15.5f, -11).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 201, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.5f, 0, -0.85f, 3.3f, 0, -1.1f, 4, 0, 0.3f, 0, 0, 0, 0.5f, 0, -0.85f, -3.5f, 0, -1, -4.25f, 0, 0.3f, 0, 0)
			.setRotationPoint(-40, -13, -10).setRotationAngle(0, 0, 0).setName("Box 311")
		);
		group0.add(new ModelRendererTurbo(group0, 440, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.15f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.15f, -0.5f, 0)
			.setRotationPoint(-37, -15.5f, -11).setRotationAngle(0, 0, 0).setName("Box 304")
		);
		group0.add(new ModelRendererTurbo(group0, 277, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -0.63f, -1.25f, 0, 0.5f, 0, 0, 1, -0.5f, 0, -0.9f, -1.75f, 0, -1.3f, 0.25f, 0, 0.5f, 0, 0, 0.75f, 0.5f, 0, -1.55f, 0.75f, 0)
			.setRotationPoint(-40, -19.5f, 1).setRotationAngle(0, 0, 0).setName("Box 308")
		);
		group0.add(new ModelRendererTurbo(group0, 199, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0.1f, -1.25f, 0, 0, 0, 0, 0.5f, -1, 0, -0.5f, -2.15f, 0, -0.55f, 0.25f, 0, -0.25f, 0, 0, 0.5f, 1, 0, -1.25f, 1.25f, 0)
			.setRotationPoint(-39, -19, 4).setRotationAngle(0, 0, 0).setName("Box 309")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1.15f, 0, 0, 0, 0, 0.4f, -1, 0, -0.6f, -2, 0, -0.75f, 0.25f, 0, 0, 0, 0, 0.5f, 0.75f, 0, -1.25f, 1, 0)
			.setRotationPoint(-38.5f, -18, 7).setRotationAngle(0, 0, 0).setName("Box 310")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, -0.4f, -1, 0, -0.5f, -0.4f, 0, -0.5f, 0.75f, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, 0, 0, -0.5f, -0.9f, 0, 0, 0, 0)
			.setRotationPoint(-37.5f, -18, -9).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 234, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, 0, 0, 0, -0.5f, 0, 0, -2.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, -0.5f, 0, 0, -2.75f, 0.5f, 0, -0.25f, 0.5f, 0)
			.setRotationPoint(-38.5f, -19.5f, 1).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -2, -1.5f, 0, -1, -1.5f, 0, -0.25f, 0.5f, 0, -0.5f, 0, 0, -2, 1.5f, 0, -1, 1.5f, 0)
			.setRotationPoint(-38.5f, -19.5f, 4).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 192, 91, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(-0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2.5f, 0, 0, -0.25f, 0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -2.5f, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-38.5f, -19.5f, -4).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 192, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, -0.5f, 0.75f, 0, -0.5f, -0.4f, 0, -0.4f, -1, 0, 0, 0, 0, -0.5f, -0.9f, 0, -0.5f, 0, 0, -0.5f, 0.75f, 0)
			.setRotationPoint(-37.5f, -18, 7).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 329, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.15f, -0.7f, -1, 0, 0, -1, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, -0.15f, 0.5f, -1, 0, 0.5f, -1, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0)
			.setRotationPoint(-37, -17, 9).setRotationAngle(0, 0, 0).setName("Box 318")
		);
		group0.add(new ModelRendererTurbo(group0, 36, 108, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -1, 0.6f, 0, 0, 0.6f, 0, 0, 0, 0, -0.15f, -0.7f, 0, -1, -1, 0, 0, -1, 0, 0, 0.5f, 0, -0.15f, 0.5f, 0)
			.setRotationPoint(-37, -17, 9).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 325, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.1f, 0, 0, 0, 0.6f, 0, -0.85f, -0.7f, 0, -0.15f, -0.7f, 0, 0, -0.25f, 0, 0, -1, 0, -0.85f, 0.5f, 0, -0.15f, 0.5f, 0)
			.setRotationPoint(-37, -17, 9).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -2.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -1, -1.5f, 0, -2.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0.6f, 0, -1, 1.5f, 0)
			.setRotationPoint(-38.5f, -19.5f, 4).setRotationAngle(0, 0, 0).setName("Box 370")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 86, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 3, 0, -2.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -2.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.25f, 0.5f, 0)
			.setRotationPoint(-38.5f, -19.5f, 1).setRotationAngle(0, 0, 0).setName("Box 373")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -1.5f, 0, 0, -1.5f, 0, 0, 0, -1, -1, 0, -1, -0.5f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, -1, -1, 0.5f, -1)
			.setRotationPoint(-37, -17, -11).setRotationAngle(0, 0, 0).setName("Box 378")
		);
		group0.add(new ModelRendererTurbo(group0, 439, 78, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, 0, 0, -1, -0.15f, -0.7f, -1, -0.5f, 0.5f, 0, -0.5f, 0.5f, 0, 0, 0.5f, -1, -0.15f, 0.5f, -1)
			.setRotationPoint(-37, -17, -11).setRotationAngle(0, 0, 0).setName("Box 379")
		);
		group0.add(new ModelRendererTurbo(group0, 314, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15f, -0.7f, 0, 0, 0, 0, 0, 0.6f, 0, -1, 0.6f, 0, -0.15f, 0.5f, 0, 0, 0.5f, 0, 0, -1, 0, -1, -1, 0)
			.setRotationPoint(-37, -17, -10).setRotationAngle(0, 0, 0).setName("Box 380")
		);
		group0.add(new ModelRendererTurbo(group0, 190, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.15f, -0.7f, 0, -0.85f, -0.7f, 0, 0, 0.6f, 0, 0.1f, 0, 0, -0.15f, 0.5f, 0, -0.85f, 0.5f, 0, 0, -1, 0, 0, -0.25f, 0)
			.setRotationPoint(-37, -17, -10).setRotationAngle(0, 0, 0).setName("Box 381")
		);
		group0.add(new ModelRendererTurbo(group0, 190, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, 1, 0, 0, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-42, -13.5f, -10).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, -0.4f, -0.25f, 0, -1, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, -0.4f, 0.25f, 0, -1, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-42, -14.75f, -4).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -1.1f, 0, -0.3f, -1, 0, -0.8f, -0.25f, 0, 0, -0.25f, 0, 0, 1, 0, -0.3f, 1, 0, -0.8f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-41, -14, -9).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 135, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -1, 0, 0.2f, -1, 0, -0.4f, -0.25f, 0, 0, -0.25f, 0, 0, 1, 0, 0.2f, 1, 0, -0.4f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-42, -14.75f, -7).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 89, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, -1, -0.25f, 0, -0.4f, -0.25f, 0, 0, -0.25f, 0, 0, 0.25f, 0, -1, 0.25f, 0, -0.4f, 0.25f, 0, 0, 0.25f, 0)
			.setRotationPoint(-42, -14.75f, 1).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 80, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.25f, 0, -0.4f, -0.25f, 0, 0.2f, -1, 0, 0, -1, 0, 0, 0.25f, 0, -0.4f, 0.25f, 0, 0.2f, 1, 0, 0, 1, 0)
			.setRotationPoint(-42, -14.75f, 4).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 92, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.25f, 0, -0.8f, -0.25f, 0, -0.3f, -1, 0, 0, -1.1f, 0, 0, 0.25f, 0, -0.8f, 0.25f, 0, -0.3f, 1, 0, 0, 1, 0)
			.setRotationPoint(-41, -14, 7).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 179, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.6f, 0, -0.3f, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0.5f, 0, -0.3f, 0.5f, 0, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(-41, -13.5f, 9).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -0.1f, 0.9f, 0, 0, 0, 0, -1, -0.3f, 0, -1, -0.75f, 0, 0, 0.9f, 0, 0, 0, 0, 0, -0.3f, 0, 0, -0.75f)
			.setRotationPoint(-45, -12.5f, 10).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f)
			.setRotationPoint(-42, -12.5f, 10).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.2f, 0.5f, 0, -0.1f, -0.1f, 0, -1, 0.25f, 0, -1, -0.5f, 0, 0, 0.5f, 0, 0, -0.1f, 0, 0, 0.25f, 0, 0, -0.5f)
			.setRotationPoint(-47, -12.5f, 9).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 83, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(5, 1, 3)
			.setCorners(0, 0, 0, 0, -1, -3, 0, -1, 0, 0, -1.2f, -1.5f, 0, 0, 0, 0, 1, -3, 0, 1, 0, 0, 1, -1.5f)
			.setPolygonUV(0, new float[]{ 11.0f, 3.0f, 8.0f, 3.0f, 8.0f, 4.0f, 11.0f, 4.0f })
			.setPolygonUV(2, new float[]{ 8.0f, 0.0f, 3.0f, 0.0f, 3.0f, 2.0f, 8.0f, 0.0f }).build()
			.setRotationPoint(-47, -13.5f, 7).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 469, 82, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(5, 1, 3)
			.setCorners(0, 0, 0, 0, 0.25f, 0, 0, -1, 0, 0, 0, -3, 0, 0, 0, 0, -0.25f, 0, 0, 1, 0, 0, 0, -3)
			.setPolygonUV(2, new float[]{ 8.0f, 0.0f, 3.0f, 2.0f, 3.0f, 3.0f, 8.0f, 3.0f }).build()
			.setRotationPoint(-47, -13.5f, 7).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, -1.5f, 0, 0, -0.75f, 0, 0, 0.75f, 0, 0, 1, 0, 0, -0.75f, 0, 0, 0, 0, 0, 1, 0, 0, 1)
			.setRotationPoint(-47, -11.5f, -11).setRotationAngle(0, 0, 0).setName("Box 81")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 82, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(5, 2, 1)
			.setCorners(0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setPolygonUV(4, new float[]{ 6.0f, 1.0f, 1.0f, 1.0f, 1.0f, 3.0f, 6.0f, 1.0f })
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 6.0f, 1.0f }).build()
			.setRotationPoint(-45, -11.5f, -11).setRotationAngle(0, 0, 0).setName("Box 43")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 79, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(5, 2, 1)
			.setCorners(0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(4, new float[]{ 6.0f, 1.0f, 1.0f, 3.0f, 1.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-45, -11.5f, -11).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 167, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, -1, -0.75f, 0, -1, -0.3f, 0, 0, 0, 0, -0.1f, 0.9f, 0, 0, -0.75f, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0.9f)
			.setRotationPoint(-45, -12.5f, -11).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 439, 75, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, -0.3f, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.3f, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -12.5f, -11).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, -0.5f, 0, -1, 0.25f, 0, -0.1f, -0.1f, 0, -0.2f, 0.5f, 0, 0, -0.5f, 0, 0, 0.25f, 0, 0, -0.1f, 0, 0, 0.5f)
			.setRotationPoint(-47, -12.5f, -10).setRotationAngle(0, 0, 0).setName("Box 128")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0.75f, 0, 0, 1, 0)
			.setRotationPoint(-47, -14.5f, 4).setRotationAngle(0, 0, 0).setName("Box 40")
		);
		group0.add(new ModelRendererTurbo(group0, 288, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0.25f, 0, 0, 0.25f, 0, 0, -1, 0, 0, -1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 1, 0, 0, 1, 0)
			.setRotationPoint(-42, -13.5f, 7).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 367, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.8f, 0, 0, -0.8f, 0, 0, -0.35f, -0.65f, -0.75f, -0.35f, -0.65f)
			.setRotationPoint(-52.5f, -14.25f, 0).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 122, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.35f, -0.65f, 0, -0.35f, -0.65f, 0, -0.8f, 0, -0.75f, -0.8f, 0)
			.setRotationPoint(-52.5f, -14.25f, -2).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.65f, -0.35f, -0.75f, -0.65f, -0.35f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.75f, 0, -0.8f)
			.setRotationPoint(-52.5f, -14.25f, -2).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 290, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.65f, -0.35f, 0, -0.65f, -0.35f, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f)
			.setRotationPoint(-52.5f, -12.25f, 1).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 238, 107, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.75f, 0, -0.8f, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.65f, -0.35f, -0.75f, -0.65f, -0.35f)
			.setRotationPoint(-52.5f, -12.25f, -2).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 92, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, -0.8f, 0, 0, -0.8f, 0, 0, -0.35f, -0.65f, -0.75f, -0.35f, -0.65f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f)
			.setRotationPoint(-52.5f, -11.25f, 0).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 81, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, -0.35f, -0.65f, 0, -0.35f, -0.65f, 0, -0.8f, 0, -0.75f, -0.8f, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-52.5f, -11.25f, -2).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 167, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, -13.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Front light top L")
		);
		group0.add(new ModelRendererTurbo(group0, 70, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-51.5f, -11.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Front light top R")
		);
		group0.add(new ModelRendererTurbo(group0, 308, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 4, 0, -1.75f, 0, 0, -1.25f, 0, 0, 0.75f, 0, -1.5f, -4.05f, 0, -0.95f, 0.25f, 0, 0, -3.25f, 0, 0, -0.9f, 0, -1.6f, -2.4f, 0, -1)
			.setRotationPoint(-53, 1.5f, 5).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 65, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 4, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 2, 0, 0, -3, 0, 0, -3, 0, 0, 2, 0, 0)
			.setRotationPoint(-53, 1.5f, -2).setRotationAngle(0, 0, 0).setName("Box 160")
		);
		group0.add(new ModelRendererTurbo(group0, 328, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 3, 0, -2.75f, 0, 0, 1.75f, 0, 0, 0, 0, 0, -1, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -2, 0, 0, 1, 0, 0)
			.setRotationPoint(-54, 1.5f, -5).setRotationAngle(0, 0, 0).setName("Box 159")
		);
		group0.add(new ModelRendererTurbo(group0, 71, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, 1.25f, 0, 0, -1.75f, 0, 0, 0, 1.055f, 0, -0.35f, -1.25f, 0, 0.75f, -1.25f, 0, -1.25f, 1.055f, 0, 0.35f)
			.setRotationPoint(-47, 1.5f, -9.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 65, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(4, 7, 3)
			.setCorners(-4.75f, 0, -1.5f, 2, 0, -2.5f, 2, 0, 0.5f, -4.05f, 0, -0.95f, -3.1f, 0, -1.4f, 0.5f, 0, -2, 0.5f, 0, 0, -2.4f, 0, -1)
			.setPolygonUV(5, new float[]{ 14.0f, 3.0f, 12.0f, 3.0f, 12.0f, 10.0f, 14.0f, 10.0f }).build()
			.setRotationPoint(-53, 1.5f, 6).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 234, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 7, 4, 0, -4.05f, 0, -0.95f, 0.75f, 0, -1.5f, -1.25f, 0, 0, -1.75f, 0, 0, -2.4f, 0, -1, -0.9f, 0, -1.6f, -3.25f, 0, 0, 0.25f, 0, 0)
			.setRotationPoint(-53, 1.5f, -9).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 55, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(4, 7, 3)
			.setCorners(-4.05f, 0, -0.95f, 2, 0, 0.5f, 2, 0, -2.5f, -4.75f, 0, -1.5f, -2.4f, 0, -1, 0.5f, 0, 0, 0.5f, 0, -2, -3.1f, 0, -1.4f)
			.setPolygonUV(4, new float[]{ 7.0f, 3.0f, 5.0f, 3.0f, 5.0f, 10.0f, 7.0f, 10.0f }).build()
			.setRotationPoint(-53, 1.5f, -9).setRotationAngle(0, 0, 0).setName("Box 165")
		);
		group0.add(new ModelRendererTurbo(group0, 317, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 3, 0, -1, 0, 0, 0, 0, 0, 1.75f, 0, 0, -2.75f, 0, 0, 1, 0, 0, -2, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-54, 1.5f, 2).setRotationAngle(0, 0, 0).setName("Box 306")
		);
		group0.add(new ModelRendererTurbo(group0, 279, 68, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(5, 1, 3)
			.setCorners(0, -1.2f, -1.5f, 0, -1, 0, 0, -1, -3, 0, 0, 0, 0, 1, -1.5f, 0, 1, 0, 0, 1, -3, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 8.0f, 0.0f, 3.0f, 0.0f, 3.0f, 2.0f, 8.0f, 2.0f }).build()
			.setRotationPoint(-47, -13.5f, -10).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 262, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 1, 3, 0, 0, 0, -3, 0, -1, 0, 0, 0.25f, 0, 0, 0, 0, 0, 0, -3, 0, 1, 0, 0, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(-47, -13.5f, -10).setRotationAngle(0, 0, 0).setName("Box 41")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -12.5f, -9).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 306, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -1, 0, 0, -1, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -14, -6).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 193, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -13, -9).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 242, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -1, 0, 0, -1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -12.5f, -10).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -11.5f, 3).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -12.5f, 3).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 182, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 3, 0, 0, -0.55f, 0, 0, -0.55f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -14, 3).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 171, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -13, 6).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 330, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -12.5f, 9).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 160, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 8, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -12.5f, -3).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 105, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -13.5f, -3).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 213, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f)
			.setRotationPoint(-38, -12.8f, 7.45f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 220, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.45f, -0.6f, -0.5f, -0.45f, -0.6f, -0.5f, -0.45f, -0.6f, -0.25f, -0.45f, -0.6f, -0.25f, -0.45f, -0.3f, -0.5f, -0.45f, -0.3f, -0.5f, -0.45f, -0.3f, -0.25f, -0.45f, -0.3f, -0.25f)
			.setRotationPoint(-38, -12.8f, 7).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 112, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, -0.7f, 0.1f, -0.9f, -0.7f, 0.1f, -0.9f, -0.7f, 0.1f, -0.8f, -0.7f, 0.1f, -0.8f, -0.7f, -0.5f, -0.9f, -0.7f, -0.5f, -0.9f, -0.7f, -1.3f, -0.8f, -0.7f, -1.3f, -0.8f)
			.setRotationPoint(-38.5f, -12, 7.5f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 88, 99, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0)
			.setRotationPoint(-38, -12.8f, 6.5f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.1f, -0.2f, 0, -0.1f)
			.setRotationPoint(-38, -12.1f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 360, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.4f, -0.5f, -0.4f, -0.4f, -0.5f, -0.4f, -0.4f, -0.5f, 0, -0.4f, -0.5f, 0, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f, 0, -0.4f, -0.3f, 0)
			.setRotationPoint(-38, -13.1f, 7).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 110, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 2, 0, -0.7f, 0, -0.7f, -0.7f, 0, -0.7f, -0.7f, 0, -0.6f, -0.7f, 0, -0.6f, -0.2f, -1.9f, -0.4f, -0.1f, -1.9f, -0.4f, -0.1f, -1.9f, -0.45f, -0.2f, -1.9f, -0.45f)
			.setRotationPoint(-38.5f, -10.1f, 7).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 260, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 2, 0, -0.2f, 0, -0.2f, -0.1f, 0, -0.2f, -0.1f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0.5f, -0.2f, -0.1f, 0.5f, -0.2f, -0.1f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f)
			.setRotationPoint(-38.5f, -9, 7).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 98, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
			.setRotationPoint(-38.25f, -11, 5).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
			.setRotationPoint(-37.5f, -12.5f, 1).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 85, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0.15f, -0.75f, -1, -1, -0.75f, 0.15f, 0.15f, -0.75f, -1, -1, -0.75f, 0.15f, 0.15f, 0, -1, -1, 0, 0.15f, 0.15f, 0, -1, -1, 0, 0.15f)
			.setRotationPoint(-38.5f, -13.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 285, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -11.5f, 1).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 251, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-38, -11.5f, 0).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 97, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.3f, -1.2f, -0.25f, -0.3f, 0.3f, 0, -0.3f, -1.2f, -0.25f, -0.3f, 0.3f, 0, -0.3f, -1.2f, -0.25f, -0.3f, 0.3f, 0, -0.3f, -1.2f, -0.25f, -0.3f, 0.3f)
			.setRotationPoint(-38.75f, -12.5f, 2).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 269, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, -11.5f, 1).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 205, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -11.5f, 0).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 96, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-37, -11.5f, 2).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 71, 117, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-39, -11.5f, 0).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 429, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 7, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0)
			.setRotationPoint(-39, -11.5f, 2).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -9, 4.2f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 51, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.2f, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, -0.25f, 0, -0.2f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f)
			.setRotationPoint(-39, -11, 4.5f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 52, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 5, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.1f, 0, 0, -0.1f, 0, 0, 0, 0, 0)
			.setRotationPoint(-40, -12.3f, 3).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 242, 109, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 9, 2, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, -0.05f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-42, -13.5f, 1).setRotationAngle(0, 0, 0).setName("Box 312")
		);
		group0.add(new ModelRendererTurbo(group0, 40, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.5f, 0, -1.25f, -1.5f, 0, 0.25f, -0.25f, 0, -1.25f, -1.25f, 0, 0.25f, -0.5f, 0, -1.25f, -1.5f, 0, 0.25f, -0.25f, 0, -1.25f, -1.25f, 0, 0.25f)
			.setRotationPoint(-40.5f, -14.5f, 1.75f).setRotationAngle(0, 0, 0).setName("Box 131")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 71, textureX, textureY).addBox(0, 0, 0, 6, 1, 9)
			.setRotationPoint(-29, -7.5f, 0).setRotationAngle(0, 0, -90).setName("Standard Seat")
		);
		group0.add(new ModelRendererTurbo(group0, 192, 80, textureX, textureY).addBox(0, 0, 0, 5, 1, 9)
			.setRotationPoint(-34, -8.5f, 0).setRotationAngle(0, 0, 0).setName("Standard Seat")
		);
		group0.add(new ModelRendererTurbo(group0, 392, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, -0.5f, -1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-34, -10, 9).setRotationAngle(0, 0, 0).setName("Box 105")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -10, -1).setRotationAngle(0, 0, 0).setName("Box 104")
		);
		group0.add(new ModelRendererTurbo(group0, 215, 109, textureX, textureY).addBox(0, 0, 0, 2, 3, 2)
			.setRotationPoint(-32, -7.5f, 3.5f).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 218, 91, textureX, textureY).addBox(0, 0, 0, 2, 3, 2)
			.setRotationPoint(-32, -7.5f, -8).setRotationAngle(0, 0, 0).setName("Box 110")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -10, -10).setRotationAngle(0, 0, 0).setName("Box 109")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -1, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, -1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -10, -5.5f).setRotationAngle(0, 0, 0).setName("Box 108")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 0, textureX, textureY).addBox(0, 0, 0, 5, 1, 4)
			.setRotationPoint(-34, -8.5f, -9).setRotationAngle(0, 0, 0).setName("Box 107")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 52, textureX, textureY).addBox(0, 0, 0, 6, 1, 4)
			.setRotationPoint(-29, -7.5f, -9).setRotationAngle(0, 0, -90).setName("Box 106")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -0.5f, -1.5f, -0.5f, -0.5f, -1.5f, -0.5f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(60, -17, -5).setRotationAngle(0, 0, 0).setName("Box 271")
		);
		group0.add(new ModelRendererTurbo(group0, 387, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 2, 2, 0, 0, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, -1.5f, 0, -0.5f, -1.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(60, -17, 3).setRotationAngle(0, 0, 0).setName("Box 271")
		);
		group0.add(new ModelRendererTurbo(group0, 424, 116, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(59, 2.5f, -10).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 425, 101, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(59, 2.5f, 9).setRotationAngle(0, 0, 0).setName("Box 100")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 3, 5, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, -3, 0, -1, 0, 0, 0, 0, 0, 0, 0, -3, -1, -3, -3, -1)
			.setRotationPoint(-51, -11.5f, 5).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 72, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 3, 5)
			.setCorners(-3, 0, -1, 0, 0, -1, 0, -3, 0, 0, -3, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(1, new float[]{ 4.0f, 5.0f, 0.0f, 8.0f, 0.0f, 8.0f, 5.0f, 8.0f }).build()
			.setRotationPoint(-51, -11.5f, -10).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 71, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 3, 5)
			.setCorners(-3, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0, -3, -3, -1, 0, -3, -1, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(1, new float[]{ 5.0f, 5.0f, 0.0f, 5.0f, 0.0f, 8.0f, 5.0f, 5.0f }).build()
			.setRotationPoint(-51, -11.5f, -10).setRotationAngle(0, 0, 0).setName("Box 76")
		);
		group0.add(new ModelRendererTurbo(group0, 62, 105, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 1, 3)
			.setCorners(0, -1, 0, 0, 0, 0, 0, 0, -1, -2, 0, -1, 0, 1, 0, 0, 0, 0, 0, 0, -1, -2, 0, -1)
			.setPolygonUV(2, new float[]{ 5.0f, 0.0f, 5.0f, 0.0f, 3.0f, 3.0f, 5.0f, 3.0f }).build()
			.setRotationPoint(-49, -14.5f, 2).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 217, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -1, -1, 0, 0, 0, -1, -2, -1, 0, 0, -1, 0, -1, 1, 0, 0, 0, -1, -2, 1, 0, 0, 1, 0)
			.setRotationPoint(-49, -14.5f, -5).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 45, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 3, 0, -2, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1, 0, -2, 0, -1, 0, 0, -1, 0, 0, 0, 0, 1, 0)
			.setRotationPoint(-49, -14.5f, -5).setRotationAngle(0, 0, 0).setName("Box 75")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 5, 1, 0, 0, 0, 0, 0, 0, -1.75f, 0, 0, 1.25f, 0, 0, 0, 1.055f, 0, 0.35f, -1.25f, 0, -1.25f, -1.25f, 0, 0.75f, 1.055f, 0, -0.35f)
			.setRotationPoint(-47, 1.5f, 8.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 206, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, -21, -2).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 125, 95, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28, -21, -0.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-28, -21, -2).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 244, 92, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-29, -21, -0.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 202, 91, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(-26, -21, 1).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 346, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, -20, -0.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 104, 93, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, -0.2f, 0.5f, 0, -0.2f, 0.5f, 0, -0.2f, -1.25f, 0, -0.2f, -1.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-20, -22.5f, -2.75f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 89, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-20, -21.75f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 179, 88, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f, 0.5f, 0, 0.5f)
			.setRotationPoint(-20, -21, -4.5f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 106, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, 0, -0.2f, -1.15f, 0, -0.2f, -1.15f, 0, -0.2f, 0.4f, 0, -0.2f, 0.4f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.1f, 0, 0, -0.1f)
			.setRotationPoint(-20, -22.5f, -6.25f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 504, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.15f, 0, 0, -0.15f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.8f, -0.125f, 0, -0.8f, -0.125f, 0, -0.8f, -0.215f, 0, -0.8f, -0.215f)
			.setRotationPoint(-20, -22.3f, -5).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 87, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.35f, 0, -0.35f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f)
			.setRotationPoint(-20, -22.1f, -4.5f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 158, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-45, -0.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 268")
		);
		group0.add(new ModelRendererTurbo(group0, 368, 87, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-43.25f, -1, 11).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		group0.add(new ModelRendererTurbo(group0, 221, 86, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-40.75f, -1, 11).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		group0.add(new ModelRendererTurbo(group0, 218, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-45, -4.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 268")
		);
		group0.add(new ModelRendererTurbo(group0, 136, 86, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-43.25f, -5, 11).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		group0.add(new ModelRendererTurbo(group0, 13, 86, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-40.75f, -5, 11).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		group0.add(new ModelRendererTurbo(group0, 209, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-45, -8.5f, 11.5f).setRotationAngle(0, 0, 0).setName("Box 268")
		);
		group0.add(new ModelRendererTurbo(group0, 299, 85, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-43.25f, -9, 11).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 85, textureX, textureY)
			.addShapeBox(-2, 0, 0, 1, 1, 1, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f)
			.setRotationPoint(-40.75f, -9, 11).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		group0.add(new ModelRendererTurbo(group0, 105, 72, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(-0.5f, -0.5f, 0, -2.5f, -0.5f, 0, -0.5f, 0, 0, 0, 0, 0, -0.25f, 0.5f, 0, -2.75f, 0.5f, 0, -0.5f, 0, 0, 0, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-38.5f, -19.5f, -4).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 400, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 2, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(-38.5f, -19.5f, -1).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 180, 66, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(-1, -1.5f, 0, -2, -1.5f, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -1, 1.5f, 0, -2, 1.5f, 0, -0.5f, 0, 0, -0.25f, 0.5f, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 3.0f, 0.0f, 3.0f, 3.0f, 3.0f, 3.0f }).build()
			.setRotationPoint(-38.5f, -19.5f, -7).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 498, 28, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(3, 1, 3)
			.setCorners(-1, -1.5f, 0, -0.5f, -0.75f, 0, -0.5f, 0, 0, -2.5f, 0, 0, -1, 1.5f, 0, -0.5f, 0.6f, 0, -0.5f, 0, 0, -2.5f, 0, 0)
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 6.0f, 3.0f }).build()
			.setRotationPoint(-38.5f, -19.5f, -7).setRotationAngle(0, 0, 0).setName("Box 39")
		);
		group0.add(new ModelRendererTurbo(group0, 153, 103, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 3)
			.setCorners(-3, 0, -1, 1, 0, -1, 0, 0, 0, -2, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0)
			.setPolygonUV(1, new float[]{ 2.0f, 3.0f, 0.0f, 3.0f, 0.0f, 5.0f, -1.0f, 5.0f }).build()
			.setRotationPoint(-50, -13.5f, -8).setRotationAngle(0, 0, 0).setName("Box 97")
		);
		group0.add(new ModelRendererTurbo(group0, 64, 72, textureX, textureY).newBoxBuilder()
			.setOffset(0, 0, 0).setSize(2, 2, 4)
			.setCorners(-3, 0, -2, 1, 0, -2, 1, 0, -2, -3, 0, -2, 0, 0, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0)
			.setPolygonUV(1, new float[]{ 4.0f, 4.0f, 1.0f, 4.0f, 0.0f, 6.0f, 4.0f, 6.0f })
			.setPolygonUV(0, new float[]{ 10.0f, 4.0f, 6.0f, 4.0f, 5.0f, 5.0f, 10.0f, 6.0f })
			.setPolygonUV(5, new float[]{ 12.0f, 4.0f, 10.0f, 4.0f, 10.0f, 6.0f, 12.0f, 6.0f })
			.setPolygonUV(2, new float[]{ 6.0f, 0.0f, 4.0f, 0.0f, 4.0f, 4.0f, 6.0f, 4.0f }).build()
			.setRotationPoint(-50, -13.5f, 5).setRotationAngle(0, 0, 0).setName("Box 77")
		);
		group0.add(new ModelRendererTurbo(group0, 23, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-55, 0.5f, -2).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 1.75f, 0, 0, -1.5f, 0, 0, -0.25f, -0.375f, 0, -0.25f, 0, 0, 1.475f, 0, 0, -1.75f, -0.375f, 0)
			.setRotationPoint(-54, 1.5f, 2).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 139, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0.5f, 0, 0, 0, 0, 0, 2.05f, 0, -0.95f, -2.25f, 0, -0.95f, 0.25f, -0.375f, 0, -0.5f, 0, 0, 1.825f, 0, -0.95f, -2.35f, -0.375f, -0.95f)
			.setRotationPoint(-52, 1.5f, 5).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 320, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, -0.55f, 0, 1.95f, -1, 0, 0.85f, -1, 0, -1.2f, 0.25f, 0, -2.95f, -0.3f, 0, 1.95f, -1, 0, 0.7f, -1, -0.375f, -1.2f, 0.2f, -0.375f, -2.95f)
			.setRotationPoint(-49.5f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 377, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0.5f, 0, -0.075f, 0, 0, -0.2f, 0, 0.225f, 0, 0, 1, 0, 0.3f, 0, -0.15f, 0, -0.375f, -0.2f)
			.setRotationPoint(-47.5f, 1.5f, 9).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 192, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, -1.5f, 0, 0, 1.75f, 0, 0, 0, 0, 0, 0, 0, 0, -1.75f, -0.375f, 0, 1.475f, 0, 0, -0.25f, 0, 0, -0.25f, -0.375f, 0)
			.setRotationPoint(-54, 1.5f, -5).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 85, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, -2.25f, 0, -0.95f, 2.05f, 0, -0.95f, 0, 0, 0, 0.5f, 0, 0, -2.35f, -0.375f, -0.95f, 1.825f, 0, -0.95f, -0.5f, 0, 0, 0.25f, -0.375f, 0)
			.setRotationPoint(-52, 1.5f, -9).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0.3f, 0, -2.95f, -1, 0, -1.2f, -1, 0, 0.85f, -0.55f, 0, 1.95f, 0.2f, -0.375f, -2.95f, -1, -0.375f, -1.2f, -0.85f, 0, 0.65f, -0.275f, 0, 1.95f)
			.setRotationPoint(-49.45f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 368, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.2f, 0.45f, 0, -0.075f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.2f, 0.2f, 0, -0.175f, 0.2f, 0.8f, -0.1f, -0.3f, 0.375f, 0.075f)
			.setRotationPoint(-47.45f, 1.5f, -10).setRotationAngle(0, 0, 0).setName("Box 68")
		);
		group0.add(new ModelRendererTurbo(group0, 360, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f)
			.setRotationPoint(-54, 3.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 264")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(28.5f, -23.5f, 3).setRotationAngle(0, 0, 0).setName("Box 198")
		);
		group0.add(new ModelRendererTurbo(group0, 489, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 2, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(28.5f, -23.5f, -4).setRotationAngle(0, 0, 0).setName("Box 197")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0)
			.setRotationPoint(36.5f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Box 195")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 6, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0)
			.setRotationPoint(28.5f, -23.5f, -3).setRotationAngle(0, 0, 0).setName("Box 194")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 9, 1, 6, 0, 0, -0.8f, 0.5f, 0, -0.8f, 0.5f, 0, -0.8f, 0.5f, 0, -0.8f, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f)
			.setRotationPoint(28.5f, -24.5f, -3).setRotationAngle(0, 0, 0).setName("Box 196")
		);
		group0.add(new ModelRendererTurbo(group0, 492, 71, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(60, -7, 7.5f).setRotationAngle(0, 0, 0).setName("Box 265")
		);
		group0.add(new ModelRendererTurbo(group0, 439, 70, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(60.1f, -7, 7.5f).setRotationAngle(0, 0, 0).setName("Rearlight-right")
		);
		group0.add(new ModelRendererTurbo(group0, 293, 66, textureX, textureY).addBox(0, 0, 0, 1, 2, 2)
			.setRotationPoint(60, -13, -9.5f).setRotationAngle(0, 0, 0).setName("Box 265")
		);
		group0.add(new ModelRendererTurbo(group0, 439, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f)
			.setRotationPoint(60.1f, -13, -9.5f).setRotationAngle(0, 0, 0).setName("Rearlight-left")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 0.5f, -10).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 358, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 230, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-2, 4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-2, 4.5f, 8).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 74, 104, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6, -20.75f, 4).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 321, 84, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(5, -20.75f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 83, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(5, -20.75f, 4).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 467, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(4, -20.75f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 308, 81, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(7, -20.75f, 7).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6, -19.75f, 5.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f)
			.setRotationPoint(-53.5f, -0.5f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 367, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
			.setRotationPoint(-53.6f, -0.5f, 2.75f).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 428, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 2, 0, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f, 0, -0.2f, -0.2f)
			.setRotationPoint(-53.5f, -0.5f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 242, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f, 0, -0.3f, -0.3f)
			.setRotationPoint(-53.6f, -0.5f, -4.75f).setRotationAngle(0, 0, 0).setName("Box 122")
		);
		group0.add(new ModelRendererTurbo(group0, 176, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 0.5f, -10).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 494, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 4.5f, -10).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-10, 4.5f, 8).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 313, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 4.5f, -8).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 451, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 5, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 0.5f, -10).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 395, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 5.5f, -8).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 488, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 5.5f, -10).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 419, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-3, 5.5f, 8).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 475, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5.5f, 1.5f, -11).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		group0.add(new ModelRendererTurbo(group0, 444, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5.5f, 1.5f, 10).setRotationAngle(0, 0, 0).setName("Box 123")
		);
		group0.add(new ModelRendererTurbo(group0, 330, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -8, 0).setRotationAngle(0, 0, 0).setName("Box 171 lamp")
		);
		group0.add(new ModelRendererTurbo(group0, 311, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -6, -2).setRotationAngle(0, 0, 0).setName("Box 170 lamp")
		);
		group0.add(new ModelRendererTurbo(group0, 242, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -8, -2).setRotationAngle(0, 0, 0).setName("Box 169 lamp")
		);
		group0.add(new ModelRendererTurbo(group0, 142, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-53, -6, 0).setRotationAngle(0, 0, 0).setName("Box 168 lamp")
		);
		group0.add(new ModelRendererTurbo(group0, 135, 82, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.65f, -0.35f, 0, -0.65f, -0.35f, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-54, -8, 1).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 505, 52, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.8f, 0, 0, -0.8f, 0, 0, -0.35f, -0.65f, -0.75f, -0.35f, -0.65f)
			.setRotationPoint(-54, -8, 0).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.35f, -0.65f, 0, -0.35f, -0.65f, 0, -0.8f, 0, -0.75f, -0.8f, 0)
			.setRotationPoint(-54, -8, -2).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 483, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.65f, -0.35f, -0.75f, -0.65f, -0.35f, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.75f, 0, -0.8f)
			.setRotationPoint(-54, -8, -2).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, -0.8f, 0, 0, -0.8f, 0, 0, 0, -0.75f, 0, 0, -0.75f, -0.65f, -0.35f, 0, -0.65f, -0.35f, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f)
			.setRotationPoint(-54, -6, 1).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 79, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, -0.8f, -0.75f, 0, -0.8f, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.65f, -0.35f, -0.75f, -0.65f, -0.35f)
			.setRotationPoint(-54, -6, -2).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, -0.8f, 0, 0, -0.8f, 0, 0, -0.35f, -0.65f, -0.75f, -0.35f, -0.65f, -0.75f, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f)
			.setRotationPoint(-54, -5, 0).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, -0.75f, -0.35f, -0.65f, 0, -0.35f, -0.65f, 0, -0.8f, 0, -0.75f, -0.8f, 0, -0.75f, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-54, -5, -2).setRotationAngle(0, 0, 0).setName("Box 103")
		);
		group0.add(new ModelRendererTurbo(group0, 287, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -6.5f, -1.5f).setRotationAngle(0, 0, 0).setName("Front light bottom R")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 76, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-53, -6.5f, 0.5f).setRotationAngle(0, 0, 0).setName("Front light bottom L")
		);
		group0.add(new ModelRendererTurbo(group0, 169, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 6, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7, 0.5f, -9).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 264, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9, 2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 77, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, 2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 123, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 18, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-9, 0.5f, -9).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 82, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 18, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-5, 0.5f, -9).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 41, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0)
			.setRotationPoint(-9, 4.5f, -9).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0)
			.setRotationPoint(-5, 4.5f, -9).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 146, 74, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-28, -21, -2).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 73, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-29, -21, -2).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 73, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(-26, -21, -2).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 32, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-28, -21, 1).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 12, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, -20, -4.5f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 259, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, -21, -4.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 72, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(-24, -21, -4.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 483, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, -20, 3.5f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-29, -21, 3.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-30, -21, 3.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 282, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 3, 18, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, 2.5f, -9).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 5, 2, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, 0.5f, -7).setRotationAngle(0, 0, 0).setName("Box 121")
		);
		group0.add(new ModelRendererTurbo(group0, 276, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0.25f, -0.75f, 0.25f, 0.25f, -0.75f, 0.25f, 0.25f, -0.75f, 0.25f, 0.25f, -0.75f, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f, 0.25f, 0, 0.25f)
			.setRotationPoint(-34, -20.5f, -0.5f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 144, 68, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-34, -20.75f, -0.5f).setRotationAngle(0, 0, 0).setName("Glow lamp Beacon")
		);
		group0.add(new ModelRendererTurbo(group0, 190, 66, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(-26, -21, -0.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 471, 71, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-27, -22.35f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 342, 65, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(-26, -22.35f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 144, 62, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0, 0, -0.65f, 0)
			.setRotationPoint(-27, -22.35f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 61, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(-26, -22.35f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 58, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-28, -22.35f, 0.25f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 56, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-28, -22.35f, -1.25f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 7, textureX, textureY)
			.addShapeBox(2, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(9.25f, -22.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 0, textureX, textureY)
			.addShapeBox(2, 0, 0, 1, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(25.25f, -22.5f, -2.5f).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 6, 133, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 3, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.25f, -22.5f, -4).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 48, 141, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(34.25f, -22.5f, -6).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 33, 140, textureX, textureY)
			.addShapeBox(2, 0, 0, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, -2, 0)
			.setRotationPoint(34.25f, -22.5f, 4).setRotationAngle(0, 0, 0).setName("Box 199")
		);
		group0.add(new ModelRendererTurbo(group0, 271, 80, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25, -22, 0).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 438, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-27, -21, 1.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 295, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-27, -21, 3).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 133, 53, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-28, -21, 1.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 507, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-24, -21, 0).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 506, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(-23, -21, 0).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 405, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-26, -21, 0.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 237, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(-24, -22, 2).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-26, -21, 3).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 449, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-25, -20, 0.5f).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 11, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-31, -22, 3).setRotationAngle(0, 0, 0).setName("Box 55")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-33, -21, 2.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-32, -21, 4.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-33, -21, 4.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 453, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-34, -21, 2.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, -21, 5.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 263, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(-28, -21, 5.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 254, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f)
			.setRotationPoint(-32, -22, 3.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 237, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-30, -22, 4.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		group0.add(new ModelRendererTurbo(group0, 229, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0, 0, 0, 0, 0, 0.15f, 0.15f, 0, 0.15f, 0.15f, 0, 0, 0)
			.setRotationPoint(-29, -22, 4.5f).setRotationAngle(0, 0, 0).setName("Box 54")
		);
		this.groups.add(group0);
		//
	}

}
