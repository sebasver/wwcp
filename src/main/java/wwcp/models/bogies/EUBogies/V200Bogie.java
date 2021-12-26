//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 31.10.2021 - 16:15:52
// Last changed on: 31.10.2021 - 16:15:52

package wwcp.models.bogies.EUBogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class V200Bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public V200Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[37];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 38
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 398
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 68
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 77
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 97
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 105
		bodyModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 107
		bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 109
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 116
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 77
		bodyModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 63
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 77
		bodyModel[13] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 77
		bodyModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 63
		bodyModel[15] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 63
		bodyModel[16] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 63
		bodyModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 47
		bodyModel[18] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 77
		bodyModel[19] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 77
		bodyModel[20] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 77
		bodyModel[21] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 77
		bodyModel[22] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 63
		bodyModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 63
		bodyModel[24] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 63
		bodyModel[25] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 63
		bodyModel[26] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 63
		bodyModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 63
		bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 63
		bodyModel[29] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 63
		bodyModel[30] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 63
		bodyModel[31] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 63
		bodyModel[32] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 63
		bodyModel[33] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 63
		bodyModel[36] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 63

		bodyModel[0].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 47
		bodyModel[0].setRotationPoint(11.5F, 6F, -7F);

		bodyModel[1].addBox(-4.5F, -4.5F, 0F, 9, 8, 0, 0F); // Box 38
		bodyModel[1].setRotationPoint(11.5F, 6.5F, -5.95F);

		bodyModel[2].addBox(-0.5F, -0.5F, 0F, 7, 2, 4, 0F); // Box 398
		bodyModel[2].setRotationPoint(-3F, 2F, -2F);

		bodyModel[3].addBox(-4.5F, -4.5F, 0F, 9, 8, 0, 0F); // Box 68
		bodyModel[3].setRotationPoint(-11F, 6.5F, -5.95F);

		bodyModel[4].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 77
		bodyModel[4].setRotationPoint(9.5F, 6F, 5.5F);

		bodyModel[5].addBox(-4.5F, -4.5F, 0F, 9, 8, 0, 0F); // Box 97
		bodyModel[5].setRotationPoint(-11F, 6.5F, 5.95F);

		bodyModel[6].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 105
		bodyModel[6].setRotationPoint(10F, 5F, 4.9F);

		bodyModel[7].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 107
		bodyModel[7].setRotationPoint(-11F, 5F, -5.9F);

		bodyModel[8].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 109
		bodyModel[8].setRotationPoint(-11F, 5F, 4.9F);

		bodyModel[9].addBox(-4.5F, -4.5F, 0F, 9, 8, 0, 0F); // Box 116
		bodyModel[9].setRotationPoint(11.5F, 6.5F, 5.95F);

		bodyModel[10].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F,-1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		bodyModel[10].setRotationPoint(9.5F, 5F, 5.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F); // Box 63
		bodyModel[11].setRotationPoint(15.5F, 6F, 4.5F);

		bodyModel[12].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 77
		bodyModel[12].setRotationPoint(9.5F, 6F, -6.5F);

		bodyModel[13].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F,-1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		bodyModel[13].setRotationPoint(9.5F, 5F, -6.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[14].setRotationPoint(5.5F, 3F, -5.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F); // Box 63
		bodyModel[15].setRotationPoint(15.5F, 6F, -5.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[16].setRotationPoint(-18.5F, 6F, 4.5F);

		bodyModel[17].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 47
		bodyModel[17].setRotationPoint(-11F, 6F, -7F);

		bodyModel[18].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 77
		bodyModel[18].setRotationPoint(-13F, 6F, 5.5F);

		bodyModel[19].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F,-1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		bodyModel[19].setRotationPoint(-13F, 5F, 5.5F);

		bodyModel[20].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 77
		bodyModel[20].setRotationPoint(-13F, 6F, -6.5F);

		bodyModel[21].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F,-1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		bodyModel[21].setRotationPoint(-13F, 5F, -6.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[22].setRotationPoint(-18.5F, 3F, 4.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[23].setRotationPoint(-18.5F, 6F, -5.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 13, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[24].setRotationPoint(-18.5F, 3F, -5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[25].setRotationPoint(-5.5F, 3F, 4.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[26].setRotationPoint(-5.5F, 3F, -5.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[27].setRotationPoint(1.5F, 3F, 4.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[28].setRotationPoint(1.5F, 3F, -5.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[29].setRotationPoint(5.5F, 3F, 4.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 3, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[30].setRotationPoint(-1.5F, 3F, -5.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 63
		bodyModel[31].setRotationPoint(-13.5F, 6F, -5.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 29, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 63
		bodyModel[32].setRotationPoint(-13.5F, 6F, 4.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[33].setRotationPoint(-18.5F, 3F, -4.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[34].setRotationPoint(19.5F, 3F, -4.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[35].setRotationPoint(5.5F, 3F, -4.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[36].setRotationPoint(-6.5F, 3F, -4.5F);
	}
}