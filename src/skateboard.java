public class skateboard extends nonmotorized{
    private int wheels;
    private String pwr;
    private String type;
    public skateboard(int year, String make, String model, String color, String pwr, int wheels, String type) {
        super(year, make, model, color);
        this.pwr=pwr;
        this.wheels=wheels;
        this.type = type;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getPwr() {
        return pwr;
    }

    public void setPwr(String pwr) {
        this.pwr = pwr;
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
                " Powered by: " + pwr  +
                " Wheels: " + wheels  +
                " Vehicle Type: " + type;
    }
}
