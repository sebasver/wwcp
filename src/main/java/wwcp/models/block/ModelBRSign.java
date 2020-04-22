//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.10.2019 - 18:02:45
// Last changed on: 03.10.2019 - 18:02:45

package wwcp.models.block; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBRSign extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBRSign() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[7];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 24
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 25
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 26
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 27
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28

		bodyModel[0].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[0].setRotationPoint(-3.5F, -10.5F, -8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[1].setRotationPoint(-6.5F, -9.5F, -8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[2].setRotationPoint(3.5F, -9.5F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[3].setRotationPoint(3.5F, -10.5F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[4].setRotationPoint(3.5F, -8.5F, -8.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[5].setRotationPoint(-4.5F, -8.5F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[6].setRotationPoint(-4.5F, -10.5F, -8.5F);
	}
}