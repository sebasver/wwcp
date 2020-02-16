package wwcp.entities.passengerstock;

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
import wwcp.entities.TransportDetails;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.EurofimaBogie;
import wwcp.models.passengerStock.EurofimaRows;
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
            return TransportDetails.EurofimaRows().reinforced;
        }

        @Override
        public String transportName() {
            return TransportDetails.EurofimaRows().name;
        }

        @Override
        public String transportcountry() {
            return TransportDetails.EurofimaRows().country;
        }

        @Override
        public String transportYear() {
            return TransportDetails.EurofimaRows().year;
        }

        @Override
        public float weightKg() {
            return TransportDetails.EurofimaRows().weightinKGs;
        }

        @Override
        public boolean isFictional() {
            return TransportDetails.EurofimaRows().fictional;
        }

        @Override
        public String[] additionalItemText() {
            {return new String[]{RailUtility.translate(TransportDetails.EurofimaRows().additionalTextTitle) + TransportDetails.EurofimaRows().additionalText,
                    RailUtility.translate(TransportDetails.EurofimaRows().additionalTextTitle2) + TransportDetails.EurofimaRows().additionalText2};}
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
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E1.png", "textures/bogies/Eurofimabogie.png",
                    "Fictional British Rail Livery", "Fake livery");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E2.png", "textures/bogies/Eurofimabogie.png",
                    "PKP Inter-city Livery", "Paintjob used by PKP on Eurofima coaches");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E4.png", "textures/bogies/Eurofimabogie.png",
                    "Czech railway livery", "Used by the Czech State railway");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E5.png", "textures/bogies/Eurofimabogie.png",
                    "SNCF Eurofima", "Standard used SNCF Livery on eurofimas");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E6.png", "textures/bogies/Eurofimabogie.png",
                    "Deutshe Bahn Livery", "Livery used by the Deutshe Bahn");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E7.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima Factory Livery", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E8.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima NMBS", "Livery used by the NMBS/SNCB");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E9.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima OBB", "Livery used by the OBB");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E10.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima Renfe", "Livery used by Renfe");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E11.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima SBB night", "Livery used on SBB night trains");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E12.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima SBB", "Livery used by SBB day trains");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E14.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional one skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E15.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima WWCP promotional two skin", "Livery used when just coming out of the Factory");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/EurofimaCompartment/E16.png", "textures/bogies/Eurofimabogie.png",
                    "Eurofima Trams in Motion", "Promotional Livery for TramsIm");
        }

        @Override
        public String getDefaultSkin() {
            return "wwcp:Eurofima Factory Livery";
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

