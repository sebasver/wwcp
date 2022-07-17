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
import wwcp.models.freight.AAR40ftStandardBoxcar;
import wwcp.models.freight.FortyFoot_Boxcar;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class Entity40ftAAR_Boxcar extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new Entity40ftAAR_Boxcar((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public Entity40ftAAR_Boxcar(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public Entity40ftAAR_Boxcar(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.90f,0.0f,0},{-2.1f,0.0f,0}};
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
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Pacemaker_N.png",
                "textures/bogies/70ton_truck_black.png",
                "NYC Pacemaker", "New York Central Pacemaker livery for passenger service");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_SLSF_N.png",
                "textures/bogies/70ton_truck_black.png",
                "SLSF", "Ship it on the Frisco! slogan");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_WP_N.png",
                "textures/bogies/70ton_truck_black.png",
                "WP", "Large WP logo");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_THB.png",
                "textures/bogies/70ton_truck_black.png",
                "TH&B", "Toronto, Hamilton & Buffalo in Yellow with patched numbers");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_CP_Script.png",
                "textures/bogies/70ton_truck_black.png",
                "CPR Script", "Canadian Pacific in Script Lettering");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_CBQ.png",
                "textures/bogies/70ton_truck_black.png",
                "CB&Q", "Chicago, Burlington & Quincy in chinese red 'way of the zephyrs'");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_NP.png",
                "textures/bogies/70ton_truck_black.png",
                "NP", "Northern Pacific arc lettering");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_WP_Feather.png",
                "textures/bogies/70ton_truck_black.png",
                "WP Feather", "Western Pacific - Rides Like a Feather");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_SPS.png",
                "textures/bogies/70ton_truck_black.png",
                "SP&S", "Spokane, Portland & Seattle");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_CN.png",
                "textures/bogies/70ton_truck_black.png",
                "CN Noodle", "Canadian National in noodle scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_RI.png",
                "textures/bogies/70ton_truck_black.png",
                "CRI&P", "Chicago, Rock Island block lettering");

    }

    @Override
    public String getDefaultSkin() {
        return "wwcp:WP";
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.AAR40ft().reinforced;
    }

    public float weightKg() {
        return Transport.AAR40ft().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.AAR40ft().name;
    }

    public String transportcountry() { return Transport.AAR40ft().country; }

    public String transportYear() { return Transport.AAR40ft().year; }

    public float transportTopSpeed() {
        return Transport.AAR40ft().topSpeed;
    }

    public boolean isFictional() {
        return Transport.AAR40ft().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.AAR40ft().additionalTextTitle) + Transport.AAR40ft().additionalText,
                RailUtility.translate(Transport.AAR40ft().additionalTextTitle2) + Transport.AAR40ft().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.AAR40ft().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{5.9f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new AAR40ftStandardBoxcar()};
    }

    public Item getItem() {
        return thisItem;
    }


}

