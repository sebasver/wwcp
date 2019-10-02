package wwcp.entities.rollingstock;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.models.rollingstock.ClassDonder2;
import wwcp.worldwidecontentpack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityDonder2 extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")}; //whats with the +4?

    public static final Item thisItem = new ItemTransport(new EntityDonder2(null), worldwidecontentpack.MODID , worldwidecontentpack.European);


    public EntityDonder2(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityDonder2(World world){
        super(world);
    }

    @Override
    public float[] bogieLengthFromCenter(){return new float[]{5.4f,-5.4f};}

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/rollingstock/EurofimaCompartment/E8.png", "textures/bogies/Eurofimabogie.png",
                "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
    }
    //How to add in more skins Just recopy skinregistry?
    //ETERNAL NOTE yeah, you just do SkinRegistry.addSkin over and over for all the skins you want.
    //this method is just for organization/simplicity.
    //they dont even need to be in this method, you can do them at any time after the entity has been reigstered.
    // the PostInit method for one example.


    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2.2f,1.1f, 0.1f},{0.75f,0.5f, 0.2f},{-0.75f,0.5f, 0.2f},{-2f,0.5f, 0.2f}};}

    @Override
    public boolean shouldRiderSit(){
        return false;
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{13.75f,2,1.5f};
    }

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.25f,-0.15F,0.F}};
    }


    @Override
    public boolean isReinforced() {
        return true;
    }

    //public TrainsInMotion.transportTypes[] getTypes(){return TrainsInMotion.transportTypes.PASSENGER.singleton();}
    /**ETERNAL NOTE
     * this method was updated to an array so you can return multiple types and us the functionality of all.
     * for example a steam train that also takes passengers like a tram.
     *     public TrainsInMotion.transportTypes[] getTypes(){
     *         List<TrainsInMotion.transportTypes> list = new ArrayList<>();
     *         list.add(TrainsInMotion.transportTypes.PASSENGER);
     *         list.add(TrainsInMotion.transportTypes.STEAM);
     *         return list;
     *    }
     * an additional method has been added to the transportTypes enum, this is called singleton.
     * (in reference to the Collections.SingletonList(Object) method.)
     * use this for simplifying returning only one type
     * example:
     * public TrainsInMotion.transportTypes[] getTypes(){return TrainsInMotion.transportTypes.PASSENGER.singleton();}
     */


    @Override
    public ItemStack[] getRecipie() {
        return new ItemStack[]{
                DefineStack
                        (Items.bed, 1),null, null,
                null, null, null,
                null, null, null
        };
    }
    //can use future tim crafting items how?
    /**ETERNAL NOTE
     * the DefineStack method is just a simpler way to do
     *     new ItemStack(ITEM, STACKSIZE)
     * both are valid.
     * Additionally you can specify more than just the stack size.
     * you can also define NBT and other values in the stack, if you wanna get complex. for example
     *     ItemStack topleft =new ItemStack(Items.Planks,1);
     *     topleft.setItemDamage(3);
     *         return new ItemStack[]{
     *                 topleft,null, null,
     *                 null, null, null,
     *                 null, null, null
     *         };
     * The order is from Top Left to Bottom Right on a vanilla crafting grid.
     * Later on TiM will have a CraftingItems class that contains each of the crafting items you'd expect from TC.
     * Like the wooden cabin. Alongside new items to match newer materials.
     */

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new ClassDonder2()};}

    @Override
    public Item getItem(){
        return thisItem;
    }
}
