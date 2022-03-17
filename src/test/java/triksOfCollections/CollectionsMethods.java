package triksOfCollections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class CollectionsMethods {

	public static void main(String[] args) {

		String str = "money,happy,hello,bye,hello,money,happy,bye,money";
		String letters = "c,b,b,a,b,a,a,c";

		charsCount(letters);
		System.out.println("\n===================================================\n");
		wordsInReverseOrder(str);
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
