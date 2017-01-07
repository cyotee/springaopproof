package dog.cyotee.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by cyotee on 1/7/17.
 */
@Aspect
@Component
public class AfterThrowingAspect {


    private static final Logger logger = LoggerFactory.getLogger(AfterThrowingAspect.class);

    @AfterThrowing(value="dog.cyotee.aop.pointcuts.PointCuts.getterMethods()", throwing="e")
    public void afterReturningAdviceMethod(JoinPoint jp, RuntimeException e){
        logger.info("**** This is the AfterThrowing Advice. It is running after the target, "
                + jp.getTarget()
                + " has thrown an exception, "
                + e.getClass()
                + "with message, "
                + e.getMessage()
                + " because of invokation of method, "
                + jp.getSignature().getName());
    }
}
