//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.10.2020 - 00:08:31
// Last changed on: 20.10.2020 - 00:08:31

package wwcp.models.freight; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class GSC_60_Flatcar extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public GSC_60_Flatcar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[153];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 28
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 144
		bodyModel[5] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 377, 43, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 41, 51, textureX, textureY); // Box 154
		bodyModel[15] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 155
		bodyModel[16] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 156
		bodyModel[17] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 157
		bodyModel[18] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 158
		bodyModel[19] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 159
		bodyModel[20] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 160
		bodyModel[21] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 272, 25, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 72, 57, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 0
		bodyModel[57] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 0
		bodyModel[58] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 0
		bodyModel[60] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 0
		bodyModel[61] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 0
		bodyModel[63] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 0
		bodyModel[64] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 0
		bodyModel[65] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 0
		bodyModel[67] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 0
		bodyModel[68] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 0
		bodyModel[69] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 0
		bodyModel[70] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 0
		bodyModel[71] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 0
		bodyModel[72] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 230
		bodyModel[74] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 231
		bodyModel[75] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 232
		bodyModel[76] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 233
		bodyModel[77] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 234
		bodyModel[78] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 235
		bodyModel[79] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 236
		bodyModel[80] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 237
		bodyModel[81] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 238
		bodyModel[82] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 239
		bodyModel[83] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 240
		bodyModel[84] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 241
		bodyModel[85] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 242
		bodyModel[86] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 243
		bodyModel[87] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 244
		bodyModel[88] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 245
		bodyModel[89] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 246
		bodyModel[90] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 247
		bodyModel[91] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 262
		bodyModel[100] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 265
		bodyModel[101] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 266
		bodyModel[102] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 267
		bodyModel[103] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 268
		bodyModel[104] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 269
		bodyModel[105] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 270
		bodyModel[106] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 271
		bodyModel[107] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 280
		bodyModel[110] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 283
		bodyModel[111] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Number layer part
		bodyModel[118] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Number layer part
		bodyModel[119] = new ModelRendererTurbo(this, 476, 33, textureX, textureY); // Number layer part
		bodyModel[120] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Number layer part
		bodyModel[121] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 144
		bodyModel[122] = new ModelRendererTurbo(this, 273, 100, textureX, textureY); // Box 144
		bodyModel[123] = new ModelRendererTurbo(this, 62, 97, textureX, textureY); // Box 144
		bodyModel[124] = new ModelRendererTurbo(this, 1, 175, textureX, textureY); // Box 298
		bodyModel[125] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 299
		bodyModel[126] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 302
		bodyModel[127] = new ModelRendererTurbo(this, 375, 122, textureX, textureY); // Box 303
		bodyModel[128] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Number layer part
		bodyModel[129] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Number layer part
		bodyModel[130] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Number layer part
		bodyModel[131] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Number layer part
		bodyModel[132] = new ModelRendererTurbo(this, 1, 157, textureX, textureY); // Box 298
		bodyModel[133] = new ModelRendererTurbo(this, 1, 166, textureX, textureY); // Box 168
		bodyModel[134] = new ModelRendererTurbo(this, 1, 148, textureX, textureY); // Box 169
		bodyModel[135] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 267
		bodyModel[136] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 266
		bodyModel[137] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 265
		bodyModel[138] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 264
		bodyModel[139] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 263
		bodyModel[140] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 123
		bodyModel[141] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 122
		bodyModel[142] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 120
		bodyModel[143] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 119
		bodyModel[144] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 264
		bodyModel[145] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 263
		bodyModel[146] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 263
		bodyModel[147] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 120
		bodyModel[148] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 120
		bodyModel[149] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 264
		bodyModel[150] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 264
		bodyModel[152] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-64.5F, 2.1F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 28
		bodyModel[1].setRotationPoint(52.75F, 2.6F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 28
		bodyModel[2].setRotationPoint(-55.75F, 2.6F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 129, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-64.5F, 2.6F, -11F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 129, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[4].setRotationPoint(-64.5F, 2.6F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-64.5F, 2.6F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(63.5F, 2.6F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-25.5F, 4.6F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(-35.5F, 4.6F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-47F, 4.6F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-35.5F, 5.6F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(25.5F, 4.6F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(35F, 4.6F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[13].setRotationPoint(25.5F, 5.6F, -11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 51, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 154
		bodyModel[14].setRotationPoint(-25.5F, 4.6F, 10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[15].setRotationPoint(-35.5F, 4.6F, 10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 156
		bodyModel[16].setRotationPoint(-47F, 4.6F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 157
		bodyModel[17].setRotationPoint(-35.5F, 5.6F, 10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[18].setRotationPoint(25.5F, 4.6F, 10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F); // Box 159
		bodyModel[19].setRotationPoint(35F, 4.6F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 160
		bodyModel[20].setRotationPoint(25.5F, 5.6F, 10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-3F, 2.1F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.3F, -0.5F, 0F, 1.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[22].setRotationPoint(4F, 2.1F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[23].setRotationPoint(11.3F, 2.1F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[24].setRotationPoint(18.1F, 2.1F, -12F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[25].setRotationPoint(24.9F, 2.1F, -12F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[26].setRotationPoint(31.7F, 2.1F, -12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[27].setRotationPoint(38.5F, 2.1F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.2F, -0.5F, 0F, 2.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[28].setRotationPoint(45.3F, 2.1F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[29].setRotationPoint(53.5F, 2.1F, -12F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 22, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[30].setRotationPoint(59F, 2.1F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[31].setRotationPoint(3F, 2.1F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[32].setRotationPoint(10.3F, 2.1F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[33].setRotationPoint(17.1F, 2.1F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[34].setRotationPoint(23.9F, 2.1F, -11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[35].setRotationPoint(30.7F, 2.1F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[36].setRotationPoint(37.5F, 2.1F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[37].setRotationPoint(44.3F, 2.1F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[38].setRotationPoint(52.5F, 2.1F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[39].setRotationPoint(-59F, 2.1F, -12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[40].setRotationPoint(-53.5F, 2.1F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2.2F, -0.5F, 0F, 2.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[41].setRotationPoint(-52.5F, 2.1F, -12F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[42].setRotationPoint(-4F, 2.1F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.3F, -0.5F, 0F, 1.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[43].setRotationPoint(-10.3F, 2.1F, -12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[44].setRotationPoint(-11.3F, 2.1F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[45].setRotationPoint(-17.1F, 2.1F, -12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[46].setRotationPoint(-18.1F, 2.1F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[47].setRotationPoint(-23.9F, 2.1F, -12F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[48].setRotationPoint(-24.9F, 2.1F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[49].setRotationPoint(-30.7F, 2.1F, -12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[50].setRotationPoint(-31.7F, 2.1F, -11F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[51].setRotationPoint(-37.5F, 2.1F, -12F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[52].setRotationPoint(-38.5F, 2.1F, -11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 24, 0F,0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[53].setRotationPoint(-44.3F, 2.1F, -12F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[54].setRotationPoint(-45.3F, 2.1F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[55].setRotationPoint(3F, 2.6F, -12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[56].setRotationPoint(10.3F, 2.6F, -12F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[57].setRotationPoint(17.1F, 2.6F, -12F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[58].setRotationPoint(23.9F, 2.6F, -12F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[59].setRotationPoint(30.7F, 2.6F, -12F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[60].setRotationPoint(37.5F, 2.6F, -12F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[61].setRotationPoint(44.3F, 2.6F, -12F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[62].setRotationPoint(52.5F, 2.6F, -12F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[63].setRotationPoint(-53.5F, 2.6F, -12F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[64].setRotationPoint(-4F, 2.6F, -12F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[65].setRotationPoint(-11.3F, 2.6F, -12F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[66].setRotationPoint(-18.1F, 2.6F, -12F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[67].setRotationPoint(-24.9F, 2.6F, -12F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[68].setRotationPoint(-31.7F, 2.6F, -12F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[69].setRotationPoint(-38.5F, 2.6F, -12F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[70].setRotationPoint(-45.3F, 2.6F, -12F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[71].setRotationPoint(-60F, 2.6F, -12F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[72].setRotationPoint(59F, 2.6F, -12F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[73].setRotationPoint(3F, 2.6F, 11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[74].setRotationPoint(10.3F, 2.6F, 11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[75].setRotationPoint(17.1F, 2.6F, 11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[76].setRotationPoint(23.9F, 2.6F, 11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[77].setRotationPoint(30.7F, 2.6F, 11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[78].setRotationPoint(37.5F, 2.6F, 11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[79].setRotationPoint(44.3F, 2.6F, 11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[80].setRotationPoint(52.5F, 2.6F, 11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[81].setRotationPoint(-53.5F, 2.6F, 11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[82].setRotationPoint(-4F, 2.6F, 11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[83].setRotationPoint(-11.3F, 2.6F, 11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[84].setRotationPoint(-18.1F, 2.6F, 11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[85].setRotationPoint(-24.9F, 2.6F, 11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[86].setRotationPoint(-31.7F, 2.6F, 11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[87].setRotationPoint(-38.5F, 2.6F, 11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[88].setRotationPoint(-45.3F, 2.6F, 11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[89].setRotationPoint(-60F, 2.6F, 11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[90].setRotationPoint(59F, 2.6F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[91].setRotationPoint(60.5F, 2.6F, -11.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[92].setRotationPoint(-64F, 2.6F, -11.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[93].setRotationPoint(60.75F, 3.6F, -11.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[94].setRotationPoint(63.25F, 3.6F, -11.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[95].setRotationPoint(60.75F, 5.6F, -11.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[96].setRotationPoint(-63.75F, 3.6F, -11.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[97].setRotationPoint(-61.25F, 3.6F, -11.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[98].setRotationPoint(-63.75F, 5.6F, -11.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 262
		bodyModel[99].setRotationPoint(60.5F, 2.6F, 10.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 265
		bodyModel[100].setRotationPoint(-64F, 2.6F, 10.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[101].setRotationPoint(60.75F, 3.6F, 10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[102].setRotationPoint(63.25F, 3.6F, 10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 268
		bodyModel[103].setRotationPoint(60.75F, 5.6F, 10.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[104].setRotationPoint(-63.75F, 3.6F, 10.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[105].setRotationPoint(-61.25F, 3.6F, 10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 271
		bodyModel[106].setRotationPoint(-63.75F, 5.6F, 10.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[107].setRotationPoint(64.5F, 2.6F, -8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[108].setRotationPoint(-65F, 2.6F, -8.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 280
		bodyModel[109].setRotationPoint(64.5F, 2.6F, 3.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 283
		bodyModel[110].setRotationPoint(-65F, 2.6F, 3.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[111].setRotationPoint(64.5F, 3.6F, -3.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[112].setRotationPoint(63.5F, 4.6F, -3.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[113].setRotationPoint(64.5F, 2.6F, -3.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[114].setRotationPoint(64.75F, 3.1F, -3.25F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 0
		bodyModel[115].setRotationPoint(64.75F, -0.65F, -3.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 0, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[116].setRotationPoint(63.25F, -0.66F, -4.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 105, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Number layer part
		bodyModel[117].setRotationPoint(-52.5F, 2.6F, 11.02F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 51, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Number layer part
		bodyModel[118].setRotationPoint(-25.5F, 4.6F, 11.02F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 17, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Number layer part
		bodyModel[119].setRotationPoint(-42.5F, 4.6F, 11.02F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 17, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Number layer part
		bodyModel[120].setRotationPoint(25.5F, 4.6F, 11.02F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 188, 8, 0, 0F,0F, 0F, 0F, -137F, 0F, 0F, -137F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -137F, -6.5F, 0F, -137F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 144
		bodyModel[121].setRotationPoint(-25.5F, 4.6F, 11.01F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 68, 4, 0, 0F,0F, 0F, 0F, -51F, 0F, 0F, -51F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -51F, -3F, 0F, -51F, -3F, 0F, 0F, -3F, 0F); // Box 144
		bodyModel[122].setRotationPoint(-42.5F, 4.6F, 11.01F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 68, 4, 0, 0F,0F, 0F, 0F, -51F, 0F, 0F, -51F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -51F, -3F, 0F, -51F, -3F, 0F, 0F, -3F, 0F); // Box 144
		bodyModel[123].setRotationPoint(25.5F, 4.6F, 11.01F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 212, 8, 0, 0F,0F, 0F, 0F, -159F, 0F, 0F, -159F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -159F, -6F, 0F, -159F, -6F, 0F, 0F, -6F, 0F); // Box 298
		bodyModel[124].setRotationPoint(-52.5F, 2.6F, -11.01F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 188, 8, 0, 0F,0F, 0F, 0F, -137F, 0F, 0F, -137F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -137F, -6.5F, 0F, -137F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 299
		bodyModel[125].setRotationPoint(-25.5F, 4.6F, -11.01F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 68, 4, 0, 0F,0F, 0F, 0F, -51F, 0F, 0F, -51F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -51F, -3F, 0F, -51F, -3F, 0F, 0F, -3F, 0F); // Box 302
		bodyModel[126].setRotationPoint(-42.5F, 4.6F, -11.01F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 68, 4, 0, 0F,0F, 0F, 0F, -51F, 0F, 0F, -51F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -51F, -3F, 0F, -51F, -3F, 0F, 0F, -3F, 0F); // Box 303
		bodyModel[127].setRotationPoint(25.5F, 4.6F, -11.01F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 105, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Number layer part
		bodyModel[128].setRotationPoint(-52.5F, 2.6F, -11.02F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 51, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Number layer part
		bodyModel[129].setRotationPoint(-25.5F, 4.6F, -11.02F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 17, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Number layer part
		bodyModel[130].setRotationPoint(-42.5F, 4.6F, -11.02F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 17, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Number layer part
		bodyModel[131].setRotationPoint(25.5F, 4.6F, -11.02F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 208, 8, 0, 0F,0F, 0F, 0F, -156F, 0F, 0F, -156F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -156F, -6F, 0F, -156F, -6F, 0F, 0F, -6F, 0F); // Box 298
		bodyModel[132].setRotationPoint(0.5F, 2.6F, -11.01F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 212, 8, 0, 0F,0F, 0F, 0F, -159F, 0F, 0F, -159F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -159F, -6F, 0F, -159F, -6F, 0F, 0F, -6F, 0F); // Box 168
		bodyModel[133].setRotationPoint(-52.5F, 2.6F, 11.01F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 208, 8, 0, 0F,0F, 0F, 0F, -156F, 0F, 0F, -156F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -156F, -6F, 0F, -156F, -6F, 0F, 0F, -6F, 0F); // Box 169
		bodyModel[134].setRotationPoint(0.5F, 2.6F, 11.01F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[135].setRotationPoint(68F, 3F, -0.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 266
		bodyModel[136].setRotationPoint(66F, 3F, 0.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 265
		bodyModel[137].setRotationPoint(66F, 3F, -0.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 264
		bodyModel[138].setRotationPoint(65.5F, 3.5F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[139].setRotationPoint(66F, 3F, -1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 123
		bodyModel[140].setRotationPoint(-68F, 3F, -1.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 122
		bodyModel[141].setRotationPoint(-67F, 3F, -0.499999999999996F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 120
		bodyModel[142].setRotationPoint(-69F, 3F, 0.500000000000004F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[143].setRotationPoint(-69F, 3F, -0.499999999999996F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 264
		bodyModel[144].setRotationPoint(-66F, 3.5F, -0.499999999999996F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[145].setRotationPoint(67F, 3F, -1.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[146].setRotationPoint(68F, 3F, -1.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[147].setRotationPoint(-68F, 3F, 0.500000000000004F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[148].setRotationPoint(-67F, 3F, 0.500000000000004F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 264
		bodyModel[149].setRotationPoint(-65.5F, 2.1F, -1.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 0
		bodyModel[150].setRotationPoint(-64.5F, 4.6F, -1.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 264
		bodyModel[151].setRotationPoint(64.5F, 2.1F, -1.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 0
		bodyModel[152].setRotationPoint(63.5F, 4.6F, -1.5F);
	}
}