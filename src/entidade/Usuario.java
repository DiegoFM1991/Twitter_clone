package entidade;

import java.util.ArrayList;

public class Usuario {
	
	private String nome;
	private String email;
	private String cpf;
	private String arroba;
	private ArrayList <Pruu> pruus;
	
	//Construtor
	public Usuario() {
		super();
	}
	
	public Usuario(String nome, String email, String cpf, String arroba) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.arroba = arroba;
	}
	
	//Métodos
	public void darLike(Pruu pruuCurtir) {
		pruuCurtir.somarLike();
	}
	
	//ToString
	@Override
	public String toString() {
		return "Usuário: @" + arroba;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getArroba() {
		return arroba;
	}
	public void setArroba() {
		this.arroba = arroba;
	}
	public ArrayList<Pruu> getPruus() {
		return pruus;
	}
	public void setPruus(ArrayList<Pruu> pruus) {
		this.pruus = pruus;
	}
}