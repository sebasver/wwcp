//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.12.2020 - 05:39:37
// Last changed on: 08.12.2020 - 05:39:37

package wwcp.models.passengerStock; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class SLRVC extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public SLRVC() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[157];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 29, 21, textureX, textureY); // Box 51
		bodyModel[2] = new ModelRendererTurbo(this, 2, 82, textureX, textureY); // Box 50
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 419
		bodyModel[4] = new ModelRendererTurbo(this, 150, 9, textureX, textureY); // Box 31
		bodyModel[5] = new ModelRendererTurbo(this, 233, 157, textureX, textureY); // Box 97
		bodyModel[6] = new ModelRendererTurbo(this, 150, 9, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 29
		bodyModel[9] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 29
		bodyModel[11] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 137, 18, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 399
		bodyModel[14] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 400
		bodyModel[15] = new ModelRendererTurbo(this, 8, 117, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 460, 1, textureX, textureY); // Box 370
		bodyModel[17] = new ModelRendererTurbo(this, 52, 8, textureX, textureY); // Box 370
		bodyModel[18] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 370
		bodyModel[19] = new ModelRendererTurbo(this, 52, 4, textureX, textureY); // Box 370
		bodyModel[20] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 50
		bodyModel[21] = new ModelRendererTurbo(this, 433, 30, textureX, textureY); // Box 370
		bodyModel[22] = new ModelRendererTurbo(this, 148, 25, textureX, textureY); // Box 50
		bodyModel[23] = new ModelRendererTurbo(this, 161, 82, textureX, textureY); // Box 50
		bodyModel[24] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 370
		bodyModel[25] = new ModelRendererTurbo(this, 209, 83, textureX, textureY); // Box 419
		bodyModel[26] = new ModelRendererTurbo(this, 209, 101, textureX, textureY); // Box 419
		bodyModel[27] = new ModelRendererTurbo(this, 273, 101, textureX, textureY); // Box 419
		bodyModel[28] = new ModelRendererTurbo(this, 390, 25, textureX, textureY); // Box 370
		bodyModel[29] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 370
		bodyModel[30] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 399
		bodyModel[31] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 400
		bodyModel[32] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 55
		bodyModel[33] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 56
		bodyModel[34] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 391, 33, textureX, textureY); // Box 55
		bodyModel[38] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 56
		bodyModel[39] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 42, 21, textureX, textureY); // Box 51
		bodyModel[41] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 419
		bodyModel[43] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 419
		bodyModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 138
		bodyModel[45] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 138
		bodyModel[46] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 138
		bodyModel[47] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 138
		bodyModel[48] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 138
		bodyModel[49] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 138
		bodyModel[50] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 138
		bodyModel[51] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 138
		bodyModel[52] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 419
		bodyModel[53] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 138
		bodyModel[54] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 138
		bodyModel[55] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 138
		bodyModel[56] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 138
		bodyModel[57] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 138
		bodyModel[58] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 138
		bodyModel[59] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 138
		bodyModel[60] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 138
		bodyModel[61] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 110
		bodyModel[62] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 111
		bodyModel[63] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 111
		bodyModel[64] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 113
		bodyModel[65] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 114
		bodyModel[66] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 115
		bodyModel[67] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 110
		bodyModel[68] = new ModelRendererTurbo(this, 296, 59, textureX, textureY); // Box 111
		bodyModel[69] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 111
		bodyModel[70] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 113
		bodyModel[71] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 114
		bodyModel[72] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 115
		bodyModel[73] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 114
		bodyModel[74] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 114
		bodyModel[75] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 114
		bodyModel[76] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 114
		bodyModel[77] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 114
		bodyModel[78] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 114
		bodyModel[79] = new ModelRendererTurbo(this, 78, 36, textureX, textureY); // Box 419
		bodyModel[80] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 419
		bodyModel[81] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 419
		bodyModel[82] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 114
		bodyModel[83] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 114
		bodyModel[84] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 114
		bodyModel[85] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 114
		bodyModel[86] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 114
		bodyModel[87] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 114
		bodyModel[88] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 114
		bodyModel[89] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 114
		bodyModel[90] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 114
		bodyModel[91] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 114
		bodyModel[92] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 114
		bodyModel[93] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 114
		bodyModel[94] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 114
		bodyModel[95] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 114
		bodyModel[96] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 114
		bodyModel[97] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 114
		bodyModel[98] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 114
		bodyModel[99] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 114
		bodyModel[100] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 114
		bodyModel[102] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 114
		bodyModel[103] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 114
		bodyModel[104] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 114
		bodyModel[105] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 114
		bodyModel[106] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 114
		bodyModel[107] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 114
		bodyModel[108] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 114
		bodyModel[109] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 114
		bodyModel[110] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 114
		bodyModel[111] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 114
		bodyModel[112] = new ModelRendererTurbo(this, 27, 88, textureX, textureY); // Box 103
		bodyModel[113] = new ModelRendererTurbo(this, 117, 95, textureX, textureY); // Box 116
		bodyModel[114] = new ModelRendererTurbo(this, 7, 156, textureX, textureY); // Box 117
		bodyModel[115] = new ModelRendererTurbo(this, 7, 156, textureX, textureY); // Box 117
		bodyModel[116] = new ModelRendererTurbo(this, 7, 142, textureX, textureY); // Box 117
		bodyModel[117] = new ModelRendererTurbo(this, 7, 142, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 7, 156, textureX, textureY); // Box 117
		bodyModel[119] = new ModelRendererTurbo(this, 7, 156, textureX, textureY); // Box 117
		bodyModel[120] = new ModelRendererTurbo(this, 7, 142, textureX, textureY); // Box 117
		bodyModel[121] = new ModelRendererTurbo(this, 7, 142, textureX, textureY); // Box 117
		bodyModel[122] = new ModelRendererTurbo(this, 117, 95, textureX, textureY); // Box 116
		bodyModel[123] = new ModelRendererTurbo(this, 55, 21, textureX, textureY); // Box 51
		bodyModel[124] = new ModelRendererTurbo(this, 68, 21, textureX, textureY); // Box 51
		bodyModel[125] = new ModelRendererTurbo(this, 131, 87, textureX, textureY); // Box 131
		bodyModel[126] = new ModelRendererTurbo(this, 131, 87, textureX, textureY); // Box 131
		bodyModel[127] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 254
		bodyModel[128] = new ModelRendererTurbo(this, 157, 95, textureX, textureY); // Box 254
		bodyModel[129] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 254
		bodyModel[130] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 254
		bodyModel[131] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 254
		bodyModel[132] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 254
		bodyModel[133] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 254
		bodyModel[134] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 254
		bodyModel[135] = new ModelRendererTurbo(this, 41, 154, textureX, textureY); // Box 126
		bodyModel[136] = new ModelRendererTurbo(this, 41, 154, textureX, textureY); // Box 126
		bodyModel[137] = new ModelRendererTurbo(this, 201, 157, textureX, textureY); // Box 422
		bodyModel[138] = new ModelRendererTurbo(this, 41, 154, textureX, textureY); // Box 126
		bodyModel[139] = new ModelRendererTurbo(this, 41, 154, textureX, textureY); // Box 126
		bodyModel[140] = new ModelRendererTurbo(this, 201, 166, textureX, textureY); // Box 422
		bodyModel[141] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 5
		bodyModel[142] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 383
		bodyModel[143] = new ModelRendererTurbo(this, 322, 130, textureX, textureY); // Box 5
		bodyModel[144] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 49
		bodyModel[145] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 387
		bodyModel[146] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 49
		bodyModel[147] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 389
		bodyModel[148] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 389
		bodyModel[149] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 387
		bodyModel[150] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 392
		bodyModel[151] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 393
		bodyModel[152] = new ModelRendererTurbo(this, 346, 104, textureX, textureY); // Box 383
		bodyModel[153] = new ModelRendererTurbo(this, 13, 156, textureX, textureY); // Box 117
		bodyModel[154] = new ModelRendererTurbo(this, 13, 156, textureX, textureY); // Box 117
		bodyModel[155] = new ModelRendererTurbo(this, 13, 156, textureX, textureY); // Box 117
		bodyModel[156] = new ModelRendererTurbo(this, 13, 156, textureX, textureY); // Box 117

		bodyModel[0].addBox(0F, 0F, 0F, 14, 1, 7, 0F); // Box 0
		bodyModel[0].setRotationPoint(-35.5F, 4.5F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 51
		bodyModel[1].setRotationPoint(-31.5F, 5.5F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 20, 4, 1, 0F); // Box 50
		bodyModel[2].setRotationPoint(-26.5F, 5.5F, 9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 29, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[3].setRotationPoint(-35.5F, -10.5F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[4].setRotationPoint(-35.5F, -11.5F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 66, 1, 18, 0F); // Box 97
		bodyModel[5].setRotationPoint(-35.5F, -11.5F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 66, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[6].setRotationPoint(-35.5F, -11.5F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[7].setRotationPoint(25.5F, -15.5F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 29
		bodyModel[8].setRotationPoint(25.5F, -15.5F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[9].setRotationPoint(-33.5F, -15.5F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 29
		bodyModel[10].setRotationPoint(-33.5F, -15.5F, 8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 56, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(-30.5F, -15.5F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 56, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 17
		bodyModel[12].setRotationPoint(-30.5F, -15.5F, 8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 399
		bodyModel[13].setRotationPoint(-2.5F, -9.5F, -9.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 400
		bodyModel[14].setRotationPoint(-6.5F, -9.5F, -9.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 42, 1, 18, 0F); // Box 0
		bodyModel[15].setRotationPoint(-23.5F, 8.5F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 370
		bodyModel[16].setRotationPoint(-21.5F, 4.5F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 370
		bodyModel[17].setRotationPoint(1.5F, 4.5F, -10F);

		bodyModel[18].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 370
		bodyModel[18].setRotationPoint(-21.5F, 4.5F, 9F);

		bodyModel[19].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 370
		bodyModel[19].setRotationPoint(1.5F, 4.5F, 9F);

		bodyModel[20].addBox(0F, 0F, 0F, 20, 4, 1, 0F); // Box 50
		bodyModel[20].setRotationPoint(1.5F, 5.5F, 9F);

		bodyModel[21].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 370
		bodyModel[21].setRotationPoint(-6.5F, 8.5F, 9F);

		bodyModel[22].addBox(0F, 0F, 0F, 20, 4, 1, 0F); // Box 50
		bodyModel[22].setRotationPoint(-26.5F, 5.5F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 20, 4, 1, 0F); // Box 50
		bodyModel[23].setRotationPoint(1.5F, 5.5F, -10F);

		bodyModel[24].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 370
		bodyModel[24].setRotationPoint(-6.5F, 8.5F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 29, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[25].setRotationPoint(1.5F, -10.5F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 29, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[26].setRotationPoint(-35.5F, -10.5F, 9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 29, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[27].setRotationPoint(1.5F, -10.5F, 9F);

		bodyModel[28].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 370
		bodyModel[28].setRotationPoint(-6.5F, -10.5F, -10F);

		bodyModel[29].addBox(0F, 0F, 0F, 8, 1, 1, 0F); // Box 370
		bodyModel[29].setRotationPoint(-6.5F, -10.5F, 9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 399
		bodyModel[30].setRotationPoint(-2.5F, -9.5F, 9.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 18, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 400
		bodyModel[31].setRotationPoint(-6.5F, -9.5F, 9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[32].setRotationPoint(-18.5F, 7F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56
		bodyModel[33].setRotationPoint(-20.5F, 5.5F, -3F);

		bodyModel[34].addBox(0F, 0F, 0F, 14, 1, 7, 0F); // Box 0
		bodyModel[34].setRotationPoint(-35.5F, 4.5F, 3F);

		bodyModel[35].addBox(0F, 0F, 0F, 15, 1, 6, 0F); // Box 0
		bodyModel[35].setRotationPoint(-35.5F, 4.5F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 14, 1, 7, 0F); // Box 0
		bodyModel[36].setRotationPoint(16.5F, 4.5F, 3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[37].setRotationPoint(11.5F, 7F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56
		bodyModel[38].setRotationPoint(13.5F, 5.5F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 14, 1, 7, 0F); // Box 0
		bodyModel[39].setRotationPoint(16.5F, 4.5F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[40].setRotationPoint(21.5F, 5.5F, -10F);

		bodyModel[41].addBox(0F, 0F, 0F, 15, 1, 6, 0F); // Box 0
		bodyModel[41].setRotationPoint(15.5F, 4.5F, -3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[42].setRotationPoint(30.5F, -10.5F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[43].setRotationPoint(30.5F, -10.5F, 3F);

		bodyModel[44].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 138
		bodyModel[44].setRotationPoint(11.5F, 6.5F, -9F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 138
		bodyModel[45].setRotationPoint(15.5F, 2.5F, -9F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 138
		bodyModel[46].setRotationPoint(11.5F, 6.5F, 3F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 138
		bodyModel[47].setRotationPoint(15.5F, 2.5F, 3F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 138
		bodyModel[48].setRotationPoint(20.5F, 2.5F, -9F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 138
		bodyModel[49].setRotationPoint(24.5F, -1.5F, -9F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 138
		bodyModel[50].setRotationPoint(20.5F, 2.5F, 3F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 138
		bodyModel[51].setRotationPoint(24.5F, -1.5F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[52].setRotationPoint(16.5F, -1.5F, -9F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 138
		bodyModel[53].setRotationPoint(-20.5F, 6.5F, 3F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 138
		bodyModel[54].setRotationPoint(-21.5F, 2.5F, 3F);

		bodyModel[55].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 138
		bodyModel[55].setRotationPoint(-20.5F, 6.5F, -9F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 138
		bodyModel[56].setRotationPoint(-21.5F, 2.5F, -9F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 138
		bodyModel[57].setRotationPoint(-29.5F, 2.5F, 3F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 138
		bodyModel[58].setRotationPoint(-30.5F, -1.5F, 3F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Box 138
		bodyModel[59].setRotationPoint(-29.5F, 2.5F, -9F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 5, 6, 0F); // Box 138
		bodyModel[60].setRotationPoint(-30.5F, -1.5F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 110
		bodyModel[61].setRotationPoint(-8.5F, 1.5F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,-0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 111
		bodyModel[62].setRotationPoint(-8.5F, -10.5F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, -1F, -0.5F, -5F, -1F); // Box 111
		bodyModel[63].setRotationPoint(-8.5F, -3.5F, -9.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 113
		bodyModel[64].setRotationPoint(-8.5F, 1.5F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[65].setRotationPoint(-8.5F, -10.5F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -0.5F, -0.5F, -5F, -0.5F); // Box 115
		bodyModel[66].setRotationPoint(-8.5F, -3.5F, 3.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 110
		bodyModel[67].setRotationPoint(2F, 1.5F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,-0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 111
		bodyModel[68].setRotationPoint(2F, -10.5F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, -5F, -0.5F, 0F, -5F, -0.5F, 0F, -5F, -1F, -0.5F, -5F, -1F); // Box 111
		bodyModel[69].setRotationPoint(2F, -3.5F, -9.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 113
		bodyModel[70].setRotationPoint(2F, 1.5F, 4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[71].setRotationPoint(2F, -10.5F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,-0.5F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -0.5F, -0.5F, -5F, -0.5F); // Box 115
		bodyModel[72].setRotationPoint(2F, -3.5F, 3.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[73].setRotationPoint(-17.5F, 1F, 2.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[74].setRotationPoint(-17.5F, 1F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[75].setRotationPoint(-22.5F, -1.5F, 2.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[76].setRotationPoint(-22.5F, -1.5F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[77].setRotationPoint(14F, -1.5F, 2.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[78].setRotationPoint(16F, -1.5F, -3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[79].setRotationPoint(16.5F, -1.5F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[80].setRotationPoint(-22F, -1.5F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[81].setRotationPoint(-22F, -1.5F, 3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 114
		bodyModel[82].setRotationPoint(-22F, -10.5F, 4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 114
		bodyModel[83].setRotationPoint(-22F, -10.5F, -4.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 114
		bodyModel[84].setRotationPoint(3F, -10.5F, 4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 14, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 114
		bodyModel[85].setRotationPoint(3F, -10.5F, -4.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[86].setRotationPoint(16.5F, -2.5F, -7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[87].setRotationPoint(16.5F, -8.5F, -7.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[88].setRotationPoint(16.5F, -9.5F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[89].setRotationPoint(-22F, -2.5F, -7.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[90].setRotationPoint(-22F, -8.5F, -7.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[91].setRotationPoint(-22F, -9.5F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[92].setRotationPoint(-22.5F, -2.5F, 2.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[93].setRotationPoint(-22.5F, -8.5F, 2.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[94].setRotationPoint(-22.5F, -9.5F, 4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[95].setRotationPoint(16F, -2.5F, 2.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[96].setRotationPoint(16F, -8.5F, 2.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[97].setRotationPoint(16F, -9.5F, 4F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1F, -4.5F, -0.5F, -1F, -4.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[98].setRotationPoint(16.5F, -11.5F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1F, -4.5F, -0.5F, -1F, -4.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[99].setRotationPoint(16.5F, -11.5F, -0.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1F, -4.5F, -0.5F, -1F, -4.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[100].setRotationPoint(-22F, -11.5F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, -1F, -4.5F, -0.5F, -1F, -4.5F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 114
		bodyModel[101].setRotationPoint(-22F, -11.5F, -0.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[102].setRotationPoint(-21.5F, -2F, -7.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[103].setRotationPoint(-21.5F, -2F, -2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.5F, -4.5F, -0.5F, -2F, -4.5F, -0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, -1F, -4.5F, -1F, 1F, -4.5F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 114
		bodyModel[104].setRotationPoint(-19F, -1F, -2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.5F, -4.5F, -0.5F, -2F, -4.5F, -0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, -1F, -4.5F, -1F, 1F, -4.5F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 114
		bodyModel[105].setRotationPoint(-19F, -1F, -7.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[106].setRotationPoint(11F, 1F, 2.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[107].setRotationPoint(11F, 1F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[108].setRotationPoint(13.5F, -2F, 2.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, -0.5F, -0.5F, -4.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 114
		bodyModel[109].setRotationPoint(13.5F, -2F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -4.5F, -0.5F, -2F, -4.5F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -4.5F, -1F, 1F, -4.5F); // Box 114
		bodyModel[110].setRotationPoint(11F, -1F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -4.5F, -0.5F, -2F, -4.5F, -1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -4.5F, -1F, 1F, -4.5F); // Box 114
		bodyModel[111].setRotationPoint(11F, -1F, 2.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 23, 4, 16, 0F); // Box 103
		bodyModel[112].setRotationPoint(-23F, -15F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-5F, -2F, -0.9F, 0F, -2F, -0.9F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, -0.9F, 0F, -2F, -0.9F, 0F, -2F, 0F, -5F, -2F, 0F); // Box 116
		bodyModel[113].setRotationPoint(3.5F, 1.5F, -10.91F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 4F, -0.9F, 5F, 4F, -0.9F, 5F, 4F, 0F, -4F, 4F, 0F); // Box 117
		bodyModel[114].setRotationPoint(-22.5F, -0.5F, -10.91F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 4F, -0.9F, 5F, 4F, -0.9F, 5F, 4F, 0F, -4F, 4F, 0F); // Box 117
		bodyModel[115].setRotationPoint(-22.5F, -0.5F, 9.01F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, 4F, -0.9F, 5F, 4F, -0.9F, 5F, 4F, 0F, -4F, 4F, 0F); // Box 117
		bodyModel[116].setRotationPoint(-26.5F, 4.5F, -10.91F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.99F, 0F, -1F, -0.99F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, 4F, -0.99F, 5F, 4F, -0.99F, 5F, 4F, 0F, -4F, 4F, 0F); // Box 117
		bodyModel[117].setRotationPoint(-26.5F, 4.5F, 9.01F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.9F, 0F, 0F, -0.9F, 5F, 4F, 0F, -4F, 4F, 0F, -4F, 4F, -0.9F, 5F, 4F, -0.9F); // Box 117
		bodyModel[118].setRotationPoint(16.5F, -0.5F, 9.91F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.9F, 0F, 0F, -0.9F, 5F, 4F, 0F, -4F, 4F, 0F, -4F, 4F, -0.9F, 5F, 4F, -0.9F); // Box 117
		bodyModel[119].setRotationPoint(16.5F, -0.5F, -10.01F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, 5F, 4F, 0F, -4F, 4F, 0F, -4F, 4F, -0.9F, 5F, 4F, -0.9F); // Box 117
		bodyModel[120].setRotationPoint(20.5F, 4.5F, 9.91F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, 5F, 4F, 0F, -4F, 4F, 0F, -4F, 4F, -0.9F, 5F, 4F, -0.9F); // Box 117
		bodyModel[121].setRotationPoint(20.5F, 4.5F, -10.01F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,-5F, -2F, -0.9F, 0F, -2F, -0.9F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, -0.9F, 0F, -2F, -0.9F, 0F, -2F, 0F, -5F, -2F, 0F); // Box 116
		bodyModel[122].setRotationPoint(-20.5F, 1.5F, 9.01F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 51
		bodyModel[123].setRotationPoint(-31.5F, 5.5F, 9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[124].setRotationPoint(21.5F, 5.5F, 9F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 131
		bodyModel[125].setRotationPoint(-24.5F, 5.5F, -9F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 4, 18, 0F); // Box 131
		bodyModel[126].setRotationPoint(18.5F, 5.5F, -9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 254
		bodyModel[127].setRotationPoint(-18.5F, -10.5F, 7.01F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F); // Box 254
		bodyModel[128].setRotationPoint(-17F, -10.5F, 7.01F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 254
		bodyModel[129].setRotationPoint(-9.5F, -10.5F, 7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -2F, 1F, 0F, -2F); // Box 254
		bodyModel[130].setRotationPoint(-17F, -6.5F, 7.01F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 254
		bodyModel[131].setRotationPoint(3.5F, -10.5F, -9.51F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2F, 0.5F, 0F, -2F); // Box 254
		bodyModel[132].setRotationPoint(5F, -10.5F, -9.51F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 254
		bodyModel[133].setRotationPoint(12.5F, -10.5F, -9.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -2F, 1F, 0F, -2F); // Box 254
		bodyModel[134].setRotationPoint(5F, -6.5F, -9.51F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 46, 9, 1, 0F,0F, -7F, -0.95F, -38F, -7F, -0.95F, -38F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -0.95F, -38F, 0F, -0.95F, -38F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[135].setRotationPoint(4.5F, -16F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 46, 9, 1, 0F,0F, -7F, -0.95F, -38F, -7F, -0.95F, -38F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -0.95F, -38F, 0F, -0.95F, -38F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[136].setRotationPoint(4.5F, -16F, -8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 422
		bodyModel[137].setRotationPoint(4.5F, -9.5F, -10.01F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 46, 9, 1, 0F,0F, -7F, -0.95F, -38F, -7F, -0.95F, -38F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -0.95F, -38F, 0F, -0.95F, -38F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[138].setRotationPoint(-17.5F, -16F, 6.54F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 46, 9, 1, 0F,0F, -7F, -0.95F, -38F, -7F, -0.95F, -38F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -0.95F, -38F, 0F, -0.95F, -38F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[139].setRotationPoint(-17.5F, -16F, 9.09F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 8, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 422
		bodyModel[140].setRotationPoint(-17.5F, -9.5F, 7.51F);

		bodyModel[141].addBox(0F, 0F, 0F, 5, 15, 1, 0F); // Box 5
		bodyModel[141].setRotationPoint(30.5F, -10.5F, -9F);

		bodyModel[142].addBox(0F, 0F, 0F, 5, 15, 1, 0F); // Box 383
		bodyModel[142].setRotationPoint(30.5F, -10.5F, 8F);

		bodyModel[143].addBox(0F, 0F, 0F, 5, 1, 16, 0F); // Box 5
		bodyModel[143].setRotationPoint(30.5F, 4.5F, -8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -3F, 0F); // Box 49
		bodyModel[144].setRotationPoint(30.5F, 4.5F, -9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -3F, 0F); // Box 387
		bodyModel[145].setRotationPoint(30.5F, 4.5F, 8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -4F, 0F); // Box 49
		bodyModel[146].setRotationPoint(33.5F, 4.5F, -9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -4F, 0F); // Box 389
		bodyModel[147].setRotationPoint(33.5F, 4.5F, 8F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 389
		bodyModel[148].setRotationPoint(33.5F, -11.5F, 8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 387
		bodyModel[149].setRotationPoint(30.5F, -11.5F, 8F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 392
		bodyModel[150].setRotationPoint(33.5F, -11.5F, -9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, -3F, 0F); // Box 393
		bodyModel[151].setRotationPoint(30.5F, -11.5F, -9F);

		bodyModel[152].addBox(0F, 0F, 0F, 5, 1, 16, 0F); // Box 383
		bodyModel[152].setRotationPoint(30.5F, -11.5F, -8F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 1F, 0F, -0.9F, 3F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, -0.9F, 3F, 1F, -0.9F); // Box 117
		bodyModel[153].setRotationPoint(17.5F, -0.5F, 9.91F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 1F, 0F, -0.9F, 3F, 1F, 0F, -2F, 1F, 0F, -2F, 1F, -0.9F, 3F, 1F, -0.9F); // Box 117
		bodyModel[154].setRotationPoint(17.5F, -0.5F, -10.01F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 1F, 0F, -0.9F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, -0.9F, 3F, 1F, -0.9F, 3F, 1F, 0F, -2F, 1F, 0F); // Box 117
		bodyModel[155].setRotationPoint(-23.5F, -0.5F, 9.01F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 1F, 0F, -0.9F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, -0.9F, 3F, 1F, -0.9F, 3F, 1F, 0F, -2F, 1F, 0F); // Box 117
		bodyModel[156].setRotationPoint(-23.5F, -0.5F, -10.91F);
	}
}