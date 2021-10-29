package com.dio.model;

import java.util.Objects;

public class Gato {
	
	private String gato;
	private String nome;
	private Integer idade;
	
	public Gato() {
		this.gato = gato;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getGato() {
		return gato;
	}
	public void setGato(String gato) {
		this.gato = gato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gato, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(gato, other.gato) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [gato=" + gato + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
	

}
