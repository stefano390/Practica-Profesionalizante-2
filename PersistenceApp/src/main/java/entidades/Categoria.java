package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name= "categoria")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@Column(name= "denominacion")
	public String denominacion;

	
	@ManyToMany(mappedBy= "categorias")
	private List<Articulo> articulos = new ArrayList <Articulo>();
	

	public Categoria(String denominacion, List<Articulo> articulos) {
		super();
		this.denominacion = denominacion;
		this.articulos = articulos;
	}


	public List<Articulo> getArticulos() {
		return articulos;
	}


	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDenominacion() {
		return denominacion;
	}


	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	

	public Categoria(String denominacion) {
		this.denominacion = denominacion;
	}


	public Categoria() {
	
	}


	@Override
	public String toString() {
		return "Categoria [id=" + id + ", denominacion=" + denominacion + "]";
	}

	
	
	
	
}
