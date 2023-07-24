package br.com.cbf.campeonatobrasileiro.Repository;

import br.com.cbf.campeonatobrasileiro.Entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface TimeRepository extends JpaRepository<Time, Integer> {
}
