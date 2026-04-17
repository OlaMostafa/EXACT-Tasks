// Using a superhero character to be formed into multiple warriors and attack differently

public class PolymorphismCode {
    public static void main(String[] args) {

        Superhero superhero1 ;

        superhero1 = new WaterWarrior();
        superhero1.Attack();

        superhero1 = new FireWarrior();        // only one superhero with different powers
        superhero1.Attack();

        superhero1 = new ThunderWarrior();
        superhero1.Attack();


    }
}


class Superhero{
    void Attack(){
        System.out.println("Superhero is attacking in general( I guess?😭 )");
    }
}

class WaterWarrior extends Superhero{
    void Attack(){
        System.out.println("ATTACKING WITH WATER POWER... ");
    }
}
class FireWarrior extends Superhero{
    void Attack(){
        System.out.println("ATTACKING WITH FIRE POWER... ");
    }
}
class ThunderWarrior extends Superhero{
    void Attack(){
        System.out.println("ATTACKING WITH THUNDER POWER... ");
    }
}