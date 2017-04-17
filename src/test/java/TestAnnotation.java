import com.test10.annotation.AnnotationConfig;
import com.test10.annotation.AnnotationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/4/17
 */
public class TestAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        AnnotationService annotationService = applicationContext.getBean(AnnotationService.class);
        annotationService.shows();
        applicationContext.close();
    }
}
