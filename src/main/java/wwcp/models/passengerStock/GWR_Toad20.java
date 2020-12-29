//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.11.2020 - 21:00:53
// Last changed on: 08.11.2020 - 21:00:53

package wwcp.models.passengerStock; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class GWR_Toad20 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public GWR_Toad20() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[215];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 58
		bodyModel[53] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 59
		bodyModel[54] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 60
		bodyModel[55] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 61
		bodyModel[56] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 62
		bodyModel[57] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 63
		bodyModel[58] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 65
		bodyModel[59] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 66
		bodyModel[60] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 67
		bodyModel[61] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 70
		bodyModel[62] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 71
		bodyModel[63] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 72
		bodyModel[64] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 73
		bodyModel[65] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 74
		bodyModel[66] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 75
		bodyModel[67] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 76
		bodyModel[68] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 5
		bodyModel[69] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 16
		bodyModel[70] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 17
		bodyModel[71] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 21
		bodyModel[72] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 393
		bodyModel[73] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 394
		bodyModel[74] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 395
		bodyModel[75] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 103
		bodyModel[76] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 104
		bodyModel[77] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 105
		bodyModel[78] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 106
		bodyModel[79] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 107
		bodyModel[80] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 108
		bodyModel[81] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 109
		bodyModel[82] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 92
		bodyModel[83] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 93
		bodyModel[84] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 209
		bodyModel[85] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 210
		bodyModel[86] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 212
		bodyModel[87] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 479
		bodyModel[88] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Lamp 6
		bodyModel[91] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Lamp 6
		bodyModel[92] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Lamp 6
		bodyModel[93] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 284
		bodyModel[94] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 285
		bodyModel[95] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 113
		bodyModel[96] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 114
		bodyModel[97] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 115
		bodyModel[98] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 116
		bodyModel[99] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 117
		bodyModel[100] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 118
		bodyModel[101] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 119
		bodyModel[102] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 120
		bodyModel[103] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 121
		bodyModel[104] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 122
		bodyModel[105] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 123
		bodyModel[106] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 124
		bodyModel[107] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 125
		bodyModel[108] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 126
		bodyModel[109] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 127
		bodyModel[110] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 14
		bodyModel[112] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 34
		bodyModel[113] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 47
		bodyModel[114] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 120
		bodyModel[115] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 121
		bodyModel[116] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 122
		bodyModel[117] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 124
		bodyModel[118] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 125
		bodyModel[119] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 127
		bodyModel[120] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 129
		bodyModel[121] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 130
		bodyModel[122] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 131
		bodyModel[123] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 132
		bodyModel[124] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 133
		bodyModel[125] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 134
		bodyModel[126] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 135
		bodyModel[127] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 136
		bodyModel[128] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 137
		bodyModel[129] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 138
		bodyModel[130] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 139
		bodyModel[131] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 140
		bodyModel[132] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 141
		bodyModel[133] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 142
		bodyModel[134] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 143
		bodyModel[135] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 144
		bodyModel[136] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 145
		bodyModel[137] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 146
		bodyModel[138] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 147
		bodyModel[139] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 148
		bodyModel[140] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 149
		bodyModel[141] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 150
		bodyModel[142] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 151
		bodyModel[143] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 152
		bodyModel[144] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 153
		bodyModel[145] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 154
		bodyModel[146] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 155
		bodyModel[147] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 156
		bodyModel[148] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 157
		bodyModel[149] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 158
		bodyModel[150] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 159
		bodyModel[151] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 160
		bodyModel[152] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 161
		bodyModel[153] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 162
		bodyModel[154] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 163
		bodyModel[155] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 164
		bodyModel[156] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 165
		bodyModel[157] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 166
		bodyModel[158] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 167
		bodyModel[159] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 168
		bodyModel[160] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 169
		bodyModel[161] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 170
		bodyModel[162] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 171
		bodyModel[163] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 172
		bodyModel[164] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 173
		bodyModel[165] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 174
		bodyModel[166] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 175
		bodyModel[167] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 176
		bodyModel[168] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 177
		bodyModel[169] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 179
		bodyModel[170] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 180
		bodyModel[171] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 181
		bodyModel[172] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 182
		bodyModel[173] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 183
		bodyModel[174] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 184
		bodyModel[175] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 185
		bodyModel[176] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 186
		bodyModel[177] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 187
		bodyModel[178] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 188
		bodyModel[179] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 429
		bodyModel[180] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 434
		bodyModel[181] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 191
		bodyModel[182] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 192
		bodyModel[183] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 193
		bodyModel[184] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 194
		bodyModel[185] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 195
		bodyModel[186] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 196
		bodyModel[187] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 197
		bodyModel[188] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 198
		bodyModel[189] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 199
		bodyModel[190] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 200
		bodyModel[191] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 201
		bodyModel[192] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 202
		bodyModel[193] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 203
		bodyModel[194] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 204
		bodyModel[195] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 206
		bodyModel[196] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 207
		bodyModel[197] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 208
		bodyModel[198] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 209
		bodyModel[199] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 210
		bodyModel[200] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 211
		bodyModel[201] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 212
		bodyModel[202] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 213
		bodyModel[203] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 214
		bodyModel[204] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 215
		bodyModel[205] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 216
		bodyModel[206] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 218
		bodyModel[207] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 219
		bodyModel[208] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 220
		bodyModel[209] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 221
		bodyModel[210] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 222
		bodyModel[211] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 223
		bodyModel[212] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 224
		bodyModel[213] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 225
		bodyModel[214] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 226

		bodyModel[0].addBox(0F, 0F, 0F, 38, 14, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-28F, -14F, 8F);

		bodyModel[1].addBox(-5F, 0F, 0F, 5, 7, 1, 0F); // Box 1
		bodyModel[1].setRotationPoint(15.5F, -7F, 8F);

		bodyModel[2].addShapeBox(0F, 0F, -1F, 15, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(15.5F, -7F, 9F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(29F, -15F, 8F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 5
		bodyModel[4].setRotationPoint(-28.5F, -15F, 8.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 6
		bodyModel[5].setRotationPoint(-18.5F, -14F, 8.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 7
		bodyModel[6].setRotationPoint(-9.5F, -14F, 8.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 8
		bodyModel[7].setRotationPoint(-0.5F, -14F, 8.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 9
		bodyModel[8].setRotationPoint(9.5F, -15F, 8.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 10
		bodyModel[9].setRotationPoint(-27.5F, -5F, 8.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 11
		bodyModel[10].setRotationPoint(-27.5F, -1F, 8.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 12
		bodyModel[11].setRotationPoint(-17.5F, -1F, 8.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 13
		bodyModel[12].setRotationPoint(-17.5F, -5F, 8.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 14
		bodyModel[13].setRotationPoint(-8.5F, -1F, 8.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 15
		bodyModel[14].setRotationPoint(-8.5F, -5F, 8.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 16
		bodyModel[15].setRotationPoint(0.5F, -1F, 8.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 17
		bodyModel[16].setRotationPoint(0.5F, -5F, 8.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 18
		bodyModel[17].setRotationPoint(15.5F, -1F, 8.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 19
		bodyModel[18].setRotationPoint(15.5F, -5F, 8.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 20
		bodyModel[19].setRotationPoint(15.5F, -4F, 8.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 21
		bodyModel[20].setRotationPoint(28.5F, -4F, 8.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 60, 1, 6, 0F); // Box 26
		bodyModel[21].setRotationPoint(-29F, -17F, -3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 60, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(-29F, -17F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 60, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[23].setRotationPoint(-29F, -16F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 60, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 29
		bodyModel[24].setRotationPoint(-29F, -16F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 60, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 30
		bodyModel[25].setRotationPoint(-29F, -17F, 3F);

		bodyModel[26].addShapeBox(-1F, 0F, 0F, 38, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(-27F, -15F, 8F);

		bodyModel[27].addShapeBox(-1F, 0F, 0F, 38, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(-27F, -15F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 33
		bodyModel[28].setRotationPoint(9.5F, -15F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, -1F, 15, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 34
		bodyModel[29].setRotationPoint(15.5F, -7F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 38, 14, 1, 0F); // Box 35
		bodyModel[30].setRotationPoint(-28F, -14F, -9F);

		bodyModel[31].addBox(-5F, 0F, -1F, 5, 7, 1, 0F); // Box 36
		bodyModel[31].setRotationPoint(15.5F, -7F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, -1F, 15, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(15.5F, -7F, -8F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 38
		bodyModel[33].setRotationPoint(29F, -15F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 39
		bodyModel[34].setRotationPoint(9.5F, -15F, -8.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 15, 1, 0F); // Box 40
		bodyModel[35].setRotationPoint(9.5F, -15F, -9.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 41
		bodyModel[36].setRotationPoint(0.5F, -5F, -9.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 42
		bodyModel[37].setRotationPoint(0.5F, -1F, -9.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 43
		bodyModel[38].setRotationPoint(-0.5F, -14F, -9.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 44
		bodyModel[39].setRotationPoint(-8.5F, -5F, -9.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 45
		bodyModel[40].setRotationPoint(-8.5F, -1F, -9.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 46
		bodyModel[41].setRotationPoint(-9.5F, -14F, -9.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 47
		bodyModel[42].setRotationPoint(-17.5F, -5F, -9.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 48
		bodyModel[43].setRotationPoint(-17.5F, -1F, -9.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 49
		bodyModel[44].setRotationPoint(-18.5F, -14F, -9.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 50
		bodyModel[45].setRotationPoint(-27.5F, -5F, -9.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 51
		bodyModel[46].setRotationPoint(-27.5F, -1F, -9.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 18, 1, 0F); // Box 52
		bodyModel[47].setRotationPoint(-28.5F, -15F, -9.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 53
		bodyModel[48].setRotationPoint(15.5F, -5F, -9.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 54
		bodyModel[49].setRotationPoint(15.5F, -4F, -9.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 55
		bodyModel[50].setRotationPoint(28.5F, -4F, -9.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Box 56
		bodyModel[51].setRotationPoint(15.5F, -1F, -9.5F);

		bodyModel[52].addShapeBox(0F, 0F, -1F, 1, 0, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[52].setRotationPoint(30F, -7F, -8F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 59
		bodyModel[53].setRotationPoint(-28.5F, -16F, -3.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 60
		bodyModel[54].setRotationPoint(-28.5F, -16F, 2.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 15, 16, 0F); // Box 61
		bodyModel[55].setRotationPoint(-28F, -15F, -8F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 62
		bodyModel[56].setRotationPoint(-28F, -16F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 63
		bodyModel[57].setRotationPoint(29.5F, 0F, -3.5F);

		bodyModel[58].addBox(0F, 0F, -1F, 1, 7, 16, 0F); // Box 65
		bodyModel[58].setRotationPoint(29F, -7F, -7F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 66
		bodyModel[59].setRotationPoint(29.5F, -7F, -9.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 67
		bodyModel[60].setRotationPoint(29.5F, -7F, 8.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 70
		bodyModel[61].setRotationPoint(29.5F, -7F, 2.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 71
		bodyModel[62].setRotationPoint(29.5F, -7F, -3.5F);

		bodyModel[63].addShapeBox(0F, 0F, -1F, 15, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 72
		bodyModel[63].setRotationPoint(15.5F, -7F, -8.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 58, 1, 18, 0F); // Box 73
		bodyModel[64].setRotationPoint(-28F, 0F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[65].setRotationPoint(29.5F, 0F, 2.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bodyModel[66].setRotationPoint(-28.5F, 0F, -3.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 76
		bodyModel[67].setRotationPoint(-28.5F, 0F, 2.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[68].setRotationPoint(33F, 0F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[69].setRotationPoint(33F, 0F, 6F);

		bodyModel[70].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[70].setRotationPoint(29.5F, 1.5F, 7.5F);
		bodyModel[70].rotateAngleX = 0.78539816F;

		bodyModel[71].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[71].setRotationPoint(29.5F, 1.5F, -7.5F);
		bodyModel[71].rotateAngleX = 0.78539816F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[72].setRotationPoint(31.5F, 2F, -0.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[73].setRotationPoint(32.5F, 1F, -0.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F); // Box 395
		bodyModel[74].setRotationPoint(28.5F, 1F, -0.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[75].setRotationPoint(-32F, 0F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F); // Box 104
		bodyModel[76].setRotationPoint(-28.5F, 1F, -0.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[77].setRotationPoint(-30.5F, 2F, -0.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[78].setRotationPoint(-31.5F, 1F, -0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[79].setRotationPoint(-32F, 0F, 6F);

		bodyModel[80].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 108
		bodyModel[80].setRotationPoint(-31.5F, 1.5F, 7.5F);
		bodyModel[80].rotateAngleX = 0.78539816F;

		bodyModel[81].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 109
		bodyModel[81].setRotationPoint(-31.5F, 1.5F, -7.5F);
		bodyModel[81].rotateAngleX = 0.78539816F;

		bodyModel[82].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Box 92
		bodyModel[82].setRotationPoint(9F, -15F, -8F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 93
		bodyModel[83].setRotationPoint(9F, -16F, -7F);

		bodyModel[84].addShapeBox(-0.5F, 0F, -2F, 1, 1, 4, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 209
		bodyModel[84].setRotationPoint(23.5F, -8F, -1F);
		bodyModel[84].rotateAngleY = 1.57079633F;

		bodyModel[85].addShapeBox(-0.5F, 0F, -2F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 210
		bodyModel[85].setRotationPoint(23.5F, -9F, -1F);
		bodyModel[85].rotateAngleY = 1.57079633F;

		bodyModel[86].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Box 212
		bodyModel[86].setRotationPoint(23.5F, -7.5F, -1F);
		bodyModel[86].rotateAngleY = 1.57079633F;

		bodyModel[87].addBox(-0.5F, 1F, -0.5F, 1, 6, 1, 0F); // Box 479
		bodyModel[87].setRotationPoint(23.5F, -7F, -1F);
		bodyModel[87].rotateAngleY = 1.57079633F;

		bodyModel[88].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 102
		bodyModel[88].setRotationPoint(9.5F, -16F, -3.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 16, 1, 0F); // Box 103
		bodyModel[89].setRotationPoint(9.5F, -16F, 2.5F);

		bodyModel[90].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp 6
		bodyModel[90].setRotationPoint(30.75F, -3.25F, 1F);
		bodyModel[90].rotateAngleX = 0.78539816F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Lamp 6
		bodyModel[91].setRotationPoint(30.25F, -4F, 0.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp 6
		bodyModel[92].setRotationPoint(30.25F, -5F, 0.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 284
		bodyModel[93].setRotationPoint(28.75F, -2.5F, 0.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 285
		bodyModel[94].setRotationPoint(30.25F, -2.5F, 0.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 113
		bodyModel[95].setRotationPoint(-28.75F, -2.5F, -1.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 114
		bodyModel[96].setRotationPoint(-29.25F, -2.5F, -1.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 115
		bodyModel[97].setRotationPoint(-29.25F, -4F, -1.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[98].setRotationPoint(-29.25F, -5F, -1.5F);

		bodyModel[99].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[99].setRotationPoint(-29.75F, -3.25F, -1F);
		bodyModel[99].rotateAngleX = 0.78539816F;

		bodyModel[100].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[100].setRotationPoint(8.25F, -8.25F, 9.75F);
		bodyModel[100].rotateAngleX = 0.78539816F;
		bodyModel[100].rotateAngleY = 1.57079633F;

		bodyModel[101].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[101].setRotationPoint(8.25F, -10F, 9.75F);
		bodyModel[101].rotateAngleY = 1.57079633F;

		bodyModel[102].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 120
		bodyModel[102].setRotationPoint(8.25F, -9F, 9.75F);
		bodyModel[102].rotateAngleY = 1.57079633F;

		bodyModel[103].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 121
		bodyModel[103].setRotationPoint(8.25F, -7.5F, 9.75F);
		bodyModel[103].rotateAngleY = 1.57079633F;

		bodyModel[104].addShapeBox(-2F, 0F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 122
		bodyModel[104].setRotationPoint(8.25F, -7.5F, 9.75F);
		bodyModel[104].rotateAngleY = 1.57079633F;

		bodyModel[105].addShapeBox(-2F, 0F, -0.5F, 1, 1, 1, 0F,-0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, 0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 123
		bodyModel[105].setRotationPoint(8.25F, -7.5F, -9.75F);
		bodyModel[105].rotateAngleY = -1.57079633F;

		bodyModel[106].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 124
		bodyModel[106].setRotationPoint(8.25F, -7.5F, -9.75F);
		bodyModel[106].rotateAngleY = -1.57079633F;

		bodyModel[107].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 125
		bodyModel[107].setRotationPoint(8.25F, -9F, -9.75F);
		bodyModel[107].rotateAngleY = -1.57079633F;

		bodyModel[108].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[108].setRotationPoint(8.25F, -10F, -9.75F);
		bodyModel[108].rotateAngleY = -1.57079633F;

		bodyModel[109].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[109].setRotationPoint(8.25F, -8.25F, -9.75F);
		bodyModel[109].rotateAngleX = 0.78539816F;
		bodyModel[109].rotateAngleY = -1.57079633F;

		bodyModel[110].addBox(0F, 0F, 0F, 1, 19, 1, 0F); // Box 128
		bodyModel[110].setRotationPoint(-18F, -19F, -4F);

		bodyModel[111].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 14
		bodyModel[111].setRotationPoint(-18F, 6F, 6F);

		bodyModel[112].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 34
		bodyModel[112].setRotationPoint(-18F, 6F, -6F);

		bodyModel[113].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 47
		bodyModel[113].setRotationPoint(-18F, 6F, -7F);

		bodyModel[114].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 120
		bodyModel[114].setRotationPoint(21F, 6F, 6F);

		bodyModel[115].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 121
		bodyModel[115].setRotationPoint(21F, 6F, -6F);

		bodyModel[116].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 122
		bodyModel[116].setRotationPoint(21F, 6F, -7F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 124
		bodyModel[117].setRotationPoint(-20F, 3F, 7F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 125
		bodyModel[118].setRotationPoint(-17F, 3F, 7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, 0F, 0F); // Box 127
		bodyModel[119].setRotationPoint(-22F, 3F, 7F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 129
		bodyModel[120].setRotationPoint(-20F, 4F, 7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F); // Box 130
		bodyModel[121].setRotationPoint(-15F, 3F, 7F);

		bodyModel[122].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 131
		bodyModel[122].setRotationPoint(-19.5F, 5F, 8F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 132
		bodyModel[123].setRotationPoint(-19F, 3F, 8F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 133
		bodyModel[124].setRotationPoint(-24F, 3F, 8F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		bodyModel[125].setRotationPoint(-25F, 3F, 8F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 135
		bodyModel[126].setRotationPoint(-12F, 3F, 8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 136
		bodyModel[127].setRotationPoint(-17F, 3F, 8F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 137
		bodyModel[128].setRotationPoint(27F, 3F, 8F);

		bodyModel[129].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 138
		bodyModel[129].setRotationPoint(20F, 3F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 139
		bodyModel[130].setRotationPoint(22F, 3F, 8F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 140
		bodyModel[131].setRotationPoint(19.5F, 5F, 8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 141
		bodyModel[132].setRotationPoint(15F, 3F, 8F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 142
		bodyModel[133].setRotationPoint(14F, 3F, 8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, 0F, 0F); // Box 143
		bodyModel[134].setRotationPoint(17F, 3F, 7F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 144
		bodyModel[135].setRotationPoint(19F, 3F, 7F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 145
		bodyModel[136].setRotationPoint(22F, 3F, 7F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 146
		bodyModel[137].setRotationPoint(19F, 4F, 7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F); // Box 147
		bodyModel[138].setRotationPoint(24F, 3F, 7F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 148
		bodyModel[139].setRotationPoint(27F, 3F, -9F);

		bodyModel[140].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 149
		bodyModel[140].setRotationPoint(20F, 3F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 150
		bodyModel[141].setRotationPoint(22F, 3F, -9F);

		bodyModel[142].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 151
		bodyModel[142].setRotationPoint(19.5F, 5F, -9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[143].setRotationPoint(15F, 3F, -9F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 153
		bodyModel[144].setRotationPoint(14F, 3F, -9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, 0F, 0F); // Box 154
		bodyModel[145].setRotationPoint(17F, 3F, -8F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 155
		bodyModel[146].setRotationPoint(19F, 3F, -8F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 156
		bodyModel[147].setRotationPoint(22F, 3F, -8F);

		bodyModel[148].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 157
		bodyModel[148].setRotationPoint(19F, 4F, -8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F); // Box 158
		bodyModel[149].setRotationPoint(24F, 3F, -8F);

		bodyModel[150].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 159
		bodyModel[150].setRotationPoint(-12F, 3F, -9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 160
		bodyModel[151].setRotationPoint(-17F, 3F, -9F);

		bodyModel[152].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 161
		bodyModel[152].setRotationPoint(-19F, 3F, -9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F); // Box 162
		bodyModel[153].setRotationPoint(-15F, 3F, -8F);

		bodyModel[154].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 163
		bodyModel[154].setRotationPoint(-17F, 3F, -8F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 164
		bodyModel[155].setRotationPoint(-19.5F, 5F, -9F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 165
		bodyModel[156].setRotationPoint(-20F, 4F, -8F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 166
		bodyModel[157].setRotationPoint(-20F, 3F, -8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 167
		bodyModel[158].setRotationPoint(-24F, 3F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -2F, 0F, 0F); // Box 168
		bodyModel[159].setRotationPoint(-22F, 3F, -8F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 169
		bodyModel[160].setRotationPoint(-25F, 3F, -9F);

		bodyModel[161].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 170
		bodyModel[161].setRotationPoint(-28F, 5F, 8F);

		bodyModel[162].addBox(0F, 0F, 0F, 59, 1, 1, 0F); // Box 171
		bodyModel[162].setRotationPoint(-28F, 6F, 9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[163].setRotationPoint(-26F, 3F, 7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[164].setRotationPoint(-7F, 3F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[165].setRotationPoint(9F, 3F, 7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[166].setRotationPoint(28F, 3F, 7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 176
		bodyModel[167].setRotationPoint(28F, 3F, -8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 177
		bodyModel[168].setRotationPoint(9F, 3F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 179
		bodyModel[169].setRotationPoint(-7F, 3F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 180
		bodyModel[170].setRotationPoint(-26F, 3F, -8F);

		bodyModel[171].addBox(0F, 0F, 0F, 59, 1, 1, 0F); // Box 181
		bodyModel[171].setRotationPoint(-28F, 6F, -10F);

		bodyModel[172].addBox(0F, 0F, 0F, 35, 2, 1, 0F); // Box 182
		bodyModel[172].setRotationPoint(-16F, 5F, 8F);

		bodyModel[173].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 183
		bodyModel[173].setRotationPoint(23F, 5F, 8F);

		bodyModel[174].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 184
		bodyModel[174].setRotationPoint(-28F, 5F, -9F);

		bodyModel[175].addBox(0F, 0F, 0F, 35, 2, 1, 0F); // Box 185
		bodyModel[175].setRotationPoint(-16F, 5F, -9F);

		bodyModel[176].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Box 186
		bodyModel[176].setRotationPoint(23F, 5F, -9F);

		bodyModel[177].addBox(-5F, 0F, -1F, 5, 1, 2, 0F); // Box 187
		bodyModel[177].setRotationPoint(15.5F, 1F, -9F);

		bodyModel[178].addBox(-5F, 0F, -1F, 5, 1, 2, 0F); // Box 188
		bodyModel[178].setRotationPoint(15.5F, 1F, 9F);

		bodyModel[179].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 429
		bodyModel[179].setRotationPoint(-22.5F, 6F, 5F);

		bodyModel[180].addShapeBox(-1F, 0F, 0F, 1, 5, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 434
		bodyModel[180].setRotationPoint(-23F, 2.5F, 5F);

		bodyModel[181].addShapeBox(-1F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 191
		bodyModel[181].setRotationPoint(-12F, 2.5F, 5F);

		bodyModel[182].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 192
		bodyModel[182].setRotationPoint(-13.5F, 6F, 5F);

		bodyModel[183].addShapeBox(-1F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 193
		bodyModel[183].setRotationPoint(27F, 2.5F, 5F);

		bodyModel[184].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 194
		bodyModel[184].setRotationPoint(25.5F, 6F, 5F);

		bodyModel[185].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 195
		bodyModel[185].setRotationPoint(16.5F, 6F, 5F);

		bodyModel[186].addShapeBox(-1F, 0F, 0F, 1, 5, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 196
		bodyModel[186].setRotationPoint(16F, 2.5F, 5F);

		bodyModel[187].addShapeBox(-1F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 197
		bodyModel[187].setRotationPoint(27F, 2.5F, -6F);

		bodyModel[188].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 198
		bodyModel[188].setRotationPoint(25.5F, 6F, -6F);

		bodyModel[189].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 199
		bodyModel[189].setRotationPoint(16.5F, 6F, -6F);

		bodyModel[190].addShapeBox(-1F, 0F, 0F, 1, 5, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 200
		bodyModel[190].setRotationPoint(16F, 2.5F, -6F);

		bodyModel[191].addShapeBox(-1F, 0F, 0F, 1, 5, 1, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 201
		bodyModel[191].setRotationPoint(-23F, 2.5F, -6F);

		bodyModel[192].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 202
		bodyModel[192].setRotationPoint(-22.5F, 6F, -6F);

		bodyModel[193].addShapeBox(-1F, 0F, 0F, 1, 5, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 203
		bodyModel[193].setRotationPoint(-12F, 2.5F, -6F);

		bodyModel[194].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 204
		bodyModel[194].setRotationPoint(-13.5F, 6F, -6F);

		bodyModel[195].addBox(0F, 0F, -1F, 4, 5, 16, 0F); // Box 206
		bodyModel[195].setRotationPoint(25F, -5F, -7F);

		bodyModel[196].addBox(0F, 0F, -1F, 3, 2, 3, 0F); // Box 207
		bodyModel[196].setRotationPoint(25.5F, -7F, -6F);

		bodyModel[197].addBox(0F, 0F, -1F, 3, 2, 3, 0F); // Box 208
		bodyModel[197].setRotationPoint(25.5F, -7F, 5F);

		bodyModel[198].addBox(0F, 0F, 0F, 36, 4, 4, 0F); // Box 209
		bodyModel[198].setRotationPoint(-27F, -4F, 4F);

		bodyModel[199].addBox(0F, 0F, 0F, 4, 4, 12, 0F); // Box 210
		bodyModel[199].setRotationPoint(-27F, -4F, -8F);

		bodyModel[200].addBox(0F, 0F, 0F, 6, 4, 4, 0F); // Box 211
		bodyModel[200].setRotationPoint(3F, -4F, -8F);

		bodyModel[201].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 212
		bodyModel[201].setRotationPoint(-18.5F, -4F, -5.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 213
		bodyModel[202].setRotationPoint(-19.5F, -4F, -4.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 214
		bodyModel[203].setRotationPoint(-16.5F, -4F, -4.5F);

		bodyModel[204].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Box 215
		bodyModel[204].setRotationPoint(-18.5F, -1F, -6.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 216
		bodyModel[205].setRotationPoint(-20.5F, -1F, -4.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 218
		bodyModel[206].setRotationPoint(-16.5F, -1F, -4.5F);

		bodyModel[207].addBox(0F, 0F, -1F, 3, 2, 3, 0F); // Box 219
		bodyModel[207].setRotationPoint(-26.5F, -6F, -6F);

		bodyModel[208].addBox(0F, 0F, -1F, 3, 2, 3, 0F); // Box 220
		bodyModel[208].setRotationPoint(-26.5F, -6F, 5F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 15, 6, 0F); // Box 221
		bodyModel[209].setRotationPoint(9F, -15F, 2F);

		bodyModel[210].addBox(-1F, 0F, 0F, 1, 15, 4, 0F); // Box 222
		bodyModel[210].setRotationPoint(10F, -15F, -2F);

		bodyModel[211].addBox(0F, 0F, 0F, 58, 1, 18, 0F); // Box 223
		bodyModel[211].setRotationPoint(-28F, 2F, -9F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 224
		bodyModel[212].setRotationPoint(-28F, 1F, -9F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 18, 0F); // Box 225
		bodyModel[213].setRotationPoint(29F, 1F, -9F);

		bodyModel[214].addBox(0F, 0F, 0F, 56, 1, 16, 0F); // Box 226
		bodyModel[214].setRotationPoint(-27F, 1F, -8F);
	}
}