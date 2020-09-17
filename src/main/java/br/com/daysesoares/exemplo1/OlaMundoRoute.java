package br.com.daysesoares.exemplo1;

import org.apache.camel.builder.RouteBuilder;

public class OlaMundoRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		System.out.println("Olá Mundo!");
		
	}

}
