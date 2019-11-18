package br.com.daysesoares.curso.boot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.daysesoares.curso.boot.dao.FuncionarioDao;
import br.com.daysesoares.curso.boot.domain.Funcionario;

@Service
@Transactional(readOnly = true)
public class FuncionarioServiceImpl implements FuncionarioService {

	private FuncionarioDao dao;
	
	@Override
	public void salvar(Funcionario funcionario) {
		dao.save(funcionario);
		
	}

	@Override
	public void editar(Funcionario funcionario) {
		dao.update(funcionario);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Transactional(readOnly = false)
	@Override
	public Funcionario buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = false)
	@Override
	public List<Funcionario> listarTodos() {
		return dao.findAll();
	}

}
