package com.samanecorporation.adapter.repository.business.client;

import com.samanecorporation.adapter.repository.business.entity.ClientEntity;
import com.samanecorporation.domaine.model.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientEntityMapper {
    ClientEntity mapClientToClientEntity (Client client);
    Client mapClientEntityToClient (ClientEntity clientEntity);
    List<Client> mapListClientEntityToListClient (List<ClientEntity> clientEntity);
}
