package Collections;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class MapInterfaceconcepts {
	
	public void Mapconcepts()
	{
		//LinkedHashMap<Integer,String> H = new LinkedHashMap<>();
		TreeMap<Object,String> H = new TreeMap<>();
		System.out.println(H);
		H.put(1, "Sathish");
		H.put(3, "r");
		H.put(2, "btech");
		H.put(4, "kumar");
		H.put(1, "kumar");
		H.put(5, null);
		System.out.println(H);
		
		
		System.out.println(H.get(5));
		System.out.println(H.keySet());
		System.out.println(H.values());
		System.out.println(H.entrySet());
		
		for(Map.Entry M : H.entrySet())
		{
			System.out.println(M);
			System.out.println(M.getKey());
			System.out.println(M.getValue());
		}
		
		H.remove(4,"Sathish");
		System.out.println(H);
		H.replace(4, "Raja");
		System.out.println(H);
		//H.put("sathish", "Kumar");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapInterfaceconcepts M = new MapInterfaceconcepts();
		M.Mapconcepts();
	}

}
