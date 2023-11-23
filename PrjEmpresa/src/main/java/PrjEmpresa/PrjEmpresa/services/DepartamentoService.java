package PrjEmpresa.PrjEmpresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PrjEmpresa.PrjEmpresa.entities.Departamento;
import PrjEmpresa.PrjEmpresa.repositories.DepartamentoRepository;

@Service
public class DepartamentoService {
	private final DepartamentoRepository departamentoRepository;
	
	@Autowired
	public DepartamentoService(DepartamentoRepository departamentoRepository) {
		this.departamentoRepository = departamentoRepository;
	}
	
	
	public Departamento saveDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}
	

		public List<Departamento> getAllDepartamento() {
			return departamentoRepository.findAll();
		}
		
		public Departamento getDepartamentoId(Long id) {
			return departamentoRepository.findById(id).orElse(null);
		}
		
	
		public void deleteDepartamento(Long id) {
			departamentoRepository.deleteById(id);
		}
		
		
		public Departamento updateDepartamento(Long id, Departamento novoDepartamento) {
			Optional<Departamento> departamentoOptional = departamentoRepository.findById(id);
			if (departamentoOptional.isPresent()) {
				Departamento departamentoExistente = departamentoOptional.get();
				departamentoExistente.setDepartamento(novoDepartamento.getDepartamento());
				departamentoExistente.setDepartamento(novoDepartamento.getDepartamento());
				return departamentoRepository.save(departamentoExistente);
			} else {
				return null;
			}
		}

}
