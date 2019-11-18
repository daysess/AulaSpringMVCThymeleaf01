package br.com.daysesoares.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.daysesoares.curso.boot.dao.DepartamentoDao;
import br.com.daysesoares.curso.boot.domain.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{

	@Autowired
	private DepartamentoDao dao;
	
	@Transactional(readOnly = false)
	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);
		
	}

	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = false)
	@Override
	public Departamento buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = false)
	@Override
	public List<Departamento> listarTodos() {
		return dao.findAll();
	}

}
