package az.iktlab.lessons.smallApp;

public class UserService {

    public void registerUser(User user) {

        Application.personList.add(user);
    }
}
