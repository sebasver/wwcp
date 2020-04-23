//This is a documentation file for copy pasting reussable details into a tender entity class.

//This is a documentation class for copy pasting into a freight tanker entity file.
package wwcp.entities.tender.germanTenders;

import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import java.util.List;
import java.util.UUID;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.Tender32Bogie;
import wwcp.models.tenders.germanTenders.T32;
import wwcp.worldwidecontentpack;

public class EntityT32 extends GenericRailTransport {


    public EntityT32(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityT32(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityT32(World world) {
        super(world);
    }

    public String transportName() {
        return Transport.T32().name;
    }

    public String transportcountry() {
        return Transport.T32().country;
    }

    public String transportYear() {
        return Transport.T32().year;
    }

    public boolean isFictional() {
        return Transport.T32().fictional;
    }

    @Override
    public String transportFuelType() {
        return null;
    }


    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.T32().additionalTextTitle) + Transport.T32().additionalText,
                RailUtility.translate(Transport.T32().additionalTextTitle2) + Transport.T32().additionalText2};}
    }
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.01f, 0.12F, 0.0F}, {-0.66F, 0.12F, 0.0F}};
    }

    public ModelBase[] bogieModels() {
        return new ModelBase[]{new Tender32Bogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{0.68F, -0.98F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    public float[][] modelOffsets() {
        return new float[][]{{-0.395f,-0.12F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/germanTenders/T32DB.png", new String[]{"textures/bogies/germanTenderBogies/T32BogieBlack.png"},
                "DB Livery", "The standarized T32 tender paint while in use for the DB");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/germanTenders/T32DR.png", new String[]{"textures/bogies/germanTenderBogies/T32BogieBlack.png"},
                "DRG Livery", "The standarized T32 tender paint while in use for the DRG");
    }

    public boolean isReinforced() {
        return Transport.T32().reinforced;
    }

    public int getInventoryRows() {
        return 1;
    }

    public List<transportTypes> getTypes() {
        return transportTypes.TENDER.singleton();
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{4.025F, 2F, 1.5F};
    }

    public Item getItem() {
        return thisItem;
    }

    public int[] getTankCapacity() {
        return new int[]{13400};
    }

    public void manageFuel() {
        FuelHandler.manageTanker(this);
    }

    public float weightKg() {
        return Transport.T32().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Items.bed, 1), null, null, null, null, null, null, null, null};
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new T32()};
    }
}
