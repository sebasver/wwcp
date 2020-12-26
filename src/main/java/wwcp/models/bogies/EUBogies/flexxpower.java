//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:14.02.2019 - 20:53:15
// Last changed on: 14.02.2019 - 20:53:15

package wwcp.models.bogies.EUBogies;

import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class flexxpower extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public flexxpower() //Same as Filename
		{
		bodyModel = new ModelRendererTurbo[84];

		initbodyModel_1();
		//flipAll();
		}

		private void initbodyModel_1()
		{
		flexxpowerModel = new ModelRendererTurbo[84];
		flexxpowerModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		flexxpowerModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 38
		flexxpowerModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 398
		flexxpowerModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 7
		flexxpowerModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 20
		flexxpowerModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		flexxpowerModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 36
		flexxpowerModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 37
		flexxpowerModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 38
		flexxpowerModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 39
		flexxpowerModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 40
		flexxpowerModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 41
		flexxpowerModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 42
		flexxpowerModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 45
		flexxpowerModel[14] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 46
		flexxpowerModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 47
		flexxpowerModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 48
		flexxpowerModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 49
		flexxpowerModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 50
		flexxpowerModel[19] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 51
		flexxpowerModel[20] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 52
		flexxpowerModel[21] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 53
		flexxpowerModel[22] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 54
		flexxpowerModel[23] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 55
		flexxpowerModel[24] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 56
		flexxpowerModel[25] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		flexxpowerModel[26] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 58
		flexxpowerModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 59
		flexxpowerModel[28] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 60
		flexxpowerModel[29] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 61
		flexxpowerModel[30] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 62
		flexxpowerModel[31] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 63
		flexxpowerModel[32] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 64
		flexxpowerModel[33] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 65
		flexxpowerModel[34] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 67
		flexxpowerModel[35] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 68
		flexxpowerModel[36] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 69
		flexxpowerModel[37] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 70
		flexxpowerModel[38] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 71
		flexxpowerModel[39] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 72
		flexxpowerModel[40] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 73
		flexxpowerModel[41] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 74
		flexxpowerModel[42] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 75
		flexxpowerModel[43] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 76
		flexxpowerModel[44] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 77
		flexxpowerModel[45] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 78
		flexxpowerModel[46] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 79
		flexxpowerModel[47] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 80
		flexxpowerModel[48] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 81
		flexxpowerModel[49] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 82
		flexxpowerModel[50] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 83
		flexxpowerModel[51] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 84
		flexxpowerModel[52] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 85
		flexxpowerModel[53] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 86
		flexxpowerModel[54] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 87
		flexxpowerModel[55] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 88
		flexxpowerModel[56] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 89
		flexxpowerModel[57] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 90
		flexxpowerModel[58] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 91
		flexxpowerModel[59] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 92
		flexxpowerModel[60] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 93
		flexxpowerModel[61] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 94
		flexxpowerModel[62] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 95
		flexxpowerModel[63] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 96
		flexxpowerModel[64] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 97
		flexxpowerModel[65] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 98
		flexxpowerModel[66] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 99
		flexxpowerModel[67] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 100
		flexxpowerModel[68] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 101
		flexxpowerModel[69] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 102
		flexxpowerModel[70] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 103
		flexxpowerModel[71] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 104
		flexxpowerModel[72] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 105
		flexxpowerModel[73] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 106
		flexxpowerModel[74] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 107
		flexxpowerModel[75] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 108
		flexxpowerModel[76] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 109
		flexxpowerModel[77] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 110
		flexxpowerModel[78] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 111
		flexxpowerModel[79] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 112
		flexxpowerModel[80] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 113
		flexxpowerModel[81] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 114
		flexxpowerModel[82] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 115
		flexxpowerModel[83] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 116

		flexxpowerModel[0].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 47
		flexxpowerModel[0].setRotationPoint(9F, 5.5F, -8F);

		flexxpowerModel[1].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 38
		flexxpowerModel[1].setRotationPoint(9F, 5.5F, -5.95F);

		flexxpowerModel[2].addBox(-0.5F, -0.5F, 0F, 8, 4, 4, 0F); // Box 398
		flexxpowerModel[2].setRotationPoint(-5F, 1F, -2F);

		flexxpowerModel[3].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 7
		flexxpowerModel[3].setRotationPoint(-12F, 5.5F, -8F);

		flexxpowerModel[4].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		flexxpowerModel[4].setRotationPoint(-19F, 2F, -7.5F);

		flexxpowerModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		flexxpowerModel[5].setRotationPoint(14F, 2F, -6.5F);

		flexxpowerModel[6].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 36
		flexxpowerModel[6].setRotationPoint(7F, 5F, -7.5F);

		flexxpowerModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 37
		flexxpowerModel[7].setRotationPoint(9.5F, 4.1F, -8F);

		flexxpowerModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 38
		flexxpowerModel[8].setRotationPoint(9.5F, 3.6F, -8F);

		flexxpowerModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		flexxpowerModel[9].setRotationPoint(7F, 4F, -7.5F);

		flexxpowerModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 40
		flexxpowerModel[10].setRotationPoint(6.5F, 4.1F, -8F);

		flexxpowerModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 41
		flexxpowerModel[11].setRotationPoint(6.5F, 3.6F, -8F);

		flexxpowerModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		flexxpowerModel[12].setRotationPoint(10F, 4F, -7.5F);

		flexxpowerModel[13].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		flexxpowerModel[13].setRotationPoint(-3F, 3F, -6.5F);

		flexxpowerModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		flexxpowerModel[14].setRotationPoint(4F, 2F, -7.5F);

		flexxpowerModel[15].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		flexxpowerModel[15].setRotationPoint(-5F, 3F, -7.5F);

		flexxpowerModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 48
		flexxpowerModel[16].setRotationPoint(-7F, 2F, -7.5F);

		flexxpowerModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 49
		flexxpowerModel[17].setRotationPoint(2F, 2F, -7.5F);

		flexxpowerModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 50
		flexxpowerModel[18].setRotationPoint(-4.5F, 1.1F, -8F);

		flexxpowerModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 51
		flexxpowerModel[19].setRotationPoint(-4.5F, 0.6F, -8F);

		flexxpowerModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 52
		flexxpowerModel[20].setRotationPoint(-0.5F, 1.1F, -8F);

		flexxpowerModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 53
		flexxpowerModel[21].setRotationPoint(-0.5F, 0.6F, -8F);

		flexxpowerModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		flexxpowerModel[22].setRotationPoint(0F, 0F, -7.5F);

		flexxpowerModel[23].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		flexxpowerModel[23].setRotationPoint(-4F, 0F, -7.5F);

		flexxpowerModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 56
		flexxpowerModel[24].setRotationPoint(-4.5F, 2.1F, -8F);

		flexxpowerModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 57
		flexxpowerModel[25].setRotationPoint(-4.5F, 1.6F, -8F);

		flexxpowerModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 58
		flexxpowerModel[26].setRotationPoint(-0.5F, 1.6F, -8F);

		flexxpowerModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 59
		flexxpowerModel[27].setRotationPoint(-0.5F, 2.1F, -8F);

		flexxpowerModel[28].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 60
		flexxpowerModel[28].setRotationPoint(8.5F, 5F, -5.9F);

		flexxpowerModel[29].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 61
		flexxpowerModel[29].setRotationPoint(10.5F, 2F, -5.9F);

		flexxpowerModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		flexxpowerModel[30].setRotationPoint(14F, 2F, 4.5F);

		flexxpowerModel[31].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		flexxpowerModel[31].setRotationPoint(4F, 2F, 6.5F);

		flexxpowerModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		flexxpowerModel[32].setRotationPoint(14F, 3F, -2.5F);

		flexxpowerModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 65
		flexxpowerModel[33].setRotationPoint(14F, 2F, 2.5F);

		flexxpowerModel[34].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		flexxpowerModel[34].setRotationPoint(14F, 2F, -4.5F);

		flexxpowerModel[35].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 68
		flexxpowerModel[35].setRotationPoint(-12F, 5.5F, -5.95F);

		flexxpowerModel[36].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 69
		flexxpowerModel[36].setRotationPoint(-14F, 5F, -7.5F);

		flexxpowerModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		flexxpowerModel[37].setRotationPoint(-14F, 4F, -7.5F);

		flexxpowerModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 71
		flexxpowerModel[38].setRotationPoint(-14.5F, 4.1F, -8F);

		flexxpowerModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 72
		flexxpowerModel[39].setRotationPoint(-14.5F, 3.6F, -8F);

		flexxpowerModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 73
		flexxpowerModel[40].setRotationPoint(-11.5F, 3.6F, -8F);

		flexxpowerModel[41].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 74
		flexxpowerModel[41].setRotationPoint(-11.5F, 4.1F, -8F);

		flexxpowerModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		flexxpowerModel[42].setRotationPoint(-11F, 4F, -7.5F);

		flexxpowerModel[43].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		flexxpowerModel[43].setRotationPoint(-19F, 2F, 6.5F);

		flexxpowerModel[44].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 77
		flexxpowerModel[44].setRotationPoint(7F, 5F, 6.5F);

		flexxpowerModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 78
		flexxpowerModel[45].setRotationPoint(9.5F, 4.1F, 6F);

		flexxpowerModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 79
		flexxpowerModel[46].setRotationPoint(9.5F, 3.6F, 6F);

		flexxpowerModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		flexxpowerModel[47].setRotationPoint(7F, 4F, 6.5F);

		flexxpowerModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 81
		flexxpowerModel[48].setRotationPoint(6.5F, 4.1F, 6F);

		flexxpowerModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 82
		flexxpowerModel[49].setRotationPoint(6.5F, 3.6F, 6F);

		flexxpowerModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		flexxpowerModel[50].setRotationPoint(10F, 4F, 6.5F);

		flexxpowerModel[51].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		flexxpowerModel[51].setRotationPoint(-5F, 3F, 6.5F);

		flexxpowerModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 85
		flexxpowerModel[52].setRotationPoint(-7F, 2F, 6.5F);

		flexxpowerModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 86
		flexxpowerModel[53].setRotationPoint(2F, 2F, 6.5F);

		flexxpowerModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 87
		flexxpowerModel[54].setRotationPoint(-4.5F, 1.1F, 6F);

		flexxpowerModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 88
		flexxpowerModel[55].setRotationPoint(-4.5F, 0.6F, 6F);

		flexxpowerModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 89
		flexxpowerModel[56].setRotationPoint(-0.5F, 1.1F, 6F);

		flexxpowerModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 90
		flexxpowerModel[57].setRotationPoint(-0.5F, 0.6F, 6F);

		flexxpowerModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		flexxpowerModel[58].setRotationPoint(0F, 0F, 6.5F);

		flexxpowerModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		flexxpowerModel[59].setRotationPoint(-4F, 0F, 6.5F);

		flexxpowerModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 93
		flexxpowerModel[60].setRotationPoint(-4.5F, 2.1F, 6F);

		flexxpowerModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 94
		flexxpowerModel[61].setRotationPoint(-4.5F, 1.6F, 6F);

		flexxpowerModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 95
		flexxpowerModel[62].setRotationPoint(-0.5F, 1.6F, 6F);

		flexxpowerModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 96
		flexxpowerModel[63].setRotationPoint(-0.5F, 2.1F, 6F);

		flexxpowerModel[64].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 97
		flexxpowerModel[64].setRotationPoint(-12F, 5.5F, 5.95F);

		flexxpowerModel[65].addShapeBox(-0.5F, -0.5F, 0F, 5, 2, 1, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 98
		flexxpowerModel[65].setRotationPoint(-14F, 5F, 6.5F);

		flexxpowerModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		flexxpowerModel[66].setRotationPoint(-14F, 4F, 6.5F);

		flexxpowerModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 100
		flexxpowerModel[67].setRotationPoint(-14.5F, 4.1F, 6F);

		flexxpowerModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F); // Box 101
		flexxpowerModel[68].setRotationPoint(-14.5F, 3.6F, 6F);

		flexxpowerModel[69].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 102
		flexxpowerModel[69].setRotationPoint(-11.5F, 3.6F, 6F);

		flexxpowerModel[70].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 103
		flexxpowerModel[70].setRotationPoint(-11.5F, 4.1F, 6F);

		flexxpowerModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		flexxpowerModel[71].setRotationPoint(-11F, 4F, 6.5F);

		flexxpowerModel[72].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 105
		flexxpowerModel[72].setRotationPoint(8.5F, 5F, 4.9F);

		flexxpowerModel[73].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 106
		flexxpowerModel[73].setRotationPoint(10.5F, 2F, 4.9F);

		flexxpowerModel[74].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 107
		flexxpowerModel[74].setRotationPoint(-12.5F, 5F, -5.9F);

		flexxpowerModel[75].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 108
		flexxpowerModel[75].setRotationPoint(-16.5F, 2F, -5.9F);

		flexxpowerModel[76].addBox(-0.5F, -0.5F, 0F, 2, 2, 1, 0F); // Box 109
		flexxpowerModel[76].setRotationPoint(-12.5F, 5F, 4.9F);

		flexxpowerModel[77].addShapeBox(-0.5F, -0.5F, 0F, 4, 5, 1, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F); // Box 110
		flexxpowerModel[77].setRotationPoint(-16.5F, 2F, 4.9F);

		flexxpowerModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 111
		flexxpowerModel[78].setRotationPoint(-19F, 2F, 2.5F);

		flexxpowerModel[79].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		flexxpowerModel[79].setRotationPoint(-19F, 2F, 4.5F);

		flexxpowerModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		flexxpowerModel[80].setRotationPoint(-19F, 3F, -2.5F);

		flexxpowerModel[81].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		flexxpowerModel[81].setRotationPoint(-19F, 2F, -4.5F);

		flexxpowerModel[82].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		flexxpowerModel[82].setRotationPoint(-19F, 2F, -6.5F);

		flexxpowerModel[83].addBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F); // Box 116
		flexxpowerModel[83].setRotationPoint(9F, 5.5F, 5.95F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 84; i++)
		{
			flexxpowerModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo flexxpowerModel[];
}