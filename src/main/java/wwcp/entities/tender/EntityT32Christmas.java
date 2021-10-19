//This is a documentation file for copy pasting reussable details into a tender entity class.

//This is a documentation class for copy pasting into a freight tanker entity file.
package wwcp.entities.tender;

import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.TenderBogies.Tender32Bogie;
import wwcp.models.tenders.ChristmasTenderT32;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

public class EntityT32Christmas extends GenericRailTransport {


    public EntityT32Christmas(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityT32Christmas(null), worldwidecontentpack.MODID, worldwidecontentpack.FestivitiesTab);

    public EntityT32Christmas(World world) {
        super(world);
    }

    public String transportName() {
        return Transport.T32TenderChristmas().name;
    }

    public String transportcountry() {
        return Transport.T32TenderChristmas().country;
    }

    public String transportYear() {
        return Transport.T32TenderChristmas().year;
    }

    public boolean isFictional() {
        return Transport.T32TenderChristmas().fictional;
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.T32TenderChristmas().additionalTextTitle) + Transport.T32TenderChristmas().additionalText,
                RailUtility.translate(Transport.T32TenderChristmas().additionalTextTitle2) + Transport.T32TenderChristmas().additionalText2};}
    }
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.01f, 0.12F, 0.0F}, {-0.66F, 0.12F, 0.0F}};
    }

    public ModelBase[] bogieModels() {
        return new ModelBase[]{new Tender32Bogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{5.0F, -5.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    public float[][] modelOffsets() {
        return new float[][]{{-0.395f,-0.12F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/ChristmasStock/ChristmasT32.png", new String[]{"textures/bogies/germanTenderBogies/T32BogieBlack.png"},
                "Christmas Livery", "The standarized T32 tender paint while in use for the DB");
    }

    public boolean isReinforced() {
        return Transport.T32TenderChristmas().reinforced;
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
        return Transport.T32TenderChristmas().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Items.bed, 1), null, null, null, null, null, null, null, null};
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new ChristmasTenderT32()};
    }
}
