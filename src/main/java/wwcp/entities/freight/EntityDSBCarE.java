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
import wwcp.models.freight.DSBCarE;
import wwcp.models.freight.Hbbins;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityDSBCarE extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityDSBCarE((World)null), worldwidecontentpack.MODID, worldwidecontentpack.Denmark);

    public EntityDSBCarE(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityDSBCarE(World world) {
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
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/DSBE/DSBEI.png",
                "DSB E",
                "The Danish Staterailays didn't had the wagon for long. In 2001 when DSB Gods were bought by Railion, " +
                        "so did the Hbbins. in 2002 the last DSB Hbbins left Denmark to return again without 'DSB' designation");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:DSB E";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.DSBCarE().reinforced;
    }

    public float weightKg() {
        return Transport.DSBCarE().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.DSBCarE().name;
    }

    public String transportcountry() { return Transport.DSBCarE().country; }

    public String transportYear() { return Transport.DSBCarE().year; }

    public float transportTopSpeed() {
        return Transport.DSBCarE().topSpeed;
    }

    public boolean isFictional() {
        return Transport.DSBCarE().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.DSBCarE().additionalTextTitle) + Transport.DSBCarE().additionalText,
                RailUtility.translate(Transport.DSBCarE().additionalTextTitle2) + Transport.DSBCarE().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.DSBCarE().rows;
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
        return new ModelBase[]{new DSBCarE()};
    }

    public Item getItem() {
        return thisItem;
    }


}
