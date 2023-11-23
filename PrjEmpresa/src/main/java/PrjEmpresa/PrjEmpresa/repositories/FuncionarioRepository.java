package PrjEmpresa.PrjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import PrjEmpresa.PrjEmpresa.entities.Departamento;
import PrjEmpresa.PrjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Departamento, Long> {

	Funcionario saveAll(Funcionario prjEmpresa);

}
