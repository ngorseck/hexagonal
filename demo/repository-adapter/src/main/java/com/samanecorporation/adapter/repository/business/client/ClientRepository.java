package com.samanecorporation.adapter.repository.business.client;

import com.samanecorporation.adapter.repository.business.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
}
