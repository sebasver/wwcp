//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.12.2020 - 10:59:54
// Last changed on: 10.12.2020 - 10:59:54

package wwcp.models.bogies.AmericanTrucks; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class MacBogieFront extends ModelBase //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public MacBogieFront() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[86];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 39
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 173
		bodyModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 22
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 23
		bodyModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 68
		bodyModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 69
		bodyModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 70
		bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 151
		bodyModel[16] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 153
		bodyModel[17] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 155
		bodyModel[18] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 24
		bodyModel[19] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 31
		bodyModel[28] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 40
		bodyModel[31] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 53
		bodyModel[51] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 136
		bodyModel[52] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 140
		bodyModel[53] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 141
		bodyModel[54] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 45
		bodyModel[55] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 62
		bodyModel[56] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 63
		bodyModel[57] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 64
		bodyModel[58] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 65
		bodyModel[59] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 66
		bodyModel[60] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 67
		bodyModel[61] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 124
		bodyModel[62] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 69
		bodyModel[63] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 70
		bodyModel[64] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 71
		bodyModel[65] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 72
		bodyModel[66] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 73
		bodyModel[67] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 74
		bodyModel[68] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 75
		bodyModel[69] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 76
		bodyModel[70] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 77
		bodyModel[71] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 78
		bodyModel[72] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 79
		bodyModel[73] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 80
		bodyModel[74] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 81
		bodyModel[75] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 82
		bodyModel[76] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 159
		bodyModel[77] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 55
		bodyModel[78] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 87
		bodyModel[79] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 88
		bodyModel[80] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 89
		bodyModel[81] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 90
		bodyModel[82] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 91
		bodyModel[83] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 92
		bodyModel[84] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 93
		bodyModel[85] = new ModelRendererTurbo(this, 65, 97, textureX, textureY); // Box 94

		bodyModel[0].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[0].setRotationPoint(16F, 6.5F, -5.95F);

		bodyModel[1].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[1].setRotationPoint(16F, 6.5F, 5.95F);

		bodyModel[2].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 6
		bodyModel[2].setRotationPoint(-12F, 6.5F, -5.95F);

		bodyModel[3].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 8
		bodyModel[3].setRotationPoint(-12F, 6.5F, 5.95F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 4
		bodyModel[4].setRotationPoint(15F, 5.5F, -9F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 5
		bodyModel[5].setRotationPoint(1F, 5.5F, -9F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 9
		bodyModel[6].setRotationPoint(-13F, 5.5F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 173
		bodyModel[7].setRotationPoint(15F, 5.5F, 8.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 22
		bodyModel[8].setRotationPoint(1F, 5.5F, 8.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 23
		bodyModel[9].setRotationPoint(-13F, 5.5F, 8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[10].setRotationPoint(1F, 5.5F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 69
		bodyModel[11].setRotationPoint(15F, 5.5F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 70
		bodyModel[12].setRotationPoint(-13F, 5.5F, -9.5F);

		bodyModel[13].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 15
		bodyModel[13].setRotationPoint(2F, 6.5F, 5.95F);

		bodyModel[14].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 16
		bodyModel[14].setRotationPoint(2F, 6.5F, -5.95F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 151
		bodyModel[15].setRotationPoint(-20F, 2.5F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[16].setRotationPoint(-20F, 2.5F, 5F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 3, 10, 0F); // Box 155
		bodyModel[17].setRotationPoint(-20F, 3.5F, -5F);

		bodyModel[18].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 24
		bodyModel[18].setRotationPoint(-15F, 2F, 7F);

		bodyModel[19].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 26
		bodyModel[19].setRotationPoint(-9F, 2.5F, 7F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 27
		bodyModel[20].setRotationPoint(-1F, 2F, 7F);

		bodyModel[21].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 28
		bodyModel[21].setRotationPoint(5F, 2.5F, 7F);

		bodyModel[22].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 29
		bodyModel[22].setRotationPoint(13F, 2F, 7F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 30
		bodyModel[23].setRotationPoint(19F, 3.5F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		bodyModel[24].setRotationPoint(17F, 4.5F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 29
		bodyModel[25].setRotationPoint(13F, 4.5F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 30
		bodyModel[26].setRotationPoint(-1F, 4.5F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 31
		bodyModel[27].setRotationPoint(3F, 4.5F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 32
		bodyModel[28].setRotationPoint(-11F, 4.5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 33
		bodyModel[29].setRotationPoint(-15F, 4.5F, 8F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 40
		bodyModel[30].setRotationPoint(-6.75F, 5.5F, 7F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 41
		bodyModel[31].setRotationPoint(7.75F, 5.5F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 37
		bodyModel[32].setRotationPoint(-18F, 2.5F, 7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 38
		bodyModel[33].setRotationPoint(-20F, 2.5F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-20F, 2.5F, -9F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 3, 2, 0F); // Box 40
		bodyModel[35].setRotationPoint(-18F, 2.5F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 41
		bodyModel[36].setRotationPoint(5F, 2.5F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 42
		bodyModel[37].setRotationPoint(19F, 3.5F, -9F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 43
		bodyModel[38].setRotationPoint(13F, 2F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 44
		bodyModel[39].setRotationPoint(-1F, 2F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 8, 3, 2, 0F); // Box 45
		bodyModel[40].setRotationPoint(-9F, 2.5F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 6, 3, 2, 0F); // Box 46
		bodyModel[41].setRotationPoint(-15F, 2F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(3F, 4.5F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 48
		bodyModel[43].setRotationPoint(-1F, 4.5F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 49
		bodyModel[44].setRotationPoint(13F, 4.5F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[45].setRotationPoint(17F, 4.5F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[46].setRotationPoint(-11F, 4.5F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 52
		bodyModel[47].setRotationPoint(-15F, 4.5F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 11, 6, 11, 0F); // Box 51
		bodyModel[48].setRotationPoint(7F, 2F, -5.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 11, 6, 11, 0F); // Box 52
		bodyModel[49].setRotationPoint(-14F, 2F, -5.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 10, 7, 11, 0F); // Box 53
		bodyModel[50].setRotationPoint(-3F, 1.5F, -5.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 136
		bodyModel[51].setRotationPoint(10.5F, 2F, 7.25F);

		bodyModel[52].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 140
		bodyModel[52].setRotationPoint(13F, 2.45F, 9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 141
		bodyModel[53].setRotationPoint(12F, 2.45F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[54].setRotationPoint(15.5F, 1.5F, 9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[55].setRotationPoint(15.5F, 1.5F, 8F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 63
		bodyModel[56].setRotationPoint(-1F, 2.45F, 9F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 64
		bodyModel[57].setRotationPoint(-3.5F, 2F, 7.25F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F); // Box 65
		bodyModel[58].setRotationPoint(-2F, 2.45F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		bodyModel[59].setRotationPoint(1.5F, 1.5F, 9F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[60].setRotationPoint(1.5F, 1.5F, 8F);

		bodyModel[61].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 124
		bodyModel[61].setRotationPoint(0F, 1F, -2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 69
		bodyModel[62].setRotationPoint(8F, 1.5F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 70
		bodyModel[63].setRotationPoint(-6F, 1.5F, 7F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 71
		bodyModel[64].setRotationPoint(-1F, 2.45F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 72
		bodyModel[65].setRotationPoint(-2F, 2.45F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 73
		bodyModel[66].setRotationPoint(-3.5F, 2F, -8.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[67].setRotationPoint(1.5F, 1.5F, -10F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 75
		bodyModel[68].setRotationPoint(1.5F, 1.5F, -9F);

		bodyModel[69].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 76
		bodyModel[69].setRotationPoint(10.5F, 2F, -8.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 0, 2, 0F,-1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 77
		bodyModel[70].setRotationPoint(12F, 2.45F, -10F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 78
		bodyModel[71].setRotationPoint(13F, 2.45F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[72].setRotationPoint(15.5F, 1.5F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[73].setRotationPoint(15.5F, 1.5F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 81
		bodyModel[74].setRotationPoint(8F, 1.5F, -9F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 82
		bodyModel[75].setRotationPoint(-6F, 1.5F, -9F);

		bodyModel[76].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 159
		bodyModel[76].setRotationPoint(6.25F, 7.5F, 8.01F);

		bodyModel[77].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 55
		bodyModel[77].setRotationPoint(-8.25F, 7.5F, 8.01F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 87
		bodyModel[78].setRotationPoint(7.75F, 5.5F, -8F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 88
		bodyModel[79].setRotationPoint(-6.75F, 5.5F, -8F);

		bodyModel[80].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 89
		bodyModel[80].setRotationPoint(-8.25F, 7.5F, -8.01F);

		bodyModel[81].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Box 90
		bodyModel[81].setRotationPoint(6.25F, 7.5F, -8.01F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 91
		bodyModel[82].setRotationPoint(3.5F, 6F, 7.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 92
		bodyModel[83].setRotationPoint(-10.5F, 6F, 7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 93
		bodyModel[84].setRotationPoint(3.5F, 6F, -8.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 94
		bodyModel[85].setRotationPoint(-10.5F, 6F, -8.5F);
	}
}