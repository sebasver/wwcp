//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.08.2020 - 02:14:53
// Last changed on: 23.08.2020 - 02:14:53

package wwcp.models.freight; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class DSBCarE extends ModelBase//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public DSBCarE() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[186];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 38
		bodyModel[4] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 39
		bodyModel[5] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 43
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46
		bodyModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 396
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 397
		bodyModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 398
		bodyModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 12
		bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 13
		bodyModel[20] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 14
		bodyModel[21] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 15
		bodyModel[22] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 16
		bodyModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 17
		bodyModel[24] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 18
		bodyModel[25] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 171
		bodyModel[26] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 172
		bodyModel[27] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 173
		bodyModel[28] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 174
		bodyModel[29] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 175
		bodyModel[30] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 176
		bodyModel[31] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 177
		bodyModel[32] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 182
		bodyModel[33] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 183
		bodyModel[34] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 184
		bodyModel[35] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 188
		bodyModel[36] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 189
		bodyModel[37] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 190
		bodyModel[38] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 191
		bodyModel[39] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 192
		bodyModel[40] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 193
		bodyModel[41] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 194
		bodyModel[42] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 351
		bodyModel[43] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 351
		bodyModel[44] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 351
		bodyModel[45] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 351
		bodyModel[46] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 351
		bodyModel[47] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 351
		bodyModel[48] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 351
		bodyModel[49] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 351
		bodyModel[50] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 11
		bodyModel[51] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 11
		bodyModel[52] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 351
		bodyModel[53] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 351
		bodyModel[54] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 351
		bodyModel[55] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 112
		bodyModel[56] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 113
		bodyModel[57] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 39
		bodyModel[58] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 105
		bodyModel[59] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 108
		bodyModel[60] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 109
		bodyModel[61] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 112
		bodyModel[62] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 113
		bodyModel[63] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 114
		bodyModel[64] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 351
		bodyModel[65] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 351
		bodyModel[66] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 351
		bodyModel[67] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 351
		bodyModel[68] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 351
		bodyModel[69] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 351
		bodyModel[70] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 351
		bodyModel[71] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 351
		bodyModel[72] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 11
		bodyModel[73] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 11
		bodyModel[74] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 351
		bodyModel[75] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 351
		bodyModel[76] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 351
		bodyModel[77] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 112
		bodyModel[78] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 113
		bodyModel[79] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 113
		bodyModel[80] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 114
		bodyModel[81] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 146
		bodyModel[82] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 147
		bodyModel[83] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 184
		bodyModel[84] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 185
		bodyModel[85] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 186
		bodyModel[86] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 187
		bodyModel[87] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 188
		bodyModel[88] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 189
		bodyModel[89] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 146
		bodyModel[90] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 147
		bodyModel[91] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 32
		bodyModel[92] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 32
		bodyModel[93] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 5
		bodyModel[94] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 6
		bodyModel[95] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 6
		bodyModel[96] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 5
		bodyModel[97] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 5
		bodyModel[98] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 6
		bodyModel[99] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 6
		bodyModel[100] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 5
		bodyModel[101] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 46
		bodyModel[102] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 46
		bodyModel[103] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 46
		bodyModel[104] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 5
		bodyModel[105] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 5
		bodyModel[106] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 5
		bodyModel[107] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 5
		bodyModel[108] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 5
		bodyModel[109] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 5
		bodyModel[110] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 42
		bodyModel[111] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 43
		bodyModel[112] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 32
		bodyModel[113] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 32
		bodyModel[114] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 5
		bodyModel[115] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 6
		bodyModel[116] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 6
		bodyModel[117] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 5
		bodyModel[118] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 5
		bodyModel[119] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 6
		bodyModel[120] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 6
		bodyModel[121] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 5
		bodyModel[122] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 5
		bodyModel[123] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 5
		bodyModel[124] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 5
		bodyModel[125] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 5
		bodyModel[126] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 5
		bodyModel[127] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 5
		bodyModel[128] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 6
		bodyModel[129] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 5
		bodyModel[130] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 6
		bodyModel[131] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 5
		bodyModel[132] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 112
		bodyModel[133] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 112
		bodyModel[134] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 5
		bodyModel[135] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 5
		bodyModel[136] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 5
		bodyModel[137] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 5
		bodyModel[138] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 5
		bodyModel[139] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 5
		bodyModel[140] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 5
		bodyModel[141] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 5
		bodyModel[142] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 46
		bodyModel[143] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 46
		bodyModel[144] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 46
		bodyModel[145] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 46
		bodyModel[146] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 6
		bodyModel[147] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 5
		bodyModel[148] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 6
		bodyModel[149] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 5
		bodyModel[150] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 5
		bodyModel[151] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 5
		bodyModel[152] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 5
		bodyModel[153] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 5
		bodyModel[154] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 5
		bodyModel[155] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 5
		bodyModel[156] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 5
		bodyModel[157] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 5
		bodyModel[158] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 112
		bodyModel[159] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 112
		bodyModel[160] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 112
		bodyModel[161] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 112
		bodyModel[162] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 112
		bodyModel[163] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 112
		bodyModel[164] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 112
		bodyModel[165] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 112
		bodyModel[166] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 6
		bodyModel[167] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 5
		bodyModel[168] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 6
		bodyModel[169] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 5
		bodyModel[170] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 5
		bodyModel[171] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 6
		bodyModel[172] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 5
		bodyModel[173] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 6
		bodyModel[174] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 5
		bodyModel[175] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 5
		bodyModel[176] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 5
		bodyModel[177] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 5
		bodyModel[178] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 157
		bodyModel[179] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 155
		bodyModel[180] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 157
		bodyModel[181] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 155
		bodyModel[182] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 157
		bodyModel[183] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 155
		bodyModel[184] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 157
		bodyModel[185] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 155

		bodyModel[0].addBox(0F, 0F, 0F, 72, 2, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-34F, 0.5F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 13, 20, 0F); // Box 1
		bodyModel[1].setRotationPoint(-34F, -12.5F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 13, 20, 0F); // Box 2
		bodyModel[2].setRotationPoint(37F, -12.5F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 38
		bodyModel[3].setRotationPoint(37F, 2.5F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		bodyModel[4].setRotationPoint(-34F, 2.5F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 27, 13, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[5].setRotationPoint(-33F, -12.5F, 9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 27, 13, 1, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 43
		bodyModel[6].setRotationPoint(10F, -12.5F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[7].setRotationPoint(38F, -12.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F); // Box 396
		bodyModel[8].setRotationPoint(-35F, 1F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 397
		bodyModel[9].setRotationPoint(-36.25F, 2F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 398
		bodyModel[10].setRotationPoint(-37.25F, 1F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-39.5F, 0F, 7.45F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(-39.5F, 0F, 6.45F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(-39.5F, 0F, 5.45F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-39.5F, 1F, 5.45F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 16
		bodyModel[15].setRotationPoint(-39.5F, 2F, 7.45F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-39.5F, 2F, 6.45F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-39.5F, 2F, 5.45F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 12
		bodyModel[18].setRotationPoint(-39.5F, 0F, -6.55F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[19].setRotationPoint(-39.5F, 0F, -7.55F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 14
		bodyModel[20].setRotationPoint(-39.5F, 0F, -8.55F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		bodyModel[21].setRotationPoint(-39.5F, 1F, -8.55F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 16
		bodyModel[22].setRotationPoint(-39.5F, 2F, -6.55F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 17
		bodyModel[23].setRotationPoint(-39.5F, 2F, -7.55F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 18
		bodyModel[24].setRotationPoint(-39.5F, 2F, -8.55F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 171
		bodyModel[25].setRotationPoint(42F, 0F, 6.55F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 172
		bodyModel[26].setRotationPoint(42F, 0F, 7.55F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 173
		bodyModel[27].setRotationPoint(42F, 1F, 5.55F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 174
		bodyModel[28].setRotationPoint(42F, 2F, 7.55F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 175
		bodyModel[29].setRotationPoint(42F, 2F, 5.55F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 176
		bodyModel[30].setRotationPoint(42F, 2F, 6.55F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 177
		bodyModel[31].setRotationPoint(42F, 0F, 5.55F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 182
		bodyModel[32].setRotationPoint(38F, 1F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 183
		bodyModel[33].setRotationPoint(40.25F, 1F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 184
		bodyModel[34].setRotationPoint(40.25F, 2F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 188
		bodyModel[35].setRotationPoint(42F, 2F, -8.45F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
		bodyModel[36].setRotationPoint(42F, 2F, -7.45F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 190
		bodyModel[37].setRotationPoint(42F, 2F, -6.45F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 191
		bodyModel[38].setRotationPoint(42F, 1F, -8.45F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 192
		bodyModel[39].setRotationPoint(42F, 0F, -8.45F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 193
		bodyModel[40].setRotationPoint(42F, 0F, -7.45F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 194
		bodyModel[41].setRotationPoint(42F, 0F, -6.45F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 351
		bodyModel[42].setRotationPoint(20.4F, 3.5F, -7.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 351
		bodyModel[43].setRotationPoint(20.4F, 3.5F, 6.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[44].setRotationPoint(17.4F, 3.5F, -7.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[45].setRotationPoint(17.4F, 2.5F, -7.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[46].setRotationPoint(29.4F, 3.5F, -7.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[47].setRotationPoint(17.4F, 3.5F, 6.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[48].setRotationPoint(17.4F, 2.5F, 6.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[49].setRotationPoint(29.4F, 3.5F, 6.25F);

		bodyModel[50].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[50].setRotationPoint(21F, 3F, 6F);

		bodyModel[51].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[51].setRotationPoint(21F, 3F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[52].setRotationPoint(23.4F, 5.5F, -8.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[53].setRotationPoint(23.4F, 5.5F, 6.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[54].setRotationPoint(23.4F, 5.5F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -1.5F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -1.5F, -1F, -0.5F); // Box 112
		bodyModel[55].setRotationPoint(19.15F, 4.5F, -7.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, -0.5F, 0F, -0.25F, -0.5F); // Box 113
		bodyModel[56].setRotationPoint(24.65F, 4.5F, -7.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[57].setRotationPoint(-34F, 0.5F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[58].setRotationPoint(-34F, 0.5F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 108
		bodyModel[59].setRotationPoint(36F, 0.5F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 109
		bodyModel[60].setRotationPoint(36F, 0.5F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 70, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[61].setRotationPoint(-33F, -0.5F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -1.5F, -1F, -0.5F, -1.5F, -1F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[62].setRotationPoint(24.65F, 4.5F, 6.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -1.5F, -1F, 0F); // Box 114
		bodyModel[63].setRotationPoint(19.15F, 4.5F, 6.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 351
		bodyModel[64].setRotationPoint(-24.4F, 3.5F, -7.25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 351
		bodyModel[65].setRotationPoint(-24.4F, 3.5F, 6.25F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[66].setRotationPoint(-27.4F, 3.5F, -7.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[67].setRotationPoint(-27.4F, 2.5F, -7.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[68].setRotationPoint(-15.4F, 3.5F, -7.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[69].setRotationPoint(-27.4F, 3.5F, 6.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[70].setRotationPoint(-27.4F, 2.5F, 6.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[71].setRotationPoint(-15.4F, 3.5F, 6.25F);

		bodyModel[72].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[72].setRotationPoint(-23.8F, 3F, 6F);

		bodyModel[73].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[73].setRotationPoint(-23.8F, 3F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[74].setRotationPoint(-21.4F, 5.5F, -8.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[75].setRotationPoint(-21.4F, 5.5F, 6.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[76].setRotationPoint(-21.4F, 5.5F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, -1.5F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -1.5F, -1F, -0.5F); // Box 112
		bodyModel[77].setRotationPoint(-25.65F, 4.5F, -7.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, -0.5F, 0F, -0.25F, -0.5F); // Box 113
		bodyModel[78].setRotationPoint(-20.15F, 4.5F, -7.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -1.5F, -1F, -0.5F, -1.5F, -1F, 0F, 0F, -0.25F, 0F); // Box 113
		bodyModel[79].setRotationPoint(-20.15F, 4.5F, 6.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -1.5F, -1F, 0F); // Box 114
		bodyModel[80].setRotationPoint(-26.65F, 4.5F, 6.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 146
		bodyModel[81].setRotationPoint(23.65F, 4.5F, 6.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 147
		bodyModel[82].setRotationPoint(-21.15F, 4.5F, 6.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 184
		bodyModel[83].setRotationPoint(-34F, 3.4F, 9.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[84].setRotationPoint(-35.5F, 4.4F, 8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 186
		bodyModel[85].setRotationPoint(-36F, 4.65F, 9.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 187
		bodyModel[86].setRotationPoint(37.5F, 4.65F, -8.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[87].setRotationPoint(38F, 4.4F, -9.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[88].setRotationPoint(37F, 3.4F, -8.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 146
		bodyModel[89].setRotationPoint(23.65F, 4.5F, -8.25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 147
		bodyModel[90].setRotationPoint(-21.15F, 4.5F, -8.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 13, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 32
		bodyModel[91].setRotationPoint(1.5F, -12.5F, 9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 13, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 32
		bodyModel[92].setRotationPoint(-6F, -12.5F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[93].setRotationPoint(28.75F, -12.5F, 9.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[94].setRotationPoint(19F, -12.5F, 9.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[95].setRotationPoint(9.75F, -12.5F, 9.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[96].setRotationPoint(37.5F, -12.5F, 9.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[97].setRotationPoint(-15.75F, -12.5F, 9.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[98].setRotationPoint(-25.5F, -12.5F, 9.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[99].setRotationPoint(-34F, -12.5F, 9.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[100].setRotationPoint(-6.5F, -12.5F, 9.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[101].setRotationPoint(38F, -12.5F, 8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[102].setRotationPoint(38F, -12.5F, -3.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[103].setRotationPoint(38F, -12.5F, 2.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 5
		bodyModel[104].setRotationPoint(28.5F, -12.5F, 9.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 5
		bodyModel[105].setRotationPoint(18.75F, -12.5F, 9.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 5
		bodyModel[106].setRotationPoint(10F, -12.5F, 9.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 5
		bodyModel[107].setRotationPoint(-15.5F, -12.5F, 9.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 5
		bodyModel[108].setRotationPoint(-25.75F, -12.5F, 9.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[109].setRotationPoint(-33.5F, -12.5F, 9.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 27, 13, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 42
		bodyModel[110].setRotationPoint(10F, -12.5F, -10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 27, 13, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[111].setRotationPoint(-33F, -12.5F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 8, 13, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 32
		bodyModel[112].setRotationPoint(-5.5F, -12.5F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 13, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 32
		bodyModel[113].setRotationPoint(2F, -12.5F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 5
		bodyModel[114].setRotationPoint(-25.75F, -12.5F, -10.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 6
		bodyModel[115].setRotationPoint(-16F, -12.5F, -10.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 6
		bodyModel[116].setRotationPoint(-6.75F, -12.5F, -10.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 5
		bodyModel[117].setRotationPoint(-34.5F, -12.5F, -10.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 5
		bodyModel[118].setRotationPoint(18.75F, -12.5F, -10.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 6
		bodyModel[119].setRotationPoint(28.5F, -12.5F, -10.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 6
		bodyModel[120].setRotationPoint(37F, -12.5F, -10.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 5
		bodyModel[121].setRotationPoint(9.5F, -12.5F, -10.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[122].setRotationPoint(-33.5F, -12.5F, -10.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[123].setRotationPoint(-24.75F, -12.5F, -10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[124].setRotationPoint(-15F, -12.5F, -10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[125].setRotationPoint(10.5F, -12.5F, -10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[126].setRotationPoint(19.75F, -12.5F, -10.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[127].setRotationPoint(29.5F, -12.5F, -10.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F); // Box 6
		bodyModel[128].setRotationPoint(37.75F, -12.5F, 9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[129].setRotationPoint(38F, -13F, -9.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 6
		bodyModel[130].setRotationPoint(37.75F, -12.5F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[131].setRotationPoint(38F, -0.5F, -9.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[132].setRotationPoint(-6.5F, 0.5F, 8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 112
		bodyModel[133].setRotationPoint(-6.5F, 0.5F, -10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[134].setRotationPoint(38F, -0.5F, 8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[135].setRotationPoint(38F, 0F, 8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[136].setRotationPoint(38F, -0.5F, 2.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[137].setRotationPoint(38F, 0F, 2.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[138].setRotationPoint(38F, -0.5F, -3.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[139].setRotationPoint(38F, 0F, -3.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[140].setRotationPoint(38F, -0.5F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[141].setRotationPoint(38F, 0F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[142].setRotationPoint(-35F, -12.5F, 8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[143].setRotationPoint(-35F, -12.5F, -9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[144].setRotationPoint(-35F, -12.5F, 2.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[145].setRotationPoint(-35F, -12.5F, -3.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 6
		bodyModel[146].setRotationPoint(-34.75F, -12.5F, -10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[147].setRotationPoint(-35F, -13F, -9.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 6
		bodyModel[148].setRotationPoint(-34.75F, -12.5F, 9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 5
		bodyModel[149].setRotationPoint(-35F, -0.5F, -9.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[150].setRotationPoint(-35F, -0.5F, -9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 5
		bodyModel[151].setRotationPoint(-35F, 0F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[152].setRotationPoint(-35F, -0.5F, -3.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 5
		bodyModel[153].setRotationPoint(-35F, 0F, -3.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[154].setRotationPoint(-35F, -0.5F, 2.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 5
		bodyModel[155].setRotationPoint(-35F, 0F, 2.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[156].setRotationPoint(-35F, -0.5F, 8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 5
		bodyModel[157].setRotationPoint(-35F, 0F, 8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[158].setRotationPoint(19F, 0.5F, 8F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[159].setRotationPoint(28.75F, 0.5F, 8F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[160].setRotationPoint(-15.75F, 0.5F, 8F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[161].setRotationPoint(-25.5F, 0.5F, 8F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[162].setRotationPoint(-25.25F, 0.5F, -10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[163].setRotationPoint(-15.5F, 0.5F, -10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[164].setRotationPoint(19.25F, 0.5F, -10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[165].setRotationPoint(29F, 0.5F, -10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 6
		bodyModel[166].setRotationPoint(-6.75F, 2.5F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 5
		bodyModel[167].setRotationPoint(-6.5F, 6F, 5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 6
		bodyModel[168].setRotationPoint(9.5F, 2.5F, 5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, -0.75F, 3.5F, -0.5F, -0.75F, 3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[169].setRotationPoint(10.5F, 6F, 5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.75F, 3.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 3.5F, 0F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -4.5F, 0F); // Box 5
		bodyModel[170].setRotationPoint(-13.25F, 6F, 5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 6
		bodyModel[171].setRotationPoint(-6.75F, 2.5F, -6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F); // Box 5
		bodyModel[172].setRotationPoint(-6.5F, 6F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F); // Box 6
		bodyModel[173].setRotationPoint(9.5F, 2.5F, -6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, -0.75F, 3.5F, 0F, -0.75F, 3.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[174].setRotationPoint(10.5F, 6F, -6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.75F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 3.5F, -0.5F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -4.5F, -0.5F); // Box 5
		bodyModel[175].setRotationPoint(-13.25F, 6F, -6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[176].setRotationPoint(-2F, -9.5F, 9.25F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 5
		bodyModel[177].setRotationPoint(-2F, -9.5F, -10.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 157
		bodyModel[178].setRotationPoint(-38.5F, 0.25F, 6.2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 155
		bodyModel[179].setRotationPoint(-37F, 0.5F, 5.95F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 157
		bodyModel[180].setRotationPoint(-38.5F, 0.25F, -7.8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 155
		bodyModel[181].setRotationPoint(-37F, 0.5F, -8.05F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 157
		bodyModel[182].setRotationPoint(41.5F, 0.25F, -8.2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[183].setRotationPoint(38F, 0.5F, -7.95F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 157
		bodyModel[184].setRotationPoint(41.5F, 0.25F, 5.8F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[185].setRotationPoint(38F, 0.5F, 6.05F);
	}
}