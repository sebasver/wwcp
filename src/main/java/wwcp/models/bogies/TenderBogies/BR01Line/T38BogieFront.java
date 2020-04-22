//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.01.2019 - 21:17:44
// Last changed on: 28.01.2019 - 21:17:44

package wwcp.models.bogies.TenderBogies.BR01Line; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class T38BogieFront extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public T38BogieFront() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[44];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Box 16
		bodyModel[1] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Box 28
		bodyModel[2] = new ModelRendererTurbo(this, 33, 39, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 25, 39, textureX, textureY); // Box 31
		bodyModel[4] = new ModelRendererTurbo(this, 57, 39, textureX, textureY); // Box 33
		bodyModel[5] = new ModelRendererTurbo(this, 73, 39, textureX, textureY); // Box 35
		bodyModel[6] = new ModelRendererTurbo(this, 89, 39, textureX, textureY); // Box 34
		bodyModel[7] = new ModelRendererTurbo(this, 105, 39, textureX, textureY); // Box 30
		bodyModel[8] = new ModelRendererTurbo(this, 121, 39, textureX, textureY); // Box 30
		bodyModel[9] = new ModelRendererTurbo(this, 137, 39, textureX, textureY); // Box 64
		bodyModel[10] = new ModelRendererTurbo(this, 153, 39, textureX, textureY); // Box 67
		bodyModel[11] = new ModelRendererTurbo(this, 169, 39, textureX, textureY); // Box 64
		bodyModel[12] = new ModelRendererTurbo(this, 185, 39, textureX, textureY); // Box 64
		bodyModel[13] = new ModelRendererTurbo(this, 217, 39, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 241, 39, textureX, textureY); // Box 64
		bodyModel[15] = new ModelRendererTurbo(this, 249, 39, textureX, textureY); // Box 64
		bodyModel[16] = new ModelRendererTurbo(this, 257, 39, textureX, textureY); // Box 69
		bodyModel[17] = new ModelRendererTurbo(this, 265, 39, textureX, textureY); // Box 70
		bodyModel[18] = new ModelRendererTurbo(this, 265, 39, textureX, textureY); // Box 64
		bodyModel[19] = new ModelRendererTurbo(this, 281, 39, textureX, textureY); // Box 64
		bodyModel[20] = new ModelRendererTurbo(this, 289, 39, textureX, textureY); // Box 64
		bodyModel[21] = new ModelRendererTurbo(this, 297, 39, textureX, textureY); // Box 67
		bodyModel[22] = new ModelRendererTurbo(this, 305, 39, textureX, textureY); // Box 68
		bodyModel[23] = new ModelRendererTurbo(this, 305, 39, textureX, textureY); // Box 64
		bodyModel[24] = new ModelRendererTurbo(this, 41, 39, textureX, textureY); // Box 75
		bodyModel[25] = new ModelRendererTurbo(this, 321, 39, textureX, textureY); // Box 76
		bodyModel[26] = new ModelRendererTurbo(this, 329, 39, textureX, textureY); // Box 77
		bodyModel[27] = new ModelRendererTurbo(this, 337, 39, textureX, textureY); // Box 78
		bodyModel[28] = new ModelRendererTurbo(this, 345, 39, textureX, textureY); // Box 79
		bodyModel[29] = new ModelRendererTurbo(this, 353, 39, textureX, textureY); // Box 80
		bodyModel[30] = new ModelRendererTurbo(this, 361, 39, textureX, textureY); // Box 47
		bodyModel[31] = new ModelRendererTurbo(this, 369, 39, textureX, textureY); // Box 48
		bodyModel[32] = new ModelRendererTurbo(this, 377, 39, textureX, textureY); // Box 49
		bodyModel[33] = new ModelRendererTurbo(this, 385, 39, textureX, textureY); // Box 50
		bodyModel[34] = new ModelRendererTurbo(this, 393, 39, textureX, textureY); // Box 51
		bodyModel[35] = new ModelRendererTurbo(this, 401, 39, textureX, textureY); // Box 52
		bodyModel[36] = new ModelRendererTurbo(this, 409, 39, textureX, textureY); // Box 83
		bodyModel[37] = new ModelRendererTurbo(this, 417, 39, textureX, textureY); // Box 84
		bodyModel[38] = new ModelRendererTurbo(this, 425, 39, textureX, textureY); // Box 84
		bodyModel[39] = new ModelRendererTurbo(this, 433, 39, textureX, textureY); // Box 83
		bodyModel[40] = new ModelRendererTurbo(this, 441, 39, textureX, textureY); // Box 57
		bodyModel[41] = new ModelRendererTurbo(this, 449, 39, textureX, textureY); // Box 58
		bodyModel[42] = new ModelRendererTurbo(this, 457, 39, textureX, textureY); // Box 59
		bodyModel[43] = new ModelRendererTurbo(this, 465, 39, textureX, textureY); // Box 60

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[0].setRotationPoint(-6.5F, 6F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[1].setRotationPoint(-0.5F, 3F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[2].setRotationPoint(7.5F, 6F, -7F);

		bodyModel[3].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[3].setRotationPoint(-6F, 6.5F, 5.95F);

		bodyModel[4].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[4].setRotationPoint(-6F, 6.5F, -5.95F);

		bodyModel[5].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[5].setRotationPoint(8F, 6.5F, -5.95F);

		bodyModel[6].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[6].setRotationPoint(8F, 6.5F, 5.95F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[7].setRotationPoint(-8.5F, 3F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[8].setRotationPoint(5.5F, 3F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[9].setRotationPoint(-8.5F, 3F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 67
		bodyModel[10].setRotationPoint(5.5F, 3F, 6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[11].setRotationPoint(-3.5F, 3F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[12].setRotationPoint(-2F, 4F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 5, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[13].setRotationPoint(-3.5F, 3F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[14].setRotationPoint(10.5F, 7F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[15].setRotationPoint(10.5F, 3F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[16].setRotationPoint(10.5F, 7F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[17].setRotationPoint(10.5F, 3F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[18].setRotationPoint(11.5F, 3.5F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -2F, 0F, -0.25F); // Box 64
		bodyModel[19].setRotationPoint(-10.5F, 6F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 64
		bodyModel[20].setRotationPoint(-10.5F, 3F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 67
		bodyModel[21].setRotationPoint(-10.5F, 6F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[22].setRotationPoint(-10.5F, 3F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[23].setRotationPoint(-10.5F, 3.5F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 75
		bodyModel[24].setRotationPoint(-6.5F, 4F, -7.25F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[25].setRotationPoint(-7F, 5.5F, -7.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[26].setRotationPoint(-6.5F, 3.5F, -7.75F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.5F, 3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[27].setRotationPoint(7.5F, 4F, -7.25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[28].setRotationPoint(7F, 5.5F, -7.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[29].setRotationPoint(7.5F, 3.5F, -7.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[30].setRotationPoint(-6.5F, 4F, 6.25F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 48
		bodyModel[31].setRotationPoint(-7F, 5.5F, 6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 49
		bodyModel[32].setRotationPoint(-6.5F, 3.5F, 6.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,3F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[33].setRotationPoint(7.5F, 4F, 6.25F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 51
		bodyModel[34].setRotationPoint(7F, 5.5F, 6.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 52
		bodyModel[35].setRotationPoint(7.5F, 3.5F, 6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 83
		bodyModel[36].setRotationPoint(11F, 4F, 6.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 84
		bodyModel[37].setRotationPoint(-10F, 4F, 6.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 84
		bodyModel[38].setRotationPoint(4F, 4F, 6.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 83
		bodyModel[39].setRotationPoint(-3F, 4F, 6.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 57
		bodyModel[40].setRotationPoint(11F, 4F, -7.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		bodyModel[41].setRotationPoint(-10F, 4F, -7.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 59
		bodyModel[42].setRotationPoint(4F, 4F, -7.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 60
		bodyModel[43].setRotationPoint(-3F, 4F, -7.75F);
	}
}