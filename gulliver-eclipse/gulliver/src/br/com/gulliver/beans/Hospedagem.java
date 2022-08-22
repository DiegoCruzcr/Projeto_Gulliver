package br.com.gulliver.beans;

import java.util.ArrayList;

public class Hospedagem {
	private int Id;
	private String imagem;
	private String nome;
	private String descricao;
	private double preco;
	private double taxa;
	private ArrayList<String> localizacaoList;
	
	public Hospedagem() {
		super();
	}
	
	public Hospedagem(int id, String imagem, String nome, String descricao, double preco, double taxa,
			ArrayList<String> localizacaoList) {
		super();
		this.Id = id;
		this.imagem = imagem;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.taxa = taxa;
		this.localizacaoList = localizacaoList;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public ArrayList<String> getLocalizacaoList() {
		return localizacaoList;
	}

	public void setLocalizacaoList(ArrayList<String> localizacaoList) {
		this.localizacaoList = localizacaoList;
	}

	@Override
	public String toString() {
		return "Hospedagem [Id=" + Id + ", imagem=" + imagem + ", nome=" + nome + ", descricao=" + descricao
				+ ", preco=" + preco + ", taxa=" + taxa + ", localizacaoList=" + localizacaoList + "]";
	}
}
