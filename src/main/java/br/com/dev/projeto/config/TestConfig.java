package br.com.dev.projeto.config;

import br.com.dev.projeto.entities.User;
import br.com.dev.projeto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired // associa uma instância de userRepository dentro de TestConfig
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Gabriel", "gabriel@gmail.com", "999888777", "123456");
        User u2 = new User(null, "joao", "joao@gmail.com", "999777666", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
