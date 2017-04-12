import com.test05.event.DemoPublish;
import com.test05.event.EventConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/3/7
 */
public class TestEvent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublish demoPublish = context.getBean(DemoPublish.class);
        demoPublish.publish("hello event!");
        context.close();

    }
}
