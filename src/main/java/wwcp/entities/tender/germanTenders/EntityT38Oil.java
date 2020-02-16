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
import wwcp.entities.TransportDetails;
import wwcp.models.bogies.TenderBogies.BR01Line.*;
import wwcp.models.tenders.germanTenders.*;
import wwcp.entities.WWCPTransport;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

public class EntityT38Oil extends GenericRailTransport {


    public EntityT38Oil(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityT38Oil(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityT38Oil(World world) {
        super(world);
    }

    public String transportName() {
        return TransportDetails.T38Oil().name;
    }

    public String transportcountry() {
        return TransportDetails.T38Oil().country;
    }

    public String transportYear() {
        return TransportDetails.T38Oil().year;
    }

    public boolean isFictional() {
        return TransportDetails.T38Oil().fictional;
    }

    public float weightKg() {
        return TransportDetails.T38Oil().weightinKGs;
    }

    @Override
    public String transportFuelType() {
        return null;
    }


    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(TransportDetails.T38Oil().additionalTextTitle) + TransportDetails.T38Oil().additionalText,
                RailUtility.translate(TransportDetails.T38Oil().additionalTextTitle2) + TransportDetails.T38Oil().additionalText2};}
    }
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.2f, 0.12F, 0.0F}, {-0.73F, 0.12F, 0.0F}};
    }

    public ModelBase[] bogieModels() {
        return new ModelBase[]{new T38BogieFront(), new T38BogieBack()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{0.73F, -1.14F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    public float[][] modelOffsets() {
        return new float[][]{{-0.42f,-0.1F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/germanTenders/T38Oil.png", new String[]{"textures/bogies/germanTenderBogies/T37BogieBlack.png"},
                "DB", "The standarized T38 tender paint while in use for the DB");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/germanTenders/T38OilDRG.png", new String[]{"textures/bogies/germanTenderBogies/T37BogieBlack.png"},
                "DRG", "The standarized T38 tender paint while in use for the DRG");
    }

    public boolean isReinforced() {
        return TransportDetails.T38Oil().reinforced;
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
        return new float[]{4.35F, 2.15F, 1.5F};
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
        return new ModelBase[]{new T38Oil()};
    }
}
