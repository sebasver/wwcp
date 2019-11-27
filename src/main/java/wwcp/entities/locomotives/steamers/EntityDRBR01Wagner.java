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
        import wwcp.entities.SuperStat;
        import wwcp.entities.WWCPTransport;
        import wwcp.models.bogies.BR01FrontBogie;
        import wwcp.models.bogies.BackBogieDRBR01;
        import wwcp.models.locomotives.DRBR01;
        import wwcp.worldwidecontentpack;

public class EntityDRBR01Wagner extends EntityTrainCore {

    public EntityDRBR01Wagner(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityDRBR01Wagner(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityDRBR01Wagner(World world) {
        super(world);
    }

//    @Override
//    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() { return SuperStat.BR01Wagner().name; }
    @Override
    public String transportcountry() { return SuperStat.BR01Wagner().country; }
    @Override
    public String transportYear() { return SuperStat.BR01Wagner().year; }
    @Override
    public String transportFuelType() {
        return SuperStat.BR01Wagner().fuel;
    }
    @Override
    public boolean isFictional() {
        return SuperStat.BR01Wagner().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return SuperStat.BR01Wagner().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return SuperStat.BR01Wagner().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  SuperStat.BR01Wagner().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(SuperStat.BR01Wagner().additionalTextTitle) + SuperStat.BR01Wagner().additionalText,
                RailUtility.translate(SuperStat.BR01Wagner().additionalTextTitle2) + SuperStat.BR01Wagner().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0?SuperStat.BR01Wagner().backTopSpeed:SuperStat.BR01Wagner().topSpeed;}

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DR01/Wagner1.png", "textures/bogies/BR01/BR01FrontBlack.png",
                "BR01 Wagner", "Default black wheels for the BR01 Wagner");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/DR01/Wagner2.png", "textures/bogies/BR01/BR01FrontWhite.png",
                "BR01 Wagner white wheels", "Special white wheels for the BR01 Wagner");
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
        return new float[]{7.325F, 2.1F, 1.3F};
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{null, null, null, null, null, null, null, null, null};
    }

    public float getPistonOffset() {
        return 0.5F;
    }

    @Override
    public float[][] bogieModelOffsets(){return new float[][]{{2.5f,0.1f,0},{-2.5f,0.1f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new BR01FrontBogie(), new BackBogieDRBR01()}; }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.0F, 0.1F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.165f,-0.1F,0.F}};}

    public boolean shouldRiderSit() {
        return false;
    }

    public boolean isReinforced() {
        return SuperStat.BR01Wagner().reinforced;
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
        return new ModelBase[]{new DRBR01()};
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

