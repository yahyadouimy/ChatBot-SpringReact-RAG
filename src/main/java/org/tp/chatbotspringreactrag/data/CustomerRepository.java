package org.tp.chatbotspringreactrag.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tp.chatbotspringreactrag.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
