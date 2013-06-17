package com.dns.core.handlers;

import com.dns.DNSUpdater;
import com.dns.core.helpers.FileHelper;
import com.dns.lib.Reference;

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
}
