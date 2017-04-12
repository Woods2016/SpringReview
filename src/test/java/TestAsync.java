import com.test07.async.AsyncTaskService;
import com.test07.async.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: 测试并发执行
 * @Author: ZhOu
 * @Date: 2017/4/12
 */
public class TestAsync {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService taskService = applicationContext.getBean(AsyncTaskService.class);

        for (int i = 0; i < 10; i++) {
            taskService.executeTask1(i);
            taskService.executeTask2(i);
        }

        applicationContext.close();
    }
}
