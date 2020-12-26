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
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.TenderBogies.BR01Line.T26BogieBack;
import wwcp.models.bogies.TenderBogies.BR01Line.T26BogieFront;
import wwcp.models.tenders.germanTenders.KabintenderT26;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

public class EntityKabinTenderT26 extends GenericRailTransport {

    public EntityKabinTenderT26(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityKabinTenderT26(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityKabinTenderT26(World world) {
        super(world);
    }

    public String transportName() {
        return Transport.KabinTenderT26().name;
    }

    public String transportcountry() {
        return Transport.KabinTenderT26().country;
    }

    public String transportYear() {
        return Transport.KabinTenderT26().year;
    }

    public boolean isFictional() {
        return Transport.KabinTenderT26().fictional;
    }

    public float weightKg() {
        return Transport.KabinTenderT26().weightinKGs;
    }

    @Override
    public String transportFuelType() {
        return null;
    }


    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.KabinTenderT26().additionalTextTitle) + Transport.KabinTenderT26().additionalText,
                RailUtility.translate(Transport.KabinTenderT26().additionalTextTitle2) + Transport.KabinTenderT26().additionalText2};}
    }
    public float[][] bogieModelOffsets() {
        return new float[][]{{1f, 0F, 0.0F}, {-1F, 0F, 0.0F}};
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
        return new float[][]{{-0.11f,0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/germanTenders/KabinenTender_T26.png",
                "textures/bogies/germanTenderBogies/T26BogieBlack.png",
                "DB Livery", "The standarized T26 tender paint while in use for the DB");
    }

    public boolean isReinforced() {
        return Transport.KabinTenderT26().reinforced;
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
        return new ModelBase[]{new KabintenderT26()};
    }
}
