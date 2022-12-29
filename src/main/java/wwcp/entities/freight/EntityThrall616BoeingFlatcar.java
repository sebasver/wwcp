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
import wwcp.models.freight.Thrall616BoeingFlatcar;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityThrall616BoeingFlatcar extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityThrall616BoeingFlatcar((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityThrall616BoeingFlatcar(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityThrall616BoeingFlatcar(World world) {
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
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Thrall616BoeingFlatcar/Thrall_61_6_flatcar_boeing.png", "textures/bogies/70ton_truck_black.png",
                "Boeing w/ GN BSB", "In the 60s and 70s Boeing needed to transport large parts from across the country to their factory in Everett, Washington. The Great Northern had several series of cars that were specifically used for transporting large pieces of aircraft for Boeing.");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:Boeing w/ GN BSB";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Thrall616BoeingFlatcar().reinforced;
    }

    public float weightKg() {
        return Transport.Thrall616BoeingFlatcar().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Thrall616BoeingFlatcar().name;
    }

    public String transportcountry() { return Transport.Thrall616BoeingFlatcar().country; }

    public String transportYear() { return Transport.Thrall616BoeingFlatcar().year; }

    public float transportTopSpeed() {
        return Transport.Thrall616BoeingFlatcar().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Thrall616BoeingFlatcar().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Thrall616BoeingFlatcar().additionalTextTitle) + Transport.Thrall616BoeingFlatcar().additionalText,
                RailUtility.translate(Transport.Thrall616BoeingFlatcar().additionalTextTitle2) + Transport.Thrall616BoeingFlatcar().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Thrall616BoeingFlatcar().rows;
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
        return new ModelBase[]{new Thrall616BoeingFlatcar()};
    }

    public Item getItem() {
        return thisItem;
    }


}

