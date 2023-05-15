package no2;


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("KELVIN", 18, true);

        person1.setName("Ammy");
        person1.setAge(20);
        person1.setGender(false);


        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
    }
    
}
