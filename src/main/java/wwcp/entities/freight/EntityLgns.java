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
import wwcp.models.freight.Lgns;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityLgns extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityLgns((World)null), worldwidecontentpack.MODID, worldwidecontentpack.European);

    public EntityLgns(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityLgns(World world) {
        super(world);
    }

    public float[][] bogieModelOffsets() {
        return null;}

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.3F, -2.3F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.0f,-0.10F,0.0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_EmptyG.png",
                "Lgns Grey Empty",
                "Lgns in Grey");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_EmptyB.png",
                "Lgns Brown Empty",
                "Lgns in Brown, formerly used by DSB");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_EmptyR.png",
                "Lgns Red Empty",
                "Lgns in DB Cargo Red");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_20MSC-MRSK.png",
                "20FT MCS and Maersk",
                "Lgns loaded with 20ft MSC and Maersk containers");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_20PO-EVRG.png",
                "20FT P&O and Evergreen",
                "Lgns loaded with 20ft P&O and Evergreen containers");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_40Blue.png",
                "40FT Blue",
                "Lgns loaded with 40ft container in Blue");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_40Red.png",
                "40FT Red",
                "Lgns loaded with 40ft container in Rec");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_40MRSK.png",
                "Grey 40FT Maersk",
                "Lgns loaded with grey 40ft Maersk");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_40MRSKW.png",
                "White 40FT Maersk",
                "Lgns loaded with white 40ft Maersk");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_40HBGS.png",
                "40FT Hamburg Süd",
                "Lgns loaded with 40ft Hamburg Süd");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Lgns/LGNS_40SMSK.png",
                "40FT Samskip",
                "Lgns loaded with 40ft Samskip");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:Lgns Empty Brown";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Lgns().reinforced;
    }

    public float weightKg() {
        return Transport.Lgns().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Lgns().name;
    }

    public String transportcountry() { return Transport.Lgns().country; }

    public String transportYear() { return Transport.Lgns().year; }

    public float transportTopSpeed() {
        return Transport.Lgns().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Lgns().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Lgns().additionalTextTitle) + Transport.Lgns().additionalText,
                RailUtility.translate(Transport.Lgns().additionalTextTitle2) + Transport.Lgns().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Lgns().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{7.25f, 3f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new Lgns()};
    }

    public Item getItem() {
        return thisItem;
    }


}
