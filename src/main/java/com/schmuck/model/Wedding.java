package com.schmuck.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.UUID;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Wedding {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private LocalDateTime weddingDate;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<WeddingGuest> weddingGuests;

}
