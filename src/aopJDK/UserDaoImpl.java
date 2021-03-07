package aopJDK;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/3/7 上午9:13
 */
public class UserDaoImpl implements UserDao{
    @Override
        public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("uodate方法执行了");
        return id;
    }
}
