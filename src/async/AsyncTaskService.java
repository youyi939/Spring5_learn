package async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/3/7 下午12:18
 */

@Service
public class AsyncTaskService {

    @Async      //注明该方法是异步方法，会被自动注入进ThreadPoolExecutor
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1,"+i);
    }

}
