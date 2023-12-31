package com.slicrofinance.repositories;

import com.slicrofinance.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepo extends JpaRepository<Client, Long> {
}
