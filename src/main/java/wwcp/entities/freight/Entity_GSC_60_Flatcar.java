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
import wwcp.models.bogies.AmericanTrucks.truck_100ton;
import wwcp.models.freight.GSC_60_Flatcar;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class Entity_GSC_60_Flatcar extends GenericRailTransport {
    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new Entity_GSC_60_Flatcar((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public Entity_GSC_60_Flatcar(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public Entity_GSC_60_Flatcar(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{3.4f, 0f, 0}, {-3.4f, 0f, 0}};
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
        return new float[][]{{-0F, -0F, 0F}};
    }

    //todo fix naming of this;
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GSCFlatcar/GSC_60_Flatcar_BN_crooked_lettering.png", "textures/bogies/100ton_truck_black.png",
                "CNR Maple Leaf, Aluminium Sheathed", "Canadian National Railway Red Orange Boxcar with aluminium sheathed sides");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.GSC_Flatcar().reinforced;
    }

    public float weightKg() {
        return Transport.GSC_Flatcar().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.GSC_Flatcar().name;
    }

    public String transportcountry() {
        return Transport.GSC_Flatcar().country;
    }

    public String transportYear() {
        return Transport.GSC_Flatcar().year;
    }

    public float transportTopSpeed() {
        return Transport.GSC_Flatcar().topSpeed;
    }

    public boolean isFictional() {
        return Transport.GSC_Flatcar().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.GSC_Flatcar().additionalTextTitle) + Transport.GSC_Flatcar().additionalText,
                    RailUtility.translate(Transport.GSC_Flatcar().additionalTextTitle2) + Transport.GSC_Flatcar().additionalText2};
        }
    }

    public int getInventoryRows() {
        return Transport.GSC_Flatcar().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{8.4f, 0.75f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new GSC_60_Flatcar()};
    }

    public Item getItem() {
        return thisItem;
    }

}
