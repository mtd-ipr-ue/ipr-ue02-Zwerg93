import java.util.Scanner;

public class ue02_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbers = new int[3];
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Geben Sie die erste Zahl ein: ");
            numbers[i] = sc.nextInt();

            if(max< numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(" Die größte Zahl ist: " + max);
    }
}
