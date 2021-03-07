package aopAspectJ;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/3/7 上午10:16
 */

//增强的类
    @Order(1)
    @Component
    @Aspect //生成代理对象
public class UserProxy {
//        相同切入点抽取
    @Pointcut(value = "execution(* aopAspectJ.User.add(..))")
    public void pointdemo(){

    }


//    前置通知
//    before注解表示作为前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("前置通知。。。before");
    }

//    最终通知
    @After(value = "pointdemo()")
    public void after(){
        System.out.println("after通知");
    }

//    后置通知
    @AfterReturning(value = "pointdemo()")
    public void afterReturning(){
        System.out.println("afterReturning通知");
    }

//    异常通知
    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing通知");
    }

//    环绕通知
    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");

//        被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后");
    }
}
