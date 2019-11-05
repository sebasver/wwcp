package wwcp.tiles.platforms.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import wwcp.blocks.BlockBorderPlatform;
import wwcp.blocks.BlockBorderPlatformSlope;
import wwcp.blocks.BlockCenterPlatform;
import wwcp.blocks.BlockCenterPlatformSlope;
import wwcp.models.platforms.*;
import wwcp.tiles.platforms.*;
import wwcp.worldwidecontentpack;


//Class made by Oskiek (with little help from Eternal).
@SideOnly(Side.CLIENT)
public class RenderPlatform extends TileEntitySpecialRenderer {

    public static int type;

    //To add more, just add new private static Model customName. Like below.
    private static BlockBorderPlatform platform1;
    private static BlockBorderPlatformSlope platform2;
    private static BlockCenterPlatform platform3;
    private static BlockCenterPlatformSlope platform4;



    public void Render() {
        platform1 = new BlockBorderPlatform();
        platform2 = new BlockBorderPlatformSlope();
        platform3 = new BlockCenterPlatform();
        platform4 = new BlockCenterPlatformSlope();

    }


    //Best if you have one texture for all platform blocks. If not then you simply change resource location to to have some String instead of "namexxx.png".
    // Then you set this string from ClientProxy before you register new block.
    private static ResourceLocation texture = new ResourceLocation("wwcp:textures/blocks/Platform.png");


    //You'll have to play with these values yourself. Just do your models renders in correct place. These have to be good for all models at once.
    //idea: make all models centered in SMP and on the same height.
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_147500_8_) {
        Render();
        GL11.glPushMatrix();
        switch (tileEntity.getBlockMetadata()) {
            default: {
                GL11.glTranslatef((float) x, (float) y, (float) z);
                break;
            }
            case 0:
            case 5:
            case 3:
            case 4:
            case 2: {
                GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 0.5F);
                break;
            }
        }


        int rotation = 0;
        switch (tileEntity.getBlockMetadata() % 4) {
            case 0:
                rotation = 0;
                break;
            case 1:
                rotation = 270;
                break;
            case 2:
                rotation = 180;
                break;
            case 3:
                rotation = 90;
                break;
        }
        GL11.glRotatef(rotation, 0.0F, 1.0F, 0.0F);

        //general height
        GL11.glTranslatef(0F, 0f, 0f);
        GL11.glRotatef(180, 1, 0, 0);


        //Explaination!
        /*
        To add new block, you simply copy entire "if" method and you change "platform1" to whatever name you've set above
        */
        if (tileEntity instanceof TileEntityPlatform) {
            fexcraft.tmt.slim.TextureManager.bindTexture(new ResourceLocation(worldwidecontentpack.MODID,"textures/blocks/Platform.png"));
            platform1.render();
        }

        if (tileEntity instanceof TileEntityPlatformSecond) {
            TextureManager.bindTexture(texture);
            platform2.render();
        }
        if (tileEntity instanceof TileEntityPlatformThird) {
            TextureManager.bindTexture(texture);
            platform3.render();
        }

        if (tileEntity instanceof TileEntityPlatformFourth) {
            TextureManager.bindTexture(texture);
            platform4.render();
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