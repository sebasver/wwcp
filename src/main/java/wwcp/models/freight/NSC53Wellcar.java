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

public class NSC53Wellcar extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public NSC53Wellcar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[164];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 57
		bodyModel[2] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 58
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 59
		bodyModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 60
		bodyModel[5] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 62
		bodyModel[6] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 62
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 70
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 71
		bodyModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 72
		bodyModel[10] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 73
		bodyModel[11] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 74
		bodyModel[12] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 75
		bodyModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 76
		bodyModel[14] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 77
		bodyModel[15] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 78
		bodyModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 79
		bodyModel[17] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 80
		bodyModel[18] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 81
		bodyModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 82
		bodyModel[20] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 83
		bodyModel[21] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 84
		bodyModel[22] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 85
		bodyModel[23] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 86
		bodyModel[24] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 87
		bodyModel[25] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 88
		bodyModel[26] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 89
		bodyModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 90
		bodyModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 71
		bodyModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 92
		bodyModel[30] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 93
		bodyModel[31] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 94
		bodyModel[32] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 79
		bodyModel[33] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 79
		bodyModel[34] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 79
		bodyModel[35] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 79
		bodyModel[36] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 79
		bodyModel[37] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 58
		bodyModel[39] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 59
		bodyModel[40] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 60
		bodyModel[41] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 72
		bodyModel[42] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 73
		bodyModel[43] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 89
		bodyModel[44] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 89
		bodyModel[45] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 89
		bodyModel[46] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 89
		bodyModel[47] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 89
		bodyModel[48] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 28
		bodyModel[49] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 89
		bodyModel[50] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 89
		bodyModel[51] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 89
		bodyModel[52] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 89
		bodyModel[53] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 76
		bodyModel[54] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 76
		bodyModel[55] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 111
		bodyModel[56] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 112
		bodyModel[57] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 113
		bodyModel[58] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 114
		bodyModel[59] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 115
		bodyModel[60] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 116
		bodyModel[61] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 117
		bodyModel[62] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 118
		bodyModel[63] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 119
		bodyModel[64] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 120
		bodyModel[65] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 121
		bodyModel[66] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 122
		bodyModel[67] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 123
		bodyModel[68] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 124
		bodyModel[69] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 125
		bodyModel[70] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 126
		bodyModel[71] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 127
		bodyModel[72] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 128
		bodyModel[73] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 129
		bodyModel[74] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 130
		bodyModel[75] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 131
		bodyModel[76] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 132
		bodyModel[77] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 133
		bodyModel[78] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 134
		bodyModel[79] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 135
		bodyModel[80] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 136
		bodyModel[81] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 137
		bodyModel[82] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 138
		bodyModel[83] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 139
		bodyModel[84] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 140
		bodyModel[85] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 141
		bodyModel[86] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 142
		bodyModel[87] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 143
		bodyModel[88] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 144
		bodyModel[89] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 145
		bodyModel[90] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 146
		bodyModel[91] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 147
		bodyModel[92] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 148
		bodyModel[93] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 149
		bodyModel[94] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 150
		bodyModel[95] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 151
		bodyModel[96] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 152
		bodyModel[97] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 153
		bodyModel[98] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 154
		bodyModel[99] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 155
		bodyModel[100] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 156
		bodyModel[101] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 157
		bodyModel[102] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 158
		bodyModel[103] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 159
		bodyModel[104] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 160
		bodyModel[105] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 161
		bodyModel[106] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 162
		bodyModel[107] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 111
		bodyModel[108] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 164
		bodyModel[109] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 164
		bodyModel[110] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 166
		bodyModel[111] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 167
		bodyModel[112] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 170
		bodyModel[113] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 172
		bodyModel[114] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 173
		bodyModel[115] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 174
		bodyModel[116] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 175
		bodyModel[117] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 176
		bodyModel[118] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 177
		bodyModel[119] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 178
		bodyModel[120] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 179
		bodyModel[121] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 180
		bodyModel[122] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 181
		bodyModel[123] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 182
		bodyModel[124] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 184
		bodyModel[125] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 185
		bodyModel[126] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 186
		bodyModel[127] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 187
		bodyModel[128] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 188
		bodyModel[129] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 189
		bodyModel[130] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 190
		bodyModel[131] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 191
		bodyModel[132] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 192
		bodyModel[133] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 193
		bodyModel[134] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 194
		bodyModel[135] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 195
		bodyModel[136] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 196
		bodyModel[137] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 197
		bodyModel[138] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 198
		bodyModel[139] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 199
		bodyModel[140] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 200
		bodyModel[141] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 201
		bodyModel[142] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 202
		bodyModel[143] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 203
		bodyModel[144] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 204
		bodyModel[145] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 205
		bodyModel[146] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 206
		bodyModel[147] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 207
		bodyModel[148] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 208
		bodyModel[149] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 209
		bodyModel[150] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 210
		bodyModel[151] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 211
		bodyModel[152] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 33
		bodyModel[153] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 33
		bodyModel[154] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 214
		bodyModel[155] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 215
		bodyModel[156] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 156
		bodyModel[157] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 158
		bodyModel[158] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 159
		bodyModel[159] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 160
		bodyModel[160] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // NA TEU
		bodyModel[161] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // NA TEU
		bodyModel[162] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 163
		bodyModel[163] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 164

		bodyModel[0].addBox(0F, 0F, 0F, 113, 8, 1, 0F); // Box 52
		bodyModel[0].setRotationPoint(-56.5F, 1F, 10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		bodyModel[1].setRotationPoint(56.5F, 1F, 10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[2].setRotationPoint(56.5F, 6F, 10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[3].setRotationPoint(56.5F, 5F, 10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[4].setRotationPoint(58.5F, 5F, 10F);

		bodyModel[5].addBox(0F, 0F, 0F, 113, 0, 20, 0F); // Box 62
		bodyModel[5].setRotationPoint(-56.5F, 9F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[6].setRotationPoint(56.5F, 4F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 113, 8, 1, 0F); // Box 70
		bodyModel[7].setRotationPoint(-56.5F, 1F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 8, 0, 20, 0F); // Box 71
		bodyModel[8].setRotationPoint(56.5F, 4F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 72
		bodyModel[9].setRotationPoint(67.5F, 1F, 11F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 73
		bodyModel[10].setRotationPoint(67.5F, 3.5F, 11.01F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[11].setRotationPoint(64.5F, 1.5F, -10F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 0, 22, 0F); // Box 75
		bodyModel[12].setRotationPoint(67.5F, 4F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 0, 6, 0F); // Box 76
		bodyModel[13].setRotationPoint(68.5F, 4F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		bodyModel[14].setRotationPoint(71.5F, 3.5F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 78
		bodyModel[15].setRotationPoint(75.5F, 2.5F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 79
		bodyModel[16].setRotationPoint(75.5F, 4F, 3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[17].setRotationPoint(75.5F, 4F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 2, 6, 0F); // Box 81
		bodyModel[18].setRotationPoint(75.5F, 4F, -3F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 82
		bodyModel[19].setRotationPoint(68.5F, 4F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[20].setRotationPoint(68.5F, 4F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[21].setRotationPoint(70.5F, 4F, -5F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 85
		bodyModel[22].setRotationPoint(68.5F, 4F, 3F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 86
		bodyModel[23].setRotationPoint(70.5F, 4F, 3F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[24].setRotationPoint(68.5F, 4F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 88
		bodyModel[25].setRotationPoint(59.5F, 1F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 89
		bodyModel[26].setRotationPoint(62.5F, 1F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
		bodyModel[27].setRotationPoint(62.5F, 1F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[28].setRotationPoint(56.5F, 1F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 92
		bodyModel[29].setRotationPoint(57.5F, 1F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[30].setRotationPoint(56.5F, 1F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 94
		bodyModel[31].setRotationPoint(57.5F, 1F, 9F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 79
		bodyModel[32].setRotationPoint(75.5F, 3.5F, -0.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 79
		bodyModel[33].setRotationPoint(76.5F, 3F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[34].setRotationPoint(76.5F, 3F, -1.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[35].setRotationPoint(76.5F, 3F, 0.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[36].setRotationPoint(78.5F, 3F, -0.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		bodyModel[37].setRotationPoint(56.5F, 1F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[38].setRotationPoint(56.5F, 6F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[39].setRotationPoint(56.5F, 5F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[40].setRotationPoint(58.5F, 5F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 72
		bodyModel[41].setRotationPoint(67.5F, 1F, -11F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 73
		bodyModel[42].setRotationPoint(67.5F, 3.5F, -11.01F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 89
		bodyModel[43].setRotationPoint(71.5F, 1.5F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 89
		bodyModel[44].setRotationPoint(71.5F, 1.5F, -11.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 89
		bodyModel[45].setRotationPoint(74.5F, 0.5F, -11.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 89
		bodyModel[46].setRotationPoint(72F, 5.5F, -11.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 89
		bodyModel[47].setRotationPoint(72F, 3.5F, -11.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[48].setRotationPoint(65F, 4F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 89
		bodyModel[49].setRotationPoint(71.5F, 1.5F, 10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 89
		bodyModel[50].setRotationPoint(74.5F, 0.5F, 10.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 89
		bodyModel[51].setRotationPoint(72F, 5.5F, 10.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 89
		bodyModel[52].setRotationPoint(72F, 3.5F, 10.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 76
		bodyModel[53].setRotationPoint(72F, 2F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 76
		bodyModel[54].setRotationPoint(72F, 3F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 135, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 111
		bodyModel[55].setRotationPoint(-67.5F, 1F, 11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[56].setRotationPoint(-72.5F, 1F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 113
		bodyModel[57].setRotationPoint(-62.5F, 1F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[58].setRotationPoint(-72.5F, 1F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[59].setRotationPoint(-67.5F, 1.5F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 116
		bodyModel[60].setRotationPoint(-75.5F, 4F, 3F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 117
		bodyModel[61].setRotationPoint(-70.5F, 4F, 3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 118
		bodyModel[62].setRotationPoint(-70.5F, 4F, 5F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 0, 22, 0F); // Box 119
		bodyModel[63].setRotationPoint(-68.5F, 4F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 7, 0, 6, 0F); // Box 120
		bodyModel[64].setRotationPoint(-75.5F, 4F, -3F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 121
		bodyModel[65].setRotationPoint(-70.5F, 4F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 0, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[66].setRotationPoint(-75.5F, 4F, -5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 0, 6, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[67].setRotationPoint(-70.5F, 4F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 124
		bodyModel[68].setRotationPoint(-75.5F, 3.5F, -11.01F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 125
		bodyModel[69].setRotationPoint(-68.5F, 1F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 126
		bodyModel[70].setRotationPoint(-75.5F, 3.5F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 127
		bodyModel[71].setRotationPoint(-75.5F, 0.5F, -11.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 128
		bodyModel[72].setRotationPoint(-75F, 3.5F, -11.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 129
		bodyModel[73].setRotationPoint(-75F, 5.5F, -11.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 130
		bodyModel[74].setRotationPoint(-72.5F, 1.5F, -11.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 0, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		bodyModel[75].setRotationPoint(-75.51F, 2.5F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 132
		bodyModel[76].setRotationPoint(-75.5F, 4F, 3F);

		bodyModel[77].addBox(0F, 0F, 0F, 0, 2, 6, 0F); // Box 133
		bodyModel[77].setRotationPoint(-75.5F, 4F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[78].setRotationPoint(-75.5F, 4F, -11F);

		bodyModel[79].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Box 135
		bodyModel[79].setRotationPoint(-75.5F, 3.5F, 11.01F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 136
		bodyModel[80].setRotationPoint(-68.5F, 1F, 11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[81].setRotationPoint(-67.5F, 1F, 10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 138
		bodyModel[82].setRotationPoint(-60.5F, 5F, 10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[83].setRotationPoint(-58.5F, 5F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 140
		bodyModel[84].setRotationPoint(-58.5F, 6F, 10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[85].setRotationPoint(-72.5F, 1.5F, 10.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[86].setRotationPoint(-75F, 3.5F, 10.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[87].setRotationPoint(-75.5F, 0.5F, 10.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[88].setRotationPoint(-75F, 5.5F, 10.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 145
		bodyModel[89].setRotationPoint(-72.5F, 1.5F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 1, 2, 0F); // Box 146
		bodyModel[90].setRotationPoint(-72F, 2F, -1F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 147
		bodyModel[91].setRotationPoint(-72F, 3F, -1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 148
		bodyModel[92].setRotationPoint(-59.5F, 1F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 149
		bodyModel[93].setRotationPoint(-58.5F, 1F, -10F);

		bodyModel[94].addBox(0F, 0F, 0F, 8, 0, 20, 0F); // Box 150
		bodyModel[94].setRotationPoint(-64.5F, 4F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 151
		bodyModel[95].setRotationPoint(-59.5F, 1F, 9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 152
		bodyModel[96].setRotationPoint(-58.5F, 1F, 9F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 153
		bodyModel[97].setRotationPoint(-76.5F, 3.5F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 154
		bodyModel[98].setRotationPoint(-78.5F, 3F, -1.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 155
		bodyModel[99].setRotationPoint(-77.5F, 3F, -0.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 156
		bodyModel[100].setRotationPoint(-79.5F, 3F, 0.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[101].setRotationPoint(-79.5F, 3F, -0.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 158
		bodyModel[102].setRotationPoint(-67.5F, 1F, -11F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Box 159
		bodyModel[103].setRotationPoint(-60.5F, 5F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[104].setRotationPoint(-58.5F, 5F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 161
		bodyModel[105].setRotationPoint(-58.5F, 6F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 0, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[106].setRotationPoint(-56.5F, 4F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 111
		bodyModel[107].setRotationPoint(-67.5F, 2F, 11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 164
		bodyModel[108].setRotationPoint(65.5F, 2F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 164
		bodyModel[109].setRotationPoint(55.5F, 2F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 166
		bodyModel[110].setRotationPoint(-56.5F, 2F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 167
		bodyModel[111].setRotationPoint(48.5F, 2F, 11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 170
		bodyModel[112].setRotationPoint(-49.5F, 2F, 11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 172
		bodyModel[113].setRotationPoint(33.5F, 2F, 11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 173
		bodyModel[114].setRotationPoint(26.5F, 2F, 11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 174
		bodyModel[115].setRotationPoint(19.5F, 2F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 175
		bodyModel[116].setRotationPoint(12.5F, 2F, 11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 176
		bodyModel[117].setRotationPoint(5.5F, 2F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 177
		bodyModel[118].setRotationPoint(-34.5F, 2F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 178
		bodyModel[119].setRotationPoint(-27.5F, 2F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 179
		bodyModel[120].setRotationPoint(-20.5F, 2F, 11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 180
		bodyModel[121].setRotationPoint(-13.5F, 2F, 11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 181
		bodyModel[122].setRotationPoint(-6.5F, 2F, 11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 182
		bodyModel[123].setRotationPoint(-1F, 2F, 11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 184
		bodyModel[124].setRotationPoint(40.5F, 2F, 11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 185
		bodyModel[125].setRotationPoint(-42.5F, 2F, 11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[126].setRotationPoint(40.5F, 0F, 10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[127].setRotationPoint(40.5F, 0F, -12F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[128].setRotationPoint(-62.5F, 0F, -12F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 22, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[129].setRotationPoint(-62.5F, 0F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[130].setRotationPoint(55.5F, 2F, -12F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[131].setRotationPoint(48.5F, 2F, -12F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 192
		bodyModel[132].setRotationPoint(40.5F, 2F, -12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[133].setRotationPoint(33.5F, 2F, -12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[134].setRotationPoint(26.5F, 2F, -12F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[135].setRotationPoint(19.5F, 2F, -12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[136].setRotationPoint(12.5F, 2F, -12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[137].setRotationPoint(5.5F, 2F, -12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 198
		bodyModel[138].setRotationPoint(-1F, 2F, -12F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[139].setRotationPoint(-6.5F, 2F, -12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[140].setRotationPoint(-13.5F, 2F, -12F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[141].setRotationPoint(-20.5F, 2F, -12F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[142].setRotationPoint(-27.5F, 2F, -12F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[143].setRotationPoint(-34.5F, 2F, -12F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 204
		bodyModel[144].setRotationPoint(-42.5F, 2F, -12F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[145].setRotationPoint(-49.5F, 2F, -12F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[146].setRotationPoint(-56.5F, 2F, -12F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 207
		bodyModel[147].setRotationPoint(-67.5F, 2F, -12F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 208
		bodyModel[148].setRotationPoint(65.5F, 2F, -12F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 135, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[149].setRotationPoint(-67.5F, 1F, -12F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[150].setRotationPoint(-67F, 4F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[151].setRotationPoint(75.5F, 0.5F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[152].setRotationPoint(75.51F, 1F, -9.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[153].setRotationPoint(76.51F, 0F, -10.5F);

		bodyModel[154].addShapeBox(-1F, -1F, 0F, 2, 2, 4, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 214
		bodyModel[154].setRotationPoint(-69.5F, 2.75F, -10.5F);
		bodyModel[154].rotateAngleZ = -0.78539816F;

		bodyModel[155].addShapeBox(-1F, -1F, 0F, 2, 2, 4, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 215
		bodyModel[155].setRotationPoint(-69.5F, 2.75F, 6.5F);
		bodyModel[155].rotateAngleZ = -0.78539816F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 156
		bodyModel[156].setRotationPoint(-76F, 3F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 158
		bodyModel[157].setRotationPoint(-76F, 3F, 7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 159
		bodyModel[158].setRotationPoint(75F, 3F, 7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 160
		bodyModel[159].setRotationPoint(75F, 3F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 102, 20, 20, 0F,-8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F); // NA TEU
		bodyModel[160].setRotationPoint(-51F, -10.01F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 51, 20, 20, 0F,-4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F); // NA TEU
		bodyModel[161].setRotationPoint(-46.75F, -10.01F, -10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 51, 20, 20, 0F,-4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F, -4.25F, -1F, 0F); // Box 163
		bodyModel[162].setRotationPoint(-4.25F, -10.01F, -10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 102, 20, 20, 0F,-8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F, -8.5F, -1F, 0F); // Box 164
		bodyModel[163].setRotationPoint(-51F, -28.01F, -10F);
	}
}