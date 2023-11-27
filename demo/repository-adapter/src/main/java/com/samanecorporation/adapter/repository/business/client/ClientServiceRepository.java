package com.samanecorporation.adapter.repository.business.client;

import com.samanecorporation.domaine.model.Client;
import com.samanecorporation.domaine.port.outgoing.ClientRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceRepository implements ClientRepositoryPort {
    private final ClientRepository clientRepository;
    private final ClientEntityMapper clientEntityMapper;

    public ClientServiceRepository(ClientRepository clientRepository, ClientEntityMapper clientEntityMapper) {
        this.clientRepository = clientRepository;
        this.clientEntityMapper = clientEntityMapper;
    }

    @Override
    public Client saveAction(Client client) {

        // Mapping domaine to entity and using repository to call database

        // Mapping entity to domaine

        return clientEntityMapper.mapClientEntityToClient(clientRepository.save(clientEntityMapper.mapClientToClientEntity(client)));
    }

    @Override
    public List<Client> findAll() {
        return clientEntityMapper.mapListClientEntityToListClient(
                clientRepository.findAll()
        );
    }
}
