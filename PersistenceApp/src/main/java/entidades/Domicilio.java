package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "domicilio")
public class Domicilio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="nombreCalle")
	public String nombreCalle;
	@Column(name= "numero")
	public int numero;
	
	@OneToOne(mappedBy="domicilio")
	private Cliente cliente;
	
	
	public Domicilio(String nombreCalle, int numero, Cliente cliente) {
		this.nombreCalle = nombreCalle;
		this.numero = numero;
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreCalle() {
		return nombreCalle;
	}
	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	public Domicilio(String nombreCalle, int numero) {
		this.nombreCalle = nombreCalle;
		this.numero = numero;
	}
	
	
	
	public Domicilio() {
	}
	@Override
	public String toString() {
		return "Domicilio [id=" + id + ", nombreCalle=" + nombreCalle + ", numero=" + numero + "]";
	}

	
	
	
	
	
	
}
