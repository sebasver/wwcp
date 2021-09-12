//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.12.2019 - 13:57:53
// Last changed on: 24.12.2019 - 13:57:53

package wwcp.models.bogies.GermanBRBogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class E44BogieFront extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public E44BogieFront() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[51];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // EU Buffers
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // EU Buffers
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 48
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 175
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 257
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 258
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 259
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 260
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 261
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 262
		bodyModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 263
		bodyModel[11] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 264
		bodyModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 265
		bodyModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 266
		bodyModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 267
		bodyModel[15] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 268
		bodyModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 269
		bodyModel[17] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 271
		bodyModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 272
		bodyModel[19] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 273
		bodyModel[20] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 274
		bodyModel[21] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 275
		bodyModel[22] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 276
		bodyModel[23] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 277
		bodyModel[24] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Cylinder
		bodyModel[25] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 280
		bodyModel[26] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 281
		bodyModel[27] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 282
		bodyModel[28] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 300
		bodyModel[29] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 56

		bodyModel[0].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // EU Buffers
		bodyModel[0].setRotationPoint(-28.5F, 0.5F, -8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // EU Buffers
		bodyModel[1].setRotationPoint(-29.5F, -0.5F, -9.5F);

		bodyModel[2].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 48
		bodyModel[2].setRotationPoint(-28.5F, 0.5F, 7.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 175
		bodyModel[3].setRotationPoint(-29.5F, -0.5F, 6.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 18, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[4].setRotationPoint(-24F, -0.5F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[5].setRotationPoint(-21.5F, -0.5F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 7, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 259
		bodyModel[6].setRotationPoint(-17.5F, -0.5F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 41, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 260
		bodyModel[7].setRotationPoint(-16.5F, -0.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 261
		bodyModel[8].setRotationPoint(24.5F, -0.5F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F); // Box 262
		bodyModel[9].setRotationPoint(25F, -0.5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[10].setRotationPoint(27F, -0.5F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 264
		bodyModel[11].setRotationPoint(-8.5F, 4F, -10F);

		bodyModel[12].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[12].setRotationPoint(-8F, 4.5F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 266
		bodyModel[13].setRotationPoint(-10.5F, 2.5F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 267
		bodyModel[14].setRotationPoint(-10F, 4F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[15].setRotationPoint(-12.75F, 1F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 269
		bodyModel[16].setRotationPoint(-12.75F, 3F, -10F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[17].setRotationPoint(1.75F, 1F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 272
		bodyModel[18].setRotationPoint(1.75F, 3F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[19].setRotationPoint(6.75F, 1F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 274
		bodyModel[20].setRotationPoint(6.75F, 3F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 275
		bodyModel[21].setRotationPoint(16.5F, 4F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 276
		bodyModel[22].setRotationPoint(16F, 2.5F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 277
		bodyModel[23].setRotationPoint(18F, 4F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Cylinder
		bodyModel[24].setRotationPoint(-20F, 0.5F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 280
		bodyModel[25].setRotationPoint(21.5F, 3F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[26].setRotationPoint(21.5F, 1F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 282
		bodyModel[27].setRotationPoint(-26.5F, 0F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 14, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[28].setRotationPoint(-1.75F, -0.5F, -8F);

		bodyModel[29].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(18.5F, 4.5F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 41, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-16.5F, -0.5F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 31
		bodyModel[31].setRotationPoint(24.5F, -0.5F, 8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F); // Box 32
		bodyModel[32].setRotationPoint(25F, -0.5F, 8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-10.5F, 2.5F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-10F, 4F, 7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-12.75F, 1F, 9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 36
		bodyModel[36].setRotationPoint(-12.75F, 3F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[37].setRotationPoint(1.75F, 1F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 38
		bodyModel[38].setRotationPoint(1.75F, 3F, 9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(6.75F, 1F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 40
		bodyModel[40].setRotationPoint(6.75F, 3F, 9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 41
		bodyModel[41].setRotationPoint(16.5F, 4F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 42
		bodyModel[42].setRotationPoint(16F, 2.5F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 43
		bodyModel[43].setRotationPoint(21.5F, 3F, 9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(21.5F, 1F, 9F);

		bodyModel[45].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[45].setRotationPoint(18.5F, 4.5F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[46].setRotationPoint(-20F, 1.5F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[47].setRotationPoint(-20F, 0.5F, 9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F); // Box 49
		bodyModel[48].setRotationPoint(-20F, 1.5F, 9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 50
		bodyModel[49].setRotationPoint(-26.5F, 0F, 7F);

		bodyModel[50].addShapeBox(-5.5F, -5.5F, 0F, 11, 11, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[50].setRotationPoint(-8F, 4.5F, 6F);
	}
}