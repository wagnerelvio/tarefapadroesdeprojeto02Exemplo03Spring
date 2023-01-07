package br.com.welc.aulaid.servicos;

import org.springframework.stereotype.Service;

/**
 * @author wagne
 *
 */
@Service
public class PagamentoTotal {

	private TaxaDeServico taxaDeServico;
	private TaxaDeServicoDeEntrega taxaDeServicoDeEntrega;

	public PagamentoTotal(TaxaDeServico taxaDeServico, TaxaDeServicoDeEntrega taxaDeServicoDeEntrega) {
		this.taxaDeServico = taxaDeServico;
		this.taxaDeServicoDeEntrega = taxaDeServicoDeEntrega;

	}

	public double precoTotal(double custo, String regiao) {
		return custo + taxaDeServicoDeEntrega.taxa(regiao) + taxaDeServico.taxa(custo);

	}

}