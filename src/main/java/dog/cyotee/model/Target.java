package dog.cyotee.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by cyotee on 1/6/17.
 */
@Component
@ConfigurationProperties(prefix="target")
public class Target {

    private static final Logger logger = LoggerFactory.getLogger(Target.class);

    private String message;

    public String getMessage() {
        logger.info("**** Target is returning message.");

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBadMessage(){
        logger.info("**** Target is returning a bad message.");
        throw new RuntimeException("This exception was thrown by the target.");
    }
}
