package az.iktlab.lessons.smallApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static final PersonService personService = new PersonService();
    private static final UserService userService = new UserService();

    public static final List<Person> personList = new ArrayList<>();
    public static final List<User> userList = new ArrayList<>();

    public static void run() {
        boolean flag = true;
        Long id_num = 1L;

        while (flag) {
            showCommands();
            Commands cmd = ScannerUtil.getCommand();

            switch (cmd) {
                case SP:
                    Person person = ScannerUtil.getPersonData(id_num);
                    personService.savePerson(person);
                    id_num++;
                    break;
                case RU:
                    User user = ScannerUtil.getUserData();
                    userService.registerUser(user);
                    break;
                case SHP:
                    personService.showPeople();
                    break;
                case EXIT:
                    flag = false;
            }
        }
    }

    private static void showCommands() {
        System.out.print("\nCommands: \n" +
                "1. (sp)   - " + Commands.SP.getDescription() + "\n" +
                "2. (ru)   - " + Commands.RU.getDescription() + "\n" +
                "3. (shp)  - " + Commands.SHP.getDescription() + "\n" +
                "4. (exit) - " + Commands.EXIT.getDescription() + "\n" +
                "Enter command : ");
    }
}
