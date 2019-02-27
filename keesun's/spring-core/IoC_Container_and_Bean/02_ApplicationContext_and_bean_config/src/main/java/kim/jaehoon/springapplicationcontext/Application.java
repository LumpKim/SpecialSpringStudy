package kim.jaehoon.springapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);

        // 만약 ApplicationConfig 를 설정으로 사용하기 위해서는
        // ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // 만약 외부에서 .xml 파일을 통해 설정하기 위해서는
        // ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

    }
}
