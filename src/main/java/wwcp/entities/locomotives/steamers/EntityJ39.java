//This is a documentation file for copy pasting into a steam locomotive.
package wwcp.entities.locomotives.steamers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.locomotives.steamers.GWR57;
import wwcp.models.locomotives.steamers.LNERJ38_39;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityJ39 extends EntityTrainCore {

    public EntityJ39(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityJ39(null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityJ39(World world) {
        super(world);
    }

    @Override
    public String transportName() { return Transport.J39().name; }

    @Override
    public String transportcountry() { return Transport.J39().country; }

    @Override
    public String transportYear() { return Transport.J39().year; }

    @Override
    public String transportFuelType() {
        return Transport.J39().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.J39().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.J39().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.J39().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.J39().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.J39().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.J39().additionalTextTitle) + Transport.J39().additionalText,
                RailUtility.translate(Transport.J39().additionalTextTitle2) + Transport.J39().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.J39().backTopSpeed: Transport.J39().topSpeed;}

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/J39/LNER_J39_Texture_1.png",
                "LNER Black", "There are two ways of doing things, the Great Western way, or the wrong way.");
    }

    public int getInventoryRows() {
        return 1;
    }

    public transportTypes getType() {
        return transportTypes.STEAM;
    }

    public float getMaxFuel() {
        return 1.0F;
    }

    public float[][] getRiderOffsets() {
        return new float[][]{{1.3F, 1.2F, 0.0F}};
    }

    public float[] getHitboxSize() {
        return new float[]{4.8F, 2.1F, 1.3F};
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{null, null, null, null, null, null, null, null, null};
    }

    public float getPistonOffset() {
        return 0.5F;
    }

    public float[][] getSmokeOffset() {
        return new float[][]{{-1.0F, 0.0F, 0.5F, 1.1711154E7F, 30.0F}, {-1.0F, 0.0F, -0.5F, 1.1711154E7F, 30.0F}, {-1.4F, 2.0F, 0.0F, 3947580.0F, 500.0F}};
    }

    public float[][] bogieModelOffsets() {
        return null;

    }

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.4F, -1.1F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.05f,-0F,0F}};}

    public boolean shouldRiderSit() {
        return false;
    }
    
    public int[] getTankCapacity() {
        return new int[]{9161, 800};
    }

    public int getRFCapacity() {
        return 0;
    }

    public String[] getTankFilters(int tank) {
        switch (tank) {
            case 0:
                return new String[]{FluidRegistry.WATER.getName()};
            default:
                return new String[]{FluidRegistry.LAVA.getName()};
        }
    }

    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        switch (slot) {
            case 400:
                return TileEntityFurnace.getItemBurnTime(stack) > 0;
            case 401:
                return FluidContainerRegistry.getFluidForFilledItem(stack) != null && this.canFill((ForgeDirection) null, FluidContainerRegistry.getFluidForFilledItem(stack).getFluid());
            default:
                return true;
        }
    }

    public void manageFuel() {
        this.fuelHandler.manageSteam(this);
    }

    public Item getItem() {
        return thisItem;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new LNERJ38_39()};
    }

    @SideOnly(Side.CLIENT)
    public ResourceLocation getHorn() {
        return URIRegistry.SOUND_HORN.getResource("XXXXXXXXXX.ogg");
    }

    @SideOnly(Side.CLIENT)
    public ResourceLocation getRunningSound() {
        return URIRegistry.SOUND_RUNNING.getResource("XXXXXXX.ogg");
    }
}
