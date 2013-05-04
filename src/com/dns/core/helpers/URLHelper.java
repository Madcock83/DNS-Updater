package com.dns.core.helpers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import com.dns.lib.Reference;

public class URLHelper
{

	public static String retrieveString(String url) {
	    
		String urlContent = Reference.version + "_local";
		
		try	{
		    
			BufferedReader urlReader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			urlContent = urlReader.readLine();
		} catch(Exception e) {
		    
			e.printStackTrace();
		}
		
		return urlContent;
	}

}
