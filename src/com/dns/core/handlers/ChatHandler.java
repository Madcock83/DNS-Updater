package com.dns.core.handlers;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.util.ChatMessageComponent;

public class ChatHandler {

	public static void sendChat(String message) {
		
		FMLClientHandler.instance().getClient().thePlayer.sendChatToPlayer(ChatMessageComponent.func_111077_e(message));
	}
}
