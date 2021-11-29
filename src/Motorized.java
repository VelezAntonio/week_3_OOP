public class Motorized extends Vehicles {
    private String fuel;
    private int engine;
    private String type;

    public Motorized(int year, String make, String model, String color) {
        super(year, make, model, color);
    }

    public Motorized() {

    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}

