package com.samanecorporation.adapter.api;

import com.samanecorporation.domaine.port.incoming.ClientUserCasePort;
import com.samanecorporation.dto.ClientDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    private ClientUserCasePort clientUserCasePort;

    public ClientController(ClientUserCasePort clientUserCasePort) {
        this.clientUserCasePort = clientUserCasePort;
    }

    @PostMapping("/save")
    public ResponseEntity<ClientDTO> save(@RequestBody ClientDTO clientDTO) {

        return  new ResponseEntity<>(clientUserCasePort.saveAction(clientDTO), HttpStatus.OK);
    }

    @PostMapping("/all")
    public ResponseEntity<List<ClientDTO>> all() {

        return new ResponseEntity<>(clientUserCasePort.findAll(), HttpStatus.OK);
    }
}
