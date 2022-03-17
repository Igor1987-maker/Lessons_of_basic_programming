package comparatorToSort;

import java.util.Comparator;

public class SortByNameOwner implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {

            return o1.getOwner().compareToIgnoreCase(o2.getOwner());
        }

    }


