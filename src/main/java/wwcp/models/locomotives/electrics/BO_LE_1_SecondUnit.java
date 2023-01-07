//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.10.2022 - 19:51:59
// Last changed on: 21.10.2022 - 19:51:59

package wwcp.models.locomotives.electrics; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BO_LE_1_SecondUnit extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public BO_LE_1_SecondUnit() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[178];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 30
		bodyModel[22] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 11
		bodyModel[25] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 44
		bodyModel[27] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 45
		bodyModel[31] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 46
		bodyModel[32] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 47
		bodyModel[33] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 51
		bodyModel[36] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 53
		bodyModel[38] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 59
		bodyModel[43] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 60
		bodyModel[44] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 61
		bodyModel[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 62
		bodyModel[46] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 63
		bodyModel[47] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 64
		bodyModel[48] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 65
		bodyModel[49] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 66
		bodyModel[50] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 67
		bodyModel[51] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 68
		bodyModel[52] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 69
		bodyModel[53] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 70
		bodyModel[54] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 71
		bodyModel[55] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 72
		bodyModel[56] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 73
		bodyModel[57] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 74
		bodyModel[58] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 75
		bodyModel[59] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 277
		bodyModel[60] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 278
		bodyModel[61] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 279
		bodyModel[62] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 280
		bodyModel[63] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 281
		bodyModel[64] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 282
		bodyModel[65] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 283
		bodyModel[66] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 284
		bodyModel[67] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 285
		bodyModel[68] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 85
		bodyModel[69] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 86
		bodyModel[70] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 88
		bodyModel[72] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 89
		bodyModel[73] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 90
		bodyModel[74] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 91
		bodyModel[75] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 92
		bodyModel[76] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 93
		bodyModel[77] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 94
		bodyModel[78] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 95
		bodyModel[79] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 96
		bodyModel[80] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 97
		bodyModel[81] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 98
		bodyModel[82] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 119
		bodyModel[83] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 120
		bodyModel[84] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 121
		bodyModel[85] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 122
		bodyModel[86] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 123
		bodyModel[87] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 104
		bodyModel[88] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 105
		bodyModel[89] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 107
		bodyModel[91] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 285
		bodyModel[92] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 142
		bodyModel[93] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 143
		bodyModel[94] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 144
		bodyModel[95] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 145
		bodyModel[96] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 146
		bodyModel[97] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 147
		bodyModel[98] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 148
		bodyModel[99] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 149
		bodyModel[100] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 150
		bodyModel[101] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 151
		bodyModel[102] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 152
		bodyModel[103] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 153
		bodyModel[104] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 154
		bodyModel[105] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 155
		bodyModel[106] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 156
		bodyModel[107] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 157
		bodyModel[108] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 158
		bodyModel[109] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 160
		bodyModel[110] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 161
		bodyModel[111] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 162
		bodyModel[112] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 163
		bodyModel[113] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 164
		bodyModel[114] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 165
		bodyModel[115] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 166
		bodyModel[116] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 167
		bodyModel[117] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 168
		bodyModel[118] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 169
		bodyModel[119] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 170
		bodyModel[120] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 171
		bodyModel[121] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 172
		bodyModel[122] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 173
		bodyModel[123] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 174
		bodyModel[124] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 175
		bodyModel[125] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 176
		bodyModel[126] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 177
		bodyModel[127] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 178
		bodyModel[128] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 179
		bodyModel[129] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 180
		bodyModel[130] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 181
		bodyModel[131] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 182
		bodyModel[132] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 183
		bodyModel[133] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 184
		bodyModel[134] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 185
		bodyModel[135] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 186
		bodyModel[136] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 187
		bodyModel[137] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 188
		bodyModel[138] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 189
		bodyModel[139] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 190
		bodyModel[140] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 191
		bodyModel[141] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 192
		bodyModel[142] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 193
		bodyModel[143] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 194
		bodyModel[144] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 195
		bodyModel[145] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 196
		bodyModel[146] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 197
		bodyModel[147] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 198
		bodyModel[148] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 199
		bodyModel[149] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 200
		bodyModel[150] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 201
		bodyModel[151] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 202
		bodyModel[152] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 203
		bodyModel[153] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 204
		bodyModel[154] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 205
		bodyModel[155] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 206
		bodyModel[156] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 207
		bodyModel[157] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 208
		bodyModel[158] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 209
		bodyModel[159] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 210
		bodyModel[160] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 211
		bodyModel[161] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 212
		bodyModel[162] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 214
		bodyModel[163] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 226
		bodyModel[164] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 227
		bodyModel[165] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 233
		bodyModel[166] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 234
		bodyModel[167] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 235
		bodyModel[168] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 236
		bodyModel[169] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 237
		bodyModel[170] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 238
		bodyModel[171] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 239
		bodyModel[172] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 228
		bodyModel[173] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 229
		bodyModel[174] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 230
		bodyModel[175] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 231
		bodyModel[176] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 230
		bodyModel[177] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 178

		bodyModel[0].addBox(0F, 0F, 0F, 1, 5, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-15F, 0F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 5, 18, 0F); // Box 1
		bodyModel[1].setRotationPoint(-16F, 0F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-16F, 0F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(-16F, 0F, 9F);

		bodyModel[4].addBox(0F, 0F, 0F, 28, 3, 19, 0F); // Box 4
		bodyModel[4].setRotationPoint(-14F, -1F, -9.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 32, 3, 19, 0F); // Box 5
		bodyModel[5].setRotationPoint(-16F, -4F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-15F, -1F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(14F, -1F, -9.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 15, 3, 19, 0F); // Box 8
		bodyModel[8].setRotationPoint(-16F, -7F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,-2F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-16F, -9F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-15F, -8F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 1, 19, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-14F, -9F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 13, 1, 19, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-14F, -8F, -9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 4, 19, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-14F, -11F, -9.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 15, 16, 1, 0F); // Box 15
		bodyModel[14].setRotationPoint(-1F, -20F, -9.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 15, 16, 1, 0F); // Box 16
		bodyModel[15].setRotationPoint(-1F, -20F, 8.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 15, 17, 0F); // Box 17
		bodyModel[16].setRotationPoint(-1F, -19F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-2F, -20F, -10.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 19, 1, 9, 0F); // Box 20
		bodyModel[18].setRotationPoint(-3F, -21F, -4.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 17, 1, 6, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-2F, -20F, 4.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.166F, 0F, 0F, 0.166F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.166F, 0F, 0F, -0.166F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-3F, -20F, 9.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[21].setRotationPoint(-1F, -20F, -9.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[22].setRotationPoint(-1F, -20F, 4.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 9, 0F); // Box 32
		bodyModel[23].setRotationPoint(-1F, -20F, -4.5F);

		bodyModel[24].addBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F); // Box 11
		bodyModel[24].setRotationPoint(-7.5F, 4.5F, 6F);

		bodyModel[25].addBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F); // Box 37
		bodyModel[25].setRotationPoint(-7.5F, 4.5F, -6F);

		bodyModel[26].addBox(-0.5F, -0.5F, 0F, 1, 1, 18, 0F); // Box 44
		bodyModel[26].setRotationPoint(-7.5F, 4.5F, -9F);

		bodyModel[27].addBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F); // Box 41
		bodyModel[27].setRotationPoint(7.5F, 4.5F, 6F);

		bodyModel[28].addBox(-0.5F, -0.5F, 0F, 1, 1, 18, 0F); // Box 42
		bodyModel[28].setRotationPoint(7.5F, 4.5F, -9F);

		bodyModel[29].addBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F); // Box 43
		bodyModel[29].setRotationPoint(7.5F, 4.5F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[30].setRotationPoint(-8.5F, 2.5F, -10.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[31].setRotationPoint(-8.5F, 4.5F, -10.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 47
		bodyModel[32].setRotationPoint(-9F, 2F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[33].setRotationPoint(6.5F, 4.5F, -10.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[34].setRotationPoint(6.5F, 2.5F, -10.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 51
		bodyModel[35].setRotationPoint(6F, 2F, -9.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 52
		bodyModel[36].setRotationPoint(-10F, 2F, -9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[37].setRotationPoint(-6F, 2F, -9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 54
		bodyModel[38].setRotationPoint(5F, 2F, -9.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[39].setRotationPoint(9F, 2F, -9.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 56
		bodyModel[40].setRotationPoint(-5F, 4F, -9.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 57
		bodyModel[41].setRotationPoint(-6F, 4F, -9.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 59
		bodyModel[42].setRotationPoint(-4F, 2F, -9.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 60
		bodyModel[43].setRotationPoint(2F, 2F, -9.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[44].setRotationPoint(5F, 4F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F); // Box 62
		bodyModel[45].setRotationPoint(-14F, 4F, -9.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, 0F); // Box 63
		bodyModel[46].setRotationPoint(9F, 4F, -9.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 5, 20, 0F); // Box 64
		bodyModel[47].setRotationPoint(14F, 0F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[48].setRotationPoint(15F, 0F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 5, 18, 0F); // Box 66
		bodyModel[49].setRotationPoint(15F, 0F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 67
		bodyModel[50].setRotationPoint(15F, 0F, 9F);

		bodyModel[51].addBox(0F, 0F, 0F, 3, 5, 4, 0F); // Box 68
		bodyModel[51].setRotationPoint(-14.5F, -16F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 69
		bodyModel[52].setRotationPoint(-14.5F, -17F, -0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 70
		bodyModel[53].setRotationPoint(-13.5F, -18.5F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[54].setRotationPoint(-13.5F, -17F, -2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 72
		bodyModel[55].setRotationPoint(-14.5F, -17F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, -1F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[56].setRotationPoint(-14.5F, -17F, 1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[57].setRotationPoint(-12.5F, -17F, 1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 75
		bodyModel[58].setRotationPoint(-12.5F, -17F, -2F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[59].setRotationPoint(-15F, -15.5F, -0.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[60].setRotationPoint(-15F, -15.5F, -1.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 279
		bodyModel[61].setRotationPoint(-15F, -14.5F, -1.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 280
		bodyModel[62].setRotationPoint(-15F, -14.5F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[63].setRotationPoint(-15F, -15.5F, 0.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 282
		bodyModel[64].setRotationPoint(-15F, -14.5F, 0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 283
		bodyModel[65].setRotationPoint(-15F, -13.5F, 0.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 284
		bodyModel[66].setRotationPoint(-15F, -13.5F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[67].setRotationPoint(-15F, -13.5F, -1.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 85
		bodyModel[68].setRotationPoint(-14.5F, -11F, -2F);

		bodyModel[69].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 86
		bodyModel[69].setRotationPoint(-14.5F, -11F, 1F);

		bodyModel[70].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 87
		bodyModel[70].setRotationPoint(-11.5F, -11F, 1F);

		bodyModel[71].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 88
		bodyModel[71].setRotationPoint(-11.5F, -11F, -2F);

		bodyModel[72].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 89
		bodyModel[72].setRotationPoint(-16F, 5F, -9F);

		bodyModel[73].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 90
		bodyModel[73].setRotationPoint(-16F, 5F, -4F);

		bodyModel[74].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 91
		bodyModel[74].setRotationPoint(-16F, 7F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 92
		bodyModel[75].setRotationPoint(-18F, 8F, -9F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 93
		bodyModel[76].setRotationPoint(-18F, 8F, 3F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 94
		bodyModel[77].setRotationPoint(-16F, 5F, 3F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 95
		bodyModel[78].setRotationPoint(-16F, 7F, 3F);

		bodyModel[79].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 96
		bodyModel[79].setRotationPoint(-16F, 5F, 8F);

		bodyModel[80].addBox(0F, 0F, 0F, 0, 1, 6, 0F); // Box 97
		bodyModel[80].setRotationPoint(-16F, 7F, -3F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 0, 6, 0F); // Box 98
		bodyModel[81].setRotationPoint(-18F, 8F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[82].setRotationPoint(-21F, 2.5F, -0.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 120
		bodyModel[83].setRotationPoint(-21F, 2.5F, 0.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 121
		bodyModel[84].setRotationPoint(-18F, 3F, -0.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 122
		bodyModel[85].setRotationPoint(-19F, 2.5F, -0.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 123
		bodyModel[86].setRotationPoint(-20F, 2.5F, -1.5F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 104
		bodyModel[87].setRotationPoint(-17F, 1F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[88].setRotationPoint(-18F, 2F, -0.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 106
		bodyModel[89].setRotationPoint(-18F, 3F, 0.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[90].setRotationPoint(-18F, 3F, -1.5F);

		bodyModel[91].addShapeBox(0F, -1F, 0F, 1, 6, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 285
		bodyModel[91].setRotationPoint(-5.5F, -16F, -0.25F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, 0F); // Box 142
		bodyModel[92].setRotationPoint(9F, 4F, 8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[93].setRotationPoint(9F, 2F, 8.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 144
		bodyModel[94].setRotationPoint(6.5F, 2.5F, 9.5F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 145
		bodyModel[95].setRotationPoint(6F, 2F, 8.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 146
		bodyModel[96].setRotationPoint(6.5F, 4.5F, 9.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 147
		bodyModel[97].setRotationPoint(5F, 2F, 8.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[98].setRotationPoint(5F, 4F, 8.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 149
		bodyModel[99].setRotationPoint(-5F, 4F, 8.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 150
		bodyModel[100].setRotationPoint(2F, 2F, 8.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 151
		bodyModel[101].setRotationPoint(-4F, 2F, 8.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 152
		bodyModel[102].setRotationPoint(-6F, 4F, 8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[103].setRotationPoint(-6F, 2F, 8.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 3, 4, 1, 0F); // Box 154
		bodyModel[104].setRotationPoint(-9F, 2F, 8.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		bodyModel[105].setRotationPoint(-8.5F, 4.5F, 9.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 156
		bodyModel[106].setRotationPoint(-8.5F, 2.5F, 9.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F); // Box 157
		bodyModel[107].setRotationPoint(-14F, 4F, 8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 158
		bodyModel[108].setRotationPoint(-10F, 2F, 8.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 1, 19, 0F); // Box 160
		bodyModel[109].setRotationPoint(-14F, 5.5F, -9.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[110].setRotationPoint(-14F, 4.5F, -9.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[111].setRotationPoint(-14F, 4.5F, 3.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 163
		bodyModel[112].setRotationPoint(-14F, 4.5F, -3.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 164
		bodyModel[113].setRotationPoint(-1.5F, 4.5F, -3.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[114].setRotationPoint(-1.5F, 4.5F, -9.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 1, 19, 0F); // Box 166
		bodyModel[115].setRotationPoint(-1.5F, 5.5F, -9.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[116].setRotationPoint(-1.5F, 4.5F, 3.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 168
		bodyModel[117].setRotationPoint(0.5F, 4.5F, -3.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[118].setRotationPoint(0.5F, 4.5F, -9.5F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 1, 19, 0F); // Box 170
		bodyModel[119].setRotationPoint(0.5F, 5.5F, -9.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[120].setRotationPoint(0.5F, 4.5F, 3.5F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 172
		bodyModel[121].setRotationPoint(13F, 4.5F, -3.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[122].setRotationPoint(13F, 4.5F, -9.5F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 1, 19, 0F); // Box 174
		bodyModel[123].setRotationPoint(13F, 5.5F, -9.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[124].setRotationPoint(13F, 4.5F, 3.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 176
		bodyModel[125].setRotationPoint(-2F, 5F, -6.1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[126].setRotationPoint(-4F, 8F, -6.1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 178
		bodyModel[127].setRotationPoint(-2.5F, 7F, -6.1F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 179
		bodyModel[128].setRotationPoint(1.5F, 7F, -6.1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 180
		bodyModel[129].setRotationPoint(1F, 5F, -6.1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 181
		bodyModel[130].setRotationPoint(2F, 8F, -6.1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 182
		bodyModel[131].setRotationPoint(2F, 8F, 5.1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 183
		bodyModel[132].setRotationPoint(1F, 5F, 5.1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 184
		bodyModel[133].setRotationPoint(1.5F, 7F, 5.1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 185
		bodyModel[134].setRotationPoint(-2F, 5F, 5.1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 186
		bodyModel[135].setRotationPoint(-2.5F, 7F, 5.1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[136].setRotationPoint(-4F, 8F, 5.1F);

		bodyModel[137].addBox(0F, 0F, 0F, 28, 3, 7, 0F); // Box 188
		bodyModel[137].setRotationPoint(-14F, 2F, -3.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 9, 4, 7, 0F); // Box 189
		bodyModel[138].setRotationPoint(-12F, 5F, -3.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 190
		bodyModel[139].setRotationPoint(-14F, 5F, -3.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[140].setRotationPoint(-3F, 5F, -3.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[141].setRotationPoint(12F, 5F, -3.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 9, 4, 7, 0F); // Box 193
		bodyModel[142].setRotationPoint(3F, 5F, -3.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 194
		bodyModel[143].setRotationPoint(1F, 5F, -3.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 0, 20, 1, 0F); // Box 195
		bodyModel[144].setRotationPoint(11F, -13F, -10.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 196
		bodyModel[145].setRotationPoint(14F, -1F, -10.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 197
		bodyModel[146].setRotationPoint(14F, -13F, -10.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 198
		bodyModel[147].setRotationPoint(16F, -4F, -10.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[148].setRotationPoint(11F, -4F, -10.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 200
		bodyModel[149].setRotationPoint(11F, 1F, -10.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 201
		bodyModel[150].setRotationPoint(11F, 4F, -10.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 202
		bodyModel[151].setRotationPoint(11F, 7F, -10.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 203
		bodyModel[152].setRotationPoint(11F, -1F, -10.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 0, 9, 1, 0F); // Box 204
		bodyModel[153].setRotationPoint(14F, -13F, 9.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 0, 20, 1, 0F); // Box 205
		bodyModel[154].setRotationPoint(11F, -13F, 9.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Box 206
		bodyModel[155].setRotationPoint(11F, -1F, 9.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 207
		bodyModel[156].setRotationPoint(11F, -4F, 9.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 0, 3, 1, 0F); // Box 208
		bodyModel[157].setRotationPoint(16F, -4F, 9.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 209
		bodyModel[158].setRotationPoint(14F, -1F, 9.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 210
		bodyModel[159].setRotationPoint(11F, 1F, 9.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 211
		bodyModel[160].setRotationPoint(11F, 4F, 9.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 212
		bodyModel[161].setRotationPoint(11F, 7F, 9.5F);

		bodyModel[162].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 214
		bodyModel[162].setRotationPoint(0F, -18F, 0F);
		bodyModel[162].rotateAngleX = 0.78539816F;

		bodyModel[163].addBox(0F, 0F, 0F, 4, 4, 2, 0F); // Box 226
		bodyModel[163].setRotationPoint(5F, -8F, 6.5F);

		bodyModel[164].addShapeBox(0F, 0F, -3F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[164].setRotationPoint(4.5F, -9F, 9F);
		bodyModel[164].rotateAngleX = 0.26179939F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.833F, 0F, 0F, -0.833F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.833F, 0F, 0F, 0.833F, 0F); // Box 233
		bodyModel[165].setRotationPoint(-3F, -21F, 4.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.166F, 0F, 0F, 0.166F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.166F, 0F, 0F, -0.166F, 0F); // Box 234
		bodyModel[166].setRotationPoint(-3F, -20F, -10.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.833F, 0F, 0F, -0.833F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.833F, 0F, 0F, 0.833F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[167].setRotationPoint(-3F, -21F, -9.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.166F, 0F, 0F, 0.166F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.166F, 0F, 0F, -0.166F, 0F); // Box 236
		bodyModel[168].setRotationPoint(15F, -20F, -10.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.833F, 0F, 0F, -0.833F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.833F, 0F, 0F, 0.833F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[169].setRotationPoint(15F, -21F, -9.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.833F, 0F, 0F, -0.833F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.833F, 0F, 0F, 0.833F, 0F); // Box 238
		bodyModel[170].setRotationPoint(15F, -21F, 4.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.166F, 0F, 0F, 0.166F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.166F, 0F, 0F, -0.166F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[171].setRotationPoint(15F, -20F, 9.5F);

		bodyModel[172].addBox(0F, -1F, 0F, 1, 3, 1, 0F); // Box 228
		bodyModel[172].setRotationPoint(-5.5F, -15.5F, -0.5F);

		bodyModel[173].addBox(0F, -1F, 0F, 1, 3, 1, 0F); // Box 229
		bodyModel[173].setRotationPoint(-5.5F, -11.5F, -0.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 60, 20, 1, 0F,0F, 0F, 0F, -45F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, -45F, -15F, 0F, -45F, -15F, 0F, 0F, -15F, 0F); // Box 230
		bodyModel[174].setRotationPoint(-1F, -12F, -9.6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 60, 20, 1, 0F,0F, 0F, 0F, -45F, 0F, 0F, -45F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, -45F, -15F, 0F, -45F, -15F, 0F, 0F, -15F, 0F); // Box 231
		bodyModel[175].setRotationPoint(-1F, -12F, 8.6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[176].setRotationPoint(14F, -20F, -9.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[177].setRotationPoint(14F, -20F, 8.5F);
	}
}