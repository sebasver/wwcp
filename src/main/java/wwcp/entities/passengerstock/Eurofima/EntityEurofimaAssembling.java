package wwcp.entities.passengerstock.Eurofima;


import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.passengerStock.Eurofima.EurofimeAssemblingFrame;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityEurofimaAssembling extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityEurofimaAssembling(null), worldwidecontentpack.MODID , worldwidecontentpack.European);


    public EntityEurofimaAssembling(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntityEurofimaAssembling(World world){
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return Transport.EurofimaAssemblingBase().reinforced;
    }

    @Override
    public String transportName() {
        return Transport.EurofimaAssemblingBase().name;
    }

    @Override
    public String transportcountry() {
        return Transport.EurofimaAssemblingBase().country;
    }

    @Override
    public String transportYear() {
        return Transport.EurofimaAssemblingBase().year;
    }

    @Override
    public float weightKg() {
        return Transport.EurofimaAssemblingBase().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return Transport.EurofimaAssemblingBase().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.EurofimaAssemblingBase().additionalTextTitle) + Transport.EurofimaAssemblingBase().additionalText,
                RailUtility.translate(Transport.EurofimaAssemblingBase().additionalTextTitle2) + Transport.EurofimaAssemblingBase().additionalText2};}
    }

    @Override
    public String transportFuelType() {return null;}
    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return null;
    }

    @Override
    public ModelBase[] bogieModels() {
        return null;
    }

    /**
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter(){return new float[]{4.60f,-4.60f};}

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.025f,0.25F,0.F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/Eurofima/Specials/EurofimaFrame.png",
                "Construction Skin", "Construction Livery");
    }

//    @Override
//    public String getDefaultSkin() {
//        return "wwcp:Construction Skin";
//    }
    
    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                DefineStack(Items.bed, 1), null, null,
                null, null, null,
                null, null, null
        };
    }
    
    /**
     * <h2>Inventory Size</h2>
     */
    @Override
    public int getInventoryRows(){return 0;}
    /**
     * <h2>Type</h2>
     */

    public TrainsInMotion.transportTypes getType(){return TrainsInMotion.transportTypes.PASSENGER;}
    /**
     * <h2>Rider offsets</h2>
     */
    @Override
    public float[][] getRiderOffsets(){return new float[][]{{2.0f,1.0f, 0.2f}};}


    @Override
    public float[] getHitboxSize() {
        return new float[]{12.9f,0.5f,1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel(){return new ModelBase[]{new EurofimeAssemblingFrame()};}

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem(){
        return thisItem;
    }
}

