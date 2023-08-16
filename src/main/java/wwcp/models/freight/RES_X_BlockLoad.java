//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.03.2019 - 18:16:07
// Last changed on: 18.03.2019 - 18:16:07

package wwcp.models.freight; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class RES_X_BlockLoad extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public RES_X_BlockLoad() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[108];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 0
		bodyModel[23] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 0
		bodyModel[24] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 0
		bodyModel[25] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 0
		bodyModel[26] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 0
		bodyModel[27] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 0
		bodyModel[28] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 0
		bodyModel[29] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 0
		bodyModel[32] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 0
		bodyModel[33] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 0
		bodyModel[34] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 0
		bodyModel[35] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 0
		bodyModel[36] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 0
		bodyModel[37] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		bodyModel[41] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 0
		bodyModel[42] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 0
		bodyModel[43] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 12
		bodyModel[44] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		bodyModel[45] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 12
		bodyModel[46] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		bodyModel[47] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		bodyModel[48] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 13
		bodyModel[49] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 13
		bodyModel[50] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 13
		bodyModel[51] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 14
		bodyModel[52] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		bodyModel[53] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		bodyModel[54] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 14
		bodyModel[55] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 15
		bodyModel[56] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 15
		bodyModel[57] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 15
		bodyModel[58] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 15
		bodyModel[59] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 155
		bodyModel[60] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 155
		bodyModel[61] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 155
		bodyModel[62] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 155
		bodyModel[63] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 156
		bodyModel[64] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 156
		bodyModel[65] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 156
		bodyModel[66] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 156
		bodyModel[67] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 157
		bodyModel[68] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 157
		bodyModel[69] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 157
		bodyModel[70] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 157
		bodyModel[71] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 16
		bodyModel[72] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 16
		bodyModel[73] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 16
		bodyModel[74] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 16
		bodyModel[75] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 17
		bodyModel[76] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 17
		bodyModel[77] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 17
		bodyModel[78] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 17
		bodyModel[79] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 17
		bodyModel[80] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 17
		bodyModel[81] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 18
		bodyModel[82] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 18
		bodyModel[83] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 18
		bodyModel[84] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 18
		bodyModel[85] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 182
		bodyModel[86] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 183
		bodyModel[87] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 184
		bodyModel[88] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 184
		bodyModel[89] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 185
		bodyModel[90] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 186
		bodyModel[91] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 187
		bodyModel[92] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 188
		bodyModel[93] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 189
		bodyModel[94] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 39
		bodyModel[95] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 39
		bodyModel[96] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 396
		bodyModel[97] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 397
		bodyModel[98] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 398
		bodyModel[99] = new ModelRendererTurbo(this, 209, 136, textureX, textureY); // BlockLoad8.2
		bodyModel[100] = new ModelRendererTurbo(this, 278, 136, textureX, textureY); // BlockLoad9.2
		bodyModel[101] = new ModelRendererTurbo(this, 140, 136, textureX, textureY); // BlockLoad7
		bodyModel[102] = new ModelRendererTurbo(this, 70, 136, textureX, textureY); // BlockLoad6
		bodyModel[103] = new ModelRendererTurbo(this, 1, 136, textureX, textureY); // BlockLoad5
		bodyModel[104] = new ModelRendererTurbo(this, 209, 100, textureX, textureY); // BlockLoad4
		bodyModel[105] = new ModelRendererTurbo(this, 140, 100, textureX, textureY); // BlockLoad3
		bodyModel[106] = new ModelRendererTurbo(this, 70, 100, textureX, textureY); // BlockLoad2
		bodyModel[107] = new ModelRendererTurbo(this, 1, 100, textureX, textureY); // BlockLoad1

		bodyModel[0].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(-43.5F, -9F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[1].setRotationPoint(-60.1F, -9F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[2].setRotationPoint(-24F, -9F, 10F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(42.5F, -9F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[4].setRotationPoint(59.1F, -9F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[5].setRotationPoint(-60.1F, -9F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[6].setRotationPoint(59.1F, -9F, 10F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[7].setRotationPoint(42.5F, -9F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[8].setRotationPoint(-43.5F, -9F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[9].setRotationPoint(-6.5F, -9F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[10].setRotationPoint(5.5F, -9F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-44.5F, 2F, 7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[12].setRotationPoint(36.5F, 2F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[13].setRotationPoint(-6.5F, -9F, 10F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[14].setRotationPoint(-24F, -9F, -11F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[15].setRotationPoint(23F, -9F, 10F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[16].setRotationPoint(5.5F, -9F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 11, 1, 0F); // Box 0
		bodyModel[17].setRotationPoint(23F, -9F, -11F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-43F, -4F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[19].setRotationPoint(-23.5F, -4F, 9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-72.5F, -4F, 9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-59.6F, -4F, 9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[22].setRotationPoint(5.5F, -4F, 9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 0
		bodyModel[23].setRotationPoint(59.5F, -4F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[24].setRotationPoint(-6F, -4F, 9F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[25].setRotationPoint(23F, -4F, 9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[26].setRotationPoint(43F, -4F, 9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[27].setRotationPoint(-43F, -4F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[28].setRotationPoint(-23.5F, -4F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(-72.5F, -4F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[30].setRotationPoint(-59.6F, -4F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 18, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[31].setRotationPoint(5.5F, -4F, -10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 13, 4, 1, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F); // Box 0
		bodyModel[32].setRotationPoint(59.5F, -4F, -10F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 12, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[33].setRotationPoint(-6F, -4F, -10F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[34].setRotationPoint(23F, -4F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 17, 4, 1, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[35].setRotationPoint(43F, -4F, -10F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 0
		bodyModel[36].setRotationPoint(72.5F, -4F, -10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 73, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[37].setRotationPoint(-36.5F, 2F, 7F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 4, 20, 0F); // Box 0
		bodyModel[38].setRotationPoint(-73.5F, -4F, -10F);

		bodyModel[39].addBox(0F, 0F, 0F, 147, 2, 20, 0F); // Box 0
		bodyModel[39].setRotationPoint(-73.5F, 0F, -10F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[40].setRotationPoint(36.5F, 2F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 0
		bodyModel[41].setRotationPoint(-44.5F, 2F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 73, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[42].setRotationPoint(-36.5F, 2F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[43].setRotationPoint(78F, 0F, -8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 12
		bodyModel[44].setRotationPoint(-79F, 0F, -6.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 12
		bodyModel[45].setRotationPoint(-79F, 0F, 7.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[46].setRotationPoint(78F, 0F, 5.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[47].setRotationPoint(78F, 0F, 6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[48].setRotationPoint(78F, 0F, -7.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[49].setRotationPoint(-79F, 0F, 6.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[50].setRotationPoint(-79F, 0F, -7.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 14
		bodyModel[51].setRotationPoint(-79F, 0F, -8.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[52].setRotationPoint(78F, 0F, -6.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 14
		bodyModel[53].setRotationPoint(-79F, 0F, 5.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[54].setRotationPoint(78F, 0F, 7.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[55].setRotationPoint(78F, 1F, 5.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[56].setRotationPoint(78F, 1F, -8.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		bodyModel[57].setRotationPoint(-79F, 1F, 5.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		bodyModel[58].setRotationPoint(-79F, 1F, -8.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 155
		bodyModel[59].setRotationPoint(-76.5F, 0.5F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[60].setRotationPoint(73.5F, 0.5F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[61].setRotationPoint(73.5F, 0.5F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 155
		bodyModel[62].setRotationPoint(-76.5F, 0.5F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[63].setRotationPoint(-79F, 0.75F, -8.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 156
		bodyModel[64].setRotationPoint(78F, 0.75F, -8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 156
		bodyModel[65].setRotationPoint(78F, 0.75F, 5.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 156
		bodyModel[66].setRotationPoint(-79F, 0.75F, 5.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 157
		bodyModel[67].setRotationPoint(-78F, 0.25F, -7.75F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 157
		bodyModel[68].setRotationPoint(-78F, 0.25F, 6.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 157
		bodyModel[69].setRotationPoint(77F, 0.25F, -8.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 157
		bodyModel[70].setRotationPoint(77F, 0.25F, 5.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[71].setRotationPoint(78F, 2F, -8.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 16
		bodyModel[72].setRotationPoint(-79F, 2F, -6.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 16
		bodyModel[73].setRotationPoint(-79F, 2F, 7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[74].setRotationPoint(78F, 2F, 5.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 17
		bodyModel[75].setRotationPoint(-79F, 2F, -7.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 17
		bodyModel[76].setRotationPoint(57F, 2F, -1.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 17
		bodyModel[77].setRotationPoint(-60F, 2F, -1.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[78].setRotationPoint(78F, 2F, 6.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[79].setRotationPoint(78F, 2F, -7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 17
		bodyModel[80].setRotationPoint(-79F, 2F, 6.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 18
		bodyModel[81].setRotationPoint(-79F, 2F, 5.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 18
		bodyModel[82].setRotationPoint(-79F, 2F, -8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 18
		bodyModel[83].setRotationPoint(78F, 2F, -6.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F); // Box 18
		bodyModel[84].setRotationPoint(78F, 2F, 7.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 182
		bodyModel[85].setRotationPoint(73.5F, 1F, -0.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 183
		bodyModel[86].setRotationPoint(75.75F, 1F, -0.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 184
		bodyModel[87].setRotationPoint(-74F, 3.4F, 9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 184
		bodyModel[88].setRotationPoint(75.75F, 2F, -0.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[89].setRotationPoint(-75.5F, 4.4F, 8.25F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 186
		bodyModel[90].setRotationPoint(-76F, 4.65F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F); // Box 187
		bodyModel[91].setRotationPoint(73F, 4.65F, -9.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[92].setRotationPoint(73.5F, 4.4F, -10.25F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, -0.5F, 0.4F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 189
		bodyModel[93].setRotationPoint(72.5F, 3.4F, -9.5F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 39
		bodyModel[94].setRotationPoint(71.5F, 2F, -10F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 1, 20, 0F); // Box 39
		bodyModel[95].setRotationPoint(-73.5F, 2F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.25F, 0F, -0.25F); // Box 396
		bodyModel[96].setRotationPoint(-74.5F, 1F, -0.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 397
		bodyModel[97].setRotationPoint(-75.75F, 2F, -0.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 398
		bodyModel[98].setRotationPoint(-76.75F, 1F, -0.5F);

		bodyModel[99].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad8.2
		bodyModel[99].setRotationPoint(40F, -16F, -8F);

		bodyModel[100].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad9.2
		bodyModel[100].setRotationPoint(56F, -16F, -8F);

		bodyModel[101].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad7
		bodyModel[101].setRotationPoint(24F, -16F, -8F);

		bodyModel[102].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad6
		bodyModel[102].setRotationPoint(8F, -16F, -8F);

		bodyModel[103].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad5
		bodyModel[103].setRotationPoint(-8F, -16F, -8F);

		bodyModel[104].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad4
		bodyModel[104].setRotationPoint(-24F, -16F, -8F);

		bodyModel[105].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad3
		bodyModel[105].setRotationPoint(-40F, -16F, -8F);

		bodyModel[106].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad2
		bodyModel[106].setRotationPoint(-56F, -16F, -8F);

		bodyModel[107].addBox(0F, 0F, 0F, 16, 16, 16, 0F); // BlockLoad1
		bodyModel[107].setRotationPoint(-72F, -16F, -8F);
	}
}