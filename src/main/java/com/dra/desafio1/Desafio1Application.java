package com.dra.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dra.desafio1.entities.Order;
import com.dra.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Order order =  new Order(Integer.valueOf(1034),150.00,20.0);
		//Order order =  new Order(Integer.valueOf(2282),800.00,10.0);
		Order order =  new Order(Integer.valueOf(1309),95.90,0.0);
		
		System.out.println("Pedido Codigo: "+ order.getCode() + "\n" + "Valor Total: " + orderService.total(order));
		
	}

}
