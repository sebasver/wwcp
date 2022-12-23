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
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.AmericanTrucks.FlexicoilC1;
import wwcp.models.bogies.AmericanTrucks.FlexicoilC2;
import wwcp.models.locomotives.diesels.SD45;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntitySD45 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntitySD45(null), worldwidecontentpack.MODID,worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntitySD45(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntitySD45(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.SD45().name; }

    @Override
    public String transportcountry() { return Transport.SD45().country; }

    @Override
    public String transportYear() { return Transport.SD45().year; }

    @Override
    public String transportFuelType() { return Transport.SD45().fuel;
    }
    @Override
    public boolean isFictional() { return Transport.SD45().fictional;
    }
    @Override
    public float transportTractiveEffort() { return Transport.SD45().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() { return Transport.SD45().metric_horsepower;
    }
    @Override
    public float weightKg() { return  Transport.SD45().weightinKGs;
    }

    public boolean isReinforced() { return Transport.SD45().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.SD45().additionalTextTitle) + Transport.SD45().additionalText,
                RailUtility.translate(Transport.SD45().additionalTextTitle2) + Transport.SD45().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.SD45().backTopSpeed: Transport.SD45().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD45/SD45_SP.png", "textures/bogies/AmericanTrucks/Flexicoil_C1_SP.png",
                "SP", "Southern Pacific Bloody Nose");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD45/SD45_SP_Elephant.png", "textures/bogies/AmericanTrucks/Flexicoil_C1_SP.png",
                "SP Ears", "Southern Pacific Bloody Nose with emd tunnel motor ears, 3 produced");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD45/SD45R_SP.png", "textures/bogies/AmericanTrucks/Flexicoil_C1_SP.png",
                "SP Rebuilt", "Southern Pacific Bloody Nose Rebuilt w/o L window and w/ rear mars light configuration");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD45/SD45_DRGW_Early.png", "textures/bogies/AmericanTrucks/Flexicoil_C1_Black.png",
                "D&RGW Early", "Denver & Rio Grande Western Early");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD45/SD45_DRGW_Late.png", "textures/bogies/AmericanTrucks/Flexicoil_C1_Black.png",
                "D&RGW Late", "Denver & Rio Grande Western w/ speed lettering");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD45/SD45_MILW_Early.png", "textures/bogies/AmericanTrucks/Flexicoil_C1_Black.png",
                "MILW Early", "Milwaukee Road in early scheme w/o lettering");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD45/SD45_CBQ.png", "textures/bogies/AmericanTrucks/Flexicoil_C1_Black.png",
                "CB&Q", "Chicago, Burlington & Quincy in burlington green");
            }

    @Override
    public String getDefaultSkin() {
        return "wwcp:SP";
    }

    @Override
    public float getMaxFuel(){return 20;}


    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2.9f, 1.30f, -0.3f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{8.6f,2.25f,1.5f};
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
    public float[][] bogieModelOffsets(){return new float[][]{{2.6f,0f,0},{-2.5f,0f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new FlexicoilC1()}; }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2.6f, -2.5f};
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

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */

    public void manageFuel() {
        this.fuelHandler.manageDiesel(this);
    }

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

        return new String[]{"smoke ,0,-0.9,0.95,0,0,0,0"};

    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }

    public ModelBase[] getModel(){return new ModelBase[]{new SD45()};}

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


