//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 30.09.2018 - 15:22:42
// Last changed on: 30.09.2018 - 15:22:42
package wwcp.models.freight; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class HiCubePlateFBoxcar extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public HiCubePlateFBoxcar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[218];

		initbodyModel_1();

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Left Side-Left-Door
		bodyModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Right Side-Left-Door
		bodyModel[11] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Right Side-Right-Door
		bodyModel[12] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Right Side-Right-Door
		bodyModel[13] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Right Side-Left-Door
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Right Side-Left-Door
		bodyModel[15] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Right Side-Right-Door
		bodyModel[16] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Right Side-Right-Door
		bodyModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Right Side-Right-Door
		bodyModel[18] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Right Side-Left-Door
		bodyModel[19] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Right Side-Left-Door
		bodyModel[20] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Right Side-Left-Door
		bodyModel[21] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Right Side-Left-Door
		bodyModel[22] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Right Side-Right-Door
		bodyModel[23] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Right Side-Right-Door
		bodyModel[24] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Right Side-Right-Door
		bodyModel[25] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Right Side-Right-Door
		bodyModel[26] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Right Side-Right-Door
		bodyModel[27] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Right Side-Left-Door
		bodyModel[28] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Right Side-Left-Door
		bodyModel[29] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Left Side-Right-Door
		bodyModel[36] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Left Side-Right-Door
		bodyModel[38] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Left Side-Right-Door
		bodyModel[39] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Left Side-Left-Door
		bodyModel[40] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Left Side-Left-Door
		bodyModel[41] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Left Side-Left-Door
		bodyModel[42] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Left Side-Left-Door
		bodyModel[43] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Left Side-Left-Door
		bodyModel[44] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Left Side-Left-Door
		bodyModel[45] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Left Side-Right-Door
		bodyModel[46] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Left Side-Right-Door
		bodyModel[47] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Left Side-Right-Door
		bodyModel[48] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Left Side-Right-Door
		bodyModel[49] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Left Side-Left-Door
		bodyModel[51] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Left Side-Right-Door
		bodyModel[52] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Left Side-Left-Door
		bodyModel[53] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Left Side-Left-Door
		bodyModel[54] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Left Side-Left-Door
		bodyModel[55] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Left Side-Left-Door
		bodyModel[56] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Left Side-Right-Door
		bodyModel[57] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 67
		bodyModel[58] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 69
		bodyModel[59] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 70
		bodyModel[60] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 71
		bodyModel[61] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 72
		bodyModel[62] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 73
		bodyModel[63] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 74
		bodyModel[64] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 75
		bodyModel[65] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 76
		bodyModel[66] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 77
		bodyModel[67] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 78
		bodyModel[68] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 80
		bodyModel[70] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 81
		bodyModel[71] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 82
		bodyModel[72] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 83
		bodyModel[73] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 84
		bodyModel[74] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 85
		bodyModel[75] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 86
		bodyModel[76] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 87
		bodyModel[77] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 88
		bodyModel[78] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 89
		bodyModel[79] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 90
		bodyModel[80] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 91
		bodyModel[81] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 92
		bodyModel[82] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 93
		bodyModel[83] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 94
		bodyModel[84] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 95
		bodyModel[85] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 96
		bodyModel[86] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 97
		bodyModel[87] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 98
		bodyModel[88] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 99
		bodyModel[89] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 100
		bodyModel[90] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 101
		bodyModel[91] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 102
		bodyModel[92] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 103
		bodyModel[93] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 104
		bodyModel[94] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 105
		bodyModel[95] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 106
		bodyModel[96] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 107
		bodyModel[97] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 108
		bodyModel[98] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 109
		bodyModel[99] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 241
		bodyModel[100] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 101
		bodyModel[101] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 102
		bodyModel[102] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 103
		bodyModel[103] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 104
		bodyModel[104] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 123
		bodyModel[105] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 131
		bodyModel[106] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 132
		bodyModel[107] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 133
		bodyModel[108] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 134
		bodyModel[109] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 135
		bodyModel[110] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 136
		bodyModel[111] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 137
		bodyModel[112] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 138
		bodyModel[113] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 139
		bodyModel[114] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 140
		bodyModel[115] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 141
		bodyModel[116] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 142
		bodyModel[117] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 143
		bodyModel[118] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 144
		bodyModel[119] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 145
		bodyModel[120] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 146
		bodyModel[121] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 147
		bodyModel[122] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 148
		bodyModel[123] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 149
		bodyModel[124] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 150
		bodyModel[125] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 151
		bodyModel[126] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 152
		bodyModel[127] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 153
		bodyModel[128] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 155
		bodyModel[129] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 157
		bodyModel[130] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 158
		bodyModel[131] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 159
		bodyModel[132] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 160
		bodyModel[133] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 161
		bodyModel[134] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 162
		bodyModel[135] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 163
		bodyModel[136] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 164
		bodyModel[137] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 165
		bodyModel[138] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 166
		bodyModel[139] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 167
		bodyModel[140] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 168
		bodyModel[141] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 169
		bodyModel[142] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 170
		bodyModel[143] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 171
		bodyModel[144] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 172
		bodyModel[145] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 173
		bodyModel[146] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 174
		bodyModel[147] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 175
		bodyModel[148] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 176
		bodyModel[149] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 177
		bodyModel[150] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 178
		bodyModel[151] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 179
		bodyModel[152] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 180
		bodyModel[153] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 181
		bodyModel[154] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 182
		bodyModel[155] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 183
		bodyModel[156] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 184
		bodyModel[157] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 185
		bodyModel[158] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 186
		bodyModel[159] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 187
		bodyModel[160] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 188
		bodyModel[161] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 33
		bodyModel[162] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 34
		bodyModel[163] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 35
		bodyModel[164] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 36
		bodyModel[165] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 37
		bodyModel[166] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 38
		bodyModel[167] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 39
		bodyModel[168] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 40
		bodyModel[169] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 41
		bodyModel[170] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 42
		bodyModel[171] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 199
		bodyModel[172] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 200
		bodyModel[173] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 201
		bodyModel[174] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 202
		bodyModel[175] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 203
		bodyModel[176] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 204
		bodyModel[177] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 205
		bodyModel[178] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 206
		bodyModel[179] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 207
		bodyModel[180] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 208
		bodyModel[181] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 209
		bodyModel[182] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 210
		bodyModel[183] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 211
		bodyModel[184] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 212
		bodyModel[185] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Right Side-Left-Door
		bodyModel[186] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Left Side-Right-Door
		bodyModel[187] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 36
		bodyModel[188] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 36
		bodyModel[189] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Left Side-Left-Door
		bodyModel[190] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Left Side-Left-Door
		bodyModel[191] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Left Side-Left-Door
		bodyModel[192] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Left Side-Left-Door
		bodyModel[193] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Left Side-Left-Door
		bodyModel[194] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Left Side-Left-Door
		bodyModel[195] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Left Side-Left-Door
		bodyModel[196] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Left Side-Left-Door
		bodyModel[197] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Left Side-Left-Door
		bodyModel[198] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Left Side-Left-Door
		bodyModel[199] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Left Side-Left-Door
		bodyModel[200] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Left Side-Left-Door
		bodyModel[201] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Left Side-Left-Door
		bodyModel[202] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Left Side-Left-Door
		bodyModel[203] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 85
		bodyModel[204] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 77
		bodyModel[205] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 90
		bodyModel[206] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 108
		bodyModel[207] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 15
		bodyModel[208] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 15
		bodyModel[209] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 15
		bodyModel[210] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 15
		bodyModel[211] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 15
		bodyModel[212] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 39
		bodyModel[213] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 39
		bodyModel[214] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 38
		bodyModel[215] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 39
		bodyModel[216] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 39
		bodyModel[217] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 39

		bodyModel[0].addBox(0F, 0F, 0F, 48, 29, 1, 0F); // Box 2
		bodyModel[0].setRotationPoint(-63F, -24F, 10.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 48, 29, 1, 0F); // Box 3
		bodyModel[1].setRotationPoint(15F, -24F, 10.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 27, 20, 0F); // Box 6
		bodyModel[2].setRotationPoint(-62F, -23F, -9.5F);

		bodyModel[3].addBox(0F, 0F, 5F, 30, 2, 1, 0F); // Left Side-Left-Door
		bodyModel[3].setRotationPoint(-15F, -24F, -15.5F);

		bodyModel[4].addBox(0F, 0F, 5F, 48, 29, 1, 0F); // Box 9
		bodyModel[4].setRotationPoint(-63F, -24F, -15.5F);

		bodyModel[5].addBox(0F, 0F, 5F, 48, 29, 1, 0F); // Box 10
		bodyModel[5].setRotationPoint(15F, -24F, -15.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 27, 20, 0F); // Box 11
		bodyModel[6].setRotationPoint(61F, -23F, -9.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 124, 1, 20, 0F); // Box 12
		bodyModel[7].setRotationPoint(-62F, -24F, -9.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 94, 1, 1, 0F); // Box 13
		bodyModel[8].setRotationPoint(-47F, -23F, 11.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 15
		bodyModel[9].setRotationPoint(-41F, 5F, 10.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Right Side-Left-Door
		bodyModel[10].setRotationPoint(1F, -15F, 11.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Right Side-Right-Door
		bodyModel[11].setRotationPoint(-14F, -15F, 11.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Right Side-Right-Door
		bodyModel[12].setRotationPoint(-14F, -7F, 11.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Right Side-Left-Door
		bodyModel[13].setRotationPoint(1F, -7F, 11.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Right Side-Left-Door
		bodyModel[14].setRotationPoint(6.5F, -14F, 11.4F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Right Side-Right-Door
		bodyModel[15].setRotationPoint(-8.5F, -14F, 11.4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Right Side-Right-Door
		bodyModel[16].setRotationPoint(-12F, -22F, 12.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Right Side-Right-Door
		bodyModel[17].setRotationPoint(-4F, -22F, 12.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Right Side-Left-Door
		bodyModel[18].setRotationPoint(3F, -22F, 12.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Right Side-Left-Door
		bodyModel[19].setRotationPoint(11F, -22F, 12.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Right Side-Left-Door
		bodyModel[20].setRotationPoint(1F, -21.5F, 11.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Right Side-Left-Door
		bodyModel[21].setRotationPoint(1F, 1.5F, 11.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Right Side-Right-Door
		bodyModel[22].setRotationPoint(-14F, 1.5F, 11.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Right Side-Right-Door
		bodyModel[23].setRotationPoint(-14F, -21.5F, 11.5F);

		bodyModel[24].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Right Side-Right-Door
		bodyModel[24].setRotationPoint(-14F, -11.5F, 11.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.6F); // Right Side-Right-Door
		bodyModel[25].setRotationPoint(-7F, -5F, 12F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.6F, 0F, 0F, -0.25F); // Right Side-Right-Door
		bodyModel[26].setRotationPoint(-11F, -5F, 12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.15F, -0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.6F, 0F, 0F, -0.25F); // Right Side-Left-Door
		bodyModel[27].setRotationPoint(4F, -5F, 12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.6F, -0.5F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.6F); // Right Side-Left-Door
		bodyModel[28].setRotationPoint(8F, -5F, 12F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 35
		bodyModel[29].setRotationPoint(-65F, 3.5F, 0F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 36
		bodyModel[30].setRotationPoint(-66F, 3F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[31].setRotationPoint(-68F, 3F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[32].setRotationPoint(-66F, 3F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[33].setRotationPoint(-67F, 3F, 1F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 40
		bodyModel[34].setRotationPoint(-64F, 2.5F, -2F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Left Side-Right-Door
		bodyModel[35].setRotationPoint(6.5F, -14F, -11.4F);

		bodyModel[36].addBox(0F, 0F, 0F, 70, 1, 1, 0F); // Box 42
		bodyModel[36].setRotationPoint(-35F, 3F, -11.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Side-Right-Door
		bodyModel[37].setRotationPoint(3F, -22F, -12.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Side-Right-Door
		bodyModel[38].setRotationPoint(11F, -22F, -12.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 12, 1, 0F); // Left Side-Left-Door
		bodyModel[39].setRotationPoint(-8.5F, -14F, -11.4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Side-Left-Door
		bodyModel[40].setRotationPoint(-4F, -22F, -12.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Side-Left-Door
		bodyModel[41].setRotationPoint(-12F, -22F, -12.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Left Side-Left-Door
		bodyModel[42].setRotationPoint(-14F, -11.5F, -11.25F);

		bodyModel[43].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Left Side-Left-Door
		bodyModel[43].setRotationPoint(-14F, -15F, -11.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Left Side-Left-Door
		bodyModel[44].setRotationPoint(-14F, -7F, -11.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Left Side-Right-Door
		bodyModel[45].setRotationPoint(1F, -15F, -11.5F);

		bodyModel[46].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Left Side-Right-Door
		bodyModel[46].setRotationPoint(1F, -7F, -11.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.15F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.15F, 0F, 0F, -0.5F); // Left Side-Right-Door
		bodyModel[47].setRotationPoint(4F, -5F, -12F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.15F, -0.5F, 0F, -0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.15F); // Left Side-Right-Door
		bodyModel[48].setRotationPoint(8F, -5F, -12F);

		bodyModel[49].addBox(0F, 0F, 0F, 94, 1, 1, 0F); // Box 56
		bodyModel[49].setRotationPoint(-47F, -23F, -11.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Left Side-Left-Door
		bodyModel[50].setRotationPoint(-14F, -21.5F, -11.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Left Side-Right-Door
		bodyModel[51].setRotationPoint(1F, -21.5F, -11.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.6F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.15F, -0.5F, 0F, -0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, 0F, -0.15F); // Left Side-Left-Door
		bodyModel[52].setRotationPoint(-7F, -5F, -12F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.6F, -0.5F, -0.5F, -0.15F, 0F, -0.5F, -0.5F, 0F, 0F, -0.25F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.15F, 0F, 0F, -0.5F); // Left Side-Left-Door
		bodyModel[53].setRotationPoint(-11F, -5F, -12F);

		bodyModel[54].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Left Side-Left-Door
		bodyModel[54].setRotationPoint(-14F, 1.5F, -11.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Left Side-Left-Door
		bodyModel[55].setRotationPoint(-15F, -22F, -11.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Left Side-Right-Door
		bodyModel[56].setRotationPoint(1F, 1.5F, -11.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 70, 1, 1, 0F); // Box 67
		bodyModel[57].setRotationPoint(-35F, 3F, 11.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 69
		bodyModel[58].setRotationPoint(57F, -22F, 10.9F);

		bodyModel[59].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 70
		bodyModel[59].setRotationPoint(47F, -23F, 10.9F);

		bodyModel[60].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 71
		bodyModel[60].setRotationPoint(-62F, -23F, 10.9F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 72
		bodyModel[61].setRotationPoint(51F, -22F, 10.9F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 25, 1, 0F); // Box 73
		bodyModel[62].setRotationPoint(44F, -22F, 10.9F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 74
		bodyModel[63].setRotationPoint(38F, -22F, 10.9F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 75
		bodyModel[64].setRotationPoint(32F, -22F, 10.9F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 76
		bodyModel[65].setRotationPoint(26F, -22F, 10.9F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 77
		bodyModel[66].setRotationPoint(20F, -22F, 10.9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 78
		bodyModel[67].setRotationPoint(32.5F, -20F, 11.9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 79
		bodyModel[68].setRotationPoint(32.5F, -3F, 11.9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[69].setRotationPoint(-38.5F, -20F, 11.15F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[70].setRotationPoint(-38.5F, -3F, 11.15F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 82
		bodyModel[71].setRotationPoint(-39F, -22F, 10.9F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 83
		bodyModel[72].setRotationPoint(-33F, -22F, 10.9F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 84
		bodyModel[73].setRotationPoint(-27F, -22F, 10.9F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 85
		bodyModel[74].setRotationPoint(-21F, -22F, 10.9F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 25, 1, 0F); // Box 86
		bodyModel[75].setRotationPoint(-46F, -22F, 10.9F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 87
		bodyModel[76].setRotationPoint(-52F, -22F, 10.9F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 88
		bodyModel[77].setRotationPoint(-58F, -22F, 10.9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 89
		bodyModel[78].setRotationPoint(32.5F, -20F, -11.15F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 90
		bodyModel[79].setRotationPoint(20F, -22F, -10.9F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 91
		bodyModel[80].setRotationPoint(26F, -22F, -10.9F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 92
		bodyModel[81].setRotationPoint(32F, -22F, -10.9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 93
		bodyModel[82].setRotationPoint(32.5F, -3F, -11.15F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 94
		bodyModel[83].setRotationPoint(38F, -22F, -10.9F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 25, 1, 0F); // Box 95
		bodyModel[84].setRotationPoint(44F, -22F, -10.9F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 96
		bodyModel[85].setRotationPoint(51F, -22F, -10.9F);

		bodyModel[86].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 97
		bodyModel[86].setRotationPoint(47F, -23F, -10.9F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 98
		bodyModel[87].setRotationPoint(57F, -22F, -10.9F);

		bodyModel[88].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 99
		bodyModel[88].setRotationPoint(-62F, -23F, -10.9F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 100
		bodyModel[89].setRotationPoint(-52F, -22F, -10.9F);

		bodyModel[90].addBox(0F, 0F, 0F, 2, 25, 1, 0F); // Box 101
		bodyModel[90].setRotationPoint(-46F, -22F, -10.9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 102
		bodyModel[91].setRotationPoint(-38.5F, -20F, -11.9F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 103
		bodyModel[92].setRotationPoint(-58F, -22F, -10.9F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 104
		bodyModel[93].setRotationPoint(-39F, -22F, -10.9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[94].setRotationPoint(-38.5F, -3F, -11.9F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 106
		bodyModel[95].setRotationPoint(-33F, -22F, -10.9F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 107
		bodyModel[96].setRotationPoint(-27F, -22F, -10.9F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 108
		bodyModel[97].setRotationPoint(-21F, -22F, -10.9F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 109
		bodyModel[98].setRotationPoint(-63F, -21F, -9.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 241
		bodyModel[99].setRotationPoint(-63.25F, -2.25F, -4.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 101
		bodyModel[100].setRotationPoint(-63.5F, -2F, -5.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[101].setRotationPoint(-63.5F, -2F, -10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 103
		bodyModel[102].setRotationPoint(-63.9F, -2F, -9.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 104
		bodyModel[103].setRotationPoint(-63.9F, 1F, -9.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 123
		bodyModel[104].setRotationPoint(-63.9F, 4F, -9.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 131
		bodyModel[105].setRotationPoint(-63F, -18F, -9.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 132
		bodyModel[106].setRotationPoint(-63F, -14F, -9.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 133
		bodyModel[107].setRotationPoint(-63F, -10F, -9.5F);

		bodyModel[108].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 134
		bodyModel[108].setRotationPoint(-63F, -6F, -9.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 135
		bodyModel[109].setRotationPoint(-63F, -2F, -9.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 136
		bodyModel[110].setRotationPoint(-63F, 2F, -9.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 137
		bodyModel[111].setRotationPoint(-63.5F, -2F, 10.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 138
		bodyModel[112].setRotationPoint(-63.9F, -2F, 6.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[113].setRotationPoint(-63.5F, -2F, 5.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 140
		bodyModel[114].setRotationPoint(-63.9F, 1F, 6.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 141
		bodyModel[115].setRotationPoint(-63.9F, 4F, 6.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 142
		bodyModel[116].setRotationPoint(62.5F, -2F, -10.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 143
		bodyModel[117].setRotationPoint(62.9F, -2F, -9.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F); // Box 144
		bodyModel[118].setRotationPoint(62.5F, -2F, -5.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 145
		bodyModel[119].setRotationPoint(62.9F, 1F, -9.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 146
		bodyModel[120].setRotationPoint(62.9F, 4F, -9.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 147
		bodyModel[121].setRotationPoint(62.5F, -2F, 5.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 148
		bodyModel[122].setRotationPoint(62.9F, -2F, 6.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 149
		bodyModel[123].setRotationPoint(62.9F, 1F, 6.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F); // Box 150
		bodyModel[124].setRotationPoint(62.5F, -2F, 10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 151
		bodyModel[125].setRotationPoint(62.9F, 4F, 6.5F);

		bodyModel[126].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 152
		bodyModel[126].setRotationPoint(62F, 2.5F, -2F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 153
		bodyModel[127].setRotationPoint(64F, 3.5F, 0F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 155
		bodyModel[128].setRotationPoint(65F, 3F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[129].setRotationPoint(67F, 3F, 0F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 158
		bodyModel[130].setRotationPoint(62F, 2F, -9.5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 159
		bodyModel[131].setRotationPoint(62F, -2F, -9.5F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 160
		bodyModel[132].setRotationPoint(62F, -6F, -9.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 161
		bodyModel[133].setRotationPoint(62F, -10F, -9.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 162
		bodyModel[134].setRotationPoint(62F, -14F, -9.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 163
		bodyModel[135].setRotationPoint(62F, -18F, -9.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 164
		bodyModel[136].setRotationPoint(62F, -21F, -9.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 165
		bodyModel[137].setRotationPoint(-58.5F, -6F, 11.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 166
		bodyModel[138].setRotationPoint(-62.5F, -6F, 11.1F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 167
		bodyModel[139].setRotationPoint(-62.5F, -3F, 11.1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F); // Box 168
		bodyModel[140].setRotationPoint(-63.5F, -6F, 11.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 169
		bodyModel[141].setRotationPoint(-62.5F, 0F, 11.1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 170
		bodyModel[142].setRotationPoint(-62.5F, 3F, 11.1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 171
		bodyModel[143].setRotationPoint(58.5F, 0F, 11.1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 172
		bodyModel[144].setRotationPoint(58.5F, 3F, 11.1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 173
		bodyModel[145].setRotationPoint(58.5F, -3F, 11.1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 174
		bodyModel[146].setRotationPoint(62.5F, -6F, 11.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F); // Box 175
		bodyModel[147].setRotationPoint(57.5F, -6F, 11.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 176
		bodyModel[148].setRotationPoint(58.5F, -6F, 11.1F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 177
		bodyModel[149].setRotationPoint(58.5F, -3F, -11.1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 178
		bodyModel[150].setRotationPoint(58.5F, -6F, -11.1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 179
		bodyModel[151].setRotationPoint(57.5F, -6F, -11.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 180
		bodyModel[152].setRotationPoint(58.5F, 0F, -11.1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 181
		bodyModel[153].setRotationPoint(58.5F, 3F, -11.1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[154].setRotationPoint(62.5F, -6F, -11.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[155].setRotationPoint(-58.5F, -6F, -11.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 184
		bodyModel[156].setRotationPoint(-63.5F, -6F, -11.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 185
		bodyModel[157].setRotationPoint(-62.5F, -3F, -11.1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 186
		bodyModel[158].setRotationPoint(-62.5F, -6F, -11.1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 187
		bodyModel[159].setRotationPoint(-62.5F, 0F, -11.1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 188
		bodyModel[160].setRotationPoint(-62.5F, 3F, -11.1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[161].setRotationPoint(63F, -1.5F, -2.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[162].setRotationPoint(64F, -3F, -2.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.3F, -2F, -0.5F, -0.3F, -2F, -0.5F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[163].setRotationPoint(64F, -4F, -4F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -2F, -0.5F, -0.3F, -2F, -0.5F, -0.3F, -2F, 0F, -0.3F, -2F); // Box 36
		bodyModel[164].setRotationPoint(64F, 1F, -4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, -0.3F, 0F, -2F, -0.3F); // Box 37
		bodyModel[165].setRotationPoint(64F, -3F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -2F, -0.3F, -0.5F, -2F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.3F, -0.5F, -2F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[166].setRotationPoint(64F, -3F, -5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[167].setRotationPoint(64F, -3F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 40
		bodyModel[168].setRotationPoint(64F, -3F, -4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[169].setRotationPoint(64F, 0F, -4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[170].setRotationPoint(64F, 0F, -1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 199
		bodyModel[171].setRotationPoint(62.5F, 4.75F, 10.95F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F); // Box 200
		bodyModel[172].setRotationPoint(57.5F, 4.75F, 10.95F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 201
		bodyModel[173].setRotationPoint(58.5F, 6F, 10.55F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 202
		bodyModel[174].setRotationPoint(-58.5F, 4.75F, 10.95F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F); // Box 203
		bodyModel[175].setRotationPoint(-63.5F, 4.75F, 10.95F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 204
		bodyModel[176].setRotationPoint(-62.5F, 6F, 10.55F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 205
		bodyModel[177].setRotationPoint(57.5F, 4.75F, -10.95F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[178].setRotationPoint(62.5F, 4.75F, -10.95F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 207
		bodyModel[179].setRotationPoint(58.5F, 6F, -10.55F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 208
		bodyModel[180].setRotationPoint(-63.5F, 4.75F, -10.95F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 209
		bodyModel[181].setRotationPoint(-62.5F, 6F, -10.55F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[182].setRotationPoint(-58.5F, 4.75F, -10.95F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 211
		bodyModel[183].setRotationPoint(62.5F, -2F, -3.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 122, 1, 20, 0F); // Box 212
		bodyModel[184].setRotationPoint(-61F, 3F, -9.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Right Side-Left-Door
		bodyModel[185].setRotationPoint(1F, -11.5F, 11.25F);

		bodyModel[186].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Left Side-Right-Door
		bodyModel[186].setRotationPoint(1F, -11.5F, -11.25F);

		bodyModel[187].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 36
		bodyModel[187].setRotationPoint(-48F, 4F, -0.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 36
		bodyModel[188].setRotationPoint(46F, 4F, -0.5F);

		bodyModel[189].addBox(0F, 0F, 5F, 30, 2, 1, 0F); // Left Side-Left-Door
		bodyModel[189].setRotationPoint(-15F, 3F, -15.5F);

		bodyModel[190].addBox(0F, 0F, 5F, 15, 25, 1, 0F); // Left Side-Left-Door
		bodyModel[190].setRotationPoint(-15F, -22F, -16F);

		bodyModel[191].addBox(0F, 0F, 5F, 30, 2, 1, 0F); // Left Side-Left-Door
		bodyModel[191].setRotationPoint(-15F, -24F, 5.5F);

		bodyModel[192].addBox(0F, 0F, 5F, 30, 2, 1, 0F); // Left Side-Left-Door
		bodyModel[192].setRotationPoint(-15F, 3F, 5.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Left Side-Left-Door
		bodyModel[193].setRotationPoint(-1F, -22F, -11.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Left Side-Left-Door
		bodyModel[194].setRotationPoint(0F, -22F, -11.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Left Side-Left-Door
		bodyModel[195].setRotationPoint(14F, -22F, -11.5F);

		bodyModel[196].addBox(0F, 0F, 5F, 15, 25, 1, 0F); // Left Side-Left-Door
		bodyModel[196].setRotationPoint(0F, -22F, -16F);

		bodyModel[197].addBox(0F, 0F, 5F, 15, 25, 1, 0F); // Left Side-Left-Door
		bodyModel[197].setRotationPoint(-15F, -22F, 6F);

		bodyModel[198].addBox(0F, 0F, 5F, 15, 25, 1, 0F); // Left Side-Left-Door
		bodyModel[198].setRotationPoint(0F, -22F, 6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Side-Left-Door
		bodyModel[199].setRotationPoint(14F, -22F, 11.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Side-Left-Door
		bodyModel[200].setRotationPoint(0F, -22F, 11.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Side-Left-Door
		bodyModel[201].setRotationPoint(-1F, -22F, 11.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Left Side-Left-Door
		bodyModel[202].setRotationPoint(-15F, -22F, 11.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 85
		bodyModel[203].setRotationPoint(-16F, -22F, 10.9F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 77
		bodyModel[204].setRotationPoint(15F, -22F, 10.9F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 90
		bodyModel[205].setRotationPoint(15F, -22F, -10.9F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 25, 1, 0F); // Box 108
		bodyModel[206].setRotationPoint(-16F, -22F, -10.9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[207].setRotationPoint(-39F, 5F, 10.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[208].setRotationPoint(39F, 5F, 10.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 15
		bodyModel[209].setRotationPoint(-41F, 5F, -10.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 78, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[210].setRotationPoint(-39F, 5F, -10.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[211].setRotationPoint(39F, 5F, -10.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[212].setRotationPoint(-66F, 3F, 1F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 39
		bodyModel[213].setRotationPoint(-68F, 3F, 1F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[214].setRotationPoint(65F, 3F, 1F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[215].setRotationPoint(66F, 3F, -1F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[216].setRotationPoint(65F, 3F, -1F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[217].setRotationPoint(67F, 3F, -1F);
	}
}