package br.bicicletao.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.bicicletao.model.Produto;


@Named
@RequestScoped
public class ProdutoController {

	private Produto produto;

	public Produto getProduto() {
		if (produto == null) {
			produto = new Produto();
		}
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void limpar() {
		setProduto(new Produto());
	}

	public void incluir() {
		System.out.println(getProduto().getNome());
		System.out.println(getProduto().getCategoria());
		System.out.println(getProduto().getStatus());
	}
}
