package pl.kurs.java.lesson9;

public class Lekcja9 {
    public static void main(String[] args) {
        Person person1 = new Person("chuj", "cipa", "12345678909");
//        person1.name = "dupaaaa";
//        person1.pesel = "CHUJJJJJ";
        System.out.println(person1.getName());
        person1.setName("dshjkkdahjkds");
        System.out.println(person1.getName());
    }
}
