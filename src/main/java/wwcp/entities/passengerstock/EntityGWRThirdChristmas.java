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
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.passengerStock.GWROpenXmas;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;

// XXXX
// YYYY
// ZZZZ
// QQQQ

public class EntityGWRThirdChristmas extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityGWRThirdChristmas(null), worldwidecontentpack.MODID , worldwidecontentpack.FestivitiesTab);


    public EntityGWRThirdChristmas(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityGWRThirdChristmas(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return Transport.GWRThirdOpenChristmas().reinforced;
    }

    @Override
    public String transportName() {
        return Transport.GWRThirdOpenChristmas().name;
    }

    @Override
    public String transportcountry() {
        return Transport.GWRThirdOpenChristmas().country;
    }

    @Override
    public String transportYear() {
        return Transport.GWRThirdOpenChristmas().year;
    }

    @Override
    public float weightKg() {
        return Transport.GWRThirdOpenChristmas().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return Transport.GWRThirdOpenChristmas().fictional;
    }

    @Override
    public String transportFuelType() {return null;}

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.GWRThirdOpenChristmas().additionalTextTitle) + Transport.GWRThirdOpenChristmas().additionalText,
                RailUtility.translate(Transport.GWRThirdOpenChristmas().additionalTextTitle2) + Transport.GWRThirdOpenChristmas().additionalText2};}
    }


    @Override
    public float[][] bogieModelOffsets() {
        return null;
    }

    @Override
    public ModelBase[] bogieModels() {
        return null;
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter(){return new float[]{1f,-1f};}

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }


    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/ChristmasStock/GWROpenPassengerXmas.png",
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
    public float[][] getRiderOffsets(){return new float[][]{{0.85f,1.4f, -0.15f}};}

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{2.25f,-0.07F,-0.69F}};
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{3.06f,1.8f,1.5f};
    }

    public boolean shouldRiderSit() {
        return false;
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new GWROpenXmas()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}