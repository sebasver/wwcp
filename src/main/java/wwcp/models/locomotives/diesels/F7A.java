//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.12.2018 - 14:39:34
// Last changed on: 24.12.2018 - 14:39:34

package wwcp.models.locomotives.diesels; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class F7A extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public F7A() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[540];

		initbodyModel_1();
		initbodyModel_2();

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 114, 81, textureX, textureY); // Box 99
		bodyModel[1] = new ModelRendererTurbo(this, 113, 22, textureX, textureY); // Box 97
		bodyModel[2] = new ModelRendererTurbo(this, 110, 17, textureX, textureY); // Box 96
		bodyModel[3] = new ModelRendererTurbo(this, 94, 26, textureX, textureY); // Box 94
		bodyModel[4] = new ModelRendererTurbo(this, 97, 51, textureX, textureY); // Box 93
		bodyModel[5] = new ModelRendererTurbo(this, 97, 80, textureX, textureY); // Box 92
		bodyModel[6] = new ModelRendererTurbo(this, 61, 47, textureX, textureY); // Box 84
		bodyModel[7] = new ModelRendererTurbo(this, 52, 59, textureX, textureY); // Box 83
		bodyModel[8] = new ModelRendererTurbo(this, 49, 51, textureX, textureY); // Box 81
		bodyModel[9] = new ModelRendererTurbo(this, 61, 43, textureX, textureY); // Box 80
		bodyModel[10] = new ModelRendererTurbo(this, 62, 17, textureX, textureY); // Box 79
		bodyModel[11] = new ModelRendererTurbo(this, 65, 26, textureX, textureY); // Box 77
		bodyModel[12] = new ModelRendererTurbo(this, 59, 54, textureX, textureY); // Box 76
		bodyModel[13] = new ModelRendererTurbo(this, 69, 19, textureX, textureY); // Box 75
		bodyModel[14] = new ModelRendererTurbo(this, 76, 26, textureX, textureY); // Box 74
		bodyModel[15] = new ModelRendererTurbo(this, 75, 51, textureX, textureY); // Box 73
		bodyModel[16] = new ModelRendererTurbo(this, 58, 63, textureX, textureY); // Box 69
		bodyModel[17] = new ModelRendererTurbo(this, 85, 72, textureX, textureY); // Box 68
		bodyModel[18] = new ModelRendererTurbo(this, 85, 50, textureX, textureY); // Box 67
		bodyModel[19] = new ModelRendererTurbo(this, 84, 28, textureX, textureY); // Box 66
		bodyModel[20] = new ModelRendererTurbo(this, 84, 22, textureX, textureY); // Box 65
		bodyModel[21] = new ModelRendererTurbo(this, 36, 51, textureX, textureY); // Box 43
		bodyModel[22] = new ModelRendererTurbo(this, 96, 14, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 77, 11, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 36, 55, textureX, textureY); // Box 128
		bodyModel[25] = new ModelRendererTurbo(this, 156, 129, textureX, textureY); // Box 110
		bodyModel[26] = new ModelRendererTurbo(this, 120, 44, textureX, textureY); // Box 108
		bodyModel[27] = new ModelRendererTurbo(this, 115, 43, textureX, textureY); // Box 107
		bodyModel[28] = new ModelRendererTurbo(this, 115, 47, textureX, textureY); // Box 103
		bodyModel[29] = new ModelRendererTurbo(this, 122, 59, textureX, textureY); // Box 102
		bodyModel[30] = new ModelRendererTurbo(this, 114, 63, textureX, textureY); // Box 100
		bodyModel[31] = new ModelRendererTurbo(this, 136, 21, textureX, textureY); // Box 109
		bodyModel[32] = new ModelRendererTurbo(this, 181, 19, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 181, 12, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 181, 6, textureX, textureY); // Box 103
		bodyModel[35] = new ModelRendererTurbo(this, 181, 1, textureX, textureY); // Box 102
		bodyModel[36] = new ModelRendererTurbo(this, 181, 29, textureX, textureY); // Box 64
		bodyModel[37] = new ModelRendererTurbo(this, 181, 36, textureX, textureY); // Box 65
		bodyModel[38] = new ModelRendererTurbo(this, 181, 43, textureX, textureY); // Box 66
		bodyModel[39] = new ModelRendererTurbo(this, 103, 72, textureX, textureY); // Box 232
		bodyModel[40] = new ModelRendererTurbo(this, 73, 63, textureX, textureY); // Box 232
		bodyModel[41] = new ModelRendererTurbo(this, 71, 72, textureX, textureY); // Box 232
		bodyModel[42] = new ModelRendererTurbo(this, 73, 66, textureX, textureY); // Box 232
		bodyModel[43] = new ModelRendererTurbo(this, 66, 41, textureX, textureY); // Box 232
		bodyModel[44] = new ModelRendererTurbo(this, 66, 38, textureX, textureY); // Glow lamp Right
		bodyModel[45] = new ModelRendererTurbo(this, 103, 66, textureX, textureY); // Box 232
		bodyModel[46] = new ModelRendererTurbo(this, 103, 63, textureX, textureY); // Box 232
		bodyModel[47] = new ModelRendererTurbo(this, 83, 58, textureX, textureY); // Box 171 lamp
		bodyModel[48] = new ModelRendererTurbo(this, 91, 63, textureX, textureY); // Box 170 lamp
		bodyModel[49] = new ModelRendererTurbo(this, 91, 58, textureX, textureY); // Box 169 lamp
		bodyModel[50] = new ModelRendererTurbo(this, 83, 63, textureX, textureY); // Box 168 lamp
		bodyModel[51] = new ModelRendererTurbo(this, 77, 41, textureX, textureY); // Box 167 lamp
		bodyModel[52] = new ModelRendererTurbo(this, 91, 41, textureX, textureY); // Box 166 lamp
		bodyModel[53] = new ModelRendererTurbo(this, 91, 36, textureX, textureY); // Box 165 lamp
		bodyModel[54] = new ModelRendererTurbo(this, 77, 36, textureX, textureY); // Box 164 lamp
		bodyModel[55] = new ModelRendererTurbo(this, 11, 111, textureX, textureY); // Box 123
		bodyModel[56] = new ModelRendererTurbo(this, 11, 103, textureX, textureY); // Box 122
		bodyModel[57] = new ModelRendererTurbo(this, 11, 115, textureX, textureY); // Box 120
		bodyModel[58] = new ModelRendererTurbo(this, 11, 107, textureX, textureY); // Box 119
		bodyModel[59] = new ModelRendererTurbo(this, 117, 50, textureX, textureY); // Box 111
		bodyModel[60] = new ModelRendererTurbo(this, 110, 41, textureX, textureY); // Box 232
		bodyModel[61] = new ModelRendererTurbo(this, 110, 38, textureX, textureY); // Glow lamp Left
		bodyModel[62] = new ModelRendererTurbo(this, 106, 70, textureX, textureY); // Box 96
		bodyModel[63] = new ModelRendererTurbo(this, 75, 80, textureX, textureY); // Box 100
		bodyModel[64] = new ModelRendererTurbo(this, 51, 50, textureX, textureY); // Box 101
		bodyModel[65] = new ModelRendererTurbo(this, 72, 37, textureX, textureY); // Box 103
		bodyModel[66] = new ModelRendererTurbo(this, 23, 289, textureX, textureY); // Box 55
		bodyModel[67] = new ModelRendererTurbo(this, 28, 289, textureX, textureY); // Box 54
		bodyModel[68] = new ModelRendererTurbo(this, 1, 288, textureX, textureY); // Box 55
		bodyModel[69] = new ModelRendererTurbo(this, 1, 285, textureX, textureY); // Box 54
		bodyModel[70] = new ModelRendererTurbo(this, 8, 289, textureX, textureY); // Box 54
		bodyModel[71] = new ModelRendererTurbo(this, 15, 289, textureX, textureY); // Box 54
		bodyModel[72] = new ModelRendererTurbo(this, 10, 285, textureX, textureY); // Box 54
		bodyModel[73] = new ModelRendererTurbo(this, 37, 289, textureX, textureY); // Box 54
		bodyModel[74] = new ModelRendererTurbo(this, 417, 64, textureX, textureY); // Box 199
		bodyModel[75] = new ModelRendererTurbo(this, 334, 54, textureX, textureY); // Box 199
		bodyModel[76] = new ModelRendererTurbo(this, 262, 54, textureX, textureY); // Box 199
		bodyModel[77] = new ModelRendererTurbo(this, 426, 64, textureX, textureY); // Box 199
		bodyModel[78] = new ModelRendererTurbo(this, 325, 58, textureX, textureY); // Box 186
		bodyModel[79] = new ModelRendererTurbo(this, 318, 60, textureX, textureY); // Box 185
		bodyModel[80] = new ModelRendererTurbo(this, 309, 60, textureX, textureY); // Box 184
		bodyModel[81] = new ModelRendererTurbo(this, 309, 56, textureX, textureY); // Box 183
		bodyModel[82] = new ModelRendererTurbo(this, 318, 52, textureX, textureY); // Box 182
		bodyModel[83] = new ModelRendererTurbo(this, 325, 54, textureX, textureY); // Box 181
		bodyModel[84] = new ModelRendererTurbo(this, 309, 52, textureX, textureY); // Box 180
		bodyModel[85] = new ModelRendererTurbo(this, 292, 58, textureX, textureY); // Box 179
		bodyModel[86] = new ModelRendererTurbo(this, 285, 60, textureX, textureY); // Box 178
		bodyModel[87] = new ModelRendererTurbo(this, 276, 60, textureX, textureY); // Box 177
		bodyModel[88] = new ModelRendererTurbo(this, 277, 56, textureX, textureY); // Box 176
		bodyModel[89] = new ModelRendererTurbo(this, 285, 52, textureX, textureY); // Box 175
		bodyModel[90] = new ModelRendererTurbo(this, 292, 54, textureX, textureY); // Box 174
		bodyModel[91] = new ModelRendererTurbo(this, 276, 52, textureX, textureY); // Box 173
		bodyModel[92] = new ModelRendererTurbo(this, 253, 54, textureX, textureY); // Box 172
		bodyModel[93] = new ModelRendererTurbo(this, 237, 52, textureX, textureY); // Box 171
		bodyModel[94] = new ModelRendererTurbo(this, 253, 58, textureX, textureY); // Box 170
		bodyModel[95] = new ModelRendererTurbo(this, 195, 52, textureX, textureY); // Box 169
		bodyModel[96] = new ModelRendererTurbo(this, 218, 59, textureX, textureY); // Box 169
		bodyModel[97] = new ModelRendererTurbo(this, 237, 60, textureX, textureY); // Box 169
		bodyModel[98] = new ModelRendererTurbo(this, 195, 62, textureX, textureY); // Box 169
		bodyModel[99] = new ModelRendererTurbo(this, 218, 54, textureX, textureY); // Box 169
		bodyModel[100] = new ModelRendererTurbo(this, 246, 60, textureX, textureY); // Box 168
		bodyModel[101] = new ModelRendererTurbo(this, 208, 52, textureX, textureY); // Box 167
		bodyModel[102] = new ModelRendererTurbo(this, 208, 62, textureX, textureY); // Box 167
		bodyModel[103] = new ModelRendererTurbo(this, 246, 52, textureX, textureY); // Box 167
		bodyModel[104] = new ModelRendererTurbo(this, 237, 56, textureX, textureY); // Box 166
		bodyModel[105] = new ModelRendererTurbo(this, 195, 57, textureX, textureY); // Box 166
		bodyModel[106] = new ModelRendererTurbo(this, 417, 60, textureX, textureY); // Box 199
		bodyModel[107] = new ModelRendererTurbo(this, 426, 60, textureX, textureY); // Box 199
		bodyModel[108] = new ModelRendererTurbo(this, 428, 54, textureX, textureY); // Box 199
		bodyModel[109] = new ModelRendererTurbo(this, 428, 57, textureX, textureY); // Box 199
		bodyModel[110] = new ModelRendererTurbo(this, 423, 54, textureX, textureY); // Box 199
		bodyModel[111] = new ModelRendererTurbo(this, 423, 57, textureX, textureY); // Box 199
		bodyModel[112] = new ModelRendererTurbo(this, 381, 52, textureX, textureY); // Box 198
		bodyModel[113] = new ModelRendererTurbo(this, 381, 64, textureX, textureY); // Box 197
		bodyModel[114] = new ModelRendererTurbo(this, 377, 56, textureX, textureY); // Box 196
		bodyModel[115] = new ModelRendererTurbo(this, 402, 50, textureX, textureY); // Box 195
		bodyModel[116] = new ModelRendererTurbo(this, 402, 59, textureX, textureY); // Box 194
		bodyModel[117] = new ModelRendererTurbo(this, 366, 58, textureX, textureY); // Box 193
		bodyModel[118] = new ModelRendererTurbo(this, 359, 60, textureX, textureY); // Box 192
		bodyModel[119] = new ModelRendererTurbo(this, 350, 60, textureX, textureY); // Box 191
		bodyModel[120] = new ModelRendererTurbo(this, 350, 56, textureX, textureY); // Box 190
		bodyModel[121] = new ModelRendererTurbo(this, 359, 52, textureX, textureY); // Box 189
		bodyModel[122] = new ModelRendererTurbo(this, 366, 54, textureX, textureY); // Box 188
		bodyModel[123] = new ModelRendererTurbo(this, 350, 52, textureX, textureY); // Box 187
		bodyModel[124] = new ModelRendererTurbo(this, 364, 21, textureX, textureY); // Box 38
		bodyModel[125] = new ModelRendererTurbo(this, 375, 23, textureX, textureY); // Box 23
		bodyModel[126] = new ModelRendererTurbo(this, 369, 31, textureX, textureY); // Box 115
		bodyModel[127] = new ModelRendererTurbo(this, 382, 29, textureX, textureY); // Box 173
		bodyModel[128] = new ModelRendererTurbo(this, 382, 23, textureX, textureY); // Box 174
		bodyModel[129] = new ModelRendererTurbo(this, 215, 126, textureX, textureY); // Box 275
		bodyModel[130] = new ModelRendererTurbo(this, 450, 109, textureX, textureY); // Box 271
		bodyModel[131] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 270
		bodyModel[132] = new ModelRendererTurbo(this, 399, 87, textureX, textureY); // Box 270
		bodyModel[133] = new ModelRendererTurbo(this, 447, 129, textureX, textureY); // Box 269
		bodyModel[134] = new ModelRendererTurbo(this, 449, 119, textureX, textureY); // Box 268
		bodyModel[135] = new ModelRendererTurbo(this, 5, 100, textureX, textureY); // Box 267
		bodyModel[136] = new ModelRendererTurbo(this, 3, 111, textureX, textureY); // Box 266
		bodyModel[137] = new ModelRendererTurbo(this, 5, 104, textureX, textureY); // Box 265
		bodyModel[138] = new ModelRendererTurbo(this, 3, 108, textureX, textureY); // Box 264
		bodyModel[139] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 263
		bodyModel[140] = new ModelRendererTurbo(this, 215, 117, textureX, textureY); // Box 204
		bodyModel[141] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Box 100
		bodyModel[142] = new ModelRendererTurbo(this, 359, 126, textureX, textureY); // Box 190
		bodyModel[143] = new ModelRendererTurbo(this, 341, 126, textureX, textureY); // Box 191
		bodyModel[144] = new ModelRendererTurbo(this, 194, 120, textureX, textureY); // Left front door
		bodyModel[145] = new ModelRendererTurbo(this, 341, 132, textureX, textureY); // Left back door
		bodyModel[146] = new ModelRendererTurbo(this, 341, 145, textureX, textureY); // Box 194
		bodyModel[147] = new ModelRendererTurbo(this, 343, 149, textureX, textureY); // Box 122
		bodyModel[148] = new ModelRendererTurbo(this, 343, 152, textureX, textureY); // Box 122
		bodyModel[149] = new ModelRendererTurbo(this, 354, 146, textureX, textureY); // Box 122
		bodyModel[150] = new ModelRendererTurbo(this, 336, 146, textureX, textureY); // Box 122
		bodyModel[151] = new ModelRendererTurbo(this, 352, 151, textureX, textureY); // Box 122
		bodyModel[152] = new ModelRendererTurbo(this, 338, 151, textureX, textureY); // Box 122
		bodyModel[153] = new ModelRendererTurbo(this, 194, 116, textureX, textureY); // Box 226
		bodyModel[154] = new ModelRendererTurbo(this, 210, 120, textureX, textureY); // Box 226
		bodyModel[155] = new ModelRendererTurbo(this, 210, 141, textureX, textureY); // Box 226
		bodyModel[156] = new ModelRendererTurbo(this, 189, 141, textureX, textureY); // Box 226
		bodyModel[157] = new ModelRendererTurbo(this, 210, 123, textureX, textureY); // Box 219
		bodyModel[158] = new ModelRendererTurbo(this, 189, 115, textureX, textureY); // Box 218
		bodyModel[159] = new ModelRendererTurbo(this, 196, 141, textureX, textureY); // Box 118
		bodyModel[160] = new ModelRendererTurbo(this, 196, 147, textureX, textureY); // Box 117
		bodyModel[161] = new ModelRendererTurbo(this, 196, 150, textureX, textureY); // Box 122
		bodyModel[162] = new ModelRendererTurbo(this, 196, 153, textureX, textureY); // Box 122
		bodyModel[163] = new ModelRendererTurbo(this, 205, 145, textureX, textureY); // Box 122
		bodyModel[164] = new ModelRendererTurbo(this, 191, 145, textureX, textureY); // Box 122
		bodyModel[165] = new ModelRendererTurbo(this, 205, 150, textureX, textureY); // Box 122
		bodyModel[166] = new ModelRendererTurbo(this, 191, 150, textureX, textureY); // Box 122
		bodyModel[167] = new ModelRendererTurbo(this, 196, 133, textureX, textureY); // Box 217
		bodyModel[168] = new ModelRendererTurbo(this, 336, 129, textureX, textureY); // Box 229
		bodyModel[169] = new ModelRendererTurbo(this, 354, 129, textureX, textureY); // Box 228
		bodyModel[170] = new ModelRendererTurbo(this, 354, 126, textureX, textureY); // Box 226
		bodyModel[171] = new ModelRendererTurbo(this, 336, 95, textureX, textureY); // Box 226
		bodyModel[172] = new ModelRendererTurbo(this, 336, 126, textureX, textureY); // Box 226
		bodyModel[173] = new ModelRendererTurbo(this, 354, 143, textureX, textureY); // Box 226
		bodyModel[174] = new ModelRendererTurbo(this, 392, 147, textureX, textureY); // Box 224
		bodyModel[175] = new ModelRendererTurbo(this, 387, 154, textureX, textureY); // Box 225
		bodyModel[176] = new ModelRendererTurbo(this, 386, 147, textureX, textureY); // Box 226
		bodyModel[177] = new ModelRendererTurbo(this, 386, 142, textureX, textureY); // Box 227
		bodyModel[178] = new ModelRendererTurbo(this, 387, 151, textureX, textureY); // Box 228
		bodyModel[179] = new ModelRendererTurbo(this, 392, 142, textureX, textureY); // Box 229
		bodyModel[180] = new ModelRendererTurbo(this, 386, 129, textureX, textureY); // Box 230
		bodyModel[181] = new ModelRendererTurbo(this, 392, 129, textureX, textureY); // Box 231
		bodyModel[182] = new ModelRendererTurbo(this, 386, 126, textureX, textureY); // Box 232
		bodyModel[183] = new ModelRendererTurbo(this, 392, 126, textureX, textureY); // Box 233
		bodyModel[184] = new ModelRendererTurbo(this, 392, 139, textureX, textureY); // Box 234
		bodyModel[185] = new ModelRendererTurbo(this, 386, 139, textureX, textureY); // Box 235
		bodyModel[186] = new ModelRendererTurbo(this, 191, 133, textureX, textureY); // Box 236
		bodyModel[187] = new ModelRendererTurbo(this, 205, 133, textureX, textureY); // Box 238
		bodyModel[188] = new ModelRendererTurbo(this, 196, 144, textureX, textureY); // Box 239
		bodyModel[189] = new ModelRendererTurbo(this, 190, 271, textureX, textureY); // Box 124
		bodyModel[190] = new ModelRendererTurbo(this, 219, 266, textureX, textureY); // Box 123
		bodyModel[191] = new ModelRendererTurbo(this, 247, 271, textureX, textureY); // Box 121
		bodyModel[192] = new ModelRendererTurbo(this, 274, 266, textureX, textureY); // Box 120
		bodyModel[193] = new ModelRendererTurbo(this, 194, 242, textureX, textureY); // Box 124
		bodyModel[194] = new ModelRendererTurbo(this, 243, 242, textureX, textureY); // Box 121
		bodyModel[195] = new ModelRendererTurbo(this, 208, 261, textureX, textureY); // Box 124
		bodyModel[196] = new ModelRendererTurbo(this, 257, 261, textureX, textureY); // Box 121
		bodyModel[197] = new ModelRendererTurbo(this, 208, 237, textureX, textureY); // Box 124
		bodyModel[198] = new ModelRendererTurbo(this, 257, 237, textureX, textureY); // Box 121
		bodyModel[199] = new ModelRendererTurbo(this, 208, 266, textureX, textureY); // Box 254
		bodyModel[200] = new ModelRendererTurbo(this, 219, 232, textureX, textureY); // Box 255
		bodyModel[201] = new ModelRendererTurbo(this, 274, 232, textureX, textureY); // Box 256
		bodyModel[202] = new ModelRendererTurbo(this, 208, 232, textureX, textureY); // Box 257
		bodyModel[203] = new ModelRendererTurbo(this, 215, 78, textureX, textureY); // Box 258
		bodyModel[204] = new ModelRendererTurbo(this, 215, 69, textureX, textureY); // Box 259
		bodyModel[205] = new ModelRendererTurbo(this, 194, 72, textureX, textureY); // Right front door
		bodyModel[206] = new ModelRendererTurbo(this, 194, 68, textureX, textureY); // Box 261
		bodyModel[207] = new ModelRendererTurbo(this, 210, 72, textureX, textureY); // Box 262
		bodyModel[208] = new ModelRendererTurbo(this, 210, 93, textureX, textureY); // Box 263
		bodyModel[209] = new ModelRendererTurbo(this, 189, 93, textureX, textureY); // Box 264
		bodyModel[210] = new ModelRendererTurbo(this, 210, 75, textureX, textureY); // Box 265
		bodyModel[211] = new ModelRendererTurbo(this, 189, 67, textureX, textureY); // Box 266
		bodyModel[212] = new ModelRendererTurbo(this, 196, 93, textureX, textureY); // Box 267
		bodyModel[213] = new ModelRendererTurbo(this, 196, 99, textureX, textureY); // Box 268
		bodyModel[214] = new ModelRendererTurbo(this, 196, 102, textureX, textureY); // Box 269
		bodyModel[215] = new ModelRendererTurbo(this, 196, 105, textureX, textureY); // Box 270
		bodyModel[216] = new ModelRendererTurbo(this, 205, 102, textureX, textureY); // Box 271
		bodyModel[217] = new ModelRendererTurbo(this, 191, 97, textureX, textureY); // Box 272
		bodyModel[218] = new ModelRendererTurbo(this, 205, 97, textureX, textureY); // Box 273
		bodyModel[219] = new ModelRendererTurbo(this, 191, 102, textureX, textureY); // Box 274
		bodyModel[220] = new ModelRendererTurbo(this, 196, 85, textureX, textureY); // Box 275
		bodyModel[221] = new ModelRendererTurbo(this, 191, 85, textureX, textureY); // Box 276
		bodyModel[222] = new ModelRendererTurbo(this, 205, 85, textureX, textureY); // Box 277
		bodyModel[223] = new ModelRendererTurbo(this, 196, 96, textureX, textureY); // Box 278
		bodyModel[224] = new ModelRendererTurbo(this, 359, 78, textureX, textureY); // Box 279
		bodyModel[225] = new ModelRendererTurbo(this, 341, 78, textureX, textureY); // Box 280
		bodyModel[226] = new ModelRendererTurbo(this, 341, 84, textureX, textureY); // Right back door
		bodyModel[227] = new ModelRendererTurbo(this, 341, 97, textureX, textureY); // Box 282
		bodyModel[228] = new ModelRendererTurbo(this, 354, 98, textureX, textureY); // Box 283
		bodyModel[229] = new ModelRendererTurbo(this, 343, 101, textureX, textureY); // Box 284
		bodyModel[230] = new ModelRendererTurbo(this, 343, 104, textureX, textureY); // Box 285
		bodyModel[231] = new ModelRendererTurbo(this, 336, 98, textureX, textureY); // Box 286
		bodyModel[232] = new ModelRendererTurbo(this, 352, 103, textureX, textureY); // Box 287
		bodyModel[233] = new ModelRendererTurbo(this, 338, 103, textureX, textureY); // Box 288
		bodyModel[234] = new ModelRendererTurbo(this, 392, 99, textureX, textureY); // Box 289
		bodyModel[235] = new ModelRendererTurbo(this, 387, 106, textureX, textureY); // Box 290
		bodyModel[236] = new ModelRendererTurbo(this, 386, 99, textureX, textureY); // Box 291
		bodyModel[237] = new ModelRendererTurbo(this, 386, 94, textureX, textureY); // Box 292
		bodyModel[238] = new ModelRendererTurbo(this, 387, 103, textureX, textureY); // Box 293
		bodyModel[239] = new ModelRendererTurbo(this, 392, 94, textureX, textureY); // Box 294
		bodyModel[240] = new ModelRendererTurbo(this, 336, 81, textureX, textureY); // Box 295
		bodyModel[241] = new ModelRendererTurbo(this, 354, 81, textureX, textureY); // Box 296
		bodyModel[242] = new ModelRendererTurbo(this, 354, 78, textureX, textureY); // Box 297
		bodyModel[243] = new ModelRendererTurbo(this, 336, 143, textureX, textureY); // Box 298
		bodyModel[244] = new ModelRendererTurbo(this, 336, 78, textureX, textureY); // Box 299
		bodyModel[245] = new ModelRendererTurbo(this, 354, 95, textureX, textureY); // Box 300
		bodyModel[246] = new ModelRendererTurbo(this, 386, 81, textureX, textureY); // Box 301
		bodyModel[247] = new ModelRendererTurbo(this, 392, 81, textureX, textureY); // Box 302
		bodyModel[248] = new ModelRendererTurbo(this, 392, 78, textureX, textureY); // Box 303
		bodyModel[249] = new ModelRendererTurbo(this, 386, 78, textureX, textureY); // Box 304
		bodyModel[250] = new ModelRendererTurbo(this, 392, 91, textureX, textureY); // Box 305
		bodyModel[251] = new ModelRendererTurbo(this, 386, 91, textureX, textureY); // Box 306
		bodyModel[252] = new ModelRendererTurbo(this, 82, 6, textureX, textureY); // Box 307
		bodyModel[253] = new ModelRendererTurbo(this, 135, 6, textureX, textureY); // Box 308
		bodyModel[254] = new ModelRendererTurbo(this, 144, 6, textureX, textureY); // Box 309
		bodyModel[255] = new ModelRendererTurbo(this, 153, 7, textureX, textureY); // Box 310
		bodyModel[256] = new ModelRendererTurbo(this, 153, 12, textureX, textureY); // Box 311
		bodyModel[257] = new ModelRendererTurbo(this, 1, 141, textureX, textureY); // Box 312
		bodyModel[258] = new ModelRendererTurbo(this, 144, 11, textureX, textureY); // Box 313
		bodyModel[259] = new ModelRendererTurbo(this, 14, 3, textureX, textureY); // Box 318
		bodyModel[260] = new ModelRendererTurbo(this, 369, 14, textureX, textureY); // Box 319
		bodyModel[261] = new ModelRendererTurbo(this, 422, 86, textureX, textureY); // Box 320
		bodyModel[262] = new ModelRendererTurbo(this, 443, 88, textureX, textureY); // Box 321
		bodyModel[263] = new ModelRendererTurbo(this, 460, 92, textureX, textureY); // Box 322
		bodyModel[264] = new ModelRendererTurbo(this, 426, 89, textureX, textureY); // Box 323
		bodyModel[265] = new ModelRendererTurbo(this, 444, 86, textureX, textureY); // Box 324
		bodyModel[266] = new ModelRendererTurbo(this, 424, 94, textureX, textureY); // Box 325
		bodyModel[267] = new ModelRendererTurbo(this, 448, 91, textureX, textureY); // Box 326
		bodyModel[268] = new ModelRendererTurbo(this, 423, 99, textureX, textureY); // Box 327
		bodyModel[269] = new ModelRendererTurbo(this, 451, 96, textureX, textureY); // Box 328
		bodyModel[270] = new ModelRendererTurbo(this, 135, 11, textureX, textureY); // Box 303
		bodyModel[271] = new ModelRendererTurbo(this, 156, 88, textureX, textureY); // Box 304
		bodyModel[272] = new ModelRendererTurbo(this, 193, 184, textureX, textureY); // Box 120
		bodyModel[273] = new ModelRendererTurbo(this, 193, 206, textureX, textureY); // Box 307
		bodyModel[274] = new ModelRendererTurbo(this, 341, 146, textureX, textureY); // Box 308
		bodyModel[275] = new ModelRendererTurbo(this, 375, 159, textureX, textureY); // Box 309
		bodyModel[276] = new ModelRendererTurbo(this, 364, 145, textureX, textureY); // Box 310
		bodyModel[277] = new ModelRendererTurbo(this, 374, 155, textureX, textureY); // Box 311
		bodyModel[278] = new ModelRendererTurbo(this, 385, 147, textureX, textureY); // Box 312
		bodyModel[279] = new ModelRendererTurbo(this, 373, 150, textureX, textureY); // Box 313
		bodyModel[280] = new ModelRendererTurbo(this, 402, 151, textureX, textureY); // Box 314
		bodyModel[281] = new ModelRendererTurbo(this, 364, 150, textureX, textureY); // Box 315
		bodyModel[282] = new ModelRendererTurbo(this, 365, 155, textureX, textureY); // Box 316
		bodyModel[283] = new ModelRendererTurbo(this, 366, 159, textureX, textureY); // Box 317
		bodyModel[284] = new ModelRendererTurbo(this, 213, 147, textureX, textureY); // Box 318
		bodyModel[285] = new ModelRendererTurbo(this, 247, 156, textureX, textureY); // Box 319
		bodyModel[286] = new ModelRendererTurbo(this, 236, 146, textureX, textureY); // Box 320
		bodyModel[287] = new ModelRendererTurbo(this, 246, 152, textureX, textureY); // Box 321
		bodyModel[288] = new ModelRendererTurbo(this, 257, 148, textureX, textureY); // Box 322
		bodyModel[289] = new ModelRendererTurbo(this, 245, 147, textureX, textureY); // Box 323
		bodyModel[290] = new ModelRendererTurbo(this, 274, 152, textureX, textureY); // Box 324
		bodyModel[291] = new ModelRendererTurbo(this, 236, 147, textureX, textureY); // Box 325
		bodyModel[292] = new ModelRendererTurbo(this, 237, 152, textureX, textureY); // Box 326
		bodyModel[293] = new ModelRendererTurbo(this, 238, 156, textureX, textureY); // Box 327
		bodyModel[294] = new ModelRendererTurbo(this, 172, 207, textureX, textureY); // Box 328
		bodyModel[295] = new ModelRendererTurbo(this, 160, 219, textureX, textureY); // Box 329
		bodyModel[296] = new ModelRendererTurbo(this, 162, 212, textureX, textureY); // Box 330
		bodyModel[297] = new ModelRendererTurbo(this, 148, 211, textureX, textureY); // Box 331
		bodyModel[298] = new ModelRendererTurbo(this, 150, 217, textureX, textureY); // Box 332
		bodyModel[299] = new ModelRendererTurbo(this, 157, 213, textureX, textureY); // Box 333
		bodyModel[300] = new ModelRendererTurbo(this, 160, 204, textureX, textureY); // Box 334
		bodyModel[301] = new ModelRendererTurbo(this, 150, 206, textureX, textureY); // Box 335
		bodyModel[302] = new ModelRendererTurbo(this, 157, 207, textureX, textureY); // Box 336
		bodyModel[303] = new ModelRendererTurbo(this, 54, 81, textureX, textureY); // Box 337
		bodyModel[304] = new ModelRendererTurbo(this, 62, 70, textureX, textureY); // Box 338
		bodyModel[305] = new ModelRendererTurbo(this, 52, 44, textureX, textureY); // Box 339
		bodyModel[306] = new ModelRendererTurbo(this, 38, 11, textureX, textureY); // Box 303
		bodyModel[307] = new ModelRendererTurbo(this, 29, 11, textureX, textureY); // Box 313
		bodyModel[308] = new ModelRendererTurbo(this, 22, 11, textureX, textureY); // Box 311
		bodyModel[309] = new ModelRendererTurbo(this, 13, 10, textureX, textureY); // Box 311
		bodyModel[310] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Box 311
		bodyModel[311] = new ModelRendererTurbo(this, 171, 69, textureX, textureY); // Box 304
		bodyModel[312] = new ModelRendererTurbo(this, 184, 69, textureX, textureY); // Box 304
		bodyModel[313] = new ModelRendererTurbo(this, 162, 69, textureX, textureY); // Box 304
		bodyModel[314] = new ModelRendererTurbo(this, 166, 75, textureX, textureY); // Box 304
		bodyModel[315] = new ModelRendererTurbo(this, 161, 75, textureX, textureY); // Box 304
		bodyModel[316] = new ModelRendererTurbo(this, 171, 117, textureX, textureY); // Box 304
		bodyModel[317] = new ModelRendererTurbo(this, 184, 117, textureX, textureY); // Box 304
		bodyModel[318] = new ModelRendererTurbo(this, 174, 66, textureX, textureY); // Box 304
		bodyModel[319] = new ModelRendererTurbo(this, 162, 117, textureX, textureY); // Box 304
		bodyModel[320] = new ModelRendererTurbo(this, 166, 123, textureX, textureY); // Box 304
		bodyModel[321] = new ModelRendererTurbo(this, 170, 11, textureX, textureY); // Box 311
		bodyModel[322] = new ModelRendererTurbo(this, 161, 123, textureX, textureY); // Box 304
		bodyModel[323] = new ModelRendererTurbo(this, 158, 11, textureX, textureY); // Box 311
		bodyModel[324] = new ModelRendererTurbo(this, 174, 114, textureX, textureY); // Box 304
		bodyModel[325] = new ModelRendererTurbo(this, 38, 6, textureX, textureY); // Box 308
		bodyModel[326] = new ModelRendererTurbo(this, 29, 6, textureX, textureY); // Box 309
		bodyModel[327] = new ModelRendererTurbo(this, 22, 6, textureX, textureY); // Box 310
		bodyModel[328] = new ModelRendererTurbo(this, 148, 1, textureX, textureY); // Box 39
		bodyModel[329] = new ModelRendererTurbo(this, 59, 1, textureX, textureY); // Box 39
		bodyModel[330] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 39
		bodyModel[331] = new ModelRendererTurbo(this, 96, 1, textureX, textureY); // Box 39
		bodyModel[332] = new ModelRendererTurbo(this, 24, 2, textureX, textureY); // Box 39
		bodyModel[333] = new ModelRendererTurbo(this, 4, 3, textureX, textureY); // Box 318
		bodyModel[334] = new ModelRendererTurbo(this, 14, 7, textureX, textureY); // Box 39
		bodyModel[335] = new ModelRendererTurbo(this, 6, 7, textureX, textureY); // Box 39
		bodyModel[336] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 370
		bodyModel[337] = new ModelRendererTurbo(this, 72, 1, textureX, textureY); // Box 373
		bodyModel[338] = new ModelRendererTurbo(this, 161, 4, textureX, textureY); // Box 378
		bodyModel[339] = new ModelRendererTurbo(this, 172, 4, textureX, textureY); // Box 379
		bodyModel[340] = new ModelRendererTurbo(this, 163, 8, textureX, textureY); // Box 380
		bodyModel[341] = new ModelRendererTurbo(this, 172, 8, textureX, textureY); // Box 381
		bodyModel[342] = new ModelRendererTurbo(this, 128, 15, textureX, textureY); // Box 109
		bodyModel[343] = new ModelRendererTurbo(this, 116, 15, textureX, textureY); // Box 109
		bodyModel[344] = new ModelRendererTurbo(this, 129, 20, textureX, textureY); // Box 109
		bodyModel[345] = new ModelRendererTurbo(this, 122, 17, textureX, textureY); // Box 109
		bodyModel[346] = new ModelRendererTurbo(this, 56, 15, textureX, textureY); // Box 109
		bodyModel[347] = new ModelRendererTurbo(this, 50, 17, textureX, textureY); // Box 109
		bodyModel[348] = new ModelRendererTurbo(this, 45, 20, textureX, textureY); // Box 109
		bodyModel[349] = new ModelRendererTurbo(this, 40, 21, textureX, textureY); // Box 109
		bodyModel[350] = new ModelRendererTurbo(this, 36, 47, textureX, textureY); // Box 128
		bodyModel[351] = new ModelRendererTurbo(this, 29, 47, textureX, textureY); // Box 128
		bodyModel[352] = new ModelRendererTurbo(this, 45, 47, textureX, textureY); // Box 128
		bodyModel[353] = new ModelRendererTurbo(this, 54, 7, textureX, textureY); // Box 41
		bodyModel[354] = new ModelRendererTurbo(this, 68, 9, textureX, textureY); // Box 41
		bodyModel[355] = new ModelRendererTurbo(this, 125, 51, textureX, textureY); // Box 81
		bodyModel[356] = new ModelRendererTurbo(this, 132, 51, textureX, textureY); // Box 43
		bodyModel[357] = new ModelRendererTurbo(this, 132, 55, textureX, textureY); // Box 128
		bodyModel[358] = new ModelRendererTurbo(this, 136, 47, textureX, textureY); // Box 128
		bodyModel[359] = new ModelRendererTurbo(this, 145, 47, textureX, textureY); // Box 128
		bodyModel[360] = new ModelRendererTurbo(this, 129, 47, textureX, textureY); // Box 128
		bodyModel[361] = new ModelRendererTurbo(this, 68, 14, textureX, textureY); // Box 40
		bodyModel[362] = new ModelRendererTurbo(this, 44, 15, textureX, textureY); // Box 109
		bodyModel[363] = new ModelRendererTurbo(this, 77, 32, textureX, textureY); // Box 103
		bodyModel[364] = new ModelRendererTurbo(this, 97, 32, textureX, textureY); // Box 103
		bodyModel[365] = new ModelRendererTurbo(this, 104, 37, textureX, textureY); // Box 103
		bodyModel[366] = new ModelRendererTurbo(this, 78, 46, textureX, textureY); // Box 103
		bodyModel[367] = new ModelRendererTurbo(this, 98, 46, textureX, textureY); // Box 103
		bodyModel[368] = new ModelRendererTurbo(this, 83, 46, textureX, textureY); // Box 103
		bodyModel[369] = new ModelRendererTurbo(this, 91, 46, textureX, textureY); // Box 103
		bodyModel[370] = new ModelRendererTurbo(this, 78, 64, textureX, textureY); // Box 103
		bodyModel[371] = new ModelRendererTurbo(this, 76, 59, textureX, textureY); // Box 103
		bodyModel[372] = new ModelRendererTurbo(this, 98, 59, textureX, textureY); // Box 103
		bodyModel[373] = new ModelRendererTurbo(this, 98, 64, textureX, textureY); // Box 103
		bodyModel[374] = new ModelRendererTurbo(this, 78, 68, textureX, textureY); // Box 103
		bodyModel[375] = new ModelRendererTurbo(this, 98, 68, textureX, textureY); // Box 103
		bodyModel[376] = new ModelRendererTurbo(this, 83, 68, textureX, textureY); // Box 103
		bodyModel[377] = new ModelRendererTurbo(this, 91, 68, textureX, textureY); // Box 103
		bodyModel[378] = new ModelRendererTurbo(this, 78, 73, textureX, textureY); // Ditch light bottom L
		bodyModel[379] = new ModelRendererTurbo(this, 7, 68, textureX, textureY); // Front light bottom R
		bodyModel[380] = new ModelRendererTurbo(this, 4, 62, textureX, textureY); // Front light top L
		bodyModel[381] = new ModelRendererTurbo(this, 4, 65, textureX, textureY); // Front light top R
		bodyModel[382] = new ModelRendererTurbo(this, 56, 101, textureX, textureY); // Box 165
		bodyModel[383] = new ModelRendererTurbo(this, 84, 95, textureX, textureY); // Box 160
		bodyModel[384] = new ModelRendererTurbo(this, 97, 99, textureX, textureY); // Box 159
		bodyModel[385] = new ModelRendererTurbo(this, 129, 88, textureX, textureY); // Box 54
		bodyModel[386] = new ModelRendererTurbo(this, 40, 94, textureX, textureY); // Box 165
		bodyModel[387] = new ModelRendererTurbo(this, 108, 101, textureX, textureY); // Box 165
		bodyModel[388] = new ModelRendererTurbo(this, 126, 95, textureX, textureY); // Box 165
		bodyModel[389] = new ModelRendererTurbo(this, 73, 99, textureX, textureY); // Box 306
		bodyModel[390] = new ModelRendererTurbo(this, 110, 7, textureX, textureY); // Box 41
		bodyModel[391] = new ModelRendererTurbo(this, 96, 9, textureX, textureY); // Box 41
		bodyModel[392] = new ModelRendererTurbo(this, 2, 133, textureX, textureY); // Box 312
		bodyModel[393] = new ModelRendererTurbo(this, 21, 131, textureX, textureY); // Box 312
		bodyModel[394] = new ModelRendererTurbo(this, 13, 134, textureX, textureY); // Box 312
		bodyModel[395] = new ModelRendererTurbo(this, 1, 136, textureX, textureY); // Box 312
		bodyModel[396] = new ModelRendererTurbo(this, 40, 141, textureX, textureY); // Box 312
		bodyModel[397] = new ModelRendererTurbo(this, 41, 133, textureX, textureY); // Box 312
		bodyModel[398] = new ModelRendererTurbo(this, 36, 133, textureX, textureY); // Box 312
		bodyModel[399] = new ModelRendererTurbo(this, 52, 134, textureX, textureY); // Box 312
		bodyModel[400] = new ModelRendererTurbo(this, 58, 139, textureX, textureY); // Box 312
		bodyModel[401] = new ModelRendererTurbo(this, 20, 143, textureX, textureY); // Box 312
		bodyModel[402] = new ModelRendererTurbo(this, 29, 138, textureX, textureY); // Box 312
		bodyModel[403] = new ModelRendererTurbo(this, 43, 166, textureX, textureY); // Box 131
		bodyModel[404] = new ModelRendererTurbo(this, 43, 163, textureX, textureY); // Box 131
		bodyModel[405] = new ModelRendererTurbo(this, 48, 169, textureX, textureY); // Box 131
		bodyModel[406] = new ModelRendererTurbo(this, 38, 163, textureX, textureY); // Box 131
		bodyModel[407] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 131
		bodyModel[408] = new ModelRendererTurbo(this, 43, 160, textureX, textureY); // Box 131
		bodyModel[409] = new ModelRendererTurbo(this, 41, 173, textureX, textureY); // Box 131
		bodyModel[410] = new ModelRendererTurbo(this, 41, 179, textureX, textureY); // Box 131
		bodyModel[411] = new ModelRendererTurbo(this, 33, 175, textureX, textureY); // Box 131
		bodyModel[412] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 131
		bodyModel[413] = new ModelRendererTurbo(this, 6, 161, textureX, textureY); // Box 131
		bodyModel[414] = new ModelRendererTurbo(this, 8, 186, textureX, textureY); // Box 131
		bodyModel[415] = new ModelRendererTurbo(this, 6, 175, textureX, textureY); // Box 131
		bodyModel[416] = new ModelRendererTurbo(this, 13, 160, textureX, textureY); // Box 131
		bodyModel[417] = new ModelRendererTurbo(this, 8, 166, textureX, textureY); // Box 131
		bodyModel[418] = new ModelRendererTurbo(this, 1, 175, textureX, textureY); // Box 131
		bodyModel[419] = new ModelRendererTurbo(this, 15, 175, textureX, textureY); // Box 131
		bodyModel[420] = new ModelRendererTurbo(this, 3, 166, textureX, textureY); // Box 131
		bodyModel[421] = new ModelRendererTurbo(this, 13, 166, textureX, textureY); // Box 131
		bodyModel[422] = new ModelRendererTurbo(this, 24, 175, textureX, textureY); // Box 131
		bodyModel[423] = new ModelRendererTurbo(this, 27, 170, textureX, textureY); // Box 131
		bodyModel[424] = new ModelRendererTurbo(this, 24, 160, textureX, textureY); // Box 131
		bodyModel[425] = new ModelRendererTurbo(this, 31, 144, textureX, textureY); // Box 312
		bodyModel[426] = new ModelRendererTurbo(this, 21, 160, textureX, textureY); // Box 131
		bodyModel[427] = new ModelRendererTurbo(this, 68, 131, textureX, textureY); // Standard Seat
		bodyModel[428] = new ModelRendererTurbo(this, 69, 148, textureX, textureY); // Standard Seat
		bodyModel[429] = new ModelRendererTurbo(this, 76, 142, textureX, textureY); // Box 105
		bodyModel[430] = new ModelRendererTurbo(this, 76, 145, textureX, textureY); // Box 104
		bodyModel[431] = new ModelRendererTurbo(this, 89, 151, textureX, textureY); // Box 103
		bodyModel[432] = new ModelRendererTurbo(this, 114, 151, textureX, textureY); // Box 110
		bodyModel[433] = new ModelRendererTurbo(this, 101, 147, textureX, textureY); // Box 109
		bodyModel[434] = new ModelRendererTurbo(this, 101, 150, textureX, textureY); // Box 108
		bodyModel[435] = new ModelRendererTurbo(this, 99, 153, textureX, textureY); // Box 107
		bodyModel[436] = new ModelRendererTurbo(this, 98, 141, textureX, textureY); // Box 106
		bodyModel[437] = new ModelRendererTurbo(this, 444, 111, textureX, textureY); // Box 271
		bodyModel[438] = new ModelRendererTurbo(this, 466, 111, textureX, textureY); // Box 271
		bodyModel[439] = new ModelRendererTurbo(this, 442, 142, textureX, textureY); // Box 100
		bodyModel[440] = new ModelRendererTurbo(this, 476, 142, textureX, textureY); // Box 100
		bodyModel[441] = new ModelRendererTurbo(this, 61, 45, textureX, textureY); // Box 76
		bodyModel[442] = new ModelRendererTurbo(this, 105, 54, textureX, textureY); // Box 76
		bodyModel[443] = new ModelRendererTurbo(this, 103, 45, textureX, textureY); // Box 76
		bodyModel[444] = new ModelRendererTurbo(this, 77, 21, textureX, textureY); // Box 75
		bodyModel[445] = new ModelRendererTurbo(this, 101, 19, textureX, textureY); // Box 75
		bodyModel[446] = new ModelRendererTurbo(this, 93, 21, textureX, textureY); // Box 75
		bodyModel[447] = new ModelRendererTurbo(this, 43, 87, textureX, textureY); // Box 54
		bodyModel[448] = new ModelRendererTurbo(this, 23, 286, textureX, textureY); // Box 55
		bodyModel[449] = new ModelRendererTurbo(this, 28, 286, textureX, textureY); // Box 54
		bodyModel[450] = new ModelRendererTurbo(this, 37, 286, textureX, textureY); // Box 54
		bodyModel[451] = new ModelRendererTurbo(this, 8, 238, textureX, textureY); // Box 55
		bodyModel[452] = new ModelRendererTurbo(this, 16, 236, textureX, textureY); // Box 54
		bodyModel[453] = new ModelRendererTurbo(this, 17, 242, textureX, textureY); // Box 54
		bodyModel[454] = new ModelRendererTurbo(this, 22, 242, textureX, textureY); // Box 54
		bodyModel[455] = new ModelRendererTurbo(this, 23, 236, textureX, textureY); // Box 54
		bodyModel[456] = new ModelRendererTurbo(this, 1, 242, textureX, textureY); // Box 54
		bodyModel[457] = new ModelRendererTurbo(this, 2, 239, textureX, textureY); // Box 54
		bodyModel[458] = new ModelRendererTurbo(this, 17, 239, textureX, textureY); // Box 54
		bodyModel[459] = new ModelRendererTurbo(this, 6, 237, textureX, textureY); // Box 54
		bodyModel[460] = new ModelRendererTurbo(this, 6, 234, textureX, textureY); // Box 54
		bodyModel[461] = new ModelRendererTurbo(this, 2, 256, textureX, textureY); // Box 55
		bodyModel[462] = new ModelRendererTurbo(this, 9, 263, textureX, textureY); // Box 54
		bodyModel[463] = new ModelRendererTurbo(this, 18, 260, textureX, textureY); // Box 54
		bodyModel[464] = new ModelRendererTurbo(this, 16, 263, textureX, textureY); // Box 54
		bodyModel[465] = new ModelRendererTurbo(this, 9, 257, textureX, textureY); // Box 54
		bodyModel[466] = new ModelRendererTurbo(this, 9, 254, textureX, textureY); // Box 54
		bodyModel[467] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 54
		bodyModel[468] = new ModelRendererTurbo(this, 14, 257, textureX, textureY); // Box 54
		bodyModel[469] = new ModelRendererTurbo(this, 13, 260, textureX, textureY); // Box 54
		bodyModel[470] = new ModelRendererTurbo(this, 3, 263, textureX, textureY); // Box 55
		bodyModel[471] = new ModelRendererTurbo(this, 31, 262, textureX, textureY); // Box 55
		bodyModel[472] = new ModelRendererTurbo(this, 31, 259, textureX, textureY); // Box 54
		bodyModel[473] = new ModelRendererTurbo(this, 38, 260, textureX, textureY); // Box 54
		bodyModel[474] = new ModelRendererTurbo(this, 32, 256, textureX, textureY); // Box 54
		bodyModel[475] = new ModelRendererTurbo(this, 30, 263, textureX, textureY); // Box 54
		bodyModel[476] = new ModelRendererTurbo(this, 38, 263, textureX, textureY); // Box 54
		bodyModel[477] = new ModelRendererTurbo(this, 34, 268, textureX, textureY); // Box 54
		bodyModel[478] = new ModelRendererTurbo(this, 1, 277, textureX, textureY); // Box 55
		bodyModel[479] = new ModelRendererTurbo(this, 1, 274, textureX, textureY); // Glow lamp Beacon
		bodyModel[480] = new ModelRendererTurbo(this, 19, 274, textureX, textureY); // Box 55
		bodyModel[481] = new ModelRendererTurbo(this, 14, 277, textureX, textureY); // Box 55
		bodyModel[482] = new ModelRendererTurbo(this, 14, 280, textureX, textureY); // Box 55
		bodyModel[483] = new ModelRendererTurbo(this, 9, 274, textureX, textureY); // Box 55
		bodyModel[484] = new ModelRendererTurbo(this, 13, 270, textureX, textureY); // Box 55
		bodyModel[485] = new ModelRendererTurbo(this, 14, 274, textureX, textureY); // Box 55
		bodyModel[486] = new ModelRendererTurbo(this, 78, 76, textureX, textureY); // Box 232
		bodyModel[487] = new ModelRendererTurbo(this, 98, 76, textureX, textureY); // Box 232
		bodyModel[488] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Front light bottom L
		bodyModel[489] = new ModelRendererTurbo(this, 98, 73, textureX, textureY); // Ditch light bottom R
		bodyModel[490] = new ModelRendererTurbo(this, 175, 85, textureX, textureY); // Box 268
		bodyModel[491] = new ModelRendererTurbo(this, 170, 85, textureX, textureY); // Box 264
		bodyModel[492] = new ModelRendererTurbo(this, 184, 85, textureX, textureY); // Box 264
		bodyModel[493] = new ModelRendererTurbo(this, 175, 82, textureX, textureY); // Box 268
		bodyModel[494] = new ModelRendererTurbo(this, 170, 82, textureX, textureY); // Box 264
		bodyModel[495] = new ModelRendererTurbo(this, 184, 82, textureX, textureY); // Box 264
		bodyModel[496] = new ModelRendererTurbo(this, 175, 79, textureX, textureY); // Box 268
		bodyModel[497] = new ModelRendererTurbo(this, 170, 79, textureX, textureY); // Box 264
		bodyModel[498] = new ModelRendererTurbo(this, 184, 79, textureX, textureY); // Box 264
		bodyModel[499] = new ModelRendererTurbo(this, 1, 295, textureX, textureY); // Box 103

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,-3F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -4F, -3F, 0F, -5F, -3F, 0F, 0F, 2F, 0F, -1.25F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 99
		bodyModel[0].setRotationPoint(-51F, -8.5F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[1].setRotationPoint(-50F, -13.5F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 96
		bodyModel[2].setRotationPoint(-48F, -14.5F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[3].setRotationPoint(-51F, -13.5F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[4].setRotationPoint(-52F, -11.5F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 92
		bodyModel[5].setRotationPoint(-53F, -8.5F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F); // Box 84
		bodyModel[6].setRotationPoint(-48F, -9.5F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F); // Box 83
		bodyModel[7].setRotationPoint(-47F, -9.5F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 81
		bodyModel[8].setRotationPoint(-47F, -11.5F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.35F); // Box 80
		bodyModel[9].setRotationPoint(-48F, -11.5F, 9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[10].setRotationPoint(-48F, -14.5F, 4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 77
		bodyModel[11].setRotationPoint(-50F, -13.5F, 5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 76
		bodyModel[12].setRotationPoint(-51F, -11.5F, 5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, -1F, -1F, 1F, 0F); // Box 75
		bodyModel[13].setRotationPoint(-49F, -14.5F, 2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 74
		bodyModel[14].setRotationPoint(-51F, -13.5F, 2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 73
		bodyModel[15].setRotationPoint(-52F, -11.5F, 2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 69
		bodyModel[16].setRotationPoint(-48F, -8.5F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 68
		bodyModel[17].setRotationPoint(-52F, -8.5F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 67
		bodyModel[18].setRotationPoint(-51F, -11.5F, -2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[19].setRotationPoint(-51F, -13.5F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 65
		bodyModel[20].setRotationPoint(-49F, -14.5F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[21].setRotationPoint(-45F, -11.5F, 10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[22].setRotationPoint(-47F, -14.5F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[23].setRotationPoint(-47F, -14.5F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[24].setRotationPoint(-45F, -11.5F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 15, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[25].setRotationPoint(-45F, -9.5F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, -1F, 0F, -2F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 108
		bodyModel[26].setRotationPoint(-48F, -13.5F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[27].setRotationPoint(-48F, -11.5F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.35F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[28].setRotationPoint(-48F, -9.5F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 102
		bodyModel[29].setRotationPoint(-47F, -9.5F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F); // Box 100
		bodyModel[30].setRotationPoint(-48F, -8.5F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, -0.3F, -0.5F, 0F, 0F, -0.6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 109
		bodyModel[31].setRotationPoint(-41F, -13.5F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 82, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-36F, -19.5F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 82, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F); // Box 36
		bodyModel[33].setRotationPoint(-36F, -19.5F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 82, 2, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 103
		bodyModel[34].setRotationPoint(-36F, -18.5F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 82, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 102
		bodyModel[35].setRotationPoint(-36F, -17F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 82, 3, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 64
		bodyModel[36].setRotationPoint(-36F, -19.5F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 82, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.4F, 0F, 0F, -1.4F, 0F); // Box 65
		bodyModel[37].setRotationPoint(-36F, -18.5F, -10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 82, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 66
		bodyModel[38].setRotationPoint(-36F, -17F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F); // Box 232
		bodyModel[39].setRotationPoint(-53.15F, -3F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.05F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 232
		bodyModel[40].setRotationPoint(-52.45F, -6.5F, 2.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.1F, -0.5F, 0F); // Box 232
		bodyModel[41].setRotationPoint(-53.15F, -3F, 2.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 232
		bodyModel[42].setRotationPoint(-53.3F, -6.5F, 2.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 232
		bodyModel[43].setRotationPoint(-50.45F, -10.5F, 7F);
		bodyModel[43].rotateAngleY = -0.4712389F;
		bodyModel[43].rotateAngleZ = -0.17453293F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F); // Glow lamp Right
		bodyModel[44].setRotationPoint(-50.45F, -10.5F, 7F);
		bodyModel[44].rotateAngleY = -0.4712389F;
		bodyModel[44].rotateAngleZ = -0.17453293F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F); // Box 232
		bodyModel[45].setRotationPoint(-53.3F, -6.5F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.05F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 232
		bodyModel[46].setRotationPoint(-52.45F, -6.5F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171 lamp
		bodyModel[47].setRotationPoint(-53F, -8F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170 lamp
		bodyModel[48].setRotationPoint(-53F, -6F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169 lamp
		bodyModel[49].setRotationPoint(-53F, -8F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 168 lamp
		bodyModel[50].setRotationPoint(-53F, -6F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 167 lamp
		bodyModel[51].setRotationPoint(-51.5F, -12.25F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166 lamp
		bodyModel[52].setRotationPoint(-51.5F, -12.25F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165 lamp
		bodyModel[53].setRotationPoint(-51.5F, -14.25F, -2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164 lamp
		bodyModel[54].setRotationPoint(-51.5F, -14.25F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 123
		bodyModel[55].setRotationPoint(-56F, 3F, -1.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 122
		bodyModel[56].setRotationPoint(-55F, 3F, -0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 120
		bodyModel[57].setRotationPoint(-57F, 3F, 0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[58].setRotationPoint(-57F, 3F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,-0.05F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -2.75F, -0.5F, -0.25F, 2.45F, -0.5F, -0.5F, 0.2F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -2.75F, -0.5F, -0.25F, 2.7F, -0.5F, -0.5F); // Box 111
		bodyModel[59].setRotationPoint(-48.75F, -9F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 232
		bodyModel[60].setRotationPoint(-49.95F, -10.5F, -8F);
		bodyModel[60].rotateAngleY = 0.4712389F;
		bodyModel[60].rotateAngleZ = -0.17453293F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F); // Glow lamp Left
		bodyModel[61].setRotationPoint(-49.95F, -10.5F, -8F);
		bodyModel[61].rotateAngleY = 0.50614548F;
		bodyModel[61].rotateAngleZ = -0.17453293F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,-3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, -5F, -1.5F, 0F, -5F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 96
		bodyModel[62].setRotationPoint(-51F, -8.5F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 10, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 100
		bodyModel[63].setRotationPoint(-53F, -8.5F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,2.45F, -0.5F, -0.5F, -2.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, -0.05F, -0.5F, -0.25F, 2.7F, -0.5F, -0.5F, -2.75F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, 0.2F, -0.5F, -0.25F); // Box 101
		bodyModel[64].setRotationPoint(-48.75F, -9F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 103
		bodyModel[65].setRotationPoint(-52.5F, -14.25F, 1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[66].setRotationPoint(-27F, -20F, -4.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[67].setRotationPoint(-27F, -21F, -4.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[68].setRotationPoint(-26F, -20F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[69].setRotationPoint(-28F, -21F, 2.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[70].setRotationPoint(-27F, -21F, 4.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[71].setRotationPoint(-28F, -21F, 4.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[72].setRotationPoint(-29F, -21F, 2.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F); // Box 54
		bodyModel[73].setRotationPoint(-24F, -21F, -4.5F);

		bodyModel[74].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[74].setRotationPoint(36F, -20.5F, -3F);

		bodyModel[75].addShapeBox(2F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[75].setRotationPoint(17.25F, -21.5F, -2F);

		bodyModel[76].addShapeBox(2F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[76].setRotationPoint(1.25F, -21.5F, -2F);

		bodyModel[77].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[77].setRotationPoint(38F, -20.5F, -3F);

		bodyModel[78].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[78].setRotationPoint(14.75F, -20.5F, -3F);

		bodyModel[79].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[79].setRotationPoint(12.75F, -20.5F, -3F);

		bodyModel[80].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[80].setRotationPoint(10.75F, -20.5F, -3F);

		bodyModel[81].addShapeBox(2F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[81].setRotationPoint(10.75F, -20.5F, -1F);

		bodyModel[82].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[82].setRotationPoint(12.75F, -20.5F, 1F);

		bodyModel[83].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 181
		bodyModel[83].setRotationPoint(14.75F, -20.5F, 1F);

		bodyModel[84].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 180
		bodyModel[84].setRotationPoint(10.75F, -20.5F, 1F);

		bodyModel[85].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[85].setRotationPoint(7F, -20.5F, -3F);

		bodyModel[86].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[86].setRotationPoint(5F, -20.5F, -3F);

		bodyModel[87].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[87].setRotationPoint(3F, -20.5F, -3F);

		bodyModel[88].addShapeBox(2F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[88].setRotationPoint(3F, -20.5F, -1F);

		bodyModel[89].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[89].setRotationPoint(5F, -20.5F, 1F);

		bodyModel[90].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 174
		bodyModel[90].setRotationPoint(7F, -20.5F, 1F);

		bodyModel[91].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 173
		bodyModel[91].setRotationPoint(3F, -20.5F, 1F);

		bodyModel[92].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 172
		bodyModel[92].setRotationPoint(-1.5F, -20.5F, 1F);

		bodyModel[93].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 171
		bodyModel[93].setRotationPoint(-5.5F, -20.5F, 1F);

		bodyModel[94].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[94].setRotationPoint(-1.5F, -20.5F, -3F);

		bodyModel[95].addShapeBox(2F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F); // Box 169
		bodyModel[95].setRotationPoint(-16.5F, -20.5F, 1.5F);

		bodyModel[96].addShapeBox(2F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[96].setRotationPoint(-10.5F, -20.5F, -4.5F);

		bodyModel[97].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[97].setRotationPoint(-5.5F, -20.5F, -3F);

		bodyModel[98].addShapeBox(2F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[98].setRotationPoint(-16.5F, -20.5F, -4.5F);

		bodyModel[99].addShapeBox(2F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0.5F, 0F); // Box 169
		bodyModel[99].setRotationPoint(-10.5F, -20.5F, 1.5F);

		bodyModel[100].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[100].setRotationPoint(-3.5F, -20.5F, -3F);

		bodyModel[101].addShapeBox(2F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 167
		bodyModel[101].setRotationPoint(-13.5F, -20.5F, 1.5F);

		bodyModel[102].addShapeBox(2F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[102].setRotationPoint(-13.5F, -20.5F, -4.5F);

		bodyModel[103].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[103].setRotationPoint(-3.5F, -20.5F, 1F);

		bodyModel[104].addShapeBox(2F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[104].setRotationPoint(-5.5F, -20.5F, -1F);

		bodyModel[105].addShapeBox(2F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[105].setRotationPoint(-16.5F, -20.5F, -1.5F);

		bodyModel[106].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 199
		bodyModel[106].setRotationPoint(36F, -20.5F, -1F);

		bodyModel[107].addShapeBox(2F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 199
		bodyModel[107].setRotationPoint(38F, -20.5F, -1F);

		bodyModel[108].addShapeBox(2F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 199
		bodyModel[108].setRotationPoint(40F, -20.5F, 2F);

		bodyModel[109].addShapeBox(2F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[109].setRotationPoint(40F, -20.5F, 1F);

		bodyModel[110].addShapeBox(2F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 199
		bodyModel[110].setRotationPoint(39F, -20.5F, 2F);

		bodyModel[111].addShapeBox(2F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[111].setRotationPoint(39F, -20.5F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 198
		bodyModel[112].setRotationPoint(20.5F, -21.5F, 3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[113].setRotationPoint(20.5F, -21.5F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 196
		bodyModel[114].setRotationPoint(20.5F, -22.5F, -3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 195
		bodyModel[115].setRotationPoint(28.5F, -21.5F, -3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[116].setRotationPoint(20.5F, -21.5F, -3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[117].setRotationPoint(25.5F, -20.5F, -3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[118].setRotationPoint(23.5F, -20.5F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[119].setRotationPoint(21.5F, -20.5F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[120].setRotationPoint(21.5F, -20.5F, -1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[121].setRotationPoint(23.5F, -20.5F, 1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 188
		bodyModel[122].setRotationPoint(25.5F, -20.5F, 1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 187
		bodyModel[123].setRotationPoint(21.5F, -20.5F, 1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[124].setRotationPoint(46F, -19.5F, -4F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[125].setRotationPoint(46.75F, -19.5F, -2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, -1F, -1.4F, 0F, -0.25F, -2F, 0F, 0F, -2F, 0F); // Box 115
		bodyModel[126].setRotationPoint(46F, -19.5F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[127].setRotationPoint(46.75F, -19.5F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[128].setRotationPoint(46.75F, -19.5F, 2F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 54, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[129].setRotationPoint(-25F, -15.5F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[130].setRotationPoint(46F, -17F, -3.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[131].setRotationPoint(46F, -15F, 4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 18, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[132].setRotationPoint(45F, -15.5F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[133].setRotationPoint(46F, -15F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, -0.5F, 0F); // Box 268
		bodyModel[134].setRotationPoint(46F, 1F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[135].setRotationPoint(50F, 3F, -0.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 266
		bodyModel[136].setRotationPoint(48F, 3F, 0.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 265
		bodyModel[137].setRotationPoint(48F, 3F, -0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 264
		bodyModel[138].setRotationPoint(46F, 3.5F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[139].setRotationPoint(48F, 3F, -1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 69, 7, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.8F, 0F, -4F, -0.8F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 204
		bodyModel[140].setRotationPoint(-24F, -15F, -11.9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[141].setRotationPoint(45F, 2.5F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 12, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[142].setRotationPoint(34F, -15.5F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[143].setRotationPoint(29F, -15.5F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Left front door
		bodyModel[144].setRotationPoint(-30F, -15.5F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Left back door
		bodyModel[145].setRotationPoint(29F, -11.5F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[146].setRotationPoint(29F, -0.5F, -11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 122
		bodyModel[147].setRotationPoint(30F, 3.5F, -11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[148].setRotationPoint(30F, 5.5F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[149].setRotationPoint(33F, 1.5F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[150].setRotationPoint(29F, 1.5F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[151].setRotationPoint(33F, 4.5F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 122
		bodyModel[152].setRotationPoint(29F, 4.5F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 226
		bodyModel[153].setRotationPoint(-31F, -15F, -12F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 226
		bodyModel[154].setRotationPoint(-25F, -15F, -12F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 226
		bodyModel[155].setRotationPoint(-25F, 0F, -12F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 226
		bodyModel[156].setRotationPoint(-31F, 0F, -12F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 219
		bodyModel[157].setRotationPoint(-25F, -15F, -12.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 218
		bodyModel[158].setRotationPoint(-31F, -15F, -12.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 118
		bodyModel[159].setRotationPoint(-29F, -4.5F, -11F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 117
		bodyModel[160].setRotationPoint(-29F, 0.5F, -11.8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 122
		bodyModel[161].setRotationPoint(-29F, 3.5F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[162].setRotationPoint(-29F, 6.5F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[163].setRotationPoint(-26F, 1.5F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[164].setRotationPoint(-30F, 1.5F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[165].setRotationPoint(-26F, 4.5F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 122
		bodyModel[166].setRotationPoint(-30F, 4.5F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[167].setRotationPoint(-29F, -4.5F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 229
		bodyModel[168].setRotationPoint(28F, -11F, -12.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 228
		bodyModel[169].setRotationPoint(34F, -11F, -12.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 226
		bodyModel[170].setRotationPoint(34F, -11F, -12F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 226
		bodyModel[171].setRotationPoint(28F, 0F, -12F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 226
		bodyModel[172].setRotationPoint(28F, -11F, -12F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 226
		bodyModel[173].setRotationPoint(34F, 0F, -12F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[174].setRotationPoint(44.5F, 4.5F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[175].setRotationPoint(41.5F, 5.5F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 226
		bodyModel[176].setRotationPoint(40.5F, 4.5F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[177].setRotationPoint(40.5F, 1.5F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[178].setRotationPoint(41.5F, 3.5F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[179].setRotationPoint(44.5F, 1.5F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 230
		bodyModel[180].setRotationPoint(40.5F, -7F, -12.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 231
		bodyModel[181].setRotationPoint(44.5F, -7F, -12.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 232
		bodyModel[182].setRotationPoint(40.5F, -7F, -12F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 233
		bodyModel[183].setRotationPoint(44.5F, -7F, -12F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 234
		bodyModel[184].setRotationPoint(44.5F, 0.5F, -12F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 235
		bodyModel[185].setRotationPoint(40.5F, 0.5F, -12F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[186].setRotationPoint(-30F, -4.5F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[187].setRotationPoint(-26F, -4.5F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 239
		bodyModel[188].setRotationPoint(-29F, -2.5F, -11.8F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[189].setRotationPoint(-12F, 0F, -10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 26, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		bodyModel[190].setRotationPoint(-11.5F, 1.5F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 17, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[191].setRotationPoint(-2F, 0.5F, -10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[192].setRotationPoint(14.5F, 1.5F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 8, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[193].setRotationPoint(-12F, 5F, -8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 17, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[194].setRotationPoint(-2F, 5.5F, -8F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[195].setRotationPoint(-12F, 5F, -10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[196].setRotationPoint(-2F, 5.5F, -10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 124
		bodyModel[197].setRotationPoint(-12F, 5F, 8F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 121
		bodyModel[198].setRotationPoint(-2F, 5.5F, 8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F); // Box 254
		bodyModel[199].setRotationPoint(-15.5F, 1.5F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 26, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 255
		bodyModel[200].setRotationPoint(-11.5F, 1.5F, 10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F); // Box 256
		bodyModel[201].setRotationPoint(14.5F, 1.5F, 10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F); // Box 257
		bodyModel[202].setRotationPoint(-15.5F, 1.5F, 10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 54, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[203].setRotationPoint(-25F, -15.5F, 10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 69, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -0.8F, 0F, -4F, -0.8F); // Box 259
		bodyModel[204].setRotationPoint(-24F, -15F, 10.9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right front door
		bodyModel[205].setRotationPoint(-30F, -15.5F, 10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 261
		bodyModel[206].setRotationPoint(-31F, -15F, 11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 262
		bodyModel[207].setRotationPoint(-25F, -15F, 11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 263
		bodyModel[208].setRotationPoint(-25F, 0F, 11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 264
		bodyModel[209].setRotationPoint(-31F, 0F, 11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 265
		bodyModel[210].setRotationPoint(-25F, -15F, 11.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 266
		bodyModel[211].setRotationPoint(-31F, -15F, 11.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 267
		bodyModel[212].setRotationPoint(-29F, -4.5F, 10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 268
		bodyModel[213].setRotationPoint(-29F, 0.5F, 10.8F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 269
		bodyModel[214].setRotationPoint(-29F, 3.5F, 10F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[215].setRotationPoint(-29F, 6.5F, 10F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[216].setRotationPoint(-26F, 1.5F, 10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[217].setRotationPoint(-30F, 1.5F, 10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[218].setRotationPoint(-26F, 4.5F, 10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 274
		bodyModel[219].setRotationPoint(-30F, 4.5F, 10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 275
		bodyModel[220].setRotationPoint(-29F, -4.5F, 10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[221].setRotationPoint(-30F, -4.5F, 10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[222].setRotationPoint(-26F, -4.5F, 10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 278
		bodyModel[223].setRotationPoint(-29F, -2.5F, 10.8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 12, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[224].setRotationPoint(34F, -15.5F, 10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[225].setRotationPoint(29F, -15.5F, 10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 5, 11, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Right back door
		bodyModel[226].setRotationPoint(29F, -11.5F, 10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[227].setRotationPoint(29F, -0.5F, 10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[228].setRotationPoint(33F, 1.5F, 10F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 284
		bodyModel[229].setRotationPoint(30F, 3.5F, 10F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[230].setRotationPoint(30F, 5.5F, 10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[231].setRotationPoint(29F, 1.5F, 10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[232].setRotationPoint(33F, 4.5F, 10F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 288
		bodyModel[233].setRotationPoint(29F, 4.5F, 10F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[234].setRotationPoint(44.5F, 4.5F, 10F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[235].setRotationPoint(41.5F, 5.5F, 10F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Box 291
		bodyModel[236].setRotationPoint(40.5F, 4.5F, 10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[237].setRotationPoint(40.5F, 1.5F, 10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 293
		bodyModel[238].setRotationPoint(41.5F, 3.5F, 10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[239].setRotationPoint(44.5F, 1.5F, 10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 295
		bodyModel[240].setRotationPoint(28F, -11F, 11.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 296
		bodyModel[241].setRotationPoint(34F, -11F, 11.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 297
		bodyModel[242].setRotationPoint(34F, -11F, 11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 298
		bodyModel[243].setRotationPoint(28F, 0F, 11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 299
		bodyModel[244].setRotationPoint(28F, -11F, 11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 300
		bodyModel[245].setRotationPoint(34F, 0F, 11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 301
		bodyModel[246].setRotationPoint(40.5F, -7F, 11.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 302
		bodyModel[247].setRotationPoint(44.5F, -7F, 11.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 303
		bodyModel[248].setRotationPoint(40.5F, -7F, 11F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 304
		bodyModel[249].setRotationPoint(44.5F, -7F, 11F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 305
		bodyModel[250].setRotationPoint(44.5F, 0.5F, 11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 306
		bodyModel[251].setRotationPoint(40.5F, 0.5F, 11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -5F, 0F, 0F, 5.05F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 5.05F, 0F); // Box 307
		bodyModel[252].setRotationPoint(-42F, -19.5F, -1F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.9F, -1.75F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, -0.625F, -1.25F, 0F, -1.55F, 0.75F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0F, 0F, -1.3F, 0.25F, 0F); // Box 308
		bodyModel[253].setRotationPoint(-40F, -19.5F, -4F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -2.15F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0.1F, -1.25F, 0F, -1.25F, 1.25F, 0F, 0.5F, 1F, 0F, -0.25F, 0F, 0F, -0.55F, 0.25F, 0F); // Box 309
		bodyModel[254].setRotationPoint(-39F, -19F, -7F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, -2F, 0F, 0.4F, -1F, 0F, 0F, 0F, 0F, 0F, -1.15F, 0F, -1.25F, 1F, 0F, 0.5F, 0.75F, 0F, 0F, 0F, 0F, -0.75F, 0.25F, 0F); // Box 310
		bodyModel[255].setRotationPoint(-38.5F, -18F, -9F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.7F, -0.5F, 0F, 0F, -0.15F, 0F, -0.4F, 0.4F, 0F, -0.2F, 0.25F, 0F, -0.7F, 0.5F, 0F, 0F, 0.115F, 0F, -0.4F, -0.6F, 0F, -0.2F, -0.15F, 0F); // Box 311
		bodyModel[256].setRotationPoint(-41F, -13.5F, -9F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[257].setRotationPoint(-42F, -11.5F, -10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.7F, -0.75F, 0F, 0.1F, -0.6F, 0F, -0.5F, 0.25F, 0F, -0.1F, 0F, 0F, -0.7F, 0.85F, 0F, 0.1F, 0.4F, 0F, -0.5F, -0.25F, 0F, -0.1F, 0.2F, 0F); // Box 313
		bodyModel[258].setRotationPoint(-41.5F, -14.5F, -7F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 318
		bodyModel[259].setRotationPoint(-37F, -17F, 9F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, -0.25F, -2F, 0F, -1F, -1.4F, 0F, 0F, -1.4F, 0F); // Box 319
		bodyModel[260].setRotationPoint(46F, -19.5F, 4F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[261].setRotationPoint(45F, -17.5F, -9F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[262].setRotationPoint(45F, -18F, -7F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 322
		bodyModel[263].setRotationPoint(45F, -19F, -4F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 323
		bodyModel[264].setRotationPoint(45F, -19F, -7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 324
		bodyModel[265].setRotationPoint(45F, -19F, 4F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[266].setRotationPoint(45F, -18F, -9F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[267].setRotationPoint(45F, -18F, 7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[268].setRotationPoint(45F, -17.5F, -10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 328
		bodyModel[269].setRotationPoint(45F, -17.5F, 9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, -0.5F, 0F, 0F, -0.25F, 0F, -0.55F, 0.15F, 0F, 0F, -0.5F, 0F, -0.6F, 0.7F, 0F, 0F, 0.25F, 0F, -0.65F, 0F, 0F, 0F, 0.55F, 0F); // Box 303
		bodyModel[270].setRotationPoint(-42F, -15F, -4F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 15, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[271].setRotationPoint(-45F, -9.5F, 10F);

		bodyModel[272].addBox(0F, 0F, 0F, 73, 1, 20, 0F); // Box 120
		bodyModel[272].setRotationPoint(-45F, -4.5F, -10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 90, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		bodyModel[273].setRotationPoint(-45F, -0.5F, -10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 15, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[274].setRotationPoint(28F, -15.5F, -10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[275].setRotationPoint(28F, -17.5F, 9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[276].setRotationPoint(28F, -17.5F, -9F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[277].setRotationPoint(28F, -18F, 7F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[278].setRotationPoint(28F, -18F, -7F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 313
		bodyModel[279].setRotationPoint(28F, -19F, 4F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 314
		bodyModel[280].setRotationPoint(28F, -19F, -4F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 315
		bodyModel[281].setRotationPoint(28F, -19F, -7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[282].setRotationPoint(28F, -18F, -9F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		bodyModel[283].setRotationPoint(28F, -17.5F, -10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 11, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 318
		bodyModel[284].setRotationPoint(-23F, -15.5F, -10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[285].setRotationPoint(-23F, -17.5F, 9F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[286].setRotationPoint(-23F, -17.5F, -9F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[287].setRotationPoint(-23F, -18F, 7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[288].setRotationPoint(-23F, -18F, -7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 323
		bodyModel[289].setRotationPoint(-23F, -19F, 4F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 324
		bodyModel[290].setRotationPoint(-23F, -19F, -4F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1.1F, 0F, 0F, -1.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 325
		bodyModel[291].setRotationPoint(-23F, -19F, -7F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[292].setRotationPoint(-23F, -18F, -9F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[293].setRotationPoint(-23F, -17.5F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 328
		bodyModel[294].setRotationPoint(-48F, -0.5F, -8.5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.95F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[295].setRotationPoint(-48F, -0.5F, -9.75F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 330
		bodyModel[296].setRotationPoint(-51F, -0.5F, -5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[297].setRotationPoint(-53.5F, -0.5F, -2F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 332
		bodyModel[298].setRotationPoint(-52.5F, -0.5F, -5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 333
		bodyModel[299].setRotationPoint(-51F, -0.5F, -9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.95F); // Box 334
		bodyModel[300].setRotationPoint(-48F, -0.5F, 8.75F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Box 335
		bodyModel[301].setRotationPoint(-52.5F, -0.5F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F); // Box 336
		bodyModel[302].setRotationPoint(-51F, -0.5F, 5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,-3F, 0F, -5F, 2F, 0F, -4F, 2F, 0F, -1F, -3F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, -1.25F, -3F, 0F, 0F); // Box 337
		bodyModel[303].setRotationPoint(-51F, -8.5F, 5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 10, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -3F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -5F, 1.5F, 0F, -5F); // Box 338
		bodyModel[304].setRotationPoint(-51F, -8.5F, 5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 339
		bodyModel[305].setRotationPoint(-48F, -13.5F, 7F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.55F, 0.15F, 0F, 0F, -0.25F, 0F, -0.6F, -0.5F, 0F, 0F, 0.55F, 0F, -0.65F, 0F, 0F, 0F, 0.25F, 0F, -0.6F, 0.7F, 0F); // Box 303
		bodyModel[306].setRotationPoint(-42F, -15F, 1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.1F, 0F, 0F, -0.5F, 0.25F, 0F, 0.1F, -0.6F, 0F, -0.7F, -0.75F, 0F, -0.1F, 0.2F, 0F, -0.5F, -0.25F, 0F, 0.1F, 0.4F, 0F, -0.7F, 0.85F, 0F); // Box 313
		bodyModel[307].setRotationPoint(-41.5F, -14.5F, 4F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.2F, 0.25F, 0F, -0.4F, 0.4F, 0F, 0F, -0.125F, 0F, -0.7F, -0.5F, 0F, -0.2F, -0.15F, 0F, -0.4F, -0.6F, 0F, 0F, 0.1F, 0F, -0.7F, 0.5F, 0F); // Box 311
		bodyModel[308].setRotationPoint(-41F, -13.5F, 7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.3F, 0F, 0F, -1.1F, 4F, 0F, -0.85F, 3.3F, 0F, 0F, -0.5F, 0F, 0.3F, 0F, 0F, -1F, -4.25F, 0F, -0.85F, -3.5F, 0F, 0F, 0.5F, 0F); // Box 311
		bodyModel[309].setRotationPoint(-40F, -13F, 9F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.5F, 0F, -0.85F, 4.3F, 0F, -0.5F, 3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.85F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -0.5F, 0F); // Box 311
		bodyModel[310].setRotationPoint(-40F, -12F, 10F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 304
		bodyModel[311].setRotationPoint(-36F, -15F, 10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[312].setRotationPoint(-31F, -15.5F, 10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 304
		bodyModel[313].setRotationPoint(-39F, -15F, 10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[314].setRotationPoint(-40F, -11.5F, 10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-3.15F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 304
		bodyModel[315].setRotationPoint(-40F, -15.5F, 10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 304
		bodyModel[316].setRotationPoint(-36F, -15F, -11F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[317].setRotationPoint(-31F, -15.5F, -11F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.15F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 304
		bodyModel[318].setRotationPoint(-37F, -15.5F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 304
		bodyModel[319].setRotationPoint(-39F, -15F, -11F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[320].setRotationPoint(-40F, -11.5F, -11F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 3.5F, 0F, -0.85F, 4.3F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -4F, 0F, -0.85F, -4F, 0F, 0F, -0.5F, 0F); // Box 311
		bodyModel[321].setRotationPoint(-40F, -12F, -11F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-3.5F, -0.5F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -3.15F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[322].setRotationPoint(-40F, -15.5F, -11F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.85F, 3.3F, 0F, -1.1F, 4F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, 0F, -0.85F, -3.5F, 0F, -1F, -4.25F, 0F, 0.3F, 0F, 0F); // Box 311
		bodyModel[323].setRotationPoint(-40F, -13F, -10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, -0.5F, 0F); // Box 304
		bodyModel[324].setRotationPoint(-37F, -15.5F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.63F, -1.25F, 0F, 0.5F, 0F, 0F, 1F, -0.5F, 0F, -0.9F, -1.75F, 0F, -1.3F, 0.25F, 0F, 0.5F, 0F, 0F, 0.75F, 0.5F, 0F, -1.55F, 0.75F, 0F); // Box 308
		bodyModel[325].setRotationPoint(-40F, -19.5F, 1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.1F, -1.25F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, -2.15F, 0F, -0.55F, 0.25F, 0F, -0.25F, 0F, 0F, 0.5F, 1F, 0F, -1.25F, 1.25F, 0F); // Box 309
		bodyModel[326].setRotationPoint(-39F, -19F, 4F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.15F, 0F, 0F, 0F, 0F, 0.4F, -1F, 0F, -0.6F, -2F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0.5F, 0.75F, 0F, -1.25F, 1F, 0F); // Box 310
		bodyModel[327].setRotationPoint(-38.5F, -18F, 7F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.4F, -1F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[328].setRotationPoint(-37.5F, -18F, -9F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.75F, 0.5F, 0F, -0.25F, 0.5F, 0F); // Box 39
		bodyModel[329].setRotationPoint(-38.5F, -19.5F, 1F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -2F, -1.5F, 0F, -1F, -1.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0F, 0F, -2F, 1.5F, 0F, -1F, 1.5F, 0F); // Box 39
		bodyModel[330].setRotationPoint(-38.5F, -19.5F, 4F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 39
		bodyModel[331].setRotationPoint(-38.5F, -19.5F, -4F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, -0.4F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F); // Box 39
		bodyModel[332].setRotationPoint(-37.5F, -18F, 7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.15F, -0.7F, -1F, 0F, 0F, -1F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.15F, 0.5F, -1F, 0F, 0.5F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 318
		bodyModel[333].setRotationPoint(-37F, -17F, 9F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, -0.15F, -0.7F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.15F, 0.5F, 0F); // Box 39
		bodyModel[334].setRotationPoint(-37F, -17F, 9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0F, 0F, 0.6F, 0F, -0.85F, -0.7F, 0F, -0.15F, -0.7F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, -0.85F, 0.5F, 0F, -0.15F, 0.5F, 0F); // Box 39
		bodyModel[335].setRotationPoint(-37F, -17F, 9F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -1F, -1.5F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.6F, 0F, -1F, 1.5F, 0F); // Box 370
		bodyModel[336].setRotationPoint(-38.5F, -19.5F, 4F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.5F, 0F); // Box 373
		bodyModel[337].setRotationPoint(-38.5F, -19.5F, 1F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, -1F, 0.5F, -1F); // Box 378
		bodyModel[338].setRotationPoint(-37F, -17F, -11F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, -1F, -0.15F, -0.7F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, -1F, -0.15F, 0.5F, -1F); // Box 379
		bodyModel[339].setRotationPoint(-37F, -17F, -11F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, -1F, 0.6F, 0F, -0.15F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 380
		bodyModel[340].setRotationPoint(-37F, -17F, -10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, -0.7F, 0F, -0.85F, -0.7F, 0F, 0F, 0.6F, 0F, 0.1F, 0F, 0F, -0.15F, 0.5F, 0F, -0.85F, 0.5F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 381
		bodyModel[341].setRotationPoint(-37F, -17F, -10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 109
		bodyModel[342].setRotationPoint(-42F, -13.5F, -10F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -0.4F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 109
		bodyModel[343].setRotationPoint(-42F, -14.75F, -4F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1.1F, 0F, -0.3F, -1F, 0F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, -0.3F, 1F, 0F, -0.8F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 109
		bodyModel[344].setRotationPoint(-41F, -14F, -9F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0.2F, -1F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0.2F, 1F, 0F, -0.4F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 109
		bodyModel[345].setRotationPoint(-42F, -14.75F, -7F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -0.4F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 109
		bodyModel[346].setRotationPoint(-42F, -14.75F, 1F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, -0.4F, 0.25F, 0F, 0.2F, 1F, 0F, 0F, 1F, 0F); // Box 109
		bodyModel[347].setRotationPoint(-42F, -14.75F, 4F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.3F, -1F, 0F, 0F, -1.1F, 0F, 0F, 0.25F, 0F, -0.8F, 0.25F, 0F, -0.3F, 1F, 0F, 0F, 1F, 0F); // Box 109
		bodyModel[348].setRotationPoint(-41F, -14F, 7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, -0.3F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 109
		bodyModel[349].setRotationPoint(-41F, -13.5F, 9F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.1F, 0.9F, 0F, 0F, 0F, 0F, -1F, -0.3F, 0F, -1F, -0.75F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.75F); // Box 128
		bodyModel[350].setRotationPoint(-45F, -12.5F, 10F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 128
		bodyModel[351].setRotationPoint(-42F, -12.5F, 10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, 0.5F, 0F, -0.1F, -0.1F, 0F, -1F, 0.25F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, 0.25F, 0F, 0F, -0.5F); // Box 128
		bodyModel[352].setRotationPoint(-47F, -12.5F, 9F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, -1.2F, -1.5F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 1F, -1.5F); // Box 41
		bodyModel[353].setRotationPoint(-47F, -13.5F, 7F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 0F, -3F); // Box 41
		bodyModel[354].setRotationPoint(-47F, -13.5F, 7F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 81
		bodyModel[355].setRotationPoint(-47F, -11.5F, -11F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[356].setRotationPoint(-45F, -11.5F, -11F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[357].setRotationPoint(-45F, -11.5F, -11F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.75F, 0F, -1F, -0.3F, 0F, 0F, 0F, 0F, -0.1F, 0.9F, 0F, 0F, -0.75F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0.9F); // Box 128
		bodyModel[358].setRotationPoint(-45F, -12.5F, -11F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, -0.3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[359].setRotationPoint(-42F, -12.5F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, -0.5F, 0F, -1F, 0.25F, 0F, -0.1F, -0.1F, 0F, -0.2F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.1F, 0F, 0F, 0.5F); // Box 128
		bodyModel[360].setRotationPoint(-47F, -12.5F, -10F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[361].setRotationPoint(-47F, -14.5F, 4F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 109
		bodyModel[362].setRotationPoint(-42F, -13.5F, 7F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, -0.75F, -0.35F, -0.65F); // Box 103
		bodyModel[363].setRotationPoint(-52.5F, -14.25F, 0F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, -0.75F, -0.8F, 0F); // Box 103
		bodyModel[364].setRotationPoint(-52.5F, -14.25F, -2F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.75F, 0F, -0.8F); // Box 103
		bodyModel[365].setRotationPoint(-52.5F, -14.25F, -2F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 103
		bodyModel[366].setRotationPoint(-52.5F, -12.25F, 1F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F); // Box 103
		bodyModel[367].setRotationPoint(-52.5F, -12.25F, -2F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, -0.75F, -0.35F, -0.65F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 103
		bodyModel[368].setRotationPoint(-52.5F, -11.25F, 0F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 103
		bodyModel[369].setRotationPoint(-52.5F, -11.25F, -2F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 103
		bodyModel[370].setRotationPoint(-54F, -8F, 1F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, -0.75F, -0.35F, -0.65F); // Box 103
		bodyModel[371].setRotationPoint(-54F, -8F, 0F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, -0.75F, -0.8F, 0F); // Box 103
		bodyModel[372].setRotationPoint(-54F, -8F, -2F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.75F, 0F, -0.8F); // Box 103
		bodyModel[373].setRotationPoint(-54F, -8F, -2F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.65F, -0.35F, 0F, -0.65F, -0.35F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 103
		bodyModel[374].setRotationPoint(-54F, -6F, 1F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.65F, -0.35F, -0.75F, -0.65F, -0.35F); // Box 103
		bodyModel[375].setRotationPoint(-54F, -6F, -2F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.35F, -0.65F, -0.75F, -0.35F, -0.65F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 103
		bodyModel[376].setRotationPoint(-54F, -5F, 0F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.8F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 103
		bodyModel[377].setRotationPoint(-54F, -5F, -2F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Ditch light bottom L
		bodyModel[378].setRotationPoint(-53.75F, -0.5F, 3F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front light bottom R
		bodyModel[379].setRotationPoint(-53F, -6.5F, -1.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front light top L
		bodyModel[380].setRotationPoint(-51.5F, -13.75F, -0.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front light top R
		bodyModel[381].setRotationPoint(-51.5F, -11.75F, -0.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,-1.75F, 0F, 0F, -1.25F, 0F, 0F, 0.75F, 0F, -1.5F, -4.05F, 0F, -0.95F, 0.25F, 0F, 0F, -3.25F, 0F, 0F, -0.9F, 0F, -1.6F, -2.4F, 0F, -1F); // Box 165
		bodyModel[382].setRotationPoint(-53F, 1.5F, 5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F); // Box 160
		bodyModel[383].setRotationPoint(-53F, 1.5F, -2F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,-2.75F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 159
		bodyModel[384].setRotationPoint(-54F, 1.5F, -5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1.75F, 0F, 0F, 0F, 1.055F, 0F, -0.35F, -1.25F, 0F, 0.75F, -1.25F, 0F, -1.25F, 1.055F, 0F, 0.35F); // Box 54
		bodyModel[385].setRotationPoint(-47F, 1.5F, -9.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 4, 7, 3, 0F,-4.75F, 0F, -1.5F, 2F, 0F, -2.5F, 2F, 0F, 0.5F, -4.05F, 0F, -0.95F, -3.1F, 0F, -1.4F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, -2.4F, 0F, -1F); // Box 165
		bodyModel[386].setRotationPoint(-53F, 1.5F, 6F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,-4.05F, 0F, -0.95F, 0.75F, 0F, -1.5F, -1.25F, 0F, 0F, -1.75F, 0F, 0F, -2.4F, 0F, -1F, -0.9F, 0F, -1.6F, -3.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 165
		bodyModel[387].setRotationPoint(-53F, 1.5F, -9F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 4, 7, 3, 0F,-4.05F, 0F, -0.95F, 2F, 0F, 0.5F, 2F, 0F, -2.5F, -4.75F, 0F, -1.5F, -2.4F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -3.1F, 0F, -1.4F); // Box 165
		bodyModel[388].setRotationPoint(-53F, 1.5F, -9F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 2, 7, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -2.75F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 306
		bodyModel[389].setRotationPoint(-54F, 1.5F, 2F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1.2F, -1.5F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, 1F, 0F, 0F, 1F, -3F, 0F, 0F, 0F); // Box 41
		bodyModel[390].setRotationPoint(-47F, -13.5F, -10F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -3F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[391].setRotationPoint(-47F, -13.5F, -10F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[392].setRotationPoint(-42F, -12.5F, -9F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[393].setRotationPoint(-42F, -14F, -6F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[394].setRotationPoint(-42F, -13F, -9F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[395].setRotationPoint(-42F, -12.5F, -10F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[396].setRotationPoint(-42F, -11.5F, 3F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[397].setRotationPoint(-42F, -12.5F, 3F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[398].setRotationPoint(-42F, -14F, 3F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[399].setRotationPoint(-42F, -13F, 6F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[400].setRotationPoint(-42F, -12.5F, 9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[401].setRotationPoint(-42F, -12.5F, -3F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[402].setRotationPoint(-42F, -13.5F, -3F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 131
		bodyModel[403].setRotationPoint(-38F, -12.8F, 7.45F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, -0.6F, -0.5F, -0.45F, -0.6F, -0.5F, -0.45F, -0.6F, -0.25F, -0.45F, -0.6F, -0.25F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.5F, -0.45F, -0.3F, -0.25F, -0.45F, -0.3F, -0.25F); // Box 131
		bodyModel[404].setRotationPoint(-38F, -12.8F, 7F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.7F, 0.1F, -0.9F, -0.7F, 0.1F, -0.9F, -0.7F, 0.1F, -0.8F, -0.7F, 0.1F, -0.8F, -0.7F, -0.5F, -0.9F, -0.7F, -0.5F, -0.9F, -0.7F, -1.3F, -0.8F, -0.7F, -1.3F, -0.8F); // Box 131
		bodyModel[405].setRotationPoint(-38.5F, -12F, 7.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 131
		bodyModel[406].setRotationPoint(-38F, -12.8F, 6.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 131
		bodyModel[407].setRotationPoint(-38F, -12.1F, 7.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 131
		bodyModel[408].setRotationPoint(-38F, -13.1F, 7F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.2F, -1.9F, -0.4F, -0.1F, -1.9F, -0.4F, -0.1F, -1.9F, -0.45F, -0.2F, -1.9F, -0.45F); // Box 131
		bodyModel[409].setRotationPoint(-38.5F, -10.1F, 7F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.1F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 131
		bodyModel[410].setRotationPoint(-38.5F, -9F, 7F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 131
		bodyModel[411].setRotationPoint(-38.25F, -11F, 5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 131
		bodyModel[412].setRotationPoint(-37.5F, -12.5F, 1F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, -0.75F, -1F, -1F, -0.75F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F, 0.15F, 0F, -1F, -1F, 0F, 0.15F); // Box 131
		bodyModel[413].setRotationPoint(-38.5F, -13.5F, 0.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[414].setRotationPoint(-37F, -11.5F, 1F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[415].setRotationPoint(-38F, -11.5F, 0F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -1.2F, -0.25F, -0.3F, 0.3F, 0F, -0.3F, -1.2F, -0.25F, -0.3F, 0.3F, 0F, -0.3F, -1.2F, -0.25F, -0.3F, 0.3F, 0F, -0.3F, -1.2F, -0.25F, -0.3F, 0.3F); // Box 131
		bodyModel[416].setRotationPoint(-38.75F, -12.5F, 2F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[417].setRotationPoint(-39F, -11.5F, 1F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[418].setRotationPoint(-37F, -11.5F, 0F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[419].setRotationPoint(-37F, -11.5F, 2F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[420].setRotationPoint(-39F, -11.5F, 0F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[421].setRotationPoint(-39F, -11.5F, 2F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[422].setRotationPoint(-40F, -9F, 4.2F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 131
		bodyModel[423].setRotationPoint(-39F, -11F, 4.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[424].setRotationPoint(-40F, -12.3F, 3F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[425].setRotationPoint(-42F, -13.5F, 1F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F, -0.5F, 0F, -1.25F, -1.5F, 0F, 0.25F, -0.25F, 0F, -1.25F, -1.25F, 0F, 0.25F); // Box 131
		bodyModel[426].setRotationPoint(-40.5F, -14.5F, 1.75F);

		bodyModel[427].addBox(0F, 0F, 0F, 6, 1, 9, 0F); // Standard Seat
		bodyModel[427].setRotationPoint(-29F, -7.5F, 0F);
		bodyModel[427].rotateAngleZ = 1.57079633F;

		bodyModel[428].addBox(0F, 0F, 0F, 5, 1, 9, 0F); // Standard Seat
		bodyModel[428].setRotationPoint(-34F, -8.5F, 0F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		bodyModel[429].setRotationPoint(-34F, -10F, 9F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[430].setRotationPoint(-34F, -10F, -1F);

		bodyModel[431].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 103
		bodyModel[431].setRotationPoint(-32F, -7.5F, 3.5F);

		bodyModel[432].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 110
		bodyModel[432].setRotationPoint(-32F, -7.5F, -8F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[433].setRotationPoint(-34F, -10F, -10F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[434].setRotationPoint(-34F, -10F, -5.5F);

		bodyModel[435].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 107
		bodyModel[435].setRotationPoint(-34F, -8.5F, -9F);

		bodyModel[436].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 106
		bodyModel[436].setRotationPoint(-29F, -7.5F, -9F);
		bodyModel[436].rotateAngleZ = 1.57079633F;

		bodyModel[437].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -1.5F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 271
		bodyModel[437].setRotationPoint(46F, -17F, -5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[438].setRotationPoint(46F, -17F, 3F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[439].setRotationPoint(45F, 2.5F, -10F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 100
		bodyModel[440].setRotationPoint(45F, 2.5F, 9F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -3F, -3F, -1F); // Box 76
		bodyModel[441].setRotationPoint(-51F, -11.5F, 5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-3F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[442].setRotationPoint(-51F, -11.5F, -10F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[443].setRotationPoint(-51F, -11.5F, -10F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 75
		bodyModel[444].setRotationPoint(-49F, -14.5F, 2F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, -1F, 0F, 0F, 0F, -1F, -2F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, -1F, -2F, 1F, 0F, 0F, 1F, 0F); // Box 75
		bodyModel[445].setRotationPoint(-49F, -14.5F, -5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 75
		bodyModel[446].setRotationPoint(-49F, -14.5F, -5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 1.25F, 0F, 0F, 0F, 1.055F, 0F, 0.35F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0.75F, 1.055F, 0F, -0.35F); // Box 54
		bodyModel[447].setRotationPoint(-47F, 1.5F, 8.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[448].setRotationPoint(-27F, -20F, 3.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[449].setRotationPoint(-29F, -21F, 3.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[450].setRotationPoint(-30F, -21F, 3.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[451].setRotationPoint(-31F, -22F, 3F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[452].setRotationPoint(-33F, -21F, 2.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[453].setRotationPoint(-32F, -21F, 4.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[454].setRotationPoint(-33F, -21F, 4.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[455].setRotationPoint(-34F, -21F, 2.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[456].setRotationPoint(-30F, -21F, 5.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F); // Box 54
		bodyModel[457].setRotationPoint(-28F, -21F, 5.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[458].setRotationPoint(-32F, -22F, 3.5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[459].setRotationPoint(-30F, -22F, 4.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F); // Box 54
		bodyModel[460].setRotationPoint(-29F, -22F, 4.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[461].setRotationPoint(-25F, -22F, 0F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[462].setRotationPoint(-27F, -21F, 1.5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[463].setRotationPoint(-27F, -21F, 3F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[464].setRotationPoint(-28F, -21F, 1.5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[465].setRotationPoint(-24F, -21F, 0F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F); // Box 54
		bodyModel[466].setRotationPoint(-23F, -21F, 0F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[467].setRotationPoint(-26F, -22F, 0.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F); // Box 54
		bodyModel[468].setRotationPoint(-24F, -22F, 2F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[469].setRotationPoint(-26F, -21F, 3F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[470].setRotationPoint(-25F, -20F, 0.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[471].setRotationPoint(-25F, -21F, -2F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[472].setRotationPoint(-27F, -21F, -0.5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[473].setRotationPoint(-27F, -21F, -2F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[474].setRotationPoint(-28F, -21F, -0.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[475].setRotationPoint(-26F, -21F, 1F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[476].setRotationPoint(-26F, -21F, -2F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[477].setRotationPoint(-25F, -20F, -0.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, -0.75F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 55
		bodyModel[478].setRotationPoint(-34F, -20.5F, -0.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Glow lamp Beacon
		bodyModel[479].setRotationPoint(-34F, -20.75F, -0.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1.25F, 0F, -0.2F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 55
		bodyModel[480].setRotationPoint(-20F, -22.5F, -2.75F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 55
		bodyModel[481].setRotationPoint(-20F, -21.75F, -4.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 55
		bodyModel[482].setRotationPoint(-20F, -21F, -4.5F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.2F, -1.15F, 0F, -0.2F, -1.15F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 55
		bodyModel[483].setRotationPoint(-20F, -22.5F, -6.25F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.8F, -0.125F, 0F, -0.8F, -0.125F, 0F, -0.8F, -0.215F, 0F, -0.8F, -0.215F); // Box 55
		bodyModel[484].setRotationPoint(-20F, -22.3F, -5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 55
		bodyModel[485].setRotationPoint(-20F, -22.1F, -4.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[486].setRotationPoint(-53.5F, -0.5F, 3F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[487].setRotationPoint(-53.5F, -0.5F, -4F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front light bottom L
		bodyModel[488].setRotationPoint(-53F, -6.5F, 0.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Ditch light bottom R
		bodyModel[489].setRotationPoint(-53.75F, -0.5F, -4F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 268
		bodyModel[490].setRotationPoint(-45F, -0.5F, 11.5F);

		bodyModel[491].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 264
		bodyModel[491].setRotationPoint(-43.25F, -1F, 11F);

		bodyModel[492].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 264
		bodyModel[492].setRotationPoint(-40.75F, -1F, 11F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 268
		bodyModel[493].setRotationPoint(-45F, -4.5F, 11.5F);

		bodyModel[494].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 264
		bodyModel[494].setRotationPoint(-43.25F, -5F, 11F);

		bodyModel[495].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 264
		bodyModel[495].setRotationPoint(-40.75F, -5F, 11F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 268
		bodyModel[496].setRotationPoint(-45F, -8.5F, 11.5F);

		bodyModel[497].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 264
		bodyModel[497].setRotationPoint(-43.25F, -9F, 11F);

		bodyModel[498].addShapeBox(-2F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 264
		bodyModel[498].setRotationPoint(-40.75F, -9F, 11F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[499].setRotationPoint(-24F, -22F, 7F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 31, 298, textureX, textureY); // Box 103
		bodyModel[501] = new ModelRendererTurbo(this, 1, 298, textureX, textureY); // Box 103
		bodyModel[502] = new ModelRendererTurbo(this, 16, 298, textureX, textureY); // Box 103
		bodyModel[503] = new ModelRendererTurbo(this, 21, 298, textureX, textureY); // Box 103
		bodyModel[504] = new ModelRendererTurbo(this, 26, 298, textureX, textureY); // Box 103
		bodyModel[505] = new ModelRendererTurbo(this, 6, 298, textureX, textureY); // Box 103
		bodyModel[506] = new ModelRendererTurbo(this, 11, 298, textureX, textureY); // Box 103
		bodyModel[507] = new ModelRendererTurbo(this, 1, 304, textureX, textureY); // Box 103
		bodyModel[508] = new ModelRendererTurbo(this, 31, 307, textureX, textureY); // Box 103
		bodyModel[509] = new ModelRendererTurbo(this, 1, 307, textureX, textureY); // Box 103
		bodyModel[510] = new ModelRendererTurbo(this, 16, 307, textureX, textureY); // Box 103
		bodyModel[511] = new ModelRendererTurbo(this, 21, 307, textureX, textureY); // Box 103
		bodyModel[512] = new ModelRendererTurbo(this, 26, 307, textureX, textureY); // Box 103
		bodyModel[513] = new ModelRendererTurbo(this, 6, 307, textureX, textureY); // Box 103
		bodyModel[514] = new ModelRendererTurbo(this, 11, 307, textureX, textureY); // Box 103
		bodyModel[515] = new ModelRendererTurbo(this, 109, 1, textureX, textureY); // Box 39
		bodyModel[516] = new ModelRendererTurbo(this, 85, 2, textureX, textureY); // Box 39
		bodyModel[517] = new ModelRendererTurbo(this, 135, 1, textureX, textureY); // Box 39
		bodyModel[518] = new ModelRendererTurbo(this, 122, 1, textureX, textureY); // Box 39
		bodyModel[519] = new ModelRendererTurbo(this, 105, 26, textureX, textureY); // Box 97
		bodyModel[520] = new ModelRendererTurbo(this, 55, 22, textureX, textureY); // Box 77
		bodyModel[521] = new ModelRendererTurbo(this, 84, 87, textureX, textureY); // Box 68
		bodyModel[522] = new ModelRendererTurbo(this, 79, 94, textureX, textureY); // Box 68
		bodyModel[523] = new ModelRendererTurbo(this, 68, 93, textureX, textureY); // Box 68
		bodyModel[524] = new ModelRendererTurbo(this, 60, 98, textureX, textureY); // Box 68
		bodyModel[525] = new ModelRendererTurbo(this, 55, 98, textureX, textureY); // Box 68
		bodyModel[526] = new ModelRendererTurbo(this, 93, 94, textureX, textureY); // Box 68
		bodyModel[527] = new ModelRendererTurbo(this, 102, 93, textureX, textureY); // Box 68
		bodyModel[528] = new ModelRendererTurbo(this, 112, 98, textureX, textureY); // Box 68
		bodyModel[529] = new ModelRendererTurbo(this, 121, 99, textureX, textureY); // Box 68
		bodyModel[530] = new ModelRendererTurbo(this, 11, 100, textureX, textureY); // Box 264
		bodyModel[531] = new ModelRendererTurbo(this, 29, 279, textureX, textureY); // Box 55
		bodyModel[532] = new ModelRendererTurbo(this, 36, 280, textureX, textureY); // Box 54
		bodyModel[533] = new ModelRendererTurbo(this, 30, 275, textureX, textureY); // Box 54
		bodyModel[534] = new ModelRendererTurbo(this, 36, 274, textureX, textureY); // Box 54
		bodyModel[535] = new ModelRendererTurbo(this, 45, 280, textureX, textureY); // Box 54
		bodyModel[536] = new ModelRendererTurbo(this, 36, 277, textureX, textureY); // Box 54
		bodyModel[537] = new ModelRendererTurbo(this, 45, 277, textureX, textureY); // Box 54
		bodyModel[538] = new ModelRendererTurbo(this, 365, 196, textureX, textureY); // Box 10
		bodyModel[539] = new ModelRendererTurbo(this, 201, 195, textureX, textureY); // Box 10

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 103
		bodyModel[500].setRotationPoint(44F, -21.5F, 7F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[501].setRotationPoint(-24F, -21.5F, 7F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[502].setRotationPoint(11.5F, -21.5F, 7F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[503].setRotationPoint(24.5F, -21.5F, 7F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[504].setRotationPoint(35.5F, -21.5F, 7F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[505].setRotationPoint(-12.5F, -21.5F, 7F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[506].setRotationPoint(-0.5F, -21.5F, 7F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 69, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[507].setRotationPoint(-24F, -22F, -8F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 103
		bodyModel[508].setRotationPoint(44F, -21.5F, -8F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[509].setRotationPoint(-24F, -21.5F, -8F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[510].setRotationPoint(11.5F, -21.5F, -8F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[511].setRotationPoint(24.5F, -21.5F, -8F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[512].setRotationPoint(35.5F, -21.5F, -8F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[513].setRotationPoint(-12.5F, -21.5F, -8F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 103
		bodyModel[514].setRotationPoint(-0.5F, -21.5F, -8F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -2.75F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[515].setRotationPoint(-38.5F, -19.5F, -4F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[516].setRotationPoint(-38.5F, -19.5F, -1F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, -1.5F, 0F, -2F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, 1.5F, 0F, -2F, 1.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0.5F, 0F); // Box 39
		bodyModel[517].setRotationPoint(-38.5F, -19.5F, -7F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, -1.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 1.5F, 0F, -0.5F, 0.6F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 39
		bodyModel[518].setRotationPoint(-38.5F, -19.5F, -7F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-3F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[519].setRotationPoint(-50F, -13.5F, -8F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-3F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 77
		bodyModel[520].setRotationPoint(-50F, -13.5F, 5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[521].setRotationPoint(-55F, 0.5F, -2F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, -0.375F, 0F, -0.25F, 0F, 0F, 1.475F, 0F, 0F, -1.75F, -0.375F, 0F); // Box 68
		bodyModel[522].setRotationPoint(-54F, 1.5F, 2F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 2.05F, 0F, -0.95F, -2.25F, 0F, -0.95F, 0.25F, -0.375F, 0F, -0.5F, 0F, 0F, 1.825F, 0F, -0.95F, -2.35F, -0.375F, -0.95F); // Box 68
		bodyModel[523].setRotationPoint(-52F, 1.5F, 5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.55F, 0F, 1.95F, -1F, 0F, 0.85F, -1F, 0F, -1.2F, 0.25F, 0F, -2.95F, -0.3F, 0F, 1.95F, -1F, 0F, 0.7F, -1F, -0.375F, -1.2F, 0.2F, -0.375F, -2.95F); // Box 68
		bodyModel[524].setRotationPoint(-49.5F, 1.5F, 10F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.075F, 0F, 0F, -0.2F, 0F, 0.225F, 0F, 0F, 1F, 0F, 0.3F, 0F, -0.15F, 0F, -0.375F, -0.2F); // Box 68
		bodyModel[525].setRotationPoint(-47.5F, 1.5F, 9F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.5F, 0F, 0F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, -0.375F, 0F, 1.475F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.375F, 0F); // Box 68
		bodyModel[526].setRotationPoint(-54F, 1.5F, -5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-2.25F, 0F, -0.95F, 2.05F, 0F, -0.95F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.35F, -0.375F, -0.95F, 1.825F, 0F, -0.95F, -0.5F, 0F, 0F, 0.25F, -0.375F, 0F); // Box 68
		bodyModel[527].setRotationPoint(-52F, 1.5F, -9F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.3F, 0F, -2.95F, -1F, 0F, -1.2F, -1F, 0F, 0.85F, -0.55F, 0F, 1.95F, 0.2F, -0.375F, -2.95F, -1F, -0.375F, -1.2F, -0.85F, 0F, 0.65F, -0.275F, 0F, 1.95F); // Box 68
		bodyModel[528].setRotationPoint(-49.45F, 1.5F, -11F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0.45F, 0F, -0.075F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.2F, 0.2F, 0F, -0.175F, 0.2F, 0.8F, -0.1F, -0.3F, 0.375F, 0.075F); // Box 68
		bodyModel[529].setRotationPoint(-47.45F, 1.5F, -10F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 264
		bodyModel[530].setRotationPoint(-54F, 3.5F, -0.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[531].setRotationPoint(-30F, -20F, 2F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[532].setRotationPoint(-32F, -21F, 1.5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[533].setRotationPoint(-30F, -22F, 2.5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[534].setRotationPoint(-31F, -22F, 2.5F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F); // Box 54
		bodyModel[535].setRotationPoint(-33F, -21F, 1.5F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[536].setRotationPoint(-30F, -21F, 3.5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0F); // Box 54
		bodyModel[537].setRotationPoint(-27.5F, -21F, 3.5F);

		bodyModel[538].addShapeBox(-0.5F, -0.5F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[538].setRotationPoint(30.5F, 0.5F, -1F);

		bodyModel[539].addShapeBox(-0.5F, -0.5F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[539].setRotationPoint(-30.5F, 0.5F, -1F);
	}
}