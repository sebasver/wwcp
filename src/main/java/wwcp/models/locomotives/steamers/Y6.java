//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.12.2018 - 20:16:37
// Last changed on: 25.12.2018 - 20:16:37

package wwcp.models.locomotives.steamers; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Y6 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Y6() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[155];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 17
		bodyModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 21
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 393
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 394
		bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 395
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 24
		bodyModel[21] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 60
		bodyModel[49] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 61
		bodyModel[50] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 62
		bodyModel[51] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 64
		bodyModel[53] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 66
		bodyModel[54] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 69
		bodyModel[56] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 74
		bodyModel[58] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 75
		bodyModel[59] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 76
		bodyModel[60] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 77
		bodyModel[61] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 78
		bodyModel[62] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 81
		bodyModel[65] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 82
		bodyModel[66] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 83
		bodyModel[67] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 84
		bodyModel[68] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 85
		bodyModel[69] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 86
		bodyModel[70] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 88
		bodyModel[72] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 89
		bodyModel[73] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 90
		bodyModel[74] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 91
		bodyModel[75] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 92
		bodyModel[76] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 95
		bodyModel[77] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 96
		bodyModel[78] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 97
		bodyModel[79] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 98
		bodyModel[80] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 99
		bodyModel[81] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 100
		bodyModel[82] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 101
		bodyModel[83] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 102
		bodyModel[84] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 103
		bodyModel[85] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 104
		bodyModel[86] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 105
		bodyModel[87] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 106
		bodyModel[88] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 123
		bodyModel[89] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 124
		bodyModel[90] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 125
		bodyModel[91] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 129
		bodyModel[93] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 102
		bodyModel[94] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 103
		bodyModel[95] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 104
		bodyModel[96] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 105
		bodyModel[97] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 106
		bodyModel[98] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 107
		bodyModel[99] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 108
		bodyModel[100] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 122
		bodyModel[101] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 123
		bodyModel[102] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 124
		bodyModel[103] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 125
		bodyModel[104] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 126
		bodyModel[105] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 131
		bodyModel[106] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 132
		bodyModel[107] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 133
		bodyModel[108] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 134
		bodyModel[109] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 135
		bodyModel[110] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 136
		bodyModel[111] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 137
		bodyModel[112] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 138
		bodyModel[113] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 139
		bodyModel[114] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 140
		bodyModel[115] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 146
		bodyModel[116] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 147
		bodyModel[117] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 148
		bodyModel[118] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 149
		bodyModel[119] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 151
		bodyModel[120] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 152
		bodyModel[121] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 153
		bodyModel[122] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 154
		bodyModel[123] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 155
		bodyModel[124] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 156
		bodyModel[125] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 157
		bodyModel[126] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 158
		bodyModel[127] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 159
		bodyModel[128] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 160
		bodyModel[129] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 161
		bodyModel[130] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 162
		bodyModel[131] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 163
		bodyModel[132] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 164
		bodyModel[133] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 165
		bodyModel[134] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 166
		bodyModel[135] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 167
		bodyModel[136] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 168
		bodyModel[137] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 169
		bodyModel[138] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 9
		bodyModel[139] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 39
		bodyModel[140] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 42
		bodyModel[141] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 173
		bodyModel[142] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 174
		bodyModel[143] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 175
		bodyModel[144] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 176
		bodyModel[145] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 177
		bodyModel[146] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 178
		bodyModel[147] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 153
		bodyModel[148] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 154
		bodyModel[149] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 155
		bodyModel[150] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 156
		bodyModel[151] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 157
		bodyModel[152] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 158
		bodyModel[153] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 159
		bodyModel[154] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 160

		bodyModel[0].addBox(0F, 0F, 0F, 41, 6, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-20.5F, -3F, -10.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 3, 21, 0F); // Box 1
		bodyModel[1].setRotationPoint(-22.5F, 0F, -10.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(-26.5F, 0F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[3].setRotationPoint(-26.5F, 0F, 6F);

		bodyModel[4].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[4].setRotationPoint(-25.5F, 1.5F, 7.5F);
		bodyModel[4].rotateAngleX = 0.78539816F;

		bodyModel[5].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[5].setRotationPoint(-25.5F, 1.5F, -7.5F);
		bodyModel[5].rotateAngleX = 0.78539816F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[6].setRotationPoint(-24.5F, 2F, -0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[7].setRotationPoint(-25.5F, 1F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[8].setRotationPoint(-22.5F, 1F, -0.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 3, 21, 0F); // Box 9
		bodyModel[9].setRotationPoint(21.5F, 0F, -10.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 31, 16, 1, 0F); // Box 11
		bodyModel[10].setRotationPoint(-15.5F, -19F, -10.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 22, 21, 0F); // Box 12
		bodyModel[11].setRotationPoint(-21.5F, -19F, -10.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 22, 21, 0F); // Box 13
		bodyModel[12].setRotationPoint(20.5F, -19F, -10.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 43, 2, 1, 0F); // Box 15
		bodyModel[13].setRotationPoint(-21.5F, 7F, -10.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 16
		bodyModel[14].setRotationPoint(-21.5F, 3F, -10.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 33, 4, 1, 0F); // Box 17
		bodyModel[15].setRotationPoint(-16.5F, 3F, -10.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 7, 6, 1, 0F); // Box 18
		bodyModel[16].setRotationPoint(-1.5F, 2F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 19
		bodyModel[17].setRotationPoint(19.5F, 3F, -10.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F,0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-22F, -20F, 6.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-22F, -21F, 2.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 44, 1, 5, 0F); // Box 24
		bodyModel[20].setRotationPoint(-22F, -22F, -2.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-22F, -21F, -6.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 43, 1, 1, 0F); // Box 27
		bodyModel[22].setRotationPoint(-21.5F, -20F, -10.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 44, 1, 4, 0F,0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 28
		bodyModel[23].setRotationPoint(-22F, -20F, -10.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 29
		bodyModel[24].setRotationPoint(-19.5F, 4F, -10.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 30
		bodyModel[25].setRotationPoint(16.5F, 4F, -10.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 43, 2, 1, 0F); // Box 31
		bodyModel[26].setRotationPoint(-21.5F, 7F, 9.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 31, 16, 1, 0F); // Box 32
		bodyModel[27].setRotationPoint(-15.5F, -19F, 9.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 41, 6, 1, 0F); // Box 33
		bodyModel[28].setRotationPoint(-20.5F, -3F, 9.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 33, 4, 1, 0F); // Box 34
		bodyModel[29].setRotationPoint(-16.5F, 3F, 9.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 35
		bodyModel[30].setRotationPoint(16.5F, 4F, 9.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 36
		bodyModel[31].setRotationPoint(19.5F, 3F, 9.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 37
		bodyModel[32].setRotationPoint(-19.5F, 4F, 9.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 38
		bodyModel[33].setRotationPoint(-21.5F, 3F, 9.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-21.5F, -20F, -9.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 2, 13, 0F); // Box 40
		bodyModel[35].setRotationPoint(-21.5F, -21F, -6.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 43, 1, 1, 0F); // Box 42
		bodyModel[36].setRotationPoint(-21.5F, -20F, 9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[37].setRotationPoint(-25.5F, 3F, -7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[38].setRotationPoint(-22.5F, 8F, -10.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[39].setRotationPoint(-25.5F, 3F, -5.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[40].setRotationPoint(-25.5F, 3F, -3.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[41].setRotationPoint(-25.5F, 3F, -1.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[42].setRotationPoint(-25.5F, 3F, 0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[43].setRotationPoint(-25.5F, 3F, 2.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[44].setRotationPoint(-25.5F, 3F, 4.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[45].setRotationPoint(-25.5F, 3F, 6.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -3F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 53
		bodyModel[46].setRotationPoint(-25.5F, 8F, 9.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[47].setRotationPoint(-25.5F, 8F, -6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[48].setRotationPoint(-25.5F, 8F, -4.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[49].setRotationPoint(-25.5F, 8F, -0.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[50].setRotationPoint(-25.5F, 8F, -2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[51].setRotationPoint(-25.5F, 8F, 3.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[52].setRotationPoint(-25.5F, 8F, 1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[53].setRotationPoint(-25.5F, 8F, 5.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 67
		bodyModel[54].setRotationPoint(-22.5F, 8F, 9.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F); // Box 69
		bodyModel[55].setRotationPoint(-25.5F, 8F, -10.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 13, 0F); // Box 72
		bodyModel[56].setRotationPoint(20.5F, -21F, -6.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 41, 1, 19, 0F); // Box 74
		bodyModel[57].setRotationPoint(-20.5F, -3F, -9.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 75
		bodyModel[58].setRotationPoint(-19.5F, 3F, 8.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 76
		bodyModel[59].setRotationPoint(-19.5F, 3F, -9.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 77
		bodyModel[60].setRotationPoint(16.5F, 3F, -9.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 78
		bodyModel[61].setRotationPoint(16.5F, 3F, 8.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 3, 14, 1, 0F); // Box 79
		bodyModel[62].setRotationPoint(-14.5F, -26F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[63].setRotationPoint(-13.5F, -26F, -1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[64].setRotationPoint(-13.5F, -26F, 0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[65].setRotationPoint(-0.5F, -24.5F, 4F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 83
		bodyModel[66].setRotationPoint(-0.5F, -23.5F, 4F);

		bodyModel[67].addBox(0F, 0F, 0F, 7, 6, 1, 0F); // Box 84
		bodyModel[67].setRotationPoint(-1.5F, 2F, 10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 85
		bodyModel[68].setRotationPoint(-0.5F, -24.75F, 3.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 86
		bodyModel[69].setRotationPoint(-0.5F, -24.75F, 2.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 87
		bodyModel[70].setRotationPoint(-0.5F, -24.75F, 5.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 88
		bodyModel[71].setRotationPoint(-21.5F, -23.75F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 89
		bodyModel[72].setRotationPoint(20.5F, -23.75F, 4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 90
		bodyModel[73].setRotationPoint(-20.75F, -23.75F, 4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, 0.6F, -0.4F, 0F, 0.6F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1.4F, -0.4F, 0F, -1.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 91
		bodyModel[74].setRotationPoint(-12.75F, -23.75F, 4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, 1.1F, -0.4F, 0F, 1.1F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1.9F, -0.4F, 0F, -1.9F, -0.4F, 0F, -0.4F, -0.4F); // Box 92
		bodyModel[75].setRotationPoint(-4.75F, -24.75F, 4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 1.1F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 1.1F, -0.4F, 0F, -1.9F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1.9F, -0.4F); // Box 95
		bodyModel[76].setRotationPoint(0.25F, -24.75F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0.6F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0.6F, -0.4F, 0F, -1.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -1.4F, -0.4F); // Box 96
		bodyModel[77].setRotationPoint(5.25F, -23.75F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 97
		bodyModel[78].setRotationPoint(13.25F, -23.75F, 4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 98
		bodyModel[79].setRotationPoint(-0.5F, -26.25F, 4F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 99
		bodyModel[80].setRotationPoint(11F, -22.5F, -8.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[81].setRotationPoint(11F, -23.5F, -8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 101
		bodyModel[82].setRotationPoint(11F, -23.5F, -7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[83].setRotationPoint(11F, -25.5F, -0.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 103
		bodyModel[84].setRotationPoint(11F, -24.5F, -0.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 9, 2, 0F); // Box 104
		bodyModel[85].setRotationPoint(9.5F, -23F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 105
		bodyModel[86].setRotationPoint(10.5F, -23F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[87].setRotationPoint(10.5F, -23F, 1F);

		bodyModel[88].addBox(0F, 0F, 0F, 5, 11, 5, 0F); // Box 123
		bodyModel[88].setRotationPoint(-15.5F, -14F, -2.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[89].setRotationPoint(-15.5F, -14F, -5.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[90].setRotationPoint(-15.5F, -14F, 2.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 5, 8, 3, 0F); // Box 128
		bodyModel[91].setRotationPoint(-15.5F, -11F, -5.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 5, 8, 3, 0F); // Box 129
		bodyModel[92].setRotationPoint(-15.5F, -11F, 2.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 19, 9, 3, 0F); // Box 102
		bodyModel[93].setRotationPoint(-10.5F, -13F, -1.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 19, 3, 3, 0F); // Box 103
		bodyModel[94].setRotationPoint(-10.5F, -10F, -4.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 19, 3, 3, 0F); // Box 104
		bodyModel[95].setRotationPoint(-10.5F, -10F, 1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 19, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[96].setRotationPoint(-10.5F, -13F, 1.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 19, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[97].setRotationPoint(-10.5F, -13F, -4.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 19, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[98].setRotationPoint(-10.5F, -7F, -4.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 19, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 108
		bodyModel[99].setRotationPoint(-10.5F, -7F, 1.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 122
		bodyModel[100].setRotationPoint(8.5F, -11F, 2.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[101].setRotationPoint(8.5F, -14F, 2.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 7, 11, 5, 0F); // Box 124
		bodyModel[102].setRotationPoint(8.5F, -14F, -2.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[103].setRotationPoint(8.5F, -14F, -5.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 126
		bodyModel[104].setRotationPoint(8.5F, -11F, -5.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 5, 2, 3, 0F); // Box 131
		bodyModel[105].setRotationPoint(-3.5F, -15F, -1.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 132
		bodyModel[106].setRotationPoint(-3.5F, -16F, -1.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[107].setRotationPoint(-3.5F, -16F, 0.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 134
		bodyModel[108].setRotationPoint(25F, 0F, -9F);

		bodyModel[109].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 135
		bodyModel[109].setRotationPoint(22.5F, 1.5F, -7.5F);
		bodyModel[109].rotateAngleX = 0.78539816F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[110].setRotationPoint(24.5F, 1F, -0.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[111].setRotationPoint(23.5F, 2F, -0.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[112].setRotationPoint(21.5F, 1F, -0.5F);

		bodyModel[113].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 139
		bodyModel[113].setRotationPoint(22.5F, 1.5F, 7.5F);
		bodyModel[113].rotateAngleX = 0.78539816F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 140
		bodyModel[114].setRotationPoint(25F, 0F, 6F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 146
		bodyModel[115].setRotationPoint(-16.5F, -14F, 3.5F);

		bodyModel[116].addBox(0F, 0F, 0F, 31, 1, 1, 0F); // Box 147
		bodyModel[116].setRotationPoint(-15.5F, -13F, 4.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 148
		bodyModel[117].setRotationPoint(15.5F, -14F, 3.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[118].setRotationPoint(21.5F, 8F, 9.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 2F, -0.6F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 151
		bodyModel[119].setRotationPoint(22.5F, 8F, 9.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[120].setRotationPoint(24.5F, 3F, 6.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[121].setRotationPoint(24.5F, 8F, 5.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[122].setRotationPoint(24.5F, 3F, 4.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[123].setRotationPoint(24.5F, 8F, 3.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[124].setRotationPoint(24.5F, 3F, 2.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[125].setRotationPoint(24.5F, 8F, 1.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[126].setRotationPoint(24.5F, 3F, 0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[127].setRotationPoint(24.5F, 8F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[128].setRotationPoint(24.5F, 3F, -1.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[129].setRotationPoint(24.5F, 8F, -2.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[130].setRotationPoint(24.5F, 3F, -3.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[131].setRotationPoint(24.5F, 8F, -4.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[132].setRotationPoint(24.5F, 8F, -6.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[133].setRotationPoint(24.5F, 3F, -5.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[134].setRotationPoint(24.5F, 3F, -7.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.6F, 0F, -3F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 2F, 0F, 0F, 0F); // Box 167
		bodyModel[135].setRotationPoint(22.5F, 8F, -10.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1.1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[136].setRotationPoint(23.5F, 3F, -9.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[137].setRotationPoint(21.5F, 8F, -10.5F);

		bodyModel[138].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[138].setRotationPoint(-10F, 6.5F, 6F);

		bodyModel[139].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[139].setRotationPoint(-10F, 6.5F, -6F);

		bodyModel[140].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 42
		bodyModel[140].setRotationPoint(-10F, 6.5F, -6F);

		bodyModel[141].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 173
		bodyModel[141].setRotationPoint(10F, 6.5F, 6F);

		bodyModel[142].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 174
		bodyModel[142].setRotationPoint(10F, 6.5F, -6F);

		bodyModel[143].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 175
		bodyModel[143].setRotationPoint(10F, 6.5F, -6F);

		bodyModel[144].addBox(-0.5F, -0.5F, 0F, 29, 10, 10, 0F); // Box 176
		bodyModel[144].setRotationPoint(-14F, -1.5F, -5F);

		bodyModel[145].addShapeBox(-0.5F, -0.5F, 0F, 6, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 177
		bodyModel[145].setRotationPoint(-20F, -1.5F, -5F);

		bodyModel[146].addShapeBox(-0.5F, -0.5F, 0F, 6, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[146].setRotationPoint(15F, -1.5F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -1.1F, 0F, 0F, 1F, 0F, 0F); // Box 153
		bodyModel[147].setRotationPoint(23.5F, 3F, 8.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1.1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 154
		bodyModel[148].setRotationPoint(-24.5F, 3F, -9.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.1F, 0F, 0F); // Box 155
		bodyModel[149].setRotationPoint(-24.5F, 3F, 8.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[150].setRotationPoint(-21.5F, -20F, 6.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[151].setRotationPoint(20.5F, -20F, 6.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[152].setRotationPoint(20.5F, -20F, -9.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[153].setRotationPoint(-14.5F, -12.5F, 3.5F);
		bodyModel[153].rotateAngleX = 0.78539816F;

		bodyModel[154].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[154].setRotationPoint(13.5F, -12.5F, 3.5F);
		bodyModel[154].rotateAngleX = 0.78539816F;
	}
}