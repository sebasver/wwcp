//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.04.2020 - 00:32:21
// Last changed on: 12.04.2020 - 00:32:21

package wwcp.models.bogies.EUBogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class EurofimaBogie extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public EurofimaBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[67];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 168
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 623
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 624
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 625
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 626
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 627
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 628
		bodyModel[7] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 167
		bodyModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 630
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 631
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 632
		bodyModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 167
		bodyModel[12] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 167
		bodyModel[13] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 167
		bodyModel[14] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 167
		bodyModel[15] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 640
		bodyModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 641
		bodyModel[17] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 43
		bodyModel[37] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 44
		bodyModel[38] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 45
		bodyModel[39] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 53
		bodyModel[48] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 55
		bodyModel[49] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 56
		bodyModel[50] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 57
		bodyModel[51] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 58
		bodyModel[52] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 59
		bodyModel[53] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 60
		bodyModel[54] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 61
		bodyModel[55] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 62
		bodyModel[56] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 63
		bodyModel[57] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 64
		bodyModel[58] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 65
		bodyModel[59] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 66
		bodyModel[60] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 67
		bodyModel[61] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 68
		bodyModel[62] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 69
		bodyModel[63] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 70
		bodyModel[64] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 71
		bodyModel[65] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 72
		bodyModel[66] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 73

		bodyModel[0].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 168
		bodyModel[0].setRotationPoint(10F, 6F, 5.95F);

		bodyModel[1].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 623
		bodyModel[1].setRotationPoint(-10F, 6F, 5.95F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		bodyModel[2].setRotationPoint(-3F, 3F, -7.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 625
		bodyModel[3].setRotationPoint(-2.5F, 5.75F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 626
		bodyModel[4].setRotationPoint(6.5F, 3F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 627
		bodyModel[5].setRotationPoint(11.5F, 4.5F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -2.75F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -2.75F, 0F, -1.5F, 1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 1.75F, 0F); // Box 628
		bodyModel[6].setRotationPoint(2.5F, 3F, 6F);

		bodyModel[7].addShapeBox(-1F, -1F, 0F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 167
		bodyModel[7].setRotationPoint(10F, 6F, -7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F); // Box 630
		bodyModel[8].setRotationPoint(6.5F, 5.25F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 631
		bodyModel[9].setRotationPoint(5.5F, 5.75F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		bodyModel[10].setRotationPoint(-2F, 5.75F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 167
		bodyModel[11].setRotationPoint(9.5F, 4.5F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 167
		bodyModel[12].setRotationPoint(9.5F, 4.6F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[13].setRotationPoint(-0.5F, 4F, 5.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.275F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.275F, 0F); // Box 167
		bodyModel[14].setRotationPoint(-1F, 5F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.275F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.275F, 0F); // Box 640
		bodyModel[15].setRotationPoint(-1F, 4F, 5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.275F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.275F, 0F); // Box 641
		bodyModel[16].setRotationPoint(-1F, 4.5F, 5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[17].setRotationPoint(6.5F, 3F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 18
		bodyModel[18].setRotationPoint(11.5F, 4.5F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F); // Box 21
		bodyModel[19].setRotationPoint(6.5F, 5.25F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 23
		bodyModel[20].setRotationPoint(9.5F, 4.5F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 24
		bodyModel[21].setRotationPoint(9.5F, 4.6F, -7F);

		bodyModel[22].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 25
		bodyModel[22].setRotationPoint(10F, 6F, -5.95F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[23].setRotationPoint(-2.5F, 5.75F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(-0.5F, 4F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.275F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.275F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-1F, 5F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.275F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.275F, 0F); // Box 29
		bodyModel[26].setRotationPoint(-1F, 4F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.275F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.275F, 0F); // Box 30
		bodyModel[27].setRotationPoint(-1F, 4.5F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-12.5F, 3F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F); // Box 34
		bodyModel[29].setRotationPoint(-9.5F, 5.25F, -7F);

		bodyModel[30].addShapeBox(-1F, -1F, 0F, 2, 2, 14, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 35
		bodyModel[30].setRotationPoint(-10F, 6F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 36
		bodyModel[31].setRotationPoint(-10.5F, 4.6F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 37
		bodyModel[32].setRotationPoint(-10.5F, 4.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 38
		bodyModel[33].setRotationPoint(-12.5F, 4.5F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-9.5F, 5.25F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		bodyModel[35].setRotationPoint(-12.5F, 3F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 43
		bodyModel[36].setRotationPoint(-12.5F, 4.5F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 44
		bodyModel[37].setRotationPoint(-10.5F, 4.5F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 45
		bodyModel[38].setRotationPoint(-10.5F, 4.6F, 6F);

		bodyModel[39].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Box 46
		bodyModel[39].setRotationPoint(-10F, 6F, -5.95F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[40].setRotationPoint(-1F, 3.75F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[41].setRotationPoint(2F, 5.75F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[42].setRotationPoint(9F, 5F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[43].setRotationPoint(-11F, 5F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Box 51
		bodyModel[44].setRotationPoint(-9F, 5.75F, -1F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F); // Box 51
		bodyModel[45].setRotationPoint(4.5F, 3F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[46].setRotationPoint(2.5F, 5.75F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 53
		bodyModel[47].setRotationPoint(3.5F, 4.75F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 55
		bodyModel[48].setRotationPoint(5.5F, 4.75F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -2.75F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -2.75F, 0F, -1.5F, 1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 1.75F, 0F); // Box 56
		bodyModel[49].setRotationPoint(2.5F, 3F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 57
		bodyModel[50].setRotationPoint(5.5F, 5.75F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F); // Box 58
		bodyModel[51].setRotationPoint(4.5F, 3F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[52].setRotationPoint(2.5F, 5.75F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 60
		bodyModel[53].setRotationPoint(3.5F, 4.75F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F); // Box 61
		bodyModel[54].setRotationPoint(5.5F, 4.75F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1.5F, -0.5F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 1.75F, 0F, -1.5F, 1.75F, 0F, 0F, -0.5F, 0F); // Box 62
		bodyModel[55].setRotationPoint(-6.5F, 3F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 63
		bodyModel[56].setRotationPoint(-6.5F, 5.75F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 64
		bodyModel[57].setRotationPoint(-6.5F, 3F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 65
		bodyModel[58].setRotationPoint(-4.5F, 5.75F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 66
		bodyModel[59].setRotationPoint(-5.5F, 4.75F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 67
		bodyModel[60].setRotationPoint(-6.5F, 4.75F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 68
		bodyModel[61].setRotationPoint(-6.5F, 5.75F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 69
		bodyModel[62].setRotationPoint(-5.5F, 4.75F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F); // Box 70
		bodyModel[63].setRotationPoint(-6.5F, 4.75F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1.5F, -0.5F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 1.75F, 0F, -1.5F, 1.75F, 0F, 0F, -0.5F, 0F); // Box 71
		bodyModel[64].setRotationPoint(-6.5F, 3F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[65].setRotationPoint(-6.5F, 3F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F); // Box 73
		bodyModel[66].setRotationPoint(-4.5F, 5.75F, -7F);
	}
}