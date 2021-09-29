public class trailer {
    private String fuel;
    private String engine;
    private int axles;

    public trailer() {
    }

    public trailer(String fuel, String engine, int axles) {
        this.fuel = fuel;
        this.engine = engine;
        this.axles = axles;
    }

    public int getAxles() {
        return axles;
    }

    public void setAxles(int axles) {
        this.axles = axles;
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
