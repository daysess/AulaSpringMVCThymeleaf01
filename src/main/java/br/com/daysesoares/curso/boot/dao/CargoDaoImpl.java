package br.com.daysesoares.curso.boot.dao;

import org.springframework.stereotype.Repository;

import br.com.daysesoares.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
