package wwcp.entities.locomotives.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidContainerRegistry;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.locomotives.diesels.DSBMK;
import wwcp.worldwidecontentpack;

import java.util.UUID;


public class EntityClassMK extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityClassMK(null), worldwidecontentpack.MODID,worldwidecontentpack.European);

    public EntityClassMK(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityClassMK(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.ClassMK().name; }

    @Override
    public String transportcountry() { return Transport.ClassMK().country; }

    @Override
    public String transportYear() { return Transport.ClassMK().year; }

    @Override
    public String transportFuelType() {
        return Transport.ClassMK().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.ClassMK().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.ClassMK().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.ClassMK().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.ClassMK().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.ClassMK().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.ClassMK().additionalTextTitle) + Transport.ClassMK().additionalText,
                RailUtility.translate(Transport.ClassMK().additionalTextTitle2) + Transport.ClassMK().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.ClassMK().backTopSpeed: Transport.ClassMK().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/MKYellowDSB.png",
                "DSB Gods Yellow", "As the Class MK was new to DSB, they used a new design over the usual Red/Black which the predecessors Class MH and MT got.");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/MKYellowDSB625.png",
                "DSB MK 625 Yellow", "Used for shunting coaches, number 625 had shortly after the writing 'gods' removed");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/MKYellowDB.png",
                "DB Scandinavia Class MK", "After Railion's purchase of the DSB Gods division, most of the Class MKs were followed. Today they are still seen in Yellow with DB logo on it");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/MKDBRed.png",
                "DB Scandinavia Class MK Red", "Number 621 is the only Class MK to be repainted from Yellow to Verkehrsrot");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/MWBG322.png",
                "MWB V601", "DSBs first Class MK were sold in 2002 to Mittelweserbah as V601");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/VFSTG322.png",
                "Siemens prototype nr 350 001-2", "Siemens first prototype of the Class MK, later owned by Vossloh and today owned by Northrail GmbH");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/NRail322.png",
                "Northrail G322", "Almost all of Northrail's G322's are former Class MKs");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/VSFTG400B.png",
                "Vossloh G400B", "Almost identical to the 322s, the 400Bs were sold to Ned Train (Nederlandske Spoorwegen)");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/NTG400B.png",
                "Ned Train G400B", "Like DSBs MK 625, the NT 400Bs were used to shunt passenger stock");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/NSG400B.png",
                "Nederlandske Spoorwegen G400B", "During the transfer into NS, some of the G400Bs were carried over to NS, while others were sold to Northrail GmbH");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/G322-400B/NRail400B.png",
                "Northrail G400B", "The 400Bs in Northrail can easily be confused with their G322s");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:DSB Gods Yellow";
    }

    @Override
    public int getInventoryRows(){return 1;}

    public TrainsInMotion.transportTypes getType(){return TrainsInMotion.transportTypes.DIESEL;}

    @Override
    public float getMaxFuel(){return 5000;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0.6f,1.45f,-0.35f}};}
    @Override
    public float[] getHitboxSize() {
        return new float[]{4.3f,2.2f,1.5f};
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{0.8955f, -0.9255f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.0f,-0.0F,0F}};}

    /**
     * <h2>rider sit or stand</h2>
     * @return true if the rider(s) should be sitting, false if the rider should be standing.
     */
    @Override
    public boolean shouldRiderSit(){
        return false;
    }

    /**
     * <h2>Fluid Tank Capacity</h2>
     */
    //@Override
    public int[] getTankCapacity(){return new int[]{9161, 800};}

    /**
     * <h2>fluid filter</h2>
     * defines what fluids can and can't be stored in the tank.
     * for instance if you have a wooden tanker car, you can deny fluids that are fire sources (like lava).
     */


    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return TileEntityFurnace.getItemBurnTime(stack)>0;}
            case 401:{return FluidContainerRegistry.getFluidForFilledItem(stack)!=null && canFill(null, FluidContainerRegistry.getFluidForFilledItem(stack).getFluid());}
            default:{return true;}
        }
    }

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */
    @Override
    public void manageFuel(){
        fuelHandler.manageDiesel(this);
    }

    /**
     * <h2>pre-assigned values</h2>
     * These return values are defined from the top of the class.
     * These should only need modification for advanced users, and even that's a stretch.
     */
    public Item getItem(){
        return thisItem;
    }

    public ModelBase[] getModel(){return new ModelBase[]{new DSBMK()};}

    /**
     * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
     */

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}
