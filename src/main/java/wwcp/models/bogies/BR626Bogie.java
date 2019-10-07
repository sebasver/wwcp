
package wwcp.models.bogies;


import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class BR626Bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public BR626Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[29];

		initbodyModel_1();
		this.fixRotation(this.bodyModel, false, true, true);

	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 18
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Wheel
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Wheel
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Wheel
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Wheel
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 16
		bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 36
		bodyModel[20] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15
		bodyModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15
		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15
		bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15

		bodyModel[0].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 15
		bodyModel[0].setRotationPoint(2F, 4F, 6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[1].setRotationPoint(-7F, 4F, -7F);

		bodyModel[2].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		bodyModel[2].setRotationPoint(-2.5F, 6.5F, 5.98F);

		bodyModel[3].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		bodyModel[3].setRotationPoint(-2.5F, 6.5F, -5.98F);

		bodyModel[4].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		bodyModel[4].setRotationPoint(11.5F, 6.5F, -5.98F);

		bodyModel[5].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		bodyModel[5].setRotationPoint(11.5F, 6.5F, 5.98F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[6].setRotationPoint(-7F, 4F, 6F);

		bodyModel[7].addBox(0F, 0F, 0F, 3, 1, 12, 0F); // Box 16
		bodyModel[7].setRotationPoint(3F, 4F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[8].setRotationPoint(-7F, 5F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[9].setRotationPoint(15F, 5F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[10].setRotationPoint(11F, 6F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 27
		bodyModel[11].setRotationPoint(-3F, 6F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[12].setRotationPoint(6F, 4F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 30
		bodyModel[13].setRotationPoint(6F, 4F, 1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[14].setRotationPoint(3F, 4F, 3F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 32
		bodyModel[15].setRotationPoint(3F, 4F, -1F);
		bodyModel[15].rotateAngleY = -3.14159265F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[16].setRotationPoint(10F, 6F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[17].setRotationPoint(-4F, 6F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[18].setRotationPoint(-1F, 6F, 7F);
		bodyModel[18].rotateAngleY = -3.14159265F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[19].setRotationPoint(13F, 6F, 7F);
		bodyModel[19].rotateAngleY = -3.14159265F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[20].setRotationPoint(7F, 4F, 6F);

		bodyModel[21].addBox(0F, 0F, 0F, 5, 2, 1, 0F); // Box 28
		bodyModel[21].setRotationPoint(2F, 4F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[22].setRotationPoint(7F, 4F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 30
		bodyModel[23].setRotationPoint(-1F, 6F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 31
		bodyModel[24].setRotationPoint(-1F, 6F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 15
		bodyModel[25].setRotationPoint(0F, 3F, 6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 15
		bodyModel[26].setRotationPoint(7F, 3F, 6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 15
		bodyModel[27].setRotationPoint(0F, 3F, -8.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F); // Box 15
		bodyModel[28].setRotationPoint(7F, 3F, -8.5F);
	}
}