//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.12.2021 - 13:57:52
// Last changed on: 18.12.2021 - 13:57:52

package wwcp.models.bogies.AmericanTrucks; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Alco_Truck extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Alco_Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[201];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 122
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 123
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 39
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 337
		bodyModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 337
		bodyModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 337
		bodyModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 337
		bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 152
		bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 151
		bodyModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 152
		bodyModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 151
		bodyModel[14] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 337
		bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 5
		bodyModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 337
		bodyModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 5
		bodyModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 337
		bodyModel[19] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 5
		bodyModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 337
		bodyModel[21] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 5
		bodyModel[22] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 337
		bodyModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 337
		bodyModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 337
		bodyModel[25] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 337
		bodyModel[26] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 337
		bodyModel[27] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 5
		bodyModel[28] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 337
		bodyModel[29] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 5
		bodyModel[30] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 152
		bodyModel[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 152
		bodyModel[32] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 152
		bodyModel[33] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 152
		bodyModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 152
		bodyModel[35] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 152
		bodyModel[36] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 152
		bodyModel[37] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 152
		bodyModel[38] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 152
		bodyModel[39] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 37
		bodyModel[40] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 38
		bodyModel[41] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 37
		bodyModel[42] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 37
		bodyModel[43] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 37
		bodyModel[44] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 38
		bodyModel[45] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 38
		bodyModel[46] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 528
		bodyModel[47] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 337
		bodyModel[48] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 337
		bodyModel[49] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 152
		bodyModel[50] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 152
		bodyModel[51] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 152
		bodyModel[52] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 5
		bodyModel[53] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 5
		bodyModel[54] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 5
		bodyModel[55] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 5
		bodyModel[56] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 337
		bodyModel[57] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 337
		bodyModel[58] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 419
		bodyModel[59] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 420
		bodyModel[60] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 422
		bodyModel[61] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 337
		bodyModel[62] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 337
		bodyModel[63] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 337
		bodyModel[64] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 420
		bodyModel[65] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 422
		bodyModel[66] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 337
		bodyModel[67] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 434
		bodyModel[68] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 337
		bodyModel[69] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 885
		bodyModel[70] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 886
		bodyModel[71] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 887
		bodyModel[72] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 888
		bodyModel[73] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 889
		bodyModel[74] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 890
		bodyModel[75] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 891
		bodyModel[76] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 892
		bodyModel[77] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 893
		bodyModel[78] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 894
		bodyModel[79] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 895
		bodyModel[80] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 896
		bodyModel[81] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 897
		bodyModel[82] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 898
		bodyModel[83] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 899
		bodyModel[84] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 900
		bodyModel[85] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 5
		bodyModel[86] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 5
		bodyModel[87] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 152
		bodyModel[88] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 152
		bodyModel[89] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 152
		bodyModel[90] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 152
		bodyModel[91] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 37
		bodyModel[92] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 38
		bodyModel[93] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 37
		bodyModel[94] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 37
		bodyModel[95] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 37
		bodyModel[96] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 38
		bodyModel[97] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 38
		bodyModel[98] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 528
		bodyModel[99] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 528
		bodyModel[100] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 528
		bodyModel[101] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 9
		bodyModel[102] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 6
		bodyModel[103] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 4
		bodyModel[104] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 9
		bodyModel[105] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		bodyModel[106] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 337
		bodyModel[107] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 337
		bodyModel[108] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 337
		bodyModel[109] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 337
		bodyModel[110] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 337
		bodyModel[111] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 337
		bodyModel[112] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 337
		bodyModel[113] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 901
		bodyModel[114] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 902
		bodyModel[115] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 957
		bodyModel[116] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 958
		bodyModel[117] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 309
		bodyModel[118] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 310
		bodyModel[119] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 311
		bodyModel[120] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 312
		bodyModel[121] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 313
		bodyModel[122] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 314
		bodyModel[123] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 315
		bodyModel[124] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 316
		bodyModel[125] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 317
		bodyModel[126] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 320
		bodyModel[127] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 321
		bodyModel[128] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 324
		bodyModel[129] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 325
		bodyModel[130] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 327
		bodyModel[131] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 329
		bodyModel[132] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 331
		bodyModel[133] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 333
		bodyModel[134] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 334
		bodyModel[135] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 335
		bodyModel[136] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 336
		bodyModel[137] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 337
		bodyModel[138] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 339
		bodyModel[139] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 341
		bodyModel[140] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 343
		bodyModel[141] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 345
		bodyModel[142] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 346
		bodyModel[143] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 347
		bodyModel[144] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 348
		bodyModel[145] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 349
		bodyModel[146] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 350
		bodyModel[147] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 353
		bodyModel[148] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 354
		bodyModel[149] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 356
		bodyModel[150] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 359
		bodyModel[151] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 361
		bodyModel[152] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 363
		bodyModel[153] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 365
		bodyModel[154] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 366
		bodyModel[155] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 367
		bodyModel[156] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 368
		bodyModel[157] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 369
		bodyModel[158] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 370
		bodyModel[159] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 371
		bodyModel[160] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 373
		bodyModel[161] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 374
		bodyModel[162] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 375
		bodyModel[163] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 376
		bodyModel[164] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 378
		bodyModel[165] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 379
		bodyModel[166] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 380
		bodyModel[167] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 381
		bodyModel[168] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 394
		bodyModel[169] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 395
		bodyModel[170] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 396
		bodyModel[171] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 399
		bodyModel[172] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 410
		bodyModel[173] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 411
		bodyModel[174] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 350
		bodyModel[175] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 943
		bodyModel[176] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 944
		bodyModel[177] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 945
		bodyModel[178] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 850
		bodyModel[179] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 851
		bodyModel[180] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 850
		bodyModel[181] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 851
		bodyModel[182] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 907
		bodyModel[183] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 908
		bodyModel[184] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 909
		bodyModel[185] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 910
		bodyModel[186] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 911
		bodyModel[187] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 912
		bodyModel[188] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 913
		bodyModel[189] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 914
		bodyModel[190] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 915
		bodyModel[191] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 916
		bodyModel[192] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 917
		bodyModel[193] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 918
		bodyModel[194] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 919
		bodyModel[195] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 920
		bodyModel[196] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 921
		bodyModel[197] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 922
		bodyModel[198] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 923
		bodyModel[199] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 924
		bodyModel[200] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 356

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 5
		bodyModel[0].setRotationPoint(-1F, 5.5F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 11, 4, 11, 0F); // Box 122
		bodyModel[1].setRotationPoint(-20.25F, 4F, -5.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 11, 4, 11, 0F); // Box 123
		bodyModel[2].setRotationPoint(9.25F, 4F, -5.5F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 39
		bodyModel[3].setRotationPoint(-17.25F, 6.5F, -6F);

		bodyModel[4].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 8
		bodyModel[4].setRotationPoint(0F, 6.5F, -6F);

		bodyModel[5].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 39
		bodyModel[5].setRotationPoint(17.25F, 6.5F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[6].setRotationPoint(-9F, 2.75F, -8.75F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 337
		bodyModel[7].setRotationPoint(10F, 2.75F, -8.75F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[8].setRotationPoint(-22.25F, 4F, -8.75F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[9].setRotationPoint(-21.25F, 3.5F, -8.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[10].setRotationPoint(-20.25F, 3.55F, -10.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 151
		bodyModel[11].setRotationPoint(-21.25F, 3.55F, -10.25F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[12].setRotationPoint(17F, 3.55F, -10.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 151
		bodyModel[13].setRotationPoint(20.25F, 3.55F, -10.25F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[14].setRotationPoint(-1F, 8.25F, -8.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[15].setRotationPoint(-1F, 5.25F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[16].setRotationPoint(-0.5F, 4.75F, -8.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[17].setRotationPoint(-0.75F, 5.75F, -9.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[18].setRotationPoint(-18.25F, 8.25F, -8.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[19].setRotationPoint(-18.25F, 5.25F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[20].setRotationPoint(-17.75F, 4.75F, -8.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[21].setRotationPoint(-18F, 5.75F, -9.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[22].setRotationPoint(-23.25F, 4F, -8.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[23].setRotationPoint(10F, 3.5F, -8.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[24].setRotationPoint(18.25F, 4F, -8.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[25].setRotationPoint(22.25F, 4F, -8.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[26].setRotationPoint(16.25F, 8.25F, -8.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 5
		bodyModel[27].setRotationPoint(16.25F, 5.25F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[28].setRotationPoint(16.75F, 4.75F, -8.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 5
		bodyModel[29].setRotationPoint(16.5F, 5.75F, -9.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 152
		bodyModel[30].setRotationPoint(-13F, 7.55F, -8.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 152
		bodyModel[31].setRotationPoint(-15.5F, 5.05F, -8.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F); // Box 152
		bodyModel[32].setRotationPoint(-15F, 7.05F, -8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[33].setRotationPoint(-13.75F, 7.05F, -8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F); // Box 152
		bodyModel[34].setRotationPoint(6F, 7.55F, -8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 152
		bodyModel[35].setRotationPoint(13.5F, 5.05F, -8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 152
		bodyModel[36].setRotationPoint(13F, 7.05F, -8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F); // Box 152
		bodyModel[37].setRotationPoint(12.75F, 7.05F, -8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 152
		bodyModel[38].setRotationPoint(-12.5F, 7.05F, -8.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 37
		bodyModel[39].setRotationPoint(-8.5F, 4.88F, -8.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 38
		bodyModel[40].setRotationPoint(-8.5F, 6.38F, -8.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[41].setRotationPoint(-8.5F, 5.98F, -9.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[42].setRotationPoint(-8.5F, 5.28F, -9.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[43].setRotationPoint(-8.5F, 5.63F, -10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.58F, 0F, -0.5F, -0.58F, 0F, -0.5F, -0.58F, -0.5F, 0F, -0.58F, -0.5F); // Box 38
		bodyModel[44].setRotationPoint(-8.5F, 7.13F, -8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.62F, 0F, -0.5F, -0.62F, 0F, -0.5F, -0.62F, -0.5F, 0F, -0.62F, -0.5F); // Box 38
		bodyModel[45].setRotationPoint(-8.5F, 4.75F, -8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.95F, 0F, 0.5F, -2.95F, 0F, 0.5F, -2.95F, 0.5F, 0F, -2.95F, 0.5F); // Box 528
		bodyModel[46].setRotationPoint(-12.5F, 5F, -8.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 337
		bodyModel[47].setRotationPoint(-10F, 2.75F, -8.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 337
		bodyModel[48].setRotationPoint(9F, 2.75F, -8.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 152
		bodyModel[49].setRotationPoint(9.25F, 7.05F, -8.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 152
		bodyModel[50].setRotationPoint(-6F, 4.8F, -8.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 152
		bodyModel[51].setRotationPoint(5.5F, 4.8F, -8.25F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 5
		bodyModel[52].setRotationPoint(-2F, 1.75F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[53].setRotationPoint(5.5F, 2.75F, -7.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[54].setRotationPoint(-8.5F, 2.75F, -7.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[55].setRotationPoint(-5.5F, 2.75F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[56].setRotationPoint(22.25F, 4F, -7.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 337
		bodyModel[57].setRotationPoint(22.25F, 4F, -5.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 419
		bodyModel[58].setRotationPoint(22.25F, 4F, 7.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[59].setRotationPoint(22.25F, 4F, 5.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[60].setRotationPoint(22.25F, 4F, 4.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[61].setRotationPoint(22.25F, 6F, -4.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		bodyModel[62].setRotationPoint(-23.25F, 4F, -7.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 337
		bodyModel[63].setRotationPoint(-23.25F, 4F, -5.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[64].setRotationPoint(-23.25F, 4F, 5.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 422
		bodyModel[65].setRotationPoint(-23.25F, 4F, 4.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 337
		bodyModel[66].setRotationPoint(-23.25F, 6F, -4.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 434
		bodyModel[67].setRotationPoint(-23.25F, 4F, 7.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[68].setRotationPoint(-16.25F, 3.5F, -8.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 885
		bodyModel[69].setRotationPoint(-3.5F, 4.75F, -8.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 886
		bodyModel[70].setRotationPoint(1F, 4.75F, -8.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 887
		bodyModel[71].setRotationPoint(-2.5F, 5.25F, -8.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F); // Box 888
		bodyModel[72].setRotationPoint(1.5F, 5.25F, -8.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 889
		bodyModel[73].setRotationPoint(-20.75F, 5F, -8.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 890
		bodyModel[74].setRotationPoint(-16.25F, 5F, -8.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.5F, -1F, -0.75F, -0.5F); // Box 891
		bodyModel[75].setRotationPoint(-19.75F, 5.5F, -8.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F); // Box 892
		bodyModel[76].setRotationPoint(-15.75F, 5.5F, -8.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 893
		bodyModel[77].setRotationPoint(-18.25F, 4F, -8.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 894
		bodyModel[78].setRotationPoint(16.25F, 4F, -8.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 895
		bodyModel[79].setRotationPoint(13.75F, 5F, -8.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 896
		bodyModel[80].setRotationPoint(18.25F, 5F, -8.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.5F, -1F, -0.75F, -0.5F); // Box 897
		bodyModel[81].setRotationPoint(14.75F, 5.5F, -8.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F); // Box 898
		bodyModel[82].setRotationPoint(18.75F, 5.5F, -8.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 2.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.75F, 0F); // Box 899
		bodyModel[83].setRotationPoint(-6.25F, 4.3F, -8.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.5F, 0F); // Box 900
		bodyModel[84].setRotationPoint(2.25F, 4.3F, -8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 5
		bodyModel[85].setRotationPoint(-8F, 1.5F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 5
		bodyModel[86].setRotationPoint(6F, 1.5F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 152
		bodyModel[87].setRotationPoint(13.5F, 2.5F, -9.75F);
		bodyModel[87].rotateAngleX = -0.78539816F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 152
		bodyModel[88].setRotationPoint(9.25F, 3.2F, -9.75F);
		bodyModel[88].rotateAngleX = -0.78539816F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 152
		bodyModel[89].setRotationPoint(-17F, 2.5F, -9.75F);
		bodyModel[89].rotateAngleX = -0.78539816F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.125F, 0.125F, -0.75F, 0.125F, 0.125F, -0.75F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 152
		bodyModel[90].setRotationPoint(-13.5F, 3.2F, -9.75F);
		bodyModel[90].rotateAngleX = -0.78539816F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 37
		bodyModel[91].setRotationPoint(7F, 4.88F, -8.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F); // Box 38
		bodyModel[92].setRotationPoint(7F, 6.38F, -8.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[93].setRotationPoint(7F, 5.98F, -9.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -0.125F, -0.5F, -0.35F, -0.125F, -0.5F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[94].setRotationPoint(7F, 5.28F, -9.75F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[95].setRotationPoint(7F, 5.63F, -10.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.58F, 0F, -0.5F, -0.58F, 0F, -0.5F, -0.58F, -0.5F, 0F, -0.58F, -0.5F); // Box 38
		bodyModel[96].setRotationPoint(7F, 7.13F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.62F, 0F, -0.5F, -0.62F, 0F, -0.5F, -0.62F, -0.5F, 0F, -0.62F, -0.5F); // Box 38
		bodyModel[97].setRotationPoint(7F, 4.75F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.95F, 0F, 0.5F, -2.95F, 0F, 0.5F, -2.95F, 0.5F, 0F, -2.95F, 0.5F); // Box 528
		bodyModel[98].setRotationPoint(-10.75F, 5F, -8.75F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.95F, 0F, 0.5F, -2.95F, 0F, 0.5F, -2.95F, 0.5F, 0F, -2.95F, 0.5F); // Box 528
		bodyModel[99].setRotationPoint(9.25F, 5F, -8.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.95F, 0F, 0.5F, -2.95F, 0F, 0.5F, -2.95F, 0.5F, 0F, -2.95F, 0.5F); // Box 528
		bodyModel[100].setRotationPoint(11F, 5F, -8.75F);

		bodyModel[101].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 9
		bodyModel[101].setRotationPoint(-17.25F, 6.5F, 6F);

		bodyModel[102].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 6
		bodyModel[102].setRotationPoint(0F, 6.5F, 6F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 4
		bodyModel[103].setRotationPoint(16.25F, 5.5F, -7F);

		bodyModel[104].addShapeBox(-3.5F, -3.5F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 9
		bodyModel[104].setRotationPoint(17.25F, 6.5F, 6F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 4
		bodyModel[105].setRotationPoint(-18.25F, 5.5F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[106].setRotationPoint(-0.5F, 2.25F, -8.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 337
		bodyModel[107].setRotationPoint(-13F, 2.75F, -8.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[108].setRotationPoint(-2.5F, 2.25F, -8.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[109].setRotationPoint(0.5F, 2.25F, -8.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, -0.75F, -0.5F); // Box 337
		bodyModel[110].setRotationPoint(-9F, 4.75F, -8.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -1F, -0.5F); // Box 337
		bodyModel[111].setRotationPoint(8F, 4.75F, -8.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 337
		bodyModel[112].setRotationPoint(17.25F, 3.5F, -8.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 901
		bodyModel[113].setRotationPoint(16.25F, 3.5F, -8.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 902
		bodyModel[114].setRotationPoint(-17.25F, 3.5F, -8.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 957
		bodyModel[115].setRotationPoint(-8F, 1.5F, 4F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 958
		bodyModel[116].setRotationPoint(6F, 1.5F, 4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 309
		bodyModel[117].setRotationPoint(-16.25F, 3.5F, 6.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 18, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[118].setRotationPoint(-9F, 2.75F, 6.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 311
		bodyModel[119].setRotationPoint(-13F, 2.75F, 6.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 312
		bodyModel[120].setRotationPoint(10F, 2.75F, 6.75F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, 0F, 0F, -0.75F, 0F); // Box 313
		bodyModel[121].setRotationPoint(-9F, 4.75F, 6.75F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, -1F, 0F); // Box 314
		bodyModel[122].setRotationPoint(8F, 4.75F, 6.75F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[123].setRotationPoint(-22.25F, 4F, 6.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 316
		bodyModel[124].setRotationPoint(-21.25F, 3.5F, 6.75F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 317
		bodyModel[125].setRotationPoint(17.25F, 3.5F, 6.75F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[126].setRotationPoint(-20.25F, 3.55F, 9.25F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 321
		bodyModel[127].setRotationPoint(-21.25F, 3.55F, 6.25F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 0, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[128].setRotationPoint(17F, 3.55F, 9.25F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 0, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 325
		bodyModel[129].setRotationPoint(20.25F, 3.55F, 6.25F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 327
		bodyModel[130].setRotationPoint(-3.5F, 4.75F, 6.75F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 329
		bodyModel[131].setRotationPoint(1F, 4.75F, 6.75F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 331
		bodyModel[132].setRotationPoint(-2.5F, 5.25F, 6.75F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 333
		bodyModel[133].setRotationPoint(1.5F, 5.25F, 6.75F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 334
		bodyModel[134].setRotationPoint(-1F, 8.25F, 6.75F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 335
		bodyModel[135].setRotationPoint(-1F, 5.25F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 336
		bodyModel[136].setRotationPoint(-0.5F, 4.75F, 6.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 337
		bodyModel[137].setRotationPoint(-0.75F, 5.75F, 8.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 339
		bodyModel[138].setRotationPoint(-20.75F, 5F, 6.75F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341
		bodyModel[139].setRotationPoint(-16.25F, 5F, 6.75F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 343
		bodyModel[140].setRotationPoint(-19.75F, 5.5F, 6.75F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -1F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Box 345
		bodyModel[141].setRotationPoint(-15.75F, 5.5F, 6.75F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 346
		bodyModel[142].setRotationPoint(-18.25F, 8.25F, 6.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 347
		bodyModel[143].setRotationPoint(-18.25F, 5.25F, 7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 348
		bodyModel[144].setRotationPoint(-17.75F, 4.75F, 6.75F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 349
		bodyModel[145].setRotationPoint(-18F, 5.75F, 8.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 350
		bodyModel[146].setRotationPoint(-18.25F, 4F, 6.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 353
		bodyModel[147].setRotationPoint(10F, 3.5F, 6.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[148].setRotationPoint(18.25F, 4F, 6.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 356
		bodyModel[149].setRotationPoint(16.25F, 4F, 6.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 359
		bodyModel[150].setRotationPoint(13.75F, 5F, 6.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[151].setRotationPoint(18.25F, 5F, 6.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 363
		bodyModel[152].setRotationPoint(14.75F, 5.5F, 6.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -1F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Box 365
		bodyModel[153].setRotationPoint(18.75F, 5.5F, 6.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 366
		bodyModel[154].setRotationPoint(16.25F, 8.25F, 6.75F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 367
		bodyModel[155].setRotationPoint(16.25F, 5.25F, 7F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 368
		bodyModel[156].setRotationPoint(16.75F, 4.75F, 6.75F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 369
		bodyModel[157].setRotationPoint(16.5F, 5.75F, 8.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 370
		bodyModel[158].setRotationPoint(-13F, 7.55F, 7.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 2.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.75F, 0F); // Box 371
		bodyModel[159].setRotationPoint(-6.25F, 4.3F, 7.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Box 373
		bodyModel[160].setRotationPoint(-15.5F, 5.05F, 7.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F); // Box 374
		bodyModel[161].setRotationPoint(-15F, 7.05F, 7.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[162].setRotationPoint(-13.75F, 7.05F, 7.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F); // Box 376
		bodyModel[163].setRotationPoint(6F, 7.55F, 7.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 378
		bodyModel[164].setRotationPoint(13.5F, 5.05F, 7.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 379
		bodyModel[165].setRotationPoint(13F, 7.05F, 7.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.5F, 0F); // Box 380
		bodyModel[166].setRotationPoint(2.25F, 4.3F, 7.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[167].setRotationPoint(-12.5F, 7.05F, 6.75F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 394
		bodyModel[168].setRotationPoint(-10F, 2.75F, 6.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 395
		bodyModel[169].setRotationPoint(9F, 2.75F, 6.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 396
		bodyModel[170].setRotationPoint(9.25F, 7.05F, 6.75F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 399
		bodyModel[171].setRotationPoint(-6F, 4.8F, 7.25F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410
		bodyModel[172].setRotationPoint(5.5F, 4.8F, 7.25F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F); // Box 411
		bodyModel[173].setRotationPoint(12.75F, 7.05F, 7.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 350
		bodyModel[174].setRotationPoint(-17.25F, 3.5F, 6.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 943
		bodyModel[175].setRotationPoint(-0.5F, 2.25F, 6.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 944
		bodyModel[176].setRotationPoint(-2.5F, 2.25F, 6.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 945
		bodyModel[177].setRotationPoint(0.5F, 2.25F, 6.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 850
		bodyModel[178].setRotationPoint(13.5F, 2.1F, 9.45F);
		bodyModel[178].rotateAngleX = -0.78539816F;

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.125F, -0.375F, -0.75F, 0.125F, -0.375F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // Box 851
		bodyModel[179].setRotationPoint(9.25F, 2.8F, 9.45F);
		bodyModel[179].rotateAngleX = -0.78539816F;

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 850
		bodyModel[180].setRotationPoint(-17F, 2.1F, 9.45F);
		bodyModel[180].rotateAngleX = -0.78539816F;

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0.125F, -0.375F, -0.75F, 0.125F, -0.375F, -0.75F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0F, -0.375F, 0.125F); // Box 851
		bodyModel[181].setRotationPoint(-13.5F, 2.8F, 9.45F);
		bodyModel[181].rotateAngleX = -0.78539816F;

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 907
		bodyModel[182].setRotationPoint(-8.5F, 4.88F, 7.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 908
		bodyModel[183].setRotationPoint(-8.5F, 6.38F, 7.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 909
		bodyModel[184].setRotationPoint(-8.5F, 5.98F, 7.75F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 910
		bodyModel[185].setRotationPoint(-8.5F, 5.28F, 7.75F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 911
		bodyModel[186].setRotationPoint(-8.5F, 5.63F, 8.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, -0.5F, -0.5F, -0.58F, -0.5F, -0.5F, -0.58F, 0F, 0F, -0.58F, 0F); // Box 912
		bodyModel[187].setRotationPoint(-8.5F, 7.13F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.62F, -0.5F, -0.5F, -0.62F, -0.5F, -0.5F, -0.62F, 0F, 0F, -0.62F, 0F); // Box 913
		bodyModel[188].setRotationPoint(-8.5F, 4.75F, 7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.95F, 0.5F, 0.5F, -2.95F, 0.5F, 0.5F, -2.95F, 0F, 0F, -2.95F, 0F); // Box 914
		bodyModel[189].setRotationPoint(-12.5F, 5F, 7.75F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 915
		bodyModel[190].setRotationPoint(7F, 4.88F, 7.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 916
		bodyModel[191].setRotationPoint(7F, 6.38F, 7.75F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 917
		bodyModel[192].setRotationPoint(7F, 5.98F, 7.75F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F, 0F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.35F, -0.125F, 0F, -0.35F, -0.125F); // Box 918
		bodyModel[193].setRotationPoint(7F, 5.28F, 7.75F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, -0.5F, -0.23F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 919
		bodyModel[194].setRotationPoint(7F, 5.63F, 8.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.58F, -0.5F, -0.5F, -0.58F, -0.5F, -0.5F, -0.58F, 0F, 0F, -0.58F, 0F); // Box 920
		bodyModel[195].setRotationPoint(7F, 7.13F, 7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.62F, -0.5F, -0.5F, -0.62F, -0.5F, -0.5F, -0.62F, 0F, 0F, -0.62F, 0F); // Box 921
		bodyModel[196].setRotationPoint(7F, 4.75F, 7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.95F, 0.5F, 0.5F, -2.95F, 0.5F, 0.5F, -2.95F, 0F, 0F, -2.95F, 0F); // Box 922
		bodyModel[197].setRotationPoint(-10.75F, 5F, 7.75F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.95F, 0.5F, 0.5F, -2.95F, 0.5F, 0.5F, -2.95F, 0F, 0F, -2.95F, 0F); // Box 923
		bodyModel[198].setRotationPoint(9.25F, 5F, 7.75F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.95F, 0.5F, 0.5F, -2.95F, 0.5F, 0.5F, -2.95F, 0F, 0F, -2.95F, 0F); // Box 924
		bodyModel[199].setRotationPoint(11F, 5F, 7.75F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 356
		bodyModel[200].setRotationPoint(16.25F, 3.5F, 6.75F);
	}
}