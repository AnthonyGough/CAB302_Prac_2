import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    public AuthenticationService() {
        this.users = new ArrayList<>();
        this.users.add(new User("test", "test"));
    }

    public User signUp(String username, String password) {
        User user = new User(username,password);
        if (user.)
        users.add(user);
        return user;
    }

    @Override
    public User logIn(String username, String password) {
        return null;
    }

    // TODO Now: Add a constructor to initialize the users list with the default user


    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
}