//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.11.2017 - 19:11:37
// Last changed on: 15.11.2017 - 19:11:37

package wwcp.models.bogies.EUBogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class HLD55Bogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public HLD55Bogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[49];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 91
		bodyModel[2] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 92
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 93
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 126
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 17
		bodyModel[6] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 18
		bodyModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 20
		bodyModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 21
		bodyModel[10] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 28
		bodyModel[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 93
		bodyModel[16] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 112
		bodyModel[17] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 22
		bodyModel[24] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 22
		bodyModel[25] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 24
		bodyModel[26] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 22
		bodyModel[31] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 22
		bodyModel[32] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 22
		bodyModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[34] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 22
		bodyModel[35] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 73
		bodyModel[36] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 88
		bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		bodyModel[38] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 52

		bodyModel[0].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[0].setRotationPoint(-20.5F, 4F, 0F);

		bodyModel[1].addBox(0F, 0F, -5F, 36, 7, 10, 0F); // Box 91
		bodyModel[1].setRotationPoint(-17.75F, 1F, 0F);

		bodyModel[2].addBox(0F, 0F, 0F, 3, 3, 16, 0F); // Box 92
		bodyModel[2].setRotationPoint(14.75F, 4.5F, -8F);

		bodyModel[3].addBox(0F, 0F, -8F, 3, 3, 16, 0F); // Box 93
		bodyModel[3].setRotationPoint(-1.25F, 4.5F, 0F);

		bodyModel[4].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 126
		bodyModel[4].setRotationPoint(12.25F, 2F, 5.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 17
		bodyModel[5].setRotationPoint(12.5F, 2F, -5.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 18
		bodyModel[6].setRotationPoint(-3.75F, 2F, -5.5F);

		bodyModel[7].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 19
		bodyModel[7].setRotationPoint(-3.75F, 2F, 5.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 20
		bodyModel[8].setRotationPoint(-19.25F, 2F, -5.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 8, 8, 0, 0F); // Box 21
		bodyModel[9].setRotationPoint(-19.25F, 2F, 5.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[10].setRotationPoint(-20.25F, 0.5F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[11].setRotationPoint(-17.75F, 3.5F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[12].setRotationPoint(-2.25F, 3.5F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[13].setRotationPoint(13.75F, 3.5F, -7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[14].setRotationPoint(-9.75F, 3F, -8F);

		bodyModel[15].addBox(0F, 0F, -8F, 3, 3, 16, 0F); // Box 93
		bodyModel[15].setRotationPoint(-16.75F, 4.5F, 0F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 112
		bodyModel[16].setRotationPoint(-2F, 0F, -2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[17].setRotationPoint(6.25F, 3F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 42, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[18].setRotationPoint(-20.5F, 2.5F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-19.25F, 6.5F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-4.75F, 0.5F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-3.75F, 6.5F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(11.25F, 0.5F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[23].setRotationPoint(12.25F, 6.5F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[24].setRotationPoint(-20.25F, 0.5F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[25].setRotationPoint(-17.75F, 3.5F, 6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[26].setRotationPoint(-2.25F, 3.5F, 7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 28
		bodyModel[27].setRotationPoint(13.75F, 3.5F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 33
		bodyModel[28].setRotationPoint(-9.75F, 3F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 33
		bodyModel[29].setRotationPoint(6.25F, 3F, 7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 42, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[30].setRotationPoint(-20.5F, 2.5F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[31].setRotationPoint(-19.25F, 6.5F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[32].setRotationPoint(-4.75F, 0.5F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[33].setRotationPoint(-3.75F, 6.5F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		bodyModel[34].setRotationPoint(12.25F, 6.5F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[35].setRotationPoint(11.25F, 0.5F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, -6F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[36].setRotationPoint(20.5F, 4F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[37].setRotationPoint(11F, 4.5F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[38].setRotationPoint(11.5F, 8F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[39].setRotationPoint(21F, 4.5F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[40].setRotationPoint(11F, 4.5F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[41].setRotationPoint(11.5F, 8F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[42].setRotationPoint(21F, 4.5F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[43].setRotationPoint(-20.75F, 4.5F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[44].setRotationPoint(-20.25F, 8F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[45].setRotationPoint(-10.75F, 4.5F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 52
		bodyModel[46].setRotationPoint(-20.75F, 4.5F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 1, 0, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[47].setRotationPoint(-20.25F, 8F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[48].setRotationPoint(-10.75F, 4.5F, 6F);
	}
}