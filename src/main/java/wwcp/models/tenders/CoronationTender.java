//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.12.2018 - 22:24:14
// Last changed on: 18.12.2018 - 22:24:14

package wwcp.models.tenders; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class CoronationTender extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public CoronationTender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[136];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 132
		bodyModel[8] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 134
		bodyModel[9] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 157
		bodyModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 178
		bodyModel[19] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 179
		bodyModel[20] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 203
		bodyModel[21] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		bodyModel[27] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 34
		bodyModel[29] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 44
		bodyModel[36] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 45
		bodyModel[37] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 46
		bodyModel[38] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 47
		bodyModel[39] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 382
		bodyModel[43] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 383
		bodyModel[44] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 384
		bodyModel[45] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 58
		bodyModel[50] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 59
		bodyModel[51] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 60
		bodyModel[52] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 61
		bodyModel[53] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 62
		bodyModel[54] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 64
		bodyModel[56] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 65
		bodyModel[57] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 385
		bodyModel[58] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 386
		bodyModel[59] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 388
		bodyModel[60] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 391
		bodyModel[61] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 396
		bodyModel[62] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 397
		bodyModel[63] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 398
		bodyModel[64] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 73
		bodyModel[65] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 74
		bodyModel[66] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 79
		bodyModel[67] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 128
		bodyModel[68] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 82
		bodyModel[69] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 83
		bodyModel[70] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 84
		bodyModel[71] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 85
		bodyModel[72] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 86
		bodyModel[73] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 87
		bodyModel[74] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 88
		bodyModel[75] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 89
		bodyModel[76] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 90
		bodyModel[77] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 91
		bodyModel[78] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 93
		bodyModel[79] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 95
		bodyModel[80] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 96
		bodyModel[81] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 97
		bodyModel[82] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 98
		bodyModel[83] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 99
		bodyModel[84] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 100
		bodyModel[85] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 101
		bodyModel[86] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 102
		bodyModel[87] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 104
		bodyModel[88] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 105
		bodyModel[89] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 107
		bodyModel[91] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 108
		bodyModel[92] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 346
		bodyModel[93] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 359
		bodyModel[94] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 117
		bodyModel[95] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 118
		bodyModel[96] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 119
		bodyModel[97] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 120
		bodyModel[98] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 121
		bodyModel[99] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 122
		bodyModel[100] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 123
		bodyModel[101] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 124
		bodyModel[102] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 125
		bodyModel[103] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 126
		bodyModel[104] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 127
		bodyModel[105] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 129
		bodyModel[107] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 130
		bodyModel[108] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 131
		bodyModel[109] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 132
		bodyModel[110] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 133
		bodyModel[111] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 134
		bodyModel[112] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 135
		bodyModel[113] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 136
		bodyModel[114] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 137
		bodyModel[115] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Wheel
		bodyModel[116] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Wheel
		bodyModel[117] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 48
		bodyModel[118] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Wheel
		bodyModel[119] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Wheel
		bodyModel[120] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 144
		bodyModel[121] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Wheel
		bodyModel[122] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Wheel
		bodyModel[123] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 147
		bodyModel[124] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 148
		bodyModel[125] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 125
		bodyModel[126] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 126
		bodyModel[127] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 128
		bodyModel[128] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 129
		bodyModel[129] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 130
		bodyModel[130] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 131
		bodyModel[131] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 132
		bodyModel[132] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 133
		bodyModel[133] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 134
		bodyModel[134] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Load
		bodyModel[135] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 141

		bodyModel[0].addBox(0F, 0F, 0F, 54, 12, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-25F, -12F, 9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-25F, -14F, 9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-22F, -19F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-23F, -15F, 9F);

		bodyModel[4].addBox(0F, 0F, 0F, 55, 2, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-23F, -14F, 9F);

		bodyModel[5].addBox(0F, 0F, 0F, 54, 1, 1, 0F); // Box 5
		bodyModel[5].setRotationPoint(-22F, -15F, 9F);

		bodyModel[6].addBox(0F, 0F, 0F, 9, 22, 6, 0F); // Box 15
		bodyModel[6].setRotationPoint(-19F, -21F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[7].setRotationPoint(-19F, -16F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 9, 22, 4, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 134
		bodyModel[8].setRotationPoint(-19F, -17F, 2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 22, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 157
		bodyModel[9].setRotationPoint(-19F, -17F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-23F, -18F, 9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(-23F, -16F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 4F, 0F, 0F, 3F, -4F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 15
		bodyModel[12].setRotationPoint(-10F, -17F, 2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F,0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 16
		bodyModel[13].setRotationPoint(-8F, -16F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 17
		bodyModel[14].setRotationPoint(-20F, -16F, 6F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // Box 18
		bodyModel[15].setRotationPoint(29F, -12F, 9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[16].setRotationPoint(29F, -5F, 9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(-20F, -16F, 9F);

		bodyModel[18].addBox(0F, 0F, 0F, 14, 1, 20, 0F); // Box 178
		bodyModel[18].setRotationPoint(-28F, 0F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 179
		bodyModel[19].setRotationPoint(-28F, -11F, 8F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 203
		bodyModel[20].setRotationPoint(-28F, -11F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, -4F, 0F); // Box 27
		bodyModel[21].setRotationPoint(-10F, -17F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 28
		bodyModel[22].setRotationPoint(-19F, -16F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 29
		bodyModel[23].setRotationPoint(-20F, -16F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[24].setRotationPoint(-22F, -19F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, -1F, 0F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
		bodyModel[25].setRotationPoint(-23F, -18F, -12F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 32
		bodyModel[26].setRotationPoint(-23F, -16F, -12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[27].setRotationPoint(-23F, -15F, -12F);

		bodyModel[28].addBox(0F, 0F, 0F, 54, 1, 1, 0F); // Box 34
		bodyModel[28].setRotationPoint(-22F, -15F, -12F);

		bodyModel[29].addBox(0F, 0F, 0F, 55, 2, 1, 0F); // Box 35
		bodyModel[29].setRotationPoint(-23F, -14F, -12F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[30].setRotationPoint(-25F, -14F, -12F);

		bodyModel[31].addBox(0F, 0F, 0F, 54, 12, 1, 0F); // Box 37
		bodyModel[31].setRotationPoint(-25F, -12F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 25, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 38
		bodyModel[32].setRotationPoint(-8F, -16F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[33].setRotationPoint(29F, -5F, -12F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 7, 1, 0F); // Box 40
		bodyModel[34].setRotationPoint(29F, -12F, -12F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 9, 20, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 44
		bodyModel[35].setRotationPoint(-19F, -15F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 9, 20, 3, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 45
		bodyModel[36].setRotationPoint(-19F, -15F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 52, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[37].setRotationPoint(-20F, -16F, -12F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 11, 20, 0F); // Box 47
		bodyModel[38].setRotationPoint(-24F, -11F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 5, 10, 0F); // Box 48
		bodyModel[39].setRotationPoint(-24F, -16F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[40].setRotationPoint(-25F, -6F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[41].setRotationPoint(-25F, -6F, 5F);

		bodyModel[42].addBox(0F, -0.5F, -2.5F, 1, 1, 5, 0F); // Box 382
		bodyModel[42].setRotationPoint(-25F, -7F, 5.5F);
		bodyModel[42].rotateAngleX = 2.21656815F;

		bodyModel[43].addBox(0F, -0.5F, -2.5F, 1, 1, 1, 0F); // Box 383
		bodyModel[43].setRotationPoint(-26F, -7F, 5.5F);
		bodyModel[43].rotateAngleX = 2.21656815F;

		bodyModel[44].addBox(0F, -0.5F, 1.5F, 1, 1, 1, 0F); // Box 384
		bodyModel[44].setRotationPoint(-26F, -7F, 5.5F);
		bodyModel[44].rotateAngleX = 2.21656815F;

		bodyModel[45].addBox(0F, -0.5F, 1.5F, 1, 1, 1, 0F); // Box 54
		bodyModel[45].setRotationPoint(-26F, -7F, -7.5F);
		bodyModel[45].rotateAngleX = 3.35103216F;

		bodyModel[46].addBox(0F, -0.5F, -2.5F, 1, 1, 1, 0F); // Box 55
		bodyModel[46].setRotationPoint(-26F, -7F, -7.5F);
		bodyModel[46].rotateAngleX = 3.35103216F;

		bodyModel[47].addBox(0F, -0.5F, -2.5F, 1, 1, 5, 0F); // Box 56
		bodyModel[47].setRotationPoint(-25F, -7F, -7.5F);
		bodyModel[47].rotateAngleX = 3.35103216F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 57
		bodyModel[48].setRotationPoint(17F, -16F, -12F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 22, 4, 0F,0F, 3F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 58
		bodyModel[49].setRotationPoint(17F, -17F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 22, 6, 0F); // Box 59
		bodyModel[50].setRotationPoint(17F, -21F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 22, 4, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 60
		bodyModel[51].setRotationPoint(17F, -17F, 2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[52].setRotationPoint(17F, -16F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 62
		bodyModel[53].setRotationPoint(18F, -16F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 3F, -1F, 0F, 3F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 63
		bodyModel[54].setRotationPoint(18F, -16F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 20, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 64
		bodyModel[55].setRotationPoint(17F, -15F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 20, 3, 0F,0F, 4F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 65
		bodyModel[56].setRotationPoint(17F, -15F, 6F);

		bodyModel[57].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385
		bodyModel[57].setRotationPoint(28F, 1.5F, 6F);
		bodyModel[57].rotateAngleX = 0.78539816F;

		bodyModel[58].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386
		bodyModel[58].setRotationPoint(28F, 1.5F, -9F);
		bodyModel[58].rotateAngleX = 0.78539816F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		bodyModel[59].setRotationPoint(31.5F, 0F, 4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391
		bodyModel[60].setRotationPoint(31.5F, 0F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[61].setRotationPoint(28F, 1F, -2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[62].setRotationPoint(30F, 2F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[63].setRotationPoint(31.25F, 1F, -2F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Box 73
		bodyModel[64].setRotationPoint(27F, -11F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 57, 3, 1, 0F); // Box 74
		bodyModel[65].setRotationPoint(-28F, 0F, 9F);

		bodyModel[66].addBox(0F, 0F, 0F, 57, 3, 1, 0F); // Box 79
		bodyModel[66].setRotationPoint(-28F, 0F, -12F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 128
		bodyModel[67].setRotationPoint(27F, -16F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[68].setRotationPoint(27F, -19F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[69].setRotationPoint(27F, -19F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 5, 3, 0F); // Box 84
		bodyModel[70].setRotationPoint(27F, -16F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[71].setRotationPoint(27F, -12F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[72].setRotationPoint(27F, -12F, 5F);

		bodyModel[73].addBox(0F, 0F, 0F, 9, 1, 20, 0F); // Box 87
		bodyModel[73].setRotationPoint(18F, -10F, -11F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 88
		bodyModel[74].setRotationPoint(24F, -12F, -10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 89
		bodyModel[75].setRotationPoint(25F, -12F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 90
		bodyModel[76].setRotationPoint(23F, -12F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 91
		bodyModel[77].setRotationPoint(24F, -13F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[78].setRotationPoint(24F, -13F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 95
		bodyModel[79].setRotationPoint(24F, -13F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 96
		bodyModel[80].setRotationPoint(23F, -12F, 5F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 97
		bodyModel[81].setRotationPoint(24F, -12F, 4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 98
		bodyModel[82].setRotationPoint(25F, -12F, 5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 99
		bodyModel[83].setRotationPoint(24F, -13F, 4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 100
		bodyModel[84].setRotationPoint(24F, -13F, 5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[85].setRotationPoint(24F, -13F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 102
		bodyModel[86].setRotationPoint(19F, -13F, -3F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 3, 5, 0F); // Box 104
		bodyModel[87].setRotationPoint(18F, -13F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 105
		bodyModel[88].setRotationPoint(18F, -14F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[89].setRotationPoint(18F, -14F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 107
		bodyModel[90].setRotationPoint(18F, -14F, -4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 108
		bodyModel[91].setRotationPoint(18F, -18F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 346
		bodyModel[92].setRotationPoint(18F, 3F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[93].setRotationPoint(18F, 3F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[94].setRotationPoint(-1F, 3F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 118
		bodyModel[95].setRotationPoint(-1F, 3F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[96].setRotationPoint(-19F, 3F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 120
		bodyModel[97].setRotationPoint(-19F, 3F, -10F);

		bodyModel[98].addBox(0F, 0F, 0F, 50, 4, 1, 0F); // Box 121
		bodyModel[98].setRotationPoint(-28F, 3F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[99].setRotationPoint(22F, 3F, 6F);

		bodyModel[100].addBox(0F, 0F, 0F, 50, 4, 1, 0F); // Box 123
		bodyModel[100].setRotationPoint(-28F, 3F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[101].setRotationPoint(22F, 3F, -9F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 125
		bodyModel[102].setRotationPoint(-4F, 3F, -10F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 126
		bodyModel[103].setRotationPoint(4F, 3F, -10F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 127
		bodyModel[104].setRotationPoint(-14F, 3F, -10F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[105].setRotationPoint(-22F, 3F, -10F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 129
		bodyModel[106].setRotationPoint(23F, 3F, -10F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 130
		bodyModel[107].setRotationPoint(15F, 3F, -10F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 131
		bodyModel[108].setRotationPoint(23F, 3F, 7F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[109].setRotationPoint(15F, 3F, 7F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 133
		bodyModel[110].setRotationPoint(4F, 3F, 7F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		bodyModel[111].setRotationPoint(-4F, 3F, 7F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135
		bodyModel[112].setRotationPoint(-14F, 3F, 7F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 136
		bodyModel[113].setRotationPoint(-22F, 3F, 7F);

		bodyModel[114].addBox(0F, 0F, 0F, 50, 2, 20, 0F); // Box 137
		bodyModel[114].setRotationPoint(-28F, 1F, -11F);

		bodyModel[115].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Wheel
		bodyModel[115].setRotationPoint(19.5F, 5F, 5F);

		bodyModel[116].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Wheel
		bodyModel[116].setRotationPoint(19.5F, 5F, -7F);

		bodyModel[117].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 48
		bodyModel[117].setRotationPoint(19.5F, 5F, -8F);

		bodyModel[118].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Wheel
		bodyModel[118].setRotationPoint(0.5F, 5F, 5F);

		bodyModel[119].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Wheel
		bodyModel[119].setRotationPoint(0.5F, 5F, -7F);

		bodyModel[120].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 144
		bodyModel[120].setRotationPoint(0.5F, 5F, -8F);

		bodyModel[121].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Wheel
		bodyModel[121].setRotationPoint(-17.5F, 5F, 5F);

		bodyModel[122].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Wheel
		bodyModel[122].setRotationPoint(-17.5F, 5F, -7F);

		bodyModel[123].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 147
		bodyModel[123].setRotationPoint(-17.5F, 5F, -8F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 148
		bodyModel[124].setRotationPoint(-31F, 1.5F, -2F);

		bodyModel[125].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 125
		bodyModel[125].setRotationPoint(-28F, 3F, 8F);

		bodyModel[126].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 126
		bodyModel[126].setRotationPoint(-28F, 7F, 8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[127].setRotationPoint(-24F, 3F, 8F);

		bodyModel[128].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 129
		bodyModel[128].setRotationPoint(-28F, 3F, 9F);

		bodyModel[129].addBox(0F, 0F, 0F, 4, 4, 1, 0F); // Box 130
		bodyModel[129].setRotationPoint(-28F, 3F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Box 131
		bodyModel[130].setRotationPoint(-28F, 7F, -12F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[131].setRotationPoint(-24F, 4F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[132].setRotationPoint(-24F, 3F, -11F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 134
		bodyModel[133].setRotationPoint(-28F, 3F, -12F);

		bodyModel[134].addBox(0F, 0F, 0F, 27, 0, 18, 0F); // Load
		bodyModel[134].setRotationPoint(-10F, -17F, -10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[135].setRotationPoint(-24F, 4F, 8F);
	}
}