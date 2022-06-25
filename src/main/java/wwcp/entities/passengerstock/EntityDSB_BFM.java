package wwcp.entities.passengerstock;

    //This is a documentation class for copy pasting into a passenger entity file.

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
import wwcp.models.passengerStock.APO_BFM;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityDSB_BFM extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityDSB_BFM(null), worldwidecontentpack.MODID , worldwidecontentpack.Denmark);


    public EntityDSB_BFM(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityDSB_BFM(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return Transport.APO_BFM().reinforced;
    }

    @Override
    public String transportName() {
        return Transport.APO_BFM().name;
    }

    @Override
    public String transportcountry() {
        return Transport.APO_BFM().country;
    }

    @Override
    public String transportYear() {
        return Transport.APO_BFM().year;
    }

    @Override
    public float weightKg() {
        return Transport.APO_BFM().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return Transport.APO_BFM().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.APO_BFM().additionalTextTitle) + Transport.APO_BFM().additionalText,
                RailUtility.translate(Transport.APO_BFM().additionalTextTitle2) + Transport.APO_BFM().additionalText2};}
    }

    @Override
    public String transportFuelType() {return null;}

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
        public float[][] bogieModelOffsets() {
            return new float[][]{{4.65f,0.0f,0},{-4.65f,0.0f,0}};
        }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new EurofimaBogie()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter(){return new float[]{4.9f,-4.9f};}

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.0f,-0.0F,0.F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/DSB_APO/BFM.png", "textures/bogies/Eurofimabogie.png",
                "DSB Livery 1", "Standard DSB coach red");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/DSB_APO/BFM1.png", "textures/bogies/Eurofimabogie.png",
                "DSB Livery 2", "Standard DSB coach red, but now with a white line");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:DSB Livery 1";
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
    public float[][] getRiderOffsets(){return new float[][]{{-5.75f,1.2f, -0.25f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{12.8f,2f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new APO_BFM()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}

