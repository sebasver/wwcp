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
import wwcp.models.bogies.AmericanTrucks.FlexicoilC2;
import wwcp.models.locomotives.diesels.SD402W;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntitySD402W extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntitySD402W(null), worldwidecontentpack.MODID,worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntitySD402W(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntitySD402W(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.SD402W().name; }

    @Override
    public String transportcountry() { return Transport.SD402W().country; }

    @Override
    public String transportYear() { return Transport.SD402W().year; }

    @Override
    public String transportFuelType() { return Transport.SD402W().fuel;
    }
    @Override
    public boolean isFictional() { return Transport.SD402W().fictional;
    }
    @Override
    public float transportTractiveEffort() { return Transport.SD402W().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() { return Transport.SD402W().metric_horsepower;
    }
    @Override
    public float weightKg() { return  Transport.SD402W().weightinKGs;
    }

    public boolean isReinforced() { return Transport.SD402W().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.SD402W().additionalTextTitle) + Transport.SD402W().additionalText,
                RailUtility.translate(Transport.SD402W().additionalTextTitle2) + Transport.SD402W().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.SD402W().backTopSpeed: Transport.SD402W().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD402W/SD402W_CN.png", "textures/bogies/AmericanTrucks/Flexicoil_Black.png",
                "CN Stripped", "Canadian National in As Delivered, stripped");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD402W/SD402W_CN2.png", "textures/bogies/AmericanTrucks/Flexicoil_Black.png",
                "CN Stripped w/o Dynamic Brake", "Canadian National in stripped, without dynamic brake");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD402W/SD402W_NA.png", "textures/bogies/AmericanTrucks/Flexicoil_Black.png",
                "CN NA", "Canadian National in North America Scheme");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD402W/SD402W_NA_W.png", "textures/bogies/AmericanTrucks/Flexicoil_Black.png",
                "CN NA Faded", "Canadian National in North America Scheme, Sun Faded");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:CN Stripped";
    }

    @Override
    public float getMaxFuel(){return 20;}


    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2.4f, 1.40f, -0.3f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{9f,2.25f,1.5f};
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
    public float[][] bogieModelOffsets(){return new float[][]{{2.8f,0f,0},{-2.55f,0f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new FlexicoilC2()}; }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2.8f, -2.55f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0f,-0.0F,-0.0F}};}

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

    public int[] getParticleData(int id) {
        switch (id){
            case 0:{return new int[]{1, 50, 0x6a6a6a};}//EMD smoke
            case 1:{return super.getParticleData(id);}//heavy smoke
            case 2:{return super.getParticleData(id);}//steam
            case 3:{return super.getParticleData(id);}//led lamp
            case 4:{return super.getParticleData(id);}//reverse lamp
            case 5:{return super.getParticleData(id);}//small sphere lamp

            default:{return new int[]{5, 100, 0xf3da90};}
        }
    }

    public String[] setParticles(){

        return new String[]{"smoke ,0,-0.7,0.95,0,0,0,0"};

    }

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

    public ModelBase[] getModel(){return new ModelBase[]{new SD402W()};}

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


