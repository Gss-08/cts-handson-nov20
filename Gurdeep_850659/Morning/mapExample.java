package com.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapExample {

	public static void main(String[] args) {
		Map<String, List<String>> hm = new HashMap<String, List<String>>();
		List<String> l1 = new ArrayList<String>();
		l1.add("Sam");
		l1.add("Deep");
		hm.put("CS",l1);
		 List<String> l2 = new ArrayList<String>();
		l2.add("Deepak");
		l2.add("Sunita");
		hm.put("EC",l2);
		for (Map.Entry<String, List<String>> entry : hm.entrySet())
		  {
		   String key = entry.getKey();
		   List<String> values = entry.getValue();
		   System.out.println("Key = " + key);
		   System.out.println("Values = " + values);

}
}
}

