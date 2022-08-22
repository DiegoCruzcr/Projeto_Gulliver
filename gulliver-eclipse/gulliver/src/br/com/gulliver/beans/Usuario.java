package br.com.gulliver.beans;

public class Usuario {
	private int id;
	private String nome;
	private String sobrenome;
	private int idade;
	private String email;
	private PontoTuristico pontoTuristico;
	
	public Usuario(int id, String nome, String sobrenome, int idade, String email, PontoTuristico pontoTuristico) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.email = email;
		this.pontoTuristico = pontoTuristico;
	}
	
	public Usuario() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public PontoTuristico getPontoTuristico() {
		return pontoTuristico;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPontoTuristico(PontoTuristico pontoTuristico) {
		this.pontoTuristico = pontoTuristico;
	}
	
}
