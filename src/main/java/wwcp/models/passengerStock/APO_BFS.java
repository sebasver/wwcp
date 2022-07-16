//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.03.2019 - 13:12:58
// Last changed on: 04.03.2019 - 13:12:58

package wwcp.models.passengerStock; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class APO_BFS extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public APO_BFS() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[705];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 84
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 85
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 87
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 88
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 153
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 156
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 155
		bodyModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 155
		bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 156
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Standard Seat
		bodyModel[11] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Standard Seat
		bodyModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 104
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 105
		bodyModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Standard Seat
		bodyModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Standard Seat
		bodyModel[16] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Standard Seat
		bodyModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 104
		bodyModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 105
		bodyModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Standard Seat
		bodyModel[20] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 101
		bodyModel[21] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 107
		bodyModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 108
		bodyModel[23] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 111
		bodyModel[24] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 111
		bodyModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 112
		bodyModel[26] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 109
		bodyModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 110
		bodyModel[28] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 115
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 110
		bodyModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 163
		bodyModel[31] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 177
		bodyModel[32] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 220
		bodyModel[33] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 221
		bodyModel[34] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 222
		bodyModel[35] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 223
		bodyModel[36] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 226
		bodyModel[37] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 229
		bodyModel[38] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 232
		bodyModel[39] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 233
		bodyModel[40] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 161
		bodyModel[41] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 161
		bodyModel[42] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 159
		bodyModel[43] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 159
		bodyModel[44] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 107
		bodyModel[45] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 112
		bodyModel[46] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Standard Seat
		bodyModel[47] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Standard Seat
		bodyModel[48] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 396
		bodyModel[49] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 397
		bodyModel[50] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 398
		bodyModel[51] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 110
		bodyModel[52] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 112
		bodyModel[53] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 107
		bodyModel[54] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 107
		bodyModel[55] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 114
		bodyModel[56] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 170
		bodyModel[57] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 207
		bodyModel[58] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 204
		bodyModel[59] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 207
		bodyModel[60] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 207
		bodyModel[61] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 204
		bodyModel[62] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 207
		bodyModel[63] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 204
		bodyModel[64] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 207
		bodyModel[65] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 204
		bodyModel[66] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 170
		bodyModel[67] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 204
		bodyModel[68] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 207
		bodyModel[69] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 204
		bodyModel[70] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 186
		bodyModel[71] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 189
		bodyModel[72] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 185
		bodyModel[73] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 185
		bodyModel[74] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 189
		bodyModel[75] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 189
		bodyModel[76] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 189
		bodyModel[77] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 189
		bodyModel[78] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 189
		bodyModel[79] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 185
		bodyModel[80] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 185
		bodyModel[81] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 186
		bodyModel[82] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 185
		bodyModel[83] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 185
		bodyModel[84] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 185
		bodyModel[85] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 168
		bodyModel[86] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 168
		bodyModel[87] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 168
		bodyModel[88] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 168
		bodyModel[89] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 168
		bodyModel[90] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 168
		bodyModel[91] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 168
		bodyModel[92] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 168
		bodyModel[93] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 168
		bodyModel[94] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 168
		bodyModel[95] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 114
		bodyModel[96] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 114
		bodyModel[97] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 168
		bodyModel[98] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 168
		bodyModel[99] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 62
		bodyModel[100] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 62
		bodyModel[102] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 151
		bodyModel[103] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 105
		bodyModel[104] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 185
		bodyModel[105] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 185
		bodyModel[106] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 323
		bodyModel[107] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 31
		bodyModel[108] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 101
		bodyModel[109] = new ModelRendererTurbo(this, 489, 170, textureX, textureY); // Box 31
		bodyModel[110] = new ModelRendererTurbo(this, 461, 176, textureX, textureY); // Box 101
		bodyModel[111] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 323
		bodyModel[112] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 323
		bodyModel[113] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 323
		bodyModel[114] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 110
		bodyModel[115] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 101
		bodyModel[116] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 204
		bodyModel[117] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 31
		bodyModel[118] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 62
		bodyModel[119] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 62
		bodyModel[120] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 62
		bodyModel[121] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 114
		bodyModel[122] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 62
		bodyModel[123] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 151
		bodyModel[124] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Door Right Top
		bodyModel[125] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 101
		bodyModel[126] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Door Right Buttom
		bodyModel[127] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 62
		bodyModel[128] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 62
		bodyModel[129] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 204
		bodyModel[130] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Door Left Top
		bodyModel[131] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Door Left Buttom
		bodyModel[132] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 110
		bodyModel[133] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 390, 157, textureX, textureY); // Box 110
		bodyModel[136] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 110
		bodyModel[137] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 110
		bodyModel[138] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 110
		bodyModel[139] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 111
		bodyModel[140] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 105
		bodyModel[141] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 111
		bodyModel[142] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 111
		bodyModel[143] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 105
		bodyModel[144] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 105
		bodyModel[145] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 323
		bodyModel[146] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 101
		bodyModel[147] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 101
		bodyModel[148] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 31
		bodyModel[149] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 31
		bodyModel[150] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 110
		bodyModel[151] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 110
		bodyModel[152] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Door Front
		bodyModel[153] = new ModelRendererTurbo(this, 334, 413, textureX, textureY); // Box 744
		bodyModel[154] = new ModelRendererTurbo(this, 334, 419, textureX, textureY); // Box 745
		bodyModel[155] = new ModelRendererTurbo(this, 348, 427, textureX, textureY); // Box 746
		bodyModel[156] = new ModelRendererTurbo(this, 365, 427, textureX, textureY); // Box 747
		bodyModel[157] = new ModelRendererTurbo(this, 351, 408, textureX, textureY); // Box 750
		bodyModel[158] = new ModelRendererTurbo(this, 351, 403, textureX, textureY); // Box 751
		bodyModel[159] = new ModelRendererTurbo(this, 396, 410, textureX, textureY); // Box 752
		bodyModel[160] = new ModelRendererTurbo(this, 395, 419, textureX, textureY); // Box 753
		bodyModel[161] = new ModelRendererTurbo(this, 401, 410, textureX, textureY); // Box 754
		bodyModel[162] = new ModelRendererTurbo(this, 411, 410, textureX, textureY); // Box 755
		bodyModel[163] = new ModelRendererTurbo(this, 402, 419, textureX, textureY); // Box 756
		bodyModel[164] = new ModelRendererTurbo(this, 384, 403, textureX, textureY); // Box 758
		bodyModel[165] = new ModelRendererTurbo(this, 351, 417, textureX, textureY); // Box 760
		bodyModel[166] = new ModelRendererTurbo(this, 396, 414, textureX, textureY); // Box 761
		bodyModel[167] = new ModelRendererTurbo(this, 416, 419, textureX, textureY); // Box 762
		bodyModel[168] = new ModelRendererTurbo(this, 401, 414, textureX, textureY); // Box 763
		bodyModel[169] = new ModelRendererTurbo(this, 409, 424, textureX, textureY); // Box 765
		bodyModel[170] = new ModelRendererTurbo(this, 411, 414, textureX, textureY); // Box 766
		bodyModel[171] = new ModelRendererTurbo(this, 323, 407, textureX, textureY); // Box 768
		bodyModel[172] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[173] = new ModelRendererTurbo(this, 382, 427, textureX, textureY); // Box 770
		bodyModel[174] = new ModelRendererTurbo(this, 382, 434, textureX, textureY); // Box 771
		bodyModel[175] = new ModelRendererTurbo(this, 334, 413, textureX, textureY); // Box 744
		bodyModel[176] = new ModelRendererTurbo(this, 334, 419, textureX, textureY); // Box 745
		bodyModel[177] = new ModelRendererTurbo(this, 348, 427, textureX, textureY); // Box 746
		bodyModel[178] = new ModelRendererTurbo(this, 365, 427, textureX, textureY); // Box 747
		bodyModel[179] = new ModelRendererTurbo(this, 351, 408, textureX, textureY); // Box 750
		bodyModel[180] = new ModelRendererTurbo(this, 351, 403, textureX, textureY); // Box 751
		bodyModel[181] = new ModelRendererTurbo(this, 396, 410, textureX, textureY); // Box 752
		bodyModel[182] = new ModelRendererTurbo(this, 395, 419, textureX, textureY); // Box 753
		bodyModel[183] = new ModelRendererTurbo(this, 401, 410, textureX, textureY); // Box 754
		bodyModel[184] = new ModelRendererTurbo(this, 411, 410, textureX, textureY); // Box 755
		bodyModel[185] = new ModelRendererTurbo(this, 402, 419, textureX, textureY); // Box 756
		bodyModel[186] = new ModelRendererTurbo(this, 384, 403, textureX, textureY); // Box 758
		bodyModel[187] = new ModelRendererTurbo(this, 351, 417, textureX, textureY); // Box 760
		bodyModel[188] = new ModelRendererTurbo(this, 396, 414, textureX, textureY); // Box 761
		bodyModel[189] = new ModelRendererTurbo(this, 416, 419, textureX, textureY); // Box 762
		bodyModel[190] = new ModelRendererTurbo(this, 401, 414, textureX, textureY); // Box 763
		bodyModel[191] = new ModelRendererTurbo(this, 409, 424, textureX, textureY); // Box 765
		bodyModel[192] = new ModelRendererTurbo(this, 411, 414, textureX, textureY); // Box 766
		bodyModel[193] = new ModelRendererTurbo(this, 323, 407, textureX, textureY); // Box 768
		bodyModel[194] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[195] = new ModelRendererTurbo(this, 382, 427, textureX, textureY); // Box 770
		bodyModel[196] = new ModelRendererTurbo(this, 382, 434, textureX, textureY); // Box 771
		bodyModel[197] = new ModelRendererTurbo(this, 334, 400, textureX, textureY); // Box 450
		bodyModel[198] = new ModelRendererTurbo(this, 334, 407, textureX, textureY); // Box 451
		bodyModel[199] = new ModelRendererTurbo(this, 348, 434, textureX, textureY); // Box 452
		bodyModel[200] = new ModelRendererTurbo(this, 373, 403, textureX, textureY); // Box 453
		bodyModel[201] = new ModelRendererTurbo(this, 373, 408, textureX, textureY); // Box 454
		bodyModel[202] = new ModelRendererTurbo(this, 365, 434, textureX, textureY); // Box 457
		bodyModel[203] = new ModelRendererTurbo(this, 431, 410, textureX, textureY); // Box 459
		bodyModel[204] = new ModelRendererTurbo(this, 409, 419, textureX, textureY); // Box 460
		bodyModel[205] = new ModelRendererTurbo(this, 416, 410, textureX, textureY); // Box 461
		bodyModel[206] = new ModelRendererTurbo(this, 402, 424, textureX, textureY); // Box 462
		bodyModel[207] = new ModelRendererTurbo(this, 421, 410, textureX, textureY); // Box 463
		bodyModel[208] = new ModelRendererTurbo(this, 331, 427, textureX, textureY); // Box 576
		bodyModel[209] = new ModelRendererTurbo(this, 323, 419, textureX, textureY); // Box 577
		bodyModel[210] = new ModelRendererTurbo(this, 323, 413, textureX, textureY); // Box 578
		bodyModel[211] = new ModelRendererTurbo(this, 331, 434, textureX, textureY); // Box 579
		bodyModel[212] = new ModelRendererTurbo(this, 373, 417, textureX, textureY); // Box 582
		bodyModel[213] = new ModelRendererTurbo(this, 362, 403, textureX, textureY); // Box 583
		bodyModel[214] = new ModelRendererTurbo(this, 416, 424, textureX, textureY); // Box 585
		bodyModel[215] = new ModelRendererTurbo(this, 431, 414, textureX, textureY); // Box 586
		bodyModel[216] = new ModelRendererTurbo(this, 416, 414, textureX, textureY); // Box 587
		bodyModel[217] = new ModelRendererTurbo(this, 395, 424, textureX, textureY); // Box 588
		bodyModel[218] = new ModelRendererTurbo(this, 421, 414, textureX, textureY); // Box 589
		bodyModel[219] = new ModelRendererTurbo(this, 334, 413, textureX, textureY); // Box 744
		bodyModel[220] = new ModelRendererTurbo(this, 334, 419, textureX, textureY); // Box 745
		bodyModel[221] = new ModelRendererTurbo(this, 348, 427, textureX, textureY); // Box 746
		bodyModel[222] = new ModelRendererTurbo(this, 365, 427, textureX, textureY); // Box 747
		bodyModel[223] = new ModelRendererTurbo(this, 351, 408, textureX, textureY); // Box 750
		bodyModel[224] = new ModelRendererTurbo(this, 351, 403, textureX, textureY); // Box 751
		bodyModel[225] = new ModelRendererTurbo(this, 396, 410, textureX, textureY); // Box 752
		bodyModel[226] = new ModelRendererTurbo(this, 395, 419, textureX, textureY); // Box 753
		bodyModel[227] = new ModelRendererTurbo(this, 401, 410, textureX, textureY); // Box 754
		bodyModel[228] = new ModelRendererTurbo(this, 411, 410, textureX, textureY); // Box 755
		bodyModel[229] = new ModelRendererTurbo(this, 402, 419, textureX, textureY); // Box 756
		bodyModel[230] = new ModelRendererTurbo(this, 384, 403, textureX, textureY); // Box 758
		bodyModel[231] = new ModelRendererTurbo(this, 351, 417, textureX, textureY); // Box 760
		bodyModel[232] = new ModelRendererTurbo(this, 396, 414, textureX, textureY); // Box 761
		bodyModel[233] = new ModelRendererTurbo(this, 416, 419, textureX, textureY); // Box 762
		bodyModel[234] = new ModelRendererTurbo(this, 401, 414, textureX, textureY); // Box 763
		bodyModel[235] = new ModelRendererTurbo(this, 409, 424, textureX, textureY); // Box 765
		bodyModel[236] = new ModelRendererTurbo(this, 411, 414, textureX, textureY); // Box 766
		bodyModel[237] = new ModelRendererTurbo(this, 323, 407, textureX, textureY); // Box 768
		bodyModel[238] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[239] = new ModelRendererTurbo(this, 382, 427, textureX, textureY); // Box 770
		bodyModel[240] = new ModelRendererTurbo(this, 382, 434, textureX, textureY); // Box 771
		bodyModel[241] = new ModelRendererTurbo(this, 334, 400, textureX, textureY); // Box 450
		bodyModel[242] = new ModelRendererTurbo(this, 334, 407, textureX, textureY); // Box 451
		bodyModel[243] = new ModelRendererTurbo(this, 348, 434, textureX, textureY); // Box 452
		bodyModel[244] = new ModelRendererTurbo(this, 373, 403, textureX, textureY); // Box 453
		bodyModel[245] = new ModelRendererTurbo(this, 373, 408, textureX, textureY); // Box 454
		bodyModel[246] = new ModelRendererTurbo(this, 384, 408, textureX, textureY); // Box 456
		bodyModel[247] = new ModelRendererTurbo(this, 365, 434, textureX, textureY); // Box 457
		bodyModel[248] = new ModelRendererTurbo(this, 426, 410, textureX, textureY); // Box 458
		bodyModel[249] = new ModelRendererTurbo(this, 431, 410, textureX, textureY); // Box 459
		bodyModel[250] = new ModelRendererTurbo(this, 409, 419, textureX, textureY); // Box 460
		bodyModel[251] = new ModelRendererTurbo(this, 416, 410, textureX, textureY); // Box 461
		bodyModel[252] = new ModelRendererTurbo(this, 402, 424, textureX, textureY); // Box 462
		bodyModel[253] = new ModelRendererTurbo(this, 421, 410, textureX, textureY); // Box 463
		bodyModel[254] = new ModelRendererTurbo(this, 331, 427, textureX, textureY); // Box 576
		bodyModel[255] = new ModelRendererTurbo(this, 323, 419, textureX, textureY); // Box 577
		bodyModel[256] = new ModelRendererTurbo(this, 323, 413, textureX, textureY); // Box 578
		bodyModel[257] = new ModelRendererTurbo(this, 331, 434, textureX, textureY); // Box 579
		bodyModel[258] = new ModelRendererTurbo(this, 384, 417, textureX, textureY); // Box 581
		bodyModel[259] = new ModelRendererTurbo(this, 373, 417, textureX, textureY); // Box 582
		bodyModel[260] = new ModelRendererTurbo(this, 362, 403, textureX, textureY); // Box 583
		bodyModel[261] = new ModelRendererTurbo(this, 426, 414, textureX, textureY); // Box 584
		bodyModel[262] = new ModelRendererTurbo(this, 416, 424, textureX, textureY); // Box 585
		bodyModel[263] = new ModelRendererTurbo(this, 431, 414, textureX, textureY); // Box 586
		bodyModel[264] = new ModelRendererTurbo(this, 416, 414, textureX, textureY); // Box 587
		bodyModel[265] = new ModelRendererTurbo(this, 395, 424, textureX, textureY); // Box 588
		bodyModel[266] = new ModelRendererTurbo(this, 421, 414, textureX, textureY); // Box 589
		bodyModel[267] = new ModelRendererTurbo(this, 334, 400, textureX, textureY); // Box 450
		bodyModel[268] = new ModelRendererTurbo(this, 334, 407, textureX, textureY); // Box 451
		bodyModel[269] = new ModelRendererTurbo(this, 348, 434, textureX, textureY); // Box 452
		bodyModel[270] = new ModelRendererTurbo(this, 373, 403, textureX, textureY); // Box 453
		bodyModel[271] = new ModelRendererTurbo(this, 373, 408, textureX, textureY); // Box 454
		bodyModel[272] = new ModelRendererTurbo(this, 365, 434, textureX, textureY); // Box 457
		bodyModel[273] = new ModelRendererTurbo(this, 431, 410, textureX, textureY); // Box 459
		bodyModel[274] = new ModelRendererTurbo(this, 409, 419, textureX, textureY); // Box 460
		bodyModel[275] = new ModelRendererTurbo(this, 416, 410, textureX, textureY); // Box 461
		bodyModel[276] = new ModelRendererTurbo(this, 402, 424, textureX, textureY); // Box 462
		bodyModel[277] = new ModelRendererTurbo(this, 421, 410, textureX, textureY); // Box 463
		bodyModel[278] = new ModelRendererTurbo(this, 331, 427, textureX, textureY); // Box 576
		bodyModel[279] = new ModelRendererTurbo(this, 323, 419, textureX, textureY); // Box 577
		bodyModel[280] = new ModelRendererTurbo(this, 323, 413, textureX, textureY); // Box 578
		bodyModel[281] = new ModelRendererTurbo(this, 331, 434, textureX, textureY); // Box 579
		bodyModel[282] = new ModelRendererTurbo(this, 373, 417, textureX, textureY); // Box 582
		bodyModel[283] = new ModelRendererTurbo(this, 362, 403, textureX, textureY); // Box 583
		bodyModel[284] = new ModelRendererTurbo(this, 416, 424, textureX, textureY); // Box 585
		bodyModel[285] = new ModelRendererTurbo(this, 431, 414, textureX, textureY); // Box 586
		bodyModel[286] = new ModelRendererTurbo(this, 416, 414, textureX, textureY); // Box 587
		bodyModel[287] = new ModelRendererTurbo(this, 395, 424, textureX, textureY); // Box 588
		bodyModel[288] = new ModelRendererTurbo(this, 421, 414, textureX, textureY); // Box 589
		bodyModel[289] = new ModelRendererTurbo(this, 334, 413, textureX, textureY); // Box 744
		bodyModel[290] = new ModelRendererTurbo(this, 334, 419, textureX, textureY); // Box 745
		bodyModel[291] = new ModelRendererTurbo(this, 348, 427, textureX, textureY); // Box 746
		bodyModel[292] = new ModelRendererTurbo(this, 365, 427, textureX, textureY); // Box 747
		bodyModel[293] = new ModelRendererTurbo(this, 351, 408, textureX, textureY); // Box 750
		bodyModel[294] = new ModelRendererTurbo(this, 351, 403, textureX, textureY); // Box 751
		bodyModel[295] = new ModelRendererTurbo(this, 396, 410, textureX, textureY); // Box 752
		bodyModel[296] = new ModelRendererTurbo(this, 395, 419, textureX, textureY); // Box 753
		bodyModel[297] = new ModelRendererTurbo(this, 401, 410, textureX, textureY); // Box 754
		bodyModel[298] = new ModelRendererTurbo(this, 411, 410, textureX, textureY); // Box 755
		bodyModel[299] = new ModelRendererTurbo(this, 402, 419, textureX, textureY); // Box 756
		bodyModel[300] = new ModelRendererTurbo(this, 384, 403, textureX, textureY); // Box 758
		bodyModel[301] = new ModelRendererTurbo(this, 351, 417, textureX, textureY); // Box 760
		bodyModel[302] = new ModelRendererTurbo(this, 396, 414, textureX, textureY); // Box 761
		bodyModel[303] = new ModelRendererTurbo(this, 416, 419, textureX, textureY); // Box 762
		bodyModel[304] = new ModelRendererTurbo(this, 401, 414, textureX, textureY); // Box 763
		bodyModel[305] = new ModelRendererTurbo(this, 409, 424, textureX, textureY); // Box 765
		bodyModel[306] = new ModelRendererTurbo(this, 411, 414, textureX, textureY); // Box 766
		bodyModel[307] = new ModelRendererTurbo(this, 323, 407, textureX, textureY); // Box 768
		bodyModel[308] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[309] = new ModelRendererTurbo(this, 382, 427, textureX, textureY); // Box 770
		bodyModel[310] = new ModelRendererTurbo(this, 382, 434, textureX, textureY); // Box 771
		bodyModel[311] = new ModelRendererTurbo(this, 334, 400, textureX, textureY); // Box 450
		bodyModel[312] = new ModelRendererTurbo(this, 334, 407, textureX, textureY); // Box 451
		bodyModel[313] = new ModelRendererTurbo(this, 348, 434, textureX, textureY); // Box 452
		bodyModel[314] = new ModelRendererTurbo(this, 373, 403, textureX, textureY); // Box 453
		bodyModel[315] = new ModelRendererTurbo(this, 373, 408, textureX, textureY); // Box 454
		bodyModel[316] = new ModelRendererTurbo(this, 365, 434, textureX, textureY); // Box 457
		bodyModel[317] = new ModelRendererTurbo(this, 431, 410, textureX, textureY); // Box 459
		bodyModel[318] = new ModelRendererTurbo(this, 409, 419, textureX, textureY); // Box 460
		bodyModel[319] = new ModelRendererTurbo(this, 416, 410, textureX, textureY); // Box 461
		bodyModel[320] = new ModelRendererTurbo(this, 402, 424, textureX, textureY); // Box 462
		bodyModel[321] = new ModelRendererTurbo(this, 421, 410, textureX, textureY); // Box 463
		bodyModel[322] = new ModelRendererTurbo(this, 331, 427, textureX, textureY); // Box 576
		bodyModel[323] = new ModelRendererTurbo(this, 323, 419, textureX, textureY); // Box 577
		bodyModel[324] = new ModelRendererTurbo(this, 323, 413, textureX, textureY); // Box 578
		bodyModel[325] = new ModelRendererTurbo(this, 331, 434, textureX, textureY); // Box 579
		bodyModel[326] = new ModelRendererTurbo(this, 373, 417, textureX, textureY); // Box 582
		bodyModel[327] = new ModelRendererTurbo(this, 362, 403, textureX, textureY); // Box 583
		bodyModel[328] = new ModelRendererTurbo(this, 416, 424, textureX, textureY); // Box 585
		bodyModel[329] = new ModelRendererTurbo(this, 431, 414, textureX, textureY); // Box 586
		bodyModel[330] = new ModelRendererTurbo(this, 416, 414, textureX, textureY); // Box 587
		bodyModel[331] = new ModelRendererTurbo(this, 395, 424, textureX, textureY); // Box 588
		bodyModel[332] = new ModelRendererTurbo(this, 421, 414, textureX, textureY); // Box 589
		bodyModel[333] = new ModelRendererTurbo(this, 334, 413, textureX, textureY); // Box 744
		bodyModel[334] = new ModelRendererTurbo(this, 334, 419, textureX, textureY); // Box 745
		bodyModel[335] = new ModelRendererTurbo(this, 348, 427, textureX, textureY); // Box 746
		bodyModel[336] = new ModelRendererTurbo(this, 365, 427, textureX, textureY); // Box 747
		bodyModel[337] = new ModelRendererTurbo(this, 351, 408, textureX, textureY); // Box 750
		bodyModel[338] = new ModelRendererTurbo(this, 351, 403, textureX, textureY); // Box 751
		bodyModel[339] = new ModelRendererTurbo(this, 396, 410, textureX, textureY); // Box 752
		bodyModel[340] = new ModelRendererTurbo(this, 395, 419, textureX, textureY); // Box 753
		bodyModel[341] = new ModelRendererTurbo(this, 401, 410, textureX, textureY); // Box 754
		bodyModel[342] = new ModelRendererTurbo(this, 411, 410, textureX, textureY); // Box 755
		bodyModel[343] = new ModelRendererTurbo(this, 402, 419, textureX, textureY); // Box 756
		bodyModel[344] = new ModelRendererTurbo(this, 384, 403, textureX, textureY); // Box 758
		bodyModel[345] = new ModelRendererTurbo(this, 351, 417, textureX, textureY); // Box 760
		bodyModel[346] = new ModelRendererTurbo(this, 396, 414, textureX, textureY); // Box 761
		bodyModel[347] = new ModelRendererTurbo(this, 416, 419, textureX, textureY); // Box 762
		bodyModel[348] = new ModelRendererTurbo(this, 401, 414, textureX, textureY); // Box 763
		bodyModel[349] = new ModelRendererTurbo(this, 409, 424, textureX, textureY); // Box 765
		bodyModel[350] = new ModelRendererTurbo(this, 411, 414, textureX, textureY); // Box 766
		bodyModel[351] = new ModelRendererTurbo(this, 323, 407, textureX, textureY); // Box 768
		bodyModel[352] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[353] = new ModelRendererTurbo(this, 382, 427, textureX, textureY); // Box 770
		bodyModel[354] = new ModelRendererTurbo(this, 382, 434, textureX, textureY); // Box 771
		bodyModel[355] = new ModelRendererTurbo(this, 334, 400, textureX, textureY); // Box 450
		bodyModel[356] = new ModelRendererTurbo(this, 334, 407, textureX, textureY); // Box 451
		bodyModel[357] = new ModelRendererTurbo(this, 348, 434, textureX, textureY); // Box 452
		bodyModel[358] = new ModelRendererTurbo(this, 373, 403, textureX, textureY); // Box 453
		bodyModel[359] = new ModelRendererTurbo(this, 373, 408, textureX, textureY); // Box 454
		bodyModel[360] = new ModelRendererTurbo(this, 365, 434, textureX, textureY); // Box 457
		bodyModel[361] = new ModelRendererTurbo(this, 431, 410, textureX, textureY); // Box 459
		bodyModel[362] = new ModelRendererTurbo(this, 409, 419, textureX, textureY); // Box 460
		bodyModel[363] = new ModelRendererTurbo(this, 416, 410, textureX, textureY); // Box 461
		bodyModel[364] = new ModelRendererTurbo(this, 402, 424, textureX, textureY); // Box 462
		bodyModel[365] = new ModelRendererTurbo(this, 421, 410, textureX, textureY); // Box 463
		bodyModel[366] = new ModelRendererTurbo(this, 331, 427, textureX, textureY); // Box 576
		bodyModel[367] = new ModelRendererTurbo(this, 323, 419, textureX, textureY); // Box 577
		bodyModel[368] = new ModelRendererTurbo(this, 323, 413, textureX, textureY); // Box 578
		bodyModel[369] = new ModelRendererTurbo(this, 331, 434, textureX, textureY); // Box 579
		bodyModel[370] = new ModelRendererTurbo(this, 373, 417, textureX, textureY); // Box 582
		bodyModel[371] = new ModelRendererTurbo(this, 362, 403, textureX, textureY); // Box 583
		bodyModel[372] = new ModelRendererTurbo(this, 416, 424, textureX, textureY); // Box 585
		bodyModel[373] = new ModelRendererTurbo(this, 431, 414, textureX, textureY); // Box 586
		bodyModel[374] = new ModelRendererTurbo(this, 416, 414, textureX, textureY); // Box 587
		bodyModel[375] = new ModelRendererTurbo(this, 395, 424, textureX, textureY); // Box 588
		bodyModel[376] = new ModelRendererTurbo(this, 421, 414, textureX, textureY); // Box 589
		bodyModel[377] = new ModelRendererTurbo(this, 334, 413, textureX, textureY); // Box 744
		bodyModel[378] = new ModelRendererTurbo(this, 334, 419, textureX, textureY); // Box 745
		bodyModel[379] = new ModelRendererTurbo(this, 348, 427, textureX, textureY); // Box 746
		bodyModel[380] = new ModelRendererTurbo(this, 365, 427, textureX, textureY); // Box 747
		bodyModel[381] = new ModelRendererTurbo(this, 362, 408, textureX, textureY); // Box 748
		bodyModel[382] = new ModelRendererTurbo(this, 351, 408, textureX, textureY); // Box 750
		bodyModel[383] = new ModelRendererTurbo(this, 351, 403, textureX, textureY); // Box 751
		bodyModel[384] = new ModelRendererTurbo(this, 396, 410, textureX, textureY); // Box 752
		bodyModel[385] = new ModelRendererTurbo(this, 395, 419, textureX, textureY); // Box 753
		bodyModel[386] = new ModelRendererTurbo(this, 401, 410, textureX, textureY); // Box 754
		bodyModel[387] = new ModelRendererTurbo(this, 411, 410, textureX, textureY); // Box 755
		bodyModel[388] = new ModelRendererTurbo(this, 402, 419, textureX, textureY); // Box 756
		bodyModel[389] = new ModelRendererTurbo(this, 406, 410, textureX, textureY); // Box 757
		bodyModel[390] = new ModelRendererTurbo(this, 384, 403, textureX, textureY); // Box 758
		bodyModel[391] = new ModelRendererTurbo(this, 351, 417, textureX, textureY); // Box 760
		bodyModel[392] = new ModelRendererTurbo(this, 396, 414, textureX, textureY); // Box 761
		bodyModel[393] = new ModelRendererTurbo(this, 416, 419, textureX, textureY); // Box 762
		bodyModel[394] = new ModelRendererTurbo(this, 401, 414, textureX, textureY); // Box 763
		bodyModel[395] = new ModelRendererTurbo(this, 406, 414, textureX, textureY); // Box 764
		bodyModel[396] = new ModelRendererTurbo(this, 409, 424, textureX, textureY); // Box 765
		bodyModel[397] = new ModelRendererTurbo(this, 411, 414, textureX, textureY); // Box 766
		bodyModel[398] = new ModelRendererTurbo(this, 362, 417, textureX, textureY); // Box 767
		bodyModel[399] = new ModelRendererTurbo(this, 323, 407, textureX, textureY); // Box 768
		bodyModel[400] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[401] = new ModelRendererTurbo(this, 382, 427, textureX, textureY); // Box 770
		bodyModel[402] = new ModelRendererTurbo(this, 382, 434, textureX, textureY); // Box 771
		bodyModel[403] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 461
		bodyModel[404] = new ModelRendererTurbo(this, 334, 400, textureX, textureY); // Box 450
		bodyModel[405] = new ModelRendererTurbo(this, 334, 407, textureX, textureY); // Box 451
		bodyModel[406] = new ModelRendererTurbo(this, 348, 434, textureX, textureY); // Box 452
		bodyModel[407] = new ModelRendererTurbo(this, 373, 403, textureX, textureY); // Box 453
		bodyModel[408] = new ModelRendererTurbo(this, 373, 408, textureX, textureY); // Box 454
		bodyModel[409] = new ModelRendererTurbo(this, 365, 434, textureX, textureY); // Box 457
		bodyModel[410] = new ModelRendererTurbo(this, 431, 410, textureX, textureY); // Box 459
		bodyModel[411] = new ModelRendererTurbo(this, 409, 419, textureX, textureY); // Box 460
		bodyModel[412] = new ModelRendererTurbo(this, 416, 410, textureX, textureY); // Box 461
		bodyModel[413] = new ModelRendererTurbo(this, 402, 424, textureX, textureY); // Box 462
		bodyModel[414] = new ModelRendererTurbo(this, 421, 410, textureX, textureY); // Box 463
		bodyModel[415] = new ModelRendererTurbo(this, 331, 427, textureX, textureY); // Box 576
		bodyModel[416] = new ModelRendererTurbo(this, 323, 419, textureX, textureY); // Box 577
		bodyModel[417] = new ModelRendererTurbo(this, 323, 413, textureX, textureY); // Box 578
		bodyModel[418] = new ModelRendererTurbo(this, 331, 434, textureX, textureY); // Box 579
		bodyModel[419] = new ModelRendererTurbo(this, 373, 417, textureX, textureY); // Box 582
		bodyModel[420] = new ModelRendererTurbo(this, 362, 403, textureX, textureY); // Box 583
		bodyModel[421] = new ModelRendererTurbo(this, 416, 424, textureX, textureY); // Box 585
		bodyModel[422] = new ModelRendererTurbo(this, 431, 414, textureX, textureY); // Box 586
		bodyModel[423] = new ModelRendererTurbo(this, 416, 414, textureX, textureY); // Box 587
		bodyModel[424] = new ModelRendererTurbo(this, 395, 424, textureX, textureY); // Box 588
		bodyModel[425] = new ModelRendererTurbo(this, 421, 414, textureX, textureY); // Box 589
		bodyModel[426] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 878
		bodyModel[427] = new ModelRendererTurbo(this, 334, 413, textureX, textureY); // Box 744
		bodyModel[428] = new ModelRendererTurbo(this, 334, 419, textureX, textureY); // Box 745
		bodyModel[429] = new ModelRendererTurbo(this, 348, 427, textureX, textureY); // Box 746
		bodyModel[430] = new ModelRendererTurbo(this, 365, 427, textureX, textureY); // Box 747
		bodyModel[431] = new ModelRendererTurbo(this, 351, 408, textureX, textureY); // Box 750
		bodyModel[432] = new ModelRendererTurbo(this, 351, 403, textureX, textureY); // Box 751
		bodyModel[433] = new ModelRendererTurbo(this, 396, 410, textureX, textureY); // Box 752
		bodyModel[434] = new ModelRendererTurbo(this, 395, 419, textureX, textureY); // Box 753
		bodyModel[435] = new ModelRendererTurbo(this, 401, 410, textureX, textureY); // Box 754
		bodyModel[436] = new ModelRendererTurbo(this, 411, 410, textureX, textureY); // Box 755
		bodyModel[437] = new ModelRendererTurbo(this, 402, 419, textureX, textureY); // Box 756
		bodyModel[438] = new ModelRendererTurbo(this, 384, 403, textureX, textureY); // Box 758
		bodyModel[439] = new ModelRendererTurbo(this, 351, 417, textureX, textureY); // Box 760
		bodyModel[440] = new ModelRendererTurbo(this, 396, 414, textureX, textureY); // Box 761
		bodyModel[441] = new ModelRendererTurbo(this, 416, 419, textureX, textureY); // Box 762
		bodyModel[442] = new ModelRendererTurbo(this, 401, 414, textureX, textureY); // Box 763
		bodyModel[443] = new ModelRendererTurbo(this, 409, 424, textureX, textureY); // Box 765
		bodyModel[444] = new ModelRendererTurbo(this, 411, 414, textureX, textureY); // Box 766
		bodyModel[445] = new ModelRendererTurbo(this, 323, 407, textureX, textureY); // Box 768
		bodyModel[446] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[447] = new ModelRendererTurbo(this, 382, 427, textureX, textureY); // Box 770
		bodyModel[448] = new ModelRendererTurbo(this, 382, 434, textureX, textureY); // Box 771
		bodyModel[449] = new ModelRendererTurbo(this, 334, 400, textureX, textureY); // Box 450
		bodyModel[450] = new ModelRendererTurbo(this, 334, 407, textureX, textureY); // Box 451
		bodyModel[451] = new ModelRendererTurbo(this, 348, 434, textureX, textureY); // Box 452
		bodyModel[452] = new ModelRendererTurbo(this, 373, 403, textureX, textureY); // Box 453
		bodyModel[453] = new ModelRendererTurbo(this, 373, 408, textureX, textureY); // Box 454
		bodyModel[454] = new ModelRendererTurbo(this, 365, 434, textureX, textureY); // Box 457
		bodyModel[455] = new ModelRendererTurbo(this, 431, 410, textureX, textureY); // Box 459
		bodyModel[456] = new ModelRendererTurbo(this, 409, 419, textureX, textureY); // Box 460
		bodyModel[457] = new ModelRendererTurbo(this, 416, 410, textureX, textureY); // Box 461
		bodyModel[458] = new ModelRendererTurbo(this, 402, 424, textureX, textureY); // Box 462
		bodyModel[459] = new ModelRendererTurbo(this, 421, 410, textureX, textureY); // Box 463
		bodyModel[460] = new ModelRendererTurbo(this, 331, 427, textureX, textureY); // Box 576
		bodyModel[461] = new ModelRendererTurbo(this, 323, 419, textureX, textureY); // Box 577
		bodyModel[462] = new ModelRendererTurbo(this, 323, 413, textureX, textureY); // Box 578
		bodyModel[463] = new ModelRendererTurbo(this, 331, 434, textureX, textureY); // Box 579
		bodyModel[464] = new ModelRendererTurbo(this, 373, 417, textureX, textureY); // Box 582
		bodyModel[465] = new ModelRendererTurbo(this, 362, 403, textureX, textureY); // Box 583
		bodyModel[466] = new ModelRendererTurbo(this, 416, 424, textureX, textureY); // Box 585
		bodyModel[467] = new ModelRendererTurbo(this, 431, 414, textureX, textureY); // Box 586
		bodyModel[468] = new ModelRendererTurbo(this, 416, 414, textureX, textureY); // Box 587
		bodyModel[469] = new ModelRendererTurbo(this, 395, 424, textureX, textureY); // Box 588
		bodyModel[470] = new ModelRendererTurbo(this, 421, 414, textureX, textureY); // Box 589
		bodyModel[471] = new ModelRendererTurbo(this, 334, 413, textureX, textureY); // Box 744
		bodyModel[472] = new ModelRendererTurbo(this, 334, 419, textureX, textureY); // Box 745
		bodyModel[473] = new ModelRendererTurbo(this, 348, 427, textureX, textureY); // Box 746
		bodyModel[474] = new ModelRendererTurbo(this, 365, 427, textureX, textureY); // Box 747
		bodyModel[475] = new ModelRendererTurbo(this, 351, 408, textureX, textureY); // Box 750
		bodyModel[476] = new ModelRendererTurbo(this, 351, 403, textureX, textureY); // Box 751
		bodyModel[477] = new ModelRendererTurbo(this, 396, 410, textureX, textureY); // Box 752
		bodyModel[478] = new ModelRendererTurbo(this, 395, 419, textureX, textureY); // Box 753
		bodyModel[479] = new ModelRendererTurbo(this, 401, 410, textureX, textureY); // Box 754
		bodyModel[480] = new ModelRendererTurbo(this, 411, 410, textureX, textureY); // Box 755
		bodyModel[481] = new ModelRendererTurbo(this, 402, 419, textureX, textureY); // Box 756
		bodyModel[482] = new ModelRendererTurbo(this, 384, 403, textureX, textureY); // Box 758
		bodyModel[483] = new ModelRendererTurbo(this, 351, 417, textureX, textureY); // Box 760
		bodyModel[484] = new ModelRendererTurbo(this, 396, 414, textureX, textureY); // Box 761
		bodyModel[485] = new ModelRendererTurbo(this, 416, 419, textureX, textureY); // Box 762
		bodyModel[486] = new ModelRendererTurbo(this, 401, 414, textureX, textureY); // Box 763
		bodyModel[487] = new ModelRendererTurbo(this, 409, 424, textureX, textureY); // Box 765
		bodyModel[488] = new ModelRendererTurbo(this, 411, 414, textureX, textureY); // Box 766
		bodyModel[489] = new ModelRendererTurbo(this, 323, 407, textureX, textureY); // Box 768
		bodyModel[490] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[491] = new ModelRendererTurbo(this, 382, 427, textureX, textureY); // Box 770
		bodyModel[492] = new ModelRendererTurbo(this, 382, 434, textureX, textureY); // Box 771
		bodyModel[493] = new ModelRendererTurbo(this, 334, 400, textureX, textureY); // Box 450
		bodyModel[494] = new ModelRendererTurbo(this, 334, 407, textureX, textureY); // Box 451
		bodyModel[495] = new ModelRendererTurbo(this, 348, 434, textureX, textureY); // Box 452
		bodyModel[496] = new ModelRendererTurbo(this, 373, 403, textureX, textureY); // Box 453
		bodyModel[497] = new ModelRendererTurbo(this, 373, 408, textureX, textureY); // Box 454
		bodyModel[498] = new ModelRendererTurbo(this, 365, 434, textureX, textureY); // Box 457
		bodyModel[499] = new ModelRendererTurbo(this, 431, 410, textureX, textureY); // Box 459

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-1F, 0F, 0.6F, -1F, 0F, 0.6F, -1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[0].setRotationPoint(-98.3F, -5F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.6F, -1F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 84
		bodyModel[1].setRotationPoint(-98.3F, -5F, 8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.6F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.4F, 0F, 0F); // Box 85
		bodyModel[2].setRotationPoint(-98.3F, -5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -2F, 0F, -0.3F); // Box 87
		bodyModel[3].setRotationPoint(-98.3F, 0F, 8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[4].setRotationPoint(-98.3F, 0F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 153
		bodyModel[5].setRotationPoint(-103.3F, 0.25F, -7.2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[6].setRotationPoint(-103.8F, 0.75F, 5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 155
		bodyModel[7].setRotationPoint(-100.3F, 0.5F, 5.45F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 155
		bodyModel[8].setRotationPoint(-100.3F, 0.5F, -7.45F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[9].setRotationPoint(-103.8F, 0.75F, -8F);

		bodyModel[10].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Standard Seat
		bodyModel[10].setRotationPoint(-94.3F, -7F, 1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[11].setRotationPoint(-89.3F, -10F, 1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[12].setRotationPoint(-93.3F, -9F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		bodyModel[13].setRotationPoint(-93.3F, -9F, 8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[14].setRotationPoint(-89.3F, -12F, 1F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Standard Seat
		bodyModel[15].setRotationPoint(-94.3F, -7F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[16].setRotationPoint(-89.3F, -10F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[17].setRotationPoint(-93.3F, -9F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		bodyModel[18].setRotationPoint(-93.3F, -9F, -1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[19].setRotationPoint(-89.3F, -12F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 184, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 101
		bodyModel[20].setRotationPoint(-83.3F, -17F, 9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 107
		bodyModel[21].setRotationPoint(-96.3F, -17F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-5F, 0F, 0F, 4F, 0F, -1F, 3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0.6F, 0F, 0F, -0.6F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 108
		bodyModel[22].setRotationPoint(-98.3F, -17F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, -2F, 180, 5, 20, 0F,0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[23].setRotationPoint(-78.3F, -22F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 4F, 0F, -1F); // Box 111
		bodyModel[24].setRotationPoint(-96.3F, -17F, -3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 12, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 112
		bodyModel[25].setRotationPoint(-96.3F, -17F, 3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.6F, 0F, 0F); // Box 109
		bodyModel[26].setRotationPoint(-98.3F, -5F, 3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F); // Box 110
		bodyModel[27].setRotationPoint(-98.3F, -5F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[28].setRotationPoint(-98.3F, 0F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 13, 3, 18, 0F,0F, 0F, 0.36F, 0F, 0F, 0.36F, 0F, 0F, 0.36F, 0F, 0F, 0.36F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[29].setRotationPoint(-96.3F, -3F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 4F, 0F, -1F, -5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.6F, -1F, 0F, 0.6F); // Box 163
		bodyModel[30].setRotationPoint(-98.3F, -17F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 177
		bodyModel[31].setRotationPoint(-103.3F, 0.25F, 5.7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 220
		bodyModel[32].setRotationPoint(-98.9F, -3F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[33].setRotationPoint(-98.3F, -1F, 3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 222
		bodyModel[34].setRotationPoint(-98.9F, -3F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 223
		bodyModel[35].setRotationPoint(-98.3F, -1F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 226
		bodyModel[36].setRotationPoint(-98.9F, -3F, 5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 229
		bodyModel[37].setRotationPoint(-98.9F, -3F, 3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.65F, 0F, 0F, 0.65F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[38].setRotationPoint(-98.9F, -3F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 233
		bodyModel[39].setRotationPoint(-98.9F, -3F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-2F, -1F, 0F, 2F, -1F, 0F, 9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, -4F, 0F, -2F); // Box 161
		bodyModel[40].setRotationPoint(-99.3F, 5F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-9F, 0F, 0F, 9F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F, -4F, 0F, -2F, 4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[41].setRotationPoint(-99.3F, 5F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -9F, 0F, 0F, 9F, 0F, 0F, 2F, 1F, 0F, -2F, 1F, 0F); // Box 159
		bodyModel[42].setRotationPoint(-99.3F, 3F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -2F, 1F, 0F, 2F, 1F, 0F, 9F, 0F, 0F, -9F, 0F, 0F); // Box 159
		bodyModel[43].setRotationPoint(-99.3F, 3F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 107
		bodyModel[44].setRotationPoint(-92.8F, -21F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,-3F, -0.5F, -3F, 2.5F, 0F, -2F, 1.5F, 0.25F, 3F, -2F, -0.5F, 3F, -1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 3F, 0F, 0F, 3F); // Box 112
		bodyModel[45].setRotationPoint(-96.3F, -21F, -9F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Standard Seat
		bodyModel[46].setRotationPoint(-92.3F, -6F, -5.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Standard Seat
		bodyModel[47].setRotationPoint(-92.3F, -6F, 3.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F); // Box 396
		bodyModel[48].setRotationPoint(-99.3F, 1F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 397
		bodyModel[49].setRotationPoint(-100.55F, 2F, -0.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 398
		bodyModel[50].setRotationPoint(-101.55F, 1F, -0.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 22, 0F,-0.4F, 0F, -0.64F, 0F, 0F, -0.64F, 0F, 0F, -0.64F, -0.4F, 0F, -0.64F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 110
		bodyModel[51].setRotationPoint(-97.3F, -3F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,-2F, -0.5F, 3F, 1.5F, 0.25F, 3F, 2.5F, 0F, -2F, -3F, -0.5F, -3F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 1F, -1F, 0F, -1F); // Box 112
		bodyModel[52].setRotationPoint(-96.3F, -21F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 107
		bodyModel[53].setRotationPoint(-92.8F, -21F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 107
		bodyModel[54].setRotationPoint(-92.8F, -21F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-2F, -0.5F, 0F, 2.5F, 0.25F, 0F, 2.5F, 0.25F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[55].setRotationPoint(-96.3F, -21F, -3F);

		bodyModel[56].addShapeBox(-3F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[56].setRotationPoint(-98.3F, 1.5F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[57].setRotationPoint(-87.3F, 5F, 9.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[58].setRotationPoint(-84.3F, 0F, 9.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[59].setRotationPoint(-87.3F, 2F, 9.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 207
		bodyModel[60].setRotationPoint(-87.3F, 5F, -10.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 204
		bodyModel[61].setRotationPoint(-84.3F, 0F, -10.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 207
		bodyModel[62].setRotationPoint(-87.3F, 2F, -10.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 204
		bodyModel[63].setRotationPoint(-101.8F, 1.5F, 7.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[64].setRotationPoint(-100.8F, 4.5F, 7.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[65].setRotationPoint(-97.8F, 2.5F, 7.5F);

		bodyModel[66].addShapeBox(-3F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 170
		bodyModel[66].setRotationPoint(-98.3F, 1.5F, -8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 204
		bodyModel[67].setRotationPoint(-101.8F, 1.5F, -8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 207
		bodyModel[68].setRotationPoint(-100.8F, 4.5F, -8.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 204
		bodyModel[69].setRotationPoint(-97.8F, 2.5F, -8.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.45F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.1F, 0F, 0F); // Box 186
		bodyModel[70].setRotationPoint(-98.05F, -10F, 3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,-0.1F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, -0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0.25F, 0F, 0F); // Box 189
		bodyModel[71].setRotationPoint(-97.7F, -10F, -3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 185
		bodyModel[72].setRotationPoint(-96.05F, -9F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.36F, 0F, 0F, 0.25F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.55F, 0.5F, 0F, 0.375F); // Box 185
		bodyModel[73].setRotationPoint(-96.05F, -9F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.24F, 0F, -3.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.5F); // Box 189
		bodyModel[74].setRotationPoint(-97.05F, -11F, 2.43F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-3F, 0F, 0F, 2F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[75].setRotationPoint(-97.05F, -11F, -0.57F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -0.5F, -3F, 0F, -0.125F, -0.1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, -3F, 0F, -0.1F); // Box 189
		bodyModel[76].setRotationPoint(-97.05F, -11F, 6.43F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[77].setRotationPoint(-97.05F, -11F, -0.57F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 189
		bodyModel[78].setRotationPoint(-98.05F, -11F, -0.57F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0.1F, 0F, 0F, 1.25F, 0F, 0.3F, -2F, 0F, 0.15F, -0.7F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0.3F, -2F, 0F, 0.26F); // Box 185
		bodyModel[79].setRotationPoint(-97.3F, -11F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.36F, -2.1F, 0F, 0.125F, -0.75F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.4F, -1.75F, 0F, 0.25F); // Box 185
		bodyModel[80].setRotationPoint(-97.75F, -10F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,-1.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 186
		bodyModel[81].setRotationPoint(-98.05F, -10F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.65F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.65F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 185
		bodyModel[82].setRotationPoint(-97.2F, -11F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 185
		bodyModel[83].setRotationPoint(-96.05F, -9F, -0.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 185
		bodyModel[84].setRotationPoint(-96.05F, -5F, -0.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F); // Box 168
		bodyModel[85].setRotationPoint(-94.8F, -10.5F, 2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 168
		bodyModel[86].setRotationPoint(-95.55F, -10.6F, 3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F); // Box 168
		bodyModel[87].setRotationPoint(-95.55F, -10.85F, 3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 168
		bodyModel[88].setRotationPoint(-95.55F, -10.6F, 2.33F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F); // Box 168
		bodyModel[89].setRotationPoint(-95.55F, -10.85F, 2.33F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 168
		bodyModel[90].setRotationPoint(-95.55F, -10.6F, 5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F); // Box 168
		bodyModel[91].setRotationPoint(-95.55F, -10.85F, 5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F); // Box 168
		bodyModel[92].setRotationPoint(-94.8F, -10.5F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F); // Box 168
		bodyModel[93].setRotationPoint(-94.8F, -10.6F, 6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F, -0.4F, -0.75F, -0.4F); // Box 168
		bodyModel[94].setRotationPoint(-94.8F, -10.85F, 6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[95].setRotationPoint(-95.8F, -20F, -1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[96].setRotationPoint(-96.05F, -20F, -1F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F); // Box 168
		bodyModel[97].setRotationPoint(-96.05F, -10.5F, 4.4F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F, -0.35F); // Box 168
		bodyModel[98].setRotationPoint(-96.05F, -10.5F, 3.65F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 62
		bodyModel[99].setRotationPoint(-96.3F, 0F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.04F, 0F, 0F, -0.04F, 0F, 0F, 0.06F, -0.4F, 0F, 0.06F); // Box 114
		bodyModel[100].setRotationPoint(-97.3F, -5F, -10.4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, -0.64F, 0F, 0F, -0.64F, 0F, 0F, 0.64F, 0F, 0F, 0.64F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0.99F, 0F, 0F, 0.99F); // Box 62
		bodyModel[101].setRotationPoint(-96.3F, -3F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, -2F, 6, 12, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 1F, 0F, -0.6F); // Box 151
		bodyModel[102].setRotationPoint(-96.3F, -17F, -8F);

		bodyModel[103].addShapeBox(0F, 0F, -2F, 15, 4, 20, 0F,-1.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -1.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[103].setRotationPoint(-93.3F, -21F, -8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.36F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.375F, -0.5F, 0F, 0.55F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 185
		bodyModel[104].setRotationPoint(-96.05F, -9F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2.1F, 0F, 0.125F, -0.3F, 0F, 0.36F, -0.3F, 0F, 0F, -1.1F, 0F, 0F, -1.75F, 0F, 0.25F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0F, -0.75F, 0F, 0F); // Box 185
		bodyModel[105].setRotationPoint(-97.75F, -10F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 323
		bodyModel[106].setRotationPoint(102.3F, -19F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 184, 7, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 31
		bodyModel[107].setRotationPoint(-83.3F, -5F, 9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 184, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 101
		bodyModel[108].setRotationPoint(-83.3F, -17F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 31
		bodyModel[109].setRotationPoint(100.7F, -5F, 4F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 101
		bodyModel[110].setRotationPoint(100.7F, -17F, 4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 323
		bodyModel[111].setRotationPoint(102.3F, -19F, 4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 323
		bodyModel[112].setRotationPoint(102.3F, -19F, -4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 323
		bodyModel[113].setRotationPoint(102.3F, -1F, -4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 184, 3, 18, 0F,0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, 0.145F, 0F, 0F, -0.195F, 0F, 0F, -0.195F, 0F, 0F, -0.195F, 0F, 0F, -0.195F); // Box 110
		bodyModel[114].setRotationPoint(-83.3F, -1F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 101
		bodyModel[115].setRotationPoint(-90.3F, -17F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 204
		bodyModel[116].setRotationPoint(-88.3F, 0F, -10.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 184, 7, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 31
		bodyModel[117].setRotationPoint(-83.3F, -5F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.64F, 0F, 0F, -0.64F, 0F, 0F, 0.64F, 0F, 0F, 0.64F, 0F, 0F, -0.87F, 0F, 0F, -0.87F, 0F, 0F, 0.87F, 0F, 0F, 0.87F); // Box 62
		bodyModel[118].setRotationPoint(-87.3F, -3F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.64F, 0F, 0F, -0.64F, 0F, 0F, 0.64F, 0F, 0F, 0.64F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0.99F, 0F, 0F, 0.99F); // Box 62
		bodyModel[119].setRotationPoint(-84.3F, -3F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.02F, 0F, 0F, 0.02F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 62
		bodyModel[120].setRotationPoint(-96.3F, 0F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.06F, 0F, 0F, 0.06F, 0F, 0F, -0.04F, -0.4F, 0F, -0.04F); // Box 114
		bodyModel[121].setRotationPoint(-97.3F, -5F, 9.4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0.64F, 0F, 0F, 0.64F, 0F, 0F, -0.64F, 0F, 0F, -0.64F, 0F, 0F, 0.99F, 0F, 0F, 0.99F, 0F, 0F, -0.99F, 0F, 0F, -0.99F); // Box 62
		bodyModel[122].setRotationPoint(-96.3F, -3F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, -2F, 6, 12, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 1F, 0F, 0.6F); // Box 151
		bodyModel[123].setRotationPoint(-96.3F, -17F, 11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Door Right Top
		bodyModel[124].setRotationPoint(-88.3F, -17F, 9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 101
		bodyModel[125].setRotationPoint(-90.3F, -17F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.06F, 0F, 0F, -0.06F, 0F, 0F, -0.14F, 0F, 0F, -0.14F); // Door Right Buttom
		bodyModel[126].setRotationPoint(-88.3F, -5F, 9.4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.64F, 0F, 0F, 0.64F, 0F, 0F, -0.64F, 0F, 0F, -0.64F, 0F, 0F, 0.87F, 0F, 0F, 0.87F, 0F, 0F, -0.87F, 0F, 0F, -0.87F); // Box 62
		bodyModel[127].setRotationPoint(-87.3F, -3F, 10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.64F, 0F, 0F, 0.64F, 0F, 0F, -0.64F, 0F, 0F, -0.64F, 0F, 0F, 0.99F, 0F, 0F, 0.99F, 0F, 0F, -0.99F, 0F, 0F, -0.99F); // Box 62
		bodyModel[128].setRotationPoint(-84.3F, -3F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 204
		bodyModel[129].setRotationPoint(-88.3F, 0F, 9.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 12, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Door Left Top
		bodyModel[130].setRotationPoint(-88.3F, -17F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.14F, 0F, 0F, -0.14F, 0F, 0F, -0.06F, 0F, 0F, -0.06F); // Door Left Buttom
		bodyModel[131].setRotationPoint(-88.3F, -5F, -10.4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 115, 5, 20, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 110
		bodyModel[132].setRotationPoint(-57.3F, 2F, -10F);

		bodyModel[133].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[133].setRotationPoint(73.6F, 1F, -1F);

		bodyModel[134].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		bodyModel[134].setRotationPoint(-75.4F, 1F, -1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 5, 20, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F); // Box 110
		bodyModel[135].setRotationPoint(57.7F, 2F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 5, 20, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 110
		bodyModel[136].setRotationPoint(-60.3F, 2F, -10F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 10, 5, 20, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 110
		bodyModel[137].setRotationPoint(91.7F, 2F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 5, 20, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 110
		bodyModel[138].setRotationPoint(88.7F, 2F, -10F);

		bodyModel[139].addShapeBox(0F, 0F, -2F, 180, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[139].setRotationPoint(-78.3F, -22F, -5F);

		bodyModel[140].addShapeBox(0F, 0F, -2F, 14, 1, 4, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
		bodyModel[140].setRotationPoint(-92.3F, -22F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, -2F, 180, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[141].setRotationPoint(-78.3F, -22F, 5F);

		bodyModel[142].addShapeBox(0F, 0F, -2F, 180, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[142].setRotationPoint(-78.3F, -22F, -1F);

		bodyModel[143].addShapeBox(0F, 0F, -2F, 14, 1, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
		bodyModel[143].setRotationPoint(-92.3F, -22F, 5F);

		bodyModel[144].addShapeBox(0F, 0F, -2F, 14, 1, 6, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
		bodyModel[144].setRotationPoint(-92.3F, -22F, -1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 323
		bodyModel[145].setRotationPoint(102.3F, 0F, -2F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 101
		bodyModel[146].setRotationPoint(-83.3F, -17F, 3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[147].setRotationPoint(-83.3F, -17F, -9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 31
		bodyModel[148].setRotationPoint(-83.3F, -5F, 3F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[149].setRotationPoint(-83.3F, -5F, -9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[150].setRotationPoint(-83.3F, -3F, -3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[151].setRotationPoint(-81.3F, -2F, -3F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 14, 6, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Door Front
		bodyModel[152].setRotationPoint(-83.3F, -17F, -3F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 744
		bodyModel[153].setRotationPoint(10.95F, -3F, 6.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 745
		bodyModel[154].setRotationPoint(10.95F, -3F, 3F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[155].setRotationPoint(10.45F, -4F, 5.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[156].setRotationPoint(10.45F, -4F, 2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[157].setRotationPoint(13.45F, -8F, 2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 751
		bodyModel[158].setRotationPoint(10.95F, -6.2F, 2F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		bodyModel[159].setRotationPoint(13.95F, -10F, 2.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[160].setRotationPoint(14.45F, -10F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 754
		bodyModel[161].setRotationPoint(13.95F, -10F, 5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 755
		bodyModel[162].setRotationPoint(13.95F, -10F, 6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[163].setRotationPoint(14.45F, -10F, 6.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 758
		bodyModel[164].setRotationPoint(-0.55F, -6.2F, 2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[165].setRotationPoint(-0.0500000000000001F, -8F, 2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[166].setRotationPoint(-0.55F, -10F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		bodyModel[167].setRotationPoint(-1.05F, -10F, 3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[168].setRotationPoint(-0.55F, -10F, 2.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 765
		bodyModel[169].setRotationPoint(-1.05F, -10F, 6.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[170].setRotationPoint(-0.55F, -10F, 6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[171].setRotationPoint(1.45F, -3F, 6.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 769
		bodyModel[172].setRotationPoint(1.45F, -3F, 3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 770
		bodyModel[173].setRotationPoint(-0.0500000000000001F, -4F, 2F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[174].setRotationPoint(-0.0500000000000001F, -4F, 5.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 744
		bodyModel[175].setRotationPoint(-5.05F, -3F, 6.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 745
		bodyModel[176].setRotationPoint(-5.05F, -3F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[177].setRotationPoint(-5.55F, -4F, 5.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[178].setRotationPoint(-5.55F, -4F, 2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[179].setRotationPoint(-2.55F, -8F, 2F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 751
		bodyModel[180].setRotationPoint(-5.05F, -6.2F, 2F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		bodyModel[181].setRotationPoint(-2.05F, -10F, 2.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[182].setRotationPoint(-1.55F, -10F, 3F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 754
		bodyModel[183].setRotationPoint(-2.05F, -10F, 5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 755
		bodyModel[184].setRotationPoint(-2.05F, -10F, 6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[185].setRotationPoint(-1.55F, -10F, 6.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 758
		bodyModel[186].setRotationPoint(-16.55F, -6.2F, 2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[187].setRotationPoint(-16.05F, -8F, 2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[188].setRotationPoint(-16.55F, -10F, 5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		bodyModel[189].setRotationPoint(-17.05F, -10F, 3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[190].setRotationPoint(-16.55F, -10F, 2.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 765
		bodyModel[191].setRotationPoint(-17.05F, -10F, 6.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[192].setRotationPoint(-16.55F, -10F, 6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[193].setRotationPoint(-14.55F, -3F, 6.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 769
		bodyModel[194].setRotationPoint(-14.55F, -3F, 3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 770
		bodyModel[195].setRotationPoint(-16.05F, -4F, 2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[196].setRotationPoint(-16.05F, -4F, 5.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[197].setRotationPoint(10.95F, -3F, -9.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[198].setRotationPoint(10.95F, -3F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
		bodyModel[199].setRotationPoint(10.45F, -4F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[200].setRotationPoint(10.95F, -6.2F, -3F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		bodyModel[201].setRotationPoint(13.45F, -8F, -6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		bodyModel[202].setRotationPoint(10.45F, -4F, -9.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[203].setRotationPoint(13.95F, -10F, -7F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		bodyModel[204].setRotationPoint(14.45F, -10F, -8.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 461
		bodyModel[205].setRotationPoint(13.95F, -10F, -6F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		bodyModel[206].setRotationPoint(14.45F, -10F, -5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 463
		bodyModel[207].setRotationPoint(13.95F, -10F, -3.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 576
		bodyModel[208].setRotationPoint(-0.0500000000000001F, -4F, -6F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[209].setRotationPoint(1.45F, -3F, -9.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[210].setRotationPoint(1.45F, -3F, -6F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 579
		bodyModel[211].setRotationPoint(-0.0500000000000001F, -4F, -9.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 582
		bodyModel[212].setRotationPoint(-0.0500000000000001F, -8F, -6F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 583
		bodyModel[213].setRotationPoint(-0.55F, -6.2F, -3F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 585
		bodyModel[214].setRotationPoint(-1.05F, -10F, -8.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[215].setRotationPoint(-0.55F, -10F, -7F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[216].setRotationPoint(-0.55F, -10F, -6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 588
		bodyModel[217].setRotationPoint(-1.05F, -10F, -5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[218].setRotationPoint(-0.55F, -10F, -3.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 744
		bodyModel[219].setRotationPoint(-69.05F, -3F, 6.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 745
		bodyModel[220].setRotationPoint(-69.05F, -3F, 3F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[221].setRotationPoint(-69.55F, -4F, 5.5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[222].setRotationPoint(-69.55F, -4F, 2F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[223].setRotationPoint(-66.55F, -8F, 2F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 751
		bodyModel[224].setRotationPoint(-69.05F, -6.2F, 2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		bodyModel[225].setRotationPoint(-66.05F, -10F, 2.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[226].setRotationPoint(-65.55F, -10F, 3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 754
		bodyModel[227].setRotationPoint(-66.05F, -10F, 5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 755
		bodyModel[228].setRotationPoint(-66.05F, -10F, 6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[229].setRotationPoint(-65.55F, -10F, 6.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 758
		bodyModel[230].setRotationPoint(-80.55F, -6.2F, 2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[231].setRotationPoint(-80.05F, -8F, 2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[232].setRotationPoint(-80.55F, -10F, 5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		bodyModel[233].setRotationPoint(-81.05F, -10F, 3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[234].setRotationPoint(-80.55F, -10F, 2.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 765
		bodyModel[235].setRotationPoint(-81.05F, -10F, 6.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[236].setRotationPoint(-80.55F, -10F, 6F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[237].setRotationPoint(-78.55F, -3F, 6.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 769
		bodyModel[238].setRotationPoint(-78.55F, -3F, 3F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 770
		bodyModel[239].setRotationPoint(-80.05F, -4F, 2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[240].setRotationPoint(-80.05F, -4F, 5.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[241].setRotationPoint(-69.05F, -3F, -9.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[242].setRotationPoint(-69.05F, -3F, -6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
		bodyModel[243].setRotationPoint(-69.55F, -4F, -6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[244].setRotationPoint(-69.05F, -6.2F, -3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		bodyModel[245].setRotationPoint(-66.55F, -8F, -6F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[246].setRotationPoint(-66.55F, -8F, -9.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		bodyModel[247].setRotationPoint(-69.55F, -4F, -9.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[248].setRotationPoint(-66.05F, -10F, -9.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[249].setRotationPoint(-66.05F, -10F, -7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		bodyModel[250].setRotationPoint(-65.55F, -10F, -8.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 461
		bodyModel[251].setRotationPoint(-66.05F, -10F, -6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		bodyModel[252].setRotationPoint(-65.55F, -10F, -5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 463
		bodyModel[253].setRotationPoint(-66.05F, -10F, -3.5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 576
		bodyModel[254].setRotationPoint(-80.05F, -4F, -6F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[255].setRotationPoint(-78.55F, -3F, -9.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[256].setRotationPoint(-78.55F, -3F, -6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 579
		bodyModel[257].setRotationPoint(-80.05F, -4F, -9.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 581
		bodyModel[258].setRotationPoint(-80.05F, -8F, -9.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 582
		bodyModel[259].setRotationPoint(-80.05F, -8F, -6F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 583
		bodyModel[260].setRotationPoint(-80.55F, -6.2F, -3F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[261].setRotationPoint(-80.55F, -10F, -9.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 585
		bodyModel[262].setRotationPoint(-81.05F, -10F, -8.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[263].setRotationPoint(-80.55F, -10F, -7F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[264].setRotationPoint(-80.55F, -10F, -6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 588
		bodyModel[265].setRotationPoint(-81.05F, -10F, -5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[266].setRotationPoint(-80.55F, -10F, -3.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[267].setRotationPoint(-5.05F, -3F, -9.5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[268].setRotationPoint(-5.05F, -3F, -6F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
		bodyModel[269].setRotationPoint(-5.55F, -4F, -6F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[270].setRotationPoint(-5.05F, -6.2F, -3F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		bodyModel[271].setRotationPoint(-2.55F, -8F, -6F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		bodyModel[272].setRotationPoint(-5.55F, -4F, -9.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[273].setRotationPoint(-2.05F, -10F, -7F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		bodyModel[274].setRotationPoint(-1.55F, -10F, -8.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 461
		bodyModel[275].setRotationPoint(-2.05F, -10F, -6F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		bodyModel[276].setRotationPoint(-1.55F, -10F, -5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 463
		bodyModel[277].setRotationPoint(-2.05F, -10F, -3.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 576
		bodyModel[278].setRotationPoint(-16.05F, -4F, -6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[279].setRotationPoint(-14.55F, -3F, -9.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[280].setRotationPoint(-14.55F, -3F, -6F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 579
		bodyModel[281].setRotationPoint(-16.05F, -4F, -9.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 582
		bodyModel[282].setRotationPoint(-16.05F, -8F, -6F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 583
		bodyModel[283].setRotationPoint(-16.55F, -6.2F, -3F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 585
		bodyModel[284].setRotationPoint(-17.05F, -10F, -8.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[285].setRotationPoint(-16.55F, -10F, -7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[286].setRotationPoint(-16.55F, -10F, -6F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 588
		bodyModel[287].setRotationPoint(-17.05F, -10F, -5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[288].setRotationPoint(-16.55F, -10F, -3.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 744
		bodyModel[289].setRotationPoint(26.95F, -3F, 6.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 745
		bodyModel[290].setRotationPoint(26.95F, -3F, 3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[291].setRotationPoint(26.45F, -4F, 5.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[292].setRotationPoint(26.45F, -4F, 2F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[293].setRotationPoint(29.45F, -8F, 2F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 751
		bodyModel[294].setRotationPoint(26.95F, -6.2F, 2F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		bodyModel[295].setRotationPoint(29.95F, -10F, 2.5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[296].setRotationPoint(30.45F, -10F, 3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 754
		bodyModel[297].setRotationPoint(29.95F, -10F, 5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 755
		bodyModel[298].setRotationPoint(29.95F, -10F, 6F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[299].setRotationPoint(30.45F, -10F, 6.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 758
		bodyModel[300].setRotationPoint(15.45F, -6.2F, 2F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[301].setRotationPoint(15.95F, -8F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[302].setRotationPoint(15.45F, -10F, 5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		bodyModel[303].setRotationPoint(14.95F, -10F, 3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[304].setRotationPoint(15.45F, -10F, 2.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 765
		bodyModel[305].setRotationPoint(14.95F, -10F, 6.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[306].setRotationPoint(15.45F, -10F, 6F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[307].setRotationPoint(17.45F, -3F, 6.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 769
		bodyModel[308].setRotationPoint(17.45F, -3F, 3F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 770
		bodyModel[309].setRotationPoint(15.95F, -4F, 2F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[310].setRotationPoint(15.95F, -4F, 5.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[311].setRotationPoint(26.95F, -3F, -9.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[312].setRotationPoint(26.95F, -3F, -6F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
		bodyModel[313].setRotationPoint(26.45F, -4F, -6F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[314].setRotationPoint(26.95F, -6.2F, -3F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		bodyModel[315].setRotationPoint(29.45F, -8F, -6F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		bodyModel[316].setRotationPoint(26.45F, -4F, -9.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[317].setRotationPoint(29.95F, -10F, -7F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		bodyModel[318].setRotationPoint(30.45F, -10F, -8.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 461
		bodyModel[319].setRotationPoint(29.95F, -10F, -6F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		bodyModel[320].setRotationPoint(30.45F, -10F, -5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 463
		bodyModel[321].setRotationPoint(29.95F, -10F, -3.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 576
		bodyModel[322].setRotationPoint(15.95F, -4F, -6F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[323].setRotationPoint(17.45F, -3F, -9.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[324].setRotationPoint(17.45F, -3F, -6F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 579
		bodyModel[325].setRotationPoint(15.95F, -4F, -9.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 582
		bodyModel[326].setRotationPoint(15.95F, -8F, -6F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 583
		bodyModel[327].setRotationPoint(15.45F, -6.2F, -3F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 585
		bodyModel[328].setRotationPoint(14.95F, -10F, -8.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[329].setRotationPoint(15.45F, -10F, -7F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[330].setRotationPoint(15.45F, -10F, -6F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 588
		bodyModel[331].setRotationPoint(14.95F, -10F, -5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[332].setRotationPoint(15.45F, -10F, -3.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 744
		bodyModel[333].setRotationPoint(42.95F, -3F, 6.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 745
		bodyModel[334].setRotationPoint(42.95F, -3F, 3F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[335].setRotationPoint(42.45F, -4F, 5.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[336].setRotationPoint(42.45F, -4F, 2F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[337].setRotationPoint(45.45F, -8F, 2F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 751
		bodyModel[338].setRotationPoint(42.95F, -6.2F, 2F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		bodyModel[339].setRotationPoint(45.95F, -10F, 2.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[340].setRotationPoint(46.45F, -10F, 3F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 754
		bodyModel[341].setRotationPoint(45.95F, -10F, 5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 755
		bodyModel[342].setRotationPoint(45.95F, -10F, 6F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[343].setRotationPoint(46.45F, -10F, 6.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 758
		bodyModel[344].setRotationPoint(31.45F, -6.2F, 2F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[345].setRotationPoint(31.95F, -8F, 2F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[346].setRotationPoint(31.45F, -10F, 5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		bodyModel[347].setRotationPoint(30.95F, -10F, 3F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[348].setRotationPoint(31.45F, -10F, 2.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 765
		bodyModel[349].setRotationPoint(30.95F, -10F, 6.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[350].setRotationPoint(31.45F, -10F, 6F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[351].setRotationPoint(33.45F, -3F, 6.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 769
		bodyModel[352].setRotationPoint(33.45F, -3F, 3F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 770
		bodyModel[353].setRotationPoint(31.95F, -4F, 2F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[354].setRotationPoint(31.95F, -4F, 5.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[355].setRotationPoint(42.95F, -3F, -9.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[356].setRotationPoint(42.95F, -3F, -6F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
		bodyModel[357].setRotationPoint(42.45F, -4F, -6F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[358].setRotationPoint(42.95F, -6.2F, -3F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		bodyModel[359].setRotationPoint(45.45F, -8F, -6F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		bodyModel[360].setRotationPoint(42.45F, -4F, -9.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[361].setRotationPoint(45.95F, -10F, -7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		bodyModel[362].setRotationPoint(46.45F, -10F, -8.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 461
		bodyModel[363].setRotationPoint(45.95F, -10F, -6F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		bodyModel[364].setRotationPoint(46.45F, -10F, -5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 463
		bodyModel[365].setRotationPoint(45.95F, -10F, -3.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 576
		bodyModel[366].setRotationPoint(31.95F, -4F, -6F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[367].setRotationPoint(33.45F, -3F, -9.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[368].setRotationPoint(33.45F, -3F, -6F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 579
		bodyModel[369].setRotationPoint(31.95F, -4F, -9.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 582
		bodyModel[370].setRotationPoint(31.95F, -8F, -6F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 583
		bodyModel[371].setRotationPoint(31.45F, -6.2F, -3F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 585
		bodyModel[372].setRotationPoint(30.95F, -10F, -8.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[373].setRotationPoint(31.45F, -10F, -7F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[374].setRotationPoint(31.45F, -10F, -6F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 588
		bodyModel[375].setRotationPoint(30.95F, -10F, -5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[376].setRotationPoint(31.45F, -10F, -3.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 744
		bodyModel[377].setRotationPoint(58.95F, -3F, 6.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 745
		bodyModel[378].setRotationPoint(58.95F, -3F, 3F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[379].setRotationPoint(58.45F, -4F, 5.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[380].setRotationPoint(58.45F, -4F, 2F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[381].setRotationPoint(61.45F, -8F, 5.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[382].setRotationPoint(61.45F, -8F, 2F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 751
		bodyModel[383].setRotationPoint(58.95F, -6.2F, 2F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		bodyModel[384].setRotationPoint(61.95F, -10F, 2.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[385].setRotationPoint(62.45F, -10F, 3F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 754
		bodyModel[386].setRotationPoint(61.95F, -10F, 5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 755
		bodyModel[387].setRotationPoint(61.95F, -10F, 6F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[388].setRotationPoint(62.45F, -10F, 6.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 757
		bodyModel[389].setRotationPoint(61.95F, -10F, 8.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 758
		bodyModel[390].setRotationPoint(47.45F, -6.2F, 2F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[391].setRotationPoint(47.95F, -8F, 2F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[392].setRotationPoint(47.45F, -10F, 5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		bodyModel[393].setRotationPoint(46.95F, -10F, 3F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[394].setRotationPoint(47.45F, -10F, 2.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 764
		bodyModel[395].setRotationPoint(47.45F, -10F, 8.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 765
		bodyModel[396].setRotationPoint(46.95F, -10F, 6.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[397].setRotationPoint(47.45F, -10F, 6F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[398].setRotationPoint(47.95F, -8F, 5.5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[399].setRotationPoint(49.45F, -3F, 6.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 769
		bodyModel[400].setRotationPoint(49.45F, -3F, 3F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 770
		bodyModel[401].setRotationPoint(47.95F, -4F, 2F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[402].setRotationPoint(47.95F, -4F, 5.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 461
		bodyModel[403].setRotationPoint(53.7F, -5.5F, 3.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[404].setRotationPoint(58.95F, -3F, -9.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[405].setRotationPoint(58.95F, -3F, -6F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
		bodyModel[406].setRotationPoint(58.45F, -4F, -6F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[407].setRotationPoint(58.95F, -6.2F, -3F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		bodyModel[408].setRotationPoint(61.45F, -8F, -6F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		bodyModel[409].setRotationPoint(58.45F, -4F, -9.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[410].setRotationPoint(61.95F, -10F, -7F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		bodyModel[411].setRotationPoint(62.45F, -10F, -8.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 461
		bodyModel[412].setRotationPoint(61.95F, -10F, -6F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		bodyModel[413].setRotationPoint(62.45F, -10F, -5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 463
		bodyModel[414].setRotationPoint(61.95F, -10F, -3.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 576
		bodyModel[415].setRotationPoint(47.95F, -4F, -6F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[416].setRotationPoint(49.45F, -3F, -9.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[417].setRotationPoint(49.45F, -3F, -6F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 579
		bodyModel[418].setRotationPoint(47.95F, -4F, -9.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 582
		bodyModel[419].setRotationPoint(47.95F, -8F, -6F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 583
		bodyModel[420].setRotationPoint(47.45F, -6.2F, -3F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 585
		bodyModel[421].setRotationPoint(46.95F, -10F, -8.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[422].setRotationPoint(47.45F, -10F, -7F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[423].setRotationPoint(47.45F, -10F, -6F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 588
		bodyModel[424].setRotationPoint(46.95F, -10F, -5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[425].setRotationPoint(47.45F, -10F, -3.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 878
		bodyModel[426].setRotationPoint(53.7F, -5.5F, -9.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 744
		bodyModel[427].setRotationPoint(-21.05F, -3F, 6.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 745
		bodyModel[428].setRotationPoint(-21.05F, -3F, 3F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[429].setRotationPoint(-21.55F, -4F, 5.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[430].setRotationPoint(-21.55F, -4F, 2F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[431].setRotationPoint(-18.55F, -8F, 2F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 751
		bodyModel[432].setRotationPoint(-21.05F, -6.2F, 2F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		bodyModel[433].setRotationPoint(-18.05F, -10F, 2.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[434].setRotationPoint(-17.55F, -10F, 3F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 754
		bodyModel[435].setRotationPoint(-18.05F, -10F, 5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 755
		bodyModel[436].setRotationPoint(-18.05F, -10F, 6F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[437].setRotationPoint(-17.55F, -10F, 6.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 758
		bodyModel[438].setRotationPoint(-32.55F, -6.2F, 2F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[439].setRotationPoint(-32.05F, -8F, 2F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[440].setRotationPoint(-32.55F, -10F, 5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		bodyModel[441].setRotationPoint(-33.05F, -10F, 3F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[442].setRotationPoint(-32.55F, -10F, 2.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 765
		bodyModel[443].setRotationPoint(-33.05F, -10F, 6.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[444].setRotationPoint(-32.55F, -10F, 6F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[445].setRotationPoint(-30.55F, -3F, 6.5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 769
		bodyModel[446].setRotationPoint(-30.55F, -3F, 3F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 770
		bodyModel[447].setRotationPoint(-32.05F, -4F, 2F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[448].setRotationPoint(-32.05F, -4F, 5.5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[449].setRotationPoint(-21.05F, -3F, -9.5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[450].setRotationPoint(-21.05F, -3F, -6F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
		bodyModel[451].setRotationPoint(-21.55F, -4F, -6F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[452].setRotationPoint(-21.05F, -6.2F, -3F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		bodyModel[453].setRotationPoint(-18.55F, -8F, -6F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		bodyModel[454].setRotationPoint(-21.55F, -4F, -9.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[455].setRotationPoint(-18.05F, -10F, -7F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		bodyModel[456].setRotationPoint(-17.55F, -10F, -8.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 461
		bodyModel[457].setRotationPoint(-18.05F, -10F, -6F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		bodyModel[458].setRotationPoint(-17.55F, -10F, -5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 463
		bodyModel[459].setRotationPoint(-18.05F, -10F, -3.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 576
		bodyModel[460].setRotationPoint(-32.05F, -4F, -6F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[461].setRotationPoint(-30.55F, -3F, -9.5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[462].setRotationPoint(-30.55F, -3F, -6F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 579
		bodyModel[463].setRotationPoint(-32.05F, -4F, -9.5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 582
		bodyModel[464].setRotationPoint(-32.05F, -8F, -6F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 583
		bodyModel[465].setRotationPoint(-32.55F, -6.2F, -3F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 585
		bodyModel[466].setRotationPoint(-33.05F, -10F, -8.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[467].setRotationPoint(-32.55F, -10F, -7F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[468].setRotationPoint(-32.55F, -10F, -6F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 588
		bodyModel[469].setRotationPoint(-33.05F, -10F, -5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[470].setRotationPoint(-32.55F, -10F, -3.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 744
		bodyModel[471].setRotationPoint(-37.05F, -3F, 6.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 745
		bodyModel[472].setRotationPoint(-37.05F, -3F, 3F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[473].setRotationPoint(-37.55F, -4F, 5.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[474].setRotationPoint(-37.55F, -4F, 2F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[475].setRotationPoint(-34.55F, -8F, 2F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 751
		bodyModel[476].setRotationPoint(-37.05F, -6.2F, 2F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		bodyModel[477].setRotationPoint(-34.05F, -10F, 2.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[478].setRotationPoint(-33.55F, -10F, 3F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 754
		bodyModel[479].setRotationPoint(-34.05F, -10F, 5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 755
		bodyModel[480].setRotationPoint(-34.05F, -10F, 6F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[481].setRotationPoint(-33.55F, -10F, 6.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 758
		bodyModel[482].setRotationPoint(-48.55F, -6.2F, 2F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[483].setRotationPoint(-48.05F, -8F, 2F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[484].setRotationPoint(-48.55F, -10F, 5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		bodyModel[485].setRotationPoint(-49.05F, -10F, 3F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[486].setRotationPoint(-48.55F, -10F, 2.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 765
		bodyModel[487].setRotationPoint(-49.05F, -10F, 6.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[488].setRotationPoint(-48.55F, -10F, 6F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[489].setRotationPoint(-46.55F, -3F, 6.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 769
		bodyModel[490].setRotationPoint(-46.55F, -3F, 3F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 770
		bodyModel[491].setRotationPoint(-48.05F, -4F, 2F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[492].setRotationPoint(-48.05F, -4F, 5.5F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[493].setRotationPoint(-37.05F, -3F, -9.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[494].setRotationPoint(-37.05F, -3F, -6F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
		bodyModel[495].setRotationPoint(-37.55F, -4F, -6F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[496].setRotationPoint(-37.05F, -6.2F, -3F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		bodyModel[497].setRotationPoint(-34.55F, -8F, -6F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		bodyModel[498].setRotationPoint(-37.55F, -4F, -9.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[499].setRotationPoint(-34.05F, -10F, -7F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 409, 419, textureX, textureY); // Box 460
		bodyModel[501] = new ModelRendererTurbo(this, 416, 410, textureX, textureY); // Box 461
		bodyModel[502] = new ModelRendererTurbo(this, 402, 424, textureX, textureY); // Box 462
		bodyModel[503] = new ModelRendererTurbo(this, 421, 410, textureX, textureY); // Box 463
		bodyModel[504] = new ModelRendererTurbo(this, 331, 427, textureX, textureY); // Box 576
		bodyModel[505] = new ModelRendererTurbo(this, 323, 419, textureX, textureY); // Box 577
		bodyModel[506] = new ModelRendererTurbo(this, 323, 413, textureX, textureY); // Box 578
		bodyModel[507] = new ModelRendererTurbo(this, 331, 434, textureX, textureY); // Box 579
		bodyModel[508] = new ModelRendererTurbo(this, 373, 417, textureX, textureY); // Box 582
		bodyModel[509] = new ModelRendererTurbo(this, 362, 403, textureX, textureY); // Box 583
		bodyModel[510] = new ModelRendererTurbo(this, 416, 424, textureX, textureY); // Box 585
		bodyModel[511] = new ModelRendererTurbo(this, 431, 414, textureX, textureY); // Box 586
		bodyModel[512] = new ModelRendererTurbo(this, 416, 414, textureX, textureY); // Box 587
		bodyModel[513] = new ModelRendererTurbo(this, 395, 424, textureX, textureY); // Box 588
		bodyModel[514] = new ModelRendererTurbo(this, 421, 414, textureX, textureY); // Box 589
		bodyModel[515] = new ModelRendererTurbo(this, 334, 413, textureX, textureY); // Box 744
		bodyModel[516] = new ModelRendererTurbo(this, 334, 419, textureX, textureY); // Box 745
		bodyModel[517] = new ModelRendererTurbo(this, 348, 427, textureX, textureY); // Box 746
		bodyModel[518] = new ModelRendererTurbo(this, 365, 427, textureX, textureY); // Box 747
		bodyModel[519] = new ModelRendererTurbo(this, 351, 408, textureX, textureY); // Box 750
		bodyModel[520] = new ModelRendererTurbo(this, 351, 403, textureX, textureY); // Box 751
		bodyModel[521] = new ModelRendererTurbo(this, 396, 410, textureX, textureY); // Box 752
		bodyModel[522] = new ModelRendererTurbo(this, 395, 419, textureX, textureY); // Box 753
		bodyModel[523] = new ModelRendererTurbo(this, 401, 410, textureX, textureY); // Box 754
		bodyModel[524] = new ModelRendererTurbo(this, 411, 410, textureX, textureY); // Box 755
		bodyModel[525] = new ModelRendererTurbo(this, 402, 419, textureX, textureY); // Box 756
		bodyModel[526] = new ModelRendererTurbo(this, 384, 403, textureX, textureY); // Box 758
		bodyModel[527] = new ModelRendererTurbo(this, 351, 417, textureX, textureY); // Box 760
		bodyModel[528] = new ModelRendererTurbo(this, 396, 414, textureX, textureY); // Box 761
		bodyModel[529] = new ModelRendererTurbo(this, 416, 419, textureX, textureY); // Box 762
		bodyModel[530] = new ModelRendererTurbo(this, 401, 414, textureX, textureY); // Box 763
		bodyModel[531] = new ModelRendererTurbo(this, 409, 424, textureX, textureY); // Box 765
		bodyModel[532] = new ModelRendererTurbo(this, 411, 414, textureX, textureY); // Box 766
		bodyModel[533] = new ModelRendererTurbo(this, 323, 407, textureX, textureY); // Box 768
		bodyModel[534] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[535] = new ModelRendererTurbo(this, 382, 427, textureX, textureY); // Box 770
		bodyModel[536] = new ModelRendererTurbo(this, 382, 434, textureX, textureY); // Box 771
		bodyModel[537] = new ModelRendererTurbo(this, 334, 400, textureX, textureY); // Box 450
		bodyModel[538] = new ModelRendererTurbo(this, 334, 407, textureX, textureY); // Box 451
		bodyModel[539] = new ModelRendererTurbo(this, 348, 434, textureX, textureY); // Box 452
		bodyModel[540] = new ModelRendererTurbo(this, 373, 403, textureX, textureY); // Box 453
		bodyModel[541] = new ModelRendererTurbo(this, 373, 408, textureX, textureY); // Box 454
		bodyModel[542] = new ModelRendererTurbo(this, 365, 434, textureX, textureY); // Box 457
		bodyModel[543] = new ModelRendererTurbo(this, 431, 410, textureX, textureY); // Box 459
		bodyModel[544] = new ModelRendererTurbo(this, 409, 419, textureX, textureY); // Box 460
		bodyModel[545] = new ModelRendererTurbo(this, 416, 410, textureX, textureY); // Box 461
		bodyModel[546] = new ModelRendererTurbo(this, 402, 424, textureX, textureY); // Box 462
		bodyModel[547] = new ModelRendererTurbo(this, 421, 410, textureX, textureY); // Box 463
		bodyModel[548] = new ModelRendererTurbo(this, 331, 427, textureX, textureY); // Box 576
		bodyModel[549] = new ModelRendererTurbo(this, 323, 419, textureX, textureY); // Box 577
		bodyModel[550] = new ModelRendererTurbo(this, 323, 413, textureX, textureY); // Box 578
		bodyModel[551] = new ModelRendererTurbo(this, 331, 434, textureX, textureY); // Box 579
		bodyModel[552] = new ModelRendererTurbo(this, 373, 417, textureX, textureY); // Box 582
		bodyModel[553] = new ModelRendererTurbo(this, 362, 403, textureX, textureY); // Box 583
		bodyModel[554] = new ModelRendererTurbo(this, 416, 424, textureX, textureY); // Box 585
		bodyModel[555] = new ModelRendererTurbo(this, 431, 414, textureX, textureY); // Box 586
		bodyModel[556] = new ModelRendererTurbo(this, 416, 414, textureX, textureY); // Box 587
		bodyModel[557] = new ModelRendererTurbo(this, 395, 424, textureX, textureY); // Box 588
		bodyModel[558] = new ModelRendererTurbo(this, 421, 414, textureX, textureY); // Box 589
		bodyModel[559] = new ModelRendererTurbo(this, 384, 403, textureX, textureY); // Box 758
		bodyModel[560] = new ModelRendererTurbo(this, 351, 417, textureX, textureY); // Box 760
		bodyModel[561] = new ModelRendererTurbo(this, 396, 414, textureX, textureY); // Box 761
		bodyModel[562] = new ModelRendererTurbo(this, 416, 419, textureX, textureY); // Box 762
		bodyModel[563] = new ModelRendererTurbo(this, 401, 414, textureX, textureY); // Box 763
		bodyModel[564] = new ModelRendererTurbo(this, 406, 414, textureX, textureY); // Box 764
		bodyModel[565] = new ModelRendererTurbo(this, 409, 424, textureX, textureY); // Box 765
		bodyModel[566] = new ModelRendererTurbo(this, 411, 414, textureX, textureY); // Box 766
		bodyModel[567] = new ModelRendererTurbo(this, 362, 417, textureX, textureY); // Box 767
		bodyModel[568] = new ModelRendererTurbo(this, 323, 407, textureX, textureY); // Box 768
		bodyModel[569] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[570] = new ModelRendererTurbo(this, 382, 427, textureX, textureY); // Box 770
		bodyModel[571] = new ModelRendererTurbo(this, 382, 434, textureX, textureY); // Box 771
		bodyModel[572] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 31
		bodyModel[573] = new ModelRendererTurbo(this, 461, 198, textureX, textureY); // Box 101
		bodyModel[574] = new ModelRendererTurbo(this, 476, 159, textureX, textureY); // Box 31
		bodyModel[575] = new ModelRendererTurbo(this, 493, 141, textureX, textureY); // Door Rear
		bodyModel[576] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 31
		bodyModel[577] = new ModelRendererTurbo(this, 461, 135, textureX, textureY); // Box 101
		bodyModel[578] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 31
		bodyModel[579] = new ModelRendererTurbo(this, 461, 135, textureX, textureY); // Box 101
		bodyModel[580] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 31
		bodyModel[581] = new ModelRendererTurbo(this, 461, 135, textureX, textureY); // Box 101
		bodyModel[582] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 31
		bodyModel[583] = new ModelRendererTurbo(this, 461, 135, textureX, textureY); // Box 101
		bodyModel[584] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 31
		bodyModel[585] = new ModelRendererTurbo(this, 461, 135, textureX, textureY); // Box 101
		bodyModel[586] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 31
		bodyModel[587] = new ModelRendererTurbo(this, 461, 135, textureX, textureY); // Box 101
		bodyModel[588] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 31
		bodyModel[589] = new ModelRendererTurbo(this, 461, 135, textureX, textureY); // Box 101
		bodyModel[590] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 31
		bodyModel[591] = new ModelRendererTurbo(this, 461, 135, textureX, textureY); // Box 101
		bodyModel[592] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 31
		bodyModel[593] = new ModelRendererTurbo(this, 461, 135, textureX, textureY); // Box 101
		bodyModel[594] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 31
		bodyModel[595] = new ModelRendererTurbo(this, 461, 135, textureX, textureY); // Box 101
		bodyModel[596] = new ModelRendererTurbo(this, 463, 156, textureX, textureY); // Box 101
		bodyModel[597] = new ModelRendererTurbo(this, 463, 156, textureX, textureY); // Box 101
		bodyModel[598] = new ModelRendererTurbo(this, 463, 156, textureX, textureY); // Box 101
		bodyModel[599] = new ModelRendererTurbo(this, 463, 156, textureX, textureY); // Box 101
		bodyModel[600] = new ModelRendererTurbo(this, 446, 157, textureX, textureY); // Box 101
		bodyModel[601] = new ModelRendererTurbo(this, 446, 157, textureX, textureY); // Box 101
		bodyModel[602] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[603] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 461
		bodyModel[604] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[605] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 461
		bodyModel[606] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[607] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 461
		bodyModel[608] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[609] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 461
		bodyModel[610] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[611] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 461
		bodyModel[612] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[613] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 461
		bodyModel[614] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[615] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 461
		bodyModel[616] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[617] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 461
		bodyModel[618] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[619] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[620] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 878
		bodyModel[621] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[622] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 878
		bodyModel[623] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[624] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 878
		bodyModel[625] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[626] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 878
		bodyModel[627] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[628] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 878
		bodyModel[629] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[630] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 878
		bodyModel[631] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[632] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 878
		bodyModel[633] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[634] = new ModelRendererTurbo(this, 384, 336, textureX, textureY); // Box 878
		bodyModel[635] = new ModelRendererTurbo(this, 323, 400, textureX, textureY); // Box 769
		bodyModel[636] = new ModelRendererTurbo(this, 463, 156, textureX, textureY); // Box 101
		bodyModel[637] = new ModelRendererTurbo(this, 463, 156, textureX, textureY); // Box 101
		bodyModel[638] = new ModelRendererTurbo(this, 383, 191, textureX, textureY); // Box 111
		bodyModel[639] = new ModelRendererTurbo(this, 383, 191, textureX, textureY); // Box 111
		bodyModel[640] = new ModelRendererTurbo(this, 408, 191, textureX, textureY); // Box 111
		bodyModel[641] = new ModelRendererTurbo(this, 384, 408, textureX, textureY); // Box 456
		bodyModel[642] = new ModelRendererTurbo(this, 426, 410, textureX, textureY); // Box 458
		bodyModel[643] = new ModelRendererTurbo(this, 384, 417, textureX, textureY); // Box 581
		bodyModel[644] = new ModelRendererTurbo(this, 426, 414, textureX, textureY); // Box 584
		bodyModel[645] = new ModelRendererTurbo(this, 384, 408, textureX, textureY); // Box 456
		bodyModel[646] = new ModelRendererTurbo(this, 426, 410, textureX, textureY); // Box 458
		bodyModel[647] = new ModelRendererTurbo(this, 384, 417, textureX, textureY); // Box 581
		bodyModel[648] = new ModelRendererTurbo(this, 426, 414, textureX, textureY); // Box 584
		bodyModel[649] = new ModelRendererTurbo(this, 384, 408, textureX, textureY); // Box 456
		bodyModel[650] = new ModelRendererTurbo(this, 426, 410, textureX, textureY); // Box 458
		bodyModel[651] = new ModelRendererTurbo(this, 384, 417, textureX, textureY); // Box 581
		bodyModel[652] = new ModelRendererTurbo(this, 426, 414, textureX, textureY); // Box 584
		bodyModel[653] = new ModelRendererTurbo(this, 384, 408, textureX, textureY); // Box 456
		bodyModel[654] = new ModelRendererTurbo(this, 426, 410, textureX, textureY); // Box 458
		bodyModel[655] = new ModelRendererTurbo(this, 384, 417, textureX, textureY); // Box 581
		bodyModel[656] = new ModelRendererTurbo(this, 426, 414, textureX, textureY); // Box 584
		bodyModel[657] = new ModelRendererTurbo(this, 384, 408, textureX, textureY); // Box 456
		bodyModel[658] = new ModelRendererTurbo(this, 426, 410, textureX, textureY); // Box 458
		bodyModel[659] = new ModelRendererTurbo(this, 384, 417, textureX, textureY); // Box 581
		bodyModel[660] = new ModelRendererTurbo(this, 426, 414, textureX, textureY); // Box 584
		bodyModel[661] = new ModelRendererTurbo(this, 384, 408, textureX, textureY); // Box 456
		bodyModel[662] = new ModelRendererTurbo(this, 426, 410, textureX, textureY); // Box 458
		bodyModel[663] = new ModelRendererTurbo(this, 384, 417, textureX, textureY); // Box 581
		bodyModel[664] = new ModelRendererTurbo(this, 426, 414, textureX, textureY); // Box 584
		bodyModel[665] = new ModelRendererTurbo(this, 384, 408, textureX, textureY); // Box 456
		bodyModel[666] = new ModelRendererTurbo(this, 426, 410, textureX, textureY); // Box 458
		bodyModel[667] = new ModelRendererTurbo(this, 384, 417, textureX, textureY); // Box 581
		bodyModel[668] = new ModelRendererTurbo(this, 426, 414, textureX, textureY); // Box 584
		bodyModel[669] = new ModelRendererTurbo(this, 384, 408, textureX, textureY); // Box 456
		bodyModel[670] = new ModelRendererTurbo(this, 426, 410, textureX, textureY); // Box 458
		bodyModel[671] = new ModelRendererTurbo(this, 384, 417, textureX, textureY); // Box 581
		bodyModel[672] = new ModelRendererTurbo(this, 426, 414, textureX, textureY); // Box 584
		bodyModel[673] = new ModelRendererTurbo(this, 362, 408, textureX, textureY); // Box 748
		bodyModel[674] = new ModelRendererTurbo(this, 406, 410, textureX, textureY); // Box 757
		bodyModel[675] = new ModelRendererTurbo(this, 406, 414, textureX, textureY); // Box 764
		bodyModel[676] = new ModelRendererTurbo(this, 362, 417, textureX, textureY); // Box 767
		bodyModel[677] = new ModelRendererTurbo(this, 362, 408, textureX, textureY); // Box 748
		bodyModel[678] = new ModelRendererTurbo(this, 406, 410, textureX, textureY); // Box 757
		bodyModel[679] = new ModelRendererTurbo(this, 406, 414, textureX, textureY); // Box 764
		bodyModel[680] = new ModelRendererTurbo(this, 362, 417, textureX, textureY); // Box 767
		bodyModel[681] = new ModelRendererTurbo(this, 362, 408, textureX, textureY); // Box 748
		bodyModel[682] = new ModelRendererTurbo(this, 406, 410, textureX, textureY); // Box 757
		bodyModel[683] = new ModelRendererTurbo(this, 406, 414, textureX, textureY); // Box 764
		bodyModel[684] = new ModelRendererTurbo(this, 362, 417, textureX, textureY); // Box 767
		bodyModel[685] = new ModelRendererTurbo(this, 362, 408, textureX, textureY); // Box 748
		bodyModel[686] = new ModelRendererTurbo(this, 406, 410, textureX, textureY); // Box 757
		bodyModel[687] = new ModelRendererTurbo(this, 406, 414, textureX, textureY); // Box 764
		bodyModel[688] = new ModelRendererTurbo(this, 362, 417, textureX, textureY); // Box 767
		bodyModel[689] = new ModelRendererTurbo(this, 362, 408, textureX, textureY); // Box 748
		bodyModel[690] = new ModelRendererTurbo(this, 406, 410, textureX, textureY); // Box 757
		bodyModel[691] = new ModelRendererTurbo(this, 406, 414, textureX, textureY); // Box 764
		bodyModel[692] = new ModelRendererTurbo(this, 362, 417, textureX, textureY); // Box 767
		bodyModel[693] = new ModelRendererTurbo(this, 362, 408, textureX, textureY); // Box 748
		bodyModel[694] = new ModelRendererTurbo(this, 406, 410, textureX, textureY); // Box 757
		bodyModel[695] = new ModelRendererTurbo(this, 406, 414, textureX, textureY); // Box 764
		bodyModel[696] = new ModelRendererTurbo(this, 362, 417, textureX, textureY); // Box 767
		bodyModel[697] = new ModelRendererTurbo(this, 362, 408, textureX, textureY); // Box 748
		bodyModel[698] = new ModelRendererTurbo(this, 406, 410, textureX, textureY); // Box 757
		bodyModel[699] = new ModelRendererTurbo(this, 406, 414, textureX, textureY); // Box 764
		bodyModel[700] = new ModelRendererTurbo(this, 362, 417, textureX, textureY); // Box 767
		bodyModel[701] = new ModelRendererTurbo(this, 362, 408, textureX, textureY); // Box 748
		bodyModel[702] = new ModelRendererTurbo(this, 406, 410, textureX, textureY); // Box 757
		bodyModel[703] = new ModelRendererTurbo(this, 406, 414, textureX, textureY); // Box 764
		bodyModel[704] = new ModelRendererTurbo(this, 362, 417, textureX, textureY); // Box 767

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		bodyModel[500].setRotationPoint(-33.55F, -10F, -8.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 461
		bodyModel[501].setRotationPoint(-34.05F, -10F, -6F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		bodyModel[502].setRotationPoint(-33.55F, -10F, -5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 463
		bodyModel[503].setRotationPoint(-34.05F, -10F, -3.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 576
		bodyModel[504].setRotationPoint(-48.05F, -4F, -6F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[505].setRotationPoint(-46.55F, -3F, -9.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[506].setRotationPoint(-46.55F, -3F, -6F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 579
		bodyModel[507].setRotationPoint(-48.05F, -4F, -9.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 582
		bodyModel[508].setRotationPoint(-48.05F, -8F, -6F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 583
		bodyModel[509].setRotationPoint(-48.55F, -6.2F, -3F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 585
		bodyModel[510].setRotationPoint(-49.05F, -10F, -8.5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[511].setRotationPoint(-48.55F, -10F, -7F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[512].setRotationPoint(-48.55F, -10F, -6F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 588
		bodyModel[513].setRotationPoint(-49.05F, -10F, -5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[514].setRotationPoint(-48.55F, -10F, -3.5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 744
		bodyModel[515].setRotationPoint(-53.05F, -3F, 6.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 745
		bodyModel[516].setRotationPoint(-53.05F, -3F, 3F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 746
		bodyModel[517].setRotationPoint(-53.55F, -4F, 5.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 747
		bodyModel[518].setRotationPoint(-53.55F, -4F, 2F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		bodyModel[519].setRotationPoint(-50.55F, -8F, 2F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 751
		bodyModel[520].setRotationPoint(-53.05F, -6.2F, 2F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 752
		bodyModel[521].setRotationPoint(-50.05F, -10F, 2.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 753
		bodyModel[522].setRotationPoint(-49.55F, -10F, 3F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 754
		bodyModel[523].setRotationPoint(-50.05F, -10F, 5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 755
		bodyModel[524].setRotationPoint(-50.05F, -10F, 6F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 756
		bodyModel[525].setRotationPoint(-49.55F, -10F, 6.5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 758
		bodyModel[526].setRotationPoint(-64.55F, -6.2F, 2F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[527].setRotationPoint(-64.05F, -8F, 2F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[528].setRotationPoint(-64.55F, -10F, 5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		bodyModel[529].setRotationPoint(-65.05F, -10F, 3F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[530].setRotationPoint(-64.55F, -10F, 2.5F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 765
		bodyModel[531].setRotationPoint(-65.05F, -10F, 6.5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[532].setRotationPoint(-64.55F, -10F, 6F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[533].setRotationPoint(-62.55F, -3F, 6.5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 769
		bodyModel[534].setRotationPoint(-62.55F, -3F, 3F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 770
		bodyModel[535].setRotationPoint(-64.05F, -4F, 2F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[536].setRotationPoint(-64.05F, -4F, 5.5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[537].setRotationPoint(-53.05F, -3F, -9.5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[538].setRotationPoint(-53.05F, -3F, -6F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 452
		bodyModel[539].setRotationPoint(-53.55F, -4F, -6F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[540].setRotationPoint(-53.05F, -6.2F, -3F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 454
		bodyModel[541].setRotationPoint(-50.55F, -8F, -6F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 457
		bodyModel[542].setRotationPoint(-53.55F, -4F, -9.5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 459
		bodyModel[543].setRotationPoint(-50.05F, -10F, -7F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 460
		bodyModel[544].setRotationPoint(-49.55F, -10F, -8.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 461
		bodyModel[545].setRotationPoint(-50.05F, -10F, -6F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 462
		bodyModel[546].setRotationPoint(-49.55F, -10F, -5F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 463
		bodyModel[547].setRotationPoint(-50.05F, -10F, -3.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 576
		bodyModel[548].setRotationPoint(-64.05F, -4F, -6F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		bodyModel[549].setRotationPoint(-62.55F, -3F, -9.5F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		bodyModel[550].setRotationPoint(-62.55F, -3F, -6F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 579
		bodyModel[551].setRotationPoint(-64.05F, -4F, -9.5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 582
		bodyModel[552].setRotationPoint(-64.05F, -8F, -6F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 583
		bodyModel[553].setRotationPoint(-64.55F, -6.2F, -3F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 585
		bodyModel[554].setRotationPoint(-65.05F, -10F, -8.5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 586
		bodyModel[555].setRotationPoint(-64.55F, -10F, -7F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 587
		bodyModel[556].setRotationPoint(-64.55F, -10F, -6F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 588
		bodyModel[557].setRotationPoint(-65.05F, -10F, -5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 589
		bodyModel[558].setRotationPoint(-64.55F, -10F, -3.5F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 758
		bodyModel[559].setRotationPoint(63.45F, -6.2F, 2F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		bodyModel[560].setRotationPoint(63.95F, -8F, 2F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 761
		bodyModel[561].setRotationPoint(63.45F, -10F, 5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 762
		bodyModel[562].setRotationPoint(62.95F, -10F, 3F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 763
		bodyModel[563].setRotationPoint(63.45F, -10F, 2.5F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 764
		bodyModel[564].setRotationPoint(63.45F, -10F, 8.5F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 765
		bodyModel[565].setRotationPoint(62.95F, -10F, 6.5F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 766
		bodyModel[566].setRotationPoint(63.45F, -10F, 6F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[567].setRotationPoint(63.95F, -8F, 5.5F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 768
		bodyModel[568].setRotationPoint(65.45F, -3F, 6.5F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 769
		bodyModel[569].setRotationPoint(65.45F, -3F, 3F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 770
		bodyModel[570].setRotationPoint(63.95F, -4F, 2F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 771
		bodyModel[571].setRotationPoint(63.95F, -4F, 5.5F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[572].setRotationPoint(100.7F, -5F, -10F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[573].setRotationPoint(100.7F, -17F, -10F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[574].setRotationPoint(100.7F, -1F, -4F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 16, 8, 0F,-0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Door Rear
		bodyModel[575].setRotationPoint(100.7F, -17F, -4F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[576].setRotationPoint(78.7F, -5F, -9F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[577].setRotationPoint(78.7F, -17F, -9F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 31
		bodyModel[578].setRotationPoint(77.7F, -5F, -9F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 101
		bodyModel[579].setRotationPoint(77.7F, -17F, -9F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 31
		bodyModel[580].setRotationPoint(78.7F, -5F, 3F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 3, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 101
		bodyModel[581].setRotationPoint(78.7F, -17F, 3F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 31
		bodyModel[582].setRotationPoint(77.7F, -5F, 3F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 101
		bodyModel[583].setRotationPoint(77.7F, -17F, 3F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[584].setRotationPoint(82.7F, -5F, -9F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[585].setRotationPoint(82.7F, -17F, -9F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 31
		bodyModel[586].setRotationPoint(82.7F, -5F, 3F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 101
		bodyModel[587].setRotationPoint(82.7F, -17F, 3F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F); // Box 31
		bodyModel[588].setRotationPoint(81.7F, -5F, 2.5F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.6F, -0.25F, 0F, 0.6F); // Box 101
		bodyModel[589].setRotationPoint(81.7F, -17F, 2.5F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.25F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 31
		bodyModel[590].setRotationPoint(81.7F, -5F, -8.5F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 101
		bodyModel[591].setRotationPoint(81.7F, -17F, -8.5F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[592].setRotationPoint(96.7F, -5F, -9F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[593].setRotationPoint(96.7F, -17F, -9F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F); // Box 31
		bodyModel[594].setRotationPoint(96.7F, -5F, 3F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 101
		bodyModel[595].setRotationPoint(96.7F, -17F, 3F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[596].setRotationPoint(83.7F, -17F, 2.5F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		bodyModel[597].setRotationPoint(83.7F, -17F, -3.5F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[598].setRotationPoint(92.7F, -17F, 2.5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 4, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		bodyModel[599].setRotationPoint(92.7F, -17F, -3.5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 101
		bodyModel[600].setRotationPoint(87.7F, -17F, 2.75F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 5, 16, 1, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Box 101
		bodyModel[601].setRotationPoint(87.7F, -17F, -3.75F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[602].setRotationPoint(54.7F, -5F, 4F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 461
		bodyModel[603].setRotationPoint(37.7F, -5.5F, 3.5F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[604].setRotationPoint(38.7F, -5F, 4F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 461
		bodyModel[605].setRotationPoint(21.7F, -5.5F, 3.5F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[606].setRotationPoint(22.7F, -5F, 4F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 461
		bodyModel[607].setRotationPoint(5.7F, -5.5F, 3.5F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[608].setRotationPoint(6.7F, -5F, 4F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 461
		bodyModel[609].setRotationPoint(-10.3F, -5.5F, 3.5F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[610].setRotationPoint(-9.3F, -5F, 4F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 461
		bodyModel[611].setRotationPoint(-26.3F, -5.5F, 3.5F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[612].setRotationPoint(-25.3F, -5F, 4F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 461
		bodyModel[613].setRotationPoint(-42.3F, -5.5F, 3.5F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[614].setRotationPoint(-41.3F, -5F, 4F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 461
		bodyModel[615].setRotationPoint(-58.3F, -5.5F, 3.5F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[616].setRotationPoint(-57.3F, -5F, 4F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 461
		bodyModel[617].setRotationPoint(-74.3F, -5.5F, 3.5F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[618].setRotationPoint(-73.3F, -5F, 4F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[619].setRotationPoint(54.7F, -5F, -5F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 878
		bodyModel[620].setRotationPoint(37.7F, -5.5F, -9.5F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[621].setRotationPoint(38.7F, -5F, -5F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 878
		bodyModel[622].setRotationPoint(21.7F, -5.5F, -9.5F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[623].setRotationPoint(22.7F, -5F, -5F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 878
		bodyModel[624].setRotationPoint(5.7F, -5.5F, -9.5F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[625].setRotationPoint(6.7F, -5F, -5F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 878
		bodyModel[626].setRotationPoint(-10.3F, -5.5F, -9.5F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[627].setRotationPoint(-9.3F, -5F, -5F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 878
		bodyModel[628].setRotationPoint(-26.3F, -5.5F, -9.5F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[629].setRotationPoint(-25.3F, -5F, -5F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 878
		bodyModel[630].setRotationPoint(-42.3F, -5.5F, -9.5F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[631].setRotationPoint(-41.3F, -5F, -5F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 878
		bodyModel[632].setRotationPoint(-58.3F, -5.5F, -9.5F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[633].setRotationPoint(-57.3F, -5F, -5F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 878
		bodyModel[634].setRotationPoint(-74.3F, -5.5F, -9.5F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 769
		bodyModel[635].setRotationPoint(-73.3F, -5F, -5F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 101
		bodyModel[636].setRotationPoint(97.7F, -17F, 3F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 101
		bodyModel[637].setRotationPoint(97.7F, -17F, -4F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 0, 5, 11, 0F,0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 111
		bodyModel[638].setRotationPoint(-98.8F, -10F, -5.5F);
		bodyModel[638].rotateAngleZ = -0.31415927F;

		bodyModel[639].addShapeBox(0F, 0F, 0F, 11, 5, 0, 0F,-1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 111
		bodyModel[639].setRotationPoint(66.95F, -4F, 10.6F);
		bodyModel[639].rotateAngleX = -0.10471976F;

		bodyModel[640].addShapeBox(0F, 0F, 0F, 11, 5, 0, 0F,-1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 111
		bodyModel[640].setRotationPoint(-79.55F, -4F, -10.6F);
		bodyModel[640].rotateAngleX = 0.10471976F;

		bodyModel[641].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[641].setRotationPoint(-50.55F, -8F, -9.5F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[642].setRotationPoint(-50.05F, -10F, -9.5F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 581
		bodyModel[643].setRotationPoint(-64.05F, -8F, -9.5F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[644].setRotationPoint(-64.55F, -10F, -9.5F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[645].setRotationPoint(-34.55F, -8F, -9.5F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[646].setRotationPoint(-34.05F, -10F, -9.5F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 581
		bodyModel[647].setRotationPoint(-48.05F, -8F, -9.5F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[648].setRotationPoint(-48.55F, -10F, -9.5F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[649].setRotationPoint(-18.55F, -8F, -9.5F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[650].setRotationPoint(-18.05F, -10F, -9.5F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 581
		bodyModel[651].setRotationPoint(-32.05F, -8F, -9.5F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[652].setRotationPoint(-32.55F, -10F, -9.5F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[653].setRotationPoint(-2.55F, -8F, -9.5F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[654].setRotationPoint(-2.05F, -10F, -9.5F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 581
		bodyModel[655].setRotationPoint(-16.05F, -8F, -9.5F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[656].setRotationPoint(-16.55F, -10F, -9.5F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[657].setRotationPoint(13.45F, -8F, -9.5F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[658].setRotationPoint(13.95F, -10F, -9.5F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 581
		bodyModel[659].setRotationPoint(-0.0500000000000001F, -8F, -9.5F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[660].setRotationPoint(-0.55F, -10F, -9.5F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[661].setRotationPoint(29.45F, -8F, -9.5F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[662].setRotationPoint(29.95F, -10F, -9.5F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 581
		bodyModel[663].setRotationPoint(15.95F, -8F, -9.5F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[664].setRotationPoint(15.45F, -10F, -9.5F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[665].setRotationPoint(45.45F, -8F, -9.5F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[666].setRotationPoint(45.95F, -10F, -9.5F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 581
		bodyModel[667].setRotationPoint(31.95F, -8F, -9.5F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[668].setRotationPoint(31.45F, -10F, -9.5F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 456
		bodyModel[669].setRotationPoint(61.45F, -8F, -9.5F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 458
		bodyModel[670].setRotationPoint(61.95F, -10F, -9.5F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 581
		bodyModel[671].setRotationPoint(47.95F, -8F, -9.5F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 584
		bodyModel[672].setRotationPoint(47.45F, -10F, -9.5F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[673].setRotationPoint(45.45F, -8F, 5.5F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 757
		bodyModel[674].setRotationPoint(45.95F, -10F, 8.5F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 764
		bodyModel[675].setRotationPoint(31.45F, -10F, 8.5F);

		bodyModel[676].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[676].setRotationPoint(31.95F, -8F, 5.5F);

		bodyModel[677].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[677].setRotationPoint(29.45F, -8F, 5.5F);

		bodyModel[678].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 757
		bodyModel[678].setRotationPoint(29.95F, -10F, 8.5F);

		bodyModel[679].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 764
		bodyModel[679].setRotationPoint(15.45F, -10F, 8.5F);

		bodyModel[680].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[680].setRotationPoint(15.95F, -8F, 5.5F);

		bodyModel[681].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[681].setRotationPoint(13.45F, -8F, 5.5F);

		bodyModel[682].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 757
		bodyModel[682].setRotationPoint(13.95F, -10F, 8.5F);

		bodyModel[683].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 764
		bodyModel[683].setRotationPoint(-0.55F, -10F, 8.5F);

		bodyModel[684].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[684].setRotationPoint(-0.0500000000000001F, -8F, 5.5F);

		bodyModel[685].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[685].setRotationPoint(-2.55F, -8F, 5.5F);

		bodyModel[686].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 757
		bodyModel[686].setRotationPoint(-2.05F, -10F, 8.5F);

		bodyModel[687].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 764
		bodyModel[687].setRotationPoint(-16.55F, -10F, 8.5F);

		bodyModel[688].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[688].setRotationPoint(-16.05F, -8F, 5.5F);

		bodyModel[689].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[689].setRotationPoint(-18.55F, -8F, 5.5F);

		bodyModel[690].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 757
		bodyModel[690].setRotationPoint(-18.05F, -10F, 8.5F);

		bodyModel[691].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 764
		bodyModel[691].setRotationPoint(-32.55F, -10F, 8.5F);

		bodyModel[692].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[692].setRotationPoint(-32.05F, -8F, 5.5F);

		bodyModel[693].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[693].setRotationPoint(-34.55F, -8F, 5.5F);

		bodyModel[694].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 757
		bodyModel[694].setRotationPoint(-34.05F, -10F, 8.5F);

		bodyModel[695].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 764
		bodyModel[695].setRotationPoint(-48.55F, -10F, 8.5F);

		bodyModel[696].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[696].setRotationPoint(-48.05F, -8F, 5.5F);

		bodyModel[697].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[697].setRotationPoint(-50.55F, -8F, 5.5F);

		bodyModel[698].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 757
		bodyModel[698].setRotationPoint(-50.05F, -10F, 8.5F);

		bodyModel[699].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 764
		bodyModel[699].setRotationPoint(-64.55F, -10F, 8.5F);

		bodyModel[700].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[700].setRotationPoint(-64.05F, -8F, 5.5F);

		bodyModel[701].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.1F, -1F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 748
		bodyModel[701].setRotationPoint(-66.55F, -8F, 5.5F);

		bodyModel[702].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.15F, -0.25F, -0.5F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.25F, 0F, -0.1F); // Box 757
		bodyModel[702].setRotationPoint(-66.05F, -10F, 8.5F);

		bodyModel[703].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.5F, -0.15F, 0F, -0.5F, -0.15F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 764
		bodyModel[703].setRotationPoint(-80.55F, -10F, 8.5F);

		bodyModel[704].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 767
		bodyModel[704].setRotationPoint(-80.05F, -8F, 5.5F);
	}
}