package az.iktlab.lessons.smallApp;

public class PersonService {

    public void savePerson(Person person) {
        Application.personList.add(person);
    }

    public void showPeople() {
        Application.userList.forEach(System.out::println);
    }
}
