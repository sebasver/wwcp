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
import wwcp.models.bogies.AmericanTrucks.truck_70ton;
import wwcp.models.freight.Bay2ConcreteHopper;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityBay2ConcreteHopper extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityBay2ConcreteHopper((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityBay2ConcreteHopper(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityBay2ConcreteHopper(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.6f,0.0f,0},{-1.6f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.6F, -1.6F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Bay2ConcreteHopper/2_Bay_hopper_NP_grey_1.png", "textures/bogies/70ton_truck_black.png",
                "NP", "Northern Pacific as delivered");

    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:NP";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Bay2ConcreteHopper().reinforced;
    }

    public float weightKg() {
        return Transport.Bay2ConcreteHopper().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Bay2ConcreteHopper().name;
    }

    public String transportcountry() { return Transport.Bay2ConcreteHopper().country; }

    public String transportYear() { return Transport.Bay2ConcreteHopper().year; }

    public float transportTopSpeed() {
        return Transport.Bay2ConcreteHopper().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Bay2ConcreteHopper().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Bay2ConcreteHopper().additionalTextTitle) + Transport.Bay2ConcreteHopper().additionalText,
                RailUtility.translate(Transport.Bay2ConcreteHopper().additionalTextTitle2) + Transport.Bay2ConcreteHopper().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Bay2ConcreteHopper().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{5f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new Bay2ConcreteHopper()};
    }

    public Item getItem() {
        return thisItem;
    }


}

