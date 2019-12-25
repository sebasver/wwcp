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
import wwcp.TransportDetails;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.EurofimaBogie;
import wwcp.models.passengerStock.EurofimaSleeper;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityEurofimaSleeper extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityEurofimaSleeper(null), worldwidecontentpack.MODID , worldwidecontentpack.European);


    public EntityEurofimaSleeper(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityEurofimaSleeper(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return TransportDetails.EurofimaSleeper().reinforced;
    }

    @Override
    public String transportName() {
        return TransportDetails.EurofimaSleeper().name;
    }

    @Override
    public String transportcountry() {
        return TransportDetails.EurofimaSleeper().country;
    }

    @Override
    public String transportYear() {
        return TransportDetails.EurofimaSleeper().year;
    }

    @Override
    public float weightKg() {
        return TransportDetails.EurofimaSleeper().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return TransportDetails.EurofimaSleeper().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(TransportDetails.EurofimaSleeper().additionalTextTitle) + TransportDetails.EurofimaSleeper().additionalText,
                RailUtility.translate(TransportDetails.EurofimaSleeper().additionalTextTitle2) + TransportDetails.EurofimaSleeper().additionalText2};}
    }

    @Override
    public String transportFuelType() {return null;}

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{4.55f,0.15f,0},{-5.4f,0.12f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new EurofimaBogie()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter(){return new float[]{5.4f,-5.4f};}

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.25f,-0.15F,0.F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaSleeper/SE1.png", "textures/bogies/Eurofimabogie.png",
                "ÖBB Sleeper", "Livery used by an OBB sleeper train");
    }
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
    public float[][] getRiderOffsets(){return new float[][]{{2.7f,1.1f, 0.2f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{13.75f,2,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new EurofimaSleeper()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}


