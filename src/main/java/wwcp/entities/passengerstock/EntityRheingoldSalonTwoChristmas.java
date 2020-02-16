//This is a documentation class for copy pasting into a passenger entity file.
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
import wwcp.entities.TransportDetails;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.GorlitzBack;
import wwcp.models.bogies.GorlitzFront;
import wwcp.models.passengerStock.ChristmasSalon2;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityRheingoldSalonTwoChristmas extends GenericRailTransport {

    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityRheingoldSalonTwoChristmas(null), worldwidecontentpack.MODID , worldwidecontentpack.FestivitiesTab);


    public EntityRheingoldSalonTwoChristmas(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityRheingoldSalonTwoChristmas(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return TransportDetails.RheingoldSalon2Christmas().reinforced;
    }

    @Override
    public String transportName() {
        return TransportDetails.RheingoldSalon2Christmas().name;
    }

    @Override
    public String transportcountry() {
        return TransportDetails.RheingoldSalon2Christmas().country;
    }

    @Override
    public String transportYear() {
        return TransportDetails.RheingoldSalon2Christmas().year;
    }

    @Override
    public float weightKg() {
        return TransportDetails.RheingoldSalon2Christmas().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return TransportDetails.RheingoldSalon2Christmas().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(TransportDetails.RheingoldSalon2Christmas().additionalTextTitle) + TransportDetails.RheingoldSalon2Christmas().additionalText,
                RailUtility.translate(TransportDetails.RheingoldSalon2Christmas().additionalTextTitle2) + TransportDetails.RheingoldSalon2Christmas().additionalText2};}
    }

    @Override
    public String transportFuelType() {return null;}

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{3.70f,0.12f,0},{-3.70f,0.12f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new GorlitzFront(), new GorlitzBack()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter(){return new float[]{2f,-2f};}

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.225f,-0.125F,0.F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/RheingoldChristmas/ChristmasSalon2.png", "textures/bogies/RheingoldBogie.png",
                "NAME", "Description");
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
    public float[][] getRiderOffsets(){return new float[][]{{1.6f,1.1f,0.4f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{11.525f,2,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ChristmasSalon2()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}

