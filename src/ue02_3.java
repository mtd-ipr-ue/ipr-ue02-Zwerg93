import libraries.Out;

import java.util.Scanner;

public class ue02_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie die Jahreszahl ein: ");
        int year = sc.nextInt();
        int days = 0;

        System.out.print("Geben Sie die Monatszahl ein: ");
        int month = sc.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
               days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.printf("Invalid...Please Enter the 1 to 12...");
                break;
        }

        if(month == 2) {
            if( year % 4==0 && (year % 100 !=0 || year % 400 == 0)){
                days = 29;
            }
        }

        System.out.println(days);

    }
}
