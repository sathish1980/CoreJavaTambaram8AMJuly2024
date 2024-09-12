package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadData {
	
	String filepath= "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaTambaram8AMJuly2024\\Input\\simplejson.json";
	String filepath1= "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaTambaram8AMJuly2024\\Input\\Student.json";
	
	JSONParser parser = new JSONParser();
	public void ReadJSONData() throws FileNotFoundException, IOException, ParseException
	{
		 Object obj = parser.parse(new FileReader(filepath));
         JSONObject jsonObject = (JSONObject)obj;
       //  JSONArray jsonarray = (JSONArray)obj;
         System.out.println(jsonObject.get("color"));
	}

	
	public void ReadJSONDataasArray() throws FileNotFoundException, IOException, ParseException
	{
		JSONArray obj = (JSONArray)parser.parse(new FileReader(filepath1));
        // JSONObject jsonObject = (JSONObject)obj;
		JSONArray jsonarray = (JSONArray)obj;
         System.out.println(jsonarray.size());
        
         for (Object eachObject :jsonarray)
         {
        	JSONObject jsonObject = (JSONObject)eachObject;
        	String actualname = (String)jsonObject.get("name");
        	System.out.println(jsonObject.get("name"));
        	if(actualname.equalsIgnoreCase("Sathish"))
        	{
        	System.out.println(jsonObject.get("city"));
        	JSONArray allCars = (JSONArray)jsonObject.get("cars");
        	for(Object eachcar :allCars)
        	{
        		System.out.println(eachcar);
        	}
        	}
         }
         
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JsonReadData J = new JsonReadData();
		J.ReadJSONDataasArray();
	}

}
