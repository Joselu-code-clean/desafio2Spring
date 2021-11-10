package com.example.desafio2Spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio2Spring.entities.Pedido;
import com.example.desafio2Spring.entities.Producto;
import com.example.desafio2Spring.repository.PedidoDaoI;

@Service("ServicioOtro")
public class PedidoDaoServiceImpl implements PedidoDaoServiceI{

	@Autowired
	private PedidoDaoI pedidoDaoI;
	
	@Override
	public void añadir(Pedido pedido) {
		pedidoDaoI.añadir(pedido);
	}

	@Override
	public List<Producto> obtenerProductos(Pedido pedido) {
		return pedidoDaoI.obtenerProductos(pedido);
	}

	
	@Override
	public void calcularPVP(Pedido pedido) {
		
		for (int i = 0; i < pedido.getLista_producto().size(); i++) {
			pedido.getLista_producto().get(i).setPrecio_pvp(pedido.getLista_producto().get(i).getPrecio_sin_impuesto() + (pedido.getLista_producto().get(i).getPrecio_sin_impuesto() * 0.04));
		}
		
	}
	
}
