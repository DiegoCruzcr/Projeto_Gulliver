package br.com.gulliver.beans;

import java.util.ArrayList;

public class PontoTuristico{
	private int Id;
	private String Descricao;
	private ArrayList<String> EnderecoLista;
	
	public PontoTuristico() {
		super();
	}
	
	public PontoTuristico(int id, String descricao, ArrayList<String> endereco) {
		super();
		this.Id = id;
		this.Descricao = descricao;
		this.EnderecoLista = endereco;
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
	public ArrayList<String> getEndereco() {
		return EnderecoLista;
	}
	public void setEnderecoLista(ArrayList<String> endereco) {
		EnderecoLista = endereco;
	}

	@Override
	public String toString() {
		return "PontoTuristico [Id=" + Id + ", Descricao=" + Descricao + ", EnderecoLista=" + EnderecoLista + "]";
	}
	
}
