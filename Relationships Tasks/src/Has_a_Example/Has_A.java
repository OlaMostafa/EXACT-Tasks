package Has_a_Example;

//    Using a person that has a mobile, as an example, cuz why not

public class Has_A {
    public static void main(String[] args) {

        Person person1 = new Person();
        // person1.mobile     this person doesn't have a mobile yet unless I create a mobile object for them

        Person person2 = new Person();
        person2.name = "Ola";

        Mobile mobile2 = new Mobile();
        mobile2.type = "Samsung";

        person2.mobile = mobile2;

        person2.Owns();  // Ola is using a Samsung phone

    }
}

class Person{
    String name;
    Mobile mobile;

    void Owns(){
        System.out.println(name +" is using a " + mobile.type + " phone" );
    }
}

class Mobile{
    String type;

}
