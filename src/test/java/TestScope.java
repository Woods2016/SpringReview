import com.test03.scope.DemoService1;
import com.test03.scope.DemoService2;
import com.test03.scope.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/3/6
 */
public class TestScope {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoService1 demoService1 = applicationContext.getBean(DemoService1.class);
        DemoService1 demoService2 = applicationContext.getBean(DemoService1.class);

        System.out.println("demoService1.equals(demoService2)  " + demoService1.equals(demoService2));


        DemoService2 demoService3 = applicationContext.getBean(DemoService2.class);
        DemoService2 demoService4 = applicationContext.getBean(DemoService2.class);

        System.out.println("demoService3.equals(demoService4)  " + demoService3.equals(demoService4));

        applicationContext.close();
    }
}
