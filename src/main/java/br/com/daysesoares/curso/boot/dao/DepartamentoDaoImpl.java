package br.com.daysesoares.curso.boot.dao;

import org.springframework.stereotype.Repository;

import br.com.daysesoares.curso.boot.domain.Departamento;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao  {

}
