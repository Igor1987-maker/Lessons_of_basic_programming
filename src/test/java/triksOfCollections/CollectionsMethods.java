package triksOfCollections;

import java.util.*;

public class CollectionsMethods {

	public static void main(String[] args) {

		String str = "money,happy,hello,bye,hello,money,happy,bye,money";
		String letters = "c,b,b,a,b,a,a,c";

		charsCount(letters);
		System.out.println("\n===================================================\n");
		wordsInReverseOrder(str);

		double[] decMax = {-2.8, -8.8, 2.3, 7.9, 4.1, -1.4, 11.3, 10.4,
				8.9, 8.1, 5.8, 5.9, 7.8, 4.9, 5.7, -0.9, -0.4, 7.3, 8.3, 6.5, 9.2,
				3.5, 3, 1.1, 6.5, 5.1, -1.2, -5.1, 2, 5.2, 2.1};

		System.out.println("\n===================================================\n");
		System.out.println("My biggest value ------------> "+maxValue(decMax));
		System.out.println("My biggest value 2 !!! ------------> "+maxValue2(decMax));

	}

	private static double maxValue(double [] decMax){

		//List<Double> list = new ArrayList<>();
		Set<Double> set = new TreeSet<>();
		for(Double d:decMax){
			set.add(d);
		}
	return Collections.max(set);
	}

	private static double maxValue2(double [] decMax){
		Set<Double> set = new TreeSet<>(Collections.reverseOrder());
		for(Double d:decMax){
			set.add(d);
		}
		List<Double> list = new ArrayList<>(set);
		return list.get(0);
	}


	private static void charsCount(String letters) {

		String[] ar = letters.split(",");
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();

		for (String s : ar) {

			if (lmap.containsKey(s)) {
				int value = lmap.get(s);
				value++;
				lmap.put(s, value);
			} else {
				lmap.put(s, 1);
			}
		}
		for (String key : lmap.keySet()) {
			System.out.println(key + ":" + lmap.get(key));
		}

	}

	private static void wordsInReverseOrder(String str) {

		String[] arr = str.split(",");
		TreeMap<String, Integer> tmap = new TreeMap<>(Collections.reverseOrder());

		for (String s : arr) {

			if (!tmap.containsKey(s)) {
				tmap.put(s, 1);
			} else {
				int value = tmap.get(s);
				value++;
				tmap.replace(s, value);
			}
		}
		for (String key : tmap.keySet()) {

			System.out.println(key + "=" + tmap.get(key));
		}

	}

}
