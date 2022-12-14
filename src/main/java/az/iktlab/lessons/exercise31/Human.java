package az.iktlab.lessons.exercise31;

public class Human extends Main implements Ability{

    private String name;
    private String surname;
    private int age;
    private String gender;

    public Human() {
    }

    public Human(String name, String surname, int age, String gender, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void write() {
        System.out.printf("%s write!",father.getName());
    }

    public void read() {
        System.out.printf("%s read!",father.getName());
    }

    public void sing() {
        System.out.printf("%s sing!",father.getName());
    }

    public void dance() {
        System.out.printf("%s dance!",father.getName());
    }

    public void run() {
        System.out.printf("%s run!",father.getName());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender +
                '}';
    }

    @Override
    public void write(String word) {
        
    }

    @Override
    public void read(String word) {

    }

    @Override
    public void sing(String word) {

    }

    @Override
    public void dance(String word) {

    }

    @Override
    public void run(String word) {

    }
}
