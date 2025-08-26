package application.controller;

import application.model.Client;
import application.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    private final ClientService clientService;
    public ClientController(ClientService clientService) { this.clientService = clientService; }

    @GetMapping
    public List<Client> all() { return clientService.findAll(); }

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody Client c) {
        Client saved = clientService.save(c);
        return ResponseEntity.created(URI.create("/api/clients/" + saved.getId())).body(saved);
    }
}
