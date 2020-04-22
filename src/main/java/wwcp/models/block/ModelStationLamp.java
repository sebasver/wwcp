//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 03.10.2019 - 17:09:06
// Last changed on: 03.10.2019 - 17:09:06

package wwcp.models.block; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelStationLamp extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelStationLamp() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[22];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Lamp
		bodyModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 20
		bodyModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 21
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 40, 1, 0F,0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 0
		bodyModel[0].setRotationPoint(-0.5F, -40F, -0.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -5F, 0.25F, 0.25F, -5F, 0.25F, 0.25F, -3.5F, -0.5F, 0.25F, -3.5F, -0.5F, 0.25F, 0F, -1.25F, 0.25F, 0F, -1.25F); // Box 1
		bodyModel[1].setRotationPoint(-0.5F, -45F, -4.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-0.5F, -48F, -14.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-0.5F, -47F, -12.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -3F, -0.5F, 0.25F, -3F, -0.5F, 0.25F, -3F, 0F, 0.25F, -3F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(-0.5F, -48F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-3.5F, -45F, -12.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-3.5F, -45F, -15.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[7].setRotationPoint(0.5F, -45F, -15.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 14
		bodyModel[8].setRotationPoint(0.5F, -45F, -11.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 15
		bodyModel[9].setRotationPoint(-3.5F, -45F, -11.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[10].setRotationPoint(0.5F, -45F, -12.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(-0.5F, -45F, -11.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[12].setRotationPoint(-0.5F, -45F, -15.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[13].setRotationPoint(-0.5F, -43F, -12.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[14].setRotationPoint(-3.5F, -30F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[15].setRotationPoint(-6.5F, -29F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[16].setRotationPoint(3.5F, -29F, -2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[17].setRotationPoint(3.5F, -30F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[18].setRotationPoint(3.5F, -28F, -2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[19].setRotationPoint(-4.5F, -28F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[20].setRotationPoint(-4.5F, -30F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 22
		bodyModel[21].setRotationPoint(-0.5F, -11F, -0.5F);
	}
}