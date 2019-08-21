package br.bicicletao.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.bicicletao.application.Util;
import br.bicicletao.model.Usuario;

@Named
@RequestScoped
public class LoginController {

	private Usuario usuario;

	public String logar() {
		if (getUsuario().getLogin().equals("nebuloso") && getUsuario().getSenha().equals("1234")) {
			System.out.println(getUsuario().getLogin());
			System.out.println(getUsuario().getSenha());
			return "menu.xhtml?faces-redirect=true";
		}
		Util.addMessageError("Usuario ou Senha Invalido.");
		return null;
	}

	public void limpar() {
		setUsuario(new Usuario());

	}

	public Usuario getUsuario() {
		if (usuario == null)
			usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
