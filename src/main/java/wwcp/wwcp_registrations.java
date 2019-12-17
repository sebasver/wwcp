package wwcp;


import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.item.Item;
import wwcp.blockEntities.platform.*;



public class wwcp_registrations {
    public static Item crafting_wheel;

    public static void registerBlocks()
    {
        //todo set right hitbox values for understated blocks + add in the right icons for the right things + language file entry
        TiMGenericRegistry.registerBlock(new BlockBorderPlatform().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/platforms"), null, "wwcp.platform", null, worldwidecontentpack.proxy.getRenderPlatform());
        TiMGenericRegistry.registerBlock(new BlockBorderPlatformSlopeLeft().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/Platform2"), null, "wwcp.platform2", null, worldwidecontentpack.proxy.getRenderPlatform());
        TiMGenericRegistry.registerBlock(new BlockBorderPlatformSlopeRight().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/Platform3"), null, "wwcp.platform3", null, worldwidecontentpack.proxy.getRenderPlatform());
        TiMGenericRegistry.registerBlock(new BlockPlatformStair().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/Platform4"), null, "wwcp.platform4", null, worldwidecontentpack.proxy.getRenderPlatform());
        TiMGenericRegistry.registerBlock(new BlockPlatformFullBlock().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/Platform5"), null, "wwcp.platform5", null, worldwidecontentpack.proxy.getRenderPlatform());
        TiMGenericRegistry.registerBlock(new BlockPlatformFullSlope().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/Platform6"), null, "wwcp.platform6", null, worldwidecontentpack.proxy.getRenderPlatform());
        TiMGenericRegistry.registerBlock(new BlockPlatformHalfSlope().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/Platform7"), null, "wwcp.platform7", null, worldwidecontentpack.proxy.getRenderPlatform());
        TiMGenericRegistry.registerBlock(new BlockPlatformSlab().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/Platform8"), null, "wwcp.platform8", null, worldwidecontentpack.proxy.getRenderPlatform());
        TiMGenericRegistry.registerBlock(new BlockPlatformStationLamp().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/Platform9"), null, "wwcp.platform9", null, worldwidecontentpack.proxy.getRenderPlatform());
        TiMGenericRegistry.registerBlock(new BlockPlatformSlabSlope().setCreativeTab(worldwidecontentpack.BlocksWWCP).setBlockTextureName("wwcp:blocks/Platform10"), null, "wwcp.platform10", null, worldwidecontentpack.proxy.getRenderPlatform());

    }
    public static void registerItems(){
        crafting_wheel = new Item().setUnlocalizedName("Crafting_Wheel").setTextureName("wwcp:craftingItems/crafting_wheel").setCreativeTab(worldwidecontentpack.BlocksWWCP);
        TiMGenericRegistry.RegisterItem(crafting_wheel,worldwidecontentpack.MODID,crafting_wheel.getUnlocalizedName(),null);
    }

}
