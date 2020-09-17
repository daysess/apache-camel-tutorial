package br.com.daysesoares.exemplo1;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class OlaMundo {

	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext();
		
		context.addRoutes(new OlaMundoRoute());
		context.start();
		
	}
	
}
