package com.dns.lib;

import java.util.List;

import com.dns.DNSUpdater;
import com.dns.configuration.DataProxy;
import com.dns.core.helpers.FileHelper;
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
    
    public static boolean allowCape = true;
    public static boolean isOffline = false;
    
    public static final int VERSION_INDEX = 0;
    public static final int STAFF_LIST_INDEX = 1;

    public static List<String> staffList = URLHelper.retrieveStringList(FileHelper.retrieveString(DNSUpdater.class.getResourceAsStream("/ModPack"), STAFF_LIST_INDEX));
}
