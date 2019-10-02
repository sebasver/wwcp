package wwcp.entities.Freight;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.RollingstockBase;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.models.Freight.TeuSmallContainer;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityTEUSmall extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new ItemTransport(new EntityTEUSmall((World)null), worldwidecontentpack.MODID, worldwidecontentpack.European);

    public EntityTEUSmall(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos); }

    public EntityTEUSmall(World world) {
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
        return new float[][]{{-0.22f,-0.12F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/Freight/TEUSmallContainer/C12.png",
                "WWCP Corperate Skin",
                "Fictional skin promoting WWCP as a transport Company");
    }

    public boolean isReinforced() {
        return false;
    }

    public int[] getTankCapacity() {
        return null;
    }

    public String[] getTankFilters(int tankID) {
        return null;
    }

    public int getRFCapacity() {
        return 0;
    }

    public void manageFuel() {
    }

    public float weightKg() {
        return 1814.3F;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return "TEU Small Container carrier";
    }

    public String transportcountry() {
        return "Europe";
    }

    public String transportYear() {
        return "1950-now";
    }

    public float transportTopSpeed() {
        return 0.0F;
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isFictional() {
        return false;
    }

    public float transportTractiveEffort() {
        return 0.0F;
    }

    public float transportMetricHorsePower() {
        return 0.0F;
    }

    public String[] additionalItemText() {
        return null;
    }

    public float getMaxFuel() {
        return 0.0F;
    }

    public int getInventoryRows() {
        return 3;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return (float[][])null;
    }

    public float[] getHitboxSize() {
        return new float[]{3.78f, 1.8f, 1.2F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new TeuSmallContainer()};
    }

    public Item getItem() {
        return thisItem;
    }


}
