package Collections;

import java.util.*;

public class SetExamples {
	/*
	 * duplicate will not accept
	 * we can not able to update
	 * 
	 * HashSet--insertion order will be random
	 * LinkedHashSet -maintain the insertion order
	 * TreeSet-- maintain ascending order
	 */
	
	public void setimplementation()
	{
		String value= "intial";
	//	Set<String> h = new HashSet<>();
		ArrayList<String> al = new ArrayList<>();
		//Collection<String> h = new LinkedHashSet<>();
		Collection<String> h = new TreeSet<>();
		System.out.println(h);
		
		for(int i=0;i<100;i++)
		{
		if(!value.equalsIgnoreCase("stop"))
		{
		System.out.println("Enter the item: ");
		Scanner s = new Scanner(System.in);
		value = s.nextLine();
		if(!value.equalsIgnoreCase("stop"))
			h.add(value);
		}
		else
		{
			break;
		}
	
		}
		
		System.out.println(h);
		//if(h.contains("rice"))
		h.remove("rice");
	
		//
		//h.clear();
		System.out.println(h);
		al.addAll(h);
		
		System.out.println(h.contains("dog"));
		
		for (String eachvalue : h)
		{
			if(eachvalue.equalsIgnoreCase("dog"))
			{
				System.out.println("yes it avaiable");
			}
			System.out.println(eachvalue);
		}
		
		List<Object> L1 = new ArrayList();
		L1.addAll(h);
		Collections.sort(L1,Collections.reverseOrder());
		System.out.println(L1);
		//h.clear();
		//h.add(L1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetExamples s = new SetExamples();
		s.setimplementation();
	}

}
