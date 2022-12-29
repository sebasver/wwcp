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
import wwcp.models.freight.Thrall616Bulkhead;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityThrall616Bulkhead extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityThrall616Bulkhead((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityThrall616Bulkhead(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityThrall616Bulkhead(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{3.15f,0.0f,0},{-3.15f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{3.15F, -3.15F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Thrall616Bulkhead/Thrall_61_6_bulkhead_BSB.png", "textures/bogies/70ton_truck_black.png",
                "GN BSB", "Bulkheads were used for a variety of commodities such as finished lumber products. Great Northern ordered 50 of these bulkheads from Thrall Car Manufacturing Co in 1968. At that time Great Northern was painting the cars in their Big Sky Blue scheme as seen here.");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:GN BSB";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Thrall616Bulkhead().reinforced;
    }

    public float weightKg() {
        return Transport.Thrall616Bulkhead().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Thrall616Bulkhead().name;
    }

    public String transportcountry() { return Transport.Thrall616Bulkhead().country; }

    public String transportYear() { return Transport.Thrall616Bulkhead().year; }

    public float transportTopSpeed() {
        return Transport.Thrall616Bulkhead().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Thrall616Bulkhead().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Thrall616Bulkhead().additionalTextTitle) + Transport.Thrall616Bulkhead().additionalText,
                RailUtility.translate(Transport.Thrall616Bulkhead().additionalTextTitle2) + Transport.Thrall616Bulkhead().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Thrall616Bulkhead().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{8.5f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new Thrall616Bulkhead()};
    }

    public Item getItem() {
        return thisItem;
    }


}

