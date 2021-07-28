package com.twokeys.tksales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twokeys.tksales.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
