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
import wwcp.models.passengerStock.Eurofima.EurofimaCompartment1;
import wwcp.models.passengerStock.Eurofima.EurofimaCompartment1_2;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityEurofimaCompartment1_2 extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityEurofimaCompartment1_2(null), worldwidecontentpack.MODID , worldwidecontentpack.European);


    public EntityEurofimaCompartment1_2(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityEurofimaCompartment1_2(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return Transport.EurofimaCompartment1_2().reinforced;
    }

    @Override
    public String transportName() {
        return Transport.EurofimaCompartment1_2().name;
    }

    @Override
    public String transportcountry() {
        return Transport.EurofimaCompartment1_2().country;
    }

    @Override
    public String transportYear() {
        return Transport.EurofimaCompartment1_2().year;
    }

    @Override
    public float weightKg() {
        return Transport.EurofimaCompartment1_2().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return Transport.EurofimaCompartment1_2().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.EurofimaCompartment1_2().additionalTextTitle) + Transport.EurofimaCompartment1_2().additionalText,
                RailUtility.translate(Transport.EurofimaCompartment1_2().additionalTextTitle2) + Transport.EurofimaCompartment1_2().additionalText2};}
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
        return new float[][]{{0.025f,0F,0.F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/Eurofima/EurofimaCompartment/Class1_2/C1_2_BaseLivery.png",
                "textures/bogies/Eurofimabogie.png",
                "Factory Livery", "Factory livery of a Eurofima car");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:Factory Livery";
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
    public float[][] getRiderOffsets(){return new float[][]{{2.0f,1.0f, 0.2f}};}


    @Override
    public float[] getHitboxSize() {
        return new float[]{12.9f,2.1f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new EurofimaCompartment1_2()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}

