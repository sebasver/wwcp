package wwcp.entities.locomotives.steamers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
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
import wwcp.models.bogies.X10a_Front_Truck;
import wwcp.models.bogies.X10a_Rear_Truck;
import wwcp.models.locomotives.steamers.GermanBR.BR01.DBBR01.DB_BR01;
import wwcp.models.locomotives.steamers.X10a;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityX10a extends EntityTrainCore {

    public EntityX10a(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityX10a(null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityX10a(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() {
        return Transport.X10a().name;
    }

    @Override
    public String transportcountry() {
        return Transport.X10a().country;
    }

    @Override
    public String transportYear() {
        return Transport.X10a().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.X10a().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.X10a().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.X10a().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.X10a().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.X10a().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.X10a().additionalTextTitle) + Transport.X10a().additionalText,
                    RailUtility.translate(Transport.X10a().additionalTextTitle2) + Transport.X10a().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.X10a().backTopSpeed : Transport.X10a().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(),new TransportSkin( worldwidecontentpack.MODID, "textures/locomotive/Steam/X10a/X10a_Square_Logo_N.png",
                "X10a", "X10a").setBogieTextures(new String[]{"textures/locomotive/Steam/X10a/X10a_Front_Truck.png","textures/locomotive/Steam/X10a/X10a_Rear_Truck_N.png"}));
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
        return new float[][]{{1.4F, 1.2F, 0F}};
    }

    public float[] getHitboxSize() {
        return new float[]{6.5F, 2.1F, 1.3F};
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{null, null, null, null, null, null, null, null, null};
    }

    public float getPistonOffset() {
        return 0.5F;
    }

    @Override
    public float[][] modelRotations(){return new float[][]{{0f,180f,0f}};}

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.05f, -0f, 0}, {-2.45f, -0f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new X10a_Front_Truck(), new X10a_Rear_Truck()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.20F, -2.31F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f, -0f, 0.F}};
    }

    public boolean shouldRiderSit() {
        return true;
    }

    public boolean isReinforced() {
        return Transport.X10a().reinforced;
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
        return new ModelBase[]{new X10a()};
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

