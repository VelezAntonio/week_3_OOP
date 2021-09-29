public class Motorized extends Vehicles{
    private String passenger;
    private String trucks;
    private String trailer;

    public Motorized(String passenger, String trucks, String trailer) {
        this.passenger = passenger;
        this.trucks = trucks;
        this.trailer = trailer;
    }

    public Motorized() {

    }


    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public String getTrucks() {
        return trucks;
    }

    public void setTrucks(String trucks) {
        this.trucks = trucks;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}

