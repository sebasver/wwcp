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
import wwcp.models.bogies.EUBogies.flexxpower;
import wwcp.models.locomotives.electrics.Traxx2ndGen;
import wwcp.worldwidecontentpack;

import java.util.UUID;


// XXXX
// YYYY
// ZZZZ
// QQQQ

public class EntityTraxxF140MS2E extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityTraxxF140MS2E(null), worldwidecontentpack.MODID, worldwidecontentpack.European);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     *
     * @see EntityTrainCore
     */
    public EntityTraxxF140MS2E(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityTraxxF140MS2E(World world) {
        super(world);
    }

    @Override
    public String transportName() {
        return Transport.F140MS2E().name;
    }

    @Override
    public String transportcountry() {
        return Transport.F140MS2E().country;
    }

    @Override
    public String transportYear() {
        return Transport.F140MS2E().year;
    }

    @Override
    public String transportFuelType() {
        return Transport.F140MS2E().fuel;
    }

    @Override
    public boolean isFictional() {
        return Transport.F140MS2E().fictional;
    }

    @Override
    public float transportTractiveEffort() {
        return Transport.F140MS2E().tractive_effort;
    }

    @Override
    public float transportMetricHorsePower() {
        return Transport.F140MS2E().metric_horsepower;
    }

    @Override
    public float weightKg() {
        return Transport.F140MS2E().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.F140MS2E().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.F140MS2E().additionalTextTitle) + Transport.F140MS2E().additionalText,
                    RailUtility.translate(Transport.F140MS2E().additionalTextTitle2) + Transport.F140MS2E().additionalText2};
        }
    }

    @Override
    public float transportTopSpeed() {
        return accelerator < 0 ? Transport.F140MS2E().backTopSpeed : Transport.F140MS2E().topSpeed;
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT1.png", "textures/bogies/Flexxpower.png",
                "Belgian Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT2.png", "textures/bogies/Flexxpower.png",
                "NS Livery", "Used by the NS in their regular service");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT3.png", "textures/bogies/Flexxpower.png",
                "Polish Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT4.png", "textures/bogies/Flexxpower.png",
                "Easter Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT5.png", "textures/bogies/Flexxpower.png",
                "Silesian Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT6.png", "textures/bogies/Flexxpower.png",
                "HLE28 NMBS Cargo", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT7.png", "textures/bogies/Flexxpower.png",
                "Valentines Day Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT8.png", "textures/bogies/Flexxpower.png",
                "WWCP Commercial Livery", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT9.png", "textures/bogies/Flexxpower.png",
                "StPatricks Day Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT10.png", "textures/bogies/Flexxpower.png",
                "Halloween Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT11.png", "textures/bogies/Flexxpower.png",
                "New Years Skin", "Special New Years skin to celebrate 2020");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT12.png", "textures/bogies/Flexxpower.png",
                "Metronom", "Special New Years skin to celebrate 2020");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT13.png", "textures/bogies/Flexxpower.png",
                "Railpool", "Special New Years skin to celebrate 2020");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT14.png", "textures/bogies/Flexxpower.png",
                "DB", "Special New Years skin to celebrate 2020");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT15.png", "textures/bogies/Flexxpower.png",
                "RER", "Special New Years skin to celebrate 2020");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT16.png", "textures/bogies/Flexxpower.png",
                "WWCP 2 Years", "Special New Years skin to celebrate 2020");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2E/TraxxT17.png", "textures/bogies/Flexxpower.png",
                "Chemoil SBB", "Special New Years skin to celebrate 2020");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:HLE28 NMBS Cargo";
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
        return new ModelBase[]{new flexxpower()};
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


