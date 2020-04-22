//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.05.2019 - 14:18:44
// Last changed on: 05.05.2019 - 14:18:44

package wwcp.models.tenders.germanTenders; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class T38Oil extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public T38Oil() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[99];

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
		bodyModel[22] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 92
		bodyModel[23] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 130
		bodyModel[24] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box Left door
		bodyModel[25] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 103
		bodyModel[26] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 130
		bodyModel[27] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 300
		bodyModel[28] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 103
		bodyModel[29] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 300
		bodyModel[30] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 300
		bodyModel[31] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 300
		bodyModel[32] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 360
		bodyModel[33] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 361
		bodyModel[34] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 362
		bodyModel[35] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 363
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 364
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 365
		bodyModel[38] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 384
		bodyModel[39] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 103
		bodyModel[40] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 103
		bodyModel[41] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 366
		bodyModel[42] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 367
		bodyModel[43] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 96
		bodyModel[44] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 122
		bodyModel[45] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 122
		bodyModel[46] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 122
		bodyModel[47] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 108
		bodyModel[48] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 109
		bodyModel[49] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 130
		bodyModel[50] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 75
		bodyModel[51] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 75
		bodyModel[52] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 75
		bodyModel[53] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 75
		bodyModel[54] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 75
		bodyModel[55] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 75
		bodyModel[56] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 158
		bodyModel[57] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 159
		bodyModel[58] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 160
		bodyModel[59] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 161
		bodyModel[60] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 162
		bodyModel[61] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 163
		bodyModel[62] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 87
		bodyModel[63] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 103
		bodyModel[64] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 103
		bodyModel[65] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 103
		bodyModel[66] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 103
		bodyModel[67] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 103
		bodyModel[68] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 103
		bodyModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 103
		bodyModel[70] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 172
		bodyModel[71] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 173
		bodyModel[72] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 174
		bodyModel[73] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 175
		bodyModel[74] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 176
		bodyModel[75] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 177
		bodyModel[76] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 178
		bodyModel[77] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 90
		bodyModel[78] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 90
		bodyModel[79] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 90
		bodyModel[80] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 92
		bodyModel[81] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 90
		bodyModel[82] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 90
		bodyModel[83] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 90
		bodyModel[84] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 90
		bodyModel[85] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 90
		bodyModel[86] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 90
		bodyModel[87] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 90
		bodyModel[88] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 96
		bodyModel[89] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 96
		bodyModel[90] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 96
		bodyModel[91] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 96
		bodyModel[92] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 96
		bodyModel[93] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 96
		bodyModel[94] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 96
		bodyModel[96] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 96
		bodyModel[98] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 107

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[0].setRotationPoint(39F, 2F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[1].setRotationPoint(40.5F, 1F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
		bodyModel[2].setRotationPoint(40.5F, 1F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[3].setRotationPoint(39F, 2F, 7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 10, 16, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[4].setRotationPoint(37F, -8F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[5].setRotationPoint(-13F, 3F, -1F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[6].setRotationPoint(17F, 3F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[7].setRotationPoint(34.5F, -13.5F, -10.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[8].setRotationPoint(34.5F, -13.5F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 119
		bodyModel[9].setRotationPoint(38F, -11F, 3F);
		bodyModel[9].rotateAngleY = -3.14159265F;

		bodyModel[10].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[10].setRotationPoint(37.25F, -14F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Box 52
		bodyModel[11].setRotationPoint(37.35F, -14F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[12].setRotationPoint(37F, 2F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[13].setRotationPoint(39.25F, -4F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Lamp
		bodyModel[14].setRotationPoint(39.35F, -4F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[15].setRotationPoint(39.3F, -1.9F, 6F);
		bodyModel[15].rotateAngleZ = 1.57079633F;

		bodyModel[16].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[16].setRotationPoint(39F, -1.9F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[17].setRotationPoint(39.25F, -4F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.875F, -0.125F, -0.125F); // Lamp
		bodyModel[18].setRotationPoint(39.35F, -4F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[19].setRotationPoint(39.3F, -1.9F, -6F);
		bodyModel[19].rotateAngleZ = 1.57079633F;

		bodyModel[20].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[20].setRotationPoint(39F, -1.9F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F, 0F, -0.3F, -0.15F); // Box 52
		bodyModel[21].setRotationPoint(37F, -12.4F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 57, 17, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[22].setRotationPoint(-23F, -15F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[23].setRotationPoint(-28F, -2.1F, -10F);

		bodyModel[24].addShapeBox(-3F, 0F, -1F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box Left door
		bodyModel[24].setRotationPoint(-23F, -12F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[25].setRotationPoint(-23.5F, -2F, -10.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 130
		bodyModel[26].setRotationPoint(-28F, -0.1F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 300
		bodyModel[27].setRotationPoint(-26.5F, -2F, -11.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[28].setRotationPoint(-27F, -2F, -10.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[29].setRotationPoint(-26.5F, 0.5F, -11.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[30].setRotationPoint(-26.5F, 3F, -11.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[31].setRotationPoint(-26.5F, 5.5F, -11.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[32].setRotationPoint(-23.5F, -2F, 9.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 361
		bodyModel[33].setRotationPoint(-26.5F, -2F, 9.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[34].setRotationPoint(-27F, -2F, 9.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 363
		bodyModel[35].setRotationPoint(-26.5F, 0.5F, 9.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 364
		bodyModel[36].setRotationPoint(-26.5F, 3F, 9.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 365
		bodyModel[37].setRotationPoint(-26.5F, 5.5F, 9.5F);

		bodyModel[38].addShapeBox(-3F, 0F, -1F, 3, 9, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[38].setRotationPoint(-23F, -12F, 11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[39].setRotationPoint(-27F, -2F, -10.25F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[40].setRotationPoint(-23.5F, -2F, -10.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[41].setRotationPoint(-27F, -2F, 9.25F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[42].setRotationPoint(-23.5F, -2F, 9.25F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 43, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[43].setRotationPoint(-23F, -22F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 15, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[44].setRotationPoint(34F, -13F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[45].setRotationPoint(37F, -13F, -11F);
		bodyModel[45].rotateAngleZ = 0.03490659F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 16, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F); // Box 122
		bodyModel[46].setRotationPoint(37F, -13F, 8F);
		bodyModel[46].rotateAngleZ = 0.03490659F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[47].setRotationPoint(34F, -15F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[48].setRotationPoint(27.5F, -15.25F, -10.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[49].setRotationPoint(27.5F, -15.25F, 8.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[50].setRotationPoint(15F, -23F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[51].setRotationPoint(9F, -23F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[52].setRotationPoint(3F, -23F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[53].setRotationPoint(-4F, -23F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[54].setRotationPoint(-11F, -23F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[55].setRotationPoint(-18F, -23F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[56].setRotationPoint(15F, -23F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[57].setRotationPoint(9F, -23F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[58].setRotationPoint(3F, -23F, -7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[59].setRotationPoint(-4F, -23F, -7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[60].setRotationPoint(-11F, -23F, -7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[61].setRotationPoint(-18F, -23F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 60, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[62].setRotationPoint(-23F, 2F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 51, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 103
		bodyModel[63].setRotationPoint(-20F, 4.5F, -10.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[64].setRotationPoint(-20F, 2.5F, -10.75F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[65].setRotationPoint(-10F, 2.5F, -10.75F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[66].setRotationPoint(30F, 2.5F, -10.75F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[67].setRotationPoint(20F, 2.5F, -10.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[68].setRotationPoint(10F, 2.5F, -10.75F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 103
		bodyModel[69].setRotationPoint(0F, 2.5F, -10.75F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 51, 1, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 172
		bodyModel[70].setRotationPoint(-20F, 4.5F, 9.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[71].setRotationPoint(-20F, 2.5F, 9.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[72].setRotationPoint(-10F, 2.5F, 9.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[73].setRotationPoint(30F, 2.5F, 9.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[74].setRotationPoint(20F, 2.5F, 9.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[75].setRotationPoint(10F, 2.5F, 9.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[76].setRotationPoint(0F, 2.5F, 9.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[77].setRotationPoint(-24.25F, -7F, -5.25F);

		bodyModel[78].addShapeBox(0.5F, -1F, 0.25F, 0, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F); // Box 90
		bodyModel[78].setRotationPoint(-24.25F, -7F, -5.25F);

		bodyModel[79].addShapeBox(0F, 2F, 1F, 1, 4, 1, 0F,-0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 90
		bodyModel[79].setRotationPoint(-24.25F, -7F, -5.25F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 19, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[80].setRotationPoint(-23.25F, -21F, -5F);

		bodyModel[81].addShapeBox(0F, -1F, -1F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -4.25F, 0F, -4.25F, -4.25F); // Box 90
		bodyModel[81].setRotationPoint(-23.5F, -14.5F, 4F);

		bodyModel[82].addShapeBox(0F, -1F, -1F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -4.25F, 0F, -4.25F, -4.25F); // Box 90
		bodyModel[82].setRotationPoint(-23.5F, -17.5F, 3F);

		bodyModel[83].addShapeBox(0F, -1F, -1F, 1, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -4.25F, 0F, -4.25F, -4.25F); // Box 90
		bodyModel[83].setRotationPoint(-23.5F, -15.5F, -3F);

		bodyModel[84].addShapeBox(0F, -1F, -1F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F, -6F); // Box 90
		bodyModel[84].setRotationPoint(-23.75F, -14F, -0.5F);
		bodyModel[84].rotateAngleX = 0.2268928F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 90
		bodyModel[85].setRotationPoint(-23.7F, -14.25F, -0.75F);

		bodyModel[86].addShapeBox(0F, -1F, -1F, 0, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, -6F, -6F); // Box 90
		bodyModel[86].setRotationPoint(-23.75F, -12F, -3.5F);
		bodyModel[86].rotateAngleX = -0.62831853F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 90
		bodyModel[87].setRotationPoint(-23.7F, -12.25F, -3.75F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 16, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[88].setRotationPoint(20F, -21F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[89].setRotationPoint(20F, -22.5F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 16, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[90].setRotationPoint(20F, -22F, -5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.75F, 0.25F, 0F, -0.75F); // Box 96
		bodyModel[91].setRotationPoint(36.5F, -23F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.25F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -0.75F, 0.25F, 0F, -0.75F); // Box 96
		bodyModel[92].setRotationPoint(34.5F, -24F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 43, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[93].setRotationPoint(-23F, -23F, -2F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 43, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[94].setRotationPoint(-23F, -23F, 2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 43, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[95].setRotationPoint(-23F, -23F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 96
		bodyModel[96].setRotationPoint(20F, -23F, 2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 96
		bodyModel[97].setRotationPoint(20F, -23F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 16, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 107
		bodyModel[98].setRotationPoint(20F, -23F, -4F);
	}
}