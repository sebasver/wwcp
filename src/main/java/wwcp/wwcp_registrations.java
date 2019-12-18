package wwcp;


import cpw.mods.fml.common.registry.GameRegistry;
import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import wwcp.blockEntities.platform.*;

import java.util.Timer;


public class wwcp_registrations {
    public static Item crafting_wheel, platform_asphalt;
    public static Block blockBorderPlatform, blockBorderPlatformSlopeLeft, blockBorderPlatformSlopeRight, blockPlatformStair, blockPlatformFullBlock,
            blockPlatformFullSlope, blockPlatformHalfSlope, blockPlatformSlab, blockPlatformStationLamp, blockPlatformSlabSlope;

    static ItemStack inkSack = new ItemStack(Items.dye, 1, 0);
    static ItemStack redDye = new ItemStack(Items.dye, 1, 1);
    static ItemStack greenDye = new ItemStack(Items.dye, 1, 2);
    static ItemStack brownDye = new ItemStack(Items.dye, 1, 3);
    static ItemStack blueDye = new ItemStack(Items.dye, 1, 4);
    static ItemStack purpleDye = new ItemStack(Items.dye, 1, 5);
    static ItemStack cyanDye = new ItemStack(Items.dye, 1, 6);
    static ItemStack lightGrayDye = new ItemStack(Items.dye, 1, 7);
    static ItemStack grayDye = new ItemStack(Items.dye, 1, 8);
    static ItemStack pinkDye = new ItemStack(Items.dye, 1, 9);
    static ItemStack limeDye = new ItemStack(Items.dye, 1, 10);
    static ItemStack yellowDye = new ItemStack(Items.dye, 1, 11);
    static ItemStack lightBlueDye = new ItemStack(Items.dye, 1, 12);
    static ItemStack magentaDye = new ItemStack(Items.dye, 1, 13);
    static ItemStack orangeDye = new ItemStack(Items.dye, 1, 14);
    static ItemStack whiteDye = new ItemStack(Items.dye, 1, 15);

    public static void registerItems() {
        crafting_wheel = new Item().setUnlocalizedName("Crafting_Wheel").setTextureName("wwcp:icon/crafting_wheel").setCreativeTab(worldwidecontentpack.BlocksWWCP);
        TiMGenericRegistry.RegisterItem(crafting_wheel, worldwidecontentpack.MODID, crafting_wheel.getUnlocalizedName(), null);

        platform_asphalt = new Item().setUnlocalizedName("platform_asphalt").setTextureName("wwcp:icon/platform_asphalt").setCreativeTab(worldwidecontentpack.BlocksWWCP);
        TiMGenericRegistry.RegisterItem(platform_asphalt, worldwidecontentpack.MODID, platform_asphalt.getUnlocalizedName(), null);

        GameRegistry.addRecipe(new ItemStack(wwcp_registrations.platform_asphalt, 3), "   ", "   ", "X X", 'X', Blocks.stone);
    }

    public static void registerBlocks() {
        //todo set right hitbox values for understated blocks + add in the right icons for the right things + language file entry
        blockBorderPlatform = new BlockBorderPlatform().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/borderSlab");
        TiMGenericRegistry.registerBlock(blockBorderPlatform, null, "wwcp.blockBorderPlatform", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockBorderPlatformSlopeLeft = new BlockBorderPlatformSlopeLeft().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/slabslopeleft");
        TiMGenericRegistry.registerBlock(blockBorderPlatformSlopeLeft, null, "wwcp.blockBorderPlatformSlopeLeft", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockBorderPlatformSlopeRight = new BlockBorderPlatformSlopeRight().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/slabsloperight");
        TiMGenericRegistry.registerBlock(blockBorderPlatformSlopeRight, null, "wwcp.blockBorderPlatformSlopeRight", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformStair = new BlockPlatformStair().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/stair");
        TiMGenericRegistry.registerBlock(blockPlatformStair, null, "wwcp.blockPlatformStair", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformFullBlock = new BlockPlatformFullBlock().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/platblock");
        TiMGenericRegistry.registerBlock(blockPlatformFullBlock, null, "wwcp.blockPlatformFullBlock", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformFullSlope = new BlockPlatformFullSlope().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/fullSlope");
        TiMGenericRegistry.registerBlock(blockPlatformFullSlope, null, "wwcp.blockPlatformFullSlope", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformHalfSlope = new BlockPlatformHalfSlope().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/slabtofull");
        TiMGenericRegistry.registerBlock(blockPlatformHalfSlope, null, "wwcp.blockPlatformHalfSlope", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformSlab = new BlockPlatformSlab().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/platslab");
        TiMGenericRegistry.registerBlock(blockPlatformSlab, null, "wwcp.blockPlatformSlab", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformStationLamp = new BlockPlatformStationLamp().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/stationlampplatform");
        TiMGenericRegistry.registerBlock(blockPlatformStationLamp, null, "wwcp.blockPlatformStationLamp", null, worldwidecontentpack.proxy.getRenderPlatform());

        blockPlatformSlabSlope = new BlockPlatformSlabSlope().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:icon/slabslope");
        TiMGenericRegistry.registerBlock(blockPlatformSlabSlope, null, "wwcp.blockPlatformSlabSlope", null, worldwidecontentpack.proxy.getRenderPlatform());

        GameRegistry.addRecipe(new ItemStack(blockBorderPlatform, 1), "   ", "   ", "XXX", 'X', platform_asphalt);
    }
}
