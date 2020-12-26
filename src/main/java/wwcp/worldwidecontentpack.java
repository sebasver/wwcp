package wwcp;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import ebf.tim.items.TiMTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import wwcp.proxy.ClientProxy;
import wwcp.proxy.CommonProxy;


//gradlew setupDecompWorkspace --refresh-dependencies idea
//X.Y.Z
//X = major (game defining, large content publishments?), Y = minor(small content publishments?)  Z = patch (stat fixing).
//todo fix Copy pastable files with the new superstat method
//todo fix texture names/descriptions all stock

@Mod(modid = worldwidecontentpack.MODID, version = worldwidecontentpack.MOD_VERSION)

public class worldwidecontentpack {
    public static final String MODID = "wwcp";
    public static final String MOD_VERSION = "0.12.08 Alpha";


    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {
    }

    //Tab declerations
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //For the custom armor
        proxy.registerRenderers();
        Belgium = new TiMTab("Belgian models", MODID, "myTab");
        Germany = new TiMTab("German models", MODID, "myTab2");
        United_Kingdom = new TiMTab("UK models", MODID, "myTab3");
        France = new TiMTab("French models", MODID, "myTab4");
        Netherlands = new TiMTab("Dutch models", MODID, "myTab5");
        America = new TiMTab("American models", MODID, "myTab6");
        Austria = new TiMTab("Austrian models", MODID, "myTab7");
        Switzerland = new TiMTab("Swiss models", MODID, "myTab8");
        Denmark = new TiMTab("Danish models", MODID, "myTab10");
        European = new TiMTab("Inter European models", MODID, "myTab9");
        BlocksWWCP = new TiMTab("Blocks", MODID, "blockTab");
        FestivitiesTab = new TiMTab("Festive Models", MODID, "festivetab");
        //for the eventhandler
        MinecraftForge.EVENT_BUS.register(eventManager);
        wwcp_registrations.registerItems();
        wwcp_registrations.registerBlocks();
        wwcp_registrations.registerTrains();
    }

    // declaring of the creative tabs I will be using
    public static CreativeTabs Belgium, Germany, United_Kingdom, France, Netherlands, America, Austria, Switzerland, Denmark, European, BlocksWWCP, FestivitiesTab;

    @SidedProxy(clientSide = "wwcp.proxy.ClientProxy", serverSide = "wwcp.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    //Register EventManager outside of proxy to avoid siding issues.
    public static EventManager eventManager = new EventManager();


}


































