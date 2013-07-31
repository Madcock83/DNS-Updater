package com.dns.core.proxy;

import net.minecraft.entity.player.EntityPlayer;

import com.dns.client.RenderPlayerDNS;
import com.dns.core.handlers.TickHandler;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerTickHandler() {

        TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
        RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, new RenderPlayerDNS());
    }
}
