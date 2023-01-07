package br.com.welc.aulaid.servicos;

import org.springframework.stereotype.Service;

/**
 * @author wagne
 *
 */
@Service
public class TaxaDeServico {
	public double taxa(double valorDoProduto) {
		return valorDoProduto * 0.12;
	}

}