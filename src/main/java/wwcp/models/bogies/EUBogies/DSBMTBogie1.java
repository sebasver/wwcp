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

public class DSBMTBogie1 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public DSBMTBogie1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[93];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 25
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 25
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 25
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 25
		bodyModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 25
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 25
		bodyModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 25
		bodyModel[12] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 12
		bodyModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 12
		bodyModel[15] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 12
		bodyModel[16] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 12
		bodyModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 12
		bodyModel[18] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 12
		bodyModel[19] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 12
		bodyModel[20] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 23
		bodyModel[25] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 25
		bodyModel[27] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 25
		bodyModel[28] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 25
		bodyModel[29] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 25
		bodyModel[30] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 25
		bodyModel[31] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 25
		bodyModel[32] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 25
		bodyModel[33] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 25
		bodyModel[34] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 25
		bodyModel[35] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 25
		bodyModel[36] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 25
		bodyModel[37] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 25
		bodyModel[38] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 25
		bodyModel[39] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 25
		bodyModel[40] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 25
		bodyModel[41] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 25
		bodyModel[42] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 25
		bodyModel[43] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 25
		bodyModel[44] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 25
		bodyModel[45] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 25
		bodyModel[46] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 77
		bodyModel[47] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 94
		bodyModel[48] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 95
		bodyModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 77
		bodyModel[50] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 94
		bodyModel[51] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 95
		bodyModel[52] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 25
		bodyModel[53] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 25
		bodyModel[54] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 77
		bodyModel[55] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 94
		bodyModel[56] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 95
		bodyModel[57] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 77
		bodyModel[58] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 94
		bodyModel[59] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 95
		bodyModel[60] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 25
		bodyModel[61] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 77
		bodyModel[62] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 94
		bodyModel[63] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 95
		bodyModel[64] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 77
		bodyModel[65] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 94
		bodyModel[66] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 95
		bodyModel[67] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 25
		bodyModel[68] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 77
		bodyModel[69] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 94
		bodyModel[70] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 95
		bodyModel[71] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 77
		bodyModel[72] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 94
		bodyModel[73] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 95
		bodyModel[74] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 25
		bodyModel[75] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 181
		bodyModel[76] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 181
		bodyModel[77] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 181
		bodyModel[78] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 181
		bodyModel[79] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 161
		bodyModel[80] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 159
		bodyModel[81] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 159
		bodyModel[82] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 161
		bodyModel[83] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 181
		bodyModel[84] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 181
		bodyModel[85] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 25
		bodyModel[86] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 25
		bodyModel[87] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
		bodyModel[88] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 25
		bodyModel[89] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 25
		bodyModel[90] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 181
		bodyModel[91] = new ModelRendererTurbo(this, 72, 28, textureX, textureY); // Box 207
		bodyModel[92] = new ModelRendererTurbo(this, 72, 28, textureX, textureY); // Box 207

		bodyModel[0].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[0].setRotationPoint(-12.25F, 2.15F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[1].setRotationPoint(4.75F, 2.15F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[2].setRotationPoint(-12.25F, 2.15F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 8, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[3].setRotationPoint(4.75F, 2.15F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[4].setRotationPoint(7.75F, 5.15F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[5].setRotationPoint(-9.25F, 5.15F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[6].setRotationPoint(-14F, 3F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 25
		bodyModel[7].setRotationPoint(-18F, 3F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[8].setRotationPoint(14F, 3F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 28, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[9].setRotationPoint(-14F, 3F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 25
		bodyModel[10].setRotationPoint(-18F, 3F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[11].setRotationPoint(14F, 3F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(12.75F, 3F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 12
		bodyModel[13].setRotationPoint(12.75F, 4F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[14].setRotationPoint(-16.75F, 3F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 12
		bodyModel[15].setRotationPoint(-16.75F, 4F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[16].setRotationPoint(-16.75F, 3F, 7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F); // Box 12
		bodyModel[17].setRotationPoint(-16.75F, 4F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[18].setRotationPoint(12.75F, 3F, 7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F); // Box 12
		bodyModel[19].setRotationPoint(12.75F, 4F, 7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-2F, 3F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(14F, 3F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[22].setRotationPoint(-15F, 3F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 7, 4, 10, 0F); // Box 23
		bodyModel[23].setRotationPoint(-10.25F, 4F, -5F);

		bodyModel[24].addBox(0F, 0F, 0F, 7, 4, 10, 0F); // Box 23
		bodyModel[24].setRotationPoint(3.25F, 4F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(2F, 3F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[26].setRotationPoint(-10F, 3F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[27].setRotationPoint(-2.75F, 6F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 25
		bodyModel[28].setRotationPoint(-10.25F, 6F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[29].setRotationPoint(-7.25F, 6F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 25
		bodyModel[30].setRotationPoint(-13.25F, 5F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[31].setRotationPoint(9.75F, 6F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[32].setRotationPoint(9.75F, 5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[33].setRotationPoint(-7.25F, 5F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[34].setRotationPoint(-9.25F, 5.15F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[35].setRotationPoint(7.75F, 5.15F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 25
		bodyModel[36].setRotationPoint(-10.25F, 6F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[37].setRotationPoint(-7.25F, 6F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 25
		bodyModel[38].setRotationPoint(-13.25F, 5F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 25
		bodyModel[39].setRotationPoint(6.75F, 6F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[40].setRotationPoint(9.75F, 6F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[41].setRotationPoint(9.75F, 5F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[42].setRotationPoint(-7.25F, 5F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 25
		bodyModel[43].setRotationPoint(-9.25F, 5.15F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 25
		bodyModel[44].setRotationPoint(7.75F, 5.15F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[45].setRotationPoint(-2.75F, 6F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[46].setRotationPoint(-13.5F, 6F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[47].setRotationPoint(-14F, 6.3F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[48].setRotationPoint(-14F, 7.1F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[49].setRotationPoint(-4.5F, 6F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[50].setRotationPoint(-5F, 6.3F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[51].setRotationPoint(-5F, 7.1F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
		bodyModel[52].setRotationPoint(-13.5F, 8F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 25
		bodyModel[53].setRotationPoint(6.75F, 6F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[54].setRotationPoint(4F, 6F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[55].setRotationPoint(3.5F, 6.3F, -8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[56].setRotationPoint(3.5F, 7.1F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[57].setRotationPoint(13F, 6F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 94
		bodyModel[58].setRotationPoint(12.5F, 6.3F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 95
		bodyModel[59].setRotationPoint(12.5F, 7.1F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
		bodyModel[60].setRotationPoint(4F, 8F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[61].setRotationPoint(-13.5F, 6F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 94
		bodyModel[62].setRotationPoint(-14F, 6.3F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[63].setRotationPoint(-14F, 7.1F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[64].setRotationPoint(-4.5F, 6F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 94
		bodyModel[65].setRotationPoint(-5F, 6.3F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[66].setRotationPoint(-5F, 7.1F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
		bodyModel[67].setRotationPoint(-13.5F, 8F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[68].setRotationPoint(4F, 6F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 94
		bodyModel[69].setRotationPoint(3.5F, 6.3F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[70].setRotationPoint(3.5F, 7.1F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[71].setRotationPoint(13F, 6F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 94
		bodyModel[72].setRotationPoint(12.5F, 6.3F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 95
		bodyModel[73].setRotationPoint(12.5F, 7.1F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
		bodyModel[74].setRotationPoint(4F, 8F, 6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[75].setRotationPoint(15F, 2.75F, -4.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[76].setRotationPoint(17F, 5.75F, 4.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 1F, -2F, 0F); // Box 181
		bodyModel[77].setRotationPoint(17F, 5.75F, -5.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[78].setRotationPoint(15F, 2.75F, 3.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,4F, 0F, 0F, -4F, 0F, 0F, -2F, -1F, 0F, 2F, -1F, 0F, 1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 161
		bodyModel[79].setRotationPoint(20.25F, 5F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,2F, 0F, -1F, -2F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 4F, 0F, 0F, -4F, 0F, 0F, -2F, 1F, 0F, 2F, 1F, 0F); // Box 159
		bodyModel[80].setRotationPoint(20.25F, 3F, -9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, -1F, -1F, 0F, -1F, -1F, -2F, 0F, -1F, 2F, 0F, -1F, 2F, 1F, 0F, -2F, 1F, 0F, -4F, 0F, 0F, 4F, 0F, 0F); // Box 159
		bodyModel[81].setRotationPoint(20.25F, 3F, 3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 3, 6, 0F,2F, -1F, 0F, -2F, -1F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 1F, 0F, -2F); // Box 161
		bodyModel[82].setRotationPoint(20.25F, 5F, 3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[83].setRotationPoint(17F, 4.75F, 3.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.25F, 0F, 0F, 0.00F, 0F, 0F, 0.00F, 0F, 0F, 0.00F, 0F, 0F, 0.00F, 0F, 0F, 0.00F, 0F, 0F, 0.00F, 0F, 0F, 0.00F, 0F); // Box 181
		bodyModel[84].setRotationPoint(16F, 4.75F, -3.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[85].setRotationPoint(-1F, 2F, -1F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 25
		bodyModel[86].setRotationPoint(-2F, 5.5F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[87].setRotationPoint(-2F, 5.5F, -8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[88].setRotationPoint(0F, 6F, -8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 25
		bodyModel[89].setRotationPoint(0F, 6F, 7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[90].setRotationPoint(17F, 4.75F, -4.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[91].setRotationPoint(-16.45F, 3F, 8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[92].setRotationPoint(-16.45F, 6F, 7.5F);
	}
}