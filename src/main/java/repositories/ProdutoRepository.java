package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import model.Produto;

@Repository
@EnableJpaRepositories
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
