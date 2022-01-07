//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 04.09.2021 - 13:52:08
// Last changed on: 04.09.2021 - 13:52:08

package wwcp.models.bogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Class87Bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Class87Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[86];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 29
		bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 34
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 37
		bodyModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 38
		bodyModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 39
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 40
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 41
		bodyModel[14] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 35
		bodyModel[15] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 36
		bodyModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 37
		bodyModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 38
		bodyModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 39
		bodyModel[19] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 40
		bodyModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 42
		bodyModel[21] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 44
		bodyModel[22] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 45
		bodyModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 46
		bodyModel[24] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 48
		bodyModel[25] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 49
		bodyModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 50
		bodyModel[27] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 51
		bodyModel[28] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 52
		bodyModel[29] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 53
		bodyModel[30] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 54
		bodyModel[31] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 55
		bodyModel[32] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 59
		bodyModel[39] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 60
		bodyModel[40] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 61
		bodyModel[41] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 62
		bodyModel[42] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 67
		bodyModel[44] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 68
		bodyModel[45] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 69
		bodyModel[46] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 70
		bodyModel[47] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 71
		bodyModel[48] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 72
		bodyModel[49] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 73
		bodyModel[50] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 74
		bodyModel[51] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 75
		bodyModel[52] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 76
		bodyModel[53] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 71
		bodyModel[54] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 72
		bodyModel[55] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 73
		bodyModel[56] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 74
		bodyModel[57] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 75
		bodyModel[58] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 76
		bodyModel[59] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 77
		bodyModel[60] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 78
		bodyModel[61] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 79
		bodyModel[62] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 80
		bodyModel[63] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 81
		bodyModel[64] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 74
		bodyModel[65] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 75
		bodyModel[66] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 76
		bodyModel[67] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 78
		bodyModel[68] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 80
		bodyModel[69] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 78
		bodyModel[70] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 79
		bodyModel[71] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 80
		bodyModel[72] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 81
		bodyModel[73] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 82
		bodyModel[74] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 83
		bodyModel[75] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 84
		bodyModel[76] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 85
		bodyModel[77] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 86
		bodyModel[78] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 87
		bodyModel[79] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 88
		bodyModel[80] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 89
		bodyModel[81] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		bodyModel[82] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 86
		bodyModel[83] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 88
		bodyModel[85] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 380

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0.25F); // Box 3
		bodyModel[0].setRotationPoint(1.75F, 1F, 9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 4
		bodyModel[1].setRotationPoint(-5.5F, 6F, 9F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 5
		bodyModel[2].setRotationPoint(-18F, 4F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(-18F, 4F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 7
		bodyModel[4].setRotationPoint(-18F, 4F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 1F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F); // Box 15
		bodyModel[5].setRotationPoint(-17.5F, 5F, 8F);

		bodyModel[6].addBox(0F, 0F, 0F, 29, 3, 1, 0F); // Box 16
		bodyModel[6].setRotationPoint(-14.5F, 2F, 8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 29
		bodyModel[7].setRotationPoint(-14F, 6F, 6F);

		bodyModel[8].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 34
		bodyModel[8].setRotationPoint(-13.5F, 6.5F, -6F);

		bodyModel[9].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 37
		bodyModel[9].setRotationPoint(-13.5F, 6.5F, 6F);

		bodyModel[10].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 38
		bodyModel[10].setRotationPoint(13.5F, 6.5F, 6F);
		bodyModel[10].rotateAngleY = -0.01745329F;

		bodyModel[11].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[11].setRotationPoint(13.5F, 6.5F, -6F);
		bodyModel[11].rotateAngleY = -0.01745329F;

		bodyModel[12].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 40
		bodyModel[12].setRotationPoint(13.5F, 6.5F, -6F);
		bodyModel[12].rotateAngleY = -0.01745329F;

		bodyModel[13].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 41
		bodyModel[13].setRotationPoint(-13.5F, 6.5F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[14].setRotationPoint(-16.5F, 3F, 8F);

		bodyModel[15].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 36
		bodyModel[15].setRotationPoint(-8.5F, 5F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 37
		bodyModel[16].setRotationPoint(-14F, 6F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 38
		bodyModel[17].setRotationPoint(13F, 6F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 39
		bodyModel[18].setRotationPoint(13F, 6F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 40
		bodyModel[19].setRotationPoint(-15F, 6F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 42
		bodyModel[20].setRotationPoint(-15F, 5F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 44
		bodyModel[21].setRotationPoint(-12F, 6.5F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 45
		bodyModel[22].setRotationPoint(-12F, 5F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[23].setRotationPoint(14.5F, 3F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 48
		bodyModel[24].setRotationPoint(17F, 4F, 8F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 49
		bodyModel[25].setRotationPoint(17F, 4F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[26].setRotationPoint(17F, 4F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 51
		bodyModel[27].setRotationPoint(10F, 3.5F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[28].setRotationPoint(11F, 5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 53
		bodyModel[29].setRotationPoint(12F, 6F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 54
		bodyModel[30].setRotationPoint(14F, 5F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[31].setRotationPoint(14F, 6F, 8F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 46
		bodyModel[32].setRotationPoint(-12.5F, 2F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		bodyModel[33].setRotationPoint(-12.5F, 2.01F, 9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[34].setRotationPoint(-12.5F, 2.01F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 49
		bodyModel[35].setRotationPoint(-12.5F, 2F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 56
		bodyModel[36].setRotationPoint(-15F, 5F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 57
		bodyModel[37].setRotationPoint(-15F, 6F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 59
		bodyModel[38].setRotationPoint(-12F, 6.5F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 60
		bodyModel[39].setRotationPoint(-12F, 5F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 61
		bodyModel[40].setRotationPoint(10F, 3.5F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[41].setRotationPoint(11F, 5F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[42].setRotationPoint(-5.5F, 6F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		bodyModel[43].setRotationPoint(4.5F, 6F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[44].setRotationPoint(2.5F, 7F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 69
		bodyModel[45].setRotationPoint(-5.5F, 7F, 8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[46].setRotationPoint(-2.5F, 7F, 8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[47].setRotationPoint(-5.5F, 6F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 72
		bodyModel[48].setRotationPoint(-5.5F, 7F, -9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[49].setRotationPoint(-2.5F, 7F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[50].setRotationPoint(2.5F, 7F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bodyModel[51].setRotationPoint(4.5F, 6F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 9, 3, 16, 0F); // Box 76
		bodyModel[52].setRotationPoint(-4.5F, 2F, -8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0.25F); // Box 71
		bodyModel[53].setRotationPoint(-0.5F, 1F, 9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0.25F); // Box 72
		bodyModel[54].setRotationPoint(-2.75F, 1F, 9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0F, 0.25F, -4F, 0F); // Box 73
		bodyModel[55].setRotationPoint(-2.75F, 1F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0F, 0.25F, -4F, 0F); // Box 74
		bodyModel[56].setRotationPoint(-0.5F, 1F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0.25F, 0.25F, -4F, 0F, 0.25F, -4F, 0F); // Box 75
		bodyModel[57].setRotationPoint(1.75F, 1F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 76
		bodyModel[58].setRotationPoint(-6.5F, 6F, -10F);

		bodyModel[59].addBox(0F, 0F, 0F, 17, 1, 1, 0F); // Box 77
		bodyModel[59].setRotationPoint(-8.5F, 5F, -9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 78
		bodyModel[60].setRotationPoint(-9.5F, 5F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[61].setRotationPoint(8.5F, 5F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[62].setRotationPoint(8.5F, 5F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 81
		bodyModel[63].setRotationPoint(-9.5F, 5F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[64].setRotationPoint(-17F, 5F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 75
		bodyModel[65].setRotationPoint(16F, 5F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 2F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box 76
		bodyModel[66].setRotationPoint(16.5F, 5F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 78
		bodyModel[67].setRotationPoint(16F, 5F, -9F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[68].setRotationPoint(-17F, 5F, -9F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 78
		bodyModel[69].setRotationPoint(-4.75F, 1F, 9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 79
		bodyModel[70].setRotationPoint(-4.75F, 4F, 9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 80
		bodyModel[71].setRotationPoint(3.75F, 4F, 9F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 81
		bodyModel[72].setRotationPoint(3.75F, 1F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 82
		bodyModel[73].setRotationPoint(3.75F, 4F, -10F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 83
		bodyModel[74].setRotationPoint(3.75F, 1F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 84
		bodyModel[75].setRotationPoint(-4.75F, 1F, -10F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 85
		bodyModel[76].setRotationPoint(-4.75F, 4F, -10F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[77].setRotationPoint(14.5F, 3F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 2F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box 87
		bodyModel[78].setRotationPoint(16.5F, 5F, -9F);

		bodyModel[79].addBox(0F, 0F, 0F, 29, 3, 1, 0F); // Box 88
		bodyModel[79].setRotationPoint(-14.5F, 2F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[80].setRotationPoint(-16.5F, 3F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 1F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -2F, 0F); // Box 90
		bodyModel[81].setRotationPoint(-17.5F, 5F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 86
		bodyModel[82].setRotationPoint(12F, 6F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F); // Box 87
		bodyModel[83].setRotationPoint(-13F, 6F, -9F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F); // Box 88
		bodyModel[84].setRotationPoint(-13F, 6F, 8F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 380
		bodyModel[85].setRotationPoint(-2F, 1F, -2F);
	}
}