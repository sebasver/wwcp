package wwcp;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import ebf.tim.entities.GenericRailTransport;
import fexcraft.tmt.slim.Vec3d;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ReportedException;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class EventManager {

    private static List<GenericRailTransport> arraylist,stock;
    private static Vec3d vert, vec, cacheVec;

    @SubscribeEvent
    public void entityJoinWorldEvent(EntityJoinWorldEvent event){
        if(event.world == null || !event.world.isRemote || !(event.entity instanceof EntityPlayer)) return;//fex-fix
        ((EntityPlayer)event.entity).addChatMessage(new ChatComponentText("For official releases please stay tuned in our discord at https://discord.gg/FVVAEpS"));
        ((EntityPlayer)event.entity).addChatMessage(new ChatComponentText("This is an alpha version. Everything is subject to change"));
      //  ((EntityPlayer)event.entity).addChatMessage(new ChatComponentText("Happy Hollidays! - The WWCP Team."));
    }



}
