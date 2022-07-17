package wwcp.models.bogies.AmericanTrucks;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class FB2Truck extends ModelBase //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public FB2Truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[83];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 39
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 129
		bodyModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 129
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 129
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 129
		bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 129
		bodyModel[13] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 129
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 31
		bodyModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 31
		bodyModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 129
		bodyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 129
		bodyModel[20] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 129
		bodyModel[21] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 129
		bodyModel[22] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 129
		bodyModel[23] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 129
		bodyModel[24] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 129
		bodyModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 129
		bodyModel[26] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 129
		bodyModel[27] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 129
		bodyModel[30] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 342
		bodyModel[31] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 343
		bodyModel[32] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 341
		bodyModel[33] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 186
		bodyModel[34] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 186
		bodyModel[35] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 17
		bodyModel[36] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 129
		bodyModel[37] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 31
		bodyModel[38] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 31
		bodyModel[39] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 129
		bodyModel[40] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 129
		bodyModel[41] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 129
		bodyModel[42] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 129
		bodyModel[43] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 129
		bodyModel[44] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 129
		bodyModel[45] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 129
		bodyModel[46] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 129
		bodyModel[47] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 129
		bodyModel[48] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 129
		bodyModel[49] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 129
		bodyModel[50] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 129
		bodyModel[51] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 129
		bodyModel[52] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 129
		bodyModel[53] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 129
		bodyModel[54] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 129
		bodyModel[55] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 129
		bodyModel[56] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 31
		bodyModel[57] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 31
		bodyModel[58] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 129
		bodyModel[59] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 129
		bodyModel[60] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 129
		bodyModel[61] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 129
		bodyModel[62] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 129
		bodyModel[63] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 31
		bodyModel[64] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 31
		bodyModel[65] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 129
		bodyModel[66] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 342
		bodyModel[67] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 343
		bodyModel[68] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 341
		bodyModel[69] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 186
		bodyModel[70] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 186
		bodyModel[71] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 17
		bodyModel[72] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 129
		bodyModel[73] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 129
		bodyModel[74] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 129
		bodyModel[75] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 129
		bodyModel[76] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 129
		bodyModel[77] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 129
		bodyModel[78] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 129
		bodyModel[79] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 129
		bodyModel[80] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 129
		bodyModel[81] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 129
		bodyModel[82] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 129

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[0].setRotationPoint(-10.5F, 5.5F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[1].setRotationPoint(8.5F, 5.5F, -9F);

		bodyModel[2].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[2].setRotationPoint(-9.5F, 6.5F, 5.95F);

		bodyModel[3].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[3].setRotationPoint(-9.5F, 6.5F, -5.95F);

		bodyModel[4].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 6
		bodyModel[4].setRotationPoint(9.5F, 6.5F, 5.95F);

		bodyModel[5].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 8
		bodyModel[5].setRotationPoint(9.5F, 6.5F, -5.95F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 5
		bodyModel[6].setRotationPoint(8.5F, 5.5F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 5
		bodyModel[7].setRotationPoint(-10.5F, 5.5F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[8].setRotationPoint(-3F, 5F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 129
		bodyModel[9].setRotationPoint(-13F, 3F, 6.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 129
		bodyModel[10].setRotationPoint(-13F, 4.5F, 6.7F);

		bodyModel[11].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 129
		bodyModel[11].setRotationPoint(-11.5F, 8.5F, 6.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[12].setRotationPoint(-8F, 6.5F, 6.7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[13].setRotationPoint(-13F, 4.5F, 7.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[14].setRotationPoint(-9.4F, 4.5F, 7.6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[15].setRotationPoint(-10.6F, 4.5F, 7.6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F); // Box 31
		bodyModel[16].setRotationPoint(0.2F, 3.9F, 7.6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F); // Box 31
		bodyModel[17].setRotationPoint(-1.2F, 3.9F, 7.6F);

		bodyModel[18].addBox(0F, 0F, 0F, 10, 5, 12, 0F); // Box 129
		bodyModel[18].setRotationPoint(-5F, 3F, -6F);

		bodyModel[19].addBox(0F, 0F, 0F, 6, 5, 11, 0F); // Box 129
		bodyModel[19].setRotationPoint(5F, 3F, -5.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 5, 11, 0F); // Box 129
		bodyModel[20].setRotationPoint(-11F, 3F, -5.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[21].setRotationPoint(-8F, 4.5F, 6.7F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 129
		bodyModel[22].setRotationPoint(-13F, 8.5F, 7.75F);

		bodyModel[23].addBox(0F, 0F, 0F, 3, 1, 18, 0F); // Box 129
		bodyModel[23].setRotationPoint(-1.5F, 2.5F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 129
		bodyModel[24].setRotationPoint(12F, 3F, 6.75F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 129
		bodyModel[25].setRotationPoint(7.5F, 8.5F, 6.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 129
		bodyModel[26].setRotationPoint(6F, 6.5F, 6.7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[27].setRotationPoint(8.4F, 4.5F, 7.4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[28].setRotationPoint(9.6F, 4.5F, 7.4F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 129
		bodyModel[29].setRotationPoint(12F, 8.5F, 7.75F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 342
		bodyModel[30].setRotationPoint(6F, 3.4F, 9.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 343
		bodyModel[31].setRotationPoint(4F, 3.4F, 9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[32].setRotationPoint(8.5F, 2F, 10F);
		bodyModel[32].rotateAngleX = -0.78539816F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 186
		bodyModel[33].setRotationPoint(-10F, 4F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[34].setRotationPoint(-10F, 3F, 8.6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[35].setRotationPoint(3.9F, 2.75F, 7.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 129
		bodyModel[36].setRotationPoint(-1F, 1.5F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F); // Box 31
		bodyModel[37].setRotationPoint(-1.2F, 3.9F, -8.6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F, 0.1F, -4F, 0.1F); // Box 31
		bodyModel[38].setRotationPoint(0.2F, 3.9F, -8.6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[39].setRotationPoint(8F, 5.5F, 6.7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 129
		bodyModel[40].setRotationPoint(10F, 5.5F, 6.7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[41].setRotationPoint(-11F, 5.5F, 6.7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 129
		bodyModel[42].setRotationPoint(-9F, 5.5F, 6.7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 129
		bodyModel[43].setRotationPoint(7F, 2F, 6.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0.5F, 0.75F, 0F, -1F, 3.25F, 0.25F, -1F, 3.25F, -0.25F, 0.5F, 0.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, -3.75F, 0.25F, 0.5F, -3.75F, -0.25F, 0.5F, -0.5F, 0F); // Box 129
		bodyModel[44].setRotationPoint(3.5F, 5.5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.25F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 129
		bodyModel[45].setRotationPoint(-12F, 2F, 6.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-1F, 3.25F, 0.25F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, -1F, 3.25F, -0.25F, 0.5F, -3.75F, 0.25F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -3.75F, -0.25F); // Box 129
		bodyModel[46].setRotationPoint(-6.5F, 5.5F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[47].setRotationPoint(11F, 4.5F, 6.7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[48].setRotationPoint(13F, 4.5F, 7.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 129
		bodyModel[49].setRotationPoint(5F, 4.5F, 6.7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[50].setRotationPoint(-3F, 5F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 129
		bodyModel[51].setRotationPoint(12F, 3F, -8.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[52].setRotationPoint(11F, 4.5F, -8.7F);

		bodyModel[53].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 129
		bodyModel[53].setRotationPoint(7.5F, 8.5F, -8.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 129
		bodyModel[54].setRotationPoint(6F, 6.5F, -8.7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[55].setRotationPoint(13F, 4.5F, -8.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[56].setRotationPoint(8.4F, 4.5F, -8.6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[57].setRotationPoint(9.6F, 4.5F, -8.6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 129
		bodyModel[58].setRotationPoint(5F, 4.5F, -8.7F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 129
		bodyModel[59].setRotationPoint(12F, 8.5F, -8.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Box 129
		bodyModel[60].setRotationPoint(-13F, 3F, -8.75F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 129
		bodyModel[61].setRotationPoint(-11.5F, 8.5F, -8.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[62].setRotationPoint(-8F, 6.5F, -8.7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[63].setRotationPoint(-9.4F, 4.5F, -8.4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 31
		bodyModel[64].setRotationPoint(-10.6F, 4.5F, -8.4F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 0, 1, 0F); // Box 129
		bodyModel[65].setRotationPoint(-13F, 8.5F, -8.75F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 342
		bodyModel[66].setRotationPoint(6F, 3.4F, -10.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 343
		bodyModel[67].setRotationPoint(4F, 3.4F, -8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 341
		bodyModel[68].setRotationPoint(8.5F, 2F, -10F);
		bodyModel[68].rotateAngleX = -0.78539816F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 186
		bodyModel[69].setRotationPoint(-10F, 4F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[70].setRotationPoint(-10F, 3F, -9.6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[71].setRotationPoint(3.9F, 2.75F, -8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 129
		bodyModel[72].setRotationPoint(-9F, 5.5F, -8.7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[73].setRotationPoint(-11F, 5.5F, -8.7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 129
		bodyModel[74].setRotationPoint(10F, 5.5F, -8.7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[75].setRotationPoint(8F, 5.5F, -8.7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.25F, 0F, 1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 129
		bodyModel[76].setRotationPoint(-12F, 2F, -8.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-1F, 3.25F, -0.25F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, -1F, 3.25F, 0.25F, 0.5F, -3.75F, -0.25F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -3.75F, 0.25F); // Box 129
		bodyModel[77].setRotationPoint(-6.5F, 5.5F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 129
		bodyModel[78].setRotationPoint(7F, 2F, -8.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0.5F, 0.75F, 0F, -1F, 3.25F, -0.25F, -1F, 3.25F, 0.25F, 0.5F, 0.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, -3.75F, -0.25F, 0.5F, -3.75F, 0.25F, 0.5F, -0.5F, 0F); // Box 129
		bodyModel[79].setRotationPoint(3.5F, 5.5F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 129
		bodyModel[80].setRotationPoint(-13F, 4.5F, -8.7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[81].setRotationPoint(-13F, 4.5F, -8.75F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[82].setRotationPoint(-8F, 4.5F, -8.7F);
	}
}