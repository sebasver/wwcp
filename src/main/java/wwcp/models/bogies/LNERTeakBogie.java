//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.12.2018 - 20:32:09
// Last changed on: 16.12.2018 - 20:32:09

package wwcp.models.bogies; //Path where the model is located

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;

public class LNERTeakBogie extends ModelBase //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public LNERTeakBogie() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[77];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 230
		bodyModel[1] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 253
		bodyModel[2] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 254
		bodyModel[3] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 255
		bodyModel[4] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 256
		bodyModel[5] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 257
		bodyModel[6] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 258
		bodyModel[7] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 260
		bodyModel[8] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 261
		bodyModel[9] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 262
		bodyModel[10] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 263
		bodyModel[11] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 264
		bodyModel[12] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 266
		bodyModel[13] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 267
		bodyModel[14] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 268
		bodyModel[15] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 269
		bodyModel[16] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 270
		bodyModel[17] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 271
		bodyModel[18] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 272
		bodyModel[19] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 273
		bodyModel[20] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 274
		bodyModel[21] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 275
		bodyModel[22] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 278
		bodyModel[23] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 279
		bodyModel[24] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 280
		bodyModel[25] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 281
		bodyModel[26] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 282
		bodyModel[27] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 283
		bodyModel[28] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 284
		bodyModel[29] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 285
		bodyModel[30] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 286
		bodyModel[31] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 287
		bodyModel[32] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 289
		bodyModel[33] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 290
		bodyModel[34] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 291
		bodyModel[35] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 292
		bodyModel[36] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 293
		bodyModel[37] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 294
		bodyModel[38] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 295
		bodyModel[39] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 298
		bodyModel[40] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 299
		bodyModel[41] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 300
		bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Wheel
		bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Wheel
		bodyModel[44] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 309
		bodyModel[45] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 310
		bodyModel[46] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 311
		bodyModel[47] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 312
		bodyModel[48] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 313
		bodyModel[49] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 314
		bodyModel[50] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 315
		bodyModel[51] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 316
		bodyModel[52] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 317
		bodyModel[53] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 318
		bodyModel[54] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Wheel
		bodyModel[55] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Wheel
		bodyModel[56] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 322
		bodyModel[57] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 64
		bodyModel[63] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 65
		bodyModel[64] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 66
		bodyModel[65] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 67
		bodyModel[66] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 68
		bodyModel[67] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 69
		bodyModel[68] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 71
		bodyModel[70] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 73
		bodyModel[72] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 74
		bodyModel[73] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 75
		bodyModel[74] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 76
		bodyModel[75] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 77
		bodyModel[76] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 78

		bodyModel[0].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 230
		bodyModel[0].setRotationPoint(-1F, 2F, -1F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 253
		bodyModel[1].setRotationPoint(-5F, 6F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box 254
		bodyModel[2].setRotationPoint(-12F, 4F, 8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[3].setRotationPoint(10F, 3F, 8F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 256
		bodyModel[4].setRotationPoint(12F, 3F, 8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[5].setRotationPoint(15F, 3F, 8F);

		bodyModel[6].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 258
		bodyModel[6].setRotationPoint(12F, 4F, 8F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 260
		bodyModel[7].setRotationPoint(15F, 4F, 8F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 261
		bodyModel[8].setRotationPoint(13F, 5.5F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[9].setRotationPoint(10F, 6F, 8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[10].setRotationPoint(16F, 5F, 8F);

		bodyModel[11].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 264
		bodyModel[11].setRotationPoint(11F, 7F, 8F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 266
		bodyModel[12].setRotationPoint(14F, 5F, 8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[13].setRotationPoint(-12F, 3F, 8F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 268
		bodyModel[14].setRotationPoint(-15F, 3F, 8F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 269
		bodyModel[15].setRotationPoint(-15F, 4F, 8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[16].setRotationPoint(-17F, 3F, 8F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 271
		bodyModel[17].setRotationPoint(-16F, 4F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 272
		bodyModel[18].setRotationPoint(-17F, 5F, 8F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 273
		bodyModel[19].setRotationPoint(-16F, 7F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[20].setRotationPoint(-11F, 6F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 275
		bodyModel[21].setRotationPoint(-13F, 5F, 8F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 278
		bodyModel[22].setRotationPoint(16F, 4F, 8F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 279
		bodyModel[23].setRotationPoint(-18F, 4F, 8F);

		bodyModel[24].addBox(0F, 0F, 0F, 24, 2, 1, 0F); // Box 280
		bodyModel[24].setRotationPoint(-12F, 4F, -9F);

		bodyModel[25].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 281
		bodyModel[25].setRotationPoint(12F, 3F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[26].setRotationPoint(10F, 3F, -9F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 283
		bodyModel[27].setRotationPoint(12F, 4F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[28].setRotationPoint(15F, 3F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 285
		bodyModel[29].setRotationPoint(16F, 4F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 286
		bodyModel[30].setRotationPoint(15F, 4F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[31].setRotationPoint(16F, 5F, -9F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 289
		bodyModel[32].setRotationPoint(14F, 5F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[33].setRotationPoint(-12F, 3F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 291
		bodyModel[34].setRotationPoint(-15F, 3F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[35].setRotationPoint(-17F, 3F, -9F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 293
		bodyModel[36].setRotationPoint(-18F, 4F, -9F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 294
		bodyModel[37].setRotationPoint(-16F, 4F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 295
		bodyModel[38].setRotationPoint(-17F, 5F, -9F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 298
		bodyModel[39].setRotationPoint(-13F, 5F, -9F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 299
		bodyModel[40].setRotationPoint(-15F, 5F, -9F);

		bodyModel[41].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 300
		bodyModel[41].setRotationPoint(-15F, 4F, -9F);

		bodyModel[42].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[42].setRotationPoint(13.5F, 6F, 6F);

		bodyModel[43].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[43].setRotationPoint(13.5F, 6F, -6F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 309
		bodyModel[44].setRotationPoint(13F, 4.5F, -10F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 310
		bodyModel[45].setRotationPoint(13F, 4.5F, 9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[46].setRotationPoint(-19F, 4F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 312
		bodyModel[47].setRotationPoint(-19F, 4F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 313
		bodyModel[48].setRotationPoint(18F, 4F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[49].setRotationPoint(18F, 4F, -9F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 315
		bodyModel[50].setRotationPoint(18F, 4F, -8F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 16, 0F); // Box 316
		bodyModel[51].setRotationPoint(-19F, 4F, -8F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 20, 0F); // Box 317
		bodyModel[52].setRotationPoint(-14F, 5.5F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 318
		bodyModel[53].setRotationPoint(-14F, 4.5F, -10F);

		bodyModel[54].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[54].setRotationPoint(-13.5F, 6F, 6F);

		bodyModel[55].addBox(-4F, -4F, 0F, 8, 8, 0, 0F); // Wheel
		bodyModel[55].setRotationPoint(-13.5F, 6F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 10, 2, 16, 0F); // Box 322
		bodyModel[56].setRotationPoint(-5F, 4F, -8F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 59
		bodyModel[57].setRotationPoint(12F, 5F, 8F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 60
		bodyModel[58].setRotationPoint(-15F, 5F, 8F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 61
		bodyModel[59].setRotationPoint(12F, 5F, -9F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 62
		bodyModel[60].setRotationPoint(-14F, 4.5F, 9F);

		bodyModel[61].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 63
		bodyModel[61].setRotationPoint(-16F, 6F, 8F);

		bodyModel[62].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 64
		bodyModel[62].setRotationPoint(-13F, 6F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[63].setRotationPoint(-14F, 6F, 8F);

		bodyModel[64].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 66
		bodyModel[64].setRotationPoint(14F, 6F, 8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[65].setRotationPoint(13F, 6F, 8F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 68
		bodyModel[66].setRotationPoint(11F, 6F, 8F);

		bodyModel[67].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 69
		bodyModel[67].setRotationPoint(11F, 7F, -9F);

		bodyModel[68].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 70
		bodyModel[68].setRotationPoint(11F, 6F, -9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[69].setRotationPoint(13F, 6F, -9F);

		bodyModel[70].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 72
		bodyModel[70].setRotationPoint(14F, 6F, -9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 73
		bodyModel[71].setRotationPoint(10F, 6F, -9F);

		bodyModel[72].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 74
		bodyModel[72].setRotationPoint(-16F, 6F, -9F);

		bodyModel[73].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 75
		bodyModel[73].setRotationPoint(-13F, 6F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[74].setRotationPoint(-14F, 6F, -9F);

		bodyModel[75].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 77
		bodyModel[75].setRotationPoint(-16F, 7F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[76].setRotationPoint(-11F, 6F, -9F);
	}
}