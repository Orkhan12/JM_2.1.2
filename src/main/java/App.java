import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloBeanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloBeanTwo = (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBeanOne = (Cat) applicationContext.getBean("cat");
        Cat catBeanTwo = (Cat) applicationContext.getBean("cat");

        System.out.println(helloBeanOne == helloBeanTwo);
        System.out.println(catBeanOne == catBeanTwo);
        System.out.println(helloBeanOne.getMessage());
    }
}