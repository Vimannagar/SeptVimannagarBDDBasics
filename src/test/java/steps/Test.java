package steps;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		List<String> al = new ArrayList<String>();
		
		al.add("Pune");
		al.add("Mumbai");
		al.add("Hyderabad");
		al.add("Bengaluru");
		
		
		System.out.println(al);
		
		String valueat0 = al.get(0);
		
		System.out.println(valueat0);
	}

}
