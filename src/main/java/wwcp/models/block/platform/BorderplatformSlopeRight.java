//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BlockBorderPlatform
// Model Creator: 
// Created on: 16.12.2019 - 20:34:25
// Last changed on: 16.12.2019 - 20:34:25

package wwcp.models.block.platform; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BorderplatformSlopeRight extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public BorderplatformSlopeRight() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 3, textureX, textureY); // Box 6

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 6, 10, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[0].setRotationPoint(-8F, -6F, -2F);
	}
}