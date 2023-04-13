package az.etibarSeyidzade.week6_1.H;

import javax.security.auth.Subject;
import java.util.ArrayList;

class Person {
    protected String Surname, Name;
    protected int Age;

    Person(String Surname, String Name, int Age) {
        this.Surname = Surname;
        this.Name = Name;
        this.Age = Age;
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

    Teacher(Teacher a) {
        super(a.Surname, a.Name, a.Age);
        this.Subject = a.Subject;
        this.Salary = a.Salary;
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
        String result = "";
        for (Person elem : a) {
            result += elem.toString() + "\n";
        }
        return result;
    }

    public int getTeachersBudget() {
        int sum = 0;
        for (Person elem : a) {
            if (elem instanceof Teacher) {
                sum += ((Teacher) elem).Salary;
            }
        }
        return sum;
    }

    public int getTeachersBudget(String Subject) {
        int sum = 0;
        for (Person elem : a) {
            if (elem instanceof Teacher && ((Teacher) elem).Subject.equals(Subject)) {
                sum += ((Teacher) elem).Salary;
            }
        }
        return sum;
    }

    public double getTeachersAverageSalary() {
        double x = getTeachersBudget();
        double sum = 0;
        for (Person elem : a) {
            if (elem instanceof Teacher) {
                sum++;
            }
        }
        return x / sum;
    }

    public double getTeachersAverageSalary(String Subject) {
        double x = getTeachersBudget(Subject);
        double sum = 0;
        for (Person elem : a) {
            if (elem instanceof Teacher && ((Teacher) elem).Subject.equals(Subject)) {
                sum++;
            }
        }
        return x / sum;
    }
}
