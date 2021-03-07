package async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: KenChen
 * @Description:
 * @Date: Create in  2021/3/7 下午12:20
 */
public class TestAsync {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService service = configApplicationContext.getBean(AsyncTaskService.class);

        for (int i = 0; i < 10 ; i++) {
            service.executeAsyncTask(i);
//            service.executeAsyncTaskPlus(i);
        }

        configApplicationContext.close();
    }
}
