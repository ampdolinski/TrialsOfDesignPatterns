package abstractfactory.factory.car;

class Skoda implements Car {

    private String modelName;
    private EngineType engineType;
    private Double engineVolume;
    private int cylindersNum;

    Skoda(String modelName, EngineType engineType, Double engineVolume, int cylindersNum) {
        this.modelName = modelName;
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.cylindersNum = cylindersNum;
    }


    @Override
    public String getModelName() {
        return "Skoda " + modelName;
    }

    @Override
    public EngineType getType() {
        return engineType;
    }

    @Override
    public Double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public int getCylindersNum() {
        return cylindersNum;
    }
}
