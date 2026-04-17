//  Using employee is a person as an example

public class Is_A {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ola", 20, "Cairo", 123456789, 101, "IT",5000.0);
        e1.printInfo();
    }
}

 class Person{
    String name;
    int age;
    String address;
    int phoneNumber;

    Person(String name,int age,String address,int phoneNumber){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

class Employee extends Person{

    int id;
    String dept;
    double salary;

    Employee(String name, int age, String address, int phoneNumber ,int id, String dept, double salary) {
        super(name , age , address , phoneNumber);
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }

    void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("PhoneNumber: " + this.phoneNumber);
        System.out.println("ID: " + this.id);
        System.out.println("Dept: " + this.dept);
        System.out.println("Salary: " + this.salary);

    }
}