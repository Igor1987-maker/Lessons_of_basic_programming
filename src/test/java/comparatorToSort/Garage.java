package comparatorToSort;

import java.util.ArrayList;
import java.util.Collections;

public class Garage {

	private String name;
	private String address;
	private ArrayList<Car> cars = new ArrayList<Car>();
	
	
		
	public Garage(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void addCar (Car c) {
		
		cars.add(c);
	}
	
	public void displayCars() {
		
		System.out.println("Now in service: "+cars.size());
		for(Car c:cars) {
			System.out.println(c);
		}
		
	}
	public void returnCar(int regnumber) {
		
		for(int i = 0; i<cars.size();i++) {
			
			Car c = cars.get(i);
			if(c.getRegNumber()==regnumber) {
				
				cars.remove(i);
				return;
			}
		}
		System.out.println("Reg number is not found");
	}
	
	public void sortByOwner() {

		SortByNameOwner comp = new SortByNameOwner();
		
		Collections.sort(cars, comp);
		
		
	}
	
	
	
	
	
	
	
	
}
