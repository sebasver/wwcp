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
import wwcp.models.bogies.AmericanTrucks.FM_TypeB;
import wwcp.models.locomotives.diesels.CFA164;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityCFA164 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityCFA164(null), worldwidecontentpack.MODID,worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityCFA164(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityCFA164(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.CFA164().name; }

    @Override
    public String transportcountry() { return Transport.CFA164().country; }

    @Override
    public String transportYear() { return Transport.CFA164().year; }

    @Override
    public String transportFuelType() { return Transport.CFA164().fuel;
    }
    @Override
    public boolean isFictional() { return Transport.CFA164().fictional;
    }
    @Override
    public float transportTractiveEffort() { return Transport.CFA164().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() { return Transport.CFA164().metric_horsepower;
    }
    @Override
    public float weightKg() { return  Transport.CFA164().weightinKGs;
    }

    public boolean isReinforced() { return Transport.CFA164().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.CFA164().additionalTextTitle) + Transport.CFA164().additionalText,
                RailUtility.translate(Transport.CFA164().additionalTextTitle2) + Transport.CFA164().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.CFA164().backTopSpeed: Transport.CFA164().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/CFA164/CFA-16-4_MILW_N.png", "textures/bogies/AmericanTrucks/FM_Type_B.png",
                "MILW Orange", "Milwaukee Road in Freight Orange");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/CFA164/CFA-16-4_CN_Noodle_N.png", "textures/bogies/AmericanTrucks/FM_Type_B.png",
                "CN Noodle", "Canadian National with Noodle logo");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/CFA164/CFA-16-4_CP.png", "textures/bogies/AmericanTrucks/FM_Type_B.png",
                "CP Maroon Script", "Canadian Pacific in Script Lettering");
}

    @Override
    public String getDefaultSkin() {
        return "wwcp:MILW Orange";
    }

    @Override
    public float getMaxFuel(){return 20;}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2.4f, 1.274f, 0.35f}};}

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
    public float[][] bogieModelOffsets(){return new float[][]{{2.3f,0f,0},{-2.05f,0f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new FM_TypeB()}; }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2.05f, -2.3f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.F,0F,0.F}};}

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
            case 0:{return new int[]{1, 45, 0x555555};}//FM smoke
            case 1:{return super.getParticleData(id);}//heavy smoke
            case 2:{return super.getParticleData(id);}//steam
            case 3:{return super.getParticleData(id);}//led lamp
            case 4:{return super.getParticleData(id);}//reverse lamp
            case 5:{return super.getParticleData(id);}//small sphere lamp

            default:{return new int[]{5, 100, 0xf3da90};}
        }
    }

    public String[] setParticles(){

        return new String[]{"smoke ,0,-1.5,0.85,0.2,0,0,0",
                "smoke ,0,-1.5,0.85,-0.2,0,0,0"};

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
    public ModelBase[] getModel(){return new ModelBase[]{new CFA164()};}

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


