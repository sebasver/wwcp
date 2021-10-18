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
import wwcp.models.freight.UKTanker;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityUKTanker extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityUKTanker((World)null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityUKTanker(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityUKTanker(World world) {
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
        return new float[][]{{0.625f,0F,0.065F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_1.png",
                "WWCP UK Tanker 1",
                "This skin represents the WWCP community");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_2.png",
                "Yellow UK Tanker",
                "This Tanker is carrying Petrol, proceed with caution");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_3.png",
                "Grey UK Tanker",
                "This Tanker is just Grey");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_4.png",
                "White UK Tanker",
                "This Tanker is carrying milk, don't cry if you spill some");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_5.png",
                "Red UK Tanker 1",
                "This Tanker is just Red");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_6.png",
                "Green UK Tanker",
                "This Tanker is just Green");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_7.png",
                "Blue UK Tanker",
                "It's Blue daba dee daba die");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_8.png",
                "Black UK Tanker",
                "This Tanker is carrying Oil");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_9.png",
                "Red UK Tanker2 ",
                "This Tanker is carrying Diesel");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_10.png",
                "Lime Green UK Tanker",
                "I don't know about you, but this seems toxic");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/UKTanker/UK_Tanker_Texture_11.png",
                "WWCP UK Tanker 2",
                "This skin represents the WWCP community");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.UKTanker().reinforced;
    }

    public float weightKg() {
        return Transport.UKTanker().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.UKTanker().name;
    }

    public String transportcountry() { return Transport.UKTanker().country; }

    public String transportYear() { return Transport.UKTanker().year; }

    public float transportTopSpeed() {
        return Transport.UKTanker().topSpeed;
    }

    public boolean isFictional() {
        return Transport.UKTanker().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.UKTanker().additionalTextTitle) + Transport.UKTanker().additionalText,
                RailUtility.translate(Transport.UKTanker().additionalTextTitle2) + Transport.UKTanker().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.UKTanker().rows;
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
        return new ModelBase[]{new UKTanker()};
    }

    public Item getItem() {
        return thisItem;
    }


}
