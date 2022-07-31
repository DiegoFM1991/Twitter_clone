package entidade;

public class Administrador extends Usuario {

//Construtor
	public Administrador() {
		super();
	}
	
	public Administrador(String nome, String email, String cpf, String arroba, int senha) {
		super(nome, email, cpf, arroba, senha);
	}
		
//Métodos
	public void bloquearPruu(Pruu pruuBloqueado) {
		pruuBloqueado.setBloquado(true);
	}	
	
	public void desbloquearPruu (Pruu pruuDesbloqueado) {
		pruuDesbloqueado.setBloqueado(false);
	}
}