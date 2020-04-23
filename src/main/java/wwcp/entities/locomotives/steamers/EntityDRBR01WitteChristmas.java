package wwcp.entities.locomotives.steamers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.models.bogies.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidContainerRegistry;
import wwcp.entities.WWCPTransport;
import wwcp.models.locomotives.steamers.ChristmasBR01;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDRBR01WitteChristmas extends EntityTrainCore {

    public EntityDRBR01WitteChristmas(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityDRBR01WitteChristmas(null), worldwidecontentpack.MODID, worldwidecontentpack.FestivitiesTab);

    public EntityDRBR01WitteChristmas(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.60f;}

    @Override
    public String transportName() { return Transport.DRBR01WitteChristmas().name; }
    @Override
    public String transportcountry() { return Transport.DRBR01WitteChristmas().country; }
    @Override
    public String transportYear() { return Transport.DRBR01WitteChristmas().year; }
    @Override
    public String transportFuelType() {
        return Transport.DRBR01WitteChristmas().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.DRBR01WitteChristmas().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.DRBR01WitteChristmas().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.DRBR01WitteChristmas().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.DRBR01WitteChristmas().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.DRBR01WitteChristmas().additionalTextTitle) + Transport.DRBR01WitteChristmas().additionalText,
                RailUtility.translate(Transport.DRBR01WitteChristmas().additionalTextTitle2) + Transport.DRBR01WitteChristmas().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.DRBR01WitteChristmas().backTopSpeed: Transport.DRBR01WitteChristmas().topSpeed;}

    @Override
    @SideOnly(Side.CLIENT)
    public int[] getParticleData(int id) {
        switch (id){
            case 1: {return new int[]{1,50,0xCCCC00};}
            case 2: {return new int[]{1,10,0xCCCC00};}
            default: {return new int[]{1,50,0xCCCC11};}
        }
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/RheingoldChristmas/ChristmasBR01.png", "textures/bogies/BR01/BR01BogieBlack.png",
                "Christmas BR01 Witte deflectors", "Default black wheels for the BR01 Wagner");}


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
    public float[][] bogieModelOffsets(){return new float[][]{{2.5f,0.1f,0},{-2.5f,0.1f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new BR01FrontBogie(), new BR01BackBogie()}; }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.5F, -2.5F};
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
        return Transport.DRBR01WitteChristmas().reinforced;
    }

    public int[] getTankCapacity() {
        return new int[]{9000, 1000};
    }

    @Override
    public String[][] getTankFilters(){
        return FuelHandler.DefaultTanks.STEAM.value();
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
        return new ModelBase[]{new ChristmasBR01()};
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

