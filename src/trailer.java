public class trailer extends Motorized{
    private String fuel;
    private int engine;
    private int axles;
    private String type;

    public trailer() {super();
    }

    public trailer(int year, String make, String model, String color, String fuel, int engine, int axles, String type) {
        super(year, make, model, color);
        this.fuel = fuel;
        this.engine = engine;
        this.axles= axles;
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

    public int getAxles(){return axles;}

    public void setAxles(){this.axles = axles;}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return super.toString()+
                " Fuel: " + fuel  +
                " Cylinders: " + engine  +
                " Axles: " + axles +
                " Vehicle Type: " + type;
    }
}
