package wwcp.entities.passengerstock;


import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.models.Bogie;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.AmericanTrucks.SLRV_Bogey;
import wwcp.models.bogies.AmericanTrucks.SLRV_Bogey2;
import wwcp.models.passengerStock.SLRVC;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntitySLRVC extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntitySLRVC(null), worldwidecontentpack.MODID , worldwidecontentpack.America);


    public EntitySLRVC(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntitySLRVC(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return Transport.SLRVC().reinforced;
    }

    @Override
    public String transportName() {
        return Transport.SLRVC().name;
    }

    @Override
    public String transportcountry() {
        return Transport.SLRVC().country;
    }

    @Override
    public String transportYear() {
        return Transport.SLRVC().year;
    }

    @Override
    public float weightKg() {
        return Transport.SLRVC().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return Transport.SLRVC().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.SLRVC().additionalTextTitle) + Transport.SLRVC().additionalText,
                RailUtility.translate(Transport.SLRVC().additionalTextTitle2) + Transport.SLRVC().additionalText2};}
    }

    @Override
    public String transportFuelType() {return null;}
    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{3.9f,0f,0},{-3.9f,0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new SLRVC()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter(){return new float[]{3.9f,-3.9f};}

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.17f,0.0f,0.0F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRVC_Blue.png",
                "SLRV C Blue", "Blue rollsign C car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey2.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRVC_Green.png",
                "SLRV C Green", "Green rollsign C car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey2.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRVC_Orange.png",
                "SLRV C Orange", "Orange rollsign C car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey2.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRVC_Red.png",
                "SLRV C Red", "Red rollsign C car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey2.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRVC_White.png",
                "SLRV C White", "White rollsign C car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey2.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_CP.png",
                "SLRV C Prototype", "SLRV C Prototype 170").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey2.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));



    }

    @Override
    public Bogie[] bogies() {

            return new Bogie[]{
                    new Bogie(new SLRV_Bogey2(), -1.0f, 0f, 0),
                    new Bogie(new SLRV_Bogey(), 2.25f, 0f, 0)
            };
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:SLRV C Blue";
    }
    
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                DefineStack(Items.bed, 1), null, null,
                null, null, null,
                null, null, null
        };
    }
    
    /**
     * <h2>Inventory Size</h2>
     */
    @Override
    public int getInventoryRows(){return 0;}
    /**
     * <h2>Type</h2>
     */

    public TrainsInMotion.transportTypes getType(){return TrainsInMotion.transportTypes.PASSENGER;}
    /**
     * <h2>Rider offsets</h2>
     */
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.5f,0.75f, -0.33f}};}


    @Override
    public float[] getHitboxSize() {
        return new float[]{4.35f,1.75f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new SLRVC()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}

