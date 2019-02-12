package Recipe_2_II_i.config;

import Recipe_2_II_i.Battery;
import Recipe_2_II_i.Disc;
import Recipe_2_II_i.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfiguration {

    @Bean
    public Product aaa() {
        Battery p1 = new Battery("AAA", 2.5);
        p1.setRechargeable(true);
        return p1;
    }

    @Bean
    public Product cdrw() {
        Disc p2 = new Disc("CD_RW", 1.5);
        p2.setCapacity(700);
        return p2;
    }

}
