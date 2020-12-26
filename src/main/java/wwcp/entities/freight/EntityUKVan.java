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
import wwcp.models.freight.UKVan;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityUKVan extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityUKVan((World)null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityUKVan(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityUKVan(World world) {
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
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKVan/UK_Van_Texture_1.png",
                "Red Van",
                "This Van is Red");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKVan/UK_Van_Texture_2.png",
                "Orange Van",
                "This Van is Orange");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKVan/UK_Van_Texture_3.png",
                "Grey Van",
                "This Van is Grey");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKVan/UK_Van_Texture_4.png",
                "Green Van",
                "This Van is Green");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKVan/UK_Van_Texture_5.png",
                "Brown Van",
                "This Van is Brown");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.UKVan().reinforced;
    }

    public float weightKg() {
        return Transport.UKVan().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.UKVan().name;
    }

    public String transportcountry() { return Transport.UKVan().country; }

    public String transportYear() { return Transport.UKVan().year; }

    public float transportTopSpeed() {
        return Transport.UKVan().topSpeed;
    }

    public boolean isFictional() {
        return Transport.UKVan().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.UKVan().additionalTextTitle) + Transport.UKVan().additionalText,
                RailUtility.translate(Transport.UKVan().additionalTextTitle2) + Transport.UKVan().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.UKVan().rows;
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
        return new ModelBase[]{new UKVan()};
    }

    public Item getItem() {
        return thisItem;
    }


}
