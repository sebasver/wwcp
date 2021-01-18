//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.05.2019 - 12:40:47
// Last changed on: 10.05.2019 - 12:40:47

package wwcp.models.tenders.germanTenders; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class KabintenderT26 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public KabintenderT26() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[147];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 92
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 96
		bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 121
		bodyModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 124
		bodyModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 127
		bodyModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 129
		bodyModel[7] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 130
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box Left door
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 28
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 109
		bodyModel[11] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box Cargo
		bodyModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 113
		bodyModel[13] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 130
		bodyModel[14] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 131
		bodyModel[15] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 50
		bodyModel[16] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 103
		bodyModel[17] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 130
		bodyModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 300
		bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 103
		bodyModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 300
		bodyModel[21] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 300
		bodyModel[22] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 300
		bodyModel[23] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 119
		bodyModel[24] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 360
		bodyModel[25] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 361
		bodyModel[26] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 362
		bodyModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 363
		bodyModel[28] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 364
		bodyModel[29] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 365
		bodyModel[30] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 52
		bodyModel[31] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 52
		bodyModel[32] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 52
		bodyModel[33] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 52
		bodyModel[34] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 52
		bodyModel[36] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 52
		bodyModel[38] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 122
		bodyModel[41] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 122
		bodyModel[42] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 384
		bodyModel[43] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 103
		bodyModel[44] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 103
		bodyModel[45] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 366
		bodyModel[46] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 367
		bodyModel[47] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 90
		bodyModel[49] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 90
		bodyModel[50] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 90
		bodyModel[51] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 132
		bodyModel[52] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 109
		bodyModel[53] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 28
		bodyModel[54] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 92
		bodyModel[55] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 168
		bodyModel[56] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 92
		bodyModel[57] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 92
		bodyModel[58] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 166
		bodyModel[59] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 166
		bodyModel[60] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 324
		bodyModel[61] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 92
		bodyModel[62] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 92
		bodyModel[63] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 71
		bodyModel[64] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 73
		bodyModel[65] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 75
		bodyModel[66] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 76
		bodyModel[67] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 77
		bodyModel[68] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 78
		bodyModel[69] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 79
		bodyModel[70] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 96
		bodyModel[71] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 96
		bodyModel[72] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 96
		bodyModel[73] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 133
		bodyModel[74] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 72
		bodyModel[75] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 208
		bodyModel[76] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 92
		bodyModel[77] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 87
		bodyModel[78] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 87
		bodyModel[79] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 96
		bodyModel[80] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 96
		bodyModel[81] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 96
		bodyModel[82] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 96
		bodyModel[83] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 87
		bodyModel[86] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 96
		bodyModel[87] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 97
		bodyModel[88] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 98
		bodyModel[89] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 87
		bodyModel[90] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 97
		bodyModel[91] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 87
		bodyModel[92] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 87
		bodyModel[93] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 103
		bodyModel[94] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 103
		bodyModel[95] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 87
		bodyModel[96] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 103
		bodyModel[97] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 103
		bodyModel[98] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 103
		bodyModel[99] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 103
		bodyModel[100] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 110
		bodyModel[101] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 55
		bodyModel[102] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 56
		bodyModel[103] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 57
		bodyModel[104] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 58
		bodyModel[105] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 108
		bodyModel[106] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 108
		bodyModel[107] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 103
		bodyModel[108] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 110
		bodyModel[109] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 96
		bodyModel[110] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 111
		bodyModel[111] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 112
		bodyModel[112] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 360
		bodyModel[113] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 361
		bodyModel[114] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 362
		bodyModel[115] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 363
		bodyModel[116] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 364
		bodyModel[117] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 365
		bodyModel[118] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 119
		bodyModel[119] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 120
		bodyModel[120] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 121
		bodyModel[121] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 122
		bodyModel[122] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 123
		bodyModel[123] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 124
		bodyModel[124] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 127
		bodyModel[125] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 126
		bodyModel[126] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 127
		bodyModel[127] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 126
		bodyModel[128] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 127
		bodyModel[129] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 127
		bodyModel[130] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 127
		bodyModel[131] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 132
		bodyModel[132] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 133
		bodyModel[133] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 134
		bodyModel[134] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 135
		bodyModel[135] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 92
		bodyModel[136] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 92
		bodyModel[137] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 87
		bodyModel[138] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 87
		bodyModel[139] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 87
		bodyModel[140] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 90
		bodyModel[141] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 134
		bodyModel[142] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 87
		bodyModel[143] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 87
		bodyModel[144] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 87
		bodyModel[145] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 87
		bodyModel[146] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 87

		bodyModel[0].addShapeBox(0F, 0F, 0F, 36, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[0].setRotationPoint(-28F, 2F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 32, 16, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[1].setRotationPoint(-24F, -14F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[2].setRotationPoint(-23F, -22F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 10, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[3].setRotationPoint(30F, -8F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[4].setRotationPoint(7F, -22F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[5].setRotationPoint(-28F, -14F, -11F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 16, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[6].setRotationPoint(-28F, -14F, 5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[7].setRotationPoint(-33F, -2.1F, -10F);

		bodyModel[8].addShapeBox(-3F, 0F, -1F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box Left door
		bodyModel[8].setRotationPoint(-28F, -12F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[9].setRotationPoint(-16F, 3F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[10].setRotationPoint(27.5F, -14.25F, -10.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 27, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Cargo
		bodyModel[11].setRotationPoint(-20F, -20F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 7, 12, 0F,-2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[12].setRotationPoint(-23F, -21F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[13].setRotationPoint(27.5F, -14.25F, 8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 30, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[14].setRotationPoint(-23F, -22F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 50
		bodyModel[15].setRotationPoint(-28F, -3.1F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[16].setRotationPoint(-28.5F, -2F, -10.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 130
		bodyModel[17].setRotationPoint(-33F, -0.1F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 300
		bodyModel[18].setRotationPoint(-31.5F, -2F, -11.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[19].setRotationPoint(-32F, -2F, -10.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[20].setRotationPoint(-31.5F, 0.5F, -11.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[21].setRotationPoint(-31.5F, 3F, -11.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[22].setRotationPoint(-31.5F, 5.5F, -11.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 119
		bodyModel[23].setRotationPoint(31F, -11F, 3F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[24].setRotationPoint(-28.5F, -2F, 9.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[25].setRotationPoint(-31.5F, -2F, 9.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[26].setRotationPoint(-32F, -2F, 9.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 363
		bodyModel[27].setRotationPoint(-31.5F, 0.5F, 9.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 364
		bodyModel[28].setRotationPoint(-31.5F, 3F, 9.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 365
		bodyModel[29].setRotationPoint(-31.5F, 5.5F, 9.5F);

		bodyModel[30].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[30].setRotationPoint(30.25F, -14F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[31].setRotationPoint(30.35F, -14F, 0F);

		bodyModel[32].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[32].setRotationPoint(33.25F, -4F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[33].setRotationPoint(33.35F, -4F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[34].setRotationPoint(33.3F, -1.9F, 6F);
		bodyModel[34].rotateAngleZ = 1.57079633F;

		bodyModel[35].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[35].setRotationPoint(33F, -1.9F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[36].setRotationPoint(33.25F, -4F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[37].setRotationPoint(33.35F, -4F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[38].setRotationPoint(33.3F, -1.9F, -6F);
		bodyModel[38].rotateAngleZ = 1.57079633F;

		bodyModel[39].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[39].setRotationPoint(33F, -1.9F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[40].setRotationPoint(30F, -14F, -11F);
		bodyModel[40].rotateAngleZ = 0.03490659F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[41].setRotationPoint(30F, -14F, 8F);
		bodyModel[41].rotateAngleZ = 0.03490659F;

		bodyModel[42].addShapeBox(-3F, 0F, -1F, 3, 9, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[42].setRotationPoint(-28F, -12F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[43].setRotationPoint(-32F, -2F, -10.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[44].setRotationPoint(-28.5F, -2F, -10.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[45].setRotationPoint(-32F, -2F, 9.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[46].setRotationPoint(-28.5F, -2F, 9.25F);

		bodyModel[47].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[47].setRotationPoint(30F, -12.4F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[48].setRotationPoint(-29F, -7F, -6.2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F); // Box 90
		bodyModel[49].setRotationPoint(-28.5F, -8F, -5.95F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 90
		bodyModel[50].setRotationPoint(-29F, -5F, -5.2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 16, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F); // Box 132
		bodyModel[51].setRotationPoint(-28.34F, -8.8F, 1F);
		bodyModel[51].rotateAngleX = -0.20943951F;
		bodyModel[51].rotateAngleY = -1.50098316F;
		bodyModel[51].rotateAngleZ = 0.78539816F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[52].setRotationPoint(26.5F, -14.25F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[53].setRotationPoint(15F, 3F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[54].setRotationPoint(-24F, -23F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[55].setRotationPoint(-28F, -19F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[56].setRotationPoint(-24F, -23F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[57].setRotationPoint(-24F, -22F, -9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 166
		bodyModel[58].setRotationPoint(-24F, -19F, -9.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[59].setRotationPoint(-24F, -19F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 324
		bodyModel[60].setRotationPoint(-24F, -19F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[61].setRotationPoint(-24F, -19F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[62].setRotationPoint(-24F, -15F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[63].setRotationPoint(-28F, -19F, 10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[64].setRotationPoint(-24F, -23F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 75
		bodyModel[65].setRotationPoint(-24F, -19F, 8.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 76
		bodyModel[66].setRotationPoint(-24F, -19F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[67].setRotationPoint(-24F, -19F, 9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[68].setRotationPoint(-24F, -19F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[69].setRotationPoint(-24F, -15F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[70].setRotationPoint(-24F, -24F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[71].setRotationPoint(-24F, -24F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[72].setRotationPoint(-24F, -24F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 133
		bodyModel[73].setRotationPoint(-24F, -22F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 72
		bodyModel[74].setRotationPoint(-24F, -22F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[75].setRotationPoint(-24F, -22F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 12, 16, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[76].setRotationPoint(18F, -14F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 15, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[77].setRotationPoint(15F, 2F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[78].setRotationPoint(8F, -3F, -8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[79].setRotationPoint(6F, -16F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[80].setRotationPoint(6F, -16F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[81].setRotationPoint(15F, -16F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[82].setRotationPoint(15F, -16F, 10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[83].setRotationPoint(8F, -21F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[84].setRotationPoint(14F, -21F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[85].setRotationPoint(9F, -21F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, -1F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[86].setRotationPoint(8F, -21F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, -1F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[87].setRotationPoint(14F, -21F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, -1F, 5, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[88].setRotationPoint(9F, -21F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[89].setRotationPoint(15F, -22F, -7F);

		bodyModel[90].addShapeBox(0F, 0F, -1F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[90].setRotationPoint(15F, -22F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 8, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 87
		bodyModel[91].setRotationPoint(18F, -22F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[92].setRotationPoint(18F, -24F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[93].setRotationPoint(18F, -24F, 3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[94].setRotationPoint(18F, -24F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[95].setRotationPoint(7F, -24F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[96].setRotationPoint(7F, -24F, 3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[97].setRotationPoint(7F, -24F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 13, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[98].setRotationPoint(7F, -25F, -3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3.166F, 0F, 0F, -3.166F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.666F, 0F, 0F, 2.666F, 0F); // Box 103
		bodyModel[99].setRotationPoint(7F, -25F, 3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 13, 1, 5, 0F,0F, -3.166F, 0F, 0F, -3.166F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.666F, 0F, 0F, 2.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[100].setRotationPoint(7F, -25F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[101].setRotationPoint(36F, 1.5F, -8.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[102].setRotationPoint(37.5F, 0.5F, -9.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
		bodyModel[103].setRotationPoint(37.5F, 0.5F, 6.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[104].setRotationPoint(36F, 1.5F, 7.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 108
		bodyModel[105].setRotationPoint(33F, 1.25F, -8.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 108
		bodyModel[106].setRotationPoint(33F, 1.25F, 7.25F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 2, 18, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[107].setRotationPoint(30F, 1F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,-0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[108].setRotationPoint(7.5F, -22F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, -1F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[109].setRotationPoint(8F, -22F, 7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -1.5F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F); // Box 111
		bodyModel[110].setRotationPoint(7.5F, -22F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[111].setRotationPoint(8F, -22F, -7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[112].setRotationPoint(14.5F, -2F, 9.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[113].setRotationPoint(8.5F, -2F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[114].setRotationPoint(8F, -2F, 9.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 363
		bodyModel[115].setRotationPoint(8.5F, 0.5F, 8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 364
		bodyModel[116].setRotationPoint(8.5F, 3F, 9.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 365
		bodyModel[117].setRotationPoint(8.5F, 5.5F, 9.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 119
		bodyModel[118].setRotationPoint(14.5F, -2F, -10.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 120
		bodyModel[119].setRotationPoint(8.5F, -2F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		bodyModel[120].setRotationPoint(8F, -2F, -10.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 122
		bodyModel[121].setRotationPoint(8.5F, 0.5F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 123
		bodyModel[122].setRotationPoint(8.5F, 3F, -11.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 124
		bodyModel[123].setRotationPoint(8.5F, 5.5F, -11.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[124].setRotationPoint(-27.5F, -14F, -12F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 126
		bodyModel[125].setRotationPoint(-27.5F, -14F, 11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[126].setRotationPoint(15F, -20.2F, -11F);
		bodyModel[126].rotateAngleY = 1.57079633F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 126
		bodyModel[127].setRotationPoint(7.5F, -14F, 11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 127
		bodyModel[128].setRotationPoint(15F, -3.2F, -11F);
		bodyModel[128].rotateAngleY = 1.57079633F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 127
		bodyModel[129].setRotationPoint(9F, -20.2F, -11F);
		bodyModel[129].rotateAngleY = 1.57079633F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		bodyModel[130].setRotationPoint(9F, -3.2F, -11F);
		bodyModel[130].rotateAngleY = 1.57079633F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 132
		bodyModel[131].setRotationPoint(15F, -20.2F, 10F);
		bodyModel[131].rotateAngleY = 1.57079633F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 133
		bodyModel[132].setRotationPoint(15F, -3.2F, 10F);
		bodyModel[132].rotateAngleY = 1.57079633F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 134
		bodyModel[133].setRotationPoint(9F, -20.2F, 10F);
		bodyModel[133].rotateAngleY = 1.57079633F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 135
		bodyModel[134].setRotationPoint(9F, -3.2F, 10F);
		bodyModel[134].rotateAngleY = 1.57079633F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[135].setRotationPoint(15F, -14F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 16, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[136].setRotationPoint(15F, -14F, 6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[137].setRotationPoint(15F, -3F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 11, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[138].setRotationPoint(15F, -14F, -6F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F); // Box 87
		bodyModel[139].setRotationPoint(14F, -14F, -2F);

		bodyModel[140].addShapeBox(0F, -1F, -1F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -4.25F, 0F, -4.25F, -4.25F); // Box 90
		bodyModel[140].setRotationPoint(7.5F, -17.5F, 5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 134
		bodyModel[141].setRotationPoint(8.25F, -16.75F, 4F);
		bodyModel[141].rotateAngleY = 1.57079633F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 87
		bodyModel[142].setRotationPoint(16.4F, -16F, 4F);
		bodyModel[142].rotateAngleY = 0.41887902F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 87
		bodyModel[143].setRotationPoint(16.4F, -17F, 4F);
		bodyModel[143].rotateAngleY = 0.41887902F;

		bodyModel[144].addShapeBox(0.5F, 0F, 0.5F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 87
		bodyModel[144].setRotationPoint(16.4F, -17.75F, 4F);
		bodyModel[144].rotateAngleY = 0.41887902F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 30, 1, 21, 0F,0F, 0F, 0F, -27F, 0F, 0F, -27F, 0F, -18.9F, 0F, 0F, -18.9F, 0F, -0.9F, 0F, -27F, -0.9F, 0F, -27F, -0.9F, -18.9F, 0F, -0.9F, -18.9F); // Box 87
		bodyModel[145].setRotationPoint(14.75F, -14.05F, -0.5F);
		bodyModel[145].rotateAngleY = 0.34906585F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 30, 1, 21, 0F,0F, 0F, 0F, -27F, 0F, 0F, -27F, 0F, -18.9F, 0F, 0F, -18.9F, 0F, -0.9F, 0F, -27F, -0.9F, 0F, -27F, -0.9F, -18.9F, 0F, -0.9F, -18.9F); // Box 87
		bodyModel[146].setRotationPoint(14.75F, -14.1F, -1.53F);
		bodyModel[146].rotateAngleY = 0.06981317F;
	}
}