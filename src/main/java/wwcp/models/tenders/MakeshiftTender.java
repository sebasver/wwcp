//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.12.2018 - 18:56:14
// Last changed on: 16.12.2018 - 18:56:14

package wwcp.models.tenders; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class MakeshiftTender extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public MakeshiftTender() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[85];

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
		bodyModel[18] = new ModelRendererTurbo(this, 132, 43, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 214, 43, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 33
		bodyModel[24] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 34
		bodyModel[25] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 35
		bodyModel[26] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 36
		bodyModel[27] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 37
		bodyModel[28] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 38
		bodyModel[29] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 39
		bodyModel[30] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 9
		bodyModel[32] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 42
		bodyModel[34] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 47
		bodyModel[37] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 31
		bodyModel[41] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 32
		bodyModel[42] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 33
		bodyModel[43] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 34
		bodyModel[44] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 35
		bodyModel[45] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 36
		bodyModel[46] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 37
		bodyModel[47] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 38
		bodyModel[48] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 39
		bodyModel[49] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 40
		bodyModel[50] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 45
		bodyModel[51] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 65
		bodyModel[52] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 66
		bodyModel[53] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 67
		bodyModel[54] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 68
		bodyModel[55] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 69
		bodyModel[56] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 70
		bodyModel[57] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 71
		bodyModel[58] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 72
		bodyModel[59] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 73
		bodyModel[60] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 74
		bodyModel[61] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 75
		bodyModel[62] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 76
		bodyModel[63] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 77
		bodyModel[64] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 78
		bodyModel[65] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 79
		bodyModel[66] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 80
		bodyModel[67] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 81
		bodyModel[68] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 82
		bodyModel[69] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 83
		bodyModel[70] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 84
		bodyModel[71] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 85
		bodyModel[72] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 86
		bodyModel[73] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 87
		bodyModel[74] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 88
		bodyModel[75] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 89
		bodyModel[76] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 90
		bodyModel[77] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 91
		bodyModel[78] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 92
		bodyModel[79] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 93
		bodyModel[80] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 94
		bodyModel[81] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 95
		bodyModel[82] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 96
		bodyModel[83] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 97
		bodyModel[84] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 98

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[0].setRotationPoint(-24F, 0F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[1].setRotationPoint(-24F, 0F, 6F);

		bodyModel[2].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[2].setRotationPoint(-23F, 1.5F, 7.5F);
		bodyModel[2].rotateAngleX = 0.78539816F;

		bodyModel[3].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[3].setRotationPoint(-23F, 1.5F, -7.5F);
		bodyModel[3].rotateAngleX = 0.78539816F;

		bodyModel[4].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385
		bodyModel[4].setRotationPoint(20F, 1.5F, 7.5F);
		bodyModel[4].rotateAngleX = 0.78539816F;

		bodyModel[5].addShapeBox(0F, -1F, -1F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386
		bodyModel[5].setRotationPoint(20F, 1.5F, -7.5F);
		bodyModel[5].rotateAngleX = 0.78539816F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		bodyModel[6].setRotationPoint(22.5F, 0F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391
		bodyModel[7].setRotationPoint(22.5F, 0F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[8].setRotationPoint(-22F, 2F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[9].setRotationPoint(-23F, 1F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[10].setRotationPoint(-20F, 1F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[11].setRotationPoint(20F, 1F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[12].setRotationPoint(21F, 2F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[13].setRotationPoint(22.25F, 1F, -0.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 8, 22, 0F); // Box 14
		bodyModel[14].setRotationPoint(-20F, -5F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 3, 22, 0F); // Box 15
		bodyModel[15].setRotationPoint(19F, 0F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 38, 2, 20, 0F); // Box 16
		bodyModel[16].setRotationPoint(-19F, 1F, -10F);

		bodyModel[17].addBox(0F, 0F, 0F, 38, 1, 22, 0F); // Box 17
		bodyModel[17].setRotationPoint(-19F, 0F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 39, 5, 1, 0F); // Box 18
		bodyModel[18].setRotationPoint(-19F, -5F, -11F);

		bodyModel[19].addBox(0F, 0F, 0F, 39, 5, 1, 0F); // Box 19
		bodyModel[19].setRotationPoint(-19F, -5F, 10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 38, 1, 20, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-19F, -5F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 31
		bodyModel[21].setRotationPoint(14F, 3F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 32
		bodyModel[22].setRotationPoint(7F, 3F, 8F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 33
		bodyModel[23].setRotationPoint(9F, 3F, 8F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		bodyModel[24].setRotationPoint(12F, 3F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 35
		bodyModel[25].setRotationPoint(10F, 5F, 8F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 36
		bodyModel[26].setRotationPoint(10.5F, 3F, 9F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
		bodyModel[27].setRotationPoint(14.5F, 3F, 9F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 38
		bodyModel[28].setRotationPoint(6.5F, 3F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[29].setRotationPoint(7.5F, 3F, 9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[30].setRotationPoint(11.5F, 3F, 9F);

		bodyModel[31].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[31].setRotationPoint(11F, 6.5F, 6F);

		bodyModel[32].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[32].setRotationPoint(11F, 6.5F, -6F);

		bodyModel[33].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 42
		bodyModel[33].setRotationPoint(11F, 6.5F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 45
		bodyModel[34].setRotationPoint(10F, 4F, 8F);

		bodyModel[35].addBox(-6.5F, 0F, 0F, 6, 1, 1, 0F); // Box 46
		bodyModel[35].setRotationPoint(7F, 6F, 7.99F);
		bodyModel[35].rotateAngleZ = 0.05235988F;

		bodyModel[36].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 47
		bodyModel[36].setRotationPoint(6.5F, 5F, 8F);

		bodyModel[37].addBox(-0.5F, 0F, 0F, 6, 1, 1, 0F); // Box 48
		bodyModel[37].setRotationPoint(-6F, 6F, 7.99F);
		bodyModel[37].rotateAngleZ = 0.05235988F;

		bodyModel[38].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 49
		bodyModel[38].setRotationPoint(-7.5F, 5F, 8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F); // Box 52
		bodyModel[39].setRotationPoint(-2F, 3F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 31
		bodyModel[40].setRotationPoint(-8F, 3F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 32
		bodyModel[41].setRotationPoint(-15F, 3F, 8F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 33
		bodyModel[42].setRotationPoint(-13F, 3F, 8F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 34
		bodyModel[43].setRotationPoint(-10F, 3F, 8F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 35
		bodyModel[44].setRotationPoint(-12F, 5F, 8F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 36
		bodyModel[45].setRotationPoint(-11.5F, 3F, 9F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 37
		bodyModel[46].setRotationPoint(-7.5F, 3F, 9F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 38
		bodyModel[47].setRotationPoint(-15.5F, 3F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[48].setRotationPoint(-14.5F, 3F, 9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 40
		bodyModel[49].setRotationPoint(-10.5F, 3F, 9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 45
		bodyModel[50].setRotationPoint(-12F, 4F, 8F);

		bodyModel[51].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 65
		bodyModel[51].setRotationPoint(-11F, 6.5F, 6F);

		bodyModel[52].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 66
		bodyModel[52].setRotationPoint(-11F, 6.5F, -8F);

		bodyModel[53].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 67
		bodyModel[53].setRotationPoint(-11F, 6.5F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F); // Box 68
		bodyModel[54].setRotationPoint(1F, 3F, 8F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 69
		bodyModel[55].setRotationPoint(-0.5F, 5.75F, 8F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 70
		bodyModel[56].setRotationPoint(6.5F, 5F, -9F);

		bodyModel[57].addBox(-6.5F, 0F, 0F, 6, 1, 1, 0F); // Box 71
		bodyModel[57].setRotationPoint(7F, 6F, -9.01F);
		bodyModel[57].rotateAngleZ = -0.05235988F;

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 72
		bodyModel[58].setRotationPoint(-0.5F, 5.75F, -9F);

		bodyModel[59].addBox(-0.5F, 0F, 0F, 6, 1, 1, 0F); // Box 73
		bodyModel[59].setRotationPoint(-6F, 6F, -9.01F);
		bodyModel[59].rotateAngleZ = -0.05235988F;

		bodyModel[60].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 74
		bodyModel[60].setRotationPoint(-7.5F, 5F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F); // Box 75
		bodyModel[61].setRotationPoint(-2F, 3F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.75F, 0F, -1.5F, 0.75F, 0F, -1.5F, 0.75F, 0F, 1F, 0.75F, 0F); // Box 76
		bodyModel[62].setRotationPoint(1F, 3F, -9F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 77
		bodyModel[63].setRotationPoint(6.5F, 3F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[64].setRotationPoint(7.5F, 3F, -10F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 79
		bodyModel[65].setRotationPoint(10.5F, 3F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 80
		bodyModel[66].setRotationPoint(11.5F, 3F, -10F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 81
		bodyModel[67].setRotationPoint(14.5F, 3F, -10F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 82
		bodyModel[68].setRotationPoint(-7.5F, 3F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 83
		bodyModel[69].setRotationPoint(-10.5F, 3F, -10F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 84
		bodyModel[70].setRotationPoint(-11.5F, 3F, -10F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[71].setRotationPoint(-14.5F, 3F, -10F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 86
		bodyModel[72].setRotationPoint(-15.5F, 3F, -10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 87
		bodyModel[73].setRotationPoint(14F, 3F, -9F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 88
		bodyModel[74].setRotationPoint(12F, 3F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 89
		bodyModel[75].setRotationPoint(9F, 3F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 90
		bodyModel[76].setRotationPoint(7F, 3F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F); // Box 91
		bodyModel[77].setRotationPoint(-8F, 3F, -9F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 92
		bodyModel[78].setRotationPoint(-10F, 3F, -9F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 93
		bodyModel[79].setRotationPoint(-13F, 3F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 1.5F, 0F); // Box 94
		bodyModel[80].setRotationPoint(-15F, 3F, -9F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 95
		bodyModel[81].setRotationPoint(10F, 5F, -11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[82].setRotationPoint(10F, 4F, -10F);

		bodyModel[83].addBox(0F, 0F, 0F, 2, 3, 3, 0F); // Box 97
		bodyModel[83].setRotationPoint(-12F, 5F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[84].setRotationPoint(-12F, 4F, -10F);
	}
}