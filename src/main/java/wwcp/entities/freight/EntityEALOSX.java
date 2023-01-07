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
import wwcp.models.bogies.EUBogies.SGNSSBogie;
import wwcp.models.freight.EALOSX;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityEALOSX extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityEALOSX((World)null), worldwidecontentpack.MODID, worldwidecontentpack.European);

    public EntityEALOSX(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityEALOSX(World world) {
        super(world);
    }
    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.05F,0f,0},{-2.05F,0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new SGNSSBogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.05F, -2.05F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.06f,-0.01F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Ealos_x/Ealos-X053.png", "textures/bogies/SGNSSBogie.png",
                "Brown Ealos-x", "This was the factory skin of the car");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Ealos_x/Ealos-x_053_DB_Red.png", "textures/bogies/SGNSSBogie.png",
                "DB Ealos-x", "This is the DB variant");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.EalosX().reinforced;
    }

    public float weightKg() {
        return Transport.EalosX().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.EalosX().name;
    }

    public String transportcountry() { return Transport.EalosX().country; }

    public String transportYear() { return Transport.EalosX().year; }

    public float transportTopSpeed() {
        return Transport.EalosX().topSpeed;
    }

    public boolean isFictional() {
        return Transport.EalosX().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.EalosX().additionalTextTitle) + Transport.EalosX().additionalText,
                RailUtility.translate(Transport.EalosX().additionalTextTitle2) + Transport.EalosX().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.EalosX().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{6.82f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new EALOSX()};
    }

    public Item getItem() {
        return thisItem;
    }


}