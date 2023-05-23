package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.insteclrg.domain.Habitante;

public interface HabitanteRepository extends JpaRepository<Habitante, Long>{

}
