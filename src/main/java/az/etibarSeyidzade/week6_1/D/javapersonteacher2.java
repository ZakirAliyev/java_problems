package az.etibarSeyidzade.week6_1.D;

import java.util.ArrayList;

class Person {
    protected String Surname, Name;
    protected int Age;

    public Person(String surname, String name, int age) {
        this.Surname = surname;
        this.Name = name;
        this.Age = age;
    }

    public String toString() {
        return Surname + " " + Name + " " + Age;
    }
}

class Teacher extends Person {
    protected String Subject;
    protected int Salary;

    Teacher(String Surname, String Name, int Age, String Subject, int Salary) {
        super(Surname, Name, Age);
        this.Subject = Subject;
        this.Salary = Salary;
    }

    public String toString() {
        return super.toString() + " " + Subject + " " + Salary;
    }
}

class ListOfPeople {
    ArrayList<Person> a = new ArrayList<Person>();

    public void add(Person p) {
        a.add(p);
    }

    public int size() {
        return a.size();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Person elem : a) {
            result.append(elem.toString()).append("\n");
        }
        return result.toString();
    }
}


