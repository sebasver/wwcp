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
import wwcp.models.freight.HiCube86QuadDoor;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityHiCube86QuadDoor extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityHiCube86QuadDoor((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityHiCube86QuadDoor(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityHiCube86QuadDoor(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{4.25f,0.0f,0},{-4.25f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{4.25F, -4.25F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/HiCube86QuadDoor/HiCube86Quad_Door_PC.png", "textures/bogies/70ton_truck_black.png",
                "PC", "Penn Central in Jade Green");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.HiCube86QuadDoor().reinforced;
    }

    public float weightKg() {
        return Transport.HiCube86QuadDoor().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.HiCube86QuadDoor().name;
    }

    public String transportcountry() { return Transport.HiCube86QuadDoor().country; }

    public String transportYear() { return Transport.HiCube86QuadDoor().year; }

    public float transportTopSpeed() {
        return Transport.HiCube86QuadDoor().topSpeed;
    }

    public boolean isFictional() {
        return Transport.HiCube86QuadDoor().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.HiCube86QuadDoor().additionalTextTitle) + Transport.HiCube86QuadDoor().additionalText,
                RailUtility.translate(Transport.HiCube86QuadDoor().additionalTextTitle2) + Transport.HiCube86QuadDoor().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.HiCube86QuadDoor().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{12.05f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new HiCube86QuadDoor()};
    }

    public Item getItem() {
        return thisItem;
    }


}

