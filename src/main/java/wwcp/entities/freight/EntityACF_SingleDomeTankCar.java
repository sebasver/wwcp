package wwcp.entities.freight;

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
import wwcp.models.bogies.truck_100ton;
import wwcp.models.bogies.truck_70ton;
import wwcp.models.freight.ACF_SingleDomeTankCar;
import wwcp.models.freight.UKTanker;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityACF_SingleDomeTankCar extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityACF_SingleDomeTankCar((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityACF_SingleDomeTankCar(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityACF_SingleDomeTankCar(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.2f, 0f, 0}, {-2.2f, 0f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_100ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{3.4F, -3.4F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,-0.0F,0.065F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ACF_Single_Dome/ACF_Single_Dome_17360_Gallon_tank_car_PPGX.png", "textures/bogies/100ton_truck_black.png",
                "CNR Maple Leaf, Aluminium Sheathed", "Canadian National Railway Red Orange Boxcar with aluminium sheathed sides");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.ACF_Single_Dome_Tankcar().reinforced;
    }

    public float weightKg() {
        return Transport.ACF_Single_Dome_Tankcar().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.ACF_Single_Dome_Tankcar().name;
    }

    public String transportcountry() { return Transport.ACF_Single_Dome_Tankcar().country; }

    public String transportYear() { return Transport.ACF_Single_Dome_Tankcar().year; }

    public float transportTopSpeed() {
        return Transport.ACF_Single_Dome_Tankcar().topSpeed;
    }

    public boolean isFictional() {
        return Transport.ACF_Single_Dome_Tankcar().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.ACF_Single_Dome_Tankcar().additionalTextTitle) + Transport.ACF_Single_Dome_Tankcar().additionalText,
                RailUtility.translate(Transport.ACF_Single_Dome_Tankcar().additionalTextTitle2) + Transport.ACF_Single_Dome_Tankcar().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.ACF_Single_Dome_Tankcar().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return (float[][])null;
    }

    public float[] getHitboxSize() {
        return new float[]{2.95f, 1.4f, 1.4F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new ACF_SingleDomeTankCar()};
    }

    public Item getItem() {
        return thisItem;
    }


}
