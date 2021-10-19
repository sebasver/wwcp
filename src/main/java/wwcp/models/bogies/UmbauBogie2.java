//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 21.03.2019 - 19:29:54
// Last changed on: 21.03.2019 - 19:29:54

package wwcp.models.bogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class UmbauBogie2 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public UmbauBogie2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[76];

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
		bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 27
		bodyModel[29] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 27
		bodyModel[30] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 27
		bodyModel[31] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 27
		bodyModel[32] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 27
		bodyModel[33] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 27
		bodyModel[34] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 27
		bodyModel[35] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 27
		bodyModel[36] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 82
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 83
		bodyModel[38] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 84
		bodyModel[39] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 85
		bodyModel[40] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 86
		bodyModel[41] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 87
		bodyModel[42] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 88
		bodyModel[43] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 89
		bodyModel[44] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 90
		bodyModel[45] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 91
		bodyModel[46] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 92
		bodyModel[47] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 93
		bodyModel[48] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 94
		bodyModel[49] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 95
		bodyModel[50] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 96
		bodyModel[51] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 97
		bodyModel[52] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 98
		bodyModel[53] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 99
		bodyModel[54] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 100
		bodyModel[55] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 101
		bodyModel[56] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 102
		bodyModel[57] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 103
		bodyModel[58] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 104
		bodyModel[59] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 105
		bodyModel[60] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 106
		bodyModel[61] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 107
		bodyModel[62] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 108
		bodyModel[63] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 109
		bodyModel[64] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 110
		bodyModel[65] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 111
		bodyModel[66] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 97
		bodyModel[67] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 97
		bodyModel[68] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 28
		bodyModel[69] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 97
		bodyModel[70] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 97
		bodyModel[71] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 97
		bodyModel[72] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		bodyModel[73] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 97
		bodyModel[74] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 75

		bodyModel[0].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[0].setRotationPoint(-10F, 6.5F, 5.98F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[1].setRotationPoint(9.5F, 6F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[2].setRotationPoint(-10.5F, 6F, -7F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[3].setRotationPoint(10F, 6.5F, 5.98F);

		bodyModel[4].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[4].setRotationPoint(-10F, 6.5F, -5.98F);

		bodyModel[5].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[5].setRotationPoint(10F, 6.5F, -5.98F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[6].setRotationPoint(-11.5F, 5F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[7].setRotationPoint(-15F, 4F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, -0.5F, 0F, -1F, -0.5F); // Box 27
		bodyModel[8].setRotationPoint(-13.5F, 5F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 27
		bodyModel[9].setRotationPoint(-11F, 5F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 2F, -0.25F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, -2F, -0.25F); // Box 27
		bodyModel[10].setRotationPoint(-9F, 7F, 6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Box 27
		bodyModel[11].setRotationPoint(-7F, 8F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[12].setRotationPoint(-5F, 8F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[13].setRotationPoint(9F, 5F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.25F, -1F, 0F, -0.25F); // Box 27
		bodyModel[14].setRotationPoint(6F, 7F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[15].setRotationPoint(5F, 8F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[16].setRotationPoint(-3.5F, 5F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[17].setRotationPoint(2.5F, 5F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[18].setRotationPoint(-8.5F, 7F, 6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[19].setRotationPoint(8.5F, 5F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[20].setRotationPoint(6F, 4F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 27
		bodyModel[21].setRotationPoint(-6F, 4F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, -6F, 0.125F, -0.875F, -6F, 0.125F, -0.875F, -6F, -0.875F, 0.125F, -6F, -0.875F); // Box 27
		bodyModel[22].setRotationPoint(-4.75F, 5F, 6F);

		bodyModel[23].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 27
		bodyModel[23].setRotationPoint(-12.5F, 5F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 27
		bodyModel[24].setRotationPoint(-12.5F, 6F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0.3F, -0.3F, -0.5F); // Box 27
		bodyModel[25].setRotationPoint(-7.5F, 5F, 6F);

		bodyModel[26].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F); // Box 27
		bodyModel[26].setRotationPoint(-9.1F, 5F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[27].setRotationPoint(-8.5F, 6F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, -0.5F, 0F, -1F, -0.5F); // Box 27
		bodyModel[28].setRotationPoint(6.5F, 5F, 6F);

		bodyModel[29].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 27
		bodyModel[29].setRotationPoint(7.5F, 5F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 27
		bodyModel[30].setRotationPoint(7.5F, 6F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, -0.3F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0.3F, -0.3F, -0.5F); // Box 27
		bodyModel[31].setRotationPoint(12.5F, 5F, 6F);

		bodyModel[32].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F); // Box 27
		bodyModel[32].setRotationPoint(10.9F, 5F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[33].setRotationPoint(11.5F, 6F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, 0.125F, -0.875F, 0F, 0.125F, -0.875F, 0F, -0.875F, 0.125F, 0F, -0.875F, 0.125F, -6F, 0.125F, -0.875F, -6F, 0.125F, -0.875F, -6F, -0.875F, 0.125F, -6F, -0.875F); // Box 27
		bodyModel[34].setRotationPoint(3.75F, 5F, 6F);

		bodyModel[35].addShapeBox(0F, -1F, -1F, 5, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 27
		bodyModel[35].setRotationPoint(-2.5F, 6F, 7F);
		bodyModel[35].rotateAngleX = -0.78539816F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[36].setRotationPoint(-11.5F, 5F, -7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[37].setRotationPoint(-15F, 4F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, 0F, 0F, -1F, 0F); // Box 84
		bodyModel[38].setRotationPoint(-13.5F, 5F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 85
		bodyModel[39].setRotationPoint(-11F, 5F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[40].setRotationPoint(-9F, 7F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 87
		bodyModel[41].setRotationPoint(-7F, 8F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[42].setRotationPoint(-5F, 8F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[43].setRotationPoint(9F, 5F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, -0.25F, 0F, 2F, -0.25F, 0F, 2F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, 0F, -1F, 0F, 0F); // Box 90
		bodyModel[44].setRotationPoint(6F, 7F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[45].setRotationPoint(5F, 8F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[46].setRotationPoint(-3.5F, 5F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[47].setRotationPoint(2.5F, 5F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 94
		bodyModel[48].setRotationPoint(-8.5F, 7F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[49].setRotationPoint(8.5F, 5F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[50].setRotationPoint(6F, 4F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[51].setRotationPoint(-6F, 4F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -6F, -0.875F, -0.875F, -6F, -0.875F, -0.875F, -6F, 0.125F, 0.125F, -6F, 0.125F); // Box 98
		bodyModel[52].setRotationPoint(-4.75F, 5F, -8F);

		bodyModel[53].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 99
		bodyModel[53].setRotationPoint(-12.5F, 5F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 100
		bodyModel[54].setRotationPoint(-12.5F, 6F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0.3F, -0.3F, 0F); // Box 101
		bodyModel[55].setRotationPoint(-7.5F, 5F, -7F);

		bodyModel[56].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 102
		bodyModel[56].setRotationPoint(-9.1F, 5F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[57].setRotationPoint(-8.5F, 6F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, 0F, 0F, -1F, 0F); // Box 104
		bodyModel[58].setRotationPoint(6.5F, 5F, -7F);

		bodyModel[59].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 105
		bodyModel[59].setRotationPoint(7.5F, 5F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 106
		bodyModel[60].setRotationPoint(7.5F, 6F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.3F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0.3F, -0.3F, 0F); // Box 107
		bodyModel[61].setRotationPoint(12.5F, 5F, -7F);

		bodyModel[62].addShapeBox(0.3F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 108
		bodyModel[62].setRotationPoint(10.9F, 5F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[63].setRotationPoint(11.5F, 6F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0.125F, 0F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, -6F, -0.875F, -0.875F, -6F, -0.875F, -0.875F, -6F, 0.125F, 0.125F, -6F, 0.125F); // Box 110
		bodyModel[64].setRotationPoint(3.75F, 5F, -8F);

		bodyModel[65].addShapeBox(0F, -1F, -1F, 5, 2, 2, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 111
		bodyModel[65].setRotationPoint(-2.5F, 6F, -7F);
		bodyModel[65].rotateAngleX = -0.78539816F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[66].setRotationPoint(-15F, 4F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[67].setRotationPoint(-2F, 4F, -6F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Box 28
		bodyModel[68].setRotationPoint(-1.5F, 3F, -1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[69].setRotationPoint(14F, 4F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[70].setRotationPoint(-2F, 5F, -1F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[71].setRotationPoint(-2F, 8F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 97
		bodyModel[72].setRotationPoint(-2F, 6F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 97
		bodyModel[73].setRotationPoint(-2F, 7F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[74].setRotationPoint(-2F, 6F, 1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[75].setRotationPoint(-2F, 7F, 1F);
	}
}