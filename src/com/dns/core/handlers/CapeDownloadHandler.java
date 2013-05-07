package com.dns.core.handlers;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ImageBufferDownload;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CapeDownloadHandler implements IImageBuffer {

    private int imageWidth;
    private int imageHeight;

    public BufferedImage parseUserSkin(BufferedImage par1BufferedImage) {

        if(par1BufferedImage == null) {
            
            return null;
        } else {
            
            this.imageWidth = par1BufferedImage.getWidth();
            this.imageHeight = par1BufferedImage.getHeight();
            
            if(this.imageHeight > 32 && this.imageWidth > 64) {
                
                BufferedImage bufferedimage1 = new BufferedImage(this.imageWidth, this.imageHeight, 2);
                Graphics graphics = bufferedimage1.getGraphics();
                graphics.drawImage(par1BufferedImage, 0, 0, (ImageObserver) null);
                graphics.dispose();
                
                return bufferedimage1;
            } else {
                
                IImageBuffer buffer = new ImageBufferDownload();
                
                return buffer.parseUserSkin(par1BufferedImage);
            }
        }
    }
}
