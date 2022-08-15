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
import wwcp.models.bogies.AmericanTrucks.U_1_F_Front_Bogie;
import wwcp.models.bogies.AmericanTrucks.U_1_F_Rear_Bogie;
import wwcp.models.locomotives.steamers.LNERJ38_39;
import wwcp.models.locomotives.steamers.U_1_F;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityU1F extends EntityTrainCore {

    public EntityU1F(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityU1F(null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityU1F(World world) {
        super(world);
    }

    @Override
    public String transportName() { return Transport.U1F().name; }

    @Override
    public String transportcountry() { return Transport.U1F().country; }

    @Override
    public String transportYear() { return Transport.U1F().year; }

    @Override
    public String transportFuelType() {
        return Transport.U1F().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.U1F().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.U1F().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.U1F().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.U1F().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.U1F().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.U1F().additionalTextTitle) + Transport.U1F().additionalText,
                RailUtility.translate(Transport.U1F().additionalTextTitle2) + Transport.U1F().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.U1F().backTopSpeed: Transport.U1F().topSpeed;}

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/U1F/U-1-F_DItchlights_N.png",
                new String[]{"textures/bogies/AmericanTrucks/U-1-F_Front_Bogie_Black_N.png","textures/bogies/AmericanTrucks/U-1-F_Rear_Bogie_Black_N.png"},
                "Highliner", "Blue");
    }

    @Override
    public float[][] modelRotations(){return new float[][]{{0f, 180.0f, 0.0f}};}

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
        return new float[][]{{3.3F, 1.2F, 0.25F}};
    }

    public float[] getHitboxSize() {
        return new float[]{7.45F, 2.1F, 1.3F};
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{null, null, null, null, null, null, null, null, null};
    }

    public float getPistonOffset() {
        return 0.5F;
    }

    public float[][] getSmokeOffset() {
        return new float[][]{{-1.0F, 0.0F, 0.5F, 1.1711154E7F, 30.0F}, {-1.0F, 0.0F, -0.5F, 1.1711154E7F, 30.0F}, {-1.4F, 2.0F, 0.0F, 3947580.0F, 500.0F}};
    }


    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.95f, 0f, 0}, {-1.90f, 0f, 0}};
    }

    public ModelBase[] bogieModels() {
        return new ModelBase[]{new U_1_F_Front_Bogie(), new U_1_F_Rear_Bogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.0F, 0.1F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.45f,-0F,0F}};}

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
        return new ModelBase[]{new U_1_F()};
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
