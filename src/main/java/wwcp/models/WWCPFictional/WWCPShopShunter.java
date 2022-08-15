//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.06.2022 - 16:34:14
// Last changed on: 29.06.2022 - 16:34:14

package wwcp.models.WWCPFictional; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class WWCPShopShunter extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public WWCPShopShunter() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[181];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 12
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 105
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 106
		bodyModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 107
		bodyModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 108
		bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 109
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 29
		bodyModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 30
		bodyModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 34
		bodyModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 47
		bodyModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 41
		bodyModel[13] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 42
		bodyModel[14] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 43
		bodyModel[15] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 44
		bodyModel[16] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 45
		bodyModel[17] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 46
		bodyModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 47
		bodyModel[19] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 48
		bodyModel[20] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 49
		bodyModel[21] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 51
		bodyModel[22] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 52
		bodyModel[23] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 53
		bodyModel[24] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 54
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 55
		bodyModel[26] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 56
		bodyModel[27] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 57
		bodyModel[28] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 58
		bodyModel[29] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 59
		bodyModel[30] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 60
		bodyModel[31] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 61
		bodyModel[32] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 62
		bodyModel[33] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 64
		bodyModel[35] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 65
		bodyModel[36] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 66
		bodyModel[37] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 67
		bodyModel[38] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 68
		bodyModel[39] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 69
		bodyModel[40] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 70
		bodyModel[41] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 71
		bodyModel[42] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 72
		bodyModel[43] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 73
		bodyModel[44] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 74
		bodyModel[45] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 75
		bodyModel[46] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 85
		bodyModel[47] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 102
		bodyModel[48] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 109
		bodyModel[49] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 110
		bodyModel[50] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 111
		bodyModel[51] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 112
		bodyModel[52] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 113
		bodyModel[53] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 114
		bodyModel[54] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 115
		bodyModel[55] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 175
		bodyModel[56] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 176
		bodyModel[57] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 177
		bodyModel[58] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 178
		bodyModel[59] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 180
		bodyModel[60] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 181
		bodyModel[61] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 182
		bodyModel[62] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 104
		bodyModel[63] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 105
		bodyModel[64] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 106
		bodyModel[65] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 107
		bodyModel[66] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 108
		bodyModel[67] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 109
		bodyModel[68] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 112
		bodyModel[69] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 113
		bodyModel[70] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 114
		bodyModel[71] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 115
		bodyModel[72] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 116
		bodyModel[73] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 117
		bodyModel[74] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 118
		bodyModel[75] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 119
		bodyModel[76] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 120
		bodyModel[77] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 121
		bodyModel[78] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 122
		bodyModel[79] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 123
		bodyModel[80] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 124
		bodyModel[81] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 125
		bodyModel[82] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 126
		bodyModel[83] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 127
		bodyModel[84] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 128
		bodyModel[85] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 129
		bodyModel[86] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 130
		bodyModel[87] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 131
		bodyModel[88] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 132
		bodyModel[89] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 133
		bodyModel[90] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 134
		bodyModel[91] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 135
		bodyModel[92] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 136
		bodyModel[93] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 137
		bodyModel[94] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 138
		bodyModel[95] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 139
		bodyModel[96] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 140
		bodyModel[97] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 141
		bodyModel[98] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 142
		bodyModel[99] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 143
		bodyModel[100] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 144
		bodyModel[101] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 145
		bodyModel[102] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 146
		bodyModel[103] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 147
		bodyModel[104] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 148
		bodyModel[105] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 149
		bodyModel[106] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 150
		bodyModel[107] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 151
		bodyModel[108] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 277
		bodyModel[109] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 279
		bodyModel[110] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 280
		bodyModel[111] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 281
		bodyModel[112] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 284
		bodyModel[113] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 285
		bodyModel[114] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 286
		bodyModel[115] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 159
		bodyModel[116] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 160
		bodyModel[117] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 161
		bodyModel[118] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 162
		bodyModel[119] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 163
		bodyModel[120] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 164
		bodyModel[121] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 165
		bodyModel[122] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 166
		bodyModel[123] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 167
		bodyModel[124] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 168
		bodyModel[125] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 169
		bodyModel[126] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 170
		bodyModel[127] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 171
		bodyModel[128] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 172
		bodyModel[129] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 108
		bodyModel[130] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 109
		bodyModel[131] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 110
		bodyModel[132] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 111
		bodyModel[133] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 112
		bodyModel[134] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 116
		bodyModel[135] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 117
		bodyModel[136] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 180
		bodyModel[137] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 181
		bodyModel[138] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 182
		bodyModel[139] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 183
		bodyModel[140] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 184
		bodyModel[141] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 185
		bodyModel[142] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 186
		bodyModel[143] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 187
		bodyModel[144] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 188
		bodyModel[145] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 189
		bodyModel[146] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 190
		bodyModel[147] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 191
		bodyModel[148] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 192
		bodyModel[149] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 193
		bodyModel[150] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 17
		bodyModel[151] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 21
		bodyModel[152] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 393
		bodyModel[153] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 394
		bodyModel[154] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 395
		bodyModel[155] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 104
		bodyModel[156] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 203
		bodyModel[157] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 204
		bodyModel[158] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 263
		bodyModel[159] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 264
		bodyModel[160] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 265
		bodyModel[161] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 266
		bodyModel[162] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 267
		bodyModel[163] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 119
		bodyModel[164] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 120
		bodyModel[165] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 121
		bodyModel[166] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 122
		bodyModel[167] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 123
		bodyModel[168] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 154
		bodyModel[169] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 155
		bodyModel[170] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 157
		bodyModel[171] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 158
		bodyModel[172] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 159
		bodyModel[173] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 160
		bodyModel[174] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 162
		bodyModel[175] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 163
		bodyModel[176] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 164
		bodyModel[177] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 165
		bodyModel[178] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 229
		bodyModel[179] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 230
		bodyModel[180] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 231

		bodyModel[0].addBox(0F, 0F, 0F, 48, 1, 22, 0F); // Box 11
		bodyModel[0].setRotationPoint(-16F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 8, 22, 0F); // Box 12
		bodyModel[1].setRotationPoint(-16F, 1F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[2].setRotationPoint(-18F, 2F, -0.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[3].setRotationPoint(-19F, 1F, -0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[4].setRotationPoint(-19.5F, -0.5F, 5.5F);

		bodyModel[5].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 108
		bodyModel[5].setRotationPoint(-19F, 1.5F, 7.5F);
		bodyModel[5].rotateAngleX = 0.78539816F;

		bodyModel[6].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 109
		bodyModel[6].setRotationPoint(-19F, 1.5F, -7.5F);
		bodyModel[6].rotateAngleX = 0.78539816F;

		bodyModel[7].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Box 29
		bodyModel[7].setRotationPoint(25F, -2F, -5F);

		bodyModel[8].addBox(0F, 0F, 0F, 6, 1, 10, 0F); // Box 30
		bodyModel[8].setRotationPoint(30F, -1F, -5F);
		bodyModel[8].rotateAngleZ = 1.57079633F;

		bodyModel[9].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 14
		bodyModel[9].setRotationPoint(-2F, 6F, 6F);

		bodyModel[10].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 34
		bodyModel[10].setRotationPoint(-2F, 6F, -6F);

		bodyModel[11].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 47
		bodyModel[11].setRotationPoint(-2F, 6F, -8F);

		bodyModel[12].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 41
		bodyModel[12].setRotationPoint(8F, 6F, 6F);

		bodyModel[13].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 42
		bodyModel[13].setRotationPoint(8F, 6F, -8F);

		bodyModel[14].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 43
		bodyModel[14].setRotationPoint(8F, 6F, -6F);

		bodyModel[15].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 44
		bodyModel[15].setRotationPoint(18F, 6F, 6F);

		bodyModel[16].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 45
		bodyModel[16].setRotationPoint(18F, 6F, -8F);

		bodyModel[17].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 46
		bodyModel[17].setRotationPoint(18F, 6F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[18].setRotationPoint(-19.5F, -0.5F, -9.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 46, 8, 1, 0F); // Box 48
		bodyModel[19].setRotationPoint(-15F, 1F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 8, 22, 0F); // Box 49
		bodyModel[20].setRotationPoint(31F, 1F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[21].setRotationPoint(16F, -14F, 9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 52
		bodyModel[22].setRotationPoint(16F, -14F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 53
		bodyModel[23].setRotationPoint(16F, -15F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 16, 1, 10, 0F); // Box 54
		bodyModel[24].setRotationPoint(16F, -16F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[25].setRotationPoint(16F, -15F, 5F);

		bodyModel[26].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 56
		bodyModel[26].setRotationPoint(16F, -13F, -11F);

		bodyModel[27].addBox(-5F, 0F, 0F, 5, 13, 1, 0F); // Box 57
		bodyModel[27].setRotationPoint(31F, -13F, -11F);

		bodyModel[28].addBox(-5F, 0F, -1F, 5, 13, 1, 0F); // Box 58
		bodyModel[28].setRotationPoint(31F, -13F, 11F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 13, 22, 0F); // Box 59
		bodyModel[29].setRotationPoint(31F, -13F, -11F);

		bodyModel[30].addBox(0F, 0F, 0F, 10, 13, 1, 0F); // Box 60
		bodyModel[30].setRotationPoint(16F, -13F, 10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[31].setRotationPoint(17F, -14F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[32].setRotationPoint(17F, -14F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[33].setRotationPoint(16F, -14F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[34].setRotationPoint(16F, -14F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[35].setRotationPoint(16F, -15F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[36].setRotationPoint(16F, -15F, 5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 67
		bodyModel[37].setRotationPoint(16F, -15F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 68
		bodyModel[38].setRotationPoint(16F, -14F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 13, 20, 0F); // Box 69
		bodyModel[39].setRotationPoint(16F, -13F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 70
		bodyModel[40].setRotationPoint(31F, -14F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[41].setRotationPoint(31F, -14F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[42].setRotationPoint(31F, -15F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 10, 0F); // Box 73
		bodyModel[43].setRotationPoint(31F, -15F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[44].setRotationPoint(31F, -15F, 5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[45].setRotationPoint(31F, -14F, 9F);

		bodyModel[46].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 85
		bodyModel[46].setRotationPoint(-3.5F, 3F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[47].setRotationPoint(-3.5F, 2.5F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[48].setRotationPoint(-4.5F, 3.5F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 110
		bodyModel[49].setRotationPoint(-4.5F, 3F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 111
		bodyModel[50].setRotationPoint(-4.5F, 4.25F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 112
		bodyModel[51].setRotationPoint(-4.5F, 5.5F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 113
		bodyModel[52].setRotationPoint(-0.5F, 4.25F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 114
		bodyModel[53].setRotationPoint(-0.5F, 5.5F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 115
		bodyModel[54].setRotationPoint(-0.5F, 3F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 175
		bodyModel[55].setRotationPoint(-3.5F, 3F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 176
		bodyModel[56].setRotationPoint(-0.5F, 3F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 177
		bodyModel[57].setRotationPoint(-0.5F, 4.25F, 10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 178
		bodyModel[58].setRotationPoint(-0.5F, 5.5F, 10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 180
		bodyModel[59].setRotationPoint(-4.5F, 3F, 10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 181
		bodyModel[60].setRotationPoint(-4.5F, 4.25F, 10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 182
		bodyModel[61].setRotationPoint(-4.5F, 5.5F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 104
		bodyModel[62].setRotationPoint(-0.5F, 3.5F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[63].setRotationPoint(-3.5F, 2.5F, 8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[64].setRotationPoint(-4.5F, 3.5F, 8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 107
		bodyModel[65].setRotationPoint(-0.5F, 3.5F, 8.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 46, 8, 1, 0F); // Box 108
		bodyModel[66].setRotationPoint(-15F, 1F, 8F);

		bodyModel[67].addBox(0F, 0F, 0F, 32, 8, 14, 0F); // Box 109
		bodyModel[67].setRotationPoint(-16F, -8F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 112
		bodyModel[68].setRotationPoint(6.5F, 3F, 9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[69].setRotationPoint(6.5F, 2.5F, 8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[70].setRotationPoint(5.5F, 3.5F, 8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 115
		bodyModel[71].setRotationPoint(5.5F, 3F, 10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 116
		bodyModel[72].setRotationPoint(5.5F, 4.25F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 117
		bodyModel[73].setRotationPoint(5.5F, 5.5F, 10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 118
		bodyModel[74].setRotationPoint(9.5F, 3.5F, 8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 119
		bodyModel[75].setRotationPoint(9.5F, 3F, 10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 120
		bodyModel[76].setRotationPoint(9.5F, 4.25F, 10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 121
		bodyModel[77].setRotationPoint(9.5F, 5.5F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[78].setRotationPoint(6.5F, 2.5F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[79].setRotationPoint(5.5F, 3.5F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 124
		bodyModel[80].setRotationPoint(9.5F, 3.5F, -10F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 125
		bodyModel[81].setRotationPoint(6.5F, 3F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 126
		bodyModel[82].setRotationPoint(5.5F, 3F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 127
		bodyModel[83].setRotationPoint(5.5F, 4.25F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 128
		bodyModel[84].setRotationPoint(5.5F, 5.5F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 129
		bodyModel[85].setRotationPoint(9.5F, 3F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 130
		bodyModel[86].setRotationPoint(9.5F, 4.25F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 131
		bodyModel[87].setRotationPoint(9.5F, 5.5F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 132
		bodyModel[88].setRotationPoint(16.5F, 3F, 9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[89].setRotationPoint(16.5F, 2.5F, 8.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[90].setRotationPoint(15.5F, 3.5F, 8.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 135
		bodyModel[91].setRotationPoint(15.5F, 3F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 136
		bodyModel[92].setRotationPoint(15.5F, 4.25F, 10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 137
		bodyModel[93].setRotationPoint(15.5F, 5.5F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 138
		bodyModel[94].setRotationPoint(19.5F, 3.5F, 8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 139
		bodyModel[95].setRotationPoint(19.5F, 3F, 10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 140
		bodyModel[96].setRotationPoint(19.5F, 4.25F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 141
		bodyModel[97].setRotationPoint(19.5F, 5.5F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[98].setRotationPoint(16.5F, 2.5F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[99].setRotationPoint(15.5F, 3.5F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 144
		bodyModel[100].setRotationPoint(19.5F, 3.5F, -10F);

		bodyModel[101].addBox(0F, 0F, 0F, 3, 4, 2, 0F); // Box 145
		bodyModel[101].setRotationPoint(16.5F, 3F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 146
		bodyModel[102].setRotationPoint(15.5F, 3F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 147
		bodyModel[103].setRotationPoint(15.5F, 4.25F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 148
		bodyModel[104].setRotationPoint(15.5F, 5.5F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 149
		bodyModel[105].setRotationPoint(19.5F, 3F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 150
		bodyModel[106].setRotationPoint(19.5F, 4.25F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 151
		bodyModel[107].setRotationPoint(19.5F, 5.5F, -11F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[108].setRotationPoint(-6.5F, 3F, 9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 279
		bodyModel[109].setRotationPoint(-6.5F, 0.5F, 9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 280
		bodyModel[110].setRotationPoint(-6.5F, 1F, 9F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 281
		bodyModel[111].setRotationPoint(-2.5F, 1F, 9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 284
		bodyModel[112].setRotationPoint(-1.5F, 1F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 285
		bodyModel[113].setRotationPoint(1.5F, 0.5F, 9F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 286
		bodyModel[114].setRotationPoint(1.5F, 3F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 159
		bodyModel[115].setRotationPoint(3.5F, 1F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 160
		bodyModel[116].setRotationPoint(3.5F, 0.5F, 9F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 161
		bodyModel[117].setRotationPoint(3.5F, 3F, 9F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 162
		bodyModel[118].setRotationPoint(7.5F, 1F, 9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 163
		bodyModel[119].setRotationPoint(8.5F, 1F, 9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 164
		bodyModel[120].setRotationPoint(11.5F, 0.5F, 9F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 165
		bodyModel[121].setRotationPoint(11.5F, 3F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 166
		bodyModel[122].setRotationPoint(13.5F, 1F, 9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 167
		bodyModel[123].setRotationPoint(13.5F, 0.5F, 9F);

		bodyModel[124].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 168
		bodyModel[124].setRotationPoint(13.5F, 3F, 9F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 169
		bodyModel[125].setRotationPoint(17.5F, 1F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 170
		bodyModel[126].setRotationPoint(18.5F, 1F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 171
		bodyModel[127].setRotationPoint(21.5F, 0.5F, 9F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 172
		bodyModel[128].setRotationPoint(21.5F, 3F, 9F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 108
		bodyModel[129].setRotationPoint(-6.5F, 3F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 109
		bodyModel[130].setRotationPoint(-6.5F, 0.5F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 110
		bodyModel[131].setRotationPoint(-6.5F, 1F, -10F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 111
		bodyModel[132].setRotationPoint(-2.5F, 1F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 112
		bodyModel[133].setRotationPoint(-1.5F, 1F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 116
		bodyModel[134].setRotationPoint(1.5F, 0.5F, -10F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 117
		bodyModel[135].setRotationPoint(1.5F, 3F, -10F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 180
		bodyModel[136].setRotationPoint(3.5F, 3F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 181
		bodyModel[137].setRotationPoint(3.5F, 0.5F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 182
		bodyModel[138].setRotationPoint(3.5F, 1F, -10F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 183
		bodyModel[139].setRotationPoint(7.5F, 1F, -10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 184
		bodyModel[140].setRotationPoint(8.5F, 1F, -10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 185
		bodyModel[141].setRotationPoint(11.5F, 0.5F, -10F);

		bodyModel[142].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 186
		bodyModel[142].setRotationPoint(11.5F, 3F, -10F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 187
		bodyModel[143].setRotationPoint(13.5F, 3F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		bodyModel[144].setRotationPoint(13.5F, 0.5F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 189
		bodyModel[145].setRotationPoint(13.5F, 1F, -10F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 190
		bodyModel[146].setRotationPoint(17.5F, 1F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 191
		bodyModel[147].setRotationPoint(18.5F, 1F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 192
		bodyModel[148].setRotationPoint(21.5F, 0.5F, -10F);

		bodyModel[149].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 193
		bodyModel[149].setRotationPoint(21.5F, 3F, -10F);

		bodyModel[150].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[150].setRotationPoint(32F, 1.5F, 7.5F);
		bodyModel[150].rotateAngleX = 0.78539816F;

		bodyModel[151].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[151].setRotationPoint(32F, 1.5F, -7.5F);
		bodyModel[151].rotateAngleX = 0.78539816F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[152].setRotationPoint(33F, 2F, -0.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[153].setRotationPoint(34F, 1F, -0.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F); // Box 395
		bodyModel[154].setRotationPoint(30F, 1F, -0.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F); // Box 104
		bodyModel[155].setRotationPoint(-16F, 1F, -0.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[156].setRotationPoint(35F, -0.5F, 5.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[157].setRotationPoint(35F, -0.5F, -9.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[158].setRotationPoint(35F, 2.5F, -1.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 264
		bodyModel[159].setRotationPoint(32F, 3F, -0.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 265
		bodyModel[160].setRotationPoint(35F, 2.5F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 266
		bodyModel[161].setRotationPoint(35F, 2.5F, 0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[162].setRotationPoint(37F, 2.5F, -0.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[163].setRotationPoint(-22F, 2.5F, -0.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 120
		bodyModel[164].setRotationPoint(-22F, 2.5F, 0.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 121
		bodyModel[165].setRotationPoint(-19F, 3F, -0.5F);

		bodyModel[166].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 122
		bodyModel[166].setRotationPoint(-20F, 2.5F, -0.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 123
		bodyModel[167].setRotationPoint(-21F, 2.5F, -1.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 5, 8, 13, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[168].setRotationPoint(17F, -8F, -10F);

		bodyModel[169].addShapeBox(-0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 155
		bodyModel[169].setRotationPoint(19.5F, -7F, -8.5F);
		bodyModel[169].rotateAngleZ = -0.4712389F;

		bodyModel[170].addBox(-0.5F, -3F, -0.5F, 1, 1, 1, 0F); // Box 157
		bodyModel[170].setRotationPoint(19.5F, -7F, -8.5F);
		bodyModel[170].rotateAngleZ = -0.4712389F;

		bodyModel[171].addBox(-0.5F, -3F, -0.5F, 1, 1, 1, 0F); // Box 158
		bodyModel[171].setRotationPoint(19.5F, -7F, -6.5F);
		bodyModel[171].rotateAngleZ = 0.19198622F;

		bodyModel[172].addShapeBox(-0.5F, -2F, -0.5F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 159
		bodyModel[172].setRotationPoint(19.5F, -7F, -6.5F);
		bodyModel[172].rotateAngleZ = 0.19198622F;

		bodyModel[173].addShapeBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 160
		bodyModel[173].setRotationPoint(19.5F, -7.5F, -3.5F);
		bodyModel[173].rotateAngleZ = -0.19198622F;

		bodyModel[174].addBox(-0.5F, -2.5F, 1.5F, 1, 1, 1, 0F); // Box 162
		bodyModel[174].setRotationPoint(19.5F, -7F, -5.5F);
		bodyModel[174].rotateAngleZ = -0.19198622F;

		bodyModel[175].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 163
		bodyModel[175].setRotationPoint(17F, -7F, 6F);

		bodyModel[176].addBox(0F, -1.5F, -1.5F, 0, 5, 5, 0F); // Box 164
		bodyModel[176].setRotationPoint(18.2F, -7.5F, 5.5F);

		bodyModel[177].addBox(1F, -0.5F, -1.5F, 1, 1, 1, 0F); // Box 165
		bodyModel[177].setRotationPoint(17F, -6.5F, 5.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[178].setRotationPoint(17F, -10F, -2.02F);

		bodyModel[179].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Box 230
		bodyModel[179].setRotationPoint(26F, -1F, -4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 128, 32, 14, 0F,0F, 0F, 0.1F, -96F, 0F, 0.1F, -96F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -24F, 0.1F, -96F, -24F, 0.1F, -96F, -24F, 0.1F, 0F, -24F, 0.1F); // Box 231
		bodyModel[180].setRotationPoint(-16F, -8F, -7F);
	}
}