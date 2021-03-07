package cn.lnfvc.spring5;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.reflect.Proxy;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/3/6 下午4:48
 */
@Component
@Scope("prototype")
public class User implements InitializingBean , DisposableBean {

    public User() {
        System.out.println("User 构造方法");
    }

    public void add(){
        System.out.println("add......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet 执行");
    }

    public  void initBean(){
        System.out.println("initBean  执行");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("@PostConstruct 执行");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy 执行");
    }

    public void destroyBean() {
        System.out.println("destroyBean 执行");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy 执行");

    }
}
