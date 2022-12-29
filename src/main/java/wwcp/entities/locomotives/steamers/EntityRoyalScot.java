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
import wwcp.models.bogies.GermanBRBogies.BR50Bogie;
import wwcp.models.bogies.RoyalScotBogie;
import wwcp.models.locomotives.steamers.GermanBR.BR50.DRG.DRG_BR50;
import wwcp.models.locomotives.steamers.RoyalScot;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityRoyalScot extends EntityTrainCore {

    public EntityRoyalScot(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityRoyalScot(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityRoyalScot(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() {
        return Transport.RoyalScot().name;
    }

    @Override
    public String transportcountry() {
        return Transport.RoyalScot().country;
    }

    @Override
    public String transportYear() {
        return Transport.RoyalScot().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.RoyalScot().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.RoyalScot().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.RoyalScot().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.RoyalScot().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.RoyalScot().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.RoyalScot().additionalTextTitle) + Transport.RoyalScot().additionalText,
                    RailUtility.translate(Transport.RoyalScot().additionalTextTitle2) + Transport.RoyalScot().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.RoyalScot().backTopSpeed : Transport.RoyalScot().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/RoyalScot/royalScotLmsBlack.png",
                "textures/locomotive/Steam/RoyalScot/royalScotBogie.png",
                "LMS Black", "DRG BR 50 no Deflectors variant 1 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/RoyalScot/royalScotLmsCrimson.png",
                "textures/locomotive/Steam/RoyalScot/royalScotBogie.png",
                "Early Crimson", "DRG BR 50 no Deflectors variant 1 No Plow");
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
        return new float[][]{{3.3F, 1.25F, 0.0F}};
    }

    public float[] getHitboxSize() {
        return new float[]{6.1F, 2.5F, 1.3F};
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{null, null, null, null, null, null, null, null, null};
    }

    public float getPistonOffset() {
        return 0.5F;
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.8f, 0f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new RoyalScotBogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.20F, -2.31F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.025f, 0.05F, 0.F}};
    }

    public boolean shouldRiderSit() {
        return false;
    }

    public boolean isReinforced() {
        return Transport.RoyalScot().reinforced;
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
        return new ModelBase[]{new RoyalScot()};
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

