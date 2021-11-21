//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.09.2019 - 01:33:17
// Last changed on: 01.09.2019 - 01:33:17

package wwcp.models.locomotives.diesels; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class DSBMK extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public DSBMK() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[295];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 161, 26, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 450, 88, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 417, 88, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 1, 115, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 44
		bodyModel[38] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 47
		bodyModel[39] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 156
		bodyModel[40] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 156
		bodyModel[41] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 155
		bodyModel[42] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 157
		bodyModel[43] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 155
		bodyModel[44] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 157
		bodyModel[45] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 396
		bodyModel[46] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 397
		bodyModel[47] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 398
		bodyModel[48] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 58
		bodyModel[50] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 59
		bodyModel[51] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 60
		bodyModel[52] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 61
		bodyModel[53] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 156
		bodyModel[54] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 155
		bodyModel[55] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 156
		bodyModel[56] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 157
		bodyModel[57] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 155
		bodyModel[58] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 157
		bodyModel[59] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 396
		bodyModel[60] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 397
		bodyModel[61] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 398
		bodyModel[62] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Front Door Top
		bodyModel[63] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Front Door Buttom
		bodyModel[64] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 73
		bodyModel[65] = new ModelRendererTurbo(this, 170, 100, textureX, textureY); // Box 74
		bodyModel[66] = new ModelRendererTurbo(this, 170, 100, textureX, textureY); // Box 75
		bodyModel[67] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Rear Door Buttom
		bodyModel[68] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Rear Door Top
		bodyModel[69] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 79
		bodyModel[70] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 81
		bodyModel[71] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 83
		bodyModel[72] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 84
		bodyModel[73] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 85
		bodyModel[74] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 86
		bodyModel[75] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 87
		bodyModel[76] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 89
		bodyModel[77] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 90
		bodyModel[78] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 91
		bodyModel[79] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 170
		bodyModel[80] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 182
		bodyModel[81] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 188
		bodyModel[82] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 188
		bodyModel[83] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 188
		bodyModel[84] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 170
		bodyModel[85] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 170
		bodyModel[86] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 170
		bodyModel[87] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 182
		bodyModel[88] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 101
		bodyModel[89] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 103
		bodyModel[91] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 104
		bodyModel[92] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 105
		bodyModel[93] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 106
		bodyModel[94] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 107
		bodyModel[95] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 108
		bodyModel[96] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 110
		bodyModel[97] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 111
		bodyModel[98] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 112
		bodyModel[99] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Exhaust
		bodyModel[100] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 115
		bodyModel[102] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 116
		bodyModel[103] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 117
		bodyModel[104] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 118
		bodyModel[105] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 119
		bodyModel[106] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 120
		bodyModel[107] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 121
		bodyModel[108] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 122
		bodyModel[109] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 123
		bodyModel[110] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 124
		bodyModel[111] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 125
		bodyModel[112] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 126
		bodyModel[113] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 127
		bodyModel[114] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 128
		bodyModel[115] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 129
		bodyModel[116] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 130
		bodyModel[117] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 131
		bodyModel[118] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 132
		bodyModel[119] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 133
		bodyModel[120] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 135
		bodyModel[121] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 136
		bodyModel[122] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 137
		bodyModel[123] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 138
		bodyModel[124] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 139
		bodyModel[125] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 140
		bodyModel[126] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 141
		bodyModel[127] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 142
		bodyModel[128] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 144
		bodyModel[129] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 145
		bodyModel[130] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 146
		bodyModel[131] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 147
		bodyModel[132] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 149
		bodyModel[133] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 150
		bodyModel[134] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 151
		bodyModel[135] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 152
		bodyModel[136] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 153
		bodyModel[137] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 154
		bodyModel[138] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 155
		bodyModel[139] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 156
		bodyModel[140] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 157
		bodyModel[141] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 158
		bodyModel[142] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 159
		bodyModel[143] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 160
		bodyModel[144] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 161
		bodyModel[145] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 162
		bodyModel[146] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 163
		bodyModel[147] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 164
		bodyModel[148] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 165
		bodyModel[149] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 166
		bodyModel[150] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 167
		bodyModel[151] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 168
		bodyModel[152] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 169
		bodyModel[153] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 170
		bodyModel[154] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 171
		bodyModel[155] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 172
		bodyModel[156] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 173
		bodyModel[157] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 174
		bodyModel[158] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 175
		bodyModel[159] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 176
		bodyModel[160] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 177
		bodyModel[161] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 178
		bodyModel[162] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 179
		bodyModel[163] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 180
		bodyModel[164] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 181
		bodyModel[165] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 182
		bodyModel[166] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 183
		bodyModel[167] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 184
		bodyModel[168] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 185
		bodyModel[169] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 169
		bodyModel[170] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 170
		bodyModel[171] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 171
		bodyModel[172] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 172
		bodyModel[173] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 174
		bodyModel[174] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 175
		bodyModel[175] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 176
		bodyModel[176] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 177
		bodyModel[177] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 178
		bodyModel[178] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 179
		bodyModel[179] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 77
		bodyModel[180] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 185
		bodyModel[181] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 191
		bodyModel[182] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 192
		bodyModel[183] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 193
		bodyModel[184] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 194
		bodyModel[185] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 195
		bodyModel[186] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 196
		bodyModel[187] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 197
		bodyModel[188] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 198
		bodyModel[189] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 199
		bodyModel[190] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 200
		bodyModel[191] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 201
		bodyModel[192] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 202
		bodyModel[193] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 203
		bodyModel[194] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 204
		bodyModel[195] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 197
		bodyModel[196] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 198
		bodyModel[197] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 199
		bodyModel[198] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 200
		bodyModel[199] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 201
		bodyModel[200] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 202
		bodyModel[201] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 203
		bodyModel[202] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 204
		bodyModel[203] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 197
		bodyModel[204] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 198
		bodyModel[205] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 199
		bodyModel[206] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 200
		bodyModel[207] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 201
		bodyModel[208] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 202
		bodyModel[209] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 203
		bodyModel[210] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 204
		bodyModel[211] = new ModelRendererTurbo(this, 145, 112, textureX, textureY); // G400B Control Top Front
		bodyModel[212] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 199
		bodyModel[213] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 200
		bodyModel[214] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 201
		bodyModel[215] = new ModelRendererTurbo(this, 210, 110, textureX, textureY); // Box 30
		bodyModel[216] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 199
		bodyModel[217] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 200
		bodyModel[218] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 201
		bodyModel[219] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 32
		bodyModel[220] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 32
		bodyModel[221] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Front Light Top
		bodyModel[222] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Front Light Right
		bodyModel[223] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Front End Light Right
		bodyModel[224] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Front Light Left
		bodyModel[225] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Front End Light Left
		bodyModel[226] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Rear Light Top
		bodyModel[227] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Rear Light Right
		bodyModel[228] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Rear End Light Left
		bodyModel[229] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Rear Light Left
		bodyModel[230] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Rear End Light Right
		bodyModel[231] = new ModelRendererTurbo(this, 253, 100, textureX, textureY); // Box 8
		bodyModel[232] = new ModelRendererTurbo(this, 253, 100, textureX, textureY); // Box 8
		bodyModel[233] = new ModelRendererTurbo(this, 253, 100, textureX, textureY); // Box 8
		bodyModel[234] = new ModelRendererTurbo(this, 253, 100, textureX, textureY); // Box 8
		bodyModel[235] = new ModelRendererTurbo(this, 129, 100, textureX, textureY); // Box 74
		bodyModel[236] = new ModelRendererTurbo(this, 129, 100, textureX, textureY); // Box 75
		bodyModel[237] = new ModelRendererTurbo(this, 129, 100, textureX, textureY); // Box 76
		bodyModel[238] = new ModelRendererTurbo(this, 129, 100, textureX, textureY); // Box 77
		bodyModel[239] = new ModelRendererTurbo(this, 129, 100, textureX, textureY); // Box 78
		bodyModel[240] = new ModelRendererTurbo(this, 129, 100, textureX, textureY); // Box 79
		bodyModel[241] = new ModelRendererTurbo(this, 129, 100, textureX, textureY); // Box 80
		bodyModel[242] = new ModelRendererTurbo(this, 233, 66, textureX, textureY); // Rotorlight Front
		bodyModel[243] = new ModelRendererTurbo(this, 233, 66, textureX, textureY); // Rotorlight Rear
		bodyModel[244] = new ModelRendererTurbo(this, 289, 100, textureX, textureY); // Box 129
		bodyModel[245] = new ModelRendererTurbo(this, 288, 100, textureX, textureY); // Box 132
		bodyModel[246] = new ModelRendererTurbo(this, 286, 100, textureX, textureY); // Box 129
		bodyModel[247] = new ModelRendererTurbo(this, 286, 100, textureX, textureY); // Box 132
		bodyModel[248] = new ModelRendererTurbo(this, 302, 93, textureX, textureY); // Box 113
		bodyModel[249] = new ModelRendererTurbo(this, 233, 70, textureX, textureY); // Box 113
		bodyModel[250] = new ModelRendererTurbo(this, 233, 70, textureX, textureY); // Box 113
		bodyModel[251] = new ModelRendererTurbo(this, 306, 100, textureX, textureY); // Box 74
		bodyModel[252] = new ModelRendererTurbo(this, 306, 100, textureX, textureY); // Box 74
		bodyModel[253] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // G322 Control Top Front
		bodyModel[254] = new ModelRendererTurbo(this, 145, 91, textureX, textureY); // DB Logo Front (Class MK Only)
		bodyModel[255] = new ModelRendererTurbo(this, 158, 91, textureX, textureY); // DB Logo Rear (Class MK Only)
		bodyModel[256] = new ModelRendererTurbo(this, 105, 120, textureX, textureY); // Control Board
		bodyModel[257] = new ModelRendererTurbo(this, 145, 104, textureX, textureY); // G400B Control Top Front
		bodyModel[258] = new ModelRendererTurbo(this, 210, 110, textureX, textureY); // Box 30
		bodyModel[259] = new ModelRendererTurbo(this, 146, 91, textureX, textureY); // G322 Control Top Front
		bodyModel[260] = new ModelRendererTurbo(this, 185, 93, textureX, textureY); // Box 168
		bodyModel[261] = new ModelRendererTurbo(this, 185, 75, textureX, textureY); // Box 168
		bodyModel[262] = new ModelRendererTurbo(this, 185, 93, textureX, textureY); // Box 168
		bodyModel[263] = new ModelRendererTurbo(this, 185, 75, textureX, textureY); // Box 168
		bodyModel[264] = new ModelRendererTurbo(this, 105, 109, textureX, textureY); // Control Board
		bodyModel[265] = new ModelRendererTurbo(this, 185, 93, textureX, textureY); // Box 168
		bodyModel[266] = new ModelRendererTurbo(this, 185, 75, textureX, textureY); // Box 168
		bodyModel[267] = new ModelRendererTurbo(this, 185, 93, textureX, textureY); // Box 168
		bodyModel[268] = new ModelRendererTurbo(this, 185, 75, textureX, textureY); // Box 168
		bodyModel[269] = new ModelRendererTurbo(this, 40, 106, textureX, textureY); // Box 81
		bodyModel[270] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 81
		bodyModel[271] = new ModelRendererTurbo(this, 370, 89, textureX, textureY); // Box 31
		bodyModel[272] = new ModelRendererTurbo(this, 390, 88, textureX, textureY); // Box 31
		bodyModel[273] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 31
		bodyModel[274] = new ModelRendererTurbo(this, 370, 88, textureX, textureY); // Box 31
		bodyModel[275] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // G322 Control Top Front
		bodyModel[276] = new ModelRendererTurbo(this, 145, 43, textureX, textureY); // G322 Control Top Front
		bodyModel[277] = new ModelRendererTurbo(this, 105, 130, textureX, textureY); // Control Board
		bodyModel[278] = new ModelRendererTurbo(this, 105, 150, textureX, textureY); // Control Board
		bodyModel[279] = new ModelRendererTurbo(this, 105, 130, textureX, textureY); // Control Board
		bodyModel[280] = new ModelRendererTurbo(this, 105, 150, textureX, textureY); // Control Board
		bodyModel[281] = new ModelRendererTurbo(this, 185, 93, textureX, textureY); // Box 168
		bodyModel[282] = new ModelRendererTurbo(this, 185, 75, textureX, textureY); // Box 168
		bodyModel[283] = new ModelRendererTurbo(this, 185, 93, textureX, textureY); // Box 168
		bodyModel[284] = new ModelRendererTurbo(this, 185, 75, textureX, textureY); // Box 168
		bodyModel[285] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 200
		bodyModel[286] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 200
		bodyModel[287] = new ModelRendererTurbo(this, 136, 123, textureX, textureY); // Control Board
		bodyModel[288] = new ModelRendererTurbo(this, 136, 123, textureX, textureY); // Control Board
		bodyModel[289] = new ModelRendererTurbo(this, 226, 127, textureX, textureY); // Box 3
		bodyModel[290] = new ModelRendererTurbo(this, 226, 119, textureX, textureY); // Box 3
		bodyModel[291] = new ModelRendererTurbo(this, 214, 145, textureX, textureY); // Box 3
		bodyModel[292] = new ModelRendererTurbo(this, 214, 134, textureX, textureY); // Box 3
		bodyModel[293] = new ModelRendererTurbo(this, 214, 145, textureX, textureY); // Box 3
		bodyModel[294] = new ModelRendererTurbo(this, 214, 145, textureX, textureY); // Box 3

		bodyModel[0].addBox(0F, 0F, 0F, 42, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-22F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		bodyModel[1].setRotationPoint(-30F, 0F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(20F, 0F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 31, 14, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-29F, -14F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-31F, 0F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-31F, 0F, 9F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 7, 18, 0F); // Box 6
		bodyModel[6].setRotationPoint(-31F, 0F, -9F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 5, 18, 0F); // Box 7
		bodyModel[7].setRotationPoint(-22F, 2F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-22F, 2F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-22F, 2F, 9F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 5, 18, 0F); // Box 10
		bodyModel[10].setRotationPoint(19F, 2F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(19F, 2F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[12].setRotationPoint(19F, 2F, 9F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 7, 18, 0F); // Box 13
		bodyModel[13].setRotationPoint(28F, 0F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 14
		bodyModel[14].setRotationPoint(28F, 0F, 9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(28F, 0F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 11, 14, 12, 0F); // Box 16
		bodyModel[16].setRotationPoint(15.5F, -14F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-30F, 2F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 18
		bodyModel[18].setRotationPoint(-30F, 5F, -11F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-30F, 2F, 6F);

		bodyModel[20].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 20
		bodyModel[20].setRotationPoint(-30F, 5F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 21
		bodyModel[21].setRotationPoint(20F, 2F, 6F);

		bodyModel[22].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 22
		bodyModel[22].setRotationPoint(20F, 5F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(20F, 2F, -9F);

		bodyModel[24].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Box 24
		bodyModel[24].setRotationPoint(20F, 5F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(2F, -14F, -11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(2F, -14F, 10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F,0F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F, -6F, 0F, 0.5F, -6F, 0F, 0.5F, -6F, 0F, 0F, -6F, 0F); // Box 27
		bodyModel[27].setRotationPoint(2F, -20F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 13, 12, 1, 0F,0F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -6F, 0F, 0.5F, -6F, 0F, 0.5F, -6F, 0F, 0F, -6F, 0F); // Box 28
		bodyModel[28].setRotationPoint(2F, -20F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 29
		bodyModel[29].setRotationPoint(14.5F, -14F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 30
		bodyModel[30].setRotationPoint(2F, -14F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(2F, -20F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 6, 15, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[32].setRotationPoint(14.5F, -20F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 11, 1, 14, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 33
		bodyModel[33].setRotationPoint(3F, -23F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, -2F, -1.585F, 0F, -2F, 1.185F, 0F, 0F, -0.5F); // Box 34
		bodyModel[34].setRotationPoint(16.5F, -23F, -9.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 35
		bodyModel[35].setRotationPoint(15.5F, -23F, -9.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 15, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.575F, 0F, -0.5F, -0.675F, 0F, -0.5F, 0.325F, 0F, -0.5F, 0.475F); // Box 42
		bodyModel[36].setRotationPoint(15.5F, -22.5F, -8F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 10, 2, 0F); // Box 44
		bodyModel[37].setRotationPoint(-1.5F, -24F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 1, 22, 0F); // Box 47
		bodyModel[38].setRotationPoint(-32F, 0F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[39].setRotationPoint(-36.5F, 1.25F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[40].setRotationPoint(-36.5F, 1.25F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[41].setRotationPoint(-35.5F, 1F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[42].setRotationPoint(-33F, 0.75F, 5.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[43].setRotationPoint(-35.5F, 1F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[44].setRotationPoint(-33F, 0.75F, -8.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F); // Box 396
		bodyModel[45].setRotationPoint(-32F, 1.5F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 397
		bodyModel[46].setRotationPoint(-33.25F, 2.5F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 398
		bodyModel[47].setRotationPoint(-34.25F, 1.5F, -0.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 57
		bodyModel[48].setRotationPoint(-32F, 1F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 58
		bodyModel[49].setRotationPoint(-32F, 1F, 9F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 22, 0F); // Box 59
		bodyModel[50].setRotationPoint(29F, 0F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 60
		bodyModel[51].setRotationPoint(29F, 1F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 61
		bodyModel[52].setRotationPoint(29F, 1F, 9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 156
		bodyModel[53].setRotationPoint(33.5F, 1.25F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 155
		bodyModel[54].setRotationPoint(31.5F, 1F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 156
		bodyModel[55].setRotationPoint(33.5F, 1.25F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[56].setRotationPoint(29F, 0.75F, 5.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 155
		bodyModel[57].setRotationPoint(31.5F, 1F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[58].setRotationPoint(29F, 0.75F, -8.25F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 396
		bodyModel[59].setRotationPoint(29F, 1.5F, -0.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 397
		bodyModel[60].setRotationPoint(30.25F, 2.5F, -0.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 398
		bodyModel[61].setRotationPoint(31.25F, 1.5F, -0.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Door Top
		bodyModel[62].setRotationPoint(2F, -20F, -10F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Front Door Buttom
		bodyModel[63].setRotationPoint(2F, -14F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 11, 3, 20, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[64].setRotationPoint(3F, -5F, -10F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 74
		bodyModel[65].setRotationPoint(2F, -5F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 75
		bodyModel[66].setRotationPoint(14.5F, -5F, 6F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Rear Door Buttom
		bodyModel[67].setRotationPoint(14.5F, -14F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Door Top
		bodyModel[68].setRotationPoint(14.5F, -20F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[69].setRotationPoint(15.5F, -23F, 8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 81
		bodyModel[70].setRotationPoint(1F, -23F, -9.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[71].setRotationPoint(1F, -23F, 8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.375F, 0F, -0.5F, 0.375F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F); // Box 84
		bodyModel[72].setRotationPoint(1F, -22.5F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.175F, 0F, -0.5F, -0.075F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F); // Box 85
		bodyModel[73].setRotationPoint(-2F, -22.5F, -7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.575F, 0F, -0.5F, -0.675F); // Box 86
		bodyModel[74].setRotationPoint(-2F, -22.5F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, -2F, 1.185F, 0F, -2F, -1.585F, 0F, 0F, 0F); // Box 87
		bodyModel[75].setRotationPoint(16.5F, -23F, 8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -2F, 1.185F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, -1.585F); // Box 89
		bodyModel[76].setRotationPoint(-2F, -23F, 8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -2F, -1.585F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, 1.185F); // Box 90
		bodyModel[77].setRotationPoint(-2F, -23F, -9.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 13, 1, 8, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[78].setRotationPoint(-18F, -15F, -4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -0.5F, 0.5F, -2.5F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 170
		bodyModel[79].setRotationPoint(-23.5F, -15F, 3F);
		bodyModel[79].rotateAngleY = 3.14159265F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 182
		bodyModel[80].setRotationPoint(-23F, -15F, 1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[81].setRotationPoint(-23F, -15F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 188
		bodyModel[82].setRotationPoint(-25F, -15F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 188
		bodyModel[83].setRotationPoint(-20.5F, -15F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-2.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[84].setRotationPoint(-18.5F, -15F, 3F);
		bodyModel[84].rotateAngleY = 3.14159265F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 170
		bodyModel[85].setRotationPoint(-23.5F, -15F, -1F);
		bodyModel[85].rotateAngleY = 3.14159265F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.5F, -2.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Box 170
		bodyModel[86].setRotationPoint(-18.5F, -15F, -1F);
		bodyModel[86].rotateAngleY = 3.14159265F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[87].setRotationPoint(-23F, -15F, -1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		bodyModel[88].setRotationPoint(-12F, -15.5F, -0.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[89].setRotationPoint(-12.75F, -16F, -1.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[90].setRotationPoint(-2F, -15F, -5.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 25, 10, 0, 0F); // Box 104
		bodyModel[91].setRotationPoint(-23F, -10F, 11F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 105
		bodyModel[92].setRotationPoint(-23F, 0F, 11F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 106
		bodyModel[93].setRotationPoint(-23F, 0F, -11F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 10, 0, 0F); // Box 107
		bodyModel[94].setRotationPoint(-31F, -10F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 10, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[95].setRotationPoint(15.5F, -10F, 11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 10, 0, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[96].setRotationPoint(15.5F, -10F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 111
		bodyModel[97].setRotationPoint(20F, 0F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 112
		bodyModel[98].setRotationPoint(20F, 0F, 11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Exhaust
		bodyModel[99].setRotationPoint(-1.5F, -25F, -5F);

		bodyModel[100].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 114
		bodyModel[100].setRotationPoint(-32F, -7F, -10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 3, 20, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[101].setRotationPoint(-32F, -10F, -10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[102].setRotationPoint(-32F, -7F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 117
		bodyModel[103].setRotationPoint(-30F, 0F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 118
		bodyModel[104].setRotationPoint(-32F, -7F, 10F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 10, 0, 0F); // Box 119
		bodyModel[105].setRotationPoint(-31F, -10F, 11F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 120
		bodyModel[106].setRotationPoint(-30F, 0F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 121
		bodyModel[107].setRotationPoint(-32F, -10F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[108].setRotationPoint(-32F, -10F, -11F);

		bodyModel[109].addBox(0F, 0F, 0F, 25, 10, 0, 0F); // Box 123
		bodyModel[109].setRotationPoint(-23F, -10F, -11F);

		bodyModel[110].addBox(0F, 0F, 0F, 2, 10, 0, 0F); // Box 124
		bodyModel[110].setRotationPoint(27F, -10F, -11F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 125
		bodyModel[111].setRotationPoint(27F, 0F, -11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[112].setRotationPoint(30F, -7F, -11F);

		bodyModel[113].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 127
		bodyModel[113].setRotationPoint(30F, -7F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[114].setRotationPoint(30F, -10F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 0, 3, 20, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[115].setRotationPoint(30F, -10F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 130
		bodyModel[116].setRotationPoint(30F, -10F, 10F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 10, 0, 0F); // Box 131
		bodyModel[117].setRotationPoint(27F, -10F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 132
		bodyModel[118].setRotationPoint(30F, -7F, 10F);

		bodyModel[119].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 133
		bodyModel[119].setRotationPoint(27F, 0F, 11F);

		bodyModel[120].addBox(0F, 0F, 0F, 8, 3, 16, 0F); // Box 135
		bodyModel[120].setRotationPoint(-30F, 3F, -8F);

		bodyModel[121].addBox(0F, 0F, 0F, 8, 3, 16, 0F); // Box 136
		bodyModel[121].setRotationPoint(20F, 3F, -8F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[122].setRotationPoint(9.75F, 2F, 6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[123].setRotationPoint(9.75F, 2F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[124].setRotationPoint(-19.25F, 2F, 6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[125].setRotationPoint(-19.25F, 2F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[126].setRotationPoint(-16.25F, 5F, -6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[127].setRotationPoint(12.75F, 5F, -6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[128].setRotationPoint(11.75F, 4.5F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 145
		bodyModel[129].setRotationPoint(11.75F, 6.5F, -7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 146
		bodyModel[130].setRotationPoint(-17.25F, 6.5F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[131].setRotationPoint(-17.25F, 4.5F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 149
		bodyModel[132].setRotationPoint(-15.75F, 2.5F, -7F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 150
		bodyModel[133].setRotationPoint(13.25F, 2.5F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 151
		bodyModel[134].setRotationPoint(13.25F, 2.5F, 6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[135].setRotationPoint(11.75F, 4.5F, 6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 153
		bodyModel[136].setRotationPoint(11.75F, 6.5F, 6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 154
		bodyModel[137].setRotationPoint(-15.75F, 2.5F, 6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[138].setRotationPoint(-17.25F, 4.5F, 6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 156
		bodyModel[139].setRotationPoint(-17.25F, 6.5F, 6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 157
		bodyModel[140].setRotationPoint(14.75F, 5.5F, 6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 158
		bodyModel[141].setRotationPoint(14.75F, 5.5F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 159
		bodyModel[142].setRotationPoint(-21.25F, 5.5F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 160
		bodyModel[143].setRotationPoint(-21.25F, 5.5F, 6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 161
		bodyModel[144].setRotationPoint(6.75F, 5F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 162
		bodyModel[145].setRotationPoint(8.25F, 5F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 163
		bodyModel[146].setRotationPoint(8.25F, 5F, 6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 164
		bodyModel[147].setRotationPoint(10.25F, 4.5F, 5.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 165
		bodyModel[148].setRotationPoint(10.25F, 4.5F, -6.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 166
		bodyModel[149].setRotationPoint(0F, 2.75F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 167
		bodyModel[150].setRotationPoint(8.5F, 2.5F, -6.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 168
		bodyModel[151].setRotationPoint(8.5F, 2.5F, 5.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 169
		bodyModel[152].setRotationPoint(-1.25F, 2.5F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[153].setRotationPoint(-1.75F, 2.5F, -1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[154].setRotationPoint(-0.25F, 2.5F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[155].setRotationPoint(-2F, 2.5F, -1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F); // Box 173
		bodyModel[156].setRotationPoint(-4F, 2.75F, -1F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[157].setRotationPoint(7.75F, 2.5F, -1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 175
		bodyModel[158].setRotationPoint(8F, 2.5F, -1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 176
		bodyModel[159].setRotationPoint(7.25F, 2.5F, -1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 177
		bodyModel[160].setRotationPoint(6.25F, 2.5F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 178
		bodyModel[161].setRotationPoint(-9.75F, 2.5F, -1F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 179
		bodyModel[162].setRotationPoint(-10.5F, 2.5F, -1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 180
		bodyModel[163].setRotationPoint(-11.5F, 2.5F, -1F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 181
		bodyModel[164].setRotationPoint(-10F, 2.5F, -1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 182
		bodyModel[165].setRotationPoint(-9.25F, 2.75F, -1F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[166].setRotationPoint(-5.25F, 2F, -2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 184
		bodyModel[167].setRotationPoint(-7.25F, 2F, -2F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 185
		bodyModel[168].setRotationPoint(-12.75F, 2.75F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 169
		bodyModel[169].setRotationPoint(-10.25F, 5F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 170
		bodyModel[170].setRotationPoint(-12.75F, 5F, 6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 171
		bodyModel[171].setRotationPoint(-12.75F, 4.5F, 5.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 172
		bodyModel[172].setRotationPoint(-11F, 2.5F, 5.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 174
		bodyModel[173].setRotationPoint(-12.75F, 5F, -7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 175
		bodyModel[174].setRotationPoint(-12.75F, 4.5F, -6.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 176
		bodyModel[175].setRotationPoint(-11F, 2.5F, -6.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 177
		bodyModel[176].setRotationPoint(9F, 2.75F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[177].setRotationPoint(10.75F, 2F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[178].setRotationPoint(-18.25F, 2F, -3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 77
		bodyModel[179].setRotationPoint(-17F, 2F, 6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 185
		bodyModel[180].setRotationPoint(-17.5F, 2.95F, 6.25F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 191
		bodyModel[181].setRotationPoint(-17.5F, 2.2F, 6.25F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 192
		bodyModel[182].setRotationPoint(-17.5F, 3.7F, 6.25F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 193
		bodyModel[183].setRotationPoint(-15F, 3.7F, 6.25F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 194
		bodyModel[184].setRotationPoint(-14.5F, 2F, 6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 195
		bodyModel[185].setRotationPoint(-15F, 2.95F, 6.25F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 196
		bodyModel[186].setRotationPoint(-15F, 2.2F, 6.25F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 197
		bodyModel[187].setRotationPoint(14F, 3.7F, 6.25F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 198
		bodyModel[188].setRotationPoint(14.5F, 2F, 6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 199
		bodyModel[189].setRotationPoint(14F, 2.95F, 6.25F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 200
		bodyModel[190].setRotationPoint(14F, 2.2F, 6.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 201
		bodyModel[191].setRotationPoint(12F, 2F, 6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 202
		bodyModel[192].setRotationPoint(11.5F, 3.7F, 6.25F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 203
		bodyModel[193].setRotationPoint(11.5F, 2.95F, 6.25F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 204
		bodyModel[194].setRotationPoint(11.5F, 2.2F, 6.25F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 197
		bodyModel[195].setRotationPoint(14F, 3.7F, -7.25F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 198
		bodyModel[196].setRotationPoint(14.5F, 2F, -7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 199
		bodyModel[197].setRotationPoint(14F, 2.95F, -7.25F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 200
		bodyModel[198].setRotationPoint(14F, 2.2F, -7.25F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 201
		bodyModel[199].setRotationPoint(12F, 2F, -7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 202
		bodyModel[200].setRotationPoint(11.5F, 3.7F, -7.25F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 203
		bodyModel[201].setRotationPoint(11.5F, 2.95F, -7.25F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 204
		bodyModel[202].setRotationPoint(11.5F, 2.2F, -7.25F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 197
		bodyModel[203].setRotationPoint(-15F, 3.7F, -7.25F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 198
		bodyModel[204].setRotationPoint(-14.5F, 2F, -7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 199
		bodyModel[205].setRotationPoint(-15F, 2.95F, -7.25F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 200
		bodyModel[206].setRotationPoint(-15F, 2.2F, -7.25F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 201
		bodyModel[207].setRotationPoint(-17F, 2F, -7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 202
		bodyModel[208].setRotationPoint(-17.5F, 3.7F, -7.25F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 203
		bodyModel[209].setRotationPoint(-17.5F, 2.95F, -7.25F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F); // Box 204
		bodyModel[210].setRotationPoint(-17.5F, 2.2F, -7.25F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 2F, 0F, -1F); // G400B Control Top Front
		bodyModel[211].setRotationPoint(13.5F, -15F, -6F);

		bodyModel[212].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 199
		bodyModel[212].setRotationPoint(6F, -11F, 5F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 200
		bodyModel[213].setRotationPoint(7.5F, -10F, 6.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[214].setRotationPoint(10F, -15F, 5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 30
		bodyModel[215].setRotationPoint(12.5F, -14F, -10F);

		bodyModel[216].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 199
		bodyModel[216].setRotationPoint(6.5F, -11F, -10F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 200
		bodyModel[217].setRotationPoint(8F, -10F, -8.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[218].setRotationPoint(6.5F, -15F, -10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[219].setRotationPoint(14.5F, -22F, 5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[220].setRotationPoint(2F, -22F, -6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Front Light Top
		bodyModel[221].setRotationPoint(-29.5F, -14F, -1F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Front Light Right
		bodyModel[222].setRotationPoint(-29.5F, -2.5F, 4F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Front End Light Right
		bodyModel[223].setRotationPoint(-29.5F, -4.5F, 4F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Front Light Left
		bodyModel[224].setRotationPoint(-29.5F, -2.5F, -6F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Front End Light Left
		bodyModel[225].setRotationPoint(-29.5F, -4.5F, -6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Rear Light Top
		bodyModel[226].setRotationPoint(26F, -14F, -1F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Rear Light Right
		bodyModel[227].setRotationPoint(26F, -2.5F, 4F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Rear End Light Left
		bodyModel[228].setRotationPoint(26F, -4.5F, 4F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Rear Light Left
		bodyModel[229].setRotationPoint(26F, -2.5F, -6F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Rear End Light Right
		bodyModel[230].setRotationPoint(26F, -4.5F, -6F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[231].setRotationPoint(-21F, 2F, 8F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[232].setRotationPoint(16F, 2F, 8F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[233].setRotationPoint(-21F, 2F, -10F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[234].setRotationPoint(16F, 2F, -10F);

		bodyModel[235].addBox(0F, 0F, 0F, 8, 3, 1, 0F); // Box 74
		bodyModel[235].setRotationPoint(-7.4F, 2F, 7.75F);

		bodyModel[236].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 75
		bodyModel[236].setRotationPoint(-7.4F, 3F, 8.75F);

		bodyModel[237].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 76
		bodyModel[237].setRotationPoint(-7.4F, 3F, 6.75F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[238].setRotationPoint(-7.4F, 2F, 8.75F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[239].setRotationPoint(-7.4F, 2F, 6.75F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[240].setRotationPoint(-7.4F, 4F, 6.75F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 80
		bodyModel[241].setRotationPoint(-7.4F, 4F, 8.75F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Rotorlight Front
		bodyModel[242].setRotationPoint(0.5F, -23.5F, -7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Rotorlight Rear
		bodyModel[243].setRotationPoint(16F, -23.5F, 6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[244].setRotationPoint(13F, -23.5F, -3.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 132
		bodyModel[245].setRotationPoint(13.5F, -23.5F, -3.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[246].setRotationPoint(13F, -23.5F, -2F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 132
		bodyModel[247].setRotationPoint(13.5F, -23.5F, -2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[248].setRotationPoint(13.25F, -23.5F, 1F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 113
		bodyModel[249].setRotationPoint(0.5F, -23.5F, 6F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 113
		bodyModel[250].setRotationPoint(16F, -23.5F, -7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[251].setRotationPoint(15.5F, -3F, 7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 74
		bodyModel[252].setRotationPoint(0F, -3F, -10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // G322 Control Top Front
		bodyModel[253].setRotationPoint(13.5F, -15F, -9F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // DB Logo Front (Class MK Only)
		bodyModel[254].setRotationPoint(-28.5F, -14F, 2.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // DB Logo Rear (Class MK Only)
		bodyModel[255].setRotationPoint(26.5F, -14F, -6.5F);

		bodyModel[256].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Control Board
		bodyModel[256].setRotationPoint(11.5F, -14F, -10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-3F, 0F, 0F, 2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // G400B Control Top Front
		bodyModel[257].setRotationPoint(3F, -15F, 3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[258].setRotationPoint(3F, -14F, 3F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // G322 Control Top Front
		bodyModel[259].setRotationPoint(3F, -15F, 6F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 168
		bodyModel[260].setRotationPoint(11.9F, -14.6F, -7.5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F); // Box 168
		bodyModel[261].setRotationPoint(11.9F, -14.85F, -7.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 168
		bodyModel[262].setRotationPoint(11.9F, -14.6F, -8.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F); // Box 168
		bodyModel[263].setRotationPoint(11.9F, -14.85F, -8.5F);

		bodyModel[264].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Control Board
		bodyModel[264].setRotationPoint(3F, -14F, 3F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 168
		bodyModel[265].setRotationPoint(4.6F, -14.6F, 6.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F); // Box 168
		bodyModel[266].setRotationPoint(4.6F, -14.85F, 6.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 168
		bodyModel[267].setRotationPoint(4.6F, -14.6F, 7.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F); // Box 168
		bodyModel[268].setRotationPoint(4.6F, -14.85F, 7.5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, -0.5F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[269].setRotationPoint(2F, -23F, 8.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 14, 3, 1, 0F,0F, -0.5F, -2F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[270].setRotationPoint(2F, -23F, -9.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[271].setRotationPoint(14.5F, -23F, -8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[272].setRotationPoint(14.5F, -23F, 6F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 13, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[273].setRotationPoint(2F, -23F, -5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[274].setRotationPoint(2F, -23F, -8F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // G322 Control Top Front
		bodyModel[275].setRotationPoint(3F, -15F, 9F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // G322 Control Top Front
		bodyModel[276].setRotationPoint(13.5F, -15F, -10F);

		bodyModel[277].addBox(0F, 0F, 0F, 2, 9, 7, 0F); // Control Board
		bodyModel[277].setRotationPoint(12.5F, -14F, -3F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Control Board
		bodyModel[278].setRotationPoint(12.5F, -14F, 4F);

		bodyModel[279].addBox(0F, 0F, 0F, 2, 9, 7, 0F); // Control Board
		bodyModel[279].setRotationPoint(3F, -14F, -4F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Control Board
		bodyModel[280].setRotationPoint(3F, -14F, -6F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 168
		bodyModel[281].setRotationPoint(4.6F, -14.6F, 8.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F); // Box 168
		bodyModel[282].setRotationPoint(4.6F, -14.85F, 8.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 168
		bodyModel[283].setRotationPoint(11.9F, -14.6F, -9.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F); // Box 168
		bodyModel[284].setRotationPoint(11.9F, -14.85F, -9.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[285].setRotationPoint(8F, -9F, -10.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 200
		bodyModel[286].setRotationPoint(7.5F, -9F, 6.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Control Board
		bodyModel[287].setRotationPoint(11.5F, -7F, -10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Control Board
		bodyModel[288].setRotationPoint(3F, -7F, 3F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 23, 5, 0, 0F,-14.25F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -14.25F, -2F, 0F, -14.25F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -14.25F, -1F, 0F); // Box 3
		bodyModel[289].setRotationPoint(-41.75F, -13F, 6.1F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 23, 5, 0, 0F,0F, -2F, 0F, -14.25F, -2F, 0F, -14.25F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -14.25F, -1F, 0F, -14.25F, -1F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[290].setRotationPoint(-27.5F, -13F, -6.1F);

		bodyModel[291].addShapeBox(-12F, 0F, 0F, 37, 7, 0, 0F,-16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F); // Box 3
		bodyModel[291].setRotationPoint(-28.7F, -16F, 3.1F);
		bodyModel[291].rotateAngleY = -1.57079633F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 37, 7, 0, 0F,-12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F); // Box 3
		bodyModel[292].setRotationPoint(-9.75F, -14F, 11.1F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 37, 7, 0, 0F,-12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F, -12.5F, -2.25F, 0F); // Box 3
		bodyModel[293].setRotationPoint(-9.75F, -14F, -11.1F);

		bodyModel[294].addShapeBox(-17F, 0F, 0F, 37, 7, 0, 0F,-16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F, -16.25F, -3F, 0F); // Box 3
		bodyModel[294].setRotationPoint(26.7F, -16F, 1.9F);
		bodyModel[294].rotateAngleY = 1.57079633F;
	}
}