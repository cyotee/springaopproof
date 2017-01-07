package dog.cyotee.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by cyotee on 1/7/17.
 */
@Aspect
@Component
public class AfterReturningAspect {

    private static final Logger logger = LoggerFactory.getLogger(AfterReturningAspect.class);

    @AfterReturning(value="dog.cyotee.aop.pointcuts.PointCuts.getterMethods()", returning="returnValue")
    public void afterReturningAdviceMethod(JoinPoint jp, String returnValue){
        logger.info("**** This is the AfterReturning Advice. It is running after the target, "
                + jp.getTarget()
                + " has successfully executed, "
                + jp.getSignature().getName()
                + " returning the value "
                + returnValue
                + " because of invokation of method, "
                + jp.getSignature().getName());
    }
}
