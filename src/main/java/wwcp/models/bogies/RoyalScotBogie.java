//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.11.2022 - 14:19:48
// Last changed on: 24.11.2022 - 14:19:48

package wwcp.models.bogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class RoyalScotBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public RoyalScotBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[22];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 367
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 369
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 370
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 371
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 24

		bodyModel[0].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 367
		bodyModel[0].setRotationPoint(8F, 6.5F, -6.01F);

		bodyModel[1].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 369
		bodyModel[1].setRotationPoint(-8F, 6.5F, -6.01F);

		bodyModel[2].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 370
		bodyModel[2].setRotationPoint(8F, 6.5F, 6.01F);

		bodyModel[3].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 371
		bodyModel[3].setRotationPoint(-8F, 6.5F, 6.01F);

		bodyModel[4].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 4
		bodyModel[4].setRotationPoint(-8F, 6.5F, -6F);

		bodyModel[5].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 5
		bodyModel[5].setRotationPoint(8F, 6.5F, -6F);

		bodyModel[6].addShapeBox(-0.5F, -0.5F, 0F, 2, 3, 10, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(-7F, 3.5F, -5F);

		bodyModel[7].addBox(-0.5F, -0.5F, 0F, 21, 2, 10, 0F); // Box 10
		bodyModel[7].setRotationPoint(-10F, 6.5F, -5F);

		bodyModel[8].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[8].setRotationPoint(-3F, 8.5F, -5F);

		bodyModel[9].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[9].setRotationPoint(3F, 8.5F, -5F);

		bodyModel[10].addBox(-0.5F, -0.5F, 0F, 5, 2, 2, 0F); // Box 13
		bodyModel[10].setRotationPoint(-2F, 7.5F, -7F);

		bodyModel[11].addBox(-0.5F, -0.5F, 0F, 5, 2, 2, 0F); // Box 14
		bodyModel[11].setRotationPoint(-2F, 7.5F, 5F);

		bodyModel[12].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[12].setRotationPoint(-11F, 3.5F, -5F);

		bodyModel[13].addBox(-0.5F, -0.5F, 0F, 3, 3, 10, 0F); // Box 16
		bodyModel[13].setRotationPoint(-10F, 3.5F, -5F);

		bodyModel[14].addShapeBox(-0.5F, -0.5F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-11F, 6.5F, -5F);

		bodyModel[15].addBox(-0.5F, -0.5F, 0F, 1, 2, 10, 0F); // Box 18
		bodyModel[15].setRotationPoint(-11F, 4.5F, -5F);

		bodyModel[16].addBox(-0.5F, -0.5F, 0F, 3, 3, 10, 0F); // Box 19
		bodyModel[16].setRotationPoint(8F, 3.5F, -5F);

		bodyModel[17].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[17].setRotationPoint(11F, 3.5F, -5F);

		bodyModel[18].addShapeBox(-0.5F, -0.5F, 0F, 2, 3, 10, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[18].setRotationPoint(6F, 3.5F, -5F);

		bodyModel[19].addBox(-0.5F, -0.5F, 0F, 1, 2, 10, 0F); // Box 22
		bodyModel[19].setRotationPoint(11F, 4.5F, -5F);

		bodyModel[20].addShapeBox(-0.5F, -0.5F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(11F, 6.5F, -5F);

		bodyModel[21].addBox(-0.5F, -0.5F, 0F, 5, 1, 10, 0F); // Box 24
		bodyModel[21].setRotationPoint(-2F, 8.5F, -5F);
	}
}