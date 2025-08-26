package application.service;

import application.model.Client;
import application.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    public ClientService(ClientRepository clientRepository) { this.clientRepository = clientRepository; }

    public List<Client> findAll() { return clientRepository.findAll(); }
    public Client save(Client c) { return clientRepository.save(c); }
}
