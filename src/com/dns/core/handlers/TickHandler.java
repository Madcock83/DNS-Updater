package com.dns.core.handlers;

import java.util.EnumSet;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

import com.dns.configuration.DataProxy;
import com.dns.lib.Reference;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler {

    private int tickCount = DataProxy.delay;
    private String label = Reference.updaterName.toUpperCase().replace(" ", "_") + "_TICKHANDLER";
    private Minecraft mc;

    @Override
    public void tickStart(EnumSet<TickType> type, Object... tickData) {

    }

    @Override
    public void tickEnd(EnumSet<TickType> type, Object... tickData) {

        mc = Minecraft.getMinecraft();

        updater();
        
        if(allowCape()) {
        
        	cape();
        }
    }

    @SuppressWarnings("rawtypes")
    private void cape() {

        if(mc.theWorld != null && mc.theWorld.playerEntities.size() > 0) {

            List players = mc.theWorld.playerEntities;

            for(int counter = 0; counter < players.size(); counter++) {

                if(players.get(counter) != null) {

                    EntityPlayer thePlayer = (EntityPlayer) players.get(counter);
                    String oldCloak = thePlayer.cloakUrl;

                    for(String staff : Reference.staff) {

                        if(thePlayer.username.equalsIgnoreCase(staff)) {

                            String newCloakUrl;

                            newCloakUrl = CapeHandler.getAdminCape();

                            thePlayer.cloakUrl = newCloakUrl;
                            break;
                        } else {

                            String newCloakUrl = CapeHandler.getUserCape();
                            thePlayer.cloakUrl = newCloakUrl;
                        }
                    }

                    if(thePlayer.cloakUrl != oldCloak) {

                        mc.renderEngine.obtainImageData(thePlayer.cloakUrl, new CapeDownloadHandler());
                    }
                }
            }
        }
    }

    private void updater() {

        if(!VersionHandler.isUpdated()) {

            if(FMLClientHandler.instance().getClient().thePlayer != null) {

                if(tickCount == 0) {

                    System.out.println("[" + Reference.updaterName + "] There is a new update out: " + VersionHandler.getRemoteVersion() + " (Current Version: " + VersionHandler.getLocalVersion()
                            + ")");
                    String url = VersionHandler.packURL;
                    FMLClientHandler.instance().getClient().thePlayer.sendChatToPlayer(Reference.colour + "[" + Reference.updaterName + Reference.colour + "] Version "
                            + VersionHandler.getRemoteVersion() + " is available now. You have " + url);
                    FMLClientHandler.instance().getClient().thePlayer.sendChatToPlayer(VersionHandler.getInfo());
                    tickCount = -1;
                } else {

                    --tickCount;
                }
            }
        }
    }

    @Override
    public EnumSet<TickType> ticks() {

        return EnumSet.of(TickType.CLIENT);
    }

    @Override
    public String getLabel() {

        return label;
    }
    
    private boolean allowCape() {
        
        return Reference.allowCape;
    }
}
