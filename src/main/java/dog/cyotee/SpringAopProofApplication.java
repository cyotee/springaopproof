package dog.cyotee;

import dog.cyotee.model.Target;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAopProofApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringAopProofApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringAopProofApplication.class, args);

        ApplicationContext context = ApplicationContextProvider.getApplicationContext();

		Target target = context.getBean(Target.class);

        logger.info("**** Initiating successful execution.");

        logger.info("**** Target has the message: " + target.getMessage());

        logger.info("**** Initiating failed execution.");

        logger.info("**** Target has bad message: " + target.getBadMessage());

        System.exit(0);
	}
}