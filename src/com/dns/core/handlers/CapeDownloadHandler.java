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

    public BufferedImage parseUserSkin(BufferedImage baseImage) {

        if(baseImage == null) {

            return null;
        } else {

            this.imageWidth = baseImage.getWidth();
            this.imageHeight = baseImage.getHeight();

            if(this.imageHeight > 32 && this.imageWidth > 64) {

                BufferedImage image = new BufferedImage(this.imageWidth, this.imageHeight, 2);
                Graphics graphics = image.getGraphics();
                graphics.drawImage(baseImage, 0, 0, (ImageObserver) null);
                graphics.dispose();

                return image;
            } else {

                IImageBuffer buffer = new ImageBufferDownload();

                return buffer.parseUserSkin(baseImage);
            }
        }
    }
}
