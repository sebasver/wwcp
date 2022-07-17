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

public class V160Bogie2 extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public V160Bogie2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[107];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 57, 45, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 97, 45, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 121, 45, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 81, 45, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 97, 45, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 193, 45, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 209, 45, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 225, 45, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 241, 45, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 257, 45, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 65, 45, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 257, 45, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 297, 45, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 305, 45, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 321, 45, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 329, 45, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 345, 45, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 361, 45, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 377, 45, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 393, 45, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 409, 45, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 425, 45, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 441, 45, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 457, 45, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 473, 45, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 481, 45, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 489, 45, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 497, 45, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 505, 45, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 1, 53, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 9, 53, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 17, 53, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 25, 53, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 33, 53, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 41, 53, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 49, 53, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 57, 53, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 81, 53, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 65, 53, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 89, 53, textureX, textureY); // Box 48
		bodyModel[44] = new ModelRendererTurbo(this, 97, 53, textureX, textureY); // Box 49
		bodyModel[45] = new ModelRendererTurbo(this, 105, 53, textureX, textureY); // Box 50
		bodyModel[46] = new ModelRendererTurbo(this, 121, 53, textureX, textureY); // Box 51
		bodyModel[47] = new ModelRendererTurbo(this, 129, 53, textureX, textureY); // Box 52
		bodyModel[48] = new ModelRendererTurbo(this, 137, 53, textureX, textureY); // Box 53
		bodyModel[49] = new ModelRendererTurbo(this, 209, 53, textureX, textureY); // Box 54
		bodyModel[50] = new ModelRendererTurbo(this, 225, 53, textureX, textureY); // Box 55
		bodyModel[51] = new ModelRendererTurbo(this, 241, 53, textureX, textureY); // Box 56
		bodyModel[52] = new ModelRendererTurbo(this, 257, 53, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 297, 53, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 313, 53, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 329, 53, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 345, 53, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 361, 53, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 385, 53, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 401, 53, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 409, 53, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 417, 53, textureX, textureY); // Box 66
		bodyModel[62] = new ModelRendererTurbo(this, 425, 53, textureX, textureY); // Box 67
		bodyModel[63] = new ModelRendererTurbo(this, 441, 53, textureX, textureY); // Box 68
		bodyModel[64] = new ModelRendererTurbo(this, 449, 53, textureX, textureY); // Box 69
		bodyModel[65] = new ModelRendererTurbo(this, 457, 53, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 465, 53, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 473, 53, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 489, 53, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 505, 53, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 1, 61, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 9, 61, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 17, 61, textureX, textureY); // Box 77
		bodyModel[73] = new ModelRendererTurbo(this, 25, 61, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 33, 61, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 41, 61, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 89, 61, textureX, textureY); // Box 81
		bodyModel[77] = new ModelRendererTurbo(this, 129, 61, textureX, textureY); // Box 82
		bodyModel[78] = new ModelRendererTurbo(this, 137, 61, textureX, textureY); // Box 83
		bodyModel[79] = new ModelRendererTurbo(this, 153, 61, textureX, textureY); // Box 84
		bodyModel[80] = new ModelRendererTurbo(this, 161, 61, textureX, textureY); // Box 85
		bodyModel[81] = new ModelRendererTurbo(this, 169, 61, textureX, textureY); // Box 86
		bodyModel[82] = new ModelRendererTurbo(this, 177, 61, textureX, textureY); // Box 87
		bodyModel[83] = new ModelRendererTurbo(this, 185, 61, textureX, textureY); // Box 88
		bodyModel[84] = new ModelRendererTurbo(this, 201, 61, textureX, textureY); // Box 89
		bodyModel[85] = new ModelRendererTurbo(this, 217, 61, textureX, textureY); // Box 90
		bodyModel[86] = new ModelRendererTurbo(this, 225, 61, textureX, textureY); // Box 91
		bodyModel[87] = new ModelRendererTurbo(this, 233, 61, textureX, textureY); // Box 92
		bodyModel[88] = new ModelRendererTurbo(this, 313, 61, textureX, textureY); // Box 93
		bodyModel[89] = new ModelRendererTurbo(this, 329, 61, textureX, textureY); // Box 94
		bodyModel[90] = new ModelRendererTurbo(this, 345, 61, textureX, textureY); // Box 95
		bodyModel[91] = new ModelRendererTurbo(this, 361, 61, textureX, textureY); // Box 96
		bodyModel[92] = new ModelRendererTurbo(this, 377, 61, textureX, textureY); // Box 97
		bodyModel[93] = new ModelRendererTurbo(this, 393, 61, textureX, textureY); // Box 98
		bodyModel[94] = new ModelRendererTurbo(this, 409, 61, textureX, textureY); // Box 99
		bodyModel[95] = new ModelRendererTurbo(this, 249, 61, textureX, textureY); // Box 100
		bodyModel[96] = new ModelRendererTurbo(this, 409, 61, textureX, textureY); // Box 101
		bodyModel[97] = new ModelRendererTurbo(this, 449, 61, textureX, textureY); // Box 102
		bodyModel[98] = new ModelRendererTurbo(this, 1, 69, textureX, textureY); // Box 103
		bodyModel[99] = new ModelRendererTurbo(this, 433, 61, textureX, textureY); // Box 104
		bodyModel[100] = new ModelRendererTurbo(this, 89, 69, textureX, textureY); // Box 105
		bodyModel[101] = new ModelRendererTurbo(this, 121, 69, textureX, textureY); // Box 106
		bodyModel[102] = new ModelRendererTurbo(this, 441, 61, textureX, textureY); // Box 107
		bodyModel[103] = new ModelRendererTurbo(this, 449, 61, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 505, 53, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 249, 61, textureX, textureY); // Box 100
		bodyModel[106] = new ModelRendererTurbo(this, 433, 61, textureX, textureY); // Box 104

		bodyModel[0].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 0
		bodyModel[0].setRotationPoint(-15F, 3F, 6F);

		bodyModel[1].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 0
		bodyModel[1].setRotationPoint(7F, 3F, 6F);

		bodyModel[2].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 0
		bodyModel[2].setRotationPoint(-15F, 3F, -6F);

		bodyModel[3].addBox(0F, 0F, 0F, 7, 7, 0, 0F); // Box 0
		bodyModel[3].setRotationPoint(7F, 3F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 4
		bodyModel[4].setRotationPoint(-12.5F, 5.5F, -7F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 14, 0F); // Box 5
		bodyModel[5].setRotationPoint(9.5F, 5.5F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 32, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-16.5F, 1.5F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(15.5F, 1.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 10
		bodyModel[8].setRotationPoint(15.5F, 4.5F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(-19.5F, 1.5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(-19.5F, 4.5F, -9F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 13
		bodyModel[11].setRotationPoint(9F, 4.5F, -9F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 14
		bodyModel[12].setRotationPoint(-13F, 4.5F, -9F);

		bodyModel[13].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 15
		bodyModel[13].setRotationPoint(-3.5F, 6.5F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-0.5F, 2F, -9F);

		bodyModel[15].addBox(0F, 0F, 0F, 7, 1, 18, 0F); // Box 17
		bodyModel[15].setRotationPoint(-3.5F, 1F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 18
		bodyModel[16].setRotationPoint(3.5F, 1F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(3.5F, 5.5F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-5.5F, 1F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-9.5F, 5.5F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 25
		bodyModel[20].setRotationPoint(0.5F, 2.25F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[21].setRotationPoint(0.5F, 3.25F, -10F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 27
		bodyModel[22].setRotationPoint(0.5F, 4.25F, -10F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 28
		bodyModel[23].setRotationPoint(0.5F, 5.25F, -10F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(-3.5F, 4.25F, -10F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[25].setRotationPoint(-3.5F, 2.25F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[26].setRotationPoint(-3.5F, 3.25F, -10F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(-3.5F, 5.25F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[28].setRotationPoint(1F, 2F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		bodyModel[29].setRotationPoint(-3F, 2F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[30].setRotationPoint(7F, 4.5F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(12F, 4.5F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(12F, 6.5F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[33].setRotationPoint(12F, 5.5F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(9.5F, 5F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 40
		bodyModel[35].setRotationPoint(9.5F, 3.5F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(10.5F, 3.5F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 42
		bodyModel[37].setRotationPoint(7F, 6.5F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[38].setRotationPoint(3.5F, 6.5F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[39].setRotationPoint(-5.5F, 6.5F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[40].setRotationPoint(-10F, 6.5F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[41].setRotationPoint(-10F, 4.5F, -9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[42].setRotationPoint(-11.5F, 3.5F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 48
		bodyModel[43].setRotationPoint(-12.5F, 3.5F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[44].setRotationPoint(-14F, 4.5F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[45].setRotationPoint(-14F, 5.5F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 51
		bodyModel[46].setRotationPoint(-14F, 6.5F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[47].setRotationPoint(-12.5F, 5F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 32, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[48].setRotationPoint(-16.5F, 1.5F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[49].setRotationPoint(-19.5F, 1.5F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[50].setRotationPoint(-19.5F, 4.5F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[51].setRotationPoint(15.5F, 1.5F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 57
		bodyModel[52].setRotationPoint(15.5F, 4.5F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 58
		bodyModel[53].setRotationPoint(-14.5F, 2.5F, -9F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[54].setRotationPoint(-11.5F, 2.5F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[55].setRotationPoint(10.5F, 2.5F, -9F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 61
		bodyModel[56].setRotationPoint(7.5F, 2.5F, -9F);

		bodyModel[57].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 62
		bodyModel[57].setRotationPoint(-3.5F, 6.5F, 8F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 63
		bodyModel[58].setRotationPoint(9F, 4.5F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[59].setRotationPoint(12F, 4.5F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[60].setRotationPoint(12F, 5.5F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[61].setRotationPoint(12F, 6.5F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[62].setRotationPoint(3.5F, 5.5F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 68
		bodyModel[63].setRotationPoint(7F, 6.5F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[64].setRotationPoint(7F, 4.5F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 70
		bodyModel[65].setRotationPoint(9.5F, 3.5F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[66].setRotationPoint(10.5F, 3.5F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 72
		bodyModel[67].setRotationPoint(7.5F, 2.5F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[68].setRotationPoint(10.5F, 2.5F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(3.5F, 6.5F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 75
		bodyModel[70].setRotationPoint(1F, 2F, 8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 76
		bodyModel[71].setRotationPoint(-0.5F, 2F, 8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 77
		bodyModel[72].setRotationPoint(-3F, 2F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 78
		bodyModel[73].setRotationPoint(-5.5F, 1F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[74].setRotationPoint(3.5F, 1F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 80
		bodyModel[75].setRotationPoint(-9.5F, 5.5F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[76].setRotationPoint(-10F, 4.5F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[77].setRotationPoint(-11.5F, 3.5F, 8F);

		bodyModel[78].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 83
		bodyModel[78].setRotationPoint(-13F, 4.5F, 8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[79].setRotationPoint(-10F, 6.5F, 8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 85
		bodyModel[80].setRotationPoint(-14F, 6.5F, 8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[81].setRotationPoint(-14F, 5.5F, 8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[82].setRotationPoint(-14F, 4.5F, 8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 88
		bodyModel[83].setRotationPoint(-14.5F, 2.5F, 8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[84].setRotationPoint(-11.5F, 2.5F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[85].setRotationPoint(9.5F, 5F, 8.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[86].setRotationPoint(-12.5F, 5F, 8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 92
		bodyModel[87].setRotationPoint(-3.5F, 2.25F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 93
		bodyModel[88].setRotationPoint(-3.5F, 3.25F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 94
		bodyModel[89].setRotationPoint(-3.5F, 4.25F, 8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F); // Box 95
		bodyModel[90].setRotationPoint(-3.5F, 5.25F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 96
		bodyModel[91].setRotationPoint(0.5F, 5.25F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 97
		bodyModel[92].setRotationPoint(0.5F, 4.25F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 98
		bodyModel[93].setRotationPoint(0.5F, 3.25F, 8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 99
		bodyModel[94].setRotationPoint(0.5F, 2.25F, 8F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 100
		bodyModel[95].setRotationPoint(-16.5F, 1.5F, -7F);

		bodyModel[96].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 101
		bodyModel[96].setRotationPoint(-18.5F, 6.5F, -7F);

		bodyModel[97].addBox(0F, 0F, 0F, 3, 1, 14, 0F); // Box 102
		bodyModel[97].setRotationPoint(14.5F, 6.5F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 32, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[98].setRotationPoint(-16.5F, 1.5F, -5F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 104
		bodyModel[99].setRotationPoint(-16.5F, 1.5F, 5F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 105
		bodyModel[100].setRotationPoint(-19.5F, 4.5F, -7F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 106
		bodyModel[101].setRotationPoint(17.5F, 4.5F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 107
		bodyModel[102].setRotationPoint(-12.5F, 3.5F, 8F);

		bodyModel[103].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 103
		bodyModel[103].setRotationPoint(-1.5F, 0F, -1.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 104
		bodyModel[104].setRotationPoint(-5.5F, 6.5F, 8F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 100
		bodyModel[105].setRotationPoint(14.5F, 1.5F, -7F);

		bodyModel[106].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 104
		bodyModel[106].setRotationPoint(14.5F, 1.5F, 5F);
	}
}