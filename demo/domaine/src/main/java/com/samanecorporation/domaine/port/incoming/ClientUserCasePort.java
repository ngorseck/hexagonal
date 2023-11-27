package com.samanecorporation.domaine.port.incoming;

import com.samanecorporation.dto.ClientDTO;

import java.util.List;

public interface ClientUserCasePort {

    ClientDTO saveAction(ClientDTO actionDTO);
    List<ClientDTO> findAll();
}
