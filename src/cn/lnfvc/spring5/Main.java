package cn.lnfvc.spring5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/3/6 下午4:58
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        User user1 = configApplicationContext.getBean(User.class);
        User user2 = configApplicationContext.getBean(User.class);
        System.out.println(user1);
        System.out.println(user2);

        configApplicationContext.close();
    }
}
