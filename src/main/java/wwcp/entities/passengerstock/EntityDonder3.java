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
import wwcp.entities.TransportDetails;
import wwcp.entities.WWCPTransport;
import wwcp.models.passengerStock.ClassDonder3;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityDonder3 extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") + ": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") + ": 4 " + StatCollector.translateToLocal("menu.item.players")}; //whats with the +4?

    public static final Item thisItem = new WWCPTransport(new EntityDonder3(null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);


    public EntityDonder3(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityDonder3(World world) {
        super(world);
    }

    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{2.5f, -2.5f};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/DonderBushe/R2.png", "Red Donnerbüsche ", "Factory red version");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/DonderBushe/G2.png", "Green Donnerbüsche ", "Factory green version");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/DonderBushe/B2.png", "Blue Donnerbüsche ", "Factory blue version");
    }
    //How to add in more skins Just recopy skinregistry?
    //ETERNAL NOTE yeah, you just do SkinRegistry.addSkin over and over for all the skins you want.
    //this method is just for organization/simplicity.
    //they dont even need to be in this method, you can do them at any time after the entity has been reigstered.
    // the PostInit method for one example.

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return TransportDetails.Donderbus2().reinforced;
    }

    public float weightKg() {
        return TransportDetails.Donderbus2().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return TransportDetails.Donderbus2().name;
    }

    public String transportcountry() { return TransportDetails.Donderbus2().country; }

    public String transportYear() { return TransportDetails.Donderbus2().year; }

    public float transportTopSpeed() {
        return TransportDetails.Donderbus2().topSpeed;
    }

    public boolean isFictional() {
        return TransportDetails.Donderbus2().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(TransportDetails.Donderbus2().additionalTextTitle) + TransportDetails.Donderbus2().additionalText,
                RailUtility.translate(TransportDetails.Donderbus2().additionalTextTitle2) + TransportDetails.Donderbus2().additionalText2};}
    }
    public int getInventoryRows() {
        return TransportDetails.Donderbus2().rows;
    }

    @Override
    public float[][] getRiderOffsets() {
        return new float[][]{{0f, 1.2f, 0.3f}};
    }

    @Override
    public boolean shouldRiderSit() {
        return true;
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{4.70f, 2.2f, 1.5f};
    }


    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
        public float[][] modelOffsets() {
            return new float[][]{{-0f,-0.05F,0.F}};
        }


    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.PASSENGER;
    }

    /**
     * ETERNAL NOTE
     * this method was updated to an array so you can return multiple types and us the functionality of all.
     * for example a steam train that also takes passengers like a tram.
     * public TrainsInMotion.transportTypes[] getTypes(){
     * List<TrainsInMotion.transportTypes> list = new ArrayList<>();
     * list.add(TrainsInMotion.transportTypes.PASSENGER);
     * list.add(TrainsInMotion.transportTypes.STEAM);
     * return list;
     * }
     * an additional method has been added to the transportTypes enum, this is called singleton.
     * (in reference to the Collections.SingletonList(Object) method.)
     * use this for simplifying returning only one type
     * example:
     * public TrainsInMotion.transportTypes[] getTypes(){return TrainsInMotion.transportTypes.PASSENGER.singleton();}
     */

    //can use future tim crafting items how?

    /**
     * ETERNAL NOTE
     * the DefineStack method is just a simpler way to do
     * new ItemStack(ITEM, STACKSIZE)
     * both are valid.
     * Additionally you can specify more than just the stack size.
     * you can also define NBT and other values in the stack, if you wanna get complex. for example
     * ItemStack topleft =new ItemStack(Items.Planks,1);
     * topleft.setItemDamage(3);
     * return new ItemStack[]{
     * topleft,null, null,
     * null, null, null,
     * null, null, null
     * };
     * The order is from Top Left to Bottom Right on a vanilla crafting grid.
     * Later on TiM will have a CraftingItems class that contains each of the crafting items you'd expect from TC.
     * Like the wooden cabin. Alongside new items to match newer materials.
     */

    @Override
    public ModelBase[] getModel() {
        return new ModelBase[]{new ClassDonder3()};
    }

    @Override
    public Item getItem() {
        return thisItem;
    }
}
