package wwcp;


import ebf.tim.entities.GenericRailTransport;
import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wwcp.blockEntities.platform.*;
import wwcp.entities.freight.*;
import wwcp.entities.locomotives.diesels.*;
import wwcp.entities.locomotives.electrics.EntityES64U2;
import wwcp.entities.locomotives.electrics.EntityES64U4;
import wwcp.entities.locomotives.electrics.EntityTraxxF140MS2E;
import wwcp.entities.locomotives.electrics.EntityV36Electric;
import wwcp.entities.locomotives.steamers.DB.*;
import wwcp.entities.locomotives.steamers.DR.EntityDRBR01;
import wwcp.entities.locomotives.steamers.DR.EntityDRBR01_5;
import wwcp.entities.locomotives.steamers.DR.EntityDRBR01_5Oil;
import wwcp.entities.locomotives.steamers.DR.EntityDRBR01_5SD;
import wwcp.entities.locomotives.steamers.DRG.EntityDRGBR01;
import wwcp.entities.locomotives.steamers.DRG.EntityDRGBR01_10_Streamlined;
import wwcp.entities.locomotives.steamers.DRG.EntityDRGBR01_10_Unstreamlined;
import wwcp.entities.locomotives.steamers.DRG.EntityDRGBR01_850mm;
import wwcp.entities.locomotives.steamers.Entity94xx;
import wwcp.entities.locomotives.steamers.EntityClass812;
import wwcp.entities.locomotives.steamers.EntityDRBR01WitteChristmas;
import wwcp.entities.locomotives.steamers.EntitySentinel100HPChristmas;
import wwcp.entities.passengerstock.*;
import wwcp.entities.railbusses.EntityNE81;
import wwcp.entities.railbusses.EntityVT98;
import wwcp.entities.railbusses.EntityVT98AD;
import wwcp.entities.tender.Entity3000GalonTender;
import wwcp.entities.tender.EntityT32Christmas;
import wwcp.entities.tender.germanTenders.*;

import static ebf.tim.registry.TiMGenericRegistry.registerTransports;


public class wwcp_registrations {
    public static Item crafting_wheel, platform_asphalt;
    public static Block blockBorderPlatform, blockBorderPlatformSlopeLeft, blockBorderPlatformSlopeRight, blockPlatformStair, blockPlatformFullBlock,
            blockPlatformFullSlope, blockPlatformHalfSlope, blockPlatformSlab, blockPlatformStationLamp, blockPlatformSlabSlope;

    static ItemStack inkSack = new ItemStack(Items.dye, 1, 0);
    static ItemStack redDye = new ItemStack(Items.dye, 1, 1);
    static ItemStack greenDye = new ItemStack(Items.dye, 1, 2);
    static ItemStack brownDye = new ItemStack(Items.dye, 1, 3);
    static ItemStack blueDye = new ItemStack(Items.dye, 1, 4);
    static ItemStack purpleDye = new ItemStack(Items.dye, 1, 5);
    static ItemStack cyanDye = new ItemStack(Items.dye, 1, 6);
    static ItemStack lightGrayDye = new ItemStack(Items.dye, 1, 7);
    static ItemStack grayDye = new ItemStack(Items.dye, 1, 8);
    static ItemStack pinkDye = new ItemStack(Items.dye, 1, 9);
    static ItemStack limeDye = new ItemStack(Items.dye, 1, 10);
    static ItemStack yellowDye = new ItemStack(Items.dye, 1, 11);
    static ItemStack lightBlueDye = new ItemStack(Items.dye, 1, 12);
    static ItemStack magentaDye = new ItemStack(Items.dye, 1, 13);
    static ItemStack orangeDye = new ItemStack(Items.dye, 1, 14);
    static ItemStack whiteDye = new ItemStack(Items.dye, 1, 15);

    public static void registerTrains() {
        registerTransports(worldwidecontentpack.MODID, listSteamTrains(), null);
        registerTransports(worldwidecontentpack.MODID, listTenders(), null);
        registerTransports(worldwidecontentpack.MODID, listDiesel(), null);
        registerTransports(worldwidecontentpack.MODID, listpassenger(), null);
        registerTransports(worldwidecontentpack.MODID, listelectric(), null);
        registerTransports(worldwidecontentpack.MODID, listFreight(), null);
        registerTransports(worldwidecontentpack.MODID, listRailbusses(), null);
        registerTransports(worldwidecontentpack.MODID, listTemperory(), null);
    }

