package pl.sdacademy.designpatterns.abstractfactory.adapter.systemb;

import pl.sdacademy.designpatterns.abstractfactory.adapter.User;
import pl.sdacademy.designpatterns.abstractfactory.adapter.systemb.SystemBUser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SystemBUserAdapter implements User {

    private SystemBUser systemBUser;

    public SystemBUserAdapter(final SystemBUser systemBUser) {
        this.systemBUser = systemBUser;
    }

    @Override
    public String getFullname() {
        return systemBUser.getFullName();
    }

    @Override
    public String getUsername() {
        return systemBUser.getDisplayName();
    }

    @Override
    public Integer getAge() {
        return Integer.parseInt(systemBUser.getAge());
    }

    @Override
    public List<String> getRoles() {
        return systemBUser.getRoles()
                .stream().collect(Collectors.toList());

//        return new ArrayList<>(systemBUser.getRoles());
    }
}
