//FMT-Marker TiM-1.0
//Using PER-GROUP-INIT mode with limit '500'!
package wwcp.models.bogies.AmericanTrucks;

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
public class Vanderbuilt_Tender_Bogie extends RollingStockModel {

	public Vanderbuilt_Tender_Bogie(){
		super(); textureX = 256; textureY = 256;
		//
		initGroup_CNVanderbuiltTendercb();
		initGroup_clipboard();
	}

	private final void initGroup_CNVanderbuiltTendercb(){
		TurboList CNVanderbuiltTendercb = new TurboList("CNVanderbuiltTendercb");
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 15, 3, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(9, 7.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 0, 3, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(9, 7.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 242, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(-9, 7.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 231, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(-9, 7.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 37, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-2, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 25, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -1, 0, 0, -1, 0, 0, -2.5f, 0)
			.setRotationPoint(-3.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 251, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-11, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 150, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 82, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-10, 8.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 67, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-8.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 75, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, -1, 0)
			.setRotationPoint(-7.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 68, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 51, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 4.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 245, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -2.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -2.5f, 0)
			.setRotationPoint(-12.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 82, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(7, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 238, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 56, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(9.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 231, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, 0, -1, 0)
			.setRotationPoint(10.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 204, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -1, 0, 0, -1, 0, 0, -2.5f, 0)
			.setRotationPoint(5.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 51, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(0.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 191, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, -1, 0)
			.setRotationPoint(1.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 144, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 3.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 32, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-2, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 184, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -1, 0, 0, -1, 0, 0, -2.5f, 0)
			.setRotationPoint(-3.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 20, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-11, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 117, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 95, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-10, 8.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 15, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(-8.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 61, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, -1, 0)
			.setRotationPoint(-7.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 54, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 24, 1, 1, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-12, 4.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 39, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -2.5f, 0, 0, -1, 0, 0, -1, 0, -0.5f, -2.5f, 0)
			.setRotationPoint(-12.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 5, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(7, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 32, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(8, 6.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 221, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(8, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 214, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, 8.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(9.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 177, 5, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, -1, 0, -0.5f, -2.5f, 0, -0.5f, -2.5f, 0, 0, -1, 0)
			.setRotationPoint(10.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 158, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2.5f, 0, 0, -1, 0, 0, -1, 0, 0, -2.5f, 0)
			.setRotationPoint(5.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 46, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 4, 1, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, -0.5f, 0)
			.setRotationPoint(0.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 125, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -2.5f, 0, 0, -2.5f, 0, 0, -1, 0)
			.setRotationPoint(1.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 151, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(3.5f, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 111, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 1, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, -1, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3, 3.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 144, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 5.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 118, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1, 8.6f, -7).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 156, 0, textureX, textureY).addBox(0, 0, 0, 4, 1, 12)
			.setRotationPoint(-2, 5, -6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 123, 0, textureX, textureY).addBox(0, 0, 0, 4, 1, 12)
			.setRotationPoint(7, 5, -6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 90, 0, textureX, textureY).addBox(0, 0, 0, 4, 1, 12)
			.setRotationPoint(-11, 5, -6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 111, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(-1, 6.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 89, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(-10, 6.5f, -7.5f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 82, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(8, 6.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 75, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(-1, 6.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 68, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0, -0.1f, -0.1f, 0)
			.setRotationPoint(-10, 6.5f, 6.5f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 0, 3, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(8.5f, 7, -6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 216, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(-0.5f, 7, -6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 189, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 12)
			.setRotationPoint(-9.5f, 7, -6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 61, 3, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-6, 4, 6.5f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 54, 3, textureX, textureY).addBox(0, 0, 0, 2, 1, 1)
			.setRotationPoint(-6, 4, -7.5f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 215, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-10.5f, 3, -8).setRotationAngle(-45, 0, 0).setName("Box 341cp")
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 125, 2, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.5f, 4.4f, -8.5f).setRotationAngle(0, 0, 0).setName("Box 342cp")
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 159, 0, textureX, textureY).addBox(0, 0, 0, 2, 1, 2)
			.setRotationPoint(-1, 4.5f, -1).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 204, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(0, 7.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 188, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(0, 7.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 47, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		CNVanderbuiltTendercb.add(new ModelRendererTurbo(CNVanderbuiltTendercb, 40, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-1, 8.6f, 6).setRotationAngle(0, 0, 0)
		);
		this.groups.add(CNVanderbuiltTendercb);
	}

	private final void initGroup_clipboard(){
		TurboList clipboard = new TurboList("clipboard");
		clipboard.add(new ModelRendererTurbo(clipboard, 177, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 2, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f)
			.setRotationPoint(-10.5f, 3, 8).setRotationAngle(-45, 0, 0).setName("Box 341cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 126, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.5f, 4.4f, 7.5f).setRotationAngle(0, 0, 0).setName("Box 342cp")
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 33, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, 8.6f, 6).setRotationAngle(0, 0, 0)
		);
		clipboard.add(new ModelRendererTurbo(clipboard, 26, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(3.5f, 5.6f, 6).setRotationAngle(0, 0, 0)
		);
		this.groups.add(clipboard);
	}

}
