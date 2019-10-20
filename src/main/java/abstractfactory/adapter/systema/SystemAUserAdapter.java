package abstractfactory.adapter.systema;

import abstractfactory.adapter.User;

import java.util.List;

public class SystemAUserAdapter implements User {

    private SystemAUser systemAUser;

    public SystemAUserAdapter(final SystemAUser systemAUser) {
        this.systemAUser = systemAUser;
    }

    @Override
    public String getFullname() {
        return systemAUser.getFirstName() + " "
                + systemAUser.getLastName();
    }

    @Override
    public String getUsername() {
        return systemAUser.getFirstName()
                +systemAUser.getFirstName().charAt(1);
    }

    @Override
    public Integer getAge() {
        return Integer.parseInt(String.valueOf(systemAUser.getAge()));
    }

    @Override
    public List<String> getRoles() {
        return null;
    }
}
