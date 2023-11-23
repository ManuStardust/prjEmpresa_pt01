package PrjEmpresa.PrjEmpresa.services;

import java.util.List;

import PrjEmpresa.PrjEmpresa.entities.Departamento;
import PrjEmpresa.PrjEmpresa.entities.Funcionario;
import PrjEmpresa.PrjEmpresa.repositories.FuncionarioRepository;

public class FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;

	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	
	public Funcionario saveFuncionario(Funcionario Funcionario) {
		return funcionarioRepository.saveAll(Funcionario);
	}
	

		public List<Departamento> getAllFuncionario() {
			return funcionarioRepository.findAll();
		}
		
		public Departamento getFuncionarioById(Long id) {
			return funcionarioRepository.findById(id).orElse(null);
		}
		
	
		public void deleteFuncionario(Long id) {
			funcionarioRepository.deleteById(id);
		}
		
		
		public Funcionario updateFuncionario(Long id, Funcionario novoFuncionario) {
			java.util.Optional<Departamento> funcionarioOptional = funcionarioRepository.findById(id);
			if (funcionarioOptional.isPresent()) {
				Departamento funcionarioExistente = funcionarioOptional.get();
				funcionarioExistente.setDepartamento(novoFuncionario.getFuncionario());
				funcionarioExistente.setDepartamento(novoFuncionario.getFuncionario());
				return Funcionario.save(funcionarioExistente);
			} else {
				return null;
			}
		}

}
