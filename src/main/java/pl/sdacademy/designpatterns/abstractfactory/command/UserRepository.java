package pl.sdacademy.designpatterns.abstractfactory.command;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<UserData> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    protected void addUser(final UserData user){
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    protected void removeUser(final UserData user) {
        users.remove(user);
    }

    public void printAllNames() {
        users.forEach(UserData::getName);
    }

}
