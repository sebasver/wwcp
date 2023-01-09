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

public class MK5000C extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public MK5000C() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[389];

		initbodyModel_1();

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
		bodyModel[14] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 11
		bodyModel[15] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		bodyModel[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 11
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		bodyModel[18] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 11
		bodyModel[19] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 11
		bodyModel[20] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		bodyModel[21] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 11
		bodyModel[22] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 11
		bodyModel[23] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 11
		bodyModel[24] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 11
		bodyModel[25] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 11
		bodyModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		bodyModel[27] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 11
		bodyModel[28] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 3
		bodyModel[29] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 11
		bodyModel[30] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 11
		bodyModel[31] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 11
		bodyModel[32] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 11
		bodyModel[33] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 11
		bodyModel[34] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 11
		bodyModel[35] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 11
		bodyModel[36] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 11
		bodyModel[37] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 11
		bodyModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		bodyModel[39] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 11
		bodyModel[40] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 11
		bodyModel[41] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 11
		bodyModel[42] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 11
		bodyModel[43] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 11
		bodyModel[44] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 11
		bodyModel[45] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 11
		bodyModel[46] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 11
		bodyModel[47] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 11
		bodyModel[48] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 128
		bodyModel[49] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 132
		bodyModel[50] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 132
		bodyModel[51] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 132
		bodyModel[52] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 132
		bodyModel[53] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 11
		bodyModel[54] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 11
		bodyModel[55] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 149
		bodyModel[56] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 180
		bodyModel[57] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 180
		bodyModel[58] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 180
		bodyModel[59] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 180
		bodyModel[60] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 180
		bodyModel[61] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 180
		bodyModel[62] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 180
		bodyModel[63] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 180
		bodyModel[64] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 180
		bodyModel[65] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 180
		bodyModel[66] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 180
		bodyModel[67] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 180
		bodyModel[68] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 180
		bodyModel[69] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 180
		bodyModel[70] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 180
		bodyModel[71] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 180
		bodyModel[72] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 180
		bodyModel[73] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 180
		bodyModel[74] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 180
		bodyModel[75] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 180
		bodyModel[76] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 180
		bodyModel[77] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 52
		bodyModel[78] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 52
		bodyModel[79] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 145
		bodyModel[80] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 145
		bodyModel[81] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 145
		bodyModel[82] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 52
		bodyModel[83] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 52
		bodyModel[84] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 52
		bodyModel[85] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 52
		bodyModel[86] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 52
		bodyModel[87] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 52
		bodyModel[88] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 52
		bodyModel[89] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 52
		bodyModel[90] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 52
		bodyModel[91] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 52
		bodyModel[92] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 52
		bodyModel[93] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 52
		bodyModel[94] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 52
		bodyModel[95] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 52
		bodyModel[96] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 52
		bodyModel[97] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 52
		bodyModel[98] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 52
		bodyModel[99] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 52
		bodyModel[100] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 52
		bodyModel[101] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 52
		bodyModel[102] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 52
		bodyModel[103] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 52
		bodyModel[104] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 52
		bodyModel[105] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 145
		bodyModel[106] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 52
		bodyModel[107] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 52
		bodyModel[108] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 52
		bodyModel[109] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 52
		bodyModel[110] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 52
		bodyModel[111] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 52
		bodyModel[112] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 52
		bodyModel[113] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 52
		bodyModel[114] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 11
		bodyModel[115] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 11
		bodyModel[116] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 11
		bodyModel[117] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 52
		bodyModel[118] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 52
		bodyModel[119] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 52
		bodyModel[120] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 52
		bodyModel[121] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 128
		bodyModel[122] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Light_Rear_Right
		bodyModel[123] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Light_Rear_Left
		bodyModel[124] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Numberboard_Left_Rear
		bodyModel[125] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Numberboard_Right_Rear
		bodyModel[126] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // box
		bodyModel[127] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // box
		bodyModel[128] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // box
		bodyModel[129] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // box
		bodyModel[130] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // box
		bodyModel[131] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // box
		bodyModel[132] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // box
		bodyModel[133] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // box
		bodyModel[134] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // box
		bodyModel[135] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // box
		bodyModel[136] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // box
		bodyModel[137] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // box
		bodyModel[138] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // box
		bodyModel[139] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Ditchlight_Right_Bottom_ns
		bodyModel[140] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // box
		bodyModel[141] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Ditchlight_Left_Bottom_ns
		bodyModel[142] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // box
		bodyModel[143] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 52
		bodyModel[144] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 52
		bodyModel[145] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 52
		bodyModel[146] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 52
		bodyModel[147] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 52
		bodyModel[148] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 52
		bodyModel[149] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // box
		bodyModel[150] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 68
		bodyModel[151] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 68
		bodyModel[152] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 1
		bodyModel[153] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 1
		bodyModel[154] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 1
		bodyModel[155] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 1
		bodyModel[156] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 84
		bodyModel[157] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 84
		bodyModel[158] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 1
		bodyModel[159] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 1
		bodyModel[160] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 1
		bodyModel[161] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 1
		bodyModel[162] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 68
		bodyModel[163] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 68
		bodyModel[164] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 52
		bodyModel[165] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 11
		bodyModel[166] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 11
		bodyModel[167] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 122
		bodyModel[168] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 122
		bodyModel[169] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 52
		bodyModel[170] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 52
		bodyModel[171] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 52
		bodyModel[172] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 145
		bodyModel[173] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 52
		bodyModel[174] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 149
		bodyModel[175] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 149
		bodyModel[176] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 11
		bodyModel[177] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 11
		bodyModel[178] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 11
		bodyModel[179] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 52
		bodyModel[180] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 52
		bodyModel[181] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 52
		bodyModel[182] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 52
		bodyModel[183] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 11
		bodyModel[184] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 11
		bodyModel[185] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 11
		bodyModel[186] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 11
		bodyModel[187] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 11
		bodyModel[188] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Marker_Right_Rear
		bodyModel[189] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Marker_Left_Rear
		bodyModel[190] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 52
		bodyModel[191] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 11
		bodyModel[192] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 11
		bodyModel[193] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 11
		bodyModel[194] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 11
		bodyModel[195] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 11
		bodyModel[196] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Box 11
		bodyModel[197] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 11
		bodyModel[198] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 11
		bodyModel[199] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 11
		bodyModel[200] = new ModelRendererTurbo(this, 9, 113, textureX, textureY); // Box 11
		bodyModel[201] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 11
		bodyModel[202] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 11
		bodyModel[203] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 11
		bodyModel[204] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 11
		bodyModel[205] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 11
		bodyModel[206] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 11
		bodyModel[207] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 11
		bodyModel[208] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 11
		bodyModel[209] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 11
		bodyModel[210] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 11
		bodyModel[211] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 11
		bodyModel[212] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 11
		bodyModel[213] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 11
		bodyModel[214] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 11
		bodyModel[215] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 11
		bodyModel[216] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 11
		bodyModel[217] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 11
		bodyModel[218] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 11
		bodyModel[219] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 11
		bodyModel[220] = new ModelRendererTurbo(this, 9, 137, textureX, textureY); // Box 11
		bodyModel[221] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 11
		bodyModel[222] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 11
		bodyModel[223] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Box 11
		bodyModel[224] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // Box 128
		bodyModel[225] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Light_Front_Left
		bodyModel[226] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Light_Front_Right
		bodyModel[227] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Numberboard_Left
		bodyModel[228] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Numberboard_Right
		bodyModel[229] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 11
		bodyModel[230] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 11
		bodyModel[231] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 11
		bodyModel[232] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 11
		bodyModel[233] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 11
		bodyModel[234] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 11
		bodyModel[235] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 11
		bodyModel[236] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 11
		bodyModel[237] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 11
		bodyModel[238] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 11
		bodyModel[239] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 11
		bodyModel[240] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 11
		bodyModel[241] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 11
		bodyModel[242] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 11
		bodyModel[243] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 11
		bodyModel[244] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 11
		bodyModel[245] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 11
		bodyModel[246] = new ModelRendererTurbo(this, 104, 89, textureX, textureY); // Box 11
		bodyModel[247] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 11
		bodyModel[248] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 11
		bodyModel[249] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 11
		bodyModel[250] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 11
		bodyModel[251] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 11
		bodyModel[252] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 11
		bodyModel[253] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 11
		bodyModel[254] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 11
		bodyModel[255] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Box 11
		bodyModel[256] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 52
		bodyModel[257] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 145
		bodyModel[258] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 145
		bodyModel[259] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Door_Rear
		bodyModel[260] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Door_Rear
		bodyModel[261] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 11
		bodyModel[262] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 11
		bodyModel[263] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 506
		bodyModel[264] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 11
		bodyModel[265] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 11
		bodyModel[266] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // box
		bodyModel[267] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // box
		bodyModel[268] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // box
		bodyModel[269] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 11
		bodyModel[270] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 11
		bodyModel[271] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // box
		bodyModel[272] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // box
		bodyModel[273] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // box
		bodyModel[274] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 52
		bodyModel[275] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 52
		bodyModel[276] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 52
		bodyModel[277] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 52
		bodyModel[278] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 11
		bodyModel[279] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 11
		bodyModel[280] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 11
		bodyModel[281] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 11
		bodyModel[282] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 11
		bodyModel[283] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 409
		bodyModel[284] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 410
		bodyModel[285] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 411
		bodyModel[286] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 412
		bodyModel[287] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 413
		bodyModel[288] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Box 414
		bodyModel[289] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 455
		bodyModel[290] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 456
		bodyModel[291] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Box 457
		bodyModel[292] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 458
		bodyModel[293] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 459
		bodyModel[294] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 11
		bodyModel[295] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 340
		bodyModel[296] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 341
		bodyModel[297] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 342
		bodyModel[298] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 343
		bodyModel[299] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 344
		bodyModel[300] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 345
		bodyModel[301] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 346
		bodyModel[302] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 347
		bodyModel[303] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 350
		bodyModel[304] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 351
		bodyModel[305] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 352
		bodyModel[306] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 353
		bodyModel[307] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 354
		bodyModel[308] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 355
		bodyModel[309] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 356
		bodyModel[310] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 357
		bodyModel[311] = new ModelRendererTurbo(this, 401, 198, textureX, textureY); // Box 359
		bodyModel[312] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 360
		bodyModel[313] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 361
		bodyModel[314] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 362
		bodyModel[315] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 363
		bodyModel[316] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 364
		bodyModel[317] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 365
		bodyModel[318] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 366
		bodyModel[319] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 367
		bodyModel[320] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 368
		bodyModel[321] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Box 369
		bodyModel[322] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Box 370
		bodyModel[323] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 371
		bodyModel[324] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 372
		bodyModel[325] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 88
		bodyModel[326] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 91
		bodyModel[327] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 96
		bodyModel[328] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 95
		bodyModel[329] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 377
		bodyModel[330] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 378
		bodyModel[331] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 379
		bodyModel[332] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 380
		bodyModel[333] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 381
		bodyModel[334] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 382
		bodyModel[335] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 383
		bodyModel[336] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 384
		bodyModel[337] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 385
		bodyModel[338] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 386
		bodyModel[339] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 387
		bodyModel[340] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 388
		bodyModel[341] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 389
		bodyModel[342] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 391
		bodyModel[343] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 392
		bodyModel[344] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 393
		bodyModel[345] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 394
		bodyModel[346] = new ModelRendererTurbo(this, 297, 177, textureX, textureY); // Box 396
		bodyModel[347] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 397
		bodyModel[348] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 398
		bodyModel[349] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 399
		bodyModel[350] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Marker_Front_Right
		bodyModel[351] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Marker_Front_Left
		bodyModel[352] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 52
		bodyModel[353] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Box 403
		bodyModel[354] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 404
		bodyModel[355] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 405
		bodyModel[356] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 406
		bodyModel[357] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 407
		bodyModel[358] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Box 408
		bodyModel[359] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 410
		bodyModel[360] = new ModelRendererTurbo(this, 345, 185, textureX, textureY); // Box 411
		bodyModel[361] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Box 412
		bodyModel[362] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 413
		bodyModel[363] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 414
		bodyModel[364] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 415
		bodyModel[365] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Box 416
		bodyModel[366] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 417
		bodyModel[367] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Box 418
		bodyModel[368] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 419
		bodyModel[369] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 420
		bodyModel[370] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 421
		bodyModel[371] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 422
		bodyModel[372] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 423
		bodyModel[373] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 393
		bodyModel[374] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 394
		bodyModel[375] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Box 402
		bodyModel[376] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 403
		bodyModel[377] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 384
		bodyModel[378] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 385
		bodyModel[379] = new ModelRendererTurbo(this, 281, 193, textureX, textureY); // Box 386
		bodyModel[380] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 210
		bodyModel[381] = new ModelRendererTurbo(this, 401, 185, textureX, textureY); // Box 388
		bodyModel[382] = new ModelRendererTurbo(this, 201, 206, textureX, textureY); // Box 389
		bodyModel[383] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 390
		bodyModel[384] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 391
		bodyModel[385] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 392
		bodyModel[386] = new ModelRendererTurbo(this, 321, 200, textureX, textureY); // Box 390
		bodyModel[387] = new ModelRendererTurbo(this, 384, 358, textureX, textureY); // Box 11
		bodyModel[388] = new ModelRendererTurbo(this, 350, 337, textureX, textureY); // Box 11

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
		bodyModel[10].setRotationPoint(-70.75F, 1F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 131, 1, 22, 0F); // Box 11
		bodyModel[11].setRotationPoint(-65.5F, -1F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 87, 21, 14, 0F); // Box 11
		bodyModel[12].setRotationPoint(-26.5F, -22F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[13].setRotationPoint(-71.75F, 2F, -1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 11
		bodyModel[14].setRotationPoint(-70.75F, 7F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		bodyModel[15].setRotationPoint(-72.75F, -1F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 11
		bodyModel[16].setRotationPoint(-70.5F, -1F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[17].setRotationPoint(-70.75F, 6F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[18].setRotationPoint(-70.5F, 4F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[19].setRotationPoint(-70.5F, 6.5F, 9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[20].setRotationPoint(-70.5F, 3F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[21].setRotationPoint(-70.5F, 5.5F, 9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[22].setRotationPoint(-67.5F, 4F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[23].setRotationPoint(-70.5F, 4F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[24].setRotationPoint(-70.5F, 6.5F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[25].setRotationPoint(-70.5F, 3F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[26].setRotationPoint(-70.5F, 5.5F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.75F, 0F, -2F); // Box 11
		bodyModel[27].setRotationPoint(-67.5F, 4F, -11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[28].setRotationPoint(70.75F, 2F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.75F, 0F, -1F); // Box 11
		bodyModel[29].setRotationPoint(69.75F, 7F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 5, 1, 14, 0F); // Box 11
		bodyModel[30].setRotationPoint(65.5F, -1F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[31].setRotationPoint(69.75F, 6F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 11
		bodyModel[32].setRotationPoint(65.5F, 4F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 11
		bodyModel[33].setRotationPoint(65.5F, 6.5F, -11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[34].setRotationPoint(66.5F, 3F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[35].setRotationPoint(66.5F, 5.5F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, -2F, 0F, 0F, -2F); // Box 11
		bodyModel[36].setRotationPoint(65.5F, 4F, -11F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[37].setRotationPoint(65.5F, 4F, 8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[38].setRotationPoint(65.5F, 6.5F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[39].setRotationPoint(66.5F, 3F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[40].setRotationPoint(66.5F, 5.5F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.75F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[41].setRotationPoint(65.5F, 4F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 135, 2, 14, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[42].setRotationPoint(-67.5F, 0.25F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[43].setRotationPoint(66.5F, -22F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 21, 7, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[44].setRotationPoint(66.5F, -22F, -7F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 11
		bodyModel[45].setRotationPoint(-44.5F, -5F, -10F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 16, 14, 0F); // Box 11
		bodyModel[46].setRotationPoint(-44.5F, -21F, -7F);

		bodyModel[47].addBox(0F, 0F, 0F, 8, 4, 20, 0F); // Box 11
		bodyModel[47].setRotationPoint(-52.5F, -5F, -10F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 128
		bodyModel[48].setRotationPoint(67.5F, -22.5F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 132
		bodyModel[49].setRotationPoint(-48F, 0F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 132
		bodyModel[50].setRotationPoint(-47.5F, 1.5F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 132
		bodyModel[51].setRotationPoint(45F, 0F, -11F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 132
		bodyModel[52].setRotationPoint(45.5F, 1.5F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[53].setRotationPoint(-43.5F, -5F, 10F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[54].setRotationPoint(-41.5F, -5F, 10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 8, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 149
		bodyModel[55].setRotationPoint(-25.5F, -21.7F, -7.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 180
		bodyModel[56].setRotationPoint(40.25F, -23.25F, -4.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[57].setRotationPoint(43.25F, -23.25F, -1.5F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[58].setRotationPoint(37.25F, -23.25F, -1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[59].setRotationPoint(43.25F, -23.25F, 1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 180
		bodyModel[60].setRotationPoint(37.25F, -23.25F, 1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[61].setRotationPoint(43.25F, -23.25F, -4.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[62].setRotationPoint(37.25F, -23.25F, -4.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 180
		bodyModel[63].setRotationPoint(59.5F, -23.25F, -4.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[64].setRotationPoint(62.5F, -23.25F, -1.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[65].setRotationPoint(56.5F, -23.25F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[66].setRotationPoint(62.5F, -23.25F, 1.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 180
		bodyModel[67].setRotationPoint(56.5F, -23.25F, 1.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[68].setRotationPoint(62.5F, -23.25F, -4.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[69].setRotationPoint(56.5F, -23.25F, -4.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 180
		bodyModel[70].setRotationPoint(49.75F, -23.25F, -4.5F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[71].setRotationPoint(52.75F, -23.25F, -1.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 180
		bodyModel[72].setRotationPoint(46.75F, -23.25F, -1.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[73].setRotationPoint(52.75F, -23.25F, 1.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 180
		bodyModel[74].setRotationPoint(46.75F, -23.25F, 1.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[75].setRotationPoint(52.75F, -23.25F, -4.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[76].setRotationPoint(46.75F, -23.25F, -4.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[77].setRotationPoint(-22.5F, -8F, 11F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[78].setRotationPoint(-36.5F, -8F, 11F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 105, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[79].setRotationPoint(-39.5F, -9F, 10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[80].setRotationPoint(-44.5F, -13F, 10.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[81].setRotationPoint(-42.5F, -13F, 10.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[82].setRotationPoint(-30.5F, -8F, 11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[83].setRotationPoint(-14.5F, -8F, 11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[84].setRotationPoint(-6.5F, -8F, 11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[85].setRotationPoint(1.5F, -8F, 11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[86].setRotationPoint(9.5F, -8F, 11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[87].setRotationPoint(17.5F, -8F, 11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[88].setRotationPoint(25.5F, -8F, 11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[89].setRotationPoint(33.5F, -8F, 11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[90].setRotationPoint(41.5F, -8F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[91].setRotationPoint(49.5F, -8F, 11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[92].setRotationPoint(56.5F, -8F, 11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[93].setRotationPoint(65.01F, -2F, 10.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[94].setRotationPoint(65F, -8F, 9.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.51F, 0F, -1F, 0.01F, 0F, -1F, 0.01F, 0F, 0.5F, -0.51F, 0F, 0.5F); // Box 52
		bodyModel[95].setRotationPoint(65F, -7F, 9.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[96].setRotationPoint(65F, -9F, 9.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[97].setRotationPoint(40.5F, -8F, -12F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[98].setRotationPoint(48.5F, -8F, -12F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[99].setRotationPoint(56.5F, -8F, -12F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[100].setRotationPoint(63.5F, -8F, -12F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[101].setRotationPoint(65.01F, -2F, -11.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[102].setRotationPoint(65F, -8F, -10.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.51F, 0F, 0.5F, 0.01F, 0F, 0.5F, 0.01F, 0F, -1F, -0.51F, 0F, -1F); // Box 52
		bodyModel[103].setRotationPoint(65F, -7F, -10.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[104].setRotationPoint(65F, -9F, -11.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 92, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[105].setRotationPoint(-26.5F, -9F, -11.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[106].setRotationPoint(-66.01F, -2F, -11.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 1F, 0.25F, 0F, 1F, 0.01F, 0F, 0.5F, -0.51F, 0F, 0.5F, -0.51F, 0F, -1F, 0.01F, 0F, -1F); // Box 52
		bodyModel[107].setRotationPoint(-66F, -8F, -10.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[108].setRotationPoint(-66.01F, -2F, 10.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[109].setRotationPoint(-73.86F, -8F, -3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -1.35F, 0F, -0.6F, -1.35F, 0F, -0.6F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.65F, 0F, -0.6F, 0.65F, 0F); // Box 52
		bodyModel[110].setRotationPoint(-73.86F, -9F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[111].setRotationPoint(-72.25F, -8F, 8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[112].setRotationPoint(-73.86F, -8F, 2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.6F, -1.35F, 0F, -0.1F, -1.35F, 0F, -0.1F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, 0.65F, 0F, -0.1F, 0.65F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.1F, 0F); // Box 52
		bodyModel[113].setRotationPoint(-73.86F, -9F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[114].setRotationPoint(-70.75F, -1F, -9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 5, 20, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[115].setRotationPoint(69.75F, 1F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[116].setRotationPoint(69.75F, -1F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[117].setRotationPoint(70F, -2F, 10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[118].setRotationPoint(70F, -2F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[119].setRotationPoint(-71F, -2F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[120].setRotationPoint(-71F, -2F, 10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 128
		bodyModel[121].setRotationPoint(67.6F, -19F, -2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Light_Rear_Right
		bodyModel[122].setRotationPoint(69.6F, -19F, -0.1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Light_Rear_Left
		bodyModel[123].setRotationPoint(69.6F, -19F, -1.9F);

		bodyModel[124].addBox(0F, 0F, -5.2F, 1, 2, 4, 0F); // Numberboard_Left_Rear
		bodyModel[124].setRotationPoint(68.5F, -16.75F, 0F);
		bodyModel[124].rotateAngleY = -0.40142573F;

		bodyModel[125].addBox(0F, 0F, 1.2F, 1, 2, 4, 0F); // Numberboard_Right_Rear
		bodyModel[125].setRotationPoint(68.5F, -16.75F, 0F);
		bodyModel[125].rotateAngleY = 0.40142573F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[126].setRotationPoint(-71F, 2.5F, 4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F); // box
		bodyModel[127].setRotationPoint(-71F, 2.5F, -7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // box
		bodyModel[128].setRotationPoint(70F, 2F, -7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // box
		bodyModel[129].setRotationPoint(71F, 2.2F, -6.88F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // box
		bodyModel[130].setRotationPoint(70.5F, 2.2F, -6.88F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F); // box
		bodyModel[131].setRotationPoint(70F, 2F, 4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // box
		bodyModel[132].setRotationPoint(70.5F, 2.2F, 4.12F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1.25F, 0F, -1F, -1.25F); // box
		bodyModel[133].setRotationPoint(-51.5F, -20F, -12F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -1.25F, -2F, -1F, -1.25F); // box
		bodyModel[134].setRotationPoint(-53.5F, -20F, -12F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, -2F, -1F, 0.5F, -2F, -1F, -1.25F, 0F, -1F, -1.25F); // box
		bodyModel[135].setRotationPoint(-47.5F, -20F, -12F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0.5F, 0F, -1F, 0.5F); // box
		bodyModel[136].setRotationPoint(-51.5F, -20F, 11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, -1F, 0.5F, -2F, -1F, 0.5F); // box
		bodyModel[137].setRotationPoint(-53.5F, -20F, 11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.25F, -2F, -1F, -1.25F, -2F, -1F, 0.5F, 0F, -1F, 0.5F); // box
		bodyModel[138].setRotationPoint(-47.5F, -20F, 11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Right_Bottom_ns
		bodyModel[139].setRotationPoint(-72.05F, 0F, 5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // box
		bodyModel[140].setRotationPoint(-71.3F, 0.5F, 5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Ditchlight_Left_Bottom_ns
		bodyModel[141].setRotationPoint(-72.05F, 0F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, -0.45F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, -0.45F, -0.6F, -0.1F, 0F, -0.6F, -0.1F); // box
		bodyModel[142].setRotationPoint(-71.3F, 0.5F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, -0.75F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[143].setRotationPoint(67.35F, -18F, -5F);
		bodyModel[143].rotateAngleY = -0.40142573F;

		bodyModel[144].addShapeBox(0F, 0F, -0.75F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[144].setRotationPoint(67.35F, -21.25F, -5F);
		bodyModel[144].rotateAngleY = -0.40142573F;

		bodyModel[145].addShapeBox(0F, 0F, -0.75F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[145].setRotationPoint(67.35F, -14.75F, -5F);
		bodyModel[145].rotateAngleY = -0.40142573F;

		bodyModel[146].addShapeBox(0F, 0F, -0.75F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[146].setRotationPoint(67.35F, -11.5F, -5F);
		bodyModel[146].rotateAngleY = -0.40142573F;

		bodyModel[147].addShapeBox(0F, 0F, -0.75F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[147].setRotationPoint(67.35F, -8.25F, -5F);
		bodyModel[147].rotateAngleY = -0.40142573F;

		bodyModel[148].addShapeBox(0F, 0F, -0.75F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[148].setRotationPoint(67.35F, -5F, -5F);
		bodyModel[148].rotateAngleY = -0.40142573F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // box
		bodyModel[149].setRotationPoint(71F, 2.2F, 4.12F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[150].setRotationPoint(-24.5F, 1F, 7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 48, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[151].setRotationPoint(-24.5F, 1F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[152].setRotationPoint(-21.5F, 0F, 9F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[153].setRotationPoint(-21.5F, 0F, 10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[154].setRotationPoint(-21.5F, 1F, 9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1
		bodyModel[155].setRotationPoint(-21.5F, 1F, 10F);

		bodyModel[156].addBox(0F, 0F, -2F, 1, 1, 3, 0F); // Box 84
		bodyModel[156].setRotationPoint(-24F, 1F, 9.5F);
		bodyModel[156].rotateAngleX = 0.52359878F;

		bodyModel[157].addBox(0F, 0F, -1F, 1, 1, 3, 0F); // Box 84
		bodyModel[157].setRotationPoint(-24F, 1F, -9.5F);
		bodyModel[157].rotateAngleX = -0.52359878F;

		bodyModel[158].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[158].setRotationPoint(-21.5F, 0F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[159].setRotationPoint(-21.5F, 0F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[160].setRotationPoint(-21.5F, 1F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1
		bodyModel[161].setRotationPoint(-21.5F, 1F, -10F);

		bodyModel[162].addBox(0F, 0F, 0F, 48, 3, 22, 0F); // Box 68
		bodyModel[162].setRotationPoint(-24.5F, 2F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 48, 3, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 68
		bodyModel[163].setRotationPoint(-24.5F, 5F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, -2.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[164].setRotationPoint(67.35F, -8.25F, 5F);
		bodyModel[164].rotateAngleY = 0.40142573F;

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[165].setRotationPoint(-43.5F, -3.25F, 6.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[166].setRotationPoint(-43.5F, -4.75F, 6.5F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 122
		bodyModel[167].setRotationPoint(62F, -7F, 5.65F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[168].setRotationPoint(61F, -8F, 5.75F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 52
		bodyModel[169].setRotationPoint(-71F, -8F, -10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 52
		bodyModel[170].setRotationPoint(-71F, -8F, 9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[171].setRotationPoint(-72.25F, -8F, -9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 145
		bodyModel[172].setRotationPoint(-71.5F, -9F, -8.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 52
		bodyModel[173].setRotationPoint(63.5F, -8F, 11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 19, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[174].setRotationPoint(27F, -19.5F, -7.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 19, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[175].setRotationPoint(46.5F, -19.5F, -7.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[176].setRotationPoint(70.75F, -1F, -9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[177].setRotationPoint(72.75F, -1F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[178].setRotationPoint(72.75F, -1F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[179].setRotationPoint(71.25F, -8F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 52
		bodyModel[180].setRotationPoint(70F, -8F, 9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 52
		bodyModel[181].setRotationPoint(70F, -8F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[182].setRotationPoint(71.25F, -8F, 8F);

		bodyModel[183].addBox(0F, 0F, 0F, 5, 21, 14, 0F); // Box 11
		bodyModel[183].setRotationPoint(-43.5F, -22F, -7F);

		bodyModel[184].addBox(0F, 0F, 0F, 12, 6, 14, 0F); // Box 11
		bodyModel[184].setRotationPoint(-38.5F, -22F, -7F);

		bodyModel[185].addBox(0F, 0F, 0F, 12, 11, 14, 0F); // Box 11
		bodyModel[185].setRotationPoint(-38.5F, -12F, -7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 24, 4, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[186].setRotationPoint(-38.5F, -16F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 24, 4, 0, 0F,0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[187].setRotationPoint(-38.5F, -16F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Right_Rear
		bodyModel[188].setRotationPoint(67F, -19.5F, -1F);

		bodyModel[189].addShapeBox(0F, 0F, -7F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Left_Rear
		bodyModel[189].setRotationPoint(67F, -19.5F, 1F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, -0.35F, -0.5F, 0F, -0.15F, -0.5F, 0F, -1.5F, 0F, -0.5F, 1F, 0F, -0.5F, -0.35F, 0F, 0F, -0.15F, 0F, 0F); // Box 52
		bodyModel[190].setRotationPoint(-73.5F, -9F, -8.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -5F, 0F); // Box 11
		bodyModel[191].setRotationPoint(-67.5F, -1F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[192].setRotationPoint(-70.5F, -1F, -8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[193].setRotationPoint(-70.5F, -1F, 7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.75F, -0.5F, 0F); // Box 11
		bodyModel[194].setRotationPoint(68.5F, -1F, 7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[195].setRotationPoint(68.5F, -1F, -8F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,-2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[196].setRotationPoint(-67.5F, -1F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[197].setRotationPoint(-67.5F, -1F, 7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 11
		bodyModel[198].setRotationPoint(-67.5F, -1F, 7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F); // Box 11
		bodyModel[199].setRotationPoint(65.5F, -1F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, -5F, 0F, -2F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[200].setRotationPoint(65.5F, -1F, -11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[201].setRotationPoint(65.5F, -1F, 7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, -2F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[202].setRotationPoint(65.5F, -1F, 7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.7F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[203].setRotationPoint(-70.5F, 1.5F, -9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[204].setRotationPoint(-70.5F, 0.5F, -7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[205].setRotationPoint(-70.5F, 1.5F, 7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[206].setRotationPoint(-70.5F, 0.5F, 7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[207].setRotationPoint(66.5F, 1.5F, 7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[208].setRotationPoint(67.5F, 0.5F, 7F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.7F, -0.5F, 0F); // Box 11
		bodyModel[209].setRotationPoint(66.5F, 1.5F, -9F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-0.85F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.85F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 11
		bodyModel[210].setRotationPoint(67.5F, 0.5F, -7F);

		bodyModel[211].addBox(0F, 0F, 0F, 12, 19, 1, 0F); // Box 11
		bodyModel[211].setRotationPoint(-55.5F, -20F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[212].setRotationPoint(-55.5F, -22F, -11F);

		bodyModel[213].addBox(0F, 0F, 0F, 3, 11, 1, 0F); // Box 11
		bodyModel[213].setRotationPoint(-58.5F, -12F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F); // Box 11
		bodyModel[214].setRotationPoint(-56.5F, -22F, -11F);

		bodyModel[215].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 11
		bodyModel[215].setRotationPoint(-57.5F, -22F, -7F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,-1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[216].setRotationPoint(-59.5F, -22F, -7F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 11
		bodyModel[217].setRotationPoint(-58.5F, -20F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3.65F, 0F, 0F, -1.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, -0.7F, 0F, 0F); // Box 11
		bodyModel[218].setRotationPoint(-59.5F, -20F, -11F);

		bodyModel[219].addBox(0F, 0F, 0F, 12, 19, 1, 0F); // Box 11
		bodyModel[219].setRotationPoint(-55.5F, -20F, 10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 11
		bodyModel[220].setRotationPoint(-55.5F, -22F, 7F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1.3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[221].setRotationPoint(-56.5F, -22F, 7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.7F, 0F, 0F); // Box 11
		bodyModel[222].setRotationPoint(-59.5F, -22F, 0F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,0.375F, 0F, 0F, -0.375F, 0F, 0F, -3.875F, 0F, 0F, 3.875F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 11
		bodyModel[223].setRotationPoint(-56.15F, -20F, -11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 128
		bodyModel[224].setRotationPoint(-60.05F, -21.9F, -2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Front_Left
		bodyModel[225].setRotationPoint(-61.05F, -21.9F, -1.9F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Light_Front_Right
		bodyModel[226].setRotationPoint(-61.05F, -21.9F, -0.1F);

		bodyModel[227].addShapeBox(-0.15F, 0F, 1.25F, 1, 2, 4, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Numberboard_Left
		bodyModel[227].setRotationPoint(-57.75F, -22F, -7F);
		bodyModel[227].rotateAngleY = 0.31415927F;

		bodyModel[228].addShapeBox(-0.15F, 0F, -5.25F, 1, 2, 4, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Numberboard_Right
		bodyModel[228].setRotationPoint(-57.75F, -22F, 7F);
		bodyModel[228].rotateAngleY = -0.31415927F;

		bodyModel[229].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Box 11
		bodyModel[229].setRotationPoint(-57.5F, -21F, -7F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 11
		bodyModel[230].setRotationPoint(-59.5F, -16F, -2F);

		bodyModel[231].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 11
		bodyModel[231].setRotationPoint(-59.5F, -16F, 2F);

		bodyModel[232].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // Box 11
		bodyModel[232].setRotationPoint(-58.5F, -5F, -10F);

		bodyModel[233].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // Box 11
		bodyModel[233].setRotationPoint(-58.5F, -5F, 2F);

		bodyModel[234].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 11
		bodyModel[234].setRotationPoint(-54.5F, -3F, -2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 13, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 11
		bodyModel[235].setRotationPoint(-59.5F, -14F, -8F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[236].setRotationPoint(-59.5F, -16F, 4F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 11
		bodyModel[237].setRotationPoint(-48.5F, -9F, 6F);

		bodyModel[238].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 11
		bodyModel[238].setRotationPoint(-50.5F, -10F, 4F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 11
		bodyModel[239].setRotationPoint(-48.5F, -9F, -7F);

		bodyModel[240].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 11
		bodyModel[240].setRotationPoint(-50.5F, -10F, -9F);

		bodyModel[241].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 11
		bodyModel[241].setRotationPoint(-59.5F, -16F, -4F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[242].setRotationPoint(-59.5F, -16F, -6F);

		bodyModel[243].addBox(0F, 0F, 0F, 7, 8, 1, 0F); // Box 11
		bodyModel[243].setRotationPoint(-58.5F, -13F, 2F);

		bodyModel[244].addBox(0F, 0F, 0F, 7, 1, 8, 0F); // Box 11
		bodyModel[244].setRotationPoint(-58.5F, -14F, 2F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 11
		bodyModel[245].setRotationPoint(-57.5F, -16F, 2F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 11
		bodyModel[246].setRotationPoint(-56.5F, -16F, 2F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 11
		bodyModel[247].setRotationPoint(-57.5F, -16F, 2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 11
		bodyModel[248].setRotationPoint(-55F, -16F, 7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 11
		bodyModel[249].setRotationPoint(-55.5F, -16F, 9F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 11
		bodyModel[250].setRotationPoint(-53.5F, -15F, 5F);

		bodyModel[251].addBox(0F, 0F, 0F, 5, 8, 2, 0F); // Box 11
		bodyModel[251].setRotationPoint(-58.5F, -13F, -4F);

		bodyModel[252].addBox(0F, 0F, 0F, 5, 1, 8, 0F); // Box 11
		bodyModel[252].setRotationPoint(-58.5F, -14F, -10F);

		bodyModel[253].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 11
		bodyModel[253].setRotationPoint(-53.5F, -14F, -4F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 15, 3, 0F); // Box 11
		bodyModel[254].setRotationPoint(-44.5F, -20F, -10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[255].setRotationPoint(-44.5F, -21F, -10F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, 1F, -0.75F, 0F, 1F, -0.75F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.01F, 0F, -1F, -0.51F, 0F, -1F, -0.51F, 0F, 0.5F, 0.01F, 0F, 0.5F); // Box 52
		bodyModel[256].setRotationPoint(-66F, -8F, 9.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 145
		bodyModel[257].setRotationPoint(-66.75F, -9F, -9F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 145
		bodyModel[258].setRotationPoint(-66.75F, -9F, 7F);

		bodyModel[259].addBox(-1F, 0F, -3F, 1, 15, 3, 0F); // Door_Rear
		bodyModel[259].setRotationPoint(-43.5F, -20F, 10F);

		bodyModel[260].addShapeBox(-1F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Door_Rear
		bodyModel[260].setRotationPoint(-43.5F, -21F, 10F);

		bodyModel[261].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 11
		bodyModel[261].setRotationPoint(-46.5F, -15F, 4F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 5, 5, 0F); // Box 11
		bodyModel[262].setRotationPoint(-46.5F, -15F, -9F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 506
		bodyModel[263].setRotationPoint(72.75F, -1F, -3F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, -1.75F, 0F, 0F, -2.85F, 0F, 0F, 2.08F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -2.1F, 0F, 0F, 1.33F, 0F, 0F); // Box 11
		bodyModel[264].setRotationPoint(-70.5F, 4F, -11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, -1.75F, 0F, 0F, -2.04F, 0F, 0F, 1.28F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1.28F, 0F, 0F, 0.53F, 0F, 0F); // Box 11
		bodyModel[265].setRotationPoint(-72.4F, 4F, -4F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F); // box
		bodyModel[266].setRotationPoint(-71F, 2.7F, -7.12F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.75F, 0F, 0F, 1F, 0F, 0F); // box
		bodyModel[267].setRotationPoint(-72F, 3.7F, -7.12F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.5F, 0F, 0F, 0.75F, 0F, 0F); // box
		bodyModel[268].setRotationPoint(-72.5F, 6.7F, -7.12F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,2.08F, 0F, 0F, -2.85F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 1.33F, 0F, 0F, -2.1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[269].setRotationPoint(-70.5F, 4F, 7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1.28F, 0F, 0F, -2.04F, 0F, 0F, -1.75F, 0F, 0F, 1F, 0F, 0F, 0.53F, 0F, 0F, -1.28F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[270].setRotationPoint(-72.4F, 4F, 3F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.25F, 1F, 0F, -0.25F); // box
		bodyModel[271].setRotationPoint(-71F, 2.7F, 4.12F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, 0F, -1.75F, 0F, 0F, -1.25F, 0F, -0.25F, 0.5F, 0F, -0.25F); // box
		bodyModel[272].setRotationPoint(-72F, 3.7F, 4.12F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0.75F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // box
		bodyModel[273].setRotationPoint(-72.5F, 6.7F, 4.12F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[274].setRotationPoint(-71.25F, 1F, -8.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[275].setRotationPoint(-71.25F, 1F, 1.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[276].setRotationPoint(70.75F, 1F, -8.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[277].setRotationPoint(70.75F, 1F, 1.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,1.5F, 0F, 0F, -2.25F, 0F, 0F, -4F, -1F, 0F, 3.25F, -1F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -3.19F, 0F, 0F, 2.43F, 0F, 0F); // Box 11
		bodyModel[278].setRotationPoint(-71.25F, 2F, -11F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F,3.25F, -1F, 0F, -3.9F, -1F, 0F, -2.25F, 0F, 0F, 1.5F, 0F, 0F, 2.43F, 0F, 0F, -3.19F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F); // Box 11
		bodyModel[279].setRotationPoint(-71.25F, 2F, 3F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 0.25F, -0.5F, 0F, -1F, -0.5F, 0F, -4F, -0.5F, 0F, 3.25F, -0.5F, 0F); // Box 11
		bodyModel[280].setRotationPoint(-70.75F, 6F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0.26F, 0F, 0F, -1.02F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, -1F, -1.25F, 0F, -1F, -4F, 0F, 0F, 3.25F, 0F, 0F); // Box 11
		bodyModel[281].setRotationPoint(-71F, 8.5F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 3, 11, 0F,3F, 0F, 0F, -3.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 3.25F, -0.5F, 0F, -4F, -0.5F, 0F, -1F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 11
		bodyModel[282].setRotationPoint(-70.75F, 6F, 0F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[283].setRotationPoint(72.25F, 2F, -2F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F); // Box 410
		bodyModel[284].setRotationPoint(71.25F, 1F, -2F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[285].setRotationPoint(71.25F, 1F, 1F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F); // Box 412
		bodyModel[286].setRotationPoint(-72.25F, 1F, -2F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 413
		bodyModel[287].setRotationPoint(-72.25F, 1F, 1F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 414
		bodyModel[288].setRotationPoint(-73.25F, 2F, -2F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,3F, 0F, 0F, -3.75F, 0F, 0F, -1.02F, 0F, 0F, 0.26F, 0F, 0F, 3.25F, 0F, 0F, -4F, 0F, 0F, -1.25F, 0F, -1F, 0.5F, 0F, -1F); // Box 455
		bodyModel[289].setRotationPoint(-71F, 8.5F, 0F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[290].setRotationPoint(8.5F, 0F, -10F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[291].setRotationPoint(8.5F, 0F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[292].setRotationPoint(8.5F, 1F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 459
		bodyModel[293].setRotationPoint(8.5F, 1F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[294].setRotationPoint(-68.5F, -15F, -2F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 340
		bodyModel[295].setRotationPoint(-73.75F, -1F, 3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[296].setRotationPoint(-73.75F, -1F, -3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[297].setRotationPoint(-73.75F, -1F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, -0.25F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[298].setRotationPoint(66.35F, -23F, -5F);
		bodyModel[298].rotateAngleY = -0.40142573F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 344
		bodyModel[299].setRotationPoint(-25.5F, -13.7F, -7.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 12, 4, 14, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[300].setRotationPoint(-38.5F, -16F, -7F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 346
		bodyModel[301].setRotationPoint(41.5F, -14F, -7.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 15, 11, 4, 0F); // Box 347
		bodyModel[302].setRotationPoint(-43.5F, -12F, -11F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 350
		bodyModel[303].setRotationPoint(32.5F, -8F, -12F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 351
		bodyModel[304].setRotationPoint(24.5F, -8F, -12F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 352
		bodyModel[305].setRotationPoint(16.5F, -8F, -12F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 353
		bodyModel[306].setRotationPoint(8.5F, -8F, -12F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 354
		bodyModel[307].setRotationPoint(0.5F, -8F, -12F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 355
		bodyModel[308].setRotationPoint(-7.5F, -8F, -12F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 356
		bodyModel[309].setRotationPoint(-15.5F, -8F, -12F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 357
		bodyModel[310].setRotationPoint(-23.5F, -8F, -12F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 359
		bodyModel[311].setRotationPoint(-28.5F, -18F, -12F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 360
		bodyModel[312].setRotationPoint(-35.5F, -18F, -12F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 361
		bodyModel[313].setRotationPoint(-44.5F, -19F, -11.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 362
		bodyModel[314].setRotationPoint(-27F, -18.5F, -12F);

		bodyModel[315].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 363
		bodyModel[315].setRotationPoint(33.5F, -23.25F, -1.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[316].setRotationPoint(33.5F, -23.25F, 1.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[317].setRotationPoint(33.5F, -23.25F, -4.5F);

		bodyModel[318].addBox(0F, 0F, 0F, 3, 2, 9, 0F); // Box 366
		bodyModel[318].setRotationPoint(30.5F, -23.25F, -4.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[319].setRotationPoint(27.5F, -23.25F, -4.5F);

		bodyModel[320].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 368
		bodyModel[320].setRotationPoint(27.5F, -23.25F, -1.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 369
		bodyModel[321].setRotationPoint(27.5F, -23.25F, 1.5F);

		bodyModel[322].addBox(0F, 0F, 0F, 2, 21, 14, 0F); // Box 370
		bodyModel[322].setRotationPoint(64.5F, -22F, -7F);

		bodyModel[323].addBox(0F, 0F, 0F, 4, 13, 14, 0F); // Box 371
		bodyModel[323].setRotationPoint(60.5F, -22F, -7F);

		bodyModel[324].addBox(0F, 0F, 0F, 4, 8, 13, 0F); // Box 372
		bodyModel[324].setRotationPoint(60.5F, -9F, -7F);

		bodyModel[325].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 88
		bodyModel[325].setRotationPoint(-22.5F, -22.5F, -0.5F);

		bodyModel[326].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 91
		bodyModel[326].setRotationPoint(-22.5F, -23.5F, -1.5F);

		bodyModel[327].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 96
		bodyModel[327].setRotationPoint(-23.5F, -23.5F, -0.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[328].setRotationPoint(-21.5F, -24F, -2F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F); // Box 377
		bodyModel[329].setRotationPoint(-21F, -24F, 0F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.35F, -0.35F); // Box 378
		bodyModel[330].setRotationPoint(-24.5F, -24F, -1F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[331].setRotationPoint(-21.5F, -23.5F, 0.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,-4F, -5F, 0F, 1.35F, -3F, 0F, 0.5F, 1F, -2F, 0F, 0F, 0F, -4F, 4F, 0F, 1.35F, 2F, 0F, 0.5F, -1F, -2F, 0F, 0F, 0F); // Box 380
		bodyModel[332].setRotationPoint(-68.5F, -15F, -11F);

		bodyModel[333].addBox(0F, 0F, 0F, 1, 13, 4, 0F); // Box 381
		bodyModel[333].setRotationPoint(-68.5F, -14F, -2F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 382
		bodyModel[334].setRotationPoint(-64.5F, -10F, -11F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, -4F, 0F, -1F, -4F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 383
		bodyModel[335].setRotationPoint(-64.5F, -14F, -11F);

		bodyModel[336].addBox(0F, 0F, 0F, 6, 9, 1, 0F); // Box 384
		bodyModel[336].setRotationPoint(-64.5F, -10F, -11F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -2F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[337].setRotationPoint(-64.5F, -12F, -11F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 386
		bodyModel[338].setRotationPoint(-59.5F, -12F, -11F);

		bodyModel[339].addBox(0F, 0F, 0F, 6, 9, 1, 0F); // Box 387
		bodyModel[339].setRotationPoint(-64.5F, -10F, 10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 9, 9, 0F,4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[340].setRotationPoint(-64.5F, -10F, 2F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,4F, 0F, 0F, -4F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[341].setRotationPoint(-64.5F, -14F, 2F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 391
		bodyModel[342].setRotationPoint(-59.5F, -12F, 10F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 8, 11, 0F,3.875F, 0F, 0F, -3.875F, 0F, 0F, -0.375F, 0F, 0F, 0.375F, 0F, 0F, 6.5F, 0F, 0F, -6.5F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 392
		bodyModel[343].setRotationPoint(-56.15F, -20F, 0F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F); // Box 393
		bodyModel[344].setRotationPoint(-58.5F, -20F, 10F);

		bodyModel[345].addBox(0F, 0F, 0F, 3, 11, 1, 0F); // Box 394
		bodyModel[345].setRotationPoint(-58.5F, -12F, 10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -2F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[346].setRotationPoint(-64.5F, -12F, 10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, -2F, 0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[347].setRotationPoint(-68.5F, -15F, -4F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0.5F, 1F, -2F, 1.35F, -3F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0.5F, -1F, -2F, 1.35F, 2F, 0F, -4F, 4F, 0F); // Box 398
		bodyModel[348].setRotationPoint(-68.5F, -15F, 2F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, -2F); // Box 399
		bodyModel[349].setRotationPoint(-68.5F, -15F, 2F);

		bodyModel[350].addShapeBox(0F, 0F, 5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Front_Right
		bodyModel[350].setRotationPoint(-58.25F, -22F, 1F);

		bodyModel[351].addShapeBox(0F, 0F, -7F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F); // Marker_Front_Left
		bodyModel[351].setRotationPoint(-58.25F, -22F, -1F);

		bodyModel[352].addShapeBox(0F, 0F, 1.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[352].setRotationPoint(-69.5F, -13F, 2F);
		bodyModel[352].rotateAngleY = -0.41887902F;

		bodyModel[353].addShapeBox(0F, 0F, 1.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 403
		bodyModel[353].setRotationPoint(-69.5F, -9.5F, 2F);
		bodyModel[353].rotateAngleY = -0.41887902F;

		bodyModel[354].addShapeBox(0F, 0F, 1.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 404
		bodyModel[354].setRotationPoint(-69.5F, -6F, 2F);
		bodyModel[354].rotateAngleY = -0.41887902F;

		bodyModel[355].addShapeBox(0F, 0F, -4.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 405
		bodyModel[355].setRotationPoint(-69.5F, -6F, -2F);
		bodyModel[355].rotateAngleY = 0.41887902F;

		bodyModel[356].addShapeBox(0F, 0F, -4.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[356].setRotationPoint(-69.5F, -9.5F, -2F);
		bodyModel[356].rotateAngleY = 0.41887902F;

		bodyModel[357].addShapeBox(0F, 0F, -4.25F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 407
		bodyModel[357].setRotationPoint(-69.5F, -13F, -2F);
		bodyModel[357].rotateAngleY = 0.41887902F;

		bodyModel[358].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Box 408
		bodyModel[358].setRotationPoint(-56F, -15F, 7F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[359].setRotationPoint(-59.5F, -13F, -10F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[360].setRotationPoint(-59.5F, -13F, 8F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.15F, -0.5F, 0F, -0.35F, -0.5F, 0F, 1F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -0.15F, 0F, 0F, -0.35F, 0F, 0F, 1F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Box 412
		bodyModel[361].setRotationPoint(-73.5F, -9F, 2.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.35F, 0F, 0F); // Box 413
		bodyModel[362].setRotationPoint(-71.5F, -9F, 7.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -1.35F, 0F, -0.1F, -1.35F, 0F, -0.1F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, 0.65F, 0F, -0.1F, 0.65F, 0F); // Box 414
		bodyModel[363].setRotationPoint(72.86F, -9F, -2F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.1F, -1.35F, 0F, -0.6F, -1.35F, 0F, -0.6F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, 0.65F, 0F, -0.6F, 0.65F, 0F, -0.6F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 415
		bodyModel[364].setRotationPoint(72.86F, -9F, 0F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 416
		bodyModel[365].setRotationPoint(72.86F, -8F, 2F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.35F, -0.5F, 0F, -0.15F, -0.5F, 0F, -1.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, -0.35F, 0F, 0F, -0.15F, 0F, 0F, -1.5F, 0F, -0.5F, 1F, 0F, -0.5F); // Box 417
		bodyModel[366].setRotationPoint(72.5F, -9F, 2.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,1F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F, -0.15F, -0.5F, 0F, -0.35F, -0.5F, 0F, 1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.15F, 0F, 0F, -0.35F, 0F, 0F); // Box 418
		bodyModel[367].setRotationPoint(72.5F, -9F, -8.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[368].setRotationPoint(72.86F, -8F, -3F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 420
		bodyModel[369].setRotationPoint(70.5F, -9F, -8.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[370].setRotationPoint(70.5F, -9F, 7.5F);

		bodyModel[371].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 422
		bodyModel[371].setRotationPoint(-66F, -15.3F, -4F);

		bodyModel[372].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 423
		bodyModel[372].setRotationPoint(-66F, -15.3F, 3F);

		bodyModel[373].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 393
		bodyModel[373].setRotationPoint(-23F, 1F, 9.5F);

		bodyModel[374].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 394
		bodyModel[374].setRotationPoint(-23F, 1F, 6.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[375].setRotationPoint(29F, 1F, 6.5F);

		bodyModel[376].addBox(0F, 0F, 0F, 27, 0, 1, 0F); // Box 403
		bodyModel[376].setRotationPoint(3F, 1F, 9.5F);

		bodyModel[377].addBox(0F, 0F, 0F, 58, 0, 1, 0F); // Box 384
		bodyModel[377].setRotationPoint(-23F, 1F, -10.5F);

		bodyModel[378].addBox(0F, 0F, 0F, 1, 0, 3, 0F); // Box 385
		bodyModel[378].setRotationPoint(-23F, 1F, -9.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 0, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[379].setRotationPoint(34F, 1F, -9.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 210
		bodyModel[380].setRotationPoint(-54F, -22.65F, 4.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 388
		bodyModel[381].setRotationPoint(-43.5F, -12F, 11F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-3.65F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -4F, 0F, 0F, -0.7F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, -1.35F, 0F, 0F); // Box 389
		bodyModel[382].setRotationPoint(-59.5F, -20F, 10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[383].setRotationPoint(-28.5F, -4F, -10.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[384].setRotationPoint(-28.5F, -7.5F, -10.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[385].setRotationPoint(-28.5F, -11F, -10.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 6, 7, 0F,-1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -5F, 0F, 0F, -5F, -2.5F, -4F, -1.5F, 1.5F, -4F, -1.5F, 0F, -4F, -4F, -1F, -4F, -4F); // Box 390
		bodyModel[386].setRotationPoint(-57.49F, -16F, 2F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,3.51F, 0F, 0F, -3.51F, 0F, 0F, -0.01F, 0F, 0F, 0.01F, 0F, 0F, 3.7F, -0.5F, 0F, -3.7F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 11
		bodyModel[387].setRotationPoint(-56.5F, -20F, 0F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0.01F, 0F, 0F, -0.01F, 0F, 0F, -3.51F, 0F, 0F, 3.51F, 0F, 0F, 0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -3.7F, -0.5F, 0F, 3.7F, -0.5F, 0F); // Box 11
		bodyModel[388].setRotationPoint(-56.5F, -20F, -11F);
	}
}