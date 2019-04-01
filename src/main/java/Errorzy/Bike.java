package Errorzy;

public class Bike {
    private int number;
    private int bike_type;
    private String lock_type;
    private int active;
    private String state;
    private int electric_lock;
//board_computer long czy String?
    private String board_computer;
    private int pedelec_battery;


    public String getLock_type() {
        return lock_type;
    }

    public void setLock_type(String lock_type) {
        this.lock_type = lock_type;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int getBikeType() {
        return bike_type;
    }

    public void setBikeType(int bikeType) {
        this.bike_type = bikeType;

    }

    public int getBike_type() {
        return bike_type;
    }

    public void setBike_type(int bike_type) {
        this.bike_type = bike_type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getElectrick_lock() {
        return electric_lock;
    }

    public void setElectrick_lock(int electrick_lock) {
        this.electric_lock = electrick_lock;
    }

    public String getBoard_computer() {
        return board_computer;
    }

    public void setBoard_computer(String board_computer) {
        this.board_computer = board_computer;
    }

    public int getPedelec_battery() {
        return pedelec_battery;
    }

    public void setPedelec_battery(int pedelec_battery) {
        this.pedelec_battery = pedelec_battery;
    }
}
