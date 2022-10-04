package model;

import java.time.LocalDate;

public class Client {

	private int id;
	private String nivel;
	private String genero;
	private String email;
	private String senha;
	private String nome;
	private LocalDate nascimento;
	private LocalDate ultimoAcesso;
	private String foto;
	/*private Cidade cidade;*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public LocalDate getUltimoAcesso() {
		return ultimoAcesso;
	}
	public void setUltimoAcesso(LocalDate ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	/*public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	*/
}
