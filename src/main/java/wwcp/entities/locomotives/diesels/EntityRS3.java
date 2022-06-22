package wwcp.entities.locomotives.diesels;
//This is a documentation class for copy pasting into a Diesel train class.
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
import net.minecraftforge.fluids.FluidRegistry;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.AmericanTrucks.Type_B;
import wwcp.models.locomotives.diesels.RS3;
import wwcp.models.locomotives.diesels.U33B;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

/**
 * ETERNAL NOTE: anything that applies to GenericRailTransport also applies to EntityTrain core.
 */
public class EntityRS3 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityRS3(null), worldwidecontentpack.MODID,worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */

    public EntityRS3(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityRS3(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.RS3().name; }

    @Override
    public String transportcountry() { return Transport.RS3().country; }

    @Override
    public String transportYear() { return Transport.RS3().year; }

    @Override
    public String transportFuelType() {
        return Transport.RS3().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.RS3().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.RS3().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.RS3().metric_horsepower;
    }
    @Override
    public float weightKg() { return  Transport.RS3().weightinKGs;
    }
    public boolean isReinforced() { return Transport.RS3().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.RS3().additionalTextTitle) + Transport.RS3().additionalText,
                RailUtility.translate(Transport.RS3().additionalTextTitle2) + Transport.RS3().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.RS3().backTopSpeed: Transport.RS3().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_NYC_Lightning_Stripe_N.png",
                "textures/bogies/Type_B_Truck.png",
                "NYC Lightning Stripe", "New York Central Lightning Stripe for Passenger Service");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_Cotton_Belt-Bow_Wave-N.png",
                "textures/bogies/Type_B_Truck.png",
                "SSW Bow Wave", "Cotton Belt Bow Wave, only applied to few select units");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_SSW_Black_Widow.png",
                "textures/bogies/Type_B_Truck.png",
                "SSW Black Widow w/ marslight", "Cotton belt black widow with marslight for passenger service");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_CP_Script.png",
                "textures/bogies/Type_B_Truck.png",
                "CP Maroon Script", "Canadian Pacific Script writing w/ winterization hatch");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_CP_AR.png",
                "textures/bogies/Type_B_Truck.png",
                "CP Action Red", "CP Rail with 5' stripe");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_PRR.png",
                "textures/bogies/Type_B_Truck.png",
                "PRR", "Pennsylvania Railroad with trainphone with Herald");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_SPS.png",
                "textures/bogies/Type_B_Truck.png",
                "SP&S", "Spokane, Portland & Seattle in yellow");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_NP.png",
                "textures/bogies/Type_B_Truck.png",
                "NP", "Northern Pacific");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_RI_P.png",
                "textures/bogies/Type_B_S.png",
                "CRI&P Passenger", "Chicago, Rock Island & Pacific in passenger scheme");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_RI_P_Early.png",
                "textures/bogies/Type_B_S.png",
                "CRI&P Passenger Early", "Chicago, Rock Island & Pacific in early passenger scheme");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/RS3/RS3_RI.png",
                "textures/bogies/Type_B_Truck.png",
                "CRI&P", "Chicago, Rock Island & Pacific in maroon");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:SP&S";
    }

    /**
     * ETERNAL NOTE: though these two methods are marked depreciated, they will be supported long-run
     * the replacement method is
     *     public Bogie[] bogies()
     *     a new bogie is defined like
     *         new Bogie(ModelBase MODEL, float[] OFFSET)
     *         the reason for this new method is so bogies can have their subBogie[] variable set
     *         to add bogies on your bogie that have similar independent rotation-
     *         to the host bogie, as the host bogie has to the train.
     *
     * @return
     */
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new Type_B()}; }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.f,0f,0},{-2.0f,0f,0}};
    }

    @Override
    public float[] bogieLengthFromCenter(){return new float[]{3f,-3f};}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes(){
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }

    //in what units is this?
    //ETERNAL NOTE: millibuckets, so 1000 is a bucket.
    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{1.5f,1.3f, -0.35f}};}


    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{7.4f,2f,1.5f};
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    /**
     * <h2>Smoke offset</h2>
     * @return defines the array of positions in blocks for smoke.
     * the first number in the position defines the X/Z axis, negative values are towards the front of the train.
     * the second number defines the Y position, 0 is the rails, higher values are towards the sky.
     * the third number defines left to right, negative values are towards the right.
     * the forth number defines the grayscale color from 255 (white) to 0 (black)
     * the 5th number is for density, there's no min/max but larger numbers will create more lag.
     */

    /**
     * ETERNAL NOTE
     * getSmokeOffset has been changed to
     *     public int[] getParticleData(int id)
     *     - the id parameter defined the id of the particle defined in the model using methods like
     *     StaticModelAnimator.tagSmoke(int ID)
     *     - the return int[] value defines density, scale in percentage, and color in RGB or RGBA hex.
     *
     *     an example:
     *     public int[] getParticleData(int id){
     *         if(id==TARGET){return new int[]{DENSITY,SCALE,0xRRGGBBAA};}
     *         else {return super.getParticleData(id);}
     *     }
     */


    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0f,-0F,0.F}};}
        
    /**
     * <h2>Fluid Tank Capacity</h2>
     */

    //once more what do the numbers mean
    //ETERNAL NOTE 1000 is a bucket, each number represents a new tank.
    @Override
    public int[] getTankCapacity(){return new int[]{9161};}
    //once more idem dito
    //ETERNAL NOTE RF capacity is being moved to a fluid tank, one redstone has the value of 250.
    //as of writing this the RF tank uses water, but later there will be a redstone dust fluid for it


    public int[] getParticleData(int id) {
        switch (id){
            case 0:{return new int[]{2, 50, 0x555555};}//ALCO smoke
            case 1:{return super.getParticleData(id);}//heavy smoke
            case 2:{return super.getParticleData(id);}//steam
            case 3:{return super.getParticleData(id);}//led lamp
            case 4:{return super.getParticleData(id);}//reverse lamp
            case 5:{return super.getParticleData(id);}//small sphere lamp

            default:{return new int[]{5, 100, 0xf3da90};}
        }
    }

    public String[] setParticles(){

        return new String[]{"smoke ,0,-1.5,0.82,0,0,0,0",};

    }


    public int getRFCapacity() {
        return 1110000;
    }

    /**
     * <h2>fluid filter</h2>
     * defines what fluids can and can't be stored in the tank.
     * for instance if you have a wooden tanker car, you can deny fluids that are fire sources (like lava).
     */

    /**
     * ETERNAL NOTE: tank filters is being moved to a double array
     * the new method is
     *     public String[][] getTankFilters()
     *     for example:
     *     public String[] getTankFilters(int tank){
     *         return new String[][]{{TankOneFilterOne,TankOneFilterTwo}, {TankTwoFilterOne}};
     *     }
     *     filter strings may be the direct name of the fluid, or part of the name, for example
     *     FluidRegistry.WATER.getName() for the entire name, or "water" for part of it.
     *     mind you part names may have conflicts, "water" for example will accept the fluid registry water and
     *     hot spring water from BoP and Distilled Water from IC2 as all three names contain "water".
     *
     */


    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */
    @Override
    public void manageFuel(){
        fuelHandler.manageDiesel(this);
    }


    public Item getItem(){
        return thisItem;
    }

    public ModelBase[] getModel(){return new ModelBase[]{new RS3()};}

    //For sound effects
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}

