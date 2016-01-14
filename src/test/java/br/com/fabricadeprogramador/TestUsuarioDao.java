package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDao;

public class TestUsuarioDao {

	public static void main(String[] args) {

		testAlterar();
	}
	
	public static void testCadastrar() {
		
		Usuario usu = new Usuario();
		usu.setNome("Jãozao");
		usu.setLogin("jzao");
		usu.setSenha("123");
		
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.cadastrar(usu);
		
		System.out.println("cadastrado ok");
	}
	
	public static void testAlterar(){
		Usuario usu = new Usuario();
		usu.setId(2);
		usu.setNome("Jãozao da Silva");
		usu.setLogin("jzao");
		usu.setSenha("123456");
		
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.alterar(usu);
		
		System.out.println("alterado ok");
	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		usu.setId(2);
		
		UsuarioDao usuDao = new UsuarioDao();
		usuDao.excluir(usu);
		
		System.out.println("excluido ok");
	}

}
