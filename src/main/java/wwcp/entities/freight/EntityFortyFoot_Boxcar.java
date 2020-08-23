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
        return new float[][]{{2.05f,0.08f,0},{-2.05f,0.08f,0}};
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
        return new float[][]{{-0F,-0.1F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar - CNR, Red Orange - Aluminium.png", "textures/bogies/70ton_truck_black.png",
                "CNR Maple Leaf, Aluminium Sheathed", "Canadian National Railway Red Orange Boxcar with aluminium sheathed sides");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar - ON, Teal.png", "textures/bogies/70ton_truck_black.png",
                "Ontario Northland Teal", "Ontario Northland Teal with white lettering");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar - TH&B.png", "textures/bogies/70ton_truck_black.png",
                "Toronto Hamilton and Buffalo Yellow/black", "Toronto Hamilton and Buffalo yellow scheme with black door, roof and sides");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_UP.png", "textures/bogies/70ton_truck_black.png",
                "Union Pacific ,brown", "Union Pacific brown boxcar with classic logo and lettering");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_TBR.png", "textures/bogies/70ton_truck_black.png",
                "Thatcher Brook Railroad, Red", "TBR red boxcar, with logo and block lettering");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_SOO.png", "textures/bogies/70ton_truck_black.png",
                "SOO Line, brown", "Soo line brown boxcar with block lettering");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_NH.png", "textures/bogies/70ton_truck_black.png",
                "New Haven, Orange", "New Haven orange boxcar with white/black logo");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_IC.png", "textures/bogies/70ton_truck_black.png",
                "Illinois Central, Brown", "Illinois central brown boxcar, block lettering");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_FEC_Speedway_Blue.png", "textures/bogies/70ton_truck_black.png",
                "FEC Speedway, Blue", "FEC Speedway in blue scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_FEC_Speedway.png", "textures/bogies/70ton_truck_black.png",
                "FEC Speedway, Brown", "FEC Speedway in brown scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_FEC_Cane.png", "textures/bogies/70ton_truck_black.png",
                "FEC Cane, white", "FEC Cane Boxcar, white scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_EJ&E.png", "textures/bogies/70ton_truck_black.png",
                "EJ&E, black and Orange", "Elgin, Joliet and Eastern Railway boxcar in orange/Black scheme, Block lettering");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_DRGWOrangeSilverRoof.png", "textures/bogies/70ton_truck_black.png",
                "DRGW, Orange/Silver", "DRGW with silver and orange scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_DRGWGoldSilverRoof.png", "textures/bogies/70ton_truck_black.png",
                "DRGW, Gold/Silver", "DRGW with silver and gold scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_DRGW.png", "textures/bogies/70ton_truck_black.png",
                "DRGW, Brown", "DRGW with brown scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_CBQ.png", "textures/bogies/70ton_truck_black.png",
                "Burlington Route, Red", "Burlington Route Logo with red body");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_CN Regular.png", "textures/bogies/70ton_truck_black.png",
                "Canadian National, Wet Noodle, brown", "Canadian National with wet noodle logo and brown body");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_CPR regular.png", "textures/bogies/70ton_truck_black.png",
                "Canadian Pacific, block lettering", "Canadian Pacific block lettering and brown body");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_CNR Red Orange, White Leaf.png", "textures/bogies/70ton_truck_black.png",
                "CNR, Red Orange, White Maple Leaf", "Canadian National Railway boxcar with white maple leaf logo in red/orange scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_CNR Red Orange.png", "textures/bogies/70ton_truck_black.png",
                "CNR, Red Orange", "Canadian National Railway boxcar with maple leaf logo in red/orange scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_CNR Regular.png", "textures/bogies/70ton_truck_black.png",
                "CNR, Brown, Maple Leaf", "Canadian National Railway boxcar with maple leaf logo in brown scheme");
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/Boxcar_40ft/40ft_Boxcar_CNR White Leaf.png", "textures/bogies/70ton_truck_black.png",
                "CNR, Brown, White Leaf", "Canadian National Railway boxcar with white maple leaf logo in brown scheme");
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
        return new float[]{5.9f, 2f, 1.6F};
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

