//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.03.2019 - 13:58:45
// Last changed on: 23.03.2019 - 13:58:45

package wwcp.models.freight; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class HOA55 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public HOA55() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[58];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 16
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 21
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 385
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 386
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 388
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 391
		bodyModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 393
		bodyModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 394
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 395
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 396
		bodyModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 397
		bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 398
		bodyModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 37
		bodyModel[43] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 207, 174, textureX, textureY); // Cargo 1
		bodyModel[55] = new ModelRendererTurbo(this, 206, 145, textureX, textureY); // Cargo 2
		bodyModel[56] = new ModelRendererTurbo(this, 11, 173, textureX, textureY); // Cargo 3
		bodyModel[57] = new ModelRendererTurbo(this, 5, 146, textureX, textureY); // Cargo 4

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[0].setRotationPoint(-63F, -0.5F, -9.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[1].setRotationPoint(-63F, -0.5F, 5.5F);

		bodyModel[2].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[2].setRotationPoint(-62F, 1F, 7.5F);
		bodyModel[2].rotateAngleX = 0.78539816F;

		bodyModel[3].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[3].setRotationPoint(-62F, 1F, -7.5F);
		bodyModel[3].rotateAngleX = 0.78539816F;

		bodyModel[4].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385
		bodyModel[4].setRotationPoint(59F, 1F, 7.5F);
		bodyModel[4].rotateAngleX = 0.78539816F;

		bodyModel[5].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386
		bodyModel[5].setRotationPoint(59F, 1F, -7.5F);
		bodyModel[5].rotateAngleX = 0.78539816F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		bodyModel[6].setRotationPoint(62.5F, -0.5F, 5.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391
		bodyModel[7].setRotationPoint(62.5F, -0.5F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[8].setRotationPoint(-61F, 1.5F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[9].setRotationPoint(-62F, 0.5F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[10].setRotationPoint(-59F, 0.5F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[11].setRotationPoint(59F, 0.5F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[12].setRotationPoint(61F, 1.5F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[13].setRotationPoint(62.25F, 0.5F, -0.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 117, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-58F, 0F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 16, 20, 16, 0F,-15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-58F, -20F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 85, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-42F, -15F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 85, 5, 5, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 17
		bodyModel[17].setRotationPoint(-42F, -20F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 16, 15, 3, 0F,-13F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -11.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-58F, -15F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 16, 15, 3, 0F,-11.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -13.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-58F, -15F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 85, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[20].setRotationPoint(-42F, -15F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 85, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 25
		bodyModel[21].setRotationPoint(-42F, -20F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 15, 3, 0F,0F, 0F, -2F, -11.25F, 0F, 0F, -13F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[22].setRotationPoint(43F, -15F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 16, 20, 16, 0F,0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 28
		bodyModel[23].setRotationPoint(43F, -20F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, -0.01F, -4F, -4F, -0.01F, -4F, -4F, -0.01F, 0F, 0F, -0.01F, 1F, 0F, 0F, -1F, -2F, 0F, -2F, -0.25F, 0F, 0F, 0F, 0F, -2F); // Box 29
		bodyModel[24].setRotationPoint(43F, -20F, -12F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 15, 3, 0F,0F, 0F, 0F, -13.1F, 0F, -1F, -11.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 30
		bodyModel[25].setRotationPoint(43F, -15F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(-10.75F, -10F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 3, 20, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(-10.75F, -13F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 3, 20, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(6.75F, -13F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(6.75F, -10F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 35
		bodyModel[30].setRotationPoint(-25F, 2F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 14, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(-24F, 4F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 16, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-25F, 6F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 16, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(-7.5F, 6F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 14, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-6.5F, 4F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 40
		bodyModel[35].setRotationPoint(-7.5F, 2F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 16, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(10F, 6F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(11F, 4F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 43
		bodyModel[38].setRotationPoint(10F, 2F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,0F, -0.01F, 1F, -4F, -0.01F, 0F, -4F, -0.01F, -4F, 0F, -0.01F, -4F, 0F, 0F, -2F, -0.25F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -1F); // Box 44
		bodyModel[39].setRotationPoint(43F, -20F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,-4F, -0.01F, 0F, 0F, -0.01F, 1F, 0F, -0.01F, -4F, -4F, -0.01F, -4F, -0.25F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 45
		bodyModel[40].setRotationPoint(-47F, -20F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 5, 4, 0F,-4F, -0.01F, -4F, 0F, -0.01F, -4F, 0F, -0.01F, 1F, -4F, -0.01F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -2F, -0.25F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(-47F, -20F, -12F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 37
		bodyModel[42].setRotationPoint(40F, 2F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[43].setRotationPoint(-42F, 2F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 17, 20, 14, 0F,-17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(26F, -20F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 13, 15, 3, 0F,-12.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[45].setRotationPoint(26F, -15F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,-5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 46
		bodyModel[46].setRotationPoint(38F, -20F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 15, 3, 0F,-12.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(26F, -15F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(38F, -20F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 15, 3, 0F,0F, 0F, 0F, -12.75F, 0F, 0F, -12.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(-38F, -15F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[50].setRotationPoint(-42F, -20F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 17, 20, 14, 0F,0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(-42F, -20F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 13, 15, 3, 0F,0F, 0F, 0F, -12.75F, 0F, 0F, -12.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[52].setRotationPoint(-38F, -15F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[53].setRotationPoint(-42F, -20F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 57, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo 1
		bodyModel[54].setRotationPoint(-28F, -3F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 63, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo 2
		bodyModel[55].setRotationPoint(-31F, -7F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 71, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo 3
		bodyModel[56].setRotationPoint(-35F, -11F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 77, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo 4
		bodyModel[57].setRotationPoint(-38F, -15F, -10F);
	}
}