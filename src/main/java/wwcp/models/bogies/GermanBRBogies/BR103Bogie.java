//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.08.2021 - 15:06:03
// Last changed on: 29.08.2021 - 15:06:03

package wwcp.models.bogies.GermanBRBogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BR103Bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public BR103Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[124];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 398
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 20
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 45
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 47
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 60
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 68
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 97
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 105
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 107
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 108
		bodyModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 109
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 111
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 112
		bodyModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 113
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 114
		bodyModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 115
		bodyModel[18] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 116
		bodyModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 7
		bodyModel[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 68
		bodyModel[21] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 97
		bodyModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 45
		bodyModel[23] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 108
		bodyModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 107
		bodyModel[25] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 109
		bodyModel[26] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 20
		bodyModel[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 20
		bodyModel[28] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		bodyModel[29] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 20
		bodyModel[30] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 20
		bodyModel[31] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 20
		bodyModel[32] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 69
		bodyModel[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 20
		bodyModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 69
		bodyModel[35] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 20
		bodyModel[36] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 108
		bodyModel[37] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 108
		bodyModel[38] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 108
		bodyModel[39] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 108
		bodyModel[40] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 20
		bodyModel[41] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 108
		bodyModel[42] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 108
		bodyModel[43] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 108
		bodyModel[44] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 108
		bodyModel[45] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 108
		bodyModel[46] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 108
		bodyModel[47] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 108
		bodyModel[48] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 108
		bodyModel[49] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 108
		bodyModel[50] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 108
		bodyModel[51] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 108
		bodyModel[52] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 108
		bodyModel[53] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 7
		bodyModel[54] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 20
		bodyModel[55] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 111
		bodyModel[56] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 112
		bodyModel[57] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 113
		bodyModel[58] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 114
		bodyModel[59] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 115
		bodyModel[60] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 20
		bodyModel[61] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 47
		bodyModel[62] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 20
		bodyModel[63] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 20
		bodyModel[64] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 108
		bodyModel[65] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 108
		bodyModel[66] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 20
		bodyModel[67] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 20
		bodyModel[68] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 20
		bodyModel[69] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 20
		bodyModel[70] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 20
		bodyModel[71] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 20
		bodyModel[72] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 69
		bodyModel[73] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 20
		bodyModel[74] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 69
		bodyModel[75] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 20
		bodyModel[76] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 20
		bodyModel[77] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 20
		bodyModel[78] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 20
		bodyModel[79] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 20
		bodyModel[80] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 20
		bodyModel[81] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 20
		bodyModel[82] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 20
		bodyModel[83] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 69
		bodyModel[84] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 69
		bodyModel[85] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 20
		bodyModel[86] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 47
		bodyModel[87] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 20
		bodyModel[88] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 20
		bodyModel[89] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 20
		bodyModel[90] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 20
		bodyModel[91] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 20
		bodyModel[92] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 20
		bodyModel[93] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 69
		bodyModel[94] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 20
		bodyModel[95] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 20
		bodyModel[96] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 20
		bodyModel[97] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 20
		bodyModel[98] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 20
		bodyModel[99] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 47
		bodyModel[100] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 20
		bodyModel[101] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 20
		bodyModel[102] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 20
		bodyModel[103] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 20
		bodyModel[104] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 20
		bodyModel[105] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 20
		bodyModel[106] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 20
		bodyModel[107] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 20
		bodyModel[108] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 69
		bodyModel[109] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 20
		bodyModel[110] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 69
		bodyModel[111] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 20
		bodyModel[112] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 20
		bodyModel[113] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 20
		bodyModel[114] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 20
		bodyModel[115] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 20
		bodyModel[116] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 20
		bodyModel[117] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 20
		bodyModel[118] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 20
		bodyModel[119] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 69
		bodyModel[120] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 69
		bodyModel[121] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 69
		bodyModel[122] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 398
		bodyModel[123] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 398

		bodyModel[0].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 38
		bodyModel[0].setRotationPoint(0F, 5.5F, -5.95F);

		bodyModel[1].addBox(-0.5F, -0.5F, 0F, 7, 6, 4, 0F); // Box 398
		bodyModel[1].setRotationPoint(-3F, 0.5F, -2F);

		bodyModel[2].addBox(-0.5F, -0.5F, 0F, 1, 1, 17, 0F); // Box 7
		bodyModel[2].setRotationPoint(-20F, 5.5F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[3].setRotationPoint(-26F, 4F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[4].setRotationPoint(-11F, 2F, -6.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[5].setRotationPoint(-26F, 2F, -7.5F);

		bodyModel[6].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 60
		bodyModel[6].setRotationPoint(-0.5F, 5F, -5.9F);

		bodyModel[7].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 68
		bodyModel[7].setRotationPoint(-20F, 5.5F, -5.95F);

		bodyModel[8].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 97
		bodyModel[8].setRotationPoint(-20F, 5.5F, 5.95F);

		bodyModel[9].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 105
		bodyModel[9].setRotationPoint(-0.5F, 5F, 4.9F);

		bodyModel[10].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 107
		bodyModel[10].setRotationPoint(-20.5F, 5F, -5.9F);

		bodyModel[11].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 108
		bodyModel[11].setRotationPoint(-24.5F, 2F, -5.9F);

		bodyModel[12].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 109
		bodyModel[12].setRotationPoint(-20.5F, 5F, 4.9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[13].setRotationPoint(-27F, 3F, 2.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[14].setRotationPoint(-27F, 4F, 4.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[15].setRotationPoint(-27F, 3F, -2.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 114
		bodyModel[16].setRotationPoint(-27F, 3F, -4.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[17].setRotationPoint(-27F, 4F, -6.5F);

		bodyModel[18].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 116
		bodyModel[18].setRotationPoint(0F, 5.5F, 5.95F);

		bodyModel[19].addBox(-0.5F, -0.5F, 0F, 1, 1, 17, 0F); // Box 7
		bodyModel[19].setRotationPoint(20F, 5.5F, -8.5F);

		bodyModel[20].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 68
		bodyModel[20].setRotationPoint(20F, 5.5F, -5.95F);

		bodyModel[21].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 97
		bodyModel[21].setRotationPoint(20F, 5.5F, 5.95F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[22].setRotationPoint(9F, 2F, -6.5F);

		bodyModel[23].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 108
		bodyModel[23].setRotationPoint(-24.5F, 2F, 4.9F);

		bodyModel[24].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 107
		bodyModel[24].setRotationPoint(19.5F, 5F, -5.9F);

		bodyModel[25].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 109
		bodyModel[25].setRotationPoint(19.5F, 5F, 4.9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[26].setRotationPoint(-24F, 8F, -7.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 20
		bodyModel[27].setRotationPoint(-20F, 8F, -7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 20
		bodyModel[28].setRotationPoint(-20.5F, 8F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[29].setRotationPoint(-24.5F, 6F, -7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 20
		bodyModel[30].setRotationPoint(-16.5F, 6F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[31].setRotationPoint(-24F, 4F, -7.5F);

		bodyModel[32].addShapeBox(-0.5F, -0.5F, 0F, 7, 3, 1, 0F,-0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 69
		bodyModel[32].setRotationPoint(-23F, 4F, -7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[33].setRotationPoint(-16F, 4F, -7.5F);

		bodyModel[34].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,-1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 69
		bodyModel[34].setRotationPoint(-22F, 7F, -7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[35].setRotationPoint(-27F, 4F, -7.5F);

		bodyModel[36].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[36].setRotationPoint(-18.5F, 2F, -5.9F);

		bodyModel[37].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[37].setRotationPoint(-18.5F, 2F, 4.9F);

		bodyModel[38].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 108
		bodyModel[38].setRotationPoint(-14.5F, 2F, 4.9F);

		bodyModel[39].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 108
		bodyModel[39].setRotationPoint(-14.5F, 2F, -5.9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[40].setRotationPoint(-5F, 4F, -7.5F);

		bodyModel[41].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 108
		bodyModel[41].setRotationPoint(-4.5F, 2F, 4.9F);

		bodyModel[42].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 108
		bodyModel[42].setRotationPoint(-8.5F, 2F, 4.9F);

		bodyModel[43].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 108
		bodyModel[43].setRotationPoint(-4.5F, 2F, -5.9F);

		bodyModel[44].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 108
		bodyModel[44].setRotationPoint(-8.5F, 2F, -5.9F);

		bodyModel[45].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[45].setRotationPoint(1.5F, 2F, -5.9F);

		bodyModel[46].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[46].setRotationPoint(1.5F, 2F, 4.9F);

		bodyModel[47].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 108
		bodyModel[47].setRotationPoint(5.5F, 2F, 4.9F);

		bodyModel[48].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 108
		bodyModel[48].setRotationPoint(5.5F, 2F, -5.9F);

		bodyModel[49].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 108
		bodyModel[49].setRotationPoint(15.5F, 2F, 4.9F);

		bodyModel[50].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 108
		bodyModel[50].setRotationPoint(11.5F, 2F, 4.9F);

		bodyModel[51].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Box 108
		bodyModel[51].setRotationPoint(15.5F, 2F, -5.9F);

		bodyModel[52].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 108
		bodyModel[52].setRotationPoint(11.5F, 2F, -5.9F);

		bodyModel[53].addBox(-0.5F, -0.5F, 0F, 1, 1, 17, 0F); // Box 7
		bodyModel[53].setRotationPoint(0F, 5.5F, -8.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[54].setRotationPoint(24F, 4F, -7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[55].setRotationPoint(25F, 3F, 2.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[56].setRotationPoint(25F, 4F, 4.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[57].setRotationPoint(25F, 3F, -2.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 114
		bodyModel[58].setRotationPoint(25F, 3F, -4.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[59].setRotationPoint(25F, 4F, -6.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[60].setRotationPoint(26F, 4F, -7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[61].setRotationPoint(11F, 2F, -7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[62].setRotationPoint(-15F, 5F, -7.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[63].setRotationPoint(-16F, 2F, -7.5F);

		bodyModel[64].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[64].setRotationPoint(21.5F, 2F, -5.9F);

		bodyModel[65].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F,0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[65].setRotationPoint(21.5F, 2F, 4.9F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[66].setRotationPoint(-4F, 8F, -7.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 20
		bodyModel[67].setRotationPoint(0F, 8F, -7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 20
		bodyModel[68].setRotationPoint(-0.5F, 8F, -7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[69].setRotationPoint(-4.5F, 6F, -7.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 20
		bodyModel[70].setRotationPoint(3.5F, 6F, -7.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[71].setRotationPoint(-4F, 4F, -7.5F);

		bodyModel[72].addShapeBox(-0.5F, -0.5F, 0F, 7, 3, 1, 0F,-0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 69
		bodyModel[72].setRotationPoint(-3F, 4F, -7.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[73].setRotationPoint(4F, 4F, -7.5F);

		bodyModel[74].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,-1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 69
		bodyModel[74].setRotationPoint(-2F, 7F, -7.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[75].setRotationPoint(5F, 5F, -7.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[76].setRotationPoint(15F, 4F, -7.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[77].setRotationPoint(16F, 8F, -7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 20
		bodyModel[78].setRotationPoint(20F, 8F, -7.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 20
		bodyModel[79].setRotationPoint(19.5F, 8F, -7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[80].setRotationPoint(15.5F, 6F, -7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 20
		bodyModel[81].setRotationPoint(23.5F, 6F, -7.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[82].setRotationPoint(16F, 4F, -7.5F);

		bodyModel[83].addShapeBox(-0.5F, -0.5F, 0F, 7, 3, 1, 0F,-0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Box 69
		bodyModel[83].setRotationPoint(17F, 4F, -7.5F);

		bodyModel[84].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,-1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 69
		bodyModel[84].setRotationPoint(18F, 7F, -7.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[85].setRotationPoint(-26F, 4F, 6.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 47
		bodyModel[86].setRotationPoint(-26F, 2F, 6.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[87].setRotationPoint(-24F, 8F, 6.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 20
		bodyModel[88].setRotationPoint(-20F, 8F, 6.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 20
		bodyModel[89].setRotationPoint(-20.5F, 8F, 6.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[90].setRotationPoint(-24.5F, 6F, 6.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 20
		bodyModel[91].setRotationPoint(-16.5F, 6F, 6.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[92].setRotationPoint(-24F, 4F, 6.5F);

		bodyModel[93].addShapeBox(-0.5F, -0.5F, 0F, 7, 3, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Box 69
		bodyModel[93].setRotationPoint(-23F, 4F, 6.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[94].setRotationPoint(-16F, 4F, 6.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F); // Box 20
		bodyModel[95].setRotationPoint(-27F, 4F, 6.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[96].setRotationPoint(-5F, 4F, 6.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[97].setRotationPoint(24F, 4F, 6.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 20
		bodyModel[98].setRotationPoint(26F, 4F, 6.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 13, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 47
		bodyModel[99].setRotationPoint(11F, 2F, 6.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[100].setRotationPoint(-15F, 5F, 6.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[101].setRotationPoint(-16F, 2F, 6.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[102].setRotationPoint(-4F, 8F, 6.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 20
		bodyModel[103].setRotationPoint(0F, 8F, 6.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 20
		bodyModel[104].setRotationPoint(-0.5F, 8F, 6.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[105].setRotationPoint(-4.5F, 6F, 6.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 20
		bodyModel[106].setRotationPoint(3.5F, 6F, 6.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[107].setRotationPoint(-4F, 4F, 6.5F);

		bodyModel[108].addShapeBox(-0.5F, -0.5F, 0F, 7, 3, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Box 69
		bodyModel[108].setRotationPoint(-3F, 4F, 6.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[109].setRotationPoint(4F, 4F, 6.5F);

		bodyModel[110].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 69
		bodyModel[110].setRotationPoint(-2F, 7F, 6.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[111].setRotationPoint(5F, 5F, 6.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[112].setRotationPoint(15F, 4F, 6.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[113].setRotationPoint(16F, 8F, 6.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 20
		bodyModel[114].setRotationPoint(20F, 8F, 6.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 20
		bodyModel[115].setRotationPoint(19.5F, 8F, 6.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 20
		bodyModel[116].setRotationPoint(15.5F, 6F, 6.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 20
		bodyModel[117].setRotationPoint(23.5F, 6F, 6.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[118].setRotationPoint(16F, 4F, 6.5F);

		bodyModel[119].addShapeBox(-0.5F, -0.5F, 0F, 7, 3, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F); // Box 69
		bodyModel[119].setRotationPoint(17F, 4F, 6.5F);

		bodyModel[120].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 69
		bodyModel[120].setRotationPoint(18F, 7F, 6.5F);

		bodyModel[121].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 69
		bodyModel[121].setRotationPoint(-22F, 7F, 6.5F);

		bodyModel[122].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[122].setRotationPoint(4F, 2.5F, -1.5F);

		bodyModel[123].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 398
		bodyModel[123].setRotationPoint(-8F, 2.5F, -1.5F);
	}
}