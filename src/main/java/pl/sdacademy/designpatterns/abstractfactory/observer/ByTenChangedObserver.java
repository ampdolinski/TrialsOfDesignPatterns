package pl.sdacademy.designpatterns.abstractfactory.observer;


public class ByTenChangedObserver extends Observer{

    private int oldValue;

    public ByTenChangedObserver(final Subject subject) {
        this.subject = subject;
        this.subject.register(this);
        oldValue = subject.getValue();
    }

    @Override
    public void update() {

        if (Math.abs(subject.getValue() - oldValue) >= 10){
            System.out.println("BY 10 CHANGED OBSERVER, NEW VALUE: "
                    + subject.getValue());
        }
        oldValue = subject.getValue();

    }



}
