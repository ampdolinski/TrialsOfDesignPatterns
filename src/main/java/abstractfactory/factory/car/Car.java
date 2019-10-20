package abstractfactory.factory.car;

public interface Car {

    String getModelName();
    EngineType getType();
    Double getEngineVolume();
    int getCylindersNum();

}
