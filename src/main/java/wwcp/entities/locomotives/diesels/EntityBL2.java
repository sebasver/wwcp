package wwcp.entities.locomotives.diesels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
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
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.AmericanTrucks.Blomberg_B;
import wwcp.models.locomotives.diesels.BL2;
import wwcp.worldwidecontentpack;

import java.util.UUID;


// XXXX -> Entity Name
// MZI -> Data for SuperStat
// ZZZZ -> Country for tab
// QQQQ -> Bogies

public class EntityBL2 extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntityBL2(null), worldwidecontentpack.MODID,worldwidecontentpack.America);

    public EntityBL2(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityBL2(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.BL2().name; }

    @Override
    public String transportcountry() { return Transport.BL2().country; }

    @Override
    public String transportYear() { return Transport.BL2().year; }

    @Override
    public String transportFuelType() { return Transport.BL2().fuel;
    }
    @Override
    public boolean isFictional() { return Transport.BL2().fictional;
    }
    @Override
    public float transportTractiveEffort() { return Transport.BL2().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() { return Transport.BL2().metric_horsepower;
    }
    @Override
    public float weightKg() { return  Transport.BL2().weightinKGs;
    }

    public boolean isReinforced() { return Transport.BL2().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.BL2().additionalTextTitle) + Transport.BL2().additionalText,
                RailUtility.translate(Transport.BL2().additionalTextTitle2) + Transport.BL2().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.BL2().backTopSpeed: Transport.BL2().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/BL2/BL2.png",
                "textures/bogies/blombergB_silver.png",
                "BL2", "Standard EMD demonstrator scheme");

        //todo fix above entry.
    }
    
    /*@Override
    public String getDefaultSkin() {
        return "wwcp:EMD Demonstrator";
    }*/

    @Override
    public float getMaxFuel(){return 20;}


    public TrainsInMotion.transportTypes getType() {return TrainsInMotion.transportTypes.ELECTRIC;
    }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-1.9f, 1.45f, -0.3f}};}

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

    @Override
    public float[][] bogieModelOffsets(){return new float[][]{{2.35f,0f,0},{-2.3f,0f,0}};
    }
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new Blomberg_B()}; }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2.25f, -2.05f};
    }

    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.F,0.05F,0.F}};}

    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    //@Override
    public int[] getTankCapacity(){return new int[]{9161, 800};}

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        switch (slot){
            case 400:{return stack!=null && stack.getItem() ==Items.redstone;}
            default:{return true;}
        }}

    public void manageFuel() {
        this.fuelHandler.manageElectric(this);
    }

    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 180.0f, 0.0f}};}

    public Item getItem(){
        return thisItem;
    }

    public ModelBase[] getModel(){return new ModelBase[]{new BL2()};}

    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("xxxxxxx.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("xxxxxxx.ogg");}
}


