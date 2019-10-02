package wwcp.models.platforms; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import fexcraft.tmt.slim.ModelBase;

public class BorderplatformSecond extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public BorderplatformSecond() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];

		initbodyModel_1();

	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4

		bodyModel[0].addBox(5F, 1F, 0F, 16, 6, 10, 0F); // Box 4
		bodyModel[0].setRotationPoint(0F, 4F, 0F);
	}
}