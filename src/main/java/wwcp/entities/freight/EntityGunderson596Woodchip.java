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
import wwcp.models.freight.Gunderson596Woodchip;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityGunderson596Woodchip extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityGunderson596Woodchip((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityGunderson596Woodchip(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityGunderson596Woodchip(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{3.25f,0.0f,0},{-3.25f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{3.25F, -3.25F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Gunderson596Woodchip/596_Gunderson_Woodchip_NP.png", "textures/bogies/70ton_truck_black.png",
                "NP", "Northern Pacific in freight brown");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Gunderson596Woodchip/596_Gunderson_Woodchip_BNPatch.png", "textures/bogies/70ton_truck_black.png",
                "BN Patch", "Burlington Northern Patched");
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
        return Transport.Gunderson596Woodchip().reinforced;
    }

    public float weightKg() {
        return Transport.Gunderson596Woodchip().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Gunderson596Woodchip().name;
    }

    public String transportcountry() { return Transport.Gunderson596Woodchip().country; }

    public String transportYear() { return Transport.Gunderson596Woodchip().year; }

    public float transportTopSpeed() {
        return Transport.Gunderson596Woodchip().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Gunderson596Woodchip().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Gunderson596Woodchip().additionalTextTitle) + Transport.Gunderson596Woodchip().additionalText,
                RailUtility.translate(Transport.Gunderson596Woodchip().additionalTextTitle2) + Transport.Gunderson596Woodchip().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Gunderson596Woodchip().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{8.4f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new Gunderson596Woodchip()};
    }

    public Item getItem() {
        return thisItem;
    }


}

