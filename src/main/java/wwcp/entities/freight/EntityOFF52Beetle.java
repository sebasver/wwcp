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
import wwcp.models.freight.OFF52Beetles;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityOFF52Beetle extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityOFF52Beetle((World)null), worldwidecontentpack.MODID, worldwidecontentpack.Germany);

    public EntityOFF52Beetle(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityOFF52Beetle(World world) {
        super(world);
    }

    public float[][] bogieModelOffsets() {
        return null;}

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.5F, -1.5F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.1f,-0.05F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/OFF52/OFF52_1.png",
                "OFF 52 with 4 Beetles",
                "Fictional skin promoting WWCP as a transport Company");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.OFF52().reinforced;
    }

    public float weightKg() {
        return Transport.OFF52().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.OFF52().name;
    }

    public String transportcountry() { return Transport.OFF52().country; }

    public String transportYear() { return Transport.OFF52().year; }

    public float transportTopSpeed() {
        return Transport.OFF52().topSpeed;
    }

    public boolean isFictional() {
        return Transport.OFF52().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.OFF52().additionalTextTitle) + Transport.OFF52().additionalText,
                RailUtility.translate(Transport.OFF52().additionalTextTitle2) + Transport.OFF52().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.OFF52().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return (float[][])null;
    }

    public float[] getHitboxSize() {
        return new float[]{4.6f, 2.2f, 1.5F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new OFF52Beetles()};
    }

    public Item getItem() {
        return thisItem;
    }


}
