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
import wwcp.models.freight.NSC53Wellcar;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityNSC53Wellcar extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityNSC53Wellcar((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityNSC53Wellcar(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityNSC53Wellcar(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{4.1f,0.0f,0},{-4.1f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{4.1F, -4.1F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_Empty.png", "textures/bogies/70ton_truck_black.png",
                "TTX Empty", "TTX Empty Wellcar");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_1.png", "textures/bogies/70ton_truck_black.png",
                "TTX 1", "Containers 1");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_2.png", "textures/bogies/70ton_truck_black.png",
                "TTX 2", "Containers 2");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_3.png", "textures/bogies/70ton_truck_black.png",
                "TTX 3", "Containers 3");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_4.png", "textures/bogies/70ton_truck_black.png",
                "TTX 4", "Containers 4");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_5.png", "textures/bogies/70ton_truck_black.png",
                "TTX 5", "Containers 5");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_6.png", "textures/bogies/70ton_truck_black.png",
                "TTX 6", "Containers 6");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_7.png", "textures/bogies/70ton_truck_black.png",
                "TTX 7", "Containers 7");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_8.png", "textures/bogies/70ton_truck_black.png",
                "TTX 8", "Containers 8");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_9.png", "textures/bogies/70ton_truck_black.png",
                "TTX 9", "Containers 9");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/NSC53Wellcar/NSC53Wellcar_10.png", "textures/bogies/70ton_truck_black.png",
                "TTX 10", "Containers 10");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:TTX Empty";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.NSC53Wellcar().reinforced;
    }

    public float weightKg() {
        return Transport.NSC53Wellcar().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.NSC53Wellcar().name;
    }

    public String transportcountry() { return Transport.NSC53Wellcar().country; }

    public String transportYear() { return Transport.NSC53Wellcar().year; }

    public float transportTopSpeed() {
        return Transport.NSC53Wellcar().topSpeed;
    }

    public boolean isFictional() {
        return Transport.NSC53Wellcar().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.NSC53Wellcar().additionalTextTitle) + Transport.NSC53Wellcar().additionalText,
                RailUtility.translate(Transport.NSC53Wellcar().additionalTextTitle2) + Transport.NSC53Wellcar().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.NSC53Wellcar().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{9.8f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new NSC53Wellcar()};
    }

    public Item getItem() {
        return thisItem;
    }


}

