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
import wwcp.models.freight.Hbbins;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityHbbins extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityHbbins((World)null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityHbbins(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityHbbins(World world) {
        super(world);
    }

    public float[][] bogieModelOffsets() {
        return null;}

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{6.0F, -1.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.0f,-0.10F,0.065F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbins/DSB.png",
                "DSB Hbbins",
                "The Danish Staterailays didn't had the wagon for long. In 2001 when DSB Gods were bought by Railion, so did the Hbbins. in 2002 the last DSB Hbbins left Denmark to return again without 'DSB' designation");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbins/SJ.png",
                "SJ Hbbins",
                "Svenska Jernvagar had Hbbins for a short time, when Green Cargo was formed the Hbbins were sold to GC, it took some time until they had lost the SJ colors");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbins/TWABrown.png",
                "Brown Transwaggon Hbbins",
                "Transwaggon are the biggest freightcar leasing company in europe, most of their Hbbins like the rest of their boxcar fleet has become brown due to dirt and rust dust.");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbins/TWAGrey.png",
                "Brown Transwaggon Hbbins",
                "This is how a clean Transwaggon Hbbins looks like, they are common still");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbins/AtaCitrus.png",
                "Ata Citrus Hbbins",
                "This skin is fictional");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbins/BrownGrey.png",
                "Brown nd Grey Hbbins",
                "This skin is fictional");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbins/Persil.png",
                "Persil Hbbins",
                "This skin is fictional");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbins/GreyRed.png",
                "Grey and Red Hbbins",
                "This skin is fictional");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Hbbins().reinforced;
    }

    public float weightKg() {
        return Transport.Hbbins().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Hbbins().name;
    }

    public String transportcountry() { return Transport.Hbbins().country; }

    public String transportYear() { return Transport.Hbbins().year; }

    public float transportTopSpeed() {
        return Transport.Hbbins().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Hbbins().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.UKFlatbed().additionalTextTitle) + Transport.Hbbins().additionalText,
                RailUtility.translate(Transport.Hbbins().additionalTextTitle2) + Transport.Hbbins().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Hbbins().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return (float[][])null;
    }

    public float[] getHitboxSize() {
        return new float[]{4.5f, 1.4f, 1.4F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new Hbbins()};
    }

    public Item getItem() {
        return thisItem;
    }


}
