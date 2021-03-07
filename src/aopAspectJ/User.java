package aopAspectJ;

import org.springframework.stereotype.Component;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/3/7 上午10:14
 */
@Component
public class User {
    public void add(){
        System.out.println("add......");
    }
}
