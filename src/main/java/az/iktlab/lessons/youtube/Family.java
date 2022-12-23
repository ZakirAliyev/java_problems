package az.iktlab.lessons.youtube;

public class Family {

    private String name;
    private int age;

    public Family() {
    }

    public Family(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void run() {
        System.out.println(getName() + " is running!");
    }

    public void isAge() {
        System.out.println(getName() + " is " + getAge() + " years old!");
    }
}
