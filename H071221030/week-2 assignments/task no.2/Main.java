class Main {
    public static void main(String[] args){
    Person person = new Person();

    person.setName("Joy");
    person.setAge(18);
    person.setGender(true);

    System.out.println("Nama : " + person.getName());
    System.out.println("Umur : " + person.getAge());
    System.out.println("Gender : " + person.getGender());
    }
}