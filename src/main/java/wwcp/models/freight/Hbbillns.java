//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.03.2019 - 18:16:07
// Last changed on: 18.03.2019 - 18:16:07

package wwcp.models.freight; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Hbbillns extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Hbbillns() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[192];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 39
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 19
		bodyModel[7] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 160
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 160
		bodyModel[9] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 156
		bodyModel[16] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 156
		bodyModel[17] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 156
		bodyModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 155
		bodyModel[19] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 156
		bodyModel[20] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 287
		bodyModel[22] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 289
		bodyModel[23] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 292
		bodyModel[24] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 11
		bodyModel[25] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 302
		bodyModel[26] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 315
		bodyModel[27] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 321
		bodyModel[28] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 331
		bodyModel[29] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 351
		bodyModel[30] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 352
		bodyModel[31] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 353
		bodyModel[32] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 354
		bodyModel[33] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 355
		bodyModel[34] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 11
		bodyModel[36] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 19
		bodyModel[37] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 289
		bodyModel[38] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 292
		bodyModel[39] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 11
		bodyModel[40] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 302
		bodyModel[41] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 315
		bodyModel[42] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 321
		bodyModel[43] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 325
		bodyModel[44] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 331
		bodyModel[45] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 351
		bodyModel[46] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 352
		bodyModel[47] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 353
		bodyModel[48] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 355
		bodyModel[49] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 358
		bodyModel[50] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 351
		bodyModel[51] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 351
		bodyModel[52] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 351
		bodyModel[53] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 351
		bodyModel[54] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 351
		bodyModel[55] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 351
		bodyModel[56] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 351
		bodyModel[57] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 351
		bodyModel[58] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 11
		bodyModel[59] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 11
		bodyModel[60] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 351
		bodyModel[61] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 351
		bodyModel[62] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 351
		bodyModel[63] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 351
		bodyModel[64] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 351
		bodyModel[65] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 351
		bodyModel[66] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 351
		bodyModel[67] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 351
		bodyModel[68] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 351
		bodyModel[69] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 351
		bodyModel[70] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 351
		bodyModel[71] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 11
		bodyModel[72] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 11
		bodyModel[73] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 351
		bodyModel[74] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 351
		bodyModel[75] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 351
		bodyModel[76] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 157
		bodyModel[77] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 155
		bodyModel[78] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 157
		bodyModel[79] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 155
		bodyModel[80] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 157
		bodyModel[81] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 155
		bodyModel[82] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 157
		bodyModel[83] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 288
		bodyModel[84] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 288
		bodyModel[85] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 288
		bodyModel[86] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 288
		bodyModel[87] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 19
		bodyModel[88] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 19
		bodyModel[89] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 160
		bodyModel[90] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 19
		bodyModel[91] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 19
		bodyModel[92] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 21
		bodyModel[93] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 21
		bodyModel[94] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 160
		bodyModel[95] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 19
		bodyModel[96] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 19
		bodyModel[97] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 19
		bodyModel[98] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 19
		bodyModel[99] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 19
		bodyModel[100] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 19
		bodyModel[101] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 19
		bodyModel[102] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 19
		bodyModel[103] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 19
		bodyModel[104] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 19
		bodyModel[105] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 19
		bodyModel[106] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 19
		bodyModel[107] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 19
		bodyModel[108] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 19
		bodyModel[109] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 19
		bodyModel[110] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 19
		bodyModel[111] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 19
		bodyModel[112] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 19
		bodyModel[113] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 19
		bodyModel[114] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 19
		bodyModel[115] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 19
		bodyModel[116] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 19
		bodyModel[117] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 19
		bodyModel[118] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 19
		bodyModel[119] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 19
		bodyModel[120] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 19
		bodyModel[121] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 19
		bodyModel[122] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 19
		bodyModel[123] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 19
		bodyModel[124] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 19
		bodyModel[125] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 19
		bodyModel[126] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 19
		bodyModel[127] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 19
		bodyModel[128] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 19
		bodyModel[129] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 19
		bodyModel[130] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 19
		bodyModel[131] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 19
		bodyModel[132] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 19
		bodyModel[133] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 19
		bodyModel[134] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 19
		bodyModel[135] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 19
		bodyModel[136] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 19
		bodyModel[137] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Box 19
		bodyModel[138] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 19
		bodyModel[139] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 19
		bodyModel[140] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 19
		bodyModel[141] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 19
		bodyModel[142] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 19
		bodyModel[143] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 19
		bodyModel[144] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Box 19
		bodyModel[145] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 19
		bodyModel[146] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 19
		bodyModel[147] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 19
		bodyModel[148] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 19
		bodyModel[149] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 19
		bodyModel[150] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 19
		bodyModel[151] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 19
		bodyModel[152] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 19
		bodyModel[153] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 19
		bodyModel[154] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 19
		bodyModel[155] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 19
		bodyModel[156] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 19
		bodyModel[157] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 19
		bodyModel[158] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 19
		bodyModel[159] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 19
		bodyModel[160] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 19
		bodyModel[161] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 199
		bodyModel[162] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Box 199
		bodyModel[163] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 199
		bodyModel[164] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 199
		bodyModel[165] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 19
		bodyModel[166] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 19
		bodyModel[167] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 19
		bodyModel[168] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 19
		bodyModel[169] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 19
		bodyModel[170] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 19
		bodyModel[171] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 19
		bodyModel[172] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 199
		bodyModel[173] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 199
		bodyModel[174] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 199
		bodyModel[175] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 199
		bodyModel[176] = new ModelRendererTurbo(this, 361, 60, textureX, textureY); // Box 287
		bodyModel[177] = new ModelRendererTurbo(this, 361, 60, textureX, textureY); // Box 287
		bodyModel[178] = new ModelRendererTurbo(this, 393, 60, textureX, textureY); // Box 0
		bodyModel[179] = new ModelRendererTurbo(this, 393, 60, textureX, textureY); // Box 0
		bodyModel[180] = new ModelRendererTurbo(this, 481, 119, textureX, textureY); // Box 396
		bodyModel[181] = new ModelRendererTurbo(this, 489, 119, textureX, textureY); // Box 397
		bodyModel[182] = new ModelRendererTurbo(this, 497, 119, textureX, textureY); // Box 398
		bodyModel[183] = new ModelRendererTurbo(this, 481, 119, textureX, textureY); // Box 396
		bodyModel[184] = new ModelRendererTurbo(this, 489, 119, textureX, textureY); // Box 397
		bodyModel[185] = new ModelRendererTurbo(this, 497, 119, textureX, textureY); // Box 398
		bodyModel[186] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 184
		bodyModel[187] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 185
		bodyModel[188] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 186
		bodyModel[189] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 187
		bodyModel[190] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 188
		bodyModel[191] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 189

		bodyModel[0].addBox(0F, 0F, 0F, 106, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-53F, 1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 1
		bodyModel[1].setRotationPoint(51F, -14F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 39
		bodyModel[2].setRotationPoint(-1F, -14F, 9.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 1
		bodyModel[3].setRotationPoint(-53F, -14F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 50, 15, 1, 0F); // Box 2
		bodyModel[4].setRotationPoint(-51F, -14F, 9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[5].setRotationPoint(-43F, -13F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 19
		bodyModel[6].setRotationPoint(51F, -14F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 106, 1, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 160
		bodyModel[7].setRotationPoint(-53F, -22.5F, -3.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 110, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 160
		bodyModel[8].setRotationPoint(-55F, -23.5F, -3.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 15, 20, 0F); // Box 19
		bodyModel[9].setRotationPoint(-53F, -14F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 15, 20, 0F); // Box 19
		bodyModel[10].setRotationPoint(51F, -14F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 19
		bodyModel[11].setRotationPoint(53F, -11F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 19
		bodyModel[12].setRotationPoint(53F, -14F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[13].setRotationPoint(53F, -20.5F, 3.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[14].setRotationPoint(53F, -20.5F, -4.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[15].setRotationPoint(-58.5F, 1.25F, 5.55F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[16].setRotationPoint(-58.5F, 1.25F, -8.55F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 156
		bodyModel[17].setRotationPoint(57.5F, 1.25F, -8.55F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 155
		bodyModel[18].setRotationPoint(55.5F, 1F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 156
		bodyModel[19].setRotationPoint(57.5F, 1.25F, 5.55F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 36, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-18F, 3F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 36, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[21].setRotationPoint(-18F, 3F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[22].setRotationPoint(-3F, -14F, 10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[23].setRotationPoint(1F, -14F, 10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[24].setRotationPoint(-35F, -13F, 10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[25].setRotationPoint(-27F, -13F, 10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[26].setRotationPoint(-19F, -13F, 10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[27].setRotationPoint(-11F, -13F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[28].setRotationPoint(34F, -13F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[29].setRotationPoint(26F, -13F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[30].setRotationPoint(18F, -13F, 10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[31].setRotationPoint(10F, -13F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 50, 15, 1, 0F); // Box 354
		bodyModel[32].setRotationPoint(1F, -14F, 9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[33].setRotationPoint(42F, -13F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 39
		bodyModel[34].setRotationPoint(-1F, -14F, -10.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 11
		bodyModel[35].setRotationPoint(42F, -13F, -11F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 15, 1, 0F); // Box 19
		bodyModel[36].setRotationPoint(-53F, -14F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 289
		bodyModel[37].setRotationPoint(1F, -14F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 292
		bodyModel[38].setRotationPoint(-3F, -14F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 11
		bodyModel[39].setRotationPoint(34F, -13F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 302
		bodyModel[40].setRotationPoint(26F, -13F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 315
		bodyModel[41].setRotationPoint(18F, -13F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 321
		bodyModel[42].setRotationPoint(10F, -13F, -11F);

		bodyModel[43].addBox(-2F, -2F, 0F, 50, 15, 1, 0F); // Box 325
		bodyModel[43].setRotationPoint(3F, -12F, -10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 331
		bodyModel[44].setRotationPoint(-35F, -13F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 351
		bodyModel[45].setRotationPoint(-27F, -13F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 352
		bodyModel[46].setRotationPoint(-19F, -13F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 353
		bodyModel[47].setRotationPoint(-11F, -13F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 355
		bodyModel[48].setRotationPoint(-43F, -13F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 50, 15, 1, 0F); // Box 358
		bodyModel[49].setRotationPoint(-51F, -14F, -10.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 351
		bodyModel[50].setRotationPoint(-40.7F, 4F, -7.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 351
		bodyModel[51].setRotationPoint(-40.7F, 4F, 6.25F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[52].setRotationPoint(-42.7F, 4F, -7.25F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[53].setRotationPoint(-42.7F, 3F, -7.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[54].setRotationPoint(-32.7F, 4F, -7.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[55].setRotationPoint(-42.7F, 4F, 6.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[56].setRotationPoint(-42.7F, 3F, 6.25F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[57].setRotationPoint(-32.7F, 4F, 6.25F);

		bodyModel[58].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[58].setRotationPoint(-40.1F, 3F, 6F);

		bodyModel[59].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[59].setRotationPoint(-40.1F, 3F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[60].setRotationPoint(-37.7F, 5.5F, -8.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[61].setRotationPoint(-37.7F, 5.5F, 6.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[62].setRotationPoint(-37.7F, 5.5F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 351
		bodyModel[63].setRotationPoint(32.3F, 4F, -7.25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 351
		bodyModel[64].setRotationPoint(32.3F, 4F, 6.25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[65].setRotationPoint(30.3F, 4F, -7.25F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[66].setRotationPoint(30.3F, 3F, -7.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[67].setRotationPoint(40.3F, 4F, -7.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[68].setRotationPoint(30.3F, 4F, 6.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[69].setRotationPoint(30.3F, 3F, 6.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 351
		bodyModel[70].setRotationPoint(40.3F, 4F, 6.25F);

		bodyModel[71].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[71].setRotationPoint(32.9F, 3F, 6F);

		bodyModel[72].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[72].setRotationPoint(32.9F, 3F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[73].setRotationPoint(35.3F, 5.5F, -8.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[74].setRotationPoint(35.3F, 5.5F, 6.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[75].setRotationPoint(35.3F, 5.5F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[76].setRotationPoint(53F, 0.75F, 5.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 155
		bodyModel[77].setRotationPoint(55.5F, 1F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[78].setRotationPoint(53F, 0.75F, -8.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[79].setRotationPoint(-57.5F, 1F, 6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[80].setRotationPoint(-55F, 0.75F, 5.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[81].setRotationPoint(-57.5F, 1F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[82].setRotationPoint(-55F, 0.75F, -8.25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 288
		bodyModel[83].setRotationPoint(3F, -14F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 288
		bodyModel[84].setRotationPoint(-51F, -14F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[85].setRotationPoint(3F, -14F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 48, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[86].setRotationPoint(-51F, -14F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 5, 22, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[87].setRotationPoint(-53F, -19F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[88].setRotationPoint(-53F, -21F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 160
		bodyModel[89].setRotationPoint(53F, -22.5F, -3.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 5, 22, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[90].setRotationPoint(51F, -19F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0.5F, -6.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[91].setRotationPoint(51F, -21F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[92].setRotationPoint(-54F, -20.5F, 3.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 23, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[93].setRotationPoint(-54F, -20.5F, -4.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 160
		bodyModel[94].setRotationPoint(-55F, -22.5F, -3.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 48, 5, 1, 0F,0F, -1F, 2.6F, 0F, -1F, 2.6F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[95].setRotationPoint(3F, -19F, 9.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 48, 5, 1, 0F,0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, -1F, 2.6F, 0F, -1F, 2.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[96].setRotationPoint(3F, -19F, -10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F,0F, -3.5F, 0.25F, 0F, -3.5F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, -0.6F, 0F, 3F, -0.6F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 19
		bodyModel[97].setRotationPoint(3F, -22F, -7.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 102, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[98].setRotationPoint(-51F, -21F, -1.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 48, 5, 1, 0F,0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, -1F, 2.6F, 0F, -1F, 2.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[99].setRotationPoint(-51F, -19F, -10.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, 2.6F, 0F, -1F, 2.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[100].setRotationPoint(1F, -19F, -10.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, -1F, 2.6F, 0F, -1F, 2.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[101].setRotationPoint(-1F, -19F, -10.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -1F, -6F, 0F, -1F, -6F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -3.4F, 0F, 0F, -3.4F); // Box 19
		bodyModel[102].setRotationPoint(-1F, -22F, -7.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F,0F, -3.5F, 0.25F, 0F, -3.5F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 3F, -0.6F, 0F, 3F, -0.6F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 19
		bodyModel[103].setRotationPoint(-51F, -22F, -7.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0.25F, 0F, -3.5F, 0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, -0.6F, 0F, 3F, -0.6F); // Box 19
		bodyModel[104].setRotationPoint(3F, -22F, 1.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, -0.6F, 0F, 3F, -0.6F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 19
		bodyModel[105].setRotationPoint(1F, -22F, -7.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -1F, 2.6F, 0F, -1F, 2.6F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[106].setRotationPoint(-3F, -19F, -10.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, -0.6F, 0F, 3F, -0.6F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 19
		bodyModel[107].setRotationPoint(-3F, -22F, -7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 2.6F, 0F, -1F, 2.6F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 19
		bodyModel[108].setRotationPoint(1F, -19F, 9.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 2.6F, 0F, -1F, 2.6F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[109].setRotationPoint(-1F, -19F, 9.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -2F, 2F, 0F, -2F, 2F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 19
		bodyModel[110].setRotationPoint(-1F, -22F, 3.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, -0.6F, 0F, 3F, -0.6F); // Box 19
		bodyModel[111].setRotationPoint(1F, -22F, 1.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -1F, 2.6F, 0F, -1F, 2.6F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 19
		bodyModel[112].setRotationPoint(-3F, -19F, 9.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, -0.6F, 0F, 3F, -0.6F); // Box 19
		bodyModel[113].setRotationPoint(-3F, -22F, 1.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 48, 5, 1, 0F,0F, -1F, 2.6F, 0F, -1F, 2.6F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[114].setRotationPoint(-51F, -19F, 9.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 48, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0.25F, 0F, -3.5F, 0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, -0.6F, 0F, 3F, -0.6F); // Box 19
		bodyModel[115].setRotationPoint(-51F, -22F, 1.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[116].setRotationPoint(-11F, -19F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[117].setRotationPoint(-11F, -22F, -7.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[118].setRotationPoint(-19F, -19F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[119].setRotationPoint(-19F, -22F, -7.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[120].setRotationPoint(-27F, -19F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[121].setRotationPoint(-27F, -22F, -7.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[122].setRotationPoint(-35F, -19F, -11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[123].setRotationPoint(-35F, -22F, -7.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[124].setRotationPoint(-43F, -19F, -11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[125].setRotationPoint(-43F, -22F, -7.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[126].setRotationPoint(10F, -19F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[127].setRotationPoint(10F, -22F, -7.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[128].setRotationPoint(18F, -19F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[129].setRotationPoint(18F, -22F, -7.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[130].setRotationPoint(26F, -19F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[131].setRotationPoint(26F, -22F, -7.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[132].setRotationPoint(34F, -19F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[133].setRotationPoint(34F, -22F, -7.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[134].setRotationPoint(42F, -19F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[135].setRotationPoint(42F, -22F, -7.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[136].setRotationPoint(-11F, -19F, 10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F); // Box 19
		bodyModel[137].setRotationPoint(-11F, -22F, 1.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[138].setRotationPoint(-19F, -19F, 10F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F); // Box 19
		bodyModel[139].setRotationPoint(-19F, -22F, 1.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[140].setRotationPoint(-27F, -19F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F); // Box 19
		bodyModel[141].setRotationPoint(-27F, -22F, 1.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[142].setRotationPoint(-35F, -19F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F); // Box 19
		bodyModel[143].setRotationPoint(-35F, -22F, 1.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[144].setRotationPoint(-43F, -19F, 10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F); // Box 19
		bodyModel[145].setRotationPoint(-43F, -22F, 1.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[146].setRotationPoint(10F, -19F, 10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F); // Box 19
		bodyModel[147].setRotationPoint(10F, -22F, 1.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[148].setRotationPoint(18F, -19F, 10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F); // Box 19
		bodyModel[149].setRotationPoint(18F, -22F, 1.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[150].setRotationPoint(26F, -19F, 10F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F); // Box 19
		bodyModel[151].setRotationPoint(26F, -22F, 1.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[152].setRotationPoint(34F, -19F, 10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F); // Box 19
		bodyModel[153].setRotationPoint(34F, -22F, 1.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 2.25F, 0F, -0.5F, 2.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[154].setRotationPoint(42F, -19F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F); // Box 19
		bodyModel[155].setRotationPoint(42F, -22F, 1.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[156].setRotationPoint(53F, -14F, 3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 19
		bodyModel[157].setRotationPoint(53F, -8F, 3.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 19
		bodyModel[158].setRotationPoint(53F, -8F, -10.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 19
		bodyModel[159].setRotationPoint(53F, -5F, -2.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 19
		bodyModel[160].setRotationPoint(53F, -20F, -1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[161].setRotationPoint(53F, -4.5F, -7.75F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[162].setRotationPoint(54F, -7F, -10.25F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[163].setRotationPoint(53F, -4.5F, 6.25F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[164].setRotationPoint(54F, -7F, 3.75F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 19
		bodyModel[165].setRotationPoint(-54F, -11F, -2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 19
		bodyModel[166].setRotationPoint(-54F, -14F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 19
		bodyModel[167].setRotationPoint(-54F, -14F, 3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 19
		bodyModel[168].setRotationPoint(-54F, -8F, 3.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 19
		bodyModel[169].setRotationPoint(-54F, -8F, -10.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 19
		bodyModel[170].setRotationPoint(-54F, -5F, -2.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0.5F, -0.45F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 19
		bodyModel[171].setRotationPoint(-54F, -20F, -1F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[172].setRotationPoint(-54F, -4.5F, -7.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[173].setRotationPoint(-54F, -7F, -10.25F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[174].setRotationPoint(-54F, -4.5F, 6.25F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[175].setRotationPoint(-54F, -7F, 3.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[176].setRotationPoint(18F, 3F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 287
		bodyModel[177].setRotationPoint(-24F, 3F, 8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[178].setRotationPoint(18F, 3F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 0
		bodyModel[179].setRotationPoint(-24F, 3F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F); // Box 396
		bodyModel[180].setRotationPoint(-54F, 1F, -0.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 397
		bodyModel[181].setRotationPoint(-55.25F, 2F, -0.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 398
		bodyModel[182].setRotationPoint(-56.25F, 1F, -0.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 396
		bodyModel[183].setRotationPoint(53F, 1F, -0.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 397
		bodyModel[184].setRotationPoint(54.25F, 2F, -0.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 398
		bodyModel[185].setRotationPoint(55.25F, 1F, -0.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 184
		bodyModel[186].setRotationPoint(-53.5F, 3.4F, 9.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[187].setRotationPoint(-55F, 4.4F, 8.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 186
		bodyModel[188].setRotationPoint(-55.5F, 4.65F, 9.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 187
		bodyModel[189].setRotationPoint(52.5F, 4.65F, -10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[190].setRotationPoint(53F, 4.4F, -10.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[191].setRotationPoint(52F, 3.4F, -10F);
	}
}