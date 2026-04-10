import java.util.Scanner;

public class Task5{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balnce = 1000;
        int choice = 0;


        while (true) {

            System.out.println("Enter a choice 1-Check balnace 2-Deposit 3-withdraw 4- Exit");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Balnce: " + balnce);
            }
            else if (choice == 2) {
                System.out.println("Enter deposit amount");
                double deposit= input.nextDouble();
                balnce += deposit;
            }
            else if (choice == 3) {
                System.out.println("Enter amount to withdraw");
                double withdraw= input.nextDouble();
                if(withdraw>balnce){
                    System.out.println("Not enough balance");
                }
                else{
                    balnce -= withdraw;
                }
            }
            else if (choice == 4) {
                break;
            }
        }



    }


}
