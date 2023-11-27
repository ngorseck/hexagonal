package com.samanecorporation.domaine.service;


import com.samanecorporation.domaine.mapper.ClientMapper;
import com.samanecorporation.domaine.port.incoming.ClientUserCasePort;
import com.samanecorporation.domaine.port.outgoing.ClientRepositoryPort;
import com.samanecorporation.dto.ClientDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements ClientUserCasePort {
    private final ClientRepositoryPort clientRepositoryPort;
    private final ClientMapper clientMapper;

    public ClientService(ClientRepositoryPort clientRepositoryPort, ClientMapper clientMapper) {
        this.clientRepositoryPort = clientRepositoryPort;
        this.clientMapper = clientMapper;
    }

    @Override
    public ClientDTO saveAction(ClientDTO clientDTO) {

        // Mapping dto to domaine
        // using clientRepositoryPort to call database action
        // Mapping domaine to dto

        return clientMapper.mapClientToClientDTO(
                clientRepositoryPort.saveAction(
                        clientMapper.mapClientDTOToClient(clientDTO)
                )
        );
    }

    @Override
    public List<ClientDTO> findAll() {
        return clientMapper.mapListClientToListClientDTO(
                clientRepositoryPort.findAll()
        );
    }
}
