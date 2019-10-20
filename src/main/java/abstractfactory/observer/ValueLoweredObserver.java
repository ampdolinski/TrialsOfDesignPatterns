package abstractfactory.observer;



public class ValueLoweredObserver extends Observer {

    private int oldValue;

    public ValueLoweredObserver(final Subject subject) {
        this.subject = subject;
        this.subject.register(this);
        oldValue = subject.getValue();
    }

    @Override
    public void update() {

        if (subject.getValue() < oldValue){
            System.out.println("VALUE LOWERED OBSERVER, NEW VALUE: "
                    + subject.getValue());
        }
        oldValue = subject.getValue();

    }

}
