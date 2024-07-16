package org.tp.chatbotspringreactrag;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tp.chatbotspringreactrag.data.CustomerRepository;
import org.tp.chatbotspringreactrag.entities.Customer;

@SpringBootApplication
public class ChatBotSpringReactRagApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatBotSpringReactRagApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(CustomerRepository repository) {
        return args -> {
            repository.save(new Customer(null, "Customer1", "Doe"));
            repository.save(new Customer(null, "Customer2", "Smith"));
            repository.save(new Customer(null, "Customer3", "Smith"));
            repository.save(new Customer(null, "Customer4", "Smith"));
            repository.save(new Customer(null, "Customer5", "Smith"));

        };
    }
}
