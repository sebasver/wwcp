//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Borderplatform
// Model Creator: 
// Created on: 21.05.2019 - 19:20:43
// Last changed on: 21.05.2019 - 19:20:43

package wwcp.blocks;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BlockCenterPlatformSlope extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public BlockCenterPlatformSlope() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);



	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 1

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 6, 16, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-8F, -6F, -8F);
	}
}