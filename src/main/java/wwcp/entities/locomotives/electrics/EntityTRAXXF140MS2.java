package wwcp.entities.locomotives.electrics;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.items.ItemTransport;
import ebf.tim.models.Bogie;
import ebf.tim.models.ParticleFX;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.DebugUtil;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import wwcp.entities.SuperStat;
import wwcp.models.bogies.flexxpower;
import wwcp.models.locomotives.F140MS2;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;
import net.minecraft.init.Items;

    public class EntityTRAXXF140MS2 extends EntityTrainCore {

        public static final Item thisItem = new ItemTransport(new EntityTRAXXF140MS2(null), worldwidecontentpack.MODID,worldwidecontentpack.European);

        public EntityTRAXXF140MS2(UUID owner, World world, double xPos, double yPos, double zPos) {
            super(owner, world, xPos, yPos, zPos);
        }
        public EntityTRAXXF140MS2(World world){
            super(world);
        }

        @Override
        public String transportName(){return "Bombardier TRAXX F140 MS2";}
        @Override
        public String transportcountry(){return "Europe";}
        @Override
        public String transportYear(){return "2004-now";}

        @Override
        public String transportFuelType() {
            return "Electric";
        }

        @Override
        public String[] additionalItemText() {
            {return new String[]{RailUtility.translate( ("wwcp.era") + " VI")};}}

        @Override
        public boolean isFictional(){return false;}
        @Override
        public float transportTractiveEffort(){return 0;}

        @Override
        public void registerSkins(){
            SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T1.png", "textures/bogies/Flexxpower.png","Belgian Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
            SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T2.png", "textures/bogies/Flexxpower.png","NS Livery", "Used by the NS in their regular service");
            SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T3.png", "textures/bogies/Flexxpower.png", "Polish Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
            SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T4.png", "textures/bogies/Flexxpower.png","Easter Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
            SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T5.png", "textures/bogies/Flexxpower.png","Silesian Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
            SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T6.png", "textures/bogies/Flexxpower.png", "HLE28 NMBS Cargo", "Used by the NMBS/SNCB in belgium for freight trains");
            SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T7.png", "textures/bogies/Flexxpower.png","Valentines Day Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
            SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T8.png", "textures/bogies/Flexxpower.png","WWCP Commercial Livery", "Used by the NMBS/SNCB in belgium for freight trains");
            SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T9.png", "textures/bogies/Flexxpower.png","StPatricks Day Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
            SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/locomotive/Electric/F140MS2/T10.png", "textures/bogies/Flexxpower.png", "Halloween Theme Skin", "Used by the NMBS/SNCB in belgium for freight trains");
        }

        @Override
        public String getDefaultSkin(){
            return "HLE28 NMBS Cargo";
        }

        @Override
        public float transportTopSpeed(){return 140f;}

        @Override
        public int getInventoryRows(){return 1;}

        public TrainsInMotion.transportTypes getType() {return TrainsInMotion.transportTypes.ELECTRIC;
        }

        @Override
        public float getMaxFuel(){return 20;}

        @Override
        public float[][] getRiderOffsets(){return new float[][]{{-3.82f,1.4f, -0.25f}};}

        @Override
        public float[] getHitboxSize() {
            return new float[]{9.5f,2.5f,1.5f};
        }

        @Override
        public float transportMetricHorsePower(){return 75f;}

        @Override
        public float weightKg(){return 10886.2169f;}


        public ItemStack[] getRecipie() {
            return new ItemStack[]{
                    null, null, null,
                    null, null, null,
                    null, null, null
            };
        }

        @Override
        public float[][] bogieModelOffsets(){return new float[][]{{2.5f,0.05f,0},{-2.5f,0.05f,0}};
        }

        @Override
        public ModelBase[] bogieModels() {return new ModelBase[]{new flexxpower()}; }

        @Override
        public float[] bogieLengthFromCenter() {
            return new float[]{2, -2};
        }

        @Override
        public float getRenderScale() {
            return  0.0625f;
        }

        @Override
        public float[][] modelOffsets() {
            return new float[][]{{0f,-0.15F,0.F}};}

        @Override
        public boolean shouldRiderSit(){
            return true;
        }

        @Override
        public boolean isReinforced(){return false;}


        @Override
        public int[] getTankCapacity(){return new int[]{9161, 800};}

        @SideOnly(Side.CLIENT)
        public int[] getParticleData(int id) {
            DebugUtil.println(id);
            switch (id) {
                case 0: {
                    return new int[]{3, 100, 0x232323};//smoke
                }
                case 1: {
                    return new int[]{5, 100, 0x232323};//heavy smoke
                }
                case 2: {
                    return new int[]{2, 100, 0xEEEEEE};//steam
                }
                case 3: {
                    return new int[]{6, 100, 0xCECDCB};//led lamp
                }
                case 4: {
                    return new int[]{3, 50, 0xCC0000};//reverse lamp
                }
                case 5: {
                    return new int[]{2, 25, 0x800080};//small sphere lamp
                }
                default: {
                    return new int[]{6, 100, 0xCCCC00};//lamp
                }
            }
        }

        @Override
        public boolean isItemValidForSlot(int slot, ItemStack stack){
            switch (slot){
                case 400:{return stack!=null && stack.getItem() ==Items.redstone;}
                default:{return true;}
            }}


            /**
             * <h2>fuel management</h2>
             * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
             */

            public void manageFuel() {
                this.fuelHandler.manageElectric(this);
            }

        public Item getItem(){
            return thisItem;
        }

        public ModelBase[] getModel(){return new ModelBase[]{new F140MS2()};}

        /**
         * <h2>sets the resource location for sounds, like horn and the sound made for the engine running</h2>
         */
        @SideOnly(Side.CLIENT)
        @Override
        public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
        @SideOnly(Side.CLIENT)
        @Override
        public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
    }


