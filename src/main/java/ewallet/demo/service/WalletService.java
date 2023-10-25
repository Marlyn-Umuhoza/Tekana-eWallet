package ewallet.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ewallet.demo.model.Wallet;
import ewallet.demo.repository.WalletRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WalletService {
    @Autowired
    private WalletRepository walletRepository;

    // Create a new wallet
    public Wallet createWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    // Get all wallets
    public List<Wallet> getAllWallets() {
        return walletRepository.findAll();
    }

    // Get wallet by ID
    public Optional<Wallet> getWalletById(Long id) {
        return walletRepository.findById(id);
    }

    // Update wallet
    public Wallet updateWallet(Long id, Wallet walletDetails) {
        Optional<Wallet> wallet = walletRepository.findById(id);
        if (wallet.isPresent()) {
            Wallet existingWallet = wallet.get();
            existingWallet.setBalance(walletDetails.getBalance());
            return walletRepository.save(existingWallet);
        }
        return null;
    }

    // Delete all wallets
    public void deleteAllWallets() {
        walletRepository.deleteAll();
    }

    // Delete wallet
    public void deleteWallet(Long id) {
        walletRepository.deleteById(id);
    }

    // Other business logic related to wallets
}
