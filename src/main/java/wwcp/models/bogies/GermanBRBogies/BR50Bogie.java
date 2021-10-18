//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.10.2020 - 20:35:53
// Last changed on: 15.10.2020 - 20:35:53

package wwcp.models.bogies.GermanBRBogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BR50Bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public BR50Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 127
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 28
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 296
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 338

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 16
		bodyModel[0].setRotationPoint(-2F, 5F, -2F);

		bodyModel[1].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[1].setRotationPoint(-7.5F, 6.5F, 6F);

		bodyModel[2].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[2].setRotationPoint(-7.5F, 6.5F, -6F);

		bodyModel[3].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 127
		bodyModel[3].setRotationPoint(-7.5F, 6.5F, -6F);
		bodyModel[3].rotateAngleZ = 1.57079633F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[4].setRotationPoint(-1.5F, 3F, -1F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 16
		bodyModel[5].setRotationPoint(-8.5F, 5.5F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,-0.5F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, -0.5F, -0.05F, -0.5F, 0.5F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0.5F, -0.05F); // Box 16
		bodyModel[6].setRotationPoint(-7F, 5F, -2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[7].setRotationPoint(-8F, 1.5F, 4.25F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F); // Box 338
		bodyModel[8].setRotationPoint(-8F, 1.5F, -5.25F);
	}
}