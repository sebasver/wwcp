//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.11.2017 - 19:11:37
// Last changed on: 15.11.2017 - 19:11:37

package wwcp.models.locomotives.diesels; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class DSBMzIII extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public DSBMzIII() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[295];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[1] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 80
		bodyModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 83
		bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 85
		bodyModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 88
		bodyModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 90
		bodyModel[6] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 94
		bodyModel[7] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 95
		bodyModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Front White Left
		bodyModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Front White Right
		bodyModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 105
		bodyModel[11] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 106
		bodyModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 108
		bodyModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 113
		bodyModel[14] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 114
		bodyModel[15] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 115
		bodyModel[16] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 122
		bodyModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 123
		bodyModel[18] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 125
		bodyModel[19] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 127
		bodyModel[20] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Back White Left
		bodyModel[21] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Back White Right
		bodyModel[22] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 163
		bodyModel[23] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 164
		bodyModel[24] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 170
		bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 171
		bodyModel[26] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 172
		bodyModel[27] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 174
		bodyModel[28] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 175
		bodyModel[29] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 176
		bodyModel[30] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 177
		bodyModel[31] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 178
		bodyModel[32] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 180
		bodyModel[33] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 181
		bodyModel[34] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 182
		bodyModel[35] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 183
		bodyModel[36] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 184
		bodyModel[37] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 185
		bodyModel[38] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 186
		bodyModel[39] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 187
		bodyModel[40] = new ModelRendererTurbo(this, 213, 81, textureX, textureY); // Box 107
		bodyModel[41] = new ModelRendererTurbo(this, 1, 359, textureX, textureY); // Box 108
		bodyModel[42] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 105
		bodyModel[43] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 141
		bodyModel[44] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 203
		bodyModel[45] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Front Door Left Buttom
		bodyModel[46] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 203
		bodyModel[47] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 203
		bodyModel[48] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Back Door Left Buttom
		bodyModel[49] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 202
		bodyModel[50] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 203
		bodyModel[51] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 203
		bodyModel[52] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Front Door Left Top
		bodyModel[53] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Front Door Right Buttom
		bodyModel[54] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 203
		bodyModel[55] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 203
		bodyModel[56] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 203
		bodyModel[57] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Back Door Right Buttom
		bodyModel[58] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 123
		bodyModel[59] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 188
		bodyModel[60] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 188
		bodyModel[61] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 127
		bodyModel[62] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 127
		bodyModel[63] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 127
		bodyModel[64] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 127
		bodyModel[65] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 90
		bodyModel[66] = new ModelRendererTurbo(this, 419, 97, textureX, textureY); // Box 90
		bodyModel[67] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 90
		bodyModel[68] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 90
		bodyModel[69] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 90
		bodyModel[70] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 90
		bodyModel[71] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Box 90
		bodyModel[72] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 90
		bodyModel[73] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 90
		bodyModel[74] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 90
		bodyModel[75] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 188
		bodyModel[76] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 90
		bodyModel[77] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 90
		bodyModel[78] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 203
		bodyModel[79] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 203
		bodyModel[80] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 203
		bodyModel[81] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 203
		bodyModel[82] = new ModelRendererTurbo(this, 121, 208, textureX, textureY); // Box 123
		bodyModel[83] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Standard Seat
		bodyModel[84] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Standard Seat
		bodyModel[85] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 103
		bodyModel[86] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 104
		bodyModel[87] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 105
		bodyModel[88] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Standard Seat
		bodyModel[89] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Standard Seat
		bodyModel[90] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Standard Seat
		bodyModel[91] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 103
		bodyModel[92] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 104
		bodyModel[93] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 105
		bodyModel[94] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Standard Seat
		bodyModel[95] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Standard Seat
		bodyModel[96] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Standard Seat
		bodyModel[97] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 103
		bodyModel[98] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 104
		bodyModel[99] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 105
		bodyModel[100] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Standard Seat
		bodyModel[101] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Standard Seat
		bodyModel[102] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Standard Seat
		bodyModel[103] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Standard Seat
		bodyModel[107] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 129
		bodyModel[108] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 132
		bodyModel[109] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 129
		bodyModel[110] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 132
		bodyModel[111] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 129
		bodyModel[112] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 132
		bodyModel[113] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 129
		bodyModel[114] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 132
		bodyModel[115] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 122
		bodyModel[116] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 122
		bodyModel[117] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 122
		bodyModel[118] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 111
		bodyModel[119] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 122
		bodyModel[120] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 111
		bodyModel[121] = new ModelRendererTurbo(this, 121, 129, textureX, textureY); // Box 84
		bodyModel[122] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Box 108
		bodyModel[123] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 111
		bodyModel[124] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Box 90
		bodyModel[125] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 93
		bodyModel[126] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 84
		bodyModel[127] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 84
		bodyModel[128] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 84
		bodyModel[129] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 120
		bodyModel[130] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 115
		bodyModel[131] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 125
		bodyModel[132] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 123
		bodyModel[133] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 111
		bodyModel[134] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 120
		bodyModel[135] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 93
		bodyModel[136] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 93
		bodyModel[137] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Box 202
		bodyModel[138] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 203
		bodyModel[139] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Front Door Right Top
		bodyModel[140] = new ModelRendererTurbo(this, 321, 129, textureX, textureY); // Box 203
		bodyModel[141] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 202
		bodyModel[142] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 203
		bodyModel[143] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Back Door Left Top
		bodyModel[144] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 203
		bodyModel[145] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 123
		bodyModel[146] = new ModelRendererTurbo(this, 345, 145, textureX, textureY); // Box 111
		bodyModel[147] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 123
		bodyModel[148] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 111
		bodyModel[149] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 202
		bodyModel[150] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 203
		bodyModel[151] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Back Door Right Top
		bodyModel[152] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 203
		bodyModel[153] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 93
		bodyModel[154] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 93
		bodyModel[155] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 108
		bodyModel[156] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 115
		bodyModel[157] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 125
		bodyModel[158] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 111
		bodyModel[159] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 84
		bodyModel[160] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 108
		bodyModel[161] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 111
		bodyModel[162] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 84
		bodyModel[163] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 120
		bodyModel[164] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 115
		bodyModel[165] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 125
		bodyModel[166] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 120
		bodyModel[167] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 93
		bodyModel[168] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 93
		bodyModel[169] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 93
		bodyModel[170] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 93
		bodyModel[171] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 80
		bodyModel[172] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 83
		bodyModel[173] = new ModelRendererTurbo(this, 425, 153, textureX, textureY); // Box 85
		bodyModel[174] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 88
		bodyModel[175] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 90
		bodyModel[176] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 94
		bodyModel[177] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 95
		bodyModel[178] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 90
		bodyModel[179] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 84
		bodyModel[180] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 84
		bodyModel[181] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Box 122
		bodyModel[182] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 122
		bodyModel[183] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 122
		bodyModel[184] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 122
		bodyModel[185] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 122
		bodyModel[186] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 101
		bodyModel[187] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Box 100
		bodyModel[188] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 101
		bodyModel[189] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 100
		bodyModel[190] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 101
		bodyModel[191] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 100
		bodyModel[192] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 101
		bodyModel[193] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 100
		bodyModel[194] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Back White Top
		bodyModel[195] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Front White Top
		bodyModel[196] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 396
		bodyModel[197] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 397
		bodyModel[198] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 398
		bodyModel[199] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 396
		bodyModel[200] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 397
		bodyModel[201] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 398
		bodyModel[202] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 93
		bodyModel[203] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 93
		bodyModel[204] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 93
		bodyModel[205] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Box 172
		bodyModel[206] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 173
		bodyModel[207] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 172
		bodyModel[208] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Box 173
		bodyModel[209] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 172
		bodyModel[210] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 173
		bodyModel[211] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 172
		bodyModel[212] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 173
		bodyModel[213] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 94
		bodyModel[214] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 94
		bodyModel[215] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 94
		bodyModel[216] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 94
		bodyModel[217] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 94
		bodyModel[218] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Box 90
		bodyModel[219] = new ModelRendererTurbo(this, 394, 208, textureX, textureY); // Box 94
		bodyModel[220] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 90
		bodyModel[221] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 94
		bodyModel[222] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Box 94
		bodyModel[223] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 94
		bodyModel[224] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 94
		bodyModel[225] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Box 90
		bodyModel[226] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 90
		bodyModel[227] = new ModelRendererTurbo(this, 93, 193, textureX, textureY); // Box 94
		bodyModel[228] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 94
		bodyModel[229] = new ModelRendererTurbo(this, 473, 21, textureX, textureY); // Back Red Left
		bodyModel[230] = new ModelRendererTurbo(this, 505, 20, textureX, textureY); // Back Red Right
		bodyModel[231] = new ModelRendererTurbo(this, 385, 30, textureX, textureY); // Front Red Left
		bodyModel[232] = new ModelRendererTurbo(this, 457, 30, textureX, textureY); // Front Red Right
		bodyModel[233] = new ModelRendererTurbo(this, 304, 239, textureX, textureY); // Box 158
		bodyModel[234] = new ModelRendererTurbo(this, 2, 209, textureX, textureY); // Box 158
		bodyModel[235] = new ModelRendererTurbo(this, 2, 220, textureX, textureY); // Box 158
		bodyModel[236] = new ModelRendererTurbo(this, 16, 250, textureX, textureY); // Box 158
		bodyModel[237] = new ModelRendererTurbo(this, 16, 237, textureX, textureY); // Box 158
		bodyModel[238] = new ModelRendererTurbo(this, 16, 265, textureX, textureY); // Box 158
		bodyModel[239] = new ModelRendererTurbo(this, 87, 232, textureX, textureY); // Box 158
		bodyModel[240] = new ModelRendererTurbo(this, 190, 220, textureX, textureY); // Box 158
		bodyModel[241] = new ModelRendererTurbo(this, 190, 208, textureX, textureY); // Box 158
		bodyModel[242] = new ModelRendererTurbo(this, 102, 342, textureX, textureY); // Box 158
		bodyModel[243] = new ModelRendererTurbo(this, 281, 200, textureX, textureY); // Box 156
		bodyModel[244] = new ModelRendererTurbo(this, 449, 233, textureX, textureY); // Box 159
		bodyModel[245] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 159
		bodyModel[246] = new ModelRendererTurbo(this, 233, 200, textureX, textureY); // Box 156
		bodyModel[247] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 161
		bodyModel[248] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Box 161
		bodyModel[249] = new ModelRendererTurbo(this, 475, 233, textureX, textureY); // Box 161
		bodyModel[250] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Box 161
		bodyModel[251] = new ModelRendererTurbo(this, 481, 200, textureX, textureY); // Box 156
		bodyModel[252] = new ModelRendererTurbo(this, 84, 200, textureX, textureY); // Box 156
		bodyModel[253] = new ModelRendererTurbo(this, 477, 250, textureX, textureY); // Box 159
		bodyModel[254] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 159
		bodyModel[255] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[256] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 81
		bodyModel[257] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 193
		bodyModel[258] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 194
		bodyModel[259] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 195
		bodyModel[260] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 196
		bodyModel[261] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 197
		bodyModel[262] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 198
		bodyModel[263] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 205
		bodyModel[264] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 206
		bodyModel[265] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 207
		bodyModel[266] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 208
		bodyModel[267] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 209
		bodyModel[268] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 210
		bodyModel[269] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 62
		bodyModel[270] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 81
		bodyModel[271] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 198
		bodyModel[272] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 210
		bodyModel[273] = new ModelRendererTurbo(this, 373, 250, textureX, textureY); // Box 195
		bodyModel[274] = new ModelRendererTurbo(this, 373, 265, textureX, textureY); // Box 190
		bodyModel[275] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 207
		bodyModel[276] = new ModelRendererTurbo(this, 97, 250, textureX, textureY); // Box 206
		bodyModel[277] = new ModelRendererTurbo(this, 97, 278, textureX, textureY); // Box 207
		bodyModel[278] = new ModelRendererTurbo(this, 97, 245, textureX, textureY); // Box 207
		bodyModel[279] = new ModelRendererTurbo(this, 97, 260, textureX, textureY); // Box 207
		bodyModel[280] = new ModelRendererTurbo(this, 97, 272, textureX, textureY); // Box 206
		bodyModel[281] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 206
		bodyModel[282] = new ModelRendererTurbo(this, 97, 300, textureX, textureY); // Box 207
		bodyModel[283] = new ModelRendererTurbo(this, 97, 290, textureX, textureY); // Box 206
		bodyModel[284] = new ModelRendererTurbo(this, 97, 285, textureX, textureY); // Box 207
		bodyModel[285] = new ModelRendererTurbo(this, 97, 313, textureX, textureY); // Box 207
		bodyModel[286] = new ModelRendererTurbo(this, 97, 320, textureX, textureY); // Box 207
		bodyModel[287] = new ModelRendererTurbo(this, 97, 325, textureX, textureY); // Box 206
		bodyModel[288] = new ModelRendererTurbo(this, 97, 306, textureX, textureY); // Box 206
		bodyModel[289] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Bog Front
		bodyModel[290] = new ModelRendererTurbo(this, 552, 1, textureX, textureY); // Bog Rear
		bodyModel[291] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Box 93
		bodyModel[292] = new ModelRendererTurbo(this, 177, 250, textureX, textureY); // Box 93
		bodyModel[293] = new ModelRendererTurbo(this, 116, 332, textureX, textureY); // Box 93
		bodyModel[294] = new ModelRendererTurbo(this, 377, 287, textureX, textureY); // Box 93

		bodyModel[0].addBox(0F, 0F, -2F, 125, 2, 22, 0F); // Box 31
		bodyModel[0].setRotationPoint(-62.5F, -2F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 4, 22, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 80
		bodyModel[1].setRotationPoint(-75.5F, -4F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[2].setRotationPoint(-76.5F, -2F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[3].setRotationPoint(-76.5F, -2F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[4].setRotationPoint(-76.5F, 0F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 90
		bodyModel[5].setRotationPoint(-76.5F, -14F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 94
		bodyModel[6].setRotationPoint(-75.5F, -14F, 10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 95
		bodyModel[7].setRotationPoint(-75.5F, -14F, -11F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Front White Left
		bodyModel[8].setRotationPoint(-77.5F, -2.5F, -7.95F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Front White Right
		bodyModel[9].setRotationPoint(-77.5F, -2.5F, 5.95F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 125, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[10].setRotationPoint(-62.5F, -22F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 125, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[11].setRotationPoint(-62.5F, -22F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 108
		bodyModel[12].setRotationPoint(-73.5F, -22F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 125, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[13].setRotationPoint(-62.5F, -23F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 125, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 114
		bodyModel[14].setRotationPoint(-62.5F, -23F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[15].setRotationPoint(-72.5F, -23F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[16].setRotationPoint(-74.5F, -23F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 14, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[17].setRotationPoint(-62.5F, -22F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F); // Box 125
		bodyModel[18].setRotationPoint(-72.5F, -23F, -5F);

		bodyModel[19].addBox(0F, 0F, 0F, 125, 1, 10, 0F); // Box 127
		bodyModel[19].setRotationPoint(-62.5F, -23F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Back White Left
		bodyModel[20].setRotationPoint(77F, -2.5F, -7.9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Back White Right
		bodyModel[21].setRotationPoint(77F, -2.5F, 5.9F);

		bodyModel[22].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 163
		bodyModel[22].setRotationPoint(-37.5F, -24F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[23].setRotationPoint(-29.5F, -24F, 4F);
		bodyModel[23].rotateAngleY = 3.14159265F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 170
		bodyModel[24].setRotationPoint(-29.5F, -24F, -1F);
		bodyModel[24].rotateAngleY = 3.14159265F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[25].setRotationPoint(-34.5F, -24F, -1F);
		bodyModel[25].rotateAngleY = 3.14159265F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[26].setRotationPoint(-34.5F, -24F, 4F);
		bodyModel[26].rotateAngleY = 3.14159265F;

		bodyModel[27].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 174
		bodyModel[27].setRotationPoint(-34.5F, -24F, 1F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 175
		bodyModel[28].setRotationPoint(-44.5F, -24F, 1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[29].setRotationPoint(-39.5F, -24F, 4F);
		bodyModel[29].rotateAngleY = 3.14159265F;

		bodyModel[30].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 177
		bodyModel[30].setRotationPoint(-47.5F, -24F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 178
		bodyModel[31].setRotationPoint(-39.5F, -24F, -1F);
		bodyModel[31].rotateAngleY = 3.14159265F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[32].setRotationPoint(-44.5F, -24F, -1F);
		bodyModel[32].rotateAngleY = 3.14159265F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[33].setRotationPoint(-44.5F, -24F, 4F);
		bodyModel[33].rotateAngleY = 3.14159265F;

		bodyModel[34].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 182
		bodyModel[34].setRotationPoint(-54.5F, -24F, 1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[35].setRotationPoint(-49.5F, -24F, 4F);
		bodyModel[35].rotateAngleY = 3.14159265F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 184
		bodyModel[36].setRotationPoint(-49.5F, -24F, -1F);
		bodyModel[36].rotateAngleY = 3.14159265F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[37].setRotationPoint(-54.5F, -24F, 4F);
		bodyModel[37].rotateAngleY = 3.14159265F;

		bodyModel[38].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Box 186
		bodyModel[38].setRotationPoint(-57.5F, -24F, -1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[39].setRotationPoint(-54.5F, -24F, -1F);
		bodyModel[39].rotateAngleY = 3.14159265F;

		bodyModel[40].addBox(0F, 0F, 0F, 105, 12, 1, 0F); // Box 107
		bodyModel[40].setRotationPoint(-52.5F, -14F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 105, 7, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[41].setRotationPoint(-52.5F, -21F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 105, 7, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[42].setRotationPoint(-52.5F, -21F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 105, 12, 1, 0F); // Box 141
		bodyModel[43].setRotationPoint(-52.5F, -14F, -11F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 203
		bodyModel[44].setRotationPoint(-62.5F, -14F, -11F);

		bodyModel[45].addBox(-5F, 0F, 0F, 5, 10, 1, 0F); // Front Door Left Buttom
		bodyModel[45].setRotationPoint(-52.5F, -14F, -11F);

		bodyModel[46].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 203
		bodyModel[46].setRotationPoint(57.5F, -14F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 10, 2, 22, 0F); // Box 203
		bodyModel[47].setRotationPoint(52.5F, -4F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Back Door Left Buttom
		bodyModel[48].setRotationPoint(52.5F, -14F, -11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, 0.57F, 0F, 0F, 0.57F); // Box 202
		bodyModel[49].setRotationPoint(-52.5F, -21F, -8F);
		bodyModel[49].rotateAngleY = -3.14159265F;

		bodyModel[50].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 203
		bodyModel[50].setRotationPoint(-57.5F, -14F, 11F);
		bodyModel[50].rotateAngleY = -3.14159265F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 203
		bodyModel[51].setRotationPoint(-57.5F, -21F, -8F);
		bodyModel[51].rotateAngleY = -3.14159265F;

		bodyModel[52].addShapeBox(-5F, 0F, 0F, 5, 5, 1, 0F,-2F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, 0.57F, -2F, 0F, 0.57F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Front Door Left Top
		bodyModel[52].setRotationPoint(-57.5F, -19F, -8F);
		bodyModel[52].rotateAngleY = -3.14159265F;

		bodyModel[53].addBox(-5F, 0F, 0F, 5, 10, 1, 0F); // Front Door Right Buttom
		bodyModel[53].setRotationPoint(-57.5F, -14F, 11F);
		bodyModel[53].rotateAngleY = -3.14159265F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.57F, -3F, 0F, -0.57F, -3F, 0F, 0.57F, 0F, 0F, 0.57F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 2F, 0F, 0F, 2F); // Box 203
		bodyModel[54].setRotationPoint(-52.5F, -19F, -8F);
		bodyModel[54].rotateAngleY = -3.14159265F;

		bodyModel[55].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 203
		bodyModel[55].setRotationPoint(62.5F, -14F, 11F);
		bodyModel[55].rotateAngleY = -3.14159265F;

		bodyModel[56].addBox(0F, 0F, 0F, 10, 2, 22, 0F); // Box 203
		bodyModel[56].setRotationPoint(-52.5F, -4F, 11F);
		bodyModel[56].rotateAngleY = -3.14159265F;

		bodyModel[57].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Back Door Right Buttom
		bodyModel[57].setRotationPoint(57.5F, -14F, 11F);
		bodyModel[57].rotateAngleY = -3.14159265F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,-2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[58].setRotationPoint(-74.5F, -22F, -8F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 188
		bodyModel[59].setRotationPoint(-44.5F, -24F, -4F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 188
		bodyModel[60].setRotationPoint(-34.5F, -24F, -4F);

		bodyModel[61].addBox(-3F, 0F, 0F, 5, 5, 0, 0F); // Box 127
		bodyModel[61].setRotationPoint(-54.5F, 0F, 11F);

		bodyModel[62].addBox(-3F, 0F, 0F, 5, 5, 0, 0F); // Box 127
		bodyModel[62].setRotationPoint(-54.5F, 0F, -11F);

		bodyModel[63].addBox(-3F, 0F, 0F, 5, 5, 0, 0F); // Box 127
		bodyModel[63].setRotationPoint(55.5F, 0F, 11F);

		bodyModel[64].addBox(-3F, 0F, 0F, 5, 5, 0, 0F); // Box 127
		bodyModel[64].setRotationPoint(55.5F, 0F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,1F, 0F, 0F, -2F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[65].setRotationPoint(-74.5F, -14F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[66].setRotationPoint(-74.5F, -13F, 0F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[67].setRotationPoint(-74.5F, -12F, 0F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[68].setRotationPoint(72.5F, -13F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 90
		bodyModel[69].setRotationPoint(72.5F, -12F, -9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[70].setRotationPoint(72.5F, -13F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 90
		bodyModel[71].setRotationPoint(72.5F, -12F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 90
		bodyModel[72].setRotationPoint(-74.5F, -14F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 90
		bodyModel[73].setRotationPoint(-74.5F, -13F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 90
		bodyModel[74].setRotationPoint(-74.5F, -12F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 188
		bodyModel[75].setRotationPoint(-54.5F, -24F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 90
		bodyModel[76].setRotationPoint(72.5F, -14F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,-2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 90
		bodyModel[77].setRotationPoint(71.5F, -14F, 0F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 12, 20, 0F); // Box 203
		bodyModel[78].setRotationPoint(52.5F, -14F, 10F);
		bodyModel[78].rotateAngleY = -3.14159265F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[79].setRotationPoint(52.5F, -21F, 10F);
		bodyModel[79].rotateAngleY = -3.14159265F;

		bodyModel[80].addBox(0F, 0F, 0F, 1, 12, 20, 0F); // Box 203
		bodyModel[80].setRotationPoint(-51.5F, -14F, 10F);
		bodyModel[80].rotateAngleY = -3.14159265F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[81].setRotationPoint(-51.5F, -21F, 10F);
		bodyModel[81].rotateAngleY = -3.14159265F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 12, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[82].setRotationPoint(50.5F, -22F, -8F);

		bodyModel[83].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Standard Seat
		bodyModel[83].setRotationPoint(-71.5F, -10F, 1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[84].setRotationPoint(-66.5F, -13F, 1F);

		bodyModel[85].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 103
		bodyModel[85].setRotationPoint(-69.5F, -9F, 3.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[86].setRotationPoint(-71.5F, -12F, 0F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		bodyModel[87].setRotationPoint(-71.5F, -12F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[88].setRotationPoint(-66.5F, -15F, 1F);

		bodyModel[89].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Standard Seat
		bodyModel[89].setRotationPoint(-71.5F, -10F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[90].setRotationPoint(-66.5F, -13F, -8F);

		bodyModel[91].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 103
		bodyModel[91].setRotationPoint(-69.5F, -9F, -5.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[92].setRotationPoint(-71.5F, -12F, -9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		bodyModel[93].setRotationPoint(-71.5F, -12F, -1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[94].setRotationPoint(-66.5F, -15F, -8F);

		bodyModel[95].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Standard Seat
		bodyModel[95].setRotationPoint(66.5F, -10F, 1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[96].setRotationPoint(65.5F, -13F, 1F);

		bodyModel[97].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 103
		bodyModel[97].setRotationPoint(67.5F, -9F, 3.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[98].setRotationPoint(65.5F, -12F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		bodyModel[99].setRotationPoint(65.5F, -12F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[100].setRotationPoint(65.5F, -15F, 1F);

		bodyModel[101].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Standard Seat
		bodyModel[101].setRotationPoint(66.5F, -10F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[102].setRotationPoint(65.5F, -13F, -8F);

		bodyModel[103].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 103
		bodyModel[103].setRotationPoint(67.5F, -9F, -5.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[104].setRotationPoint(65.5F, -12F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 105
		bodyModel[105].setRotationPoint(65.5F, -12F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Standard Seat
		bodyModel[106].setRotationPoint(65.5F, -15F, -8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 129
		bodyModel[107].setRotationPoint(65F, -24F, -3.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 132
		bodyModel[108].setRotationPoint(66F, -24F, -3.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 129
		bodyModel[109].setRotationPoint(65F, -24F, -2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 132
		bodyModel[110].setRotationPoint(66F, -24F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[111].setRotationPoint(-66F, -24F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 132
		bodyModel[112].setRotationPoint(-68F, -24F, 1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[113].setRotationPoint(-66F, -24F, 2.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F); // Box 132
		bodyModel[114].setRotationPoint(-68F, -24F, 2.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[115].setRotationPoint(-74.5F, -23F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[116].setRotationPoint(-75.5F, -23F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[117].setRotationPoint(-75.5F, -22F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[118].setRotationPoint(-75.5F, -22F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[119].setRotationPoint(-75.5F, -22F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.1F, -2F, 0F, 0F, 1F, 0F, 0F); // Box 111
		bodyModel[120].setRotationPoint(-73.5F, -22F, -6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[121].setRotationPoint(-76.5F, -14F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 108
		bodyModel[122].setRotationPoint(-73.5F, -22F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 111
		bodyModel[123].setRotationPoint(-75.5F, -22F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[124].setRotationPoint(-76.5F, -14F, 0F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,-2F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -3F, -3F, 0F, -3F, 0F, -7F, 0F, -1F, -7F, 0F, -1F, -7F, -1F, -1F, -7F, -1F); // Box 93
		bodyModel[125].setRotationPoint(-76.5F, -21F, 9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 84
		bodyModel[126].setRotationPoint(-76.5F, -14F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[127].setRotationPoint(-76.5F, -2F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 84
		bodyModel[128].setRotationPoint(-76.5F, -2F, 9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[129].setRotationPoint(-74.5F, -23F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 115
		bodyModel[130].setRotationPoint(-72.5F, -23F, 5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[131].setRotationPoint(-72.5F, -23F, -2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.9F); // Box 123
		bodyModel[132].setRotationPoint(-74.5F, -22F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, 1F); // Box 111
		bodyModel[133].setRotationPoint(-73.5F, -22F, 0F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 120
		bodyModel[134].setRotationPoint(-74.5F, -23F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 93
		bodyModel[135].setRotationPoint(-74.5F, -22F, 7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[136].setRotationPoint(-74.5F, -22F, -8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.57F, 0F, 0F, 0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.57F); // Box 202
		bodyModel[137].setRotationPoint(-52.5F, -21F, 9F);
		bodyModel[137].rotateAngleY = -3.14159265F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 203
		bodyModel[138].setRotationPoint(-57.5F, -21F, 9F);
		bodyModel[138].rotateAngleY = -3.14159265F;

		bodyModel[139].addShapeBox(-5F, 0F, 0F, 5, 5, 1, 0F,-2F, 0F, 0.57F, 0F, 0F, 0.57F, 0F, 0F, -0.57F, -2F, 0F, -0.57F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Front Door Right Top
		bodyModel[139].setRotationPoint(-57.5F, -19F, 9F);
		bodyModel[139].rotateAngleY = -3.14159265F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0.57F, -3F, 0F, 0.57F, -3F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, -2F, 0F, 0F, -2F); // Box 203
		bodyModel[140].setRotationPoint(-52.5F, -19F, 9F);
		bodyModel[140].rotateAngleY = -3.14159265F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, 0.57F, 0F, 0F, 0.57F); // Box 202
		bodyModel[141].setRotationPoint(57.5F, -21F, -8F);
		bodyModel[141].rotateAngleY = -3.14159265F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 203
		bodyModel[142].setRotationPoint(62.5F, -21F, -8F);
		bodyModel[142].rotateAngleY = -3.14159265F;

		bodyModel[143].addShapeBox(-5F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.57F, -2F, 0F, -0.57F, -2F, 0F, 0.57F, 0F, 0F, 0.57F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Back Door Left Top
		bodyModel[143].setRotationPoint(52.5F, -19F, -8F);
		bodyModel[143].rotateAngleY = -3.14159265F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,-3F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, 0.57F, -3F, 0F, 0.57F, -5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, -5F, 0F, 2F); // Box 203
		bodyModel[144].setRotationPoint(57.5F, -19F, -8F);
		bodyModel[144].rotateAngleY = -3.14159265F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.89F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[145].setRotationPoint(62.5F, -22F, -8F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1.1F, 0F, 0F, 1F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 111
		bodyModel[146].setRotationPoint(72.5F, -22F, -6F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.89F, 0F, 0F, 0F); // Box 123
		bodyModel[147].setRotationPoint(62.5F, -22F, 0F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.1F); // Box 111
		bodyModel[148].setRotationPoint(72.5F, -22F, 0F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.57F, 0F, 0F, 0.57F, 0F, 0F, -0.57F, 0F, 0F, -0.57F); // Box 202
		bodyModel[149].setRotationPoint(57.5F, -21F, 9F);
		bodyModel[149].rotateAngleY = -3.14159265F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 203
		bodyModel[150].setRotationPoint(62.5F, -21F, 9F);
		bodyModel[150].rotateAngleY = -3.14159265F;

		bodyModel[151].addShapeBox(-5F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0.57F, -2F, 0F, 0.57F, -2F, 0F, -0.57F, 0F, 0F, -0.57F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Back Door Right Top
		bodyModel[151].setRotationPoint(52.5F, -19F, 9F);
		bodyModel[151].rotateAngleY = -3.14159265F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,-3F, 0F, 0.57F, 0F, 0F, 0.57F, 0F, 0F, -0.57F, -3F, 0F, -0.57F, -5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, -5F, 0F, -2F); // Box 203
		bodyModel[152].setRotationPoint(57.5F, -19F, 9F);
		bodyModel[152].rotateAngleY = -3.14159265F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[153].setRotationPoint(-73.5F, -23F, -7F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 93
		bodyModel[154].setRotationPoint(-73.5F, -23F, 6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 108
		bodyModel[155].setRotationPoint(62.5F, -22F, -8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[156].setRotationPoint(62.5F, -23F, -6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, -2F); // Box 125
		bodyModel[157].setRotationPoint(62.5F, -23F, -5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[158].setRotationPoint(74.5F, -22F, -7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[159].setRotationPoint(75.5F, -14F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 108
		bodyModel[160].setRotationPoint(62.5F, -22F, 7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 111
		bodyModel[161].setRotationPoint(74.5F, -22F, 0F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[162].setRotationPoint(75.5F, -14F, 9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 120
		bodyModel[163].setRotationPoint(72.5F, -23F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 115
		bodyModel[164].setRotationPoint(62.5F, -23F, 5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[165].setRotationPoint(62.5F, -23F, -2F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F); // Box 120
		bodyModel[166].setRotationPoint(72.5F, -23F, 0F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, -1F, 0F, 1F, -2F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[167].setRotationPoint(73.5F, -22F, 7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[168].setRotationPoint(73.5F, -22F, -8F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, -1F, 0F, 1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[169].setRotationPoint(72.5F, -23F, 6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[170].setRotationPoint(72.5F, -23F, -7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 13, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 80
		bodyModel[171].setRotationPoint(62.5F, -4F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[172].setRotationPoint(75.5F, -2F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[173].setRotationPoint(75.5F, -2F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[174].setRotationPoint(75.5F, 0F, -9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 90
		bodyModel[175].setRotationPoint(74.5F, -14F, -9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 94
		bodyModel[176].setRotationPoint(62.5F, -14F, 10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 13, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 95
		bodyModel[177].setRotationPoint(62.5F, -14F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 12, 9, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[178].setRotationPoint(74.5F, -14F, 0F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[179].setRotationPoint(75.5F, -2F, 9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[180].setRotationPoint(75.5F, -2F, -10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[181].setRotationPoint(73.5F, -23F, 0F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 122
		bodyModel[182].setRotationPoint(73.5F, -23F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[183].setRotationPoint(74.5F, -23F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F); // Box 122
		bodyModel[184].setRotationPoint(74.5F, -22F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 122
		bodyModel[185].setRotationPoint(74.5F, -22F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F,-2F, 0F, -3F, 0F, 0F, -2.9F, 0F, 0F, 1.9F, -2F, 0F, 2F, 0F, -7F, -1F, 0F, -7F, -0.75F, 0F, -7F, -0.25F, 0F, -7F, 0F); // Box 101
		bodyModel[186].setRotationPoint(-75.5F, -21F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F,0F, 0F, -2.9F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1.9F, 0F, -7F, -0.75F, 0F, -7F, 0F, 0F, -7F, -1F, 0F, -7F, -0.25F); // Box 100
		bodyModel[187].setRotationPoint(-72.5F, -21F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F,-2F, 0F, 2F, 0F, 0F, 1.9F, 0F, 0F, -2.9F, -2F, 0F, -3F, 0F, -7F, 0F, 0F, -7F, -0.25F, 0F, -7F, -0.75F, 0F, -7F, -1F); // Box 101
		bodyModel[188].setRotationPoint(-75.5F, -21F, 9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F,0F, 0F, 1.9F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2.9F, 0F, -7F, -0.25F, 0F, -7F, -1F, 0F, -7F, 0F, 0F, -7F, -0.75F); // Box 100
		bodyModel[189].setRotationPoint(-72.5F, -21F, 9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F,0F, 0F, -2.9F, -2F, 0F, -3F, -2F, 0F, 2F, 0F, 0F, 1.9F, 0F, -7F, -0.75F, 0F, -7F, -1F, 0F, -7F, 0F, 0F, -7F, -0.25F); // Box 101
		bodyModel[190].setRotationPoint(72.5F, -21F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F,0F, 0F, -2F, 0F, 0F, -2.9F, 0F, 0F, 1.9F, 0F, 0F, 1F, 0F, -7F, 0F, 0F, -7F, -0.75F, 0F, -7F, -0.25F, 0F, -7F, -1F); // Box 100
		bodyModel[191].setRotationPoint(62.5F, -21F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F,0F, 0F, 1.9F, -2F, 0F, 2F, -2F, 0F, -3F, 0F, 0F, -2.9F, 0F, -7F, -0.25F, 0F, -7F, 0F, 0F, -7F, -1F, 0F, -7F, -0.75F); // Box 101
		bodyModel[192].setRotationPoint(72.5F, -21F, 9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 10, 14, 2, 0F,0F, 0F, 1F, 0F, 0F, 1.9F, 0F, 0F, -2.9F, 0F, 0F, -2F, 0F, -7F, -1F, 0F, -7F, -0.25F, 0F, -7F, -0.75F, 0F, -7F, 0F); // Box 100
		bodyModel[193].setRotationPoint(62.5F, -21F, 9F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F); // Back White Top
		bodyModel[194].setRotationPoint(75.5F, -23F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Front White Top
		bodyModel[195].setRotationPoint(-76.5F, -23F, -1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[196].setRotationPoint(76.5F, 1F, -0.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 397
		bodyModel[197].setRotationPoint(77.75F, 2F, -0.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[198].setRotationPoint(78.75F, 1F, -0.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 396
		bodyModel[199].setRotationPoint(-77.5F, 1F, -0.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[200].setRotationPoint(-78.75F, 2F, -0.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[201].setRotationPoint(-79.75F, 1F, -0.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,-3F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, 2F, -2F, 0F, 2F, -1F, -7F, -1F, -1F, -7F, -1F, -1F, -7F, 0F, 0F, -7F, 0F); // Box 93
		bodyModel[202].setRotationPoint(-76.5F, -21F, -11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,1F, 0F, 2F, -2F, 0F, 2F, -3F, 0F, -3F, 1F, 0F, -3F, -1F, -7F, 0F, 0F, -7F, 0F, -1F, -7F, -1F, -1F, -7F, -1F); // Box 93
		bodyModel[203].setRotationPoint(74.5F, -21F, 9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,1F, 0F, -3F, -3F, 0F, -3F, -2F, 0F, 2F, 1F, 0F, 2F, -1F, -7F, -1F, -1F, -7F, -1F, 0F, -7F, 0F, -1F, -7F, 0F); // Box 93
		bodyModel[204].setRotationPoint(74.5F, -21F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, -1F, 0.25F, 0.25F, -1F); // Box 172
		bodyModel[205].setRotationPoint(-78.5F, 0.5F, 5.95F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F); // Box 173
		bodyModel[206].setRotationPoint(-80.75F, 0.5F, 5.95F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, -1F, 0.25F, 0.25F, -1F); // Box 172
		bodyModel[207].setRotationPoint(-78.5F, 0.5F, -7.95F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F); // Box 173
		bodyModel[208].setRotationPoint(-80.75F, 0.5F, -7.95F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, -1F, 0.25F, 0.25F, -1F); // Box 172
		bodyModel[209].setRotationPoint(76.75F, 0.5F, 5.95F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F); // Box 173
		bodyModel[210].setRotationPoint(79F, 0.5F, 5.95F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0.25F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.25F, -1F, 0.25F, 0.25F, -1F); // Box 172
		bodyModel[211].setRotationPoint(76.75F, 0.5F, -7.95F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0.25F, 0F, -1F); // Box 173
		bodyModel[212].setRotationPoint(79F, 0.5F, -7.95F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-2.86F, 0.5F, -1.855F, 2.86F, 0.5F, -1.855F, 1.92F, 0.5F, 0.5F, -1.92F, 0.5F, 0.5F, -1.287F, 0F, -0.29F, 1.287F, 0F, -0.29F, 0.34F, 0F, 0.5F, -0.34F, 0F, 0.5F); // Box 94
		bodyModel[213].setRotationPoint(-77.5F, -20F, -9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.86F, -0.5F, 0.14F, 1.86F, -0.5F, 0.14F, 0.85F, -0.5F, 0F, -0.85F, -0.5F, 0F); // Box 94
		bodyModel[214].setRotationPoint(-76.5F, -21F, -7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1.92F, 0.5F, -0.5F, 1.92F, 0.5F, -0.5F, 1.85F, 0.5F, 0F, -1.85F, 0.5F, 0F, -0.055F, 0F, -0.5F, 0.055F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[215].setRotationPoint(-77.5F, -20F, -1F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -0.85F, -0.5F, 0F, 0.85F, -0.5F, 0F, 1.86F, -0.5F, 0.144F, -1.86F, -0.5F, 0.144F); // Box 94
		bodyModel[216].setRotationPoint(-76.5F, -21F, 0F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-1.85F, 0.5F, 0F, 1.85F, 0.5F, 0F, 1.92F, 0.5F, -0.5F, -1.92F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.055F, 0F, -0.5F, -0.055F, 0F, -0.5F); // Box 94
		bodyModel[217].setRotationPoint(-77.5F, -20F, 0F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.285F, 0F, -0.285F, 0.285F, 0F, -0.285F, -0.66F, 0F, -0.5F, 0.66F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.945F, 0F, -0.5F, 0.945F, 0F, -0.5F); // Box 90
		bodyModel[218].setRotationPoint(-76.5F, -15F, -9F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,-1.92F, 0.5F, 0.5F, 1.92F, 0.5F, 0.5F, 2.86F, 0.5F, -1.855F, -2.86F, 0.5F, -1.855F, -0.34F, 0F, 0.5F, 0.34F, 0F, 0.5F, 1.287F, 0F, -0.29F, -1.287F, 0F, -0.29F); // Box 94
		bodyModel[219].setRotationPoint(-77.5F, -20F, 1F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.66F, 0F, -0.5F, -0.66F, 0F, -0.5F, 0.285F, 0F, -0.285F, -0.285F, 0F, -0.285F, 0.945F, 0F, -0.5F, -0.945F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[220].setRotationPoint(-76.5F, -15F, 0F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1.86F, -0.5F, 0.14F, -1.86F, -0.5F, 0.14F, -0.85F, -0.5F, 0F, 0.85F, -0.5F, 0F); // Box 94
		bodyModel[221].setRotationPoint(75.5F, -21F, -7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,1.92F, 0.5F, -0.5F, -1.92F, 0.5F, -0.5F, -1.85F, 0.5F, 0F, 1.85F, 0.5F, 0F, 0.055F, 0F, -0.5F, -0.055F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[222].setRotationPoint(76.5F, -20F, -1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0.85F, -0.5F, 0F, -0.85F, -0.5F, 0F, -1.86F, -0.5F, 0.144F, 1.86F, -0.5F, 0.144F); // Box 94
		bodyModel[223].setRotationPoint(75.5F, -21F, 0F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,1.85F, 0.5F, 0F, -1.85F, 0.5F, 0F, -1.92F, 0.5F, -0.5F, 1.92F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.055F, 0F, -0.5F, 0.055F, 0F, -0.5F); // Box 94
		bodyModel[224].setRotationPoint(76.5F, -20F, 0F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.285F, 0F, -0.285F, -0.285F, 0F, -0.285F, 0.66F, 0F, -0.5F, -0.66F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.945F, 0F, -0.5F, -0.945F, 0F, -0.5F); // Box 90
		bodyModel[225].setRotationPoint(75.5F, -15F, -9F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.66F, 0F, -0.5F, 0.66F, 0F, -0.5F, -0.285F, 0F, -0.285F, 0.285F, 0F, -0.285F, -0.945F, 0F, -0.5F, 0.945F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[226].setRotationPoint(75.5F, -15F, 0F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,2.86F, 0.5F, -1.855F, -2.86F, 0.5F, -1.855F, -1.92F, 0.5F, 0.5F, 1.92F, 0.5F, 0.5F, 1.287F, 0F, -0.29F, -1.287F, 0F, -0.29F, -0.34F, 0F, 0.5F, 0.34F, 0F, 0.5F); // Box 94
		bodyModel[227].setRotationPoint(76.5F, -20F, -9F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,1.92F, 0.5F, 0.5F, -1.92F, 0.5F, 0.5F, -2.86F, 0.5F, -1.855F, 2.86F, 0.5F, -1.855F, 0.34F, 0F, 0.5F, -0.34F, 0F, 0.5F, -1.287F, 0F, -0.29F, 1.287F, 0F, -0.29F); // Box 94
		bodyModel[228].setRotationPoint(76.5F, -20F, 1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Back Red Left
		bodyModel[229].setRotationPoint(76F, -5.5F, -7.45F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Back Red Right
		bodyModel[230].setRotationPoint(76F, -5.5F, 6.45F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Red Left
		bodyModel[231].setRotationPoint(-77F, -5.5F, -7.45F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Front Red Right
		bodyModel[232].setRotationPoint(-77F, -5.5F, 6.45F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 45, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[233].setRotationPoint(-26.5F, -24F, -3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 45, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[234].setRotationPoint(-26.5F, -24F, 3F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 45, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[235].setRotationPoint(-26.5F, -24F, -8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[236].setRotationPoint(49.5F, -24F, -3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[237].setRotationPoint(49.5F, -24F, 3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 13, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[238].setRotationPoint(49.5F, -24F, -8F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 31, 2, 8, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[239].setRotationPoint(18.5F, -24F, -4F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 31, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[240].setRotationPoint(18.5F, -24F, 4F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 31, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[241].setRotationPoint(18.5F, -24F, -8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[242].setRotationPoint(44.5F, -25.5F, -4F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[243].setRotationPoint(80.5F, 0.75F, 5.45F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 1F, 1F, 0F, -2F, 1F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 159
		bodyModel[244].setRotationPoint(76.5F, 3F, 0F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,4F, 0F, 0F, -4F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2F, 1F, 0F, 1F, 1F, 0F); // Box 159
		bodyModel[245].setRotationPoint(76.5F, 3F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[246].setRotationPoint(80.5F, 0.75F, -8.45F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,6F, 0F, 0F, -6F, 0F, 0F, -2F, -1F, 0F, 1F, -1F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[247].setRotationPoint(76.5F, 5F, -10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,1F, -1F, 0F, -2F, -1F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 1F, 0F, -2F); // Box 161
		bodyModel[248].setRotationPoint(76.5F, 5F, 0F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-6F, 0F, 0F, 6F, 0F, 0F, 1F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[249].setRotationPoint(-77.5F, 5F, -10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,-2F, -1F, 0F, 1F, -1F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -2F); // Box 161
		bodyModel[250].setRotationPoint(-77.5F, 5F, 0F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[251].setRotationPoint(-82F, 0.75F, 5.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[252].setRotationPoint(-82F, 0.75F, -8.45F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -2F, 1F, 0F, 1F, 1F, 0F, 6F, 0F, 0F, -6F, 0F, 0F); // Box 159
		bodyModel[253].setRotationPoint(-77.5F, 3F, 0F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 1F, 1F, 0F, -2F, 1F, 0F); // Box 159
		bodyModel[254].setRotationPoint(-77.5F, 3F, -10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[255].setRotationPoint(-75.5F, 0F, 9F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[256].setRotationPoint(-75.5F, 0F, -10F);

		bodyModel[257].addBox(0F, 0F, 0F, 25, 2, 12, 0F); // Box 193
		bodyModel[257].setRotationPoint(-25.5F, 2F, -6F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[258].setRotationPoint(-25.5F, 0F, -6F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[259].setRotationPoint(-25.5F, 0F, 4F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 196
		bodyModel[260].setRotationPoint(-25.5F, 4F, 4F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[261].setRotationPoint(-25.5F, 4F, -6F);

		bodyModel[262].addBox(0F, 0F, 0F, 25, 2, 8, 0F); // Box 198
		bodyModel[262].setRotationPoint(-25.5F, 0F, -4F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[263].setRotationPoint(0.5F, 4F, -6F);

		bodyModel[264].addBox(0F, 0F, 0F, 25, 2, 12, 0F); // Box 206
		bodyModel[264].setRotationPoint(0.5F, 2F, -6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[265].setRotationPoint(0.5F, 0F, -6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[266].setRotationPoint(0.5F, 0F, 4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 25, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 209
		bodyModel[267].setRotationPoint(0.5F, 4F, 4F);

		bodyModel[268].addBox(0F, 0F, 0F, 25, 2, 8, 0F); // Box 210
		bodyModel[268].setRotationPoint(0.5F, 0F, -4F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 62
		bodyModel[269].setRotationPoint(68.5F, 0F, 9F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 81
		bodyModel[270].setRotationPoint(68.5F, 0F, -10F);

		bodyModel[271].addBox(0F, 0F, 0F, 25, 2, 8, 0F); // Box 198
		bodyModel[271].setRotationPoint(-25.5F, 4F, -4F);

		bodyModel[272].addBox(0F, 0F, 0F, 25, 2, 8, 0F); // Box 210
		bodyModel[272].setRotationPoint(0.5F, 4F, -4F);

		bodyModel[273].addBox(0F, 0F, 0F, 25, 6, 4, 0F); // Box 195
		bodyModel[273].setRotationPoint(-25.5F, 0F, 6F);

		bodyModel[274].addBox(0F, 0F, 0F, 25, 6, 4, 0F); // Box 190
		bodyModel[274].setRotationPoint(-0.5F, 0F, -6F);
		bodyModel[274].rotateAngleY = -3.14159265F;

		bodyModel[275].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 207
		bodyModel[275].setRotationPoint(0.5F, 3F, -7F);

		bodyModel[276].addBox(0F, 0F, 0F, 18, 2, 4, 0F); // Box 206
		bodyModel[276].setRotationPoint(0.5F, 1F, -10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[277].setRotationPoint(0.5F, 0F, -7F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[278].setRotationPoint(0.5F, 3F, -10F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[279].setRotationPoint(0.5F, 0F, -10F);

		bodyModel[280].addBox(0F, 0F, 0F, 18, 1, 2, 0F); // Box 206
		bodyModel[280].setRotationPoint(0.5F, 0F, -9F);

		bodyModel[281].addBox(0F, 0F, 0F, 18, 1, 2, 0F); // Box 206
		bodyModel[281].setRotationPoint(0.5F, 3F, -9F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 207
		bodyModel[282].setRotationPoint(0.5F, 3F, 9F);

		bodyModel[283].addBox(0F, 0F, 0F, 18, 2, 4, 0F); // Box 206
		bodyModel[283].setRotationPoint(0.5F, 1F, 6F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[284].setRotationPoint(0.5F, 0F, 9F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[285].setRotationPoint(0.5F, 3F, 6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[286].setRotationPoint(0.5F, 0F, 6F);

		bodyModel[287].addBox(0F, 0F, 0F, 18, 1, 2, 0F); // Box 206
		bodyModel[287].setRotationPoint(0.5F, 0F, 7F);

		bodyModel[288].addBox(0F, 0F, 0F, 18, 1, 2, 0F); // Box 206
		bodyModel[288].setRotationPoint(0.5F, 3F, 7F);

		bodyModel[289].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Bog Front
		bodyModel[289].setRotationPoint(-50.5F, 0F, -2F);

		bodyModel[290].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Bog Rear
		bodyModel[290].setRotationPoint(47.5F, 0F, -2F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,0F, 0F, 2F, -2F, 0F, 2F, -3F, 0F, -3F, 1F, 0F, -3F, -2F, -7F, 0F, 0F, -7F, 0F, -1F, -7F, -1F, -1F, -7F, -1F); // Box 93
		bodyModel[291].setRotationPoint(74.5F, -21F, 9F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,1F, 0F, -3F, -3F, 0F, -3F, -2F, 0F, 2F, 0F, 0F, 2F, -1F, -7F, -1F, -1F, -7F, -1F, 0F, -7F, 0F, -2F, -7F, 0F); // Box 93
		bodyModel[292].setRotationPoint(74.5F, -21F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,-3F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 2F, -2F, 0F, 2F, -1F, -7F, -1F, -1F, -7F, -1F, -2F, -7F, 0F, 0F, -7F, 0F); // Box 93
		bodyModel[293].setRotationPoint(-76.5F, -21F, -11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 14, 2, 0F,-2F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, -3F, -3F, 0F, -3F, 0F, -7F, 0F, -2F, -7F, 0F, -1F, -7F, -1F, -1F, -7F, -1F); // Box 93
		bodyModel[294].setRotationPoint(-76.5F, -21F, 9F);
	}
}