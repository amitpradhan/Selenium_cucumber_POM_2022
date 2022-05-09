package util;

import java.util.Properties;

import static constants.Constants.CONFIG_PROPERTIES_PATH;

public class ConfigLoader {
    private final Properties properties;
    private static ConfigLoader configLoader;

    public ConfigLoader() {
        this.properties = PropertyUtils.propertyLoader(CONFIG_PROPERTIES_PATH);
    }
    //SINGLETON DESIGN PATTERN
    public static ConfigLoader getInstance(){
        if(configLoader == null)
            configLoader = new ConfigLoader();
        return configLoader;
    }

    public String getBrowserType(){
        String prop = properties.getProperty("browserType");
        if(prop !=null) return prop;
        else throw new RuntimeException("Property is not specified in config.properites");
    }

    public String getStandardUserId(){
        String prop = properties.getProperty("standardUserId");
        if(prop !=null) return prop;
        else throw new RuntimeException("Property is not specified in config.properites");
    }

    public String getLockedUserId(){
        String prop = properties.getProperty("lockedUserId");
        if(prop !=null) return prop;
        else throw new RuntimeException("Property is not specified in config.properites");
    }

    public String getPwd(){
        String prop = properties.getProperty("password");
        if(prop !=null) return prop;
        else throw new RuntimeException("Property is not specified in config.properites");
    }

    public String getBaseUrl(){
        String prop = properties.getProperty("baseUrl");
        if(prop !=null) return prop;
        else throw new RuntimeException("Property is not specified in config.properites");
    }
}
