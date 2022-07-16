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
import wwcp.models.bogies.EUBogies.V160Bogie;
import wwcp.models.bogies.EUBogies.V160Bogie2;
import wwcp.models.locomotives.diesels.V160_164;
import wwcp.worldwidecontentpack;

import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityV160 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityV160(null), worldwidecontentpack.MODID,worldwidecontentpack.Germany);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */
    public EntityV160(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityV160(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.V160().name; }

    @Override
    public String transportcountry() { return Transport.V160().country; }

    @Override
    public String transportYear() { return Transport.V160().year; }

    @Override
    public String transportFuelType() {
        return Transport.V160().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.V160().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.V160().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.V160().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.V160().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.V160().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.V160().additionalTextTitle) + Transport.V160().additionalText,
                RailUtility.translate(Transport.V160().additionalTextTitle2) + Transport.V160().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.V160().backTopSpeed: Transport.V160().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/215/BR215AR.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "215 DB Purpurrot", "The V160 was born in the Purpurrot which was first seen on the V200's");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/215/BR215OR.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "215 DB Orientrot", "The Orientrot colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/215/BR215OB.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "215 DB Oceanblau", "The Oceanblau and Beige colors.");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/215/BR215VR.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "215 DB Verkehrsrot", "The last design the 215's got in DBAG");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/215/BR215VRSS.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "215 DB SyltShuttle", "14 locomotives were from 2000 to 2007 used on the Sylt Shuttle trains");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/217/BR217OB.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "217 DB Oceanblau", "The Oceanblau and Beige colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/217/BR217OR.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "217 DB Orientrot", "The Orientrot colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/217/BR217RB.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "217 DB Red Beige", "The Red and Beige colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/217/BR217VR.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "217 DB Verkehrsrot", "The last design the 217's got in DBAG");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218AR1.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "218 V1 DB Purpurrot", "The V160 was born in the Purpurrot which was first seen on the V200's");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218AR2.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "218 V2 DB Purpurrot", "The V160 was born in the Purpurrot which was first seen on the V200's");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218OB1.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "218 V1 DB Oceanblau", "The Oceanblau and Beige colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218OB1P.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "218 V1 Plow DB Oceanblau", "The Oceanblau and Beige colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218OB2.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "218 V2 DB Oceanblau", "The Oceanblau and Beige colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218OB2P.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "218 V2 Plow DB Oceanblau", "The Oceanblau and Beige colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218OR1.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V1 DB Orientrot", "The Orientrot colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218OR1P.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V1 Plow DB Orientrot", "The Orientrot colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218OR2.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V2 DB Orientrot", "The Orientrot colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218OR2P.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V2 Plow DB Orientrot", "The Orientrot colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218RB1.png",
                "textures/bogies/EUBogies/V160/V160BogieGrayBrown.png",
                "218 V1 DB Red Beige", "The Red and Beige colors");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218VR1.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V1 DB Verkehrsrot", "The last design the 218's got in DBAG");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218VR1P.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V1 Plow DB Verkehrsrot", "The last design the 218's got in DBAG");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218VR2.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V2 DB Verkehrsrot", "The last design the 218's got in DBAG");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218VR2P.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V2 Plow DB Verkehrsrot", "The last design the 218's got in DBAG");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218VR1SS.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V1 DB SyltShuttle", "Some of the 218's were carrying SyltShuttle logo");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218VR1PSS.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V1 Plow DB SyltShuttle", "Some of the 218's were carrying SyltShuttle logo");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218VR2SS.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V2 DB SyltShuttle", "Some of the 218's were carrying SyltShuttle logo");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218VR2PSS.png",
                "textures/bogies/EUBogies/V160/V160BogieGray.png",
                "218 V2 Plow DB SyltShuttle", "Some of the 218's were carrying SyltShuttle logo");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/V160/218/BR218DI.png",
                "textures/bogies/EUBogies/V160/V160BogieRedGray.png",
                "218 Märklin & Piko", "Special livery of a collaportation between Märklin and Piko");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:215 DB Purpurrot";
    }

    @Override
    public float getMaxFuel(){return 20;}


    public TrainsInMotion.transportTypes getType() {return TrainsInMotion.transportTypes.DIESEL;
    }



    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-3.15f,1.35f, -0.275f}};}

    @Override
    public float[] getHitboxSize() {
        return new float[]{7.5f,2.5f,1.5f};
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
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.25f, 0f, 0}, {-2.25f, 0f, 0}};
    }
    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new V160Bogie(), new V160Bogie2()};
    }

    @Override
    public float[] bogieLengthFromCenter(){return new float[]{2.25f,-2.25f};}

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.0f,-0.0F,0.F}};}

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

    public ModelBase[] getModel(){return new ModelBase[]{new V160_164()};}

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


