package abstractfactory.adapter;

import abstractfactory.adapter.systemb.SystemBUser;
import abstractfactory.adapter.systemb.SystemBUserAdapter;
import abstractfactory.adapter.systema.SystemAUser;
import abstractfactory.adapter.systema.SystemAUserAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {

        SystemAUser systemAUser
                = new SystemAUser("Józek",
                "Kowalski", 12,
                Arrays.asList("USER", "SUPERUSER"));

        SystemBUser systemBUser
                = new SystemBUser("Kalina Nowak",
                "KNowak", "52",
                new HashSet<>());


//        final User user
//                = new SystemAUserAdapter(systemAUser);

        List<User> users = new ArrayList<>();
        users.add(new SystemAUserAdapter(systemAUser));
        users.add(new SystemBUserAdapter(systemBUser));

        users.forEach(user -> System.out.println(user.getFullname()));

    }


}
