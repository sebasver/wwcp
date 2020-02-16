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
import wwcp.entities.TransportDetails;
import wwcp.entities.WWCPTransport;
import wwcp.models.freight.SGNS802BT;
import wwcp.models.bogies.SGNSBogie;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntitySGNS802BT extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntitySGNS802BT((World)null), worldwidecontentpack.MODID, worldwidecontentpack.European);

    public EntitySGNS802BT(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntitySGNS802BT(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{5f,0.08f,0},{-5f,0.08f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new SGNSBogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{5.0F, -5.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,-0.1F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/SGNS80/S1.png", "textures/bogies/SGNSSBogie.png",
                "Variant 1", "Container loads variant 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/SGNS80/S2.png", "textures/bogies/SGNSSBogie.png",
                "Variant 2", "Container loads variant 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/SGNS80/S3.png", "textures/bogies/SGNSSBogie.png",
                "Variant 3", "Container loads variant 3");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/SGNS80/S4.png", "textures/bogies/SGNSSBogie.png",
                "Variant 4", "Container loads variant 4");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/SGNS80/S5.png", "textures/bogies/SGNSSBogie.png",
                "Variant 5", "Container loads variant 5");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/SGNS80/S6.png", "textures/bogies/SGNSSBogie.png",
                "Variant 6", "Container loads variant 6");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/SGNS80/S7.png", "textures/bogies/SGNSSBogie.png",
                "Variant 7", "Container loads variant 7");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return TransportDetails.Sggnss80Load2().reinforced;
    }

    public float weightKg() {
        return TransportDetails.Sggnss80Load2().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return TransportDetails.Sggnss80Load2().name;
    }

    public String transportcountry() { return TransportDetails.Sggnss80Load2().country; }

    public String transportYear() { return TransportDetails.Sggnss80Load2().year; }

    public float transportTopSpeed() {
        return TransportDetails.Sggnss80Load2().topSpeed;
    }

    public boolean isFictional() {
        return TransportDetails.Sggnss80Load2().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(TransportDetails.Sggnss80Load2().additionalTextTitle) + TransportDetails.Sggnss80Load2().additionalText,
                RailUtility.translate(TransportDetails.Sggnss80Load2().additionalTextTitle2) + TransportDetails.Sggnss80Load2().additionalText2};}
    }
    public int getInventoryRows() {
        return TransportDetails.Sggnss80Load2().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{13.4f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new SGNS802BT()};
    }

    public Item getItem() {
        return thisItem;
    }


}

