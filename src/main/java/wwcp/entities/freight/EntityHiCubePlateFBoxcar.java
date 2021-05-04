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
import wwcp.models.freight.HiCubePlateFBoxcar;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityHiCubePlateFBoxcar extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityHiCubePlateFBoxcar((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityHiCubePlateFBoxcar(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityHiCubePlateFBoxcar(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{3f,0.0f,0},{-3f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{3.0F, -3.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,-0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hi_Cube_60ft_Boxcar_doubledoor/60ft_Boxcar-CP.png", "textures/bogies/70ton_truck_black.png",
                "Canadian Pacific With Black/White Beaver, Block Lettering", "Red CP Boxcar With black and white beaver circular logo");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Hi_Cube_60ft_Boxcar_doubledoor/60ft_Boxcar_MILW.png", "textures/bogies/70ton_truck_black.png",
                "Milwaukee Road Yellow", "MILW Yellow with a 'Waffle' like ribbed texture");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Hi_Cube_Plate_F_Boxcar().reinforced;
    }

    public float weightKg() {
        return Transport.Hi_Cube_Plate_F_Boxcar().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Hi_Cube_Plate_F_Boxcar().name;
    }

    public String transportcountry() { return Transport.Hi_Cube_Plate_F_Boxcar().country; }

    public String transportYear() { return Transport.Hi_Cube_Plate_F_Boxcar().year; }

    public float transportTopSpeed() {
        return Transport.Hi_Cube_Plate_F_Boxcar().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Hi_Cube_Plate_F_Boxcar().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Hi_Cube_Plate_F_Boxcar().additionalTextTitle) + Transport.Hi_Cube_Plate_F_Boxcar().additionalText,
                RailUtility.translate(Transport.Hi_Cube_Plate_F_Boxcar().additionalTextTitle2) + Transport.Hi_Cube_Plate_F_Boxcar().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Hi_Cube_Plate_F_Boxcar().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{8.4f, 2.25f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new HiCubePlateFBoxcar()};
    }

    public Item getItem() {
        return thisItem;
    }


}

