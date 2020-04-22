package wwcp.models.depreciated;

import fexcraft.tmt.slim.Tessellator;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import wwcp.worldwidecontentpack;

import javax.annotation.Nullable;

public class FourteenDisplayEntity extends TileEntity {

    private static FourteenDisplay model = new FourteenDisplay();
    private Integer meta =null;

    @Override
    public void func_145828_a(@Nullable CrashReportCategory report){

        if(report==null){

            Tessellator.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/14xxDisplay.png"));

            if(meta==null){
                meta=worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
            }
            GL11.glRotatef(90*meta,0,0,1);
            //TODO: this method is an upcoming feature in TiM to fix some GL lighting bugs. uncomment after the update to use it
//            Tessellator.adjustLightFixture(worldObj,xCoord,yCoord,zCoord);

            //TODO: this will reposition the model, by default it should be at the block position, but you may need to tweak it.
            GL11.glTranslatef(0.5f,0f,0.5f);

            //TODO: use this to rotate the model, the first value is the angle,
            // the others are a scale from 0 to 1 on how much of said value to use.
            GL11.glRotatef(180,0,0,1);
            model.render(null,0,0,0,0,0,0.0625f);


        } else {
            super.func_145828_a(report);
        }
    }


    //these two methods just make sure that the tile entity doesn't stick around if the host block is gone.
    @Override
    public boolean canUpdate(){return worldObj!=null && !worldObj.isRemote;}

    private int ticks=0;
    @Override
    public void updateEntity() {
        if (worldObj.isRemote) {
            return;
        }

        //modulate it so we only check every 20 ticks, helps server TPS.
        ticks++;
        if (ticks % 20 == 0){
            ticks = 0;
            if (!(worldObj.getBlock(xCoord, yCoord, zCoord) instanceof Display)) {
                worldObj.removeTileEntity(xCoord, yCoord, zCoord);
            }
        }
    }

    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
        }

        if (l == 1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
        }

        if (l == 2)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
        }

        if (l == 3)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
        }
    }


}


// this is Tile entity 1