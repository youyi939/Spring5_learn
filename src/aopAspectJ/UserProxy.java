package aopAspectJ;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/3/7 上午10:16
 */

//增强的类
    @Component
    @Aspect //生成代理对象
public class UserProxy {

//    前置通知
//    before注解表示作为前置通知
    @Before(value = "execution(* aopAspectJ.User.add(..))")
    public void before(){
        System.out.println("前置通知。。。before");
    }

    @After(value = "execution(* aopAspectJ.User.add(..))")
    public void after(){
        System.out.println("after通知");
    }

}
