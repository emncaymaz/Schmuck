package com.schmuck.repository;

import com.schmuck.dto.command.GuestAttactCommand;
import com.schmuck.model.Guest;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuestRepository extends JpaRepository<Guest, UUID> {
}