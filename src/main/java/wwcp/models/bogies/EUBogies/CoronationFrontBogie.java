//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.12.2018 - 16:46:10
// Last changed on: 15.12.2018 - 16:46:10

package wwcp.models.bogies.EUBogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class CoronationFrontBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public CoronationFrontBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[11];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 39
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 42
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 227
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 228
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 229
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 256
		bodyModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 257
		bodyModel[8] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 258
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 259
		bodyModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 260

		bodyModel[0].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[0].setRotationPoint(8.5F, 6.5F, 6F);

		bodyModel[1].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[1].setRotationPoint(8.5F, 6.5F, -6F);

		bodyModel[2].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 42
		bodyModel[2].setRotationPoint(8.5F, 6.5F, -6F);

		bodyModel[3].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 227
		bodyModel[3].setRotationPoint(-9.5F, 6.5F, 6F);

		bodyModel[4].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 228
		bodyModel[4].setRotationPoint(-9.5F, 6.5F, -6F);

		bodyModel[5].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 229
		bodyModel[5].setRotationPoint(-9.5F, 6.5F, -6F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 3, 10, 0F); // Box 256
		bodyModel[6].setRotationPoint(-12F, 4F, -5F);

		bodyModel[7].addBox(0F, 0F, 0F, 7, 3, 10, 0F); // Box 257
		bodyModel[7].setRotationPoint(-4F, 5F, -5F);

		bodyModel[8].addBox(0F, 0F, 0F, 6, 3, 10, 0F); // Box 258
		bodyModel[8].setRotationPoint(5F, 4F, -5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 259
		bodyModel[9].setRotationPoint(3F, 4F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 3, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[10].setRotationPoint(-6F, 4F, -5F);
	}
}