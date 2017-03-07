import com.test02.init.BeanWayService;
import com.test02.init.InitConfig;
import com.test02.init.JsrWayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: 测试bean的init和destroy
 * @Author: ZhOu
 * @Date: 2017/3/6
 */
public class TestInit {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(InitConfig.class);

        BeanWayService beanWayService = applicationContext.getBean(BeanWayService.class);

        JsrWayService jsrWayService = applicationContext.getBean(JsrWayService.class);

        applicationContext.close();
    }
}
