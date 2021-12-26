package wwcp.entities.locomotives.electrics;//This is a documentation class for copy pasting into an electric train class.


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
import wwcp.models.bogies.AmericanTrucks.SteepleCabTrucks;
import wwcp.models.bogies.EUBogies.flexxpower;
import wwcp.models.locomotives.electrics.F140MS2;
import wwcp.models.locomotives.electrics.SteepleCab;
import wwcp.worldwidecontentpack;

import java.util.UUID;


// XXXX
// YYYY
// ZZZZ
// QQQQ

public class EntitySteepleCab extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntitySteepleCab(null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     *
     * @see EntityTrainCore
     */
    public EntitySteepleCab(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntitySteepleCab(World world) {
        super(world);
    }

    @Override
    public String transportName() {
        return Transport.SteepleCab().name;
    }

    @Override
    public String transportcountry() {
        return Transport.SteepleCab().country;
    }

    @Override
    public String transportYear() {
        return Transport.SteepleCab().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.SteepleCab().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.SteepleCab().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.SteepleCab().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.SteepleCab().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.SteepleCab().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.SteepleCab().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.SteepleCab().additionalTextTitle) + Transport.SteepleCab().additionalText,
                    RailUtility.translate(Transport.SteepleCab().additionalTextTitle2) + Transport.SteepleCab().additionalText2};
        }
    }

    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 180.0f, 0.0f}};}

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.SteepleCab().backTopSpeed : Transport.SteepleCab().topSpeed;
    }

    @Override
    //todo Needs an SBB RE 484 skin before final implementation, remove other skins
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/Steeplecab/YVTSteeplecab.png",
                "textures/locomotive/Electric/Steeplecab/SteeplecabTrucks.png",
                "Belgian Theme Skin",
                "Used by the NMBS/SNCB in belgium for freight trains");
    }

    @Override
    public float getMaxFuel() {
        return 20;
    }

    //    @Override
    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.ELECTRIC;
    }

    @Override
    public float[][] getRiderOffsets() {
        return new float[][]{{-3.82f, 1.3f, -0.25f}};
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{5f, 2.5f, 1.5f};
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
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.25f, 0.05f, 0}, {-1.25f, 0.05f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new SteepleCabTrucks()};
    }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2, -2};
    }

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f, 0.0F, 0.F}};
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
        return new int[]{9161, 800};
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        switch (slot) {
            case 400: {
                return stack != null && stack.getItem() == Items.redstone;
            }
            default: {
                return true;
            }
        }
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
        return new ModelBase[]{new SteepleCab()};
    }

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn() {
        return URIRegistry.SOUND_HORN.getResource("xxxxxxx.ogg");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound() {
        return URIRegistry.SOUND_RUNNING.getResource("xxxxxxx.ogg");
    }
}


