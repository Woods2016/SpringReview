import com.test06.aware.AwareConfig;
import com.test06.aware.DemoAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: 测试Spring Aware
 * @Author: ZhOu
 * @Date: 2017/4/12
 */
public class TestAware {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
        DemoAware demoAware = applicationContext.getBean(DemoAware.class);
        demoAware.outPutString();
        applicationContext.close();
    }
}
