//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.11.2021 - 15:32:40
// Last changed on: 15.11.2021 - 15:32:40

package wwcp.models.bogies.EUBogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class TEEBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public TEEBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[13];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 201
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 26
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 75
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 76
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 87
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 88
		bodyModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 77
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 12

		bodyModel[0].addBox(0F, 0F, 0F, 9, 2, 4, 0F); // Box 201
		bodyModel[0].setRotationPoint(-4.5F, 2F, -2F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[1].setRotationPoint(10F, 6F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 27
		bodyModel[2].setRotationPoint(-11F, 6F, -7F);

		bodyModel[3].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 75
		bodyModel[3].setRotationPoint(-10.5F, 6.5F, 5.95F);

		bodyModel[4].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 76
		bodyModel[4].setRotationPoint(10.5F, 6.5F, 5.95F);

		bodyModel[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 87
		bodyModel[5].setRotationPoint(-10.5F, 6.5F, -5.95F);

		bodyModel[6].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 88
		bodyModel[6].setRotationPoint(10.5F, 6.5F, -5.95F);

		bodyModel[7].addBox(0F, 0F, 0F, 29, 2, 4, 0F); // Box 7
		bodyModel[7].setRotationPoint(-14.5F, 4F, 1F);

		bodyModel[8].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 77
		bodyModel[8].setRotationPoint(8.5F, 5.75F, 5.5F);

		bodyModel[9].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-12.5F, 5.75F, 5.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 29, 2, 4, 0F); // Box 10
		bodyModel[10].setRotationPoint(-14.5F, 4F, -5F);

		bodyModel[11].addBox(0F, 0F, 0F, 13, 4, 2, 0F); // Box 11
		bodyModel[11].setRotationPoint(-6.5F, 4F, 5F);

		bodyModel[12].addBox(0F, 0F, 0F, 13, 4, 2, 0F); // Box 12
		bodyModel[12].setRotationPoint(-6.5F, 4F, -7F);
	}
}