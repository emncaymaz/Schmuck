package com.schmuck.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.UUID;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private String surname;

}
