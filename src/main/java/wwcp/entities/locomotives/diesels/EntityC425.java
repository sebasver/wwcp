package wwcp.entities.locomotives.diesels;
//This is a documentation class for copy pasting into a Diesel train class.
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.models.Bogie;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.AmericanTrucks.HiAd4Axel;
import wwcp.models.bogies.AmericanTrucks.Type_B;
import wwcp.models.locomotives.diesels.C4245;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

/**
 * ETERNAL NOTE: anything that applies to GenericRailTransport also applies to EntityTrain core.
 */
public class EntityC425 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityC425(null), worldwidecontentpack.MODID,worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */

    public EntityC425(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityC425(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.C425().name; }


    @Override
    public String transportcountry() { return Transport.C425().country; }

    @Override
    public String transportYear() { return Transport.C425().year; }

    @Override
    public String transportFuelType() {
        return Transport.C425().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.C425().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.C425().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.C425().metric_horsepower;
    }
    @Override
    public float weightKg() { return  Transport.C425().weightinKGs;
    }
    public boolean isReinforced() { return Transport.C425().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.C425().additionalTextTitle) + Transport.C425().additionalText,
                RailUtility.translate(Transport.C425().additionalTextTitle2) + Transport.C425().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.C425().backTopSpeed: Transport.C425().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/C4245/C425_BCOL.png",
                "BCOL", "British Columbia Railway two tone green").setBogieTextures(new String[] {"textures/bogies/Type_B_Truck.png", "textures/bogies/Type_B_Truck.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/C4245/C425_SPS.png",
                "SP&S", "Spokane, Portland & Seattle orange").setBogieTextures(new String[] {"textures/bogies/Type_B_Truck.png", "textures/bogies/Type_B_Truck.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/C4245/C425_CNW.png",
                "CNW", "Chicago & Northwestern yellow").setBogieTextures(new String[] {"textures/bogies/Type_B_Truck.png", "textures/bogies/Type_B_Truck.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/C4245/C425_NH.png",
                "NH", "New Haven stripes").setBogieTextures(new String[] {"textures/bogies/Type_B_Truck.png", "textures/bogies/Type_B_Truck.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/C4245/C425_PC.png",
                "PC", "Penn Central Black").setBogieTextures(new String[] {"textures/bogies/Type_B_Truck.png", "textures/bogies/Type_B_Truck.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/C4245/C425_NandW.png",
                "N&W", "Norfolk & Western black").setBogieTextures(new String[] {"textures/bogies/Type_B_Truck.png", "textures/bogies/Type_B_Truck.png"}));

    }

    @Override
    public Bogie[] bogies() {

            return new Bogie[]{
                    new Bogie(new Type_B(), -2.3f, 0f, 0),
                    new Bogie(new Type_B(), 2.3f, 0f, 0)
            };

    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:BCOL";
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
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new HiAd4Axel(), new HiAd4Axel()};
    }

    @Override
    public List<TrainsInMotion.transportTypes> getTypes() {
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }

    //in what units is this?
    //ETERNAL NOTE: millibuckets, so 1000 is a bucket.
    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2.35f,1.4f, -0.3f}};}


    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{7.9f,2f,1.5f};
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
    public int[] getParticleData(int id) {
        switch (id){
            case 0:{return new int[]{1, 60, 0x555555};}//GE smoke
            case 1:{return super.getParticleData(id);}//heavy smoke
            case 2:{return super.getParticleData(id);}//steam
            case 3:{return super.getParticleData(id);}//led lamp
            case 4:{return super.getParticleData(id);}//reverse lamp
            case 5:{return super.getParticleData(id);}//small sphere lamp

            default:{return new int[]{5, 100, 0xf3da90};}
        }
    }

    public String[] setParticles(){

        return new String[]{"smoke ,0,1.25,0.9,0,0,0,0"};

    }
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

    //eeeh what
    //ETERNAL NOTE this returns if the inventory slot will accept an item.
    // slot 400 is the fuel slot. 401 is the second fuel slot if there is one. 402 is the third etc.
    // custom slots with their own slot numbers can be defined in public void initInventorySlots()
    // NOTE 2: when overriding initInventorySlots() be sure to call the super method, also always use numbers over 400
    // to prevent conflicts with other inventory functionality.
    // later on i'll need to implement an easier system for custom inventory slots.

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

    public ModelBase[] getModel(){return new ModelBase[]{new C4245()};}

    //For sound effects
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}

