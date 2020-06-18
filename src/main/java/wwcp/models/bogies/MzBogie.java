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

public class MzBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public MzBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[38];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 88
		bodyModel[2] = new ModelRendererTurbo(this, 65, 11, textureX, textureY); // Box 91
		bodyModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 92
		bodyModel[4] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 93
		bodyModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 126
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 17
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 28
		bodyModel[15] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 93
		bodyModel[17] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 112
		bodyModel[18] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 33
		bodyModel[19] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 22
		bodyModel[24] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 22
		bodyModel[25] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 22
		bodyModel[26] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 24
		bodyModel[27] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 22
		bodyModel[32] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 22
		bodyModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[34] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 22
		bodyModel[35] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 22
		bodyModel[36] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 73
		bodyModel[37] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 88

		bodyModel[0].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[0].setRotationPoint(-13F, 4F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[1].setRotationPoint(-22F, 4F, 0F);

		bodyModel[2].addBox(0F, 0F, -5F, 37, 7, 10, 0F); // Box 91
		bodyModel[2].setRotationPoint(-18.25F, 1F, 0F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 3, 16, 0F); // Box 92
		bodyModel[3].setRotationPoint(14.75F, 4.5F, -8F);

		bodyModel[4].addBox(0F, 0F, -8F, 3, 3, 16, 0F); // Box 93
		bodyModel[4].setRotationPoint(-1.75F, 4.5F, 0F);

		bodyModel[5].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 126
		bodyModel[5].setRotationPoint(12.25F, 2F, 5.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 17
		bodyModel[6].setRotationPoint(12.5F, 2F, -5.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 18
		bodyModel[7].setRotationPoint(-4.25F, 2F, -5.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 19
		bodyModel[8].setRotationPoint(-4.25F, 2F, 5.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 20
		bodyModel[9].setRotationPoint(-20.75F, 2F, -5.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 21
		bodyModel[10].setRotationPoint(-20.75F, 2F, 5.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(-21.75F, 0.5F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[12].setRotationPoint(-19.25F, 3.5F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[13].setRotationPoint(-2.75F, 3.5F, -7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[14].setRotationPoint(13.75F, 3.5F, -7.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[15].setRotationPoint(-11.25F, 3F, -8F);

		bodyModel[16].addBox(0F, 0F, -8F, 3, 3, 16, 0F); // Box 93
		bodyModel[16].setRotationPoint(-18.25F, 4.5F, 0F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 112
		bodyModel[17].setRotationPoint(-2F, 0F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[18].setRotationPoint(4.75F, 3F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 45, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-22.75F, 2.5F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-20.75F, 6.5F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-5.25F, 0.5F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-4.25F, 6.5F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[23].setRotationPoint(11.25F, 0.5F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[24].setRotationPoint(12.25F, 6.5F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[25].setRotationPoint(-21.75F, 0.5F, 6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[26].setRotationPoint(-19.25F, 3.5F, 6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[27].setRotationPoint(-2.75F, 3.5F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[28].setRotationPoint(13.75F, 3.5F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 33
		bodyModel[29].setRotationPoint(-11.25F, 3F, 7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 33
		bodyModel[30].setRotationPoint(5.75F, 3F, 7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 45, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[31].setRotationPoint(-22.75F, 2.5F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[32].setRotationPoint(-20.75F, 6.5F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[33].setRotationPoint(-5.25F, 0.5F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[34].setRotationPoint(-4.25F, 6.5F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[35].setRotationPoint(12.25F, 6.5F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[36].setRotationPoint(11.25F, 0.5F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[37].setRotationPoint(21F, 4F, 0F);
	}
}