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
import wwcp.models.bogies.AmericanTrucks.truck_70ton;
import wwcp.models.freight.XM4A;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityXM4A extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityXM4A((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityXM4A(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityXM4A(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.65f,0.0f,0},{-2.65f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.65F, -2.65F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/XM4A/XM4A_NPB.png",
                "textures/bogies/70ton_truck_black.png",
                "NP", "Northern Pacific freight brown");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/XM4A/XM4A_GNA.png",
                "textures/bogies/70ton_truck_black.png",
                "GN Glacier Green", "Great Northern in glacier green");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/XM4A/XM4A_GNBSB.png",
                "textures/bogies/70ton_truck_black.png",
                "GN BSB", "Great Northern big sky blue");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/XM4A/XM4A_BNG.png",
                "textures/bogies/70ton_truck_black.png",
                "BN", "Burlington Northern green");

    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:NP";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.XM4A().reinforced;
    }

    public float weightKg() {
        return Transport.XM4A().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.XM4A().name;
    }

    public String transportcountry() { return Transport.XM4A().country; }

    public String transportYear() { return Transport.XM4A().year; }

    public float transportTopSpeed() {
        return Transport.XM4A().topSpeed;
    }

    public boolean isFictional() {
        return Transport.XM4A().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.XM4A().additionalTextTitle) + Transport.XM4A().additionalText,
                RailUtility.translate(Transport.XM4A().additionalTextTitle2) + Transport.XM4A().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.XM4A().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{7.25f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new XM4A()};
    }

    public Item getItem() {
        return thisItem;
    }


}

