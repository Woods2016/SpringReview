import com.test08.scheduled.SchedulerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/4/14
 */
public class TestScheduler {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SchedulerConfig.class);

    }
}
