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
import wwcp.models.locomotives.diesels.GP7;
import wwcp.worldwidecontentpack;

import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityGP7 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityGP7(null), worldwidecontentpack.MODID,worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityGP7(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityGP7(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.GP7().name; }

    @Override
    public String transportcountry() { return Transport.GP7().country; }

    @Override
    public String transportYear() { return Transport.GP7().year; }

    @Override
    public String transportFuelType() { return Transport.GP7().fuel;
    }
    @Override
    public boolean isFictional() { return Transport.GP7().fictional;
    }
    @Override
    public float transportTractiveEffort() { return Transport.GP7().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() { return Transport.GP7().metric_horsepower;
    }
    @Override
    public float weightKg() { return  Transport.GP7().weightinKGs;
    }

    public boolean isReinforced() { return Transport.GP7().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.GP7().additionalTextTitle) + Transport.GP7().additionalText,
                RailUtility.translate(Transport.GP7().additionalTextTitle2) + Transport.GP7().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.GP7().backTopSpeed: Transport.GP7().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_BRC-2_N.png", "textures/bogies/blombergB_black.png",
                "BRC", "Belt Railway of Chicago scheme");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_Highood_Algoma_Central_No.png", "textures/bogies/blombergB_black.png",
                "Algoma Central", "Algoma Central classic road diesel scheme");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_Highood_BN_No.png", "textures/bogies/blombergB_black.png",
                "Burlington Northern", "Burlington Northern with beacon & tanks");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_Highood_CN_Black_No.png", "textures/bogies/blombergB_black.png",
                "CN Noodle", "Canadian National with CN noodle logo on the side");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_Highood_CP_Action_Red_N.png", "textures/bogies/blombergB_black.png",
                "CP Rail 8'inch Stripe", "CP Rail Action Red with 8'inch stripe");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_Highood_Mopac_White_No.png", "textures/bogies/blombergB_black.png",
                "Mopac Grey & Blue", "Mopac grey & blue, sued for passenger service");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_Highood_NYC_Lightning_Stripe_No.png", "textures/bogies/blombergB_black.png",
                "NYC Lightning Stripe", "New York Central lightning stripe, used for passenger");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_Highood_PRR_No.png", "textures/bogies/blombergB_black.png",
                "PRR Early", "Pennsylvania railroad in early black scheme");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_Highood_SLSF_Orange_N.png", "textures/bogies/blombergB_black.png",
                "SLSF Orange", "Frisco in orange & white");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_Highood_THB_No.png", "textures/bogies/blombergB_black.png",
                "TH&B", "Toronto, Hamilton & Buffalo maroon & cream");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/GP7/GP7_WP_Green.png", "textures/bogies/blombergB_black.png",
                "WP Green", "Western Pacific in Green");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:WP Green";
    }

    @Override
    public float getMaxFuel(){return 20;}


    public TrainsInMotion.transportTypes getType() {return TrainsInMotion.transportTypes.DIESEL;
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

    public ModelBase[] getModel(){return new ModelBase[]{new GP7()};}

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


