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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class EventManager {

    private static List<GenericRailTransport> arraylist,stock;
    private static Vec3d vert, vec, cacheVec;

    @SubscribeEvent
    public void entityJoinWorldEvent(EntityJoinWorldEvent event){
        if(event.world == null || !event.world.isRemote || event.entity instanceof EntityPlayer == false) return;//fex-fix
        ((EntityPlayer)event.entity).addChatMessage(new ChatComponentText("You are currently playing a Press teaser release of WWCP"));
        ((EntityPlayer)event.entity).addChatMessage(new ChatComponentText("For official releases please stay tuned in our discord at https://discord.gg/FVVAEpS"));
        ((EntityPlayer)event.entity).addChatMessage(new ChatComponentText("Keep in mind that everything in this mod is currently subject to change and might be buggy."));
        ((EntityPlayer)event.entity).addChatMessage(new ChatComponentText("Have fun playing this teaser - The WWCP Team."));

    }



}
