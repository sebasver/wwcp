package wwcp.entities.Advent;


import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.EUBogies.EurofimaBogie;
import wwcp.models.bogies.EUBogies.TEEBogie;
import wwcp.models.passengerStock.EurofimaCompartment1;
import wwcp.models.railbusses.TEEBarWagon;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityTEESchweizzBar extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityTEESchweizzBar(null), worldwidecontentpack.MODID , worldwidecontentpack.European);


    public EntityTEESchweizzBar(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityTEESchweizzBar(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return Transport.TEESchweizzBarCar().reinforced;
    }

    @Override
    public String transportName() {
        return Transport.TEESchweizzBarCar().name;
    }

    @Override
    public String transportcountry() {
        return Transport.TEESchweizzBarCar().country;
    }

    @Override
    public String transportYear() {
        return Transport.TEESchweizzBarCar().year;
    }

    @Override
    public float weightKg() {
        return Transport.TEESchweizzBarCar().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return Transport.TEESchweizzBarCar().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.TEESchweizzBarCar().additionalTextTitle) + Transport.TEESchweizzBarCar().additionalText,
                RailUtility.translate(Transport.TEESchweizzBarCar().additionalTextTitle2) + Transport.TEESchweizzBarCar().additionalText2};}
    }

    @Override
    public String transportFuelType() {return null;}
    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{4.5f,0f,0},{-4.5f,0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new TEEBogie()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter(){return new float[]{3f,-3f};}

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.03f,-0F,0.F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/Railbusses/TEESchweizz/TEEBar.png",
                "textures/Railbusses/TEESchweizz/TeeBogie.png",
                "Belgian Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
    }

    /*@Override
    public String getDefaultSkin() {
        return "";
    }*/
    
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
    public float[][] getRiderOffsets(){return new float[][]{{2.2f,1.1f, 0.2f}};}


    @Override
    public float[] getHitboxSize() {
        return new float[]{12.9f,2.1f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new TEEBarWagon()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}

