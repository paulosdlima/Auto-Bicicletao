package br.bicicletao.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MenuController implements Serializable{

	private static final long serialVersionUID = 4928052926900702062L;

	public String login() {
		return "login.xhtml?faces-redirect=true";
	}

	public String cadastroUsuario() {
		return "usuario.xhtml?faces-redirect=true";
	}

	public String cadastrarProduto() {
		return "produto.xhtml?faces-redirect=true";
	}

}
