public class motorcycle {
    private String fuel;
    private String engine;

    public motorcycle() {
    }

    public motorcycle(String fuel, String engine) {
        this.fuel = fuel;
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
