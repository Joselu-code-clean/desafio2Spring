package com.example.desafio2Spring.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.desafio2Spring.entities.Pedido;
import com.example.desafio2Spring.entities.Producto;

@Component
public class PedidoDaoImpl implements PedidoDaoI{

	@Override
	public void añadir(Pedido pedido) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Producto> obtenerProductos(Pedido pedido) {
		return pedido.getLista_producto();
	}
	

}