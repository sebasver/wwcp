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
import wwcp.models.freight.Paccar64Woodchip;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityPaccar64Woodchip extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityPaccar64Woodchip((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityPaccar64Woodchip(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityPaccar64Woodchip(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{3.5f,0.0f,0},{-3.5f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{3.5F, -3.5F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Paccar64Woodchip/Paccar64Woodchip_SP.png", "textures/bogies/70ton_truck_black.png",
                "SP", "Southern Pacific freight brown");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Paccar64Woodchip/Paccar64Woodchip_ATSF.png", "textures/bogies/70ton_truck_black.png",
                "ATSF", "Atchison, Topeka and Santa Fe freight brown");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:SP";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Paccar64Woodchip().reinforced;
    }

    public float weightKg() {
        return Transport.Paccar64Woodchip().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Paccar64Woodchip().name;
    }

    public String transportcountry() { return Transport.Paccar64Woodchip().country; }

    public String transportYear() { return Transport.Paccar64Woodchip().year; }

    public float transportTopSpeed() {
        return Transport.Paccar64Woodchip().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Paccar64Woodchip().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Paccar64Woodchip().additionalTextTitle) + Transport.Paccar64Woodchip().additionalText,
                RailUtility.translate(Transport.Paccar64Woodchip().additionalTextTitle2) + Transport.Paccar64Woodchip().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Paccar64Woodchip().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{8.6f, 2.25f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new Paccar64Woodchip()};
    }

    public Item getItem() {
        return thisItem;
    }


}

