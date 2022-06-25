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
import wwcp.models.bogies.EUBogies.SGNSSBogie;
import wwcp.models.freight.Habiins_12;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityHabiins_12 extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityHabiins_12((World)null), worldwidecontentpack.MODID, worldwidecontentpack.European);

    public EntityHabiins_12(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityHabiins_12(World world) {
        super(world);
    }
    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{4.6F,0.08f,0},{-4.6F,0.08f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new SGNSSBogie()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{4.6F, -4.6F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0.0f,-0.05F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Habiins_12/HabiinsMärklin.png", "textures/bogies/SGNSSBogie2.png",
                "Habiins 12 Märklin", "This is commercial for Märklin");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Habiins_12/HabiinsTWAGray.png", "textures/bogies/SGNSSBogie2.png",
                "Habiins 12 TWA Grey", "This was the most common livery to see in real life, mostly when they came out from factories");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Habiins_12/HabiinsTWABrownGray.png", "textures/bogies/SGNSSBogie2.png",
                "Habiins 12 TWA Brown and Grey", "This was the most common livery to see in real life, mostly when they came out from factories");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Habiins_12/HabiinsTWABrownGray.png", "textures/bogies/SGNSSBogie2.png",
                "Habiins 12 TWA Brown", "They ar dirty from brake dust, and other from of dust and dirt.");
    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:Habiins 12 TWA Grey";
    }

        @Override
        public String transportFuelType() {
            return null;
        }

        public boolean isReinforced() {
            return Transport.Habiins_12().reinforced;
        }

        public float weightKg() {
            return Transport.Habiins_12().weightinKGs;
        }

        public ItemStack[] getRecipe() {
            return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
        }

        public String transportName() {
            return Transport.Habiins_12().name;
        }

        public String transportcountry() { return Transport.Habiins_12().country; }

        public String transportYear() { return Transport.Habiins_12().year; }

        public float transportTopSpeed() {
            return Transport.Habiins_12().topSpeed;
        }

        public boolean isFictional() {
            return Transport.Habiins_12().fictional;
        }

        @Override
        public String[] additionalItemText() {
            {return new String[]{RailUtility.translate(Transport.Habiins_12().additionalTextTitle) + Transport.Habiins_12().additionalText,
                    RailUtility.translate(Transport.Habiins_12().additionalTextTitle2) + Transport.Habiins_12().additionalText2};}
        }
        public int getInventoryRows() {
            return Transport.Habiins_12().rows;
        }

        public TrainsInMotion.transportTypes getType() {
            return TrainsInMotion.transportTypes.FREIGHT;
        }

        public float[][] getRiderOffsets() {
            return null;
        }

        public float[] getHitboxSize() {
            return new float[]{11.55f, 3f, 1.6F};
        }

        public float getPistonOffset() {
            return 0.0F;
        }

        public ModelBase[] getModel() {
            return new ModelBase[]{new Habiins_12()};
        }

        public Item getItem() {
            return thisItem;
        }
}