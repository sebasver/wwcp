//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.11.2017 - 19:11:37
// Last changed on: 15.11.2017 - 19:11:37

package wwcp.models.bogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class MZClassBogie extends ModelBase//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public MZClassBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[25];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 88
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 91
		bodyModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 92
		bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 93
		bodyModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 94
		bodyModel[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 119
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 126
		bodyModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 112
		bodyModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 18
		bodyModel[11] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 28
		bodyModel[20] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 30
		bodyModel[22] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 31
		bodyModel[23] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 32
		bodyModel[24] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 33

		bodyModel[0].addBox(0F, 0F, -6F, 1, 1, 12, 0F); // Box 87
		bodyModel[0].setRotationPoint(18.75F, 3.5F, 0F);

		bodyModel[1].addBox(0F, 0F, -6F, 1, 1, 12, 0F); // Box 88
		bodyModel[1].setRotationPoint(-18.25F, 3.5F, 0F);

		bodyModel[2].addBox(0F, 0F, -5F, 32, 5, 10, 0F); // Box 91
		bodyModel[2].setRotationPoint(-15.5F, 3F, 0F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Box 92
		bodyModel[3].setRotationPoint(13.5F, 5.5F, -8F);

		bodyModel[4].addBox(0F, 0F, -8F, 2, 2, 16, 0F); // Box 93
		bodyModel[4].setRotationPoint(-0.5F, 5.5F, 0F);

		bodyModel[5].addBox(0F, 0F, -8F, 2, 2, 16, 0F); // Box 94
		bodyModel[5].setRotationPoint(-14.5F, 5.5F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 39, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 119
		bodyModel[6].setRotationPoint(-18.8F, 3.5F, 6F);

		bodyModel[7].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 126
		bodyModel[7].setRotationPoint(11.25F, 3F, 6F);

		bodyModel[8].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 112
		bodyModel[8].setRotationPoint(-1.5F, 2F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 17
		bodyModel[9].setRotationPoint(11.25F, 3F, -6F);

		bodyModel[10].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 18
		bodyModel[10].setRotationPoint(-3F, 3F, -6F);

		bodyModel[11].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 19
		bodyModel[11].setRotationPoint(-3F, 3F, 6F);

		bodyModel[12].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 20
		bodyModel[12].setRotationPoint(-17F, 3F, -6F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 21
		bodyModel[13].setRotationPoint(-17F, 3F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 39, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 22
		bodyModel[14].setRotationPoint(-18.8F, 3.5F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[15].setRotationPoint(-15.5F, 4.5F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[16].setRotationPoint(-15.5F, 4.5F, 6.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[17].setRotationPoint(-1.5F, 4.5F, 6.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[18].setRotationPoint(-1.5F, 4.5F, -7.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[19].setRotationPoint(12.5F, 4.5F, -7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[20].setRotationPoint(12.5F, 4.5F, 6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[21].setRotationPoint(4.5F, 5.5F, 6.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[22].setRotationPoint(-6.5F, 5.5F, 6.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[23].setRotationPoint(4.5F, 5.5F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[24].setRotationPoint(-6.5F, 5.5F, -8F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}