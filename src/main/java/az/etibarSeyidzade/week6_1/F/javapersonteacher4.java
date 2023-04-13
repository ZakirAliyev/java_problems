package az.etibarSeyidzade.week6_1.F;

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

    public String toString() {
        return super.toString() + " " + Subject + " " + Salary;
    }
}

class ListOfPeople {
    ArrayList<Person> a = new ArrayList<>();

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

    public ListOfPeople getTeachers() {
        ListOfPeople people = new ListOfPeople();
        for (Person elem : a) {
            if (elem instanceof Teacher) {
                people.add(elem);
            }
        }
        return people;
    }

    public int GetNumberOfTeachers() {
        return getTeachers().size();
    }

    public ListOfPeople getTeachers(String Subject) {
        ListOfPeople list = new ListOfPeople();
        for (Person elem : a) {
            if (elem instanceof Teacher && ((Teacher) elem).Subject.equals(Subject)) {
                list.add(elem);
            }
        }
        return list;
    }

    public int GetNumberOfTeachers(String Subject) {
        int sum = 0;
        for (Person elem : a) {
            if (elem instanceof Teacher && ((Teacher) elem).Subject.equals(Subject)) {
                sum++;
            }
        }
        return sum;
    }
}