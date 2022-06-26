package wwcp.models.bogies.AmericanTrucks;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class FM_TypeB extends ModelBase //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public FM_TypeB() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[119];

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
		bodyModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 39
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 59
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 60
		bodyModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 92
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 37
		bodyModel[19] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 66
		bodyModel[21] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 67
		bodyModel[22] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 171
		bodyModel[26] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 172
		bodyModel[27] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 173
		bodyModel[28] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 174
		bodyModel[29] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 175
		bodyModel[30] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 176
		bodyModel[31] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 177
		bodyModel[32] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 178
		bodyModel[33] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 179
		bodyModel[34] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 180
		bodyModel[35] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 181
		bodyModel[36] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 182
		bodyModel[37] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 183
		bodyModel[38] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 53
		bodyModel[41] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 219
		bodyModel[42] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 220
		bodyModel[43] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 221
		bodyModel[44] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 198
		bodyModel[45] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 199
		bodyModel[46] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 200
		bodyModel[47] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 201
		bodyModel[48] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 202
		bodyModel[49] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 203
		bodyModel[50] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 204
		bodyModel[51] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 95
		bodyModel[52] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 96
		bodyModel[53] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 346
		bodyModel[54] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 369
		bodyModel[55] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 370
		bodyModel[56] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 371
		bodyModel[57] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 230
		bodyModel[58] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 231
		bodyModel[59] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 232
		bodyModel[60] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 233
		bodyModel[61] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 234
		bodyModel[62] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 235
		bodyModel[63] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 236
		bodyModel[64] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 237
		bodyModel[65] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 85
		bodyModel[66] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 200
		bodyModel[67] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 200
		bodyModel[68] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 200
		bodyModel[69] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 92
		bodyModel[70] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 92
		bodyModel[71] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 232
		bodyModel[72] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 233
		bodyModel[73] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 234
		bodyModel[74] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 236
		bodyModel[75] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 92
		bodyModel[76] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 92
		bodyModel[77] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 85
		bodyModel[78] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 92
		bodyModel[79] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 92
		bodyModel[80] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 59
		bodyModel[81] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 60
		bodyModel[82] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 92
		bodyModel[83] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 51
		bodyModel[84] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 52
		bodyModel[85] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 53
		bodyModel[86] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 219
		bodyModel[87] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 220
		bodyModel[88] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 221
		bodyModel[89] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 198
		bodyModel[90] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 199
		bodyModel[91] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 200
		bodyModel[92] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 201
		bodyModel[93] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 202
		bodyModel[94] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 203
		bodyModel[95] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 204
		bodyModel[96] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 230
		bodyModel[97] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 231
		bodyModel[98] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 232
		bodyModel[99] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 233
		bodyModel[100] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 234
		bodyModel[101] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 235
		bodyModel[102] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 236
		bodyModel[103] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 237
		bodyModel[104] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 85
		bodyModel[105] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 200
		bodyModel[106] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 200
		bodyModel[107] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 200
		bodyModel[108] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 92
		bodyModel[109] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 92
		bodyModel[110] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 232
		bodyModel[111] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 233
		bodyModel[112] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 234
		bodyModel[113] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 236
		bodyModel[114] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 92
		bodyModel[115] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 92
		bodyModel[116] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 85
		bodyModel[117] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 92
		bodyModel[118] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 92

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

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 59
		bodyModel[12].setRotationPoint(-13F, 5F, -8.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[13].setRotationPoint(11F, 5F, -8.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[14].setRotationPoint(-11F, 3.25F, -8.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 37
		bodyModel[15].setRotationPoint(-2F, 5F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 38
		bodyModel[16].setRotationPoint(-2F, 6.5F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[17].setRotationPoint(-2F, 6.1F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 37
		bodyModel[18].setRotationPoint(-2F, 5.4F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F); // Box 37
		bodyModel[19].setRotationPoint(-2F, 5.75F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 66
		bodyModel[20].setRotationPoint(-2F, 5F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[21].setRotationPoint(-2F, 6.5F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[22].setRotationPoint(-2F, 6.1F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[23].setRotationPoint(-2F, 5.4F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.23F, 0F, 0F, -0.23F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 37
		bodyModel[24].setRotationPoint(-2F, 5.75F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 171
		bodyModel[25].setRotationPoint(-15F, 3.5F, -9F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 172
		bodyModel[26].setRotationPoint(-15F, 4.5F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[27].setRotationPoint(-15F, 3.5F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[28].setRotationPoint(-15F, 3.5F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[29].setRotationPoint(-15F, 4.5F, -5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 176
		bodyModel[30].setRotationPoint(-15F, 4.5F, 4F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 8, 0F); // Box 177
		bodyModel[31].setRotationPoint(14F, 4.5F, -4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[32].setRotationPoint(14F, 4.5F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[33].setRotationPoint(14F, 3.5F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 180
		bodyModel[34].setRotationPoint(14F, 3.5F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
		bodyModel[35].setRotationPoint(14F, 4.5F, 4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[36].setRotationPoint(14F, 3.5F, 4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -0.25F); // Box 183
		bodyModel[37].setRotationPoint(14F, 3.5F, 5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 51
		bodyModel[38].setRotationPoint(-13F, 2.2F, -9.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 52
		bodyModel[39].setRotationPoint(-11F, 3.1F, -9.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Box 53
		bodyModel[40].setRotationPoint(-7F, 3.1F, -9.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 219
		bodyModel[41].setRotationPoint(7F, 3.1F, -9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 220
		bodyModel[42].setRotationPoint(4F, 3.1F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 221
		bodyModel[43].setRotationPoint(11F, 2.2F, -9.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 198
		bodyModel[44].setRotationPoint(7F, 5F, -8.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[45].setRotationPoint(-9F, 5F, -8.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[46].setRotationPoint(-7F, 7F, -8.65F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1.5F, 0F); // Box 201
		bodyModel[47].setRotationPoint(-8.5F, 8.25F, -8.65F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 202
		bodyModel[48].setRotationPoint(-8.5F, 5.25F, -8.65F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -0.25F, 0F); // Box 203
		bodyModel[49].setRotationPoint(7.5F, 8.25F, -8.65F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 204
		bodyModel[50].setRotationPoint(7.5F, 5.25F, -8.65F);

		bodyModel[51].addBox(0F, 0F, 0F, 5, 2, 14, 0F); // Box 95
		bodyModel[51].setRotationPoint(-2.5F, 4.5F, -7F);

		bodyModel[52].addBox(0F, 0F, 0F, 4, 1, 15, 0F); // Box 96
		bodyModel[52].setRotationPoint(-2F, 3.75F, -7.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 8, 5, 11, 0F); // Box 346
		bodyModel[53].setRotationPoint(-12.5F, 3F, -5.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 8, 5, 11, 0F); // Box 369
		bodyModel[54].setRotationPoint(4.5F, 3F, -5.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 370
		bodyModel[55].setRotationPoint(-4.5F, 4F, -6.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 371
		bodyModel[56].setRotationPoint(1.5F, 4F, -6.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F); // Box 230
		bodyModel[57].setRotationPoint(-5F, 3F, -8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F); // Box 231
		bodyModel[58].setRotationPoint(-6.5F, 3F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[59].setRotationPoint(-6.5F, 6.25F, -8.25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[60].setRotationPoint(-5F, 6.25F, -8.25F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[61].setRotationPoint(4F, 6.25F, -8.25F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F); // Box 235
		bodyModel[62].setRotationPoint(4F, 3F, -8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[63].setRotationPoint(5.5F, 6.25F, -8.25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F); // Box 237
		bodyModel[64].setRotationPoint(5.5F, 3F, -8F);

		bodyModel[65].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 85
		bodyModel[65].setRotationPoint(-11F, 8F, -8.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[66].setRotationPoint(-4F, 7.35F, -8.65F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F); // Box 200
		bodyModel[67].setRotationPoint(4F, 7F, -8.65F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F); // Box 200
		bodyModel[68].setRotationPoint(0F, 7.35F, -8.65F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[69].setRotationPoint(11F, 3.25F, -8.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[70].setRotationPoint(-14F, 3.25F, -8.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[71].setRotationPoint(-6.5F, 6.75F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[72].setRotationPoint(-5F, 6.75F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[73].setRotationPoint(4F, 6.75F, -8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[74].setRotationPoint(5.5F, 6.75F, -8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -1F, 0F); // Box 92
		bodyModel[75].setRotationPoint(-10F, 4.75F, -8.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[76].setRotationPoint(-11F, 4.75F, -8.75F);

		bodyModel[77].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 85
		bodyModel[77].setRotationPoint(9F, 8F, -8.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -1F, 0F); // Box 92
		bodyModel[78].setRotationPoint(10F, 4.75F, -8.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[79].setRotationPoint(9F, 4.75F, -8.75F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[80].setRotationPoint(11F, 5F, 7.75F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 60
		bodyModel[81].setRotationPoint(-13F, 5F, 7.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 22, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[82].setRotationPoint(-11F, 3.25F, 7.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 51
		bodyModel[83].setRotationPoint(11F, 2.2F, 8.5F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 52
		bodyModel[84].setRotationPoint(7F, 3.1F, 8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 53
		bodyModel[85].setRotationPoint(4F, 3.1F, 8.5F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Box 219
		bodyModel[86].setRotationPoint(-11F, 3.1F, 8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 220
		bodyModel[87].setRotationPoint(-7F, 3.1F, 8.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 221
		bodyModel[88].setRotationPoint(-13F, 2.2F, 8.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[89].setRotationPoint(-9F, 5F, 7.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 199
		bodyModel[90].setRotationPoint(7F, 5F, 7.75F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F); // Box 200
		bodyModel[91].setRotationPoint(4F, 7F, 7.65F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -0.25F, 0F); // Box 201
		bodyModel[92].setRotationPoint(7.5F, 8.25F, 7.65F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 202
		bodyModel[93].setRotationPoint(7.5F, 5.25F, 7.65F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, -1.5F, 0F); // Box 203
		bodyModel[94].setRotationPoint(-8.5F, 8.25F, 7.65F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 204
		bodyModel[95].setRotationPoint(-8.5F, 5.25F, 7.65F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F); // Box 230
		bodyModel[96].setRotationPoint(4F, 3F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F); // Box 231
		bodyModel[97].setRotationPoint(5.5F, 3F, 7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[98].setRotationPoint(5.5F, 6.25F, 7.25F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[99].setRotationPoint(4F, 6.25F, 7.25F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[100].setRotationPoint(-5F, 6.25F, 7.25F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F); // Box 235
		bodyModel[101].setRotationPoint(-5F, 3F, 7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[102].setRotationPoint(-6.5F, 6.25F, 7.25F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -3.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3.75F, 0F); // Box 237
		bodyModel[103].setRotationPoint(-6.5F, 3F, 7F);

		bodyModel[104].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 85
		bodyModel[104].setRotationPoint(9F, 8F, 7.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F); // Box 200
		bodyModel[105].setRotationPoint(0F, 7.35F, 7.65F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[106].setRotationPoint(-7F, 7F, 7.65F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[107].setRotationPoint(-4F, 7.35F, 7.65F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 92
		bodyModel[108].setRotationPoint(-14F, 3.25F, 7.75F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[109].setRotationPoint(11F, 3.25F, 7.75F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[110].setRotationPoint(5.5F, 6.75F, 7F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 233
		bodyModel[111].setRotationPoint(4F, 6.75F, 7F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[112].setRotationPoint(-5F, 6.75F, 7F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[113].setRotationPoint(-6.5F, 6.75F, 7F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[114].setRotationPoint(9F, 4.75F, 7.75F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -1F, 0F); // Box 92
		bodyModel[115].setRotationPoint(10F, 4.75F, 7.75F);

		bodyModel[116].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 85
		bodyModel[116].setRotationPoint(-11F, 8F, 7.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0F, -0.5F, 0F); // Box 92
		bodyModel[117].setRotationPoint(-11F, 4.75F, 7.75F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, -1F, 0F); // Box 92
		bodyModel[118].setRotationPoint(-10F, 4.75F, 7.75F);
	}
}