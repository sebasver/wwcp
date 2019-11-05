package wwcp.entities.TempTC;//This is a documentation class for copy pasting into an electric train class.


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import wwcp.models.TCTemp.E10;
import wwcp.models.TCTemp.E10Bogie;
import wwcp.worldwidecontentpack;
import java.util.UUID;
import net.minecraft.init.Items;


public class EntityE10 extends EntityTrainCore {

    public static final Item thisItem = new ItemTransport(new wwcp.entities.TempTC.EntityE10(null), worldwidecontentpack.MODID,worldwidecontentpack.Belgium);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityE10(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityE10(World world){
        super(world);
    }

    @Override
    public String transportName(){return "E10 for testing purposes";}
    @Override
    public String transportcountry(){return "Europe";}
    @Override
    public String transportYear(){return "2000-now";}
    @Override
    public String transportFuelType() {
        return "Electric";
    }
    @Override
    public boolean isFictional(){return false;}
    @Override
    public float transportTractiveEffort(){return 0;}
    @Override
    public float transportMetricHorsePower(){return 75f;}
    @Override
    public float transportTopSpeed(){return 140f;}
    @Override
    public int getInventoryRows(){return 1;}
    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate("wwcp.era") + "II"};}
    }
    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp7.png", "textures/TempFolder/TempBogie.png",
                "Temp 7", "Temp 7");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp8.png", "textures/TempFolder/TempBogie.png",
                "Temp 8", "Temp 8");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp9.png", "textures/TempFolder/TempBogie.png",
                "Temp 9", "Temp 9");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp10.png", "textures/TempFolder/TempBogie.png",
                "Temp 10", "Temp 10");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/TempFolder/Temp11.png", "textures/TempFolder/TempBogie.png",
                "Temp 11", "Temp 11");
    }
    public float getMaxFuel(){return 20;}


    public TrainsInMotion.transportTypes getType() {return TrainsInMotion.transportTypes.ELECTRIC;
    }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-3.82f,1.4f, -0.25f}};}
    @Override
    public float[] getHitboxSize() {
        return new float[]{5f,2.5f,1.5f};
    }

    @Override
    public float weightKg(){return 10886.2169f;}

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

    @Override
    public float[][] bogieModelOffsets(){return new float[][]{{1.7f,0.0f,0.3f},{-1.8f,0.0f,0.3f}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new E10Bogie()}; }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2, -2};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,-0.05F,0.F}};}

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
     * since this is a function it can b
     * te conditional as well, for instance if it has a specific skin.
     */
    @Override
    public boolean isReinforced(){return false;}

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    //@Override
    public int[] getTankCapacity(){return new int[]{9161, 800};}

    //@Override
    public int getRFCapacity() {
        return 11000;
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return stack!=null && stack.getItem() ==Items.redstone;}
            default:{return true;}
        }}

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */

    public void manageFuel() {
        this.fuelHandler.manageElectric(this);
    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }

    public ModelBase[] getModel(){return new ModelBase[]{new E10()};}

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("xxxxxxx.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("xxxxxxx.ogg");}
}


