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

public class Paccar64Woodchip extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Paccar64Woodchip() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[119];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 79
		bodyModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 79
		bodyModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 79
		bodyModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 79
		bodyModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 79
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 79
		bodyModel[7] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 79
		bodyModel[8] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 79
		bodyModel[9] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 79
		bodyModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 79
		bodyModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 79
		bodyModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 79
		bodyModel[13] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 33
		bodyModel[24] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 151
		bodyModel[25] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 151
		bodyModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 163
		bodyModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 43
		bodyModel[28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 45
		bodyModel[30] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 46
		bodyModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 47
		bodyModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 50
		bodyModel[35] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 151
		bodyModel[36] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 53
		bodyModel[38] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 54
		bodyModel[39] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 55
		bodyModel[40] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 56
		bodyModel[41] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 57
		bodyModel[42] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 58
		bodyModel[43] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 59
		bodyModel[44] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 60
		bodyModel[45] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 62
		bodyModel[47] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 63
		bodyModel[48] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 64
		bodyModel[49] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 65
		bodyModel[50] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 66
		bodyModel[51] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 67
		bodyModel[52] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 68
		bodyModel[53] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 70
		bodyModel[55] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 71
		bodyModel[56] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 72
		bodyModel[57] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 73
		bodyModel[58] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 74
		bodyModel[59] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 75
		bodyModel[60] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 76
		bodyModel[61] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 77
		bodyModel[62] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 78
		bodyModel[63] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 79
		bodyModel[64] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 80
		bodyModel[65] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 81
		bodyModel[66] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 82
		bodyModel[67] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 83
		bodyModel[68] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 84
		bodyModel[69] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 85
		bodyModel[70] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 86
		bodyModel[71] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 87
		bodyModel[72] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 88
		bodyModel[73] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 89
		bodyModel[74] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 90
		bodyModel[75] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 91
		bodyModel[76] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 92
		bodyModel[77] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 94
		bodyModel[78] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 95
		bodyModel[79] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 96
		bodyModel[80] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		bodyModel[81] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 98
		bodyModel[82] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 99
		bodyModel[83] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 100
		bodyModel[84] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 101
		bodyModel[85] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 102
		bodyModel[86] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 103
		bodyModel[87] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 104
		bodyModel[88] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 105
		bodyModel[89] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 106
		bodyModel[90] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 107
		bodyModel[91] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 108
		bodyModel[92] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 109
		bodyModel[93] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 110
		bodyModel[94] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 111
		bodyModel[95] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 112
		bodyModel[96] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 113
		bodyModel[97] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 114
		bodyModel[98] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 115
		bodyModel[99] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 116
		bodyModel[100] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 117
		bodyModel[101] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 118
		bodyModel[102] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 119
		bodyModel[103] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 120
		bodyModel[104] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 121
		bodyModel[105] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 122
		bodyModel[106] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 123
		bodyModel[107] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 174
		bodyModel[108] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 33
		bodyModel[109] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 33
		bodyModel[110] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 33
		bodyModel[111] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 33
		bodyModel[112] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 179
		bodyModel[113] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 180
		bodyModel[114] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 181
		bodyModel[115] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 182
		bodyModel[116] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 183
		bodyModel[117] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 184
		bodyModel[118] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 185

		bodyModel[0].addBox(0F, 0F, 0F, 130, 1, 20, 0F); // Box 1
		bodyModel[0].setRotationPoint(-65F, 3F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 79
		bodyModel[1].setRotationPoint(66F, 3.5F, -0.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 79
		bodyModel[2].setRotationPoint(67F, 3F, -0.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[3].setRotationPoint(67F, 3F, -1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[4].setRotationPoint(67F, 3F, 0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[5].setRotationPoint(69F, 3F, -0.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 79
		bodyModel[6].setRotationPoint(-67F, 3.5F, -0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[7].setRotationPoint(-70F, 3F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[8].setRotationPoint(-69F, 3F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[9].setRotationPoint(-70F, 3F, 0.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 79
		bodyModel[10].setRotationPoint(-68F, 3F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[11].setRotationPoint(-66F, 3F, -1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[12].setRotationPoint(65F, 3F, -1.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 27, 1, 0F); // Box 14
		bodyModel[13].setRotationPoint(-66F, -23F, -11F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 27, 1, 0F); // Box 15
		bodyModel[14].setRotationPoint(-66F, -23F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 0, 20, 0F); // Box 16
		bodyModel[15].setRotationPoint(-66F, -23F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 26, 20, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-65F, -23F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-66F, -21.25F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[18].setRotationPoint(-66F, -17F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[19].setRotationPoint(-66F, -12.75F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[20].setRotationPoint(-66F, -8.5F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[21].setRotationPoint(-66F, -4.25F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[22].setRotationPoint(-66F, 0F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 26, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[23].setRotationPoint(-66.01F, -23F, -0.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 151
		bodyModel[24].setRotationPoint(-67F, -22.5F, 5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 151
		bodyModel[25].setRotationPoint(-67F, -22.5F, 9.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 163
		bodyModel[26].setRotationPoint(-67F, 1.5F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 43
		bodyModel[27].setRotationPoint(-67F, -1.5F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 44
		bodyModel[28].setRotationPoint(-67F, -4.5F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 45
		bodyModel[29].setRotationPoint(-67F, -7.5F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 46
		bodyModel[30].setRotationPoint(-67F, -10.5F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 47
		bodyModel[31].setRotationPoint(-67F, -13.5F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 48
		bodyModel[32].setRotationPoint(-67F, -16.5F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 49
		bodyModel[33].setRotationPoint(-67F, -19.5F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 50
		bodyModel[34].setRotationPoint(-67F, -22.5F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 151
		bodyModel[35].setRotationPoint(-66F, 2F, 5.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[36].setRotationPoint(-66F, -23F, 5.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 53
		bodyModel[37].setRotationPoint(-67F, 0.5F, -9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 130, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[38].setRotationPoint(-65F, 4F, -5F);

		bodyModel[39].addBox(0F, 0F, 0F, 122, 27, 1, 0F); // Box 55
		bodyModel[39].setRotationPoint(-61F, -23F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 27, 1, 0F); // Box 56
		bodyModel[40].setRotationPoint(65F, -23F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		bodyModel[41].setRotationPoint(66F, 0.5F, 5.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 58
		bodyModel[42].setRotationPoint(65F, 0F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 26, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[43].setRotationPoint(66.01F, -23F, -0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 60
		bodyModel[44].setRotationPoint(65F, -4.25F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 61
		bodyModel[45].setRotationPoint(65F, -8.5F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 62
		bodyModel[46].setRotationPoint(65F, -12.75F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 63
		bodyModel[47].setRotationPoint(65F, -17F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 64
		bodyModel[48].setRotationPoint(65F, -21.25F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 0, 20, 0F); // Box 65
		bodyModel[49].setRotationPoint(65F, -23F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 26, 20, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 66
		bodyModel[50].setRotationPoint(64F, -23F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		bodyModel[51].setRotationPoint(66F, -22.5F, -6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 68
		bodyModel[52].setRotationPoint(65F, -23F, -6.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 69
		bodyModel[53].setRotationPoint(66F, -22.5F, -10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 25, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 70
		bodyModel[54].setRotationPoint(66F, -22.5F, -10.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 71
		bodyModel[55].setRotationPoint(66F, -19.5F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 72
		bodyModel[56].setRotationPoint(66F, -16.5F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 73
		bodyModel[57].setRotationPoint(66F, -13.5F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 74
		bodyModel[58].setRotationPoint(66F, -10.5F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 75
		bodyModel[59].setRotationPoint(66F, -7.5F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 76
		bodyModel[60].setRotationPoint(66F, -4.5F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 77
		bodyModel[61].setRotationPoint(66F, -1.5F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 78
		bodyModel[62].setRotationPoint(66F, 1.5F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 79
		bodyModel[63].setRotationPoint(65F, 2F, -6.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 27, 1, 0F); // Box 80
		bodyModel[64].setRotationPoint(65F, -23F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 81
		bodyModel[65].setRotationPoint(-65F, -23F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		bodyModel[66].setRotationPoint(-65F, 4F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[67].setRotationPoint(-65F, -3F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 84
		bodyModel[68].setRotationPoint(-65F, 0F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 85
		bodyModel[69].setRotationPoint(-65F, -3F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 86
		bodyModel[70].setRotationPoint(-62F, -3F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 132, 1, 0, 0F); // Box 87
		bodyModel[71].setRotationPoint(-66F, 4F, -10.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 27, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 88
		bodyModel[72].setRotationPoint(61F, -23F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 89
		bodyModel[73].setRotationPoint(61F, -2F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 90
		bodyModel[74].setRotationPoint(61F, 1F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[75].setRotationPoint(61F, -23F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 92
		bodyModel[76].setRotationPoint(61F, 4F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 94
		bodyModel[77].setRotationPoint(61F, -5F, -11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 95
		bodyModel[78].setRotationPoint(61F, -8F, -11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 96
		bodyModel[79].setRotationPoint(61F, -11F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 97
		bodyModel[80].setRotationPoint(61F, -14F, -11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 98
		bodyModel[81].setRotationPoint(61F, -17F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 99
		bodyModel[82].setRotationPoint(61F, -20F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 100
		bodyModel[83].setRotationPoint(61F, -23F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 101
		bodyModel[84].setRotationPoint(61F, -23F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[85].setRotationPoint(-65F, -23F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 27, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[86].setRotationPoint(-65F, -23F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[87].setRotationPoint(-65F, -23F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 27, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
		bodyModel[88].setRotationPoint(-62F, -23F, 10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[89].setRotationPoint(-65F, -20F, 10F);

		bodyModel[90].addBox(0F, 0F, 0F, 122, 27, 1, 0F); // Box 107
		bodyModel[90].setRotationPoint(-61F, -23F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[91].setRotationPoint(-65F, -17F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[92].setRotationPoint(-65F, -14F, 10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[93].setRotationPoint(-65F, 4F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[94].setRotationPoint(-65F, 1F, 10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[95].setRotationPoint(-65F, -2F, 10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[96].setRotationPoint(-65F, -5F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[97].setRotationPoint(-65F, -8F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[98].setRotationPoint(-65F, -11F, 10F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 20, 1, 0F); // Box 116
		bodyModel[99].setRotationPoint(61F, -23F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 117
		bodyModel[100].setRotationPoint(61F, -3F, 10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 118
		bodyModel[101].setRotationPoint(61F, 4F, 10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 119
		bodyModel[102].setRotationPoint(61F, 0F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[103].setRotationPoint(61F, -3F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 121
		bodyModel[104].setRotationPoint(61F, -3F, 10F);

		bodyModel[105].addBox(0F, 0F, 0F, 132, 1, 0, 0F); // Box 122
		bodyModel[105].setRotationPoint(-66F, 4F, 10.5F);

		bodyModel[106].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 123
		bodyModel[106].setRotationPoint(-57F, 4.5F, -1F);

		bodyModel[107].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 174
		bodyModel[107].setRotationPoint(55F, 4.5F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[108].setRotationPoint(66.25F, -4.5F, -3.6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[109].setRotationPoint(67.25F, -5.5F, -4.6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[110].setRotationPoint(65.75F, -5F, -4.1F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[111].setRotationPoint(65F, 1F, -5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 179
		bodyModel[112].setRotationPoint(66.25F, -2F, -3.6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 130, 1, 20, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 180
		bodyModel[113].setRotationPoint(-65F, -22F, -10F);

		bodyModel[114].addBox(0F, 0F, 0F, 3, 3, 5, 0F); // Box 181
		bodyModel[114].setRotationPoint(-1.5F, 4F, 5F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 182
		bodyModel[115].setRotationPoint(-0.5F, 4F, 10F);

		bodyModel[116].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 183
		bodyModel[116].setRotationPoint(-3F, 4F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 184
		bodyModel[117].setRotationPoint(65F, 3F, 5.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 185
		bodyModel[118].setRotationPoint(-66F, 3F, -9.5F);
	}
}