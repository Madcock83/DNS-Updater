package com.dnstechpack.core.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileHelper {

    public static String retrieveString(InputStream file, int index) {

        ArrayList<String> content = new ArrayList<String>();
        
        try {
            
            String line;
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
            
            while((line = reader.readLine()) != null) {
                
                content.add(line);
            }
        } catch(IOException e) {
            
            e.printStackTrace();
        }
        
        return content.get(index);
        
//        String[] content = null;
//
//        try {
//            BufferedReader fileReader = new BufferedReader(new InputStreamReader(file));
//
//            content = fileReader.readLine().split(";");
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//        return content[index];
    }
}
