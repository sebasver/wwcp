package wwcp.entities.locomotives.steamers.BR01.DB;

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
import wwcp.models.locomotives.steamers.GermanBR.BR01.DBBR01.DB_BR012NeuKessel;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDBBR012NeuKessel extends EntityTrainCore {

    public EntityDBBR012NeuKessel(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityDBBR012NeuKessel(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityDBBR012NeuKessel(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() {
        return Transport.DBBR012NeuKessel().name;
    }

    @Override
    public String transportcountry() {
        return Transport.DBBR012NeuKessel().country;
    }

    @Override
    public String transportYear() {
        return Transport.DBBR012NeuKessel().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.DBBR012NeuKessel().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.DBBR012NeuKessel().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.DBBR012NeuKessel().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.DBBR012NeuKessel().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.DBBR012NeuKessel().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.DBBR012NeuKessel().additionalTextTitle) + Transport.DBBR012NeuKessel().additionalText,
                    RailUtility.translate(Transport.DBBR012NeuKessel().additionalTextTitle2) + Transport.DBBR012NeuKessel().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.DBBR012NeuKessel().backTopSpeed : Transport.DBBR012NeuKessel().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR01/DBBR01/DB_BR012_NeuKessel_1.png", "textures/bogies/EUBogies/BR01/BR01BogieWhite.png",
                "DB BR 01.10 1", "DB BR 01.10 variant 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR01/DBBR01/DB_BR012_NeuKessel_2.png", "textures/bogies/EUBogies/BR01/BR01BogieBlack.png",
                "DB BR 01.10 2", "DB BR 01.10 variant 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR01/DBBR01/DB_BR012_NeuKessel_3.png", "textures/bogies/EUBogies/BR01/BR01BogieWhite.png",
                "DB BR 01.10 3", "DB BR 01.10 variant 3");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR01/DBBR01/DB_BR012_NeuKessel_4.png", "textures/bogies/EUBogies/BR01/BR01BogieBlack.png",
                "DB BR 01.10 4", "DB BR 01.10 variant 4");
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

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.165f, 0.05f, 0.F}};
    }

    public boolean shouldRiderSit() {
        return false;
    }

    public boolean isReinforced() {
        return Transport.DBBR012NeuKessel().reinforced;
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
        return new ModelBase[]{new DB_BR012NeuKessel()};
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

