package com.example.desafio2Spring.services;

import java.util.List;

import com.example.desafio2Spring.entities.Pedido;
import com.example.desafio2Spring.entities.Producto;

public interface PedidoDaoServiceI {

	void añadir(Pedido pedido);
	
	List<Producto> obtenerProductos(Pedido pedido);
	
	void calcularPVP(Pedido pedido);
	
}
