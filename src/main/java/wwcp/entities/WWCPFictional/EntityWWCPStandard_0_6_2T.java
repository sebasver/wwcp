//This is a documentation file for copy pasting into a steam locomotive.
package wwcp.entities.WWCPFictional;

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
import wwcp.models.WWCPFictional.WWCPStandard0_6_2T;
import wwcp.models.locomotives.steamers.Class812;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityWWCPStandard_0_6_2T extends EntityTrainCore {

    public EntityWWCPStandard_0_6_2T(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityWWCPStandard_0_6_2T(null), worldwidecontentpack.MODID, worldwidecontentpack.WWCPTab);

    public EntityWWCPStandard_0_6_2T(World world) {
        super(world);
    }

    @Override
    public String transportName() { return Transport.WWCPStandard0_6_2T().name; }

    @Override
    public String transportcountry() { return Transport.WWCPStandard0_6_2T().country; }

    @Override
    public String transportYear() { return Transport.WWCPStandard0_6_2T().year; }

    @Override
    public String transportFuelType() {
        return Transport.WWCPStandard0_6_2T().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.WWCPStandard0_6_2T().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.WWCPStandard0_6_2T().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.WWCPStandard0_6_2T().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.WWCPStandard0_6_2T().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.WWCPStandard0_6_2T().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.WWCPStandard0_6_2T().additionalTextTitle) + Transport.WWCPStandard0_6_2T().additionalText,
                RailUtility.translate(Transport.WWCPStandard0_6_2T().additionalTextTitle2) + Transport.WWCPStandard0_6_2T().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.WWCPStandard0_6_2T().backTopSpeed: Transport.WWCPStandard0_6_2T().topSpeed;}

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/WWCPFictional/WWCP_Standard_0-6-2T_Texture_1_Noised.png",
                "WWCP 0-6-2 T", "WWCP Company tanker engine livery");

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
        return new float[]{5.7F, 2.1F, 1.3F};
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

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.7F, -1.2F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.41f,0F,0.F}};}

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
        return new ModelBase[]{new WWCPStandard0_6_2T()};
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