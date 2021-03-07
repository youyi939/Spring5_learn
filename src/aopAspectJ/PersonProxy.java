package aopAspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/3/7 上午11:16
 */

@Component
@Aspect
@Order(3)       //设置增强类优先级
public class PersonProxy {

    @Pointcut(value = "execution(* aopAspectJ.User.add(..))")
    public void pointdemo(){

    }

    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("通知。。。before...personProxy");
    }
}
