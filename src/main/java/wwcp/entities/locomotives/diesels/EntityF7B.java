package wwcp.entities.locomotives.diesels;

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
import wwcp.models.bogies.AmericanTrucks.Blomberg_B;
import wwcp.models.locomotives.diesels.F7B;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityF7B extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityF7B((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityF7B(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityF7B(World world) {
        super(world);
    }
    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.9F,0.08f,0},{-1.85F,0.08f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new Blomberg_B()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{1.78F, -1.78F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f,-0.05F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7B/EMD F7B Demo.png", "textures/bogies/blombergB_silver.png",
                "EMD Demonstrator", "Classic orange/white demonstrator scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7B/F7B CN Black and White.png", "textures/bogies/blombergB_black.png",
                "CN Wet Noodle", "Canadian National B-Unit with black white stripes");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7B/F7B_Bluebonnet.png", "textures/bogies/blombergB_silver.png",
                "Santa Fe Bluebonnet", "Santa Fe Bluebonnet B-Unit");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7B/F7B_Warbonnet.png", "textures/bogies/blombergB_silver.png",
                "Santa Fe Warbonnet", "Santa Fe Warbonnet B-Unit");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7B/F7B_Yellowbonnet.png", "textures/bogies/blombergB_silver.png",
                "Santa Fe Yellowbonnet", "Santa Fe Yellowbonnet B-Unit");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Diesel/F7B/MILW F7B.png", "textures/bogies/blombergB_black.png",
                "MILW orange/black", "Milwaukee Road orange body, black roof");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:EMD Demonstrator";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.F7B().reinforced;
    }

    public float weightKg() {
        return Transport.F7B().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.F7B().name;
    }

    public String transportcountry() { return Transport.F7B().country; }

    public String transportYear() { return Transport.F7B().year; }

    public float transportTopSpeed() {
        return Transport.F7B().topSpeed;
    }

    public boolean isFictional() {
        return Transport.F7B().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.F7B().additionalTextTitle) + Transport.F7B().additionalText,
                RailUtility.translate(Transport.F7B().additionalTextTitle2) + Transport.F7B().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.F7B().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{6.4f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new F7B()};
    }

    public Item getItem() {
        return thisItem;
    }


}