package minimarketShop;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {

		TreeMap<String,Integer> cars = new TreeMap<>();
		
		cars.put("kia", 2);
		cars.put("Mazda", 5);
		cars.put("Toyaota", 7);
		cars.put("bmw", 4);
		
		Set<Entry<String,Integer>> set= cars.entrySet();
		
		for(Entry<String,Integer> e:set) {
			System.out.println(e.getKey() +" " + e.getValue());
			
		}
		
	}

}
