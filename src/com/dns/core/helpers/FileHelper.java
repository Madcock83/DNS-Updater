package com.dns.core.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileHelper {

    public static String retrieveString(InputStream file, int index) {

        String[] content = null;

        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(file));

            content = fileReader.readLine().split(";");
        } catch(IOException e) {
            e.printStackTrace();
        }
        return content[index];
    }
}
