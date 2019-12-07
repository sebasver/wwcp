package wwcp.entities.passengerstock;

    //This is a documentation class for copy pasting into a passenger entity file.

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.models.bogies.EurofimaBogie;
import wwcp.models.passengerStock.EurofimaRows;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


    public class EntityEurofimaRows extends GenericRailTransport {
        private static final String[] itemDescription = new String[]{
                "\u00A77" + StatCollector.translateToLocal("menu.item.weight") +": 2 " + StatCollector.translateToLocal("menu.item.tons"),
                "\u00A77" + StatCollector.translateToLocal("menu.item.seats") +": 4 " + StatCollector.translateToLocal("menu.item.players")};

        public static final Item thisItem = new ItemTransport(new EntityEurofimaRows(null), worldwidecontentpack.MODID , worldwidecontentpack.European);


        public EntityEurofimaRows(UUID owner, World world, double xPos, double yPos, double zPos) {
            super(owner, world, xPos, yPos, zPos);
        }
        public EntityEurofimaRows(World world){
            super(world);
        }

        @Override
        public boolean isReinforced() {
            return true;
        }

        @Override
        public float weightKg() {
            return 1814.3f;
        }

        @Override
        public String transportName() {
            return "Eurofima non compartmentalised";
        }

        @Override
        public String transportcountry() {
            return "Germany";
        }

        @Override
        public String transportYear() {
            return "1997-now";
        }

        @Override
        public String transportFuelType() {
            return null;
        }

        @Override
        public boolean isFictional() {
            return false;
        }

        @Override
        public String[] additionalItemText() {
            {return new String[]{RailUtility.translate("wwcp.era") + "II"};}
        }

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
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E1.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E2.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E3.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E4.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E5.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E6.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E7.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E8.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E9.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E10.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E11.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E12.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E13.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E14.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E15.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaNormalRows/E16.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional skin", "Livery used when just coming out of the Factory");


        }
        @Override
        public ItemStack[] getRecipie() {
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
        public float[][] getRiderOffsets(){return new float[][]{{1.5f,1.60f, -0.15f},{0.75f,0.5f, 0.2f},{-0.75f,0.5f, 0.2f},{-2f,0.5f, 0.2f}};}

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

