package wwcp.models.bogies.AmericanTrucks;


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class PRR_2D_F8_truck extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public PRR_2D_F8_truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[119];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 23
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 144
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 144
		bodyModel[10] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 18
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 63
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 79
		bodyModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 144
		bodyModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 144
		bodyModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 23
		bodyModel[26] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 23
		bodyModel[27] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 467
		bodyModel[28] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 25
		bodyModel[29] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
		bodyModel[30] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 25
		bodyModel[31] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 63
		bodyModel[32] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 63
		bodyModel[33] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 63
		bodyModel[35] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 63
		bodyModel[36] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 526
		bodyModel[37] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 527
		bodyModel[38] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 528
		bodyModel[39] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 529
		bodyModel[40] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 530
		bodyModel[41] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 531
		bodyModel[42] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 534
		bodyModel[43] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 537
		bodyModel[44] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 538
		bodyModel[45] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 539
		bodyModel[46] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 540
		bodyModel[47] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 544
		bodyModel[48] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 545
		bodyModel[49] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 546
		bodyModel[50] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 548
		bodyModel[51] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 549
		bodyModel[52] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 550
		bodyModel[53] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 552
		bodyModel[54] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 564
		bodyModel[55] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 565
		bodyModel[56] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 566
		bodyModel[57] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 569
		bodyModel[58] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 570
		bodyModel[59] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 571
		bodyModel[60] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 574
		bodyModel[61] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 575
		bodyModel[62] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 576
		bodyModel[63] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 577
		bodyModel[64] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 582
		bodyModel[65] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 583
		bodyModel[66] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 584
		bodyModel[67] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 585
		bodyModel[68] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 590
		bodyModel[69] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 605
		bodyModel[70] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 532
		bodyModel[71] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 532
		bodyModel[72] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 586
		bodyModel[73] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 588
		bodyModel[74] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 607
		bodyModel[75] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 606
		bodyModel[76] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 606
		bodyModel[77] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 606
		bodyModel[78] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 607
		bodyModel[79] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 607
		bodyModel[80] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 586
		bodyModel[81] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 588
		bodyModel[82] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 606
		bodyModel[83] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 606
		bodyModel[84] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 606
		bodyModel[85] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 607
		bodyModel[86] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 607
		bodyModel[87] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 607
		bodyModel[88] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 541
		bodyModel[89] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 797
		bodyModel[90] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 798
		bodyModel[91] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 799
		bodyModel[92] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 800
		bodyModel[93] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 801
		bodyModel[94] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 802
		bodyModel[95] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 803
		bodyModel[96] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 804
		bodyModel[97] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 805
		bodyModel[98] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 806
		bodyModel[99] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 807
		bodyModel[100] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 808
		bodyModel[101] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 809
		bodyModel[102] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 810
		bodyModel[103] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 811
		bodyModel[104] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 812
		bodyModel[105] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 813
		bodyModel[106] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 814
		bodyModel[107] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 815
		bodyModel[108] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 816
		bodyModel[109] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 817
		bodyModel[110] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 818
		bodyModel[111] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 819
		bodyModel[112] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 820
		bodyModel[113] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 821
		bodyModel[114] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 822
		bodyModel[115] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 823
		bodyModel[116] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 824
		bodyModel[117] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 824
		bodyModel[118] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 118

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-6.55F, 6.5F, -7F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(-9F, 4F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[2].setRotationPoint(-9F, 4F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[3].setRotationPoint(3F, 4F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[4].setRotationPoint(3F, 4F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 23
		bodyModel[5].setRotationPoint(-1.25F, 4.8F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 28
		bodyModel[6].setRotationPoint(-1.25F, 3.8F, -1.25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-1.75F, 4.05F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 144
		bodyModel[8].setRotationPoint(-0.999999999999999F, 5.15F, -8.65F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 144
		bodyModel[9].setRotationPoint(8.88178419700125E-16F, 5.15F, -8.65F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 25
		bodyModel[10].setRotationPoint(-2.75F, 6.6F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, -1.05F, 0F, -0.2F, -1.05F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, 0F, -0.2F, 0F); // Box 18
		bodyModel[11].setRotationPoint(-4.3F, 5.55F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 63
		bodyModel[12].setRotationPoint(-7.05F, 5.4F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Box 79
		bodyModel[13].setRotationPoint(5.55F, 6.5F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 23
		bodyModel[14].setRotationPoint(-0.999999999999999F, 4.8F, -8.75F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 23
		bodyModel[15].setRotationPoint(-0.999999999999999F, 5.9F, -8.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.65F, 0F, -0.75F, -0.65F, 0F, -0.75F, -0.65F, -0.25F, 0F, -0.65F, -0.25F); // Box 23
		bodyModel[16].setRotationPoint(-1.25F, 4.8F, -8.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.65F, 0F, -0.75F, -0.65F, 0F, -0.75F, -0.65F, -0.25F, 0F, -0.65F, -0.25F); // Box 23
		bodyModel[17].setRotationPoint(1F, 4.8F, -8.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 144
		bodyModel[18].setRotationPoint(-0.999999999999999F, 5.15F, -7.55F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 144
		bodyModel[19].setRotationPoint(8.88178419700125E-16F, 5.15F, -7.55F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.45F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.45F, -0.3F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-2.75F, 7.35F, -8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-2.75F, 8.05F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 25
		bodyModel[22].setRotationPoint(1.5F, 6.6F, -8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 25
		bodyModel[23].setRotationPoint(1.75F, 7.35F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 25
		bodyModel[24].setRotationPoint(1.75F, 8.05F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.65F, 0F, -0.5F, -0.65F, 0F, -0.5F, -0.65F, -0.5F, 0F, -0.65F, -0.5F); // Box 23
		bodyModel[25].setRotationPoint(-1.25F, 6.15F, -0.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -0.65F, -0.25F, 0F, -0.65F, -0.25F); // Box 23
		bodyModel[26].setRotationPoint(-1.25F, 6.15F, -5.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.25F, -0.5F, -0.65F, -0.25F, -0.5F, -2F, 0F, 0F, -2F, 0F); // Box 467
		bodyModel[27].setRotationPoint(-1.25F, 6.15F, 0.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.25F, -1F, 0F); // Box 25
		bodyModel[28].setRotationPoint(-5.3F, 5.9F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1.05F, 0F, -0.2F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, 0.8F, 0F); // Box 18
		bodyModel[29].setRotationPoint(2.3F, 5.55F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.55F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -0.55F, 0F); // Box 25
		bodyModel[30].setRotationPoint(4.05F, 5.9F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 63
		bodyModel[31].setRotationPoint(-6.3F, 7.05F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 63
		bodyModel[32].setRotationPoint(5.05F, 5.4F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 63
		bodyModel[33].setRotationPoint(5.8F, 7.05F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0.15F, 0F, -0.65F, 0.15F, 0F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 63
		bodyModel[34].setRotationPoint(-7.05F, 5.4F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, 0.15F, 0F, -0.65F, 0.15F, 0F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 63
		bodyModel[35].setRotationPoint(5.05F, 5.4F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 526
		bodyModel[36].setRotationPoint(-1.75F, 4.05F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 527
		bodyModel[37].setRotationPoint(-0.999999999999999F, 5.15F, 7.65F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 528
		bodyModel[38].setRotationPoint(8.88178419700125E-16F, 5.15F, 7.65F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 529
		bodyModel[39].setRotationPoint(-2.75F, 6.6F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, -1.05F, 0F, -0.2F, -1.05F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, 0F, -0.2F, 0F); // Box 530
		bodyModel[40].setRotationPoint(-4.3F, 5.55F, 7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 531
		bodyModel[41].setRotationPoint(-7.05F, 5.4F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 534
		bodyModel[42].setRotationPoint(-1.75F, 7.65F, 7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 537
		bodyModel[43].setRotationPoint(-0.999999999999999F, 4.8F, 7.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 538
		bodyModel[44].setRotationPoint(-0.999999999999999F, 5.9F, 7.75F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.25F, -0.75F, -0.65F, -0.25F, -0.75F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 539
		bodyModel[45].setRotationPoint(-1.25F, 4.8F, 7.75F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.25F, -0.75F, -0.65F, -0.25F, -0.75F, -0.65F, 0F, 0F, -0.65F, 0F); // Box 540
		bodyModel[46].setRotationPoint(1F, 4.8F, 7.75F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 544
		bodyModel[47].setRotationPoint(-0.999999999999999F, 5.15F, 6.55F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -1F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1F, 0F, 0F, -4.75F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.75F, 0F); // Box 545
		bodyModel[48].setRotationPoint(8.88178419700125E-16F, 5.15F, 6.55F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.45F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.45F, -0.3F, 0F); // Box 546
		bodyModel[49].setRotationPoint(-2.75F, 7.35F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F); // Box 548
		bodyModel[50].setRotationPoint(-2.75F, 8.05F, 7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 549
		bodyModel[51].setRotationPoint(1.5F, 6.6F, 7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 550
		bodyModel[52].setRotationPoint(1.75F, 7.35F, 7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 552
		bodyModel[53].setRotationPoint(1.75F, 8.05F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.25F, 0.35F, 0F); // Box 564
		bodyModel[54].setRotationPoint(-5.3F, 4.55F, 7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.25F, -1F, 0F); // Box 565
		bodyModel[55].setRotationPoint(-5.3F, 5.9F, 7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.15F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, 0F, 0.15F, 0F); // Box 566
		bodyModel[56].setRotationPoint(-4.3F, 4.05F, 7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -1.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1.05F, 0F, -0.2F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, 0.8F, 0F); // Box 569
		bodyModel[57].setRotationPoint(2.3F, 5.55F, 7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.25F, 0.35F, 0F); // Box 570
		bodyModel[58].setRotationPoint(4.05F, 4.55F, 7F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.45F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.45F, 0F, 0F, -0.45F, -0.35F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.45F, -0.35F, 0F); // Box 571
		bodyModel[59].setRotationPoint(1.3F, 4.05F, 7F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.55F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -0.55F, 0F); // Box 574
		bodyModel[60].setRotationPoint(4.05F, 5.9F, 7F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.15F, -0.15F, 0F, 0.15F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 575
		bodyModel[61].setRotationPoint(-6.2F, 4.55F, 7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.7F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 576
		bodyModel[62].setRotationPoint(-7.05F, 4.7F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 577
		bodyModel[63].setRotationPoint(-6.3F, 7.05F, 7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 582
		bodyModel[64].setRotationPoint(5.05F, 5.4F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.15F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.15F, 0F, 0F, 0.15F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.15F, -0.15F, 0F); // Box 583
		bodyModel[65].setRotationPoint(5.2F, 4.55F, 7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.15F, 0F, 0F, -0.15F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.15F, -0.3F, 0F); // Box 584
		bodyModel[66].setRotationPoint(6.05F, 4.7F, 7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, 0F, -0.5F, -0.35F, 0F, -0.5F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 585
		bodyModel[67].setRotationPoint(5.8F, 7.05F, 7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0.15F, 0F, -0.65F, 0.15F); // Box 590
		bodyModel[68].setRotationPoint(-7.05F, 5.4F, 8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, 0.15F, 0F, -0.65F, 0.15F); // Box 605
		bodyModel[69].setRotationPoint(5.05F, 5.4F, 8F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 532
		bodyModel[70].setRotationPoint(1.25F, 4.7F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 532
		bodyModel[71].setRotationPoint(-1.75F, 4.7F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, 0F, -1F, 0F); // Box 586
		bodyModel[72].setRotationPoint(5.05F, 7.05F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -0.35F, 0F); // Box 588
		bodyModel[73].setRotationPoint(6.05F, 7.05F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.15F, -0.5F, -0.35F, -0.15F, -0.5F, -0.35F, -0.85F, 0F, -0.35F, -0.85F); // Box 607
		bodyModel[74].setRotationPoint(5.8F, 7.05F, 7.85F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, -0.15F, 0F, -0.7F, -0.15F); // Box 606
		bodyModel[75].setRotationPoint(5.8F, 6.75F, 8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.7F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, -1F, 0F, -0.7F, -0.15F); // Box 606
		bodyModel[76].setRotationPoint(6.3F, 6.75F, 8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.7F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, -0.15F, 0F, -0.7F, -1F); // Box 606
		bodyModel[77].setRotationPoint(5.05F, 6.75F, 8F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.85F, 0F, 0F, 0F, 0F, -0.35F, -0.15F, -0.25F, -1F, -0.15F, -0.25F, -1F, -0.85F, 0F, -0.35F, -0.85F); // Box 607
		bodyModel[78].setRotationPoint(6.3F, 7.05F, 7.85F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, 0F, 0F, 0F, -0.85F, 0F, -1F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.85F, 0F, -1F, -0.85F); // Box 607
		bodyModel[79].setRotationPoint(5.05F, 7.05F, 7.85F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, 0F, -1F, 0F); // Box 586
		bodyModel[80].setRotationPoint(-7.05F, 7.05F, 7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -0.35F, 0F); // Box 588
		bodyModel[81].setRotationPoint(-6.05F, 7.05F, 7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, -0.15F, 0F, -0.7F, -0.15F); // Box 606
		bodyModel[82].setRotationPoint(-6.3F, 6.75F, 8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.7F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, -1F, 0F, -0.7F, -0.15F); // Box 606
		bodyModel[83].setRotationPoint(-5.8F, 6.75F, 8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.7F, 0F, -0.25F, -0.7F, 0F, -0.25F, -0.7F, -0.15F, 0F, -0.7F, -1F); // Box 606
		bodyModel[84].setRotationPoint(-7.05F, 6.75F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, -0.85F, 0F, 0F, 0F, 0F, -0.35F, -0.15F, -0.25F, -1F, -0.15F, -0.25F, -1F, -0.85F, 0F, -0.35F, -0.85F); // Box 607
		bodyModel[85].setRotationPoint(-5.8F, 7.05F, 7.85F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.15F, -0.25F, 0F, -0.15F, -0.25F, 0F, 0F, 0F, 0F, -0.85F, 0F, -1F, -0.15F, -0.25F, -0.35F, -0.15F, -0.25F, -0.35F, -0.85F, 0F, -1F, -0.85F); // Box 607
		bodyModel[86].setRotationPoint(-7.05F, 7.05F, 7.85F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.35F, -0.15F, -0.5F, -0.35F, -0.15F, -0.5F, -0.35F, -0.85F, 0F, -0.35F, -0.85F); // Box 607
		bodyModel[87].setRotationPoint(-6.3F, 7.05F, 7.85F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 541
		bodyModel[88].setRotationPoint(-1.25F, 7.65F, 7.75F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 797
		bodyModel[89].setRotationPoint(-1.75F, 7.65F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.25F, 0.35F, 0F); // Box 798
		bodyModel[90].setRotationPoint(-5.3F, 4.55F, -8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.15F, 0F, -0.45F, -0.35F, 0F, -0.45F, -0.35F, 0F, 0F, 0.15F, 0F); // Box 799
		bodyModel[91].setRotationPoint(-4.3F, 4.05F, -8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, -0.25F, 0.35F, 0F); // Box 800
		bodyModel[92].setRotationPoint(4.05F, 4.55F, -8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.45F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.45F, 0F, 0F, -0.45F, -0.35F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, -0.45F, -0.35F, 0F); // Box 801
		bodyModel[93].setRotationPoint(1.3F, 4.05F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.15F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.15F, -0.15F, 0F, 0.15F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 802
		bodyModel[94].setRotationPoint(-6.2F, 4.55F, -8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.7F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, -0.15F, -0.3F, 0F, -0.15F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 803
		bodyModel[95].setRotationPoint(-7.05F, 4.7F, -8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.15F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.15F, 0F, 0F, 0.15F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0.15F, -0.15F, 0F); // Box 804
		bodyModel[96].setRotationPoint(5.2F, 4.55F, -8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.15F, 0F, 0F, -0.15F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.15F, -0.3F, 0F); // Box 805
		bodyModel[97].setRotationPoint(6.05F, 4.7F, -8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 806
		bodyModel[98].setRotationPoint(1.25F, 4.7F, -8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, 0F, -0.05F, 0F); // Box 807
		bodyModel[99].setRotationPoint(-1.75F, 4.7F, -8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, 0F, -1F, 0F); // Box 808
		bodyModel[100].setRotationPoint(5.05F, 7.05F, -8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -0.35F, 0F); // Box 809
		bodyModel[101].setRotationPoint(6.05F, 7.05F, -8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.35F, -0.85F, -0.5F, -0.35F, -0.85F, -0.5F, -0.35F, -0.15F, 0F, -0.35F, -0.15F); // Box 810
		bodyModel[102].setRotationPoint(5.8F, 7.05F, -8.85F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 811
		bodyModel[103].setRotationPoint(5.8F, 6.75F, -9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.15F, -0.25F, -0.7F, -1F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 812
		bodyModel[104].setRotationPoint(6.3F, 6.75F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1F, -0.25F, -0.7F, -0.15F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 813
		bodyModel[105].setRotationPoint(5.05F, 6.75F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.35F, -0.85F, -0.25F, -1F, -0.85F, -0.25F, -1F, -0.15F, 0F, -0.35F, -0.15F); // Box 814
		bodyModel[106].setRotationPoint(6.3F, 7.05F, -8.85F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.85F, -0.25F, 0F, 0F, -0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -1F, -0.85F, -0.25F, -0.35F, -0.85F, -0.25F, -0.35F, -0.15F, 0F, -1F, -0.15F); // Box 815
		bodyModel[107].setRotationPoint(5.05F, 7.05F, -8.85F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, 0F, -1F, 0F); // Box 816
		bodyModel[108].setRotationPoint(-7.05F, 7.05F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -0.35F, 0F); // Box 817
		bodyModel[109].setRotationPoint(-6.05F, 7.05F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.05F, -0.5F, 0F, 0.05F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.15F, -0.5F, -0.7F, -0.15F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 818
		bodyModel[110].setRotationPoint(-6.3F, 6.75F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.15F, -0.25F, -0.7F, -1F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 819
		bodyModel[111].setRotationPoint(-5.8F, 6.75F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1F, -0.25F, -0.7F, -0.15F, -0.25F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 820
		bodyModel[112].setRotationPoint(-7.05F, 6.75F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.85F, -0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.35F, -0.85F, -0.25F, -1F, -0.85F, -0.25F, -1F, -0.15F, 0F, -0.35F, -0.15F); // Box 821
		bodyModel[113].setRotationPoint(-5.8F, 7.05F, -8.85F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.85F, -0.25F, 0F, 0F, -0.25F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -1F, -0.85F, -0.25F, -0.35F, -0.85F, -0.25F, -0.35F, -0.15F, 0F, -1F, -0.15F); // Box 822
		bodyModel[114].setRotationPoint(-7.05F, 7.05F, -8.85F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, -0.35F, -0.85F, -0.5F, -0.35F, -0.85F, -0.5F, -0.35F, -0.15F, 0F, -0.35F, -0.15F); // Box 823
		bodyModel[115].setRotationPoint(-6.3F, 7.05F, -8.85F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 824
		bodyModel[116].setRotationPoint(-1.25F, 7.65F, -8.75F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.45F, 0F, -0.5F, -0.45F); // Box 824
		bodyModel[117].setRotationPoint(-1.25F, 7.65F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.45F, -0.5F, 0F, -0.45F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.45F, -0.5F, -0.5F, -0.45F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		bodyModel[118].setRotationPoint(-1.25F, 7.65F, 6F);
	}
}