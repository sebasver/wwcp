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
import wwcp.models.locomotives.steamers.GermanBR.BR50.DRG.DRG_BR50;
import wwcp.models.bogies.GermanBRBogies.BR50Bogie;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDRGBR50 extends EntityTrainCore {

    public EntityDRGBR50(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityDRGBR50(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityDRGBR50(World world) {
        super(world);
    }

    @Override
    public float getPlayerScale(){return 0.65f;}

    @Override
    public String transportName() {
        return Transport.DRGBR50().name;
    }

    @Override
    public String transportcountry() {
        return Transport.DRGBR50().country;
    }

    @Override
    public String transportYear() {
        return Transport.DRGBR50().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.DRGBR50().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.DRGBR50().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.DRGBR50().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.DRGBR50().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.DRGBR50().weightinKGs;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.DRGBR50().additionalTextTitle) + Transport.DRGBR50().additionalText,
                    RailUtility.translate(Transport.DRGBR50().additionalTextTitle2) + Transport.DRGBR50().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.DRGBR50().backTopSpeed : Transport.DRGBR50().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(1)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 1.1", "DRG BR 50 no Deflectors variant 1 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(1)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 1.2", "DRG BR 50 no Deflectors variant 1 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(1)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 1.3", "DRG BR 50 no Deflectors variant 1 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(2)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 2.1", "DRG BR 50 no Deflectors variant 2 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(2)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 2.2", "DRG BR 50 no Deflectors variant 2 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(2)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 2.3", "DRG BR 50 no Deflectors variant 2 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(3)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 3.1", "DRG BR 50 no Deflectors variant 3 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(3)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 3.2", "DRG BR 50 no Deflectors variant 3 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(3)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 3.3", "DRG BR 50 no Deflectors variant 3 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(4)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 4.1", "DRG BR 50 no Deflectors variant 4 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(4)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 4.2", "DRG BR 50 no Deflectors variant 4 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(4)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 4.3", "DRG BR 50 no Deflectors variant 4 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(5)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 5.1", "DRG BR 50 no Deflectors variant 5 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(5)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 5.2", "DRG BR 50 no Deflectors variant 5 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(5)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 5.3", "DRG BR 50 no Deflectors variant 5 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(6)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 6.1", "DRG BR 50 no Deflectors variant 6 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(6)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 6.2", "DRG BR 50 no Deflectors variant 6 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_no_deflectors(6)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 no deflectors 6.3", "DRG BR 50 no Deflectors variant 6 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_wagner(1)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Wagner 1.1", "DRG BR 50 Wagner variant 1 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_wagner(1)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Wagner 1.2", "DRG BR 50 Wagner variant 1 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_wagner(1)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Wagner 1.3", "DRG BR 50 Wagner variant 1 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_wagner(2)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Wagner 2.1", "DRG BR 50 Wagner variant 2 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_wagner(2)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Wagner 2.2", "DRG BR 50 Wagner variant 2 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_wagner(2)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Wagner 2.3", "DRG BR 50 Wagner variant 2 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(1)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 1.1", "DRG BR 50 Witte variant 1 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(1)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 1.2", "DRG BR 50 Witte variant 1 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(1)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 1.3", "DRG BR 50 Witte variant 1 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(2)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 2.1", "DRG BR 50 Witte variant 2 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(2)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 2.2", "DRG BR 50 Witte variant 2 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(2)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 2.3", "DRG BR 50 Witte variant 2 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(3)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 3.1", "DRG BR 50 Witte variant 3 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(3)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 3.2", "DRG BR 50 Witte variant 3 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(3)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 3.3", "DRG BR 50 Witte variant 3 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(4)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 4.1", "DRG BR 50 Witte variant 4 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(4)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 4.2", "DRG BR 50 Witte variant 4 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(4)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 4.3", "DRG BR 50 Witte variant 4 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(5)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 5.1", "DRG BR 50 Witte variant 5 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(5)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 5.2", "DRG BR 50 Witte variant 5 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(5)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 5.3", "DRG BR 50 Witte variant 5 with Plow 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(6)_no_plow.png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 6.1", "DRG BR 50 Witte variant 6 No Plow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(6)_plow(1).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 6.2", "DRG BR 50 Witte variant 6 with Plow 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Steam/BR50/DRG/Skin_DRG_BR50_witte(6)_plow(2).png",
                "textures/bogies/EUBogies/BR50/Bogie_BR50.png",
                "DRG BR 50 Witte 6.3", "DRG BR 50 Witte variant 6 with Plow 2");
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
        return Transport.DRGBR50().reinforced;
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
        return new ModelBase[]{new DRG_BR50()};
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

