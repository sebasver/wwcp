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
import wwcp.models.locomotives.steamers.Modular_0_4_0;
import wwcp.worldwidecontentpack;

import java.util.UUID;

// XXXX -> Entity Name
// YYYY -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityModular_0_4_0 extends EntityTrainCore {

    public EntityModular_0_4_0(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityModular_0_4_0(null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityModular_0_4_0(World world) {
        super(world);
    }

    @Override
    public String transportName() { return Transport.Modular_0_4_0().name; }

    @Override
    public String transportcountry() { return Transport.Modular_0_4_0().country; }

    @Override
    public String transportYear() { return Transport.Modular_0_4_0().year; }

    @Override
    public String transportFuelType() {
        return Transport.Modular_0_4_0().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.Modular_0_4_0().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.Modular_0_4_0().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.Modular_0_4_0().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.Modular_0_4_0().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.Modular_0_4_0().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Modular_0_4_0().additionalTextTitle) + Transport.Modular_0_4_0().additionalText,
                RailUtility.translate(Transport.Modular_0_4_0().additionalTextTitle2) + Transport.Modular_0_4_0().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.Modular_0_4_0().backTopSpeed: Transport.Modular_0_4_0().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Steam/modular_0_4_0/Modular_0-4-0_Texture_1.png",
                "Modular 040 Red", "Works great on industrial railways with sharp turns.");
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
        return new float[][]{{0.8F, 1.1F, 0.3F}};
    }

    public float[] getHitboxSize() {
        return new float[]{2.79F, 1.6F, 1.3F};
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,0F,0.065f}};
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{null, null, null, null, null, null, null, null, null};
    }

    public float getPistonOffset() {
        return 0.5F;
    }

    public float[][] bogieModelOffsets() {
        return null;

    }

    @Override
    public float getPlayerScale() {
        return 0.50f;
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

    public boolean shouldRiderSit() {
        return false;
    }

    public int[] getTankCapacity() {
        return new int[]{9161, 800};
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
        return new ModelBase[]{new Modular_0_4_0()};
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