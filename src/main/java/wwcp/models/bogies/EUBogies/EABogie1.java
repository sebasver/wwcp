//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.10.2021 - 16:15:52
// Last changed on: 31.10.2021 - 16:15:52

package wwcp.models.bogies.EUBogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class EABogie1 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public EABogie1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[113];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 77
		bodyModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 92
		bodyModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 93
		bodyModel[9] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 94
		bodyModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 95
		bodyModel[11] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 77
		bodyModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 92
		bodyModel[13] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 93
		bodyModel[14] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 94
		bodyModel[15] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 95
		bodyModel[16] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 4
		bodyModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 4
		bodyModel[19] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 4
		bodyModel[20] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 4
		bodyModel[21] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 4
		bodyModel[22] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 4
		bodyModel[23] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 4
		bodyModel[24] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 4
		bodyModel[25] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 4
		bodyModel[28] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 6
		bodyModel[30] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 4
		bodyModel[31] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 4
		bodyModel[32] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 4
		bodyModel[33] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 4
		bodyModel[34] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 4
		bodyModel[35] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 50
		bodyModel[36] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 53
		bodyModel[37] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 69
		bodyModel[38] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 56
		bodyModel[39] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 56
		bodyModel[40] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 56
		bodyModel[42] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 56
		bodyModel[43] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 53
		bodyModel[45] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 56
		bodyModel[46] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 56
		bodyModel[47] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 56
		bodyModel[49] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 56
		bodyModel[51] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 50
		bodyModel[52] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 53
		bodyModel[55] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 4
		bodyModel[56] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 4
		bodyModel[57] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 50
		bodyModel[58] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 53
		bodyModel[59] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 69
		bodyModel[60] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 56
		bodyModel[61] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 56
		bodyModel[62] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 56
		bodyModel[63] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 56
		bodyModel[64] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 56
		bodyModel[65] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 56
		bodyModel[66] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 53
		bodyModel[67] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 56
		bodyModel[68] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 56
		bodyModel[69] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 56
		bodyModel[70] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 56
		bodyModel[71] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 56
		bodyModel[72] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 56
		bodyModel[73] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 50
		bodyModel[74] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 53
		bodyModel[75] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 69
		bodyModel[76] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 53
		bodyModel[77] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 92
		bodyModel[79] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 93
		bodyModel[80] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 94
		bodyModel[81] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 95
		bodyModel[82] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 77
		bodyModel[83] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 92
		bodyModel[84] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 93
		bodyModel[85] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 94
		bodyModel[86] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 95
		bodyModel[87] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 4
		bodyModel[88] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 4
		bodyModel[89] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 4
		bodyModel[90] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 4
		bodyModel[91] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 4
		bodyModel[92] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 4
		bodyModel[93] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 4
		bodyModel[94] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 4
		bodyModel[95] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 4
		bodyModel[96] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 4
		bodyModel[97] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 4
		bodyModel[98] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 4
		bodyModel[99] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		bodyModel[100] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 4
		bodyModel[101] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 4
		bodyModel[102] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 4
		bodyModel[103] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 4
		bodyModel[104] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 4
		bodyModel[105] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 4
		bodyModel[106] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 4
		bodyModel[107] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 4
		bodyModel[108] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 4
		bodyModel[109] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 4
		bodyModel[110] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 4
		bodyModel[111] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 134
		bodyModel[112] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 134

		bodyModel[0].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(6.5F, 0F, 6F);

		bodyModel[1].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[1].setRotationPoint(-16F, 0F, 6F);

		bodyModel[2].addBox(0F, 0F, 0F, 39, 2, 1, 0F); // Box 4
		bodyModel[2].setRotationPoint(-19F, 0.75F, 6.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(3.5F, 2.75F, 6.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-7.5F, 2.75F, 6.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[5].setRotationPoint(-3.5F, 2.75F, 6.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[6].setRotationPoint(-2.2F, 0.5F, 7.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 92
		bodyModel[7].setRotationPoint(-2.7F, 0.7F, 7.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 93
		bodyModel[8].setRotationPoint(-2.7F, 1.6F, 7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 94
		bodyModel[9].setRotationPoint(-2.7F, 2.45F, 7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[10].setRotationPoint(-2.7F, 3.25F, 7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[11].setRotationPoint(1F, 0.5F, 7.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 92
		bodyModel[12].setRotationPoint(0.5F, 0.7F, 7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 93
		bodyModel[13].setRotationPoint(0.5F, 1.6F, 7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 94
		bodyModel[14].setRotationPoint(0.5F, 2.45F, 7.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[15].setRotationPoint(0.5F, 3.25F, 7.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 4
		bodyModel[16].setRotationPoint(-3.5F, 4.5F, 6.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 4
		bodyModel[17].setRotationPoint(-3.5F, 3.75F, 6.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 4
		bodyModel[18].setRotationPoint(2.5F, 2F, 7.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 4
		bodyModel[19].setRotationPoint(-3.5F, 2F, 7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[20].setRotationPoint(-3F, 5F, 6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[21].setRotationPoint(1F, 6F, 6.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[22].setRotationPoint(-3F, 6F, 6.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[23].setRotationPoint(2F, 7F, 6.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[24].setRotationPoint(-3F, 7F, 6.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[25].setRotationPoint(6.5F, 0F, -6F);

		bodyModel[26].addBox(0F, 0F, 0F, 10, 10, 0, 0F); // Box 0
		bodyModel[26].setRotationPoint(-16F, 0F, -6F);

		bodyModel[27].addBox(0F, 0F, 0F, 39, 2, 1, 0F); // Box 4
		bodyModel[27].setRotationPoint(-19F, 0.75F, -7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[28].setRotationPoint(3.5F, 2.75F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 6
		bodyModel[29].setRotationPoint(-7.5F, 2.75F, -7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[30].setRotationPoint(-3.5F, 2.75F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
		bodyModel[31].setRotationPoint(-3.5F, 4.5F, -9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 4
		bodyModel[32].setRotationPoint(-3.5F, 3.75F, -7.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 4
		bodyModel[33].setRotationPoint(-19F, 0.75F, -6.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 4
		bodyModel[34].setRotationPoint(18F, 0.75F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 15, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[35].setRotationPoint(4.25F, 7.5F, 6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[36].setRotationPoint(4.25F, 3F, 6.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[37].setRotationPoint(6F, 4.25F, 6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[38].setRotationPoint(5F, 2.75F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 56
		bodyModel[39].setRotationPoint(5.5F, 2.75F, 5.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[40].setRotationPoint(5F, 3.75F, 5.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[41].setRotationPoint(17F, 2.75F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[42].setRotationPoint(16.5F, 2.75F, 5.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 56
		bodyModel[43].setRotationPoint(17F, 3.75F, 5.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[44].setRotationPoint(18.25F, 3F, 6.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[45].setRotationPoint(-17.5F, 2.75F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 56
		bodyModel[46].setRotationPoint(-17F, 2.75F, 5.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[47].setRotationPoint(-17.5F, 3.75F, 5.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[48].setRotationPoint(-5.5F, 2.75F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[49].setRotationPoint(-6F, 2.75F, 5.25F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 56
		bodyModel[50].setRotationPoint(-5.5F, 3.75F, 5.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 15, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[51].setRotationPoint(-18.75F, 7.5F, 6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[52].setRotationPoint(-4.75F, 3F, 6.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[53].setRotationPoint(-9.5F, 4.25F, 6.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[54].setRotationPoint(-18.75F, 3F, 6.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[55].setRotationPoint(-3F, 7.5F, 7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[56].setRotationPoint(-3F, 6.5F, 7.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 15, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[57].setRotationPoint(4.25F, 7.5F, -6.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[58].setRotationPoint(4.25F, 3F, -6.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[59].setRotationPoint(6F, 4.25F, -6.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 56
		bodyModel[60].setRotationPoint(5F, 2.75F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 56
		bodyModel[61].setRotationPoint(5.5F, 2.75F, -6.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[62].setRotationPoint(5F, 3.75F, -6.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 56
		bodyModel[63].setRotationPoint(17F, 2.75F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[64].setRotationPoint(16.5F, 2.75F, -6.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 56
		bodyModel[65].setRotationPoint(17F, 3.75F, -6.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[66].setRotationPoint(18.25F, 3F, -6.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 56
		bodyModel[67].setRotationPoint(-17.5F, 2.75F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 56
		bodyModel[68].setRotationPoint(-17F, 2.75F, -6.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[69].setRotationPoint(-17.5F, 3.75F, -6.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 56
		bodyModel[70].setRotationPoint(-5.5F, 2.75F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[71].setRotationPoint(-6F, 2.75F, -6.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 56
		bodyModel[72].setRotationPoint(-5.5F, 3.75F, -6.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 15, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[73].setRotationPoint(-18.75F, 7.5F, -6.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[74].setRotationPoint(-4.75F, 3F, -6.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[75].setRotationPoint(-9.5F, 4.25F, -6.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 5, 0, 0F,-1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[76].setRotationPoint(-18.75F, 3F, -6.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[77].setRotationPoint(-2.2F, 0.5F, -8.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[78].setRotationPoint(-2.7F, 0.7F, -9.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[79].setRotationPoint(-2.7F, 1.6F, -9.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[80].setRotationPoint(-2.7F, 2.45F, -9.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[81].setRotationPoint(-2.7F, 3.25F, -9.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[82].setRotationPoint(1F, 0.5F, -8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[83].setRotationPoint(0.5F, 0.7F, -9.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 93
		bodyModel[84].setRotationPoint(0.5F, 1.6F, -9.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[85].setRotationPoint(0.5F, 2.45F, -9.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[86].setRotationPoint(0.5F, 3.25F, -9.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 4
		bodyModel[87].setRotationPoint(2.5F, 2F, -9.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
		bodyModel[88].setRotationPoint(-3.5F, 2F, -9.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[89].setRotationPoint(10F, 4.75F, 6.25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 4
		bodyModel[90].setRotationPoint(10F, 5.75F, 6.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[91].setRotationPoint(10F, 3.75F, 6.25F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[92].setRotationPoint(-12.5F, 4.75F, 6.25F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 4
		bodyModel[93].setRotationPoint(-12.5F, 5.75F, 6.25F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[94].setRotationPoint(-12.5F, 3.75F, 6.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[95].setRotationPoint(-11.5F, 2.75F, 6.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 4
		bodyModel[96].setRotationPoint(11F, 2.75F, 6.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[97].setRotationPoint(10F, 4.75F, -7.25F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[98].setRotationPoint(10F, 5.75F, -7.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[99].setRotationPoint(10F, 3.75F, -7.25F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[100].setRotationPoint(-12.5F, 4.75F, -7.25F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[101].setRotationPoint(-12.5F, 5.75F, -7.25F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[102].setRotationPoint(-12.5F, 3.75F, -7.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[103].setRotationPoint(-11.5F, 2.75F, -7.25F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[104].setRotationPoint(11F, 2.75F, -7.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 4
		bodyModel[105].setRotationPoint(10.5F, 4.25F, -6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 4
		bodyModel[106].setRotationPoint(-12F, 4.25F, -6F);

		bodyModel[107].addBox(0F, 0F, 0F, 7, 6, 13, 0F); // Box 4
		bodyModel[107].setRotationPoint(-3.5F, 0F, -6.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 4
		bodyModel[108].setRotationPoint(-3.5F, 0F, 6.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 4
		bodyModel[109].setRotationPoint(-3.5F, 0F, -9.5F);

		bodyModel[110].addBox(0F, 0F, 0F, 11, 4, 10, 0F); // Box 4
		bodyModel[110].setRotationPoint(-14.5F, 3F, -5F);

		bodyModel[111].addBox(0F, 0F, 0F, 11, 4, 10, 0F); // Box 134
		bodyModel[111].setRotationPoint(3.5F, 3F, -5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[112].setRotationPoint(-1F, -1F, -1F);
	}
}