package wwcp.entities.locomotives.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
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
import wwcp.models.bogies.AmericanTrucks.HiAd4Axel;
import wwcp.models.locomotives.diesels.F7A;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityF7A extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityF7A(null), worldwidecontentpack.MODID,worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityF7A(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityF7A(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.F7A().name; }

    @Override
    public String transportcountry() { return Transport.F7A().country; }

    @Override
    public String transportYear() { return Transport.F7A().year; }

    @Override
    public String transportFuelType() { return Transport.F7A().fuel;
    }
    @Override
    public boolean isFictional() { return Transport.F7A().fictional;
    }
    @Override
    public float transportTractiveEffort() { return Transport.F7A().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() { return Transport.F7A().metric_horsepower;
    }
    @Override
    public float weightKg() { return  Transport.F7A().weightinKGs;
    }

    public boolean isReinforced() { return Transport.F7A().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.F7A().additionalTextTitle) + Transport.F7A().additionalText,
                RailUtility.translate(Transport.F7A().additionalTextTitle2) + Transport.F7A().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.F7A().backTopSpeed: Transport.F7A().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/RI_F7A_Yellow_Wings.png",
                "CRI&P Yellow Wings", "Chicago, Rock Island & Pacific railway with yellow wings").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/RI_F7A_Maroon_Short_Stripe.png",
                "CRI&P Short Stripe", "Chicago, Rock Island & Pacific railway with short nose stripe").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/RI_F7A_Maroon_Short_Stripe_Block_Letters.png",
                "CRI&P Short Stripe & Block Letters", "Chicago, Rock Island & Pacific railway with short nose stripe and block letters").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/F7A_SPWidow.png",
                "SP Black Widow", "Southern Pacific black widow scheme").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/F7A_KCSG.png",
                "KCS Ghost", "Kansas City Southern ghost scheme").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/CGW_F7A_Maroon.png",
                "CGW Maroon", "Chicago Great Western railroad in maroon").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/MP_F7A_Jenks_Blue.png",
                "MP Jenks Blue", "Missouri Pacific railway in jenks blue").setBogieTextures(new String[] {"textures/bogies/blombergB_mp.png", "textures/bogies/blombergB_mp.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/TP_F7A_Jenks_Blue.png",
                "T&P Jenks Blue", "Texas & Pacific (in Missouri pacific railway jenks blue)").setBogieTextures(new String[] {"textures/bogies/blombergB_mp.png", "textures/bogies/blombergB_mp.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/F7A_GNS.png",
                "GN", "Great Northern Simplified Empire Builder").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/F7A_BNEarly.png",
                "GN Patched", "Great Northern Patched BN").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/BN_F7A_Cascade_Green.png",
                "BN", "Burlington Northern in cascade green").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/ATSF_Freight_F7.png",
                "ATSF Bluebonnet", "Atchison, Topeka and Santa Fe railway in bluebonnet freight scheme").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/F7A_Amtrak.png",
                "Amtrak", "Amtrak in phase I").setBogieTextures(new String[] {"textures/bogies/blombergB_black.png", "textures/bogies/blombergB_black.png"}));

    }
    
    @Override
    public String getDefaultSkin() {
        return "wwcp:CRI&P Yellow Wings";
    }

    @Override
    public float getMaxFuel(){return 20;}


    @Override
    public List<TrainsInMotion.transportTypes> getTypes() {
        return TrainsInMotion.transportTypes.DIESEL.singleton();
    }



    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-2.1f, 1.35f, -0.2f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{6.6f,2.2f,1.5f};
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
    public float[][] bogieModelOffsets(){return new float[][]{{1.9f,0f,0},{-1.9f,0f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new Blomberg_B(), new Blomberg_B()};
    }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{1.9f, -1.9f};
    }

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

        return new String[]{"smoke ,0,1.5,0.9,0,0,0,0",
                "smoke ,0,0.5,0.9,0,0,0,0"};

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

    public ModelBase[] getModel(){return new ModelBase[]{new F7A()};}

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


