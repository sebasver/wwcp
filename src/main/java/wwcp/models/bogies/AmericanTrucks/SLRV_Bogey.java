package wwcp.models.bogies.AmericanTrucks;


import ebf.tim.render.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class SLRV_Bogey extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public SLRV_Bogey() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[42];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY).setName(StaticModelAnimator.tagWheel); // Box 713
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY).setName(StaticModelAnimator.tagWheel); // Box 713
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY).setName(StaticModelAnimator.tagWheel); // Box 713
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY).setName(StaticModelAnimator.tagWheel); // Box 713
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 717
		bodyModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 717
		bodyModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 719
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 719
		bodyModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 10
		bodyModel[12] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 8
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 10
		bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 10
		bodyModel[15] = new ModelRendererTurbo(this, 259, 10, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 172, 6, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 224, 6, textureX, textureY); // Box 23
		bodyModel[18] = new ModelRendererTurbo(this, 224, 6, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 186, 7, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 181, 7, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 186, 7, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 181, 5, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 186, 7, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 186, 7, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 172, 6, textureX, textureY); // Box 19
		bodyModel[26] = new ModelRendererTurbo(this, 172, 6, textureX, textureY); // Box 19
		bodyModel[27] = new ModelRendererTurbo(this, 172, 6, textureX, textureY); // Box 19
		bodyModel[28] = new ModelRendererTurbo(this, 181, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 181, 3, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 265, 2, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 265, 2, textureX, textureY); // Box 41
		bodyModel[32] = new ModelRendererTurbo(this, 288, 5, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 288, 5, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 294, 12, textureX, textureY); // Box 44
		bodyModel[35] = new ModelRendererTurbo(this, 309, 12, textureX, textureY); // Box 44
		bodyModel[36] = new ModelRendererTurbo(this, 315, 5, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 234, 11, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 65, 6, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 310, 5, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 241, 11, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 60, 6, textureX, textureY); // Box 50

		bodyModel[0].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 713
		bodyModel[0].setRotationPoint(7.5F, 7.5F, -6.01F);

		bodyModel[1].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 713
		bodyModel[1].setRotationPoint(-6.5F, 7.5F, -6.01F);

		bodyModel[2].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 713
		bodyModel[2].setRotationPoint(7.5F, 7.5F, 6.01F);

		bodyModel[3].addBox(-2.5F, -2.5F, 0F, 5, 5, 0, 0F); // Box 713
		bodyModel[3].setRotationPoint(-6.5F, 7.5F, 6.01F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 717
		bodyModel[4].setRotationPoint(-7F, 7F, -6F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Box 717
		bodyModel[5].setRotationPoint(7F, 7F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 719
		bodyModel[6].setRotationPoint(-7F, 6F, -5.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 719
		bodyModel[7].setRotationPoint(1F, 6F, -5.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 8
		bodyModel[8].setRotationPoint(-3F, 8.7F, -7F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 11, 0F); // Box 9
		bodyModel[9].setRotationPoint(0F, 7F, -5.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 1F, -0.25F, -0.5F, 1F); // Box 10
		bodyModel[10].setRotationPoint(-3F, 7.7F, -7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 1F, -0.25F, -0.5F, 1F); // Box 10
		bodyModel[11].setRotationPoint(2.6F, 7.7F, -7.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 8
		bodyModel[12].setRotationPoint(-3F, 8.7F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 1F, -0.25F, -0.5F, 1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 10
		bodyModel[13].setRotationPoint(3F, 7.7F, 6.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 1F, -0.25F, -0.5F, 1F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 10
		bodyModel[14].setRotationPoint(-2.6F, 7.7F, 6.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(0F, 4F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-10F, 5F, -5.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 23
		bodyModel[17].setRotationPoint(-9F, 5.25F, 4.5F);

		bodyModel[18].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 23
		bodyModel[18].setRotationPoint(-9F, 5.25F, -5.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 25
		bodyModel[19].setRotationPoint(-12F, 7F, 4.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -2.25F, 0F, 0F); // Box 29
		bodyModel[20].setRotationPoint(11F, 8F, -5.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-12F, 7F, -5.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, 1.25F, -1F, 0F, 1.25F, -1F, 0F, -2.25F, 0F, 0F); // Box 29
		bodyModel[22].setRotationPoint(11F, 8F, 4.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(11F, 7F, -5.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(11F, 7F, 4.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 19
		bodyModel[25].setRotationPoint(-10F, 5F, 4.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 19
		bodyModel[26].setRotationPoint(10F, 5F, -5.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 19
		bodyModel[27].setRotationPoint(10F, 5F, 4.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -1F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 1.25F, -1F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-11F, 8F, 4.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -1F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, 1.25F, -1F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-11F, 8F, -5.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 41
		bodyModel[30].setRotationPoint(-13.25F, 8F, -6.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 13, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 41
		bodyModel[31].setRotationPoint(12.5F, 8F, -6.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[32].setRotationPoint(-1F, 4F, 3.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 2, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[33].setRotationPoint(-1F, 4F, -8.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 44
		bodyModel[34].setRotationPoint(-1F, 7F, 3.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 1, 4, 0F); // Box 44
		bodyModel[35].setRotationPoint(-1F, 7F, -7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[36].setRotationPoint(1F, 6F, 7.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 49
		bodyModel[37].setRotationPoint(-1F, 6F, 7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[38].setRotationPoint(-1F, 7F, 7.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[39].setRotationPoint(1F, 6F, -8.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 49
		bodyModel[40].setRotationPoint(-1F, 6F, -8.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[41].setRotationPoint(-1F, 7F, -8.5F);
	}
}