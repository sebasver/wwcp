//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.01.2019 - 21:17:44
// Last changed on: 28.01.2019 - 21:17:44

package wwcp.models.tenders; //Path where the model is located


import ebf.tim.models.GroupedModelRender;
import ebf.tim.models.StaticModelAnimator;
import fexcraft.fcl.common.Static;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ChristmasTenderT32 extends ModelBase //Same as Filename
{
	//todo add in glowing effects

	int textureX = 512;
	int textureY = 512;

	public ChristmasTenderT32() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[90];

		initbodyModel_1();
		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		bodyModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 56
		bodyModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 57
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 58
		bodyModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 130
		bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box Left door
		bodyModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 103
		bodyModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 130
		bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 300
		bodyModel[12] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 103
		bodyModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 300
		bodyModel[14] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 300
		bodyModel[15] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 300
		bodyModel[16] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 119
		bodyModel[17] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 360
		bodyModel[18] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 361
		bodyModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 362
		bodyModel[20] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 363
		bodyModel[21] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 364
		bodyModel[22] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 365
		bodyModel[23] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 52
		bodyModel[24] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // BacklampDB
		bodyModel[25] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 121
		bodyModel[26] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 52
		bodyModel[27] = new ModelRendererTurbo(this, 425, 1, textureX, textureY, StaticModelAnimator.tagGlow); // Backlamp
		bodyModel[28] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 52
		bodyModel[29] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 52
		bodyModel[30] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 52
		bodyModel[31] = new ModelRendererTurbo(this, 449, 1, textureX, textureY, StaticModelAnimator.tagGlow); // Backlamp
		bodyModel[32] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 52
		bodyModel[33] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 52
		bodyModel[34] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 384
		bodyModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 103
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 103
		bodyModel[37] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 366
		bodyModel[38] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 367
		bodyModel[39] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 92
		bodyModel[41] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 96
		bodyModel[42] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 122
		bodyModel[43] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 123
		bodyModel[44] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 124
		bodyModel[45] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 125
		bodyModel[46] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 126
		bodyModel[47] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 127
		bodyModel[48] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 129
		bodyModel[49] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 108
		bodyModel[50] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 110
		bodyModel[51] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Coal
		bodyModel[52] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 113
		bodyModel[53] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 114
		bodyModel[54] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 109
		bodyModel[55] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 112
		bodyModel[56] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Coal
		bodyModel[57] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 121
		bodyModel[58] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 114
		bodyModel[59] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 110
		bodyModel[60] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 114
		bodyModel[61] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 96
		bodyModel[62] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 123
		bodyModel[63] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 122
		bodyModel[64] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 122
		bodyModel[65] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 90
		bodyModel[66] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 90
		bodyModel[67] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 90
		bodyModel[68] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 132
		bodyModel[69] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 50
		bodyModel[70] = new ModelRendererTurbo(this, 10, 127, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 10, 107, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 10, 84, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 10, 151, textureX, textureY); // Box 75
		bodyModel[74] = new ModelRendererTurbo(this, 10, 107, textureX, textureY); // Box 76
		bodyModel[75] = new ModelRendererTurbo(this, 10, 84, textureX, textureY); // Box 77
		bodyModel[76] = new ModelRendererTurbo(this, 10, 151, textureX, textureY); // Box 79
		bodyModel[77] = new ModelRendererTurbo(this, 10, 151, textureX, textureY); // Box 80
		bodyModel[78] = new ModelRendererTurbo(this, 10, 151, textureX, textureY); // Box 81
		bodyModel[79] = new ModelRendererTurbo(this, 10, 127, textureX, textureY); // Box 82
		bodyModel[80] = new ModelRendererTurbo(this, 10, 127, textureX, textureY); // Box 83
		bodyModel[81] = new ModelRendererTurbo(this, 10, 127, textureX, textureY); // Box 84
		bodyModel[82] = new ModelRendererTurbo(this, 10, 151, textureX, textureY); // Box 85
		bodyModel[83] = new ModelRendererTurbo(this, 10, 127, textureX, textureY); // Box 86
		bodyModel[84] = new ModelRendererTurbo(this, 10, 151, textureX, textureY); // Box 87
		bodyModel[85] = new ModelRendererTurbo(this, 10, 151, textureX, textureY); // Box 88
		bodyModel[86] = new ModelRendererTurbo(this, 10, 127, textureX, textureY); // Box 89
		bodyModel[87] = new ModelRendererTurbo(this, 10, 127, textureX, textureY); // Box 90
		bodyModel[88] = new ModelRendererTurbo(this, 10, 127, textureX, textureY); // Box 91
		bodyModel[89] = new ModelRendererTurbo(this, 10, 151, textureX, textureY); // Box 92

		bodyModel[0].addShapeBox(0F, 0F, 0F, 55, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[0].setRotationPoint(-21F, 2F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[1].setRotationPoint(36F, 2F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[2].setRotationPoint(37.5F, 1F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
		bodyModel[3].setRotationPoint(37.5F, 1F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[4].setRotationPoint(36F, 2F, 7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[5].setRotationPoint(-26F, -2.1F, -10F);

		bodyModel[6].addShapeBox(-3F, 0F, -1F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box Left door
		bodyModel[6].setRotationPoint(-21F, -12F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[7].setRotationPoint(-11F, 3F, -1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[8].setRotationPoint(16F, 3F, -1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[9].setRotationPoint(-21.5F, -2F, -10.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 130
		bodyModel[10].setRotationPoint(-26F, -0.1F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 300
		bodyModel[11].setRotationPoint(-24.5F, -2F, -11.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[12].setRotationPoint(-25F, -2F, -10.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[13].setRotationPoint(-24.5F, 0.5F, -11.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[14].setRotationPoint(-24.5F, 3F, -11.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[15].setRotationPoint(-24.5F, 5.5F, -11.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 119
		bodyModel[16].setRotationPoint(35F, -11F, 3F);
		bodyModel[16].rotateAngleY = -3.14159265F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[17].setRotationPoint(-21.5F, -2F, 9.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[18].setRotationPoint(-24.5F, -2F, 9.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[19].setRotationPoint(-25F, -2F, 9.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 363
		bodyModel[20].setRotationPoint(-24.5F, 0.5F, 9.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 364
		bodyModel[21].setRotationPoint(-24.5F, 3F, 9.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 365
		bodyModel[22].setRotationPoint(-24.5F, 5.5F, 9.5F);

		bodyModel[23].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[23].setRotationPoint(34.25F, -14F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // BacklampDB
		bodyModel[24].setRotationPoint(36.25F, -14F, 0F);
		bodyModel[24].rotateAngleY = -3.14159265F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[25].setRotationPoint(34F, 2F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[26].setRotationPoint(36.25F, -4F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Backlamp
		bodyModel[27].setRotationPoint(38.25F, -4F, 6F);
		bodyModel[27].rotateAngleY = -3.14159265F;

		bodyModel[28].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[28].setRotationPoint(36.3F, -1.9F, 6F);
		bodyModel[28].rotateAngleZ = 1.57079633F;

		bodyModel[29].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[29].setRotationPoint(36F, -1.9F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[30].setRotationPoint(36.25F, -4F, -6F);

		bodyModel[31].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Backlamp
		bodyModel[31].setRotationPoint(38.25F, -4F, -6F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[32].setRotationPoint(36.3F, -1.9F, -6F);
		bodyModel[32].rotateAngleZ = 1.57079633F;

		bodyModel[33].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[33].setRotationPoint(36F, -1.9F, -6F);

		bodyModel[34].addShapeBox(-3F, 0F, -1F, 3, 9, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[34].setRotationPoint(-21F, -12F, 11F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[35].setRotationPoint(-25F, -2F, -10.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[36].setRotationPoint(-21.5F, -2F, -10.25F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[37].setRotationPoint(-25F, -2F, 9.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[38].setRotationPoint(-21.5F, -2F, 9.25F);

		bodyModel[39].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[39].setRotationPoint(34F, -12.4F, 0F);

		bodyModel[40].addBox(0F, 0F, 0F, 45, 17, 22, 0F); // Box 92
		bodyModel[40].setRotationPoint(-17F, -15F, -11F);

		bodyModel[41].addBox(0F, 0F, 0F, 29, 7, 1, 0F); // Box 96
		bodyModel[41].setRotationPoint(-5F, -22F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[42].setRotationPoint(28F, -13F, -11F);

		bodyModel[43].addBox(0F, 0F, 0F, 28, 7, 1, 0F); // Box 123
		bodyModel[43].setRotationPoint(-4F, -22F, 5F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 9, 10, 0F); // Box 124
		bodyModel[44].setRotationPoint(23F, -22F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[45].setRotationPoint(-14F, -22F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[46].setRotationPoint(-14F, -22F, 5F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 17, 6, 0F); // Box 127
		bodyModel[47].setRotationPoint(-21F, -15F, -11F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 17, 6, 0F); // Box 129
		bodyModel[48].setRotationPoint(-21F, -15F, 5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 6, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 108
		bodyModel[49].setRotationPoint(28F, -15F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 110
		bodyModel[50].setRotationPoint(31.5F, -13.25F, 8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Coal
		bodyModel[51].setRotationPoint(-9F, -20F, -5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 5, 10, 0F,-2F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[52].setRotationPoint(-12F, -20F, -5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 114
		bodyModel[53].setRotationPoint(31.5F, -13.25F, -10.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[54].setRotationPoint(24F, -18F, 4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[55].setRotationPoint(24F, -18F, -5F);

		bodyModel[56].addBox(0F, 0F, 0F, 28, 5, 10, 0F); // Coal
		bodyModel[56].setRotationPoint(-5F, -20F, -5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 9, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[57].setRotationPoint(34F, -7F, -8F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 7, 0F); // Box 114
		bodyModel[58].setRotationPoint(29.5F, -15.25F, -3.5F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 110
		bodyModel[59].setRotationPoint(-12.5F, -15.25F, 8F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 114
		bodyModel[60].setRotationPoint(-12.5F, -15.25F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 7, 2, 1, 0F); // Box 96
		bodyModel[61].setRotationPoint(-21F, -17F, -6F);

		bodyModel[62].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 123
		bodyModel[62].setRotationPoint(-20F, -17F, 5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[63].setRotationPoint(34F, -13F, -11F);
		bodyModel[63].rotateAngleZ = 0.03490659F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[64].setRotationPoint(34F, -13F, 8F);
		bodyModel[64].rotateAngleZ = 0.03490659F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[65].setRotationPoint(-22F, -7F, -6.2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F); // Box 90
		bodyModel[66].setRotationPoint(-21.5F, -8F, -5.95F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 90
		bodyModel[67].setRotationPoint(-22F, -5F, -5.2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 16, 16, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F); // Box 132
		bodyModel[68].setRotationPoint(-21.34F, -8.8F, 1F);
		bodyModel[68].rotateAngleX = -0.20943951F;
		bodyModel[68].rotateAngleY = -1.50098316F;
		bodyModel[68].rotateAngleZ = 0.78539816F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 50
		bodyModel[69].setRotationPoint(-21F, -3.1F, -5F);

		bodyModel[70].addShapeBox(-10F, -8F, 0F, 23, 21, 1, 0F,-9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F); // Box 70
		bodyModel[70].setRotationPoint(-18F, -13F, -11.05F);
		bodyModel[70].rotateAngleZ = 0.33161256F;

		bodyModel[71].addShapeBox(-72F, 0F, 0F, 164, 16, 1, 0F,-72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F); // Box 72
		bodyModel[71].setRotationPoint(-23F, -9F, -11.05F);
		bodyModel[71].rotateAngleZ = 0.50614548F;

		bodyModel[72].addShapeBox(-83F, 0F, 0F, 188, 14, 1, 0F,-83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F); // Box 73
		bodyModel[72].setRotationPoint(16F, -17.5F, -11.05F);
		bodyModel[72].rotateAngleZ = -0.43633231F;

		bodyModel[73].addShapeBox(-8F, -7F, 0F, 21, 19, 1, 0F,-8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F); // Box 75
		bodyModel[73].setRotationPoint(-10F, -5F, -11.05F);
		bodyModel[73].rotateAngleZ = -0.40142573F;

		bodyModel[74].addShapeBox(-72F, 0F, 0F, 164, 16, 1, 0F,-72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F, -72F, -7F, 0F); // Box 76
		bodyModel[74].setRotationPoint(-23F, -9F, 10.05F);
		bodyModel[74].rotateAngleZ = 0.50614548F;

		bodyModel[75].addShapeBox(-83F, 0F, 0F, 188, 14, 1, 0F,-83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F, -83F, -6F, 0F); // Box 77
		bodyModel[75].setRotationPoint(16F, -17.5F, 10.05F);
		bodyModel[75].rotateAngleZ = -0.43633231F;

		bodyModel[76].addShapeBox(-8F, -7F, 0F, 21, 19, 1, 0F,-8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F); // Box 79
		bodyModel[76].setRotationPoint(-5F, -3F, -11.05F);
		bodyModel[76].rotateAngleZ = 0.40142573F;

		bodyModel[77].addShapeBox(-8F, -7F, 0F, 21, 19, 1, 0F,-8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F); // Box 80
		bodyModel[77].setRotationPoint(13F, -5F, -11.05F);
		bodyModel[77].rotateAngleZ = -0.40142573F;

		bodyModel[78].addShapeBox(-8F, -7F, 0F, 21, 19, 1, 0F,-8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F); // Box 81
		bodyModel[78].setRotationPoint(18F, -3F, -11.05F);
		bodyModel[78].rotateAngleZ = 0.40142573F;

		bodyModel[79].addShapeBox(-10F, -8F, 0F, 23, 21, 1, 0F,-9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F); // Box 82
		bodyModel[79].setRotationPoint(25F, -14F, -11.05F);
		bodyModel[79].rotateAngleZ = -0.33161256F;

		bodyModel[80].addShapeBox(-10F, -8F, 0F, 23, 21, 1, 0F,-9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F); // Box 83
		bodyModel[80].setRotationPoint(8F, -10F, -11.05F);
		bodyModel[80].rotateAngleZ = 0.33161256F;

		bodyModel[81].addShapeBox(-10F, -8F, 0F, 23, 21, 1, 0F,-9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F); // Box 84
		bodyModel[81].setRotationPoint(2F, -11F, -11.05F);
		bodyModel[81].rotateAngleZ = -0.33161256F;

		bodyModel[82].addShapeBox(-8F, -7F, 0F, 21, 19, 1, 0F,-8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F); // Box 85
		bodyModel[82].setRotationPoint(13F, -5F, 10.05F);
		bodyModel[82].rotateAngleZ = -0.40142573F;

		bodyModel[83].addShapeBox(-10F, -8F, 0F, 23, 21, 1, 0F,-9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F); // Box 86
		bodyModel[83].setRotationPoint(-18F, -13F, 10.05F);
		bodyModel[83].rotateAngleZ = 0.33161256F;

		bodyModel[84].addShapeBox(-8F, -7F, 0F, 21, 19, 1, 0F,-8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F); // Box 87
		bodyModel[84].setRotationPoint(-10F, -5F, 10.05F);
		bodyModel[84].rotateAngleZ = -0.40142573F;

		bodyModel[85].addShapeBox(-8F, -7F, 0F, 21, 19, 1, 0F,-8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F); // Box 88
		bodyModel[85].setRotationPoint(-5F, -3F, 10.05F);
		bodyModel[85].rotateAngleZ = 0.40142573F;

		bodyModel[86].addShapeBox(-10F, -8F, 0F, 23, 21, 1, 0F,-9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F); // Box 89
		bodyModel[86].setRotationPoint(2F, -11F, 10.05F);
		bodyModel[86].rotateAngleZ = -0.33161256F;

		bodyModel[87].addShapeBox(-10F, -8F, 0F, 23, 21, 1, 0F,-9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F); // Box 90
		bodyModel[87].setRotationPoint(8F, -10F, 10.05F);
		bodyModel[87].rotateAngleZ = 0.33161256F;

		bodyModel[88].addShapeBox(-10F, -8F, 0F, 23, 21, 1, 0F,-9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F, -9F, -8F, 0F); // Box 91
		bodyModel[88].setRotationPoint(25F, -14F, 10.05F);
		bodyModel[88].rotateAngleZ = -0.33161256F;

		bodyModel[89].addShapeBox(-8F, -7F, 0F, 21, 19, 1, 0F,-8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F, -8F, -7F, 0F); // Box 92
		bodyModel[89].setRotationPoint(18F, -3F, 10.05F);
		bodyModel[89].rotateAngleZ = 0.40142573F;
	}
}