package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "factura")
public class Factura implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="fecha")
	public String fecha;
	@Column(name= "numero")
	public int numero;
	@Column(name="total")
	public int total;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_cliente")
	private Cliente cliente;
	
	
	@OneToMany(mappedBy = "factura",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
	
	
//@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
	
	public Factura(String fecha, int numero, int total, Cliente cliente) {
		this.fecha = fecha;
		this.numero = numero;
		this.total = total;
		this.cliente = cliente;
	}
	
	
	
	public List<DetalleFactura> getDetalles() {
		return detalles;
	}



	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	public Factura(String fecha, int numero, int total) {
	
		this.fecha = fecha;
		this.numero = numero;
		this.total = total;
	}
	
	
	public Factura() {
	}
	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", numero=" + numero + ", total=" + total + "]";
	}
	
	
	
	
	
	
	
}
