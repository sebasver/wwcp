package wwcp;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.TiMTab;
import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import wwcp.blocks.BlockPlatform;
import wwcp.blocks.Display;
import wwcp.entities.TempTC.*;
import wwcp.entities.freight.*;
import wwcp.entities.locomotives.electrics.*;
import wwcp.entities.locomotives.steamers.*;
import wwcp.entities.locomotives.diesels.*;
import wwcp.entities.railbusses.*;
import wwcp.entities.rollingstock.*;
import wwcp.entities.tender.*;
import wwcp.proxy.ClientProxy;
import wwcp.proxy.CommonProxy;



import static cpw.mods.fml.common.registry.GameRegistry.addRecipe;
import static ebf.tim.registry.TiMGenericRegistry.registerTransports;
import static wwcp.WWCP_Blocks.blockList;

//Todo gradlew setupDecompWorkspace --refresh-dependencies idea
// X.Y.Z 
//X = major (game defining, large content publishments?), Y = minor(small content publishments?)  Z = patch (stat fixing).
//todo fix Copy pastable files with the new superstat method

@Mod(modid = worldwidecontentpack.MODID, version = worldwidecontentpack.MOD_VERSION)

public class worldwidecontentpack {
    public static final String MODID = "wwcp";
    public static final String MOD_VERSION = "TiM BugTesting Release";

    public Block DisplayTrainFourteen = new Display();


    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {

    }

    //Tab declerations
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        //For the custom armor
        proxy.registerRenderers();


        Belgium = new TiMTab(event.getSide().isClient(), "Belgian models", MODID, "myTab");
        Germany = new TiMTab(event.getSide().isClient(), "German models", MODID, "myTab2");
        United_Kingdom = new TiMTab(event.getSide().isClient(), "UK models", MODID, "myTab3");
        France = new TiMTab(event.getSide().isClient(), "French models", MODID, "myTab4");
        Netherlands = new TiMTab(event.getSide().isClient(), "Dutch models", MODID, "myTab5");
        America = new TiMTab(event.getSide().isClient(), "American models", MODID, "myTab6");
        Austria = new TiMTab(event.getSide().isClient(), "Austrian models", MODID, "myTab7");
        Switzerland = new TiMTab(event.getSide().isClient(), "Swiss models", MODID, "myTab8");
        European = new TiMTab(event.getSide().isClient(), "Inter European models", MODID, "myTab9");
        BlocksWWCP = new TiMTab(event.getSide().isClient(), "Blocks", MODID, "blockTab");

        //for the eventhandler
        MinecraftForge.EVENT_BUS.register(ClientProxy.eventManager);

        //CreativeTabs WWCeurope = new TiMTab(event.getSide().isClient(), "European Models", "wwcp", "eu");


        blockList.add(TiMGenericRegistry.registerBlock(TrainsInMotion.proxy.isClient(),new BlockPlatform().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/Platform.png"), null, "wwcp.platform", null, proxy.getRenderPlatform()));

        // Train type declartions

        registerTransports(event.getSide().isClient(), MODID, listSteamTrains(), null);
        registerTransports(event.getSide().isClient(), MODID, listTenders(), null);
        registerTransports(event.getSide().isClient(), MODID, listDiesel(), null);
        registerTransports(event.getSide().isClient(), MODID, listpassenger(), null);
        registerTransports(event.getSide().isClient(), MODID, listelectric(), null);
        registerTransports(event.getSide().isClient(), MODID, listFreight(), null);
        registerTransports(event.getSide().isClient(), MODID, listRailbusses(), null);
        registerTransports(event.getSide().isClient(), MODID, listTemperory(),null);


        addRecipe(new ItemStack(TiMGenericRegistry.registerBlock(event.getSide().isClient(), DisplayTrainFourteen, worldwidecontentpack.United_Kingdom, "blocks.14xxdisplay", null, proxy.getTESR()), 1), "WWW", "WIW", "WWW", 'W', Blocks.planks, 'I', Items.iron_ingot);
        //just copy this for a new type
    }


    /**
     * I hereby start declaring the individual trains itself. I will insert a // statement before each big group
     */

    // Steam trains
    public static GenericRailTransport[] listSteamTrains() {
        return new GenericRailTransport[]{
                new Entity94xx(null),
                new EntityClass812(null),
                new EntityDRBR01(null)
        };
    }

    // Tender list
    public static GenericRailTransport[] listTenders() {
        return new GenericRailTransport[]{
                new EntityClass812Tender(null),
                new EntityT32(null)
        };
    }

    // Diesel List
    public static GenericRailTransport[] listDiesel() {
        return new GenericRailTransport[]{
                new EntityV36(null),
                new EntityClass37(null),
                new EntityAC4400CW(null),
                new EntityMZClassOne(null)
        };
    }

    public static GenericRailTransport[] listRailbusses() {
        return new GenericRailTransport[]{
                new EntityBR626(null),
                new EntityVT98(null)
        };
    }

    public static GenericRailTransport[] listTemperory() {
        return new GenericRailTransport[]{
                new EntityE10(null),
                new EntityPropaganda(null)
        };
    }

    //Electric List
    public static GenericRailTransport[] listelectric() {
        return new GenericRailTransport[]{
                new EntityTRAXXF140MS2(null)
        };
    }

    // Passenger car list
    public static GenericRailTransport[] listpassenger() {
        return new GenericRailTransport[]{
                new EntityEurofimaCompartment(null),
                new EntityDBpza(null),
                new EntityDonder2(null),
                new EntityDonder3(null),
                new EntityDonder4(null),
                new EntityEurofimaRows(null),
                new EntityEurofimaSleeper(null),
                new EntityRheingoldSalonOne(null),
                new EntityRheingoldSalonTwo(null),
                new EntityRheingoldSpeiseOne(null),
                new EntityRheingoldSpeiseTwo(null),
                new EntityRheingoldBagage(null)


        };
    }

    public static GenericRailTransport[] listFreight() {
        return new GenericRailTransport[]{
                new EntityTEUSmall(null),
                new EntityUKopenWagon(null),
                new EntityOFF52Beetle(null),
                new EntitySGNS801BT2TT(null),
                new EntitySGNS802BT(null),
                new EntitySGNS804TS(null),
                new EntitySGNS801BT2TS(null)
        };
    }


    // declaring of the creative tabs I will be using
    public static CreativeTabs Belgium, Germany, United_Kingdom, France, Netherlands, America, Austria, Switzerland, European, BlocksWWCP;

    @SidedProxy(clientSide = "wwcp.proxy.ClientProxy", serverSide = "wwcp.proxy.CommonProxy")
    public static CommonProxy proxy;


}


































