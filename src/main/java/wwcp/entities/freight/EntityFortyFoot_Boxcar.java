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
import wwcp.models.bogies.truck_70ton;
import wwcp.models.freight.FortyFoot_Boxcar;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityFortyFoot_Boxcar extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityFortyFoot_Boxcar((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityFortyFoot_Boxcar(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityFortyFoot_Boxcar(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{2.45f,0.08f,0},{-1.70f,0.08f,0}};
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
        return new float[][]{{-0.475f,-0.1F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar - CNR, Red Orange - Aluminium.png", "textures/bogies/70ton_truck_black.png",
                "CNR Maple Leaf, Aluminium Sheathed", "Canadian National Railway Red Orange Boxcar with aluminium sheathed sides");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar - ON, Teal.png", "textures/bogies/70ton_truck_black.png",
                "Ontario Northland Teal", "Ontario Northland Teal with white lettering");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar - TH&B.png", "textures/bogies/70ton_truck_black.png",
                "Toronto Hamilton and Buffalo Yellow/black", "Toronto Hamilton and Buffalo yellow scheme with black door, roof and sides");

    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Fortyfoot_Boxcar().reinforced;
    }

    public float weightKg() {
        return Transport.Fortyfoot_Boxcar().weightinKGs;
    }

    public ItemStack[] getRecipie() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Fortyfoot_Boxcar().name;
    }

    public String transportcountry() { return Transport.Fortyfoot_Boxcar().country; }

    public String transportYear() { return Transport.Fortyfoot_Boxcar().year; }

    public float transportTopSpeed() {
        return Transport.Fortyfoot_Boxcar().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Fortyfoot_Boxcar().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Fortyfoot_Boxcar().additionalTextTitle) + Transport.Fortyfoot_Boxcar().additionalText,
                RailUtility.translate(Transport.Fortyfoot_Boxcar().additionalTextTitle2) + Transport.Fortyfoot_Boxcar().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Fortyfoot_Boxcar().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{5.4f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new FortyFoot_Boxcar()};
    }

    public Item getItem() {
        return thisItem;
    }


}

