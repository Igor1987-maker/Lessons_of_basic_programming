package comparatorToSort;

public class Car {
    private String model;
    private int regNumber;
    private int year;
    private String owner;

    public Car(String model, int regNumber, int year, String owner) {
        super();
        this.model = model;
        this.regNumber = regNumber;
        this.year = year;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "model: " + model + ", regNumber: " + regNumber + ", year: " + year + ", owner: " + owner;
    }





}
