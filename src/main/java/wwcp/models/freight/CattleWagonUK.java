//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.10.2021 - 13:28:28
// Last changed on: 01.10.2021 - 13:28:28

package wwcp.models.freight; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class CattleWagonUK extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public CattleWagonUK() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[176];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 38
		bodyModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 43
		bodyModel[37] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 44
		bodyModel[38] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 45
		bodyModel[39] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 5
		bodyModel[44] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 16
		bodyModel[45] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 17
		bodyModel[46] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 388
		bodyModel[47] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 391
		bodyModel[48] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 393
		bodyModel[49] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 394
		bodyModel[50] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 395
		bodyModel[51] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 396
		bodyModel[52] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 397
		bodyModel[53] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 398
		bodyModel[54] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 64
		bodyModel[55] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 65
		bodyModel[56] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 66
		bodyModel[57] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 67
		bodyModel[58] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 68
		bodyModel[59] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 69
		bodyModel[60] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 70
		bodyModel[61] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 71
		bodyModel[62] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 72
		bodyModel[63] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 73
		bodyModel[64] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 74
		bodyModel[65] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 75
		bodyModel[66] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 76
		bodyModel[67] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 77
		bodyModel[68] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 78
		bodyModel[69] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 79
		bodyModel[70] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 80
		bodyModel[71] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 81
		bodyModel[72] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 82
		bodyModel[73] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 83
		bodyModel[74] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 84
		bodyModel[75] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 85
		bodyModel[76] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 86
		bodyModel[77] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 87
		bodyModel[78] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 88
		bodyModel[79] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 89
		bodyModel[80] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 90
		bodyModel[81] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 91
		bodyModel[82] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 92
		bodyModel[83] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 93
		bodyModel[84] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 94
		bodyModel[85] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 95
		bodyModel[86] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 96
		bodyModel[87] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 97
		bodyModel[88] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 98
		bodyModel[89] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 99
		bodyModel[90] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 100
		bodyModel[91] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 101
		bodyModel[92] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 102
		bodyModel[93] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 103
		bodyModel[94] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 109
		bodyModel[95] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 110
		bodyModel[96] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 111
		bodyModel[97] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 112
		bodyModel[98] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 113
		bodyModel[99] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 114
		bodyModel[100] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 115
		bodyModel[101] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 116
		bodyModel[102] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 117
		bodyModel[103] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 118
		bodyModel[104] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 119
		bodyModel[105] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 120
		bodyModel[106] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 121
		bodyModel[107] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 122
		bodyModel[108] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 123
		bodyModel[109] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 124
		bodyModel[110] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 125
		bodyModel[111] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 126
		bodyModel[112] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 127
		bodyModel[113] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 129
		bodyModel[115] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 130
		bodyModel[116] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 131
		bodyModel[117] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 132
		bodyModel[118] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 133
		bodyModel[119] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 134
		bodyModel[120] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 135
		bodyModel[121] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 136
		bodyModel[122] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 137
		bodyModel[123] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 138
		bodyModel[124] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 139
		bodyModel[125] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 140
		bodyModel[126] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 141
		bodyModel[127] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 142
		bodyModel[128] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 143
		bodyModel[129] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 144
		bodyModel[130] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 145
		bodyModel[131] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 146
		bodyModel[132] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 147
		bodyModel[133] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 148
		bodyModel[134] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 149
		bodyModel[135] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 150
		bodyModel[136] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 151
		bodyModel[137] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 152
		bodyModel[138] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 153
		bodyModel[139] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 154
		bodyModel[140] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 155
		bodyModel[141] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 156
		bodyModel[142] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 157
		bodyModel[143] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 158
		bodyModel[144] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 14
		bodyModel[145] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 34
		bodyModel[146] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 47
		bodyModel[147] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 162
		bodyModel[148] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 163
		bodyModel[149] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 164
		bodyModel[150] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 167
		bodyModel[151] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 168
		bodyModel[152] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 169
		bodyModel[153] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 170
		bodyModel[154] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 171
		bodyModel[155] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 172
		bodyModel[156] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 173
		bodyModel[157] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 174
		bodyModel[158] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 175
		bodyModel[159] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 176
		bodyModel[160] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 178
		bodyModel[161] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 179
		bodyModel[162] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 180
		bodyModel[163] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 181
		bodyModel[164] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 182
		bodyModel[165] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 183
		bodyModel[166] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 184
		bodyModel[167] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 185
		bodyModel[168] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 186
		bodyModel[169] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 187
		bodyModel[170] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 188
		bodyModel[171] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 189
		bodyModel[172] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 190
		bodyModel[173] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 191
		bodyModel[174] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 192
		bodyModel[175] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 193

		bodyModel[0].addBox(0F, 0F, 0F, 39, 2, 18, 0F); // Box 0
		bodyModel[0].setRotationPoint(-19.5F, 0.5F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-19.5F, 0.5F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		bodyModel[2].setRotationPoint(-19.5F, 0.5F, 9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 4
		bodyModel[3].setRotationPoint(18.5F, 0.5F, 9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(18.5F, 0.5F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 6
		bodyModel[5].setRotationPoint(-19.5F, -15.5F, 9F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 7
		bodyModel[6].setRotationPoint(18.5F, -15.5F, 9F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 8
		bodyModel[7].setRotationPoint(-5.5F, -15.5F, 9F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 9
		bodyModel[8].setRotationPoint(4.5F, -15.5F, 9F);

		bodyModel[9].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 10
		bodyModel[9].setRotationPoint(-18.5F, -9.5F, 9F);

		bodyModel[10].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 11
		bodyModel[10].setRotationPoint(-18.5F, -0.5F, 9F);

		bodyModel[11].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 12
		bodyModel[11].setRotationPoint(5.5F, -0.5F, 9F);

		bodyModel[12].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 13
		bodyModel[12].setRotationPoint(5.5F, -9.5F, 9F);

		bodyModel[13].addShapeBox(0F, -0.5F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-18.5F, -8.5F, 8.98F);
		bodyModel[13].rotateAngleZ = -0.55850536F;

		bodyModel[14].addShapeBox(-16F, -0.5F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(18.5F, -8.5F, 8.99F);
		bodyModel[14].rotateAngleZ = 0.55850536F;

		bodyModel[15].addShapeBox(0F, -0.5F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(5.5F, -8.5F, 8.98F);
		bodyModel[15].rotateAngleZ = -0.55850536F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-13F, 2.5F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(-15F, 2.5F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-9F, 2.5F, 7F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 21
		bodyModel[19].setRotationPoint(-12.5F, 4.5F, 8F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 36
		bodyModel[20].setRotationPoint(-12F, 2.5F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
		bodyModel[21].setRotationPoint(-8F, 2.5F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 38
		bodyModel[22].setRotationPoint(-16F, 2.5F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[23].setRotationPoint(-15F, 2.5F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[24].setRotationPoint(-11F, 2.5F, 8F);

		bodyModel[25].addBox(-4F, 0F, -1F, 4, 8, 1, 0F); // Box 28
		bodyModel[25].setRotationPoint(4.5F, -7.5F, 10F);
		bodyModel[25].rotateAngleY = -2.0943951F;

		bodyModel[26].addBox(-4F, -8F, -1F, 4, 1, 1, 0F); // Box 31
		bodyModel[26].setRotationPoint(4.5F, -7.5F, 10F);
		bodyModel[26].rotateAngleY = -2.0943951F;

		bodyModel[27].addShapeBox(-5F, -8F, -1F, 1, 16, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(4.5F, -7.5F, 10F);
		bodyModel[27].rotateAngleY = -2.0943951F;

		bodyModel[28].addShapeBox(-1F, -7F, -1F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(4.5F, -7.5F, 10F);
		bodyModel[28].rotateAngleY = -2.0943951F;

		bodyModel[29].addBox(0F, 0F, -1F, 4, 8, 1, 0F); // Box 34
		bodyModel[29].setRotationPoint(-4.5F, -7.5F, 10F);
		bodyModel[29].rotateAngleY = 2.0943951F;

		bodyModel[30].addShapeBox(-0.5F, -7F, -1F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(-4.5F, -7.5F, 10F);
		bodyModel[30].rotateAngleY = 2.0943951F;

		bodyModel[31].addBox(0F, -8F, -1F, 4, 1, 1, 0F); // Box 36
		bodyModel[31].setRotationPoint(-4.5F, -7.5F, 10F);
		bodyModel[31].rotateAngleY = 2.0943951F;

		bodyModel[32].addShapeBox(3.5F, -8F, -1F, 1, 16, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-4.5F, -7.5F, 10F);
		bodyModel[32].rotateAngleY = 2.0943951F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 38
		bodyModel[33].setRotationPoint(-18.5F, -8.5F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 39
		bodyModel[34].setRotationPoint(5.5F, -8.5F, 9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 42
		bodyModel[35].setRotationPoint(-18.5F, -11.5F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 43
		bodyModel[36].setRotationPoint(-18.5F, -13.5F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 44
		bodyModel[37].setRotationPoint(5.5F, -13.5F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 45
		bodyModel[38].setRotationPoint(5.5F, -11.5F, 9F);

		bodyModel[39].addShapeBox(0.5F, 0F, -1F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 46
		bodyModel[39].setRotationPoint(-4.5F, -13.5F, 10F);
		bodyModel[39].rotateAngleY = 2.0943951F;

		bodyModel[40].addShapeBox(0.5F, 0F, -1F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 47
		bodyModel[40].setRotationPoint(-4.5F, -11.5F, 10F);
		bodyModel[40].rotateAngleY = 2.0943951F;

		bodyModel[41].addShapeBox(-4.5F, 0F, -1F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 48
		bodyModel[41].setRotationPoint(4.5F, -11.5F, 10F);
		bodyModel[41].rotateAngleY = -2.0943951F;

		bodyModel[42].addShapeBox(-4.5F, 0F, -1F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 49
		bodyModel[42].setRotationPoint(4.5F, -13.5F, 10F);
		bodyModel[42].rotateAngleY = -2.0943951F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[43].setRotationPoint(-23.5F, 0F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[44].setRotationPoint(-23.5F, 0F, 6F);

		bodyModel[45].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[45].setRotationPoint(-21.5F, 1.5F, 7.5F);
		bodyModel[45].rotateAngleX = 0.78539816F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		bodyModel[46].setRotationPoint(22F, 0F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391
		bodyModel[47].setRotationPoint(22F, 0F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[48].setRotationPoint(-21.5F, 2F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[49].setRotationPoint(-22.5F, 1F, -0.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[50].setRotationPoint(-19.5F, 1F, -0.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[51].setRotationPoint(18.5F, 1F, -0.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[52].setRotationPoint(20.5F, 2F, -0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[53].setRotationPoint(21.75F, 1F, -0.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 64
		bodyModel[54].setRotationPoint(18.5F, -15.5F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 65
		bodyModel[55].setRotationPoint(5.5F, -13.5F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 66
		bodyModel[56].setRotationPoint(5.5F, -11.5F, -10F);

		bodyModel[57].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 67
		bodyModel[57].setRotationPoint(5.5F, -9.5F, -10F);

		bodyModel[58].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 68
		bodyModel[58].setRotationPoint(5.5F, -0.5F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 69
		bodyModel[59].setRotationPoint(5.5F, -8.5F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 70
		bodyModel[60].setRotationPoint(4.5F, -15.5F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 71
		bodyModel[61].setRotationPoint(-18.5F, -8.5F, -10F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 72
		bodyModel[62].setRotationPoint(-5.5F, -15.5F, -10F);

		bodyModel[63].addBox(0F, 0F, 0F, 4, 8, 1, 0F); // Box 73
		bodyModel[63].setRotationPoint(-4.5F, -7.5F, -10F);

		bodyModel[64].addShapeBox(3.5F, -8F, 0F, 1, 16, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[64].setRotationPoint(-4.5F, -7.5F, -10F);

		bodyModel[65].addShapeBox(-5F, -8F, 0F, 1, 16, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bodyModel[65].setRotationPoint(4.5F, -7.5F, -10F);

		bodyModel[66].addBox(-4F, 0F, 0F, 4, 8, 1, 0F); // Box 76
		bodyModel[66].setRotationPoint(4.5F, -7.5F, -10F);

		bodyModel[67].addShapeBox(-4.5F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 77
		bodyModel[67].setRotationPoint(4.5F, -11.5F, -10F);

		bodyModel[68].addShapeBox(-4.5F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 78
		bodyModel[68].setRotationPoint(4.5F, -13.5F, -10F);

		bodyModel[69].addBox(-4F, -8F, 0F, 4, 1, 1, 0F); // Box 79
		bodyModel[69].setRotationPoint(4.5F, -7.5F, -10F);

		bodyModel[70].addBox(0F, -8F, 0F, 4, 1, 1, 0F); // Box 80
		bodyModel[70].setRotationPoint(-4.5F, -7.5F, -10F);

		bodyModel[71].addShapeBox(-0.5F, -7F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 81
		bodyModel[71].setRotationPoint(-4.5F, -7.5F, -10F);

		bodyModel[72].addShapeBox(0.5F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 82
		bodyModel[72].setRotationPoint(-4.5F, -13.5F, -10F);

		bodyModel[73].addShapeBox(0.5F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 83
		bodyModel[73].setRotationPoint(-4.5F, -11.5F, -10F);

		bodyModel[74].addShapeBox(-1F, -7F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[74].setRotationPoint(4.5F, -7.5F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 85
		bodyModel[75].setRotationPoint(-18.5F, -9.5F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 86
		bodyModel[76].setRotationPoint(-19.5F, -15.5F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 87
		bodyModel[77].setRotationPoint(-18.5F, -0.5F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 88
		bodyModel[78].setRotationPoint(-18.5F, -13.5F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 89
		bodyModel[79].setRotationPoint(-18.5F, -11.5F, -10F);

		bodyModel[80].addShapeBox(0F, -0.5F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[80].setRotationPoint(5.5F, -8.5F, -10.49F);
		bodyModel[80].rotateAngleZ = -0.55850536F;

		bodyModel[81].addShapeBox(-16F, -0.5F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[81].setRotationPoint(18.5F, -8.5F, -10.48F);
		bodyModel[81].rotateAngleZ = 0.55850536F;

		bodyModel[82].addShapeBox(0F, -0.5F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[82].setRotationPoint(-18.5F, -8.5F, -10.49F);
		bodyModel[82].rotateAngleZ = -0.55850536F;

		bodyModel[83].addShapeBox(-16F, -0.5F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[83].setRotationPoint(-5.5F, -8.5F, -10.48F);
		bodyModel[83].rotateAngleZ = 0.55850536F;

		bodyModel[84].addShapeBox(-16F, -0.5F, 0F, 16, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[84].setRotationPoint(-5.5F, -8.5F, 8.99F);
		bodyModel[84].rotateAngleZ = 0.55850536F;

		bodyModel[85].addBox(0F, 0F, 0F, 40, 1, 4, 0F); // Box 95
		bodyModel[85].setRotationPoint(-20F, -17.5F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 40, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 96
		bodyModel[86].setRotationPoint(-20F, -17.5F, 2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 40, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 97
		bodyModel[87].setRotationPoint(-20F, -17F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 40, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[88].setRotationPoint(-20F, -17.5F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 40, 1, 3, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[89].setRotationPoint(-20F, -17F, -10F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 100
		bodyModel[90].setRotationPoint(-19.5F, -16.5F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[91].setRotationPoint(-19.5F, -16.5F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[92].setRotationPoint(-19.5F, -16.5F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 16, 18, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 103
		bodyModel[93].setRotationPoint(-19.5F, -15.5F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[94].setRotationPoint(-19.5F, -15.5F, -0.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[95].setRotationPoint(-19.49F, -9F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[96].setRotationPoint(-19.49F, -9F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[97].setRotationPoint(-19.5F, -0.5F, -9F);

		bodyModel[98].addShapeBox(0F, -0.5F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[98].setRotationPoint(-19.48F, -0.5F, -9F);
		bodyModel[98].rotateAngleX = 0.75049158F;

		bodyModel[99].addShapeBox(0F, -0.5F, -12F, 1, 1, 12, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[99].setRotationPoint(-19.48F, -0.5F, 9F);
		bodyModel[99].rotateAngleX = -0.75049158F;

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 16, 18, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 115
		bodyModel[100].setRotationPoint(18.5F, -15.5F, -9F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 116
		bodyModel[101].setRotationPoint(18.5F, -16.5F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[102].setRotationPoint(18.5F, -16.5F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[103].setRotationPoint(18.5F, -16.5F, 8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 119
		bodyModel[104].setRotationPoint(18.5F, -15.5F, -0.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 120
		bodyModel[105].setRotationPoint(18.49F, -9F, 0F);

		bodyModel[106].addShapeBox(0F, -0.5F, -12F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[106].setRotationPoint(18.48F, -0.5F, 9F);
		bodyModel[106].rotateAngleX = -0.75049158F;

		bodyModel[107].addShapeBox(0F, -0.5F, 0F, 1, 1, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 122
		bodyModel[107].setRotationPoint(18.48F, -0.5F, -9F);
		bodyModel[107].rotateAngleX = 0.75049158F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 123
		bodyModel[108].setRotationPoint(18.49F, -9F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 124
		bodyModel[109].setRotationPoint(18.5F, -0.5F, -9F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 125
		bodyModel[110].setRotationPoint(10.5F, 4.5F, 8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, 0F, 0F); // Box 126
		bodyModel[111].setRotationPoint(8F, 2.5F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 127
		bodyModel[112].setRotationPoint(10F, 2.5F, 7F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 128
		bodyModel[113].setRotationPoint(11F, 2.5F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[114].setRotationPoint(8F, 2.5F, 8F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 130
		bodyModel[115].setRotationPoint(7F, 2.5F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 131
		bodyModel[116].setRotationPoint(12F, 2.5F, 8F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[117].setRotationPoint(15F, 2.5F, 8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F); // Box 133
		bodyModel[118].setRotationPoint(14F, 2.5F, 7F);

		bodyModel[119].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[119].setRotationPoint(-22.5F, 1.5F, 7.5F);
		bodyModel[119].rotateAngleX = 0.78539816F;

		bodyModel[120].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F); // Box 135
		bodyModel[120].setRotationPoint(-21.5F, 1.5F, -7.5F);
		bodyModel[120].rotateAngleX = 0.78539816F;

		bodyModel[121].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[121].setRotationPoint(-22.5F, 1.5F, -7.5F);
		bodyModel[121].rotateAngleX = 0.78539816F;

		bodyModel[122].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 137
		bodyModel[122].setRotationPoint(19.5F, 1.5F, 7.5F);
		bodyModel[122].rotateAngleX = 0.78539816F;

		bodyModel[123].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[123].setRotationPoint(21.5F, 1.5F, 7.5F);
		bodyModel[123].rotateAngleX = 0.78539816F;

		bodyModel[124].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 139
		bodyModel[124].setRotationPoint(19.5F, 1.5F, -7.5F);
		bodyModel[124].rotateAngleX = 0.78539816F;

		bodyModel[125].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[125].setRotationPoint(21.5F, 1.5F, -7.5F);
		bodyModel[125].rotateAngleX = 0.78539816F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[126].setRotationPoint(8F, 2.5F, -9F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 142
		bodyModel[127].setRotationPoint(7F, 2.5F, -9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, 0F, 0F); // Box 143
		bodyModel[128].setRotationPoint(8F, 2.5F, -8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 144
		bodyModel[129].setRotationPoint(10F, 2.5F, -8F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 145
		bodyModel[130].setRotationPoint(11F, 2.5F, -9F);

		bodyModel[131].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 146
		bodyModel[131].setRotationPoint(10.5F, 4.5F, -9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 147
		bodyModel[132].setRotationPoint(12F, 2.5F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F); // Box 148
		bodyModel[133].setRotationPoint(14F, 2.5F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[134].setRotationPoint(15F, 2.5F, -9F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 150
		bodyModel[135].setRotationPoint(-16F, 2.5F, -9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[136].setRotationPoint(-15F, 2.5F, -9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, 0F, 0F); // Box 152
		bodyModel[137].setRotationPoint(-15F, 2.5F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 153
		bodyModel[138].setRotationPoint(-13F, 2.5F, -8F);

		bodyModel[139].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 154
		bodyModel[139].setRotationPoint(-12.5F, 4.5F, -9F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 155
		bodyModel[140].setRotationPoint(-12F, 2.5F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 156
		bodyModel[141].setRotationPoint(-11F, 2.5F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F); // Box 157
		bodyModel[142].setRotationPoint(-9F, 2.5F, -8F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 158
		bodyModel[143].setRotationPoint(-8F, 2.5F, -9F);

		bodyModel[144].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 14
		bodyModel[144].setRotationPoint(-11.5F, 5.5F, 6F);

		bodyModel[145].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 34
		bodyModel[145].setRotationPoint(-11.5F, 5.5F, -6F);

		bodyModel[146].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 47
		bodyModel[146].setRotationPoint(-11.5F, 5.5F, -7F);

		bodyModel[147].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 162
		bodyModel[147].setRotationPoint(11.5F, 5.5F, -6F);

		bodyModel[148].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 163
		bodyModel[148].setRotationPoint(11.5F, 5.5F, -7F);

		bodyModel[149].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 164
		bodyModel[149].setRotationPoint(11.5F, 5.5F, 6F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -2F, 0.5F, 0F); // Box 167
		bodyModel[150].setRotationPoint(-2F, 2.5F, -9F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 168
		bodyModel[151].setRotationPoint(-0.5F, 5F, -10F);

		bodyModel[152].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 169
		bodyModel[152].setRotationPoint(15.5F, 0.5F, -11F);

		bodyModel[153].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 170
		bodyModel[153].setRotationPoint(15.5F, 5.5F, -10F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 171
		bodyModel[154].setRotationPoint(15.5F, 0.5F, -10F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 172
		bodyModel[155].setRotationPoint(15.5F, 3.5F, -9F);

		bodyModel[156].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 173
		bodyModel[156].setRotationPoint(13.5F, 1.5F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[157].setRotationPoint(0.5F, 5F, -10F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 175
		bodyModel[158].setRotationPoint(-7.5F, 4F, -7F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 176
		bodyModel[159].setRotationPoint(6.5F, 4F, -7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[160].setRotationPoint(-6.5F, 5F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 179
		bodyModel[161].setRotationPoint(-1.5F, 5F, -7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, -0.5F, 0F); // Box 180
		bodyModel[162].setRotationPoint(1F, 2.5F, -9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 1F, -0.5F, 0F); // Box 181
		bodyModel[163].setRotationPoint(1F, 2.5F, 8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -2F, 0.5F, 0F); // Box 182
		bodyModel[164].setRotationPoint(-2F, 2.5F, 8F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 183
		bodyModel[165].setRotationPoint(-0.5F, 5F, 6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F); // Box 184
		bodyModel[166].setRotationPoint(-13.5F, 5F, 9F);

		bodyModel[167].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 185
		bodyModel[167].setRotationPoint(-18.5F, 1.5F, 9F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 186
		bodyModel[168].setRotationPoint(-16.5F, 0.5F, 9F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 187
		bodyModel[169].setRotationPoint(-16.5F, 0.5F, 10F);

		bodyModel[170].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 188
		bodyModel[170].setRotationPoint(-16.5F, 3.5F, 8F);

		bodyModel[171].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 189
		bodyModel[171].setRotationPoint(-16.5F, 5.5F, 9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[172].setRotationPoint(-6.5F, 5F, 6F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 191
		bodyModel[173].setRotationPoint(-7.5F, 4F, 6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 192
		bodyModel[174].setRotationPoint(-1.5F, 5F, 6F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 193
		bodyModel[175].setRotationPoint(6.5F, 4F, 6F);
	}
}