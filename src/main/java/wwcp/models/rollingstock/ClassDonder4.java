//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.06.2018 - 15:55:44
// Last changed on: 18.06.2018 - 15:55:44

package wwcp.models.rollingstock; //Path where the model is located

import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class ClassDonder4 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ClassDonder4() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[98];

		initbodyModel_1();
		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 36
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 56
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 2
		bodyModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 56
		bodyModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		bodyModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 2
		bodyModel[9] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 2
		bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 2
		bodyModel[12] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 2
		bodyModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		bodyModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 2
		bodyModel[16] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 2
		bodyModel[17] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 2
		bodyModel[18] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 2
		bodyModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[20] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 2
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 2
		bodyModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		bodyModel[27] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 2
		bodyModel[28] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 2
		bodyModel[30] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 2
		bodyModel[33] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 2
		bodyModel[34] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 2
		bodyModel[35] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 2
		bodyModel[36] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 2
		bodyModel[37] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 2
		bodyModel[38] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 2
		bodyModel[39] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 2
		bodyModel[40] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 2
		bodyModel[41] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 2
		bodyModel[42] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 2
		bodyModel[43] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 2
		bodyModel[44] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 2
		bodyModel[45] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 2
		bodyModel[47] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 2
		bodyModel[48] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 2
		bodyModel[50] = new ModelRendererTurbo(this, 233, 82, textureX, textureY); // Box 26
		bodyModel[51] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 33
		bodyModel[52] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 36
		bodyModel[53] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 32
		bodyModel[54] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 34
		bodyModel[55] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 33
		bodyModel[56] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 33
		bodyModel[57] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 16
		bodyModel[58] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 16
		bodyModel[59] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 17
		bodyModel[60] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 19
		bodyModel[61] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 17
		bodyModel[62] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 19
		bodyModel[63] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 26
		bodyModel[64] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 33
		bodyModel[65] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 36
		bodyModel[66] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 32
		bodyModel[67] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 34
		bodyModel[68] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 33
		bodyModel[69] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 33
		bodyModel[70] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 16
		bodyModel[71] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 16
		bodyModel[72] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 17
		bodyModel[73] = new ModelRendererTurbo(this, 97, 50, textureX, textureY); // Box 19
		bodyModel[74] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 17
		bodyModel[75] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 19
		bodyModel[76] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 2
		bodyModel[78] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 16
		bodyModel[79] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 16
		bodyModel[80] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 16
		bodyModel[81] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 16
		bodyModel[82] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 16
		bodyModel[83] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 16
		bodyModel[84] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 16
		bodyModel[85] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 16
		bodyModel[86] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 33
		bodyModel[87] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 33
		bodyModel[88] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 17
		bodyModel[89] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 19
		bodyModel[90] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 17
		bodyModel[91] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 19
		bodyModel[92] = new ModelRendererTurbo(this, 224, 111, textureX, textureY); // Box 2
		bodyModel[93] = new ModelRendererTurbo(this, 226, 132, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 2
		bodyModel[95] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 2
		bodyModel[96] = new ModelRendererTurbo(this, 57, 90, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 57, 90, textureX, textureY); // Box 2

		bodyModel[0].addShapeBox(0F, 0F, 0F, 60, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[0].setRotationPoint(-30F, 0F, -11F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 35
		bodyModel[1].setRotationPoint(-38F, -1F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 36
		bodyModel[2].setRotationPoint(-38F, -1F, 7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[3].setRotationPoint(-35F, 0F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[4].setRotationPoint(36.5F, -1F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[5].setRotationPoint(30F, 0F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[6].setRotationPoint(36.5F, -1F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[7].setRotationPoint(35F, 0F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[8].setRotationPoint(35F, 0F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[9].setRotationPoint(-37F, 0F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[10].setRotationPoint(-37F, 0F, 8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 58, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[11].setRotationPoint(-29F, -18F, 10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 58, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[12].setRotationPoint(-29F, -18F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 18, 8, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[13].setRotationPoint(-30F, -18F, -10.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[14].setRotationPoint(-30F, -18F, 2.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[15].setRotationPoint(-30F, -18F, -2.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[16].setRotationPoint(29F, -18F, -11F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 18, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[17].setRotationPoint(29F, -18F, 2.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 18, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[18].setRotationPoint(29F, -18F, -2.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[19].setRotationPoint(35F, -9F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[20].setRotationPoint(30F, 3F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[21].setRotationPoint(30F, 6F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[22].setRotationPoint(-35F, 3F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[23].setRotationPoint(-35F, 6F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[24].setRotationPoint(-35F, 3F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[25].setRotationPoint(-35F, 6F, 9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[26].setRotationPoint(30F, 3F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 2
		bodyModel[27].setRotationPoint(30F, 6F, 9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 2
		bodyModel[28].setRotationPoint(32F, 1F, 7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 2
		bodyModel[29].setRotationPoint(-33F, 1F, 7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[30].setRotationPoint(32F, 1F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 2
		bodyModel[31].setRotationPoint(-33F, 1F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[32].setRotationPoint(35F, -9F, 3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[33].setRotationPoint(-35F, -9F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 0, 9, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[34].setRotationPoint(-35F, -9F, 3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[35].setRotationPoint(-38F, 0F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 0, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[36].setRotationPoint(35F, 0F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 2
		bodyModel[37].setRotationPoint(-35F, -18F, 11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -3F, 0.25F); // Box 2
		bodyModel[38].setRotationPoint(-35F, -18F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -3F, 0.25F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[39].setRotationPoint(30F, -18F, 11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.25F, 0F, 0F, 0.25F); // Box 2
		bodyModel[40].setRotationPoint(30F, -18F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 70, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 2
		bodyModel[41].setRotationPoint(-35F, -21F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 70, 3, 0, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 2
		bodyModel[42].setRotationPoint(-35F, -21F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 70, 3, 0, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F, 0F, 0F, -5.75F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 2
		bodyModel[43].setRotationPoint(-35F, -24F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 70, 3, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -5.75F, 0F, 0F, -5.75F); // Box 2
		bodyModel[44].setRotationPoint(-35F, -24F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 70, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 2
		bodyModel[45].setRotationPoint(-35F, -24F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.875F, 0F, 0F, 0.875F, 0F, 0F, 0.875F, 0F, 0F, 0.875F); // Box 2
		bodyModel[46].setRotationPoint(-30F, -21F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 5.875F, 0F, 0F, 5.875F, 0F, 0F, 5.875F, 0F, 0F, 5.875F); // Box 2
		bodyModel[47].setRotationPoint(-30F, -24F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.875F, 0F, 0F, 0.875F, 0F, 0F, 0.875F, 0F, 0F, 0.875F); // Box 2
		bodyModel[48].setRotationPoint(29F, -21F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 5.875F, 0F, 0F, 5.875F, 0F, 0F, 5.875F, 0F, 0F, 5.875F); // Box 2
		bodyModel[49].setRotationPoint(29F, -24F, -4F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[50].setRotationPoint(22F, 5F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[51].setRotationPoint(21F, 5F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[52].setRotationPoint(24F, 5F, 7F);
		bodyModel[52].rotateAngleY = -3.14159265F;

		bodyModel[53].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[53].setRotationPoint(22.5F, 5.5F, 5.98F);

		bodyModel[54].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[54].setRotationPoint(22.5F, 5.5F, -5.98F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[55].setRotationPoint(20F, 4F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[56].setRotationPoint(20F, 4F, 5.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[57].setRotationPoint(16F, 3F, -6.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[58].setRotationPoint(27.5F, 3F, -6.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[59].setRotationPoint(24.5F, 3F, 5.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[60].setRotationPoint(20.5F, 3F, 6.5F);
		bodyModel[60].rotateAngleY = -3.14159265F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[61].setRotationPoint(24.5F, 3F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[62].setRotationPoint(20.5F, 3F, -6F);
		bodyModel[62].rotateAngleY = -3.14159265F;

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 26
		bodyModel[63].setRotationPoint(-23F, 5F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[64].setRotationPoint(-24F, 5F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[65].setRotationPoint(-21F, 5F, 7F);
		bodyModel[65].rotateAngleY = -3.14159265F;

		bodyModel[66].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[66].setRotationPoint(-22.5F, 5.5F, 5.98F);

		bodyModel[67].addShapeBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[67].setRotationPoint(-22.5F, 5.5F, -5.98F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[68].setRotationPoint(-25F, 4F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[69].setRotationPoint(-25F, 4F, 5.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[70].setRotationPoint(-29F, 3F, -6.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[71].setRotationPoint(-17.5F, 3F, -6.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[72].setRotationPoint(-20.5F, 3F, 5.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[73].setRotationPoint(-24.5F, 3F, 6.5F);
		bodyModel[73].rotateAngleY = -3.14159265F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[74].setRotationPoint(-20.5F, 3F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[75].setRotationPoint(-24.5F, 3F, -6F);
		bodyModel[75].rotateAngleY = -3.14159265F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[76].setRotationPoint(-10F, 1F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[77].setRotationPoint(-10F, 1F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[78].setRotationPoint(16F, 1F, -6.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[79].setRotationPoint(27.5F, 1F, -6.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[80].setRotationPoint(16F, 1F, 5.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[81].setRotationPoint(27.5F, 1F, 5.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[82].setRotationPoint(-29F, 1F, -6.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[83].setRotationPoint(-17.5F, 1F, -6.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[84].setRotationPoint(-29F, 1F, 5.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[85].setRotationPoint(-17.5F, 1F, 5.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[86].setRotationPoint(-12F, 3F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[87].setRotationPoint(-12F, 3F, 5.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[88].setRotationPoint(12F, 2F, 5.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[89].setRotationPoint(-12F, 2F, 6.5F);
		bodyModel[89].rotateAngleY = -3.14159265F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[90].setRotationPoint(12F, 2F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[91].setRotationPoint(-12F, 2F, -6F);
		bodyModel[91].rotateAngleY = -3.14159265F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 58, 3, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 2
		bodyModel[92].setRotationPoint(-29F, -21F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 58, 3, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 2
		bodyModel[93].setRotationPoint(-29F, -21F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 58, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[94].setRotationPoint(-29F, -9.75F, -9F);
		bodyModel[94].rotateAngleX = -1.3962634F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 58, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[95].setRotationPoint(-29F, -5F, 4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 58, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[96].setRotationPoint(-29F, -5F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, -5F, 58, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[97].setRotationPoint(-29F, -9.75F, 9F);
		bodyModel[97].rotateAngleX = 1.3962634F;
	}
}