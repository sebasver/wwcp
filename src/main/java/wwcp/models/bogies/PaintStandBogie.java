//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 29.06.2022 - 13:44:31
// Last changed on: 29.06.2022 - 13:44:31

package wwcp.models.bogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class PaintStandBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public PaintStandBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[56];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 19
		bodyModel[13] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 8
		bodyModel[14] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 41
		bodyModel[16] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 55
		bodyModel[44] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 57
		bodyModel[46] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 58
		bodyModel[47] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 59
		bodyModel[48] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 33, 27, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 33, 27, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 33, 27, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 33, 27, textureX, textureY); // Box 55

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 0
		bodyModel[0].setRotationPoint(-3F, -6F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 1
		bodyModel[1].setRotationPoint(1F, -6F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(1F, -6F, -12F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-3F, -6F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 4
		bodyModel[4].setRotationPoint(-3F, -6F, 10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 5
		bodyModel[5].setRotationPoint(1F, -6F, 10F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 6
		bodyModel[6].setRotationPoint(-1F, -6F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 7
		bodyModel[7].setRotationPoint(-1F, -6F, 8F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 12
		bodyModel[8].setRotationPoint(-10F, 4F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 2, 20, 0F); // Box 13
		bodyModel[9].setRotationPoint(8F, 4F, -10F);

		bodyModel[10].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 14
		bodyModel[10].setRotationPoint(-8F, 4F, -10F);

		bodyModel[11].addBox(0F, 0F, 0F, 16, 2, 2, 0F); // Box 15
		bodyModel[11].setRotationPoint(-8F, 4F, 8F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 19
		bodyModel[12].setRotationPoint(-7F, 6F, -9F);

		bodyModel[13].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 8
		bodyModel[13].setRotationPoint(-5.5F, 7.5F, 6F);

		bodyModel[14].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 40
		bodyModel[14].setRotationPoint(-5.5F, 7.5F, -6F);

		bodyModel[15].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 41
		bodyModel[15].setRotationPoint(-5.5F, 7.5F, -8F);

		bodyModel[16].addBox(-0.5F, -0.5F, 0F, 1, 1, 16, 0F); // Box 23
		bodyModel[16].setRotationPoint(5.5F, 7.5F, -8F);

		bodyModel[17].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 24
		bodyModel[17].setRotationPoint(5.5F, 7.5F, 6F);

		bodyModel[18].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 25
		bodyModel[18].setRotationPoint(5.5F, 7.5F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[19].setRotationPoint(-6F, 8F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 27
		bodyModel[20].setRotationPoint(-6F, 6F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 29
		bodyModel[21].setRotationPoint(5F, 6F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 30
		bodyModel[22].setRotationPoint(4F, 6F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[23].setRotationPoint(5F, 8F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[24].setRotationPoint(5F, 6F, 9F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 33
		bodyModel[25].setRotationPoint(4F, 6F, 8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(5F, 8F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[27].setRotationPoint(-6F, 6F, 9F);

		bodyModel[28].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 36
		bodyModel[28].setRotationPoint(-7F, 6F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[29].setRotationPoint(-6F, 8F, 8F);

		bodyModel[30].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 38
		bodyModel[30].setRotationPoint(-3F, -4F, -9F);

		bodyModel[31].addBox(0F, 0F, 0F, 6, 6, 1, 0F); // Box 42
		bodyModel[31].setRotationPoint(-3F, -4F, 8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[32].setRotationPoint(3F, -4F, 8F);

		bodyModel[33].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 45
		bodyModel[33].setRotationPoint(-6F, 2F, 8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[34].setRotationPoint(-3F, -4F, -10F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[35].setRotationPoint(2F, -4F, -10F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[36].setRotationPoint(2F, -4F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[37].setRotationPoint(-3F, -4F, 9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[38].setRotationPoint(-6F, -4F, 8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[39].setRotationPoint(-6F, -4F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 12, 2, 1, 0F); // Box 52
		bodyModel[40].setRotationPoint(-6F, 2F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[41].setRotationPoint(3F, -4F, -9F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 54
		bodyModel[42].setRotationPoint(-6F, 2F, -8F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 2, 16, 0F); // Box 55
		bodyModel[43].setRotationPoint(5F, 2F, -8F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 56
		bodyModel[44].setRotationPoint(10F, 4F, -8F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 57
		bodyModel[45].setRotationPoint(10F, 4F, 6F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 58
		bodyModel[46].setRotationPoint(-11F, 4F, 6F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 59
		bodyModel[47].setRotationPoint(-11F, 4F, -8F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 5, 20, 0F); // Box 48
		bodyModel[48].setRotationPoint(-3F, -11F, -10F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 5, 20, 0F); // Box 49
		bodyModel[49].setRotationPoint(1F, -11F, -10F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 50
		bodyModel[50].setRotationPoint(-1F, -11F, -10F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Box 51
		bodyModel[51].setRotationPoint(-1F, -11F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[52].setRotationPoint(-3F, -11F, -12F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[53].setRotationPoint(1F, -11F, -12F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 54
		bodyModel[54].setRotationPoint(1F, -11F, 10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 55
		bodyModel[55].setRotationPoint(-3F, -11F, 10F);
	}
}