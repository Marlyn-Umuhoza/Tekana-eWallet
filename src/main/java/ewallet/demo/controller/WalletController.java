package ewallet.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import ewallet.demo.model.Wallet;
import ewallet.demo.service.WalletService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wallets")
public class WalletController {

    @GetMapping("/")
	public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "home";
	}
    @GetMapping("/error")
    public String home(){
        return "Ooops";
    }

    @Autowired
    private WalletService walletService;

    // Create a new wallet
    @PostMapping
    public Wallet createWallet(@RequestBody Wallet wallet) {
        return walletService.createWallet(wallet);
    }

    // Get all wallets
    @GetMapping
    public List<Wallet> getAllWallets() {
        return walletService.getAllWallets();
    }

    // Get wallet by ID
    @GetMapping("/{id}")
    public Optional<Wallet> getWalletById(@PathVariable Long id) {
        return walletService.getWalletById(id);
    }

    // Update wallet by ID
    @PutMapping("/{id}")
    public Wallet updateWallet(@PathVariable Long id, @RequestBody Wallet walletDetails) {
        return walletService.updateWallet(id, walletDetails);
    }

    // Delete all wallets 
    @DeleteMapping
    public String deleteAllWallets() {
        walletService.deleteAllWallets();
        return "All wallets have been deleted successfully.";
    }

    // Delete wallet by ID
    @DeleteMapping("/{id}")
    public void deleteWallet(@PathVariable Long id) {
        walletService.deleteWallet(id);
    }
}
