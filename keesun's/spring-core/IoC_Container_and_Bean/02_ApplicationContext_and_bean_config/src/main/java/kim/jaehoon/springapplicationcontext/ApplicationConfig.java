package kim.jaehoon.springapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Application.class)
public class ApplicationConfig {


//    @Bean
//    public BookRepository bookRepository() {
//        return new BookRepository();
//    }
//
//    @Bean
//    public BookService bookService() {
//        return new BookService();
//    }

}
