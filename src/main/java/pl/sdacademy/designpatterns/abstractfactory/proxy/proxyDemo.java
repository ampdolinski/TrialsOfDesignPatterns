package pl.sdacademy.designpatterns.abstractfactory.proxy;

public class proxyDemo {

    public static void main(String[] args) {

        final ConfigLoader configLoader
                = new ExternalConfigLoaderProxy(
                        "http::someserver.com");


        configLoader.load();
        configLoader.load();
        configLoader.load();

    }

}
