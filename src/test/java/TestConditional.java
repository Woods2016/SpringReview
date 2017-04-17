import com.test09.conditional.ConditionConfig;
import com.test09.conditional.ConditionService;
import com.test09.conditional.WindowsConditionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/4/17
 */
public class TestConditional {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ConditionService service = applicationContext.getBean(WindowsConditionService.class);
        System.out.println(applicationContext.getEnvironment().getProperty("os.name") + "\t" + service.getServerName());
        applicationContext.close();
    }
}
