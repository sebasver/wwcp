//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.06.2018 - 18:33:10
// Last changed on: 24.06.2018 - 18:33:10

package wwcp.models.locomotives.diesels; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class RottenkraftWagen extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public RottenkraftWagen() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[134];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 26
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 33
		bodyModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 36
		bodyModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 32
		bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 33
		bodyModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 33
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 16
		bodyModel[20] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 17
		bodyModel[21] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 19
		bodyModel[22] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		bodyModel[23] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 19
		bodyModel[24] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 16
		bodyModel[25] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 16
		bodyModel[26] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 16
		bodyModel[27] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 16
		bodyModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 16
		bodyModel[29] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 16
		bodyModel[35] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 475, 11, textureX, textureY); // Box 0
		bodyModel[44] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 0
		bodyModel[46] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 0
		bodyModel[47] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 0
		bodyModel[52] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 0
		bodyModel[53] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		bodyModel[54] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 0
		bodyModel[55] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 0
		bodyModel[56] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 56
		bodyModel[58] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 56
		bodyModel[59] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 56
		bodyModel[60] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 60
		bodyModel[62] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 60
		bodyModel[63] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 60
		bodyModel[64] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 60
		bodyModel[65] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 60
		bodyModel[66] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 60
		bodyModel[67] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 60
		bodyModel[68] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 35
		bodyModel[69] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 36
		bodyModel[70] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 56
		bodyModel[71] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 56
		bodyModel[72] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 52
		bodyModel[76] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 52
		bodyModel[77] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 52
		bodyModel[78] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 52
		bodyModel[79] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 52
		bodyModel[80] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 52
		bodyModel[81] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 52
		bodyModel[82] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 52
		bodyModel[83] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 52
		bodyModel[84] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 52
		bodyModel[85] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 52
		bodyModel[86] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 52
		bodyModel[87] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 52
		bodyModel[88] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 52
		bodyModel[89] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 52
		bodyModel[90] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 52
		bodyModel[91] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 2
		bodyModel[95] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 2
		bodyModel[99] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 2
		bodyModel[100] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 26
		bodyModel[102] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 26
		bodyModel[103] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 2
		bodyModel[117] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 2
		bodyModel[118] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 2
		bodyModel[119] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 2
		bodyModel[120] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 2
		bodyModel[121] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 2
		bodyModel[122] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 52
		bodyModel[123] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 52
		bodyModel[124] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 52
		bodyModel[125] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 52
		bodyModel[127] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 52
		bodyModel[128] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 52
		bodyModel[129] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 130
		bodyModel[131] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 50, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-25F, 1F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[1].setRotationPoint(16F, 5F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[2].setRotationPoint(15F, 5F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[3].setRotationPoint(18F, 5F, 7F);
		bodyModel[3].rotateAngleY = -3.14159265F;

		bodyModel[4].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[4].setRotationPoint(16.5F, 5.5F, 5.98F);

		bodyModel[5].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[5].setRotationPoint(16.5F, 5.5F, -5.98F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[6].setRotationPoint(14F, 4F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[7].setRotationPoint(14F, 4F, 5.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[8].setRotationPoint(21.5F, 3F, -6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[9].setRotationPoint(18.5F, 3F, 5.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[10].setRotationPoint(14.5F, 3F, 6.5F);
		bodyModel[10].rotateAngleY = -3.14159265F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(18.5F, 3F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[12].setRotationPoint(14.5F, 3F, -6F);
		bodyModel[12].rotateAngleY = -3.14159265F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[13].setRotationPoint(-17F, 5F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[14].setRotationPoint(-15F, 5F, 7F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[15].setRotationPoint(-16.5F, 5.5F, 5.98F);

		bodyModel[16].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[16].setRotationPoint(-16.5F, 5.5F, -5.98F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[17].setRotationPoint(-19F, 4F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[18].setRotationPoint(-19F, 4F, 5.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[19].setRotationPoint(-23F, 3F, -6.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[20].setRotationPoint(-14.5F, 3F, 5.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[21].setRotationPoint(-18.5F, 3F, 6.5F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[22].setRotationPoint(-14.5F, 3F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[23].setRotationPoint(-18.5F, 3F, -6F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[24].setRotationPoint(21.5F, 2F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[25].setRotationPoint(21.5F, 2F, 5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[26].setRotationPoint(-23F, 2F, -6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 23, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[27].setRotationPoint(-11.5F, 2F, -6.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[28].setRotationPoint(-23F, 2F, 5.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 20, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 33
		bodyModel[29].setRotationPoint(-10F, 5F, -6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(-18F, 5F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 23, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[31].setRotationPoint(1.5F, -3F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 23, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[32].setRotationPoint(1.5F, -3F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[33].setRotationPoint(24F, -3F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 20, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[34].setRotationPoint(-10F, 4F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
		bodyModel[35].setRotationPoint(-23F, -3F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(-8F, 0F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[37].setRotationPoint(-22F, -3F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[38].setRotationPoint(-22F, -3F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 0
		bodyModel[39].setRotationPoint(-23F, -5F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 0
		bodyModel[40].setRotationPoint(-8F, -5F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[41].setRotationPoint(-22F, -5F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[42].setRotationPoint(-22F, -5F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 12, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[43].setRotationPoint(-23F, -17F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 12, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(-8F, -17F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 14, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[45].setRotationPoint(-22F, -17F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 14, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[46].setRotationPoint(-22F, -17F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
		bodyModel[47].setRotationPoint(-23F, -18F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 14, 1, 18, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[48].setRotationPoint(-22F, -18F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[49].setRotationPoint(-8F, -18F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[50].setRotationPoint(-8F, -17F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 15, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[51].setRotationPoint(-7F, -15F, -2F);
		bodyModel[51].rotateAngleY = -3.14159265F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[52].setRotationPoint(-8F, -17F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[53].setRotationPoint(-8F, -5F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[54].setRotationPoint(-8F, -3F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 0
		bodyModel[55].setRotationPoint(-8F, -3F, -2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 56
		bodyModel[56].setRotationPoint(-24.25F, -5F, -6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 56
		bodyModel[57].setRotationPoint(-24.25F, -5F, 5.25F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, -1.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, -1.25F, -0.75F, -0.75F); // Box 56
		bodyModel[58].setRotationPoint(-24.25F, -4F, -6.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, -1.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, -1.25F, -0.75F, -0.75F); // Box 56
		bodyModel[59].setRotationPoint(-24.25F, -4F, 5.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[60].setRotationPoint(-24F, -10F, 5.38F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[61].setRotationPoint(-24F, -10F, -6.38F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[62].setRotationPoint(-24F, -18F, -7.38F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[63].setRotationPoint(-24F, -18F, 6.38F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 60
		bodyModel[64].setRotationPoint(-24F, -12F, 5.38F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[65].setRotationPoint(-24F, -12F, -7.38F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[66].setRotationPoint(-24F, -20F, -9.38F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 60
		bodyModel[67].setRotationPoint(-24F, -20F, 6.38F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 35
		bodyModel[68].setRotationPoint(-26F, -1F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 36
		bodyModel[69].setRotationPoint(-26F, -1F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[70].setRotationPoint(25.5F, -1F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[71].setRotationPoint(25.5F, -1F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[72].setRotationPoint(-25F, 0F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[73].setRotationPoint(-24F, -5F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[74].setRotationPoint(-24F, -5F, 7.5F);

		bodyModel[75].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[75].setRotationPoint(-24.5F, -6F, 7.75F);

		bodyModel[76].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[76].setRotationPoint(-25.5F, -6F, 7.75F);

		bodyModel[77].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[77].setRotationPoint(-24.5F, -6F, -7.75F);

		bodyModel[78].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[78].setRotationPoint(-25.5F, -6F, -7.75F);

		bodyModel[79].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[79].setRotationPoint(-23.5F, -10.5F, 0F);

		bodyModel[80].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[80].setRotationPoint(-24.5F, -10.5F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 52
		bodyModel[81].setRotationPoint(-8.5F, -13F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 52
		bodyModel[82].setRotationPoint(-14.5F, -13F, 9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[83].setRotationPoint(-8.5F, -13F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 0, 7, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[84].setRotationPoint(-14.5F, -13F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 52
		bodyModel[85].setRotationPoint(6.5F, -2.5F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 52
		bodyModel[86].setRotationPoint(19.5F, -2.5F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[87].setRotationPoint(6.5F, -2.5F, -10.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[88].setRotationPoint(19.5F, -2.5F, -10.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[89].setRotationPoint(25F, -2.5F, -5.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[90].setRotationPoint(25F, -2.5F, 5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[91].setRotationPoint(-6F, 5F, -11.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 0
		bodyModel[92].setRotationPoint(-6F, 5F, 9.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[93].setRotationPoint(-6F, 2F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[94].setRotationPoint(-6F, 2F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[95].setRotationPoint(-1F, 2F, 9F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[96].setRotationPoint(-1F, 2F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 10, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[97].setRotationPoint(8.5F, -4F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[98].setRotationPoint(25F, 0F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[99].setRotationPoint(25F, 0F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[100].setRotationPoint(19F, -3F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 0, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[101].setRotationPoint(-22F, 4F, -7F);
		bodyModel[101].rotateAngleZ = -0.06981317F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 0, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[102].setRotationPoint(22F, 4F, -7F);
		bodyModel[102].rotateAngleZ = 0.06981317F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 10, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[103].setRotationPoint(20F, -13F, -2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 10, 0, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[104].setRotationPoint(20F, -13F, 2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 0, 10, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 0
		bodyModel[105].setRotationPoint(24F, -13F, -2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Box 0
		bodyModel[106].setRotationPoint(19.8F, -11F, 0.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[107].setRotationPoint(19.8F, -11F, -0.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[108].setRotationPoint(19.8F, -11F, -1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		bodyModel[109].setRotationPoint(15.96F, -13F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 13, 2, 4, 0F,-1F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		bodyModel[110].setRotationPoint(8F, -3F, -2F);
		bodyModel[110].rotateAngleZ = 0.89884456F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F,0F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1.25F, 0F, -0.3F, -1.25F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 0
		bodyModel[111].setRotationPoint(9.5F, -1.8F, -2F);
		bodyModel[111].rotateAngleZ = 0.72431164F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[112].setRotationPoint(-7F, -2F, -1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 9, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[113].setRotationPoint(-15F, -12F, 2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 14, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[114].setRotationPoint(-22F, -3F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 0F, -0.75F, -3F, 0F, -0.75F, -3F, -3F, 0F, -3F, -3F); // Box 0
		bodyModel[115].setRotationPoint(-15.25F, -12F, 2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[116].setRotationPoint(-22F, -7F, -7.25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 2
		bodyModel[117].setRotationPoint(-22F, -13F, -8.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[118].setRotationPoint(-22F, -7F, 2.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		bodyModel[119].setRotationPoint(-22F, -13F, 7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[120].setRotationPoint(-16.5F, -6.5F, 3.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		bodyModel[121].setRotationPoint(-13.5F, -6.5F, -7.25F);

		bodyModel[122].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[122].setRotationPoint(25F, -3F, 7.75F);

		bodyModel[123].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[123].setRotationPoint(25F, -3F, -7.75F);

		bodyModel[124].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[124].setRotationPoint(25F, -6F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[125].setRotationPoint(24.5F, -5.5F, -0.25F);

		bodyModel[126].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[126].setRotationPoint(24.6F, -3F, 7.75F);

		bodyModel[127].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[127].setRotationPoint(24.6F, -3F, -7.75F);

		bodyModel[128].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[128].setRotationPoint(24.6F, -6F, 0F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[129].setRotationPoint(-23F, -5F, -9F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Box 130
		bodyModel[130].setRotationPoint(-23F, -5F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 2, 7, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[131].setRotationPoint(8.5F, -6F, 2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[132].setRotationPoint(-23F, -17F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
		bodyModel[133].setRotationPoint(-23F, -17F, 8F);
	}
}