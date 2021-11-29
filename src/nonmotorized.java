public class nonmotorized extends Vehicles{
    private int wheels;
    private String power;
    private String type;



    public nonmotorized( int year, String make, String model, String color ){
        super(year, make, model, color);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
