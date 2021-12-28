package wwcp.entities.passengerstock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.passengerStock.ClassDonder2;
import wwcp.models.passengerStock.GWR_Toad20;
import wwcp.worldwidecontentpack;

import java.util.UUID;


public class EntityGWR_Toad20 extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")}; //whats with the +4?

    public static final Item thisItem = new WWCPTransport(new EntityGWR_Toad20(null), worldwidecontentpack.MODID , worldwidecontentpack.United_Kingdom);


    public EntityGWR_Toad20(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityGWR_Toad20(World world){
        super(world);
    }

    @Override
    public float[] bogieLengthFromCenter(){return new float[]{2f,-2f};}

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/GWR_Toad20/GWR_Toad20.png",
                "GWR ", "Factory blue version");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.GWR_Toad20().reinforced;
    }

    public float weightKg() {
        return Transport.GWR_Toad20().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.GWR_Toad20().name;
    }

    public String transportcountry() { return Transport.GWR_Toad20().country; }

    public String transportYear() { return Transport.GWR_Toad20().year; }

    public float transportTopSpeed() {
        return Transport.GWR_Toad20().topSpeed;
    }

    public boolean isFictional() {
        return Transport.GWR_Toad20().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.GWR_Toad20().additionalTextTitle) + Transport.GWR_Toad20().additionalText,
                RailUtility.translate(Transport.GWR_Toad20().additionalTextTitle2) + Transport.GWR_Toad20().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.GWR_Toad20().rows;
    }

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{0f,1.2f, 0.3f}};}

    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.70f,2.2f,1.5f};
    }

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0f,-0F,0F}};
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.PASSENGER;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new GWR_Toad20()};}

    @Override
    public Item getItem(){
        return thisItem;
    }
}
