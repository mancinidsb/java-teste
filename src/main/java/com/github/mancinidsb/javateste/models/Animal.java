package com.github.mancinidsb.javateste.models;

public class Animal {
	public String nome;
	public double peso;
	
	public Animal(String nome, double peso) {
		this.nome=nome;
		this.peso=peso;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String toString() {
		return "Nome: "+nome+"\nPeso: "+peso;
	}
}
