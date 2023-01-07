package wwcp.entities.freight;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.api.TransportSkin;
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
import wwcp.models.bogies.AmericanTrucks.Roadrailer_Truck;
import wwcp.models.freight.Roadrailer53Dryvan;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityRoadrailer53Dryvan extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityRoadrailer53Dryvan((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityRoadrailer53Dryvan(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityRoadrailer53Dryvan(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{-3.75f,0.0f,0},{-3.22f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new Roadrailer_Truck()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{3.75F, -3.22F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(),new TransportSkin( worldwidecontentpack.MODID, "textures/freightskins/Roadrailer53Dryvan/TripleCrown_Large.png",
                "Triple Crown Large", "Large Triple Crown logo in Dual ownership NS-CR logos").setBogieTextures(new String[]{"textures/bogies/AmericanTrucks/Clear_Truck.png","textures/bogies/AmericanTrucks/RoadRailer_Truck_Black.png"}));
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.Roadrailer53Dryvan().reinforced;
    }

    public float weightKg() {
        return Transport.Roadrailer53Dryvan().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.Roadrailer53Dryvan().name;
    }

    public String transportcountry() { return Transport.Roadrailer53Dryvan().country; }

    public String transportYear() { return Transport.Roadrailer53Dryvan().year; }

    public float transportTopSpeed() {
        return Transport.Roadrailer53Dryvan().topSpeed;
    }

    public boolean isFictional() {
        return Transport.Roadrailer53Dryvan().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.Roadrailer53Dryvan().additionalTextTitle) + Transport.Roadrailer53Dryvan().additionalText,
                RailUtility.translate(Transport.Roadrailer53Dryvan().additionalTextTitle2) + Transport.Roadrailer53Dryvan().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.Roadrailer53Dryvan().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{7.1f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new Roadrailer53Dryvan()};
    }

    public Item getItem() {
        return thisItem;
    }


}

