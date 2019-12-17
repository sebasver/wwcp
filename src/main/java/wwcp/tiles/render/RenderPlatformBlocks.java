package wwcp.tiles.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import wwcp.models.block.platform.*;
import wwcp.tiles.platforms.*;
import wwcp.worldwidecontentpack;


//Class made by Oskiek (with little help from Eternal).
@SideOnly(Side.CLIENT)
public class RenderPlatformBlocks extends TileEntitySpecialRenderer {

    public static int type;

    //To add more, just add new private static Model customName. Like below.
    private static BorderPlatformSlab borderPlatform = new BorderPlatformSlab();
    private static BorderplatformSlopeLeft borderplatformSlopeLeft = new BorderplatformSlopeLeft();
    private static BorderplatformSlopeRight borderplatformSlopeRight = new BorderplatformSlopeRight();
    private static PlatformFullBlock platformFullBlock = new PlatformFullBlock();
    private static PlatformFullSlope platformFullSlope = new PlatformFullSlope();
    private static PlatformHalfSlope platformHalfSlope = new PlatformHalfSlope();
    private static PlatformSlab platformSlab = new PlatformSlab();
    private static PlatformSlabSlope platformSlabSlope = new PlatformSlabSlope();
    private static PlatformStair platformStair = new PlatformStair();
    private static PlatformStationLamp platformStationLamp = new PlatformStationLamp();


    //You'll have to play with these values yourself. Just do your models renders in correct place. These have to be good for all models at once.
    //idea: make all models centered in SMP and on the same height.
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_147500_8_) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x, (float) y, (float) z);


        int rotation = 0;
        switch (tileEntity.getBlockMetadata() % 4) {
            case 0:
                rotation = 0;
                GL11.glTranslatef(0.5F, 0f, 0.5f);
                break;
            case 1:
                rotation = 270;
                GL11.glTranslatef(0.5F, 0f, 0.5f);
                break;
            case 2:
                rotation = 180;
                GL11.glTranslatef(0.5F, 0f, 0.5f);
                break;
            case 3:
                rotation = 90;
                GL11.glTranslatef(0.5F, 0f, 0.5f);
                break;
        }
        GL11.glRotatef(rotation, 0F, 1.0F, 0.0F);

        //general height

        GL11.glRotatef(180, 1, 0, 0);


        //Explaination!
        /*
        To add new block, you simply copy entire "if" method and you change "platform1" to whatever name you've set above
        */
        if (tileEntity instanceof TileEntityBorderPlatform) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/platforms/PlatformBlock.png"));
            borderPlatform.render();
        } else if (tileEntity instanceof TileEntityBorderPlatformSlopeLeft) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/platforms/PlatformBlock.png"));
            borderplatformSlopeLeft.render();
        } else if (tileEntity instanceof TileEntityBorderPlatformSlopeRight) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/platforms/PlatformBlock.png"));
            borderplatformSlopeRight.render();
        } else if (tileEntity instanceof TileEntityPlatformFullBlock) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/platforms/PlatformBlock.png"));
            platformFullBlock.render();
        } else if (tileEntity instanceof TileEntityPlatformFullSlope) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/platforms/PlatformBlock.png"));
            platformFullSlope.render();
        } else if (tileEntity instanceof TileEntityPlatformHalfSlope) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/platforms/PlatformBlock.png"));
            platformHalfSlope.render();
        } else if (tileEntity instanceof TileEntityPlatformSlab) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/platforms/PlatformBlock.png"));
            platformSlab.render();
        } else if (tileEntity instanceof TileEntityPlatformSlabSlope) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/platforms/PlatformBlock.png"));
            platformSlabSlope.render();
        } else if (tileEntity instanceof TileEntityPlatformStair) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/platforms/PlatformBlock.png"));
            platformStair.render();
        } else if (tileEntity instanceof TileEntityPlatformStationLamp) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/platforms/BRLampER.png"));
            platformStationLamp.render();
        }

        GL11.glPopMatrix();
    }


    //Black magic below, dont ask
    private void adjustRotatePivotViaMeta(World world, int x, int y, int z)
    {
        GL11.glPushMatrix();
        GL11.glPopMatrix();
    }


    private void adjustLightFixture(World world, int i, int j, int k, Block block)
    {
        Tessellator tess = Tessellator.instance;
        float brightness = block.getLightOpacity(world, i, j, k);
        int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
        int modulousModifier = skyLight % 65536;
        int divModifier = skyLight / 65536;
        tess.setColorOpaque_F(brightness, brightness, brightness);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
    }


}