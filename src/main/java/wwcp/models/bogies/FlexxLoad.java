//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 06.03.2019 - 00:57:25
// Last changed on: 06.03.2019 - 00:57:25
package wwcp.models.bogies;

import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class FlexxLoad extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public FlexxLoad() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[85];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);
	}
	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 562
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 60
		bodyModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 61
		bodyModel[10] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 62
		bodyModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 64
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 26
		bodyModel[13] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 36
		bodyModel[14] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 37
		bodyModel[15] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 38
		bodyModel[16] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 40
		bodyModel[17] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 41
		bodyModel[18] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 80
		bodyModel[19] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 48
		bodyModel[20] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 50
		bodyModel[21] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 51
		bodyModel[22] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 54
		bodyModel[23] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 55
		bodyModel[24] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 56
		bodyModel[25] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 57
		bodyModel[26] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 58
		bodyModel[27] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 59
		bodyModel[28] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 60
		bodyModel[29] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 61
		bodyModel[30] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 62
		bodyModel[31] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 63
		bodyModel[32] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 64
		bodyModel[33] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 66
		bodyModel[34] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 68
		bodyModel[35] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 69
		bodyModel[36] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 70
		bodyModel[37] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 72
		bodyModel[38] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 73
		bodyModel[39] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 75
		bodyModel[40] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 76
		bodyModel[41] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 77
		bodyModel[42] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 78
		bodyModel[43] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 79
		bodyModel[44] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 80
		bodyModel[45] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 81
		bodyModel[46] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 82
		bodyModel[47] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 83
		bodyModel[48] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 84
		bodyModel[49] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 85
		bodyModel[50] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 86
		bodyModel[51] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 87
		bodyModel[52] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 88
		bodyModel[53] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 89
		bodyModel[54] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 90
		bodyModel[55] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 91
		bodyModel[56] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 92
		bodyModel[57] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 93
		bodyModel[58] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 94
		bodyModel[59] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 95
		bodyModel[60] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 96
		bodyModel[61] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 97
		bodyModel[62] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 98
		bodyModel[63] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 99
		bodyModel[64] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 100
		bodyModel[65] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 101
		bodyModel[66] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 102
		bodyModel[67] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 103
		bodyModel[68] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 104
		bodyModel[69] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 105
		bodyModel[70] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 106
		bodyModel[71] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 107
		bodyModel[72] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 108
		bodyModel[73] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 109
		bodyModel[74] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 110
		bodyModel[75] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 85
		bodyModel[76] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 86
		bodyModel[77] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 87
		bodyModel[78] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 88
		bodyModel[79] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 89
		bodyModel[80] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 90
		bodyModel[81] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 91
		bodyModel[82] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 92
		bodyModel[83] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 93
		bodyModel[84] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 94

		bodyModel[0].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 116
		bodyModel[0].setRotationPoint(6F, 6.5F, 5.95F);

		bodyModel[1].addBox(-0.5F, -0.5F, 0F, 8, 1, 4, 0F); // Box 562
		bodyModel[1].setRotationPoint(-7.5F, 3F, -2F);

		bodyModel[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 5
		bodyModel[2].setRotationPoint(-14F, 6.5F, 5.95F);

		bodyModel[3].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 6
		bodyModel[3].setRotationPoint(6F, 6.5F, -5.95F);

		bodyModel[4].addShapeBox(-4.5F, -4.5F, 0F, 9, 9, 0, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-14F, 6.5F, -5.95F);

		bodyModel[5].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 8
		bodyModel[5].setRotationPoint(-14F, 6.5F, -6F);

		bodyModel[6].addShapeBox(-0.5F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 9
		bodyModel[6].setRotationPoint(-4.5F, 7.5F, 5.75F);

		bodyModel[7].addShapeBox(-0.5F, -0.5F, 0F, 6, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 10
		bodyModel[7].setRotationPoint(-16F, 4.5F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -2F, 0F); // Box 60
		bodyModel[8].setRotationPoint(-6F, 4.5F, 3F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 61
		bodyModel[9].setRotationPoint(-5F, 4.5F, 5F);

		bodyModel[10].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 62
		bodyModel[10].setRotationPoint(-5F, 4.5F, 2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 1F, 0F); // Box 64
		bodyModel[11].setRotationPoint(-3F, 4.5F, 5F);

		bodyModel[12].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 12, 0F,-0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, -0.1F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 26
		bodyModel[12].setRotationPoint(-6F, 3.5F, -6F);

		bodyModel[13].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 36
		bodyModel[13].setRotationPoint(-14F, 7.5F, 6F);

		bodyModel[14].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 37
		bodyModel[14].setRotationPoint(-14F, 6F, 6F);

		bodyModel[15].addShapeBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F); // Box 38
		bodyModel[15].setRotationPoint(-13F, 6F, 6F);

		bodyModel[16].addShapeBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.2F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F); // Box 40
		bodyModel[16].setRotationPoint(-15F, 6F, 6F);

		bodyModel[17].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 41
		bodyModel[17].setRotationPoint(-16F, 6.5F, 6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F); // Box 80
		bodyModel[18].setRotationPoint(-16.5F, 4.9F, 5.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F); // Box 48
		bodyModel[19].setRotationPoint(-16.5F, 5.85F, 5.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F); // Box 50
		bodyModel[20].setRotationPoint(-16.5F, 4.7F, 5.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F); // Box 51
		bodyModel[21].setRotationPoint(-16.5F, 5.25F, 5.75F);

		bodyModel[22].addShapeBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.6F, 0F); // Box 54
		bodyModel[22].setRotationPoint(5F, 6F, -7F);

		bodyModel[23].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[23].setRotationPoint(6F, 6F, -7F);

		bodyModel[24].addShapeBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, -1.2F, -0.5F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[24].setRotationPoint(7F, 6F, -7F);

		bodyModel[25].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		bodyModel[25].setRotationPoint(6F, 7.5F, -7F);

		bodyModel[26].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 58
		bodyModel[26].setRotationPoint(6F, 6.5F, -6F);

		bodyModel[27].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 59
		bodyModel[27].setRotationPoint(8F, 6.5F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F); // Box 60
		bodyModel[28].setRotationPoint(7.5F, 5.85F, -6.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.6F); // Box 61
		bodyModel[29].setRotationPoint(7.5F, 4.9F, -6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F); // Box 62
		bodyModel[30].setRotationPoint(7.5F, 5.25F, -6.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F); // Box 63
		bodyModel[31].setRotationPoint(7.5F, 4.7F, -6.75F);

		bodyModel[32].addShapeBox(-0.5F, -0.5F, 0F, 6, 1, 1, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 64
		bodyModel[32].setRotationPoint(3F, 4.5F, -7F);

		bodyModel[33].addShapeBox(-0.5F, -0.5F, 0F, 6, 1, 1, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 66
		bodyModel[33].setRotationPoint(-16F, 4.5F, -7F);

		bodyModel[34].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 68
		bodyModel[34].setRotationPoint(-14F, 7.5F, -7F);

		bodyModel[35].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		bodyModel[35].setRotationPoint(-14F, 6F, -7F);

		bodyModel[36].addShapeBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[36].setRotationPoint(-13F, 6F, -7F);

		bodyModel[37].addShapeBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, -1.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.6F, 0F); // Box 72
		bodyModel[37].setRotationPoint(-15F, 6F, -7F);

		bodyModel[38].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 73
		bodyModel[38].setRotationPoint(-16F, 6.5F, -7F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.6F); // Box 75
		bodyModel[39].setRotationPoint(-16.5F, 4.9F, -6.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F); // Box 76
		bodyModel[40].setRotationPoint(-16.5F, 5.85F, -6.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F); // Box 77
		bodyModel[41].setRotationPoint(-16.5F, 4.7F, -6.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F); // Box 78
		bodyModel[42].setRotationPoint(-16.5F, 5.25F, -6.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1.1F, -0.1F, -0.5F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, -0.6F, -0.1F); // Box 79
		bodyModel[43].setRotationPoint(-0.5F, 5F, 5.75F);

		bodyModel[44].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -0.8F, -0.1F, -0.5F); // Box 80
		bodyModel[44].setRotationPoint(1F, 6.5F, 6F);

		bodyModel[45].addShapeBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.6F, -0.5F); // Box 81
		bodyModel[45].setRotationPoint(5F, 6F, 6F);

		bodyModel[46].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 82
		bodyModel[46].setRotationPoint(6F, 6F, 6F);

		bodyModel[47].addShapeBox(-0.5F, -0.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, 0F, -0.5F); // Box 83
		bodyModel[47].setRotationPoint(7F, 6F, 6F);

		bodyModel[48].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 84
		bodyModel[48].setRotationPoint(6F, 7.5F, 6F);

		bodyModel[49].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 85
		bodyModel[49].setRotationPoint(8F, 6.5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F); // Box 86
		bodyModel[50].setRotationPoint(7.5F, 5.85F, 5.75F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.6F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F); // Box 87
		bodyModel[51].setRotationPoint(7.5F, 4.9F, 5.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F); // Box 88
		bodyModel[52].setRotationPoint(7.5F, 5.25F, 5.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.45F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.225F, -0.2F, 0F, -0.45F, -0.2F, 0F, -0.275F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.475F, -0.2F, 0F, -0.275F, -0.2F); // Box 89
		bodyModel[53].setRotationPoint(7.5F, 4.7F, 5.75F);

		bodyModel[54].addShapeBox(-0.5F, -0.5F, 0F, 6, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 90
		bodyModel[54].setRotationPoint(3F, 4.5F, 6F);

		bodyModel[55].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0.5F, -3.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0.5F, -3.1F, -0.5F, 0.5F, -0.1F, 0F, 0F, -3.1F, 0F, 0F, -3.1F, -0.5F, 0.5F, -0.1F, -0.5F); // Box 91
		bodyModel[55].setRotationPoint(-2F, 4.5F, 6F);

		bodyModel[56].addShapeBox(-0.5F, -0.5F, 0F, 9, 1, 12, 0F,0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, -2F, -0.1F, 0.5F, -2F, -0.1F, 0.5F, -2F, -0.1F, 0.5F, -2F, -0.1F, 0.5F); // Box 92
		bodyModel[56].setRotationPoint(-7.5F, 8.3F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F); // Box 93
		bodyModel[57].setRotationPoint(0F, 5.9F, 5.5F);

		bodyModel[58].addShapeBox(-0.5F, -0.5F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 94
		bodyModel[58].setRotationPoint(-4.5F, 7F, 3F);

		bodyModel[59].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -0.1F, 0F, 0.5F, -3.1F, 0F, 0.5F, -3.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -3.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.5F, 0F, -3.1F, -0.5F); // Box 95
		bodyModel[59].setRotationPoint(-10F, 4.5F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, 0.4F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, -0.5F, 0.4F, -0.1F, -2F, 0F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, -2F, 0F, -0.1F); // Box 96
		bodyModel[60].setRotationPoint(-11.5F, 5F, 5.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F); // Box 97
		bodyModel[61].setRotationPoint(-8F, 5.9F, 5.5F);

		bodyModel[62].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 98
		bodyModel[62].setRotationPoint(-12F, 6.5F, 6F);

		bodyModel[63].addShapeBox(-0.5F, -0.5F, 0F, 2, 1, 1, 0F,0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F); // Box 99
		bodyModel[63].setRotationPoint(-4.5F, 7.5F, -6.75F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1.1F, -0.1F, -0.5F, 0.4F, -0.1F, -0.5F, 0.4F, -0.1F, 0F, -1.1F, -0.1F, 0F, -0.6F, -0.1F, -2F, 0F, -0.1F, -2F, 0F, -0.1F, 0F, -0.6F, -0.1F); // Box 100
		bodyModel[64].setRotationPoint(-0.5F, 5F, -6.75F);

		bodyModel[65].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.8F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, -0.8F, -0.1F, 0F); // Box 101
		bodyModel[65].setRotationPoint(1F, 6.5F, -7F);

		bodyModel[66].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0.5F, -3.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0.5F, -3.1F, 0F, 0.5F, -0.1F, -0.5F, 0F, -3.1F, -0.5F, 0F, -3.1F, 0F, 0.5F, -0.1F, 0F); // Box 102
		bodyModel[66].setRotationPoint(-2F, 4.5F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F); // Box 103
		bodyModel[67].setRotationPoint(0F, 5.9F, -6.5F);

		bodyModel[68].addShapeBox(-0.5F, -0.5F, 0F, 2, 2, 2, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 104
		bodyModel[68].setRotationPoint(-4.5F, 7F, -5F);

		bodyModel[69].addShapeBox(-0.5F, -0.5F, 0F, 5, 4, 1, 0F,0F, -0.1F, -0.5F, 0.5F, -3.1F, -0.5F, 0.5F, -3.1F, 0F, 0F, -0.1F, 0F, 0F, -3.1F, -0.5F, 0.5F, -0.1F, -0.5F, 0.5F, -0.1F, 0F, 0F, -3.1F, 0F); // Box 105
		bodyModel[69].setRotationPoint(-10F, 4.5F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, 0.4F, -0.1F, 0F, -1.1F, -0.1F, 0F, -1.1F, -0.1F, -0.5F, 0.4F, -0.1F, -2F, 0F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, -2F, 0F, -0.1F); // Box 106
		bodyModel[70].setRotationPoint(-11.5F, 5F, -6.75F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.6F, -0.35F, 0F, -0.6F); // Box 107
		bodyModel[71].setRotationPoint(-8F, 5.9F, -6.5F);

		bodyModel[72].addShapeBox(-0.5F, -0.5F, 0F, 4, 1, 1, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.5F, -0.8F, -0.1F, -0.5F, -0.8F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 108
		bodyModel[72].setRotationPoint(-12F, 6.5F, -7F);

		bodyModel[73].addShapeBox(-0.5F, -0.5F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 109
		bodyModel[73].setRotationPoint(-4.5F, 4F, -5F);

		bodyModel[74].addShapeBox(-0.5F, -0.5F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 110
		bodyModel[74].setRotationPoint(-4.5F, 4F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, -1F); // Box 85
		bodyModel[75].setRotationPoint(-7F, 4.5F, 5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 86
		bodyModel[76].setRotationPoint(-7F, 4.5F, 2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, -1F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 87
		bodyModel[77].setRotationPoint(-3F, 4.5F, 2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 2F, -2F, 0F, 0F, -2F, 0F); // Box 88
		bodyModel[78].setRotationPoint(-6F, 4.5F, -5F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 89
		bodyModel[79].setRotationPoint(-5F, 4.5F, -6F);

		bodyModel[80].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 90
		bodyModel[80].setRotationPoint(-5F, 4.5F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, -1F, -1F, 1F, 0F, 0F, 1F, 0F); // Box 91
		bodyModel[81].setRotationPoint(-3F, 4.5F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Box 92
		bodyModel[82].setRotationPoint(-7F, 4.5F, -6F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, -1F); // Box 93
		bodyModel[83].setRotationPoint(-7F, 4.5F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, -1F, 0F, 1F, 0F); // Box 94
		bodyModel[84].setRotationPoint(-3F, 4.5F, -3F);
	}
}