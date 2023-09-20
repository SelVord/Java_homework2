import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Smartphone> smartphones = new ArrayList<Smartphone>();
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();
        ArrayList<Tablet> tablets = new ArrayList<Tablet>();

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number between 1 and 20");
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int r = rand.nextInt(1, 4);
            if (r == 1) {
                Smartphone device = new Smartphone("Smartphone", rand.nextDouble(100, 1000), rand.nextDouble(150, 300), rand.nextInt(5, 8), rand.nextInt(8, 200));
                smartphones.add(device);
            } else if (r == 2) {
                Laptop device = new Laptop("Laptop", rand.nextDouble(100, 1000), rand.nextDouble(150, 300), rand.nextInt(2000, 7000), rand.nextInt(2000, 2023));
                laptops.add(device);
            } else {
                Tablet device = new Tablet("Tablet", rand.nextDouble(100, 1000), rand.nextDouble(150, 300), rand.nextInt(5, 8), rand.nextInt(64, 1024));
                tablets.add(device);
            }
        }

        double total_price = 0;
        double total_weight = 0;

        for (Smartphone device : smartphones) {
            total_price += device.price;
            total_weight += device.weight;
        }


        for (Laptop device : laptops) {
            total_price += device.price;
            total_weight += device.weight;
        }


        for (Tablet device : tablets) {
            total_price += device.price;
            total_weight += device.weight;
        }

        System.out.println("Total price of all devices: " + (int)total_price + "\nTotal weight of all devices: " + (int)total_weight);
    }
}













