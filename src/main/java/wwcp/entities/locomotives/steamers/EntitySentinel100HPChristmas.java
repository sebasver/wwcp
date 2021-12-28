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
import wwcp.models.locomotives.steamers.ChristmasSentinel;
import wwcp.worldwidecontentpack;

// XXXX -> Entity Name
// YYYY -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntitySentinel100HPChristmas extends EntityTrainCore {

    public EntitySentinel100HPChristmas(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntitySentinel100HPChristmas(null), worldwidecontentpack.MODID, worldwidecontentpack.FestivitiesTab);

    public EntitySentinel100HPChristmas(World world) {
        super(world);
    }

    @Override
    public String transportName() { return Transport.Sentinel100HPChristmas().name; }

    @Override
    public String transportcountry() { return Transport.Sentinel100HPChristmas().country; }

    @Override
    public String transportYear() { return Transport.Sentinel100HPChristmas().year; }

    @Override
    public String transportFuelType() {
        return Transport.Sentinel100HPChristmas().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.Sentinel100HPChristmas().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.Sentinel100HPChristmas().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.Sentinel100HPChristmas().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.Sentinel100HPChristmas().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.Sentinel100HPChristmas().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Sentinel100HPChristmas().additionalTextTitle) + Transport.Sentinel100HPChristmas().additionalText,
                RailUtility.translate(Transport.Sentinel100HPChristmas().additionalTextTitle2) + Transport.Sentinel100HPChristmas().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.Sentinel100HPChristmas().backTopSpeed: Transport.Sentinel100HPChristmas().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/passengerstock/ChristmasStock/ChristmasSentinel.png",
                "HLE28 NMBS Cargo", "Used by the NMBS/SNCB in belgium for freight trains");
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
        return new float[][]{{-1.345f,-0.12F,0F}};
    }

    public ItemStack[] getRecipe() {
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
        return new ModelBase[]{new ChristmasSentinel()};
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