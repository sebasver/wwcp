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
import wwcp.models.bogies.Class87Bogie;
import wwcp.models.bogies.EUBogies.flexxpower;
import wwcp.models.locomotives.electrics.Traxx2ndGen;
import wwcp.worldwidecontentpack;

import java.util.UUID;


// XXXX
// YYYY
// ZZZZ
// QQQQ

public class EntityClass87 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityClass87(null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     *
     * @see EntityTrainCore
     */
    public EntityClass87(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityClass87(World world) {
        super(world);
    }

    @Override
    public String transportName() {
        return Transport.Class87().name;
    }

    @Override
    public String transportcountry() {
        return Transport.Class87().country;
    }

    @Override
    public String transportYear() {
        return Transport.Class87().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.Class87().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.Class87().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.Class87().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.Class87().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.Class87().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.Class87().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.Class87().additionalTextTitle) + Transport.Class87().additionalText,
                    RailUtility.translate(Transport.Class87().additionalTextTitle2) + Transport.Class87().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.Class87().backTopSpeed : Transport.Class87().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/Class87/Class_87_BR_Blue.png",
                "textures/locomotive/Electric/Class87/Class_87_Bogies.png",
                "BR Blue", "Blue");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/Class87/Class_87_First.png",
                "textures/locomotive/Electric/Class87/Class_87_Bogies.png",
                "BR 2", "Blue");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/Class87/Class_87_ICE.png",
                "textures/locomotive/Electric/Class87/Class_87_Bogies.png",
                "BR 3", "Blue");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/Class87/Class_87_ICS.png",
                "textures/locomotive/Electric/Class87/Class_87_Bogies.png",
                "BR 4", "Blue");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/Class87/Class_87_Virgin.png",
                "textures/locomotive/Electric/Class87/Class_87_Bogies.png",
                "BR 5", "Blue");
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
        return new float[][]{{-3.6f, 1.25f, -0.25f},{3.6f, 1.25f, 0.25f}};
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{9.075f, 2.5f, 1.5f};
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
        return new float[][]{{2.45f, 0f, 0}, {-2.55f, 0f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new Class87Bogie()};
    }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2.45f, -2.55f};
    }

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f, -0.05F, 0.F}};
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
        return new ModelBase[]{new Traxx2ndGen()};
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


