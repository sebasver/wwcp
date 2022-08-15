package wwcp.entities.WWCPFictional;

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
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.WWCPFictional.WWCPShopShunter;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityWWCPShopShunter extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityWWCPShopShunter(null), worldwidecontentpack.MODID,worldwidecontentpack.WWCPTab);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityWWCPShopShunter(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityWWCPShopShunter(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.WWCPShopShunter().name; }

    @Override
    public String transportcountry() { return Transport.WWCPShopShunter().country; }

    @Override
    public String transportYear() { return Transport.WWCPShopShunter().year; }

    @Override
    public String transportFuelType() { return Transport.WWCPShopShunter().fuel;
    }
    @Override
    public boolean isFictional() { return Transport.WWCPShopShunter().fictional;
    }
    @Override
    public float transportTractiveEffort() { return Transport.WWCPShopShunter().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() { return Transport.WWCPShopShunter().metric_horsepower;
    }
    @Override
    public float weightKg() { return  Transport.WWCPShopShunter().weightinKGs;
    }

    public boolean isReinforced() { return Transport.WWCPShopShunter().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.WWCPShopShunter().additionalTextTitle) + Transport.WWCPShopShunter().additionalText,
                RailUtility.translate(Transport.WWCPShopShunter().additionalTextTitle2) + Transport.WWCPShopShunter().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.WWCPShopShunter().backTopSpeed: Transport.WWCPShopShunter().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/WWCPFictional/WWCPShopShunter.png",
                "WWCP Shop shunter", "WWCP Company livery");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:WWCP Shop shunter";
    }

    @Override
    public float getMaxFuel(){return 20;}


    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-3.5f, 1.30f, -0.3f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{3.4f,2f,1.5f};
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
    public float[][] bogieModelOffsets(){return null;};

    @Override
    public ModelBase[] bogieModels() {return null;}

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2.95f, -2.65f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.5f,0.0F,0.0F}};}

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
    public int[] getTankCapacity(){return new int[]{9161};}

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */

    public void manageFuel() {
        this.fuelHandler.manageDiesel(this);
    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }

    public ModelBase[] getModel(){
        return new ModelBase[]{new WWCPShopShunter()};
    }

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


