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
import wwcp.models.locomotives.diesels.DSBMzI;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityMZClassOne extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new wwcp.entities.locomotives.diesels.EntityMZClassOne(null), worldwidecontentpack.MODID,worldwidecontentpack.European);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityMZClassOne(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityMZClassOne(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.MZI().name; }

    @Override
    public String transportcountry() { return Transport.MZI().country; }

    @Override
    public String transportYear() { return Transport.MZI().year; }

    @Override
    public String transportFuelType() {
        return Transport.MZI().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.MZI().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.MZI().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.MZI().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.MZI().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.MZI().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.MZI().additionalTextTitle) + Transport.MZI().additionalText,
                RailUtility.translate(Transport.MZI().additionalTextTitle2) + Transport.MZI().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.MZI().backTopSpeed: Transport.MZI().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/MZ/MzI/MzIDSB1990-2020s.png", "textures/bogies/Mz_Bogey.png",
                "DSB Red and Black Livery", "Standard Red and Black livery for the DSB");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/MZ/MzI/MzIDSB1980-1990s.png", "textures/bogies/Mz_Bogey.png",
                "DSB Red and Black Livery 1980", "Standard Red and Black livery for the DSB before the cornered windows were blinded in 1990");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/MZ/MzI/MzIRDK.png", "textures/bogies/Mz_Bogey.png",
                "Railion Livery", "After DSB Gods (DSB Freight/Cargo) was sold to Railion in 2001, all DSB markers were removed from the Locomotives");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/MZ/MzI/MzIWWCP.png", "textures/bogies/Mz_Bogey.png",
                "WWCP Commercial Livery", "Standard Purple Blue livery for WWCP");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/MZ/MzI/3TTMZ1407.png", "textures/bogies/Mz_Bogey.png",
                "TTMZ Skin", "Standard Purple Blue livery for WWCP");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/MZ/MzI/TGOJTMZ1410.png", "textures/bogies/Mz_Bogey.png",
                "TGOJ TMZ 1410", "STT sold number 1410 to TGOJ in 2005, the skin clivery survived over Green Cargo and till NRFAB,until they sold it to BaneNor, and it was reverted back into classic DSB Red/Black");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/MZ/MzI/3TTMZ1409.png", "textures/bogies/Mz_Bogey.png",
                "IGAB livery from when they bough Mz 1409 from DSB, it carried over to 3T or Three T AB", "Standard Purple Blue livery for WWCP");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:DSB Red and Black Livery";
    }

    @Override
    public float getMaxFuel(){return 20;}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes() { return TrainsInMotion.transportTypes.DIESEL.singleton();
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

        return new String[]{"smoke ,0,2,1.15,0,0,0,0"};

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

    public ModelBase[] getModel(){return new ModelBase[]{new DSBMzI()};}

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