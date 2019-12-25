package wwcp.entities.locomotives.steamers.DB;

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
import wwcp.TransportDetails;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.BR01BackBogie;
import wwcp.models.bogies.BR01FrontBogie;
import wwcp.models.locomotives.steamers.DBBR01.DB_BR01;
import wwcp.models.locomotives.steamers.DBBR01.DB_BR01_NeuKessel_Oil;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDBBR01NeuKessel_Oil extends EntityTrainCore {

    public EntityDBBR01NeuKessel_Oil(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityDBBR01NeuKessel_Oil(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityDBBR01NeuKessel_Oil(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() {
        return TransportDetails.DBBR01NeuKesselOil().name;
    }

    @Override
    public String transportcountry() {
        return TransportDetails.DBBR01NeuKesselOil().country;
    }

    @Override
    public String transportYear() {
        return TransportDetails.DBBR01NeuKesselOil().year;
    }

    @Override
    public String transportFuelType() {
        return TransportDetails.DBBR01NeuKesselOil().fuel;
    }

    @Override
    public boolean isFictional() {
        return TransportDetails.DBBR01NeuKesselOil().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return TransportDetails.DBBR01NeuKesselOil().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return TransportDetails.DBBR01NeuKesselOil().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return TransportDetails.DBBR01NeuKesselOil().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(TransportDetails.DBBR01NeuKesselOil().additionalTextTitle) + TransportDetails.DBBR01NeuKesselOil().additionalText,
                    RailUtility.translate(TransportDetails.DBBR01NeuKesselOil().additionalTextTitle2) + TransportDetails.DBBR01NeuKesselOil().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? TransportDetails.DBBR01NeuKesselOil().backTopSpeed : TransportDetails.DBBR01NeuKesselOil().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DBBR01/DB_BR01_NeuKessel_Oil_1.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DB BR 01 Neubaukessel 1", "DB BR 01 Neubaukessel variant 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DBBR01/DB_BR01_NeuKessel_Oil_2.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DB BR 01 Neubaukessel 2", "DB BR 01 Neubaukessel variant 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DBBR01/DB_BR01_NeuKessel_Oil_3.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DB BR 01 Neubaukessel 3", "DB BR 01 Neubaukessel variant 3");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DBBR01/DB_BR01_NeuKessel_Oil_4.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DB BR 01 Neubaukessel 4", "DB BR 01 Neubaukessel variant 4");
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
        return new float[]{7.325F, 2.1F, 1.3F};
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{null, null, null, null, null, null, null, null, null};
    }

    public float getPistonOffset() {
        return 0.5F;
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.5f, 0.1f, 0}, {-2.5f, 0.1f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new BR01FrontBogie(), new BR01BackBogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.0F, 0.1F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.165f, -0.1F, 0.F}};
    }

    public boolean shouldRiderSit() {
        return false;
    }

    public boolean isReinforced() {
        return TransportDetails.DBBR01NeuKesselOil().reinforced;
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
        return new ModelBase[]{new DB_BR01_NeuKessel_Oil()};
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

