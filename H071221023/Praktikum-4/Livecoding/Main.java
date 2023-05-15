package Livecoding;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();  

        System.out.println("----Informasi Employee 1----");
        employee1.setName("Trisman Tegar Wiratama");
        employee1.setId(12345);
        employee1.setPosition("CEO");
        employee1.setAge(19);
        employee1.setSalary(50.000);

        employee1.displayInfo(); 

        Employee employee2 = new Employee();
        employee2.setName("A.Afif Alhaq");
        employee2.setId(67890);
        employee2.setPosition("Manager");
        employee2.setAge(18);
        employee2.setSalary(20.000);

        System.out.println("-----------------------------");
        System.out.println("----Informasi Employee 2----");
        employee2.displayInfo();

        Selfutils.displaySelfData();
    }
}
