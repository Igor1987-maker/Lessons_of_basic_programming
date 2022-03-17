package implementsComparable;

import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {

//		HashSet<String> set = new HashSet<String>();
//
//		set.add("kiwi");
//		set.add("grape");
//		set.add("banana");
//		set.add("apple");
//		set.add("kiwi");
//		System.out.println(set);
//		for(String str:set) {
//			System.out.println(str);
//		}
//
//		ArrayList<String> listStr = new ArrayList<>();
//		listStr.addAll(set);
//		System.out.println(listStr);


        TreeSet<String> hset = new TreeSet<String>();

        String st1 = "Haim";
        String st2 = "David";
        String st3 = "Boris";
        String st4 = "Anna";
        String st5 = "Peter";

        hset.add(st1);
        hset.add(st2);
        hset.add(st3);
        hset.add(st4);
        hset.add(st5);

        System.out.println(hset);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st5.hashCode());
        for(String s:hset) {

            System.out.println(s);
        }


    }







}
