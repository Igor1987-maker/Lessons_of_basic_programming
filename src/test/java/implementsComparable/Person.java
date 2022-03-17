package implementsComparable;

public class Person implements Comparable <Person>{

    private String name;
    private int id;
    private double weight;
    public Person(String name, int id, double weight) {
        super();
        this.name = name;
        this.id = id;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public int compareTo(Person other) {

        //return Integer.compare(this.id, other.id);
        //return this.id - other.id;
        //return this.getName().compareToIgnoreCase(other.getName());
        int res = this.getName().compareToIgnoreCase(other.getName());

        if(res==0) {

            res = Double.compare(this.weight, other.weight);
        }

        if(res==0) {

            res = Integer.compare(this.id, other.id);
        }
        return res;
    }




 /* @Override
    public int compareTo(Person o) {
        return 0;
    }*/
}
