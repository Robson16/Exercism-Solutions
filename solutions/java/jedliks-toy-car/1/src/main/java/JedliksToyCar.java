public class JedliksToyCar {
    private int battery = 100;
    private int distance = 0;

    public JedliksToyCar() {
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.getDistance() + " meters";
    }

    public String batteryDisplay() {
        if (this.getBattery() == 0) {
            return "Battery empty";
        }

        return "Battery at " + this.getBattery() + "%";
    }

    public void drive() {
        if (this.getBattery() != 0) {
            this.setDistance(this.getDistance() + 20);
            this.setBattery(this.getBattery() - 1);
        }
    }
}
