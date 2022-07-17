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
import wwcp.models.bogies.AmericanTrucks.Blomberg_B;
import wwcp.models.locomotives.diesels.GP7RRI;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityGP7RRI extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityGP7RRI(null), worldwidecontentpack.MODID,worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityGP7RRI(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityGP7RRI(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.GP7RRI().name; }

    @Override
    public String transportcountry() { return Transport.GP7RRI().country; }

    @Override
    public String transportYear() { return Transport.GP7RRI().year; }

    @Override
    public String transportFuelType() { return Transport.GP7RRI().fuel;
    }
    @Override
    public boolean isFictional() { return Transport.GP7RRI().fictional;
    }
    @Override
    public float transportTractiveEffort() { return Transport.GP7RRI().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() { return Transport.GP7RRI().metric_horsepower;
    }
    @Override
    public float weightKg() { return  Transport.GP7RRI().weightinKGs;
    }

    public boolean isReinforced() { return Transport.GP7RRI().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.GP7RRI().additionalTextTitle) + Transport.GP7RRI().additionalText,
                RailUtility.translate(Transport.GP7RRI().additionalTextTitle2) + Transport.GP7RRI().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.GP7RRI().backTopSpeed: Transport.GP7RRI().topSpeed;}

    @Override
    public void registerSkins(){

        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7RRI/GP7R_RI_Blue.png", "textures/bogies/blombergB_black.png",
                "CRI&P Blue", "Chicago, Rock island & Pacific, in blue");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7RRI/GP7R_RI.png", "textures/bogies/blombergB_silver.png",
                "CRI&P Maroon", "Chicago, Rock island & Pacific, in maroon");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7RRI/GP7R_RI_L.png", "textures/bogies/blombergB_silver.png",
                "CRI&P Maroon w/ Lettering", "Chicago, Rock island & Pacific, in maroon with side lettering");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7RRI/GP7R_RI_Early.png", "textures/bogies/blombergB_silver.png",
                "CRI&P Early Red", "Chicago, Rock island & Pacific, in early red");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7RRI/GP7R_RI_Early_Stripped.png", "textures/bogies/blombergB_silver.png",
                "CRI&P Early Red, Stripped", "Chicago, Rock island & Pacific, in early red, stripped & side lettering");
    }

    @Override
    public String getDefaultSkin() { return "wwcp:CRI&P Maroon w/ Lettering";
    }

    @Override
    public float getMaxFuel(){return 20;}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.5f, 1.250f, 0.4f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{7.3f,2.2f,1.5f};
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
    public float[][] bogieModelOffsets(){return new float[][]{{2.05f,0f,0},{-2.05f,0f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new Blomberg_B()}; }

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
        return new float[][]{{0.0f,-0F,0.F}};}

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
            case 0:{return new int[]{1, 40, 0x6a6a6a};}//EMD smoke
            case 1:{return super.getParticleData(id);}//heavy smoke
            case 2:{return super.getParticleData(id);}//steam
            case 3:{return super.getParticleData(id);}//led lamp
            case 4:{return super.getParticleData(id);}//reverse lamp
            case 5:{return super.getParticleData(id);}//small sphere lamp

            default:{return new int[]{5, 100, 0xf3da90};}
        }
    }

    public String[] setParticles(){

        return new String[]{"smoke ,0,-1.35,0.95,0,0,0,0",
                "smoke ,0,-0.3,0.95,0,0,0,0"};

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

    public ModelBase[] getModel(){return new ModelBase[]{new GP7RRI()};}

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


