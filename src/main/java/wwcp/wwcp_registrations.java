package wwcp;


import ebf.tim.entities.GenericRailTransport;
import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wwcp.blockEntities.platform.*;
import wwcp.entities.WWCPFictional.EntityWWCPShopShunter;
import wwcp.entities.WWCPFictional.EntityWWCPStandard_0_6_2T;
import wwcp.entities.freight.*;
import wwcp.entities.Advent.*;
import wwcp.entities.locomotives.diesels.EntityGP7HighHood;
import wwcp.entities.locomotives.diesels.*;
import wwcp.entities.locomotives.electrics.*;
import wwcp.entities.locomotives.steamers.*;
import wwcp.entities.locomotives.steamers.BR01.DRG.*;
import wwcp.entities.locomotives.steamers.BR01.DR.*;
import wwcp.entities.locomotives.steamers.BR01.DB.*;
import wwcp.entities.locomotives.steamers.BR50.DRG.*;
import wwcp.entities.locomotives.steamers.BR50.DR.*;
import wwcp.entities.locomotives.steamers.BR50.DB.*;
import wwcp.entities.passengerstock.*;
import wwcp.entities.passengerstock.Eurofima.*;
import wwcp.entities.passengerstock.RheingoldOld.*;
import wwcp.entities.railbusses.EntityNE81;
import wwcp.entities.railbusses.EntitySeries4000;
import wwcp.entities.railbusses.EntityVT98;
import wwcp.entities.railbusses.EntityVT98AD;
import wwcp.entities.tender.*;
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
                new EntityGWR94xx(null),
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
                new EntityDRGBR50(null),
                new EntityDRGBR50Kriegslok(null),
                new EntityDRBR50(null),
                new EntityDRBR50_35(null),
                new EntityDRBR50_40(null),
                new EntityDRBR50_50(null),
                new EntityDBBR50(null),
                new EntityDBBR50_40(null),
                new EntityDRBR01WitteChristmas(null),
                new EntitySentinel100HPChristmas(null),
                new EntityX10a(null),
                new EntityDSBFII(null),
                new EntityDSBFIII(null),
                new EntityDSBSII(null),
                new EntityGWR57(null),
                new EntityJ38(null),
                new EntityJ39(null),
                new EntityU1F(null),
                new EntityWWCPStandard_0_6_2T(null),
                new EntityRoyalScot(null)
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
                new EntityT38Oil(null),
                new EntityG4200Tender(null),
                new EntityVanderBuiltTender(null),
                new EntityFowlerTender(null)
        };
    }

    // Diesel List
    public static GenericRailTransport[] listDiesel() {
        return new GenericRailTransport[]{
                new EntityV36(null),
                new EntityV36Kanzel(null),
                new EntityClass37(null),
                //new EntityAC4400CW(null),
                new EntityMZClassOne(null),
                new EntityMZClassOne1967(null),
                new EntityMZClassTwo(null),
                new EntityMZClassTwo1970(null),
                new EntityMZClassThree(null),
                new EntityMZClassThree1972(null),
                new EntityMZClassFour(null),
                new EntityClassME(null),
                new EntityClassMH(null),
                new EntityClassMK(null),
                new EntityHLD55(null),
                new EntityKofIII(null),
                new EntityKofIII2(null),
                new EntityV200(null),
                new EntityV160(null),
                //American Diesels
                // new EntityAC4400CW(null),
                new EntityF7A(null),
                new EntityF7B(null),
                new EntityAlco_PA(null),
                new EntityAlco_PB(null),
                new EntityCFA164(null),
                new EntityCPA164(null),
                // new EntityFP7A(null),
                // new EntitySD70Mac(null),
                //  new EntityF40ph(null),
                // new EntityRS18(null),
                // new EntitySD60Mac(null),
                // new EntityGP50(null),
                // new EntityM640(null),
                new EntityBL2(null),
                new EntityGP7(null),
                new EntityGP7RRI(null),
                new EntityGP9R(null),
                new EntityGP402LW(null),
                new EntitySD7(null),
                new EntitySD382(null),
                new EntitySD402W(null),
                new EntitySD452(null),
                new EntitySD50(null),
                new EntitySD60(null),
                new EntitySD60M2(null),
                new EntitySD90MACH(null),
                new EntitySD70ACU(null),
                new EntityU33B(null),
                new EntityB307a(null),
                new EntityRS3(null),
                new EntityRS23(null),
                new EntityWWCPShopShunter(null),
                new EntityFrichsKoef(null),
                new EntityTraxxP160DE(null),
                new EntityTraxxP160DEME(null),
                new EntityTraxxF140DE(null)
        };
    }

    //Railbusses
    public static GenericRailTransport[] listRailbusses() {
        return new GenericRailTransport[]{
                new EntityNE81(null),
                new EntityVT98AD(null),
                new EntityVT98(null),
                new EntitySeries4000(null),
        };
    }

    //Temporary TC stock for testing purposes
    public static GenericRailTransport[] listTemperory() {
        return new GenericRailTransport[]{
        };
    }

    //Electric List
    public static GenericRailTransport[] listelectric() {
        return new GenericRailTransport[]{
                //European Stock
                new EntityTraxxF140MS2E(null),
                new EntityV36Electric(null),
                new EntityES64U2(null),
                new EntityES64U4(null),
                new EntityClass87(null),
                new EntityE44DB(null),
                new EntityE94(null),
                new EntityDSBClassEA(null),
                new EntityTEESteuerWagen(null),
                new EntityClass76(null),

                //American Stock
                new EntitySteepleCab(null),
                new EntityHighliner(null),
                new EntityAEM7(null),
                new EntityBO_LE1_FirstUnit(null),
                new EntityBO_LE1_SecondUnit(null),
                new EntityBR103(null),
                new EntityTraxxBR145(null),
                new EntityTraxxF140AC1(null),
                new EntityTraxxF140AC2(null),
                new EntityTraxxP140AC1(null),
                new EntityTraxxF140DC2(null),
                new EntityTraxxP160AC1(null),


        };
    }

    //Passenger car list
    public static GenericRailTransport[] listpassenger() {
        return new GenericRailTransport[]{
                new EntityEurofimaCompartment1(null),
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
                new EntityGWRThirdChristmas(null),
                new EntityEurofimaPresidentiale(null),
                new EntityTEESchweizzBar(null),
                new EntityEurofimaFlatConstruction(null),
                new EntityEurofimaAssembling(null),
                new EntityEurofimaGettingPaint(null),
                new EntityEurofimaInteriorFitting(null),
                new EntityEurofimaCompartment1_2(null),
                new EntityEurofimaCompartment2(null),
                new EntityDSB_BFS(null),
                new EntityDSB_BFM(null),
                new EntityDSB_AFM(null),
                new EntityDSB_CFM(null),

                //American Stock
                new EntityACF_60Seats(null),
                new EntityAmfleet1(null),
                new EntityBOCaboose(null),
                new EntityCPMetalVan(null),
                new EntityEurofimaOpen1(null),
                new EntityEurofimaPanorama(null)

        };
    }

    //Freight list
    public static GenericRailTransport[] listFreight() {
        return new GenericRailTransport[]{
                new EntityTEUSmall(null),
                new EntityUKopenWagon(null),
                new EntityUKopenWagon2(null),
                new EntityOFF52Beetle(null),
                new EntitySGNS801BT2TT(null),
                new EntitySGNS802BT(null),
                new EntitySGNS804TS(null),
                new EntitySGNS801BT2TS(null),
                new EntityZACNS95(null),
                new EntityEALOSX(null),
                new EntityHabbiins_14(null),
                new EntityHabbiins_17(null),
                new EntityHabiins_12(null),
                new EntitySGNSS603TATEU(null),
                new EntitySGNSS602TATEU(null),
                new EntityUKFlatbed(null),
                new EntityUKTanker(null),
                new EntityUKVan(null),
                new EntityHbbins(null),
                new EntityHbbillns(null),
                new EntityUKCattleWagen(null),
                new EntityUKGasWagen(null),
                new EntityDSBZETanker(null),
                new EntityDSB735Tanker(null),
                new EntityDSBCarE(null),
                new EntityLgns(null),
                new EntityGS(null),

               //American Stock
                new Entity40ftAAR_Boxcar(null),
                new EntityCP_Minibox(null),
                // new EntityCP_Plug_Slide(null),
                // new EntityCP_Plugdoor(null),
                new EntityCP40ftMechanicalReefer(null),
                new EntityHiCubePlateFBoxcar(null),
                //new EntityFortyFoot_Boxcar(null),
                //new Entity_89ft_Autorack_BiLevel(null),
               // new Entity_89ft_Flatcar(null),
                new Entity_GSC_60_Flatcar(null),
                new EntityACF_SingleDomeTankCar(null),
                new EntityPRR_Gla_Hopper(null)
        };
    }
}

