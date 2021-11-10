package com.example.desafio2Spring.entities;

import java.util.List;

public class Pedido {
	
	private Long id;
	
	private String destinatario;
	
	private String direccion;
	
	private Ciudad_Entrega ciudadEntrega;

	private List<Producto> listaProducto;

	
	
	public Pedido(Long id, String destinatario, String direccion, Ciudad_Entrega ciudad_entrega, List<Producto> lista_producto) {
		this.id = id;
		this.destinatario = destinatario;
		this.direccion = direccion;
		this.ciudadEntrega = ciudad_entrega;
		this.listaProducto = lista_producto;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Ciudad_Entrega getCiudad_entrega() {
		return ciudadEntrega;
	}


	public void setCiudad_entrega(Ciudad_Entrega ciudad_entrega) {
		this.ciudadEntrega = ciudad_entrega;
	}


	public List<Producto> getLista_producto() {
		return listaProducto;
	}


	public void setLista_producto(List<Producto> lista_producto) {
		this.listaProducto = lista_producto;
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", destinatario=" + destinatario + ", direccion=" + direccion + ", ciudad_entrega="
				+ ciudadEntrega + ", lista_producto=" + listaProducto + "]";
	}
	
	
	
	

}
