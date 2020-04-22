//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: -
// Last changed on: -

package wwcp.models; //Path where the model is located

import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class LampTest extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public LampTest() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY, StaticModelAnimator.tagLamp(0,5)); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY, StaticModelAnimator.tagLamp(0,5)); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, -4F, 0F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 1
		bodyModel[1].setRotationPoint(1F, -2F, -10F);
	}
}