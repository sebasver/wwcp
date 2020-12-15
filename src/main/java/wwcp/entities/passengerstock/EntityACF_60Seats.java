package wwcp.entities.passengerstock;


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
import wwcp.models.bogies.M500Truck;
import wwcp.models.passengerStock.ACF_60_Seat;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityACF_60Seats extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityACF_60Seats(null), worldwidecontentpack.MODID , worldwidecontentpack.America);


    public EntityACF_60Seats(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityACF_60Seats(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return Transport.ACF_60Seat().reinforced;
    }

    @Override
    public String transportName() {
        return Transport.ACF_60Seat().name;
    }

    @Override
    public String transportcountry() {
        return Transport.ACF_60Seat().country;
    }

    @Override
    public String transportYear() {
        return Transport.ACF_60Seat().year;
    }

    @Override
    public float weightKg() {
        return Transport.ACF_60Seat().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return Transport.ACF_60Seat().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.ACF_60Seat().additionalTextTitle) + Transport.ACF_60Seat().additionalText,
                RailUtility.translate(Transport.ACF_60Seat().additionalTextTitle2) + Transport.ACF_60Seat().additionalText2};}
    }

    @Override
    public String transportFuelType() {return null;}
    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{3.9f,0f,0},{-4f,0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new M500Truck()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter(){return new float[]{4f,-3.9f};}

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,0.05f,0.05F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/ACF_60Seat/ACF_60Seat.png",
                "textures/bogies/M500_Truck.png",
                "ACF", "Celebration livery for 2 years WWCP");
    }

    /*@Override
    public String getDefaultSkin() {
        return "";
    }*/
    
    @Override
    public ItemStack[] getRecipie() {
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
        return new float[]{9f,2.1f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ACF_60_Seat()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}

