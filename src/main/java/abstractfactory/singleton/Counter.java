package abstractfactory.singleton;

public class Counter {

    private int counter = 0;
    private static Counter counterInstance = new Counter();

    public static Counter getInstance() {
        return counterInstance;
    }

    private Counter() {

    }

    public void addOne() {

        counter =+ 1;
        System.out.println("counterInstance = " + counter);
    }

    public void addTwo() {
        counter++;
        counter++;
        System.out.println("counterInstance = " + counter);
    }

    public void addThree() {
        counter++;
        counter++;
        counter++;
        System.out.println("counterInstance = " + counter);
    }



}
