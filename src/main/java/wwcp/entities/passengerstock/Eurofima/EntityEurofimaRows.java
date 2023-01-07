package wwcp.entities.passengerstock.Eurofima;

    //This is a documentation class for copy pasting into a passenger entity file.

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.EUBogies.EurofimaBogie;
import wwcp.models.passengerStock.Eurofima.EurofimaRows;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


    public class EntityEurofimaRows extends GenericRailTransport {
        private static final String[] itemDescription = new String[]{
                "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
                "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

        public static final Item thisItem = new WWCPTransport(new EntityEurofimaRows(null), worldwidecontentpack.MODID , worldwidecontentpack.European);


        public EntityEurofimaRows(UUID owner, World world, double xPos, double yPos, double zPos) {
            super(owner, world, xPos, yPos, zPos);
        }
        public EntityEurofimaRows(World world){
            super(world);
        }

        @Override
        public boolean isReinforced() {
            return Transport.EurofimaRows().reinforced;
        }

        @Override
        public String transportName() {
            return Transport.EurofimaRows().name;
        }

        @Override
        public String transportcountry() {
            return Transport.EurofimaRows().country;
        }

        @Override
        public String transportYear() {
            return Transport.EurofimaRows().year;
        }

        @Override
        public float weightKg() {
            return Transport.EurofimaRows().weightinKGs;
        }

        @Override
        public boolean isFictional() {
            return Transport.EurofimaRows().fictional;
        }

        @Override
        public String[] additionalItemText() {
            {return new String[]{RailUtility.translate(Transport.EurofimaRows().additionalTextTitle) + Transport.EurofimaRows().additionalText,
                    RailUtility.translate(Transport.EurofimaRows().additionalTextTitle2) + Transport.EurofimaRows().additionalText2};}
        }

        @Override
        public String transportFuelType() {return null;}

        /**
         * <h1>Variable Overrides</h1>
         */

        @Override
            public float[][] bogieModelOffsets() {
                return new float[][]{{4.55f,0.15f,0},{-5.4f,0.12f,0}};
            }

        @Override
        public ModelBase[] bogieModels() {
            return new ModelBase[]{new EurofimaBogie()};
        }

        /**
         * <h2>Bogie Offset</h2>
         */
        @Override
        public float[] bogieLengthFromCenter(){return new float[]{5.4f,-5.4f};}

        @Override
        public float getRenderScale() {
            return 0.0625f;
        }

        @Override
        public float[][] modelOffsets() {
            return new float[][]{{-0.25f,-0.15F,0.F}};
        }

        @Override
        public void registerSkins() {
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/1/2Years_WWCP.png", "textures/bogies/Eurofimabogie.png",
                    "Fictional British Rail Livery", "Fake livery");
        }

        /*@Override
        public String getDefaultSkin() {
            return "";
        }*/

        @Override
        public ItemStack[] getRecipe() {
            return new ItemStack[]{
                    DefineStack(Items.bed, 1), null, null,
                    null, null, null,
                    null, null, null
            };
        }

        /**
         * <h2>Inventory Size</h2>
         */
        @Override
        public int getInventoryRows(){return 0;}
        /**
         * <h2>Type</h2>
         */

        public TrainsInMotion.transportTypes getType(){return TrainsInMotion.transportTypes.PASSENGER;}
        /**
         * <h2>Rider offsets</h2>
         */
        @Override
        public float[][] getRiderOffsets(){return new float[][]{{2.2f,1.1f, 0.2f}};}

        @Override
        public float[] getHitboxSize() {
            return new float[]{13.75f,2,1.5f};
        }

        @Override
        public float getPistonOffset() {
            return 0;
        }

        @Override
        public ModelBase[] getModel(){return new ModelBase[]{new EurofimaRows()};}

        /**
         * <h2>pre-asigned values</h2>
         */
        @Override
        public Item getItem(){
            return thisItem;
        }
    }

