package wwcp.models.bogies.AmericanTrucks;


import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class HiAd4Axel extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public HiAd4Axel() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[116];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 124
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 104
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 110
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 172
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 173
		bodyModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY).setName(StaticModelAnimator.tagWheel); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY).setName(StaticModelAnimator.tagWheel); // Box 39
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY).setName(StaticModelAnimator.tagWheel); // Box 6
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY).setName(StaticModelAnimator.tagWheel); // Box 8
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 120
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 138
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 139
		bodyModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 67
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 171
		bodyModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 172
		bodyModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 173
		bodyModel[19] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 174
		bodyModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 175
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 176
		bodyModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 177
		bodyModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 178
		bodyModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 179
		bodyModel[25] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 180
		bodyModel[26] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 181
		bodyModel[27] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 182
		bodyModel[28] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 183
		bodyModel[29] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 51
		bodyModel[30] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 52
		bodyModel[31] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 53
		bodyModel[32] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 219
		bodyModel[33] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 220
		bodyModel[34] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 221
		bodyModel[35] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 338
		bodyModel[36] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 341
		bodyModel[37] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 342
		bodyModel[38] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 343
		bodyModel[39] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 344
		bodyModel[40] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 345
		bodyModel[41] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 346
		bodyModel[42] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 369
		bodyModel[43] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 370
		bodyModel[44] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 371
		bodyModel[45] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 220
		bodyModel[46] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 221
		bodyModel[47] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 222
		bodyModel[48] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 223
		bodyModel[49] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 224
		bodyModel[50] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 225
		bodyModel[51] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 226
		bodyModel[52] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 228
		bodyModel[53] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 229
		bodyModel[54] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 347
		bodyModel[55] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 350
		bodyModel[56] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 62
		bodyModel[60] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 72
		bodyModel[67] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 73
		bodyModel[68] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 77
		bodyModel[69] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 78
		bodyModel[70] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 79
		bodyModel[71] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 78
		bodyModel[73] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 79
		bodyModel[74] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 81
		bodyModel[75] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 84
		bodyModel[76] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 85
		bodyModel[77] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 86
		bodyModel[78] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 88
		bodyModel[79] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 89
		bodyModel[80] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 90
		bodyModel[81] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 91
		bodyModel[82] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 92
		bodyModel[83] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 93
		bodyModel[84] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 94
		bodyModel[85] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 95
		bodyModel[86] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 96
		bodyModel[87] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 98
		bodyModel[88] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 99
		bodyModel[89] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 102
		bodyModel[90] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 103
		bodyModel[91] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 104
		bodyModel[92] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 105
		bodyModel[93] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 106
		bodyModel[94] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 107
		bodyModel[95] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 108
		bodyModel[96] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 109
		bodyModel[97] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 110
		bodyModel[98] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 111
		bodyModel[99] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 112
		bodyModel[100] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 113
		bodyModel[101] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 114
		bodyModel[102] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 115
		bodyModel[103] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 116
		bodyModel[104] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 117
		bodyModel[105] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 118
		bodyModel[106] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 119
		bodyModel[107] = new ModelRendererTurbo(this, 2, 52, textureX, textureY); // Box 108
		bodyModel[108] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 109
		bodyModel[109] = new ModelRendererTurbo(this, 2, 52, textureX, textureY); // Box 110
		bodyModel[110] = new ModelRendererTurbo(this, 23, 52, textureX, textureY); // Box 111
		bodyModel[111] = new ModelRendererTurbo(this, 33, 63, textureX, textureY); // Box 112
		bodyModel[112] = new ModelRendererTurbo(this, 23, 62, textureX, textureY); // Box 113
		bodyModel[113] = new ModelRendererTurbo(this, 33, 63, textureX, textureY); // Box 113
		bodyModel[114] = new ModelRendererTurbo(this, 23, 62, textureX, textureY); // Box 114
		bodyModel[115] = new ModelRendererTurbo(this, 23, 52, textureX, textureY); // Box 115

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-11F, 5.5F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(9F, 5.5F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1F); // Box 116
		bodyModel[2].setRotationPoint(-15F, 3.5F, 5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 124
		bodyModel[3].setRotationPoint(-2F, 2.5F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[4].setRotationPoint(-11F, 5.5F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bodyModel[5].setRotationPoint(9F, 5.5F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 172
		bodyModel[6].setRotationPoint(9F, 5.5F, 8.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[7].setRotationPoint(-11F, 5.5F, 8.5F);

		bodyModel[8].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[8].setRotationPoint(-10F, 6.5F, 5.95F);

		bodyModel[9].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[9].setRotationPoint(-10F, 6.5F, -5.95F);

		bodyModel[10].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 6
		bodyModel[10].setRotationPoint(10F, 6.5F, 5.95F);

		bodyModel[11].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 8
		bodyModel[11].setRotationPoint(10F, 6.5F, -5.95F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 120
		bodyModel[12].setRotationPoint(14.5F, 4.5F, -6.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 138
		bodyModel[13].setRotationPoint(7F, 7.5F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 139
		bodyModel[14].setRotationPoint(-16F, 7.5F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[15].setRotationPoint(-2F, 6.5F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[16].setRotationPoint(-15F, 3.5F, -9F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 172
		bodyModel[17].setRotationPoint(-15F, 4.5F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[18].setRotationPoint(-15F, 3.5F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[19].setRotationPoint(-15F, 3.5F, 4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[20].setRotationPoint(-15F, 4.5F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 176
		bodyModel[21].setRotationPoint(-15F, 4.5F, 4F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 177
		bodyModel[22].setRotationPoint(14F, 4.5F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[23].setRotationPoint(14F, 4.5F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[24].setRotationPoint(14F, 3.5F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 180
		bodyModel[25].setRotationPoint(14F, 3.5F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
		bodyModel[26].setRotationPoint(14F, 4.5F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[27].setRotationPoint(14F, 3.5F, 4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.25F); // Box 183
		bodyModel[28].setRotationPoint(14F, 3.5F, 5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 51
		bodyModel[29].setRotationPoint(-13F, 2.5F, -10F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 52
		bodyModel[30].setRotationPoint(-11F, 3.4F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 53
		bodyModel[31].setRotationPoint(-7F, 3.4F, -10F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 219
		bodyModel[32].setRotationPoint(7F, 3.4F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 220
		bodyModel[33].setRotationPoint(4F, 3.4F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 221
		bodyModel[34].setRotationPoint(11F, 2.5F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 338
		bodyModel[35].setRotationPoint(11F, 2.5F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 341
		bodyModel[36].setRotationPoint(-13F, 2.5F, 9F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 342
		bodyModel[37].setRotationPoint(-11F, 3.4F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 343
		bodyModel[38].setRotationPoint(-7F, 3.4F, 9F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 344
		bodyModel[39].setRotationPoint(7F, 3.4F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 345
		bodyModel[40].setRotationPoint(4F, 3.4F, 9F);

		bodyModel[41].addBox(0F, 0F, 0F, 8, 4, 11, 0F); // Box 346
		bodyModel[41].setRotationPoint(-12.5F, 4F, -5.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 8, 4, 11, 0F); // Box 369
		bodyModel[42].setRotationPoint(4.5F, 4F, -5.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 370
		bodyModel[43].setRotationPoint(-4.5F, 4F, -6.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 371
		bodyModel[44].setRotationPoint(1.5F, 4F, -6.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 220
		bodyModel[45].setRotationPoint(-16F, 7.5F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 221
		bodyModel[46].setRotationPoint(7F, 7.5F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 222
		bodyModel[47].setRotationPoint(14.5F, 4.5F, 6.25F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 223
		bodyModel[48].setRotationPoint(-15.5F, 4.5F, 6.25F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 224
		bodyModel[49].setRotationPoint(-15.5F, 4.5F, -6.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 225
		bodyModel[50].setRotationPoint(-15.5F, 6.5F, 6.25F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 226
		bodyModel[51].setRotationPoint(-15.5F, 6.5F, -6.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 228
		bodyModel[52].setRotationPoint(14.5F, 6.5F, -6.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 229
		bodyModel[53].setRotationPoint(14.5F, 6.5F, 6.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[54].setRotationPoint(11F, 5F, 6.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 350
		bodyModel[55].setRotationPoint(-13F, 5F, 6.75F);

		bodyModel[56].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 59
		bodyModel[56].setRotationPoint(8F, 3F, 6.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[57].setRotationPoint(12F, 3F, 6.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 61
		bodyModel[58].setRotationPoint(6F, 3F, 6.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 1.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 1.25F, 0F); // Box 62
		bodyModel[59].setRotationPoint(3F, 4F, 6.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 64
		bodyModel[60].setRotationPoint(7F, 7F, 6.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 65
		bodyModel[61].setRotationPoint(7F, 6F, 6.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 66
		bodyModel[62].setRotationPoint(6F, 5F, 6.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 67
		bodyModel[63].setRotationPoint(-3F, 4.75F, 6.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 68
		bodyModel[64].setRotationPoint(9F, 5F, 6.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[65].setRotationPoint(9F, 7F, 6.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[66].setRotationPoint(-14F, 3F, 6.75F);

		bodyModel[67].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 73
		bodyModel[67].setRotationPoint(-12F, 3F, 6.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[68].setRotationPoint(-9F, 7F, 6.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[69].setRotationPoint(-11F, 7F, 6.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 79
		bodyModel[70].setRotationPoint(-11F, 5F, 6.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 76
		bodyModel[71].setRotationPoint(-1.5F, 6.75F, 8.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F); // Box 78
		bodyModel[72].setRotationPoint(-1.25F, 5F, 8.7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F); // Box 79
		bodyModel[73].setRotationPoint(0.25F, 5F, 8.7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[74].setRotationPoint(-8F, 3F, 6.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0.5F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.5F, -0.75F, 0F); // Box 84
		bodyModel[75].setRotationPoint(-6F, 4F, 6.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 85
		bodyModel[76].setRotationPoint(-9F, 5F, 6.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[77].setRotationPoint(-9F, 6F, 6.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[78].setRotationPoint(-14F, 3F, -8.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 89
		bodyModel[79].setRotationPoint(-13F, 5F, -8.75F);

		bodyModel[80].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 90
		bodyModel[80].setRotationPoint(-12F, 3F, -8.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[81].setRotationPoint(-8F, 3F, -8.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 92
		bodyModel[82].setRotationPoint(-9F, 5F, -8.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[83].setRotationPoint(-9F, 6F, -8.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[84].setRotationPoint(-9F, 7F, -8.75F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 95
		bodyModel[85].setRotationPoint(-11F, 5F, -8.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[86].setRotationPoint(-11F, 7F, -8.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F); // Box 98
		bodyModel[87].setRotationPoint(-1.25F, 5F, -9.7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F); // Box 99
		bodyModel[88].setRotationPoint(0.25F, 5F, -9.7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		bodyModel[89].setRotationPoint(6F, 3F, -8.75F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 103
		bodyModel[90].setRotationPoint(8F, 3F, -8.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 104
		bodyModel[91].setRotationPoint(6F, 5F, -8.75F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 105
		bodyModel[92].setRotationPoint(7F, 6F, -8.75F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 106
		bodyModel[93].setRotationPoint(7F, 7F, -8.75F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[94].setRotationPoint(9F, 7F, -8.75F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 108
		bodyModel[95].setRotationPoint(9F, 5F, -8.75F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[96].setRotationPoint(12F, 3F, -8.75F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[97].setRotationPoint(11F, 5F, -8.75F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 111
		bodyModel[98].setRotationPoint(-1.5F, 3.5F, -9.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[99].setRotationPoint(-1.5F, 6.75F, -9.75F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 113
		bodyModel[100].setRotationPoint(-3F, 4.75F, -8.75F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -0.5F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, 1.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 1.25F, 0F); // Box 114
		bodyModel[101].setRotationPoint(3F, 4F, -8.75F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0.5F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0.5F, -0.75F, 0F); // Box 115
		bodyModel[102].setRotationPoint(-6F, 4F, -8.75F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 116
		bodyModel[103].setRotationPoint(4F, 3.25F, 6.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 117
		bodyModel[104].setRotationPoint(-7F, 3.25F, 6.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 118
		bodyModel[105].setRotationPoint(-7F, 3.25F, -8.75F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 119
		bodyModel[106].setRotationPoint(4F, 3.25F, -8.75F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[107].setRotationPoint(-1F, 1.75F, 7.75F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 109
		bodyModel[108].setRotationPoint(-1.5F, 3.5F, 1.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 110
		bodyModel[109].setRotationPoint(-2F, 1.75F, -9.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[110].setRotationPoint(1.5F, 4F, -9.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[111].setRotationPoint(1.5F, 7.25F, -9.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 113
		bodyModel[112].setRotationPoint(1.5F, 4F, -9.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[113].setRotationPoint(-2.5F, 7.25F, 8.75F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 114
		bodyModel[114].setRotationPoint(-2.5F, 4F, 8.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[115].setRotationPoint(-2.5F, 4F, 8.75F);
	}
}