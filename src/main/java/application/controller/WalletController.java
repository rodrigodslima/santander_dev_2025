package application.controller;

import application.model.Wallet;
import application.service.WalletService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wallets")
public class WalletController {
    private final WalletService walletService;
    public WalletController(WalletService walletService) { this.walletService = walletService; }

    @GetMapping
    public List<Wallet> all() { return walletService.findAll(); }

    @PostMapping
    public Wallet create(@RequestBody Wallet w) { return walletService.save(w); }
}
