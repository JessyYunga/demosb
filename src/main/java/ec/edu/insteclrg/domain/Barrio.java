package ec.edu.insteclrg.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Barrio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;

	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String Administrador;
	
	
	@Column()
	private Integer CalificacionPositiva;
	@Column()
	private Integer CalificacionNegativa;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( nullable = false)
    private Ciudad ciudad;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( nullable = false)
    private TipoBarrio tipoBarrio;
	
}
