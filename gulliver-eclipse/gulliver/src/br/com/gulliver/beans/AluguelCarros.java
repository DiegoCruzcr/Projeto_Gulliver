package br.com.gulliver.beans;

import java.util.ArrayList;

public class AluguelCarros{
	private int Id;
	private String Descricao;
	private String Placa;
	private ArrayList<String> CarrosLista;
	
	public CarrosLista () {
		super();
	}
	
	public CarrosLista (int id, String descricao, ArrayList<String> carros) {
		super();
		this.Id = id;
		this.Descricao = descricao;
		this.Marca = marca;
		this.CarrosLista = carros;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}

	public ArrayList<String> getCarros() {
		return CarrosLista;
	}
	public void setCarrosLista(ArrayList<String> carros) {
		EnderecoLista = carros;
	}

	@Override
	public String toString() {
		return "CarrosLista  [Id =" + Id + ", Descricao =" + Descricao + ", Marca =" + Marca + ", Lista de carros =" + CarroLista + "]";
	}
	
}
