//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.11.2021 - 02:19:17
// Last changed on: 05.11.2021 - 02:19:17

package wwcp.models.freight; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class DSBZETanker extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public DSBZETanker() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[197];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 351
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 351
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 351
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 351
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 351
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 112
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 146
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 146
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 351
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 112
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 351
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 351
		bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 112
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 351
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 112
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 351
		bodyModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 351
		bodyModel[19] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 11
		bodyModel[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 11
		bodyModel[21] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 351
		bodyModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 351
		bodyModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 351
		bodyModel[24] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 112
		bodyModel[25] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 146
		bodyModel[26] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 146
		bodyModel[27] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 351
		bodyModel[28] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 112
		bodyModel[29] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 351
		bodyModel[30] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 351
		bodyModel[31] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 112
		bodyModel[32] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 351
		bodyModel[33] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 112
		bodyModel[34] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 63
		bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 63
		bodyModel[37] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 66
		bodyModel[38] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 69
		bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 66
		bodyModel[40] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 66
		bodyModel[41] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 69
		bodyModel[42] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 69
		bodyModel[43] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 69
		bodyModel[44] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 69
		bodyModel[45] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 69
		bodyModel[46] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 66
		bodyModel[47] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 69
		bodyModel[48] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 66
		bodyModel[49] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 66
		bodyModel[50] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 69
		bodyModel[52] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 69
		bodyModel[53] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 69
		bodyModel[54] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 69
		bodyModel[55] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 66
		bodyModel[56] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 66
		bodyModel[57] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 66
		bodyModel[58] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 63
		bodyModel[61] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 171
		bodyModel[63] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 172
		bodyModel[64] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 173
		bodyModel[65] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 174
		bodyModel[66] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 175
		bodyModel[67] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 176
		bodyModel[68] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 182
		bodyModel[69] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 183
		bodyModel[70] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 184
		bodyModel[71] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 188
		bodyModel[72] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 189
		bodyModel[73] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 190
		bodyModel[74] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 191
		bodyModel[75] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 192
		bodyModel[76] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 193
		bodyModel[77] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 194
		bodyModel[78] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 157
		bodyModel[79] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 155
		bodyModel[80] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 157
		bodyModel[81] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 155
		bodyModel[82] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 172
		bodyModel[83] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 171
		bodyModel[84] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 172
		bodyModel[85] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 173
		bodyModel[86] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 174
		bodyModel[87] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 175
		bodyModel[88] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 176
		bodyModel[89] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 182
		bodyModel[90] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 183
		bodyModel[91] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 184
		bodyModel[92] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 188
		bodyModel[93] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 189
		bodyModel[94] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 190
		bodyModel[95] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 191
		bodyModel[96] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 192
		bodyModel[97] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 193
		bodyModel[98] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 194
		bodyModel[99] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 157
		bodyModel[100] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 155
		bodyModel[101] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 157
		bodyModel[102] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 155
		bodyModel[103] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 172
		bodyModel[104] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 63
		bodyModel[105] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 63
		bodyModel[106] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 351
		bodyModel[107] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 351
		bodyModel[108] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 351
		bodyModel[109] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 351
		bodyModel[110] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 63
		bodyModel[111] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 351
		bodyModel[112] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 351
		bodyModel[113] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 351
		bodyModel[114] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 351
		bodyModel[115] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 115
		bodyModel[116] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 115
		bodyModel[117] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 115
		bodyModel[118] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 115
		bodyModel[119] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 115
		bodyModel[120] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 115
		bodyModel[121] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 115
		bodyModel[122] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 115
		bodyModel[123] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 115
		bodyModel[124] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 115
		bodyModel[125] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 115
		bodyModel[126] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 115
		bodyModel[127] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 115
		bodyModel[128] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 63
		bodyModel[129] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 115
		bodyModel[130] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 115
		bodyModel[131] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 115
		bodyModel[132] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 115
		bodyModel[133] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 115
		bodyModel[134] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 115
		bodyModel[135] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 115
		bodyModel[136] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 115
		bodyModel[137] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 63
		bodyModel[138] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 63
		bodyModel[139] = new ModelRendererTurbo(this, 40, 77, textureX, textureY); // Box 63
		bodyModel[140] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 63
		bodyModel[141] = new ModelRendererTurbo(this, 18, 76, textureX, textureY); // Box 63
		bodyModel[142] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 63
		bodyModel[143] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 171
		bodyModel[144] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 173
		bodyModel[145] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 174
		bodyModel[146] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 175
		bodyModel[147] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 176
		bodyModel[148] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 172
		bodyModel[149] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 172
		bodyModel[150] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 63
		bodyModel[151] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 63
		bodyModel[152] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 63
		bodyModel[153] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 63
		bodyModel[154] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 63
		bodyModel[155] = new ModelRendererTurbo(this, 29, 77, textureX, textureY); // Box 63
		bodyModel[156] = new ModelRendererTurbo(this, 7, 76, textureX, textureY); // Box 63
		bodyModel[157] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 63
		bodyModel[158] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 63
		bodyModel[159] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 63
		bodyModel[160] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 63
		bodyModel[161] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 115
		bodyModel[162] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 115
		bodyModel[163] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 115
		bodyModel[164] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 115
		bodyModel[165] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 63
		bodyModel[166] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 63
		bodyModel[167] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 63
		bodyModel[168] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 63
		bodyModel[169] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 63
		bodyModel[170] = new ModelRendererTurbo(this, 2, 74, textureX, textureY); // Box 74
		bodyModel[171] = new ModelRendererTurbo(this, 2, 74, textureX, textureY); // Box 79
		bodyModel[172] = new ModelRendererTurbo(this, 2, 74, textureX, textureY); // Box 80
		bodyModel[173] = new ModelRendererTurbo(this, 281, 64, textureX, textureY); // Box 63
		bodyModel[174] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 63
		bodyModel[175] = new ModelRendererTurbo(this, 56, 91, textureX, textureY); // Box 66
		bodyModel[176] = new ModelRendererTurbo(this, 80, 98, textureX, textureY); // Box 66
		bodyModel[177] = new ModelRendererTurbo(this, 26, 105, textureX, textureY); // Box 180
		bodyModel[178] = new ModelRendererTurbo(this, 8, 91, textureX, textureY); // Box 66
		bodyModel[179] = new ModelRendererTurbo(this, 8, 98, textureX, textureY); // Box 66
		bodyModel[180] = new ModelRendererTurbo(this, 8, 105, textureX, textureY); // Box 180
		bodyModel[181] = new ModelRendererTurbo(this, 54, 78, textureX, textureY); // Box 182
		bodyModel[182] = new ModelRendererTurbo(this, 251, 45, textureX, textureY); // Box 176
		bodyModel[183] = new ModelRendererTurbo(this, 60, 85, textureX, textureY); // Box 182
		bodyModel[184] = new ModelRendererTurbo(this, 60, 80, textureX, textureY); // Box 182
		bodyModel[185] = new ModelRendererTurbo(this, 152, 91, textureX, textureY); // Box 66
		bodyModel[186] = new ModelRendererTurbo(this, 224, 98, textureX, textureY); // Box 66
		bodyModel[187] = new ModelRendererTurbo(this, 44, 105, textureX, textureY); // Box 180
		bodyModel[188] = new ModelRendererTurbo(this, 104, 91, textureX, textureY); // Box 66
		bodyModel[189] = new ModelRendererTurbo(this, 152, 98, textureX, textureY); // Box 66
		bodyModel[190] = new ModelRendererTurbo(this, 62, 105, textureX, textureY); // Box 180
		bodyModel[191] = new ModelRendererTurbo(this, 70, 79, textureX, textureY); // Box 191
		bodyModel[192] = new ModelRendererTurbo(this, 31, 74, textureX, textureY); // Box 191
		bodyModel[193] = new ModelRendererTurbo(this, 70, 79, textureX, textureY); // Box 191
		bodyModel[194] = new ModelRendererTurbo(this, 18, 74, textureX, textureY); // Box 191
		bodyModel[195] = new ModelRendererTurbo(this, 70, 79, textureX, textureY); // Box 191
		bodyModel[196] = new ModelRendererTurbo(this, 70, 79, textureX, textureY); // Box 191

		bodyModel[0].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, -1.75F, 0.25F, 0F); // Box 351
		bodyModel[0].setRotationPoint(-23.5F, 3.25F, -7.25F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Box 351
		bodyModel[1].setRotationPoint(-27F, 3.25F, -7.25F);

		bodyModel[2].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[2].setRotationPoint(-23F, 3F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[3].setRotationPoint(-23F, 3F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[4].setRotationPoint(-20.5F, 5.5F, -8.25F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[5].setRotationPoint(-20.5F, 5.5F, 6.75F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[6].setRotationPoint(-20.5F, 5.5F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -1.5F, -0.85F, 0F, -1.5F, -0.85F, -0.5F, 0F, -0.25F, -0.5F); // Box 112
		bodyModel[7].setRotationPoint(-19.25F, 4.5F, -7.75F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 146
		bodyModel[8].setRotationPoint(-20.25F, 4.5F, 6.75F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 146
		bodyModel[9].setRotationPoint(-20.25F, 4.5F, -8.25F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 351
		bodyModel[10].setRotationPoint(-14F, 3.25F, -7.25F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, -1.5F, -0.85F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -1.5F, -0.85F, -0.5F); // Box 112
		bodyModel[11].setRotationPoint(-23.75F, 4.5F, -7.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, -1.75F, 0.25F, 0F); // Box 351
		bodyModel[12].setRotationPoint(-23.5F, 3.25F, 6.25F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Box 351
		bodyModel[13].setRotationPoint(-27F, 3.25F, 6.25F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -1.5F, -0.85F, 0F, -1.5F, -0.85F, -0.5F, 0F, -0.25F, -0.5F); // Box 112
		bodyModel[14].setRotationPoint(-19.25F, 4.5F, 7.25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 351
		bodyModel[15].setRotationPoint(-14F, 3.25F, 6.25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, -1.5F, -0.85F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -1.5F, -0.85F, -0.5F); // Box 112
		bodyModel[16].setRotationPoint(-23.75F, 4.5F, 7.25F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, -1.75F, 0.25F, 0F); // Box 351
		bodyModel[17].setRotationPoint(11.5F, 3.25F, -7.25F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Box 351
		bodyModel[18].setRotationPoint(8F, 3.25F, -7.25F);

		bodyModel[19].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[19].setRotationPoint(12F, 3F, 6F);

		bodyModel[20].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 11
		bodyModel[20].setRotationPoint(12F, 3F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[21].setRotationPoint(14.5F, 5.5F, -8.25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[22].setRotationPoint(14.5F, 5.5F, 6.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 351
		bodyModel[23].setRotationPoint(14.5F, 5.5F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -1.5F, -0.85F, 0F, -1.5F, -0.85F, -0.5F, 0F, -0.25F, -0.5F); // Box 112
		bodyModel[24].setRotationPoint(15.75F, 4.5F, -7.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 146
		bodyModel[25].setRotationPoint(14.75F, 4.5F, 6.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 146
		bodyModel[26].setRotationPoint(14.75F, 4.5F, -8.25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 351
		bodyModel[27].setRotationPoint(21F, 3.25F, -7.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, -1.5F, -0.85F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -1.5F, -0.85F, -0.5F); // Box 112
		bodyModel[28].setRotationPoint(11.25F, 4.5F, -7.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0.25F, 0F, -1.75F, 0.25F, 0F); // Box 351
		bodyModel[29].setRotationPoint(11.5F, 3.25F, 6.25F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F); // Box 351
		bodyModel[30].setRotationPoint(8F, 3.25F, 6.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -1.5F, -0.85F, 0F, -1.5F, -0.85F, -0.5F, 0F, -0.25F, -0.5F); // Box 112
		bodyModel[31].setRotationPoint(15.75F, 4.5F, 7.25F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 351
		bodyModel[32].setRotationPoint(21F, 3.25F, 6.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.25F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0.25F, -0.5F, -1.5F, -0.85F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -1.5F, -0.85F, -0.5F); // Box 112
		bodyModel[33].setRotationPoint(11.25F, 4.5F, 7.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 58, 2, 16, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 63
		bodyModel[34].setRotationPoint(-29F, 1.25F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 63
		bodyModel[35].setRotationPoint(-29.25F, 1.25F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 63
		bodyModel[36].setRotationPoint(28.5F, 1.25F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 6, 6, 0F); // Box 66
		bodyModel[37].setRotationPoint(-29.5F, -11.5F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 69
		bodyModel[38].setRotationPoint(-29.5F, -17F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F); // Box 66
		bodyModel[39].setRotationPoint(-29.5F, -11.5F, 3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 6, 5, 0F,-1.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[40].setRotationPoint(-29.5F, -11.5F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0.5F, -1.25F, -5.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -1.25F, 0.5F, 0.5F); // Box 69
		bodyModel[41].setRotationPoint(-29.5F, -17F, 3F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,-1.25F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 69
		bodyModel[42].setRotationPoint(-29.5F, -17F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 69
		bodyModel[43].setRotationPoint(-29.5F, -5F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -1.25F, 0.5F, 0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0.5F, -1.25F, -5.5F, 0.5F); // Box 69
		bodyModel[44].setRotationPoint(-29.5F, -5F, 3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,-1.25F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 69
		bodyModel[45].setRotationPoint(-29.5F, -5F, -8F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 6, 6, 0F); // Box 66
		bodyModel[46].setRotationPoint(19.5F, -11.5F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 69
		bodyModel[47].setRotationPoint(19.5F, -17F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 66
		bodyModel[48].setRotationPoint(19.5F, -11.5F, 3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 6, 5, 0F,0F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[49].setRotationPoint(19.5F, -11.5F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 69
		bodyModel[50].setRotationPoint(19.5F, -17F, 3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, -5.5F, 0.5F, -1.25F, -5.5F, 0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -1.25F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 69
		bodyModel[51].setRotationPoint(19.5F, -17F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[52].setRotationPoint(19.5F, -5F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.25F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -5.5F, 0.5F, 0F, -5.5F, 0.5F); // Box 69
		bodyModel[53].setRotationPoint(19.5F, -5F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 5, 5, 0F,0F, 0.5F, 0.5F, -1.25F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5.5F, 0.5F, -1.25F, -5.5F, 0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[54].setRotationPoint(19.5F, -5F, -8F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 45, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[55].setRotationPoint(-25.5F, -11.5F, -8.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 45, 6, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F); // Box 66
		bodyModel[56].setRotationPoint(-25.5F, -5.5F, -8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 45, 6, 17, 0F,0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[57].setRotationPoint(-25.5F, -17.5F, -8.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, -2F, -0.1F, 0F, -2F, -0.1F, 0F, -2F, 0F, 0F, -2F, 0F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 63
		bodyModel[58].setRotationPoint(-26.18F, -2F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,-0.1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.1F, 0F, -2F, -0.1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.1F, 0.25F, 0F); // Box 63
		bodyModel[59].setRotationPoint(-11.48F, -2F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, -2F, -0.1F, 0F, -2F, -0.1F, 0F, -2F, 0F, 0F, -2F, 0F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 63
		bodyModel[60].setRotationPoint(4.8F, -2F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,0F, 0F, -2F, -0.1F, 0F, -2F, -0.1F, 0F, -2F, 0F, 0F, -2F, 0F, 0.25F, 0F, -0.1F, 0.25F, 0F, -0.1F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 63
		bodyModel[61].setRotationPoint(19.63F, -2F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[62].setRotationPoint(-34.25F, 0.75F, -7.55F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[63].setRotationPoint(-34.25F, 0.75F, -6.55F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[64].setRotationPoint(-34.25F, 1.75F, -8.55F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[65].setRotationPoint(-34.25F, 2.75F, -8.55F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 175
		bodyModel[66].setRotationPoint(-34.25F, 2.75F, -6.55F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[67].setRotationPoint(-34.25F, 2.75F, -7.55F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F); // Box 182
		bodyModel[68].setRotationPoint(-30.25F, 1.75F, -0.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 183
		bodyModel[69].setRotationPoint(-32.5F, 1.75F, -0.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 184
		bodyModel[70].setRotationPoint(-32.5F, 2.75F, -0.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 188
		bodyModel[71].setRotationPoint(-34.25F, 2.75F, 7.45F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[72].setRotationPoint(-34.25F, 2.75F, 6.45F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[73].setRotationPoint(-34.25F, 2.75F, 5.45F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[74].setRotationPoint(-34.25F, 1.75F, 5.45F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[75].setRotationPoint(-34.25F, 0.75F, 7.45F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[76].setRotationPoint(-34.25F, 0.75F, 6.45F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[77].setRotationPoint(-34.25F, 0.75F, 5.45F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 157
		bodyModel[78].setRotationPoint(-33.75F, 1F, 6.2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 155
		bodyModel[79].setRotationPoint(-32.25F, 1.25F, 5.95F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 157
		bodyModel[80].setRotationPoint(-33.75F, 1F, -7.8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 155
		bodyModel[81].setRotationPoint(-32.25F, 1.25F, -8.05F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[82].setRotationPoint(-34.25F, 0.75F, -8.55F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 171
		bodyModel[83].setRotationPoint(33.25F, 0.75F, 6.55F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 172
		bodyModel[84].setRotationPoint(33.25F, 0.75F, 5.55F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 173
		bodyModel[85].setRotationPoint(33.25F, 1.75F, 5.55F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 174
		bodyModel[86].setRotationPoint(33.25F, 2.75F, 7.55F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 175
		bodyModel[87].setRotationPoint(33.25F, 2.75F, 5.55F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 176
		bodyModel[88].setRotationPoint(33.25F, 2.75F, 6.55F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 182
		bodyModel[89].setRotationPoint(29.25F, 1.75F, -0.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 183
		bodyModel[90].setRotationPoint(31.5F, 1.75F, -0.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 184
		bodyModel[91].setRotationPoint(31.5F, 2.75F, -0.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 188
		bodyModel[92].setRotationPoint(33.25F, 2.75F, -8.45F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 189
		bodyModel[93].setRotationPoint(33.25F, 2.75F, -7.45F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 190
		bodyModel[94].setRotationPoint(33.25F, 2.75F, -6.45F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 191
		bodyModel[95].setRotationPoint(33.25F, 1.75F, -8.45F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 192
		bodyModel[96].setRotationPoint(33.25F, 0.75F, -8.45F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 193
		bodyModel[97].setRotationPoint(33.25F, 0.75F, -7.45F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 194
		bodyModel[98].setRotationPoint(33.25F, 0.75F, -6.45F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 157
		bodyModel[99].setRotationPoint(32.75F, 1F, -8.2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[100].setRotationPoint(29.25F, 1.25F, -7.95F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 157
		bodyModel[101].setRotationPoint(32.75F, 1F, 5.8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[102].setRotationPoint(29.25F, 1.25F, 6.05F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 172
		bodyModel[103].setRotationPoint(33.25F, 0.75F, 7.55F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,0F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[104].setRotationPoint(23.85F, 0.25F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[105].setRotationPoint(23.15F, 4.75F, 10.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 351
		bodyModel[106].setRotationPoint(27.5F, 5.75F, 9.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Box 351
		bodyModel[107].setRotationPoint(27.5F, 3.25F, 8.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 351
		bodyModel[108].setRotationPoint(23.5F, 5.75F, 9.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Box 351
		bodyModel[109].setRotationPoint(23.5F, 3.25F, 8.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 63
		bodyModel[110].setRotationPoint(23.35F, 4.75F, -11.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 351
		bodyModel[111].setRotationPoint(24F, 3.25F, -9.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 351
		bodyModel[112].setRotationPoint(28F, 5.75F, -11.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 351
		bodyModel[113].setRotationPoint(28F, 3.25F, -9.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 351
		bodyModel[114].setRotationPoint(24F, 5.75F, -11.5F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 115
		bodyModel[115].setRotationPoint(-1F, -19.5F, -0.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 115
		bodyModel[116].setRotationPoint(-1F, -19.5F, 0.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 115
		bodyModel[117].setRotationPoint(0F, -19.5F, 0.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 115
		bodyModel[118].setRotationPoint(1F, -19.5F, 0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[119].setRotationPoint(-1F, -19.5F, -1.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 115
		bodyModel[120].setRotationPoint(0F, -19.5F, -1.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[121].setRotationPoint(1F, -19.5F, -1.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.4F, -0.4F, 0F, -1.4F, -0.4F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0.6F, -0.4F, -0.5F, 0.6F); // Box 115
		bodyModel[122].setRotationPoint(-7F, -19F, -0.28F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.4F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, -0.5F, 0.6F, 0F, -0.5F, 0.6F, 0F, -0.5F, -0.6F, -0.4F, -0.5F, -0.6F); // Box 115
		bodyModel[123].setRotationPoint(-7F, -19F, -1.68F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2F, 0F, -0.4F, -1.4F, 0F, -0.4F, -1.4F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 115
		bodyModel[124].setRotationPoint(-8.6F, -19F, -0.68F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, -0.5F, 0.6F, 0F, -0.5F, 0.6F, 0F, -0.5F, -0.6F, -0.4F, -0.5F, -0.6F); // Box 115
		bodyModel[125].setRotationPoint(-7F, -18.5F, -1.68F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, -0.4F, 0F, 0.6F, -0.4F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0.6F, -0.4F, -0.5F, 0.6F); // Box 115
		bodyModel[126].setRotationPoint(-7F, -18.5F, -0.28F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.4F, 0.6F, 0F, -0.4F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0.6F, -0.5F, -0.4F, 0.6F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 115
		bodyModel[127].setRotationPoint(-8.6F, -18.5F, -0.68F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[128].setRotationPoint(23.85F, 3F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1.4F, 0F, 0F, 0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -1.4F, 0F, -0.5F, 0.6F); // Box 115
		bodyModel[129].setRotationPoint(-6F, -18.5F, -0.28F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.6F, 0F, 0F, -1.4F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0.6F, 0F, -0.5F, -1.4F); // Box 115
		bodyModel[130].setRotationPoint(-8.6F, -18.5F, -0.28F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0.6F, 0F, 0F, -1.4F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.5F, 0.6F, 0F, -0.5F, -1.4F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F); // Box 115
		bodyModel[131].setRotationPoint(-6F, -18.5F, -1.68F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -1.4F, 0F, 0F, 0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.5F, -1.4F, 0F, -0.5F, 0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F); // Box 115
		bodyModel[132].setRotationPoint(-8.6F, -18.5F, -1.68F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -1.4F, 0F, -0.5F, 0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -1.4F, 0F, -0.5F, 0.6F); // Box 115
		bodyModel[133].setRotationPoint(-6F, -19F, -0.28F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F, -0.5F, 0.6F, 0F, -0.5F, -1.4F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, 0.6F, 0F, -0.5F, -1.4F); // Box 115
		bodyModel[134].setRotationPoint(-8.6F, -19F, -0.28F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0.6F, 0F, -0.5F, -1.4F, 0F, -0.5F, -0.6F, 0F, 0F, -0.6F, 0F, -0.5F, 0.6F, 0F, -0.5F, -1.4F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F); // Box 115
		bodyModel[135].setRotationPoint(-6F, -19F, -1.68F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, -1.4F, 0F, -0.5F, 0.6F, 0F, 0F, -0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -1.4F, 0F, -0.5F, 0.6F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F); // Box 115
		bodyModel[136].setRotationPoint(-8.6F, -19F, -1.68F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[137].setRotationPoint(29.25F, -6F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[138].setRotationPoint(23.75F, -5F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 63
		bodyModel[139].setRotationPoint(23.85F, -9F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[140].setRotationPoint(-11.5F, -17F, 3.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 7, 5, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, 0.75F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 63
		bodyModel[141].setRotationPoint(23.85F, -16F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 35, 1, 4, 0F,0F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[142].setRotationPoint(-11.5F, -17F, -7.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[143].setRotationPoint(-29.75F, -3.75F, -0.55F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[144].setRotationPoint(-29.75F, -2.75F, -1.55F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[145].setRotationPoint(-29.75F, -1.75F, -1.55F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 175
		bodyModel[146].setRotationPoint(-29.75F, -1.75F, 0.45F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[147].setRotationPoint(-29.75F, -1.75F, -0.55F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[148].setRotationPoint(-29.75F, -3.75F, 0.45F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[149].setRotationPoint(-29.75F, -3.75F, -1.55F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 35, 4, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[150].setRotationPoint(-11.5F, -20.5F, -7.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 16, 4, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[151].setRotationPoint(-11.5F, -20.5F, 7.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[152].setRotationPoint(-11.5F, -20.5F, -7.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[153].setRotationPoint(4.75F, -20.5F, -3.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 19, 4, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[154].setRotationPoint(4.5F, -20.5F, -3.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 0, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 63
		bodyModel[155].setRotationPoint(23.85F, -9F, 4F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 0, 7, 5, 0F,0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, 0.75F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 63
		bodyModel[156].setRotationPoint(23.85F, -16F, 4F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 35, 1, 4, 0F,0F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[157].setRotationPoint(-11.5F, -17F, 3.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 35, 4, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[158].setRotationPoint(-11.5F, -20.5F, 7.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 19, 4, 0, 0F,0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[159].setRotationPoint(4.5F, -20.5F, 3.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 0, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[160].setRotationPoint(4.75F, -20.5F, -7.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 115
		bodyModel[161].setRotationPoint(-3.67F, -19F, -0.3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 115
		bodyModel[162].setRotationPoint(-9.6F, -18.25F, -0.3F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 115
		bodyModel[163].setRotationPoint(-8.67F, -19.75F, -0.3F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.93F, 0F, 0F, -0.07F, -0.75F, 0F, -0.07F, -0.75F, -0.25F, -0.93F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 115
		bodyModel[164].setRotationPoint(-9.6F, -19.75F, -0.3F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, 0F, -0.35F, -0.5F, 0F, -0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[165].setRotationPoint(23.85F, 3F, 8F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 63
		bodyModel[166].setRotationPoint(4.63F, -4F, -8F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 63
		bodyModel[167].setRotationPoint(-26.18F, -4F, -8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 63
		bodyModel[168].setRotationPoint(4.63F, -4F, 7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 63
		bodyModel[169].setRotationPoint(-26.18F, -4F, 7F);

		bodyModel[170].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 74
		bodyModel[170].setRotationPoint(-6.5F, 3.25F, -5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[171].setRotationPoint(-6.5F, 3.25F, -6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 80
		bodyModel[172].setRotationPoint(-6.5F, 3.25F, -4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 16, 4, 0, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[173].setRotationPoint(-11.5F, -20.5F, -7.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 17, 1, 4, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[174].setRotationPoint(-11.5F, -17F, -7.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 23, 5, 0, 0F,-6F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 66
		bodyModel[175].setRotationPoint(-28F, -12F, -8.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 35, 5, 0, 0F,-6F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 66
		bodyModel[176].setRotationPoint(-15F, -12F, -8.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 8, 11, 0, 0F,0F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 180
		bodyModel[177].setRotationPoint(14.5F, -14F, -8.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 23, 5, 0, 0F,-6F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 66
		bodyModel[178].setRotationPoint(-1F, -12F, 8.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 35, 5, 0, 0F,-6F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 66
		bodyModel[179].setRotationPoint(-26F, -12F, 8.75F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 8, 11, 0, 0F,-6F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -6F, -4.5F, 0F); // Box 180
		bodyModel[180].setRotationPoint(-28.5F, -14F, 8.75F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 182
		bodyModel[181].setRotationPoint(29.25F, -6.25F, 1.75F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[182].setRotationPoint(29.25F, 2.5F, 1.75F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 182
		bodyModel[183].setRotationPoint(28.25F, -7.25F, 1.75F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 182
		bodyModel[184].setRotationPoint(28.25F, -7.75F, 1.75F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 23, 5, 0, 0F,-8F, -2F, 0F, -8F, -2F, 0F, -8F, -2F, 0F, -8F, -2F, 0F, -8F, -1F, 0F, -8F, -1F, 0F, -8F, -1F, 0F, -8F, -1F, 0F); // Box 66
		bodyModel[185].setRotationPoint(2F, -5.5F, -8.25F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 35, 5, 0, 0F,-12F, -2F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, -12F, -1F, 0F, -12F, -1F, 0F, -12F, -1F, 0F, -12F, -1F, 0F); // Box 66
		bodyModel[186].setRotationPoint(-6F, -3.25F, -8.25F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 8, 11, 0, 0F,0F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, 0F, -4.5F, 0F); // Box 180
		bodyModel[187].setRotationPoint(17.5F, -5.75F, -8.25F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 23, 5, 0, 0F,-8F, -2F, 0F, -8F, -2F, 0F, -8F, -2F, 0F, -8F, -2F, 0F, -8F, -1F, 0F, -8F, -1F, 0F, -8F, -1F, 0F, -8F, -1F, 0F); // Box 66
		bodyModel[188].setRotationPoint(-30.5F, -5.5F, 8.25F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 35, 5, 0, 0F,-12F, -2F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, -12F, -2F, 0F, -12F, -1F, 0F, -12F, -1F, 0F, -12F, -1F, 0F, -12F, -1F, 0F); // Box 66
		bodyModel[189].setRotationPoint(-34.5F, -3.25F, 8.25F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 8, 11, 0, 0F,-6F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -6F, -4.5F, 0F, -6F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, -6F, -4.5F, 0F); // Box 180
		bodyModel[190].setRotationPoint(-31F, -5.75F, 8.25F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[191].setRotationPoint(0.5F, 3.25F, -10F);

		bodyModel[192].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 191
		bodyModel[192].setRotationPoint(-1.5F, 3.25F, -1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 191
		bodyModel[193].setRotationPoint(-1.5F, 3.25F, 1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[194].setRotationPoint(-1.5F, 0.25F, -1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 191
		bodyModel[195].setRotationPoint(-2F, 3.25F, 10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 191
		bodyModel[196].setRotationPoint(0F, 3.25F, -11F);
	}
}