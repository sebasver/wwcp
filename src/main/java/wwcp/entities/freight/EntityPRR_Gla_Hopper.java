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
import wwcp.models.bogies.AmericanTrucks.PRR_2D_F8_truck;
import wwcp.models.bogies.AmericanTrucks.truck_100ton;
import wwcp.models.freight.GSC_60_Flatcar;
import wwcp.models.freight.PRR_Gla_Hopper;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityPRR_Gla_Hopper extends GenericRailTransport {
    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityPRR_Gla_Hopper((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityPRR_Gla_Hopper(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityPRR_Gla_Hopper(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.5f, 0f, 0}, {-1.5f, 0f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new PRR_2D_F8_truck()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.5F, -1.5F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F, -0F, 0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/PRR_Gla_Hopper/WWCP_PRR_Gla_hopper_early_PRR_lettering.png", "textures/bogies/2D-F8_truck_PRR_black.png",
                "PRR Early", "PRR Gla Hopper with early prr lettering");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.PRR_Gla_Hopper().reinforced;
    }

    public float weightKg() {
        return Transport.PRR_Gla_Hopper().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.PRR_Gla_Hopper().name;
    }

    public String transportcountry() {
        return Transport.PRR_Gla_Hopper().country;
    }

    public String transportYear() {
        return Transport.PRR_Gla_Hopper().year;
    }

    public float transportTopSpeed() {
        return Transport.PRR_Gla_Hopper().topSpeed;
    }

    public boolean isFictional() {
        return Transport.PRR_Gla_Hopper().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.PRR_Gla_Hopper().additionalTextTitle) + Transport.PRR_Gla_Hopper().additionalText,
                    RailUtility.translate(Transport.PRR_Gla_Hopper().additionalTextTitle2) + Transport.PRR_Gla_Hopper().additionalText2};
        }
    }

    public int getInventoryRows() {
        return Transport.PRR_Gla_Hopper().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{4f, 0.75f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new PRR_Gla_Hopper()};
    }

    public Item getItem() {
        return thisItem;
    }

}
