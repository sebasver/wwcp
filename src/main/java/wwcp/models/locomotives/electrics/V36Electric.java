//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.06.2018 - 12:34:00
// Last changed on: 09.06.2018 - 12:34:00

package wwcp.models.locomotives.electrics; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class V36Electric extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public V36Electric() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[198];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 145, 2, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 26, 85, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Test
		bodyModel[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 1
		bodyModel[11] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 225, 2, textureX, textureY); // Box 1
		bodyModel[13] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 1
		bodyModel[14] = new ModelRendererTurbo(this, 363, 2, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 217, 26, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 1
		bodyModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 1
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 1
		bodyModel[22] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 497, 10, textureX, textureY); // Box 1
		bodyModel[40] = new ModelRendererTurbo(this, 449, 34, textureX, textureY); // Box 1
		bodyModel[41] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 1
		bodyModel[42] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 1
		bodyModel[43] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 1
		bodyModel[44] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 1
		bodyModel[45] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 1
		bodyModel[46] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 1
		bodyModel[47] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		bodyModel[48] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 0
		bodyModel[50] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 0
		bodyModel[51] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1
		bodyModel[52] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1
		bodyModel[53] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 114
		bodyModel[54] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 235
		bodyModel[55] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 236
		bodyModel[56] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 237
		bodyModel[57] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 238
		bodyModel[58] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 239
		bodyModel[59] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 240
		bodyModel[60] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 241
		bodyModel[61] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 243
		bodyModel[62] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 244
		bodyModel[63] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 245
		bodyModel[64] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 246
		bodyModel[65] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 247
		bodyModel[66] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 248
		bodyModel[67] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 249
		bodyModel[68] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 417
		bodyModel[69] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 30
		bodyModel[70] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1
		bodyModel[71] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 1
		bodyModel[72] = new ModelRendererTurbo(this, 322, 67, textureX, textureY); // Box 0
		bodyModel[73] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 0
		bodyModel[74] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 0
		bodyModel[75] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 1
		bodyModel[76] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 1
		bodyModel[77] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 1
		bodyModel[78] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 1
		bodyModel[79] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 1
		bodyModel[80] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 1
		bodyModel[81] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 1
		bodyModel[82] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 1
		bodyModel[83] = new ModelRendererTurbo(this, 449, 50, textureX, textureY); // Box 1
		bodyModel[84] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 1
		bodyModel[85] = new ModelRendererTurbo(this, 465, 50, textureX, textureY); // Box 1
		bodyModel[86] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 1
		bodyModel[87] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 1
		bodyModel[88] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 1
		bodyModel[91] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 1
		bodyModel[92] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 1
		bodyModel[93] = new ModelRendererTurbo(this, 297, 58, textureX, textureY); // Box 1
		bodyModel[94] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 1
		bodyModel[95] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 1
		bodyModel[96] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 1
		bodyModel[97] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 1
		bodyModel[113] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 1
		bodyModel[114] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 1
		bodyModel[118] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 1
		bodyModel[119] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		bodyModel[120] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 1
		bodyModel[121] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 1
		bodyModel[122] = new ModelRendererTurbo(this, 355, 78, textureX, textureY); // Box 1
		bodyModel[123] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 1
		bodyModel[124] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 1
		bodyModel[125] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 1
		bodyModel[126] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 1
		bodyModel[127] = new ModelRendererTurbo(this, 31, 68, textureX, textureY); // Box 139
		bodyModel[128] = new ModelRendererTurbo(this, 37, 73, textureX, textureY); // Numberplate #2
		bodyModel[129] = new ModelRendererTurbo(this, 37, 73, textureX, textureY); // Numberplate #3
		bodyModel[130] = new ModelRendererTurbo(this, 37, 73, textureX, textureY); // Numberplate #4
		bodyModel[131] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 90
		bodyModel[132] = new ModelRendererTurbo(this, 153, 76, textureX, textureY); // Box 90
		bodyModel[133] = new ModelRendererTurbo(this, 169, 76, textureX, textureY); // Box 90
		bodyModel[134] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 90
		bodyModel[135] = new ModelRendererTurbo(this, 153, 76, textureX, textureY); // Box 90
		bodyModel[136] = new ModelRendererTurbo(this, 169, 76, textureX, textureY); // Box 90
		bodyModel[137] = new ModelRendererTurbo(this, 7, 38, textureX, textureY); // Box 90
		bodyModel[138] = new ModelRendererTurbo(this, 5, 26, textureX, textureY); // Box 90
		bodyModel[139] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 52
		bodyModel[140] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 52
		bodyModel[141] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 52
		bodyModel[142] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 52
		bodyModel[143] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 52
		bodyModel[144] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 52
		bodyModel[145] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 2
		bodyModel[146] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 90
		bodyModel[147] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 2
		bodyModel[148] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 90
		bodyModel[149] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 2
		bodyModel[150] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 90
		bodyModel[151] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 1
		bodyModel[152] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Numberplate #3
		bodyModel[153] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Numberplate #3
		bodyModel[154] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 171
		bodyModel[155] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 172
		bodyModel[156] = new ModelRendererTurbo(this, 31, 68, textureX, textureY); // Box 139
		bodyModel[157] = new ModelRendererTurbo(this, 31, 68, textureX, textureY); // Box 139
		bodyModel[158] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 1
		bodyModel[159] = new ModelRendererTurbo(this, 46, 75, textureX, textureY); // Box 144
		bodyModel[160] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 144
		bodyModel[161] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 144
		bodyModel[162] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 144
		bodyModel[163] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 144
		bodyModel[164] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 144
		bodyModel[165] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 144
		bodyModel[166] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 144
		bodyModel[167] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 144
		bodyModel[168] = new ModelRendererTurbo(this, 67, 75, textureX, textureY); // Box 144
		bodyModel[169] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 144
		bodyModel[170] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 144
		bodyModel[171] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 144
		bodyModel[172] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 144
		bodyModel[173] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 144
		bodyModel[174] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 144
		bodyModel[175] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 144
		bodyModel[176] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 144
		bodyModel[177] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 144
		bodyModel[178] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 144
		bodyModel[179] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 144
		bodyModel[180] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 144
		bodyModel[181] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 144
		bodyModel[182] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 144
		bodyModel[183] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 144
		bodyModel[184] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 144
		bodyModel[185] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 144
		bodyModel[186] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 109
		bodyModel[187] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 109
		bodyModel[188] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 108
		bodyModel[189] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 113
		bodyModel[190] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 108
		bodyModel[191] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 108
		bodyModel[192] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 109
		bodyModel[193] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 109
		bodyModel[194] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 108
		bodyModel[195] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 113
		bodyModel[196] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 108
		bodyModel[197] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 108

		bodyModel[0].addShapeBox(0F, 0F, 0F, 59, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-26.5F, -1F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(31.5F, -16F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[2].setRotationPoint(17.5F, -16F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 1
		bodyModel[3].setRotationPoint(16.5F, -17.5F, -11.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[4].setRotationPoint(32.5F, -18F, -1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[5].setRotationPoint(32.5F, -4F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[6].setRotationPoint(32.5F, -4F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[7].setRotationPoint(17.5F, -17F, -10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Test
		bodyModel[8].setRotationPoint(17.5F, -19F, 4.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1
		bodyModel[9].setRotationPoint(16.5F, -17.5F, 10.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 18, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1
		bodyModel[10].setRotationPoint(16.5F, -19.5F, 4.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 18, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[11].setRotationPoint(16.5F, -19.5F, -4.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[12].setRotationPoint(17.5F, -16F, 6F);

		bodyModel[13].addShapeBox(-1F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[13].setRotationPoint(18.5F, -15F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[14].setRotationPoint(17.5F, -16F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 42, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[15].setRotationPoint(-24.5F, -15F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-14.5F, -13F, 5.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 44, 13, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[17].setRotationPoint(-25.5F, -14F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 19, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-14.5F, -13F, -6.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[19].setRotationPoint(-27.5F, -1F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[20].setRotationPoint(-26F, -15F, -1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[21].setRotationPoint(-26.5F, -3F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[22].setRotationPoint(-26.5F, -3F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(10.5F, -18F, -0.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.75F, 0.25F, 0F, -0.75F); // Box 0
		bodyModel[24].setRotationPoint(14.5F, -17F, 2.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 58, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(-26.5F, 0F, -5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[26].setRotationPoint(-26.5F, 0.5F, -9.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 1, 2, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-26.5F, 3.5F, -9.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-26.5F, 1.5F, -10.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-26.5F, 0F, 7F);

		bodyModel[30].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[30].setRotationPoint(-17F, 5.5F, -6F);

		bodyModel[31].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(-6F, 5.5F, -6F);

		bodyModel[32].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[32].setRotationPoint(18F, 5.5F, -6F);

		bodyModel[33].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[33].setRotationPoint(-17F, 5.5F, 6F);

		bodyModel[34].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[34].setRotationPoint(-6F, 5.5F, 6F);

		bodyModel[35].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[35].setRotationPoint(18F, 5.5F, 6F);

		bodyModel[36].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[36].setRotationPoint(6F, 5.5F, 6F);

		bodyModel[37].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[37].setRotationPoint(6F, 5.5F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 37, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 0
		bodyModel[38].setRotationPoint(-18F, 8F, 6.05F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[39].setRotationPoint(25.5F, 0F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[40].setRotationPoint(25.5F, 0F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[41].setRotationPoint(25.5F, -11F, 11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[42].setRotationPoint(31.5F, -11F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 1
		bodyModel[43].setRotationPoint(25.5F, -11F, -12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 0, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 1
		bodyModel[44].setRotationPoint(31.5F, -11F, -12F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 1
		bodyModel[45].setRotationPoint(32.5F, -11F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 10, 0, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 1
		bodyModel[46].setRotationPoint(32.5F, -11F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 0
		bodyModel[47].setRotationPoint(11.5F, 0F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[48].setRotationPoint(11.5F, 2F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[49].setRotationPoint(11.5F, 1F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[50].setRotationPoint(19.5F, 0F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[51].setRotationPoint(31.5F, 7F, -6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[52].setRotationPoint(31.5F, 7F, 5.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[53].setRotationPoint(10.5F, -18F, 0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[54].setRotationPoint(11.5F, -18F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[55].setRotationPoint(9.5F, -18F, -0.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[56].setRotationPoint(10.5F, -18F, -1.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 238
		bodyModel[57].setRotationPoint(10.5F, -19F, 0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[58].setRotationPoint(10.5F, -19F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[59].setRotationPoint(9.5F, -19F, -0.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 241
		bodyModel[60].setRotationPoint(9.5F, -18F, 0.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[61].setRotationPoint(9.5F, -19F, -1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[62].setRotationPoint(9.5F, -18F, -1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[63].setRotationPoint(11.5F, -18F, -1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[64].setRotationPoint(11.5F, -18F, 0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[65].setRotationPoint(11.5F, -19F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[66].setRotationPoint(11.5F, -19F, 0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[67].setRotationPoint(11.5F, -19F, -0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[68].setRotationPoint(10.5F, -19F, -0.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[69].setRotationPoint(9.5F, -19F, 0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[70].setRotationPoint(-27.5F, 7F, -6.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[71].setRotationPoint(-27.5F, 7F, 5.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[72].setRotationPoint(-23.5F, -17F, -5.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 19, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[73].setRotationPoint(-23.5F, -17F, -7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[74].setRotationPoint(-23.5F, -17F, -7.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[75].setRotationPoint(18.5F, -8F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[76].setRotationPoint(18.5F, -8F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 6, 8, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[77].setRotationPoint(18.5F, -7F, -1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[78].setRotationPoint(18.5F, -10F, -3.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[79].setRotationPoint(18F, -18F, 2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[80].setRotationPoint(-27.5F, -8F, 11F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[81].setRotationPoint(-20.5F, -8F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[82].setRotationPoint(-27.5F, -8F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[83].setRotationPoint(-26.5F, 0F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 7, 0, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[84].setRotationPoint(-20.5F, -8F, 11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[85].setRotationPoint(-26.5F, 0F, 11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[86].setRotationPoint(31.5F, 0F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 1
		bodyModel[87].setRotationPoint(-2.5F, -15.5F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 37, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 0
		bodyModel[88].setRotationPoint(-15F, 5F, -6.55F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[89].setRotationPoint(20.5F, 4.5F, -6.55F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 18, 3, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Box 1
		bodyModel[90].setRotationPoint(16.5F, -19.5F, -10.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[91].setRotationPoint(25.5F, -16F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, -1F, 6, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[92].setRotationPoint(25.5F, -15F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[93].setRotationPoint(18.5F, -16F, 10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[94].setRotationPoint(25.5F, -16F, 10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[95].setRotationPoint(25.5F, -15F, 10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[96].setRotationPoint(17.5F, -8F, 6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[97].setRotationPoint(20.5F, 6F, -6.55F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[98].setRotationPoint(8.5F, 4.5F, -6.55F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[99].setRotationPoint(8.5F, 6F, -6.55F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[100].setRotationPoint(-3.5F, 4.5F, -6.55F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[101].setRotationPoint(-3.5F, 6F, -6.55F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[102].setRotationPoint(-14.5F, 4.5F, -6.55F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[103].setRotationPoint(-14.5F, 6F, -6.55F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[104].setRotationPoint(17.5F, 7.5F, 6.05F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[105].setRotationPoint(17.5F, 9F, 6.05F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[106].setRotationPoint(5.5F, 7.5F, 6.05F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[107].setRotationPoint(5.5F, 9F, 6.05F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[108].setRotationPoint(-6.5F, 7.5F, 6.05F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[109].setRotationPoint(-6.5F, 9F, 6.05F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[110].setRotationPoint(-17.5F, 7.5F, 6.05F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[111].setRotationPoint(-17.5F, 9F, 6.05F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 1
		bodyModel[112].setRotationPoint(25.5F, -10F, -5.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1
		bodyModel[113].setRotationPoint(25.5F, -10.5F, -5.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[114].setRotationPoint(-25.5F, -15F, -6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[115].setRotationPoint(-25.5F, -15F, 5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[116].setRotationPoint(-25.5F, -15F, -5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[117].setRotationPoint(17.5F, -17F, 9.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[118].setRotationPoint(17.5F, -17F, -9.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[119].setRotationPoint(17.5F, -19F, -5.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[120].setRotationPoint(17.5F, -19F, -4.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[121].setRotationPoint(31.5F, -17F, -10.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 1
		bodyModel[122].setRotationPoint(31.5F, -19F, 4.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 1
		bodyModel[123].setRotationPoint(31.5F, -17F, 9.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[124].setRotationPoint(31.5F, -17F, -9.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[125].setRotationPoint(31.5F, -19F, -5.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[126].setRotationPoint(31.5F, -19F, -4.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0.5F, 0, 15, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, -23F, 0F, -11.5F, -23F); // Box 139
		bodyModel[127].setRotationPoint(32.6F, -14F, -4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberplate #2
		bodyModel[128].setRotationPoint(17.5F, -2.5F, -11.1F);
		bodyModel[128].rotateAngleY = -1.57079633F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberplate #3
		bodyModel[129].setRotationPoint(17.5F, -2.5F, 11.1F);
		bodyModel[129].rotateAngleY = -1.57079633F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 0, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Numberplate #4
		bodyModel[130].setRotationPoint(32.6F, -14F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 90
		bodyModel[131].setRotationPoint(22.25F, -9F, 9.25F);
		bodyModel[131].rotateAngleY = -1.1693706F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.6F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 90
		bodyModel[132].setRotationPoint(22.25F, -8.6F, 9.25F);
		bodyModel[132].rotateAngleY = -1.1693706F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.6F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 90
		bodyModel[133].setRotationPoint(22.25F, -9.4F, 9.25F);
		bodyModel[133].rotateAngleY = -1.1693706F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 90
		bodyModel[134].setRotationPoint(24.25F, -9F, 8.25F);
		bodyModel[134].rotateAngleY = -1.1693706F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.6F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 90
		bodyModel[135].setRotationPoint(24.25F, -8.6F, 8.25F);
		bodyModel[135].rotateAngleY = -1.1693706F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.6F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, -0.6F, -0.3F, -0.6F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 90
		bodyModel[136].setRotationPoint(24.25F, -9.4F, 8.25F);
		bodyModel[136].rotateAngleY = -1.1693706F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 90
		bodyModel[137].setRotationPoint(25.2F, -7F, 0F);
		bodyModel[137].rotateAngleZ = 1.37881011F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[138].setRotationPoint(25.1F, -7F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[139].setRotationPoint(32.63F, -18F, 0F);

		bodyModel[140].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[140].setRotationPoint(32.63F, -4F, 7F);

		bodyModel[141].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[141].setRotationPoint(32.63F, -4F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[142].setRotationPoint(-27F, -15F, 0F);

		bodyModel[143].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[143].setRotationPoint(-27.5F, -3F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[144].setRotationPoint(-27.5F, -3F, -7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 7, 0, 7, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F); // Box 2
		bodyModel[145].setRotationPoint(26F, -5F, 3.5F);
		bodyModel[145].rotateAngleZ = 1.57079633F;

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 90
		bodyModel[146].setRotationPoint(24F, -7F, 4.2F);

		bodyModel[147].addShapeBox(-1.5F, 0F, -1.5F, 7, 0, 7, 0F,-0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 2
		bodyModel[147].setRotationPoint(19F, -10.5F, 3F);
		bodyModel[147].rotateAngleZ = 1.57079633F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, -0.7F, 0F, -0.35F, -0.7F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.7F, 0F, -0.35F, -0.7F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 90
		bodyModel[148].setRotationPoint(17F, -11F, 2.15F);

		bodyModel[149].addShapeBox(-1.5F, 0F, -1.5F, 7, 0, 7, 0F,-0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -4.5F, 0F, -4.5F, -0.5F, 0F, -4.5F); // Box 2
		bodyModel[149].setRotationPoint(19F, -10.5F, -4.75F);
		bodyModel[149].rotateAngleZ = 1.57079633F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, -0.7F, 0F, -0.35F, -0.7F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.7F, 0F, -0.35F, -0.7F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 90
		bodyModel[150].setRotationPoint(17F, -11F, -5.6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[151].setRotationPoint(17.9F, -11.25F, -5.25F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 144, 144, 1, 0F,0F, 0F, 0F, -140F, 0F, 0F, -140F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -140F, 0F, -140F, -140F, 0F, -140F, -140F, -0.8F, 0F, -140F, -0.8F); // Numberplate #3
		bodyModel[152].setRotationPoint(19.5F, -7F, 11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 200, 24, 1, 0F,0F, 0F, 0F, -193F, 0F, 0F, -193F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -23F, 0F, -193F, -23F, 0F, -193F, -23F, -0.8F, 0F, -23F, -0.8F); // Numberplate #3
		bodyModel[153].setRotationPoint(18F, -4.5F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 144, 144, 1, 0F,0F, 0F, -0.8F, -140F, 0F, -0.8F, -140F, 0F, 0F, 0F, 0F, 0F, 0F, -140F, -0.8F, -140F, -140F, -0.8F, -140F, -140F, 0F, 0F, -140F, 0F); // Box 171
		bodyModel[154].setRotationPoint(19.5F, -7F, -12F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 200, 24, 1, 0F,0F, 0F, -0.8F, -193F, 0F, -0.8F, -193F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, -0.8F, -193F, -23F, -0.8F, -193F, -23F, 0F, 0F, -23F, 0F); // Box 172
		bodyModel[155].setRotationPoint(18F, -4.5F, -12F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 15, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, -23F, 0F, -11.5F, -23F); // Box 139
		bodyModel[156].setRotationPoint(18F, -7F, -11.1F);
		bodyModel[156].rotateAngleY = -1.57079633F;

		bodyModel[157].addShapeBox(0F, 0F, 0F, 0, 15, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, -23F, 0F, -11.5F, -23F); // Box 139
		bodyModel[157].setRotationPoint(18F, -7F, 11.1F);
		bodyModel[157].rotateAngleY = -1.57079633F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[158].setRotationPoint(17.5F, -15F, -6F);

		bodyModel[159].addBox(0F, 0F, 0F, 8, 2, 0, 0F); // Box 144
		bodyModel[159].setRotationPoint(-12F, -17F, -5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -6F, -0.75F, 0F, 5.5F, -0.75F, 0F, 5.5F, -0.75F, -0.5F, -6F, -0.75F, -0.5F); // Box 144
		bodyModel[160].setRotationPoint(-8F, -37F, -3.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -6F, -0.75F, 0F, 5.5F, -0.75F, 0F, 5.5F, -0.75F, -0.5F, -6F, -0.75F, -0.5F); // Box 144
		bodyModel[161].setRotationPoint(-8F, -37F, 4F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 6F, -0.75F, 0F, -6.5F, -0.75F, 0F, -6.5F, -0.75F, -0.5F, 6F, -0.75F, -0.5F); // Box 144
		bodyModel[162].setRotationPoint(-8.5F, -37F, -3.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 6F, -0.75F, 0F, -6.5F, -0.75F, 0F, -6.5F, -0.75F, -0.5F, 6F, -0.75F, -0.5F); // Box 144
		bodyModel[163].setRotationPoint(-8.5F, -37F, 4F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,-1F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, 3F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 144
		bodyModel[164].setRotationPoint(-3F, -27.5F, -3.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,-1F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, 3F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, 3F, 0F, -0.5F); // Box 144
		bodyModel[165].setRotationPoint(-3F, -27.5F, 4F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, -7.5F, -0.5F, 0F, -7.5F, -0.5F, 0F, 7F, 0F, 0F, 7F, 6F, -0.75F, 0F, -6.5F, -0.75F, 0F, -6.5F, -0.75F, -0.5F, 6F, -0.75F, -0.5F); // Box 144
		bodyModel[166].setRotationPoint(-8.5F, -37F, -3.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0F, 0F, 7.5F, -0.5F, 0F, 7.5F, -0.5F, 0F, -8F, 0F, 0F, -8F, 6F, -0.75F, 0F, -6.5F, -0.75F, 0F, -6.5F, -0.75F, -0.5F, 6F, -0.75F, -0.5F); // Box 144
		bodyModel[167].setRotationPoint(-8.5F, -37F, 4F);

		bodyModel[168].addBox(0F, 0F, 0F, 8, 2, 0, 0F); // Box 144
		bodyModel[168].setRotationPoint(-12F, -17F, 5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 144
		bodyModel[169].setRotationPoint(-6F, -16.5F, -5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 144
		bodyModel[170].setRotationPoint(-10.5F, -16.5F, -5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 144
		bodyModel[171].setRotationPoint(-10.5F, -16F, -1.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0.5F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -3.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 144
		bodyModel[172].setRotationPoint(-14F, -27.5F, -3.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0.5F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -3.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 144
		bodyModel[173].setRotationPoint(-14F, -27.5F, 4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 11, 0, 0F,0.5F, -0.75F, -7.5F, -1F, -0.75F, -7.5F, -1F, -0.75F, 7F, 0.5F, -0.75F, 7F, -3.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 144
		bodyModel[174].setRotationPoint(-14F, -27.5F, -3.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 0, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 144
		bodyModel[175].setRotationPoint(-10F, -37F, -5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 144
		bodyModel[176].setRotationPoint(-10F, -37F, -6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 144
		bodyModel[177].setRotationPoint(-10F, -37F, 5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 0, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 144
		bodyModel[178].setRotationPoint(-7.5F, -37F, -5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 144
		bodyModel[179].setRotationPoint(-7.5F, -37F, -6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 144
		bodyModel[180].setRotationPoint(-7.5F, -37F, 5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 144
		bodyModel[181].setRotationPoint(-9F, -37F, 4.5F);
		bodyModel[181].rotateAngleY = -1.57079633F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 144
		bodyModel[182].setRotationPoint(-9F, -37F, -3F);
		bodyModel[182].rotateAngleY = -1.57079633F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 0, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 144
		bodyModel[183].setRotationPoint(-8.75F, -37F, -5.25F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 144
		bodyModel[184].setRotationPoint(-8.75F, -37F, -6.25F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 144
		bodyModel[185].setRotationPoint(-8.75F, -37F, 5.25F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -3.25F, -0.75F, -0.25F, -3.25F, -0.75F, -3.25F, -0.25F, 0F, -3.25F, -0.25F, 0F, -3.25F, -3.25F, -0.75F, -3.25F, -3.25F); // Box 109
		bodyModel[186].setRotationPoint(-33.5F, 0.5F, -9.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -3.25F, -0.75F, -0.25F, -3.25F, -0.75F, -3.25F, -0.25F, 0F, -3.25F, -0.25F, 0F, -3.25F, -3.25F, -0.75F, -3.25F, -3.25F); // Box 109
		bodyModel[187].setRotationPoint(-33.5F, 0.5F, 6.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[188].setRotationPoint(-32.5F, 1.5F, -8.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[189].setRotationPoint(-32.5F, 1.5F, 7.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 108
		bodyModel[190].setRotationPoint(-30.5F, 1.25F, -8.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 108
		bodyModel[191].setRotationPoint(-30.5F, 1.25F, 7.25F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -3.25F, 0F, -0.25F, -3.25F, 0F, -3.25F, -0.25F, -0.75F, -3.25F, -0.25F, -0.75F, -3.25F, -3.25F, 0F, -3.25F, -3.25F); // Box 109
		bodyModel[192].setRotationPoint(37.5F, 0.5F, -9.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -3.25F, 0F, -0.25F, -3.25F, 0F, -3.25F, -0.25F, -0.75F, -3.25F, -0.25F, -0.75F, -3.25F, -3.25F, 0F, -3.25F, -3.25F); // Box 109
		bodyModel[193].setRotationPoint(37.5F, 0.5F, 6.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[194].setRotationPoint(35.5F, 1.5F, -8.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[195].setRotationPoint(35.5F, 1.5F, 7.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 108
		bodyModel[196].setRotationPoint(32.5F, 1.25F, -8.75F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 108
		bodyModel[197].setRotationPoint(32.5F, 1.25F, 7.25F);
	}
}