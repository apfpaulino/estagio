package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;


public class UC01CadastrarEmpresa {

	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		
		empresa.setNomeDaEmpresa("Empresa X");
		empresa.setCnpj("21433241");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("Rua Javari");
		empresa.setTelefone("251545");
		
	}
	
	@Test
	public void CT01UC01FBcadastra_com_sucesso(){
		assertEquals(1, empresaDAO.adiciona(empresa));
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	empresaDAO.exclui("89424232000180");
	
	
	
	}

}
