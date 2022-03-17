package comparatorToSort;

public class MainGarage {

	public static void main(String[] args) {
		
		Garage gar = new Garage("Best", "Plaut 10, Rehovot");
		
		Car c1 = new Car("Honda", 43123, 2019, "Irina");
		Car c2 = new Car("Mazda", 56534, 2020, "Nikita");
		Car c3 = new Car("Ferrari", 1987, 2444, "Alisa");
		Car c4 = new Car("Opel", 4444, 2011, "Gena");
		Car c5 = new Car("Mercedes", 5555, 2023, "Sofia");
		
		gar.addCar(c1);
		gar.addCar(c2);
		gar.addCar(c3);
		gar.addCar(c4);
		gar.addCar(c5);
		
		gar.displayCars();
		gar.sortByOwner();
		gar.displayCars();
		gar.returnCar(1987);
		gar.displayCars();
		
		
		
	}

}
