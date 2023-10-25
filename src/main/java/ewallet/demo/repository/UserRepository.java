package ewallet.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ewallet.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
