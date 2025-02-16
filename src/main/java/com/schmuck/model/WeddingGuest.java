package com.schmuck.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.UUID;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeddingGuest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Gift gift;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Guest guest;

    private BigDecimal amount;

}
