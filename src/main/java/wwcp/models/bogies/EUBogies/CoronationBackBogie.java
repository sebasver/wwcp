//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.12.2018 - 16:49:04
// Last changed on: 15.12.2018 - 16:49:04

package wwcp.models.bogies.EUBogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class CoronationBackBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public CoronationBackBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[32];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 38
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 43
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 338
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 339
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 340
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 341
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 342
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 345
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 346
		bodyModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 347
		bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 348
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 349
		bodyModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 350
		bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 351
		bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 352
		bodyModel[16] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 353
		bodyModel[17] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 354
		bodyModel[18] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 355
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 356
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 357
		bodyModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 358
		bodyModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 359
		bodyModel[23] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 360
		bodyModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 361
		bodyModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 362
		bodyModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 363
		bodyModel[27] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 366
		bodyModel[28] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 367
		bodyModel[29] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 369
		bodyModel[30] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 370
		bodyModel[31] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 372

		bodyModel[0].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 10
		bodyModel[0].setRotationPoint(0F, 5.5F, 6F);

		bodyModel[1].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 38
		bodyModel[1].setRotationPoint(0F, 5.5F, -6F);

		bodyModel[2].addBox(-0.5F, -0.5F, 0F, 1, 1, 14, 0F); // Box 43
		bodyModel[2].setRotationPoint(0F, 5.5F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 338
		bodyModel[3].setRotationPoint(-5.5F, 3F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 339
		bodyModel[4].setRotationPoint(4.5F, 3F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 340
		bodyModel[5].setRotationPoint(3.5F, 7F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[6].setRotationPoint(-4.5F, 7F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 342
		bodyModel[7].setRotationPoint(-4.5F, 2F, -8F);

		bodyModel[8].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 345
		bodyModel[8].setRotationPoint(-2.5F, 7F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F); // Box 346
		bodyModel[9].setRotationPoint(-1.5F, 4F, -9F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 347
		bodyModel[10].setRotationPoint(-0.5F, 2F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 348
		bodyModel[11].setRotationPoint(4.5F, 2F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 349
		bodyModel[12].setRotationPoint(-5.5F, 2F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[13].setRotationPoint(0.5F, 2F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 351
		bodyModel[14].setRotationPoint(-3.5F, 2F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Box 352
		bodyModel[15].setRotationPoint(4.5F, 3F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[16].setRotationPoint(4.5F, 2F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 354
		bodyModel[17].setRotationPoint(-4.5F, 2F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 355
		bodyModel[18].setRotationPoint(3.5F, 7F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[19].setRotationPoint(-5.5F, 2F, 7F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 357
		bodyModel[20].setRotationPoint(-5.5F, 3F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[21].setRotationPoint(-4.5F, 7F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[22].setRotationPoint(-1.5F, 4F, 8F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 360
		bodyModel[23].setRotationPoint(-0.5F, 2F, 8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[24].setRotationPoint(-3.5F, 2F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[25].setRotationPoint(0.5F, 2F, 8F);

		bodyModel[26].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 363
		bodyModel[26].setRotationPoint(-2.5F, 7F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 366
		bodyModel[27].setRotationPoint(-9.5F, 3F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 367
		bodyModel[28].setRotationPoint(-9.5F, 3F, 4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 5, 14, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 369
		bodyModel[29].setRotationPoint(-9.5F, 3F, -7F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 6, 4, 0F); // Box 370
		bodyModel[30].setRotationPoint(-9.5F, -3F, -2F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 5, 14, 0F); // Box 372
		bodyModel[31].setRotationPoint(5.5F, 3F, -7F);
	}
}