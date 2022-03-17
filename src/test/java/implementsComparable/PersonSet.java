package implementsComparable;

import java.util.TreeSet;

public class PersonSet {

    public static void main(String[] args) {

        TreeSet<Person> set = new TreeSet<Person>();

        Person p1 = new Person("Haim", 123, 67.5);
        Person p2 = new Person("Vadim", 342, 55.5);
        Person p3 = new Person("Anna", 543, 88.5);
        Person p4 = new Person("David", 223, 72.5);
        Person p5 = new Person("Faina", 423, 49.5);
        Person p6 = new Person("David", 765, 72.5);
        Person p7 = new Person("David", 665, 98.0);
        Person p8 = new Person("David", 534, 68.2);
        Person p9 = new Person("David", 223, 72.3);
        Person p10 = new Person("David", 765, 72.9);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);
        set.add(p7);
        set.add(p8);
        set.add(p9);
        set.add(p10);


        System.out.println(p4.hashCode());
        System.out.println(p6.hashCode());
        //System.out.println(set);
        for(Person p:set) {

            System.out.println(p);
        }
    }

}
