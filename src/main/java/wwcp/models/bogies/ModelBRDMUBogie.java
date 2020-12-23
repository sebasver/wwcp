//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.11.2020 - 23:00:11
// Last changed on: 22.11.2020 - 23:00:11

package wwcp.models.bogies; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class ModelBRDMUBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBRDMUBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[59];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 96
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 101
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 102
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 103
		bodyModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 104
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 105
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 106
		bodyModel[7] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 107
		bodyModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 111
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 112
		bodyModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 113
		bodyModel[11] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 114
		bodyModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 115
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 116
		bodyModel[14] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 117
		bodyModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 118
		bodyModel[16] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 119
		bodyModel[17] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 120
		bodyModel[18] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 121
		bodyModel[19] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 122
		bodyModel[20] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 123
		bodyModel[21] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 124
		bodyModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 125
		bodyModel[23] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 126
		bodyModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 127
		bodyModel[25] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 128
		bodyModel[26] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 129
		bodyModel[27] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 130
		bodyModel[28] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 131
		bodyModel[29] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 132
		bodyModel[30] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 133
		bodyModel[31] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 134
		bodyModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 135
		bodyModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 136
		bodyModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 137
		bodyModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 138
		bodyModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 139
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 140
		bodyModel[38] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 141
		bodyModel[39] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 142
		bodyModel[40] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 143
		bodyModel[41] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 144
		bodyModel[42] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 145
		bodyModel[43] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 146
		bodyModel[44] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 147
		bodyModel[45] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 148
		bodyModel[46] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 149
		bodyModel[47] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 150
		bodyModel[48] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 154
		bodyModel[49] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 155
		bodyModel[50] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 156
		bodyModel[51] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 157
		bodyModel[52] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 9
		bodyModel[53] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 39
		bodyModel[54] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 42
		bodyModel[55] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 161
		bodyModel[56] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 162
		bodyModel[57] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 163
		bodyModel[58] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 165

		bodyModel[0].addBox(0F, 0F, 0F, 35, 2, 1, 0F); // Box 96
		bodyModel[0].setRotationPoint(-18.5F, 3.5F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 101
		bodyModel[1].setRotationPoint(8.5F, 5.5F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 102
		bodyModel[2].setRotationPoint(7.5F, 5.5F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[3].setRotationPoint(12.5F, 5.5F, -9F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 104
		bodyModel[4].setRotationPoint(9.5F, 5.5F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[5].setRotationPoint(10F, 4.5F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 106
		bodyModel[6].setRotationPoint(5F, 4.5F, -9.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[7].setRotationPoint(11F, 4.5F, -9.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 111
		bodyModel[8].setRotationPoint(5F, 4F, -9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 112
		bodyModel[9].setRotationPoint(15F, 4F, -9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 113
		bodyModel[10].setRotationPoint(4.5F, 5.5F, -9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 114
		bodyModel[11].setRotationPoint(14.5F, 5.5F, -9.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 115
		bodyModel[12].setRotationPoint(-16.5F, 5.5F, -9.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 116
		bodyModel[13].setRotationPoint(-16F, 4F, -9.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 117
		bodyModel[14].setRotationPoint(-16F, 4.5F, -9.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[15].setRotationPoint(-11F, 4.5F, -9.5F);

		bodyModel[16].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 119
		bodyModel[16].setRotationPoint(-11.5F, 5.5F, -9.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 120
		bodyModel[17].setRotationPoint(-12.5F, 5.5F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 121
		bodyModel[18].setRotationPoint(-13.5F, 5.5F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[19].setRotationPoint(-8.5F, 5.5F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[20].setRotationPoint(-10F, 4.5F, -9.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 124
		bodyModel[21].setRotationPoint(-6F, 4F, -9.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 125
		bodyModel[22].setRotationPoint(-6.5F, 5.5F, -9.5F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 126
		bodyModel[23].setRotationPoint(15.5F, 3.5F, -8F);

		bodyModel[24].addBox(0F, 0F, 0F, 35, 2, 1, 0F); // Box 127
		bodyModel[24].setRotationPoint(-18.5F, 3.5F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 128
		bodyModel[25].setRotationPoint(-13.5F, 5.5F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 129
		bodyModel[26].setRotationPoint(-12.5F, 5.5F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[27].setRotationPoint(-8.5F, 5.5F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 131
		bodyModel[28].setRotationPoint(7.5F, 5.5F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 132
		bodyModel[29].setRotationPoint(8.5F, 5.5F, 8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[30].setRotationPoint(12.5F, 5.5F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 134
		bodyModel[31].setRotationPoint(-18.5F, 3.5F, -8F);

		bodyModel[32].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 135
		bodyModel[32].setRotationPoint(-11.5F, 5.5F, 8.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 136
		bodyModel[33].setRotationPoint(-16.5F, 5.5F, 8.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 137
		bodyModel[34].setRotationPoint(-16F, 4F, 8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 138
		bodyModel[35].setRotationPoint(-16F, 4.5F, 8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[36].setRotationPoint(-11F, 4.5F, 8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[37].setRotationPoint(-10F, 4.5F, 8.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 141
		bodyModel[38].setRotationPoint(-6F, 4F, 8.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 142
		bodyModel[39].setRotationPoint(-6.5F, 5.5F, 8.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 143
		bodyModel[40].setRotationPoint(14.5F, 5.5F, 8.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 144
		bodyModel[41].setRotationPoint(15F, 4F, 8.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[42].setRotationPoint(11F, 4.5F, 8.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[43].setRotationPoint(10F, 4.5F, 8.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 147
		bodyModel[44].setRotationPoint(5F, 4.5F, 8.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 148
		bodyModel[45].setRotationPoint(5F, 4F, 8.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 149
		bodyModel[46].setRotationPoint(4.5F, 5.5F, 8.5F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 150
		bodyModel[47].setRotationPoint(9.5F, 5.5F, 8.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 3, 2, 16, 0F); // Box 154
		bodyModel[48].setRotationPoint(-1.5F, 3.5F, -8F);

		bodyModel[49].addBox(0F, 0F, 0F, 5, 2, 16, 0F); // Box 155
		bodyModel[49].setRotationPoint(-2.5F, 5.5F, -8F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 156
		bodyModel[50].setRotationPoint(-0.5F, 5.5F, -9F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 157
		bodyModel[51].setRotationPoint(-0.5F, 5.5F, 8F);

		bodyModel[52].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 9
		bodyModel[52].setRotationPoint(10.5F, 6.5F, 6F);

		bodyModel[53].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 39
		bodyModel[53].setRotationPoint(10.5F, 6.5F, -6F);

		bodyModel[54].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 42
		bodyModel[54].setRotationPoint(10.5F, 6.5F, -8F);

		bodyModel[55].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 161
		bodyModel[55].setRotationPoint(-10.5F, 6.5F, -8F);

		bodyModel[56].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 162
		bodyModel[56].setRotationPoint(-10.5F, 6.5F, -6F);

		bodyModel[57].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Box 163
		bodyModel[57].setRotationPoint(-10.5F, 6.5F, 6F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 3, 0F); // Box 165
		bodyModel[58].setRotationPoint(-1.5F, 2.5F, -1.5F);
	}
}