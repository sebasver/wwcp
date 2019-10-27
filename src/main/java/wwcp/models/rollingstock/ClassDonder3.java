//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.06.2018 - 15:55:44
// Last changed on: 18.06.2018 - 15:55:44

package wwcp.models.rollingstock; //Path where the model is located

import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class ClassDonder3 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ClassDonder3() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[164];

		initbodyModel_1();
		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 36
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 56
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 56
		bodyModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 2
		bodyModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 2
		bodyModel[35] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 233, 82, textureX, textureY); // Box 26
		bodyModel[51] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 33
		bodyModel[52] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 36
		bodyModel[53] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 32
		bodyModel[54] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 34
		bodyModel[55] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 33
		bodyModel[56] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 33
		bodyModel[57] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 16
		bodyModel[58] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 16
		bodyModel[59] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 17
		bodyModel[60] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 19
		bodyModel[61] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 17
		bodyModel[62] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 19
		bodyModel[63] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 26
		bodyModel[64] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 33
		bodyModel[65] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 36
		bodyModel[66] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 32
		bodyModel[67] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 34
		bodyModel[68] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 33
		bodyModel[69] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 33
		bodyModel[70] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 16
		bodyModel[71] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 16
		bodyModel[72] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 17
		bodyModel[73] = new ModelRendererTurbo(this, 97, 50, textureX, textureY); // Box 19
		bodyModel[74] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 17
		bodyModel[75] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 19
		bodyModel[76] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 2
		bodyModel[78] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 16
		bodyModel[79] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 16
		bodyModel[80] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 16
		bodyModel[81] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 16
		bodyModel[82] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 16
		bodyModel[83] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 16
		bodyModel[84] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 16
		bodyModel[85] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 16
		bodyModel[86] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 33
		bodyModel[87] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 33
		bodyModel[88] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 17
		bodyModel[89] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 19
		bodyModel[90] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 17
		bodyModel[91] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 19
		bodyModel[92] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 7
		bodyModel[93] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 163
		bodyModel[94] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 165
		bodyModel[95] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 6
		bodyModel[96] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 9
		bodyModel[97] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 7
		bodyModel[98] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 163
		bodyModel[99] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 165
		bodyModel[100] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 6
		bodyModel[101] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 9
		bodyModel[102] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 7
		bodyModel[103] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 163
		bodyModel[104] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 165
		bodyModel[105] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 6
		bodyModel[106] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 9
		bodyModel[107] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 163
		bodyModel[108] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 165
		bodyModel[109] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 6
		bodyModel[110] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 9
		bodyModel[111] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 7
		bodyModel[112] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 163
		bodyModel[113] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 165
		bodyModel[114] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 6
		bodyModel[115] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 9
		bodyModel[116] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 7
		bodyModel[117] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 163
		bodyModel[118] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 165
		bodyModel[119] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 6
		bodyModel[120] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 9
		bodyModel[121] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 7
		bodyModel[122] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 7
		bodyModel[123] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 163
		bodyModel[124] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 165
		bodyModel[125] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 6
		bodyModel[126] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 9
		bodyModel[127] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 7
		bodyModel[128] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 163
		bodyModel[129] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 165
		bodyModel[130] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 6
		bodyModel[131] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 9
		bodyModel[132] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 7
		bodyModel[133] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 163
		bodyModel[134] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 165
		bodyModel[135] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 6
		bodyModel[136] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 9
		bodyModel[137] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 163
		bodyModel[138] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 165
		bodyModel[139] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 6
		bodyModel[140] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 9
		bodyModel[141] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 7
		bodyModel[142] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 163
		bodyModel[143] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 165
		bodyModel[144] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 6
		bodyModel[145] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 9
		bodyModel[146] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 7
		bodyModel[147] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 163
		bodyModel[148] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 165
		bodyModel[149] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 6
		bodyModel[150] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 9
		bodyModel[151] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 7
		bodyModel[152] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 7
		bodyModel[153] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 163
		bodyModel[154] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 165
		bodyModel[155] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 6
		bodyModel[156] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 9
		bodyModel[157] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 7
		bodyModel[158] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 163
		bodyModel[159] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 165
		bodyModel[160] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 6
		bodyModel[161] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 9
		bodyModel[162] = new ModelRendererTurbo(this, 224, 111, textureX, textureY); // Box 2
		bodyModel[163] = new ModelRendererTurbo(this, 226, 132, textureX, textureY); // Box 2

		bodyModel[0].addShapeBox(0F, 0F, 0F, 60, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(-23F, 1F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 35
		bodyModel[1].setRotationPoint(-31F, 0F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 36
		bodyModel[2].setRotationPoint(-31F, 0F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(-28F, 1F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[4].setRotationPoint(43.5F, 0F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[5].setRotationPoint(37F, 1F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[6].setRotationPoint(43.5F, 0F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[7].setRotationPoint(42F, 1F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[8].setRotationPoint(42F, 1F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-30F, 1F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[10].setRotationPoint(-30F, 1F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 58, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-22F, -17F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 58, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[12].setRotationPoint(-22F, -17F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 18, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[13].setRotationPoint(-23F, -17F, -10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[14].setRotationPoint(-23F, -17F, 2.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[15].setRotationPoint(-23F, -17F, -2.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[16].setRotationPoint(36F, -17F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[17].setRotationPoint(36F, -17F, 2.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(36F, -17F, -2.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[19].setRotationPoint(42F, -8F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[20].setRotationPoint(37F, 4F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[21].setRotationPoint(37F, 7F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[22].setRotationPoint(-28F, 4F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[23].setRotationPoint(-28F, 7F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[24].setRotationPoint(-28F, 4F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[25].setRotationPoint(-28F, 7F, 9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[26].setRotationPoint(37F, 4F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[27].setRotationPoint(37F, 7F, 9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 2
		bodyModel[28].setRotationPoint(39F, 2F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 2
		bodyModel[29].setRotationPoint(-26F, 2F, 7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[30].setRotationPoint(39F, 2F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[31].setRotationPoint(-26F, 2F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[32].setRotationPoint(42F, -8F, 3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[33].setRotationPoint(-28F, -8F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[34].setRotationPoint(-28F, -8F, 3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[35].setRotationPoint(-31F, 1F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[36].setRotationPoint(42F, 1F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 2
		bodyModel[37].setRotationPoint(-28F, -17F, 11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -3F, 0.25F); // Box 2
		bodyModel[38].setRotationPoint(-28F, -17F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -3F, 0.25F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[39].setRotationPoint(37F, -17F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.25F, 0F, 0F, 0.25F); // Box 2
		bodyModel[40].setRotationPoint(37F, -17F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 70, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[41].setRotationPoint(-28F, -20F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 70, 3, 0, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
		bodyModel[42].setRotationPoint(-28F, -20F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 70, 3, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F, 0F, 0F, -5.75F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 2
		bodyModel[43].setRotationPoint(-28F, -23F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 70, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -5.75F, 0F, 0F, -5.75F); // Box 2
		bodyModel[44].setRotationPoint(-28F, -23F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 70, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 2
		bodyModel[45].setRotationPoint(-28F, -23F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.875F, 0F, 0F, 0.875F, 0F, 0F, 0.875F, 0F, 0F, 0.875F); // Box 2
		bodyModel[46].setRotationPoint(-23F, -20F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 5.875F, 0F, 0F, 5.875F, 0F, 0F, 5.875F, 0F, 0F, 5.875F); // Box 2
		bodyModel[47].setRotationPoint(-23F, -23F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.875F, 0F, 0F, 0.875F, 0F, 0F, 0.875F, 0F, 0F, 0.875F); // Box 2
		bodyModel[48].setRotationPoint(36F, -20F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 5.875F, 0F, 0F, 5.875F, 0F, 0F, 5.875F, 0F, 0F, 5.875F); // Box 2
		bodyModel[49].setRotationPoint(36F, -23F, -4F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[50].setRotationPoint(29F, 6F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[51].setRotationPoint(28F, 6F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[52].setRotationPoint(31F, 6F, 7F);
		bodyModel[52].rotateAngleY = -3.14159265F;

		bodyModel[53].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[53].setRotationPoint(29.5F, 6.5F, 5.98F);

		bodyModel[54].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[54].setRotationPoint(29.5F, 6.5F, -5.98F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[55].setRotationPoint(27F, 5F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[56].setRotationPoint(27F, 5F, 5.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[57].setRotationPoint(23F, 4F, -6.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[58].setRotationPoint(34.5F, 4F, -6.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[59].setRotationPoint(31.5F, 4F, 5.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[60].setRotationPoint(27.5F, 4F, 6.5F);
		bodyModel[60].rotateAngleY = -3.14159265F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[61].setRotationPoint(31.5F, 4F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[62].setRotationPoint(27.5F, 4F, -6F);
		bodyModel[62].rotateAngleY = -3.14159265F;

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[63].setRotationPoint(-16F, 6F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[64].setRotationPoint(-17F, 6F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[65].setRotationPoint(-14F, 6F, 7F);
		bodyModel[65].rotateAngleY = -3.14159265F;

		bodyModel[66].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[66].setRotationPoint(-15.5F, 6.5F, 5.98F);

		bodyModel[67].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[67].setRotationPoint(-15.5F, 6.5F, -5.98F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[68].setRotationPoint(-18F, 5F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[69].setRotationPoint(-18F, 5F, 5.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[70].setRotationPoint(-22F, 4F, -6.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[71].setRotationPoint(-10.5F, 4F, -6.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[72].setRotationPoint(-13.5F, 4F, 5.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[73].setRotationPoint(-17.5F, 4F, 6.5F);
		bodyModel[73].rotateAngleY = -3.14159265F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[74].setRotationPoint(-13.5F, 4F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[75].setRotationPoint(-17.5F, 4F, -6F);
		bodyModel[75].rotateAngleY = -3.14159265F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[76].setRotationPoint(-3F, 2F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[77].setRotationPoint(-3F, 2F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[78].setRotationPoint(23F, 2F, -6.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[79].setRotationPoint(34.5F, 2F, -6.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[80].setRotationPoint(23F, 2F, 5.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[81].setRotationPoint(34.5F, 2F, 5.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[82].setRotationPoint(-22F, 2F, -6.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[83].setRotationPoint(-10.5F, 2F, -6.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[84].setRotationPoint(-22F, 2F, 5.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[85].setRotationPoint(-10.5F, 2F, 5.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[86].setRotationPoint(-5F, 4F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[87].setRotationPoint(-5F, 4F, 5.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[88].setRotationPoint(19F, 3F, 5.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[89].setRotationPoint(-5F, 3F, 6.5F);
		bodyModel[89].rotateAngleY = -3.14159265F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[90].setRotationPoint(19F, 3F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[91].setRotationPoint(-5F, 3F, -6F);
		bodyModel[91].rotateAngleY = -3.14159265F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[92].setRotationPoint(24.45F, -4F, 2.9F);
		bodyModel[92].rotateAngleY = -3.14159265F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[93].setRotationPoint(21.5F, -9F, 9.9F);
		bodyModel[93].rotateAngleY = -3.14159265F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[94].setRotationPoint(24.5F, -2F, 9.9F);
		bodyModel[94].rotateAngleY = -3.14159265F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[95].setRotationPoint(20.45F, -4F, 8.9F);
		bodyModel[95].rotateAngleY = -6.28318531F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[96].setRotationPoint(24.5F, -1F, 9.9F);
		bodyModel[96].rotateAngleY = -3.14159265F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[97].setRotationPoint(31.45F, -4F, 8.9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[98].setRotationPoint(34.5F, -9F, 2.9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[99].setRotationPoint(31.5F, -2F, 2.9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[100].setRotationPoint(35.45F, -4F, 3.9F);
		bodyModel[100].rotateAngleY = -3.14159265F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[101].setRotationPoint(31.5F, -1F, 2.9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[102].setRotationPoint(8.45F, -4F, 2.9F);
		bodyModel[102].rotateAngleY = -3.14159265F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[103].setRotationPoint(5.5F, -9F, 9.9F);
		bodyModel[103].rotateAngleY = -3.14159265F;

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[104].setRotationPoint(8.5F, -2F, 9.9F);
		bodyModel[104].rotateAngleY = -3.14159265F;

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[105].setRotationPoint(4.45F, -4F, 8.9F);
		bodyModel[105].rotateAngleY = -6.28318531F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[106].setRotationPoint(8.5F, -1F, 9.9F);
		bodyModel[106].rotateAngleY = -3.14159265F;

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[107].setRotationPoint(18.5F, -9F, 1.9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[108].setRotationPoint(15.5F, -2F, 1.9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[109].setRotationPoint(19.45F, -4F, 2.9F);
		bodyModel[109].rotateAngleY = -3.14159265F;

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[110].setRotationPoint(15.5F, -1F, 1.9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[111].setRotationPoint(-17.55F, -4F, 3.9F);
		bodyModel[111].rotateAngleY = -3.14159265F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[112].setRotationPoint(-20.5F, -9F, 9.9F);
		bodyModel[112].rotateAngleY = -3.14159265F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[113].setRotationPoint(-17.5F, -2F, 9.9F);
		bodyModel[113].rotateAngleY = -3.14159265F;

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[114].setRotationPoint(-21.55F, -4F, 8.9F);
		bodyModel[114].rotateAngleY = -6.28318531F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[115].setRotationPoint(-17.5F, -1F, 9.9F);
		bodyModel[115].rotateAngleY = -3.14159265F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[116].setRotationPoint(-10.55F, -4F, 8.9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[117].setRotationPoint(-7.5F, -9F, 1.9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[118].setRotationPoint(-10.5F, -2F, 1.9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[119].setRotationPoint(-6.55F, -4F, 2.9F);
		bodyModel[119].rotateAngleY = -3.14159265F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[120].setRotationPoint(-10.5F, -1F, 1.9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[121].setRotationPoint(15.45F, -4F, 8.9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[122].setRotationPoint(24.45F, -4F, -8.9F);
		bodyModel[122].rotateAngleY = -3.14159265F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[123].setRotationPoint(21.5F, -9F, -1.9F);
		bodyModel[123].rotateAngleY = -3.14159265F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[124].setRotationPoint(24.5F, -2F, -1.9F);
		bodyModel[124].rotateAngleY = -3.14159265F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[125].setRotationPoint(20.45F, -4F, -2.9F);
		bodyModel[125].rotateAngleY = -6.28318531F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[126].setRotationPoint(24.5F, -1F, -1.9F);
		bodyModel[126].rotateAngleY = -3.14159265F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[127].setRotationPoint(31.45F, -4F, -3.9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[128].setRotationPoint(34.5F, -9F, -9.9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[129].setRotationPoint(31.5F, -2F, -9.9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[130].setRotationPoint(35.45F, -4F, -8.9F);
		bodyModel[130].rotateAngleY = -3.14159265F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[131].setRotationPoint(31.5F, -1F, -9.9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[132].setRotationPoint(8.45F, -4F, -8.9F);
		bodyModel[132].rotateAngleY = -3.14159265F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[133].setRotationPoint(5.5F, -9F, -1.9F);
		bodyModel[133].rotateAngleY = -3.14159265F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[134].setRotationPoint(8.5F, -2F, -1.9F);
		bodyModel[134].rotateAngleY = -3.14159265F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[135].setRotationPoint(4.45F, -4F, -2.9F);
		bodyModel[135].rotateAngleY = -6.28318531F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[136].setRotationPoint(8.5F, -1F, -1.9F);
		bodyModel[136].rotateAngleY = -3.14159265F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[137].setRotationPoint(18.5F, -9F, -9.9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[138].setRotationPoint(15.5F, -2F, -9.9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[139].setRotationPoint(19.45F, -4F, -8.9F);
		bodyModel[139].rotateAngleY = -3.14159265F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[140].setRotationPoint(15.5F, -1F, -9.9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[141].setRotationPoint(-17.55F, -4F, -8.9F);
		bodyModel[141].rotateAngleY = -3.14159265F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 7, 7, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[142].setRotationPoint(-20.5F, -9F, -2.9F);
		bodyModel[142].rotateAngleY = -3.14159265F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[143].setRotationPoint(-17.5F, -2F, -2.9F);
		bodyModel[143].rotateAngleY = -3.14159265F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[144].setRotationPoint(-21.55F, -4F, -3.9F);
		bodyModel[144].rotateAngleY = -6.28318531F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 2, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[145].setRotationPoint(-17.5F, -1F, -2.9F);
		bodyModel[145].rotateAngleY = -3.14159265F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[146].setRotationPoint(-10.55F, -4F, -2.9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[147].setRotationPoint(-7.5F, -9F, -9.9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[148].setRotationPoint(-10.5F, -2F, -9.9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[149].setRotationPoint(-6.55F, -4F, -8.9F);
		bodyModel[149].rotateAngleY = -3.14159265F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[150].setRotationPoint(-10.5F, -1F, -9.9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[151].setRotationPoint(15.45F, -4F, -2.9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[152].setRotationPoint(-1.55F, -4F, 2.9F);
		bodyModel[152].rotateAngleY = -3.14159265F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[153].setRotationPoint(-4.5F, -9F, 9.9F);
		bodyModel[153].rotateAngleY = -3.14159265F;

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[154].setRotationPoint(-1.5F, -2F, 9.9F);
		bodyModel[154].rotateAngleY = -3.14159265F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[155].setRotationPoint(-5.55F, -4F, 8.9F);
		bodyModel[155].rotateAngleY = -6.28318531F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[156].setRotationPoint(-1.5F, -1F, 9.9F);
		bodyModel[156].rotateAngleY = -3.14159265F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 7
		bodyModel[157].setRotationPoint(-1.55F, -4F, -8.9F);
		bodyModel[157].rotateAngleY = -3.14159265F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,-1F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 163
		bodyModel[158].setRotationPoint(-4.5F, -9F, -1.9F);
		bodyModel[158].rotateAngleY = -3.14159265F;

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F); // Box 165
		bodyModel[159].setRotationPoint(-1.5F, -2F, -1.9F);
		bodyModel[159].rotateAngleY = -3.14159265F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 6
		bodyModel[160].setRotationPoint(-5.55F, -4F, -2.9F);
		bodyModel[160].rotateAngleY = -6.28318531F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[161].setRotationPoint(-1.5F, -1F, -1.9F);
		bodyModel[161].rotateAngleY = -3.14159265F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 58, 3, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 2
		bodyModel[162].setRotationPoint(-22F, -20F, 9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 58, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[163].setRotationPoint(-22F, -20F, -10F);
	}
}