package br.com.dev.projeto.config;

import br.com.dev.projeto.entities.Category;
import br.com.dev.projeto.entities.Order;
import br.com.dev.projeto.entities.Product;
import br.com.dev.projeto.entities.User;
import br.com.dev.projeto.entities.enums.OrderStatus;
import br.com.dev.projeto.repositories.CategoryRepository;
import br.com.dev.projeto.repositories.OrderRepository;
import br.com.dev.projeto.repositories.ProductRepository;
import br.com.dev.projeto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired // associa uma instância de userRepository dentro de TestConfig
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Gabriel", "gabriel@gmail.com", "999888777", "123456");
        User u2 = new User(null, "joao", "joao@gmail.com", "999777666", "123456");

        Product p1 = new Product(null, "The Lord of The Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at molis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID,u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T13:42:10Z"), OrderStatus.WAITING_PAYMENT ,u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u1);

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
    }
}
