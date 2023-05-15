class Orang {
    String name;
    int age;
    boolean isMale;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender) {
        this.isMale = gender == "Male";
    }
    public String getGender(){
        if(isMale){
            return "male";
        }
        else{
            return "female";
        }
    }
}
public class No2{
    public static void main(String[] args) {
        Orang person = new Orang();
        person.setName("Arni Raihanah");
        person.setAge(18);
        person.setGender("female");

        System.out.println("Nama saya adalah " + person.getName());
        System.out.println("Umur saya adalah " + person.getAge() + " tahun ");
        System.out.println("Jenis kelamin saya adalah " + person.getGender());
    }
}