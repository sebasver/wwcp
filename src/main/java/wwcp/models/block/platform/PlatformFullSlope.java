//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Borderplatform
// Model Creator: 
// Created on: -
// Last changed on: -

package wwcp.models.block.platform; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class PlatformFullSlope extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public PlatformFullSlope() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportImportBox4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 16, 16, 0F,0F, -16F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox4
		bodyModel[0].setRotationPoint(-8F, -16F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 16, 16, 0F,0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(8F, -16F, -8F);
	}
}