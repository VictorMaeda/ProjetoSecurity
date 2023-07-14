package repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import model.UserModel;


@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<UserModel, Long>{
Optional<UserModel> findByLogin(String login);
}
