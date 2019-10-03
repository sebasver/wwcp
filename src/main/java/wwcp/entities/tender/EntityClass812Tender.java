//This is a documentation file for copy pasting reussable details into a tender entity class.

//This is a documentation class for copy pasting into a freight tanker entity file.
package wwcp.entities.tender;

import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.RailUtility;
import ebf.timsquared.TiMSquared;
import ebf.timsquared.models.bogies.CMDBogie;
import ebf.timsquared.models.rollingstock.ModelGATX1300GallonTanker;
import fexcraft.tmt.slim.ModelBase;
import java.util.List;
import java.util.UUID;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import wwcp.models.tenders.Class812Tender;
import wwcp.worldwidecontentpack;

public class EntityClass812Tender extends GenericRailTransport {


    public EntityClass812Tender(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new ItemTransport(new EntityClass812Tender(null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityClass812Tender(World world) {
        super(world);
    }

    public String transportName() {
        return "Class 812 Tender";
    }

    public String transportcountry() {
        return "US";
    }

    public String transportYear() {
        return "2000";
    }

    public float transportTopSpeed() {
        return 0.0F;
    }

    public boolean isFictional() {
        return false;
    }

    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate("wwcp.era") + " II"};
        }
    }

    public float getMaxFuel() {
        return 0.0F;
    }

    public float[][] bogieModelOffsets() {
        return null;
    }

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{5.0F, -5.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }
//todo change bogie length from center
    public float[][] modelOffsets() {
        return new float[][]{{0.06f,-0.12F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/C1Tender.png",
                "GATX 13000 Gallon Tanker", "One of their smaller tanker cars, usually used for commodities such as molten sulfur, clay slurry, caustic soda and corn syrup.");
    }

    public boolean isReinforced() {
        return false;
    }

    public int getInventoryRows() {
        return 0;
    }

    public List<transportTypes> getTypes() {
        return transportTypes.TANKER.singleton();
    }

    public float[][] getRiderOffsets() {
        return (float[][]) null;
    }

    public float[] getHitboxSize() {
        return new float[]{4.325F, 1.6F, 1.2F};
    }

    public Item getItem() {
        return thisItem;
    }

    public int[] getTankCapacity() {
        return new int[]{13400};
    }

    public String[] getTankFilters(int tank) {

        switch (tank) {
            case 0: {
                return new String[]{FluidRegistry.WATER.getName()};
            }
            default:{
                return new String[]{FluidRegistry.LAVA.getName()};
            }
        }
    }

    public int getRFCapacity() {
        return 0;
    }

    public void manageFuel() {
        FuelHandler.manageTanker(this);
    }

    public float weightKg() {
        return 29900.0F;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Items.bed, 1), null, null, null, null, null, null, null, null};
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new Class812Tender()};
    }
}

