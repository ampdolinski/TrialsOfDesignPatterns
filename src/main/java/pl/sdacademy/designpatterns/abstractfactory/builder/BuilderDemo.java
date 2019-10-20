package pl.sdacademy.designpatterns.abstractfactory.builder;

import java.util.Collections;

public class BuilderDemo {

    public static void main() {
        new Player.Builder().withLevel(15L)
                .withHealthe(50)
                .withMana(20)
                .withNick("THE KILLER")
                .withFriends(Collections.emptyList())
                .build();
    }

//    Person.PersonBuilder().age(12).name("Józek").surname("Kowalski");

}
