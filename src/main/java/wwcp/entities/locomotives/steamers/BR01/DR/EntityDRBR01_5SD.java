package wwcp.entities.locomotives.steamers.BR01.DR;

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
import wwcp.models.bogies.GermanBRBogies.BR01BackBogie;
import wwcp.models.bogies.GermanBRBogies.BR01FrontBogie;
import wwcp.models.locomotives.steamers.GermanBR.BR01.DRBR01.DR_BR01_5SD;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDRBR01_5SD extends EntityTrainCore {

    public EntityDRBR01_5SD(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityDRBR01_5SD(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityDRBR01_5SD(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() {
        return Transport.DRBR01_5SD().name;
    }

    @Override
    public String transportcountry() {
        return Transport.DRBR01_5SD().country;
    }

    @Override
    public String transportYear() {
        return Transport.DRBR01_5SD().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.DRBR01_5SD().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.DRBR01_5SD().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.DRBR01_5SD().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.DRBR01_5SD().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.DRBR01_5SD().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.DRBR01_5SD().additionalTextTitle) + Transport.DRBR01_5SD().additionalText,
                    RailUtility.translate(Transport.DRBR01_5SD().additionalTextTitle2) + Transport.DRBR01_5SD().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.DRBR01_5SD().backTopSpeed : Transport.DRBR01_5SD().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR01/DRBR01/DR_BR01_5_SD_1.png", "textures/bogies/EUBogies/BR01/BR01BogieBlack.png",
                "DR BR 01.5 1", "DR BR 01.5 variant 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR01/DRBR01/DR_BR01_5_SD_2.png", "textures/bogies/EUBogies/BR01/BR01BogieBlack.png",
                "DR BR 01.5 2", "DR BR 01.5 variant 2");
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
        return new float[][]{{3.3F, 1.6F, 0.0F}};
    }

    public float[] getHitboxSize() {
        return new float[]{7.22F, 2.1F, 1.3F};
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{null, null, null, null, null, null, null, null, null};
    }

    public float getPistonOffset() {
        return 0.5F;
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.38f, -0.05f, 0}, {-2.75f, -0.05f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new BR01FrontBogie(), new BR01BackBogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.20F, -2.31F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.11f, 0.05F, 0.F}};
    }

    public boolean shouldRiderSit() {
        return false;
    }

    public boolean isReinforced() {
        return Transport.DRBR01_5SD().reinforced;
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
        return new ModelBase[]{new DR_BR01_5SD()};
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

