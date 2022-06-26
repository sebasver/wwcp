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
import wwcp.models.freight.DSBZETanker;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDSBZETanker extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityDSBZETanker((World)null), worldwidecontentpack.MODID, worldwidecontentpack.Denmark);

    public EntityDSBZETanker(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityDSBZETanker(World world) {
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
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/DSBZETanker/ArOf.png",
                "Default Gas wagon",
                "This was the factory skin of the car");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.DSBZETanker().reinforced;
    }

    public float weightKg() {
        return Transport.DSBZETanker().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.DSBZETanker().name;
    }

    public String transportcountry() { return Transport.DSBZETanker().country; }

    public String transportYear() { return Transport.DSBZETanker().year; }

    public float transportTopSpeed() {
        return Transport.DSBZETanker().topSpeed;
    }

    public boolean isFictional() {
        return Transport.DSBZETanker().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.DSBZETanker().additionalTextTitle) + Transport.DSBZETanker().additionalText,
                RailUtility.translate(Transport.DSBZETanker().additionalTextTitle2) + Transport.DSBZETanker().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.DSBZETanker().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return (float[][])null;
    }

    public float[] getHitboxSize() {
        return new float[]{4.40f, 2f, 1.4F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new DSBZETanker()};
    }

    public Item getItem() {
        return thisItem;
    }


}
