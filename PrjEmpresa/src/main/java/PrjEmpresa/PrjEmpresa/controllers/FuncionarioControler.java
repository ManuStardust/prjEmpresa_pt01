package PrjEmpresa.PrjEmpresa.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import PrjEmpresa.PrjEmpresa.entities.Departamento;
import PrjEmpresa.PrjEmpresa.entities.Funcionario;
import PrjEmpresa.PrjEmpresa.services.FuncionarioService;


public class FuncionarioControler {
		private final FuncionarioService funcionarioService;

		public FuncionarioControler(FuncionarioService funcionarioService) {
			this.funcionarioService = funcionarioService;
		}

		@PostMapping
		public Funcionario createPrjEmpresa(@RequestBody Funcionario funcionario) {
			return funcionarioService.savePrjEmpresa(funcionario);
		}

		@GetMapping("/{id}")
		public ResponseEntity<Departamento> getFuncionario(@PathVariable Long id) {
			Departamento Funcionario = funcionarioService.getPrjEmpresaById(id);
			if (Funcionario != null) {
				return ResponseEntity.ok(Funcionario);
			} else {
				return ResponseEntity.notFound().build();

			}
		}

		@GetMapping("/home")
		public String paginaIicial() {
			return "index";
		}

		@DeleteMapping("/{id}")
		public void deleteLivro(@PathVariable Long id) {
			funcionarioService.deletePrjEmpresa(id);
		}

		@GetMapping
		public ResponseEntity<List<Departamento>> getAllFuncionario(RequestEntity<Void> requestEntity) {
			String method = requestEntity.getMethod().name();
			String contentType = requestEntity.getHeaders().getContentType().toString();
			List<Departamento> funcionario = funcionarioService.getAllPrjEmpresa();
			return ResponseEntity.status(HttpStatus.OK).header("Method", method).header("Content-Type", contentType)
			.body(funcionario);
		}

		@PutMapping("/{id}")
		public Funcionario updatefuncionario(@PathVariable Long id, @RequestBody Funcionario funcionario) {
			return funcionarioService.updateFuncionario(id, funcionario);
		}


	}


