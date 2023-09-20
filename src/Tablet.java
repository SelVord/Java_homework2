public class Tablet extends Device {
    private int screen_size;
    private int memory;

    public Tablet(String type, double price, double weight, int screen_size, int memory) {
        super(type, price, weight);
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.screen_size = screen_size;
        this.memory = memory;
    }

    public int getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(int screen_size) {
        this.screen_size = screen_size;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String toString() {
        return this.type + " " + this.price + " " + this.weight + " " + this.screen_size + " " + this.memory;
    }
}