package wwcp.models.depreciated;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Display extends Block implements ITileEntityProvider

{
    public boolean isOpaqueCube(){return false;}

    public Display() {
        //NOTE FROM ETERNAL: don't use materials directly, breaks some extension stuff
        // this is a workaround that gives same result, go to the variable declaration to see other options.
        super(new Material(MapColor.mapColorArray[13]));
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta){return new FourteenDisplayEntity();
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata){
        return new FourteenDisplayEntity();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

}
//this is Block class 1

//this is Block class 1
