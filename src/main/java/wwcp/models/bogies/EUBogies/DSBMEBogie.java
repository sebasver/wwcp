//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.11.2017 - 19:11:37
// Last changed on: 15.11.2017 - 19:11:37

package wwcp.models.bogies.EUBogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class DSBMEBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public DSBMEBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[71];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 88
		bodyModel[2] = new ModelRendererTurbo(this, 65, 32, textureX, textureY); // Box 91
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 92
		bodyModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 93
		bodyModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 94
		bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 126
		bodyModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 112
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 50
		bodyModel[43] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 51
		bodyModel[44] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 52
		bodyModel[45] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 53
		bodyModel[46] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 54
		bodyModel[47] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 58
		bodyModel[50] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 59
		bodyModel[51] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 60
		bodyModel[52] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 61
		bodyModel[53] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 62
		bodyModel[54] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 64
		bodyModel[55] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 65
		bodyModel[56] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 66
		bodyModel[57] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 67
		bodyModel[58] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 68
		bodyModel[59] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 69
		bodyModel[60] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 70
		bodyModel[61] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 71
		bodyModel[62] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 72
		bodyModel[63] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 73
		bodyModel[64] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 74
		bodyModel[65] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 75
		bodyModel[66] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 45
		bodyModel[67] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 46
		bodyModel[68] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 50
		bodyModel[69] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 44

		bodyModel[0].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[0].setRotationPoint(19.5F, 2.5F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[1].setRotationPoint(-19.5F, 2.5F, 0F);

		bodyModel[2].addBox(0F, 0F, -5F, 37, 5, 10, 0F); // Box 91
		bodyModel[2].setRotationPoint(-18F, 3F, 0F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 12, 0F); // Box 92
		bodyModel[3].setRotationPoint(14F, 5.5F, -6F);

		bodyModel[4].addBox(0F, 0F, -8F, 2, 2, 12, 0F); // Box 93
		bodyModel[4].setRotationPoint(-0.75F, 5.5F, 2F);

		bodyModel[5].addBox(0F, 0F, -8F, 2, 2, 12, 0F); // Box 94
		bodyModel[5].setRotationPoint(-15.5F, 5.5F, 2F);

		bodyModel[6].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 126
		bodyModel[6].setRotationPoint(11F, 2F, 5.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 4, 2, 4, 0F); // Box 112
		bodyModel[7].setRotationPoint(-2F, 1F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 17
		bodyModel[8].setRotationPoint(11F, 2F, -5.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 18
		bodyModel[9].setRotationPoint(-3.75F, 2F, -5.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 19
		bodyModel[10].setRotationPoint(-3.75F, 2F, 5.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 20
		bodyModel[11].setRotationPoint(-18.5F, 2F, -5.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 21
		bodyModel[12].setRotationPoint(-18.5F, 2F, 5.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[13].setRotationPoint(-20.3F, 3.5F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 24
		bodyModel[14].setRotationPoint(-16.5F, 5.5F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[15].setRotationPoint(-16.5F, 5.5F, 5.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 26
		bodyModel[16].setRotationPoint(-1.75F, 5.5F, 5.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 27
		bodyModel[17].setRotationPoint(-1.75F, 5.5F, -6.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 28
		bodyModel[18].setRotationPoint(13F, 5.5F, -6.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[19].setRotationPoint(12.99F, 5.5F, 5.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(-13.75F, 3F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-20.3F, 1.5F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[22].setRotationPoint(14.7F, 1.5F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-14.3F, 1.5F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(14.7F, 1.5F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 41, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(-20.3F, 3.5F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(-20.3F, 1.5F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 29, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(-14.3F, 1.5F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-20.3F, 4.5F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(-14.3F, 4.5F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(14.7F, 4.5F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(14.7F, 4.5F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(-14.3F, 4.5F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(-20.3F, 4.5F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-1.5F, 3F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(10.75F, 3F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[36].setRotationPoint(-13.75F, 3F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		bodyModel[37].setRotationPoint(-1.5F, 3F, 7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		bodyModel[38].setRotationPoint(10.75F, 3F, 7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[39].setRotationPoint(-13.5F, 6.5F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[40].setRotationPoint(-19.5F, 8F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 12, 1, 0, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(-5.5F, 8F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 11, 1, 0, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[42].setRotationPoint(9.5F, 8F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[43].setRotationPoint(-19.5F, 4.5F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[44].setRotationPoint(19.5F, 4.5F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[45].setRotationPoint(19.5F, 4.5F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[46].setRotationPoint(-19.5F, 4.5F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[47].setRotationPoint(7.25F, 5.5F, 5.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[48].setRotationPoint(-7.75F, 5.5F, 5.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[49].setRotationPoint(-7.5F, 6F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[50].setRotationPoint(7.5F, 6F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[51].setRotationPoint(7.25F, 5.5F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[52].setRotationPoint(-7.75F, 5.5F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[53].setRotationPoint(-7.5F, 6F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 1.75F, -0.5F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, -0.5F, 0F); // Box 64
		bodyModel[54].setRotationPoint(7.5F, 8F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, -2.75F, 0F, 0F); // Box 65
		bodyModel[55].setRotationPoint(6.75F, 8F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 1.75F, -0.5F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, -0.5F, 0F); // Box 66
		bodyModel[56].setRotationPoint(7.5F, 8F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[57].setRotationPoint(7.5F, 6F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, -2.75F, 0F, 0F); // Box 68
		bodyModel[58].setRotationPoint(6.75F, 8F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[59].setRotationPoint(8F, 6.5F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, -2.75F, 0F, 0F); // Box 70
		bodyModel[60].setRotationPoint(-8.25F, 8F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 1.75F, -0.5F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, -0.5F, 0F); // Box 71
		bodyModel[61].setRotationPoint(-7.5F, 8F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[62].setRotationPoint(-7.5F, 7F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[63].setRotationPoint(-7.5F, 7F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-1.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, -1.25F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, -2.75F, 0F, 0F); // Box 74
		bodyModel[64].setRotationPoint(-8.25F, 8F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 1.75F, -0.5F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 1.75F, -0.5F, 0F); // Box 75
		bodyModel[65].setRotationPoint(-7.5F, 8F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[66].setRotationPoint(-19.5F, 8F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 12, 1, 0, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[67].setRotationPoint(-5.5F, 8F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 11, 1, 0, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[68].setRotationPoint(9.5F, 8F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[69].setRotationPoint(8F, 6.5F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 13, 1, 0, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[70].setRotationPoint(-13.5F, 6.5F, 6F);
	}
}