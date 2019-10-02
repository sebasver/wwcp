//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 30.09.2018 - 15:22:42
// Last changed on: 30.09.2018 - 15:22:42
package wwcp.models.Freight; //Path where the model is located


import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class OFF52Beetles extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public OFF52Beetles() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[556];

		initbodyModel_1();
		initbodyModel_2();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 20
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 21
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 177
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 177
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 29
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 74
		bodyModel[8] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 75
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 76
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 77
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 78
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 79
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 80
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 81
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 82
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 66
		bodyModel[62] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 67
		bodyModel[63] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 68
		bodyModel[64] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 69
		bodyModel[65] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 77
		bodyModel[73] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 81
		bodyModel[77] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 82
		bodyModel[78] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 84
		bodyModel[79] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 85
		bodyModel[80] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 88
		bodyModel[83] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 89
		bodyModel[84] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 90
		bodyModel[85] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 91
		bodyModel[86] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 92
		bodyModel[87] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 93
		bodyModel[88] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 94
		bodyModel[89] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 95
		bodyModel[90] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 96
		bodyModel[91] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 97
		bodyModel[92] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 98
		bodyModel[93] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 99
		bodyModel[94] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 100
		bodyModel[95] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 101
		bodyModel[96] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 102
		bodyModel[97] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 103
		bodyModel[98] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 104
		bodyModel[99] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 105
		bodyModel[100] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 106
		bodyModel[101] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 107
		bodyModel[102] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 108
		bodyModel[103] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 109
		bodyModel[104] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 110
		bodyModel[105] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 111
		bodyModel[106] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 112
		bodyModel[107] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 113
		bodyModel[108] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 114
		bodyModel[109] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 115
		bodyModel[110] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 116
		bodyModel[111] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 117
		bodyModel[112] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 118
		bodyModel[113] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 119
		bodyModel[114] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 120
		bodyModel[115] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 121
		bodyModel[116] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 122
		bodyModel[117] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 123
		bodyModel[118] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 124
		bodyModel[119] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 125
		bodyModel[120] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 126
		bodyModel[121] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 127
		bodyModel[122] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 128
		bodyModel[123] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 129
		bodyModel[124] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Cargo2
		bodyModel[125] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Cargo2
		bodyModel[126] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Cargo2
		bodyModel[127] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Cargo2
		bodyModel[128] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Cargo2
		bodyModel[129] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Cargo2
		bodyModel[130] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Cargo2
		bodyModel[131] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Cargo2
		bodyModel[132] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Cargo2
		bodyModel[133] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Cargo2
		bodyModel[134] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Cargo2
		bodyModel[135] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Cargo2
		bodyModel[136] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Cargo2
		bodyModel[137] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Cargo2
		bodyModel[138] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Cargo2
		bodyModel[139] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Cargo2
		bodyModel[140] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Cargo2
		bodyModel[141] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Cargo2
		bodyModel[142] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Cargo2
		bodyModel[143] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Cargo2
		bodyModel[144] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Cargo2
		bodyModel[145] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Cargo2
		bodyModel[146] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Cargo2
		bodyModel[147] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Cargo2
		bodyModel[148] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Cargo2
		bodyModel[149] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Cargo2
		bodyModel[150] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Cargo2
		bodyModel[151] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Cargo2
		bodyModel[152] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Cargo2
		bodyModel[153] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Cargo2
		bodyModel[154] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Cargo2
		bodyModel[155] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Cargo2
		bodyModel[156] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Cargo2
		bodyModel[157] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Cargo2
		bodyModel[158] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Cargo2
		bodyModel[159] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Cargo2
		bodyModel[160] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Cargo2
		bodyModel[161] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Cargo2
		bodyModel[162] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Cargo2
		bodyModel[163] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Cargo2
		bodyModel[164] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Cargo2
		bodyModel[165] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Cargo2
		bodyModel[166] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Cargo2
		bodyModel[167] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Cargo2
		bodyModel[168] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Cargo2
		bodyModel[169] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Cargo2
		bodyModel[170] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Cargo2
		bodyModel[171] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Cargo2
		bodyModel[172] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Cargo2
		bodyModel[173] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Cargo2
		bodyModel[174] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Cargo2
		bodyModel[175] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Cargo2
		bodyModel[176] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Cargo2
		bodyModel[177] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Cargo2
		bodyModel[178] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Cargo2
		bodyModel[179] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Cargo2
		bodyModel[180] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Cargo2
		bodyModel[181] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Cargo2
		bodyModel[182] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Cargo2
		bodyModel[183] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Cargo2
		bodyModel[184] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Cargo2
		bodyModel[185] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Cargo2
		bodyModel[186] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Cargo2
		bodyModel[187] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Cargo2
		bodyModel[188] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Cargo2
		bodyModel[189] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Cargo2
		bodyModel[190] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Cargo2
		bodyModel[191] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Cargo2
		bodyModel[192] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Cargo2
		bodyModel[193] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Cargo2
		bodyModel[194] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Cargo2
		bodyModel[195] = new ModelRendererTurbo(this, 369, 89, textureX, textureY); // Cargo2
		bodyModel[196] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Cargo2
		bodyModel[197] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Cargo2
		bodyModel[198] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Cargo2
		bodyModel[199] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Cargo2
		bodyModel[200] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Cargo2
		bodyModel[201] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Cargo2
		bodyModel[202] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Cargo2
		bodyModel[203] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Cargo2
		bodyModel[204] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Cargo2
		bodyModel[205] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Cargo2
		bodyModel[206] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Cargo2
		bodyModel[207] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Cargo2
		bodyModel[208] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Cargo2
		bodyModel[209] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Cargo2
		bodyModel[210] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Cargo2
		bodyModel[211] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Cargo2
		bodyModel[212] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Cargo2
		bodyModel[213] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Cargo2
		bodyModel[214] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Cargo2
		bodyModel[215] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Cargo2
		bodyModel[216] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Cargo2
		bodyModel[217] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Cargo2
		bodyModel[218] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Cargo2
		bodyModel[219] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Cargo2
		bodyModel[220] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Cargo2
		bodyModel[221] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Cargo2
		bodyModel[222] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Cargo2
		bodyModel[223] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Cargo2
		bodyModel[224] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Cargo2
		bodyModel[225] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Cargo2
		bodyModel[226] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Cargo2
		bodyModel[227] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Cargo2
		bodyModel[228] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Cargo2
		bodyModel[229] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Cargo2
		bodyModel[230] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Cargo2
		bodyModel[231] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Cargo2
		bodyModel[232] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Cargo1
		bodyModel[233] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Cargo1
		bodyModel[234] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Cargo1
		bodyModel[235] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Cargo1
		bodyModel[236] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Cargo1
		bodyModel[237] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Cargo1
		bodyModel[238] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Cargo1
		bodyModel[239] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Cargo1
		bodyModel[240] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Cargo1
		bodyModel[241] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Cargo1
		bodyModel[242] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Cargo1
		bodyModel[243] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Cargo1
		bodyModel[244] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Cargo1
		bodyModel[245] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Cargo1
		bodyModel[246] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Cargo1
		bodyModel[247] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Cargo1
		bodyModel[248] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Cargo1
		bodyModel[249] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Cargo1
		bodyModel[250] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Cargo1
		bodyModel[251] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Cargo1
		bodyModel[252] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Cargo1
		bodyModel[253] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Cargo1
		bodyModel[254] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Cargo1
		bodyModel[255] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Cargo1
		bodyModel[256] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Cargo1
		bodyModel[257] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Cargo1
		bodyModel[258] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Cargo1
		bodyModel[259] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Cargo1
		bodyModel[260] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Cargo1
		bodyModel[261] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Cargo1
		bodyModel[262] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Cargo1
		bodyModel[263] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Cargo1
		bodyModel[264] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Cargo1
		bodyModel[265] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Cargo1
		bodyModel[266] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Cargo1
		bodyModel[267] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Cargo1
		bodyModel[268] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Cargo1
		bodyModel[269] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Cargo1
		bodyModel[270] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Cargo1
		bodyModel[271] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Cargo1
		bodyModel[272] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Cargo1
		bodyModel[273] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Cargo1
		bodyModel[274] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Cargo1
		bodyModel[275] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Cargo1
		bodyModel[276] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Cargo1
		bodyModel[277] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Cargo1
		bodyModel[278] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Cargo1
		bodyModel[279] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Cargo1
		bodyModel[280] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Cargo1
		bodyModel[281] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Cargo1
		bodyModel[282] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Cargo1
		bodyModel[283] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Cargo1
		bodyModel[284] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Cargo1
		bodyModel[285] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Cargo1
		bodyModel[286] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Cargo1
		bodyModel[287] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Cargo1
		bodyModel[288] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Cargo1
		bodyModel[289] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Cargo1
		bodyModel[290] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Cargo1
		bodyModel[291] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Cargo1
		bodyModel[292] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Cargo1
		bodyModel[293] = new ModelRendererTurbo(this, 385, 113, textureX, textureY); // Cargo1
		bodyModel[294] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Cargo1
		bodyModel[295] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Cargo1
		bodyModel[296] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Cargo1
		bodyModel[297] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Cargo1
		bodyModel[298] = new ModelRendererTurbo(this, 449, 113, textureX, textureY); // Cargo1
		bodyModel[299] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Cargo1
		bodyModel[300] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Cargo1
		bodyModel[301] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Cargo1
		bodyModel[302] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Cargo1
		bodyModel[303] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Cargo1
		bodyModel[304] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Cargo1
		bodyModel[305] = new ModelRendererTurbo(this, 25, 121, textureX, textureY); // Cargo1
		bodyModel[306] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Cargo1
		bodyModel[307] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Cargo1
		bodyModel[308] = new ModelRendererTurbo(this, 113, 121, textureX, textureY); // Cargo1
		bodyModel[309] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Cargo1
		bodyModel[310] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Cargo1
		bodyModel[311] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Cargo1
		bodyModel[312] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Cargo1
		bodyModel[313] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Cargo1
		bodyModel[314] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Cargo1
		bodyModel[315] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Cargo1
		bodyModel[316] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Cargo1
		bodyModel[317] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Cargo1
		bodyModel[318] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Cargo1
		bodyModel[319] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Cargo1
		bodyModel[320] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Cargo1
		bodyModel[321] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Cargo1
		bodyModel[322] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Cargo1
		bodyModel[323] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Cargo1
		bodyModel[324] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Cargo1
		bodyModel[325] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Cargo1
		bodyModel[326] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Cargo1
		bodyModel[327] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Cargo1
		bodyModel[328] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Cargo1
		bodyModel[329] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Cargo1
		bodyModel[330] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Cargo1
		bodyModel[331] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Cargo1
		bodyModel[332] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Cargo1
		bodyModel[333] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Cargo1
		bodyModel[334] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Cargo1
		bodyModel[335] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Cargo1
		bodyModel[336] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Cargo1
		bodyModel[337] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Cargo1
		bodyModel[338] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Cargo1
		bodyModel[339] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Cargo1
		bodyModel[340] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Cargo3
		bodyModel[341] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Cargo3
		bodyModel[342] = new ModelRendererTurbo(this, 25, 129, textureX, textureY); // Cargo3
		bodyModel[343] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Cargo3
		bodyModel[344] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Cargo3
		bodyModel[345] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Cargo3
		bodyModel[346] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Cargo3
		bodyModel[347] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Cargo3
		bodyModel[348] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Cargo3
		bodyModel[349] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Cargo3
		bodyModel[350] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Cargo3
		bodyModel[351] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Cargo3
		bodyModel[352] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Cargo3
		bodyModel[353] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Cargo3
		bodyModel[354] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Cargo3
		bodyModel[355] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Cargo3
		bodyModel[356] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Cargo3
		bodyModel[357] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Cargo3
		bodyModel[358] = new ModelRendererTurbo(this, 337, 129, textureX, textureY); // Cargo3
		bodyModel[359] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Cargo3
		bodyModel[360] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Cargo3
		bodyModel[361] = new ModelRendererTurbo(this, 249, 129, textureX, textureY); // Cargo3
		bodyModel[362] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Cargo3
		bodyModel[363] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Cargo3
		bodyModel[364] = new ModelRendererTurbo(this, 361, 129, textureX, textureY); // Cargo3
		bodyModel[365] = new ModelRendererTurbo(this, 369, 129, textureX, textureY); // Cargo3
		bodyModel[366] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Cargo3
		bodyModel[367] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Cargo3
		bodyModel[368] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Cargo3
		bodyModel[369] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Cargo3
		bodyModel[370] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Cargo3
		bodyModel[371] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Cargo3
		bodyModel[372] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Cargo3
		bodyModel[373] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Cargo3
		bodyModel[374] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Cargo3
		bodyModel[375] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Cargo3
		bodyModel[376] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Cargo3
		bodyModel[377] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Cargo3
		bodyModel[378] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Cargo3
		bodyModel[379] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Cargo3
		bodyModel[380] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Cargo3
		bodyModel[381] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Cargo3
		bodyModel[382] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Cargo3
		bodyModel[383] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Cargo3
		bodyModel[384] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Cargo3
		bodyModel[385] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Cargo3
		bodyModel[386] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Cargo3
		bodyModel[387] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Cargo3
		bodyModel[388] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Cargo3
		bodyModel[389] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Cargo3
		bodyModel[390] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Cargo3
		bodyModel[391] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Cargo3
		bodyModel[392] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Cargo3
		bodyModel[393] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Cargo3
		bodyModel[394] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Cargo3
		bodyModel[395] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Cargo3
		bodyModel[396] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Cargo3
		bodyModel[397] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Cargo3
		bodyModel[398] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Cargo3
		bodyModel[399] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Cargo3
		bodyModel[400] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Cargo3
		bodyModel[401] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Cargo3
		bodyModel[402] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Cargo3
		bodyModel[403] = new ModelRendererTurbo(this, 17, 145, textureX, textureY); // Cargo3
		bodyModel[404] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Cargo3
		bodyModel[405] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Cargo3
		bodyModel[406] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Cargo3
		bodyModel[407] = new ModelRendererTurbo(this, 137, 145, textureX, textureY); // Cargo3
		bodyModel[408] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Cargo3
		bodyModel[409] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Cargo3
		bodyModel[410] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Cargo3
		bodyModel[411] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Cargo3
		bodyModel[412] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Cargo3
		bodyModel[413] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Cargo3
		bodyModel[414] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Cargo3
		bodyModel[415] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Cargo3
		bodyModel[416] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Cargo3
		bodyModel[417] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Cargo3
		bodyModel[418] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Cargo3
		bodyModel[419] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Cargo3
		bodyModel[420] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Cargo3
		bodyModel[421] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Cargo3
		bodyModel[422] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Cargo3
		bodyModel[423] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Cargo3
		bodyModel[424] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Cargo3
		bodyModel[425] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Cargo3
		bodyModel[426] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Cargo3
		bodyModel[427] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Cargo3
		bodyModel[428] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Cargo3
		bodyModel[429] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Cargo3
		bodyModel[430] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Cargo3
		bodyModel[431] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Cargo3
		bodyModel[432] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Cargo3
		bodyModel[433] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Cargo3
		bodyModel[434] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Cargo3
		bodyModel[435] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Cargo3
		bodyModel[436] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Cargo3
		bodyModel[437] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Cargo3
		bodyModel[438] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Cargo3
		bodyModel[439] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Cargo4
		bodyModel[440] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Cargo4
		bodyModel[441] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Cargo4
		bodyModel[442] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Cargo4
		bodyModel[443] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Cargo4
		bodyModel[444] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Cargo4
		bodyModel[445] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Cargo4
		bodyModel[446] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Cargo4
		bodyModel[447] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Cargo4
		bodyModel[448] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Cargo4
		bodyModel[449] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Cargo4
		bodyModel[450] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Cargo4
		bodyModel[451] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Cargo4
		bodyModel[452] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Cargo4
		bodyModel[453] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Cargo4
		bodyModel[454] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Cargo4
		bodyModel[455] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Cargo4
		bodyModel[456] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Cargo4
		bodyModel[457] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Cargo4
		bodyModel[458] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Cargo4
		bodyModel[459] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Cargo4
		bodyModel[460] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Cargo4
		bodyModel[461] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Cargo4
		bodyModel[462] = new ModelRendererTurbo(this, 385, 153, textureX, textureY); // Cargo4
		bodyModel[463] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Cargo4
		bodyModel[464] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Cargo4
		bodyModel[465] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Cargo4
		bodyModel[466] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Cargo4
		bodyModel[467] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Cargo4
		bodyModel[468] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Cargo4
		bodyModel[469] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Cargo4
		bodyModel[470] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Cargo4
		bodyModel[471] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Cargo4
		bodyModel[472] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Cargo4
		bodyModel[473] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Cargo4
		bodyModel[474] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Cargo4
		bodyModel[475] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Cargo4
		bodyModel[476] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Cargo4
		bodyModel[477] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Cargo4
		bodyModel[478] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Cargo4
		bodyModel[479] = new ModelRendererTurbo(this, 89, 161, textureX, textureY); // Cargo4
		bodyModel[480] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Cargo4
		bodyModel[481] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Cargo4
		bodyModel[482] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Cargo4
		bodyModel[483] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Cargo4
		bodyModel[484] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Cargo4
		bodyModel[485] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Cargo4
		bodyModel[486] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Cargo4
		bodyModel[487] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Cargo4
		bodyModel[488] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Cargo4
		bodyModel[489] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Cargo4
		bodyModel[490] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Cargo4
		bodyModel[491] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Cargo4
		bodyModel[492] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Cargo4
		bodyModel[493] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Cargo4
		bodyModel[494] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Cargo4
		bodyModel[495] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Cargo4
		bodyModel[496] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Cargo4
		bodyModel[497] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Cargo4
		bodyModel[498] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Cargo4
		bodyModel[499] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Cargo4

		bodyModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 19
		bodyModel[0].setRotationPoint(-35F, 2F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 20
		bodyModel[1].setRotationPoint(-35.5F, 1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 21
		bodyModel[2].setRotationPoint(-35F, 2F, 8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 22
		bodyModel[3].setRotationPoint(-35.5F, 1F, 7F);

		bodyModel[4].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 177
		bodyModel[4].setRotationPoint(-16.5F, 6.5F, 5.95F);

		bodyModel[5].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 177
		bodyModel[5].setRotationPoint(-16.5F, 6.5F, -5.95F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 29
		bodyModel[6].setRotationPoint(-17F, 6F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[7].setRotationPoint(-15F, 3F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[8].setRotationPoint(-16F, 6F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[9].setRotationPoint(-18F, 3F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 77
		bodyModel[10].setRotationPoint(-21F, 3F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[11].setRotationPoint(-18F, 6F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[12].setRotationPoint(-15F, 3F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 80
		bodyModel[13].setRotationPoint(-18F, 3F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 81
		bodyModel[14].setRotationPoint(-21F, 3F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		bodyModel[15].setRotationPoint(-18F, 6F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 16
		bodyModel[16].setRotationPoint(-16F, 6F, 6F);

		bodyModel[17].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 17
		bodyModel[17].setRotationPoint(20F, 6.5F, 5.95F);

		bodyModel[18].addBox(-3F, -3F, 0F, 6, 6, 0, 0F); // Box 18
		bodyModel[18].setRotationPoint(20F, 6.5F, -5.95F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 19
		bodyModel[19].setRotationPoint(19.5F, 6F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(21.5F, 3F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(20.5F, 6F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(18.5F, 3F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(15.5F, 3F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(18.5F, 6F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25
		bodyModel[25].setRotationPoint(21.5F, 3F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 26
		bodyModel[26].setRotationPoint(18.5F, 3F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 27
		bodyModel[27].setRotationPoint(15.5F, 3F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[28].setRotationPoint(18.5F, 6F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 29
		bodyModel[29].setRotationPoint(20.5F, 6F, 6F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 30
		bodyModel[30].setRotationPoint(35F, 2F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 31
		bodyModel[31].setRotationPoint(37.5F, 1F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 32
		bodyModel[32].setRotationPoint(35F, 2F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 33
		bodyModel[33].setRotationPoint(37.5F, 1F, 7F);

		bodyModel[34].addBox(0F, 0F, 0F, 59, 2, 20, 0F); // Box 34
		bodyModel[34].setRotationPoint(-28F, 1F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 36
		bodyModel[35].setRotationPoint(-32F, 2F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 5, 1, 18, 0F); // Box 37
		bodyModel[36].setRotationPoint(-33F, 1F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 1, 18, 0F); // Box 38
		bodyModel[37].setRotationPoint(31F, 2F, -9F);

		bodyModel[38].addBox(0F, 0F, 0F, 5, 1, 18, 0F); // Box 39
		bodyModel[38].setRotationPoint(31F, 1F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 40
		bodyModel[39].setRotationPoint(-28F, -9F, 9F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 41
		bodyModel[40].setRotationPoint(30F, -9F, 9F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 42
		bodyModel[41].setRotationPoint(8F, -9F, 9F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 43
		bodyModel[42].setRotationPoint(-6F, -9F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 45
		bodyModel[43].setRotationPoint(9F, -2F, 9F);

		bodyModel[44].addBox(0F, 0F, 0F, 21, 4, 2, 0F); // Box 46
		bodyModel[44].setRotationPoint(9F, -6F, 9F);

		bodyModel[45].addBox(0F, 0F, 0F, 21, 4, 2, 0F); // Box 48
		bodyModel[45].setRotationPoint(-27F, -6F, 9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 50
		bodyModel[46].setRotationPoint(-28F, 1F, 10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 51
		bodyModel[47].setRotationPoint(-6F, 1F, 10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 52
		bodyModel[48].setRotationPoint(8F, 1F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 53
		bodyModel[49].setRotationPoint(30F, 1F, 10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[50].setRotationPoint(9F, -9F, 9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 55
		bodyModel[51].setRotationPoint(-27F, -2F, 9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[52].setRotationPoint(-27F, -9F, 9F);

		bodyModel[53].addBox(0F, 0F, 0F, 72, 1, 0, 0F); // Box 58
		bodyModel[53].setRotationPoint(-35F, -13.2F, 7F);

		bodyModel[54].addBox(0F, 0F, 0F, 72, 1, 0, 0F); // Box 59
		bodyModel[54].setRotationPoint(-35F, -13.2F, 4F);

		bodyModel[55].addBox(0F, 0F, 0F, 72, 1, 0, 0F); // Box 60
		bodyModel[55].setRotationPoint(-35F, -13.2F, -7F);

		bodyModel[56].addBox(0F, 0F, 0F, 72, 1, 0, 0F); // Box 61
		bodyModel[56].setRotationPoint(-35F, -13.2F, -4F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 62
		bodyModel[57].setRotationPoint(-28F, -9F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 63
		bodyModel[58].setRotationPoint(-6F, -9F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 21, 4, 2, 0F); // Box 64
		bodyModel[59].setRotationPoint(-27F, -6F, -11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 65
		bodyModel[60].setRotationPoint(-28F, 1F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 66
		bodyModel[61].setRotationPoint(-6F, 1F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[62].setRotationPoint(-27F, -2F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[63].setRotationPoint(-27F, -9F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 69
		bodyModel[64].setRotationPoint(8F, -9F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 10, 2, 0F); // Box 70
		bodyModel[65].setRotationPoint(30F, -9F, -11F);

		bodyModel[66].addBox(0F, 0F, 0F, 21, 4, 2, 0F); // Box 71
		bodyModel[66].setRotationPoint(9F, -6F, -11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 72
		bodyModel[67].setRotationPoint(8F, 1F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 73
		bodyModel[68].setRotationPoint(30F, 1F, -11F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(9F, -2F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 21, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[70].setRotationPoint(9F, -9F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 76
		bodyModel[71].setRotationPoint(-27F, -11F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 77
		bodyModel[72].setRotationPoint(-27F, -11F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[73].setRotationPoint(-27F, -12F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 79
		bodyModel[74].setRotationPoint(-7F, -11F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[75].setRotationPoint(-7F, -12F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 81
		bodyModel[76].setRotationPoint(-7F, -11F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 72, 1, 5, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 82
		bodyModel[77].setRotationPoint(-35F, -13F, -8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 72, 1, 5, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 84
		bodyModel[78].setRotationPoint(-35F, -13F, 3F);

		bodyModel[79].addBox(0F, 0F, 0F, 69, 1, 0, 0F); // Box 85
		bodyModel[79].setRotationPoint(-33F, 0F, 7F);

		bodyModel[80].addBox(0F, 0F, 0F, 69, 1, 0, 0F); // Box 86
		bodyModel[80].setRotationPoint(-33F, 0F, 4F);

		bodyModel[81].addBox(0F, 0F, 0F, 69, 1, 0, 0F); // Box 87
		bodyModel[81].setRotationPoint(-33F, 0F, -4F);

		bodyModel[82].addBox(0F, 0F, 0F, 69, 1, 0, 0F); // Box 88
		bodyModel[82].setRotationPoint(-33F, 0F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 89
		bodyModel[83].setRotationPoint(27F, -11F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[84].setRotationPoint(27F, -12F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 91
		bodyModel[85].setRotationPoint(27F, -11F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 92
		bodyModel[86].setRotationPoint(-34F, -15F, 7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 93
		bodyModel[87].setRotationPoint(-27F, -16F, 7.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 94
		bodyModel[88].setRotationPoint(-17F, -17F, 7.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 95
		bodyModel[89].setRotationPoint(-7F, -17F, 7.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 96
		bodyModel[90].setRotationPoint(-6F, -17F, -8.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 97
		bodyModel[91].setRotationPoint(6F, -17F, -8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 98
		bodyModel[92].setRotationPoint(18F, -17F, -8.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 99
		bodyModel[93].setRotationPoint(28F, -16F, -8.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,-0.2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 100
		bodyModel[94].setRotationPoint(-6F, -17.2F, -8.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[95].setRotationPoint(-22F, -17.2F, 7.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1.4F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F); // Box 102
		bodyModel[96].setRotationPoint(-27F, -17.2F, 7.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -1.4F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F); // Box 103
		bodyModel[97].setRotationPoint(-34F, -16.6F, 7.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.8F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F); // Box 104
		bodyModel[98].setRotationPoint(23F, -17.2F, -8.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[99].setRotationPoint(-22F, -17.2F, -8.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 106
		bodyModel[100].setRotationPoint(-34F, -15F, -8.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -1.4F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F); // Box 107
		bodyModel[101].setRotationPoint(-34F, -16.6F, -8.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 108
		bodyModel[102].setRotationPoint(-27F, -16F, -8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1.4F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F); // Box 109
		bodyModel[103].setRotationPoint(-27F, -17.2F, -8.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 110
		bodyModel[104].setRotationPoint(-17F, -17F, -8.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 111
		bodyModel[105].setRotationPoint(-7F, -17F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 112
		bodyModel[106].setRotationPoint(-6F, -17F, 7.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 113
		bodyModel[107].setRotationPoint(6F, -17F, 7.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 114
		bodyModel[108].setRotationPoint(18F, -17F, 7.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 115
		bodyModel[109].setRotationPoint(28F, -16F, 7.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,-0.2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Box 116
		bodyModel[110].setRotationPoint(-6F, -17.2F, 7.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.8F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.8F, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F); // Box 117
		bodyModel[111].setRotationPoint(23F, -17.2F, 7.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[112].setRotationPoint(31F, -1F, 9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[113].setRotationPoint(31F, -8F, 9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[114].setRotationPoint(31F, -4.5F, 9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[115].setRotationPoint(31F, -1F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[116].setRotationPoint(31F, -8F, -11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[117].setRotationPoint(31F, -4.5F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 124
		bodyModel[118].setRotationPoint(36F, -16F, -8.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[119].setRotationPoint(34F, -16.6F, -8.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 126
		bodyModel[120].setRotationPoint(34F, -16F, -8.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 127
		bodyModel[121].setRotationPoint(36F, -16F, 7.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[122].setRotationPoint(34F, -16.6F, 7.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 129
		bodyModel[123].setRotationPoint(34F, -16F, 7.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[124].setRotationPoint(-7F, -4F, -6F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[125].setRotationPoint(-4F, -3F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[126].setRotationPoint(-8F, -3F, -6F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[127].setRotationPoint(-4F, -4F, -6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[128].setRotationPoint(-4F, 0F, -6F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[129].setRotationPoint(-8F, -4F, -6F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Cargo2
		bodyModel[130].setRotationPoint(-8F, 0F, -6F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[131].setRotationPoint(-28F, -4F, -6F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[132].setRotationPoint(-25F, -3F, -6F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[133].setRotationPoint(-29F, -3F, -6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[134].setRotationPoint(-25F, -4F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[135].setRotationPoint(-25F, 0F, -6F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[136].setRotationPoint(-29F, -4F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Cargo2
		bodyModel[137].setRotationPoint(-29F, 0F, -6F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Cargo2
		bodyModel[138].setRotationPoint(-22.5F, -1F, -7F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[139].setRotationPoint(-22.5F, -3F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[140].setRotationPoint(-31.5F, -5F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo2
		bodyModel[141].setRotationPoint(-28F, -5.5F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[142].setRotationPoint(-22.5F, -5F, -7F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[143].setRotationPoint(-31.5F, -6F, -1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[144].setRotationPoint(-31.5F, -6F, -3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Cargo2
		bodyModel[145].setRotationPoint(-31.5F, -6F, 1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Cargo2
		bodyModel[146].setRotationPoint(-29F, -7.5F, -3F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -2F); // Cargo2
		bodyModel[147].setRotationPoint(-29F, -7.5F, 3F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Cargo2
		bodyModel[148].setRotationPoint(-25F, -8F, -4.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[149].setRotationPoint(-28F, -4F, 5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[150].setRotationPoint(-25F, -3F, 5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[151].setRotationPoint(-29F, -3F, 5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[152].setRotationPoint(-25F, -4F, 5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[153].setRotationPoint(-25F, 0F, 5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[154].setRotationPoint(-29F, -4F, 5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Cargo2
		bodyModel[155].setRotationPoint(-29F, 0F, 5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-2.5F, -0.5F, -2F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[156].setRotationPoint(-31.5F, -5F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo2
		bodyModel[157].setRotationPoint(-28F, -5.5F, -7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[158].setRotationPoint(-22.5F, -3F, 5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[159].setRotationPoint(-31.5F, -5F, 1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo2
		bodyModel[160].setRotationPoint(-28F, -5.5F, 3F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Cargo2
		bodyModel[161].setRotationPoint(-22.5F, -5F, 5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Cargo2
		bodyModel[162].setRotationPoint(-31.5F, -5F, 5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[163].setRotationPoint(-28F, -5.5F, 5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Cargo2
		bodyModel[164].setRotationPoint(-25F, -8F, 4.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Cargo2
		bodyModel[165].setRotationPoint(-25F, -8F, -5.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -2F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Cargo2
		bodyModel[166].setRotationPoint(-29F, -7.5F, -5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Cargo2
		bodyModel[167].setRotationPoint(-25F, -7F, 4.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 1F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 1F, -1.5F); // Cargo2
		bodyModel[168].setRotationPoint(-29F, -6.5F, 3.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Cargo2
		bodyModel[169].setRotationPoint(-25F, -7F, -5.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, -1.5F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 1F, 1F); // Cargo2
		bodyModel[170].setRotationPoint(-29F, -6.5F, -4.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo2
		bodyModel[171].setRotationPoint(-24F, -5F, 5.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo2
		bodyModel[172].setRotationPoint(-23F, -3F, 5.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Cargo2
		bodyModel[173].setRotationPoint(-24F, -5F, -6.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo2
		bodyModel[174].setRotationPoint(-23F, -3F, -6.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[175].setRotationPoint(-21F, -5F, 5.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[176].setRotationPoint(-10.5F, -3F, -7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo2
		bodyModel[177].setRotationPoint(-8F, -5.5F, -5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[178].setRotationPoint(-10.5F, -5F, -7F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo2
		bodyModel[179].setRotationPoint(-8F, -5.5F, -7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[180].setRotationPoint(-10.5F, -3F, 5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[181].setRotationPoint(-0.5F, -5F, -5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo2
		bodyModel[182].setRotationPoint(-8F, -5.5F, 3F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Cargo2
		bodyModel[183].setRotationPoint(-10.5F, -5F, 5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[184].setRotationPoint(-1.5F, -5F, 5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[185].setRotationPoint(-8F, -5.5F, 5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,2.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[186].setRotationPoint(-1.5F, -5F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[187].setRotationPoint(-7F, -4F, 5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[188].setRotationPoint(-4F, -3F, 5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[189].setRotationPoint(-8F, -3F, 5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[190].setRotationPoint(-4F, -4F, 5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[191].setRotationPoint(-4F, 0F, 5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[192].setRotationPoint(-8F, -4F, 5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Cargo2
		bodyModel[193].setRotationPoint(-8F, 0F, 5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1.65F, 0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.35F, 0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 1F); // Cargo2
		bodyModel[194].setRotationPoint(-6F, -7F, 4.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[195].setRotationPoint(-10F, -4F, 5.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[196].setRotationPoint(-10F, -5F, 5.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Cargo2
		bodyModel[197].setRotationPoint(-21F, -7F, 4.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[198].setRotationPoint(-21F, -5F, -6.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -1.65F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, -0.5F, 0F, -0.35F, 0.5F, 0F, 0F, -1F); // Cargo2
		bodyModel[199].setRotationPoint(-6F, -7F, -5.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[200].setRotationPoint(-10F, -4F, -6.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[201].setRotationPoint(-10F, -5F, -6.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Cargo2
		bodyModel[202].setRotationPoint(-21F, -7F, -5.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[203].setRotationPoint(-18F, -10F, -5.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[204].setRotationPoint(-18F, -11F, -5.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[205].setRotationPoint(-21F, -10F, -5.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo2
		bodyModel[206].setRotationPoint(-21F, -11F, -5.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[207].setRotationPoint(-9F, -11F, -5.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -6.5F, -0.5F, -0.5F, -5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, -0.5F, 0F, 5.5F, 0.5F, 0F, 0F, 0F); // Cargo2
		bodyModel[208].setRotationPoint(-6F, -10F, -5.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[209].setRotationPoint(-9F, -10F, -5.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, 0.5F, 0F, 0F, 0F); // Cargo2
		bodyModel[210].setRotationPoint(-6F, -9F, -5.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[211].setRotationPoint(-18F, -10F, 4.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[212].setRotationPoint(-18F, -11F, 4.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[213].setRotationPoint(-21F, -10F, 4.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo2
		bodyModel[214].setRotationPoint(-21F, -11F, 4.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[215].setRotationPoint(-9F, -11F, 4.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, -5.5F, 0.5F, 0F, -6.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0.5F, 0F, 5.5F, -0.5F, 0F, 0F, 0F); // Cargo2
		bodyModel[216].setRotationPoint(-6F, -10F, 4.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[217].setRotationPoint(-9F, -10F, 4.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 0F); // Cargo2
		bodyModel[218].setRotationPoint(-6F, -9F, 4.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo2
		bodyModel[219].setRotationPoint(-21F, -11F, -4.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[220].setRotationPoint(-18F, -11F, -0.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[221].setRotationPoint(-18F, -11F, -5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[222].setRotationPoint(-16F, -11F, -0.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Cargo2
		bodyModel[223].setRotationPoint(-16F, -11F, -5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo2
		bodyModel[224].setRotationPoint(-9F, -11F, -0.5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -0.5F, -0.5F, -5.5F, -1F, -0.5F, -5.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 5.5F, -1F, 0F, 5.5F, 0F, 0F, -0.5F, 0F); // Cargo2
		bodyModel[225].setRotationPoint(-6F, -10F, -5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F); // Cargo2
		bodyModel[226].setRotationPoint(-9F, -11F, -4.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, -1F, 0F, 0F, -0.5F); // Cargo2
		bodyModel[227].setRotationPoint(-6F, -10F, 0F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Cargo2
		bodyModel[228].setRotationPoint(-10F, -4.5F, -5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.7F, 0F); // Cargo2
		bodyModel[229].setRotationPoint(-3F, -4.5F, -5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Cargo2
		bodyModel[230].setRotationPoint(-28.5F, -4.5F, -5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.5F, -0.5F, 0F); // Cargo2
		bodyModel[231].setRotationPoint(-31F, -4.5F, -5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[232].setRotationPoint(28F, -4F, -6F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[233].setRotationPoint(31F, -3F, -6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[234].setRotationPoint(27F, -3F, -6F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[235].setRotationPoint(31F, -4F, -6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[236].setRotationPoint(31F, 0F, -6F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[237].setRotationPoint(27F, -4F, -6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Cargo1
		bodyModel[238].setRotationPoint(27F, 0F, -6F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[239].setRotationPoint(7F, -4F, -6F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[240].setRotationPoint(10F, -3F, -6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[241].setRotationPoint(6F, -3F, -6F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[242].setRotationPoint(10F, -4F, -6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[243].setRotationPoint(10F, 0F, -6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[244].setRotationPoint(6F, -4F, -6F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Cargo1
		bodyModel[245].setRotationPoint(6F, 0F, -6F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Cargo1
		bodyModel[246].setRotationPoint(12.5F, -1F, -7F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[247].setRotationPoint(12.5F, -3F, -7F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[248].setRotationPoint(3.5F, -5F, -5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo1
		bodyModel[249].setRotationPoint(7F, -5.5F, -5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[250].setRotationPoint(12.5F, -5F, -7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[251].setRotationPoint(3.5F, -6F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[252].setRotationPoint(3.5F, -6F, -3F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Cargo1
		bodyModel[253].setRotationPoint(3.5F, -6F, 1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Cargo1
		bodyModel[254].setRotationPoint(6F, -7.5F, -3F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -2F); // Cargo1
		bodyModel[255].setRotationPoint(6F, -7.5F, 3F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Cargo1
		bodyModel[256].setRotationPoint(10F, -8F, -4.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[257].setRotationPoint(7F, -4F, 5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[258].setRotationPoint(10F, -3F, 5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[259].setRotationPoint(6F, -3F, 5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[260].setRotationPoint(10F, -4F, 5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[261].setRotationPoint(10F, 0F, 5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[262].setRotationPoint(6F, -4F, 5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Cargo1
		bodyModel[263].setRotationPoint(6F, 0F, 5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-2.5F, -0.5F, -2F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[264].setRotationPoint(3.5F, -5F, -7F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo1
		bodyModel[265].setRotationPoint(7F, -5.5F, -7F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[266].setRotationPoint(12.5F, -3F, 5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[267].setRotationPoint(3.5F, -5F, 1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo1
		bodyModel[268].setRotationPoint(7F, -5.5F, 3F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Cargo1
		bodyModel[269].setRotationPoint(12.5F, -5F, 5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Cargo1
		bodyModel[270].setRotationPoint(3.5F, -5F, 5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[271].setRotationPoint(7F, -5.5F, 5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Cargo1
		bodyModel[272].setRotationPoint(10F, -8F, 4.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Cargo1
		bodyModel[273].setRotationPoint(10F, -8F, -5.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -2F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Cargo1
		bodyModel[274].setRotationPoint(6F, -7.5F, -5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Cargo1
		bodyModel[275].setRotationPoint(10F, -7F, 4.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 1F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 1F, -1.5F); // Cargo1
		bodyModel[276].setRotationPoint(6F, -6.5F, 3.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Cargo1
		bodyModel[277].setRotationPoint(10F, -7F, -5.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, -1.5F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 1F, 1F); // Cargo1
		bodyModel[278].setRotationPoint(6F, -6.5F, -4.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo1
		bodyModel[279].setRotationPoint(11F, -5F, 5.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo1
		bodyModel[280].setRotationPoint(12F, -3F, 5.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Cargo1
		bodyModel[281].setRotationPoint(11F, -5F, -6.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo1
		bodyModel[282].setRotationPoint(12F, -3F, -6.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[283].setRotationPoint(14F, -5F, 5.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[284].setRotationPoint(24.5F, -3F, -7F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo1
		bodyModel[285].setRotationPoint(27F, -5.5F, -5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[286].setRotationPoint(24.5F, -5F, -7F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo1
		bodyModel[287].setRotationPoint(27F, -5.5F, -7F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[288].setRotationPoint(24.5F, -3F, 5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[289].setRotationPoint(34.5F, -5F, -5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo1
		bodyModel[290].setRotationPoint(27F, -5.5F, 3F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Cargo1
		bodyModel[291].setRotationPoint(24.5F, -5F, 5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[292].setRotationPoint(33.5F, -5F, 5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[293].setRotationPoint(27F, -5.5F, 5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,2.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[294].setRotationPoint(33.5F, -5F, -7F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[295].setRotationPoint(28F, -4F, 5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[296].setRotationPoint(31F, -3F, 5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[297].setRotationPoint(27F, -3F, 5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[298].setRotationPoint(31F, -4F, 5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[299].setRotationPoint(31F, 0F, 5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[300].setRotationPoint(27F, -4F, 5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Cargo1
		bodyModel[301].setRotationPoint(27F, 0F, 5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1.65F, 0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.35F, 0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 1F); // Cargo1
		bodyModel[302].setRotationPoint(29F, -7F, 4.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[303].setRotationPoint(25F, -4F, 5.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[304].setRotationPoint(25F, -5F, 5.5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Cargo1
		bodyModel[305].setRotationPoint(14F, -7F, 4.5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[306].setRotationPoint(14F, -5F, -6.5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -1.65F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, -0.5F, 0F, -0.35F, 0.5F, 0F, 0F, -1F); // Cargo1
		bodyModel[307].setRotationPoint(29F, -7F, -5.5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[308].setRotationPoint(25F, -4F, -6.5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[309].setRotationPoint(25F, -5F, -6.5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Cargo1
		bodyModel[310].setRotationPoint(14F, -7F, -5.5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[311].setRotationPoint(17F, -10F, -5.5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[312].setRotationPoint(17F, -11F, -5.5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[313].setRotationPoint(14F, -10F, -5.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo1
		bodyModel[314].setRotationPoint(14F, -11F, -5.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[315].setRotationPoint(26F, -11F, -5.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -6.5F, -0.5F, -0.5F, -5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, -0.5F, 0F, 5.5F, 0.5F, 0F, 0F, 0F); // Cargo1
		bodyModel[316].setRotationPoint(29F, -10F, -5.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[317].setRotationPoint(26F, -10F, -5.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, 0.5F, 0F, 0F, 0F); // Cargo1
		bodyModel[318].setRotationPoint(29F, -9F, -5.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[319].setRotationPoint(17F, -10F, 4.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[320].setRotationPoint(17F, -11F, 4.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[321].setRotationPoint(14F, -10F, 4.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo1
		bodyModel[322].setRotationPoint(14F, -11F, 4.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[323].setRotationPoint(26F, -11F, 4.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, -5.5F, 0.5F, 0F, -6.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0.5F, 0F, 5.5F, -0.5F, 0F, 0F, 0F); // Cargo1
		bodyModel[324].setRotationPoint(29F, -10F, 4.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[325].setRotationPoint(26F, -10F, 4.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 0F); // Cargo1
		bodyModel[326].setRotationPoint(29F, -9F, 4.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo1
		bodyModel[327].setRotationPoint(14F, -11F, -4.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[328].setRotationPoint(17F, -11F, -0.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[329].setRotationPoint(17F, -11F, -5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[330].setRotationPoint(19F, -11F, -0.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Cargo1
		bodyModel[331].setRotationPoint(19F, -11F, -5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo1
		bodyModel[332].setRotationPoint(26F, -11F, -0.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -0.5F, -0.5F, -5.5F, -1F, -0.5F, -5.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 5.5F, -1F, 0F, 5.5F, 0F, 0F, -0.5F, 0F); // Cargo1
		bodyModel[333].setRotationPoint(29F, -10F, -5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F); // Cargo1
		bodyModel[334].setRotationPoint(26F, -11F, -4.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, -1F, 0F, 0F, -0.5F); // Cargo1
		bodyModel[335].setRotationPoint(29F, -10F, 0F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Cargo1
		bodyModel[336].setRotationPoint(25F, -4.5F, -5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.7F, 0F); // Cargo1
		bodyModel[337].setRotationPoint(32F, -4.5F, -5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Cargo1
		bodyModel[338].setRotationPoint(6.5F, -4.5F, -5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.5F, -0.5F, 0F); // Cargo1
		bodyModel[339].setRotationPoint(4F, -4.5F, -5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[340].setRotationPoint(-4F, -16F, -6F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[341].setRotationPoint(-8F, -16F, -6F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[342].setRotationPoint(-4F, -17F, -6F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[343].setRotationPoint(-8F, -17F, -6F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[344].setRotationPoint(-25F, -16F, -6F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[345].setRotationPoint(-29F, -16F, -6F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[346].setRotationPoint(-25F, -17F, -6F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[347].setRotationPoint(-29F, -17F, -6F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Cargo3
		bodyModel[348].setRotationPoint(-22.5F, -14F, -7F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[349].setRotationPoint(-22.5F, -16F, -7F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[350].setRotationPoint(-31.5F, -18F, -5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo3
		bodyModel[351].setRotationPoint(-28F, -18.5F, -5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[352].setRotationPoint(-22.5F, -18F, -7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[353].setRotationPoint(-31.5F, -19F, -1F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[354].setRotationPoint(-31.5F, -19F, -3F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Cargo3
		bodyModel[355].setRotationPoint(-31.5F, -19F, 1F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Cargo3
		bodyModel[356].setRotationPoint(-29F, -20.5F, -3F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -2F); // Cargo3
		bodyModel[357].setRotationPoint(-29F, -20.5F, 3F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Cargo3
		bodyModel[358].setRotationPoint(-25F, -21F, -4.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Cargo3
		bodyModel[359].setRotationPoint(-28F, -17F, 5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[360].setRotationPoint(-25F, -16F, 5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[361].setRotationPoint(-29F, -16F, 5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[362].setRotationPoint(-25F, -17F, 5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F); // Cargo3
		bodyModel[363].setRotationPoint(-25F, -13F, 5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[364].setRotationPoint(-29F, -17F, 5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F); // Cargo3
		bodyModel[365].setRotationPoint(-29F, -13F, 5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-2.5F, -0.5F, -2F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[366].setRotationPoint(-31.5F, -18F, -7F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo3
		bodyModel[367].setRotationPoint(-28F, -18.5F, -7F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[368].setRotationPoint(-22.5F, -16F, 5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[369].setRotationPoint(-31.5F, -18F, 1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo3
		bodyModel[370].setRotationPoint(-28F, -18.5F, 3F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Cargo3
		bodyModel[371].setRotationPoint(-22.5F, -18F, 5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Cargo3
		bodyModel[372].setRotationPoint(-31.5F, -18F, 5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[373].setRotationPoint(-28F, -18.5F, 5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Cargo3
		bodyModel[374].setRotationPoint(-25F, -21F, 4.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Cargo3
		bodyModel[375].setRotationPoint(-25F, -21F, -5.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -2F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Cargo3
		bodyModel[376].setRotationPoint(-29F, -20.5F, -5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Cargo3
		bodyModel[377].setRotationPoint(-25F, -20F, 4.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 1F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 1F, -1.5F); // Cargo3
		bodyModel[378].setRotationPoint(-29F, -19.5F, 3.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Cargo3
		bodyModel[379].setRotationPoint(-25F, -20F, -5.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, -1.5F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 1F, 1F); // Cargo3
		bodyModel[380].setRotationPoint(-29F, -19.5F, -4.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo3
		bodyModel[381].setRotationPoint(-24F, -18F, 5.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo3
		bodyModel[382].setRotationPoint(-23F, -16F, 5.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Cargo3
		bodyModel[383].setRotationPoint(-24F, -18F, -6.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo3
		bodyModel[384].setRotationPoint(-23F, -16F, -6.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[385].setRotationPoint(-21F, -18F, 5.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[386].setRotationPoint(-10.5F, -16F, -7F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo3
		bodyModel[387].setRotationPoint(-8F, -18.5F, -5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[388].setRotationPoint(-10.5F, -18F, -7F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo3
		bodyModel[389].setRotationPoint(-8F, -18.5F, -7F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[390].setRotationPoint(-10.5F, -16F, 5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[391].setRotationPoint(-0.5F, -18F, -5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo3
		bodyModel[392].setRotationPoint(-8F, -18.5F, 3F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Cargo3
		bodyModel[393].setRotationPoint(-10.5F, -18F, 5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[394].setRotationPoint(-1.5F, -18F, 5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[395].setRotationPoint(-8F, -18.5F, 5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,2.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[396].setRotationPoint(-1.5F, -18F, -7F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[397].setRotationPoint(-4F, -16F, 5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[398].setRotationPoint(-8F, -16F, 5F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[399].setRotationPoint(-4F, -17F, 5F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[400].setRotationPoint(-8F, -17F, 5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1.65F, 0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.35F, 0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 1F); // Cargo3
		bodyModel[401].setRotationPoint(-6F, -20F, 4.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[402].setRotationPoint(-10F, -17F, 5.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[403].setRotationPoint(-10F, -18F, 5.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Cargo3
		bodyModel[404].setRotationPoint(-21F, -20F, 4.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[405].setRotationPoint(-21F, -18F, -6.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -1.65F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, -0.5F, 0F, -0.35F, 0.5F, 0F, 0F, -1F); // Cargo3
		bodyModel[406].setRotationPoint(-6F, -20F, -5.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[407].setRotationPoint(-10F, -17F, -6.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[408].setRotationPoint(-10F, -18F, -6.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Cargo3
		bodyModel[409].setRotationPoint(-21F, -20F, -5.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[410].setRotationPoint(-18F, -23F, -5.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[411].setRotationPoint(-18F, -24F, -5.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[412].setRotationPoint(-21F, -23F, -5.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo3
		bodyModel[413].setRotationPoint(-21F, -24F, -5.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[414].setRotationPoint(-9F, -24F, -5.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -6.5F, -0.5F, -0.5F, -5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, -0.5F, 0F, 5.5F, 0.5F, 0F, 0F, 0F); // Cargo3
		bodyModel[415].setRotationPoint(-6F, -23F, -5.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[416].setRotationPoint(-9F, -23F, -5.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, 0.5F, 0F, 0F, 0F); // Cargo3
		bodyModel[417].setRotationPoint(-6F, -22F, -5.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[418].setRotationPoint(-18F, -23F, 4.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[419].setRotationPoint(-18F, -24F, 4.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[420].setRotationPoint(-21F, -23F, 4.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo3
		bodyModel[421].setRotationPoint(-21F, -24F, 4.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[422].setRotationPoint(-9F, -24F, 4.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, -5.5F, 0.5F, 0F, -6.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0.5F, 0F, 5.5F, -0.5F, 0F, 0F, 0F); // Cargo3
		bodyModel[423].setRotationPoint(-6F, -23F, 4.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[424].setRotationPoint(-9F, -23F, 4.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 0F); // Cargo3
		bodyModel[425].setRotationPoint(-6F, -22F, 4.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo3
		bodyModel[426].setRotationPoint(-21F, -24F, -4.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[427].setRotationPoint(-18F, -24F, -0.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[428].setRotationPoint(-18F, -24F, -5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[429].setRotationPoint(-16F, -24F, -0.5F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Cargo3
		bodyModel[430].setRotationPoint(-16F, -24F, -5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo3
		bodyModel[431].setRotationPoint(-9F, -24F, -0.5F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -0.5F, -0.5F, -5.5F, -1F, -0.5F, -5.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 5.5F, -1F, 0F, 5.5F, 0F, 0F, -0.5F, 0F); // Cargo3
		bodyModel[432].setRotationPoint(-6F, -23F, -5F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F); // Cargo3
		bodyModel[433].setRotationPoint(-9F, -24F, -4.5F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, -1F, 0F, 0F, -0.5F); // Cargo3
		bodyModel[434].setRotationPoint(-6F, -23F, 0F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Cargo3
		bodyModel[435].setRotationPoint(-10F, -17.5F, -5F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.7F, 0F); // Cargo3
		bodyModel[436].setRotationPoint(-3F, -17.5F, -5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Cargo3
		bodyModel[437].setRotationPoint(-28.5F, -17.5F, -5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.5F, -0.5F, 0F); // Cargo3
		bodyModel[438].setRotationPoint(-31F, -17.5F, -5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[439].setRotationPoint(31F, -16F, -6F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[440].setRotationPoint(27F, -16F, -6F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[441].setRotationPoint(31F, -17F, -6F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[442].setRotationPoint(27F, -17F, -6F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[443].setRotationPoint(10F, -16F, -6F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[444].setRotationPoint(6F, -16F, -6F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[445].setRotationPoint(10F, -17F, -6F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[446].setRotationPoint(6F, -17F, -6F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Cargo4
		bodyModel[447].setRotationPoint(12.5F, -14F, -7F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[448].setRotationPoint(12.5F, -16F, -7F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[449].setRotationPoint(3.5F, -18F, -5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo4
		bodyModel[450].setRotationPoint(7F, -18.5F, -5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[451].setRotationPoint(12.5F, -18F, -7F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[452].setRotationPoint(3.5F, -19F, -1F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[453].setRotationPoint(3.5F, -19F, -3F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Cargo4
		bodyModel[454].setRotationPoint(3.5F, -19F, 1F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F); // Cargo4
		bodyModel[455].setRotationPoint(6F, -20.5F, -3F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -2F); // Cargo4
		bodyModel[456].setRotationPoint(6F, -20.5F, 3F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Cargo4
		bodyModel[457].setRotationPoint(10F, -21F, -4.5F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[458].setRotationPoint(10F, -16F, 5F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[459].setRotationPoint(6F, -16F, 5F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[460].setRotationPoint(10F, -17F, 5F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[461].setRotationPoint(6F, -17F, 5F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-2.5F, -0.5F, -2F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[462].setRotationPoint(3.5F, -18F, -7F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo4
		bodyModel[463].setRotationPoint(7F, -18.5F, -7F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[464].setRotationPoint(12.5F, -16F, 5F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[465].setRotationPoint(3.5F, -18F, 1F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo4
		bodyModel[466].setRotationPoint(7F, -18.5F, 3F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Cargo4
		bodyModel[467].setRotationPoint(12.5F, -18F, 5F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Cargo4
		bodyModel[468].setRotationPoint(3.5F, -18F, 5F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[469].setRotationPoint(7F, -18.5F, 5F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F); // Cargo4
		bodyModel[470].setRotationPoint(10F, -21F, 4.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Cargo4
		bodyModel[471].setRotationPoint(10F, -21F, -5.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -2F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Cargo4
		bodyModel[472].setRotationPoint(6F, -20.5F, -5F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Cargo4
		bodyModel[473].setRotationPoint(10F, -20F, 4.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 1F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 1F, -1.5F); // Cargo4
		bodyModel[474].setRotationPoint(6F, -19.5F, 3.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Cargo4
		bodyModel[475].setRotationPoint(10F, -20F, -5.5F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 1F, -1.5F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 1F, 1F); // Cargo4
		bodyModel[476].setRotationPoint(6F, -19.5F, -4.5F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo4
		bodyModel[477].setRotationPoint(11F, -18F, 5.5F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo4
		bodyModel[478].setRotationPoint(12F, -16F, 5.5F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Cargo4
		bodyModel[479].setRotationPoint(11F, -18F, -6.5F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Cargo4
		bodyModel[480].setRotationPoint(12F, -16F, -6.5F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[481].setRotationPoint(14F, -18F, 5.5F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[482].setRotationPoint(24.5F, -16F, -7F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo4
		bodyModel[483].setRotationPoint(27F, -18.5F, -5F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[484].setRotationPoint(24.5F, -18F, -7F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo4
		bodyModel[485].setRotationPoint(27F, -18.5F, -7F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[486].setRotationPoint(24.5F, -16F, 5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[487].setRotationPoint(34.5F, -18F, -5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Cargo4
		bodyModel[488].setRotationPoint(27F, -18.5F, 3F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-1.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Cargo4
		bodyModel[489].setRotationPoint(24.5F, -18F, 5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[490].setRotationPoint(33.5F, -18F, 5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[491].setRotationPoint(27F, -18.5F, 5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,2.5F, -0.5F, 0F, -3.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[492].setRotationPoint(33.5F, -18F, -7F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[493].setRotationPoint(31F, -16F, 5F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[494].setRotationPoint(27F, -16F, 5F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[495].setRotationPoint(31F, -17F, 5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[496].setRotationPoint(27F, -17F, 5F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1.65F, 0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.35F, 0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 1F); // Cargo4
		bodyModel[497].setRotationPoint(29F, -20F, 4.5F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[498].setRotationPoint(25F, -17F, 5.5F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[499].setRotationPoint(25F, -18F, 5.5F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Cargo4
		bodyModel[501] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Cargo4
		bodyModel[502] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Cargo4
		bodyModel[503] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Cargo4
		bodyModel[504] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Cargo4
		bodyModel[505] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Cargo4
		bodyModel[506] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Cargo4
		bodyModel[507] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Cargo4
		bodyModel[508] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Cargo4
		bodyModel[509] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Cargo4
		bodyModel[510] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Cargo4
		bodyModel[511] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Cargo4
		bodyModel[512] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Cargo4
		bodyModel[513] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Cargo4
		bodyModel[514] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Cargo4
		bodyModel[515] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Cargo4
		bodyModel[516] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Cargo4
		bodyModel[517] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Cargo4
		bodyModel[518] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Cargo4
		bodyModel[519] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Cargo4
		bodyModel[520] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Cargo4
		bodyModel[521] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Cargo4
		bodyModel[522] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Cargo4
		bodyModel[523] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Cargo4
		bodyModel[524] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Cargo4
		bodyModel[525] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Cargo4
		bodyModel[526] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Cargo4
		bodyModel[527] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Cargo4
		bodyModel[528] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Cargo4
		bodyModel[529] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Cargo4
		bodyModel[530] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Cargo4
		bodyModel[531] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Cargo4
		bodyModel[532] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Cargo4
		bodyModel[533] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Cargo4
		bodyModel[534] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Cargo4
		bodyModel[535] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Cargo3
		bodyModel[536] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Cargo3
		bodyModel[537] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Cargo3
		bodyModel[538] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Cargo3
		bodyModel[539] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Cargo3
		bodyModel[540] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Cargo3
		bodyModel[541] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Cargo3
		bodyModel[542] = new ModelRendererTurbo(this, 81, 177, textureX, textureY); // Cargo3
		bodyModel[543] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Cargo3
		bodyModel[544] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Cargo4
		bodyModel[545] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Cargo4
		bodyModel[546] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Cargo4
		bodyModel[547] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Cargo4
		bodyModel[548] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Cargo4
		bodyModel[549] = new ModelRendererTurbo(this, 137, 177, textureX, textureY); // Cargo4
		bodyModel[550] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Cargo4
		bodyModel[551] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Cargo4
		bodyModel[552] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Cargo4
		bodyModel[553] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Cargo4
		bodyModel[554] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Cargo4
		bodyModel[555] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Cargo4

		bodyModel[500].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Cargo4
		bodyModel[500].setRotationPoint(14F, -20F, 4.5F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[501].setRotationPoint(14F, -18F, -6.5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1.75F, -0.5F, 0F, -1.65F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, -0.5F, 0F, -0.35F, 0.5F, 0F, 0F, -1F); // Cargo4
		bodyModel[502].setRotationPoint(29F, -20F, -5.5F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[503].setRotationPoint(25F, -17F, -6.5F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[504].setRotationPoint(25F, -18F, -6.5F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Cargo4
		bodyModel[505].setRotationPoint(14F, -20F, -5.5F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[506].setRotationPoint(17F, -23F, -5.5F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[507].setRotationPoint(17F, -24F, -5.5F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[508].setRotationPoint(14F, -23F, -5.5F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo4
		bodyModel[509].setRotationPoint(14F, -24F, -5.5F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[510].setRotationPoint(26F, -24F, -5.5F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -1F, 0F, 0F, -6.5F, -0.5F, -0.5F, -5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, -0.5F, 0F, 5.5F, 0.5F, 0F, 0F, 0F); // Cargo4
		bodyModel[511].setRotationPoint(29F, -23F, -5.5F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[512].setRotationPoint(26F, -23F, -5.5F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -5.5F, -0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, 0.5F, 0F, 0F, 0F); // Cargo4
		bodyModel[513].setRotationPoint(29F, -22F, -5.5F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[514].setRotationPoint(17F, -23F, 4.5F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[515].setRotationPoint(17F, -24F, 4.5F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[516].setRotationPoint(14F, -23F, 4.5F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo4
		bodyModel[517].setRotationPoint(14F, -24F, 4.5F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[518].setRotationPoint(26F, -24F, 4.5F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -0.5F, -5.5F, 0.5F, 0F, -6.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0.5F, 0F, 5.5F, -0.5F, 0F, 0F, 0F); // Cargo4
		bodyModel[519].setRotationPoint(29F, -23F, 4.5F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[520].setRotationPoint(26F, -23F, 4.5F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -5.5F, 0.5F, 0F, -5.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 0F); // Cargo4
		bodyModel[521].setRotationPoint(29F, -22F, 4.5F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Cargo4
		bodyModel[522].setRotationPoint(14F, -24F, -4.5F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[523].setRotationPoint(17F, -24F, -0.5F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[524].setRotationPoint(17F, -24F, -5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[525].setRotationPoint(19F, -24F, -0.5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Cargo4
		bodyModel[526].setRotationPoint(19F, -24F, -5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Cargo4
		bodyModel[527].setRotationPoint(26F, -24F, -0.5F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, -0.5F, -0.5F, -5.5F, -1F, -0.5F, -5.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 5.5F, -1F, 0F, 5.5F, 0F, 0F, -0.5F, 0F); // Cargo4
		bodyModel[528].setRotationPoint(29F, -23F, -5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F); // Cargo4
		bodyModel[529].setRotationPoint(26F, -24F, -4.5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0.5F, 0F, -0.5F, -5.5F, 0F, -0.5F, -5.5F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, -1F, 0F, 0F, -0.5F); // Cargo4
		bodyModel[530].setRotationPoint(29F, -23F, 0F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Cargo4
		bodyModel[531].setRotationPoint(25F, -17.5F, -5F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.7F, 0F); // Cargo4
		bodyModel[532].setRotationPoint(32F, -17.5F, -5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Cargo4
		bodyModel[533].setRotationPoint(6.5F, -17.5F, -5F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.5F, -0.5F, 0F); // Cargo4
		bodyModel[534].setRotationPoint(4F, -17.5F, -5F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Cargo3
		bodyModel[535].setRotationPoint(-28F, -17F, -6F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F); // Cargo3
		bodyModel[536].setRotationPoint(-25F, -13F, -6F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F); // Cargo3
		bodyModel[537].setRotationPoint(-29F, -13F, -6F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Cargo3
		bodyModel[538].setRotationPoint(-7F, -17F, -6F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F); // Cargo3
		bodyModel[539].setRotationPoint(-4F, -13F, -6F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F); // Cargo3
		bodyModel[540].setRotationPoint(-8F, -13F, -6F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Cargo3
		bodyModel[541].setRotationPoint(-7F, -17F, 5F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F); // Cargo3
		bodyModel[542].setRotationPoint(-4F, -13F, 5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F); // Cargo3
		bodyModel[543].setRotationPoint(-8F, -13F, 5F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Cargo4
		bodyModel[544].setRotationPoint(7F, -17F, -6F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F); // Cargo4
		bodyModel[545].setRotationPoint(10F, -13F, -6F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F); // Cargo4
		bodyModel[546].setRotationPoint(6F, -13F, -6F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Cargo4
		bodyModel[547].setRotationPoint(7F, -17F, 5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F); // Cargo4
		bodyModel[548].setRotationPoint(10F, -13F, 5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F); // Cargo4
		bodyModel[549].setRotationPoint(6F, -13F, 5F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Cargo4
		bodyModel[550].setRotationPoint(28F, -17F, -6F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F); // Cargo4
		bodyModel[551].setRotationPoint(31F, -13F, -6F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F); // Cargo4
		bodyModel[552].setRotationPoint(27F, -13F, -6F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F); // Cargo4
		bodyModel[553].setRotationPoint(28F, -17F, 5F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F); // Cargo4
		bodyModel[554].setRotationPoint(31F, -13F, 5F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -1F, 0F); // Cargo4
		bodyModel[555].setRotationPoint(27F, -13F, 5F);
	}
}