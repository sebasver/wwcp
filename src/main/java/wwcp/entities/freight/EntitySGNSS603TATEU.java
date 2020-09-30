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
import wwcp.models.bogies.SGNSSBogie;
import wwcp.models.freight.SGNSS603TATEU;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntitySGNSS603TATEU extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntitySGNSS603TATEU((World)null), worldwidecontentpack.MODID, worldwidecontentpack.European);

    public EntitySGNSS603TATEU(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntitySGNSS603TATEU(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{5f,0.08f,0},{-5f,0.08f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new SGNSSBogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{5.0F, -5.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.475f,-0.1F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/SGNSS60/SGNSS603TATEU_1.png", "textures/bogies/SGNSSBogie.png",
                "Variant 1", "Tanktainers loads variant 1");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Sgnss60Load1().reinforced;
    }

    public int[] getTankCapacity() {
        return new int[] {Transport.Sgnss60Load1().tankcapacity, Transport.Sgnss60Load1().tankcapacity};
    }

    public String[] getTankFilters(int tankID) {
        return null;
    }

    public float weightKg() {
        return Transport.Sgnss60Load1().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Sgnss60Load1().name;
    }

    public String transportcountry() { return Transport.Sgnss60Load1().country; }

    public String transportYear() { return Transport.Sgnss60Load1().year; }

    public float transportTopSpeed() {
        return Transport.Sgnss60Load1().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Sgnss60Load1().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Sgnss60Load1().additionalTextTitle) + Transport.Sgnss60Load1().additionalText,
                RailUtility.translate(Transport.Sgnss60Load1().additionalTextTitle2) + Transport.Sgnss60Load1().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Sgnss60Load1().rows;
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
        return new ModelBase[]{new SGNSS603TATEU()};
    }

    public Item getItem() {
        return thisItem;
    }


}

