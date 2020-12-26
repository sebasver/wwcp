//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.11.2020 - 20:48:38
// Last changed on: 15.11.2020 - 20:48:38

package wwcp.models.freight; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Chaldron extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Chaldron() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[43];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9
		bodyModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 39
		bodyModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 42
		bodyModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 33
		bodyModel[24] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 42
		bodyModel[33] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 43
		bodyModel[34] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 44
		bodyModel[35] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 45
		bodyModel[36] = new ModelRendererTurbo(this, 160, 18, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 247, 16, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 247, 16, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 247, 16, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 247, 16, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 247, 16, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 247, 16, textureX, textureY); // Box 42

		bodyModel[0].addBox(0F, 0F, 0F, 22, 5, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-11F, -7F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(-11F, -2F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(-9F, -2F, -4F);

		bodyModel[3].addBox(0F, 0F, 0F, 26, 2, 2, 0F); // Box 6
		bodyModel[3].setRotationPoint(-13F, 4F, -5F);

		bodyModel[4].addBox(0F, 0F, 0F, 26, 2, 2, 0F); // Box 7
		bodyModel[4].setRotationPoint(-13F, 4F, 3F);

		bodyModel[5].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[5].setRotationPoint(-6.5F, 6.5F, 6F);

		bodyModel[6].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[6].setRotationPoint(-6.5F, 6.5F, -6F);

		bodyModel[7].addBox(-0.5F, -0.5F, 0F, 1, 1, 13, 0F); // Box 42
		bodyModel[7].setRotationPoint(-6.5F, 6.5F, -6.5F);

		bodyModel[8].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 12
		bodyModel[8].setRotationPoint(6.5F, 6.5F, 6F);

		bodyModel[9].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 13
		bodyModel[9].setRotationPoint(6.5F, 6.5F, -6F);

		bodyModel[10].addBox(-0.5F, -0.5F, 0F, 1, 1, 13, 0F); // Box 14
		bodyModel[10].setRotationPoint(6.5F, 6.5F, -6.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 22, 2, 6, 0F); // Box 16
		bodyModel[11].setRotationPoint(-11F, 4F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[12].setRotationPoint(9F, -2F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 22
		bodyModel[13].setRotationPoint(-11F, -2F, 3F);

		bodyModel[14].addBox(0F, 0F, 0F, 22, 5, 1, 0F); // Box 23
		bodyModel[14].setRotationPoint(-11F, -7F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 18, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[15].setRotationPoint(-9F, -2F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[16].setRotationPoint(9F, -2F, 3F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 26
		bodyModel[17].setRotationPoint(-11F, -7F, -5F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 5, 10, 0F); // Box 27
		bodyModel[18].setRotationPoint(10F, -7F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 28
		bodyModel[19].setRotationPoint(-11F, -2F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F); // Box 29
		bodyModel[20].setRotationPoint(-11F, -2F, 3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 31
		bodyModel[21].setRotationPoint(-11F, -2F, -3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 32
		bodyModel[22].setRotationPoint(10F, -2F, -3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 33
		bodyModel[23].setRotationPoint(10F, -2F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -2F); // Box 34
		bodyModel[24].setRotationPoint(10F, -2F, 3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[25].setRotationPoint(-7F, 7F, -5F);

		bodyModel[26].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 36
		bodyModel[26].setRotationPoint(-8F, 6F, -5F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 10, 0F); // Box 37
		bodyModel[27].setRotationPoint(5F, 6F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[28].setRotationPoint(6F, 7F, -5F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 39
		bodyModel[29].setRotationPoint(-3F, 5F, -6F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 40
		bodyModel[30].setRotationPoint(2F, 5F, -6F);

		bodyModel[31].addShapeBox(-0.5F, -0.5F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 41
		bodyModel[31].setRotationPoint(0F, 5F, -5.99F);
		bodyModel[31].rotateAngleZ = 0.85521133F;

		bodyModel[32].addShapeBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 42
		bodyModel[32].setRotationPoint(0F, 7F, -5.99F);
		bodyModel[32].rotateAngleZ = -1.85004901F;

		bodyModel[33].addShapeBox(-0.5F, -1.5F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43
		bodyModel[33].setRotationPoint(0F, 6F, -5.5F);

		bodyModel[34].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 44
		bodyModel[34].setRotationPoint(0F, 6F, -6F);
		bodyModel[34].rotateAngleZ = -0.68067841F;

		bodyModel[35].addShapeBox(-0.5F, -15.5F, -1F, 1, 16, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[35].setRotationPoint(0F, 6F, -6F);
		bodyModel[35].rotateAngleZ = -0.68067841F;

		bodyModel[36].addBox(0F, 0F, 0F, 20, 0, 10, 0F); // Box 36
		bodyModel[36].setRotationPoint(-10F, -6F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[37].setRotationPoint(10F, 3F, -0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 38
		bodyModel[38].setRotationPoint(9F, 3F, -0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 39
		bodyModel[39].setRotationPoint(10F, 3.5F, -0.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 40
		bodyModel[40].setRotationPoint(-11F, 3.5F, -0.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[41].setRotationPoint(-11F, 3F, -0.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		bodyModel[42].setRotationPoint(-10F, 3F, -0.5F);
	}
}