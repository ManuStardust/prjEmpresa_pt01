package PrjEmpresa.PrjEmpresa.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import PrjEmpresa.PrjEmpresa.entities.Departamento;
import PrjEmpresa.PrjEmpresa.services.DepartamentoService;

public class DepartamentoControler {
	
		private DepartamentoService departamentoService;

		public DepartamentoControler(DepartamentoService departamentoService) {
			this.departamentoService = departamentoService;
		}

		@PostMapping
		public Departamento createDepartamento(@RequestBody Departamento departamento) {
			return departamentoService.saveDepartamento(departamento);
		}

		@GetMapping("/{id}")
		public Departamento getDepartamento(@PathVariable long id) {
			return departamentoService.getDepartamentoId(id);
		}
		
		@GetMapping
		public List<Departamento> getAllDepartamento() {
			return departamentoService.getAllDepartamento();
		}

		
		@DeleteMapping("/{id}")
		public void deleteLivro(@PathVariable Long id) {
			departamentoService.deleteDepartamento(id);
		}


		@PutMapping("/{id}")
		public Departamento updatedepartamento(@PathVariable Long id, @RequestBody Departamento departamento) {
			return departamentoService.updateDepartamento(id, departamento);
		}


	}


