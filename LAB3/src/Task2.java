public class Task2 {

    static boolean isEmpty(String s){
        if(s.length() == 0){ return true;}
        else {return false;}
    }

    static String captialize(String s){
        return s.toUpperCase();
    }
    static void repeat(String s, int times){
        for(int i = 0; i < times; i++){
            System.out.println(s);
        }
    }
    static int count(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' ) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println( "Empty String? "+ isEmpty(" hi"));
        System.out.println( "Empty String? "+ isEmpty(""));
        System.out.println(captialize("java") );
        repeat("hello", 3);
        System.out.println( count("Ola"));

    }
}
