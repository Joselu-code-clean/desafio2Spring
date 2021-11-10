package com.example.desafio2Spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.desafio2Spring.entities.Ciudad_Entrega;
import com.example.desafio2Spring.entities.Pedido;
import com.example.desafio2Spring.entities.Producto;
import com.example.desafio2Spring.services.PedidoDaoServiceI;

@SpringBootApplication
public class Desafio2SpringApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("ServicioPeninsula")
	private PedidoDaoServiceI pedidoDaoServicePeninsulaI;

	@Autowired
	@Qualifier("ServicioOtro")
	private PedidoDaoServiceI pedidoDaoServiceI;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio2SpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Producto> listaProductos = new ArrayList<>();
		
		listaProductos.add(new Producto(0l,"ATUN",1.00));
		listaProductos.add(new Producto(1l,"SARDINAS",1.20));
		
		Pedido pedido1 = new Pedido(0L , "PEPE", "C/ BALUARTE", Ciudad_Entrega.CANARIAS, listaProductos);
		
		if ( pedido1.getCiudad_entrega() != null ) {
			pedidoDaoServiceI.calcularPVP(pedido1);
		} else {
			pedidoDaoServicePeninsulaI.calcularPVP(pedido1);
		}
		
		System.out.println(pedido1.toString());
		
	}

}
