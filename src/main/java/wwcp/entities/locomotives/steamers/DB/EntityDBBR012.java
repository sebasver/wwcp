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
import wwcp.models.locomotives.steamers.DBBR01.DB_BR012;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDBBR012 extends EntityTrainCore {

    public EntityDBBR012(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityDBBR012(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityDBBR012(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() {
        return TransportDetails.DBBR012().name;
    }

    @Override
    public String transportcountry() {
        return TransportDetails.DBBR012().country;
    }

    @Override
    public String transportYear() {
        return TransportDetails.DBBR012().year;
    }

    @Override
    public String transportFuelType() {
        return TransportDetails.DBBR012().fuel;
    }

    @Override
    public boolean isFictional() {
        return TransportDetails.DBBR012().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return TransportDetails.DBBR012().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return TransportDetails.DBBR012().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return TransportDetails.DBBR012().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(TransportDetails.DBBR012().additionalTextTitle) + TransportDetails.DBBR012().additionalText,
                    RailUtility.translate(TransportDetails.DBBR012().additionalTextTitle2) + TransportDetails.DBBR012().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? TransportDetails.DBBR012().backTopSpeed : TransportDetails.DBBR012().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DBBR01/DB_BR012_1.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DB BR 01.10 1", "DB BR 01.10 variant 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DBBR01/DB_BR012_2.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DB BR 01.10 2", "DB BR 01.10 variant 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DBBR01/DB_BR012_3.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DB BR 01.10 3", "DB BR 01.10 variant 3");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DBBR01/DB_BR012_4.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DB BR 01.10 4", "DB BR 01.10 variant 4");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DBBR01/DB_BR012_5.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DB BR 01.10 5", "DB BR 01.10 variant 5");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DBBR01/DB_BR012_6.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "DB BR 01.10 6", "DB BR 01.10 variant 6");
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
        return new float[][]{{2.38f, 0.1f, 0}, {-2.75f, 0.1f, 0}};
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
        return new float[][]{{0.165f, -0.1F, 0.F}};
    }

    public boolean shouldRiderSit() {
        return false;
    }

    public boolean isReinforced() {
        return TransportDetails.DBBR012().reinforced;
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
        return new ModelBase[]{new DB_BR012()};
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

