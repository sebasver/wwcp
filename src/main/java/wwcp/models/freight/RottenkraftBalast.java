//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 24.06.2018 - 18:33:10
// Last changed on: 24.06.2018 - 18:33:10

package wwcp.models.freight; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class RottenkraftBalast extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public RottenkraftBalast() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[78];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 26
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 33
		bodyModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 36
		bodyModel[4] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 32
		bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 33
		bodyModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 17
		bodyModel[10] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 33
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 16
		bodyModel[20] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 17
		bodyModel[21] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 19
		bodyModel[22] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 17
		bodyModel[23] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 19
		bodyModel[24] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 16
		bodyModel[25] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 16
		bodyModel[26] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 16
		bodyModel[27] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 16
		bodyModel[28] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 0
		bodyModel[30] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 52
		bodyModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 52
		bodyModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 52
		bodyModel[33] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 52
		bodyModel[34] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 52
		bodyModel[36] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 26
		bodyModel[37] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 26
		bodyModel[38] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 0
		bodyModel[39] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 0
		bodyModel[40] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 52
		bodyModel[42] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 0
		bodyModel[45] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 16
		bodyModel[48] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 16
		bodyModel[49] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 16
		bodyModel[50] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 16
		bodyModel[51] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 16
		bodyModel[52] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 16
		bodyModel[53] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 33
		bodyModel[54] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 33
		bodyModel[55] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 52
		bodyModel[56] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 52
		bodyModel[57] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 52
		bodyModel[58] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 0
		bodyModel[59] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 52
		bodyModel[60] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 52
		bodyModel[61] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 52
		bodyModel[62] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 52
		bodyModel[63] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 52
		bodyModel[64] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 52
		bodyModel[65] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 0
		bodyModel[66] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 52
		bodyModel[67] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 52
		bodyModel[68] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 52
		bodyModel[69] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 56
		bodyModel[70] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 56
		bodyModel[71] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		bodyModel[72] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 2
		bodyModel[73] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 56
		bodyModel[74] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 56
		bodyModel[75] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 2
		bodyModel[76] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 2
		bodyModel[77] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 50, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-25F, 1F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[1].setRotationPoint(16F, 5F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[2].setRotationPoint(15F, 5F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[3].setRotationPoint(18F, 5F, 7F);
		bodyModel[3].rotateAngleY = -3.14159265F;

		bodyModel[4].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[4].setRotationPoint(16.5F, 5.5F, 5.98F);

		bodyModel[5].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[5].setRotationPoint(16.5F, 5.5F, -5.98F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[6].setRotationPoint(14F, 4F, -7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[7].setRotationPoint(14F, 4F, 5.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[8].setRotationPoint(21.5F, 3F, -6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[9].setRotationPoint(18.5F, 3F, 5.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[10].setRotationPoint(14.5F, 3F, 6.5F);
		bodyModel[10].rotateAngleY = -3.14159265F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(18.5F, 3F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[12].setRotationPoint(14.5F, 3F, -6F);
		bodyModel[12].rotateAngleY = -3.14159265F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[13].setRotationPoint(-17F, 5F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[14].setRotationPoint(-15F, 5F, 7F);
		bodyModel[14].rotateAngleY = -3.14159265F;

		bodyModel[15].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[15].setRotationPoint(-16.5F, 5.5F, 5.98F);

		bodyModel[16].addShapeBox(-3F, -3F, 0F, 6, 6, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[16].setRotationPoint(-16.5F, 5.5F, -5.98F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[17].setRotationPoint(-19F, 4F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,4F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[18].setRotationPoint(-19F, 4F, 5.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[19].setRotationPoint(-23F, 3F, -6.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[20].setRotationPoint(-14.5F, 3F, 5.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[21].setRotationPoint(-18.5F, 3F, 6.5F);
		bodyModel[21].rotateAngleY = -3.14159265F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[22].setRotationPoint(-14.5F, 3F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 19
		bodyModel[23].setRotationPoint(-18.5F, 3F, -6F);
		bodyModel[23].rotateAngleY = -3.14159265F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[24].setRotationPoint(21.5F, 2F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[25].setRotationPoint(21.5F, 2F, 5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[26].setRotationPoint(-23F, 2F, -6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[27].setRotationPoint(-23F, 2F, 5.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(-18F, 5F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[29].setRotationPoint(24F, -3F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 52
		bodyModel[30].setRotationPoint(6.5F, -2.5F, 10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 52
		bodyModel[31].setRotationPoint(19.5F, -2.5F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[32].setRotationPoint(6.5F, -2.5F, -10.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[33].setRotationPoint(19.5F, -2.5F, -10.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[34].setRotationPoint(25F, -2.5F, -5.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[35].setRotationPoint(25F, -2.5F, 5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 0, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[36].setRotationPoint(-22F, 4F, -7F);
		bodyModel[36].rotateAngleZ = -0.06981317F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 0, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[37].setRotationPoint(22F, 4F, -7F);
		bodyModel[37].rotateAngleZ = 0.06981317F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 49, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[38].setRotationPoint(-24.5F, -3F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 49, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[39].setRotationPoint(-24.5F, -3F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 52
		bodyModel[40].setRotationPoint(-19.5F, -2.5F, 10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 52
		bodyModel[41].setRotationPoint(-6.5F, -2.5F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[42].setRotationPoint(-19.5F, -2.5F, -10.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 52
		bodyModel[43].setRotationPoint(-6.5F, -2.5F, -10.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[44].setRotationPoint(-25.5F, -3F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 52
		bodyModel[45].setRotationPoint(-25.5F, -2.5F, -5.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, -0.5F); // Box 52
		bodyModel[46].setRotationPoint(-25.5F, -2.5F, 5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[47].setRotationPoint(10F, 3F, -6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[48].setRotationPoint(10F, 2F, -6.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[49].setRotationPoint(10F, 2F, 5.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[50].setRotationPoint(-11.5F, 3F, -6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[51].setRotationPoint(-11.5F, 2F, -6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[52].setRotationPoint(-11.5F, 2F, 5.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[53].setRotationPoint(-10F, 3F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[54].setRotationPoint(-10F, 3F, 5.5F);

		bodyModel[55].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[55].setRotationPoint(25F, -3F, 7.75F);

		bodyModel[56].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[56].setRotationPoint(25F, -3F, -7.75F);

		bodyModel[57].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[57].setRotationPoint(25F, -6F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[58].setRotationPoint(24.5F, -5.5F, -0.25F);

		bodyModel[59].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[59].setRotationPoint(24.6F, -3F, 7.75F);

		bodyModel[60].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[60].setRotationPoint(24.6F, -3F, -7.75F);

		bodyModel[61].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[61].setRotationPoint(24.6F, -6F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[62].setRotationPoint(-25.5F, -3F, 7.75F);

		bodyModel[63].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[63].setRotationPoint(-25.5F, -3F, -7.75F);

		bodyModel[64].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[64].setRotationPoint(-25.5F, -6F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[65].setRotationPoint(-25F, -5.5F, -0.25F);

		bodyModel[66].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[66].setRotationPoint(-26.5F, -3F, 7.75F);

		bodyModel[67].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[67].setRotationPoint(-26.5F, -3F, -7.75F);

		bodyModel[68].addShapeBox(0F, 0F, -1F, 1, 2, 2, 0F,-0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F); // Box 52
		bodyModel[68].setRotationPoint(-26.5F, -6F, 0F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[69].setRotationPoint(26.5F, -1F, -10F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[70].setRotationPoint(26.5F, -1F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[71].setRotationPoint(25F, 0F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[72].setRotationPoint(25F, 0F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[73].setRotationPoint(-28F, -1F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[74].setRotationPoint(-28F, -1F, 7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[75].setRotationPoint(-27F, 0F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[76].setRotationPoint(-27F, 0F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 49, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[77].setRotationPoint(-24.5F, -2.5F, -9.5F);
	}
}