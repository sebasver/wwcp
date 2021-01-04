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

import java.util.UUID;
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
import wwcp.models.locomotives.steamers.Class812;
import wwcp.worldwidecontentpack;

public class EntityClass812 extends EntityTrainCore {

    public EntityClass812(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityClass812(null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityClass812(World world) {
        super(world);
    }

    @Override
    public String transportName() { return Transport.CR812().name; }

    @Override
    public String transportcountry() { return Transport.CR812().country; }

    @Override
    public String transportYear() { return Transport.CR812().year; }

    @Override
    public String transportFuelType() {
        return Transport.CR812().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.CR812().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.CR812().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.CR812().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.CR812().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.CR812().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.CR812().additionalTextTitle) + Transport.CR812().additionalText,
                RailUtility.translate(Transport.CR812().additionalTextTitle2) + Transport.CR812().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.CR812().backTopSpeed: Transport.CR812().topSpeed;}

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/C812/C1.png", "default",
                "The Class 812 was build by John F. McIntosh for the Caledonean Railway in Scotland.");

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
        return new float[]{4.45F, 2.1F, 1.3F};
    }

    public ItemStack[] getRecipie() {
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
        return new float[]{1.0F, 0.1F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.15f,-0.12F,0.F}};}

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
        return new ModelBase[]{new Class812()};
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