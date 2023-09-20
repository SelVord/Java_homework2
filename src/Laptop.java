public class Laptop extends Device {
    private int battery;
    private int manufacture_date;

    public Laptop(String type, double price, double weight, int battery, int manufacture_date) {
        super(type, price, weight);
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.battery = battery;
        this.manufacture_date = manufacture_date;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getManufacture_date() {
        return manufacture_date;
    }

    public void setManufacture_date(int manufacture_date) {
        this.manufacture_date = manufacture_date;
    }

    public String toString() {
        return this.type + " " + this.price + " " + this.weight + " " + this.battery + " " + this.manufacture_date;
    }
}
