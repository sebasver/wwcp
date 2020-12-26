//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.12.2020 - 11:53:39
// Last changed on: 10.12.2020 - 11:53:39

package wwcp.models.bogies.AmericanTrucks; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class M500Truck extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public M500Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[177];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 17
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 17
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 17
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 79
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 79
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 380
		bodyModel[10] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 381
		bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 129
		bodyModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 79
		bodyModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 17
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 144
		bodyModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 144
		bodyModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 17
		bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 17
		bodyModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 17
		bodyModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 17
		bodyModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 17
		bodyModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 17
		bodyModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 17
		bodyModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 17
		bodyModel[30] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 191
		bodyModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 17
		bodyModel[32] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 17
		bodyModel[33] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 17
		bodyModel[34] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 17
		bodyModel[35] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 17
		bodyModel[36] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 191
		bodyModel[37] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 17
		bodyModel[38] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 17
		bodyModel[39] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 17
		bodyModel[40] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 17
		bodyModel[41] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 17
		bodyModel[42] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 136
		bodyModel[43] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 137
		bodyModel[44] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 161
		bodyModel[45] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 162
		bodyModel[46] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 17
		bodyModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 144
		bodyModel[48] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 144
		bodyModel[49] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 144
		bodyModel[50] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 17
		bodyModel[51] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 17
		bodyModel[52] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 144
		bodyModel[53] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 144
		bodyModel[54] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 144
		bodyModel[55] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 17
		bodyModel[56] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 17
		bodyModel[57] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 17
		bodyModel[58] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 17
		bodyModel[59] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 17
		bodyModel[60] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 17
		bodyModel[61] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 17
		bodyModel[62] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 17
		bodyModel[63] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 17
		bodyModel[64] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 144
		bodyModel[65] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 17
		bodyModel[66] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 17
		bodyModel[67] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 17
		bodyModel[68] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 17
		bodyModel[69] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 257
		bodyModel[70] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 136
		bodyModel[71] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 136
		bodyModel[72] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 136
		bodyModel[73] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 17
		bodyModel[74] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 17
		bodyModel[75] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 17
		bodyModel[76] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 17
		bodyModel[77] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 17
		bodyModel[78] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 17
		bodyModel[79] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 17
		bodyModel[80] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 17
		bodyModel[81] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 17
		bodyModel[82] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 17
		bodyModel[83] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 17
		bodyModel[84] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 17
		bodyModel[85] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 17
		bodyModel[86] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 17
		bodyModel[87] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 17
		bodyModel[88] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 17
		bodyModel[89] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 17
		bodyModel[90] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 17
		bodyModel[91] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 17
		bodyModel[92] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 17
		bodyModel[93] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 17
		bodyModel[94] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 17
		bodyModel[95] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 17
		bodyModel[96] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 144
		bodyModel[97] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 17
		bodyModel[98] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 119
		bodyModel[99] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 120
		bodyModel[100] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 121
		bodyModel[101] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 122
		bodyModel[102] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 124
		bodyModel[103] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 125
		bodyModel[104] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 126
		bodyModel[105] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 127
		bodyModel[106] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 128
		bodyModel[107] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 130
		bodyModel[108] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 133
		bodyModel[109] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 134
		bodyModel[110] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 137
		bodyModel[111] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 138
		bodyModel[112] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 139
		bodyModel[113] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 140
		bodyModel[114] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 141
		bodyModel[115] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 143
		bodyModel[116] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 145
		bodyModel[117] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 146
		bodyModel[118] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 147
		bodyModel[119] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 148
		bodyModel[120] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 149
		bodyModel[121] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 150
		bodyModel[122] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 151
		bodyModel[123] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 152
		bodyModel[124] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 153
		bodyModel[125] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 154
		bodyModel[126] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 155
		bodyModel[127] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 157
		bodyModel[128] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 158
		bodyModel[129] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 159
		bodyModel[130] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 161
		bodyModel[131] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 162
		bodyModel[132] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 165
		bodyModel[133] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 168
		bodyModel[134] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 171
		bodyModel[135] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 172
		bodyModel[136] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 173
		bodyModel[137] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 174
		bodyModel[138] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 175
		bodyModel[139] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 176
		bodyModel[140] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 177
		bodyModel[141] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 178
		bodyModel[142] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 179
		bodyModel[143] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 180
		bodyModel[144] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 181
		bodyModel[145] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 182
		bodyModel[146] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 183
		bodyModel[147] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 184
		bodyModel[148] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 185
		bodyModel[149] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 186
		bodyModel[150] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 187
		bodyModel[151] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 188
		bodyModel[152] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 192
		bodyModel[153] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 193
		bodyModel[154] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 194
		bodyModel[155] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 195
		bodyModel[156] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 197
		bodyModel[157] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 198
		bodyModel[158] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 199
		bodyModel[159] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 202
		bodyModel[160] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 203
		bodyModel[161] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 204
		bodyModel[162] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 17
		bodyModel[163] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 17
		bodyModel[164] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 17
		bodyModel[165] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 17
		bodyModel[166] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 206
		bodyModel[167] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 207
		bodyModel[168] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 208
		bodyModel[169] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 209
		bodyModel[170] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 210
		bodyModel[171] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 211
		bodyModel[172] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 212
		bodyModel[173] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 213
		bodyModel[174] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 214
		bodyModel[175] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 215
		bodyModel[176] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 216

		bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[0].setRotationPoint(4.75F, 4F, 6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 17
		bodyModel[1].setRotationPoint(-8.75F, 4.5F, 6.75F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -2F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[2].setRotationPoint(10.75F, 5.25F, 6.75F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[3].setRotationPoint(8.75F, 5.25F, 6.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 17
		bodyModel[4].setRotationPoint(8.75F, 6F, 6.75F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[5].setRotationPoint(-10.75F, 4F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[6].setRotationPoint(4.75F, 4F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[7].setRotationPoint(7F, 6.25F, 8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[8].setRotationPoint(-8.5F, 6.25F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 380
		bodyModel[9].setRotationPoint(7F, 6.25F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[10].setRotationPoint(-8.5F, 6.25F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 129
		bodyModel[11].setRotationPoint(-1F, 4F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 17
		bodyModel[12].setRotationPoint(6.25F, 6F, 6.75F);

		bodyModel[13].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[13].setRotationPoint(-10.75F, 4F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 17
		bodyModel[14].setRotationPoint(11.25F, 5.25F, 3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[15].setRotationPoint(11.25F, 6.25F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[16].setRotationPoint(11.25F, 5.75F, 3F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 0
		bodyModel[17].setRotationPoint(-8.75F, 6F, -8.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Box 79
		bodyModel[18].setRotationPoint(6.75F, 6F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[19].setRotationPoint(3.25F, 5.25F, 6.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -1F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, -0.5F, 0F, -1F, -0.5F, 0F, -4.75F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -0.5F, 0F, -4.75F, -0.5F); // Box 144
		bodyModel[20].setRotationPoint(-4.75F, 4.75F, 6.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -1F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, -0.5F, 0F, -1F, -0.5F, 0F, -4.75F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -0.5F, 0F, -4.75F, -0.5F); // Box 144
		bodyModel[21].setRotationPoint(3.25F, 4.75F, 6.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Box 17
		bodyModel[22].setRotationPoint(5.75F, 6F, 6.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 17
		bodyModel[23].setRotationPoint(5.25F, 5.75F, 6.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Box 17
		bodyModel[24].setRotationPoint(8.75F, 6F, 6.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17
		bodyModel[25].setRotationPoint(8.75F, 5.75F, 6.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 17
		bodyModel[26].setRotationPoint(8.75F, 4.5F, 6.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17
		bodyModel[27].setRotationPoint(7.25F, 5.75F, 6.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[28].setRotationPoint(7.25F, 5.25F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[29].setRotationPoint(6.75F, 5.25F, 7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 191
		bodyModel[30].setRotationPoint(11.25F, 5.25F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -2F); // Box 17
		bodyModel[31].setRotationPoint(-12.75F, 5.25F, 6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[32].setRotationPoint(-10.75F, 5.25F, 6.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 17
		bodyModel[33].setRotationPoint(-12.25F, 5.25F, 3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[34].setRotationPoint(-12.25F, 6.25F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[35].setRotationPoint(-12.25F, 5.75F, 3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 191
		bodyModel[36].setRotationPoint(-12.25F, 5.25F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[37].setRotationPoint(-5.25F, 5.25F, 6.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 17
		bodyModel[38].setRotationPoint(-6.75F, 6F, 6.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 17
		bodyModel[39].setRotationPoint(-9.25F, 6F, 6.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 17
		bodyModel[40].setRotationPoint(-5.75F, 5.75F, 6.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Box 17
		bodyModel[41].setRotationPoint(-9.75F, 6F, 6.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F); // Box 136
		bodyModel[42].setRotationPoint(1.75F, 4.75F, 7.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0.3F, -0.5F, -0.25F, 0.3F); // Box 137
		bodyModel[43].setRotationPoint(-3.25F, 4.75F, 7.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[44].setRotationPoint(-3F, 4.5F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[45].setRotationPoint(2F, 4.5F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[46].setRotationPoint(-5F, 8.25F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 144
		bodyModel[47].setRotationPoint(3.25F, 7.25F, 6.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 144
		bodyModel[48].setRotationPoint(-4.75F, 7.25F, 6.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 144
		bodyModel[49].setRotationPoint(3.75F, 7.75F, 6.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[50].setRotationPoint(-1.5F, 5.75F, -9.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[51].setRotationPoint(5F, 8.25F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 144
		bodyModel[52].setRotationPoint(3.25F, 7.75F, 7.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 144
		bodyModel[53].setRotationPoint(-4.25F, 7.75F, 6.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 144
		bodyModel[54].setRotationPoint(-4.75F, 7.75F, 7.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[55].setRotationPoint(4.75F, 7.75F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 17
		bodyModel[56].setRotationPoint(5.25F, 6F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		bodyModel[57].setRotationPoint(-6F, 8.25F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[58].setRotationPoint(-6F, 7.75F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 17
		bodyModel[59].setRotationPoint(-6.25F, 6F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F); // Box 17
		bodyModel[60].setRotationPoint(1.5F, 5.25F, 6.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, 0F, -1F, -0.5F); // Box 17
		bodyModel[61].setRotationPoint(3F, 5.5F, 6.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17
		bodyModel[62].setRotationPoint(-3.25F, 5.25F, 6.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.75F, -0.75F, -0.5F); // Box 17
		bodyModel[63].setRotationPoint(-4F, 5.5F, 6.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -1F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, -0.5F, 0F, -1F, -0.5F, 0F, -4.75F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -0.5F, 0F, -4.75F, -0.5F); // Box 144
		bodyModel[64].setRotationPoint(0F, 5.25F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[65].setRotationPoint(-1.5F, 7.75F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[66].setRotationPoint(-0.5F, 7.75F, 9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 17
		bodyModel[67].setRotationPoint(-1.5F, 6.25F, -3.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 17
		bodyModel[68].setRotationPoint(-1.5F, 6.25F, 3.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 257
		bodyModel[69].setRotationPoint(-1.5F, 6.25F, -8.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.54F, 0F, -0.5F, -0.54F, 0F, -0.5F, 0.04F, -0.5F, -0.5F, 0.04F); // Box 136
		bodyModel[70].setRotationPoint(1.25F, 7.75F, 7.99F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.54F, 0F, -0.5F, -0.54F, 0F, -0.5F, 0.04F, -0.5F, -0.5F, 0.04F); // Box 136
		bodyModel[71].setRotationPoint(-2.75F, 7.75F, 7.99F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.56F, 0F, -0.25F, -0.56F, 0F, -0.25F, 0.06F, -0.5F, -0.25F, 0.06F); // Box 136
		bodyModel[72].setRotationPoint(-2.75F, 8.25F, 8.03F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17
		bodyModel[73].setRotationPoint(-0.25F, 5.5F, 9.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 17
		bodyModel[74].setRotationPoint(-0.5F, 4.5F, 8.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[75].setRotationPoint(-0.5F, 5F, 9.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[76].setRotationPoint(0.5F, 5.25F, 8.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 17
		bodyModel[77].setRotationPoint(-1.5F, 5.25F, 8.25F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 17
		bodyModel[78].setRotationPoint(-0.75F, 5F, 8.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 17
		bodyModel[79].setRotationPoint(-2F, 5F, 8.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[80].setRotationPoint(-2F, 5.75F, 9.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 17
		bodyModel[81].setRotationPoint(-2F, 5.75F, 8.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, -0.225F, 0F, 0F, -0.225F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F); // Box 17
		bodyModel[82].setRotationPoint(-6.75F, 7F, 6.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
		bodyModel[83].setRotationPoint(-6.25F, 6F, 6.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[84].setRotationPoint(-2.25F, 5.88F, 9.62F);
		bodyModel[84].rotateAngleX = -0.78539816F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[85].setRotationPoint(-5.5F, 6.23F, 9.62F);
		bodyModel[85].rotateAngleX = -0.78539816F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 17
		bodyModel[86].setRotationPoint(-2F, 6.25F, 8.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, -0.75F, 0F, 0.25F, -0.75F); // Box 17
		bodyModel[87].setRotationPoint(-1.75F, 6.25F, 10.25F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.05F, 0F, -0.75F, 0.05F, 0F, -0.75F, 0.05F, 0.1F, 0F, 0.05F, 0.1F); // Box 17
		bodyModel[88].setRotationPoint(-6F, 5.25F, 8.25F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 17
		bodyModel[89].setRotationPoint(-6.75F, 5.25F, 6.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[90].setRotationPoint(-6.25F, 5.88F, 9.62F);
		bodyModel[90].rotateAngleX = -0.78539816F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Box 17
		bodyModel[91].setRotationPoint(-5.75F, 5.25F, 8.25F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -1F, 0F, 0.1F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, -1F, -0.75F, 0.1F); // Box 17
		bodyModel[92].setRotationPoint(-7F, 5.25F, 8.25F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 17
		bodyModel[93].setRotationPoint(-8.25F, 5.75F, 6.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[94].setRotationPoint(-8.25F, 5.25F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[95].setRotationPoint(-7.25F, 5.25F, 7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -1F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, -0.5F, 0F, -1F, -0.5F, 0F, -4.75F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, -0.5F, 0F, -4.75F, -0.5F); // Box 144
		bodyModel[96].setRotationPoint(-1.5F, 5.25F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 17
		bodyModel[97].setRotationPoint(-10.75F, 4.5F, 6.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 119
		bodyModel[98].setRotationPoint(-8.75F, 4.5F, -8.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -2F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[99].setRotationPoint(10.75F, 5.25F, -8.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 121
		bodyModel[100].setRotationPoint(8.75F, 5.25F, -8.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 122
		bodyModel[101].setRotationPoint(8.75F, 6F, -8.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 124
		bodyModel[102].setRotationPoint(6.25F, 6F, -8.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 125
		bodyModel[103].setRotationPoint(3.25F, 5.25F, -8.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -1F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 126
		bodyModel[104].setRotationPoint(-4.75F, 4.75F, -8.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -1F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 127
		bodyModel[105].setRotationPoint(3.25F, 4.75F, -8.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 128
		bodyModel[106].setRotationPoint(5.75F, 6F, -8.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 130
		bodyModel[107].setRotationPoint(8.75F, 6F, -8.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 133
		bodyModel[108].setRotationPoint(8.75F, 4.5F, -8.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 134
		bodyModel[109].setRotationPoint(7.25F, 5.75F, -8.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[110].setRotationPoint(6.75F, 5.25F, -8F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 138
		bodyModel[111].setRotationPoint(-12.75F, 5.25F, -8.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 139
		bodyModel[112].setRotationPoint(-10.75F, 5.25F, -8.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 140
		bodyModel[113].setRotationPoint(-5.25F, 5.25F, -8.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 141
		bodyModel[114].setRotationPoint(-6.75F, 6F, -8.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 143
		bodyModel[115].setRotationPoint(-9.25F, 6F, -8.75F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -0.75F, 0F); // Box 145
		bodyModel[116].setRotationPoint(-5.75F, 5.75F, -8.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 146
		bodyModel[117].setRotationPoint(-9.75F, 6F, -8.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, -0.8F, -0.5F, -0.25F, -0.8F); // Box 147
		bodyModel[118].setRotationPoint(1.75F, 4.75F, -8.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, -0.8F, -0.5F, -0.25F, -0.8F); // Box 148
		bodyModel[119].setRotationPoint(-3.25F, 4.75F, -8.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 149
		bodyModel[120].setRotationPoint(-3F, 4.5F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 150
		bodyModel[121].setRotationPoint(2F, 4.5F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[122].setRotationPoint(-5F, 8.25F, -8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 152
		bodyModel[123].setRotationPoint(3.25F, 7.25F, -8.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		bodyModel[124].setRotationPoint(-4.75F, 7.25F, -8.75F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 154
		bodyModel[125].setRotationPoint(3.75F, 7.75F, -8.75F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[126].setRotationPoint(5F, 8.25F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 157
		bodyModel[127].setRotationPoint(3.25F, 7.75F, -8.25F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 158
		bodyModel[128].setRotationPoint(-4.25F, 7.75F, -8.75F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 159
		bodyModel[129].setRotationPoint(-4.75F, 7.75F, -8.25F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 161
		bodyModel[130].setRotationPoint(5.25F, 6F, -8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 162
		bodyModel[131].setRotationPoint(-6F, 8.25F, -8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 165
		bodyModel[132].setRotationPoint(-6.25F, 6F, -8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, 0F, 0F, -1F, 0F); // Box 168
		bodyModel[133].setRotationPoint(3F, 5.5F, -8.75F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.75F, -0.75F, 0F); // Box 171
		bodyModel[134].setRotationPoint(-4F, 5.5F, -8.75F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -1F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 172
		bodyModel[135].setRotationPoint(0F, 5.25F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 173
		bodyModel[136].setRotationPoint(-1.5F, 7.75F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 174
		bodyModel[137].setRotationPoint(-0.5F, 7.75F, -10.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.04F, 0F, -0.5F, 0.04F, 0F, -0.5F, -0.54F, -0.5F, -0.5F, -0.54F); // Box 175
		bodyModel[138].setRotationPoint(1.25F, 7.75F, -8.99F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.04F, 0F, -0.5F, 0.04F, 0F, -0.5F, -0.54F, -0.5F, -0.5F, -0.54F); // Box 176
		bodyModel[139].setRotationPoint(-2.75F, 7.75F, -8.99F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0.06F, 0F, -0.25F, 0.06F, 0F, -0.25F, -0.56F, -0.5F, -0.25F, -0.56F); // Box 177
		bodyModel[140].setRotationPoint(-2.75F, 8.25F, -9.03F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 178
		bodyModel[141].setRotationPoint(-0.25F, 5.5F, -10.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 179
		bodyModel[142].setRotationPoint(-0.5F, 4.5F, -9.25F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 180
		bodyModel[143].setRotationPoint(-0.5F, 5F, -10.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
		bodyModel[144].setRotationPoint(0.5F, 5.25F, -9.25F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 182
		bodyModel[145].setRotationPoint(-1.5F, 5.25F, -9.25F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 183
		bodyModel[146].setRotationPoint(-0.75F, 5F, -9.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 184
		bodyModel[147].setRotationPoint(-2F, 5F, -9.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 185
		bodyModel[148].setRotationPoint(-2F, 5.75F, -10.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 186
		bodyModel[149].setRotationPoint(-2F, 5.75F, -9.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.225F, 0F, -0.5F, -0.225F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 187
		bodyModel[150].setRotationPoint(-6.75F, 7F, -8.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[151].setRotationPoint(-6.25F, 6F, -8.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 192
		bodyModel[152].setRotationPoint(-2F, 6.25F, -10.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, -0.75F, -1F, -0.75F, -0.75F, -1F, 0F, 0F, 0.25F, 0F); // Box 193
		bodyModel[153].setRotationPoint(-1.75F, 6.25F, -11.25F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0.1F, -0.75F, 0.05F, 0.1F, -0.75F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 194
		bodyModel[154].setRotationPoint(-6F, 5.25F, -10.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 195
		bodyModel[155].setRotationPoint(-6.75F, 5.25F, -8.75F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0.1F, -1F, 0F, 0.1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, -1F, -0.75F, 0.1F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 197
		bodyModel[156].setRotationPoint(-5.75F, 5.25F, -10.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 198
		bodyModel[157].setRotationPoint(-7F, 5.25F, -10.25F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 199
		bodyModel[158].setRotationPoint(-8.25F, 5.75F, -8.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 202
		bodyModel[159].setRotationPoint(-7.25F, 5.25F, -8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,0F, -1F, -0.5F, -0.5F, -1.25F, -0.5F, -0.5F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 203
		bodyModel[160].setRotationPoint(-1.5F, 5.25F, -10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 204
		bodyModel[161].setRotationPoint(-10.75F, 4.5F, -8.75F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[162].setRotationPoint(-2.25F, 5.88F, -9.62F);
		bodyModel[162].rotateAngleX = -0.78539816F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 17
		bodyModel[163].setRotationPoint(-5.5F, 6.23F, -9.62F);
		bodyModel[163].rotateAngleX = -0.78539816F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[164].setRotationPoint(-6.25F, 5.88F, -9.62F);
		bodyModel[164].rotateAngleX = -0.78539816F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F); // Box 17
		bodyModel[165].setRotationPoint(-10.25F, 5.75F, 6.75F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[166].setRotationPoint(11.25F, 5.75F, -4F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[167].setRotationPoint(-12.25F, 5.75F, -4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 208
		bodyModel[168].setRotationPoint(7.25F, 5.25F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209
		bodyModel[169].setRotationPoint(4.75F, 7.75F, -8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 210
		bodyModel[170].setRotationPoint(-6F, 7.75F, -8F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 211
		bodyModel[171].setRotationPoint(1.5F, 5.25F, -8.75F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 212
		bodyModel[172].setRotationPoint(-3.25F, 5.25F, -8.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 213
		bodyModel[173].setRotationPoint(-8.25F, 5.25F, -8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 214
		bodyModel[174].setRotationPoint(-10.25F, 5.75F, -8.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 215
		bodyModel[175].setRotationPoint(5.25F, 5.75F, -8.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 216
		bodyModel[176].setRotationPoint(8.75F, 5.75F, -8.75F);
	}
}