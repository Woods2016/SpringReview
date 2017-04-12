import com.test04.profile.DemoBean;
import com.test04.profile.ProfileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: 测试Profile
 * @Author: ZhOu
 * @Date: 2017/3/7
 */
public class TestProfile {
    public static void main(String[] args) throws ClassNotFoundException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("dev");
//        applicationContext.getEnvironment().setActiveProfiles("prod");

        //先设置活动，再注册Bean配置类
        applicationContext.register(ProfileConfig.class);

        //刷新容器，才能生效
        applicationContext.refresh();
        DemoBean demoBean = applicationContext.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        applicationContext.close();
    }
}
