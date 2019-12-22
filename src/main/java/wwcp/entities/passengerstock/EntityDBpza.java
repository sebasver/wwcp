package wwcp.entities.passengerstock;


import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.entities.WWCPTransport;
import wwcp.worldwidecontentpack;

import wwcp.models.bogies.FlexxLoad;
import wwcp.models.passengerStock.DBpza;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityDBpza extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") + ": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") + ": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityDBpza(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);


    public EntityDBpza(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityDBpza(World world) {
        super(world);
    }


    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{5f, 0.12f, 0}, {-5.5f, 0.12f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new FlexxLoad()};
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{5f, -5f};
    }

    @Override
    public float getRenderScale() {
        return 0.065f;
    }

    @Override
    public float getPlayerScale() {
        return 0.50f;
    }

    /**defines the scale to render the model at. Default is 0.075*/




    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.025f, -0.17F, 0.F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/DBpza/D2.png", "textures/bogies/Flexxload.png",
                "DB Regio", "DB Regio livery");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/DBpza/D1.png", "textures/bogies/Flexxload.png",
                "WWCP Transportation", "WWCP Transportation livery");
    }
    @Override
    public String getDefaultSkin() {
        return "wwcp:DB Regio";
    }

    @Override
    public boolean isReinforced() {
        return true;
    }

    @Override
    public float weightKg() {
        return 1814.3f;
    }

    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                DefineStack(Items.bed, 1), null, null,
                null, null, null,
                null, null, null
        };
    }

    @Override
    public String transportName() {
        return "Dobbelstock 4th generation";
    }

    @Override
    public String transportcountry() {
        return "Germany";
    }

    @Override
    public String transportYear() {
        return "1997-now";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    @Override
    public boolean isFictional() {
        return false;
    }


    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate("wwcp.era") + "II"};
        }
    }

    /**
     * <h2>Inventory Size</h2>
     */
    @Override
    public int getInventoryRows() {
        return 0;
    }

    /**
     * <h2>Type</h2>
     */

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.PASSENGER;
    }

    /**
     * <h2>Rider offsets</h2>
     */
    @Override
    public float[][] getRiderOffsets() {
        return new float[][]{{1.5f, 1.8f, -0.15f},{0.5f,0.8f, 0.30f}};
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{13.68f, 2.5f, 1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel() {
        return new ModelBase[]{new DBpza()};
    }

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem() {
        return thisItem;
    }
}


