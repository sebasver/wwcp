//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.12.2020 - 18:23:09
// Last changed on: 17.12.2020 - 18:23:09

package wwcp.models.bogies.AmericanTrucks; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class SwingMotionBogie70Ton extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public SwingMotionBogie70Ton() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[109];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 90
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 92
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 28
		bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 25
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 10
		bodyModel[13] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 10
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 14
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 61
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 104
		bodyModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 63
		bodyModel[20] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 64
		bodyModel[21] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 65
		bodyModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 66
		bodyModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 67
		bodyModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 68
		bodyModel[25] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 69
		bodyModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 70
		bodyModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 73
		bodyModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 74
		bodyModel[29] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 75
		bodyModel[30] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 76
		bodyModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 77
		bodyModel[32] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 78
		bodyModel[33] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 79
		bodyModel[34] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 81
		bodyModel[35] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 82
		bodyModel[36] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 83
		bodyModel[37] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 84
		bodyModel[38] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 85
		bodyModel[39] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 86
		bodyModel[40] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 87
		bodyModel[41] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 88
		bodyModel[42] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 89
		bodyModel[43] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 91
		bodyModel[44] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 93
		bodyModel[45] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 94
		bodyModel[46] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 95
		bodyModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 96
		bodyModel[48] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 97
		bodyModel[49] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 98
		bodyModel[50] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 99
		bodyModel[51] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 100
		bodyModel[52] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 101
		bodyModel[53] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 102
		bodyModel[54] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 107
		bodyModel[55] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 108
		bodyModel[56] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 80
		bodyModel[57] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 80
		bodyModel[58] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 80
		bodyModel[59] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 80
		bodyModel[60] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 80
		bodyModel[61] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 80
		bodyModel[62] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 80
		bodyModel[63] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 584
		bodyModel[65] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 585
		bodyModel[66] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 586
		bodyModel[67] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 587
		bodyModel[68] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 588
		bodyModel[69] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 589
		bodyModel[70] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 590
		bodyModel[71] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 591
		bodyModel[72] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 80
		bodyModel[73] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 80
		bodyModel[74] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 80
		bodyModel[75] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 6
		bodyModel[77] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 66
		bodyModel[78] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 67
		bodyModel[79] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 37
		bodyModel[80] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 37
		bodyModel[81] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 37
		bodyModel[82] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 603
		bodyModel[83] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 604
		bodyModel[84] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 605
		bodyModel[85] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 606
		bodyModel[86] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 607
		bodyModel[87] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 608
		bodyModel[88] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 609
		bodyModel[89] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 610
		bodyModel[90] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 611
		bodyModel[91] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 612
		bodyModel[92] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 613
		bodyModel[93] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 614
		bodyModel[94] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 615
		bodyModel[95] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 616
		bodyModel[96] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 617
		bodyModel[97] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 28
		bodyModel[98] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 28
		bodyModel[99] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 28
		bodyModel[100] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 621
		bodyModel[101] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 622
		bodyModel[102] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 623
		bodyModel[103] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 28
		bodyModel[104] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 28
		bodyModel[105] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 28
		bodyModel[106] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 627
		bodyModel[107] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 628
		bodyModel[108] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 629

		bodyModel[0].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[0].setRotationPoint(2.5F, 4F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		bodyModel[1].setRotationPoint(-1.5F, 5F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[2].setRotationPoint(1.5F, 7F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[3].setRotationPoint(-4.5F, 6F, 7F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 0
		bodyModel[4].setRotationPoint(-6.5F, 6F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[5].setRotationPoint(-8.5F, 4F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[6].setRotationPoint(-8.5F, 4F, 6F);

		bodyModel[7].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[7].setRotationPoint(2.5F, 4F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[8].setRotationPoint(-1.5F, 8F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F); // Box 28
		bodyModel[9].setRotationPoint(-0.75F, 4.5F, -0.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 8
		bodyModel[10].setRotationPoint(-5.5F, 4.25F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 25
		bodyModel[11].setRotationPoint(-2.5F, 5F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 10
		bodyModel[12].setRotationPoint(-8.5F, 4.5F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F); // Box 10
		bodyModel[13].setRotationPoint(-8.5F, 5F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[14].setRotationPoint(-4.5F, 6F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F); // Box 14
		bodyModel[15].setRotationPoint(-4.5F, 6F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 25
		bodyModel[16].setRotationPoint(-2.5F, 7F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 61
		bodyModel[17].setRotationPoint(-7.5F, 4.25F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 104
		bodyModel[18].setRotationPoint(-6.5F, 6F, -8.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[19].setRotationPoint(-6.5F, 5F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 64
		bodyModel[20].setRotationPoint(5.5F, 4.25F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		bodyModel[21].setRotationPoint(7.5F, 4.5F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 66
		bodyModel[22].setRotationPoint(6.5F, 5F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[23].setRotationPoint(4.5F, 5F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[24].setRotationPoint(-4.5F, 5F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 69
		bodyModel[25].setRotationPoint(2.5F, 5F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 70
		bodyModel[26].setRotationPoint(-2.5F, 5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[27].setRotationPoint(1.5F, 5F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 74
		bodyModel[28].setRotationPoint(1.5F, 5F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[29].setRotationPoint(1.5F, 7F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 76
		bodyModel[30].setRotationPoint(1.5F, 6F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F); // Box 77
		bodyModel[31].setRotationPoint(3.5F, 6F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 78
		bodyModel[32].setRotationPoint(4.5F, 6F, -8.5F);

		bodyModel[33].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 79
		bodyModel[33].setRotationPoint(4.5F, 6F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 81
		bodyModel[34].setRotationPoint(-1.5F, 5F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 82
		bodyModel[35].setRotationPoint(-2.5F, 5F, 7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 83
		bodyModel[36].setRotationPoint(-2.5F, 5F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[37].setRotationPoint(-4.5F, 5F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[38].setRotationPoint(1.5F, 5F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 86
		bodyModel[39].setRotationPoint(1.5F, 5F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 87
		bodyModel[40].setRotationPoint(2.5F, 5F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.33F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.33F, 0F); // Box 88
		bodyModel[41].setRotationPoint(3.5F, 6F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 89
		bodyModel[42].setRotationPoint(1.5F, 6F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[43].setRotationPoint(-4.5F, 6F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F); // Box 93
		bodyModel[44].setRotationPoint(-8.5F, 5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 94
		bodyModel[45].setRotationPoint(-8.5F, 4.5F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 95
		bodyModel[46].setRotationPoint(-7.5F, 4.25F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 96
		bodyModel[47].setRotationPoint(-5.5F, 4.25F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[48].setRotationPoint(-6.5F, 5F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 98
		bodyModel[49].setRotationPoint(5.5F, 4.25F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[50].setRotationPoint(4.5F, 5F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 100
		bodyModel[51].setRotationPoint(6.5F, 5F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 101
		bodyModel[52].setRotationPoint(7.5F, 4.5F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Box 102
		bodyModel[53].setRotationPoint(-2.5F, 7F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 107
		bodyModel[54].setRotationPoint(-6.5F, 6F, 7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 108
		bodyModel[55].setRotationPoint(4.5F, 6F, 7.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 80
		bodyModel[56].setRotationPoint(-1F, 5.75F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 80
		bodyModel[57].setRotationPoint(-1.5F, 5.75F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 80
		bodyModel[58].setRotationPoint(-1.5F, 7.25F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 80
		bodyModel[59].setRotationPoint(0.5F, 7.25F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 80
		bodyModel[60].setRotationPoint(1F, 5.75F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.165F, 0F, 0F, -0.165F, 0F, 0F, -0.165F, 0F, -0.25F, -0.165F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F); // Box 80
		bodyModel[61].setRotationPoint(-1.5F, 7.75F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, -0.165F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, -0.165F, -0.5F, -0.25F); // Box 80
		bodyModel[62].setRotationPoint(-1.5F, 7.25F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, 0F, -0.165F, -0.5F, 0F, -0.165F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 80
		bodyModel[63].setRotationPoint(0.5F, 7.25F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 584
		bodyModel[64].setRotationPoint(-1F, 5.75F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 585
		bodyModel[65].setRotationPoint(-1.5F, 5.75F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 586
		bodyModel[66].setRotationPoint(-1.5F, 7.25F, -8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 587
		bodyModel[67].setRotationPoint(0.5F, 7.25F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 588
		bodyModel[68].setRotationPoint(1F, 5.75F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.165F, 0F, -0.25F, -0.165F, 0F, -0.25F, -0.165F, 0F, 0F, -0.165F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Box 589
		bodyModel[69].setRotationPoint(-1.5F, 7.75F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.165F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.165F, -0.5F, 0F); // Box 590
		bodyModel[70].setRotationPoint(-1.5F, 7.25F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.165F, -0.5F, -0.25F, -0.165F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 591
		bodyModel[71].setRotationPoint(0.5F, 7.25F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[72].setRotationPoint(-1.5F, 5.75F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[73].setRotationPoint(1F, 5.75F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 80
		bodyModel[74].setRotationPoint(-0.75F, 5.75F, -6.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 80
		bodyModel[75].setRotationPoint(-1F, 7.75F, -6.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[76].setRotationPoint(-1.5F, 8F, 7F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 66
		bodyModel[77].setRotationPoint(-0.75F, 5.5F, 6.25F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[78].setRotationPoint(-0.75F, 7F, 6.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.595F, 0F, -0.5F, -0.595F, 0F, -0.5F, -0.485F, 0F, 0F, -0.485F, 0F, 0F, -0.225F, 0F, -0.5F, -0.225F, 0F, -0.5F, -0.225F, 0F, 0F, -0.225F, 0F); // Box 37
		bodyModel[79].setRotationPoint(-0.75F, 6.6F, 6.25F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.475F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.345F, 0F, -0.5F, -0.345F, 0F, -0.5F, -0.235F, 0F, 0F, -0.235F, 0F); // Box 37
		bodyModel[80].setRotationPoint(-0.75F, 5.9F, 6.25F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.355F, 0F, -0.5F, -0.355F, 0F, -0.5F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.105F, 0F, -0.5F, -0.105F, 0F, -0.5F, -0.225F, 0F, 0F, -0.225F, 0F); // Box 37
		bodyModel[81].setRotationPoint(-0.75F, 6.25F, 7.25F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 603
		bodyModel[82].setRotationPoint(-0.75F, 5.5F, 5.25F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 604
		bodyModel[83].setRotationPoint(-0.75F, 7F, 5.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.485F, 0F, -0.5F, -0.485F, 0F, -0.5F, -0.595F, 0F, 0F, -0.595F, 0F, 0F, -0.225F, 0F, -0.5F, -0.225F, 0F, -0.5F, -0.225F, 0F, 0F, -0.225F, 0F); // Box 605
		bodyModel[84].setRotationPoint(-0.75F, 6.6F, 4.25F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.475F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.235F, 0F, -0.5F, -0.235F, 0F, -0.5F, -0.345F, 0F, 0F, -0.345F, 0F); // Box 606
		bodyModel[85].setRotationPoint(-0.75F, 5.9F, 4.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.475F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.355F, 0F, 0F, -0.355F, 0F, 0F, -0.225F, 0F, -0.5F, -0.225F, 0F, -0.5F, -0.105F, 0F, 0F, -0.105F, 0F); // Box 607
		bodyModel[86].setRotationPoint(-0.75F, 6.25F, 3.25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 608
		bodyModel[87].setRotationPoint(-0.75F, 5.5F, -7.25F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 609
		bodyModel[88].setRotationPoint(-0.75F, 7F, -7.25F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.485F, 0F, -0.5F, -0.485F, 0F, -0.5F, -0.595F, 0F, 0F, -0.595F, 0F, 0F, -0.225F, 0F, -0.5F, -0.225F, 0F, -0.5F, -0.225F, 0F, 0F, -0.225F, 0F); // Box 610
		bodyModel[89].setRotationPoint(-0.75F, 6.6F, -8.25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.475F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.235F, 0F, -0.5F, -0.235F, 0F, -0.5F, -0.345F, 0F, 0F, -0.345F, 0F); // Box 611
		bodyModel[90].setRotationPoint(-0.75F, 5.9F, -8.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.475F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.355F, 0F, 0F, -0.355F, 0F, 0F, -0.225F, 0F, -0.5F, -0.225F, 0F, -0.5F, -0.105F, 0F, 0F, -0.105F, 0F); // Box 612
		bodyModel[91].setRotationPoint(-0.75F, 6.25F, -9.25F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0F, -0.125F, 0F); // Box 613
		bodyModel[92].setRotationPoint(-0.75F, 5.5F, -6.25F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, -0.375F, 0F, -0.5F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 614
		bodyModel[93].setRotationPoint(-0.75F, 7F, -6.25F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.595F, 0F, -0.5F, -0.595F, 0F, -0.5F, -0.485F, 0F, 0F, -0.485F, 0F, 0F, -0.225F, 0F, -0.5F, -0.225F, 0F, -0.5F, -0.225F, 0F, 0F, -0.225F, 0F); // Box 615
		bodyModel[94].setRotationPoint(-0.75F, 6.6F, -6.25F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.475F, 0F, -0.5F, -0.475F, 0F, -0.5F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.345F, 0F, -0.5F, -0.345F, 0F, -0.5F, -0.235F, 0F, 0F, -0.235F, 0F); // Box 616
		bodyModel[95].setRotationPoint(-0.75F, 5.9F, -6.25F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.355F, 0F, -0.5F, -0.355F, 0F, -0.5F, -0.475F, 0F, 0F, -0.475F, 0F, 0F, -0.105F, 0F, -0.5F, -0.105F, 0F, -0.5F, -0.225F, 0F, 0F, -0.225F, 0F); // Box 617
		bodyModel[96].setRotationPoint(-0.75F, 6.25F, -5.25F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 28
		bodyModel[97].setRotationPoint(-1.25F, 6.75F, 4.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 28
		bodyModel[98].setRotationPoint(1F, 6.75F, 4.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 28
		bodyModel[99].setRotationPoint(-1.25F, 8.25F, 4.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 621
		bodyModel[100].setRotationPoint(-1.25F, 6.75F, -5.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 622
		bodyModel[101].setRotationPoint(1F, 6.75F, -5.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 623
		bodyModel[102].setRotationPoint(-1.25F, 8.25F, -5.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.25F, -0.25F, -0.6F, 0.25F, -0.25F, -0.6F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F); // Box 28
		bodyModel[103].setRotationPoint(-1.5F, 5.5F, 5.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.04F, 0.2F, -0.5F, -0.04F, 0.2F, -0.5F, -0.46F, 0F, -0.5F, -0.46F); // Box 28
		bodyModel[104].setRotationPoint(-1.1F, 8.25F, 5.71F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.25F, -0.25F, -0.6F, 0.25F, -0.25F, -0.6F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F); // Box 28
		bodyModel[105].setRotationPoint(1F, 5.5F, 5.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, -0.25F, -0.6F, 0.25F, -0.25F, -0.6F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F); // Box 627
		bodyModel[106].setRotationPoint(-1.5F, 5.5F, -6.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.46F, 0.2F, -0.5F, -0.46F, 0.2F, -0.5F, -0.04F, 0F, -0.5F, -0.04F); // Box 628
		bodyModel[107].setRotationPoint(-1.1F, 8.25F, -6.71F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.25F, -0.25F, -0.6F, 0.25F, -0.25F, -0.6F, 0.25F, -0.25F, -0.1F, 0.25F, -0.25F); // Box 629
		bodyModel[108].setRotationPoint(1F, 5.5F, -6.5F);
	}
}