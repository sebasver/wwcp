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
import wwcp.models.freight.Hbbillns;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityHbbillns extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityHbbillns((World)null), worldwidecontentpack.MODID, worldwidecontentpack.European);

    public EntityHbbillns(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityHbbillns(World world) {
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
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbillns/DSBGrey.png",
                "DSB Grey Hbbillns",
                "The Danish Staterailays didn't had the wagon for long. In 2001 when DSB Gods were bought by Railion, so did the Hbbillns. in 2002 the last DSB Hbbillns left Denmark to return again without 'DSB' designation. The early series were delivered in Grey");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbillns/DSBBrown.png",
                "DSB Brown Hbbillns",
                "The Danish Staterailays didn't had the wagon for long. In 2001 when DSB Gods were bought by Railion, so did the Hbbillns. in 2002 the last DSB Hbbillns left Denmark to return again without 'DSB' designation. The late series were delivered in Brown");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbillns/TWABrown.png",
                "Brown Transwaggon Hbbillns",
                "Transwaggon are the biggest freightcar leasing company in europe, most of their Hbbillns like the rest of their boxcar fleet has become brown due to dirt and rust dust.");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hbbillns/TWAGrey.png",
                "Grey Transwaggon Hbbillns",
                "This is how a clean Transwaggon Hbbillns looks like, they are common still");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:Grey Transwaggon Hbbillns";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Hbbillns().reinforced;
    }

    public float weightKg() {
        return Transport.Hbbillns().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Hbbillns().name;
    }

    public String transportcountry() { return Transport.Hbbillns().country; }

    public String transportYear() { return Transport.Hbbillns().year; }

    public float transportTopSpeed() {
        return Transport.Hbbillns().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Hbbillns().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Hbbillns().additionalTextTitle) + Transport.Hbbillns().additionalText,
                RailUtility.translate(Transport.Hbbillns().additionalTextTitle2) + Transport.Hbbillns().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Hbbillns().rows;
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
        return new ModelBase[]{new Hbbillns()};
    }

    public Item getItem() {
        return thisItem;
    }


}
