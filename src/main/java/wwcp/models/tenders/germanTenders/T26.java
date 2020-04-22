//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.05.2019 - 12:40:47
// Last changed on: 10.05.2019 - 12:40:47

package wwcp.models.tenders.germanTenders; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class T26 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public T26() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[67];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 92
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 96
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		bodyModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 56
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 57
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 58
		bodyModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 121
		bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 122
		bodyModel[9] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 124
		bodyModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 127
		bodyModel[11] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 129
		bodyModel[12] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 130
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box Left door
		bodyModel[14] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 148
		bodyModel[15] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 109
		bodyModel[17] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box Cargo
		bodyModel[18] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 113
		bodyModel[19] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 130
		bodyModel[20] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 131
		bodyModel[21] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 109
		bodyModel[22] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 111
		bodyModel[23] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 112
		bodyModel[24] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 50
		bodyModel[25] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 103
		bodyModel[26] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 130
		bodyModel[27] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 300
		bodyModel[28] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 103
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 300
		bodyModel[30] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 300
		bodyModel[31] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 300
		bodyModel[32] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 119
		bodyModel[33] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 360
		bodyModel[34] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 361
		bodyModel[35] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 362
		bodyModel[36] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 363
		bodyModel[37] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 364
		bodyModel[38] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 365
		bodyModel[39] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // OptionalLamp
		bodyModel[41] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 121
		bodyModel[42] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Backlamp
		bodyModel[44] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 52
		bodyModel[45] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Backlamp
		bodyModel[48] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 122
		bodyModel[51] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 122
		bodyModel[52] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 384
		bodyModel[53] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 103
		bodyModel[54] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 103
		bodyModel[55] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 366
		bodyModel[56] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 367
		bodyModel[57] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 52
		bodyModel[58] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 108
		bodyModel[59] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 90
		bodyModel[60] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 90
		bodyModel[61] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 90
		bodyModel[62] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 132
		bodyModel[63] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 108
		bodyModel[64] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 109
		bodyModel[65] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 28

		bodyModel[0].addShapeBox(0F, 0F, 0F, 45, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[0].setRotationPoint(-21F, 2F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 35, 17, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[1].setRotationPoint(-17F, -15F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 31, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[2].setRotationPoint(-17F, -22F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[3].setRotationPoint(27F, 2F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[4].setRotationPoint(28.5F, 1F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
		bodyModel[5].setRotationPoint(28.5F, 1F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[6].setRotationPoint(27F, 2F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 10, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[7].setRotationPoint(24F, -8F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[8].setRotationPoint(17F, -13F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[9].setRotationPoint(14F, -22F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[10].setRotationPoint(-21F, -15F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[11].setRotationPoint(-21F, -15F, 5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[12].setRotationPoint(-26F, -2.1F, -10F);

		bodyModel[13].addShapeBox(-3F, 0F, -1F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box Left door
		bodyModel[13].setRotationPoint(-21F, -12F, -10F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[14].setRotationPoint(15F, -22F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[15].setRotationPoint(-10F, 3F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[16].setRotationPoint(21.5F, -13.25F, -10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 27, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box Cargo
		bodyModel[17].setRotationPoint(-13F, -20F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 6, 10, 0F,-2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F); // Box 113
		bodyModel[18].setRotationPoint(-16F, -21F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[19].setRotationPoint(21.5F, -13.25F, 8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 31, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[20].setRotationPoint(-17F, -22F, 5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[21].setRotationPoint(15F, -18F, 5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[22].setRotationPoint(15F, -22F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[23].setRotationPoint(15F, -18F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 5, 10, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 50
		bodyModel[24].setRotationPoint(-21F, -3.1F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[25].setRotationPoint(-21.5F, -2F, -10.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 130
		bodyModel[26].setRotationPoint(-26F, -0.1F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 300
		bodyModel[27].setRotationPoint(-24.5F, -2F, -11.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[28].setRotationPoint(-25F, -2F, -10.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[29].setRotationPoint(-24.5F, 0.5F, -11.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[30].setRotationPoint(-24.5F, 3F, -11.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[31].setRotationPoint(-24.5F, 5.5F, -11.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 119
		bodyModel[32].setRotationPoint(25F, -11F, 3F);
		bodyModel[32].rotateAngleY = -3.14159265F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[33].setRotationPoint(-21.5F, -2F, 9.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[34].setRotationPoint(-24.5F, -2F, 9.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[35].setRotationPoint(-25F, -2F, 9.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 363
		bodyModel[36].setRotationPoint(-24.5F, 0.5F, 9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 364
		bodyModel[37].setRotationPoint(-24.5F, 3F, 9.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 365
		bodyModel[38].setRotationPoint(-24.5F, 5.5F, 9.5F);

		bodyModel[39].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[39].setRotationPoint(24.25F, -14F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // OptionalLamp
		bodyModel[40].setRotationPoint(24.35F, -14F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[41].setRotationPoint(24F, 2F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[42].setRotationPoint(27.25F, -4F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Backlamp
		bodyModel[43].setRotationPoint(27.35F, -4F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[44].setRotationPoint(27.3F, -1.9F, 6F);
		bodyModel[44].rotateAngleZ = 1.57079633F;

		bodyModel[45].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[45].setRotationPoint(27F, -1.9F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[46].setRotationPoint(27.25F, -4F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Backlamp
		bodyModel[47].setRotationPoint(27.35F, -4F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[48].setRotationPoint(27.3F, -1.9F, -6F);
		bodyModel[48].rotateAngleZ = 1.57079633F;

		bodyModel[49].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[49].setRotationPoint(27F, -1.9F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[50].setRotationPoint(24F, -13F, -11F);
		bodyModel[50].rotateAngleZ = 0.03490659F;

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[51].setRotationPoint(24F, -13F, 8F);
		bodyModel[51].rotateAngleZ = 0.03490659F;

		bodyModel[52].addShapeBox(-3F, 0F, -1F, 3, 9, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[52].setRotationPoint(-21F, -12F, 11F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[53].setRotationPoint(-25F, -2F, -10.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[54].setRotationPoint(-21.5F, -2F, -10.25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[55].setRotationPoint(-25F, -2F, 9.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[56].setRotationPoint(-21.5F, -2F, 9.25F);

		bodyModel[57].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[57].setRotationPoint(24F, -12.4F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[58].setRotationPoint(18F, -15F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[59].setRotationPoint(-22F, -7F, -6.2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F); // Box 90
		bodyModel[60].setRotationPoint(-21.5F, -8F, -5.95F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 90
		bodyModel[61].setRotationPoint(-22F, -5F, -5.2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 16, 16, 0, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, 0F, -4F, 0F); // Box 132
		bodyModel[62].setRotationPoint(-21.34F, -8.8F, 1F);
		bodyModel[62].rotateAngleX = -0.20943951F;
		bodyModel[62].rotateAngleY = -1.50098316F;
		bodyModel[62].rotateAngleZ = 0.78539816F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[63].setRotationPoint(18F, -15F, -11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[64].setRotationPoint(20.5F, -15.25F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 78
		bodyModel[65].setRotationPoint(18F, -15F, 5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[66].setRotationPoint(12.5F, 3F, -1F);
	}
}