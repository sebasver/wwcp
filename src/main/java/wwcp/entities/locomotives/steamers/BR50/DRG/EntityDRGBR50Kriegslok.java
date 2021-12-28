package wwcp.entities.locomotives.steamers.BR50.DRG;

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
import wwcp.models.locomotives.steamers.GermanBR.BR50.DRG.DRG_BR50_Kriegslok;
import wwcp.models.bogies.GermanBRBogies.BR50Bogie;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDRGBR50Kriegslok extends EntityTrainCore {

    public EntityDRGBR50Kriegslok(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityDRGBR50Kriegslok(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityDRGBR50Kriegslok(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() {
        return Transport.DRGBR50Kriegslok().name;
    }

    @Override
    public String transportcountry() {
        return Transport.DRGBR50Kriegslok().country;
    }

    @Override
    public String transportYear() {
        return Transport.DRGBR50Kriegslok().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.DRGBR50Kriegslok().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.DRGBR50Kriegslok().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.DRGBR50Kriegslok().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.DRGBR50Kriegslok().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.DRGBR50Kriegslok().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.DRGBR50Kriegslok().additionalTextTitle) + Transport.DRGBR50Kriegslok().additionalText,
                    RailUtility.translate(Transport.DRGBR50Kriegslok().additionalTextTitle2) + Transport.DRGBR50Kriegslok().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.DRGBR50Kriegslok().backTopSpeed : Transport.DRGBR50Kriegslok().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_Kriegslok.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DB BR 50 no deflectors 1", "DR BR 50 no Deflectors variant 1");
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
        return new float[][]{{3.15F, 1.25F, 0.30F}};
    }

    public float[] getHitboxSize() {
        return new float[]{6.85F, 2.5F, 1.3F};
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{null, null, null, null, null, null, null, null, null};
    }

    public float getPistonOffset() {
        return 0.5F;
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.38f, -0.05f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new BR50Bogie()};
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
        return Transport.DRGBR50Kriegslok().reinforced;
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
        return new ModelBase[]{new DRG_BR50_Kriegslok()};
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

