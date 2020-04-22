//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 28.01.2019 - 21:17:44
// Last changed on: 28.01.2019 - 21:17:44

package wwcp.models.tenders.germanTenders; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class T34Streamlined extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public T34Streamlined() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[106];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 56
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 57
		bodyModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 58
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 121
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 28
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 109
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 130
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 119
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 52
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 52
		bodyModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 121
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 52
		bodyModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Lamp
		bodyModel[15] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 52
		bodyModel[16] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 52
		bodyModel[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 52
		bodyModel[18] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Lamp
		bodyModel[19] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 52
		bodyModel[20] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 52
		bodyModel[21] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 52
		bodyModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 92
		bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 237
		bodyModel[24] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 92
		bodyModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 92
		bodyModel[26] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 237
		bodyModel[27] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 92
		bodyModel[28] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 191
		bodyModel[29] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 193
		bodyModel[30] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 195
		bodyModel[31] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 198
		bodyModel[32] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 199
		bodyModel[33] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 96
		bodyModel[34] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 201
		bodyModel[35] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 202
		bodyModel[36] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 202
		bodyModel[37] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 207
		bodyModel[38] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 96
		bodyModel[39] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 96
		bodyModel[40] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 96
		bodyModel[41] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 219
		bodyModel[42] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 92
		bodyModel[43] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 224
		bodyModel[44] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 227
		bodyModel[45] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 96
		bodyModel[46] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 96
		bodyModel[47] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 96
		bodyModel[48] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 116
		bodyModel[49] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 237
		bodyModel[50] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 87
		bodyModel[51] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 96
		bodyModel[52] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 92
		bodyModel[53] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 92
		bodyModel[54] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 168
		bodyModel[55] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 92
		bodyModel[56] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 133
		bodyModel[57] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 92
		bodyModel[58] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 92
		bodyModel[59] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 92
		bodyModel[60] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 92
		bodyModel[61] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 166
		bodyModel[62] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 166
		bodyModel[63] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 324
		bodyModel[64] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 92
		bodyModel[65] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 92
		bodyModel[66] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 77
		bodyModel[73] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 114
		bodyModel[77] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 84
		bodyModel[78] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 92
		bodyModel[79] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 90
		bodyModel[80] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 90
		bodyModel[81] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 90
		bodyModel[82] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 90
		bodyModel[83] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 90
		bodyModel[85] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 90
		bodyModel[86] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 96
		bodyModel[87] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 96
		bodyModel[88] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 96
		bodyModel[89] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 96
		bodyModel[90] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 96
		bodyModel[91] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 96
		bodyModel[92] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 96
		bodyModel[93] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 96
		bodyModel[94] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 96
		bodyModel[96] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 96
		bodyModel[98] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 96
		bodyModel[99] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 96
		bodyModel[100] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 96
		bodyModel[101] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 96
		bodyModel[102] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 96
		bodyModel[103] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 96
		bodyModel[104] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 111
		bodyModel[105] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 112

		bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[0].setRotationPoint(33F, 2F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[1].setRotationPoint(35.5F, 1F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
		bodyModel[2].setRotationPoint(35.5F, 1F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[3].setRotationPoint(33F, 2F, 7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 10, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[4].setRotationPoint(31F, -8F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[5].setRotationPoint(-10F, 3F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[6].setRotationPoint(17F, 3F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[7].setRotationPoint(28.5F, -15.25F, -10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[8].setRotationPoint(28.5F, -15.25F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 119
		bodyModel[9].setRotationPoint(36F, -19F, 3F);
		bodyModel[9].rotateAngleY = -3.14159265F;

		bodyModel[10].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[10].setRotationPoint(34.25F, -14F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[11].setRotationPoint(34.35F, -14F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[12].setRotationPoint(31F, 2F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[13].setRotationPoint(33.25F, -4F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Lamp
		bodyModel[14].setRotationPoint(33.35F, -4F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[15].setRotationPoint(33.3F, -1.9F, 6F);
		bodyModel[15].rotateAngleZ = 1.57079633F;

		bodyModel[16].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[16].setRotationPoint(33F, -1.9F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[17].setRotationPoint(33.25F, -4F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Lamp
		bodyModel[18].setRotationPoint(33.35F, -4F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[19].setRotationPoint(33.3F, -1.9F, -6F);
		bodyModel[19].rotateAngleZ = 1.57079633F;

		bodyModel[20].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[20].setRotationPoint(33F, -1.9F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[21].setRotationPoint(34F, -12.4F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 92
		bodyModel[22].setRotationPoint(31F, -13F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, -2F, -1F, -1F, 2F, 0F, 0F, 1F); // Box 237
		bodyModel[23].setRotationPoint(31F, 3F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 92
		bodyModel[24].setRotationPoint(31F, -15F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 92
		bodyModel[25].setRotationPoint(34F, -12F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 1F, 0F, 1F); // Box 237
		bodyModel[26].setRotationPoint(34F, 3F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[27].setRotationPoint(34F, -15F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 191
		bodyModel[28].setRotationPoint(31F, -13F, 10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 193
		bodyModel[29].setRotationPoint(31F, -15F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 195
		bodyModel[30].setRotationPoint(34F, -12F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -1F, 2F, -1F, -1F, -2F, 0F, 0F, -1F); // Box 198
		bodyModel[31].setRotationPoint(31F, 3F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 1F, 0F, -1F); // Box 199
		bodyModel[32].setRotationPoint(34F, 3F, 9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 96
		bodyModel[33].setRotationPoint(34F, -15F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 201
		bodyModel[34].setRotationPoint(34F, -15F, 9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[35].setRotationPoint(34F, -15F, 1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[36].setRotationPoint(34F, -16F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 207
		bodyModel[37].setRotationPoint(34F, -16F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[38].setRotationPoint(34F, -22F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 96
		bodyModel[39].setRotationPoint(31F, -15F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[40].setRotationPoint(16F, -21F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, -6F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[41].setRotationPoint(29F, -21F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 46, 18, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[42].setRotationPoint(-15F, -15F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 224
		bodyModel[43].setRotationPoint(29F, -21F, 6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 227
		bodyModel[44].setRotationPoint(16F, -21F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[45].setRotationPoint(17F, -23F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 18, 1, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[46].setRotationPoint(-1F, -23F, -6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[47].setRotationPoint(-3F, -23F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 52, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 116
		bodyModel[48].setRotationPoint(-21F, 3F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 52, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 237
		bodyModel[49].setRotationPoint(-21F, 3F, -11F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[50].setRotationPoint(-21F, 3F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 34, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[51].setRotationPoint(-18F, -21F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 51, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[52].setRotationPoint(-17F, -22F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 18, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[53].setRotationPoint(-21F, -23F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[54].setRotationPoint(-21F, -19F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 16, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[55].setRotationPoint(-21F, -13F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, -1F, 0F, -3F, 0F, 0F, -3F); // Box 133
		bodyModel[56].setRotationPoint(-21F, -22F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[57].setRotationPoint(-21F, -23F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 22, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[58].setRotationPoint(-17F, -15F, -11F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[59].setRotationPoint(-21F, -22F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[60].setRotationPoint(-21F, -22F, -9F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 166
		bodyModel[61].setRotationPoint(-21F, -19F, -9.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[62].setRotationPoint(-21F, -19F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 324
		bodyModel[63].setRotationPoint(-21F, -19F, -10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[64].setRotationPoint(-21F, -19F, -8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[65].setRotationPoint(-21F, -15F, -10F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[66].setRotationPoint(-21F, -19F, 10F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 3F, 0F, 0F, 3F); // Box 72
		bodyModel[67].setRotationPoint(-21F, -22F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[68].setRotationPoint(-21F, -23F, 6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(-21F, -22F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 75
		bodyModel[70].setRotationPoint(-21F, -19F, 8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 76
		bodyModel[71].setRotationPoint(-21F, -19F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[72].setRotationPoint(-21F, -19F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[73].setRotationPoint(-21F, -19F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[74].setRotationPoint(-21F, -15F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 33, 6, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[75].setRotationPoint(-17F, -21F, 6F);

		bodyModel[76].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 114
		bodyModel[76].setRotationPoint(19.5F, -15.25F, -10F);

		bodyModel[77].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Box 84
		bodyModel[77].setRotationPoint(19.5F, -15.25F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 19, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[78].setRotationPoint(-21.25F, -21F, -5F);

		bodyModel[79].addShapeBox(0F, -1F, -1F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -4.25F, 0F, -4.25F, -4.25F); // Box 90
		bodyModel[79].setRotationPoint(-21.5F, -14.5F, 4F);

		bodyModel[80].addShapeBox(0F, -1F, -1F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -4.25F, 0F, -4.25F, -4.25F); // Box 90
		bodyModel[80].setRotationPoint(-21.5F, -17.5F, 3F);

		bodyModel[81].addShapeBox(0F, -1F, -1F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -4.25F, 0F, -4.25F, -4.25F); // Box 90
		bodyModel[81].setRotationPoint(-21.5F, -15.5F, -3F);

		bodyModel[82].addShapeBox(0F, -1F, -1F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F, -6F); // Box 90
		bodyModel[82].setRotationPoint(-21.75F, -14F, -0.5F);
		bodyModel[82].rotateAngleX = 0.2268928F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 90
		bodyModel[83].setRotationPoint(-21.7F, -14.25F, -0.75F);

		bodyModel[84].addShapeBox(0F, -1F, -1F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F, -6F); // Box 90
		bodyModel[84].setRotationPoint(-21.75F, -12F, -3.5F);
		bodyModel[84].rotateAngleX = -0.62831853F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 90
		bodyModel[85].setRotationPoint(-21.7F, -12.25F, -3.75F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[86].setRotationPoint(-21F, -24F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[87].setRotationPoint(-21F, -24F, 2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[88].setRotationPoint(-21F, -24F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[89].setRotationPoint(-1F, -23.5F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[90].setRotationPoint(-1F, -23.5F, 2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[91].setRotationPoint(-1F, -23.5F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[92].setRotationPoint(19F, -23F, -2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[93].setRotationPoint(19F, -23F, 2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[94].setRotationPoint(19F, -23F, -6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[95].setRotationPoint(-3F, -24F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[96].setRotationPoint(-3F, -24F, 2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[97].setRotationPoint(-3F, -24F, -6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[98].setRotationPoint(17F, -23.5F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[99].setRotationPoint(17F, -23.5F, 2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[100].setRotationPoint(17F, -23.5F, -6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[101].setRotationPoint(27F, -23F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 96
		bodyModel[102].setRotationPoint(27F, -23F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[103].setRotationPoint(27F, -23F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[104].setRotationPoint(27F, -23F, 2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 112
		bodyModel[105].setRotationPoint(27F, -23F, 2F);
	}
}