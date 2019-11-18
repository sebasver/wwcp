package wwcp.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.items.ItemTransport;
import ebf.tim.utility.RailUtility;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.ArrayList;
import java.util.List;

public class WWCPItemTransport extends ItemTransport {

    private final List<String> subtext = new ArrayList<>();
    private static String t(String translate){
        return RailUtility.translate(translate);
    }
    private final Class<? extends GenericRailTransport> transport;

    @SideOnly(Side.CLIENT)
    GenericRailTransport entity;

    public WWCPItemTransport(GenericRailTransport cart, String MODID, CreativeTabs tabs) {
        super(cart, MODID, tabs);

        setUnlocalizedName(cart.transportName().replace(" ",""));

        subtext.add(EnumChatFormatting.BLUE + t("menu.item.year") +": " + cart.transportYear());

        subtext.add(EnumChatFormatting.BLUE + t("menu.item.country") + ": " +
                t("menu.item."+cart.transportcountry().toLowerCase()));

        if (cart.transportTopSpeed()!=0){
            subtext.add(EnumChatFormatting.RED + t("menu.item.speed") +": " + cart.transportTopSpeed() +" km/h");
        }

        if(cart.transportFuelType()!=null && !cart.transportFuelType().equals("")) {
            subtext.add(EnumChatFormatting.RED + t("menu.item.fueltype") + ": " +
                    t("menu.item."+cart.transportFuelType().toLowerCase()));
        }

        if(cart.getRiderOffsets()!=null){
            subtext.add(EnumChatFormatting.GREEN +t("menu.item.seats")+ ": " + cart.getRiderOffsets().length);
        }

        subtext.add(EnumChatFormatting.GREEN + t("menu.item.weighttons") +": " + (cart.weightKg()>0?cart.weightKg()/100:null + "metric tons"));

        if(cart.getInventoryRows()>0){
            subtext.add(EnumChatFormatting.GREEN +t("menu.item.isizeof")+ ": " + (cart.getInventoryRows()*9) + " " + t("menu.item.slots"));
        }

        if (cart.transportMetricHorsePower() !=0){
            subtext.add(EnumChatFormatting.GREEN +t("menu.item.mhp") +": " + cart.transportMetricHorsePower());
        }

        if (cart.transportTractiveEffort() != 0){
            subtext.add(EnumChatFormatting.GREEN + t("menu.item.tractiveeffort") +": " + cart.transportTractiveEffort() + " lbf");
        }

        if (cart.additionalItemText()!=null){
            for (String s : cart.additionalItemText()) {
                if(!s.equals("")) {
                    subtext.add(EnumChatFormatting.LIGHT_PURPLE + s);
                }
            }
        }

        if (cart.isFictional()){
            subtext.add(EnumChatFormatting.LIGHT_PURPLE +t("menu.item.fictional"));
        }



        transport=cart.getClass();
        setTextureName(MODID+":transports/"+getUnlocalizedName());
        setCreativeTab(tabs);
        if(TrainsInMotion.proxy.isClient()){
            entity=cart;
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.addAll(subtext);
    }


}
