//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 07.04.2019 - 22:52:50
// Last changed on: 07.04.2019 - 22:52:50

package wwcp.models.bogies.TenderBogies.BR01Line; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class T26BogieBack extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public T26BogieBack() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[55];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Wheel
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 67
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Wheel
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 64
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Wheel
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 105
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Wheel
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 113
		bodyModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 113
		bodyModel[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 94
		bodyModel[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 95
		bodyModel[14] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 113
		bodyModel[15] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 113
		bodyModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 113
		bodyModel[17] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 95
		bodyModel[18] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 95
		bodyModel[19] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 126
		bodyModel[20] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 127
		bodyModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 129
		bodyModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 130
		bodyModel[24] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 131
		bodyModel[25] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 132
		bodyModel[26] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 133
		bodyModel[27] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 95
		bodyModel[28] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 95
		bodyModel[29] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 64
		bodyModel[30] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 64
		bodyModel[31] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 69
		bodyModel[32] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 70
		bodyModel[33] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 64
		bodyModel[34] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 64
		bodyModel[35] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 68
		bodyModel[36] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 64
		bodyModel[37] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 33
		bodyModel[38] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 64
		bodyModel[39] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 64
		bodyModel[40] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 33
		bodyModel[41] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 64
		bodyModel[42] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 64
		bodyModel[43] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 72
		bodyModel[44] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 73
		bodyModel[45] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 74
		bodyModel[46] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 78
		bodyModel[47] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 79
		bodyModel[48] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 80
		bodyModel[49] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 95
		bodyModel[50] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 95
		bodyModel[51] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 83
		bodyModel[52] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 84
		bodyModel[53] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 64
		bodyModel[54] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 68

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[0].setRotationPoint(5F, 6F, -7F);

		bodyModel[1].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		bodyModel[1].setRotationPoint(5.5F, 6.5F, 5.95F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 67
		bodyModel[2].setRotationPoint(3F, 3F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[3].setRotationPoint(-6F, 6F, -7F);

		bodyModel[4].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		bodyModel[4].setRotationPoint(-5.5F, 6.5F, 5.95F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[5].setRotationPoint(-8F, 3F, 6F);

		bodyModel[6].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		bodyModel[6].setRotationPoint(5.5F, 6.5F, -5.95F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[7].setRotationPoint(3F, 3F, -7F);

		bodyModel[8].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wheel
		bodyModel[8].setRotationPoint(-5.5F, 6.5F, -5.95F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[9].setRotationPoint(-8F, 3F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[10].setRotationPoint(-1.5F, 3F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[11].setRotationPoint(-3F, 3F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[12].setRotationPoint(-0.5F, 5F, -7.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[13].setRotationPoint(-1.5F, 4.7F, -7.85F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[14].setRotationPoint(-3F, 4F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[15].setRotationPoint(-1F, 3F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[16].setRotationPoint(2F, 3F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[17].setRotationPoint(-1.75F, 3.7F, -7.85F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[18].setRotationPoint(1.25F, 3.7F, -7.85F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 126
		bodyModel[19].setRotationPoint(-3F, 3F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[20].setRotationPoint(-0.5F, 5F, 6.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 128
		bodyModel[21].setRotationPoint(-1.5F, 4.7F, 6.85F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 129
		bodyModel[22].setRotationPoint(-3F, 4F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 130
		bodyModel[23].setRotationPoint(-1F, 3F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 131
		bodyModel[24].setRotationPoint(2F, 3F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 132
		bodyModel[25].setRotationPoint(-1.75F, 3.7F, 6.85F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 133
		bodyModel[26].setRotationPoint(1.25F, 3.7F, 6.85F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 95
		bodyModel[27].setRotationPoint(1.25F, 2.7F, -7.85F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 95
		bodyModel[28].setRotationPoint(-1.75F, 2.7F, -7.85F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[29].setRotationPoint(8F, 7F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[30].setRotationPoint(8F, 3F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[31].setRotationPoint(8F, 7F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[32].setRotationPoint(8F, 3F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[33].setRotationPoint(9F, 3.5F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[34].setRotationPoint(-10F, 3F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[35].setRotationPoint(-10F, 3F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[36].setRotationPoint(-10F, 3.5F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[37].setRotationPoint(-6F, 4F, 6.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[38].setRotationPoint(-6.5F, 5.5F, 6.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[39].setRotationPoint(-6F, 3.5F, 6.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[40].setRotationPoint(5F, 4F, 6.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[41].setRotationPoint(4.5F, 5.5F, 6.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[42].setRotationPoint(5F, 3.5F, 6.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 72
		bodyModel[43].setRotationPoint(-6F, 4F, -7.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[44].setRotationPoint(-6.5F, 5.5F, -7.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[45].setRotationPoint(-6F, 3.5F, -7.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[46].setRotationPoint(5F, 4F, -7.25F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[47].setRotationPoint(4.5F, 5.5F, -7.75F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[48].setRotationPoint(5F, 3.5F, -7.75F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 95
		bodyModel[49].setRotationPoint(8.5F, 4F, -7.75F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[50].setRotationPoint(-9.5F, 4F, -7.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 83
		bodyModel[51].setRotationPoint(8.5F, 4F, 6.75F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 84
		bodyModel[52].setRotationPoint(-9.5F, 4F, 6.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[53].setRotationPoint(-10F, 8F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[54].setRotationPoint(-10F, 8F, -7F);
	}
}