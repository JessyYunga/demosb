package ec.edu.insteclrg.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.insteclrg.domain.Casa;

public interface CasaRepository extends JpaRepository<Casa, Long>{

}
