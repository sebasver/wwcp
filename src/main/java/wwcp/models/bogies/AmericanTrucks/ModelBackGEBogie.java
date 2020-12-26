//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.12.2020 - 11:15:54
// Last changed on: 21.12.2020 - 11:15:54

package wwcp.models.bogies.AmericanTrucks; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBackGEBogie extends ModelBase //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelBackGEBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[162];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 39
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 173
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 22
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 23
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 68
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 69
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 70
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 151
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 153
		bodyModel[15] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 155
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 38
		bodyModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 51
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 52
		bodyModel[21] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 53
		bodyModel[22] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 63
		bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 64
		bodyModel[24] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 66
		bodyModel[25] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 67
		bodyModel[26] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 124
		bodyModel[27] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 69
		bodyModel[28] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 91
		bodyModel[29] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 92
		bodyModel[30] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 95
		bodyModel[31] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 96
		bodyModel[32] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 97
		bodyModel[33] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 98
		bodyModel[34] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 101
		bodyModel[35] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 102
		bodyModel[36] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 103
		bodyModel[37] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 109
		bodyModel[38] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 110
		bodyModel[39] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 111
		bodyModel[40] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 113
		bodyModel[41] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 114
		bodyModel[42] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 115
		bodyModel[43] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 116
		bodyModel[44] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 117
		bodyModel[45] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 118
		bodyModel[46] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 119
		bodyModel[47] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 120
		bodyModel[48] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 121
		bodyModel[49] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 123
		bodyModel[50] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 124
		bodyModel[51] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 127
		bodyModel[52] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 129
		bodyModel[53] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 130
		bodyModel[54] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 131
		bodyModel[55] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 132
		bodyModel[56] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 133
		bodyModel[57] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 134
		bodyModel[58] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 135
		bodyModel[59] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 136
		bodyModel[60] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 137
		bodyModel[61] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 138
		bodyModel[62] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 139
		bodyModel[63] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 140
		bodyModel[64] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 141
		bodyModel[65] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 142
		bodyModel[66] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 143
		bodyModel[67] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 144
		bodyModel[68] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 145
		bodyModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 146
		bodyModel[70] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 147
		bodyModel[71] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 148
		bodyModel[72] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 149
		bodyModel[73] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 150
		bodyModel[74] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 151
		bodyModel[75] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 152
		bodyModel[76] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 153
		bodyModel[77] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 154
		bodyModel[78] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 155
		bodyModel[79] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 156
		bodyModel[80] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 157
		bodyModel[81] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 158
		bodyModel[82] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 159
		bodyModel[83] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 160
		bodyModel[84] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 161
		bodyModel[85] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 162
		bodyModel[86] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 163
		bodyModel[87] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 164
		bodyModel[88] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 165
		bodyModel[89] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 166
		bodyModel[90] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 167
		bodyModel[91] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 168
		bodyModel[92] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 169
		bodyModel[93] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 170
		bodyModel[94] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 171
		bodyModel[95] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 172
		bodyModel[96] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 173
		bodyModel[97] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 174
		bodyModel[98] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 175
		bodyModel[99] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 176
		bodyModel[100] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 177
		bodyModel[101] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 178
		bodyModel[102] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 179
		bodyModel[103] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 180
		bodyModel[104] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 181
		bodyModel[105] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 182
		bodyModel[106] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 183
		bodyModel[107] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 184
		bodyModel[108] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 185
		bodyModel[109] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 186
		bodyModel[110] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 187
		bodyModel[111] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 188
		bodyModel[112] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 189
		bodyModel[113] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 190
		bodyModel[114] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 191
		bodyModel[115] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 192
		bodyModel[116] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 193
		bodyModel[117] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 194
		bodyModel[118] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 195
		bodyModel[119] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 196
		bodyModel[120] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 197
		bodyModel[121] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 198
		bodyModel[122] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 199
		bodyModel[123] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 200
		bodyModel[124] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 201
		bodyModel[125] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 202
		bodyModel[126] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 203
		bodyModel[127] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 204
		bodyModel[128] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 205
		bodyModel[129] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 206
		bodyModel[130] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 207
		bodyModel[131] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 208
		bodyModel[132] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 209
		bodyModel[133] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 210
		bodyModel[134] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 211
		bodyModel[135] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 212
		bodyModel[136] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 213
		bodyModel[137] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 214
		bodyModel[138] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 215
		bodyModel[139] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 216
		bodyModel[140] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 217
		bodyModel[141] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 218
		bodyModel[142] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 219
		bodyModel[143] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 220
		bodyModel[144] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 221
		bodyModel[145] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 222
		bodyModel[146] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 223
		bodyModel[147] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 224
		bodyModel[148] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 225
		bodyModel[149] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 226
		bodyModel[150] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 227
		bodyModel[151] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 228
		bodyModel[152] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 229
		bodyModel[153] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 230
		bodyModel[154] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 231
		bodyModel[155] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 232
		bodyModel[156] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 156
		bodyModel[157] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 157
		bodyModel[158] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 158
		bodyModel[159] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 159
		bodyModel[160] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 160
		bodyModel[161] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 161

		bodyModel[0].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[0].setRotationPoint(16F, 6.5F, -5.95F);

		bodyModel[1].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[1].setRotationPoint(16F, 6.5F, 5.95F);

		bodyModel[2].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 6
		bodyModel[2].setRotationPoint(-12F, 6.5F, -5.95F);

		bodyModel[3].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 8
		bodyModel[3].setRotationPoint(-12F, 6.5F, 5.95F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 4
		bodyModel[4].setRotationPoint(15F, 5.5F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[5].setRotationPoint(15F, 5.5F, 8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[6].setRotationPoint(1F, 5.5F, 8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23
		bodyModel[7].setRotationPoint(-13F, 5.5F, 8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[8].setRotationPoint(1F, 5.5F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 69
		bodyModel[9].setRotationPoint(15F, 5.5F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 70
		bodyModel[10].setRotationPoint(-13F, 5.5F, -9.5F);

		bodyModel[11].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 15
		bodyModel[11].setRotationPoint(2F, 6.5F, 5.95F);

		bodyModel[12].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 16
		bodyModel[12].setRotationPoint(2F, 6.5F, -5.95F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 151
		bodyModel[13].setRotationPoint(-20F, 3F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[14].setRotationPoint(-20F, 3F, 5F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 155
		bodyModel[15].setRotationPoint(-20F, 4F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[16].setRotationPoint(5F, 4F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 29
		bodyModel[17].setRotationPoint(11F, 5F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 38
		bodyModel[18].setRotationPoint(-20F, 3F, -7F);

		bodyModel[19].addBox(0F, 0F, 0F, 11, 7, 11, 0F); // Box 51
		bodyModel[19].setRotationPoint(7F, 2F, -5.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 11, 7, 11, 0F); // Box 52
		bodyModel[20].setRotationPoint(-14F, 2F, -5.5F);

		bodyModel[21].addBox(0F, 0F, 0F, 10, 7, 11, 0F); // Box 53
		bodyModel[21].setRotationPoint(-3F, 1.5F, -5.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[22].setRotationPoint(-12.5F, 3F, 9F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 64
		bodyModel[23].setRotationPoint(-7.75F, 2.5F, 7.25F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[24].setRotationPoint(-14.5F, 2F, 9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[25].setRotationPoint(16.5F, 2F, 8F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[26].setRotationPoint(0F, 1F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 69
		bodyModel[27].setRotationPoint(7F, 2F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 91
		bodyModel[28].setRotationPoint(5.5F, 7F, 7.25F);
		bodyModel[28].rotateAngleZ = 0.15707963F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 92
		bodyModel[29].setRotationPoint(-12.5F, 2F, 9F);
		bodyModel[29].rotateAngleX = -0.08726646F;

		bodyModel[30].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 95
		bodyModel[30].setRotationPoint(5F, 3F, 7F);

		bodyModel[31].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 96
		bodyModel[31].setRotationPoint(-9F, 3F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[32].setRotationPoint(13F, 5F, 7F);

		bodyModel[33].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 98
		bodyModel[33].setRotationPoint(13F, 3F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 101
		bodyModel[34].setRotationPoint(15F, 2F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[35].setRotationPoint(18F, 2F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[36].setRotationPoint(12F, 2F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[37].setRotationPoint(4F, 2F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 110
		bodyModel[38].setRotationPoint(0F, 2F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[39].setRotationPoint(-2F, 2F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[40].setRotationPoint(-11F, 2F, 7F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 114
		bodyModel[41].setRotationPoint(-14F, 2F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[42].setRotationPoint(-16F, 2F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 116
		bodyModel[43].setRotationPoint(-3F, 5F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 117
		bodyModel[44].setRotationPoint(-9F, 5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 118
		bodyModel[45].setRotationPoint(-8.5F, 7F, 7.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[46].setRotationPoint(14F, 5.5F, 7.25F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 120
		bodyModel[47].setRotationPoint(14F, 4.5F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[48].setRotationPoint(17F, 5.5F, 7.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 123
		bodyModel[49].setRotationPoint(1F, 5.5F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 124
		bodyModel[50].setRotationPoint(-13F, 5.5F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 127
		bodyModel[51].setRotationPoint(13F, 7.5F, 8.25F);

		bodyModel[52].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 129
		bodyModel[52].setRotationPoint(13F, 7.5F, 7.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 130
		bodyModel[53].setRotationPoint(17.9F, 5.5F, 7.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 131
		bodyModel[54].setRotationPoint(13.1F, 5.5F, 7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[55].setRotationPoint(0F, 5.5F, 7.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[56].setRotationPoint(3F, 5.5F, 7.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 134
		bodyModel[57].setRotationPoint(-1F, 7.5F, 8.25F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 135
		bodyModel[58].setRotationPoint(-0.9F, 5.5F, 7.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 136
		bodyModel[59].setRotationPoint(3.9F, 5.5F, 7.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[60].setRotationPoint(-14F, 5.5F, 7.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[61].setRotationPoint(-11F, 5.5F, 7.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 139
		bodyModel[62].setRotationPoint(-15F, 7.5F, 8.25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 140
		bodyModel[63].setRotationPoint(-14.9F, 5.5F, 7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 141
		bodyModel[64].setRotationPoint(-10.1F, 5.5F, 7.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 142
		bodyModel[65].setRotationPoint(-1F, 7.5F, 7.25F);

		bodyModel[66].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 143
		bodyModel[66].setRotationPoint(-15F, 7.5F, 7.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 144
		bodyModel[67].setRotationPoint(5F, 4F, 9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[68].setRotationPoint(13F, 4F, 9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 146
		bodyModel[69].setRotationPoint(4F, 4F, 9F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 147
		bodyModel[70].setRotationPoint(0F, 4.5F, 7F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 148
		bodyModel[71].setRotationPoint(-14F, 4.5F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 149
		bodyModel[72].setRotationPoint(-18F, 3F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 150
		bodyModel[73].setRotationPoint(18F, 5F, 7F);

		bodyModel[74].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 151
		bodyModel[74].setRotationPoint(-1F, 3F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[75].setRotationPoint(-1F, 5F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 153
		bodyModel[76].setRotationPoint(4F, 5F, 7F);

		bodyModel[77].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 154
		bodyModel[77].setRotationPoint(-15F, 3F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[78].setRotationPoint(-15F, 5F, 7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 156
		bodyModel[79].setRotationPoint(-10F, 5F, 7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 157
		bodyModel[80].setRotationPoint(16.5F, 2F, 9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[81].setRotationPoint(12.5F, 3F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F); // Box 159
		bodyModel[82].setRotationPoint(11.5F, 2.99F, 8F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 160
		bodyModel[83].setRotationPoint(9.75F, 2.5F, 7.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F); // Box 161
		bodyModel[84].setRotationPoint(-8.5F, 2.99F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[85].setRotationPoint(-14.5F, 2F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 163
		bodyModel[86].setRotationPoint(-14.5F, 1F, 9.25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 164
		bodyModel[87].setRotationPoint(18.25F, 1.5F, 9.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 165
		bodyModel[88].setRotationPoint(-15.25F, 1.5F, 9.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 166
		bodyModel[89].setRotationPoint(-6F, 2F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 167
		bodyModel[90].setRotationPoint(-6.5F, 1F, 7F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 168
		bodyModel[91].setRotationPoint(6.5F, 1F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[92].setRotationPoint(-20F, 3F, -9F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 170
		bodyModel[93].setRotationPoint(-18F, 3F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[94].setRotationPoint(-15F, 5F, -9F);

		bodyModel[95].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 172
		bodyModel[95].setRotationPoint(-15F, 3F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[96].setRotationPoint(-16F, 2F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 174
		bodyModel[97].setRotationPoint(-14F, 2F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[98].setRotationPoint(-11F, 2F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 176
		bodyModel[99].setRotationPoint(-10F, 5F, -9F);

		bodyModel[100].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 177
		bodyModel[100].setRotationPoint(-9F, 3F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[101].setRotationPoint(-1F, 5F, -9F);

		bodyModel[102].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 179
		bodyModel[102].setRotationPoint(-1F, 3F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[103].setRotationPoint(-2F, 2F, -9F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 181
		bodyModel[104].setRotationPoint(0F, 2F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[105].setRotationPoint(4F, 2F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 183
		bodyModel[106].setRotationPoint(4F, 5F, -9F);

		bodyModel[107].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 184
		bodyModel[107].setRotationPoint(5F, 3F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[108].setRotationPoint(13F, 5F, -9F);

		bodyModel[109].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 186
		bodyModel[109].setRotationPoint(13F, 3F, -9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[110].setRotationPoint(12F, 2F, -9F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 188
		bodyModel[111].setRotationPoint(15F, 2F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 189
		bodyModel[112].setRotationPoint(18F, 5F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[113].setRotationPoint(18F, 2F, -9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 191
		bodyModel[114].setRotationPoint(5F, 4F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 192
		bodyModel[115].setRotationPoint(13F, 4F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 193
		bodyModel[116].setRotationPoint(4F, 4F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[117].setRotationPoint(16.5F, 2F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 195
		bodyModel[118].setRotationPoint(16.5F, 2F, -9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[119].setRotationPoint(-14.5F, 2F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 197
		bodyModel[120].setRotationPoint(-14.5F, 2F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[121].setRotationPoint(13F, 7.5F, -9.25F);

		bodyModel[122].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 199
		bodyModel[122].setRotationPoint(13F, 7.5F, -8.25F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[123].setRotationPoint(17F, 5.5F, -9.25F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[124].setRotationPoint(14F, 5.5F, -9.25F);

		bodyModel[125].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 202
		bodyModel[125].setRotationPoint(-1F, 7.5F, -8.25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[126].setRotationPoint(-1F, 7.5F, -9.25F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[127].setRotationPoint(3F, 5.5F, -9.25F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[128].setRotationPoint(0F, 5.5F, -9.25F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[129].setRotationPoint(-11F, 5.5F, -9.25F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[130].setRotationPoint(-14F, 5.5F, -9.25F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[131].setRotationPoint(-15F, 7.5F, -9.25F);

		bodyModel[132].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 209
		bodyModel[132].setRotationPoint(-15F, 7.5F, -8.25F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 210
		bodyModel[133].setRotationPoint(14F, 4.5F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 211
		bodyModel[134].setRotationPoint(17.9F, 5.5F, -8.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 212
		bodyModel[135].setRotationPoint(13.1F, 5.5F, -8.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 213
		bodyModel[136].setRotationPoint(3.9F, 5.5F, -8.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 214
		bodyModel[137].setRotationPoint(0F, 4.5F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 215
		bodyModel[138].setRotationPoint(-0.9F, 5.5F, -8.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 216
		bodyModel[139].setRotationPoint(-14.9F, 5.5F, -8.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 217
		bodyModel[140].setRotationPoint(-14F, 4.5F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 218
		bodyModel[141].setRotationPoint(-10.1F, 5.5F, -8.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[142].setRotationPoint(5F, 4F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 220
		bodyModel[143].setRotationPoint(5.5F, 7F, -8.25F);
		bodyModel[143].rotateAngleZ = 0.15707963F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 221
		bodyModel[144].setRotationPoint(11F, 5F, -8F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 222
		bodyModel[145].setRotationPoint(-3F, 5F, -8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 223
		bodyModel[146].setRotationPoint(-8.5F, 7F, -8.25F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[147].setRotationPoint(-9F, 5F, -8F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 225
		bodyModel[148].setRotationPoint(-14.5F, 1F, -10.25F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 226
		bodyModel[149].setRotationPoint(18.25F, 1.5F, -10.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 227
		bodyModel[150].setRotationPoint(-15.25F, 1.5F, -10.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,0F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 228
		bodyModel[151].setRotationPoint(-8.5F, 2.99F, -10F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 229
		bodyModel[152].setRotationPoint(-12.5F, 3F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F); // Box 230
		bodyModel[153].setRotationPoint(11.5F, 2.99F, -10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 231
		bodyModel[154].setRotationPoint(12.5F, 3F, -10F);

		bodyModel[155].addShapeBox(0F, 0F, -1.5F, 1, 5, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 232
		bodyModel[155].setRotationPoint(-12.5F, 2F, -11F);
		bodyModel[155].rotateAngleX = 0.08726646F;

		bodyModel[156].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 156
		bodyModel[156].setRotationPoint(-6.5F, 1F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 157
		bodyModel[157].setRotationPoint(-6F, 2F, -9F);

		bodyModel[158].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 158
		bodyModel[158].setRotationPoint(-7.75F, 2.5F, -8.25F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 159
		bodyModel[159].setRotationPoint(7F, 2F, -9F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 160
		bodyModel[160].setRotationPoint(9.75F, 2.5F, -8.25F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 161
		bodyModel[161].setRotationPoint(6.5F, 1F, -9F);
	}
}