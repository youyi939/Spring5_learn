package async;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/3/7 下午12:15
 */

@Configuration
@ComponentScan
@EnableAsync        //开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);        //设置线程池大小
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);      //设置队列容量
        taskExecutor.initialize();
        return taskExecutor;
    }



}
