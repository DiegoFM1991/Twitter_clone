package entidade;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Pruu {

//Atributos
	private int id;
	private static int contador = 1;
	private String texto;
	private Date data;
	private int quantidadeLike;
	private boolean bloquear;
	private String dataformatada;

//Construtores - vazio e sobrecarregdo
	public Pruu() {
		super();
	}
	
	public Pruu(String texto) {
		super();
		
		//Validando o tamanho do texto informado.
		if((texto.length() > 300) || (texto.trim().length() < 1)) {
			System.out.println("O texto informado deve ter entre 1 e 300 caracteres válidos");
		}
		
		//No caso de não ter sido inserido um texto inválido.
		this.id = contador++;
		this.texto = texto;
		this.data = new Date();
		SimpleDateFormat formatarData = new SimpleDateFormat("dd-MM-yyyy");
		String dataformatada = formatarData.format(data);
		this.dataformatada = dataformatada;
		this.quantidadeLike = 0;
		this.bloquear = false;
	}
	
//Métodos
		public void editarTexto(String texto) {
			this.texto = texto;
		}
		
		public void somarLike() {
			this.quantidadeLike++;
		}
			
//Getters and Setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
		public Date getData() {
			return data;
		}
		public int getQuantidadeLike() {
			return quantidadeLike;
		}
		public boolean isBloquear() {
			return bloquear;
		}
		public void setBloquear(boolean bloquear) {
			this.bloquear = bloquear;
		}
		
		@Override
		public String toString() {
			if (isBloquear()) {
				return "Pruu id: " + this.id + " está Bloqueado";
			}
			
			return "Pruu id: " + this.id + ": " + this.texto + "Likes: " + this.quantidadeLike + ". Criação em " + this.dataformatada;
		}
}