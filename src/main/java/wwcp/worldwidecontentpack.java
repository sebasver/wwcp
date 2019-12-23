package wwcp;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.TiMTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import wwcp.entities.TempTC.*;
import wwcp.entities.freight.*;
import wwcp.entities.locomotives.electrics.*;
import wwcp.entities.locomotives.steamers.*;
import wwcp.entities.locomotives.diesels.*;
import wwcp.entities.railbusses.*;
import wwcp.entities.passengerstock.*;
import wwcp.entities.tender.*;
import wwcp.proxy.ClientProxy;
import wwcp.proxy.CommonProxy;


import static cpw.mods.fml.common.registry.GameRegistry.addRecipe;
import static ebf.tim.registry.TiMGenericRegistry.registerTransports;


//gradlew setupDecompWorkspace --refresh-dependencies idea
//X.Y.Z
//X = major (game defining, large content publishments?), Y = minor(small content publishments?)  Z = patch (stat fixing).
//todo fix Copy pastable files with the new superstat method
//todo port over old rollingstock to the superstats, make version ready for launch

@Mod(modid = worldwidecontentpack.MODID, version = worldwidecontentpack.MOD_VERSION)

public class worldwidecontentpack {
    public static final String MODID = "wwcp";
    public static final String MOD_VERSION = "0.5.17 Alpha";


    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {

    }

    //Tab declerations
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        //For the custom armor
        proxy.registerRenderers();

//        Belgium = new TiMTab("Belgian models", MODID, "myTab");
        Germany = new TiMTab("German models", MODID, "myTab2");
//        United_Kingdom = new TiMTab("UK models", MODID, "myTab3");
//        France = new TiMTab("French models", MODID, "myTab4");
//        Netherlands = new TiMTab("Dutch models", MODID, "myTab5");
//        America = new TiMTab("American models", MODID, "myTab6");
//        Austria = new TiMTab( "Austrian models", MODID, "myTab7");
//        Switzerland = new TiMTab("Swiss models", MODID, "myTab8");
        European = new TiMTab("Inter European models", MODID, "myTab9");
        BlocksWWCP = new TiMTab("Blocks", MODID, "blockTab");
        FestivitiesTab = new TiMTab("Festive Models", MODID, "festivetab");

        //for the eventhandler
        MinecraftForge.EVENT_BUS.register(ClientProxy.eventManager);

        wwcp_registrations.registerItems();
        wwcp_registrations.registerBlocks();
        wwcp_registrations.registerTrains();

    }
        //todo Block platform 5(Full block),7(half slope),9(station lamp) still erroring

    /**
     * I hereby start declaring the individual trains itself. I will insert a // statement before each big group
     */

    // declaring of the creative tabs I will be using
    public static CreativeTabs Belgium, Germany, United_Kingdom, France, Netherlands, America, Austria, Switzerland, European, BlocksWWCP, FestivitiesTab;

    @SidedProxy(clientSide = "wwcp.proxy.ClientProxy", serverSide = "wwcp.proxy.CommonProxy")
    public static CommonProxy proxy;


}


































