package abstractfactory.proxy;

public class ExternalConfigLoaderProxy implements ConfigLoader{

    private ExternalConfigLoader configuration;
    private String serverURL;

    public ExternalConfigLoaderProxy(final String serverURL) {
        this.serverURL = serverURL;
    }

    @Override
    public String load() {
        if (configuration == null) {
            try {
                configuration = new ExternalConfigLoader(serverURL);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return configuration.load();
    }
}