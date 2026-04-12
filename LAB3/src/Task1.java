public class Task1 {


    static int max(int a, int b) {
        if (a > b) { return a;}
        else { return b;}
    }
    static int min(int a, int b) {
        if (a > b) { return b;}
        else { return a;}
    }
     public static boolean isEven(int n) {
        if(n % 2 ==0 ){ return true; }
        else{ return false;}
    }
    static int absolute(int n) {
        return Math.abs(n);
    }
    static double power(double base , int exp){
        return Math.pow(base, exp);
    }

    public static void main(String[] args) {

        System.out.println( "MAX: "+ max(50, 100));
        System.out.println( "MIN: "+ min(100, 99));
        System.out.println( "Even? "+ isEven( 44));
        System.out.println("Absolute value: "+ absolute(-140));
        System.out.println("5^3= " + power(5, 3));


    }
}
