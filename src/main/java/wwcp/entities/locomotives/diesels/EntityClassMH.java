package wwcp.entities.locomotives.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
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
import net.minecraftforge.fluids.FluidContainerRegistry;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.locomotives.diesels.DSBMH;
import wwcp.worldwidecontentpack;

import java.util.UUID;


public class EntityClassMH extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityClassMH(null), worldwidecontentpack.MODID,worldwidecontentpack.Denmark);

    public EntityClassMH(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityClassMH(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.ClassMH().name; }

    @Override
    public String transportcountry() { return Transport.ClassMH().country; }

    @Override
    public String transportYear() { return Transport.ClassMH().year; }

    @Override
    public String transportFuelType() {
        return Transport.ClassMH().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.ClassMH().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.ClassMH().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.ClassMH().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.ClassMH().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.ClassMH().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.ClassMH().additionalTextTitle) + Transport.ClassMH().additionalText,
                RailUtility.translate(Transport.ClassMH().additionalTextTitle2) + Transport.ClassMH().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.ClassMK().backTopSpeed: Transport.ClassMK().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/DSBMH/MhGreen.png",
                "DSB Green", "When the first diesel shunters rolled out in the 1950, DSB decided that all shunters was painted in a green color.");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:DSB Green";
    }

    @Override
    public int getInventoryRows(){return 1;}

    public TrainsInMotion.transportTypes getType(){return TrainsInMotion.transportTypes.DIESEL;}

    @Override
    public float getMaxFuel(){return 5000;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.6f,1.45f,-0.35f}};}
    @Override
    public float[] getHitboxSize() {
        return new float[]{4.3f,2.2f,1.5f};
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{1.0F, -1.0F};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.0f,-0.05F,0F}};}

    /**
     * <h2>rider sit or stand</h2>
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return false;
    }

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    //@Override
    public int[] getTankCapacity(){return new int[]{9161, 800};}

    /**
     * <h2>fluid filter</h2>
     * defines what fluids can and can't be stored in the tank.
     * for instance if you have a wooden tanker car, you can deny fluids that are fire sources (like lava).
     */


    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return TileEntityFurnace.getItemBurnTime(stack)>0;}
            case 401:{return FluidContainerRegistry.getFluidForFilledItem(stack)!=null && canFill(null, FluidContainerRegistry.getFluidForFilledItem(stack).getFluid());}
            default:{return true;}
        }
    }

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */
    @Override
    public void manageFuel(){
        fuelHandler.manageElectric(this);
    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }

    public ModelBase[] getModel(){return new ModelBase[]{new DSBMH()};}

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
