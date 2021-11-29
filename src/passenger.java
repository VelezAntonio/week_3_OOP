public class passenger extends  Motorized{
    private String fuel;
    private int engine;
    private String type;

    public passenger(int year, String make, String model, String color, String fuel, int engine, String type) {
        super(year, make, model, color);
        this.fuel = fuel;
        this.engine = engine;
        this.type = type;
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




    @Override
    public String toString() {
        return super.toString()+
                " Fuel: " + fuel  +
                " Cylinders: " + engine  +
                " Vehicle Type: " + type;
    }
}
