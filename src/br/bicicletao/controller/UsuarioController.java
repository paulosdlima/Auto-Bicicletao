package br.bicicletao.controller;

import br.bicicletao.model.Usuario;

public class UsuarioController {
	private Usuario usuario;
	
	public Usuario getUsuario() {
		if (usuario == null) {
			usuario = new Usuario();
		}
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void limpar() {
		setUsuario(new Usuario());
	}
	
	public void incluir() {
		System.out.println(getUsuario().getNome());
		System.out.println(getUsuario().getLogin());
		System.out.println(getUsuario().getSenha());
		System.out.println(getUsuario().getAtivo());
	}

}
