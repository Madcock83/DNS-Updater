package com.dns.core.handlers;

import com.dns.core.helpers.VersionHelper;

public class VersionHandler {

    private static String remoteVersion;
    private static String localVersion;
    private static String info;

    private static String type;
    public static String packURL;

    public static void init() {

        remoteVersion = VersionHelper.resolveRemoteVersion(type);
        info = VersionHelper.resolveInfo(type);

        String[] localVersionContent = VersionHelper.resolveLocalVersion();
        localVersion = localVersionContent[0];
        packURL = localVersionContent[0];
    }

    public static boolean isUpdated() {

        return localVersion.equalsIgnoreCase(remoteVersion);
    }

    public static String getRemoteVersion() {

        return remoteVersion;
    }

    public static String getLocalVersion() {

        return localVersion;
    }

    public static void setType(String string) {

        type = string;
    }

    public static String getType() {

        return type;
    }

    public static String getInfo() {

        return info;
    }
}
