package wwcp.models.bogies.AmericanTrucks;


import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BuddBilevelTruck extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public BuddBilevelTruck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[70];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 124
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 9
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 39
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 104
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 110
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 172
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 173
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 347
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 70
		bodyModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 79
		bodyModel[23] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 346
		bodyModel[26] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 369
		bodyModel[27] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 370
		bodyModel[28] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 371
		bodyModel[29] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 64
		bodyModel[63] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 65
		bodyModel[64] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 66
		bodyModel[65] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 67
		bodyModel[66] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 68
		bodyModel[67] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 69
		bodyModel[68] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 71

		bodyModel[0].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 124
		bodyModel[0].setRotationPoint(-2F, 2.75F, -2F);

		bodyModel[1].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 9
		bodyModel[1].setRotationPoint(-9F, 6.75F, 5.95F);

		bodyModel[2].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 39
		bodyModel[2].setRotationPoint(-9F, 6.75F, -5.95F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 6
		bodyModel[3].setRotationPoint(9F, 6.75F, 5.95F);

		bodyModel[4].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 8
		bodyModel[4].setRotationPoint(9F, 6.75F, -5.95F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[5].setRotationPoint(-10F, 5.75F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[6].setRotationPoint(8F, 5.75F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[7].setRotationPoint(-10F, 5.75F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 110
		bodyModel[8].setRotationPoint(8F, 5.75F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 172
		bodyModel[9].setRotationPoint(8F, 5.75F, 8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[10].setRotationPoint(-10F, 5.75F, 8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[11].setRotationPoint(10F, 4.25F, 6.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[12].setRotationPoint(8F, 7.25F, 6.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[13].setRotationPoint(6F, 5.25F, 6.75F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(-10F, 4.25F, 6.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-12.5F, 3.25F, 6.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 18
		bodyModel[16].setRotationPoint(-5.5F, 7.5F, 6.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(-8F, 5.25F, 6.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-10F, 7.25F, 6.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-12F, 4.25F, 6.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, 1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F); // Box 23
		bodyModel[20].setRotationPoint(5F, 7F, 6.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0F, 0F, -0.1F); // Box 24
		bodyModel[21].setRotationPoint(-7F, 7F, 6.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F); // Box 79
		bodyModel[22].setRotationPoint(4.25F, 5.75F, 7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-5.25F, 5.75F, 7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 28
		bodyModel[24].setRotationPoint(-5F, 5.25F, 7F);

		bodyModel[25].addBox(0F, 0F, 0F, 4, 4, 11, 0F); // Box 346
		bodyModel[25].setRotationPoint(-8.5F, 4.25F, -5.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 4, 4, 11, 0F); // Box 369
		bodyModel[26].setRotationPoint(4.5F, 4.25F, -5.5F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 370
		bodyModel[27].setRotationPoint(-4.5F, 4.25F, -6.5F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 4, 13, 0F); // Box 371
		bodyModel[28].setRotationPoint(1.5F, 4.25F, -6.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 3, 13, 0F); // Box 33
		bodyModel[29].setRotationPoint(-1.5F, 4.25F, -6.5F);

		bodyModel[30].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 34
		bodyModel[30].setRotationPoint(-1F, 6.5F, 8.75F);
		bodyModel[30].rotateAngleX = -0.78539816F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 35
		bodyModel[31].setRotationPoint(-0.5F, 4F, 8.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 36
		bodyModel[32].setRotationPoint(2F, 6.25F, 8.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 37
		bodyModel[33].setRotationPoint(1F, 6F, 8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 38
		bodyModel[34].setRotationPoint(7.01F, 5.5F, 8.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[35].setRotationPoint(-5.5F, 3.25F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.18F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.18F, -0.5F, 0F); // Box 40
		bodyModel[36].setRotationPoint(-6F, 5.25F, 6.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[37].setRotationPoint(5.5F, 3.25F, 6.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 42
		bodyModel[38].setRotationPoint(5F, 4.25F, 6.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[39].setRotationPoint(-12F, 2.75F, 6.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 42
		bodyModel[40].setRotationPoint(3F, 5.25F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.18F, -0.5F, 0F, 0.18F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 43
		bodyModel[41].setRotationPoint(5F, 5.25F, 6.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 44
		bodyModel[42].setRotationPoint(6F, 2.75F, 6.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 45
		bodyModel[43].setRotationPoint(-5.5F, 7.5F, -8.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F, -0.5F, 1F, -0.1F, 0F, 0F, -0.1F); // Box 46
		bodyModel[44].setRotationPoint(-7F, 7F, -8.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F); // Box 47
		bodyModel[45].setRotationPoint(-5.25F, 5.75F, -8.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, -0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.5F, -0.5F, -0.1F, -0.5F, 1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 1F, -0.1F); // Box 48
		bodyModel[46].setRotationPoint(5F, 7F, -8.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F, 0.2F, -3.25F, 0F); // Box 49
		bodyModel[47].setRotationPoint(4.25F, 5.75F, -8.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 50
		bodyModel[48].setRotationPoint(3F, 5.25F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.18F, -0.5F, 0F, 0.18F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 51
		bodyModel[49].setRotationPoint(5F, 5.25F, -8.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1.5F, -0.5F, 0F); // Box 52
		bodyModel[50].setRotationPoint(-5F, 5.25F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.18F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.18F, -0.5F, 0F); // Box 53
		bodyModel[51].setRotationPoint(-6F, 5.25F, -8.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 54
		bodyModel[52].setRotationPoint(-5.5F, 3.25F, -9F);

		bodyModel[53].addShapeBox(0F, -1F, -1F, 2, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 55
		bodyModel[53].setRotationPoint(-1F, 6.5F, -8.75F);
		bodyModel[53].rotateAngleX = -0.78539816F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[54].setRotationPoint(-0.5F, 4F, -9.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 57
		bodyModel[55].setRotationPoint(-2F, 6F, -9.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[56].setRotationPoint(-7F, 6.25F, -9.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 59
		bodyModel[57].setRotationPoint(-7.01F, 5.5F, -9.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[58].setRotationPoint(-8F, 5.25F, -8.75F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 61
		bodyModel[59].setRotationPoint(-12F, 4.25F, -8.75F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[60].setRotationPoint(-10F, 7.25F, -8.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[61].setRotationPoint(-10F, 4.25F, -8.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[62].setRotationPoint(-12.5F, 3.25F, -8.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[63].setRotationPoint(-12F, 2.75F, -8.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 66
		bodyModel[64].setRotationPoint(6F, 5.25F, -8.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[65].setRotationPoint(10F, 4.25F, -8.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[66].setRotationPoint(8F, 7.25F, -8.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 69
		bodyModel[67].setRotationPoint(5F, 4.25F, -8.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[68].setRotationPoint(5.5F, 3.25F, -8.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 71
		bodyModel[69].setRotationPoint(6F, 2.75F, -8.75F);
	}
}