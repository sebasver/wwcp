//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 30.11.2018 - 20:26:16
// Last changed on: 30.11.2018 - 20:26:16

package wwcp.models.locomotives;

import ebf.tim.models.StaticModelAnimator;
import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;

public class UK94 extends ModelBase//Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public UK94() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[273];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);

	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 21
		bodyModel[9] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 130
		bodyModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 131
		bodyModel[11] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 132
		bodyModel[12] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 133
		bodyModel[13] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 135
		bodyModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 136
		bodyModel[15] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 137
		bodyModel[16] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 23
		bodyModel[17] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 24
		bodyModel[18] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 26
		bodyModel[20] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 27
		bodyModel[21] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 28
		bodyModel[22] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 37
		bodyModel[31] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 38
		bodyModel[32] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 43
		bodyModel[37] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 44
		bodyModel[38] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 45
		bodyModel[39] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 52
		bodyModel[46] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 53
		bodyModel[47] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Whistle
		bodyModel[48] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 56
		bodyModel[49] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 57
		bodyModel[50] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 58
		bodyModel[51] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 63
		bodyModel[52] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 64
		bodyModel[53] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 65
		bodyModel[54] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 66
		bodyModel[55] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 67
		bodyModel[56] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 70
		bodyModel[58] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 71
		bodyModel[59] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 72
		bodyModel[60] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 73
		bodyModel[61] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 74
		bodyModel[62] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 76
		bodyModel[63] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 77
		bodyModel[64] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 78
		bodyModel[65] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 266
		bodyModel[66] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 267
		bodyModel[67] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 269
		bodyModel[68] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 271
		bodyModel[69] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 272
		bodyModel[70] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 273
		bodyModel[71] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 275
		bodyModel[72] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Wheel
		bodyModel[73] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Wheel
		bodyModel[74] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 49
		bodyModel[75] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 281
		bodyModel[76] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Wheel
		bodyModel[77] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Wheel
		bodyModel[78] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 284
		bodyModel[79] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Wheel
		bodyModel[80] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Wheel
		bodyModel[81] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 287
		bodyModel[82] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 288
		bodyModel[83] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 290
		bodyModel[84] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 291
		bodyModel[85] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 292
		bodyModel[86] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 293
		bodyModel[87] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 294
		bodyModel[88] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 295
		bodyModel[89] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 296
		bodyModel[90] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 297
		bodyModel[91] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 298
		bodyModel[92] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 299
		bodyModel[93] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 300
		bodyModel[94] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 301
		bodyModel[95] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 303
		bodyModel[96] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 304
		bodyModel[97] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 313
		bodyModel[98] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 314
		bodyModel[99] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Smoke Stack
		bodyModel[100] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 330
		bodyModel[101] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 331
		bodyModel[102] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 332
		bodyModel[103] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 333
		bodyModel[104] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 334
		bodyModel[105] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 335
		bodyModel[106] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 341
		bodyModel[107] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 342
		bodyModel[108] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 343
		bodyModel[109] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 344
		bodyModel[110] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 345
		bodyModel[111] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 346
		bodyModel[112] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 347
		bodyModel[113] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 350
		bodyModel[114] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Whistle
		bodyModel[115] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 352
		bodyModel[116] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 353
		bodyModel[117] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 354
		bodyModel[118] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 355
		bodyModel[119] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 356
		bodyModel[120] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 357
		bodyModel[121] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 358
		bodyModel[122] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 359
		bodyModel[123] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 360
		bodyModel[124] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 361
		bodyModel[125] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 362
		bodyModel[126] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 363
		bodyModel[127] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 364
		bodyModel[128] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 365
		bodyModel[129] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 366
		bodyModel[130] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 367
		bodyModel[131] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 368
		bodyModel[132] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 369
		bodyModel[133] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 370
		bodyModel[134] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 371
		bodyModel[135] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 372
		bodyModel[136] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 373
		bodyModel[137] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 374
		bodyModel[138] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 375
		bodyModel[139] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 376
		bodyModel[140] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 377
		bodyModel[141] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 378
		bodyModel[142] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 381
		bodyModel[143] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 382
		bodyModel[144] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 383
		bodyModel[145] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 384
		bodyModel[146] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 385
		bodyModel[147] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 386
		bodyModel[148] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 388
		bodyModel[149] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 391
		bodyModel[150] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 393
		bodyModel[151] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 394
		bodyModel[152] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 395
		bodyModel[153] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 396
		bodyModel[154] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 397
		bodyModel[155] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Box 398
		bodyModel[156] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 406
		bodyModel[157] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 407
		bodyModel[158] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 408
		bodyModel[159] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 409
		bodyModel[160] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 410
		bodyModel[161] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 411
		bodyModel[162] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 412
		bodyModel[163] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 413
		bodyModel[164] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 414
		bodyModel[165] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 415
		bodyModel[166] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 416
		bodyModel[167] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 418
		bodyModel[168] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 419
		bodyModel[169] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 420
		bodyModel[170] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 421
		bodyModel[171] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 422
		bodyModel[172] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 423
		bodyModel[173] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 424
		bodyModel[174] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 425
		bodyModel[175] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 426
		bodyModel[176] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 427
		bodyModel[177] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Cylinder
		bodyModel[178] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 429
		bodyModel[179] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 430
		bodyModel[180] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 431
		bodyModel[181] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 434
		bodyModel[182] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 435
		bodyModel[183] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 436
		bodyModel[184] = new ModelRendererTurbo(this, 9, 105, textureX, textureY); // Box 437
		bodyModel[185] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 438
		bodyModel[186] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 439
		bodyModel[187] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Cylinder
		bodyModel[188] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 441
		bodyModel[189] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 442
		bodyModel[190] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 443
		bodyModel[191] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 444
		bodyModel[192] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 445
		bodyModel[193] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 446
		bodyModel[194] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Box 447
		bodyModel[195] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 448
		bodyModel[196] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 449
		bodyModel[197] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 450
		bodyModel[198] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 451
		bodyModel[199] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 452
		bodyModel[200] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 453
		bodyModel[201] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 454
		bodyModel[202] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 455
		bodyModel[203] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 456
		bodyModel[204] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 457
		bodyModel[205] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 458
		bodyModel[206] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 461
		bodyModel[207] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 462
		bodyModel[208] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 463
		bodyModel[209] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 464
		bodyModel[210] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 465
		bodyModel[211] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 467
		bodyModel[212] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 468
		bodyModel[213] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 469
		bodyModel[214] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Coal Load
		bodyModel[215] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 225
		bodyModel[216] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 218
		bodyModel[217] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 219

		bodyModel[0].addBox(0F, 0F, 0F, 73, 2, 21, 0F); // Box 0
		bodyModel[0].setRotationPoint(-30F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 21, 0F); // Box 1
		bodyModel[1].setRotationPoint(-30F, 2F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-29F, 2F, -11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 3
		bodyModel[3].setRotationPoint(41F, 2F, -11F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 2, 21, 0F); // Box 4
		bodyModel[4].setRotationPoint(42F, 2F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-35F, 0F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[6].setRotationPoint(-35F, 0F, 5.5F);

		bodyModel[7].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[7].setRotationPoint(-34F, 1.5F, 7F);
		bodyModel[7].rotateAngleX = 0.78539816F;

		bodyModel[8].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 21
		bodyModel[8].setRotationPoint(-34F, 1.5F, -8F);
		bodyModel[8].rotateAngleX = 0.78539816F;

		bodyModel[9].addBox(0F, 0F, 0F, 38, 12, 4, 0F); // Box 130
		bodyModel[9].setRotationPoint(-29F, -15F, -2.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 131
		bodyModel[10].setRotationPoint(-29F, -11F, -6.5F);

		bodyModel[11].addBox(0F, 0F, 0F, 11, 4, 4, 0F); // Box 132
		bodyModel[11].setRotationPoint(-29F, -11F, 1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[12].setRotationPoint(-29F, -15F, 1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[13].setRotationPoint(-29F, -15F, -6.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 38, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[14].setRotationPoint(-29F, -7F, -6.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 38, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 137
		bodyModel[15].setRotationPoint(-29F, -7F, 1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 27, 2, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[16].setRotationPoint(-18F, -17F, -2.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 44, 8, 21, 0F); // Box 24
		bodyModel[17].setRotationPoint(-22F, -13F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 44, 1, 19, 0F); // Box 25
		bodyModel[18].setRotationPoint(-22F, -14F, -10F);

		bodyModel[19].addBox(0F, 0F, 0F, 44, 1, 19, 0F); // Box 26
		bodyModel[19].setRotationPoint(-22F, -5F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[20].setRotationPoint(-22F, -14F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[21].setRotationPoint(-22F, -5F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 29
		bodyModel[22].setRotationPoint(-22F, -5F, 9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[23].setRotationPoint(-22F, -14F, 9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 27, 4, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[24].setRotationPoint(-18F, -15F, 1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 27, 4, 4, 0F,0F, -4F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[25].setRotationPoint(-18F, -15F, -6.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 13, 4, 11, 0F); // Box 33
		bodyModel[26].setRotationPoint(9F, -17.5F, -6F);

		bodyModel[27].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 34
		bodyModel[27].setRotationPoint(9F, -16.5F, -7F);

		bodyModel[28].addBox(0F, 0F, 0F, 13, 17, 1, 0F); // Box 35
		bodyModel[28].setRotationPoint(9F, -16.5F, 5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[29].setRotationPoint(9F, -17.5F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[30].setRotationPoint(9F, -17.5F, 5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[31].setRotationPoint(8F, -16.5F, 5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[32].setRotationPoint(8F, -16.5F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[33].setRotationPoint(8F, -17.5F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 41
		bodyModel[34].setRotationPoint(8F, -17.5F, 5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[35].setRotationPoint(8F, -17.5F, -6F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 17, 11, 0F); // Box 43
		bodyModel[36].setRotationPoint(8F, -16.5F, -6F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 15, 21, 0F); // Box 44
		bodyModel[37].setRotationPoint(22F, -15F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 45
		bodyModel[38].setRotationPoint(22F, -18F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 6, 7, 0F); // Box 46
		bodyModel[39].setRotationPoint(22F, -21F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 47
		bodyModel[40].setRotationPoint(22F, -19F, -10F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[41].setRotationPoint(22F, -19F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 16, 1, 6, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[42].setRotationPoint(22F, -19F, 3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[43].setRotationPoint(22F, -19F, 9F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 51
		bodyModel[44].setRotationPoint(22F, -18F, 9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[45].setRotationPoint(22F, -20F, 3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[46].setRotationPoint(22F, -20F, -7F);

		bodyModel[47].addTrapezoid(0F, 0F, 0F, 1, 2, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Whistle
		bodyModel[47].setRotationPoint(20F, -19.5F, -2F);

		bodyModel[48].addBox(0F, 0F, 0F, 15, 1, 7, 0F); // Box 56
		bodyModel[48].setRotationPoint(23F, -21F, -4F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 57
		bodyModel[49].setRotationPoint(37F, -18F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Box 58
		bodyModel[50].setRotationPoint(37F, -18F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[51].setRotationPoint(37F, -20F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[52].setRotationPoint(37F, -20F, 3F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 65
		bodyModel[53].setRotationPoint(37F, -20F, 2F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 66
		bodyModel[54].setRotationPoint(37F, -20F, -4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, -1F, 0F, -0.65F, -1F, 0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[55].setRotationPoint(37F, -19F, -10F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.65F, 0F, 0F, -0.65F, 0F, 0F, -0.65F, -1F, 0F, -0.65F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[56].setRotationPoint(37F, -19F, 8F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 15, 21, 0F); // Box 70
		bodyModel[57].setRotationPoint(37F, -15F, -11F);

		bodyModel[58].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 71
		bodyModel[58].setRotationPoint(38F, -15F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 72
		bodyModel[59].setRotationPoint(38F, -15F, 9F);

		bodyModel[60].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 73
		bodyModel[60].setRotationPoint(38F, -10F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 2, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[61].setRotationPoint(43F, -10F, -11F);

		bodyModel[62].addBox(0F, 0F, 0F, 5, 10, 1, 0F); // Box 76
		bodyModel[62].setRotationPoint(38F, -10F, 9F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 8, 19, 0F); // Box 77
		bodyModel[63].setRotationPoint(42F, -8F, -10F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 5, 19, 0F); // Box 78
		bodyModel[64].setRotationPoint(44F, -15F, -10F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Box 266
		bodyModel[65].setRotationPoint(-30F, -11F, -2.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[66].setRotationPoint(-30F, -15F, -2.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[67].setRotationPoint(-30F, -15F, -6.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 271
		bodyModel[68].setRotationPoint(-30F, -7F, -2.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 272
		bodyModel[69].setRotationPoint(-30F, -7F, 1.5F);
		bodyModel[69].rotateAngleX = 1.57079633F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[70].setRotationPoint(-30F, -7F, -6.5F);
		bodyModel[70].rotateAngleX = 1.57079633F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4F, -0.5F, -0.5F, -4F, -0.5F); // Box 275
		bodyModel[71].setRotationPoint(-30F, -7F, 1.5F);

		bodyModel[72].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[72].setRotationPoint(24F, 4F, 5.5F);

		bodyModel[73].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[73].setRotationPoint(24F, 4F, -6.5F);

		bodyModel[74].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 49
		bodyModel[74].setRotationPoint(24F, 4F, -6.5F);

		bodyModel[75].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 281
		bodyModel[75].setRotationPoint(4F, 4F, -6.5F);

		bodyModel[76].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[76].setRotationPoint(4F, 4F, -6.5F);

		bodyModel[77].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[77].setRotationPoint(4F, 4F, 5.5F);

		bodyModel[78].addBox(-0.5F, -0.5F, 0F, 1, 1, 12, 0F); // Box 284
		bodyModel[78].setRotationPoint(-14F, 4F, -6.5F);

		bodyModel[79].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[79].setRotationPoint(-14F, 4F, -6.5F);

		bodyModel[80].addBox(-6F, -6F, 0F, 12, 12, 0, 0F); // Wheel
		bodyModel[80].setRotationPoint(-14F, 4F, 5.5F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 18, 1, 0F); // Box 287
		bodyModel[81].setRotationPoint(23F, -18F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 288
		bodyModel[82].setRotationPoint(27F, -10F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 290
		bodyModel[83].setRotationPoint(27F, -18F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Box 291
		bodyModel[84].setRotationPoint(35F, -17F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 292
		bodyModel[85].setRotationPoint(34F, -10F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[86].setRotationPoint(27F, -12F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[87].setRotationPoint(27F, -17F, -11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 295
		bodyModel[88].setRotationPoint(33F, -17F, -11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[89].setRotationPoint(34F, -11F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 10, 1, 0F); // Box 297
		bodyModel[90].setRotationPoint(31F, -10F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 8, 8, 9, 0F); // Box 298
		bodyModel[91].setRotationPoint(-24F, -8F, -5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 2, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[92].setRotationPoint(-28F, -2F, -5F);

		bodyModel[93].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 300
		bodyModel[93].setRotationPoint(-22F, -4F, -9F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 301
		bodyModel[94].setRotationPoint(-22F, -4F, 6F);

		bodyModel[95].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 303
		bodyModel[95].setRotationPoint(-31.5F, -9.5F, -0.5F);
		bodyModel[95].rotateAngleX = 0.38397244F;

		bodyModel[96].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 304
		bodyModel[96].setRotationPoint(-31F, -9.5F, -0.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 313
		bodyModel[97].setRotationPoint(-16F, -15F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[98].setRotationPoint(-23F, -20F, 0.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Smoke Stack
		bodyModel[99].setRotationPoint(-23.5F, -20.1F, -2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 330
		bodyModel[100].setRotationPoint(-24.5F, -20.1F, 1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 331
		bodyModel[101].setRotationPoint(-23.5F, -20.1F, -2F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 332
		bodyModel[102].setRotationPoint(-20.5F, -20.1F, 1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[103].setRotationPoint(-20.5F, -20.1F, -3F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 334
		bodyModel[104].setRotationPoint(-24.5F, -20.1F, -3F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 335
		bodyModel[105].setRotationPoint(-24.5F, -21.1F, 1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[106].setRotationPoint(-24.5F, -21.1F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[107].setRotationPoint(-20.5F, -21.1F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 343
		bodyModel[108].setRotationPoint(-20.5F, -21.1F, 1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[109].setRotationPoint(-23.5F, -21.1F, 1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[110].setRotationPoint(-23.5F, -21.1F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 346
		bodyModel[111].setRotationPoint(-20.5F, -21.1F, -2F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[112].setRotationPoint(-24.5F, -21.1F, -2F);

		bodyModel[113].addBox(0F, 0F, 0F, 4, 5, 2, 0F); // Box 350
		bodyModel[113].setRotationPoint(-24F, -20F, -1.5F);

		bodyModel[114].addTrapezoid(0F, 0F, 0F, 1, 2, 1, 0F, 0F, ModelRendererTurbo.MR_TOP); // Whistle
		bodyModel[114].setRotationPoint(20F, -19.5F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[115].setRotationPoint(-16F, -15F, -7F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 353
		bodyModel[116].setRotationPoint(-17F, -15F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 354
		bodyModel[117].setRotationPoint(-23F, -20F, -2.5F);

		bodyModel[118].addShapeBox(-1F, 0F, -1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 355
		bodyModel[118].setRotationPoint(3.4F, -19.5F, -0.5F);
		bodyModel[118].rotateAngleY = -0.78539816F;

		bodyModel[119].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[119].setRotationPoint(3F, -20F, -0.5F);
		bodyModel[119].rotateAngleX = 0.10471976F;
		bodyModel[119].rotateAngleY = -0.78539816F;
		bodyModel[119].rotateAngleZ = 0.10471976F;

		bodyModel[120].addShapeBox(-2F, 0F, -2F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F); // Box 357
		bodyModel[120].setRotationPoint(4.1F, -19.6F, -0.5F);
		bodyModel[120].rotateAngleY = -0.78539816F;

		bodyModel[121].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 358
		bodyModel[121].setRotationPoint(-17F, -15F, 6F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[122].setRotationPoint(-16F, -15F, 7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 360
		bodyModel[123].setRotationPoint(-16F, -15F, 5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[124].setRotationPoint(2.9F, -18F, 0.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[125].setRotationPoint(2.9F, -18F, -3.5F);

		bodyModel[126].addBox(-3F, 0F, -1F, 3, 10, 1, 0F); // Box 363
		bodyModel[126].setRotationPoint(34F, -10F, 10F);

		bodyModel[127].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Box 364
		bodyModel[127].setRotationPoint(27F, -18F, 9F);

		bodyModel[128].addBox(0F, 0F, 0F, 4, 18, 1, 0F); // Box 365
		bodyModel[128].setRotationPoint(23F, -18F, 9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[129].setRotationPoint(27F, -17F, 9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[130].setRotationPoint(27F, -12F, 9F);

		bodyModel[131].addBox(0F, 0F, 0F, 4, 10, 1, 0F); // Box 368
		bodyModel[131].setRotationPoint(27F, -10F, 9F);

		bodyModel[132].addBox(0F, 0F, 0F, 2, 17, 1, 0F); // Box 369
		bodyModel[132].setRotationPoint(35F, -17F, 9F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 370
		bodyModel[133].setRotationPoint(33F, -17F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[134].setRotationPoint(34F, -11F, 9F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Box 372
		bodyModel[135].setRotationPoint(34F, -10F, 9F);

		bodyModel[136].addBox(-0.5F, -0.5F, 0F, 39, 1, 1, 0F); // Box 373
		bodyModel[136].setRotationPoint(-14F, 5F, -7.5F);

		bodyModel[137].addBox(-0.5F, -0.5F, 0F, 39, 1, 1, 0F); // Box 374
		bodyModel[137].setRotationPoint(-14F, 3F, 5.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 375
		bodyModel[138].setRotationPoint(-17F, -2F, -9F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 376
		bodyModel[139].setRotationPoint(-17F, -2F, 5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 377
		bodyModel[140].setRotationPoint(1F, -2F, 5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 378
		bodyModel[141].setRotationPoint(1F, -2F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[142].setRotationPoint(0.5F, -2F, 8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[143].setRotationPoint(0.5F, -3F, 8F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[144].setRotationPoint(0.5F, -3F, -11F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[145].setRotationPoint(0.5F, -2F, -11F);

		bodyModel[146].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 385
		bodyModel[146].setRotationPoint(43F, 1.5F, 7F);
		bodyModel[146].rotateAngleX = 0.78539816F;

		bodyModel[147].addShapeBox(0F, -1F, -1F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 386
		bodyModel[147].setRotationPoint(43F, 1.5F, -8F);
		bodyModel[147].rotateAngleX = 0.78539816F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 388
		bodyModel[148].setRotationPoint(46.5F, 0F, 5.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 391
		bodyModel[149].setRotationPoint(46.5F, 0F, -9.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[150].setRotationPoint(-33F, 2F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[151].setRotationPoint(-34F, 1F, -1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F); // Box 395
		bodyModel[152].setRotationPoint(-31F, 1F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[153].setRotationPoint(43F, 1F, -1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[154].setRotationPoint(45F, 2F, -1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[155].setRotationPoint(46.25F, 1F, -1F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 406
		bodyModel[156].setRotationPoint(-29F, -2F, -9F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 407
		bodyModel[157].setRotationPoint(-29F, -2F, 7F);

		bodyModel[158].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 408
		bodyModel[158].setRotationPoint(30.5F, 2F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[159].setRotationPoint(30.5F, 4F, -12F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[160].setRotationPoint(30.5F, 7F, -12F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[161].setRotationPoint(30.5F, 7F, 10F);

		bodyModel[162].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 412
		bodyModel[162].setRotationPoint(30.5F, 2F, 9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[163].setRotationPoint(30.5F, 4F, 10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[164].setRotationPoint(19F, -2F, 5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[165].setRotationPoint(19F, -2F, -9F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[166].setRotationPoint(23F, -2F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[167].setRotationPoint(23F, -2F, -10F);

		bodyModel[168].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 419
		bodyModel[168].setRotationPoint(40.99F, 2F, 8.99F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[169].setRotationPoint(40.99F, 7F, 9.99F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[170].setRotationPoint(40.99F, 4F, 9.99F);

		bodyModel[171].addBox(0F, 0F, 0F, 2, 6, 1, 0F); // Box 422
		bodyModel[171].setRotationPoint(40.99F, 2F, -10.99F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[172].setRotationPoint(40.99F, 7F, -11.99F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[173].setRotationPoint(40.99F, 4F, -11.99F);

		bodyModel[174].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 425
		bodyModel[174].setRotationPoint(-29F, -2F, -1F);

		bodyModel[175].addBox(-0.5F, -0.5F, 0F, 54, 1, 1, 0F); // Box 426
		bodyModel[175].setRotationPoint(-22.5F, 7F, -7.5F);

		bodyModel[176].addBox(-0.5F, -0.5F, 0F, 54, 1, 1, 0F); // Box 427
		bodyModel[176].setRotationPoint(-22.5F, 7F, 5.5F);

		bodyModel[177].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Cylinder
		bodyModel[177].setRotationPoint(-20.5F, 3F, 4.5F);

		bodyModel[178].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 429
		bodyModel[178].setRotationPoint(-2.5F, 3F, 4.5F);

		bodyModel[179].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 430
		bodyModel[179].setRotationPoint(17.5F, 3F, 4.5F);

		bodyModel[180].addShapeBox(-1F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F); // Box 431
		bodyModel[180].setRotationPoint(-21F, 3.5F, 4.5F);

		bodyModel[181].addShapeBox(-1F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F); // Box 434
		bodyModel[181].setRotationPoint(-3F, 3.5F, 4.5F);

		bodyModel[182].addShapeBox(-1F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F); // Box 435
		bodyModel[182].setRotationPoint(17F, 3.5F, 4.5F);

		bodyModel[183].addShapeBox(-1F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F); // Box 436
		bodyModel[183].setRotationPoint(17F, 3.5F, -6.5F);

		bodyModel[184].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 437
		bodyModel[184].setRotationPoint(17.5F, 3F, -6.5F);

		bodyModel[185].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Box 438
		bodyModel[185].setRotationPoint(-2.5F, 3F, -6.5F);

		bodyModel[186].addShapeBox(-1F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F); // Box 439
		bodyModel[186].setRotationPoint(-3F, 3.5F, -6.5F);

		bodyModel[187].addBox(-0.5F, -0.5F, 0F, 1, 3, 1, 0F); // Cylinder
		bodyModel[187].setRotationPoint(-20.5F, 3F, -6.5F);

		bodyModel[188].addShapeBox(-1F, 0F, 0F, 1, 4, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, -1F, 0F); // Box 441
		bodyModel[188].setRotationPoint(-21F, 3.5F, -6.5F);

		bodyModel[189].addBox(-0.5F, -0.5F, 0F, 1, 6, 1, 0F); // Box 442
		bodyModel[189].setRotationPoint(30.5F, 2F, -6.5F);

		bodyModel[190].addBox(-0.5F, -0.5F, 0F, 1, 6, 1, 0F); // Box 443
		bodyModel[190].setRotationPoint(30.5F, 2F, 4.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[191].setRotationPoint(-29F, 2F, -5.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 3, 3, 10, 0F); // Box 445
		bodyModel[192].setRotationPoint(-24F, 2F, -5.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 446
		bodyModel[193].setRotationPoint(-22F, 5F, -5.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 56, 4, 10, 0F); // Box 447
		bodyModel[194].setRotationPoint(-21F, 2F, -5.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[195].setRotationPoint(35F, 2F, -5.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[196].setRotationPoint(23F, -16.5F, 5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[197].setRotationPoint(23F, -17.5F, 5F);

		bodyModel[198].addBox(0F, 0F, 0F, 1, 17, 11, 0F); // Box 451
		bodyModel[198].setRotationPoint(23F, -16.5F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[199].setRotationPoint(23F, -17.5F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 453
		bodyModel[200].setRotationPoint(23F, -16.5F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 454
		bodyModel[201].setRotationPoint(23F, -17.5F, -7F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 455
		bodyModel[202].setRotationPoint(23F, -9.5F, 6F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 456
		bodyModel[203].setRotationPoint(31F, -5.5F, 4F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 457
		bodyModel[204].setRotationPoint(23F, -19.5F, 0F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 458
		bodyModel[205].setRotationPoint(23F, -19.5F, -4F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 461
		bodyModel[206].setRotationPoint(25F, -11.5F, -1F);
		bodyModel[206].rotateAngleX = -0.34906585F;

		bodyModel[207].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 462
		bodyModel[207].setRotationPoint(25F, -11.5F, -1F);
		bodyModel[207].rotateAngleX = 1.22173048F;

		bodyModel[208].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 463
		bodyModel[208].setRotationPoint(24F, -11.5F, -5F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 464
		bodyModel[209].setRotationPoint(24F, -11.5F, -1F);
		bodyModel[209].rotateAngleX = -0.34906585F;

		bodyModel[210].addBox(0F, -1F, -1F, 1, 2, 2, 0F); // Box 465
		bodyModel[210].setRotationPoint(24F, -10.5F, 3F);
		bodyModel[210].rotateAngleX = -0.26179939F;

		bodyModel[211].addBox(0F, -3F, -0.5F, 1, 2, 1, 0F); // Box 467
		bodyModel[211].setRotationPoint(24F, -10.5F, 3F);
		bodyModel[211].rotateAngleX = -0.26179939F;

		bodyModel[212].addBox(0F, 0F, 0F, 2, 10, 19, 0F); // Box 468
		bodyModel[212].setRotationPoint(35F, -10F, -10F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 5, 0F); // Box 469
		bodyModel[213].setRotationPoint(24F, -5.5F, -3F);

		bodyModel[214].addBox(0F, 0F, 0F, 6, 0, 19, 0F); // Coal Load
		bodyModel[214].setRotationPoint(38F, -14F, -10F);

		bodyModel[215].addBox(-0.5F, -0.5F, 0F, 1, 1, 10, 0F); // Box 225
		bodyModel[215].setRotationPoint(-22.5F, 7F, -5.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[216].setRotationPoint(-30F, -3F, -6.5F);
		bodyModel[216].rotateAngleX = 1.57079633F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.5F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[217].setRotationPoint(-30F, -15F, 5.5F);
		bodyModel[217].rotateAngleX = -1.57079633F;
	}
}