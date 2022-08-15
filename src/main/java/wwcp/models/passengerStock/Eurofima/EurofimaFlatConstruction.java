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

public class EurofimaFlatConstruction extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public EurofimaFlatConstruction() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[96];

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
		bodyModel[8] = new ModelRendererTurbo(this, 193, 2, textureX, textureY); // Box 32
		bodyModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 33
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		bodyModel[11] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 38
		bodyModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 36
		bodyModel[13] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 37
		bodyModel[14] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 38
		bodyModel[15] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 40
		bodyModel[16] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 120
		bodyModel[17] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 121
		bodyModel[18] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 122
		bodyModel[19] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 125
		bodyModel[20] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 135
		bodyModel[21] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 136
		bodyModel[22] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 138
		bodyModel[23] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 139
		bodyModel[24] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 140
		bodyModel[25] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 141
		bodyModel[26] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 150
		bodyModel[27] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 175
		bodyModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 176
		bodyModel[29] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 177
		bodyModel[30] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 178
		bodyModel[31] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 179
		bodyModel[32] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 180
		bodyModel[33] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 182
		bodyModel[34] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 183
		bodyModel[35] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 184
		bodyModel[36] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 185
		bodyModel[37] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 188
		bodyModel[38] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 189
		bodyModel[39] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 190
		bodyModel[40] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 191
		bodyModel[41] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 192
		bodyModel[42] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 193
		bodyModel[43] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 210
		bodyModel[44] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 211
		bodyModel[45] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 212
		bodyModel[46] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 213
		bodyModel[47] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 214
		bodyModel[48] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 216
		bodyModel[49] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 217
		bodyModel[50] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 218
		bodyModel[51] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 223
		bodyModel[52] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 224
		bodyModel[53] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 225
		bodyModel[54] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 226
		bodyModel[55] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 227
		bodyModel[56] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 228
		bodyModel[57] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 229
		bodyModel[58] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 230
		bodyModel[59] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 231
		bodyModel[60] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 240
		bodyModel[61] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Box 241
		bodyModel[62] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 167
		bodyModel[63] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 243
		bodyModel[64] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 244
		bodyModel[65] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 247
		bodyModel[66] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 248
		bodyModel[67] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 250
		bodyModel[68] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 251
		bodyModel[69] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 252
		bodyModel[70] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 253
		bodyModel[71] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 254
		bodyModel[72] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 255
		bodyModel[73] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 256
		bodyModel[74] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 263
		bodyModel[75] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 264
		bodyModel[76] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 265
		bodyModel[77] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 266
		bodyModel[78] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 267
		bodyModel[79] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 268
		bodyModel[80] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 269
		bodyModel[81] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 270
		bodyModel[82] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 271
		bodyModel[83] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 272
		bodyModel[84] = new ModelRendererTurbo(this, 484, 370, textureX, textureY); // Box 333
		bodyModel[85] = new ModelRendererTurbo(this, 448, 370, textureX, textureY); // Box 334
		bodyModel[86] = new ModelRendererTurbo(this, 457, 370, textureX, textureY); // Back right step
		bodyModel[87] = new ModelRendererTurbo(this, 484, 379, textureX, textureY); // Box 336
		bodyModel[88] = new ModelRendererTurbo(this, 448, 379, textureX, textureY); // Box 337
		bodyModel[89] = new ModelRendererTurbo(this, 457, 379, textureX, textureY); // Back left step
		bodyModel[90] = new ModelRendererTurbo(this, 457, 395, textureX, textureY); // Front Right Step
		bodyModel[91] = new ModelRendererTurbo(this, 484, 395, textureX, textureY); // Box 340
		bodyModel[92] = new ModelRendererTurbo(this, 448, 395, textureX, textureY); // Box 341
		bodyModel[93] = new ModelRendererTurbo(this, 448, 387, textureX, textureY); // Box 342
		bodyModel[94] = new ModelRendererTurbo(this, 457, 387, textureX, textureY); // Front left Step
		bodyModel[95] = new ModelRendererTurbo(this, 484, 387, textureX, textureY); // Box 344

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

		bodyModel[8].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 32
		bodyModel[8].setRotationPoint(89.5F, 4F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 33
		bodyModel[9].setRotationPoint(88.5F, 4F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 34
		bodyModel[10].setRotationPoint(97.5F, 4F, -10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[11].setRotationPoint(97.5F, 1F, -10.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 3, 19, 0F); // Box 36
		bodyModel[12].setRotationPoint(97.5F, 1F, -9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[13].setRotationPoint(97.5F, 1F, 9.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 38
		bodyModel[14].setRotationPoint(97.5F, 0F, -9.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 40
		bodyModel[15].setRotationPoint(97.5F, 0F, 5.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[16].setRotationPoint(83.5F, 2F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F); // Box 121
		bodyModel[17].setRotationPoint(81.5F, 2F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F); // Box 122
		bodyModel[18].setRotationPoint(89.5F, 4F, 10F);

		bodyModel[19].addBox(0F, 0F, 0F, 8, 4, 13, 0F); // Box 125
		bodyModel[19].setRotationPoint(89.5F, 0F, -6.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 178, 1, 20, 0F); // Box 135
		bodyModel[20].setRotationPoint(-89.5F, 0F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[21].setRotationPoint(89.5F, 0F, -10.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 138
		bodyModel[22].setRotationPoint(88.5F, 0F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 139
		bodyModel[23].setRotationPoint(89.5F, 4F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 140
		bodyModel[24].setRotationPoint(96.5F, 0F, -10.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[25].setRotationPoint(90F, 2F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 165, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 150
		bodyModel[26].setRotationPoint(-83F, 2F, 10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 175
		bodyModel[27].setRotationPoint(-102F, 1F, -8F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 176
		bodyModel[28].setRotationPoint(-103F, 1.5F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 177
		bodyModel[29].setRotationPoint(-103.5F, 0.5F, -8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 178
		bodyModel[30].setRotationPoint(-103.5F, 0.5F, -5.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 179
		bodyModel[31].setRotationPoint(-100.5F, 1F, -10.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 180
		bodyModel[32].setRotationPoint(-99.5F, 4F, -10.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 182
		bodyModel[33].setRotationPoint(-98.5F, 4F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 183
		bodyModel[34].setRotationPoint(-90.5F, 4F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[35].setRotationPoint(-90.5F, 2F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[36].setRotationPoint(-84.5F, 2F, -11F);

		bodyModel[37].addBox(0F, 0F, 0F, 8, 4, 13, 0F); // Box 188
		bodyModel[37].setRotationPoint(-98.5F, 0F, -6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[38].setRotationPoint(-98F, 2F, 6.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 190
		bodyModel[39].setRotationPoint(-90.5F, 0F, -10F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 3, 19, 0F); // Box 191
		bodyModel[40].setRotationPoint(-99.5F, 1F, -9.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.05F, 0F, 0F, -1.05F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.05F, 0F, 0F, -1.05F); // Box 192
		bodyModel[41].setRotationPoint(-98.5F, 0F, 6.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.55F, -0.5F, 0F, -0.55F); // Box 193
		bodyModel[42].setRotationPoint(-91.5F, 0F, 6.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 210
		bodyModel[43].setRotationPoint(-102F, 1F, 6F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 211
		bodyModel[44].setRotationPoint(-103F, 1.5F, 6.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 212
		bodyModel[45].setRotationPoint(-103.5F, 0.5F, 5.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 213
		bodyModel[46].setRotationPoint(-103.5F, 0.5F, 4.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 214
		bodyModel[47].setRotationPoint(-100.5F, 1F, 9.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F); // Box 216
		bodyModel[48].setRotationPoint(-98.5F, 4F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[49].setRotationPoint(-90.5F, 2F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[50].setRotationPoint(-84.5F, 2F, 10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 223
		bodyModel[51].setRotationPoint(-98.5F, 4F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[52].setRotationPoint(-98F, 2F, -8.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, -1.05F, -0.5F, 0F, -1.05F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -0.5F, 0F, -1.05F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[53].setRotationPoint(-98.5F, 0F, -10.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 226
		bodyModel[54].setRotationPoint(-91.5F, 0F, -10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.55F, 0F, 0F, -0.55F); // Box 227
		bodyModel[55].setRotationPoint(89.5F, 0F, 6.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -0.5F, 0F, -1.05F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.05F, -0.5F, 0F, -1.05F); // Box 228
		bodyModel[56].setRotationPoint(96.5F, 0F, 6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[57].setRotationPoint(90F, 2F, 6.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[58].setRotationPoint(83.5F, 2F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F); // Box 231
		bodyModel[59].setRotationPoint(81.5F, 2F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 165, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 240
		bodyModel[60].setRotationPoint(-83F, 2F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[61].setRotationPoint(70F, 1F, -1F);

		bodyModel[62].addBox(0F, 0F, 0F, 118, 5, 20, 0F); // Box 167
		bodyModel[62].setRotationPoint(-59.5F, 1F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 243
		bodyModel[63].setRotationPoint(-59.5F, 2F, 10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 244
		bodyModel[64].setRotationPoint(-59.5F, 4F, 10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[65].setRotationPoint(58.5F, 1F, 9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[66].setRotationPoint(60.5F, 1F, 9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[67].setRotationPoint(58.5F, 1F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[68].setRotationPoint(60.5F, 1F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[69].setRotationPoint(-61.5F, 1F, 9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F); // Box 253
		bodyModel[70].setRotationPoint(-63.5F, 1F, 9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[71].setRotationPoint(-61.5F, 1F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F); // Box 255
		bodyModel[72].setRotationPoint(-63.5F, 1F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[73].setRotationPoint(-77F, 1F, -3F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 263
		bodyModel[74].setRotationPoint(-41.5F, 4F, 10F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 264
		bodyModel[75].setRotationPoint(-41.5F, 2F, 10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 265
		bodyModel[76].setRotationPoint(40.5F, 4F, 10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 266
		bodyModel[77].setRotationPoint(40.5F, 2F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[78].setRotationPoint(-59.5F, 4F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[79].setRotationPoint(-39.5F, 4F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 80, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[80].setRotationPoint(-39.5F, 2F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 18, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[81].setRotationPoint(-59.5F, 2F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[82].setRotationPoint(49.5F, 4F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[83].setRotationPoint(49.5F, 2F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F); // Box 333
		bodyModel[84].setRotationPoint(88.75F, 4F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.05F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, 0.05F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.15F, -0.5F, -0.2F); // Box 334
		bodyModel[85].setRotationPoint(97.25F, 4F, 7.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,-0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F); // Back right step
		bodyModel[86].setRotationPoint(89.5F, 6.25F, 7.2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.45F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.45F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 336
		bodyModel[87].setRotationPoint(88.75F, 4F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.15F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.15F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F); // Box 337
		bodyModel[88].setRotationPoint(97.25F, 4F, -10.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,-0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F); // Back left step
		bodyModel[89].setRotationPoint(89.5F, 6.25F, -12.2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,-0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F); // Front Right Step
		bodyModel[90].setRotationPoint(-98.5F, 6.25F, 7.2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F); // Box 340
		bodyModel[91].setRotationPoint(-90.75F, 4F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F, -0.15F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 341
		bodyModel[92].setRotationPoint(-99.25F, 4F, 7.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, 0.05F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.5F, -0.2F, -0.15F, -0.5F, -0.2F, 0.05F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 342
		bodyModel[93].setRotationPoint(-99.25F, 4F, -10.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,-0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, 0F, -1F, -0.3F, 0F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F, -0.05F, -0.8F, -1F, -0.3F, -0.8F, -0.5F); // Front left Step
		bodyModel[94].setRotationPoint(-98.5F, 6.25F, -12.2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.05F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0.05F, -0.5F, -0.2F, -0.45F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 344
		bodyModel[95].setRotationPoint(-90.75F, 4F, -11F);
	}
}