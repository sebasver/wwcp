//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.10.2017 - 14:43:42
// Last changed on: 29.10.2017 - 14:43:42

package wwcp.models.TCTemp; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class PropagandaCar extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public PropagandaCar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[18];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 94
		bodyModel[2] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 95
		bodyModel[3] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 133
		bodyModel[4] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 134
		bodyModel[5] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 135
		bodyModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 136
		bodyModel[7] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 133
		bodyModel[8] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 134
		bodyModel[9] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 135
		bodyModel[10] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 136
		bodyModel[11] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 83
		bodyModel[12] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 86
		bodyModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 87
		bodyModel[14] = new ModelRendererTurbo(this, 1, 66, textureX, textureY); // Box 89
		bodyModel[15] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 90
		bodyModel[16] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 91
		bodyModel[17] = new ModelRendererTurbo(this, 1, 157, textureX, textureY); // Box 74

		bodyModel[0].addBox(0F, 0F, 0F, 112, 2, 22, 0F); // Box 2
		bodyModel[0].setRotationPoint(-48F, 0F, -12F);

		bodyModel[1].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 94
		bodyModel[1].setRotationPoint(-53F, 0F, -1.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 5, 2, 2, 0F); // Box 95
		bodyModel[2].setRotationPoint(64F, 0F, -1.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 133
		bodyModel[3].setRotationPoint(64F, 0.5F, 6.5F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		bodyModel[4].setRotationPoint(64F, 0.5F, -8.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 135
		bodyModel[5].setRotationPoint(65F, -0.5F, -9.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 136
		bodyModel[6].setRotationPoint(65F, -0.5F, 5.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 133
		bodyModel[7].setRotationPoint(-49F, 0.5F, -8.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 134
		bodyModel[8].setRotationPoint(-49F, 0.5F, 6.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 135
		bodyModel[9].setRotationPoint(-50F, -0.5F, 5.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 3, 3, 0F); // Box 136
		bodyModel[10].setRotationPoint(-50F, -0.5F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 5, 22, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[11].setRotationPoint(-28F, -5F, -12F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 5, 22, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[12].setRotationPoint(42F, -5F, -12F);

		bodyModel[13].addBox(0F, 0F, 0F, 72, 30, 2, 0F); // Box 87
		bodyModel[13].setRotationPoint(-28F, -35F, -2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 216, 90, 0, 0F,0F, 0F, 0F, -144F, 0F, 0F, -144F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, -144F, -60F, 0F, -144F, -60F, 0F, 0F, -60F, 0F); // Box 89
		bodyModel[14].setRotationPoint(-28F, -35F, 0.05F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 22, 5, 2, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[15].setRotationPoint(32F, -5F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 22, 5, 2, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[16].setRotationPoint(-38F, -5F, -2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 216, 90, 0, 0F,0F, 0F, 0F, -144F, 0F, 0F, -144F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, -144F, -60F, 0F, -144F, -60F, 0F, 0F, -60F, 0F); // Box 74
		bodyModel[17].setRotationPoint(-28F, -35F, -2.05F);
	}
}