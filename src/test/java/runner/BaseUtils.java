package runner;

import java.util.Properties;

/*
final class - can't extend final class.
If a class is intended to be used as a utility class or a helper class,
it may make sense to declare it as final to prevent unintended modification
 */
public final class BaseUtils {

    private static final String ENV_CHROME_OPTIONS = "CHROME_OPTIONS";
    private static final String ENV_APP_OPTIONS = "APP_OPTIONS";

    static final String PREFIX_PROP = "default.";

    private static final String PROP_CHROME_OPTIONS = PREFIX_PROP + ENV_CHROME_OPTIONS.toLowerCase();

    private static Properties properties;

    private static void initProperties(){
        if (properties == null){
            properties = new Properties();
            if(isServerRun())
        }
    }

}
