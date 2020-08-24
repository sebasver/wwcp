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
import wwcp.models.bogies.Blomberg_B;
import wwcp.models.locomotives.diesels.F7A;
import wwcp.worldwidecontentpack;

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
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/EMD F7 Demo new.png", "textures/bogies/blombergB_silver.png",
                "EMD Demonstrator", "Standard EMD demonstrator scheme");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/MILW F7.png", "textures/bogies/blombergB_black.png",
                "Milwaukee Road Orange", "Milwaukee Road Orange scheme with Black Roof");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/F7_CN.png", "textures/bogies/blombergB_black.png",
                "Canadian National Wet Noodle Scheme", "Red front with wet noodle logo and striped sides");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/F7_CNW.png", "textures/bogies/blombergB_black.png",
                "CNW Yellow/Green", "Classic CNW scheme with green roof and yellow body");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/F7_NYC_CigarBand.png", "textures/bogies/blombergB_black.png",
                "NYC Cigar Band", "New York Central black scheme with cigar band");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/Santa_Fe_F7-A_Bluebonnet.png", "textures/bogies/blombergB_silver.png",
                "Santa Fe Blue Bonnet", "Santa Fe with blue bonnet scheme on nose and silver body");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/Santa_Fe_F7-A_Warbonnet_1_Leslie_A-200.png", "textures/bogies/blombergB_silver.png",
                "Santa Fe War Bonnet 1", "Santa Fe with war bonnet, silver body, A-200");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/Santa_Fe_F7-A_Warbonnet_2_Leslie_S5T.png", "textures/bogies/blombergB_silver.png",
                "Santa Fe War Bonnet 2", "Santa Fe with war bonnet, silver body, S5T");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/Santa_Fe_F7-A_Yellowbonnet_1.png", "textures/bogies/blombergB_silver.png",
                "Santa Fe Yellow Bonnet 1", "Santa Fe with YellowBonnet, 1");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/Santa_Fe_F7-A_Yellowbonnet_2.png", "textures/bogies/blombergB_silver.png",
                "Santa Fe Yellow Bonnet 2", "Santa Fe with YellowBonnet, 2");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/Santa_Fe_F7-A_Yellowbonnet_3.png", "textures/bogies/blombergB_silver.png",
                "Santa Fe Yellow Bonnet 3", "Santa Fe with YellowBonnet, 3");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/Santa_Fe_F7-A_Yellowbonnet_4.png", "textures/bogies/blombergB_silver.png",
                "Santa Fe Yellow Bonnet 4", "Santa Fe with YellowBonnet, 4");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/WWCP_1.png", "textures/bogies/blombergB_silver.png",
                "WWCP 2 Years blue nose", "Fictional WWCP livery");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7A/WWCP_2.png", "textures/bogies/blombergB_silver.png",
                "WWCP 2 Years purple nose", "Fictional WWCP livery");

    }

    @Override
    public float getMaxFuel(){return 20;}


    public TrainsInMotion.transportTypes getType() {return TrainsInMotion.transportTypes.ELECTRIC;
    }



    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.9f, 1.38f, -0.3f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{6.6f,2.2f,1.5f};
    }

    public ItemStack[] getRecipie() {
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
    public float[][] bogieModelOffsets(){return new float[][]{{1.7f,0.1f,0},{-2.05f,0.1f,0}};
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
        return new float[][]{{0.F,-0.05F,0.F}};}

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


