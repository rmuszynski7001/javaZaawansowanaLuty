package sda.solid.srp;

public class Human {

    private String name;

    private String surname;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    /**
     * Klasa Human lamie zasadę SRP bo zawiera dane ale też reguły biznesowe i:
     *  - może być potrzeba dołożenia kolejnych danych np. płeć, liczba dzieci, ...
     *  - może nastąpić zmiana w regule sprawdzania prawa jazdy bo np. w innym kraju będzie od 16 lat
     */
    public boolean canHaveDrivingLicense(){
        return age >= 18;
    }
}
