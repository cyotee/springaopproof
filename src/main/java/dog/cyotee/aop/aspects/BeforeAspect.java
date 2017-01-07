package dog.cyotee.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by cyotee on 1/6/17.
 */
@Aspect
@Component
public class BeforeAspect {

    private static final Logger logger = LoggerFactory.getLogger(BeforeAspect.class);

    @Before("dog.cyotee.aop.pointcuts.PointCuts.getterMethods()")
    public void beforeAdviceMethod(JoinPoint jp){
        logger.info("**** This is the Before Advice. It is running before the target, "
                + jp.getTarget()
                + " because of invokation of method, "
                + jp.getSignature().getName());
    }
}
