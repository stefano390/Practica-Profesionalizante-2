package entidades;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name= "detalleFactura")
public class DetalleFactura implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="cantidad")
	public int cantidad;
	@Column(name= "subtotal")
	public int subtotal;
	
	@ManyToOne (cascade = CascadeType.PERSIST)
	@JoinColumn(name= "fk_factura")
	private Factura factura;
	
	@ManyToOne (cascade = CascadeType.PERSIST)
	@JoinColumn(name= "fk_articulo")
	private Articulo articulo;
	
	
	public DetalleFactura(int cantidad, int subtotal, Factura factura) {
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.factura = factura;
	}
	
	public void setArticulos(Articulo articulos) {
		this.articulo = articulos;// agreggue estas lineas
	}
	//Get and set//
	
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	
	//Constructores vacios//
	
	
	public DetalleFactura(int cantidad, int subtotal) {
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}
	
	
	public DetalleFactura() {
		
	}
	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", subtotal=" + subtotal + "]";
	}

	
	
	
	
	
}
