import libraries.Out;

import java.util.Scanner;

public class ue02_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = 0;
        double y = 0;
        int radius = 4;

        System.out.print("Geben Sie die x Kooardinate ein: ");
        x = sc.nextDouble();

        System.out.print("Geben Sie de y Koardinate ein: ");
        y = sc.nextDouble();

        double dist = Math.sqrt((x * x) + (y * y));

        if (x >= 0 && y >= 0 && dist >= radius && (y <= radius && x <= radius)) {
            System.out.println("Der Punkt liegt im Radius");
        } else {
            System.out.println("Der Punkt liegt außerhalb :(");
        }
    }
}
