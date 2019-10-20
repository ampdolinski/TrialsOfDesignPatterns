package abstractfactory.singleton;

public class SingletonDemo {

    public static void main(final String[] args) {
//        final Counter counterA = Counter.getInstance();
//        final Counter counterB = Counter.getInstance();
//
//        counterA.addTwo;
//        counterB.addThree;
//        counterA.addOne;
//        counterB.addTwo;


        final AppConnections userA = AppConnections.getInstance();
        final AppConnections userB = AppConnections.getInstance();

        userA.connectUser("Józek");
        userB.connectUser("Lenny");
        userA.connectUser("Ala");

        System.out.println(userA.getConectedUsers());

    }

}
