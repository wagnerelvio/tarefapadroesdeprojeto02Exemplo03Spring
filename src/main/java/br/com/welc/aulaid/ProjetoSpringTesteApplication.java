package br.com.welc.aulaid;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.welc.aulaid.servicos.PagamentoTotal;

@SpringBootApplication
//public class ProjetoSpringTesteApplication {
public class ProjetoSpringTesteApplication implements CommandLineRunner {

	@Autowired
	// private PayService payservice;
	private PagamentoTotal pagamentototal;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringTesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("\n **  Data e hora: "+dtf.format(LocalDateTime.now()) +"  **");
		System.out.println("\nValores totais (preço + frete) por região para um produto com o valor de R$ 1.000,00\n");
		
		
		
		
		System.out.println(	"Valor total (preço + frete) para a região Sudeste: " + pagamentototal.precoTotal(1000.0, "SE"));// .precoTotal(300.0,
																												// "SE"));
		System.out.println("Valor total (preço + frete) para a região Sul: " + pagamentototal.precoTotal(1000.0, "S"));
		System.out.println(
				"Valor total (preço + frete) para a região Centro Oeste: " + pagamentototal.precoTotal(1000.0, "CO"));
		System.out.println(
				"Valor total (preço + frete) para a região Nordeste: " + pagamentototal.precoTotal(1000.0, "NE"));
		System.out.println("Valor total (preço + frete) para a região Norte: " + pagamentototal.precoTotal(1000.0, "N"));
		System.out.println(
				"Valor total (preço + frete) para Montividéu: " + pagamentototal.precoTotal(1000.0, "Montivideu"));
	}

}

