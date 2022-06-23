package wwcp.entities.Advent;

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
import wwcp.models.freight.DSB735;
import wwcp.models.freight.DSBZETanker;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDSB735Tanker extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityDSB735Tanker((World)null), worldwidecontentpack.MODID, worldwidecontentpack.Denmark);

    public EntityDSB735Tanker(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityDSB735Tanker(World world) {
        super(world);
    }

    public float[][] bogieModelOffsets() {
        return null;}

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.0F, -1.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,0.05F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/DSB735Tanker/KK735.png",
                "Default Gas wagon",
                "This was the factory skin of the car");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.DSB735Tanker().reinforced;
    }

    public float weightKg() {
        return Transport.DSB735Tanker().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.DSB735Tanker().name;
    }

    public String transportcountry() { return Transport.DSB735Tanker().country; }

    public String transportYear() { return Transport.DSB735Tanker().year; }

    public float transportTopSpeed() {
        return Transport.DSB735Tanker().topSpeed;
    }

    public boolean isFictional() {
        return Transport.DSB735Tanker().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.DSB735Tanker().additionalTextTitle) + Transport.DSB735Tanker().additionalText,
                RailUtility.translate(Transport.DSB735Tanker().additionalTextTitle2) + Transport.DSB735Tanker().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.DSB735Tanker().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return (float[][])null;
    }

    public float[] getHitboxSize() {
        return new float[]{5.25f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new DSB735()};
    }

    public Item getItem() {
        return thisItem;
    }


}
