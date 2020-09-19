package br.com.daysesoares.exemplo3;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class ExemploConsumirProduzir {

	public static void main(String[] args) throws Exception {
		
		CamelContext context = new DefaultCamelContext();
		
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				
				from("direct:start")
				.process(new Processor() {
					
					@SuppressWarnings("deprecation")
					public void process(Exchange exchange) throws Exception {

						//System.out.println("Processando...");
						String mensagem = exchange.getIn().getBody(String.class);
						mensagem = mensagem + " Adeus Dayse.";
						exchange.getOut().setBody(mensagem);
						
					}
				})
				.to("seda:end");
				
			}
		});
		
		context.start();
		
		ProducerTemplate pt = context.createProducerTemplate();
		pt.sendBody("direct:start", "Olá a todos!");
		
		ConsumerTemplate ct = context.createConsumerTemplate();
		String mensagem = ct.receiveBody("seda:end", String.class);
		
		System.out.println(mensagem);
	}
	
}
