package wwcp.models.bogies.AmericanTrucks;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Type_B extends ModelBase
{
	int textureX = 256;
	int textureY = 256;

	public Type_B() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[121];

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
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 104
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 110
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 172
		bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 173
		bodyModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 39
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 6
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 8
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 120
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 138
		bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 139
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 52
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 85
		bodyModel[17] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 333
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 59
		bodyModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 60
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 65
		bodyModel[21] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 91
		bodyModel[22] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 92
		bodyModel[23] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 93
		bodyModel[24] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 94
		bodyModel[25] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 346
		bodyModel[26] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 347
		bodyModel[27] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 350
		bodyModel[28] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 351
		bodyModel[29] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 352
		bodyModel[30] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 353
		bodyModel[31] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 354
		bodyModel[32] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 66
		bodyModel[38] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 67
		bodyModel[39] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 37
		bodyModel[40] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 37
		bodyModel[41] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 37
		bodyModel[42] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[43] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 155
		bodyModel[44] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 157
		bodyModel[45] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 158
		bodyModel[46] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 159
		bodyModel[47] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 160
		bodyModel[48] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 161
		bodyModel[49] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 162
		bodyModel[50] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 165
		bodyModel[51] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 166
		bodyModel[52] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 167
		bodyModel[53] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 168
		bodyModel[54] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 169
		bodyModel[55] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 170
		bodyModel[56] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 171
		bodyModel[57] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 172
		bodyModel[58] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 173
		bodyModel[59] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 174
		bodyModel[60] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 175
		bodyModel[61] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 176
		bodyModel[62] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 177
		bodyModel[63] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 178
		bodyModel[64] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 179
		bodyModel[65] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 180
		bodyModel[66] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 181
		bodyModel[67] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 182
		bodyModel[68] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 183
		bodyModel[69] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 51
		bodyModel[70] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 52
		bodyModel[71] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 53
		bodyModel[72] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 219
		bodyModel[73] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 220
		bodyModel[74] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 221
		bodyModel[75] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 338
		bodyModel[76] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 341
		bodyModel[77] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 342
		bodyModel[78] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 343
		bodyModel[79] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 344
		bodyModel[80] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 345
		bodyModel[81] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 196
		bodyModel[82] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 197
		bodyModel[83] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 198
		bodyModel[84] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 199
		bodyModel[85] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 200
		bodyModel[86] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 201
		bodyModel[87] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 202
		bodyModel[88] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 203
		bodyModel[89] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 204
		bodyModel[90] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 104
		bodyModel[91] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 207
		bodyModel[92] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 208
		bodyModel[93] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 209
		bodyModel[94] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 210
		bodyModel[95] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 211
		bodyModel[96] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 212
		bodyModel[97] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 213
		bodyModel[98] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 95
		bodyModel[99] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 96
		bodyModel[100] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 346
		bodyModel[101] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 369
		bodyModel[102] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 370
		bodyModel[103] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 371
		bodyModel[104] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 220
		bodyModel[105] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 221
		bodyModel[106] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 222
		bodyModel[107] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 223
		bodyModel[108] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 224
		bodyModel[109] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 225
		bodyModel[110] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 226
		bodyModel[111] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 228
		bodyModel[112] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 229
		bodyModel[113] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 230
		bodyModel[114] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 231
		bodyModel[115] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 232
		bodyModel[116] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 233
		bodyModel[117] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 234
		bodyModel[118] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 235
		bodyModel[119] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 236
		bodyModel[120] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 237

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-11F, 5.5F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(9F, 5.5F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1F); // Box 116
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

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[15].setRotationPoint(-11F, 4F, -8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[16].setRotationPoint(-11F, 4.5F, -8.75F);

		bodyModel[17].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 333
		bodyModel[17].setRotationPoint(-7F, 7.5F, 7.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 59
		bodyModel[18].setRotationPoint(-13F, 5F, -7.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[19].setRotationPoint(11F, 5F, -7.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[20].setRotationPoint(7F, 3.5F, -7.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F); // Box 91
		bodyModel[21].setRotationPoint(3F, 3.5F, -7.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[22].setRotationPoint(-14F, 3.5F, -7.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F); // Box 93
		bodyModel[23].setRotationPoint(-7F, 3.5F, -7.75F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[24].setRotationPoint(-3F, 3.5F, -8.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 346
		bodyModel[25].setRotationPoint(7F, 3.5F, 6.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[26].setRotationPoint(11F, 5F, 6.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 350
		bodyModel[27].setRotationPoint(-13F, 5F, 6.75F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 351
		bodyModel[28].setRotationPoint(-14F, 3.5F, 6.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // Box 352
		bodyModel[29].setRotationPoint(-7F, 3.5F, 6.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 353
		bodyModel[30].setRotationPoint(-3F, 3.5F, 7.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F); // Box 354
		bodyModel[31].setRotationPoint(3F, 3.5F, 6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-2F, 5F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 38
		bodyModel[33].setRotationPoint(-2F, 6.5F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[34].setRotationPoint(-2F, 6.1F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-2F, 5.4F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[36].setRotationPoint(-2F, 5.75F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
		bodyModel[37].setRotationPoint(-2F, 5F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[38].setRotationPoint(-2F, 6.5F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[39].setRotationPoint(-2F, 6.1F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[40].setRotationPoint(-2F, 5.4F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[41].setRotationPoint(-2F, 5.75F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[42].setRotationPoint(-7F, 4.5F, -8.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 155
		bodyModel[43].setRotationPoint(4F, 4.5F, -8.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[44].setRotationPoint(-7F, 4.5F, 7.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 158
		bodyModel[45].setRotationPoint(4F, 4.5F, 7.25F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F); // Box 159
		bodyModel[46].setRotationPoint(-8.5F, 8.5F, 7.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 160
		bodyModel[47].setRotationPoint(-8.5F, 5.5F, 7.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[48].setRotationPoint(-11F, 4.5F, 7.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[49].setRotationPoint(-11F, 4F, 7.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[50].setRotationPoint(7F, 4.5F, -8.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[51].setRotationPoint(7F, 4F, -8.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F); // Box 167
		bodyModel[52].setRotationPoint(7.5F, 8.5F, 7.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 168
		bodyModel[53].setRotationPoint(7.5F, 5.5F, 7.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[54].setRotationPoint(7F, 4.5F, 7.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[55].setRotationPoint(7F, 4F, 7.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[56].setRotationPoint(-15F, 3.5F, -8F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 172
		bodyModel[57].setRotationPoint(-15F, 4.5F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[58].setRotationPoint(-15F, 3.5F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[59].setRotationPoint(-15F, 3.5F, 4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[60].setRotationPoint(-15F, 4.5F, -5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 176
		bodyModel[61].setRotationPoint(-15F, 4.5F, 4F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 177
		bodyModel[62].setRotationPoint(14F, 4.5F, -4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[63].setRotationPoint(14F, 4.5F, -5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[64].setRotationPoint(14F, 3.5F, -5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 180
		bodyModel[65].setRotationPoint(14F, 3.5F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
		bodyModel[66].setRotationPoint(14F, 4.5F, 4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[67].setRotationPoint(14F, 3.5F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.25F); // Box 183
		bodyModel[68].setRotationPoint(14F, 3.5F, 5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 51
		bodyModel[69].setRotationPoint(-13F, 2.5F, -8.5F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 52
		bodyModel[70].setRotationPoint(-11F, 3.4F, -8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 53
		bodyModel[71].setRotationPoint(-7F, 3.4F, -8.5F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 219
		bodyModel[72].setRotationPoint(7F, 3.4F, -8.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F); // Box 220
		bodyModel[73].setRotationPoint(4F, 3.4F, -8.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 221
		bodyModel[74].setRotationPoint(11F, 2.5F, -8.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 338
		bodyModel[75].setRotationPoint(11F, 2.5F, 7.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 341
		bodyModel[76].setRotationPoint(-13F, 2.5F, 7.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 342
		bodyModel[77].setRotationPoint(-11F, 3.4F, 7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 343
		bodyModel[78].setRotationPoint(-7F, 3.4F, 7.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 344
		bodyModel[79].setRotationPoint(7F, 3.4F, 7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 345
		bodyModel[80].setRotationPoint(4F, 3.4F, 7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 196
		bodyModel[81].setRotationPoint(7F, 5F, 6.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[82].setRotationPoint(-9F, 5F, 6.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 198
		bodyModel[83].setRotationPoint(7F, 5F, -7.75F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[84].setRotationPoint(-9F, 5F, -7.75F);

		bodyModel[85].addBox(0F, 0F, 0F, 14, 2, 1, 0F); // Box 200
		bodyModel[85].setRotationPoint(-7F, 7.5F, -8.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F); // Box 201
		bodyModel[86].setRotationPoint(-8.5F, 8.5F, -8.75F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 202
		bodyModel[87].setRotationPoint(-8.5F, 5.5F, -8.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F); // Box 203
		bodyModel[88].setRotationPoint(7.5F, 8.5F, -8.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 204
		bodyModel[89].setRotationPoint(7.5F, 5.5F, -8.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F); // Box 104
		bodyModel[90].setRotationPoint(-5F, 4.25F, 7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F); // Box 207
		bodyModel[91].setRotationPoint(-6.5F, 4.25F, 7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F); // Box 208
		bodyModel[92].setRotationPoint(4F, 4.25F, 7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F); // Box 209
		bodyModel[93].setRotationPoint(5.5F, 4.25F, 7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[94].setRotationPoint(4F, 6.5F, 7.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[95].setRotationPoint(5.5F, 6.5F, 7.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[96].setRotationPoint(-5F, 6.5F, 7.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[97].setRotationPoint(-6.5F, 6.5F, 7.25F);

		bodyModel[98].addBox(0F, 0F, 0F, 5, 2, 14, 0F); // Box 95
		bodyModel[98].setRotationPoint(-2.5F, 4.5F, -7F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 1, 15, 0F); // Box 96
		bodyModel[99].setRotationPoint(-2F, 3.75F, -7.5F);

		bodyModel[100].addBox(0F, 0F, 0F, 8, 5, 11, 0F); // Box 346
		bodyModel[100].setRotationPoint(-12.5F, 3F, -5.5F);

		bodyModel[101].addBox(0F, 0F, 0F, 8, 5, 11, 0F); // Box 369
		bodyModel[101].setRotationPoint(4.5F, 3F, -5.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 370
		bodyModel[102].setRotationPoint(-4.5F, 4F, -6.5F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 371
		bodyModel[103].setRotationPoint(1.5F, 4F, -6.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 220
		bodyModel[104].setRotationPoint(-16F, 7.5F, -7F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 221
		bodyModel[105].setRotationPoint(7F, 7.5F, -7F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 222
		bodyModel[106].setRotationPoint(14.5F, 4.5F, 6.25F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 223
		bodyModel[107].setRotationPoint(-15.5F, 4.5F, 6.25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 224
		bodyModel[108].setRotationPoint(-15.5F, 4.5F, -6.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 225
		bodyModel[109].setRotationPoint(-15.5F, 6.5F, 6.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 226
		bodyModel[110].setRotationPoint(-15.5F, 6.5F, -6.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 228
		bodyModel[111].setRotationPoint(14.5F, 6.5F, -6.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 229
		bodyModel[112].setRotationPoint(14.5F, 6.5F, 6.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F); // Box 230
		bodyModel[113].setRotationPoint(-5F, 4.25F, -8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F); // Box 231
		bodyModel[114].setRotationPoint(-6.5F, 4.25F, -8F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[115].setRotationPoint(-6.5F, 6.5F, -8.25F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[116].setRotationPoint(-5F, 6.5F, -8.25F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[117].setRotationPoint(4F, 6.5F, -8.25F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F); // Box 235
		bodyModel[118].setRotationPoint(4F, 4.25F, -8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[119].setRotationPoint(5.5F, 6.5F, -8.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F); // Box 237
		bodyModel[120].setRotationPoint(5.5F, 4.25F, -8F);
	}
}