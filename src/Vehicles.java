public class Vehicles {
    private int year;
    private String make;
    private String model;
    private String color;




    Vehicles(){}


    public Vehicles(int year, String make, String model, String color) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString(){
        return "Year: "+ year + " Make: " + make + " Model: "+ model + " Color: " + color;
    }
}
