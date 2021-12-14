package wwcp.entities.Advent;

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
import wwcp.models.freight.CattleWagonUK;
import wwcp.models.freight.UKopenwagon;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityUKCattleWagen extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityUKCattleWagen((World)null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityUKCattleWagen(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityUKCattleWagen(World world) {
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
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/cattlewagon/CattleWagon.png",
                "Default Cattle wagon",
                "This was the factory skin of the car");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.UKCattlewagen().reinforced;
    }

    public float weightKg() {
        return Transport.UKCattlewagen().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.UKCattlewagen().name;
    }

    public String transportcountry() { return Transport.UKCattlewagen().country; }

    public String transportYear() { return Transport.UKCattlewagen().year; }

    public float transportTopSpeed() {
        return Transport.UKCattlewagen().topSpeed;
    }

    public boolean isFictional() {
        return Transport.UKCattlewagen().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.UKCattlewagen().additionalTextTitle) + Transport.UKCattlewagen().additionalText,
                RailUtility.translate(Transport.UKCattlewagen().additionalTextTitle2) + Transport.UKCattlewagen().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.UKCattlewagen().rows;
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
        return new ModelBase[]{new CattleWagonUK()};
    }

    public Item getItem() {
        return thisItem;
    }


}
