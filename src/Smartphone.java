public class Smartphone extends Device {
    private int screen_size;
    private int camera_resolution;

    public Smartphone(String type, double price, double weight, int screen_size, int camera_resolution) {
        super(type, price, weight);
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.screen_size = screen_size;
        this.camera_resolution = camera_resolution;
    }

    public int getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(int screen_size) {
        this.screen_size = screen_size;
    }

    public int getCamera_resolution() {
        return camera_resolution;
    }

    public void setCamera_resolution(int camera_resolution) {
        this.camera_resolution = camera_resolution;
    }

    public String toString() {
        return this.type + " " + this.price + " " + this.weight + " " + this.screen_size + " " + this.camera_resolution;
    }
}
