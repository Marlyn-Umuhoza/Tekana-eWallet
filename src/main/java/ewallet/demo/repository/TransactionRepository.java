package ewallet.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ewallet.demo.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
