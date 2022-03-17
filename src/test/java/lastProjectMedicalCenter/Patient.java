package lastProjectMedicalCenter;

public class Patient implements Comparable<Patient> {
	
	private String name;
	private int id;
	private int age;
	private double weight;
	
	
	public Patient(String name, int id, int age, double weight) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
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
		Patient other = (Patient) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "name: " + name + " id: " + id + " age: " 
	+ age + " weight: " + weight;
	}


	@Override
	public int compareTo(Patient other) {
		int res = this.name.compareToIgnoreCase(other.name);
		if(res==0)
			res = Integer.compare(this.id, other.id);
			
		return res;
	}
	
	
	

}
