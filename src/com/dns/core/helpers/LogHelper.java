package com.dns.core.helpers;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class LogHelper
{
	private static Logger LOGGER = Logger.getLogger(LogHelper.class.getSimpleName());
	
	public static void init()
	{
		LOGGER.setParent(FMLLog.getLogger());
	}
	
	public static void log(Level level, String message)
	{
		LOGGER.log(level, message);
	}
}
