package com.github.mancinidsb.javateste.models;

public class Animal {
	public String nome;
	public double peso;
	
	/**
	 * Creates a new Animal with the given name and weight.
	 *
	 * @param nome the animal's name
	 * @param peso the animal's weight
	 */
	public Animal(String nome, double peso) {
		this.nome=nome;
		this.peso=peso;
	}
	
	
	
	/**
	 * Retrieve the animal's name.
	 *
	 * @return the animal's name
	 */
	public String getNome() {
		return nome;
	}



	/**
	 * Sets the animal's name.
	 *
	 * @param nome the new name for the animal
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}



	/**
	 * Gets the animal's weight.
	 *
	 * @return the animal's weight (value of the `peso` field)
	 */
	public double getPeso() {
		return peso;
	}



	/**
	 * Sets the animal's weight.
	 *
	 * @param peso the new weight value for the animal
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}



	/**
	 * Produce a string representation of the animal containing its name and weight.
	 *
	 * The string uses the format "Nome: <nome>\nPeso: <peso>" where `<nome>` and `<peso>` are
	 * the current values of the object's fields.
	 *
	 * @return a string formatted as "Nome: <nome>\nPeso: <peso>" representing the animal's state
	 */
	public String toString() {
		return "Nome: "+nome+"\nPeso: "+peso;
	}
}