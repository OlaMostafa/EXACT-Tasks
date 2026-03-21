
public class HelloCalculator {
    public static void main(String[] args) {

        int a = 15 ;
        int b = 4 ;
        System.out.println("Sum: " + (a+b));
        System.out.println("Diffrence: " + (a-b));
        System.out.println("Product: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulos: " + (a %b));


        if(a%b==0){
            System.out.println("Divsability: Divisable");
        }
        else{
            System.out.println("Divsability: Not divisable");
        }





    }
}