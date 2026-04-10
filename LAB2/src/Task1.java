import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double score=0 ;

        for(int i= 0 ; i<5 ; i++){

            System.out.print("Enter your score: ");
            score = input.nextDouble();

            if(score >= 90){
                System.out.println("Grade: A Exellent" );
            }
            else if(score >= 80){
                System.out.println("Grade: B Good");
            }
            else if(score >= 70){
                System.out.println("Grade: C Good");
            } else if (score >= 60) {
                System.out.println("Grade: D Needs improvement");
            }
            else{
                System.out.println("Grade: F Needs improvement");
            }
        }




    }
}