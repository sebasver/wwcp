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
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.TenderBogies.BR01Line.*;
import wwcp.models.tenders.germanTenders.T26;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

public class EntityT26 extends GenericRailTransport {


    public EntityT26(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityT26(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityT26(World world) {
        super(world);
    }

    public String transportName() {
        return TransportDetails.T26().name;
    }

    public String transportcountry() {
        return TransportDetails.T26().country;
    }

    public String transportYear() {
        return TransportDetails.T26().year;
    }

    public boolean isFictional() {
        return TransportDetails.T26().fictional;
    }

    public float weightKg() {
        return TransportDetails.T26().weightinKGs;
    }

    @Override
    public String transportFuelType() {
        return null;
    }


    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(TransportDetails.T26().additionalTextTitle) + TransportDetails.T26().additionalText,
                RailUtility.translate(TransportDetails.T26().additionalTextTitle2) + TransportDetails.T26().additionalText2};}
    }
    public float[][] bogieModelOffsets() {
        return new float[][]{{0.55f, 0.12F, 0.0F}, {-.87F, 0.12F, 0.0F}};
    }

    public ModelBase[] bogieModels() {
        return new ModelBase[]{new T26BogieFront(), new T26BogieBack()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{0.87F, -0.55F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    public float[][] modelOffsets() {
        return new float[][]{{-0.11f,-0.1F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/germanTenders/T26Tender.png", new String[]{"textures/bogies/germanTenderBogies/T26BogieBlack.png"},
                "DB Livery", "The standarized T32 tender paint while in use for the DB");
    }

    public boolean isReinforced() {
        return TransportDetails.T26().reinforced;
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
        return new float[]{3.475F, 2F, 1.5F};
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
        return new ModelBase[]{new T26()};
    }
}
