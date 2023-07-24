package br.com.cbf.campeonatobrasileiro.Repository;

import br.com.cbf.campeonatobrasileiro.Entity.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Integer> {
}
