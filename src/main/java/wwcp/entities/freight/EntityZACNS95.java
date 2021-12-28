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
import wwcp.models.bogies.EUBogies.SGNSSBogie;
import wwcp.models.freight.ZACNS;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityZACNS95 extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityZACNS95((World)null), worldwidecontentpack.MODID, worldwidecontentpack.European);

    public EntityZACNS95(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityZACNS95(World world) {
        super(world);
    }
    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.78F,0.08f,0},{-2.78F,0.08f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new SGNSSBogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.78F, -2.78F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,-0.1F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_Agip_Gelb.png", "textures/bogies/SGNSSBogie.png",
                "Variant 1", "Agip Yellow");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_Agip_Lila.png", "textures/bogies/SGNSSBogie.png",
                "Variant 2", "Agip Purple");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_Aral.png", "textures/bogies/SGNSSBogie.png",
                "Variant 3", "Aral");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_dec_KVG.png", "textures/bogies/SGNSSBogie.png",
                "Variant 4", "KVG Brown");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_DHL.png", "textures/bogies/SGNSSBogie.png",
                "Variant 5", "DHL");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_Ermewa.png", "textures/bogies/SGNSSBogie.png",
                "Variant 6", "Ermewa");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_Esso_Grau.png", "textures/bogies/SGNSSBogie.png",
                "Variant 7", "Esso Gray");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_Esso_white.png", "textures/bogies/SGNSSBogie.png",
                "Variant 8", "Esso White");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_Futura.png", "textures/bogies/SGNSSBogie.png",
                "Variant 9", "Futura");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_GATX.png", "textures/bogies/SGNSSBogie.png",
                "Variant 10", "GATX 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_GATX_2.png", "textures/bogies/SGNSSBogie.png",
                "Variant 11", "GATX 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_Greencargo.png", "textures/bogies/SGNSSBogie.png",
                "Variant 12", "Greencargo");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_KVG.png", "textures/bogies/SGNSSBogie.png",
                "Variant 13", "KVG Lightgray");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_Migrol.png", "textures/bogies/SGNSSBogie.png",
                "Variant 14", "Migrol");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_Motorex.png", "textures/bogies/SGNSSBogie.png",
                "Variant 15", "Motorex");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_OMV_wasaco_.png", "textures/bogies/SGNSSBogie.png",
                "Variant 16", "OMV Wasaco");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_OnRail.png", "textures/bogies/SGNSSBogie.png",
                "Variant 17", "OnRail");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_VTG.png", "textures/bogies/SGNSSBogie.png",
                "Variant 18", "VTG");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/ZACNS/Zacns95_wascosa_eurotanker.png", "textures/bogies/SGNSSBogie.png",
                "Variant 19", "Wascosa Eurotanker");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Zacns95().reinforced;
    }

    public float weightKg() {
        return Transport.Zacns95().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Zacns95().name;
    }

    public String transportcountry() { return Transport.Zacns95().country; }

    public String transportYear() { return Transport.Zacns95().year; }

    public float transportTopSpeed() {
        return Transport.Zacns95().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Zacns95().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Zacns95().additionalTextTitle) + Transport.Zacns95().additionalText,
                RailUtility.translate(Transport.Zacns95().additionalTextTitle2) + Transport.Zacns95().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Zacns95().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{8.25f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new ZACNS()};
    }

    public Item getItem() {
        return thisItem;
    }


}