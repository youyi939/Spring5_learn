package aopAspectJ.test;

import aopAspectJ.Config;
import aopAspectJ.User;
import cn.lnfvc.spring5.JavaConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: KenChen
 * @Description: aop 注解方式测试
 * @Date: Create in  2021/3/7 上午10:54
 */
public class TestAop {
    @Test
    public void tesAop(){
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        User user = configApplicationContext.getBean(User.class);
        user.add();
    }
}
