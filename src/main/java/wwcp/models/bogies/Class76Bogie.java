//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.10.2022 - 21:16:13
// Last changed on: 04.10.2022 - 21:16:13

package wwcp.models.bogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Class76Bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Class76Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[173];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 170
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 171
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 172
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 173
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 174
		bodyModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 175
		bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 176
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 177
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 178
		bodyModel[9] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 179
		bodyModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 180
		bodyModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 181
		bodyModel[12] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 182
		bodyModel[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 183
		bodyModel[14] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 184
		bodyModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 185
		bodyModel[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 186
		bodyModel[17] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 187
		bodyModel[18] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 188
		bodyModel[19] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 189
		bodyModel[20] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 190
		bodyModel[21] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 191
		bodyModel[22] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 192
		bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 193
		bodyModel[24] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 194
		bodyModel[25] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 195
		bodyModel[26] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 196
		bodyModel[27] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 197
		bodyModel[28] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 198
		bodyModel[29] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 199
		bodyModel[30] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 200
		bodyModel[31] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 201
		bodyModel[32] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 202
		bodyModel[33] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 203
		bodyModel[34] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 204
		bodyModel[35] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 205
		bodyModel[36] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 206
		bodyModel[37] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 207
		bodyModel[38] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 208
		bodyModel[39] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 209
		bodyModel[40] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 210
		bodyModel[41] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 211
		bodyModel[42] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 212
		bodyModel[43] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 213
		bodyModel[44] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 214
		bodyModel[45] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 215
		bodyModel[46] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 216
		bodyModel[47] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 217
		bodyModel[48] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 218
		bodyModel[49] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 219
		bodyModel[50] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 220
		bodyModel[51] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 221
		bodyModel[52] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 222
		bodyModel[53] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 223
		bodyModel[54] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 224
		bodyModel[55] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 225
		bodyModel[56] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 226
		bodyModel[57] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 227
		bodyModel[58] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 228
		bodyModel[59] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 229
		bodyModel[60] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 230
		bodyModel[61] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 231
		bodyModel[62] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 232
		bodyModel[63] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 80
		bodyModel[81] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 81
		bodyModel[82] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 82
		bodyModel[83] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 83
		bodyModel[84] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 84
		bodyModel[85] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 85
		bodyModel[86] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 86
		bodyModel[87] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 88
		bodyModel[89] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 89
		bodyModel[90] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 90
		bodyModel[91] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 91
		bodyModel[92] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 92
		bodyModel[93] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 93
		bodyModel[94] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 94
		bodyModel[95] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 95
		bodyModel[96] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 97
		bodyModel[98] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 101
		bodyModel[102] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 102
		bodyModel[103] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 112
		bodyModel[113] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 113
		bodyModel[114] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 114
		bodyModel[115] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 115
		bodyModel[116] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 116
		bodyModel[117] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 118
		bodyModel[119] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 119
		bodyModel[120] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 120
		bodyModel[121] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 121
		bodyModel[122] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 122
		bodyModel[123] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 123
		bodyModel[124] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 124
		bodyModel[125] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 103
		bodyModel[126] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 104
		bodyModel[127] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 105
		bodyModel[128] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 106
		bodyModel[129] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 107
		bodyModel[130] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 109
		bodyModel[131] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 132
		bodyModel[132] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 133
		bodyModel[133] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 134
		bodyModel[134] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 135
		bodyModel[135] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 136
		bodyModel[136] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 137
		bodyModel[137] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 138
		bodyModel[138] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 139
		bodyModel[139] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 140
		bodyModel[140] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 141
		bodyModel[141] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 142
		bodyModel[142] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 143
		bodyModel[143] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 144
		bodyModel[144] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 145
		bodyModel[145] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 146
		bodyModel[146] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 147
		bodyModel[147] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 15
		bodyModel[148] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 33
		bodyModel[149] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 48
		bodyModel[150] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 152
		bodyModel[151] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 153
		bodyModel[152] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 154
		bodyModel[153] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 155
		bodyModel[154] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 156
		bodyModel[155] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 157
		bodyModel[156] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 158
		bodyModel[157] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 159
		bodyModel[158] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 160
		bodyModel[159] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 161
		bodyModel[160] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 162
		bodyModel[161] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 163
		bodyModel[162] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 164
		bodyModel[163] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 169
		bodyModel[164] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 170
		bodyModel[165] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 171
		bodyModel[166] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 172
		bodyModel[167] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 173
		bodyModel[168] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 174
		bodyModel[169] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 175
		bodyModel[170] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 176
		bodyModel[171] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 171
		bodyModel[172] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 172

		bodyModel[0].addBox(0F, 0F, 0F, 17, 3, 1, 0F); // Box 170
		bodyModel[0].setRotationPoint(-28.5F, 0F, 6.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[1].setRotationPoint(-19.5F, -1F, 6.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[2].setRotationPoint(-11.5F, -1F, 6.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 173
		bodyModel[3].setRotationPoint(-16.5F, -1F, 6.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 23, 5, 1, 0F); // Box 174
		bodyModel[4].setRotationPoint(-11.5F, 1F, 6.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[5].setRotationPoint(8.5F, -1F, 6.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 176
		bodyModel[6].setRotationPoint(11.5F, -1F, 6.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[7].setRotationPoint(16.5F, -1F, 6.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 16, 5, 1, 0F); // Box 178
		bodyModel[8].setRotationPoint(11.5F, 0F, 6.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 179
		bodyModel[9].setRotationPoint(-4.5F, 6F, 6.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 180
		bodyModel[10].setRotationPoint(-17.5F, 6F, 6.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
		bodyModel[11].setRotationPoint(4.5F, 6F, 6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 182
		bodyModel[12].setRotationPoint(17.5F, 5F, 6.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 183
		bodyModel[13].setRotationPoint(11.5F, 5F, 6.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[14].setRotationPoint(4.5F, 6F, 6.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 185
		bodyModel[15].setRotationPoint(-11.5F, 6F, 6.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 12, 3, 1, 0F); // Box 186
		bodyModel[16].setRotationPoint(-23.5F, 3F, 6.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 187
		bodyModel[17].setRotationPoint(-19.5F, 6F, 6.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 188
		bodyModel[18].setRotationPoint(-28.5F, 3F, 6.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F); // Box 189
		bodyModel[19].setRotationPoint(-28.5F, 3.5F, 6.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[20].setRotationPoint(25.5F, -1F, 6.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 191
		bodyModel[21].setRotationPoint(-24F, 2F, 7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 192
		bodyModel[22].setRotationPoint(-24F, 3F, 7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[23].setRotationPoint(-22F, 3F, 7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 194
		bodyModel[24].setRotationPoint(-24F, 1F, 7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 195
		bodyModel[25].setRotationPoint(-23F, 6F, 6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 196
		bodyModel[26].setRotationPoint(21F, 3F, 7.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[27].setRotationPoint(23F, 3F, 7.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 198
		bodyModel[28].setRotationPoint(21F, 2F, 7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 199
		bodyModel[29].setRotationPoint(21F, 1F, 7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 200
		bodyModel[30].setRotationPoint(-15F, 3F, 7.5F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 201
		bodyModel[31].setRotationPoint(-14.5F, 1F, 7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 202
		bodyModel[32].setRotationPoint(-13.5F, 1F, 7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 203
		bodyModel[33].setRotationPoint(-19.5F, 1F, 7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 204
		bodyModel[34].setRotationPoint(-9.5F, 0.5F, 7.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 205
		bodyModel[35].setRotationPoint(-9.5F, 2.5F, 7.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 206
		bodyModel[36].setRotationPoint(-19.5F, 2.5F, 7.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 207
		bodyModel[37].setRotationPoint(-19.5F, 0.5F, 7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F); // Box 208
		bodyModel[38].setRotationPoint(-13F, 3.5F, 7.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F); // Box 209
		bodyModel[39].setRotationPoint(-13F, 5F, 7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F); // Box 210
		bodyModel[40].setRotationPoint(-16F, 5F, 7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F); // Box 211
		bodyModel[41].setRotationPoint(-16F, 3.5F, 7.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F); // Box 212
		bodyModel[42].setRotationPoint(12F, 5F, 7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F); // Box 213
		bodyModel[43].setRotationPoint(12F, 3.5F, 7.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 214
		bodyModel[44].setRotationPoint(8.5F, 2.5F, 7.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 215
		bodyModel[45].setRotationPoint(8.5F, 0.5F, 7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 216
		bodyModel[46].setRotationPoint(8.5F, 1F, 7.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 217
		bodyModel[47].setRotationPoint(13.5F, 1F, 7.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 218
		bodyModel[48].setRotationPoint(14.5F, 1F, 7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 219
		bodyModel[49].setRotationPoint(13F, 3F, 7.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F); // Box 220
		bodyModel[50].setRotationPoint(15F, 3.5F, 7.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F); // Box 221
		bodyModel[51].setRotationPoint(15F, 5F, 7.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 222
		bodyModel[52].setRotationPoint(18.5F, 2.5F, 7.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 223
		bodyModel[53].setRotationPoint(18.5F, 0.5F, 7.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 224
		bodyModel[54].setRotationPoint(-6.5F, 4F, 7.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 225
		bodyModel[55].setRotationPoint(-0.5F, 4F, 7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 226
		bodyModel[56].setRotationPoint(0.5F, 4F, 7.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 227
		bodyModel[57].setRotationPoint(-5.5F, 2F, 7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 228
		bodyModel[58].setRotationPoint(-6F, 0.75F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 229
		bodyModel[59].setRotationPoint(4F, 0.75F, 7F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 230
		bodyModel[60].setRotationPoint(4.5F, 2F, 7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[61].setRotationPoint(-0.5F, 2F, 7.5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 3, 17, 0F); // Box 232
		bodyModel[62].setRotationPoint(-29.5F, 0F, -8.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 17, 3, 1, 0F); // Box 63
		bodyModel[63].setRotationPoint(-28.5F, 0F, -7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 64
		bodyModel[64].setRotationPoint(-28.5F, 3F, -7.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[65].setRotationPoint(-28.5F, 3.5F, -7.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 12, 3, 1, 0F); // Box 66
		bodyModel[66].setRotationPoint(-23.5F, 3F, -7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[67].setRotationPoint(-19.5F, -1F, -7.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 68
		bodyModel[68].setRotationPoint(-16.5F, -1F, -7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[69].setRotationPoint(-11.5F, -1F, -7.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 23, 5, 1, 0F); // Box 70
		bodyModel[70].setRotationPoint(-11.5F, 1F, -7.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 71
		bodyModel[71].setRotationPoint(-19.5F, 6F, -7.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[72].setRotationPoint(-17.5F, 6F, -7.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Box 73
		bodyModel[73].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[74].setRotationPoint(8.5F, -1F, -7.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 75
		bodyModel[75].setRotationPoint(11.5F, -1F, -7.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 16, 5, 1, 0F); // Box 76
		bodyModel[76].setRotationPoint(11.5F, 0F, -7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[77].setRotationPoint(16.5F, -1F, -7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 78
		bodyModel[78].setRotationPoint(17.5F, 5F, -7.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[79].setRotationPoint(4.5F, 6F, -7.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 80
		bodyModel[80].setRotationPoint(11.5F, 5F, -7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 81
		bodyModel[81].setRotationPoint(-11.5F, 6F, -7.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[82].setRotationPoint(4.5F, 6F, -7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[83].setRotationPoint(25.5F, -1F, -7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F); // Box 84
		bodyModel[84].setRotationPoint(-23F, 6F, -7.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 85
		bodyModel[85].setRotationPoint(8.5F, 2.5F, -8.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 86
		bodyModel[86].setRotationPoint(8.5F, 0.5F, -8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 87
		bodyModel[87].setRotationPoint(8.5F, 1F, -8.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 88
		bodyModel[88].setRotationPoint(13.5F, 1F, -8.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 89
		bodyModel[89].setRotationPoint(14.5F, 1F, -8.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 90
		bodyModel[90].setRotationPoint(18.5F, 0.5F, -8.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 91
		bodyModel[91].setRotationPoint(18.5F, 2.5F, -8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[92].setRotationPoint(13F, 3F, -8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[93].setRotationPoint(12F, 3.5F, -8.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[94].setRotationPoint(12F, 5F, -8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[95].setRotationPoint(15F, 3.5F, -8.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 96
		bodyModel[96].setRotationPoint(15F, 5F, -8.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 97
		bodyModel[97].setRotationPoint(21F, 3F, -9.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[98].setRotationPoint(23F, 3F, -9.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 99
		bodyModel[99].setRotationPoint(21F, 2F, -10.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[100].setRotationPoint(21F, 1F, -9.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 101
		bodyModel[101].setRotationPoint(4F, 0.75F, -9F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 102
		bodyModel[102].setRotationPoint(4.5F, 2F, -8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 103
		bodyModel[103].setRotationPoint(0.5F, 4F, -8.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[104].setRotationPoint(-0.5F, 2F, -8.5F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 105
		bodyModel[105].setRotationPoint(-0.5F, 4F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 106
		bodyModel[106].setRotationPoint(-6.5F, 4F, -8.5F);

		bodyModel[107].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 107
		bodyModel[107].setRotationPoint(-5.5F, 2F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 108
		bodyModel[108].setRotationPoint(-6F, 0.75F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 109
		bodyModel[109].setRotationPoint(-9.5F, 0.5F, -8.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 110
		bodyModel[110].setRotationPoint(-9.5F, 2.5F, -8.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Box 111
		bodyModel[111].setRotationPoint(-13.5F, 1F, -8.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 112
		bodyModel[112].setRotationPoint(-14.5F, 1F, -8.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[113].setRotationPoint(-19.5F, 1F, -8.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 114
		bodyModel[114].setRotationPoint(-19.5F, 0.5F, -8.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 115
		bodyModel[115].setRotationPoint(-19.5F, 2.5F, -8.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 116
		bodyModel[116].setRotationPoint(-13F, 3.5F, -8.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[117].setRotationPoint(-15F, 3F, -8.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		bodyModel[118].setRotationPoint(-13F, 5F, -8.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 119
		bodyModel[119].setRotationPoint(-16F, 3.5F, -8.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[120].setRotationPoint(-16F, 5F, -8.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[121].setRotationPoint(-24F, 1F, -9.5F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Box 122
		bodyModel[122].setRotationPoint(-24F, 2F, -10.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 123
		bodyModel[123].setRotationPoint(-24F, 3F, -9.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[124].setRotationPoint(-22F, 3F, -9.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[125].setRotationPoint(-33.5F, 0F, -9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.25F, 0F, 0F); // Box 104
		bodyModel[126].setRotationPoint(-30F, 1F, -0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[127].setRotationPoint(-32F, 2F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[128].setRotationPoint(-33F, 1F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[129].setRotationPoint(-33.5F, 0F, 6F);

		bodyModel[130].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 109
		bodyModel[130].setRotationPoint(-33F, 1.5F, -7.5F);
		bodyModel[130].rotateAngleX = 0.78539816F;

		bodyModel[131].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 132
		bodyModel[131].setRotationPoint(-33F, 1.5F, 7.5F);
		bodyModel[131].rotateAngleX = 0.78539816F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[132].setRotationPoint(26.5F, -1F, -6.5F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 5, 13, 0F); // Box 134
		bodyModel[133].setRotationPoint(26.5F, 0F, -6.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 135
		bodyModel[134].setRotationPoint(27.5F, 1F, -1F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 136
		bodyModel[135].setRotationPoint(7.5F, 5.5F, 6F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 137
		bodyModel[136].setRotationPoint(19.5F, 4.5F, 6F);

		bodyModel[137].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 138
		bodyModel[137].setRotationPoint(8.5F, 7.5F, 6F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 139
		bodyModel[138].setRotationPoint(7.5F, 5.5F, -7F);

		bodyModel[139].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 140
		bodyModel[139].setRotationPoint(8.5F, 7.5F, -7F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 141
		bodyModel[140].setRotationPoint(19.5F, 4.5F, -7F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 142
		bodyModel[141].setRotationPoint(-20.5F, 5.5F, -7F);

		bodyModel[142].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 143
		bodyModel[142].setRotationPoint(-19.5F, 7.5F, -7F);

		bodyModel[143].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 144
		bodyModel[143].setRotationPoint(-8.5F, 5.5F, -7F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 145
		bodyModel[144].setRotationPoint(-20.5F, 5.5F, 6F);

		bodyModel[145].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Box 146
		bodyModel[145].setRotationPoint(-19.5F, 7.5F, 6F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 147
		bodyModel[146].setRotationPoint(-8.5F, 5.5F, 6F);

		bodyModel[147].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 15
		bodyModel[147].setRotationPoint(-14F, 5F, 6F);

		bodyModel[148].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 33
		bodyModel[148].setRotationPoint(-14F, 5F, -6F);

		bodyModel[149].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 48
		bodyModel[149].setRotationPoint(-14F, 5F, -7F);

		bodyModel[150].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 152
		bodyModel[150].setRotationPoint(14F, 5F, 6F);

		bodyModel[151].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 153
		bodyModel[151].setRotationPoint(14F, 5F, -7F);

		bodyModel[152].addBox(-5F, -5F, 0F, 10, 10, 0, 0F); // Box 154
		bodyModel[152].setRotationPoint(14F, 5F, -6F);

		bodyModel[153].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 155
		bodyModel[153].setRotationPoint(-27.5F, 3F, -2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 156
		bodyModel[154].setRotationPoint(-29.5F, 3F, -2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[155].setRotationPoint(-25.5F, 3F, -2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 158
		bodyModel[156].setRotationPoint(-29.5F, 3F, 1F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 159
		bodyModel[157].setRotationPoint(-27.5F, 3F, 1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[158].setRotationPoint(-25.5F, 3F, 1F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 161
		bodyModel[159].setRotationPoint(-27.5F, 5F, -1F);

		bodyModel[160].addBox(0F, 0F, 0F, 5, 2, 4, 0F); // Box 162
		bodyModel[160].setRotationPoint(-28.5F, 1F, -2F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 163
		bodyModel[161].setRotationPoint(-20.5F, 6F, -6F);

		bodyModel[162].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 164
		bodyModel[162].setRotationPoint(-25.5F, 6F, -0.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 169
		bodyModel[163].setRotationPoint(25.5F, 5F, -2F);

		bodyModel[164].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 170
		bodyModel[164].setRotationPoint(20.5F, 6F, -0.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 171
		bodyModel[165].setRotationPoint(19.5F, 6F, -6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 172
		bodyModel[166].setRotationPoint(24.5F, 5F, -2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 173
		bodyModel[167].setRotationPoint(24.5F, 5F, 1F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 174
		bodyModel[168].setRotationPoint(25.5F, 5F, 1F);

		bodyModel[169].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 175
		bodyModel[169].setRotationPoint(25.5F, 6F, -1F);

		bodyModel[170].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 176
		bodyModel[170].setRotationPoint(24.5F, 3F, -2F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 1, 13, 0F); // Box 171
		bodyModel[171].setRotationPoint(-1.5F, 1F, -6.5F);

		bodyModel[172].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 172
		bodyModel[172].setRotationPoint(-1.5F, 0F, -1.5F);
	}
}