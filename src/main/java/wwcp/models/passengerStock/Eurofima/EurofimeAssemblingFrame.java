//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.03.2020 - 00:23:44
// Last changed on: 01.03.2020 - 00:23:44

package wwcp.models.passengerStock.Eurofima; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class EurofimeAssemblingFrame extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public EurofimeAssemblingFrame() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[223];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 56
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 58
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 26
		bodyModel[9] = new ModelRendererTurbo(this, 193, 2, textureX, textureY); // Box 32
		bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 33
		bodyModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 35
		bodyModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 38
		bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 36
		bodyModel[20] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 37
		bodyModel[21] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 38
		bodyModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 42
		bodyModel[24] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 46
		bodyModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 47
		bodyModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 48
		bodyModel[27] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 49
		bodyModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 58
		bodyModel[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 72
		bodyModel[30] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 83
		bodyModel[31] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 84
		bodyModel[32] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 86
		bodyModel[33] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 89
		bodyModel[34] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 90
		bodyModel[35] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 96
		bodyModel[36] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 98
		bodyModel[37] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 102
		bodyModel[38] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 105
		bodyModel[39] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 107
		bodyModel[40] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 109
		bodyModel[41] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 111
		bodyModel[42] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 112
		bodyModel[43] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 113
		bodyModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 115
		bodyModel[45] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 117
		bodyModel[46] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 118
		bodyModel[47] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 120
		bodyModel[48] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 121
		bodyModel[49] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 122
		bodyModel[50] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 125
		bodyModel[51] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 126
		bodyModel[52] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 127
		bodyModel[53] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 131
		bodyModel[54] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 132
		bodyModel[55] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 133
		bodyModel[56] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 135
		bodyModel[57] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 136
		bodyModel[58] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 138
		bodyModel[59] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 139
		bodyModel[60] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 140
		bodyModel[61] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 141
		bodyModel[62] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 142
		bodyModel[63] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 143
		bodyModel[64] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 144
		bodyModel[65] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 147
		bodyModel[66] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 149
		bodyModel[67] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 150
		bodyModel[68] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 151
		bodyModel[69] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 152
		bodyModel[70] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 153
		bodyModel[71] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 154
		bodyModel[72] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 155
		bodyModel[73] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 156
		bodyModel[74] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 157
		bodyModel[75] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 158
		bodyModel[76] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 159
		bodyModel[77] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 160
		bodyModel[78] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 161
		bodyModel[79] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 162
		bodyModel[80] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 163
		bodyModel[81] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 164
		bodyModel[82] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 165
		bodyModel[83] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 166
		bodyModel[84] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 167
		bodyModel[85] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 168
		bodyModel[86] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 169
		bodyModel[87] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 170
		bodyModel[88] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 171
		bodyModel[89] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 175
		bodyModel[90] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 176
		bodyModel[91] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 177
		bodyModel[92] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 178
		bodyModel[93] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 179
		bodyModel[94] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 180
		bodyModel[95] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 182
		bodyModel[96] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 183
		bodyModel[97] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 184
		bodyModel[98] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 185
		bodyModel[99] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 186
		bodyModel[100] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 188
		bodyModel[101] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 189
		bodyModel[102] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 190
		bodyModel[103] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 191
		bodyModel[104] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 192
		bodyModel[105] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 193
		bodyModel[106] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 195
		bodyModel[107] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 200
		bodyModel[108] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 201
		bodyModel[109] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 202
		bodyModel[110] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 203
		bodyModel[111] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 204
		bodyModel[112] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 205
		bodyModel[113] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 206
		bodyModel[114] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 209
		bodyModel[115] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 210
		bodyModel[116] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 211
		bodyModel[117] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 212
		bodyModel[118] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 213
		bodyModel[119] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 214
		bodyModel[120] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 216
		bodyModel[121] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 217
		bodyModel[122] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 218
		bodyModel[123] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 220
		bodyModel[124] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 222
		bodyModel[125] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 223
		bodyModel[126] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 224
		bodyModel[127] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 225
		bodyModel[128] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 226
		bodyModel[129] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 227
		bodyModel[130] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 228
		bodyModel[131] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 229
		bodyModel[132] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 230
		bodyModel[133] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 231
		bodyModel[134] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 232
		bodyModel[135] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 233
		bodyModel[136] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 234
		bodyModel[137] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 235
		bodyModel[138] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 236
		bodyModel[139] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 237
		bodyModel[140] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Box 238
		bodyModel[141] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 239
		bodyModel[142] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 240
		bodyModel[143] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 241
		bodyModel[144] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 167
		bodyModel[145] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 243
		bodyModel[146] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 244
		bodyModel[147] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 247
		bodyModel[148] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 248
		bodyModel[149] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 250
		bodyModel[150] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 251
		bodyModel[151] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 252
		bodyModel[152] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 253
		bodyModel[153] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 254
		bodyModel[154] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 255
		bodyModel[155] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 256
		bodyModel[156] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 263
		bodyModel[157] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 264
		bodyModel[158] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 265
		bodyModel[159] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 266
		bodyModel[160] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 267
		bodyModel[161] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 268
		bodyModel[162] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 269
		bodyModel[163] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 270
		bodyModel[164] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 271
		bodyModel[165] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 272
		bodyModel[166] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 209
		bodyModel[167] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 210
		bodyModel[168] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 211
		bodyModel[169] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 212
		bodyModel[170] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 213
		bodyModel[171] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 214
		bodyModel[172] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 215
		bodyModel[173] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 216
		bodyModel[174] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 217
		bodyModel[175] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 218
		bodyModel[176] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 219
		bodyModel[177] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 220
		bodyModel[178] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 221
		bodyModel[179] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 222
		bodyModel[180] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 223
		bodyModel[181] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 224
		bodyModel[182] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 225
		bodyModel[183] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 226
		bodyModel[184] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 227
		bodyModel[185] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Box 228
		bodyModel[186] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 229
		bodyModel[187] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 230
		bodyModel[188] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 231
		bodyModel[189] = new ModelRendererTurbo(this, 484, 370, textureX, textureY); // Box 333
		bodyModel[190] = new ModelRendererTurbo(this, 448, 370, textureX, textureY); // Box 334
		bodyModel[191] = new ModelRendererTurbo(this, 457, 370, textureX, textureY); // Back right step
		bodyModel[192] = new ModelRendererTurbo(this, 484, 379, textureX, textureY); // Box 336
		bodyModel[193] = new ModelRendererTurbo(this, 448, 379, textureX, textureY); // Box 337
		bodyModel[194] = new ModelRendererTurbo(this, 457, 379, textureX, textureY); // Back left step
		bodyModel[195] = new ModelRendererTurbo(this, 457, 395, textureX, textureY); // Front Right Step
		bodyModel[196] = new ModelRendererTurbo(this, 484, 395, textureX, textureY); // Box 340
		bodyModel[197] = new ModelRendererTurbo(this, 448, 395, textureX, textureY); // Box 341
		bodyModel[198] = new ModelRendererTurbo(this, 448, 387, textureX, textureY); // Box 342
		bodyModel[199] = new ModelRendererTurbo(this, 457, 387, textureX, textureY); // Front left Step
		bodyModel[200] = new ModelRendererTurbo(this, 484, 387, textureX, textureY); // Box 344
		bodyModel[201] = new ModelRendererTurbo(this, 448, 341, textureX, textureY); // Destination Board cover
		bodyModel[202] = new ModelRendererTurbo(this, 448, 359, textureX, textureY); // Destination Board cover
		bodyModel[203] = new ModelRendererTurbo(this, 478, 410, textureX, textureY); // New Lamp
		bodyModel[204] = new ModelRendererTurbo(this, 477, 405, textureX, textureY); // Old Lamp
		bodyModel[205] = new ModelRendererTurbo(this, 470, 405, textureX, textureY); // Old Lamp
		bodyModel[206] = new ModelRendererTurbo(this, 471, 410, textureX, textureY); // New Lamp
		bodyModel[207] = new ModelRendererTurbo(this, 464, 410, textureX, textureY); // New Lamp
		bodyModel[208] = new ModelRendererTurbo(this, 463, 405, textureX, textureY); // Old Lamp
		bodyModel[209] = new ModelRendererTurbo(this, 456, 405, textureX, textureY); // Old Lamp
		bodyModel[210] = new ModelRendererTurbo(this, 457, 410, textureX, textureY); // New Lamp
		bodyModel[211] = new ModelRendererTurbo(this, 468, 341, textureX, textureY); // Box 358
		bodyModel[212] = new ModelRendererTurbo(this, 468, 344, textureX, textureY); // Box 359
		bodyModel[213] = new ModelRendererTurbo(this, 468, 333, textureX, textureY); // Box 360
		bodyModel[214] = new ModelRendererTurbo(this, 473, 341, textureX, textureY); // Box 361
		bodyModel[215] = new ModelRendererTurbo(this, 473, 344, textureX, textureY); // Box 362
		bodyModel[216] = new ModelRendererTurbo(this, 473, 333, textureX, textureY); // Box 363
		bodyModel[217] = new ModelRendererTurbo(this, 478, 341, textureX, textureY); // Box 364
		bodyModel[218] = new ModelRendererTurbo(this, 478, 344, textureX, textureY); // Box 365
		bodyModel[219] = new ModelRendererTurbo(this, 478, 333, textureX, textureY); // Box 366
		bodyModel[220] = new ModelRendererTurbo(this, 483, 341, textureX, textureY); // Box 367
		bodyModel[221] = new ModelRendererTurbo(this, 483, 344, textureX, textureY); // Box 368
		bodyModel[222] = new ModelRendererTurbo(this, 483, 333, textureX, textureY); // Box 369

		bodyModel[0].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 55
		bodyModel[0].setRotationPoint(100F, 1.5F, -7.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 56
		bodyModel[1].setRotationPoint(101.5F, 0.5F, -8.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 58
		bodyModel[2].setRotationPoint(100F, 1.5F, 6.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 9
		bodyModel[3].setRotationPoint(101.5F, 0.5F, -5.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 10
		bodyModel[4].setRotationPoint(98F, 1F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 11
		bodyModel[5].setRotationPoint(101.5F, 0.5F, 5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 12
		bodyModel[6].setRotationPoint(101.5F, 0.5F, 4.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 13
		bodyModel[7].setRotationPoint(98F, 1F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[8].setRotationPoint(97.5F, -14F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 32
		bodyModel[9].setRotationPoint(89.5F, 4F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 33
		bodyModel[10].setRotationPoint(88.5F, 4F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 34
		bodyModel[11].setRotationPoint(97.5F, 4F, -10.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 35
		bodyModel[12].setRotationPoint(97.5F, -14F, -10.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[13].setRotationPoint(97.5F, 1F, -10.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 30
		bodyModel[14].setRotationPoint(97.5F, -15F, -5.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[15].setRotationPoint(97.5F, -14F, 5.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 33
		bodyModel[16].setRotationPoint(97.5F, -14F, 9.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 34
		bodyModel[17].setRotationPoint(97.5F, -15F, 4.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[18].setRotationPoint(99.5F, -14F, 9.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 3, 19, 0F); // Box 36
		bodyModel[19].setRotationPoint(97.5F, 1F, -9.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[20].setRotationPoint(97.5F, 1F, 9.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 38
		bodyModel[21].setRotationPoint(97.5F, 0F, -9.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 40
		bodyModel[22].setRotationPoint(97.5F, 0F, 5.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 180, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[23].setRotationPoint(-90.5F, -50.5F, -2.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 180, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 46
		bodyModel[24].setRotationPoint(-90.5F, -46F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 180, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F); // Box 47
		bodyModel[25].setRotationPoint(-90.5F, -48.5F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 180, 2, 2, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 48
		bodyModel[26].setRotationPoint(-90.5F, -49.5F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 180, 1, 4, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[27].setRotationPoint(-90.5F, -50.5F, -6.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[28].setRotationPoint(99.5F, -21.5F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[29].setRotationPoint(99.5F, -14F, -10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 180, 2, 2, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 83
		bodyModel[30].setRotationPoint(-90.5F, -49.5F, 6.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 180, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 84
		bodyModel[31].setRotationPoint(-90.5F, -50.5F, 2.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -3F, 0F, 0F, -2.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, -0.5F); // Box 86
		bodyModel[32].setRotationPoint(99.5F, -20.5F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, -0.5F, 0F, -1.5F, -1F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 89
		bodyModel[33].setRotationPoint(99.5F, -21.5F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2.5F, 0F, -0.5F, -3F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -1F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 90
		bodyModel[34].setRotationPoint(99.5F, -20.5F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[35].setRotationPoint(97.5F, -19F, -5.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[36].setRotationPoint(97.5F, -20F, -4.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 102
		bodyModel[37].setRotationPoint(99.5F, -21.5F, 2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[38].setRotationPoint(97.5F, -19F, 5.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.55F); // Box 107
		bodyModel[39].setRotationPoint(97.5F, -20F, 4.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F); // Box 109
		bodyModel[40].setRotationPoint(89.5F, -49.5F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F); // Box 111
		bodyModel[41].setRotationPoint(89.5F, -50.5F, 2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[42].setRotationPoint(89.5F, -50.5F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 113
		bodyModel[43].setRotationPoint(89.5F, -50.5F, 2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2.5F, 0F, -0.5F, 1F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1.5F); // Box 115
		bodyModel[44].setRotationPoint(89.5F, -49.5F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 117
		bodyModel[45].setRotationPoint(89.5F, -50.5F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[46].setRotationPoint(89.5F, -50.5F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[47].setRotationPoint(83.5F, 2F, 10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F); // Box 121
		bodyModel[48].setRotationPoint(81.5F, 2F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F); // Box 122
		bodyModel[49].setRotationPoint(89.5F, 4F, 10F);

		bodyModel[50].addBox(0F, 0F, 0F, 8, 4, 13, 0F); // Box 125
		bodyModel[50].setRotationPoint(89.5F, 0F, -6.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 180, 11, 1, 0F); // Box 126
		bodyModel[51].setRotationPoint(-90.5F, -43F, 10F);

		bodyModel[52].addBox(0F, 0F, 0F, 162, 5, 1, 0F); // Box 127
		bodyModel[52].setRotationPoint(-72.5F, -32F, 10F);

		bodyModel[53].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 131
		bodyModel[53].setRotationPoint(-78.5F, -29F, 10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 132
		bodyModel[54].setRotationPoint(-78.5F, -32F, 10F);

		bodyModel[55].addBox(0F, 0F, 0F, 12, 5, 1, 0F); // Box 133
		bodyModel[55].setRotationPoint(-90.5F, -32F, 10F);

		bodyModel[56].addBox(0F, 0F, 0F, 178, 1, 20, 0F); // Box 135
		bodyModel[56].setRotationPoint(-89.5F, 0F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[57].setRotationPoint(89.5F, 0F, -10.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 138
		bodyModel[58].setRotationPoint(88.5F, 0F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 139
		bodyModel[59].setRotationPoint(89.5F, 4F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 140
		bodyModel[60].setRotationPoint(96.5F, 0F, -10.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[61].setRotationPoint(90F, 2F, -8.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[62].setRotationPoint(97.5F, -21F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0.1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[63].setRotationPoint(97.5F, -21F, -5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F); // Box 144
		bodyModel[64].setRotationPoint(97.5F, -21F, 2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[65].setRotationPoint(97.5F, -19F, -6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[66].setRotationPoint(97.5F, -20F, -6.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 165, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 150
		bodyModel[67].setRotationPoint(-83F, 2F, 10F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 151
		bodyModel[68].setRotationPoint(-100.5F, -14F, -10.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F); // Box 152
		bodyModel[69].setRotationPoint(-100.5F, -46F, -10.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 153
		bodyModel[70].setRotationPoint(-101.5F, -17F, -10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.25F); // Box 154
		bodyModel[71].setRotationPoint(-100.5F, -48.5F, -9.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -2.5F, 0F, 0F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2F); // Box 155
		bodyModel[72].setRotationPoint(-101.5F, -19.5F, -9.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0F, -2.5F, 0F, 0F, -2F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1F); // Box 156
		bodyModel[73].setRotationPoint(-100.5F, -49.5F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -3F, 0F, 0F, -2.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 157
		bodyModel[74].setRotationPoint(-101.5F, -20.5F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 158
		bodyModel[75].setRotationPoint(-100.5F, -50.5F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1.5F, -1F, 0F, -1F, -0.5F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 159
		bodyModel[76].setRotationPoint(-101.5F, -21.5F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.3F, -1F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[77].setRotationPoint(-100.5F, -50.5F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[78].setRotationPoint(-101.5F, -19F, -5.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[79].setRotationPoint(-101.5F, -20F, -4.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.55F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[80].setRotationPoint(-101.5F, -20F, -6.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -1.5F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[81].setRotationPoint(-101.5F, -19F, -8.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[82].setRotationPoint(-101.5F, -19F, -6.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[83].setRotationPoint(-101.5F, -14F, -10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[84].setRotationPoint(-101.5F, -17F, -8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[85].setRotationPoint(-101.5F, -17F, -9.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[86].setRotationPoint(-101.5F, -14F, -9.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[87].setRotationPoint(-101.5F, -21.5F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[88].setRotationPoint(-100.5F, -50.5F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 175
		bodyModel[89].setRotationPoint(-102F, 1F, -8F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 176
		bodyModel[90].setRotationPoint(-103F, 1.5F, -7.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 177
		bodyModel[91].setRotationPoint(-103.5F, 0.5F, -8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 178
		bodyModel[92].setRotationPoint(-103.5F, 0.5F, -5.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 179
		bodyModel[93].setRotationPoint(-100.5F, 1F, -10.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 180
		bodyModel[94].setRotationPoint(-99.5F, 4F, -10.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 182
		bodyModel[95].setRotationPoint(-98.5F, 4F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 183
		bodyModel[96].setRotationPoint(-90.5F, 4F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[97].setRotationPoint(-90.5F, 2F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[98].setRotationPoint(-84.5F, 2F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 186
		bodyModel[99].setRotationPoint(-101.5F, -15F, -5.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 8, 4, 13, 0F); // Box 188
		bodyModel[100].setRotationPoint(-98.5F, 0F, -6.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[101].setRotationPoint(-98F, 2F, 6.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 190
		bodyModel[102].setRotationPoint(-90.5F, 0F, -10F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 3, 19, 0F); // Box 191
		bodyModel[103].setRotationPoint(-99.5F, 1F, -9.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.05F, 0F, 0F, -1.05F); // Box 192
		bodyModel[104].setRotationPoint(-98.5F, 0F, 6.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F); // Box 193
		bodyModel[105].setRotationPoint(-91.5F, 0F, 6.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 195
		bodyModel[106].setRotationPoint(-100.5F, -14F, 9.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.5F, 1F, 0F, -0.5F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, -0.5F); // Box 200
		bodyModel[107].setRotationPoint(-100.5F, -49.5F, 6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, -2.5F, 0F, -0.5F, -3F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, -0.5F, 0F, -0.5F, -1F); // Box 201
		bodyModel[108].setRotationPoint(-101.5F, -20.5F, 6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1F); // Box 202
		bodyModel[109].setRotationPoint(-100.5F, -50.5F, 2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -1F, -0.5F, 0F, -1.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 203
		bodyModel[110].setRotationPoint(-101.5F, -21.5F, 2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 204
		bodyModel[111].setRotationPoint(-100.5F, -50.5F, 2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0.5F); // Box 205
		bodyModel[112].setRotationPoint(-101.5F, -20F, 4.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 206
		bodyModel[113].setRotationPoint(-101.5F, -14F, 9.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 15, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[114].setRotationPoint(-101.5F, -14F, 5.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 210
		bodyModel[115].setRotationPoint(-102F, 1F, 6F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 211
		bodyModel[116].setRotationPoint(-103F, 1.5F, 6.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 212
		bodyModel[117].setRotationPoint(-103.5F, 0.5F, 5.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 213
		bodyModel[118].setRotationPoint(-103.5F, 0.5F, 4.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 214
		bodyModel[119].setRotationPoint(-100.5F, 1F, 9.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F); // Box 216
		bodyModel[120].setRotationPoint(-98.5F, 4F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[121].setRotationPoint(-90.5F, 2F, 10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[122].setRotationPoint(-84.5F, 2F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[123].setRotationPoint(-101.5F, -19F, 5.5F);

		bodyModel[124].addBox(0F, 0F, 0F, 3, 16, 1, 0F); // Box 222
		bodyModel[124].setRotationPoint(-101.5F, -15F, 4.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 223
		bodyModel[125].setRotationPoint(-98.5F, 4F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[126].setRotationPoint(-98F, 2F, -8.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -1.05F, -0.5F, 0F, -1.05F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -0.5F, 0F, -1.05F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[127].setRotationPoint(-98.5F, 0F, -10.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 226
		bodyModel[128].setRotationPoint(-91.5F, 0F, -10.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 227
		bodyModel[129].setRotationPoint(89.5F, 0F, 6.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -0.5F, 0F, -1.05F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -0.5F, 0F, -1.05F); // Box 228
		bodyModel[130].setRotationPoint(96.5F, 0F, 6.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[131].setRotationPoint(90F, 2F, 6.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[132].setRotationPoint(83.5F, 2F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F); // Box 231
		bodyModel[133].setRotationPoint(81.5F, 2F, -11F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F); // Box 232
		bodyModel[134].setRotationPoint(-100.5F, -21F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[135].setRotationPoint(-100.5F, -21F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[136].setRotationPoint(-100.5F, -21F, -5F);

		bodyModel[137].addBox(0F, 0F, 0F, 180, 11, 1, 0F); // Box 235
		bodyModel[137].setRotationPoint(-90.5F, -43F, -11F);

		bodyModel[138].addBox(0F, 0F, 0F, 162, 5, 1, 0F); // Box 236
		bodyModel[138].setRotationPoint(-90.5F, -32F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 237
		bodyModel[139].setRotationPoint(71.5F, -29F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[140].setRotationPoint(71.5F, -32F, -11F);

		bodyModel[141].addBox(0F, 0F, 0F, 12, 5, 1, 0F); // Box 239
		bodyModel[141].setRotationPoint(77.5F, -32F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 165, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 240
		bodyModel[142].setRotationPoint(-83F, 2F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[143].setRotationPoint(70F, 1F, -1F);

		bodyModel[144].addBox(0F, 0F, 0F, 118, 5, 20, 0F); // Box 167
		bodyModel[144].setRotationPoint(-59.5F, 1F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 243
		bodyModel[145].setRotationPoint(-59.5F, 2F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 244
		bodyModel[146].setRotationPoint(-59.5F, 4F, 10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[147].setRotationPoint(58.5F, 1F, 9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[148].setRotationPoint(60.5F, 1F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[149].setRotationPoint(58.5F, 1F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[150].setRotationPoint(60.5F, 1F, -10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[151].setRotationPoint(-61.5F, 1F, 9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F); // Box 253
		bodyModel[152].setRotationPoint(-63.5F, 1F, 9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[153].setRotationPoint(-61.5F, 1F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F); // Box 255
		bodyModel[154].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[155].setRotationPoint(-77F, 1F, -3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 263
		bodyModel[156].setRotationPoint(-41.5F, 4F, 10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 264
		bodyModel[157].setRotationPoint(-41.5F, 2F, 10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 265
		bodyModel[158].setRotationPoint(40.5F, 4F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 266
		bodyModel[159].setRotationPoint(40.5F, 2F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[160].setRotationPoint(-59.5F, 4F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[161].setRotationPoint(-39.5F, 4F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[162].setRotationPoint(-39.5F, 2F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[163].setRotationPoint(-59.5F, 2F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[164].setRotationPoint(49.5F, 4F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[165].setRotationPoint(49.5F, 2F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 209
		bodyModel[166].setRotationPoint(-100.5F, -46F, 8.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 210
		bodyModel[167].setRotationPoint(-101.5F, -17F, 8.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // Box 211
		bodyModel[168].setRotationPoint(-100.5F, -48.5F, 6.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 212
		bodyModel[169].setRotationPoint(-101.5F, -19.5F, 6.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F); // Box 213
		bodyModel[170].setRotationPoint(-101.5F, -19F, 6.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[171].setRotationPoint(-101.5F, -17F, 5.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Box 215
		bodyModel[172].setRotationPoint(-101.5F, -17F, 8.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 180, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 216
		bodyModel[173].setRotationPoint(-90.5F, -48.5F, 7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 217
		bodyModel[174].setRotationPoint(97.5F, -17F, 8.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[175].setRotationPoint(97.5F, -17F, 5.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F); // Box 219
		bodyModel[176].setRotationPoint(97.5F, -19F, 6.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F); // Box 220
		bodyModel[177].setRotationPoint(89.5F, -48.5F, 6.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 221
		bodyModel[178].setRotationPoint(89.5F, -46F, 8.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 180, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[179].setRotationPoint(-90.5F, -46F, 9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -1.4F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[180].setRotationPoint(97.5F, -19F, -8.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[181].setRotationPoint(97.5F, -17F, -8.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[182].setRotationPoint(97.5F, -17F, -9.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 10, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F); // Box 226
		bodyModel[183].setRotationPoint(89.5F, -46F, -10.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, -1.5F, 0F, 0F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2.75F); // Box 227
		bodyModel[184].setRotationPoint(89.5F, -48.5F, -9.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, -0.5F, -2.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -2.25F); // Box 228
		bodyModel[185].setRotationPoint(99.5F, -19.5F, -9.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 229
		bodyModel[186].setRotationPoint(99.5F, -17F, -10.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2F, 0F, -0.5F, -2.25F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, 0F); // Box 230
		bodyModel[187].setRotationPoint(99.5F, -19.5F, 6.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 231
		bodyModel[188].setRotationPoint(99.5F, -17F, 8.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F); // Box 333
		bodyModel[189].setRotationPoint(88.75F, 4F, 8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.05F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, 0.05F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.15F, -0.5F, -0.2F); // Box 334
		bodyModel[190].setRotationPoint(97.25F, 4F, 7.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,-0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F); // Back right step
		bodyModel[191].setRotationPoint(89.5F, 6.25F, 7.2F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.45F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.45F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 336
		bodyModel[192].setRotationPoint(88.75F, 4F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.15F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.15F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F); // Box 337
		bodyModel[193].setRotationPoint(97.25F, 4F, -10.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,-0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F); // Back left step
		bodyModel[194].setRotationPoint(89.5F, 6.25F, -12.2F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,-0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F); // Front Right Step
		bodyModel[195].setRotationPoint(-98.5F, 6.25F, 7.2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F); // Box 340
		bodyModel[196].setRotationPoint(-90.75F, 4F, 8F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F, -0.15F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 341
		bodyModel[197].setRotationPoint(-99.25F, 4F, 7.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, -0.15F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 342
		bodyModel[198].setRotationPoint(-99.25F, 4F, -10.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,-0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F); // Front left Step
		bodyModel[199].setRotationPoint(-98.5F, 6.25F, -12.2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.05F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.05F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 344
		bodyModel[200].setRotationPoint(-90.75F, 4F, -11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Destination Board cover
		bodyModel[201].setRotationPoint(71.5F, -32F, -11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Destination Board cover
		bodyModel[202].setRotationPoint(-78.5F, -32F, 10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.9F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0.1F, -0.2F, 0F); // New Lamp
		bodyModel[203].setRotationPoint(-101.5F, -6F, -10.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F); // Old Lamp
		bodyModel[204].setRotationPoint(-102.5F, -6F, -8.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F); // Old Lamp
		bodyModel[205].setRotationPoint(-102.5F, -6F, 6.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0.1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F); // New Lamp
		bodyModel[206].setRotationPoint(-101.5F, -6F, 9.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F); // New Lamp
		bodyModel[207].setRotationPoint(99.5F, -6F, 9.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Old Lamp
		bodyModel[208].setRotationPoint(100.5F, -6F, 6.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Old Lamp
		bodyModel[209].setRotationPoint(100.5F, -6F, -8.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0.1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, -0.9F, -0.2F, 0F, 0.1F, -0.2F, 0F, -1F, -0.2F, 0F); // New Lamp
		bodyModel[210].setRotationPoint(99.5F, -6F, -10.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F); // Box 358
		bodyModel[211].setRotationPoint(-99.5F, -7F, 10.3F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F); // Box 359
		bodyModel[212].setRotationPoint(-99.5F, -1F, 10.3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F); // Box 360
		bodyModel[213].setRotationPoint(-99.5F, -6.5F, 10.4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F); // Box 361
		bodyModel[214].setRotationPoint(-99.5F, -7F, -11.3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F); // Box 362
		bodyModel[215].setRotationPoint(-99.5F, -1F, -11.3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F); // Box 363
		bodyModel[216].setRotationPoint(-99.5F, -6.5F, -11.4F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F); // Box 364
		bodyModel[217].setRotationPoint(97.5F, -7F, 10.3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F); // Box 365
		bodyModel[218].setRotationPoint(97.5F, -1F, 10.3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F); // Box 366
		bodyModel[219].setRotationPoint(97.5F, -6.5F, 10.4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F); // Box 367
		bodyModel[220].setRotationPoint(97.5F, -7F, -11.3F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, -0.4F, -0.2F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F); // Box 368
		bodyModel[221].setRotationPoint(97.5F, -1F, -11.3F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F); // Box 369
		bodyModel[222].setRotationPoint(97.5F, -6.5F, -11.4F);
	}
}