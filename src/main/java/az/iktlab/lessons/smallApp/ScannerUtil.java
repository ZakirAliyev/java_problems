package az.iktlab.lessons.smallApp;

import java.util.Scanner;

public class ScannerUtil {

    private static final Scanner sc = new Scanner(System.in);

    public static Commands getCommand() {
        return Commands.valueOf(sc.nextLine().toUpperCase());
    }

    public static Person getPersonData(Long id_num) {

        Person person = new Person();

        person.setId(id_num);

        System.out.print("Enter name: ");
        person.setName(sc.nextLine());

        System.out.print("Enter surname: ");
        person.setSurname(sc.nextLine());

        System.out.print("Enter father name: ");
        person.setFatherName(sc.nextLine());

        System.out.print("Enter age: ");
        person.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter gender (MALE/FEMALE) : ");
        person.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));
        return person;
    }

    public static void getIdFun(User user) {
        System.out.print("Please enter person_id :");
        user.setId(sc.nextLong());
        getIdData(user);
    }

    public static void getIdData(User user) {
        boolean flag2 = false;
        for (Person elem : Application.personList) {
            if (elem.getId().equals(user.getId())) {
                flag2 = true;
                break;
            }
        }
        if (flag2) {
            getUsernameFun(user);
        } else {
            getIdFun(user);
        }
    }

    public static void getUsernameFun(User user) {
        sc.nextLine();
        System.out.print("Please enter username : ");
        user.setUsername(sc.nextLine().toLowerCase());

        getPasswordFun(user);
    }

    public static void getPasswordFun(User user) {
//        boolean flag1 = true;
//        for (User elem : Application.userList) {
//            if (elem.getUsername().equals(user.getUsername())) {
//                flag1 = false;
//                break;
//            }
//        }
//        if (flag1) {
            System.out.print("Please enter the password : ");
            user.setPassword(sc.nextLine());
//        } else {
//            getUsernameFun(user);
//        }
    }

    public static User getUserData() {

        User user = new User();
        if (Application.id_num==0) {
            System.out.println("Person is invalid!");
            Application.run();
        } else
            getIdFun(user);
        return user;
    }
}
