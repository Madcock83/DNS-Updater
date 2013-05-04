package com.dns.core.proxy;

import com.dns.core.handlers.TickHandler;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerTickHandler()
	{
		TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
	}
}
