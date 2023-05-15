package Livecoding;

public class Employee {
    private String name;
    private int id;
    private String position;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Employee() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Nama: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Posisi: " + this.position);
        System.out.println("Umur: " + this.age);
        System.out.println("Gaji: " + this.salary);
    }
}
