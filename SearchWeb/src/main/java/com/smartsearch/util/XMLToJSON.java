package com.smartsearch.util;

import java.io.File;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XMLToJSON {
	public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING =
        "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";
    public static String XML_DIR_PATH = "";

    public static void main(String[] args) {
        try {
        	
        	File dir = new File(XML_DIR_PATH);
        	if(dir.isDirectory()){
        		String files[] = dir.list();
        		if(files != null && files.length >0){
        			for(String f : files){
        				System.out.println(f);
        			}
        		}
        	}
        	
        	
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
    }
}
