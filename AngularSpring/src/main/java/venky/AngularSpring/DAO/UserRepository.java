package venky.AngularSpring.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,String> {

	List<UserEntity> findByUserName(String userName);
}