    public static void registerItems() {
//        crafting_wheel = new Item().setUnlocalizedName("Crafting_Wheel").setTextureName("wwcp:icon/crafting_wheel").setCreativeTab(worldwidecontentpack.BlocksWWCP);
//        TiMGenericRegistry.RegisterItem(crafting_wheel, worldwidecontentpack.MODID, crafting_wheel.getUnlocalizedName(), null);
//
//        platform_asphalt = new Item().setUnlocalizedName("platform_asphalt").setTextureName("wwcp:icon/platform_asphalt").setCreativeTab(worldwidecontentpack.BlocksWWCP);
//        TiMGenericRegistry.RegisterItem(platform_asphalt, worldwidecontentpack.MODID, platform_asphalt.getUnlocalizedName(), null);
//
//        GameRegistry.addRecipe(new ItemStack(wwcp_registrations.platform_asphalt, 3), "   ", "   ", "X X", 'X', Blocks.stone);
    }

    public static void registerBlocks() {
        //todo set right hitbox values for understated blocks + add in the right icons for the right things + language file entry
        blockBorderPlatform = new BlockBorderPlatform().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/borderSlab");
        TiMGenericRegistry.registerBlock(blockBorderPlatform, null, "wwcp.blockBorderPlatform", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockBorderPlatformSlopeLeft = new BlockBorderPlatformSlopeLeft().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/slabslopeleft");
        TiMGenericRegistry.registerBlock(blockBorderPlatformSlopeLeft, null, "wwcp.blockBorderPlatformSlopeLeft", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockBorderPlatformSlopeRight = new BlockBorderPlatformSlopeRight().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/slabsloperight");
        TiMGenericRegistry.registerBlock(blockBorderPlatformSlopeRight, null, "wwcp.blockBorderPlatformSlopeRight", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformStair = new BlockPlatformStair().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/stair");
        TiMGenericRegistry.registerBlock(blockPlatformStair, null, "wwcp.blockPlatformStair", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformFullBlock = new BlockPlatformFullBlock().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/platblock");
        TiMGenericRegistry.registerBlock(blockPlatformFullBlock, null, "wwcp.blockPlatformFullBlock", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformFullSlope = new BlockPlatformFullSlope().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/fullSlope");
        TiMGenericRegistry.registerBlock(blockPlatformFullSlope, null, "wwcp.blockPlatformFullSlope", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformHalfSlope = new BlockPlatformHalfSlope().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/slabtofull");
        TiMGenericRegistry.registerBlock(blockPlatformHalfSlope, null, "wwcp.blockPlatformHalfSlope", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformSlab = new BlockPlatformSlab().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/platslab");
        TiMGenericRegistry.registerBlock(blockPlatformSlab, null, "wwcp.blockPlatformSlab", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformStationLamp = new BlockPlatformStationLamp().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/stationlampplatform");
        TiMGenericRegistry.registerBlock(blockPlatformStationLamp, null, "wwcp.blockPlatformStationLamp", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformSlabSlope = new BlockPlatformSlabSlope().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/slabslope");
        TiMGenericRegistry.registerBlock(blockPlatformSlabSlope, null, "wwcp.blockPlatformSlabSlope", null, worldwidecontentpack.proxy.getRenderPlatform());

//        GameRegistry.addRecipe(new ItemStack(blockBorderPlatform, 1), "   ", "   ", "XXX", 'X', platform_asphalt);
    }

    // Steam trains
    public static GenericRailTransport[] listSteamTrains() {
        return new GenericRailTransport[]{
                new Entity94xx(null),
                new EntityClass812(null),
                new EntityDRBR01(null),
                new EntityDRBR01_5(null),
                new EntityDRBR01_5Oil(null),
                new EntityDRBR01_5SD(null),
                new EntityDBBR01(null),
                new EntityDBBR01_10Streamlined_Oil(null),
                new EntityDBBR01NeuKessel(null),
                new EntityDBBR01NeuKessel_Oil(null),
                new EntityDBBR01Umbau(null),
                new EntityDBBR012(null),
                new EntityDBBR012_Oil(null),
                new EntityDBBR012NeuKessel(null),
                new EntityDBBR012NeuKessel_Oil(null),
                new EntityDRGBR01(null),
                new EntityDRGBR01_850mm(null),
                new EntityDRGBR01_10_Streamlined(null),
                new EntityDRGBR01_10_Unstreamlined(null),
                new EntityDRBR01WitteChristmas(null),
                new EntitySentinel100HPChristmas(null)
        };
    }

    // Tender list
    public static GenericRailTransport[] listTenders() {
        return new GenericRailTransport[]{
                new Entity3000GalonTender(null),
                new EntityT32(null),
                new EntityT32Christmas(null),
                new EntityT26(null),
                new EntityT34(null),
                new EntityT34AditionalOil(null),
                new EntityT34Oil(null),
                new EntityT34Streamlined(null),
                new EntityT34StreamlinedDRG(null),
                new EntityT37(null),
                new EntityT37DRG(null),
                new EntityT38(null),
                new EntityT38Oil(null)
        };
    }

    // Diesel List
    public static GenericRailTransport[] listDiesel() {
        return new GenericRailTransport[]{
                new EntityV36(null),
                new EntityV36Kanzel(null),
                new EntityClass37(null),
                new EntityAC4400CW(null),
                new EntityMZClassOne(null),
                new EntityMZClassOne1967(null),
                new EntityMZClassTwo(null),
                new EntityMZClassTwo1970(null),
                new EntityMZClassThree(null),
                new EntityMZClassFour(null),
                new EntityKofIII(null),
                new EntityKofIII2(null),
                new EntityF7A(null),
                new EntityF7B(null),
                new EntityGP7(null)
        };
    }

    //Railbusses
    public static GenericRailTransport[] listRailbusses() {
        return new GenericRailTransport[]{
                new EntityNE81(null),
                new EntityVT98AD(null),
                new EntityVT98(null)
        };
    }

    //Temporary TC stock for testing purposes
    public static GenericRailTransport[] listTemperory() {
        return new GenericRailTransport[]{
//                new EntityE10(null),
//                new EntityPropaganda(null),
        };
    }

    //Electric List
    public static GenericRailTransport[] listelectric() {
        return new GenericRailTransport[]{
                new EntityTraxxF140MS2E(null),
                new EntityV36Electric(null),
//                new EntityRE484(null)
                new EntityES64U2(null),
                new EntityES64U4(null)
        };
    }

    //Passenger car list
    public static GenericRailTransport[] listpassenger() {
        return new GenericRailTransport[]{
                new EntityEurofimaCompartment1(null),
                new EntityEurofimaRows(null),
                new EntityEurofimaSleeper(null),
                new EntityDBpza(null),
                new EntityDonder2(null),
                new EntityDonder3(null),
                new EntityDonder4(null),
                new EntityRheingoldSalonOne(null),
                new EntityRheingoldSalonTwo(null),
                new EntityRheingoldSpeiseOne(null),
                new EntityRheingoldSpeiseTwo(null),
                new EntityRheingoldBagage(null),
                new EntityRheingoldSalonOneChristmas(null),
                new EntityRheingoldSalonTwoChristmas(null),
                new EntityRheingoldSpeiseOneChristmas(null),
                new EntityRheingoldSpeiseTwoChristmas(null),
                new EntityGWRThirdChristmas(null)


        };
    }

    //Freight list
    public static GenericRailTransport[] listFreight() {
        return new GenericRailTransport[]{
                new EntityTEUSmall(null),
                new EntityUKopenWagon(null),
                new EntityOFF52Beetle(null),
                new EntitySGNS801BT2TT(null),
                new EntitySGNS802BT(null),
                new EntitySGNS804TS(null),
                new EntitySGNS801BT2TS(null),
                new EntityZACNS95(null),
                new EntityEALOSX(null),                
                new EntityHiCubePlateFBoxcar(null),
                new EntityFortyFoot_Boxcar(null),
                new EntityHabbiins_14(null)
        };
    }
}
