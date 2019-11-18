package br.com.daysesoares.curso.boot.dao;

import org.springframework.stereotype.Repository;

import br.com.daysesoares.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

}
