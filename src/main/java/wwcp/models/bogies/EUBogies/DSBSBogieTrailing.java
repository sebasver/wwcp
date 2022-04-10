//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.06.2021 - 22:19:10
// Last changed on: 17.06.2021 - 22:19:10

package wwcp.models.bogies.EUBogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class DSBSBogieTrailing extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public DSBSBogieTrailing() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-10.5F, 5F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-11F, 2.5F, -5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-13.5F, 2F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-13.5F, 2F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(4.5F, 2F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(4.5F, 2F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-2F, 1.5F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(7.5F, 5F, -6F);
	}
}