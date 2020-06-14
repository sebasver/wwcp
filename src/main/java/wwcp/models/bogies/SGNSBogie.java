//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.03.2019 - 14:54:13
// Last changed on: 17.03.2019 - 14:54:13

package wwcp.models.bogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class SGNSBogie extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public SGNSBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[37];

		initbodyModel_1();
		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box50
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box51
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box55
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box63
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box64
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box65
		bodyModel[6] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box70
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box71
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box74
		bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box75
		bodyModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box80
		bodyModel[11] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 207
		bodyModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 208
		bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 210
		bodyModel[14] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 211
		bodyModel[15] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 212
		bodyModel[16] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 213
		bodyModel[17] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 214
		bodyModel[18] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 215
		bodyModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 216
		bodyModel[20] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 36

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box50
		bodyModel[0].setRotationPoint(8.5F, 6F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box51
		bodyModel[1].setRotationPoint(1F, 3F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box55
		bodyModel[2].setRotationPoint(4F, 3F, 6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box63
		bodyModel[3].setRotationPoint(1F, 6F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, -0.5F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.6F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -2.1F, 0F, 0.5F, -2.1F, -0.5F, -0.5F, -0.5F, -0.5F); // Box64
		bodyModel[4].setRotationPoint(3F, 5F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.4F, 0F, -2.1F, -0.3F, 0F, -2.1F, -0.3F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.1F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, -0.5F, -0.5F, -0.1F, -0.5F); // Box65
		bodyModel[5].setRotationPoint(7F, 4F, 6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box70
		bodyModel[6].setRotationPoint(9.5F, 5F, 6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box71
		bodyModel[7].setRotationPoint(7.5F, 5F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box74
		bodyModel[8].setRotationPoint(1F, 4F, 6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box75
		bodyModel[9].setRotationPoint(3F, 4F, 6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, -0.3F, -0.2F, -1.1F, -0.3F); // Box80
		bodyModel[10].setRotationPoint(7.5F, 7F, 6F);

		bodyModel[11].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 207
		bodyModel[11].setRotationPoint(9F, 6.5F, 5.95F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F); // Box 208
		bodyModel[12].setRotationPoint(-7F, 3F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2.1F, -0.3F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.5F, -2.1F, -0.3F, -0.5F, 1F, -0.5F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, -0.5F, 1F, -0.5F, -0.5F); // Box 210
		bodyModel[13].setRotationPoint(-6F, 4F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 211
		bodyModel[14].setRotationPoint(-5.5F, 5F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 212
		bodyModel[15].setRotationPoint(-3.5F, 5F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, -0.3F, -0.2F, -1.1F, -0.3F); // Box 213
		bodyModel[16].setRotationPoint(-5.5F, 7F, 6F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 214
		bodyModel[17].setRotationPoint(-4.5F, 6F, -7F);

		bodyModel[18].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 215
		bodyModel[18].setRotationPoint(-4F, 6.5F, 5.95F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, 0.6F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, -2.1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.5F, -2.1F, -0.5F); // Box 216
		bodyModel[19].setRotationPoint(-2F, 5F, 6F);

		bodyModel[20].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 20
		bodyModel[20].setRotationPoint(9F, 6.5F, -5.95F);

		bodyModel[21].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 21
		bodyModel[21].setRotationPoint(-4F, 6.5F, -5.95F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(4F, 3F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 23
		bodyModel[23].setRotationPoint(1F, 6F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, 0.6F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0.5F, -2.1F, -0.5F, 0.5F, -2.1F, 0F, -0.5F, -0.5F, 0F); // Box 24
		bodyModel[24].setRotationPoint(3F, 5F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.5F, -0.4F, -0.5F, -2.1F, -0.3F, -0.5F, -2.1F, -0.3F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.1F, -0.5F, 1F, -0.5F, -0.5F, 1F, -0.5F, 0F, -0.5F, -0.1F, 0F); // Box 25
		bodyModel[25].setRotationPoint(7F, 4F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 26
		bodyModel[26].setRotationPoint(9.5F, 5F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 27
		bodyModel[27].setRotationPoint(7.5F, 5F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(1F, 4F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(3F, 4F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -1.1F, -0.3F, -0.2F, -1.1F, -0.3F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F); // Box 30
		bodyModel[30].setRotationPoint(7.5F, 7F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-7F, 3F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2.1F, -0.3F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F, -0.4F, 0F, -2.1F, -0.3F, 0F, 1F, -0.5F, -0.5F, -0.5F, -0.1F, -0.5F, -0.5F, -0.1F, 0F, 1F, -0.5F, 0F); // Box 32
		bodyModel[32].setRotationPoint(-6F, 4F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 33
		bodyModel[33].setRotationPoint(-5.5F, 5F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 34
		bodyModel[34].setRotationPoint(-3.5F, 5F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -1.1F, -0.3F, -0.2F, -1.1F, -0.3F, -0.2F, -1.1F, 0F, -0.2F, -1.1F, 0F); // Box 35
		bodyModel[35].setRotationPoint(-5.5F, 7F, -7F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.5F, 0.6F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, 0.6F, 0F, 0.5F, -2.1F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0.5F, -2.1F, 0F); // Box 36
		bodyModel[36].setRotationPoint(-2F, 5F, -7F);
	}
}