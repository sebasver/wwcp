package wwcp.entities.locomotives.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.EUBogies.MzBogie;
import wwcp.models.locomotives.diesels.DSBMzI1967;
import wwcp.worldwidecontentpack;

import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityMZClassOne1967 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityMZClassOne1967(null), worldwidecontentpack.MODID,worldwidecontentpack.Denmark);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityMZClassOne1967(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityMZClassOne1967(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.MZI1967().name; }

    @Override
    public String transportcountry() { return Transport.MZI1967().country; }

    @Override
    public String transportYear() { return Transport.MZI1967().year; }

    @Override
    public String transportFuelType() {
        return Transport.MZI1967().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.MZI1967().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.MZI1967().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.MZI1967().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.MZI1967().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.MZI1967().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.MZI1967().additionalTextTitle) + Transport.MZI1967().additionalText,
                RailUtility.translate(Transport.MZI1967().additionalTextTitle2) + Transport.MZI1967().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.MZI1967().backTopSpeed: Transport.MZI1967().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/MZ/MzI/MzIBrown.png", "textures/bogies/Mz_Bogey.png",
                "DSB Brown Livery", "The original livery of the Class Mz I and II when delivered to DSB");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/MZ/MzI/MzIDSB1980-1990s.png", "textures/bogies/Mz_Bogey.png",
                "DSB Red and Black Livery 1980", "Standard Red and Black livery for the DSB before the cornered windows were blinded in 1990");
    }

    @Override
    public float getMaxFuel(){return 20;}


    public TrainsInMotion.transportTypes getType() {return TrainsInMotion.transportTypes.ELECTRIC;
    }



    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-4.25f,1.55f, -0.25f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{10.23f,2.2f,1.5f};
    }

    public ItemStack[] getRecipe() {
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
    public float[][] bogieModelOffsets(){return new float[][]{{3f,0.05f,0},{-3f,0.05f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new MzBogie()}; }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{3, -3};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.03f,-0.05F,0.F}};}

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

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    //@Override
    public int[] getTankCapacity(){return new int[]{9161, 800};}

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

    public ModelBase[] getModel(){return new ModelBase[]{new DSBMzI1967()};}

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


