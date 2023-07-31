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
import wwcp.models.bogies.AmericanTrucks.BuddBilevelTruck;
import wwcp.models.passengerStock.BuddBilevel;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityBuddBilevel extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityBuddBilevel(null), worldwidecontentpack.MODID , worldwidecontentpack.America);


    public EntityBuddBilevel(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityBuddBilevel(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return Transport.BuddBilevel().reinforced;
    }

    @Override
    public String transportName() {
        return Transport.BuddBilevel().name;
    }

    @Override
    public String transportcountry() {
        return Transport.BuddBilevel().country;
    }

    @Override
    public String transportYear() {
        return Transport.BuddBilevel().year;
    }

    @Override
    public float weightKg() {
        return Transport.BuddBilevel().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return Transport.BuddBilevel().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.BuddBilevel().additionalTextTitle) + Transport.BuddBilevel().additionalText,
                RailUtility.translate(Transport.BuddBilevel().additionalTextTitle2) + Transport.BuddBilevel().additionalText2};}
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
        return new ModelBase[]{new BuddBilevelTruck()};
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
        return new float[][]{{0f,0.0f,0.0F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/BuddBilevel/Budd_Bilevel_MILW.png",
                "textures/bogies/AmericanTrucks/Budd_Bilevel_Truck_Silver.png",
                "MILW", "Milwaukee Road scheme w/ red lettering");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:MILW";
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
    public float[][] getRiderOffsets(){return new float[][]{{-2.5f,1.5f, -0.33f}};}


    @Override
    public float[] getHitboxSize() {
        return new float[]{11f,1.9f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new BuddBilevel()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}

