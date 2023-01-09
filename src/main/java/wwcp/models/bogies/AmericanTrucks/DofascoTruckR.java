package wwcp.models.bogies.AmericanTrucks;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class DofascoTruckR extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public DofascoTruckR() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[142];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 39
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 124
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 173
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 9
		bodyModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 39
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 173
		bodyModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 6
		bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 8
		bodyModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 8
		bodyModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 7
		bodyModel[18] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 11
		bodyModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 12
		bodyModel[20] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 11
		bodyModel[21] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 8
		bodyModel[22] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 8
		bodyModel[23] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 11
		bodyModel[24] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 31
		bodyModel[26] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 8
		bodyModel[27] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 12
		bodyModel[28] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 8
		bodyModel[31] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 51
		bodyModel[32] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 54
		bodyModel[33] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 55
		bodyModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 56
		bodyModel[35] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 57
		bodyModel[36] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 58
		bodyModel[37] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 59
		bodyModel[38] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 60
		bodyModel[39] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 62
		bodyModel[40] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 63
		bodyModel[41] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 64
		bodyModel[42] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 6
		bodyModel[43] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 8
		bodyModel[44] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 8
		bodyModel[45] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[46] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 75
		bodyModel[47] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 76
		bodyModel[48] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 77
		bodyModel[49] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 78
		bodyModel[50] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 79
		bodyModel[51] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 80
		bodyModel[52] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 12
		bodyModel[53] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 173
		bodyModel[54] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 173
		bodyModel[55] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 173
		bodyModel[56] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 12
		bodyModel[57] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 342
		bodyModel[58] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 343
		bodyModel[59] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 342
		bodyModel[60] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 343
		bodyModel[61] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 12
		bodyModel[62] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 96
		bodyModel[63] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 96
		bodyModel[64] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 98
		bodyModel[65] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 99
		bodyModel[66] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 100
		bodyModel[67] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 100
		bodyModel[68] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 102
		bodyModel[69] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 103
		bodyModel[70] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 104
		bodyModel[71] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 105
		bodyModel[72] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 105
		bodyModel[73] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 107
		bodyModel[74] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 107
		bodyModel[75] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 107
		bodyModel[76] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 31
		bodyModel[77] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 31
		bodyModel[78] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 31
		bodyModel[79] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 31
		bodyModel[80] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 114
		bodyModel[81] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 115
		bodyModel[82] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 116
		bodyModel[83] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 117
		bodyModel[84] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 118
		bodyModel[85] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 119
		bodyModel[86] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 120
		bodyModel[87] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 121
		bodyModel[88] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 122
		bodyModel[89] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 123
		bodyModel[90] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 124
		bodyModel[91] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 125
		bodyModel[92] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 126
		bodyModel[93] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 127
		bodyModel[94] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 128
		bodyModel[95] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 129
		bodyModel[96] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 130
		bodyModel[97] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 131
		bodyModel[98] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 132
		bodyModel[99] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 133
		bodyModel[100] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 134
		bodyModel[101] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 135
		bodyModel[102] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 136
		bodyModel[103] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 137
		bodyModel[104] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 138
		bodyModel[105] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 139
		bodyModel[106] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 140
		bodyModel[107] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 141
		bodyModel[108] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 142
		bodyModel[109] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 143
		bodyModel[110] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 144
		bodyModel[111] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 145
		bodyModel[112] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 146
		bodyModel[113] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 147
		bodyModel[114] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 148
		bodyModel[115] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 149
		bodyModel[116] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 150
		bodyModel[117] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 151
		bodyModel[118] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 152
		bodyModel[119] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 153
		bodyModel[120] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 154
		bodyModel[121] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 155
		bodyModel[122] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 156
		bodyModel[123] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 157
		bodyModel[124] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 158
		bodyModel[125] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 159
		bodyModel[126] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 160
		bodyModel[127] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 161
		bodyModel[128] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 132
		bodyModel[129] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 163
		bodyModel[130] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 124
		bodyModel[131] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 124
		bodyModel[132] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 166
		bodyModel[133] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 342
		bodyModel[134] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 342
		bodyModel[135] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 343
		bodyModel[136] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 98
		bodyModel[137] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 341
		bodyModel[138] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 341
		bodyModel[139] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 341
		bodyModel[140] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 341
		bodyModel[141] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 343

		bodyModel[0].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[0].setRotationPoint(0F, 6.5F, -5.95F);

		bodyModel[1].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[1].setRotationPoint(0F, 6.5F, 5.95F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 124
		bodyModel[2].setRotationPoint(-2F, 2.5F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 173
		bodyModel[3].setRotationPoint(-1F, 5.5F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 6
		bodyModel[4].setRotationPoint(-1F, 5.5F, -8.75F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 31, 2, 2, 0F,-0.25F, -0.25F, 0F, 4.25F, -0.25F, 0F, 4.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(-17.5F, 2.25F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-4.25F, 4.25F, -8.9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-2.25F, 6.25F, -8.9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 7
		bodyModel[8].setRotationPoint(-1F, 4.25F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-4F, 4.25F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -1F, 1F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-11.25F, 4.25F, -9F);

		bodyModel[11].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[11].setRotationPoint(-13.5F, 6.5F, -5.95F);

		bodyModel[12].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[12].setRotationPoint(-13.5F, 6.5F, 5.95F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F); // Box 173
		bodyModel[13].setRotationPoint(-14.5F, 5.5F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 6
		bodyModel[14].setRotationPoint(-14.5F, 5.5F, -8.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[15].setRotationPoint(-12.25F, 4.25F, -8.9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.25F, 0.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 8
		bodyModel[16].setRotationPoint(-16.75F, 6.25F, -8.9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 7
		bodyModel[17].setRotationPoint(-14.5F, 4.25F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[18].setRotationPoint(-12.5F, 4.25F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.25F, -0.75F, 0F); // Box 12
		bodyModel[19].setRotationPoint(-19.25F, 4.25F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F); // Box 11
		bodyModel[20].setRotationPoint(-17.5F, 4.25F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[21].setRotationPoint(1.25F, 4.25F, -8.9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[22].setRotationPoint(1.25F, 6.25F, -8.9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F); // Box 11
		bodyModel[23].setRotationPoint(1F, 4.25F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[24].setRotationPoint(-1.1F, 4.4F, -8.9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[25].setRotationPoint(0.1F, 4.4F, -8.9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[26].setRotationPoint(-12.25F, 6.25F, -8.9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 12
		bodyModel[27].setRotationPoint(2.75F, 4.25F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 6
		bodyModel[28].setRotationPoint(-14.5F, 8F, -8.9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 39
		bodyModel[29].setRotationPoint(-1F, 8F, -8.9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 8
		bodyModel[30].setRotationPoint(-16.75F, 4.5F, -8.9F);

		bodyModel[31].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 51
		bodyModel[31].setRotationPoint(13.5F, 6.5F, -5.95F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 54
		bodyModel[32].setRotationPoint(12.5F, 5.5F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 55
		bodyModel[33].setRotationPoint(12.5F, 8F, -8.9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 56
		bodyModel[34].setRotationPoint(11.25F, 6.25F, -8.9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 57
		bodyModel[35].setRotationPoint(9.25F, 4.25F, -8.9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[36].setRotationPoint(14.5F, 4.25F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 59
		bodyModel[37].setRotationPoint(12.5F, 4.25F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F); // Box 60
		bodyModel[38].setRotationPoint(9.5F, 4.25F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[39].setRotationPoint(11.5F, 1.5F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 63
		bodyModel[40].setRotationPoint(15.25F, 1.5F, -9F);

		bodyModel[41].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 64
		bodyModel[41].setRotationPoint(13.5F, 6.5F, 5.95F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 6
		bodyModel[42].setRotationPoint(12.5F, 5.5F, -8.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[43].setRotationPoint(14.75F, 6.25F, -8.9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F); // Box 8
		bodyModel[44].setRotationPoint(14.75F, 4.5F, -8.9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 74
		bodyModel[45].setRotationPoint(9.75F, 1.5F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 75
		bodyModel[46].setRotationPoint(-3.75F, 1.5F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[47].setRotationPoint(-2F, 1.5F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 77
		bodyModel[48].setRotationPoint(1.75F, 1.5F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 78
		bodyModel[49].setRotationPoint(-17.25F, 1.5F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[50].setRotationPoint(-15.5F, 1.5F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 80
		bodyModel[51].setRotationPoint(-11.75F, 1.5F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 12
		bodyModel[52].setRotationPoint(-19.25F, 2.25F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F); // Box 173
		bodyModel[53].setRotationPoint(-14.5F, 5.5F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F); // Box 173
		bodyModel[54].setRotationPoint(-1F, 5.5F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F); // Box 173
		bodyModel[55].setRotationPoint(12.5F, 5.5F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 12
		bodyModel[56].setRotationPoint(-21F, 2.5F, -7F);

		bodyModel[57].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 342
		bodyModel[57].setRotationPoint(9.5F, 3.4F, -10.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 343
		bodyModel[58].setRotationPoint(7.5F, 3.4F, -10.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 342
		bodyModel[59].setRotationPoint(-16.5F, 3.4F, -10.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F); // Box 343
		bodyModel[60].setRotationPoint(-18.5F, 3.4F, -10.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F); // Box 12
		bodyModel[61].setRotationPoint(-20F, 2.5F, -9F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 4, 11, 0F); // Box 96
		bodyModel[62].setRotationPoint(-3F, 3.5F, -5.5F);

		bodyModel[63].addBox(0F, 0F, 0F, 5, 4, 11, 0F); // Box 96
		bodyModel[63].setRotationPoint(9F, 3.5F, -5.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 5, 4, 11, 0F); // Box 98
		bodyModel[64].setRotationPoint(-14F, 3.5F, -5.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 6, 2, 11, 0F); // Box 99
		bodyModel[65].setRotationPoint(-9F, 3.5F, -5.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 6, 2, 11, 0F); // Box 100
		bodyModel[66].setRotationPoint(3F, 3.5F, -5.5F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 100
		bodyModel[67].setRotationPoint(2.5F, 3.5F, -8.5F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 102
		bodyModel[68].setRotationPoint(2.5F, 3.5F, 5.5F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 103
		bodyModel[69].setRotationPoint(-7.5F, 3.5F, 5.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Box 104
		bodyModel[70].setRotationPoint(-7.5F, 3.5F, -8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[71].setRotationPoint(-10F, 4.5F, -4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 105
		bodyModel[72].setRotationPoint(6F, 5F, -4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[73].setRotationPoint(4F, 5F, -4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.36F, 0F, -0.75F, -0.36F, 0F, -0.75F, -0.36F, 0F, 0F, -0.36F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 107
		bodyModel[74].setRotationPoint(4F, 8.75F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.36F, 0F, 0F, -0.36F, 0F, 0F, -0.36F, 0F, -0.75F, -0.36F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 107
		bodyModel[75].setRotationPoint(4F, 8.75F, -4F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[76].setRotationPoint(-14.6F, 4.4F, -8.9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[77].setRotationPoint(-13.4F, 4.4F, -8.9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[78].setRotationPoint(12.4F, 4.4F, -8.9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[79].setRotationPoint(13.6F, 4.4F, -8.9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 114
		bodyModel[80].setRotationPoint(15.25F, 1.5F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[81].setRotationPoint(11.5F, 1.5F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 116
		bodyModel[82].setRotationPoint(9.75F, 1.5F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 117
		bodyModel[83].setRotationPoint(1.75F, 1.5F, 7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[84].setRotationPoint(-2F, 1.5F, 7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 119
		bodyModel[85].setRotationPoint(-3.75F, 1.5F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F); // Box 120
		bodyModel[86].setRotationPoint(-11.75F, 1.5F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[87].setRotationPoint(-15.5F, 1.5F, 7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -1F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F); // Box 122
		bodyModel[88].setRotationPoint(-17.25F, 1.5F, 7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 31, 2, 2, 0F,-0.25F, -0.25F, 0F, 4.25F, -0.25F, 0F, 4.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 123
		bodyModel[89].setRotationPoint(-17.5F, 2.25F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 124
		bodyModel[90].setRotationPoint(-19.25F, 2.25F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 125
		bodyModel[91].setRotationPoint(-20F, 2.5F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.25F, -0.75F, 0F); // Box 126
		bodyModel[92].setRotationPoint(-19.25F, 4.25F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F); // Box 127
		bodyModel[93].setRotationPoint(-17.5F, 4.25F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[94].setRotationPoint(-15F, 4.25F, 7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F); // Box 129
		bodyModel[95].setRotationPoint(-12.5F, 4.25F, 7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, -1F, 1F, 0F); // Box 130
		bodyModel[96].setRotationPoint(-11.25F, 4.25F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F); // Box 131
		bodyModel[97].setRotationPoint(-4F, 4.25F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 132
		bodyModel[98].setRotationPoint(-1F, 4.25F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F); // Box 133
		bodyModel[99].setRotationPoint(1F, 4.25F, 7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, -0.5F, 1F, 0F); // Box 134
		bodyModel[100].setRotationPoint(2.75F, 4.25F, 7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 1F, 0F); // Box 135
		bodyModel[101].setRotationPoint(9.5F, 4.25F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 136
		bodyModel[102].setRotationPoint(9F, 4.25F, 7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 137
		bodyModel[103].setRotationPoint(14.5F, 4.25F, 7F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[104].setRotationPoint(14.75F, 6.25F, 6.9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 139
		bodyModel[105].setRotationPoint(14.75F, 4.5F, 6.9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 140
		bodyModel[106].setRotationPoint(13.6F, 4.4F, 7.9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 141
		bodyModel[107].setRotationPoint(12.4F, 4.4F, 7.9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 142
		bodyModel[108].setRotationPoint(9.25F, 4.25F, 6.9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 143
		bodyModel[109].setRotationPoint(11.25F, 6.25F, 6.9F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 144
		bodyModel[110].setRotationPoint(12.5F, 8F, 6.9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[111].setRotationPoint(1.25F, 4.25F, 6.9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[112].setRotationPoint(1.25F, 6.25F, 6.9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 147
		bodyModel[113].setRotationPoint(0.1F, 4.4F, 7.9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 148
		bodyModel[114].setRotationPoint(-1.1F, 4.4F, 7.9F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 149
		bodyModel[115].setRotationPoint(-1F, 8F, 6.9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 150
		bodyModel[116].setRotationPoint(-2.25F, 6.25F, 6.9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 151
		bodyModel[117].setRotationPoint(-4.25F, 4.25F, 6.9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 152
		bodyModel[118].setRotationPoint(12.5F, 5.5F, 7.75F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 153
		bodyModel[119].setRotationPoint(-3F, 5.5F, 7.75F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[120].setRotationPoint(-12.25F, 4.25F, 6.9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[121].setRotationPoint(-12.25F, 6.25F, 6.9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 156
		bodyModel[122].setRotationPoint(-13.4F, 4.4F, 7.9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 157
		bodyModel[123].setRotationPoint(-14.6F, 4.4F, 7.9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 158
		bodyModel[124].setRotationPoint(-14.5F, 8F, 6.9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Box 159
		bodyModel[125].setRotationPoint(-14.5F, 5.5F, 7.75F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.25F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.25F, 0.75F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 160
		bodyModel[126].setRotationPoint(-16.75F, 6.25F, 6.9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 161
		bodyModel[127].setRotationPoint(-16.75F, 4.5F, 6.9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 132
		bodyModel[128].setRotationPoint(12.5F, 4.25F, 7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 163
		bodyModel[129].setRotationPoint(-14.5F, 4.25F, 7F);

		bodyModel[130].addBox(0F, 0F, 0F, 4, 2, 8, 0F); // Box 124
		bodyModel[130].setRotationPoint(4F, 1.5F, -4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 124
		bodyModel[131].setRotationPoint(-7.5F, 1.5F, 1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 3, 10, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F); // Box 166
		bodyModel[132].setRotationPoint(-7.5F, 1.5F, -4F);

		bodyModel[133].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 342
		bodyModel[133].setRotationPoint(9.5F, 3.4F, 9.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 342
		bodyModel[134].setRotationPoint(-16.5F, 3.4F, 9.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 343
		bodyModel[135].setRotationPoint(-18.5F, 3.4F, 9.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 98
		bodyModel[136].setRotationPoint(-17F, 3.5F, -5.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[137].setRotationPoint(-12.5F, 2F, 10F);
		bodyModel[137].rotateAngleX = -0.78539816F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[138].setRotationPoint(13.5F, 2F, 10F);
		bodyModel[138].rotateAngleX = -0.78539816F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[139].setRotationPoint(-12.5F, 2F, -10F);
		bodyModel[139].rotateAngleX = -0.78539816F;

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[140].setRotationPoint(13.5F, 2F, -10F);
		bodyModel[140].rotateAngleX = -0.78539816F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 343
		bodyModel[141].setRotationPoint(7.5F, 3.4F, 9.5F);
	}
}