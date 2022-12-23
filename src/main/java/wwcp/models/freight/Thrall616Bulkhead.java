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

public class Thrall616Bulkhead extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public Thrall616Bulkhead() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[162];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 21, 1, textureX, textureY); // Front Coupler
		bodyModel[1] = new ModelRendererTurbo(this, 11, 1, textureX, textureY); // Front Coupler
		bodyModel[2] = new ModelRendererTurbo(this, 16, 1, textureX, textureY); // Front Coupler
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Front Coupler
		bodyModel[4] = new ModelRendererTurbo(this, 6, 1, textureX, textureY); // Front Coupler
		bodyModel[5] = new ModelRendererTurbo(this, 21, 8, textureX, textureY); // Rear Coupler
		bodyModel[6] = new ModelRendererTurbo(this, 11, 5, textureX, textureY); // Rear Coupler
		bodyModel[7] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Rear Coupler
		bodyModel[8] = new ModelRendererTurbo(this, 16, 5, textureX, textureY); // Rear Coupler
		bodyModel[9] = new ModelRendererTurbo(this, 6, 5, textureX, textureY); // Rear Coupler
		bodyModel[10] = new ModelRendererTurbo(this, 22, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 22, 8, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 221, 11, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 15, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 231, 6, textureX, textureY); // Box 14
		bodyModel[16] = new ModelRendererTurbo(this, 231, 34, textureX, textureY); // Box 14
		bodyModel[17] = new ModelRendererTurbo(this, 159, 24, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 13, 24, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 186, 38, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 2, 38, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 40, 31, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 156, 31, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 40, 24, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 40, 36, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 156, 36, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 63, 31, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 63, 31, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 63, 31, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 63, 31, textureX, textureY); // Box 28
		bodyModel[30] = new ModelRendererTurbo(this, 63, 31, textureX, textureY); // Box 28
		bodyModel[31] = new ModelRendererTurbo(this, 63, 31, textureX, textureY); // Box 28
		bodyModel[32] = new ModelRendererTurbo(this, 63, 11, textureX, textureY); // Box 28
		bodyModel[33] = new ModelRendererTurbo(this, 63, 11, textureX, textureY); // Box 28
		bodyModel[34] = new ModelRendererTurbo(this, 63, 11, textureX, textureY); // Box 28
		bodyModel[35] = new ModelRendererTurbo(this, 63, 11, textureX, textureY); // Box 28
		bodyModel[36] = new ModelRendererTurbo(this, 63, 11, textureX, textureY); // Box 28
		bodyModel[37] = new ModelRendererTurbo(this, 63, 11, textureX, textureY); // Box 28
		bodyModel[38] = new ModelRendererTurbo(this, 223, 10, textureX, textureY); // Box 13
		bodyModel[39] = new ModelRendererTurbo(this, 224, 15, textureX, textureY); // Box 13
		bodyModel[40] = new ModelRendererTurbo(this, 490, 10, textureX, textureY); // Box 13
		bodyModel[41] = new ModelRendererTurbo(this, 490, 15, textureX, textureY); // Box 13
		bodyModel[42] = new ModelRendererTurbo(this, 223, 24, textureX, textureY); // Box 13
		bodyModel[43] = new ModelRendererTurbo(this, 228, 24, textureX, textureY); // Box 13
		bodyModel[44] = new ModelRendererTurbo(this, 224, 29, textureX, textureY); // Box 13
		bodyModel[45] = new ModelRendererTurbo(this, 495, 24, textureX, textureY); // Box 13
		bodyModel[46] = new ModelRendererTurbo(this, 490, 29, textureX, textureY); // Box 13
		bodyModel[47] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[48] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[49] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[50] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[51] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[52] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[53] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[54] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[55] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[56] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[57] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[58] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[59] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[60] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[61] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[62] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[63] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[64] = new ModelRendererTurbo(this, 218, 29, textureX, textureY); // Box 13
		bodyModel[65] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[66] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[67] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[68] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[69] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[70] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[71] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[72] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[73] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[74] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[75] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[76] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[77] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[78] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[79] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[80] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[81] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[82] = new ModelRendererTurbo(this, 218, 10, textureX, textureY); // Box 13
		bodyModel[83] = new ModelRendererTurbo(this, 228, 10, textureX, textureY); // Box 13
		bodyModel[84] = new ModelRendererTurbo(this, 490, 24, textureX, textureY); // Box 13
		bodyModel[85] = new ModelRendererTurbo(this, 495, 10, textureX, textureY); // Box 13
		bodyModel[86] = new ModelRendererTurbo(this, 186, 33, textureX, textureY); // Box 28
		bodyModel[87] = new ModelRendererTurbo(this, 20, 33, textureX, textureY); // Box 28
		bodyModel[88] = new ModelRendererTurbo(this, 209, 38, textureX, textureY); // Box 181
		bodyModel[89] = new ModelRendererTurbo(this, 258, 104, textureX, textureY); // Box 182
		bodyModel[90] = new ModelRendererTurbo(this, 262, 89, textureX, textureY); // Box 182
		bodyModel[91] = new ModelRendererTurbo(this, 255, 89, textureX, textureY); // Box 182
		bodyModel[92] = new ModelRendererTurbo(this, 209, 98, textureX, textureY); // Box 182
		bodyModel[93] = new ModelRendererTurbo(this, 216, 83, textureX, textureY); // Box 182
		bodyModel[94] = new ModelRendererTurbo(this, 209, 83, textureX, textureY); // Box 182
		bodyModel[95] = new ModelRendererTurbo(this, 231, 83, textureX, textureY); // Box 182
		bodyModel[96] = new ModelRendererTurbo(this, 276, 90, textureX, textureY); // Box 182
		bodyModel[97] = new ModelRendererTurbo(this, 239, 60, textureX, textureY); // Box 181
		bodyModel[98] = new ModelRendererTurbo(this, 226, 83, textureX, textureY); // Box 182
		bodyModel[99] = new ModelRendererTurbo(this, 221, 83, textureX, textureY); // Box 182
		bodyModel[100] = new ModelRendererTurbo(this, 243, 89, textureX, textureY); // Box 182
		bodyModel[101] = new ModelRendererTurbo(this, 238, 85, textureX, textureY); // Box 182
		bodyModel[102] = new ModelRendererTurbo(this, 236, 63, textureX, textureY); // Box 182
		bodyModel[103] = new ModelRendererTurbo(this, 243, 104, textureX, textureY); // Box 182
		bodyModel[104] = new ModelRendererTurbo(this, 248, 89, textureX, textureY); // Box 182
		bodyModel[105] = new ModelRendererTurbo(this, 208, 57, textureX, textureY); // Box 13
		bodyModel[106] = new ModelRendererTurbo(this, 208, 57, textureX, textureY); // Box 13
		bodyModel[107] = new ModelRendererTurbo(this, 254, 57, textureX, textureY); // Box 13
		bodyModel[108] = new ModelRendererTurbo(this, 254, 57, textureX, textureY); // Box 13
		bodyModel[109] = new ModelRendererTurbo(this, 254, 57, textureX, textureY); // Box 13
		bodyModel[110] = new ModelRendererTurbo(this, 254, 57, textureX, textureY); // Box 13
		bodyModel[111] = new ModelRendererTurbo(this, 228, 38, textureX, textureY); // Box 32
		bodyModel[112] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 33
		bodyModel[113] = new ModelRendererTurbo(this, 222, 52, textureX, textureY); // Box 33
		bodyModel[114] = new ModelRendererTurbo(this, 245, 93, textureX, textureY); // Box 13
		bodyModel[115] = new ModelRendererTurbo(this, 423, 89, textureX, textureY); // Box 13
		bodyModel[116] = new ModelRendererTurbo(this, 465, 38, textureX, textureY); // Box 181
		bodyModel[117] = new ModelRendererTurbo(this, 503, 98, textureX, textureY); // Box 182
		bodyModel[118] = new ModelRendererTurbo(this, 500, 83, textureX, textureY); // Box 182
		bodyModel[119] = new ModelRendererTurbo(this, 505, 83, textureX, textureY); // Box 182
		bodyModel[120] = new ModelRendererTurbo(this, 454, 100, textureX, textureY); // Box 182
		bodyModel[121] = new ModelRendererTurbo(this, 454, 85, textureX, textureY); // Box 182
		bodyModel[122] = new ModelRendererTurbo(this, 459, 85, textureX, textureY); // Box 182
		bodyModel[123] = new ModelRendererTurbo(this, 483, 83, textureX, textureY); // Box 182
		bodyModel[124] = new ModelRendererTurbo(this, 436, 86, textureX, textureY); // Box 182
		bodyModel[125] = new ModelRendererTurbo(this, 433, 60, textureX, textureY); // Box 181
		bodyModel[126] = new ModelRendererTurbo(this, 478, 85, textureX, textureY); // Box 182
		bodyModel[127] = new ModelRendererTurbo(this, 495, 83, textureX, textureY); // Box 182
		bodyModel[128] = new ModelRendererTurbo(this, 473, 85, textureX, textureY); // Box 182
		bodyModel[129] = new ModelRendererTurbo(this, 490, 83, textureX, textureY); // Box 182
		bodyModel[130] = new ModelRendererTurbo(this, 440, 63, textureX, textureY); // Box 182
		bodyModel[131] = new ModelRendererTurbo(this, 469, 100, textureX, textureY); // Box 182
		bodyModel[132] = new ModelRendererTurbo(this, 466, 85, textureX, textureY); // Box 182
		bodyModel[133] = new ModelRendererTurbo(this, 478, 57, textureX, textureY); // Box 13
		bodyModel[134] = new ModelRendererTurbo(this, 478, 57, textureX, textureY); // Box 13
		bodyModel[135] = new ModelRendererTurbo(this, 478, 57, textureX, textureY); // Box 13
		bodyModel[136] = new ModelRendererTurbo(this, 478, 57, textureX, textureY); // Box 13
		bodyModel[137] = new ModelRendererTurbo(this, 490, 57, textureX, textureY); // Box 13
		bodyModel[138] = new ModelRendererTurbo(this, 490, 57, textureX, textureY); // Box 13
		bodyModel[139] = new ModelRendererTurbo(this, 254, 52, textureX, textureY); // Box 13
		bodyModel[140] = new ModelRendererTurbo(this, 254, 52, textureX, textureY); // Box 13
		bodyModel[141] = new ModelRendererTurbo(this, 224, 19, textureX, textureY); // Box 13
		bodyModel[142] = new ModelRendererTurbo(this, 254, 52, textureX, textureY); // Box 13
		bodyModel[143] = new ModelRendererTurbo(this, 224, 19, textureX, textureY); // Box 13
		bodyModel[144] = new ModelRendererTurbo(this, 254, 52, textureX, textureY); // Box 13
		bodyModel[145] = new ModelRendererTurbo(this, 254, 52, textureX, textureY); // Box 13
		bodyModel[146] = new ModelRendererTurbo(this, 254, 52, textureX, textureY); // Box 13
		bodyModel[147] = new ModelRendererTurbo(this, 254, 52, textureX, textureY); // Box 13
		bodyModel[148] = new ModelRendererTurbo(this, 254, 52, textureX, textureY); // Box 13
		bodyModel[149] = new ModelRendererTurbo(this, 478, 52, textureX, textureY); // Box 13
		bodyModel[150] = new ModelRendererTurbo(this, 478, 52, textureX, textureY); // Box 13
		bodyModel[151] = new ModelRendererTurbo(this, 490, 19, textureX, textureY); // Box 13
		bodyModel[152] = new ModelRendererTurbo(this, 478, 52, textureX, textureY); // Box 13
		bodyModel[153] = new ModelRendererTurbo(this, 490, 19, textureX, textureY); // Box 13
		bodyModel[154] = new ModelRendererTurbo(this, 478, 52, textureX, textureY); // Box 13
		bodyModel[155] = new ModelRendererTurbo(this, 478, 52, textureX, textureY); // Box 13
		bodyModel[156] = new ModelRendererTurbo(this, 478, 52, textureX, textureY); // Box 13
		bodyModel[157] = new ModelRendererTurbo(this, 478, 52, textureX, textureY); // Box 13
		bodyModel[158] = new ModelRendererTurbo(this, 478, 52, textureX, textureY); // Box 13
		bodyModel[159] = new ModelRendererTurbo(this, 241, 53, textureX, textureY); // Box 33
		bodyModel[160] = new ModelRendererTurbo(this, 266, 59, textureX, textureY); // Box 181
		bodyModel[161] = new ModelRendererTurbo(this, 452, 59, textureX, textureY); // Box 181

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Coupler
		bodyModel[0].setRotationPoint(-67F, 3.5F, -0.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Front Coupler
		bodyModel[1].setRotationPoint(-68F, 3F, -0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Coupler
		bodyModel[2].setRotationPoint(-68F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Coupler
		bodyModel[3].setRotationPoint(-70F, 3F, -0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Coupler
		bodyModel[4].setRotationPoint(-69F, 3F, 0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Rear Coupler
		bodyModel[5].setRotationPoint(66F, 3.5F, -0.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Rear Coupler
		bodyModel[6].setRotationPoint(67F, 3F, -0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Rear Coupler
		bodyModel[7].setRotationPoint(69F, 3F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Rear Coupler
		bodyModel[8].setRotationPoint(67F, 3F, 0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Rear Coupler
		bodyModel[9].setRotationPoint(68F, 3F, -1.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 11
		bodyModel[10].setRotationPoint(-66F, 3F, -2F);

		bodyModel[11].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 11
		bodyModel[11].setRotationPoint(64F, 3F, -2F);

		bodyModel[12].addBox(0F, 0F, 0F, 120, 1, 21, 0F); // Box 13
		bodyModel[12].setRotationPoint(-60F, 2F, -10.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 14
		bodyModel[13].setRotationPoint(-64F, 3F, -10F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 20, 0F); // Box 14
		bodyModel[14].setRotationPoint(63F, 3F, -10F);

		bodyModel[15].addBox(0F, 0F, 0F, 128, 2, 1, 0F); // Box 14
		bodyModel[15].setRotationPoint(-64F, 3F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 128, 2, 1, 0F); // Box 14
		bodyModel[16].setRotationPoint(-64F, 3F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(49F, 2.5F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[18].setRotationPoint(-52F, 2.5F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[19].setRotationPoint(52F, 2.5F, -1.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[20].setRotationPoint(-64F, 2.5F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[21].setRotationPoint(-49F, 2.5F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[22].setRotationPoint(41F, 2.5F, -1.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 66, 3, 3, 0F); // Box 28
		bodyModel[23].setRotationPoint(-33F, 3F, -1.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 28
		bodyModel[24].setRotationPoint(-41F, 3F, -1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(33F, 3F, -1.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[26].setRotationPoint(-32F, 3F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[27].setRotationPoint(30F, 3F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[28].setRotationPoint(-20F, 3F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[29].setRotationPoint(-8F, 3F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[30].setRotationPoint(6F, 3F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[31].setRotationPoint(18F, 3F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[32].setRotationPoint(-32F, 3F, 1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[33].setRotationPoint(30F, 3F, 1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[34].setRotationPoint(-20F, 3F, 1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[35].setRotationPoint(-8F, 3F, 1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[36].setRotationPoint(6F, 3F, 1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[37].setRotationPoint(18F, 3F, 1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[38].setRotationPoint(-63.5F, 5F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[39].setRotationPoint(-63.5F, 6F, 10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[40].setRotationPoint(63F, 5F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[41].setRotationPoint(60.5F, 6F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[42].setRotationPoint(-63.5F, 5F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[43].setRotationPoint(-61F, 5F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 13
		bodyModel[44].setRotationPoint(-63.5F, 6F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[45].setRotationPoint(63F, 5F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 13
		bodyModel[46].setRotationPoint(60.5F, 6F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[47].setRotationPoint(-57F, 2F, -11.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[48].setRotationPoint(56F, 2F, -11.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[49].setRotationPoint(50F, 2F, -11.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[50].setRotationPoint(-51F, 2F, -11.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[51].setRotationPoint(-44F, 2F, -11.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[52].setRotationPoint(-37F, 2F, -11.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[53].setRotationPoint(43F, 2F, -11.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[54].setRotationPoint(36F, 2F, -11.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[55].setRotationPoint(29F, 2F, -11.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[56].setRotationPoint(22F, 2F, -11.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[57].setRotationPoint(15F, 2F, -11.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[58].setRotationPoint(8F, 2F, -11.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[59].setRotationPoint(-30F, 2F, -11.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[60].setRotationPoint(-23F, 2F, -11.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[61].setRotationPoint(-16F, 2F, -11.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[62].setRotationPoint(-9F, 2F, -11.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[63].setRotationPoint(-3F, 2F, -11.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[64].setRotationPoint(2F, 2F, -11.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[65].setRotationPoint(-57F, 2F, 10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[66].setRotationPoint(56F, 2F, 10.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[67].setRotationPoint(50F, 2F, 10.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[68].setRotationPoint(-51F, 2F, 10.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[69].setRotationPoint(-44F, 2F, 10.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[70].setRotationPoint(-37F, 2F, 10.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[71].setRotationPoint(43F, 2F, 10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[72].setRotationPoint(36F, 2F, 10.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[73].setRotationPoint(29F, 2F, 10.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[74].setRotationPoint(22F, 2F, 10.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[75].setRotationPoint(15F, 2F, 10.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[76].setRotationPoint(8F, 2F, 10.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[77].setRotationPoint(-30F, 2F, 10.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[78].setRotationPoint(-23F, 2F, 10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[79].setRotationPoint(-16F, 2F, 10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[80].setRotationPoint(-9F, 2F, 10.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[81].setRotationPoint(-3F, 2F, 10.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[82].setRotationPoint(2F, 2F, 10.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[83].setRotationPoint(-61F, 5F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[84].setRotationPoint(60.5F, 5F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[85].setRotationPoint(60.5F, 5F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[86].setRotationPoint(49F, 3F, -1.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[87].setRotationPoint(-52F, 3F, -1.5F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 22, 22, 0F); // Box 181
		bodyModel[88].setRotationPoint(-61F, -20F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 182
		bodyModel[89].setRotationPoint(-64F, -7F, 10F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 182
		bodyModel[90].setRotationPoint(-62F, -20F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[91].setRotationPoint(-64F, -20F, 10F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 182
		bodyModel[92].setRotationPoint(-64F, -7F, -11F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 182
		bodyModel[93].setRotationPoint(-62F, -20F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[94].setRotationPoint(-64F, -20F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 22, 2, 0F); // Box 182
		bodyModel[95].setRotationPoint(-62F, -20F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[96].setRotationPoint(-64F, -20F, -1F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 0, 22, 0F); // Box 181
		bodyModel[97].setRotationPoint(-62F, -20.01F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 22, 1, 0F); // Box 182
		bodyModel[98].setRotationPoint(-62F, -20F, -5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 22, 1, 0F); // Box 182
		bodyModel[99].setRotationPoint(-62F, -20F, -8F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 182
		bodyModel[100].setRotationPoint(-62F, -20F, 7F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 22, 1, 0F); // Box 182
		bodyModel[101].setRotationPoint(-62F, -20F, 4F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 182
		bodyModel[102].setRotationPoint(-63F, -9F, -10F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 182
		bodyModel[103].setRotationPoint(-64F, -7F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[104].setRotationPoint(-64F, -20F, 7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[105].setRotationPoint(-63.5F, -3F, -12F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[106].setRotationPoint(-63.5F, -6F, -12F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[107].setRotationPoint(-63.5F, -3F, 11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[108].setRotationPoint(-63.5F, -6F, 11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[109].setRotationPoint(-63.5F, 3F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[110].setRotationPoint(-63.5F, 0F, 11F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 0, 6, 0F); // Box 32
		bodyModel[111].setRotationPoint(-65F, 1F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[112].setRotationPoint(-63F, -4F, 3.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[113].setRotationPoint(-62.5F, -5F, 2.5F);

		bodyModel[114].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 13
		bodyModel[114].setRotationPoint(-64F, 2F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 4, 1, 22, 0F); // Box 13
		bodyModel[115].setRotationPoint(60F, 2F, -11F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 22, 22, 0F); // Box 181
		bodyModel[116].setRotationPoint(60F, -20F, -11F);

		bodyModel[117].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 182
		bodyModel[117].setRotationPoint(61F, -7F, 10F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 182
		bodyModel[118].setRotationPoint(61F, -20F, 10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[119].setRotationPoint(62F, -20F, 10F);

		bodyModel[120].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 182
		bodyModel[120].setRotationPoint(61F, -7F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 182
		bodyModel[121].setRotationPoint(61F, -20F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[122].setRotationPoint(62F, -20F, -11F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 22, 2, 0F); // Box 182
		bodyModel[123].setRotationPoint(61F, -20F, -1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 22, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[124].setRotationPoint(62F, -20F, -1F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 0, 22, 0F); // Box 181
		bodyModel[125].setRotationPoint(60F, -20.01F, -11F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 22, 1, 0F); // Box 182
		bodyModel[126].setRotationPoint(61F, -20F, -5F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 22, 1, 0F); // Box 182
		bodyModel[127].setRotationPoint(61F, -20F, 7F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 13, 1, 0F); // Box 182
		bodyModel[128].setRotationPoint(61F, -20F, -8F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 22, 1, 0F); // Box 182
		bodyModel[129].setRotationPoint(61F, -20F, 4F);

		bodyModel[130].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 182
		bodyModel[130].setRotationPoint(61F, -9F, -10F);

		bodyModel[131].addBox(0F, 0F, 0F, 3, 9, 1, 0F); // Box 182
		bodyModel[131].setRotationPoint(61F, -7F, -8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 13, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[132].setRotationPoint(62F, -20F, -8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[133].setRotationPoint(60.5F, -3F, -12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[134].setRotationPoint(60.5F, -6F, -12F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[135].setRotationPoint(60.5F, 3F, -12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[136].setRotationPoint(60.5F, 0F, -12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[137].setRotationPoint(60.5F, -3F, 11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 13
		bodyModel[138].setRotationPoint(60.5F, -6F, 11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[139].setRotationPoint(-64.5F, -3F, 7.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[140].setRotationPoint(-64.5F, -6F, 7.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[141].setRotationPoint(-64.5F, 3F, 6.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[142].setRotationPoint(-64.5F, 0F, 7.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[143].setRotationPoint(-64.5F, 3F, -9.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[144].setRotationPoint(-63.75F, -12F, 7.5F);
		bodyModel[144].rotateAngleZ = -0.13962634F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[145].setRotationPoint(-63.27F, -15F, 7.5F);
		bodyModel[145].rotateAngleZ = -0.13962634F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[146].setRotationPoint(-64.21F, -9F, 7.5F);
		bodyModel[146].rotateAngleZ = -0.13962634F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[147].setRotationPoint(-62.82F, -18F, 7.5F);
		bodyModel[147].rotateAngleZ = -0.13962634F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[148].setRotationPoint(-62.51F, -20F, 7.5F);
		bodyModel[148].rotateAngleZ = -0.13962634F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[149].setRotationPoint(63.5F, -3F, -10.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[150].setRotationPoint(63.5F, -6F, -10.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[151].setRotationPoint(63.5F, 3F, 6.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[152].setRotationPoint(63.5F, 0F, -10.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[153].setRotationPoint(63.5F, 3F, -9.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[154].setRotationPoint(63.23F, -12F, -10.5F);
		bodyModel[154].rotateAngleZ = 0.13962634F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[155].setRotationPoint(62.77F, -15F, -10.5F);
		bodyModel[155].rotateAngleZ = 0.13962634F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[156].setRotationPoint(63.7F, -9F, -10.5F);
		bodyModel[156].rotateAngleZ = 0.13962634F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[157].setRotationPoint(62.3F, -18F, -10.5F);
		bodyModel[157].rotateAngleZ = 0.13962634F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[158].setRotationPoint(62F, -20F, -10.5F);
		bodyModel[158].rotateAngleZ = 0.13962634F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[159].setRotationPoint(-63.05F, -5F, 2.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 0, 22, 1, 0F); // Box 181
		bodyModel[160].setRotationPoint(-59.99F, -20F, -0.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 0, 22, 1, 0F); // Box 181
		bodyModel[161].setRotationPoint(59.99F, -20F, -0.5F);
	}
}