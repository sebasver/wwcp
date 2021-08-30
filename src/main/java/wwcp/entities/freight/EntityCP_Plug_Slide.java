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
import wwcp.models.freight.CP_PlugSlide_Boxcar;
import wwcp.models.freight.FortyFoot_Boxcar;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityCP_Plug_Slide extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityCP_Plug_Slide((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityCP_Plug_Slide(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityCP_Plug_Slide(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.90f,0.0f,0},{-2.1f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.0F, -2.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/CP_PlugSlide/40ft_CP_PlugSlide.png", "textures/bogies/70ton_truck_black.png",
                "CP Action Red", "CP action red with multimark logo");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.CP_PlugSlide().reinforced;
    }

    public float weightKg() {
        return Transport.CP_PlugSlide().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.CP_PlugSlide().name;
    }

    public String transportcountry() { return Transport.CP_PlugSlide().country; }

    public String transportYear() { return Transport.CP_PlugSlide().year; }

    public float transportTopSpeed() {
        return Transport.CP_PlugSlide().topSpeed;
    }

    public boolean isFictional() {
        return Transport.CP_PlugSlide().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.CP_PlugSlide().additionalTextTitle) + Transport.CP_PlugSlide().additionalText,
                RailUtility.translate(Transport.CP_PlugSlide().additionalTextTitle2) + Transport.CP_PlugSlide().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.CP_PlugSlide().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{5.9f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new CP_PlugSlide_Boxcar()};
    }

    public Item getItem() {
        return thisItem;
    }


}

