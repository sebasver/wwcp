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
import wwcp.models.freight.GN40HomebuiltBoxcar;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityGN40HomebuiltBoxcar extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityGN40HomebuiltBoxcar((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityGN40HomebuiltBoxcar(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityGN40HomebuiltBoxcar(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.90f,0.0f,0},{-2.1f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.0F, -2.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GN40HomebuiltBoxcar/GN_40_homebuilt_boxcar_BSB.png", "textures/bogies/70ton_truck_black.png",
                "GN Big Sky Blue", "Great Northern wanted to modernise its image in the mid 1960s. They did this by simplifying their logo and using a brand new colour scheme they advertised as Big Sky Blue on everything. Here they used a large simplified logo and modern Gothic lettering.");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GN40HomebuiltBoxcar/GN_40_homebuilt_boxcar_Glacier_Green.png", "textures/bogies/70ton_truck_black.png",
                "GN Glacier Green", "");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GN40HomebuiltBoxcar/GN_40_homebuilt_boxcar_Glacier_Green_2.png", "textures/bogies/70ton_truck_black.png",
                "GN Glacier Green Late", "");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GN40HomebuiltBoxcar/GN_40_homebuilt_boxcar_Maroon.png", "textures/bogies/70ton_truck_black.png",
                "GN Maroon", "When the Great Northern built the class of boxcars in 1953 they were painted in Mineral Red as standard with other boxcars owned at the time.");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GN40HomebuiltBoxcar/GN_40_homebuilt_boxcar_red_1.png", "textures/bogies/70ton_truck_black.png",
                "GN Red 1", "Great Northern had several different styles of Vermillion Red boxcars. In this case they used a large logo and the Empire Builder font introduced in 1947 with the streamlining of the Empire Builder.");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/GN40HomebuiltBoxcar/GN_40_homebuilt_boxcar_red_2.png", "textures/bogies/70ton_truck_black.png",
                "GN Red 2", "Great Northern had several different styles of Vermillion Red boxcars. In this case they used a small logo and an angled serifed font.");

    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:GN Big Sky Blue";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.GN40HomebuiltBoxcar().reinforced;
    }

    public float weightKg() {
        return Transport.GN40HomebuiltBoxcar().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.GN40HomebuiltBoxcar().name;
    }

    public String transportcountry() { return Transport.GN40HomebuiltBoxcar().country; }

    public String transportYear() { return Transport.GN40HomebuiltBoxcar().year; }

    public float transportTopSpeed() {
        return Transport.GN40HomebuiltBoxcar().topSpeed;
    }

    public boolean isFictional() {
        return Transport.GN40HomebuiltBoxcar().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.GN40HomebuiltBoxcar().additionalTextTitle) + Transport.GN40HomebuiltBoxcar().additionalText,
                RailUtility.translate(Transport.GN40HomebuiltBoxcar().additionalTextTitle2) + Transport.GN40HomebuiltBoxcar().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.GN40HomebuiltBoxcar().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{5.6f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new GN40HomebuiltBoxcar()};
    }

    public Item getItem() {
        return thisItem;
    }


}

