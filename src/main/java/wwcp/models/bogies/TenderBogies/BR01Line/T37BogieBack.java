//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.04.2019 - 22:52:50
// Last changed on: 07.04.2019 - 22:52:50

package wwcp.models.bogies.TenderBogies.BR01Line; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class T37BogieBack extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public T37BogieBack() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[95];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 31
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 64
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 67
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 31
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 64
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 102
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 103
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 104
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 105
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 112
		bodyModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 113
		bodyModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 113
		bodyModel[17] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 94
		bodyModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 95
		bodyModel[19] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 113
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 113
		bodyModel[21] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 113
		bodyModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 95
		bodyModel[23] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 95
		bodyModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 95
		bodyModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 113
		bodyModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 94
		bodyModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 95
		bodyModel[28] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 113
		bodyModel[29] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 113
		bodyModel[30] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 113
		bodyModel[31] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 95
		bodyModel[32] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 95
		bodyModel[33] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 117
		bodyModel[34] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 118
		bodyModel[35] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 119
		bodyModel[36] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 120
		bodyModel[37] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 121
		bodyModel[38] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 122
		bodyModel[39] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 123
		bodyModel[40] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 126
		bodyModel[41] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 127
		bodyModel[42] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 128
		bodyModel[43] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 129
		bodyModel[44] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 130
		bodyModel[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 131
		bodyModel[46] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 132
		bodyModel[47] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 133
		bodyModel[48] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 95
		bodyModel[49] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 95
		bodyModel[50] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 95
		bodyModel[51] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 28
		bodyModel[52] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 64
		bodyModel[53] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 64
		bodyModel[54] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 69
		bodyModel[55] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 70
		bodyModel[56] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 64
		bodyModel[57] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 64
		bodyModel[58] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 68
		bodyModel[59] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 117
		bodyModel[61] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 33
		bodyModel[62] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 64
		bodyModel[63] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 33
		bodyModel[65] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 64
		bodyModel[66] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 64
		bodyModel[67] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 33
		bodyModel[68] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 64
		bodyModel[69] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 64
		bodyModel[70] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 73
		bodyModel[72] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 74
		bodyModel[73] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 75
		bodyModel[74] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 76
		bodyModel[75] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 77
		bodyModel[76] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 78
		bodyModel[77] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 79
		bodyModel[78] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 80
		bodyModel[79] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 95
		bodyModel[80] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 95
		bodyModel[81] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 83
		bodyModel[82] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 84
		bodyModel[83] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 64
		bodyModel[84] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 68
		bodyModel[85] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 64
		bodyModel[86] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 70
		bodyModel[87] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 64
		bodyModel[88] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 70
		bodyModel[89] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 70
		bodyModel[90] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 92
		bodyModel[91] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 338
		bodyModel[92] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 95
		bodyModel[93] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 64
		bodyModel[94] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 64

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[0].setRotationPoint(-0.5F, 6F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[1].setRotationPoint(10.5F, 6F, -7F);

		bodyModel[2].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[2].setRotationPoint(0F, 6.5F, 5.95F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[3].setRotationPoint(11F, 6.5F, 5.95F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[4].setRotationPoint(-2.5F, 3F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 67
		bodyModel[5].setRotationPoint(8.5F, 3F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[6].setRotationPoint(-11.5F, 6F, -7F);

		bodyModel[7].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[7].setRotationPoint(-11F, 6.5F, 5.95F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[8].setRotationPoint(-13.5F, 3F, 6F);

		bodyModel[9].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[9].setRotationPoint(0F, 6.5F, -5.95F);

		bodyModel[10].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[10].setRotationPoint(11F, 6.5F, -5.95F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[11].setRotationPoint(-2.5F, 3F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[12].setRotationPoint(8.5F, 3F, -7F);

		bodyModel[13].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[13].setRotationPoint(-11F, 6.5F, -5.95F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[14].setRotationPoint(-13.5F, 3F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[15].setRotationPoint(-1.5F, 3F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[16].setRotationPoint(2.5F, 3F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[17].setRotationPoint(5F, 5F, -7.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[18].setRotationPoint(4F, 4.7F, -7.85F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[19].setRotationPoint(2.5F, 4F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[20].setRotationPoint(4.5F, 3F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[21].setRotationPoint(7.5F, 3F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[22].setRotationPoint(3.75F, 3.7F, -7.85F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[23].setRotationPoint(6.75F, 3.7F, -7.85F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 95
		bodyModel[24].setRotationPoint(6.75F, 2.7F, -7.85F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[25].setRotationPoint(-8.5F, 3F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[26].setRotationPoint(-6F, 5F, -7.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[27].setRotationPoint(-7F, 4.7F, -7.85F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[28].setRotationPoint(-8.5F, 4F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[29].setRotationPoint(-6.5F, 3F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[30].setRotationPoint(-3.5F, 3F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[31].setRotationPoint(-7.25F, 3.7F, -7.85F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[32].setRotationPoint(-4.25F, 3.7F, -7.85F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 117
		bodyModel[33].setRotationPoint(2.5F, 3F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[34].setRotationPoint(5F, 5F, 6.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 119
		bodyModel[35].setRotationPoint(4F, 4.7F, 6.85F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 120
		bodyModel[36].setRotationPoint(2.5F, 4F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 121
		bodyModel[37].setRotationPoint(4.5F, 3F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		bodyModel[38].setRotationPoint(3.75F, 3.7F, 6.85F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 123
		bodyModel[39].setRotationPoint(6.75F, 3.7F, 6.85F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 126
		bodyModel[40].setRotationPoint(-8.5F, 3F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[41].setRotationPoint(-6F, 5F, 6.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[42].setRotationPoint(-7F, 4.7F, 6.85F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 129
		bodyModel[43].setRotationPoint(-8.5F, 4F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 130
		bodyModel[44].setRotationPoint(-6.5F, 3F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 131
		bodyModel[45].setRotationPoint(-3.5F, 3F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 132
		bodyModel[46].setRotationPoint(-7.25F, 3.7F, 6.85F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 133
		bodyModel[47].setRotationPoint(-4.25F, 3.7F, 6.85F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 95
		bodyModel[48].setRotationPoint(3.75F, 2.7F, -7.85F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 95
		bodyModel[49].setRotationPoint(-4.25F, 2.7F, -7.85F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 95
		bodyModel[50].setRotationPoint(-7.25F, 2.7F, -7.85F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[51].setRotationPoint(-7.5F, 3.7F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[52].setRotationPoint(13.5F, 7F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[53].setRotationPoint(13.5F, 3F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[54].setRotationPoint(13.5F, 7F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[55].setRotationPoint(13.5F, 3F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[56].setRotationPoint(14.5F, 3.5F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[57].setRotationPoint(-15.5F, 3F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[58].setRotationPoint(-15.5F, 3F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[59].setRotationPoint(-15.5F, 3.5F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 117
		bodyModel[60].setRotationPoint(7.5F, 3F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[61].setRotationPoint(-11.5F, 4F, 6.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[62].setRotationPoint(-12F, 5.5F, 6.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[63].setRotationPoint(-11.5F, 3.5F, 6.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[64].setRotationPoint(-0.5F, 4F, 6.25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[65].setRotationPoint(-1F, 5.5F, 6.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[66].setRotationPoint(-0.5F, 3.5F, 6.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[67].setRotationPoint(10.5F, 4F, 6.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[68].setRotationPoint(10F, 5.5F, 6.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[69].setRotationPoint(10.5F, 3.5F, 6.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 72
		bodyModel[70].setRotationPoint(-11.5F, 4F, -7.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[71].setRotationPoint(-12F, 5.5F, -7.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[72].setRotationPoint(-11.5F, 3.5F, -7.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75
		bodyModel[73].setRotationPoint(-0.5F, 4F, -7.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[74].setRotationPoint(-1F, 5.5F, -7.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[75].setRotationPoint(-0.5F, 3.5F, -7.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[76].setRotationPoint(10.5F, 4F, -7.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[77].setRotationPoint(10F, 5.5F, -7.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[78].setRotationPoint(10.5F, 3.5F, -7.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 95
		bodyModel[79].setRotationPoint(14F, 4F, -7.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[80].setRotationPoint(-15F, 4F, -7.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 83
		bodyModel[81].setRotationPoint(14F, 4F, 6.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 84
		bodyModel[82].setRotationPoint(-15F, 4F, 6.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[83].setRotationPoint(-15.5F, 8F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[84].setRotationPoint(-15.5F, 8F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[85].setRotationPoint(15.5F, 6F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[86].setRotationPoint(15.5F, 6F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[87].setRotationPoint(15.5F, 3F, 6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[88].setRotationPoint(15.5F, 3F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[89].setRotationPoint(17.5F, 3F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 92
		bodyModel[90].setRotationPoint(17.5F, 3F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 338
		bodyModel[91].setRotationPoint(17.5F, 7F, -6.25F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 95
		bodyModel[92].setRotationPoint(17.5F, 7F, 5.25F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[93].setRotationPoint(17.5F, 3F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[94].setRotationPoint(17.5F, 6F, -6F);
	}
}