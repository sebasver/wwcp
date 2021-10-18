//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.04.2019 - 18:36:04
// Last changed on: 12.04.2019 - 18:36:04

package wwcp.models.locomotives.steamers; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Sentinel100HP extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Sentinel100HP() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[108];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 393
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 394
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 395
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 64
		bodyModel[62] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 69
		bodyModel[66] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 70
		bodyModel[67] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 14
		bodyModel[72] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 34
		bodyModel[73] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 47
		bodyModel[74] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 95
		bodyModel[95] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 96
		bodyModel[96] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 97
		bodyModel[97] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 98
		bodyModel[98] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 99
		bodyModel[99] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 100
		bodyModel[100] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 101
		bodyModel[101] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 102
		bodyModel[102] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 103
		bodyModel[103] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 107

		bodyModel[0].addBox(0F, 0F, 0F, 37, 1, 18, 0F); // Box 0
		bodyModel[0].setRotationPoint(-18F, 1F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 18, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-19F, 0F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 18, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(18.25F, 0F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 3
		bodyModel[3].setRotationPoint(-18F, 2F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(18F, 2F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 5
		bodyModel[5].setRotationPoint(18F, 2F, 8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 6
		bodyModel[6].setRotationPoint(-18F, 2F, 8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[7].setRotationPoint(-22.25F, 0F, -9F);

		bodyModel[8].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[8].setRotationPoint(-21.25F, 1.5F, 7.5F);
		bodyModel[8].rotateAngleX = 0.78539816F;

		bodyModel[9].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[9].setRotationPoint(-21.25F, 1.5F, -7.5F);
		bodyModel[9].rotateAngleX = 0.78539816F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[10].setRotationPoint(-21.25F, 2F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[11].setRotationPoint(-22.25F, 1F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[12].setRotationPoint(-19.25F, 1F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-22.25F, 0F, 6F);

		bodyModel[14].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 14
		bodyModel[14].setRotationPoint(19.25F, 1.5F, 7.5F);
		bodyModel[14].rotateAngleX = 0.78539816F;

		bodyModel[15].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 15
		bodyModel[15].setRotationPoint(19.25F, 1.5F, -7.5F);
		bodyModel[15].rotateAngleX = 0.78539816F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(21.75F, 0F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(21.75F, 0F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(19.25F, 1F, -0.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(21.25F, 2F, -0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(22.25F, 1F, -0.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 22, 7, 10, 0F); // Box 21
		bodyModel[21].setRotationPoint(-17F, -6F, -5F);

		bodyModel[22].addBox(0F, 0F, 0F, 20, 7, 2, 0F); // Box 22
		bodyModel[22].setRotationPoint(-15F, -6F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-17F, -6F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 24
		bodyModel[24].setRotationPoint(-17F, -6F, 5F);

		bodyModel[25].addBox(0F, 0F, 0F, 20, 7, 2, 0F); // Box 25
		bodyModel[25].setRotationPoint(-15F, -6F, 5F);

		bodyModel[26].addBox(0F, 0F, 0F, 6, 5, 2, 0F); // Box 26
		bodyModel[26].setRotationPoint(-16F, -11F, -1F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 27
		bodyModel[27].setRotationPoint(-14F, -11F, -3F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 28
		bodyModel[28].setRotationPoint(-14F, -11F, 1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-12F, -11F, 1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-12F, -11F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-16F, -11F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-16F, -11F, 1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[33].setRotationPoint(17F, -6F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 8, 7, 1, 0F); // Box 34
		bodyModel[34].setRotationPoint(6F, -6F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 13, 16, 0F); // Box 35
		bodyModel[35].setRotationPoint(5F, -12F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 8, 7, 1, 0F); // Box 36
		bodyModel[36].setRotationPoint(6F, -6F, 8F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 37
		bodyModel[37].setRotationPoint(6F, -12F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(10F, -8F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(10F, -12F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 40
		bodyModel[40].setRotationPoint(6F, -12F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[41].setRotationPoint(10F, -8F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[42].setRotationPoint(10F, -12F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43
		bodyModel[43].setRotationPoint(17F, -12F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 44
		bodyModel[44].setRotationPoint(17F, -12F, 8.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 8, 13, 0F); // Box 45
		bodyModel[45].setRotationPoint(6F, -7F, -6.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[46].setRotationPoint(5F, -13F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 49
		bodyModel[47].setRotationPoint(5F, -12F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[48].setRotationPoint(5F, -12F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[49].setRotationPoint(5F, -13F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 52
		bodyModel[50].setRotationPoint(6F, -14F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 14, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[51].setRotationPoint(6F, -14F, 3F);

		bodyModel[52].addBox(0F, 0F, 0F, 14, 1, 6, 0F); // Box 54
		bodyModel[52].setRotationPoint(6F, -14F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[53].setRotationPoint(5F, -14F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[54].setRotationPoint(5F, -14F, -8F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Box 57
		bodyModel[55].setRotationPoint(5F, -14F, -3F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 7, 2, 0F); // Box 58
		bodyModel[56].setRotationPoint(6F, -15F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[57].setRotationPoint(6F, -9F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[58].setRotationPoint(6F, -9F, 1F);

		bodyModel[59].addBox(0F, 0F, 0F, 37, 3, 1, 0F); // Box 61
		bodyModel[59].setRotationPoint(-18F, 2F, 7F);

		bodyModel[60].addBox(0F, 0F, 0F, 37, 3, 1, 0F); // Box 62
		bodyModel[60].setRotationPoint(-18F, 2F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 64
		bodyModel[61].setRotationPoint(14.5F, 2F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 65
		bodyModel[62].setRotationPoint(14.5F, 5F, 8.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		bodyModel[63].setRotationPoint(14.5F, 3F, 8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		bodyModel[64].setRotationPoint(14.5F, 2F, -8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 69
		bodyModel[65].setRotationPoint(14.5F, 5F, -9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 70
		bodyModel[66].setRotationPoint(14.5F, 3F, -9F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 71
		bodyModel[67].setRotationPoint(-14F, 5F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 73
		bodyModel[68].setRotationPoint(-15F, 5F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(-12F, 5F, -7F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 3, 14, 0F); // Box 75
		bodyModel[70].setRotationPoint(-15F, 2F, -7F);

		bodyModel[71].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 14
		bodyModel[71].setRotationPoint(-6F, 6F, 6F);

		bodyModel[72].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 34
		bodyModel[72].setRotationPoint(-6F, 6F, -6F);

		bodyModel[73].addBox(-0.5F, -0.5F, 0F, 1, 1, 18, 0F); // Box 47
		bodyModel[73].setRotationPoint(-6F, 6F, -9F);

		bodyModel[74].addBox(-0.5F, -0.5F, 0F, 1, 1, 18, 0F); // Box 74
		bodyModel[74].setRotationPoint(7F, 6F, -9F);

		bodyModel[75].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 75
		bodyModel[75].setRotationPoint(7F, 6F, 6F);

		bodyModel[76].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 76
		bodyModel[76].setRotationPoint(7F, 6F, -6F);

		bodyModel[77].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 78
		bodyModel[77].setRotationPoint(-6F, 5F, 8F);

		bodyModel[78].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 79
		bodyModel[78].setRotationPoint(7F, 5F, 8F);

		bodyModel[79].addShapeBox(-0.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[79].setRotationPoint(8F, 5F, 8F);

		bodyModel[80].addShapeBox(-0.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 81
		bodyModel[80].setRotationPoint(4F, 5F, 8F);

		bodyModel[81].addShapeBox(-0.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(-5F, 5F, 8F);

		bodyModel[82].addShapeBox(-0.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 83
		bodyModel[82].setRotationPoint(-9F, 5F, 8F);

		bodyModel[83].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 84
		bodyModel[83].setRotationPoint(-9F, 4F, 8F);

		bodyModel[84].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 85
		bodyModel[84].setRotationPoint(-3F, 4F, 8F);

		bodyModel[85].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 86
		bodyModel[85].setRotationPoint(4F, 4F, 8F);

		bodyModel[86].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 87
		bodyModel[86].setRotationPoint(10F, 4F, 8F);

		bodyModel[87].addShapeBox(-0.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 88
		bodyModel[87].setRotationPoint(-9F, 5F, -9F);

		bodyModel[88].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 89
		bodyModel[88].setRotationPoint(-6F, 5F, -9F);

		bodyModel[89].addShapeBox(-0.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[89].setRotationPoint(-5F, 5F, -9F);

		bodyModel[90].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 91
		bodyModel[90].setRotationPoint(-3F, 4F, -9F);

		bodyModel[91].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 92
		bodyModel[91].setRotationPoint(-9F, 4F, -9F);

		bodyModel[92].addShapeBox(-0.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 93
		bodyModel[92].setRotationPoint(4F, 5F, -9F);

		bodyModel[93].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 94
		bodyModel[93].setRotationPoint(7F, 5F, -9F);

		bodyModel[94].addShapeBox(-0.5F, -0.5F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[94].setRotationPoint(8F, 5F, -9F);

		bodyModel[95].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[95].setRotationPoint(10F, 4F, -9F);

		bodyModel[96].addBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F); // Box 97
		bodyModel[96].setRotationPoint(4F, 4F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 98
		bodyModel[97].setRotationPoint(-14F, -1F, 7F);

		bodyModel[98].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 99
		bodyModel[98].setRotationPoint(-14F, -1F, -9F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Box 100
		bodyModel[99].setRotationPoint(6F, -8F, -5.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[100].setRotationPoint(6F, -8F, -6.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[101].setRotationPoint(6F, -8F, 5.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 103
		bodyModel[102].setRotationPoint(7F, -6F, 3F);
		bodyModel[102].rotateAngleZ = 0.55850536F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 103
		bodyModel[103].setRotationPoint(6.5F, 2F, -0.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 104
		bodyModel[104].setRotationPoint(-6.5F, 2F, -0.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[105].setRotationPoint(5F, -14F, -8F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 106
		bodyModel[106].setRotationPoint(5F, -13F, -8F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 107
		bodyModel[107].setRotationPoint(5F, -13F, 3F);
	}
}