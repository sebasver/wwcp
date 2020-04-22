//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.10.2019 - 18:59:21
// Last changed on: 03.10.2019 - 18:59:21

package wwcp.models.block; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelTelegraphstraightDiagonalDown extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTelegraphstraightDiagonalDown() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[11];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 12

		bodyModel[0].addBox(0F, 0F, 0F, 2, 45, 2, 0F); // Box 1
		bodyModel[0].setRotationPoint(-1F, -45F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 2
		bodyModel[1].setRotationPoint(-0.5F, -46F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 3
		bodyModel[2].setRotationPoint(-0.5F, -48F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 4
		bodyModel[3].setRotationPoint(-0.5F, -48F, -0.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 5
		bodyModel[4].setRotationPoint(-0.5F, -48F, 7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 48, 16, 1, 0F,0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-48F, -48.01F, 7F);

		bodyModel[6].addBox(0F, 0F, 0F, 48, 0, 1, 0F); // Box 9
		bodyModel[6].setRotationPoint(0F, -48.01F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 48, 0, 1, 0F); // Box 10
		bodyModel[7].setRotationPoint(0F, -48.01F, -0.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 48, 0, 1, 0F); // Box 11
		bodyModel[8].setRotationPoint(0F, -48.01F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 48, 16, 1, 0F,0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-48F, -48.01F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 48, 16, 1, 0F,0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-48F, -48.01F, -8F);
	}
}