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

public class FortyFoot_Boxcar extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public FortyFoot_Boxcar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[166];

		initbodyModel_1();

		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box201
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import DoorRight
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import DoorLeft
		bodyModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box204
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box6
		bodyModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box7
		bodyModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box8
		bodyModel[7] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box9
		bodyModel[8] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box10
		bodyModel[9] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import Box11
		bodyModel[10] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box12
		bodyModel[11] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import Box13
		bodyModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box14
		bodyModel[13] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box15
		bodyModel[14] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box16
		bodyModel[15] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Import Box17
		bodyModel[16] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Import Box18
		bodyModel[17] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box19
		bodyModel[18] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Import Box18
		bodyModel[19] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import Box19
		bodyModel[20] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import Box20
		bodyModel[21] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Import Box21
		bodyModel[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box22
		bodyModel[23] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Import Box23
		bodyModel[24] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box24
		bodyModel[25] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box25
		bodyModel[26] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import Box26
		bodyModel[27] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box27
		bodyModel[28] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import Box28
		bodyModel[29] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box29
		bodyModel[30] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Import Box30
		bodyModel[31] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import Box31
		bodyModel[32] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box32
		bodyModel[33] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box33
		bodyModel[34] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box34
		bodyModel[35] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box35
		bodyModel[36] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box36
		bodyModel[37] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box37
		bodyModel[38] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import Box38
		bodyModel[39] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box39
		bodyModel[40] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box40
		bodyModel[41] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import Box41
		bodyModel[42] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import Box42
		bodyModel[43] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Import Box32
		bodyModel[44] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import Box32
		bodyModel[45] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Import Box22
		bodyModel[46] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box25
		bodyModel[47] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box25
		bodyModel[48] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Import Box25
		bodyModel[49] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Import Box25
		bodyModel[50] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box25
		bodyModel[51] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box25
		bodyModel[52] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import Box25
		bodyModel[53] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Import Box25
		bodyModel[54] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import Box22
		bodyModel[55] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Import Box25
		bodyModel[56] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Import Box22
		bodyModel[57] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box22
		bodyModel[58] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Import Box22
		bodyModel[59] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Import Box25
		bodyModel[60] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Import Box22
		bodyModel[61] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import Box22
		bodyModel[62] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Import Box31
		bodyModel[63] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box22
		bodyModel[64] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Import Box31
		bodyModel[65] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import Box22
		bodyModel[66] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box22
		bodyModel[67] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Import Box79
		bodyModel[68] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Import Box79
		bodyModel[69] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Import Box79
		bodyModel[70] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box79
		bodyModel[71] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Import Box79
		bodyModel[72] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box79
		bodyModel[73] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Box79
		bodyModel[74] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box79
		bodyModel[75] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Import Box79
		bodyModel[76] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Import Box79
		bodyModel[77] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import Box17
		bodyModel[78] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import Box17
		bodyModel[79] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box17
		bodyModel[80] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Import Box17
		bodyModel[81] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import Box17
		bodyModel[82] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box94
		bodyModel[83] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Import Box95
		bodyModel[84] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import Box96
		bodyModel[85] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import Box97
		bodyModel[86] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import Box98
		bodyModel[87] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Import Box101
		bodyModel[88] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box102
		bodyModel[89] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Import Box104
		bodyModel[90] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import Box105
		bodyModel[91] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box106
		bodyModel[92] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Import Box107
		bodyModel[93] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import Box108
		bodyModel[94] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Import Box110
		bodyModel[95] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box111
		bodyModel[96] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import Box112
		bodyModel[97] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Import Box113
		bodyModel[98] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Import Box115
		bodyModel[99] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import Box116
		bodyModel[100] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Import Box117
		bodyModel[101] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Import Box118
		bodyModel[102] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Import Box119
		bodyModel[103] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box120
		bodyModel[104] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Import Box121
		bodyModel[105] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Import DoorLeft
		bodyModel[106] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Import DoorRight
		bodyModel[107] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Import Box125
		bodyModel[108] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import Box126
		bodyModel[109] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Import Box127
		bodyModel[110] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import Box128
		bodyModel[111] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import Box129
		bodyModel[112] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import Box130
		bodyModel[113] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box131
		bodyModel[114] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Import Box132
		bodyModel[115] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Import Box133
		bodyModel[116] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Import Box134
		bodyModel[117] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Import Box118
		bodyModel[118] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Import Box119
		bodyModel[119] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Import Box120
		bodyModel[120] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import Box121
		bodyModel[121] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import Box122
		bodyModel[122] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box123
		bodyModel[123] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Import Box124
		bodyModel[124] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Import Box125
		bodyModel[125] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Import Box126
		bodyModel[126] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box127
		bodyModel[127] = new ModelRendererTurbo(this, 12, 28, textureX, textureY); // Import Box128
		bodyModel[128] = new ModelRendererTurbo(this, 2, 28, textureX, textureY); // Import Box129
		bodyModel[129] = new ModelRendererTurbo(this, 327, 73, textureX, textureY); // Import Box17
		bodyModel[130] = new ModelRendererTurbo(this, 373, 67, textureX, textureY); // Import Box17
		bodyModel[131] = new ModelRendererTurbo(this, 315, 72, textureX, textureY); // Import Box17
		bodyModel[132] = new ModelRendererTurbo(this, 99, 88, textureX, textureY); // Import Box17
		bodyModel[133] = new ModelRendererTurbo(this, 165, 88, textureX, textureY); // Import Box17
		bodyModel[134] = new ModelRendererTurbo(this, 132, 82, textureX, textureY); // Import Box17
		bodyModel[135] = new ModelRendererTurbo(this, 128, 87, textureX, textureY); // Import Box17
		bodyModel[136] = new ModelRendererTurbo(this, 106, 87, textureX, textureY); // Import Box17
		bodyModel[137] = new ModelRendererTurbo(this, 118, 83, textureX, textureY); // Import Box17
		bodyModel[138] = new ModelRendererTurbo(this, 316, 66, textureX, textureY); // Import Box17
		bodyModel[139] = new ModelRendererTurbo(this, 155, 87, textureX, textureY); // Import Box17
		bodyModel[140] = new ModelRendererTurbo(this, 170, 83, textureX, textureY); // Import Box17
		bodyModel[141] = new ModelRendererTurbo(this, 108, 83, textureX, textureY); // Import Box17
		bodyModel[142] = new ModelRendererTurbo(this, 137, 83, textureX, textureY); // Import Box17
		bodyModel[143] = new ModelRendererTurbo(this, 147, 83, textureX, textureY); // Import Box17
		bodyModel[144] = new ModelRendererTurbo(this, 147, 87, textureX, textureY); // Import Box17
		bodyModel[145] = new ModelRendererTurbo(this, 177, 88, textureX, textureY); // Import Box17
		bodyModel[146] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import Box17
		bodyModel[147] = new ModelRendererTurbo(this, 330, 70, textureX, textureY); // Import Box17
		bodyModel[148] = new ModelRendererTurbo(this, 367, 67, textureX, textureY); // Import Box17
		bodyModel[149] = new ModelRendererTurbo(this, 160, 83, textureX, textureY); // Import Box17
		bodyModel[150] = new ModelRendererTurbo(this, 121, 86, textureX, textureY); // Import Box17
		bodyModel[151] = new ModelRendererTurbo(this, 102, 84, textureX, textureY); // Import Box17
		bodyModel[152] = new ModelRendererTurbo(this, 172, 87, textureX, textureY); // Import Box17
		bodyModel[153] = new ModelRendererTurbo(this, 134, 86, textureX, textureY); // Import Box17
		bodyModel[154] = new ModelRendererTurbo(this, 113, 85, textureX, textureY); // Import Box17
		bodyModel[155] = new ModelRendererTurbo(this, 344, 67, textureX, textureY); // Import Box17
		bodyModel[156] = new ModelRendererTurbo(this, 353, 67, textureX, textureY); // Import Box17
		bodyModel[157] = new ModelRendererTurbo(this, 331, 66, textureX, textureY); // Import Box17
		bodyModel[158] = new ModelRendererTurbo(this, 128, 84, textureX, textureY); // Import Box17
		bodyModel[159] = new ModelRendererTurbo(this, 153, 84, textureX, textureY); // Import Box17
		bodyModel[160] = new ModelRendererTurbo(this, 166, 85, textureX, textureY); // Import Box17
		bodyModel[161] = new ModelRendererTurbo(this, 142, 85, textureX, textureY); // Import Box17
		bodyModel[162] = new ModelRendererTurbo(this, 177, 84, textureX, textureY); // Import Box17
		bodyModel[163] = new ModelRendererTurbo(this, 320, 69, textureX, textureY); // Import Box17
		bodyModel[164] = new ModelRendererTurbo(this, 4, 123, textureX, textureY); // Import Box19
		bodyModel[165] = new ModelRendererTurbo(this, 211, 99, textureX, textureY); // Import Box16

		bodyModel[0].addBox(0F, 0F, 0F, 35, 24, 1, 0F); // Import Box201
		bodyModel[0].setRotationPoint(-42.5F, -20F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 15, 23, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Import DoorRight
		bodyModel[1].setRotationPoint(-7.5F, -19F, 10.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 23, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import DoorLeft
		bodyModel[2].setRotationPoint(-7.5F, -19F, -11.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 35, 24, 1, 0F); // Import Box204
		bodyModel[3].setRotationPoint(-42.5F, -20F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 35, 24, 1, 0F); // Import Box6
		bodyModel[4].setRotationPoint(7.5F, -20F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 35, 24, 1, 0F); // Import Box7
		bodyModel[5].setRotationPoint(7.5F, -20F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Import Box8
		bodyModel[6].setRotationPoint(-7.5F, 3F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Import Box9
		bodyModel[7].setRotationPoint(-7.5F, -20F, -11F);

		bodyModel[8].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Import Box10
		bodyModel[8].setRotationPoint(-7.5F, -20F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Import Box11
		bodyModel[9].setRotationPoint(-7.5F, 3F, 10F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 24, 22, 0F); // Import Box12
		bodyModel[10].setRotationPoint(-43.5F, -20F, -11F);

		bodyModel[11].addBox(0F, 0F, 0F, 1, 24, 22, 0F); // Import Box13
		bodyModel[11].setRotationPoint(42.5F, -20F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 85, 1, 20, 0F); // Import Box14
		bodyModel[12].setRotationPoint(-42.5F, 3F, -10F);

		bodyModel[13].addBox(0F, 0F, 0F, 85, 1, 20, 0F); // Import Box15
		bodyModel[13].setRotationPoint(-42.5F, -20F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 87, 1, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		bodyModel[14].setRotationPoint(-43.5F, -22F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 87, 1, 1, 0F,0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[15].setRotationPoint(-43.5F, -21F, -11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 87, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[16].setRotationPoint(-43.5F, -21F, 10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 87, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[17].setRotationPoint(-43.5F, -22F, 0F);

		bodyModel[18].addBox(0F, 0F, 0F, 32, 1, 1, 0F); // Import Box18
		bodyModel[18].setRotationPoint(-23.5F, -20F, 11F);

		bodyModel[19].addBox(0F, 0F, 0F, 32, 1, 1, 0F); // Import Box19
		bodyModel[19].setRotationPoint(-23.5F, 3F, 11F);

		bodyModel[20].addBox(0F, 0F, 0F, 32, 1, 1, 0F); // Import Box20
		bodyModel[20].setRotationPoint(-8.5F, -20F, -12F);

		bodyModel[21].addBox(0F, 0F, 0F, 32, 1, 1, 0F); // Import Box21
		bodyModel[21].setRotationPoint(-8.5F, 3F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.9F); // Import Box22
		bodyModel[22].setRotationPoint(-44.5F, -18F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box23
		bodyModel[23].setRotationPoint(-44.5F, -18F, 5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Import Box24
		bodyModel[24].setRotationPoint(-44.7F, 3.3F, 5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Import Box25
		bodyModel[25].setRotationPoint(-44.7F, -18.3F, 5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Import Box26
		bodyModel[26].setRotationPoint(-44.7F, -15F, 5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Import Box27
		bodyModel[27].setRotationPoint(-44.7F, -12F, 5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Import Box28
		bodyModel[28].setRotationPoint(-44.7F, -9F, 5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Import Box29
		bodyModel[29].setRotationPoint(-44.7F, -6F, 5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Import Box30
		bodyModel[30].setRotationPoint(-44.7F, -3F, 5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Import Box31
		bodyModel[31].setRotationPoint(-44.7F, 0F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Import Box32
		bodyModel[32].setRotationPoint(-46.5F, -14F, -0.1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[33].setRotationPoint(-44.5F, -19F, 2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box34
		bodyModel[34].setRotationPoint(-45.5F, -20.5F, 2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, -0.5F, -0.3F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box35
		bodyModel[35].setRotationPoint(-45.5F, -21.5F, 0.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, -2F, 0F, -0.3F, -2F, 0F, -0.3F, -2F, -0.5F, -0.3F, -2F); // Import Box36
		bodyModel[36].setRotationPoint(-45.5F, -16.5F, 0.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, -0.3F, 0F, -2F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box37
		bodyModel[37].setRotationPoint(-45.5F, -20.5F, -0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.3F, -0.5F, -2F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.3F, -0.5F, -2F, -0.3F); // Import Box38
		bodyModel[38].setRotationPoint(-45.5F, -20.5F, 4.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Import Box39
		bodyModel[39].setRotationPoint(-45.5F, -20.5F, 0.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box40
		bodyModel[40].setRotationPoint(-45.5F, -20.5F, 3.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box41
		bodyModel[41].setRotationPoint(-45.5F, -17.5F, 3.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box42
		bodyModel[42].setRotationPoint(-45.5F, -17.5F, 0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Import Box32
		bodyModel[43].setRotationPoint(-46.5F, -14F, -0.1F);
		bodyModel[43].rotateAngleZ = -0.73303829F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Import Box32
		bodyModel[44].setRotationPoint(-46.5F, -14F, 3.9F);
		bodyModel[44].rotateAngleZ = -0.73303829F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Import Box22
		bodyModel[45].setRotationPoint(-43.5F, -18F, 11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box25
		bodyModel[46].setRotationPoint(-42.5F, -18.3F, 11.2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box25
		bodyModel[47].setRotationPoint(-42.5F, 3.3F, 11.2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box25
		bodyModel[48].setRotationPoint(-42.5F, 0F, 11.2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box25
		bodyModel[49].setRotationPoint(-42.5F, -3F, 11.2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box25
		bodyModel[50].setRotationPoint(-42.5F, -6F, 11.2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box25
		bodyModel[51].setRotationPoint(-42.5F, -9F, 11.2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box25
		bodyModel[52].setRotationPoint(-42.5F, -12F, 11.2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box25
		bodyModel[53].setRotationPoint(-42.5F, -15F, 11.2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[54].setRotationPoint(-37.5F, -18F, 11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box25
		bodyModel[55].setRotationPoint(37.5F, 0F, 11.2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box22
		bodyModel[56].setRotationPoint(42.5F, 0F, 11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F); // Import Box22
		bodyModel[57].setRotationPoint(36.5F, 0F, 11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box22
		bodyModel[58].setRotationPoint(42.5F, -4F, 11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box25
		bodyModel[59].setRotationPoint(37.5F, -4F, 11.2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F); // Import Box22
		bodyModel[60].setRotationPoint(36.5F, -4F, 11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F); // Import Box22
		bodyModel[61].setRotationPoint(-43.5F, 0F, -12F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box31
		bodyModel[62].setRotationPoint(-42.5F, 0F, -12.2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box22
		bodyModel[63].setRotationPoint(-37.5F, 0F, -12F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box31
		bodyModel[64].setRotationPoint(-42.5F, -4F, -12.2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F); // Import Box22
		bodyModel[65].setRotationPoint(-43.5F, -4F, -12F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box22
		bodyModel[66].setRotationPoint(-37.5F, -4F, -12F);

		bodyModel[67].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box79
		bodyModel[67].setRotationPoint(39.5F, 4F, 0F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box79
		bodyModel[68].setRotationPoint(45.5F, 3.5F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		bodyModel[69].setRotationPoint(45.5F, 3.5F, -1F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box79
		bodyModel[70].setRotationPoint(45.5F, 3.5F, 1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		bodyModel[71].setRotationPoint(47.5F, 3.5F, 0F);

		bodyModel[72].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box79
		bodyModel[72].setRotationPoint(-45.5F, 4F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		bodyModel[73].setRotationPoint(-48.5F, 3.5F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box79
		bodyModel[74].setRotationPoint(-47.5F, 3.5F, -1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box79
		bodyModel[75].setRotationPoint(-48.5F, 3.5F, 1F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box79
		bodyModel[76].setRotationPoint(-46.5F, 3.5F, 0F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 87, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box17
		bodyModel[77].setRotationPoint(-43.5F, 4F, 10F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, -1F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[78].setRotationPoint(-43.5F, 4F, 9.9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -1F, 0F, 0F, -1F); // Import Box17
		bodyModel[79].setRotationPoint(-43.5F, 4F, -10.9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, -1F); // Import Box17
		bodyModel[80].setRotationPoint(42.5F, 4F, -10.9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Import Box17
		bodyModel[81].setRotationPoint(42.5F, 4F, 9.9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 89, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box94
		bodyModel[82].setRotationPoint(-44.5F, -22.5F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box95
		bodyModel[83].setRotationPoint(-42.5F, -22.5F, 2F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Box96
		bodyModel[84].setRotationPoint(38.5F, -22.5F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Import Box97
		bodyModel[85].setRotationPoint(-44.5F, -22F, -2F);
		bodyModel[85].rotateAngleZ = -0.73303829F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Import Box98
		bodyModel[86].setRotationPoint(-44.5F, -22F, 1F);
		bodyModel[86].rotateAngleZ = -0.73303829F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Import Box101
		bodyModel[87].setRotationPoint(44.5F, -22F, -2F);
		bodyModel[87].rotateAngleZ = -2.19911486F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F); // Import Box102
		bodyModel[88].setRotationPoint(44.5F, -22F, 1F);
		bodyModel[88].rotateAngleZ = -2.19911486F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F); // Import Box104
		bodyModel[89].setRotationPoint(38.5F, -21.75F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F); // Import Box105
		bodyModel[90].setRotationPoint(40.5F, -21.75F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F); // Import Box106
		bodyModel[91].setRotationPoint(-40.5F, -21.75F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.3F, 0F); // Import Box107
		bodyModel[92].setRotationPoint(-42.5F, -21.75F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Import Box108
		bodyModel[93].setRotationPoint(39F, -22.75F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.6F, -0.9F, 0F, -0.6F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		bodyModel[94].setRotationPoint(42F, -22.75F, -10.2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.6F, -0.9F, 0F, -0.6F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		bodyModel[95].setRotationPoint(38.9F, -22.75F, -10.2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.6F, 0F, -0.4F, -0.6F, 0F); // Import Box112
		bodyModel[96].setRotationPoint(41.3F, -22.75F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Import Box113
		bodyModel[97].setRotationPoint(41.1F, -23.05F, -6.9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.6F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.6F, 0F, 0F); // Import Box115
		bodyModel[98].setRotationPoint(41.1F, -22.75F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.9F, 0F, 0F, -0.9F); // Import Box116
		bodyModel[99].setRotationPoint(-42.1F, -22.75F, 9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Import Box117
		bodyModel[100].setRotationPoint(-42.3F, -22.75F, 6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.9F, 0F, 0F, -0.9F); // Import Box118
		bodyModel[101].setRotationPoint(-42.1F, -23.05F, 5.9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.9F, 0F, -0.6F); // Import Box119
		bodyModel[102].setRotationPoint(-43F, -22.75F, 9.2F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box120
		bodyModel[103].setRotationPoint(-42F, -22.75F, 9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, -0.9F, -0.3F, -0.6F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.9F, 0F, -0.6F); // Import Box121
		bodyModel[104].setRotationPoint(-39.9F, -22.75F, 9.2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import DoorLeft
		bodyModel[105].setRotationPoint(-2F, -11F, -12F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import DoorRight
		bodyModel[106].setRotationPoint(-2F, -11F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Import Box125
		bodyModel[107].setRotationPoint(36.5F, -18F, -12F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		bodyModel[108].setRotationPoint(42.5F, -18F, -12F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box127
		bodyModel[109].setRotationPoint(37.5F, -18.3F, -12.2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box128
		bodyModel[110].setRotationPoint(37.5F, -15F, -12.2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box129
		bodyModel[111].setRotationPoint(37.5F, -12F, -12.2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box130
		bodyModel[112].setRotationPoint(37.5F, -9F, -12.2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box131
		bodyModel[113].setRotationPoint(37.5F, -6F, -12.2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box132
		bodyModel[114].setRotationPoint(37.5F, -3F, -12.2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box133
		bodyModel[115].setRotationPoint(37.5F, 0F, -12.2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Import Box134
		bodyModel[116].setRotationPoint(37.5F, 3.3F, -12.2F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Import Box118
		bodyModel[117].setRotationPoint(43.5F, -18F, -5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		bodyModel[118].setRotationPoint(43.5F, -18F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Import Box120
		bodyModel[119].setRotationPoint(43.7F, -15F, -10F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Import Box121
		bodyModel[120].setRotationPoint(43.7F, -18.3F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Import Box122
		bodyModel[121].setRotationPoint(43.7F, -12F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Import Box123
		bodyModel[122].setRotationPoint(43.7F, -9F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Import Box124
		bodyModel[123].setRotationPoint(43.7F, -6F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Import Box125
		bodyModel[124].setRotationPoint(43.7F, -3F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Import Box126
		bodyModel[125].setRotationPoint(43.7F, 0F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Import Box127
		bodyModel[126].setRotationPoint(43.7F, 3.3F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		bodyModel[127].setRotationPoint(-32.5F, 4F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
		bodyModel[128].setRotationPoint(30.5F, 4F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[129].setRotationPoint(-16.5F, 4.5F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box17
		bodyModel[130].setRotationPoint(-17.5F, 4.5F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[131].setRotationPoint(16.5F, 4.5F, 10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[132].setRotationPoint(23.5F, 4.5F, 10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box17
		bodyModel[133].setRotationPoint(21.5F, 4.5F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[134].setRotationPoint(22.5F, 4.5F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[135].setRotationPoint(32.5F, 4.5F, 10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box17
		bodyModel[136].setRotationPoint(29.5F, 4.5F, 10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[137].setRotationPoint(30.5F, 4.5F, 10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box17
		bodyModel[138].setRotationPoint(-43.5F, 4.5F, 10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box17
		bodyModel[139].setRotationPoint(40.5F, 4.5F, 10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[140].setRotationPoint(-22.5F, 4.5F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box17
		bodyModel[141].setRotationPoint(-24.5F, 4.5F, 10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[142].setRotationPoint(-23.5F, 4.5F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[143].setRotationPoint(-30.5F, 4.5F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box17
		bodyModel[144].setRotationPoint(-33.5F, 4.5F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[145].setRotationPoint(-32.5F, 4.5F, 10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 87, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box17
		bodyModel[146].setRotationPoint(-43.5F, 4F, -11.9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[147].setRotationPoint(-16.5F, 4.5F, -11.9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box17
		bodyModel[148].setRotationPoint(-17.5F, 4.5F, -11.9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[149].setRotationPoint(16.5F, 4.5F, -11.9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[150].setRotationPoint(23.5F, 4.5F, -11.9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box17
		bodyModel[151].setRotationPoint(21.5F, 4.5F, -11.9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[152].setRotationPoint(22.5F, 4.5F, -11.9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[153].setRotationPoint(32.5F, 4.5F, -11.9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box17
		bodyModel[154].setRotationPoint(29.5F, 4.5F, -11.9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[155].setRotationPoint(30.5F, 4.5F, -11.9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box17
		bodyModel[156].setRotationPoint(-43.5F, 4.5F, -11.9F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box17
		bodyModel[157].setRotationPoint(40.5F, 4.5F, -11.9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[158].setRotationPoint(-22.5F, 4.5F, -11.9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box17
		bodyModel[159].setRotationPoint(-24.5F, 4.5F, -11.9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[160].setRotationPoint(-23.5F, 4.5F, -11.9F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -1F, -0.9F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[161].setRotationPoint(-30.5F, 4.5F, -11.9F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box17
		bodyModel[162].setRotationPoint(-33.5F, 4.5F, -11.9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		bodyModel[163].setRotationPoint(-32.5F, 4.5F, -11.9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 87, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		bodyModel[164].setRotationPoint(-43.5F, -21F, 0F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 87, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		bodyModel[165].setRotationPoint(-43.5F, -21F, -10F);
	}
}