package application.service;

import application.model.Client;
import application.model.Wallet;
import application.repository.ClientRepository;
import application.repository.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class WalletService {
    private final WalletRepository walletRepository;
    private final ClientRepository clientRepository;

    public WalletService(WalletRepository walletRepository, ClientRepository clientRepository) {
        this.walletRepository = walletRepository;
        this.clientRepository = clientRepository;
    }

    public Wallet save(Wallet w) {
        if (w.getClient() != null && w.getClient().getId() != null) {
            Client existingClient = clientRepository.findById(w.getClient().getId())
                    .orElseThrow(() -> new RuntimeException("Cliente não encontrado com ID " + w.getClient().getId()));
            w.setClient(existingClient);
        }
        return walletRepository.save(w);
    }

    public java.util.List<Wallet> findAll() {
        return walletRepository.findAll();
    }
}
