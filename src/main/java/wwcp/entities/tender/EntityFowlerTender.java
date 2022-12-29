//This is a documentation file for copy pasting reussable details into a tender entity class.

//This is a documentation class for copy pasting into a freight tanker entity file.
package wwcp.entities.tender;

import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.tenders.Class812Tender;
import wwcp.models.tenders.FowlerTender;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

public class EntityFowlerTender extends GenericRailTransport {


    public EntityFowlerTender(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityFowlerTender(null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityFowlerTender(World world) {
        super(world);
    }
    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.FowlerTender().reinforced;
    }

    public int[] getTankCapacity() {
        return new int[] {Transport.FowlerTender().tankcapacity, Transport.FowlerTender().tankcapacity};
    }

    public String[] getTankFilters(int tankID) {
        switch (tankID) {
            case 0: {
                return new String[]{FluidRegistry.WATER.getName()};
            }
            default:{
                return new String[]{FluidRegistry.LAVA.getName()};
            }
        }
    }

    public float weightKg() {
        return Transport.FowlerTender().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.FowlerTender().name;
    }

    public String transportcountry() { return Transport.FowlerTender().country; }

    public String transportYear() { return Transport.FowlerTender().year; }

    public float transportTopSpeed() {
        return Transport.FowlerTender().topSpeed;
    }

    public boolean isFictional() {
        return Transport.FowlerTender().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.FowlerTender().additionalTextTitle) + Transport.FowlerTender().additionalText,
                RailUtility.translate(Transport.FowlerTender().additionalTextTitle2) + Transport.FowlerTender().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.FowlerTender().rows;
    }

    public transportTypes getType() {
        return transportTypes.FREIGHT;
    }
    public float[][] bogieModelOffsets() {
        return null;
    }

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.0F, -1.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }
//todo change bogie length from center
    public float[][] modelOffsets() {
        return new float[][]{{0f,0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/FowlerTender/tenderLmsBlack.png",
                "LMS Black", "One of their smaller tanker cars, usually used for " +
                        "commodities such as molten sulfur, clay slurry, caustic soda and corn syrup.");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/FowlerTender/tenderLmsCrimson.png",
                "Early Crimson", "One of their smaller tanker cars, usually used for " +
                        "commodities such as molten sulfur, clay slurry, caustic soda and corn syrup.");
    }

    public List<transportTypes> getTypes() {
        return transportTypes.TANKER.singleton();
    }

    public float[][] getRiderOffsets() {
        return (float[][]) null;
    }

    public float[] getHitboxSize() {
        return new float[]{3.4F, 1.6F, 1.2F};
    }

    public Item getItem() {
        return thisItem;
    }

    public void manageFuel() {
        FuelHandler.manageTanker(this);
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new FowlerTender()};
    }
}

