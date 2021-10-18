//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.04.2019 - 20:11:44
// Last changed on: 17.04.2019 - 20:11:44

package wwcp.models.locomotives.steamers; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Gyromotive extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Gyromotive() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[160];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Wheel
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Wheel
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 48
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 16
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 17
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 21
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 385
		bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 386
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 388
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 391
		bodyModel[11] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 393
		bodyModel[12] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 394
		bodyModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 395
		bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 396
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 397
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 398
		bodyModel[17] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 116
		bodyModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 117
		bodyModel[20] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 118
		bodyModel[21] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 119
		bodyModel[22] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 120
		bodyModel[23] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 121
		bodyModel[24] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 122
		bodyModel[25] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 60
		bodyModel[27] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 62
		bodyModel[28] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 144
		bodyModel[33] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 165
		bodyModel[34] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 235
		bodyModel[35] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 160
		bodyModel[36] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 134
		bodyModel[42] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 58
		bodyModel[46] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 64
		bodyModel[52] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 65
		bodyModel[53] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 67
		bodyModel[54] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 68
		bodyModel[55] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 69
		bodyModel[56] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 80
		bodyModel[80] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 85
		bodyModel[85] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 86
		bodyModel[86] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 87
		bodyModel[87] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 88
		bodyModel[88] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 89
		bodyModel[89] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 90
		bodyModel[90] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 91
		bodyModel[91] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 92
		bodyModel[92] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 93
		bodyModel[93] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 94
		bodyModel[94] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 95
		bodyModel[95] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 96
		bodyModel[96] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 97
		bodyModel[97] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 98
		bodyModel[98] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 99
		bodyModel[99] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 100
		bodyModel[100] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 101
		bodyModel[101] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 102
		bodyModel[102] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 103
		bodyModel[103] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 104
		bodyModel[104] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 105
		bodyModel[105] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 106
		bodyModel[106] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 107
		bodyModel[107] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 108
		bodyModel[108] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 109
		bodyModel[109] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 110
		bodyModel[110] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 111
		bodyModel[111] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 128
		bodyModel[112] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 129
		bodyModel[113] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 130
		bodyModel[114] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 131
		bodyModel[115] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 132
		bodyModel[116] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 133
		bodyModel[117] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 118
		bodyModel[118] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 119
		bodyModel[119] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 120
		bodyModel[120] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 121
		bodyModel[121] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 123
		bodyModel[122] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 124
		bodyModel[123] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 125
		bodyModel[124] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 126
		bodyModel[125] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 253
		bodyModel[126] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 254
		bodyModel[127] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 255
		bodyModel[128] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 256
		bodyModel[129] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 257
		bodyModel[130] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 258
		bodyModel[131] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 259
		bodyModel[132] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 292
		bodyModel[133] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 293
		bodyModel[134] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 294
		bodyModel[135] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 295
		bodyModel[136] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 296
		bodyModel[137] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 298
		bodyModel[138] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 299
		bodyModel[139] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 141
		bodyModel[140] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 142
		bodyModel[141] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 95
		bodyModel[142] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 96
		bodyModel[143] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 97
		bodyModel[144] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 99
		bodyModel[145] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 100
		bodyModel[146] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 101
		bodyModel[147] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 150
		bodyModel[148] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 151
		bodyModel[149] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 152
		bodyModel[150] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 212
		bodyModel[151] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 213
		bodyModel[152] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 214
		bodyModel[153] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 242
		bodyModel[154] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 243
		bodyModel[155] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 244
		bodyModel[156] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 248
		bodyModel[157] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 160
		bodyModel[158] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 161
		bodyModel[159] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 163

		bodyModel[0].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Wheel
		bodyModel[0].setRotationPoint(0F, 5F, 6F);

		bodyModel[1].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Wheel
		bodyModel[1].setRotationPoint(0F, 5F, -6F);

		bodyModel[2].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 48
		bodyModel[2].setRotationPoint(0F, 5F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-22F, 0F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[4].setRotationPoint(-22F, 0F, 6F);

		bodyModel[5].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[5].setRotationPoint(-21F, 1.5F, 7.5F);
		bodyModel[5].rotateAngleX = 0.78539816F;

		bodyModel[6].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[6].setRotationPoint(-21F, 1.5F, -7.5F);
		bodyModel[6].rotateAngleX = 0.78539816F;

		bodyModel[7].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385
		bodyModel[7].setRotationPoint(25F, 1.5F, 7.5F);
		bodyModel[7].rotateAngleX = 0.78539816F;

		bodyModel[8].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386
		bodyModel[8].setRotationPoint(25F, 1.5F, -7.5F);
		bodyModel[8].rotateAngleX = 0.78539816F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		bodyModel[9].setRotationPoint(27.5F, 0F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391
		bodyModel[10].setRotationPoint(27.5F, 0F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[11].setRotationPoint(-20F, 2F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[12].setRotationPoint(-21F, 1F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[13].setRotationPoint(-18F, 1F, -0.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[14].setRotationPoint(25F, 1F, -0.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[15].setRotationPoint(26F, 2F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[16].setRotationPoint(27.25F, 1F, -0.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 3, 22, 0F); // Box 18
		bodyModel[17].setRotationPoint(-18F, 0F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 29, 10, 4, 0F); // Box 116
		bodyModel[18].setRotationPoint(-15F, -13F, -2F);

		bodyModel[19].addBox(0F, 0F, 0F, 29, 4, 3, 0F); // Box 117
		bodyModel[19].setRotationPoint(-15F, -10F, -5F);

		bodyModel[20].addBox(0F, 0F, 0F, 29, 4, 3, 0F); // Box 118
		bodyModel[20].setRotationPoint(-15F, -10F, 2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 29, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[21].setRotationPoint(-15F, -13F, 2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 29, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[22].setRotationPoint(-15F, -13F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 28, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[23].setRotationPoint(-15F, -6F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 28, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 122
		bodyModel[24].setRotationPoint(-15F, -6F, 2F);

		bodyModel[25].addBox(0F, 0F, 0F, 26, 7, 10, 0F); // Box 27
		bodyModel[25].setRotationPoint(-17F, 0F, -5F);

		bodyModel[26].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 60
		bodyModel[26].setRotationPoint(-16F, 1F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 62
		bodyModel[27].setRotationPoint(-16F, 2F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[28].setRotationPoint(-16F, 2F, -6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(-16F, 2F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 33
		bodyModel[30].setRotationPoint(-16F, 2F, 5F);

		bodyModel[31].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 34
		bodyModel[31].setRotationPoint(-16F, 1F, 6F);

		bodyModel[32].addBox(-11F, -0.5F, 0F, 11, 1, 1, 0F); // Box 144
		bodyModel[32].setRotationPoint(0F, 7F, -7F);
		bodyModel[32].rotateAngleZ = -0.38397244F;

		bodyModel[33].addBox(-1F, -1F, 0F, 2, 2, 1, 0F); // Box 165
		bodyModel[33].setRotationPoint(-2F, 5F, 6.01F);
		bodyModel[33].rotateAngleZ = 0.78539816F;

		bodyModel[34].addBox(-1F, -1F, 0F, 2, 2, 1, 0F); // Box 235
		bodyModel[34].setRotationPoint(0F, 7F, -7.01F);
		bodyModel[34].rotateAngleZ = 0.78539816F;

		bodyModel[35].addBox(-11.5F, -0.5F, 0F, 11, 1, 1, 0F); // Box 160
		bodyModel[35].setRotationPoint(-1.5F, 5F, 6F);
		bodyModel[35].rotateAngleZ = -0.2268928F;

		bodyModel[36].addBox(0F, 0F, 0F, 25, 6, 6, 0F); // Box 40
		bodyModel[36].setRotationPoint(-13F, -6F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(3F, -6F, -10F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 6, 1, 0F); // Box 42
		bodyModel[38].setRotationPoint(4F, -6F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 8, 6, 1, 0F); // Box 43
		bodyModel[39].setRotationPoint(4F, -6F, -6F);

		bodyModel[40].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 44
		bodyModel[40].setRotationPoint(4F, -1F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 15, 1, 8, 0F); // Box 134
		bodyModel[41].setRotationPoint(9F, -19F, -4F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 55
		bodyModel[42].setRotationPoint(9F, 0F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 56
		bodyModel[43].setRotationPoint(9F, -16F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[44].setRotationPoint(9F, -19F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[45].setRotationPoint(9F, -17F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[46].setRotationPoint(9F, -17F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 15, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 60
		bodyModel[47].setRotationPoint(9F, -19F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 61
		bodyModel[48].setRotationPoint(3F, -6F, 6F);

		bodyModel[49].addBox(0F, 0F, 0F, 8, 6, 1, 0F); // Box 62
		bodyModel[49].setRotationPoint(4F, -6F, 5F);

		bodyModel[50].addBox(0F, 0F, 0F, 5, 6, 1, 0F); // Box 63
		bodyModel[50].setRotationPoint(4F, -6F, 10F);

		bodyModel[51].addBox(0F, 0F, 0F, 8, 1, 4, 0F); // Box 64
		bodyModel[51].setRotationPoint(4F, -1F, 6F);

		bodyModel[52].addBox(0F, 0F, 0F, 12, 1, 22, 0F); // Box 65
		bodyModel[52].setRotationPoint(12F, 2F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 3, 22, 0F); // Box 67
		bodyModel[53].setRotationPoint(24F, 0F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[54].setRotationPoint(9F, 0F, -5F);

		bodyModel[55].addBox(0F, 0F, 0F, 15, 4, 10, 0F); // Box 69
		bodyModel[55].setRotationPoint(9F, 3F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[56].setRotationPoint(23F, -18F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[57].setRotationPoint(23F, -18F, 4F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 59
		bodyModel[58].setRotationPoint(23F, -18F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 60
		bodyModel[59].setRotationPoint(9F, -16F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[60].setRotationPoint(9F, -16F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[61].setRotationPoint(9F, -13F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[62].setRotationPoint(9F, -13F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[63].setRotationPoint(9F, -16F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[64].setRotationPoint(9F, -13F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 66
		bodyModel[65].setRotationPoint(9F, -16F, 5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[66].setRotationPoint(9F, -13F, 5F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 68
		bodyModel[67].setRotationPoint(9F, -16F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[68].setRotationPoint(9F, -18F, -10F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 2, 8, 0F); // Box 70
		bodyModel[69].setRotationPoint(9F, -18F, -4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[70].setRotationPoint(9F, -18F, 4F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 11, 18, 0F); // Box 72
		bodyModel[71].setRotationPoint(9F, -12F, -9F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 73
		bodyModel[72].setRotationPoint(9F, -16F, -5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 74
		bodyModel[73].setRotationPoint(9F, -16F, 9F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 75
		bodyModel[74].setRotationPoint(9F, -16F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[75].setRotationPoint(23F, -13F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[76].setRotationPoint(23F, -13F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[77].setRotationPoint(23F, -16F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 79
		bodyModel[78].setRotationPoint(23F, -16F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 80
		bodyModel[79].setRotationPoint(23F, -16F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[80].setRotationPoint(23F, -13F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(23F, -13F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[82].setRotationPoint(23F, -16F, 8F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // Box 84
		bodyModel[83].setRotationPoint(23F, -16F, -5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 85
		bodyModel[84].setRotationPoint(23F, -16F, 9F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 86
		bodyModel[85].setRotationPoint(23F, -16F, -10F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 87
		bodyModel[86].setRotationPoint(23F, -12F, -9F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 88
		bodyModel[87].setRotationPoint(22F, -16F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 2, 18, 1, 0F); // Box 89
		bodyModel[88].setRotationPoint(22F, -16F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 90
		bodyModel[89].setRotationPoint(12F, -16F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 91
		bodyModel[90].setRotationPoint(12F, -16F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[91].setRotationPoint(12F, -15F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 93
		bodyModel[92].setRotationPoint(21F, -15F, -11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[93].setRotationPoint(12F, -9F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 95
		bodyModel[94].setRotationPoint(12F, -8F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 96
		bodyModel[95].setRotationPoint(21F, -8F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[96].setRotationPoint(21F, -9F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[97].setRotationPoint(21F, -9F, 10F);

		bodyModel[98].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 99
		bodyModel[98].setRotationPoint(12F, -8F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[99].setRotationPoint(12F, -9F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[100].setRotationPoint(12F, -15F, 10F);

		bodyModel[101].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 102
		bodyModel[101].setRotationPoint(12F, -16F, 10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 103
		bodyModel[102].setRotationPoint(21F, -15F, 10F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 104
		bodyModel[103].setRotationPoint(21F, -8F, 10F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 105
		bodyModel[104].setRotationPoint(-13F, -18F, -1F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[105].setRotationPoint(-13F, -19F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 107
		bodyModel[106].setRotationPoint(-13F, -21F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 108
		bodyModel[107].setRotationPoint(-13F, -19F, 1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[108].setRotationPoint(-13F, -21F, 1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 110
		bodyModel[109].setRotationPoint(-15F, -21F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[110].setRotationPoint(-11F, -21F, -1F);

		bodyModel[111].addBox(0F, 0F, 0F, 6, 4, 2, 0F); // Box 128
		bodyModel[111].setRotationPoint(-4F, -16.5F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[112].setRotationPoint(-2F, -16.5F, 1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 130
		bodyModel[113].setRotationPoint(-2F, -16.5F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 131
		bodyModel[114].setRotationPoint(-2F, -18.5F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[115].setRotationPoint(-2F, -18.5F, 1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 133
		bodyModel[116].setRotationPoint(-2F, -18.5F, -3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[117].setRotationPoint(8F, -18F, -0.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 3, 8, 3, 0F); // Box 119
		bodyModel[118].setRotationPoint(11F, -6F, -5F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 8, 3, 0F); // Box 120
		bodyModel[119].setRotationPoint(11F, -6F, 2F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 121
		bodyModel[120].setRotationPoint(11F, -3F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[121].setRotationPoint(10F, -3F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[122].setRotationPoint(10F, -3F, 6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 125
		bodyModel[123].setRotationPoint(-7F, -5F, -8F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 126
		bodyModel[124].setRotationPoint(-7F, -3F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 253
		bodyModel[125].setRotationPoint(-4.5F, -4F, -4F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 254
		bodyModel[126].setRotationPoint(3.5F, -4F, -4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 255
		bodyModel[127].setRotationPoint(0.5F, -3.5F, -4F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 256
		bodyModel[128].setRotationPoint(3.5F, -1.5F, -4F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 257
		bodyModel[129].setRotationPoint(-0.5F, -3.5F, -4F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 258
		bodyModel[130].setRotationPoint(-4.5F, -3.5F, -4F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 259
		bodyModel[131].setRotationPoint(-4.5F, -1.5F, -4F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 292
		bodyModel[132].setRotationPoint(-4.5F, -1.5F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 293
		bodyModel[133].setRotationPoint(-4.5F, -4F, 3F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 294
		bodyModel[134].setRotationPoint(-4.5F, -3.5F, 3F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 295
		bodyModel[135].setRotationPoint(-0.5F, -3.5F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 296
		bodyModel[136].setRotationPoint(0.5F, -3.5F, 3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 298
		bodyModel[137].setRotationPoint(3.5F, -4F, 3F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 299
		bodyModel[138].setRotationPoint(3.5F, -1.5F, 3F);

		bodyModel[139].addBox(0F, 0F, 0F, 5, 0, 4, 0F); // Box 141
		bodyModel[139].setRotationPoint(4F, -5F, -10F);

		bodyModel[140].addBox(0F, 0F, 0F, 5, 0, 4, 0F); // Box 142
		bodyModel[140].setRotationPoint(4F, -5F, 6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[141].setRotationPoint(-16F, -12F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[142].setRotationPoint(-16F, -10F, -4F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 97
		bodyModel[143].setRotationPoint(-16F, -12F, 2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[144].setRotationPoint(-16F, -12F, -4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 100
		bodyModel[145].setRotationPoint(-16F, -6F, -4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F); // Box 101
		bodyModel[146].setRotationPoint(-16F, -6F, 2F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 150
		bodyModel[147].setRotationPoint(-16F, -6F, -2F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 151
		bodyModel[148].setRotationPoint(-16F, -10F, 2F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 152
		bodyModel[149].setRotationPoint(-16F, -10F, -2F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[150].setRotationPoint(-17F, -8.5F, -0.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 213
		bodyModel[151].setRotationPoint(-17.25F, -7.5F, -0.5F);

		bodyModel[152].addShapeBox(0F, 0.5F, -0.5F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 214
		bodyModel[152].setRotationPoint(-16.75F, -8F, 0F);
		bodyModel[152].rotateAngleX = 0.78539816F;

		bodyModel[153].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 242
		bodyModel[153].setRotationPoint(10F, -16F, -4F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 243
		bodyModel[154].setRotationPoint(10F, -16F, 2F);

		bodyModel[155].addBox(0F, -4.5F, -0.5F, 1, 5, 1, 0F); // Box 244
		bodyModel[155].setRotationPoint(14F, -10F, 0F);
		bodyModel[155].rotateAngleX = 0.9250245F;
		bodyModel[155].rotateAngleZ = -0.01745329F;

		bodyModel[156].addBox(0F, -4.5F, -0.5F, 1, 1, 1, 0F); // Box 248
		bodyModel[156].setRotationPoint(15F, -10F, 0F);
		bodyModel[156].rotateAngleX = 0.9250245F;
		bodyModel[156].rotateAngleZ = -0.01745329F;

		bodyModel[157].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[157].setRotationPoint(10F, -17F, -1F);

		bodyModel[158].addBox(-1F, 0F, 0F, 1, 4, 2, 0F); // Box 161
		bodyModel[158].setRotationPoint(14F, -11F, 5F);
		bodyModel[158].rotateAngleY = -0.50614548F;

		bodyModel[159].addBox(0F, -7F, 0F, 1, 8, 1, 0F); // Box 163
		bodyModel[159].setRotationPoint(14F, 1F, -7.5F);
		bodyModel[159].rotateAngleX = 0.01745329F;
		bodyModel[159].rotateAngleY = 0.01745329F;
		bodyModel[159].rotateAngleZ = -0.2443461F;
	}
}