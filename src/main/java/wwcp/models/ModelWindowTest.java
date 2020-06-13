//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.05.2020 - 14:56:10
// Last changed on: 23.05.2020 - 14:56:10

package wwcp.models; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelWindowTest extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelWindowTest() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[14];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 442
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 444
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 445
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 446
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 442
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 442
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 442
		bodyModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 442
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 442
		bodyModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 1119
		bodyModel[10] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 1119
		bodyModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1119
		bodyModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 1119
		bodyModel[13] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 1119

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -1.2F, 0F, -0.85F, -1.2F, 0F, -0.85F, -1.2F, -0.65F, 0F, -1.2F, -0.65F); // Box 442
		bodyModel[0].setRotationPoint(4.5F, -10.6F, 11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.65F, 0F, -0.25F, -0.65F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -0.75F, -0.65F, 0F, -0.75F, -0.65F); // Box 444
		bodyModel[1].setRotationPoint(-3.5F, -10.85F, 11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.65F, 0F, 0.1F, -0.65F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, -1.1F, -0.65F, 0F, -1.1F, -0.65F); // Box 445
		bodyModel[2].setRotationPoint(-3.5F, -4.7F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 7, 1, 0F,0F, -0.725F, -0.85F, -4F, -0.725F, -0.85F, -4F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.425F, -0.85F, -4F, -0.425F, -0.85F, -4F, -0.45F, 0F, 0F, -0.45F, 0F); // Box 446
		bodyModel[3].setRotationPoint(-3.5F, -11.35F, 11.35F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.9F, -0.85F, 0F, -0.9F, -0.85F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.9F, -0.85F, -0.75F, -0.9F, -0.85F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 442
		bodyModel[4].setRotationPoint(4.5F, -10.85F, 10.1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.9F, -0.85F, 0F, -0.9F, -0.85F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.9F, -0.85F, -0.75F, -0.9F, -0.85F, -1F, -0.75F, 0F, -1F, -0.75F); // Box 442
		bodyModel[5].setRotationPoint(4.5F, -4.8F, 10.1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, -1.2F, 0F, -0.85F, -1.2F, 0F, -0.85F, -1.2F, -0.65F, 0F, -1.2F, -0.65F); // Box 442
		bodyModel[6].setRotationPoint(-3.65F, -10.6F, 11F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.9F, -0.85F, 0F, -0.9F, -0.85F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.9F, -0.85F, -0.75F, -0.9F, -0.85F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 442
		bodyModel[7].setRotationPoint(-3.65F, -10.85F, 10.1F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -0.9F, -0.85F, 0F, -0.9F, -0.85F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.9F, -0.85F, -0.75F, -0.9F, -0.85F, -1F, -0.75F, 0F, -1F, -0.75F); // Box 442
		bodyModel[8].setRotationPoint(-3.65F, -4.8F, 10.1F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 1119
		bodyModel[9].setRotationPoint(-9.5F, -13.7F, 10.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 19, 11, 1, 0F,-0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.45F, 0F, 0F, -0.45F, -0.3F, 0F, -0.5F, -0.3F, -0.75F, -0.5F, -0.3F, -0.75F); // Box 1119
		bodyModel[10].setRotationPoint(-9.5F, -4.7F, 10.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 1119
		bodyModel[11].setRotationPoint(-9.5F, -10.7F, 10.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, 0F, 0F, -0.45F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 1119
		bodyModel[12].setRotationPoint(4.5F, -10.7F, 10.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1119
		bodyModel[13].setRotationPoint(-3.5F, -10.7F, -6.25F);
	}
}