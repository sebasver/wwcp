//FMT-Marker TiM-1.0
//Using PER-GROUP-INIT mode with limit '500'!
package wwcp.models.bogies;

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
public class X10a_Front_Truck extends RollingStockModel {

	public X10a_Front_Truck(){
		super(); textureX = 256; textureY = 256;
		//
		initGroup_X10acb();
	}

	private final void initGroup_X10acb(){
		TurboList X10acb = new TurboList("X10acb");
		X10acb.add(new ModelRendererTurbo(X10acb, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 12, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.5f, 7, -6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 100, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(7, 7.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 80, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(7, 7.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 69, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(-7, 7.5f, -6.01f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 0, 0, textureX, textureY).addBox(-2.5f, -2.5f, 0, 5, 5, 0)
			.setRotationPoint(-7, 7.5f, 6.01f).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 81, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 12, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-6.5f, 7, -6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 50, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 2, 12, 0, 0, -0.5f, 0, 0, 0.5f, 0, 0, 0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0)
			.setRotationPoint(3.5f, 7, -6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 111, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, 5.5f, -1).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 27, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 13, 2, 4, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-6.5f, 6, -2).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 139, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(6.5f, 6, -6).setRotationAngle(0, 0, 0)
		);
		X10acb.add(new ModelRendererTurbo(X10acb, 112, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 12, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.5f, 6, -6).setRotationAngle(0, 0, 0)
		);
		this.groups.add(X10acb);
	}

}
