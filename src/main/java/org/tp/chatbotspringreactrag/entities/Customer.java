package org.tp.chatbotspringreactrag.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
}
