package abstractfactory.singleton;

public enum EnumSigleton {
    INSTANCE;

    private int value = 0;

    public void add() {
        value++;
    }
}
