//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.06.2020 - 09:17:36
// Last changed on: 15.06.2020 - 09:17:36

package wwcp.models.bogies.AmericanTrucks; //Path where the model is located


import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class Amfleet1_truck extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Amfleet1_truck() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[26];

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
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 79
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 75
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 76
		bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 77
		bodyModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 78
		bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 78
		bodyModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 78
		bodyModel[12] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 78
		bodyModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 78
		bodyModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 78
		bodyModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 78
		bodyModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 78
		bodyModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 78
		bodyModel[18] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 78
		bodyModel[19] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 78
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 78
		bodyModel[21] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 78
		bodyModel[22] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 78
		bodyModel[23] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 78
		bodyModel[24] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 78
		bodyModel[25] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 76

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 0
		bodyModel[0].setRotationPoint(-9.5F, 6F, -6.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[1].setRotationPoint(-11.5F, 4F, -6F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[2].setRotationPoint(-11.5F, 4F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 1
		bodyModel[3].setRotationPoint(5.5F, 4F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 6, 0, 0F); // Box 2
		bodyModel[4].setRotationPoint(5.5F, 4F, 6F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 2, 13, 0F); // Box 79
		bodyModel[5].setRotationPoint(7.5F, 6F, -6.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 21, 3, 1, 0F); // Box 75
		bodyModel[6].setRotationPoint(-10.5F, 5.5F, -5.95F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 76
		bodyModel[7].setRotationPoint(-2.5F, 5.5F, -5F);

		bodyModel[8].addBox(0F, 0F, 0F, 21, 3, 1, 0F); // Box 77
		bodyModel[8].setRotationPoint(-10.5F, 5.5F, 4.95F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 78
		bodyModel[9].setRotationPoint(-4F, 5F, -6.95F);
		bodyModel[9].rotateAngleZ = -0.34906585F;

		bodyModel[10].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 78
		bodyModel[10].setRotationPoint(-4.98F, 4.75F, -6.95F);
		bodyModel[10].rotateAngleZ = -0.34906585F;

		bodyModel[11].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 78
		bodyModel[11].setRotationPoint(-3.5F, 5.75F, -6.75F);
		bodyModel[11].rotateAngleZ = -0.34906585F;

		bodyModel[12].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 78
		bodyModel[12].setRotationPoint(-5.5F, 6.5F, -6.75F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 78
		bodyModel[13].setRotationPoint(-4F, 5F, 5.95F);
		bodyModel[13].rotateAngleZ = -0.34906585F;

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 78
		bodyModel[14].setRotationPoint(-4.98F, 4.75F, 5.95F);
		bodyModel[14].rotateAngleZ = -0.34906585F;

		bodyModel[15].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 78
		bodyModel[15].setRotationPoint(-3.5F, 5.75F, 5.75F);
		bodyModel[15].rotateAngleZ = -0.34906585F;

		bodyModel[16].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 78
		bodyModel[16].setRotationPoint(-5.5F, 6.5F, 5.75F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 78
		bodyModel[17].setRotationPoint(3F, 5.35F, -6.95F);
		bodyModel[17].rotateAngleZ = 0.34906585F;

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 78
		bodyModel[18].setRotationPoint(3.98F, 5.1F, -6.95F);
		bodyModel[18].rotateAngleZ = 0.34906585F;

		bodyModel[19].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 78
		bodyModel[19].setRotationPoint(2.5F, 6.1F, -6.75F);
		bodyModel[19].rotateAngleZ = 0.34906585F;

		bodyModel[20].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 78
		bodyModel[20].setRotationPoint(4.5F, 6.5F, -6.75F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 78
		bodyModel[21].setRotationPoint(3F, 5.35F, 5.95F);
		bodyModel[21].rotateAngleZ = 0.34906585F;

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 78
		bodyModel[22].setRotationPoint(3.98F, 5.1F, 5.95F);
		bodyModel[22].rotateAngleZ = 0.34906585F;

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 78
		bodyModel[23].setRotationPoint(2.5F, 6.1F, 5.75F);
		bodyModel[23].rotateAngleZ = 0.34906585F;

		bodyModel[24].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 78
		bodyModel[24].setRotationPoint(4.5F, 6.5F, 5.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 76
		bodyModel[25].setRotationPoint(-1F, 10.25F, -1F);
	}
}