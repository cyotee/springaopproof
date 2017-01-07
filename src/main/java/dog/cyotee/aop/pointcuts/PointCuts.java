package dog.cyotee.aop.pointcuts;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by cyotee on 1/6/17.
 */
public class PointCuts {

    @Pointcut("execution(* dog.cyotee..*.get*())")
    public void getterMethods() {}
}
