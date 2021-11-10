package com.example.desafio2Spring.entities;

public class Producto {

	private Long id;
	
	private String nombre;
	
	private Double precioPVP;
	
	private Double precioSinImpuesto;

	public Long getId() {
		return id;
	}
	
	

	public Producto(Long id, String nombre, Double precio_sin_impuesto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioSinImpuesto = precio_sin_impuesto;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio_pvp() {
		return precioPVP;
	}

	public void setPrecio_pvp(Double precio_pvp) {
		this.precioPVP = precio_pvp;
	}

	public Double getPrecio_sin_impuesto() {
		return precioSinImpuesto;
	}

	public void setPrecio_sin_impuesto(Double precio_sin_impuesto) {
		this.precioSinImpuesto = precio_sin_impuesto;
	}



	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio_pvp=" + precioPVP + ", precio_sin_impuesto="
				+ precioSinImpuesto + "]";
	}
	
	
	
}
