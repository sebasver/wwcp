//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.12.2018 - 14:39:34
// Last changed on: 24.12.2018 - 14:39:34

package wwcp.models.locomotives.diesels; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class SD60M2 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public SD60M2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[505];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // box
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // box
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // box
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // box
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // box
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // box
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // box
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // box
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // box
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // box
		bodyModel[10] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 11
		bodyModel[13] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		bodyModel[14] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 11
		bodyModel[15] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		bodyModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		bodyModel[17] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 11
		bodyModel[18] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 11
		bodyModel[19] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		bodyModel[20] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 11
		bodyModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 11
		bodyModel[22] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		bodyModel[23] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		bodyModel[24] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 11
		bodyModel[25] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 11
		bodyModel[26] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 11
		bodyModel[27] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 11
		bodyModel[28] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 11
		bodyModel[29] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 11
		bodyModel[30] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 3
		bodyModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		bodyModel[32] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 11
		bodyModel[33] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 11
		bodyModel[34] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 11
		bodyModel[35] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 11
		bodyModel[36] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 11
		bodyModel[37] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 11
		bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11
		bodyModel[39] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 11
		bodyModel[40] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 11
		bodyModel[41] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 11
		bodyModel[42] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 11
		bodyModel[43] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 11
		bodyModel[44] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 11
		bodyModel[45] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 11
		bodyModel[46] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 11
		bodyModel[47] = new ModelRendererTurbo(this, 450, 303, textureX, textureY); // Box 11
		bodyModel[48] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 11
		bodyModel[49] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 11
		bodyModel[50] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 128
		bodyModel[51] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 11
		bodyModel[52] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 132
		bodyModel[53] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 132
		bodyModel[54] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 132
		bodyModel[55] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 132
		bodyModel[56] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 11
		bodyModel[57] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 11
		bodyModel[58] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 149
		bodyModel[59] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 180
		bodyModel[60] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 180
		bodyModel[61] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 180
		bodyModel[62] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 180
		bodyModel[63] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 180
		bodyModel[64] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 180
		bodyModel[65] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 180
		bodyModel[66] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 180
		bodyModel[67] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 180
		bodyModel[68] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 180
		bodyModel[69] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 180
		bodyModel[70] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 180
		bodyModel[71] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 180
		bodyModel[72] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 180
		bodyModel[73] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 180
		bodyModel[74] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 180
		bodyModel[75] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 180
		bodyModel[76] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 180
		bodyModel[77] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 180
		bodyModel[78] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 180
		bodyModel[79] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 180
		bodyModel[80] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 11
		bodyModel[81] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 52
		bodyModel[82] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 52
		bodyModel[83] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 145
		bodyModel[84] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 145
		bodyModel[85] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 145
		bodyModel[86] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 52
		bodyModel[87] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 52
		bodyModel[88] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 52
		bodyModel[89] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 52
		bodyModel[90] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 52
		bodyModel[91] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 52
		bodyModel[92] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 52
		bodyModel[93] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 52
		bodyModel[94] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 52
		bodyModel[95] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 52
		bodyModel[96] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 52
		bodyModel[97] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 52
		bodyModel[98] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 52
		bodyModel[99] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 52
		bodyModel[100] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 52
		bodyModel[101] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 52
		bodyModel[102] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 52
		bodyModel[103] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 145
		bodyModel[104] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 145
		bodyModel[105] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 145
		bodyModel[106] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 52
		bodyModel[107] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 52
		bodyModel[108] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 52
		bodyModel[109] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 52
		bodyModel[110] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 52
		bodyModel[111] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 52
		bodyModel[112] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 52
		bodyModel[113] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 52
		bodyModel[114] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 52
		bodyModel[115] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 52
		bodyModel[116] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 52
		bodyModel[117] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 52
		bodyModel[118] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 52
		bodyModel[119] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 52
		bodyModel[120] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 52
		bodyModel[121] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 145
		bodyModel[122] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 145
		bodyModel[123] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 52
		bodyModel[124] = new ModelRendererTurbo(this, 254, 224, textureX, textureY); // Box 52
		bodyModel[125] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 52
		bodyModel[126] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 52
		bodyModel[127] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 52
		bodyModel[128] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 52
		bodyModel[129] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 52
		bodyModel[130] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 52
		bodyModel[131] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 11
		bodyModel[132] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Light_Nose_Top-Top
		bodyModel[133] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Light_Nose_Top-Bottom
		bodyModel[134] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 11
		bodyModel[135] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 11
		bodyModel[136] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 11
		bodyModel[137] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 52
		bodyModel[138] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 52
		bodyModel[139] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 52
		bodyModel[140] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 52
		bodyModel[141] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 128
		bodyModel[142] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // blanked_marker
		bodyModel[143] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // blanked_marker
		bodyModel[144] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Light_Rear_Right
		bodyModel[145] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Light_Rear_Left
		bodyModel[146] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Numberboard_Left_Rear
		bodyModel[147] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Numberboard_Right_Rear
		bodyModel[148] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // box
		bodyModel[149] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // box
		bodyModel[150] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // box
		bodyModel[151] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // box
		bodyModel[152] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // box
		bodyModel[153] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // box
		bodyModel[154] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // box
		bodyModel[155] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 11
		bodyModel[156] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 11
		bodyModel[157] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 11
		bodyModel[158] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 11
		bodyModel[159] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // box
		bodyModel[160] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // box
		bodyModel[161] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // box
		bodyModel[162] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 11
		bodyModel[163] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 11
		bodyModel[164] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 11
		bodyModel[165] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 11
		bodyModel[166] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // box
		bodyModel[167] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // box
		bodyModel[168] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // box
		bodyModel[169] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // box
		bodyModel[170] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // box
		bodyModel[171] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // box
		bodyModel[172] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // box
		bodyModel[173] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // box
		bodyModel[174] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // box
		bodyModel[175] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Ditchlight_Left_Top_csx
		bodyModel[176] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // box
		bodyModel[177] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Ditchlight_Right_Top_csx
		bodyModel[178] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // box
		bodyModel[179] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Ditchlight_Right_Bottom_ns
		bodyModel[180] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // box
		bodyModel[181] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Ditchlight_Left_Bottom_ns
		bodyModel[182] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // box
		bodyModel[183] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 52
		bodyModel[184] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 52
		bodyModel[185] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 52
		bodyModel[186] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 52
		bodyModel[187] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 52
		bodyModel[188] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 52
		bodyModel[189] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 52
		bodyModel[190] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 52
		bodyModel[191] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 52
		bodyModel[192] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 52
		bodyModel[193] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 11
		bodyModel[194] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 11
		bodyModel[195] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // box
		bodyModel[196] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 68
		bodyModel[197] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 68
		bodyModel[198] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 1
		bodyModel[199] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 1
		bodyModel[200] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 1
		bodyModel[201] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 1
		bodyModel[202] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 84
		bodyModel[203] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 84
		bodyModel[204] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 1
		bodyModel[205] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 1
		bodyModel[206] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 1
		bodyModel[207] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 1
		bodyModel[208] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Bell
		bodyModel[209] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 150
		bodyModel[210] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 68
		bodyModel[211] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 68
		bodyModel[212] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 180
		bodyModel[213] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 52
		bodyModel[214] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 11
		bodyModel[215] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 11
		bodyModel[216] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 122
		bodyModel[217] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 122
		bodyModel[218] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 52
		bodyModel[219] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 52
		bodyModel[220] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 145
		bodyModel[221] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 52
		bodyModel[222] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 52
		bodyModel[223] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 145
		bodyModel[224] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 132
		bodyModel[225] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 132
		bodyModel[226] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 132
		bodyModel[227] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 132
		bodyModel[228] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 52
		bodyModel[229] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 52
		bodyModel[230] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 149
		bodyModel[231] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 149
		bodyModel[232] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 149
		bodyModel[233] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 149
		bodyModel[234] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 149
		bodyModel[235] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 11
		bodyModel[236] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 11
		bodyModel[237] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 11
		bodyModel[238] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 52
		bodyModel[239] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 52
		bodyModel[240] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 52
		bodyModel[241] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 52
		bodyModel[242] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 52
		bodyModel[243] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 52
		bodyModel[244] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 52
		bodyModel[245] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 52
		bodyModel[246] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 52
		bodyModel[247] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 52
		bodyModel[248] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 11
		bodyModel[249] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 11
		bodyModel[250] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 11
		bodyModel[251] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 11
		bodyModel[252] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 11
		bodyModel[253] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 11
		bodyModel[254] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 11
		bodyModel[255] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 11
		bodyModel[256] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 11
		bodyModel[257] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 145
		bodyModel[258] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 145
		bodyModel[259] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 145
		bodyModel[260] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 145
		bodyModel[261] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 11
		bodyModel[262] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 11
		bodyModel[263] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 11
		bodyModel[264] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 11
		bodyModel[265] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 11
		bodyModel[266] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 11
		bodyModel[267] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 11
		bodyModel[268] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 11
		bodyModel[269] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 11
		bodyModel[270] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 11
		bodyModel[271] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 11
		bodyModel[272] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 11
		bodyModel[273] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 11
		bodyModel[274] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 11
		bodyModel[275] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 11
		bodyModel[276] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 11
		bodyModel[277] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 11
		bodyModel[278] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 11
		bodyModel[279] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 11
		bodyModel[280] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 11
		bodyModel[281] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 11
		bodyModel[282] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 11
		bodyModel[283] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 11
		bodyModel[284] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 11
		bodyModel[285] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Marker_Right_Front_CR
		bodyModel[286] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Marker_Left_Front_CR
		bodyModel[287] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Marker_Right_Rear_CR
		bodyModel[288] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Marker_Left_Rear_CR
		bodyModel[289] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 52
		bodyModel[290] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 145
		bodyModel[291] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 145
		bodyModel[292] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // box
		bodyModel[293] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // box
		bodyModel[294] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // box
		bodyModel[295] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // box
		bodyModel[296] = new ModelRendererTurbo(this, 10, 215, textureX, textureY); // Box 180
		bodyModel[297] = new ModelRendererTurbo(this, 268, 240, textureX, textureY); // box
		bodyModel[298] = new ModelRendererTurbo(this, 289, 219, textureX, textureY); // box
		bodyModel[299] = new ModelRendererTurbo(this, 99, 219, textureX, textureY); // Ditchlight_Left_Top_sp
		bodyModel[300] = new ModelRendererTurbo(this, 75, 212, textureX, textureY); // box
		bodyModel[301] = new ModelRendererTurbo(this, 300, 239, textureX, textureY); // Ditchlight_Right_Top_sp
		bodyModel[302] = new ModelRendererTurbo(this, 96, 246, textureX, textureY); // box
		bodyModel[303] = new ModelRendererTurbo(this, 121, 237, textureX, textureY); // box
		bodyModel[304] = new ModelRendererTurbo(this, 287, 242, textureX, textureY); // Ditchlight_Right_Top_sp
		bodyModel[305] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		bodyModel[306] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 11
		bodyModel[307] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 11
		bodyModel[308] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 11
		bodyModel[309] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 11
		bodyModel[310] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 11
		bodyModel[311] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 11
		bodyModel[312] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 11
		bodyModel[313] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 11
		bodyModel[314] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 11
		bodyModel[315] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 11
		bodyModel[316] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 11
		bodyModel[317] = new ModelRendererTurbo(this, 136, 13, textureX, textureY); // Box 11
		bodyModel[318] = new ModelRendererTurbo(this, 137, 8, textureX, textureY); // Box 11
		bodyModel[319] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 11
		bodyModel[320] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 11
		bodyModel[321] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 11
		bodyModel[322] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 11
		bodyModel[323] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 11
		bodyModel[324] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 11
		bodyModel[325] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 11
		bodyModel[326] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 11
		bodyModel[327] = new ModelRendererTurbo(this, 340, 290, textureX, textureY); // Box 11
		bodyModel[328] = new ModelRendererTurbo(this, 373, 312, textureX, textureY); // Box 11
		bodyModel[329] = new ModelRendererTurbo(this, 456, 289, textureX, textureY); // Box 11
		bodyModel[330] = new ModelRendererTurbo(this, 340, 262, textureX, textureY); // Box 11
		bodyModel[331] = new ModelRendererTurbo(this, 293, 325, textureX, textureY); // Box 11
		bodyModel[332] = new ModelRendererTurbo(this, 413, 323, textureX, textureY); // Box 11
		bodyModel[333] = new ModelRendererTurbo(this, 371, 324, textureX, textureY); // Box 11
		bodyModel[334] = new ModelRendererTurbo(this, 302, 341, textureX, textureY); // Box 11
		bodyModel[335] = new ModelRendererTurbo(this, 402, 220, textureX, textureY); // Box 11
		bodyModel[336] = new ModelRendererTurbo(this, 376, 225, textureX, textureY); // Box 11
		bodyModel[337] = new ModelRendererTurbo(this, 344, 322, textureX, textureY); // Box 11
		bodyModel[338] = new ModelRendererTurbo(this, 323, 260, textureX, textureY); // Box 11
		bodyModel[339] = new ModelRendererTurbo(this, 293, 286, textureX, textureY); // Box 11
		bodyModel[340] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Box 11
		bodyModel[341] = new ModelRendererTurbo(this, 411, 290, textureX, textureY); // Box 11
		bodyModel[342] = new ModelRendererTurbo(this, 468, 260, textureX, textureY); // Box 11
		bodyModel[343] = new ModelRendererTurbo(this, 409, 242, textureX, textureY); // Box 11
		bodyModel[344] = new ModelRendererTurbo(this, 328, 242, textureX, textureY); // Box 11
		bodyModel[345] = new ModelRendererTurbo(this, 474, 272, textureX, textureY); // Box 11
		bodyModel[346] = new ModelRendererTurbo(this, 292, 296, textureX, textureY); // Box 11
		bodyModel[347] = new ModelRendererTurbo(this, 427, 213, textureX, textureY); // Box 11
		bodyModel[348] = new ModelRendererTurbo(this, 458, 268, textureX, textureY); // Box 11
		bodyModel[349] = new ModelRendererTurbo(this, 326, 320, textureX, textureY); // Box 11
		bodyModel[350] = new ModelRendererTurbo(this, 305, 310, textureX, textureY); // Box 11
		bodyModel[351] = new ModelRendererTurbo(this, 357, 243, textureX, textureY); // Box 11
		bodyModel[352] = new ModelRendererTurbo(this, 382, 216, textureX, textureY); // Box 11
		bodyModel[353] = new ModelRendererTurbo(this, 386, 262, textureX, textureY); // Box 11
		bodyModel[354] = new ModelRendererTurbo(this, 428, 264, textureX, textureY); // Box 11
		bodyModel[355] = new ModelRendererTurbo(this, 291, 314, textureX, textureY); // Box 11
		bodyModel[356] = new ModelRendererTurbo(this, 349, 227, textureX, textureY); // Box 11
		bodyModel[357] = new ModelRendererTurbo(this, 399, 213, textureX, textureY); // Box 11
		bodyModel[358] = new ModelRendererTurbo(this, 304, 295, textureX, textureY); // Box 11
		bodyModel[359] = new ModelRendererTurbo(this, 382, 245, textureX, textureY); // Box 11
		bodyModel[360] = new ModelRendererTurbo(this, 402, 233, textureX, textureY); // Box 11
		bodyModel[361] = new ModelRendererTurbo(this, 318, 277, textureX, textureY); // Box 11
		bodyModel[362] = new ModelRendererTurbo(this, 420, 308, textureX, textureY); // Box 11
		bodyModel[363] = new ModelRendererTurbo(this, 462, 238, textureX, textureY); // Box 11
		bodyModel[364] = new ModelRendererTurbo(this, 382, 288, textureX, textureY); // Box 11
		bodyModel[365] = new ModelRendererTurbo(this, 267, 294, textureX, textureY); // Box 11
		bodyModel[366] = new ModelRendererTurbo(this, 386, 335, textureX, textureY); // Box 11
		bodyModel[367] = new ModelRendererTurbo(this, 445, 360, textureX, textureY); // Box 11
		bodyModel[368] = new ModelRendererTurbo(this, 414, 358, textureX, textureY); // Box 11
		bodyModel[369] = new ModelRendererTurbo(this, 418, 336, textureX, textureY); // Box 11
		bodyModel[370] = new ModelRendererTurbo(this, 384, 358, textureX, textureY); // Box 11
		bodyModel[371] = new ModelRendererTurbo(this, 350, 337, textureX, textureY); // Box 11
		bodyModel[372] = new ModelRendererTurbo(this, 258, 315, textureX, textureY); // Box 11
		bodyModel[373] = new ModelRendererTurbo(this, 265, 264, textureX, textureY); // Box 11
		bodyModel[374] = new ModelRendererTurbo(this, 301, 272, textureX, textureY); // Box 11
		bodyModel[375] = new ModelRendererTurbo(this, 254, 285, textureX, textureY); // Box 11
		bodyModel[376] = new ModelRendererTurbo(this, 296, 279, textureX, textureY); // Box 11
		bodyModel[377] = new ModelRendererTurbo(this, 273, 284, textureX, textureY); // Box 11
		bodyModel[378] = new ModelRendererTurbo(this, 275, 273, textureX, textureY); // Box 11
		bodyModel[379] = new ModelRendererTurbo(this, 341, 210, textureX, textureY); // Box 11
		bodyModel[380] = new ModelRendererTurbo(this, 285, 259, textureX, textureY); // Box 11
		bodyModel[381] = new ModelRendererTurbo(this, 342, 316, textureX, textureY); // Box 11
		bodyModel[382] = new ModelRendererTurbo(this, 342, 316, textureX, textureY); // Box 11
		bodyModel[383] = new ModelRendererTurbo(this, 363, 212, textureX, textureY); // Box 11
		bodyModel[384] = new ModelRendererTurbo(this, 344, 219, textureX, textureY); // Box 11
		bodyModel[385] = new ModelRendererTurbo(this, 306, 246, textureX, textureY); // Box 11
		bodyModel[386] = new ModelRendererTurbo(this, 321, 206, textureX, textureY); // Box 11
		bodyModel[387] = new ModelRendererTurbo(this, 280, 328, textureX, textureY); // Box 11
		bodyModel[388] = new ModelRendererTurbo(this, 342, 316, textureX, textureY); // Box 11
		bodyModel[389] = new ModelRendererTurbo(this, 342, 316, textureX, textureY); // Box 11
		bodyModel[390] = new ModelRendererTurbo(this, 301, 230, textureX, textureY); // Box 11
		bodyModel[391] = new ModelRendererTurbo(this, 313, 226, textureX, textureY); // Box 11
		bodyModel[392] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 128
		bodyModel[393] = new ModelRendererTurbo(this, 467, 204, textureX, textureY); // Light_Front_Left
		bodyModel[394] = new ModelRendererTurbo(this, 304, 206, textureX, textureY); // Light_Front_Right
		bodyModel[395] = new ModelRendererTurbo(this, 252, 209, textureX, textureY); // Numberboard_Left
		bodyModel[396] = new ModelRendererTurbo(this, 252, 209, textureX, textureY); // Numberboard_Right
		bodyModel[397] = new ModelRendererTurbo(this, 485, 203, textureX, textureY); // Box 52
		bodyModel[398] = new ModelRendererTurbo(this, 399, 201, textureX, textureY); // Box 145
		bodyModel[399] = new ModelRendererTurbo(this, 462, 383, textureX, textureY); // Box 11
		bodyModel[400] = new ModelRendererTurbo(this, 425, 389, textureX, textureY); // Box 11
		bodyModel[401] = new ModelRendererTurbo(this, 337, 433, textureX, textureY); // Box 11
		bodyModel[402] = new ModelRendererTurbo(this, 428, 290, textureX, textureY); // Box 11
		bodyModel[403] = new ModelRendererTurbo(this, 476, 238, textureX, textureY); // Box 11
		bodyModel[404] = new ModelRendererTurbo(this, 470, 219, textureX, textureY); // Box 11
		bodyModel[405] = new ModelRendererTurbo(this, 477, 288, textureX, textureY); // Box 11
		bodyModel[406] = new ModelRendererTurbo(this, 429, 401, textureX, textureY); // Box 11
		bodyModel[407] = new ModelRendererTurbo(this, 413, 377, textureX, textureY); // Box 11
		bodyModel[408] = new ModelRendererTurbo(this, 293, 372, textureX, textureY); // Box 11
		bodyModel[409] = new ModelRendererTurbo(this, 413, 400, textureX, textureY); // Box 11
		bodyModel[410] = new ModelRendererTurbo(this, 293, 361, textureX, textureY); // Box 11
		bodyModel[411] = new ModelRendererTurbo(this, 476, 431, textureX, textureY); // Box 11
		bodyModel[412] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 11
		bodyModel[413] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 11
		bodyModel[414] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 11
		bodyModel[415] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 11
		bodyModel[416] = new ModelRendererTurbo(this, 392, 405, textureX, textureY); // Box 11
		bodyModel[417] = new ModelRendererTurbo(this, 445, 445, textureX, textureY); // Box 11
		bodyModel[418] = new ModelRendererTurbo(this, 389, 436, textureX, textureY); // Box 11
		bodyModel[419] = new ModelRendererTurbo(this, 361, 419, textureX, textureY); // Box 11
		bodyModel[420] = new ModelRendererTurbo(this, 373, 436, textureX, textureY); // Box 11
		bodyModel[421] = new ModelRendererTurbo(this, 338, 425, textureX, textureY); // Box 11
		bodyModel[422] = new ModelRendererTurbo(this, 350, 421, textureX, textureY); // Box 11
		bodyModel[423] = new ModelRendererTurbo(this, 371, 450, textureX, textureY); // Box 11
		bodyModel[424] = new ModelRendererTurbo(this, 370, 442, textureX, textureY); // Box 11
		bodyModel[425] = new ModelRendererTurbo(this, 389, 449, textureX, textureY); // Box 11
		bodyModel[426] = new ModelRendererTurbo(this, 382, 447, textureX, textureY); // Box 11
		bodyModel[427] = new ModelRendererTurbo(this, 380, 451, textureX, textureY); // Box 11
		bodyModel[428] = new ModelRendererTurbo(this, 365, 471, textureX, textureY); // Box 11
		bodyModel[429] = new ModelRendererTurbo(this, 384, 453, textureX, textureY); // Box 11
		bodyModel[430] = new ModelRendererTurbo(this, 357, 450, textureX, textureY); // Box 11
		bodyModel[431] = new ModelRendererTurbo(this, 356, 434, textureX, textureY); // Box 11
		bodyModel[432] = new ModelRendererTurbo(this, 283, 395, textureX, textureY); // Box 11
		bodyModel[433] = new ModelRendererTurbo(this, 265, 395, textureX, textureY); // Box 11
		bodyModel[434] = new ModelRendererTurbo(this, 488, 256, textureX, textureY); // Box 11
		bodyModel[435] = new ModelRendererTurbo(this, 311, 371, textureX, textureY); // Box 52
		bodyModel[436] = new ModelRendererTurbo(this, 17, 207, textureX, textureY); // Box 11
		bodyModel[437] = new ModelRendererTurbo(this, 2, 192, textureX, textureY); // Box 88
		bodyModel[438] = new ModelRendererTurbo(this, 209, 196, textureX, textureY); // Box 91
		bodyModel[439] = new ModelRendererTurbo(this, 233, 207, textureX, textureY); // Box 95
		bodyModel[440] = new ModelRendererTurbo(this, 222, 241, textureX, textureY); // Box 96
		bodyModel[441] = new ModelRendererTurbo(this, 235, 200, textureX, textureY); // Box 95
		bodyModel[442] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // Box 209
		bodyModel[443] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 88
		bodyModel[444] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 91
		bodyModel[445] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 95
		bodyModel[446] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 96
		bodyModel[447] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 95
		bodyModel[448] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 209
		bodyModel[449] = new ModelRendererTurbo(this, 173, 318, textureX, textureY); // Exhaust
		bodyModel[450] = new ModelRendererTurbo(this, 105, 289, textureX, textureY); // Exhaust
		bodyModel[451] = new ModelRendererTurbo(this, 137, 274, textureX, textureY); // BeaconSOO2
		bodyModel[452] = new ModelRendererTurbo(this, 233, 218, textureX, textureY); // Box 95
		bodyModel[453] = new ModelRendererTurbo(this, 222, 252, textureX, textureY); // Box 96
		bodyModel[454] = new ModelRendererTurbo(this, 235, 234, textureX, textureY); // Box 95
		bodyModel[455] = new ModelRendererTurbo(this, 41, 261, textureX, textureY); // Box 180
		bodyModel[456] = new ModelRendererTurbo(this, 84, 233, textureX, textureY); // Box 180
		bodyModel[457] = new ModelRendererTurbo(this, 97, 310, textureX, textureY); // Box 180
		bodyModel[458] = new ModelRendererTurbo(this, 129, 222, textureX, textureY); // Box 180
		bodyModel[459] = new ModelRendererTurbo(this, 135, 206, textureX, textureY); // Box 180
		bodyModel[460] = new ModelRendererTurbo(this, 170, 213, textureX, textureY); // Box 180
		bodyModel[461] = new ModelRendererTurbo(this, 181, 224, textureX, textureY); // Box 180
		bodyModel[462] = new ModelRendererTurbo(this, 143, 260, textureX, textureY); // Box 180
		bodyModel[463] = new ModelRendererTurbo(this, 181, 193, textureX, textureY); // Box 180
		bodyModel[464] = new ModelRendererTurbo(this, 105, 283, textureX, textureY); // Exhaust
		bodyModel[465] = new ModelRendererTurbo(this, 137, 261, textureX, textureY); // BeaconSOO2
		bodyModel[466] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 210
		bodyModel[467] = new ModelRendererTurbo(this, 369, 202, textureX, textureY); // Box 145
		bodyModel[468] = new ModelRendererTurbo(this, 372, 210, textureX, textureY); // Box 145
		bodyModel[469] = new ModelRendererTurbo(this, 238, 244, textureX, textureY); // Box 52
		bodyModel[470] = new ModelRendererTurbo(this, 218, 265, textureX, textureY); // Box 52
		bodyModel[471] = new ModelRendererTurbo(this, 233, 266, textureX, textureY); // Box 52
		bodyModel[472] = new ModelRendererTurbo(this, 238, 255, textureX, textureY); // Box 52
		bodyModel[473] = new ModelRendererTurbo(this, 365, 386, textureX, textureY); // Box 11
		bodyModel[474] = new ModelRendererTurbo(this, 382, 377, textureX, textureY); // Box 11
		bodyModel[475] = new ModelRendererTurbo(this, 382, 377, textureX, textureY); // Box 11
		bodyModel[476] = new ModelRendererTurbo(this, 382, 377, textureX, textureY); // Box 11
		bodyModel[477] = new ModelRendererTurbo(this, 382, 377, textureX, textureY); // Box 11
		bodyModel[478] = new ModelRendererTurbo(this, 365, 386, textureX, textureY); // Box 11
		bodyModel[479] = new ModelRendererTurbo(this, 382, 377, textureX, textureY); // Box 11
		bodyModel[480] = new ModelRendererTurbo(this, 382, 377, textureX, textureY); // Box 11
		bodyModel[481] = new ModelRendererTurbo(this, 382, 377, textureX, textureY); // Box 11
		bodyModel[482] = new ModelRendererTurbo(this, 382, 377, textureX, textureY); // Box 11
		bodyModel[483] = new ModelRendererTurbo(this, 195, 307, textureX, textureY); // Box 11
		bodyModel[484] = new ModelRendererTurbo(this, 193, 325, textureX, textureY); // Box 11
		bodyModel[485] = new ModelRendererTurbo(this, 186, 340, textureX, textureY); // Box 11
		bodyModel[486] = new ModelRendererTurbo(this, 382, 225, textureX, textureY); // Box 11
		bodyModel[487] = new ModelRendererTurbo(this, 247, 430, textureX, textureY); // Door_Rear
		bodyModel[488] = new ModelRendererTurbo(this, 264, 407, textureX, textureY); // Door_Rear
		bodyModel[489] = new ModelRendererTurbo(this, 463, 102, textureX, textureY); // Box 11
		bodyModel[490] = new ModelRendererTurbo(this, 463, 102, textureX, textureY); // Box 11
		bodyModel[491] = new ModelRendererTurbo(this, 462, 375, textureX, textureY); // Box 11
		bodyModel[492] = new ModelRendererTurbo(this, 467, 392, textureX, textureY); // Box 11
		bodyModel[493] = new ModelRendererTurbo(this, 457, 337, textureX, textureY); // Box 145
		bodyModel[494] = new ModelRendererTurbo(this, 479, 302, textureX, textureY); // Box 52
		bodyModel[495] = new ModelRendererTurbo(this, 479, 302, textureX, textureY); // Box 52
		bodyModel[496] = new ModelRendererTurbo(this, 49, 245, textureX, textureY); // box
		bodyModel[497] = new ModelRendererTurbo(this, 33, 236, textureX, textureY); // box
		bodyModel[498] = new ModelRendererTurbo(this, 336, 357, textureX, textureY); // Box 11
		bodyModel[499] = new ModelRendererTurbo(this, 336, 357, textureX, textureY); // Box 11

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[0].setRotationPoint(-72.5F, 3.5F, -0.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box
		bodyModel[1].setRotationPoint(-73.5F, 3F, -0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[2].setRotationPoint(-73.5F, 3F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[3].setRotationPoint(-75.5F, 3F, -0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[4].setRotationPoint(-74.5F, 3F, 0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[5].setRotationPoint(71.5F, 3.5F, -0.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // box
		bodyModel[6].setRotationPoint(72.5F, 3F, -0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[7].setRotationPoint(74.5F, 3F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // box
		bodyModel[8].setRotationPoint(72.5F, 3F, 0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // box
		bodyModel[9].setRotationPoint(73.5F, 3F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-70.75F, 1.5F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 131, 1, 22, 0F); // Box 11
		bodyModel[11].setRotationPoint(-65.5F, -0.5F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 92, 21, 14, 0F); // Box 11
		bodyModel[12].setRotationPoint(-25.5F, -21.5F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[13].setRotationPoint(-71.75F, 2F, -1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 11
		bodyModel[14].setRotationPoint(-70.75F, 7.5F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		bodyModel[15].setRotationPoint(-72.75F, -0.5F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 11
		bodyModel[16].setRotationPoint(-73.75F, -0.5F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[17].setRotationPoint(-73.75F, -0.5F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 11
		bodyModel[18].setRotationPoint(-70.5F, -0.5F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[19].setRotationPoint(-70.75F, 6.5F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[20].setRotationPoint(-70.5F, 4.5F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[21].setRotationPoint(-70.5F, 7F, 9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[22].setRotationPoint(-70.5F, 3.5F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[23].setRotationPoint(-70.5F, 6F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[24].setRotationPoint(-67.5F, 4.5F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[25].setRotationPoint(-70.5F, 4.5F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[26].setRotationPoint(-70.5F, 7F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[27].setRotationPoint(-70.5F, 3.5F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[28].setRotationPoint(-70.5F, 6F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.75F, 0F, -2F); // Box 11
		bodyModel[29].setRotationPoint(-67.5F, 4.5F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[30].setRotationPoint(70.75F, 2F, -1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, 0F, -1F); // Box 11
		bodyModel[31].setRotationPoint(69.75F, 7.5F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 11
		bodyModel[32].setRotationPoint(65.5F, -0.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[33].setRotationPoint(69.75F, 6.5F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 11
		bodyModel[34].setRotationPoint(65.5F, 4.5F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 11
		bodyModel[35].setRotationPoint(65.5F, 7F, -11F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[36].setRotationPoint(66.5F, 3.5F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[37].setRotationPoint(66.5F, 6F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, -2F, 0F, 0F, -2F); // Box 11
		bodyModel[38].setRotationPoint(65.5F, 4.5F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[39].setRotationPoint(65.5F, 4.5F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[40].setRotationPoint(65.5F, 7F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[41].setRotationPoint(66.5F, 3.5F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[42].setRotationPoint(66.5F, 6F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.75F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[43].setRotationPoint(65.5F, 4.5F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 135, 2, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[44].setRotationPoint(-67.5F, 0.75F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[45].setRotationPoint(66.5F, -21.5F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[46].setRotationPoint(66.5F, -21.5F, -7F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 11
		bodyModel[47].setRotationPoint(-42.5F, -4.5F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 16, 14, 0F); // Box 11
		bodyModel[48].setRotationPoint(-42.5F, -20.5F, -7F);

		bodyModel[49].addBox(0F, 0F, 0F, 10, 4, 20, 0F); // Box 11
		bodyModel[49].setRotationPoint(-52.5F, -4.5F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[50].setRotationPoint(67.5F, -22F, -0.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 79, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[51].setRotationPoint(-41.5F, -2.5F, -11F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[52].setRotationPoint(-48F, 0.5F, -11F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 132
		bodyModel[53].setRotationPoint(-47.5F, 2F, -1F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 132
		bodyModel[54].setRotationPoint(45F, 0.5F, -11F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 132
		bodyModel[55].setRotationPoint(45.5F, 2F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[56].setRotationPoint(-41.5F, -4.5F, 10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[57].setRotationPoint(-39.5F, -4.5F, 10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[58].setRotationPoint(-24.5F, -21.2F, -7.6F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 180
		bodyModel[59].setRotationPoint(35.5F, -22.75F, -4.5F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[60].setRotationPoint(38.5F, -22.75F, -1.5F);

		bodyModel[61].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[61].setRotationPoint(32.5F, -22.75F, -1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[62].setRotationPoint(38.5F, -22.75F, 1.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 180
		bodyModel[63].setRotationPoint(32.5F, -22.75F, 1.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[64].setRotationPoint(38.5F, -22.75F, -4.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[65].setRotationPoint(32.5F, -22.75F, -4.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 180
		bodyModel[66].setRotationPoint(57.5F, -22.75F, -4.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[67].setRotationPoint(60.5F, -22.75F, -1.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[68].setRotationPoint(54.5F, -22.75F, -1.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[69].setRotationPoint(60.5F, -22.75F, 1.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 180
		bodyModel[70].setRotationPoint(54.5F, -22.75F, 1.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[71].setRotationPoint(60.5F, -22.75F, -4.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[72].setRotationPoint(54.5F, -22.75F, -4.5F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 180
		bodyModel[73].setRotationPoint(46.5F, -22.75F, -4.5F);

		bodyModel[74].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[74].setRotationPoint(49.5F, -22.75F, -1.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[75].setRotationPoint(43.5F, -22.75F, -1.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[76].setRotationPoint(49.5F, -22.75F, 1.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 180
		bodyModel[77].setRotationPoint(43.5F, -22.75F, 1.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[78].setRotationPoint(49.5F, -22.75F, -4.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[79].setRotationPoint(43.5F, -22.75F, -4.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 5, 6, 2, 0F); // Box 11
		bodyModel[80].setRotationPoint(-40.5F, -8.5F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[81].setRotationPoint(-22.5F, -7.5F, 11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[82].setRotationPoint(-36.5F, -7.5F, 11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 103, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[83].setRotationPoint(-37.5F, -8.5F, 10.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[84].setRotationPoint(-42.5F, -12.5F, 10.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[85].setRotationPoint(-40.5F, -12.5F, 10.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[86].setRotationPoint(-30.5F, -7.5F, 11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[87].setRotationPoint(-14.5F, -7.5F, 11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[88].setRotationPoint(-6.5F, -7.5F, 11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[89].setRotationPoint(1.5F, -7.5F, 11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[90].setRotationPoint(9.5F, -7.5F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[91].setRotationPoint(17.5F, -7.5F, 11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[92].setRotationPoint(25.5F, -7.5F, 11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[93].setRotationPoint(33.5F, -7.5F, 11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[94].setRotationPoint(41.5F, -7.5F, 11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[95].setRotationPoint(49.5F, -7.5F, 11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[96].setRotationPoint(56.5F, -7.5F, 11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[97].setRotationPoint(65.01F, -1.5F, 10.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[98].setRotationPoint(65F, -7.5F, 9.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.51F, 0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, 0.5F, -0.51F, 0F, 0.5F); // Box 52
		bodyModel[99].setRotationPoint(65F, -6.5F, 9.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[100].setRotationPoint(65F, -8.5F, 9.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[101].setRotationPoint(-20.5F, -11.5F, -12F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[102].setRotationPoint(-36.5F, -9.5F, -12F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[103].setRotationPoint(-36.5F, -10.5F, -11.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 145
		bodyModel[104].setRotationPoint(-41.5F, -12.5F, -11.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[105].setRotationPoint(-39.5F, -12.5F, -11.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[106].setRotationPoint(-28.5F, -9.5F, -12F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[107].setRotationPoint(-12.5F, -11.5F, -12F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[108].setRotationPoint(-4.5F, -9.5F, -12F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[109].setRotationPoint(3.5F, -9.5F, -12F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[110].setRotationPoint(11.5F, -9.5F, -12F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[111].setRotationPoint(19.5F, -9.5F, -12F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[112].setRotationPoint(27.5F, -9.5F, -12F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[113].setRotationPoint(40.5F, -7.5F, -12F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[114].setRotationPoint(48.5F, -7.5F, -12F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[115].setRotationPoint(56.5F, -7.5F, -12F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[116].setRotationPoint(63.5F, -7.5F, -12F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[117].setRotationPoint(65.01F, -1.5F, -11.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[118].setRotationPoint(65F, -7.5F, -10.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.51F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.01F, 0F, -1F, -0.51F, 0F, -1F); // Box 52
		bodyModel[119].setRotationPoint(65F, -6.5F, -10.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[120].setRotationPoint(65F, -8.5F, -11.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[121].setRotationPoint(39.5F, -8.5F, -11.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[122].setRotationPoint(36.5F, -10.5F, -11.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[123].setRotationPoint(-66.01F, -1.5F, -11.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 1F, 0.25F, 0F, 1F, 0.01F, 0F, 0.5F, -0.51F, 0F, 0.5F, -0.51F, 0F, -1F, 0.01F, 0F, -1F); // Box 52
		bodyModel[124].setRotationPoint(-66F, -7.5F, -10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[125].setRotationPoint(-66.01F, -1.5F, 10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[126].setRotationPoint(-73.25F, -7.5F, -3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -1.35F, 0F, -0.6F, -1.35F, 0F, -0.6F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.65F, 0F, -0.6F, 0.65F, 0F); // Box 52
		bodyModel[127].setRotationPoint(-73.25F, -8.5F, -2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[128].setRotationPoint(-72.25F, -7.5F, 8F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[129].setRotationPoint(-73.25F, -7.5F, 2F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, -1.35F, 0F, -0.1F, -1.35F, 0F, -0.1F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0.65F, 0F, -0.1F, 0.65F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 52
		bodyModel[130].setRotationPoint(-73.25F, -8.5F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,-0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.75F, -0.4F, -0.1F); // Box 11
		bodyModel[131].setRotationPoint(-69.5F, -15F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Nose_Top-Top
		bodyModel[132].setRotationPoint(-69.65F, -15F, -1F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Nose_Top-Bottom
		bodyModel[133].setRotationPoint(-69.65F, -13.3F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[134].setRotationPoint(-70.75F, -0.5F, -9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[135].setRotationPoint(69.75F, 1.5F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[136].setRotationPoint(69.75F, -0.5F, -9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[137].setRotationPoint(70F, -1.5F, 10F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[138].setRotationPoint(70F, -1.5F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[139].setRotationPoint(-71F, -1.5F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[140].setRotationPoint(-71F, -1.5F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 128
		bodyModel[141].setRotationPoint(67.6F, -18.5F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 4.6F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // blanked_marker
		bodyModel[142].setRotationPoint(68.75F, -20.5F, 0F);
		bodyModel[142].rotateAngleY = 0.41887902F;

		bodyModel[143].addShapeBox(0F, 0F, -6.6F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // blanked_marker
		bodyModel[143].setRotationPoint(68.75F, -20.5F, 0F);
		bodyModel[143].rotateAngleY = -0.41887902F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Light_Rear_Right
		bodyModel[144].setRotationPoint(69.6F, -18.5F, -0.1F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Light_Rear_Left
		bodyModel[145].setRotationPoint(69.6F, -18.5F, -1.9F);

		bodyModel[146].addBox(0F, 0F, -5.9F, 1, 2, 5, 0F); // Numberboard_Left_Rear
		bodyModel[146].setRotationPoint(68.5F, -16.25F, 0F);
		bodyModel[146].rotateAngleY = -0.40142573F;

		bodyModel[147].addBox(0F, 0F, 0.9F, 1, 2, 5, 0F); // Numberboard_Right_Rear
		bodyModel[147].setRotationPoint(68.5F, -16.25F, 0F);
		bodyModel[147].rotateAngleY = 0.40142573F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[148].setRotationPoint(-71F, 2.5F, 4F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[149].setRotationPoint(-71F, 2.5F, -7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // box
		bodyModel[150].setRotationPoint(70F, 2.5F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // box
		bodyModel[151].setRotationPoint(71F, 2.7F, -6.88F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // box
		bodyModel[152].setRotationPoint(70.5F, 2.7F, -6.88F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // box
		bodyModel[153].setRotationPoint(70F, 2.5F, 4F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // box
		bodyModel[154].setRotationPoint(70.5F, 2.7F, 4.12F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3.25F, 0F, 0F); // Box 11
		bodyModel[155].setRotationPoint(-70.65F, 6F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 0.75F, 0F, -1F, -1.5F, 0F, -1F, -4.25F, 0F, 0F, 3.5F, 0F, 0F); // Box 11
		bodyModel[156].setRotationPoint(-70.9F, 7F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, -1.75F, 0F, 0F, -2.85F, 0F, 0F, 2.08F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -2.1F, 0F, 0F, 1.33F, 0F, 0F); // Box 11
		bodyModel[157].setRotationPoint(-70.4F, 4F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1.75F, 0F, 0F, -2.04F, 0F, 0F, 1.28F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1.28F, 0F, 0F, 0.53F, 0F, 0F); // Box 11
		bodyModel[158].setRotationPoint(-72.3F, 4F, -4F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F); // box
		bodyModel[159].setRotationPoint(-71F, 2.7F, -7.12F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F); // box
		bodyModel[160].setRotationPoint(-72F, 3.7F, -7.12F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, 0F, 0.5F, 0F, 0F); // box
		bodyModel[161].setRotationPoint(-72.5F, 6.7F, -7.12F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,3F, 0F, 0F, -3.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 3.25F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[162].setRotationPoint(-70.65F, 6F, 0F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.75F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 3.5F, 0F, 0F, -4.25F, 0F, 0F, -1.5F, 0F, -1F, 0.75F, 0F, -1F); // Box 11
		bodyModel[163].setRotationPoint(-70.9F, 7F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,2.08F, 0F, 0F, -2.85F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 1.33F, 0F, 0F, -2.1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[164].setRotationPoint(-70.4F, 4F, 7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1.28F, 0F, 0F, -2.04F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 0.53F, 0F, 0F, -1.28F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[165].setRotationPoint(-72.3F, 4F, 3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.25F, 1F, 0F, -0.25F); // box
		bodyModel[166].setRotationPoint(-71F, 2.7F, 4.12F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // box
		bodyModel[167].setRotationPoint(-72F, 3.7F, 4.12F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // box
		bodyModel[168].setRotationPoint(-72.5F, 6.7F, 4.12F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1.25F, 0F, -1F, -1.25F); // box
		bodyModel[169].setRotationPoint(-51.5F, -19.5F, -12F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1.25F, -2F, -1F, -1.25F); // box
		bodyModel[170].setRotationPoint(-53.5F, -19.5F, -12F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, -2F, -1F, 0.5F, -2F, -1F, -1.25F, 0F, -1F, -1.25F); // box
		bodyModel[171].setRotationPoint(-47.5F, -19.5F, -12F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // box
		bodyModel[172].setRotationPoint(-51.5F, -19.5F, 11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0.5F, -2F, -1F, 0.5F); // box
		bodyModel[173].setRotationPoint(-53.5F, -19.5F, 11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, -2F, -1F, -1.25F, -2F, -1F, 0.5F, 0F, -1F, 0.5F); // box
		bodyModel[174].setRotationPoint(-47.5F, -19.5F, 11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Left_Top_csx
		bodyModel[175].setRotationPoint(-72.6F, -2.9F, -6.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // box
		bodyModel[176].setRotationPoint(-71.75F, -2.5F, -6.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Right_Top_csx
		bodyModel[177].setRotationPoint(-72.6F, -2.9F, 4.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // box
		bodyModel[178].setRotationPoint(-71.75F, -2.5F, 4.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Right_Bottom_ns
		bodyModel[179].setRotationPoint(-72.05F, 0.5F, 5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // box
		bodyModel[180].setRotationPoint(-71.3F, 1F, 5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Left_Bottom_ns
		bodyModel[181].setRotationPoint(-72.05F, 0.5F, -7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // box
		bodyModel[182].setRotationPoint(-71.3F, 1F, -7F);

		bodyModel[183].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[183].setRotationPoint(67.35F, -17.5F, -5F);
		bodyModel[183].rotateAngleY = -0.40142573F;

		bodyModel[184].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[184].setRotationPoint(67.35F, -20.75F, -5F);
		bodyModel[184].rotateAngleY = -0.40142573F;

		bodyModel[185].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[185].setRotationPoint(67.35F, -14.25F, -5F);
		bodyModel[185].rotateAngleY = -0.40142573F;

		bodyModel[186].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[186].setRotationPoint(67.35F, -11F, -5F);
		bodyModel[186].rotateAngleY = -0.40142573F;

		bodyModel[187].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[187].setRotationPoint(67.35F, -7.75F, -5F);
		bodyModel[187].rotateAngleY = -0.40142573F;

		bodyModel[188].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[188].setRotationPoint(67.35F, -4.5F, -5F);
		bodyModel[188].rotateAngleY = -0.40142573F;

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[189].setRotationPoint(-71.25F, 1.5F, -8.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[190].setRotationPoint(-71.25F, 1.5F, 2.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[191].setRotationPoint(70.75F, 1.5F, -8.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[192].setRotationPoint(70.75F, 1.5F, 2.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1F, 0F, 0F, -1.75F, 0F, 0F, -4F, -0.5F, 0F, 3.25F, -0.5F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -3.19F, 0F, 0F, 2.43F, 0F, 0F); // Box 11
		bodyModel[193].setRotationPoint(-71.15F, 3F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,3.25F, -0.5F, 0F, -3.9F, -0.5F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 2.43F, 0F, 0F, -3.19F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[194].setRotationPoint(-71.15F, 3F, 3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // box
		bodyModel[195].setRotationPoint(71F, 2.7F, 4.12F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[196].setRotationPoint(-24.5F, 1.5F, 7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[197].setRotationPoint(-24.5F, 1.5F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[198].setRotationPoint(-7.5F, 0.5F, 9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[199].setRotationPoint(-7.5F, 0.5F, 10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[200].setRotationPoint(-7.5F, 1.5F, 9F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1
		bodyModel[201].setRotationPoint(-7.5F, 1.5F, 10F);

		bodyModel[202].addBox(0F, 0F, -2F, 1, 1, 3, 0F); // Box 84
		bodyModel[202].setRotationPoint(-22F, 1.5F, 9.5F);
		bodyModel[202].rotateAngleX = 0.52359878F;

		bodyModel[203].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 84
		bodyModel[203].setRotationPoint(-22F, 1.5F, -9.5F);
		bodyModel[203].rotateAngleX = -0.52359878F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[204].setRotationPoint(-7.5F, 0.5F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[205].setRotationPoint(-7.5F, 0.5F, -10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[206].setRotationPoint(-7.5F, 1.5F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1
		bodyModel[207].setRotationPoint(-7.5F, 1.5F, -10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Bell
		bodyModel[208].setRotationPoint(-27.32F, 0.75F, -10.98F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[209].setRotationPoint(-26.42F, 0.5F, -10.88F);

		bodyModel[210].addBox(0F, 0F, 0F, 48, 3, 22, 0F); // Box 68
		bodyModel[210].setRotationPoint(-24.5F, 2.5F, -11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 48, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 68
		bodyModel[211].setRotationPoint(-24.5F, 5.5F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 180
		bodyModel[212].setRotationPoint(-22.5F, -22.5F, -4F);

		bodyModel[213].addShapeBox(0F, 0F, -3.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[213].setRotationPoint(67.35F, -7.75F, 5F);
		bodyModel[213].rotateAngleY = 0.40142573F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[214].setRotationPoint(-41.5F, -2.75F, 6.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[215].setRotationPoint(-41.5F, -4.25F, 6.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 122
		bodyModel[216].setRotationPoint(55.5F, -9.5F, 6.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[217].setRotationPoint(54.5F, -10.5F, 6.6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 52
		bodyModel[218].setRotationPoint(-71F, -7.5F, -10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 52
		bodyModel[219].setRotationPoint(-71F, -7.5F, 9F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[220].setRotationPoint(-72.5F, -8.5F, 7.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[221].setRotationPoint(-72.25F, -7.5F, -9F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[222].setRotationPoint(-73F, -8.5F, 2.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[223].setRotationPoint(-72.5F, -8.5F, -8.5F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[224].setRotationPoint(46F, 1.5F, -11F);

		bodyModel[225].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[225].setRotationPoint(46F, 1.5F, 10F);

		bodyModel[226].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[226].setRotationPoint(-47F, 1.5F, -11F);

		bodyModel[227].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[227].setRotationPoint(-47F, 1.5F, 10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[228].setRotationPoint(34.5F, -9.5F, -12F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[229].setRotationPoint(63.5F, -7.5F, 11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[230].setRotationPoint(30.5F, -20.5F, -7.6F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[231].setRotationPoint(48.5F, -20.5F, -7.6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[232].setRotationPoint(-24.5F, -21.2F, 6.6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[233].setRotationPoint(30.5F, -20.5F, 6.6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[234].setRotationPoint(48.5F, -20.5F, 6.6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[235].setRotationPoint(70.75F, -0.5F, -9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[236].setRotationPoint(72.75F, -0.5F, -9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[237].setRotationPoint(72.75F, -0.5F, 0F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[238].setRotationPoint(72.25F, -7.5F, 2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -1.35F, 0F, -0.6F, -1.35F, 0F, -0.6F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 0.65F, 0F, -0.6F, 0.65F, 0F, -0.6F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 52
		bodyModel[239].setRotationPoint(72.25F, -8.5F, 0F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[240].setRotationPoint(71.25F, -7.5F, -9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[241].setRotationPoint(72.25F, -7.5F, -3F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -1.35F, 0F, -0.1F, -1.35F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, 0.65F, 0F, -0.1F, 0.65F, 0F); // Box 52
		bodyModel[242].setRotationPoint(72.25F, -8.5F, -2F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 52
		bodyModel[243].setRotationPoint(72F, -8.5F, -8.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 52
		bodyModel[244].setRotationPoint(70F, -7.5F, 9F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 52
		bodyModel[245].setRotationPoint(70F, -7.5F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[246].setRotationPoint(71.25F, -7.5F, 8F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[247].setRotationPoint(72F, -8.5F, 2.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[248].setRotationPoint(-18.5F, -15.5F, -8F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 7, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[249].setRotationPoint(-18.5F, -14.5F, -8F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[250].setRotationPoint(-18.5F, -14.5F, -10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[251].setRotationPoint(-18.5F, -5.5F, -11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[252].setRotationPoint(-18.5F, -7.5F, -10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[253].setRotationPoint(-17.5F, -4.5F, -11F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[254].setRotationPoint(-12.5F, -4.5F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[255].setRotationPoint(-15F, -4.5F, -11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 14, 0, 2, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1.33F, 0F, 0F, -1.33F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1.33F, 0F, 0F, -1.33F); // Box 11
		bodyModel[256].setRotationPoint(-18.5F, -4.5F, -11F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[257].setRotationPoint(-20.5F, -12.5F, -11.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F); // Box 145
		bodyModel[258].setRotationPoint(-10.5F, -10.5F, -11.5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[259].setRotationPoint(-22.5F, -10.5F, -11.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[260].setRotationPoint(-8.5F, -10.5F, -11.5F);

		bodyModel[261].addBox(0F, 0F, 0F, 4, 21, 14, 0F); // Box 11
		bodyModel[261].setRotationPoint(-41.5F, -21.5F, -7F);

		bodyModel[262].addBox(0F, 0F, 0F, 12, 4, 14, 0F); // Box 11
		bodyModel[262].setRotationPoint(-37.5F, -21.5F, -7F);

		bodyModel[263].addBox(0F, 0F, 0F, 12, 13, 14, 0F); // Box 11
		bodyModel[263].setRotationPoint(-37.5F, -13.5F, -7F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 24, 4, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[264].setRotationPoint(-37.5F, -17.5F, -7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 24, 4, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[265].setRotationPoint(-37.5F, -17.5F, 7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[266].setRotationPoint(-33.5F, -16.5F, -2F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[267].setRotationPoint(-29.5F, -15.5F, -2F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[268].setRotationPoint(-34.5F, -17.5F, -3F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[269].setRotationPoint(-37.5F, -15.5F, -2F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[270].setRotationPoint(-33.5F, -15.5F, -6F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[271].setRotationPoint(-33.5F, -15.5F, 2F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[272].setRotationPoint(-29.5F, -15.5F, -6F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[273].setRotationPoint(-37.5F, -15.5F, -6F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[274].setRotationPoint(-29.5F, -15.5F, 2F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[275].setRotationPoint(-37.5F, -15.5F, 2F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 11
		bodyModel[276].setRotationPoint(-9.5F, -22.5F, -7F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 11
		bodyModel[277].setRotationPoint(-4.5F, -22.5F, -7F);

		bodyModel[278].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 11
		bodyModel[278].setRotationPoint(-8.5F, -22.5F, -7F);

		bodyModel[279].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 11
		bodyModel[279].setRotationPoint(-8.5F, -22.5F, 5F);

		bodyModel[280].addBox(0F, 0F, 0F, 4, 0, 10, 0F); // Box 11
		bodyModel[280].setRotationPoint(-8.5F, -22.5F, -5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3.25F, 0F, 0F); // Box 11
		bodyModel[281].setRotationPoint(-70.65F, 6F, -11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 0.75F, 0F, -1F, -1.5F, 0F, -1F, -4.25F, 0F, 0F, 3.5F, 0F, 0F); // Box 11
		bodyModel[282].setRotationPoint(-70.9F, 8F, -10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,3F, 0F, 0F, -3.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 3.25F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[283].setRotationPoint(-70.65F, 6F, 0F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,3F, 0F, 0F, -3.75F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 3.5F, 0F, 0F, -4.25F, 0F, 0F, -1.5F, 0F, -1F, 0.75F, 0F, -1F); // Box 11
		bodyModel[284].setRotationPoint(-70.9F, 8F, 0F);

		bodyModel[285].addShapeBox(0F, 0F, 4.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Right_Front_CR
		bodyModel[285].setRotationPoint(-66.4F, -13.5F, 2.5F);

		bodyModel[286].addShapeBox(0F, 0F, -6.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Left_Front_CR
		bodyModel[286].setRotationPoint(-66.4F, -13.5F, -2.5F);

		bodyModel[287].addShapeBox(0F, 0F, 4.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Right_Rear_CR
		bodyModel[287].setRotationPoint(66.5F, -14F, 0F);

		bodyModel[288].addShapeBox(0F, 0F, -6.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Left_Rear_CR
		bodyModel[288].setRotationPoint(66.5F, -14F, 0F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 52
		bodyModel[289].setRotationPoint(-73F, -8.5F, -8.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[290].setRotationPoint(70.5F, -8.5F, -8.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[291].setRotationPoint(70.5F, -8.5F, 7.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // box
		bodyModel[292].setRotationPoint(-72F, 2.7F, 3.88F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[293].setRotationPoint(-71.5F, 2.7F, 3.88F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // box
		bodyModel[294].setRotationPoint(-72F, 2.7F, -7.12F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[295].setRotationPoint(-71.5F, 2.7F, -7.12F);

		bodyModel[296].addBox(0F, 0F, 0F, 13, 1, 13, 0F); // Box 180
		bodyModel[296].setRotationPoint(-38F, -22F, -6.5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // box
		bodyModel[297].setRotationPoint(-73.1F, -2.9F, 2.75F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // box
		bodyModel[298].setRotationPoint(-72.25F, -2.5F, 2.75F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Left_Top_sp
		bodyModel[299].setRotationPoint(-73.1F, -2.9F, -4.75F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // box
		bodyModel[300].setRotationPoint(-72.25F, -2.5F, -4.75F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // Ditchlight_Right_Top_sp
		bodyModel[301].setRotationPoint(-73F, -2.9F, 2.75F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // box
		bodyModel[302].setRotationPoint(-73F, -2.9F, -4.75F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // box
		bodyModel[303].setRotationPoint(-72.5F, -2.9F, -6.75F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // Ditchlight_Right_Top_sp
		bodyModel[304].setRotationPoint(-72.5F, -2.9F, 4.75F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -5F, 0F); // Box 11
		bodyModel[305].setRotationPoint(-67.5F, -0.5F, -11F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[306].setRotationPoint(-70.5F, -0.5F, -8F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[307].setRotationPoint(-70.5F, -0.5F, 7F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.88F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.88F, -0.5F, 0F); // Box 11
		bodyModel[308].setRotationPoint(68.5F, -0.5F, 7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.88F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.88F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[309].setRotationPoint(68.5F, -0.5F, -8F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[310].setRotationPoint(-67.5F, -0.5F, -11F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[311].setRotationPoint(-67.5F, -0.5F, 7F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[312].setRotationPoint(-67.5F, -0.5F, 7F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F); // Box 11
		bodyModel[313].setRotationPoint(65.5F, -0.5F, -11F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, -5F, 0F, -2F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[314].setRotationPoint(65.5F, -0.5F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[315].setRotationPoint(65.5F, -0.5F, 7F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[316].setRotationPoint(65.5F, -0.5F, 7F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[317].setRotationPoint(67F, -0.52F, -9F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[318].setRotationPoint(67F, -0.52F, 7F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.7F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[319].setRotationPoint(-70.5F, 2F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[320].setRotationPoint(-70.5F, 1F, -7F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[321].setRotationPoint(-70.5F, 2F, 7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[322].setRotationPoint(-70.5F, 1F, 7F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[323].setRotationPoint(66.5F, 2F, 7F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[324].setRotationPoint(67.5F, 1F, 7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.7F, -0.5F, 0F); // Box 11
		bodyModel[325].setRotationPoint(66.5F, 2F, -9F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[326].setRotationPoint(67.5F, 1F, -7F);

		bodyModel[327].addBox(0F, 0F, 0F, 14, 19, 1, 0F); // Box 11
		bodyModel[327].setRotationPoint(-55.5F, -19.5F, -11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[328].setRotationPoint(-55.5F, -21.5F, -11F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 11
		bodyModel[329].setRotationPoint(-65.5F, -11.5F, -11F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[330].setRotationPoint(-68.5F, -10.5F, -10F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 11
		bodyModel[331].setRotationPoint(-65.5F, -13.5F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 2F, 2F, 1F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[332].setRotationPoint(-65.5F, -15.5F, -9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[333].setRotationPoint(-65.5F, -15.5F, -4F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1.2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F); // Box 11
		bodyModel[334].setRotationPoint(-68.4F, -13.5F, -10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 11
		bodyModel[335].setRotationPoint(-68.5F, -15.5F, -9F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,-1.9F, 0F, -2.5F, 1.9F, 0F, -2.5F, 0.9F, 0F, 0F, -0.9F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0.9F, 0F, 0F, -0.9F, 0F, 0F); // Box 11
		bodyModel[336].setRotationPoint(-68.51F, -14.5F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F); // Box 11
		bodyModel[337].setRotationPoint(-68.5F, -11.5F, -10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F); // Box 11
		bodyModel[338].setRotationPoint(-68.5F, -15.5F, -4F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 11
		bodyModel[339].setRotationPoint(-68.5F, -15.5F, -1F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.15F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[340].setRotationPoint(-68.5F, -11.5F, -1F);

		bodyModel[341].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 11
		bodyModel[341].setRotationPoint(-59.5F, -11.5F, -11F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 11
		bodyModel[342].setRotationPoint(-56.5F, -21.5F, -11F);

		bodyModel[343].addBox(0F, 0F, 0F, 16, 1, 14, 0F); // Box 11
		bodyModel[343].setRotationPoint(-57.5F, -21.5F, -7F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[344].setRotationPoint(-59.5F, -21.5F, -7F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[345].setRotationPoint(-58.5F, -19.5F, -11F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3.7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 11
		bodyModel[346].setRotationPoint(-59.5F, -19.5F, -11F);

		bodyModel[347].addBox(0F, 0F, 0F, 14, 19, 1, 0F); // Box 11
		bodyModel[347].setRotationPoint(-55.5F, -19.5F, 10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[348].setRotationPoint(-58.5F, -19.5F, 10F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-3.7F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[349].setRotationPoint(-59.5F, -19.5F, 10F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[350].setRotationPoint(-65.5F, -15.5F, 0F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 11
		bodyModel[351].setRotationPoint(-68.5F, -15.5F, 1F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, -0.5F, 0F); // Box 11
		bodyModel[352].setRotationPoint(-68.5F, -15.5F, 0F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 11
		bodyModel[353].setRotationPoint(-68.5F, -10.5F, 0F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 11
		bodyModel[354].setRotationPoint(-68.5F, -11.5F, 1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F); // Box 11
		bodyModel[355].setRotationPoint(-68.5F, -11.5F, 0F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 6, 11, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 11
		bodyModel[356].setRotationPoint(-65.5F, -11.5F, 10F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,-1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 11
		bodyModel[357].setRotationPoint(-65.5F, -13.5F, 10F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 2F, 1F, -1F, 2F, 0F); // Box 11
		bodyModel[358].setRotationPoint(-65.5F, -15.5F, 4F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 11
		bodyModel[359].setRotationPoint(-68.5F, -13.5F, 4F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 11
		bodyModel[360].setRotationPoint(-68.5F, -15.5F, 4F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,-0.9F, 0F, 0F, 0.9F, 0F, 0F, 1.9F, 0F, -2.5F, -1.9F, 0F, -2.5F, -0.9F, 0F, 0F, 0.9F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Box 11
		bodyModel[361].setRotationPoint(-68.51F, -14.5F, 4F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 11
		bodyModel[362].setRotationPoint(-55.5F, -21.5F, 7F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[363].setRotationPoint(-56.5F, -21.5F, 7F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 11
		bodyModel[364].setRotationPoint(-59.5F, -21.5F, 0F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 11
		bodyModel[365].setRotationPoint(-68.8F, -14.75F, -1F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,0.375F, 0F, 0F, -0.375F, 0F, 0F, -3.875F, 0F, 0F, 3.875F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 11
		bodyModel[366].setRotationPoint(-56.5F, -18.5F, -11F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -3.7F, -0.5F, 0F, 3.7F, -0.5F, 0F); // Box 11
		bodyModel[367].setRotationPoint(-56.5F, -19.5F, -11F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 3.5F, 0F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -3.7F, -0.5F, 0F, 3.7F, -0.5F, 0F); // Box 11
		bodyModel[368].setRotationPoint(-56.68F, -19F, -11F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 7, 11, 0F,3.875F, 0F, 0F, -3.875F, 0F, 0F, -0.375F, 0F, 0F, 0.375F, 0F, 0F, 6.5F, 0F, 0F, -6.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 11
		bodyModel[369].setRotationPoint(-56.5F, -18.5F, 0F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.7F, -0.5F, 0F, -3.7F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 11
		bodyModel[370].setRotationPoint(-56.5F, -19.5F, 0F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.7F, -0.5F, 0F, -3.7F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 11
		bodyModel[371].setRotationPoint(-56.68F, -19F, 0F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 14, 4, 0F); // Box 11
		bodyModel[372].setRotationPoint(-67.4F, -14.5F, -5F);
		bodyModel[372].rotateAngleY = 0.34906585F;

		bodyModel[373].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[373].setRotationPoint(-68.5F, -14.5F, -1F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 11
		bodyModel[374].setRotationPoint(-68.5F, -15F, -1F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, -0.5F, 0F); // Box 11
		bodyModel[375].setRotationPoint(-68.5F, -15F, 0F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.15F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.15F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 11
		bodyModel[376].setRotationPoint(-68.5F, -12F, -1F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.15F, -0.5F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, -0.25F, 0F); // Box 11
		bodyModel[377].setRotationPoint(-68.5F, -12F, 0F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-2.17F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -1.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 11
		bodyModel[378].setRotationPoint(-68.5F, -13.5F, -7F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, 0F); // Box 11
		bodyModel[379].setRotationPoint(-66.5F, -13.5F, -10F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.9F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 11
		bodyModel[380].setRotationPoint(-68.5F, -13.5F, -10F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.31F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 1.03F, -0.75F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.05F, 0F, 0F); // Box 11
		bodyModel[381].setRotationPoint(-65.5F, -12.5F, -9F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.83F, 0F, 0F, 0.04F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.85F, -0.75F, 0F); // Box 11
		bodyModel[382].setRotationPoint(-65.5F, -13.5F, -9F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.03F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0.13F, -0.25F, -0.75F, 0.26F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0.34F, -0.25F, -0.75F); // Box 11
		bodyModel[383].setRotationPoint(-65.5F, -13.5F, -9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.23F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0.32F, -0.25F, -0.75F, 0.42F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F); // Box 11
		bodyModel[384].setRotationPoint(-66.03F, -13.5F, -7.25F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 11
		bodyModel[385].setRotationPoint(-68.4F, -13.5F, 4F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.17F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.95F, 0F, 0F); // Box 11
		bodyModel[386].setRotationPoint(-68.5F, -13.5F, 4F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[387].setRotationPoint(-66.5F, -13.5F, 9F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,1.05F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.31F, -0.75F, 0F, 1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F); // Box 11
		bodyModel[388].setRotationPoint(-65.5F, -12.5F, 7F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.83F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.85F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.04F, -0.75F, 0F); // Box 11
		bodyModel[389].setRotationPoint(-65.5F, -13.5F, 7F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.13F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0.03F, -0.25F, 0F, 0.39F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0.31F, -0.25F, 0F); // Box 11
		bodyModel[390].setRotationPoint(-65.5F, -13.5F, 8F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.32F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0.23F, -0.25F, 0F, 0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0.42F, -0.25F, 0F); // Box 11
		bodyModel[391].setRotationPoint(-66.03F, -13.5F, 6.25F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 128
		bodyModel[392].setRotationPoint(-60.05F, -21.5F, -2F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Front_Left
		bodyModel[393].setRotationPoint(-61.05F, -21.5F, -1.9F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Front_Right
		bodyModel[394].setRotationPoint(-61.05F, -21.5F, -0.1F);

		bodyModel[395].addShapeBox(-0.15F, 0F, 0.25F, 1, 2, 5, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Numberboard_Left
		bodyModel[395].setRotationPoint(-57.75F, -21.5F, -7F);
		bodyModel[395].rotateAngleY = 0.31415927F;

		bodyModel[396].addShapeBox(-0.15F, 0F, -5.25F, 1, 2, 5, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Numberboard_Right
		bodyModel[396].setRotationPoint(-57.75F, -21.5F, 7F);
		bodyModel[396].rotateAngleY = -0.31415927F;

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[397].setRotationPoint(-40.5F, -9.5F, -12F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 145
		bodyModel[398].setRotationPoint(-41.5F, -10.5F, -11.5F);

		bodyModel[399].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 11
		bodyModel[399].setRotationPoint(-57.5F, -20.5F, 2F);

		bodyModel[400].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 11
		bodyModel[400].setRotationPoint(-59.5F, -15.5F, -2F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[401].setRotationPoint(-59.5F, -15.5F, 2F);

		bodyModel[402].addBox(0F, 0F, 0F, 4, 11, 1, 0F); // Box 11
		bodyModel[402].setRotationPoint(-59.5F, -11.5F, 10F);

		bodyModel[403].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // Box 11
		bodyModel[403].setRotationPoint(-58.5F, -4.5F, -10F);

		bodyModel[404].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // Box 11
		bodyModel[404].setRotationPoint(-58.5F, -4.5F, 2F);

		bodyModel[405].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 11
		bodyModel[405].setRotationPoint(-54.5F, -2.5F, -2F);

		bodyModel[406].addBox(0F, 0F, 0F, 1, 13, 20, 0F); // Box 11
		bodyModel[406].setRotationPoint(-59.5F, -13.5F, -10F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[407].setRotationPoint(-59.5F, -15.5F, -10F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[408].setRotationPoint(-59.5F, -13.5F, -11F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 11
		bodyModel[409].setRotationPoint(-59.5F, -15.5F, 4F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[410].setRotationPoint(-59.5F, -13.5F, 10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,1F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[411].setRotationPoint(-58.5F, -15.5F, 5F);

		bodyModel[412].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 11
		bodyModel[412].setRotationPoint(-48.5F, -8.5F, 6F);

		bodyModel[413].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 11
		bodyModel[413].setRotationPoint(-50.5F, -9.5F, 4F);

		bodyModel[414].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 11
		bodyModel[414].setRotationPoint(-48.5F, -8.5F, -7F);

		bodyModel[415].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 11
		bodyModel[415].setRotationPoint(-50.5F, -9.5F, -9F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 11, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[416].setRotationPoint(-59.5F, -15.5F, -5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 11, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[417].setRotationPoint(-58.5F, -15.5F, -10F);

		bodyModel[418].addBox(0F, 0F, 0F, 6, 8, 1, 0F); // Box 11
		bodyModel[418].setRotationPoint(-57.5F, -12.5F, 2F);

		bodyModel[419].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 11
		bodyModel[419].setRotationPoint(-57.5F, -13.5F, 2F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[420].setRotationPoint(-57.5F, -15.5F, 9F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[421].setRotationPoint(-57.5F, -15.5F, 5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[422].setRotationPoint(-57.5F, -15.5F, 2F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 11
		bodyModel[423].setRotationPoint(-53.5F, -15.5F, 2F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 11
		bodyModel[424].setRotationPoint(-57.5F, -15.5F, 2F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 11
		bodyModel[425].setRotationPoint(-53.5F, -14.5F, 8F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 11
		bodyModel[426].setRotationPoint(-53.5F, -14.5F, 9F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 11
		bodyModel[427].setRotationPoint(-53.5F, -14.5F, 6F);

		bodyModel[428].addBox(0F, 0F, 0F, 4, 8, 4, 0F); // Box 11
		bodyModel[428].setRotationPoint(-57.5F, -12.5F, -6F);

		bodyModel[429].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 11
		bodyModel[429].setRotationPoint(-57.5F, -13.5F, -10F);

		bodyModel[430].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 11
		bodyModel[430].setRotationPoint(-53.5F, -13.5F, -4F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[431].setRotationPoint(-53.5F, -13.5F, -6F);

		bodyModel[432].addBox(0F, 0F, 0F, 1, 15, 3, 0F); // Box 11
		bodyModel[432].setRotationPoint(-42.5F, -19.5F, -10F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[433].setRotationPoint(-42.5F, -20.5F, -10F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[434].setRotationPoint(-35.5F, -4.5F, -9F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.01F, 0F, -1F, -0.51F, 0F, -1F, -0.51F, 0F, 0.5F, 0.01F, 0F, 0.5F); // Box 52
		bodyModel[435].setRotationPoint(-66F, -7.5F, 9.5F);

		bodyModel[436].addBox(-1F, 0.5F, 0F, 1, 2, 1, 0F); // Box 11
		bodyModel[436].setRotationPoint(70.6F, -13F, -0.5F);
		bodyModel[436].rotateAngleZ = -0.87266463F;

		bodyModel[437].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 88
		bodyModel[437].setRotationPoint(3.5F, -22F, -0.5F);

		bodyModel[438].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 91
		bodyModel[438].setRotationPoint(3.5F, -23F, -1.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 95
		bodyModel[439].setRotationPoint(1.5F, -23.5F, -2F);

		bodyModel[440].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[440].setRotationPoint(2.5F, -23F, -1.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F); // Box 95
		bodyModel[441].setRotationPoint(2.5F, -23.5F, 0F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F); // Box 209
		bodyModel[442].setRotationPoint(4.5F, -23.75F, -1F);

		bodyModel[443].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 88
		bodyModel[443].setRotationPoint(28F, -22F, -0.5F);

		bodyModel[444].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 91
		bodyModel[444].setRotationPoint(28F, -23F, -1.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 95
		bodyModel[445].setRotationPoint(26F, -23.5F, -2F);

		bodyModel[446].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[446].setRotationPoint(27F, -23F, -1.5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F); // Box 95
		bodyModel[447].setRotationPoint(27F, -23.5F, 0F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F); // Box 209
		bodyModel[448].setRotationPoint(29F, -23.75F, -1F);

		bodyModel[449].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Exhaust
		bodyModel[449].setRotationPoint(25F, -21.5F, 7F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.6F, 0.15F, -0.6F, -0.6F, 0.15F, -0.6F, -0.6F, 0.15F, -0.6F, -0.6F, 0.15F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, -0.6F, -0.6F, -0.75F, -0.6F); // Exhaust
		bodyModel[450].setRotationPoint(24.5F, -21.75F, 6.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.65F, -1.05F, -0.65F, -0.65F, -1.05F, -0.65F, -0.65F, -1.05F, -0.65F, -0.65F, -1.05F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F, -0.65F, 0F, -0.65F); // BeaconSOO2
		bodyModel[451].setRotationPoint(24.5F, -23.65F, 6.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 95
		bodyModel[452].setRotationPoint(1.5F, -23.5F, 0F);

		bodyModel[453].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[453].setRotationPoint(2.5F, -23F, 0.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[454].setRotationPoint(4.5F, -23.5F, -1F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 13, 0, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[455].setRotationPoint(28.3F, -23.25F, -4.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 14, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[456].setRotationPoint(27.8F, -22.75F, 5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 14, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[457].setRotationPoint(27.8F, -22.75F, -5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 0, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[458].setRotationPoint(41.8F, -22.75F, -5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 14, 0, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 180
		bodyModel[459].setRotationPoint(27.8F, -23.25F, -5.5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 14, 0, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 180
		bodyModel[460].setRotationPoint(27.8F, -23.25F, 4.5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[461].setRotationPoint(41.8F, -23.75F, -5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 0, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[462].setRotationPoint(27.8F, -22.75F, -5F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 0, 1, 10, 0F,-0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[463].setRotationPoint(27.8F, -23.75F, -5F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, 0.15F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F); // Exhaust
		bodyModel[464].setRotationPoint(-51.5F, -21.75F, -1F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.4F, -0.95F, -0.4F, -0.4F, -0.95F, -0.4F, -0.4F, -0.95F, -0.4F, -0.4F, -0.95F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // BeaconSOO2
		bodyModel[465].setRotationPoint(-51.5F, -23.75F, -1F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 210
		bodyModel[466].setRotationPoint(-48.5F, -22.15F, -0.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 145
		bodyModel[467].setRotationPoint(-66.75F, -8.5F, -9F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 145
		bodyModel[468].setRotationPoint(-66.75F, -8.5F, 7F);

		bodyModel[469].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[469].setRotationPoint(-69.25F, -13.5F, 2F);
		bodyModel[469].rotateAngleY = -0.34906585F;

		bodyModel[470].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[470].setRotationPoint(-69.25F, -10F, 2F);
		bodyModel[470].rotateAngleY = -0.34906585F;

		bodyModel[471].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[471].setRotationPoint(-69.25F, -6.5F, 2F);
		bodyModel[471].rotateAngleY = -0.34906585F;

		bodyModel[472].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[472].setRotationPoint(-69.25F, -3F, 2F);
		bodyModel[472].rotateAngleY = -0.34906585F;

		bodyModel[473].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[473].setRotationPoint(-55.5F, -22.5F, -8F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[474].setRotationPoint(-55.5F, -21.5F, -8F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[475].setRotationPoint(-46.5F, -21.5F, -8F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[476].setRotationPoint(-49.5F, -21.5F, -8F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[477].setRotationPoint(-52.5F, -21.5F, -8F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[478].setRotationPoint(-55.5F, -22.5F, 6F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[479].setRotationPoint(-55.5F, -21.5F, 7F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[480].setRotationPoint(-46.5F, -21.5F, 7F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[481].setRotationPoint(-49.5F, -21.5F, 7F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[482].setRotationPoint(-52.5F, -21.5F, 7F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 17, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[483].setRotationPoint(-37.5F, -12.5F, -9F);

		bodyModel[484].addBox(0F, 0F, 0F, 23, 2, 4, 0F); // Box 11
		bodyModel[484].setRotationPoint(-41.5F, -4.5F, -11F);

		bodyModel[485].addBox(0F, 0F, 0F, 30, 2, 0, 0F); // Box 11
		bodyModel[485].setRotationPoint(-41.5F, -6.75F, -11F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F); // Box 11
		bodyModel[486].setRotationPoint(-68.5F, -14.5F, 0F);

		bodyModel[487].addBox(-1F, 0F, -3F, 1, 15, 3, 0F); // Door_Rear
		bodyModel[487].setRotationPoint(-41.5F, -19.5F, 10F);

		bodyModel[488].addShapeBox(-1F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Door_Rear
		bodyModel[488].setRotationPoint(-41.5F, -20.5F, 10F);

		bodyModel[489].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 11
		bodyModel[489].setRotationPoint(-46.5F, -14.5F, 4F);

		bodyModel[490].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 11
		bodyModel[490].setRotationPoint(-46.5F, -14.5F, -9F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[491].setRotationPoint(-57.5F, -20.5F, -7F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[492].setRotationPoint(-57.5F, -20.5F, -2F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[493].setRotationPoint(-39.5F, -12.5F, -11.5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[494].setRotationPoint(-36.5F, -11.5F, -12F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[495].setRotationPoint(-28.5F, -11.5F, -12F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // box
		bodyModel[496].setRotationPoint(-54.5F, -19.5F, 11F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1.25F, 0F, -1F, -1.25F); // box
		bodyModel[497].setRotationPoint(-54.5F, -19.5F, -12F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-0.9F, 0F, 0F, -2.1F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -0.9F, 0F, 0F, -2.1F, 0F, 0F, -0.25F, 1.5F, -0.5F, -2.75F, 1.5F, -0.5F); // Box 11
		bodyModel[498].setRotationPoint(-68.51F, -15.5F, 4F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,-3F, -2F, 0F, 0F, -2F, 0F, -2.1F, 0F, 0F, -0.9F, 0F, 0F, -2.75F, 1.5F, -0.5F, -0.25F, 1.5F, -0.5F, -2.1F, 0F, 0F, -0.9F, 0F, 0F); // Box 11
		bodyModel[499].setRotationPoint(-68.51F, -15.5F, -9F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 457, 343, textureX, textureY); // Box 52
		bodyModel[501] = new ModelRendererTurbo(this, 377, 236, textureX, textureY); // Box 501
		bodyModel[502] = new ModelRendererTurbo(this, 371, 251, textureX, textureY); // Box 502
		bodyModel[503] = new ModelRendererTurbo(this, 372, 247, textureX, textureY); // Box 503
		bodyModel[504] = new ModelRendererTurbo(this, 376, 241, textureX, textureY); // Box 504

		bodyModel[500].addShapeBox(0F, 0F, 0F, 8, 2, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[500].setRotationPoint(-19.75F, -6.5F, -11.51F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.15F, -0.25F, 0F); // Box 501
		bodyModel[501].setRotationPoint(-68.5F, -12.5F, 0F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F); // Box 502
		bodyModel[502].setRotationPoint(-68.5F, -12.5F, -1F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.15F, -0.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F); // Box 503
		bodyModel[503].setRotationPoint(-68.5F, -12.5F, 0F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.15F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 504
		bodyModel[504].setRotationPoint(-68.5F, -12.5F, -1F);
	}
}