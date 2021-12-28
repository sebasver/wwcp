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
import wwcp.models.freight.UKopenwagon;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityUKopenWagon extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityUKopenWagon((World)null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityUKopenWagon(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityUKopenWagon(World world) {
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
        return new float[][]{{0.625f,0F,0.065F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKopenwagon/O1.png",
                "Default open wagon",
                "This was the factory skin of the car");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKopenwagon/O2.png",
                "Green open wagon",
                "This was the factory skin of the car");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKopenwagon/O3.png",
                "Grey GW open wagon",
                "This was the factory skin of the car");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKopenwagon/O4.png",
                "Grey NE open wagon",
                "This was the factory skin of the car");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKopenwagon/O5.png",
                "Grey LMS open wagon",
                "London Midland and Scottish Railway skin of the car");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKopenwagon/O6.png",
                "Grey SR open wagon",
                "This was the factory skin of the car");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKopenwagon/O7.png",
                "Grey open wagon",
                "This Grey colored Truck can be troublesome");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKopenwagon/O8.png",
                "Blue open wagon",
                "Blue is the only color for a really useful train");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKopenwagon/O9.png",
                "Red open wagon",
                "A nice Red color, and you'll never see it dirty");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.UKOpenWagon().reinforced;
    }

    public float weightKg() {
        return Transport.UKOpenWagon().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.UKOpenWagon().name;
    }

    public String transportcountry() { return Transport.UKOpenWagon().country; }

    public String transportYear() { return Transport.UKOpenWagon().year; }

    public float transportTopSpeed() {
        return Transport.UKOpenWagon().topSpeed;
    }

    public boolean isFictional() {
        return Transport.UKOpenWagon().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.UKOpenWagon().additionalTextTitle) + Transport.UKOpenWagon().additionalText,
                RailUtility.translate(Transport.UKOpenWagon().additionalTextTitle2) + Transport.UKOpenWagon().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.UKOpenWagon().rows;
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
        return new ModelBase[]{new UKopenwagon()};
    }

    public Item getItem() {
        return thisItem;
    }


}
