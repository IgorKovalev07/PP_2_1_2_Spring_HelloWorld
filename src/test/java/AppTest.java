import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    @Test
    public void testBeansScope() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        Cat beanCatOne =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean == beanOne);
        System.out.println(beanCat == beanCatOne);

    }
}

