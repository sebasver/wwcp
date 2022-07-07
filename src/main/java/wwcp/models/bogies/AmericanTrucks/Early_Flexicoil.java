package wwcp.models.bogies.AmericanTrucks;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Early_Flexicoil extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Early_Flexicoil() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[160];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Wheel
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Wheel
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Wheel
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Wheel
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Wheel
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Wheel
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 17
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 173
		bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 173
		bodyModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 173
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 17
		bodyModel[11] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 8
		bodyModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 8
		bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 8
		bodyModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 8
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 39
		bodyModel[21] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 17
		bodyModel[22] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 17
		bodyModel[23] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 17
		bodyModel[24] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 17
		bodyModel[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 17
		bodyModel[26] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 17
		bodyModel[27] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 8
		bodyModel[30] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 8
		bodyModel[31] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 8
		bodyModel[32] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		bodyModel[34] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 17
		bodyModel[35] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 17
		bodyModel[36] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 17
		bodyModel[37] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 17
		bodyModel[38] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 17
		bodyModel[39] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 17
		bodyModel[40] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 17
		bodyModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 17
		bodyModel[42] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 79
		bodyModel[43] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 17
		bodyModel[44] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 17
		bodyModel[45] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 17
		bodyModel[46] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 17
		bodyModel[47] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 17
		bodyModel[48] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 17
		bodyModel[49] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 17
		bodyModel[50] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 17
		bodyModel[51] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 17
		bodyModel[52] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 17
		bodyModel[53] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 186
		bodyModel[54] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 186
		bodyModel[55] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 17
		bodyModel[56] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 17
		bodyModel[57] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 17
		bodyModel[58] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 17
		bodyModel[59] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 342
		bodyModel[60] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 343
		bodyModel[61] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 341
		bodyModel[62] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 31
		bodyModel[63] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 31
		bodyModel[64] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 8
		bodyModel[65] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 8
		bodyModel[66] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 8
		bodyModel[67] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 39
		bodyModel[68] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 17
		bodyModel[69] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 17
		bodyModel[70] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 17
		bodyModel[71] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 17
		bodyModel[72] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 17
		bodyModel[73] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 17
		bodyModel[74] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 17
		bodyModel[75] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 17
		bodyModel[76] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 17
		bodyModel[77] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 17
		bodyModel[78] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 17
		bodyModel[79] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 17
		bodyModel[80] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 17
		bodyModel[81] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 342
		bodyModel[82] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 343
		bodyModel[83] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 341
		bodyModel[84] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 17
		bodyModel[85] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 17
		bodyModel[86] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 17
		bodyModel[87] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 17
		bodyModel[88] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 17
		bodyModel[89] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 173
		bodyModel[90] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 31
		bodyModel[91] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 31
		bodyModel[92] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 8
		bodyModel[93] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 8
		bodyModel[94] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 8
		bodyModel[95] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 8
		bodyModel[96] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 39
		bodyModel[97] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 17
		bodyModel[98] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 17
		bodyModel[99] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 17
		bodyModel[100] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 17
		bodyModel[101] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 17
		bodyModel[102] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 17
		bodyModel[103] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 173
		bodyModel[104] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 31
		bodyModel[105] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 31
		bodyModel[106] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 8
		bodyModel[107] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 8
		bodyModel[108] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 8
		bodyModel[109] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 39
		bodyModel[110] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		bodyModel[111] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 17
		bodyModel[112] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 17
		bodyModel[113] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 17
		bodyModel[114] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 17
		bodyModel[115] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 17
		bodyModel[116] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 17
		bodyModel[117] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 17
		bodyModel[118] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 17
		bodyModel[119] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 79
		bodyModel[120] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 173
		bodyModel[121] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 31
		bodyModel[122] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 31
		bodyModel[123] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 8
		bodyModel[124] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 8
		bodyModel[125] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 8
		bodyModel[126] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 39
		bodyModel[127] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 17
		bodyModel[128] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 17
		bodyModel[129] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 17
		bodyModel[130] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 17
		bodyModel[131] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 17
		bodyModel[132] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 17
		bodyModel[133] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 17
		bodyModel[134] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 17
		bodyModel[135] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 17
		bodyModel[136] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 17
		bodyModel[137] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 17
		bodyModel[138] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 17
		bodyModel[139] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 17
		bodyModel[140] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 17
		bodyModel[141] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 17
		bodyModel[142] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 17
		bodyModel[143] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 17
		bodyModel[144] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 17
		bodyModel[145] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 17
		bodyModel[146] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 17
		bodyModel[147] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 17
		bodyModel[148] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 17
		bodyModel[149] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 17
		bodyModel[150] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 17
		bodyModel[151] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 17
		bodyModel[152] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 17
		bodyModel[153] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 17
		bodyModel[154] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 342
		bodyModel[155] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 343
		bodyModel[156] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 341
		bodyModel[157] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 342
		bodyModel[158] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 343
		bodyModel[159] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 341

		bodyModel[0].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Wheel
		bodyModel[0].setRotationPoint(0F, 6.5F, 5.75F);

		bodyModel[1].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Wheel
		bodyModel[1].setRotationPoint(0F, 6.5F, -5.95F);

		bodyModel[2].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Wheel
		bodyModel[2].setRotationPoint(14F, 6.5F, 5.95F);

		bodyModel[3].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Wheel
		bodyModel[3].setRotationPoint(14F, 6.5F, -5.95F);

		bodyModel[4].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Wheel
		bodyModel[4].setRotationPoint(-14F, 6.5F, 5.95F);

		bodyModel[5].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Wheel
		bodyModel[5].setRotationPoint(-14F, 6.5F, -5.95F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 17
		bodyModel[6].setRotationPoint(-10.5F, 4F, 6.8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F); // Box 173
		bodyModel[7].setRotationPoint(-1F, 5.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F); // Box 173
		bodyModel[8].setRotationPoint(13F, 5.5F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,-0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F, -0.15F, -0.15F, 0.1F); // Box 173
		bodyModel[9].setRotationPoint(-15F, 5.5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 1.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.5F, 1.15F, 0F); // Box 17
		bodyModel[10].setRotationPoint(-4F, 3F, 6.8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[11].setRotationPoint(-1F, 3F, 6.8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 17
		bodyModel[12].setRotationPoint(3.5F, 4F, 6.8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, -0.5F, 1.15F, 0F, -0.5F, 1.15F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[13].setRotationPoint(1F, 3F, 6.8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[14].setRotationPoint(0.100000000000001F, 4.4F, 7.6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[15].setRotationPoint(-1.1F, 4.4F, 7.6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.25F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[16].setRotationPoint(1.5F, 4.25F, 6.7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 8
		bodyModel[17].setRotationPoint(1.5F, 6.25F, 6.7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 8
		bodyModel[18].setRotationPoint(-4.5F, 4.25F, 6.7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 8
		bodyModel[19].setRotationPoint(-2.5F, 6.25F, 6.7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F); // Box 39
		bodyModel[20].setRotationPoint(-1F, 8.35F, 6.85F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F); // Box 17
		bodyModel[21].setRotationPoint(-2.1F, 5.5F, 6.85F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 17
		bodyModel[22].setRotationPoint(-1.35F, 5.5F, 6.85F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F); // Box 17
		bodyModel[23].setRotationPoint(1.1F, 5.5F, 6.85F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 17
		bodyModel[24].setRotationPoint(-1.35F, 7.8F, 6.85F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F); // Box 17
		bodyModel[25].setRotationPoint(0.350000000000001F, 5.5F, 6.85F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F); // Box 17
		bodyModel[26].setRotationPoint(0.350000000000001F, 7.8F, 6.85F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[27].setRotationPoint(14.1F, 4.4F, 7.6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[28].setRotationPoint(12.9F, 4.4F, 7.6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, -0.25F, -1.5F, 0.25F, -0.25F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 8
		bodyModel[29].setRotationPoint(15.5F, 4.25F, 6.7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 8
		bodyModel[30].setRotationPoint(9.5F, 4.25F, 6.7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 8
		bodyModel[31].setRotationPoint(11.5F, 6.25F, 6.7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F); // Box 39
		bodyModel[32].setRotationPoint(13F, 8.35F, 6.85F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F); // Box 17
		bodyModel[33].setRotationPoint(11.9F, 5.5F, 6.85F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 17
		bodyModel[34].setRotationPoint(12.65F, 5.5F, 6.85F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F); // Box 17
		bodyModel[35].setRotationPoint(15.1F, 5.5F, 6.85F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 17
		bodyModel[36].setRotationPoint(12.65F, 7.8F, 6.85F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F); // Box 17
		bodyModel[37].setRotationPoint(14.35F, 5.5F, 6.85F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F); // Box 17
		bodyModel[38].setRotationPoint(14.35F, 7.8F, 6.85F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 1.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.5F, 1.15F, 0F); // Box 17
		bodyModel[39].setRotationPoint(10F, 3F, 6.8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[40].setRotationPoint(13F, 3F, 6.8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[41].setRotationPoint(15F, 3F, 6.8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[42].setRotationPoint(-14F, 6.45F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[43].setRotationPoint(3.5F, 5.75F, 6.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[44].setRotationPoint(3.5F, 6.75F, 7.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[45].setRotationPoint(9.5F, 5.75F, 6.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[46].setRotationPoint(9.5F, 6.75F, 7.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[47].setRotationPoint(-10.5F, 5.75F, 6.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[48].setRotationPoint(-4.5F, 5.75F, 6.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[49].setRotationPoint(4.5F, 7.75F, 7.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[50].setRotationPoint(-10.5F, 6.75F, 6.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[51].setRotationPoint(-4.5F, 6.75F, 6.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[52].setRotationPoint(-9.5F, 7.75F, 6.75F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 186
		bodyModel[53].setRotationPoint(-1F, 3F, -1F);

		bodyModel[54].addBox(0F, 0F, 0F, 30, 1, 6, 0F); // Box 186
		bodyModel[54].setRotationPoint(-15F, 4F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[55].setRotationPoint(-10.5F, 7.75F, 6.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[56].setRotationPoint(4.5F, 1.75F, 7.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[57].setRotationPoint(8.5F, 1.75F, 7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[58].setRotationPoint(5.5F, 2.25F, -8.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 342
		bodyModel[59].setRotationPoint(11F, 3.4F, 9.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 343
		bodyModel[60].setRotationPoint(9F, 3.4F, 9.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[61].setRotationPoint(12.5F, 2F, 10F);
		bodyModel[61].rotateAngleX = -0.78539816F;

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[62].setRotationPoint(-13.9F, 4.4F, 7.6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[63].setRotationPoint(-15.1F, 4.4F, 7.6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F); // Box 8
		bodyModel[64].setRotationPoint(-17.5F, 4.25F, 6.7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[65].setRotationPoint(-12.5F, 4.25F, 6.7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 8
		bodyModel[66].setRotationPoint(-12.5F, 6.25F, 6.7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F); // Box 39
		bodyModel[67].setRotationPoint(-15F, 8.35F, 6.85F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F); // Box 17
		bodyModel[68].setRotationPoint(-16.1F, 5.5F, 6.85F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 17
		bodyModel[69].setRotationPoint(-15.35F, 5.5F, 6.85F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F); // Box 17
		bodyModel[70].setRotationPoint(-12.9F, 5.5F, 6.85F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 17
		bodyModel[71].setRotationPoint(-15.35F, 7.8F, 6.85F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F); // Box 17
		bodyModel[72].setRotationPoint(-13.65F, 5.5F, 6.85F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F); // Box 17
		bodyModel[73].setRotationPoint(-13.65F, 7.8F, 6.85F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, -0.5F, 1.15F, 0F, -0.5F, 1.15F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[74].setRotationPoint(-13F, 3F, 6.8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[75].setRotationPoint(-15F, 3F, 6.8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[76].setRotationPoint(-18F, 3F, 6.8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[77].setRotationPoint(-9.5F, 1.75F, 7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[78].setRotationPoint(-5.5F, 1.75F, 7.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[79].setRotationPoint(-8.5F, 2.25F, -8.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[80].setRotationPoint(-11.4F, 2.75F, 7.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 342
		bodyModel[81].setRotationPoint(-14F, 3.4F, 9.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Box 343
		bodyModel[82].setRotationPoint(-12F, 3.4F, 9.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[83].setRotationPoint(-15.5F, 2F, 10F);
		bodyModel[83].rotateAngleX = -0.78539816F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 17
		bodyModel[84].setRotationPoint(3.5F, 4F, -8.8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, -0.5F, 1.15F, 0F, -0.5F, 1.15F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[85].setRotationPoint(1F, 3F, -8.8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[86].setRotationPoint(-1F, 3F, -8.8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F); // Box 17
		bodyModel[87].setRotationPoint(-10.5F, 4F, -8.8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 1.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.5F, 1.15F, 0F); // Box 17
		bodyModel[88].setRotationPoint(-4F, 3F, -8.8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F); // Box 173
		bodyModel[89].setRotationPoint(-1F, 5.5F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[90].setRotationPoint(-1.1F, 4.4F, -8.6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[91].setRotationPoint(0.100000000000001F, 4.4F, -8.6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -1F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 8
		bodyModel[92].setRotationPoint(-4.5F, 4.25F, -8.7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F); // Box 8
		bodyModel[93].setRotationPoint(-2.5F, 6.25F, -8.7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[94].setRotationPoint(1.5F, 4.25F, -8.7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 8
		bodyModel[95].setRotationPoint(1.5F, 6.25F, -8.7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F); // Box 39
		bodyModel[96].setRotationPoint(-1F, 8.35F, -8.85F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F); // Box 17
		bodyModel[97].setRotationPoint(1.1F, 5.5F, -8.85F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F); // Box 17
		bodyModel[98].setRotationPoint(0.350000000000001F, 5.5F, -8.85F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F); // Box 17
		bodyModel[99].setRotationPoint(-2.1F, 5.5F, -8.85F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F); // Box 17
		bodyModel[100].setRotationPoint(0.350000000000001F, 7.8F, -8.85F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 17
		bodyModel[101].setRotationPoint(-1.35F, 5.5F, -8.85F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 17
		bodyModel[102].setRotationPoint(-1.35F, 7.8F, -8.85F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F); // Box 173
		bodyModel[103].setRotationPoint(-15F, 5.5F, -9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[104].setRotationPoint(-15.1F, 4.4F, -8.6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[105].setRotationPoint(-13.9F, 4.4F, -8.6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -1.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, -1.5F, 0.25F, -0.25F); // Box 8
		bodyModel[106].setRotationPoint(-17.5F, 4.25F, -8.7F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.25F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[107].setRotationPoint(-12.5F, 4.25F, -8.7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 8
		bodyModel[108].setRotationPoint(-12.5F, 6.25F, -8.7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F); // Box 39
		bodyModel[109].setRotationPoint(-15F, 8.35F, -8.85F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F); // Box 17
		bodyModel[110].setRotationPoint(-12.9F, 5.5F, -8.85F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F); // Box 17
		bodyModel[111].setRotationPoint(-13.65F, 5.5F, -8.85F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F); // Box 17
		bodyModel[112].setRotationPoint(-16.1F, 5.5F, -8.85F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F); // Box 17
		bodyModel[113].setRotationPoint(-13.65F, 7.8F, -8.85F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 17
		bodyModel[114].setRotationPoint(-15.35F, 5.5F, -8.85F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 17
		bodyModel[115].setRotationPoint(-15.35F, 7.8F, -8.85F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, -0.5F, 1.15F, 0F, -0.5F, 1.15F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[116].setRotationPoint(-13F, 3F, -8.8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[117].setRotationPoint(-15F, 3F, -8.8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, -0.2F, 0F); // Box 17
		bodyModel[118].setRotationPoint(-18F, 3F, -8.8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[119].setRotationPoint(-13F, 6.45F, -9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F); // Box 173
		bodyModel[120].setRotationPoint(13F, 5.5F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[121].setRotationPoint(12.9F, 4.4F, -8.6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[122].setRotationPoint(14.1F, 4.4F, -8.6F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 8
		bodyModel[123].setRotationPoint(15.5F, 4.25F, -8.7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 8
		bodyModel[124].setRotationPoint(9.5F, 4.25F, -8.7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 8
		bodyModel[125].setRotationPoint(11.5F, 6.25F, -8.7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F, 0.35F, -0.75F, 0F); // Box 39
		bodyModel[126].setRotationPoint(13F, 8.35F, -8.85F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F); // Box 17
		bodyModel[127].setRotationPoint(15.1F, 5.5F, -8.85F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F); // Box 17
		bodyModel[128].setRotationPoint(14.35F, 5.5F, -8.85F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, 0F, -1.1F, 0F); // Box 17
		bodyModel[129].setRotationPoint(11.9F, 5.5F, -8.85F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F); // Box 17
		bodyModel[130].setRotationPoint(14.35F, 7.8F, -8.85F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.75F, 0.3F, 0F, -0.75F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 17
		bodyModel[131].setRotationPoint(12.65F, 5.5F, -8.85F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, -0.9F, -0.45F, 0F, -0.9F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 17
		bodyModel[132].setRotationPoint(12.65F, 7.8F, -8.85F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 1.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.5F, 1.15F, 0F); // Box 17
		bodyModel[133].setRotationPoint(10F, 3F, -8.8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[134].setRotationPoint(13F, 3F, -8.8F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.05F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.05F, 0F); // Box 17
		bodyModel[135].setRotationPoint(15F, 3F, -8.8F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[136].setRotationPoint(4.5F, 1.75F, -8.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[137].setRotationPoint(8.5F, 1.75F, -8.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[138].setRotationPoint(-9.5F, 1.75F, -8.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[139].setRotationPoint(-5.5F, 1.75F, -8.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[140].setRotationPoint(-8.5F, 3.25F, -3.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[141].setRotationPoint(5.5F, 3.25F, -3.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
		bodyModel[142].setRotationPoint(3.5F, 5.75F, -7.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[143].setRotationPoint(3.5F, 6.75F, -8.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
		bodyModel[144].setRotationPoint(9.5F, 5.75F, -7.75F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[145].setRotationPoint(9.5F, 6.75F, -8.75F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
		bodyModel[146].setRotationPoint(-10.5F, 5.75F, -7.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
		bodyModel[147].setRotationPoint(-4.5F, 5.75F, -7.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[148].setRotationPoint(4.5F, 7.75F, -8.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[149].setRotationPoint(-10.5F, 6.75F, -8.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[150].setRotationPoint(-4.5F, 6.75F, -7.75F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[151].setRotationPoint(-9.5F, 7.75F, -7.75F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[152].setRotationPoint(-10.5F, 7.75F, -7.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[153].setRotationPoint(-11.4F, 2.75F, -8.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 342
		bodyModel[154].setRotationPoint(-14F, 3.4F, -10.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 0, 1, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, 0F, 0F, 0F); // Box 343
		bodyModel[155].setRotationPoint(-12F, 3.4F, -10.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[156].setRotationPoint(-15.5F, 2F, -10F);
		bodyModel[156].rotateAngleX = -0.78539816F;

		bodyModel[157].addBox(0F, 0F, 0F, 2, 0, 1, 0F); // Box 342
		bodyModel[157].setRotationPoint(11F, 3.4F, -10.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 343
		bodyModel[158].setRotationPoint(9F, 3.4F, -10.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[159].setRotationPoint(12.5F, 2F, -10F);
		bodyModel[159].rotateAngleX = -0.78539816F;
	}
}