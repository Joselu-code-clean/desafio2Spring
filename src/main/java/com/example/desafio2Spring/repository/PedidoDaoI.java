package com.example.desafio2Spring.repository;

import java.util.List;

import com.example.desafio2Spring.entities.Pedido;
import com.example.desafio2Spring.entities.Producto;

public interface PedidoDaoI {
	
	void añadir(Pedido pedido);
	
	List<Producto> obtenerProductos(Pedido pedido);

}
