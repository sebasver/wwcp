package wwcp.models.bogies;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class truck_70ton extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public truck_70ton() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[69];

		initbodyModel_1();



		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box1
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box2
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box6
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box21
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box22
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box23
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box28
		bodyModel[10] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box8
		bodyModel[11] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box144
		bodyModel[12] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box6
		bodyModel[13] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box144
		bodyModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box144
		bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box25
		bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box10
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box10
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box18
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box14
		bodyModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box25
		bodyModel[21] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box61
		bodyModel[22] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box104
		bodyModel[23] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box63
		bodyModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box64
		bodyModel[25] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box65
		bodyModel[26] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box66
		bodyModel[27] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box67
		bodyModel[28] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box68
		bodyModel[29] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box69
		bodyModel[30] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box70
		bodyModel[31] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box71
		bodyModel[32] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box72
		bodyModel[33] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box73
		bodyModel[34] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box74
		bodyModel[35] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box75
		bodyModel[36] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box76
		bodyModel[37] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box77
		bodyModel[38] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box78
		bodyModel[39] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box79
		bodyModel[40] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box80
		bodyModel[41] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box81
		bodyModel[42] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box82
		bodyModel[43] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box83
		bodyModel[44] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box84
		bodyModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box85
		bodyModel[46] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box86
		bodyModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box87
		bodyModel[48] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import Box88
		bodyModel[49] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box89
		bodyModel[50] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import Box90
		bodyModel[51] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box91
		bodyModel[52] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import Box92
		bodyModel[53] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import Box93
		bodyModel[54] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import Box94
		bodyModel[55] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box95
		bodyModel[56] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import Box96
		bodyModel[57] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import Box97
		bodyModel[58] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box98
		bodyModel[59] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box99
		bodyModel[60] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Box100
		bodyModel[61] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box101
		bodyModel[62] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import Box102
		bodyModel[63] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box103
		bodyModel[64] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import Box104
		bodyModel[65] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Import Box105
		bodyModel[66] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Import Box106
		bodyModel[67] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import Box107
		bodyModel[68] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Import Box108

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Box0
		bodyModel[0].setRotationPoint(-6.5F, 6F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Import Box1
		bodyModel[1].setRotationPoint(-8.5F, 4F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Import Box2
		bodyModel[2].setRotationPoint(-8.5F, 4F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Import Box1
		bodyModel[3].setRotationPoint(2.5F, 4F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Import Box2
		bodyModel[4].setRotationPoint(2.5F, 4F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		bodyModel[5].setRotationPoint(-1.5F, 8F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box21
		bodyModel[6].setRotationPoint(-1.5F, 4.5F, 4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		bodyModel[7].setRotationPoint(-1.5F, 4.5F, -7F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 2, 8, 0F); // Import Box23
		bodyModel[8].setRotationPoint(-1.5F, 4.5F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[9].setRotationPoint(-1.5F, 3.5F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		bodyModel[10].setRotationPoint(-5.5F, 4F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Import Box144
		bodyModel[11].setRotationPoint(-1.5F, 5.25F, -8.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box6
		bodyModel[12].setRotationPoint(-1.5F, 5F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Import Box144
		bodyModel[13].setRotationPoint(-0.5F, 5.25F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Import Box144
		bodyModel[14].setRotationPoint(0.5F, 5.25F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box25
		bodyModel[15].setRotationPoint(-2.5F, 5F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box10
		bodyModel[16].setRotationPoint(-8.5F, 4.5F, -8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F); // Import Box10
		bodyModel[17].setRotationPoint(-8.5F, 5F, -8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box18
		bodyModel[18].setRotationPoint(-4.5F, 6F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F); // Import Box14
		bodyModel[19].setRotationPoint(-4.5F, 6F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Import Box25
		bodyModel[20].setRotationPoint(-2.5F, 7F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		bodyModel[21].setRotationPoint(-7.5F, 4F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box104
		bodyModel[22].setRotationPoint(-6.5F, 6F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		bodyModel[23].setRotationPoint(-6.5F, 5F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		bodyModel[24].setRotationPoint(5.5F, 4F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box65
		bodyModel[25].setRotationPoint(7.5F, 4.5F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F); // Import Box66
		bodyModel[26].setRotationPoint(6.5F, 5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		bodyModel[27].setRotationPoint(4.5F, 5F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box68
		bodyModel[28].setRotationPoint(-4.5F, 5F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box69
		bodyModel[29].setRotationPoint(2.5F, 5F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box70
		bodyModel[30].setRotationPoint(-2.5F, 5F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box71
		bodyModel[31].setRotationPoint(-1.5F, 5.5F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box72
		bodyModel[32].setRotationPoint(-1.5F, 8F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		bodyModel[33].setRotationPoint(1.5F, 5F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box74
		bodyModel[34].setRotationPoint(1.5F, 5F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Import Box75
		bodyModel[35].setRotationPoint(1.5F, 7F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box76
		bodyModel[36].setRotationPoint(1.5F, 6F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F); // Import Box77
		bodyModel[37].setRotationPoint(3.5F, 6F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box78
		bodyModel[38].setRotationPoint(4.5F, 6F, -8.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 16, 0F); // Import Box79
		bodyModel[39].setRotationPoint(4.5F, 6F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Import Box80
		bodyModel[40].setRotationPoint(-1.5F, 5.5F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box81
		bodyModel[41].setRotationPoint(-1.5F, 5F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box82
		bodyModel[42].setRotationPoint(-2.5F, 5F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box83
		bodyModel[43].setRotationPoint(-2.5F, 5F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import Box84
		bodyModel[44].setRotationPoint(-4.5F, 5F, 7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		bodyModel[45].setRotationPoint(1.5F, 5F, 7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Import Box86
		bodyModel[46].setRotationPoint(1.5F, 5F, 7F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box87
		bodyModel[47].setRotationPoint(2.5F, 5F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F); // Import Box88
		bodyModel[48].setRotationPoint(3.5F, 6F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box89
		bodyModel[49].setRotationPoint(1.5F, 6F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F); // Import Box90
		bodyModel[50].setRotationPoint(1.5F, 7F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box91
		bodyModel[51].setRotationPoint(-4.5F, 6F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -1F, 0F); // Import Box92
		bodyModel[52].setRotationPoint(-4.5F, 6F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F); // Import Box93
		bodyModel[53].setRotationPoint(-8.5F, 5F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Import Box94
		bodyModel[54].setRotationPoint(-8.5F, 4.5F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		bodyModel[55].setRotationPoint(-7.5F, 4F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		bodyModel[56].setRotationPoint(-5.5F, 4F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		bodyModel[57].setRotationPoint(-6.5F, 5F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		bodyModel[58].setRotationPoint(5.5F, 4F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		bodyModel[59].setRotationPoint(4.5F, 5F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, -0.7F, 0F, 0F, -0.7F, 0F); // Import Box100
		bodyModel[60].setRotationPoint(6.5F, 5F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box101
		bodyModel[61].setRotationPoint(7.5F, 4.5F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F); // Import Box102
		bodyModel[62].setRotationPoint(-2.5F, 7F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Import Box103
		bodyModel[63].setRotationPoint(-0.5F, 5.25F, 6.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Import Box104
		bodyModel[64].setRotationPoint(0.5F, 5.25F, 6.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -4.5F, 0F); // Import Box105
		bodyModel[65].setRotationPoint(-1.5F, 5.25F, 6.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Import Box106
		bodyModel[66].setRotationPoint(-1.5F, 8F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box107
		bodyModel[67].setRotationPoint(-6.5F, 6F, 7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import Box108
		bodyModel[68].setRotationPoint(4.5F, 6F, 7.5F);
	}
}