package com.samanecorporation.domaine.port.outgoing;

import com.samanecorporation.domaine.model.Client;

import java.util.List;

public interface ClientRepositoryPort {

    Client saveAction(Client action);
    List<Client> findAll();
}
