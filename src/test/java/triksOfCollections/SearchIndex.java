package triksOfCollections;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SearchIndex {

	public static void main(String[] args) {

		String str = "aartttddddffbbbcc";
		System.out.println("Index of most frequent letter : " + getMaxIndex2(str));

	}

	public static int getMaxIndex(String str) {
		int count = 0, quantity = 0, start = 0;
		char letter = ' ';
		for (int i = start; i < str.length(); i++) {

			char ch = str.charAt(i);

				for (int j = 0; j < str.length(); j++) {
					if (ch == str.charAt(i)) {
						count++;
						start++;
					}
				}
					if (quantity < count) {
						quantity = count;
						letter = ch;
					}
						count = 0;

		}
		int maxIndex = str.indexOf(letter);
		return maxIndex;
	}

	public static int getMaxIndex2(String str) {

		LinkedHashMap<Character, Integer> lm = new LinkedHashMap<>();
		int count = 0, res = 0, maxI = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j))
					count++;
				lm.put(ch, count);
			}
			count = 0;
		}

		for (Character c : lm.keySet()) {
			if (res < lm.get(c)) {
				res = lm.get(c);
				maxI = str.indexOf(c);
			}

		}

		return maxI;
	}


	/*private static void printWordsInReverseOrder(String str) {


		String[] arr = str.split(",");
		TreeSet<String> tStr = new TreeSet<>(Collections.reverseOrder());
		//LinkedHashSet<String> lhs = new LinkedHashSet<>();

		for(String s:arr) {

			tStr.add(s);
		}
		for(String s:tStr) {

			System.out.println(s);
		}

	}*/
//<==============================VARIANT WITH ITERATOR======================================>
//	private static void printWordsInReverseOrder(String str) {
//
//		String[] arr = str.split(",");
//		TreeSet<String> tStr = new TreeSet<>();// (Collections.reverseOrder());
//
//		for (String s : arr) {
//
//			tStr.add(s);
//		}
//
//		Iterator<String> iterator = tStr.descendingIterator();
//		while (iterator.hasNext()) {
//
//			System.out.println(iterator.next());
//		}
//
//	}

//	public void display(LinkedHashMap<Computer,Double> lmap) {
//
//		for (lmap.Entry<KeyType, ValueType> entry : lmap.entrySet()) {
//		    System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
//
//
//	}

}
