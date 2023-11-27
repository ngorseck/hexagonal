package com.samanecorporation.domaine.mapper;

import com.samanecorporation.domaine.model.Client;
import com.samanecorporation.dto.ClientDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    Client mapClientDTOToClient (ClientDTO clientDTO);
    ClientDTO mapClientToClientDTO (Client client);
    List<ClientDTO> mapListClientToListClientDTO (List<Client> client);
}
