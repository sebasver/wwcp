package wwcp.entities.railbusses;

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
import wwcp.models.bogies.EUBogies.ModelBRDMUBogie;
import wwcp.models.railbusses.BRClass121;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityBRClass121 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityBRClass121(null), worldwidecontentpack.MODID,worldwidecontentpack.United_Kingdom);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityBRClass121(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityBRClass121(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.BRClass121().name; }

    @Override
    public String transportcountry() { return Transport.BRClass121().country; }

    @Override
    public String transportYear() { return Transport.BRClass121().year; }

    @Override
    public String transportFuelType() {
        return Transport.BRClass121().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.BRClass121().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.BRClass121().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.BRClass121().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.BRClass121().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.BRClass121().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.BRClass121().additionalTextTitle) + Transport.BRClass121().additionalText,
                RailUtility.translate(Transport.BRClass121().additionalTextTitle2) + Transport.BRClass121().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.BRClass121().backTopSpeed: Transport.BRClass121().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/Railbusses/BRClass121/BR_Class_121_Texture_1.png",
                "textures/bogies/BRDMUBogie.png",
                "BR Blue", "Standard British Railways blue");
    }
    
    @Override
    public int getInventoryRows(){return Transport.BRClass121().rows;}

    //@Override
    public TrainsInMotion.transportTypes getType(){return TrainsInMotion.transportTypes.DIESEL;}

    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-4.2f,1.3f, -0.2f}};}
    @Override
    public float[] getHitboxSize() {
        return new float[]{9.3f,2.2f,1.7f};
    }
    
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    /**
     * <h2>Hitbox offsets</h2>
     * @return defines the positions for the hitboxes in blocks. 0 being the center, negative values being towards the front. the first and last values define the positions of the couplers
     */

    /**
     * <h2>Animation radius</h2>
     * @return defines the radius in microblocks (1/16 of a block) for the piston rotations.
     */
    @Override
    public float getPistonOffset(){return 0.5f;}
    /**
     * <h2>Smoke offset</h2>
     * @return defines the array of positions in blocks for smoke.
     * the first number in the position defines the X/Z axis, negative values are towards the front of the train.
     * the second number defines the Y position, 0 is the rails, higher values are towards the sky.
     * the third number defines left to right, negative values are towards the right.
     * the forth number defines the grayscale color from 255 (white) to 0 (black)
     * the 5th number is for density, there's no min/max but larger numbers will create more lag.
     */
    //@Override
    public float[][] getSmokeOffset(){return new float[][]{{-1,0,0.5f,0xB2B2B2,30},{-1,0,-0.5f,0xB2B2B2,30},{-1.4f,2f,0,0x3C3C3C,500}};}

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{3.525f,0f,0},{-3.525f,0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new ModelBRDMUBogie()};
    }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{4, -4};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.12f,0.07F,0F}};}


    /**
     * <h2>rider sit or stand</h2>
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    /**
     * <h2>reinforced transport</h2>
     * this returns if this specific entity is reinforced (explosion proof and damage resistant).
     * since this is a function it can be conditional as well, for instance if it has a specific skin.
     */
    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    //@Override
    public int[] getTankCapacity(){return new int[]{9161, 800};}

    //@Override
    public int getRFCapacity() {
        return 1110000;
    }

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
        fuelHandler.manageSteam(this);
    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }


    public ModelBase[] getModel(){return new ModelBase[]{new BRClass121()};}

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