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
import wwcp.models.freight.GSVan;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityGS extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityGS((World)null), worldwidecontentpack.MODID, worldwidecontentpack.European);

    public EntityGS(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityGS(World world) {
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
        return new float[][]{{0.0f,-0.00F,0.0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GS/GS_DB.png",
                "DB Skin",
                "The Danish Staterailays didn't had the wagon for long. In 2001 when DSB Gods were bought by Railion");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GS/GS_DB2.png",
                "DB Skin 2",
                "The Danish Staterailays didn't had the wagon for long. In 2001 when DSB Gods were bought by Railion");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GS/GS_DSB.png",
                "DSB Skin",
                "The Danish Staterailays didn't had the wagon for long. In 2001 when DSB Gods were bought by Railion");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GS/GS_DSB2.png",
                "DSB Skin 2",
                "The Danish Staterailays didn't had the wagon for long. In 2001 when DSB Gods were bought by Railion");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GS/GS_DSBT.png",
                "DSB Tjeneste",
                "The Danish Staterailays didn't had the wagon for long. In 2001 when DSB Gods were bought by Railion");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:DB Skin";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.GSVan().reinforced;
    }

    public float weightKg() {
        return Transport.GSVan().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.GSVan().name;
    }

    public String transportcountry() { return Transport.GSVan().country; }

    public String transportYear() { return Transport.GSVan().year; }

    public float transportTopSpeed() { return Transport.GSVan().topSpeed; }

    public boolean isFictional() {
        return Transport.GSVan().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.GSVan().additionalTextTitle) + Transport.GSVan().additionalText,
                RailUtility.translate(Transport.GSVan().additionalTextTitle2) + Transport.GSVan().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.GSVan().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    //todo fix this once releases are done.
    public float[] getHitboxSize() {
        return new float[]{5.25f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new GSVan()};
    }

    public Item getItem() {
        return thisItem;
    }


}
