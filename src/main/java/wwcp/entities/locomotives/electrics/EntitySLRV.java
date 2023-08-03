package wwcp.entities.locomotives.electrics;//This is a documentation class for copy pasting into an electric train class.


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
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.Sys;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.AmericanTrucks.SLRV_Bogey;
import wwcp.models.bogies.AmericanTrucks.SLRV_Bogey2;
import wwcp.models.locomotives.electrics.SLRV;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;


// XXXX
// YYYY
// ZZZZ
// QQQQ

public class EntitySLRV extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntitySLRV(null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     *
     * @see EntityTrainCore
     */
    public EntitySLRV(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntitySLRV(World world) {
        super(world);
    }

    @Override
    public String transportName() {
        return Transport.SLRV().name;
    }

    @Override
    public String transportcountry() {
        return Transport.SLRV().country;
    }

    @Override
    public String transportYear() {
        return Transport.SLRV().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.SLRV().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.SLRV().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.SLRV().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.SLRV().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.SLRV().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.SLRV().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.SLRV().additionalTextTitle) + Transport.SLRV().additionalText,
                    RailUtility.translate(Transport.SLRV().additionalTextTitle2) + Transport.SLRV().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.SLRV().backTopSpeed : Transport.SLRV().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_BBlue.png",
                "SLRV B Blue", "Blue rollsign B car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_BGreen.png",
                "SLRV B Green", "Green rollsign B car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_BOrange.png",
                "SLRV B Orange", "Orange rollsign B car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_BRed.png",
                "SLRV B Red", "Red rollsign B car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_BWhite.png",
                "SLRV B White", "White rollsign B car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey.png", "textures/bogies/AmericanTrucks/SLRV_Bogey.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_ABlue.png",
                "SLRV A Blue", "Blue rollsign A car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey.png", "textures/bogies/AmericanTrucks/SLRV_Bogey2.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_AGreen.png",
                "SLRV A Green", "Green rollsign A car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey.png", "textures/bogies/AmericanTrucks/SLRV_Bogey2.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_AOrange.png",
                "SLRV A Orange", "Orange rollsign A car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey.png", "textures/bogies/AmericanTrucks/SLRV_Bogey2.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_ARed.png",
                "SLRV A Red", "Red rollsign A car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey.png", "textures/bogies/AmericanTrucks/SLRV_Bogey2.png"}));
        SkinRegistry.addSkin(this.getClass(), new TransportSkin(worldwidecontentpack.MODID, "textures/locomotive/Electric/SLRV/SLRV_AWhite.png",
                "SLRV A White", "White rollsign A car").setBogieTextures(new String[] {"textures/bogies/AmericanTrucks/SLRV_Bogey.png", "textures/bogies/AmericanTrucks/SLRV_Bogey2.png"}));


    }

    @Override
    public Bogie[] bogies() {
        if(getCurrentSkin().name.equals("SLRV A Blue")||getCurrentSkin().name.equals("SLRV A Green")||getCurrentSkin().name.equals("SLRV A Orange")||getCurrentSkin().name.equals("SLRV A Red")||getCurrentSkin().name.equals("SLRV A White")) {
            return new Bogie[]{
                    new Bogie(new SLRV_Bogey(), -1.0f, 0f, 0),
                    new Bogie(new SLRV_Bogey2(), 2.85f, 0f, 0)
            };
        } else {
            return new Bogie[]{
                    new Bogie(new SLRV_Bogey(), -1.0f, 0f, 0),
                    new Bogie(new SLRV_Bogey(), 2.85f, 0f, 0)
            };
        }
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:SLRV B Blue";
    }

    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 0.0f, 0.0f}};}

    @Override
    public float getMaxFuel() {
        return 20;
    }

    @Override
    public List<TrainsInMotion.transportTypes> getTypes() {
        return TrainsInMotion.transportTypes.ELECTRIC.singleton();
    }

    @Override
    public float[][] getRiderOffsets() {
        return new float[][]{{-2.3f, 0.75f, -0.0f},{1.5f, 0.75f, 0.25f}};
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{5.85f, 1.75f, 1.5f};
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
     *
     * @return defines the positions for the hitboxes in blocks. 0 being the center, negative values being towards the front. the first and last values define the positions of the couplers
     */

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new SLRV_Bogey(), new SLRV_Bogey2()};
    }

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f, 0F, 0.F}};
    }

    /**
     * <h2>rider sit or stand</h2>
     *
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit() {
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
    public int[] getTankCapacity() {
        return new int[]{9161};
    }

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
    public Item getItem() {
        return thisItem;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new SLRV()};
    }

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn() {
        return new ResourceLocation(worldwidecontentpack.MODID,"sounds/horns/SLRV_Horn.ogg");
    }
    public float getHornVolume(){return 1.0f;}
    public float getHornPitch(){return 1.0f;}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound() {
        return URIRegistry.SOUND_RUNNING.getResource("xxxxxxx.ogg");
    }
}


