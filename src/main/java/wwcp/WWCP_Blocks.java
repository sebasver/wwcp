package wwcp;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import wwcp.blocks.*;

//Class made by Oskiek.
public class WWCP_Blocks {

    //here you add next blocks after ,
    public static Block  Platform, PlatformSecond, PlatformThird, PlatformFourth;
    public static List<Block>blockList=new ArrayList<Block>();


    public static void registerBlocks()
    {

        //Explaination!
        /*
        You just copy entire "blockList.add" line, you input correct block name you set in "public static Block", after "new" you write block class name and then you probably know what to do.
        */
        blockList.add(Platform=new BlockPlatform().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/platforms/platform"));
        blockList.add(PlatformSecond=new BlockPlatformSecond().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/platforms/platformsecond"));
        blockList.add(PlatformThird=new BlockPlatformThird().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/platforms/platformthird"));
        blockList.add(PlatformFourth=new BlockPlatformFourth().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/platforms/platformfourth"));

        //this could be removed but it's just for checking. Spams log if there's a lot of blocks
        for(Block block:blockList)
        {
            System.out.println(block);
            GameRegistry.registerBlock(block, block.getUnlocalizedName());
        }
    }


}
