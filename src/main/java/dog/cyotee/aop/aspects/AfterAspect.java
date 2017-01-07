package dog.cyotee.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by cyotee on 1/6/17.
 */
@Aspect
@Component
public class AfterAspect {

    private static final Logger logger = LoggerFactory.getLogger(BeforeAspect.class);

    @After("dog.cyotee.aop.pointcuts.PointCuts.getterMethods()")
    public void afterAdviceMethod(JoinPoint jp){
        logger.info("**** This is the After Advice. It is running after the target, "
                + jp.getTarget() + " because of invokation of method, "
                + jp.getSignature().getName());
    }
}
