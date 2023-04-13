package az.etibarSeyidzade.week6_1.C;

class Person {
    protected String Surname, Name;
    protected int Age;

    Person(String surname, String name, int age) {
        this.Surname = surname;
        this.Name = name;
        this.Age = age;
    }


    @Override
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

    @Override
    public String toString() {
        return Surname + " " + Name + " " + Age + " " + Subject + " " + Salary;
    }
}

