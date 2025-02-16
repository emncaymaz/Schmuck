package com.schmuck.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.UUID;


import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private String surname;
    private String email;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Wedding> weddingList;

}
