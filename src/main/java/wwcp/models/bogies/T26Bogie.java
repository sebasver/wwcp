//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:16.06.2018 - 15:57:03
// Last changed on: 16.06.2018 - 15:57:03


package wwcp.models.bogies; //Path where the model is located



import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class T26Bogie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;
	public T26Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[117];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		t26bogieModel = new ModelRendererTurbo[30];
		t26bogieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		t26bogieModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		t26bogieModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		t26bogieModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 14
		t26bogieModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 22
		t26bogieModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 23
		t26bogieModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 24
		t26bogieModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 25
		t26bogieModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 26
		t26bogieModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 27
		t26bogieModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 28
		t26bogieModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 29
		t26bogieModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 30
		t26bogieModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 31
		t26bogieModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY,StaticModelAnimator.tagSimpleRotate); // Wheel
		t26bogieModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY,StaticModelAnimator.tagSimpleRotate); // Wheel
		t26bogieModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 30
		t26bogieModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 31
		t26bogieModel[18] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 32
		t26bogieModel[19] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 33
		t26bogieModel[20] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 34
		t26bogieModel[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 35
		t26bogieModel[22] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 36
		t26bogieModel[23] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 37
		t26bogieModel[24] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 38
		t26bogieModel[25] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 39
		t26bogieModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 40
		t26bogieModel[27] = new ModelRendererTurbo(this, 457, 1, textureX, textureY,StaticModelAnimator.tagSimpleRotate); // Wheel
		t26bogieModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY,StaticModelAnimator.tagSimpleRotate); // Wheel
		t26bogieModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 43

		t26bogieModel[0].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 16
		t26bogieModel[0].setRotationPoint(-5F, 6F, -7F);

		t26bogieModel[1].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 28
		t26bogieModel[1].setRotationPoint(4F, 3F, -1F);

		t26bogieModel[2].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 6
		t26bogieModel[2].setRotationPoint(15F, 6F, -7F);

		t26bogieModel[3].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 14
		t26bogieModel[3].setRotationPoint(-1F, 4F, -7F);

		t26bogieModel[4].addBox(0F, 0F, 0F, 23, 1, 1, 0F); // Box 22
		t26bogieModel[4].setRotationPoint(-6F, 7F, 6F);

		t26bogieModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		t26bogieModel[5].setRotationPoint(-6F, 4F, 6F);

		t26bogieModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		t26bogieModel[6].setRotationPoint(-4F, 4F, 6F);

		t26bogieModel[7].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 25
		t26bogieModel[7].setRotationPoint(-1F, 8F, 6F);

		t26bogieModel[8].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 26
		t26bogieModel[8].setRotationPoint(-5F, 4F, 6F);

		t26bogieModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 27
		t26bogieModel[9].setRotationPoint(-4F, 4F, 6F);

		t26bogieModel[10].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 28
		t26bogieModel[10].setRotationPoint(15F, 4F, 6F);

		t26bogieModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 29
		t26bogieModel[11].setRotationPoint(10F, 4F, 6F);

		t26bogieModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		t26bogieModel[12].setRotationPoint(16F, 4F, 6F);

		t26bogieModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		t26bogieModel[13].setRotationPoint(14F, 4F, 6F);

		t26bogieModel[14].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		t26bogieModel[14].setRotationPoint(-4.5F, 6.5F, 5.95F);

		t26bogieModel[15].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		t26bogieModel[15].setRotationPoint(15.5F, 6.5F, 5.95F);

		t26bogieModel[16].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 30
		t26bogieModel[16].setRotationPoint(2F, 5F, 6F);

		t26bogieModel[17].addBox(0F, 0F, 0F, 23, 1, 1, 0F); // Box 31
		t26bogieModel[17].setRotationPoint(-6F, 7F, -7F);

		t26bogieModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		t26bogieModel[18].setRotationPoint(-6F, 4F, -7F);

		t26bogieModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		t26bogieModel[19].setRotationPoint(-4F, 4F, -7F);

		t26bogieModel[20].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		t26bogieModel[20].setRotationPoint(-1F, 8F, -7F);

		t26bogieModel[21].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 35
		t26bogieModel[21].setRotationPoint(-5F, 4F, -7F);

		t26bogieModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 36
		t26bogieModel[22].setRotationPoint(-4F, 4F, -7F);

		t26bogieModel[23].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 37
		t26bogieModel[23].setRotationPoint(15F, 4F, -7F);

		t26bogieModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 38
		t26bogieModel[24].setRotationPoint(10F, 4F, -7F);

		t26bogieModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		t26bogieModel[25].setRotationPoint(16F, 4F, -7F);

		t26bogieModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		t26bogieModel[26].setRotationPoint(14F, 4F, -7F);

		t26bogieModel[27].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		t26bogieModel[27].setRotationPoint(-4.5F, 6.5F, -5.95F);

		t26bogieModel[28].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		t26bogieModel[28].setRotationPoint(15.5F, 6.5F, -5.95F);

		t26bogieModel[29].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 43
		t26bogieModel[29].setRotationPoint(2F, 5F, -7F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 30; i++)
		{
			t26bogieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo t26bogieModel[];
}