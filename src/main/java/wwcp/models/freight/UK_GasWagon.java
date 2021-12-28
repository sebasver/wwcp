//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.10.2021 - 11:51:46
// Last changed on: 01.10.2021 - 11:51:46

package wwcp.models.freight; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class UK_GasWagon extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public UK_GasWagon() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[166];

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
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 395
		bodyModel[11] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 396
		bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 397
		bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 398
		bodyModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 9
		bodyModel[29] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 47
		bodyModel[33] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 31
		bodyModel[36] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 32
		bodyModel[37] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 33
		bodyModel[38] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 34
		bodyModel[39] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 35
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 36
		bodyModel[41] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 37
		bodyModel[42] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 38
		bodyModel[43] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 39
		bodyModel[44] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 40
		bodyModel[45] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 65
		bodyModel[47] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 66
		bodyModel[48] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 67
		bodyModel[49] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 68
		bodyModel[50] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 70
		bodyModel[52] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 72
		bodyModel[53] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 74
		bodyModel[55] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 75
		bodyModel[56] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 76
		bodyModel[57] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 77
		bodyModel[58] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 78
		bodyModel[59] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 79
		bodyModel[60] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 80
		bodyModel[61] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 81
		bodyModel[62] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 82
		bodyModel[63] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 83
		bodyModel[64] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 84
		bodyModel[65] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 85
		bodyModel[66] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 86
		bodyModel[67] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 87
		bodyModel[68] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 88
		bodyModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 89
		bodyModel[70] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 90
		bodyModel[71] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 91
		bodyModel[72] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 92
		bodyModel[73] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 93
		bodyModel[74] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 94
		bodyModel[75] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 95
		bodyModel[76] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 96
		bodyModel[77] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 97
		bodyModel[78] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 98
		bodyModel[79] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 82
		bodyModel[80] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 83
		bodyModel[81] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 84
		bodyModel[82] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 85
		bodyModel[83] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 88
		bodyModel[85] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 89
		bodyModel[86] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 90
		bodyModel[87] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 91
		bodyModel[88] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 92
		bodyModel[89] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 94
		bodyModel[90] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 95
		bodyModel[91] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 96
		bodyModel[92] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 97
		bodyModel[93] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 98
		bodyModel[94] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 99
		bodyModel[95] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 100
		bodyModel[96] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 101
		bodyModel[97] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 102
		bodyModel[98] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 103
		bodyModel[99] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 104
		bodyModel[100] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 105
		bodyModel[101] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 106
		bodyModel[102] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 107
		bodyModel[103] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 108
		bodyModel[104] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 109
		bodyModel[105] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 110
		bodyModel[106] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 111
		bodyModel[107] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 112
		bodyModel[108] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 113
		bodyModel[109] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 114
		bodyModel[110] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 115
		bodyModel[111] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 118
		bodyModel[112] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 119
		bodyModel[113] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 120
		bodyModel[114] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 121
		bodyModel[115] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 122
		bodyModel[116] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 123
		bodyModel[117] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 124
		bodyModel[118] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 125
		bodyModel[119] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 126
		bodyModel[120] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 127
		bodyModel[121] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 129
		bodyModel[123] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 130
		bodyModel[124] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 131
		bodyModel[125] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 132
		bodyModel[126] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 133
		bodyModel[127] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 135
		bodyModel[128] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 136
		bodyModel[129] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 137
		bodyModel[130] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 138
		bodyModel[131] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 139
		bodyModel[132] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 140
		bodyModel[133] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 141
		bodyModel[134] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 142
		bodyModel[135] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 143
		bodyModel[136] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 144
		bodyModel[137] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 145
		bodyModel[138] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 146
		bodyModel[139] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 147
		bodyModel[140] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 148
		bodyModel[141] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 149
		bodyModel[142] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 150
		bodyModel[143] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 151
		bodyModel[144] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 152
		bodyModel[145] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 153
		bodyModel[146] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 154
		bodyModel[147] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 155
		bodyModel[148] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 156
		bodyModel[149] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 157
		bodyModel[150] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 158
		bodyModel[151] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 160
		bodyModel[152] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 161
		bodyModel[153] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 162
		bodyModel[154] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 163
		bodyModel[155] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 164
		bodyModel[156] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 165
		bodyModel[157] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 166
		bodyModel[158] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 167
		bodyModel[159] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 168
		bodyModel[160] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 169
		bodyModel[161] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 170
		bodyModel[162] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 174
		bodyModel[163] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 175
		bodyModel[164] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 176
		bodyModel[165] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 177

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[0].setRotationPoint(-25.5F, -0.5F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[1].setRotationPoint(-25.5F, -0.5F, 6F);

		bodyModel[2].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[2].setRotationPoint(-24.5F, 1F, 7.5F);
		bodyModel[2].rotateAngleX = 0.78539816F;

		bodyModel[3].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[3].setRotationPoint(-24.5F, 1F, -7.5F);
		bodyModel[3].rotateAngleX = 0.78539816F;

		bodyModel[4].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385
		bodyModel[4].setRotationPoint(21.5F, 1F, 7.5F);
		bodyModel[4].rotateAngleX = 0.78539816F;

		bodyModel[5].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386
		bodyModel[5].setRotationPoint(21.5F, 1F, -7.5F);
		bodyModel[5].rotateAngleX = 0.78539816F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		bodyModel[6].setRotationPoint(24F, -0.5F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391
		bodyModel[7].setRotationPoint(24F, -0.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[8].setRotationPoint(-23.5F, 1.5F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[9].setRotationPoint(-24.5F, 0.5F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[10].setRotationPoint(-21.5F, 0.5F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[11].setRotationPoint(21.5F, 0.5F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[12].setRotationPoint(22.5F, 1.5F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[13].setRotationPoint(23.75F, 0.5F, -0.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 14
		bodyModel[14].setRotationPoint(-21.5F, -0.5F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Box 15
		bodyModel[15].setRotationPoint(20.5F, -0.5F, -10F);

		bodyModel[16].addBox(0F, 0F, 0F, 41, 2, 18, 0F); // Box 16
		bodyModel[16].setRotationPoint(-20.5F, 0.5F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 41, 1, 20, 0F); // Box 17
		bodyModel[17].setRotationPoint(-20.5F, -0.5F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(14.5F, 2.5F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 32
		bodyModel[19].setRotationPoint(7.5F, 2.5F, 7F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 33
		bodyModel[20].setRotationPoint(9.5F, 2.5F, 7F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		bodyModel[21].setRotationPoint(12.5F, 2.5F, 7F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 35
		bodyModel[22].setRotationPoint(10.5F, 5.5F, 7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 36
		bodyModel[23].setRotationPoint(11F, 2.5F, 8F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
		bodyModel[24].setRotationPoint(15F, 2.5F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 38
		bodyModel[25].setRotationPoint(7F, 2.5F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[26].setRotationPoint(8F, 2.5F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[27].setRotationPoint(12F, 2.5F, 8F);

		bodyModel[28].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[28].setRotationPoint(11.5F, 6F, 6F);

		bodyModel[29].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[29].setRotationPoint(11.5F, 6F, -6F);

		bodyModel[30].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 42
		bodyModel[30].setRotationPoint(11.5F, 6F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 45
		bodyModel[31].setRotationPoint(10.5F, 3.5F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 47
		bodyModel[32].setRotationPoint(7F, 4.5F, 7F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 49
		bodyModel[33].setRotationPoint(-8F, 4.5F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F); // Box 52
		bodyModel[34].setRotationPoint(-2F, 2.5F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 31
		bodyModel[35].setRotationPoint(-8.5F, 2.5F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 32
		bodyModel[36].setRotationPoint(-15.5F, 2.5F, 7F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 33
		bodyModel[37].setRotationPoint(-13.5F, 2.5F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		bodyModel[38].setRotationPoint(-10.5F, 2.5F, 7F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 35
		bodyModel[39].setRotationPoint(-12.5F, 5.5F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 36
		bodyModel[40].setRotationPoint(-12F, 2.5F, 8F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
		bodyModel[41].setRotationPoint(-8F, 2.5F, 8F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 38
		bodyModel[42].setRotationPoint(-16F, 2.5F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[43].setRotationPoint(-15F, 2.5F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[44].setRotationPoint(-11F, 2.5F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 45
		bodyModel[45].setRotationPoint(-12.5F, 3.5F, 7F);

		bodyModel[46].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 65
		bodyModel[46].setRotationPoint(-11.5F, 6F, 6F);

		bodyModel[47].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 66
		bodyModel[47].setRotationPoint(-11.5F, 6F, -8F);

		bodyModel[48].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 67
		bodyModel[48].setRotationPoint(-11.5F, 6F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F); // Box 68
		bodyModel[49].setRotationPoint(1F, 2.5F, 7F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 69
		bodyModel[50].setRotationPoint(-0.5F, 5.25F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 70
		bodyModel[51].setRotationPoint(7F, 4.5F, -8F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 72
		bodyModel[52].setRotationPoint(-0.5F, 5.25F, -8F);

		bodyModel[53].addShapeBox(-0.5F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.5F, 0F, 0F); // Box 73
		bodyModel[53].setRotationPoint(-6F, 5.5F, -8.01F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 74
		bodyModel[54].setRotationPoint(-8F, 4.5F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F); // Box 75
		bodyModel[55].setRotationPoint(-2F, 2.5F, -8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F); // Box 76
		bodyModel[56].setRotationPoint(1F, 2.5F, -8F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 77
		bodyModel[57].setRotationPoint(7F, 2.5F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[58].setRotationPoint(8F, 2.5F, -9F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 79
		bodyModel[59].setRotationPoint(11F, 2.5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 80
		bodyModel[60].setRotationPoint(12F, 2.5F, -9F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 81
		bodyModel[61].setRotationPoint(15F, 2.5F, -9F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 82
		bodyModel[62].setRotationPoint(-8F, 2.5F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 83
		bodyModel[63].setRotationPoint(-11F, 2.5F, -9F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 84
		bodyModel[64].setRotationPoint(-12F, 2.5F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[65].setRotationPoint(-15F, 2.5F, -9F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 86
		bodyModel[66].setRotationPoint(-16F, 2.5F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 87
		bodyModel[67].setRotationPoint(14.5F, 2.5F, -8F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 88
		bodyModel[68].setRotationPoint(12.5F, 2.5F, -8F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 89
		bodyModel[69].setRotationPoint(9.5F, 2.5F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 90
		bodyModel[70].setRotationPoint(7.5F, 2.5F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 91
		bodyModel[71].setRotationPoint(-8.5F, 2.5F, -8F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 92
		bodyModel[72].setRotationPoint(-10.5F, 2.5F, -8F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 93
		bodyModel[73].setRotationPoint(-13.5F, 2.5F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 94
		bodyModel[74].setRotationPoint(-15.5F, 2.5F, -8F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 95
		bodyModel[75].setRotationPoint(10.5F, 5.5F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[76].setRotationPoint(10.5F, 3.5F, -9F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 2, 3, 0F); // Box 97
		bodyModel[77].setRotationPoint(-12.5F, 5.5F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[78].setRotationPoint(-12.5F, 3.5F, -9F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 82
		bodyModel[79].setRotationPoint(-18.5F, 2.5F, 9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[80].setRotationPoint(-14.5F, 2.5F, 9F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 84
		bodyModel[81].setRotationPoint(-0.5F, 5.5F, 8F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 85
		bodyModel[82].setRotationPoint(-15.5F, 1.5F, 9F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 87
		bodyModel[83].setRotationPoint(-15.5F, 2.5F, 10F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 88
		bodyModel[84].setRotationPoint(-15.5F, 2.5F, 8F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 89
		bodyModel[85].setRotationPoint(-15.5F, 4.5F, 9F);

		bodyModel[86].addShapeBox(-0.5F, 0F, 0F, 6, 1, 1, 0F,0F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.75F, 0F); // Box 90
		bodyModel[86].setRotationPoint(1F, 6F, -8.01F);

		bodyModel[87].addShapeBox(-0.5F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F); // Box 91
		bodyModel[87].setRotationPoint(1.5F, 6.25F, 7F);

		bodyModel[88].addShapeBox(-0.5F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, 0F); // Box 92
		bodyModel[88].setRotationPoint(-6.5F, 5.25F, 7F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 94
		bodyModel[89].setRotationPoint(21.5F, 1.5F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[90].setRotationPoint(24.5F, 3.5F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[91].setRotationPoint(22.5F, 1.5F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[92].setRotationPoint(-25.5F, 3.5F, 2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F); // Box 98
		bodyModel[93].setRotationPoint(-25.5F, 1.5F, 2F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 99
		bodyModel[94].setRotationPoint(-22.5F, 1.5F, 2F);

		bodyModel[95].addBox(0F, 0F, 0F, 36, 7, 3, 0F); // Box 100
		bodyModel[95].setRotationPoint(-18.5F, -8.5F, -6F);

		bodyModel[96].addBox(0F, 0F, 0F, 36, 3, 2, 0F); // Box 101
		bodyModel[96].setRotationPoint(-18.5F, -6.5F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[97].setRotationPoint(-18.5F, -8.5F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[98].setRotationPoint(-18.5F, -3.5F, -8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 104
		bodyModel[99].setRotationPoint(-18.5F, -3.5F, -3F);

		bodyModel[100].addBox(0F, 0F, 0F, 36, 3, 2, 0F); // Box 105
		bodyModel[100].setRotationPoint(-18.5F, -6.5F, -3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[101].setRotationPoint(-18.5F, -8.5F, -3F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 107
		bodyModel[102].setRotationPoint(-19.5F, -6.5F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[103].setRotationPoint(-19.5F, -8.5F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 109
		bodyModel[104].setRotationPoint(-19.5F, -3.5F, -6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[105].setRotationPoint(-19.5F, -6.5F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 111
		bodyModel[106].setRotationPoint(-19.5F, -6.5F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 112
		bodyModel[107].setRotationPoint(-19.5F, -8.5F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[108].setRotationPoint(-19.5F, -8.5F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 114
		bodyModel[109].setRotationPoint(-19.5F, -3.5F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 115
		bodyModel[110].setRotationPoint(-19.5F, -3.5F, -3F);

		bodyModel[111].addBox(0F, 0F, 0F, 36, 3, 2, 0F); // Box 118
		bodyModel[111].setRotationPoint(-18.5F, -6.5F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[112].setRotationPoint(-18.5F, -8.5F, 1F);

		bodyModel[113].addBox(0F, 0F, 0F, 36, 7, 3, 0F); // Box 120
		bodyModel[113].setRotationPoint(-18.5F, -8.5F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[114].setRotationPoint(-18.5F, -3.5F, 1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 122
		bodyModel[115].setRotationPoint(-18.5F, -3.5F, 6F);

		bodyModel[116].addBox(0F, 0F, 0F, 36, 3, 2, 0F); // Box 123
		bodyModel[116].setRotationPoint(-18.5F, -6.5F, 6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 36, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[117].setRotationPoint(-18.5F, -8.5F, 6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 125
		bodyModel[118].setRotationPoint(-19.5F, -8.5F, 6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 126
		bodyModel[119].setRotationPoint(-19.5F, -6.5F, 6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F); // Box 127
		bodyModel[120].setRotationPoint(-19.5F, -3.5F, 6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[121].setRotationPoint(-19.5F, -3.5F, 3F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 129
		bodyModel[122].setRotationPoint(-19.5F, -6.5F, 3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[123].setRotationPoint(-19.5F, -8.5F, 3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[124].setRotationPoint(-19.5F, -8.5F, 1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[125].setRotationPoint(-19.5F, -6.5F, 1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 133
		bodyModel[126].setRotationPoint(-19.5F, -3.5F, 1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[127].setRotationPoint(17.5F, -8.5F, 3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[128].setRotationPoint(17.5F, -8.5F, 1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[129].setRotationPoint(17.5F, -6.5F, 1F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 138
		bodyModel[130].setRotationPoint(17.5F, -6.5F, 3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[131].setRotationPoint(17.5F, -3.5F, 1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[132].setRotationPoint(17.5F, -3.5F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 141
		bodyModel[133].setRotationPoint(17.5F, -3.5F, 6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[134].setRotationPoint(17.5F, -6.5F, 6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[135].setRotationPoint(17.5F, -8.5F, 6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[136].setRotationPoint(17.5F, -8.5F, -3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[137].setRotationPoint(17.5F, -8.5F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[138].setRotationPoint(17.5F, -8.5F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[139].setRotationPoint(17.5F, -6.5F, -8F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 148
		bodyModel[140].setRotationPoint(17.5F, -6.5F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[141].setRotationPoint(17.5F, -6.5F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 150
		bodyModel[142].setRotationPoint(17.5F, -3.5F, -3F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[143].setRotationPoint(17.5F, -3.5F, -6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[144].setRotationPoint(17.5F, -3.5F, -8F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 153
		bodyModel[145].setRotationPoint(20.5F, -8.5F, -10F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 154
		bodyModel[146].setRotationPoint(20.5F, -8.5F, 9F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 155
		bodyModel[147].setRotationPoint(20.5F, -8.5F, -9F);

		bodyModel[148].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 156
		bodyModel[148].setRotationPoint(18.5F, -6F, -5.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 157
		bodyModel[149].setRotationPoint(18.5F, -6F, 3.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 158
		bodyModel[150].setRotationPoint(-16.5F, -2.5F, -9F);

		bodyModel[151].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 160
		bodyModel[151].setRotationPoint(13.5F, -2.5F, -9F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 161
		bodyModel[152].setRotationPoint(4.5F, -2.5F, -9F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 162
		bodyModel[153].setRotationPoint(-7.5F, -2.5F, -9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 163
		bodyModel[154].setRotationPoint(-16.5F, -6.5F, -9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 164
		bodyModel[155].setRotationPoint(-6.5F, -6.5F, -9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 165
		bodyModel[156].setRotationPoint(4.5F, -6.5F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 166
		bodyModel[157].setRotationPoint(14.5F, -6.5F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 167
		bodyModel[158].setRotationPoint(14.5F, -6.5F, 8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 168
		bodyModel[159].setRotationPoint(4.5F, -6.5F, 8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 169
		bodyModel[160].setRotationPoint(-6.5F, -6.5F, 8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 170
		bodyModel[161].setRotationPoint(-16.5F, -6.5F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[162].setRotationPoint(-16.5F, -8.5F, -3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 175
		bodyModel[163].setRotationPoint(-6.5F, -8.5F, -3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 176
		bodyModel[164].setRotationPoint(4.5F, -8.5F, -3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 177
		bodyModel[165].setRotationPoint(14.5F, -8.5F, -3F);
	}
}