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
import wwcp.models.freight.PS2Early3Bay;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityPS2Early3Bay extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityPS2Early3Bay((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityPS2Early3Bay(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityPS2Early3Bay(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.55f,0.0f,0},{-2.55f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.55F, -2.55F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/PS2Early3Bay/PS2CD3Bay_NP.png",
                "textures/bogies/70ton_truck_black.png",
                "NP", "Northern Pacific");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/PS2Early3Bay/PS2CD3Bay_RI.png",
                "textures/bogies/70ton_truck_black.png",
                "RI", "Chicago, Rock Island & Pacific");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/PS2Early3Bay/PS2CD3Bay_Generic.png",
                "textures/bogies/70ton_truck_black.png",
                "Generic", "Generic Hopper");

    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:NP";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.PS2Early3Bay().reinforced;
    }

    public float weightKg() {
        return Transport.PS2Early3Bay().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.PS2Early3Bay().name;
    }

    public String transportcountry() { return Transport.PS2Early3Bay().country; }

    public String transportYear() { return Transport.PS2Early3Bay().year; }

    public float transportTopSpeed() {
        return Transport.PS2Early3Bay().topSpeed;
    }

    public boolean isFictional() {
        return Transport.PS2Early3Bay().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.PS2Early3Bay().additionalTextTitle) + Transport.PS2Early3Bay().additionalText,
                RailUtility.translate(Transport.PS2Early3Bay().additionalTextTitle2) + Transport.PS2Early3Bay().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.PS2Early3Bay().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{7.0f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new PS2Early3Bay()};
    }

    public Item getItem() {
        return thisItem;
    }


}

