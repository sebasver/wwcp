package wwcp.models.bogies;


import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class EurofimaBogie extends ModelBase
{
	int textureX = 128;
	int textureY = 64;

	public EurofimaBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[41];

		initbodyModel_1();
		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 167
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 168
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 167
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 167
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 167
		bodyModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 167
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 167
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 167
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 167
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 167
		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 167
		bodyModel[11] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 167
		bodyModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 167
		bodyModel[13] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 167
		bodyModel[14] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 167
		bodyModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 168
		bodyModel[16] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 168
		bodyModel[17] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 168
		bodyModel[18] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 167
		bodyModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 167
		bodyModel[20] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 167
		bodyModel[21] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 167
		bodyModel[22] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 167
		bodyModel[23] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 167
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 167
		bodyModel[25] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 167
		bodyModel[26] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 167
		bodyModel[27] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 167
		bodyModel[28] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 167
		bodyModel[29] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 167
		bodyModel[30] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 167
		bodyModel[31] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 202
		bodyModel[32] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 167
		bodyModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 167
		bodyModel[34] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 167
		bodyModel[35] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 207
		bodyModel[36] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 208
		bodyModel[37] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 167
		bodyModel[38] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 167
		bodyModel[39] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 167
		bodyModel[40] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 167

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 167
		bodyModel[0].setRotationPoint(0F, 6F, -7.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 168
		bodyModel[1].setRotationPoint(-16.5F, 3.5F, 6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[2].setRotationPoint(-4F, 4F, 6.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 167
		bodyModel[3].setRotationPoint(-13F, 6F, 6.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 167
		bodyModel[4].setRotationPoint(0F, 5F, 6.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 167
		bodyModel[5].setRotationPoint(-4F, 5F, 6.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 167
		bodyModel[6].setRotationPoint(0F, 5F, 6.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 167
		bodyModel[7].setRotationPoint(0F, 5.5F, 6.5F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 15, 0F); // Box 167
		bodyModel[8].setRotationPoint(-14F, 6F, -7.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[9].setRotationPoint(-14F, 4F, 6.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 167
		bodyModel[10].setRotationPoint(-14F, 5F, 6.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[11].setRotationPoint(-10F, 5F, 6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 167
		bodyModel[12].setRotationPoint(-14F, 5F, 6.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 167
		bodyModel[13].setRotationPoint(-14F, 5.5F, 6.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 167
		bodyModel[14].setRotationPoint(-8.5F, 7F, 6.5F);

		bodyModel[15].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 168
		bodyModel[15].setRotationPoint(-2.5F, 3.5F, 6F);

		bodyModel[16].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 168
		bodyModel[16].setRotationPoint(-16.5F, 3.5F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 168
		bodyModel[17].setRotationPoint(-2.5F, 3.5F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[18].setRotationPoint(-4F, 4F, -7.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Box 167
		bodyModel[19].setRotationPoint(-13F, 6F, -7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 167
		bodyModel[20].setRotationPoint(0F, 5F, -7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 167
		bodyModel[21].setRotationPoint(-4F, 5F, -7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 167
		bodyModel[22].setRotationPoint(0F, 5F, -7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 167
		bodyModel[23].setRotationPoint(0F, 5.5F, -7.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[24].setRotationPoint(-14F, 4F, -7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 167
		bodyModel[25].setRotationPoint(-14F, 5F, -7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[26].setRotationPoint(-10F, 5F, -7.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 167
		bodyModel[27].setRotationPoint(-14F, 5F, -7.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 167
		bodyModel[28].setRotationPoint(-14F, 5.5F, -7.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 167
		bodyModel[29].setRotationPoint(-8.5F, 7F, -7.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[30].setRotationPoint(-7F, 4F, -7.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 202
		bodyModel[31].setRotationPoint(-14F, 5F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 167
		bodyModel[32].setRotationPoint(-7.5F, 4F, -8F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 167
		bodyModel[33].setRotationPoint(-7.5F, 5F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 167
		bodyModel[34].setRotationPoint(-7.5F, 4.5F, -8F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 1, 16, 0F); // Box 207
		bodyModel[35].setRotationPoint(-8F, 3F, -8F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 208
		bodyModel[36].setRotationPoint(-7.5F, 2F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[37].setRotationPoint(-7F, 4F, 6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 167
		bodyModel[38].setRotationPoint(-7.5F, 4F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 167
		bodyModel[39].setRotationPoint(-7.5F, 5F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.125F, 0F); // Box 167
		bodyModel[40].setRotationPoint(-7.5F, 4.5F, 6F);
	}
}