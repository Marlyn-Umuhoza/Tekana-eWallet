package ewallet.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ewallet.demo.model.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
