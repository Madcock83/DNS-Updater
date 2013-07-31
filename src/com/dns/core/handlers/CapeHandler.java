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

    public static ResourceLocation getAdminCape() {
        
    	return new ResourceLocation("dns", "textures/misc/AdminCape.png");
    }

    public static ResourceLocation getUserCape() {
        
    	return new ResourceLocation("dns", "textures/misc/UserCape.png");
    }
}
