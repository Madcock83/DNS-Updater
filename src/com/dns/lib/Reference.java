package com.dns.lib;

import java.util.List;

import com.dns.configuration.DataProxy;
import com.dns.core.helpers.URLHelper;

public class Reference {

    public static final String modID = "DNS_Updater";
    public static final String modName = "DNS Updater";
    public static final String version = "4.03";
    public static final String client = "com.dns.core.proxy.ClientProxy";
    public static final String common = "com.dns.core.proxy.CommonProxy";
    public static final String type = "@TYPE@";
    public static final String options = DataProxy.Category_Settings;

    public static String updaterName;
    public static String outputColour;
    public static String colour;
    
    public static boolean allowCape;

   /* public static final String[] staff = new String[] {

            "Wizard111", "Trevail69", "angrychicken83", "skully250", "vydax", "darknetix", "tesmodderman", "darkhax", "viper283", "Llamafaggot" 
    };*/
    
    // TODO: use correct url
    // TODO: get from the ModPack file
    public static List<String> staffList = URLHelper.retrieveStringList(FileHelper.retrieveString(DNSUpdater.class.getResourceAsStream("/ModPack"), STAFF_LIST_INDEX));

    public static final int VERSION_INDEX = 0;
    public static final int ADMIN_CAPE_INDEX = 1;
    public static final int USER_CAPE_INDEX = 2;
    public static final int STAFF_LIST_INDEX = 3;
}
