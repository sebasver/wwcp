package wwcp.entities.Advent;

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
import wwcp.models.freight.CattleWagonUK;
import wwcp.models.freight.UK_GasWagon;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityUKGasWagen extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityUKGasWagen((World)null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityUKGasWagen(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityUKGasWagen(World world) {
        super(world);
    }

    public float[][] bogieModelOffsets() {
        return null;}

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.0F, -1.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,0.05F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKGasWagon/UKGasWagon.png",
                "Default Gas wagon",
                "This was the factory skin of the car");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.UKGasWagon().reinforced;
    }

    public float weightKg() {
        return Transport.UKGasWagon().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.UKGasWagon().name;
    }

    public String transportcountry() { return Transport.UKGasWagon().country; }

    public String transportYear() { return Transport.UKGasWagon().year; }

    public float transportTopSpeed() {
        return Transport.UKGasWagon().topSpeed;
    }

    public boolean isFictional() {
        return Transport.UKGasWagon().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.UKGasWagon().additionalTextTitle) + Transport.UKGasWagon().additionalText,
                RailUtility.translate(Transport.UKGasWagon().additionalTextTitle2) + Transport.UKGasWagon().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.UKGasWagon().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return (float[][])null;
    }

    public float[] getHitboxSize() {
        return new float[]{2.95f, 1.4f, 1.4F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new UK_GasWagon()};
    }

    public Item getItem() {
        return thisItem;
    }


}
