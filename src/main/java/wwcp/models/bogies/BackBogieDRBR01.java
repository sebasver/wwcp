//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.01.2019 - 21:10:01
// Last changed on: 28.01.2019 - 21:10:01

package wwcp.models.bogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class BackBogieDRBR01 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public BackBogieDRBR01() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];

		initbodyModel_1();

		this.fixRotation(this.bodyModel, false, true, true);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 6
		bodyModel[1] = new ModelRendererTurbo(this, 49, 45, textureX, textureY); // Box 127
		bodyModel[2] = new ModelRendererTurbo(this, 73, 45, textureX, textureY); // Box 127
		bodyModel[3] = new ModelRendererTurbo(this, 33, 45, textureX, textureY); // Box 127
		bodyModel[4] = new ModelRendererTurbo(this, 97, 45, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 137, 45, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 177, 45, textureX, textureY); // Box 397
		bodyModel[7] = new ModelRendererTurbo(this, 209, 45, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 241, 45, textureX, textureY); // Box 6
		bodyModel[9] = new ModelRendererTurbo(this, 265, 45, textureX, textureY); // Box 6
		bodyModel[10] = new ModelRendererTurbo(this, 305, 45, textureX, textureY); // Box 406
		bodyModel[11] = new ModelRendererTurbo(this, 233, 45, textureX, textureY); // Box 6

		bodyModel[0].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[0].setRotationPoint(-10F, 3F, -3F);

		bodyModel[1].addShapeBox(-4F, -4F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[1].setRotationPoint(6F, 5.5F, -6F);
		bodyModel[1].rotateAngleZ = 1.57079633F;

		bodyModel[2].addShapeBox(-4F, -4F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[2].setRotationPoint(6F, 5.5F, 6F);
		bodyModel[2].rotateAngleZ = 1.57079633F;

		bodyModel[3].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F,0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 127
		bodyModel[3].setRotationPoint(6F, 5.5F, -6F);
		bodyModel[3].rotateAngleZ = 1.57079633F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -0.5F); // Box 6
		bodyModel[4].setRotationPoint(-10F, 5F, -3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-10F, 3F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 397
		bodyModel[6].setRotationPoint(-10F, 3F, 3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[7].setRotationPoint(5F, 3F, -5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -2F); // Box 6
		bodyModel[8].setRotationPoint(5F, 5F, -5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, -1F, 0.5F); // Box 6
		bodyModel[9].setRotationPoint(-10F, 5F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -1F, -2.5F); // Box 406
		bodyModel[10].setRotationPoint(-10F, 5F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[11].setRotationPoint(-11F, 2F, -1F);
	}
}