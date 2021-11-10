package com.example.desafio2Spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio2Spring.entities.Pedido;
import com.example.desafio2Spring.entities.Producto;
import com.example.desafio2Spring.repository.ProductoDaoI;

@Service
public class ProductoDaoServiceImpl implements ProductoDaoServiceI{

	@Autowired
	private ProductoDaoI productoDaoI;
	
	@Override
	public void añadir(Producto producto) {
		productoDaoI.añadir(producto);
	}
	

}
