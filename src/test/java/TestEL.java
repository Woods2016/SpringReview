import com.test01.el.ELConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/3/6
 */
public class TestEL {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig elConfig = applicationContext.getBean(ELConfig.class);
        elConfig.outPutSource();
        applicationContext.close();
    }
}
