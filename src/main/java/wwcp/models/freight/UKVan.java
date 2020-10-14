//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.12.2018 - 18:56:14
// Last changed on: 16.12.2018 - 18:56:14

package wwcp.models.freight; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class UKVan extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public UKVan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[94];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 16
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 21
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 385
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 386
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 388
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 391
		bodyModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 393
		bodyModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 394
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 395
		bodyModel[11] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 396
		bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 397
		bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 398
		bodyModel[14] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 9
		bodyModel[29] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 45
		bodyModel[32] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 52
		bodyModel[37] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 31
		bodyModel[38] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 32
		bodyModel[39] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 33
		bodyModel[40] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 34
		bodyModel[41] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 35
		bodyModel[42] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 36
		bodyModel[43] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 37
		bodyModel[44] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 38
		bodyModel[45] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 39
		bodyModel[46] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 40
		bodyModel[47] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 45
		bodyModel[48] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 65
		bodyModel[49] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 66
		bodyModel[50] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 67
		bodyModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 68
		bodyModel[52] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 69
		bodyModel[53] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 70
		bodyModel[54] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 71
		bodyModel[55] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 72
		bodyModel[56] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 73
		bodyModel[57] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 74
		bodyModel[58] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 75
		bodyModel[59] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 76
		bodyModel[60] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 77
		bodyModel[61] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 78
		bodyModel[62] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 81
		bodyModel[65] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 82
		bodyModel[66] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 83
		bodyModel[67] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 84
		bodyModel[68] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 85
		bodyModel[69] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 86
		bodyModel[70] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 87
		bodyModel[71] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 88
		bodyModel[72] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 89
		bodyModel[73] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 90
		bodyModel[74] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 91
		bodyModel[75] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 92
		bodyModel[76] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 93
		bodyModel[77] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 94
		bodyModel[78] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 95
		bodyModel[79] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 96
		bodyModel[80] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 97
		bodyModel[81] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 98
		bodyModel[82] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 10
		bodyModel[83] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 118
		bodyModel[84] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 119
		bodyModel[85] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 120
		bodyModel[86] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 121
		bodyModel[87] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 122
		bodyModel[88] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 96
		bodyModel[89] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 97
		bodyModel[90] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 98
		bodyModel[91] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 99
		bodyModel[92] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 100
		bodyModel[93] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 101

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[0].setRotationPoint(-34F, 0F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[1].setRotationPoint(-34F, 0F, 5F);

		bodyModel[2].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[2].setRotationPoint(-33F, 1.5F, 6.5F);
		bodyModel[2].rotateAngleX = 0.78539816F;

		bodyModel[3].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[3].setRotationPoint(-33F, 1.5F, -8.5F);
		bodyModel[3].rotateAngleX = 0.78539816F;

		bodyModel[4].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385
		bodyModel[4].setRotationPoint(10F, 1.5F, 6.5F);
		bodyModel[4].rotateAngleX = 0.78539816F;

		bodyModel[5].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386
		bodyModel[5].setRotationPoint(10F, 1.5F, -8.5F);
		bodyModel[5].rotateAngleX = 0.78539816F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		bodyModel[6].setRotationPoint(12.5F, 0F, 5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391
		bodyModel[7].setRotationPoint(12.5F, 0F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[8].setRotationPoint(-32F, 2F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[9].setRotationPoint(-33F, 1F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[10].setRotationPoint(-30F, 1F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[11].setRotationPoint(10F, 1F, -1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[12].setRotationPoint(11F, 2F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[13].setRotationPoint(12.25F, 1F, -1.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 14
		bodyModel[14].setRotationPoint(-30F, 1F, -12F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 15
		bodyModel[15].setRotationPoint(9F, 1F, -12F);

		bodyModel[16].addBox(0F, 0F, 0F, 38, 2, 20, 0F); // Box 16
		bodyModel[16].setRotationPoint(-29F, 1F, -11F);

		bodyModel[17].addBox(0F, 0F, 0F, 14, 18, 22, 0F); // Box 17
		bodyModel[17].setRotationPoint(-30F, -17F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(4F, 3F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 32
		bodyModel[19].setRotationPoint(-3F, 3F, 7F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 33
		bodyModel[20].setRotationPoint(-1F, 3F, 7F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		bodyModel[21].setRotationPoint(2F, 3F, 7F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 35
		bodyModel[22].setRotationPoint(0F, 5F, 7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 36
		bodyModel[23].setRotationPoint(0.5F, 3F, 8F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
		bodyModel[24].setRotationPoint(4.5F, 3F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 38
		bodyModel[25].setRotationPoint(-3.5F, 3F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[26].setRotationPoint(-2.5F, 3F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[27].setRotationPoint(1.5F, 3F, 8F);

		bodyModel[28].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[28].setRotationPoint(1F, 6.5F, 5F);

		bodyModel[29].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[29].setRotationPoint(1F, 6.5F, -7F);

		bodyModel[30].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 42
		bodyModel[30].setRotationPoint(1F, 6.5F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 45
		bodyModel[31].setRotationPoint(0F, 4F, 7F);

		bodyModel[32].addBox(-6.5F, 0F, 0F, 6, 1, 1, 0F); // Box 46
		bodyModel[32].setRotationPoint(-3F, 6F, 6.99F);
		bodyModel[32].rotateAngleZ = 0.05235988F;

		bodyModel[33].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 47
		bodyModel[33].setRotationPoint(-3.5F, 5F, 7F);

		bodyModel[34].addBox(-0.5F, 0F, 0F, 6, 1, 1, 0F); // Box 48
		bodyModel[34].setRotationPoint(-16F, 6F, 6.99F);
		bodyModel[34].rotateAngleZ = 0.05235988F;

		bodyModel[35].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 49
		bodyModel[35].setRotationPoint(-17.5F, 5F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F); // Box 52
		bodyModel[36].setRotationPoint(-12F, 3F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 31
		bodyModel[37].setRotationPoint(-18F, 3F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 32
		bodyModel[38].setRotationPoint(-25F, 3F, 7F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 33
		bodyModel[39].setRotationPoint(-23F, 3F, 7F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		bodyModel[40].setRotationPoint(-20F, 3F, 7F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 35
		bodyModel[41].setRotationPoint(-22F, 5F, 7F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 36
		bodyModel[42].setRotationPoint(-21.5F, 3F, 8F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
		bodyModel[43].setRotationPoint(-17.5F, 3F, 8F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 38
		bodyModel[44].setRotationPoint(-25.5F, 3F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[45].setRotationPoint(-24.5F, 3F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[46].setRotationPoint(-20.5F, 3F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 45
		bodyModel[47].setRotationPoint(-22F, 4F, 7F);

		bodyModel[48].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 65
		bodyModel[48].setRotationPoint(-21F, 6.5F, 5F);

		bodyModel[49].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 66
		bodyModel[49].setRotationPoint(-21F, 6.5F, -9F);

		bodyModel[50].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 67
		bodyModel[50].setRotationPoint(-21F, 6.5F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F); // Box 68
		bodyModel[51].setRotationPoint(-9F, 3F, 7F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 69
		bodyModel[52].setRotationPoint(-10.5F, 5.75F, 7F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 70
		bodyModel[53].setRotationPoint(-3.5F, 5F, -10F);

		bodyModel[54].addBox(-6.5F, 0F, 0F, 6, 1, 1, 0F); // Box 71
		bodyModel[54].setRotationPoint(-3F, 6F, -10.01F);
		bodyModel[54].rotateAngleZ = -0.05235988F;

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 72
		bodyModel[55].setRotationPoint(-10.5F, 5.75F, -10F);

		bodyModel[56].addBox(-0.5F, 0F, 0F, 6, 1, 1, 0F); // Box 73
		bodyModel[56].setRotationPoint(-16F, 6F, -10.01F);
		bodyModel[56].rotateAngleZ = -0.05235988F;

		bodyModel[57].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 74
		bodyModel[57].setRotationPoint(-17.5F, 5F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F); // Box 75
		bodyModel[58].setRotationPoint(-12F, 3F, -10F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F); // Box 76
		bodyModel[59].setRotationPoint(-9F, 3F, -10F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 77
		bodyModel[60].setRotationPoint(-3.5F, 3F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[61].setRotationPoint(-2.5F, 3F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 79
		bodyModel[62].setRotationPoint(0.5F, 3F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 80
		bodyModel[63].setRotationPoint(1.5F, 3F, -11F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 81
		bodyModel[64].setRotationPoint(4.5F, 3F, -11F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 82
		bodyModel[65].setRotationPoint(-17.5F, 3F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 83
		bodyModel[66].setRotationPoint(-20.5F, 3F, -11F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 84
		bodyModel[67].setRotationPoint(-21.5F, 3F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[68].setRotationPoint(-24.5F, 3F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 86
		bodyModel[69].setRotationPoint(-25.5F, 3F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 87
		bodyModel[70].setRotationPoint(4F, 3F, -10F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 88
		bodyModel[71].setRotationPoint(2F, 3F, -10F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 89
		bodyModel[72].setRotationPoint(-1F, 3F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 90
		bodyModel[73].setRotationPoint(-3F, 3F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 91
		bodyModel[74].setRotationPoint(-18F, 3F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 92
		bodyModel[75].setRotationPoint(-20F, 3F, -10F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 93
		bodyModel[76].setRotationPoint(-23F, 3F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 94
		bodyModel[77].setRotationPoint(-25F, 3F, -10F);

		bodyModel[78].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 95
		bodyModel[78].setRotationPoint(0F, 5F, -12F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[79].setRotationPoint(0F, 4F, -11F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 97
		bodyModel[80].setRotationPoint(-22F, 5F, -12F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[81].setRotationPoint(-22F, 4F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 40, 3, 6, 0F); // Box 10
		bodyModel[82].setRotationPoint(-30F, -20F, -4F);

		bodyModel[83].addBox(0F, 0F, 0F, 6, 18, 1, 0F); // Box 118
		bodyModel[83].setRotationPoint(-16F, -17F, -12F);

		bodyModel[84].addBox(-6F, 0F, 0F, 6, 18, 1, 0F); // Box 119
		bodyModel[84].setRotationPoint(-4F, -17F, -12F);

		bodyModel[85].addBox(0F, 0F, 0F, 14, 18, 22, 0F); // Box 120
		bodyModel[85].setRotationPoint(-4F, -17F, -12F);

		bodyModel[86].addBox(-6F, 0F, -1F, 6, 18, 1, 0F); // Box 121
		bodyModel[86].setRotationPoint(-4F, -17F, 10F);

		bodyModel[87].addBox(0F, 0F, -1F, 6, 18, 1, 0F); // Box 122
		bodyModel[87].setRotationPoint(-16F, -17F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 40, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[88].setRotationPoint(-30F, -20F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 40, 2, 4, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[89].setRotationPoint(-30F, -19F, -12F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 40, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[90].setRotationPoint(-30F, -19F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 40, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[91].setRotationPoint(-30F, -20F, 2F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[92].setRotationPoint(-31F, -19F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[93].setRotationPoint(10F, -19F, -4F);
	}
}