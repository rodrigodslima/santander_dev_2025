package application.service;

import application.model.Wallet;
import application.repository.WalletRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService {
    private final WalletRepository walletRepository;
    public WalletService(WalletRepository walletRepository) { this.walletRepository = walletRepository; }

    public List<Wallet> findAll() { return walletRepository.findAll(); }
    public Wallet save(Wallet w) { return walletRepository.save(w); }
}
