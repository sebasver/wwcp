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

public class Roadrailer53Dryvan extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Roadrailer53Dryvan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[120];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 66
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 68
		bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 68
		bodyModel[4] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 70
		bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 71
		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 72
		bodyModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 39
		bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 130
		bodyModel[9] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 131
		bodyModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 132
		bodyModel[11] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 136
		bodyModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 138
		bodyModel[13] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 145
		bodyModel[14] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 146
		bodyModel[15] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 147
		bodyModel[16] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 148
		bodyModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 149
		bodyModel[18] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 150
		bodyModel[19] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 151
		bodyModel[20] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 152
		bodyModel[21] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 153
		bodyModel[22] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 154
		bodyModel[23] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 157
		bodyModel[24] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 158
		bodyModel[25] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 159
		bodyModel[26] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 352
		bodyModel[27] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 161
		bodyModel[28] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 162
		bodyModel[29] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 163
		bodyModel[30] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 164
		bodyModel[31] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 165
		bodyModel[32] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 166
		bodyModel[33] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 167
		bodyModel[34] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 168
		bodyModel[35] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 169
		bodyModel[36] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 170
		bodyModel[37] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 171
		bodyModel[38] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 173
		bodyModel[39] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 174
		bodyModel[40] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 175
		bodyModel[41] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 178 bumper rotate
		bodyModel[42] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 179 bumper rotate
		bodyModel[43] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 180 bumper rotate
		bodyModel[44] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 314 door swing right
		bodyModel[45] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 182 door swing left
		bodyModel[46] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 184
		bodyModel[47] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 247 turnlight L
		bodyModel[48] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 186 taillight
		bodyModel[49] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 187 turnlight R
		bodyModel[50] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 188 taillight
		bodyModel[51] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 189
		bodyModel[52] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 190
		bodyModel[53] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 191
		bodyModel[54] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 193
		bodyModel[55] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 194
		bodyModel[56] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 200
		bodyModel[57] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 201
		bodyModel[58] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 209
		bodyModel[59] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 210
		bodyModel[60] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 211
		bodyModel[61] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 212
		bodyModel[62] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 213
		bodyModel[63] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 214
		bodyModel[64] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 215
		bodyModel[65] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 216
		bodyModel[66] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 217
		bodyModel[67] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 218
		bodyModel[68] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 219
		bodyModel[69] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 220
		bodyModel[70] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 221
		bodyModel[71] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 222
		bodyModel[72] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 223
		bodyModel[73] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 224
		bodyModel[74] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 225
		bodyModel[75] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 226
		bodyModel[76] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 227
		bodyModel[77] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 228
		bodyModel[78] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 229
		bodyModel[79] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 230
		bodyModel[80] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 231
		bodyModel[81] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 232
		bodyModel[82] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 233
		bodyModel[83] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 234
		bodyModel[84] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 235
		bodyModel[85] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 236
		bodyModel[86] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 237
		bodyModel[87] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 238
		bodyModel[88] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 239
		bodyModel[89] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 240
		bodyModel[90] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 241
		bodyModel[91] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 242
		bodyModel[92] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 243
		bodyModel[93] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 244
		bodyModel[94] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 245
		bodyModel[95] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 246
		bodyModel[96] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 247
		bodyModel[97] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 248
		bodyModel[98] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 249
		bodyModel[99] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 250
		bodyModel[100] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 251
		bodyModel[101] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 252
		bodyModel[102] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 253
		bodyModel[103] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 254
		bodyModel[104] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 255
		bodyModel[105] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 256
		bodyModel[106] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 257
		bodyModel[107] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 258
		bodyModel[108] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 259
		bodyModel[109] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 260
		bodyModel[110] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 261
		bodyModel[111] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 262
		bodyModel[112] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 131
		bodyModel[113] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 132
		bodyModel[114] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 133
		bodyModel[115] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 134
		bodyModel[116] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 135
		bodyModel[117] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 136
		bodyModel[118] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 137
		bodyModel[119] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 138

		bodyModel[0].addBox(0F, 0F, 0F, 110, 20, 1, 0F); // Box 31
		bodyModel[0].setRotationPoint(-54F, -19F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[1].setRotationPoint(16F, 3.5F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F); // Box 68
		bodyModel[2].setRotationPoint(16F, 6F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		bodyModel[3].setRotationPoint(16F, 1F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F); // Box 70
		bodyModel[4].setRotationPoint(21F, 6F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 71
		bodyModel[5].setRotationPoint(21F, 1F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 72
		bodyModel[6].setRotationPoint(21F, 3.5F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 39
		bodyModel[7].setRotationPoint(19F, 4F, -7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 130
		bodyModel[8].setRotationPoint(18.5F, 1F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[9].setRotationPoint(18.5F, 6F, -8F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 132
		bodyModel[10].setRotationPoint(18.5F, 3.5F, -7F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 136
		bodyModel[11].setRotationPoint(18.5F, 1F, -5.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 138
		bodyModel[12].setRotationPoint(30F, 4F, -7.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 110, 20, 1, 0F); // Box 145
		bodyModel[13].setRotationPoint(-54F, -19F, 9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 20, 18, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 146
		bodyModel[14].setRotationPoint(-55F, -19F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 110, 1, 18, 0F); // Box 147
		bodyModel[15].setRotationPoint(-54F, 0F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 110, 1, 18, 0F); // Box 148
		bodyModel[16].setRotationPoint(-54F, -19F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 105, 1, 1, 0F); // Box 149
		bodyModel[17].setRotationPoint(-51F, 1F, -3F);

		bodyModel[18].addBox(0F, 0F, 0F, 105, 1, 1, 0F); // Box 150
		bodyModel[18].setRotationPoint(-51F, 1F, 2F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 151
		bodyModel[19].setRotationPoint(-51F, 1F, -2F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 152
		bodyModel[20].setRotationPoint(52F, 1F, -2F);

		bodyModel[21].addBox(0F, 0F, 0F, 6, 5, 2, 0F); // Box 153
		bodyModel[21].setRotationPoint(17F, 2F, -3F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 5, 2, 0F); // Box 154
		bodyModel[22].setRotationPoint(17F, 2F, 1F);

		bodyModel[23].addBox(0F, 0F, 0F, 6, 5, 2, 0F); // Box 157
		bodyModel[23].setRotationPoint(28F, 2F, 1F);

		bodyModel[24].addBox(0F, 0F, 0F, 6, 5, 2, 0F); // Box 158
		bodyModel[24].setRotationPoint(28F, 2F, -3F);

		bodyModel[25].addBox(0F, 0F, 0F, 17, 1, 4, 0F); // Box 159
		bodyModel[25].setRotationPoint(17F, 1F, -2F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 352
		bodyModel[26].setRotationPoint(-44F, 0.5F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 161
		bodyModel[27].setRotationPoint(-34F, 2F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 162
		bodyModel[28].setRotationPoint(-34F, 2F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 163
		bodyModel[29].setRotationPoint(-27F, 2F, 4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 164
		bodyModel[30].setRotationPoint(-27F, 2F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[31].setRotationPoint(-31F, 5F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[32].setRotationPoint(-31F, 5F, 4F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 167
		bodyModel[33].setRotationPoint(-31F, 5F, -4F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 168
		bodyModel[34].setRotationPoint(-30.5F, 4.5F, -4.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 169
		bodyModel[35].setRotationPoint(-30.5F, 4.5F, 3.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 170
		bodyModel[36].setRotationPoint(-30.5F, 8F, -4.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 171
		bodyModel[37].setRotationPoint(-30.5F, 8F, 3.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 173
		bodyModel[38].setRotationPoint(-31.5F, 3F, 4.25F);

		bodyModel[39].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 174
		bodyModel[39].setRotationPoint(-34F, 1F, -5F);

		bodyModel[40].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 175
		bodyModel[40].setRotationPoint(-34F, 1F, 3F);

		bodyModel[41].addBox(-1F, 3F, 0F, 1, 1, 16, 0F); // Box 178 bumper rotate
		bodyModel[41].setRotationPoint(56F, 1F, -8F);
		bodyModel[41].rotateAngleZ = 3.14159265F;

		bodyModel[42].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 179 bumper rotate
		bodyModel[42].setRotationPoint(56F, 1F, -3F);
		bodyModel[42].rotateAngleZ = 3.14159265F;

		bodyModel[43].addBox(-1F, 0F, 0F, 1, 3, 1, 0F); // Box 180 bumper rotate
		bodyModel[43].setRotationPoint(56F, 1F, 2F);
		bodyModel[43].rotateAngleZ = 3.14159265F;

		bodyModel[44].addBox(-0.5F, 0F, -9F, 1, 18, 9, 0F); // Box 314 door swing right
		bodyModel[44].setRotationPoint(55.5F, -18F, 9F);

		bodyModel[45].addBox(-0.5F, 0F, 0F, 1, 18, 9, 0F); // Box 182 door swing left
		bodyModel[45].setRotationPoint(55.5F, -18F, -9F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 184
		bodyModel[46].setRotationPoint(53F, 1F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 turnlight L
		bodyModel[47].setRotationPoint(54.5F, 1F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 186 taillight
		bodyModel[48].setRotationPoint(54.5F, 1F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 187 turnlight R
		bodyModel[49].setRotationPoint(54.5F, 1F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 188 taillight
		bodyModel[50].setRotationPoint(54.5F, 1F, 5F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 189
		bodyModel[51].setRotationPoint(36F, 1F, -2F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 190
		bodyModel[52].setRotationPoint(36F, 1F, 3F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 191
		bodyModel[53].setRotationPoint(36F, 1F, -9F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 4, 5, 0F); // Box 193
		bodyModel[54].setRotationPoint(36F, 2F, -9F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 4, 5, 0F); // Box 194
		bodyModel[55].setRotationPoint(36F, 2F, 4F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 200
		bodyModel[56].setRotationPoint(-31F, 2F, -4.75F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 201
		bodyModel[57].setRotationPoint(-31F, 2F, 2.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 209
		bodyModel[58].setRotationPoint(16F, 1F, -5.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[59].setRotationPoint(16F, 3.5F, -5.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F); // Box 211
		bodyModel[60].setRotationPoint(16F, 6F, -5.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F); // Box 212
		bodyModel[61].setRotationPoint(21F, 6F, -5.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 213
		bodyModel[62].setRotationPoint(21F, 3.5F, -5.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 214
		bodyModel[63].setRotationPoint(21F, 1F, -5.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 215
		bodyModel[64].setRotationPoint(29.5F, 1F, -5.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 216
		bodyModel[65].setRotationPoint(32F, 1F, -5.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 217
		bodyModel[66].setRotationPoint(27F, 1F, -5.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[67].setRotationPoint(27F, 3.5F, -5.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F); // Box 219
		bodyModel[68].setRotationPoint(27F, 6F, -5.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 220
		bodyModel[69].setRotationPoint(32F, 3.5F, -5.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F); // Box 221
		bodyModel[70].setRotationPoint(32F, 6F, -5.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F); // Box 222
		bodyModel[71].setRotationPoint(27F, 6F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[72].setRotationPoint(29.5F, 6F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F); // Box 224
		bodyModel[73].setRotationPoint(32F, 6F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 225
		bodyModel[74].setRotationPoint(32F, 3.5F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 226
		bodyModel[75].setRotationPoint(32F, 1F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[76].setRotationPoint(29.5F, 1F, -8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[77].setRotationPoint(27F, 1F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[78].setRotationPoint(27F, 3.5F, -8F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 230
		bodyModel[79].setRotationPoint(29.5F, 3.5F, -7F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 231
		bodyModel[80].setRotationPoint(29.5F, 1F, 3.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 232
		bodyModel[81].setRotationPoint(32F, 1F, 3.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233
		bodyModel[82].setRotationPoint(27F, 1F, 3.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[83].setRotationPoint(27F, 3.5F, 3.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F); // Box 235
		bodyModel[84].setRotationPoint(27F, 6F, 3.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 236
		bodyModel[85].setRotationPoint(32F, 3.5F, 3.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F); // Box 237
		bodyModel[86].setRotationPoint(32F, 6F, 3.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F); // Box 238
		bodyModel[87].setRotationPoint(27F, 6F, 6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[88].setRotationPoint(29.5F, 6F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F); // Box 240
		bodyModel[89].setRotationPoint(32F, 6F, 6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 241
		bodyModel[90].setRotationPoint(32F, 3.5F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 242
		bodyModel[91].setRotationPoint(32F, 1F, 6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 243
		bodyModel[92].setRotationPoint(29.5F, 1F, 6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 244
		bodyModel[93].setRotationPoint(27F, 1F, 6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[94].setRotationPoint(27F, 3.5F, 6F);

		bodyModel[95].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 246
		bodyModel[95].setRotationPoint(29.5F, 3.5F, 6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 247
		bodyModel[96].setRotationPoint(21F, 1F, 3.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 248
		bodyModel[97].setRotationPoint(21F, 3.5F, 3.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F); // Box 249
		bodyModel[98].setRotationPoint(21F, 6F, 3.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 3, 8, 2, 0F); // Box 250
		bodyModel[99].setRotationPoint(18.5F, 1F, 3.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F); // Box 251
		bodyModel[100].setRotationPoint(16F, 6F, 3.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[101].setRotationPoint(16F, 3.5F, 3.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 253
		bodyModel[102].setRotationPoint(16F, 1F, 3.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 254
		bodyModel[103].setRotationPoint(16F, 1F, 6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[104].setRotationPoint(16F, 3.5F, 6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F); // Box 256
		bodyModel[105].setRotationPoint(16F, 6F, 6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F); // Box 257
		bodyModel[106].setRotationPoint(21F, 6F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 258
		bodyModel[107].setRotationPoint(21F, 3.5F, 6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-0.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 259
		bodyModel[108].setRotationPoint(21F, 1F, 6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[109].setRotationPoint(18.5F, 1F, 6F);

		bodyModel[110].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 261
		bodyModel[110].setRotationPoint(18.5F, 3.5F, 6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[111].setRotationPoint(18.5F, 6F, 6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.95F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 131
		bodyModel[112].setRotationPoint(-31.5F, 3F, -5.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[113].setRotationPoint(53F, 1F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 133
		bodyModel[114].setRotationPoint(53F, 1F, 9F);

		bodyModel[115].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 134
		bodyModel[115].setRotationPoint(53F, 3F, -4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[116].setRotationPoint(53F, 3F, -6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 136
		bodyModel[117].setRotationPoint(53F, 3F, 4F);

		bodyModel[118].addBox(0F, 0F, 0F, 6, 1, 4, 0F); // Box 137
		bodyModel[118].setRotationPoint(-57F, 1F, -2F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 138
		bodyModel[119].setRotationPoint(-58F, 1F, -2F);
	}
}