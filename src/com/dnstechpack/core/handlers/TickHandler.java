package com.dnstechpack.core.handlers;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;

import com.dnstechpack.configuration.DataProxy;
import com.dnstechpack.lib.Reference;

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
    }

    private void updater() {

        if(!VersionHandler.isUpdated()) {

            if(FMLClientHandler.instance().getClient().thePlayer != null) {

                if(tickCount == 0) {

                    System.out.println("[" + Reference.updaterName + "] There is a new update out: " + VersionHandler.getRemoteVersion() + " (Current Version: " + VersionHandler.getLocalVersion()
                            + ")");
                    String url = VersionHandler.packURL;
                    ChatHandler.sendChat(Reference.colour + "[" + Reference.updaterName + Reference.colour + "] Version " + VersionHandler.getRemoteVersion() + " is available now. You have " + url);
                    ChatHandler.sendChat(VersionHandler.getInfo());
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
}
