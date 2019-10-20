package abstractfactory.observer;

public class ObserverDemo {

    public static void main(String[] args) {

        final Subject subject = new Subject();

        final Observer observerA = new ConcreteValueObserver(subject);
        final Observer observerB = new ValueLoweredObserver(subject);
        final Observer observerC = new ByTenChangedObserver(subject);

        subject.valueChange(3);
        subject.valueChange(5);
        subject.valueChange(4);
        subject.valueChange(-15);

    }

}
