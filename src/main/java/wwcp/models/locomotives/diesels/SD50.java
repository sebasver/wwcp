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

public class SD50 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public SD50() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[570];

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
		bodyModel[47] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 11
		bodyModel[48] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 11
		bodyModel[49] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 11
		bodyModel[50] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 11
		bodyModel[51] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Door_Front
		bodyModel[52] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 11
		bodyModel[53] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Door_Front
		bodyModel[54] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 11
		bodyModel[55] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 11
		bodyModel[56] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 11
		bodyModel[57] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 11
		bodyModel[58] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 11
		bodyModel[59] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Door_Rear
		bodyModel[60] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 11
		bodyModel[61] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Door_Rear
		bodyModel[62] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 11
		bodyModel[63] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 11
		bodyModel[64] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 11
		bodyModel[65] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 11
		bodyModel[66] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 11
		bodyModel[67] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 11
		bodyModel[68] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 11
		bodyModel[69] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 11
		bodyModel[70] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 11
		bodyModel[71] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 11
		bodyModel[72] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 11
		bodyModel[73] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 128
		bodyModel[74] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 11
		bodyModel[75] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 132
		bodyModel[76] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 132
		bodyModel[77] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 132
		bodyModel[78] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 132
		bodyModel[79] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 11
		bodyModel[80] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 11
		bodyModel[81] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 149
		bodyModel[82] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 180
		bodyModel[83] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 180
		bodyModel[84] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 180
		bodyModel[85] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 180
		bodyModel[86] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 180
		bodyModel[87] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 180
		bodyModel[88] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 180
		bodyModel[89] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 180
		bodyModel[90] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 180
		bodyModel[91] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 180
		bodyModel[92] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 180
		bodyModel[93] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 180
		bodyModel[94] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 180
		bodyModel[95] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 180
		bodyModel[96] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 180
		bodyModel[97] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 180
		bodyModel[98] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 180
		bodyModel[99] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 180
		bodyModel[100] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 180
		bodyModel[101] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 180
		bodyModel[102] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 180
		bodyModel[103] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 11
		bodyModel[104] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 11
		bodyModel[105] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 52
		bodyModel[106] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 52
		bodyModel[107] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 145
		bodyModel[108] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 145
		bodyModel[109] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 145
		bodyModel[110] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 52
		bodyModel[111] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 52
		bodyModel[112] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 52
		bodyModel[113] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 52
		bodyModel[114] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 52
		bodyModel[115] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 52
		bodyModel[116] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 52
		bodyModel[117] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 52
		bodyModel[118] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 52
		bodyModel[119] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 52
		bodyModel[120] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 52
		bodyModel[121] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 52
		bodyModel[122] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 52
		bodyModel[123] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 52
		bodyModel[124] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 52
		bodyModel[125] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 52
		bodyModel[126] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 52
		bodyModel[127] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 145
		bodyModel[128] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 145
		bodyModel[129] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 145
		bodyModel[130] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 52
		bodyModel[131] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 52
		bodyModel[132] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 52
		bodyModel[133] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 52
		bodyModel[134] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 52
		bodyModel[135] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 52
		bodyModel[136] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 52
		bodyModel[137] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 52
		bodyModel[138] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 52
		bodyModel[139] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 52
		bodyModel[140] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 52
		bodyModel[141] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 52
		bodyModel[142] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 52
		bodyModel[143] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 52
		bodyModel[144] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 52
		bodyModel[145] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 145
		bodyModel[146] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 145
		bodyModel[147] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 52
		bodyModel[148] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Box 145
		bodyModel[149] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 145
		bodyModel[150] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 145
		bodyModel[151] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 52
		bodyModel[152] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 52
		bodyModel[153] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 52
		bodyModel[154] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 52
		bodyModel[155] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 52
		bodyModel[156] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 145
		bodyModel[157] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 52
		bodyModel[158] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 52
		bodyModel[159] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 52
		bodyModel[160] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 52
		bodyModel[161] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 52
		bodyModel[162] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 52
		bodyModel[163] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 52
		bodyModel[164] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 52
		bodyModel[165] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 52
		bodyModel[166] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 11
		bodyModel[167] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Light_Top-Top
		bodyModel[168] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Light_Top-Bottom
		bodyModel[169] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 11
		bodyModel[170] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 11
		bodyModel[171] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 11
		bodyModel[172] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 11
		bodyModel[173] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 11
		bodyModel[174] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Light_Nose_Top-Top
		bodyModel[175] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Light_Nose_Top-Bottom
		bodyModel[176] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 11
		bodyModel[177] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 11
		bodyModel[178] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 11
		bodyModel[179] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Light_Nose_Middle-Top
		bodyModel[180] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Light_Nose_Middle-Bottom
		bodyModel[181] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 11
		bodyModel[182] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 11
		bodyModel[183] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // socket
		bodyModel[184] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // socket
		bodyModel[185] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 11
		bodyModel[186] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 11
		bodyModel[187] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 11
		bodyModel[188] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 11
		bodyModel[189] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 11
		bodyModel[190] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 11
		bodyModel[191] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Box 11
		bodyModel[192] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 52
		bodyModel[193] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 52
		bodyModel[194] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 52
		bodyModel[195] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 52
		bodyModel[196] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Numberboard_Left_Front
		bodyModel[197] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Numberboard_Right_Front
		bodyModel[198] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Marker_Right_Front
		bodyModel[199] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Marker_Left_Front
		bodyModel[200] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 11
		bodyModel[201] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 128
		bodyModel[202] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // blanked_marker
		bodyModel[203] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // blanked_marker
		bodyModel[204] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Light_Rear_Right
		bodyModel[205] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Light_Rear_Left
		bodyModel[206] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Numberboard_Left_Rear
		bodyModel[207] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Numberboard_Right_Rear
		bodyModel[208] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Marker_Right_Rear
		bodyModel[209] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Marker_Left_Rear
		bodyModel[210] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 11
		bodyModel[211] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 11
		bodyModel[212] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 11
		bodyModel[213] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 11
		bodyModel[214] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 11
		bodyModel[215] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 11
		bodyModel[216] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 11
		bodyModel[217] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 11
		bodyModel[218] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 11
		bodyModel[219] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 11
		bodyModel[220] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 11
		bodyModel[221] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 11
		bodyModel[222] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 11
		bodyModel[223] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 11
		bodyModel[224] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 11
		bodyModel[225] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 11
		bodyModel[226] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 11
		bodyModel[227] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 11
		bodyModel[228] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 11
		bodyModel[229] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 11
		bodyModel[230] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 11
		bodyModel[231] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 11
		bodyModel[232] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 11
		bodyModel[233] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 11
		bodyModel[234] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 11
		bodyModel[235] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 11
		bodyModel[236] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 11
		bodyModel[237] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // box
		bodyModel[238] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // box
		bodyModel[239] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // box
		bodyModel[240] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // box
		bodyModel[241] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // box
		bodyModel[242] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // box
		bodyModel[243] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // box
		bodyModel[244] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 11
		bodyModel[245] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 11
		bodyModel[246] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 11
		bodyModel[247] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 11
		bodyModel[248] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // box
		bodyModel[249] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // box
		bodyModel[250] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // box
		bodyModel[251] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 11
		bodyModel[252] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 11
		bodyModel[253] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 11
		bodyModel[254] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 11
		bodyModel[255] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // box
		bodyModel[256] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // box
		bodyModel[257] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // box
		bodyModel[258] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // box
		bodyModel[259] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // box
		bodyModel[260] = new ModelRendererTurbo(this, 9, 121, textureX, textureY); // box
		bodyModel[261] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // box
		bodyModel[262] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // box
		bodyModel[263] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // box
		bodyModel[264] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // box
		bodyModel[265] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // box
		bodyModel[266] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Ditchlight_Right_Bottom_ns
		bodyModel[267] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // box
		bodyModel[268] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Ditchlight_Left_Bottom_ns
		bodyModel[269] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // box
		bodyModel[270] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 145
		bodyModel[271] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 52
		bodyModel[272] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Box 52
		bodyModel[273] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 52
		bodyModel[274] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 52
		bodyModel[275] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Box 52
		bodyModel[276] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 52
		bodyModel[277] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 52
		bodyModel[278] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 52
		bodyModel[279] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 52
		bodyModel[280] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 52
		bodyModel[281] = new ModelRendererTurbo(this, 9, 129, textureX, textureY); // Box 11
		bodyModel[282] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 11
		bodyModel[283] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // box
		bodyModel[284] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // box
		bodyModel[285] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 11
		bodyModel[286] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // box
		bodyModel[287] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 11
		bodyModel[288] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 68
		bodyModel[289] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 68
		bodyModel[290] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 1
		bodyModel[291] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Box 1
		bodyModel[292] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 1
		bodyModel[293] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 1
		bodyModel[294] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 84
		bodyModel[295] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 84
		bodyModel[296] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 1
		bodyModel[297] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 1
		bodyModel[298] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Box 1
		bodyModel[299] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 1
		bodyModel[300] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Bell
		bodyModel[301] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 150
		bodyModel[302] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 68
		bodyModel[303] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 68
		bodyModel[304] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 11
		bodyModel[305] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 11
		bodyModel[306] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 180
		bodyModel[307] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 52
		bodyModel[308] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 11
		bodyModel[309] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 11
		bodyModel[310] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 122
		bodyModel[311] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 122
		bodyModel[312] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 52
		bodyModel[313] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Box 52
		bodyModel[314] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 145
		bodyModel[315] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 52
		bodyModel[316] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 52
		bodyModel[317] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 145
		bodyModel[318] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Box 132
		bodyModel[319] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 132
		bodyModel[320] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 132
		bodyModel[321] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 132
		bodyModel[322] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 11
		bodyModel[323] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 52
		bodyModel[324] = new ModelRendererTurbo(this, 185, 145, textureX, textureY); // Box 52
		bodyModel[325] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 149
		bodyModel[326] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Box 149
		bodyModel[327] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 149
		bodyModel[328] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 149
		bodyModel[329] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 149
		bodyModel[330] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 11
		bodyModel[331] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 11
		bodyModel[332] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 11
		bodyModel[333] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 11
		bodyModel[334] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 11
		bodyModel[335] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 52
		bodyModel[336] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 52
		bodyModel[337] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Box 52
		bodyModel[338] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 52
		bodyModel[339] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 52
		bodyModel[340] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 52
		bodyModel[341] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 52
		bodyModel[342] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 52
		bodyModel[343] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 145
		bodyModel[344] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 52
		bodyModel[345] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 52
		bodyModel[346] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 145
		bodyModel[347] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 11
		bodyModel[348] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 11
		bodyModel[349] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 11
		bodyModel[350] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 11
		bodyModel[351] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 11
		bodyModel[352] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 11
		bodyModel[353] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 11
		bodyModel[354] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 11
		bodyModel[355] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 11
		bodyModel[356] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 145
		bodyModel[357] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 145
		bodyModel[358] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 145
		bodyModel[359] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 145
		bodyModel[360] = new ModelRendererTurbo(this, 473, 161, textureX, textureY); // Box 11
		bodyModel[361] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 11
		bodyModel[362] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 11
		bodyModel[363] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 11
		bodyModel[364] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 11
		bodyModel[365] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 11
		bodyModel[366] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 11
		bodyModel[367] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 11
		bodyModel[368] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Box 11
		bodyModel[369] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 11
		bodyModel[370] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Box 11
		bodyModel[371] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 11
		bodyModel[372] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 11
		bodyModel[373] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 11
		bodyModel[374] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 11
		bodyModel[375] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Box 11
		bodyModel[376] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 11
		bodyModel[377] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 11
		bodyModel[378] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 11
		bodyModel[379] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 11
		bodyModel[380] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 52
		bodyModel[381] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 52
		bodyModel[382] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 88
		bodyModel[383] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 91
		bodyModel[384] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 95
		bodyModel[385] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 96
		bodyModel[386] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 95
		bodyModel[387] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 209
		bodyModel[388] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 95
		bodyModel[389] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 11
		bodyModel[390] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Light_Top-Top_kcs
		bodyModel[391] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Light_Top-Bottom_kcs
		bodyModel[392] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 11
		bodyModel[393] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Light_Top-kcs
		bodyModel[394] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Light_Top-Top
		bodyModel[395] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 209
		bodyModel[396] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 209
		bodyModel[397] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 209
		bodyModel[398] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Box 209
		bodyModel[399] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 209
		bodyModel[400] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 209
		bodyModel[401] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 209
		bodyModel[402] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 209
		bodyModel[403] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 209
		bodyModel[404] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Bell
		bodyModel[405] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 150
		bodyModel[406] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 145
		bodyModel[407] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 11
		bodyModel[408] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 11
		bodyModel[409] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 11
		bodyModel[410] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 11
		bodyModel[411] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 91
		bodyModel[412] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 209
		bodyModel[413] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 209
		bodyModel[414] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Box 209
		bodyModel[415] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 209
		bodyModel[416] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 209
		bodyModel[417] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 209
		bodyModel[418] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 209
		bodyModel[419] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Box 209
		bodyModel[420] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 209
		bodyModel[421] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Marker_Right_Front_CR
		bodyModel[422] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Marker_Left_Front_CR
		bodyModel[423] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Marker_Right_Rear_CR
		bodyModel[424] = new ModelRendererTurbo(this, 81, 185, textureX, textureY); // Marker_Left_Rear_CR
		bodyModel[425] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 88
		bodyModel[426] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 91
		bodyModel[427] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 95
		bodyModel[428] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 96
		bodyModel[429] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 95
		bodyModel[430] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 209
		bodyModel[431] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Flashers_ns
		bodyModel[432] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Beacon_Left
		bodyModel[433] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Flashers_ns
		bodyModel[434] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Beacon_Right
		bodyModel[435] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 88
		bodyModel[436] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 91
		bodyModel[437] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Box 95
		bodyModel[438] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 96
		bodyModel[439] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Box 95
		bodyModel[440] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 209
		bodyModel[441] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 210
		bodyModel[442] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 91
		bodyModel[443] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Box 209
		bodyModel[444] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 209
		bodyModel[445] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 209
		bodyModel[446] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 209
		bodyModel[447] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 209
		bodyModel[448] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 209
		bodyModel[449] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Box 209
		bodyModel[450] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 95
		bodyModel[451] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 95
		bodyModel[452] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 96
		bodyModel[453] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 95
		bodyModel[454] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 96
		bodyModel[455] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 209
		bodyModel[456] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 209
		bodyModel[457] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 11
		bodyModel[458] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 11
		bodyModel[459] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 11
		bodyModel[460] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Box 11
		bodyModel[461] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 11
		bodyModel[462] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 11
		bodyModel[463] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 52
		bodyModel[464] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 145
		bodyModel[465] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 52
		bodyModel[466] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 145
		bodyModel[467] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 52
		bodyModel[468] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 52
		bodyModel[469] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 52
		bodyModel[470] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 11
		bodyModel[471] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 11
		bodyModel[472] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Box 11
		bodyModel[473] = new ModelRendererTurbo(this, 185, 193, textureX, textureY); // Box 11
		bodyModel[474] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Box 11
		bodyModel[475] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 145
		bodyModel[476] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 145
		bodyModel[477] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 52
		bodyModel[478] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 52
		bodyModel[479] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 52
		bodyModel[480] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Box 52
		bodyModel[481] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Box 11
		bodyModel[482] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 11
		bodyModel[483] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // box
		bodyModel[484] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // box
		bodyModel[485] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // box
		bodyModel[486] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // box
		bodyModel[487] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 11
		bodyModel[488] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 11
		bodyModel[489] = new ModelRendererTurbo(this, 10, 215, textureX, textureY); // Box 180
		bodyModel[490] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 11
		bodyModel[491] = new ModelRendererTurbo(this, 338, 247, textureX, textureY); // Box 11
		bodyModel[492] = new ModelRendererTurbo(this, 350, 230, textureX, textureY); // Box 11
		bodyModel[493] = new ModelRendererTurbo(this, 473, 203, textureX, textureY); // Box 11
		bodyModel[494] = new ModelRendererTurbo(this, 481, 202, textureX, textureY); // Box 11
		bodyModel[495] = new ModelRendererTurbo(this, 472, 212, textureX, textureY); // Box 11
		bodyModel[496] = new ModelRendererTurbo(this, 481, 213, textureX, textureY); // Box 11
		bodyModel[497] = new ModelRendererTurbo(this, 289, 219, textureX, textureY); // box
		bodyModel[498] = new ModelRendererTurbo(this, 75, 212, textureX, textureY); // box
		bodyModel[499] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Ditchlight_Left_Top_csx

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

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[47].setRotationPoint(-69.5F, -7.5F, -1F);

		bodyModel[48].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 11
		bodyModel[48].setRotationPoint(-54.5F, -17.5F, 10F);

		bodyModel[49].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 11
		bodyModel[49].setRotationPoint(-54.5F, -17.5F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 17, 3, 0F); // Box 11
		bodyModel[50].setRotationPoint(-54.5F, -17.5F, 7F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 13, 3, 0F); // Door_Front
		bodyModel[51].setRotationPoint(-54.5F, -17.5F, -10F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 11
		bodyModel[52].setRotationPoint(-54.5F, -4.5F, -10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Door_Front
		bodyModel[53].setRotationPoint(-54.5F, -18.5F, -10F);

		bodyModel[54].addBox(0F, 0F, 0F, 13, 1, 14, 0F); // Box 11
		bodyModel[54].setRotationPoint(-54.5F, -21.5F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[55].setRotationPoint(-54.5F, -21.5F, 10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[56].setRotationPoint(-54.5F, -21.5F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[57].setRotationPoint(-54.5F, -20.5F, -9F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 17, 3, 0F); // Box 11
		bodyModel[58].setRotationPoint(-42.5F, -17.5F, -10F);

		bodyModel[59].addBox(-1F, 0F, -3F, 1, 13, 3, 0F); // Door_Rear
		bodyModel[59].setRotationPoint(-41.5F, -17.5F, 10F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 4, 3, 0F); // Box 11
		bodyModel[60].setRotationPoint(-42.5F, -4.5F, 7F);

		bodyModel[61].addShapeBox(-1F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Door_Rear
		bodyModel[61].setRotationPoint(-41.5F, -18.5F, 10F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[62].setRotationPoint(-42.5F, -20.5F, 7F);

		bodyModel[63].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 11
		bodyModel[63].setRotationPoint(-61.5F, -4.5F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 11
		bodyModel[64].setRotationPoint(-63.5F, -4.5F, -11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[65].setRotationPoint(-63F, -3.25F, -10.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 11
		bodyModel[66].setRotationPoint(-64.5F, -4.5F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 20, 14, 0F); // Box 11
		bodyModel[67].setRotationPoint(-42.5F, -20.5F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 11, 4, 20, 0F); // Box 11
		bodyModel[68].setRotationPoint(-53.5F, -4.5F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 20, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 11
		bodyModel[69].setRotationPoint(-54.5F, -20.5F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[70].setRotationPoint(-57.5F, -21.5F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 11
		bodyModel[71].setRotationPoint(-57.5F, -21.5F, 1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 4, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[72].setRotationPoint(-57.5F, -21.5F, -7F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[73].setRotationPoint(67.5F, -22F, -0.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 79, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[74].setRotationPoint(-41.5F, -2.5F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[75].setRotationPoint(-48F, 0.5F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 132
		bodyModel[76].setRotationPoint(-47.5F, 2F, -1F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 22, 0F); // Box 132
		bodyModel[77].setRotationPoint(45F, 0.5F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 132
		bodyModel[78].setRotationPoint(45.5F, 2F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[79].setRotationPoint(-41.5F, -4.5F, 10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[80].setRotationPoint(-39.5F, -4.5F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[81].setRotationPoint(-24.5F, -21.2F, -7.6F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 180
		bodyModel[82].setRotationPoint(35.5F, -22.75F, -4.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[83].setRotationPoint(38.5F, -22.75F, -1.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[84].setRotationPoint(32.5F, -22.75F, -1.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[85].setRotationPoint(38.5F, -22.75F, 1.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 180
		bodyModel[86].setRotationPoint(32.5F, -22.75F, 1.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[87].setRotationPoint(38.5F, -22.75F, -4.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[88].setRotationPoint(32.5F, -22.75F, -4.5F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 180
		bodyModel[89].setRotationPoint(57.5F, -22.75F, -4.5F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[90].setRotationPoint(60.5F, -22.75F, -1.5F);

		bodyModel[91].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[91].setRotationPoint(54.5F, -22.75F, -1.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[92].setRotationPoint(60.5F, -22.75F, 1.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 180
		bodyModel[93].setRotationPoint(54.5F, -22.75F, 1.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[94].setRotationPoint(60.5F, -22.75F, -4.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[95].setRotationPoint(54.5F, -22.75F, -4.5F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 180
		bodyModel[96].setRotationPoint(46.5F, -22.75F, -4.5F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[97].setRotationPoint(49.5F, -22.75F, -1.5F);

		bodyModel[98].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[98].setRotationPoint(43.5F, -22.75F, -1.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[99].setRotationPoint(49.5F, -22.75F, 1.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 180
		bodyModel[100].setRotationPoint(43.5F, -22.75F, 1.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[101].setRotationPoint(49.5F, -22.75F, -4.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[102].setRotationPoint(43.5F, -22.75F, -4.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 12, 13, 14, 0F); // Box 11
		bodyModel[103].setRotationPoint(-66.5F, -13.5F, -7F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 6, 3, 0F); // Box 11
		bodyModel[104].setRotationPoint(-41.5F, -8.5F, -10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[105].setRotationPoint(-22.5F, -7.5F, 11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[106].setRotationPoint(-36.5F, -7.5F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 103, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[107].setRotationPoint(-37.5F, -8.5F, 10.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[108].setRotationPoint(-42.5F, -12.5F, 10.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[109].setRotationPoint(-40.5F, -12.5F, 10.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[110].setRotationPoint(-30.5F, -7.5F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[111].setRotationPoint(-14.5F, -7.5F, 11F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[112].setRotationPoint(-6.5F, -7.5F, 11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[113].setRotationPoint(1.5F, -7.5F, 11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[114].setRotationPoint(9.5F, -7.5F, 11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[115].setRotationPoint(17.5F, -7.5F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[116].setRotationPoint(25.5F, -7.5F, 11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[117].setRotationPoint(33.5F, -7.5F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[118].setRotationPoint(41.5F, -7.5F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[119].setRotationPoint(49.5F, -7.5F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[120].setRotationPoint(56.5F, -7.5F, 11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[121].setRotationPoint(65.01F, -1.5F, 10.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[122].setRotationPoint(65F, -7.5F, 9.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.51F, 0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, 0.5F, -0.51F, 0F, 0.5F); // Box 52
		bodyModel[123].setRotationPoint(65F, -6.5F, 9.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[124].setRotationPoint(65F, -8.5F, 9.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[125].setRotationPoint(-20.5F, -11.5F, -12F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[126].setRotationPoint(-36.5F, -9.5F, -12F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[127].setRotationPoint(-36.5F, -10.5F, -11.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 145
		bodyModel[128].setRotationPoint(-41.5F, -12.5F, -11.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[129].setRotationPoint(-39.5F, -12.5F, -11.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[130].setRotationPoint(-28.5F, -9.5F, -12F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[131].setRotationPoint(-12.5F, -11.5F, -12F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[132].setRotationPoint(-4.5F, -9.5F, -12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[133].setRotationPoint(3.5F, -9.5F, -12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[134].setRotationPoint(11.5F, -9.5F, -12F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[135].setRotationPoint(19.5F, -9.5F, -12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[136].setRotationPoint(27.5F, -9.5F, -12F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[137].setRotationPoint(40.5F, -7.5F, -12F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[138].setRotationPoint(48.5F, -7.5F, -12F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[139].setRotationPoint(56.5F, -7.5F, -12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[140].setRotationPoint(63.5F, -7.5F, -12F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[141].setRotationPoint(65.01F, -1.5F, -11.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[142].setRotationPoint(65F, -7.5F, -10.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.51F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.01F, 0F, -1F, -0.51F, 0F, -1F); // Box 52
		bodyModel[143].setRotationPoint(65F, -6.5F, -10.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[144].setRotationPoint(65F, -8.5F, -11.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[145].setRotationPoint(39.5F, -8.5F, -11.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[146].setRotationPoint(36.5F, -10.5F, -11.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[147].setRotationPoint(-64F, -9.5F, -12F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[148].setRotationPoint(-59.5F, -12.5F, -11.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[149].setRotationPoint(-65.5F, -10.5F, -11.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 2F, -0.5F); // Box 145
		bodyModel[150].setRotationPoint(-62.5F, -12.5F, -11.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[151].setRotationPoint(-66.01F, -1.5F, -11.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[152].setRotationPoint(-66F, -9.5F, -10.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.01F, 0F, 0.5F, -0.51F, 0F, 0.5F, -0.51F, 0F, -1F, 0.01F, 0F, -1F); // Box 52
		bodyModel[153].setRotationPoint(-66F, -8.5F, -10.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[154].setRotationPoint(-66F, -10.5F, -11.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[155].setRotationPoint(-64.5F, -11.5F, 11F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[156].setRotationPoint(-65.5F, -12.5F, 10.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[157].setRotationPoint(-66.01F, -1.5F, 10.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[158].setRotationPoint(-66F, -11.5F, 9.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.01F, 0F, -1F, -0.51F, 0F, -1F, -0.51F, 0F, 0.5F, 0.01F, 0F, 0.5F); // Box 52
		bodyModel[159].setRotationPoint(-66F, -4.5F, 9.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[160].setRotationPoint(-66F, -12.5F, 9.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[161].setRotationPoint(-73.25F, -7.5F, -3F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -1.35F, 0F, -0.6F, -1.35F, 0F, -0.6F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.65F, 0F, -0.6F, 0.65F, 0F); // Box 52
		bodyModel[162].setRotationPoint(-73.25F, -8.5F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[163].setRotationPoint(-72.25F, -7.5F, 8F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[164].setRotationPoint(-73.25F, -7.5F, 2F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, -1.35F, 0F, -0.1F, -1.35F, 0F, -0.1F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0.65F, 0F, -0.1F, 0.65F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 52
		bodyModel[165].setRotationPoint(-73.25F, -8.5F, 0F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.75F, -0.4F, -0.1F); // Box 11
		bodyModel[166].setRotationPoint(-58.5F, -21.48F, -1F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Top-Top
		bodyModel[167].setRotationPoint(-58.75F, -21.48F, -1F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Top-Bottom
		bodyModel[168].setRotationPoint(-58.75F, -19.78F, -1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F); // Box 11
		bodyModel[169].setRotationPoint(-69.5F, -13.5F, -7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F); // Box 11
		bodyModel[170].setRotationPoint(-69.5F, -7.5F, 0F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 13, 6, 0F,-0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 11
		bodyModel[171].setRotationPoint(-69.5F, -13.5F, 1F);

		bodyModel[172].addBox(0F, 0F, 0F, 2, 13, 2, 0F); // Box 11
		bodyModel[172].setRotationPoint(-68.5F, -13.5F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.75F, -0.4F, -0.1F); // Box 11
		bodyModel[173].setRotationPoint(-70.08F, -13.5F, -1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Nose_Top-Top
		bodyModel[174].setRotationPoint(-70.33F, -13.5F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Nose_Top-Bottom
		bodyModel[175].setRotationPoint(-70.33F, -11.8F, -1F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		bodyModel[176].setRotationPoint(-69.56F, -12.5F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.43F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[177].setRotationPoint(-69.5F, -8.5F, -1F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.43F, 0F, 0F); // Box 11
		bodyModel[178].setRotationPoint(-69.5F, -8.5F, 0F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Nose_Middle-Top
		bodyModel[179].setRotationPoint(-70.16F, -12.08F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Nose_Middle-Bottom
		bodyModel[180].setRotationPoint(-70.16F, -10.38F, -1F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[181].setRotationPoint(-69.5F, -13.5F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F); // Box 11
		bodyModel[182].setRotationPoint(-69.5F, -13.5F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.75F, -0.2F, -0.2F, -0.75F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.75F, -0.2F, -0.2F); // socket
		bodyModel[183].setRotationPoint(-69.96F, -12.08F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.75F, -0.2F, -0.2F, -0.75F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.75F, -0.2F, -0.2F); // socket
		bodyModel[184].setRotationPoint(-69.96F, -10.38F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[185].setRotationPoint(-69.5F, -13.5F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F); // Box 11
		bodyModel[186].setRotationPoint(-69.5F, -13.5F, 0F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.43F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[187].setRotationPoint(-69.5F, -12.5F, -1F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.43F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.43F, -0.5F, 0F); // Box 11
		bodyModel[188].setRotationPoint(-69.5F, -12.5F, 0F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[189].setRotationPoint(-70.75F, -0.5F, -9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[190].setRotationPoint(69.75F, 1.5F, -10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[191].setRotationPoint(69.75F, -0.5F, -9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[192].setRotationPoint(70F, -1.5F, 10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[193].setRotationPoint(70F, -1.5F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[194].setRotationPoint(-71F, -1.5F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[195].setRotationPoint(-71F, -1.5F, 10F);

		bodyModel[196].addBox(0F, 0F, -7F, 1, 2, 5, 0F); // Numberboard_Left_Front
		bodyModel[196].setRotationPoint(-58.1F, -20.25F, 0F);
		bodyModel[196].rotateAngleY = 0.46251225F;

		bodyModel[197].addBox(0F, 0F, 2F, 1, 2, 5, 0F); // Numberboard_Right_Front
		bodyModel[197].setRotationPoint(-58.1F, -20.25F, 0F);
		bodyModel[197].rotateAngleY = -0.46251225F;

		bodyModel[198].addShapeBox(0F, 0F, 5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Right_Front
		bodyModel[198].setRotationPoint(-69.7F, -12.5F, 0F);
		bodyModel[198].rotateAngleY = -0.40142573F;

		bodyModel[199].addShapeBox(0F, 0F, -7F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Left_Front
		bodyModel[199].setRotationPoint(-69.7F, -12.5F, 0F);
		bodyModel[199].rotateAngleY = 0.40142573F;

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 11
		bodyModel[200].setRotationPoint(-57.5F, -18F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 128
		bodyModel[201].setRotationPoint(67.6F, -18.5F, -2F);

		bodyModel[202].addShapeBox(0F, 0F, 4.6F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // blanked_marker
		bodyModel[202].setRotationPoint(68.75F, -20.5F, 0F);
		bodyModel[202].rotateAngleY = 0.41887902F;

		bodyModel[203].addShapeBox(0F, 0F, -6.6F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // blanked_marker
		bodyModel[203].setRotationPoint(68.75F, -20.5F, 0F);
		bodyModel[203].rotateAngleY = -0.41887902F;

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Light_Rear_Right
		bodyModel[204].setRotationPoint(69.6F, -18.5F, -0.1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Light_Rear_Left
		bodyModel[205].setRotationPoint(69.6F, -18.5F, -1.9F);

		bodyModel[206].addBox(0F, 0F, -5.9F, 1, 2, 5, 0F); // Numberboard_Left_Rear
		bodyModel[206].setRotationPoint(68.5F, -16.25F, 0F);
		bodyModel[206].rotateAngleY = -0.40142573F;

		bodyModel[207].addBox(0F, 0F, 0.9F, 1, 2, 5, 0F); // Numberboard_Right_Rear
		bodyModel[207].setRotationPoint(68.5F, -16.25F, 0F);
		bodyModel[207].rotateAngleY = 0.40142573F;

		bodyModel[208].addShapeBox(0F, 0F, 4.6F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Right_Rear
		bodyModel[208].setRotationPoint(68.75F, -14F, 0F);
		bodyModel[208].rotateAngleY = 0.41887902F;

		bodyModel[209].addShapeBox(0F, 0F, -6.6F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Left_Rear
		bodyModel[209].setRotationPoint(68.75F, -14F, 0F);
		bodyModel[209].rotateAngleY = -0.41887902F;

		bodyModel[210].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 11
		bodyModel[210].setRotationPoint(-47.5F, -8.5F, 6F);

		bodyModel[211].addBox(0F, 0F, 0F, 5, 1, 4, 0F); // Box 11
		bodyModel[211].setRotationPoint(-49.5F, -9.5F, 4.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 1, 5, 4, 0F); // Box 11
		bodyModel[212].setRotationPoint(-45.5F, -14.5F, 4.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 11
		bodyModel[213].setRotationPoint(-47.5F, -8.5F, -7F);

		bodyModel[214].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 11
		bodyModel[214].setRotationPoint(-49.5F, -9.5F, -7.5F);
		bodyModel[214].rotateAngleY = -0.4712389F;

		bodyModel[215].addBox(4F, 0F, 0F, 1, 3, 4, 0F); // Box 11
		bodyModel[215].setRotationPoint(-49.5F, -13.5F, -7.5F);
		bodyModel[215].rotateAngleY = -0.4712389F;
		bodyModel[215].rotateAngleZ = -0.17453293F;

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[216].setRotationPoint(-53.5F, -10.5F, 8F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 10, 2, 0F); // Box 11
		bodyModel[217].setRotationPoint(-48.5F, -14.5F, 0F);
		bodyModel[217].rotateAngleY = -0.26179939F;

		bodyModel[218].addShapeBox(-5F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 11
		bodyModel[218].setRotationPoint(-48.5F, -12.5F, 0F);
		bodyModel[218].rotateAngleY = -0.26179939F;

		bodyModel[219].addShapeBox(-5F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 2.5F); // Box 11
		bodyModel[219].setRotationPoint(-48.5F, -14.5F, 0F);
		bodyModel[219].rotateAngleY = -0.26179939F;

		bodyModel[220].addShapeBox(-5F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 11
		bodyModel[220].setRotationPoint(-48.5F, -7.5F, 0F);
		bodyModel[220].rotateAngleY = -0.26179939F;

		bodyModel[221].addShapeBox(-3F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Box 11
		bodyModel[221].setRotationPoint(-48.5F, -15.5F, 0F);
		bodyModel[221].rotateAngleY = -0.26179939F;

		bodyModel[222].addBox(1F, 2F, 2F, 1, 3, 1, 0F); // Box 11
		bodyModel[222].setRotationPoint(-48.5F, -14.5F, 0F);
		bodyModel[222].rotateAngleY = -0.26179939F;

		bodyModel[223].addBox(0.75F, 5F, 2F, 2, 1, 1, 0F); // Box 11
		bodyModel[223].setRotationPoint(-48.5F, -14.5F, 0F);
		bodyModel[223].rotateAngleY = -0.26179939F;

		bodyModel[224].addShapeBox(1F, 2F, 3F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 11
		bodyModel[224].setRotationPoint(-48.5F, -14.5F, 0F);
		bodyModel[224].rotateAngleY = -0.26179939F;

		bodyModel[225].addShapeBox(1F, 5F, 3F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 11
		bodyModel[225].setRotationPoint(-48.5F, -14.5F, 0F);
		bodyModel[225].rotateAngleY = -0.26179939F;

		bodyModel[226].addShapeBox(-3F, 3F, 1.75F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 11
		bodyModel[226].setRotationPoint(-48.5F, -14.5F, 0F);
		bodyModel[226].rotateAngleY = -0.62831853F;

		bodyModel[227].addShapeBox(-4.5F, 4F, 1.75F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 11
		bodyModel[227].setRotationPoint(-48.5F, -14.5F, 0F);
		bodyModel[227].rotateAngleY = -0.62831853F;

		bodyModel[228].addShapeBox(-5F, 5F, 1.75F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 11
		bodyModel[228].setRotationPoint(-48.5F, -14.5F, 0F);
		bodyModel[228].rotateAngleY = -0.62831853F;

		bodyModel[229].addBox(4F, 0F, 1.5F, 1, 4, 1, 0F); // Box 11
		bodyModel[229].setRotationPoint(-49.5F, -12.5F, -7.5F);
		bodyModel[229].rotateAngleY = -0.4712389F;

		bodyModel[230].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 11
		bodyModel[230].setRotationPoint(-51.5F, -6.5F, -10F);

		bodyModel[231].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 11
		bodyModel[231].setRotationPoint(-47.5F, -6.5F, -9F);

		bodyModel[232].addBox(1F, 0F, -1F, 1, 0, 3, 0F); // Box 11
		bodyModel[232].setRotationPoint(-53.5F, -17.75F, 1.5F);
		bodyModel[232].rotateAngleY = 0.17453293F;
		bodyModel[232].rotateAngleZ = 1.15191731F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 11
		bodyModel[233].setRotationPoint(-53.5F, -17.75F, 1.5F);
		bodyModel[233].rotateAngleY = 0.17453293F;
		bodyModel[233].rotateAngleZ = 1.15191731F;

		bodyModel[234].addBox(1F, 0F, -1F, 1, 0, 3, 0F); // Box 11
		bodyModel[234].setRotationPoint(-53.7F, -17.75F, -2.5F);
		bodyModel[234].rotateAngleY = -0.17453293F;
		bodyModel[234].rotateAngleZ = 1.15191731F;

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 11
		bodyModel[235].setRotationPoint(-53.7F, -17.75F, -2.5F);
		bodyModel[235].rotateAngleY = -0.17453293F;
		bodyModel[235].rotateAngleZ = 1.15191731F;

		bodyModel[236].addShapeBox(0F, 1.75F, -1F, 1, 1, 2, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 11
		bodyModel[236].setRotationPoint(-48.5F, -14.5F, 0F);
		bodyModel[236].rotateAngleX = 1.08210414F;
		bodyModel[236].rotateAngleY = -0.26179939F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[237].setRotationPoint(-71F, 2.5F, 4F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[238].setRotationPoint(-71F, 2.5F, -7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // box
		bodyModel[239].setRotationPoint(70F, 2.5F, -7F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // box
		bodyModel[240].setRotationPoint(71F, 2.7F, -6.88F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // box
		bodyModel[241].setRotationPoint(70.5F, 2.7F, -6.88F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // box
		bodyModel[242].setRotationPoint(70F, 2.5F, 4F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // box
		bodyModel[243].setRotationPoint(70.5F, 2.7F, 4.12F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3.25F, 0F, 0F); // Box 11
		bodyModel[244].setRotationPoint(-70.65F, 6F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 0.75F, 0F, -1F, -1.5F, 0F, -1F, -4.25F, 0F, 0F, 3.5F, 0F, 0F); // Box 11
		bodyModel[245].setRotationPoint(-70.9F, 7F, -10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, -1.75F, 0F, 0F, -2.85F, 0F, 0F, 2.08F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -2.1F, 0F, 0F, 1.33F, 0F, 0F); // Box 11
		bodyModel[246].setRotationPoint(-70.4F, 4F, -11F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1.75F, 0F, 0F, -2.04F, 0F, 0F, 1.28F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1.28F, 0F, 0F, 0.53F, 0F, 0F); // Box 11
		bodyModel[247].setRotationPoint(-72.3F, 4F, -4F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F); // box
		bodyModel[248].setRotationPoint(-71F, 2.7F, -7.12F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F); // box
		bodyModel[249].setRotationPoint(-72F, 3.7F, -7.12F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, 0F, 0.5F, 0F, 0F); // box
		bodyModel[250].setRotationPoint(-72.5F, 6.7F, -7.12F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,3F, 0F, 0F, -3.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 3.25F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[251].setRotationPoint(-70.65F, 6F, 0F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.75F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 3.5F, 0F, 0F, -4.25F, 0F, 0F, -1.5F, 0F, -1F, 0.75F, 0F, -1F); // Box 11
		bodyModel[252].setRotationPoint(-70.9F, 7F, 0F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,2.08F, 0F, 0F, -2.85F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 1.33F, 0F, 0F, -2.1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[253].setRotationPoint(-70.4F, 4F, 7F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1.28F, 0F, 0F, -2.04F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 0.53F, 0F, 0F, -1.28F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[254].setRotationPoint(-72.3F, 4F, 3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.25F, 1F, 0F, -0.25F); // box
		bodyModel[255].setRotationPoint(-71F, 2.7F, 4.12F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // box
		bodyModel[256].setRotationPoint(-72F, 3.7F, 4.12F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // box
		bodyModel[257].setRotationPoint(-72.5F, 6.7F, 4.12F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1.25F, 0F, -1F, -1.25F); // box
		bodyModel[258].setRotationPoint(-50F, -17.5F, -12F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1.25F, -2F, -1F, -1.25F); // box
		bodyModel[259].setRotationPoint(-52F, -17.5F, -12F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, -2F, -1F, 0.5F, -2F, -1F, -1.25F, 0F, -1F, -1.25F); // box
		bodyModel[260].setRotationPoint(-46F, -17.5F, -12F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // box
		bodyModel[261].setRotationPoint(-50F, -17.5F, 11F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0.5F, -2F, -1F, 0.5F); // box
		bodyModel[262].setRotationPoint(-52F, -17.5F, 11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, -2F, -1F, -1.25F, -2F, -1F, 0.5F, 0F, -1F, 0.5F); // box
		bodyModel[263].setRotationPoint(-46F, -17.5F, 11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // box
		bodyModel[264].setRotationPoint(-71.75F, -2.5F, -6.75F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // box
		bodyModel[265].setRotationPoint(-71.75F, -2.5F, 4.75F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Right_Bottom_ns
		bodyModel[266].setRotationPoint(-72.05F, 0.5F, 5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // box
		bodyModel[267].setRotationPoint(-71.3F, 1F, 5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Left_Bottom_ns
		bodyModel[268].setRotationPoint(-72.05F, 0.5F, -7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // box
		bodyModel[269].setRotationPoint(-71.3F, 1F, -7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[270].setRotationPoint(-61.5F, -11.5F, 6.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[271].setRotationPoint(67.35F, -17.5F, -5F);
		bodyModel[271].rotateAngleY = -0.40142573F;

		bodyModel[272].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[272].setRotationPoint(67.35F, -20.75F, -5F);
		bodyModel[272].rotateAngleY = -0.40142573F;

		bodyModel[273].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[273].setRotationPoint(67.35F, -14.25F, -5F);
		bodyModel[273].rotateAngleY = -0.40142573F;

		bodyModel[274].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[274].setRotationPoint(67.35F, -11F, -5F);
		bodyModel[274].rotateAngleY = -0.40142573F;

		bodyModel[275].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[275].setRotationPoint(67.35F, -7.75F, -5F);
		bodyModel[275].rotateAngleY = -0.40142573F;

		bodyModel[276].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[276].setRotationPoint(67.35F, -4.5F, -5F);
		bodyModel[276].rotateAngleY = -0.40142573F;

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[277].setRotationPoint(-71.25F, 1.5F, -8.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[278].setRotationPoint(-71.25F, 1.5F, 2.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[279].setRotationPoint(70.75F, 1.5F, -8.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[280].setRotationPoint(70.75F, 1.5F, 2.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,1F, 0F, 0F, -1.75F, 0F, 0F, -4F, -0.5F, 0F, 3.25F, -0.5F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -3.19F, 0F, 0F, 2.43F, 0F, 0F); // Box 11
		bodyModel[281].setRotationPoint(-71.15F, 3F, -11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,3.25F, -0.5F, 0F, -3.9F, -0.5F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 2.43F, 0F, 0F, -3.19F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[282].setRotationPoint(-71.15F, 3F, 3F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // box
		bodyModel[283].setRotationPoint(71F, 2.7F, 4.12F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[284].setRotationPoint(-54.5F, -18.5F, 7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[285].setRotationPoint(-54.5F, -20.5F, 7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[286].setRotationPoint(-42.5F, -18.5F, -10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[287].setRotationPoint(-42.5F, -20.5F, -9F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[288].setRotationPoint(-24.5F, 1.5F, 7F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[289].setRotationPoint(-24.5F, 1.5F, -11F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[290].setRotationPoint(-7.5F, 0.5F, 9F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[291].setRotationPoint(-7.5F, 0.5F, 10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[292].setRotationPoint(-7.5F, 1.5F, 9F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1
		bodyModel[293].setRotationPoint(-7.5F, 1.5F, 10F);

		bodyModel[294].addBox(0F, 0F, -2F, 1, 1, 3, 0F); // Box 84
		bodyModel[294].setRotationPoint(-22F, 1.5F, 9.5F);
		bodyModel[294].rotateAngleX = 0.52359878F;

		bodyModel[295].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 84
		bodyModel[295].setRotationPoint(-22F, 1.5F, -9.5F);
		bodyModel[295].rotateAngleX = -0.52359878F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[296].setRotationPoint(-7.5F, 0.5F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[297].setRotationPoint(-7.5F, 0.5F, -10F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[298].setRotationPoint(-7.5F, 1.5F, -11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 26, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1
		bodyModel[299].setRotationPoint(-7.5F, 1.5F, -10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Bell
		bodyModel[300].setRotationPoint(-27.32F, 0.75F, -10.98F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[301].setRotationPoint(-26.42F, 0.5F, -10.88F);

		bodyModel[302].addBox(0F, 0F, 0F, 48, 3, 22, 0F); // Box 68
		bodyModel[302].setRotationPoint(-24.5F, 2.5F, -11F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 48, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 68
		bodyModel[303].setRotationPoint(-24.5F, 5.5F, -11F);

		bodyModel[304].addBox(0F, 0F, 0F, 10, 4, 4, 0F); // Box 11
		bodyModel[304].setRotationPoint(-64.5F, -4.5F, 7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[305].setRotationPoint(-65F, -3.25F, 7.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 12, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 180
		bodyModel[306].setRotationPoint(-22.5F, -22.5F, -4F);

		bodyModel[307].addShapeBox(0F, 0F, -3.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[307].setRotationPoint(67.35F, -7.75F, 5F);
		bodyModel[307].rotateAngleY = 0.40142573F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[308].setRotationPoint(-41.5F, -2.75F, 6.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[309].setRotationPoint(-41.5F, -4.25F, 6.5F);

		bodyModel[310].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 122
		bodyModel[310].setRotationPoint(-64F, -10F, -7.65F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 122
		bodyModel[311].setRotationPoint(-65F, -11F, -7.75F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 52
		bodyModel[312].setRotationPoint(-71F, -7.5F, -10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 52
		bodyModel[313].setRotationPoint(-71F, -7.5F, 9F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[314].setRotationPoint(-72.5F, -8.5F, 7.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[315].setRotationPoint(-72.25F, -7.5F, -9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[316].setRotationPoint(-73F, -8.5F, 2.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[317].setRotationPoint(-72.5F, -8.5F, -8.5F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[318].setRotationPoint(46F, 1.5F, -11F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[319].setRotationPoint(46F, 1.5F, 10F);

		bodyModel[320].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[320].setRotationPoint(-47F, 1.5F, -11F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 132
		bodyModel[321].setRotationPoint(-47F, 1.5F, 10F);

		bodyModel[322].addBox(0F, 0F, 0F, 6, 3, 3, 0F); // Box 11
		bodyModel[322].setRotationPoint(-62.5F, -7.5F, 7F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[323].setRotationPoint(34.5F, -9.5F, -12F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[324].setRotationPoint(63.5F, -7.5F, 11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[325].setRotationPoint(30.5F, -20.5F, -7.6F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[326].setRotationPoint(48.5F, -20.5F, -7.6F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[327].setRotationPoint(-24.5F, -21.2F, 6.6F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[328].setRotationPoint(30.5F, -20.5F, 6.6F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 17, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[329].setRotationPoint(48.5F, -20.5F, 6.6F);

		bodyModel[330].addBox(0F, 0F, 0F, 5, 6, 3, 0F); // Box 11
		bodyModel[330].setRotationPoint(-35.5F, -8.5F, -10F);

		bodyModel[331].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 11
		bodyModel[331].setRotationPoint(-41.5F, -3.5F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[332].setRotationPoint(70.75F, -0.5F, -9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[333].setRotationPoint(72.75F, -0.5F, -9F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[334].setRotationPoint(72.75F, -0.5F, 0F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[335].setRotationPoint(72.25F, -7.5F, 2F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -1.35F, 0F, -0.6F, -1.35F, 0F, -0.6F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 0.65F, 0F, -0.6F, 0.65F, 0F, -0.6F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 52
		bodyModel[336].setRotationPoint(72.25F, -8.5F, 0F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[337].setRotationPoint(71.25F, -7.5F, -9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[338].setRotationPoint(72.25F, -7.5F, -3F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -1.35F, 0F, -0.1F, -1.35F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, 0.65F, 0F, -0.1F, 0.65F, 0F); // Box 52
		bodyModel[339].setRotationPoint(72.25F, -8.5F, -2F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 52
		bodyModel[340].setRotationPoint(72F, -8.5F, -8.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 52
		bodyModel[341].setRotationPoint(70F, -7.5F, 9F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 52
		bodyModel[342].setRotationPoint(70F, -7.5F, -10F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[343].setRotationPoint(71.5F, -8.5F, -8.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[344].setRotationPoint(71.25F, -7.5F, 8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[345].setRotationPoint(72F, -8.5F, 2.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[346].setRotationPoint(71.5F, -8.5F, 7.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[347].setRotationPoint(-18.5F, -15.5F, -8F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 7, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[348].setRotationPoint(-18.5F, -14.5F, -8F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 7, 7, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[349].setRotationPoint(-18.5F, -14.5F, -10F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[350].setRotationPoint(-18.5F, -5.5F, -11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[351].setRotationPoint(-18.5F, -7.5F, -10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[352].setRotationPoint(-17.5F, -4.5F, -11F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[353].setRotationPoint(-12.5F, -4.5F, -11F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[354].setRotationPoint(-15F, -4.5F, -11F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 14, 0, 2, 0F,0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1.33F, 0F, 0F, -1.33F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -1.33F, 0F, 0F, -1.33F); // Box 11
		bodyModel[355].setRotationPoint(-18.5F, -4.5F, -11F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[356].setRotationPoint(-20.5F, -12.5F, -11.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F); // Box 145
		bodyModel[357].setRotationPoint(-10.5F, -10.5F, -11.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[358].setRotationPoint(-22.5F, -10.5F, -11.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[359].setRotationPoint(-8.5F, -10.5F, -11.5F);

		bodyModel[360].addBox(0F, 0F, 0F, 4, 21, 14, 0F); // Box 11
		bodyModel[360].setRotationPoint(-41.5F, -21.5F, -7F);

		bodyModel[361].addBox(0F, 0F, 0F, 12, 4, 14, 0F); // Box 11
		bodyModel[361].setRotationPoint(-37.5F, -21.5F, -7F);

		bodyModel[362].addBox(0F, 0F, 0F, 12, 13, 14, 0F); // Box 11
		bodyModel[362].setRotationPoint(-37.5F, -13.5F, -7F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 24, 4, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[363].setRotationPoint(-37.5F, -17.5F, -7F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 24, 4, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[364].setRotationPoint(-37.5F, -17.5F, 7F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[365].setRotationPoint(-33.5F, -16.5F, -2F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[366].setRotationPoint(-29.5F, -15.5F, -2F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[367].setRotationPoint(-34.5F, -17.5F, -3F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[368].setRotationPoint(-37.5F, -15.5F, -2F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[369].setRotationPoint(-33.5F, -15.5F, -6F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[370].setRotationPoint(-33.5F, -15.5F, 2F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[371].setRotationPoint(-29.5F, -15.5F, -6F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[372].setRotationPoint(-37.5F, -15.5F, -6F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[373].setRotationPoint(-29.5F, -15.5F, 2F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[374].setRotationPoint(-37.5F, -15.5F, 2F);

		bodyModel[375].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 11
		bodyModel[375].setRotationPoint(-9.5F, -22.5F, -7F);

		bodyModel[376].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 11
		bodyModel[376].setRotationPoint(-4.5F, -22.5F, -7F);

		bodyModel[377].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 11
		bodyModel[377].setRotationPoint(-8.5F, -22.5F, -7F);

		bodyModel[378].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Box 11
		bodyModel[378].setRotationPoint(-8.5F, -22.5F, 5F);

		bodyModel[379].addBox(0F, 0F, 0F, 4, 0, 10, 0F); // Box 11
		bodyModel[379].setRotationPoint(-8.5F, -22.5F, -5F);

		bodyModel[380].addShapeBox(0F, 0F, 0.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[380].setRotationPoint(-69.65F, -8.5F, 2F);
		bodyModel[380].rotateAngleY = -0.40142573F;

		bodyModel[381].addShapeBox(0F, 0F, -3.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[381].setRotationPoint(-69.65F, -8.5F, -2F);
		bodyModel[381].rotateAngleY = 0.40142573F;

		bodyModel[382].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 88
		bodyModel[382].setRotationPoint(-56F, -22F, -0.5F);

		bodyModel[383].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 91
		bodyModel[383].setRotationPoint(-56F, -23F, -1.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 95
		bodyModel[384].setRotationPoint(-58F, -23.5F, -2F);

		bodyModel[385].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[385].setRotationPoint(-57F, -23F, -1.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F); // Box 95
		bodyModel[386].setRotationPoint(-57F, -23.5F, 0F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F); // Box 209
		bodyModel[387].setRotationPoint(-55F, -23.75F, -1F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[388].setRotationPoint(-55F, -23.5F, -1F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.75F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.75F, -0.1F, -0.1F, -0.75F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, -0.75F, -0.4F, -0.1F); // Box 11
		bodyModel[389].setRotationPoint(-58.5F, -19.7F, -1F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Top-Top_kcs
		bodyModel[390].setRotationPoint(-58.75F, -19.7F, -1F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Top-Bottom_kcs
		bodyModel[391].setRotationPoint(-58.75F, -18F, -1F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[392].setRotationPoint(-57.5F, -18F, -1F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Top-kcs
		bodyModel[393].setRotationPoint(-59F, -21.5F, -1F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, -0.5F, -0.15F, -0.15F); // Light_Top-Top
		bodyModel[394].setRotationPoint(-58.5F, -21.5F, -1F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[395].setRotationPoint(-57F, -23.5F, -2.4F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 209
		bodyModel[396].setRotationPoint(-56.5F, -23.5F, -2F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F); // Box 209
		bodyModel[397].setRotationPoint(-55.5F, -24.25F, -1.65F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.15F); // Box 209
		bodyModel[398].setRotationPoint(-58F, -23.5F, -1F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[399].setRotationPoint(-57F, -23F, -0.5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 209
		bodyModel[400].setRotationPoint(-56.5F, -22.5F, -2F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[401].setRotationPoint(-57F, -23.5F, 0.4F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[402].setRotationPoint(-55.5F, -23.5F, 0F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F); // Box 209
		bodyModel[403].setRotationPoint(-54.5F, -24F, -0.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Bell
		bodyModel[404].setRotationPoint(26F, -19.75F, 6.85F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F); // Box 150
		bodyModel[405].setRotationPoint(26.1F, -20F, 7.75F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[406].setRotationPoint(26.5F, -21F, 6.37F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3.25F, 0F, 0F); // Box 11
		bodyModel[407].setRotationPoint(-70.65F, 6F, -11F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.25F, 0F, 0F, -1F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 0.75F, 0F, -1F, -1.5F, 0F, -1F, -4.25F, 0F, 0F, 3.5F, 0F, 0F); // Box 11
		bodyModel[408].setRotationPoint(-70.9F, 8F, -10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,3F, 0F, 0F, -3.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 3.25F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[409].setRotationPoint(-70.65F, 6F, 0F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,3F, 0F, 0F, -3.75F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 3.5F, 0F, 0F, -4.25F, 0F, 0F, -1.5F, 0F, -1F, 0.75F, 0F, -1F); // Box 11
		bodyModel[410].setRotationPoint(-70.9F, 8F, 0F);

		bodyModel[411].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 91
		bodyModel[411].setRotationPoint(-55F, -23.25F, -2.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[412].setRotationPoint(-56F, -23.75F, -2.3F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.15F); // Box 209
		bodyModel[413].setRotationPoint(-57F, -24F, -1F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[414].setRotationPoint(-56F, -23.5F, -0.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[415].setRotationPoint(-56F, -23.75F, 0.3F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[416].setRotationPoint(-55.75F, -23.5F, -3.85F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[417].setRotationPoint(-55.75F, -23.5F, 1.85F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[418].setRotationPoint(-55F, -22.25F, -0.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F); // Box 209
		bodyModel[419].setRotationPoint(-54F, -23.75F, -2.3F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F); // Box 209
		bodyModel[420].setRotationPoint(-54.25F, -23.5F, -3.85F);

		bodyModel[421].addShapeBox(0F, 0F, 4.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Right_Front_CR
		bodyModel[421].setRotationPoint(-67.5F, -12.5F, 0F);

		bodyModel[422].addShapeBox(0F, 0F, -6.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Left_Front_CR
		bodyModel[422].setRotationPoint(-67.5F, -12.5F, 0F);

		bodyModel[423].addShapeBox(0F, 0F, 4.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Right_Rear_CR
		bodyModel[423].setRotationPoint(66.5F, -14F, 0F);

		bodyModel[424].addShapeBox(0F, 0F, -6.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Left_Rear_CR
		bodyModel[424].setRotationPoint(66.5F, -14F, 0F);

		bodyModel[425].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 88
		bodyModel[425].setRotationPoint(30F, -22F, -4F);

		bodyModel[426].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 91
		bodyModel[426].setRotationPoint(30F, -23F, -5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 95
		bodyModel[427].setRotationPoint(28F, -23.5F, -5.5F);

		bodyModel[428].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[428].setRotationPoint(29F, -23F, -5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F); // Box 95
		bodyModel[429].setRotationPoint(29F, -23.5F, -3.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F); // Box 209
		bodyModel[430].setRotationPoint(31F, -23.75F, -4.5F);

		bodyModel[431].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,-0.35F, -0.75F, 0.15F, 0.15F, -0.75F, 0.15F, 0.15F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Flashers_ns
		bodyModel[431].setRotationPoint(-52.75F, -21.51F, -8.25F);
		bodyModel[431].rotateAngleX = 0.78539816F;

		bodyModel[432].addShapeBox(0F, 0F, -1F, 1, 1, 1, 0F,-0.4F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Beacon_Left
		bodyModel[432].setRotationPoint(-52.75F, -21.51F, -8.25F);
		bodyModel[432].rotateAngleX = 0.78539816F;

		bodyModel[433].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,-0.35F, -0.75F, 0.15F, 0.15F, -0.75F, 0.15F, 0.15F, -0.75F, -0.35F, -0.35F, -0.75F, -0.35F, -0.35F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Flashers_ns
		bodyModel[433].setRotationPoint(-52.75F, -21.51F, 8.25F);
		bodyModel[433].rotateAngleX = -0.78539816F;

		bodyModel[434].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,-0.4F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Beacon_Right
		bodyModel[434].setRotationPoint(-52.75F, -21.51F, 8.25F);
		bodyModel[434].rotateAngleX = -0.78539816F;

		bodyModel[435].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 88
		bodyModel[435].setRotationPoint(28F, -22F, -0.5F);

		bodyModel[436].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 91
		bodyModel[436].setRotationPoint(28F, -23F, -1.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 95
		bodyModel[437].setRotationPoint(26F, -23.5F, -2F);

		bodyModel[438].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[438].setRotationPoint(27F, -23F, -1.5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F); // Box 95
		bodyModel[439].setRotationPoint(27F, -23.5F, 0F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F); // Box 209
		bodyModel[440].setRotationPoint(29F, -23.75F, -1F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 210
		bodyModel[441].setRotationPoint(-51.5F, -22.15F, -0.5F);

		bodyModel[442].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 91
		bodyModel[442].setRotationPoint(28F, -23.25F, -2.5F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.15F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.15F, -0.15F); // Box 209
		bodyModel[443].setRotationPoint(26F, -24F, -1F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[444].setRotationPoint(27F, -23.5F, -0.5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[445].setRotationPoint(27F, -23.75F, 0.3F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[446].setRotationPoint(27.25F, -23.5F, 1.85F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[447].setRotationPoint(28F, -22.25F, -0.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F); // Box 209
		bodyModel[448].setRotationPoint(29F, -23.75F, -2.3F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F); // Box 209
		bodyModel[449].setRotationPoint(28.75F, -23.5F, -3.85F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F); // Box 95
		bodyModel[450].setRotationPoint(-57F, -23.5F, -2F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[451].setRotationPoint(-54F, -23.5F, -1F);

		bodyModel[452].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[452].setRotationPoint(-57F, -23F, 0.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F); // Box 95
		bodyModel[453].setRotationPoint(-58F, -23.5F, 0F);

		bodyModel[454].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[454].setRotationPoint(-55F, -23F, -0.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F); // Box 209
		bodyModel[455].setRotationPoint(-55.5F, -24.25F, -0.35F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 209
		bodyModel[456].setRotationPoint(27.25F, -23.5F, -3.85F);

		bodyModel[457].addBox(0F, 0F, 0F, 7, 2, 10, 0F); // Box 11
		bodyModel[457].setRotationPoint(-52.5F, -23F, -5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[458].setRotationPoint(-72.75F, -0.5F, -9F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[459].setRotationPoint(-73.75F, -0.5F, -4F);

		bodyModel[460].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 11
		bodyModel[460].setRotationPoint(-72.75F, -0.5F, -4F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[461].setRotationPoint(-72.75F, -0.5F, 4F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[462].setRotationPoint(-73.75F, -0.5F, 0F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[463].setRotationPoint(-72.25F, -7.5F, 7F);
		bodyModel[463].rotateAngleY = -0.2268928F;

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[464].setRotationPoint(-71.5F, -8.5F, 7.5F);

		bodyModel[465].addShapeBox(0F, 0F, -1F, 1, 7, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[465].setRotationPoint(-72.25F, -7.5F, -7F);
		bodyModel[465].rotateAngleY = 0.2268928F;

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[466].setRotationPoint(-71.5F, -8.5F, -8.5F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 52
		bodyModel[467].setRotationPoint(-73F, -8.5F, -8.5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -1.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 52
		bodyModel[468].setRotationPoint(-72F, -8.5F, -8.5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[469].setRotationPoint(-72F, -8.5F, 2.5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[470].setRotationPoint(70.75F, -0.5F, 4F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[471].setRotationPoint(72.75F, -0.5F, 0F);

		bodyModel[472].addBox(0F, 0F, 0F, 2, 1, 8, 0F); // Box 11
		bodyModel[472].setRotationPoint(70.75F, -0.5F, -4F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[473].setRotationPoint(70.75F, -0.5F, -9F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[474].setRotationPoint(72.75F, -0.5F, -4F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[475].setRotationPoint(70.5F, -8.5F, -8.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[476].setRotationPoint(70.5F, -8.5F, 7.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1.25F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -1.25F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[477].setRotationPoint(71F, -8.5F, 2.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.75F, 0F, 0F, -1.25F, 0F, 0F); // Box 52
		bodyModel[478].setRotationPoint(71F, -8.5F, -8.5F);

		bodyModel[479].addShapeBox(0F, 0F, -1F, 1, 7, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[479].setRotationPoint(71.22F, -7.5F, -7F);
		bodyModel[479].rotateAngleY = -0.2268928F;

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[480].setRotationPoint(71.22F, -7.5F, 7F);
		bodyModel[480].rotateAngleY = 0.2268928F;

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,-0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[481].setRotationPoint(-71.75F, 7.5F, -9F);

		bodyModel[482].addBox(-1F, 0F, 0F, 1, 0, 18, 0F); // Box 11
		bodyModel[482].setRotationPoint(-71.75F, 8.5F, -9F);
		bodyModel[482].rotateAngleZ = 0.78539816F;

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // box
		bodyModel[483].setRotationPoint(-72F, 2.7F, 3.88F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[484].setRotationPoint(-71.5F, 2.7F, 3.88F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // box
		bodyModel[485].setRotationPoint(-72F, 2.7F, -7.12F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[486].setRotationPoint(-71.5F, 2.7F, -7.12F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[487].setRotationPoint(70.75F, 7.5F, -9F);

		bodyModel[488].addBox(0F, 0F, 0F, 1, 0, 18, 0F); // Box 11
		bodyModel[488].setRotationPoint(71.75F, 8.5F, -9F);
		bodyModel[488].rotateAngleZ = -0.78539816F;

		bodyModel[489].addBox(0F, 0F, 0F, 13, 1, 13, 0F); // Box 180
		bodyModel[489].setRotationPoint(-38F, -22F, -6.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, -0.43F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.43F, 0.75F, 0F); // Box 11
		bodyModel[490].setRotationPoint(-69.5F, -13.5F, -1F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.43F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[491].setRotationPoint(-69.5F, -9.75F, -1F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.43F, 0F, 0F); // Box 11
		bodyModel[492].setRotationPoint(-69.5F, -9.75F, 0F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[493].setRotationPoint(-69.5F, -9.5F, -1F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.43F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F); // Box 11
		bodyModel[494].setRotationPoint(-69.5F, -9.5F, 0F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 11
		bodyModel[495].setRotationPoint(-69.5F, -9.5F, -1F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.43F, -0.25F, 0F); // Box 11
		bodyModel[496].setRotationPoint(-69.5F, -9.5F, 0F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // box
		bodyModel[497].setRotationPoint(-72.25F, -2.5F, 2.75F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, -0.5F, 0.35F, -0.1F, 0F, 0.35F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F); // box
		bodyModel[498].setRotationPoint(-72.25F, -2.5F, -4.75F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Left_Top_csx
		bodyModel[499].setRotationPoint(-72.6F, -2.9F, -6.75F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Ditchlight_Right_Top_csx
		bodyModel[501] = new ModelRendererTurbo(this, 268, 240, textureX, textureY); // box
		bodyModel[502] = new ModelRendererTurbo(this, 99, 219, textureX, textureY); // Ditchlight_Left_Top_sp
		bodyModel[503] = new ModelRendererTurbo(this, 300, 239, textureX, textureY); // Ditchlight_Right_Top_sp
		bodyModel[504] = new ModelRendererTurbo(this, 96, 246, textureX, textureY); // box
		bodyModel[505] = new ModelRendererTurbo(this, 121, 237, textureX, textureY); // box
		bodyModel[506] = new ModelRendererTurbo(this, 287, 242, textureX, textureY); // Ditchlight_Right_Top_sp
		bodyModel[507] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 11
		bodyModel[508] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 11
		bodyModel[509] = new ModelRendererTurbo(this, 473, 203, textureX, textureY); // Box 11
		bodyModel[510] = new ModelRendererTurbo(this, 481, 202, textureX, textureY); // Box 11
		bodyModel[511] = new ModelRendererTurbo(this, 105, 262, textureX, textureY); // Exhaust
		bodyModel[512] = new ModelRendererTurbo(this, 137, 244, textureX, textureY); // BeaconCNW
		bodyModel[513] = new ModelRendererTurbo(this, 491, 212, textureX, textureY); // Box 52
		bodyModel[514] = new ModelRendererTurbo(this, 491, 212, textureX, textureY); // Box 52
		bodyModel[515] = new ModelRendererTurbo(this, 394, 261, textureX, textureY); // Box 145
		bodyModel[516] = new ModelRendererTurbo(this, 465, 222, textureX, textureY); // Box 11
		bodyModel[517] = new ModelRendererTurbo(this, 368, 221, textureX, textureY); // Box 11
		bodyModel[518] = new ModelRendererTurbo(this, 105, 267, textureX, textureY); // Exhaust
		bodyModel[519] = new ModelRendererTurbo(this, 137, 262, textureX, textureY); // BeaconCNW
		bodyModel[520] = new ModelRendererTurbo(this, 1, 230, textureX, textureY); // Box 95
		bodyModel[521] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 96
		bodyModel[522] = new ModelRendererTurbo(this, 41, 237, textureX, textureY); // Box 95
		bodyModel[523] = new ModelRendererTurbo(this, 129, 222, textureX, textureY); // Box 96
		bodyModel[524] = new ModelRendererTurbo(this, 49, 243, textureX, textureY); // Box 95
		bodyModel[525] = new ModelRendererTurbo(this, 145, 222, textureX, textureY); // Box 96
		bodyModel[526] = new ModelRendererTurbo(this, 177, 222, textureX, textureY); // Box 209
		bodyModel[527] = new ModelRendererTurbo(this, 57, 232, textureX, textureY); // Box 209
		bodyModel[528] = new ModelRendererTurbo(this, 74, 229, textureX, textureY); // Box 209
		bodyModel[529] = new ModelRendererTurbo(this, 359, 212, textureX, textureY); // Box 11
		bodyModel[530] = new ModelRendererTurbo(this, 209, 223, textureX, textureY); // Box 11
		bodyModel[531] = new ModelRendererTurbo(this, 396, 214, textureX, textureY); // box
		bodyModel[532] = new ModelRendererTurbo(this, 410, 234, textureX, textureY); // box
		bodyModel[533] = new ModelRendererTurbo(this, 426, 255, textureX, textureY); // box
		bodyModel[534] = new ModelRendererTurbo(this, 277, 222, textureX, textureY); // Box 11
		bodyModel[535] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Box 11
		bodyModel[536] = new ModelRendererTurbo(this, 448, 248, textureX, textureY); // box
		bodyModel[537] = new ModelRendererTurbo(this, 471, 221, textureX, textureY); // box
		bodyModel[538] = new ModelRendererTurbo(this, 488, 245, textureX, textureY); // box
		bodyModel[539] = new ModelRendererTurbo(this, 14, 262, textureX, textureY); // Box 11
		bodyModel[540] = new ModelRendererTurbo(this, 38, 278, textureX, textureY); // Box 11
		bodyModel[541] = new ModelRendererTurbo(this, 52, 299, textureX, textureY); // Box 11
		bodyModel[542] = new ModelRendererTurbo(this, 109, 277, textureX, textureY); // Box 11
		bodyModel[543] = new ModelRendererTurbo(this, 152, 376, textureX, textureY); // Box 11
		bodyModel[544] = new ModelRendererTurbo(this, 168, 243, textureX, textureY); // Box 11
		bodyModel[545] = new ModelRendererTurbo(this, 457, 343, textureX, textureY); // Box 52
		bodyModel[546] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		bodyModel[547] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 11
		bodyModel[548] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 11
		bodyModel[549] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 11
		bodyModel[550] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 11
		bodyModel[551] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 11
		bodyModel[552] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Box 11
		bodyModel[553] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Box 11
		bodyModel[554] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 11
		bodyModel[555] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 11
		bodyModel[556] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 11
		bodyModel[557] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 11
		bodyModel[558] = new ModelRendererTurbo(this, 137, 18, textureX, textureY); // Box 11
		bodyModel[559] = new ModelRendererTurbo(this, 145, 14, textureX, textureY); // Box 11
		bodyModel[560] = new ModelRendererTurbo(this, 136, 13, textureX, textureY); // Box 11
		bodyModel[561] = new ModelRendererTurbo(this, 137, 8, textureX, textureY); // Box 11
		bodyModel[562] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 11
		bodyModel[563] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 11
		bodyModel[564] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 11
		bodyModel[565] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 11
		bodyModel[566] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Box 11
		bodyModel[567] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 11
		bodyModel[568] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 11
		bodyModel[569] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 11

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Right_Top_csx
		bodyModel[500].setRotationPoint(-72.6F, -2.9F, 4.75F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // box
		bodyModel[501].setRotationPoint(-73.1F, -2.9F, 2.75F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Left_Top_sp
		bodyModel[502].setRotationPoint(-73.1F, -2.9F, -4.75F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // Ditchlight_Right_Top_sp
		bodyModel[503].setRotationPoint(-73F, -2.9F, 2.75F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // box
		bodyModel[504].setRotationPoint(-73F, -2.9F, -4.75F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // box
		bodyModel[505].setRotationPoint(-72.5F, -2.9F, -6.75F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F); // Ditchlight_Right_Top_sp
		bodyModel[506].setRotationPoint(-72.5F, -2.9F, 4.75F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[507].setRotationPoint(-69.5F, -8.5F, -1F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F); // Box 11
		bodyModel[508].setRotationPoint(-69.5F, -8.5F, 0F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.43F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.43F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[509].setRotationPoint(-69.5F, -9.5F, -1F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.43F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.43F, 0F, 0F); // Box 11
		bodyModel[510].setRotationPoint(-69.5F, -9.5F, 0F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Exhaust
		bodyModel[511].setRotationPoint(-45.5F, -21.75F, -6F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.55F, -0.95F, -0.55F, -0.55F, -0.95F, -0.55F, -0.55F, -0.95F, -0.55F, -0.55F, -0.95F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F); // BeaconCNW
		bodyModel[512].setRotationPoint(-45.5F, -23.65F, -6F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[513].setRotationPoint(-20.5F, -9.5F, -12F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[514].setRotationPoint(-12.5F, -9.5F, -12F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[515].setRotationPoint(-22.5F, -10.5F, -11.5F);

		bodyModel[516].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 11
		bodyModel[516].setRotationPoint(-19.5F, -13.5F, -9F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[517].setRotationPoint(-19.5F, -15.5F, -9F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Exhaust
		bodyModel[518].setRotationPoint(-51.5F, -21.75F, -1F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.55F, -0.95F, -0.55F, -0.55F, -0.95F, -0.55F, -0.55F, -0.95F, -0.55F, -0.55F, -0.95F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F, -0.55F, 0F, -0.55F); // BeaconCNW
		bodyModel[519].setRotationPoint(-51.5F, -23.65F, -1F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 95
		bodyModel[520].setRotationPoint(26F, -23.5F, -2.5F);

		bodyModel[521].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[521].setRotationPoint(27F, -23F, -2F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F); // Box 95
		bodyModel[522].setRotationPoint(26F, -24F, -1F);

		bodyModel[523].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[523].setRotationPoint(27F, -23.5F, -0.5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[524].setRotationPoint(30F, -23.5F, 0F);

		bodyModel[525].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[525].setRotationPoint(29F, -23F, 0.5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 209
		bodyModel[526].setRotationPoint(28F, -24F, 0.75F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F); // Box 209
		bodyModel[527].setRotationPoint(27F, -24.5F, 0.25F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.75F, -0.75F); // Box 209
		bodyModel[528].setRotationPoint(29F, -23.75F, -2.25F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-2.85F, 0F, 0F, 2.08F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -2.1F, 0F, 0F, 1.33F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[529].setRotationPoint(69.4F, 4F, 7F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2.04F, 0F, 0F, 1.28F, 0F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.28F, 0F, 0F, 0.53F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[530].setRotationPoint(71.3F, 4F, 3F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, -1.75F, 0F, -0.25F); // box
		bodyModel[531].setRotationPoint(70F, 2.7F, 4.12F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.25F, -1.25F, 0F, -0.25F); // box
		bodyModel[532].setRotationPoint(71F, 3.7F, 4.12F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // box
		bodyModel[533].setRotationPoint(71.5F, 6.7F, 4.12F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1.75F, 0F, 0F, 1F, 0F, 0F, 2.08F, 0F, 0F, -2.85F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 1.33F, 0F, 0F, -2.1F, 0F, 0F); // Box 11
		bodyModel[534].setRotationPoint(69.4F, 4F, -11F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1.75F, 0F, 0F, 1F, 0F, 0F, 1.28F, 0F, 0F, -2.04F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.53F, 0F, 0F, -1.28F, 0F, 0F); // Box 11
		bodyModel[535].setRotationPoint(71.3F, 4F, -4F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, -0.25F, 1F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F); // box
		bodyModel[536].setRotationPoint(70F, 2.7F, -7.12F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F); // box
		bodyModel[537].setRotationPoint(71F, 3.7F, -7.12F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, -1.25F, 0F, 0F); // box
		bodyModel[538].setRotationPoint(71.5F, 6.7F, -7.12F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-4F, -0.5F, 0F, 3.25F, -0.5F, 0F, 1F, 0F, 0F, -1.75F, 0F, 0F, -3.19F, 0F, 0F, 2.43F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[539].setRotationPoint(70.15F, 3F, 3F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1.75F, 0F, 0F, 1F, 0F, 0F, 3.25F, -0.5F, 0F, -3.9F, -0.5F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 2.43F, 0F, 0F, -3.19F, 0F, 0F); // Box 11
		bodyModel[540].setRotationPoint(70.15F, 3F, -11F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-3.75F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -4F, 0F, 0F, 3.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F); // Box 11
		bodyModel[541].setRotationPoint(69.65F, 6F, 0F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-3.75F, 0F, 0F, 3F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -4.25F, 0F, 0F, 3.5F, 0F, 0F, 0.75F, 0F, -1F, -1.5F, 0F, -1F); // Box 11
		bodyModel[542].setRotationPoint(69.9F, 8F, 0F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 2, 11, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3.75F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 3.25F, 0F, 0F, -4F, 0F, 0F); // Box 11
		bodyModel[543].setRotationPoint(69.65F, 6F, -11F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1F, 0F, 0F, 0.25F, 0F, 0F, 3F, 0F, 0F, -3.75F, 0F, 0F, -1.5F, 0F, -1F, 0.75F, 0F, -1F, 3.5F, 0F, 0F, -4.25F, 0F, 0F); // Box 11
		bodyModel[544].setRotationPoint(69.9F, 8F, -10F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 8, 2, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[545].setRotationPoint(-19.75F, -6.5F, -11.51F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -5F, 0F); // Box 11
		bodyModel[546].setRotationPoint(-67.5F, -0.5F, -11F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.88F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.88F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[547].setRotationPoint(-70.5F, -0.5F, -8F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.88F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.88F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[548].setRotationPoint(-70.5F, -0.5F, 7F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.88F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.88F, -0.5F, 0F); // Box 11
		bodyModel[549].setRotationPoint(68.5F, -0.5F, 7F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.88F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.88F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[550].setRotationPoint(68.5F, -0.5F, -8F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[551].setRotationPoint(-67.5F, -0.5F, -11F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[552].setRotationPoint(-67.5F, -0.5F, 7F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[553].setRotationPoint(-67.5F, -0.5F, 7F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F); // Box 11
		bodyModel[554].setRotationPoint(65.5F, -0.5F, -11F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, -5F, 0F, -2F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[555].setRotationPoint(65.5F, -0.5F, -11F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[556].setRotationPoint(65.5F, -0.5F, 7F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[557].setRotationPoint(65.5F, -0.5F, 7F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[558].setRotationPoint(-69F, -0.52F, -9F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[559].setRotationPoint(-69F, -0.52F, 7F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[560].setRotationPoint(67F, -0.52F, -9F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 2, 0, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[561].setRotationPoint(67F, -0.52F, 7F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.7F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[562].setRotationPoint(-70.5F, 2F, -9F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[563].setRotationPoint(-70.5F, 1F, -7F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[564].setRotationPoint(-70.5F, 2F, 7F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[565].setRotationPoint(-70.5F, 1F, 7F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[566].setRotationPoint(66.5F, 2F, 7F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[567].setRotationPoint(67.5F, 1F, 7F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.7F, -0.5F, 0F); // Box 11
		bodyModel[568].setRotationPoint(66.5F, 2F, -9F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[569].setRotationPoint(67.5F, 1F, -7F);
	}
}