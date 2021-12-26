//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.07.2021 - 21:35:27
// Last changed on: 24.07.2021 - 21:35:27

package wwcp.models.bogies.EUBogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class E94BogieBack extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public E94BogieBack() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[112];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 36
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 36
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 36
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 36
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 36
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 31
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 260
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 275
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 276
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 277
		bodyModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 29
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 41
		bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 42
		bodyModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 46
		bodyModel[15] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 260
		bodyModel[16] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 260
		bodyModel[17] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 275
		bodyModel[18] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 276
		bodyModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 277
		bodyModel[20] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 41
		bodyModel[22] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 42
		bodyModel[23] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 46
		bodyModel[24] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 260
		bodyModel[25] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 260
		bodyModel[26] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 260
		bodyModel[27] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 260
		bodyModel[28] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 260
		bodyModel[29] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 260
		bodyModel[30] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 275
		bodyModel[31] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 276
		bodyModel[32] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 277
		bodyModel[33] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 29
		bodyModel[34] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 46
		bodyModel[37] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 260
		bodyModel[38] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 260
		bodyModel[39] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 31
		bodyModel[40] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // EU Buffers
		bodyModel[41] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // EU Buffers
		bodyModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 175
		bodyModel[44] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 257
		bodyModel[45] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 282
		bodyModel[46] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 260
		bodyModel[48] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 260
		bodyModel[49] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 260
		bodyModel[50] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 260
		bodyModel[51] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 31
		bodyModel[52] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 31
		bodyModel[53] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 31
		bodyModel[54] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 31
		bodyModel[55] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 31
		bodyModel[56] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 31
		bodyModel[57] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 31
		bodyModel[58] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 260
		bodyModel[59] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 260
		bodyModel[60] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 260
		bodyModel[61] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 260
		bodyModel[62] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 260
		bodyModel[63] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 260
		bodyModel[64] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 260
		bodyModel[65] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 260
		bodyModel[66] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 260
		bodyModel[67] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 260
		bodyModel[68] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 260
		bodyModel[69] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 260
		bodyModel[70] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 260
		bodyModel[71] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 260
		bodyModel[72] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 260
		bodyModel[73] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 260
		bodyModel[74] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 260
		bodyModel[75] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 260
		bodyModel[76] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 124
		bodyModel[77] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Lamp
		bodyModel[78] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 323
		bodyModel[79] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 324
		bodyModel[80] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 325
		bodyModel[81] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 326
		bodyModel[82] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 124
		bodyModel[83] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Lamp
		bodyModel[84] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 31
		bodyModel[85] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 31
		bodyModel[86] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 260
		bodyModel[87] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 260
		bodyModel[88] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 260
		bodyModel[89] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 260
		bodyModel[90] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 260
		bodyModel[91] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 260
		bodyModel[92] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 260
		bodyModel[93] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 260
		bodyModel[94] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 260
		bodyModel[95] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 260
		bodyModel[96] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 260
		bodyModel[97] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 260
		bodyModel[98] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 260
		bodyModel[99] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 260
		bodyModel[100] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 260
		bodyModel[101] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 260
		bodyModel[102] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 260
		bodyModel[103] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 260
		bodyModel[104] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 260
		bodyModel[105] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 316
		bodyModel[106] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 316
		bodyModel[107] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 316
		bodyModel[108] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 316
		bodyModel[109] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 316
		bodyModel[110] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 316
		bodyModel[111] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 260

		bodyModel[0].addShapeBox(0F, 0F, 0F, 20, 2, 21, 0F,0F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 31
		bodyModel[0].setRotationPoint(8.25F, -10.5F, -10.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 36
		bodyModel[1].setRotationPoint(6.25F, -8.5F, -10.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[2].setRotationPoint(6.25F, -8.5F, 8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 36
		bodyModel[3].setRotationPoint(6.25F, -10.5F, -10.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
		bodyModel[4].setRotationPoint(6.25F, -10.5F, 8.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 8, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
		bodyModel[5].setRotationPoint(7.25F, -11F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 21, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[6].setRotationPoint(28.25F, -10.5F, -10.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[7].setRotationPoint(-21F, -0.5F, 8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 275
		bodyModel[8].setRotationPoint(-20F, 4F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 276
		bodyModel[9].setRotationPoint(-20.5F, 2.5F, 7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 277
		bodyModel[10].setRotationPoint(-18.5F, 4F, -10F);

		bodyModel[11].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[11].setRotationPoint(-18F, 4.5F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 41
		bodyModel[12].setRotationPoint(-20F, 4F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 42
		bodyModel[13].setRotationPoint(-20.5F, 2.5F, -10F);

		bodyModel[14].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[14].setRotationPoint(-18F, 4.5F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[15].setRotationPoint(-15F, -0.5F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[16].setRotationPoint(-3F, -0.5F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 275
		bodyModel[17].setRotationPoint(-2F, 4F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 276
		bodyModel[18].setRotationPoint(-2.5F, 2.5F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 277
		bodyModel[19].setRotationPoint(-0.5F, 4F, -10F);

		bodyModel[20].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[20].setRotationPoint(0F, 4.5F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 41
		bodyModel[21].setRotationPoint(-2F, 4F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 42
		bodyModel[22].setRotationPoint(-2.5F, 2.5F, -10F);

		bodyModel[23].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[23].setRotationPoint(0F, 4.5F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[24].setRotationPoint(-21F, -0.5F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 12, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[25].setRotationPoint(-15F, -0.5F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[26].setRotationPoint(-3F, -0.5F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[27].setRotationPoint(-25F, -0.5F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[28].setRotationPoint(3F, -0.5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[29].setRotationPoint(17F, -0.5F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 275
		bodyModel[30].setRotationPoint(18F, 4F, 7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 276
		bodyModel[31].setRotationPoint(17.5F, 2.5F, 7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 277
		bodyModel[32].setRotationPoint(19.5F, 4F, -10F);

		bodyModel[33].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[33].setRotationPoint(20F, 4.5F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 41
		bodyModel[34].setRotationPoint(18F, 4F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 42
		bodyModel[35].setRotationPoint(17.5F, 2.5F, -10F);

		bodyModel[36].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[36].setRotationPoint(21F, 4.5F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[37].setRotationPoint(17F, -0.5F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 14, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[38].setRotationPoint(3F, -0.5F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 21, 8, 21, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[39].setRotationPoint(8.25F, -8.5F, -10.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // EU Buffers
		bodyModel[40].setRotationPoint(31.25F, 0.5F, 7.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // EU Buffers
		bodyModel[41].setRotationPoint(36.25F, -0.5F, 6.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 48
		bodyModel[42].setRotationPoint(31.25F, 0.5F, -8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 175
		bodyModel[43].setRotationPoint(36.25F, -0.5F, -9.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 257
		bodyModel[44].setRotationPoint(28.75F, -0.5F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 282
		bodyModel[45].setRotationPoint(31.25F, 0F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 50
		bodyModel[46].setRotationPoint(31.25F, 0F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[47].setRotationPoint(23F, -0.5F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 4, 18, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[48].setRotationPoint(27F, -0.5F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[49].setRotationPoint(23F, -0.5F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F); // Box 260
		bodyModel[50].setRotationPoint(27F, 2.5F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.25F, -1F, 0F); // Box 31
		bodyModel[51].setRotationPoint(27.25F, -1.5F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 31
		bodyModel[52].setRotationPoint(8.25F, -1.5F, 10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 31
		bodyModel[53].setRotationPoint(8.25F, -1.5F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 31
		bodyModel[54].setRotationPoint(8.25F, -1.5F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 21, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[55].setRotationPoint(8.25F, -1.5F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[56].setRotationPoint(8.25F, -1.5F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 31
		bodyModel[57].setRotationPoint(8.25F, -1.5F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[58].setRotationPoint(23F, -0.5F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 260
		bodyModel[59].setRotationPoint(13F, -0.5F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 260
		bodyModel[60].setRotationPoint(13F, -0.5F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 260
		bodyModel[61].setRotationPoint(13F, -0.5F, 9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 260
		bodyModel[62].setRotationPoint(13F, -0.5F, 9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[63].setRotationPoint(23F, 0.5F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[64].setRotationPoint(23F, 1.5F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[65].setRotationPoint(23F, 2.5F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[66].setRotationPoint(23F, 0F, -10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[67].setRotationPoint(23F, 1F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[68].setRotationPoint(23F, 2F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[69].setRotationPoint(23F, -0.5F, 9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[70].setRotationPoint(23F, 0.5F, 9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[71].setRotationPoint(23F, 1.5F, 9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[72].setRotationPoint(23F, 2.5F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[73].setRotationPoint(23F, 0F, 9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[74].setRotationPoint(23F, 1F, 9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 260
		bodyModel[75].setRotationPoint(23F, 2F, 9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 124
		bodyModel[76].setRotationPoint(29F, -2.75F, -8.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Lamp
		bodyModel[77].setRotationPoint(30.75F, -2.75F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[78].setRotationPoint(29.5F, -1.25F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 324
		bodyModel[79].setRotationPoint(29F, -2.75F, 6.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 325
		bodyModel[80].setRotationPoint(30.75F, -2.75F, 6.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[81].setRotationPoint(29.5F, -1.25F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 124
		bodyModel[82].setRotationPoint(29F, -11.75F, -1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Lamp
		bodyModel[83].setRotationPoint(30.75F, -11.75F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, -0.75F, -0.25F, -1.25F); // Box 31
		bodyModel[84].setRotationPoint(28.25F, -10.5F, -1.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, -0.5F, -0.5F, -1.25F, -0.625F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, -0.625F, -0.25F, -1.25F); // Box 31
		bodyModel[85].setRotationPoint(28F, -10.5F, -1.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[86].setRotationPoint(-11F, -0.5F, -8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 260
		bodyModel[87].setRotationPoint(-24F, 5F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 260
		bodyModel[88].setRotationPoint(-24F, 5F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[89].setRotationPoint(-15F, 5F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[90].setRotationPoint(-15F, 5F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 260
		bodyModel[91].setRotationPoint(-6F, 5F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 260
		bodyModel[92].setRotationPoint(-6F, 5F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[93].setRotationPoint(3F, 5F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[94].setRotationPoint(3F, 5F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 260
		bodyModel[95].setRotationPoint(14F, 5F, -9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 260
		bodyModel[96].setRotationPoint(14F, 5F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[97].setRotationPoint(23F, 5F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[98].setRotationPoint(23F, 5F, 8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[99].setRotationPoint(26F, -0.5F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F); // Box 260
		bodyModel[100].setRotationPoint(27F, 2.5F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[101].setRotationPoint(26F, -0.5F, 8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[102].setRotationPoint(-25F, -0.5F, 8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[103].setRotationPoint(-35F, 2.5F, -9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 7, 6, 18, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F); // Box 260
		bodyModel[104].setRotationPoint(-32F, -0.5F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 316
		bodyModel[105].setRotationPoint(22.5F, -8.5F, -11.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 316
		bodyModel[106].setRotationPoint(16.5F, -8.5F, -11.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 316
		bodyModel[107].setRotationPoint(10.5F, -8.5F, -11.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F); // Box 316
		bodyModel[108].setRotationPoint(22.5F, -8.5F, 10.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F); // Box 316
		bodyModel[109].setRotationPoint(16.5F, -8.5F, 10.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F); // Box 316
		bodyModel[110].setRotationPoint(10.5F, -8.5F, 10.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[111].setRotationPoint(-10.5F, -1.5F, -2F);
	}
}