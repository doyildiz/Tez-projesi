package com.servlet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class JsonClass {
	String dsc = null;
	ArrayList<String> genList = new ArrayList<String>();
	Gen gen = new Gen();
	
	public String desc(String hastalýk){
		

		
		
		String filePath ="C:\\tez_proje\\desc.xml";
		
		
		
		try{
			
			FileReader reader = new FileReader(filePath);
			JSONParser jsonParser = new JSONParser();

		    JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
		    JSONArray description= (JSONArray) jsonObject.get("description");
		    Iterator i = description.iterator();
		    
		    while (i.hasNext()) {
	   	    	
	   	    	 JSONObject innerObj = (JSONObject) i.next();
	   	    	
	   	    	if(hastalýk.equals(innerObj.get("NAME").toString())){
	   	    	
	   	    		//System.out.println((String) innerObj.get("NAME"));
	   	    		//System.out.println(innerObj.get("DESCRIPTION"));
	   	    		dsc = innerObj.get("DESCRIPTION").toString();
	   	    	
	   	    	}
	   	    	
				
			
			
		    }
	} catch (FileNotFoundException ex) {
			
	        ex.printStackTrace();

	    } catch (IOException ex) {

	        ex.printStackTrace();

	    } catch (ParseException ex) {

	        ex.printStackTrace();

	    } catch (NullPointerException ex) {

	        ex.printStackTrace();

	    }

return dsc;
		
	
	
	}
	
public ArrayList<String> geneList(String name){

	
	String filePath ="C:\\tez_proje\\geneList.xml";
	
try{
		
		FileReader reader = new FileReader(filePath);
		JSONParser jsonParser = new JSONParser();

	    JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
	    JSONArray geneList= (JSONArray) jsonObject.get("geneList");
	    Iterator i = geneList.iterator();
	    
	    while (i.hasNext()) {
   	    	
   	    	 JSONObject innerObj = (JSONObject) i.next();
   	    	 
   	    	 
   	    	if(name.equals(innerObj.get("DISEASE_NAME").toString())){
   	    	
   	    	
   	    		JSONArray arrays = (JSONArray) innerObj.get("GENEID");
   	            for (Object object : arrays) {		
   	            	String al;
   	            	al=object.toString();
   	    		
   	           
   	    		genList.add(al);
   	    		
   	    		
   	    		
   	    	
   	            	
   	            }
   	    		
   	    	break;
   	    	}
			
   	    	
			
	    }
	   	

} catch (FileNotFoundException ex) {
	   			
	   	        ex.printStackTrace();

	   	    } catch (IOException ex) {

	   	        ex.printStackTrace();

	   	    } catch (ParseException ex) {

	   	        ex.printStackTrace();

	   	    } catch (NullPointerException ex) {

	   	        ex.printStackTrace();

	   	    }

return genList;

}

}

