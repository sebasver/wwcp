package wwcp.Armor;


import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import sun.misc.Resource;
import wwcp.worldwidecontentpack;



public class ArmorTM extends ItemArmor {

    public ArmorTM(ArmorMaterial material, int render_idx, int type){
        super(material, render_idx, type);

        this.setMaxStackSize(1);
        this.setCreativeTab(worldwidecontentpack.Germany);
        this.setUnlocalizedName("Custom_Armor");
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item%s%s",worldwidecontentpack.MODID, getUnwrappedUnLocalizedName(super.getUnlocalizedName()));
    }
    @Override
    public String getUnlocalizedName(ItemStack itemstack){
        return String.format("item%s%s",worldwidecontentpack.MODID,getUnwrappedUnLocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnLocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1 );
    }


    public void registerIcon(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf('.') + 1 ));
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String Layer){

        String name = this.getUnwrappedUnLocalizedName(super.getUnlocalizedName());
        name = name.substring(0, name.indexOf('_'));

        return String.format("%s:textures/models/armor/%s_layer%d.png", worldwidecontentpack.MODID,name,slot == 2 ? 2 : 1);

    }

}
