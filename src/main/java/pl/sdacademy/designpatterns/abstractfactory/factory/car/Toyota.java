package pl.sdacademy.designpatterns.abstractfactory.factory.car;

class Toyota implements Car {

    private String modelName;
    private EngineType engineType;
    private Double engineVolume;
    private int cylindersNum;

    Toyota(String modelName, EngineType engineType, Double engineVolume, int cylindersNum) {
        this.modelName = modelName;
        this.engineType = engineType;
        this.engineVolume = engineVolume;
        this.cylindersNum = cylindersNum;
    }


    @Override
    public String getModelName() {
        return "Toyota " + modelName;
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
