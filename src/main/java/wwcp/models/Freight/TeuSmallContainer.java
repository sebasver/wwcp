//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.04.2018 - 12:16:49
// Last changed on: 01.04.2018 - 12:16:49


package wwcp.models.Freight; //Path where the model is located


import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class TeuSmallContainer extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public TeuSmallContainer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[60];

		initbodyModel_1();


		this.fixRotation(this.bodyModel, new boolean[]{false, true, true});
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box Cargo
		bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 55
		bodyModel[15] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 56
		bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 57
		bodyModel[17] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 58
		bodyModel[18] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 373, 30, textureX, textureY); // Wheel
		bodyModel[25] = new ModelRendererTurbo(this, 390, 30, textureX, textureY); // Wheel
		bodyModel[26] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 50
		bodyModel[28] = new ModelRendererTurbo(this, 408, 30, textureX, textureY); // Wheel
		bodyModel[29] = new ModelRendererTurbo(this, 426, 30, textureX, textureY); // Wheel
		bodyModel[30] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 54
		bodyModel[31] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 55
		bodyModel[32] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 56
		bodyModel[33] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 57
		bodyModel[34] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 58
		bodyModel[35] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 59
		bodyModel[36] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 60
		bodyModel[37] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 61
		bodyModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 62
		bodyModel[39] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 63
		bodyModel[40] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 64
		bodyModel[41] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 65
		bodyModel[42] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 67
		bodyModel[44] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 68
		bodyModel[45] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 69
		bodyModel[46] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 70
		bodyModel[47] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 71
		bodyModel[48] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 72
		bodyModel[49] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 73
		bodyModel[50] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 74
		bodyModel[51] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 75
		bodyModel[52] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 76
		bodyModel[53] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 77
		bodyModel[54] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 78
		bodyModel[55] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 79
		bodyModel[56] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 80
		bodyModel[57] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 81
		bodyModel[58] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 82
		bodyModel[59] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 83

		bodyModel[0].addBox(0F, 0F, 0F, 55, 1, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-24F, 2F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 1
		bodyModel[1].setRotationPoint(-23F, 0F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 2
		bodyModel[2].setRotationPoint(-23F, 0F, -10F);

		bodyModel[3].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 3
		bodyModel[3].setRotationPoint(-23F, 0F, 10F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 4
		bodyModel[4].setRotationPoint(-23F, 0F, 8F);

		bodyModel[5].addBox(0F, 0F, 0F, 51, 20, 20, 0F); // Box Cargo
		bodyModel[5].setRotationPoint(-22F, -18F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 6
		bodyModel[6].setRotationPoint(27F, 0F, -11F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 7
		bodyModel[7].setRotationPoint(29F, 0F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 8
		bodyModel[8].setRotationPoint(29F, 0F, 8F);

		bodyModel[9].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 9
		bodyModel[9].setRotationPoint(27F, 0F, 10F);

		bodyModel[10].addBox(0F, 0F, 0F, 47, 1, 1, 0F); // Box 10
		bodyModel[10].setRotationPoint(-20F, 1F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 47, 1, 1, 0F); // Box 11
		bodyModel[11].setRotationPoint(-20F, 1F, -11F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 12
		bodyModel[12].setRotationPoint(-23F, 1F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 13
		bodyModel[13].setRotationPoint(29F, 1F, -8F);

		bodyModel[14].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 55
		bodyModel[14].setRotationPoint(31F, 2F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 56
		bodyModel[15].setRotationPoint(32.5F, 1F, -10F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 57
		bodyModel[16].setRotationPoint(32.5F, 1F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 58
		bodyModel[17].setRotationPoint(31F, 2F, 8F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 19
		bodyModel[18].setRotationPoint(-26F, 2F, -9F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 20
		bodyModel[19].setRotationPoint(-26.5F, 1F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 21
		bodyModel[20].setRotationPoint(-26F, 2F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 22
		bodyModel[21].setRotationPoint(-26.5F, 1F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-11F, 3F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-6F, 6F, -9F);

		bodyModel[24].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Wheel
		bodyModel[24].setRotationPoint(-16.5F, 6.5F, 5.95F);

		bodyModel[25].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Wheel
		bodyModel[25].setRotationPoint(-16.5F, 6.5F, -5.95F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 29
		bodyModel[26].setRotationPoint(-17F, 6F, -7F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 50
		bodyModel[27].setRotationPoint(23F, 6F, -7F);

		bodyModel[28].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Wheel
		bodyModel[28].setRotationPoint(23.5F, 6.5F, -5.95F);

		bodyModel[29].addBox(-3.5F, -3.5F, 0F, 7, 7, 0, 0F); // Wheel
		bodyModel[29].setRotationPoint(23.5F, 6.5F, 5.95F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 54
		bodyModel[30].setRotationPoint(25F, 3F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 55
		bodyModel[31].setRotationPoint(24F, 6F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 56
		bodyModel[32].setRotationPoint(22F, 3F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 57
		bodyModel[33].setRotationPoint(19F, 3F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 58
		bodyModel[34].setRotationPoint(22F, 6F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[35].setRotationPoint(-6F, 3F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[36].setRotationPoint(12F, 3F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[37].setRotationPoint(3F, 3F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[38].setRotationPoint(13F, 3F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 63
		bodyModel[39].setRotationPoint(-11F, 3F, 8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[40].setRotationPoint(-6F, 6F, 8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[41].setRotationPoint(-6F, 3F, 8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[42].setRotationPoint(12F, 3F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[43].setRotationPoint(3F, 3F, 8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[44].setRotationPoint(13F, 3F, 8F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[45].setRotationPoint(25F, 3F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[46].setRotationPoint(24F, 6F, -7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[47].setRotationPoint(22F, 3F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 72
		bodyModel[48].setRotationPoint(19F, 3F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[49].setRotationPoint(22F, 6F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[50].setRotationPoint(-15F, 3F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[51].setRotationPoint(-16F, 6F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[52].setRotationPoint(-18F, 3F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 77
		bodyModel[53].setRotationPoint(-21F, 3F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[54].setRotationPoint(-18F, 6F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[55].setRotationPoint(-15F, 3F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 80
		bodyModel[56].setRotationPoint(-18F, 3F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F); // Box 81
		bodyModel[57].setRotationPoint(-21F, 3F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 82
		bodyModel[58].setRotationPoint(-18F, 6F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 83
		bodyModel[59].setRotationPoint(-16F, 6F, 6F);
	}
}