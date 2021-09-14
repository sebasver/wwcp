//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 25.03.2019 - 14:37:32
// Last changed on: 25.03.2019 - 14:37:32

package wwcp.models.freight; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Insulated50ft extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Insulated50ft() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[146];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 204
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 12
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 13
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 14
		bodyModel[4] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 15
		bodyModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 17
		bodyModel[7] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 22
		bodyModel[26] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 22
		bodyModel[27] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 22
		bodyModel[32] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 79
		bodyModel[33] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 79
		bodyModel[34] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 79
		bodyModel[35] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 79
		bodyModel[36] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 79
		bodyModel[37] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 79
		bodyModel[38] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 79
		bodyModel[39] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 79
		bodyModel[40] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 79
		bodyModel[41] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 79
		bodyModel[42] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 17
		bodyModel[43] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 17
		bodyModel[44] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 17
		bodyModel[45] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 17
		bodyModel[46] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 17
		bodyModel[47] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 17
		bodyModel[48] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 94
		bodyModel[49] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 95
		bodyModel[50] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 96
		bodyModel[51] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 97
		bodyModel[52] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 98
		bodyModel[53] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 99
		bodyModel[54] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 100
		bodyModel[55] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 101
		bodyModel[56] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 102
		bodyModel[57] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 103
		bodyModel[58] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 104
		bodyModel[59] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 105
		bodyModel[60] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 106
		bodyModel[61] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 107
		bodyModel[62] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 108
		bodyModel[63] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 109
		bodyModel[64] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 110
		bodyModel[65] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 111
		bodyModel[66] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 112
		bodyModel[67] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 113
		bodyModel[68] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 114
		bodyModel[69] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 115
		bodyModel[70] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 116
		bodyModel[71] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 117
		bodyModel[72] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 118
		bodyModel[73] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 120
		bodyModel[74] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 121
		bodyModel[75] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 122
		bodyModel[76] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 123
		bodyModel[77] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 124
		bodyModel[78] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 125
		bodyModel[79] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 126
		bodyModel[80] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 127
		bodyModel[81] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 129
		bodyModel[83] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 130
		bodyModel[84] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 131
		bodyModel[85] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 132
		bodyModel[86] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 133
		bodyModel[87] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 134
		bodyModel[88] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 135
		bodyModel[89] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 136
		bodyModel[90] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 137
		bodyModel[91] = new ModelRendererTurbo(this, 9, 89, textureX, textureY); // Box 138
		bodyModel[92] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 139
		bodyModel[93] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 140
		bodyModel[94] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 141
		bodyModel[95] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 142
		bodyModel[96] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 143
		bodyModel[97] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 144
		bodyModel[98] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 145
		bodyModel[99] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 146
		bodyModel[100] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 147
		bodyModel[101] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 148
		bodyModel[102] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 149
		bodyModel[103] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 150
		bodyModel[104] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 151
		bodyModel[105] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 152
		bodyModel[106] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 153
		bodyModel[107] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 154
		bodyModel[108] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 155
		bodyModel[109] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 156
		bodyModel[110] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 157
		bodyModel[111] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 158
		bodyModel[112] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 159
		bodyModel[113] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 160
		bodyModel[114] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 161
		bodyModel[115] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 162
		bodyModel[116] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 163
		bodyModel[117] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 164
		bodyModel[118] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 165
		bodyModel[119] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 166
		bodyModel[120] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 167
		bodyModel[121] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 168
		bodyModel[122] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 169
		bodyModel[123] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 170
		bodyModel[124] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 171
		bodyModel[125] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 172
		bodyModel[126] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 173
		bodyModel[127] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 174
		bodyModel[128] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 175
		bodyModel[129] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 176
		bodyModel[130] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 177
		bodyModel[131] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 179
		bodyModel[132] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 180
		bodyModel[133] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 181
		bodyModel[134] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 182
		bodyModel[135] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 183
		bodyModel[136] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 184
		bodyModel[137] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 241
		bodyModel[138] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 242
		bodyModel[139] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 141
		bodyModel[140] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 142
		bodyModel[141] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 143
		bodyModel[142] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 144
		bodyModel[143] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 145
		bodyModel[144] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 145
		bodyModel[145] = new ModelRendererTurbo(this, 327, 97, textureX, textureY); // Box 146

		bodyModel[0].addBox(0F, 0F, 0F, 43, 24, 1, 0F); // Box 204
		bodyModel[0].setRotationPoint(-50.5F, -19F, 10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 24, 22, 0F); // Box 12
		bodyModel[1].setRotationPoint(-51.5F, -19F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 24, 22, 0F); // Box 13
		bodyModel[2].setRotationPoint(50.5F, -19F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 101, 1, 20, 0F); // Box 14
		bodyModel[3].setRotationPoint(-50.5F, 4F, -10F);

		bodyModel[4].addBox(0F, 0F, 0F, 101, 1, 20, 0F); // Box 15
		bodyModel[4].setRotationPoint(-50.5F, -19F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 103, 2, 10, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[5].setRotationPoint(-51.5F, -21F, -10F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 103, 1, 1, 0F,0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[6].setRotationPoint(-51.5F, -20F, -11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 103, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[7].setRotationPoint(-51.5F, -20F, 10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 103, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[8].setRotationPoint(-51.5F, -21F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[9].setRotationPoint(-27.5F, -18.5F, 11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[10].setRotationPoint(-27.5F, 3.5F, 11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(-51.5F, -17F, 11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 25
		bodyModel[12].setRotationPoint(-50.5F, -17.3F, 11.2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 25
		bodyModel[13].setRotationPoint(-50.5F, 4.3F, 11.2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 25
		bodyModel[14].setRotationPoint(-50.5F, 1F, 11.2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 25
		bodyModel[15].setRotationPoint(-50.5F, -2F, 11.2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 25
		bodyModel[16].setRotationPoint(-50.5F, -5F, 11.2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 25
		bodyModel[17].setRotationPoint(-50.5F, -8F, 11.2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 25
		bodyModel[18].setRotationPoint(-50.5F, -11F, 11.2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 25
		bodyModel[19].setRotationPoint(-50.5F, -14F, 11.2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-45.5F, -17F, 11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(50.5F, -5F, -11.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 31
		bodyModel[22].setRotationPoint(51F, 1.3F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 31
		bodyModel[23].setRotationPoint(51F, -2F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 31
		bodyModel[24].setRotationPoint(51F, -5F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F); // Box 22
		bodyModel[25].setRotationPoint(50.8F, -5F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 22
		bodyModel[26].setRotationPoint(50.8F, -5F, -11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 31
		bodyModel[27].setRotationPoint(45.5F, -5F, -11.7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 31
		bodyModel[28].setRotationPoint(45.5F, -2F, -11.7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 31
		bodyModel[29].setRotationPoint(45.5F, 1F, -11.7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 31
		bodyModel[30].setRotationPoint(45.5F, 4.3F, -11.7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 22
		bodyModel[31].setRotationPoint(44.5F, -5F, -11.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 79
		bodyModel[32].setRotationPoint(47.5F, 5F, 0F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 79
		bodyModel[33].setRotationPoint(53.5F, 4.5F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[34].setRotationPoint(53.5F, 4.5F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[35].setRotationPoint(53.5F, 4.5F, 1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[36].setRotationPoint(55.5F, 4.5F, 0F);

		bodyModel[37].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 79
		bodyModel[37].setRotationPoint(-53.5F, 5F, 0F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[38].setRotationPoint(-56.5F, 4.5F, 0F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[39].setRotationPoint(-55.5F, 4.5F, -1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[40].setRotationPoint(-56.5F, 4.5F, 1F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 79
		bodyModel[41].setRotationPoint(-54.5F, 4.5F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 103, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 17
		bodyModel[42].setRotationPoint(-51.5F, 5F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 103, 1, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[43].setRotationPoint(-51.5F, 5F, 10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.3F, -0.9F, 0F, -1.3F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 17
		bodyModel[44].setRotationPoint(-51.5F, 5F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -1.3F, 0F, 0F, -1.3F); // Box 17
		bodyModel[45].setRotationPoint(-51.5F, 5F, -11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -1.3F, -0.9F, 0F, -1.3F); // Box 17
		bodyModel[46].setRotationPoint(50.5F, 5F, -11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F, -0.9F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.1F, -0.9F, 0F, -0.1F); // Box 17
		bodyModel[47].setRotationPoint(50.5F, 5F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 94
		bodyModel[48].setRotationPoint(51F, 4.6F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 95
		bodyModel[49].setRotationPoint(51F, -5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 96
		bodyModel[50].setRotationPoint(50.8F, -5F, 5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 97
		bodyModel[51].setRotationPoint(51F, -2F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F); // Box 98
		bodyModel[52].setRotationPoint(50.8F, -5F, 10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 99
		bodyModel[53].setRotationPoint(51F, 1.3F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 100
		bodyModel[54].setRotationPoint(51F, 4.6F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 101
		bodyModel[55].setRotationPoint(-51.85F, -5F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[56].setRotationPoint(-51.85F, -5F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 103
		bodyModel[57].setRotationPoint(-52.25F, -5F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 104
		bodyModel[58].setRotationPoint(-52.25F, -2F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 105
		bodyModel[59].setRotationPoint(-52.25F, 1.3F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 106
		bodyModel[60].setRotationPoint(-52.25F, 4.6F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[61].setRotationPoint(-51.85F, -5F, 5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 108
		bodyModel[62].setRotationPoint(-51.85F, -5F, 10F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 109
		bodyModel[63].setRotationPoint(-52.25F, -2F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 110
		bodyModel[64].setRotationPoint(-52.25F, -5F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 111
		bodyModel[65].setRotationPoint(-52.25F, 1.3F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 112
		bodyModel[66].setRotationPoint(-52.25F, 4.6F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 113
		bodyModel[67].setRotationPoint(-50.5F, 4.6F, -11.7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 114
		bodyModel[68].setRotationPoint(-51.5F, -5F, -11.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[69].setRotationPoint(-46.5F, -5F, -11.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 116
		bodyModel[70].setRotationPoint(-50.5F, 1.3F, -11.7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 117
		bodyModel[71].setRotationPoint(-50.5F, -2F, -11.7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 118
		bodyModel[72].setRotationPoint(-50.5F, -5F, -11.7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 120
		bodyModel[73].setRotationPoint(45.5F, -2F, 10.7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 121
		bodyModel[74].setRotationPoint(45.5F, -5F, 10.7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 122
		bodyModel[75].setRotationPoint(45.5F, 1F, 10.7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 123
		bodyModel[76].setRotationPoint(45.5F, 4.3F, 10.7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F); // Box 124
		bodyModel[77].setRotationPoint(44.5F, -5F, 10.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[78].setRotationPoint(50.5F, -5F, 10.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 73, 2, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[79].setRotationPoint(-36.5F, 6F, 10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 127
		bodyModel[80].setRotationPoint(-43.5F, 6F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -2F, -0.9F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[81].setRotationPoint(36.5F, 6F, 10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 73, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 129
		bodyModel[82].setRotationPoint(-36.5F, 6F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, -2F, -0.9F); // Box 130
		bodyModel[83].setRotationPoint(-43.5F, 6F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.9F, 0F, 0F, -0.9F); // Box 131
		bodyModel[84].setRotationPoint(36.5F, 6F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 102, 2, 1, 0F); // Box 132
		bodyModel[85].setRotationPoint(-51F, -19F, 10.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 133
		bodyModel[86].setRotationPoint(-45.5F, -17F, 10.4F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 134
		bodyModel[87].setRotationPoint(-39.5F, -17F, 10.4F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 135
		bodyModel[88].setRotationPoint(-33.5F, -17F, 10.4F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 136
		bodyModel[89].setRotationPoint(-27.5F, -17F, 10.4F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 137
		bodyModel[90].setRotationPoint(-21.5F, -17F, 10.4F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 138
		bodyModel[91].setRotationPoint(-15.5F, -17F, 10.4F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 139
		bodyModel[92].setRotationPoint(-9.5F, -17F, 10.4F);

		bodyModel[93].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 140
		bodyModel[93].setRotationPoint(44.5F, -17F, 10.4F);

		bodyModel[94].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 141
		bodyModel[94].setRotationPoint(38.5F, -17F, 10.4F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 142
		bodyModel[95].setRotationPoint(32.5F, -17F, 10.4F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 143
		bodyModel[96].setRotationPoint(26.5F, -17F, 10.4F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 144
		bodyModel[97].setRotationPoint(20.5F, -17F, 10.4F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 145
		bodyModel[98].setRotationPoint(14.5F, -17F, 10.4F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 146
		bodyModel[99].setRotationPoint(8.5F, -17F, 10.4F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 147
		bodyModel[100].setRotationPoint(7.5F, -17.5F, 10.75F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 148
		bodyModel[101].setRotationPoint(-8.5F, -17.5F, 10.75F);

		bodyModel[102].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 149
		bodyModel[102].setRotationPoint(-7.5F, -12.5F, 10.75F);

		bodyModel[103].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 150
		bodyModel[103].setRotationPoint(-7.5F, -3.5F, 10.75F);

		bodyModel[104].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 151
		bodyModel[104].setRotationPoint(-7.5F, 2F, 10.75F);

		bodyModel[105].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 152
		bodyModel[105].setRotationPoint(-7.5F, -17F, 10.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[106].setRotationPoint(-5.5F, -17.5F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[107].setRotationPoint(4.5F, -17.5F, 11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[108].setRotationPoint(-0.5F, -2F, 10.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,-0.5F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, -0.75F, 0F, -2F, -0.75F, 0F, -2F, 0F, -0.5F, 0F, 0F); // Box 156
		bodyModel[109].setRotationPoint(-0.5F, -2.5F, 11F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -0.75F, -0.5F, -2F, -0.75F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, -2F, 0F); // Box 157
		bodyModel[110].setRotationPoint(-4.5F, -2.5F, 11F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 158
		bodyModel[111].setRotationPoint(-45.5F, -17F, -11.4F);

		bodyModel[112].addBox(0F, 0F, 0F, 102, 2, 1, 0F); // Box 159
		bodyModel[112].setRotationPoint(-51F, -19F, -11.5F);

		bodyModel[113].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 160
		bodyModel[113].setRotationPoint(-39.5F, -17F, -11.4F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 161
		bodyModel[114].setRotationPoint(-33.5F, -17F, -11.4F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 162
		bodyModel[115].setRotationPoint(-27.5F, -17F, -11.4F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 163
		bodyModel[116].setRotationPoint(-21.5F, -17F, -11.4F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 164
		bodyModel[117].setRotationPoint(-15.5F, -17F, -11.4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 165
		bodyModel[118].setRotationPoint(-0.5F, -2F, -11.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -0.75F, 0F, 0F, -0.75F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -2F, -0.75F); // Box 166
		bodyModel[119].setRotationPoint(-4.5F, -2.5F, -12F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,-0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, -2F, -0.75F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.75F, -0.5F, 0F, -0.75F); // Box 167
		bodyModel[120].setRotationPoint(-0.5F, -2.5F, -12F);

		bodyModel[121].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 168
		bodyModel[121].setRotationPoint(-7.5F, -3.5F, -11.75F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 169
		bodyModel[122].setRotationPoint(4.5F, -17.5F, -12F);

		bodyModel[123].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 170
		bodyModel[123].setRotationPoint(-7.5F, -12.5F, -11.75F);

		bodyModel[124].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 171
		bodyModel[124].setRotationPoint(-7.5F, -17F, -11.75F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 172
		bodyModel[125].setRotationPoint(-5.5F, -17.5F, -12F);

		bodyModel[126].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 173
		bodyModel[126].setRotationPoint(-8.5F, -17.5F, -11.75F);

		bodyModel[127].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 174
		bodyModel[127].setRotationPoint(-9.5F, -17F, -11.4F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 21, 1, 0F); // Box 175
		bodyModel[128].setRotationPoint(7.5F, -17.5F, -11.75F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 176
		bodyModel[129].setRotationPoint(8.5F, -17F, -11.4F);

		bodyModel[130].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Box 177
		bodyModel[130].setRotationPoint(-7.5F, 2F, -11.75F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 179
		bodyModel[131].setRotationPoint(44.5F, -17F, -11.4F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 180
		bodyModel[132].setRotationPoint(38.5F, -17F, -11.4F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 181
		bodyModel[133].setRotationPoint(32.5F, -17F, -11.4F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 182
		bodyModel[134].setRotationPoint(26.5F, -17F, -11.4F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 183
		bodyModel[135].setRotationPoint(20.5F, -17F, -11.4F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 23, 1, 0F); // Box 184
		bodyModel[136].setRotationPoint(14.5F, -17F, -11.4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[137].setRotationPoint(-51.75F, 0F, -5.7F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 242
		bodyModel[138].setRotationPoint(50.75F, 0F, 2.7F);

		bodyModel[139].addBox(0F, 0F, 0F, 43, 24, 1, 0F); // Box 141
		bodyModel[139].setRotationPoint(7.5F, -19F, 10F);

		bodyModel[140].addBox(0F, 0F, 0F, 15, 24, 1, 0F); // Box 142
		bodyModel[140].setRotationPoint(-7.5F, -19F, 10F);

		bodyModel[141].addBox(0F, 0F, 0F, 43, 24, 1, 0F); // Box 143
		bodyModel[141].setRotationPoint(-50.5F, -19F, -11F);

		bodyModel[142].addBox(0F, 0F, 0F, 15, 24, 1, 0F); // Box 144
		bodyModel[142].setRotationPoint(-7.5F, -19F, -11F);

		bodyModel[143].addBox(0F, 0F, 0F, 43, 24, 1, 0F); // Box 145
		bodyModel[143].setRotationPoint(7.5F, -19F, -11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 145
		bodyModel[144].setRotationPoint(-8.5F, -18.5F, -12F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 146
		bodyModel[145].setRotationPoint(-8.5F, 3.5F, -12F);
	}
}