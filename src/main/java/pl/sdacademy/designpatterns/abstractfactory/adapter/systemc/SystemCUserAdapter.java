package pl.sdacademy.designpatterns.abstractfactory.adapter.systemc;

import pl.sdacademy.designpatterns.abstractfactory.adapter.User;
import pl.sdacademy.designpatterns.abstractfactory.adapter.systemb.SystemBUser;

import java.util.List;
import java.util.stream.Collectors;


public class SystemCUserAdapter implements User {

    private SystemBUser systemBUser;

    public SystemCUserAdapter(final SystemBUser systemBUser) {
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
