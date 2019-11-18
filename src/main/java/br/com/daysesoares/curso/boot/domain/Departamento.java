package br.com.daysesoares.curso.boot.domain;

import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

	@Column(name = "nome", nullable = false, unique= true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	List<Cargo> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
