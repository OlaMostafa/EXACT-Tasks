import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day: ");
        int day = input.nextInt();

        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekdend");
            default -> System.out.println("Invalid day");
        }







    }
}