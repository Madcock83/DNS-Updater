package com.dns.core.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureObject;
import net.minecraft.util.ResourceLocation;

import com.dns.DNSUpdater;
import com.dns.core.helpers.FileHelper;
import com.dns.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CapeHandler {

    public static String getAdminCape() {

    	if(Reference.isOffline) {
    		
    		return DNSUpdater.class.getResource("/textures/dns/AdminCape.png").toString();
    	}
    	
        return FileHelper.retrieveString(DNSUpdater.class.getResourceAsStream("/ModPack"), Reference.ADMIN_CAPE_INDEX);
    }

    public static String getUserCape() {

    	if(Reference.isOffline) {
    		
    		return DNSUpdater.class.getResource("/textures/dns/UserCape.png").toString();
    	}
    	
        return FileHelper.retrieveString(DNSUpdater.class.getResourceAsStream("/ModPack"), Reference.USER_CAPE_INDEX);
    }

	public static ThreadDownloadImageData getDownloadThread(ResourceLocation resourceLocation, String url) {

		TextureManager texturemanager = Minecraft.getMinecraft().func_110434_K();
        Object object = texturemanager.func_110581_b(resourceLocation);

        if (object == null)
        {
            object = new ThreadDownloadImageData(url, resourceLocation, new CapeDownloadHandler());
            texturemanager.func_110579_a(resourceLocation, (TextureObject)object);
        }

        return (ThreadDownloadImageData)object;
	}
}
