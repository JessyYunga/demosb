package ec.edu.insteclrg.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class TipoBarrio {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(updatable = false, nullable = false)
	    private Long id;

	    @Column(nullable = false)
	    private String nombre;

}
