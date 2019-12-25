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
import wwcp.TransportDetails;
import wwcp.entities.WWCPTransport;
import wwcp.models.locomotives.diesels.KoFIII2;
import wwcp.worldwidecontentpack;

import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityKofIII2 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityKofIII2(null), worldwidecontentpack.MODID,worldwidecontentpack.European);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityKofIII2(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityKofIII2(World world){
        super(world);
    }

    @Override
    public String transportName() { return TransportDetails.KoFIII2().name; }

    @Override
    public String transportcountry() { return TransportDetails.KoFIII2().country; }

    @Override
    public String transportYear() { return TransportDetails.KoFIII2().year; }

    @Override
    public String transportFuelType() {
        return TransportDetails.KoFIII2().fuel;
    }
    @Override
    public boolean isFictional() {
        return TransportDetails.KoFIII2().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return TransportDetails.KoFIII2().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return TransportDetails.KoFIII2().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  TransportDetails.KoFIII2().weightinKGs;
    }

    public boolean isReinforced() {
        return TransportDetails.KoFIII2().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(TransportDetails.KoFIII2().additionalTextTitle) + TransportDetails.KoFIII2().additionalText,
                RailUtility.translate(TransportDetails.KoFIII2().additionalTextTitle2) + TransportDetails.KoFIII2().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? TransportDetails.KoFIII2().backTopSpeed: TransportDetails.KoFIII2().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/KoFIII/KofBlue.png",
                "Ocean Blue", "Ocean Blue livery for the KoF");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/KoFIII/Kof_Red.png",
                "Red Livery", "Red livery for the KoF");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/KoFIII/Kof_Yellow.png",
                "Yellow Livery", "Red livery for the KoF");
    }

    @Override
    public float getMaxFuel(){return 20;}


    public TrainsInMotion.transportTypes getType() {return TrainsInMotion.transportTypes.ELECTRIC;
    }

    @Override
    public float getPlayerScale() {
        return 0.60f;
    }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1f,1.2f, -0.25f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{3.95f,1.8f,1.5f};
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

    @Override
    public float[][] bogieModelOffsets(){return null;}

    @Override
    public ModelBase[] bogieModels() {return null; }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{1f, -1f};
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
        return false;
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

    public ModelBase[] getModel(){return new ModelBase[]{new KoFIII2()};}

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


