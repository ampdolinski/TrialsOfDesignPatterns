package abstractfactory.command;

public class CommandDemo {

    public static void main(String[] args) {

        final UserRepository userRepository = new UserRepository();
        final UserData userDataA
                = new UserData("Michał",
                "Kowalski", "bla@wp.pl",
                "MySecretPassword");
        final UserData userDataB
                = new UserData("Robert",
                "Nowak", "hed@o2.pl",
                "MySecretPassword");


        final CommandBase command = new UserRegistrationCommand(userRepository, userDataA);

        command.execute();
        userRepository.printAllNames();
        command.undo();
        userRepository.printAllNames();
        command.execute();
        userRepository.printAllNames();

        command.execute();
        command.execute();
        userRepository.printAllNames();






    }

}
