package designpatterns.ex1.creational;

class AppConfig {
    private static AppConfig instance;
    private String configValue = "default";

    private AppConfig() {}

    public static AppConfig getInstance() {
        if (instance == null) instance = new AppConfig();
        return instance;
    }

    public String getConfig() { return configValue; }
    public void setConfig(String val) { configValue = val; }
}

public class SingletonConfigDemo {
    public static void main(String[] args) {
        AppConfig cfg = AppConfig.getInstance();
        System.out.println(cfg.getConfig());
        cfg.setConfig("prod");
        System.out.println(AppConfig.getInstance().getConfig());
    }
}
