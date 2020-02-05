//This is a documentation file for copy pasting reussable details into a tender entity class.

//This is a documentation class for copy pasting into a freight tanker entity file.
package wwcp.entities.tender.germanTenders;

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
import wwcp.TransportDetails;
import wwcp.entities.WWCPTransport;
import wwcp.worldwidecontentpack;
import wwcp.models.bogies.TenderBogies.BR01Line.*;
import wwcp.models.tenders.germanTenders.*;

import java.util.List;
import java.util.UUID;

public class EntityT34StreamlinedDRG extends GenericRailTransport {


    public EntityT34StreamlinedDRG(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityT34StreamlinedDRG(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityT34StreamlinedDRG(World world) {
        super(world);
    }

    public String transportName() {
        return TransportDetails.T34StreamlinedDRG().name;
    }

    public String transportcountry() {
        return TransportDetails.T34StreamlinedDRG().country;
    }

    public String transportYear() {
        return TransportDetails.T34StreamlinedDRG().year;
    }

    public boolean isFictional() {
        return TransportDetails.T34StreamlinedDRG().fictional;
    }

    public float weightKg() {
        return TransportDetails.T34().weightinKGs;
    }

    @Override
    public String transportFuelType() {
        return null;
    }


    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(TransportDetails.T34StreamlinedDRG().additionalTextTitle) + TransportDetails.T34StreamlinedDRG().additionalText,
                RailUtility.translate(TransportDetails.T34StreamlinedDRG().additionalTextTitle2) + TransportDetails.T34StreamlinedDRG().additionalText2};}
    }
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.01f, 0.12F, 0.0F}, {-0.67F, 0.12F, 0.0F}};
    }

    public ModelBase[] bogieModels() {
        return new ModelBase[]{new T34Bogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{0.67F, -1F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    public float[][] modelOffsets() {
        return new float[][]{{-0.485f,-0.10F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/germanTenders/T34StreamlinedDRG.png", new String[]{"textures/bogies/germanTenderBogies/T34BogieBlack.png"},
                "DB Livery", "The standarized T32 tender paint while in use for the DB");
    }

    public boolean isReinforced() {
        return TransportDetails.T34StreamlinedDRG().reinforced;
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
        return new float[]{3.6F, 2.13F, 1.5F};
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

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Items.bed, 1), null, null, null, null, null, null, null, null};
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new T34StreamlinedDRG()};
    }
}
