//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.06.2018 - 21:42:56
// Last changed on: 14.06.2018 - 21:42:56

package wwcp.models.bogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class UmbauBogie1 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public UmbauBogie1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[70];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 26
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 27
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 32
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 33
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 27
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 27
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 27
		bodyModel[29] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 82
		bodyModel[30] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 83
		bodyModel[31] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 84
		bodyModel[32] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 88
		bodyModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 92
		bodyModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 93
		bodyModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 94
		bodyModel[36] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 95
		bodyModel[37] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 96
		bodyModel[38] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 97
		bodyModel[39] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 102
		bodyModel[43] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 103
		bodyModel[44] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 104
		bodyModel[45] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 105
		bodyModel[46] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 106
		bodyModel[47] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 107
		bodyModel[48] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 108
		bodyModel[49] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 109
		bodyModel[50] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 110
		bodyModel[51] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 111
		bodyModel[52] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 97
		bodyModel[53] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 97
		bodyModel[54] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 97
		bodyModel[55] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 27
		bodyModel[56] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 110
		bodyModel[57] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 27
		bodyModel[58] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 110
		bodyModel[59] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 27
		bodyModel[60] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 110
		bodyModel[61] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 27
		bodyModel[62] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 94
		bodyModel[63] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 28
		bodyModel[64] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 97
		bodyModel[65] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 97
		bodyModel[66] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		bodyModel[67] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 97
		bodyModel[68] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 74
		bodyModel[69] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 75

		bodyModel[0].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[0].setRotationPoint(-11F, 6.5F, 5.98F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[1].setRotationPoint(10.5F, 6F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[2].setRotationPoint(-11.5F, 6F, -7F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[3].setRotationPoint(11F, 6.5F, 5.98F);

		bodyModel[4].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[4].setRotationPoint(-11F, 6.5F, -5.98F);

		bodyModel[5].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[5].setRotationPoint(11F, 6.5F, -5.98F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[6].setRotationPoint(-12.5F, 5F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[7].setRotationPoint(-17F, 4F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, -0.5F, 0F, -1F, -0.5F); // Box 27
		bodyModel[8].setRotationPoint(-14.5F, 5F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[9].setRotationPoint(-4.5F, 8F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[10].setRotationPoint(-3.5F, 5F, 6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[11].setRotationPoint(2.5F, 5F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[12].setRotationPoint(-9.5F, 8F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[13].setRotationPoint(9.5F, 5F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[14].setRotationPoint(6F, 4F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[15].setRotationPoint(-6F, 4F, 6F);

		bodyModel[16].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 27
		bodyModel[16].setRotationPoint(-13.5F, 5F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 27
		bodyModel[17].setRotationPoint(-13.5F, 6F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0.3F, -0.3F, -0.5F); // Box 27
		bodyModel[18].setRotationPoint(-8.5F, 5F, 6F);

		bodyModel[19].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F); // Box 27
		bodyModel[19].setRotationPoint(-10.1F, 5F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[20].setRotationPoint(-9.5F, 6F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, -0.5F, 0F, -1F, -0.5F); // Box 27
		bodyModel[21].setRotationPoint(7.5F, 5F, 6F);

		bodyModel[22].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 27
		bodyModel[22].setRotationPoint(8.5F, 5F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 27
		bodyModel[23].setRotationPoint(8.5F, 6F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0.3F, -0.3F, -0.5F); // Box 27
		bodyModel[24].setRotationPoint(13.5F, 5F, 6F);

		bodyModel[25].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F); // Box 27
		bodyModel[25].setRotationPoint(11.9F, 5F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[26].setRotationPoint(12.5F, 6F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, -6F, 0.125F, -0.875F, -6F, 0.125F, -0.875F, -6F, -0.875F, 0.125F, -6F, -0.875F); // Box 27
		bodyModel[27].setRotationPoint(6.25F, 5F, 6F);

		bodyModel[28].addShapeBox(0F, -1F, -1F, 5, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 27
		bodyModel[28].setRotationPoint(-2.5F, 6F, 7F);
		bodyModel[28].rotateAngleX = -0.78539816F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[29].setRotationPoint(-12.5F, 5F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[30].setRotationPoint(-17F, 4F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, 0F, 0F, -1F, 0F); // Box 84
		bodyModel[31].setRotationPoint(-14.5F, 5F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[32].setRotationPoint(-4.5F, 8F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[33].setRotationPoint(-3.5F, 5F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[34].setRotationPoint(2.5F, 5F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 94
		bodyModel[35].setRotationPoint(-9.5F, 8F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[36].setRotationPoint(9.5F, 5F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[37].setRotationPoint(6F, 4F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[38].setRotationPoint(-6F, 4F, -7F);

		bodyModel[39].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 99
		bodyModel[39].setRotationPoint(-13.5F, 5F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 100
		bodyModel[40].setRotationPoint(-13.5F, 6F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0.3F, -0.3F, 0F); // Box 101
		bodyModel[41].setRotationPoint(-8.5F, 5F, -7F);

		bodyModel[42].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 102
		bodyModel[42].setRotationPoint(-10.1F, 5F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[43].setRotationPoint(-9.5F, 6F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, 0F, 0F, -1F, 0F); // Box 104
		bodyModel[44].setRotationPoint(7.5F, 5F, -7F);

		bodyModel[45].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 105
		bodyModel[45].setRotationPoint(8.5F, 5F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 106
		bodyModel[46].setRotationPoint(8.5F, 6F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0.3F, -0.3F, 0F); // Box 107
		bodyModel[47].setRotationPoint(13.5F, 5F, -7F);

		bodyModel[48].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 108
		bodyModel[48].setRotationPoint(11.9F, 5F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[49].setRotationPoint(12.5F, 6F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -6F, -0.875F, -0.875F, -6F, -0.875F, -0.875F, -6F, 0.125F, 0.125F, -6F, 0.125F); // Box 110
		bodyModel[50].setRotationPoint(6.25F, 5F, -8F);

		bodyModel[51].addShapeBox(0F, -1F, -1F, 5, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 111
		bodyModel[51].setRotationPoint(-2.5F, 6F, -7F);
		bodyModel[51].rotateAngleX = -0.78539816F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[52].setRotationPoint(-17F, 4F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[53].setRotationPoint(-2F, 4F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[54].setRotationPoint(16F, 4F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, -6F, 0.125F, -0.875F, -6F, 0.125F, -0.875F, -6F, -0.875F, 0.125F, -6F, -0.875F); // Box 27
		bodyModel[55].setRotationPoint(14.75F, 5F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -6F, -0.875F, -0.875F, -6F, -0.875F, -0.875F, -6F, 0.125F, 0.125F, -6F, 0.125F); // Box 110
		bodyModel[56].setRotationPoint(14.75F, 5F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, -6F, 0.125F, -0.875F, -6F, 0.125F, -0.875F, -6F, -0.875F, 0.125F, -6F, -0.875F); // Box 27
		bodyModel[57].setRotationPoint(-15.75F, 5F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -6F, -0.875F, -0.875F, -6F, -0.875F, -0.875F, -6F, 0.125F, 0.125F, -6F, 0.125F); // Box 110
		bodyModel[58].setRotationPoint(-15.75F, 5F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, -6F, 0.125F, -0.875F, -6F, 0.125F, -0.875F, -6F, -0.875F, 0.125F, -6F, -0.875F); // Box 27
		bodyModel[59].setRotationPoint(-7.25F, 5F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -6F, -0.875F, -0.875F, -6F, -0.875F, -0.875F, -6F, 0.125F, 0.125F, -6F, 0.125F); // Box 110
		bodyModel[60].setRotationPoint(-7.25F, 5F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[61].setRotationPoint(4.5F, 8F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 94
		bodyModel[62].setRotationPoint(4.5F, 8F, -7F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 28
		bodyModel[63].setRotationPoint(-1.5F, 3F, -1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[64].setRotationPoint(-2F, 5F, -1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[65].setRotationPoint(-2F, 8F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 97
		bodyModel[66].setRotationPoint(-2F, 6F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 97
		bodyModel[67].setRotationPoint(-2F, 7F, -6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[68].setRotationPoint(-2F, 6F, 1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[69].setRotationPoint(-2F, 7F, 1F);
	}
}