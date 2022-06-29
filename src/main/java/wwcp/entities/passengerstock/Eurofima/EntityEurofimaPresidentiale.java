package wwcp.entities.passengerstock.Eurofima;


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
import wwcp.models.passengerStock.Eurofima.EurofimaPresidentiale;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityEurofimaPresidentiale extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityEurofimaPresidentiale(null), worldwidecontentpack.MODID , worldwidecontentpack.European);


    public EntityEurofimaPresidentiale(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityEurofimaPresidentiale(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return Transport.EurofimaPresidentiale().reinforced;
    }

    @Override
    public String transportName() {
        return Transport.EurofimaPresidentiale().name;
    }

    @Override
    public String transportcountry() {
        return Transport.EurofimaPresidentiale().country;
    }

    @Override
    public String transportYear() {
        return Transport.EurofimaPresidentiale().year;
    }

    @Override
    public float weightKg() {
        return Transport.EurofimaPresidentiale().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return Transport.EurofimaPresidentiale().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.EurofimaPresidentiale().additionalTextTitle) + Transport.EurofimaPresidentiale().additionalText,
                RailUtility.translate(Transport.EurofimaPresidentiale().additionalTextTitle2) + Transport.EurofimaPresidentiale().additionalText2};}
    }

    @Override
    public String transportFuelType() {return null;}
    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{4.60f,0f,0},{-4.60f,0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new EurofimaBogie()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter(){return new float[]{4.60f,-4.60f};}

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
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/Eurofima/Presidentiale/el_presidentiale.png", "textures/bogies/Eurofimabogie.png",
                "2 Years WWCP", "Celebration livery for 2 years WWCP");
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
    public ModelBase[] getModel(){return new ModelBase[]{new EurofimaPresidentiale()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}

