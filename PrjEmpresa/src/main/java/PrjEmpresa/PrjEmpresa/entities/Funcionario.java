package PrjEmpresa.PrjEmpresa.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String funcionario;
	
	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public static Funcionario save(Departamento funcionarioExistente) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
