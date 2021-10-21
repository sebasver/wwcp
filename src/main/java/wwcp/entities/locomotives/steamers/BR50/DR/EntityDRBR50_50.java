package wwcp.entities.locomotives.steamers.BR50.DR;

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
import wwcp.models.locomotives.steamers.GermanBR.BR50.DR.DR_BR50_50;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDRBR50_50 extends EntityTrainCore {

    public EntityDRBR50_50(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityDRBR50_50(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityDRBR50_50(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() {
        return Transport.DRBR50_50().name;
    }

    @Override
    public String transportcountry() {
        return Transport.DRBR50_50().country;
    }

    @Override
    public String transportYear() {
        return Transport.DRBR50_50().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.DRBR50_50().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.DRBR50_50().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.DRBR50_50().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.DRBR50_50().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.DRBR50_50().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.DRBR50_50().additionalTextTitle) + Transport.DRBR50_50().additionalText,
                    RailUtility.translate(Transport.DRBR50_50().additionalTextTitle2) + Transport.DRBR50_50().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.DRBR50_50().backTopSpeed : Transport.DRBR50_50().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DR/Skin_DR_BR50_35(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DR BR 50.50 1", "DR BR 50.50 variant 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DR/Skin_DR_BR50_35(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DR BR 50.50 2", "DR BR 50.50 variant 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DR/Skin_DR_BR50_35(3).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DR BR 50.50 3", "DR BR 50.50 variant 3");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DR/Skin_DR_BR50_35(4).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DR BR 50.50 4", "DR BR 50.50 variant 4");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DR/Skin_DR_BR50_35(5).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DR BR 50.50 5", "DR BR 50.50 variant 5");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DR/Skin_DR_BR50_35(6).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DR BR 50.50 6", "DR BR 50.50 variant 6");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DR/Skin_DR_BR50_35(7).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DR BR 50.50 7", "DR BR 50.50 variant 7");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DR/Skin_DR_BR50_35(8).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DR BR 50.50 8", "DR BR 50.50 variant 8");
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
        return Transport.DRBR50_50().reinforced;
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
        return new ModelBase[]{new DR_BR50_50()};
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

