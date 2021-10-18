//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.04.2020 - 00:00:40
// Last changed on: 04.04.2020 - 00:00:40

package wwcp.models.locomotives.electrics.Traxx; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class TraxxSecondGen extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public TraxxSecondGen() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[524];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 103
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 385
		bodyModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 64
		bodyModel[11] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 66
		bodyModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 67
		bodyModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 68
		bodyModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 34
		bodyModel[15] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 36
		bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 39
		bodyModel[18] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 40
		bodyModel[19] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 42
		bodyModel[20] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 45
		bodyModel[21] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 46
		bodyModel[22] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 50
		bodyModel[23] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 51
		bodyModel[24] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 60
		bodyModel[25] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 61
		bodyModel[26] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 63
		bodyModel[27] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 64
		bodyModel[28] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 65
		bodyModel[29] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 63
		bodyModel[30] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 64
		bodyModel[31] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 65
		bodyModel[32] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Front Top
		bodyModel[33] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 67
		bodyModel[34] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 72
		bodyModel[35] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 73
		bodyModel[36] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 74
		bodyModel[37] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 75
		bodyModel[38] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 76
		bodyModel[39] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 77
		bodyModel[40] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 79
		bodyModel[41] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 80
		bodyModel[42] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 81
		bodyModel[43] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 82
		bodyModel[44] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 83
		bodyModel[45] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 84
		bodyModel[46] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 85
		bodyModel[47] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 86
		bodyModel[48] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 87
		bodyModel[49] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 88
		bodyModel[50] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 91
		bodyModel[51] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 92
		bodyModel[52] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 95
		bodyModel[53] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 96
		bodyModel[54] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 100
		bodyModel[56] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 101
		bodyModel[57] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 102
		bodyModel[58] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 103
		bodyModel[59] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 104
		bodyModel[60] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 105
		bodyModel[61] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 106
		bodyModel[62] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 107
		bodyModel[63] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 108
		bodyModel[64] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 109
		bodyModel[65] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 110
		bodyModel[66] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 125
		bodyModel[67] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 126
		bodyModel[68] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 127
		bodyModel[69] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 129
		bodyModel[70] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 130
		bodyModel[71] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 132
		bodyModel[72] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 134
		bodyModel[73] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 147
		bodyModel[74] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 148
		bodyModel[75] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 149
		bodyModel[76] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 151
		bodyModel[77] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 152
		bodyModel[78] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 154
		bodyModel[79] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 157
		bodyModel[80] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 158
		bodyModel[81] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 160
		bodyModel[82] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 161
		bodyModel[83] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 162
		bodyModel[84] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 163
		bodyModel[85] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 164
		bodyModel[86] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 165
		bodyModel[87] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 166
		bodyModel[88] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 469
		bodyModel[89] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 470
		bodyModel[90] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 172
		bodyModel[91] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 173
		bodyModel[92] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 243
		bodyModel[93] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 256
		bodyModel[94] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 257
		bodyModel[95] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 258
		bodyModel[96] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 259
		bodyModel[97] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 260
		bodyModel[98] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 378
		bodyModel[99] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 379
		bodyModel[100] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 186
		bodyModel[101] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 78
		bodyModel[102] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 79
		bodyModel[103] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 82
		bodyModel[104] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 83
		bodyModel[105] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 299
		bodyModel[106] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 196
		bodyModel[107] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 197
		bodyModel[108] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 198
		bodyModel[109] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 199
		bodyModel[110] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 200
		bodyModel[111] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 201
		bodyModel[112] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 202
		bodyModel[113] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 203
		bodyModel[114] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 204
		bodyModel[115] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 205
		bodyModel[116] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 206
		bodyModel[117] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 207
		bodyModel[118] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 208
		bodyModel[119] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 209
		bodyModel[120] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 210
		bodyModel[121] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 211
		bodyModel[122] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 212
		bodyModel[123] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 213
		bodyModel[124] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 214
		bodyModel[125] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 215
		bodyModel[126] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 216
		bodyModel[127] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 217
		bodyModel[128] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 218
		bodyModel[129] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 219
		bodyModel[130] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 220
		bodyModel[131] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 221
		bodyModel[132] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 222
		bodyModel[133] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 223
		bodyModel[134] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 224
		bodyModel[135] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 225
		bodyModel[136] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 226
		bodyModel[137] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 227
		bodyModel[138] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 228
		bodyModel[139] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 229
		bodyModel[140] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 230
		bodyModel[141] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 231
		bodyModel[142] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 232
		bodyModel[143] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 233
		bodyModel[144] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 234
		bodyModel[145] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 235
		bodyModel[146] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 236
		bodyModel[147] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 237
		bodyModel[148] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 238
		bodyModel[149] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 239
		bodyModel[150] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 240
		bodyModel[151] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 241
		bodyModel[152] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 242
		bodyModel[153] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 243
		bodyModel[154] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 244
		bodyModel[155] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 245
		bodyModel[156] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 246
		bodyModel[157] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 247
		bodyModel[158] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 248
		bodyModel[159] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 249
		bodyModel[160] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 250
		bodyModel[161] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 206
		bodyModel[162] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 207
		bodyModel[163] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 208
		bodyModel[164] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 209
		bodyModel[165] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 210
		bodyModel[166] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 227
		bodyModel[167] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 228
		bodyModel[168] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 229
		bodyModel[169] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 230
		bodyModel[170] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 238
		bodyModel[171] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 239
		bodyModel[172] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 262
		bodyModel[173] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 263
		bodyModel[174] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 264
		bodyModel[175] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 212
		bodyModel[176] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 233
		bodyModel[177] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 247
		bodyModel[178] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 248
		bodyModel[179] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 249
		bodyModel[180] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 250
		bodyModel[181] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 251
		bodyModel[182] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 252
		bodyModel[183] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 253
		bodyModel[184] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 261
		bodyModel[185] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 262
		bodyModel[186] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 263
		bodyModel[187] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 264
		bodyModel[188] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 265
		bodyModel[189] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 266
		bodyModel[190] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 267
		bodyModel[191] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 282
		bodyModel[192] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 309
		bodyModel[193] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 310
		bodyModel[194] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 311
		bodyModel[195] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 313
		bodyModel[196] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 318
		bodyModel[197] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 370
		bodyModel[198] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 371
		bodyModel[199] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 373
		bodyModel[200] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 390
		bodyModel[201] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 391
		bodyModel[202] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 392
		bodyModel[203] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 289
		bodyModel[204] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 290
		bodyModel[205] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 291
		bodyModel[206] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 292
		bodyModel[207] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 293
		bodyModel[208] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 294
		bodyModel[209] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 295
		bodyModel[210] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 305
		bodyModel[211] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 306
		bodyModel[212] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 307
		bodyModel[213] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 308
		bodyModel[214] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 309
		bodyModel[215] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 310
		bodyModel[216] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 311
		bodyModel[217] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 312
		bodyModel[218] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 313
		bodyModel[219] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 314
		bodyModel[220] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 315
		bodyModel[221] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 316
		bodyModel[222] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 317
		bodyModel[223] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 318
		bodyModel[224] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 319
		bodyModel[225] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 320
		bodyModel[226] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 321
		bodyModel[227] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 322
		bodyModel[228] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 323
		bodyModel[229] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 324
		bodyModel[230] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 325
		bodyModel[231] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 326
		bodyModel[232] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Box 205
		bodyModel[233] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 206
		bodyModel[234] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 207
		bodyModel[235] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 208
		bodyModel[236] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 406
		bodyModel[237] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 407
		bodyModel[238] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 408
		bodyModel[239] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 409
		bodyModel[240] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 336
		bodyModel[241] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 337
		bodyModel[242] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 338
		bodyModel[243] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 339
		bodyModel[244] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Box 434
		bodyModel[245] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 435
		bodyModel[246] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 436
		bodyModel[247] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 437
		bodyModel[248] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 343
		bodyModel[249] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 344
		bodyModel[250] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 345
		bodyModel[251] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 346
		bodyModel[252] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 297
		bodyModel[253] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 298
		bodyModel[254] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 299
		bodyModel[255] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 300
		bodyModel[256] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 301
		bodyModel[257] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 302
		bodyModel[258] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 303
		bodyModel[259] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 304
		bodyModel[260] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 305
		bodyModel[261] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 306
		bodyModel[262] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 307
		bodyModel[263] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 308
		bodyModel[264] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 309
		bodyModel[265] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 310
		bodyModel[266] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 311
		bodyModel[267] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 323
		bodyModel[268] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 273
		bodyModel[269] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 274
		bodyModel[270] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 275
		bodyModel[271] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 276
		bodyModel[272] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 277
		bodyModel[273] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 278
		bodyModel[274] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 279
		bodyModel[275] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 280
		bodyModel[276] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 281
		bodyModel[277] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 282
		bodyModel[278] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 283
		bodyModel[279] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 284
		bodyModel[280] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 285
		bodyModel[281] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 287
		bodyModel[282] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 288
		bodyModel[283] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 235
		bodyModel[284] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 265
		bodyModel[285] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 324
		bodyModel[286] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 325
		bodyModel[287] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 326
		bodyModel[288] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 327
		bodyModel[289] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 328
		bodyModel[290] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 329
		bodyModel[291] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 330
		bodyModel[292] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 331
		bodyModel[293] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 332
		bodyModel[294] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 333
		bodyModel[295] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 334
		bodyModel[296] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 337
		bodyModel[297] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 338
		bodyModel[298] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 339
		bodyModel[299] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 151
		bodyModel[300] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 158
		bodyModel[301] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 268
		bodyModel[302] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 392
		bodyModel[303] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 393
		bodyModel[304] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 394
		bodyModel[305] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 395
		bodyModel[306] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 396
		bodyModel[307] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 397
		bodyModel[308] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 398
		bodyModel[309] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 181
		bodyModel[310] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 161
		bodyModel[311] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 435
		bodyModel[312] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 436
		bodyModel[313] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 409
		bodyModel[314] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 410
		bodyModel[315] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 411
		bodyModel[316] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 412
		bodyModel[317] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 415
		bodyModel[318] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 425
		bodyModel[319] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 425
		bodyModel[320] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 426
		bodyModel[321] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 427
		bodyModel[322] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 428
		bodyModel[323] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 429
		bodyModel[324] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 430
		bodyModel[325] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 431
		bodyModel[326] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 432
		bodyModel[327] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 433
		bodyModel[328] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 434
		bodyModel[329] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 435
		bodyModel[330] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 436
		bodyModel[331] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 437
		bodyModel[332] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 438
		bodyModel[333] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 439
		bodyModel[334] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 440
		bodyModel[335] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 441
		bodyModel[336] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 442
		bodyModel[337] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 444
		bodyModel[338] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 445
		bodyModel[339] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 446
		bodyModel[340] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Box 447
		bodyModel[341] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 448
		bodyModel[342] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 449
		bodyModel[343] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 450
		bodyModel[344] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 451
		bodyModel[345] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box59
		bodyModel[346] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box60
		bodyModel[347] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box63
		bodyModel[348] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box65
		bodyModel[349] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 127
		bodyModel[350] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 128
		bodyModel[351] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 129
		bodyModel[352] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 130
		bodyModel[353] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 141
		bodyModel[354] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 255
		bodyModel[355] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 257
		bodyModel[356] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 271
		bodyModel[357] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 272
		bodyModel[358] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Box 286
		bodyModel[359] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 472
		bodyModel[360] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 473
		bodyModel[361] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 474
		bodyModel[362] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 475
		bodyModel[363] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 476
		bodyModel[364] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 477
		bodyModel[365] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 478
		bodyModel[366] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 479
		bodyModel[367] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 480
		bodyModel[368] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 481
		bodyModel[369] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 482
		bodyModel[370] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 483
		bodyModel[371] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 484
		bodyModel[372] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 485
		bodyModel[373] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 486
		bodyModel[374] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 487
		bodyModel[375] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 488
		bodyModel[376] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 222
		bodyModel[377] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 223
		bodyModel[378] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 272
		bodyModel[379] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 273
		bodyModel[380] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Box 398
		bodyModel[381] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 494
		bodyModel[382] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 495
		bodyModel[383] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 496
		bodyModel[384] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 497
		bodyModel[385] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 4
		bodyModel[386] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 490
		bodyModel[387] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 491
		bodyModel[388] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 492
		bodyModel[389] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 495
		bodyModel[390] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 497
		bodyModel[391] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 500
		bodyModel[392] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 501
		bodyModel[393] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 502
		bodyModel[394] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 503
		bodyModel[395] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 504
		bodyModel[396] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 506
		bodyModel[397] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 507
		bodyModel[398] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 508
		bodyModel[399] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 509
		bodyModel[400] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 510
		bodyModel[401] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 511
		bodyModel[402] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 512
		bodyModel[403] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 513
		bodyModel[404] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Box 514
		bodyModel[405] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Box 516
		bodyModel[406] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 517
		bodyModel[407] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Box 518
		bodyModel[408] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Box 519
		bodyModel[409] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 520
		bodyModel[410] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Box 521
		bodyModel[411] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 522
		bodyModel[412] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 523
		bodyModel[413] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 524
		bodyModel[414] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 525
		bodyModel[415] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 526
		bodyModel[416] = new ModelRendererTurbo(this, 161, 201, textureX, textureY); // Box 527
		bodyModel[417] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 528
		bodyModel[418] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 529
		bodyModel[419] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 530
		bodyModel[420] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 531
		bodyModel[421] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Box 533
		bodyModel[422] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 534
		bodyModel[423] = new ModelRendererTurbo(this, 257, 201, textureX, textureY); // Box 535
		bodyModel[424] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 536
		bodyModel[425] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 537
		bodyModel[426] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Box 538
		bodyModel[427] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 539
		bodyModel[428] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 540
		bodyModel[429] = new ModelRendererTurbo(this, 329, 201, textureX, textureY); // Box 541
		bodyModel[430] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 542
		bodyModel[431] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Box 543
		bodyModel[432] = new ModelRendererTurbo(this, 433, 201, textureX, textureY); // Box 544
		bodyModel[433] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 545
		bodyModel[434] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 546
		bodyModel[435] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 547
		bodyModel[436] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 548
		bodyModel[437] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 549
		bodyModel[438] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 550
		bodyModel[439] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 551
		bodyModel[440] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 552
		bodyModel[441] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 553
		bodyModel[442] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Box 554
		bodyModel[443] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 555
		bodyModel[444] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 556
		bodyModel[445] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Box 558
		bodyModel[446] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 559
		bodyModel[447] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Box 560
		bodyModel[448] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 561
		bodyModel[449] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 562
		bodyModel[450] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 563
		bodyModel[451] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 564
		bodyModel[452] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 565
		bodyModel[453] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 566
		bodyModel[454] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 567
		bodyModel[455] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 568
		bodyModel[456] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Box 569
		bodyModel[457] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 570
		bodyModel[458] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 571
		bodyModel[459] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 572
		bodyModel[460] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 573
		bodyModel[461] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 574
		bodyModel[462] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 575
		bodyModel[463] = new ModelRendererTurbo(this, 449, 209, textureX, textureY); // Box 576
		bodyModel[464] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Box 577
		bodyModel[465] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 578
		bodyModel[466] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 579
		bodyModel[467] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 580
		bodyModel[468] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 581
		bodyModel[469] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 582
		bodyModel[470] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Box 583
		bodyModel[471] = new ModelRendererTurbo(this, 105, 217, textureX, textureY); // Box 584
		bodyModel[472] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 585
		bodyModel[473] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 586
		bodyModel[474] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 587
		bodyModel[475] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 588
		bodyModel[476] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Box 589
		bodyModel[477] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 590
		bodyModel[478] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 591
		bodyModel[479] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 592
		bodyModel[480] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 593
		bodyModel[481] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 594
		bodyModel[482] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 596
		bodyModel[483] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 597
		bodyModel[484] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 598
		bodyModel[485] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 599
		bodyModel[486] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 600
		bodyModel[487] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 601
		bodyModel[488] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 602
		bodyModel[489] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Box 603
		bodyModel[490] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 604
		bodyModel[491] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Box 605
		bodyModel[492] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 606
		bodyModel[493] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 607
		bodyModel[494] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 608
		bodyModel[495] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 609
		bodyModel[496] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 610
		bodyModel[497] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 611
		bodyModel[498] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 612
		bodyModel[499] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 515

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F); // Box 103
		bodyModel[0].setRotationPoint(-73F, 0.5F, 5.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[1].setRotationPoint(-67.5F, 0F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 8
		bodyModel[2].setRotationPoint(-72F, 1F, 6.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 9
		bodyModel[3].setRotationPoint(-71.5F, 0.5F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 10
		bodyModel[4].setRotationPoint(-68.5F, 0.5F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-0.5F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F); // Box 11
		bodyModel[5].setRotationPoint(-73F, 0.5F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 12
		bodyModel[6].setRotationPoint(-72F, 1F, -8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 13
		bodyModel[7].setRotationPoint(-71.5F, 0.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 14
		bodyModel[8].setRotationPoint(-68.5F, 0.5F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[9].setRotationPoint(-63F, -1F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[10].setRotationPoint(-60F, -15F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,-2.5F, -0.5F, 0F, -1.5F, -2F, -1F, -1.5F, -2F, 0F, -2F, 0F, -2F, -1.75F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -0.75F, 0F, -2F); // Box 66
		bodyModel[11].setRotationPoint(-66F, -17F, 9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[12].setRotationPoint(-60F, -19F, 9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.5F, -2.5F, 0F, -1.5F, -1.25F, 0F, -2F, -0.5F, -2F, 0F, -2F, -2F, -3.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 68
		bodyModel[13].setRotationPoint(-64F, -19F, 9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -0.5F, -2F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 34
		bodyModel[14].setRotationPoint(-62F, -19F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[15].setRotationPoint(-60F, -19F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[16].setRotationPoint(-69.5F, -11F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 18, 0F,-2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[17].setRotationPoint(-67.5F, -15F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-1.5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 40
		bodyModel[18].setRotationPoint(-65.5F, -17F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.5F, 0.5F, 0F); // Box 42
		bodyModel[19].setRotationPoint(-64F, -18F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F); // Box 45
		bodyModel[20].setRotationPoint(-62F, -19F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[21].setRotationPoint(-60F, -20F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[22].setRotationPoint(-63F, -1F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[23].setRotationPoint(-60F, -15F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[24].setRotationPoint(-63F, -15F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,-2F, 0F, -2F, -1.5F, -2F, 0F, -1.5F, -2F, -1F, -2.5F, -0.5F, 0F, -0.75F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -1.75F, 0F, 0F); // Box 61
		bodyModel[25].setRotationPoint(-66F, -17F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, -2F, -2F, -2F, -0.5F, -2F, -1.5F, -1.25F, 0F, -0.5F, -2.5F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -3.5F, 0F, -1F); // Box 63
		bodyModel[26].setRotationPoint(-64F, -19F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -0.5F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, -0.5F, -1.25F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -1F); // Box 64
		bodyModel[27].setRotationPoint(-62F, -19F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 65
		bodyModel[28].setRotationPoint(-60F, -20F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[29].setRotationPoint(-69.5F, -11F, 1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1.335F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -1.335F, 0F, 0F); // Box 64
		bodyModel[30].setRotationPoint(-69.5F, -11F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2.015F, 0F, 0F, 1.925F, 0F, 0F, 1.925F, 0F, 0F, -2.015F, 0F, 0F, -1.35F, 0F, 0F, 1.225F, 0F, 0F, 1.225F, 0F, 0F, -1.35F, 0F, 0F); // Box 65
		bodyModel[31].setRotationPoint(-70.85F, -7F, -1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Front Top
		bodyModel[32].setRotationPoint(-68.85F, -9F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.075F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, -1.075F, 0F, 0F, -1.075F, 0F, 0F, 0.075F, 0F, 0F); // Box 67
		bodyModel[33].setRotationPoint(-67.85F, -9F, -1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Box 72
		bodyModel[34].setRotationPoint(-70F, -2.5F, 4.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Box 73
		bodyModel[35].setRotationPoint(-70F, -2.5F, 6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Box 74
		bodyModel[36].setRotationPoint(-70F, -2.5F, -6.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Box 75
		bodyModel[37].setRotationPoint(-70F, -2.5F, -8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 100, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[38].setRotationPoint(-50F, -1F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 77
		bodyModel[39].setRotationPoint(-55F, -15F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 100, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[40].setRotationPoint(-50F, -15F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 80
		bodyModel[41].setRotationPoint(67.5F, 0.5F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 81
		bodyModel[42].setRotationPoint(67.5F, 0.5F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F); // Box 82
		bodyModel[43].setRotationPoint(70F, 1F, -8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, 0F, -0.25F, -0.05F); // Box 83
		bodyModel[44].setRotationPoint(72F, 0.5F, -9.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 84
		bodyModel[45].setRotationPoint(67.5F, 0.5F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F); // Box 85
		bodyModel[46].setRotationPoint(67.5F, 0.5F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F); // Box 86
		bodyModel[47].setRotationPoint(70F, 1F, 6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, -0.5F, -0.25F, -0.05F, 0F, -0.25F, -0.05F); // Box 87
		bodyModel[48].setRotationPoint(72F, 0.5F, 5.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 3, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 88
		bodyModel[49].setRotationPoint(62.5F, 0F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 91
		bodyModel[50].setRotationPoint(69F, -2.5F, 6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 92
		bodyModel[51].setRotationPoint(69F, -2.5F, 4.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 95
		bodyModel[52].setRotationPoint(69F, -2.5F, -6.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 96
		bodyModel[53].setRotationPoint(69F, -2.5F, -8.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Box 99
		bodyModel[54].setRotationPoint(68.5F, -11F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.925F, 0F, 0F, -2.015F, 0F, 0F, -2.015F, 0F, 0F, 1.925F, 0F, 0F, 1.225F, 0F, 0F, -1.35F, 0F, 0F, -1.35F, 0F, 0F, 1.225F, 0F, 0F); // Box 100
		bodyModel[55].setRotationPoint(69.85F, -7F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, -0.35F, 0F, 0F, -1.075F, 0F, 0F, 0.075F, 0F, 0F, 0.075F, 0F, 0F, -1.075F, 0F, 0F); // Box 101
		bodyModel[56].setRotationPoint(66.85F, -9F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1.3F, 0F, 0F, -1.335F, 0F, 0F, -1.335F, 0F, 0F, 1.3F, 0F, 0F); // Box 102
		bodyModel[57].setRotationPoint(68.5F, -11F, -1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 6, 8, 0F,2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Box 103
		bodyModel[58].setRotationPoint(68.5F, -11F, 1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 18, 0F,2.25F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[59].setRotationPoint(66.5F, -15F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 105
		bodyModel[60].setRotationPoint(67.85F, -9F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,1F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 106
		bodyModel[61].setRotationPoint(64.5F, -17F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0.5F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.75F, 0F); // Box 107
		bodyModel[62].setRotationPoint(62F, -18F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[63].setRotationPoint(60F, -19F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 13, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[64].setRotationPoint(47F, -19F, -9F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[65].setRotationPoint(54F, -1F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,-1.5F, -2F, 0F, -2F, 0F, -2F, -2.5F, -0.5F, 0F, -1.5F, -2F, -1F, -1.5F, 0F, 0F, -0.75F, 0F, -2F, -1.75F, 0F, 0F, -1.5F, 0F, -1F); // Box 125
		bodyModel[66].setRotationPoint(59F, -17F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-2F, -0.5F, -2F, 0F, -2F, -2F, -0.5F, -2.5F, 0F, -1.5F, -1.25F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -1F, -0.5F, 0F, -1F); // Box 126
		bodyModel[67].setRotationPoint(60F, -19F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, -2F, 0F, -0.5F, -2F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F); // Box 127
		bodyModel[68].setRotationPoint(60F, -19F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[69].setRotationPoint(55F, -15F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[70].setRotationPoint(60F, -15F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 132
		bodyModel[71].setRotationPoint(50F, -15F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 134
		bodyModel[72].setRotationPoint(47F, -20F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,-1.5F, -2F, -1F, -2.5F, -0.5F, 0F, -2F, 0F, -2F, -1.5F, -2F, 0F, -1.5F, 0F, -1F, -1.75F, 0F, 0F, -0.75F, 0F, -2F, -1.5F, 0F, 0F); // Box 147
		bodyModel[73].setRotationPoint(59F, -17F, 9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-1.5F, -1.25F, 0F, -0.5F, -2.5F, 0F, 0F, -2F, -2F, -2F, -0.5F, -2F, -0.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 148
		bodyModel[74].setRotationPoint(60F, -19F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -1F, 0F, -0.5F, -1.25F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[75].setRotationPoint(60F, -19F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[76].setRotationPoint(55F, -15F, 10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[77].setRotationPoint(60F, -15F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[78].setRotationPoint(54F, -1F, 10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[79].setRotationPoint(47F, -20F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 158
		bodyModel[80].setRotationPoint(50F, -15F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 100, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[81].setRotationPoint(-50F, -1F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 161
		bodyModel[82].setRotationPoint(-55F, -15F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 100, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[83].setRotationPoint(-50F, -15F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[84].setRotationPoint(-51F, 0F, 10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[85].setRotationPoint(-54F, -1F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[86].setRotationPoint(-54F, 2F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 166
		bodyModel[87].setRotationPoint(-54F, 1F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 469
		bodyModel[88].setRotationPoint(-54.5F, 3F, 10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 470
		bodyModel[89].setRotationPoint(-51F, 3F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 172
		bodyModel[90].setRotationPoint(-54F, 3F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 173
		bodyModel[91].setRotationPoint(-54F, 5F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[92].setRotationPoint(-54.25F, 0F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 256
		bodyModel[93].setRotationPoint(-55.25F, 2F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[94].setRotationPoint(-55.25F, 0F, 9F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[95].setRotationPoint(-50.25F, 2F, 9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[96].setRotationPoint(-50.25F, 0F, 9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[97].setRotationPoint(-54.25F, 2F, 9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 378
		bodyModel[98].setRotationPoint(-50F, -12F, 10.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 379
		bodyModel[99].setRotationPoint(-56F, -12F, 10.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[100].setRotationPoint(-55F, -2F, 10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 31, 4, 2, 0F,0F, -2F, -0.55F, 0F, -2F, -0.55F, 0F, -0.5F, -1.45F, 0F, -0.5F, -1.45F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[101].setRotationPoint(-47F, -19F, 9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 31, 3, 20, 0F,0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F); // Box 79
		bodyModel[102].setRotationPoint(-47F, -18.5F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 32, 6, 2, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 82
		bodyModel[103].setRotationPoint(-16F, -20.5F, 9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 32, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[104].setRotationPoint(-16F, -20F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 31, 4, 2, 0F,0F, -0.5F, -1.45F, 0F, -0.5F, -1.45F, 0F, -2F, -0.55F, 0F, -2F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 299
		bodyModel[105].setRotationPoint(-47F, -19F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 31, 4, 2, 0F,0F, -0.5F, -1.45F, 0F, -0.5F, -1.45F, 0F, -2F, -0.55F, 0F, -2F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 196
		bodyModel[106].setRotationPoint(16F, -19F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 31, 3, 20, 0F,0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F); // Box 197
		bodyModel[107].setRotationPoint(16F, -18.5F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 31, 4, 2, 0F,0F, -2F, -0.55F, 0F, -2F, -0.55F, 0F, -0.5F, -1.45F, 0F, -0.5F, -1.45F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[108].setRotationPoint(16F, -19F, 9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 32, 6, 2, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 199
		bodyModel[109].setRotationPoint(-16F, -20.5F, -11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 200
		bodyModel[110].setRotationPoint(-51F, 0F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[111].setRotationPoint(-54F, -1F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[112].setRotationPoint(-54F, 2F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[113].setRotationPoint(-54F, 1F, -12F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 204
		bodyModel[114].setRotationPoint(-54.5F, 3F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 205
		bodyModel[115].setRotationPoint(-51F, 3F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[116].setRotationPoint(-54F, 3F, -12F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[117].setRotationPoint(-54F, 5F, -12F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[118].setRotationPoint(-54.25F, 0F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 209
		bodyModel[119].setRotationPoint(-55.25F, 2F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 210
		bodyModel[120].setRotationPoint(-55.25F, 0F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 211
		bodyModel[121].setRotationPoint(-50.25F, 2F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 212
		bodyModel[122].setRotationPoint(-50.25F, 0F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 213
		bodyModel[123].setRotationPoint(-54.25F, 2F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 214
		bodyModel[124].setRotationPoint(-50F, -12F, -11.75F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 215
		bodyModel[125].setRotationPoint(-56F, -12F, -11.75F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[126].setRotationPoint(-55F, -2F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[127].setRotationPoint(50F, 0F, 10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[128].setRotationPoint(50F, -1F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[129].setRotationPoint(50F, 2F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 220
		bodyModel[130].setRotationPoint(50F, 1F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 221
		bodyModel[131].setRotationPoint(53.5F, 3F, 10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 222
		bodyModel[132].setRotationPoint(50F, 3F, 10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 223
		bodyModel[133].setRotationPoint(50F, 3F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 224
		bodyModel[134].setRotationPoint(50F, 5F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[135].setRotationPoint(50.25F, 0F, 9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[136].setRotationPoint(54.25F, 2F, 9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[137].setRotationPoint(54.25F, 0F, 9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 228
		bodyModel[138].setRotationPoint(49.25F, 2F, 9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[139].setRotationPoint(49.25F, 0F, 9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[140].setRotationPoint(50.25F, 2F, 9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 231
		bodyModel[141].setRotationPoint(49F, -12F, 10.75F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 232
		bodyModel[142].setRotationPoint(55F, -12F, 10.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[143].setRotationPoint(50F, -2F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[144].setRotationPoint(50F, 0F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[145].setRotationPoint(50F, -1F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[146].setRotationPoint(50F, 2F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 237
		bodyModel[147].setRotationPoint(50F, 1F, -12F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 238
		bodyModel[148].setRotationPoint(53.5F, 3F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 239
		bodyModel[149].setRotationPoint(50F, 3F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 240
		bodyModel[150].setRotationPoint(50F, 3F, -12F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 241
		bodyModel[151].setRotationPoint(50F, 5F, -12F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[152].setRotationPoint(50.25F, 0F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 243
		bodyModel[153].setRotationPoint(54.25F, 2F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 244
		bodyModel[154].setRotationPoint(54.25F, 0F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 245
		bodyModel[155].setRotationPoint(49.25F, 2F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 246
		bodyModel[156].setRotationPoint(49.25F, 0F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 247
		bodyModel[157].setRotationPoint(50.25F, 2F, -10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 248
		bodyModel[158].setRotationPoint(49F, -12F, -11.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 249
		bodyModel[159].setRotationPoint(55F, -12F, -11.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[160].setRotationPoint(50F, -2F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[161].setRotationPoint(-18F, 0F, -9.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[162].setRotationPoint(-18F, 5F, -9.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 15, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[163].setRotationPoint(-7F, 0F, -9.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[164].setRotationPoint(-7F, 6F, -9.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[165].setRotationPoint(8F, 0F, -9.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 6, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[166].setRotationPoint(-18F, 0F, -0.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 6, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 228
		bodyModel[167].setRotationPoint(-18F, 5F, -1.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 15, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[168].setRotationPoint(-7F, 0F, 0.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 15, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 230
		bodyModel[169].setRotationPoint(-7F, 6F, 0.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[170].setRotationPoint(8F, 0F, -7.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -2F, 0F); // Box 239
		bodyModel[171].setRotationPoint(8F, 0F, 7.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F); // Box 262
		bodyModel[172].setRotationPoint(-11F, 0F, 7.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 263
		bodyModel[173].setRotationPoint(-11F, 0F, -7.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 264
		bodyModel[174].setRotationPoint(-11F, 0F, -9.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[175].setRotationPoint(12F, 0F, -9.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[176].setRotationPoint(12F, 0F, 5.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 247
		bodyModel[177].setRotationPoint(18.5F, 5F, -10F);
		bodyModel[177].rotateAngleZ = 1.57079633F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[178].setRotationPoint(17.5F, 5F, -10F);
		bodyModel[178].rotateAngleZ = 1.57079633F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[179].setRotationPoint(17.5F, 5F, -8F);
		bodyModel[179].rotateAngleZ = 1.57079633F;

		bodyModel[180].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 250
		bodyModel[180].setRotationPoint(18.5F, 5F, -8F);
		bodyModel[180].rotateAngleZ = 1.57079633F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 251
		bodyModel[181].setRotationPoint(19.5F, 5F, -8F);
		bodyModel[181].rotateAngleZ = 1.57079633F;

		bodyModel[182].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 252
		bodyModel[182].setRotationPoint(17.5F, 5F, -9F);
		bodyModel[182].rotateAngleZ = 1.57079633F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[183].setRotationPoint(19.5F, 5F, -10F);
		bodyModel[183].rotateAngleZ = 1.57079633F;

		bodyModel[184].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 261
		bodyModel[184].setRotationPoint(18.5F, 5F, 9F);
		bodyModel[184].rotateAngleZ = 1.57079633F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[185].setRotationPoint(17.5F, 5F, 9F);
		bodyModel[185].rotateAngleZ = 1.57079633F;

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[186].setRotationPoint(17.5F, 5F, 7F);
		bodyModel[186].rotateAngleZ = 1.57079633F;

		bodyModel[187].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 264
		bodyModel[187].setRotationPoint(18.5F, 5F, 7F);
		bodyModel[187].rotateAngleZ = 1.57079633F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[188].setRotationPoint(19.5F, 5F, 7F);
		bodyModel[188].rotateAngleZ = 1.57079633F;

		bodyModel[189].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Box 266
		bodyModel[189].setRotationPoint(17.5F, 5F, 8F);
		bodyModel[189].rotateAngleZ = 1.57079633F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 267
		bodyModel[190].setRotationPoint(19.5F, 5F, 9F);
		bodyModel[190].rotateAngleZ = 1.57079633F;

		bodyModel[191].addShapeBox(0F, 0F, 0F, 132, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[191].setRotationPoint(-66F, -2F, -10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[192].setRotationPoint(-66.5F, -8F, 8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[193].setRotationPoint(-66.5F, -8F, -9F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[194].setRotationPoint(-66.5F, -8F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[195].setRotationPoint(-66.5F, -8F, 2F);

		bodyModel[196].addShapeBox(0F, 1F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.35F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[196].setRotationPoint(-65.5F, -11F, 9F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,0F, -1F, 0F, -2F, -1F, -3F, -2F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -3F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 370
		bodyModel[197].setRotationPoint(-66.5F, -11F, 6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 371
		bodyModel[198].setRotationPoint(-66.5F, -11F, 2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -2F, -1F, -1F, 0F); // Box 373
		bodyModel[199].setRotationPoint(-66.5F, -11F, 0F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,-3F, -1F, -3F, -1F, -1F, -3F, -4F, -1F, 0F, 0F, -1F, 0F, -4F, -1F, -3F, 0F, -1F, -3F, -3F, -1F, 0F, -1F, -1F, 0F); // Box 390
		bodyModel[200].setRotationPoint(-65.5F, -11F, -6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[201].setRotationPoint(-66.5F, -10F, -4F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[202].setRotationPoint(-66.5F, -10F, -4F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[203].setRotationPoint(-64.5F, -8F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F); // Box 290
		bodyModel[204].setRotationPoint(-68.5F, -8F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F); // Box 291
		bodyModel[205].setRotationPoint(-67.5F, -10F, -9F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[206].setRotationPoint(-64.5F, -8F, 9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F); // Box 293
		bodyModel[207].setRotationPoint(-68.5F, -8F, 9F);

		bodyModel[208].addShapeBox(0F, 1F, 0F, 2, 2, 1, 0F,-0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -1.75F, 0F, -0.7F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 294
		bodyModel[208].setRotationPoint(-67.5F, -11F, 9F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[209].setRotationPoint(-66.5F, -7F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 305
		bodyModel[210].setRotationPoint(-67F, -2F, -10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 306
		bodyModel[211].setRotationPoint(66F, -2F, -10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 5, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[212].setRotationPoint(61.5F, -8F, 0F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[213].setRotationPoint(64.5F, -8F, 9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[214].setRotationPoint(61.5F, -8F, 9F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[215].setRotationPoint(66.5F, -10F, -9F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[216].setRotationPoint(61.5F, -10F, 3F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-2F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -1F, -1F, -2F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 312
		bodyModel[217].setRotationPoint(63.5F, -11F, -2F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 313
		bodyModel[218].setRotationPoint(62.5F, -10F, 0F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,-4F, -1F, 0F, 0F, -1F, 0F, -3F, -1F, -3F, -1F, -1F, -3F, -3F, -1F, 0F, -1F, -1F, 0F, -4F, -1F, -3F, 0F, -1F, -3F); // Box 314
		bodyModel[219].setRotationPoint(61.5F, -11F, 0F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 315
		bodyModel[220].setRotationPoint(65.5F, -11F, -6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, -3F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, -3F); // Box 316
		bodyModel[221].setRotationPoint(62.5F, -11F, -9F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 317
		bodyModel[222].setRotationPoint(61.5F, -8F, -8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[223].setRotationPoint(62.5F, -8F, -6F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[224].setRotationPoint(61.5F, -8F, -2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[225].setRotationPoint(65.5F, -7F, -8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[226].setRotationPoint(61.5F, -8F, -10F);

		bodyModel[227].addShapeBox(0F, 1F, 0F, 2, 2, 1, 0F,-1F, 0F, -0.35F, 0F, 0F, -0.6F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[227].setRotationPoint(63.5F, -11F, -10F);

		bodyModel[228].addShapeBox(0F, 1F, 0F, 2, 2, 1, 0F,0F, 0F, -0.65F, -1.75F, 0F, -0.7F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[228].setRotationPoint(65.5F, -11F, -10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2.75F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[229].setRotationPoint(64.5F, -8F, -10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[230].setRotationPoint(61.5F, -8F, -9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 13, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[231].setRotationPoint(-47F, -15F, -10F);

		bodyModel[232].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 205
		bodyModel[232].setRotationPoint(-61F, -5F, 1.5F);

		bodyModel[233].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 206
		bodyModel[233].setRotationPoint(-56F, -6F, 6.5F);
		bodyModel[233].rotateAngleX = 1.30899694F;
		bodyModel[233].rotateAngleY = -1.57079633F;

		bodyModel[234].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 207
		bodyModel[234].setRotationPoint(-60F, -4F, 2.5F);

		bodyModel[235].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 208
		bodyModel[235].setRotationPoint(-56.5F, -4F, 4.5F);
		bodyModel[235].rotateAngleX = 1.04719755F;
		bodyModel[235].rotateAngleY = -1.57079633F;

		bodyModel[236].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 406
		bodyModel[236].setRotationPoint(-61F, -5F, -7.5F);

		bodyModel[237].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 407
		bodyModel[237].setRotationPoint(-60F, -4F, -6.5F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 408
		bodyModel[238].setRotationPoint(-56.5F, -4F, -4.5F);
		bodyModel[238].rotateAngleX = 1.04719755F;
		bodyModel[238].rotateAngleY = -1.57079633F;

		bodyModel[239].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 409
		bodyModel[239].setRotationPoint(-56F, -6F, -2.5F);
		bodyModel[239].rotateAngleX = 1.30899694F;
		bodyModel[239].rotateAngleY = -1.57079633F;

		bodyModel[240].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 336
		bodyModel[240].setRotationPoint(57F, -4F, -5.5F);

		bodyModel[241].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 337
		bodyModel[241].setRotationPoint(56F, -5F, -6.5F);

		bodyModel[242].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 338
		bodyModel[242].setRotationPoint(55F, -6F, -1.5F);
		bodyModel[242].rotateAngleX = 1.69296937F;
		bodyModel[242].rotateAngleY = -1.57079633F;

		bodyModel[243].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 339
		bodyModel[243].setRotationPoint(55.5F, -4F, -3.5F);
		bodyModel[243].rotateAngleX = 2.0943951F;
		bodyModel[243].rotateAngleY = -1.57079633F;

		bodyModel[244].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 434
		bodyModel[244].setRotationPoint(56F, -5F, 3.5F);

		bodyModel[245].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 435
		bodyModel[245].setRotationPoint(57F, -4F, 4.5F);

		bodyModel[246].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 436
		bodyModel[246].setRotationPoint(55.5F, -4F, 6.5F);
		bodyModel[246].rotateAngleX = 2.0943951F;
		bodyModel[246].rotateAngleY = -1.57079633F;

		bodyModel[247].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 437
		bodyModel[247].setRotationPoint(55F, -6F, 8.5F);
		bodyModel[247].rotateAngleX = 1.69296937F;
		bodyModel[247].rotateAngleY = -1.57079633F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 13, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[248].setRotationPoint(46F, -15F, -10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 344
		bodyModel[249].setRotationPoint(-60F, -19F, -11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[250].setRotationPoint(47F, -19F, 9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 1F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 346
		bodyModel[251].setRotationPoint(47F, -19F, -11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 297
		bodyModel[252].setRotationPoint(37F, -30.75F, 5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[253].setRotationPoint(37F, -30.75F, -5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 299
		bodyModel[254].setRotationPoint(34F, -29.75F, 4F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[255].setRotationPoint(34F, -30.75F, -5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 301
		bodyModel[256].setRotationPoint(34F, -30.75F, 5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.05F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -2F, -2F, -0.05F, 2F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 2F, -2F); // Box 302
		bodyModel[257].setRotationPoint(19.2F, -26F, 2F);
		bodyModel[257].rotateAngleZ = 0.26179939F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 303
		bodyModel[258].setRotationPoint(20F, -23F, -1F);
		bodyModel[258].rotateAngleZ = -0.10471976F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.05F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -2F, 2F, -0.05F, 2F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 2F, 2F); // Box 304
		bodyModel[259].setRotationPoint(19.2F, -26F, -3F);
		bodyModel[259].rotateAngleZ = 0.26179939F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F); // Box 305
		bodyModel[260].setRotationPoint(20.5F, -22.75F, -0.5F);
		bodyModel[260].rotateAngleZ = -0.27925268F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Box 306
		bodyModel[261].setRotationPoint(31.05F, -20F, -0.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[262].setRotationPoint(36F, -21F, -4F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[263].setRotationPoint(36.5F, -20.5F, -3F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[264].setRotationPoint(37F, -30.75F, -7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 310
		bodyModel[265].setRotationPoint(34F, -29.75F, -5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[266].setRotationPoint(34F, -30.75F, -7F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[267].setRotationPoint(36.5F, -20.5F, 2F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[268].setRotationPoint(-37.5F, -20.5F, -3F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[269].setRotationPoint(-38F, -21F, -4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 275
		bodyModel[270].setRotationPoint(-39F, -21.75F, -5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[271].setRotationPoint(-39F, -22.75F, -5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[272].setRotationPoint(-39F, -22.75F, -7F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[273].setRotationPoint(-36F, -22.75F, -7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[274].setRotationPoint(-36F, -22.75F, -5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[275].setRotationPoint(-37.5F, -20.5F, 2F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 281
		bodyModel[276].setRotationPoint(-39F, -21.75F, 4F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 282
		bodyModel[277].setRotationPoint(-39F, -22.75F, 5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 283
		bodyModel[278].setRotationPoint(-36F, -22.75F, 5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, -0.05F, -2F, 2F, -0.05F, -2F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 2F, 2F, -0.05F, 2F, -2F, -1F, 0F, 0F); // Box 284
		bodyModel[279].setRotationPoint(-36.2F, -22F, 2F);
		bodyModel[279].rotateAngleZ = 0.08726646F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, -0.05F, -2F, -2F, -0.05F, -2F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 2F, -2F, -0.05F, 2F, 2F, -1F, 0F, 0F); // Box 285
		bodyModel[280].setRotationPoint(-36.2F, -22F, -3F);
		bodyModel[280].rotateAngleZ = 0.08726646F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[281].setRotationPoint(-31.5F, -20.25F, -0.5F);
		bodyModel[281].rotateAngleZ = -0.03490659F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Box 288
		bodyModel[282].setRotationPoint(-32.05F, -20F, -0.5F);

		bodyModel[283].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 235
		bodyModel[283].setRotationPoint(-20.5F, -20.5F, -3.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[284].setRotationPoint(-37.5F, -20.51F, -3.5F);

		bodyModel[285].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 324
		bodyModel[285].setRotationPoint(-14.5F, -21.5F, -3.5F);

		bodyModel[286].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 325
		bodyModel[286].setRotationPoint(-9.5F, -21.5F, -0.5F);

		bodyModel[287].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 326
		bodyModel[287].setRotationPoint(0.5F, -21.5F, -0.5F);

		bodyModel[288].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 327
		bodyModel[288].setRotationPoint(8.5F, -21.5F, -0.5F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 328
		bodyModel[289].setRotationPoint(13.5F, -21.5F, 2.5F);

		bodyModel[290].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 329
		bodyModel[290].setRotationPoint(20.5F, -20.5F, 2.5F);

		bodyModel[291].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 330
		bodyModel[291].setRotationPoint(28.5F, -20.5F, 2.5F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 331
		bodyModel[292].setRotationPoint(-28F, -20.5F, -3.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 332
		bodyModel[293].setRotationPoint(-19.5F, -20.51F, -3.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[294].setRotationPoint(-8.5F, -21.51F, -0.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[295].setRotationPoint(20.5F, -20.51F, 2.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F); // Box 337
		bodyModel[296].setRotationPoint(9.5F, -21.51F, 2.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[297].setRotationPoint(13.5F, -21.51F, 2.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 339
		bodyModel[298].setRotationPoint(14.5F, -21.51F, 2.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,-5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 151
		bodyModel[299].setRotationPoint(-68F, 5F, -9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-4.5F, 0F, 0F, 4.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, -0.5F, 0F, 5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 158
		bodyModel[300].setRotationPoint(-68F, 3.5F, -9F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 268
		bodyModel[301].setRotationPoint(-65.5F, 3F, -4.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 392
		bodyModel[302].setRotationPoint(-68F, 5F, 0F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 5F, -0.5F, 0F, -5F, -0.5F, 0F); // Box 393
		bodyModel[303].setRotationPoint(-68F, 3.5F, 0F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 394
		bodyModel[304].setRotationPoint(67F, 5F, 0F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, 5F, -0.5F, 0F); // Box 395
		bodyModel[305].setRotationPoint(67F, 3.5F, 0F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,4.5F, 0F, 0F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 5F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 396
		bodyModel[306].setRotationPoint(67F, 3.5F, -9F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 397
		bodyModel[307].setRotationPoint(67F, 5F, -9F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 398
		bodyModel[308].setRotationPoint(63.5F, 3F, -4.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 181
		bodyModel[309].setRotationPoint(-62F, -20F, -6.25F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[310].setRotationPoint(-60F, -20F, -6.25F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 435
		bodyModel[311].setRotationPoint(-62F, -20F, 5.25F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[312].setRotationPoint(-60F, -20F, 5.25F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[313].setRotationPoint(59F, -20F, -6.25F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 410
		bodyModel[314].setRotationPoint(60F, -20F, -6.25F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[315].setRotationPoint(59F, -20F, 5.25F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 412
		bodyModel[316].setRotationPoint(60F, -20F, 5.25F);

		bodyModel[317].addBox(-0.5F, -0.5F, 0F, 8, 3, 4, 0F); // Box 415
		bodyModel[317].setRotationPoint(36F, 0F, -2F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[318].setRotationPoint(-63F, -15F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 425
		bodyModel[319].setRotationPoint(46F, -22.75F, 5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[320].setRotationPoint(46F, -22.75F, -5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 427
		bodyModel[321].setRotationPoint(43F, -21.75F, 4F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 428
		bodyModel[322].setRotationPoint(43F, -22.75F, 5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[323].setRotationPoint(43F, -22.75F, -5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[324].setRotationPoint(43F, -22.75F, -7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 431
		bodyModel[325].setRotationPoint(46F, -22.75F, -7F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 432
		bodyModel[326].setRotationPoint(43F, -21.75F, -5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, -0.05F, -2F, -2F, -0.05F, -2F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 2F, -2F, -0.05F, 2F, 2F, -1F, 0F, 0F); // Box 433
		bodyModel[327].setRotationPoint(45.8F, -22F, -3F);
		bodyModel[327].rotateAngleZ = 0.08726646F;

		bodyModel[328].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, -0.05F, -2F, 2F, -0.05F, -2F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 2F, 2F, -0.05F, 2F, -2F, -1F, 0F, 0F); // Box 434
		bodyModel[328].setRotationPoint(45.8F, -22F, 2F);
		bodyModel[328].rotateAngleZ = 0.08726646F;

		bodyModel[329].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[329].setRotationPoint(50.5F, -20.25F, -0.5F);
		bodyModel[329].rotateAngleZ = -0.03490659F;

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F); // Box 436
		bodyModel[330].setRotationPoint(49.95F, -20F, -0.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		bodyModel[331].setRotationPoint(44.5F, -20.5F, 2F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[332].setRotationPoint(44.5F, -20.5F, -3F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[333].setRotationPoint(44F, -21F, -4F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[334].setRotationPoint(8.5F, -21.51F, -0.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[335].setRotationPoint(-14.5F, -21.51F, -3.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[336].setRotationPoint(-9.5F, -21.51F, -0.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 8, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[337].setRotationPoint(37.5F, -20.51F, 2.5F);

		bodyModel[338].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 445
		bodyModel[338].setRotationPoint(13.5F, -21.5F, -3.5F);

		bodyModel[339].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 446
		bodyModel[339].setRotationPoint(20.5F, -20.5F, -3.5F);

		bodyModel[340].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 447
		bodyModel[340].setRotationPoint(28.5F, -20.5F, -3.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[341].setRotationPoint(20.5F, -20.51F, -3.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 6, 0, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[342].setRotationPoint(14.5F, -21.51F, -3.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 8, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[343].setRotationPoint(37.5F, -20.51F, -3.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 8, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[344].setRotationPoint(-45.5F, -20.51F, -3.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box59
		bodyModel[345].setRotationPoint(-47F, -22.75F, -5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box60
		bodyModel[346].setRotationPoint(-47F, -22.75F, 5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box63
		bodyModel[347].setRotationPoint(-47F, -22.75F, -7F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box65
		bodyModel[348].setRotationPoint(-47F, -21.75F, 4F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		bodyModel[349].setRotationPoint(-47F, -21.75F, -5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[350].setRotationPoint(-44F, -22.75F, -5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[351].setRotationPoint(-44F, -22.75F, -7F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 130
		bodyModel[352].setRotationPoint(-44F, -22.75F, 5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[353].setRotationPoint(-46F, -21F, -4F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[354].setRotationPoint(-45.5F, -20.5F, -3F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[355].setRotationPoint(-45.5F, -20.5F, 2F);

		bodyModel[356].addShapeBox(-11F, 0F, 0F, 11, 1, 1, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 271
		bodyModel[356].setRotationPoint(-51.05F, -20.25F, -0.5F);
		bodyModel[356].rotateAngleZ = 0.05235988F;

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, -0.5F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F); // Box 272
		bodyModel[357].setRotationPoint(-51.5F, -20F, -0.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[358].setRotationPoint(-37F, -21.25F, -1F);
		bodyModel[358].rotateAngleZ = -0.08726646F;

		bodyModel[359].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[359].setRotationPoint(45F, -21.25F, -1F);
		bodyModel[359].rotateAngleZ = -0.08726646F;

		bodyModel[360].addShapeBox(-16F, 0F, 0F, 16, 1, 1, 0F,-0.05F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -2F, -2F, -0.05F, 2F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 2F, -2F); // Box 473
		bodyModel[360].setRotationPoint(-46.2F, -22F, 2F);
		bodyModel[360].rotateAngleZ = -0.08726646F;

		bodyModel[361].addShapeBox(-16F, 0F, 0F, 16, 1, 1, 0F,-0.05F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -2F, 2F, -0.05F, 2F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 2F, 2F); // Box 474
		bodyModel[361].setRotationPoint(-46.2F, -22F, -3F);
		bodyModel[361].rotateAngleZ = -0.08726646F;

		bodyModel[362].addShapeBox(-17F, 0F, 0F, 17, 1, 2, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 475
		bodyModel[362].setRotationPoint(-45.5F, -21.25F, -1F);
		bodyModel[362].rotateAngleZ = 0.08726646F;

		bodyModel[363].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 476
		bodyModel[363].setRotationPoint(-20.5F, -20.5F, 2.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 18, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		bodyModel[364].setRotationPoint(-37.5F, -20.51F, 2.5F);

		bodyModel[365].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 478
		bodyModel[365].setRotationPoint(-14.5F, -21.5F, 2.5F);

		bodyModel[366].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 479
		bodyModel[366].setRotationPoint(-28F, -20.5F, 2.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[367].setRotationPoint(-19.5F, -20.51F, 2.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 8, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		bodyModel[368].setRotationPoint(-45.5F, -20.51F, 2.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 29, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[369].setRotationPoint(-14.5F, -21.51F, 2.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 5, 0, 1, 0F,-1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 483
		bodyModel[370].setRotationPoint(-14.5F, -21.51F, -3.5F);

		bodyModel[371].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 484
		bodyModel[371].setRotationPoint(3.5F, -21.5F, 2.5F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 485
		bodyModel[372].setRotationPoint(-6.5F, -21.5F, 2.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 29, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[373].setRotationPoint(-14.5F, -21.51F, -3.5F);

		bodyModel[374].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 487
		bodyModel[374].setRotationPoint(3.5F, -21.5F, -3.5F);

		bodyModel[375].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 488
		bodyModel[375].setRotationPoint(-6.5F, -21.5F, -3.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[376].setRotationPoint(-42.5F, 0F, -9.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 223
		bodyModel[377].setRotationPoint(-49.5F, 0F, -9.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[378].setRotationPoint(-42.5F, 0F, 8.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 273
		bodyModel[379].setRotationPoint(-49.5F, 0F, 8.5F);

		bodyModel[380].addBox(-0.5F, -0.5F, 0F, 8, 2, 4, 0F); // Box 398
		bodyModel[380].setRotationPoint(-44F, 1F, -2F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[381].setRotationPoint(41.5F, 0F, 8.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[382].setRotationPoint(48.5F, 0F, 8.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[383].setRotationPoint(41.5F, 0F, -9.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[384].setRotationPoint(48.5F, 0F, -9.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[385].setRotationPoint(-69.5F, -5F, -9F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[386].setRotationPoint(-69.5F, -3F, -4F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[387].setRotationPoint(-69.5F, -3F, -5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 492
		bodyModel[388].setRotationPoint(-69.5F, -3F, -9F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[389].setRotationPoint(-65.5F, -5F, -11F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[390].setRotationPoint(-69.5F, -1F, -8.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 500
		bodyModel[391].setRotationPoint(-69.5F, -3F, -8.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 501
		bodyModel[392].setRotationPoint(-69.5F, -3F, 4F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[393].setRotationPoint(-69.5F, -3F, 8F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[394].setRotationPoint(-69.5F, -1F, 4.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 504
		bodyModel[395].setRotationPoint(-69.5F, -3F, 4.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 506
		bodyModel[396].setRotationPoint(-69F, -3F, 4.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 507
		bodyModel[397].setRotationPoint(-71.5F, -0.6F, -9F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 508
		bodyModel[398].setRotationPoint(-71.5F, -0.6F, 4F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 509
		bodyModel[399].setRotationPoint(-71.5F, -0.6F, -1F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 510
		bodyModel[400].setRotationPoint(-68.5F, 0F, -9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[401].setRotationPoint(-63F, 3F, -11F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[402].setRotationPoint(-61F, 3F, -11F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 513
		bodyModel[403].setRotationPoint(-69F, 0F, -11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 514
		bodyModel[404].setRotationPoint(-66F, -11F, -11F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[405].setRotationPoint(-63F, -11F, -11F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 517
		bodyModel[406].setRotationPoint(-66.5F, -5F, -11F);

		bodyModel[407].addShapeBox(0F, 1F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 518
		bodyModel[407].setRotationPoint(-71.5F, -1F, -9.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 519
		bodyModel[408].setRotationPoint(-69F, -3F, -8.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 520
		bodyModel[409].setRotationPoint(-69F, -1F, -11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[410].setRotationPoint(-69.5F, -4F, -11F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[411].setRotationPoint(-69.5F, -5F, -11F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -1F, 0F, 0F, 2F, 0F, -2F, -6F, 0F, -2F, -5F, 0F, 0F, 1F, 0F, 0F); // Box 523
		bodyModel[412].setRotationPoint(-67.5F, -11F, -11F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -5F, 0F, -1F, 2F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, 0F); // Box 524
		bodyModel[413].setRotationPoint(-65.5F, -15F, -11F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.375F, -0.75F, 0F, -0.375F, 0.25F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0.25F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 525
		bodyModel[414].setRotationPoint(-71.5F, -0.6F, -10F);

		bodyModel[415].addShapeBox(0F, 1F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 526
		bodyModel[415].setRotationPoint(-69F, -1F, -9.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[416].setRotationPoint(-71F, 5F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[417].setRotationPoint(-71F, 2F, -11F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[418].setRotationPoint(-66F, 0F, -10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[419].setRotationPoint(-65.5F, -5F, 10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 531
		bodyModel[420].setRotationPoint(-66F, -11F, 10F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		bodyModel[421].setRotationPoint(-63F, -11F, 10F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 534
		bodyModel[422].setRotationPoint(-66.5F, -5F, 10F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[423].setRotationPoint(-63F, 3F, 10F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[424].setRotationPoint(-61F, 3F, 10F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F); // Box 537
		bodyModel[425].setRotationPoint(-69F, 0F, 9F);

		bodyModel[426].addShapeBox(0F, 1F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 538
		bodyModel[426].setRotationPoint(-71.5F, -1F, 8.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F); // Box 539
		bodyModel[427].setRotationPoint(-69F, -1F, 9F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0.25F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0.25F, 0F, -0.375F, -0.75F); // Box 540
		bodyModel[428].setRotationPoint(-71.5F, -0.6F, 9F);

		bodyModel[429].addShapeBox(0F, 1F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 541
		bodyModel[429].setRotationPoint(-69F, -1F, 8.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 542
		bodyModel[430].setRotationPoint(-71F, 5F, 9F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 543
		bodyModel[431].setRotationPoint(-71F, 2F, 9F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		bodyModel[432].setRotationPoint(-66F, 0F, 9F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F); // Box 545
		bodyModel[433].setRotationPoint(-69.5F, -4F, 9F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,-4.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -4.5F, 0F, -1F, 2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F); // Box 546
		bodyModel[434].setRotationPoint(-67.5F, -11F, -11F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F); // Box 547
		bodyModel[435].setRotationPoint(-69.5F, -5F, 9F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,-1F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 548
		bodyModel[436].setRotationPoint(-67.5F, -11F, 9F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-1.25F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, -0.25F, 0F, -2F, -2.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 549
		bodyModel[437].setRotationPoint(-65.5F, -15F, 9F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.25F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, -1F, -1.25F, 0F, 0F, 2F, 0F, -2F, -6F, 0F, -2F, -5F, 0F, 0F, 1F, 0F, 0F); // Box 550
		bodyModel[438].setRotationPoint(-65.5F, -15F, -11F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-1.25F, 0F, 0F, -2.75F, 0F, 0F, -3.75F, 0F, -2F, -0.25F, 0F, -2F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 2F, 0F, -2F); // Box 551
		bodyModel[439].setRotationPoint(-65.5F, -15F, 9F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,-1F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 2F, 0F, -2F); // Box 552
		bodyModel[440].setRotationPoint(-67.5F, -11F, 9F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[441].setRotationPoint(-69.5F, -5F, -11F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F); // Box 554
		bodyModel[442].setRotationPoint(-69.5F, -5F, 9F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 555
		bodyModel[443].setRotationPoint(59F, 3F, 10F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 556
		bodyModel[444].setRotationPoint(61F, 3F, 10F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F); // Box 558
		bodyModel[445].setRotationPoint(66F, 0F, 9F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F); // Box 559
		bodyModel[446].setRotationPoint(66F, -1F, 9F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0.25F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0.25F); // Box 560
		bodyModel[447].setRotationPoint(68.5F, -0.6F, 9F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 561
		bodyModel[448].setRotationPoint(69.5F, -0.6F, 4F);

		bodyModel[449].addShapeBox(0F, 1F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 562
		bodyModel[449].setRotationPoint(70.5F, -1F, 8.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 563
		bodyModel[450].setRotationPoint(68F, 5F, 9F);

		bodyModel[451].addShapeBox(0F, 1F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 564
		bodyModel[451].setRotationPoint(68F, -1F, 8.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.75F, -0.5F, -0.6F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 565
		bodyModel[452].setRotationPoint(68F, 2F, 9F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[453].setRotationPoint(68.5F, -1F, 4.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 567
		bodyModel[454].setRotationPoint(67.5F, -3F, 4F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 568
		bodyModel[455].setRotationPoint(68.5F, -3F, 4.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		bodyModel[456].setRotationPoint(67.5F, -3F, 8F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F); // Box 570
		bodyModel[457].setRotationPoint(65.5F, -4F, 9F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F); // Box 571
		bodyModel[458].setRotationPoint(65.5F, -5F, 9F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F); // Box 572
		bodyModel[459].setRotationPoint(65.5F, -5F, 9F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 573
		bodyModel[460].setRotationPoint(62.5F, -5F, 10F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 574
		bodyModel[461].setRotationPoint(65.5F, -5F, 10F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 575
		bodyModel[462].setRotationPoint(63F, -11F, 10F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, 0F); // Box 576
		bodyModel[463].setRotationPoint(63.5F, -11F, 9F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, -2F, -6F, 0F, -2F); // Box 577
		bodyModel[464].setRotationPoint(63.5F, -11F, 9F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,1F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, 1F, 0F, 0F, 2F, 0F, -2F, -1.5F, 0F, 0F); // Box 578
		bodyModel[465].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,1F, 0F, -1F, -1.25F, 0F, 0F, -0.25F, 0F, -2F, 1F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, -2F, -6F, 0F, -2F); // Box 579
		bodyModel[466].setRotationPoint(61.5F, -15F, 9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 580
		bodyModel[467].setRotationPoint(60F, -11F, 10F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		bodyModel[468].setRotationPoint(63F, 0F, 9F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 582
		bodyModel[469].setRotationPoint(63F, 0F, -10F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 583
		bodyModel[470].setRotationPoint(59F, 3F, -11F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[471].setRotationPoint(61F, 3F, -11F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 3, 9, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 585
		bodyModel[472].setRotationPoint(62.5F, -5F, -11F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[473].setRotationPoint(60F, -11F, -11F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[474].setRotationPoint(63F, -11F, -11F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,-4F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -2F, 1F, 0F, 0F, -2F, 0F, -1F); // Box 588
		bodyModel[475].setRotationPoint(63.5F, -11F, -11F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0.5F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0.5F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 589
		bodyModel[476].setRotationPoint(63.5F, -11F, -11F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-3.75F, 0F, -2F, -0.25F, 0F, -2F, -1.25F, 0F, 0F, -2.75F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, -2F, 1F, 0F, 0F, -1.5F, 0F, -1F); // Box 590
		bodyModel[477].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,1F, 0F, 0F, -0.25F, 0F, -2F, -1.25F, 0F, 0F, 1F, 0F, -1F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, -1.5F, 0F, -1F); // Box 591
		bodyModel[478].setRotationPoint(61.5F, -15F, -11F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 592
		bodyModel[479].setRotationPoint(65.5F, -5F, -11F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-4F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 593
		bodyModel[480].setRotationPoint(65.5F, -5F, -11F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 594
		bodyModel[481].setRotationPoint(65.5F, -4F, -11F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[482].setRotationPoint(65.5F, -5F, -11F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 597
		bodyModel[483].setRotationPoint(66F, 0F, -11F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 598
		bodyModel[484].setRotationPoint(66F, -1F, -11F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.375F, 0.25F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0.25F, 0F, -0.375F, -0.75F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 599
		bodyModel[485].setRotationPoint(68.5F, -0.6F, -10F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 600
		bodyModel[486].setRotationPoint(69.5F, -0.6F, -9F);

		bodyModel[487].addShapeBox(0F, 1F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 601
		bodyModel[487].setRotationPoint(70.5F, -1F, -9.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 602
		bodyModel[488].setRotationPoint(68F, 2F, -11F);

		bodyModel[489].addShapeBox(0F, 1F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 603
		bodyModel[489].setRotationPoint(68F, -1F, -9.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, -0.6F, -0.75F, 0F, -0.6F, -0.75F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[490].setRotationPoint(68F, 5F, -11F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 605
		bodyModel[491].setRotationPoint(67.5F, -3F, -4F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 606
		bodyModel[492].setRotationPoint(67.5F, -5F, -9F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 607
		bodyModel[493].setRotationPoint(68.5F, -3F, -8.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 608
		bodyModel[494].setRotationPoint(67.5F, -3F, -9F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 609
		bodyModel[495].setRotationPoint(68.5F, -1F, -8.5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 610
		bodyModel[496].setRotationPoint(67.5F, -3F, -5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 611
		bodyModel[497].setRotationPoint(68F, -3F, -8.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 612
		bodyModel[498].setRotationPoint(68F, -3F, 4.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[499].setRotationPoint(-66F, -4F, -11F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 19, 23, textureX, textureY); // Box 532
		bodyModel[501] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 557
		bodyModel[502] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 595
		bodyModel[503] = new ModelRendererTurbo(this, 93, 297, textureX, textureY); // Box 672
		bodyModel[504] = new ModelRendererTurbo(this, 93, 300, textureX, textureY); // Box 673
		bodyModel[505] = new ModelRendererTurbo(this, 93, 297, textureX, textureY); // Box 674
		bodyModel[506] = new ModelRendererTurbo(this, 93, 300, textureX, textureY); // Box 675
		bodyModel[507] = new ModelRendererTurbo(this, 93, 300, textureX, textureY); // Box 676
		bodyModel[508] = new ModelRendererTurbo(this, 93, 297, textureX, textureY); // Box 677
		bodyModel[509] = new ModelRendererTurbo(this, 93, 300, textureX, textureY); // Box 678
		bodyModel[510] = new ModelRendererTurbo(this, 93, 297, textureX, textureY); // Box 679
		bodyModel[511] = new ModelRendererTurbo(this, 93, 300, textureX, textureY); // Box 322
		bodyModel[512] = new ModelRendererTurbo(this, 93, 297, textureX, textureY); // Box 323
		bodyModel[513] = new ModelRendererTurbo(this, 93, 297, textureX, textureY); // Box 324
		bodyModel[514] = new ModelRendererTurbo(this, 93, 300, textureX, textureY); // Box 325
		bodyModel[515] = new ModelRendererTurbo(this, 93, 297, textureX, textureY); // Box 326
		bodyModel[516] = new ModelRendererTurbo(this, 93, 300, textureX, textureY); // Box 327
		bodyModel[517] = new ModelRendererTurbo(this, 93, 300, textureX, textureY); // Box 328
		bodyModel[518] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 518
		bodyModel[519] = new ModelRendererTurbo(this, 93, 297, textureX, textureY); // Box 519
		bodyModel[520] = new ModelRendererTurbo(this, 83, 296, textureX, textureY); // Box 520
		bodyModel[521] = new ModelRendererTurbo(this, 83, 299, textureX, textureY); // Box 521
		bodyModel[522] = new ModelRendererTurbo(this, 83, 305, textureX, textureY); // Box 522
		bodyModel[523] = new ModelRendererTurbo(this, 83, 302, textureX, textureY); // Box 523

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[500].setRotationPoint(-66F, -4F, 10F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 557
		bodyModel[501].setRotationPoint(65F, -4F, 10F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 595
		bodyModel[502].setRotationPoint(65F, -4F, -11F);

		bodyModel[503].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 672
		bodyModel[503].setRotationPoint(64F, -8.15F, -2F);
		bodyModel[503].rotateAngleZ = 2.0943951F;

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 673
		bodyModel[504].setRotationPoint(62.5F, -9F, -1F);

		bodyModel[505].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 674
		bodyModel[505].setRotationPoint(63F, -8.15F, -1F);
		bodyModel[505].rotateAngleZ = 2.0943951F;

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 675
		bodyModel[506].setRotationPoint(63.5F, -9F, -2F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 676
		bodyModel[507].setRotationPoint(63.5F, -9F, -7F);

		bodyModel[508].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 677
		bodyModel[508].setRotationPoint(64F, -8.15F, -7F);
		bodyModel[508].rotateAngleZ = 2.0943951F;

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 678
		bodyModel[509].setRotationPoint(62.5F, -9F, -8F);

		bodyModel[510].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 679
		bodyModel[510].setRotationPoint(63F, -8.15F, -8F);
		bodyModel[510].rotateAngleZ = 2.0943951F;

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 322
		bodyModel[511].setRotationPoint(-64.5F, -9F, 6F);

		bodyModel[512].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 323
		bodyModel[512].setRotationPoint(-64F, -8.15F, 6F);
		bodyModel[512].rotateAngleZ = 0.87266463F;

		bodyModel[513].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 324
		bodyModel[513].setRotationPoint(-63F, -8.15F, 7F);
		bodyModel[513].rotateAngleZ = 0.87266463F;

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 325
		bodyModel[514].setRotationPoint(-63.5F, -9F, 7F);

		bodyModel[515].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 326
		bodyModel[515].setRotationPoint(-63F, -8.15F, 0F);
		bodyModel[515].rotateAngleZ = 0.87266463F;

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 327
		bodyModel[516].setRotationPoint(-63.5F, -9F, 0F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, -0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 328
		bodyModel[517].setRotationPoint(-64.5F, -9F, 1F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[518].setRotationPoint(-66.5F, -8F, 6F);

		bodyModel[519].addShapeBox(0F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 519
		bodyModel[519].setRotationPoint(-64F, -8.15F, 1F);
		bodyModel[519].rotateAngleZ = 0.87266463F;

		bodyModel[520].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, -0.65F, 0F, 0F, 0.2F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, 0.2F, 0F, 0F, -0.75F, -0.5F, 0F, 0F); // Box 520
		bodyModel[520].setRotationPoint(-71.5F, 0F, -10F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.2F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.2F, -0.5F, 0F, -0.65F); // Box 521
		bodyModel[521].setRotationPoint(-71.5F, 0F, 9F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.2F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.2F, -0.5F, 0F, -0.65F, -0.5F, 0F, 0F, 0F, 0F, -0.75F); // Box 522
		bodyModel[522].setRotationPoint(68.5F, 0F, -10F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, 0.2F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, 0F, 0.2F); // Box 523
		bodyModel[523].setRotationPoint(68.5F, 0F, 9F);
	}
}